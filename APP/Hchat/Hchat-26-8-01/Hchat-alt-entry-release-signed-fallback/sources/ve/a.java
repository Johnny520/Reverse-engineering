package ve;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.nio.file.Path f14312a = null;

    static {
            java.lang.String r0 = "jadx-temp-"
            r1 = 0
            java.nio.file.attribute.FileAttribute[] r1 = new java.nio.file.attribute.FileAttribute[r1]     // Catch: java.lang.Exception -> L13
            java.nio.file.Path r0 = java.nio.file.Files.createTempDirectory(r0, r1)     // Catch: java.lang.Exception -> L13
            ve.a.f14312a = r0     // Catch: java.lang.Exception -> L13
            java.io.File r0 = r0.toFile()     // Catch: java.lang.Exception -> L13
            r0.deleteOnExit()     // Catch: java.lang.Exception -> L13
            return
        L13:
            r0 = move-exception
            java.lang.String r1 = "Failed to create temp directory"
            ah.a.p(r1, r0)
            return
    }
}
