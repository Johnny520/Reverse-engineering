package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ZipFileSystem extends okio.FileSystem {
    private static final okio.ZipFileSystem.Companion Companion = null;
    private static final okio.Path ROOT = null;
    private final java.lang.String comment;
    private final java.util.Map<okio.Path, okio.internal.ZipEntry> entries;
    private final okio.FileSystem fileSystem;
    private final okio.Path zipPath;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(gg.g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final okio.Path getROOT() {
                r1 = this;
                okio.Path r0 = okio.ZipFileSystem.access$getROOT$cp()
                return r0
        }
    }

    static {
            okio.ZipFileSystem$Companion r0 = new okio.ZipFileSystem$Companion
            r1 = 0
            r0.<init>(r1)
            okio.ZipFileSystem.Companion = r0
            okio.Path$Companion r0 = okio.Path.Companion
            r2 = 0
            r3 = 1
            java.lang.String r4 = "/"
            okio.Path r0 = okio.Path.Companion.get$default(r0, r4, r2, r3, r1)
            okio.ZipFileSystem.ROOT = r0
            return
    }

    public ZipFileSystem(okio.Path r1, okio.FileSystem r2, java.util.Map<okio.Path, okio.internal.ZipEntry> r3, java.lang.String r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.zipPath = r1
            r0.fileSystem = r2
            r0.entries = r3
            r0.comment = r4
            return
    }

    public static final /* synthetic */ okio.Path access$getROOT$cp() {
            okio.Path r0 = okio.ZipFileSystem.ROOT
            return r0
    }

    private final okio.Path canonicalizeInternal(okio.Path r3) {
            r2 = this;
            okio.Path r0 = okio.ZipFileSystem.ROOT
            r1 = 1
            okio.Path r3 = r0.resolve(r3, r1)
            return r3
    }

    private final java.util.List<okio.Path> list(okio.Path r3, boolean r4) {
            r2 = this;
            okio.Path r0 = r2.canonicalizeInternal(r3)
            java.util.Map<okio.Path, okio.internal.ZipEntry> r1 = r2.entries
            java.lang.Object r0 = r1.get(r0)
            okio.internal.ZipEntry r0 = (okio.internal.ZipEntry) r0
            if (r0 != 0) goto L1d
            if (r4 != 0) goto L12
            r3 = 0
            return r3
        L12:
            java.lang.String r4 = "not a directory: "
            java.lang.String r3 = j8.b.m(r3, r4)
            j8.o.y(r3)
            r3 = 0
            return r3
        L1d:
            java.util.List r3 = r0.getChildren()
            java.util.List r3 = tf.m.P1(r3)
            return r3
    }

    @Override // okio.FileSystem
    public okio.Sink appendingSink(okio.Path r1, boolean r2) {
            r0 = this;
            r1.getClass()
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "zip file systems are read-only"
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.FileSystem
    public void atomicMove(okio.Path r1, okio.Path r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "zip file systems are read-only"
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.FileSystem
    public okio.Path canonicalize(okio.Path r3) {
            r2 = this;
            r3.getClass()
            okio.Path r0 = r2.canonicalizeInternal(r3)
            java.util.Map<okio.Path, okio.internal.ZipEntry> r1 = r2.entries
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L10
            return r0
        L10:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.<init>(r3)
            throw r0
    }

    @Override // okio.FileSystem
    public void createDirectory(okio.Path r1, boolean r2) {
            r0 = this;
            r1.getClass()
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "zip file systems are read-only"
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.FileSystem
    public void createSymlink(okio.Path r1, okio.Path r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "zip file systems are read-only"
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.FileSystem
    public void delete(okio.Path r1, boolean r2) {
            r0 = this;
            r1.getClass()
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "zip file systems are read-only"
            r1.<init>(r2)
            throw r1
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
    public okio.FileMetadata metadataOrNull(okio.Path r14) {
            r13 = this;
            r14.getClass()
            okio.Path r14 = r13.canonicalizeInternal(r14)
            java.util.Map<okio.Path, okio.internal.ZipEntry> r0 = r13.entries
            java.lang.Object r14 = r0.get(r14)
            okio.internal.ZipEntry r14 = (okio.internal.ZipEntry) r14
            r1 = 0
            if (r14 != 0) goto L13
            return r1
        L13:
            okio.FileMetadata r2 = new okio.FileMetadata
            boolean r0 = r14.isDirectory()
            r3 = r0 ^ 1
            boolean r4 = r14.isDirectory()
            boolean r0 = r14.isDirectory()
            if (r0 == 0) goto L27
            r6 = r1
            goto L30
        L27:
            long r5 = r14.getSize()
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r6 = r0
        L30:
            java.lang.Long r8 = r14.getLastModifiedAtMillis()
            r11 = 128(0x80, float:1.8E-43)
            r12 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            long r3 = r14.getOffset()
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L49
            return r2
        L49:
            okio.FileSystem r0 = r13.fileSystem
            okio.Path r3 = r13.zipPath
            okio.FileHandle r3 = r0.openReadOnly(r3)
            long r4 = r14.getOffset()     // Catch: java.lang.Throwable -> L7a
            okio.Source r14 = r3.source(r4)     // Catch: java.lang.Throwable -> L7a
            okio.BufferedSource r14 = okio.Okio.buffer(r14)     // Catch: java.lang.Throwable -> L7a
            okio.FileMetadata r2 = okio.internal.ZipFilesKt.readLocalHeader(r14, r2)     // Catch: java.lang.Throwable -> L6c
            if (r14 == 0) goto L6a
            r14.close()     // Catch: java.lang.Throwable -> L67
            goto L6a
        L67:
            r0 = move-exception
            r14 = r0
            goto L7f
        L6a:
            r14 = r1
            goto L7f
        L6c:
            r0 = move-exception
            r2 = r0
            if (r14 == 0) goto L7d
            r14.close()     // Catch: java.lang.Throwable -> L74
            goto L7d
        L74:
            r0 = move-exception
            r14 = r0
            ac.p.e(r2, r14)     // Catch: java.lang.Throwable -> L7a
            goto L7d
        L7a:
            r0 = move-exception
            r14 = r0
            goto L8e
        L7d:
            r14 = r2
            r2 = r1
        L7f:
            if (r14 != 0) goto L8d
            r2.getClass()     // Catch: java.lang.Throwable -> L7a
            if (r3 == 0) goto L9a
            r3.close()     // Catch: java.lang.Throwable -> L8a
            goto L9a
        L8a:
            r0 = move-exception
            r1 = r0
            goto L9a
        L8d:
            throw r14     // Catch: java.lang.Throwable -> L7a
        L8e:
            if (r3 == 0) goto L98
            r3.close()     // Catch: java.lang.Throwable -> L94
            goto L98
        L94:
            r0 = move-exception
            ac.p.e(r14, r0)
        L98:
            r2 = r1
            r1 = r14
        L9a:
            if (r1 != 0) goto La0
            r2.getClass()
            return r2
        La0:
            throw r1
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadOnly(okio.Path r2) {
            r1 = this;
            r2.getClass()
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "not implemented yet!"
            r2.<init>(r0)
            throw r2
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadWrite(okio.Path r1, boolean r2, boolean r3) {
            r0 = this;
            r1.getClass()
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "zip entries are not writable"
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.FileSystem
    public okio.Sink sink(okio.Path r1, boolean r2) {
            r0 = this;
            r1.getClass()
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "zip file systems are read-only"
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.FileSystem
    public okio.Source source(okio.Path r8) {
            r7 = this;
            r8.getClass()
            okio.Path r0 = r7.canonicalizeInternal(r8)
            java.util.Map<okio.Path, okio.internal.ZipEntry> r1 = r7.entries
            java.lang.Object r0 = r1.get(r0)
            okio.internal.ZipEntry r0 = (okio.internal.ZipEntry) r0
            if (r0 == 0) goto L75
            okio.FileSystem r8 = r7.fileSystem
            okio.Path r1 = r7.zipPath
            okio.FileHandle r8 = r8.openReadOnly(r1)
            r1 = 0
            long r2 = r0.getOffset()     // Catch: java.lang.Throwable -> L2e
            okio.Source r2 = r8.source(r2)     // Catch: java.lang.Throwable -> L2e
            okio.BufferedSource r2 = okio.Okio.buffer(r2)     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L3c
            r8.close()     // Catch: java.lang.Throwable -> L2c
            goto L3c
        L2c:
            r1 = move-exception
            goto L3c
        L2e:
            r2 = move-exception
            if (r8 == 0) goto L39
            r8.close()     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r8 = move-exception
            ac.p.e(r2, r8)
        L39:
            r6 = r2
            r2 = r1
            r1 = r6
        L3c:
            if (r1 != 0) goto L74
            r2.getClass()
            okio.internal.ZipFilesKt.skipLocalHeader(r2)
            int r8 = r0.getCompressionMethod()
            r1 = 1
            if (r8 != 0) goto L55
            okio.internal.FixedLengthSource r8 = new okio.internal.FixedLengthSource
            long r3 = r0.getSize()
            r8.<init>(r2, r3, r1)
            goto L73
        L55:
            okio.InflaterSource r8 = new okio.InflaterSource
            okio.internal.FixedLengthSource r3 = new okio.internal.FixedLengthSource
            long r4 = r0.getCompressedSize()
            r3.<init>(r2, r4, r1)
            java.util.zip.Inflater r2 = new java.util.zip.Inflater
            r2.<init>(r1)
            r8.<init>(r3, r2)
            okio.internal.FixedLengthSource r1 = new okio.internal.FixedLengthSource
            long r2 = r0.getSize()
            r0 = 0
            r1.<init>(r8, r2, r0)
            r8 = r1
        L73:
            return r8
        L74:
            throw r1
        L75:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = "no such file: "
            java.lang.String r8 = j8.b.m(r8, r1)
            r0.<init>(r8)
            throw r0
    }
}
