
import java.util.Arrays;

public class Main {

  
     

    public static void main(String[] args) {

        String[] t1= {"z"};
        Block block1 = new Block(0,t1);

        String[] t2 = {"b"};
        Block block2 = new Block(block1.getBlockHash(), t2);

        String[] t3 = {"c"};
        Block block3 = new Block(block2.getBlockHash(), t3);

        System.out.println("Hash of block 1:");
        System.out.println(block1.getBlockHash());

        System.out.println("Hash of block 2:");
        System.out.println(block2.getBlockHash());

        System.out.println("Hash of block 3:");
        System.out.println(block3.getBlockHash());

    }


}
