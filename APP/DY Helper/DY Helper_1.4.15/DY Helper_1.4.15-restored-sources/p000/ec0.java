package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ec0 {

    /* JADX INFO: renamed from: α */
    public static final android.os.Handler f3479 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.ExecutorService f3480 = null;

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.ec0.f3479 = r0
            aj r0 = new aj
            r1 = 7
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            p000.ec0.f3480 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.String m1897(java.lang.Throwable r2) {
            java.lang.String r0 = r2.getMessage()
            if (r0 != 0) goto Le
            java.lang.Class r2 = r2.getClass()
            java.lang.String r0 = r2.getSimpleName()
        Le:
            r2 = 10
            r1 = 32
            java.lang.String r2 = r0.replace(r2, r1)
            r2.getClass()
            r0 = 13
            java.lang.String r2 = r2.replace(r0, r1)
            r2.getClass()
            r0 = 120(0x78, float:1.68E-43)
            java.lang.String r2 = p000.q02.m4693(r2, r0)
            return r2
    }
}
