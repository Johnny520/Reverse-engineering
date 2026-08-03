package vg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rg.e f14353a = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            int r1 = vg.s.f14359a
            r1 = 0
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> La
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 == 0) goto L10
            java.lang.Boolean.parseBoolean(r0)
        L10:
            rg.a r0 = new rg.a     // Catch: java.lang.Throwable -> L76
            r0.<init>()     // Catch: java.lang.Throwable -> L76
            rg.a[] r0 = new rg.a[]{r0}     // Catch: java.lang.Throwable -> L76
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> L76
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L76
            ng.j r0 = ng.m.R(r0)
            java.util.List r0 = ng.m.b0(r0)
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
            rg.a r2 = (rg.a) r2
            r2.getClass()
        L45:
            java.lang.Object r2 = r0.next()
            rg.a r2 = (rg.a) r2
            r2.getClass()
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L45
        L54:
            rg.a r1 = (rg.a) r1
            if (r1 == 0) goto L70
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r0 == 0) goto L6a
            rg.e r1 = new rg.e
            android.os.Handler r0 = rg.g.b(r0)
            r1.<init>(r0)
            vg.m.f14353a = r1
            return
        L6a:
            java.lang.String r0 = "The main looper is not available"
            j8.o.A(r0)
            return
        L70:
            java.lang.String r0 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            j8.o.A(r0)
            return
        L76:
            r0 = move-exception
            java.util.ServiceConfigurationError r1 = new java.util.ServiceConfigurationError
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
    }
}
