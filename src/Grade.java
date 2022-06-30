import java.util.Date;

public class Grade {
  private Mark mark;
  private Date lastUpdate;

  public Grade(Mark mark, Date lastUpdate) {
    this.mark = mark;
    this.lastUpdate = lastUpdate;
  }

  public Mark getMark() {
    return mark;
  }

  public void setMark(Mark mark) {
    this.mark = mark;
  }

  public Date getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(Date lastUpdate) {
    this.lastUpdate = lastUpdate;
  }
}
