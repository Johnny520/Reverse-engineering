package kotlin.reflect.jvm.internal.impl.km;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Map f13246;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13247;

    public C4542(String str, Map map) {
        str.getClass();
        this.f13247 = str;
        this.f13246 = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4542)) {
            return false;
        }
        C4542 c4542 = (C4542) obj;
        return AbstractC4394.m8917(this.f13247, c4542.f13247) && this.f13246.equals(c4542.f13246);
    }

    public final int hashCode() {
        return this.f13246.hashCode() + (this.f13247.hashCode() * 31);
    }

    public final String toString() throws IOException {
        Iterable iterable;
        Iterable iterableM13660;
        Map map = this.f13246;
        if (map.size() == 0) {
            iterableM13660 = EmptyList.INSTANCE;
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
                    return "@" + this.f13247 + '(' + AbstractC4343.m8813(iterable, null, null, null, C4543.f13248, 31) + ')';
                }
                iterableM13660 = AbstractC8189.m13660(new Pair(entry.getKey(), entry.getValue()));
            } else {
                iterableM13660 = EmptyList.INSTANCE;
            }
        }
        iterable = iterableM13660;
        return "@" + this.f13247 + '(' + AbstractC4343.m8813(iterable, null, null, null, C4543.f13248, 31) + ')';
    }
}
