package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nPathUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1174:1\n26#2:1175\n26#2:1179\n1#3:1176\n1855#4,2:1177\n*S KotlinDebug\n*F\n+ 1 PathUtils.kt\nkotlin/io/path/PathsKt__PathUtilsKt\n*L\n221#1:1175\n616#1:1179\n440#1:1177,2\n*E\n"})
public class C4736 extends Yue.C4725 {
    public C4736() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final java.nio.file.Path m18819(java.lang.String r1) {
            java.lang.String r0 = "path"
            Yue.C3329.m13906(r1, r0)
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.nio.file.Path r1 = java.nio.file.Paths.get(r1, r0)
            java.lang.String r0 = "get(path)"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final java.nio.file.Path m18820(java.lang.String r1, java.lang.String... r2) {
            java.lang.String r0 = "base"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "subpaths"
            Yue.C3329.m13906(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.nio.file.Path r1 = java.nio.file.Paths.get(r1, r2)
            java.lang.String r2 = "get(base, *subpaths)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final java.nio.file.Path m18821(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.nio.file.Path r1 = r1.toAbsolutePath()
            java.lang.String r0 = "toAbsolutePath()"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final java.lang.String m18822(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.nio.file.Path r1 = r1.toAbsolutePath()
            java.lang.String r1 = r1.toString()
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final java.nio.file.Path m18823(java.nio.file.Path r2, java.nio.file.Path r3, boolean r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "target"
            Yue.C3329.m13906(r3, r0)
            r0 = 0
            if (r4 == 0) goto L15
            r4 = 1
            java.nio.file.CopyOption[] r4 = new java.nio.file.CopyOption[r4]
            java.nio.file.StandardCopyOption r1 = java.nio.file.StandardCopyOption.REPLACE_EXISTING
            r4[r0] = r1
            goto L17
        L15:
            java.nio.file.CopyOption[] r4 = new java.nio.file.CopyOption[r0]
        L17:
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.CopyOption[] r4 = (java.nio.file.CopyOption[]) r4
            java.nio.file.Path r2 = java.nio.file.Files.copy(r2, r3, r4)
            java.lang.String r3 = "copy(this, target, *options)"
            Yue.C3329.m13905(r2, r3)
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final java.nio.file.Path m18824(java.nio.file.Path r1, java.nio.file.Path r2, java.nio.file.CopyOption... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "target"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.CopyOption[] r3 = (java.nio.file.CopyOption[]) r3
            java.nio.file.Path r1 = java.nio.file.Files.copy(r1, r2, r3)
            java.lang.String r2 = "copy(this, target, *options)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static /* synthetic */ java.nio.file.Path m18825(java.nio.file.Path r0, java.nio.file.Path r1, boolean r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r3 = r3 & 2
            r4 = 0
            if (r3 == 0) goto L6
            r2 = r4
        L6:
            java.lang.String r3 = "<this>"
            Yue.C3329.m13906(r0, r3)
            java.lang.String r3 = "target"
            Yue.C3329.m13906(r1, r3)
            if (r2 == 0) goto L1a
            r2 = 1
            java.nio.file.CopyOption[] r2 = new java.nio.file.CopyOption[r2]
            java.nio.file.StandardCopyOption r3 = java.nio.file.StandardCopyOption.REPLACE_EXISTING
            r2[r4] = r3
            goto L1c
        L1a:
            java.nio.file.CopyOption[] r2 = new java.nio.file.CopyOption[r4]
        L1c:
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.nio.file.CopyOption[] r2 = (java.nio.file.CopyOption[]) r2
            java.nio.file.Path r0 = java.nio.file.Files.copy(r0, r1, r2)
            java.lang.String r1 = "copy(this, target, *options)"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final java.nio.file.Path m18826(java.nio.file.Path r1, java.nio.file.attribute.FileAttribute<?>... r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "attributes"
            Yue.C3329.m13906(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.attribute.FileAttribute[] r2 = (java.nio.file.attribute.FileAttribute[]) r2
            java.nio.file.Path r1 = java.nio.file.Files.createDirectories(r1, r2)
            java.lang.String r2 = "createDirectories(this, *attributes)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final java.nio.file.Path m18827(java.nio.file.Path r1, java.nio.file.attribute.FileAttribute<?>... r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "attributes"
            Yue.C3329.m13906(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.attribute.FileAttribute[] r2 = (java.nio.file.attribute.FileAttribute[]) r2
            java.nio.file.Path r1 = java.nio.file.Files.createDirectory(r1, r2)
            java.lang.String r2 = "createDirectory(this, *attributes)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final java.nio.file.Path m18828(java.nio.file.Path r1, java.nio.file.attribute.FileAttribute<?>... r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "attributes"
            Yue.C3329.m13906(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.attribute.FileAttribute[] r2 = (java.nio.file.attribute.FileAttribute[]) r2
            java.nio.file.Path r1 = java.nio.file.Files.createFile(r1, r2)
            java.lang.String r2 = "createFile(this, *attributes)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final java.nio.file.Path m18829(java.nio.file.Path r1, java.nio.file.Path r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "target"
            Yue.C3329.m13906(r2, r0)
            java.nio.file.Path r1 = java.nio.file.Files.createLink(r1, r2)
            java.lang.String r2 = "createLink(this, target)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.9")
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static final java.nio.file.Path m18830(@Yue.InterfaceC4418 java.nio.file.Path r3, @Yue.InterfaceC4418 java.nio.file.attribute.FileAttribute<?>... r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "attributes"
            Yue.C3329.m13906(r4, r0)
            java.nio.file.Path r0 = r3.getParent()
            if (r0 == 0) goto L48
            r1 = 0
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[r1]
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2
            boolean r2 = java.nio.file.Files.isDirectory(r0, r2)
            if (r2 != 0) goto L48
            int r2 = r4.length     // Catch: java.nio.file.FileAlreadyExistsException -> L37
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r2)     // Catch: java.nio.file.FileAlreadyExistsException -> L37
            java.nio.file.attribute.FileAttribute[] r4 = (java.nio.file.attribute.FileAttribute[]) r4     // Catch: java.nio.file.FileAlreadyExistsException -> L37
            int r2 = r4.length     // Catch: java.nio.file.FileAlreadyExistsException -> L37
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r2)     // Catch: java.nio.file.FileAlreadyExistsException -> L37
            java.nio.file.attribute.FileAttribute[] r4 = (java.nio.file.attribute.FileAttribute[]) r4     // Catch: java.nio.file.FileAlreadyExistsException -> L37
            java.nio.file.Path r4 = java.nio.file.Files.createDirectories(r0, r4)     // Catch: java.nio.file.FileAlreadyExistsException -> L37
            java.lang.String r2 = "createDirectories(this, *attributes)"
            Yue.C3329.m13905(r4, r2)     // Catch: java.nio.file.FileAlreadyExistsException -> L37
            goto L48
        L37:
            r4 = move-exception
            java.nio.file.LinkOption[] r2 = new java.nio.file.LinkOption[r1]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            java.nio.file.LinkOption[] r1 = (java.nio.file.LinkOption[]) r1
            boolean r0 = java.nio.file.Files.isDirectory(r0, r1)
            if (r0 == 0) goto L47
            goto L48
        L47:
            throw r4
        L48:
            return r3
    }

    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static final java.nio.file.Path m18831(java.nio.file.Path r1, java.nio.file.Path r2, java.nio.file.attribute.FileAttribute<?>... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "target"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "attributes"
            Yue.C3329.m13906(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.attribute.FileAttribute[] r3 = (java.nio.file.attribute.FileAttribute[]) r3
            java.nio.file.Path r1 = java.nio.file.Files.createSymbolicLink(r1, r2, r3)
            java.lang.String r2 = "createSymbolicLink(this, target, *attributes)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static final java.nio.file.Path m18832(java.lang.String r1, java.nio.file.attribute.FileAttribute<?>... r2) throws java.io.IOException {
            java.lang.String r0 = "attributes"
            Yue.C3329.m13906(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.attribute.FileAttribute[] r2 = (java.nio.file.attribute.FileAttribute[]) r2
            java.nio.file.Path r1 = java.nio.file.Files.createTempDirectory(r1, r2)
            java.lang.String r2 = "createTempDirectory(prefix, *attributes)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static final java.nio.file.Path m18833(@Yue.InterfaceC4543 java.nio.file.Path r1, @Yue.InterfaceC4543 java.lang.String r2, @Yue.InterfaceC4418 java.nio.file.attribute.FileAttribute<?>... r3) throws java.io.IOException {
            java.lang.String r0 = "attributes"
            Yue.C3329.m13906(r3, r0)
            if (r1 == 0) goto L18
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.attribute.FileAttribute[] r3 = (java.nio.file.attribute.FileAttribute[]) r3
            java.nio.file.Path r1 = java.nio.file.Files.createTempDirectory(r1, r2, r3)
            java.lang.String r2 = "createTempDirectory(dire…ory, prefix, *attributes)"
            Yue.C3329.m13905(r1, r2)
            goto L28
        L18:
            int r1 = r3.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)
            java.nio.file.attribute.FileAttribute[] r1 = (java.nio.file.attribute.FileAttribute[]) r1
            java.nio.file.Path r1 = java.nio.file.Files.createTempDirectory(r2, r1)
            java.lang.String r2 = "createTempDirectory(prefix, *attributes)"
            Yue.C3329.m13905(r1, r2)
        L28:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static /* synthetic */ java.nio.file.Path m18834(java.lang.String r0, java.nio.file.attribute.FileAttribute[] r1, int r2, java.lang.Object r3) throws java.io.IOException {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r0 = 0
        L5:
            java.lang.String r2 = "attributes"
            Yue.C3329.m13906(r1, r2)
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.nio.file.attribute.FileAttribute[] r1 = (java.nio.file.attribute.FileAttribute[]) r1
            java.nio.file.Path r0 = java.nio.file.Files.createTempDirectory(r0, r1)
            java.lang.String r1 = "createTempDirectory(prefix, *attributes)"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ java.nio.file.Path m18835(java.nio.file.Path r0, java.lang.String r1, java.nio.file.attribute.FileAttribute[] r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r1 = 0
        L5:
            java.nio.file.Path r0 = m18833(r0, r1, r2)
            return r0
    }

    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static final java.nio.file.Path m18836(java.lang.String r1, java.lang.String r2, java.nio.file.attribute.FileAttribute<?>... r3) throws java.io.IOException {
            java.lang.String r0 = "attributes"
            Yue.C3329.m13906(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.attribute.FileAttribute[] r3 = (java.nio.file.attribute.FileAttribute[]) r3
            java.nio.file.Path r1 = java.nio.file.Files.createTempFile(r1, r2, r3)
            java.lang.String r2 = "createTempFile(prefix, suffix, *attributes)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static final java.nio.file.Path m18837(@Yue.InterfaceC4543 java.nio.file.Path r1, @Yue.InterfaceC4543 java.lang.String r2, @Yue.InterfaceC4543 java.lang.String r3, @Yue.InterfaceC4418 java.nio.file.attribute.FileAttribute<?>... r4) throws java.io.IOException {
            java.lang.String r0 = "attributes"
            Yue.C3329.m13906(r4, r0)
            if (r1 == 0) goto L18
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.attribute.FileAttribute[] r4 = (java.nio.file.attribute.FileAttribute[]) r4
            java.nio.file.Path r1 = java.nio.file.Files.createTempFile(r1, r2, r3, r4)
            java.lang.String r2 = "createTempFile(directory…fix, suffix, *attributes)"
            Yue.C3329.m13905(r1, r2)
            goto L28
        L18:
            int r1 = r4.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r4, r1)
            java.nio.file.attribute.FileAttribute[] r1 = (java.nio.file.attribute.FileAttribute[]) r1
            java.nio.file.Path r1 = java.nio.file.Files.createTempFile(r2, r3, r1)
            java.lang.String r2 = "createTempFile(prefix, suffix, *attributes)"
            Yue.C3329.m13905(r1, r2)
        L28:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static /* synthetic */ java.nio.file.Path m18838(java.lang.String r1, java.lang.String r2, java.nio.file.attribute.FileAttribute[] r3, int r4, java.lang.Object r5) throws java.io.IOException {
            r5 = r4 & 1
            r0 = 0
            if (r5 == 0) goto L6
            r1 = r0
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lb
            r2 = r0
        Lb:
            java.lang.String r4 = "attributes"
            Yue.C3329.m13906(r3, r4)
            int r4 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            java.nio.file.attribute.FileAttribute[] r3 = (java.nio.file.attribute.FileAttribute[]) r3
            java.nio.file.Path r1 = java.nio.file.Files.createTempFile(r1, r2, r3)
            java.lang.String r2 = "createTempFile(prefix, suffix, *attributes)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static /* synthetic */ java.nio.file.Path m18839(java.nio.file.Path r1, java.lang.String r2, java.lang.String r3, java.nio.file.attribute.FileAttribute[] r4, int r5, java.lang.Object r6) throws java.io.IOException {
            r6 = r5 & 2
            r0 = 0
            if (r6 == 0) goto L6
            r2 = r0
        L6:
            r5 = r5 & 4
            if (r5 == 0) goto Lb
            r3 = r0
        Lb:
            java.nio.file.Path r1 = m18837(r1, r2, r3, r4)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static final void m18840(java.nio.file.Path r1) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.nio.file.Files.delete(r1)
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static final boolean m18841(java.nio.file.Path r1) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r1 = java.nio.file.Files.deleteIfExists(r1)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static final java.nio.file.Path m18842(java.nio.file.Path r1, java.lang.String r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r2, r0)
            java.nio.file.Path r1 = r1.resolve(r2)
            java.lang.String r2 = "this.resolve(other)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static final java.nio.file.Path m18843(java.nio.file.Path r1, java.nio.file.Path r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r2, r0)
            java.nio.file.Path r1 = r1.resolve(r2)
            java.lang.String r2 = "this.resolve(other)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static final boolean m18844(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2
            boolean r1 = java.nio.file.Files.exists(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static final java.lang.Void m18845(@Yue.InterfaceC4418 java.nio.file.Path r3, @Yue.InterfaceC4418 java.lang.Class<?> r4) {
            java.lang.String r0 = "path"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "attributeViewClass"
            Yue.C3329.m13906(r4, r0)
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The desired attribute view type "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is not available for the file "
            r1.append(r4)
            r1.append(r3)
            r3 = 46
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static final /* synthetic */ <V extends java.nio.file.attribute.FileAttributeView> V m18846(java.nio.file.Path r3, java.nio.file.LinkOption... r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r4, r0)
            r0 = 4
            java.lang.String r1 = "V"
            Yue.C3329.m13915(r0, r1)
            int r2 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r2)
            java.nio.file.LinkOption[] r4 = (java.nio.file.LinkOption[]) r4
            java.lang.Class<java.nio.file.attribute.FileAttributeView> r2 = java.nio.file.attribute.FileAttributeView.class
            java.nio.file.attribute.FileAttributeView r4 = java.nio.file.Files.getFileAttributeView(r3, r2, r4)
            if (r4 == 0) goto L20
            return r4
        L20:
            Yue.C3329.m13915(r0, r1)
            m18845(r3, r2)
            Yue.ۥ۠ۦۧۤ r3 = new Yue.ۥ۠ۦۧۤ
            r3.<init>()
            throw r3
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static final /* synthetic */ <V extends java.nio.file.attribute.FileAttributeView> V m18847(java.nio.file.Path r2, java.nio.file.LinkOption... r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r3, r0)
            r0 = 4
            java.lang.String r1 = "V"
            Yue.C3329.m13915(r0, r1)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
            java.lang.Class<java.nio.file.attribute.FileAttributeView> r0 = java.nio.file.attribute.FileAttributeView.class
            java.nio.file.attribute.FileAttributeView r2 = java.nio.file.Files.getFileAttributeView(r2, r0, r3)
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static final long m18848(java.nio.file.Path r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            long r0 = java.nio.file.Files.size(r2)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static final java.nio.file.FileStore m18849(java.nio.file.Path r1) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.nio.file.FileStore r1 = java.nio.file.Files.getFileStore(r1)
            java.lang.String r0 = "getFileStore(this)"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.7")
    @Yue.InterfaceC2309
    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static final java.nio.file.FileVisitor<java.nio.file.Path> m18850(@Yue.InterfaceC4418 Yue.InterfaceC2825<? super Yue.InterfaceC2386, Yue.C6593> r1) {
            java.lang.String r0 = "builderAction"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥ۠ۢ۟۠ r0 = new Yue.ۥ۠ۢ۟۠
            r0.<init>()
            r1.invoke(r0)
            java.nio.file.FileVisitor r1 = r0.m10992()
            return r1
    }

    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static final void m18851(java.nio.file.Path r2, java.lang.String r3, Yue.InterfaceC2825<? super java.nio.file.Path, Yue.C6593> r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "glob"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "action"
            Yue.C3329.m13906(r4, r0)
            java.nio.file.DirectoryStream r2 = java.nio.file.Files.newDirectoryStream(r2, r3)
            r3 = 1
            java.lang.String r0 = "it"
            Yue.C3329.m13905(r2, r0)     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L2b
        L1d:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2b
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L2b
            goto L1d
        L2b:
            r4 = move-exception
            goto L3a
        L2d:
            Yue.ۥۣۢ۠ۤ r4 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L2b
            Yue.C3249.m13687(r3)
            r4 = 0
            Yue.C1173.m6114(r2, r4)
            Yue.C3249.m13686(r3)
            return
        L3a:
            throw r4     // Catch: java.lang.Throwable -> L3b
        L3b:
            r0 = move-exception
            Yue.C3249.m13687(r3)
            Yue.C1173.m6114(r2, r4)
            Yue.C3249.m13686(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static /* synthetic */ void m18852(java.nio.file.Path r0, java.lang.String r1, Yue.InterfaceC2825 r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L6
            java.lang.String r1 = "*"
        L6:
            java.lang.String r3 = "<this>"
            Yue.C3329.m13906(r0, r3)
            java.lang.String r3 = "glob"
            Yue.C3329.m13906(r1, r3)
            java.lang.String r3 = "action"
            Yue.C3329.m13906(r2, r3)
            java.nio.file.DirectoryStream r0 = java.nio.file.Files.newDirectoryStream(r0, r1)
            java.lang.String r1 = "it"
            Yue.C3329.m13905(r0, r1)     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L30
        L22:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L32
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L30
            r2.invoke(r3)     // Catch: java.lang.Throwable -> L30
            goto L22
        L30:
            r1 = move-exception
            goto L3f
        L32:
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L30
            Yue.C3249.m13687(r4)
            r1 = 0
            Yue.C1173.m6114(r0, r1)
            Yue.C3249.m13686(r4)
            return
        L3f:
            throw r1     // Catch: java.lang.Throwable -> L40
        L40:
            r2 = move-exception
            Yue.C3249.m13687(r4)
            Yue.C1173.m6114(r0, r1)
            Yue.C3249.m13686(r4)
            throw r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static final java.lang.Object m18853(java.nio.file.Path r1, java.lang.String r2, java.nio.file.LinkOption... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "attribute"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
            java.lang.Object r1 = java.nio.file.Files.getAttribute(r1, r2, r3)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static final java.lang.String m18854(@Yue.InterfaceC4418 java.nio.file.Path r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.nio.file.Path r2 = r2.getFileName()
            java.lang.String r0 = ""
            if (r2 == 0) goto L1d
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L1d
            r1 = 46
            java.lang.String r2 = Yue.C5989.m22467(r2, r1, r0)
            if (r2 != 0) goto L1c
            goto L1d
        L1c:
            r0 = r2
        L1d:
            return r0
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static /* synthetic */ void m18855(java.nio.file.Path r0) {
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static final java.lang.String m18856(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r1 = m18858(r1)
            return r1
    }

    @Yue.InterfaceC1816(level = Yue.EnumC1819.f5581, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @Yue.InterfaceC5313(expression = "invariantSeparatorsPathString", imports = {}))
    @Yue.InterfaceC5792(version = "1.4")
    @Yue.InterfaceC3250
    @Yue.InterfaceC2309
    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m18857(java.nio.file.Path r0) {
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static final java.lang.String m18858(@Yue.InterfaceC4418 java.nio.file.Path r7) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r7, r0)
            java.nio.file.FileSystem r0 = r7.getFileSystem()
            java.lang.String r2 = r0.getSeparator()
            java.lang.String r0 = "/"
            boolean r0 = Yue.C3329.m13897(r2, r0)
            if (r0 != 0) goto L28
            java.lang.String r1 = r7.toString()
            java.lang.String r7 = "separator"
            Yue.C3329.m13905(r2, r7)
            r5 = 4
            r6 = 0
            java.lang.String r3 = "/"
            r4 = 0
            java.lang.String r7 = Yue.C5988.m22305(r1, r2, r3, r4, r5, r6)
            goto L2c
        L28:
            java.lang.String r7 = r7.toString()
        L2c:
            return r7
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static /* synthetic */ void m18859(java.nio.file.Path r0) {
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static final java.nio.file.attribute.FileTime m18860(java.nio.file.Path r1, java.nio.file.LinkOption... r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2
            java.nio.file.attribute.FileTime r1 = java.nio.file.Files.getLastModifiedTime(r1, r2)
            java.lang.String r2 = "getLastModifiedTime(this, *options)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static final java.lang.String m18861(@Yue.InterfaceC4418 java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.nio.file.Path r1 = r1.getFileName()
            if (r1 == 0) goto L10
            java.lang.String r1 = r1.toString()
            goto L11
        L10:
            r1 = 0
        L11:
            if (r1 != 0) goto L15
            java.lang.String r1 = ""
        L15:
            return r1
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m18862(java.nio.file.Path r0) {
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static final java.lang.String m18863(@Yue.InterfaceC4418 java.nio.file.Path r3) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r3, r0)
            java.nio.file.Path r3 = r3.getFileName()
            if (r3 == 0) goto L1b
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L1b
            java.lang.String r0 = "."
            r1 = 2
            r2 = 0
            java.lang.String r3 = Yue.C5989.m22478(r3, r0, r2, r1, r2)
            if (r3 != 0) goto L1d
        L1b:
            java.lang.String r3 = ""
        L1d:
            return r3
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static /* synthetic */ void m18864(java.nio.file.Path r0) {
            return
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static final java.nio.file.attribute.UserPrincipal m18865(java.nio.file.Path r1, java.nio.file.LinkOption... r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2
            java.nio.file.attribute.UserPrincipal r1 = java.nio.file.Files.getOwner(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static final java.lang.String m18866(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r1 = r1.toString()
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static /* synthetic */ void m18867(java.nio.file.Path r0) {
            return
    }

    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static final java.util.Set<java.nio.file.attribute.PosixFilePermission> m18868(java.nio.file.Path r1, java.nio.file.LinkOption... r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2
            java.util.Set r1 = java.nio.file.Files.getPosixFilePermissions(r1, r2)
            java.lang.String r2 = "getPosixFilePermissions(this, *options)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static final boolean m18869(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2
            boolean r1 = java.nio.file.Files.isDirectory(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static final boolean m18870(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r1 = java.nio.file.Files.isExecutable(r1)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static final boolean m18871(java.nio.file.Path r1) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r1 = java.nio.file.Files.isHidden(r1)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public static final boolean m18872(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r1 = java.nio.file.Files.isReadable(r1)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final boolean m18873(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2
            boolean r1 = java.nio.file.Files.isRegularFile(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static final boolean m18874(java.nio.file.Path r1, java.nio.file.Path r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "other"
            Yue.C3329.m13906(r2, r0)
            boolean r1 = java.nio.file.Files.isSameFile(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public static final boolean m18875(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r1 = java.nio.file.Files.isSymbolicLink(r1)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public static final boolean m18876(java.nio.file.Path r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            boolean r1 = java.nio.file.Files.isWritable(r1)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public static final java.util.List<java.nio.file.Path> m18877(@Yue.InterfaceC4418 java.nio.file.Path r1, @Yue.InterfaceC4418 java.lang.String r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "glob"
            Yue.C3329.m13906(r2, r0)
            java.nio.file.DirectoryStream r1 = java.nio.file.Files.newDirectoryStream(r1, r2)
            java.lang.String r2 = "it"
            Yue.C3329.m13905(r1, r2)     // Catch: java.lang.Throwable -> L1c
            java.util.List r2 = Yue.C1219.m6537(r1)     // Catch: java.lang.Throwable -> L1c
            r0 = 0
            Yue.C1173.m6114(r1, r0)
            return r2
        L1c:
            r2 = move-exception
            throw r2     // Catch: java.lang.Throwable -> L1e
        L1e:
            r0 = move-exception
            Yue.C1173.m6114(r1, r2)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public static /* synthetic */ java.util.List m18878(java.nio.file.Path r0, java.lang.String r1, int r2, java.lang.Object r3) throws java.io.IOException {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.lang.String r1 = "*"
        L6:
            java.util.List r0 = m18877(r0, r1)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final java.nio.file.Path m18879(java.nio.file.Path r2, java.nio.file.Path r3, boolean r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "target"
            Yue.C3329.m13906(r3, r0)
            r0 = 0
            if (r4 == 0) goto L15
            r4 = 1
            java.nio.file.CopyOption[] r4 = new java.nio.file.CopyOption[r4]
            java.nio.file.StandardCopyOption r1 = java.nio.file.StandardCopyOption.REPLACE_EXISTING
            r4[r0] = r1
            goto L17
        L15:
            java.nio.file.CopyOption[] r4 = new java.nio.file.CopyOption[r0]
        L17:
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.CopyOption[] r4 = (java.nio.file.CopyOption[]) r4
            java.nio.file.Path r2 = java.nio.file.Files.move(r2, r3, r4)
            java.lang.String r3 = "move(this, target, *options)"
            Yue.C3329.m13905(r2, r3)
            return r2
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public static final java.nio.file.Path m18880(java.nio.file.Path r1, java.nio.file.Path r2, java.nio.file.CopyOption... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "target"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.CopyOption[] r3 = (java.nio.file.CopyOption[]) r3
            java.nio.file.Path r1 = java.nio.file.Files.move(r1, r2, r3)
            java.lang.String r2 = "move(this, target, *options)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.nio.file.Path m18881(java.nio.file.Path r0, java.nio.file.Path r1, boolean r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r3 = r3 & 2
            r4 = 0
            if (r3 == 0) goto L6
            r2 = r4
        L6:
            java.lang.String r3 = "<this>"
            Yue.C3329.m13906(r0, r3)
            java.lang.String r3 = "target"
            Yue.C3329.m13906(r1, r3)
            if (r2 == 0) goto L1a
            r2 = 1
            java.nio.file.CopyOption[] r2 = new java.nio.file.CopyOption[r2]
            java.nio.file.StandardCopyOption r3 = java.nio.file.StandardCopyOption.REPLACE_EXISTING
            r2[r4] = r3
            goto L1c
        L1a:
            java.nio.file.CopyOption[] r2 = new java.nio.file.CopyOption[r4]
        L1c:
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.nio.file.CopyOption[] r2 = (java.nio.file.CopyOption[]) r2
            java.nio.file.Path r0 = java.nio.file.Files.move(r0, r1, r2)
            java.lang.String r1 = "move(this, target, *options)"
            Yue.C3329.m13905(r0, r1)
            return r0
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public static final boolean m18882(java.nio.file.Path r1, java.nio.file.LinkOption... r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r2, r0)
            int r0 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.nio.file.LinkOption[] r2 = (java.nio.file.LinkOption[]) r2
            boolean r1 = java.nio.file.Files.notExists(r1, r2)
            return r1
    }

    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public static final /* synthetic */ <A extends java.nio.file.attribute.BasicFileAttributes> A m18883(java.nio.file.Path r2, java.nio.file.LinkOption... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r3, r0)
            r0 = 4
            java.lang.String r1 = "A"
            Yue.C3329.m13915(r0, r1)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
            java.lang.Class<java.nio.file.attribute.BasicFileAttributes> r0 = java.nio.file.attribute.BasicFileAttributes.class
            java.nio.file.attribute.BasicFileAttributes r2 = java.nio.file.Files.readAttributes(r2, r0, r3)
            java.lang.String r3 = "readAttributes(this, A::class.java, *options)"
            Yue.C3329.m13905(r2, r3)
            return r2
    }

    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public static final java.util.Map<java.lang.String, java.lang.Object> m18884(java.nio.file.Path r1, java.lang.String r2, java.nio.file.LinkOption... r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "attributes"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.nio.file.LinkOption[] r3 = (java.nio.file.LinkOption[]) r3
            java.util.Map r1 = java.nio.file.Files.readAttributes(r1, r2, r3)
            java.lang.String r2 = "readAttributes(this, attributes, *options)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static final java.nio.file.Path m18885(java.nio.file.Path r1) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.nio.file.Path r1 = java.nio.file.Files.readSymbolicLink(r1)
            java.lang.String r0 = "readSymbolicLink(this)"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public static final java.nio.file.Path m18886(@Yue.InterfaceC4418 java.nio.file.Path r4, @Yue.InterfaceC4418 java.nio.file.Path r5) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "base"
            Yue.C3329.m13906(r5, r0)
            Yue.ۥۣۡۨۥ r0 = Yue.C4714.f14954     // Catch: java.lang.IllegalArgumentException -> L11
            java.nio.file.Path r4 = r0.m18730(r4, r5)     // Catch: java.lang.IllegalArgumentException -> L11
            return r4
        L11:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            java.lang.String r3 = "\nthis path: "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = "\nbase path: "
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            throw r1
    }

    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public static final java.nio.file.Path m18887(@Yue.InterfaceC4418 java.nio.file.Path r1, @Yue.InterfaceC4418 java.nio.file.Path r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "base"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۣۡۨۥ r0 = Yue.C4714.f14954     // Catch: java.lang.IllegalArgumentException -> L11
            java.nio.file.Path r1 = r0.m18730(r1, r2)     // Catch: java.lang.IllegalArgumentException -> L11
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public static final java.nio.file.Path m18888(@Yue.InterfaceC4418 java.nio.file.Path r1, @Yue.InterfaceC4418 java.nio.file.Path r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "base"
            Yue.C3329.m13906(r2, r0)
            java.nio.file.Path r2 = m18887(r1, r2)
            if (r2 != 0) goto L11
            goto L12
        L11:
            r1 = r2
        L12:
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public static final java.nio.file.Path m18889(java.nio.file.Path r1, java.lang.String r2, java.lang.Object r3, java.nio.file.LinkOption... r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "attribute"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r4, r0)
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.LinkOption[] r4 = (java.nio.file.LinkOption[]) r4
            java.nio.file.Path r1 = java.nio.file.Files.setAttribute(r1, r2, r3, r4)
            java.lang.String r2 = "setAttribute(this, attribute, value, *options)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public static final java.nio.file.Path m18890(java.nio.file.Path r1, java.nio.file.attribute.FileTime r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            java.nio.file.Path r1 = java.nio.file.Files.setLastModifiedTime(r1, r2)
            java.lang.String r2 = "setLastModifiedTime(this, value)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public static final java.nio.file.Path m18891(java.nio.file.Path r1, java.nio.file.attribute.UserPrincipal r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            java.nio.file.Path r1 = java.nio.file.Files.setOwner(r1, r2)
            java.lang.String r2 = "setOwner(this, value)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public static final java.nio.file.Path m18892(java.nio.file.Path r1, java.util.Set<? extends java.nio.file.attribute.PosixFilePermission> r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "value"
            Yue.C3329.m13906(r2, r0)
            java.nio.file.Path r1 = java.nio.file.Files.setPosixFilePermissions(r1, r2)
            java.lang.String r2 = "setPosixFilePermissions(this, value)"
            Yue.C3329.m13905(r1, r2)
            return r1
    }

    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    @Yue.InterfaceC5792(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public static final java.nio.file.Path m18893(java.net.URI r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.nio.file.Path r1 = java.nio.file.Paths.get(r1)
            java.lang.String r0 = "get(this)"
            Yue.C3329.m13905(r1, r0)
            return r1
    }

    @Yue.InterfaceC5792(version = "1.5")
    @Yue.InterfaceC3250
    @Yue.InterfaceC6976(markerClass = {Yue.InterfaceC2309.class})
    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public static final <T> T m18894(java.nio.file.Path r1, java.lang.String r2, Yue.InterfaceC2825<? super Yue.InterfaceC5609<? extends java.nio.file.Path>, ? extends T> r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "glob"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r3, r0)
            java.nio.file.DirectoryStream r1 = java.nio.file.Files.newDirectoryStream(r1, r2)
            r2 = 1
            java.lang.String r0 = "it"
            Yue.C3329.m13905(r1, r0)     // Catch: java.lang.Throwable -> L2c
            Yue.ۥۡۨۢ r0 = Yue.C1219.m6308(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r3 = r3.invoke(r0)     // Catch: java.lang.Throwable -> L2c
            Yue.C3249.m13687(r2)
            r0 = 0
            Yue.C1173.m6114(r1, r0)
            Yue.C3249.m13686(r2)
            return r3
        L2c:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L2e
        L2e:
            r0 = move-exception
            Yue.C3249.m13687(r2)
            Yue.C1173.m6114(r1, r3)
            Yue.C3249.m13686(r2)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m18895(java.nio.file.Path r0, java.lang.String r1, Yue.InterfaceC2825 r2, int r3, java.lang.Object r4) throws java.io.IOException {
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L6
            java.lang.String r1 = "*"
        L6:
            java.lang.String r3 = "<this>"
            Yue.C3329.m13906(r0, r3)
            java.lang.String r3 = "glob"
            Yue.C3329.m13906(r1, r3)
            java.lang.String r3 = "block"
            Yue.C3329.m13906(r2, r3)
            java.nio.file.DirectoryStream r0 = java.nio.file.Files.newDirectoryStream(r0, r1)
            java.lang.String r1 = "it"
            Yue.C3329.m13905(r0, r1)     // Catch: java.lang.Throwable -> L31
            Yue.ۥۡۨۢ r1 = Yue.C1219.m6308(r0)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r2.invoke(r1)     // Catch: java.lang.Throwable -> L31
            Yue.C3249.m13687(r4)
            r2 = 0
            Yue.C1173.m6114(r0, r2)
            Yue.C3249.m13686(r4)
            return r1
        L31:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L33
        L33:
            r2 = move-exception
            Yue.C3249.m13687(r4)
            Yue.C1173.m6114(r0, r1)
            Yue.C3249.m13686(r4)
            throw r2
    }

    @Yue.InterfaceC5792(version = "1.7")
    @Yue.InterfaceC2309
    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static final void m18896(@Yue.InterfaceC4418 java.nio.file.Path r1, int r2, boolean r3, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super Yue.InterfaceC2386, Yue.C6593> r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "builderAction"
            Yue.C3329.m13906(r4, r0)
            java.nio.file.FileVisitor r4 = m18850(r4)
            m18897(r1, r4, r2, r3)
            return
    }

    @Yue.InterfaceC5792(version = "1.7")
    @Yue.InterfaceC2309
    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    public static final void m18897(@Yue.InterfaceC4418 java.nio.file.Path r1, @Yue.InterfaceC4418 java.nio.file.FileVisitor<java.nio.file.Path> r2, int r3, boolean r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "visitor"
            Yue.C3329.m13906(r2, r0)
            if (r4 == 0) goto L13
            java.nio.file.FileVisitOption r4 = java.nio.file.FileVisitOption.FOLLOW_LINKS
            java.util.Set r4 = Yue.C5686.m21252(r4)
            goto L17
        L13:
            java.util.Set r4 = Yue.C5687.m21257()
        L17:
            java.nio.file.Files.walkFileTree(r1, r4, r3, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m18898(java.nio.file.Path r0, int r1, boolean r2, Yue.InterfaceC2825 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L7
            r1 = 2147483647(0x7fffffff, float:NaN)
        L7:
            r4 = r4 & 2
            if (r4 == 0) goto Lc
            r2 = 0
        Lc:
            m18896(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۦ, reason: contains not printable characters */
    public static /* synthetic */ void m18899(java.nio.file.Path r0, java.nio.file.FileVisitor r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r5 = r4 & 2
            if (r5 == 0) goto L7
            r2 = 2147483647(0x7fffffff, float:NaN)
        L7:
            r4 = r4 & 4
            if (r4 == 0) goto Lc
            r3 = 0
        Lc:
            m18897(r0, r1, r2, r3)
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.7")
    @Yue.InterfaceC2309
    /* JADX INFO: renamed from: ۥ۟۠۠ۧ, reason: contains not printable characters */
    public static final Yue.InterfaceC5609<java.nio.file.Path> m18900(@Yue.InterfaceC4418 java.nio.file.Path r1, @Yue.InterfaceC4418 Yue.EnumC4722... r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "options"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۣۡۨۧ r0 = new Yue.ۥۣۡۨۧ
            r0.<init>(r1, r2)
            return r0
    }
}
