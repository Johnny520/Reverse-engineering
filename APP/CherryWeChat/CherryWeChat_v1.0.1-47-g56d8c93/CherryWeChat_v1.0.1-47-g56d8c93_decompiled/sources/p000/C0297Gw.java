package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: Gw */
/* JADX INFO: loaded from: classes.dex */
public final class C0297Gw implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Throwable f1010a;

    public C0297Gw(Throwable th) {
        this.f1010a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0297Gw) {
            return AbstractC0585Nj.m1134a(this.f1010a, ((C0297Gw) obj).f1010a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1010a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f1010a + ')';
    }
}
