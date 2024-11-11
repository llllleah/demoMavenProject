import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class SolutionTest {
    private static Solution cal = new Solution();
    //普通数组
    //输入: nums = [1,2,3,4]
    //输出: [24,12,8,6]
    @Test
    public void test1(){
        System.out.println("test1 is running");
        assertArrayEquals(new int[]{24,12,8,6},cal.productExceptSelf(new int[]{1,2,3,4}));
    }
    //包含0以及1和-1的数组
    //输入: nums = [-1,1,0,-3,3]
    //输出: [0,0,9,0,0]
    @Test
    public void test2(){
        System.out.println("test2 is running");
        assertArrayEquals(new int[]{0,0,9,0,0},cal.productExceptSelf(new int[]{-1,1,0,-3,3}));
    }
    //边界值：数组长度为1
    //输入：nums =[5]
    //输出：[1]
    @Test
    public void test3(){
        System.out.println("test3 is running");
        assertArrayEquals(new int[]{1}, cal.productExceptSelf(new int[]{5}));
    }
    //大数和小数混合
    //输入：nums =[1,Integer.MAX_VALUE,2,3]
    //输出：[Integer.MAX_VALUE * 6, 6, Integer.MAX_VALUE * 3, Integer.MAX_VALUE * 2]
    @Test
    public void test4(){
        System.out.println("test4 is running");
        assertArrayEquals(new int[]{Integer.MAX_VALUE * 6, 6, Integer.MAX_VALUE * 3, Integer.MAX_VALUE * 2}, cal.productExceptSelf(new int[]{1,Integer.MAX_VALUE,2,3}));
    }
}
