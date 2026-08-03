package androidx.emoji2.text;

import android.app.Activity;
import android.os.Trace;
import p037U.AbstractC0358S;
import p056f0.C0830i;
import p091z.AbstractC1142a;

/* JADX INFO: renamed from: androidx.emoji2.text.m */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0488m implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1370a;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1370a) {
            case 0:
                try {
                    int i2 = AbstractC1142a.f4403a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (C0485j.f1354k != null) {
                        C0485j.m1199a().m1201c();
                        break;
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i3 = AbstractC1142a.f4403a;
                    Trace.endSection();
                    throw th;
                }
            default:
                if (C0830i.f3003d.get()) {
                    return;
                }
                if ((AbstractC0358S.f729i || AbstractC0358S.f728h) && C0830i.f3005f.incrementAndGet() <= 40) {
                    C0830i c0830i = C0830i.f3000a;
                    Activity activityM2152b = C0830i.m2152b();
                    if (activityM2152b != null) {
                        C0830i.m2151a(activityM2152b, "poll");
                    }
                    C0830i.f3001b.postDelayed(this, 500L);
                    return;
                }
                return;
        }
    }
}
