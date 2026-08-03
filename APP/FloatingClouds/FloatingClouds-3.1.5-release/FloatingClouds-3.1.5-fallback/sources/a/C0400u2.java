package a;

/* JADX INFO: renamed from: a.u2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0400u2 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior f705a;

    public C0400u2(com.google.android.material.bottomsheet.BottomSheetBehavior r1) {
            r0 = this;
            r0.<init>()
            r0.f705a = r1
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator r4) {
            r3 = this;
            java.lang.Object r4 = r4.getAnimatedValue()
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.f705a
            a.Ta r0 = r0.i
            if (r0 == 0) goto L20
            a.Ta$b r1 = r0.f278a
            float r2 = r1.i
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L20
            r1.i = r4
            r4 = 1
            r0.e = r4
            r0.invalidateSelf()
        L20:
            return
    }
}
