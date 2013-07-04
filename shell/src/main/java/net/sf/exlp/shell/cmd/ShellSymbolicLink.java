package net.sf.exlp.shell.cmd;

import net.sf.exlp.exception.ExlpUnsupportedOsException;
import net.sf.exlp.shell.architecture.ArchUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShellSymbolicLink
{
	final static Logger logger = LoggerFactory.getLogger(ShellSymbolicLink.class);
	
	public static synchronized String symbolicLink(String existing, String link) throws ExlpUnsupportedOsException
	{
		StringBuffer sb = new StringBuffer();
		switch(ArchUtil.getArch())
		{
			case OsX:	sb.append("ln -s "+existing+" "+link);break;
			case Linux:	sb.append("ln -s "+existing+" "+link);break;
			default:	ArchUtil.errorUnsupportedOS("print routingtable");break;
		}	
		return sb.toString();
	}

}
