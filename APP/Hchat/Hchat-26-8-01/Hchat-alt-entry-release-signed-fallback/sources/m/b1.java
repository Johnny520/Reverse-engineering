package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m.p0 f8082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m.w0 f8083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m.z0 f8084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m.y0 f8085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m.x0 f8086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a7.a f8087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m.a f8088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m.a3 f8090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a5.a f8091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a5.a f8092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f8093l;

    public b1(m.p0 r3) {
            r2 = this;
            r2.<init>()
            r2.f8082a = r3
            r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r2.f8089h = r0
            a5.a r3 = new a5.a
            r0 = 7
            r1 = 0
            r3.<init>(r1, r0)
            f.f0 r0 = new f.f0
            r0.<init>()
            r3.f57i = r0
            r2.f8091j = r3
            a5.a r3 = new a5.a
            r0 = 8
            r3.<init>(r1, r0)
            f.y r0 = new f.y
            r0.<init>()
            r3.f57i = r0
            r2.f8092k = r3
            r0 = 0
            r2.f8093l = r0
            return
    }

    public static void c(m.b1 r4, p1.b r5, long r6, long r8, int r10) {
            r10 = r10 & 4
            if (r10 == 0) goto L6
            r8 = 0
        L6:
            m.p0 r10 = r4.f8082a
            m.y0 r0 = r4.f8085d
            r1 = 0
            if (r0 != 0) goto L20
            m.y0 r0 = new m.y0
            r0.<init>()
            r2 = 0
            r0.f8426b = r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0.f8427c = r2
            r0.f8428d = r1
            r4.f8085d = r0
        L20:
            r0.f8426b = r5
            r0.f8427c = r6
            m.a3 r5 = r4.f8090i
            m.p1 r6 = r10.f8320w
            if (r5 != 0) goto L32
            m.a3 r5 = new m.a3
            r5.<init>(r6)
            r4.f8090i = r5
            goto L36
        L32:
            r5.f8077a = r6
            r5.f8078b = r8
        L36:
            r0.f8428d = r1
            r4.f8087f = r0
            return
    }

    public final void a() {
            r3 = this;
            m.w0 r0 = r3.f8083b
            r1 = 0
            m.v0 r2 = m.v0.f8400i
            if (r0 != 0) goto L12
            m.w0 r0 = new m.w0
            r0.<init>()
            r0.f8412b = r2
            r0.f8413c = r1
            r3.f8083b = r0
        L12:
            r0.f8412b = r2
            r0.f8413c = r1
            r3.f8087f = r0
            return
    }

    public final void b(p1.b r4, long r5, m.a3 r7) {
            r3 = this;
            m.x0 r0 = r3.f8086e
            if (r0 != 0) goto L15
            m.x0 r0 = new m.x0
            r0.<init>()
            r1 = 0
            r0.f8418b = r1
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0.f8419c = r1
            r3.f8086e = r0
        L15:
            r0.f8418b = r4
            r0.f8419c = r5
            r4 = 0
            r7.f8078b = r4
            r3.f8087f = r0
            return
    }

    public final m.a d() {
            r1 = this;
            m.a r0 = r1.f8088g
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "Velocity Tracker not initialized."
            j8.o.t(r0)
            r0 = 0
            return r0
    }

    public final void e(p1.b r17, p1.a r18, long r19) {
            r16 = this;
            r0 = r16
            r1 = r19
            m.p0 r3 = r0.f8082a
            x1.i1 r4 = x1.k.v(r3)
            r5 = 0
            long r4 = r4.P(r5)
            long r6 = r0.f8089h
            r8 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            boolean r6 = e1.b.b(r6, r8)
            if (r6 != 0) goto L33
            long r6 = r0.f8089h
            boolean r6 = e1.b.b(r4, r6)
            if (r6 != 0) goto L33
            long r6 = r0.f8089h
            long r6 = e1.b.d(r4, r6)
            long r8 = r0.f8093l
            long r6 = e1.b.e(r8, r6)
            r0.f8093l = r6
        L33:
            r0.f8089h = r4
            m.p1 r4 = r3.f8320w
            r4.getClass()
            m.r0 r5 = m.s0.f8356a
            m.p1 r5 = m.p1.f8324g
            r6 = 32
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r4 != r5) goto L4f
            long r4 = r1 & r7
        L49:
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            goto L52
        L4f:
            long r4 = r1 >> r6
            goto L49
        L52:
            float r4 = java.lang.Math.abs(r4)
            r5 = 1073741824(0x40000000, float:2.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Ldd
            m.a r9 = r0.d()
            m.p1 r11 = r3.f8320w
            a5.a r13 = r0.f8091j
            long r14 = r0.f8093l
            r10 = r17
            r12 = r18
            ac.p.b(r9, r10, r11, r12, r13, r14)
            m.y r4 = new m.y
            a5.a r5 = r0.f8092k
            java.lang.Object r9 = r5.f57i
            f.y r9 = (f.y) r9
            int r10 = r9.f2924b
            r11 = 3
            if (r10 != r11) goto L91
            int r12 = r5.f56h
            int r13 = r12 + 1
            r5.f56h = r13
            if (r12 < 0) goto L8b
            if (r12 >= r10) goto L8b
            long[] r10 = r9.f2923a
            r13 = r10[r12]
            r10[r12] = r1
            goto L94
        L8b:
            java.lang.String r1 = "Index must be between 0 and size"
            okio.a.i(r1)
            return
        L91:
            r9.a(r1)
        L94:
            int r1 = r5.f56h
            r2 = 0
            if (r1 != r11) goto L9b
            r5.f56h = r2
        L9b:
            long[] r1 = r9.f2923a
            int r5 = r9.f2924b
            r10 = 0
            r11 = r2
            r12 = r10
        La2:
            if (r11 >= r5) goto Lb0
            r13 = r1[r11]
            long r13 = r13 >> r6
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            float r12 = r12 + r13
            int r11 = r11 + 1
            goto La2
        Lb0:
            int r1 = r9.f2924b
            float r5 = (float) r1
            float r12 = r12 / r5
            long[] r5 = r9.f2923a
        Lb6:
            if (r2 >= r1) goto Lc4
            r13 = r5[r2]
            long r13 = r13 & r7
            int r11 = (int) r13
            float r11 = java.lang.Float.intBitsToFloat(r11)
            float r10 = r10 + r11
            int r2 = r2 + 1
            goto Lb6
        Lc4:
            int r1 = r9.f2924b
            float r1 = (float) r1
            float r10 = r10 / r1
            int r1 = java.lang.Float.floatToRawIntBits(r12)
            long r1 = (long) r1
            int r5 = java.lang.Float.floatToRawIntBits(r10)
            long r9 = (long) r5
            long r1 = r1 << r6
            long r5 = r9 & r7
            long r1 = r1 | r5
            r5 = 1
            r4.<init>(r1, r5)
            r3.v1(r4)
        Ldd:
            return
    }

    public final void f(p1.b r11, p1.b r12, p1.a r13, long r14) {
            r10 = this;
            m.a r0 = r10.f8088g
            if (r0 != 0) goto Ld
            m.a r0 = new m.a
            r1 = 17
            r0.<init>(r1)
            r10.f8088g = r0
        Ld:
            r0 = 0
            r10.f8093l = r0
            m.a r2 = r10.d()
            m.p0 r9 = r10.f8082a
            m.p1 r4 = r9.f8320w
            a5.a r6 = r10.f8091j
            long r7 = r10.f8093l
            r3 = r11
            r5 = r13
            ac.p.b(r2, r3, r4, r5, r6, r7)
            m.p1 r11 = r9.f8320w
            long r11 = ac.p.I(r12, r11, r5)
            long r11 = e1.b.d(r11, r14)
            fg.l r13 = r9.f8321x
            s1.d0 r14 = new s1.d0
            r15 = 1
            r14.<init>(r15)
            java.lang.Object r13 = r13.invoke(r14)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L52
            x1.i1 r13 = x1.k.v(r9)
            long r13 = r13.P(r0)
            r10.f8089h = r13
            m.z r13 = new m.z
            r13.<init>(r11)
            r9.v1(r13)
        L52:
            a5.a r11 = r10.f8092k
            r12 = 0
            r11.f56h = r12
            java.lang.Object r11 = r11.f57i
            f.y r11 = (f.y) r11
            r11.f2924b = r12
            return
    }
}
