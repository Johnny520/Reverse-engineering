package p000;

import android.os.Trace;

/* JADX INFO: renamed from: sf */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2501sf implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8788a;

    /* JADX INFO: renamed from: a */
    private final void m4985a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8788a) {
            case 0:
                try {
                    int i = AbstractC2792zB.f9460a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (C2372pf.f8342k != null) {
                        C2372pf.m4798a().m4800c();
                        break;
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i2 = AbstractC2792zB.f9460a;
                    Trace.endSection();
                    throw th;
                }
            default:
                return;
        }
    }
}
