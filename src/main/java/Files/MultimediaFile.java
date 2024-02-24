package Files;

class MultimediaFile extends File{

    private String contentDescription;
    private MediaDuration duration;

    public MultimediaFile(String fileName, int size, String format,
                          String contentDescription, MediaDuration duration) {
        super(fileName, size, format);
        setFormat(format);
        setContentDescription(contentDescription);
        setDuration(duration);
    }

    private void setContentDescription(String contentDescription) {
        if (contentDescription == null || contentDescription.trim().isEmpty()) {
            throw new IllegalArgumentException("Описание контента не может быть пустым или равным null");
        }
        this.contentDescription = contentDescription;
    }

    private void setDuration(MediaDuration duration) {
        if (duration == null || duration.getHours() < 0 || duration.getMinutes() < 0 || duration.getSeconds() < 0) {
            throw new IllegalArgumentException("Длительность медиафайла должна быть неотрицательной");
        }
        this.duration = duration;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public MediaDuration getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return String.format("%-20s | %10d | %s, %s, %s", getFileName(), getSize(),
                getFormat(), getContentDescription(), getDuration().toString());
    }
}
