package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0578 implements Yue.C3609.InterfaceC3610 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final boolean f1502 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean f1503 = false;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.C5834 f1504;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public float f1505;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f1506;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.util.ArrayList<Yue.C5834> f1507;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Yue.C0578.InterfaceC0579 f1508;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean f1509;

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۨۥ$ۥ, reason: contains not printable characters */
    public interface InterfaceC0579 {
        void clear();

        int getCurrentSize();

        /* JADX INFO: renamed from: ۥ */
        float mo2018(Yue.C0578 r1, boolean r2);

        /* JADX INFO: renamed from: ۥ۟ */
        void mo2019();

        /* JADX INFO: renamed from: ۥ۟۟ */
        float mo2020(Yue.C5834 r1, boolean r2);

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        void mo2021(Yue.C5834 r1, float r2);

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        Yue.C5834 mo2022(int r1);

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        void mo2023();

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        float mo2024(int r1);

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        float mo2025(Yue.C5834 r1);

        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        boolean mo2026(Yue.C5834 r1);

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        void mo2027(Yue.C5834 r1, float r2, boolean r3);

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        int mo2028(Yue.C5834 r1);

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        int mo2029();

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        void mo2030(float r1);
    }

    public C0578() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1504 = r0
            r0 = 0
            r2.f1505 = r0
            r0 = 0
            r2.f1506 = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.f1507 = r1
            r2.f1509 = r0
            return
    }

    public C0578(Yue.C0892 r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1504 = r0
            r0 = 0
            r2.f1505 = r0
            r0 = 0
            r2.f1506 = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.f1507 = r1
            r2.f1509 = r0
            Yue.ۥ۟ۡۨ۟ r0 = new Yue.ۥ۟ۡۨ۟
            r0.<init>(r2, r3)
            r2.f1508 = r0
            return
    }

    @Override // Yue.C3609.InterfaceC3610
    public void clear() {
            r1 = this;
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r1.f1508
            r0.clear()
            r0 = 0
            r1.f1504 = r0
            r0 = 0
            r1.f1505 = r0
            return
    }

    @Override // Yue.C3609.InterfaceC3610
    public Yue.C5834 getKey() {
            r1 = this;
            Yue.ۥۣۣۢ۟ r0 = r1.f1504
            return r0
    }

    @Override // Yue.C3609.InterfaceC3610
    public boolean isEmpty() {
            r2 = this;
            Yue.ۥۣۣۢ۟ r0 = r2.f1504
            if (r0 != 0) goto L15
            float r0 = r2.f1505
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L15
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r2.f1508
            int r0 = r0.getCurrentSize()
            if (r0 != 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.m2084()
            return r0
    }

    @Override // Yue.C3609.InterfaceC3610
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public Yue.C5834 mo2053(Yue.C3609 r1, boolean[] r2) {
            r0 = this;
            r1 = 0
            Yue.ۥۣۣۢ۟ r1 = r0.m2080(r2, r1)
            return r1
    }

    @Override // Yue.C3609.InterfaceC3610
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void mo2054(Yue.C3609 r9) {
            r8 = this;
            Yue.ۥ۟ۡۨۥ[] r0 = r9.f11508
            int r0 = r0.length
            if (r0 != 0) goto L6
            return
        L6:
            r0 = 0
            r1 = r0
        L8:
            r2 = 1
            if (r1 != 0) goto L66
            Yue.ۥ۟ۡۨۥ$ۥ r3 = r8.f1508
            int r3 = r3.getCurrentSize()
            r4 = r0
        L12:
            if (r4 >= r3) goto L2f
            Yue.ۥ۟ۡۨۥ$ۥ r5 = r8.f1508
            Yue.ۥۣۣۢ۟ r5 = r5.mo2022(r4)
            int r6 = r5.f21371
            r7 = -1
            if (r6 != r7) goto L27
            boolean r6 = r5.f21374
            if (r6 != 0) goto L27
            boolean r6 = r5.f21381
            if (r6 == 0) goto L2c
        L27:
            java.util.ArrayList<Yue.ۥۣۣۢ۟> r6 = r8.f1507
            r6.add(r5)
        L2c:
            int r4 = r4 + 1
            goto L12
        L2f:
            java.util.ArrayList<Yue.ۥۣۣۢ۟> r3 = r8.f1507
            int r3 = r3.size()
            if (r3 <= 0) goto L64
            r4 = r0
        L38:
            if (r4 >= r3) goto L5e
            java.util.ArrayList<Yue.ۥۣۣۢ۟> r5 = r8.f1507
            java.lang.Object r5 = r5.get(r4)
            Yue.ۥۣۣۢ۟ r5 = (Yue.C5834) r5
            boolean r6 = r5.f21374
            if (r6 == 0) goto L4a
            r8.mo2056(r9, r5, r2)
            goto L5b
        L4a:
            boolean r6 = r5.f21381
            if (r6 == 0) goto L52
            r8.m2085(r9, r5, r2)
            goto L5b
        L52:
            Yue.ۥ۟ۡۨۥ[] r6 = r9.f11508
            int r5 = r5.f21371
            r5 = r6[r5]
            r8.mo2057(r9, r5, r2)
        L5b:
            int r4 = r4 + 1
            goto L38
        L5e:
            java.util.ArrayList<Yue.ۥۣۣۢ۟> r2 = r8.f1507
            r2.clear()
            goto L8
        L64:
            r1 = r2
            goto L8
        L66:
            boolean r0 = Yue.C3609.f11494
            if (r0 == 0) goto L7a
            Yue.ۥۣۣۢ۟ r0 = r8.f1504
            if (r0 == 0) goto L7a
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r8.f1508
            int r0 = r0.getCurrentSize()
            if (r0 != 0) goto L7a
            r8.f1509 = r2
            r9.f11502 = r2
        L7a:
            return
    }

    @Override // Yue.C3609.InterfaceC3610
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void mo2055(Yue.C5834 r4) {
            r3 = this;
            int r0 = r4.f21372
            r1 = 1
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 != r1) goto L8
            goto L22
        L8:
            r1 = 2
            if (r0 != r1) goto Le
            r2 = 1148846080(0x447a0000, float:1000.0)
            goto L22
        Le:
            r1 = 3
            if (r0 != r1) goto L15
            r2 = 1232348160(0x49742400, float:1000000.0)
            goto L22
        L15:
            r1 = 4
            if (r0 != r1) goto L1c
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            goto L22
        L1c:
            r1 = 5
            if (r0 != r1) goto L22
            r2 = 1399379109(0x5368d4a5, float:1.0E12)
        L22:
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r3.f1508
            r0.mo2021(r4, r2)
            return
    }

    @Override // Yue.C3609.InterfaceC3610
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void mo2056(Yue.C3609 r4, Yue.C5834 r5, boolean r6) {
            r3 = this;
            boolean r0 = r5.f21374
            if (r0 != 0) goto L5
            return
        L5:
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r3.f1508
            float r0 = r0.mo2025(r5)
            float r1 = r3.f1505
            float r2 = r5.f21373
            float r2 = r2 * r0
            float r1 = r1 + r2
            r3.f1505 = r1
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r3.f1508
            r0.mo2020(r5, r6)
            if (r6 == 0) goto L1d
            r5.m21688(r3)
        L1d:
            boolean r5 = Yue.C3609.f11494
            if (r5 == 0) goto L2e
            Yue.ۥ۟ۡۨۥ$ۥ r5 = r3.f1508
            int r5 = r5.getCurrentSize()
            if (r5 != 0) goto L2e
            r5 = 1
            r3.f1509 = r5
            r4.f11502 = r5
        L2e:
            return
    }

    @Override // Yue.C3609.InterfaceC3610
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void mo2057(Yue.C3609 r4, Yue.C0578 r5, boolean r6) {
            r3 = this;
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r3.f1508
            float r0 = r0.mo2018(r5, r6)
            float r1 = r3.f1505
            float r2 = r5.f1505
            float r2 = r2 * r0
            float r1 = r1 + r2
            r3.f1505 = r1
            if (r6 == 0) goto L15
            Yue.ۥۣۣۢ۟ r5 = r5.f1504
            r5.m21688(r3)
        L15:
            boolean r5 = Yue.C3609.f11494
            if (r5 == 0) goto L2a
            Yue.ۥۣۣۢ۟ r5 = r3.f1504
            if (r5 == 0) goto L2a
            Yue.ۥ۟ۡۨۥ$ۥ r5 = r3.f1508
            int r5 = r5.getCurrentSize()
            if (r5 != 0) goto L2a
            r5 = 1
            r3.f1509 = r5
            r4.f11502 = r5
        L2a:
            return
    }

    @Override // Yue.C3609.InterfaceC3610
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo2058(Yue.C3609.InterfaceC3610 r6) {
            r5 = this;
            boolean r0 = r6 instanceof Yue.C0578
            if (r0 == 0) goto L2c
            Yue.ۥ۟ۡۨۥ r6 = (Yue.C0578) r6
            r0 = 0
            r5.f1504 = r0
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r5.f1508
            r0.clear()
            r0 = 0
        Lf:
            Yue.ۥ۟ۡۨۥ$ۥ r1 = r6.f1508
            int r1 = r1.getCurrentSize()
            if (r0 >= r1) goto L2c
            Yue.ۥ۟ۡۨۥ$ۥ r1 = r6.f1508
            Yue.ۥۣۣۢ۟ r1 = r1.mo2022(r0)
            Yue.ۥ۟ۡۨۥ$ۥ r2 = r6.f1508
            float r2 = r2.mo2024(r0)
            Yue.ۥ۟ۡۨۥ$ۥ r3 = r5.f1508
            r4 = 1
            r3.mo2027(r1, r2, r4)
            int r0 = r0 + 1
            goto Lf
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Yue.C0578 m2059(Yue.C3609 r4, int r5) {
            r3 = this;
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r3.f1508
            java.lang.String r1 = "ep"
            Yue.ۥۣۣۢ۟ r1 = r4.m14577(r5, r1)
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.mo2021(r1, r2)
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r3.f1508
            java.lang.String r1 = "em"
            Yue.ۥۣۣۢ۟ r4 = r4.m14577(r5, r1)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.mo2021(r4, r5)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public Yue.C0578 m2060(Yue.C5834 r2, int r3) {
            r1 = this;
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r1.f1508
            float r3 = (float) r3
            r0.mo2021(r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m2061(Yue.C3609 r3) {
            r2 = this;
            Yue.ۥۣۣۢ۟ r3 = r2.m2062(r3)
            r0 = 1
            if (r3 != 0) goto L9
            r3 = r0
            goto Ld
        L9:
            r2.m2081(r3)
            r3 = 0
        Ld:
            Yue.ۥ۟ۡۨۥ$ۥ r1 = r2.f1508
            int r1 = r1.getCurrentSize()
            if (r1 != 0) goto L17
            r2.f1509 = r0
        L17:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Yue.C5834 m2062(Yue.C3609 r15) {
            r14 = this;
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r14.f1508
            int r0 = r0.getCurrentSize()
            r1 = 0
            r2 = 0
            r3 = 0
            r7 = r2
            r8 = r7
            r4 = r3
            r5 = r4
            r6 = r5
            r3 = r1
        Lf:
            if (r4 >= r0) goto L6a
            Yue.ۥ۟ۡۨۥ$ۥ r9 = r14.f1508
            float r9 = r9.mo2024(r4)
            Yue.ۥ۟ۡۨۥ$ۥ r10 = r14.f1508
            Yue.ۥۣۣۢ۟ r10 = r10.mo2022(r4)
            Yue.ۥۣۣۢ۟$ۥ۟ r11 = r10.f21377
            Yue.ۥۣۣۢ۟$ۥ۟ r12 = Yue.C5834.EnumC5836.f21386
            r13 = 1
            if (r11 != r12) goto L43
            if (r1 != 0) goto L2e
            boolean r1 = r14.m2078(r10, r15)
        L2a:
            r5 = r1
            r7 = r9
            r1 = r10
            goto L67
        L2e:
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L37
            boolean r1 = r14.m2078(r10, r15)
            goto L2a
        L37:
            if (r5 != 0) goto L67
            boolean r11 = r14.m2078(r10, r15)
            if (r11 == 0) goto L67
            r7 = r9
            r1 = r10
            r5 = r13
            goto L67
        L43:
            if (r1 != 0) goto L67
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 >= 0) goto L67
            if (r3 != 0) goto L53
            boolean r3 = r14.m2078(r10, r15)
        L4f:
            r6 = r3
            r8 = r9
            r3 = r10
            goto L67
        L53:
            int r11 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r11 <= 0) goto L5c
            boolean r3 = r14.m2078(r10, r15)
            goto L4f
        L5c:
            if (r6 != 0) goto L67
            boolean r11 = r14.m2078(r10, r15)
            if (r11 == 0) goto L67
            r8 = r9
            r3 = r10
            r6 = r13
        L67:
            int r4 = r4 + 1
            goto Lf
        L6a:
            if (r1 == 0) goto L6d
            return r1
        L6d:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public Yue.C0578 m2063(Yue.C5834 r6, Yue.C5834 r7, int r8, float r9, Yue.C5834 r10, Yue.C5834 r11, int r12) {
            r5 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r7 != r10) goto L16
            Yue.ۥ۟ۡۨۥ$ۥ r8 = r5.f1508
            r8.mo2021(r6, r0)
            Yue.ۥ۟ۡۨۥ$ۥ r6 = r5.f1508
            r6.mo2021(r11, r0)
            Yue.ۥ۟ۡۨۥ$ۥ r6 = r5.f1508
            r8 = -1073741824(0xffffffffc0000000, float:-2.0)
            r6.mo2021(r7, r8)
            return r5
        L16:
            r1 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L3c
            Yue.ۥ۟ۡۨۥ$ۥ r9 = r5.f1508
            r9.mo2021(r6, r0)
            Yue.ۥ۟ۡۨۥ$ۥ r6 = r5.f1508
            r6.mo2021(r7, r2)
            Yue.ۥ۟ۡۨۥ$ۥ r6 = r5.f1508
            r6.mo2021(r10, r2)
            Yue.ۥ۟ۡۨۥ$ۥ r6 = r5.f1508
            r6.mo2021(r11, r0)
            if (r8 > 0) goto L36
            if (r12 <= 0) goto L8a
        L36:
            int r6 = -r8
            int r6 = r6 + r12
            float r6 = (float) r6
            r5.f1505 = r6
            goto L8a
        L3c:
            r1 = 0
            int r1 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r1 > 0) goto L4f
            Yue.ۥ۟ۡۨۥ$ۥ r9 = r5.f1508
            r9.mo2021(r6, r2)
            Yue.ۥ۟ۡۨۥ$ۥ r6 = r5.f1508
            r6.mo2021(r7, r0)
            float r6 = (float) r8
            r5.f1505 = r6
            goto L8a
        L4f:
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 < 0) goto L62
            Yue.ۥ۟ۡۨۥ$ۥ r6 = r5.f1508
            r6.mo2021(r11, r2)
            Yue.ۥ۟ۡۨۥ$ۥ r6 = r5.f1508
            r6.mo2021(r10, r0)
            int r6 = -r12
            float r6 = (float) r6
            r5.f1505 = r6
            goto L8a
        L62:
            Yue.ۥ۟ۡۨۥ$ۥ r1 = r5.f1508
            float r3 = r0 - r9
            float r4 = r3 * r0
            r1.mo2021(r6, r4)
            Yue.ۥ۟ۡۨۥ$ۥ r6 = r5.f1508
            float r1 = r3 * r2
            r6.mo2021(r7, r1)
            Yue.ۥ۟ۡۨۥ$ۥ r6 = r5.f1508
            float r2 = r2 * r9
            r6.mo2021(r10, r2)
            Yue.ۥ۟ۡۨۥ$ۥ r6 = r5.f1508
            float r0 = r0 * r9
            r6.mo2021(r11, r0)
            if (r8 > 0) goto L82
            if (r12 <= 0) goto L8a
        L82:
            int r6 = -r8
            float r6 = (float) r6
            float r6 = r6 * r3
            float r7 = (float) r12
            float r7 = r7 * r9
            float r6 = r6 + r7
            r5.f1505 = r6
        L8a:
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public Yue.C0578 m2064(Yue.C5834 r1, int r2) {
            r0 = this;
            r0.f1504 = r1
            float r2 = (float) r2
            r1.f21373 = r2
            r0.f1505 = r2
            r1 = 1
            r0.f1509 = r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public Yue.C0578 m2065(Yue.C5834 r3, Yue.C5834 r4, float r5) {
            r2 = this;
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r2.f1508
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.mo2021(r3, r1)
            Yue.ۥ۟ۡۨۥ$ۥ r3 = r2.f1508
            r3.mo2021(r4, r5)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public Yue.C0578 m2066(Yue.C5834 r3, Yue.C5834 r4, Yue.C5834 r5, Yue.C5834 r6, float r7) {
            r2 = this;
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r2.f1508
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.mo2021(r3, r1)
            Yue.ۥ۟ۡۨۥ$ۥ r3 = r2.f1508
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.mo2021(r4, r0)
            Yue.ۥ۟ۡۨۥ$ۥ r3 = r2.f1508
            r3.mo2021(r5, r7)
            Yue.ۥ۟ۡۨۥ$ۥ r3 = r2.f1508
            float r4 = -r7
            r3.mo2021(r6, r4)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public Yue.C0578 m2067(float r4, float r5, float r6, Yue.C5834 r7, int r8, Yue.C5834 r9, int r10, Yue.C5834 r11, int r12, Yue.C5834 r13, int r14) {
            r3 = this;
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L32
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto Le
            goto L32
        Le:
            float r4 = r4 / r5
            float r6 = r6 / r5
            float r4 = r4 / r6
            int r5 = -r8
            int r5 = r5 - r10
            float r5 = (float) r5
            float r6 = (float) r12
            float r6 = r6 * r4
            float r5 = r5 + r6
            float r6 = (float) r14
            float r6 = r6 * r4
            float r5 = r5 + r6
            r3.f1505 = r5
            Yue.ۥ۟ۡۨۥ$ۥ r5 = r3.f1508
            r5.mo2021(r7, r2)
            Yue.ۥ۟ۡۨۥ$ۥ r5 = r3.f1508
            r5.mo2021(r9, r1)
            Yue.ۥ۟ۡۨۥ$ۥ r5 = r3.f1508
            r5.mo2021(r13, r4)
            Yue.ۥ۟ۡۨۥ$ۥ r5 = r3.f1508
            float r4 = -r4
            r5.mo2021(r11, r4)
            goto L4d
        L32:
            int r4 = -r8
            int r4 = r4 - r10
            int r4 = r4 + r12
            int r4 = r4 + r14
            float r4 = (float) r4
            r3.f1505 = r4
            Yue.ۥ۟ۡۨۥ$ۥ r4 = r3.f1508
            r4.mo2021(r7, r2)
            Yue.ۥ۟ۡۨۥ$ۥ r4 = r3.f1508
            r4.mo2021(r9, r1)
            Yue.ۥ۟ۡۨۥ$ۥ r4 = r3.f1508
            r4.mo2021(r13, r2)
            Yue.ۥ۟ۡۨۥ$ۥ r4 = r3.f1508
            r4.mo2021(r11, r1)
        L4d:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public Yue.C0578 m2068(float r5, float r6, float r7, Yue.C5834 r8, Yue.C5834 r9, Yue.C5834 r10, Yue.C5834 r11) {
            r4 = this;
            r0 = 0
            r4.f1505 = r0
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L47
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L10
            goto L47
        L10:
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r1 != 0) goto L1f
            Yue.ۥ۟ۡۨۥ$ۥ r5 = r4.f1508
            r5.mo2021(r8, r3)
            Yue.ۥ۟ۡۨۥ$ۥ r5 = r4.f1508
            r5.mo2021(r9, r2)
            goto L5b
        L1f:
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L2e
            Yue.ۥ۟ۡۨۥ$ۥ r5 = r4.f1508
            r5.mo2021(r10, r3)
            Yue.ۥ۟ۡۨۥ$ۥ r5 = r4.f1508
            r5.mo2021(r11, r2)
            goto L5b
        L2e:
            float r5 = r5 / r6
            float r7 = r7 / r6
            float r5 = r5 / r7
            Yue.ۥ۟ۡۨۥ$ۥ r6 = r4.f1508
            r6.mo2021(r8, r3)
            Yue.ۥ۟ۡۨۥ$ۥ r6 = r4.f1508
            r6.mo2021(r9, r2)
            Yue.ۥ۟ۡۨۥ$ۥ r6 = r4.f1508
            r6.mo2021(r11, r5)
            Yue.ۥ۟ۡۨۥ$ۥ r6 = r4.f1508
            float r5 = -r5
            r6.mo2021(r10, r5)
            goto L5b
        L47:
            Yue.ۥ۟ۡۨۥ$ۥ r5 = r4.f1508
            r5.mo2021(r8, r3)
            Yue.ۥ۟ۡۨۥ$ۥ r5 = r4.f1508
            r5.mo2021(r9, r2)
            Yue.ۥ۟ۡۨۥ$ۥ r5 = r4.f1508
            r5.mo2021(r11, r3)
            Yue.ۥ۟ۡۨۥ$ۥ r5 = r4.f1508
            r5.mo2021(r10, r2)
        L5b:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public Yue.C0578 m2069(Yue.C5834 r2, int r3) {
            r1 = this;
            if (r3 >= 0) goto Lf
            int r3 = r3 * (-1)
            float r3 = (float) r3
            r1.f1505 = r3
            Yue.ۥ۟ۡۨۥ$ۥ r3 = r1.f1508
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.mo2021(r2, r0)
            goto L19
        Lf:
            float r3 = (float) r3
            r1.f1505 = r3
            Yue.ۥ۟ۡۨۥ$ۥ r3 = r1.f1508
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.mo2021(r2, r0)
        L19:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public Yue.C0578 m2070(Yue.C5834 r3, Yue.C5834 r4, int r5) {
            r2 = this;
            r0 = 0
            if (r5 == 0) goto Lb
            if (r5 >= 0) goto L8
            int r5 = r5 * (-1)
            r0 = 1
        L8:
            float r5 = (float) r5
            r2.f1505 = r5
        Lb:
            r5 = 1065353216(0x3f800000, float:1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 != 0) goto L1c
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r2.f1508
            r0.mo2021(r3, r1)
            Yue.ۥ۟ۡۨۥ$ۥ r3 = r2.f1508
            r3.mo2021(r4, r5)
            goto L26
        L1c:
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r2.f1508
            r0.mo2021(r3, r5)
            Yue.ۥ۟ۡۨۥ$ۥ r3 = r2.f1508
            r3.mo2021(r4, r1)
        L26:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public Yue.C0578 m2071(Yue.C5834 r1, int r2, Yue.C5834 r3) {
            r0 = this;
            float r2 = (float) r2
            r0.f1505 = r2
            Yue.ۥ۟ۡۨۥ$ۥ r2 = r0.f1508
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.mo2021(r1, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Yue.C0578 m2072(Yue.C5834 r3, Yue.C5834 r4, Yue.C5834 r5, int r6) {
            r2 = this;
            r0 = 0
            if (r6 == 0) goto Lb
            if (r6 >= 0) goto L8
            int r6 = r6 * (-1)
            r0 = 1
        L8:
            float r6 = (float) r6
            r2.f1505 = r6
        Lb:
            r6 = 1065353216(0x3f800000, float:1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 != 0) goto L21
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r2.f1508
            r0.mo2021(r3, r1)
            Yue.ۥ۟ۡۨۥ$ۥ r3 = r2.f1508
            r3.mo2021(r4, r6)
            Yue.ۥ۟ۡۨۥ$ۥ r3 = r2.f1508
            r3.mo2021(r5, r6)
            goto L30
        L21:
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r2.f1508
            r0.mo2021(r3, r6)
            Yue.ۥ۟ۡۨۥ$ۥ r3 = r2.f1508
            r3.mo2021(r4, r1)
            Yue.ۥ۟ۡۨۥ$ۥ r3 = r2.f1508
            r3.mo2021(r5, r1)
        L30:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public Yue.C0578 m2073(Yue.C5834 r3, Yue.C5834 r4, Yue.C5834 r5, int r6) {
            r2 = this;
            r0 = 0
            if (r6 == 0) goto Lb
            if (r6 >= 0) goto L8
            int r6 = r6 * (-1)
            r0 = 1
        L8:
            float r6 = (float) r6
            r2.f1505 = r6
        Lb:
            r6 = 1065353216(0x3f800000, float:1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 != 0) goto L21
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r2.f1508
            r0.mo2021(r3, r1)
            Yue.ۥ۟ۡۨۥ$ۥ r3 = r2.f1508
            r3.mo2021(r4, r6)
            Yue.ۥ۟ۡۨۥ$ۥ r3 = r2.f1508
            r3.mo2021(r5, r1)
            goto L30
        L21:
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r2.f1508
            r0.mo2021(r3, r6)
            Yue.ۥ۟ۡۨۥ$ۥ r3 = r2.f1508
            r3.mo2021(r4, r1)
            Yue.ۥ۟ۡۨۥ$ۥ r3 = r2.f1508
            r3.mo2021(r5, r6)
        L30:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Yue.C0578 m2074(Yue.C5834 r3, Yue.C5834 r4, Yue.C5834 r5, Yue.C5834 r6, float r7) {
            r2 = this;
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r2.f1508
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.mo2021(r5, r1)
            Yue.ۥ۟ۡۨۥ$ۥ r5 = r2.f1508
            r5.mo2021(r6, r1)
            Yue.ۥ۟ۡۨۥ$ۥ r5 = r2.f1508
            r6 = -1090519040(0xffffffffbf000000, float:-0.5)
            r5.mo2021(r3, r6)
            Yue.ۥ۟ۡۨۥ$ۥ r3 = r2.f1508
            r3.mo2021(r4, r6)
            float r3 = -r7
            r2.f1505 = r3
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m2075() {
            r2 = this;
            float r0 = r2.f1505
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 >= 0) goto L11
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r0 = r0 * r1
            r2.f1505 = r0
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r2.f1508
            r0.mo2023()
        L11:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean m2076() {
            r2 = this;
            Yue.ۥۣۣۢ۟ r0 = r2.f1504
            if (r0 == 0) goto L13
            Yue.ۥۣۣۢ۟$ۥ۟ r0 = r0.f21377
            Yue.ۥۣۣۢ۟$ۥ۟ r1 = Yue.C5834.EnumC5836.f21386
            if (r0 == r1) goto L11
            float r0 = r2.f1505
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L13
        L11:
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean m2077(Yue.C5834 r2) {
            r1 = this;
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r1.f1508
            boolean r2 = r0.mo2026(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final boolean m2078(Yue.C5834 r1, Yue.C3609 r2) {
            r0 = this;
            int r1 = r1.f21380
            r2 = 1
            if (r1 > r2) goto L6
            goto L7
        L6:
            r2 = 0
        L7:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public Yue.C5834 m2079(Yue.C5834 r2) {
            r1 = this;
            r0 = 0
            Yue.ۥۣۣۢ۟ r2 = r1.m2080(r0, r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final Yue.C5834 m2080(boolean[] r10, Yue.C5834 r11) {
            r9 = this;
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r9.f1508
            int r0 = r0.getCurrentSize()
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r1
        La:
            if (r3 >= r0) goto L39
            Yue.ۥ۟ۡۨۥ$ۥ r5 = r9.f1508
            float r5 = r5.mo2024(r3)
            int r6 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r6 >= 0) goto L36
            Yue.ۥ۟ۡۨۥ$ۥ r6 = r9.f1508
            Yue.ۥۣۣۢ۟ r6 = r6.mo2022(r3)
            if (r10 == 0) goto L24
            int r7 = r6.f21370
            boolean r7 = r10[r7]
            if (r7 != 0) goto L36
        L24:
            if (r6 == r11) goto L36
            Yue.ۥۣۣۢ۟$ۥ۟ r7 = r6.f21377
            Yue.ۥۣۣۢ۟$ۥ۟ r8 = Yue.C5834.EnumC5836.f21388
            if (r7 == r8) goto L30
            Yue.ۥۣۣۢ۟$ۥ۟ r8 = Yue.C5834.EnumC5836.f21389
            if (r7 != r8) goto L36
        L30:
            int r7 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r7 >= 0) goto L36
            r4 = r5
            r2 = r6
        L36:
            int r3 = r3 + 1
            goto La
        L39:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void m2081(Yue.C5834 r4) {
            r3 = this;
            Yue.ۥۣۣۢ۟ r0 = r3.f1504
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L13
            Yue.ۥ۟ۡۨۥ$ۥ r2 = r3.f1508
            r2.mo2021(r0, r1)
            Yue.ۥۣۣۢ۟ r0 = r3.f1504
            r2 = -1
            r0.f21371 = r2
            r0 = 0
            r3.f1504 = r0
        L13:
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r3.f1508
            r2 = 1
            float r0 = r0.mo2020(r4, r2)
            float r0 = r0 * r1
            r3.f1504 = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L24
            return
        L24:
            float r4 = r3.f1505
            float r4 = r4 / r0
            r3.f1505 = r4
            Yue.ۥ۟ۡۨۥ$ۥ r4 = r3.f1508
            r4.mo2030(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public void m2082() {
            r1 = this;
            r0 = 0
            r1.f1504 = r0
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r1.f1508
            r0.clear()
            r0 = 0
            r1.f1505 = r0
            r0 = 0
            r1.f1509 = r0
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int m2083() {
            r2 = this;
            Yue.ۥۣۣۢ۟ r0 = r2.f1504
            if (r0 == 0) goto L6
            r0 = 4
            goto L7
        L6:
            r0 = 0
        L7:
            int r0 = r0 + 8
            Yue.ۥ۟ۡۨۥ$ۥ r1 = r2.f1508
            int r1 = r1.mo2029()
            int r0 = r0 + r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public java.lang.String m2084() {
            r10 = this;
            Yue.ۥۣۣۢ۟ r0 = r10.f1504
            java.lang.String r1 = ""
            if (r0 != 0) goto L18
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L29
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            Yue.ۥۣۣۢ۟ r1 = r10.f1504
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L29:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f1505
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L56
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f1505
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L57
        L56:
            r1 = r3
        L57:
            Yue.ۥ۟ۡۨۥ$ۥ r5 = r10.f1508
            int r5 = r5.getCurrentSize()
        L5d:
            if (r3 >= r5) goto Lec
            Yue.ۥ۟ۡۨۥ$ۥ r6 = r10.f1508
            Yue.ۥۣۣۢ۟ r6 = r6.mo2022(r3)
            if (r6 != 0) goto L69
            goto Le8
        L69:
            Yue.ۥ۟ۡۨۥ$ۥ r7 = r10.f1508
            float r7 = r7.mo2024(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L75
            goto Le8
        L75:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L94
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto Lba
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L92:
            float r7 = r7 * r9
            goto Lba
        L94:
            if (r8 <= 0) goto La8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto Lba
        La8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L92
        Lba:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Ld0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto Le7
        Ld0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        Le7:
            r1 = r4
        Le8:
            int r3 = r3 + 1
            goto L5d
        Lec:
            if (r1 != 0) goto Lff
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Lff:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void m2085(Yue.C3609 r4, Yue.C5834 r5, boolean r6) {
            r3 = this;
            boolean r0 = r5.f21381
            if (r0 != 0) goto L5
            return
        L5:
            Yue.ۥ۟ۡۨۥ$ۥ r0 = r3.f1508
            float r0 = r0.mo2025(r5)
            float r1 = r3.f1505
            float r2 = r5.f21383
            float r2 = r2 * r0
            float r1 = r1 + r2
            r3.f1505 = r1
            Yue.ۥ۟ۡۨۥ$ۥ r1 = r3.f1508
            r1.mo2020(r5, r6)
            if (r6 == 0) goto L1d
            r5.m21688(r3)
        L1d:
            Yue.ۥ۟ۡۨۥ$ۥ r1 = r3.f1508
            Yue.ۥۣ۟ۥۨ r2 = r4.f11515
            Yue.ۥۣۣۢ۟[] r2 = r2.f2604
            int r5 = r5.f21382
            r5 = r2[r5]
            r1.mo2027(r5, r0, r6)
            boolean r5 = Yue.C3609.f11494
            if (r5 == 0) goto L3b
            Yue.ۥ۟ۡۨۥ$ۥ r5 = r3.f1508
            int r5 = r5.getCurrentSize()
            if (r5 != 0) goto L3b
            r5 = 1
            r3.f1509 = r5
            r4.f11502 = r5
        L3b:
            return
    }
}
