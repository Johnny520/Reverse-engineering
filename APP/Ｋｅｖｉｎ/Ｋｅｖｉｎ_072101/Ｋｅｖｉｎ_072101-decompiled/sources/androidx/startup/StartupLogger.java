package androidx.startup;

/* JADX INFO: loaded from: classes2.dex */
public final class StartupLogger {
    static final boolean DEBUG = false;
    private static final java.lang.String TAG = "StartupLogger";

    private StartupLogger() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: e */
    public static void m61e(java.lang.String r1, java.lang.Throwable r2) {
            java.lang.String r0 = "StartupLogger"
            android.util.Log.e(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: i */
    public static void m62i(java.lang.String r1) {
            java.lang.String r0 = "StartupLogger"
            android.util.Log.i(r0, r1)
            return
    }

    /* JADX INFO: renamed from: w */
    public static void m63w(java.lang.String r1) {
            java.lang.String r0 = "StartupLogger"
            android.util.Log.w(r0, r1)
            return
    }
}
