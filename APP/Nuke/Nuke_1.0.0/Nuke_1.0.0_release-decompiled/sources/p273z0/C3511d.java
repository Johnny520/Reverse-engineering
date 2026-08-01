package p273z0;

import p041H0.AbstractC0582a0;
import p112W2.InterfaceC1601c;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: z0.d */
/* JADX INFO: loaded from: classes.dex */
final class C3511d extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1601c f10952a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1601c f10953b;

    public C3511d(InterfaceC1601c interfaceC1601c, InterfaceC1601c interfaceC1601c2) {
        this.f10952a = interfaceC1601c;
        this.f10953b = interfaceC1601c2;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C3513f c3513f = new C3513f();
        c3513f.f10954r = this.f10952a;
        c3513f.f10955s = this.f10953b;
        return c3513f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3511d)) {
            return false;
        }
        C3511d c3511d = (C3511d) obj;
        return this.f10952a == c3511d.f10952a && this.f10953b == c3511d.f10953b;
    }

    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C3513f c3513f = (C3513f) abstractC2206o;
        c3513f.f10954r = this.f10952a;
        c3513f.f10955s = this.f10953b;
    }

    public final int hashCode() {
        InterfaceC1601c interfaceC1601c = this.f10952a;
        int iHashCode = (interfaceC1601c != null ? interfaceC1601c.hashCode() : 0) * 31;
        InterfaceC1601c interfaceC1601c2 = this.f10953b;
        return iHashCode + (interfaceC1601c2 != null ? interfaceC1601c2.hashCode() : 0);
    }
}
