package ya;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f22344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ya.b f22345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f22346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f22347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.view.View f22348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Float f22349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f22350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f22351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f22352i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22353j;

    public a(android.view.ViewGroup r11, ya.b r12, float r13, float r14) {
            r10 = this;
            r10.<init>()
            r10.f22344a = r11
            r10.f22345b = r12
            r10.f22346c = r13
            r10.f22347d = r14
            r13 = 2
            int[] r13 = new int[r13]
            r11.getLocationOnScreen(r13)
            int r14 = r12.f22358e
            android.graphics.drawable.Drawable r0 = r12.f22370q
            android.view.View r1 = r12.f22354a
            android.view.View r2 = r12.f22355b
            int r3 = r12.f22359f
            int r4 = r12.f22356c
            r5 = 0
            r5 = r13[r5]
            int r4 = r4 - r5
            int r5 = r12.f22357d
            r6 = 1
            r13 = r13[r6]
            int r5 = r5 - r13
            java.lang.CharSequence r13 = r12.f22360g
            if (r13 == 0) goto L6a
            android.widget.TextView r7 = new android.widget.TextView
            android.content.Context r8 = r1.getContext()
            r7.<init>(r8)
            r7.setText(r13)
            int r13 = r12.f22361h
            r7.setTextColor(r13)
            float r13 = r12.f22362i
            android.content.res.Resources r8 = r7.getResources()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.scaledDensity
            float r13 = r13 / r8
            r7.setTextSize(r13)
            android.graphics.Typeface r13 = r12.f22363j
            r7.setTypeface(r13)
            int r13 = r12.f22364k
            r7.setGravity(r13)
            boolean r13 = r12.f22365l
            r7.setIncludeFontPadding(r13)
            int r13 = r12.f22366m
            int r8 = r12.f22367n
            int r9 = r12.f22368o
            int r12 = r12.f22369p
            r7.setPadding(r13, r8, r9, r12)
            r7.setBackground(r0)
            goto L76
        L6a:
            android.view.View r7 = new android.view.View
            android.content.Context r12 = r1.getContext()
            r7.<init>(r12)
            r7.setBackground(r0)
        L76:
            if (r2 == 0) goto L7d
            float r12 = r2.getAlpha()
            goto L7f
        L7d:
            r12 = 1065353216(0x3f800000, float:1.0)
        L7f:
            r7.setAlpha(r12)
            r12 = 1073741824(0x40000000, float:2.0)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r12)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r12)
            r7.measure(r13, r12)
            int r14 = r14 + r4
            int r3 = r3 + r5
            r7.layout(r4, r5, r14, r3)
            r12 = 0
            if (r2 == 0) goto L9c
            float r13 = r2.getTranslationX()
            goto L9d
        L9c:
            r13 = r12
        L9d:
            r7.setTranslationX(r13)
            if (r2 == 0) goto La7
            float r13 = r2.getTranslationY()
            goto La8
        La7:
            r13 = r12
        La8:
            r7.setTranslationY(r13)
            if (r2 == 0) goto Lb2
            float r13 = r2.getElevation()
            goto Lb3
        Lb2:
            r13 = r12
        Lb3:
            android.content.res.Resources r14 = r1.getResources()
            android.util.DisplayMetrics r14 = r14.getDisplayMetrics()
            r0 = 1090519040(0x41000000, float:8.0)
            float r14 = android.util.TypedValue.applyDimension(r6, r0, r14)
            int r14 = (int) r14
            float r14 = (float) r14
            float r13 = r13 + r14
            r7.setElevation(r13)
            r10.f22348e = r7
            if (r2 == 0) goto Ld4
            float r13 = r2.getAlpha()
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            goto Ld5
        Ld4:
            r13 = 0
        Ld5:
            r10.f22349f = r13
            float r13 = r7.getTranslationX()
            r10.f22350g = r13
            float r13 = r7.getTranslationY()
            r10.f22351h = r13
            if (r2 == 0) goto Le8
            r2.setAlpha(r12)
        Le8:
            android.view.ViewGroupOverlay r11 = r11.getOverlay()
            r11.add(r7)
            return
    }

    public final void a() {
            r2 = this;
            boolean r0 = r2.f22353j
            if (r0 == 0) goto L5
            goto L24
        L5:
            r0 = 1
            r2.f22353j = r0
            android.view.ViewGroup r0 = r2.f22344a     // Catch: java.lang.Throwable -> L13
            android.view.ViewGroupOverlay r0 = r0.getOverlay()     // Catch: java.lang.Throwable -> L13
            android.view.View r1 = r2.f22348e     // Catch: java.lang.Throwable -> L13
            r0.remove(r1)     // Catch: java.lang.Throwable -> L13
        L13:
            java.lang.Float r0 = r2.f22349f
            if (r0 == 0) goto L24
            ya.b r1 = r2.f22345b
            android.view.View r1 = r1.f22355b
            if (r1 == 0) goto L24
            float r0 = r0.floatValue()
            r1.setAlpha(r0)
        L24:
            return
    }

    public final void b(float r2, float r3) {
            r1 = this;
            float r0 = r1.f22346c
            float r2 = r2 - r0
            float r0 = r1.f22347d
            float r3 = r3 - r0
            float r0 = r1.f22350g
            float r0 = r0 + r2
            android.view.View r2 = r1.f22348e
            r2.setTranslationX(r0)
            float r0 = r1.f22351h
            float r0 = r0 + r3
            r2.setTranslationY(r0)
            boolean r2 = r1.d()
            if (r2 == 0) goto L29
            boolean r2 = r1.f22352i
            if (r2 != 0) goto L29
            ya.b r2 = r1.f22345b
            android.view.View r2 = r2.f22354a
            r3 = 4
            r2.performHapticFeedback(r3)
            r2 = 1
            r1.f22352i = r2
        L29:
            return
    }

    public final void c() {
            r3 = this;
            android.view.View r0 = r3.f22348e
            android.view.ViewPropertyAnimator r0 = r0.animate()
            float r1 = r3.f22350g
            android.view.ViewPropertyAnimator r0 = r0.translationX(r1)
            float r1 = r3.f22351h
            android.view.ViewPropertyAnimator r0 = r0.translationY(r1)
            r1 = 120(0x78, double:5.93E-322)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            wb.cr r1 = new wb.cr
            r2 = 8
            r1.<init>(r3, r2)
            android.view.ViewPropertyAnimator r0 = r0.withEndAction(r1)
            r0.start()
            ya.b r0 = r3.f22345b
            android.view.View r0 = r0.f22355b
            if (r0 == 0) goto L36
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L36
            r1 = 0
            r0.requestDisallowInterceptTouchEvent(r1)
        L36:
            return
    }

    public final boolean d() {
            r5 = this;
            android.view.View r0 = r5.f22348e
            float r1 = r0.getTranslationY()
            float r2 = r5.f22351h
            float r1 = r1 - r2
            float r0 = r0.getTranslationX()
            float r2 = r5.f22350g
            float r0 = r0 - r2
            ya.b r2 = r5.f22345b
            android.view.View r2 = r2.f22354a
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            r3 = 1
            r4 = 1109917696(0x42280000, float:42.0)
            float r2 = android.util.TypedValue.applyDimension(r3, r4, r2)
            int r2 = (int) r2
            int r2 = -r2
            float r2 = (float) r2
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 > 0) goto L3b
            float r1 = java.lang.Math.abs(r1)
            float r0 = java.lang.Math.abs(r0)
            r2 = 1055286886(0x3ee66666, float:0.45)
            float r0 = r0 * r2
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L3b
            return r3
        L3b:
            r0 = 0
            return r0
    }
}
