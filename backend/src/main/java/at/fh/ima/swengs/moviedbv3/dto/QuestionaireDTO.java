package at.fh.ima.swengs.moviedbv3.dto;

import java.util.Set;

public class QuestionaireDTO {

  private long id;

  private String answer1;
  private String answer2;
  private String answer3;
  private String answer4;
  private String answer5;
  private String answer6;
  private String answer7;
  private String answer8;
  private String answer9;
  private String answer10;
  private Set<Long> users;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAnswer1() {
    return answer1;
  }

  public void setAnswer1(String answer1) {
    this.answer1 = answer1;
  }

  public String getAnswer2() {
    return answer2;
  }

  public void setAnswer2(String answer2) {
    this.answer2 = answer2;
  }

  public String getAnswer3() {
    return answer3;
  }

  public void setAnswer3(String answer3) {
    this.answer3 = answer3;
  }

  public String getAnswer4() {
    return answer4;
  }

  public void setAnswer4(String answer4) {
    this.answer4 = answer4;
  }

  public String getAnswer5() {
    return answer5;
  }

  public void setAnswer5(String answer5) {
    this.answer5 = answer5;
  }

  public String getAnswer6() {
    return answer6;
  }

  public void setAnswer6(String answer6) {
    this.answer6 = answer6;
  }

  public String getAnswer7() {
    return answer7;
  }

  public void setAnswer7(String answer7) {
    this.answer7 = answer7;
  }

  public String getAnswer8() {
    return answer8;
  }

  public void setAnswer8(String answer8) {
    this.answer8 = answer8;
  }

  public String getAnswer9() {
    return answer9;
  }

  public void setAnswer9(String answer9) {
    this.answer9 = answer9;
  }

  public String getAnswer10() {
    return answer10;
  }

  public void setAnswer10(String answer10) {
    this.answer10 = answer10;
  }

  public Set<Long> getUsers() {
    return users;
  }

  public void setUsers(Set<Long> users) {
    this.users = users;
  }
}
