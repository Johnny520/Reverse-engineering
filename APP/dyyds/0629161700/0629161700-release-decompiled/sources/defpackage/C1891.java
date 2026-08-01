package defpackage;

/* JADX INFO: renamed from: ᲁᛷᲇᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1891 extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public boolean f8190;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1848 f8191;

    public C1891(defpackage.C1848 r1) {
            r0 = this;
            r0.f8191 = r1
            r0.<init>()
            r1 = 0
            r0.f8190 = r1
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator r1) {
            r0 = this;
            r1 = 1
            r0.f8190 = r1
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r3) {
            r2 = this;
            boolean r3 = r2.f8190
            r0 = 0
            if (r3 == 0) goto L8
            r2.f8190 = r0
            return
        L8:
            ᲁᛴᛷᛴ r2 = r2.f8191
            android.animation.ValueAnimator r3 = r2.f8074
            java.lang.Object r3 = r3.getAnimatedValue()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r1 = 0
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L21
            r2.f8071 = r0
            r2.m3237(r0)
            return
        L21:
            r3 = 2
            r2.f8071 = r3
            ᛱᛳᛶᛱ r2 = r2.f8059
            r2.invalidate()
            return
    }
}
