package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f6317a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f6318b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f6319c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t2.o f6320d = null;

    static {
            r0 = 14
            long r0 = x6.d.D(r0)
            i2.g0.f6317a = r0
            r0 = 0
            long r0 = x6.d.D(r0)
            i2.g0.f6318b = r0
            long r0 = f1.w.f3130f
            i2.g0.f6319c = r0
            long r0 = f1.w.f3126b
            r2 = 16
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            t2.c r2 = new t2.c
            r2.<init>(r0)
            goto L23
        L21:
            t2.n r2 = t2.n.f13020a
        L23:
            i2.g0.f6320d = r2
            return
    }

    public static final i2.f0 a(i2.f0 r24, long r25, f1.s r27, float r28, long r29, m2.k r31, m2.i r32, m2.j r33, m2.p r34, java.lang.String r35, long r36, t2.a r38, t2.p r39, p2.b r40, long r41, t2.l r43, f1.q0 r44, h1.c r45) {
            r0 = r24
            r1 = r25
            r3 = r27
            r5 = r29
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r35
            r12 = r36
            r4 = r43
            u2.p[] r16 = u2.o.f13358b
            r16 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            long r18 = r5 & r16
            r20 = 0
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            r22 = 16
            if (r18 != 0) goto L28
            goto L30
        L28:
            long r14 = r0.f6299b
            boolean r14 = u2.o.a(r5, r14)
            if (r14 == 0) goto L43
        L30:
            if (r3 != 0) goto L4d
            int r14 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r14 == 0) goto L4d
            t2.o r14 = r0.f6298a
            long r14 = r14.b()
            boolean r14 = f1.w.c(r1, r14)
            if (r14 == 0) goto L43
            goto L4d
        L43:
            r15 = r38
        L45:
            r4 = r41
        L47:
            r6 = r44
        L49:
            r7 = r45
            goto L102
        L4d:
            if (r8 == 0) goto L57
            m2.i r14 = r0.f6301d
            boolean r14 = r8.equals(r14)
            if (r14 == 0) goto L43
        L57:
            if (r7 == 0) goto L61
            m2.k r14 = r0.f6300c
            boolean r14 = r7.equals(r14)
            if (r14 == 0) goto L43
        L61:
            if (r10 == 0) goto L67
            m2.p r14 = r0.f6303f
            if (r10 != r14) goto L43
        L67:
            long r14 = r12 & r16
            int r14 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r14 != 0) goto L6e
            goto L76
        L6e:
            long r14 = r0.f6305h
            boolean r14 = u2.o.a(r12, r14)
            if (r14 == 0) goto L43
        L76:
            if (r4 == 0) goto L80
            t2.l r14 = r0.f6310m
            boolean r14 = r4.equals(r14)
            if (r14 == 0) goto L43
        L80:
            t2.o r14 = r0.f6298a
            f1.s r14 = r14.c()
            boolean r14 = gg.l.a(r3, r14)
            if (r14 == 0) goto L43
            if (r3 == 0) goto L98
            t2.o r14 = r0.f6298a
            float r14 = r14.a()
            int r14 = (r28 > r14 ? 1 : (r28 == r14 ? 0 : -1))
            if (r14 != 0) goto L43
        L98:
            if (r9 == 0) goto La2
            m2.j r14 = r0.f6302e
            boolean r14 = r9.equals(r14)
            if (r14 == 0) goto L43
        La2:
            if (r11 == 0) goto Lac
            java.lang.String r14 = r0.f6304g
            boolean r14 = r11.equals(r14)
            if (r14 == 0) goto L43
        Lac:
            if (r38 == 0) goto Lb9
            t2.a r14 = r0.f6306i
            r15 = r38
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L45
            goto Lbb
        Lb9:
            r15 = r38
        Lbb:
            if (r39 == 0) goto Lc8
            t2.p r14 = r0.f6307j
            r4 = r39
            boolean r14 = r4.equals(r14)
            if (r14 == 0) goto L45
            goto Lca
        Lc8:
            r4 = r39
        Lca:
            if (r40 == 0) goto Ld9
            p2.b r14 = r0.f6308k
            r4 = r40
            boolean r14 = r4.equals(r14)
            if (r14 == 0) goto L45
        Ld6:
            r4 = r41
            goto Ldc
        Ld9:
            r4 = r40
            goto Ld6
        Ldc:
            int r6 = (r4 > r22 ? 1 : (r4 == r22 ? 0 : -1))
            if (r6 == 0) goto Le8
            long r6 = r0.f6309l
            boolean r6 = f1.w.c(r4, r6)
            if (r6 == 0) goto L47
        Le8:
            r6 = r44
            if (r6 == 0) goto Lf4
            f1.q0 r7 = r0.f6311n
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L49
        Lf4:
            r7 = r45
            if (r7 == 0) goto L101
            h1.c r14 = r0.f6312o
            boolean r14 = r7.equals(r14)
            if (r14 != 0) goto L101
            goto L102
        L101:
            return r0
        L102:
            t2.n r14 = t2.n.f13020a
            if (r3 == 0) goto L135
            boolean r1 = r3 instanceof f1.t0
            if (r1 == 0) goto L121
            r1 = r3
            f1.t0 r1 = (f1.t0) r1
            long r1 = r1.f3121a
            r3 = r28
            long r1 = ig.a.N(r1, r3)
            int r3 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r3 == 0) goto L11f
            t2.c r3 = new t2.c
            r3.<init>(r1)
            goto L13e
        L11f:
            r3 = r14
            goto L13e
        L121:
            r1 = r28
            boolean r2 = r3 instanceof f1.p0
            if (r2 == 0) goto L130
            t2.b r2 = new t2.b
            f1.p0 r3 = (f1.p0) r3
            r2.<init>(r3, r1)
            r3 = r2
            goto L13e
        L130:
            okio.a.k()
            r0 = 0
            return r0
        L135:
            int r3 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r3 == 0) goto L11f
            t2.c r3 = new t2.c
            r3.<init>(r1)
        L13e:
            t2.o r1 = r0.f6298a
            r1.getClass()
            boolean r2 = r3 instanceof t2.b
            r19 = r2
            if (r2 == 0) goto L164
            boolean r2 = r1 instanceof t2.b
            if (r2 == 0) goto L164
            t2.b r2 = new t2.b
            t2.b r3 = (t2.b) r3
            f1.p0 r14 = r3.f12995a
            float r3 = r3.f12996b
            boolean r19 = java.lang.Float.isNaN(r3)
            if (r19 == 0) goto L15f
            t2.b r1 = (t2.b) r1
            float r3 = r1.f12996b
        L15f:
            r2.<init>(r14, r3)
            r3 = r2
            goto L179
        L164:
            if (r19 == 0) goto L16b
            boolean r2 = r1 instanceof t2.b
            if (r2 != 0) goto L16b
            goto L179
        L16b:
            if (r19 != 0) goto L173
            boolean r2 = r1 instanceof t2.b
            if (r2 == 0) goto L173
        L171:
            r3 = r1
            goto L179
        L173:
            boolean r2 = r3.equals(r14)
            if (r2 != 0) goto L171
        L179:
            if (r10 != 0) goto L17e
            m2.p r1 = r0.f6303f
            r10 = r1
        L17e:
            if (r18 != 0) goto L183
            long r1 = r0.f6299b
            goto L185
        L183:
            r1 = r29
        L185:
            if (r31 != 0) goto L18a
            m2.k r14 = r0.f6300c
            goto L18c
        L18a:
            r14 = r31
        L18c:
            if (r8 != 0) goto L190
            m2.i r8 = r0.f6301d
        L190:
            if (r9 != 0) goto L194
            m2.j r9 = r0.f6302e
        L194:
            if (r11 != 0) goto L198
            java.lang.String r11 = r0.f6304g
        L198:
            long r16 = r12 & r16
            int r16 = (r16 > r20 ? 1 : (r16 == r20 ? 0 : -1))
            if (r16 != 0) goto L1a0
            long r12 = r0.f6305h
        L1a0:
            if (r15 != 0) goto L1a4
            t2.a r15 = r0.f6306i
        L1a4:
            r26 = r1
            if (r39 != 0) goto L1ab
            t2.p r1 = r0.f6307j
            goto L1ad
        L1ab:
            r1 = r39
        L1ad:
            if (r40 != 0) goto L1b2
            p2.b r2 = r0.f6308k
            goto L1b4
        L1b2:
            r2 = r40
        L1b4:
            int r16 = (r4 > r22 ? 1 : (r4 == r22 ? 0 : -1))
            if (r16 == 0) goto L1b9
            goto L1bb
        L1b9:
            long r4 = r0.f6309l
        L1bb:
            r36 = r1
            if (r43 != 0) goto L1c2
            t2.l r1 = r0.f6310m
            goto L1c4
        L1c2:
            r1 = r43
        L1c4:
            if (r6 != 0) goto L1c8
            f1.q0 r6 = r0.f6311n
        L1c8:
            if (r7 != 0) goto L1cd
            h1.c r0 = r0.f6312o
            goto L1ce
        L1cd:
            r0 = r7
        L1ce:
            i2.f0 r7 = new i2.f0
            r42 = r0
            r40 = r1
            r37 = r2
            r25 = r3
            r38 = r4
            r41 = r6
            r24 = r7
            r29 = r8
            r30 = r9
            r31 = r10
            r32 = r11
            r33 = r12
            r28 = r14
            r35 = r15
            r24.<init>(r25, r26, r28, r29, r30, r31, r32, r33, r35, r36, r37, r38, r40, r41, r42)
            r0 = r24
            return r0
    }
}
