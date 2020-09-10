package cn.celess.log;

/**
 * @author : xiaohai
 * @date : 2020/09/10 10:50
 * @desc : 对应org.slf4j.event.Level
 */
public enum Level {
    /**
     * org.slf4j.event.Level 中的一些级别信息
     * final public int TRACE_INT = 00;
     * final public int DEBUG_INT = 10;
     * final public int INFO_INT = 20;
     * final public int WARN_INT = 30;
     * final public int ERROR_INT = 40;
     * <p>
     * ====>
     * ERROR(ERROR_INT, "ERROR"),
     * WARN(WARN_INT, "WARN"),
     * INFO(INFO_INT, "INFO"),
     * DEBUG(DEBUG_INT, "DEBUG"),
     * TRACE(TRACE_INT, "TRACE");
     */
    ERROR(40, "ERROR"), WARN(30, "WARN"), INFO(20, "INFO"), DEBUG(10, "DEBUG"), TRACE(00, "TRACE");

    private final int levelInt;
    private final String levelStr;

    Level(int i, String s) {
        levelInt = i;
        levelStr = s;
    }

    public int toInt() {
        return levelInt;
    }

    @Override
    public String toString() {
        return levelStr;
    }

}
