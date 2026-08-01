package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lh implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ lh(int r1, java.lang.Object r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    public /* synthetic */ lh(defpackage.l0 r1, android.view.View r2) {
            r0 = this;
            r2 = 3
            r0.a = r2
            r0.<init>()
            r0.b = r1
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator r4) {
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L69;
                case 1: goto L41;
                case 2: goto L19;
                default: goto L5;
            }
        L5:
            java.lang.Object r4 = r3.b
            l0 r4 = (defpackage.l0) r4
            java.lang.Object r4 = r4.b
            yb0 r4 = (defpackage.yb0) r4
            androidx.appcompat.widget.ActionBarContainer r4 = r4.z
            android.view.ViewParent r4 = r4.getParent()
            android.view.View r4 = (android.view.View) r4
            r4.invalidate()
            return
        L19:
            java.lang.Object r0 = r3.b
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            java.lang.String r1 = "W2s=\n"
            java.lang.String r2 = "Mh80cBTZgFI=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r2)
            defpackage.ip.o(r1, r4)
            java.lang.Object r4 = r4.getAnimatedValue()
            java.lang.String r1 = "gfIwzb4DTW+B6CiB/AUMYo70KIHqDwxvgOlxz+sMQCGb/izEvgtDdYPuMo/YDENgmw==\n"
            java.lang.String r2 = "74dcoZ5gLAE=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r2)
            defpackage.ip.m(r1, r4)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r0.setAlpha(r4)
            return
        L41:
            java.lang.Object r0 = r3.b
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            java.lang.String r1 = "IAY=\n"
            java.lang.String r2 = "SXLmdnhOoq8=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r2)
            defpackage.ip.o(r1, r4)
            java.lang.Object r4 = r4.getAnimatedValue()
            java.lang.String r1 = "pRJqVfO3EPqlCHIZsbFR96oUchmnu1H6pAkrV6a4HbS/HnZc878e4KcOaBeaugU=\n"
            java.lang.String r2 = "y2cGOdPUcZQ=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r2)
            defpackage.ip.m(r1, r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0.setColor(r4)
            return
        L69:
            java.lang.Object r0 = r3.b
            ph r0 = (defpackage.ph) r0
            r0.getClass()
            java.lang.Object r4 = r4.getAnimatedValue()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            com.google.android.material.internal.CheckableImageButton r0 = r0.d
            r0.setAlpha(r4)
            return
    }
}
