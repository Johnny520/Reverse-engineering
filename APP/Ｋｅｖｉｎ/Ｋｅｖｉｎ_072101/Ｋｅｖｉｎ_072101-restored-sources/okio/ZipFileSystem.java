package okio;

/* JADX INFO: compiled from: ZipFileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B5\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000fH\u0016J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J \u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\r\u001a\u00020\u0003H\u0016J \u0010$\u001a\u00020#2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010%\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020&2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m115d2 = {"Lokio/ZipFileSystem;", "Lokio/FileSystem;", "zipPath", "Lokio/Path;", "fileSystem", "entries", "", "Lokio/internal/ZipEntry;", "comment", "", "(Lokio/Path;Lokio/FileSystem;Ljava/util/Map;Ljava/lang/String;)V", "appendingSink", "Lokio/Sink;", "file", "mustExist", "", "atomicMove", "", "source", "target", "canonicalize", "path", "canonicalizeInternal", "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", "", "throwOnFailure", "listOrNull", "metadataOrNull", "Lokio/FileMetadata;", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "Companion", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public final class ZipFileSystem extends okio.FileSystem {
    private static final okio.ZipFileSystem.Companion Companion = null;
    private static final okio.Path ROOT = null;
    private final java.lang.String comment;
    private final java.util.Map<okio.Path, okio.internal.ZipEntry> entries;
    private final okio.FileSystem fileSystem;
    private final okio.Path zipPath;

    /* JADX INFO: compiled from: ZipFileSystem.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m115d2 = {"Lokio/ZipFileSystem$Companion;", "", "()V", "ROOT", "Lokio/Path;", "getROOT", "()Lokio/Path;", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
    private static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
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

    public ZipFileSystem(okio.Path r2, okio.FileSystem r3, java.util.Map<okio.Path, okio.internal.ZipEntry> r4, java.lang.String r5) {
            r1 = this;
            java.lang.String r0 = "zipPath"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "fileSystem"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "entries"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.zipPath = r2
            r1.fileSystem = r3
            r1.entries = r4
            r1.comment = r5
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
            okio.Path r0 = r0.resolve(r3, r1)
            return r0
    }

    private final java.util.List<okio.Path> list(okio.Path r5, boolean r6) {
            r4 = this;
            okio.Path r0 = r4.canonicalizeInternal(r5)
            java.util.Map<okio.Path, okio.internal.ZipEntry> r1 = r4.entries
            java.lang.Object r1 = r1.get(r0)
            okio.internal.ZipEntry r1 = (okio.internal.ZipEntry) r1
            if (r1 != 0) goto L2b
            if (r6 != 0) goto L12
            r1 = 0
            return r1
        L12:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "not a directory: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L2b:
            java.util.List r2 = r1.getChildren()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = kotlin.collections.CollectionsKt.toList(r2)
            return r2
    }

    @Override // okio.FileSystem
    public okio.Sink appendingSink(okio.Path r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "zip file systems are read-only"
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.FileSystem
    public void atomicMove(okio.Path r3, okio.Path r4) {
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "zip file systems are read-only"
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.FileSystem
    public okio.Path canonicalize(okio.Path r4) {
            r3 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okio.Path r0 = r3.canonicalizeInternal(r4)
            java.util.Map<okio.Path, okio.internal.ZipEntry> r1 = r3.entries
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L12
            return r0
        L12:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.String r2 = java.lang.String.valueOf(r4)
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.FileSystem
    public void createDirectory(okio.Path r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "zip file systems are read-only"
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.FileSystem
    public void createSymlink(okio.Path r3, okio.Path r4) {
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "zip file systems are read-only"
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.FileSystem
    public void delete(okio.Path r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "zip file systems are read-only"
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> list(okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 1
            java.util.List r0 = r1.list(r2, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> listOrNull(okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            java.util.List r0 = r1.list(r2, r0)
            return r0
    }

    @Override // okio.FileSystem
    public okio.FileMetadata metadataOrNull(okio.Path r19) {
            r18 = this;
            r1 = r18
            java.lang.String r0 = "path"
            r2 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Path r3 = r18.canonicalizeInternal(r19)
            java.util.Map<okio.Path, okio.internal.ZipEntry> r0 = r1.entries
            java.lang.Object r0 = r0.get(r3)
            okio.internal.ZipEntry r0 = (okio.internal.ZipEntry) r0
            r4 = 0
            if (r0 != 0) goto L19
            return r4
        L19:
            r5 = r0
            okio.FileMetadata r0 = new okio.FileMetadata
            boolean r6 = r5.isDirectory()
            r7 = r6 ^ 1
            boolean r8 = r5.isDirectory()
            boolean r6 = r5.isDirectory()
            if (r6 == 0) goto L2e
            goto L36
        L2e:
            long r9 = r5.getSize()
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
        L36:
            r10 = r4
            java.lang.Long r12 = r5.getLastModifiedAtMillis()
            r15 = 128(0x80, float:1.8E-43)
            r16 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4 = r0
            long r6 = r5.getOffset()
            r8 = -1
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L55
            return r4
        L55:
            okio.FileSystem r0 = r1.fileSystem
            okio.Path r6 = r1.zipPath
            okio.FileHandle r0 = r0.openReadOnly(r6)
            r6 = r0
            java.io.Closeable r6 = (java.io.Closeable) r6
            r7 = 0
            r8 = 0
            r9 = 0
            r0 = r6
            okio.FileHandle r0 = (okio.FileHandle) r0     // Catch: java.lang.Throwable -> Lc0
            r10 = r0
            r11 = 0
            long r12 = r5.getOffset()     // Catch: java.lang.Throwable -> Lc0
            okio.Source r0 = r10.source(r12)     // Catch: java.lang.Throwable -> Lc0
            okio.BufferedSource r0 = okio.Okio.buffer(r0)     // Catch: java.lang.Throwable -> Lc0
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch: java.lang.Throwable -> Lc0
            r12 = r0
            r13 = 0
            r14 = 0
            r15 = 0
            r0 = r12
            okio.BufferedSource r0 = (okio.BufferedSource) r0     // Catch: java.lang.Throwable -> L96
            r16 = 0
            okio.FileMetadata r17 = okio.internal.ZipFilesKt.readLocalHeader(r0, r4)     // Catch: java.lang.Throwable -> L96
            r14 = r17
            if (r12 == 0) goto L95
            r12.close()     // Catch: java.lang.Throwable -> L8e
            goto L95
        L8e:
            r0 = move-exception
            r16 = r0
            r0 = r16
            r15 = r0
        L95:
            goto La9
        L96:
            r0 = move-exception
            r15 = r0
            if (r12 == 0) goto L95
            r12.close()     // Catch: java.lang.Throwable -> L9f
            goto L95
        L9f:
            r0 = move-exception
            r16 = r0
            r0 = r16
            kotlin.ExceptionsKt.addSuppressed(r15, r0)     // Catch: java.lang.Throwable -> Lc0
            goto L95
        La9:
            if (r15 != 0) goto Lbf
        Lac:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r14)     // Catch: java.lang.Throwable -> Lc0
            if (r6 == 0) goto Lbd
            r6.close()     // Catch: java.lang.Throwable -> Lb8
            goto Lbd
        Lb8:
            r0 = move-exception
            r8 = r0
            r0 = r8
            r9 = r0
        Lbd:
            r8 = r14
            goto Ld1
        Lbf:
            throw r15     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            r0 = move-exception
            r9 = r0
            if (r6 == 0) goto Ld0
            r6.close()     // Catch: java.lang.Throwable -> Lc9
            goto Ld0
        Lc9:
            r0 = move-exception
            r10 = r0
            r0 = r10
            kotlin.ExceptionsKt.addSuppressed(r9, r0)
        Ld0:
        Ld1:
            if (r9 != 0) goto Ld7
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            return r8
        Ld7:
            throw r9
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadOnly(okio.Path r3) {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "not implemented yet!"
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadWrite(okio.Path r3, boolean r4, boolean r5) {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "zip entries are not writable"
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.FileSystem
    public okio.Sink sink(okio.Path r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "zip file systems are read-only"
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.FileSystem
    public okio.Source source(okio.Path r11) throws java.io.IOException {
            r10 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            okio.Path r0 = r10.canonicalizeInternal(r11)
            java.util.Map<okio.Path, okio.internal.ZipEntry> r1 = r10.entries
            java.lang.Object r1 = r1.get(r0)
            okio.internal.ZipEntry r1 = (okio.internal.ZipEntry) r1
            if (r1 == 0) goto L95
            okio.FileSystem r2 = r10.fileSystem
            okio.Path r3 = r10.zipPath
            okio.FileHandle r2 = r2.openReadOnly(r3)
            java.io.Closeable r2 = (java.io.Closeable) r2
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = r2
            okio.FileHandle r6 = (okio.FileHandle) r6     // Catch: java.lang.Throwable -> L3d
            r7 = 0
            long r8 = r1.getOffset()     // Catch: java.lang.Throwable -> L3d
            okio.Source r8 = r6.source(r8)     // Catch: java.lang.Throwable -> L3d
            okio.BufferedSource r8 = okio.Okio.buffer(r8)     // Catch: java.lang.Throwable -> L3d
            r4 = r8
            if (r2 == 0) goto L4b
            r2.close()     // Catch: java.lang.Throwable -> L39
            goto L4b
        L39:
            r6 = move-exception
            r5 = r6
            goto L4b
        L3d:
            r6 = move-exception
            r5 = r6
            if (r2 == 0) goto L4b
            r2.close()     // Catch: java.lang.Throwable -> L46
            goto L4b
        L46:
            r6 = move-exception
            kotlin.ExceptionsKt.addSuppressed(r5, r6)
        L4b:
            if (r5 != 0) goto L94
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            r2 = r4
            okio.internal.ZipFilesKt.skipLocalHeader(r2)
            int r3 = r1.getCompressionMethod()
            r4 = 1
            if (r3 != 0) goto L6b
            okio.internal.FixedLengthSource r3 = new okio.internal.FixedLengthSource
            r5 = r2
            okio.Source r5 = (okio.Source) r5
            long r6 = r1.getSize()
            r3.<init>(r5, r6, r4)
            okio.Source r3 = (okio.Source) r3
            goto L93
        L6b:
            okio.InflaterSource r3 = new okio.InflaterSource
            okio.internal.FixedLengthSource r5 = new okio.internal.FixedLengthSource
            r6 = r2
            okio.Source r6 = (okio.Source) r6
            long r7 = r1.getCompressedSize()
            r5.<init>(r6, r7, r4)
            okio.Source r5 = (okio.Source) r5
            java.util.zip.Inflater r6 = new java.util.zip.Inflater
            r6.<init>(r4)
            r3.<init>(r5, r6)
            okio.internal.FixedLengthSource r4 = new okio.internal.FixedLengthSource
            r5 = r3
            okio.Source r5 = (okio.Source) r5
            long r6 = r1.getSize()
            r8 = 0
            r4.<init>(r5, r6, r8)
            r3 = r4
            okio.Source r3 = (okio.Source) r3
        L93:
            return r3
        L94:
            throw r5
        L95:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "no such file: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }
}
