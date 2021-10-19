import java.util.HashSet;

/**
 * Project name(项目名称)：Set集合 HashSet和TreeSet类
 * Package(包名): PACKAGE_NAME
 * Class(类名): HashSet_class
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/19
 * Time(创建时间)： 21:27
 * Version(版本): 1.0
 * Description(描述)：
 * Set 集合类似于一个罐子，程序可以依次把多个对象“丢进”Set 集合，而 Set 集合通常不能记住元素的添加顺序。
 * 也就是说 Set 集合中的对象不按特定的方式排序，只是简单地把对象加入集合。Set 集合中不能包含重复的对象，并且最多只允许包含一个 null 元素。
 * Set 实现了 Collection 接口，它主要有两个常用的实现类：HashSet 类和 TreeSet类。
 * HashSet 类
 * HashSet 是 Set 接口的典型实现，大多数时候使用 Set 集合时就是使用这个实现类。
 * HashSet 是按照 Hash 算法来存储集合中的元素。因此具有很好的存取和查找性能。
 * HashSet 具有以下特点：
 * 不能保证元素的排列顺序，顺序可能与添加顺序不同，顺序也有可能发生变化。
 * HashSet 不是同步的，如果多个线程同时访问或修改一个 HashSet，则必须通过代码来保证其同步。
 * 集合元素值可以是 null。
 * 当向 HashSet 集合中存入一个元素时，HashSet 会调用该对象的 hashCode() 方法来得到该对象的 hashCode 值，
 * 然后根据该 hashCode 值决定该对象在 HashSet 中的存储位置。如果有两个元素通过 equals() 方法比较返回的结果为 true，
 * 但它们的 hashCode 不相等，HashSet 将会把它们存储在不同的位置，依然可以添加成功。
 * 也就是说，两个对象的 hashCode 值相等且通过 equals() 方法比较返回结果为 true，则 HashSet 集合认为两个元素相等。
 * 在 HashSet 类中实现了 Collection 接口中的所有方法。HashSet 类的常用构造方法重载形式如下。
 * HashSet()：构造一个新的空的 Set 集合。
 * HashSet(Collection< extends >c)：构造一个包含指定 Collection 集合元素的新 Set 集合。其中，“< >”中的 extends 表示 HashSet 的父类，
 * 即指明该 Set 集合中存放的集合元素类型。c 表示其中的元素将被存放在此 Set 集合中。
 * 下面的代码演示了创建两种不同形式的 HashSet 对象:
 * HashSet hs = new HashSet();    // 调用无参的构造函数创建HashSet对象
 * HashSet<String> hss = new HashSet<String>();    // 创建泛型的 HashSet 集合对象
 */

public class HashSet_class
{
    public static void HashSet_display()
    {
        HashSet<String> p = new HashSet<String>();
        String str1 = new String("第一个字符串1");
        String str2 = new String("第二个字符串1");
        String str3 = new String("第三个字符串1");
        String str4 = new String("第四个字符串1");
        String str5 = new String("第五个字符串1");
        String str6 = new String("第六个字符串1");
        String str7 = new String("第七个字符串1");
        p.add(str1);
        p.add(str2);
        p.add(str3);
        p.add(str4);
        p.add(str5);
        p.add(str6);
        p.add(str7);
        System.out.println("输出：");
        for (String s : p)
        {
            System.out.println(s);
        }
    }

    public static void main(String... args)
    {
        HashSet<String> p = new HashSet<String>();
        String str1 = new String("第一个字符串");
        String str2 = new String("第二个字符串");
        String str3 = new String("第三个字符串");
        String str4 = new String("第四个字符串");
        String str5 = new String("第五个字符串");
        String str6 = new String("第六个字符串");
        String str7 = new String("第七个字符串");
        p.add(str1);
        p.add(str2);
        p.add(str3);
        p.add(str4);
        p.add(str5);
        p.add(str6);
        p.add(str7);
        System.out.println("输出：");
        for (String s : p)
        {
            System.out.println(s);
        }
        HashSet_display();
    }
}
