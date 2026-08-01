package p058L;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: L.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0949u {

    /* JADX INFO: renamed from: a */
    public final C0948t f2984a;

    /* JADX INFO: renamed from: b */
    public final C0948t f2985b;

    /* JADX INFO: renamed from: c */
    public final boolean f2986c;

    public C0949u(C0948t c0948t, C0948t c0948t2, boolean z5) {
        this.f2984a = c0948t;
        this.f2985b = c0948t2;
        this.f2986c = z5;
    }

    /* JADX INFO: renamed from: a */
    public static C0949u m1954a(C0949u c0949u, C0948t c0948t, C0948t c0948t2, boolean z5, int i5) {
        if ((i5 & 1) != 0) {
            c0948t = c0949u.f2984a;
        }
        if ((i5 & 2) != 0) {
            c0948t2 = c0949u.f2985b;
        }
        c0949u.getClass();
        return new C0949u(c0948t, c0948t2, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0949u)) {
            return false;
        }
        C0949u c0949u = (C0949u) obj;
        return AbstractC1665j.m2981a(this.f2984a, c0949u.f2984a) && AbstractC1665j.m2981a(this.f2985b, c0949u.f2985b) && this.f2986c == c0949u.f2986c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2986c) + ((this.f2985b.hashCode() + (this.f2984a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.f2984a + ", end=" + this.f2985b + ", handlesCrossed=" + this.f2986c + ')';
    }
}
