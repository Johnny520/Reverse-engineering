package p029F0;

import p041H0.AbstractC0582a0;
import p112W2.InterfaceC1604f;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: F0.w */
/* JADX INFO: loaded from: classes.dex */
final class C0432w extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1604f f1305a;

    public C0432w(InterfaceC1604f interfaceC1604f) {
        this.f1305a = interfaceC1604f;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C0434y c0434y = new C0434y();
        c0434y.f1306r = this.f1305a;
        return c0434y;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0432w) {
            return this.f1305a == ((C0432w) obj).f1305a;
        }
        return false;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        ((C0434y) abstractC2206o).f1306r = this.f1305a;
    }

    public final int hashCode() {
        return this.f1305a.hashCode();
    }
}
