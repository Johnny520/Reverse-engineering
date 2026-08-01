package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4409;
import kotlin.reflect.jvm.internal.impl.name.C4685;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import p049.AbstractC6525;
import p049.AbstractC6526;
import p251.AbstractC8174;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4605 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Set f13450;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Set f13451;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final LinkedHashMap f13452;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Map f13453;

    static {
        C4685 c4685 = AbstractC6526.f17907;
        Pair pair = new Pair(c4685.m9326(C4690.m9340("name")).m9329(), AbstractC6525.f17844);
        Pair pair2 = new Pair(c4685.m9326(C4690.m9340("ordinal")).m9329(), C4690.m9340("ordinal"));
        Pair pair3 = new Pair(AbstractC8174.m13608("size", AbstractC6526.f17873), C4690.m9340("size"));
        C4686 c4686 = AbstractC6526.f17881;
        Map mapM8777 = AbstractC4338.m8777(pair, pair2, pair3, new Pair(AbstractC8174.m13608("size", c4686), C4690.m9340("size")), new Pair(AbstractC6526.f17885.m9326(C4690.m9340("length")).m9329(), C4690.m9340("length")), new Pair(AbstractC8174.m13608("keys", c4686), C4690.m9340("keySet")), new Pair(AbstractC8174.m13608("values", c4686), C4690.m9340("values")), new Pair(AbstractC8174.m13608("entries", c4686), C4690.m9340("entrySet")), new Pair(AbstractC8174.m13608("size", AbstractC6526.f17915), C4690.m9340("length")), new Pair(AbstractC8174.m13608("size", AbstractC6526.f17916), C4690.m9340("length")), new Pair(AbstractC8174.m13608("size", AbstractC6526.f17912), C4690.m9340("length")));
        f13453 = mapM8777;
        Set<Map.Entry> setEntrySet = mapM8777.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(AbstractC4344.m8832(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new Pair(((C4686) entry.getKey()).f13692.m9328(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair4 : arrayList) {
            C4690 c4690 = (C4690) pair4.getSecond();
            Object arrayList2 = linkedHashMap.get(c4690);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(c4690, arrayList2);
            }
            ((List) arrayList2).add((C4690) pair4.getFirst());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC4338.m8779(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Iterable iterable = (Iterable) entry2.getValue();
            iterable.getClass();
            linkedHashMap2.put(key, AbstractC4343.m8804(AbstractC4343.m8801(iterable)));
        }
        f13452 = linkedHashMap2;
        Map map = f13453;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            String str = C4409.f12983;
            C4687 c4687M8955 = C4409.m8955(((C4686) entry3.getKey()).m9330().f13692);
            c4687M8955.getClass();
            linkedHashSet.add(c4687M8955.m9337().m9331((C4690) entry3.getValue()));
        }
        Set setKeySet = f13453.keySet();
        f13451 = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((C4686) it.next()).f13692.m9328());
        }
        f13450 = AbstractC4343.m8800(arrayList3);
    }
}
