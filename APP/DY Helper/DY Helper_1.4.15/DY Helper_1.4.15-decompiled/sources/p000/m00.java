package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class m00 extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f6881;

    /* JADX INFO: renamed from: β */
    public boolean f6882;

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ java.lang.Object f6883;

    public /* synthetic */ m00(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f6881 = r1
            r0.f6883 = r2
            r0.<init>()
            r1 = 0
            r0.f6882 = r1
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator r1) {
            r0 = this;
            int r1 = r0.f6881
            switch(r1) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            r1 = 1
            r0.f6882 = r1
            return
        L9:
            r1 = 1
            r0.f6882 = r1
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r3) {
            r2 = this;
            int r3 = r2.f6881
            switch(r3) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            java.lang.Object r3 = r2.f6883
            androidx.appcompat.widget.ScrollingTabContainerView r3 = (androidx.appcompat.widget.ScrollingTabContainerView) r3
            boolean r2 = r2.f6882
            if (r2 == 0) goto Le
            goto L12
        Le:
            r2 = 0
            r3.setVisibility(r2)
        L12:
            return
        L13:
            java.lang.Object r3 = r2.f6883
            o00 r3 = (p000.o00) r3
            boolean r0 = r2.f6882
            r1 = 0
            if (r0 == 0) goto L1f
            r2.f6882 = r1
            goto L3e
        L1f:
            android.animation.ValueAnimator r2 = r3.f7851
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L36
            r3.f7852 = r1
            r3.m4149(r1)
            goto L3e
        L36:
            r2 = 2
            r3.f7852 = r2
            androidx.recyclerview.widget.RecyclerView r2 = r3.f7844
            r2.invalidate()
        L3e:
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r2) {
            r1 = this;
            int r0 = r1.f6881
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.onAnimationStart(r2)
            return
        L9:
            java.lang.Object r2 = r1.f6883
            androidx.appcompat.widget.ScrollingTabContainerView r2 = (androidx.appcompat.widget.ScrollingTabContainerView) r2
            r0 = 0
            r2.setVisibility(r0)
            r1.f6882 = r0
            return
    }
}
