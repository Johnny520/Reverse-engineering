package p000;

/* JADX INFO: renamed from: fg */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0284fg implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f3921;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.Object f3922;

    public /* synthetic */ C0284fg(android.view.View r1, int r2) {
            r0 = this;
            r0.f3921 = r2
            r0.f3922 = r1
            r0.<init>()
            return
    }

    public /* synthetic */ C0284fg(p000.y21 r1, android.view.View r2) {
            r0 = this;
            r2 = 3
            r0.f3921 = r2
            r0.<init>()
            r0.f3922 = r1
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator r2) {
            r1 = this;
            int r0 = r1.f3921
            java.lang.Object r1 = r1.f3922
            switch(r0) {
                case 0: goto L51;
                case 1: goto L35;
                case 2: goto L19;
                default: goto L7;
            }
        L7:
            y21 r1 = (p000.y21) r1
            java.lang.Object r1 = r1.f12428
            tb2 r1 = (p000.tb2) r1
            androidx.appcompat.widget.ActionBarContainer r1 = r1.f10282
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            r1.invalidate()
            return
        L19:
            android.view.View r1 = (android.view.View) r1
            r2.getClass()
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            java.lang.Object r2 = r2.getAnimatedValue()
            r2.getClass()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.height = r2
            r1.requestLayout()
            return
        L35:
            android.view.View r1 = (android.view.View) r1
            r2.getClass()
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            java.lang.Object r2 = r2.getAnimatedValue()
            r2.getClass()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.height = r2
            r1.requestLayout()
            return
        L51:
            android.view.View r1 = (android.view.View) r1
            r2.getClass()
            tg r0 = p000.AbstractC0871ug.f10771
            java.lang.Object r2 = r2.getAnimatedValue()
            r2.getClass()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            p000.C0834tg.m5677(r1, r2)
            return
    }
}
