package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: AndroidLog.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m115d2 = {"androidLevel", "", "Ljava/util/logging/LogRecord;", "getAndroidLevel", "(Ljava/util/logging/LogRecord;)I", "okhttp"}, m116k = 2, m117mv = {1, 8, 0}, m119xi = 48)
public final class AndroidLogKt {
    public static final /* synthetic */ int access$getAndroidLevel(java.util.logging.LogRecord r1) {
            int r0 = getAndroidLevel(r1)
            return r0
    }

    private static final int getAndroidLevel(java.util.logging.LogRecord r2) {
            java.util.logging.Level r0 = r2.getLevel()
            int r0 = r0.intValue()
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            int r1 = r1.intValue()
            if (r0 <= r1) goto L13
            r0 = 5
            goto L26
        L13:
            java.util.logging.Level r0 = r2.getLevel()
            int r0 = r0.intValue()
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            int r1 = r1.intValue()
            if (r0 != r1) goto L25
            r0 = 4
            goto L26
        L25:
            r0 = 3
        L26:
            return r0
    }
}
