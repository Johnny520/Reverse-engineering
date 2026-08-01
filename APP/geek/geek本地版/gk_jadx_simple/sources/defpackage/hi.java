package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hi implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        int r1 = n70.a;     // Catch: Throwable -> L9
        m70.a("EmojiCompat.EmojiCompatInitializer.run");     // Catch: Throwable -> L9
        if (ei.j == null) goto L5;
        boolean r0 = true;
    L6:
        if (r0 == false) goto L11;
        ei.a().c();     // Catch: Throwable -> L9
    L11:
        m70.b();
        return;
    L5:
        r0 = false;
    L9:
        th = move-exception;
        int r12 = n70.a;
        m70.b();
        throw th;
    }
}
