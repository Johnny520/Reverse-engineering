package defpackage;

/* JADX INFO: renamed from: ᛷᲈᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1404 extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0857 f6107;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ android.view.ViewPropertyAnimator f6108;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ android.view.View f6109;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f6110;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.AbstractC2316 f6111;

    public C1404(defpackage.C0857 r2, defpackage.AbstractC2316 r3, android.view.View r4, android.view.ViewPropertyAnimator r5) {
            r1 = this;
            r0 = 1
            r1.f6110 = r0
            r1.f6107 = r2
            r1.f6111 = r3
            r1.f6109 = r4
            r1.f6108 = r5
            r1.<init>()
            return
    }

    public C1404(defpackage.C0857 r2, defpackage.AbstractC2316 r3, android.view.ViewPropertyAnimator r4, android.view.View r5) {
            r1 = this;
            r0 = 0
            r1.f6110 = r0
            r1.f6107 = r2
            r1.f6111 = r3
            r1.f6108 = r4
            r1.f6109 = r5
            r1.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator r2) {
            r1 = this;
            int r0 = r1.f6110
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.onAnimationCancel(r2)
            return
        L9:
            android.view.View r1 = r1.f6109
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r2)
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r5) {
            r4 = this;
            int r5 = r4.f6110
            ᲈᛸᲈᛷ r0 = r4.f6111
            ᛵᛳᲁᛳ r1 = r4.f6107
            r2 = 0
            android.view.ViewPropertyAnimator r3 = r4.f6108
            switch(r5) {
                case 0: goto L1b;
                default: goto Lc;
            }
        Lc:
            r3.setListener(r2)
            r1.m473(r0)
            java.util.ArrayList r4 = r1.f3902
            r4.remove(r0)
            r1.m1809()
            return
        L1b:
            r3.setListener(r2)
            android.view.View r4 = r4.f6109
            r5 = 1065353216(0x3f800000, float:1.0)
            r4.setAlpha(r5)
            r1.m473(r0)
            java.util.ArrayList r4 = r1.f3906
            r4.remove(r0)
            r1.m1809()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            int r1 = r0.f6110
            switch(r1) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            ᛵᛳᲁᛳ r0 = r0.f6107
            r0.getClass()
            return
        Lb:
            ᛵᛳᲁᛳ r0 = r0.f6107
            r0.getClass()
            return
    }
}
