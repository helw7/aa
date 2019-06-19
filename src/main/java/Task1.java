import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Task1 {

    public static void main(String[]args) {
        //键盘输入字符串
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        System.out.println(str);
        //定义HashMap集合
        Map<Character,Integer> map=new HashMap<Character,Integer>();
        //字符串转化为字符数组
        char [] chars=str.toCharArray();
        Integer i=0;
        //将字符和出现次数存入Map集合
        for(char ch:chars){
             i=map.get(ch);
            if(i==null){
                map.put(ch,1);
            }else{
                ++i;
                map.put(ch,i);
            }
             //  查看输出过程
            //  System.out.println(map);
        }
        //通过迭代器Iteractor遍历Map得到Map.Entry实例化后的对象集
        Iterator<Map.Entry<Character,Integer>>entries=map.entrySet().iterator();
       //通过判断entries集合中是否还有元素从而得到key,value值
        while(entries.hasNext()){
            Map.Entry<Character,Integer> entry=entries.next();
            char key=entry.getKey();
            int value=entry.getValue();
            //输出结果
            System.out.println(key+"出现次数："+value);


        }



    }


}