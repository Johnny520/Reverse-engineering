package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f14403a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f14404b = 0.0f;

    static {
            r0 = 25
            float r0 = (float) r0
            w.b.f14403a = r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r1
            r1 = 1075479162(0x401a827a, float:2.4142137)
            float r0 = r0 / r1
            w.b.f14404b = r0
            return
    }

    public static final void a(h0.l r9, y0.o r10, long r11, i0.h0 r13, int r14) {
            r0 = 1776202187(0x69deb1cb, float:3.3652642E25)
            r13.b0(r0)
            boolean r0 = r13.f(r9)
            r1 = 4
            if (r0 == 0) goto Lf
            r0 = r1
            goto L10
        Lf:
            r0 = 2
        L10:
            r0 = r0 | r14
            boolean r2 = r13.f(r10)
            if (r2 == 0) goto L1a
            r2 = 32
            goto L1c
        L1a:
            r2 = 16
        L1c:
            r0 = r0 | r2
            r0 = r0 | 128(0x80, float:1.8E-43)
            r2 = r0 & 147(0x93, float:2.06E-43)
            r3 = 146(0x92, float:2.05E-43)
            r4 = 0
            r5 = 1
            if (r2 == r3) goto L29
            r2 = r5
            goto L2a
        L29:
            r2 = r4
        L2a:
            r3 = r0 & 1
            boolean r2 = r13.S(r3, r2)
            if (r2 == 0) goto L86
            r13.X()
            r2 = r14 & 1
            if (r2 == 0) goto L46
            boolean r2 = r13.B()
            if (r2 == 0) goto L40
            goto L46
        L40:
            r13.V()
            r0 = r0 & (-897(0xfffffffffffffc7f, float:NaN))
            goto L4d
        L46:
            r0 = r0 & (-897(0xfffffffffffffc7f, float:NaN))
            r11 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
        L4d:
            r13.q()
            r0 = r0 & 14
            if (r0 == r1) goto L55
            goto L56
        L55:
            r4 = r5
        L56:
            java.lang.Object r1 = r13.P()
            if (r4 != 0) goto L60
            i0.e r2 = i0.l.f5952a
            if (r1 != r2) goto L6a
        L60:
            nb.a r1 = new nb.a
            r2 = 20
            r1.<init>(r9, r2)
            r13.k0(r1)
        L6a:
            fg.l r1 = (fg.l) r1
            y0.o r1 = f2.o.a(r10, r1)
            y0.g r2 = y0.b.f21793h
            eb.u r3 = new eb.u
            r4 = 1
            r3.<init>(r11, r1, r4)
            r1 = -1653527038(0xffffffff9d712e02, float:-3.191987E-21)
            s0.d r1 = s0.i.e(r1, r3, r13)
            r0 = r0 | 432(0x1b0, float:6.05E-43)
            oh.h.a(r9, r2, r1, r13, r0)
        L84:
            r6 = r11
            goto L8a
        L86:
            r13.V()
            goto L84
        L8a:
            i0.r1 r11 = r13.t()
            if (r11 == 0) goto L9a
            w.a r3 = new w.a
            r4 = r9
            r5 = r10
            r8 = r14
            r3.<init>(r4, r5, r6, r8)
            r11.f6035d = r3
        L9a:
            return
    }

    public static final void b(y0.o r5, i0.h0 r6, int r7, int r8) {
            r0 = 694251107(0x29616e63, float:5.005578E-14)
            r6.b0(r0)
            r0 = r8 & 1
            r1 = 2
            if (r0 == 0) goto Le
            r2 = r7 | 6
            goto L18
        Le:
            boolean r2 = r6.f(r5)
            if (r2 == 0) goto L16
            r2 = 4
            goto L17
        L16:
            r2 = r1
        L17:
            r2 = r2 | r7
        L18:
            r3 = r2 & 3
            r4 = 1
            if (r3 == r1) goto L1f
            r1 = r4
            goto L20
        L1f:
            r1 = 0
        L20:
            r2 = r2 & r4
            boolean r1 = r6.S(r2, r1)
            if (r1 == 0) goto L4c
            if (r0 == 0) goto L2b
            y0.l r5 = y0.l.f21818a
        L2b:
            float r0 = w.b.f14404b
            float r1 = w.b.f14403a
            y0.o r0 = p.h1.k(r5, r0, r1)
            i0.u r1 = h0.l1.f4934a
            java.lang.Object r1 = r6.j(r1)
            h0.k1 r1 = (h0.k1) r1
            long r1 = r1.f4929a
            ca.c r3 = new ca.c
            r4 = 15
            r3.<init>(r1, r4)
            y0.o r0 = c1.h.e(r0, r3)
            p.d.c(r6, r0)
            goto L4f
        L4c:
            r6.V()
        L4f:
            i0.r1 r6 = r6.t()
            if (r6 == 0) goto L5c
            p.m r0 = new p.m
            r0.<init>(r5, r7, r8)
            r6.f6035d = r0
        L5c:
            return
    }
}
