package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛱᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0829 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final java.util.Map f2704 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final java.util.concurrent.CopyOnWriteArraySet f2705 = null;

    static {
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            xhss.AbstractC0829.f2705 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Class<xhss.ᛵᛸᛷᛲ> r1 = xhss.C0504.class
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
            java.lang.Class<xhss.ᲁᛱᛱᲇ> r1 = xhss.AbstractC0922.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "okhttp.Http2"
            r0.put(r1, r2)
            java.lang.Class<xhss.ᛸᛱᛴᛳ> r1 = xhss.C0723.class
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
            xhss.ᛶᛵᲈᛴ r1 = xhss.C0566.f1998
        L73:
            xhss.AbstractC0829.f2704 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static void m1410(java.lang.String r1, java.lang.String r2) {
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = xhss.AbstractC0829.f2705
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
            xhss.ᛵᲇᲈ r2 = xhss.C0525.f1918
            r1.addHandler(r2)
        L2e:
            return
    }
}
