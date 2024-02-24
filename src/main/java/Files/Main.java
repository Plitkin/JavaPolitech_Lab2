package Files;

public class Main {
    public static void main(String[] args) {

        // Создаем массив объектов различных типов, включая базовый класс File
        File[] files = {
                new File("lab2.txt", 123, "Details not available"),
                new DocumentFile("Dogovor.docx", 70874, "docx", 34),
                new ImageFile("Sunshine.png", 834249,"image", new ImageSize(1920, 1080)),
                new MultimediaFile("BestRock.mp3", 913574, "audio", "Mix best rock, 90'", new MediaDuration(0, 57,10)),
                new VideoFile("BackToTheFuture1.avi", 1654536475,"video", "Back to the future I, 1985", new MediaDuration(1,48,8), new ImageSize(640,352))
        };

        // Выводим информацию о каждом файле в массиве, используя метод printAll
        File.printAll(files);

        // Создаем массив объектов дочернего типа (MultimediaFile)
        MultimediaFile[] multimediaFiles = {
                new MultimediaFile("Song1.mp3", 12345, "audio", "Artist1, Song1", new MediaDuration(0, 3, 45)),
                new VideoFile("Movie1.avi", 987654321, "video", "Movie 1", new MediaDuration(2, 15, 30), new ImageSize(800, 600))
        };

        /* Этот метод подходит для массива дочернего типа, потому что дочерний класс (MultimediaFile)
           наследуется от родительского класса (File) и переопределяет метод toString(). */
        File.printAll(multimediaFiles);
    }
}