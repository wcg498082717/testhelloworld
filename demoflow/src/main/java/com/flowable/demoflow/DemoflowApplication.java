package com.flowable.demoflow;

import com.flowable.demoflow.bean.GdRentaccount;
import com.flowable.demoflow.util.TimeUUidUtil;
import lombok.extern.slf4j.Slf4j;
import org.flowable.engine.*;
import org.flowable.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.flowable.engine.repository.Deployment;
import org.flowable.engine.repository.ProcessDefinition;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.idm.api.IdmIdentityService;
import org.flowable.task.api.Task;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@Slf4j
public class DemoflowApplication {
    private static ProcessEngine processEngine;
    private static ProcessDefinition processDefinition;
    private static final Logger logger= LoggerFactory.getLogger(DemoflowApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(DemoflowApplication.class, args);
        initdb();
        createprocess();
        endcommit("2520");
        endcommitjingli("5006");
    }

    private static void endcommit(String taskid) {
        /*得到实际的“managers”组任务列表*/
        TaskService taskService = processEngine.getTaskService();
        List<Task> tasks = taskService.createTaskQuery().taskId(taskid).list();
//        List<Task> tasks1 = taskService.createTaskQuery().task;
        tasks.forEach(task -> {
            log.info(task.toString());
        });
        Task task = tasks.get(0);
        HashMap variables = new HashMap<String, Object>();
        taskService.complete(task.getId(), variables);
    }

    private static void endcommitjingli(String taskid){
        TaskService taskService = processEngine.getTaskService();
        List<Task> tasks = taskService.createTaskQuery().taskId(taskid).list();
        Task task = tasks.get(0);
        HashMap variables = new HashMap<String, Object>();
        variables.put("approve","同意");
        variables.put("reason","reason why");
        variables.put("file","filepath");
        taskService.complete(task.getId(), variables);
    }

    private static void createprocess() {
/*
启动流程实例
 */
//初始化入参
        GdRentaccount rentaccount = new GdRentaccount();

//启动一个流程结点
        RuntimeService runtimeService = processEngine.getRuntimeService();
        /*参数传递*/
        Map<String, Object> variables = new HashMap<String, Object>();

        variables.put("id", TimeUUidUtil.gettimeuuid());
        variables.put("rentTime", "aaaaaa");
        variables.put("ordercode", "bbbbb");
        variables.put("operators", "ccccc");
        variables.put("stationname", "ddddd");
        variables.put("stationcode", "eeeee");
        variables.put("stationtype", "fffff");
        variables.put("shareusers", "ggggg");
        variables.put("moneydiscont", "hhhhh");
        variables.put("operatorarea", "iiiii");

        int a=0;

        //设置发起人
        IdentityService identityService = processEngine.getIdentityService();
        identityService.setAuthenticatedUserId("wcgstartuser");
        /*通过RuntimeService启动流程实例*/
//        ProcessInstance processInstance =
//                runtimeService.startProcessInstanceByKey("myProcess", variables);

        ProcessInstance processInstance =
                runtimeService.startProcessInstanceById(processDefinition.getId(),variables);
        log.info("成功：启动流程实例：" + processInstance.getProcessDefinitionName() + ":" + processInstance.getId()+ ":" );
    }

    private static void initdb() {
        ProcessEngineConfiguration cfg = new StandaloneProcessEngineConfiguration()
                .setJdbcUrl("jdbc:mysql://localhost:3306/flowable?useUnicode=true&zeroDateTimeBehavior=convertToNull")
                .setJdbcUsername("root")
                .setJdbcPassword("root")
                .setJdbcDriver("com.mysql.jdbc.Driver")
                .setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);

         processEngine = cfg.buildProcessEngine();

        /*创建了一个新的部署*/
        RepositoryService repositoryService = processEngine.getRepositoryService();
        Deployment deployment = repositoryService.createDeployment()
                .addClasspathResource("rentflow.bpmn")     //TODO holiday.xml命名为何不行?
                .deploy();

        /*部署流程定义，获取用户已经部署好的流程*/
         processDefinition = repositoryService.createProcessDefinitionQuery()
                .deploymentId(deployment.getId())
                .singleResult();
        log.info("成功：部署流程：" +  processDefinition.getName());
    }
}
