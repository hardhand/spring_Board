package Model;

import java.util.Date;

public class art {

	private int no;
	private String title;
	private String file;
	private String genre;
	private String content;
	private boolean sellCheck;
	private int price;
	private boolean isCheck;
	private String id;
	private Date artDate;
	private boolean state;
	private int totalCount;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean isSellCheck() {
		return sellCheck;
	}
	public void setSellCheck(boolean sellCheck) {
		this.sellCheck = sellCheck;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isCheck() {
		return isCheck;
	}
	public void setCheck(boolean isCheck) {
		this.isCheck = isCheck;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getArtDate() {
		return artDate;
	}
	public void setArtDate(Date artDate) {
		this.artDate = artDate;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	@Override
	public String toString() {
		return "art [no=" + no + ", title=" + title + ", file=" + file + ", genre=" + genre + ", content=" + content
				+ ", sellCheck=" + sellCheck + ", price=" + price + ", isCheck=" + isCheck + ", id=" + id + ", artDate="
				+ artDate + ", state=" + state + ", totalCount=" + totalCount + "]";
	}

	
	
	
	
}
