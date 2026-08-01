package xhss;

/* JADX INFO: renamed from: xhss.ᛳᲈᛶᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0327 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0614 f1238;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1239;

    public /* synthetic */ C0327(xhss.C0614 r1, int r2) {
            r0 = this;
            r0.f1239 = r2
            r0.f1238 = r1
            r0.<init>()
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator r2) {
            r1 = this;
            int r0 = r1.f1239
            xhss.ᛶᲈᛴᛲ r1 = r1.f1238
            switch(r0) {
                case 0: goto L1d;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r1.f2125
            xhss.ᲀᲀ r1 = (xhss.C0891) r1
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1 = r1.f2871
            if (r1 == 0) goto L1c
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.m69(r2)
        L1c:
            return
        L1d:
            java.lang.Object r1 = r1.f2125
            xhss.ᲀᲀ r1 = (xhss.C0891) r1
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1 = r1.f2871
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.m69(r2)
            return
    }
}
