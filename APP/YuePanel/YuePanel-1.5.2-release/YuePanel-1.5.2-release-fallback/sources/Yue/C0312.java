package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0312 {

    /* JADX INFO: renamed from: Yue.ۥۣ۟۠۠$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C0313 {
        public C0313() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static android.app.AlarmManager.AlarmClockInfo m1356(long r1, android.app.PendingIntent r3) {
                android.app.AlarmManager$AlarmClockInfo r0 = new android.app.AlarmManager$AlarmClockInfo
                r0.<init>(r1, r3)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m1357(android.app.AlarmManager r0, java.lang.Object r1, android.app.PendingIntent r2) {
                android.app.AlarmManager$AlarmClockInfo r1 = (android.app.AlarmManager.AlarmClockInfo) r1
                r0.setAlarmClock(r1, r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۠۠$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(23)
    public static class C0314 {
        public C0314() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m1358(android.app.AlarmManager r0, int r1, long r2, android.app.PendingIntent r4) {
                r0.setAndAllowWhileIdle(r1, r2, r4)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m1359(android.app.AlarmManager r0, int r1, long r2, android.app.PendingIntent r4) {
                r0.setExactAndAllowWhileIdle(r1, r2, r4)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۠۠$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(31)
    public static class C0315 {
        public C0315() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static boolean m1360(android.app.AlarmManager r0) {
                boolean r0 = r0.canScheduleExactAlarms()
                return r0
        }
    }

    public C0312() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean m1351(@Yue.InterfaceC4410 android.app.AlarmManager r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            boolean r2 = Yue.C0312.C0315.m1360(r2)
            return r2
        Lb:
            r2 = 1
            return r2
    }

    @android.annotation.SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m1352(@Yue.InterfaceC4410 android.app.AlarmManager r0, long r1, @Yue.InterfaceC4410 android.app.PendingIntent r3, @Yue.InterfaceC4410 android.app.PendingIntent r4) {
            android.app.AlarmManager$AlarmClockInfo r1 = Yue.C0312.C0313.m1356(r1, r3)
            Yue.C0312.C0313.m1357(r0, r1, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m1353(@Yue.InterfaceC4410 android.app.AlarmManager r0, int r1, long r2, @Yue.InterfaceC4410 android.app.PendingIntent r4) {
            Yue.C0312.C0314.m1358(r0, r1, r2, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m1354(@Yue.InterfaceC4410 android.app.AlarmManager r0, int r1, long r2, @Yue.InterfaceC4410 android.app.PendingIntent r4) {
            r0.setExact(r1, r2, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m1355(@Yue.InterfaceC4410 android.app.AlarmManager r0, int r1, long r2, @Yue.InterfaceC4410 android.app.PendingIntent r4) {
            Yue.C0312.C0314.m1359(r0, r1, r2, r4)
            return
    }
}
