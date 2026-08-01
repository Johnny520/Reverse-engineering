package org.apache.commons.lang3;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.stream.Collectors;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: org.apache.commons.lang3.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6531 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Map f15982;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final HashMap f15983;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final HashMap f15984;

    static {
        String.valueOf(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        String.valueOf('$');
        HashMap map = new HashMap();
        Class cls = Boolean.TYPE;
        map.put(cls.getName(), cls);
        Class cls2 = Byte.TYPE;
        map.put(cls2.getName(), cls2);
        Class cls3 = Character.TYPE;
        map.put(cls3.getName(), cls3);
        Class cls4 = Double.TYPE;
        map.put(cls4.getName(), cls4);
        Class cls5 = Float.TYPE;
        map.put(cls5.getName(), cls5);
        Class cls6 = Integer.TYPE;
        map.put(cls6.getName(), cls6);
        Class cls7 = Long.TYPE;
        map.put(cls7.getName(), cls7);
        Class cls8 = Short.TYPE;
        map.put(cls8.getName(), cls8);
        Class cls9 = Void.TYPE;
        map.put(cls9.getName(), cls9);
        HashMap map2 = new HashMap();
        f15984 = map2;
        map2.put(cls, Boolean.class);
        map2.put(cls2, Byte.class);
        map2.put(cls3, Character.class);
        map2.put(cls8, Short.class);
        map2.put(cls6, Integer.class);
        map2.put(cls7, Long.class);
        map2.put(cls4, Double.class);
        map2.put(cls5, Float.class);
        map2.put(cls9, cls9);
        f15983 = new HashMap();
        map2.forEach(new C6530());
        HashMap map3 = new HashMap();
        map3.put(cls6.getName(), "I");
        map3.put(cls.getName(), "Z");
        map3.put(cls5.getName(), "F");
        map3.put(cls7.getName(), "J");
        map3.put(cls8.getName(), "S");
        map3.put(cls2.getName(), "B");
        map3.put(cls4.getName(), "D");
        map3.put(cls3.getName(), "C");
        Collections.unmodifiableMap(map3);
        f15982 = Collections.unmodifiableMap((Map) map3.entrySet().stream().collect(Collectors.toMap(new C6519(1), new C6519(2))));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m11620(Class cls, LinkedHashSet linkedHashSet) {
        while (cls != null) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (linkedHashSet.add(cls2)) {
                    m11620(cls2, linkedHashSet);
                }
            }
            cls = cls.getSuperclass();
        }
    }
}
