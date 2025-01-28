package com.cynte.dependent_lib;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private DateUtil() {
        //not called
    }

    public static String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("MMddHHmmss");
        return sdf.format(new Date());
    }
}
