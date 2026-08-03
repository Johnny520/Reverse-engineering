package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FileSystem {
    public static final okio.FileSystem.Companion Companion = null;
    public static final okio.FileSystem RESOURCES = null;
    public static final okio.FileSystem SYSTEM = null;
    public static final okio.Path SYSTEM_TEMPORARY_DIRECTORY = null;

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

        public final okio.FileSystem get(java.nio.file.FileSystem r2) {
                r1 = this;
                r2.getClass()
                okio.NioFileSystemWrappingFileSystem r0 = new okio.NioFileSystemWrappingFileSystem
                r0.<init>(r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: -write$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m164write$default(okio.FileSystem r1, okio.Path r2, boolean r3, fg.l r4, int r5, java.lang.Object r6) {
            if (r6 != 0) goto L37
            r5 = r5 & 2
            if (r5 == 0) goto L7
            r3 = 0
        L7:
            r2.getClass()
            r4.getClass()
            okio.Sink r1 = r1.sink(r2, r3)
            okio.BufferedSink r1 = okio.Okio.buffer(r1)
            r2 = 0
            java.lang.Object r3 = r4.invoke(r1)     // Catch: java.lang.Throwable -> L22
            if (r1 == 0) goto L30
            r1.close()     // Catch: java.lang.Throwable -> L20
            goto L30
        L20:
            r2 = move-exception
            goto L30
        L22:
            r3 = move-exception
            if (r1 == 0) goto L2d
            r1.close()     // Catch: java.lang.Throwable -> L29
            goto L2d
        L29:
            r1 = move-exception
            ac.p.e(r3, r1)
        L2d:
            r0 = r3
            r3 = r2
            r2 = r0
        L30:
            if (r2 != 0) goto L36
            r3.getClass()
            return r3
        L36:
            throw r2
        L37:
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: write"
            j8.o.w(r1)
            r1 = 0
            return r1
    }

    static {
            okio.FileSystem$Companion r0 = new okio.FileSystem$Companion
            r1 = 0
            r0.<init>(r1)
            okio.FileSystem.Companion = r0
            java.lang.String r0 = "java.nio.file.Files"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L13
            okio.NioSystemFileSystem r0 = new okio.NioSystemFileSystem     // Catch: java.lang.ClassNotFoundException -> L13
            r0.<init>()     // Catch: java.lang.ClassNotFoundException -> L13
            goto L18
        L13:
            okio.JvmSystemFileSystem r0 = new okio.JvmSystemFileSystem
            r0.<init>()
        L18:
            okio.FileSystem.SYSTEM = r0
            okio.Path$Companion r0 = okio.Path.Companion
            java.lang.String r2 = "java.io.tmpdir"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            r2.getClass()
            r3 = 0
            r4 = 1
            okio.Path r0 = okio.Path.Companion.get$default(r0, r2, r3, r4, r1)
            okio.FileSystem.SYSTEM_TEMPORARY_DIRECTORY = r0
            okio.internal.ResourceFileSystem r1 = new okio.internal.ResourceFileSystem
            java.lang.Class<okio.internal.ResourceFileSystem> r0 = okio.internal.ResourceFileSystem.class
            java.lang.ClassLoader r2 = r0.getClassLoader()
            r2.getClass()
            r5 = 4
            r6 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            okio.FileSystem.RESOURCES = r1
            return
    }

    public FileSystem() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ okio.Sink appendingSink$default(okio.FileSystem r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            okio.Sink r0 = r0.appendingSink(r1, r2)
            return r0
        Lc:
            java.lang.String r0 = "Super calls with default arguments not supported in this target, function: appendingSink"
            j8.o.w(r0)
            r0 = 0
            return r0
    }

    public static /* synthetic */ void createDirectories$default(okio.FileSystem r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lb
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            r0.createDirectories(r1, r2)
            return
        Lb:
            java.lang.String r0 = "Super calls with default arguments not supported in this target, function: createDirectories"
            j8.o.w(r0)
            return
    }

    public static /* synthetic */ void createDirectory$default(okio.FileSystem r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lb
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            r0.createDirectory(r1, r2)
            return
        Lb:
            java.lang.String r0 = "Super calls with default arguments not supported in this target, function: createDirectory"
            j8.o.w(r0)
            return
    }

    public static /* synthetic */ void delete$default(okio.FileSystem r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lb
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            r0.delete(r1, r2)
            return
        Lb:
            java.lang.String r0 = "Super calls with default arguments not supported in this target, function: delete"
            j8.o.w(r0)
            return
    }

    public static /* synthetic */ void deleteRecursively$default(okio.FileSystem r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lb
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            r0.deleteRecursively(r1, r2)
            return
        Lb:
            java.lang.String r0 = "Super calls with default arguments not supported in this target, function: deleteRecursively"
            j8.o.w(r0)
            return
    }

    public static final okio.FileSystem get(java.nio.file.FileSystem r1) {
            okio.FileSystem$Companion r0 = okio.FileSystem.Companion
            okio.FileSystem r1 = r0.get(r1)
            return r1
    }

    public static /* synthetic */ ng.j listRecursively$default(okio.FileSystem r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            ng.j r0 = r0.listRecursively(r1, r2)
            return r0
        Lc:
            java.lang.String r0 = "Super calls with default arguments not supported in this target, function: listRecursively"
            j8.o.w(r0)
            r0 = 0
            return r0
    }

    public static /* synthetic */ okio.FileHandle openReadWrite$default(okio.FileSystem r1, okio.Path r2, boolean r3, boolean r4, int r5, java.lang.Object r6) {
            if (r6 != 0) goto L12
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L8
            r3 = r0
        L8:
            r5 = r5 & 4
            if (r5 == 0) goto Ld
            r4 = r0
        Ld:
            okio.FileHandle r1 = r1.openReadWrite(r2, r3, r4)
            return r1
        L12:
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: openReadWrite"
            j8.o.w(r1)
            r1 = 0
            return r1
    }

    public static /* synthetic */ okio.Sink sink$default(okio.FileSystem r0, okio.Path r1, boolean r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            okio.Sink r0 = r0.sink(r1, r2)
            return r0
        Lc:
            java.lang.String r0 = "Super calls with default arguments not supported in this target, function: sink"
            j8.o.w(r0)
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: -read, reason: not valid java name */
    public final <T> T m165read(okio.Path r3, fg.l r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            okio.Source r3 = r2.source(r3)
            okio.BufferedSource r3 = okio.Okio.buffer(r3)
            r0 = 0
            java.lang.Object r4 = r4.invoke(r3)     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L29
            r3.close()     // Catch: java.lang.Throwable -> L19
            goto L29
        L19:
            r0 = move-exception
            goto L29
        L1b:
            r4 = move-exception
            if (r3 == 0) goto L26
            r3.close()     // Catch: java.lang.Throwable -> L22
            goto L26
        L22:
            r3 = move-exception
            ac.p.e(r4, r3)
        L26:
            r1 = r0
            r0 = r4
            r4 = r1
        L29:
            if (r0 != 0) goto L2f
            r4.getClass()
            return r4
        L2f:
            throw r0
    }

    /* JADX INFO: renamed from: -write, reason: not valid java name */
    public final <T> T m166write(okio.Path r2, boolean r3, fg.l r4) {
            r1 = this;
            r2.getClass()
            r4.getClass()
            okio.Sink r2 = r1.sink(r2, r3)
            okio.BufferedSink r2 = okio.Okio.buffer(r2)
            r3 = 0
            java.lang.Object r4 = r4.invoke(r2)     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L29
            r2.close()     // Catch: java.lang.Throwable -> L19
            goto L29
        L19:
            r3 = move-exception
            goto L29
        L1b:
            r4 = move-exception
            if (r2 == 0) goto L26
            r2.close()     // Catch: java.lang.Throwable -> L22
            goto L26
        L22:
            r2 = move-exception
            ac.p.e(r4, r2)
        L26:
            r0 = r4
            r4 = r3
            r3 = r0
        L29:
            if (r3 != 0) goto L2f
            r4.getClass()
            return r4
        L2f:
            throw r3
    }

    public final okio.Sink appendingSink(okio.Path r2) {
            r1 = this;
            r2.getClass()
            r0 = 0
            okio.Sink r2 = r1.appendingSink(r2, r0)
            return r2
    }

    public abstract okio.Sink appendingSink(okio.Path r1, boolean r2);

    public abstract void atomicMove(okio.Path r1, okio.Path r2);

    public abstract okio.Path canonicalize(okio.Path r1);

    public void copy(okio.Path r1, okio.Path r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            okio.internal.FileSystem.commonCopy(r0, r1, r2)
            return
    }

    public final void createDirectories(okio.Path r2) {
            r1 = this;
            r2.getClass()
            r0 = 0
            r1.createDirectories(r2, r0)
            return
    }

    public final void createDirectories(okio.Path r1, boolean r2) {
            r0 = this;
            r1.getClass()
            okio.internal.FileSystem.commonCreateDirectories(r0, r1, r2)
            return
    }

    public final void createDirectory(okio.Path r2) {
            r1 = this;
            r2.getClass()
            r0 = 0
            r1.createDirectory(r2, r0)
            return
    }

    public abstract void createDirectory(okio.Path r1, boolean r2);

    public abstract void createSymlink(okio.Path r1, okio.Path r2);

    public final void delete(okio.Path r2) {
            r1 = this;
            r2.getClass()
            r0 = 0
            r1.delete(r2, r0)
            return
    }

    public abstract void delete(okio.Path r1, boolean r2);

    public final void deleteRecursively(okio.Path r2) {
            r1 = this;
            r2.getClass()
            r0 = 0
            r1.deleteRecursively(r2, r0)
            return
    }

    public void deleteRecursively(okio.Path r1, boolean r2) {
            r0 = this;
            r1.getClass()
            okio.internal.FileSystem.commonDeleteRecursively(r0, r1, r2)
            return
    }

    public final boolean exists(okio.Path r1) {
            r0 = this;
            r1.getClass()
            boolean r1 = okio.internal.FileSystem.commonExists(r0, r1)
            return r1
    }

    public abstract java.util.List<okio.Path> list(okio.Path r1);

    public abstract java.util.List<okio.Path> listOrNull(okio.Path r1);

    public final ng.j listRecursively(okio.Path r2) {
            r1 = this;
            r2.getClass()
            r0 = 0
            ng.j r2 = r1.listRecursively(r2, r0)
            return r2
    }

    public ng.j listRecursively(okio.Path r1, boolean r2) {
            r0 = this;
            r1.getClass()
            ng.j r1 = okio.internal.FileSystem.commonListRecursively(r0, r1, r2)
            return r1
    }

    public final okio.FileMetadata metadata(okio.Path r1) {
            r0 = this;
            r1.getClass()
            okio.FileMetadata r1 = okio.internal.FileSystem.commonMetadata(r0, r1)
            return r1
    }

    public abstract okio.FileMetadata metadataOrNull(okio.Path r1);

    public abstract okio.FileHandle openReadOnly(okio.Path r1);

    public final okio.FileHandle openReadWrite(okio.Path r2) {
            r1 = this;
            r2.getClass()
            r0 = 0
            okio.FileHandle r2 = r1.openReadWrite(r2, r0, r0)
            return r2
    }

    public abstract okio.FileHandle openReadWrite(okio.Path r1, boolean r2, boolean r3);

    public final okio.Sink sink(okio.Path r2) {
            r1 = this;
            r2.getClass()
            r0 = 0
            okio.Sink r2 = r1.sink(r2, r0)
            return r2
    }

    public abstract okio.Sink sink(okio.Path r1, boolean r2);

    public abstract okio.Source source(okio.Path r1);
}
