package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B5 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ B5(a.F5 r2) {
            r1 = this;
            r0 = 0
            r1.f25a = r0
            r1.<init>()
            r1.b = r2
            return
    }

    public /* synthetic */ B5(a.lh.c r1, android.view.View r2) {
            r0 = this;
            r2 = 1
            r0.f25a = r2
            r0.<init>()
            r0.b = r1
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator r2) {
            r1 = this;
            int r0 = r1.f25a
            switch(r0) {
                case 0: goto L17;
                default: goto L5;
            }
        L5:
            java.lang.Object r2 = r1.b
            a.lh$c r2 = (a.lh.c) r2
            a.lh r2 = r2.f568a
            androidx.appcompat.widget.ActionBarContainer r2 = r2.d
            android.view.ViewParent r2 = r2.getParent()
            android.view.View r2 = (android.view.View) r2
            r2.invalidate()
            return
        L17:
            java.lang.Object r0 = r1.b
            a.F5 r0 = (a.F5) r0
            r0.getClass()
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            com.google.android.material.internal.CheckableImageButton r0 = r0.d
            r0.setAlpha(r2)
            return
    }
}
