package descriptografia;

public class Descriptografia {

    public static String encriptar(String textoOriginal, int chave) {
        String textoCifrado = "";

        for (int i = 0; i < textoOriginal.length(); i++) {
            textoCifrado += encriptar1(textoOriginal.charAt(i), chave);
        }
        return textoCifrado;
    }



    public static String decriptar(String textoOriginal, int chave) {
        String textoDescifrado = "";

        for (int i = 0; i < textoOriginal.length(); i++) {
            textoDescifrado += encriptar1(textoOriginal.charAt(i), - chave);
        }
        return textoDescifrado;
    }



    private static char encriptar1(char charOriginal, int chave) {
        char charCifrado;


        if (charOriginal >= 97 && charOriginal <= 122) {
            charCifrado = (char) (charOriginal - chave);


            if (charCifrado < 97) {
                charCifrado = (char) (charCifrado + 26);

            }

            if (charCifrado > 122) {
                charCifrado = (char) (charCifrado - 26);

            }


        } else {
            charCifrado = charOriginal;
        }

        return charCifrado;
    }


}