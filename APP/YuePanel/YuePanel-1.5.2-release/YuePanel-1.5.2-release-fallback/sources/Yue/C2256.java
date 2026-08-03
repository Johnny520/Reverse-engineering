package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C2256 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int f7016;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f7017;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.List<java.lang.Exception> f7018;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public java.nio.file.Path f7019;

    public C2256() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public C2256(int r1) {
            r0 = this;
            r0.<init>()
            r0.f7016 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f7018 = r1
            return
    }

    public /* synthetic */ C2256(int r1, int r2, Yue.C1769 r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L6
            r1 = 64
        L6:
            r0.<init>(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m10443(@Yue.InterfaceC4418 java.lang.Exception r3) {
            r2 = this;
            java.lang.String r0 = "exception"
            Yue.C3329.m13906(r3, r0)
            int r0 = r2.f7017
            int r0 = r0 + 1
            r2.f7017 = r0
            java.util.List<java.lang.Exception> r0 = r2.f7018
            int r0 = r0.size()
            int r1 = r2.f7016
            if (r0 >= r1) goto L34
            java.nio.file.Path r0 = r2.f7019
            if (r0 == 0) goto L2f
            java.nio.file.FileSystemException r0 = new java.nio.file.FileSystemException
            java.nio.file.Path r1 = r2.f7019
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            java.lang.Throwable r3 = r0.initCause(r3)
            java.lang.String r0 = "null cannot be cast to non-null type java.nio.file.FileSystemException"
            Yue.C3329.m13904(r3, r0)
            java.nio.file.FileSystemException r3 = (java.nio.file.FileSystemException) r3
        L2f:
            java.util.List<java.lang.Exception> r0 = r2.f7018
            r0.add(r3)
        L34:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m10444(@Yue.InterfaceC4418 java.nio.file.Path r2) {
            r1 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r2, r0)
            java.nio.file.Path r0 = r1.f7019
            if (r0 == 0) goto Le
            java.nio.file.Path r2 = r0.resolve(r2)
            goto Lf
        Le:
            r2 = 0
        Lf:
            r1.f7019 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m10445(@Yue.InterfaceC4418 java.nio.file.Path r3) {
            r2 = this;
            java.lang.String r0 = "name"
            Yue.C3329.m13906(r3, r0)
            java.nio.file.Path r0 = r2.f7019
            r1 = 0
            if (r0 == 0) goto Lf
            java.nio.file.Path r0 = r0.getFileName()
            goto L10
        Lf:
            r0 = r1
        L10:
            boolean r3 = Yue.C3329.m13897(r3, r0)
            if (r3 == 0) goto L21
            java.nio.file.Path r3 = r2.f7019
            if (r3 == 0) goto L1e
            java.nio.file.Path r1 = r3.getParent()
        L1e:
            r2.f7019 = r1
            return
        L21:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final java.util.List<java.lang.Exception> m10446() {
            r1 = this;
            java.util.List<java.lang.Exception> r0 = r1.f7018
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final java.nio.file.Path m10447() {
            r1 = this;
            java.nio.file.Path r0 = r1.f7019
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m10448() {
            r1 = this;
            int r0 = r1.f7017
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m10449(@Yue.InterfaceC4543 java.nio.file.Path r1) {
            r0 = this;
            r0.f7019 = r1
            return
    }
}
