package p028c1;

import gg.AbstractC1416l;
import p057e1.C0810e;
import p068eh.AbstractC0921a;
import p071f1.C1017n;
import p146k1.AbstractC2233b;
import p308v1.C4427s0;
import p339x1.AbstractC5618k;
import p339x1.AbstractC5658x0;
import p356y0.AbstractC5852n;
import p356y0.InterfaceC5841c;

/* JADX INFO: renamed from: c1.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class C0383m extends AbstractC5658x0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2233b f1061a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5841c f1062b;

    /* JADX INFO: renamed from: c */
    public final C4427s0 f1063c;

    /* JADX INFO: renamed from: d */
    public final float f1064d;

    /* JADX INFO: renamed from: e */
    public final C1017n f1065e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0383m(AbstractC2233b abstractC2233b, InterfaceC5841c interfaceC5841c, C4427s0 c4427s0, float f3, C1017n c1017n) {
        this.f1061a = abstractC2233b;
        this.f1062b = interfaceC5841c;
        this.f1063c = c4427s0;
        this.f1064d = f3;
        this.f1065e = c1017n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0383m)) {
            return false;
        }
        C0383m c0383m = (C0383m) obj;
        return AbstractC1416l.m3825a(this.f1061a, c0383m.f1061a) && AbstractC1416l.m3825a(this.f1062b, c0383m.f1062b) && AbstractC1416l.m3825a(this.f1063c, c0383m.f1063c) && Float.compare(this.f1064d, c0383m.f1064d) == 0 && AbstractC1416l.m3825a(this.f1065e, c0383m.f1065e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: f */
    public final AbstractC5852n mo740f() {
        C0385o c0385o = new C0385o();
        c0385o.f1068u = this.f1061a;
        c0385o.f1069v = true;
        c0385o.f1070w = this.f1062b;
        c0385o.f1071x = this.f1063c;
        c0385o.f1072y = this.f1064d;
        c0385o.f1073z = this.f1065e;
        return c0385o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5658x0
    /* JADX INFO: renamed from: g */
    public final void mo741g(AbstractC5852n abstractC5852n) {
        C0385o c0385o = (C0385o) abstractC5852n;
        boolean z9 = c0385o.f1069v;
        AbstractC2233b abstractC2233b = this.f1061a;
        boolean z10 = (z9 && C0810e.m2054a(c0385o.f1068u.mo5469d(), abstractC2233b.mo5469d())) ? false : true;
        c0385o.f1068u = abstractC2233b;
        c0385o.f1069v = true;
        c0385o.f1070w = this.f1062b;
        c0385o.f1071x = this.f1063c;
        c0385o.f1072y = this.f1064d;
        c0385o.f1073z = this.f1065e;
        if (z10) {
            AbstractC5618k.m10157m(c0385o);
        }
        AbstractC5618k.m10156l(c0385o);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2241d = AbstractC0921a.m2241d(this.f1064d, (this.f1063c.hashCode() + ((this.f1062b.hashCode() + AbstractC0921a.m2245h(this.f1061a.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        C1017n c1017n = this.f1065e;
        return iM2241d + (c1017n == null ? 0 : c1017n.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PainterElement(painter=" + this.f1061a + ", sizeToIntrinsics=true, alignment=" + this.f1062b + ", contentScale=" + this.f1063c + ", alpha=" + this.f1064d + ", colorFilter=" + this.f1065e + ')';
    }
}
