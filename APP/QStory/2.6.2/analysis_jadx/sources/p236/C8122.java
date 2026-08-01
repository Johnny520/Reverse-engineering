package p236;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5137;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8122 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final double f22422;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f22423;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22424;

    public C8122(String str, List list) {
        Double d;
        Object next;
        String str2;
        Double dM10122;
        str.getClass();
        list.getClass();
        this.f22424 = str;
        this.f22423 = list;
        Iterator it = list.iterator();
        while (true) {
            d = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (AbstractC4394.m8917(((C8119) next).f22419, "q")) {
                    break;
                }
            }
        }
        C8119 c8119 = (C8119) next;
        double dDoubleValue = 1.0d;
        if (c8119 != null && (str2 = c8119.f22418) != null && (dM10122 = AbstractC5137.m10122(str2)) != null) {
            double dDoubleValue2 = dM10122.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                d = dM10122;
            }
            if (d != null) {
                dDoubleValue = d.doubleValue();
            }
        }
        this.f22422 = dDoubleValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8122)) {
            return false;
        }
        C8122 c8122 = (C8122) obj;
        return AbstractC4394.m8917(this.f22424, c8122.f22424) && AbstractC4394.m8917(this.f22423, c8122.f22423);
    }

    public final int hashCode() {
        return this.f22423.hashCode() + (this.f22424.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderValue(value=" + this.f22424 + ", params=" + this.f22423 + ')';
    }

    public C8122(String str) {
        this(str, EmptyList.INSTANCE);
    }
}
