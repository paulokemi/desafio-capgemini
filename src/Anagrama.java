import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Anagrama {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String s;
        System.out.println("Digite a palavra: ");
        s = entrada.next();

            HashMap<String, Integer> map = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                for (int j = i; j < s.length(); j++) {
                    char[] caracter = s.substring(i, j + 1).toCharArray();
                    Arrays.sort(caracter);
                    String val = new String(caracter);
                    if (map.containsKey(val))
                        map.put(val, map.get(val) + 1);
                    else
                        map.put(val, 1);
                }
            }
            int contadorAnagramaPar = 0;
            for (String key : map.keySet()) {
                int n = map.get(key);
                contadorAnagramaPar += (n * (n - 1)) / 2;
            }
            System.out.println(contadorAnagramaPar);
        }
    }
