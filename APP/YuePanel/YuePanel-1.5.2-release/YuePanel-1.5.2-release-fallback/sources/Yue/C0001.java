package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1730:1\n112#1,20:1753\n112#1,20:1786\n112#1:1806\n114#1,18:1808\n112#1,20:1826\n74#2:1731\n74#2:1732\n74#2:1733\n74#2:1734\n74#2:1735\n74#2:1736\n74#2:1737\n74#2:1738\n74#2:1739\n74#2:1740\n74#2:1741\n74#2:1742\n83#2:1743\n83#2:1744\n77#2:1745\n77#2:1746\n77#2:1747\n77#2:1748\n77#2:1749\n77#2:1750\n77#2:1751\n77#2:1752\n86#2:1773\n89#2:1775\n74#2:1776\n74#2:1777\n74#2:1778\n74#2:1779\n74#2:1780\n74#2:1781\n74#2:1782\n74#2:1783\n74#2:1784\n74#2:1785\n89#2:1807\n86#2:1846\n1#3:1774\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n*L\n415#1:1753,20\n1292#1:1786,20\n1323#1:1806\n1323#1:1808,18\n1357#1:1826,20\n178#1:1731\n202#1:1732\n321#1:1733\n326#1:1734\n349#1:1735\n350#1:1736\n351#1:1737\n352#1:1738\n358#1:1739\n359#1:1740\n360#1:1741\n361#1:1742\n385#1:1743\n386#1:1744\n392#1:1745\n393#1:1746\n394#1:1747\n395#1:1748\n396#1:1749\n397#1:1750\n398#1:1751\n399#1:1752\n427#1:1773\n888#1:1775\n906#1:1776\n908#1:1777\n912#1:1778\n914#1:1779\n918#1:1780\n920#1:1781\n924#1:1782\n926#1:1783\n946#1:1784\n949#1:1785\n1336#1:1807\n1676#1:1846\n*E\n"})
@Yue.InterfaceC3421(name = "-Buffer")
public final class C0001 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final byte[] f2 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f3 = 4096;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final long f4 = -922337203685477580L;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final long f5 = -7;

    static {
            java.lang.String r0 = "0123456789abcdef"
            byte[] r0 = Yue.C7189.m27674(r0)
            Yue.C0001.f2 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final void m7(@Yue.InterfaceC4418 Yue.C0843 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            long r0 = r2.m4889()
            r2.skip(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final void m8(@Yue.InterfaceC4418 Yue.C0843.C0844 r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥۣ۟ۢۨ r0 = r3.f2380
            if (r0 == 0) goto L1b
            r0 = 0
            r3.f2380 = r0
            r3.m4919(r0)
            r1 = -1
            r3.f2383 = r1
            r3.f2384 = r0
            r0 = -1
            r3.f2385 = r0
            r3.f2386 = r0
            return
        L1b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "not attached to a buffer"
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final long m9(@Yue.InterfaceC4418 Yue.C0843 r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            long r0 = r5.m4889()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L10
            return r2
        L10:
            Yue.ۥۡۧۨ r5 = r5.f2378
            Yue.C3329.m13903(r5)
            Yue.ۥۡۧۨ r5 = r5.f20496
            Yue.C3329.m13903(r5)
            int r2 = r5.f20492
            r3 = 8192(0x2000, float:1.148E-41)
            if (r2 >= r3) goto L29
            boolean r3 = r5.f20494
            if (r3 == 0) goto L29
            int r5 = r5.f20491
            int r2 = r2 - r5
            long r2 = (long) r2
            long r0 = r0 - r2
        L29:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final Yue.C0843 m10(@Yue.InterfaceC4418 Yue.C0843 r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            Yue.ۥۣ۟ۢۨ r0 = new Yue.ۥۣ۟ۢۨ
            r0.<init>()
            long r1 = r6.m4889()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L15
            return r0
        L15:
            Yue.ۥۡۧۨ r1 = r6.f2378
            Yue.C3329.m13903(r1)
            Yue.ۥۡۧۨ r2 = r1.m20806()
            r0.f2378 = r2
            r2.f20496 = r2
            r2.f20495 = r2
            Yue.ۥۡۧۨ r3 = r1.f20495
        L26:
            if (r3 == r1) goto L3a
            Yue.ۥۡۧۨ r4 = r2.f20496
            Yue.C3329.m13903(r4)
            Yue.C3329.m13903(r3)
            Yue.ۥۡۧۨ r5 = r3.m20806()
            r4.m20805(r5)
            Yue.ۥۡۧۨ r3 = r3.f20495
            goto L26
        L3a:
            long r1 = r6.m4889()
            r0.m4885(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Yue.C0843 m11(@Yue.InterfaceC4418 Yue.C0843 r7, @Yue.InterfaceC4418 Yue.C0843 r8, long r9, long r11) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "out"
            Yue.C3329.m13906(r8, r0)
            long r1 = r7.m4889()
            r3 = r9
            r5 = r11
            Yue.C0018.m264(r1, r3, r5)
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 != 0) goto L1a
            return r7
        L1a:
            long r2 = r8.m4889()
            long r2 = r2 + r11
            r8.m4885(r2)
            Yue.ۥۡۧۨ r2 = r7.f2378
        L24:
            Yue.C3329.m13903(r2)
            int r3 = r2.f20492
            int r4 = r2.f20491
            int r5 = r3 - r4
            long r5 = (long) r5
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 < 0) goto L38
            int r3 = r3 - r4
            long r3 = (long) r3
            long r9 = r9 - r3
            Yue.ۥۡۧۨ r2 = r2.f20495
            goto L24
        L38:
            int r3 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r3 <= 0) goto L74
            Yue.C3329.m13903(r2)
            Yue.ۥۡۧۨ r3 = r2.m20806()
            int r4 = r3.f20491
            int r9 = (int) r9
            int r4 = r4 + r9
            r3.f20491 = r4
            int r9 = (int) r11
            int r4 = r4 + r9
            int r9 = r3.f20492
            int r9 = java.lang.Math.min(r4, r9)
            r3.f20492 = r9
            Yue.ۥۡۧۨ r9 = r8.f2378
            if (r9 != 0) goto L5e
            r3.f20496 = r3
            r3.f20495 = r3
            r8.f2378 = r3
            goto L69
        L5e:
            Yue.C3329.m13903(r9)
            Yue.ۥۡۧۨ r9 = r9.f20496
            Yue.C3329.m13903(r9)
            r9.m20805(r3)
        L69:
            int r9 = r3.f20492
            int r10 = r3.f20491
            int r9 = r9 - r10
            long r9 = (long) r9
            long r11 = r11 - r9
            Yue.ۥۡۧۨ r2 = r2.f20495
            r9 = r0
            goto L38
        L74:
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final boolean m12(@Yue.InterfaceC4418 Yue.C0843 r18, @Yue.InterfaceC4543 java.lang.Object r19) {
            r0 = r18
            r1 = r19
            java.lang.String r2 = "<this>"
            Yue.C3329.m13906(r0, r2)
            r2 = 1
            if (r0 != r1) goto Ld
            return r2
        Ld:
            boolean r3 = r1 instanceof Yue.C0843
            r4 = 0
            if (r3 != 0) goto L13
            return r4
        L13:
            long r5 = r18.m4889()
            Yue.ۥۣ۟ۢۨ r1 = (Yue.C0843) r1
            long r7 = r1.m4889()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L22
            return r4
        L22:
            long r5 = r18.m4889()
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L2d
            return r2
        L2d:
            Yue.ۥۡۧۨ r3 = r0.f2378
            Yue.C3329.m13903(r3)
            Yue.ۥۡۧۨ r1 = r1.f2378
            Yue.C3329.m13903(r1)
            int r5 = r3.f20491
            int r6 = r1.f20491
            r9 = r7
        L3c:
            long r11 = r18.m4889()
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L83
            int r11 = r3.f20492
            int r11 = r11 - r5
            int r12 = r1.f20492
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L50:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L6b
            byte[] r15 = r3.f20490
            int r16 = r5 + 1
            r5 = r15[r5]
            byte[] r15 = r1.f20490
            int r17 = r6 + 1
            r6 = r15[r6]
            if (r5 == r6) goto L63
            return r4
        L63:
            r5 = 1
            long r13 = r13 + r5
            r5 = r16
            r6 = r17
            goto L50
        L6b:
            int r13 = r3.f20492
            if (r5 != r13) goto L76
            Yue.ۥۡۧۨ r3 = r3.f20495
            Yue.C3329.m13903(r3)
            int r5 = r3.f20491
        L76:
            int r13 = r1.f20492
            if (r6 != r13) goto L81
            Yue.ۥۡۧۨ r1 = r1.f20495
            Yue.C3329.m13903(r1)
            int r6 = r1.f20491
        L81:
            long r9 = r9 + r11
            goto L3c
        L83:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final long m13(@Yue.InterfaceC4418 Yue.C0843.C0844 r9, int r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r9, r0)
            if (r10 <= 0) goto L6a
            r0 = 8192(0x2000, float:1.148E-41)
            if (r10 > r0) goto L4f
            Yue.ۥۣ۟ۢۨ r1 = r9.f2380
            if (r1 == 0) goto L43
            boolean r2 = r9.f2381
            if (r2 == 0) goto L37
            long r2 = r1.m4889()
            Yue.ۥۡۧۨ r10 = r1.m4892(r10)
            int r4 = r10.f20492
            int r4 = 8192 - r4
            r10.f20492 = r0
            long r5 = (long) r4
            long r7 = r2 + r5
            r1.m4885(r7)
            r9.m4919(r10)
            r9.f2383 = r2
            byte[] r10 = r10.f20490
            r9.f2384 = r10
            int r10 = 8192 - r4
            r9.f2385 = r10
            r9.f2386 = r0
            return r5
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "expandBuffer() only permitted for read/write buffers"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L43:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "not attached to a buffer"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L4f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "minByteCount > Segment.SIZE: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L6a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "minByteCount <= 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final byte m14(@Yue.InterfaceC4418 Yue.C0843 r7, long r8) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            long r1 = r7.m4889()
            r5 = 1
            r3 = r8
            Yue.C0018.m264(r1, r3, r5)
            Yue.ۥۡۧۨ r0 = r7.f2378
            if (r0 == 0) goto L61
            long r1 = r7.m4889()
            long r1 = r1 - r8
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 >= 0) goto L3f
            long r1 = r7.m4889()
        L20:
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 <= 0) goto L31
            Yue.ۥۡۧۨ r0 = r0.f20496
            Yue.C3329.m13903(r0)
            int r7 = r0.f20492
            int r3 = r0.f20491
            int r7 = r7 - r3
            long r3 = (long) r7
            long r1 = r1 - r3
            goto L20
        L31:
            Yue.C3329.m13903(r0)
            byte[] r7 = r0.f20490
            int r0 = r0.f20491
            long r3 = (long) r0
            long r3 = r3 + r8
            long r3 = r3 - r1
            int r8 = (int) r3
            r7 = r7[r8]
            return r7
        L3f:
            r1 = 0
        L41:
            int r7 = r0.f20492
            int r3 = r0.f20491
            int r7 = r7 - r3
            long r3 = (long) r7
            long r3 = r3 + r1
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 > 0) goto L53
            Yue.ۥۡۧۨ r0 = r0.f20495
            Yue.C3329.m13903(r0)
            r1 = r3
            goto L41
        L53:
            Yue.C3329.m13903(r0)
            byte[] r7 = r0.f20490
            int r0 = r0.f20491
            long r3 = (long) r0
            long r3 = r3 + r8
            long r3 = r3 - r1
            int r8 = (int) r3
            r7 = r7[r8]
            return r7
        L61:
            r7 = 0
            Yue.C3329.m13903(r7)
            throw r7
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int m15(@Yue.InterfaceC4418 Yue.C0843 r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            Yue.ۥۡۧۨ r0 = r5.f2378
            if (r0 != 0) goto Lb
            r5 = 0
            return r5
        Lb:
            r1 = 1
        Lc:
            int r2 = r0.f20491
            int r3 = r0.f20492
        L10:
            if (r2 >= r3) goto L1c
            int r1 = r1 * 31
            byte[] r4 = r0.f20490
            r4 = r4[r2]
            int r1 = r1 + r4
            int r2 = r2 + 1
            goto L10
        L1c:
            Yue.ۥۡۧۨ r0 = r0.f20495
            Yue.C3329.m13903(r0)
            Yue.ۥۡۧۨ r2 = r5.f2378
            if (r0 != r2) goto Lc
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final long m16(@Yue.InterfaceC4418 Yue.C0843 r9, byte r10, long r11, long r13) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r9, r0)
            r0 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 > 0) goto Lc0
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 > 0) goto Lc0
            long r2 = r9.m4889()
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1b
            long r13 = r9.m4889()
        L1b:
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            r3 = -1
            if (r2 != 0) goto L22
            return r3
        L22:
            Yue.ۥۡۧۨ r2 = r9.f2378
            if (r2 != 0) goto L27
            return r3
        L27:
            long r5 = r9.m4889()
            long r5 = r5 - r11
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 >= 0) goto L7c
            long r0 = r9.m4889()
        L34:
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 <= 0) goto L45
            Yue.ۥۡۧۨ r2 = r2.f20496
            Yue.C3329.m13903(r2)
            int r9 = r2.f20492
            int r5 = r2.f20491
            int r9 = r9 - r5
            long r5 = (long) r9
            long r0 = r0 - r5
            goto L34
        L45:
            int r9 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r9 >= 0) goto L7b
            byte[] r9 = r2.f20490
            int r5 = r2.f20492
            long r5 = (long) r5
            int r7 = r2.f20491
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            long r5 = java.lang.Math.min(r5, r7)
            int r5 = (int) r5
            int r6 = r2.f20491
            long r6 = (long) r6
            long r6 = r6 + r11
            long r6 = r6 - r0
            int r11 = (int) r6
        L5e:
            if (r11 >= r5) goto L6d
            r12 = r9[r11]
            if (r12 != r10) goto L6a
        L64:
            int r9 = r2.f20491
            int r11 = r11 - r9
            long r9 = (long) r11
            long r9 = r9 + r0
            return r9
        L6a:
            int r11 = r11 + 1
            goto L5e
        L6d:
            int r9 = r2.f20492
            int r11 = r2.f20491
            int r9 = r9 - r11
            long r11 = (long) r9
            long r0 = r0 + r11
            Yue.ۥۡۧۨ r2 = r2.f20495
            Yue.C3329.m13903(r2)
            r11 = r0
            goto L45
        L7b:
            return r3
        L7c:
            int r9 = r2.f20492
            int r5 = r2.f20491
            int r9 = r9 - r5
            long r5 = (long) r9
            long r5 = r5 + r0
            int r9 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r9 > 0) goto L8e
            Yue.ۥۡۧۨ r2 = r2.f20495
            Yue.C3329.m13903(r2)
            r0 = r5
            goto L7c
        L8e:
            int r9 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r9 >= 0) goto Lbf
            byte[] r9 = r2.f20490
            int r5 = r2.f20492
            long r5 = (long) r5
            int r7 = r2.f20491
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            long r5 = java.lang.Math.min(r5, r7)
            int r5 = (int) r5
            int r6 = r2.f20491
            long r6 = (long) r6
            long r6 = r6 + r11
            long r6 = r6 - r0
            int r11 = (int) r6
        La7:
            if (r11 >= r5) goto Lb1
            r12 = r9[r11]
            if (r12 != r10) goto Lae
            goto L64
        Lae:
            int r11 = r11 + 1
            goto La7
        Lb1:
            int r9 = r2.f20492
            int r11 = r2.f20491
            int r9 = r9 - r11
            long r11 = (long) r9
            long r0 = r0 + r11
            Yue.ۥۡۧۨ r2 = r2.f20495
            Yue.C3329.m13903(r2)
            r11 = r0
            goto L8e
        Lbf:
            return r3
        Lc0:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "size="
            r10.append(r0)
            long r0 = r9.m4889()
            r10.append(r0)
            java.lang.String r9 = " fromIndex="
            r10.append(r9)
            r10.append(r11)
            java.lang.String r9 = " toIndex="
            r10.append(r9)
            r10.append(r13)
            java.lang.String r9 = r10.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final long m17(@Yue.InterfaceC4418 Yue.C0843 r18, @Yue.InterfaceC4418 Yue.C0879 r19, long r20) {
            r0 = r18
            r1 = r20
            java.lang.String r3 = "<this>"
            Yue.C3329.m13906(r0, r3)
            java.lang.String r3 = "bytes"
            r4 = r19
            Yue.C3329.m13906(r4, r3)
            int r3 = r19.m5095()
            if (r3 <= 0) goto L11d
            r5 = 0
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L102
            Yue.ۥۡۧۨ r3 = r0.f2378
            r7 = -1
            if (r3 != 0) goto L23
            return r7
        L23:
            long r9 = r18.m4889()
            long r9 = r9 - r1
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r10 = 1
            r12 = 0
            r13 = 1
            if (r9 >= 0) goto L97
            long r5 = r18.m4889()
        L34:
            int r9 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r9 <= 0) goto L45
            Yue.ۥۡۧۨ r3 = r3.f20496
            Yue.C3329.m13903(r3)
            int r9 = r3.f20492
            int r14 = r3.f20491
            int r9 = r9 - r14
            long r14 = (long) r9
            long r5 = r5 - r14
            goto L34
        L45:
            byte[] r9 = r19.mo5080()
            r12 = r9[r12]
            int r4 = r19.m5095()
            long r14 = r18.m4889()
            long r7 = (long) r4
            long r14 = r14 - r7
            long r14 = r14 + r10
        L56:
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 >= 0) goto L94
            byte[] r0 = r3.f20490
            int r7 = r3.f20492
            int r8 = r3.f20491
            long r10 = (long) r8
            long r10 = r10 + r14
            long r10 = r10 - r5
            long r7 = (long) r7
            long r7 = java.lang.Math.min(r7, r10)
            int r7 = (int) r7
            int r8 = r3.f20491
            long r10 = (long) r8
            long r10 = r10 + r1
            long r10 = r10 - r5
            int r1 = (int) r10
        L6f:
            if (r1 >= r7) goto L86
            r2 = r0[r1]
            if (r2 != r12) goto L83
            int r2 = r1 + 1
            boolean r2 = m67(r3, r2, r9, r13, r4)
            if (r2 == 0) goto L83
        L7d:
            int r0 = r3.f20491
            int r1 = r1 - r0
            long r0 = (long) r1
            long r0 = r0 + r5
            return r0
        L83:
            int r1 = r1 + 1
            goto L6f
        L86:
            int r0 = r3.f20492
            int r1 = r3.f20491
            int r0 = r0 - r1
            long r0 = (long) r0
            long r5 = r5 + r0
            Yue.ۥۡۧۨ r3 = r3.f20495
            Yue.C3329.m13903(r3)
            r1 = r5
            goto L56
        L94:
            r0 = -1
            return r0
        L97:
            int r7 = r3.f20492
            int r8 = r3.f20491
            int r7 = r7 - r8
            long r7 = (long) r7
            long r7 = r7 + r5
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 > 0) goto La9
            Yue.ۥۡۧۨ r3 = r3.f20495
            Yue.C3329.m13903(r3)
            r5 = r7
            goto L97
        La9:
            byte[] r7 = r19.mo5080()
            r8 = r7[r12]
            int r4 = r19.m5095()
            long r14 = r18.m4889()
            r16 = r5
            long r5 = (long) r4
            long r14 = r14 - r5
            long r14 = r14 + r10
            r5 = r16
        Lbe:
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 >= 0) goto Lff
            byte[] r0 = r3.f20490
            int r9 = r3.f20492
            int r10 = r3.f20491
            long r10 = (long) r10
            long r10 = r10 + r14
            long r10 = r10 - r5
            r18 = r14
            long r13 = (long) r9
            long r9 = java.lang.Math.min(r13, r10)
            int r9 = (int) r9
            int r10 = r3.f20491
            long r10 = (long) r10
            long r10 = r10 + r1
            long r10 = r10 - r5
            int r1 = (int) r10
        Ld9:
            if (r1 >= r9) goto Led
            r2 = r0[r1]
            if (r2 != r8) goto Le9
            int r2 = r1 + 1
            r10 = 1
            boolean r2 = m67(r3, r2, r7, r10, r4)
            if (r2 == 0) goto Lea
            goto L7d
        Le9:
            r10 = 1
        Lea:
            int r1 = r1 + 1
            goto Ld9
        Led:
            r10 = 1
            int r0 = r3.f20492
            int r1 = r3.f20491
            int r0 = r0 - r1
            long r0 = (long) r0
            long r5 = r5 + r0
            Yue.ۥۡۧۨ r3 = r3.f20495
            Yue.C3329.m13903(r3)
            r14 = r18
            r1 = r5
            r13 = r10
            goto Lbe
        Lff:
            r0 = -1
            return r0
        L102:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "fromIndex < 0: "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L11d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "bytes is empty"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final long m18(@Yue.InterfaceC4418 Yue.C0843 r11, @Yue.InterfaceC4418 Yue.C0879 r12, long r13) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r11, r0)
            java.lang.String r0 = "targetBytes"
            Yue.C3329.m13906(r12, r0)
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 < 0) goto L138
            Yue.ۥۡۧۨ r2 = r11.f2378
            r3 = -1
            if (r2 != 0) goto L17
            return r3
        L17:
            long r5 = r11.m4889()
            long r5 = r5 - r13
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            r6 = 2
            r7 = 0
            r8 = 1
            if (r5 >= 0) goto Lb2
            long r0 = r11.m4889()
        L27:
            int r5 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r5 <= 0) goto L38
            Yue.ۥۡۧۨ r2 = r2.f20496
            Yue.C3329.m13903(r2)
            int r5 = r2.f20492
            int r9 = r2.f20491
            int r5 = r5 - r9
            long r9 = (long) r5
            long r0 = r0 - r9
            goto L27
        L38:
            int r5 = r12.m5095()
            if (r5 != r6) goto L78
            byte r5 = r12.m5066(r7)
            byte r12 = r12.m5066(r8)
        L46:
            long r6 = r11.m4889()
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 >= 0) goto Lb1
            byte[] r6 = r2.f20490
            int r7 = r2.f20491
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            int r13 = (int) r7
            int r14 = r2.f20492
        L58:
            if (r13 >= r14) goto L6a
            r7 = r6[r13]
            if (r7 == r5) goto L64
            if (r7 != r12) goto L61
            goto L64
        L61:
            int r13 = r13 + 1
            goto L58
        L64:
            int r11 = r2.f20491
        L66:
            int r13 = r13 - r11
            long r11 = (long) r13
            long r11 = r11 + r0
            return r11
        L6a:
            int r13 = r2.f20492
            int r14 = r2.f20491
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            Yue.ۥۡۧۨ r2 = r2.f20495
            Yue.C3329.m13903(r2)
            r13 = r0
            goto L46
        L78:
            byte[] r12 = r12.mo5080()
        L7c:
            long r5 = r11.m4889()
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto Lb1
            byte[] r5 = r2.f20490
            int r6 = r2.f20491
            long r8 = (long) r6
            long r8 = r8 + r13
            long r8 = r8 - r0
            int r13 = (int) r8
            int r14 = r2.f20492
        L8e:
            if (r13 >= r14) goto La3
            r6 = r5[r13]
            int r8 = r12.length
            r9 = r7
        L94:
            if (r9 >= r8) goto La0
            r10 = r12[r9]
            if (r6 != r10) goto L9d
        L9a:
            int r11 = r2.f20491
            goto L66
        L9d:
            int r9 = r9 + 1
            goto L94
        La0:
            int r13 = r13 + 1
            goto L8e
        La3:
            int r13 = r2.f20492
            int r14 = r2.f20491
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            Yue.ۥۡۧۨ r2 = r2.f20495
            Yue.C3329.m13903(r2)
            r13 = r0
            goto L7c
        Lb1:
            return r3
        Lb2:
            int r5 = r2.f20492
            int r9 = r2.f20491
            int r5 = r5 - r9
            long r9 = (long) r5
            long r9 = r9 + r0
            int r5 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r5 > 0) goto Lc4
            Yue.ۥۡۧۨ r2 = r2.f20495
            Yue.C3329.m13903(r2)
            r0 = r9
            goto Lb2
        Lc4:
            int r5 = r12.m5095()
            if (r5 != r6) goto Lff
            byte r5 = r12.m5066(r7)
            byte r12 = r12.m5066(r8)
        Ld2:
            long r6 = r11.m4889()
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 >= 0) goto L137
            byte[] r6 = r2.f20490
            int r7 = r2.f20491
            long r7 = (long) r7
            long r7 = r7 + r13
            long r7 = r7 - r0
            int r13 = (int) r7
            int r14 = r2.f20492
        Le4:
            if (r13 >= r14) goto Lf1
            r7 = r6[r13]
            if (r7 == r5) goto L64
            if (r7 != r12) goto Lee
            goto L64
        Lee:
            int r13 = r13 + 1
            goto Le4
        Lf1:
            int r13 = r2.f20492
            int r14 = r2.f20491
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            Yue.ۥۡۧۨ r2 = r2.f20495
            Yue.C3329.m13903(r2)
            r13 = r0
            goto Ld2
        Lff:
            byte[] r12 = r12.mo5080()
        L103:
            long r5 = r11.m4889()
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L137
            byte[] r5 = r2.f20490
            int r6 = r2.f20491
            long r8 = (long) r6
            long r8 = r8 + r13
            long r8 = r8 - r0
            int r13 = (int) r8
            int r14 = r2.f20492
        L115:
            if (r13 >= r14) goto L129
            r6 = r5[r13]
            int r8 = r12.length
            r9 = r7
        L11b:
            if (r9 >= r8) goto L126
            r10 = r12[r9]
            if (r6 != r10) goto L123
            goto L9a
        L123:
            int r9 = r9 + 1
            goto L11b
        L126:
            int r13 = r13 + 1
            goto L115
        L129:
            int r13 = r2.f20492
            int r14 = r2.f20491
            int r13 = r13 - r14
            long r13 = (long) r13
            long r0 = r0 + r13
            Yue.ۥۡۧۨ r2 = r2.f20495
            Yue.C3329.m13903(r2)
            r13 = r0
            goto L103
        L137:
            return r3
        L138:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "fromIndex < 0: "
            r11.append(r12)
            r11.append(r13)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int m19(@Yue.InterfaceC4418 Yue.C0843.C0844 r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            long r0 = r4.f2383
            Yue.ۥۣ۟ۢۨ r2 = r4.f2380
            Yue.C3329.m13903(r2)
            long r2 = r2.m4889()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L2c
            long r0 = r4.f2383
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L23
            r0 = 0
        L1e:
            int r4 = r4.m4918(r0)
            goto L2b
        L23:
            int r2 = r4.f2386
            int r3 = r4.f2385
            int r2 = r2 - r3
            long r2 = (long) r2
            long r0 = r0 + r2
            goto L1e
        L2b:
            return r4
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "no more bytes"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final boolean m20(@Yue.InterfaceC4418 Yue.C0843 r6, long r7, @Yue.InterfaceC4418 Yue.C0879 r9, int r10, int r11) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "bytes"
            Yue.C3329.m13906(r9, r0)
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L3e
            if (r10 < 0) goto L3e
            if (r11 < 0) goto L3e
            long r2 = r6.m4889()
            long r2 = r2 - r7
            long r4 = (long) r11
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L3e
            int r0 = r9.m5095()
            int r0 = r0 - r10
            if (r0 >= r11) goto L27
            goto L3e
        L27:
            r0 = r1
        L28:
            if (r0 >= r11) goto L3c
            long r2 = (long) r0
            long r2 = r2 + r7
            byte r2 = r6.m4855(r2)
            int r3 = r10 + r0
            byte r3 = r9.m5066(r3)
            if (r2 == r3) goto L39
            return r1
        L39:
            int r0 = r0 + 1
            goto L28
        L3c:
            r6 = 1
            return r6
        L3e:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int m21(@Yue.InterfaceC4418 Yue.C0843 r2, @Yue.InterfaceC4418 byte[] r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r3, r0)
            int r0 = r3.length
            r1 = 0
            int r2 = r2.read(r3, r1, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int m22(@Yue.InterfaceC4418 Yue.C0843 r7, @Yue.InterfaceC4418 byte[] r8, int r9, int r10) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r8, r0)
            int r0 = r8.length
            long r1 = (long) r0
            long r3 = (long) r9
            long r5 = (long) r10
            Yue.C0018.m264(r1, r3, r5)
            Yue.ۥۡۧۨ r0 = r7.f2378
            if (r0 != 0) goto L17
            r7 = -1
            return r7
        L17:
            int r1 = r0.f20492
            int r2 = r0.f20491
            int r1 = r1 - r2
            int r10 = java.lang.Math.min(r10, r1)
            byte[] r1 = r0.f20490
            int r2 = r0.f20491
            int r3 = r2 + r10
            Yue.C0586.m2170(r1, r8, r9, r2, r3)
            int r8 = r0.f20491
            int r8 = r8 + r10
            r0.f20491 = r8
            long r8 = r7.m4889()
            long r1 = (long) r10
            long r8 = r8 - r1
            r7.m4885(r8)
            int r8 = r0.f20491
            int r9 = r0.f20492
            if (r8 != r9) goto L46
            Yue.ۥۡۧۨ r8 = r0.m20804()
            r7.f2378 = r8
            Yue.C5550.m20825(r0)
        L46:
            return r10
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final long m23(@Yue.InterfaceC4418 Yue.C0843 r4, @Yue.InterfaceC4418 Yue.C0843 r5, long r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r5, r0)
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L2b
            long r2 = r4.m4889()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L1b
            r4 = -1
            return r4
        L1b:
            long r0 = r4.m4889()
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L27
            long r6 = r4.m4889()
        L27:
            r5.mo4176(r4, r6)
            return r6
        L2b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "byteCount < 0: "
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final long m24(@Yue.InterfaceC4418 Yue.C0843 r4, @Yue.InterfaceC4418 Yue.InterfaceC5794 r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r5, r0)
            long r0 = r4.m4889()
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L17
            r5.mo4176(r4, r0)
        L17:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final Yue.C0843.C0844 m25(@Yue.InterfaceC4418 Yue.C0843 r1, @Yue.InterfaceC4418 Yue.C0843.C0844 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "unsafeCursor"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۣ۟ۢۨ$ۥ r2 = Yue.C0018.m273(r2)
            Yue.ۥۣ۟ۢۨ r0 = r2.f2380
            if (r0 != 0) goto L18
            r2.f2380 = r1
            r1 = 1
            r2.f2381 = r1
            return r2
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "already attached to a buffer"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final byte m26(@Yue.InterfaceC4418 Yue.C0843 r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r9, r0)
            long r0 = r9.m4889()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L37
            Yue.ۥۡۧۨ r0 = r9.f2378
            Yue.C3329.m13903(r0)
            int r1 = r0.f20491
            int r2 = r0.f20492
            byte[] r3 = r0.f20490
            int r4 = r1 + 1
            r1 = r3[r1]
            long r5 = r9.m4889()
            r7 = 1
            long r5 = r5 - r7
            r9.m4885(r5)
            if (r4 != r2) goto L34
            Yue.ۥۡۧۨ r2 = r0.m20804()
            r9.f2378 = r2
            Yue.C5550.m20825(r0)
            goto L36
        L34:
            r0.f20491 = r4
        L36:
            return r1
        L37:
            java.io.EOFException r9 = new java.io.EOFException
            r9.<init>()
            throw r9
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final byte[] m27(@Yue.InterfaceC4418 Yue.C0843 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            long r0 = r2.m4889()
            byte[] r2 = r2.mo4866(r0)
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final byte[] m28(@Yue.InterfaceC4418 Yue.C0843 r2, long r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L27
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L27
            long r0 = r2.m4889()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L21
            int r3 = (int) r3
            byte[] r3 = new byte[r3]
            r2.readFully(r3)
            return r3
        L21:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
        L27:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "byteCount: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final Yue.C0879 m29(@Yue.InterfaceC4418 Yue.C0843 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            long r0 = r2.m4889()
            Yue.ۥۣ۟ۥۤ r2 = r2.mo4817(r0)
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final Yue.C0879 m30(@Yue.InterfaceC4418 Yue.C0843 r2, long r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L39
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L39
            long r0 = r2.m4889()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L33
            r0 = 4096(0x1000, double:2.0237E-320)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L29
            int r0 = (int) r3
            Yue.ۥۣ۟ۥۤ r0 = r2.m4891(r0)
            r2.skip(r3)
            return r0
        L29:
            Yue.ۥۣ۟ۥۤ r0 = new Yue.ۥۣ۟ۥۤ
            byte[] r2 = r2.mo4866(r3)
            r0.<init>(r2)
            return r0
        L33:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
        L39:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "byteCount: "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final long m31(@Yue.InterfaceC4418 Yue.C0843 r18) {
            r0 = r18
            java.lang.String r1 = "<this>"
            Yue.C3329.m13906(r0, r1)
            long r1 = r18.m4889()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto Lf0
            r1 = 0
            r5 = -7
            r2 = r1
            r8 = r3
            r6 = r5
            r5 = r2
        L18:
            Yue.ۥۡۧۨ r10 = r0.f2378
            Yue.C3329.m13903(r10)
            byte[] r11 = r10.f20490
            int r12 = r10.f20491
            int r13 = r10.f20492
        L23:
            if (r12 >= r13) goto L87
            r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L75
            r14 = 57
            if (r15 > r14) goto L75
            int r14 = 48 - r15
            r16 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r16 < 0) goto L48
            if (r16 != 0) goto L42
            long r3 = (long) r14
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 >= 0) goto L42
            goto L48
        L42:
            r3 = 10
            long r8 = r8 * r3
            long r3 = (long) r14
            long r8 = r8 + r3
            goto L7f
        L48:
            Yue.ۥۣ۟ۢۨ r0 = new Yue.ۥۣ۟ۢۨ
            r0.<init>()
            Yue.ۥۣ۟ۢۨ r0 = r0.m4899(r8)
            Yue.ۥۣ۟ۢۨ r0 = r0.m4898(r15)
            if (r2 != 0) goto L5a
            r0.readByte()
        L5a:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.mo4867()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L75:
            r3 = 45
            if (r15 != r3) goto L86
            if (r1 != 0) goto L86
            r2 = 1
            long r6 = r6 - r2
            r2 = 1
        L7f:
            int r12 = r12 + 1
            int r1 = r1 + 1
            r3 = 0
            goto L23
        L86:
            r5 = 1
        L87:
            if (r12 != r13) goto L93
            Yue.ۥۡۧۨ r3 = r10.m20804()
            r0.f2378 = r3
            Yue.C5550.m20825(r10)
            goto L95
        L93:
            r10.f20491 = r12
        L95:
            if (r5 != 0) goto La0
            Yue.ۥۡۧۨ r3 = r0.f2378
            if (r3 != 0) goto L9c
            goto La0
        L9c:
            r3 = 0
            goto L18
        La0:
            long r3 = r18.m4889()
            long r5 = (long) r1
            long r3 = r3 - r5
            r0.m4885(r3)
            if (r2 == 0) goto Lad
            r14 = 2
            goto Lae
        Lad:
            r14 = 1
        Lae:
            if (r1 >= r14) goto Leb
            long r3 = r18.m4889()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto Le5
            if (r2 == 0) goto Lbf
            java.lang.String r1 = "Expected a digit"
            goto Lc1
        Lbf:
            java.lang.String r1 = "Expected a digit or '-'"
        Lc1:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " but was 0x"
            r3.append(r1)
            r4 = 0
            byte r0 = r0.m4855(r4)
            java.lang.String r0 = Yue.C0018.m280(r0)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        Le5:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        Leb:
            if (r2 == 0) goto Lee
            goto Lef
        Lee:
            long r8 = -r8
        Lef:
            return r8
        Lf0:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final void m32(@Yue.InterfaceC4418 Yue.C0843 r2, @Yue.InterfaceC4418 Yue.C0843 r3, long r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r3, r0)
            long r0 = r2.m4889()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L16
            r3.mo4176(r2, r4)
            return
        L16:
            long r4 = r2.m4889()
            r3.mo4176(r2, r4)
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final void m33(@Yue.InterfaceC4418 Yue.C0843 r3, @Yue.InterfaceC4418 byte[] r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "sink"
            Yue.C3329.m13906(r4, r0)
            r0 = 0
        Lb:
            int r1 = r4.length
            if (r0 >= r1) goto L1f
            int r1 = r4.length
            int r1 = r1 - r0
            int r1 = r3.read(r4, r0, r1)
            r2 = -1
            if (r1 == r2) goto L19
            int r0 = r0 + r1
            goto Lb
        L19:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
        L1f:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final long m34(@Yue.InterfaceC4418 Yue.C0843 r14) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r14, r0)
            long r0 = r14.m4889()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb6
            r0 = 0
            r1 = r0
            r4 = r2
        L12:
            Yue.ۥۡۧۨ r6 = r14.f2378
            Yue.C3329.m13903(r6)
            byte[] r7 = r6.f20490
            int r8 = r6.f20491
            int r9 = r6.f20492
        L1d:
            if (r8 >= r9) goto L98
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L2c
            r11 = 57
            if (r10 > r11) goto L2c
            int r11 = r10 + (-48)
            goto L41
        L2c:
            r11 = 97
            if (r10 < r11) goto L37
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L37
            int r11 = r10 + (-87)
            goto L41
        L37:
            r11 = 65
            if (r10 < r11) goto L79
            r11 = 70
            if (r10 > r11) goto L79
            int r11 = r10 + (-55)
        L41:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L51
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1d
        L51:
            Yue.ۥۣ۟ۢۨ r14 = new Yue.ۥۣ۟ۢۨ
            r14.<init>()
            Yue.ۥۣ۟ۢۨ r14 = r14.m4900(r4)
            Yue.ۥۣ۟ۢۨ r14 = r14.m4898(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number too large: "
            r1.append(r2)
            java.lang.String r14 = r14.mo4867()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L79:
            if (r0 == 0) goto L7d
            r1 = 1
            goto L98
        L7d:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            java.lang.String r1 = Yue.C0018.m280(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L98:
            if (r8 != r9) goto La4
            Yue.ۥۡۧۨ r7 = r6.m20804()
            r14.f2378 = r7
            Yue.C5550.m20825(r6)
            goto La6
        La4:
            r6.f20491 = r8
        La6:
            if (r1 != 0) goto Lac
            Yue.ۥۡۧۨ r6 = r14.f2378
            if (r6 != 0) goto L12
        Lac:
            long r1 = r14.m4889()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.m4885(r1)
            return r4
        Lb6:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int m35(@Yue.InterfaceC4418 Yue.C0843 r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r9, r0)
            long r0 = r9.m4889()
            r2 = 4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L7b
            Yue.ۥۡۧۨ r0 = r9.f2378
            Yue.C3329.m13903(r0)
            int r1 = r0.f20491
            int r4 = r0.f20492
            int r5 = r4 - r1
            long r5 = (long) r5
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto L41
            byte r0 = r9.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            byte r1 = r9.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            byte r1 = r9.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            byte r9 = r9.readByte()
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r9 | r0
            return r9
        L41:
            byte[] r5 = r0.f20490
            int r6 = r1 + 1
            r7 = r5[r1]
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 << 24
            int r8 = r1 + 2
            r6 = r5[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r6 = r6 | r7
            int r7 = r1 + 3
            r8 = r5[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            r6 = r6 | r8
            int r1 = r1 + 4
            r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r6
            long r6 = r9.m4889()
            long r6 = r6 - r2
            r9.m4885(r6)
            if (r1 != r4) goto L78
            Yue.ۥۡۧۨ r1 = r0.m20804()
            r9.f2378 = r1
            Yue.C5550.m20825(r0)
            goto L7a
        L78:
            r0.f20491 = r1
        L7a:
            return r5
        L7b:
            java.io.EOFException r9 = new java.io.EOFException
            r9.<init>()
            throw r9
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final long m36(@Yue.InterfaceC4418 Yue.C0843 r15) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r15, r0)
            long r0 = r15.m4889()
            r2 = 8
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L9c
            Yue.ۥۡۧۨ r0 = r15.f2378
            Yue.C3329.m13903(r0)
            int r1 = r0.f20491
            int r4 = r0.f20492
            int r5 = r4 - r1
            long r5 = (long) r5
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 32
            if (r5 >= 0) goto L35
            int r0 = r15.readInt()
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = r0 << r6
            int r15 = r15.readInt()
            long r4 = (long) r15
            long r2 = r2 & r4
            long r0 = r0 | r2
            return r0
        L35:
            byte[] r5 = r0.f20490
            int r7 = r1 + 1
            r8 = r5[r1]
            long r8 = (long) r8
            r10 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r10
            r12 = 56
            long r8 = r8 << r12
            int r12 = r1 + 2
            r7 = r5[r7]
            long r13 = (long) r7
            long r13 = r13 & r10
            r7 = 48
            long r13 = r13 << r7
            long r7 = r8 | r13
            int r9 = r1 + 3
            r12 = r5[r12]
            long r12 = (long) r12
            long r12 = r12 & r10
            r14 = 40
            long r12 = r12 << r14
            long r7 = r7 | r12
            int r12 = r1 + 4
            r9 = r5[r9]
            long r13 = (long) r9
            long r13 = r13 & r10
            long r13 = r13 << r6
            long r6 = r7 | r13
            int r8 = r1 + 5
            r9 = r5[r12]
            long r12 = (long) r9
            long r12 = r12 & r10
            r9 = 24
            long r12 = r12 << r9
            long r6 = r6 | r12
            int r9 = r1 + 6
            r8 = r5[r8]
            long r12 = (long) r8
            long r12 = r12 & r10
            r8 = 16
            long r12 = r12 << r8
            long r6 = r6 | r12
            int r8 = r1 + 7
            r9 = r5[r9]
            long r12 = (long) r9
            long r12 = r12 & r10
            r9 = 8
            long r12 = r12 << r9
            long r6 = r6 | r12
            int r1 = r1 + r9
            r5 = r5[r8]
            long r8 = (long) r5
            long r8 = r8 & r10
            long r5 = r6 | r8
            long r7 = r15.m4889()
            long r7 = r7 - r2
            r15.m4885(r7)
            if (r1 != r4) goto L99
            Yue.ۥۡۧۨ r1 = r0.m20804()
            r15.f2378 = r1
            Yue.C5550.m20825(r0)
            goto L9b
        L99:
            r0.f20491 = r1
        L9b:
            return r5
        L9c:
            java.io.EOFException r15 = new java.io.EOFException
            r15.<init>()
            throw r15
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final short m37(@Yue.InterfaceC4418 Yue.C0843 r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r9, r0)
            long r0 = r9.m4889()
            r2 = 2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L56
            Yue.ۥۡۧۨ r0 = r9.f2378
            Yue.C3329.m13903(r0)
            int r1 = r0.f20491
            int r4 = r0.f20492
            int r5 = r4 - r1
            r6 = 2
            if (r5 >= r6) goto L2e
            byte r0 = r9.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            byte r9 = r9.readByte()
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r9 | r0
            short r9 = (short) r9
            return r9
        L2e:
            byte[] r5 = r0.f20490
            int r7 = r1 + 1
            r8 = r5[r1]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            int r1 = r1 + r6
            r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r8
            long r6 = r9.m4889()
            long r6 = r6 - r2
            r9.m4885(r6)
            if (r1 != r4) goto L52
            Yue.ۥۡۧۨ r1 = r0.m20804()
            r9.f2378 = r1
            Yue.C5550.m20825(r0)
            goto L54
        L52:
            r0.f20491 = r1
        L54:
            short r9 = (short) r5
            return r9
        L56:
            java.io.EOFException r9 = new java.io.EOFException
            r9.<init>()
            throw r9
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final Yue.C0843.C0844 m38(@Yue.InterfaceC4418 Yue.C0843 r1, @Yue.InterfaceC4418 Yue.C0843.C0844 r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "unsafeCursor"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۣ۟ۢۨ$ۥ r2 = Yue.C0018.m273(r2)
            Yue.ۥۣ۟ۢۨ r0 = r2.f2380
            if (r0 != 0) goto L18
            r2.f2380 = r1
            r1 = 0
            r2.f2381 = r1
            return r2
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "already attached to a buffer"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final java.lang.String m39(@Yue.InterfaceC4418 Yue.C0843 r6, long r7) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L67
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 > 0) goto L67
            long r1 = r6.m4889()
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 < 0) goto L61
            if (r0 != 0) goto L1f
            java.lang.String r6 = ""
            return r6
        L1f:
            Yue.ۥۡۧۨ r0 = r6.f2378
            Yue.C3329.m13903(r0)
            int r1 = r0.f20491
            long r2 = (long) r1
            long r2 = r2 + r7
            int r4 = r0.f20492
            long r4 = (long) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L3b
            byte[] r6 = r6.mo4866(r7)
            r7 = 3
            r8 = 0
            r0 = 0
            java.lang.String r6 = Yue.C7191.m27681(r6, r0, r0, r7, r8)
            return r6
        L3b:
            byte[] r2 = r0.f20490
            int r3 = (int) r7
            int r4 = r1 + r3
            java.lang.String r1 = Yue.C7191.m27680(r2, r1, r4)
            int r2 = r0.f20491
            int r2 = r2 + r3
            r0.f20491 = r2
            long r2 = r6.m4889()
            long r2 = r2 - r7
            r6.m4885(r2)
            int r7 = r0.f20491
            int r8 = r0.f20492
            if (r7 != r8) goto L60
            Yue.ۥۡۧۨ r7 = r0.m20804()
            r6.f2378 = r7
            Yue.C5550.m20825(r0)
        L60:
            return r1
        L61:
            java.io.EOFException r6 = new java.io.EOFException
            r6.<init>()
            throw r6
        L67:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "byteCount: "
            r6.append(r0)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int m40(@Yue.InterfaceC4418 Yue.C0843 r12) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r12, r0)
            long r0 = r12.m4889()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb8
            byte r0 = r12.m4855(r2)
            r1 = r0 & 128(0x80, float:1.8E-43)
            r2 = 1
            r3 = 128(0x80, float:1.8E-43)
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r1 != 0) goto L23
            r1 = r0 & 127(0x7f, float:1.78E-43)
            r5 = 0
            r6 = r5
            r5 = r2
            goto L45
        L23:
            r1 = r0 & 224(0xe0, float:3.14E-43)
            r5 = 192(0xc0, float:2.69E-43)
            if (r1 != r5) goto L2e
            r1 = r0 & 31
            r5 = 2
            r6 = r3
            goto L45
        L2e:
            r1 = r0 & 240(0xf0, float:3.36E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r1 != r5) goto L3a
            r1 = r0 & 15
            r5 = 3
            r6 = 2048(0x800, float:2.87E-42)
            goto L45
        L3a:
            r1 = r0 & 248(0xf8, float:3.48E-43)
            r5 = 240(0xf0, float:3.36E-43)
            if (r1 != r5) goto Lb2
            r1 = r0 & 7
            r5 = 4
            r6 = 65536(0x10000, float:9.1835E-41)
        L45:
            long r7 = r12.m4889()
            long r9 = (long) r5
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L7e
        L4e:
            if (r2 >= r5) goto L65
            long r7 = (long) r2
            byte r0 = r12.m4855(r7)
            r11 = r0 & 192(0xc0, float:2.69E-43)
            if (r11 != r3) goto L61
            int r1 = r1 << 6
            r0 = r0 & 63
            r1 = r1 | r0
            int r2 = r2 + 1
            goto L4e
        L61:
            r12.skip(r7)
            return r4
        L65:
            r12.skip(r9)
            r12 = 1114111(0x10ffff, float:1.561202E-39)
            if (r1 <= r12) goto L6e
            goto L7d
        L6e:
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r12 > r1) goto L79
            r12 = 57344(0xe000, float:8.0356E-41)
            if (r1 >= r12) goto L79
            goto L7d
        L79:
            if (r1 >= r6) goto L7c
            goto L7d
        L7c:
            r4 = r1
        L7d:
            return r4
        L7e:
            java.io.EOFException r1 = new java.io.EOFException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "size < "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = ": "
            r2.append(r3)
            long r3 = r12.m4889()
            r2.append(r3)
            java.lang.String r12 = " (to read code point prefixed 0x"
            r2.append(r12)
            java.lang.String r12 = Yue.C0018.m280(r0)
            r2.append(r12)
            r12 = 41
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            r1.<init>(r12)
            throw r1
        Lb2:
            r0 = 1
            r12.skip(r0)
            return r4
        Lb8:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final java.lang.String m41(@Yue.InterfaceC4418 Yue.C0843 r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            r0 = 10
            long r0 = r4.mo4878(r0)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L16
            java.lang.String r4 = m68(r4, r0)
            goto L2a
        L16:
            long r0 = r4.m4889()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L29
            long r0 = r4.m4889()
            java.lang.String r4 = r4.mo4814(r0)
            goto L2a
        L29:
            r4 = 0
        L2a:
            return r4
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final java.lang.String m42(@Yue.InterfaceC4418 Yue.C0843 r11, long r12) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r11, r0)
            r0 = 0
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 < 0) goto L98
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 1
            if (r2 != 0) goto L17
            goto L19
        L17:
            long r0 = r12 + r3
        L19:
            r6 = 10
            r7 = 0
            r5 = r11
            r9 = r0
            long r5 = r5.mo4835(r6, r7, r9)
            r7 = -1
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L2e
            java.lang.String r11 = m68(r11, r5)
            return r11
        L2e:
            long r5 = r11.m4889()
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L4d
            long r2 = r0 - r3
            byte r2 = r11.m4855(r2)
            r3 = 13
            if (r2 != r3) goto L4d
            byte r2 = r11.m4855(r0)
            r3 = 10
            if (r2 != r3) goto L4d
            java.lang.String r11 = m68(r11, r0)
            return r11
        L4d:
            Yue.ۥۣ۟ۢۨ r6 = new Yue.ۥۣ۟ۢۨ
            r6.<init>()
            long r0 = r11.m4889()
            r2 = 32
            long r2 = (long) r2
            long r4 = java.lang.Math.min(r2, r0)
            r2 = 0
            r0 = r11
            r1 = r6
            r0.m4825(r1, r2, r4)
            java.io.EOFException r0 = new java.io.EOFException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\\n not found: limit="
            r1.append(r2)
            long r2 = r11.m4889()
            long r11 = java.lang.Math.min(r2, r12)
            r1.append(r11)
            java.lang.String r11 = " content="
            r1.append(r11)
            Yue.ۥۣ۟ۥۤ r11 = r6.mo4853()
            java.lang.String r11 = r11.mo5071()
            r1.append(r11)
            r11 = 8230(0x2026, float:1.1533E-41)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        L98:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "limit < 0: "
            r11.append(r0)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r12.<init>(r11)
            throw r12
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final long m43(@Yue.InterfaceC4418 Yue.C0843.C0844 r13, long r14) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r13, r0)
            Yue.ۥۣ۟ۢۨ r0 = r13.f2380
            if (r0 == 0) goto Lb2
            boolean r1 = r13.f2381
            if (r1 == 0) goto La6
            long r1 = r0.m4889()
            int r3 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            r4 = 0
            if (r3 > 0) goto L6e
            int r3 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r3 < 0) goto L53
            long r6 = r1 - r14
        L1d:
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 <= 0) goto L45
            Yue.ۥۡۧۨ r3 = r0.f2378
            Yue.C3329.m13903(r3)
            Yue.ۥۡۧۨ r3 = r3.f20496
            Yue.C3329.m13903(r3)
            int r8 = r3.f20492
            int r9 = r3.f20491
            int r9 = r8 - r9
            long r9 = (long) r9
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 > 0) goto L41
            Yue.ۥۡۧۨ r8 = r3.m20804()
            r0.f2378 = r8
            Yue.C5550.m20825(r3)
            long r6 = r6 - r9
            goto L1d
        L41:
            int r4 = (int) r6
            int r8 = r8 - r4
            r3.f20492 = r8
        L45:
            r3 = 0
            r13.m4919(r3)
            r13.f2383 = r14
            r13.f2384 = r3
            r3 = -1
            r13.f2385 = r3
            r13.f2386 = r3
            goto La2
        L53:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "newSize < 0: "
            r13.append(r0)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r14.<init>(r13)
            throw r14
        L6e:
            if (r3 <= 0) goto La2
            long r6 = r14 - r1
            r3 = 1
            r8 = r3
        L74:
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 <= 0) goto La2
            Yue.ۥۡۧۨ r9 = r0.m4892(r3)
            int r10 = r9.f20492
            int r10 = 8192 - r10
            long r10 = (long) r10
            long r10 = java.lang.Math.min(r6, r10)
            int r10 = (int) r10
            int r11 = r9.f20492
            int r11 = r11 + r10
            r9.f20492 = r11
            long r11 = (long) r10
            long r6 = r6 - r11
            if (r8 == 0) goto L74
            r13.m4919(r9)
            r13.f2383 = r1
            byte[] r8 = r9.f20490
            r13.f2384 = r8
            int r8 = r9.f20492
            int r9 = r8 - r10
            r13.f2385 = r9
            r13.f2386 = r8
            r8 = 0
            goto L74
        La2:
            r0.m4885(r14)
            return r1
        La6:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "resizeBuffer() only permitted for read/write buffers"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        Lb2:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "not attached to a buffer"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final int m44(@Yue.InterfaceC4418 Yue.C0843.C0844 r11, long r12) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r11, r0)
            Yue.ۥۣ۟ۢۨ r0 = r11.f2380
            if (r0 == 0) goto Lf2
            r1 = -1
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 < 0) goto Lcf
            long r2 = r0.m4889()
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 > 0) goto Lcf
            if (r1 == 0) goto Lc1
            long r1 = r0.m4889()
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 != 0) goto L23
            goto Lc1
        L23:
            long r1 = r0.m4889()
            Yue.ۥۡۧۨ r3 = r0.f2378
            Yue.ۥۡۧۨ r4 = r11.m4915()
            r5 = 0
            if (r4 == 0) goto L53
            long r7 = r11.f2383
            int r4 = r11.f2385
            Yue.ۥۡۧۨ r9 = r11.m4915()
            Yue.C3329.m13903(r9)
            int r9 = r9.f20491
            int r4 = r4 - r9
            long r9 = (long) r4
            long r7 = r7 - r9
            int r4 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r4 <= 0) goto L4d
            Yue.ۥۡۧۨ r1 = r11.m4915()
            r4 = r3
            r3 = r1
            r1 = r7
            goto L54
        L4d:
            Yue.ۥۡۧۨ r4 = r11.m4915()
            r5 = r7
            goto L54
        L53:
            r4 = r3
        L54:
            long r7 = r1 - r12
            long r9 = r12 - r5
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L71
        L5c:
            Yue.C3329.m13903(r4)
            int r1 = r4.f20492
            int r2 = r4.f20491
            int r3 = r1 - r2
            long r7 = (long) r3
            long r7 = r7 + r5
            int r3 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r3 < 0) goto L87
            int r1 = r1 - r2
            long r1 = (long) r1
            long r5 = r5 + r1
            Yue.ۥۡۧۨ r4 = r4.f20495
            goto L5c
        L71:
            int r4 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r4 <= 0) goto L85
            Yue.C3329.m13903(r3)
            Yue.ۥۡۧۨ r3 = r3.f20496
            Yue.C3329.m13903(r3)
            int r4 = r3.f20492
            int r5 = r3.f20491
            int r4 = r4 - r5
            long r4 = (long) r4
            long r1 = r1 - r4
            goto L71
        L85:
            r5 = r1
            r4 = r3
        L87:
            boolean r1 = r11.f2381
            if (r1 == 0) goto La8
            Yue.C3329.m13903(r4)
            boolean r1 = r4.f20493
            if (r1 == 0) goto La8
            Yue.ۥۡۧۨ r1 = r4.m20808()
            Yue.ۥۡۧۨ r2 = r0.f2378
            if (r2 != r4) goto L9c
            r0.f2378 = r1
        L9c:
            Yue.ۥۡۧۨ r4 = r4.m20805(r1)
            Yue.ۥۡۧۨ r0 = r4.f20496
            Yue.C3329.m13903(r0)
            r0.m20804()
        La8:
            r11.m4919(r4)
            r11.f2383 = r12
            Yue.C3329.m13903(r4)
            byte[] r0 = r4.f20490
            r11.f2384 = r0
            int r0 = r4.f20491
            long r12 = r12 - r5
            int r12 = (int) r12
            int r0 = r0 + r12
            r11.f2385 = r0
            int r12 = r4.f20492
            r11.f2386 = r12
            int r12 = r12 - r0
            return r12
        Lc1:
            r0 = 0
            r11.m4919(r0)
            r11.f2383 = r12
            r11.f2384 = r0
            r12 = -1
            r11.f2385 = r12
            r11.f2386 = r12
            return r12
        Lcf:
            java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "offset="
            r1.append(r2)
            r1.append(r12)
            java.lang.String r12 = " > size="
            r1.append(r12)
            long r12 = r0.m4889()
            r1.append(r12)
            java.lang.String r12 = r1.toString()
            r11.<init>(r12)
            throw r11
        Lf2:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "not attached to a buffer"
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int m45(@Yue.InterfaceC4418 Yue.C0843 r3, @Yue.InterfaceC4418 Yue.C4650 r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r4, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            int r0 = m71(r3, r4, r2, r0, r1)
            r1 = -1
            if (r0 != r1) goto L15
            return r1
        L15:
            Yue.ۥۣ۟ۥۤ[] r4 = r4.m18479()
            r4 = r4[r0]
            int r4 = r4.m5095()
            long r1 = (long) r4
            r3.skip(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final void m46(@Yue.InterfaceC4418 Yue.C0843 r6, long r7) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
        L5:
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L3d
            Yue.ۥۡۧۨ r0 = r6.f2378
            if (r0 == 0) goto L37
            int r1 = r0.f20492
            int r2 = r0.f20491
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r7, r1)
            int r1 = (int) r1
            long r2 = r6.m4889()
            long r4 = (long) r1
            long r2 = r2 - r4
            r6.m4885(r2)
            long r7 = r7 - r4
            int r2 = r0.f20491
            int r2 = r2 + r1
            r0.f20491 = r2
            int r1 = r0.f20492
            if (r2 != r1) goto L5
            Yue.ۥۡۧۨ r1 = r0.m20804()
            r6.f2378 = r1
            Yue.C5550.m20825(r0)
            goto L5
        L37:
            java.io.EOFException r6 = new java.io.EOFException
            r6.<init>()
            throw r6
        L3d:
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final Yue.C0879 m47(@Yue.InterfaceC4418 Yue.C0843 r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            long r0 = r4.m4889()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L1a
            long r0 = r4.m4889()
            int r0 = (int) r0
            Yue.ۥۣ۟ۥۤ r4 = r4.m4891(r0)
            return r4
        L1a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "size > Int.MAX_VALUE: "
            r0.append(r1)
            long r1 = r4.m4889()
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final Yue.C0879 m48(@Yue.InterfaceC4418 Yue.C0843 r7, int r8) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            if (r8 != 0) goto La
            Yue.ۥۣ۟ۥۤ r7 = Yue.C0879.f2558
            return r7
        La:
            long r0 = r7.m4889()
            r2 = 0
            long r4 = (long) r8
            Yue.C0018.m264(r0, r2, r4)
            Yue.ۥۡۧۨ r0 = r7.f2378
            r1 = 0
            r2 = r1
            r3 = r2
        L19:
            if (r2 >= r8) goto L33
            Yue.C3329.m13903(r0)
            int r4 = r0.f20492
            int r5 = r0.f20491
            if (r4 == r5) goto L2b
            int r4 = r4 - r5
            int r2 = r2 + r4
            int r3 = r3 + 1
            Yue.ۥۡۧۨ r0 = r0.f20495
            goto L19
        L2b:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r8 = "s.limit == s.pos"
            r7.<init>(r8)
            throw r7
        L33:
            byte[][] r0 = new byte[r3][]
            int r2 = r3 * 2
            int[] r2 = new int[r2]
            Yue.ۥۡۧۨ r7 = r7.f2378
            r4 = r1
        L3c:
            if (r1 >= r8) goto L5e
            Yue.C3329.m13903(r7)
            byte[] r5 = r7.f20490
            r0[r4] = r5
            int r5 = r7.f20492
            int r6 = r7.f20491
            int r5 = r5 - r6
            int r1 = r1 + r5
            int r5 = java.lang.Math.min(r1, r8)
            r2[r4] = r5
            int r5 = r4 + r3
            int r6 = r7.f20491
            r2[r5] = r6
            r5 = 1
            r7.f20493 = r5
            int r4 = r4 + r5
            Yue.ۥۡۧۨ r7 = r7.f20495
            goto L3c
        L5e:
            Yue.ۥۡۧۨۢ r7 = new Yue.ۥۡۧۨۢ
            r7.<init>(r0, r2)
            return r7
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final Yue.C5546 m49(@Yue.InterfaceC4418 Yue.C0843 r2, int r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            r0 = 1
            if (r3 < r0) goto L35
            r0 = 8192(0x2000, float:1.148E-41)
            if (r3 > r0) goto L35
            Yue.ۥۡۧۨ r1 = r2.f2378
            if (r1 != 0) goto L1b
            Yue.ۥۡۧۨ r3 = Yue.C5550.m20826()
            r2.f2378 = r3
            r3.f20496 = r3
            r3.f20495 = r3
            return r3
        L1b:
            Yue.C3329.m13903(r1)
            Yue.ۥۡۧۨ r2 = r1.f20496
            Yue.C3329.m13903(r2)
            int r1 = r2.f20492
            int r1 = r1 + r3
            if (r1 > r0) goto L2c
            boolean r3 = r2.f20494
            if (r3 != 0) goto L34
        L2c:
            Yue.ۥۡۧۨ r3 = Yue.C5550.m20826()
            Yue.ۥۡۧۨ r2 = r2.m20805(r3)
        L34:
            return r2
        L35:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "unexpected capacity"
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final Yue.C0843 m50(@Yue.InterfaceC4418 Yue.C0843 r1, @Yue.InterfaceC4418 Yue.C0879 r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "byteString"
            Yue.C3329.m13906(r2, r0)
            r2.mo5107(r1, r3, r4)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final Yue.C0843 m51(@Yue.InterfaceC4418 Yue.C0843 r4, @Yue.InterfaceC4418 Yue.InterfaceC5839 r5, long r6) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r5, r0)
        La:
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L22
            long r0 = r5.mo4179(r4, r6)
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L1c
            long r6 = r6 - r0
            goto La
        L1c:
            java.io.EOFException r4 = new java.io.EOFException
            r4.<init>()
            throw r4
        L22:
            return r4
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final Yue.C0843 m52(@Yue.InterfaceC4418 Yue.C0843 r2, @Yue.InterfaceC4418 byte[] r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r3, r0)
            int r0 = r3.length
            r1 = 0
            Yue.ۥۣ۟ۢۨ r2 = r2.m4897(r3, r1, r0)
            return r2
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final Yue.C0843 m53(@Yue.InterfaceC4418 Yue.C0843 r9, @Yue.InterfaceC4418 byte[] r10, int r11, int r12) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r9, r0)
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r10, r0)
            int r0 = r10.length
            long r1 = (long) r0
            long r3 = (long) r11
            long r7 = (long) r12
            r5 = r7
            Yue.C0018.m264(r1, r3, r5)
            int r12 = r12 + r11
        L13:
            if (r11 >= r12) goto L34
            r0 = 1
            Yue.ۥۡۧۨ r0 = r9.m4892(r0)
            int r1 = r12 - r11
            int r2 = r0.f20492
            int r2 = 8192 - r2
            int r1 = java.lang.Math.min(r1, r2)
            byte[] r2 = r0.f20490
            int r3 = r0.f20492
            int r4 = r11 + r1
            Yue.C0586.m2170(r10, r2, r3, r11, r4)
            int r11 = r0.f20492
            int r11 = r11 + r1
            r0.f20492 = r11
            r11 = r4
            goto L13
        L34:
            long r10 = r9.m4889()
            long r10 = r10 + r7
            r9.m4885(r10)
            return r9
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final void m54(@Yue.InterfaceC4418 Yue.C0843 r7, @Yue.InterfaceC4418 Yue.C0843 r8, long r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r8, r0)
            if (r8 == r7) goto Lba
            long r1 = r8.m4889()
            r3 = 0
            r5 = r9
            Yue.C0018.m264(r1, r3, r5)
        L16:
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lb9
            Yue.ۥۡۧۨ r0 = r8.f2378
            Yue.C3329.m13903(r0)
            int r0 = r0.f20492
            Yue.ۥۡۧۨ r1 = r8.f2378
            Yue.C3329.m13903(r1)
            int r1 = r1.f20491
            int r0 = r0 - r1
            long r0 = (long) r0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 >= 0) goto L7b
            Yue.ۥۡۧۨ r0 = r7.f2378
            if (r0 == 0) goto L3a
            Yue.C3329.m13903(r0)
            Yue.ۥۡۧۨ r0 = r0.f20496
            goto L3b
        L3a:
            r0 = 0
        L3b:
            if (r0 == 0) goto L6f
            boolean r1 = r0.f20494
            if (r1 == 0) goto L6f
            int r1 = r0.f20492
            long r1 = (long) r1
            long r1 = r1 + r9
            boolean r3 = r0.f20493
            if (r3 == 0) goto L4b
            r3 = 0
            goto L4d
        L4b:
            int r3 = r0.f20491
        L4d:
            long r3 = (long) r3
            long r1 = r1 - r3
            r3 = 8192(0x2000, double:4.0474E-320)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L6f
            Yue.ۥۡۧۨ r1 = r8.f2378
            Yue.C3329.m13903(r1)
            int r2 = (int) r9
            r1.m20809(r0, r2)
            long r0 = r8.m4889()
            long r0 = r0 - r9
            r8.m4885(r0)
            long r0 = r7.m4889()
            long r0 = r0 + r9
            r7.m4885(r0)
            return
        L6f:
            Yue.ۥۡۧۨ r0 = r8.f2378
            Yue.C3329.m13903(r0)
            int r1 = (int) r9
            Yue.ۥۡۧۨ r0 = r0.m20807(r1)
            r8.f2378 = r0
        L7b:
            Yue.ۥۡۧۨ r0 = r8.f2378
            Yue.C3329.m13903(r0)
            int r1 = r0.f20492
            int r2 = r0.f20491
            int r1 = r1 - r2
            long r1 = (long) r1
            Yue.ۥۡۧۨ r3 = r0.m20804()
            r8.f2378 = r3
            Yue.ۥۡۧۨ r3 = r7.f2378
            if (r3 != 0) goto L97
            r7.f2378 = r0
            r0.f20496 = r0
            r0.f20495 = r0
            goto La6
        L97:
            Yue.C3329.m13903(r3)
            Yue.ۥۡۧۨ r3 = r3.f20496
            Yue.C3329.m13903(r3)
            Yue.ۥۡۧۨ r0 = r3.m20805(r0)
            r0.m20803()
        La6:
            long r3 = r8.m4889()
            long r3 = r3 - r1
            r8.m4885(r3)
            long r3 = r7.m4889()
            long r3 = r3 + r1
            r7.m4885(r3)
            long r9 = r9 - r1
            goto L16
        Lb9:
            return
        Lba:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "source == this"
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ Yue.C0843 m55(Yue.C0843 r0, Yue.C0879 r1, int r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            int r3 = r1.m5095()
        Ld:
            java.lang.String r4 = "<this>"
            Yue.C3329.m13906(r0, r4)
            java.lang.String r4 = "byteString"
            Yue.C3329.m13906(r1, r4)
            r1.mo5107(r0, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final long m56(@Yue.InterfaceC4418 Yue.C0843 r6, @Yue.InterfaceC4418 Yue.InterfaceC5839 r7) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "source"
            Yue.C3329.m13906(r7, r0)
            r0 = 0
        Lc:
            r2 = 8192(0x2000, double:4.0474E-320)
            long r2 = r7.mo4179(r6, r2)
            r4 = -1
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L1a
            long r0 = r0 + r2
            goto Lc
        L1a:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final Yue.C0843 m57(@Yue.InterfaceC4418 Yue.C0843 r4, int r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            r0 = 1
            Yue.ۥۡۧۨ r0 = r4.m4892(r0)
            byte[] r1 = r0.f20490
            int r2 = r0.f20492
            int r3 = r2 + 1
            r0.f20492 = r3
            byte r5 = (byte) r5
            r1[r2] = r5
            long r0 = r4.m4889()
            r2 = 1
            long r0 = r0 + r2
            r4.m4885(r0)
            return r4
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final Yue.C0843 m58(@Yue.InterfaceC4418 Yue.C0843 r12, long r13) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r12, r0)
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 != 0) goto L12
            r13 = 48
            Yue.ۥۣ۟ۢۨ r12 = r12.m4898(r13)
            return r12
        L12:
            r3 = 1
            if (r2 >= 0) goto L23
            long r13 = -r13
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L21
            java.lang.String r13 = "-9223372036854775808"
            Yue.ۥۣ۟ۢۨ r12 = r12.m4911(r13)
            return r12
        L21:
            r2 = r3
            goto L24
        L23:
            r2 = 0
        L24:
            r4 = 100000000(0x5f5e100, double:4.94065646E-316)
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            r5 = 10
            if (r4 >= 0) goto L72
            r6 = 10000(0x2710, double:4.9407E-320)
            int r4 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r4 >= 0) goto L50
            r6 = 100
            int r4 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r4 >= 0) goto L44
            r6 = 10
            int r4 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r4 >= 0) goto L41
            goto Le9
        L41:
            r3 = 2
            goto Le9
        L44:
            r3 = 1000(0x3e8, double:4.94E-321)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L4d
            r3 = 3
            goto Le9
        L4d:
            r3 = 4
            goto Le9
        L50:
            r3 = 1000000(0xf4240, double:4.940656E-318)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L64
            r3 = 100000(0x186a0, double:4.94066E-319)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L61
            r3 = 5
            goto Le9
        L61:
            r3 = 6
            goto Le9
        L64:
            r3 = 10000000(0x989680, double:4.9406565E-317)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L6e
            r3 = 7
            goto Le9
        L6e:
            r3 = 8
            goto Le9
        L72:
            r3 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9f
            r3 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L90
            r3 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L8e
            r3 = 9
            goto Le9
        L8e:
            r3 = r5
            goto Le9
        L90:
            r3 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto L9c
            r3 = 11
            goto Le9
        L9c:
            r3 = 12
            goto Le9
        L9f:
            r3 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Lc3
            r3 = 10000000000000(0x9184e72a000, double:4.9406564584125E-311)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Lb4
            r3 = 13
            goto Le9
        Lb4:
            r3 = 100000000000000(0x5af3107a4000, double:4.94065645841247E-310)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Lc0
            r3 = 14
            goto Le9
        Lc0:
            r3 = 15
            goto Le9
        Lc3:
            r3 = 100000000000000000(0x16345785d8a0000, double:5.620395787888205E-302)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Ldb
            r3 = 10000000000000000(0x2386f26fc10000, double:5.431165199810528E-308)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Ld8
            r3 = 16
            goto Le9
        Ld8:
            r3 = 17
            goto Le9
        Ldb:
            r3 = 1000000000000000000(0xde0b6b3a7640000, double:7.832953389245686E-242)
            int r3 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r3 >= 0) goto Le7
            r3 = 18
            goto Le9
        Le7:
            r3 = 19
        Le9:
            if (r2 == 0) goto Led
            int r3 = r3 + 1
        Led:
            Yue.ۥۡۧۨ r4 = r12.m4892(r3)
            byte[] r6 = r4.f20490
            int r7 = r4.f20492
            int r7 = r7 + r3
        Lf6:
            int r8 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r8 == 0) goto L10a
            long r8 = (long) r5
            long r10 = r13 % r8
            int r10 = (int) r10
            int r7 = r7 + (-1)
            byte[] r11 = m65()
            r10 = r11[r10]
            r6[r7] = r10
            long r13 = r13 / r8
            goto Lf6
        L10a:
            if (r2 == 0) goto L112
            int r7 = r7 + (-1)
            r13 = 45
            r6[r7] = r13
        L112:
            int r13 = r4.f20492
            int r13 = r13 + r3
            r4.f20492 = r13
            long r13 = r12.m4889()
            long r0 = (long) r3
            long r13 = r13 + r0
            r12.m4885(r13)
            return r12
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final Yue.C0843 m59(@Yue.InterfaceC4418 Yue.C0843 r12, long r13) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r12, r0)
            r0 = 0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 != 0) goto L12
            r13 = 48
            Yue.ۥۣ۟ۢۨ r12 = r12.m4898(r13)
            return r12
        L12:
            r0 = 1
            long r1 = r13 >>> r0
            long r1 = r1 | r13
            r3 = 2
            long r4 = r1 >>> r3
            long r1 = r1 | r4
            r4 = 4
            long r5 = r1 >>> r4
            long r1 = r1 | r5
            r5 = 8
            long r6 = r1 >>> r5
            long r1 = r1 | r6
            r6 = 16
            long r7 = r1 >>> r6
            long r1 = r1 | r7
            r7 = 32
            long r8 = r1 >>> r7
            long r1 = r1 | r8
            long r8 = r1 >>> r0
            r10 = 6148914691236517205(0x5555555555555555, double:1.1945305291614955E103)
            long r8 = r8 & r10
            long r1 = r1 - r8
            long r8 = r1 >>> r3
            r10 = 3689348814741910323(0x3333333333333333, double:4.667261458395856E-62)
            long r8 = r8 & r10
            long r1 = r1 & r10
            long r8 = r8 + r1
            long r1 = r8 >>> r4
            long r1 = r1 + r8
            r8 = 1085102592571150095(0xf0f0f0f0f0f0f0f, double:3.815736827118017E-236)
            long r1 = r1 & r8
            long r8 = r1 >>> r5
            long r1 = r1 + r8
            long r5 = r1 >>> r6
            long r1 = r1 + r5
            r5 = 63
            long r8 = r1 & r5
            long r1 = r1 >>> r7
            long r1 = r1 & r5
            long r8 = r8 + r1
            r1 = 3
            long r1 = (long) r1
            long r8 = r8 + r1
            long r1 = (long) r4
            long r8 = r8 / r1
            int r1 = (int) r8
            Yue.ۥۡۧۨ r2 = r12.m4892(r1)
            byte[] r3 = r2.f20490
            int r5 = r2.f20492
            int r6 = r5 + r1
            int r6 = r6 - r0
        L67:
            if (r6 < r5) goto L79
            byte[] r0 = m65()
            r7 = 15
            long r7 = r7 & r13
            int r7 = (int) r7
            r0 = r0[r7]
            r3[r6] = r0
            long r13 = r13 >>> r4
            int r6 = r6 + (-1)
            goto L67
        L79:
            int r13 = r2.f20492
            int r13 = r13 + r1
            r2.f20492 = r13
            long r13 = r12.m4889()
            long r0 = (long) r1
            long r13 = r13 + r0
            r12.m4885(r13)
            return r12
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final Yue.C0843 m60(@Yue.InterfaceC4418 Yue.C0843 r7, int r8) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            r0 = 4
            Yue.ۥۡۧۨ r1 = r7.m4892(r0)
            byte[] r2 = r1.f20490
            int r3 = r1.f20492
            int r4 = r3 + 1
            int r5 = r8 >>> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r2[r3] = r5
            int r5 = r3 + 2
            int r6 = r8 >>> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r3 + 3
            int r6 = r8 >>> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r2[r5] = r6
            int r3 = r3 + r0
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r2[r4] = r8
            r1.f20492 = r3
            long r0 = r7.m4889()
            r2 = 4
            long r0 = r0 + r2
            r7.m4885(r0)
            return r7
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final Yue.C0843 m61(@Yue.InterfaceC4418 Yue.C0843 r11, long r12) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r11, r0)
            r0 = 8
            Yue.ۥۡۧۨ r1 = r11.m4892(r0)
            byte[] r2 = r1.f20490
            int r3 = r1.f20492
            int r4 = r3 + 1
            r5 = 56
            long r5 = r12 >>> r5
            r7 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r7
            int r5 = (int) r5
            byte r5 = (byte) r5
            r2[r3] = r5
            int r5 = r3 + 2
            r6 = 48
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r3 + 3
            r6 = 40
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r5] = r6
            int r5 = r3 + 4
            r6 = 32
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r3 + 5
            r6 = 24
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r5] = r6
            int r5 = r3 + 6
            r6 = 16
            long r9 = r12 >>> r6
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r4] = r6
            int r4 = r3 + 7
            long r9 = r12 >>> r0
            long r9 = r9 & r7
            int r6 = (int) r9
            byte r6 = (byte) r6
            r2[r5] = r6
            int r3 = r3 + r0
            long r12 = r12 & r7
            int r12 = (int) r12
            byte r12 = (byte) r12
            r2[r4] = r12
            r1.f20492 = r3
            long r12 = r11.m4889()
            r0 = 8
            long r12 = r12 + r0
            r11.m4885(r12)
            return r11
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final Yue.C0843 m62(@Yue.InterfaceC4418 Yue.C0843 r6, int r7) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            r0 = 2
            Yue.ۥۡۧۨ r1 = r6.m4892(r0)
            byte[] r2 = r1.f20490
            int r3 = r1.f20492
            int r4 = r3 + 1
            int r5 = r7 >>> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r2[r3] = r5
            int r3 = r3 + r0
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r2[r4] = r7
            r1.f20492 = r3
            long r0 = r6.m4889()
            r2 = 2
            long r0 = r0 + r2
            r6.m4885(r0)
            return r6
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final Yue.C0843 m63(@Yue.InterfaceC4418 Yue.C0843 r9, @Yue.InterfaceC4418 java.lang.String r10, int r11, int r12) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r9, r0)
            java.lang.String r0 = "string"
            Yue.C3329.m13906(r10, r0)
            if (r11 < 0) goto L16c
            if (r12 < r11) goto L149
            int r0 = r10.length()
            if (r12 > r0) goto L122
        L14:
            if (r11 >= r12) goto L121
            char r0 = r10.charAt(r11)
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L55
            r2 = 1
            Yue.ۥۡۧۨ r2 = r9.m4892(r2)
            byte[] r3 = r2.f20490
            int r4 = r2.f20492
            int r4 = r4 - r11
            int r5 = 8192 - r4
            int r5 = java.lang.Math.min(r12, r5)
            int r6 = r11 + 1
            int r11 = r11 + r4
            byte r0 = (byte) r0
            r3[r11] = r0
        L34:
            r11 = r6
            if (r11 >= r5) goto L44
            char r0 = r10.charAt(r11)
            if (r0 >= r1) goto L44
            int r6 = r11 + 1
            int r11 = r11 + r4
            byte r0 = (byte) r0
            r3[r11] = r0
            goto L34
        L44:
            int r4 = r4 + r11
            int r0 = r2.f20492
            int r4 = r4 - r0
            int r0 = r0 + r4
            r2.f20492 = r0
            long r0 = r9.m4889()
            long r2 = (long) r4
            long r0 = r0 + r2
            r9.m4885(r0)
            goto L14
        L55:
            r2 = 2048(0x800, float:2.87E-42)
            if (r0 >= r2) goto L81
            r2 = 2
            Yue.ۥۡۧۨ r3 = r9.m4892(r2)
            byte[] r4 = r3.f20490
            int r5 = r3.f20492
            int r6 = r0 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            r4[r6] = r0
            int r5 = r5 + r2
            r3.f20492 = r5
            long r0 = r9.m4889()
            r2 = 2
            long r0 = r0 + r2
            r9.m4885(r0)
        L7e:
            int r11 = r11 + 1
            goto L14
        L81:
            r2 = 55296(0xd800, float:7.7486E-41)
            r3 = 63
            if (r0 < r2) goto Lf1
            r2 = 57343(0xdfff, float:8.0355E-41)
            if (r0 <= r2) goto L8e
            goto Lf1
        L8e:
            int r2 = r11 + 1
            if (r2 >= r12) goto L97
            char r4 = r10.charAt(r2)
            goto L98
        L97:
            r4 = 0
        L98:
            r5 = 56319(0xdbff, float:7.892E-41)
            if (r0 > r5) goto Leb
            r5 = 56320(0xdc00, float:7.8921E-41)
            if (r5 > r4) goto Leb
            r5 = 57344(0xe000, float:8.0356E-41)
            if (r4 >= r5) goto Leb
            r0 = r0 & 1023(0x3ff, float:1.434E-42)
            int r0 = r0 << 10
            r2 = r4 & 1023(0x3ff, float:1.434E-42)
            r0 = r0 | r2
            r2 = 65536(0x10000, float:9.1835E-41)
            int r0 = r0 + r2
            r2 = 4
            Yue.ۥۡۧۨ r4 = r9.m4892(r2)
            byte[] r5 = r4.f20490
            int r6 = r4.f20492
            int r7 = r0 >> 18
            r7 = r7 | 240(0xf0, float:3.36E-43)
            byte r7 = (byte) r7
            r5[r6] = r7
            int r7 = r6 + 1
            int r8 = r0 >> 12
            r8 = r8 & r3
            r8 = r8 | r1
            byte r8 = (byte) r8
            r5[r7] = r8
            int r7 = r6 + 2
            int r8 = r0 >> 6
            r8 = r8 & r3
            r8 = r8 | r1
            byte r8 = (byte) r8
            r5[r7] = r8
            int r7 = r6 + 3
            r0 = r0 & r3
            r0 = r0 | r1
            byte r0 = (byte) r0
            r5[r7] = r0
            int r6 = r6 + r2
            r4.f20492 = r6
            long r0 = r9.m4889()
            r2 = 4
            long r0 = r0 + r2
            r9.m4885(r0)
            int r11 = r11 + 2
            goto L14
        Leb:
            r9.m4898(r3)
            r11 = r2
            goto L14
        Lf1:
            r2 = 3
            Yue.ۥۡۧۨ r4 = r9.m4892(r2)
            byte[] r5 = r4.f20490
            int r6 = r4.f20492
            int r7 = r0 >> 12
            r7 = r7 | 224(0xe0, float:3.14E-43)
            byte r7 = (byte) r7
            r5[r6] = r7
            int r7 = r6 + 1
            int r8 = r0 >> 6
            r3 = r3 & r8
            r3 = r3 | r1
            byte r3 = (byte) r3
            r5[r7] = r3
            int r3 = r6 + 2
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            r5[r3] = r0
            int r6 = r6 + r2
            r4.f20492 = r6
            long r0 = r9.m4889()
            r2 = 3
            long r0 = r0 + r2
            r9.m4885(r0)
            goto L7e
        L121:
            return r9
        L122:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "endIndex > string.length: "
            r9.append(r11)
            r9.append(r12)
            java.lang.String r11 = " > "
            r9.append(r11)
            int r10 = r10.length()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L149:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "endIndex < beginIndex: "
            r9.append(r10)
            r9.append(r12)
            java.lang.String r10 = " < "
            r9.append(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L16c:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "beginIndex < 0: "
            r9.append(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final Yue.C0843 m64(@Yue.InterfaceC4418 Yue.C0843 r8, int r9) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r8, r0)
            r0 = 128(0x80, float:1.8E-43)
            if (r9 >= r0) goto Le
            r8.m4898(r9)
            goto Lb5
        Le:
            r1 = 2048(0x800, float:2.87E-42)
            r2 = 63
            if (r9 >= r1) goto L3a
            r1 = 2
            Yue.ۥۡۧۨ r3 = r8.m4892(r1)
            byte[] r4 = r3.f20490
            int r5 = r3.f20492
            int r6 = r9 >> 6
            r6 = r6 | 192(0xc0, float:2.69E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.f20492 = r5
            long r0 = r8.m4889()
            r2 = 2
            long r0 = r0 + r2
            r8.m4885(r0)
            goto Lb5
        L3a:
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r1 > r9) goto L48
            r1 = 57344(0xe000, float:8.0356E-41)
            if (r9 >= r1) goto L48
            r8.m4898(r2)
            goto Lb5
        L48:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r9 >= r1) goto L7a
            r1 = 3
            Yue.ۥۡۧۨ r3 = r8.m4892(r1)
            byte[] r4 = r3.f20490
            int r5 = r3.f20492
            int r6 = r9 >> 12
            r6 = r6 | 224(0xe0, float:3.14E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            int r7 = r9 >> 6
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 2
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.f20492 = r5
            long r0 = r8.m4889()
            r2 = 3
            long r0 = r0 + r2
            r8.m4885(r0)
            goto Lb5
        L7a:
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            if (r9 > r1) goto Lb6
            r1 = 4
            Yue.ۥۡۧۨ r3 = r8.m4892(r1)
            byte[] r4 = r3.f20490
            int r5 = r3.f20492
            int r6 = r9 >> 18
            r6 = r6 | 240(0xf0, float:3.36E-43)
            byte r6 = (byte) r6
            r4[r5] = r6
            int r6 = r5 + 1
            int r7 = r9 >> 12
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 2
            int r7 = r9 >> 6
            r7 = r7 & r2
            r7 = r7 | r0
            byte r7 = (byte) r7
            r4[r6] = r7
            int r6 = r5 + 3
            r9 = r9 & r2
            r9 = r9 | r0
            byte r9 = (byte) r9
            r4[r6] = r9
            int r5 = r5 + r1
            r3.f20492 = r5
            long r0 = r8.m4889()
            r2 = 4
            long r0 = r0 + r2
            r8.m4885(r0)
        Lb5:
            return r8
        Lb6:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected code point: 0x"
            r0.append(r1)
            java.lang.String r9 = Yue.C0018.m281(r9)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.<init>(r9)
            throw r8
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final byte[] m65() {
            byte[] r0 = Yue.C0001.f2
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static /* synthetic */ void m66() {
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final boolean m67(@Yue.InterfaceC4418 Yue.C5546 r5, int r6, @Yue.InterfaceC4418 byte[] r7, int r8, int r9) {
            java.lang.String r0 = "segment"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "bytes"
            Yue.C3329.m13906(r7, r0)
            int r0 = r5.f20492
            byte[] r1 = r5.f20490
        Le:
            if (r8 >= r9) goto L2e
            if (r6 != r0) goto L21
            Yue.ۥۡۧۨ r5 = r5.f20495
            Yue.C3329.m13903(r5)
            byte[] r6 = r5.f20490
            int r0 = r5.f20491
            int r1 = r5.f20492
            r4 = r1
            r1 = r6
            r6 = r0
            r0 = r4
        L21:
            r2 = r1[r6]
            r3 = r7[r8]
            if (r2 == r3) goto L29
            r5 = 0
            return r5
        L29:
            int r6 = r6 + 1
            int r8 = r8 + 1
            goto Le
        L2e:
            r5 = 1
            return r5
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final java.lang.String m68(@Yue.InterfaceC4418 Yue.C0843 r6, long r7) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r6, r0)
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L21
            long r3 = r7 - r1
            byte r0 = r6.m4855(r3)
            r5 = 13
            if (r0 != r5) goto L21
            java.lang.String r7 = r6.mo4814(r3)
            r0 = 2
            r6.skip(r0)
            goto L28
        L21:
            java.lang.String r7 = r6.mo4814(r7)
            r6.skip(r1)
        L28:
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final <T> T m69(@Yue.InterfaceC4418 Yue.C0843 r5, long r6, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super Yue.C5546, ? super java.lang.Long, ? extends T> r8) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r5, r0)
            java.lang.String r0 = "lambda"
            Yue.C3329.m13906(r8, r0)
            Yue.ۥۡۧۨ r0 = r5.f2378
            if (r0 != 0) goto L1a
            r5 = -1
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 0
            java.lang.Object r5 = r8.invoke(r6, r5)
            return r5
        L1a:
            long r1 = r5.m4889()
            long r1 = r1 - r6
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 >= 0) goto L41
            long r1 = r5.m4889()
        L27:
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r5 <= 0) goto L38
            Yue.ۥۡۧۨ r0 = r0.f20496
            Yue.C3329.m13903(r0)
            int r5 = r0.f20492
            int r3 = r0.f20491
            int r5 = r5 - r3
            long r3 = (long) r5
            long r1 = r1 - r3
            goto L27
        L38:
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            java.lang.Object r5 = r8.invoke(r0, r5)
            return r5
        L41:
            r1 = 0
        L43:
            int r5 = r0.f20492
            int r3 = r0.f20491
            int r5 = r5 - r3
            long r3 = (long) r5
            long r3 = r3 + r1
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 > 0) goto L55
            Yue.ۥۡۧۨ r0 = r0.f20495
            Yue.C3329.m13903(r0)
            r1 = r3
            goto L43
        L55:
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            java.lang.Object r5 = r8.invoke(r0, r5)
            return r5
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final int m70(@Yue.InterfaceC4418 Yue.C0843 r17, @Yue.InterfaceC4418 Yue.C4650 r18, boolean r19) {
            r0 = r17
            java.lang.String r1 = "<this>"
            Yue.C3329.m13906(r0, r1)
            java.lang.String r1 = "options"
            r2 = r18
            Yue.C3329.m13906(r2, r1)
            Yue.ۥۡۧۨ r0 = r0.f2378
            r1 = -2
            r3 = -1
            if (r0 != 0) goto L19
            if (r19 == 0) goto L17
            goto L18
        L17:
            r1 = r3
        L18:
            return r1
        L19:
            byte[] r4 = r0.f20490
            int r5 = r0.f20491
            int r6 = r0.f20492
            int[] r2 = r18.m18480()
            r7 = 0
            r9 = r0
            r10 = r3
            r8 = r7
        L27:
            int r11 = r8 + 1
            r12 = r2[r8]
            int r8 = r8 + 2
            r11 = r2[r11]
            if (r11 == r3) goto L32
            r10 = r11
        L32:
            if (r9 != 0) goto L35
            goto L65
        L35:
            r11 = 0
            if (r12 >= 0) goto L7f
            int r12 = r12 * (-1)
            int r13 = r8 + r12
        L3c:
            int r12 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r8 + 1
            r8 = r2[r8]
            if (r5 == r8) goto L49
            return r10
        L49:
            if (r14 != r13) goto L4d
            r5 = 1
            goto L4e
        L4d:
            r5 = r7
        L4e:
            if (r12 != r6) goto L6f
            Yue.C3329.m13903(r9)
            Yue.ۥۡۧۨ r4 = r9.f20495
            Yue.C3329.m13903(r4)
            int r6 = r4.f20491
            byte[] r8 = r4.f20490
            int r9 = r4.f20492
            if (r4 != r0) goto L69
            if (r5 == 0) goto L65
            r4 = r8
            r8 = r11
            goto L72
        L65:
            if (r19 == 0) goto L68
            return r1
        L68:
            return r10
        L69:
            r16 = r8
            r8 = r4
            r4 = r16
            goto L72
        L6f:
            r8 = r9
            r9 = r6
            r6 = r12
        L72:
            if (r5 == 0) goto L7a
            r5 = r2[r14]
            r13 = r6
            r6 = r9
            r9 = r8
            goto La4
        L7a:
            r5 = r6
            r6 = r9
            r9 = r8
            r8 = r14
            goto L3c
        L7f:
            int r13 = r5 + 1
            r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r14 = r8 + r12
        L87:
            if (r8 != r14) goto L8a
            return r10
        L8a:
            r15 = r2[r8]
            if (r5 != r15) goto Lab
            int r8 = r8 + r12
            r5 = r2[r8]
            if (r13 != r6) goto La4
            Yue.ۥۡۧۨ r9 = r9.f20495
            Yue.C3329.m13903(r9)
            int r4 = r9.f20491
            byte[] r6 = r9.f20490
            int r8 = r9.f20492
            r13 = r4
            r4 = r6
            r6 = r8
            if (r9 != r0) goto La4
            r9 = r11
        La4:
            if (r5 < 0) goto La7
            return r5
        La7:
            int r8 = -r5
            r5 = r13
            goto L27
        Lab:
            int r8 = r8 + 1
            goto L87
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static /* synthetic */ int m71(Yue.C0843 r0, Yue.C4650 r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            int r0 = m70(r0, r1, r2)
            return r0
    }
}
