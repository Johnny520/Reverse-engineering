package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4692;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4626 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Map f13535;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final LinkedHashMap f13536;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f13536 = linkedHashMap;
        m9247(C4692.f13721, m9248("java.util.ArrayList", "java.util.LinkedList"));
        m9247(C4692.f13711, m9248("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        m9247(C4692.f13710, m9248("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        C4686 c4686 = new C4686("java.util.function.Function");
        m9247(new C4687(c4686.m9330(), c4686.f13692.m9328()), m9248("java.util.function.UnaryOperator"));
        C4686 c46862 = new C4686("java.util.function.BiFunction");
        m9247(new C4687(c46862.m9330(), c46862.f13692.m9328()), m9248("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(((C4687) entry.getKey()).m9337(), ((C4687) entry.getValue()).m9337()));
        }
        f13535 = AbstractC4338.m8783(arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m9247(C4687 c4687, ArrayList arrayList) {
        for (Object obj : arrayList) {
            f13536.put(obj, c4687);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ArrayList m9248(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            C4686 c4686 = new C4686(str);
            arrayList.add(new C4687(c4686.m9330(), c4686.f13692.m9328()));
        }
        return arrayList;
    }
}
