package p000;

/* JADX INFO: renamed from: xp */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0992xp {

    /* JADX INFO: renamed from: α */
    public static final java.util.List f12251 = null;

    static {
            f2 r0 = new f2     // Catch: java.lang.Throwable -> L1e
            r0.<init>()     // Catch: java.lang.Throwable -> L1e
            r1 = 1
            wp[] r1 = new p000.InterfaceC0955wp[r1]     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            r1[r2] = r0     // Catch: java.lang.Throwable -> L1e
            java.util.List r0 = java.util.Arrays.asList(r1)     // Catch: java.lang.Throwable -> L1e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1e
            ss1 r0 = p000.us1.m5951(r0)
            java.util.List r0 = p000.us1.m5948(r0)
            p000.AbstractC0992xp.f12251 = r0
            return
        L1e:
            r0 = move-exception
            java.util.ServiceConfigurationError r1 = new java.util.ServiceConfigurationError
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
    }
}
