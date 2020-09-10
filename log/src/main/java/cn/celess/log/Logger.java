package cn.celess.log;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : xiaohai
 * @date : 2020/09/10 10:30
 */
public class Logger {
    public static void trace(String info, Object... arg) {
        printLog(createLoggerEvent(Level.TRACE, info, arg));
    }

    public static void debug(String info, Object... arg) {
        printLog(createLoggerEvent(Level.DEBUG, info, arg));

    }

    public static void info(String info, Object... arg) {
        printLog(createLoggerEvent(Level.INFO, info, arg));
    }

    public static void warn(String info, Object... arg) {
        printLog(createLoggerEvent(Level.WARN, info, arg));
    }

    public static void error(String info, Object... arg) {
        printLog(createLoggerEvent(Level.ERROR, info, arg));
    }

    private static LoggingEvent createLoggerEvent(Level level, String info, Object... arg) {
        return new LoggingEvent(level, null, Thread.currentThread().getName(), info, arg, System.currentTimeMillis(), null);
    }

    private static void printLog(LoggingEvent event) {
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        sb.append(sdf.format(new Date(event.timeStamp)));
        sb.append("\t\t");
        sb.append(event.getLevel().toString());
        sb.append("\t[");
        sb.append(event.getThreadName());
        sb.append("]\t");
        sb.append(event.getLoggerName());
        sb.append(" : ");
        sb.append(event.getMessage());
        System.out.println(sb.toString());
    }

}
