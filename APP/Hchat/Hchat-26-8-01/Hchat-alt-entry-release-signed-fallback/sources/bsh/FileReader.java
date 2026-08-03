package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class FileReader extends java.io.InputStreamReader {
    public FileReader(java.io.File r2) {
            r1 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public FileReader(java.io.FileDescriptor r2) {
            r1 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public FileReader(java.io.InputStream r2) {
            r1 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            r1.<init>(r2, r0)
            return
    }

    public FileReader(java.lang.String r2) {
            r1 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }
}
