package ye;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f22424a = null;

    static {
            java.lang.Class<ye.a> r0 = ye.a.class
            java.lang.String r1 = "/android/res-map.txt"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)     // Catch: java.lang.Exception -> L20
            java.util.HashMap r1 = be.h.S(r0)     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L11
            r0.close()     // Catch: java.lang.Exception -> L20
        L11:
            ye.a.f22424a = r1
            return
        L14:
            r1 = move-exception
            if (r0 == 0) goto L1f
            r0.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Exception -> L20
        L1f:
            throw r1     // Catch: java.lang.Exception -> L20
        L20:
            r0 = move-exception
            af.g r1 = new af.g
            java.lang.String r2 = "Failed to load android resource file (res-map.txt)"
            r1.<init>(r2, r0)
            throw r1
    }
}
