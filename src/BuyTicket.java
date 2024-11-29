import java.util.Scanner;

public class BuyTicket {

    public static void main(String[] args) {
        //массив с фильмами и массив с датами
        String movie, date;
        String[] movie_name = {" ", "Драйв", "Оппенгеймер", "Дэдпул 3"};
        String[] movie_date = {" ", "10.12", "11.12", "12.12"};

        //объявление того что будет ввод с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.println("Приветсвуем, раз вы здесь, вероятно вы хотите забронировать билет. Давайте подберем дату и фильм)");

        //спрашиваем дату
        System.out.println("Выберете дату:\n 1. " + movie_date[1] + "\n 2. " + movie_date[2] + "\n 3. " + movie_date[3]);
        int a = scanner.nextInt(); date = movie_date[a];

        //спрашиваем фильм
        System.out.println("Выберете фильм:\n 1." + movie_name[1] + "\n 2." + movie_name[2] + "\n 3." + movie_name[3]);
        int b = scanner.nextInt(); movie = movie_name[b];

        //создаем билет
        CreateTicket ticket = new CreateTicket(movie, date);

        //получаем билет
        CreateTicket.getInfoTicket();

        //записываем в файл "ticket.txt"
        String ticketInfo = ticket.getTicketInfo();
        CreateTicket.writeToFile(ticketInfo);
    }
}
