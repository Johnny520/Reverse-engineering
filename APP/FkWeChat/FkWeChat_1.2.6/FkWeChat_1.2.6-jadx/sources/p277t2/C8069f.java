package p277t2;

import p010a9.InterfaceC0184l;
import p165l1.InterfaceC4507m;
import p166l2.InterfaceC4524b2;

/* JADX INFO: renamed from: t2.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8069f extends InterfaceC4507m.c implements InterfaceC4524b2 {

    /* JADX INFO: renamed from: F */
    public boolean f26945F;

    /* JADX INFO: renamed from: G */
    public boolean f26946G;

    /* JADX INFO: renamed from: H */
    public InterfaceC0184l f26947H;

    public C8069f(boolean z10, boolean z11, InterfaceC0184l interfaceC0184l) {
        this.f26945F = z10;
        this.f26946G = z11;
        this.f26947H = interfaceC0184l;
    }

    /* JADX INFO: renamed from: G2 */
    public final void m31070G2(boolean z10) {
        this.f26945F = z10;
    }

    @Override // p166l2.InterfaceC4524b2
    /* JADX INFO: renamed from: H0 */
    public boolean mo17542H0() {
        return this.f26946G;
    }

    /* JADX INFO: renamed from: H2 */
    public final void m31071H2(InterfaceC0184l interfaceC0184l) {
        this.f26947H = interfaceC0184l;
    }

    @Override // p166l2.InterfaceC4524b2
    /* JADX INFO: renamed from: R1 */
    public boolean mo17345R1() {
        return this.f26945F;
    }

    @Override // p166l2.InterfaceC4524b2
    /* JADX INFO: renamed from: z0 */
    public void mo1261z0(InterfaceC8074h0 interfaceC8074h0) {
        this.f26947H.mo27m(interfaceC8074h0);
    }
}
