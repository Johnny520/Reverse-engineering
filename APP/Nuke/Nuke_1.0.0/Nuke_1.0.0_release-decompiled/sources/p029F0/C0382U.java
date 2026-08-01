package p029F0;

import p041H0.AbstractC0582a0;
import p112W2.InterfaceC1601c;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: F0.U */
/* JADX INFO: loaded from: classes.dex */
final class C0382U extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1601c f1196a;

    public C0382U(InterfaceC1601c interfaceC1601c) {
        this.f1196a = interfaceC1601c;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C0383V c0383v = new C0383V();
        c0383v.f1197r = this.f1196a;
        return c0383v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0382U) {
            return this.f1196a == ((C0382U) obj).f1196a;
        }
        return false;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        ((C0383V) abstractC2206o).f1197r = this.f1196a;
    }

    public final int hashCode() {
        return this.f1196a.hashCode();
    }
}
