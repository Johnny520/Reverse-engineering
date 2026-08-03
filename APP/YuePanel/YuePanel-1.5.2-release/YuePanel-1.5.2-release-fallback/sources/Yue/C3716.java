package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(21)
public final class C3716 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f11829 = "ۥ۠ۧۧۦ";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String[] f11830 = null;

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ$ۥ, reason: contains not printable characters */
    public static /* synthetic */ class C3717 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ int[] f11831 = null;

        static {
                android.icu.text.DateFormat$HourCycle[] r0 = Yue.C3710.m14939()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Yue.C3716.C3717.f11831 = r0
                android.icu.text.DateFormat$HourCycle r1 = Yue.C3711.m14940()     // Catch: java.lang.NoSuchFieldError -> L14
                int r1 = Yue.C3712.m14941(r1)     // Catch: java.lang.NoSuchFieldError -> L14
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L14
            L14:
                int[] r0 = Yue.C3716.C3717.f11831     // Catch: java.lang.NoSuchFieldError -> L21
                android.icu.text.DateFormat$HourCycle r1 = Yue.C3713.m14942()     // Catch: java.lang.NoSuchFieldError -> L21
                int r1 = Yue.C3712.m14941(r1)     // Catch: java.lang.NoSuchFieldError -> L21
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L21
            L21:
                int[] r0 = Yue.C3716.C3717.f11831     // Catch: java.lang.NoSuchFieldError -> L2e
                android.icu.text.DateFormat$HourCycle r1 = Yue.C3714.m14943()     // Catch: java.lang.NoSuchFieldError -> L2e
                int r1 = Yue.C3712.m14941(r1)     // Catch: java.lang.NoSuchFieldError -> L2e
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2e
            L2e:
                int[] r0 = Yue.C3716.C3717.f11831     // Catch: java.lang.NoSuchFieldError -> L3b
                android.icu.text.DateFormat$HourCycle r1 = Yue.C3715.m14944()     // Catch: java.lang.NoSuchFieldError -> L3b
                int r1 = Yue.C3712.m14941(r1)     // Catch: java.lang.NoSuchFieldError -> L3b
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3b
            L3b:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C3718 {
        public C3718() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.lang.String m14967(@Yue.InterfaceC4410 java.util.Locale r0) {
                android.icu.util.Calendar r0 = android.icu.util.Calendar.getInstance(r0)
                java.lang.String r0 = r0.getType()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static java.util.Locale m14968() {
                java.util.Locale$Category r0 = java.util.Locale.Category.FORMAT
                java.util.Locale r0 = java.util.Locale.getDefault(r0)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(33)
    public static class C3719 {
        public C3719() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.lang.String m14969(@Yue.InterfaceC4410 java.util.Locale r0) {
                android.icu.text.DateTimePatternGenerator r0 = android.icu.text.DateTimePatternGenerator.getInstance(r0)
                android.icu.text.DateFormat$HourCycle r0 = r0.getDefaultHourCycle()
                java.lang.String r0 = m14970(r0)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static java.lang.String m14970(android.icu.text.DateFormat.HourCycle r1) {
                int[] r0 = Yue.C3716.C3717.f11831
                int r1 = r1.ordinal()
                r1 = r0[r1]
                r0 = 1
                if (r1 == r0) goto L20
                r0 = 2
                if (r1 == r0) goto L1d
                r0 = 3
                if (r1 == r0) goto L1a
                r0 = 4
                if (r1 == r0) goto L17
                java.lang.String r1 = ""
                return r1
            L17:
                java.lang.String r1 = "h24"
                return r1
            L1a:
                java.lang.String r1 = "h23"
                return r1
            L1d:
                java.lang.String r1 = "h12"
                return r1
            L20:
                java.lang.String r1 = "h11"
                return r1
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static java.lang.String m14971(@Yue.InterfaceC4410 java.util.Locale r2) {
                android.icu.number.UnlocalizedNumberFormatter r0 = android.icu.number.NumberFormatter.with()
                java.lang.String r1 = "weather"
                android.icu.number.NumberFormatterSettings r0 = r0.usage(r1)
                android.icu.number.UnlocalizedNumberFormatter r0 = (android.icu.number.UnlocalizedNumberFormatter) r0
                android.icu.util.MeasureUnit r1 = android.icu.util.MeasureUnit.CELSIUS
                android.icu.number.NumberFormatterSettings r0 = r0.unit(r1)
                android.icu.number.UnlocalizedNumberFormatter r0 = (android.icu.number.UnlocalizedNumberFormatter) r0
                android.icu.number.LocalizedNumberFormatter r2 = r0.locale(r2)
                r0 = 1
                android.icu.number.FormattedNumber r2 = r2.format(r0)
                android.icu.util.MeasureUnit r2 = r2.getOutputUnit()
                java.lang.String r2 = r2.getIdentifier()
                java.lang.String r0 = "fahrenhe"
                boolean r1 = r2.startsWith(r0)
                if (r1 == 0) goto L2f
                return r0
            L2f:
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C3720 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final java.lang.String f11832 = "ca";

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static final java.lang.String f11833 = "chinese";

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final java.lang.String f11834 = "dangi";

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final java.lang.String f11835 = "gregorian";

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final java.lang.String f11836 = "hebrew";

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final java.lang.String f11837 = "indian";

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final java.lang.String f11838 = "islamic";

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final java.lang.String f11839 = "islamic-civil";

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final java.lang.String f11840 = "islamic-rgsa";

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final java.lang.String f11841 = "islamic-tbla";

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static final java.lang.String f11842 = "islamic-umalqura";

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static final java.lang.String f11843 = "persian";

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static final java.lang.String f11844 = "";

        /* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ$ۥ۟۟۟$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface InterfaceC3721 {
        }

        public C3720() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C3722 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final java.lang.String f11845 = "fw";

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static final java.lang.String f11846 = "sun";

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final java.lang.String f11847 = "mon";

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final java.lang.String f11848 = "tue";

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final java.lang.String f11849 = "wed";

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final java.lang.String f11850 = "thu";

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final java.lang.String f11851 = "fri";

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final java.lang.String f11852 = "sat";

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final java.lang.String f11853 = "";

        /* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ$ۥ۟۟۟۟$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface InterfaceC3723 {
        }

        public C3722() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static class C3724 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final java.lang.String f11854 = "hc";

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static final java.lang.String f11855 = "h11";

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final java.lang.String f11856 = "h12";

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final java.lang.String f11857 = "h23";

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final java.lang.String f11858 = "h24";

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final java.lang.String f11859 = "";

        /* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ$ۥ۟۟۟۠$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface InterfaceC3725 {
        }

        public C3724() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C3726 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final java.lang.String f11860 = "mu";

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static final java.lang.String f11861 = "celsius";

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final java.lang.String f11862 = "fahrenhe";

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final java.lang.String f11863 = "kelvin";

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final java.lang.String f11864 = "";

        /* JADX INFO: renamed from: Yue.ۥ۠ۧۧۦ$ۥ۟۟۟ۡ$ۥ, reason: contains not printable characters */
        @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface InterfaceC3727 {
        }

        public C3726() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.lang.String r4 = "PW"
            java.lang.String r5 = "US"
            java.lang.String r0 = "BS"
            java.lang.String r1 = "BZ"
            java.lang.String r2 = "KY"
            java.lang.String r3 = "PR"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            Yue.C3716.f11830 = r0
            return
    }

    public C3716() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.String m14945(@Yue.InterfaceC4410 java.util.Locale r0) {
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
            int r0 = r0.getFirstDayOfWeek()
            java.lang.String r0 = m14960(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.String m14946(@Yue.InterfaceC4410 java.util.Locale r1) {
            java.lang.String r0 = "jm"
            java.lang.String r1 = android.text.format.DateFormat.getBestDateTimePattern(r1, r0)
            java.lang.String r0 = "H"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L11
            java.lang.String r1 = "h23"
            goto L13
        L11:
            java.lang.String r1 = "h12"
        L13:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.lang.String m14947() {
            r0 = 1
            java.lang.String r0 = m14950(r0)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.lang.String m14948(@Yue.InterfaceC4410 java.util.Locale r1) {
            r0 = 1
            java.lang.String r1 = m14949(r1, r0)
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static java.lang.String m14949(@Yue.InterfaceC4410 java.util.Locale r2, boolean r3) {
            java.lang.String r0 = "ca"
            java.lang.String r1 = ""
            java.lang.String r3 = m14966(r0, r1, r2, r3)
            if (r3 == 0) goto Lb
            return r3
        Lb:
            java.lang.String r2 = Yue.C3716.C3718.m14967(r2)
            return r2
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static java.lang.String m14950(boolean r1) {
            java.util.Locale r0 = Yue.C3716.C3718.m14968()
            java.lang.String r1 = m14949(r0, r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static java.util.Locale m14951() {
            java.util.Locale r0 = java.util.Locale.getDefault()
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static java.lang.String m14952() {
            r0 = 1
            java.lang.String r0 = m14955(r0)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static java.lang.String m14953(@Yue.InterfaceC4410 java.util.Locale r1) {
            r0 = 1
            java.lang.String r1 = m14954(r1, r0)
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static java.lang.String m14954(@Yue.InterfaceC4410 java.util.Locale r2, boolean r3) {
            java.lang.String r0 = "fw"
            java.lang.String r1 = ""
            java.lang.String r3 = m14966(r0, r1, r2, r3)
            if (r3 == 0) goto Lb
            goto Lf
        Lb:
            java.lang.String r3 = m14945(r2)
        Lf:
            return r3
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static java.lang.String m14955(boolean r1) {
            java.util.Locale r0 = Yue.C3716.C3718.m14968()
            java.lang.String r1 = m14954(r0, r1)
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static java.lang.String m14956() {
            r0 = 1
            java.lang.String r0 = m14959(r0)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static java.lang.String m14957(@Yue.InterfaceC4410 java.util.Locale r1) {
            r0 = 1
            java.lang.String r1 = m14958(r1, r0)
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static java.lang.String m14958(@Yue.InterfaceC4410 java.util.Locale r2, boolean r3) {
            java.lang.String r0 = "hc"
            java.lang.String r1 = ""
            java.lang.String r3 = m14966(r0, r1, r2, r3)
            if (r3 == 0) goto Lb
            return r3
        Lb:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r3 < r0) goto L16
            java.lang.String r2 = Yue.C3716.C3719.m14969(r2)
            return r2
        L16:
            java.lang.String r2 = m14946(r2)
            return r2
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static java.lang.String m14959(boolean r1) {
            java.util.Locale r0 = Yue.C3716.C3718.m14968()
            java.lang.String r1 = m14958(r0, r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static java.lang.String m14960(int r7) {
            java.lang.String r5 = "fri"
            java.lang.String r6 = "sat"
            java.lang.String r0 = "sun"
            java.lang.String r1 = "mon"
            java.lang.String r2 = "tue"
            java.lang.String r3 = "wed"
            java.lang.String r4 = "thu"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6}
            r1 = 1
            if (r7 < r1) goto L1c
            r2 = 7
            if (r7 > r2) goto L1c
            int r7 = r7 - r1
            r7 = r0[r7]
            goto L1e
        L1c:
            java.lang.String r7 = ""
        L1e:
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static java.lang.String m14961(java.util.Locale r1) {
            java.lang.String[] r0 = Yue.C3716.f11830
            java.lang.String r1 = r1.getCountry()
            int r1 = java.util.Arrays.binarySearch(r0, r1)
            if (r1 < 0) goto Lf
            java.lang.String r1 = "fahrenhe"
            goto L11
        Lf:
            java.lang.String r1 = "celsius"
        L11:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static java.lang.String m14962() {
            r0 = 1
            java.lang.String r0 = m14965(r0)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static java.lang.String m14963(@Yue.InterfaceC4410 java.util.Locale r1) {
            r0 = 1
            java.lang.String r1 = m14964(r1, r0)
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static java.lang.String m14964(@Yue.InterfaceC4410 java.util.Locale r2, boolean r3) {
            java.lang.String r0 = "mu"
            java.lang.String r1 = ""
            java.lang.String r3 = m14966(r0, r1, r2, r3)
            if (r3 == 0) goto Lb
            return r3
        Lb:
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r3 < r0) goto L16
            java.lang.String r2 = Yue.C3716.C3719.m14971(r2)
            return r2
        L16:
            java.lang.String r2 = m14961(r2)
            return r2
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static java.lang.String m14965(boolean r1) {
            java.util.Locale r0 = Yue.C3716.C3718.m14968()
            java.lang.String r1 = m14964(r0, r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static java.lang.String m14966(java.lang.String r0, java.lang.String r1, java.util.Locale r2, boolean r3) {
            java.lang.String r0 = r2.getUnicodeLocaleType(r0)
            if (r0 == 0) goto L7
            return r0
        L7:
            if (r3 != 0) goto La
            return r1
        La:
            r0 = 0
            return r0
    }
}
