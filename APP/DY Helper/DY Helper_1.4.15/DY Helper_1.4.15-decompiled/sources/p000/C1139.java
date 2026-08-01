package p000;

/* JADX INFO: renamed from: ｉ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C1139 extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f13485;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ java.lang.Object f13486;

    public C1139(androidx.appcompat.widget.ActionBarOverlayLayout r2) {
            r1 = this;
            r0 = 0
            r1.f13485 = r0
            r1.f13486 = r2
            r1.<init>()
            return
    }

    public C1139(p000.z92 r1, android.view.View r2) {
            r0 = this;
            r2 = 1
            r0.f13485 = r2
            r0.f13486 = r1
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator r1) {
            r0 = this;
            int r1 = r0.f13485
            switch(r1) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r0.f13486
            z92 r0 = (p000.z92) r0
            r0.mo39()
            return
        Ld:
            java.lang.Object r0 = r0.f13486
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r1 = 0
            r0.f491 = r1
            r1 = 0
            r0.f506 = r1
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r1) {
            r0 = this;
            int r1 = r0.f13485
            switch(r1) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r0.f13486
            z92 r0 = (p000.z92) r0
            r0.mo38()
            return
        Ld:
            java.lang.Object r0 = r0.f13486
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r1 = 0
            r0.f491 = r1
            r1 = 0
            r0.f506 = r1
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r2) {
            r1 = this;
            int r0 = r1.f13485
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.onAnimationStart(r2)
            return
        L9:
            java.lang.Object r1 = r1.f13486
            z92 r1 = (p000.z92) r1
            r1.mo40()
            return
    }
}
