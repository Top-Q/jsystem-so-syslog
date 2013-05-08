package com.aqua.syslog;

import com.aqua.sysobj.conn.CliCommand;

public class SyslogCliCommand extends CliCommand {
//	
//	public SyslogCliCommand
	
	
	public SyslogCliCommand() {
		this(null);
	}

	public SyslogCliCommand(String command) {
		super();

		setCommands(new String[] {command});

		addErrors("No such file or directory");
		addErrors("command not found");
		addErrors("no such pid");

	}
	
}
