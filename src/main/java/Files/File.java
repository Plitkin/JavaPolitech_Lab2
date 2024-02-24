package Files;

public class File{
    private String fileName;
    private long size;
    private String format;

    public File(String fileName, long size, String format) {
        setFileName(fileName);
        setSize(size);
        setFormat(format);
    }

    private void setFileName(String fileName) {
        if (fileName == null || fileName.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя файла не может быть пустым или равным null");
        }
        this.fileName = fileName;
    }

    private void setSize(long size) {
        if (size < 0) {
            throw new IllegalArgumentException("Размер файла не может быть отрицательным");
        }
        this.size = size;
    }

    public void setFormat(String format) {
        if (format == null || format.trim().isEmpty()) {
            throw new IllegalArgumentException("Формат файла не может быть пустым или равным null");
        }
        this.format = format;
    }

    public String getFileName() {
        return fileName;
    }

    public long getSize() {
        return size;
    }

    public String getFormat() {
        return format;
    }

    private static String centerAlign(String text, int width) {
        int padding = (width - text.length()) / 2;
        return String.format("%" + (padding + text.length()) + "s", text);
    }

    @Override
    public String toString() {
        return String.format("%-20s | %10d | %s", getFileName(), getSize(), getFormat());
    }

    public static void printAll(File[] files) {
        System.out.println(".......................................................");
        String headerFormat = "%-20s | %-10s | %-10s%n";
        System.out.printf(headerFormat, centerAlign("File name", 20),
                centerAlign("Size", 10), centerAlign("Details", 20));
        System.out.println("---------------------|------------|--------------------");
        for (File file : files) {
            System.out.println(file.toString());
        }
        System.out.println(".......................................................");
    }
}

class ImageSize {
    private int width;
    private int height;

    public ImageSize(int width, int height) {
        setWidth(width);
        setHeight(height);
    }

    private void setWidth(int width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Ширина изображения должна быть положительным числом");
        }
        this.width = width;
    }

    private void setHeight(int height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Высота изображения должна быть положительным числом");
        }
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return getWidth() + "x" + getHeight();
    }
}

class MediaDuration{
    private int hours;
    private int minutes;
    private int seconds;

    public MediaDuration(int hours, int minutes, int seconds){
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    private void setHours(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Часы не могут быть отрицательными");
        }
        this.hours = hours;
    }

    private void setMinutes(int minutes) {
        if (minutes < 0 || minutes >= 60) {
            throw new IllegalArgumentException("Минуты должны быть в пределах от 0 до 59");
        }
        this.minutes = minutes;
    }

    private void setSeconds(int seconds) {
        if (seconds < 0 || seconds >= 60) {
            throw new IllegalArgumentException("Секунды должны быть в пределах от 0 до 59");
        }
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", getHours(), getMinutes(), getSeconds());
    }
}