package com.model.study;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author gxw
 * @date 2020/7/2 16:55
 */
public class test {
    /*
    * 计算两个日期之间的天数
    * */
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2020-01-30");
        int a = daysBetween(date,new Date()); //相差天数
        int b = getMonthSpace(date,new Date()); //相差月份
        System.out.println(a);
        System.out.println(b);
        System.out.println(isSameDate(date,new Date()));

//        System.out.println(BigDecimal.ZERO.subtract(BigDecimal.TEN));
//        System.out.println(BigDecimal.ZERO.subtract(BigDecimal.TEN).add(BigDecimal.ZERO.subtract(BigDecimal.TEN)));

//        String a =new String("2");
//        String b = "2";
//        System.out.println(a!=b);
//        System.out.println(a==b);
//        System.out.println(a.equals(b));


    }

    public static int daysBetween(Date smdate, Date bdate) throws ParseException
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(smdate);
        long time1 = cal.getTimeInMillis();
        cal.setTime(bdate);
        long time2 = cal.getTimeInMillis();
        long between_days=(time2-time1)/(1000*3600*24);
        return Integer.parseInt(String.valueOf(between_days));
    }

    public static int getMonthSpace(Date date1, Date date2) {

        int result = 0;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c1.setTime(date1);
        c2.setTime(date2);

        result = c2.get(Calendar.MONTH) - c1.get(Calendar.MONTH);

        return result == 0 ? 1 : Math.abs(result);

    }

    public static boolean isSameDate(Date date1, Date date2) {
        try {
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime(date1);

            Calendar cal2 = Calendar.getInstance();
            cal2.setTime(date2);

            boolean isSameYear = cal1.get(Calendar.YEAR) == cal2
                    .get(Calendar.YEAR); // 年份
//            boolean isSameMonth = isSameYear
//                    && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
//            boolean isSameDate = isSameMonth
//                    && cal1.get(Calendar.DAY_OF_MONTH) == cal2
//                    .get(Calendar.DAY_OF_MONTH);

            return isSameYear;
        } catch (Exception e) {

        }
        return false;

    }
}
