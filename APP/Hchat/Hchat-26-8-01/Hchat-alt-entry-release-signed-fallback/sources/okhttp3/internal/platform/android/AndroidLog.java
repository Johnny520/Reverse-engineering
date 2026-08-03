package okhttp3.internal.platform.android;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
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
            java.lang.Class<okhttp3.OkHttpClient> r1 = okhttp3.OkHttpClient.class
            java.lang.Package r2 = r1.getPackage()
            if (r2 == 0) goto L20
            java.lang.String r2 = r2.getName()
            goto L21
        L20:
            r2 = 0
        L21:
            if (r2 == 0) goto L28
            java.lang.String r3 = "OkHttp"
            r0.put(r2, r3)
        L28:
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "okhttp.OkHttpClient"
            r0.put(r1, r2)
            java.lang.Class<okhttp3.internal.http2.Http2> r1 = okhttp3.internal.http2.Http2.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "okhttp.Http2"
            r0.put(r1, r2)
            java.lang.Class<okhttp3.internal.concurrent.TaskRunner> r1 = okhttp3.internal.concurrent.TaskRunner.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "okhttp.TaskRunner"
            r0.put(r1, r2)
            java.lang.String r1 = "okhttp3.mockwebserver.MockWebServer"
            java.lang.String r2 = "okhttp.MockWebServer"
            r0.put(r1, r2)
            java.util.Map r0 = tf.y.f0(r0)
            okhttp3.internal.platform.android.AndroidLog.knownLoggers = r0
            return
    }

    private AndroidLog() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void enableLogging(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.logging.Logger r2 = java.util.logging.Logger.getLogger(r2)
            java.util.concurrent.CopyOnWriteArraySet<java.util.logging.Logger> r0 = okhttp3.internal.platform.android.AndroidLog.configuredLoggers
            boolean r0 = r0.add(r2)
            if (r0 == 0) goto L2e
            r0 = 0
            r2.setUseParentHandlers(r0)
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L1a
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            goto L26
        L1a:
            r0 = 4
            boolean r3 = android.util.Log.isLoggable(r3, r0)
            if (r3 == 0) goto L24
            java.util.logging.Level r3 = java.util.logging.Level.INFO
            goto L26
        L24:
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
        L26:
            r2.setLevel(r3)
            okhttp3.internal.platform.android.AndroidLogHandler r3 = okhttp3.internal.platform.android.AndroidLogHandler.INSTANCE
            r2.addHandler(r3)
        L2e:
            return
    }

    private final java.lang.String loggerTag(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = okhttp3.internal.platform.android.AndroidLog.knownLoggers
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L11
            r0 = 23
            java.lang.String r2 = og.m.P0(r0, r2)
            return r2
        L11:
            return r0
    }

    public final void androidLog$okhttp(java.lang.String r5, int r6, java.lang.String r7, java.lang.Throwable r8) {
            r4 = this;
            r5.getClass()
            r7.getClass()
            java.lang.String r5 = r4.loggerTag(r5)
            boolean r0 = android.util.Log.isLoggable(r5, r6)
            if (r0 == 0) goto L4f
            r0 = 10
            if (r8 == 0) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r0)
            java.lang.String r7 = android.util.Log.getStackTraceString(r8)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
        L2a:
            int r8 = r7.length()
            r1 = 0
        L2f:
            if (r1 >= r8) goto L4f
            r2 = 4
            int r2 = og.m.q0(r7, r0, r1, r2)
            r3 = -1
            if (r2 == r3) goto L3a
            goto L3b
        L3a:
            r2 = r8
        L3b:
            int r3 = r1 + 4000
            int r3 = java.lang.Math.min(r2, r3)
            java.lang.String r1 = r7.substring(r1, r3)
            android.util.Log.println(r6, r5, r1)
            if (r3 < r2) goto L4d
            int r1 = r3 + 1
            goto L2f
        L4d:
            r1 = r3
            goto L3b
        L4f:
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
