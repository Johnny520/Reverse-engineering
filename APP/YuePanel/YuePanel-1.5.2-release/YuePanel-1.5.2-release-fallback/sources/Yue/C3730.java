package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3730 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f11870 = "mockLocation";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f11871 = "verticalAccuracy";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f11872 = "speedAccuracy";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f11873 = "bearingAccuracy";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f11874 = "androidx.core.location.extra.MSL_ALTITUDE";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f11875 = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public static java.lang.reflect.Method f11876;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public static java.lang.reflect.Field f11877;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public static java.lang.Integer f11878;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public static java.lang.Integer f11879;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4544
    public static java.lang.Integer f11880;

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(26)
    public static class C3731 {
        public C3731() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static float m15005(android.location.Location r0) {
                float r0 = r0.getBearingAccuracyDegrees()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static float m15006(android.location.Location r0) {
                float r0 = r0.getSpeedAccuracyMetersPerSecond()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static float m15007(android.location.Location r0) {
                float r0 = r0.getVerticalAccuracyMeters()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static boolean m15008(android.location.Location r0) {
                boolean r0 = r0.hasBearingAccuracy()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static boolean m15009(android.location.Location r0) {
                boolean r0 = r0.hasSpeedAccuracy()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static boolean m15010(android.location.Location r0) {
                boolean r0 = r0.hasVerticalAccuracy()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static void m15011(android.location.Location r2) {
                java.lang.reflect.Field r0 = Yue.C3730.m14977()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                byte r0 = r0.getByte(r2)     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                int r1 = Yue.C3730.m14978()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                int r1 = ~r1     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                r0 = r0 & r1
                byte r0 = (byte) r0     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                java.lang.reflect.Field r1 = Yue.C3730.m14977()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                r1.setByte(r2, r0)     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                return
            L17:
                r2 = move-exception
                goto L1b
            L19:
                r2 = move-exception
                goto L24
            L1b:
                java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
                r0.<init>()
                r0.initCause(r2)
                throw r0
            L24:
                java.lang.NoSuchFieldError r0 = new java.lang.NoSuchFieldError
                r0.<init>()
                r0.initCause(r2)
                throw r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static void m15012(android.location.Location r2) {
                java.lang.reflect.Field r0 = Yue.C3730.m14977()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                byte r0 = r0.getByte(r2)     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                int r1 = Yue.C3730.m14979()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                int r1 = ~r1     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                r0 = r0 & r1
                byte r0 = (byte) r0     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                java.lang.reflect.Field r1 = Yue.C3730.m14977()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                r1.setByte(r2, r0)     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                return
            L17:
                r2 = move-exception
                goto L1b
            L19:
                r2 = move-exception
                goto L24
            L1b:
                java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
                r0.<init>()
                r0.initCause(r2)
                throw r0
            L24:
                java.lang.NoSuchFieldError r0 = new java.lang.NoSuchFieldError
                r0.<init>()
                r0.initCause(r2)
                throw r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static void m15013(android.location.Location r2) {
                java.lang.reflect.Field r0 = Yue.C3730.m14977()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                byte r0 = r0.getByte(r2)     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                int r1 = Yue.C3730.m14980()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                int r1 = ~r1     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                r0 = r0 & r1
                byte r0 = (byte) r0     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                java.lang.reflect.Field r1 = Yue.C3730.m14977()     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                r1.setByte(r2, r0)     // Catch: java.lang.IllegalAccessException -> L17 java.lang.NoSuchFieldException -> L19
                return
            L17:
                r2 = move-exception
                goto L1a
            L19:
                r2 = move-exception
            L1a:
                java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
                r0.<init>()
                r0.initCause(r2)
                throw r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static void m15014(android.location.Location r0, float r1) {
                r0.setBearingAccuracyDegrees(r1)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static void m15015(android.location.Location r0, float r1) {
                r0.setSpeedAccuracyMetersPerSecond(r1)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static void m15016(android.location.Location r0, float r1) {
                r0.setVerticalAccuracyMeters(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C3732 {
        public C3732() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m15017(android.location.Location r24) {
                r0 = r24
                boolean r1 = r24.hasBearingAccuracy()
                if (r1 != 0) goto L9
                return
            L9:
                java.lang.String r1 = r24.getProvider()
                long r2 = r24.getTime()
                long r4 = r24.getElapsedRealtimeNanos()
                double r6 = r24.getLatitude()
                double r8 = r24.getLongitude()
                boolean r10 = r24.hasAltitude()
                double r11 = r24.getAltitude()
                boolean r13 = r24.hasSpeed()
                float r14 = r24.getSpeed()
                boolean r15 = r24.hasBearing()
                r16 = r15
                float r15 = r24.getBearing()
                boolean r17 = r24.hasAccuracy()
                r18 = r15
                float r15 = r24.getAccuracy()
                boolean r19 = r24.hasVerticalAccuracy()
                r20 = r15
                float r15 = r24.getVerticalAccuracyMeters()
                boolean r21 = r24.hasSpeedAccuracy()
                r22 = r15
                float r15 = r24.getSpeedAccuracyMetersPerSecond()
                r23 = r15
                android.os.Bundle r15 = r24.getExtras()
                r24.reset()
                r0.setProvider(r1)
                r0.setTime(r2)
                r0.setElapsedRealtimeNanos(r4)
                r0.setLatitude(r6)
                r0.setLongitude(r8)
                if (r10 == 0) goto L72
                r0.setAltitude(r11)
            L72:
                if (r13 == 0) goto L77
                r0.setSpeed(r14)
            L77:
                if (r16 == 0) goto L7e
                r1 = r18
                r0.setBearing(r1)
            L7e:
                if (r17 == 0) goto L85
                r1 = r20
                r0.setAccuracy(r1)
            L85:
                if (r19 == 0) goto L8c
                r1 = r22
                r0.setVerticalAccuracyMeters(r1)
            L8c:
                if (r21 == 0) goto L93
                r1 = r23
                r0.setBearingAccuracyDegrees(r1)
            L93:
                if (r15 == 0) goto L98
                r0.setExtras(r15)
            L98:
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m15018(android.location.Location r24) {
                r0 = r24
                boolean r1 = r24.hasSpeedAccuracy()
                if (r1 != 0) goto L9
                return
            L9:
                java.lang.String r1 = r24.getProvider()
                long r2 = r24.getTime()
                long r4 = r24.getElapsedRealtimeNanos()
                double r6 = r24.getLatitude()
                double r8 = r24.getLongitude()
                boolean r10 = r24.hasAltitude()
                double r11 = r24.getAltitude()
                boolean r13 = r24.hasSpeed()
                float r14 = r24.getSpeed()
                boolean r15 = r24.hasBearing()
                r16 = r15
                float r15 = r24.getBearing()
                boolean r17 = r24.hasAccuracy()
                r18 = r15
                float r15 = r24.getAccuracy()
                boolean r19 = r24.hasVerticalAccuracy()
                r20 = r15
                float r15 = r24.getVerticalAccuracyMeters()
                boolean r21 = r24.hasBearingAccuracy()
                r22 = r15
                float r15 = r24.getBearingAccuracyDegrees()
                r23 = r15
                android.os.Bundle r15 = r24.getExtras()
                r24.reset()
                r0.setProvider(r1)
                r0.setTime(r2)
                r0.setElapsedRealtimeNanos(r4)
                r0.setLatitude(r6)
                r0.setLongitude(r8)
                if (r10 == 0) goto L72
                r0.setAltitude(r11)
            L72:
                if (r13 == 0) goto L77
                r0.setSpeed(r14)
            L77:
                if (r16 == 0) goto L7e
                r1 = r18
                r0.setBearing(r1)
            L7e:
                if (r17 == 0) goto L85
                r1 = r20
                r0.setAccuracy(r1)
            L85:
                if (r19 == 0) goto L8c
                r1 = r22
                r0.setVerticalAccuracyMeters(r1)
            L8c:
                if (r21 == 0) goto L93
                r1 = r23
                r0.setBearingAccuracyDegrees(r1)
            L93:
                if (r15 == 0) goto L98
                r0.setExtras(r15)
            L98:
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m15019(android.location.Location r24) {
                r0 = r24
                boolean r1 = r24.hasVerticalAccuracy()
                if (r1 != 0) goto L9
                return
            L9:
                java.lang.String r1 = r24.getProvider()
                long r2 = r24.getTime()
                long r4 = r24.getElapsedRealtimeNanos()
                double r6 = r24.getLatitude()
                double r8 = r24.getLongitude()
                boolean r10 = r24.hasAltitude()
                double r11 = r24.getAltitude()
                boolean r13 = r24.hasSpeed()
                float r14 = r24.getSpeed()
                boolean r15 = r24.hasBearing()
                r16 = r15
                float r15 = r24.getBearing()
                boolean r17 = r24.hasAccuracy()
                r18 = r15
                float r15 = r24.getAccuracy()
                boolean r19 = r24.hasSpeedAccuracy()
                r20 = r15
                float r15 = r24.getSpeedAccuracyMetersPerSecond()
                boolean r21 = r24.hasBearingAccuracy()
                r22 = r15
                float r15 = r24.getBearingAccuracyDegrees()
                r23 = r15
                android.os.Bundle r15 = r24.getExtras()
                r24.reset()
                r0.setProvider(r1)
                r0.setTime(r2)
                r0.setElapsedRealtimeNanos(r4)
                r0.setLatitude(r6)
                r0.setLongitude(r8)
                if (r10 == 0) goto L72
                r0.setAltitude(r11)
            L72:
                if (r13 == 0) goto L77
                r0.setSpeed(r14)
            L77:
                if (r16 == 0) goto L7e
                r1 = r18
                r0.setBearing(r1)
            L7e:
                if (r17 == 0) goto L85
                r1 = r20
                r0.setAccuracy(r1)
            L85:
                if (r19 == 0) goto L8c
                r1 = r22
                r0.setSpeedAccuracyMetersPerSecond(r1)
            L8c:
                if (r21 == 0) goto L93
                r1 = r23
                r0.setBearingAccuracyDegrees(r1)
            L93:
                if (r15 == 0) goto L98
                r0.setExtras(r15)
            L98:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C3733 {
        public C3733() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m15020(android.location.Location r2) {
                boolean r0 = r2.hasBearingAccuracy()
                if (r0 != 0) goto L7
                return
            L7:
                double r0 = r2.getElapsedRealtimeUncertaintyNanos()
                Yue.C3730.C3732.m15017(r2)
                r2.setElapsedRealtimeUncertaintyNanos(r0)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m15021(android.location.Location r2) {
                boolean r0 = r2.hasSpeedAccuracy()
                if (r0 != 0) goto L7
                return
            L7:
                double r0 = r2.getElapsedRealtimeUncertaintyNanos()
                Yue.C3730.C3732.m15018(r2)
                r2.setElapsedRealtimeUncertaintyNanos(r0)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m15022(android.location.Location r2) {
                boolean r0 = r2.hasVerticalAccuracy()
                if (r0 != 0) goto L7
                return
            L7:
                double r0 = r2.getElapsedRealtimeUncertaintyNanos()
                Yue.C3730.C3732.m15019(r2)
                r2.setElapsedRealtimeUncertaintyNanos(r0)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(33)
    public static class C3734 {
        public C3734() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m15023(android.location.Location r0) {
                r0.removeBearingAccuracy()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m15024(android.location.Location r0) {
                r0.removeSpeedAccuracy()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m15025(android.location.Location r0) {
                r0.removeVerticalAccuracy()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۨ$ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(34)
    public static class C3735 {
        public C3735() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static float m15026(android.location.Location r0) {
                float r0 = r0.getMslAltitudeAccuracyMeters()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static double m15027(android.location.Location r2) {
                double r0 = r2.getMslAltitudeMeters()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static boolean m15028(android.location.Location r0) {
                boolean r0 = r0.hasMslAltitude()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static boolean m15029(android.location.Location r0) {
                boolean r0 = r0.hasMslAltitudeAccuracy()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static void m15030(android.location.Location r0) {
                r0.removeMslAltitude()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static void m15031(android.location.Location r0) {
                r0.removeMslAltitudeAccuracy()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static void m15032(android.location.Location r0, float r1) {
                r0.setMslAltitudeAccuracyMeters(r1)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static void m15033(android.location.Location r0, double r1) {
                r0.setMslAltitudeMeters(r1)
                return
        }
    }

    public C3730() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean m14973(@Yue.InterfaceC4410 android.location.Location r0, java.lang.String r1) {
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto Le
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static float m14974(@Yue.InterfaceC4410 android.location.Location r0) {
            float r0 = Yue.C3730.C3731.m15005(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static long m14975(@Yue.InterfaceC4410 android.location.Location r3) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = r3.getElapsedRealtimeNanos()
            long r0 = r0.toMillis(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static long m14976(@Yue.InterfaceC4410 android.location.Location r2) {
            long r0 = r2.getElapsedRealtimeNanos()
            return r0
    }

    @android.annotation.SuppressLint({"BlockedPrivateApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static java.lang.reflect.Field m14977() throws java.lang.NoSuchFieldException {
            java.lang.reflect.Field r0 = Yue.C3730.f11877
            if (r0 != 0) goto L12
            java.lang.Class<android.location.Location> r0 = android.location.Location.class
            java.lang.String r1 = "mFieldsMask"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            Yue.C3730.f11877 = r0
            r1 = 1
            r0.setAccessible(r1)
        L12:
            java.lang.reflect.Field r0 = Yue.C3730.f11877
            return r0
    }

    @android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int m14978() throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
            java.lang.Integer r0 = Yue.C3730.f11879
            if (r0 != 0) goto L1b
            java.lang.Class<android.location.Location> r0 = android.location.Location.class
            java.lang.String r1 = "HAS_BEARING_ACCURACY_MASK"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r1 = 1
            r0.setAccessible(r1)
            r1 = 0
            int r0 = r0.getInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            Yue.C3730.f11879 = r0
        L1b:
            java.lang.Integer r0 = Yue.C3730.f11879
            int r0 = r0.intValue()
            return r0
    }

    @android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m14979() throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
            java.lang.Integer r0 = Yue.C3730.f11878
            if (r0 != 0) goto L1b
            java.lang.Class<android.location.Location> r0 = android.location.Location.class
            java.lang.String r1 = "HAS_SPEED_ACCURACY_MASK"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r1 = 1
            r0.setAccessible(r1)
            r1 = 0
            int r0 = r0.getInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            Yue.C3730.f11878 = r0
        L1b:
            java.lang.Integer r0 = Yue.C3730.f11878
            int r0 = r0.intValue()
            return r0
    }

    @android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static int m14980() throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
            java.lang.Integer r0 = Yue.C3730.f11880
            if (r0 != 0) goto L1b
            java.lang.Class<android.location.Location> r0 = android.location.Location.class
            java.lang.String r1 = "HAS_VERTICAL_ACCURACY_MASK"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r1 = 1
            r0.setAccessible(r1)
            r1 = 0
            int r0 = r0.getInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            Yue.C3730.f11880 = r0
        L1b:
            java.lang.Integer r0 = Yue.C3730.f11880
            int r0 = r0.intValue()
            return r0
    }

    @Yue.InterfaceC2458(from = 0.0d)
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static float m14981(@Yue.InterfaceC4410 android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            float r2 = Yue.C3730.C3735.m15026(r2)
            return r2
        Lb:
            android.os.Bundle r2 = m14983(r2)
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"
            float r2 = r2.getFloat(r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static double m14982(@Yue.InterfaceC4410 android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            double r0 = Yue.C3730.C3735.m15027(r2)
            return r0
        Lb:
            android.os.Bundle r2 = m14983(r2)
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE"
            double r0 = r2.getDouble(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static android.os.Bundle m14983(@Yue.InterfaceC4410 android.location.Location r1) {
            android.os.Bundle r0 = r1.getExtras()
            if (r0 != 0) goto L12
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.setExtras(r0)
            android.os.Bundle r0 = r1.getExtras()
        L12:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static java.lang.reflect.Method m14984() throws java.lang.NoSuchMethodException {
            java.lang.reflect.Method r0 = Yue.C3730.f11876
            if (r0 != 0) goto L18
            java.lang.Class r0 = java.lang.Boolean.TYPE
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.Class<android.location.Location> r1 = android.location.Location.class
            java.lang.String r2 = "setIsFromMockProvider"
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r2, r0)
            Yue.C3730.f11876 = r0
            r1 = 1
            r0.setAccessible(r1)
        L18:
            java.lang.reflect.Method r0 = Yue.C3730.f11876
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static float m14985(@Yue.InterfaceC4410 android.location.Location r0) {
            float r0 = Yue.C3730.C3731.m15006(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static float m14986(@Yue.InterfaceC4410 android.location.Location r0) {
            float r0 = Yue.C3730.C3731.m15007(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static boolean m14987(@Yue.InterfaceC4410 android.location.Location r0) {
            boolean r0 = Yue.C3730.C3731.m15008(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static boolean m14988(@Yue.InterfaceC4410 android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            boolean r2 = Yue.C3730.C3735.m15028(r2)
            return r2
        Lb:
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE"
            boolean r2 = m14973(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static boolean m14989(@Yue.InterfaceC4410 android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            boolean r2 = Yue.C3730.C3735.m15029(r2)
            return r2
        Lb:
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"
            boolean r2 = m14973(r2, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static boolean m14990(@Yue.InterfaceC4410 android.location.Location r0) {
            boolean r0 = Yue.C3730.C3731.m15009(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static boolean m14991(@Yue.InterfaceC4410 android.location.Location r0) {
            boolean r0 = Yue.C3730.C3731.m15010(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static boolean m14992(@Yue.InterfaceC4410 android.location.Location r0) {
            boolean r0 = r0.isFromMockProvider()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static void m14993(@Yue.InterfaceC4410 android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto La
            Yue.C3730.C3734.m15023(r2)
            goto L1d
        La:
            r1 = 29
            if (r0 < r1) goto L12
            Yue.C3730.C3733.m15020(r2)
            goto L1d
        L12:
            r1 = 28
            if (r0 < r1) goto L1a
            Yue.C3730.C3732.m15017(r2)
            goto L1d
        L1a:
            Yue.C3730.C3731.m15011(r2)
        L1d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static void m14994(@Yue.InterfaceC4410 android.location.Location r1, java.lang.String r2) {
            android.os.Bundle r0 = r1.getExtras()
            if (r0 == 0) goto L13
            r0.remove(r2)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L13
            r2 = 0
            r1.setExtras(r2)
        L13:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static void m14995(@Yue.InterfaceC4410 android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            Yue.C3730.C3735.m15030(r2)
            goto Lf
        La:
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE"
            m14994(r2, r0)
        Lf:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static void m14996(@Yue.InterfaceC4410 android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            Yue.C3730.C3735.m15031(r2)
            goto Lf
        La:
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"
            m14994(r2, r0)
        Lf:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static void m14997(@Yue.InterfaceC4410 android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto La
            Yue.C3730.C3734.m15024(r2)
            goto L1d
        La:
            r1 = 29
            if (r0 < r1) goto L12
            Yue.C3730.C3733.m15021(r2)
            goto L1d
        L12:
            r1 = 28
            if (r0 < r1) goto L1a
            Yue.C3730.C3732.m15018(r2)
            goto L1d
        L1a:
            Yue.C3730.C3731.m15012(r2)
        L1d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static void m14998(@Yue.InterfaceC4410 android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto La
            Yue.C3730.C3734.m15025(r2)
            goto L1d
        La:
            r1 = 29
            if (r0 < r1) goto L12
            Yue.C3730.C3733.m15022(r2)
            goto L1d
        L12:
            r1 = 28
            if (r0 < r1) goto L1a
            Yue.C3730.C3732.m15019(r2)
            goto L1d
        L1a:
            Yue.C3730.C3731.m15013(r2)
        L1d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static void m14999(@Yue.InterfaceC4410 android.location.Location r0, float r1) {
            Yue.C3730.C3731.m15014(r0, r1)
            return
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static void m15000(@Yue.InterfaceC4410 android.location.Location r1, boolean r2) {
            java.lang.reflect.Method r0 = m14984()     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L12 java.lang.NoSuchMethodException -> L14
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L12 java.lang.NoSuchMethodException -> L14
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L12 java.lang.NoSuchMethodException -> L14
            r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.IllegalAccessException -> L12 java.lang.NoSuchMethodException -> L14
            return
        L10:
            r1 = move-exception
            goto L16
        L12:
            r1 = move-exception
            goto L1c
        L14:
            r1 = move-exception
            goto L25
        L16:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
        L1c:
            java.lang.IllegalAccessError r2 = new java.lang.IllegalAccessError
            r2.<init>()
            r2.initCause(r1)
            throw r2
        L25:
            java.lang.NoSuchMethodError r2 = new java.lang.NoSuchMethodError
            r2.<init>()
            r2.initCause(r1)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static void m15001(@Yue.InterfaceC4410 android.location.Location r2, @Yue.InterfaceC2458(from = 0.0d) float r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            Yue.C3730.C3735.m15032(r2, r3)
            goto L13
        La:
            android.os.Bundle r2 = m14983(r2)
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"
            r2.putFloat(r0, r3)
        L13:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static void m15002(@Yue.InterfaceC4410 android.location.Location r2, double r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto La
            Yue.C3730.C3735.m15033(r2, r3)
            goto L13
        La:
            android.os.Bundle r2 = m14983(r2)
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE"
            r2.putDouble(r0, r3)
        L13:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static void m15003(@Yue.InterfaceC4410 android.location.Location r0, float r1) {
            Yue.C3730.C3731.m15015(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static void m15004(@Yue.InterfaceC4410 android.location.Location r0, float r1) {
            Yue.C3730.C3731.m15016(r0, r1)
            return
    }
}
