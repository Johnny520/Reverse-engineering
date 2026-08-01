package okio.internal;

/* JADX INFO: compiled from: ResourceFileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001/B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0001¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J\u0018\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0018\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J \u0010&\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0018\u0010'\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020(2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u001e\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\n0\t*\u00020\u0003H\u0002J\u001a\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n*\u00020+H\u0002J\u001a\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n*\u00020+H\u0002J\f\u0010-\u001a\u00020.*\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\n0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, m115d2 = {"Lokio/internal/ResourceFileSystem;", "Lokio/FileSystem;", "classLoader", "Ljava/lang/ClassLoader;", "indexEagerly", "", "systemFileSystem", "(Ljava/lang/ClassLoader;ZLokio/FileSystem;)V", "roots", "", "Lkotlin/Pair;", "Lokio/Path;", "getRoots", "()Ljava/util/List;", "roots$delegate", "Lkotlin/Lazy;", "appendingSink", "Lokio/Sink;", "file", "mustExist", "atomicMove", "", "source", "target", "canonicalize", "path", "canonicalizeInternal", "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", "listOrNull", "metadataOrNull", "Lokio/FileMetadata;", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "toClasspathRoots", "toFileRoot", "Ljava/net/URL;", "toJarRoot", "toRelativePath", "", "Companion", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
public final class ResourceFileSystem extends okio.FileSystem {
    private static final okio.internal.ResourceFileSystem.Companion Companion = null;
    private static final okio.Path ROOT = null;
    private final java.lang.ClassLoader classLoader;
    private final kotlin.Lazy roots$delegate;
    private final okio.FileSystem systemFileSystem;

    /* JADX INFO: compiled from: ResourceFileSystem.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, m115d2 = {"Lokio/internal/ResourceFileSystem$Companion;", "", "()V", "ROOT", "Lokio/Path;", "getROOT", "()Lokio/Path;", "keepPath", "", "path", "removeBase", "base", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
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

        public static final /* synthetic */ boolean access$keepPath(okio.internal.ResourceFileSystem.Companion r1, okio.Path r2) {
                boolean r0 = r1.keepPath(r2)
                return r0
        }

        private final boolean keepPath(okio.Path r4) {
                r3 = this;
                java.lang.String r0 = r4.name()
                java.lang.String r1 = ".class"
                r2 = 1
                boolean r0 = kotlin.text.StringsKt.endsWith(r0, r1, r2)
                r0 = r0 ^ r2
                return r0
        }

        public final okio.Path getROOT() {
                r1 = this;
                okio.Path r0 = okio.internal.ResourceFileSystem.access$getROOT$cp()
                return r0
        }

        public final okio.Path removeBase(okio.Path r11, okio.Path r12) {
                r10 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
                java.lang.String r0 = "base"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
                java.lang.String r0 = r12.toString()
                okio.Path r1 = r10.getROOT()
                java.lang.String r2 = r11.toString()
                r3 = r0
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                java.lang.String r4 = kotlin.text.StringsKt.removePrefix(r2, r3)
                r8 = 4
                r9 = 0
                r5 = 92
                r6 = 47
                r7 = 0
                java.lang.String r2 = kotlin.text.StringsKt.replace$default(r4, r5, r6, r7, r8, r9)
                okio.Path r1 = r1.resolve(r2)
                return r1
        }
    }

    static {
            okio.internal.ResourceFileSystem$Companion r0 = new okio.internal.ResourceFileSystem$Companion
            r1 = 0
            r0.<init>(r1)
            okio.internal.ResourceFileSystem.Companion = r0
            okio.Path$Companion r0 = okio.Path.Companion
            r2 = 0
            r3 = 1
            java.lang.String r4 = "/"
            okio.Path r0 = okio.Path.Companion.get$default(r0, r4, r2, r3, r1)
            okio.internal.ResourceFileSystem.ROOT = r0
            return
    }

    public ResourceFileSystem(java.lang.ClassLoader r2, boolean r3, okio.FileSystem r4) {
            r1 = this;
            java.lang.String r0 = "classLoader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "systemFileSystem"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.classLoader = r2
            r1.systemFileSystem = r4
            okio.internal.ResourceFileSystem$roots$2 r0 = new okio.internal.ResourceFileSystem$roots$2
            r0.<init>(r1)
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r1.roots$delegate = r0
            if (r3 == 0) goto L28
            java.util.List r0 = r1.getRoots()
            r0.size()
        L28:
            return
    }

    public /* synthetic */ ResourceFileSystem(java.lang.ClassLoader r1, boolean r2, okio.FileSystem r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L6
            okio.FileSystem r3 = okio.FileSystem.SYSTEM
        L6:
            r0.<init>(r1, r2, r3)
            return
    }

    public static final /* synthetic */ java.lang.ClassLoader access$getClassLoader$p(okio.internal.ResourceFileSystem r1) {
            java.lang.ClassLoader r0 = r1.classLoader
            return r0
    }

    public static final /* synthetic */ okio.internal.ResourceFileSystem.Companion access$getCompanion$p() {
            okio.internal.ResourceFileSystem$Companion r0 = okio.internal.ResourceFileSystem.Companion
            return r0
    }

    public static final /* synthetic */ okio.Path access$getROOT$cp() {
            okio.Path r0 = okio.internal.ResourceFileSystem.ROOT
            return r0
    }

    public static final /* synthetic */ java.util.List access$toClasspathRoots(okio.internal.ResourceFileSystem r1, java.lang.ClassLoader r2) {
            java.util.List r0 = r1.toClasspathRoots(r2)
            return r0
    }

    private final okio.Path canonicalizeInternal(okio.Path r3) {
            r2 = this;
            okio.Path r0 = okio.internal.ResourceFileSystem.ROOT
            r1 = 1
            okio.Path r0 = r0.resolve(r3, r1)
            return r0
    }

    private final java.util.List<kotlin.Pair<okio.FileSystem, okio.Path>> getRoots() {
            r1 = this;
            kotlin.Lazy r0 = r1.roots$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    private final java.util.List<kotlin.Pair<okio.FileSystem, okio.Path>> toClasspathRoots(java.lang.ClassLoader r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = ""
            java.util.Enumeration r2 = r1.getResources(r2)
            java.lang.String r3 = "getResources(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.util.ArrayList r2 = java.util.Collections.list(r2)
            java.lang.String r4 = "list(this)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r5 = 0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Collection r6 = (java.util.Collection) r6
            r7 = r2
            r8 = 0
            r9 = r7
            r10 = 0
            java.util.Iterator r11 = r9.iterator()
        L2c:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L4d
            java.lang.Object r12 = r11.next()
            r13 = r12
            r14 = 0
            r15 = r13
            java.net.URL r15 = (java.net.URL) r15
            r16 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15)
            kotlin.Pair r15 = r0.toFileRoot(r15)
            if (r15 == 0) goto L4b
            r16 = 0
            r6.add(r15)
        L4b:
            goto L2c
        L4d:
            java.util.List r6 = (java.util.List) r6
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.String r2 = "META-INF/MANIFEST.MF"
            java.util.Enumeration r2 = r1.getResources(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.util.ArrayList r2 = java.util.Collections.list(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Collection r4 = (java.util.Collection) r4
            r5 = r2
            r7 = 0
            r8 = r5
            r9 = 0
            java.util.Iterator r10 = r8.iterator()
        L78:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L97
            java.lang.Object r11 = r10.next()
            r12 = r11
            r13 = 0
            r14 = r12
            java.net.URL r14 = (java.net.URL) r14
            r15 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r14)
            kotlin.Pair r14 = r0.toJarRoot(r14)
            if (r14 == 0) goto L95
            r15 = 0
            r4.add(r14)
        L95:
            goto L78
        L97:
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r2 = kotlin.collections.CollectionsKt.plus(r6, r4)
            return r2
    }

    private final kotlin.Pair<okio.FileSystem, okio.Path> toFileRoot(java.net.URL r7) {
            r6 = this;
            java.lang.String r0 = r7.getProtocol()
            java.lang.String r1 = "file"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            okio.FileSystem r0 = r6.systemFileSystem
            okio.Path$Companion r2 = okio.Path.Companion
            java.io.File r3 = new java.io.File
            java.net.URI r4 = r7.toURI()
            r3.<init>(r4)
            r4 = 0
            r5 = 1
            okio.Path r1 = okio.Path.Companion.get$default(r2, r3, r4, r5, r1)
            kotlin.Pair r0 = kotlin.TuplesKt.m122to(r0, r1)
            return r0
    }

    private final kotlin.Pair<okio.FileSystem, okio.Path> toJarRoot(java.net.URL r12) {
            r11 = this;
            java.lang.String r0 = r12.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r1 = "jar:file:"
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r0, r1, r2, r3, r4)
            if (r1 != 0) goto L15
            return r4
        L15:
            r5 = r0
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r9 = 6
            r10 = 0
            java.lang.String r6 = "!"
            r7 = 0
            r8 = 0
            int r1 = kotlin.text.StringsKt.lastIndexOf$default(r5, r6, r7, r8, r9, r10)
            r3 = -1
            if (r1 != r3) goto L26
            return r4
        L26:
            okio.Path$Companion r3 = okio.Path.Companion
            java.io.File r5 = new java.io.File
            r6 = 4
            java.lang.String r6 = r0.substring(r6, r1)
            java.lang.String r7 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            java.net.URI r6 = java.net.URI.create(r6)
            r5.<init>(r6)
            r6 = 1
            okio.Path r2 = okio.Path.Companion.get$default(r3, r5, r2, r6, r4)
            okio.FileSystem r3 = r11.systemFileSystem
            okio.internal.ResourceFileSystem$toJarRoot$zip$1 r4 = okio.internal.ResourceFileSystem$toJarRoot$zip$1.INSTANCE
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            okio.ZipFileSystem r3 = okio.internal.ZipFilesKt.openZip(r2, r3, r4)
            okio.Path r4 = okio.internal.ResourceFileSystem.ROOT
            kotlin.Pair r4 = kotlin.TuplesKt.m122to(r3, r4)
            return r4
    }

    private final java.lang.String toRelativePath(okio.Path r3) {
            r2 = this;
            okio.Path r0 = r2.canonicalizeInternal(r3)
            okio.Path r1 = okio.internal.ResourceFileSystem.ROOT
            okio.Path r1 = r0.relativeTo(r1)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @Override // okio.FileSystem
    public okio.Sink appendingSink(okio.Path r4, boolean r5) {
            r3 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " is read-only"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.FileSystem
    public void atomicMove(okio.Path r4, okio.Path r5) {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " is read-only"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.FileSystem
    public okio.Path canonicalize(okio.Path r2) {
            r1 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Path r0 = r1.canonicalizeInternal(r2)
            return r0
    }

    @Override // okio.FileSystem
    public void createDirectory(okio.Path r4, boolean r5) {
            r3 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " is read-only"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.FileSystem
    public void createSymlink(okio.Path r4, okio.Path r5) {
            r3 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " is read-only"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.FileSystem
    public void delete(okio.Path r4, boolean r5) {
            r3 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " is read-only"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> list(okio.Path r19) {
            r18 = this;
            r1 = r19
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r2 = r18.toRelativePath(r19)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r3 = r0
            java.util.Set r3 = (java.util.Set) r3
            r0 = 0
            java.util.List r4 = r18.getRoots()
            java.util.Iterator r4 = r4.iterator()
            r5 = r0
        L1d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lc4
            java.lang.Object r0 = r4.next()
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r6 = r0.component1()
            okio.FileSystem r6 = (okio.FileSystem) r6
            java.lang.Object r0 = r0.component2()
            r7 = r0
            okio.Path r7 = (okio.Path) r7
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.io.IOException -> Lbd
            okio.Path r8 = r7.resolve(r2)     // Catch: java.io.IOException -> Lbd
            java.util.List r8 = r6.list(r8)     // Catch: java.io.IOException -> Lbd
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.io.IOException -> Lbd
            r9 = 0
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.io.IOException -> Lbd
            r10.<init>()     // Catch: java.io.IOException -> Lbd
            java.util.Collection r10 = (java.util.Collection) r10     // Catch: java.io.IOException -> Lbd
            r11 = r8
            r12 = 0
            java.util.Iterator r13 = r11.iterator()     // Catch: java.io.IOException -> Lbd
        L53:
            boolean r14 = r13.hasNext()     // Catch: java.io.IOException -> Lbd
            if (r14 == 0) goto L72
            java.lang.Object r14 = r13.next()     // Catch: java.io.IOException -> Lbd
            r15 = r14
            okio.Path r15 = (okio.Path) r15     // Catch: java.io.IOException -> Lbd
            r16 = 0
            r17 = r2
            okio.internal.ResourceFileSystem$Companion r2 = okio.internal.ResourceFileSystem.Companion     // Catch: java.io.IOException -> Lbb
            boolean r2 = okio.internal.ResourceFileSystem.Companion.access$keepPath(r2, r15)     // Catch: java.io.IOException -> Lbb
            if (r2 == 0) goto L6f
            r10.add(r14)     // Catch: java.io.IOException -> Lbb
        L6f:
            r2 = r17
            goto L53
        L72:
            r17 = r2
            r2 = r10
            java.util.List r2 = (java.util.List) r2     // Catch: java.io.IOException -> Lbb
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.io.IOException -> Lbb
            r8 = 0
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.io.IOException -> Lbb
            r10 = 10
            int r10 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r2, r10)     // Catch: java.io.IOException -> Lbb
            r9.<init>(r10)     // Catch: java.io.IOException -> Lbb
            java.util.Collection r9 = (java.util.Collection) r9     // Catch: java.io.IOException -> Lbb
            r10 = r2
            r11 = 0
            java.util.Iterator r12 = r10.iterator()     // Catch: java.io.IOException -> Lbb
        L8f:
            boolean r13 = r12.hasNext()     // Catch: java.io.IOException -> Lbb
            if (r13 == 0) goto Lab
            java.lang.Object r13 = r12.next()     // Catch: java.io.IOException -> Lbb
            r14 = r13
            okio.Path r14 = (okio.Path) r14     // Catch: java.io.IOException -> Lbb
            r15 = 0
            r16 = r2
            okio.internal.ResourceFileSystem$Companion r2 = okio.internal.ResourceFileSystem.Companion     // Catch: java.io.IOException -> Lbb
            okio.Path r2 = r2.removeBase(r14, r7)     // Catch: java.io.IOException -> Lbb
            r9.add(r2)     // Catch: java.io.IOException -> Lbb
            r2 = r16
            goto L8f
        Lab:
            r16 = r2
            r2 = r9
            java.util.List r2 = (java.util.List) r2     // Catch: java.io.IOException -> Lbb
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.io.IOException -> Lbb
            kotlin.collections.CollectionsKt.addAll(r0, r2)     // Catch: java.io.IOException -> Lbb
            r5 = 1
            r2 = r17
            goto L1d
        Lbb:
            r0 = move-exception
            goto Lc0
        Lbd:
            r0 = move-exception
            r17 = r2
        Lc0:
            r2 = r17
            goto L1d
        Lc4:
            r17 = r2
            if (r5 == 0) goto Ld0
            r0 = r3
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.toList(r0)
            return r0
        Ld0:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "file not found: "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    @Override // okio.FileSystem
    public java.util.List<okio.Path> listOrNull(okio.Path r18) {
            r17 = this;
            java.lang.String r0 = "dir"
            r1 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = r17.toRelativePath(r18)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.Set r2 = (java.util.Set) r2
            r3 = 0
            java.util.List r4 = r17.getRoots()
            java.util.Iterator r4 = r4.iterator()
        L1b:
            boolean r5 = r4.hasNext()
            r6 = 0
            if (r5 == 0) goto Lc1
            java.lang.Object r5 = r4.next()
            kotlin.Pair r5 = (kotlin.Pair) r5
            java.lang.Object r7 = r5.component1()
            okio.FileSystem r7 = (okio.FileSystem) r7
            java.lang.Object r5 = r5.component2()
            okio.Path r5 = (okio.Path) r5
            okio.Path r8 = r5.resolve(r0)
            java.util.List r8 = r7.listOrNull(r8)
            if (r8 == 0) goto Laa
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            r6 = r8
            r8 = 0
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Collection r9 = (java.util.Collection) r9
            r10 = r6
            r11 = 0
            java.util.Iterator r12 = r10.iterator()
        L50:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L6e
            java.lang.Object r13 = r12.next()
            r14 = r13
            okio.Path r14 = (okio.Path) r14
            r15 = 0
            r16 = r0
            okio.internal.ResourceFileSystem$Companion r0 = okio.internal.ResourceFileSystem.Companion
            boolean r0 = okio.internal.ResourceFileSystem.Companion.access$keepPath(r0, r14)
            if (r0 == 0) goto L6b
            r9.add(r13)
        L6b:
            r0 = r16
            goto L50
        L6e:
            r16 = r0
            r0 = r9
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r6 = 0
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r9)
            r8.<init>(r9)
            java.util.Collection r8 = (java.util.Collection) r8
            r9 = r0
            r10 = 0
            java.util.Iterator r11 = r9.iterator()
        L8d:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto La5
            java.lang.Object r12 = r11.next()
            r13 = r12
            okio.Path r13 = (okio.Path) r13
            r14 = 0
            okio.internal.ResourceFileSystem$Companion r15 = okio.internal.ResourceFileSystem.Companion
            okio.Path r13 = r15.removeBase(r13, r5)
            r8.add(r13)
            goto L8d
        La5:
            java.util.List r8 = (java.util.List) r8
            r6 = r8
            goto Lac
        Laa:
            r16 = r0
        Lac:
            r0 = r6
            if (r0 == 0) goto Lbd
            r6 = r2
            java.util.Collection r6 = (java.util.Collection) r6
            r8 = r0
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            kotlin.collections.CollectionsKt.addAll(r6, r8)
            r3 = 1
            r0 = r16
            goto L1b
        Lbd:
            r0 = r16
            goto L1b
        Lc1:
            r16 = r0
            if (r3 == 0) goto Lcc
            r0 = r2
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r6 = kotlin.collections.CollectionsKt.toList(r0)
        Lcc:
            return r6
    }

    @Override // okio.FileSystem
    public okio.FileMetadata metadataOrNull(okio.Path r7) {
            r6 = this;
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            okio.internal.ResourceFileSystem$Companion r0 = okio.internal.ResourceFileSystem.Companion
            boolean r0 = okio.internal.ResourceFileSystem.Companion.access$keepPath(r0, r7)
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            java.lang.String r0 = r6.toRelativePath(r7)
            java.util.List r2 = r6.getRoots()
            java.util.Iterator r2 = r2.iterator()
        L1b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r2.next()
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r4 = r3.component1()
            okio.FileSystem r4 = (okio.FileSystem) r4
            java.lang.Object r3 = r3.component2()
            okio.Path r3 = (okio.Path) r3
            okio.Path r5 = r3.resolve(r0)
            okio.FileMetadata r5 = r4.metadataOrNull(r5)
            if (r5 != 0) goto L3e
            goto L1b
        L3e:
            return r5
        L3f:
            return r1
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadOnly(okio.Path r7) {
            r6 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            okio.internal.ResourceFileSystem$Companion r0 = okio.internal.ResourceFileSystem.Companion
            boolean r0 = okio.internal.ResourceFileSystem.Companion.access$keepPath(r0, r7)
            java.lang.String r1 = "file not found: "
            if (r0 == 0) goto L56
            java.lang.String r0 = r6.toRelativePath(r7)
            java.util.List r2 = r6.getRoots()
            java.util.Iterator r2 = r2.iterator()
        L1b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r2.next()
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r4 = r3.component1()
            okio.FileSystem r4 = (okio.FileSystem) r4
            java.lang.Object r3 = r3.component2()
            okio.Path r3 = (okio.Path) r3
            okio.Path r5 = r3.resolve(r0)     // Catch: java.io.FileNotFoundException -> L3d
            okio.FileHandle r1 = r4.openReadOnly(r5)     // Catch: java.io.FileNotFoundException -> L3d
            return r1
        L3d:
            r5 = move-exception
            goto L1b
        L3f:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L56:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.FileSystem
    public okio.FileHandle openReadWrite(okio.Path r3, boolean r4, boolean r5) {
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "resources are not writable"
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.FileSystem
    public okio.Sink sink(okio.Path r4, boolean r5) {
            r3 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r2 = " is read-only"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // okio.FileSystem
    public okio.Source source(okio.Path r6) {
            r5 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            okio.internal.ResourceFileSystem$Companion r0 = okio.internal.ResourceFileSystem.Companion
            boolean r0 = okio.internal.ResourceFileSystem.Companion.access$keepPath(r0, r6)
            java.lang.String r1 = "file not found: "
            if (r0 == 0) goto L48
            okio.Path r0 = okio.internal.ResourceFileSystem.ROOT
            r2 = 2
            r3 = 0
            r4 = 0
            okio.Path r0 = okio.Path.resolve$default(r0, r6, r4, r2, r3)
            okio.Path r2 = okio.internal.ResourceFileSystem.ROOT
            okio.Path r0 = r0.relativeTo(r2)
            java.lang.ClassLoader r2 = r5.classLoader
            java.lang.String r3 = r0.toString()
            java.io.InputStream r2 = r2.getResourceAsStream(r3)
            if (r2 == 0) goto L31
            okio.Source r2 = okio.Okio.source(r2)
            if (r2 == 0) goto L31
            return r2
        L31:
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L48:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
