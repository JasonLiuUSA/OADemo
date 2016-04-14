package com.jason.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class LogTest {
//得到一个用来记录日志的对象，这样打印信息的时候能够标记是打印的那个类的信息（此处用this表示是LogTest这个类）。
private Log log = LogFactory.getLog(this.getClass());
	
@Test
public void testName() throws Exception {
	log.debug("this is from debug");
	log.info("this is from info");
	log.warn("this is from warn");
	log.error("this is from error");
	log.fatal("this is from fatal");
}	
	
}
