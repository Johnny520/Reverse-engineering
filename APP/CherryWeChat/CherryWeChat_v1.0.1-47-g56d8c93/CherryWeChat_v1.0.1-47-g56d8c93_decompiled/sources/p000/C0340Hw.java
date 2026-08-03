package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: Hw */
/* JADX INFO: loaded from: classes.dex */
public final class C0340Hw implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object f1148a;

    public /* synthetic */ C0340Hw(Object obj) {
        this.f1148a = obj;
    }

    /* JADX INFO: renamed from: a */
    public static final Throwable m726a(Object obj) {
        if (obj instanceof C0297Gw) {
            return ((C0297Gw) obj).f1010a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0340Hw) {
            return AbstractC0585Nj.m1134a(this.f1148a, ((C0340Hw) obj).f1148a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f1148a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f1148a;
        if (obj instanceof C0297Gw) {
            return ((C0297Gw) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
