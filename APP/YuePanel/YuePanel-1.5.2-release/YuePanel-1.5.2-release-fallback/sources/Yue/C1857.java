package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/DirectoryEntriesReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
public final class C1857 extends java.nio.file.SimpleFileVisitor<java.nio.file.Path> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final boolean f5714;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.C4709 f5715;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public Yue.C0561<Yue.C4709> f5716;

    public C1857(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.f5714 = r1
            Yue.ۥ۟ۡۧۡ r1 = new Yue.ۥ۟ۡۧۡ
            r1.<init>()
            r0.f5716 = r1
            return
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ java.nio.file.FileVisitResult preVisitDirectory(java.lang.Object r1, java.nio.file.attribute.BasicFileAttributes r2) {
            r0 = this;
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            java.nio.file.FileVisitResult r1 = r0.m8659(r1, r2)
            return r1
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ java.nio.file.FileVisitResult visitFile(java.lang.Object r1, java.nio.file.attribute.BasicFileAttributes r2) {
            r0 = this;
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            java.nio.file.FileVisitResult r1 = r0.m8661(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final boolean m8658() {
            r1 = this;
            boolean r0 = r1.f5714
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.nio.file.FileVisitResult m8659(@Yue.InterfaceC4418 java.nio.file.Path r4, @Yue.InterfaceC4418 java.nio.file.attribute.BasicFileAttributes r5) {
            r3 = this;
            java.lang.String r0 = "dir"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "attrs"
            Yue.C3329.m13906(r5, r0)
            Yue.ۥۣۡۨۢ r0 = new Yue.ۥۣۡۨۢ
            java.lang.Object r1 = r5.fileKey()
            Yue.ۥۣۡۨۢ r2 = r3.f5715
            r0.<init>(r4, r1, r2)
            Yue.ۥ۟ۡۧۡ<Yue.ۥۣۡۨۢ> r1 = r3.f5716
            r1.add(r0)
            java.nio.file.FileVisitResult r4 = super.preVisitDirectory(r4, r5)
            java.lang.String r5 = "super.preVisitDirectory(dir, attrs)"
            Yue.C3329.m13905(r4, r5)
            return r4
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.util.List<Yue.C4709> m8660(@Yue.InterfaceC4418 Yue.C4709 r3) {
            r2 = this;
            java.lang.String r0 = "directoryNode"
            Yue.C3329.m13906(r3, r0)
            r2.f5715 = r3
            java.nio.file.Path r3 = r3.m18702()
            Yue.ۥ۠ۧۡۦ r0 = Yue.C3614.f11524
            boolean r1 = r2.f5714
            java.util.Set r0 = r0.m14611(r1)
            r1 = 1
            java.nio.file.Files.walkFileTree(r3, r0, r1, r2)
            Yue.ۥ۟ۡۧۡ<Yue.ۥۣۡۨۢ> r3 = r2.f5716
            r3.removeFirst()
            Yue.ۥ۟ۡۧۡ<Yue.ۥۣۡۨۢ> r3 = r2.f5716
            Yue.ۥ۟ۡۧۡ r0 = new Yue.ۥ۟ۡۧۡ
            r0.<init>()
            r2.f5716 = r0
            return r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.nio.file.FileVisitResult m8661(@Yue.InterfaceC4418 java.nio.file.Path r4, @Yue.InterfaceC4418 java.nio.file.attribute.BasicFileAttributes r5) {
            r3 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "attrs"
            Yue.C3329.m13906(r5, r0)
            Yue.ۥۣۡۨۢ r0 = new Yue.ۥۣۡۨۢ
            r1 = 0
            Yue.ۥۣۡۨۢ r2 = r3.f5715
            r0.<init>(r4, r1, r2)
            Yue.ۥ۟ۡۧۡ<Yue.ۥۣۡۨۢ> r1 = r3.f5716
            r1.add(r0)
            java.nio.file.FileVisitResult r4 = super.visitFile(r4, r5)
            java.lang.String r5 = "super.visitFile(file, attrs)"
            Yue.C3329.m13905(r4, r5)
            return r4
    }
}
