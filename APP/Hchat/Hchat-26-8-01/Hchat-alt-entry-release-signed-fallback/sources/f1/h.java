package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements i4.k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3057h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f3058i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.lang.Object f3059j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object f3060k;

    public h() {
            r1 = this;
            r0 = 6
            r1.f3056g = r0
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f3058i = r0
            return
    }

    public h(int r2) {
            r1 = this;
            r0 = 4
            r1.f3056g = r0
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.f3058i = r0
            r2 = 0
            r1.f3057h = r2
            r2 = 0
            r1.f3059j = r2
            r1.f3060k = r2
            return
    }

    public h(android.graphics.Paint r2) {
            r1 = this;
            r0 = 0
            r1.f3056g = r0
            r1.<init>()
            r1.f3058i = r2
            r2 = 3
            r1.f3057h = r2
            return
    }

    public h(g8.b r2) {
            r1 = this;
            r0 = 3
            r1.f3056g = r0
            r1.<init>()
            r0 = 8
            int r0 = r2.g(r0)
            r1.f3058i = r2
            v4.e0 r2 = new v4.e0
            r2.<init>(r0)
            r1.f3059j = r2
            int[] r2 = new int[r0]
            r1.f3060k = r2
            r2 = -1
            r1.f3057h = r2
            return
    }

    public h(i4.c0 r2) {
            r1 = this;
            r0 = 2
            r1.f3056g = r0
            r1.<init>()
            r1.f3060k = r2
            java.lang.Object r2 = r2.f6443a
            i4.a0 r2 = (i4.a0) r2
            r1.f3058i = r2
            r2 = 0
            r1.f3059j = r2
            return
    }

    public h(i4.z r2, int r3) {
            r1 = this;
            r0 = 1
            r1.f3056g = r0
            r1.<init>()
            r1.f3060k = r2
            r1.f3057h = r3
            java.util.BitSet r3 = new java.util.BitSet
            int r0 = r2.f6503d
            r3.<init>(r0)
            r1.f3059j = r3
            java.util.BitSet r3 = new java.util.BitSet
            r3.<init>(r0)
            r1.f3058i = r3
            r3 = 1
            r2.f6512m = r3
            return
    }

    public h(u4.c r2, int r3) {
            r1 = this;
            r0 = 5
            r1.f3056g = r0
            r1.<init>()
            if (r3 < 0) goto L12
            r1.f3058i = r2
            r1.f3057h = r3
            r2 = 0
            r1.f3059j = r2
            r1.f3060k = r2
            return
        L12:
            java.lang.String r2 = "firstLabel < 0"
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    public static u4.o n(u4.o r2) {
            if (r2 == 0) goto L12
            w4.d r0 = r2.f13401h
            w4.c r0 = r0.getType()
            w4.c r1 = w4.c.f14875x
            if (r0 != r1) goto L12
            w4.c r0 = w4.c.E
            u4.o r2 = r2.p(r0)
        L12:
            return r2
    }

    public void A(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f3058i
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r1 = 2
            if (r3 != r1) goto La
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.SQUARE
            goto L17
        La:
            r1 = 1
            if (r3 != r1) goto L10
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.ROUND
            goto L17
        L10:
            if (r3 != 0) goto L15
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.BUTT
            goto L17
        L15:
            android.graphics.Paint$Cap r3 = android.graphics.Paint.Cap.BUTT
        L17:
            r0.setStrokeCap(r3)
            return
    }

    public void B(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f3058i
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            if (r3 != 0) goto L9
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.MITER
            goto L17
        L9:
            r1 = 2
            if (r3 != r1) goto Lf
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.BEVEL
            goto L17
        Lf:
            r1 = 1
            if (r3 != r1) goto L15
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.ROUND
            goto L17
        L15:
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.MITER
        L17:
            r0.setStrokeJoin(r3)
            return
    }

    public void C(float r2) {
            r1 = this;
            java.lang.Object r0 = r1.f3058i
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r0.setStrokeWidth(r2)
            return
    }

    public void D(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f3058i
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r1 = 1
            if (r3 != r1) goto La
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.STROKE
            goto Lc
        La:
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL
        Lc:
            r0.setStyle(r3)
            return
    }

    public void E(z7.o r4) {
            r3 = this;
            java.lang.Object r0 = r3.f3060k
            b8.c r0 = (b8.c) r0
            if (r0 != 0) goto L7
            goto L12
        L7:
            if (r4 == 0) goto L12
            int r1 = r4.f22586i
            r2 = 2
            if (r1 >= r2) goto Lf
            goto L12
        Lf:
            r4.sort(r0)
        L12:
            return
    }

    @Override // i4.k
    public void a(int r11, int r12, w4.c r13) {
            r10 = this;
            java.lang.Object r0 = r10.f3058i
            i4.a0 r0 = (i4.a0) r0
            if (r11 == 0) goto L3bc
            r1 = 190(0xbe, float:2.66E-43)
            r2 = 0
            r3 = 0
            if (r11 == r1) goto L37d
            r1 = 191(0xbf, float:2.68E-43)
            if (r11 == r1) goto L373
            r1 = 194(0xc2, float:2.72E-43)
            if (r11 == r1) goto L373
            r1 = 195(0xc3, float:2.73E-43)
            if (r11 == r1) goto L373
            r1 = 3
            r4 = 1
            r5 = 2
            switch(r11) {
                case 0: goto L3bc;
                case 46: goto L34f;
                case 79: goto L2b2;
                case 100: goto L2a9;
                case 104: goto L2a9;
                case 108: goto L2a9;
                case 112: goto L2a9;
                case 116: goto L2a0;
                case 120: goto L295;
                case 122: goto L295;
                case 124: goto L295;
                case 126: goto L2a9;
                case 128: goto L2a9;
                case 130: goto L2a9;
                case 172: goto L277;
                case 177: goto L26d;
                default: goto L1e;
            }
        L1e:
            r6 = 17
            r7 = 205106(0x32132, float:2.87415E-40)
            r8 = 12819(0x3213, float:1.7963E-41)
            r9 = 530(0x212, float:7.43E-43)
            switch(r11) {
                case 87: goto L24d;
                case 88: goto L213;
                case 89: goto L1f1;
                case 90: goto L1c5;
                case 91: goto L17f;
                case 92: goto L213;
                case 93: goto L12f;
                case 94: goto Lac;
                case 95: goto L7e;
                case 96: goto L2a9;
                default: goto L2a;
            }
        L2a:
            switch(r11) {
                case 133: goto L73;
                case 134: goto L73;
                case 135: goto L73;
                case 136: goto L68;
                case 137: goto L68;
                case 138: goto L68;
                case 139: goto L5d;
                case 140: goto L5d;
                case 141: goto L5d;
                case 142: goto L52;
                case 143: goto L52;
                case 144: goto L52;
                case 145: goto L73;
                case 146: goto L73;
                case 147: goto L73;
                case 148: goto L47;
                case 149: goto L3c;
                case 150: goto L3c;
                case 151: goto L31;
                case 152: goto L31;
                default: goto L2d;
            }
        L2d:
            r10.d(r11, r12)
            throw r2
        L31:
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            w4.c r2 = w4.c.f14869r
            r0.g(r1, r2, r2)
            goto L3bf
        L3c:
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            w4.c r2 = w4.c.f14870s
            r0.g(r1, r2, r2)
            goto L3bf
        L47:
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            w4.c r2 = w4.c.f14872u
            r0.g(r1, r2, r2)
            goto L3bf
        L52:
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            w4.c r2 = w4.c.f14869r
            r0.f(r1, r2)
            goto L3bf
        L5d:
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            w4.c r2 = w4.c.f14870s
            r0.f(r1, r2)
            goto L3bf
        L68:
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            w4.c r2 = w4.c.f14872u
            r0.f(r1, r2)
            goto L3bf
        L73:
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            w4.c r2 = w4.c.f14871t
            r0.f(r1, r2)
            goto L3bf
        L7e:
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            java.lang.Object r1 = r1.f470b
            i4.n r1 = (i4.n) r1
            w4.c r2 = r1.p(r3)
            boolean r2 = r2.q()
            if (r2 == 0) goto La7
            w4.c r1 = r1.p(r4)
            boolean r1 = r1.q()
            if (r1 == 0) goto La7
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            r0.d(r5, r1)
            r1 = 18
            r0.f6418e = r1
            goto L3bf
        La7:
            i4.b0 r11 = i4.c0.a()
            throw r11
        Lac:
            java.lang.Object r2 = r10.f3059j
            b5.c r2 = (b5.c) r2
            java.lang.Object r2 = r2.f470b
            i4.n r2 = (i4.n) r2
            w4.c r3 = r2.p(r3)
            boolean r3 = r3.r()
            if (r3 == 0) goto Led
            w4.c r3 = r2.p(r5)
            boolean r3 = r3.r()
            if (r3 == 0) goto Ld3
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            r0.d(r5, r1)
            r0.f6418e = r9
            goto L3bf
        Ld3:
            w4.c r2 = r2.p(r1)
            boolean r2 = r2.q()
            if (r2 == 0) goto Le8
            java.lang.Object r2 = r10.f3059j
            b5.c r2 = (b5.c) r2
            r0.d(r1, r2)
            r0.f6418e = r8
            goto L3bf
        Le8:
            i4.b0 r11 = i4.c0.a()
            throw r11
        Led:
            w4.c r3 = r2.p(r4)
            boolean r3 = r3.q()
            if (r3 == 0) goto L12a
            w4.c r3 = r2.p(r5)
            boolean r3 = r3.r()
            if (r3 == 0) goto L10c
            java.lang.Object r2 = r10.f3059j
            b5.c r2 = (b5.c) r2
            r0.d(r1, r2)
            r0.f6418e = r7
            goto L3bf
        L10c:
            w4.c r1 = r2.p(r1)
            boolean r1 = r1.q()
            if (r1 == 0) goto L125
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            r2 = 4
            r0.d(r2, r1)
            r1 = 4399427(0x432143, float:6.16491E-39)
            r0.f6418e = r1
            goto L3bf
        L125:
            i4.b0 r11 = i4.c0.a()
            throw r11
        L12a:
            i4.b0 r11 = i4.c0.a()
            throw r11
        L12f:
            java.lang.Object r2 = r10.f3059j
            b5.c r2 = (b5.c) r2
            java.lang.Object r2 = r2.f470b
            i4.n r2 = (i4.n) r2
            w4.c r3 = r2.p(r3)
            boolean r3 = r3.r()
            if (r3 == 0) goto L15b
            w4.c r1 = r2.p(r5)
            boolean r1 = r1.r()
            if (r1 != 0) goto L156
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            r0.d(r5, r1)
            r0.f6418e = r9
            goto L3bf
        L156:
            i4.b0 r11 = i4.c0.a()
            throw r11
        L15b:
            w4.c r3 = r2.p(r4)
            boolean r3 = r3.r()
            if (r3 != 0) goto L17a
            w4.c r2 = r2.p(r5)
            boolean r2 = r2.r()
            if (r2 != 0) goto L17a
            java.lang.Object r2 = r10.f3059j
            b5.c r2 = (b5.c) r2
            r0.d(r1, r2)
            r0.f6418e = r7
            goto L3bf
        L17a:
            i4.b0 r11 = i4.c0.a()
            throw r11
        L17f:
            java.lang.Object r2 = r10.f3059j
            b5.c r2 = (b5.c) r2
            java.lang.Object r2 = r2.f470b
            i4.n r2 = (i4.n) r2
            w4.c r3 = r2.p(r3)
            boolean r3 = r3.r()
            if (r3 != 0) goto L1c0
            w4.c r3 = r2.p(r4)
            boolean r3 = r3.r()
            if (r3 == 0) goto L1a6
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            r0.d(r5, r1)
            r0.f6418e = r9
            goto L3bf
        L1a6:
            w4.c r2 = r2.p(r5)
            boolean r2 = r2.q()
            if (r2 == 0) goto L1bb
            java.lang.Object r2 = r10.f3059j
            b5.c r2 = (b5.c) r2
            r0.d(r1, r2)
            r0.f6418e = r8
            goto L3bf
        L1bb:
            i4.b0 r11 = i4.c0.a()
            throw r11
        L1c0:
            i4.b0 r11 = i4.c0.a()
            throw r11
        L1c5:
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            java.lang.Object r1 = r1.f470b
            i4.n r1 = (i4.n) r1
            w4.c r2 = r1.p(r3)
            boolean r2 = r2.q()
            if (r2 == 0) goto L1ec
            w4.c r1 = r1.p(r4)
            boolean r1 = r1.q()
            if (r1 == 0) goto L1ec
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            r0.d(r5, r1)
            r0.f6418e = r9
            goto L3bf
        L1ec:
            i4.b0 r11 = i4.c0.a()
            throw r11
        L1f1:
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            java.lang.Object r1 = r1.f470b
            i4.n r1 = (i4.n) r1
            w4.c r1 = r1.p(r3)
            boolean r1 = r1.r()
            if (r1 != 0) goto L20e
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            r0.d(r4, r1)
            r0.f6418e = r6
            goto L3bf
        L20e:
            i4.b0 r11 = i4.c0.a()
            throw r11
        L213:
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            java.lang.Object r1 = r1.f470b
            i4.n r1 = (i4.n) r1
            w4.c r2 = r1.p(r3)
            boolean r2 = r2.r()
            if (r2 == 0) goto L22d
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            r0.d(r4, r1)
            goto L240
        L22d:
            w4.c r1 = r1.p(r4)
            boolean r1 = r1.q()
            if (r1 == 0) goto L248
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            r0.d(r5, r1)
            r6 = 8481(0x2121, float:1.1884E-41)
        L240:
            r1 = 92
            if (r11 != r1) goto L3bf
            r0.f6418e = r6
            goto L3bf
        L248:
            i4.b0 r11 = i4.c0.a()
            throw r11
        L24d:
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            java.lang.Object r1 = r1.f470b
            i4.n r1 = (i4.n) r1
            w4.c r1 = r1.p(r3)
            boolean r1 = r1.r()
            if (r1 != 0) goto L268
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            r0.d(r4, r1)
            goto L3bf
        L268:
            i4.b0 r11 = i4.c0.a()
            throw r11
        L26d:
            r0.b()
            w4.c r1 = w4.c.f14874w
            r10.l(r1)
            goto L3bf
        L277:
            w4.c r1 = w4.c.E
            if (r13 != r1) goto L288
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            java.lang.Object r1 = r1.f470b
            i4.n r1 = (i4.n) r1
            w4.c r1 = r1.p(r3)
            goto L289
        L288:
            r1 = r13
        L289:
            java.lang.Object r2 = r10.f3059j
            b5.c r2 = (b5.c) r2
            r0.f(r2, r13)
            r10.l(r1)
            goto L3bf
        L295:
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            w4.c r2 = w4.c.f14871t
            r0.g(r1, r13, r2)
            goto L3bf
        L2a0:
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            r0.f(r1, r13)
            goto L3bf
        L2a9:
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            r0.g(r1, r13, r13)
            goto L3bf
        L2b2:
            java.lang.Object r6 = r10.f3059j
            b5.c r6 = (b5.c) r6
            java.lang.Object r6 = r6.f470b
            i4.n r6 = (i4.n) r6
            boolean r7 = r13.q()
            if (r7 == 0) goto L2c2
            r7 = r5
            goto L2c3
        L2c2:
            r7 = r1
        L2c3:
            w4.c r8 = r6.p(r7)
            int r9 = r6.f6473i
            if (r7 >= r9) goto L347
            java.lang.Object r2 = r6.f6475k
            boolean[] r2 = (boolean[]) r2
            int r9 = r9 - r7
            int r9 = r9 - r4
            boolean r2 = r2[r9]
            w4.c r6 = i4.c0.b(r13, r8)
            if (r2 == 0) goto L2e2
            w4.c r13 = w4.c.f14875x
            if (r6 != r13) goto L2de
            goto L2e2
        L2de:
            w4.c r13 = r6.k()
        L2e2:
            java.lang.Object r2 = r10.f3059j
            b5.c r2 = (b5.c) r2
            w4.c r7 = w4.c.f14871t
            r0.d(r1, r2)
            w4.d[] r1 = r0.f6415b
            r1 = r1[r3]
            boolean r1 = x6.d.I(r6, r1)
            if (r1 == 0) goto L333
            w4.d[] r1 = r0.f6415b
            r1 = r1[r4]
            boolean r1 = x6.d.I(r7, r1)
            if (r1 == 0) goto L31f
            w4.d[] r1 = r0.f6415b
            r1 = r1[r5]
            boolean r1 = x6.d.I(r13, r1)
            if (r1 == 0) goto L30b
            goto L3bf
        L30b:
            java.lang.String r11 = r13.a()
            w4.d[] r12 = r0.f6415b
            r12 = r12[r5]
            w4.c r12 = r12.getType()
            java.lang.String r12 = r12.a()
            g1.d.e(r11, r12)
            return
        L31f:
            java.lang.String r11 = r7.a()
            w4.d[] r12 = r0.f6415b
            r12 = r12[r4]
            w4.c r12 = r12.getType()
            java.lang.String r12 = r12.a()
            g1.d.e(r11, r12)
            return
        L333:
            java.lang.String r11 = r6.a()
            w4.d[] r12 = r0.f6415b
            r12 = r12[r3]
            w4.c r12 = r12.getType()
            java.lang.String r12 = r12.a()
            g1.d.e(r11, r12)
            return
        L347:
            i4.b0 r11 = new i4.b0
            java.lang.String r12 = "stack: underflow"
            r11.<init>(r12, r2)
            throw r11
        L34f:
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            java.lang.Object r1 = r1.f470b
            i4.n r1 = (i4.n) r1
            w4.c r1 = r1.p(r4)
            w4.c r13 = i4.c0.b(r13, r1)
            w4.c r1 = w4.c.f14875x
            if (r13 != r1) goto L364
            goto L368
        L364:
            w4.c r1 = r13.k()
        L368:
            java.lang.Object r2 = r10.f3059j
            b5.c r2 = (b5.c) r2
            w4.c r3 = w4.c.f14871t
            r0.g(r2, r13, r3)
            r13 = r1
            goto L3bf
        L373:
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            w4.c r2 = w4.c.E
            r0.f(r1, r2)
            goto L3bf
        L37d:
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            java.lang.Object r1 = r1.f470b
            i4.n r1 = (i4.n) r1
            w4.c r1 = r1.p(r3)
            boolean r3 = r1.p()
            if (r3 != 0) goto L3b2
            w4.c r3 = w4.c.f14875x
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L398
            goto L3b2
        L398:
            java.lang.Object r11 = r10.f3060k
            i4.c0 r11 = (i4.c0) r11
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "type mismatch: expected array type but encountered "
            r12.<init>(r13)
            java.lang.String r13 = r1.a()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.g(r12)
            throw r2
        L3b2:
            java.lang.Object r1 = r10.f3059j
            b5.c r1 = (b5.c) r1
            w4.c r2 = w4.c.E
            r0.f(r1, r2)
            goto L3bf
        L3bc:
            r0.b()
        L3bf:
            r0.f6417d = r13
            java.lang.Object r13 = r10.f3059j
            b5.c r13 = (b5.c) r13
            r0.h(r12, r11, r13)
            return
    }

    @Override // i4.k
    public void b(int r11, int r12, int r13, v4.a r14, int r15) {
            r10 = this;
            r13 = 13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r0 = 26
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r10.f3060k
            i4.c0 r2 = (i4.c0) r2
            java.lang.Object r3 = r2.f6448f
            n4.a r3 = (n4.a) r3
            java.lang.Object r4 = r10.f3058i
            i4.a0 r4 = (i4.a0) r4
            r5 = 18
            r6 = 0
            if (r11 == r5) goto L180
            r5 = 19
            if (r11 == r5) goto L180
            r5 = 189(0xbd, float:2.65E-43)
            if (r11 == r5) goto L176
            r5 = 197(0xc5, float:2.76E-43)
            r7 = 0
            if (r11 == r5) goto L142
            r5 = 192(0xc0, float:2.69E-43)
            if (r11 == r5) goto L138
            r5 = 193(0xc1, float:2.7E-43)
            if (r11 == r5) goto L138
            switch(r11) {
                case 179: goto L127;
                case 180: goto L138;
                case 181: goto L114;
                case 182: goto L6e;
                case 183: goto L6e;
                case 184: goto L6e;
                case 185: goto L6e;
                case 186: goto L3a;
                default: goto L35;
            }
        L35:
            r4.b()
            goto L193
        L3a:
            boolean r0 = r3.a(r0)
            if (r0 == 0) goto L5c
            v4.q r14 = (v4.q) r14
            w4.a r13 = r14.f14116i
            java.lang.Object r0 = r10.f3059j
            b5.c r0 = (b5.c) r0
            r4.e(r0, r13)
            v4.i r13 = new v4.i
            java.util.ArrayList r0 = r14.f14119l
            int r1 = r0.size()
            r13.<init>(r14, r1)
            r0.add(r13)
            r14 = r13
            goto L193
        L5c:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r1, r13}
            java.lang.String r12 = "invalid opcode %02x - invokedynamic requires --min-sdk-version >= %d (currently %d)"
            java.lang.String r11 = java.lang.String.format(r12, r11)
            r2.g(r11)
            throw r6
        L6e:
            boolean r5 = r14 instanceof v4.p
            r8 = 184(0xb8, float:2.58E-43)
            if (r5 == 0) goto Laf
            v4.p r14 = (v4.p) r14
            v4.y r14 = r14.l()
            r5 = 185(0xb9, float:2.59E-43)
            if (r11 != r5) goto L7f
            goto Laf
        L7f:
            r5 = 24
            boolean r9 = r3.a(r5)
            if (r9 == 0) goto L88
            goto Laf
        L88:
            if (r11 != r8) goto L8d
            java.lang.String r11 = "static"
            goto L8f
        L8d:
            java.lang.String r11 = "default"
        L8f:
            v4.d0 r12 = r14.f14125g
            w4.c r12 = r12.f14088g
            java.lang.String r12 = r12.a()
            v4.z r14 = r14.f14126h
            java.lang.String r14 = r14.a()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r12, r14, r15, r13}
            java.lang.String r12 = "invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (blocked at current API level %d)"
            java.lang.String r11 = java.lang.String.format(r12, r11)
            r2.g(r11)
            throw r6
        Laf:
            boolean r5 = r14 instanceof v4.y
            if (r5 == 0) goto Lf0
            r5 = r14
            v4.y r5 = (v4.y) r5
            boolean r5 = r5.k()
            if (r5 == 0) goto Lf0
            boolean r0 = r3.a(r0)
            if (r0 == 0) goto Le2
            r13 = 182(0xb6, float:2.55E-43)
            if (r11 != r13) goto Lc7
            goto Lf0
        Lc7:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Unsupported signature polymorphic invocation ("
            r12.<init>(r13)
            java.lang.String r11 = i4.h.a(r11)
            r12.append(r11)
            java.lang.String r11 = ")"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r2.g(r11)
            throw r6
        Le2:
            java.lang.String r11 = "invoking a signature-polymorphic requires --min-sdk-version >= %d (currently %d)"
            java.lang.Object[] r12 = new java.lang.Object[]{r1, r13}
            java.lang.String r11 = java.lang.String.format(r11, r12)
            r2.g(r11)
            throw r6
        Lf0:
            if (r11 != r8) goto Lf3
            r7 = 1
        Lf3:
            r13 = r14
            v4.y r13 = (v4.y) r13
            w4.a r0 = r13.f14090i
            if (r7 == 0) goto Lfb
            goto L10b
        Lfb:
            w4.a r1 = r13.f14091j
            if (r1 != 0) goto L109
            v4.d0 r1 = r13.f14125g
            w4.c r1 = r1.f14088g
            w4.a r0 = r0.e(r1)
            r13.f14091j = r0
        L109:
            w4.a r0 = r13.f14091j
        L10b:
            java.lang.Object r13 = r10.f3059j
            b5.c r13 = (b5.c) r13
            r4.e(r13, r0)
            goto L193
        L114:
            r13 = r14
            v4.m r13 = (v4.m) r13
            v4.z r13 = r13.f14126h
            w4.c r13 = r13.k()
            java.lang.Object r0 = r10.f3059j
            b5.c r0 = (b5.c) r0
            w4.c r1 = w4.c.E
            r4.g(r0, r1, r13)
            goto L193
        L127:
            r13 = r14
            v4.m r13 = (v4.m) r13
            v4.z r13 = r13.f14126h
            w4.c r13 = r13.k()
            java.lang.Object r0 = r10.f3059j
            b5.c r0 = (b5.c) r0
            r4.f(r0, r13)
            goto L193
        L138:
            java.lang.Object r13 = r10.f3059j
            b5.c r13 = (b5.c) r13
            w4.c r0 = w4.c.E
            r4.f(r13, r0)
            goto L193
        L142:
            w4.c r13 = w4.c.f14874w
            java.util.concurrent.ConcurrentHashMap r0 = w4.a.f14842k
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            r1 = 40
            r0.append(r1)
        L152:
            if (r7 >= r15) goto L15c
            r1 = 73
            r0.append(r1)
            int r7 = r7 + 1
            goto L152
        L15c:
            r1 = 41
            r0.append(r1)
            java.lang.String r13 = r13.f14878g
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            w4.a r13 = w4.a.d(r13)
            java.lang.Object r0 = r10.f3059j
            b5.c r0 = (b5.c) r0
            r4.e(r0, r13)
            goto L193
        L176:
            java.lang.Object r13 = r10.f3059j
            b5.c r13 = (b5.c) r13
            w4.c r0 = w4.c.f14871t
            r4.f(r13, r0)
            goto L193
        L180:
            boolean r0 = r14 instanceof v4.x
            if (r0 != 0) goto L188
            boolean r0 = r14 instanceof v4.a0
            if (r0 == 0) goto L190
        L188:
            r0 = 28
            boolean r1 = r3.a(r0)
            if (r1 == 0) goto L1a7
        L190:
            r4.b()
        L193:
            r4.f6418e = r15
            if (r14 == 0) goto L1a1
            r4.f6419f = r14
            java.lang.Object r13 = r10.f3059j
            b5.c r13 = (b5.c) r13
            r4.h(r12, r11, r13)
            return
        L1a1:
            java.lang.String r11 = "cst == null"
            bsh.j.c(r11)
            return
        L1a7:
            java.lang.String r11 = r14.j()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r12, r13}
            java.lang.String r12 = "invalid constant type %s requires --min-sdk-version >= %d (currently %d)"
            java.lang.String r11 = java.lang.String.format(r12, r11)
            r2.g(r11)
            throw r6
    }

    @Override // i4.k
    public void c(int r3, int r4, v4.d0 r5, java.util.ArrayList r6) {
            r2 = this;
            java.lang.Object r4 = r2.f3058i
            i4.a0 r4 = (i4.a0) r4
            java.lang.Object r0 = r2.f3059j
            b5.c r0 = (b5.c) r0
            w4.c r1 = w4.c.f14871t
            r4.f(r0, r1)
            r4.f6422i = r6
            if (r5 == 0) goto L1d
            r4.f6419f = r5
            java.lang.Object r5 = r2.f3059j
            b5.c r5 = (b5.c) r5
            r6 = 188(0xbc, float:2.63E-43)
            r4.h(r3, r6, r5)
            return
        L1d:
            java.lang.String r3 = "cst == null"
            bsh.j.c(r3)
            return
    }

    @Override // i4.k
    public void d(int r2, int r3) {
            r1 = this;
            i4.b0 r3 = new i4.b0
            java.lang.String r2 = a.a.W0(r2)
            java.lang.String r0 = "invalid opcode "
            java.lang.String r2 = r0.concat(r2)
            r0 = 0
            r3.<init>(r2, r0)
            throw r3
    }

    public void e(int r6, int r7) {
            r5 = this;
            java.lang.Object r0 = r5.f3060k
            int[] r0 = (int[]) r0
            r1 = 1
            r2 = 0
            if (r0 != 0) goto La
            r3 = r1
            goto Lb
        La:
            r3 = r2
        Lb:
            if (r6 != 0) goto L10
            if (r3 != 0) goto L10
            goto L18
        L10:
            if (r6 < 0) goto L4a
            if (r3 != 0) goto L19
            int r6 = r0.length
            if (r7 < r6) goto L18
            goto L19
        L18:
            return
        L19:
            int r7 = r7 + r1
            u4.q r6 = new u4.q
            r6.<init>(r7)
            int[] r7 = new int[r7]
            r0 = -1
            java.util.Arrays.fill(r7, r0)
            if (r3 != 0) goto L45
            java.lang.Object r0 = r5.f3059j
            u4.q r0 = (u4.q) r0
            u4.o[] r1 = r0.f13404h
            int r1 = r1.length
            r3 = r2
        L2f:
            if (r3 >= r1) goto L3d
            u4.o r4 = r0.l(r3)
            if (r4 == 0) goto L3a
            r6.m(r4)
        L3a:
            int r3 = r3 + 1
            goto L2f
        L3d:
            java.lang.Object r0 = r5.f3060k
            int[] r0 = (int[]) r0
            int r1 = r0.length
            java.lang.System.arraycopy(r0, r2, r7, r2, r1)
        L45:
            r5.f3059j = r6
            r5.f3060k = r7
            return
        L4a:
            java.lang.String r6 = "shouldn't happen"
            bsh.j.g(r6)
            return
    }

    @Override // i4.k
    public int f() {
            r1 = this;
            int r0 = r1.f3057h
            return r0
    }

    @Override // i4.k
    public void g(int r3, int r4, i4.n r5, int r6) {
            r2 = this;
            java.lang.Object r4 = r2.f3058i
            i4.a0 r4 = (i4.a0) r4
            java.lang.Object r0 = r2.f3059j
            b5.c r0 = (b5.c) r0
            w4.c r1 = w4.c.f14871t
            r4.f(r0, r1)
            r4.f6418e = r6
            r4.f6421h = r5
            java.lang.Object r5 = r2.f3059j
            b5.c r5 = (b5.c) r5
            r6 = 171(0xab, float:2.4E-43)
            r4.h(r3, r6, r5)
            return
    }

    @Override // i4.k
    public void h(int r3, int r4, int r5, int r6) {
            r2 = this;
            java.lang.Object r5 = r2.f3058i
            i4.a0 r5 = (i4.a0) r5
            switch(r3) {
                case 153: goto L31;
                case 154: goto L31;
                case 155: goto L31;
                case 156: goto L31;
                case 157: goto L31;
                case 158: goto L31;
                case 159: goto L27;
                case 160: goto L27;
                case 161: goto L27;
                case 162: goto L27;
                case 163: goto L27;
                case 164: goto L27;
                case 165: goto L1d;
                case 166: goto L1d;
                case 167: goto L19;
                case 168: goto L19;
                default: goto L7;
            }
        L7:
            switch(r3) {
                case 198: goto Lf;
                case 199: goto Lf;
                case 200: goto L19;
                case 201: goto L19;
                default: goto La;
            }
        La:
            r2.d(r3, r4)
            r3 = 0
            throw r3
        Lf:
            java.lang.Object r0 = r2.f3059j
            b5.c r0 = (b5.c) r0
            w4.c r1 = w4.c.E
            r5.f(r0, r1)
            goto L3a
        L19:
            r5.b()
            goto L3a
        L1d:
            java.lang.Object r0 = r2.f3059j
            b5.c r0 = (b5.c) r0
            w4.c r1 = w4.c.E
            r5.g(r0, r1, r1)
            goto L3a
        L27:
            java.lang.Object r0 = r2.f3059j
            b5.c r0 = (b5.c) r0
            w4.c r1 = w4.c.f14871t
            r5.g(r0, r1, r1)
            goto L3a
        L31:
            java.lang.Object r0 = r2.f3059j
            b5.c r0 = (b5.c) r0
            w4.c r1 = w4.c.f14871t
            r5.f(r0, r1)
        L3a:
            r5.f6420g = r6
            java.lang.Object r6 = r2.f3059j
            b5.c r6 = (b5.c) r6
            r5.h(r4, r3, r6)
            return
    }

    @Override // i4.k
    public void i(int r8, int r9, int r10, int r11, w4.c r12, int r13) {
            r7 = this;
            java.lang.Object r0 = r7.f3058i
            i4.a0 r0 = (i4.a0) r0
            r1 = 54
            if (r8 != r1) goto La
            int r10 = r10 + r9
            goto Lb
        La:
            r10 = r9
        Lb:
            java.lang.Object r2 = r7.f3060k
            i4.c0 r2 = (i4.c0) r2
            java.lang.Object r2 = r2.f6446d
            i4.r r2 = (i4.r) r2
            i4.q r10 = r2.o(r10, r11)
            r2 = 0
            if (r10 == 0) goto L2f
            v4.c0 r3 = r10.f6482d
            java.lang.String r3 = r3.f14067g
            w4.c r3 = w4.c.m(r3)
            int r4 = r3.f()
            int r5 = r12.f()
            if (r4 == r5) goto L30
            r3 = r12
            r10 = r2
            goto L30
        L2f:
            r3 = r12
        L30:
            r4 = 21
            r5 = 1
            r6 = 0
            if (r8 == r4) goto L9f
            if (r8 == r1) goto L7e
            r1 = 132(0x84, float:1.85E-43)
            if (r8 == r1) goto L45
            r13 = 169(0xa9, float:2.37E-43)
            if (r8 != r13) goto L41
            goto L9f
        L41:
            r7.d(r8, r9)
            throw r2
        L45:
            if (r10 != 0) goto L48
            goto L56
        L48:
            v4.c0 r1 = r10.f6481c
            v4.c0 r10 = r10.f6483e
            if (r1 != 0) goto L51
            if (r10 != 0) goto L51
            goto L56
        L51:
            u4.k r2 = new u4.k
            r2.<init>(r1, r10)
        L56:
            java.lang.Object r10 = r7.f3059j
            b5.c r10 = (b5.c) r10
            r0.b()
            w4.d[] r1 = r0.f6415b
            java.lang.Object r10 = r10.f469a
            i4.s r10 = (i4.s) r10
            w4.d r10 = r10.n(r11)
            r1[r6] = r10
            r0.f6416c = r5
            r0.f6423j = r11
            u4.o r10 = u4.o.k(r11, r3, r2)
            r0.f6425l = r10
            r0.f6417d = r12
            r0.f6418e = r13
            v4.o r10 = v4.o.o(r13)
            r0.f6419f = r10
            goto Lbe
        L7e:
            if (r10 != 0) goto L81
            goto L8f
        L81:
            v4.c0 r13 = r10.f6481c
            v4.c0 r10 = r10.f6483e
            if (r13 != 0) goto L8a
            if (r10 != 0) goto L8a
            goto L8f
        L8a:
            u4.k r2 = new u4.k
            r2.<init>(r13, r10)
        L8f:
            java.lang.Object r10 = r7.f3059j
            b5.c r10 = (b5.c) r10
            r0.f(r10, r12)
            r0.f6417d = r12
            u4.o r10 = u4.o.k(r11, r3, r2)
            r0.f6425l = r10
            goto Lbe
        L9f:
            java.lang.Object r13 = r7.f3059j
            b5.c r13 = (b5.c) r13
            r0.b()
            w4.d[] r1 = r0.f6415b
            java.lang.Object r13 = r13.f469a
            i4.s r13 = (i4.s) r13
            w4.d r13 = r13.n(r11)
            r1[r6] = r13
            r0.f6416c = r5
            r0.f6423j = r11
            if (r10 == 0) goto Lb9
            goto Lba
        Lb9:
            r5 = r6
        Lba:
            r0.f6424k = r5
            r0.f6417d = r12
        Lbe:
            java.lang.Object r10 = r7.f3059j
            b5.c r10 = (b5.c) r10
            r0.h(r9, r8, r10)
            return
    }

    public void j(int r4, int r5, u4.o r6) {
            r3 = this;
            int r0 = r6.f13400g
            java.lang.Object r1 = r3.f3058i
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            p4.n r2 = new p4.n
            r2.<init>(r4, r5, r6)
            r1.add(r2)
            java.lang.Object r4 = r3.f3059j
            u4.q r4 = (u4.q) r4
            r2 = 1
            if (r5 != r2) goto L20
            r4.m(r6)
            java.lang.Object r4 = r3.f3060k
            int[] r4 = (int[]) r4
            r5 = -1
            r4[r0] = r5
            return
        L20:
            r4.n(r6)
            java.lang.Object r4 = r3.f3060k
            int[] r4 = (int[]) r4
            int r5 = r1.size()
            int r5 = r5 - r2
            r4[r0] = r5
            return
    }

    public void k(int r6, int r7, u4.o r8) {
            r5 = this;
            java.lang.Object r0 = r5.f3058i
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r1 = 1
            if (r7 == r1) goto Lbc
            int r1 = r8.f13400g
            java.lang.Object r2 = r5.f3060k
            int[] r2 = (int[]) r2
            r1 = r2[r1]
            if (r1 < 0) goto L3b
            java.lang.Object r2 = r0.get(r1)
            p4.n r2 = (p4.n) r2
            int r3 = r2.f10215g
            u4.o r4 = r2.f10217i
            if (r3 != r6) goto L3b
            boolean r3 = r4.equals(r8)
            if (r3 == 0) goto L3b
            int r6 = r2.f10216h
            if (r7 != r6) goto L28
            goto L30
        L28:
            p4.n r6 = new p4.n
            int r2 = r2.f10215g
            r6.<init>(r2, r7, r4)
            r2 = r6
        L30:
            r0.set(r1, r2)
            java.lang.Object r6 = r5.f3059j
            u4.q r6 = (u4.q) r6
            r6.n(r8)
            return
        L3b:
            int r0 = r8.f13400g
            u4.o r8 = n(r8)
            r5.e(r6, r0)
            java.lang.Object r1 = r5.f3060k
            int[] r1 = (int[]) r1
            r0 = r1[r0]
            if (r0 < 0) goto L4e
            goto Lbb
        L4e:
            java.lang.Object r0 = r5.f3058i
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            r2 = 1
            int r1 = r1 - r2
        L58:
            if (r1 < 0) goto L77
            java.lang.Object r3 = r0.get(r1)
            p4.n r3 = (p4.n) r3
            if (r3 != 0) goto L63
            goto L74
        L63:
            int r4 = r3.f10215g
            if (r4 == r6) goto L6b
            r5.j(r6, r7, r8)
            goto Lbb
        L6b:
            u4.o r3 = r3.f10217i
            boolean r3 = r3.i(r8)
            if (r3 == 0) goto L74
            goto L77
        L74:
            int r1 = r1 + (-1)
            goto L58
        L77:
            java.lang.Object r7 = r5.f3059j
            u4.q r7 = (u4.q) r7
            r7.n(r8)
            r7 = 0
            r0.set(r1, r7)
            int r3 = r5.f3057h
            int r3 = r3 + r2
            r5.f3057h = r3
            int r8 = r8.f13400g
        L89:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L9d
            java.lang.Object r7 = r0.get(r1)
            p4.n r7 = (p4.n) r7
            if (r7 != 0) goto L96
            goto L89
        L96:
            u4.o r3 = r7.f10217i
            int r3 = r3.f13400g
            if (r3 != r8) goto L89
            goto L9e
        L9d:
            r2 = 0
        L9e:
            if (r2 == 0) goto Lbb
            java.lang.Object r2 = r5.f3060k
            int[] r2 = (int[]) r2
            r2[r8] = r1
            int r8 = r7.f10215g
            if (r8 != r6) goto Lbb
            int r6 = r7.f10216h
            r2 = 2
            if (r2 != r6) goto Lb0
            goto Lb8
        Lb0:
            p4.n r6 = new p4.n
            u4.o r7 = r7.f10217i
            r6.<init>(r8, r2, r7)
            r7 = r6
        Lb8:
            r0.set(r1, r7)
        Lbb:
            return
        Lbc:
            java.lang.String r6 = "shouldn't happen"
            bsh.j.g(r6)
            return
    }

    public void l(w4.c r5) {
            r4 = this;
            java.lang.Object r0 = r4.f3058i
            i4.a0 r0 = (i4.a0) r0
            w4.a r0 = r0.f6414a
            w4.c r0 = r0.f14844h
            boolean r1 = x6.d.I(r0, r5)
            if (r1 == 0) goto Lf
            return
        Lf:
            java.lang.Object r1 = r4.f3060k
            i4.c0 r1 = (i4.c0) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "return type mismatch: prototype indicates "
            r2.<init>(r3)
            java.lang.String r0 = r0.a()
            r2.append(r0)
            java.lang.String r0 = ", but encountered type "
            r2.append(r0)
            java.lang.String r5 = r5.a()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.g(r5)
            r5 = 0
            throw r5
    }

    public java.lang.Object m(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            if (r6 != r7) goto L3
            return r6
        L3:
            if (r6 != 0) goto L6
            return r7
        L6:
            if (r7 != 0) goto L9
            return r6
        L9:
            java.lang.Class r0 = r6.getClass()
            java.lang.Class<z7.o> r1 = z7.o.class
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L15
            r0 = r3
            goto L16
        L15:
            r0 = r2
        L16:
            java.lang.Class r4 = r7.getClass()
            if (r4 != r1) goto L1e
            r1 = r3
            goto L1f
        L1e:
            r1 = r2
        L1f:
            if (r0 != 0) goto L30
            if (r1 != 0) goto L30
            z7.o r0 = new z7.o
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}
            r0.<init>(r6)
            r5.E(r0)
            return r0
        L30:
            if (r0 == 0) goto L43
            if (r1 != 0) goto L43
            z7.o r6 = (z7.o) r6
            boolean r0 = r6.c(r7)
            if (r0 != 0) goto L42
            r6.add(r7)
            r5.E(r6)
        L42:
            return r6
        L43:
            if (r0 != 0) goto L54
            z7.o r7 = (z7.o) r7
            boolean r0 = r7.c(r6)
            if (r0 != 0) goto L53
            r7.add(r6)
            r5.E(r7)
        L53:
            return r7
        L54:
            z7.o r6 = (z7.o) r6
            z7.o r7 = (z7.o) r7
            java.util.Iterator r7 = r7.iterator()
        L5c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L71
            java.lang.Object r0 = r7.next()
            boolean r1 = r6.c(r0)
            if (r1 != 0) goto L5c
            r6.add(r0)
            r2 = r3
            goto L5c
        L71:
            if (r2 == 0) goto L76
            r5.E(r6)
        L76:
            return r6
    }

    public java.util.Iterator o(java.lang.String r4) {
            r3 = this;
            java.lang.Object r0 = r3.f3058i
            monitor-enter(r0)
            if (r4 != 0) goto Lb
            z7.h r4 = z7.h.f22606g     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r4
        L9:
            r4 = move-exception
            goto L35
        Lb:
            java.lang.Object r1 = r3.f3059j     // Catch: java.lang.Throwable -> L9
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L9
            if (r1 != 0) goto L15
            z7.h r4 = z7.h.f22606g     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r4
        L15:
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L9
            if (r4 != 0) goto L1f
            z7.h r4 = z7.h.f22606g     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r4
        L1f:
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L9
            java.lang.Class<z7.o> r2 = z7.o.class
            if (r1 != r2) goto L2f
            z7.o r4 = (z7.o) r4     // Catch: java.lang.Throwable -> L9
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r4
        L2f:
            java.util.Iterator r4 = z7.q.a(r4)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return r4
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r4
    }

    public int p() {
            r3 = this;
            java.lang.Object r0 = r3.f3058i
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            android.graphics.Paint$Cap r0 = r0.getStrokeCap()
            if (r0 != 0) goto Lc
            r0 = -1
            goto L14
        Lc:
            int[] r1 = f1.i.f3064a
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L14:
            r1 = 1
            if (r0 == r1) goto L20
            r2 = 2
            if (r0 == r2) goto L1f
            r1 = 3
            if (r0 == r1) goto L1e
            goto L20
        L1e:
            return r2
        L1f:
            return r1
        L20:
            r0 = 0
            return r0
    }

    public int q() {
            r3 = this;
            java.lang.Object r0 = r3.f3058i
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            android.graphics.Paint$Join r0 = r0.getStrokeJoin()
            if (r0 != 0) goto Lc
            r0 = -1
            goto L14
        Lc:
            int[] r1 = f1.i.f3065b
            int r0 = r0.ordinal()
            r0 = r1[r0]
        L14:
            r1 = 1
            if (r0 == r1) goto L20
            r2 = 2
            if (r0 == r2) goto L1f
            r2 = 3
            if (r0 == r2) goto L1e
            goto L20
        L1e:
            return r1
        L1f:
            return r2
        L20:
            r0 = 0
            return r0
    }

    public v4.a r(int r12, java.util.BitSet r13) {
            r11 = this;
            java.lang.String r0 = " at offset "
            java.lang.String r1 = "...while parsing cst "
            java.lang.Object r2 = r11.f3058i
            g8.b r2 = (g8.b) r2
            java.lang.String r3 = "Unsupported ref constant type for MethodHandle "
            java.lang.String r4 = "Unsupported MethodHandle kind: "
            java.lang.String r5 = "unknown tag byte: "
            java.lang.Object r6 = r11.f3059j
            v4.e0 r6 = (v4.e0) r6
            r6.getClass()
            v4.a[] r7 = r6.f14092h
            r8 = 0
            r9 = r7[r12]     // Catch: java.lang.IndexOutOfBoundsException -> L244
            if (r9 == 0) goto L1d
            return r9
        L1d:
            java.lang.Object r9 = r11.f3060k
            int[] r9 = (int[]) r9
            r9 = r9[r12]
            int r10 = r2.e(r9)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            switch(r10) {
                case 1: goto L1bc;
                case 2: goto L2a;
                case 3: goto L1b1;
                case 4: goto L1a5;
                case 5: goto L199;
                case 6: goto L18c;
                case 7: goto L174;
                case 8: goto L169;
                case 9: goto L14b;
                case 10: goto L12c;
                case 11: goto L10b;
                case 12: goto Lec;
                case 13: goto L2a;
                case 14: goto L2a;
                case 15: goto L70;
                case 16: goto L57;
                case 17: goto L2a;
                case 18: goto L3e;
                default: goto L2a;
            }     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
        L2a:
            l4.c r13 = new l4.c     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            java.lang.String r2 = a.a.W0(r10)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            java.lang.String r2 = r5.concat(r2)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            r13.<init>(r2, r8)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            throw r13     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
        L38:
            r13 = move-exception
            goto L203
        L3b:
            r13 = move-exception
            goto L226
        L3e:
            int r3 = r9 + 1
            int r3 = r2.g(r3)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            int r4 = r9 + 3
            int r2 = r2.g(r4)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.a r13 = r11.r(r2, r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.z r13 = (v4.z) r13     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.q r2 = new v4.q     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            r2.<init>(r3, r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            goto L1c3
        L57:
            int r3 = r9 + 1
            int r2 = r2.g(r3)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.a r13 = r11.r(r2, r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.c0 r13 = (v4.c0) r13     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            java.lang.String r13 = r13.f14067g     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            w4.a r13 = w4.a.b(r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.a0 r2 = new v4.a0     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            r2.<init>(r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            goto L1c3
        L70:
            int r5 = r9 + 1
            int r5 = r2.e(r5)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            int r10 = r9 + 2
            int r2 = r2.g(r10)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            switch(r5) {
                case 1: goto Lc2;
                case 2: goto Lc2;
                case 3: goto Lc2;
                case 4: goto Lc2;
                case 5: goto Lbb;
                case 6: goto L98;
                case 7: goto L98;
                case 8: goto Lbb;
                case 9: goto L91;
                default: goto L7f;
            }     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
        L7f:
            l4.c r13 = new l4.c     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            r2.<init>(r4)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            r2.append(r5)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            r13.<init>(r2, r8)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            throw r13     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
        L91:
            v4.a r13 = r11.r(r2, r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.p r13 = (v4.p) r13     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            goto Lc8
        L98:
            v4.a r13 = r11.r(r2, r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            boolean r2 = r13 instanceof v4.y     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            if (r2 != 0) goto Lc8
            boolean r2 = r13 instanceof v4.p     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            if (r2 == 0) goto La5
            goto Lc8
        La5:
            l4.c r2 = new l4.c     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            r4.<init>(r3)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            java.lang.Class r13 = r13.getClass()     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            r4.append(r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            java.lang.String r13 = r4.toString()     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            r2.<init>(r13, r8)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            throw r2     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
        Lbb:
            v4.a r13 = r11.r(r2, r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.y r13 = (v4.y) r13     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            goto Lc8
        Lc2:
            v4.a r13 = r11.r(r2, r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.m r13 = (v4.m) r13     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
        Lc8:
            switch(r5) {
                case 1: goto Le5;
                case 2: goto Le3;
                case 3: goto Le1;
                case 4: goto Ld4;
                case 5: goto Ldf;
                case 6: goto Ldd;
                case 7: goto Ldb;
                case 8: goto Ld9;
                case 9: goto Ld6;
                default: goto Lcb;
            }     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
        Lcb:
            java.lang.String r2 = "invalid kind: "
            java.lang.String r2 = eh.a.l(r5, r2)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            j8.o.t(r2)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
        Ld4:
            r2 = 0
            goto Le6
        Ld6:
            r2 = 8
            goto Le6
        Ld9:
            r2 = 6
            goto Le6
        Ldb:
            r2 = 7
            goto Le6
        Ldd:
            r2 = 4
            goto Le6
        Ldf:
            r2 = 5
            goto Le6
        Le1:
            r2 = 2
            goto Le6
        Le3:
            r2 = 1
            goto Le6
        Le5:
            r2 = 3
        Le6:
            v4.x r2 = v4.x.l(r2, r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            goto L1c3
        Lec:
            int r3 = r9 + 1
            int r3 = r2.g(r3)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.a r3 = r11.r(r3, r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.c0 r3 = (v4.c0) r3     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            int r4 = r9 + 3
            int r2 = r2.g(r4)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.a r13 = r11.r(r2, r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.c0 r13 = (v4.c0) r13     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.z r2 = new v4.z     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            r2.<init>(r3, r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            goto L1c3
        L10b:
            int r3 = r9 + 1
            int r3 = r2.g(r3)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.a r3 = r11.r(r3, r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.d0 r3 = (v4.d0) r3     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            int r4 = r9 + 3
            int r2 = r2.g(r4)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.a r13 = r11.r(r2, r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.z r13 = (v4.z) r13     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.p r2 = new v4.p     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            r2.<init>(r3, r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            r2.f14113k = r8     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            goto L1c3
        L12c:
            int r3 = r9 + 1
            int r3 = r2.g(r3)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.a r3 = r11.r(r3, r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.d0 r3 = (v4.d0) r3     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            int r4 = r9 + 3
            int r2 = r2.g(r4)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.a r13 = r11.r(r2, r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.z r13 = (v4.z) r13     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.y r2 = new v4.y     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            r2.<init>(r3, r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            goto L1c3
        L14b:
            int r3 = r9 + 1
            int r3 = r2.g(r3)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.a r3 = r11.r(r3, r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.d0 r3 = (v4.d0) r3     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            int r4 = r9 + 3
            int r2 = r2.g(r4)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.a r13 = r11.r(r2, r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.z r13 = (v4.z) r13     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.m r2 = new v4.m     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            r2.<init>(r3, r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            goto L1c3
        L169:
            int r3 = r9 + 1
            int r2 = r2.g(r3)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.a r2 = r11.r(r2, r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            goto L1c3
        L174:
            int r3 = r9 + 1
            int r2 = r2.g(r3)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.a r13 = r11.r(r2, r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.c0 r13 = (v4.c0) r13     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.d0 r2 = new v4.d0     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            java.lang.String r13 = r13.f14067g     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            w4.c r13 = w4.c.n(r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            r2.<init>(r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            goto L1c3
        L18c:
            int r13 = r9 + 1
            long r2 = r2.c(r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.k r13 = new v4.k     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            r13.<init>(r2)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
        L197:
            r2 = r13
            goto L1c3
        L199:
            int r13 = r9 + 1
            long r2 = r2.c(r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.v r13 = new v4.v     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            r13.<init>(r2)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            goto L197
        L1a5:
            int r13 = r9 + 1
            int r13 = r2.b(r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.n r2 = new v4.n     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            r2.<init>(r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            goto L1c3
        L1b1:
            int r13 = r9 + 1
            int r13 = r2.b(r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            v4.o r2 = v4.o.o(r13)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            goto L1c3
        L1bc:
            v4.c0 r2 = r11.t(r9)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
            r13.set(r12)     // Catch: java.lang.RuntimeException -> L38 l4.c -> L3b
        L1c3:
            r6.j()
            r13 = 1
            if (r2 == 0) goto L1d1
            boolean r0 = r2.i()
            if (r0 == 0) goto L1d1
            r0 = r13
            goto L1d2
        L1d1:
            r0 = 0
        L1d2:
            if (r12 < r13) goto L1fd
            if (r0 == 0) goto L1e6
            int r0 = r7.length
            int r0 = r0 - r13
            if (r12 == r0) goto L1df
            int r13 = r12 + 1
            r7[r13] = r8
            goto L1e6
        L1df:
            java.lang.String r12 = "(n == size - 1) && cst.isCategory2()"
            j8.o.t(r12)
        L1e4:
            r12 = 0
            return r12
        L1e6:
            if (r2 == 0) goto L1fa
            r13 = r7[r12]
            if (r13 != 0) goto L1fa
            int r13 = r12 + (-1)
            r0 = r7[r13]
            if (r0 == 0) goto L1fa
            boolean r0 = r0.i()
            if (r0 == 0) goto L1fa
            r7[r13] = r8
        L1fa:
            r7[r12] = r2
            return r2
        L1fd:
            java.lang.String r12 = "n < 1"
            j8.o.t(r12)
            goto L1e4
        L203:
            l4.c r2 = new l4.c
            r2.<init>(r8, r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r1)
            java.lang.String r12 = a.a.X0(r12)
            r13.append(r12)
            r13.append(r0)
            java.lang.String r12 = a.a.Y0(r9)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r2.a(r12)
            throw r2
        L226:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r12 = a.a.X0(r12)
            r2.append(r12)
            r2.append(r0)
            java.lang.String r12 = a.a.Y0(r9)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            r13.a(r12)
            throw r13
        L244:
            f4.a r13 = new f4.a
            java.lang.String r12 = a.a.X0(r12)
            java.lang.String r0 = "invalid constant pool index "
            java.lang.String r12 = r0.concat(r12)
            r13.<init>(r12, r8)
            throw r13
    }

    public void s() {
            r7 = this;
            int r0 = r7.f3057h
            if (r0 >= 0) goto Laa
            java.lang.Object r0 = r7.f3060k
            int[] r0 = (int[]) r0
            java.lang.Object r1 = r7.f3058i
            g8.b r1 = (g8.b) r1
            r2 = 10
            r3 = 1
            r4 = r3
        L10:
            int r5 = r0.length
            r6 = 0
            if (r4 >= r5) goto L77
            r0[r4] = r2
            int r5 = r1.e(r2)
            switch(r5) {
                case 1: goto L48;
                case 2: goto L1d;
                case 3: goto L3a;
                case 4: goto L3a;
                case 5: goto L44;
                case 6: goto L44;
                case 7: goto L3e;
                case 8: goto L3e;
                case 9: goto L3a;
                case 10: goto L3a;
                case 11: goto L3a;
                case 12: goto L3a;
                case 13: goto L1d;
                case 14: goto L1d;
                case 15: goto L41;
                case 16: goto L3e;
                case 17: goto L1d;
                case 18: goto L3a;
                default: goto L1d;
            }
        L1d:
            l4.c r0 = new l4.c     // Catch: l4.c -> L38
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: l4.c -> L38
            r1.<init>()     // Catch: l4.c -> L38
            java.lang.String r3 = "unknown tag byte: "
            r1.append(r3)     // Catch: l4.c -> L38
            java.lang.String r3 = a.a.W0(r5)     // Catch: l4.c -> L38
            r1.append(r3)     // Catch: l4.c -> L38
            java.lang.String r1 = r1.toString()     // Catch: l4.c -> L38
            r0.<init>(r1, r6)     // Catch: l4.c -> L38
            throw r0     // Catch: l4.c -> L38
        L38:
            r0 = move-exception
            goto L55
        L3a:
            int r2 = r2 + 5
        L3c:
            r5 = r3
            goto L53
        L3e:
            int r2 = r2 + 3
            goto L3c
        L41:
            int r2 = r2 + 4
            goto L3c
        L44:
            int r2 = r2 + 9
            r5 = 2
            goto L53
        L48:
            int r5 = r2 + 1
            int r5 = r1.g(r5)     // Catch: l4.c -> L38
            int r5 = r5 + 3
            int r5 = r5 + r2
            r2 = r5
            goto L3c
        L53:
            int r4 = r4 + r5
            goto L10
        L55:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "...while preparsing cst "
            r1.<init>(r3)
            java.lang.String r3 = a.a.X0(r4)
            r1.append(r3)
            java.lang.String r3 = " at offset "
            r1.append(r3)
            java.lang.String r2 = a.a.Y0(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.a(r1)
            throw r0
        L77:
            r7.f3057h = r2
            java.util.BitSet r1 = new java.util.BitSet
            int r2 = r0.length
            r1.<init>(r2)
        L7f:
            int r2 = r0.length
            if (r3 >= r2) goto Laa
            r2 = r0[r3]
            if (r2 == 0) goto La7
            java.lang.Object r2 = r7.f3059j
            v4.e0 r2 = (v4.e0) r2
            r2.getClass()
            v4.a[] r2 = r2.f14092h     // Catch: java.lang.IndexOutOfBoundsException -> L97
            r2 = r2[r3]     // Catch: java.lang.IndexOutOfBoundsException -> L97
            if (r2 != 0) goto La7
            r7.r(r3, r1)
            goto La7
        L97:
            f4.a r0 = new f4.a
            java.lang.String r1 = a.a.X0(r3)
            java.lang.String r2 = "invalid constant pool index "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1, r6)
            throw r0
        La7:
            int r3 = r3 + 1
            goto L7f
        Laa:
            return
    }

    public v4.c0 t(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f3058i
            g8.b r0 = (g8.b) r0
            int r1 = r3 + 1
            int r1 = r0.g(r1)
            int r3 = r3 + 3
            int r1 = r1 + r3
            g8.b r3 = r0.n(r3, r1)
            v4.c0 r0 = new v4.c0     // Catch: java.lang.IllegalArgumentException -> L17
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L17
            return r0
        L17:
            r3 = move-exception
            l4.c r0 = new l4.c
            r1 = 0
            r0.<init>(r1, r3)
            throw r0
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.f3056g
            switch(r0) {
                case 6: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "size = "
            r0.<init>(r1)
            java.lang.Object r1 = r3.f3058i
            monitor-enter(r1)
            java.lang.Object r2 = r3.f3059j     // Catch: java.lang.Throwable -> L1d
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L1d
            if (r2 != 0) goto L1f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            r1 = 0
            goto L25
        L1d:
            r0 = move-exception
            goto L2d
        L1f:
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            r1 = r2
        L25:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L2d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1d
            throw r0
    }

    public void u(float r4) {
            r3 = this;
            java.lang.Object r0 = r3.f3058i
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r1 = 1132396544(0x437f0000, float:255.0)
            float r4 = r4 * r1
            double r1 = (double) r4
            double r1 = java.lang.Math.rint(r1)
            float r4 = (float) r1
            int r4 = (int) r4
            r0.setAlpha(r4)
            return
    }

    public void v(int r4) {
            r3 = this;
            int r0 = r3.f3057h
            if (r0 != r4) goto L5
            return
        L5:
            r3.f3057h = r4
            java.lang.Object r0 = r3.f3058i
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L19
            android.graphics.BlendMode r4 = f1.c0.s(r4)
            f1.a.l(r0, r4)
            return
        L19:
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r4 = f1.c0.z(r4)
            r1.<init>(r4)
            r0.setXfermode(r1)
            return
    }

    public void w(long r2) {
            r1 = this;
            java.lang.Object r0 = r1.f3058i
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            int r2 = f1.c0.w(r2)
            r0.setColor(r2)
            return
    }

    public void x(f1.n r2) {
            r1 = this;
            r1.f3060k = r2
            java.lang.Object r0 = r1.f3058i
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            if (r2 == 0) goto Lb
            android.graphics.ColorFilter r2 = r2.f3077a
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r0.setColorFilter(r2)
            return
    }

    public void y(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f3058i
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r1 = 1
            if (r3 != 0) goto L9
            r3 = r1
            goto La
        L9:
            r3 = 0
        La:
            r3 = r3 ^ r1
            r0.setFilterBitmap(r3)
            return
    }

    public void z(android.graphics.Shader r2) {
            r1 = this;
            r1.f3059j = r2
            java.lang.Object r0 = r1.f3058i
            android.graphics.Paint r0 = (android.graphics.Paint) r0
            r0.setShader(r2)
            return
    }
}
