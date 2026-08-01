package p236;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5138;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8123 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final double f22420;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f22421;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22422;

    public C8123(String str, List list) {
        Double d;
        Object next;
        String str2;
        Double dM10126;
        str.getClass();
        list.getClass();
        this.f22422 = str;
        this.f22421 = list;
        Iterator it = list.iterator();
        while (true) {
            d = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (AbstractC4395.m8907(((C8120) next).f22417, "q")) {
                    break;
                }
            }
        }
        C8120 c8120 = (C8120) next;
        double dDoubleValue = 1.0d;
        if (c8120 != null && (str2 = c8120.f22416) != null && (dM10126 = AbstractC5138.m10126(str2)) != null) {
            double dDoubleValue2 = dM10126.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                d = dM10126;
            }
            if (d != null) {
                dDoubleValue = d.doubleValue();
            }
        }
        this.f22420 = dDoubleValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8123)) {
            return false;
        }
        C8123 c8123 = (C8123) obj;
        return AbstractC4395.m8907(this.f22422, c8123.f22422) && AbstractC4395.m8907(this.f22421, c8123.f22421);
    }

    public final int hashCode() {
        return this.f22421.hashCode() + (this.f22422.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderValue(value=" + this.f22422 + ", params=" + this.f22421 + ')';
    }

    public C8123(String str) {
        this(str, EmptyList.INSTANCE);
    }
}
