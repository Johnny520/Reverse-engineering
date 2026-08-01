package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q7 implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ q7(int r1, java.lang.Object r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator r4) {
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L3b;
                case 1: goto L19;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.b
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            za r0 = r0.u0
            java.lang.Object r4 = r4.getAnimatedValue()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r0.k(r4)
            return
        L19:
            java.lang.Object r4 = r4.getAnimatedValue()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r0 = 1132396544(0x437f0000, float:255.0)
            float r4 = r4 * r0
            int r4 = (int) r4
            java.lang.Object r0 = r3.b
            wj r0 = (defpackage.wj) r0
            android.graphics.drawable.StateListDrawable r1 = r0.c
            r1.setAlpha(r4)
            android.graphics.drawable.Drawable r1 = r0.d
            r1.setAlpha(r4)
            androidx.recyclerview.widget.RecyclerView r4 = r0.s
            r4.invalidate()
            return
        L3b:
            java.lang.Object r4 = r4.getAnimatedValue()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            java.lang.Object r0 = r3.b
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r0
            eu r0 = r0.i
            if (r0 == 0) goto L5d
            du r1 = r0.a
            float r2 = r1.i
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L5d
            r1.i = r4
            r4 = 1
            r0.e = r4
            r0.invalidateSelf()
        L5d:
            return
    }
}
