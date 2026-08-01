package defpackage;

/* JADX INFO: renamed from: ᲀᛷᛲᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1704 extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f7587;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f7588;

    public C1704(androidx.appcompat.widget.ActionBarOverlayLayout r2) {
            r1 = this;
            r0 = 0
            r1.f7587 = r0
            r1.f7588 = r2
            r1.<init>()
            return
    }

    public C1704(defpackage.InterfaceC2045 r1, android.view.View r2) {
            r0 = this;
            r2 = 1
            r0.f7587 = r2
            r0.f7588 = r1
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator r1) {
            r0 = this;
            int r1 = r0.f7587
            java.lang.Object r0 = r0.f7588
            switch(r1) {
                case 0: goto Ld;
                default: goto L7;
            }
        L7:
            ᲇᛴᲇᛵ r0 = (defpackage.InterfaceC2045) r0
            r0.mo1690()
            return
        Ld:
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r1 = 0
            r0.f101 = r1
            r1 = 0
            r0.f87 = r1
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r1) {
            r0 = this;
            int r1 = r0.f7587
            java.lang.Object r0 = r0.f7588
            switch(r1) {
                case 0: goto Ld;
                default: goto L7;
            }
        L7:
            ᲇᛴᲇᛵ r0 = (defpackage.InterfaceC2045) r0
            r0.mo1855()
            return
        Ld:
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r1 = 0
            r0.f101 = r1
            r1 = 0
            r0.f87 = r1
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r2) {
            r1 = this;
            int r0 = r1.f7587
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.onAnimationStart(r2)
            return
        L9:
            java.lang.Object r1 = r1.f7588
            ᲇᛴᲇᛵ r1 = (defpackage.InterfaceC2045) r1
            r1.mo1689()
            return
    }
}
