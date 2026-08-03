package i4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public static final v4.y E = null;
    public boolean A;
    public i4.v B;
    public u4.r C;
    public u4.t D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4.a f6414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w4.d[] f6415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w4.c f6417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v4.a f6419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f6420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i4.n f6421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f6422i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6423j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6424k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public u4.o f6425l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w4.d[] f6426m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6427n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i4.z f6428o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i4.m f6429p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h4.u f6430q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u4.e f6431r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f6432s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final java.util.ArrayList f6433t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public w4.b f6434u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f6435v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f6436w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6437x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f6438y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f6439z;

    static {
            v4.d0 r0 = new v4.d0
            java.lang.String r1 = "java/lang/reflect/Array"
            w4.c r1 = w4.c.n(r1)
            r0.<init>(r1)
            v4.y r1 = new v4.y
            v4.z r2 = new v4.z
            v4.c0 r3 = new v4.c0
            java.lang.String r4 = "newInstance"
            r3.<init>(r4)
            v4.c0 r4 = new v4.c0
            java.lang.String r5 = "(Ljava/lang/Class;[I)Ljava/lang/Object;"
            r4.<init>(r5)
            r2.<init>(r3, r4)
            r1.<init>(r0, r2)
            i4.a0.E = r1
            return
    }

    public a0(i4.z r2, i4.m r3, h4.u r4) {
            r1 = this;
            l4.b r0 = r3.f6467a
            w4.a r0 = r0.a()
            r1.<init>()
            if (r0 == 0) goto L51
            r1.f6414a = r0
            r0 = 10
            w4.d[] r0 = new w4.d[r0]
            r1.f6415b = r0
            r0 = 6
            w4.d[] r0 = new w4.d[r0]
            r1.f6426m = r0
            r1.b()
            if (r4 == 0) goto L4a
            r1.f6428o = r2
            r1.f6429p = r3
            r1.f6430q = r4
            u4.e r2 = u4.e.f13371a
            r1.f6431r = r2
            h4.c r2 = r3.f6469c
            int r2 = r2.f5075c
            r1.f6432s = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 25
            r2.<init>(r3)
            r1.f6433t = r2
            r2 = 0
            r1.f6434u = r2
            r3 = 0
            r1.f6435v = r3
            r1.f6436w = r3
            r4 = -1
            r1.f6437x = r4
            r1.f6438y = r3
            r1.A = r3
            r1.C = r2
            r1.D = r2
            return
        L4a:
            java.lang.String r2 = "methods == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
        L51:
            java.lang.String r2 = "prototype == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
    }

    public final w4.d a(int r2) {
            r1 = this;
            int r0 = r1.f6416c
            if (r2 >= r0) goto L10
            w4.d[] r0 = r1.f6415b     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9
            r2 = r0[r2]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L9
            return r2
        L9:
            java.lang.String r2 = "n < 0"
            j8.o.t(r2)
        Le:
            r2 = 0
            return r2
        L10:
            java.lang.String r2 = "n >= argCount"
            j8.o.t(r2)
            goto Le
    }

    public final void b() {
            r3 = this;
            r0 = 0
            r3.f6416c = r0
            r1 = 0
            r3.f6417d = r1
            r3.f6418e = r0
            r3.f6419f = r1
            r3.f6420g = r0
            r3.f6421h = r1
            r3.f6422i = r1
            r2 = -1
            r3.f6423j = r2
            r3.f6424k = r0
            r3.f6425l = r1
            r3.f6427n = r2
            return
    }

    public final u4.o c(boolean r6) {
            r5 = this;
            u4.o r0 = r5.f6425l
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r5.f6427n
            r2 = 1
            if (r0 == r2) goto L27
            i4.b0 r6 = new i4.b0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "local target with "
            r0.<init>(r2)
            int r2 = r5.f6427n
            if (r2 != 0) goto L1b
            java.lang.String r2 = "no"
            goto L1d
        L1b:
            java.lang.String r2 = "multiple"
        L1d:
            java.lang.String r3 = " results"
            java.lang.String r0 = eh.a.r(r0, r2, r3)
            r6.<init>(r0, r1)
            throw r6
        L27:
            w4.d[] r0 = r5.f6426m
            r2 = 0
            r0 = r0[r2]
            w4.c r2 = r0.getType()
            u4.o r3 = r5.f6425l
            w4.d r3 = r3.f13401h
            w4.c r3 = r3.getType()
            if (r2 != r3) goto L44
            u4.o r1 = r5.f6425l
            if (r6 == 0) goto L43
            u4.o r6 = r1.p(r0)
            return r6
        L43:
            return r1
        L44:
            boolean r6 = x6.d.I(r3, r2)
            if (r6 == 0) goto L59
            w4.c r6 = w4.c.E
            if (r3 != r6) goto L56
            u4.o r6 = r5.f6425l
            u4.o r6 = r6.p(r0)
            r5.f6425l = r6
        L56:
            u4.o r6 = r5.f6425l
            return r6
        L59:
            i4.b0 r6 = new i4.b0
            java.lang.String r0 = r2.a()
            java.lang.String r2 = r3.a()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "local variable type mismatch: attempt to set or access a value of type "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " using a local variable of type "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = ". This is symptomatic of .class transformation tools that ignore local variable information."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r6.<init>(r0, r1)
            throw r6
    }

    public final void d(int r9, b5.c r10) {
            r8 = this;
            java.lang.Object r10 = r10.f470b
            i4.n r10 = (i4.n) r10
            r8.b()
            w4.d[] r0 = r8.f6415b
            int r0 = r0.length
            if (r9 <= r0) goto L12
            int r0 = r9 + 10
            w4.d[] r0 = new w4.d[r0]
            r8.f6415b = r0
        L12:
            int r0 = r9 + (-1)
        L14:
            if (r0 < 0) goto L41
            w4.d[] r1 = r8.f6415b
            r10.j()
            r2 = 0
            w4.d r3 = r10.o(r2)
            java.lang.Object r4 = r10.f6474j
            w4.d[] r4 = (w4.d[]) r4
            int r5 = r10.f6473i
            int r6 = r5 + (-1)
            r7 = 0
            r4[r6] = r7
            java.lang.Object r4 = r10.f6475k
            boolean[] r4 = (boolean[]) r4
            r4[r6] = r2
            w4.c r2 = r3.getType()
            int r2 = r2.i()
            int r5 = r5 - r2
            r10.f6473i = r5
            r1[r0] = r3
            int r0 = r0 + (-1)
            goto L14
        L41:
            r8.f6416c = r9
            return
    }

    public final void e(b5.c r5, w4.a r6) {
            r4 = this;
            w4.b r6 = r6.f14845i
            java.lang.Object[] r0 = r6.f22543h
            int r0 = r0.length
            r4.d(r0, r5)
            r5 = 0
        L9:
            if (r5 >= r0) goto L5c
            java.lang.Object r1 = r6.l(r5)
            w4.c r1 = (w4.c) r1
            w4.d[] r2 = r4.f6415b
            r2 = r2[r5]
            boolean r1 = x6.d.I(r1, r2)
            if (r1 == 0) goto L1e
            int r5 = r5 + 1
            goto L9
        L1e:
            i4.b0 r1 = new i4.b0
            int r0 = r0 + (-1)
            int r0 = r0 - r5
            java.lang.Object r6 = r6.l(r5)
            w4.c r6 = (w4.c) r6
            java.lang.String r6 = r6.a()
            w4.d[] r2 = r4.f6415b
            r5 = r2[r5]
            w4.c r5 = r5.getType()
            java.lang.String r5 = r5.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "at stack depth "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", expected type "
            r2.append(r0)
            r2.append(r6)
            java.lang.String r6 = " but found "
            r2.append(r6)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r6 = 0
            r1.<init>(r5, r6)
            throw r1
        L5c:
            return
    }

    public final void f(b5.c r2, w4.c r3) {
            r1 = this;
            r0 = 1
            r1.d(r0, r2)
            w4.d[] r2 = r1.f6415b
            r0 = 0
            r2 = r2[r0]
            boolean r2 = x6.d.I(r3, r2)
            if (r2 == 0) goto L10
            return
        L10:
            java.lang.String r2 = r3.a()
            w4.d[] r3 = r1.f6415b
            r3 = r3[r0]
            w4.c r3 = r3.getType()
            java.lang.String r3 = r3.a()
            g1.d.e(r2, r3)
            return
    }

    public final void g(b5.c r2, w4.c r3, w4.c r4) {
            r1 = this;
            r0 = 2
            r1.d(r0, r2)
            w4.d[] r2 = r1.f6415b
            r0 = 0
            r2 = r2[r0]
            boolean r2 = x6.d.I(r3, r2)
            if (r2 == 0) goto L2f
            w4.d[] r2 = r1.f6415b
            r3 = 1
            r2 = r2[r3]
            boolean r2 = x6.d.I(r4, r2)
            if (r2 == 0) goto L1b
            return
        L1b:
            java.lang.String r2 = r4.a()
            w4.d[] r4 = r1.f6415b
            r3 = r4[r3]
            w4.c r3 = r3.getType()
            java.lang.String r3 = r3.a()
            g1.d.e(r2, r3)
            return
        L2f:
            java.lang.String r2 = r3.a()
            w4.d[] r3 = r1.f6415b
            r3 = r3[r0]
            w4.c r3 = r3.getType()
            java.lang.String r3 = r3.a()
            g1.d.e(r2, r3)
            return
    }

    public final void h(int r29, int r30, b5.c r31) {
            r28 = this;
            r1 = r28
            r0 = r29
            r2 = r30
            r3 = r31
            java.lang.Object r4 = r3.f470b
            i4.n r4 = (i4.n) r4
            java.lang.Object r3 = r3.f469a
            i4.s r3 = (i4.s) r3
            int r5 = r4.f6473i
            int r6 = r1.f6432s
            int r6 = r6 + r5
            int r5 = r1.f6416c
            java.lang.String r7 = "shouldn't happen"
            r8 = 0
            r9 = 2
            r10 = 1
            r11 = 0
            if (r5 != 0) goto L24
            u4.p r5 = u4.p.f13403i
        L21:
            r15 = r5
            goto L99
        L24:
            int r12 = r1.f6423j
            if (r12 < 0) goto L39
            u4.p r5 = new u4.p
            r5.<init>(r10)
            w4.d r13 = r1.a(r11)
            u4.o r12 = u4.o.k(r12, r13, r8)
            r5.m(r11, r12)
            goto L96
        L39:
            u4.p r12 = new u4.p
            r12.<init>(r5)
            r14 = r6
            r13 = r11
        L40:
            if (r13 >= r5) goto L55
            w4.d r15 = r1.a(r13)
            u4.o r15 = u4.o.k(r14, r15, r8)
            r12.m(r13, r15)
            int r15 = r15.j()
            int r14 = r14 + r15
            int r13 = r13 + 1
            goto L40
        L55:
            r13 = 79
            if (r2 == r13) goto L77
            r13 = 181(0xb5, float:2.54E-43)
            if (r2 == r13) goto L5e
            goto L95
        L5e:
            if (r5 != r9) goto L73
            java.lang.Object r5 = r12.l(r11)
            u4.o r5 = (u4.o) r5
            java.lang.Object r13 = r12.l(r10)
            u4.o r13 = (u4.o) r13
            r12.m(r11, r13)
            r12.m(r10, r5)
            goto L95
        L73:
            bsh.j.g(r7)
            return
        L77:
            r13 = 3
            if (r5 != r13) goto L800
            java.lang.Object r5 = r12.l(r11)
            u4.o r5 = (u4.o) r5
            java.lang.Object r13 = r12.l(r10)
            u4.o r13 = (u4.o) r13
            java.lang.Object r14 = r12.l(r9)
            u4.o r14 = (u4.o) r14
            r12.m(r11, r14)
            r12.m(r10, r5)
            r12.m(r9, r13)
        L95:
            r5 = r12
        L96:
            r5.f22555g = r11
            goto L21
        L99:
            java.lang.Object[] r5 = r15.f22543h
            int r5 = r5.length
            r12 = 172(0xac, float:2.41E-43)
            r13 = 171(0xab, float:2.4E-43)
            r14 = 21
            r31 = r9
            r9 = 20
            w4.d[] r8 = r1.f6426m
            if (r2 == 0) goto Lcf
            if (r2 == r9) goto L1b1
            if (r2 == r14) goto L1a8
            if (r2 == r13) goto Lcf
            if (r2 == r12) goto Lcf
            switch(r2) {
                case 0: goto Lcf;
                case 18: goto L1b1;
                case 46: goto Ldc;
                case 54: goto L1a8;
                case 79: goto Lcf;
                case 100: goto Ldc;
                case 104: goto Ldc;
                case 108: goto Ldc;
                case 112: goto Ldc;
                case 116: goto Ldc;
                case 120: goto Ldc;
                case 122: goto Ldc;
                case 124: goto Ldc;
                case 126: goto Ldc;
                case 128: goto Ldc;
                case 130: goto Ldc;
                default: goto Lb5;
            }
        Lb5:
            switch(r2) {
                case 87: goto Lcf;
                case 88: goto Lcf;
                case 89: goto L185;
                case 90: goto L185;
                case 91: goto L185;
                case 92: goto L185;
                case 93: goto L185;
                case 94: goto L185;
                case 95: goto L185;
                case 96: goto Ldc;
                default: goto Lb8;
            }
        Lb8:
            switch(r2) {
                case 132: goto Ldc;
                case 133: goto Ldc;
                case 134: goto Ldc;
                case 135: goto Ldc;
                case 136: goto Ldc;
                case 137: goto Ldc;
                case 138: goto Ldc;
                case 139: goto Ldc;
                case 140: goto Ldc;
                case 141: goto Ldc;
                case 142: goto Ldc;
                case 143: goto Ldc;
                case 144: goto Ldc;
                case 145: goto Ldc;
                case 146: goto Ldc;
                case 147: goto Ldc;
                case 148: goto Ldc;
                case 149: goto Ldc;
                case 150: goto Ldc;
                case 151: goto Ldc;
                case 152: goto Ldc;
                case 153: goto Lcf;
                case 154: goto Lcf;
                case 155: goto Lcf;
                case 156: goto Lcf;
                case 157: goto Lcf;
                case 158: goto Lcf;
                case 159: goto Lcf;
                case 160: goto Lcf;
                case 161: goto Lcf;
                case 162: goto Lcf;
                case 163: goto Lcf;
                case 164: goto Lcf;
                case 165: goto Lcf;
                case 166: goto Lcf;
                case 167: goto Lcf;
                case 168: goto L178;
                case 169: goto Lcf;
                default: goto Lbb;
            }
        Lbb:
            switch(r2) {
                case 177: goto Lcf;
                case 178: goto L163;
                case 179: goto Lcf;
                case 180: goto L163;
                case 181: goto Lcf;
                case 182: goto L163;
                case 183: goto L11b;
                case 184: goto L163;
                case 185: goto L163;
                case 186: goto L106;
                case 187: goto Lf8;
                case 188: goto Lee;
                case 189: goto Le0;
                case 190: goto Ldc;
                case 191: goto Lcf;
                case 192: goto Lee;
                case 193: goto Ld3;
                case 194: goto Lcf;
                case 195: goto Lcf;
                default: goto Lbe;
            }
        Lbe:
            switch(r2) {
                case 197: goto Lee;
                case 198: goto Lcf;
                case 199: goto Lcf;
                default: goto Lc1;
            }
        Lc1:
            java.lang.String r0 = a.a.W0(r2)
            java.lang.String r2 = "shouldn't happen: "
            java.lang.String r0 = r2.concat(r0)
            bsh.j.g(r0)
            return
        Lcf:
            r20 = r10
            goto L1c4
        Ld3:
            w4.c r12 = w4.c.f14871t
            r1.i(r12)
        Ld8:
            r20 = r10
            goto L1c6
        Ldc:
            r20 = r10
            goto L1ab
        Le0:
            v4.a r12 = r1.f6419f
            v4.d0 r12 = (v4.d0) r12
            w4.c r12 = r12.f14088g
            w4.c r12 = r12.e()
            r1.i(r12)
            goto Ld8
        Lee:
            v4.a r12 = r1.f6419f
            v4.d0 r12 = (v4.d0) r12
            w4.c r12 = r12.f14088g
            r1.i(r12)
            goto Ld8
        Lf8:
            v4.a r12 = r1.f6419f
            v4.d0 r12 = (v4.d0) r12
            w4.c r12 = r12.f14088g
            w4.c r12 = r12.d(r0)
            r1.i(r12)
            goto Ld8
        L106:
            v4.a r12 = r1.f6419f
            v4.i r12 = (v4.i) r12
            v4.q r12 = r12.f14096g
            w4.a r12 = r12.f14116i
            w4.c r12 = r12.f14844h
            w4.c r13 = w4.c.f14874w
            if (r12 != r13) goto L117
            r1.f6427n = r11
            goto Ld8
        L117:
            r1.i(r12)
            goto Ld8
        L11b:
            w4.d r12 = r1.a(r11)
            w4.c r12 = r12.getType()
            int r13 = r12.f14880i
            if (r13 < 0) goto L14c
            r3.p(r12)
            int r13 = r4.f6473i
            if (r13 != 0) goto L12f
            goto L14c
        L12f:
            r4.j()
            w4.c r13 = r12.l()
            r14 = r11
        L137:
            int r9 = r4.f6473i
            if (r14 >= r9) goto L14c
            java.lang.Object r9 = r4.f6474j
            w4.d[] r9 = (w4.d[]) r9
            r20 = r10
            r10 = r9[r14]
            if (r10 != r12) goto L147
            r9[r14] = r13
        L147:
            int r14 = r14 + 1
            r10 = r20
            goto L137
        L14c:
            r20 = r10
            v4.a r9 = r1.f6419f
            w4.d r9 = (w4.d) r9
            w4.c r9 = r9.getType()
            w4.c r10 = w4.c.f14874w
            if (r9 != r10) goto L15e
            r1.f6427n = r11
            goto L1c6
        L15e:
            r1.i(r9)
            goto L1c6
        L163:
            r20 = r10
            v4.a r9 = r1.f6419f
            w4.d r9 = (w4.d) r9
            w4.c r9 = r9.getType()
            w4.c r10 = w4.c.f14874w
            if (r9 != r10) goto L174
            r1.f6427n = r11
            goto L1c6
        L174:
            r1.i(r9)
            goto L1c6
        L178:
            r20 = r10
            i4.v r9 = new i4.v
            int r10 = r1.f6420g
            r9.<init>(r10)
            r1.i(r9)
            goto L1c6
        L185:
            r20 = r10
            r1.f6427n = r11
            int r9 = r1.f6418e
        L18b:
            if (r9 == 0) goto L1c6
            r10 = r9 & 15
            int r10 = r10 + (-1)
            w4.d r10 = r1.a(r10)
            if (r10 == 0) goto L1a2
            int r12 = r1.f6427n
            r8[r12] = r10
            int r12 = r12 + 1
            r1.f6427n = r12
            int r9 = r9 >> 4
            goto L18b
        L1a2:
            java.lang.String r0 = "result == null"
            bsh.j.c(r0)
            return
        L1a8:
            r20 = r10
            goto L1b4
        L1ab:
            w4.c r9 = r1.f6417d
            r1.i(r9)
            goto L1c6
        L1b1:
            r20 = r10
            goto L1bc
        L1b4:
            w4.d r9 = r1.a(r11)
            r1.i(r9)
            goto L1c6
        L1bc:
            v4.a r9 = r1.f6419f
            w4.d r9 = (w4.d) r9
            r1.i(r9)
            goto L1c6
        L1c4:
            r1.f6427n = r11
        L1c6:
            int r9 = r1.f6427n
            java.lang.String r10 = "results never set"
            if (r9 < 0) goto L7f9
            if (r9 != 0) goto L1cf
            goto L1f7
        L1cf:
            u4.o r9 = r1.f6425l
            if (r9 == 0) goto L1db
            u4.o r4 = r1.c(r11)
            r3.t(r4)
            goto L1f7
        L1db:
            r3 = r11
        L1dc:
            int r9 = r1.f6427n
            if (r3 >= r9) goto L1f7
            boolean r9 = r1.f6424k
            if (r9 == 0) goto L1ef
            r4.j()
            java.lang.Object r9 = r4.f6475k
            boolean[] r9 = (boolean[]) r9
            int r12 = r4.f6473i
            r9[r12] = r20
        L1ef:
            r9 = r8[r3]
            r4.q(r9)
            int r3 = r3 + 1
            goto L1dc
        L1f7:
            i4.m r3 = r1.f6429p
            u4.t r23 = r3.f(r0)
            l4.b r0 = r3.f6467a
            r3 = 54
            if (r2 != r3) goto L206
            r3 = r20
            goto L207
        L206:
            r3 = r11
        L207:
            u4.o r3 = r1.c(r3)
            int r4 = r1.f6427n
            if (r4 < 0) goto L7f2
            java.util.ArrayList r9 = r1.f6433t
            if (r4 != 0) goto L21d
            r3 = 87
            if (r2 == r3) goto L7f1
            r3 = 88
            if (r2 == r3) goto L7f1
            r3 = 0
            goto L22d
        L21d:
            if (r3 == 0) goto L220
            goto L22d
        L220:
            r3 = r20
            if (r4 != r3) goto L78a
            if (r4 <= 0) goto L784
            r3 = r8[r11]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L77e
            r4 = 0
            u4.o r3 = u4.o.k(r6, r3, r4)
        L22d:
            if (r3 == 0) goto L231
            r4 = r3
            goto L233
        L231:
            w4.c r4 = w4.c.f14874w
        L233:
            v4.a r6 = r1.f6419f
            r8 = 197(0xc5, float:2.76E-43)
            r12 = 6
            if (r2 != r8) goto L382
            r8 = 1
            r1.A = r8
            r1.f6438y = r12
            int r2 = r3.f13400g
            int r8 = r3.j()
            int r8 = r8 + r2
            int r2 = r3.f13400g
            w4.c r13 = w4.c.W
            r14 = 0
            u4.o r8 = u4.o.k(r8, r13, r14)
            u4.r r14 = u4.s.f13413a
            r13.getClass()
            w4.c r14 = r13.k()
            boolean r21 = r14.r()
            if (r21 != 0) goto L37c
            if (r5 < 0) goto L376
            w4.b r13 = new w4.b
            r13.<init>(r5)
            r12 = r11
        L266:
            if (r12 >= r5) goto L26e
            r13.m(r12, r14)
            int r12 = r12 + 1
            goto L266
        L26e:
            u4.r r12 = new u4.r
            r14 = 42
            w4.b r11 = u4.f.f13372a
            r12.<init>(r14, r13, r11)
            r13 = r12
            u4.v r12 = new u4.v
            w4.b r11 = r1.f6434u
            r14 = 171(0xab, float:2.4E-43)
            v4.d0 r17 = v4.d0.f14087z
            r16 = r11
            r14 = r23
            r11 = 21
            r19 = 6
            r12.<init>(r13, r14, r15, r16, r17)
            r9.add(r12)
            w4.c r12 = w4.c.W
            u4.r r12 = u4.s.i(r12)
            u4.m r13 = new u4.m
            u4.p r15 = u4.p.f13403i
            r13.<init>(r12, r14, r8, r15)
            r9.add(r13)
            r12 = r6
            v4.d0 r12 = (v4.d0) r12
            w4.c r12 = r12.f14088g
            r13 = 0
        L2a4:
            if (r13 >= r5) goto L2ad
            w4.c r12 = r12.k()
            int r13 = r13 + 1
            goto L2a4
        L2ad:
            w4.c r13 = w4.c.f14877z
            r15 = 0
            u4.o r13 = u4.o.k(r2, r13, r15)
            int r15 = r12.f14879h
            switch(r15) {
                case 0: goto L2d2;
                case 1: goto L2d2;
                case 2: goto L2d2;
                case 3: goto L2d2;
                case 4: goto L2d2;
                case 5: goto L2d2;
                case 6: goto L2d2;
                case 7: goto L2d2;
                case 8: goto L2d2;
                default: goto L2b9;
            }
        L2b9:
            u4.v r21 = new u4.v
            u4.r r22 = u4.s.f13477q
            u4.p r24 = u4.p.f13403i
            w4.b r15 = r1.f6434u
            v4.d0 r11 = new v4.d0
            r11.<init>(r12)
            r26 = r11
            r23 = r14
            r25 = r15
            r21.<init>(r22, r23, r24, r25, r26)
        L2cf:
            r11 = r21
            goto L312
        L2d2:
            r23 = r14
            v4.m r11 = new v4.m
            java.util.concurrent.ConcurrentHashMap r14 = v4.d0.f14070i
            switch(r15) {
                case 0: goto L2f9;
                case 1: goto L2f6;
                case 2: goto L2f3;
                case 3: goto L2f0;
                case 4: goto L2ed;
                case 5: goto L2ea;
                case 6: goto L2e7;
                case 7: goto L2e4;
                case 8: goto L2e1;
                default: goto L2db;
            }
        L2db:
            java.lang.String r0 = "not primitive: "
            g1.d.f(r12, r0)
            return
        L2e1:
            v4.d0 r12 = v4.d0.f14079r
            goto L2fb
        L2e4:
            v4.d0 r12 = v4.d0.f14077p
            goto L2fb
        L2e7:
            v4.d0 r12 = v4.d0.f14078q
            goto L2fb
        L2ea:
            v4.d0 r12 = v4.d0.f14076o
            goto L2fb
        L2ed:
            v4.d0 r12 = v4.d0.f14075n
            goto L2fb
        L2f0:
            v4.d0 r12 = v4.d0.f14074m
            goto L2fb
        L2f3:
            v4.d0 r12 = v4.d0.f14073l
            goto L2fb
        L2f6:
            v4.d0 r12 = v4.d0.f14072k
            goto L2fb
        L2f9:
            v4.d0 r12 = v4.d0.f14080s
        L2fb:
            v4.z r14 = v4.z.f14130i
            r11.<init>(r12, r14)
            u4.v r21 = new u4.v
            u4.r r22 = u4.s.f13503w2
            u4.p r24 = u4.p.f13403i
            w4.b r12 = r1.f6434u
            r26 = r11
            r25 = r12
            r21.<init>(r22, r23, r24, r25, r26)
            r14 = r23
            goto L2cf
        L312:
            r9.add(r11)
            w4.d r11 = r13.f13401h
            w4.c r11 = r11.getType()
            u4.r r11 = u4.s.j(r11)
            u4.m r12 = new u4.m
            u4.p r15 = u4.p.f13403i
            r12.<init>(r11, r14, r13, r15)
            r9.add(r12)
            w4.c r11 = w4.c.E
            r12 = 0
            u4.o r2 = u4.o.k(r2, r11, r12)
            u4.v r21 = new u4.v
            v4.y r11 = i4.a0.E
            w4.a r12 = r11.f14090i
            u4.r r10 = new u4.r
            w4.b r12 = r12.c()
            r17 = r0
            w4.b r0 = w4.b.f14854p
            r27 = r7
            r7 = 49
            r10.<init>(r7, r12, r0)
            u4.p r24 = u4.p.q(r13, r8)
            w4.b r0 = r1.f6434u
            r25 = r0
            r22 = r10
            r26 = r11
            r23 = r14
            r21.<init>(r22, r23, r24, r25, r26)
            r0 = r21
            r8 = r26
            r9.add(r0)
            w4.a r0 = r8.f14090i
            w4.c r0 = r0.f14844h
            u4.r r0 = u4.s.i(r0)
            u4.m r8 = new u4.m
            r8.<init>(r0, r14, r2, r15)
            r9.add(r8)
            u4.p r15 = u4.p.p(r2)
            r0 = 192(0xc0, float:2.69E-43)
            goto L3aa
        L376:
            java.lang.String r0 = "count < 0"
            j8.o.t(r0)
            return
        L37c:
            u4.s.p(r13)
            r18 = 0
            throw r18
        L382:
            r17 = r0
            r27 = r7
            r19 = r12
            r14 = r23
            r7 = 49
            r0 = 168(0xa8, float:2.35E-43)
            if (r2 != r0) goto L394
            r8 = 1
            r1.f6439z = r8
            return
        L394:
            r0 = 169(0xa9, float:2.37E-43)
            if (r2 != r0) goto L3a9
            r0 = 0
            w4.d r0 = r1.a(r0)     // Catch: java.lang.ClassCastException -> L3a2
            i4.v r0 = (i4.v) r0     // Catch: java.lang.ClassCastException -> L3a2
            r1.B = r0     // Catch: java.lang.ClassCastException -> L3a2
            return
        L3a2:
            r0 = move-exception
            java.lang.String r2 = "Argument to RET was not a ReturnAddress"
            ah.a.p(r2, r0)
            return
        L3a9:
            r0 = r2
        L3aa:
            r11 = 59
            r12 = 41
            if (r0 == 0) goto L4d2
            r7 = 20
            if (r0 == r7) goto L4d0
            r7 = 21
            if (r0 == r7) goto L4cd
            r7 = 171(0xab, float:2.4E-43)
            if (r0 == r7) goto L4ca
            r7 = 172(0xac, float:2.41E-43)
            if (r0 == r7) goto L4c7
            r7 = 198(0xc6, float:2.77E-43)
            if (r0 == r7) goto L4c5
            r7 = 199(0xc7, float:2.79E-43)
            if (r0 == r7) goto L4c2
            switch(r0) {
                case 0: goto L4d2;
                case 18: goto L4d0;
                case 46: goto L4bf;
                case 54: goto L4cd;
                case 79: goto L4bc;
                case 96: goto L4b9;
                case 100: goto L4b6;
                case 104: goto L4b3;
                case 108: goto L4b0;
                case 112: goto L4ad;
                case 116: goto L4aa;
                case 120: goto L4a7;
                case 122: goto L4a4;
                case 124: goto L4a1;
                case 126: goto L49e;
                case 128: goto L49b;
                case 130: goto L498;
                default: goto L3cb;
            }
        L3cb:
            switch(r0) {
                case 132: goto L4b9;
                case 133: goto L495;
                case 134: goto L495;
                case 135: goto L495;
                case 136: goto L495;
                case 137: goto L495;
                case 138: goto L495;
                case 139: goto L495;
                case 140: goto L495;
                case 141: goto L495;
                case 142: goto L495;
                case 143: goto L495;
                case 144: goto L495;
                case 145: goto L492;
                case 146: goto L48f;
                case 147: goto L48c;
                case 148: goto L489;
                case 149: goto L489;
                case 150: goto L485;
                case 151: goto L489;
                case 152: goto L485;
                case 153: goto L4c5;
                case 154: goto L4c2;
                case 155: goto L481;
                case 156: goto L47d;
                case 157: goto L479;
                case 158: goto L475;
                case 159: goto L4c5;
                case 160: goto L4c2;
                case 161: goto L481;
                case 162: goto L47d;
                case 163: goto L479;
                case 164: goto L475;
                case 165: goto L4c5;
                case 166: goto L4c2;
                case 167: goto L471;
                default: goto L3ce;
            }
        L3ce:
            switch(r0) {
                case 177: goto L4c7;
                case 178: goto L46d;
                case 179: goto L469;
                case 180: goto L465;
                case 181: goto L461;
                case 182: goto L41e;
                case 183: goto L3f9;
                case 184: goto L3f5;
                case 185: goto L3f2;
                case 186: goto L3ef;
                case 187: goto L3ec;
                case 188: goto L3e9;
                case 189: goto L3e9;
                case 190: goto L3e6;
                case 191: goto L3e3;
                case 192: goto L3e0;
                case 193: goto L3dd;
                case 194: goto L3da;
                case 195: goto L3d5;
                default: goto L3d1;
            }
        L3d1:
            bsh.j.g(r27)
            return
        L3d5:
            r7 = 37
        L3d7:
            r2 = r7
            goto L4d3
        L3da:
            r7 = 36
            goto L3d7
        L3dd:
            r7 = 44
            goto L3d7
        L3e0:
            r7 = 43
            goto L3d7
        L3e3:
            r7 = 35
            goto L3d7
        L3e6:
            r7 = 34
            goto L3d7
        L3e9:
            r2 = r12
            goto L4d3
        L3ec:
            r7 = 40
            goto L3d7
        L3ef:
            r2 = r11
            goto L4d3
        L3f2:
            r7 = 53
            goto L3d7
        L3f5:
            r2 = 49
            goto L4d3
        L3f9:
            r7 = r6
            v4.y r7 = (v4.y) r7
            v4.z r8 = r7.f14126h
            v4.c0 r8 = r8.f14131g
            java.lang.String r8 = r8.f14067g
            java.lang.String r10 = "<init>"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L41a
            v4.d0 r7 = r7.f14125g
            v4.d0 r8 = r17.b()
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L417
            goto L41a
        L417:
            r7 = 51
            goto L3d7
        L41a:
            r2 = 52
            goto L4d3
        L41e:
            r7 = r6
            v4.y r7 = (v4.y) r7
            v4.d0 r8 = r7.f14125g
            v4.d0 r10 = r17.b()
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L453
            r8 = 0
        L42e:
            h4.u r10 = r1.f6430q
            java.lang.Object[] r2 = r10.f22543h
            int r2 = r2.length
            if (r8 >= r2) goto L453
            java.lang.Object r2 = r10.l(r8)
            l4.b r2 = (l4.b) r2
            int r10 = r2.c()
            r10 = r10 & 2
            if (r10 == 0) goto L450
            v4.z r10 = r7.f14126h
            v4.z r2 = r2.d()
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L450
            goto L41a
        L450:
            int r8 = r8 + 1
            goto L42e
        L453:
            boolean r2 = r7.k()
            if (r2 == 0) goto L45d
            r2 = 58
            goto L4d3
        L45d:
            r2 = 50
            goto L4d3
        L461:
            r2 = 47
            goto L4d3
        L465:
            r2 = 45
            goto L4d3
        L469:
            r2 = 48
            goto L4d3
        L46d:
            r2 = 46
            goto L4d3
        L471:
            r2 = r19
            goto L4d3
        L475:
            r2 = 11
            goto L4d3
        L479:
            r2 = 12
            goto L4d3
        L47d:
            r2 = 10
            goto L4d3
        L481:
            r2 = 9
            goto L4d3
        L485:
            r2 = 28
            goto L4d3
        L489:
            r2 = 27
            goto L4d3
        L48c:
            r2 = 32
            goto L4d3
        L48f:
            r2 = 31
            goto L4d3
        L492:
            r2 = 30
            goto L4d3
        L495:
            r2 = 29
            goto L4d3
        L498:
            r2 = 22
            goto L4d3
        L49b:
            r2 = 21
            goto L4d3
        L49e:
            r2 = 20
            goto L4d3
        L4a1:
            r2 = 25
            goto L4d3
        L4a4:
            r2 = 24
            goto L4d3
        L4a7:
            r2 = 23
            goto L4d3
        L4aa:
            r2 = 19
            goto L4d3
        L4ad:
            r2 = 18
            goto L4d3
        L4b0:
            r2 = 17
            goto L4d3
        L4b3:
            r2 = 16
            goto L4d3
        L4b6:
            r2 = 15
            goto L4d3
        L4b9:
            r2 = 14
            goto L4d3
        L4bc:
            r2 = 39
            goto L4d3
        L4bf:
            r2 = 38
            goto L4d3
        L4c2:
            r2 = 8
            goto L4d3
        L4c5:
            r2 = 7
            goto L4d3
        L4c7:
            r2 = 33
            goto L4d3
        L4ca:
            r2 = 13
            goto L4d3
        L4cd:
            r2 = r31
            goto L4d3
        L4d0:
            r2 = 5
            goto L4d3
        L4d2:
            r2 = 1
        L4d3:
            u4.r r7 = u4.s.o(r2, r4, r15, r6)
            if (r3 == 0) goto L509
            boolean r8 = r7.f13411f
            if (r8 == 0) goto L509
            int r8 = r1.f6438y
            r20 = 1
            int r8 = r8 + 1
            r1.f6438y = r8
            int r8 = r7.f13406a
            if (r8 != r11) goto L4f3
            r8 = r6
            v4.i r8 = (v4.i) r8
            v4.q r8 = r8.f14096g
            w4.a r8 = r8.f14116i
            w4.c r8 = r8.f14844h
            goto L4fa
        L4f3:
            r8 = r6
            v4.y r8 = (v4.y) r8
            w4.a r8 = r8.f14090i
            w4.c r8 = r8.f14844h
        L4fa:
            u4.m r10 = new u4.m
            u4.r r8 = u4.s.i(r8)
            u4.p r11 = u4.p.f13403i
            r10.<init>(r8, r14, r3, r11)
            r8 = r10
        L506:
            r24 = 0
            goto L52a
        L509:
            if (r3 == 0) goto L527
            boolean r8 = r7.a()
            if (r8 == 0) goto L527
            int r8 = r1.f6438y
            r20 = 1
            int r8 = r8 + 1
            r1.f6438y = r8
            u4.m r8 = new u4.m
            w4.d r10 = r3.f13401h
            u4.r r10 = u4.s.j(r10)
            u4.p r11 = u4.p.f13403i
            r8.<init>(r10, r14, r3, r11)
            goto L506
        L527:
            r24 = r3
            r8 = 0
        L52a:
            if (r2 != r12) goto L538
            w4.c r3 = r7.f13407b
            v4.d0 r6 = v4.d0.l(r3)
        L532:
            r22 = r7
            r25 = r15
            goto L633
        L538:
            if (r6 != 0) goto L532
            r3 = r31
            if (r5 != r3) goto L532
            r3 = 0
            java.lang.Object r5 = r15.l(r3)
            u4.o r5 = (u4.o) r5
            w4.d r3 = r5.f13401h
            r5 = 1
            java.lang.Object r10 = r15.l(r5)
            u4.o r10 = (u4.o) r10
            w4.d r5 = r10.f13401h
            boolean r10 = r5.c()
            if (r10 != 0) goto L55c
            boolean r10 = r3.c()
            if (r10 == 0) goto L532
        L55c:
            r10 = 0
            java.lang.Object r11 = r15.l(r10)
            u4.o r11 = (u4.o) r11
            r10 = 1
            java.lang.Object r12 = r15.l(r10)
            u4.o r12 = (u4.o) r12
            u4.e r10 = r1.f6431r
            r10.getClass()
            w4.d r10 = r11.f13401h
            w4.c r11 = r10.getType()
            w4.c r13 = w4.c.f14871t
            if (r11 == r13) goto L57a
            goto L595
        L57a:
            w4.d r11 = r12.f13401h
            boolean r12 = r11 instanceof v4.o
            if (r12 != 0) goto L597
            boolean r11 = r10 instanceof v4.o
            if (r11 == 0) goto L595
            int r11 = r7.f13406a
            r12 = 15
            if (r11 != r12) goto L595
            v4.o r10 = (v4.o) r10
            int r10 = r10.l()
            short r11 = (short) r10
            if (r11 != r10) goto L595
        L593:
            r10 = 1
            goto L5ba
        L595:
            r10 = 0
            goto L5ba
        L597:
            v4.o r11 = (v4.o) r11
            int r10 = r11.f14121g
            int r12 = r7.f13406a
            switch(r12) {
                case 14: goto L5b2;
                case 15: goto L5a5;
                case 16: goto L5b2;
                case 17: goto L5b2;
                case 18: goto L5b2;
                case 19: goto L5a0;
                case 20: goto L5b2;
                case 21: goto L5b2;
                case 22: goto L5b2;
                case 23: goto L5a1;
                case 24: goto L5a1;
                case 25: goto L5a1;
                default: goto L5a0;
            }
        L5a0:
            goto L595
        L5a1:
            byte r11 = (byte) r10
            if (r11 != r10) goto L595
            goto L593
        L5a5:
            int r10 = -r10
            v4.o r10 = v4.o.o(r10)
            int r10 = r10.l()
            short r11 = (short) r10
            if (r11 != r10) goto L595
            goto L593
        L5b2:
            int r10 = r11.l()
            short r11 = (short) r10
            if (r11 != r10) goto L595
            goto L593
        L5ba:
            if (r10 == 0) goto L532
            boolean r6 = r5.c()
            if (r6 == 0) goto L602
            r3 = r5
            v4.a r3 = (v4.a) r3
            java.lang.Object[] r6 = r15.f22543h
            int r6 = r6.length
            r20 = 1
            int r6 = r6 + (-1)
            if (r6 != 0) goto L5d1
            u4.p r6 = u4.p.f13403i
            goto L5eb
        L5d1:
            u4.p r10 = new u4.p
            r10.<init>(r6)
            r11 = 0
        L5d7:
            if (r11 >= r6) goto L5e3
            java.lang.Object r12 = r15.l(r11)
            r10.m(r11, r12)
            int r11 = r11 + 1
            goto L5d7
        L5e3:
            boolean r6 = r15.f22555g
            if (r6 != 0) goto L5ea
            r6 = 0
            r10.f22555g = r6
        L5ea:
            r6 = r10
        L5eb:
            int r7 = r7.f13406a
            r12 = 15
            if (r7 != r12) goto L5ff
            v4.o r5 = (v4.o) r5
            int r2 = r5.f14121g
            int r2 = -r2
            v4.o r2 = v4.o.o(r2)
            r15 = r6
            r6 = r2
            r2 = 14
            goto L62d
        L5ff:
            r15 = r6
            r6 = r3
            goto L62d
        L602:
            v4.a r3 = (v4.a) r3
            java.lang.Object[] r5 = r15.f22543h
            int r5 = r5.length
            r20 = 1
            int r5 = r5 + (-1)
            if (r5 != 0) goto L610
            u4.p r5 = u4.p.f13403i
            goto L62b
        L610:
            u4.p r6 = new u4.p
            r6.<init>(r5)
            r7 = 0
        L616:
            if (r7 >= r5) goto L623
            int r10 = r7 + 1
            java.lang.Object r11 = r15.l(r10)
            r6.m(r7, r11)
            r7 = r10
            goto L616
        L623:
            boolean r5 = r15.f22555g
            if (r5 != 0) goto L62a
            r10 = 0
            r6.f22555g = r10
        L62a:
            r5 = r6
        L62b:
            r6 = r3
            r15 = r5
        L62d:
            u4.r r7 = u4.s.o(r2, r4, r15, r6)
            goto L532
        L633:
            i4.n r3 = r1.f6421h
            java.util.ArrayList r4 = r1.f6422i
            boolean r5 = r22.a()
            boolean r7 = r1.A
            r7 = r7 | r5
            r1.A = r7
            if (r3 == 0) goto L670
            int r0 = r3.f6473i
            if (r0 != 0) goto L657
            u4.m r0 = new u4.m
            u4.r r2 = u4.s.f13484s
            u4.p r3 = u4.p.f13403i
            r12 = 0
            r0.<init>(r2, r14, r12, r3)
            r10 = 0
            r1.f6437x = r10
        L653:
            r26 = r6
            goto L755
        L657:
            java.lang.Object r0 = r3.f6474j
            r26 = r0
            z4.g r26 = (z4.g) r26
            u4.u r21 = new u4.u
            r23 = r14
            r21.<init>(r22, r23, r24, r25, r26)
            r0 = r26
            int r0 = r0.f22552i
            r1.f6437x = r0
            r26 = r6
        L66c:
            r0 = r21
            goto L755
        L670:
            r7 = r22
            r15 = r25
            r3 = 33
            if (r2 != r3) goto L6e1
            java.lang.Object[] r0 = r15.f22543h
            int r0 = r0.length
            r10 = 0
            if (r0 == 0) goto L69c
            java.lang.Object r0 = r15.l(r10)
            u4.o r0 = (u4.o) r0
            w4.d r2 = r0.f13401h
            int r3 = r0.f13400g
            if (r3 == 0) goto L69c
            u4.m r3 = new u4.m
            u4.r r5 = u4.s.g(r2)
            r12 = 0
            u4.o r2 = u4.o.k(r10, r2, r12)
            r3.<init>(r5, r14, r2, r0)
            r9.add(r3)
            goto L69d
        L69c:
            r12 = 0
        L69d:
            u4.m r0 = new u4.m
            u4.r r2 = u4.s.f13484s
            u4.p r3 = u4.p.f13403i
            r0.<init>(r2, r14, r12, r3)
            r1.f6437x = r10
            u4.r r2 = r1.C
            if (r2 != 0) goto L6b2
            r1.C = r7
            r1.D = r14
        L6b0:
            r3 = 1
            goto L6bf
        L6b2:
            if (r2 != r7) goto L6c2
            int r2 = r14.f13518c
            u4.t r3 = r1.D
            int r3 = r3.f13518c
            if (r2 <= r3) goto L6b0
            r1.D = r14
            goto L6b0
        L6bf:
            r1.f6436w = r3
            goto L653
        L6c2:
            i4.b0 r0 = new i4.b0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "return op mismatch: "
            r2.<init>(r3)
            r2.append(r7)
            u4.r r3 = r1.C
            java.lang.String r4 = ", "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r12 = 0
            r0.<init>(r2, r12)
            throw r0
        L6e1:
            if (r6 == 0) goto L72f
            if (r5 == 0) goto L720
            int r0 = r7.f13406a
            w4.b r2 = r1.f6434u
            r3 = 58
            if (r0 != r3) goto L704
            r26 = r6
            v4.y r26 = (v4.y) r26
            u4.j r21 = new u4.j
            r25 = r2
            r22 = r7
            r23 = r14
            r24 = r15
            r21.<init>(r22, r23, r24, r25, r26)
            r26 = r6
        L700:
            r0 = r21
            r3 = 1
            goto L714
        L704:
            r25 = r2
            r22 = r7
            r23 = r14
            r24 = r15
            u4.v r21 = new u4.v
            r26 = r6
            r21.<init>(r22, r23, r24, r25, r26)
            goto L700
        L714:
            r1.f6435v = r3
            w4.b r2 = r1.f6434u
            java.lang.Object[] r2 = r2.f22543h
            int r2 = r2.length
            r1.f6437x = r2
            r14 = r23
            goto L755
        L720:
            r26 = r6
            r22 = r7
            r23 = r14
            r25 = r15
            u4.l r21 = new u4.l
            r21.<init>(r22, r23, r24, r25, r26)
            goto L66c
        L72f:
            r26 = r6
            r3 = r24
            if (r5 == 0) goto L750
            u4.u r2 = new u4.u
            w4.b r3 = r1.f6434u
            r2.<init>(r7, r14, r15, r3)
            r3 = 1
            r1.f6435v = r3
            r3 = 191(0xbf, float:2.68E-43)
            if (r0 != r3) goto L747
            r0 = -1
            r1.f6437x = r0
            goto L74e
        L747:
            w4.b r0 = r1.f6434u
            java.lang.Object[] r0 = r0.f22543h
            int r0 = r0.length
            r1.f6437x = r0
        L74e:
            r0 = r2
            goto L755
        L750:
            u4.m r0 = new u4.m
            r0.<init>(r7, r14, r3, r15)
        L755:
            r9.add(r0)
            if (r8 == 0) goto L75d
            r9.add(r8)
        L75d:
            if (r4 == 0) goto L7f1
            int r0 = r1.f6438y
            r20 = 1
            int r0 = r0 + 1
            r1.f6438y = r0
            u4.g r21 = new u4.g
            u4.r r22 = u4.s.T2
            u4.o r0 = r8.f13384i
            u4.p r24 = u4.p.p(r0)
            r25 = r4
            r23 = r14
            r21.<init>(r22, r23, r24, r25, r26)
            r0 = r21
            r9.add(r0)
            return
        L77e:
            java.lang.String r0 = "n < 0"
            j8.o.t(r0)
            return
        L784:
            java.lang.String r0 = "n >= resultCount"
            j8.o.t(r0)
            return
        L78a:
            r10 = r11
            r14 = r23
            i4.z r0 = r1.f6428o
            int r2 = r0.f6502c
            i4.m r3 = r0.f6500a
            h4.c r3 = r3.f6469c
            int r3 = r3.f5074b
            int r2 = r2 + r3
            boolean r0 = r0.i()
            if (r0 == 0) goto L7a0
            int r2 = r2 + 1
        L7a0:
            u4.o[] r0 = new u4.o[r5]
            r11 = r10
        L7a3:
            if (r11 >= r5) goto L7c7
            java.lang.Object r3 = r15.l(r11)
            u4.o r3 = (u4.o) r3
            w4.d r4 = r3.f13401h
            u4.o r7 = r3.o(r2)
            u4.m r8 = new u4.m
            u4.r r4 = u4.s.g(r4)
            r8.<init>(r4, r14, r7, r3)
            r9.add(r8)
            r0[r11] = r7
            int r3 = r3.j()
            int r2 = r2 + r3
            int r11 = r11 + 1
            goto L7a3
        L7c7:
            int r2 = r1.f6418e
        L7c9:
            if (r2 == 0) goto L7f1
            r3 = r2 & 15
            r20 = 1
            int r3 = r3 + (-1)
            r3 = r0[r3]
            w4.d r4 = r3.f13401h
            u4.m r5 = new u4.m
            u4.r r7 = u4.s.g(r4)
            u4.o r8 = r3.o(r6)
            r5.<init>(r7, r14, r8, r3)
            r9.add(r5)
            w4.c r3 = r4.getType()
            int r3 = r3.i()
            int r6 = r6 + r3
            int r2 = r2 >> 4
            goto L7c9
        L7f1:
            return
        L7f2:
            i4.b0 r0 = new i4.b0
            r12 = 0
            r0.<init>(r10, r12)
            throw r0
        L7f9:
            r12 = 0
            i4.b0 r0 = new i4.b0
            r0.<init>(r10, r12)
            throw r0
        L800:
            r27 = r7
            bsh.j.g(r27)
            return
    }

    public final void i(w4.d r3) {
            r2 = this;
            if (r3 == 0) goto Lb
            w4.d[] r0 = r2.f6426m
            r1 = 0
            r0[r1] = r3
            r3 = 1
            r2.f6427n = r3
            return
        Lb:
            java.lang.String r3 = "result == null"
            bsh.j.c(r3)
            return
    }
}
