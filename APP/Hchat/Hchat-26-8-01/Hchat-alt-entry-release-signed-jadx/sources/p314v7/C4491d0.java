package p314v7;

import bsh.C0353j;
import p152k7.AbstractC2331a;
import p166l7.C2518f;
import p166l7.InterfaceC2519g;
import p241q7.C3445b;

/* JADX INFO: renamed from: v7.d0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4491d0 extends AbstractC4503j0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p314v7.AbstractC4503j0, p257r7.AbstractC3712b, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) {
        boolean zM5538q = AbstractC2331a.m5538q(m8932Y().f12076k, 2, 3);
        m7715M(zM5538q ? 0 : 8, false);
        if (zM5538q) {
            return;
        }
        super.mo1893B(c3445b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p314v7.AbstractC4503j0
    /* JADX INFO: renamed from: O */
    public final int mo8928O() {
        return AbstractC2331a.m5538q(m8932Y().f12076k, 2, 3) ? AbstractC2331a.m5539s(m8932Y().f12076k, 4) : super.mo8928O();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p314v7.AbstractC4503j0
    /* JADX INFO: renamed from: P */
    public final InterfaceC2519g mo6172P() {
        C4490d c4490d = (C4490d) m5553u(C4490d.class);
        if (c4490d != null) {
            return (C2518f) c4490d.m5553u(C2518f.class);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p314v7.AbstractC4503j0
    /* JADX INFO: renamed from: Q */
    public final int mo8929Q() {
        if (AbstractC2331a.m5538q(m8932Y().f12076k, 2, 3)) {
            return 0;
        }
        return super.mo8929Q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p314v7.AbstractC4503j0
    /* JADX INFO: renamed from: R */
    public final byte mo8930R() {
        return AbstractC2331a.m5538q(m8932Y().f12076k, 2, 3) ? m8932Y().f12076k[3] : super.mo8930R();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p314v7.AbstractC4503j0
    /* JADX INFO: renamed from: X */
    public final void mo8931X(int i9) {
        if (AbstractC2331a.m5538q(m8932Y().f12076k, 2, 3)) {
            AbstractC2331a.m5534D(m8932Y().f12076k, 4, i9);
        } else {
            super.mo8931X(i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public final C4492e m8932Y() {
        C4487b0 c4487b0 = (C4487b0) m5553u(C4487b0.class);
        if (c4487b0 != null) {
            return (C4492e) c4487b0.f14849k;
        }
        C0353j.m1309g("Unreachable");
        return null;
    }
}
