package c0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final y0.o a(y0.o r1, b0.q r2) {
            c0.b r0 = new c0.b
            r0.<init>(r2)
            y0.o r1 = r1.d(r0)
            return r1
    }

    public static final z.c b(x1.i r13) {
            y.a r2 = new y.a
            r2.<init>()
            c0.f r0 = new c0.f
            r7 = 0
            r8 = 1
            r1 = 1
            java.lang.Class<y.a> r3 = y.a.class
            java.lang.String r4 = "addFilter"
            java.lang.String r5 = "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V"
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            b0.d0 r1 = new b0.d0
            r3 = 2
            r1.<init>(r2, r3)
            b0.d0 r3 = new b0.d0
            r4 = 3
            r3.<init>(r1, r4, r0)
            c0.d r0 = c0.d.f941a
            x1.k.z(r13, r0, r3)
            f.f0 r13 = new f.f0
            r13.<init>()
            f.f0 r0 = r2.f21788a
            java.lang.Object[] r1 = r0.f2803a
            int r0 = r0.f2804b
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = r3
            r7 = r4
            r8 = r5
        L36:
            z.f r9 = z.f.f22471b
            if (r6 >= r0) goto L70
            r10 = r1[r6]
            z.b r10 = (z.b) r10
            if (r7 == 0) goto L42
            if (r10 == r9) goto L6d
        L42:
            if (r10 != r9) goto L47
            if (r8 != r9) goto L47
            goto L63
        L47:
            if (r10 != r9) goto L4a
            goto L68
        L4a:
            f.f0 r7 = r2.f21789b
            java.lang.Object[] r9 = r7.f2803a
            int r7 = r7.f2804b
            r11 = r3
        L51:
            if (r11 >= r7) goto L68
            r12 = r9[r11]
            fg.l r12 = (fg.l) r12
            java.lang.Object r12 = r12.invoke(r10)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L65
        L63:
            r7 = r3
            goto L6d
        L65:
            int r11 = r11 + 1
            goto L51
        L68:
            r13.a(r10)
            r7 = r3
            r8 = r10
        L6d:
            int r6 = r6 + 1
            goto L36
        L70:
            boolean r0 = r13.h()
            if (r0 == 0) goto L77
            goto L7e
        L77:
            java.lang.Object[] r0 = r13.f2803a
            int r1 = r13.f2804b
            int r1 = r1 - r4
            r5 = r0[r1]
        L7e:
            z.b r5 = (z.b) r5
            if (r5 != r9) goto L88
            int r0 = r13.f2804b
            int r0 = r0 - r4
            r13.k(r0)
        L88:
            z.c r0 = new z.c
            f.d0 r1 = r13.f2805c
            if (r1 == 0) goto L8f
            goto L97
        L8f:
            f.d0 r1 = new f.d0
            r2 = 0
            r1.<init>(r13, r2)
            r13.f2805c = r1
        L97:
            r0.<init>(r1)
            return r0
    }

    public static final y0.o c(h0.u0 r1) {
            c0.e r0 = new c0.e
            r0.<init>(r1)
            return r0
    }

    public static final y0.o d(y0.o r1, b.e r2, h0.v0 r3, h0.w0 r4, h0.t0 r5) {
            c0.l r0 = new c0.l
            r0.<init>(r2, r3, r4, r5)
            y0.o r1 = r1.d(r0)
            return r1
    }
}
