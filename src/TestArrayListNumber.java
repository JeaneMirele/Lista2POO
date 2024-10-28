import java.util.*;

public class TestArrayListNumber {
    public static void main(String[] args) throws Exception {

        List<Integer> list = new ArrayList<>();
        List<Integer> repeated = new ArrayList<>();

        Random random = new Random();
        int number;
        int i;

         for(i=0; i<10; i++){
            number = random.nextInt(11)+10;
             if (list.contains(number)) {
                 repeated.add(number);
             }
             list.add(number);
         }
        System.out.println("Source List: " + list);

        List<Integer> copy = new ArrayList<>(list);

       Collections.sort(copy, Collections.reverseOrder());
       System.out.println("Descending list: " + copy);

       copy.remove(Collections.max(copy));
       copy.remove(Collections.min(copy));
       copy.addAll(list);

       System.out.println("Size of joined lists: " + copy.size());
       int size = copy.size();

       int soma = copy.stream()
               .mapToInt(Integer::intValue)
               .sum();

        System.out.println("Sum of list values: " + soma);

       int min = Collections.min(copy);
       int index = copy.indexOf(min);
       copy.set(index, averageValue(soma, size));

        Integer [] array = {1,2,3,4,5};
        List<Integer> array2 = Arrays.asList(array);

        Set<String> names = new HashSet<>();
        names.add("Nicolas");
        names.add("Yuki");
        names.add("Yori");
        names.add("Saori");
        names.add("Yori"); // duplicate test

        System.out.println("My cat names: " + names);

    }
    public static int averageValue(int soma, int size){
        return soma/size;
    }
}