package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class NioFileSystemWrappingFileSystem extends okio.NioSystemFileSystem {
    private final java.nio.file.FileSystem nioFileSystem;

    public NioFileSystemWrappingFileSystem(java.nio.file.FileSystem r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.nioFileSystem = r1
            return
    }

    private final java.util.List<okio.Path> list(okio.Path r7, boolean r8) {
            r6 = this;
            java.nio.file.Path r0 = r6.resolve(r7)
            r1 = 0
            r2 = 0
            java.lang.String r3 = "*"
            r0.getClass()     // Catch: java.lang.Exception -> L44
            java.nio.file.DirectoryStream r3 = java.nio.file.Files.newDirectoryStream(r0, r3)     // Catch: java.lang.Exception -> L44
            r3.getClass()     // Catch: java.lang.Throwable -> L3d
            java.util.List r4 = tf.m.P1(r3)     // Catch: java.lang.Throwable -> L3d
            ig.a.i(r3, r2)     // Catch: java.lang.Exception -> L44
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r4.iterator()
        L22:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r8.next()
            java.nio.file.Path r0 = (java.nio.file.Path) r0
            okio.Path$Companion r3 = okio.Path.Companion
            r4 = 1
            okio.Path r0 = okio.Path.Companion.get$default(r3, r0, r1, r4, r2)
            r7.add(r0)
            goto L22
        L39:
            tf.q.f1(r7)
            return r7
        L3d:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L3f
        L3f:
            r5 = move-exception
            ig.a.i(r3, r4)     // Catch: java.lang.Exception -> L44
            throw r5     // Catch: java.lang.Exception -> L44
        L44:
            if (r8 == 0) goto L6b
            java.nio.file.LinkOption[] r8 = new java.nio.file.LinkOption[r1]
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r1)
            java.nio.file.LinkOption[] r8 = (java.nio.file.LinkOption[]) r8
            boolean r8 = java.nio.file.Files.exists(r0, r8)
            if (r8 == 0) goto L5f
            java.lang.String r8 = "failed to list "
            java.lang.String r7 = j8.b.m(r7, r8)
            j8.o.y(r7)
            r7 = 0
            return r7
        L5f:
            java.io.FileNotFoundException r8 = new java.io.FileNotFoundException
            java.lang.String r0 = "no such file: "
            java.lang.String r7 = j8.b.m(r7, r0)
            r8.<init>(r7)
            throw r8
        L6b:
            return r2
    }

    private final java.nio.file.Path resolve(okio.Path r3) {
            r2 = this;
            java.nio.file.FileSystem r0 = r2.nioFileSystem
            java.lang.String r3 = r3.toString()
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.nio.file.Path r3 = r0.getPath(r3, r1)
            r3.getClass()
            return r3
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.Sink appendingSink(okio.Path r3, boolean r4) {
            r2 = this;
            r3.getClass()
            uf.c r0 = a.a.E()
            java.nio.file.StandardOpenOption r1 = java.nio.file.StandardOpenOption.APPEND
            r0.add(r1)
            if (r4 != 0) goto L13
            java.nio.file.StandardOpenOption r4 = java.nio.file.StandardOpenOption.CREATE
            r0.add(r4)
        L13:
            uf.c r4 = a.a.t(r0)
            java.nio.file.Path r3 = r2.resolve(r3)
            r0 = 0
            java.nio.file.StandardOpenOption[] r0 = new java.nio.file.StandardOpenOption[r0]
            java.lang.Object[] r4 = r4.toArray(r0)
            java.nio.file.StandardOpenOption[] r4 = (java.nio.file.StandardOpenOption[]) r4
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.io.OutputStream r3 = java.nio.file.Files.newOutputStream(r3, r4)
            r3.getClass()
            okio.Sink r3 = okio.Okio.sink(r3)
            return r3
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public void atomicMove(okio.Path r5, okio.Path r6) {
            r4 = this;
            r5.getClass()
            r6.getClass()
            java.nio.file.Path r5 = r4.resolve(r5)     // Catch: java.nio.file.NoSuchFileException -> L29 java.lang.UnsupportedOperationException -> L2b
            java.nio.file.Path r6 = r4.resolve(r6)     // Catch: java.nio.file.NoSuchFileException -> L29 java.lang.UnsupportedOperationException -> L2b
            r0 = 2
            java.nio.file.CopyOption[] r1 = new java.nio.file.CopyOption[r0]     // Catch: java.nio.file.NoSuchFileException -> L29 java.lang.UnsupportedOperationException -> L2b
            java.nio.file.StandardCopyOption r2 = java.nio.file.StandardCopyOption.ATOMIC_MOVE     // Catch: java.nio.file.NoSuchFileException -> L29 java.lang.UnsupportedOperationException -> L2b
            r3 = 0
            r1[r3] = r2     // Catch: java.nio.file.NoSuchFileException -> L29 java.lang.UnsupportedOperationException -> L2b
            java.nio.file.StandardCopyOption r2 = java.nio.file.StandardCopyOption.REPLACE_EXISTING     // Catch: java.nio.file.NoSuchFileException -> L29 java.lang.UnsupportedOperationException -> L2b
            r3 = 1
            r1[r3] = r2     // Catch: java.nio.file.NoSuchFileException -> L29 java.lang.UnsupportedOperationException -> L2b
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)     // Catch: java.nio.file.NoSuchFileException -> L29 java.lang.UnsupportedOperationException -> L2b
            java.nio.file.CopyOption[] r0 = (java.nio.file.CopyOption[]) r0     // Catch: java.nio.file.NoSuchFileException -> L29 java.lang.UnsupportedOperationException -> L2b
            java.nio.file.Path r5 = java.nio.file.Files.move(r5, r6, r0)     // Catch: java.nio.file.NoSuchFileException -> L29 java.lang.UnsupportedOperationException -> L2b
            r5.getClass()     // Catch: java.nio.file.NoSuchFileException -> L29 java.lang.UnsupportedOperationException -> L2b
            return
        L29:
            r5 = move-exception
            goto L31
        L2b:
            java.lang.String r5 = "atomic move not supported"
            j8.o.y(r5)
            return
        L31:
            java.io.FileNotFoundException r6 = new java.io.FileNotFoundException
            java.lang.String r5 = r5.getMessage()
            r6.<init>(r5)
            throw r6
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.Path canonicalize(okio.Path r6) {
            r5 = this;
            r6.getClass()
            okio.Path$Companion r0 = okio.Path.Companion     // Catch: java.nio.file.NoSuchFileException -> L1a
            java.nio.file.Path r1 = r5.resolve(r6)     // Catch: java.nio.file.NoSuchFileException -> L1a
            r2 = 0
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r2]     // Catch: java.nio.file.NoSuchFileException -> L1a
            java.nio.file.Path r1 = r1.toRealPath(r3)     // Catch: java.nio.file.NoSuchFileException -> L1a
            r1.getClass()     // Catch: java.nio.file.NoSuchFileException -> L1a
            r3 = 1
            r4 = 0
            okio.Path r6 = okio.Path.Companion.get$default(r0, r1, r2, r3, r4)     // Catch: java.nio.file.NoSuchFileException -> L1a
            return r6
        L1a:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = "no such file: "
            java.lang.String r6 = j8.b.m(r6, r1)
            r0.<init>(r6)
            throw r0
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public void createDirectory(okio.Path r4, boolean r5) {
            r3 = this;
            r4.getClass()
            okio.FileMetadata r0 = r3.metadataOrNull(r4)
            r1 = 0
            if (r0 == 0) goto L12
            boolean r0 = r0.isDirectory()
            r2 = 1
            if (r0 != r2) goto L12
            goto L13
        L12:
            r2 = r1
        L13:
            if (r2 == 0) goto L1e
            if (r5 != 0) goto L18
            goto L1e
        L18:
            java.lang.String r5 = " already exists."
            j8.o.h(r4, r5)
            return
        L1e:
            java.nio.file.Path r5 = r3.resolve(r4)     // Catch: java.io.IOException -> L32
            java.nio.file.attribute.FileAttribute[] r0 = new java.nio.file.attribute.FileAttribute[r1]     // Catch: java.io.IOException -> L32
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.io.IOException -> L32
            java.nio.file.attribute.FileAttribute[] r0 = (java.nio.file.attribute.FileAttribute[]) r0     // Catch: java.io.IOException -> L32
            java.nio.file.Path r5 = java.nio.file.Files.createDirectory(r5, r0)     // Catch: java.io.IOException -> L32
            r5.getClass()     // Catch: java.io.IOException -> L32
            return
        L32:
            r5 = move-exception
            if (r2 == 0) goto L36
            return
        L36:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "failed to create directory: "
            java.lang.String r4 = j8.b.m(r4, r1)
            r0.<init>(r4, r5)
            throw r0
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public void createSymlink(okio.Path r3, okio.Path r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            java.nio.file.Path r3 = r2.resolve(r3)
            java.nio.file.Path r4 = r2.resolve(r4)
            r0 = 0
            java.nio.file.attribute.FileAttribute[] r1 = new java.nio.file.attribute.FileAttribute[r0]
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.attribute.FileAttribute[] r0 = (java.nio.file.attribute.FileAttribute[]) r0
            java.nio.file.Path r3 = java.nio.file.Files.createSymbolicLink(r3, r4, r0)
            r3.getClass()
            return
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public void delete(okio.Path r3, boolean r4) {
            r2 = this;
            r3.getClass()
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L3a
            java.nio.file.Path r0 = r2.resolve(r3)
            java.nio.file.Files.delete(r0)     // Catch: java.io.IOException -> L11 java.nio.file.NoSuchFileException -> L2b
            return
        L11:
            r4 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r4]
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r1, r4)
            java.nio.file.LinkOption[] r4 = (java.nio.file.LinkOption[]) r4
            boolean r4 = java.nio.file.Files.exists(r0, r4)
            if (r4 != 0) goto L21
            goto L2d
        L21:
            java.lang.String r4 = "failed to delete "
            java.lang.String r3 = j8.b.m(r3, r4)
            j8.o.y(r3)
            return
        L2b:
            if (r4 != 0) goto L2e
        L2d:
            return
        L2e:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r0 = "no such file: "
            java.lang.String r3 = j8.b.m(r3, r0)
            r4.<init>(r3)
            throw r4
        L3a:
            java.io.InterruptedIOException r3 = new java.io.InterruptedIOException
            java.lang.String r4 = "interrupted"
            r3.<init>(r4)
            throw r3
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public java.util.List<okio.Path> list(okio.Path r2) {
            r1 = this;
            r2.getClass()
            r0 = 1
            java.util.List r2 = r1.list(r2, r0)
            r2.getClass()
            return r2
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public java.util.List<okio.Path> listOrNull(okio.Path r2) {
            r1 = this;
            r2.getClass()
            r0 = 0
            java.util.List r2 = r1.list(r2, r0)
            return r2
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public okio.FileMetadata metadataOrNull(okio.Path r1) {
            r0 = this;
            r1.getClass()
            java.nio.file.Path r1 = r0.resolve(r1)
            okio.FileMetadata r1 = r0.metadataOrNull(r1)
            return r1
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.FileHandle openReadOnly(okio.Path r5) {
            r4 = this;
            r5.getClass()
            java.nio.file.Path r0 = r4.resolve(r5)     // Catch: java.nio.file.NoSuchFileException -> L1c
            r1 = 1
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r1]     // Catch: java.nio.file.NoSuchFileException -> L1c
            java.nio.file.StandardOpenOption r2 = java.nio.file.StandardOpenOption.READ     // Catch: java.nio.file.NoSuchFileException -> L1c
            r3 = 0
            r1[r3] = r2     // Catch: java.nio.file.NoSuchFileException -> L1c
            java.nio.channels.FileChannel r5 = java.nio.channels.FileChannel.open(r0, r1)     // Catch: java.nio.file.NoSuchFileException -> L1c
            okio.NioFileSystemFileHandle r0 = new okio.NioFileSystemFileHandle
            r5.getClass()
            r0.<init>(r3, r5)
            return r0
        L1c:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = "no such file: "
            java.lang.String r5 = j8.b.m(r5, r1)
            r0.<init>(r5)
            throw r0
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.FileHandle openReadWrite(okio.Path r3, boolean r4, boolean r5) {
            r2 = this;
            r3.getClass()
            if (r4 == 0) goto Lf
            if (r5 != 0) goto L8
            goto Lf
        L8:
            java.lang.String r3 = "Cannot require mustCreate and mustExist at the same time."
            j8.o.t(r3)
            r3 = 0
            return r3
        Lf:
            uf.c r0 = a.a.E()
            java.nio.file.StandardOpenOption r1 = java.nio.file.StandardOpenOption.READ
            r0.add(r1)
            java.nio.file.StandardOpenOption r1 = java.nio.file.StandardOpenOption.WRITE
            r0.add(r1)
            if (r4 == 0) goto L25
            java.nio.file.StandardOpenOption r4 = java.nio.file.StandardOpenOption.CREATE_NEW
            r0.add(r4)
            goto L2c
        L25:
            if (r5 != 0) goto L2c
            java.nio.file.StandardOpenOption r4 = java.nio.file.StandardOpenOption.CREATE
            r0.add(r4)
        L2c:
            uf.c r4 = a.a.t(r0)
            java.nio.file.Path r5 = r2.resolve(r3)     // Catch: java.nio.file.NoSuchFileException -> L52
            r0 = 0
            java.nio.file.StandardOpenOption[] r0 = new java.nio.file.StandardOpenOption[r0]     // Catch: java.nio.file.NoSuchFileException -> L52
            java.lang.Object[] r4 = r4.toArray(r0)     // Catch: java.nio.file.NoSuchFileException -> L52
            java.nio.file.StandardOpenOption[] r4 = (java.nio.file.StandardOpenOption[]) r4     // Catch: java.nio.file.NoSuchFileException -> L52
            int r0 = r4.length     // Catch: java.nio.file.NoSuchFileException -> L52
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)     // Catch: java.nio.file.NoSuchFileException -> L52
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4     // Catch: java.nio.file.NoSuchFileException -> L52
            java.nio.channels.FileChannel r3 = java.nio.channels.FileChannel.open(r5, r4)     // Catch: java.nio.file.NoSuchFileException -> L52
            okio.NioFileSystemFileHandle r4 = new okio.NioFileSystemFileHandle
            r3.getClass()
            r5 = 1
            r4.<init>(r5, r3)
            return r4
        L52:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r5 = "no such file: "
            java.lang.String r3 = j8.b.m(r3, r5)
            r4.<init>(r3)
            throw r4
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.Sink sink(okio.Path r3, boolean r4) {
            r2 = this;
            r3.getClass()
            uf.c r0 = a.a.E()
            if (r4 == 0) goto Le
            java.nio.file.StandardOpenOption r4 = java.nio.file.StandardOpenOption.CREATE_NEW
            r0.add(r4)
        Le:
            uf.c r4 = a.a.t(r0)
            java.nio.file.Path r0 = r2.resolve(r3)     // Catch: java.nio.file.NoSuchFileException -> L39
            r1 = 0
            java.nio.file.StandardOpenOption[] r1 = new java.nio.file.StandardOpenOption[r1]     // Catch: java.nio.file.NoSuchFileException -> L39
            java.lang.Object[] r4 = r4.toArray(r1)     // Catch: java.nio.file.NoSuchFileException -> L39
            java.nio.file.StandardOpenOption[] r4 = (java.nio.file.StandardOpenOption[]) r4     // Catch: java.nio.file.NoSuchFileException -> L39
            int r1 = r4.length     // Catch: java.nio.file.NoSuchFileException -> L39
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)     // Catch: java.nio.file.NoSuchFileException -> L39
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4     // Catch: java.nio.file.NoSuchFileException -> L39
            int r1 = r4.length     // Catch: java.nio.file.NoSuchFileException -> L39
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)     // Catch: java.nio.file.NoSuchFileException -> L39
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4     // Catch: java.nio.file.NoSuchFileException -> L39
            java.io.OutputStream r4 = java.nio.file.Files.newOutputStream(r0, r4)     // Catch: java.nio.file.NoSuchFileException -> L39
            r4.getClass()     // Catch: java.nio.file.NoSuchFileException -> L39
            okio.Sink r3 = okio.Okio.sink(r4)     // Catch: java.nio.file.NoSuchFileException -> L39
            return r3
        L39:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r0 = "no such file: "
            java.lang.String r3 = j8.b.m(r3, r0)
            r4.<init>(r3)
            throw r4
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.Source source(okio.Path r4) {
            r3 = this;
            r4.getClass()
            java.nio.file.Path r0 = r3.resolve(r4)     // Catch: java.nio.file.NoSuchFileException -> L1c
            r1 = 0
            java.nio.file.OpenOption[] r2 = new java.nio.file.OpenOption[r1]     // Catch: java.nio.file.NoSuchFileException -> L1c
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)     // Catch: java.nio.file.NoSuchFileException -> L1c
            java.nio.file.OpenOption[] r1 = (java.nio.file.OpenOption[]) r1     // Catch: java.nio.file.NoSuchFileException -> L1c
            java.io.InputStream r0 = java.nio.file.Files.newInputStream(r0, r1)     // Catch: java.nio.file.NoSuchFileException -> L1c
            r0.getClass()     // Catch: java.nio.file.NoSuchFileException -> L1c
            okio.Source r4 = okio.Okio.source(r0)     // Catch: java.nio.file.NoSuchFileException -> L1c
            return r4
        L1c:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = "no such file: "
            java.lang.String r4 = j8.b.m(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem
    public java.lang.String toString() {
            r1 = this;
            java.nio.file.FileSystem r0 = r1.nioFileSystem
            java.lang.Class r0 = r0.getClass()
            gg.f r0 = gg.v.a(r0)
            java.lang.String r0 = r0.c()
            r0.getClass()
            return r0
    }
}
