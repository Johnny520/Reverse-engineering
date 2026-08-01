package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class su1 extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f10048;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ android.view.View f10049;

    public /* synthetic */ su1(android.view.View r1, int r2) {
            r0 = this;
            r0.f10048 = r2
            r0.f10049 = r1
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            int r0 = r1.f10048
            r2.getClass()
            switch(r0) {
                case 0: goto L15;
                default: goto L8;
            }
        L8:
            android.view.View r1 = r1.f10049
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r0 = -2
            r2.height = r0
            r1.requestLayout()
            return
        L15:
            r2 = 8
            android.view.View r1 = r1.f10049
            r1.setVisibility(r2)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r0 = -2
            r2.height = r0
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r2)
            r2 = 0
            r1.setTranslationY(r2)
            r1.requestLayout()
            return
    }
}
