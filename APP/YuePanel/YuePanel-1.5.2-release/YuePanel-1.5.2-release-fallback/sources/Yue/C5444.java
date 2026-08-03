package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5444 implements Yue.InterfaceC1598<Yue.C6593> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.C5388<Yue.C6593> f20197;

    public C5444() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.InterfaceC1598
    @Yue.InterfaceC4418
    public Yue.InterfaceC1632 getContext() {
            r1 = this;
            Yue.ۥ۠۠ۧۦ r0 = Yue.C2141.f6728
            return r0
    }

    @Override // Yue.InterfaceC1598
    public void resumeWith(@Yue.InterfaceC4418 java.lang.Object r1) {
            r0 = this;
            monitor-enter(r0)
            Yue.ۥۡۦۧۤ r1 = Yue.C5388.m20376(r1)     // Catch: java.lang.Throwable -> L13
            r0.f20197 = r1     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Object"
            Yue.C3329.m13904(r0, r1)     // Catch: java.lang.Throwable -> L13
            r0.notifyAll()     // Catch: java.lang.Throwable -> L13
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return
        L13:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m20546() {
            r1 = this;
            monitor-enter(r1)
        L1:
            Yue.ۥۡۦۧۤ<Yue.ۥۣۢ۠ۤ> r0 = r1.f20197     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L10
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Object"
            Yue.C3329.m13904(r1, r0)     // Catch: java.lang.Throwable -> Le
            r1.wait()     // Catch: java.lang.Throwable -> Le
            goto L1
        Le:
            r0 = move-exception
            goto L19
        L10:
            java.lang.Object r0 = r0.m20387()     // Catch: java.lang.Throwable -> Le
            Yue.C5391.m20403(r0)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        L19:
            monitor-exit(r1)
            throw r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.C5388<Yue.C6593> m20547() {
            r1 = this;
            Yue.ۥۡۦۧۤ<Yue.ۥۣۢ۠ۤ> r0 = r1.f20197
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m20548(@Yue.InterfaceC4543 Yue.C5388<Yue.C6593> r1) {
            r0 = this;
            r0.f20197 = r1
            return
    }
}
