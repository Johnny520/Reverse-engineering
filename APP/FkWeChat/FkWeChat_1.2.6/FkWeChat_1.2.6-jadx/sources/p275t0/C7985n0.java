package p275t0;

import p010a9.InterfaceC0184l;
import p165l1.InterfaceC4507m;
import p166l2.AbstractC4560k2;
import p166l2.InterfaceC4524b2;
import p166l2.InterfaceC4556j2;
import p277t2.InterfaceC8074h0;

/* JADX INFO: renamed from: t0.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7985n0 extends InterfaceC4507m.c implements InterfaceC4524b2 {

    /* JADX INFO: renamed from: F */
    public InterfaceC0184l f26557F;

    public C7985n0(InterfaceC0184l interfaceC0184l) {
        this.f26557F = interfaceC0184l;
    }

    /* JADX INFO: renamed from: G2 */
    public static boolean m30752G2(InterfaceC8074h0 interfaceC8074h0, InterfaceC4556j2 interfaceC4556j2) {
        interfaceC4556j2.getClass();
        ((C7956f1) interfaceC4556j2).m30714G2(interfaceC8074h0);
        return false;
    }

    /* JADX INFO: renamed from: H2 */
    public static boolean m30753H2(InterfaceC4556j2 interfaceC4556j2) {
        interfaceC4556j2.getClass();
        ((C7956f1) interfaceC4556j2).m30715H2();
        return false;
    }

    /* JADX INFO: renamed from: I2 */
    public final void m30754I2(InterfaceC0184l interfaceC0184l) {
        this.f26557F = interfaceC0184l;
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: q2 */
    public void mo1378q2() {
        super.mo1378q2();
        AbstractC4560k2.m18021c(this, C7964h1.f26531a, new InterfaceC0184l() { // from class: t0.m0
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(C7985n0.m30753H2((InterfaceC4556j2) obj));
            }
        });
    }

    @Override // p166l2.InterfaceC4524b2
    /* JADX INFO: renamed from: z0 */
    public void mo1261z0(final InterfaceC8074h0 interfaceC8074h0) {
        AbstractC4560k2.m18021c(this, C7964h1.f26531a, new InterfaceC0184l() { // from class: t0.l0
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(C7985n0.m30752G2(interfaceC8074h0, (InterfaceC4556j2) obj));
            }
        });
        this.f26557F.mo27m(interfaceC8074h0);
    }
}
