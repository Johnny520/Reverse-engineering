package defpackage;

/* JADX INFO: renamed from: ᲁᛲᛲᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1806 extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0857 f7908;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ android.view.View f7909;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ android.view.ViewPropertyAnimator f7910;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f7911;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C2162 f7912;

    public /* synthetic */ C1806(defpackage.C0857 r1, defpackage.C2162 r2, android.view.ViewPropertyAnimator r3, android.view.View r4, int r5) {
            r0 = this;
            r0.f7911 = r5
            r0.f7908 = r1
            r0.f7912 = r2
            r0.f7910 = r3
            r0.f7909 = r4
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r7) {
            r6 = this;
            int r7 = r6.f7911
            ᲇᲈᛶᛵ r0 = r6.f7912
            ᛵᛳᲁᛳ r1 = r6.f7908
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            android.view.View r4 = r6.f7909
            r5 = 0
            android.view.ViewPropertyAnimator r6 = r6.f7910
            switch(r7) {
                case 0: goto L2d;
                default: goto L11;
            }
        L11:
            r6.setListener(r5)
            r4.setAlpha(r3)
            r4.setTranslationX(r2)
            r4.setTranslationY(r2)
            ᲈᛸᲈᛷ r6 = r0.f9216
            r1.m473(r6)
            java.util.ArrayList r6 = r1.f3907
            ᲈᛸᲈᛷ r7 = r0.f9216
            r6.remove(r7)
            r1.m1809()
            return
        L2d:
            r6.setListener(r5)
            r4.setAlpha(r3)
            r4.setTranslationX(r2)
            r4.setTranslationY(r2)
            ᲈᛸᲈᛷ r6 = r0.f9215
            r1.m473(r6)
            java.util.ArrayList r6 = r1.f3907
            ᲈᛸᲈᛷ r7 = r0.f9215
            r6.remove(r7)
            r1.m1809()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            int r1 = r0.f7911
            switch(r1) {
                case 0: goto Lb;
                default: goto L5;
            }
        L5:
            ᛵᛳᲁᛳ r0 = r0.f7908
            r0.getClass()
            return
        Lb:
            ᛵᛳᲁᛳ r0 = r0.f7908
            r0.getClass()
            return
    }
}
