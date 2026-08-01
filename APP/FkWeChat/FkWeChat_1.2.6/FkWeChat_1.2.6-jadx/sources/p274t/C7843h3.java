package p274t;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p121i3.AbstractC3174d;
import p121i3.C3173c;
import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3552n0;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p135j2.InterfaceC3563r;
import p135j2.InterfaceC3566s;
import p165l1.InterfaceC4507m;
import p166l2.InterfaceC4534e0;
import p172l8.C4700i0;

/* JADX INFO: renamed from: t.h3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7843h3 extends InterfaceC4507m.c implements InterfaceC4534e0 {

    /* JADX INFO: renamed from: F */
    public float f26157F;

    /* JADX INFO: renamed from: G */
    public float f26158G;

    /* JADX INFO: renamed from: H */
    public float f26159H;

    /* JADX INFO: renamed from: I */
    public float f26160I;

    /* JADX INFO: renamed from: J */
    public boolean f26161J;

    public C7843h3(float f10, float f11, float f12, float f13, boolean z10) {
        this.f26157F = f10;
        this.f26158G = f11;
        this.f26159H = f12;
        this.f26160I = f13;
        this.f26161J = z10;
    }

    /* JADX INFO: renamed from: G2 */
    public static C4700i0 m30375G2(AbstractC3545l1 abstractC3545l1, AbstractC3545l1.a aVar) {
        AbstractC3545l1.a.m13270O(aVar, abstractC3545l1, 0, 0, 0.0f, 4, null);
        return C4700i0.f13910a;
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: G */
    public int mo15345G(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        long jM30376H2 = m30376H2(interfaceC3566s);
        if (C3173c.m11970i(jM30376H2)) {
            return C3173c.m11972k(jM30376H2);
        }
        if (!this.f26161J) {
            i10 = AbstractC3174d.m11990g(jM30376H2, i10);
        }
        return AbstractC3174d.m11989f(jM30376H2, interfaceC3563r.mo13151z0(i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX INFO: renamed from: H2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m30376H2(p121i3.InterfaceC3175e r7) {
        /*
            r6 = this;
            float r0 = r6.f26159H
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.f26159H
            int r0 = r7.mo1236x1(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.f26160I
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.f26160I
            int r3 = r7.mo1236x1(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.f26157F
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L41
            float r4 = r6.f26157F
            int r4 = r7.mo1236x1(r4)
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
            float r5 = r6.f26158G
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r5 = r6.f26158G
            int r7 = r7.mo1236x1(r5)
            if (r7 >= 0) goto L53
            r7 = r2
        L53:
            if (r7 <= r3) goto L56
            r7 = r3
        L56:
            if (r7 == r1) goto L59
            r2 = r7
        L59:
            long r0 = p121i3.AbstractC3174d.m11984a(r4, r0, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p274t.C7843h3.m30376H2(i3.e):long");
    }

    /* JADX INFO: renamed from: I2 */
    public final void m30377I2(boolean z10) {
        this.f26161J = z10;
    }

    /* JADX INFO: renamed from: J2 */
    public final void m30378J2(float f10) {
        this.f26160I = f10;
    }

    /* JADX INFO: renamed from: K2 */
    public final void m30379K2(float f10) {
        this.f26159H = f10;
    }

    /* JADX INFO: renamed from: L2 */
    public final void m30380L2(float f10) {
        this.f26158G = f10;
    }

    /* JADX INFO: renamed from: M2 */
    public final void m30381M2(float f10) {
        this.f26157F = f10;
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: d */
    public InterfaceC3558p0 mo1288d(InterfaceC3561q0 interfaceC3561q0, InterfaceC3552n0 interfaceC3552n0, long j10) {
        int iM11975n;
        int iM11973l;
        int iM11974m;
        int iM11972k;
        long jM11984a;
        long jM30376H2 = m30376H2(interfaceC3561q0);
        if (this.f26161J) {
            jM11984a = AbstractC3174d.m11988e(j10, jM30376H2);
        } else {
            if (Float.isNaN(this.f26157F)) {
                iM11975n = C3173c.m11975n(j10);
                int iM11973l2 = C3173c.m11973l(jM30376H2);
                if (iM11975n > iM11973l2) {
                    iM11975n = iM11973l2;
                }
            } else {
                iM11975n = C3173c.m11975n(jM30376H2);
            }
            if (Float.isNaN(this.f26159H)) {
                iM11973l = C3173c.m11973l(j10);
                int iM11975n2 = C3173c.m11975n(jM30376H2);
                if (iM11973l < iM11975n2) {
                    iM11973l = iM11975n2;
                }
            } else {
                iM11973l = C3173c.m11973l(jM30376H2);
            }
            if (Float.isNaN(this.f26158G)) {
                iM11974m = C3173c.m11974m(j10);
                int iM11972k2 = C3173c.m11972k(jM30376H2);
                if (iM11974m > iM11972k2) {
                    iM11974m = iM11972k2;
                }
            } else {
                iM11974m = C3173c.m11974m(jM30376H2);
            }
            if (Float.isNaN(this.f26160I)) {
                iM11972k = C3173c.m11972k(j10);
                int iM11974m2 = C3173c.m11974m(jM30376H2);
                if (iM11972k < iM11974m2) {
                    iM11972k = iM11974m2;
                }
            } else {
                iM11972k = C3173c.m11972k(jM30376H2);
            }
            jM11984a = AbstractC3174d.m11984a(iM11975n, iM11973l, iM11974m, iM11972k);
        }
        final AbstractC3545l1 abstractC3545l1Mo13148X = interfaceC3552n0.mo13148X(jM11984a);
        return InterfaceC3561q0.m13345n0(interfaceC3561q0, abstractC3545l1Mo13148X.m13264M0(), abstractC3545l1Mo13148X.m13259G0(), null, new InterfaceC0184l() { // from class: t.g3
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C7843h3.m30375G2(abstractC3545l1Mo13148X, (AbstractC3545l1.a) obj);
            }
        }, 4, null);
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: g */
    public int mo15346g(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        long jM30376H2 = m30376H2(interfaceC3566s);
        if (C3173c.m11970i(jM30376H2)) {
            return C3173c.m11972k(jM30376H2);
        }
        if (!this.f26161J) {
            i10 = AbstractC3174d.m11990g(jM30376H2, i10);
        }
        return AbstractC3174d.m11989f(jM30376H2, interfaceC3563r.mo13150t(i10));
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: t */
    public int mo15347t(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        long jM30376H2 = m30376H2(interfaceC3566s);
        if (C3173c.m11971j(jM30376H2)) {
            return C3173c.m11973l(jM30376H2);
        }
        if (!this.f26161J) {
            i10 = AbstractC3174d.m11989f(jM30376H2, i10);
        }
        return AbstractC3174d.m11990g(jM30376H2, interfaceC3563r.mo13146S(i10));
    }

    @Override // p166l2.InterfaceC4534e0
    /* JADX INFO: renamed from: v */
    public int mo15348v(InterfaceC3566s interfaceC3566s, InterfaceC3563r interfaceC3563r, int i10) {
        long jM30376H2 = m30376H2(interfaceC3566s);
        if (C3173c.m11971j(jM30376H2)) {
            return C3173c.m11973l(jM30376H2);
        }
        if (!this.f26161J) {
            i10 = AbstractC3174d.m11989f(jM30376H2, i10);
        }
        return AbstractC3174d.m11990g(jM30376H2, interfaceC3563r.mo13147W(i10));
    }

    public /* synthetic */ C7843h3(float f10, float f11, float f12, float f13, boolean z10, AbstractC1043k abstractC1043k) {
        this(f10, f11, f12, f13, z10);
    }
}
