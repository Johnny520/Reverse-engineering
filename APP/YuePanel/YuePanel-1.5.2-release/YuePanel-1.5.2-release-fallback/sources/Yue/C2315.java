package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2315 extends Yue.AbstractC6953 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final android.animation.TimeInterpolator f7572 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final android.animation.TimeInterpolator f7573 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final java.lang.String f7574 = "android:explode:screenBounds";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int[] f7575;

    static {
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            Yue.C2315.f7572 = r0
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            Yue.C2315.f7573 = r0
            return
    }

    public C2315() {
            r1 = this;
            r1.<init>()
            r0 = 2
            int[] r0 = new int[r0]
            r1.f7575 = r0
            Yue.ۥ۟ۤۦۦ r0 = new Yue.ۥ۟ۤۦۦ
            r0.<init>()
            r1.setPropagation(r0)
            return
    }

    public C2315(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 2
            int[] r1 = new int[r1]
            r0.f7575 = r1
            Yue.ۥ۟ۤۦۦ r1 = new Yue.ۥ۟ۤۦۦ
            r1.<init>()
            r0.setPropagation(r1)
            return
    }

    private void captureValues(Yue.C6447 r6) {
            r5 = this;
            android.view.View r0 = r6.f22709
            int[] r1 = r5.f7575
            r0.getLocationOnScreen(r1)
            int[] r1 = r5.f7575
            r2 = 0
            r2 = r1[r2]
            r3 = 1
            r1 = r1[r3]
            int r3 = r0.getWidth()
            int r3 = r3 + r2
            int r0 = r0.getHeight()
            int r0 = r0 + r1
            java.util.Map<java.lang.String, java.lang.Object> r6 = r6.f22708
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r2, r1, r3, r0)
            java.lang.String r0 = "android:explode:screenBounds"
            r6.put(r0, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static float m10661(float r0, float r1) {
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static float m10662(android.view.View r1, int r2, int r3) {
            int r0 = r1.getWidth()
            int r0 = r0 - r2
            int r2 = java.lang.Math.max(r2, r0)
            int r1 = r1.getHeight()
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r3, r1)
            float r2 = (float) r2
            float r1 = (float) r1
            float r1 = m10661(r2, r1)
            return r1
    }

    @Override // Yue.AbstractC6953, Yue.AbstractC6398
    public void captureEndValues(@Yue.InterfaceC4410 Yue.C6447 r1) {
            r0 = this;
            super.captureEndValues(r1)
            r0.captureValues(r1)
            return
    }

    @Override // Yue.AbstractC6953, Yue.AbstractC6398
    public void captureStartValues(@Yue.InterfaceC4410 Yue.C6447 r1) {
            r0 = this;
            super.captureStartValues(r1)
            r0.captureValues(r1)
            return
    }

    @Override // Yue.AbstractC6398
    public boolean isSeekingSupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // Yue.AbstractC6953
    @Yue.InterfaceC4544
    public android.animation.Animator onAppear(@Yue.InterfaceC4410 android.view.ViewGroup r11, @Yue.InterfaceC4410 android.view.View r12, @Yue.InterfaceC4544 Yue.C6447 r13, @Yue.InterfaceC4544 Yue.C6447 r14) {
            r10 = this;
            if (r14 != 0) goto L4
            r11 = 0
            return r11
        L4:
            java.util.Map<java.lang.String, java.lang.Object> r13 = r14.f22708
            java.lang.String r0 = "android:explode:screenBounds"
            java.lang.Object r13 = r13.get(r0)
            android.graphics.Rect r13 = (android.graphics.Rect) r13
            float r6 = r12.getTranslationX()
            float r7 = r12.getTranslationY()
            int[] r0 = r10.f7575
            r10.m10663(r11, r13, r0)
            int[] r11 = r10.f7575
            r0 = 0
            r0 = r11[r0]
            float r0 = (float) r0
            float r4 = r6 + r0
            r0 = 1
            r11 = r11[r0]
            float r11 = (float) r11
            float r5 = r7 + r11
            int r2 = r13.left
            int r3 = r13.top
            android.animation.TimeInterpolator r8 = Yue.C2315.f7572
            r0 = r12
            r1 = r14
            r9 = r10
            android.animation.Animator r11 = Yue.C6449.m23746(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    @Override // Yue.AbstractC6953
    @Yue.InterfaceC4544
    public android.animation.Animator onDisappear(@Yue.InterfaceC4410 android.view.ViewGroup r11, @Yue.InterfaceC4410 android.view.View r12, @Yue.InterfaceC4544 Yue.C6447 r13, @Yue.InterfaceC4544 Yue.C6447 r14) {
            r10 = this;
            if (r13 != 0) goto L4
            r11 = 0
            return r11
        L4:
            java.util.Map<java.lang.String, java.lang.Object> r14 = r13.f22708
            java.lang.String r0 = "android:explode:screenBounds"
            java.lang.Object r14 = r14.get(r0)
            android.graphics.Rect r14 = (android.graphics.Rect) r14
            int r2 = r14.left
            int r3 = r14.top
            float r4 = r12.getTranslationX()
            float r5 = r12.getTranslationY()
            android.view.View r0 = r13.f22709
            int r1 = Yue.C5102.C5103.f18365
            java.lang.Object r0 = r0.getTag(r1)
            int[] r0 = (int[]) r0
            r1 = 1
            r6 = 0
            if (r0 == 0) goto L3c
            r7 = r0[r6]
            int r8 = r14.left
            int r8 = r7 - r8
            float r8 = (float) r8
            float r8 = r8 + r4
            r0 = r0[r1]
            int r9 = r14.top
            int r9 = r0 - r9
            float r9 = (float) r9
            float r9 = r9 + r5
            r14.offsetTo(r7, r0)
            goto L3e
        L3c:
            r8 = r4
            r9 = r5
        L3e:
            int[] r0 = r10.f7575
            r10.m10663(r11, r14, r0)
            int[] r11 = r10.f7575
            r14 = r11[r6]
            float r14 = (float) r14
            float r6 = r8 + r14
            r11 = r11[r1]
            float r11 = (float) r11
            float r7 = r9 + r11
            android.animation.TimeInterpolator r8 = Yue.C2315.f7573
            r0 = r12
            r1 = r13
            r9 = r10
            android.animation.Animator r11 = Yue.C6449.m23746(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final void m10663(android.view.View r16, android.graphics.Rect r17, int[] r18) {
            r15 = this;
            r0 = r15
            r1 = r16
            int[] r2 = r0.f7575
            r1.getLocationOnScreen(r2)
            int[] r2 = r0.f7575
            r3 = 0
            r4 = r2[r3]
            r5 = 1
            r2 = r2[r5]
            android.graphics.Rect r6 = r15.getEpicenter()
            if (r6 != 0) goto L37
            int r6 = r16.getWidth()
            int r6 = r6 / 2
            int r6 = r6 + r4
            float r7 = r16.getTranslationX()
            int r7 = java.lang.Math.round(r7)
            int r6 = r6 + r7
            int r7 = r16.getHeight()
            int r7 = r7 / 2
            int r7 = r7 + r2
            float r8 = r16.getTranslationY()
            int r8 = java.lang.Math.round(r8)
            int r7 = r7 + r8
            goto L42
        L37:
            int r7 = r6.centerX()
            int r6 = r6.centerY()
            r14 = r7
            r7 = r6
            r6 = r14
        L42:
            int r8 = r17.centerX()
            int r9 = r17.centerY()
            int r8 = r8 - r6
            float r8 = (float) r8
            int r9 = r9 - r7
            float r9 = (float) r9
            r10 = 0
            int r11 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r11 != 0) goto L6a
            int r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r10 != 0) goto L6a
            double r8 = java.lang.Math.random()
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r8 = r8 * r10
            float r8 = (float) r8
            r9 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 - r9
            double r12 = java.lang.Math.random()
            double r12 = r12 * r10
            float r10 = (float) r12
            float r9 = r10 - r9
        L6a:
            float r10 = m10661(r8, r9)
            float r8 = r8 / r10
            float r9 = r9 / r10
            int r6 = r6 - r4
            int r7 = r7 - r2
            float r1 = m10662(r1, r6, r7)
            float r8 = r8 * r1
            int r2 = java.lang.Math.round(r8)
            r18[r3] = r2
            float r1 = r1 * r9
            int r1 = java.lang.Math.round(r1)
            r18[r5] = r1
            return
    }
}
