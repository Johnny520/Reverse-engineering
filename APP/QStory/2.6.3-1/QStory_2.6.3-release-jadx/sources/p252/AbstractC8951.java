package p252;

import io.ktor.util.AbstractC5049;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.sequences.InterfaceC5959;
import kotlin.text.AbstractC5964;
import kotlin.text.AbstractC5976;
import p034.AbstractC7082;
import p104.C7996;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8951 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC6016 f22764 = AbstractC6019.m10773(new C7996(11));

    static {
        AbstractC6019.m10773(new C7996(12));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C8954 m14145(List list) {
        list.getClass();
        C8954 c8954 = (C8954) AbstractC5176.m9374(list);
        if (c8954 == null) {
            c8954 = AbstractC8938.f22740;
        }
        if (c8954.m14148(AbstractC8935.f22736)) {
            if (AbstractC7082.m12300(c8954) == null) {
                return AbstractC7082.m12295(c8954, AbstractC5964.f15033);
            }
        } else if (c8954.m14148(AbstractC8937.f22738)) {
            if (AbstractC7082.m12300(c8954) == null) {
                return AbstractC7082.m12295(c8954, AbstractC5964.f15033);
            }
        } else if (c8954.m14148(AbstractC8938.f22744) && ((c8954.m14148(AbstractC8938.f22743) || c8954.m14148(AbstractC8938.f22741) || c8954.m14148(AbstractC8938.f22739) || c8954.m14148(AbstractC8938.f22746) || c8954.m14148(AbstractC8938.f22745)) && AbstractC7082.m12300(c8954) == null)) {
            return AbstractC7082.m12295(c8954, AbstractC5964.f15033);
        }
        return c8954;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final LinkedHashMap m14146(InterfaceC5959 interfaceC5959) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : interfaceC5959) {
            Object first = ((Pair) obj).getFirst();
            Object arrayList = linkedHashMap.get(first);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(first, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC5171.m9331(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Pair) it.next()).getSecond());
            }
            linkedHashMap2.put(key, arrayList2);
        }
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List m14147(String str) {
        C8954 c8954 = C8954.f22769;
        for (String strM9190 = AbstractC5049.m9190(AbstractC5976.m10706(str, ".")); strM9190.length() > 0; strM9190 = AbstractC5976.m10700(strM9190, ".", "")) {
            List list = (List) ((Map) f22764.getValue()).get(strM9190);
            if (list != null) {
                return list;
            }
        }
        return EmptyList.INSTANCE;
    }
}
