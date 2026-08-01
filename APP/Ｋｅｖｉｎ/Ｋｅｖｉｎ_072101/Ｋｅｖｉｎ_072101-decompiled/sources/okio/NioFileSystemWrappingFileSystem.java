package okio;

/* JADX INFO: compiled from: NioFileSystemWrappingFileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00172\u0006\u0010\u0012\u001a\u00020\bH\u0016J \u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010!\u001a\u00020\"H\u0016J\f\u0010#\u001a\u00020$*\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m115d2 = {"Lokio/NioFileSystemWrappingFileSystem;", "Lokio/NioSystemFileSystem;", "nioFileSystem", "Ljava/nio/file/FileSystem;", "(Ljava/nio/file/FileSystem;)V", "appendingSink", "Lokio/Sink;", "file", "Lokio/Path;", "mustExist", "", "atomicMove", "", "source", "target", "canonicalize", "path", "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", "", "throwOnFailure", "listOrNull", "metadataOrNull", "Lokio/FileMetadata;", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "toString", "", "resolve", "Ljava/nio/file/Path;", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public final class NioFileSystemWrappingFileSystem extends okio.NioSystemFileSystem {
    private final java.nio.file.FileSystem nioFileSystem;

    public NioFileSystemWrappingFileSystem(java.nio.file.FileSystem r2) {
            r1 = this;
            java.lang.String r0 = "nioFileSystem"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.nioFileSystem = r2
            return
    }

    private final java.util.List<okio.Path> list(okio.Path r14, boolean r15) {
            r13 = this;
            java.nio.file.Path r0 = r13.resolve(r14)
            r1 = 0
            r2 = 1
            r3 = 0
            java.util.List r4 = kotlin.p001io.path.PathsKt.listDirectoryEntries$default(r0, r3, r2, r3)     // Catch: java.lang.Exception -> L3e
            r5 = r4
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r6 = (java.util.List) r6
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = 0
            java.util.Iterator r8 = r5.iterator()
        L1e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L36
            java.lang.Object r9 = r8.next()
            r10 = r9
            java.nio.file.Path r10 = (java.nio.file.Path) r10
            r11 = 0
            okio.Path$Companion r12 = okio.Path.Companion
            okio.Path r10 = okio.Path.Companion.get$default(r12, r10, r1, r2, r3)
            r6.add(r10)
            goto L1e
        L36:
            r1 = r6
            java.util.List r1 = (java.util.List) r1
            kotlin.collections.CollectionsKt.sort(r1)
            return r1
        L3e:
            r2 = move-exception
            if (r15 == 0) goto L81
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r1]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r1 = java.nio.file.Files.exists(r0, r1)
            if (r1 != 0) goto L68
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "no such file: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r14)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3)
            throw r1
        L68:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "failed to list "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r14)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3)
            throw r1
        L81:
            return r3
    }

    private final java.nio.file.Path resolve(okio.Path r4) {
            r3 = this;
            java.nio.file.FileSystem r0 = r3.nioFileSystem
            java.lang.String r1 = r4.toString()
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            java.nio.file.Path r0 = r0.getPath(r1, r2)
            java.lang.String r1 = "getPath(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.Sink appendingSink(okio.Path r7, boolean r8) {
            r6 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.createListBuilder()
            r1 = r0
            r2 = 0
            java.nio.file.StandardOpenOption r3 = java.nio.file.StandardOpenOption.APPEND
            r1.add(r3)
            if (r8 != 0) goto L17
            java.nio.file.StandardOpenOption r3 = java.nio.file.StandardOpenOption.CREATE
            r1.add(r3)
        L17:
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r0)
            java.nio.file.Path r1 = r6.resolve(r7)
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = 0
            r4 = r2
            r5 = 0
            java.nio.file.StandardOpenOption[] r5 = new java.nio.file.StandardOpenOption[r5]
            java.lang.Object[] r2 = r4.toArray(r5)
            java.nio.file.StandardOpenOption[] r2 = (java.nio.file.StandardOpenOption[]) r2
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.nio.file.OpenOption[] r2 = (java.nio.file.OpenOption[]) r2
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.nio.file.OpenOption[] r2 = (java.nio.file.OpenOption[]) r2
            java.io.OutputStream r1 = java.nio.file.Files.newOutputStream(r1, r2)
            java.lang.String r2 = "newOutputStream(this, *options)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            okio.Sink r1 = okio.Okio.sink(r1)
            return r1
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public void atomicMove(okio.Path r7, okio.Path r8) {
            r6 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.nio.file.Path r0 = r6.resolve(r7)     // Catch: java.lang.UnsupportedOperationException -> L31 java.nio.file.NoSuchFileException -> L3a
            java.nio.file.Path r1 = r6.resolve(r8)     // Catch: java.lang.UnsupportedOperationException -> L31 java.nio.file.NoSuchFileException -> L3a
            r2 = 2
            java.nio.file.CopyOption[] r3 = new java.nio.file.CopyOption[r2]     // Catch: java.lang.UnsupportedOperationException -> L31 java.nio.file.NoSuchFileException -> L3a
            java.nio.file.StandardCopyOption r4 = java.nio.file.StandardCopyOption.ATOMIC_MOVE     // Catch: java.lang.UnsupportedOperationException -> L31 java.nio.file.NoSuchFileException -> L3a
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.UnsupportedOperationException -> L31 java.nio.file.NoSuchFileException -> L3a
            java.nio.file.StandardCopyOption r4 = java.nio.file.StandardCopyOption.REPLACE_EXISTING     // Catch: java.lang.UnsupportedOperationException -> L31 java.nio.file.NoSuchFileException -> L3a
            r5 = 1
            r3[r5] = r4     // Catch: java.lang.UnsupportedOperationException -> L31 java.nio.file.NoSuchFileException -> L3a
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r2)     // Catch: java.lang.UnsupportedOperationException -> L31 java.nio.file.NoSuchFileException -> L3a
            java.nio.file.CopyOption[] r2 = (java.nio.file.CopyOption[]) r2     // Catch: java.lang.UnsupportedOperationException -> L31 java.nio.file.NoSuchFileException -> L3a
            java.nio.file.Path r0 = java.nio.file.Files.move(r0, r1, r2)     // Catch: java.lang.UnsupportedOperationException -> L31 java.nio.file.NoSuchFileException -> L3a
            java.lang.String r1 = "move(this, target, *options)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.UnsupportedOperationException -> L31 java.nio.file.NoSuchFileException -> L3a
            return
        L31:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "atomic move not supported"
            r1.<init>(r2)
            throw r1
        L3a:
            r0 = move-exception
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.Path canonicalize(okio.Path r6) {
            r5 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            okio.Path$Companion r0 = okio.Path.Companion     // Catch: java.nio.file.NoSuchFileException -> L1f
            java.nio.file.Path r1 = r5.resolve(r6)     // Catch: java.nio.file.NoSuchFileException -> L1f
            r2 = 0
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r2]     // Catch: java.nio.file.NoSuchFileException -> L1f
            java.nio.file.Path r1 = r1.toRealPath(r3)     // Catch: java.nio.file.NoSuchFileException -> L1f
            java.lang.String r3 = "toRealPath(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)     // Catch: java.nio.file.NoSuchFileException -> L1f
            r3 = 1
            r4 = 0
            okio.Path r0 = okio.Path.Companion.get$default(r0, r1, r2, r3, r4)     // Catch: java.nio.file.NoSuchFileException -> L1f
            return r0
        L1f:
            r0 = move-exception
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "no such file: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public void createDirectory(okio.Path r6, boolean r7) {
            r5 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            okio.FileMetadata r0 = r5.metadataOrNull(r6)
            r1 = 0
            if (r0 == 0) goto L14
            boolean r0 = r0.isDirectory()
            r2 = 1
            if (r0 != r2) goto L14
            goto L15
        L14:
            r2 = r1
        L15:
            r0 = r2
            if (r0 == 0) goto L34
            if (r7 != 0) goto L1b
            goto L34
        L1b:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r3 = " already exists."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L34:
            java.nio.file.Path r2 = r5.resolve(r6)     // Catch: java.io.IOException -> L4b
            java.nio.file.attribute.FileAttribute[] r3 = new java.nio.file.attribute.FileAttribute[r1]     // Catch: java.io.IOException -> L4b
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)     // Catch: java.io.IOException -> L4b
            java.nio.file.attribute.FileAttribute[] r1 = (java.nio.file.attribute.FileAttribute[]) r1     // Catch: java.io.IOException -> L4b
            java.nio.file.Path r1 = java.nio.file.Files.createDirectory(r2, r1)     // Catch: java.io.IOException -> L4b
            java.lang.String r2 = "createDirectory(this, *attributes)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.io.IOException -> L4b
            return
        L4b:
            r1 = move-exception
            if (r0 == 0) goto L4f
            return
        L4f:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "failed to create directory: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r3 = r3.toString()
            r4 = r1
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r2.<init>(r3, r4)
            throw r2
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public void createSymlink(okio.Path r5, okio.Path r6) {
            r4 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.nio.file.Path r0 = r4.resolve(r5)
            java.nio.file.Path r1 = r4.resolve(r6)
            r2 = 0
            java.nio.file.attribute.FileAttribute[] r3 = new java.nio.file.attribute.FileAttribute[r2]
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r2)
            java.nio.file.attribute.FileAttribute[] r2 = (java.nio.file.attribute.FileAttribute[]) r2
            java.nio.file.Path r0 = java.nio.file.Files.createSymbolicLink(r0, r1, r2)
            java.lang.String r1 = "createSymbolicLink(this, target, *attributes)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public void delete(okio.Path r6, boolean r7) {
            r5 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L5b
            java.nio.file.Path r0 = r5.resolve(r6)
            java.nio.file.Files.delete(r0)     // Catch: java.io.IOException -> L14 java.nio.file.NoSuchFileException -> L3e
            goto L41
        L14:
            r1 = move-exception
            r2 = 0
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r2]
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r2)
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2
            boolean r2 = java.nio.file.Files.exists(r0, r2)
            if (r2 != 0) goto L25
            goto L41
        L25:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "failed to delete "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L3e:
            r1 = move-exception
            if (r7 != 0) goto L42
        L41:
            return
        L42:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "no such file: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L5b:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "interrupted"
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public java.util.List<okio.Path> list(okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 1
            java.util.List r0 = r1.list(r2, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public java.util.List<okio.Path> listOrNull(okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r0 = 0
            java.util.List r0 = r1.list(r2, r0)
            return r0
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem, okio.FileSystem
    public okio.FileMetadata metadataOrNull(okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.nio.file.Path r0 = r1.resolve(r2)
            okio.FileMetadata r0 = r1.metadataOrNull(r0)
            return r0
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.FileHandle openReadOnly(okio.Path r5) {
            r4 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.nio.file.Path r0 = r4.resolve(r5)     // Catch: java.nio.file.NoSuchFileException -> L22
            r1 = 1
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r1]     // Catch: java.nio.file.NoSuchFileException -> L22
            java.nio.file.StandardOpenOption r2 = java.nio.file.StandardOpenOption.READ     // Catch: java.nio.file.NoSuchFileException -> L22
            r3 = 0
            r1[r3] = r2     // Catch: java.nio.file.NoSuchFileException -> L22
            java.nio.channels.FileChannel r0 = java.nio.channels.FileChannel.open(r0, r1)     // Catch: java.nio.file.NoSuchFileException -> L22
            okio.NioFileSystemFileHandle r1 = new okio.NioFileSystemFileHandle
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1.<init>(r3, r0)
            okio.FileHandle r1 = (okio.FileHandle) r1
            return r1
        L22:
            r0 = move-exception
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "no such file: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.FileHandle openReadWrite(okio.Path r8, boolean r9, boolean r10) {
            r7 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            r1 = 1
            if (r9 == 0) goto Le
            if (r10 != 0) goto Lc
            goto Le
        Lc:
            r2 = r0
            goto Lf
        Le:
            r2 = r1
        Lf:
            if (r2 == 0) goto L78
            java.util.List r2 = kotlin.collections.CollectionsKt.createListBuilder()
            r3 = r2
            r4 = 0
            java.nio.file.StandardOpenOption r5 = java.nio.file.StandardOpenOption.READ
            r3.add(r5)
            java.nio.file.StandardOpenOption r5 = java.nio.file.StandardOpenOption.WRITE
            r3.add(r5)
            if (r9 == 0) goto L29
            java.nio.file.StandardOpenOption r5 = java.nio.file.StandardOpenOption.CREATE_NEW
            r3.add(r5)
            goto L30
        L29:
            if (r10 != 0) goto L30
            java.nio.file.StandardOpenOption r5 = java.nio.file.StandardOpenOption.CREATE
            r3.add(r5)
        L30:
            java.util.List r2 = kotlin.collections.CollectionsKt.build(r2)
            java.nio.file.Path r3 = r7.resolve(r8)     // Catch: java.nio.file.NoSuchFileException -> L5e
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4     // Catch: java.nio.file.NoSuchFileException -> L5e
            r5 = 0
            r6 = r4
            java.nio.file.StandardOpenOption[] r0 = new java.nio.file.StandardOpenOption[r0]     // Catch: java.nio.file.NoSuchFileException -> L5e
            java.lang.Object[] r0 = r6.toArray(r0)     // Catch: java.nio.file.NoSuchFileException -> L5e
            java.nio.file.StandardOpenOption[] r0 = (java.nio.file.StandardOpenOption[]) r0     // Catch: java.nio.file.NoSuchFileException -> L5e
            int r4 = r0.length     // Catch: java.nio.file.NoSuchFileException -> L5e
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)     // Catch: java.nio.file.NoSuchFileException -> L5e
            java.nio.file.OpenOption[] r0 = (java.nio.file.OpenOption[]) r0     // Catch: java.nio.file.NoSuchFileException -> L5e
            java.nio.channels.FileChannel r0 = java.nio.channels.FileChannel.open(r3, r0)     // Catch: java.nio.file.NoSuchFileException -> L5e
            okio.NioFileSystemFileHandle r3 = new okio.NioFileSystemFileHandle
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r3.<init>(r1, r0)
            okio.FileHandle r3 = (okio.FileHandle) r3
            return r3
        L5e:
            r0 = move-exception
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "no such file: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3)
            throw r1
        L78:
            r0 = 0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot require mustCreate and mustExist at the same time."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.Sink sink(okio.Path r7, boolean r8) {
            r6 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.createListBuilder()
            r1 = r0
            r2 = 0
            if (r8 == 0) goto L12
            java.nio.file.StandardOpenOption r3 = java.nio.file.StandardOpenOption.CREATE_NEW
            r1.add(r3)
        L12:
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r0)
            java.nio.file.Path r1 = r6.resolve(r7)     // Catch: java.nio.file.NoSuchFileException -> L46
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.nio.file.NoSuchFileException -> L46
            r3 = 0
            r4 = r2
            r5 = 0
            java.nio.file.StandardOpenOption[] r5 = new java.nio.file.StandardOpenOption[r5]     // Catch: java.nio.file.NoSuchFileException -> L46
            java.lang.Object[] r5 = r4.toArray(r5)     // Catch: java.nio.file.NoSuchFileException -> L46
            java.nio.file.StandardOpenOption[] r5 = (java.nio.file.StandardOpenOption[]) r5     // Catch: java.nio.file.NoSuchFileException -> L46
            int r2 = r5.length     // Catch: java.nio.file.NoSuchFileException -> L46
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r2)     // Catch: java.nio.file.NoSuchFileException -> L46
            java.nio.file.OpenOption[] r2 = (java.nio.file.OpenOption[]) r2     // Catch: java.nio.file.NoSuchFileException -> L46
            int r3 = r2.length     // Catch: java.nio.file.NoSuchFileException -> L46
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)     // Catch: java.nio.file.NoSuchFileException -> L46
            java.nio.file.OpenOption[] r2 = (java.nio.file.OpenOption[]) r2     // Catch: java.nio.file.NoSuchFileException -> L46
            java.io.OutputStream r1 = java.nio.file.Files.newOutputStream(r1, r2)     // Catch: java.nio.file.NoSuchFileException -> L46
            java.lang.String r2 = "newOutputStream(this, *options)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.nio.file.NoSuchFileException -> L46
            okio.Sink r1 = okio.Okio.sink(r1)     // Catch: java.nio.file.NoSuchFileException -> L46
            return r1
        L46:
            r1 = move-exception
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "no such file: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r7)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.Source source(okio.Path r5) {
            r4 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.nio.file.Path r0 = r4.resolve(r5)     // Catch: java.nio.file.NoSuchFileException -> L21
            r1 = 0
            java.nio.file.OpenOption[] r2 = new java.nio.file.OpenOption[r1]     // Catch: java.nio.file.NoSuchFileException -> L21
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)     // Catch: java.nio.file.NoSuchFileException -> L21
            java.nio.file.OpenOption[] r1 = (java.nio.file.OpenOption[]) r1     // Catch: java.nio.file.NoSuchFileException -> L21
            java.io.InputStream r0 = java.nio.file.Files.newInputStream(r0, r1)     // Catch: java.nio.file.NoSuchFileException -> L21
            java.lang.String r1 = "newInputStream(this, *options)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.nio.file.NoSuchFileException -> L21
            okio.Source r0 = okio.Okio.source(r0)     // Catch: java.nio.file.NoSuchFileException -> L21
            return r0
        L21:
            r0 = move-exception
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "no such file: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.NioSystemFileSystem, okio.JvmSystemFileSystem
    public java.lang.String toString() {
            r1 = this;
            java.nio.file.FileSystem r0 = r1.nioFileSystem
            java.lang.Class r0 = r0.getClass()
            kotlin.reflect.KClass r0 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r0)
            java.lang.String r0 = r0.getSimpleName()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            return r0
    }
}
