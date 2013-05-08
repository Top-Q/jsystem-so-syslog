package com.aqua.syslog;
import junit.framework.SystemTestCase;

public class SyslogTest extends SystemTestCase {
	Syslog syslog;
	
	public void setUp() throws Exception{
		syslog = (Syslog)system.getSystemObject("syslog");
	}	
//	No such file or directory
	public void test1() throws Exception{
		syslog.startSyslog();
//		syslog.fixSyslog();
//		syslog.startSyslogPrc();
//		if (!syslog.isGrow())
//			this.fail("syslog file is not growing");
//		syslog.clearLog();
//		syslog.fixSyslogConf();
//		syslog.fixSyslogConf2();
//		syslog.fetch();
//		syslog.clearLog();
//		syslog.fetch();
//		if (syslog.isGrow("/tmp/yuval.txt"))
//			report.step("yes");
//		else 
//			report.step("no");
//		syslog.restartSyslog();
		Thread.sleep(3000);
//		syslog.fetch();
		syslog.stopSyslog(true);
	}

}
