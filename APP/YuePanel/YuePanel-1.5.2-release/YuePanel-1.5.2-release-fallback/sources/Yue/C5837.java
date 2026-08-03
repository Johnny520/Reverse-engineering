package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢ۟ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5837 implements Yue.C0578.InterfaceC0579 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final boolean f21392 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final boolean f21393 = true;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static float f21394 = 0.001f;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int f21395;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f21396;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f21397;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int[] f21398;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int[] f21399;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int[] f21400;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public float[] f21401;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int[] f21402;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int[] f21403;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int f21404;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public int f21405;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final Yue.C0578 f21406;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final Yue.C0892 f21407;

    static {
            return
    }

    public C5837(Yue.C0578 r4, Yue.C0892 r5) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.f21395 = r0
            r1 = 16
            r3.f21396 = r1
            r3.f21397 = r1
            int[] r2 = new int[r1]
            r3.f21398 = r2
            int[] r2 = new int[r1]
            r3.f21399 = r2
            int[] r2 = new int[r1]
            r3.f21400 = r2
            float[] r2 = new float[r1]
            r3.f21401 = r2
            int[] r2 = new int[r1]
            r3.f21402 = r2
            int[] r1 = new int[r1]
            r3.f21403 = r1
            r1 = 0
            r3.f21404 = r1
            r3.f21405 = r0
            r3.f21406 = r4
            r3.f21407 = r5
            r3.clear()
            return
    }

    @Override // Yue.C0578.InterfaceC0579
    public void clear() {
            r5 = this;
            int r0 = r5.f21404
            r1 = 0
            r2 = r1
        L4:
            if (r2 >= r0) goto L14
            Yue.ۥۣۣۢ۟ r3 = r5.mo2022(r2)
            if (r3 == 0) goto L11
            Yue.ۥ۟ۡۨۥ r4 = r5.f21406
            r3.m21688(r4)
        L11:
            int r2 = r2 + 1
            goto L4
        L14:
            r0 = r1
        L15:
            int r2 = r5.f21396
            r3 = -1
            if (r0 >= r2) goto L25
            int[] r2 = r5.f21400
            r2[r0] = r3
            int[] r2 = r5.f21399
            r2[r0] = r3
            int r0 = r0 + 1
            goto L15
        L25:
            r0 = r1
        L26:
            int r2 = r5.f21397
            if (r0 >= r2) goto L31
            int[] r2 = r5.f21398
            r2[r0] = r3
            int r0 = r0 + 1
            goto L26
        L31:
            r5.f21404 = r1
            r5.f21405 = r3
            return
    }

    @Override // Yue.C0578.InterfaceC0579
    public int getCurrentSize() {
            r1 = this;
            int r0 = r1.f21404
            return r0
    }

    public java.lang.String toString() {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r9.hashCode()
            r0.append(r1)
            java.lang.String r1 = " { "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r1 = r9.f21404
            r2 = 0
        L18:
            if (r2 >= r1) goto Le6
            Yue.ۥۣۣۢ۟ r3 = r9.mo2022(r2)
            if (r3 != 0) goto L22
            goto Le2
        L22:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = " = "
            r4.append(r0)
            float r0 = r9.mo2024(r2)
            r4.append(r0)
            java.lang.String r0 = " "
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            int r3 = r9.mo2028(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = "[p: "
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            int[] r4 = r9.f21402
            r4 = r4[r3]
            java.lang.String r5 = "none"
            r6 = -1
            if (r4 == r6) goto L7e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            Yue.ۥۣ۟ۥۨ r0 = r9.f21407
            Yue.ۥۣۣۢ۟[] r0 = r0.f2604
            int[] r7 = r9.f21400
            int[] r8 = r9.f21402
            r8 = r8[r3]
            r7 = r7[r8]
            r0 = r0[r7]
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            goto L8d
        L7e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r5)
            java.lang.String r0 = r4.toString()
        L8d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = ", n: "
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            int[] r4 = r9.f21403
            r4 = r4[r3]
            if (r4 == r6) goto Lc2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            Yue.ۥۣ۟ۥۨ r0 = r9.f21407
            Yue.ۥۣۣۢ۟[] r0 = r0.f2604
            int[] r5 = r9.f21400
            int[] r6 = r9.f21403
            r3 = r6[r3]
            r3 = r5[r3]
            r0 = r0[r3]
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            goto Ld1
        Lc2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = r3.toString()
        Ld1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "]"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        Le2:
            int r2 = r2 + 1
            goto L18
        Le6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " }"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥ */
    public float mo2018(Yue.C0578 r8, boolean r9) {
            r7 = this;
            Yue.ۥۣۣۢ۟ r0 = r8.f1504
            float r0 = r7.mo2025(r0)
            Yue.ۥۣۣۢ۟ r1 = r8.f1504
            r7.mo2020(r1, r9)
            Yue.ۥ۟ۡۨۥ$ۥ r8 = r8.f1508
            Yue.ۥۣۢ۟ۤ r8 = (Yue.C5837) r8
            int r1 = r8.getCurrentSize()
            r2 = 0
            r3 = r2
        L15:
            if (r2 >= r1) goto L31
            int[] r4 = r8.f21400
            r4 = r4[r3]
            r5 = -1
            if (r4 == r5) goto L2e
            float[] r5 = r8.f21401
            r5 = r5[r3]
            Yue.ۥۣ۟ۥۨ r6 = r7.f21407
            Yue.ۥۣۣۢ۟[] r6 = r6.f2604
            r4 = r6[r4]
            float r5 = r5 * r0
            r7.mo2027(r4, r5, r9)
            int r2 = r2 + 1
        L2e:
            int r3 = r3 + 1
            goto L15
        L31:
            return r0
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo2019() {
            r5 = this;
            int r0 = r5.f21404
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
    /* JADX INFO: renamed from: ۥ۟۟ */
    public float mo2020(Yue.C5834 r8, boolean r9) {
            r7 = this;
            int r0 = r7.mo2028(r8)
            r1 = -1
            if (r0 != r1) goto L9
            r8 = 0
            return r8
        L9:
            r7.m21702(r8)
            float[] r2 = r7.f21401
            r2 = r2[r0]
            int r3 = r7.f21405
            if (r3 != r0) goto L1a
            int[] r3 = r7.f21403
            r3 = r3[r0]
            r7.f21405 = r3
        L1a:
            int[] r3 = r7.f21400
            r3[r0] = r1
            int[] r3 = r7.f21402
            r4 = r3[r0]
            if (r4 == r1) goto L2a
            int[] r5 = r7.f21403
            r6 = r5[r0]
            r5[r4] = r6
        L2a:
            int[] r4 = r7.f21403
            r4 = r4[r0]
            if (r4 == r1) goto L34
            r0 = r3[r0]
            r3[r4] = r0
        L34:
            int r0 = r7.f21404
            int r0 = r0 + (-1)
            r7.f21404 = r0
            int r0 = r8.f21380
            int r0 = r0 + (-1)
            r8.f21380 = r0
            if (r9 == 0) goto L47
            Yue.ۥ۟ۡۨۥ r9 = r7.f21406
            r8.m21688(r9)
        L47:
            return r2
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo2021(Yue.C5834 r8, float r9) {
            r7 = this;
            float r0 = Yue.C5837.f21394
            float r1 = -r0
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r2 = 1
            if (r1 <= 0) goto L10
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 >= 0) goto L10
            r7.mo2020(r8, r2)
            return
        L10:
            int r0 = r7.f21404
            r1 = 0
            if (r0 != 0) goto L1e
            r7.m21697(r1, r8, r9)
            r7.m21696(r8, r1)
            r7.f21405 = r1
            goto L58
        L1e:
            int r0 = r7.mo2028(r8)
            r3 = -1
            if (r0 == r3) goto L2a
            float[] r8 = r7.f21401
            r8[r0] = r9
            goto L58
        L2a:
            int r0 = r7.f21404
            int r0 = r0 + r2
            int r2 = r7.f21396
            if (r0 < r2) goto L34
            r7.m21700()
        L34:
            int r0 = r7.f21404
            int r2 = r7.f21405
            r4 = r3
        L39:
            if (r1 >= r0) goto L55
            int[] r5 = r7.f21400
            r5 = r5[r2]
            int r6 = r8.f21370
            if (r5 != r6) goto L48
            float[] r8 = r7.f21401
            r8[r2] = r9
            return
        L48:
            if (r5 >= r6) goto L4b
            r4 = r2
        L4b:
            int[] r5 = r7.f21403
            r2 = r5[r2]
            if (r2 != r3) goto L52
            goto L55
        L52:
            int r1 = r1 + 1
            goto L39
        L55:
            r7.m21701(r4, r8, r9)
        L58:
            return
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public Yue.C5834 mo2022(int r7) {
            r6 = this;
            int r0 = r6.f21404
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r2 = r6.f21405
            r3 = 0
        L9:
            if (r3 >= r0) goto L25
            r4 = -1
            if (r3 != r7) goto L1b
            if (r2 == r4) goto L1b
            Yue.ۥۣ۟ۥۨ r7 = r6.f21407
            Yue.ۥۣۣۢ۟[] r7 = r7.f2604
            int[] r0 = r6.f21400
            r0 = r0[r2]
            r7 = r7[r0]
            return r7
        L1b:
            int[] r5 = r6.f21403
            r2 = r5[r2]
            if (r2 != r4) goto L22
            goto L25
        L22:
            int r3 = r3 + 1
            goto L9
        L25:
            return r1
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo2023() {
            r6 = this;
            int r0 = r6.f21404
            int r1 = r6.f21405
            r2 = 0
        L5:
            if (r2 >= r0) goto L1b
            float[] r3 = r6.f21401
            r4 = r3[r1]
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r4 * r5
            r3[r1] = r4
            int[] r3 = r6.f21403
            r1 = r3[r1]
            r3 = -1
            if (r1 != r3) goto L18
            goto L1b
        L18:
            int r2 = r2 + 1
            goto L5
        L1b:
            return
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public float mo2024(int r5) {
            r4 = this;
            int r0 = r4.f21404
            int r1 = r4.f21405
            r2 = 0
        L5:
            if (r2 >= r0) goto L19
            if (r2 != r5) goto Le
            float[] r5 = r4.f21401
            r5 = r5[r1]
            return r5
        Le:
            int[] r3 = r4.f21403
            r1 = r3[r1]
            r3 = -1
            if (r1 != r3) goto L16
            goto L19
        L16:
            int r2 = r2 + 1
            goto L5
        L19:
            r5 = 0
            return r5
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public float mo2025(Yue.C5834 r2) {
            r1 = this;
            int r2 = r1.mo2028(r2)
            r0 = -1
            if (r2 == r0) goto Lc
            float[] r0 = r1.f21401
            r2 = r0[r2]
            return r2
        Lc:
            r2 = 0
            return r2
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public boolean mo2026(Yue.C5834 r2) {
            r1 = this;
            int r2 = r1.mo2028(r2)
            r0 = -1
            if (r2 == r0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            return r2
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo2027(Yue.C5834 r5, float r6, boolean r7) {
            r4 = this;
            float r0 = Yue.C5837.f21394
            float r1 = -r0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto Lc
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lc
            return
        Lc:
            int r0 = r4.mo2028(r5)
            r1 = -1
            if (r0 != r1) goto L17
            r4.mo2021(r5, r6)
            goto L2f
        L17:
            float[] r1 = r4.f21401
            r2 = r1[r0]
            float r2 = r2 + r6
            r1[r0] = r2
            float r6 = Yue.C5837.f21394
            float r3 = -r6
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2f
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 >= 0) goto L2f
            r6 = 0
            r1[r0] = r6
            r4.mo2020(r5, r7)
        L2f:
            return
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public int mo2028(Yue.C5834 r4) {
            r3 = this;
            int r0 = r3.f21404
            r1 = -1
            if (r0 == 0) goto L33
            if (r4 != 0) goto L8
            goto L33
        L8:
            int r4 = r4.f21370
            int r0 = r3.f21397
            int r0 = r4 % r0
            int[] r2 = r3.f21398
            r0 = r2[r0]
            if (r0 != r1) goto L15
            return r1
        L15:
            int[] r2 = r3.f21400
            r2 = r2[r0]
            if (r2 != r4) goto L1c
            return r0
        L1c:
            int[] r2 = r3.f21399
            r0 = r2[r0]
            if (r0 == r1) goto L29
            int[] r2 = r3.f21400
            r2 = r2[r0]
            if (r2 == r4) goto L29
            goto L1c
        L29:
            if (r0 != r1) goto L2c
            return r1
        L2c:
            int[] r2 = r3.f21400
            r2 = r2[r0]
            if (r2 != r4) goto L33
            return r0
        L33:
            return r1
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public int mo2029() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.C0578.InterfaceC0579
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public void mo2030(float r6) {
            r5 = this;
            int r0 = r5.f21404
            int r1 = r5.f21405
            r2 = 0
        L5:
            if (r2 >= r0) goto L19
            float[] r3 = r5.f21401
            r4 = r3[r1]
            float r4 = r4 / r6
            r3[r1] = r4
            int[] r3 = r5.f21403
            r1 = r3[r1]
            r3 = -1
            if (r1 != r3) goto L16
            goto L19
        L16:
            int r2 = r2 + 1
            goto L5
        L19:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m21696(Yue.C5834 r4, int r5) {
            r3 = this;
            int r4 = r4.f21370
            int r0 = r3.f21397
            int r4 = r4 % r0
            int[] r0 = r3.f21398
            r1 = r0[r4]
            r2 = -1
            if (r1 != r2) goto Lf
            r0[r4] = r5
            goto L19
        Lf:
            int[] r4 = r3.f21399
            r0 = r4[r1]
            if (r0 == r2) goto L17
            r1 = r0
            goto Lf
        L17:
            r4[r1] = r5
        L19:
            int[] r4 = r3.f21399
            r4[r5] = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m21697(int r3, Yue.C5834 r4, float r5) {
            r2 = this;
            int[] r0 = r2.f21400
            int r1 = r4.f21370
            r0[r3] = r1
            float[] r0 = r2.f21401
            r0[r3] = r5
            int[] r5 = r2.f21402
            r0 = -1
            r5[r3] = r0
            int[] r5 = r2.f21403
            r5[r3] = r0
            Yue.ۥ۟ۡۨۥ r3 = r2.f21406
            r4.m21685(r3)
            int r3 = r4.f21380
            int r3 = r3 + 1
            r4.f21380 = r3
            int r3 = r2.f21404
            int r3 = r3 + 1
            r2.f21404 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m21698() {
            r7 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r7.f21397
            if (r1 >= r2) goto L5b
            int[] r2 = r7.f21398
            r2 = r2[r1]
            r3 = -1
            if (r2 == r3) goto L58
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r4 = r7.hashCode()
            r2.append(r4)
            java.lang.String r4 = " hash ["
            r2.append(r4)
            r2.append(r1)
            java.lang.String r4 = "] => "
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            int[] r4 = r7.f21398
            r4 = r4[r1]
            r5 = r0
        L2f:
            if (r5 != 0) goto L53
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r2)
            java.lang.String r2 = " "
            r6.append(r2)
            int[] r2 = r7.f21400
            r2 = r2[r4]
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            int[] r6 = r7.f21399
            r6 = r6[r4]
            if (r6 == r3) goto L51
            r4 = r6
            goto L2f
        L51:
            r5 = 1
            goto L2f
        L53:
            java.io.PrintStream r3 = java.lang.System.out
            r3.println(r2)
        L58:
            int r1 = r1 + 1
            goto L2
        L5b:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final int m21699() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.f21396
            r2 = -1
            if (r0 >= r1) goto L10
            int[] r1 = r3.f21400
            r1 = r1[r0]
            if (r1 != r2) goto Ld
            return r0
        Ld:
            int r0 = r0 + 1
            goto L1
        L10:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m21700() {
            r4 = this;
            int r0 = r4.f21396
            int r0 = r0 * 2
            int[] r1 = r4.f21400
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r4.f21400 = r1
            float[] r1 = r4.f21401
            float[] r1 = java.util.Arrays.copyOf(r1, r0)
            r4.f21401 = r1
            int[] r1 = r4.f21402
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r4.f21402 = r1
            int[] r1 = r4.f21403
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r4.f21403 = r1
            int[] r1 = r4.f21399
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r4.f21399 = r1
            int r1 = r4.f21396
        L2e:
            if (r1 >= r0) goto L3c
            int[] r2 = r4.f21400
            r3 = -1
            r2[r1] = r3
            int[] r2 = r4.f21399
            r2[r1] = r3
            int r1 = r1 + 1
            goto L2e
        L3c:
            r4.f21396 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m21701(int r4, Yue.C5834 r5, float r6) {
            r3 = this;
            int r0 = r3.m21699()
            r3.m21697(r0, r5, r6)
            r6 = -1
            if (r4 == r6) goto L17
            int[] r1 = r3.f21402
            r1[r0] = r4
            int[] r1 = r3.f21403
            r2 = r1[r4]
            r1[r0] = r2
            r1[r4] = r0
            goto L2c
        L17:
            int[] r4 = r3.f21402
            r4[r0] = r6
            int r4 = r3.f21404
            if (r4 <= 0) goto L28
            int[] r4 = r3.f21403
            int r1 = r3.f21405
            r4[r0] = r1
            r3.f21405 = r0
            goto L2c
        L28:
            int[] r4 = r3.f21403
            r4[r0] = r6
        L2c:
            int[] r4 = r3.f21403
            r4 = r4[r0]
            if (r4 == r6) goto L36
            int[] r6 = r3.f21402
            r6[r4] = r0
        L36:
            r3.m21696(r5, r0)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m21702(Yue.C5834 r6) {
            r5 = this;
            int r6 = r6.f21370
            int r0 = r5.f21397
            int r0 = r6 % r0
            int[] r1 = r5.f21398
            r2 = r1[r0]
            r3 = -1
            if (r2 != r3) goto Le
            return
        Le:
            int[] r4 = r5.f21400
            r4 = r4[r2]
            if (r4 != r6) goto L1d
            int[] r6 = r5.f21399
            r4 = r6[r2]
            r1[r0] = r4
            r6[r2] = r3
            goto L39
        L1d:
            int[] r0 = r5.f21399
            r1 = r0[r2]
            if (r1 == r3) goto L2b
            int[] r4 = r5.f21400
            r4 = r4[r1]
            if (r4 == r6) goto L2b
            r2 = r1
            goto L1d
        L2b:
            if (r1 == r3) goto L39
            int[] r4 = r5.f21400
            r4 = r4[r1]
            if (r4 != r6) goto L39
            r6 = r0[r1]
            r0[r2] = r6
            r0[r1] = r3
        L39:
            return
    }
}
