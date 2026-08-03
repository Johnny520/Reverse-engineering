package p000;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"ViewConstructor"})
public final class v8 extends android.widget.FrameLayout {

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public static final /* synthetic */ int f1099 = 0;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final p000.f3<p000.vb> f1100;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean f1101;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean f1102;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final boolean f1103;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public float f1104;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public float f1105;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public int f1106;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public int f1107;

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public int f1108;

    public v8(android.app.Activity r6, p000.f3 r7) {
            r5 = this;
            r0 = 8
            byte[] r0 = new byte[r0]
            r0 = {x00b4: FILL_ARRAY_DATA , data: [-53, -80, 18, -120, -113, -95, -34, -121} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x00bc: FILL_ARRAY_DATA , data: [-90, -13, 125, -26, -5, -60} // fill-array
            p000.oa.m332(r0, r2)
            r5.<init>(r6)
            r5.f1100 = r7
            r6 = 1
            r7 = 1109393408(0x42200000, float:40.0)
            float r7 = p000.c4.m107(r6, r7)
            int r7 = (int) r7
            int r0 = r7 / 2
            int r2 = p000.ya.f1213
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            r4 = 0
            r3.setShape(r4)
            r3.setGradientType(r4)
            float r0 = (float) r0
            r3.setCornerRadius(r0)
            r3.setColor(r2)
            r5.setBackground(r3)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r7, r7)
            r5.setLayoutParams(r0)
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r2 = r5.getContext()
            r0.<init>(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -2
            r2.<init>(r3, r3)
            r3 = 17
            r2.gravity = r3
            r0.setLayoutParams(r2)
            r2 = 1099956224(0x41900000, float:18.0)
            r0.setTextSize(r2)
            r2 = 3
            byte[] r2 = new byte[r2]
            r2 = {x00c4: FILL_ARRAY_DATA , data: [5, 126, 119} // fill-array
            byte[] r1 = new byte[r1]
            r1 = {x00ca: FILL_ARRAY_DATA , data: [-30, -14, -35, 62, -32, -41} // fill-array
            java.lang.String r1 = p000.oa.m332(r2, r1)
            r0.setText(r1)
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT_BOLD
            r0.setTypeface(r1)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.setTextColor(r1)
            r5.addView(r0)
            ۟.q1 r0 = new ۟.q1
            r1 = 7
            r0.<init>(r1, r5)
            r5.setOnClickListener(r0)
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            int r0 = r0 - r7
            float r7 = (float) r0
            r5.setX(r7)
            android.content.res.Resources r7 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            r0 = 1128792064(0x43480000, float:200.0)
            float r7 = android.util.TypedValue.applyDimension(r6, r0, r7)
            int r7 = (int) r7
            float r7 = (float) r7
            r5.setY(r7)
            r7 = 4660(0x1234, float:6.53E-42)
            r5.setId(r7)
            r5.f1101 = r6
            r5.f1102 = r6
            r5.f1103 = r6
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            r0 = 5
            byte[] r0 = new byte[r0]
            r0 = {x0018: FILL_ARRAY_DATA , data: [-96, -21, 75, 79, -83} // fill-array
            r1 = 6
            byte[] r1 = new byte[r1]
            r1 = {x0020: FILL_ARRAY_DATA , data: [-59, -99, 46, 33, -39, 0} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m189(r0, r3)
            super.dispatchTouchEvent(r3)
            r3 = 1
            return r3
    }

    public final p000.f3<p000.vb> getClickCallback() {
            r1 = this;
            ۟.f3<۟.vb> r0 = r1.f1100
            return r0
    }

    @Override // android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
            r11 = this;
            r0 = 2
            byte[] r1 = new byte[r0]
            r1 = {x0116: FILL_ARRAY_DATA , data: [-19, -30} // fill-array
            r2 = 6
            byte[] r2 = new byte[r2]
            r2 = {x011c: FILL_ARRAY_DATA , data: [-120, -108, -7, 50, 9, 96} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r2)
            p000.h4.m189(r1, r12)
            boolean r1 = r11.f1103
            if (r1 == 0) goto L10c
            float r1 = r12.getRawX()
            float r2 = r12.getRawY()
            int r3 = r12.getAction()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto Le3
            r6 = 0
            if (r3 == r5) goto L9f
            if (r3 == r0) goto L2e
            goto L10c
        L2e:
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L10c
            int r0 = r11.f1106
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L10c
            int r0 = r11.f1108
            float r3 = (float) r0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 < 0) goto L10c
            int r3 = r11.f1107
            int r3 = r3 + r0
            float r0 = (float) r3
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L10c
            float r0 = r11.f1104
            float r0 = r1 - r0
            float r3 = r11.f1105
            float r3 = r2 - r3
            boolean r7 = r11.f1101
            if (r7 != 0) goto L67
            float r7 = r0 * r0
            float r8 = r3 * r3
            float r8 = r8 + r7
            double r7 = (double) r8
            double r7 = java.lang.Math.sqrt(r7)
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L65
            r4 = r5
        L65:
            r11.f1101 = r4
        L67:
            float r4 = r11.getX()
            float r5 = r11.getY()
            float r4 = r4 + r0
            float r5 = r5 + r3
            int r0 = r11.f1106
            int r3 = r11.getWidth()
            int r0 = r0 - r3
            float r0 = (float) r0
            int r3 = r11.f1107
            int r7 = r11.getHeight()
            int r3 = r3 - r7
            float r3 = (float) r3
            int r7 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r7 >= 0) goto L87
            r0 = r6
            goto L8b
        L87:
            float r0 = java.lang.Math.min(r4, r0)
        L8b:
            int r4 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r4 >= 0) goto L90
            goto L94
        L90:
            float r6 = java.lang.Math.min(r5, r3)
        L94:
            r11.setX(r0)
            r11.setY(r6)
            r11.f1104 = r1
            r11.f1105 = r2
            goto L10c
        L9f:
            boolean r0 = r11.f1102
            if (r0 == 0) goto L10c
            boolean r0 = r11.f1101
            if (r0 == 0) goto L10c
            int r0 = r11.f1106
            int r1 = r0 >> 1
            float r1 = (float) r1
            float r2 = r11.f1104
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            r2 = 500(0x1f4, double:2.47E-321)
            if (r1 > 0) goto Lc0
            r11.f1104 = r6
            android.view.ViewPropertyAnimator r0 = r11.animate()
            android.view.animation.BounceInterpolator r1 = new android.view.animation.BounceInterpolator
            r1.<init>()
            goto Ld1
        Lc0:
            int r1 = r11.getWidth()
            int r0 = r0 - r1
            float r0 = (float) r0
            r11.f1104 = r0
            android.view.ViewPropertyAnimator r0 = r11.animate()
            android.view.animation.BounceInterpolator r1 = new android.view.animation.BounceInterpolator
            r1.<init>()
        Ld1:
            android.view.ViewPropertyAnimator r0 = r0.setInterpolator(r1)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r2)
            float r1 = r11.f1104
            android.view.ViewPropertyAnimator r0 = r0.x(r1)
            r0.start()
            goto L10c
        Le3:
            r11.f1101 = r4
            r11.f1104 = r1
            r11.f1105 = r2
            android.view.ViewParent r1 = r11.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto Lf4
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto Lf5
        Lf4:
            r1 = 0
        Lf5:
            if (r1 == 0) goto L10c
            int[] r0 = new int[r0]
            r1.getLocationInWindow(r0)
            int r2 = r1.getMeasuredHeight()
            r11.f1107 = r2
            int r1 = r1.getMeasuredWidth()
            r11.f1106 = r1
            r0 = r0[r5]
            r11.f1108 = r0
        L10c:
            boolean r0 = r11.f1101
            if (r0 == 0) goto L111
            goto L115
        L111:
            boolean r0 = super.onTouchEvent(r12)
        L115:
            return r0
    }
}
