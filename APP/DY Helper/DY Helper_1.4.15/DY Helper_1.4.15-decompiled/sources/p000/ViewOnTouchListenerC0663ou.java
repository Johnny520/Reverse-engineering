package p000;

/* JADX INFO: renamed from: ou */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnTouchListenerC0663ou implements android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f8252;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ float f8253;

    public /* synthetic */ ViewOnTouchListenerC0663ou(int r1, float r2) {
            r0 = this;
            r0.f8252 = r1
            r0.f8253 = r2
            r0.<init>()
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r2, android.view.MotionEvent r3) {
            r1 = this;
            int r0 = r1.f8252
            switch(r0) {
                case 0: goto L58;
                default: goto L5;
            }
        L5:
            int r3 = r3.getActionMasked()
            if (r3 == 0) goto L36
            r1 = 1
            if (r3 == r1) goto L12
            r1 = 3
            if (r3 == r1) goto L12
            goto L56
        L12:
            android.view.ViewPropertyAnimator r1 = r2.animate()
            r2 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r1 = r1.scaleX(r2)
            android.view.ViewPropertyAnimator r1 = r1.scaleY(r2)
            r2 = 220(0xdc, double:1.087E-321)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r2)
            android.view.animation.OvershootInterpolator r2 = new android.view.animation.OvershootInterpolator
            r3 = 1066192077(0x3f8ccccd, float:1.1)
            r2.<init>(r3)
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r2)
            r1.start()
            goto L56
        L36:
            android.view.ViewPropertyAnimator r2 = r2.animate()
            float r1 = r1.f8253
            android.view.ViewPropertyAnimator r2 = r2.scaleX(r1)
            android.view.ViewPropertyAnimator r1 = r2.scaleY(r1)
            r2 = 110(0x6e, double:5.43E-322)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r2)
            android.view.animation.DecelerateInterpolator r2 = new android.view.animation.DecelerateInterpolator
            r2.<init>()
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r2)
            r1.start()
        L56:
            r1 = 0
            return r1
        L58:
            int r3 = r3.getActionMasked()
            if (r3 == 0) goto L89
            r1 = 1
            if (r3 == r1) goto L65
            r1 = 3
            if (r3 == r1) goto L65
            goto La9
        L65:
            android.view.ViewPropertyAnimator r1 = r2.animate()
            r2 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r1 = r1.scaleX(r2)
            android.view.ViewPropertyAnimator r1 = r1.scaleY(r2)
            r2 = 220(0xdc, double:1.087E-321)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r2)
            android.view.animation.OvershootInterpolator r2 = new android.view.animation.OvershootInterpolator
            r3 = 1066192077(0x3f8ccccd, float:1.1)
            r2.<init>(r3)
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r2)
            r1.start()
            goto La9
        L89:
            android.view.ViewPropertyAnimator r2 = r2.animate()
            float r1 = r1.f8253
            android.view.ViewPropertyAnimator r2 = r2.scaleX(r1)
            android.view.ViewPropertyAnimator r1 = r2.scaleY(r1)
            r2 = 110(0x6e, double:5.43E-322)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r2)
            android.view.animation.DecelerateInterpolator r2 = new android.view.animation.DecelerateInterpolator
            r2.<init>()
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r2)
            r1.start()
        La9:
            r1 = 0
            return r1
    }
}
