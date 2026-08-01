package p244u;

import p041H0.AbstractC0582a0;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: u.G */
/* JADX INFO: loaded from: classes.dex */
final class C3238G extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3276j0 f10031a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3238G(InterfaceC3276j0 interfaceC3276j0) {
        this.f10031a = interfaceC3276j0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        return new C3239H(this.f10031a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3238G) {
            return AbstractC1665j.m2981a(((C3238G) obj).f10031a, this.f10031a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C3239H c3239h = (C3239H) abstractC2206o;
        InterfaceC3276j0 interfaceC3276j0 = c3239h.f10034t;
        InterfaceC3276j0 interfaceC3276j02 = this.f10031a;
        if (AbstractC1665j.m2981a(interfaceC3276j02, interfaceC3276j0)) {
            return;
        }
        c3239h.f10034t = interfaceC3276j02;
        c3239h.m5498J0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10031a.hashCode();
    }
}
