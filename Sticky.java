import java.util.Date;

/**
 * Geunho Khim
 * Date: 10/14/13
 * Time: 2:14 PM
 */
public class Sticky {
  private String url;
  private String userID;
  private String userName;
  private String memo;
  private Date created;
  private int like;

  public Sticky() {
  }
  public Sticky(String url, String userID, String userName, String memo, Date created, int like) {
    this.url = url;
    this.userID = userID;
    this.userName = userName;
    this.memo = memo;
    this.created = created;
    this.like = like;
  }

  public void setURL(String url) {
    this.url = url;
  }
  public void setUser(String userID) {
    this.userID = userID;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }
  public void setMemo(String memo) {
    this.memo = memo;
  }
  public void setTimestamp(Date ts) {
    this.created = ts;
  }
  public void setLike(int like) {
    this.like = like;
  }

  public String getURL() {
    return this.url;
  }
  public String getUserID() {
    return this.userID;
  }
  public String getUserName() {
    return this.userName;
  }
  public String getMemo() {
    return this.memo;
  }
  public Date getTimestamp() {
    return this.created;
  }
  public int getLike() {
    return this.like;
  }

  @Override
  public String toString() {
    return getURL() + ", " + getUserID() + ", " + getUserName() + ", " + getMemo() + ", " + getTimestamp();
  }
}
