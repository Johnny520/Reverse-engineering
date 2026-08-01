package p236;

import io.ktor.util.AbstractC4216;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.AbstractC5061;
import kotlin.sequences.InterfaceC5126;
import kotlin.text.AbstractC5131;
import kotlin.text.AbstractC5143;
import p088.C7166;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8121 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC5183 f22421 = AbstractC5186.m10210(new C7166(11));

    static {
        AbstractC5186.m10210(new C7166(12));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8124 m13557(List list) {
        list.getClass();
        C8124 c8124 = (C8124) AbstractC4343.m8830(list);
        if (c8124 == null) {
            c8124 = AbstractC8108.f22397;
        }
        if (c8124.m13560(AbstractC8105.f22393)) {
            if (AbstractC5061.m10050(c8124) == null) {
                return AbstractC5061.m10013(c8124, AbstractC5131.f14688);
            }
        } else if (c8124.m13560(AbstractC8107.f22395)) {
            if (AbstractC5061.m10050(c8124) == null) {
                return AbstractC5061.m10013(c8124, AbstractC5131.f14688);
            }
        } else if (c8124.m13560(AbstractC8108.f22401) && ((c8124.m13560(AbstractC8108.f22400) || c8124.m13560(AbstractC8108.f22398) || c8124.m13560(AbstractC8108.f22396) || c8124.m13560(AbstractC8108.f22403) || c8124.m13560(AbstractC8108.f22402)) && AbstractC5061.m10050(c8124) == null)) {
            return AbstractC5061.m10013(c8124, AbstractC5131.f14688);
        }
        return c8124;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final LinkedHashMap m13558(InterfaceC5126 interfaceC5126) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : interfaceC5126) {
            Object first = ((Pair) obj).getFirst();
            Object arrayList = linkedHashMap.get(first);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(first, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC4338.m8779(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Pair) it.next()).getSecond());
            }
            linkedHashMap2.put(key, arrayList2);
        }
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List m13559(String str) {
        C8124 c8124 = C8124.f22426;
        for (String strM8641 = AbstractC4216.m8641(AbstractC5143.m10160(str, ".")); strM8641.length() > 0; strM8641 = AbstractC5143.m10139(strM8641, ".", "")) {
            List list = (List) ((Map) f22421.getValue()).get(strM8641);
            if (list != null) {
                return list;
            }
        }
        return EmptyList.INSTANCE;
    }
}
