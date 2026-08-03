package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3776 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final long f11963 = Long.MAX_VALUE;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f11964 = 100;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f11965 = 102;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f11966 = 104;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final long f11967 = -1;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int f11968;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final long f11969;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final long f11970;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final long f11971;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int f11972;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final float f11973;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final long f11974;

    /* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۢ$ۥ, reason: contains not printable characters */
    public static class C3777 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.lang.Class<?> f11975;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static java.lang.reflect.Method f11976;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static java.lang.reflect.Method f11977;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static java.lang.reflect.Method f11978;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static java.lang.reflect.Method f11979;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static java.lang.reflect.Method f11980;

        public C3777() {
                r0 = this;
                r0.<init>()
                return
        }

        @android.annotation.SuppressLint({"BanUncheckedReflection"})
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static java.lang.Object m15130(Yue.C3776 r8, java.lang.String r9) {
                r0 = 0
                java.lang.Class<?> r1 = Yue.C3776.C3777.f11975     // Catch: java.lang.Throwable -> L101
                if (r1 != 0) goto Ld
                java.lang.String r1 = "android.location.LocationRequest"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L101
                Yue.C3776.C3777.f11975 = r1     // Catch: java.lang.Throwable -> L101
            Ld:
                java.lang.reflect.Method r1 = Yue.C3776.C3777.f11976     // Catch: java.lang.Throwable -> L101
                r2 = 1
                if (r1 != 0) goto L2b
                java.lang.Class<?> r1 = Yue.C3776.C3777.f11975     // Catch: java.lang.Throwable -> L101
                java.lang.String r3 = "createFromDeprecatedProvider"
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                java.lang.Class r5 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L101
                java.lang.Class r6 = java.lang.Float.TYPE     // Catch: java.lang.Throwable -> L101
                java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L101
                java.lang.Class[] r4 = new java.lang.Class[]{r4, r5, r6, r7}     // Catch: java.lang.Throwable -> L101
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L101
                Yue.C3776.C3777.f11976 = r1     // Catch: java.lang.Throwable -> L101
                r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L101
            L2b:
                java.lang.reflect.Method r1 = Yue.C3776.C3777.f11976     // Catch: java.lang.Throwable -> L101
                long r3 = r8.m15122()     // Catch: java.lang.Throwable -> L101
                java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L101
                float r4 = r8.m15125()     // Catch: java.lang.Throwable -> L101
                java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch: java.lang.Throwable -> L101
                java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L101
                java.lang.Object[] r9 = new java.lang.Object[]{r9, r3, r4, r5}     // Catch: java.lang.Throwable -> L101
                java.lang.Object r9 = r1.invoke(r0, r9)     // Catch: java.lang.Throwable -> L101
                if (r9 != 0) goto L4a
                return r0
            L4a:
                java.lang.reflect.Method r1 = Yue.C3776.C3777.f11977     // Catch: java.lang.Throwable -> L101
                if (r1 != 0) goto L61
                java.lang.Class<?> r1 = Yue.C3776.C3777.f11975     // Catch: java.lang.Throwable -> L101
                java.lang.String r3 = "setQuality"
                java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L101
                java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L101
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L101
                Yue.C3776.C3777.f11977 = r1     // Catch: java.lang.Throwable -> L101
                r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L101
            L61:
                java.lang.reflect.Method r1 = Yue.C3776.C3777.f11977     // Catch: java.lang.Throwable -> L101
                int r3 = r8.m15127()     // Catch: java.lang.Throwable -> L101
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L101
                java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L101
                r1.invoke(r9, r3)     // Catch: java.lang.Throwable -> L101
                java.lang.reflect.Method r1 = Yue.C3776.C3777.f11978     // Catch: java.lang.Throwable -> L101
                if (r1 != 0) goto L89
                java.lang.Class<?> r1 = Yue.C3776.C3777.f11975     // Catch: java.lang.Throwable -> L101
                java.lang.String r3 = "setFastestInterval"
                java.lang.Class r4 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L101
                java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L101
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L101
                Yue.C3776.C3777.f11978 = r1     // Catch: java.lang.Throwable -> L101
                r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L101
            L89:
                java.lang.reflect.Method r1 = Yue.C3776.C3777.f11978     // Catch: java.lang.Throwable -> L101
                long r3 = r8.m15126()     // Catch: java.lang.Throwable -> L101
                java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> L101
                java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L101
                r1.invoke(r9, r3)     // Catch: java.lang.Throwable -> L101
                int r1 = r8.m15124()     // Catch: java.lang.Throwable -> L101
                r3 = 2147483647(0x7fffffff, float:NaN)
                if (r1 >= r3) goto Lcb
                java.lang.reflect.Method r1 = Yue.C3776.C3777.f11979     // Catch: java.lang.Throwable -> L101
                if (r1 != 0) goto Lba
                java.lang.Class<?> r1 = Yue.C3776.C3777.f11975     // Catch: java.lang.Throwable -> L101
                java.lang.String r3 = "setNumUpdates"
                java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L101
                java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L101
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L101
                Yue.C3776.C3777.f11979 = r1     // Catch: java.lang.Throwable -> L101
                r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L101
            Lba:
                java.lang.reflect.Method r1 = Yue.C3776.C3777.f11979     // Catch: java.lang.Throwable -> L101
                int r3 = r8.m15124()     // Catch: java.lang.Throwable -> L101
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L101
                java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L101
                r1.invoke(r9, r3)     // Catch: java.lang.Throwable -> L101
            Lcb:
                long r3 = r8.m15121()     // Catch: java.lang.Throwable -> L101
                r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L100
                java.lang.reflect.Method r1 = Yue.C3776.C3777.f11980     // Catch: java.lang.Throwable -> L101
                if (r1 != 0) goto Lef
                java.lang.Class<?> r1 = Yue.C3776.C3777.f11975     // Catch: java.lang.Throwable -> L101
                java.lang.String r3 = "setExpireIn"
                java.lang.Class r4 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L101
                java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L101
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L101
                Yue.C3776.C3777.f11980 = r1     // Catch: java.lang.Throwable -> L101
                r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L101
            Lef:
                java.lang.reflect.Method r1 = Yue.C3776.C3777.f11980     // Catch: java.lang.Throwable -> L101
                long r2 = r8.m15121()     // Catch: java.lang.Throwable -> L101
                java.lang.Long r8 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L101
                java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L101
                r1.invoke(r9, r8)     // Catch: java.lang.Throwable -> L101
            L100:
                return r9
            L101:
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۢ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(31)
    public static class C3778 {
        public C3778() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.location.LocationRequest m15131(Yue.C3776 r3) {
                android.location.LocationRequest$Builder r0 = new android.location.LocationRequest$Builder
                long r1 = r3.m15122()
                r0.<init>(r1)
                int r1 = r3.m15127()
                android.location.LocationRequest$Builder r0 = r0.setQuality(r1)
                long r1 = r3.m15126()
                android.location.LocationRequest$Builder r0 = r0.setMinUpdateIntervalMillis(r1)
                long r1 = r3.m15121()
                android.location.LocationRequest$Builder r0 = r0.setDurationMillis(r1)
                int r1 = r3.m15124()
                android.location.LocationRequest$Builder r0 = r0.setMaxUpdates(r1)
                float r1 = r3.m15125()
                android.location.LocationRequest$Builder r0 = r0.setMinUpdateDistanceMeters(r1)
                long r1 = r3.m15123()
                android.location.LocationRequest$Builder r3 = r0.setMaxUpdateDelayMillis(r1)
                android.location.LocationRequest r3 = r3.build()
                return r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۢ$ۥ۟۟, reason: contains not printable characters */
    public static final class C3779 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public long f11981;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f11982;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public long f11983;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f11984;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public long f11985;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public float f11986;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public long f11987;

        public C3779(long r1) {
                r0 = this;
                r0.<init>()
                r0.m15135(r1)
                r1 = 102(0x66, float:1.43E-43)
                r0.f11982 = r1
                r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0.f11983 = r1
                r1 = 2147483647(0x7fffffff, float:NaN)
                r0.f11984 = r1
                r1 = -1
                r0.f11985 = r1
                r1 = 0
                r0.f11986 = r1
                r1 = 0
                r0.f11987 = r1
                return
        }

        public C3779(@Yue.InterfaceC4410 Yue.C3776 r3) {
                r2 = this;
                r2.<init>()
                long r0 = r3.f11969
                r2.f11981 = r0
                int r0 = r3.f11968
                r2.f11982 = r0
                long r0 = r3.f11971
                r2.f11983 = r0
                int r0 = r3.f11972
                r2.f11984 = r0
                long r0 = r3.f11970
                r2.f11985 = r0
                float r0 = r3.f11973
                r2.f11986 = r0
                long r0 = r3.f11974
                r2.f11987 = r0
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public Yue.C3776 m15132() {
                r14 = this;
                long r0 = r14.f11981
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L16
                long r0 = r14.f11985
                r2 = -1
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L14
                goto L16
            L14:
                r0 = 0
                goto L17
            L16:
                r0 = 1
            L17:
                java.lang.String r1 = "passive location requests must have an explicit minimum update interval"
                Yue.C4868.m19184(r0, r1)
                Yue.ۥ۠ۨ۠ۢ r0 = new Yue.ۥ۠ۨ۠ۢ
                long r3 = r14.f11981
                int r5 = r14.f11982
                long r6 = r14.f11983
                int r8 = r14.f11984
                long r1 = r14.f11985
                long r9 = java.lang.Math.min(r1, r3)
                float r11 = r14.f11986
                long r12 = r14.f11987
                r2 = r0
                r2.<init>(r3, r5, r6, r8, r9, r11, r12)
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.C3776.C3779 m15133() {
                r2 = this;
                r0 = -1
                r2.f11985 = r0
                return r2
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Yue.C3776.C3779 m15134(@Yue.InterfaceC3281(from = 1) long r8) {
                r7 = this;
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.lang.String r6 = "durationMillis"
                r2 = 1
                r0 = r8
                long r8 = Yue.C4868.m19177(r0, r2, r4, r6)
                r7.f11983 = r8
                return r7
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Yue.C3776.C3779 m15135(@Yue.InterfaceC3281(from = 0) long r8) {
                r7 = this;
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.lang.String r6 = "intervalMillis"
                r2 = 0
                r0 = r8
                long r8 = Yue.C4868.m19177(r0, r2, r4, r6)
                r7.f11981 = r8
                return r7
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public Yue.C3776.C3779 m15136(@Yue.InterfaceC3281(from = 0) long r8) {
                r7 = this;
                r7.f11987 = r8
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.lang.String r6 = "maxUpdateDelayMillis"
                r2 = 0
                r0 = r8
                long r8 = Yue.C4868.m19177(r0, r2, r4, r6)
                r7.f11987 = r8
                return r7
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public Yue.C3776.C3779 m15137(@Yue.InterfaceC3281(from = 1, to = 2147483647L) int r4) {
                r3 = this;
                r0 = 2147483647(0x7fffffff, float:NaN)
                java.lang.String r1 = "maxUpdates"
                r2 = 1
                int r4 = Yue.C4868.m19176(r4, r2, r0, r1)
                r3.f11984 = r4
                return r3
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public Yue.C3776.C3779 m15138(@Yue.InterfaceC2458(from = 0.0d, to = 3.4028234663852886E38d) float r4) {
                r3 = this;
                r3.f11986 = r4
                r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
                java.lang.String r1 = "minUpdateDistanceMeters"
                r2 = 0
                float r4 = Yue.C4868.m19175(r4, r2, r0, r1)
                r3.f11986 = r4
                return r3
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public Yue.C3776.C3779 m15139(@Yue.InterfaceC3281(from = 0) long r8) {
                r7 = this;
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.lang.String r6 = "minUpdateIntervalMillis"
                r2 = 0
                r0 = r8
                long r8 = Yue.C4868.m19177(r0, r2, r4, r6)
                r7.f11985 = r8
                return r7
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public Yue.C3776.C3779 m15140(int r4) {
                r3 = this;
                r0 = 104(0x68, float:1.46E-43)
                if (r4 == r0) goto Lf
                r0 = 102(0x66, float:1.43E-43)
                if (r4 == r0) goto Lf
                r0 = 100
                if (r4 != r0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                goto L10
            Lf:
                r0 = 1
            L10:
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                java.lang.String r2 = "quality must be a defined QUALITY constant, not %d"
                Yue.C4868.m19172(r0, r2, r1)
                r3.f11982 = r4
                return r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨ۠ۢ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC3780 {
    }

    public C3776(long r1, int r3, long r4, int r6, long r7, float r9, long r10) {
            r0 = this;
            r0.<init>()
            r0.f11969 = r1
            r0.f11968 = r3
            r0.f11970 = r7
            r0.f11971 = r4
            r0.f11972 = r6
            r0.f11973 = r9
            r0.f11974 = r10
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof Yue.C3776
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            Yue.ۥ۠ۨ۠ۢ r8 = (Yue.C3776) r8
            int r1 = r7.f11968
            int r3 = r8.f11968
            if (r1 != r3) goto L43
            long r3 = r7.f11969
            long r5 = r8.f11969
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L43
            long r3 = r7.f11970
            long r5 = r8.f11970
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L43
            long r3 = r7.f11971
            long r5 = r8.f11971
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L43
            int r1 = r7.f11972
            int r3 = r8.f11972
            if (r1 != r3) goto L43
            float r1 = r8.f11973
            float r3 = r7.f11973
            int r1 = java.lang.Float.compare(r1, r3)
            if (r1 != 0) goto L43
            long r3 = r7.f11974
            long r5 = r8.f11974
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            return r0
    }

    public int hashCode() {
            r6 = this;
            int r0 = r6.f11968
            int r0 = r0 * 31
            long r1 = r6.f11969
            r3 = 32
            long r4 = r1 >>> r3
            long r1 = r1 ^ r4
            int r1 = (int) r1
            int r0 = r0 + r1
            int r0 = r0 * 31
            long r1 = r6.f11970
            long r3 = r1 >>> r3
            long r1 = r1 ^ r3
            int r1 = (int) r1
            int r0 = r0 + r1
            return r0
    }

    @Yue.InterfaceC4410
    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Request["
            r0.append(r1)
            long r1 = r5.f11969
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L40
            java.lang.String r1 = "@"
            r0.append(r1)
            long r1 = r5.f11969
            Yue.C6239.m23257(r1, r0)
            int r1 = r5.f11968
            r2 = 100
            if (r1 == r2) goto L3a
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L34
            r2 = 104(0x68, float:1.46E-43)
            if (r1 == r2) goto L2e
            goto L45
        L2e:
            java.lang.String r1 = " LOW_POWER"
            r0.append(r1)
            goto L45
        L34:
            java.lang.String r1 = " BALANCED"
            r0.append(r1)
            goto L45
        L3a:
            java.lang.String r1 = " HIGH_ACCURACY"
            r0.append(r1)
            goto L45
        L40:
            java.lang.String r1 = "PASSIVE"
            r0.append(r1)
        L45:
            long r1 = r5.f11971
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L55
            java.lang.String r1 = ", duration="
            r0.append(r1)
            long r1 = r5.f11971
            Yue.C6239.m23257(r1, r0)
        L55:
            int r1 = r5.f11972
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r2) goto L66
            java.lang.String r1 = ", maxUpdates="
            r0.append(r1)
            int r1 = r5.f11972
            r0.append(r1)
        L66:
            long r1 = r5.f11970
            r3 = -1
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L7e
            long r3 = r5.f11969
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L7e
            java.lang.String r1 = ", minUpdateInterval="
            r0.append(r1)
            long r1 = r5.f11970
            Yue.C6239.m23257(r1, r0)
        L7e:
            float r1 = r5.f11973
            double r1 = (double) r1
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L91
            java.lang.String r1 = ", minUpdateDistance="
            r0.append(r1)
            float r1 = r5.f11973
            r0.append(r1)
        L91:
            long r1 = r5.f11974
            r3 = 2
            long r1 = r1 / r3
            long r3 = r5.f11969
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto La6
            java.lang.String r1 = ", maxUpdateDelay="
            r0.append(r1)
            long r1 = r5.f11974
            Yue.C6239.m23257(r1, r0)
        La6:
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Yue.InterfaceC3281(from = 1)
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public long m15121() {
            r2 = this;
            long r0 = r2.f11971
            return r0
    }

    @Yue.InterfaceC3281(from = 0)
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public long m15122() {
            r2 = this;
            long r0 = r2.f11969
            return r0
    }

    @Yue.InterfaceC3281(from = 0)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public long m15123() {
            r2 = this;
            long r0 = r2.f11974
            return r0
    }

    @Yue.InterfaceC3281(from = 1, to = 2147483647L)
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int m15124() {
            r1 = this;
            int r0 = r1.f11972
            return r0
    }

    @Yue.InterfaceC2458(from = 0.0d, to = 3.4028234663852886E38d)
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float m15125() {
            r1 = this;
            float r0 = r1.f11973
            return r0
    }

    @Yue.InterfaceC3281(from = 0)
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public long m15126() {
            r4 = this;
            long r0 = r4.f11970
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto La
            long r0 = r4.f11969
        La:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m15127() {
            r1 = this;
            int r0 = r1.f11968
            return r0
    }

    @Yue.InterfaceC4410
    @Yue.InterfaceC5336(31)
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public android.location.LocationRequest m15128() {
            r1 = this;
            android.location.LocationRequest r0 = Yue.C3776.C3778.m15131(r1)
            return r0
    }

    @Yue.InterfaceC4544
    @android.annotation.SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public android.location.LocationRequest m15129(@Yue.InterfaceC4410 java.lang.String r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            android.location.LocationRequest r3 = r2.m15128()
            return r3
        Lb:
            java.lang.Object r3 = Yue.C3776.C3777.m15130(r2, r3)
            android.location.LocationRequest r3 = Yue.C3775.m15120(r3)
            return r3
    }
}
