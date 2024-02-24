package Files;

class VideoFile extends MultimediaFile {

    private ImageSize scale;
    public VideoFile(String fileName, int size, String format, String contentDescription,
                     MediaDuration duration, ImageSize scale) {
        super(fileName, size, format, contentDescription, duration);
        setScale(scale);
    }

    public void setScale(ImageSize scale) {
        this.scale = scale;
    }

    public ImageSize getScale() {
        return scale;
    }

    @Override
    public String toString() {
        return String.format("%-20s | %10d | %s, %s, %s, %s", getFileName(), getSize(), getFormat(),
                getContentDescription(), getDuration().toString(), getScale().toString());
    }
}
