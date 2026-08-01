package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5242;
import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p065.AbstractC7355;
import p065.AbstractC7356;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5438 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Set f13799;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Set f13800;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final LinkedHashMap f13801;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Map f13802;

    static {
        C5518 c5518 = AbstractC7356.f18248;
        Pair pair = new Pair(c5518.m9875(C5523.m9889("name")).m9878(), AbstractC7355.f18185);
        Pair pair2 = new Pair(c5518.m9875(C5523.m9889("ordinal")).m9878(), C5523.m9889("ordinal"));
        Pair pair3 = new Pair(AbstractC5754.m10440("size", AbstractC7356.f18214), C5523.m9889("size"));
        C5519 c5519 = AbstractC7356.f18222;
        Map mapM9333 = AbstractC5171.m9333(pair, pair2, pair3, new Pair(AbstractC5754.m10440("size", c5519), C5523.m9889("size")), new Pair(AbstractC7356.f18226.m9875(C5523.m9889("length")).m9878(), C5523.m9889("length")), new Pair(AbstractC5754.m10440("keys", c5519), C5523.m9889("keySet")), new Pair(AbstractC5754.m10440("values", c5519), C5523.m9889("values")), new Pair(AbstractC5754.m10440("entries", c5519), C5523.m9889("entrySet")), new Pair(AbstractC5754.m10440("size", AbstractC7356.f18256), C5523.m9889("length")), new Pair(AbstractC5754.m10440("size", AbstractC7356.f18257), C5523.m9889("length")), new Pair(AbstractC5754.m10440("size", AbstractC7356.f18253), C5523.m9889("length")));
        f13802 = mapM9333;
        Set<Map.Entry> setEntrySet = mapM9333.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(AbstractC5177.m9381(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new Pair(((C5519) entry.getKey()).f14041.m9877(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair4 : arrayList) {
            C5523 c5523 = (C5523) pair4.getSecond();
            Object arrayList2 = linkedHashMap.get(c5523);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(c5523, arrayList2);
            }
            ((List) arrayList2).add((C5523) pair4.getFirst());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC5171.m9331(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Iterable iterable = (Iterable) entry2.getValue();
            iterable.getClass();
            linkedHashMap2.put(key, AbstractC5176.m9356(AbstractC5176.m9343(iterable)));
        }
        f13801 = linkedHashMap2;
        Map map = f13802;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            String str = C5242.f13332;
            C5520 c5520M9504 = C5242.m9504(((C5519) entry3.getKey()).m9879().f14041);
            c5520M9504.getClass();
            linkedHashSet.add(c5520M9504.m9886().m9880((C5523) entry3.getValue()));
        }
        Set setKeySet = f13802.keySet();
        f13800 = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C5519) it.next()).f14041.m9877());
        }
        f13799 = AbstractC5176.m9347(arrayList3);
    }
}
