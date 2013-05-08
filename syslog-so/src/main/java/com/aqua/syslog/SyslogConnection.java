package com.aqua.syslog;

import systemobject.terminal.Prompt;

import com.aqua.sysobj.conn.CliConnectionImpl;
import com.aqua.sysobj.conn.Position;

public class SyslogConnection extends CliConnectionImpl {
	
	private String login;
	private String password;
	private String suPassword;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSuPassword() {
		return suPassword;
	}

	public void setSuPassword(String suPassword) {
		this.suPassword = suPassword;
	}

	public Prompt[] getPrompts() {
		Prompt[] prompts = new Prompt[5];

		prompts[0] = new Prompt();
		prompts[0].setPrompt("login: ");
		prompts[0].setStringToSend(login);

		prompts[1] = new Prompt();
		prompts[1].setPrompt("Password:");
		prompts[1].setStringToSend(password);// force this enabled
		
		// user temp mode
		prompts[2] = new Prompt(); 
		prompts[2].setCommandEnd(true);
		prompts[2].setPrompt("]$");
		
		// super user mode
		prompts[3] = new Prompt(); 
		prompts[3].setCommandEnd(true);
		prompts[3].setPrompt("]#");

		
		
		prompts[4] = new Prompt();
		prompts[4].setPrompt("proceed? [Y|N] ");
		prompts[4].setStringToSend("Y");

		return prompts;	
	}

	public Position[] getPositions() {
		return null;
	}
	
	public void connect() throws Exception {
		super.connect();
        cli.command("su -", 10000, true, false, "Password: ");
        cli.command(suPassword);
		connected = true;		
	}

}
