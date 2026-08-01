package defpackage;

/* JADX INFO: renamed from: ᛳᛵᛳᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0477 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f2396;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f2397;

    public /* synthetic */ C0477(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f2396 = r1
            r0.f2397 = r2
            r0.<init>()
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator r2) {
            r1 = this;
            int r0 = r1.f2396
            java.lang.Object r1 = r1.f2397
            switch(r0) {
                case 0: goto L22;
                case 1: goto L19;
                default: goto L7;
            }
        L7:
            ᛱᲇᲁᲈ r1 = (defpackage.C0207) r1
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.f1303 = r2
            r1.invalidate()
            return
        L19:
            ᛶᛱᲁᛳ r1 = (defpackage.C1017) r1
            float r2 = r2.getAnimatedFraction()
            r1.f4534 = r2
            return
        L22:
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r0 = 1132396544(0x437f0000, float:255.0)
            float r2 = r2 * r0
            int r2 = (int) r2
            ᲁᛴᛷᛴ r1 = (defpackage.C1848) r1
            android.graphics.drawable.StateListDrawable r0 = r1.f8065
            r0.setAlpha(r2)
            android.graphics.drawable.Drawable r0 = r1.f8063
            r0.setAlpha(r2)
            ᛱᛳᛶᛱ r1 = r1.f8059
            r1.invalidate()
            return
    }
}
