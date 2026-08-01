package kotlin.reflect.jvm.internal.impl.km;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import p034.AbstractC6347;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Map f13250;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13251;

    public C4543(String str, Map map) {
        str.getClass();
        this.f13251 = str;
        this.f13250 = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4543)) {
            return false;
        }
        C4543 c4543 = (C4543) obj;
        return AbstractC4395.m8907(this.f13251, c4543.f13251) && this.f13250.equals(c4543.f13250);
    }

    public final int hashCode() {
        return this.f13250.hashCode() + (this.f13251.hashCode() * 31);
    }

    public final String toString() throws IOException {
        Iterable iterable;
        Iterable iterableM11928;
        Map map = this.f13250;
        if (map.size() == 0) {
            iterableM11928 = EmptyList.INSTANCE;
        } else {
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (it.hasNext()) {
                    ArrayList arrayList = new ArrayList(map.size());
                    arrayList.add(new Pair(entry.getKey(), entry.getValue()));
                    do {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        arrayList.add(new Pair(entry2.getKey(), entry2.getValue()));
                    } while (it.hasNext());
                    iterable = arrayList;
                    return "@" + this.f13251 + '(' + AbstractC4344.m8810(iterable, null, null, null, C4544.f13252, 31) + ')';
                }
                iterableM11928 = AbstractC6347.m11928(new Pair(entry.getKey(), entry.getValue()));
            } else {
                iterableM11928 = EmptyList.INSTANCE;
            }
        }
        iterable = iterableM11928;
        return "@" + this.f13251 + '(' + AbstractC4344.m8810(iterable, null, null, null, C4544.f13252, 31) + ')';
    }
}
