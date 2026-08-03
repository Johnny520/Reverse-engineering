package p028c1;

import gg.AbstractC1416l;
import p016b1.C0166f;
import p068eh.AbstractC0921a;
import p071f1.C1023q;
import p071f1.C1034w;
import p071f1.InterfaceC1026r0;
import p158l.AbstractC2415f;
import p293u2.C4236f;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5618k;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;

/* JADX INFO: renamed from: c1.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0386p extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1026r0 f1074a;

    /* JADX INFO: renamed from: b */
    public final boolean f1075b;

    /* JADX INFO: renamed from: c */
    public final long f1076c;

    /* JADX INFO: renamed from: d */
    public final long f1077d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0386p(InterfaceC1026r0 interfaceC1026r0, boolean z9, long j3, long j4) {
        float f3 = AbstractC2415f.f7894a;
        this.f1074a = interfaceC1026r0;
        this.f1075b = z9;
        this.f1076c = j3;
        this.f1077d = j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0386p)) {
            return false;
        }
        C0386p c0386p = (C0386p) obj;
        float f3 = AbstractC2415f.f7897d;
        return C4236f.m8520b(f3, f3) && AbstractC1416l.m3825a(this.f1074a, c0386p.f1074a) && this.f1075b == c0386p.f1075b && C1034w.m2635c(this.f1076c, c0386p.f1076c) && C1034w.m2635c(this.f1077d, c0386p.f1077d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        return new C1023q(new C0166f(this, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        AbstractC5614i1 abstractC5614i1;
        C1023q c1023q = (C1023q) abstractC5852n;
        C0166f c0166f = new C0166f(this, 2);
        c1023q.f3232u = c0166f;
        if (c1023q.f23788g.f23801t && (abstractC5614i1 = AbstractC5618k.m10164t(c1023q, 2).f22869v) != null) {
            abstractC5614i1.m10084Q1(c0166f, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2245h = AbstractC0921a.m2245h((this.f1074a.hashCode() + (Float.hashCode(AbstractC2415f.f7897d) * 31)) * 31, 31, this.f1075b);
        int i9 = C1034w.f3264h;
        return Long.hashCode(this.f1077d) + AbstractC0921a.m2243f(iM2245h, 31, this.f1076c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) C4236f.m8521c(AbstractC2415f.f7897d)) + ", shape=" + this.f1074a + ", clip=" + this.f1075b + ", ambientColor=" + ((Object) C1034w.m2641i(this.f1076c)) + ", spotColor=" + ((Object) C1034w.m2641i(this.f1077d)) + ')';
    }
}
