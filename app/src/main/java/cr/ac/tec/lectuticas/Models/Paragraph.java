package cr.ac.tec.lectuticas.Models;

/**
 * Created by Daniel on 09/06/2016.
 */
public class Paragraph {

  private int text;
  private int number;

  public Paragraph(int text, int number) {
    this.text = text;
    this.number = number;
  }

  public int getText() {
    return text;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }
}
