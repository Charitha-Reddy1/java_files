import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class dt {
    public static void main(String[] args) {
        LocalDateTime nfd=LocalDateTime.now();
        System.out.println("before format:"+nfd);
        DateTimeFormatter my=DateTimeFormatter.ofPattern("dd/MMM/yy");
        String fd=my.format(nfd);
        System.out.println("after format:"+fd);
    }
}
