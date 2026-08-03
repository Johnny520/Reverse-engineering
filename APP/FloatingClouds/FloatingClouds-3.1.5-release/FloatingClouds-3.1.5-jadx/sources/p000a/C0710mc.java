package p000a;

import java.io.Serializable;

/* JADX INFO: renamed from: a.mc */
/* JADX INFO: loaded from: classes.dex */
public final class C0710mc<A, B> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final A f2680a;

    /* JADX INFO: renamed from: b */
    public final B f2681b;

    public C0710mc(A a2, B b) {
        this.f2680a = a2;
        this.f2681b = b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0710mc)) {
            return false;
        }
        C0710mc c0710mc = (C0710mc) obj;
        return C0631i9.m1478a(this.f2680a, c0710mc.f2680a) && C0631i9.m1478a(this.f2681b, c0710mc.f2681b);
    }

    public final int hashCode() {
        A a2 = this.f2680a;
        int iHashCode = (a2 == null ? 0 : a2.hashCode()) * 31;
        B b = this.f2681b;
        return iHashCode + (b != null ? b.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f2680a + ", " + this.f2681b + ')';
    }
}
