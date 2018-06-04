import java.lang.reflect.Array;
import java.util.Arrays;

public class Block {
     
    private int blockHash;

    private int preHash;
    
    private String[] transactions;

    public Block(int preHash, String[] transactions) 
    {
        this.preHash = preHash;
        this.transactions = transactions;

        Object[] ob1 = {Arrays.hashCode(transactions), preHash};
        this.blockHash = Arrays.hashCode(ob1);

    }

    public int getPreHash() {
        return preHash;
    }

    public String[] getTransaction() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }
}
