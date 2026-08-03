package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC2309
public final class C2387 implements Yue.InterfaceC2386 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.InterfaceC2839<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> f7804;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.InterfaceC2839<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> f7805;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.InterfaceC2839<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> f7806;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.InterfaceC2839<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> f7807;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f7808;

    public C2387() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.InterfaceC2386
    /* JADX INFO: renamed from: ۥ */
    public void mo10988(@Yue.InterfaceC4418 Yue.InterfaceC2839<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r3) {
            r2 = this;
            java.lang.String r0 = "function"
            Yue.C3329.m13906(r3, r0)
            r2.m10993()
            Yue.ۥۣ۠ۢۢ<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r0 = r2.f7804
            java.lang.String r1 = "onPreVisitDirectory"
            r2.m10994(r0, r1)
            r2.f7804 = r3
            return
    }

    @Override // Yue.InterfaceC2386
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo10989(@Yue.InterfaceC4418 Yue.InterfaceC2839<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r3) {
            r2 = this;
            java.lang.String r0 = "function"
            Yue.C3329.m13906(r3, r0)
            r2.m10993()
            Yue.ۥۣ۠ۢۢ<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r0 = r2.f7807
            java.lang.String r1 = "onPostVisitDirectory"
            r2.m10994(r0, r1)
            r2.f7807 = r3
            return
    }

    @Override // Yue.InterfaceC2386
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo10990(@Yue.InterfaceC4418 Yue.InterfaceC2839<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r3) {
            r2 = this;
            java.lang.String r0 = "function"
            Yue.C3329.m13906(r3, r0)
            r2.m10993()
            Yue.ۥۣ۠ۢۢ<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r0 = r2.f7805
            java.lang.String r1 = "onVisitFile"
            r2.m10994(r0, r1)
            r2.f7805 = r3
            return
    }

    @Override // Yue.InterfaceC2386
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo10991(@Yue.InterfaceC4418 Yue.InterfaceC2839<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r3) {
            r2 = this;
            java.lang.String r0 = "function"
            Yue.C3329.m13906(r3, r0)
            r2.m10993()
            Yue.ۥۣ۠ۢۢ<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r0 = r2.f7806
            java.lang.String r1 = "onVisitFileFailed"
            r2.m10994(r0, r1)
            r2.f7806 = r3
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final java.nio.file.FileVisitor<java.nio.file.Path> m10992() {
            r5 = this;
            r5.m10993()
            r0 = 1
            r5.f7808 = r0
            Yue.ۥ۠ۢ۟ۡ r0 = new Yue.ۥ۠ۢ۟ۡ
            Yue.ۥۣ۠ۢۢ<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r1 = r5.f7804
            Yue.ۥۣ۠ۢۢ<? super java.nio.file.Path, ? super java.nio.file.attribute.BasicFileAttributes, ? extends java.nio.file.FileVisitResult> r2 = r5.f7805
            Yue.ۥۣ۠ۢۢ<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r3 = r5.f7806
            Yue.ۥۣ۠ۢۢ<? super java.nio.file.Path, ? super java.io.IOException, ? extends java.nio.file.FileVisitResult> r4 = r5.f7807
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m10993() {
            r2 = this;
            boolean r0 = r2.f7808
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This builder was already built"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m10994(java.lang.Object r2, java.lang.String r3) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = " was already defined"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }
}
