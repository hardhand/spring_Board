package Model;

import java.util.Date;

public class alarm {

	private String type;
	private Date time;
	private String to;
	private String from;
	private boolean readCheck;
	private int no;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public boolean isReadCheck() {
		return readCheck;
	}
	public void setReadCheck(boolean readCheck) {
		this.readCheck = readCheck;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	@Override
	public String toString() {
		return "alarm [type=" + type + ", time=" + time + ", to=" + to + ", from=" + from + ", readCheck=" + readCheck
				+ ", no=" + no + "]";
	}
	
	
	
	
}
