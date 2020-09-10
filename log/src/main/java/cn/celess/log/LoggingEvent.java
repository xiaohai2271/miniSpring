package cn.celess.log;

/**
 * @author : xiaohai
 * @date : 2020/09/10 10:43
 * @desc: 记录日志信息的实体  对应org.slf4j.event.SubstituteLoggingEvent
 */
public class LoggingEvent {
    /**
     * 记录日志级别
     */
    Level level;
    /**
     * 暂时不使用 Marker marker 字段;
     * 该字段在打印日志的时候提供一个额外的mark标记
     */

    /**
     * logger name  使用slf4j时通过LoggerFactory.getLogger(...)入参来获取的logger name
     */
    String loggerName;
    /**
     * SubstituteLogger logger;
     */
    String threadName;
    String message;
    Object[] argArray;
    long timeStamp;
    Throwable throwable;

    public LoggingEvent(Level level, String loggerName, String threadName, String message, Object[] argArray, long timeStamp, Throwable throwable) {
        this.level = level;
        this.loggerName = loggerName;
        this.threadName = threadName;
        this.message = message;
        this.argArray = argArray;
        this.timeStamp = timeStamp;
        this.throwable = throwable;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getLoggerName() {
        return loggerName == null ? "" : loggerName;
    }

    public void setLoggerName(String loggerName) {
        this.loggerName = loggerName;
    }

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object[] getArgArray() {
        return argArray;
    }

    public void setArgArray(Object[] argArray) {
        this.argArray = argArray;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
