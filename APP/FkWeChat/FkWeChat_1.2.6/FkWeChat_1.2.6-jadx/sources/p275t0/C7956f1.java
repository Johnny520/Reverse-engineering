package p275t0;

import p010a9.InterfaceC0184l;
import p165l1.InterfaceC4507m;
import p166l2.AbstractC4528c2;
import p166l2.InterfaceC4524b2;
import p166l2.InterfaceC4556j2;
import p277t2.InterfaceC8074h0;

/* JADX INFO: renamed from: t0.f1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7956f1 extends InterfaceC4507m.c implements InterfaceC4556j2, InterfaceC4524b2 {

    /* JADX INFO: renamed from: F */
    public InterfaceC0184l f26520F;

    /* JADX INFO: renamed from: G */
    public boolean f26521G;

    /* JADX INFO: renamed from: H */
    public final Object f26522H = C7964h1.f26531a;

    public C7956f1(InterfaceC0184l interfaceC0184l) {
        this.f26520F = interfaceC0184l;
    }

    /* JADX INFO: renamed from: G2 */
    public final void m30714G2(InterfaceC8074h0 interfaceC8074h0) {
        this.f26521G = true;
        this.f26520F.mo27m(interfaceC8074h0);
        AbstractC4528c2.m17573b(this);
    }

    /* JADX INFO: renamed from: H2 */
    public final void m30715H2() {
        this.f26521G = false;
        AbstractC4528c2.m17573b(this);
    }

    /* JADX INFO: renamed from: I2 */
    public final void m30716I2(InterfaceC0184l interfaceC0184l) {
        this.f26520F = interfaceC0184l;
    }

    @Override // p166l2.InterfaceC4524b2
    /* JADX INFO: renamed from: R1 */
    public boolean mo17345R1() {
        return true;
    }

    @Override // p166l2.InterfaceC4556j2
    /* JADX INFO: renamed from: T */
    public Object mo1308T() {
        return this.f26522H;
    }

    @Override // p166l2.InterfaceC4524b2
    /* JADX INFO: renamed from: z0 */
    public void mo1261z0(InterfaceC8074h0 interfaceC8074h0) {
        if (this.f26521G) {
            return;
        }
        this.f26520F.mo27m(interfaceC8074h0);
    }
}
