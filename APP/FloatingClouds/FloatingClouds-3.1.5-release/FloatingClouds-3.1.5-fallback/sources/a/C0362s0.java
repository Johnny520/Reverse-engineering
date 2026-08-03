package a;

/* JADX INFO: renamed from: a.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0362s0 extends android.graphics.drawable.Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.AbstractC0380t0 f675a;

    public C0362s0(a.AbstractC0380t0 r1) {
            r0 = this;
            r0.f675a = r1
            r0.<init>()
            return
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(android.graphics.drawable.Drawable r2) {
            r1 = this;
            a.t0 r0 = r1.f675a
            r0.a(r2)
            return
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(android.graphics.drawable.Drawable r2) {
            r1 = this;
            a.t0 r0 = r1.f675a
            r0.b(r2)
            return
    }
}
