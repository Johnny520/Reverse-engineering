package p046I;

import p041H0.AbstractC0582a0;
import p112W2.InterfaceC1599a;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: I.a */
/* JADX INFO: loaded from: classes.dex */
final class C0654a extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1599a f2073a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0654a(InterfaceC1599a interfaceC1599a) {
        this.f2073a = interfaceC1599a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        return new C0657d(this.f2073a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0654a) {
            return this.f2073a == ((C0654a) obj).f2073a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        ((C0657d) abstractC2206o).f2081t = this.f2073a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2073a.hashCode();
    }
}
