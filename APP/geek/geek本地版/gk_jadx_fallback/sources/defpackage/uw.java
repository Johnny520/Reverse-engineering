package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uw implements android.window.OnBackAnimationCallback {
    public final /* synthetic */ defpackage.sm a;
    public final /* synthetic */ defpackage.sm b;
    public final /* synthetic */ defpackage.hm c;
    public final /* synthetic */ defpackage.hm d;

    public uw(defpackage.sm r1, defpackage.sm r2, defpackage.hm r3, defpackage.hm r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final void onBackCancelled() {
            r1 = this;
            hm r0 = r1.d
            r0.a()
            return
    }

    public final void onBackInvoked() {
            r1 = this;
            hm r0 = r1.c
            r0.a()
            return
    }

    public final void onBackProgressed(android.window.BackEvent r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            defpackage.ip.o(r0, r2)
            a7 r0 = new a7
            r0.<init>(r2)
            sm r2 = r1.b
            r2.f(r0)
            return
    }

    public final void onBackStarted(android.window.BackEvent r2) {
            r1 = this;
            java.lang.String r0 = "backEvent"
            defpackage.ip.o(r0, r2)
            a7 r0 = new a7
            r0.<init>(r2)
            sm r2 = r1.a
            r2.f(r0)
            return
    }
}
