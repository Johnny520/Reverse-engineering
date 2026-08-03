package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public abstract class AbstractC6975 extends android.content.BroadcastReceiver {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f24336 = "androidx.contentpager.content.wakelockid";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final android.util.SparseArray<android.os.PowerManager.WakeLock> f24337 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int f24338;

    static {
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            Yue.AbstractC6975.f24337 = r0
            r0 = 1
            Yue.AbstractC6975.f24338 = r0
            return
    }

    public AbstractC6975() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean m26929(android.content.Intent r5) {
            java.lang.String r0 = "androidx.contentpager.content.wakelockid"
            r1 = 0
            int r5 = r5.getIntExtra(r0, r1)
            if (r5 != 0) goto La
            return r1
        La:
            android.util.SparseArray<android.os.PowerManager$WakeLock> r0 = Yue.AbstractC6975.f24337
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r5)     // Catch: java.lang.Throwable -> L1e
            android.os.PowerManager$WakeLock r1 = (android.os.PowerManager.WakeLock) r1     // Catch: java.lang.Throwable -> L1e
            r2 = 1
            if (r1 == 0) goto L20
            r1.release()     // Catch: java.lang.Throwable -> L1e
            r0.remove(r5)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return r2
        L1e:
            r5 = move-exception
            goto L38
        L20:
            java.lang.String r1 = "WakefulBroadcastReceiv."
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r3.<init>()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = "No active wake lock id #"
            r3.append(r4)     // Catch: java.lang.Throwable -> L1e
            r3.append(r5)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L1e
            android.util.Log.w(r1, r5)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return r2
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static android.content.ComponentName m26930(android.content.Context r5, android.content.Intent r6) {
            android.util.SparseArray<android.os.PowerManager$WakeLock> r0 = Yue.AbstractC6975.f24337
            monitor-enter(r0)
            int r1 = Yue.AbstractC6975.f24338     // Catch: java.lang.Throwable -> Lf
            int r2 = r1 + 1
            Yue.AbstractC6975.f24338 = r2     // Catch: java.lang.Throwable -> Lf
            r3 = 1
            if (r2 > 0) goto L11
            Yue.AbstractC6975.f24338 = r3     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r5 = move-exception
            goto L4f
        L11:
            java.lang.String r2 = "androidx.contentpager.content.wakelockid"
            r6.putExtra(r2, r1)     // Catch: java.lang.Throwable -> Lf
            android.content.ComponentName r6 = r5.startService(r6)     // Catch: java.lang.Throwable -> Lf
            if (r6 != 0) goto L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            r5 = 0
            return r5
        L1f:
            java.lang.String r2 = "power"
            java.lang.Object r5 = r5.getSystemService(r2)     // Catch: java.lang.Throwable -> Lf
            android.os.PowerManager r5 = (android.os.PowerManager) r5     // Catch: java.lang.Throwable -> Lf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r4 = "androidx.core:wake:"
            r2.append(r4)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r4 = r6.flattenToShortString()     // Catch: java.lang.Throwable -> Lf
            r2.append(r4)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lf
            android.os.PowerManager$WakeLock r5 = r5.newWakeLock(r3, r2)     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            r5.setReferenceCounted(r2)     // Catch: java.lang.Throwable -> Lf
            r2 = 60000(0xea60, double:2.9644E-319)
            r5.acquire(r2)     // Catch: java.lang.Throwable -> Lf
            r0.put(r1, r5)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r6
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r5
    }
}
