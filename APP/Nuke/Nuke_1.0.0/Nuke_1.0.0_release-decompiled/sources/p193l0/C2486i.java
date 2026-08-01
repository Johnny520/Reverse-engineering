package p193l0;

import p041H0.AbstractC0582a0;
import p112W2.InterfaceC1601c;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: l0.i */
/* JADX INFO: loaded from: classes.dex */
final class C2486i extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1601c f7985a;

    public C2486i(InterfaceC1601c interfaceC1601c) {
        this.f7985a = interfaceC1601c;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        return new C2480c(new C2481d(), this.f7985a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2486i) {
            return this.f7985a == ((C2486i) obj).f7985a;
        }
        return false;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C2480c c2480c = (C2480c) abstractC2206o;
        c2480c.f7980t = this.f7985a;
        c2480c.m4425J0();
    }

    public final int hashCode() {
        return this.f7985a.hashCode();
    }
}
