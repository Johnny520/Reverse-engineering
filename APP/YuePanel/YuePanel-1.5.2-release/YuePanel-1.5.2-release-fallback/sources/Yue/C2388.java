package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2388 extends java.nio.file.SimpleFileVisitor<java.nio.file.Path> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final Yue.InterfaceC2839<java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes, java.nio.file.FileVisitResult> f7809;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final Yue.InterfaceC2839<java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes, java.nio.file.FileVisitResult> f7810;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final Yue.InterfaceC2839<java.nio.file.Path, java.io.IOException, java.nio.file.FileVisitResult> f7811;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public final Yue.InterfaceC2839<java.nio.file.Path, java.io.IOException, java.nio.file.FileVisitResult> f7812;

    public C2388(@Yue.InterfaceC4543 Yue.InterfaceC2839<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r1, @Yue.InterfaceC4543 Yue.InterfaceC2839<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r2, @Yue.InterfaceC4543 Yue.InterfaceC2839<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r3, @Yue.InterfaceC4543 Yue.InterfaceC2839<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r4) {
            r0 = this;
            r0.<init>()
            r0.f7809 = r1
            r0.f7810 = r2
            r0.f7811 = r3
            r0.f7812 = r4
            return
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ java.nio.file.FileVisitResult postVisitDirectory(java.lang.Object r1, java.io.IOException r2) {
            r0 = this;
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            java.nio.file.FileVisitResult r1 = r0.m10995(r1, r2)
            return r1
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ java.nio.file.FileVisitResult preVisitDirectory(java.lang.Object r1, java.nio.file.attribute.BasicFileAttributes r2) {
            r0 = this;
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            java.nio.file.FileVisitResult r1 = r0.m10996(r1, r2)
            return r1
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ java.nio.file.FileVisitResult visitFile(java.lang.Object r1, java.nio.file.attribute.BasicFileAttributes r2) {
            r0 = this;
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            java.nio.file.FileVisitResult r1 = r0.m10997(r1, r2)
            return r1
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ java.nio.file.FileVisitResult visitFileFailed(java.lang.Object r1, java.io.IOException r2) {
            r0 = this;
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            java.nio.file.FileVisitResult r1 = r0.m10998(r1, r2)
            return r1
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.nio.file.FileVisitResult m10995(@Yue.InterfaceC4418 java.nio.file.Path r2, @Yue.InterfaceC4543 java.io.IOException r3) {
            r1 = this;
            java.lang.String r0 = "dir"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥۣ۠ۢۢ<java.nio.file.Path, java.io.IOException, java.nio.file.FileVisitResult> r0 = r1.f7812
            if (r0 == 0) goto L11
            java.lang.Object r0 = r0.invoke(r2, r3)
            java.nio.file.FileVisitResult r0 = (java.nio.file.FileVisitResult) r0
            if (r0 != 0) goto L1a
        L11:
            java.nio.file.FileVisitResult r0 = super.postVisitDirectory(r2, r3)
            java.lang.String r2 = "super.postVisitDirectory(dir, exc)"
            Yue.C3329.m13905(r0, r2)
        L1a:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.nio.file.FileVisitResult m10996(@Yue.InterfaceC4418 java.nio.file.Path r2, @Yue.InterfaceC4418 java.nio.file.attribute.BasicFileAttributes r3) {
            r1 = this;
            java.lang.String r0 = "dir"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "attrs"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥۣ۠ۢۢ<java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes, java.nio.file.FileVisitResult> r0 = r1.f7809
            if (r0 == 0) goto L16
            java.lang.Object r0 = r0.invoke(r2, r3)
            java.nio.file.FileVisitResult r0 = (java.nio.file.FileVisitResult) r0
            if (r0 != 0) goto L1f
        L16:
            java.nio.file.FileVisitResult r0 = super.preVisitDirectory(r2, r3)
            java.lang.String r2 = "super.preVisitDirectory(dir, attrs)"
            Yue.C3329.m13905(r0, r2)
        L1f:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.nio.file.FileVisitResult m10997(@Yue.InterfaceC4418 java.nio.file.Path r2, @Yue.InterfaceC4418 java.nio.file.attribute.BasicFileAttributes r3) {
            r1 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "attrs"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥۣ۠ۢۢ<java.nio.file.Path, java.nio.file.attribute.BasicFileAttributes, java.nio.file.FileVisitResult> r0 = r1.f7810
            if (r0 == 0) goto L16
            java.lang.Object r0 = r0.invoke(r2, r3)
            java.nio.file.FileVisitResult r0 = (java.nio.file.FileVisitResult) r0
            if (r0 != 0) goto L1f
        L16:
            java.nio.file.FileVisitResult r0 = super.visitFile(r2, r3)
            java.lang.String r2 = "super.visitFile(file, attrs)"
            Yue.C3329.m13905(r0, r2)
        L1f:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public java.nio.file.FileVisitResult m10998(@Yue.InterfaceC4418 java.nio.file.Path r2, @Yue.InterfaceC4418 java.io.IOException r3) {
            r1 = this;
            java.lang.String r0 = "file"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "exc"
            Yue.C3329.m13906(r3, r0)
            Yue.ۥۣ۠ۢۢ<java.nio.file.Path, java.io.IOException, java.nio.file.FileVisitResult> r0 = r1.f7811
            if (r0 == 0) goto L16
            java.lang.Object r0 = r0.invoke(r2, r3)
            java.nio.file.FileVisitResult r0 = (java.nio.file.FileVisitResult) r0
            if (r0 != 0) goto L1f
        L16:
            java.nio.file.FileVisitResult r0 = super.visitFileFailed(r2, r3)
            java.lang.String r2 = "super.visitFileFailed(file, exc)"
            Yue.C3329.m13905(r0, r2)
        L1f:
            return r0
    }
}
