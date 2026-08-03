package g2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s.d f4165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m.b f4166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g2.d f4167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g2.e f4171h;

    public d(g2.e r1, int r2, s.d r3, m.b r4) {
            r0 = this;
            r0.<init>()
            r0.f4171h = r1
            r0.f4164a = r2
            r0.f4165b = r3
            r0.f4166c = r4
            r1 = -9223372036854775808
            r0.f4170g = r1
            return
    }

    public final void a(long r15, long r17, long r19, long r21, float[] r23) {
            r14 = this;
            g2.e r0 = r14.f4171h
            long r10 = r0.f4177f
            r0 = 2
            s.d r13 = r14.f4165b
            x1.i1 r0 = x1.k.t(r13, r0)
            x1.f0 r1 = x1.k.w(r13)
            boolean r2 = r1.H()
            x1.b1 r1 = r1.L
            if (r2 != 0) goto L19
            r0 = 0
            goto L7a
        L19:
            x1.i1 r2 = r1.f20842d
            if (r2 == r0) goto L6b
            r2 = 32
            long r3 = r15 >> r2
            int r3 = (int) r3
            float r3 = (float) r3
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r15 & r4
            int r6 = (int) r6
            float r6 = (float) r6
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r7 = (long) r3
            int r3 = java.lang.Float.floatToRawIntBits(r6)
            r17 = r2
            long r2 = (long) r3
            long r6 = r7 << r17
            long r2 = r2 & r4
            long r2 = r2 | r6
            long r6 = r0.f13902i
            x1.i1 r1 = r1.f20842d
            r1.getClass()
            long r0 = r1.W(r0, r2)
            long r2 = ig.a.W(r0)
            g2.c r1 = new g2.c
            long r8 = r2 >> r17
            int r0 = (int) r8
            long r8 = r6 >> r17
            int r8 = (int) r8
            int r0 = r0 + r8
            long r8 = r2 & r4
            int r8 = (int) r8
            long r6 = r6 & r4
            int r6 = (int) r6
            int r8 = r8 + r6
            long r6 = (long) r0
            long r6 = r6 << r17
            long r8 = (long) r8
            long r4 = r4 & r8
            long r4 = r4 | r6
            r6 = r19
            r8 = r21
            r12 = r23
            r1.<init>(r2, r4, r6, r8, r10, r12, r13)
        L69:
            r0 = r1
            goto L7a
        L6b:
            g2.c r1 = new g2.c
            r2 = r15
            r4 = r17
            r6 = r19
            r8 = r21
            r12 = r23
            r1.<init>(r2, r4, r6, r8, r10, r12, r13)
            goto L69
        L7a:
            if (r0 != 0) goto L7d
            return
        L7d:
            m.b r1 = r14.f4166c
            r1.invoke(r0)
            return
    }

    public final void b() {
            r9 = this;
            g2.e r0 = r9.f4171h
            f.w r1 = r0.f4172a
            int r2 = r9.f4164a
            java.lang.Object r3 = r1.g(r2)
            g2.d r3 = (g2.d) r3
            r4 = 0
            if (r3 != 0) goto L10
            goto L5c
        L10:
            boolean r5 = r3.equals(r9)
            if (r5 == 0) goto L4a
            g2.d r0 = r9.f4167d
            r9.f4167d = r4
            if (r0 == 0) goto L2b
            int r3 = r1.d(r2)
            java.lang.Object[] r4 = r1.f2845c
            r5 = r4[r3]
            int[] r1 = r1.f2844b
            r1[r3] = r2
            r4[r3] = r0
            return
        L2b:
            s.d r0 = r9.f4165b
            y0.n r0 = r0.f21819g
            x1.f0 r0 = x1.k.w(r0)
            boolean r1 = r0.f20895m
            if (r1 == 0) goto L80
            x1.r1 r1 = x1.i0.a(r0)
            y1.t r1 = (y1.t) r1
            g2.b r1 = r1.getRectManager()
            ac.k r1 = r1.f4147b
            int r0 = r0.f20890h
            r2 = 0
            r1.N(r0, r2)
            return
        L4a:
            int r5 = r1.d(r2)
            java.lang.Object[] r6 = r1.f2845c
            r7 = r6[r5]
            int[] r1 = r1.f2844b
            r1[r5] = r2
            r6[r5] = r3
        L58:
            g2.d r1 = r3.f4167d
            if (r1 != 0) goto L81
        L5c:
            g2.d r1 = r0.f4173b
            if (r1 != r9) goto L67
            g2.d r1 = r1.f4167d
            r0.f4173b = r1
            r9.f4167d = r4
            return
        L67:
            if (r1 == 0) goto L6c
            g2.d r0 = r1.f4167d
            goto L6d
        L6c:
            r0 = r4
        L6d:
            r8 = r1
            r1 = r0
            r0 = r8
            if (r1 == 0) goto L80
            if (r1 != r9) goto L7d
            if (r0 == 0) goto L7a
            g2.d r1 = r1.f4167d
            r0.f4167d = r1
        L7a:
            r9.f4167d = r4
            return
        L7d:
            g2.d r0 = r1.f4167d
            goto L6d
        L80:
            return
        L81:
            if (r1 != r9) goto L8a
            g2.d r0 = r9.f4167d
            r3.f4167d = r0
            r9.f4167d = r4
            return
        L8a:
            r3 = r1
            goto L58
    }
}
