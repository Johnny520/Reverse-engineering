package defpackage;

/* JADX INFO: renamed from: ᲇᛵᛶᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2051 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f8843;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0292 f8844;

    public /* synthetic */ C2051(defpackage.C0292 r1, int r2) {
            r0 = this;
            r0.f8843 = r2
            r0.f8844 = r1
            r0.<init>()
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator r2) {
            r1 = this;
            int r0 = r1.f8843
            ᛲᛵᛲ r1 = r1.f8844
            switch(r0) {
                case 0: goto L1d;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r1.f1595
            ᛱᛳᲀᛷ r1 = (defpackage.C0060) r1
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1 = r1.f702
            if (r1 == 0) goto L1c
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.m278(r2)
        L1c:
            return
        L1d:
            java.lang.Object r1 = r1.f1595
            ᛱᛳᲀᛷ r1 = (defpackage.C0060) r1
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1 = r1.f702
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.m278(r2)
            return
    }
}
