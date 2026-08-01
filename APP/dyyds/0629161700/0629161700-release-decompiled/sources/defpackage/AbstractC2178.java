package defpackage;

/* JADX INFO: renamed from: ᲈᛱᲀᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2178 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.util.concurrent.CopyOnWriteArraySet f9257 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.util.Map f9258 = null;

    static {
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            defpackage.AbstractC2178.f9257 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Class<ᲈᛴᛶᲁ> r1 = defpackage.C2225.class
            java.lang.Package r2 = r1.getPackage()
            if (r2 == 0) goto L19
            java.lang.String r2 = r2.getName()
            goto L1a
        L19:
            r2 = 0
        L1a:
            if (r2 == 0) goto L21
            java.lang.String r3 = "OkHttp"
            r0.put(r2, r3)
        L21:
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "okhttp.OkHttpClient"
            r0.put(r1, r2)
            java.lang.Class<ᲁᛵᛲᲇ> r1 = defpackage.AbstractC1853.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "okhttp.Http2"
            r0.put(r1, r2)
            java.lang.Class<ᛵᲀᲇᛸ> r1 = defpackage.C0964.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "okhttp.TaskRunner"
            r0.put(r1, r2)
            java.lang.String r1 = "okhttp3.mockwebserver.MockWebServer"
            java.lang.String r2 = "okhttp.MockWebServer"
            r0.put(r1, r2)
            int r1 = r0.size()
            if (r1 == 0) goto L71
            r2 = 1
            if (r1 == r2) goto L56
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            goto L73
        L56:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.util.Map r1 = java.util.Collections.singletonMap(r1, r0)
            goto L73
        L71:
            ᲇᛴᛳᲇ r1 = defpackage.C2033.f8764
        L73:
            defpackage.AbstractC2178.f9258 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m3578(java.lang.String r1, java.lang.String r2) {
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.AbstractC2178.f9257
            boolean r0 = r0.add(r1)
            if (r0 == 0) goto L2e
            r0 = 0
            r1.setUseParentHandlers(r0)
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r2, r0)
            if (r0 == 0) goto L1a
            java.util.logging.Level r2 = java.util.logging.Level.FINE
            goto L26
        L1a:
            r0 = 4
            boolean r2 = android.util.Log.isLoggable(r2, r0)
            if (r2 == 0) goto L24
            java.util.logging.Level r2 = java.util.logging.Level.INFO
            goto L26
        L24:
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
        L26:
            r1.setLevel(r2)
            ᲀᛸᛴᛲ r2 = defpackage.C1721.f7638
            r1.addHandler(r2)
        L2e:
            return
    }
}
