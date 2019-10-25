package com.flowable.demoflow.util;

import java.util.Calendar;
import java.util.UUID;

public class TimeUUidUtil {
    public static String gettimeuuid(){
        Calendar c = Calendar.getInstance();//可以对每个时间域单独修改
        String year = String.valueOf(c.get(Calendar.YEAR));
        String month = String.valueOf(c.get(Calendar.MONTH)+1);
        if(month.length()<2){
            month="0"+month;
        }
        String day = String.valueOf(c.get(Calendar.DATE));
        if(day.length()<2){
            day="0"+day;
        }
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").substring(0,10);
        return year+month+day+uuid;
    }
}
