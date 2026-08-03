package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.f0 f6365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i2.u f6366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i2.x f6367c;

    static {
            i2.n0 r0 = new i2.n0
            r9 = 0
            r11 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r0.<init>(r1, r3, r5, r6, r8, r9, r11)
            return
    }

    public n0(long r25, long r27, m2.k r29, long r30, int r32, long r33, int r35) {
            r24 = this;
            r0 = r35
            r1 = r0 & 1
            if (r1 == 0) goto La
            long r1 = f1.w.f3131g
            r4 = r1
            goto Lc
        La:
            r4 = r25
        Lc:
            r1 = r0 & 2
            if (r1 == 0) goto L14
            long r1 = u2.o.f13359c
            r6 = r1
            goto L16
        L14:
            r6 = r27
        L16:
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L1d
            r8 = r2
            goto L1f
        L1d:
            r8 = r29
        L1f:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L27
            long r9 = u2.o.f13359c
            r13 = r9
            goto L29
        L27:
            r13 = r30
        L29:
            long r18 = f1.w.f3131g
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L33
            r1 = 0
            goto L35
        L33:
            r1 = r32
        L35:
            r3 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r3
            if (r0 == 0) goto L3f
            long r9 = u2.o.f13359c
            r22 = r9
            goto L41
        L3f:
            r22 = r33
        L41:
            i2.f0 r3 = new i2.f0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r20 = 0
            r21 = 0
            r3.<init>(r4, r6, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r20, r21)
            i2.u r0 = new i2.u
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r25 = r0
            r26 = r1
            r31 = r2
            r27 = r4
            r30 = r5
            r32 = r6
            r33 = r7
            r34 = r8
            r35 = r9
            r28 = r22
            r25.<init>(r26, r27, r28, r30, r31, r32, r33, r34, r35)
            r1 = 0
            r2 = r24
            r2.<init>(r3, r0, r1)
            return
    }

    public n0(i2.f0 r3, i2.u r4) {
            r2 = this;
            r3.getClass()
            i2.w r0 = r4.f6395e
            if (r0 != 0) goto L9
            r0 = 0
            goto Lf
        L9:
            i2.x r1 = new i2.x
            r1.<init>(r0)
            r0 = r1
        Lf:
            r2.<init>(r3, r4, r0)
            return
    }

    public n0(i2.f0 r1, i2.u r2, i2.x r3) {
            r0 = this;
            r0.<init>()
            r0.f6365a = r1
            r0.f6366b = r2
            r0.f6367c = r3
            return
    }

    public static i2.n0 c(i2.n0 r28, long r29, long r31, m2.k r33, m2.p r34, long r35, int r37, long r38, int r40) {
            r0 = r28
            r1 = r40
            r2 = r1 & 2
            if (r2 == 0) goto Lc
            long r2 = u2.o.f13359c
            r9 = r2
            goto Le
        Lc:
            r9 = r31
        Le:
            r2 = r1 & 4
            r3 = 0
            if (r2 == 0) goto L15
            r11 = r3
            goto L17
        L15:
            r11 = r33
        L17:
            r2 = r1 & 32
            if (r2 == 0) goto L1d
            r14 = r3
            goto L1f
        L1d:
            r14 = r34
        L1f:
            r2 = r1 & 128(0x80, float:1.8E-43)
            if (r2 == 0) goto L28
            long r4 = u2.o.f13359c
            r16 = r4
            goto L2a
        L28:
            r16 = r35
        L2a:
            long r21 = f1.w.f3131g
            r2 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r1
            if (r2 == 0) goto L34
            r2 = 0
            goto L36
        L34:
            r2 = r37
        L36:
            r4 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r4
            if (r1 == 0) goto L40
            long r4 = u2.o.f13359c
            r26 = r4
            goto L42
        L40:
            r26 = r38
        L42:
            i2.f0 r4 = r0.f6365a
            r7 = 0
            r8 = 2143289344(0x7fc00000, float:NaN)
            r12 = 0
            r13 = 0
            r15 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r5 = r29
            i2.f0 r1 = i2.g0.a(r4, r5, r7, r8, r9, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25)
            i2.u r4 = r0.f6366b
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r30 = r2
            r35 = r3
            r29 = r4
            r31 = r5
            r34 = r6
            r36 = r7
            r37 = r8
            r38 = r9
            r39 = r10
            r32 = r26
            i2.u r2 = i2.v.a(r29, r30, r31, r32, r34, r35, r36, r37, r38, r39)
            i2.f0 r3 = r0.f6365a
            if (r3 != r1) goto L84
            i2.u r3 = r0.f6366b
            if (r3 != r2) goto L84
            return r0
        L84:
            i2.n0 r0 = new i2.n0
            r0.<init>(r1, r2)
            return r0
    }

    public final long a() {
            r2 = this;
            i2.f0 r0 = r2.f6365a
            t2.o r0 = r0.f6298a
            long r0 = r0.b()
            return r0
    }

    public final boolean b(i2.n0 r3) {
            r2 = this;
            if (r2 == r3) goto L19
            i2.u r0 = r2.f6366b
            i2.u r1 = r3.f6366b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L17
            i2.f0 r0 = r2.f6365a
            i2.f0 r3 = r3.f6365a
            boolean r3 = r0.a(r3)
            if (r3 == 0) goto L17
            goto L19
        L17:
            r3 = 0
            return r3
        L19:
            r3 = 1
            return r3
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof i2.n0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            i2.n0 r5 = (i2.n0) r5
            i2.f0 r1 = r5.f6365a
            i2.f0 r3 = r4.f6365a
            boolean r1 = gg.l.a(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            i2.u r1 = r4.f6366b
            i2.u r3 = r5.f6366b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            i2.x r1 = r4.f6367c
            i2.x r5 = r5.f6367c
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            i2.f0 r0 = r2.f6365a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            i2.u r1 = r2.f6366b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            i2.x r0 = r2.f6367c
            if (r0 == 0) goto L1a
            int r0 = r0.hashCode()
            goto L1b
        L1a:
            r0 = 0
        L1b:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextStyle(color="
            r0.<init>(r1)
            long r1 = r4.a()
            java.lang.String r1 = f1.w.i(r1)
            r0.append(r1)
            java.lang.String r1 = ", brush="
            r0.append(r1)
            i2.f0 r1 = r4.f6365a
            t2.o r2 = r1.f6298a
            f1.s r2 = r2.c()
            r0.append(r2)
            java.lang.String r2 = ", alpha="
            r0.append(r2)
            t2.o r2 = r1.f6298a
            float r2 = r2.a()
            r0.append(r2)
            java.lang.String r2 = ", fontSize="
            r0.append(r2)
            long r2 = r1.f6299b
            java.lang.String r2 = u2.o.d(r2)
            r0.append(r2)
            java.lang.String r2 = ", fontWeight="
            r0.append(r2)
            m2.k r2 = r1.f6300c
            r0.append(r2)
            java.lang.String r2 = ", fontStyle="
            r0.append(r2)
            m2.i r2 = r1.f6301d
            r0.append(r2)
            java.lang.String r2 = ", fontSynthesis="
            r0.append(r2)
            m2.j r2 = r1.f6302e
            r0.append(r2)
            java.lang.String r2 = ", fontFamily="
            r0.append(r2)
            m2.p r2 = r1.f6303f
            r0.append(r2)
            java.lang.String r2 = ", fontFeatureSettings="
            r0.append(r2)
            java.lang.String r2 = r1.f6304g
            r0.append(r2)
            java.lang.String r2 = ", letterSpacing="
            r0.append(r2)
            long r2 = r1.f6305h
            java.lang.String r2 = u2.o.d(r2)
            r0.append(r2)
            java.lang.String r2 = ", baselineShift="
            r0.append(r2)
            t2.a r2 = r1.f6306i
            r0.append(r2)
            java.lang.String r2 = ", textGeometricTransform="
            r0.append(r2)
            t2.p r2 = r1.f6307j
            r0.append(r2)
            java.lang.String r2 = ", localeList="
            r0.append(r2)
            p2.b r2 = r1.f6308k
            r0.append(r2)
            java.lang.String r2 = ", background="
            r0.append(r2)
            long r2 = r1.f6309l
            java.lang.String r2 = f1.w.i(r2)
            r0.append(r2)
            java.lang.String r2 = ", textDecoration="
            r0.append(r2)
            t2.l r2 = r1.f6310m
            r0.append(r2)
            java.lang.String r2 = ", shadow="
            r0.append(r2)
            f1.q0 r2 = r1.f6311n
            r0.append(r2)
            java.lang.String r2 = ", drawStyle="
            r0.append(r2)
            h1.c r1 = r1.f6312o
            r0.append(r1)
            java.lang.String r1 = ", textAlign="
            r0.append(r1)
            i2.u r1 = r4.f6366b
            int r2 = r1.f6391a
            java.lang.String r2 = t2.k.a(r2)
            r0.append(r2)
            java.lang.String r2 = ", textDirection="
            r0.append(r2)
            int r2 = r1.f6392b
            java.lang.String r2 = t2.m.a(r2)
            r0.append(r2)
            java.lang.String r2 = ", lineHeight="
            r0.append(r2)
            long r2 = r1.f6393c
            java.lang.String r2 = u2.o.d(r2)
            r0.append(r2)
            java.lang.String r2 = ", textIndent="
            r0.append(r2)
            t2.q r2 = r1.f6394d
            r0.append(r2)
            java.lang.String r2 = ", platformStyle="
            r0.append(r2)
            i2.x r2 = r4.f6367c
            r0.append(r2)
            java.lang.String r2 = ", lineHeightStyle="
            r0.append(r2)
            t2.i r2 = r1.f6396f
            r0.append(r2)
            java.lang.String r2 = ", lineBreak="
            r0.append(r2)
            int r2 = r1.f6397g
            java.lang.String r2 = t2.e.a(r2)
            r0.append(r2)
            java.lang.String r2 = ", hyphens="
            r0.append(r2)
            int r2 = r1.f6398h
            java.lang.String r2 = t2.d.a(r2)
            r0.append(r2)
            java.lang.String r2 = ", textMotion="
            r0.append(r2)
            t2.s r1 = r1.f6399i
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
