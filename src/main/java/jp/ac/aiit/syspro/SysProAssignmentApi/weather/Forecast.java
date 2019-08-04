package jp.ac.aiit.syspro.SysProAssignmentApi.weather;

public class Forecast {

    private  String date;

    private  String telop;

    private Image image;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTelop() {
        return telop;
    }

    public void setTelop(String telop) {
        this.telop = telop;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
