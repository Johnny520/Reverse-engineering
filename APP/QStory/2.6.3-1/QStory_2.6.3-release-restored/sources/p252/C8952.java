package p252;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5970;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8952 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final double f22765;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f22766;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22767;

    public C8952(String str, List list) {
        Double d;
        Object next;
        String str2;
        Double dM10685;
        str.getClass();
        list.getClass();
        this.f22767 = str;
        this.f22766 = list;
        Iterator it = list.iterator();
        while (true) {
            d = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (AbstractC5227.m9466(((C8949) next).f22762, "q")) {
                    break;
                }
            }
        }
        C8949 c8949 = (C8949) next;
        double dDoubleValue = 1.0d;
        if (c8949 != null && (str2 = c8949.f22761) != null && (dM10685 = AbstractC5970.m10685(str2)) != null) {
            double dDoubleValue2 = dM10685.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                d = dM10685;
            }
            if (d != null) {
                dDoubleValue = d.doubleValue();
            }
        }
        this.f22765 = dDoubleValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8952)) {
            return false;
        }
        C8952 c8952 = (C8952) obj;
        return AbstractC5227.m9466(this.f22767, c8952.f22767) && AbstractC5227.m9466(this.f22766, c8952.f22766);
    }

    public final int hashCode() {
        return this.f22766.hashCode() + (this.f22767.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderValue(value=" + this.f22767 + ", params=" + this.f22766 + ')';
    }

    public C8952(String str) {
        this(str, EmptyList.INSTANCE);
    }
}
