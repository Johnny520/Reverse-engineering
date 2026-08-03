package p000;

import android.os.Trace;

/* JADX INFO: renamed from: sf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2501sf implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8788a;

    public /* synthetic */ RunnableC2501sf(int r1) {
        this.f8788a = r1;
    }

    /* JADX INFO: renamed from: a */
    private final void m4985a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f8788a) {
            case 0: goto L18;
            default: goto L4;
        };
    L4:
        return;
    L18:
        int r1 = AbstractC2792zB.f9460a;     // Catch: Throwable -> L12
        Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");     // Catch: Throwable -> L12
        if (C2372pf.f8342k == null) goto L8;
        boolean r0 = true;
    L9:
        if (r0 == false) goto L14;
        C2372pf.m4798a().m4800c();     // Catch: Throwable -> L12
    L14:
        Trace.endSection();
        return;
    L8:
        r0 = false;
    L12:
        th = move-exception;
        int r12 = AbstractC2792zB.f9460a;
        Trace.endSection();
        throw th;
    }
}
