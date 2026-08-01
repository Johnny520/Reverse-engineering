package xhss;

/* JADX INFO: renamed from: xhss.ᛴᲇᲀᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0418 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f1480;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1481;

    public /* synthetic */ C0418(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f1481 = r1
            r0.f1480 = r2
            r0.<init>()
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator r2) {
            r1 = this;
            int r0 = r1.f1481
            java.lang.Object r1 = r1.f1480
            switch(r0) {
                case 0: goto L2f;
                case 1: goto L19;
                default: goto L7;
            }
        L7:
            xhss.ᛵᛲᲇᛴ r1 = (xhss.C0450) r1
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.f1620 = r2
            r1.invalidate()
            return
        L19:
            xhss.ᛶᲈᛴᛲ r1 = (xhss.C0614) r1
            java.lang.Object r1 = r1.f2125
            xhss.ᛲᛵᛶᲁ r1 = (xhss.C0158) r1
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1 = r1.f638
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.m69(r2)
            return
        L2f:
            xhss.ᛶᲈᛴᛲ r1 = (xhss.C0614) r1
            java.lang.Object r1 = r1.f2125
            xhss.ᛲᛵᛶᲁ r1 = (xhss.C0158) r1
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1 = r1.f638
            java.lang.Object r2 = r2.getAnimatedValue()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r1.m69(r2)
            return
    }
}
