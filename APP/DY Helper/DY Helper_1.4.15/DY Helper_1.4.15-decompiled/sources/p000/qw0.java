package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class qw0 {

    /* JADX INFO: renamed from: α */
    public static final p000.nc0 f9151 = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            int r1 = p000.j22.f5301
            r1 = 0
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> La
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 == 0) goto L10
            java.lang.Boolean.parseBoolean(r0)
        L10:
            c2 r0 = new c2     // Catch: java.lang.Throwable -> L76
            r0.<init>()     // Catch: java.lang.Throwable -> L76
            c2[] r0 = new p000.C0098c2[]{r0}     // Catch: java.lang.Throwable -> L76
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> L76
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L76
            ss1 r0 = p000.us1.m5951(r0)
            java.util.List r0 = p000.us1.m5948(r0)
            java.util.Iterator r0 = r0.iterator()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L34
            goto L54
        L34:
            java.lang.Object r1 = r0.next()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L3f
            goto L54
        L3f:
            r2 = r1
            c2 r2 = (p000.C0098c2) r2
            r2.getClass()
        L45:
            java.lang.Object r2 = r0.next()
            c2 r2 = (p000.C0098c2) r2
            r2.getClass()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L45
        L54:
            c2 r1 = (p000.C0098c2) r1
            if (r1 == 0) goto L70
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r0 == 0) goto L6a
            nc0 r1 = new nc0
            android.os.Handler r0 = p000.oc0.m4217(r0)
            r1.<init>(r0)
            p000.qw0.f9151 = r1
            return
        L6a:
            java.lang.String r0 = "The main looper is not available"
            p000.C1080.m7279(r0)
            return
        L70:
            java.lang.String r0 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            p000.C1080.m7279(r0)
            return
        L76:
            r0 = move-exception
            java.util.ServiceConfigurationError r1 = new java.util.ServiceConfigurationError
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
    }
}
