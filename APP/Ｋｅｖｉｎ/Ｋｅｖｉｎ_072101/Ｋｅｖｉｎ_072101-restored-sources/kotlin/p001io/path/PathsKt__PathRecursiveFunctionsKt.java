package kotlin.p001io.path;

/* JADX INFO: compiled from: PathRecursiveFunctions.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0082\b¢\u0006\u0002\b\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b\n\u001a\u001d\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b\r\u001a&\u0010\u000e\u001a\u0004\u0018\u0001H\u000f\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0005H\u0082\b¢\u0006\u0004\b\u0010\u0010\u0011\u001aw\u0010\u0012\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2Q\b\u0002\u0010\u0014\u001aK\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0013\u0012\u0017\u0012\u00150\u0019j\u0002`\u001a¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u00152\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007\u001a´\u0001\u0010\u0012\u001a\u00020\t*\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2Q\b\u0002\u0010\u0014\u001aK\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0013\u0012\u0017\u0012\u00150\u0019j\u0002`\u001a¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u00152\u0006\u0010\u001d\u001a\u00020\u001e2C\b\u0002\u0010 \u001a=\u0012\u0004\u0012\u00020!\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\"0\u0015¢\u0006\u0002\b#H\u0007\u001a\f\u0010$\u001a\u00020\u0001*\u00020\tH\u0007\u001a\u001b\u0010%\u001a\f\u0012\b\u0012\u00060\u0019j\u0002`\u001a0&*\u00020\tH\u0002¢\u0006\u0002\b'\u001a'\u0010(\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0)2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b*\u001a'\u0010+\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0)2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b,\u001a5\u0010-\u001a\u00020\u001e*\b\u0012\u0004\u0012\u00020\t0)2\u0006\u0010.\u001a\u00020\t2\u0012\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020100\"\u000201H\u0002¢\u0006\u0004\b2\u00103\u001a\u0011\u00104\u001a\u000205*\u00020\"H\u0003¢\u0006\u0002\b6\u001a\u0011\u00104\u001a\u000205*\u00020\u001cH\u0003¢\u0006\u0002\b6¨\u00067"}, m115d2 = {"collectIfThrows", "", "collector", "Lkotlin/io/path/ExceptionsCollector;", "function", "Lkotlin/Function0;", "collectIfThrows$PathsKt__PathRecursiveFunctionsKt", "insecureEnterDirectory", "path", "Ljava/nio/file/Path;", "insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt", "insecureHandleEntry", "entry", "insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt", "tryIgnoreNoSuchFileException", "R", "tryIgnoreNoSuchFileException$PathsKt__PathRecursiveFunctionsKt", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "copyToRecursively", "target", "onError", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "source", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "Lkotlin/io/path/OnErrorResult;", "followLinks", "", "overwrite", "copyAction", "Lkotlin/io/path/CopyActionContext;", "Lkotlin/io/path/CopyActionResult;", "Lkotlin/ExtensionFunctionType;", "deleteRecursively", "deleteRecursivelyImpl", "", "deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt", "enterDirectory", "Ljava/nio/file/SecureDirectoryStream;", "enterDirectory$PathsKt__PathRecursiveFunctionsKt", "handleEntry", "handleEntry$PathsKt__PathRecursiveFunctionsKt", "isDirectory", "entryName", "options", "", "Ljava/nio/file/LinkOption;", "isDirectory$PathsKt__PathRecursiveFunctionsKt", "(Ljava/nio/file/SecureDirectoryStream;Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z", "toFileVisitResult", "Ljava/nio/file/FileVisitResult;", "toFileVisitResult$PathsKt__PathRecursiveFunctionsKt", "kotlin-stdlib-jdk7"}, m116k = 5, m117mv = {1, 9, 0}, m119xi = 49, m120xs = "kotlin/io/path/PathsKt")
class PathsKt__PathRecursiveFunctionsKt extends kotlin.p001io.path.PathsKt__PathReadWriteKt {

    /* JADX INFO: compiled from: PathRecursiveFunctions.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 9, 0}, m119xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = null;

        static {
                kotlin.io.path.CopyActionResult[] r0 = kotlin.p001io.path.CopyActionResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                kotlin.io.path.CopyActionResult r2 = kotlin.p001io.path.CopyActionResult.CONTINUE     // Catch: java.lang.NoSuchFieldError -> L11
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L11
                goto L12
            L11:
                r2 = move-exception
            L12:
                r2 = 2
                kotlin.io.path.CopyActionResult r3 = kotlin.p001io.path.CopyActionResult.TERMINATE     // Catch: java.lang.NoSuchFieldError -> L1c
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c
                r0[r3] = r2     // Catch: java.lang.NoSuchFieldError -> L1c
                goto L1d
            L1c:
                r3 = move-exception
            L1d:
                kotlin.io.path.CopyActionResult r3 = kotlin.p001io.path.CopyActionResult.SKIP_SUBTREE     // Catch: java.lang.NoSuchFieldError -> L27
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L27
                r4 = 3
                r0[r3] = r4     // Catch: java.lang.NoSuchFieldError -> L27
                goto L28
            L27:
                r3 = move-exception
            L28:
                kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.WhenMappings.$EnumSwitchMapping$0 = r0
                kotlin.io.path.OnErrorResult[] r0 = kotlin.p001io.path.OnErrorResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.io.path.OnErrorResult r3 = kotlin.p001io.path.OnErrorResult.TERMINATE     // Catch: java.lang.NoSuchFieldError -> L3a
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3a
                r0[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L3a
                goto L3b
            L3a:
                r1 = move-exception
            L3b:
                kotlin.io.path.OnErrorResult r1 = kotlin.p001io.path.OnErrorResult.SKIP_SUBTREE     // Catch: java.lang.NoSuchFieldError -> L44
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L44
                goto L45
            L44:
                r1 = move-exception
            L45:
                kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.WhenMappings.$EnumSwitchMapping$1 = r0
                return
        }
    }






    public PathsKt__PathRecursiveFunctionsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ java.nio.file.FileVisitResult access$copyToRecursively$copy(kotlin.jvm.functions.Function3 r1, java.nio.file.Path r2, java.nio.file.Path r3, kotlin.jvm.functions.Function3 r4, java.nio.file.Path r5, java.nio.file.attribute.BasicFileAttributes r6) {
            java.nio.file.FileVisitResult r0 = copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static final /* synthetic */ java.nio.file.FileVisitResult access$copyToRecursively$error(kotlin.jvm.functions.Function3 r1, java.nio.file.Path r2, java.nio.file.Path r3, java.nio.file.Path r4, java.lang.Exception r5) {
            java.nio.file.FileVisitResult r0 = copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(r1, r2, r3, r4, r5)
            return r0
    }

    private static final void collectIfThrows$PathsKt__PathRecursiveFunctionsKt(kotlin.p001io.path.ExceptionsCollector r2, kotlin.jvm.functions.Function0<kotlin.Unit> r3) {
            r0 = 0
            r3.invoke()     // Catch: java.lang.Exception -> L6
            goto La
        L6:
            r1 = move-exception
            r2.collect(r1)
        La:
            return
    }

    public static final java.nio.file.Path copyToRecursively(java.nio.file.Path r7, java.nio.file.Path r8, kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.p001io.path.OnErrorResult> r9, boolean r10, kotlin.jvm.functions.Function3<? super kotlin.p001io.path.CopyActionContext, ? super java.nio.file.Path, ? super java.nio.file.Path, ? extends kotlin.p001io.path.CopyActionResult> r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "copyAction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            kotlin.io.path.LinkFollowing r0 = kotlin.p001io.path.LinkFollowing.INSTANCE
            java.nio.file.LinkOption[] r0 = r0.toLinkOptions(r10)
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.nio.file.LinkOption[] r0 = (java.nio.file.LinkOption[]) r0
            boolean r0 = java.nio.file.Files.exists(r7, r0)
            if (r0 == 0) goto Ld6
            r0 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r1 = java.nio.file.Files.exists(r7, r1)
            if (r1 == 0) goto Lc5
            if (r10 != 0) goto L45
            boolean r1 = java.nio.file.Files.isSymbolicLink(r7)
            if (r1 != 0) goto Lc5
        L45:
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r0]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r1 = java.nio.file.Files.exists(r8, r1)
            r2 = 1
            if (r1 == 0) goto L5c
            boolean r1 = java.nio.file.Files.isSymbolicLink(r8)
            if (r1 != 0) goto L5c
            r1 = r2
            goto L5d
        L5c:
            r1 = r0
        L5d:
            if (r1 == 0) goto L65
            boolean r3 = java.nio.file.Files.isSameFile(r7, r8)
            if (r3 != 0) goto Lc5
        L65:
        L66:
            java.nio.file.FileSystem r3 = r7.getFileSystem()
            java.nio.file.FileSystem r4 = r8.getFileSystem()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L75
            goto Lb0
        L75:
            if (r1 == 0) goto L88
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[r0]
            java.nio.file.Path r2 = r8.toRealPath(r2)
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            java.nio.file.Path r0 = r7.toRealPath(r0)
            boolean r0 = r2.startsWith(r0)
            goto Lb0
        L88:
            java.nio.file.Path r3 = r8.getParent()
            if (r3 == 0) goto Lb0
            r4 = 0
            java.nio.file.LinkOption[] r5 = new java.nio.file.LinkOption[r0]
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r0)
            java.nio.file.LinkOption[] r5 = (java.nio.file.LinkOption[]) r5
            boolean r5 = java.nio.file.Files.exists(r3, r5)
            if (r5 == 0) goto Lb0
            java.nio.file.LinkOption[] r5 = new java.nio.file.LinkOption[r0]
            java.nio.file.Path r5 = r3.toRealPath(r5)
            java.nio.file.LinkOption[] r6 = new java.nio.file.LinkOption[r0]
            java.nio.file.Path r6 = r7.toRealPath(r6)
            boolean r5 = r5.startsWith(r6)
            if (r5 == 0) goto Lb0
            r0 = r2
        Lb0:
            if (r0 != 0) goto Lb4
            goto Lc5
        Lb4:
            java.nio.file.FileSystemException r2 = new java.nio.file.FileSystemException
            java.lang.String r3 = r7.toString()
            java.lang.String r4 = r8.toString()
            java.lang.String r5 = "Recursively copying a directory into its subdirectory is prohibited."
            r2.<init>(r3, r4, r5)
            throw r2
        Lc5:
            kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5 r0 = new kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5
            r0.<init>(r11, r7, r8, r9)
            r4 = r0
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r5 = 1
            r6 = 0
            r2 = 0
            r1 = r7
            r3 = r10
            kotlin.p001io.path.PathsKt.visitFileTree$default(r1, r2, r3, r4, r5, r6)
            return r8
        Ld6:
            java.nio.file.NoSuchFileException r0 = new java.nio.file.NoSuchFileException
            java.lang.String r1 = r7.toString()
            java.lang.String r2 = r8.toString()
            java.lang.String r3 = "The source file doesn't exist."
            r0.<init>(r1, r2, r3)
            throw r0
    }

    public static final java.nio.file.Path copyToRecursively(java.nio.file.Path r8, java.nio.file.Path r9, kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.p001io.path.OnErrorResult> r10, boolean r11, boolean r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            if (r12 == 0) goto L1d
            kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$2 r0 = new kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$2
            r0.<init>(r11)
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0
            java.nio.file.Path r0 = kotlin.p001io.path.PathsKt.copyToRecursively(r8, r9, r10, r11, r0)
            goto L29
        L1d:
            r6 = 8
            r7 = 0
            r5 = 0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            java.nio.file.Path r0 = kotlin.p001io.path.PathsKt.copyToRecursively$default(r1, r2, r3, r4, r5, r6, r7)
        L29:
            return r0
    }

    private static final java.nio.file.FileVisitResult copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(kotlin.jvm.functions.Function3<? super kotlin.p001io.path.CopyActionContext, ? super java.nio.file.Path, ? super java.nio.file.Path, ? extends kotlin.p001io.path.CopyActionResult> r2, java.nio.file.Path r3, java.nio.file.Path r4, kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.p001io.path.OnErrorResult> r5, java.nio.file.Path r6, java.nio.file.attribute.BasicFileAttributes r7) {
            kotlin.io.path.DefaultCopyActionContext r0 = kotlin.p001io.path.DefaultCopyActionContext.INSTANCE     // Catch: java.lang.Exception -> L12
            java.nio.file.Path r1 = copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(r3, r4, r6)     // Catch: java.lang.Exception -> L12
            java.lang.Object r0 = r2.invoke(r0, r6, r1)     // Catch: java.lang.Exception -> L12
            kotlin.io.path.CopyActionResult r0 = (kotlin.p001io.path.CopyActionResult) r0     // Catch: java.lang.Exception -> L12
            java.nio.file.FileVisitResult r0 = toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(r0)     // Catch: java.lang.Exception -> L12
            goto L18
        L12:
            r0 = move-exception
            java.nio.file.FileVisitResult r1 = copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(r5, r3, r4, r6, r0)
            r0 = r1
        L18:
            return r0
    }

    public static /* synthetic */ java.nio.file.Path copyToRecursively$default(java.nio.file.Path r0, java.nio.file.Path r1, kotlin.jvm.functions.Function3 r2, boolean r3, kotlin.jvm.functions.Function3 r4, int r5, java.lang.Object r6) {
            r6 = r5 & 2
            if (r6 == 0) goto L8
            kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$3 r2 = kotlin.p001io.path.PathsKt__PathRecursiveFunctionsKt.C07523.INSTANCE
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
        L8:
            r5 = r5 & 8
            if (r5 == 0) goto L13
            kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$4 r4 = new kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$4
            r4.<init>(r3)
            kotlin.jvm.functions.Function3 r4 = (kotlin.jvm.functions.Function3) r4
        L13:
            java.nio.file.Path r0 = kotlin.p001io.path.PathsKt.copyToRecursively(r0, r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ java.nio.file.Path copyToRecursively$default(java.nio.file.Path r0, java.nio.file.Path r1, kotlin.jvm.functions.Function3 r2, boolean r3, boolean r4, int r5, java.lang.Object r6) {
            r5 = r5 & 2
            if (r5 == 0) goto L8
            kotlin.io.path.PathsKt__PathRecursiveFunctionsKt$copyToRecursively$1 r2 = kotlin.p001io.path.PathsKt__PathRecursiveFunctionsKt.C07501.INSTANCE
            kotlin.jvm.functions.Function3 r2 = (kotlin.jvm.functions.Function3) r2
        L8:
            java.nio.file.Path r0 = kotlin.p001io.path.PathsKt.copyToRecursively(r0, r1, r2, r3, r4)
            return r0
    }

    private static final java.nio.file.Path copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(java.nio.file.Path r3, java.nio.file.Path r4, java.nio.file.Path r5) {
            java.nio.file.Path r0 = kotlin.p001io.path.PathsKt.relativeTo(r5, r3)
            java.lang.String r1 = r0.toString()
            java.nio.file.Path r1 = r4.resolve(r1)
            java.lang.String r2 = "target.resolve(relativePath.pathString)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    private static final java.nio.file.FileVisitResult copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(kotlin.jvm.functions.Function3<? super java.nio.file.Path, ? super java.nio.file.Path, ? super java.lang.Exception, ? extends kotlin.p001io.path.OnErrorResult> r1, java.nio.file.Path r2, java.nio.file.Path r3, java.nio.file.Path r4, java.lang.Exception r5) {
            java.nio.file.Path r0 = copyToRecursively$destination$PathsKt__PathRecursiveFunctionsKt(r2, r3, r4)
            java.lang.Object r0 = r1.invoke(r4, r0, r5)
            kotlin.io.path.OnErrorResult r0 = (kotlin.p001io.path.OnErrorResult) r0
            java.nio.file.FileVisitResult r0 = toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(r0)
            return r0
    }

    public static final void deleteRecursively(java.nio.file.Path r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.util.List r0 = deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt(r12)
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L41
            java.nio.file.FileSystemException r1 = new java.nio.file.FileSystemException
            java.lang.String r2 = "Failed to delete one or more files. See suppressed exceptions for details."
            r1.<init>(r2)
            r2 = r1
            r3 = 0
            r4 = r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            r5 = 0
            java.util.Iterator r6 = r4.iterator()
        L23:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L3c
            java.lang.Object r7 = r6.next()
            r8 = r7
            java.lang.Exception r8 = (java.lang.Exception) r8
            r9 = 0
            r10 = r2
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            r11 = r8
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            kotlin.ExceptionsKt.addSuppressed(r10, r11)
            goto L23
        L3c:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L41:
            return
    }

    private static final java.util.List<java.lang.Exception> deleteRecursivelyImpl$PathsKt__PathRecursiveFunctionsKt(java.nio.file.Path r12) {
            kotlin.io.path.ExceptionsCollector r0 = new kotlin.io.path.ExceptionsCollector
            r1 = 0
            r2 = 1
            r3 = 0
            r0.<init>(r1, r2, r3)
            r1 = 0
            r1 = 1
            java.nio.file.Path r2 = r12.getParent()
            if (r2 == 0) goto L46
            r4 = 0
            java.nio.file.DirectoryStream r5 = java.nio.file.Files.newDirectoryStream(r2)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r5 = move-exception
            r5 = r3
        L18:
            if (r5 == 0) goto L46
            r6 = r5
            java.io.Closeable r6 = (java.io.Closeable) r6
            r7 = r6
            java.nio.file.DirectoryStream r7 = (java.nio.file.DirectoryStream) r7     // Catch: java.lang.Throwable -> L3f
            r8 = 0
            boolean r9 = r7 instanceof java.nio.file.SecureDirectoryStream     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L38
            r1 = 0
            r0.setPath(r2)     // Catch: java.lang.Throwable -> L3f
            r9 = r7
            java.nio.file.SecureDirectoryStream r9 = (java.nio.file.SecureDirectoryStream) r9     // Catch: java.lang.Throwable -> L3f
            java.nio.file.Path r10 = r12.getFileName()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r11 = "this.fileName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)     // Catch: java.lang.Throwable -> L3f
            handleEntry$PathsKt__PathRecursiveFunctionsKt(r9, r10, r0)     // Catch: java.lang.Throwable -> L3f
        L38:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3f
            kotlin.p001io.CloseableKt.closeFinally(r6, r3)
            goto L46
        L3f:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L41
        L41:
            r7 = move-exception
            kotlin.p001io.CloseableKt.closeFinally(r6, r3)
            throw r7
        L46:
            if (r1 == 0) goto L4c
            insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(r12, r0)
        L4c:
            java.util.List r2 = r0.getCollectedExceptions()
            return r2
    }

    private static final void enterDirectory$PathsKt__PathRecursiveFunctionsKt(java.nio.file.SecureDirectoryStream<java.nio.file.Path> r10, java.nio.file.Path r11, kotlin.p001io.path.ExceptionsCollector r12) {
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            java.nio.file.LinkOption r5 = java.nio.file.LinkOption.NOFOLLOW_LINKS     // Catch: java.lang.Exception -> L12 java.nio.file.NoSuchFileException -> L14
            java.nio.file.LinkOption[] r5 = new java.nio.file.LinkOption[]{r5}     // Catch: java.lang.Exception -> L12 java.nio.file.NoSuchFileException -> L14
            java.nio.file.SecureDirectoryStream r5 = r10.newDirectoryStream(r11, r5)     // Catch: java.lang.Exception -> L12 java.nio.file.NoSuchFileException -> L14
            goto L16
        L12:
            r1 = move-exception
            goto L4a
        L14:
            r3 = move-exception
            r5 = r4
        L16:
            if (r5 == 0) goto L4e
            java.io.Closeable r5 = (java.io.Closeable) r5     // Catch: java.lang.Exception -> L12
            r2 = r5
            java.nio.file.SecureDirectoryStream r2 = (java.nio.file.SecureDirectoryStream) r2     // Catch: java.lang.Throwable -> L43
            r3 = 0
            java.util.Iterator r6 = r2.iterator()     // Catch: java.lang.Throwable -> L43
        L23:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L43
            if (r7 == 0) goto L3c
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L43
            java.nio.file.Path r7 = (java.nio.file.Path) r7     // Catch: java.lang.Throwable -> L43
            java.nio.file.Path r8 = r7.getFileName()     // Catch: java.lang.Throwable -> L43
            java.lang.String r9 = "entry.fileName"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)     // Catch: java.lang.Throwable -> L43
            handleEntry$PathsKt__PathRecursiveFunctionsKt(r2, r8, r12)     // Catch: java.lang.Throwable -> L43
            goto L23
        L3c:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L43
            kotlin.p001io.CloseableKt.closeFinally(r5, r4)     // Catch: java.lang.Exception -> L12
            goto L4e
        L43:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L45
        L45:
            r3 = move-exception
            kotlin.p001io.CloseableKt.closeFinally(r5, r2)     // Catch: java.lang.Exception -> L12
            throw r3     // Catch: java.lang.Exception -> L12
        L4a:
            r12.collect(r1)
            goto L50
        L4e:
        L50:
            return
    }

    private static final void handleEntry$PathsKt__PathRecursiveFunctionsKt(java.nio.file.SecureDirectoryStream<java.nio.file.Path> r5, java.nio.file.Path r6, kotlin.p001io.path.ExceptionsCollector r7) {
            r7.enterEntry(r6)
            r0 = 0
            r1 = 0
            java.nio.file.LinkOption r2 = java.nio.file.LinkOption.NOFOLLOW_LINKS     // Catch: java.lang.Exception -> L34
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[]{r2}     // Catch: java.lang.Exception -> L34
            boolean r2 = isDirectory$PathsKt__PathRecursiveFunctionsKt(r5, r6, r2)     // Catch: java.lang.Exception -> L34
            if (r2 == 0) goto L29
            int r2 = r7.getTotalExceptions()     // Catch: java.lang.Exception -> L34
            enterDirectory$PathsKt__PathRecursiveFunctionsKt(r5, r6, r7)     // Catch: java.lang.Exception -> L34
            int r3 = r7.getTotalExceptions()     // Catch: java.lang.Exception -> L34
            if (r2 != r3) goto L32
            r3 = 0
            r4 = 0
            r5.deleteDirectory(r6)     // Catch: java.nio.file.NoSuchFileException -> L27 java.lang.Exception -> L34
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.nio.file.NoSuchFileException -> L27 java.lang.Exception -> L34
            goto L32
        L27:
            r4 = move-exception
            goto L32
        L29:
            r2 = 0
            r3 = 0
            r5.deleteFile(r6)     // Catch: java.nio.file.NoSuchFileException -> L31 java.lang.Exception -> L34
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.nio.file.NoSuchFileException -> L31 java.lang.Exception -> L34
            goto L32
        L31:
            r3 = move-exception
        L32:
            goto L38
        L34:
            r1 = move-exception
            r7.collect(r1)
        L38:
            r7.exitEntry(r6)
            return
    }

    private static final void insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt(java.nio.file.Path r9, kotlin.p001io.path.ExceptionsCollector r10) {
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            java.nio.file.DirectoryStream r5 = java.nio.file.Files.newDirectoryStream(r9)     // Catch: java.lang.Exception -> Lc java.nio.file.NoSuchFileException -> Le
            goto L10
        Lc:
            r1 = move-exception
            goto L40
        Le:
            r3 = move-exception
            r5 = r4
        L10:
            if (r5 == 0) goto L44
            java.io.Closeable r5 = (java.io.Closeable) r5     // Catch: java.lang.Exception -> Lc
            r2 = r5
            java.nio.file.DirectoryStream r2 = (java.nio.file.DirectoryStream) r2     // Catch: java.lang.Throwable -> L39
            r3 = 0
            java.util.Iterator r6 = r2.iterator()     // Catch: java.lang.Throwable -> L39
        L1d:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L39
            if (r7 == 0) goto L32
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L39
            java.nio.file.Path r7 = (java.nio.file.Path) r7     // Catch: java.lang.Throwable -> L39
            java.lang.String r8 = "entry"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)     // Catch: java.lang.Throwable -> L39
            insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(r7, r10)     // Catch: java.lang.Throwable -> L39
            goto L1d
        L32:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L39
            kotlin.p001io.CloseableKt.closeFinally(r5, r4)     // Catch: java.lang.Exception -> Lc
            goto L44
        L39:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L3b
        L3b:
            r3 = move-exception
            kotlin.p001io.CloseableKt.closeFinally(r5, r2)     // Catch: java.lang.Exception -> Lc
            throw r3     // Catch: java.lang.Exception -> Lc
        L40:
            r10.collect(r1)
            goto L46
        L44:
        L46:
            return
    }

    private static final void insecureHandleEntry$PathsKt__PathRecursiveFunctionsKt(java.nio.file.Path r4, kotlin.p001io.path.ExceptionsCollector r5) {
            r0 = 0
            r1 = 0
            java.nio.file.LinkOption r2 = java.nio.file.LinkOption.NOFOLLOW_LINKS     // Catch: java.lang.Exception -> L2c
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[]{r2}     // Catch: java.lang.Exception -> L2c
            r3 = 1
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)     // Catch: java.lang.Exception -> L2c
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2     // Catch: java.lang.Exception -> L2c
            boolean r2 = java.nio.file.Files.isDirectory(r4, r2)     // Catch: java.lang.Exception -> L2c
            if (r2 == 0) goto L27
            int r2 = r5.getTotalExceptions()     // Catch: java.lang.Exception -> L2c
            insecureEnterDirectory$PathsKt__PathRecursiveFunctionsKt(r4, r5)     // Catch: java.lang.Exception -> L2c
            int r3 = r5.getTotalExceptions()     // Catch: java.lang.Exception -> L2c
            if (r2 != r3) goto L2a
            java.nio.file.Files.deleteIfExists(r4)     // Catch: java.lang.Exception -> L2c
            goto L2a
        L27:
            java.nio.file.Files.deleteIfExists(r4)     // Catch: java.lang.Exception -> L2c
        L2a:
            goto L30
        L2c:
            r1 = move-exception
            r5.collect(r1)
        L30:
            return
    }

    private static final boolean isDirectory$PathsKt__PathRecursiveFunctionsKt(java.nio.file.SecureDirectoryStream<java.nio.file.Path> r4, java.nio.file.Path r5, java.nio.file.LinkOption... r6) {
            r0 = 0
            r1 = 0
            java.lang.Class<java.nio.file.attribute.BasicFileAttributeView> r2 = java.nio.file.attribute.BasicFileAttributeView.class
            int r3 = r6.length     // Catch: java.nio.file.NoSuchFileException -> L1e
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r6, r3)     // Catch: java.nio.file.NoSuchFileException -> L1e
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3     // Catch: java.nio.file.NoSuchFileException -> L1e
            java.nio.file.attribute.FileAttributeView r2 = r4.getFileAttributeView(r5, r2, r3)     // Catch: java.nio.file.NoSuchFileException -> L1e
            java.nio.file.attribute.BasicFileAttributeView r2 = (java.nio.file.attribute.BasicFileAttributeView) r2     // Catch: java.nio.file.NoSuchFileException -> L1e
            java.nio.file.attribute.BasicFileAttributes r2 = r2.readAttributes()     // Catch: java.nio.file.NoSuchFileException -> L1e
            boolean r2 = r2.isDirectory()     // Catch: java.nio.file.NoSuchFileException -> L1e
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)     // Catch: java.nio.file.NoSuchFileException -> L1e
            goto L21
        L1e:
            r1 = move-exception
            r2 = 0
            r1 = r2
        L21:
            if (r1 == 0) goto L28
            boolean r0 = r1.booleanValue()
            goto L29
        L28:
            r0 = 0
        L29:
            return r0
    }

    private static final java.nio.file.FileVisitResult toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(kotlin.p001io.path.CopyActionResult r2) {
            int[] r0 = kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.WhenMappings.$EnumSwitchMapping$0
            int r1 = r2.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L17;
                case 2: goto L14;
                case 3: goto L11;
                default: goto Lb;
            }
        Lb:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L11:
            java.nio.file.FileVisitResult r0 = java.nio.file.FileVisitResult.SKIP_SUBTREE
            goto L19
        L14:
            java.nio.file.FileVisitResult r0 = java.nio.file.FileVisitResult.TERMINATE
            goto L19
        L17:
            java.nio.file.FileVisitResult r0 = java.nio.file.FileVisitResult.CONTINUE
        L19:
            return r0
    }

    private static final java.nio.file.FileVisitResult toFileVisitResult$PathsKt__PathRecursiveFunctionsKt(kotlin.p001io.path.OnErrorResult r2) {
            int[] r0 = kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.WhenMappings.$EnumSwitchMapping$1
            int r1 = r2.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L14;
                case 2: goto L11;
                default: goto Lb;
            }
        Lb:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L11:
            java.nio.file.FileVisitResult r0 = java.nio.file.FileVisitResult.SKIP_SUBTREE
            goto L16
        L14:
            java.nio.file.FileVisitResult r0 = java.nio.file.FileVisitResult.TERMINATE
        L16:
            return r0
    }

    private static final <R> R tryIgnoreNoSuchFileException$PathsKt__PathRecursiveFunctionsKt(kotlin.jvm.functions.Function0<? extends R> r3) {
            r0 = 0
            java.lang.Object r1 = r3.invoke()     // Catch: java.nio.file.NoSuchFileException -> L6
            goto L9
        L6:
            r1 = move-exception
            r2 = 0
            r1 = r2
        L9:
            return r1
    }
}
