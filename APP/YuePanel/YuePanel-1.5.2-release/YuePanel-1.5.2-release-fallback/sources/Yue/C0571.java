package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0571 implements Yue.C0578.InterfaceC0579 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final boolean f1479 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f1480 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final boolean f1481 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static float f1482 = 0.001f;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int f1483;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.C0578 f1484;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Yue.C0892 f1485;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f1486;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Yue.C5834 f1487;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int[] f1488;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int[] f1489;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public float[] f1490;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f1491;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int f1492;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean f1493;

    static {
            return
    }

    public C0571(Yue.C0578 r4, Yue.C0892 r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f1483 = r0
            r1 = 8
            r3.f1486 = r1
            r2 = 0
            r3.f1487 = r2
            int[] r2 = new int[r1]
            r3.f1488 = r2
            int[] r2 = new int[r1]
            r3.f1489 = r2
            float[] r1 = new float[r1]
            r3.f1490 = r1
            r1 = -1
            r3.f1491 = r1
            r3.f1492 = r1
            r3.f1493 = r0
            r3.f1484 = r4
            r3.f1485 = r5
            return
    }

    @Override // Yue.C0578.InterfaceC0579
    public final void clear() {
            r5 = this;
            int r0 = r5.f1491
            r1 = 0
            r2 = r1
        L4:
            r3 = -1
            if (r0 == r3) goto L23
            int r4 = r5.f1483
            if (r2 >= r4) goto L23
            Yue.ۥۣ۟ۥۨ r3 = r5.f1485
            Yue.ۥۣۣۢ۟[] r3 = r3.f2604
            int[] r4 = r5.f1488
            r4 = r4[r0]
            r3 = r3[r4]
            if (r3 == 0) goto L1c
            Yue.ۥ۟ۡۨۥ r4 = r5.f1484
            r3.m21688(r4)
        L1c:
            int[] r3 = r5.f1489
            r0 = r3[r0]
            int r2 = r2 + 1
            goto L4
        L23:
            r5.f1491 = r3
            r5.f1492 = r3
            r5.f1493 = r1
            r5.f1483 = r1
            return
    }

    @Override // Yue.C0578.InterfaceC0579
    public int getCurrentSize() {
            r1 = this;
            int r0 = r1.f1483
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.f1491
            java.lang.String r1 = ""
            r2 = 0
        L5:
            r3 = -1
            if (r0 == r3) goto L55
            int r3 = r5.f1483
            if (r2 >= r3) goto L55
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = " -> "
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            float[] r1 = r5.f1490
            r1 = r1[r0]
            r3.append(r1)
            java.lang.String r1 = " : "
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            Yue.ۥۣ۟ۥۨ r1 = r5.f1485
            Yue.ۥۣۣۢ۟[] r1 = r1.f2604
            int[] r4 = r5.f1488
            r4 = r4[r0]
            r1 = r1[r4]
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            int[] r3 = r5.f1489
            r0 = r3[r0]
            int r2 = r2 + 1
            goto L5
        L55:
            return r1
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public float mo2018(Yue.C0578 r6, boolean r7) {
            r5 = this;
            Yue.ۥۣۣۢ۟ r0 = r6.f1504
            float r0 = r5.mo2025(r0)
            Yue.ۥۣۣۢ۟ r1 = r6.f1504
            r5.mo2020(r1, r7)
            Yue.ۥ۟ۡۨۥ$ۥ r6 = r6.f1508
            int r1 = r6.getCurrentSize()
            r2 = 0
        L12:
            if (r2 >= r1) goto L23
            Yue.ۥۣۣۢ۟ r3 = r6.mo2022(r2)
            float r4 = r6.mo2025(r3)
            float r4 = r4 * r0
            r5.mo2027(r3, r4, r7)
            int r2 = r2 + 1
            goto L12
        L23:
            return r0
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void mo2019() {
            r5 = this;
            int r0 = r5.f1483
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "{ "
            r1.print(r2)
            r1 = 0
        La:
            if (r1 >= r0) goto L38
            Yue.ۥۣۣۢ۟ r2 = r5.mo2022(r1)
            if (r2 != 0) goto L13
            goto L35
        L13:
            java.io.PrintStream r3 = java.lang.System.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = " = "
            r4.append(r2)
            float r2 = r5.mo2024(r1)
            r4.append(r2)
            java.lang.String r2 = " "
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.print(r2)
        L35:
            int r1 = r1 + 1
            goto La
        L38:
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = " }"
            r0.println(r1)
            return
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final float mo2020(Yue.C5834 r9, boolean r10) {
            r8 = this;
            Yue.ۥۣۣۢ۟ r0 = r8.f1487
            if (r0 != r9) goto L7
            r0 = 0
            r8.f1487 = r0
        L7:
            int r0 = r8.f1491
            r1 = 0
            r2 = -1
            if (r0 != r2) goto Le
            return r1
        Le:
            r3 = 0
            r4 = r2
        L10:
            if (r0 == r2) goto L5b
            int r5 = r8.f1483
            if (r3 >= r5) goto L5b
            int[] r5 = r8.f1488
            r5 = r5[r0]
            int r6 = r9.f21370
            if (r5 != r6) goto L51
            int r1 = r8.f1491
            if (r0 != r1) goto L29
            int[] r1 = r8.f1489
            r1 = r1[r0]
            r8.f1491 = r1
            goto L2f
        L29:
            int[] r1 = r8.f1489
            r3 = r1[r0]
            r1[r4] = r3
        L2f:
            if (r10 == 0) goto L36
            Yue.ۥ۟ۡۨۥ r10 = r8.f1484
            r9.m21688(r10)
        L36:
            int r10 = r9.f21380
            int r10 = r10 + (-1)
            r9.f21380 = r10
            int r9 = r8.f1483
            int r9 = r9 + (-1)
            r8.f1483 = r9
            int[] r9 = r8.f1488
            r9[r0] = r2
            boolean r9 = r8.f1493
            if (r9 == 0) goto L4c
            r8.f1492 = r0
        L4c:
            float[] r9 = r8.f1490
            r9 = r9[r0]
            return r9
        L51:
            int[] r4 = r8.f1489
            r4 = r4[r0]
            int r3 = r3 + 1
            r7 = r4
            r4 = r0
            r0 = r7
            goto L10
        L5b:
            return r1
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void mo2021(Yue.C5834 r9, float r10) {
            r8 = this;
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r1 = 1
            if (r0 != 0) goto La
            r8.mo2020(r9, r1)
            return
        La:
            int r0 = r8.f1491
            r2 = 0
            r3 = -1
            if (r0 != r3) goto L44
            r8.f1491 = r2
            float[] r0 = r8.f1490
            r0[r2] = r10
            int[] r10 = r8.f1488
            int r0 = r9.f21370
            r10[r2] = r0
            int[] r10 = r8.f1489
            r10[r2] = r3
            int r10 = r9.f21380
            int r10 = r10 + r1
            r9.f21380 = r10
            Yue.ۥ۟ۡۨۥ r10 = r8.f1484
            r9.m21685(r10)
            int r9 = r8.f1483
            int r9 = r9 + r1
            r8.f1483 = r9
            boolean r9 = r8.f1493
            if (r9 != 0) goto L43
            int r9 = r8.f1492
            int r9 = r9 + r1
            r8.f1492 = r9
            int[] r10 = r8.f1488
            int r0 = r10.length
            if (r9 < r0) goto L43
            r8.f1493 = r1
            int r9 = r10.length
            int r9 = r9 - r1
            r8.f1492 = r9
        L43:
            return
        L44:
            r4 = r2
            r5 = r3
        L46:
            if (r0 == r3) goto L63
            int r6 = r8.f1483
            if (r4 >= r6) goto L63
            int[] r6 = r8.f1488
            r6 = r6[r0]
            int r7 = r9.f21370
            if (r6 != r7) goto L59
            float[] r9 = r8.f1490
            r9[r0] = r10
            return
        L59:
            if (r6 >= r7) goto L5c
            r5 = r0
        L5c:
            int[] r6 = r8.f1489
            r0 = r6[r0]
            int r4 = r4 + 1
            goto L46
        L63:
            int r0 = r8.f1492
            int r4 = r0 + 1
            boolean r6 = r8.f1493
            if (r6 == 0) goto L74
            int[] r4 = r8.f1488
            r6 = r4[r0]
            if (r6 != r3) goto L72
            goto L75
        L72:
            int r0 = r4.length
            goto L75
        L74:
            r0 = r4
        L75:
            int[] r4 = r8.f1488
            int r6 = r4.length
            if (r0 < r6) goto L8e
            int r6 = r8.f1483
            int r4 = r4.length
            if (r6 >= r4) goto L8e
            r4 = r2
        L80:
            int[] r6 = r8.f1488
            int r7 = r6.length
            if (r4 >= r7) goto L8e
            r6 = r6[r4]
            if (r6 != r3) goto L8b
            r0 = r4
            goto L8e
        L8b:
            int r4 = r4 + 1
            goto L80
        L8e:
            int[] r4 = r8.f1488
            int r6 = r4.length
            if (r0 < r6) goto Lbc
            int r0 = r4.length
            int r4 = r8.f1486
            int r4 = r4 * 2
            r8.f1486 = r4
            r8.f1493 = r2
            int r2 = r0 + (-1)
            r8.f1492 = r2
            float[] r2 = r8.f1490
            float[] r2 = java.util.Arrays.copyOf(r2, r4)
            r8.f1490 = r2
            int[] r2 = r8.f1488
            int r4 = r8.f1486
            int[] r2 = java.util.Arrays.copyOf(r2, r4)
            r8.f1488 = r2
            int[] r2 = r8.f1489
            int r4 = r8.f1486
            int[] r2 = java.util.Arrays.copyOf(r2, r4)
            r8.f1489 = r2
        Lbc:
            int[] r2 = r8.f1488
            int r4 = r9.f21370
            r2[r0] = r4
            float[] r2 = r8.f1490
            r2[r0] = r10
            if (r5 == r3) goto Ld1
            int[] r10 = r8.f1489
            r2 = r10[r5]
            r10[r0] = r2
            r10[r5] = r0
            goto Ld9
        Ld1:
            int[] r10 = r8.f1489
            int r2 = r8.f1491
            r10[r0] = r2
            r8.f1491 = r0
        Ld9:
            int r10 = r9.f21380
            int r10 = r10 + r1
            r9.f21380 = r10
            Yue.ۥ۟ۡۨۥ r10 = r8.f1484
            r9.m21685(r10)
            int r9 = r8.f1483
            int r9 = r9 + r1
            r8.f1483 = r9
            boolean r10 = r8.f1493
            if (r10 != 0) goto Lf1
            int r10 = r8.f1492
            int r10 = r10 + r1
            r8.f1492 = r10
        Lf1:
            int[] r10 = r8.f1488
            int r0 = r10.length
            if (r9 < r0) goto Lf8
            r8.f1493 = r1
        Lf8:
            int r9 = r8.f1492
            int r0 = r10.length
            if (r9 < r0) goto L103
            r8.f1493 = r1
            int r9 = r10.length
            int r9 = r9 - r1
            r8.f1492 = r9
        L103:
            return
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Yue.C5834 mo2022(int r4) {
            r3 = this;
            int r0 = r3.f1491
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L1e
            int r2 = r3.f1483
            if (r1 >= r2) goto L1e
            if (r1 != r4) goto L17
            Yue.ۥۣ۟ۥۨ r4 = r3.f1485
            Yue.ۥۣۣۢ۟[] r4 = r4.f2604
            int[] r1 = r3.f1488
            r0 = r1[r0]
            r4 = r4[r0]
            return r4
        L17:
            int[] r2 = r3.f1489
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L1e:
            r4 = 0
            return r4
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo2023() {
            r5 = this;
            int r0 = r5.f1491
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L1a
            int r2 = r5.f1483
            if (r1 >= r2) goto L1a
            float[] r2 = r5.f1490
            r3 = r2[r0]
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r3 * r4
            r2[r0] = r3
            int[] r2 = r5.f1489
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L1a:
            return
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float mo2024(int r4) {
            r3 = this;
            int r0 = r3.f1491
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L18
            int r2 = r3.f1483
            if (r1 >= r2) goto L18
            if (r1 != r4) goto L11
            float[] r4 = r3.f1490
            r4 = r4[r0]
            return r4
        L11:
            int[] r2 = r3.f1489
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L18:
            r4 = 0
            return r4
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final float mo2025(Yue.C5834 r5) {
            r4 = this;
            int r0 = r4.f1491
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L1e
            int r2 = r4.f1483
            if (r1 >= r2) goto L1e
            int[] r2 = r4.f1488
            r2 = r2[r0]
            int r3 = r5.f21370
            if (r2 != r3) goto L17
            float[] r5 = r4.f1490
            r5 = r5[r0]
            return r5
        L17:
            int[] r2 = r4.f1489
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L1e:
            r5 = 0
            return r5
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean mo2026(Yue.C5834 r7) {
            r6 = this;
            int r0 = r6.f1491
            r1 = 0
            r2 = -1
            if (r0 != r2) goto L7
            return r1
        L7:
            r3 = r1
        L8:
            if (r0 == r2) goto L1f
            int r4 = r6.f1483
            if (r3 >= r4) goto L1f
            int[] r4 = r6.f1488
            r4 = r4[r0]
            int r5 = r7.f21370
            if (r4 != r5) goto L18
            r7 = 1
            return r7
        L18:
            int[] r4 = r6.f1489
            r0 = r4[r0]
            int r3 = r3 + 1
            goto L8
        L1f:
            return r1
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void mo2027(Yue.C5834 r9, float r10, boolean r11) {
            r8 = this;
            float r0 = Yue.C0571.f1482
            float r1 = -r0
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 <= 0) goto Lc
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lc
            return
        Lc:
            int r0 = r8.f1491
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 != r2) goto L47
            r8.f1491 = r1
            float[] r11 = r8.f1490
            r11[r1] = r10
            int[] r10 = r8.f1488
            int r11 = r9.f21370
            r10[r1] = r11
            int[] r10 = r8.f1489
            r10[r1] = r2
            int r10 = r9.f21380
            int r10 = r10 + r3
            r9.f21380 = r10
            Yue.ۥ۟ۡۨۥ r10 = r8.f1484
            r9.m21685(r10)
            int r9 = r8.f1483
            int r9 = r9 + r3
            r8.f1483 = r9
            boolean r9 = r8.f1493
            if (r9 != 0) goto L46
            int r9 = r8.f1492
            int r9 = r9 + r3
            r8.f1492 = r9
            int[] r10 = r8.f1488
            int r11 = r10.length
            if (r9 < r11) goto L46
            r8.f1493 = r3
            int r9 = r10.length
            int r9 = r9 - r3
            r8.f1492 = r9
        L46:
            return
        L47:
            r4 = r1
            r5 = r2
        L49:
            if (r0 == r2) goto La2
            int r6 = r8.f1483
            if (r4 >= r6) goto La2
            int[] r6 = r8.f1488
            r6 = r6[r0]
            int r7 = r9.f21370
            if (r6 != r7) goto L98
            float[] r1 = r8.f1490
            r2 = r1[r0]
            float r2 = r2 + r10
            float r10 = Yue.C0571.f1482
            float r4 = -r10
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r6 = 0
            if (r4 <= 0) goto L69
            int r10 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r10 >= 0) goto L69
            r2 = r6
        L69:
            r1[r0] = r2
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 != 0) goto L97
            int r10 = r8.f1491
            if (r0 != r10) goto L7a
            int[] r10 = r8.f1489
            r10 = r10[r0]
            r8.f1491 = r10
            goto L80
        L7a:
            int[] r10 = r8.f1489
            r1 = r10[r0]
            r10[r5] = r1
        L80:
            if (r11 == 0) goto L87
            Yue.ۥ۟ۡۨۥ r10 = r8.f1484
            r9.m21688(r10)
        L87:
            boolean r10 = r8.f1493
            if (r10 == 0) goto L8d
            r8.f1492 = r0
        L8d:
            int r10 = r9.f21380
            int r10 = r10 - r3
            r9.f21380 = r10
            int r9 = r8.f1483
            int r9 = r9 - r3
            r8.f1483 = r9
        L97:
            return
        L98:
            if (r6 >= r7) goto L9b
            r5 = r0
        L9b:
            int[] r6 = r8.f1489
            r0 = r6[r0]
            int r4 = r4 + 1
            goto L49
        La2:
            int r11 = r8.f1492
            int r0 = r11 + 1
            boolean r4 = r8.f1493
            if (r4 == 0) goto Lb3
            int[] r0 = r8.f1488
            r4 = r0[r11]
            if (r4 != r2) goto Lb1
            goto Lb4
        Lb1:
            int r11 = r0.length
            goto Lb4
        Lb3:
            r11 = r0
        Lb4:
            int[] r0 = r8.f1488
            int r4 = r0.length
            if (r11 < r4) goto Lcd
            int r4 = r8.f1483
            int r0 = r0.length
            if (r4 >= r0) goto Lcd
            r0 = r1
        Lbf:
            int[] r4 = r8.f1488
            int r6 = r4.length
            if (r0 >= r6) goto Lcd
            r4 = r4[r0]
            if (r4 != r2) goto Lca
            r11 = r0
            goto Lcd
        Lca:
            int r0 = r0 + 1
            goto Lbf
        Lcd:
            int[] r0 = r8.f1488
            int r4 = r0.length
            if (r11 < r4) goto Lfb
            int r11 = r0.length
            int r0 = r8.f1486
            int r0 = r0 * 2
            r8.f1486 = r0
            r8.f1493 = r1
            int r1 = r11 + (-1)
            r8.f1492 = r1
            float[] r1 = r8.f1490
            float[] r0 = java.util.Arrays.copyOf(r1, r0)
            r8.f1490 = r0
            int[] r0 = r8.f1488
            int r1 = r8.f1486
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r8.f1488 = r0
            int[] r0 = r8.f1489
            int r1 = r8.f1486
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            r8.f1489 = r0
        Lfb:
            int[] r0 = r8.f1488
            int r1 = r9.f21370
            r0[r11] = r1
            float[] r0 = r8.f1490
            r0[r11] = r10
            if (r5 == r2) goto L110
            int[] r10 = r8.f1489
            r0 = r10[r5]
            r10[r11] = r0
            r10[r5] = r11
            goto L118
        L110:
            int[] r10 = r8.f1489
            int r0 = r8.f1491
            r10[r11] = r0
            r8.f1491 = r11
        L118:
            int r10 = r9.f21380
            int r10 = r10 + r3
            r9.f21380 = r10
            Yue.ۥ۟ۡۨۥ r10 = r8.f1484
            r9.m21685(r10)
            int r9 = r8.f1483
            int r9 = r9 + r3
            r8.f1483 = r9
            boolean r9 = r8.f1493
            if (r9 != 0) goto L130
            int r9 = r8.f1492
            int r9 = r9 + r3
            r8.f1492 = r9
        L130:
            int r9 = r8.f1492
            int[] r10 = r8.f1488
            int r11 = r10.length
            if (r9 < r11) goto L13d
            r8.f1493 = r3
            int r9 = r10.length
            int r9 = r9 - r3
            r8.f1492 = r9
        L13d:
            return
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int mo2028(Yue.C5834 r6) {
            r5 = this;
            int r0 = r5.f1491
            r1 = -1
            if (r0 != r1) goto L6
            return r1
        L6:
            r2 = 0
        L7:
            if (r0 == r1) goto L1d
            int r3 = r5.f1483
            if (r2 >= r3) goto L1d
            int[] r3 = r5.f1488
            r3 = r3[r0]
            int r4 = r6.f21370
            if (r3 != r4) goto L16
            return r0
        L16:
            int[] r3 = r5.f1489
            r0 = r3[r0]
            int r2 = r2 + 1
            goto L7
        L1d:
            return r1
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int mo2029() {
            r1 = this;
            int[] r0 = r1.f1488
            int r0 = r0.length
            int r0 = r0 * 12
            int r0 = r0 + 36
            return r0
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void mo2030(float r5) {
            r4 = this;
            int r0 = r4.f1491
            r1 = 0
        L3:
            r2 = -1
            if (r0 == r2) goto L18
            int r2 = r4.f1483
            if (r1 >= r2) goto L18
            float[] r2 = r4.f1490
            r3 = r2[r0]
            float r3 = r3 / r5
            r2[r0] = r3
            int[] r2 = r4.f1489
            r0 = r2[r0]
            int r1 = r1 + 1
            goto L3
        L18:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int m2031() {
            r1 = this;
            int r0 = r1.f1491
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final int m2032(int r2) {
            r1 = this;
            int[] r0 = r1.f1488
            r2 = r0[r2]
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final int m2033(int r2) {
            r1 = this;
            int[] r0 = r1.f1489
            r2 = r0[r2]
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public Yue.C5834 m2034() {
            r6 = this;
            Yue.ۥۣۣۢ۟ r0 = r6.f1487
            if (r0 != 0) goto L33
            int r0 = r6.f1491
            r1 = 0
            r2 = 0
        L8:
            r3 = -1
            if (r0 == r3) goto L32
            int r3 = r6.f1483
            if (r1 >= r3) goto L32
            float[] r3 = r6.f1490
            r3 = r3[r0]
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L2b
            Yue.ۥۣ۟ۥۨ r3 = r6.f1485
            Yue.ۥۣۣۢ۟[] r3 = r3.f2604
            int[] r4 = r6.f1488
            r4 = r4[r0]
            r3 = r3[r4]
            if (r2 == 0) goto L2a
            int r4 = r2.f21372
            int r5 = r3.f21372
            if (r4 >= r5) goto L2b
        L2a:
            r2 = r3
        L2b:
            int[] r3 = r6.f1489
            r0 = r3[r0]
            int r1 = r1 + 1
            goto L8
        L32:
            return r2
        L33:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final float m2035(int r2) {
            r1 = this;
            float[] r0 = r1.f1490
            r2 = r0[r2]
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public boolean m2036() {
            r5 = this;
            int r0 = r5.f1491
            r1 = 0
            r2 = r1
        L4:
            r3 = -1
            if (r0 == r3) goto L1d
            int r3 = r5.f1483
            if (r2 >= r3) goto L1d
            float[] r3 = r5.f1490
            r3 = r3[r0]
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L16
            r0 = 1
            return r0
        L16:
            int[] r3 = r5.f1489
            r0 = r3[r0]
            int r2 = r2 + 1
            goto L4
        L1d:
            return r1
    }
}
