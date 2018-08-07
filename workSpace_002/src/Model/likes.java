package Model;

public class likes {

	private int no;
	private String id;
	private boolean isCheck;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isCheck() {
		return isCheck;
	}
	public void setCheck(boolean isCheck) {
		this.isCheck = isCheck;
	}
	@Override
	public String toString() {
		return "likes [no=" + no + ", id=" + id + ", isCheck=" + isCheck + "]";
	}
	
	
	
	
}
