package p000;

/* JADX INFO: renamed from: o2 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0608o2 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.CopyOnWriteArraySet f7871 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.Map f7872 = null;

    static {
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            p000.AbstractC0608o2.f7871 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Class<t41> r1 = p000.t41.class
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
            java.lang.Class<vf0> r1 = p000.vf0.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "okhttp.Http2"
            r0.put(r1, r2)
            java.lang.Class<x22> r1 = p000.x22.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "okhttp.TaskRunner"
            r0.put(r1, r2)
            java.lang.String r1 = "okhttp3.mockwebserver.MockWebServer"
            java.lang.String r2 = "okhttp.MockWebServer"
            r0.put(r1, r2)
            java.util.Map r0 = p000.ex0.m1975(r0)
            p000.AbstractC0608o2.f7872 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m4157(java.lang.String r1, java.lang.String r2) {
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = p000.AbstractC0608o2.f7871
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
            p2 r2 = p000.C0672p2.f8395
            r1.addHandler(r2)
        L2e:
            return
    }
}
