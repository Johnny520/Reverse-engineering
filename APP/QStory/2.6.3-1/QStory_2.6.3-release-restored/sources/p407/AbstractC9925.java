package p407;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲兰子世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9925 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final HashMap f25836;

    static {
        HashMap map = new HashMap();
        f25836 = map;
        map.put(Boolean.TYPE, Boolean.class);
        map.put(Integer.TYPE, Integer.class);
        map.put(Long.TYPE, Long.class);
        map.put(Byte.TYPE, Byte.class);
        map.put(Short.TYPE, Short.class);
        map.put(Float.TYPE, Float.class);
        map.put(Double.TYPE, Double.class);
        map.put(Character.TYPE, Character.class);
        map.put(boolean[].class, Boolean[].class);
        map.put(int[].class, Integer[].class);
        map.put(long[].class, Long[].class);
        map.put(char[].class, Character[].class);
        map.put(short[].class, Short[].class);
        map.put(byte[].class, Byte[].class);
        map.put(float[].class, Float[].class);
        map.put(double[].class, Double[].class);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m15241(Class cls, Class cls2) {
        if (cls.equals(cls2)) {
            return true;
        }
        HashMap map = f25836;
        Class cls3 = null;
        if (cls.equals(map.containsKey(cls2) ? (Class) map.get(cls2) : null)) {
            return true;
        }
        if (map.containsValue(cls2)) {
            Iterator it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getValue()).equals(cls2)) {
                    cls3 = (Class) entry.getKey();
                    break;
                }
            }
        }
        return cls.equals(cls3);
    }
}
