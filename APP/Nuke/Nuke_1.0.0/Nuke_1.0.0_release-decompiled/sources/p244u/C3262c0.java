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

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX INFO: renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m5540J0(p029F0.InterfaceC0379Q r7) {
        /*
            r6 = this;
            float r0 = r6.f10092t
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.f10092t
            int r0 = r7.mo270S(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.f10093u
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.f10093u
            int r3 = r7.mo270S(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.f10090r
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.f10090r
            int r4 = r7.mo270S(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 == r1) goto L41
            goto L42
        L41:
            r4 = r2
        L42:
            float r5 = r6.f10091s
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r5 = r6.f10091s
            int r7 = r7.mo270S(r5)
            if (r7 >= 0) goto L53
            r7 = r2
        L53:
            if (r7 <= r3) goto L56
            r7 = r3
        L56:
            if (r7 == r1) goto L59
            r2 = r7
        L59:
            long r0 = p153e1.AbstractC2006b.m3684a(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p244u.C3262c0.m5540J0(F0.Q):long");
    }

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
