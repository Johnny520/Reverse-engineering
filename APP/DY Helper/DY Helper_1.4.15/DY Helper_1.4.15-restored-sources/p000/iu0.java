package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class iu0 implements android.view.View.OnTouchListener {

    /* JADX INFO: renamed from: χ */
    public static final int f5188 = 0;

    /* JADX INFO: renamed from: ε */
    public final p000.C0862u7 f5189;

    /* JADX INFO: renamed from: ζ */
    public final android.view.animation.AccelerateInterpolator f5190;

    /* JADX INFO: renamed from: η */
    public final android.view.View f5191;

    /* JADX INFO: renamed from: θ */
    public p000.RunnableC0196d1 f5192;

    /* JADX INFO: renamed from: ι */
    public final float[] f5193;

    /* JADX INFO: renamed from: κ */
    public final float[] f5194;

    /* JADX INFO: renamed from: λ */
    public final int f5195;

    /* JADX INFO: renamed from: μ */
    public final int f5196;

    /* JADX INFO: renamed from: ν */
    public final float[] f5197;

    /* JADX INFO: renamed from: ξ */
    public final float[] f5198;

    /* JADX INFO: renamed from: ο */
    public final float[] f5199;

    /* JADX INFO: renamed from: π */
    public boolean f5200;

    /* JADX INFO: renamed from: ρ */
    public boolean f5201;

    /* JADX INFO: renamed from: σ */
    public boolean f5202;

    /* JADX INFO: renamed from: τ */
    public boolean f5203;

    /* JADX INFO: renamed from: υ */
    public boolean f5204;

    /* JADX INFO: renamed from: φ */
    public final android.widget.ListView f5205;

    static {
            int r0 = android.view.ViewConfiguration.getTapTimeout()
            p000.iu0.f5188 = r0
            return
    }

    public iu0(android.widget.ListView r12) {
            r11 = this;
            r11.<init>()
            u7 r0 = new u7
            r0.<init>()
            r1 = -9223372036854775808
            r0.f10620 = r1
            r1 = -1
            r0.f10622 = r1
            r1 = 0
            r0.f10621 = r1
            r11.f5189 = r0
            android.view.animation.AccelerateInterpolator r1 = new android.view.animation.AccelerateInterpolator
            r1.<init>()
            r11.f5190 = r1
            r1 = 2
            float[] r2 = new float[r1]
            r2 = {x0090: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r11.f5193 = r2
            float[] r3 = new float[r1]
            r3 = {x0098: FILL_ARRAY_DATA , data: [2139095039, 2139095039} // fill-array
            r11.f5194 = r3
            float[] r4 = new float[r1]
            r4 = {x00a0: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r11.f5197 = r4
            float[] r5 = new float[r1]
            r5 = {x00a8: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            r11.f5198 = r5
            float[] r1 = new float[r1]
            r1 = {x00b0: FILL_ARRAY_DATA , data: [2139095039, 2139095039} // fill-array
            r11.f5199 = r1
            r11.f5191 = r12
            android.content.res.Resources r6 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            r7 = 1153753088(0x44c4e000, float:1575.0)
            float r7 = r7 * r6
            r8 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 + r8
            int r7 = (int) r7
            r9 = 1134395392(0x439d8000, float:315.0)
            float r6 = r6 * r9
            float r6 = r6 + r8
            int r6 = (int) r6
            float r7 = (float) r7
            r8 = 1148846080(0x447a0000, float:1000.0)
            float r7 = r7 / r8
            r9 = 0
            r1[r9] = r7
            r10 = 1
            r1[r10] = r7
            float r1 = (float) r6
            float r1 = r1 / r8
            r5[r9] = r1
            r5[r10] = r1
            r11.f5195 = r10
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3[r9] = r1
            r3[r10] = r1
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            r2[r9] = r1
            r2[r10] = r1
            r1 = 981668463(0x3a83126f, float:0.001)
            r4[r9] = r1
            r4[r10] = r1
            int r1 = p000.iu0.f5188
            r11.f5196 = r1
            r1 = 500(0x1f4, float:7.0E-43)
            r0.f10616 = r1
            r0.f10617 = r1
            r11.f5205 = r12
            return
    }

    /* JADX INFO: renamed from: β */
    public static float m2800(float r1, float r2, float r3) {
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L5
            return r3
        L5:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto La
            return r2
        La:
            return r1
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
            r7 = this;
            boolean r0 = r7.f5204
            r1 = 0
            if (r0 != 0) goto L7
            goto L7c
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L7c
        L17:
            r7.m2803()
            return r1
        L1b:
            r7.f5202 = r2
            r7.f5200 = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.f5191
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.m2801(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.m2801(r9, r8, r3, r2)
            u7 r9 = r7.f5189
            r9.f10618 = r0
            r9.f10619 = r8
            boolean r8 = r7.f5203
            if (r8 != 0) goto L7c
            boolean r8 = r7.m2804()
            if (r8 == 0) goto L7c
            d1 r8 = r7.f5192
            if (r8 != 0) goto L60
            d1 r8 = new d1
            r8.<init>(r2, r7)
            r7.f5192 = r8
        L60:
            r7.f5203 = r2
            r7.f5201 = r2
            boolean r8 = r7.f5200
            if (r8 != 0) goto L75
            int r8 = r7.f5196
            if (r8 <= 0) goto L75
            d1 r9 = r7.f5192
            long r5 = (long) r8
            java.util.WeakHashMap r8 = p000.b92.f1572
            r4.postOnAnimationDelayed(r9, r5)
            goto L7a
        L75:
            d1 r8 = r7.f5192
            r8.run()
        L7a:
            r7.f5200 = r2
        L7c:
            return r1
    }

    /* JADX INFO: renamed from: α */
    public final float m2801(float r4, float r5, float r6, int r7) {
            r3 = this;
            float[] r0 = r3.f5193
            r0 = r0[r7]
            float[] r1 = r3.f5194
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = m2800(r0, r2, r1)
            float r1 = r3.m2802(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.m2802(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f5190
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = m2800(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            return r2
        L3c:
            float[] r0 = r3.f5197
            r0 = r0[r7]
            float[] r1 = r3.f5198
            r1 = r1[r7]
            float[] r3 = r3.f5199
            r3 = r3[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r3 = m2800(r4, r1, r3)
            return r3
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r3 = m2800(r4, r1, r3)
            float r3 = -r3
            return r3
    }

    /* JADX INFO: renamed from: γ */
    public final float m2802(float r6, float r7) {
            r5 = this;
            r0 = 0
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 != 0) goto L6
            goto L2c
        L6:
            r1 = 1
            int r2 = r5.f5195
            if (r2 == 0) goto L18
            if (r2 == r1) goto L18
            r5 = 2
            if (r2 == r5) goto L11
            goto L2c
        L11:
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 >= 0) goto L2c
            float r5 = -r7
            float r6 = r6 / r5
            return r6
        L18:
            int r3 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r3 >= 0) goto L2c
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r3 < 0) goto L25
            float r6 = r6 / r7
            float r4 = r4 - r6
            return r4
        L25:
            boolean r5 = r5.f5203
            if (r5 == 0) goto L2c
            if (r2 != r1) goto L2c
            return r4
        L2c:
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public final void m2803() {
            r6 = this;
            boolean r0 = r6.f5201
            r1 = 0
            if (r0 == 0) goto L8
            r6.f5203 = r1
            return
        L8:
            long r2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            u7 r6 = r6.f5189
            long r4 = r6.f10620
            long r4 = r2 - r4
            int r0 = (int) r4
            int r4 = r6.f10617
            if (r0 <= r4) goto L19
            r1 = r4
            goto L1d
        L19:
            if (r0 >= 0) goto L1c
            goto L1d
        L1c:
            r1 = r0
        L1d:
            r6.f10624 = r1
            float r0 = r6.m5791(r2)
            r6.f10623 = r0
            r6.f10622 = r2
            return
    }

    /* JADX INFO: renamed from: ε */
    public final boolean m2804() {
            r7 = this;
            u7 r0 = r7.f5189
            float r1 = r0.f10619
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f10618
            java.lang.Math.abs(r0)
            r0 = 0
            if (r1 == 0) goto L4a
            android.widget.ListView r7 = r7.f5205
            int r2 = r7.getCount()
            if (r2 != 0) goto L1b
            goto L4a
        L1b:
            int r3 = r7.getChildCount()
            int r4 = r7.getFirstVisiblePosition()
            int r5 = r4 + r3
            r6 = 1
            if (r1 <= 0) goto L3a
            if (r5 < r2) goto L49
            int r3 = r3 - r6
            android.view.View r1 = r7.getChildAt(r3)
            int r1 = r1.getBottom()
            int r7 = r7.getHeight()
            if (r1 > r7) goto L49
            goto L4a
        L3a:
            if (r1 >= 0) goto L4a
            if (r4 > 0) goto L49
            android.view.View r7 = r7.getChildAt(r0)
            int r7 = r7.getTop()
            if (r7 < 0) goto L49
            goto L4a
        L49:
            return r6
        L4a:
            return r0
    }
}
