package list_Collection_Framework.listOfHomework;

import java.time.LocalDate;

public class Assignment {
	private int id;
	private static int idGenerator;
	private String subject;
	private LocalDate due_date;
	public Assignment(String subject, LocalDate due_date) {
		super();
		this.subject = subject;
		this.due_date = due_date;
		id = ++idGenerator;
	}
	public String getSubject() {
		return subject;
	}
	public LocalDate getDue_date() {
		return due_date;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setDue_date(LocalDate due_date) {
		this.due_date = due_date;
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Assignment [id=" + id + ", subject=" + subject + ", due_date=" + due_date + "]!";
	}
	
	
}
