package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۦ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3386 extends java.util.concurrent.CancellationException implements Yue.InterfaceC1631<Yue.C3386> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final transient Yue.InterfaceC3383 f10826;

    public C3386(@Yue.InterfaceC4418 java.lang.String r1, @Yue.InterfaceC4543 java.lang.Throwable r2, @Yue.InterfaceC4418 Yue.InterfaceC3383 r3) {
            r0 = this;
            r0.<init>(r1)
            r0.f10826 = r3
            if (r2 == 0) goto La
            r0.initCause(r2)
        La:
            return
    }

    public boolean equals(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            if (r3 == r2) goto L31
            boolean r0 = r3 instanceof Yue.C3386
            if (r0 == 0) goto L2f
            Yue.ۥ۠ۦ۟ۢ r3 = (Yue.C3386) r3
            java.lang.String r0 = r3.getMessage()
            java.lang.String r1 = r2.getMessage()
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L2f
            Yue.ۥ۠ۦ۟ۡ r0 = r3.f10826
            Yue.ۥ۠ۦ۟ۡ r1 = r2.f10826
            boolean r0 = Yue.C3329.m13897(r0, r1)
            if (r0 == 0) goto L2f
            java.lang.Throwable r3 = r3.getCause()
            java.lang.Throwable r0 = r2.getCause()
            boolean r3 = Yue.C3329.m13897(r3, r0)
            if (r3 == 0) goto L2f
            goto L31
        L2f:
            r3 = 0
            goto L32
        L31:
            r3 = 1
        L32:
            return r3
    }

    @Override // java.lang.Throwable
    @Yue.InterfaceC4418
    public java.lang.Throwable fillInStackTrace() {
            r1 = this;
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            r1.setStackTrace(r0)
            return r1
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.getMessage()
            Yue.C3329.m13903(r0)
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            Yue.ۥ۠ۦ۟ۡ r1 = r2.f10826
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Throwable r1 = r2.getCause()
            if (r1 == 0) goto L21
            int r1 = r1.hashCode()
            goto L22
        L21:
            r1 = 0
        L22:
            int r0 = r0 + r1
            return r0
    }

    @Override // java.lang.Throwable
    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "; job="
            r0.append(r1)
            Yue.ۥ۠ۦ۟ۡ r1 = r2.f10826
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.InterfaceC1631
    /* JADX INFO: renamed from: ۥ */
    public /* bridge */ /* synthetic */ java.lang.Throwable mo7905() {
            r1 = this;
            Yue.ۥ۠ۦ۟ۢ r0 = r1.m13996()
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public Yue.C3386 m13996() {
            r1 = this;
            r0 = 0
            return r0
    }
}
