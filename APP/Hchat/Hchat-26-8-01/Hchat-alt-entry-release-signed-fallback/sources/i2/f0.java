package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements i2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t2.o f6298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m2.k f6300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m2.i f6301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m2.j f6302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m2.p f6303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f6304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f6305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t2.a f6306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t2.p f6307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2.b f6308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f6309l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t2.l f6310m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f1.q0 f6311n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h1.c f6312o;

    public f0(long r23, long r25, m2.k r27, m2.i r28, m2.j r29, m2.p r30, java.lang.String r31, long r32, t2.a r34, t2.p r35, p2.b r36, long r37, t2.l r39, f1.q0 r40) {
            r22 = this;
            r0 = r23
            r2 = 16
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto Lf
            t2.c r2 = new t2.c
            r2.<init>(r0)
        Ld:
            r4 = r2
            goto L12
        Lf:
            t2.n r2 = t2.n.f13020a
            goto Ld
        L12:
            r21 = 0
            r3 = r22
            r5 = r25
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            r12 = r32
            r14 = r34
            r15 = r35
            r16 = r36
            r17 = r37
            r19 = r39
            r20 = r40
            r3.<init>(r4, r5, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r19, r20, r21)
            return
    }

    public f0(long r19, long r21, m2.k r23, m2.i r24, m2.j r25, m2.p r26, java.lang.String r27, long r28, t2.a r30, t2.p r31, p2.b r32, long r33, t2.l r35, f1.q0 r36, int r37) {
            r18 = this;
            r0 = r37
            r1 = r0 & 1
            if (r1 == 0) goto L9
            long r1 = f1.w.f3131g
            goto Lb
        L9:
            r1 = r19
        Lb:
            r3 = r0 & 2
            if (r3 == 0) goto L12
            long r3 = u2.o.f13359c
            goto L14
        L12:
            r3 = r21
        L14:
            r5 = r0 & 4
            if (r5 == 0) goto L1a
            r5 = 0
            goto L1c
        L1a:
            r5 = r23
        L1c:
            r7 = r0 & 8
            if (r7 == 0) goto L22
            r7 = 0
            goto L24
        L22:
            r7 = r24
        L24:
            r8 = r0 & 16
            if (r8 == 0) goto L2a
            r8 = 0
            goto L2c
        L2a:
            r8 = r25
        L2c:
            r9 = r0 & 32
            if (r9 == 0) goto L32
            r9 = 0
            goto L34
        L32:
            r9 = r26
        L34:
            r10 = r0 & 64
            if (r10 == 0) goto L3a
            r10 = 0
            goto L3c
        L3a:
            r10 = r27
        L3c:
            r11 = r0 & 128(0x80, float:1.8E-43)
            if (r11 == 0) goto L43
            long r11 = u2.o.f13359c
            goto L45
        L43:
            r11 = r28
        L45:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L4b
            r13 = 0
            goto L4d
        L4b:
            r13 = r30
        L4d:
            r14 = r0 & 512(0x200, float:7.17E-43)
            if (r14 == 0) goto L53
            r14 = 0
            goto L55
        L53:
            r14 = r31
        L55:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L5b
            r15 = 0
            goto L5d
        L5b:
            r15 = r32
        L5d:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L64
            long r16 = f1.w.f3131g
            goto L66
        L64:
            r16 = r33
        L66:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L6c
            r6 = 0
            goto L6e
        L6c:
            r6 = r35
        L6e:
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L91
            r37 = 0
        L74:
            r19 = r18
            r20 = r1
            r22 = r3
            r24 = r5
            r36 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            r28 = r10
            r29 = r11
            r31 = r13
            r32 = r14
            r33 = r15
            r34 = r16
            goto L94
        L91:
            r37 = r36
            goto L74
        L94:
            r19.<init>(r20, r22, r24, r25, r26, r27, r28, r29, r31, r32, r33, r34, r36, r37)
            return
    }

    public f0(t2.o r1, long r2, m2.k r4, m2.i r5, m2.j r6, m2.p r7, java.lang.String r8, long r9, t2.a r11, t2.p r12, p2.b r13, long r14, t2.l r16, f1.q0 r17, h1.c r18) {
            r0 = this;
            r0.<init>()
            r0.f6298a = r1
            r0.f6299b = r2
            r0.f6300c = r4
            r0.f6301d = r5
            r0.f6302e = r6
            r0.f6303f = r7
            r0.f6304g = r8
            r0.f6305h = r9
            r0.f6306i = r11
            r0.f6307j = r12
            r0.f6308k = r13
            r0.f6309l = r14
            r1 = r16
            r0.f6310m = r1
            r1 = r17
            r0.f6311n = r1
            r1 = r18
            r0.f6312o = r1
            return
    }

    public final boolean a(i2.f0 r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            long r1 = r7.f6299b
            long r3 = r8.f6299b
            boolean r1 = u2.o.a(r1, r3)
            r2 = 0
            if (r1 != 0) goto L10
            return r2
        L10:
            m2.k r1 = r7.f6300c
            m2.k r3 = r8.f6300c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L1b
            return r2
        L1b:
            m2.i r1 = r7.f6301d
            m2.i r3 = r8.f6301d
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L26
            return r2
        L26:
            m2.j r1 = r7.f6302e
            m2.j r3 = r8.f6302e
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L31
            return r2
        L31:
            m2.p r1 = r7.f6303f
            m2.p r3 = r8.f6303f
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L3c
            return r2
        L3c:
            java.lang.String r1 = r7.f6304g
            java.lang.String r3 = r8.f6304g
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L47
            return r2
        L47:
            long r3 = r7.f6305h
            long r5 = r8.f6305h
            boolean r1 = u2.o.a(r3, r5)
            if (r1 != 0) goto L52
            return r2
        L52:
            t2.a r1 = r7.f6306i
            t2.a r3 = r8.f6306i
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L5d
            return r2
        L5d:
            t2.p r1 = r7.f6307j
            t2.p r3 = r8.f6307j
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L68
            return r2
        L68:
            p2.b r1 = r7.f6308k
            p2.b r3 = r8.f6308k
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L73
            return r2
        L73:
            long r3 = r7.f6309l
            long r5 = r8.f6309l
            boolean r8 = f1.w.c(r3, r5)
            if (r8 != 0) goto L7e
            return r2
        L7e:
            return r0
    }

    public final boolean b(i2.f0 r4) {
            r3 = this;
            t2.o r0 = r3.f6298a
            t2.o r1 = r4.f6298a
            boolean r0 = gg.l.a(r0, r1)
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            t2.l r0 = r3.f6310m
            t2.l r2 = r4.f6310m
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto L17
            return r1
        L17:
            f1.q0 r0 = r3.f6311n
            f1.q0 r2 = r4.f6311n
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto L22
            return r1
        L22:
            h1.c r0 = r3.f6312o
            h1.c r4 = r4.f6312o
            boolean r4 = gg.l.a(r0, r4)
            if (r4 != 0) goto L2d
            return r1
        L2d:
            r4 = 1
            return r4
    }

    public final i2.f0 c(i2.f0 r25) {
            r24 = this;
            r0 = r25
            if (r0 != 0) goto L5
            return r24
        L5:
            t2.o r1 = r0.f6298a
            long r3 = r1.b()
            f1.s r5 = r1.c()
            float r6 = r1.a()
            long r7 = r0.f6299b
            m2.k r9 = r0.f6300c
            m2.i r10 = r0.f6301d
            m2.j r11 = r0.f6302e
            m2.p r12 = r0.f6303f
            java.lang.String r13 = r0.f6304g
            long r14 = r0.f6305h
            t2.a r1 = r0.f6306i
            t2.p r2 = r0.f6307j
            r16 = r1
            p2.b r1 = r0.f6308k
            r18 = r1
            r17 = r2
            long r1 = r0.f6309l
            r19 = r1
            t2.l r1 = r0.f6310m
            f1.q0 r2 = r0.f6311n
            h1.c r0 = r0.f6312o
            r23 = r0
            r21 = r1
            r22 = r2
            r2 = r24
            i2.f0 r0 = i2.g0.a(r2, r3, r5, r6, r7, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r23)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof i2.f0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            i2.f0 r4 = (i2.f0) r4
            boolean r1 = r3.a(r4)
            if (r1 == 0) goto L19
            boolean r4 = r3.b(r4)
            if (r4 == 0) goto L19
            return r0
        L19:
            return r2
    }

    public final int hashCode() {
            r7 = this;
            t2.o r0 = r7.f6298a
            long r1 = r0.b()
            int r3 = f1.w.f3132h
            int r1 = java.lang.Long.hashCode(r1)
            r2 = 31
            int r1 = r1 * r2
            f1.s r3 = r0.c()
            r4 = 0
            if (r3 == 0) goto L1b
            int r3 = r3.hashCode()
            goto L1c
        L1b:
            r3 = r4
        L1c:
            int r1 = r1 + r3
            int r1 = r1 * r2
            float r0 = r0.a()
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 + r1
            int r0 = r0 * r2
            u2.p[] r1 = u2.o.f13358b
            long r5 = r7.f6299b
            int r0 = eh.a.f(r0, r2, r5)
            m2.k r1 = r7.f6300c
            if (r1 == 0) goto L37
            int r1 = r1.f8701g
            goto L38
        L37:
            r1 = r4
        L38:
            int r0 = r0 + r1
            int r0 = r0 * r2
            m2.i r1 = r7.f6301d
            if (r1 == 0) goto L45
            int r1 = r1.f8694a
            int r1 = java.lang.Integer.hashCode(r1)
            goto L46
        L45:
            r1 = r4
        L46:
            int r0 = r0 + r1
            int r0 = r0 * r2
            m2.j r1 = r7.f6302e
            if (r1 == 0) goto L53
            int r1 = r1.f8695a
            int r1 = java.lang.Integer.hashCode(r1)
            goto L54
        L53:
            r1 = r4
        L54:
            int r0 = r0 + r1
            int r0 = r0 * r2
            m2.p r1 = r7.f6303f
            if (r1 == 0) goto L5f
            int r1 = r1.hashCode()
            goto L60
        L5f:
            r1 = r4
        L60:
            int r0 = r0 + r1
            int r0 = r0 * r2
            java.lang.String r1 = r7.f6304g
            if (r1 == 0) goto L6b
            int r1 = r1.hashCode()
            goto L6c
        L6b:
            r1 = r4
        L6c:
            int r0 = r0 + r1
            int r0 = r0 * r2
            long r5 = r7.f6305h
            int r0 = eh.a.f(r0, r2, r5)
            t2.a r1 = r7.f6306i
            if (r1 == 0) goto L7f
            float r1 = r1.f12994a
            int r1 = java.lang.Float.hashCode(r1)
            goto L80
        L7f:
            r1 = r4
        L80:
            int r0 = r0 + r1
            int r0 = r0 * r2
            t2.p r1 = r7.f6307j
            if (r1 == 0) goto L8b
            int r1 = r1.hashCode()
            goto L8c
        L8b:
            r1 = r4
        L8c:
            int r0 = r0 + r1
            int r0 = r0 * r2
            p2.b r1 = r7.f6308k
            if (r1 == 0) goto L99
            java.lang.Object r1 = r1.f10087g
            int r1 = r1.hashCode()
            goto L9a
        L99:
            r1 = r4
        L9a:
            int r0 = r0 + r1
            int r0 = r0 * r2
            long r5 = r7.f6309l
            int r0 = eh.a.f(r0, r2, r5)
            t2.l r1 = r7.f6310m
            if (r1 == 0) goto La9
            int r1 = r1.f13018a
            goto Laa
        La9:
            r1 = r4
        Laa:
            int r0 = r0 + r1
            int r0 = r0 * r2
            f1.q0 r1 = r7.f6311n
            if (r1 == 0) goto Lb5
            int r1 = r1.hashCode()
            goto Lb6
        Lb5:
            r1 = r4
        Lb6:
            int r0 = r0 + r1
            int r0 = r0 * 961
            h1.c r1 = r7.f6312o
            if (r1 == 0) goto Lc1
            int r4 = r1.hashCode()
        Lc1:
            int r0 = r0 + r4
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SpanStyle(color="
            r0.<init>(r1)
            t2.o r1 = r4.f6298a
            long r2 = r1.b()
            java.lang.String r2 = f1.w.i(r2)
            r0.append(r2)
            java.lang.String r2 = ", brush="
            r0.append(r2)
            f1.s r2 = r1.c()
            r0.append(r2)
            java.lang.String r2 = ", alpha="
            r0.append(r2)
            float r1 = r1.a()
            r0.append(r1)
            java.lang.String r1 = ", fontSize="
            r0.append(r1)
            long r1 = r4.f6299b
            java.lang.String r1 = u2.o.d(r1)
            r0.append(r1)
            java.lang.String r1 = ", fontWeight="
            r0.append(r1)
            m2.k r1 = r4.f6300c
            r0.append(r1)
            java.lang.String r1 = ", fontStyle="
            r0.append(r1)
            m2.i r1 = r4.f6301d
            r0.append(r1)
            java.lang.String r1 = ", fontSynthesis="
            r0.append(r1)
            m2.j r1 = r4.f6302e
            r0.append(r1)
            java.lang.String r1 = ", fontFamily="
            r0.append(r1)
            m2.p r1 = r4.f6303f
            r0.append(r1)
            java.lang.String r1 = ", fontFeatureSettings="
            r0.append(r1)
            java.lang.String r1 = r4.f6304g
            r0.append(r1)
            java.lang.String r1 = ", letterSpacing="
            r0.append(r1)
            long r1 = r4.f6305h
            java.lang.String r1 = u2.o.d(r1)
            r0.append(r1)
            java.lang.String r1 = ", baselineShift="
            r0.append(r1)
            t2.a r1 = r4.f6306i
            r0.append(r1)
            java.lang.String r1 = ", textGeometricTransform="
            r0.append(r1)
            t2.p r1 = r4.f6307j
            r0.append(r1)
            java.lang.String r1 = ", localeList="
            r0.append(r1)
            p2.b r1 = r4.f6308k
            r0.append(r1)
            java.lang.String r1 = ", background="
            r0.append(r1)
            long r1 = r4.f6309l
            java.lang.String r1 = f1.w.i(r1)
            r0.append(r1)
            java.lang.String r1 = ", textDecoration="
            r0.append(r1)
            t2.l r1 = r4.f6310m
            r0.append(r1)
            java.lang.String r1 = ", shadow="
            r0.append(r1)
            f1.q0 r1 = r4.f6311n
            r0.append(r1)
            java.lang.String r1 = ", platformStyle=null, drawStyle="
            r0.append(r1)
            h1.c r1 = r4.f6312o
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
