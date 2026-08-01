package okio;

/* JADX INFO: compiled from: NioSystemFileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m115d2 = {"Lokio/NioSystemFileSystem;", "Lokio/JvmSystemFileSystem;", "()V", "atomicMove", "", "source", "Lokio/Path;", "target", "createSymlink", "metadataOrNull", "Lokio/FileMetadata;", "nioPath", "Ljava/nio/file/Path;", "path", "toString", "", "zeroToNull", "", "Ljava/nio/file/attribute/FileTime;", "(Ljava/nio/file/attribute/FileTime;)Ljava/lang/Long;", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public class NioSystemFileSystem extends okio.JvmSystemFileSystem {
    public NioSystemFileSystem() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.lang.Long zeroToNull(java.nio.file.attribute.FileTime r7) {
            r6 = this;
            long r0 = r7.toMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = r0
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            r3 = 0
            r4 = 0
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 == 0) goto L18
            r4 = 1
            goto L19
        L18:
            r4 = 0
        L19:
            if (r4 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public void atomicMove(okio.Path r6, okio.Path r7) {
            r5 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.nio.file.Path r0 = r6.toNioPath()     // Catch: java.lang.UnsupportedOperationException -> L24 java.nio.file.NoSuchFileException -> L2d
            java.nio.file.Path r1 = r7.toNioPath()     // Catch: java.lang.UnsupportedOperationException -> L24 java.nio.file.NoSuchFileException -> L2d
            r2 = 2
            java.nio.file.CopyOption[] r2 = new java.nio.file.CopyOption[r2]     // Catch: java.lang.UnsupportedOperationException -> L24 java.nio.file.NoSuchFileException -> L2d
            java.nio.file.StandardCopyOption r3 = java.nio.file.StandardCopyOption.ATOMIC_MOVE     // Catch: java.lang.UnsupportedOperationException -> L24 java.nio.file.NoSuchFileException -> L2d
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.UnsupportedOperationException -> L24 java.nio.file.NoSuchFileException -> L2d
            java.nio.file.StandardCopyOption r3 = java.nio.file.StandardCopyOption.REPLACE_EXISTING     // Catch: java.lang.UnsupportedOperationException -> L24 java.nio.file.NoSuchFileException -> L2d
            r4 = 1
            r2[r4] = r3     // Catch: java.lang.UnsupportedOperationException -> L24 java.nio.file.NoSuchFileException -> L2d
            java.nio.file.Files.move(r0, r1, r2)     // Catch: java.lang.UnsupportedOperationException -> L24 java.nio.file.NoSuchFileException -> L2d
            return
        L24:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "atomic move not supported"
            r1.<init>(r2)
            throw r1
        L2d:
            r0 = move-exception
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2)
            throw r1
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public void createSymlink(okio.Path r4, okio.Path r5) {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.nio.file.Path r0 = r4.toNioPath()
            java.nio.file.Path r1 = r5.toNioPath()
            r2 = 0
            java.nio.file.attribute.FileAttribute[] r2 = new java.nio.file.attribute.FileAttribute[r2]
            java.nio.file.Files.createSymbolicLink(r0, r1, r2)
            return
    }

    protected final okio.FileMetadata metadataOrNull(java.nio.file.Path r18) {
            r17 = this;
            r1 = r17
            r2 = r18
            java.lang.String r0 = "nioPath"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r3 = 0
            java.lang.Class<java.nio.file.attribute.BasicFileAttributes> r0 = java.nio.file.attribute.BasicFileAttributes.class
            java.nio.file.LinkOption r4 = java.nio.file.LinkOption.NOFOLLOW_LINKS     // Catch: java.nio.file.FileSystemException -> L73 java.nio.file.NoSuchFileException -> L75
            java.nio.file.LinkOption[] r4 = new java.nio.file.LinkOption[]{r4}     // Catch: java.nio.file.FileSystemException -> L73 java.nio.file.NoSuchFileException -> L75
            java.nio.file.attribute.BasicFileAttributes r0 = java.nio.file.Files.readAttributes(r2, r0, r4)     // Catch: java.nio.file.FileSystemException -> L73 java.nio.file.NoSuchFileException -> L75
            boolean r4 = r0.isSymbolicLink()
            if (r4 == 0) goto L23
            java.nio.file.Path r4 = java.nio.file.Files.readSymbolicLink(r18)
            goto L24
        L23:
            r4 = r3
        L24:
            okio.FileMetadata r16 = new okio.FileMetadata
            boolean r6 = r0.isRegularFile()
            boolean r7 = r0.isDirectory()
            if (r4 == 0) goto L3b
            okio.Path$Companion r5 = okio.Path.Companion
            r8 = 0
            r9 = 1
            okio.Path r5 = okio.Path.Companion.get$default(r5, r4, r8, r9, r3)
            r8 = r5
            goto L3c
        L3b:
            r8 = r3
        L3c:
            long r9 = r0.size()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.nio.file.attribute.FileTime r5 = r0.creationTime()
            if (r5 == 0) goto L50
            java.lang.Long r5 = r1.zeroToNull(r5)
            r10 = r5
            goto L51
        L50:
            r10 = r3
        L51:
            java.nio.file.attribute.FileTime r5 = r0.lastModifiedTime()
            if (r5 == 0) goto L5d
            java.lang.Long r5 = r1.zeroToNull(r5)
            r11 = r5
            goto L5e
        L5d:
            r11 = r3
        L5e:
            java.nio.file.attribute.FileTime r5 = r0.lastAccessTime()
            if (r5 == 0) goto L68
            java.lang.Long r3 = r1.zeroToNull(r5)
        L68:
            r12 = r3
            r14 = 128(0x80, float:1.8E-43)
            r15 = 0
            r13 = 0
            r5 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r16
        L73:
            r0 = move-exception
            return r3
        L75:
            r0 = move-exception
            return r3
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.FileMetadata metadataOrNull(okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.nio.file.Path r0 = r2.toNioPath()
            okio.FileMetadata r0 = r1.metadataOrNull(r0)
            return r0
    }

    @Override // okio.JvmSystemFileSystem
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "NioSystemFileSystem"
            return r0
    }
}
