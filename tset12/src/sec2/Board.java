package sec2;

public class Board {
	private int bno;
	private String title;
	private String content;
	private String author;
	private String resdate;

	public Board() {}
	public Board(int bno, String title, String content, String author, String resdate) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.author = author;
		this.resdate = resdate;
	}

	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getResdate() {
		return resdate;
	}
	public void setResdate(String resdate) {
		this.resdate = resdate;
	}

	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", content=" + content + ", author=" + author + ", resdate="
				+ resdate + "]";
	}







}
