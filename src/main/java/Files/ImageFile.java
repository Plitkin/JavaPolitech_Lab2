package Files;

class ImageFile extends File{
    private ImageSize scale;

    public ImageFile(String fileName, int size, String format, ImageSize scale) {
        super(fileName, size, format);
        setFormat(format);
        setScale(scale);
    }

    private void setScale(ImageSize scale) {
        if (scale == null || scale.getWidth() <= 0 || scale.getHeight() <= 0) {
            throw new IllegalArgumentException("Размер изображения должен быть положительным для ширины и высоты");
        }
        this.scale = scale;
    }

    public ImageSize getScale() {
        return scale;
    }

    @Override
    public String toString() {
        return String.format("%-20s | %10d | %s, %s", getFileName(), getSize(),
                getFormat(), getScale().toString());
    }
}
