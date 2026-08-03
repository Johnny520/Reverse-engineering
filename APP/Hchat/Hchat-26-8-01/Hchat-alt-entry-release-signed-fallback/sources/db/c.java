package db;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f2168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f2170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.List f2171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.List f2172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.List f2173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f2174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.Set f2176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f2178k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f2179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.String f2180m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f2181n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2182o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2183p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.lang.String f2184q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f2185r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f2186s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final java.util.List f2187t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f2188u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final java.util.List f2189v;

    public c(java.lang.String r1, int r2, java.lang.String r3, java.util.List r4, java.util.List r5, java.util.List r6, long r7, int r9, java.util.Set r10, int r11, int r12, boolean r13, java.lang.String r14, long r15, int r17, int r18, java.lang.String r19, int r20, int r21, java.util.List r22, int r23, java.util.List r24) {
            r0 = this;
            r1.getClass()
            r4.getClass()
            r10.getClass()
            r22.getClass()
            r24.getClass()
            r0.<init>()
            r0.f2168a = r1
            r0.f2169b = r2
            r0.f2170c = r3
            r0.f2171d = r4
            r0.f2172e = r5
            r0.f2173f = r6
            r0.f2174g = r7
            r0.f2175h = r9
            r0.f2176i = r10
            r0.f2177j = r11
            r0.f2178k = r12
            r0.f2179l = r13
            r0.f2180m = r14
            r1 = r15
            r0.f2181n = r1
            r1 = r17
            r0.f2182o = r1
            r1 = r18
            r0.f2183p = r1
            r1 = r19
            r0.f2184q = r1
            r1 = r20
            r0.f2185r = r1
            r1 = r21
            r0.f2186s = r1
            r1 = r22
            r0.f2187t = r1
            r1 = r23
            r0.f2188u = r1
            r1 = r24
            r0.f2189v = r1
            return
    }

    public static db.c a(db.c r18, int r19, java.lang.String r20, java.util.List r21, java.util.List r22, java.util.List r23, long r24, int r26, java.util.Set r27, int r28, int r29, boolean r30, java.lang.String r31, long r32, int r34, int r35, java.lang.String r36, int r37, int r38, java.util.List r39, int r40, java.util.List r41, int r42) {
            r0 = r18
            r1 = r42
            java.lang.String r2 = r0.f2168a
            r3 = r1 & 2
            if (r3 == 0) goto Ld
            int r3 = r0.f2169b
            goto Lf
        Ld:
            r3 = r19
        Lf:
            r4 = r1 & 4
            if (r4 == 0) goto L16
            java.lang.String r4 = r0.f2170c
            goto L18
        L16:
            r4 = r20
        L18:
            r5 = r1 & 8
            if (r5 == 0) goto L1f
            java.util.List r5 = r0.f2171d
            goto L21
        L1f:
            r5 = r21
        L21:
            r6 = r1 & 16
            if (r6 == 0) goto L28
            java.util.List r6 = r0.f2172e
            goto L2a
        L28:
            r6 = r22
        L2a:
            r7 = r1 & 32
            if (r7 == 0) goto L31
            java.util.List r7 = r0.f2173f
            goto L33
        L31:
            r7 = r23
        L33:
            r8 = r1 & 64
            if (r8 == 0) goto L3a
            long r8 = r0.f2174g
            goto L3c
        L3a:
            r8 = r24
        L3c:
            r10 = r1 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L43
            int r10 = r0.f2175h
            goto L45
        L43:
            r10 = r26
        L45:
            r11 = r1 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L4c
            java.util.Set r11 = r0.f2176i
            goto L4e
        L4c:
            r11 = r27
        L4e:
            r12 = r1 & 512(0x200, float:7.17E-43)
            if (r12 == 0) goto L55
            int r12 = r0.f2177j
            goto L57
        L55:
            r12 = r28
        L57:
            r13 = r1 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L5e
            int r13 = r0.f2178k
            goto L60
        L5e:
            r13 = r29
        L60:
            r14 = r1 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L67
            boolean r14 = r0.f2179l
            goto L69
        L67:
            r14 = r30
        L69:
            r15 = r1 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L70
            java.lang.String r15 = r0.f2180m
            goto L72
        L70:
            r15 = r31
        L72:
            r16 = r2
            r2 = r1 & 8192(0x2000, float:1.148E-41)
            r19 = r3
            if (r2 == 0) goto L7d
            long r2 = r0.f2181n
            goto L7f
        L7d:
            r2 = r32
        L7f:
            r20 = r2
            r2 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L88
            int r2 = r0.f2182o
            goto L8a
        L88:
            r2 = r34
        L8a:
            r3 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 & r1
            if (r3 == 0) goto L93
            int r3 = r0.f2183p
            goto L95
        L93:
            r3 = r35
        L95:
            r17 = 65536(0x10000, float:9.1835E-41)
            r17 = r1 & r17
            if (r17 == 0) goto L9e
            java.lang.String r1 = r0.f2184q
            goto La0
        L9e:
            r1 = r36
        La0:
            r17 = 131072(0x20000, float:1.83671E-40)
            r17 = r42 & r17
            r22 = r1
            if (r17 == 0) goto Lab
            int r1 = r0.f2185r
            goto Lad
        Lab:
            r1 = r37
        Lad:
            r17 = 262144(0x40000, float:3.67342E-40)
            r17 = r42 & r17
            r23 = r1
            if (r17 == 0) goto Lb8
            int r1 = r0.f2186s
            goto Lba
        Lb8:
            r1 = r38
        Lba:
            r17 = 524288(0x80000, float:7.34684E-40)
            r17 = r42 & r17
            r24 = r1
            if (r17 == 0) goto Lc5
            java.util.List r1 = r0.f2187t
            goto Lc7
        Lc5:
            r1 = r39
        Lc7:
            r17 = 1048576(0x100000, float:1.469368E-39)
            r17 = r42 & r17
            r25 = r1
            if (r17 == 0) goto Ld2
            int r1 = r0.f2188u
            goto Ld4
        Ld2:
            r1 = r40
        Ld4:
            r17 = 2097152(0x200000, float:2.938736E-39)
            r17 = r42 & r17
            r26 = r1
            if (r17 == 0) goto Ldf
            java.util.List r1 = r0.f2189v
            goto Le1
        Ldf:
            r1 = r41
        Le1:
            r0.getClass()
            r16.getClass()
            r5.getClass()
            r7.getClass()
            r11.getClass()
            r22.getClass()
            r25.getClass()
            r1.getClass()
            db.c r0 = new db.c
            r33 = r20
            r37 = r22
            r38 = r23
            r39 = r24
            r40 = r25
            r41 = r26
            r18 = r0
            r42 = r1
            r35 = r2
            r36 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r8
            r27 = r10
            r28 = r11
            r29 = r12
            r30 = r13
            r31 = r14
            r32 = r15
            r20 = r19
            r19 = r16
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r35, r36, r37, r38, r39, r40, r41, r42)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto Lde
        L4:
            boolean r0 = r5 instanceof db.c
            if (r0 != 0) goto La
            goto Ldc
        La:
            db.c r5 = (db.c) r5
            java.lang.String r0 = r4.f2168a
            java.lang.String r1 = r5.f2168a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L18
            goto Ldc
        L18:
            int r0 = r4.f2169b
            int r1 = r5.f2169b
            if (r0 == r1) goto L20
            goto Ldc
        L20:
            java.lang.String r0 = r4.f2170c
            java.lang.String r1 = r5.f2170c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2c
            goto Ldc
        L2c:
            java.util.List r0 = r4.f2171d
            java.util.List r1 = r5.f2171d
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L38
            goto Ldc
        L38:
            java.util.List r0 = r4.f2172e
            java.util.List r1 = r5.f2172e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L44
            goto Ldc
        L44:
            java.util.List r0 = r4.f2173f
            java.util.List r1 = r5.f2173f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L50
            goto Ldc
        L50:
            long r0 = r4.f2174g
            long r2 = r5.f2174g
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L5a
            goto Ldc
        L5a:
            int r0 = r4.f2175h
            int r1 = r5.f2175h
            if (r0 == r1) goto L62
            goto Ldc
        L62:
            java.util.Set r0 = r4.f2176i
            java.util.Set r1 = r5.f2176i
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L6e
            goto Ldc
        L6e:
            int r0 = r4.f2177j
            int r1 = r5.f2177j
            if (r0 == r1) goto L76
            goto Ldc
        L76:
            int r0 = r4.f2178k
            int r1 = r5.f2178k
            if (r0 == r1) goto L7e
            goto Ldc
        L7e:
            boolean r0 = r4.f2179l
            boolean r1 = r5.f2179l
            if (r0 == r1) goto L85
            goto Ldc
        L85:
            java.lang.String r0 = r4.f2180m
            java.lang.String r1 = r5.f2180m
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L90
            goto Ldc
        L90:
            long r0 = r4.f2181n
            long r2 = r5.f2181n
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L99
            goto Ldc
        L99:
            int r0 = r4.f2182o
            int r1 = r5.f2182o
            if (r0 == r1) goto La0
            goto Ldc
        La0:
            int r0 = r4.f2183p
            int r1 = r5.f2183p
            if (r0 == r1) goto La7
            goto Ldc
        La7:
            java.lang.String r0 = r4.f2184q
            java.lang.String r1 = r5.f2184q
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lb2
            goto Ldc
        Lb2:
            int r0 = r4.f2185r
            int r1 = r5.f2185r
            if (r0 == r1) goto Lb9
            goto Ldc
        Lb9:
            int r0 = r4.f2186s
            int r1 = r5.f2186s
            if (r0 == r1) goto Lc0
            goto Ldc
        Lc0:
            java.util.List r0 = r4.f2187t
            java.util.List r1 = r5.f2187t
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto Lcb
            goto Ldc
        Lcb:
            int r0 = r4.f2188u
            int r1 = r5.f2188u
            if (r0 == r1) goto Ld2
            goto Ldc
        Ld2:
            java.util.List r0 = r4.f2189v
            java.util.List r5 = r5.f2189v
            boolean r5 = gg.l.a(r0, r5)
            if (r5 != 0) goto Lde
        Ldc:
            r5 = 0
            return r5
        Lde:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f2168a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r4.f2169b
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.String r2 = r4.f2170c
            int r0 = eh.a.g(r0, r1, r2)
            java.util.List r2 = r4.f2171d
            int r0 = j8.b.e(r2, r0, r1)
            java.util.List r2 = r4.f2172e
            int r0 = j8.b.e(r2, r0, r1)
            java.util.List r2 = r4.f2173f
            int r0 = j8.b.e(r2, r0, r1)
            long r2 = r4.f2174g
            int r0 = eh.a.f(r0, r1, r2)
            int r2 = r4.f2175h
            int r0 = eh.a.e(r2, r0, r1)
            java.util.Set r2 = r4.f2176i
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = r4.f2177j
            int r0 = eh.a.e(r0, r2, r1)
            int r2 = r4.f2178k
            int r0 = eh.a.e(r2, r0, r1)
            boolean r2 = r4.f2179l
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r2 = r4.f2180m
            int r0 = eh.a.g(r0, r1, r2)
            long r2 = r4.f2181n
            int r0 = eh.a.f(r0, r1, r2)
            int r2 = r4.f2182o
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r4.f2183p
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.String r2 = r4.f2184q
            int r0 = eh.a.g(r0, r1, r2)
            int r2 = r4.f2185r
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r4.f2186s
            int r0 = eh.a.e(r2, r0, r1)
            java.util.List r2 = r4.f2187t
            int r0 = j8.b.e(r2, r0, r1)
            int r2 = r4.f2188u
            int r0 = eh.a.e(r2, r0, r1)
            java.util.List r1 = r4.f2189v
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", type="
            java.lang.String r1 = ", content="
            int r2 = r5.f2169b
            java.lang.String r3 = "ScheduledTaskItem(id="
            java.lang.String r4 = r5.f2168a
            java.lang.StringBuilder r0 = eh.a.u(r2, r3, r4, r0, r1)
            java.lang.String r1 = r5.f2170c
            r0.append(r1)
            java.lang.String r1 = ", contentItems="
            r0.append(r1)
            java.util.List r1 = r5.f2171d
            r0.append(r1)
            java.lang.String r1 = ", mediaPaths="
            r0.append(r1)
            java.util.List r1 = r5.f2172e
            r0.append(r1)
            java.lang.String r1 = ", targetIds="
            r0.append(r1)
            java.util.List r1 = r5.f2173f
            r0.append(r1)
            java.lang.String r1 = ", planTime="
            r0.append(r1)
            long r1 = r5.f2174g
            r0.append(r1)
            java.lang.String r1 = ", repeatType="
            r0.append(r1)
            int r1 = r5.f2175h
            r0.append(r1)
            java.lang.String r1 = ", repeatDays="
            r0.append(r1)
            java.util.Set r1 = r5.f2176i
            r0.append(r1)
            java.lang.String r1 = ", intervalSeconds="
            r0.append(r1)
            int r1 = r5.f2177j
            r0.append(r1)
            java.lang.String r1 = ", mediaIntervalSeconds="
            r0.append(r1)
            int r1 = r5.f2178k
            r0.append(r1)
            java.lang.String r1 = ", sendOnTimeout="
            r0.append(r1)
            boolean r1 = r5.f2179l
            r0.append(r1)
            java.lang.String r1 = ", status="
            r0.append(r1)
            java.lang.String r1 = r5.f2180m
            r0.append(r1)
            java.lang.String r1 = ", lastExecutedTime="
            r0.append(r1)
            long r1 = r5.f2181n
            r0.append(r1)
            java.lang.String r1 = ", lastSuccessCount="
            r0.append(r1)
            int r1 = r5.f2182o
            r0.append(r1)
            java.lang.String r1 = ", lastFailCount="
            r0.append(r1)
            int r1 = r5.f2183p
            r0.append(r1)
            java.lang.String r1 = ", remark="
            r0.append(r1)
            java.lang.String r1 = r5.f2184q
            r0.append(r1)
            java.lang.String r1 = ", targetType="
            r0.append(r1)
            int r1 = r5.f2185r
            r0.append(r1)
            java.lang.String r1 = ", momentsType="
            r0.append(r1)
            int r1 = r5.f2186s
            r0.append(r1)
            java.lang.String r1 = ", items="
            r0.append(r1)
            java.util.List r1 = r5.f2187t
            r0.append(r1)
            java.lang.String r1 = ", sendChannel="
            r0.append(r1)
            int r1 = r5.f2188u
            r0.append(r1)
            java.lang.String r1 = ", planTimes="
            r0.append(r1)
            java.util.List r1 = r5.f2189v
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
