package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4693;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4627 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Map f13539;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final LinkedHashMap f13540;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f13540 = linkedHashMap;
        m9237(C4693.f13725, m9238("java.util.ArrayList", "java.util.LinkedList"));
        m9237(C4693.f13715, m9238("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        m9237(C4693.f13714, m9238("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        C4687 c4687 = new C4687("java.util.function.Function");
        m9237(new C4688(c4687.m9320(), c4687.f13696.m9318()), m9238("java.util.function.UnaryOperator"));
        C4687 c46872 = new C4687("java.util.function.BiFunction");
        m9237(new C4688(c46872.m9320(), c46872.f13696.m9318()), m9238("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(((C4688) entry.getKey()).m9327(), ((C4688) entry.getValue()).m9327()));
        }
        f13539 = AbstractC4339.m8771(arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m9237(C4688 c4688, ArrayList arrayList) {
        for (Object obj : arrayList) {
            f13540.put(obj, c4688);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ArrayList m9238(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            C4687 c4687 = new C4687(str);
            arrayList.add(new C4688(c4687.m9320(), c4687.f13696.m9318()));
        }
        return arrayList;
    }
}
