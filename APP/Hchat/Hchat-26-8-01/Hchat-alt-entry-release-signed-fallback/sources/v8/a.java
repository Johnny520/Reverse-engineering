package v8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f14201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f14202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.Set f14205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.Set f14206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.Set f14207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.Set f14208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f14209i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f14210j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f14211k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.String f14212l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f14213m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.String f14214n;

    public a(java.lang.String r1, java.lang.String r2, boolean r3, boolean r4, java.util.Set r5, java.util.Set r6, java.util.Set r7, java.util.Set r8, boolean r9, long r10, boolean r12, java.lang.String r13, boolean r14, java.lang.String r15) {
            r0 = this;
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r8.getClass()
            r0.<init>()
            r0.f14201a = r1
            r0.f14202b = r2
            r0.f14203c = r3
            r0.f14204d = r4
            r0.f14205e = r5
            r0.f14206f = r6
            r0.f14207g = r7
            r0.f14208h = r8
            r0.f14209i = r9
            r0.f14210j = r10
            r0.f14211k = r12
            r0.f14212l = r13
            r0.f14213m = r14
            r0.f14214n = r15
            return
    }

    public static v8.a a(v8.a r16, java.lang.String r17, boolean r18, boolean r19, java.util.Set r20, java.util.Set r21, java.util.Set r22, java.util.Set r23, boolean r24, long r25, boolean r27, java.lang.String r28, boolean r29, java.lang.String r30, int r31) {
            r0 = r16
            r1 = r31
            java.lang.String r2 = r0.f14201a
            r3 = r1 & 2
            if (r3 == 0) goto Ld
            java.lang.String r3 = r0.f14202b
            goto Lf
        Ld:
            r3 = r17
        Lf:
            r4 = r1 & 4
            if (r4 == 0) goto L16
            boolean r4 = r0.f14203c
            goto L18
        L16:
            r4 = r18
        L18:
            r5 = r1 & 8
            if (r5 == 0) goto L1f
            boolean r5 = r0.f14204d
            goto L21
        L1f:
            r5 = r19
        L21:
            r6 = r1 & 16
            if (r6 == 0) goto L28
            java.util.Set r6 = r0.f14205e
            goto L2a
        L28:
            r6 = r20
        L2a:
            r7 = r1 & 32
            if (r7 == 0) goto L31
            java.util.Set r7 = r0.f14206f
            goto L33
        L31:
            r7 = r21
        L33:
            r8 = r1 & 64
            if (r8 == 0) goto L3a
            java.util.Set r8 = r0.f14207g
            goto L3c
        L3a:
            r8 = r22
        L3c:
            r9 = r1 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L43
            java.util.Set r9 = r0.f14208h
            goto L45
        L43:
            r9 = r23
        L45:
            r10 = r1 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L4c
            boolean r10 = r0.f14209i
            goto L4e
        L4c:
            r10 = r24
        L4e:
            r11 = r1 & 512(0x200, float:7.17E-43)
            if (r11 == 0) goto L55
            long r11 = r0.f14210j
            goto L57
        L55:
            r11 = r25
        L57:
            r13 = r1 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L5e
            boolean r13 = r0.f14211k
            goto L60
        L5e:
            r13 = r27
        L60:
            r14 = r1 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L67
            java.lang.String r14 = r0.f14212l
            goto L69
        L67:
            r14 = r28
        L69:
            r15 = r1 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L70
            boolean r15 = r0.f14213m
            goto L72
        L70:
            r15 = r29
        L72:
            r1 = r1 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L79
            java.lang.String r1 = r0.f14214n
            goto L7b
        L79:
            r1 = r30
        L7b:
            r0.getClass()
            r3.getClass()
            r6.getClass()
            r7.getClass()
            r8.getClass()
            r9.getClass()
            r14.getClass()
            r1.getClass()
            v8.a r0 = new v8.a
            r16 = r0
            r31 = r1
            r17 = r2
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r10
            r26 = r11
            r28 = r13
            r29 = r14
            r30 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto L94
        L4:
            boolean r0 = r5 instanceof v8.a
            if (r0 != 0) goto La
            goto L92
        La:
            v8.a r5 = (v8.a) r5
            java.lang.String r0 = r4.f14201a
            java.lang.String r1 = r5.f14201a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L18
            goto L92
        L18:
            java.lang.String r0 = r4.f14202b
            java.lang.String r1 = r5.f14202b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L24
            goto L92
        L24:
            boolean r0 = r4.f14203c
            boolean r1 = r5.f14203c
            if (r0 == r1) goto L2c
            goto L92
        L2c:
            boolean r0 = r4.f14204d
            boolean r1 = r5.f14204d
            if (r0 == r1) goto L33
            goto L92
        L33:
            java.util.Set r0 = r4.f14205e
            java.util.Set r1 = r5.f14205e
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L3e
            goto L92
        L3e:
            java.util.Set r0 = r4.f14206f
            java.util.Set r1 = r5.f14206f
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L49
            goto L92
        L49:
            java.util.Set r0 = r4.f14207g
            java.util.Set r1 = r5.f14207g
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L54
            goto L92
        L54:
            java.util.Set r0 = r4.f14208h
            java.util.Set r1 = r5.f14208h
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L5f
            goto L92
        L5f:
            boolean r0 = r4.f14209i
            boolean r1 = r5.f14209i
            if (r0 == r1) goto L66
            goto L92
        L66:
            long r0 = r4.f14210j
            long r2 = r5.f14210j
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L6f
            goto L92
        L6f:
            boolean r0 = r4.f14211k
            boolean r1 = r5.f14211k
            if (r0 == r1) goto L76
            goto L92
        L76:
            java.lang.String r0 = r4.f14212l
            java.lang.String r1 = r5.f14212l
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L81
            goto L92
        L81:
            boolean r0 = r4.f14213m
            boolean r1 = r5.f14213m
            if (r0 == r1) goto L88
            goto L92
        L88:
            java.lang.String r0 = r4.f14214n
            java.lang.String r5 = r5.f14214n
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L94
        L92:
            r5 = 0
            return r5
        L94:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f14201a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f14202b
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r4.f14203c
            int r0 = eh.a.h(r0, r1, r2)
            boolean r2 = r4.f14204d
            int r0 = eh.a.h(r0, r1, r2)
            java.util.Set r2 = r4.f14205e
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.Set r0 = r4.f14206f
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.util.Set r2 = r4.f14207g
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.Set r0 = r4.f14208h
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            boolean r2 = r4.f14209i
            int r0 = eh.a.h(r0, r1, r2)
            long r2 = r4.f14210j
            int r0 = eh.a.f(r0, r1, r2)
            boolean r2 = r4.f14211k
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r2 = r4.f14212l
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r4.f14213m
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r1 = r4.f14214n
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", name="
            java.lang.String r1 = ", enabled="
            java.lang.String r2 = "AutoMessageForwardRule(id="
            java.lang.String r3 = r5.f14201a
            java.lang.String r4 = r5.f14202b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", forwardOwnMessages="
            java.lang.String r2 = ", sourceIds="
            boolean r3 = r5.f14203c
            boolean r4 = r5.f14204d
            p.a.x(r0, r3, r1, r4, r2)
            java.util.Set r1 = r5.f14205e
            r0.append(r1)
            java.lang.String r1 = ", sourceMemberIds="
            r0.append(r1)
            java.util.Set r1 = r5.f14206f
            r0.append(r1)
            java.lang.String r1 = ", targetIds="
            r0.append(r1)
            java.util.Set r1 = r5.f14207g
            r0.append(r1)
            java.lang.String r1 = ", messageKinds="
            r0.append(r1)
            java.util.Set r1 = r5.f14208h
            r0.append(r1)
            java.lang.String r1 = ", delayEnabled="
            r0.append(r1)
            boolean r1 = r5.f14209i
            r0.append(r1)
            java.lang.String r1 = ", delaySeconds="
            r0.append(r1)
            long r1 = r5.f14210j
            r0.append(r1)
            java.lang.String r1 = ", includeKeywordsEnabled="
            r0.append(r1)
            boolean r1 = r5.f14211k
            r0.append(r1)
            java.lang.String r1 = ", includeKeywords="
            r0.append(r1)
            java.lang.String r1 = r5.f14212l
            r0.append(r1)
            java.lang.String r1 = ", excludeKeywordsEnabled="
            r0.append(r1)
            boolean r1 = r5.f14213m
            r0.append(r1)
            java.lang.String r1 = ", excludeKeywords="
            r0.append(r1)
            java.lang.String r1 = r5.f14214n
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
