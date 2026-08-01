package p281t6;

import java.util.Iterator;
import java.util.List;
import p024b9.AbstractC1061t;
import p299ub.AbstractC8643y;

/* JADX INFO: renamed from: t6.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8156l {

    /* JADX INFO: renamed from: a */
    public final String f27276a;

    /* JADX INFO: renamed from: b */
    public final List f27277b;

    /* JADX INFO: renamed from: c */
    public final double f27278c;

    public C8156l(String str, List list) {
        Double d10;
        Object next;
        String strM31640d;
        Double dM33250q;
        str.getClass();
        list.getClass();
        this.f27276a = str;
        this.f27277b = list;
        Iterator it = list.iterator();
        while (true) {
            d10 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (AbstractC1061t.m3842c(((C8158m) next).m31639c(), "q")) {
                    break;
                }
            }
        }
        C8158m c8158m = (C8158m) next;
        double dDoubleValue = 1.0d;
        if (c8158m != null && (strM31640d = c8158m.m31640d()) != null && (dM33250q = AbstractC8643y.m33250q(strM31640d)) != null) {
            double dDoubleValue2 = dM33250q.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                d10 = dM33250q;
            }
            if (d10 != null) {
                dDoubleValue = d10.doubleValue();
            }
        }
        this.f27278c = dDoubleValue;
    }

    /* JADX INFO: renamed from: a */
    public final String m31633a() {
        return this.f27276a;
    }

    /* JADX INFO: renamed from: b */
    public final List m31634b() {
        return this.f27277b;
    }

    /* JADX INFO: renamed from: c */
    public final double m31635c() {
        return this.f27278c;
    }

    /* JADX INFO: renamed from: d */
    public final String m31636d() {
        return this.f27276a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8156l)) {
            return false;
        }
        C8156l c8156l = (C8156l) obj;
        return AbstractC1061t.m3842c(this.f27276a, c8156l.f27276a) && AbstractC1061t.m3842c(this.f27277b, c8156l.f27277b);
    }

    public int hashCode() {
        return (this.f27276a.hashCode() * 31) + this.f27277b.hashCode();
    }

    public String toString() {
        return "HeaderValue(value=" + this.f27276a + ", params=" + this.f27277b + ')';
    }
}
