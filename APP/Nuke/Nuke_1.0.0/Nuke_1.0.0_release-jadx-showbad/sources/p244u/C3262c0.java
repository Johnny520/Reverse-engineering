package p244u;

import p000A.C0034R0;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0379Q;
import p041H0.AbstractC0572Q;
import p041H0.InterfaceC0627x;
import p061L2.C0982v;
import p153e1.AbstractC2006b;
import p153e1.C2005a;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: u.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3262c0 extends AbstractC2206o implements InterfaceC0627x {

    /* JADX INFO: renamed from: r */
    public float f10090r;

    /* JADX INFO: renamed from: s */
    public float f10091s;

    /* JADX INFO: renamed from: t */
    public float f10092t;

    /* JADX INFO: renamed from: u */
    public float f10093u;

    /* JADX INFO: renamed from: v */
    public boolean f10094v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX INFO: renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m5540J0(InterfaceC0379Q interfaceC0379Q) {
        int iMo270S;
        int iMo270S2;
        int iMo270S3;
        int i5 = 0;
        if (Float.isNaN(this.f10092t)) {
            iMo270S = Integer.MAX_VALUE;
        } else {
            iMo270S = interfaceC0379Q.mo270S(this.f10092t);
            if (iMo270S < 0) {
                iMo270S = 0;
            }
        }
        if (Float.isNaN(this.f10093u)) {
            iMo270S2 = Integer.MAX_VALUE;
        } else {
            iMo270S2 = interfaceC0379Q.mo270S(this.f10093u);
            if (iMo270S2 < 0) {
                iMo270S2 = 0;
            }
        }
        if (Float.isNaN(this.f10090r)) {
            iMo270S3 = 0;
        } else {
            iMo270S3 = interfaceC0379Q.mo270S(this.f10090r);
            if (iMo270S3 < 0) {
                iMo270S3 = 0;
            }
            if (iMo270S3 > iMo270S) {
                iMo270S3 = iMo270S;
            }
            if (iMo270S3 == Integer.MAX_VALUE) {
            }
        }
        if (!Float.isNaN(this.f10091s)) {
            int iMo270S4 = interfaceC0379Q.mo270S(this.f10091s);
            if (iMo270S4 < 0) {
                iMo270S4 = 0;
            }
            if (iMo270S4 > iMo270S2) {
                iMo270S4 = iMo270S2;
            }
            if (iMo270S4 != Integer.MAX_VALUE) {
                i5 = iMo270S4;
            }
        }
        return AbstractC2006b.m3684a(iMo270S3, iMo270S, i5, iMo270S2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: T */
    public final int mo941T(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        long jM5540J0 = m5540J0(abstractC0572Q);
        if (C2005a.m3677e(jM5540J0)) {
            return C2005a.m3679g(jM5540J0);
        }
        if (!this.f10094v) {
            i5 = AbstractC2006b.m3690g(jM5540J0, i5);
        }
        return AbstractC2006b.m3689f(jM5540J0, interfaceC0376N.mo649f(i5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: d */
    public final InterfaceC0378P mo687d(InterfaceC0379Q interfaceC0379Q, InterfaceC0376N interfaceC0376N, long j5) {
        int iM3682j;
        int iM3680h;
        int iM3681i;
        int iM3679g;
        long jM3684a;
        long jM5540J0 = m5540J0(interfaceC0379Q);
        if (this.f10094v) {
            jM3684a = AbstractC2006b.m3688e(j5, jM5540J0);
        } else {
            if (Float.isNaN(this.f10090r)) {
                iM3682j = C2005a.m3682j(j5);
                int iM3680h2 = C2005a.m3680h(jM5540J0);
                if (iM3682j > iM3680h2) {
                    iM3682j = iM3680h2;
                }
            } else {
                iM3682j = C2005a.m3682j(jM5540J0);
            }
            if (Float.isNaN(this.f10092t)) {
                iM3680h = C2005a.m3680h(j5);
                int iM3682j2 = C2005a.m3682j(jM5540J0);
                if (iM3680h < iM3682j2) {
                    iM3680h = iM3682j2;
                }
            } else {
                iM3680h = C2005a.m3680h(jM5540J0);
            }
            if (Float.isNaN(this.f10091s)) {
                iM3681i = C2005a.m3681i(j5);
                int iM3679g2 = C2005a.m3679g(jM5540J0);
                if (iM3681i > iM3679g2) {
                    iM3681i = iM3679g2;
                }
            } else {
                iM3681i = C2005a.m3681i(jM5540J0);
            }
            if (Float.isNaN(this.f10093u)) {
                iM3679g = C2005a.m3679g(j5);
                int iM3681i2 = C2005a.m3681i(jM5540J0);
                if (iM3679g < iM3681i2) {
                    iM3679g = iM3681i2;
                }
            } else {
                iM3679g = C2005a.m3679g(jM5540J0);
            }
            jM3684a = AbstractC2006b.m3684a(iM3682j, iM3680h, iM3681i, iM3679g);
        }
        AbstractC0391b0 abstractC0391b0Mo648e = interfaceC0376N.mo648e(jM3684a);
        return interfaceC0379Q.mo604f0(abstractC0391b0Mo648e.f1206d, abstractC0391b0Mo648e.f1207e, C0982v.f3048d, new C0034R0(abstractC0391b0Mo648e, 5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: j */
    public final int mo948j(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        long jM5540J0 = m5540J0(abstractC0572Q);
        if (C2005a.m3678f(jM5540J0)) {
            return C2005a.m3680h(jM5540J0);
        }
        if (!this.f10094v) {
            i5 = AbstractC2006b.m3689f(jM5540J0, i5);
        }
        return AbstractC2006b.m3690g(jM5540J0, interfaceC0376N.mo645T(i5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: l0 */
    public final int mo949l0(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        long jM5540J0 = m5540J0(abstractC0572Q);
        if (C2005a.m3677e(jM5540J0)) {
            return C2005a.m3679g(jM5540J0);
        }
        if (!this.f10094v) {
            i5 = AbstractC2006b.m3690g(jM5540J0, i5);
        }
        return AbstractC2006b.m3689f(jM5540J0, interfaceC0376N.mo647Z(i5));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.InterfaceC0627x
    /* JADX INFO: renamed from: w0 */
    public final int mo954w0(AbstractC0572Q abstractC0572Q, InterfaceC0376N interfaceC0376N, int i5) {
        long jM5540J0 = m5540J0(abstractC0572Q);
        if (C2005a.m3678f(jM5540J0)) {
            return C2005a.m3680h(jM5540J0);
        }
        if (!this.f10094v) {
            i5 = AbstractC2006b.m3689f(jM5540J0, i5);
        }
        return AbstractC2006b.m3690g(jM5540J0, interfaceC0376N.mo646X(i5));
    }
}
