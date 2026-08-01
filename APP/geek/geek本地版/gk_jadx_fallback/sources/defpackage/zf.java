package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zf implements android.view.animation.Animation.AnimationListener {
    public final /* synthetic */ android.view.ViewGroup a;
    public final /* synthetic */ android.view.View b;
    public final /* synthetic */ defpackage.ag c;

    public zf(defpackage.ag r1, android.view.View r2, android.view.ViewGroup r3) {
            r0 = this;
            r0.<init>()
            r0.a = r3
            r0.b = r2
            r0.c = r1
            return
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation r2) {
            r1 = this;
            y6 r2 = new y6
            r0 = 3
            r2.<init>(r0, r1)
            android.view.ViewGroup r0 = r1.a
            r0.post(r2)
            return
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(android.view.animation.Animation r1) {
            r0 = this;
            return
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(android.view.animation.Animation r1) {
            r0 = this;
            return
    }
}
