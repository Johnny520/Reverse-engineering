package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sf.e f14431a = null;

    static {
            sf.e r0 = new sf.e
            tf.t r1 = tf.t.f13167g
            r0.<init>(r1, r1)
            w.d.f14431a = r0
            return
    }

    public static final void a(i2.g r17, java.util.List r18, i0.h0 r19, int r20) {
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = -1794596951(0xffffffff95089fa9, float:-2.759093E-26)
            r2.b0(r4)
            r4 = r3 & 6
            if (r4 != 0) goto L1d
            boolean r4 = r2.f(r0)
            if (r4 == 0) goto L1a
            r4 = 4
            goto L1b
        L1a:
            r4 = 2
        L1b:
            r4 = r4 | r3
            goto L1e
        L1d:
            r4 = r3
        L1e:
            r5 = r3 & 48
            if (r5 != 0) goto L2e
            boolean r5 = r2.h(r1)
            if (r5 == 0) goto L2b
            r5 = 32
            goto L2d
        L2b:
            r5 = 16
        L2d:
            r4 = r4 | r5
        L2e:
            r5 = r4 & 19
            r6 = 18
            r8 = 1
            if (r5 == r6) goto L37
            r5 = r8
            goto L38
        L37:
            r5 = 0
        L38:
            r4 = r4 & r8
            boolean r4 = r2.S(r4, r5)
            if (r4 == 0) goto Lba
            int r4 = r1.size()
            r5 = 0
        L44:
            if (r5 >= r4) goto Lbd
            java.lang.Object r6 = r1.get(r5)
            i2.e r6 = (i2.e) r6
            java.lang.Object r9 = r6.f6288a
            fg.q r9 = (fg.q) r9
            int r10 = r6.f6289b
            int r6 = r6.f6290c
            java.lang.Object r11 = r2.P()
            i0.e r12 = i0.l.f5952a
            if (r11 != r12) goto L61
            w.c r11 = w.c.f14417b
            r2.k0(r11)
        L61:
            v1.n0 r11 = (v1.n0) r11
            long r12 = r2.T
            int r12 = java.lang.Long.hashCode(r12)
            s0.h r13 = r2.l()
            y0.l r14 = y0.l.f21818a
            y0.o r14 = y0.a.c(r2, r14)
            x1.f r15 = x1.g.f20914f
            r15.getClass()
            x1.y r15 = x1.f.f20883b
            r2.d0()
            r16 = 0
            boolean r7 = r2.S
            if (r7 == 0) goto L87
            r2.k(r15)
            goto L8a
        L87:
            r2.n0()
        L8a:
            x1.e r7 = x1.f.f20886e
            i0.r.A(r7, r2, r11)
            x1.e r7 = x1.f.f20885d
            i0.r.A(r7, r2, r13)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r12)
            x1.e r11 = x1.f.f20887f
            i0.r.A(r11, r2, r7)
            x1.d r7 = x1.f.f20888g
            i0.r.w(r7, r2)
            x1.e r7 = x1.f.f20884c
            i0.r.A(r7, r2, r14)
            i2.g r6 = r0.b(r10, r6)
            java.lang.String r6 = r6.f6314h
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)
            r9.b(r6, r2, r7)
            r2.p(r8)
            int r5 = r5 + 1
            goto L44
        Lba:
            r2.V()
        Lbd:
            i0.r1 r2 = r2.t()
            if (r2 == 0) goto Lcb
            i.b1 r4 = new i.b1
            r5 = 4
            r4.<init>(r0, r1, r3, r5)
            r2.f6035d = r4
        Lcb:
            return
    }
}
