package p236;

import io.ktor.util.AbstractC4217;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.sequences.InterfaceC5127;
import kotlin.text.AbstractC5132;
import kotlin.text.AbstractC5144;
import p018.AbstractC6253;
import p088.C7167;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8122 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC5184 f22419 = AbstractC5187.m10214(new C7167(11));

    static {
        AbstractC5187.m10214(new C7167(12));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8125 m13586(List list) {
        list.getClass();
        C8125 c8125 = (C8125) AbstractC4344.m8815(list);
        if (c8125 == null) {
            c8125 = AbstractC8109.f22395;
        }
        if (c8125.m13589(AbstractC8106.f22391)) {
            if (AbstractC6253.m11741(c8125) == null) {
                return AbstractC6253.m11736(c8125, AbstractC5132.f14688);
            }
        } else if (c8125.m13589(AbstractC8108.f22393)) {
            if (AbstractC6253.m11741(c8125) == null) {
                return AbstractC6253.m11736(c8125, AbstractC5132.f14688);
            }
        } else if (c8125.m13589(AbstractC8109.f22399) && ((c8125.m13589(AbstractC8109.f22398) || c8125.m13589(AbstractC8109.f22396) || c8125.m13589(AbstractC8109.f22394) || c8125.m13589(AbstractC8109.f22401) || c8125.m13589(AbstractC8109.f22400)) && AbstractC6253.m11741(c8125) == null)) {
            return AbstractC6253.m11736(c8125, AbstractC5132.f14688);
        }
        return c8125;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final LinkedHashMap m13587(InterfaceC5127 interfaceC5127) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : interfaceC5127) {
            Object first = ((Pair) obj).getFirst();
            Object arrayList = linkedHashMap.get(first);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(first, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC4339.m8772(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Pair) it.next()).getSecond());
            }
            linkedHashMap2.put(key, arrayList2);
        }
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List m13588(String str) {
        C8125 c8125 = C8125.f22424;
        for (String strM8631 = AbstractC4217.m8631(AbstractC5144.m10147(str, ".")); strM8631.length() > 0; strM8631 = AbstractC5144.m10141(strM8631, ".", "")) {
            List list = (List) ((Map) f22419.getValue()).get(strM8631);
            if (list != null) {
                return list;
            }
        }
        return EmptyList.INSTANCE;
    }
}
