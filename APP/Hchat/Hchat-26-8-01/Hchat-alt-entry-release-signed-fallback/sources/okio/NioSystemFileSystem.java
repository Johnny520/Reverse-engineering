package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class NioSystemFileSystem extends okio.JvmSystemFileSystem {
    public NioSystemFileSystem() {
            r0 = this;
            r0.<init>()
            return
    }

    private final java.lang.Long zeroToNull(java.nio.file.attribute.FileTime r5) {
            r4 = this;
            long r0 = r5.toMillis()
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            long r0 = r5.longValue()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            return r5
        L13:
            r5 = 0
            return r5
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public void atomicMove(okio.Path r4, okio.Path r5) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            java.nio.file.Path r4 = r4.toNioPath()     // Catch: java.nio.file.NoSuchFileException -> L1f java.lang.UnsupportedOperationException -> L21
            java.nio.file.Path r5 = r5.toNioPath()     // Catch: java.nio.file.NoSuchFileException -> L1f java.lang.UnsupportedOperationException -> L21
            r0 = 2
            java.nio.file.CopyOption[] r0 = new java.nio.file.CopyOption[r0]     // Catch: java.nio.file.NoSuchFileException -> L1f java.lang.UnsupportedOperationException -> L21
            java.nio.file.StandardCopyOption r1 = java.nio.file.StandardCopyOption.ATOMIC_MOVE     // Catch: java.nio.file.NoSuchFileException -> L1f java.lang.UnsupportedOperationException -> L21
            r2 = 0
            r0[r2] = r1     // Catch: java.nio.file.NoSuchFileException -> L1f java.lang.UnsupportedOperationException -> L21
            java.nio.file.StandardCopyOption r1 = java.nio.file.StandardCopyOption.REPLACE_EXISTING     // Catch: java.nio.file.NoSuchFileException -> L1f java.lang.UnsupportedOperationException -> L21
            r2 = 1
            r0[r2] = r1     // Catch: java.nio.file.NoSuchFileException -> L1f java.lang.UnsupportedOperationException -> L21
            java.nio.file.Files.move(r4, r5, r0)     // Catch: java.nio.file.NoSuchFileException -> L1f java.lang.UnsupportedOperationException -> L21
            return
        L1f:
            r4 = move-exception
            goto L27
        L21:
            java.lang.String r4 = "atomic move not supported"
            j8.o.y(r4)
            return
        L27:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.String r4 = r4.getMessage()
            r5.<init>(r4)
            throw r5
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public void createSymlink(okio.Path r2, okio.Path r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            java.nio.file.Path r2 = r2.toNioPath()
            java.nio.file.Path r3 = r3.toNioPath()
            r0 = 0
            java.nio.file.attribute.FileAttribute[] r0 = new java.nio.file.attribute.FileAttribute[r0]
            java.nio.file.Files.createSymbolicLink(r2, r3, r0)
            return
    }

    public final okio.FileMetadata metadataOrNull(java.nio.file.Path r14) {
            r13 = this;
            r14.getClass()
            r0 = 0
            java.lang.Class<java.nio.file.attribute.BasicFileAttributes> r1 = java.nio.file.attribute.BasicFileAttributes.class
            java.nio.file.LinkOption r2 = java.nio.file.LinkOption.NOFOLLOW_LINKS     // Catch: java.lang.Throwable -> L68
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[]{r2}     // Catch: java.lang.Throwable -> L68
            java.nio.file.attribute.BasicFileAttributes r1 = java.nio.file.Files.readAttributes(r14, r1, r2)     // Catch: java.lang.Throwable -> L68
            boolean r2 = r1.isSymbolicLink()
            if (r2 == 0) goto L1b
            java.nio.file.Path r14 = java.nio.file.Files.readSymbolicLink(r14)
            goto L1c
        L1b:
            r14 = r0
        L1c:
            okio.FileMetadata r2 = new okio.FileMetadata
            boolean r3 = r1.isRegularFile()
            boolean r4 = r1.isDirectory()
            if (r14 == 0) goto L32
            okio.Path$Companion r5 = okio.Path.Companion
            r6 = 0
            r7 = 1
            okio.Path r14 = okio.Path.Companion.get$default(r5, r14, r6, r7, r0)
            r5 = r14
            goto L33
        L32:
            r5 = r0
        L33:
            long r6 = r1.size()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.nio.file.attribute.FileTime r14 = r1.creationTime()
            if (r14 == 0) goto L47
            java.lang.Long r14 = r13.zeroToNull(r14)
            r7 = r14
            goto L48
        L47:
            r7 = r0
        L48:
            java.nio.file.attribute.FileTime r14 = r1.lastModifiedTime()
            if (r14 == 0) goto L54
            java.lang.Long r14 = r13.zeroToNull(r14)
            r8 = r14
            goto L55
        L54:
            r8 = r0
        L55:
            java.nio.file.attribute.FileTime r14 = r1.lastAccessTime()
            if (r14 == 0) goto L5f
            java.lang.Long r0 = r13.zeroToNull(r14)
        L5f:
            r9 = r0
            r11 = 128(0x80, float:1.8E-43)
            r12 = 0
            r10 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r2
        L68:
            return r0
    }

    @Override // okio.JvmSystemFileSystem, okio.FileSystem
    public okio.FileMetadata metadataOrNull(okio.Path r1) {
            r0 = this;
            r1.getClass()
            java.nio.file.Path r1 = r1.toNioPath()
            okio.FileMetadata r1 = r0.metadataOrNull(r1)
            return r1
    }

    @Override // okio.JvmSystemFileSystem
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "NioSystemFileSystem"
            return r0
    }
}
