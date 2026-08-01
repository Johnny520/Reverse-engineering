package p227r;

import p011B4.AbstractC0231b;
import p041H0.AbstractC0582a0;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: r.j0 */
/* JADX INFO: loaded from: classes.dex */
final class C2995j0 extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3017u0 f9486a;

    /* JADX INFO: renamed from: b */
    public final EnumC2983d0 f9487b;

    /* JADX INFO: renamed from: c */
    public final boolean f9488c;

    /* JADX INFO: renamed from: d */
    public final boolean f9489d;

    public C2995j0(InterfaceC3017u0 interfaceC3017u0, EnumC2983d0 enumC2983d0, boolean z5, boolean z6) {
        this.f9486a = interfaceC3017u0;
        this.f9487b = enumC2983d0;
        this.f9488c = z5;
        this.f9489d = z6;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        return new C3015t0(null, null, this.f9487b, this.f9486a, null, this.f9488c, this.f9489d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2995j0)) {
            return false;
        }
        C2995j0 c2995j0 = (C2995j0) obj;
        return AbstractC1665j.m2981a(this.f9486a, c2995j0.f9486a) && this.f9487b == c2995j0.f9487b && this.f9488c == c2995j0.f9488c && this.f9489d == c2995j0.f9489d;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        ((C3015t0) abstractC2206o).m5223a1(null, null, this.f9487b, this.f9486a, null, this.f9488c, this.f9489d);
    }

    public final int hashCode() {
        return AbstractC0231b.m395f(AbstractC0231b.m395f((this.f9487b.hashCode() + (this.f9486a.hashCode() * 31)) * 961, 31, this.f9488c), 29791, this.f9489d);
    }
}
