package defpackage;

/* JADX INFO: renamed from: ᲀᲈᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1787 implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f7867;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f7868;

    public /* synthetic */ CallableC1787(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f7867 = r1
            r0.f7868 = r2
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
            r3 = this;
            int r0 = r3.f7867
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r3 = r3.f7868
            ᛷᛸᛱᛸ r3 = (defpackage.C1326) r3
            return r3
        La:
            java.lang.Object r0 = r3.f7868
            ᛲᛲᛳᛳ r0 = (defpackage.C0246) r0
            monitor-enter(r0)
            java.lang.Object r1 = r3.f7868     // Catch: java.lang.Throwable -> L19
            ᛲᛲᛳᛳ r1 = (defpackage.C0246) r1     // Catch: java.lang.Throwable -> L19
            java.io.BufferedWriter r2 = r1.f1440     // Catch: java.lang.Throwable -> L19
            if (r2 != 0) goto L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            goto L37
        L19:
            r3 = move-exception
            goto L39
        L1b:
            r1.m868()     // Catch: java.lang.Throwable -> L19
            java.lang.Object r1 = r3.f7868     // Catch: java.lang.Throwable -> L19
            ᛲᛲᛳᛳ r1 = (defpackage.C0246) r1     // Catch: java.lang.Throwable -> L19
            boolean r1 = r1.m865()     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L36
            java.lang.Object r1 = r3.f7868     // Catch: java.lang.Throwable -> L19
            ᛲᛲᛳᛳ r1 = (defpackage.C0246) r1     // Catch: java.lang.Throwable -> L19
            r1.m869()     // Catch: java.lang.Throwable -> L19
            java.lang.Object r3 = r3.f7868     // Catch: java.lang.Throwable -> L19
            ᛲᛲᛳᛳ r3 = (defpackage.C0246) r3     // Catch: java.lang.Throwable -> L19
            r1 = 0
            r3.f1445 = r1     // Catch: java.lang.Throwable -> L19
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
        L37:
            r3 = 0
            return r3
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
    }
}
