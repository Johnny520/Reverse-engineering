package p216p;

import p011B4.AbstractC0231b;
import p041H0.AbstractC0582a0;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;
import p227r.C2996k;
import p227r.EnumC2983d0;
import p227r.InterfaceC3017u0;
import p232s.C3162i;

/* JADX INFO: renamed from: p.i0 */
/* JADX INFO: loaded from: classes.dex */
final class C2850i0 extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3017u0 f8965a;

    /* JADX INFO: renamed from: b */
    public final EnumC2983d0 f8966b;

    /* JADX INFO: renamed from: c */
    public final boolean f8967c;

    /* JADX INFO: renamed from: d */
    public final C2996k f8968d;

    /* JADX INFO: renamed from: e */
    public final C3162i f8969e;

    /* JADX INFO: renamed from: f */
    public final boolean f8970f;

    /* JADX INFO: renamed from: g */
    public final C2847h f8971g;

    public C2850i0(C2847h c2847h, C2996k c2996k, EnumC2983d0 enumC2983d0, InterfaceC3017u0 interfaceC3017u0, C3162i c3162i, boolean z5, boolean z6) {
        this.f8965a = interfaceC3017u0;
        this.f8966b = enumC2983d0;
        this.f8967c = z5;
        this.f8968d = c2996k;
        this.f8969e = c3162i;
        this.f8970f = z6;
        this.f8971g = c2847h;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C2852j0 c2852j0 = new C2852j0();
        c2852j0.f8978t = this.f8965a;
        c2852j0.f8979u = this.f8966b;
        c2852j0.f8980v = this.f8967c;
        c2852j0.f8981w = this.f8968d;
        c2852j0.f8982x = this.f8969e;
        c2852j0.f8983y = this.f8970f;
        c2852j0.f8984z = this.f8971g;
        return c2852j0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2850i0.class != obj.getClass()) {
            return false;
        }
        C2850i0 c2850i0 = (C2850i0) obj;
        return AbstractC1665j.m2981a(this.f8965a, c2850i0.f8965a) && this.f8966b == c2850i0.f8966b && this.f8967c == c2850i0.f8967c && AbstractC1665j.m2981a(this.f8968d, c2850i0.f8968d) && AbstractC1665j.m2981a(this.f8969e, c2850i0.f8969e) && this.f8970f == c2850i0.f8970f && AbstractC1665j.m2981a(this.f8971g, c2850i0.f8971g);
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) throws ClassNotFoundException {
        ((C2852j0) abstractC2206o).m5043O0(this.f8971g, this.f8968d, this.f8966b, this.f8965a, this.f8969e, this.f8970f, this.f8967c);
    }

    public final int hashCode() {
        int iM395f = AbstractC0231b.m395f(AbstractC0231b.m395f((this.f8966b.hashCode() + (this.f8965a.hashCode() * 31)) * 31, 31, this.f8967c), 31, false);
        C2996k c2996k = this.f8968d;
        int iHashCode = (iM395f + (c2996k != null ? c2996k.hashCode() : 0)) * 31;
        C3162i c3162i = this.f8969e;
        int iM395f2 = AbstractC0231b.m395f((iHashCode + (c3162i != null ? c3162i.hashCode() : 0)) * 961, 31, this.f8970f);
        C2847h c2847h = this.f8971g;
        return iM395f2 + (c2847h != null ? c2847h.hashCode() : 0);
    }
}
