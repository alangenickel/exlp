package net.sf.exlp.monitor.net.dns;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import net.sf.ahtutils.model.interfaces.with.EjbWithRecord;

@Entity
public class DnsResult  implements EjbWithRecord
{
	public static enum Code {SUCCESSFUL,UNRECOVERABLE,TRY_AGAIN,HOST_NOT_FOUND,TYPE_NOT_FOUND}
	
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
		
	private long duration;
		
	private Date record;
	
	private Code code;
	
	// ********   Getter/Setter   *********** //
	
	public long getId() {return id;}
	public void setId(long id) {this.id = id;}
		 
	public long getDuration() {return duration;}
	public void setDuration(long duration) {this.duration = duration;}
		
	public Date getRecord() {return record;}
	public void setRecord(Date record) {this.record = record;}
		
	public Code getCode() {return code;}
	public void setCode(Code code) {this.code = code;}
	
	// ***********   Methods   ************** //
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("(").append(id).append(")");
		sb.append(" ").append(code.toString());
		sb.append(" ").append(record);
		sb.append(" ").append(duration);
		return sb.toString();
	}
}