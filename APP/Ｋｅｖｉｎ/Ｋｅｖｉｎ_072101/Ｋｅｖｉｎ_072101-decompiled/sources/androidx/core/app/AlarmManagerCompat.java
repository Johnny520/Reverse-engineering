package androidx.core.app;

/* JADX INFO: loaded from: classes2.dex */
public final class AlarmManagerCompat {

    static class Api19Impl {
        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setExact(android.app.AlarmManager r0, int r1, long r2, android.app.PendingIntent r4) {
                r0.setExact(r1, r2, r4)
                return
        }
    }

    static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.app.AlarmManager.AlarmClockInfo createAlarmClockInfo(long r1, android.app.PendingIntent r3) {
                android.app.AlarmManager$AlarmClockInfo r0 = new android.app.AlarmManager$AlarmClockInfo
                r0.<init>(r1, r3)
                return r0
        }

        static void setAlarmClock(android.app.AlarmManager r1, java.lang.Object r2, android.app.PendingIntent r3) {
                r0 = r2
                android.app.AlarmManager$AlarmClockInfo r0 = (android.app.AlarmManager.AlarmClockInfo) r0
                r1.setAlarmClock(r0, r3)
                return
        }
    }

    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void setAndAllowWhileIdle(android.app.AlarmManager r0, int r1, long r2, android.app.PendingIntent r4) {
                r0.setAndAllowWhileIdle(r1, r2, r4)
                return
        }

        static void setExactAndAllowWhileIdle(android.app.AlarmManager r0, int r1, long r2, android.app.PendingIntent r4) {
                r0.setExactAndAllowWhileIdle(r1, r2, r4)
                return
        }
    }

    private AlarmManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void setAlarmClock(android.app.AlarmManager r1, long r2, android.app.PendingIntent r4, android.app.PendingIntent r5) {
            android.app.AlarmManager$AlarmClockInfo r0 = androidx.core.app.AlarmManagerCompat.Api21Impl.createAlarmClockInfo(r2, r4)
            androidx.core.app.AlarmManagerCompat.Api21Impl.setAlarmClock(r1, r0, r5)
            return
    }

    public static void setAndAllowWhileIdle(android.app.AlarmManager r0, int r1, long r2, android.app.PendingIntent r4) {
            androidx.core.app.AlarmManagerCompat.Api23Impl.setAndAllowWhileIdle(r0, r1, r2, r4)
            return
    }

    public static void setExact(android.app.AlarmManager r0, int r1, long r2, android.app.PendingIntent r4) {
            androidx.core.app.AlarmManagerCompat.Api19Impl.setExact(r0, r1, r2, r4)
            return
    }

    public static void setExactAndAllowWhileIdle(android.app.AlarmManager r0, int r1, long r2, android.app.PendingIntent r4) {
            androidx.core.app.AlarmManagerCompat.Api23Impl.setExactAndAllowWhileIdle(r0, r1, r2, r4)
            return
    }
}
