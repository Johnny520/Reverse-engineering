package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidLogHandler extends java.util.logging.Handler {
    public static final okhttp3.internal.platform.android.AndroidLogHandler INSTANCE = null;

    static {
            okhttp3.internal.platform.android.AndroidLogHandler r0 = new okhttp3.internal.platform.android.AndroidLogHandler
            r0.<init>()
            okhttp3.internal.platform.android.AndroidLogHandler.INSTANCE = r0
            return
    }

    private AndroidLogHandler() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.logging.Handler
    public void close() {
            r0 = this;
            return
    }

    @Override // java.util.logging.Handler
    public void flush() {
            r0 = this;
            return
    }

    @Override // java.util.logging.Handler
    public void publish(java.util.logging.LogRecord r5) {
            r4 = this;
            r5.getClass()
            okhttp3.internal.platform.android.AndroidLog r0 = okhttp3.internal.platform.android.AndroidLog.INSTANCE
            java.lang.String r1 = r5.getLoggerName()
            r1.getClass()
            int r2 = okhttp3.internal.platform.android.AndroidLogKt.access$getAndroidLevel(r5)
            java.lang.String r3 = r5.getMessage()
            r3.getClass()
            java.lang.Throwable r5 = r5.getThrown()
            r0.androidLog$okhttp(r1, r2, r3, r5)
            return
    }
}
