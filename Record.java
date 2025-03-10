package othello_records;
import java.util.Arrays;
import java.util.Scanner;

public class Record {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("参加人数を入力してください");
        int player_number = scanner.nextInt();
        System.out.println("参加人数は" + player_number + "人です");
        // scanner.close();

        System.out.println("参加するユーザー名を入力してください");
        String[] players = new String[player_number];
        int[][] records = new int[player_number][player_number - 1];
        for (int i = 0; i < player_number; i++){
            String player_name = scanner.next();
            players[i] = player_name;
        }
        System.out.println(Arrays.toString(players));

        // 結果入力
        for (int i = 0; i < player_number - 1; i++){
            for (int j = 0; j < player_number; j++){
                System.out.println("match" + (i + 1) + ": " + players[j] + "の獲得石数を入力してください");
                records[j][i] = scanner.nextInt();
            }
        }

        // 結果出力
        for (int i = 0; i < player_number; i++){
            System.out.println(players[i]);
            System.out.println("累計獲得石数: " + );
            System.out.println(Arrays.toString(records[i]));
        }
    }
}


