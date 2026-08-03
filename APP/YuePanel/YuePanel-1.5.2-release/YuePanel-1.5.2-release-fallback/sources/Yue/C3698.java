package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3698 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final Yue.C3698 f11819 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.InterfaceC3703 f11820;

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۦۥ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C3699 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final java.util.Locale[] f11821 = null;

        static {
                java.util.Locale r0 = new java.util.Locale
                java.lang.String r1 = "en"
                java.lang.String r2 = "XA"
                r0.<init>(r1, r2)
                java.util.Locale r1 = new java.util.Locale
                java.lang.String r2 = "ar"
                java.lang.String r3 = "XB"
                r1.<init>(r2, r3)
                java.util.Locale[] r0 = new java.util.Locale[]{r0, r1}
                Yue.C3698.C3699.f11821 = r0
                return
        }

        public C3699() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.util.Locale m14910(java.lang.String r0) {
                java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static boolean m14911(java.util.Locale r5) {
                java.util.Locale[] r0 = Yue.C3698.C3699.f11821
                int r1 = r0.length
                r2 = 0
                r3 = r2
            L5:
                if (r3 >= r1) goto L14
                r4 = r0[r3]
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L11
                r5 = 1
                return r5
            L11:
                int r3 = r3 + 1
                goto L5
            L14:
                return r2
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m14912(@Yue.InterfaceC4410 java.util.Locale r4, @Yue.InterfaceC4410 java.util.Locale r5) {
                boolean r0 = r4.equals(r5)
                r1 = 1
                if (r0 == 0) goto L8
                return r1
            L8:
                java.lang.String r0 = r4.getLanguage()
                java.lang.String r2 = r5.getLanguage()
                boolean r0 = r0.equals(r2)
                r2 = 0
                if (r0 != 0) goto L18
                return r2
            L18:
                boolean r0 = m14911(r4)
                if (r0 != 0) goto L4f
                boolean r0 = m14911(r5)
                if (r0 == 0) goto L25
                goto L4f
            L25:
                java.lang.String r0 = Yue.C3180.m13583(r4)
                boolean r3 = r0.isEmpty()
                if (r3 == 0) goto L46
                java.lang.String r4 = r4.getCountry()
                boolean r0 = r4.isEmpty()
                if (r0 != 0) goto L45
                java.lang.String r5 = r5.getCountry()
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L44
                goto L45
            L44:
                r1 = r2
            L45:
                return r1
            L46:
                java.lang.String r4 = Yue.C3180.m13583(r5)
                boolean r4 = r0.equals(r4)
                return r4
            L4f:
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۦۥ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C3700 {
        public C3700() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.os.LocaleList m14913(java.util.Locale... r1) {
                android.os.LocaleList r0 = new android.os.LocaleList
                r0.<init>(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.os.LocaleList m14914() {
                android.os.LocaleList r0 = android.os.LocaleList.getAdjustedDefault()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static android.os.LocaleList m14915() {
                android.os.LocaleList r0 = android.os.LocaleList.getDefault()
                return r0
        }
    }

    static {
            r0 = 0
            java.util.Locale[] r0 = new java.util.Locale[r0]
            Yue.ۥ۠ۧۦۥ r0 = m14894(r0)
            Yue.C3698.f11819 = r0
            return
    }

    public C3698(Yue.InterfaceC3703 r1) {
            r0 = this;
            r0.<init>()
            r0.f11820 = r1
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Yue.C3698 m14894(@Yue.InterfaceC4410 java.util.Locale... r0) {
            android.os.LocaleList r0 = Yue.C3698.C3700.m14913(r0)
            Yue.ۥ۠ۧۦۥ r0 = m14901(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.util.Locale m14895(java.lang.String r6) {
            java.lang.String r0 = "-"
            boolean r1 = r6.contains(r0)
            r2 = -1
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L37
            java.lang.String[] r0 = r6.split(r0, r2)
            int r1 = r0.length
            if (r1 <= r3) goto L1f
            java.util.Locale r6 = new java.util.Locale
            r1 = r0[r4]
            r2 = r0[r5]
            r0 = r0[r3]
            r6.<init>(r1, r2, r0)
            return r6
        L1f:
            int r1 = r0.length
            if (r1 <= r5) goto L2c
            java.util.Locale r6 = new java.util.Locale
            r1 = r0[r4]
            r0 = r0[r5]
            r6.<init>(r1, r0)
            return r6
        L2c:
            int r1 = r0.length
            if (r1 != r5) goto L6a
            java.util.Locale r6 = new java.util.Locale
            r0 = r0[r4]
            r6.<init>(r0)
            return r6
        L37:
            java.lang.String r0 = "_"
            boolean r1 = r6.contains(r0)
            if (r1 == 0) goto L86
            java.lang.String[] r0 = r6.split(r0, r2)
            int r1 = r0.length
            if (r1 <= r3) goto L52
            java.util.Locale r6 = new java.util.Locale
            r1 = r0[r4]
            r2 = r0[r5]
            r0 = r0[r3]
            r6.<init>(r1, r2, r0)
            return r6
        L52:
            int r1 = r0.length
            if (r1 <= r5) goto L5f
            java.util.Locale r6 = new java.util.Locale
            r1 = r0[r4]
            r0 = r0[r5]
            r6.<init>(r1, r0)
            return r6
        L5f:
            int r1 = r0.length
            if (r1 != r5) goto L6a
            java.util.Locale r6 = new java.util.Locale
            r0 = r0[r4]
            r6.<init>(r0)
            return r6
        L6a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can not parse language tag: ["
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = "]"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L86:
            java.util.Locale r0 = new java.util.Locale
            r0.<init>(r6)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Yue.C3698 m14896(@Yue.InterfaceC4544 java.lang.String r4) {
            if (r4 == 0) goto L26
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            goto L26
        L9:
            java.lang.String r0 = ","
            r1 = -1
            java.lang.String[] r4 = r4.split(r0, r1)
            int r0 = r4.length
            java.util.Locale[] r1 = new java.util.Locale[r0]
            r2 = 0
        L14:
            if (r2 >= r0) goto L21
            r3 = r4[r2]
            java.util.Locale r3 = Yue.C3698.C3699.m14910(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L14
        L21:
            Yue.ۥ۠ۧۦۥ r4 = m14894(r1)
            return r4
        L26:
            Yue.ۥ۠ۧۦۥ r4 = m14899()
            return r4
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5795(min = 1)
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Yue.C3698 m14897() {
            android.os.LocaleList r0 = Yue.C3698.C3700.m14914()
            Yue.ۥ۠ۧۦۥ r0 = m14901(r0)
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5795(min = 1)
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Yue.C3698 m14898() {
            android.os.LocaleList r0 = Yue.C3698.C3700.m14915()
            Yue.ۥ۠ۧۦۥ r0 = m14901(r0)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static Yue.C3698 m14899() {
            Yue.ۥ۠ۧۦۥ r0 = Yue.C3698.f11819
            return r0
    }

    @Yue.InterfaceC5336(21)
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static boolean m14900(@Yue.InterfaceC4410 java.util.Locale r2, @Yue.InterfaceC4410 java.util.Locale r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Lb
            boolean r2 = Yue.C3697.m14893(r2, r3)
            return r2
        Lb:
            boolean r2 = Yue.C3698.C3699.m14912(r2, r3)
            return r2
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(24)
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static Yue.C3698 m14901(@Yue.InterfaceC4410 android.os.LocaleList r2) {
            Yue.ۥ۠ۧۦۥ r0 = new Yue.ۥ۠ۧۦۥ
            Yue.ۥ۠ۧۦۨ r1 = new Yue.ۥ۠ۧۦۨ
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC5336(24)
    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static Yue.C3698 m14902(java.lang.Object r0) {
            android.os.LocaleList r0 = (android.os.LocaleList) r0
            Yue.ۥ۠ۧۦۥ r0 = m14901(r0)
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof Yue.C3698
            if (r0 == 0) goto L12
            Yue.ۥ۠ۧۦۧ r0 = r1.f11820
            Yue.ۥ۠ۧۦۥ r2 = (Yue.C3698) r2
            Yue.ۥ۠ۧۦۧ r2 = r2.f11820
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    public int hashCode() {
            r1 = this;
            Yue.ۥ۠ۧۦۧ r0 = r1.f11820
            int r0 = r0.hashCode()
            return r0
    }

    @Yue.InterfaceC4410
    public java.lang.String toString() {
            r1 = this;
            Yue.ۥ۠ۧۦۧ r0 = r1.f11820
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.util.Locale m14903(int r2) {
            r1 = this;
            Yue.ۥ۠ۧۦۧ r0 = r1.f11820
            java.util.Locale r2 = r0.get(r2)
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public java.util.Locale m14904(@Yue.InterfaceC4410 java.lang.String[] r2) {
            r1 = this;
            Yue.ۥ۠ۧۦۧ r0 = r1.f11820
            java.util.Locale r2 = r0.mo14923(r2)
            return r2
    }

    @Yue.InterfaceC3281(from = -1)
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int m14905(@Yue.InterfaceC4544 java.util.Locale r2) {
            r1 = this;
            Yue.ۥ۠ۧۦۧ r0 = r1.f11820
            int r2 = r0.mo14920(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean m14906() {
            r1 = this;
            Yue.ۥ۠ۧۦۧ r0 = r1.f11820
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Yue.InterfaceC3281(from = 0)
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m14907() {
            r1 = this;
            Yue.ۥ۠ۧۦۧ r0 = r1.f11820
            int r0 = r0.size()
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public java.lang.String m14908() {
            r1 = this;
            Yue.ۥ۠ۧۦۧ r0 = r1.f11820
            java.lang.String r0 = r0.mo14921()
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public java.lang.Object m14909() {
            r1 = this;
            Yue.ۥ۠ۧۦۧ r0 = r1.f11820
            java.lang.Object r0 = r0.mo14922()
            return r0
    }
}
