package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4410;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p049.AbstractC6526;
import p049.AbstractC6527;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4606 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Set f13454;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Set f13455;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final LinkedHashMap f13456;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Map f13457;

    static {
        C4686 c4686 = AbstractC6527.f17903;
        Pair pair = new Pair(c4686.m9316(C4691.m9330("name")).m9319(), AbstractC6526.f17840);
        Pair pair2 = new Pair(c4686.m9316(C4691.m9330("ordinal")).m9319(), C4691.m9330("ordinal"));
        Pair pair3 = new Pair(AbstractC4922.m9881("size", AbstractC6527.f17869), C4691.m9330("size"));
        C4687 c4687 = AbstractC6527.f17877;
        Map mapM8774 = AbstractC4339.m8774(pair, pair2, pair3, new Pair(AbstractC4922.m9881("size", c4687), C4691.m9330("size")), new Pair(AbstractC6527.f17881.m9316(C4691.m9330("length")).m9319(), C4691.m9330("length")), new Pair(AbstractC4922.m9881("keys", c4687), C4691.m9330("keySet")), new Pair(AbstractC4922.m9881("values", c4687), C4691.m9330("values")), new Pair(AbstractC4922.m9881("entries", c4687), C4691.m9330("entrySet")), new Pair(AbstractC4922.m9881("size", AbstractC6527.f17911), C4691.m9330("length")), new Pair(AbstractC4922.m9881("size", AbstractC6527.f17912), C4691.m9330("length")), new Pair(AbstractC4922.m9881("size", AbstractC6527.f17908), C4691.m9330("length")));
        f13457 = mapM8774;
        Set<Map.Entry> setEntrySet = mapM8774.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(AbstractC4345.m8822(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new Pair(((C4687) entry.getKey()).f13696.m9318(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair4 : arrayList) {
            C4691 c4691 = (C4691) pair4.getSecond();
            Object arrayList2 = linkedHashMap.get(c4691);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(c4691, arrayList2);
            }
            ((List) arrayList2).add((C4691) pair4.getFirst());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC4339.m8772(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Iterable iterable = (Iterable) entry2.getValue();
            iterable.getClass();
            linkedHashMap2.put(key, AbstractC4344.m8797(AbstractC4344.m8784(iterable)));
        }
        f13456 = linkedHashMap2;
        Map map = f13457;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            String str = C4410.f12987;
            C4688 c4688M8945 = C4410.m8945(((C4687) entry3.getKey()).m9320().f13696);
            c4688M8945.getClass();
            linkedHashSet.add(c4688M8945.m9327().m9321((C4691) entry3.getValue()));
        }
        Set setKeySet = f13457.keySet();
        f13455 = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C4687) it.next()).f13696.m9318());
        }
        f13454 = AbstractC4344.m8788(arrayList3);
    }
}
