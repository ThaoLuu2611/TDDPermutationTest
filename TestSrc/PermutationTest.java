import junit.framework.TestCase;


public class PermutationTest extends TestCase {
	PermutationStrings permutation;
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		permutation = new PermutationStrings();
	}
	
	public void testOnTwoStringHaveLengthEqual11()throws Exception{
		assertEquals(true,permutation.isPermutation("qwertyuiopq","qetyouyewer"));
		assertEquals(false,permutation.isPermutation("qwertyuiq","qetyouyewer"));
		
	}
	public void testOnTwoStringArePermutation() throws Exception{
		assertEquals(true,permutation.isPermutation("qwertyuiopa", "tqeurtyipao"));
		assertEquals(false,permutation.isPermutation("qwertyuiopa", "tqeurtyipao"));
	}

}
