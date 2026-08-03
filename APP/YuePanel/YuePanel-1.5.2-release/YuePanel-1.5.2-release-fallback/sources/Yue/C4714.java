package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4714 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C4714 f14954 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.nio.file.Path f14955 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.nio.file.Path f14956 = null;

    static {
            Yue.ۥۣۡۨۥ r0 = new Yue.ۥۣۡۨۥ
            r0.<init>()
            Yue.C4714.f14954 = r0
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = ""
            java.nio.file.Path r1 = java.nio.file.Paths.get(r2, r1)
            Yue.C4714.f14955 = r1
            java.lang.String r1 = ".."
            java.lang.String[] r0 = new java.lang.String[r0]
            java.nio.file.Path r0 = java.nio.file.Paths.get(r1, r0)
            Yue.C4714.f14956 = r0
            return
    }

    public C4714() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.nio.file.Path m18730(@Yue.InterfaceC4418 java.nio.file.Path r7, @Yue.InterfaceC4418 java.nio.file.Path r8) {
            r6 = this;
            java.lang.String r0 = "path"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "base"
            Yue.C3329.m13906(r8, r0)
            java.nio.file.Path r8 = r8.normalize()
            java.nio.file.Path r7 = r7.normalize()
            java.nio.file.Path r0 = r8.relativize(r7)
            int r1 = r8.getNameCount()
            int r2 = r7.getNameCount()
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 0
            r3 = r2
        L24:
            if (r3 >= r1) goto L47
            java.nio.file.Path r4 = r8.getName(r3)
            java.nio.file.Path r5 = Yue.C4714.f14956
            boolean r4 = Yue.C3329.m13897(r4, r5)
            if (r4 == 0) goto L47
            java.nio.file.Path r4 = r7.getName(r3)
            boolean r4 = Yue.C3329.m13897(r4, r5)
            if (r4 == 0) goto L3f
            int r3 = r3 + 1
            goto L24
        L3f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Unable to compute relative path"
            r7.<init>(r8)
            throw r7
        L47:
            boolean r1 = Yue.C3329.m13897(r7, r8)
            if (r1 != 0) goto L56
            java.nio.file.Path r1 = Yue.C4714.f14955
            boolean r8 = Yue.C3329.m13897(r8, r1)
            if (r8 == 0) goto L56
            goto L8b
        L56:
            java.lang.String r7 = r0.toString()
            java.nio.file.FileSystem r8 = r0.getFileSystem()
            java.lang.String r8 = r8.getSeparator()
            java.lang.String r1 = "rn.fileSystem.separator"
            Yue.C3329.m13905(r8, r1)
            r1 = 2
            r3 = 0
            boolean r8 = Yue.C5988.m22280(r7, r8, r2, r1, r3)
            if (r8 == 0) goto L8a
            java.nio.file.FileSystem r8 = r0.getFileSystem()
            java.nio.file.FileSystem r0 = r0.getFileSystem()
            java.lang.String r0 = r0.getSeparator()
            int r0 = r0.length()
            java.lang.String r7 = Yue.C5996.m22535(r7, r0)
            java.lang.String[] r0 = new java.lang.String[r2]
            java.nio.file.Path r7 = r8.getPath(r7, r0)
            goto L8b
        L8a:
            r7 = r0
        L8b:
            java.lang.String r8 = "r"
            Yue.C3329.m13905(r7, r8)
            return r7
    }
}
