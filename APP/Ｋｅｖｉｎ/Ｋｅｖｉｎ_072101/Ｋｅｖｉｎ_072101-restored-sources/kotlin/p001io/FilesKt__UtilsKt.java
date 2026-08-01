package kotlin.p001io;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a*\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a*\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a8\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u001a&\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u001a\n\u0010\u0019\u001a\u00020\u000f*\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\n\u0010\u001c\u001a\u00020\u0002*\u00020\u0002\u001a\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d*\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0002¢\u0006\u0002\b\u001e\u001a\u0011\u0010\u001c\u001a\u00020\u001f*\u00020\u001fH\u0002¢\u0006\u0002\b\u001e\u001a\u0012\u0010 \u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0014\u0010\"\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010#\u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\u0012\u0010(\u001a\u00020\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u001b\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0002\b*\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006+"}, m115d2 = {"extension", "", "Ljava/io/File;", "getExtension", "(Ljava/io/File;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath", "nameWithoutExtension", "getNameWithoutExtension", "createTempDir", "prefix", "suffix", "directory", "createTempFile", "copyRecursively", "", "target", "overwrite", "onError", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/OnErrorAction;", "copyTo", "bufferSize", "", "deleteRecursively", "endsWith", "other", "normalize", "", "normalize$FilesKt__UtilsKt", "Lkotlin/io/FilePathComponents;", "relativeTo", "base", "relativeToOrNull", "relativeToOrSelf", "resolve", "relative", "resolveSibling", "startsWith", "toRelativeString", "toRelativeStringOrNull", "toRelativeStringOrNull$FilesKt__UtilsKt", "kotlin-stdlib"}, m116k = 5, m117mv = {1, 9, 0}, m119xi = 49, m120xs = "kotlin/io/FilesKt")
class FilesKt__UtilsKt extends kotlin.p001io.FilesKt__FileTreeWalkKt {



    public FilesKt__UtilsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final boolean copyRecursively(java.io.File r12, java.io.File r13, boolean r14, kotlin.jvm.functions.Function2<? super java.io.File, ? super java.io.IOException, ? extends kotlin.p001io.OnErrorAction> r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            boolean r0 = r12.exists()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L2e
            kotlin.io.NoSuchFileException r0 = new kotlin.io.NoSuchFileException
            r7 = 2
            r8 = 0
            r5 = 0
            java.lang.String r6 = "The source file doesn't exist."
            r3 = r0
            r4 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r0 = r15.invoke(r12, r0)
            kotlin.io.OnErrorAction r3 = kotlin.p001io.OnErrorAction.TERMINATE
            if (r0 == r3) goto L2c
            goto L2d
        L2c:
            r1 = r2
        L2d:
            return r1
        L2e:
            kotlin.io.FileTreeWalk r0 = kotlin.p001io.FilesKt.walkTopDown(r12)     // Catch: kotlin.p001io.TerminateException -> Le9
            kotlin.io.FilesKt__UtilsKt$copyRecursively$2 r3 = new kotlin.io.FilesKt__UtilsKt$copyRecursively$2     // Catch: kotlin.p001io.TerminateException -> Le9
            r3.<init>(r15)     // Catch: kotlin.p001io.TerminateException -> Le9
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3     // Catch: kotlin.p001io.TerminateException -> Le9
            kotlin.io.FileTreeWalk r0 = r0.onFail(r3)     // Catch: kotlin.p001io.TerminateException -> Le9
            java.util.Iterator r0 = r0.iterator()     // Catch: kotlin.p001io.TerminateException -> Le9
        L42:
            boolean r3 = r0.hasNext()     // Catch: kotlin.p001io.TerminateException -> Le9
            if (r3 == 0) goto Le8
            java.lang.Object r3 = r0.next()     // Catch: kotlin.p001io.TerminateException -> Le9
            java.io.File r3 = (java.io.File) r3     // Catch: kotlin.p001io.TerminateException -> Le9
            boolean r4 = r3.exists()     // Catch: kotlin.p001io.TerminateException -> Le9
            if (r4 != 0) goto L69
            kotlin.io.NoSuchFileException r10 = new kotlin.io.NoSuchFileException     // Catch: kotlin.p001io.TerminateException -> Le9
            java.lang.String r7 = "The source file doesn't exist."
            r8 = 2
            r9 = 0
            r6 = 0
            r4 = r10
            r5 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: kotlin.p001io.TerminateException -> Le9
            java.lang.Object r4 = r15.invoke(r3, r10)     // Catch: kotlin.p001io.TerminateException -> Le9
            kotlin.io.OnErrorAction r5 = kotlin.p001io.OnErrorAction.TERMINATE     // Catch: kotlin.p001io.TerminateException -> Le9
            if (r4 != r5) goto L42
            return r2
        L69:
            java.lang.String r4 = kotlin.p001io.FilesKt.toRelativeString(r3, r12)     // Catch: kotlin.p001io.TerminateException -> Le9
            r10 = r4
            java.io.File r4 = new java.io.File     // Catch: kotlin.p001io.TerminateException -> Le9
            r4.<init>(r13, r10)     // Catch: kotlin.p001io.TerminateException -> Le9
            r11 = r4
            boolean r4 = r11.exists()     // Catch: kotlin.p001io.TerminateException -> Le9
            if (r4 == 0) goto Lb8
            boolean r4 = r3.isDirectory()     // Catch: kotlin.p001io.TerminateException -> Le9
            if (r4 == 0) goto L86
            boolean r4 = r11.isDirectory()     // Catch: kotlin.p001io.TerminateException -> Le9
            if (r4 != 0) goto Lb8
        L86:
            if (r14 != 0) goto L8a
            r4 = r1
            goto La3
        L8a:
            boolean r4 = r11.isDirectory()     // Catch: kotlin.p001io.TerminateException -> Le9
            if (r4 == 0) goto L9a
            boolean r4 = kotlin.p001io.FilesKt.deleteRecursively(r11)     // Catch: kotlin.p001io.TerminateException -> Le9
            if (r4 != 0) goto L98
            r4 = r1
            goto La3
        L98:
            r4 = r2
            goto La3
        L9a:
            boolean r4 = r11.delete()     // Catch: kotlin.p001io.TerminateException -> Le9
            if (r4 != 0) goto La2
            r4 = r1
            goto La3
        La2:
            r4 = r2
        La3:
            if (r4 == 0) goto Lb8
            kotlin.io.FileAlreadyExistsException r5 = new kotlin.io.FileAlreadyExistsException     // Catch: kotlin.p001io.TerminateException -> Le9
            java.lang.String r6 = "The destination file already exists."
            r5.<init>(r3, r11, r6)     // Catch: kotlin.p001io.TerminateException -> Le9
            java.lang.Object r5 = r15.invoke(r11, r5)     // Catch: kotlin.p001io.TerminateException -> Le9
            kotlin.io.OnErrorAction r6 = kotlin.p001io.OnErrorAction.TERMINATE     // Catch: kotlin.p001io.TerminateException -> Le9
            if (r5 != r6) goto Lb7
            return r2
        Lb7:
            goto L42
        Lb8:
            boolean r4 = r3.isDirectory()     // Catch: kotlin.p001io.TerminateException -> Le9
            if (r4 == 0) goto Lc2
            r11.mkdirs()     // Catch: kotlin.p001io.TerminateException -> Le9
            goto L42
        Lc2:
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r3
            r5 = r11
            r6 = r14
            java.io.File r4 = kotlin.p001io.FilesKt.copyTo$default(r4, r5, r6, r7, r8, r9)     // Catch: kotlin.p001io.TerminateException -> Le9
            long r4 = r4.length()     // Catch: kotlin.p001io.TerminateException -> Le9
            long r6 = r3.length()     // Catch: kotlin.p001io.TerminateException -> Le9
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L42
            java.io.IOException r4 = new java.io.IOException     // Catch: kotlin.p001io.TerminateException -> Le9
            java.lang.String r5 = "Source file wasn't copied completely, length of destination file differs."
            r4.<init>(r5)     // Catch: kotlin.p001io.TerminateException -> Le9
            java.lang.Object r4 = r15.invoke(r3, r4)     // Catch: kotlin.p001io.TerminateException -> Le9
            kotlin.io.OnErrorAction r5 = kotlin.p001io.OnErrorAction.TERMINATE     // Catch: kotlin.p001io.TerminateException -> Le9
            if (r4 != r5) goto L42
            return r2
        Le8:
            return r1
        Le9:
            r0 = move-exception
            return r2
    }

    public static /* synthetic */ boolean copyRecursively$default(java.io.File r0, java.io.File r1, boolean r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            kotlin.io.FilesKt__UtilsKt$copyRecursively$1 r3 = kotlin.p001io.FilesKt__UtilsKt.C07441.INSTANCE
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
        Ld:
            boolean r0 = kotlin.p001io.FilesKt.copyRecursively(r0, r1, r2, r3)
            return r0
    }

    public static final java.io.File copyTo(java.io.File r9, java.io.File r10, boolean r11, int r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            boolean r0 = r9.exists()
            if (r0 == 0) goto L82
            boolean r0 = r10.exists()
            if (r0 == 0) goto L2f
            if (r11 == 0) goto L27
            boolean r0 = r10.delete()
            if (r0 == 0) goto L1f
            goto L2f
        L1f:
            kotlin.io.FileAlreadyExistsException r0 = new kotlin.io.FileAlreadyExistsException
            java.lang.String r1 = "Tried to overwrite the destination, but failed to delete it."
            r0.<init>(r9, r10, r1)
            throw r0
        L27:
            kotlin.io.FileAlreadyExistsException r0 = new kotlin.io.FileAlreadyExistsException
            java.lang.String r1 = "The destination file already exists."
            r0.<init>(r9, r10, r1)
            throw r0
        L2f:
            boolean r0 = r9.isDirectory()
            if (r0 == 0) goto L44
            boolean r0 = r10.mkdirs()
            if (r0 == 0) goto L3c
            goto L73
        L3c:
            kotlin.io.FileSystemException r0 = new kotlin.io.FileSystemException
            java.lang.String r1 = "Failed to create target directory."
            r0.<init>(r9, r10, r1)
            throw r0
        L44:
            java.io.File r0 = r10.getParentFile()
            if (r0 == 0) goto L4d
            r0.mkdirs()
        L4d:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r9)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = r0
            java.io.FileInputStream r1 = (java.io.FileInputStream) r1     // Catch: java.lang.Throwable -> L7b
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7b
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L7b
            java.io.Closeable r3 = (java.io.Closeable) r3     // Catch: java.lang.Throwable -> L7b
            r4 = r3
            java.io.FileOutputStream r4 = (java.io.FileOutputStream) r4     // Catch: java.lang.Throwable -> L74
            r5 = 0
            r6 = r1
            java.io.InputStream r6 = (java.io.InputStream) r6     // Catch: java.lang.Throwable -> L74
            r7 = r4
            java.io.OutputStream r7 = (java.io.OutputStream) r7     // Catch: java.lang.Throwable -> L74
            kotlin.p001io.ByteStreamsKt.copyTo(r6, r7, r12)     // Catch: java.lang.Throwable -> L74
            r4 = 0
            kotlin.p001io.CloseableKt.closeFinally(r3, r4)     // Catch: java.lang.Throwable -> L7b
            kotlin.p001io.CloseableKt.closeFinally(r0, r4)
        L73:
            return r10
        L74:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L76
        L76:
            r5 = move-exception
            kotlin.p001io.CloseableKt.closeFinally(r3, r4)     // Catch: java.lang.Throwable -> L7b
            throw r5     // Catch: java.lang.Throwable -> L7b
        L7b:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L7d
        L7d:
            r2 = move-exception
            kotlin.p001io.CloseableKt.closeFinally(r0, r1)
            throw r2
        L82:
            kotlin.io.NoSuchFileException r0 = new kotlin.io.NoSuchFileException
            r7 = 2
            r8 = 0
            r5 = 0
            java.lang.String r6 = "The source file doesn't exist."
            r3 = r0
            r4 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            throw r0
    }

    public static /* synthetic */ java.io.File copyTo$default(java.io.File r0, java.io.File r1, boolean r2, int r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto Lb
            r3 = 8192(0x2000, float:1.148E-41)
        Lb:
            java.io.File r0 = kotlin.p001io.FilesKt.copyTo(r0, r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    public static final java.io.File createTempDir(java.lang.String r4, java.lang.String r5, java.io.File r6) {
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.File r0 = java.io.File.createTempFile(r4, r5, r6)
            r0.delete()
            boolean r1 = r0.mkdir()
            if (r1 == 0) goto L18
            java.lang.String r1 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        L18:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to create temporary directory "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            r3 = 46
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static /* synthetic */ java.io.File createTempDir$default(java.lang.String r1, java.lang.String r2, java.io.File r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = "tmp"
        L6:
            r5 = r4 & 2
            r0 = 0
            if (r5 == 0) goto Lc
            r2 = r0
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L11
            r3 = r0
        L11:
            java.io.File r1 = kotlin.p001io.FilesKt.createTempDir(r1, r2, r3)
            return r1
    }

    @kotlin.Deprecated(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    public static final java.io.File createTempFile(java.lang.String r2, java.lang.String r3, java.io.File r4) {
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.File r0 = java.io.File.createTempFile(r2, r3, r4)
            java.lang.String r1 = "createTempFile(prefix, suffix, directory)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    public static /* synthetic */ java.io.File createTempFile$default(java.lang.String r1, java.lang.String r2, java.io.File r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            java.lang.String r1 = "tmp"
        L6:
            r5 = r4 & 2
            r0 = 0
            if (r5 == 0) goto Lc
            r2 = r0
        Lc:
            r4 = r4 & 4
            if (r4 == 0) goto L11
            r3 = r0
        L11:
            java.io.File r1 = kotlin.p001io.FilesKt.createTempFile(r1, r2, r3)
            return r1
    }

    public static final boolean deleteRecursively(java.io.File r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            kotlin.io.FileTreeWalk r0 = kotlin.p001io.FilesKt.walkBottomUp(r10)
            kotlin.sequences.Sequence r0 = (kotlin.sequences.Sequence) r0
            r1 = 1
            r2 = 0
            r3 = r1
            java.util.Iterator r4 = r0.iterator()
        L12:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L34
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.io.File r6 = (java.io.File) r6
            r7 = r3
            r8 = 0
            boolean r9 = r6.delete()
            if (r9 != 0) goto L2d
            boolean r9 = r6.exists()
            if (r9 != 0) goto L31
        L2d:
            if (r7 == 0) goto L31
            r9 = 1
            goto L32
        L31:
            r9 = 0
        L32:
            r3 = r9
            goto L12
        L34:
            return r3
    }

    public static final boolean endsWith(java.io.File r5, java.io.File r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.io.FilePathComponents r0 = kotlin.p001io.FilesKt.toComponents(r5)
            kotlin.io.FilePathComponents r1 = kotlin.p001io.FilesKt.toComponents(r6)
            boolean r2 = r1.isRooted()
            if (r2 == 0) goto L1d
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r6)
            return r2
        L1d:
            int r2 = r0.getSize()
            int r3 = r1.getSize()
            int r2 = r2 - r3
            if (r2 >= 0) goto L2a
            r3 = 0
            goto L3e
        L2a:
            java.util.List r3 = r0.getSegments()
            int r4 = r0.getSize()
            java.util.List r3 = r3.subList(r2, r4)
            java.util.List r4 = r1.getSegments()
            boolean r3 = r3.equals(r4)
        L3e:
            return r3
    }

    public static final boolean endsWith(java.io.File r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r0 = kotlin.p001io.FilesKt.endsWith(r1, r0)
            return r0
    }

    public static final java.lang.String getExtension(java.io.File r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = r3.getName()
            java.lang.String r1 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 46
            java.lang.String r2 = ""
            java.lang.String r0 = kotlin.text.StringsKt.substringAfterLast(r0, r1, r2)
            return r0
    }

    public static final java.lang.String getInvariantSeparatorsPath(java.io.File r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            char r0 = java.io.File.separatorChar
            r1 = 47
            java.lang.String r2 = "path"
            if (r0 == r1) goto L20
            java.lang.String r3 = r9.getPath()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            char r4 = java.io.File.separatorChar
            r7 = 4
            r8 = 0
            r5 = 47
            r6 = 0
            java.lang.String r0 = kotlin.text.StringsKt.replace$default(r3, r4, r5, r6, r7, r8)
            goto L27
        L20:
            java.lang.String r0 = r9.getPath()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
        L27:
            return r0
    }

    public static final java.lang.String getNameWithoutExtension(java.io.File r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = r4.getName()
            java.lang.String r1 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 0
            r2 = 2
            java.lang.String r3 = "."
            java.lang.String r0 = kotlin.text.StringsKt.substringBeforeLast$default(r0, r3, r1, r2, r1)
            return r0
    }

    public static final java.io.File normalize(java.io.File r13) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            kotlin.io.FilePathComponents r0 = kotlin.p001io.FilesKt.toComponents(r13)
            r1 = 0
            java.io.File r2 = r0.getRoot()
            java.util.List r3 = r0.getSegments()
            java.util.List r3 = normalize$FilesKt__UtilsKt(r3)
            r4 = r3
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.String r3 = java.io.File.separator
            java.lang.String r5 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
            r5 = r3
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r11 = 62
            r12 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r3 = kotlin.collections.CollectionsKt.joinToString$default(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.io.File r0 = kotlin.p001io.FilesKt.resolve(r2, r3)
            return r0
    }

    private static final java.util.List<java.io.File> normalize$FilesKt__UtilsKt(java.util.List<? extends java.io.File> r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.size()
            r0.<init>(r1)
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r1 = r5.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L57
            java.lang.Object r2 = r1.next()
            java.io.File r2 = (java.io.File) r2
            java.lang.String r3 = r2.getName()
            java.lang.String r4 = "."
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r4 != 0) goto Lf
            java.lang.String r4 = ".."
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 == 0) goto L53
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L4f
            java.lang.Object r3 = kotlin.collections.CollectionsKt.last(r0)
            java.io.File r3 = (java.io.File) r3
            java.lang.String r3 = r3.getName()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L4f
            int r3 = r0.size()
            int r3 = r3 + (-1)
            r0.remove(r3)
            goto Lf
        L4f:
            r0.add(r2)
            goto Lf
        L53:
            r0.add(r2)
            goto Lf
        L57:
            return r0
    }

    private static final kotlin.p001io.FilePathComponents normalize$FilesKt__UtilsKt(kotlin.p001io.FilePathComponents r3) {
            kotlin.io.FilePathComponents r0 = new kotlin.io.FilePathComponents
            java.io.File r1 = r3.getRoot()
            java.util.List r2 = r3.getSegments()
            java.util.List r2 = normalize$FilesKt__UtilsKt(r2)
            r0.<init>(r1, r2)
            return r0
    }

    public static final java.io.File relativeTo(java.io.File r2, java.io.File r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = kotlin.p001io.FilesKt.toRelativeString(r2, r3)
            r0.<init>(r1)
            return r0
    }

    public static final java.io.File relativeToOrNull(java.io.File r3, java.io.File r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = toRelativeStringOrNull$FilesKt__UtilsKt(r3, r4)
            if (r0 == 0) goto L17
            r1 = 0
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            goto L18
        L17:
            r2 = 0
        L18:
            return r2
    }

    public static final java.io.File relativeToOrSelf(java.io.File r3, java.io.File r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = toRelativeStringOrNull$FilesKt__UtilsKt(r3, r4)
            if (r0 == 0) goto L17
            r1 = 0
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            goto L18
        L17:
            r2 = r3
        L18:
            return r2
    }

    public static final java.io.File resolve(java.io.File r6, java.io.File r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "relative"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            boolean r0 = kotlin.p001io.FilesKt.isRooted(r7)
            if (r0 == 0) goto L11
            return r7
        L11:
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "this.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            r2 = 0
            if (r1 != 0) goto L26
            r1 = 1
            goto L27
        L26:
            r1 = r2
        L27:
            if (r1 != 0) goto L54
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            char r3 = java.io.File.separatorChar
            r4 = 2
            r5 = 0
            boolean r1 = kotlin.text.StringsKt.endsWith$default(r1, r3, r2, r4, r5)
            if (r1 == 0) goto L37
            goto L54
        L37:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r0)
            char r3 = java.io.File.separatorChar
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            goto L6a
        L54:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
        L6a:
            return r1
    }

    public static final java.io.File resolve(java.io.File r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "relative"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.io.File r0 = kotlin.p001io.FilesKt.resolve(r1, r0)
            return r0
    }

    public static final java.io.File resolveSibling(java.io.File r3, java.io.File r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "relative"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            kotlin.io.FilePathComponents r0 = kotlin.p001io.FilesKt.toComponents(r3)
            int r1 = r0.getSize()
            if (r1 != 0) goto L1c
            java.io.File r1 = new java.io.File
            java.lang.String r2 = ".."
            r1.<init>(r2)
            goto L27
        L1c:
            int r1 = r0.getSize()
            int r1 = r1 + (-1)
            r2 = 0
            java.io.File r1 = r0.subPath(r2, r1)
        L27:
            java.io.File r2 = r0.getRoot()
            java.io.File r2 = kotlin.p001io.FilesKt.resolve(r2, r1)
            java.io.File r2 = kotlin.p001io.FilesKt.resolve(r2, r4)
            return r2
    }

    public static final java.io.File resolveSibling(java.io.File r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "relative"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.io.File r0 = kotlin.p001io.FilesKt.resolveSibling(r1, r0)
            return r0
    }

    public static final boolean startsWith(java.io.File r5, java.io.File r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.io.FilePathComponents r0 = kotlin.p001io.FilesKt.toComponents(r5)
            kotlin.io.FilePathComponents r1 = kotlin.p001io.FilesKt.toComponents(r6)
            java.io.File r2 = r0.getRoot()
            java.io.File r3 = r1.getRoot()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            r3 = 0
            if (r2 != 0) goto L22
            return r3
        L22:
            int r2 = r0.getSize()
            int r4 = r1.getSize()
            if (r2 >= r4) goto L2d
            goto L41
        L2d:
            java.util.List r2 = r0.getSegments()
            int r4 = r1.getSize()
            java.util.List r2 = r2.subList(r3, r4)
            java.util.List r3 = r1.getSegments()
            boolean r3 = r2.equals(r3)
        L41:
            return r3
    }

    public static final boolean startsWith(java.io.File r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r0 = kotlin.p001io.FilesKt.startsWith(r1, r0)
            return r0
    }

    public static final java.lang.String toRelativeString(java.io.File r3, java.io.File r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "base"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = toRelativeStringOrNull$FilesKt__UtilsKt(r3, r4)
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "this and base files have different roots: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " and "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            r2 = 46
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static final java.lang.String toRelativeStringOrNull$FilesKt__UtilsKt(java.io.File r17, java.io.File r18) {
            kotlin.io.FilePathComponents r0 = kotlin.p001io.FilesKt.toComponents(r17)
            kotlin.io.FilePathComponents r0 = normalize$FilesKt__UtilsKt(r0)
            kotlin.io.FilePathComponents r1 = kotlin.p001io.FilesKt.toComponents(r18)
            kotlin.io.FilePathComponents r1 = normalize$FilesKt__UtilsKt(r1)
            java.io.File r2 = r0.getRoot()
            java.io.File r3 = r1.getRoot()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            r3 = 0
            if (r2 != 0) goto L20
            return r3
        L20:
            int r2 = r1.getSize()
            int r4 = r0.getSize()
            r5 = r17
            r6 = 0
            r7 = 0
            int r8 = java.lang.Math.min(r4, r2)
        L30:
            if (r7 >= r8) goto L4b
            java.util.List r9 = r0.getSegments()
            java.lang.Object r9 = r9.get(r7)
            java.util.List r10 = r1.getSegments()
            java.lang.Object r10 = r10.get(r7)
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r10)
            if (r9 == 0) goto L4b
            int r7 = r7 + 1
            goto L30
        L4b:
            r5 = r7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            int r7 = r2 + (-1)
            if (r5 > r7) goto L7c
        L56:
            java.util.List r8 = r1.getSegments()
            java.lang.Object r8 = r8.get(r7)
            java.io.File r8 = (java.io.File) r8
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = ".."
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r9)
            if (r8 == 0) goto L6d
            return r3
        L6d:
            r6.append(r9)
            if (r7 == r5) goto L77
            char r8 = java.io.File.separatorChar
            r6.append(r8)
        L77:
            if (r7 == r5) goto L7c
            int r7 = r7 + (-1)
            goto L56
        L7c:
            if (r5 >= r4) goto Lab
            if (r5 >= r2) goto L85
            char r3 = java.io.File.separatorChar
            r6.append(r3)
        L85:
            java.util.List r3 = r0.getSegments()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = kotlin.collections.CollectionsKt.drop(r3, r5)
            r7 = r3
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r8 = r6
            java.lang.Appendable r8 = (java.lang.Appendable) r8
            java.lang.String r3 = java.io.File.separator
            java.lang.String r9 = "separator"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r9)
            r9 = r3
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r15 = 124(0x7c, float:1.74E-43)
            r16 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            kotlin.collections.CollectionsKt.joinTo$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        Lab:
            java.lang.String r3 = r6.toString()
            return r3
    }
}
