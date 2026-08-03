package yc;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.Set f22416a = null;

    static {
            java.lang.Class<yc.a> r0 = yc.a.class
            mh.d.b(r0)
            java.io.File r0 = new java.io.File     // Catch: java.io.IOException -> L2d
            java.lang.String r1 = "."
            r0.<init>(r1)     // Catch: java.io.IOException -> L2d
            java.io.File r0 = r0.getCanonicalFile()     // Catch: java.io.IOException -> L2d
            r0.toPath()
            java.lang.String r0 = "jar"
            java.lang.String r1 = "apk"
            java.lang.String r2 = "zip"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.HashSet r1 = new java.util.HashSet
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.<init>(r0)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r1)
            yc.a.f22416a = r0
            return
        L2d:
            r0 = move-exception
            java.lang.String r1 = "Failed to init current working dir constant"
            ah.a.p(r1, r0)
            return
    }
}
