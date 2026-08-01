package kotlin.reflect.jvm.internal.impl.p009km;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import p050.AbstractC7176;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5375 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Map f13595;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13596;

    public C5375(String str, Map map) {
        str.getClass();
        this.f13596 = str;
        this.f13595 = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5375)) {
            return false;
        }
        C5375 c5375 = (C5375) obj;
        return AbstractC5227.m9466(this.f13596, c5375.f13596) && this.f13595.equals(c5375.f13595);
    }

    public final int hashCode() {
        return this.f13595.hashCode() + (this.f13596.hashCode() * 31);
    }

    public final String toString() throws IOException {
        Iterable iterable;
        Iterable iterableM12487;
        Map map = this.f13595;
        if (map.size() == 0) {
            iterableM12487 = EmptyList.INSTANCE;
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
                    return "@" + this.f13596 + '(' + AbstractC5176.m9369(iterable, null, null, null, C5376.f13597, 31) + ')';
                }
                iterableM12487 = AbstractC7176.m12487(new Pair(entry.getKey(), entry.getValue()));
            } else {
                iterableM12487 = EmptyList.INSTANCE;
            }
        }
        iterable = iterableM12487;
        return "@" + this.f13596 + '(' + AbstractC5176.m9369(iterable, null, null, null, C5376.f13597, 31) + ')';
    }
}
