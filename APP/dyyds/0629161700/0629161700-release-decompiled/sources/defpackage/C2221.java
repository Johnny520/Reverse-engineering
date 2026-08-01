package defpackage;

/* JADX INFO: renamed from: ᲈᛴᛵᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2221 extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ android.view.ViewPropertyAnimator f9477;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f9478;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ android.view.View f9479;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.AbstractC2316 f9480;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f9481;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0857 f9482;

    public C2221(defpackage.C0857 r1, defpackage.AbstractC2316 r2, int r3, android.view.View r4, int r5, android.view.ViewPropertyAnimator r6) {
            r0 = this;
            r0.f9482 = r1
            r0.f9480 = r2
            r0.f9481 = r3
            r0.f9479 = r4
            r0.f9478 = r5
            r0.f9477 = r6
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator r3) {
            r2 = this;
            int r3 = r2.f9481
            r0 = 0
            android.view.View r1 = r2.f9479
            if (r3 == 0) goto La
            r1.setTranslationX(r0)
        La:
            int r2 = r2.f9478
            if (r2 == 0) goto L11
            r1.setTranslationY(r0)
        L11:
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            android.view.ViewPropertyAnimator r2 = r1.f9477
            r0 = 0
            r2.setListener(r0)
            ᛵᛳᲁᛳ r2 = r1.f9482
            ᲈᛸᲈᛷ r1 = r1.f9480
            r2.m473(r1)
            java.util.ArrayList r0 = r2.f3908
            r0.remove(r1)
            r2.m1809()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            ᛵᛳᲁᛳ r0 = r0.f9482
            r0.getClass()
            return
    }
}
