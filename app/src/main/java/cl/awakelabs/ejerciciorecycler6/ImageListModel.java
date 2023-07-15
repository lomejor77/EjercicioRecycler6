package cl.awakelabs.ejerciciorecycler6;


public class ImageListModel {
    public String urlImage;
    public String textImage;

    public ImageListModel(String urlImage,String textImage) {
        this.urlImage = urlImage;
        this.textImage = textImage;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public String getTextImage() {
        return textImage;
    }
}
