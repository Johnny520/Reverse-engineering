package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5525;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Map f13884;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final LinkedHashMap f13885;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f13885 = linkedHashMap;
        m9796(C5525.f14070, m9797("java.util.ArrayList", "java.util.LinkedList"));
        m9796(C5525.f14060, m9797("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        m9796(C5525.f14059, m9797("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        C5519 c5519 = new C5519("java.util.function.Function");
        m9796(new C5520(c5519.m9879(), c5519.f14041.m9877()), m9797("java.util.function.UnaryOperator"));
        C5519 c55192 = new C5519("java.util.function.BiFunction");
        m9796(new C5520(c55192.m9879(), c55192.f14041.m9877()), m9797("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(((C5520) entry.getKey()).m9886(), ((C5520) entry.getValue()).m9886()));
        }
        f13884 = AbstractC5171.m9330(arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m9796(C5520 c5520, ArrayList arrayList) {
        for (Object obj : arrayList) {
            f13885.put(obj, c5520);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ArrayList m9797(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            C5519 c5519 = new C5519(str);
            arrayList.add(new C5520(c5519.m9879(), c5519.f14041.m9877()));
        }
        return arrayList;
    }
}
