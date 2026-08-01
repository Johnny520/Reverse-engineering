package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes.dex */
public final class uw implements OnBackAnimationCallback {
    public final /* synthetic */ sm a;
    public final /* synthetic */ sm b;
    public final /* synthetic */ hm c;
    public final /* synthetic */ hm d;

    public uw(sm r1, sm r2, hm r3, hm r4) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }

    public final void onBackCancelled() {
        this.d.a();
    }

    public final void onBackInvoked() {
        this.c.a();
    }

    public final void onBackProgressed(BackEvent r2) {
        ip.o("backEvent", r2);
        a7 r0 = new a7(r2);
        this.b.f(r0);
    }

    public final void onBackStarted(BackEvent r2) {
        ip.o("backEvent", r2);
        a7 r0 = new a7(r2);
        this.a.f(r0);
    }
}
