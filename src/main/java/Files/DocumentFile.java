package Files;

class DocumentFile extends File{

    private int pageCount;

    public DocumentFile(String fileName, int size, String format, int pageCount) {
        super(fileName, size, format);
        setPageCount(pageCount);
    }

    private void setPageCount(int pageCount) {
        if (pageCount <= 0) {
            throw new IllegalArgumentException("Количество страниц должно быть положительным числом");
        }
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return String.format("%-20s | %10d | %s, %d pages", getFileName(),
                getSize(), getFormat(), getPageCount());
    }
}
