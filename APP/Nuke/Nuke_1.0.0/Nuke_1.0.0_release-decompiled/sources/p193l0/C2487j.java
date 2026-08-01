package p193l0;

import p041H0.AbstractC0582a0;
import p112W2.InterfaceC1601c;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: l0.j */
/* JADX INFO: loaded from: classes.dex */
final class C2487j extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1601c f7986a;

    public C2487j(InterfaceC1601c interfaceC1601c) {
        this.f7986a = interfaceC1601c;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C2488k c2488k = new C2488k();
        c2488k.f7987r = this.f7986a;
        return c2488k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2487j) {
            return this.f7986a == ((C2487j) obj).f7986a;
        }
        return false;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        ((C2488k) abstractC2206o).f7987r = this.f7986a;
    }

    public final int hashCode() {
        return this.f7986a.hashCode();
    }
}
