package com.example.dyhelper.hook;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
final class FeedInfoBarHook$NeonTextView extends android.widget.TextView {

    /* JADX INFO: renamed from: ε */
    public boolean f2248;

    /* JADX INFO: renamed from: ζ */
    public int f2249;

    /* JADX INFO: renamed from: η */
    public int f2250;

    /* JADX INFO: renamed from: θ */
    public boolean f2251;

    /* JADX INFO: renamed from: ι */
    public boolean f2252;

    /* JADX INFO: renamed from: κ */
    public float f2253;

    /* JADX INFO: renamed from: λ */
    public final int[] f2254;

    /* JADX INFO: renamed from: μ */
    public final float[] f2255;

    /* JADX INFO: renamed from: ν */
    public final android.graphics.Matrix f2256;

    /* JADX INFO: renamed from: ξ */
    public android.graphics.LinearGradient f2257;

    /* JADX INFO: renamed from: ο */
    public int f2258;

    /* JADX INFO: renamed from: π */
    public java.lang.ref.WeakReference f2259;

    public FeedInfoBarHook$NeonTextView(android.content.Context r1) {
            r0 = this;
            r1.getClass()
            r0.<init>(r1)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.f2250 = r1
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.f2253 = r1
            r1 = 8
            int[] r1 = new int[r1]
            r0.f2254 = r1
            r1 = 3
            float[] r1 = new float[r1]
            r0.f2255 = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0.f2256 = r1
            r1 = -1
            r0.f2258 = r1
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m1347(com.example.dyhelper.hook.FeedInfoBarHook$NeonTextView r5, float r6) {
            int r0 = r5.f2249
            r1 = 1
            if (r0 == r1) goto L3e
            r2 = 2
            if (r0 == r2) goto L9
            return
        L9:
            float[] r0 = r5.f2255
            r3 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 % r3
            r4 = 1135869952(0x43b40000, float:360.0)
            float r6 = r6 * r4
            r4 = 0
            r0[r4] = r6
            r6 = 1061662228(0x3f47ae14, float:0.78)
            r0[r1] = r6
            r0[r2] = r3
            int r6 = android.graphics.Color.HSVToColor(r0)
            android.text.TextPaint r0 = r5.getPaint()
            r1 = 0
            r0.setShader(r1)
            int r0 = r5.getCurrentTextColor()
            if (r0 == r6) goto L30
            r5.setTextColor(r6)
        L30:
            r0 = 1077936128(0x40400000, float:3.0)
            r1 = 0
            r5.setShadowLayer(r0, r1, r1, r6)
            r5.postInvalidateOnAnimation()     // Catch: java.lang.Throwable -> L3a
            return
        L3a:
            r5.invalidate()
            return
        L3e:
            r5.m1348(r6, r1)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            java.util.WeakHashMap r0 = p000.g20.f4214
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.put(r2, r1)
            boolean r0 = p000.g20.f4215
            if (r0 != 0) goto L18
            r0 = 1
            p000.g20.f4215 = r0
            android.os.Handler r0 = p000.g20.f4213
            com.example.dyhelper.hook.β r1 = p000.g20.f4216
            r0.post(r1)
        L18:
            r2.m1352()
            int r0 = r2.f2249
            if (r0 == 0) goto L22
            r2.m1350()
        L22:
            return
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            android.os.Handler r0 = p000.g20.f4213
            java.util.WeakHashMap r0 = p000.g20.f4214
            r0.remove(r2)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            android.os.Handler r0 = p000.g20.f4213
            com.example.dyhelper.hook.β r1 = p000.g20.f4216
            r0.removeCallbacks(r1)
            r0 = 0
            p000.g20.f4215 = r0
        L1a:
            r2.m1351()
            return
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(android.graphics.Canvas r4) {
            r3 = this;
            r4.getClass()
            int r0 = r3.f2249
            if (r0 == 0) goto L3b
            int r0 = r3.getWidth()
            if (r0 <= 0) goto L3b
            int r0 = r3.f2249
            r1 = 1
            if (r0 != r1) goto L22
            android.text.TextPaint r0 = r3.getPaint()
            android.graphics.Shader r0 = r0.getShader()
            if (r0 != 0) goto L22
            float r0 = p000.h20.f4538
            r2 = 0
            r3.m1348(r0, r2)
        L22:
            boolean r0 = r3.f2248
            if (r0 != 0) goto L3b
            boolean r0 = r3.f2252
            if (r0 != 0) goto L3b
            boolean r0 = r3.isAttachedToWindow()
            if (r0 == 0) goto L3b
            r3.f2252 = r1
            com.example.dyhelper.hook.α r0 = new com.example.dyhelper.hook.α
            r1 = 1
            r0.<init>(r3, r1)
            r3.post(r0)
        L3b:
            super.onDraw(r4)
            return
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            if (r1 == r3) goto Lb
            r2 = 0
            r0.f2257 = r2
            r2 = -1
            r0.f2258 = r2
        Lb:
            int r2 = r0.f2249
            if (r2 == 0) goto L1e
            if (r1 <= 0) goto L1e
            boolean r1 = r0.f2248
            if (r1 != 0) goto L19
            r0.m1350()
            return
        L19:
            float r1 = p000.h20.f4538
            m1347(r0, r1)
        L1e:
            return
    }

    @Override // android.widget.TextView
    public final void onTextChanged(java.lang.CharSequence r1, int r2, int r3, int r4) {
            r0 = this;
            super.onTextChanged(r1, r2, r3, r4)
            int r1 = r0.f2249
            if (r1 == 0) goto L10
            com.example.dyhelper.hook.α r1 = new com.example.dyhelper.hook.α
            r2 = 0
            r1.<init>(r0, r2)
            r0.post(r1)
        L10:
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m1348(float r13, boolean r14) {
            r12 = this;
            int r0 = r12.getWidth()
            float r4 = (float) r0
            r0 = 0
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 > 0) goto Lc
            goto L8c
        Lc:
            android.graphics.LinearGradient r1 = r12.f2257
            r9 = 1
            r10 = 0
            int[] r11 = r12.f2254
            if (r1 == 0) goto L1c
            int r2 = r12.f2258
            int r3 = r12.getWidth()
            if (r2 == r3) goto L54
        L1c:
            int r1 = r11.length
            r2 = r10
        L1e:
            if (r2 >= r1) goto L3f
            float r3 = (float) r2
            int r5 = r11.length
            float r5 = (float) r5
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 - r6
            float r3 = r3 / r5
            r5 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 * r5
            float[] r5 = r12.f2255
            r5[r10] = r3
            r3 = 1061662228(0x3f47ae14, float:0.78)
            r5[r9] = r3
            r3 = 2
            r5[r3] = r6
            int r3 = android.graphics.Color.HSVToColor(r5)
            r11[r2] = r3
            int r2 = r2 + 1
            goto L1e
        L3f:
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            r7 = 0
            android.graphics.Shader$TileMode r8 = android.graphics.Shader.TileMode.REPEAT
            r2 = 0
            r3 = 0
            r5 = 0
            int[] r6 = r12.f2254
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r12.f2257 = r1
            int r2 = r12.getWidth()
            r12.f2258 = r2
        L54:
            android.graphics.Matrix r2 = r12.f2256
            r2.reset()
            float r4 = r4 * r13
            r2.setTranslate(r4, r0)
            r1.setLocalMatrix(r2)
            android.text.TextPaint r2 = r12.getPaint()
            android.graphics.Shader r2 = r2.getShader()
            if (r2 == r1) goto L71
            android.text.TextPaint r2 = r12.getPaint()
            r2.setShader(r1)
        L71:
            int r1 = r11.length
            int r1 = r1 - r9
            float r1 = (float) r1
            float r13 = r13 * r1
            int r13 = (int) r13
            int r1 = r11.length
            int r1 = r1 - r9
            int r13 = p000.j81.m2906(r13, r10, r1)
            r1 = 1077936128(0x40400000, float:3.0)
            r13 = r11[r13]
            r12.setShadowLayer(r1, r0, r0, r13)
            if (r14 == 0) goto L8c
            r12.postInvalidateOnAnimation()     // Catch: java.lang.Throwable -> L89
            return
        L89:
            r12.invalidate()
        L8c:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m1349(boolean r2) {
            r1 = this;
            r1.f2251 = r2
            if (r2 == 0) goto L8
            r1.m1352()
            return
        L8:
            int r2 = r1.getVisibility()
            r0 = 4
            if (r2 == r0) goto L12
            r1.setVisibility(r0)
        L12:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m1350() {
            r3 = this;
            int r0 = r3.f2249
            r1 = 1
            if (r0 != 0) goto L7
            r3.f2249 = r1
        L7:
            boolean r0 = r3.f2248
            if (r0 != 0) goto L21
            r3.f2248 = r1
            java.util.WeakHashMap r0 = p000.h20.f4536
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.put(r3, r2)
            boolean r0 = p000.h20.f4537
            if (r0 != 0) goto L21
            p000.h20.f4537 = r1
            android.os.Handler r0 = p000.h20.f4535
            com.example.dyhelper.hook.β r1 = p000.h20.f4539
            r0.post(r1)
        L21:
            int r0 = r3.getWidth()
            if (r0 <= 0) goto L2c
            float r0 = p000.h20.f4538
            m1347(r3, r0)
        L2c:
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m1351() {
            r3 = this;
            boolean r0 = r3.f2248
            if (r0 != 0) goto Lf
            android.text.TextPaint r0 = r3.getPaint()
            android.graphics.Shader r0 = r0.getShader()
            if (r0 != 0) goto Lf
            return
        Lf:
            r0 = 0
            r3.f2248 = r0
            java.util.WeakHashMap r1 = p000.h20.f4536
            r1.remove(r3)
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L26
            android.os.Handler r1 = p000.h20.f4535
            com.example.dyhelper.hook.β r2 = p000.h20.f4539
            r1.removeCallbacks(r2)
            p000.h20.f4537 = r0
        L26:
            android.text.TextPaint r1 = r3.getPaint()
            r2 = 0
            r1.setShader(r2)
            r1 = 0
            r3.setShadowLayer(r1, r1, r1, r0)
            r3.invalidate()
            return
    }

    /* JADX INFO: renamed from: ζ */
    public final void m1352() {
            r8 = this;
            java.lang.ref.WeakReference r0 = r8.f2259
            if (r0 == 0) goto L93
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto Le
            goto L93
        Le:
            boolean r1 = r8.f2251
            r2 = 4
            r3 = 0
            if (r1 == 0) goto L7c
            boolean r1 = r0.isShown()
            if (r1 == 0) goto L7c
            int r1 = r0.getVisibility()
            if (r1 == 0) goto L21
            goto L7c
        L21:
            float r1 = r0.getAlpha()
            android.view.ViewParent r0 = r0.getParent()
            boolean r4 = r0 instanceof android.view.View
            r5 = 0
            if (r4 == 0) goto L31
            android.view.View r0 = (android.view.View) r0
            goto L32
        L31:
            r0 = r5
        L32:
            r4 = 0
            r6 = r4
        L34:
            if (r0 == 0) goto L54
            r7 = 3
            if (r6 >= r7) goto L54
            int r7 = r0.getVisibility()
            if (r7 == 0) goto L40
            goto L55
        L40:
            float r7 = r0.getAlpha()
            float r1 = r1 * r7
            android.view.ViewParent r0 = r0.getParent()
            boolean r7 = r0 instanceof android.view.View
            if (r7 == 0) goto L50
            android.view.View r0 = (android.view.View) r0
            goto L51
        L50:
            r0 = r5
        L51:
            int r6 = r6 + 1
            goto L34
        L54:
            r3 = r1
        L55:
            float r0 = r8.f2253
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L5c
            goto L93
        L5c:
            float r0 = r8.getAlpha()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L65
            goto L68
        L65:
            r8.setAlpha(r3)
        L68:
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L70
            r2 = r4
        L70:
            int r0 = r8.getVisibility()
            if (r0 == r2) goto L79
            r8.setVisibility(r2)
        L79:
            r8.f2253 = r3
            return
        L7c:
            int r0 = r8.getVisibility()
            if (r0 == r2) goto L85
            r8.setVisibility(r2)
        L85:
            float r0 = r8.getAlpha()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L8e
            goto L91
        L8e:
            r8.setAlpha(r3)
        L91:
            r8.f2253 = r3
        L93:
            return
    }
}
