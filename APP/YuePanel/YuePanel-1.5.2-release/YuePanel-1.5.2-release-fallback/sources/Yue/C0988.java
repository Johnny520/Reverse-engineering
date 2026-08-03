package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0988 extends Yue.AbstractC6398 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f2819 = "android:changeScroll:x";

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final java.lang.String f2820 = "android:changeScroll:y";

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final java.lang.String[] f2821 = null;

    static {
            java.lang.String r0 = "android:changeScroll:x"
            java.lang.String r1 = "android:changeScroll:y"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            Yue.C0988.f2821 = r0
            return
    }

    public C0988() {
            r0 = this;
            r0.<init>()
            return
    }

    public C0988(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void captureValues(Yue.C6447 r4) {
            r3 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.f22708
            android.view.View r1 = r4.f22709
            int r1 = r1.getScrollX()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "android:changeScroll:x"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.f22708
            android.view.View r4 = r4.f22709
            int r4 = r4.getScrollY()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r1 = "android:changeScroll:y"
            r0.put(r1, r4)
            return
    }

    @Override // Yue.AbstractC6398
    public void captureEndValues(@Yue.InterfaceC4410 Yue.C6447 r1) {
            r0 = this;
            r0.captureValues(r1)
            return
    }

    @Override // Yue.AbstractC6398
    public void captureStartValues(@Yue.InterfaceC4410 Yue.C6447 r1) {
            r0 = this;
            r0.captureValues(r1)
            return
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4544
    public android.animation.Animator createAnimator(@Yue.InterfaceC4410 android.view.ViewGroup r5, @Yue.InterfaceC4544 Yue.C6447 r6, @Yue.InterfaceC4544 Yue.C6447 r7) {
            r4 = this;
            r5 = 0
            if (r6 == 0) goto L60
            if (r7 != 0) goto L6
            goto L60
        L6:
            android.view.View r0 = r7.f22709
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.f22708
            java.lang.String r2 = "android:changeScroll:x"
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r3 = r7.f22708
            java.lang.Object r2 = r3.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r6 = r6.f22708
            java.lang.String r3 = "android:changeScroll:y"
            java.lang.Object r6 = r6.get(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r7 = r7.f22708
            java.lang.Object r7 = r7.get(r3)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r1 == r2) goto L4c
            r0.setScrollX(r1)
            java.lang.String r3 = "scrollX"
            int[] r1 = new int[]{r1, r2}
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofInt(r0, r3, r1)
            goto L4d
        L4c:
            r1 = r5
        L4d:
            if (r6 == r7) goto L5c
            r0.setScrollY(r6)
            java.lang.String r5 = "scrollY"
            int[] r6 = new int[]{r6, r7}
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofInt(r0, r5, r6)
        L5c:
            android.animation.Animator r5 = Yue.C6444.m23743(r1, r5)
        L60:
            return r5
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4544
    public java.lang.String[] getTransitionProperties() {
            r1 = this;
            java.lang.String[] r0 = Yue.C0988.f2821
            return r0
    }

    @Override // Yue.AbstractC6398
    public boolean isSeekingSupported() {
            r1 = this;
            r0 = 1
            return r0
    }
}
