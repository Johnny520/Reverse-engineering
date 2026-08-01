package p029F0;

import p041H0.AbstractC0582a0;
import p112W2.InterfaceC1601c;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: F0.W */
/* JADX INFO: loaded from: classes.dex */
final class C0384W extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1601c f1198a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0384W(InterfaceC1601c interfaceC1601c) {
        this.f1198a = interfaceC1601c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C0385X c0385x = new C0385X();
        c0385x.f1199r = this.f1198a;
        long j5 = Integer.MIN_VALUE;
        c0385x.f1200s = (j5 & 4294967295L) | (j5 << 32);
        return c0385x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0384W) {
            return this.f1198a == ((C0384W) obj).f1198a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C0385X c0385x = (C0385X) abstractC2206o;
        c0385x.f1199r = this.f1198a;
        long j5 = Integer.MIN_VALUE;
        c0385x.f1200s = (j5 & 4294967295L) | (j5 << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1198a.hashCode();
    }
}
