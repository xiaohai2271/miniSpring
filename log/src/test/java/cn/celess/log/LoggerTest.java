package cn.celess.log;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoggerTest {

    @Test
    public void trace() {
        Logger.trace("trace");
        new Thread(() -> Logger.trace("trace in  testThread1"), "testThread1").start();
    }

    @Test
    public void debug() {
        Logger.debug("debug");
        new Thread(() -> Logger.debug("debug in  testThread2"), "testThread2").start();
    }

    @Test
    public void info() {
        Logger.info("info");
        new Thread(() -> Logger.info("info in  testThread3"), "testThread3").start();
    }

    @Test
    public void warn() {
        Logger.warn("warn");
        new Thread(() -> Logger.warn("warn in  testThread4"), "testThread4").start();
    }

    @Test
    public void error() {
        Logger.error("error");
        new Thread(() -> Logger.error("error in  testThread5"), "testThread5").start();
    }
}