package com.aqua.syslog;

import junit.framework.SystemTestCase;

public class SyslogUnitTests extends SystemTestCase {

	Syslog syslog = null;

	String syslogCapFile = null;

	public void setUp() throws Exception {
		syslog = (Syslog) system.getSystemObject("syslog");
		syslog.startSyslog();
	}

	public void tearDown() throws Exception {
		syslogCapFile = syslog.stopSyslog(true);
		report.addLink("Syslog capture file", syslogCapFile);
	}

	public void testSyslog() throws Exception {
		sleep(5000);
	}

}
