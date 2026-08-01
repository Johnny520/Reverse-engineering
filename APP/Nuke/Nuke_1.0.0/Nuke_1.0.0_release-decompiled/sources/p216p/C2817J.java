package p216p;

import p041H0.AbstractC0582a0;
import p041H0.InterfaceC0597i;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;
import p232s.C3162i;

/* JADX INFO: renamed from: p.J */
/* JADX INFO: loaded from: classes.dex */
final class C2817J extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C3162i f8870a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2819L f8871b;

    public C2817J(C3162i c3162i, InterfaceC2819L interfaceC2819L) {
        this.f8870a = c3162i;
        this.f8871b = interfaceC2819L;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        InterfaceC0597i interfaceC0597iMo2139a = this.f8871b.mo2139a(this.f8870a);
        C2818K c2818k = new C2818K();
        c2818k.f8872t = interfaceC0597iMo2139a;
        c2818k.m1021J0(interfaceC0597iMo2139a);
        return c2818k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2817J)) {
            return false;
        }
        C2817J c2817j = (C2817J) obj;
        return AbstractC1665j.m2981a(this.f8870a, c2817j.f8870a) && AbstractC1665j.m2981a(this.f8871b, c2817j.f8871b);
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) throws ClassNotFoundException {
        C2818K c2818k = (C2818K) abstractC2206o;
        InterfaceC0597i interfaceC0597iMo2139a = this.f8871b.mo2139a(this.f8870a);
        c2818k.m1022K0(c2818k.f8872t);
        c2818k.f8872t = interfaceC0597iMo2139a;
        c2818k.m1021J0(interfaceC0597iMo2139a);
    }

    public final int hashCode() {
        return this.f8871b.hashCode() + (this.f8870a.hashCode() * 31);
    }
}
