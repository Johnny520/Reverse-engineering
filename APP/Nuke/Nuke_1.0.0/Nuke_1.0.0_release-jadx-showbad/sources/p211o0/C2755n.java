package p211o0;

import p041H0.AbstractC0582a0;
import p041H0.AbstractC0596h0;
import p041H0.AbstractC0601k;
import p112W2.InterfaceC1601c;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: o0.n */
/* JADX INFO: loaded from: classes.dex */
final class C2755n extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1601c f8749a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2755n(InterfaceC1601c interfaceC1601c) {
        this.f8749a = interfaceC1601c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        return new C2756o(this.f8749a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2755n) {
            return this.f8749a == ((C2755n) obj).f8749a;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        AbstractC0596h0 abstractC0596h0;
        C2756o c2756o = (C2756o) abstractC2206o;
        InterfaceC1601c interfaceC1601c = this.f8749a;
        c2756o.f8750r = interfaceC1601c;
        if (c2756o.f7186d.f7199q && (abstractC0596h0 = AbstractC0601k.m1042r(c2756o, 2).f1933s) != null) {
            abstractC0596h0.m1004p1(interfaceC1601c, true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f8749a.hashCode();
    }
}
