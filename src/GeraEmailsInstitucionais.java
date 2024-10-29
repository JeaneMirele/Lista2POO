import java.util.ArrayList;
import java.util.List;

public class GeraEmailsInstitucionais {
    public static void main(String[] args) {

        List<String> docentes = new ArrayList<>();
        List<String> ultimosNomes = new ArrayList<>();
        List<String> primeirosNomes = new ArrayList<>();
        List <String> segundosNomes = new ArrayList<>();
        List<String> emails = new ArrayList<>();

        int i;
        docentes.add("ADELE GUIMARAES UBARANA SANTOS");
        docentes.add("FELIX FERREIRA BERNARDO");
        docentes.add("GILVANDO PEREIRA DA SILVA");
        docentes.add("HEITOR MEDEIROS FLORENCIO");
        docentes.add("ISAURA DE FRANÇA BRANDÃO");
      ; docentes.add("HEITOR MEDEIROS FLORENCIO");

        for (i = 0; i < docentes.size(); i++) {
            String[] separados = docentes.get(i).split(" ");
            String primeiroNome = separados[0].toLowerCase();
            String ultimoNome = separados[separados.length - 1].toLowerCase();
            String segundoNome = separados[1].toLowerCase();
            primeirosNomes.add(primeiroNome);
            ultimosNomes.add(ultimoNome);
            segundosNomes.add(segundoNome);
        }

        for (i = 0; i < docentes.size(); i++) {
            if(emails.contains(gerarEmail(primeirosNomes.get(i), ultimosNomes.get(i),""))){
               String email = gerarEmail(primeirosNomes.get(i), ultimosNomes.get(i), segundosNomes.get(i));
               emails.add(email);
           }else{
               String email = gerarEmail(primeirosNomes.get(i), ultimosNomes.get(i), "");
               emails.add(email);
           }
        }
        System.out.println(emails);
    }

    private static String gerarEmail(String primeiro, String ultimo, String segundo) {
        if (segundo != ""){
            return primeiro + "." + segundo + "." + ultimo + "@ufrn.br";
        } else {
            return primeiro + "." + ultimo + "@ufrn.br";
        }
    }
}
