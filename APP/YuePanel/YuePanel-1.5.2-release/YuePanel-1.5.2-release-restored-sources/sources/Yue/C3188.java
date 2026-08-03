package Yue;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;

/* JADX INFO: renamed from: Yue.ۥۣ۟۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3188 {

    /* JADX INFO: renamed from: Yue.ۥۣ۟۠۠$ۥ */
    @InterfaceC7113(21)
    public static class C0073 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static AlarmManager.AlarmClockInfo m259(long j, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j, pendingIntent);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m260(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۠۠$ۥ۟ */
    @InterfaceC7113(23)
    public static class C0074 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m261(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m262(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟۠۠$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(31)
    public static class C3189 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m263(AlarmManager alarmManager) {
            return alarmManager.canScheduleExactAlarms();
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static boolean m257(@InterfaceC6391 AlarmManager alarmManager) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C3189.m263(alarmManager);
        }
        return true;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: ۥ۟ */
    public static void m258(@InterfaceC6391 AlarmManager alarmManager, long j, @InterfaceC6391 PendingIntent pendingIntent, @InterfaceC6391 PendingIntent pendingIntent2) {
        C0073.m260(alarmManager, C0073.m259(j, pendingIntent), pendingIntent2);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m6538(@InterfaceC6391 AlarmManager alarmManager, int i, long j, @InterfaceC6391 PendingIntent pendingIntent) {
        C0074.m261(alarmManager, i, j, pendingIntent);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m6539(@InterfaceC6391 AlarmManager alarmManager, int i, long j, @InterfaceC6391 PendingIntent pendingIntent) {
        alarmManager.setExact(i, j, pendingIntent);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m6540(@InterfaceC6391 AlarmManager alarmManager, int i, long j, @InterfaceC6391 PendingIntent pendingIntent) {
        C0074.m262(alarmManager, i, j, pendingIntent);
    }
}
