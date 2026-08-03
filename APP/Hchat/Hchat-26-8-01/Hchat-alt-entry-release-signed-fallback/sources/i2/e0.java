package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p4.t f6292a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p4.t f6293b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p4.t f6294c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p4.t f6295d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p4.t f6296e = null;

    static {
            i2.y r0 = new i2.y
            r1 = 4
            r0.<init>(r1)
            i2.z r1 = new i2.z
            r2 = 2
            r1.<init>(r2)
            p4.t r2 = new p4.t
            r3 = 12
            r2.<init>(r0, r3, r1)
            i2.e0.f6292a = r2
            i2.y r0 = new i2.y
            r1 = 5
            r0.<init>(r1)
            i2.z r1 = new i2.z
            r2 = 3
            r1.<init>(r2)
            p4.t r2 = new p4.t
            r2.<init>(r0, r3, r1)
            i2.e0.f6293b = r2
            i2.y r0 = new i2.y
            r1 = 6
            r0.<init>(r1)
            i2.z r1 = new i2.z
            r2 = 4
            r1.<init>(r2)
            p4.t r2 = new p4.t
            r2.<init>(r0, r3, r1)
            i2.e0.f6294c = r2
            i2.y r0 = new i2.y
            r1 = 7
            r0.<init>(r1)
            i2.z r1 = new i2.z
            r2 = 5
            r1.<init>(r2)
            p4.t r2 = new p4.t
            r2.<init>(r0, r3, r1)
            i2.e0.f6295d = r2
            i2.y r0 = new i2.y
            r1 = 8
            r0.<init>(r1)
            i2.z r1 = new i2.z
            r2 = 6
            r1.<init>(r2)
            p4.t r2 = new p4.t
            r2.<init>(r0, r3, r1)
            i2.e0.f6296e = r2
            return
    }

    public static i2.a a(java.lang.String r7, i2.n0 r8, long r9, u2.c r11, m2.d r12, int r13, int r14) {
            r1 = r7
            i2.a r7 = new i2.a
            q2.d r0 = new q2.d
            tf.t r3 = tf.t.f13167g
            r4 = r3
            r2 = r8
            r6 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11 = r9
            r8 = r0
            r10 = 1
            r9 = r13
            r7.<init>(r8, r9, r10, r11)
            return r7
    }

    public static final long b(int r4, int r5) {
            if (r4 < 0) goto L5
            if (r5 < 0) goto L5
            goto L23
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "start and end cannot be negative. [start: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = ", end: "
            r0.append(r1)
            r0.append(r5)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            o2.a.a(r0)
        L23:
            long r0 = (long) r4
            r4 = 32
            long r0 = r0 << r4
            long r4 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            long r4 = r4 | r0
            int r0 = i2.m0.f6359c
            return r4
    }

    public static final long c(int r5, long r6) {
            int r0 = i2.m0.f6359c
            r0 = 32
            long r0 = r6 >> r0
            int r0 = (int) r0
            r1 = 0
            if (r0 >= 0) goto Lc
            r2 = r1
            goto Ld
        Lc:
            r2 = r0
        Ld:
            if (r2 <= r5) goto L10
            r2 = r5
        L10:
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r3 = (int) r3
            if (r3 >= 0) goto L1a
            goto L1b
        L1a:
            r1 = r3
        L1b:
            if (r1 <= r5) goto L1e
            goto L1f
        L1e:
            r5 = r1
        L1f:
            if (r2 != r0) goto L25
            if (r5 == r3) goto L24
            goto L25
        L24:
            return r6
        L25:
            long r5 = b(r2, r5)
            return r5
    }

    public static final int d(int r7, java.util.List r8) {
            java.lang.Object r0 = tf.m.B1(r8)
            i2.r r0 = (i2.r) r0
            int r0 = r0.f6383c
            java.lang.Object r1 = tf.m.B1(r8)
            i2.r r1 = (i2.r) r1
            int r1 = r1.f6383c
            if (r7 > r1) goto L13
            goto L2c
        L13:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Index "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r2 = " should be less or equal than last line's end "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            o2.a.a(r0)
        L2c:
            int r0 = r8.size()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
        L34:
            if (r3 > r0) goto L56
            int r4 = r3 + r0
            int r4 = r4 >>> r1
            java.lang.Object r5 = r8.get(r4)
            i2.r r5 = (i2.r) r5
            int r6 = r5.f6382b
            if (r6 <= r7) goto L45
            r5 = r1
            goto L4c
        L45:
            int r5 = r5.f6383c
            if (r5 > r7) goto L4b
            r5 = -1
            goto L4c
        L4b:
            r5 = r2
        L4c:
            if (r5 >= 0) goto L51
            int r3 = r4 + 1
            goto L34
        L51:
            if (r5 <= 0) goto L58
            int r0 = r4 + (-1)
            goto L34
        L56:
            int r3 = r3 + r1
            int r4 = -r3
        L58:
            if (r4 < 0) goto L61
            int r0 = r8.size()
            if (r4 >= r0) goto L61
            return r4
        L61:
            java.lang.String r0 = "Found paragraph index "
            java.lang.String r1 = " should be in range [0, "
            java.lang.StringBuilder r0 = eh.a.t(r4, r0, r1)
            int r1 = r8.size()
            r0.append(r1)
            java.lang.String r1 = ").\nDebug info: index="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = ", paragraphs=["
            r0.append(r7)
            i2.q r7 = new i2.q
            r1 = 0
            r7.<init>(r1)
            r1 = 31
            r2 = 0
            java.lang.String r7 = w2.a.a(r8, r2, r7, r1)
            r0.append(r7)
            r7 = 93
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            o2.a.a(r7)
            return r4
    }

    public static final int e(int r7, java.util.List r8) {
            int r0 = r8.size()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = r2
        L8:
            if (r3 > r0) goto L2b
            int r4 = r3 + r0
            int r4 = r4 >>> r1
            java.lang.Object r5 = r8.get(r4)
            i2.r r5 = (i2.r) r5
            int r6 = r5.f6384d
            if (r6 <= r7) goto L19
            r5 = r1
            goto L20
        L19:
            int r5 = r5.f6385e
            if (r5 > r7) goto L1f
            r5 = -1
            goto L20
        L1f:
            r5 = r2
        L20:
            if (r5 >= 0) goto L25
            int r3 = r4 + 1
            goto L8
        L25:
            if (r5 <= 0) goto L2a
            int r0 = r4 + (-1)
            goto L8
        L2a:
            return r4
        L2b:
            int r3 = r3 + r1
            int r7 = -r3
            return r7
    }

    public static final int f(java.util.ArrayList r7, float r8) {
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 0
            if (r0 > 0) goto L7
            return r1
        L7:
            java.lang.Object r0 = tf.m.B1(r7)
            i2.r r0 = (i2.r) r0
            float r0 = r0.f6387g
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1
            if (r0 < 0) goto L1a
            int r7 = r7.size()
            int r7 = r7 - r2
            return r7
        L1a:
            int r0 = r7.size()
            int r0 = r0 - r2
            r3 = r1
        L20:
            if (r3 > r0) goto L47
            int r4 = r3 + r0
            int r4 = r4 >>> r2
            java.lang.Object r5 = r7.get(r4)
            i2.r r5 = (i2.r) r5
            float r6 = r5.f6386f
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L33
            r5 = r2
            goto L3c
        L33:
            float r5 = r5.f6387g
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 > 0) goto L3b
            r5 = -1
            goto L3c
        L3b:
            r5 = r1
        L3c:
            if (r5 >= 0) goto L41
            int r3 = r4 + 1
            goto L20
        L41:
            if (r5 <= 0) goto L46
            int r0 = r4 + (-1)
            goto L20
        L46:
            return r4
        L47:
            int r3 = r3 + r2
            int r7 = -r3
            return r7
    }

    public static final void g(java.util.ArrayList r5, long r6, fg.l r8) {
            int r0 = i2.m0.f(r6)
            int r0 = d(r0, r5)
            int r1 = r5.size()
        Lc:
            if (r0 >= r1) goto L28
            java.lang.Object r2 = r5.get(r0)
            i2.r r2 = (i2.r) r2
            int r3 = r2.f6382b
            int r4 = i2.m0.e(r6)
            if (r3 >= r4) goto L28
            int r3 = r2.f6382b
            int r4 = r2.f6383c
            if (r3 == r4) goto L25
            r8.invoke(r2)
        L25:
            int r0 = r0 + 1
            goto Lc
        L28:
            return
    }

    public static final i2.n0 h(i2.n0 r27, u2.m r28) {
            r0 = r27
            i2.n0 r1 = new i2.n0
            i2.f0 r2 = r0.f6365a
            t2.o r3 = i2.g0.f6320d
            t2.o r3 = r2.f6298a
            t2.n r4 = t2.n.f13020a
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L14
        L12:
            r5 = r3
            goto L17
        L14:
            t2.o r3 = i2.g0.f6320d
            goto L12
        L17:
            long r3 = r2.f6299b
            u2.p[] r6 = u2.o.f13358b
            r23 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            long r6 = r3 & r23
            r25 = 0
            int r6 = (r6 > r25 ? 1 : (r6 == r25 ? 0 : -1))
            if (r6 != 0) goto L2a
            long r3 = i2.g0.f6317a
        L2a:
            r6 = r3
            m2.k r3 = r2.f6300c
            if (r3 != 0) goto L31
            m2.k r3 = m2.k.f8697i
        L31:
            r8 = r3
            m2.i r3 = r2.f6301d
            if (r3 == 0) goto L39
            int r3 = r3.f8694a
            goto L3a
        L39:
            r3 = 0
        L3a:
            m2.i r9 = new m2.i
            r9.<init>(r3)
            m2.j r3 = r2.f6302e
            if (r3 == 0) goto L46
            int r3 = r3.f8695a
            goto L49
        L46:
            r3 = 65535(0xffff, float:9.1834E-41)
        L49:
            m2.j r10 = new m2.j
            r10.<init>(r3)
            m2.p r3 = r2.f6303f
            if (r3 != 0) goto L54
            m2.b r3 = m2.p.f8704a
        L54:
            r11 = r3
            java.lang.String r3 = r2.f6304g
            if (r3 != 0) goto L5b
            java.lang.String r3 = ""
        L5b:
            r12 = r3
            long r3 = r2.f6305h
            long r13 = r3 & r23
            int r13 = (r13 > r25 ? 1 : (r13 == r25 ? 0 : -1))
            if (r13 != 0) goto L66
            long r3 = i2.g0.f6318b
        L66:
            r13 = r3
            t2.a r3 = r2.f6306i
            r4 = 0
            if (r3 == 0) goto L6f
            float r3 = r3.f12994a
            goto L70
        L6f:
            r3 = r4
        L70:
            boolean r15 = java.lang.Float.isNaN(r3)
            if (r15 == 0) goto L77
            goto L78
        L77:
            r4 = r3
        L78:
            t2.a r15 = new t2.a
            r15.<init>(r4)
            t2.p r3 = r2.f6307j
            if (r3 != 0) goto L83
            t2.p r3 = t2.p.f13021c
        L83:
            r16 = r3
            p2.b r3 = r2.f6308k
            if (r3 != 0) goto L91
            p2.b r3 = p2.b.f10086i
            b5.c r3 = p2.c.f10089a
            p2.b r3 = r3.r()
        L91:
            r17 = r3
            long r3 = r2.f6309l
            r18 = 16
            int r18 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r18 == 0) goto L9e
        L9b:
            r18 = r3
            goto La1
        L9e:
            long r3 = i2.g0.f6319c
            goto L9b
        La1:
            t2.l r3 = r2.f6310m
            if (r3 != 0) goto La7
            t2.l r3 = t2.l.f13015b
        La7:
            r20 = r3
            f1.q0 r3 = r2.f6311n
            if (r3 != 0) goto Laf
            f1.q0 r3 = f1.q0.f3108d
        Laf:
            r21 = r3
            h1.c r2 = r2.f6312o
            if (r2 != 0) goto Lb7
            h1.f r2 = h1.f.f5043b
        Lb7:
            r22 = r2
            i2.f0 r4 = new i2.f0
            r4.<init>(r5, r6, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r20, r21, r22)
            i2.u r2 = r0.f6366b
            int r3 = i2.v.f6401b
            i2.u r5 = new i2.u
            int r3 = r2.f6391a
            r6 = 5
            if (r3 != 0) goto Lca
            r3 = r6
        Lca:
            int r7 = r2.f6392b
            r8 = 3
            r9 = 0
            r10 = 1
            if (r7 != r8) goto Le1
            int r7 = r28.ordinal()
            if (r7 == 0) goto Ldf
            if (r7 != r10) goto Ldb
        Ld9:
            r7 = r6
            goto Lf2
        Ldb:
            okio.a.k()
            return r9
        Ldf:
            r6 = 4
            goto Ld9
        Le1:
            if (r7 != 0) goto Lf2
            int r6 = r28.ordinal()
            if (r6 == 0) goto Lf1
            if (r6 != r10) goto Led
            r6 = 2
            goto Ld9
        Led:
            okio.a.k()
            return r9
        Lf1:
            r7 = r10
        Lf2:
            long r8 = r2.f6393c
            long r11 = r8 & r23
            int r6 = (r11 > r25 ? 1 : (r11 == r25 ? 0 : -1))
            if (r6 != 0) goto Lfc
            long r8 = i2.v.f6400a
        Lfc:
            t2.q r6 = r2.f6394d
            if (r6 != 0) goto L102
            t2.q r6 = t2.q.f13024c
        L102:
            i2.w r11 = r2.f6395e
            t2.i r12 = r2.f6396f
            int r13 = r2.f6397g
            if (r13 != 0) goto L10c
            int r13 = t2.e.f12999b
        L10c:
            int r14 = r2.f6398h
            if (r14 != 0) goto L111
            r14 = r10
        L111:
            t2.s r2 = r2.f6399i
            if (r2 != 0) goto L117
            t2.s r2 = t2.s.f13028c
        L117:
            r15 = r2
            r10 = r6
            r6 = r3
            r5.<init>(r6, r7, r8, r10, r11, r12, r13, r14, r15)
            i2.x r0 = r0.f6367c
            r1.<init>(r4, r5, r0)
            return r1
    }
}
