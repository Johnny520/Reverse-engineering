package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hi implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            java.lang.String r0 = "EmojiCompat.EmojiCompatInitializer.run"
            int r1 = defpackage.n70.a     // Catch: java.lang.Throwable -> L18
            defpackage.m70.a(r0)     // Catch: java.lang.Throwable -> L18
            ei r0 = defpackage.ei.j     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L1a
            ei r0 = defpackage.ei.a()     // Catch: java.lang.Throwable -> L18
            r0.c()     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r0 = move-exception
            goto L1e
        L1a:
            defpackage.m70.b()
            return
        L1e:
            int r1 = defpackage.n70.a
            defpackage.m70.b()
            throw r0
    }
}
