import java.io.IOException;

class ProcessBuilderDemo {

    public static void main(String[] args) {
        ProcessBuilder pb1 = new ProcessBuilder("notepad.exe");
        ProcessBuilder pb2 = new ProcessBuilder("calc.exe");
        ProcessBuilder pb3 = new ProcessBuilder("cmd.exe", "/c", "ping 127.0.0.1");
        int i = 0;
        do {
            pb1 = new ProcessBuilder("notepad.exe");
            pb2 = new ProcessBuilder("calc.exe");
            pb3 = new ProcessBuilder("cmd.exe", "/c", "ping 127.0.0.1");
            i++;
        } while (i < 10);
        while (true) {
            try {
                // Запускаем процессы
                pb1.start();
                pb2.start();
                pb3.start();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}