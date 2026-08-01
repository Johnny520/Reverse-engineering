package p076P;

import p000A.C0066i0;
import p011B4.AbstractC0231b;
import p041H0.InterfaceC0597i;
import p153e1.C2010f;
import p211o0.C2762u;
import p216p.InterfaceC2819L;
import p232s.C3162i;

/* JADX INFO: renamed from: P.V */
/* JADX INFO: loaded from: classes.dex */
public final class C1075V implements InterfaceC2819L {

    /* JADX INFO: renamed from: a */
    public final boolean f3344a;

    /* JADX INFO: renamed from: b */
    public final long f3345b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1075V(long j5, boolean z5) {
        this.f3344a = z5;
        this.f3345b = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p216p.InterfaceC2819L
    /* JADX INFO: renamed from: a */
    public final InterfaceC0597i mo2139a(C3162i c3162i) {
        return new C1111x(c3162i, this.f3344a, new C0066i0(14, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1075V)) {
            return false;
        }
        C1075V c1075v = (C1075V) obj;
        if (this.f3344a == c1075v.f3344a && C2010f.m3696b(Float.NaN, Float.NaN)) {
            return C2762u.m4921c(this.f3345b, c1075v.f3345b);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p216p.InterfaceC2819L
    public final int hashCode() {
        int iM390a = AbstractC0231b.m390a(Float.NaN, Boolean.hashCode(this.f3344a) * 31, 961);
        int i5 = C2762u.f8763h;
        return Long.hashCode(this.f3345b) + iM390a;
    }
}
