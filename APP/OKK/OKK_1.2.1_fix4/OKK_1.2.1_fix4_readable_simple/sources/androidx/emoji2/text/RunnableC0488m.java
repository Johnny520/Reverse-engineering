package androidx.emoji2.text;

import android.app.Activity;
import android.os.Trace;
import com.abc.core.runtime.HookDiagnostics;
import p037U.AbstractC0358S;
import p091z.AbstractC1142a;

/* JADX INFO: renamed from: androidx.emoji2.text.m */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0488m implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1370a;

    public /* synthetic */ RunnableC0488m(int r1) {
        this.f1370a = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f1370a) {
            case 0: goto L30;
            default: goto L5;
        };
    L30:
        int r1 = AbstractC1142a.f4403a;     // Catch: Throwable -> L24
        Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");     // Catch: Throwable -> L24
        if (C0485j.f1354k == null) goto L26;
        C0485j.m1199a().m1201c();     // Catch: Throwable -> L24
    L26:
        Trace.endSection();
        return;
    L24:
        th = move-exception;
        int r12 = AbstractC1142a.f4403a;
        Trace.endSection();
        throw th;
    L5:
        if (HookDiagnostics.f3003d.get() == false) goto L8;
        return;
    L8:
        if (AbstractC0358S.f729i == true) goto L13;
        if (AbstractC0358S.f728h == true) goto L13;
        return;
    L13:
        if (HookDiagnostics.f3005f.incrementAndGet() > 40) goto L34;
        HookDiagnostics r02 = HookDiagnostics.f3000a;
        Activity r03 = HookDiagnostics.m2152b();
        if (r03 == null) goto L18;
        HookDiagnostics.m2151a(r03, "poll");
    L18:
        HookDiagnostics.f3001b.postDelayed(this, 500);
        return;
    }
}
