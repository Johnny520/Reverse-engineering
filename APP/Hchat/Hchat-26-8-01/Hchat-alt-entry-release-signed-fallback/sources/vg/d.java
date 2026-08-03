package vg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.List f14327a = null;

    static {
            rg.b r0 = new rg.b     // Catch: java.lang.Throwable -> L1e
            r0.<init>()     // Catch: java.lang.Throwable -> L1e
            r1 = 1
            qg.r[] r1 = new qg.r[r1]     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            r1[r2] = r0     // Catch: java.lang.Throwable -> L1e
            java.util.List r0 = java.util.Arrays.asList(r1)     // Catch: java.lang.Throwable -> L1e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1e
            ng.j r0 = ng.m.R(r0)
            java.util.List r0 = ng.m.b0(r0)
            vg.d.f14327a = r0
            return
        L1e:
            r0 = move-exception
            java.util.ServiceConfigurationError r1 = new java.util.ServiceConfigurationError
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
    }
}
