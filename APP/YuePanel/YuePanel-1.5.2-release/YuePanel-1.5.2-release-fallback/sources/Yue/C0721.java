package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0721 extends Yue.C3025 {

    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public static final int f1981 = 0;

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public static final int f1982 = 1;

    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public static final int f1983 = 2;

    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public static final int f1984 = 3;

    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public static final boolean f1985 = true;

    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public static final boolean f1986 = false;

    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public int f1987;

    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public boolean f1988;

    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public int f1989;

    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public boolean f1990;

    public C0721() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1987 = r0
            r1 = 1
            r2.f1988 = r1
            r2.f1989 = r0
            r2.f1990 = r0
            return
    }

    public C0721(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f1987 = r0
            r1 = 1
            r2.f1988 = r1
            r2.f1989 = r0
            r2.f1990 = r0
            r2.m7573(r3)
            return
    }

    @Override // Yue.C1517
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[Barrier] "
            r0.append(r1)
            java.lang.String r1 = r4.m7507()
            r0.append(r1)
            java.lang.String r1 = " {"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
        L1b:
            int r2 = r4.f9724
            if (r1 >= r2) goto L4c
            Yue.ۥ۟ۧ۟ۢ[] r2 = r4.f9723
            r2 = r2[r1]
            if (r1 <= 0) goto L36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = ", "
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L36:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = r2.m7507()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            int r1 = r1 + 1
            goto L1b
        L4c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "}"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // Yue.C1517
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void mo4464(Yue.C3609 r13, boolean r14) {
            r12 = this;
            Yue.ۥ۟ۧ۟۠[] r14 = r12.f4862
            Yue.ۥ۟ۧ۟۠ r0 = r12.f4854
            r1 = 0
            r14[r1] = r0
            Yue.ۥ۟ۧ۟۠ r0 = r12.f4855
            r2 = 2
            r14[r2] = r0
            Yue.ۥ۟ۧ۟۠ r0 = r12.f4856
            r3 = 1
            r14[r3] = r0
            Yue.ۥ۟ۧ۟۠ r0 = r12.f4857
            r4 = 3
            r14[r4] = r0
            r14 = r1
        L17:
            Yue.ۥ۟ۧ۟۠[] r0 = r12.f4862
            int r5 = r0.length
            if (r14 >= r5) goto L27
            r0 = r0[r14]
            Yue.ۥۣۣۢ۟ r5 = r13.m14579(r0)
            r0.f4740 = r5
            int r14 = r14 + 1
            goto L17
        L27:
            int r14 = r12.f1987
            if (r14 < 0) goto L1f8
            r5 = 4
            if (r14 >= r5) goto L1f8
            r14 = r0[r14]
            boolean r0 = r12.f1990
            if (r0 != 0) goto L37
            r12.m4469()
        L37:
            boolean r0 = r12.f1990
            if (r0 == 0) goto L6e
            r12.f1990 = r1
            int r14 = r12.f1987
            if (r14 == 0) goto L5b
            if (r14 != r3) goto L44
            goto L5b
        L44:
            if (r14 == r2) goto L48
            if (r14 != r4) goto L6d
        L48:
            Yue.ۥ۟ۧ۟۠ r14 = r12.f4855
            Yue.ۥۣۣۢ۟ r14 = r14.f4740
            int r0 = r12.f4872
            r13.m14564(r14, r0)
            Yue.ۥ۟ۧ۟۠ r14 = r12.f4857
            Yue.ۥۣۣۢ۟ r14 = r14.f4740
            int r0 = r12.f4872
            r13.m14564(r14, r0)
            goto L6d
        L5b:
            Yue.ۥ۟ۧ۟۠ r14 = r12.f4854
            Yue.ۥۣۣۢ۟ r14 = r14.f4740
            int r0 = r12.f4871
            r13.m14564(r14, r0)
            Yue.ۥ۟ۧ۟۠ r14 = r12.f4856
            Yue.ۥۣۣۢ۟ r14 = r14.f4740
            int r0 = r12.f4871
            r13.m14564(r14, r0)
        L6d:
            return
        L6e:
            r0 = r1
        L6f:
            int r6 = r12.f9724
            if (r0 >= r6) goto Lbc
            Yue.ۥ۟ۧ۟ۢ[] r6 = r12.f9723
            r6 = r6[r0]
            boolean r7 = r12.f1988
            if (r7 != 0) goto L82
            boolean r7 = r6.mo4465()
            if (r7 != 0) goto L82
            goto Lb9
        L82:
            int r7 = r12.f1987
            if (r7 == 0) goto L88
            if (r7 != r3) goto L9e
        L88:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r7 = r6.m7516()
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r8 = Yue.C1517.EnumC1519.f4913
            if (r7 != r8) goto L9e
            Yue.ۥ۟ۧ۟۠ r7 = r6.f4854
            Yue.ۥ۟ۧ۟۠ r7 = r7.f4737
            if (r7 == 0) goto L9e
            Yue.ۥ۟ۧ۟۠ r7 = r6.f4856
            Yue.ۥ۟ۧ۟۠ r7 = r7.f4737
            if (r7 == 0) goto L9e
        L9c:
            r0 = r3
            goto Lbd
        L9e:
            int r7 = r12.f1987
            if (r7 == r2) goto La4
            if (r7 != r4) goto Lb9
        La4:
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r7 = r6.m7541()
            Yue.ۥ۟ۧ۟ۢ$ۥ۟ r8 = Yue.C1517.EnumC1519.f4913
            if (r7 != r8) goto Lb9
            Yue.ۥ۟ۧ۟۠ r7 = r6.f4855
            Yue.ۥ۟ۧ۟۠ r7 = r7.f4737
            if (r7 == 0) goto Lb9
            Yue.ۥ۟ۧ۟۠ r6 = r6.f4857
            Yue.ۥ۟ۧ۟۠ r6 = r6.f4737
            if (r6 == 0) goto Lb9
            goto L9c
        Lb9:
            int r0 = r0 + 1
            goto L6f
        Lbc:
            r0 = r1
        Lbd:
            Yue.ۥ۟ۧ۟۠ r6 = r12.f4854
            boolean r6 = r6.m7418()
            if (r6 != 0) goto Ld0
            Yue.ۥ۟ۧ۟۠ r6 = r12.f4856
            boolean r6 = r6.m7418()
            if (r6 == 0) goto Lce
            goto Ld0
        Lce:
            r6 = r1
            goto Ld1
        Ld0:
            r6 = r3
        Ld1:
            Yue.ۥ۟ۧ۟۠ r7 = r12.f4855
            boolean r7 = r7.m7418()
            if (r7 != 0) goto Le4
            Yue.ۥ۟ۧ۟۠ r7 = r12.f4857
            boolean r7 = r7.m7418()
            if (r7 == 0) goto Le2
            goto Le4
        Le2:
            r7 = r1
            goto Le5
        Le4:
            r7 = r3
        Le5:
            if (r0 != 0) goto Lfb
            int r8 = r12.f1987
            if (r8 != 0) goto Led
            if (r6 != 0) goto Lf9
        Led:
            if (r8 != r2) goto Lf1
            if (r7 != 0) goto Lf9
        Lf1:
            if (r8 != r3) goto Lf5
            if (r6 != 0) goto Lf9
        Lf5:
            if (r8 != r4) goto Lfb
            if (r7 == 0) goto Lfb
        Lf9:
            r6 = r3
            goto Lfc
        Lfb:
            r6 = r1
        Lfc:
            if (r6 != 0) goto L100
            r6 = r5
            goto L101
        L100:
            r6 = 5
        L101:
            r7 = r1
        L102:
            int r8 = r12.f9724
            if (r7 >= r8) goto L154
            Yue.ۥ۟ۧ۟ۢ[] r8 = r12.f9723
            r8 = r8[r7]
            boolean r9 = r12.f1988
            if (r9 != 0) goto L115
            boolean r9 = r8.mo4465()
            if (r9 != 0) goto L115
            goto L151
        L115:
            Yue.ۥ۟ۧ۟۠[] r9 = r8.f4862
            int r10 = r12.f1987
            r9 = r9[r10]
            Yue.ۥۣۣۢ۟ r9 = r13.m14579(r9)
            Yue.ۥ۟ۧ۟۠[] r8 = r8.f4862
            int r10 = r12.f1987
            r8 = r8[r10]
            r8.f4740 = r9
            Yue.ۥ۟ۧ۟۠ r11 = r8.f4737
            if (r11 == 0) goto L132
            Yue.ۥ۟ۧ۟ۢ r11 = r11.f4735
            if (r11 != r12) goto L132
            int r8 = r8.f4738
            goto L133
        L132:
            r8 = r1
        L133:
            if (r10 == 0) goto L141
            if (r10 != r2) goto L138
            goto L141
        L138:
            Yue.ۥۣۣۢ۟ r10 = r14.f4740
            int r11 = r12.f1989
            int r11 = r11 + r8
            r13.m14566(r10, r9, r11, r0)
            goto L149
        L141:
            Yue.ۥۣۣۢ۟ r10 = r14.f4740
            int r11 = r12.f1989
            int r11 = r11 - r8
            r13.m14568(r10, r9, r11, r0)
        L149:
            Yue.ۥۣۣۢ۟ r10 = r14.f4740
            int r11 = r12.f1989
            int r11 = r11 + r8
            r13.m14563(r10, r9, r11, r6)
        L151:
            int r7 = r7 + 1
            goto L102
        L154:
            int r14 = r12.f1987
            r0 = 8
            if (r14 != 0) goto L181
            Yue.ۥ۟ۧ۟۠ r14 = r12.f4856
            Yue.ۥۣۣۢ۟ r14 = r14.f4740
            Yue.ۥ۟ۧ۟۠ r2 = r12.f4854
            Yue.ۥۣۣۢ۟ r2 = r2.f4740
            r13.m14563(r14, r2, r1, r0)
            Yue.ۥ۟ۧ۟۠ r14 = r12.f4854
            Yue.ۥۣۣۢ۟ r14 = r14.f4740
            Yue.ۥ۟ۧ۟ۢ r0 = r12.f4866
            Yue.ۥ۟ۧ۟۠ r0 = r0.f4856
            Yue.ۥۣۣۢ۟ r0 = r0.f4740
            r13.m14563(r14, r0, r1, r5)
            Yue.ۥ۟ۧ۟۠ r14 = r12.f4854
            Yue.ۥۣۣۢ۟ r14 = r14.f4740
            Yue.ۥ۟ۧ۟ۢ r0 = r12.f4866
            Yue.ۥ۟ۧ۟۠ r0 = r0.f4854
            Yue.ۥۣۣۢ۟ r0 = r0.f4740
            r13.m14563(r14, r0, r1, r1)
            goto L1f8
        L181:
            if (r14 != r3) goto L1a9
            Yue.ۥ۟ۧ۟۠ r14 = r12.f4854
            Yue.ۥۣۣۢ۟ r14 = r14.f4740
            Yue.ۥ۟ۧ۟۠ r2 = r12.f4856
            Yue.ۥۣۣۢ۟ r2 = r2.f4740
            r13.m14563(r14, r2, r1, r0)
            Yue.ۥ۟ۧ۟۠ r14 = r12.f4854
            Yue.ۥۣۣۢ۟ r14 = r14.f4740
            Yue.ۥ۟ۧ۟ۢ r0 = r12.f4866
            Yue.ۥ۟ۧ۟۠ r0 = r0.f4854
            Yue.ۥۣۣۢ۟ r0 = r0.f4740
            r13.m14563(r14, r0, r1, r5)
            Yue.ۥ۟ۧ۟۠ r14 = r12.f4854
            Yue.ۥۣۣۢ۟ r14 = r14.f4740
            Yue.ۥ۟ۧ۟ۢ r0 = r12.f4866
            Yue.ۥ۟ۧ۟۠ r0 = r0.f4856
            Yue.ۥۣۣۢ۟ r0 = r0.f4740
            r13.m14563(r14, r0, r1, r1)
            goto L1f8
        L1a9:
            if (r14 != r2) goto L1d1
            Yue.ۥ۟ۧ۟۠ r14 = r12.f4857
            Yue.ۥۣۣۢ۟ r14 = r14.f4740
            Yue.ۥ۟ۧ۟۠ r2 = r12.f4855
            Yue.ۥۣۣۢ۟ r2 = r2.f4740
            r13.m14563(r14, r2, r1, r0)
            Yue.ۥ۟ۧ۟۠ r14 = r12.f4855
            Yue.ۥۣۣۢ۟ r14 = r14.f4740
            Yue.ۥ۟ۧ۟ۢ r0 = r12.f4866
            Yue.ۥ۟ۧ۟۠ r0 = r0.f4857
            Yue.ۥۣۣۢ۟ r0 = r0.f4740
            r13.m14563(r14, r0, r1, r5)
            Yue.ۥ۟ۧ۟۠ r14 = r12.f4855
            Yue.ۥۣۣۢ۟ r14 = r14.f4740
            Yue.ۥ۟ۧ۟ۢ r0 = r12.f4866
            Yue.ۥ۟ۧ۟۠ r0 = r0.f4855
            Yue.ۥۣۣۢ۟ r0 = r0.f4740
            r13.m14563(r14, r0, r1, r1)
            goto L1f8
        L1d1:
            if (r14 != r4) goto L1f8
            Yue.ۥ۟ۧ۟۠ r14 = r12.f4855
            Yue.ۥۣۣۢ۟ r14 = r14.f4740
            Yue.ۥ۟ۧ۟۠ r2 = r12.f4857
            Yue.ۥۣۣۢ۟ r2 = r2.f4740
            r13.m14563(r14, r2, r1, r0)
            Yue.ۥ۟ۧ۟۠ r14 = r12.f4855
            Yue.ۥۣۣۢ۟ r14 = r14.f4740
            Yue.ۥ۟ۧ۟ۢ r0 = r12.f4866
            Yue.ۥ۟ۧ۟۠ r0 = r0.f4855
            Yue.ۥۣۣۢ۟ r0 = r0.f4740
            r13.m14563(r14, r0, r1, r5)
            Yue.ۥ۟ۧ۟۠ r14 = r12.f4855
            Yue.ۥۣۣۢ۟ r14 = r14.f4740
            Yue.ۥ۟ۧ۟ۢ r0 = r12.f4866
            Yue.ۥ۟ۧ۟۠ r0 = r0.f4857
            Yue.ۥۣۣۢ۟ r0 = r0.f4740
            r13.m14563(r14, r0, r1, r1)
        L1f8:
            return
    }

    @Override // Yue.C1517
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean mo4465() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // Yue.C3025, Yue.C1517
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void mo4466(Yue.C1517 r1, java.util.HashMap<Yue.C1517, Yue.C1517> r2) {
            r0 = this;
            super.mo4466(r1, r2)
            Yue.ۥ۟ۢۤۧ r1 = (Yue.C0721) r1
            int r2 = r1.f1987
            r0.f1987 = r2
            boolean r2 = r1.f1988
            r0.f1988 = r2
            int r1 = r1.f1989
            r0.f1989 = r1
            return
    }

    @Override // Yue.C1517
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public boolean mo4467() {
            r1 = this;
            boolean r0 = r1.f1990
            return r0
    }

    @Override // Yue.C1517
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public boolean mo4468() {
            r1 = this;
            boolean r0 = r1.f1990
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۨ, reason: contains not printable characters */
    public boolean m4469() {
            r8 = this;
            r0 = 1
            r1 = 0
            r3 = r0
            r2 = r1
        L4:
            int r4 = r8.f9724
            r5 = 3
            r6 = 2
            if (r2 >= r4) goto L37
            Yue.ۥ۟ۧ۟ۢ[] r4 = r8.f9723
            r4 = r4[r2]
            boolean r7 = r8.f1988
            if (r7 != 0) goto L19
            boolean r7 = r4.mo4465()
            if (r7 != 0) goto L19
            goto L34
        L19:
            int r7 = r8.f1987
            if (r7 == 0) goto L1f
            if (r7 != r0) goto L27
        L1f:
            boolean r7 = r4.mo4467()
            if (r7 != 0) goto L27
        L25:
            r3 = r1
            goto L34
        L27:
            int r7 = r8.f1987
            if (r7 == r6) goto L2d
            if (r7 != r5) goto L34
        L2d:
            boolean r4 = r4.mo4468()
            if (r4 != 0) goto L34
            goto L25
        L34:
            int r2 = r2 + 1
            goto L4
        L37:
            if (r3 == 0) goto Le6
            if (r4 <= 0) goto Le6
            r2 = r1
            r3 = r2
        L3d:
            int r4 = r8.f9724
            if (r1 >= r4) goto Ld2
            Yue.ۥ۟ۧ۟ۢ[] r4 = r8.f9723
            r4 = r4[r1]
            boolean r7 = r8.f1988
            if (r7 != 0) goto L51
            boolean r7 = r4.mo4465()
            if (r7 != 0) goto L51
            goto Lce
        L51:
            if (r3 != 0) goto L89
            int r3 = r8.f1987
            if (r3 != 0) goto L62
            Yue.ۥ۟ۧ۟۠$ۥ۟ r2 = Yue.C1510.EnumC1512.f4743
            Yue.ۥ۟ۧ۟۠ r2 = r4.mo7500(r2)
            int r2 = r2.m7411()
            goto L88
        L62:
            if (r3 != r0) goto L6f
            Yue.ۥ۟ۧ۟۠$ۥ۟ r2 = Yue.C1510.EnumC1512.f4745
            Yue.ۥ۟ۧ۟۠ r2 = r4.mo7500(r2)
            int r2 = r2.m7411()
            goto L88
        L6f:
            if (r3 != r6) goto L7c
            Yue.ۥ۟ۧ۟۠$ۥ۟ r2 = Yue.C1510.EnumC1512.f4744
            Yue.ۥ۟ۧ۟۠ r2 = r4.mo7500(r2)
            int r2 = r2.m7411()
            goto L88
        L7c:
            if (r3 != r5) goto L88
            Yue.ۥ۟ۧ۟۠$ۥ۟ r2 = Yue.C1510.EnumC1512.f4746
            Yue.ۥ۟ۧ۟۠ r2 = r4.mo7500(r2)
            int r2 = r2.m7411()
        L88:
            r3 = r0
        L89:
            int r7 = r8.f1987
            if (r7 != 0) goto L9c
            Yue.ۥ۟ۧ۟۠$ۥ۟ r7 = Yue.C1510.EnumC1512.f4743
            Yue.ۥ۟ۧ۟۠ r4 = r4.mo7500(r7)
            int r4 = r4.m7411()
            int r2 = java.lang.Math.min(r2, r4)
            goto Lce
        L9c:
            if (r7 != r0) goto Lad
            Yue.ۥ۟ۧ۟۠$ۥ۟ r7 = Yue.C1510.EnumC1512.f4745
            Yue.ۥ۟ۧ۟۠ r4 = r4.mo7500(r7)
            int r4 = r4.m7411()
            int r2 = java.lang.Math.max(r2, r4)
            goto Lce
        Lad:
            if (r7 != r6) goto Lbe
            Yue.ۥ۟ۧ۟۠$ۥ۟ r7 = Yue.C1510.EnumC1512.f4744
            Yue.ۥ۟ۧ۟۠ r4 = r4.mo7500(r7)
            int r4 = r4.m7411()
            int r2 = java.lang.Math.min(r2, r4)
            goto Lce
        Lbe:
            if (r7 != r5) goto Lce
            Yue.ۥ۟ۧ۟۠$ۥ۟ r7 = Yue.C1510.EnumC1512.f4746
            Yue.ۥ۟ۧ۟۠ r4 = r4.mo7500(r7)
            int r4 = r4.m7411()
            int r2 = java.lang.Math.max(r2, r4)
        Lce:
            int r1 = r1 + 1
            goto L3d
        Ld2:
            int r1 = r8.f1989
            int r2 = r2 + r1
            int r1 = r8.f1987
            if (r1 == 0) goto Le0
            if (r1 != r0) goto Ldc
            goto Le0
        Ldc:
            r8.m7583(r2, r2)
            goto Le3
        Le0:
            r8.m7580(r2, r2)
        Le3:
            r8.f1990 = r0
            return r0
        Le6:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ, reason: contains not printable characters */
    public boolean m4470() {
            r1 = this;
            boolean r0 = r1.f1988
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۟, reason: contains not printable characters */
    public int m4471() {
            r1 = this;
            int r0 = r1.f1987
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۠, reason: contains not printable characters */
    public int m4472() {
            r1 = this;
            int r0 = r1.f1989
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۡ, reason: contains not printable characters */
    public int m4473() {
            r3 = this;
            int r0 = r3.f1987
            if (r0 == 0) goto L10
            r1 = 1
            if (r0 == r1) goto L10
            r2 = 2
            if (r0 == r2) goto Lf
            r2 = 3
            if (r0 == r2) goto Lf
            r0 = -1
            return r0
        Lf:
            return r1
        L10:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۢ, reason: contains not printable characters */
    public void m4474() {
            r6 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.f9724
            if (r1 >= r2) goto L22
            Yue.ۥ۟ۧ۟ۢ[] r2 = r6.f9723
            r2 = r2[r1]
            int r3 = r6.f1987
            r4 = 1
            if (r3 == 0) goto L1c
            if (r3 != r4) goto L12
            goto L1c
        L12:
            r5 = 2
            if (r3 == r5) goto L18
            r5 = 3
            if (r3 != r5) goto L1f
        L18:
            r2.m7596(r4, r4)
            goto L1f
        L1c:
            r2.m7596(r0, r4)
        L1f:
            int r1 = r1 + 1
            goto L2
        L22:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public void m4475(boolean r1) {
            r0 = this;
            r0.f1988 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۤ, reason: contains not printable characters */
    public void m4476(int r1) {
            r0 = this;
            r0.f1987 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۥ, reason: contains not printable characters */
    public void m4477(int r1) {
            r0 = this;
            r0.f1989 = r1
            return
    }
}
