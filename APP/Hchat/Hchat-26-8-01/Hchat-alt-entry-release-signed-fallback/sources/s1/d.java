package s1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v1.t f12216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f.f0 f12221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s1.j f12222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f.z f12223h;

    public d(v1.t r2) {
            r1 = this;
            r1.<init>()
            r1.f12216a = r2
            f.f0 r2 = new f.f0
            r2.<init>()
            r1.f12221f = r2
            s1.j r2 = new s1.j
            r2.<init>()
            r1.f12222g = r2
            f.z r2 = new f.z
            r0 = 10
            r2.<init>(r0)
            r1.f12223h = r2
            return
    }

    public final void a(long r19, java.util.List r21, boolean r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            int r3 = r21.size()
            s1.j r4 = r0.f12222g
            r5 = 1
            r9 = r4
            r8 = r5
            r7 = 0
        Le:
            f.z r10 = r0.f12223h
            if (r7 >= r3) goto L93
            r11 = r21
            java.lang.Object r12 = r11.get(r7)
            y0.n r12 = (y0.n) r12
            boolean r13 = r12.f21832t
            if (r13 == 0) goto L8f
            c1.b r13 = new c1.b
            r14 = 3
            r13.<init>(r0, r14, r12)
            r12.f21831s = r13
            if (r8 == 0) goto L6a
            j0.b r13 = r9.f12257a
            java.lang.Object[] r14 = r13.f6671g
            int r13 = r13.f6673i
            r15 = 0
        L2f:
            if (r15 >= r13) goto L43
            r16 = r14[r15]
            r6 = r16
            s1.i r6 = (s1.i) r6
            y0.n r6 = r6.f12245c
            boolean r6 = gg.l.a(r6, r12)
            if (r6 == 0) goto L40
            goto L45
        L40:
            int r15 = r15 + 1
            goto L2f
        L43:
            r16 = 0
        L45:
            r6 = r16
            s1.i r6 = (s1.i) r6
            if (r6 == 0) goto L69
            r6.f12251i = r5
            a5.a r9 = r6.f12246d
            r9.c(r1)
            if (r22 == 0) goto L67
            java.lang.Object r9 = r10.d(r1)
            if (r9 != 0) goto L62
            f.f0 r9 = new f.f0
            r9.<init>()
            r10.g(r9, r1)
        L62:
            f.f0 r9 = (f.f0) r9
            r9.a(r6)
        L67:
            r9 = r6
            goto L8f
        L69:
            r8 = 0
        L6a:
            s1.i r6 = new s1.i
            r6.<init>(r12)
            a5.a r12 = r6.f12246d
            r12.c(r1)
            if (r22 == 0) goto L89
            java.lang.Object r12 = r10.d(r1)
            if (r12 != 0) goto L84
            f.f0 r12 = new f.f0
            r12.<init>()
            r10.g(r12, r1)
        L84:
            f.f0 r12 = (f.f0) r12
            r12.a(r6)
        L89:
            j0.b r9 = r9.f12257a
            r9.b(r6)
            goto L67
        L8f:
            int r7 = r7 + 1
            goto Le
        L93:
            if (r22 == 0) goto Lff
            long[] r1 = r10.f2926b
            java.lang.Object[] r2 = r10.f2927c
            long[] r3 = r10.f2925a
            int r5 = r3.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto Lff
            r6 = 0
        La1:
            r7 = r3[r6]
            long r11 = ~r7
            r9 = 7
            long r11 = r11 << r9
            long r11 = r11 & r7
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 == 0) goto Lf8
            int r9 = r6 - r5
            int r9 = ~r9
            int r9 = r9 >>> 31
            r11 = 8
            int r9 = 8 - r9
            r12 = 0
        Lbb:
            if (r12 >= r9) goto Lf5
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto Lea
            int r13 = r6 << 3
            int r13 = r13 + r12
            r14 = r1[r13]
            r13 = r2[r13]
            f.f0 r13 = (f.f0) r13
            r19 = r11
            j0.b r11 = r4.f12257a
            java.lang.Object[] r0 = r11.f6671g
            int r11 = r11.f6673i
            r16 = r0
            r0 = 0
        Lda:
            if (r0 >= r11) goto Lec
            r17 = r16[r0]
            r20 = r0
            r0 = r17
            s1.i r0 = (s1.i) r0
            r0.f(r14, r13)
            int r0 = r20 + 1
            goto Lda
        Lea:
            r19 = r11
        Lec:
            long r7 = r7 >> r19
            int r12 = r12 + 1
            r0 = r18
            r11 = r19
            goto Lbb
        Lf5:
            r0 = r11
            if (r9 != r0) goto Lff
        Lf8:
            if (r6 == r5) goto Lff
            int r6 = r6 + 1
            r0 = r18
            goto La1
        Lff:
            r10.a()
            return
    }

    public final boolean b(h0.q0 r10, boolean r11) {
            r9 = this;
            java.lang.Object r0 = r10.f4971c
            f.p r0 = (f.p) r0
            v1.t r1 = r9.f12216a
            s1.j r2 = r9.f12222g
            boolean r0 = r2.a(r0, r1, r10, r11)
            j0.b r1 = r2.f12257a
            r3 = 0
            if (r0 != 0) goto L12
            return r3
        L12:
            r0 = 1
            r9.f12217b = r0
            java.lang.Object[] r4 = r1.f6671g
            int r5 = r1.f6673i
            r6 = r3
            r7 = r6
        L1b:
            if (r6 >= r5) goto L30
            r8 = r4[r6]
            s1.i r8 = (s1.i) r8
            boolean r8 = r8.e(r10, r11)
            if (r8 != 0) goto L2c
            if (r7 == 0) goto L2a
            goto L2c
        L2a:
            r7 = r3
            goto L2d
        L2c:
            r7 = r0
        L2d:
            int r6 = r6 + 1
            goto L1b
        L30:
            java.lang.Object[] r11 = r1.f6671g
            int r1 = r1.f6673i
            r4 = r3
            r5 = r4
        L36:
            if (r4 >= r1) goto L4b
            r6 = r11[r4]
            s1.i r6 = (s1.i) r6
            boolean r6 = r6.d(r10)
            if (r6 != 0) goto L47
            if (r5 == 0) goto L45
            goto L47
        L45:
            r5 = r3
            goto L48
        L47:
            r5 = r0
        L48:
            int r4 = r4 + 1
            goto L36
        L4b:
            r2.b(r10)
            if (r5 != 0) goto L54
            if (r7 == 0) goto L53
            goto L54
        L53:
            r0 = r3
        L54:
            r9.f12217b = r3
            boolean r10 = r9.f12220e
            if (r10 == 0) goto L72
            r9.f12220e = r3
            f.f0 r10 = r9.f12221f
            int r11 = r10.f2804b
            r1 = r3
        L61:
            if (r1 >= r11) goto L6f
            java.lang.Object r4 = r10.f(r1)
            y0.n r4 = (y0.n) r4
            r9.d(r4)
            int r1 = r1 + 1
            goto L61
        L6f:
            r10.d()
        L72:
            boolean r10 = r9.f12218c
            if (r10 == 0) goto L7b
            r9.f12218c = r3
            r9.c()
        L7b:
            boolean r10 = r9.f12219d
            if (r10 == 0) goto L86
            r9.f12219d = r3
            j0.b r10 = r2.f12257a
            r10.g()
        L86:
            return r0
    }

    public final void c() {
            r6 = this;
            boolean r0 = r6.f12217b
            r1 = 1
            if (r0 == 0) goto L8
            r6.f12218c = r1
            return
        L8:
            s1.j r0 = r6.f12222g
            j0.b r2 = r0.f12257a
            java.lang.Object[] r3 = r2.f6671g
            int r2 = r2.f6673i
            r4 = 0
        L11:
            if (r4 >= r2) goto L1d
            r5 = r3[r4]
            s1.i r5 = (s1.i) r5
            r5.c()
            int r4 = r4 + 1
            goto L11
        L1d:
            boolean r2 = r6.f12219d
            if (r2 == 0) goto L24
            r6.f12219d = r1
            return
        L24:
            j0.b r0 = r0.f12257a
            r0.g()
            return
    }

    public final void d(y0.n r7) {
            r6 = this;
            boolean r0 = r6.f12217b
            r1 = 1
            if (r0 == 0) goto Ld
            r6.f12220e = r1
            f.f0 r0 = r6.f12221f
            r0.a(r7)
            return
        Ld:
            s1.j r0 = r6.f12222g
            f.f0 r2 = r0.f12258b
            r2.d()
            r2.a(r0)
        L17:
            boolean r0 = r2.i()
            if (r0 == 0) goto L4a
            int r0 = r2.f2804b
            int r0 = r0 - r1
            java.lang.Object r0 = r2.k(r0)
            s1.j r0 = (s1.j) r0
            r3 = 0
        L27:
            j0.b r4 = r0.f12257a
            int r5 = r4.f6673i
            if (r3 >= r5) goto L17
            java.lang.Object[] r4 = r4.f6671g
            r4 = r4[r3]
            s1.i r4 = (s1.i) r4
            y0.n r5 = r4.f12245c
            boolean r5 = gg.l.a(r5, r7)
            if (r5 == 0) goto L44
            j0.b r5 = r0.f12257a
            r5.j(r4)
            r4.c()
            goto L27
        L44:
            r2.a(r4)
            int r3 = r3 + 1
            goto L27
        L4a:
            return
    }
}
