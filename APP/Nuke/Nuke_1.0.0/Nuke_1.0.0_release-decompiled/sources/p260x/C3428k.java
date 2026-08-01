package p260x;

import p011B4.AbstractC0231b;
import p041H0.AbstractC0582a0;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;
import p227r.C2976a;
import p227r.EnumC2983d0;
import p255w.C3374e;

/* JADX INFO: renamed from: x.k */
/* JADX INFO: loaded from: classes.dex */
final class C3428k extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C3374e f10711a;

    /* JADX INFO: renamed from: b */
    public final C2976a f10712b;

    /* JADX INFO: renamed from: c */
    public final EnumC2983d0 f10713c;

    public C3428k(C3374e c3374e, C2976a c2976a, EnumC2983d0 enumC2983d0) {
        this.f10711a = c3374e;
        this.f10712b = c2976a;
        this.f10713c = enumC2983d0;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C3432o c3432o = new C3432o();
        c3432o.f10719r = this.f10711a;
        c3432o.f10720s = this.f10712b;
        c3432o.f10721t = this.f10713c;
        return c3432o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3428k)) {
            return false;
        }
        C3428k c3428k = (C3428k) obj;
        return AbstractC1665j.m2981a(this.f10711a, c3428k.f10711a) && AbstractC1665j.m2981a(this.f10712b, c3428k.f10712b) && this.f10713c == c3428k.f10713c;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C3432o c3432o = (C3432o) abstractC2206o;
        c3432o.f10719r = this.f10711a;
        c3432o.f10720s = this.f10712b;
        c3432o.f10721t = this.f10713c;
    }

    public final int hashCode() {
        return this.f10713c.hashCode() + AbstractC0231b.m395f((this.f10712b.hashCode() + (this.f10711a.hashCode() * 31)) * 31, 31, false);
    }
}
