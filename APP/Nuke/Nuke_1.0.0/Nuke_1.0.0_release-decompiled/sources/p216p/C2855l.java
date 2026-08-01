package p216p;

import p011B4.AbstractC0231b;
import p041H0.AbstractC0582a0;
import p041H0.AbstractC0601k;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;
import p211o0.AbstractC2758q;
import p211o0.C2729D;
import p211o0.C2762u;
import p211o0.InterfaceC2738M;

/* JADX INFO: renamed from: p.l */
/* JADX INFO: loaded from: classes.dex */
final class C2855l extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final long f8986a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2758q f8987b;

    /* JADX INFO: renamed from: c */
    public final float f8988c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2738M f8989d;

    public C2855l(long j5, C2729D c2729d, InterfaceC2738M interfaceC2738M, int i5) {
        j5 = (i5 & 1) != 0 ? C2762u.f8762g : j5;
        c2729d = (i5 & 2) != 0 ? null : c2729d;
        this.f8986a = j5;
        this.f8987b = c2729d;
        this.f8988c = 1.0f;
        this.f8989d = interfaceC2738M;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C2857n c2857n = new C2857n();
        c2857n.f8990r = this.f8986a;
        c2857n.f8991s = this.f8987b;
        c2857n.f8992t = this.f8988c;
        c2857n.f8993u = this.f8989d;
        c2857n.f8994v = 9205357640488583168L;
        return c2857n;
    }

    public final boolean equals(Object obj) {
        C2855l c2855l = obj instanceof C2855l ? (C2855l) obj : null;
        return c2855l != null && C2762u.m4921c(this.f8986a, c2855l.f8986a) && AbstractC1665j.m2981a(this.f8987b, c2855l.f8987b) && this.f8988c == c2855l.f8988c && AbstractC1665j.m2981a(this.f8989d, c2855l.f8989d);
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C2857n c2857n = (C2857n) abstractC2206o;
        c2857n.f8990r = this.f8986a;
        c2857n.f8991s = this.f8987b;
        c2857n.f8992t = this.f8988c;
        InterfaceC2738M interfaceC2738M = c2857n.f8993u;
        InterfaceC2738M interfaceC2738M2 = this.f8989d;
        if (!AbstractC1665j.m2981a(interfaceC2738M, interfaceC2738M2)) {
            c2857n.f8993u = interfaceC2738M2;
            AbstractC0601k.m1036l(c2857n);
        }
        AbstractC0601k.m1034j(c2857n);
    }

    public final int hashCode() {
        int i5 = C2762u.f8763h;
        int iHashCode = Long.hashCode(this.f8986a) * 31;
        AbstractC2758q abstractC2758q = this.f8987b;
        return this.f8989d.hashCode() + AbstractC0231b.m390a(this.f8988c, (iHashCode + (abstractC2758q != null ? abstractC2758q.hashCode() : 0)) * 31, 31);
    }
}
