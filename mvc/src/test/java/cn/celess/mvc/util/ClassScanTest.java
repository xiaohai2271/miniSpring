package cn.celess.mvc.util;

import org.junit.Test;

import java.io.File;
import java.util.Set;

import static cn.celess.mvc.util.ClassScan.CLASS_FILE;
import static org.junit.Assert.*;

public class ClassScanTest {

    @Test
    public void scan() {
        Set<Class<?>> scan = ClassScan.scan(this.getClass());
        assertNotEquals(0, scan.size());

    }
}