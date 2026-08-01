package okio;

/* JADX INFO: compiled from: JvmSystemFileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J \u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\bH\u0002J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\f\u0010!\u001a\u00020\n*\u00020\u0006H\u0002J\f\u0010\"\u001a\u00020\n*\u00020\u0006H\u0002¨\u0006#"}, m115d2 = {"Lokio/JvmSystemFileSystem;", "Lokio/FileSystem;", "()V", "appendingSink", "Lokio/Sink;", "file", "Lokio/Path;", "mustExist", "", "atomicMove", "", "source", "target", "canonicalize", "path", "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", "", "throwOnFailure", "listOrNull", "metadataOrNull", "Lokio/FileMetadata;", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "toString", "", "requireCreate", "requireExist", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public class JvmSystemFileSystem extends okio.FileSystem {
    public JvmSystemFileSystem() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.util.List<okio.Path> list(okio.Path r11, boolean r12) {
            r10 = this;
            java.io.File r0 = r11.toFile()
            java.lang.String[] r1 = r0.list()
            if (r1 != 0) goto L46
            if (r12 == 0) goto L44
            boolean r2 = r0.exists()
            if (r2 != 0) goto L2b
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "no such file: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r11)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L2b:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "failed to list "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r11)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L44:
            r2 = 0
            return r2
        L46:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r2 = (java.util.List) r2
            java.util.Collection r2 = (java.util.Collection) r2
            r3 = r1
            r4 = 0
            int r5 = r3.length
            r6 = 0
        L53:
            if (r6 >= r5) goto L66
            r7 = r3[r6]
            r8 = r7
            r9 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            okio.Path r8 = r11.resolve(r8)
            r2.add(r8)
            int r6 = r6 + 1
            goto L53
        L66:
            java.util.List r2 = (java.util.List) r2
            kotlin.collections.CollectionsKt.sort(r2)
            return r2
    }

    private final void requireCreate(okio.Path r4) {
            r3 = this;
            boolean r0 = r3.exists(r4)
            if (r0 != 0) goto L7
            return
        L7:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " already exists."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private final void requireExist(okio.Path r4) {
            r3 = this;
            boolean r0 = r3.exists(r4)
            if (r0 == 0) goto L7
            return
        L7:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " doesn't exist."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.FileSystem
    public okio.Sink appendingSink(okio.Path r3, boolean r4) {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r4 == 0) goto La
            r2.requireExist(r3)
        La:
            java.io.File r0 = r3.toFile()
            r1 = 1
            okio.Sink r0 = okio.Okio.sink(r0, r1)
            return r0
    }

    @Override // okio.FileSystem
    public void atomicMove(okio.Path r5, okio.Path r6) {
            r4 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.io.File r0 = r5.toFile()
            java.io.File r1 = r6.toFile()
            boolean r0 = r0.renameTo(r1)
            if (r0 == 0) goto L19
            return
        L19:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "failed to move "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = " to "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.FileSystem
    public okio.Path canonicalize(okio.Path r6) {
            r5 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.io.File r0 = r6.toFile()
            java.io.File r0 = r0.getCanonicalFile()
            boolean r1 = r0.exists()
            if (r1 == 0) goto L20
            okio.Path$Companion r1 = okio.Path.Companion
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r2 = 1
            r3 = 0
            r4 = 0
            okio.Path r1 = okio.Path.Companion.get$default(r1, r0, r4, r2, r3)
            return r1
        L20:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.String r2 = "no such file"
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.FileSystem
    public void createDirectory(okio.Path r5, boolean r6) {
            r4 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.io.File r0 = r5.toFile()
            boolean r0 = r0.mkdir()
            if (r0 != 0) goto L56
            okio.FileMetadata r0 = r4.metadataOrNull(r5)
            r1 = 0
            if (r0 == 0) goto L1e
            boolean r0 = r0.isDirectory()
            r2 = 1
            if (r0 != r2) goto L1e
            r1 = r2
        L1e:
            r0 = r1
            if (r0 == 0) goto L3d
            if (r6 != 0) goto L24
            return
        L24:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = " already exists."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L3d:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "failed to create directory: "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L56:
            return
    }

    @Override // okio.FileSystem
    public void createSymlink(okio.Path r3, okio.Path r4) {
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "unsupported"
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.FileSystem
    public void delete(okio.Path r6, boolean r7) {
            r5 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L51
            java.io.File r0 = r6.toFile()
            boolean r1 = r0.delete()
            if (r1 != 0) goto L50
            boolean r2 = r0.exists()
            if (r2 != 0) goto L37
            if (r7 != 0) goto L1e
            goto L50
        L1e:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "no such file: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L37:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "failed to delete "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L50:
            return
        L51:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "interrupted"
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
    public okio.FileMetadata metadataOrNull(okio.Path r21) {
            r20 = this;
            java.lang.String r0 = "path"
            r1 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.io.File r0 = r21.toFile()
            boolean r13 = r0.isFile()
            boolean r14 = r0.isDirectory()
            long r15 = r0.lastModified()
            long r17 = r0.length()
            if (r13 != 0) goto L31
            if (r14 != 0) goto L31
            r2 = 0
            int r4 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r4 != 0) goto L31
            int r2 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r2 != 0) goto L31
            boolean r2 = r0.exists()
            if (r2 != 0) goto L31
            r2 = 0
            return r2
        L31:
            okio.FileMetadata r19 = new okio.FileMetadata
            java.lang.Long r6 = java.lang.Long.valueOf(r17)
            java.lang.Long r8 = java.lang.Long.valueOf(r15)
            r11 = 128(0x80, float:1.8E-43)
            r12 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r2 = r19
            r3 = r13
            r4 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r19
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadOnly(okio.Path r5) {
            r4 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            okio.JvmFileHandle r0 = new okio.JvmFileHandle
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.io.File r2 = r5.toFile()
            java.lang.String r3 = "r"
            r1.<init>(r2, r3)
            r2 = 0
            r0.<init>(r2, r1)
            okio.FileHandle r0 = (okio.FileHandle) r0
            return r0
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadWrite(okio.Path r6, boolean r7, boolean r8) {
            r5 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 1
            if (r7 == 0) goto Ld
            if (r8 != 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            goto Le
        Ld:
            r1 = r0
        Le:
            if (r1 == 0) goto L2d
            if (r7 == 0) goto L15
            r5.requireCreate(r6)
        L15:
            if (r8 == 0) goto L1a
            r5.requireExist(r6)
        L1a:
            okio.JvmFileHandle r1 = new okio.JvmFileHandle
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile
            java.io.File r3 = r6.toFile()
            java.lang.String r4 = "rw"
            r2.<init>(r3, r4)
            r1.<init>(r0, r2)
            okio.FileHandle r1 = (okio.FileHandle) r1
            return r1
        L2d:
            r0 = 0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Cannot require mustCreate and mustExist at the same time."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.FileSystem
    public okio.Sink sink(okio.Path r5, boolean r6) {
            r4 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            if (r6 == 0) goto La
            r4.requireCreate(r5)
        La:
            java.io.File r0 = r5.toFile()
            r1 = 1
            r2 = 0
            r3 = 0
            okio.Sink r0 = okio.Okio.sink$default(r0, r3, r1, r2)
            return r0
    }

    @Override // okio.FileSystem
    public okio.Source source(okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.File r0 = r2.toFile()
            okio.Source r0 = okio.Okio.source(r0)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "JvmSystemFileSystem"
            return r0
    }
}
