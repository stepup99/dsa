import java.util.ArrayList;

public class twodArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> V = new ArrayList<>(3);

        for(int i=0; i<3;i++){
            V.add(new ArrayList<>(4));
        }

        System.out.println(V);
        for(int i=0;i<3;i++){
            for(int j=0; j<4; j++){
                V.get(i).add(i);
            }
        }
        System.out.println(V);
    }
}
