package cn.celess.log;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : xiaohai
 * @date : 2020/09/10 10:30
 */
public class Log {
    private final String name;

    public Log(String name) {
        this.name = name;
    }

    public Log(Class<?> clazz) {
        this.name = clazz.getName();
    }

    public void trace(String info, Object... arg) {
        printLog(createLoggerEvent(Level.TRACE, info, arg));
    }

    public void debug(String info, Object... arg) {
        printLog(createLoggerEvent(Level.DEBUG, info, arg));

    }

    public void info(String info, Object... arg) {
        printLog(createLoggerEvent(Level.INFO, info, arg));
    }

    public void warn(String info, Object... arg) {
        printLog(createLoggerEvent(Level.WARN, info, arg));
    }

    public void error(String info, Object... arg) {
        printLog(createLoggerEvent(Level.ERROR, info, arg));
    }

    private LoggingEvent createLoggerEvent(Level level, String info, Object... arg) {
        return new LoggingEvent(level, this.name, Thread.currentThread().getName(), info, arg, System.currentTimeMillis(), null);
    }

    private void printLog(LoggingEvent event) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        System.out.printf(
                "%s\t\t%s\t[%-10s]\t%s : %s\n",
                sdf.format(new Date(event.timeStamp)),
                event.level.toString(),
                event.threadName,
                event.loggerName,
                event.message
        );
    }

}
