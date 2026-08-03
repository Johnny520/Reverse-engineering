package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۥ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4935 extends Yue.C0578 {

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final float f15764 = 1.0E-4f;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final boolean f15765 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f15766 = -1;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f15767;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public Yue.C5834[] f15768;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public Yue.C5834[] f15769;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int f15770;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public Yue.C4935.C4937 f15771;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public Yue.C0892 f15772;

    /* JADX INFO: renamed from: Yue.ۥۡۥ۠ۦ$ۥ, reason: contains not printable characters */
    public class C4936 implements java.util.Comparator<Yue.C5834> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4935 f15773;

        public C4936(Yue.C4935 r1) {
                r0 = this;
                r0.f15773 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Yue.C5834 r1, Yue.C5834 r2) {
                r0 = this;
                Yue.ۥۣۣۢ۟ r1 = (Yue.C5834) r1
                Yue.ۥۣۣۢ۟ r2 = (Yue.C5834) r2
                int r1 = r0.m19316(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int m19316(Yue.C5834 r1, Yue.C5834 r2) {
                r0 = this;
                int r1 = r1.f21370
                int r2 = r2.f21370
                int r1 = r1 - r2
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۥ۠ۦ$ۥ۟, reason: contains not printable characters */
    public class C4937 implements java.lang.Comparable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Yue.C5834 f15774;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Yue.C4935 f15775;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4935 f15776;

        public C4937(Yue.C4935 r1, Yue.C4935 r2) {
                r0 = this;
                r0.f15776 = r1
                r0.<init>()
                r0.f15775 = r2
                return
        }

        @Override // java.lang.Comparable
        public int compareTo(java.lang.Object r2) {
                r1 = this;
                Yue.ۥۣۣۢ۟ r2 = (Yue.C5834) r2
                Yue.ۥۣۣۢ۟ r0 = r1.f15774
                int r0 = r0.f21370
                int r2 = r2.f21370
                int r0 = r0 - r2
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                Yue.ۥۣۣۢ۟ r0 = r3.f15774
                java.lang.String r1 = "[ "
                if (r0 == 0) goto L28
                r0 = 0
            L7:
                r2 = 9
                if (r0 >= r2) goto L28
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                Yue.ۥۣۣۢ۟ r1 = r3.f15774
                float[] r1 = r1.f21376
                r1 = r1[r0]
                r2.append(r1)
                java.lang.String r1 = " "
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                int r0 = r0 + 1
                goto L7
            L28:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r1 = "] "
                r0.append(r1)
                Yue.ۥۣۣۢ۟ r1 = r3.f15774
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m19317(Yue.C5834 r5) {
                r4 = this;
                r0 = 0
            L1:
                r1 = 9
                if (r0 >= r1) goto L27
                Yue.ۥۣۣۢ۟ r1 = r4.f15774
                float[] r1 = r1.f21376
                r2 = r1[r0]
                float[] r3 = r5.f21376
                r3 = r3[r0]
                float r2 = r2 + r3
                r1[r0] = r2
                float r1 = java.lang.Math.abs(r2)
                r2 = 953267991(0x38d1b717, float:1.0E-4)
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 >= 0) goto L24
                Yue.ۥۣۣۢ۟ r1 = r4.f15774
                float[] r1 = r1.f21376
                r2 = 0
                r1[r0] = r2
            L24:
                int r0 = r0 + 1
                goto L1
            L27:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean m19318(Yue.C5834 r10, float r11) {
                r9 = this;
                Yue.ۥۣۣۢ۟ r0 = r9.f15774
                boolean r0 = r0.f21368
                r1 = 953267991(0x38d1b717, float:1.0E-4)
                r2 = 9
                r3 = 0
                r4 = 0
                r5 = 1
                if (r0 == 0) goto L3c
                r0 = r4
            Lf:
                if (r0 >= r2) goto L32
                Yue.ۥۣۣۢ۟ r6 = r9.f15774
                float[] r6 = r6.f21376
                r7 = r6[r0]
                float[] r8 = r10.f21376
                r8 = r8[r0]
                float r8 = r8 * r11
                float r7 = r7 + r8
                r6[r0] = r7
                float r6 = java.lang.Math.abs(r7)
                int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r6 >= 0) goto L2e
                Yue.ۥۣۣۢ۟ r6 = r9.f15774
                float[] r6 = r6.f21376
                r6[r0] = r3
                goto L2f
            L2e:
                r5 = r4
            L2f:
                int r0 = r0 + 1
                goto Lf
            L32:
                if (r5 == 0) goto L3b
                Yue.ۥۡۥ۠ۦ r10 = r9.f15776
                Yue.ۥۣۣۢ۟ r11 = r9.f15774
                Yue.C4935.m19313(r10, r11)
            L3b:
                return r4
            L3c:
                if (r4 >= r2) goto L60
                float[] r0 = r10.f21376
                r0 = r0[r4]
                int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r6 == 0) goto L57
                float r0 = r0 * r11
                float r6 = java.lang.Math.abs(r0)
                int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r6 >= 0) goto L50
                r0 = r3
            L50:
                Yue.ۥۣۣۢ۟ r6 = r9.f15774
                float[] r6 = r6.f21376
                r6[r4] = r0
                goto L5d
            L57:
                Yue.ۥۣۣۢ۟ r0 = r9.f15774
                float[] r0 = r0.f21376
                r0[r4] = r3
            L5d:
                int r4 = r4 + 1
                goto L3c
            L60:
                return r5
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m19319(Yue.C5834 r1) {
                r0 = this;
                r0.f15774 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final boolean m19320() {
                r5 = this;
                r0 = 8
            L2:
                r1 = 0
                if (r0 < 0) goto L1a
                Yue.ۥۣۣۢ۟ r2 = r5.f15774
                float[] r2 = r2.f21376
                r2 = r2[r0]
                r3 = 0
                int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r4 <= 0) goto L11
                return r1
            L11:
                int r1 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r1 >= 0) goto L17
                r0 = 1
                return r0
            L17:
                int r0 = r0 + (-1)
                goto L2
            L1a:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final boolean m19321() {
                r4 = this;
                r0 = 0
                r1 = r0
            L2:
                r2 = 9
                if (r1 >= r2) goto L15
                Yue.ۥۣۣۢ۟ r2 = r4.f15774
                float[] r2 = r2.f21376
                r2 = r2[r1]
                r3 = 0
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 == 0) goto L12
                return r0
            L12:
                int r1 = r1 + 1
                goto L2
            L15:
                r0 = 1
                return r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final boolean m19322(Yue.C5834 r6) {
                r5 = this;
                r0 = 8
            L2:
                r1 = 0
                if (r0 < 0) goto L1c
                float[] r2 = r6.f21376
                r2 = r2[r0]
                Yue.ۥۣۣۢ۟ r3 = r5.f15774
                float[] r3 = r3.f21376
                r3 = r3[r0]
                int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r4 != 0) goto L16
                int r0 = r0 + (-1)
                goto L2
            L16:
                int r6 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
                if (r6 >= 0) goto L1c
                r6 = 1
                return r6
            L1c:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m19323() {
                r2 = this;
                Yue.ۥۣۣۢ۟ r0 = r2.f15774
                float[] r0 = r0.f21376
                r1 = 0
                java.util.Arrays.fill(r0, r1)
                return
        }
    }

    public C4935(Yue.C0892 r3) {
            r2 = this;
            r2.<init>(r3)
            r0 = 128(0x80, float:1.8E-43)
            r2.f15767 = r0
            Yue.ۥۣۣۢ۟[] r1 = new Yue.C5834[r0]
            r2.f15768 = r1
            Yue.ۥۣۣۢ۟[] r0 = new Yue.C5834[r0]
            r2.f15769 = r0
            r0 = 0
            r2.f15770 = r0
            Yue.ۥۡۥ۠ۦ$ۥ۟ r0 = new Yue.ۥۡۥ۠ۦ$ۥ۟
            r0.<init>(r2, r2)
            r2.f15771 = r0
            r2.f15772 = r3
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static /* synthetic */ void m19313(Yue.C4935 r0, Yue.C5834 r1) {
            r0.m19315(r1)
            return
    }

    @Override // Yue.C0578, Yue.C3609.InterfaceC3610
    public void clear() {
            r1 = this;
            r0 = 0
            r1.f15770 = r0
            r0 = 0
            r1.f1505 = r0
            return
    }

    @Override // Yue.C0578, Yue.C3609.InterfaceC3610
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.f15770
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // Yue.C0578
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r1 = " goal -> ("
            r0.append(r1)
            float r1 = r4.f1505
            r0.append(r1)
            java.lang.String r1 = ") : "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
        L1e:
            int r2 = r4.f15770
            if (r1 >= r2) goto L44
            Yue.ۥۣۣۢ۟[] r2 = r4.f15768
            r2 = r2[r1]
            Yue.ۥۡۥ۠ۦ$ۥ۟ r3 = r4.f15771
            r3.m19319(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            Yue.ۥۡۥ۠ۦ$ۥ۟ r0 = r4.f15771
            r2.append(r0)
            java.lang.String r0 = " "
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            int r1 = r1 + 1
            goto L1e
        L44:
            return r0
    }

    @Override // Yue.C0578, Yue.C3609.InterfaceC3610
    /* JADX INFO: renamed from: ۥ */
    public Yue.C5834 mo2053(Yue.C3609 r5, boolean[] r6) {
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = r5
        L3:
            int r2 = r4.f15770
            if (r0 >= r2) goto L32
            Yue.ۥۣۣۢ۟[] r2 = r4.f15768
            r2 = r2[r0]
            int r3 = r2.f21370
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2f
        L12:
            Yue.ۥۡۥ۠ۦ$ۥ۟ r3 = r4.f15771
            r3.m19319(r2)
            if (r1 != r5) goto L22
            Yue.ۥۡۥ۠ۦ$ۥ۟ r2 = r4.f15771
            boolean r2 = r2.m19320()
            if (r2 == 0) goto L2f
            goto L2e
        L22:
            Yue.ۥۡۥ۠ۦ$ۥ۟ r2 = r4.f15771
            Yue.ۥۣۣۢ۟[] r3 = r4.f15768
            r3 = r3[r1]
            boolean r2 = r2.m19322(r3)
            if (r2 == 0) goto L2f
        L2e:
            r1 = r0
        L2f:
            int r0 = r0 + 1
            goto L3
        L32:
            if (r1 != r5) goto L36
            r5 = 0
            return r5
        L36:
            Yue.ۥۣۣۢ۟[] r5 = r4.f15768
            r5 = r5[r1]
            return r5
    }

    @Override // Yue.C0578, Yue.C3609.InterfaceC3610
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo2055(Yue.C5834 r4) {
            r3 = this;
            Yue.ۥۡۥ۠ۦ$ۥ۟ r0 = r3.f15771
            r0.m19319(r4)
            Yue.ۥۡۥ۠ۦ$ۥ۟ r0 = r3.f15771
            r0.m19323()
            float[] r0 = r4.f21376
            int r1 = r4.f21372
            r2 = 1065353216(0x3f800000, float:1.0)
            r0[r1] = r2
            r3.m19314(r4)
            return
    }

    @Override // Yue.C0578, Yue.C3609.InterfaceC3610
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo2057(Yue.C3609 r6, Yue.C0578 r7, boolean r8) {
            r5 = this;
            Yue.ۥۣۣۢ۟ r6 = r7.f1504
            if (r6 != 0) goto L5
            return
        L5:
            Yue.ۥ۟ۡۨۥ$ۥ r8 = r7.f1508
            int r0 = r8.getCurrentSize()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L31
            Yue.ۥۣۣۢ۟ r2 = r8.mo2022(r1)
            float r3 = r8.mo2024(r1)
            Yue.ۥۡۥ۠ۦ$ۥ۟ r4 = r5.f15771
            r4.m19319(r2)
            Yue.ۥۡۥ۠ۦ$ۥ۟ r4 = r5.f15771
            boolean r4 = r4.m19318(r6, r3)
            if (r4 == 0) goto L26
            r5.m19314(r2)
        L26:
            float r2 = r5.f1505
            float r4 = r7.f1505
            float r4 = r4 * r3
            float r2 = r2 + r4
            r5.f1505 = r2
            int r1 = r1 + 1
            goto Lc
        L31:
            r5.m19315(r6)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final void m19314(Yue.C5834 r6) {
            r5 = this;
            int r0 = r5.f15770
            r1 = 1
            int r0 = r0 + r1
            Yue.ۥۣۣۢ۟[] r2 = r5.f15768
            int r3 = r2.length
            if (r0 <= r3) goto L1f
            int r0 = r2.length
            int r0 = r0 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            Yue.ۥۣۣۢ۟[] r0 = (Yue.C5834[]) r0
            r5.f15768 = r0
            int r2 = r0.length
            int r2 = r2 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            Yue.ۥۣۣۢ۟[] r0 = (Yue.C5834[]) r0
            r5.f15769 = r0
        L1f:
            Yue.ۥۣۣۢ۟[] r0 = r5.f15768
            int r2 = r5.f15770
            r0[r2] = r6
            int r3 = r2 + 1
            r5.f15770 = r3
            if (r3 <= r1) goto L5d
            r0 = r0[r2]
            int r0 = r0.f21370
            int r2 = r6.f21370
            if (r0 <= r2) goto L5d
            r0 = 0
            r2 = r0
        L35:
            int r3 = r5.f15770
            if (r2 >= r3) goto L44
            Yue.ۥۣۣۢ۟[] r3 = r5.f15769
            Yue.ۥۣۣۢ۟[] r4 = r5.f15768
            r4 = r4[r2]
            r3[r2] = r4
            int r2 = r2 + 1
            goto L35
        L44:
            Yue.ۥۣۣۢ۟[] r2 = r5.f15769
            Yue.ۥۡۥ۠ۦ$ۥ r4 = new Yue.ۥۡۥ۠ۦ$ۥ
            r4.<init>(r5)
            java.util.Arrays.sort(r2, r0, r3, r4)
        L4e:
            int r2 = r5.f15770
            if (r0 >= r2) goto L5d
            Yue.ۥۣۣۢ۟[] r2 = r5.f15768
            Yue.ۥۣۣۢ۟[] r3 = r5.f15769
            r3 = r3[r0]
            r2[r0] = r3
            int r0 = r0 + 1
            goto L4e
        L5d:
            r6.f21368 = r1
            r6.m21685(r5)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final void m19315(Yue.C5834 r6) {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.f15770
            if (r1 >= r2) goto L26
            Yue.ۥۣۣۢ۟[] r2 = r5.f15768
            r2 = r2[r1]
            if (r2 != r6) goto L23
        Lc:
            int r2 = r5.f15770
            int r3 = r2 + (-1)
            if (r1 >= r3) goto L1c
            Yue.ۥۣۣۢ۟[] r2 = r5.f15768
            int r3 = r1 + 1
            r4 = r2[r3]
            r2[r1] = r4
            r1 = r3
            goto Lc
        L1c:
            int r2 = r2 + (-1)
            r5.f15770 = r2
            r6.f21368 = r0
            return
        L23:
            int r1 = r1 + 1
            goto L2
        L26:
            return
    }
}
