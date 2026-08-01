package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: AndroidLog.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0002\b\u0012J\u0006\u0010\u0013\u001a\u00020\fJ\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0002J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m115d2 = {"Lokhttp3/internal/platform/android/AndroidLog;", "", "()V", "MAX_LOG_LENGTH", "", "configuredLoggers", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/logging/Logger;", "knownLoggers", "", "", "androidLog", "", "loggerName", "logLevel", "message", "t", "", "androidLog$okhttp", "enable", "enableLogging", "logger", "tag", "loggerTag", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class AndroidLog {
    public static final okhttp3.internal.platform.android.AndroidLog INSTANCE = null;
    private static final int MAX_LOG_LENGTH = 4000;
    private static final java.util.concurrent.CopyOnWriteArraySet<java.util.logging.Logger> configuredLoggers = null;
    private static final java.util.Map<java.lang.String, java.lang.String> knownLoggers = null;

    static {
            okhttp3.internal.platform.android.AndroidLog r0 = new okhttp3.internal.platform.android.AndroidLog
            r0.<init>()
            okhttp3.internal.platform.android.AndroidLog.INSTANCE = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            okhttp3.internal.platform.android.AndroidLog.configuredLoggers = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1 = r0
            r2 = 0
            java.lang.Class<okhttp3.OkHttpClient> r3 = okhttp3.OkHttpClient.class
            java.lang.Package r3 = r3.getPackage()
            if (r3 == 0) goto L23
            java.lang.String r3 = r3.getName()
            goto L24
        L23:
            r3 = 0
        L24:
            if (r3 == 0) goto L2e
            r4 = r1
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r5 = "OkHttp"
            r4.put(r3, r5)
        L2e:
            r4 = r1
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Class<okhttp3.OkHttpClient> r5 = okhttp3.OkHttpClient.class
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "OkHttpClient::class.java.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.String r6 = "okhttp.OkHttpClient"
            r4.put(r5, r6)
            r4 = r1
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Class<okhttp3.internal.http2.Http2> r5 = okhttp3.internal.http2.Http2.class
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "Http2::class.java.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.String r6 = "okhttp.Http2"
            r4.put(r5, r6)
            r4 = r1
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Class<okhttp3.internal.concurrent.TaskRunner> r5 = okhttp3.internal.concurrent.TaskRunner.class
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "TaskRunner::class.java.name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.String r6 = "okhttp.TaskRunner"
            r4.put(r5, r6)
            r4 = r1
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r5 = "okhttp3.mockwebserver.MockWebServer"
            java.lang.String r6 = "okhttp.MockWebServer"
            r4.put(r5, r6)
            java.util.Map r0 = (java.util.Map) r0
            java.util.Map r0 = kotlin.collections.MapsKt.toMap(r0)
            okhttp3.internal.platform.android.AndroidLog.knownLoggers = r0
            return
    }

    private AndroidLog() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void enableLogging(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r3)
            java.util.concurrent.CopyOnWriteArraySet<java.util.logging.Logger> r1 = okhttp3.internal.platform.android.AndroidLog.configuredLoggers
            boolean r1 = r1.add(r0)
            if (r1 == 0) goto L31
            r1 = 0
            r0.setUseParentHandlers(r1)
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r4, r1)
            if (r1 == 0) goto L1b
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            goto L27
        L1b:
            r1 = 4
            boolean r1 = android.util.Log.isLoggable(r4, r1)
            if (r1 == 0) goto L25
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            goto L27
        L25:
            java.util.logging.Level r1 = java.util.logging.Level.WARNING
        L27:
            r0.setLevel(r1)
            okhttp3.internal.platform.android.AndroidLogHandler r1 = okhttp3.internal.platform.android.AndroidLogHandler.INSTANCE
            java.util.logging.Handler r1 = (java.util.logging.Handler) r1
            r0.addHandler(r1)
        L31:
            return
    }

    private final java.lang.String loggerTag(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = okhttp3.internal.platform.android.AndroidLog.knownLoggers
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L10
            r0 = 23
            java.lang.String r0 = kotlin.text.StringsKt.take(r2, r0)
        L10:
            return r0
    }

    public final void androidLog$okhttp(java.lang.String r11, int r12, java.lang.String r13, java.lang.Throwable r14) {
            r10 = this;
            java.lang.String r0 = "loggerName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = r10.loggerTag(r11)
            boolean r1 = android.util.Log.isLoggable(r0, r12)
            if (r1 == 0) goto L66
            r1 = r13
            if (r14 == 0) goto L32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r1)
            r3 = 10
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = android.util.Log.getStackTraceString(r14)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r1 = r2.toString()
        L32:
            r2 = 0
            int r3 = r1.length()
        L37:
            if (r2 >= r3) goto L66
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r8 = 4
            r9 = 0
            r5 = 10
            r7 = 0
            r6 = r2
            int r4 = kotlin.text.StringsKt.indexOf$default(r4, r5, r6, r7, r8, r9)
            r5 = -1
            if (r4 == r5) goto L4b
            r5 = r4
            goto L4c
        L4b:
            r5 = r3
        L4c:
            r4 = r5
        L4d:
            int r5 = r2 + 4000
            int r5 = java.lang.Math.min(r4, r5)
            java.lang.String r6 = r1.substring(r2, r5)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            android.util.Log.println(r12, r0, r6)
            r2 = r5
            if (r2 < r4) goto L4d
        L63:
            int r2 = r2 + 1
            goto L37
        L66:
            return
    }

    public final void enable() {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = okhttp3.internal.platform.android.AndroidLog.knownLoggers
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r3.enableLogging(r2, r1)
            goto La
        L26:
            return
    }
}
