package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class JvmSystemFileSystem extends okio.FileSystem {
    public JvmSystemFileSystem() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.util.List<okio.Path> list(okio.Path r5, boolean r6) {
            r4 = this;
            java.io.File r0 = r5.toFile()
            java.lang.String[] r1 = r0.list()
            if (r1 != 0) goto L2b
            if (r6 == 0) goto L29
            boolean r6 = r0.exists()
            if (r6 == 0) goto L1d
            java.lang.String r6 = "failed to list "
            java.lang.String r5 = j8.b.m(r5, r6)
            j8.o.y(r5)
            r5 = 0
            return r5
        L1d:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.String r0 = "no such file: "
            java.lang.String r5 = j8.b.m(r5, r0)
            r6.<init>(r5)
            throw r6
        L29:
            r5 = 0
            return r5
        L2b:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r0 = r1.length
            r2 = 0
        L32:
            if (r2 >= r0) goto L43
            r3 = r1[r2]
            r3.getClass()
            okio.Path r3 = r5.resolve(r3)
            r6.add(r3)
            int r2 = r2 + 1
            goto L32
        L43:
            tf.q.f1(r6)
            return r6
    }

    private final void requireCreate(okio.Path r2) {
            r1 = this;
            boolean r0 = r1.exists(r2)
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = " already exists."
            j8.o.h(r2, r0)
            return
    }

    private final void requireExist(okio.Path r2) {
            r1 = this;
            boolean r0 = r1.exists(r2)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.String r0 = " doesn't exist."
            j8.o.h(r2, r0)
            return
    }

    @Override // okio.FileSystem
    public okio.Sink appendingSink(okio.Path r1, boolean r2) {
            r0 = this;
            r1.getClass()
            if (r2 == 0) goto L8
            r0.requireExist(r1)
        L8:
            java.io.File r1 = r1.toFile()
            r2 = 1
            okio.Sink r1 = okio.Okio.sink(r1, r2)
            return r1
    }

    @Override // okio.FileSystem
    public void atomicMove(okio.Path r4, okio.Path r5) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            java.io.File r0 = r4.toFile()
            java.io.File r1 = r5.toFile()
            boolean r0 = r0.renameTo(r1)
            if (r0 == 0) goto L15
            return
        L15:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "failed to move "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " to "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // okio.FileSystem
    public okio.Path canonicalize(okio.Path r5) {
            r4 = this;
            r5.getClass()
            java.io.File r5 = r5.toFile()
            java.io.File r5 = r5.getCanonicalFile()
            boolean r0 = r5.exists()
            if (r0 == 0) goto L1b
            okio.Path$Companion r0 = okio.Path.Companion
            r1 = 1
            r2 = 0
            r3 = 0
            okio.Path r5 = okio.Path.Companion.get$default(r0, r5, r3, r1, r2)
            return r5
        L1b:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r0 = "no such file"
            r5.<init>(r0)
            throw r5
    }

    @Override // okio.FileSystem
    public void createDirectory(okio.Path r3, boolean r4) {
            r2 = this;
            r3.getClass()
            java.io.File r0 = r3.toFile()
            boolean r0 = r0.mkdir()
            if (r0 != 0) goto L2c
            okio.FileMetadata r0 = r2.metadataOrNull(r3)
            if (r0 == 0) goto L23
            boolean r0 = r0.isDirectory()
            r1 = 1
            if (r0 != r1) goto L23
            if (r4 != 0) goto L1d
            goto L2c
        L1d:
            java.lang.String r4 = " already exists."
            j8.o.h(r3, r4)
            return
        L23:
            java.lang.String r4 = "failed to create directory: "
            java.lang.String r3 = j8.b.m(r3, r4)
            j8.o.y(r3)
        L2c:
            return
    }

    @Override // okio.FileSystem
    public void createSymlink(okio.Path r1, okio.Path r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "unsupported"
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.FileSystem
    public void delete(okio.Path r3, boolean r4) {
            r2 = this;
            r3.getClass()
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L32
            java.io.File r0 = r3.toFile()
            boolean r1 = r0.delete()
            if (r1 != 0) goto L31
            boolean r0 = r0.exists()
            if (r0 != 0) goto L28
            if (r4 != 0) goto L1c
            goto L31
        L1c:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r0 = "no such file: "
            java.lang.String r3 = j8.b.m(r3, r0)
            r4.<init>(r3)
            throw r4
        L28:
            java.lang.String r4 = "failed to delete "
            java.lang.String r3 = j8.b.m(r3, r4)
            j8.o.y(r3)
        L31:
            return
        L32:
            java.io.InterruptedIOException r3 = new java.io.InterruptedIOException
            java.lang.String r4 = "interrupted"
            r3.<init>(r4)
            throw r3
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> list(okio.Path r2) {
            r1 = this;
            r2.getClass()
            r0 = 1
            java.util.List r2 = r1.list(r2, r0)
            r2.getClass()
            return r2
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> listOrNull(okio.Path r2) {
            r1 = this;
            r2.getClass()
            r0 = 0
            java.util.List r2 = r1.list(r2, r0)
            return r2
    }

    @Override // okio.FileSystem
    public okio.FileMetadata metadataOrNull(okio.Path r12) {
            r11 = this;
            r12.getClass()
            java.io.File r12 = r12.toFile()
            boolean r1 = r12.isFile()
            boolean r2 = r12.isDirectory()
            long r3 = r12.lastModified()
            long r5 = r12.length()
            if (r1 != 0) goto L2d
            if (r2 != 0) goto L2d
            r7 = 0
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 != 0) goto L2d
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L2d
            boolean r12 = r12.exists()
            if (r12 != 0) goto L2d
            r12 = 0
            return r12
        L2d:
            okio.FileMetadata r0 = new okio.FileMetadata
            java.lang.Long r12 = java.lang.Long.valueOf(r5)
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            r9 = 128(0x80, float:1.8E-43)
            r10 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadOnly(okio.Path r4) {
            r3 = this;
            r4.getClass()
            okio.JvmFileHandle r0 = new okio.JvmFileHandle
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.io.File r4 = r4.toFile()
            java.lang.String r2 = "r"
            r1.<init>(r4, r2)
            r4 = 0
            r0.<init>(r4, r1)
            return r0
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadWrite(okio.Path r2, boolean r3, boolean r4) {
            r1 = this;
            r2.getClass()
            if (r3 == 0) goto Lf
            if (r4 != 0) goto L8
            goto Lf
        L8:
            java.lang.String r2 = "Cannot require mustCreate and mustExist at the same time."
            j8.o.t(r2)
            r2 = 0
            return r2
        Lf:
            if (r3 == 0) goto L14
            r1.requireCreate(r2)
        L14:
            if (r4 == 0) goto L19
            r1.requireExist(r2)
        L19:
            okio.JvmFileHandle r3 = new okio.JvmFileHandle
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile
            java.io.File r2 = r2.toFile()
            java.lang.String r0 = "rw"
            r4.<init>(r2, r0)
            r2 = 1
            r3.<init>(r2, r4)
            return r3
    }

    @Override // okio.FileSystem
    public okio.Sink sink(okio.Path r3, boolean r4) {
            r2 = this;
            r3.getClass()
            if (r4 == 0) goto L8
            r2.requireCreate(r3)
        L8:
            java.io.File r3 = r3.toFile()
            r4 = 1
            r0 = 0
            r1 = 0
            okio.Sink r3 = okio.Okio.sink$default(r3, r1, r4, r0)
            return r3
    }

    @Override // okio.FileSystem
    public okio.Source source(okio.Path r1) {
            r0 = this;
            r1.getClass()
            java.io.File r1 = r1.toFile()
            okio.Source r1 = okio.Okio.source(r1)
            return r1
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "JvmSystemFileSystem"
            return r0
    }
}
