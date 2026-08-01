package p274t;

import p010a9.InterfaceC0184l;
import p121i3.C3185o;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p165l1.InterfaceC4507m;
import p166l2.AbstractC4546h0;
import p166l2.InterfaceC4534e0;
import p172l8.C4700i0;

/* JADX INFO: renamed from: t.g2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7837g2 extends InterfaceC4507m.c implements InterfaceC4534e0 {

    /* JADX INFO: renamed from: F */
    public InterfaceC0184l f26145F;

    /* JADX INFO: renamed from: G */
    public boolean f26146G;

    /* JADX INFO: renamed from: H */
    public final boolean f26147H;

    public C7837g2(InterfaceC0184l interfaceC0184l, boolean z10) {
        this.f26145F = interfaceC0184l;
        this.f26146G = z10;
    }

    /* JADX INFO: renamed from: G2 */
    public static C4700i0 m30366G2(C7837g2 c7837g2, AbstractC3545l1 abstractC3545l1, AbstractC3545l1.a aVar) {
        long jM12056p = ((C3185o) c7837g2.f26145F.mo27m(aVar)).m12056p();
        if (c7837g2.f26146G) {
            AbstractC3545l1.a.m13272T(aVar, abstractC3545l1, C3185o.m12049i(jM12056p), C3185o.m12050j(jM12056p), 0.0f, null, 12, null);
        } else {
            AbstractC3545l1.a.m13277g0(aVar, abstractC3545l1, C3185o.m12049i(jM12056p), C3185o.m12050j(jM12056p), 0.0f, null, 12, null);
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: H2 */
    public final void m30367H2(InterfaceC0184l interfaceC0184l, boolean z10) {
        if (this.f26145F != interfaceC0184l || this.f26146G != z10) {
            AbstractC4546h0.m17809c(this);
        }
        this.f26145F = interfaceC0184l;
        this.f26146G = z10;
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: d */
    public InterfaceC3558p0 mo1288d(InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10) {
        final AbstractC3545l1 abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(j10);
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, abstractC3545l1Mo13148X.m13264M0(), abstractC3545l1Mo13148X.m13259G0(), null, new InterfaceC0184l() { // from class: t.f2
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C7837g2.m30366G2(this.f26101q, abstractC3545l1Mo13148X, (AbstractC3545l1.a) obj);
            }
        }, 4, null);
    }

    @Override // p165l1.InterfaceC4507m.c
    /* JADX INFO: renamed from: k2 */
    public boolean mo1260k2() {
        return this.f26147H;
    }
}
