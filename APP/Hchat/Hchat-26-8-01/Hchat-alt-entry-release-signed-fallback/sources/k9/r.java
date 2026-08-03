package k9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k9.r f7530a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final android.os.Handler f7531b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static android.content.SharedPreferences f7532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile boolean f7533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile boolean f7534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile boolean f7535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static java.lang.ref.WeakReference f7536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static java.lang.ref.WeakReference f7537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static java.lang.ref.WeakReference f7538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static java.lang.ref.WeakReference f7539j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k9.k f7540k = null;

    static {
            k9.r r0 = new k9.r
            r0.<init>()
            k9.r.f7530a = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            k9.r.f7531b = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            k9.r.f7536g = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            k9.r.f7537h = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            k9.r.f7538i = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            k9.r.f7539j = r0
            k9.k r0 = new k9.k
            r0.<init>()
            k9.r.f7540k = r0
            return
    }

    public static android.graphics.drawable.RippleDrawable a(android.content.Context r7, boolean r8, int[] r9) {
            r0 = -167772161(0xfffffffff5ffffff, float:-6.4903707E32)
            r1 = -231195840(0xfffffffff2383b40, float:-3.6490797E30)
            r2 = 0
            r3 = 0
            r4 = 1
            if (r8 == 0) goto L28
            if (r9 == 0) goto Le
            goto L37
        Le:
            boolean r9 = g(r7)
            if (r9 == 0) goto L15
            r0 = r1
        L15:
            android.content.SharedPreferences r9 = k9.r.f7532c
            if (r9 == 0) goto L22
            java.lang.String r1 = "action_color"
            java.lang.String r5 = ""
            java.lang.String r9 = r9.getString(r1, r5)
            goto L23
        L22:
            r9 = r2
        L23:
            int[] r9 = k(r0, r9)
            goto L37
        L28:
            boolean r9 = g(r7)
            if (r9 == 0) goto L33
            int[] r9 = new int[r4]
            r9[r3] = r1
            goto L37
        L33:
            int[] r9 = new int[r4]
            r9[r3] = r0
        L37:
            int r0 = o(r9)
            android.graphics.drawable.GradientDrawable$Orientation r1 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            int r5 = r9.length
            if (r5 <= r4) goto L42
            r5 = r4
            goto L43
        L42:
            r5 = r3
        L43:
            if (r5 == 0) goto L47
            r5 = r9
            goto L48
        L47:
            r5 = r2
        L48:
            android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
            r6.<init>(r1, r5)
            if (r8 == 0) goto L53
            r6.setShape(r4)
            goto L5d
        L53:
            r1 = 14
            int r1 = f(r7, r1)
            float r1 = (float) r1
            r6.setCornerRadius(r1)
        L5d:
            int r1 = r9.length
            if (r1 != r4) goto L65
            r9 = r9[r3]
            r6.setColor(r9)
        L65:
            int r7 = f(r7, r4)
            boolean r9 = h(r0)
            if (r9 == 0) goto L72
            r9 = 369098752(0x16000000, float:1.0339758E-25)
            goto L75
        L72:
            r9 = 620756991(0x24ffffff, float:1.11022296E-16)
        L75:
            r6.setStroke(r7, r9)
            if (r8 == 0) goto L86
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r2.setShape(r4)
            r7 = -1
            r2.setColor(r7)
        L86:
            android.graphics.drawable.RippleDrawable r7 = new android.graphics.drawable.RippleDrawable
            boolean r8 = h(r0)
            if (r8 == 0) goto L91
            r8 = 402653184(0x18000000, float:1.6543612E-24)
            goto L94
        L91:
            r8 = 687865855(0x28ffffff, float:2.8421708E-14)
        L94:
            android.content.res.ColorStateList r8 = android.content.res.ColorStateList.valueOf(r8)
            r7.<init>(r8, r6, r2)
            return r7
    }

    public static boolean b(android.content.Context r4, android.widget.FrameLayout.LayoutParams r5, int r6, int r7, int r8, int r9) {
            r0 = 0
            if (r6 <= 0) goto L4f
            if (r7 <= 0) goto L4f
            if (r8 <= 0) goto L4f
            if (r9 > 0) goto La
            goto L4f
        La:
            r1 = 8
            int r4 = f(r4, r1)
            int r6 = r6 - r8
            int r8 = r4 * 2
            int r6 = r6 - r8
            if (r6 >= 0) goto L17
            r6 = r0
        L17:
            int r7 = r7 - r9
            int r7 = r7 - r8
            if (r7 >= 0) goto L1c
            goto L1d
        L1c:
            r0 = r7
        L1d:
            android.content.SharedPreferences r7 = k9.r.f7532c
            r8 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r7 == 0) goto L2f
            java.lang.String r1 = "position_x"
            float r7 = r7.getFloat(r1, r9)
            float r7 = r9.e0.q(r7, r8, r9)
            goto L30
        L2f:
            r7 = r9
        L30:
            android.content.SharedPreferences r1 = k9.r.f7532c
            r2 = 1055622431(0x3eeb851f, float:0.46)
            if (r1 == 0) goto L41
            java.lang.String r3 = "position_y"
            float r1 = r1.getFloat(r3, r2)
            float r2 = r9.e0.q(r1, r8, r9)
        L41:
            float r6 = (float) r6
            float r6 = r6 * r7
            int r6 = (int) r6
            int r6 = r6 + r4
            r5.leftMargin = r6
            float r6 = (float) r0
            float r6 = r6 * r2
            int r6 = (int) r6
            int r4 = r4 + r6
            r5.topMargin = r4
            r4 = 1
            return r4
        L4f:
            return r0
    }

    public static void c(android.app.Activity r16) {
            r0 = r16
            boolean r1 = k9.r.f7533d
            if (r1 == 0) goto L1ef
            boolean r1 = q(r0)
            if (r1 != 0) goto Le
            goto L1ef
        Le:
            android.view.Window r1 = r0.getWindow()
            r2 = 0
            if (r1 == 0) goto L1a
            android.view.View r1 = r1.getDecorView()
            goto L1b
        L1a:
            r1 = r2
        L1b:
            boolean r3 = r1 instanceof android.view.ViewGroup
            if (r3 == 0) goto L23
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r12 = r1
            goto L24
        L23:
            r12 = r2
        L24:
            if (r12 == 0) goto L1ef
            java.lang.ref.WeakReference r1 = k9.r.f7537h
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            java.lang.ref.WeakReference r3 = k9.r.f7536g
            java.lang.Object r3 = r3.get()
            if (r3 != r0) goto L44
            if (r1 == 0) goto L3d
            android.view.ViewParent r3 = r1.getParent()
            goto L3e
        L3d:
            r3 = r2
        L3e:
            if (r3 != r12) goto L44
            r1.bringToFront()
            return
        L44:
            e(r2)
            android.content.SharedPreferences r1 = k9.r.f7532c
            r13 = 64
            r14 = 36
            java.lang.String r15 = "bubble_size"
            r3 = 44
            if (r1 == 0) goto L5c
            int r1 = r1.getInt(r15, r3)
            int r1 = r9.e0.r(r1, r14, r13)
            goto L5d
        L5c:
            r1 = r3
        L5d:
            android.content.SharedPreferences r4 = k9.r.f7532c
            if (r4 == 0) goto L6a
            java.lang.String r5 = "bubble_color"
            java.lang.String r6 = "#FFFFFF"
            java.lang.String r4 = r4.getString(r5, r6)
            goto L6b
        L6a:
            r4 = r2
        L6b:
            r5 = -1
            int[] r4 = k(r5, r4)
            int r6 = o(r4)
            android.widget.FrameLayout r7 = new android.widget.FrameLayout
            r7.<init>(r0)
            java.lang.String r8 = "Hchat:FloatingShortcut:Bubble"
            r7.setTag(r8)
            java.lang.String r8 = "展开或收起悬浮快捷菜单"
            r7.setContentDescription(r8)
            r8 = 1
            r7.setClickable(r8)
            r7.setFocusable(r8)
            r9 = 8
            int r9 = f(r0, r9)
            float r9 = (float) r9
            r7.setElevation(r9)
            int r9 = o(r4)
            android.graphics.drawable.GradientDrawable$Orientation r10 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            int r11 = r4.length
            if (r11 <= r8) goto L9f
            r11 = r4
            goto La0
        L9f:
            r11 = r2
        La0:
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>(r10, r11)
            r3.setShape(r8)
            int r10 = r4.length
            if (r10 != r8) goto Lb1
            r10 = 0
            r4 = r4[r10]
            r3.setColor(r4)
        Lb1:
            int r4 = f(r0, r8)
            boolean r9 = h(r9)
            r10 = 687865855(0x28ffffff, float:2.8421708E-14)
            r11 = 402653184(0x18000000, float:1.6543612E-24)
            if (r9 == 0) goto Lc2
            r9 = r11
            goto Lc3
        Lc2:
            r9 = r10
        Lc3:
            r3.setStroke(r4, r9)
            r7.setBackground(r3)
            boolean r3 = h(r6)
            if (r3 == 0) goto Ld0
            r10 = r11
        Ld0:
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r10)
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            r4.setShape(r8)
            r4.setColor(r5)
            android.graphics.drawable.RippleDrawable r9 = new android.graphics.drawable.RippleDrawable
            r9.<init>(r3, r2, r4)
            r7.setForeground(r9)
            r7.setClipToOutline(r8)
            android.widget.ImageView r3 = new android.widget.ImageView
            r3.<init>(r0)
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r3.setScaleType(r4)
            r3.setContentDescription(r2)
            r3.setImageTintList(r2)
            r3.clearColorFilter()
            float r1 = (float) r1
            r4 = 1042536202(0x3e23d70a, float:0.16)
            float r1 = r1 * r4
            int r1 = (int) r1
            r4 = 5
            if (r1 >= r4) goto L107
            r1 = r4
        L107:
            int r1 = f(r0, r1)
            r3.setPadding(r1, r1, r1, r1)
            boolean r1 = h(r6)
            if (r1 == 0) goto L118
            r1 = -14671580(0xffffffffff202124, float:-2.1284856E38)
            goto L119
        L118:
            r1 = r5
        L119:
            android.content.SharedPreferences r4 = k9.r.f7532c
            java.lang.String r6 = ""
            if (r4 == 0) goto L126
            java.lang.String r8 = "bubble_icon"
            java.lang.String r4 = r4.getString(r8, r6)
            goto L127
        L126:
            r4 = r2
        L127:
            if (r4 != 0) goto L12a
            r4 = r6
        L12a:
            android.content.SharedPreferences r8 = k9.r.f7532c
            if (r8 == 0) goto L134
            java.lang.String r2 = "bubble_dark_icon"
            java.lang.String r2 = r8.getString(r2, r6)
        L134:
            if (r2 != 0) goto L137
            goto L138
        L137:
            r6 = r2
        L138:
            boolean r2 = g(r0)
            if (r2 == 0) goto L145
            boolean r2 = og.m.t0(r6)
            if (r2 != 0) goto L145
            r4 = r6
        L145:
            android.graphics.drawable.BitmapDrawable r2 = i(r0, r4)
            if (r2 == 0) goto L14c
            goto L153
        L14c:
            k9.d r2 = new k9.d
            k9.c r4 = k9.c.f7479g
            r2.<init>(r4, r1)
        L153:
            r3.setImageDrawable(r2)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = 17
            r1.<init>(r5, r5, r2)
            r7.addView(r3, r1)
            k9.l r1 = new k9.l
            r2 = 0
            r1.<init>(r0, r12, r7, r2)
            r7.setOnClickListener(r1)
            android.content.Context r1 = r7.getContext()
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            int r11 = r1.getScaledTouchSlop()
            gg.r r4 = new gg.r
            r4.<init>()
            gg.r r5 = new gg.r
            r5.<init>()
            gg.s r6 = new gg.s
            r6.<init>()
            r1 = r7
            gg.s r7 = new gg.s
            r7.<init>()
            gg.s r8 = new gg.s
            r8.<init>()
            gg.s r9 = new gg.s
            r9.<init>()
            gg.q r10 = new gg.q
            r10.<init>()
            k9.m r3 = new k9.m
            r2 = r1
            r1 = 44
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r2.setOnTouchListener(r3)
            android.content.SharedPreferences r3 = k9.r.f7532c
            if (r3 == 0) goto L1b1
            int r1 = r3.getInt(r15, r1)
            int r3 = r9.e0.r(r1, r14, r13)
            goto L1b2
        L1b1:
            r3 = r1
        L1b2:
            int r4 = f(r0, r3)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r1.<init>(r4, r4, r3)
            r3 = r2
            int r2 = r12.getWidth()
            r5 = r3
            int r3 = r12.getHeight()
            r6 = r5
            r5 = r4
            boolean r2 = b(r0, r1, r2, r3, r4, r5)
            if (r2 != 0) goto L1d4
            r2 = 4
            r6.setVisibility(r2)
        L1d4:
            r12.addView(r6, r1)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            k9.r.f7536g = r1
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r6)
            k9.r.f7537h = r0
            a1.d r0 = new a1.d
            r1 = 23
            r0.<init>(r6, r1, r12)
            r6.post(r0)
        L1ef:
            return
    }

    public static void d(boolean r4) {
            java.lang.ref.WeakReference r0 = k9.r.f7539j
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            r1 = 0
            if (r0 == 0) goto L10
            android.view.ViewParent r2 = r0.getParent()
            goto L11
        L10:
            r2 = r1
        L11:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L18
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L19
        L18:
            r2 = r1
        L19:
            if (r2 == 0) goto L1e
            r2.removeView(r0)
        L1e:
            java.lang.ref.WeakReference r0 = k9.r.f7539j
            r0.clear()
            java.lang.ref.WeakReference r0 = k9.r.f7538i
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto La1
            android.view.ViewParent r2 = r0.getParent()
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L38
            r1 = r2
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L38:
            if (r4 == 0) goto L88
            if (r1 == 0) goto L88
            int r4 = r0.getVisibility()
            if (r4 == 0) goto L43
            goto L88
        L43:
            r4 = 0
            r0.setClickable(r4)
            android.view.ViewPropertyAnimator r4 = r0.animate()
            r4.cancel()
            android.view.ViewPropertyAnimator r4 = r0.animate()
            r1 = 0
            android.view.ViewPropertyAnimator r4 = r4.alpha(r1)
            r1 = 1063339950(0x3f6147ae, float:0.88)
            android.view.ViewPropertyAnimator r4 = r4.scaleX(r1)
            android.view.ViewPropertyAnimator r4 = r4.scaleY(r1)
            android.content.Context r1 = r0.getContext()
            r1.getClass()
            r2 = 8
            int r1 = f(r1, r2)
            float r1 = (float) r1
            android.view.ViewPropertyAnimator r4 = r4.translationY(r1)
            r1 = 140(0x8c, double:6.9E-322)
            android.view.ViewPropertyAnimator r4 = r4.setDuration(r1)
            g3.g r1 = new g3.g
            r2 = 1
            r1.<init>(r0, r2)
            android.view.ViewPropertyAnimator r4 = r4.withEndAction(r1)
            r4.start()
            return
        L88:
            android.view.ViewPropertyAnimator r4 = r0.animate()
            r4.cancel()
            if (r1 == 0) goto L94
            r1.removeView(r0)
        L94:
            java.lang.ref.WeakReference r4 = k9.r.f7538i
            java.lang.Object r4 = r4.get()
            if (r4 != r0) goto La1
            java.lang.ref.WeakReference r4 = k9.r.f7538i
            r4.clear()
        La1:
            return
    }

    public static void e(android.app.Activity r3) {
            java.lang.ref.WeakReference r0 = k9.r.f7536g
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r3 == 0) goto Ld
            if (r0 == r3) goto Ld
            return
        Ld:
            r3 = 0
            d(r3)
            java.lang.ref.WeakReference r3 = k9.r.f7537h
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            r0 = 0
            if (r3 == 0) goto L21
            android.view.ViewParent r1 = r3.getParent()
            goto L22
        L21:
            r1 = r0
        L22:
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L29
            r0 = r1
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L29:
            if (r0 == 0) goto L2e
            r0.removeView(r3)
        L2e:
            java.lang.ref.WeakReference r3 = k9.r.f7537h
            r3.clear()
            java.lang.ref.WeakReference r3 = k9.r.f7536g
            r3.clear()
            return
    }

    public static int f(android.content.Context r0, int r1) {
            float r1 = (float) r1
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    public static boolean g(android.content.Context r1) {
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.uiMode
            r1 = r1 & 48
            r0 = 32
            if (r1 != r0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public static boolean h(int r2) {
            int r0 = android.graphics.Color.red(r2)
            int r0 = r0 * 299
            int r1 = android.graphics.Color.green(r2)
            int r1 = r1 * 587
            int r1 = r1 + r0
            int r2 = android.graphics.Color.blue(r2)
            int r2 = r2 * 114
            int r2 = r2 + r1
            int r2 = r2 / 1000
            r0 = 160(0xa0, float:2.24E-43)
            if (r2 < r0) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public static android.graphics.drawable.BitmapDrawable i(android.content.Context r2, java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L3c
            boolean r1 = og.m.t0(r3)
            if (r1 != 0) goto La
            goto Lb
        La:
            r3 = r0
        Lb:
            if (r3 == 0) goto L3c
            java.io.File r1 = new java.io.File
            r1.<init>(r3)
            boolean r3 = r1.isFile()
            if (r3 != 0) goto L19
            goto L3c
        L19:
            java.lang.String r3 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L22
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r3)     // Catch: java.lang.Throwable -> L22
            goto L29
        L22:
            r3 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r3)
            r3 = r1
        L29:
            boolean r1 = r3 instanceof sf.f
            if (r1 == 0) goto L2f
            r3 = r0
        L2f:
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            if (r3 == 0) goto L3c
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r2 = r2.getResources()
            r0.<init>(r2, r3)
        L3c:
            return r0
    }

    public static int j(int r2, java.lang.String r3) {
            if (r3 == 0) goto L3b
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L3b
            int r0 = r3.length()
            if (r0 <= 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            r1 = 0
            if (r0 == 0) goto L19
            goto L1a
        L19:
            r3 = r1
        L1a:
            if (r3 == 0) goto L3b
            int r3 = android.graphics.Color.parseColor(r3)     // Catch: java.lang.Throwable -> L25
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L25
            goto L2c
        L25:
            r3 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r3)
            r3 = r0
        L2c:
            boolean r0 = r3 instanceof sf.f
            if (r0 == 0) goto L32
            goto L33
        L32:
            r1 = r3
        L33:
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L3b
            int r2 = r1.intValue()
        L3b:
            return r2
    }

    public static int[] k(int r4, java.lang.String r5) {
            if (r5 != 0) goto L4
            java.lang.String r5 = ""
        L4:
            r0 = 1
            char[] r1 = new char[r0]
            r2 = 44
            r3 = 0
            r1[r3] = r2
            r2 = 6
            java.util.List r5 = og.m.F0(r5, r1, r2)
            r1 = 2
            java.util.List r5 = tf.m.L1(r1, r5)
            java.lang.Object r1 = tf.m.w1(r3, r5)
            java.lang.String r1 = (java.lang.String) r1
            int r4 = j(r4, r1)
            java.lang.Object r5 = tf.m.w1(r0, r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L31
            int r5 = j(r4, r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L32
        L31:
            r5 = 0
        L32:
            if (r5 == 0) goto L43
            int r0 = r5.intValue()
            if (r0 == r4) goto L43
            int r5 = r5.intValue()
            int[] r4 = new int[]{r4, r5}
            return r4
        L43:
            int[] r4 = new int[]{r4}
            return r4
    }

    public static void l(android.view.View r6, android.view.ViewGroup r7) {
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            boolean r1 = r0 instanceof android.widget.FrameLayout.LayoutParams
            if (r1 == 0) goto Lb
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L81
            android.content.Context r1 = r6.getContext()
            r1.getClass()
            r2 = 8
            int r1 = f(r1, r2)
            int r2 = r7.getWidth()
            int r3 = r6.getWidth()
            int r2 = r2 - r3
            int r3 = r1 * 2
            int r2 = r2 - r3
            r4 = 0
            if (r2 >= 0) goto L2b
            r2 = r4
        L2b:
            int r7 = r7.getHeight()
            int r5 = r6.getHeight()
            int r7 = r7 - r5
            int r7 = r7 - r3
            if (r7 >= 0) goto L38
            goto L39
        L38:
            r4 = r7
        L39:
            int r7 = r0.leftMargin
            int r3 = r1 + r2
            int r7 = r9.e0.r(r7, r1, r3)
            r0.leftMargin = r7
            int r7 = r0.topMargin
            int r3 = r1 + r4
            int r7 = r9.e0.r(r7, r1, r3)
            r0.topMargin = r7
            r6.setLayoutParams(r0)
            android.content.SharedPreferences r6 = k9.r.f7532c
            if (r6 == 0) goto L81
            android.content.SharedPreferences$Editor r6 = r6.edit()
            if (r6 == 0) goto L81
            r7 = 0
            if (r2 != 0) goto L5f
            r3 = r7
            goto L65
        L5f:
            int r3 = r0.leftMargin
            int r3 = r3 - r1
            float r3 = (float) r3
            float r2 = (float) r2
            float r3 = r3 / r2
        L65:
            java.lang.String r2 = "position_x"
            android.content.SharedPreferences$Editor r6 = r6.putFloat(r2, r3)
            if (r6 == 0) goto L81
            if (r4 != 0) goto L70
            goto L76
        L70:
            int r7 = r0.topMargin
            int r7 = r7 - r1
            float r7 = (float) r7
            float r0 = (float) r4
            float r7 = r7 / r0
        L76:
            java.lang.String r0 = "position_y"
            android.content.SharedPreferences$Editor r6 = r6.putFloat(r0, r7)
            if (r6 == 0) goto L81
            r6.apply()
        L81:
            return
    }

    public static void m(android.content.Context r17, android.view.ViewGroup r18, android.view.View r19, android.widget.ScrollView r20, android.widget.LinearLayout r21) {
            r0 = r17
            r1 = r20
            r2 = r21
            r3 = 12
            int r3 = f(r0, r3)
            r4 = 10
            int r4 = f(r0, r4)
            android.view.ViewGroup$LayoutParams r5 = r19.getLayoutParams()
            boolean r6 = r5 instanceof android.widget.FrameLayout.LayoutParams
            if (r6 == 0) goto L1d
            android.widget.FrameLayout$LayoutParams r5 = (android.widget.FrameLayout.LayoutParams) r5
            goto L1e
        L1d:
            r5 = 0
        L1e:
            if (r5 == 0) goto L24e
            int r6 = r5.leftMargin
            int r8 = r19.getWidth()
            int r8 = r8 / 2
            int r8 = r8 + r6
            int r6 = r18.getWidth()
            int r6 = r6 / 2
            r9 = 0
            if (r8 < r6) goto L34
            r6 = 1
            goto L35
        L34:
            r6 = r9
        L35:
            int r11 = r2.getChildCount()
            r12 = r9
        L3a:
            if (r12 < r11) goto L148
            android.content.SharedPreferences r11 = k9.r.f7532c
            r12 = 44
            if (r11 == 0) goto L50
            java.lang.String r13 = "action_size"
            int r11 = r11.getInt(r13, r12)
            r12 = 36
            r13 = 64
            int r12 = r9.e0.r(r11, r12, r13)
        L50:
            int r11 = r5.topMargin
            int r11 = r11 - r4
            int r11 = r11 - r3
            int r13 = f(r0, r12)
            if (r11 >= r13) goto L5b
            r11 = r13
        L5b:
            int r13 = r18.getHeight()
            int r14 = r19.getHeight()
            int r13 = r13 - r14
            int r13 = r13 - r4
            int r14 = r3 * 2
            int r13 = r13 - r14
            int r15 = f(r0, r12)
            if (r13 >= r15) goto L6f
            r13 = r15
        L6f:
            if (r11 <= r13) goto L72
            r11 = r13
        L72:
            int r13 = r18.getWidth()
            int r13 = r13 - r14
            r14 = 80
            int r14 = f(r0, r14)
            if (r13 >= r14) goto L80
            r13 = r14
        L80:
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r14)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r14)
            r1.measure(r15, r14)
            android.view.ViewGroup$LayoutParams r14 = r1.getLayoutParams()
            boolean r15 = r14 instanceof android.widget.FrameLayout.LayoutParams
            if (r15 == 0) goto L98
            android.widget.FrameLayout$LayoutParams r14 = (android.widget.FrameLayout.LayoutParams) r14
            goto L99
        L98:
            r14 = 0
        L99:
            if (r14 == 0) goto L24e
            int r15 = r1.getMeasuredWidth()
            if (r15 <= r13) goto La2
            goto La3
        La2:
            r13 = r15
        La3:
            r14.width = r13
            int r13 = r1.getMeasuredHeight()
            if (r13 <= r11) goto Lac
            goto Lad
        Lac:
            r11 = r13
        Lad:
            r14.height = r11
            android.content.SharedPreferences r11 = k9.r.f7532c
            if (r11 == 0) goto Lbc
            java.lang.String r13 = "display_mode"
            java.lang.String r15 = "icon"
            java.lang.String r11 = r11.getString(r13, r15)
            goto Lbd
        Lbc:
            r11 = 0
        Lbd:
            java.lang.String r13 = "text"
            boolean r11 = gg.l.a(r11, r13)
            if (r11 == 0) goto Lc7
            r10 = 1
            goto Ld0
        Lc7:
            if (r6 == 0) goto Lcd
            r10 = 8388613(0x800005, float:1.175495E-38)
            goto Ld0
        Lcd:
            r10 = 8388611(0x800003, float:1.1754948E-38)
        Ld0:
            r2.setGravity(r10)
            int r13 = r2.getChildCount()
            r15 = r9
        Ld8:
            if (r15 < r13) goto L12b
            if (r11 == 0) goto Le3
            int r0 = r14.width
            int r0 = r0 / 2
        Le0:
            int r0 = r8 - r0
            goto Lf7
        Le3:
            if (r6 == 0) goto Lf0
            int r12 = r12 / 2
            int r0 = f(r0, r12)
            int r0 = r0 + r8
            int r2 = r14.width
            int r0 = r0 - r2
            goto Lf7
        Lf0:
            int r12 = r12 / 2
            int r0 = f(r0, r12)
            goto Le0
        Lf7:
            int r2 = r18.getWidth()
            int r6 = r14.width
            int r2 = r2 - r6
            int r2 = r2 - r3
            if (r2 >= r3) goto L102
            r2 = r3
        L102:
            int r0 = r9.e0.r(r0, r3, r2)
            r14.leftMargin = r0
            int r0 = r5.topMargin
            int r2 = r14.height
            int r0 = r0 - r2
            int r0 = r0 - r4
            if (r0 >= r3) goto L111
            goto L112
        L111:
            r3 = r0
        L112:
            r14.topMargin = r3
            r1.setLayoutParams(r14)
            int r0 = r14.leftMargin
            int r8 = r8 - r0
            int r0 = r14.width
            int r0 = r9.e0.r(r8, r9, r0)
            float r0 = (float) r0
            r1.setPivotX(r0)
            int r0 = r14.height
            float r0 = (float) r0
            r1.setPivotY(r0)
            return
        L12b:
            android.view.View r7 = r2.getChildAt(r15)
            android.view.ViewGroup$LayoutParams r9 = r7.getLayoutParams()
            boolean r1 = r9 instanceof android.widget.LinearLayout.LayoutParams
            if (r1 == 0) goto L13a
            android.widget.LinearLayout$LayoutParams r9 = (android.widget.LinearLayout.LayoutParams) r9
            goto L13b
        L13a:
            r9 = 0
        L13b:
            if (r9 == 0) goto L142
            r9.gravity = r10
            r7.setLayoutParams(r9)
        L142:
            int r15 = r15 + 1
            r1 = r20
            r9 = 0
            goto Ld8
        L148:
            android.view.View r1 = r2.getChildAt(r12)
            boolean r7 = r1 instanceof android.widget.LinearLayout
            if (r7 == 0) goto L153
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            goto L154
        L153:
            r1 = 0
        L154:
            if (r1 == 0) goto L247
            int r7 = r1.getChildCount()
            r9 = 0
            lg.d r7 = r9.e0.r0(r9, r7)
            java.util.ArrayList r9 = new java.util.ArrayList
            int r13 = tf.n.e1(r7)
            r9.<init>(r13)
            java.util.Iterator r7 = r7.iterator()
        L16c:
            r13 = r7
            lg.c r13 = (lg.c) r13
            boolean r14 = r13.f8047i
            if (r14 == 0) goto L185
            java.lang.Object r13 = r13.next()
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            android.view.View r13 = r1.getChildAt(r13)
            r9.add(r13)
            goto L16c
        L185:
            java.util.Iterator r7 = r9.iterator()
        L189:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L1a3
            java.lang.Object r9 = r7.next()
            r13 = r9
            android.view.View r13 = (android.view.View) r13
            java.lang.Object r13 = r13.getTag()
            java.lang.String r14 = "Hchat:FloatingShortcut:Label"
            boolean r13 = gg.l.a(r13, r14)
            if (r13 == 0) goto L189
            goto L1a4
        L1a3:
            r9 = 0
        L1a4:
            android.view.View r9 = (android.view.View) r9
            int r7 = r1.getChildCount()
            r13 = 0
            lg.d r7 = r9.e0.r0(r13, r7)
            java.util.ArrayList r13 = new java.util.ArrayList
            int r14 = tf.n.e1(r7)
            r13.<init>(r14)
            java.util.Iterator r7 = r7.iterator()
        L1bc:
            r14 = r7
            lg.c r14 = (lg.c) r14
            boolean r15 = r14.f8047i
            if (r15 == 0) goto L1d5
            java.lang.Object r14 = r14.next()
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            android.view.View r14 = r1.getChildAt(r14)
            r13.add(r14)
            goto L1bc
        L1d5:
            java.util.Iterator r7 = r13.iterator()
        L1d9:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto L1f3
            java.lang.Object r13 = r7.next()
            r14 = r13
            android.view.View r14 = (android.view.View) r14
            java.lang.Object r14 = r14.getTag()
            java.lang.String r15 = "Hchat:FloatingShortcut:Icon"
            boolean r14 = gg.l.a(r14, r15)
            if (r14 == 0) goto L1d9
            goto L1f4
        L1f3:
            r13 = 0
        L1f4:
            android.view.View r13 = (android.view.View) r13
            if (r9 == 0) goto L247
            if (r13 != 0) goto L1fb
            goto L247
        L1fb:
            if (r6 == 0) goto L200
            r14 = r9
        L1fe:
            r7 = 0
            goto L202
        L200:
            r14 = r13
            goto L1fe
        L202:
            android.view.View r15 = r1.getChildAt(r7)
            if (r15 != r14) goto L209
            goto L247
        L209:
            android.view.ViewGroup$LayoutParams r14 = r9.getLayoutParams()
            r14.getClass()
            android.widget.LinearLayout$LayoutParams r14 = (android.widget.LinearLayout.LayoutParams) r14
            android.view.ViewGroup$LayoutParams r15 = r13.getLayoutParams()
            r15.getClass()
            android.widget.LinearLayout$LayoutParams r15 = (android.widget.LinearLayout.LayoutParams) r15
            r7 = 8
            if (r6 == 0) goto L221
            r10 = 0
            goto L227
        L221:
            int r16 = f(r0, r7)
            r10 = r16
        L227:
            r14.setMarginStart(r10)
            if (r6 == 0) goto L231
            int r7 = f(r0, r7)
            goto L232
        L231:
            r7 = 0
        L232:
            r15.setMarginStart(r7)
            r1.removeAllViews()
            if (r6 == 0) goto L241
            r1.addView(r9, r14)
            r1.addView(r13, r15)
            goto L247
        L241:
            r1.addView(r13, r15)
            r1.addView(r9, r14)
        L247:
            int r12 = r12 + 1
            r1 = r20
            r9 = 0
            goto L3a
        L24e:
            return
    }

    public static void n(android.view.View r4, android.view.ViewGroup r5) {
            java.lang.ref.WeakReference r0 = k9.r.f7538i
            java.lang.Object r0 = r0.get()
            boolean r1 = r0 instanceof android.widget.ScrollView
            r2 = 0
            if (r1 == 0) goto Le
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L2f
            r1 = 0
            android.view.View r1 = r0.getChildAt(r1)
            boolean r3 = r1 instanceof android.widget.LinearLayout
            if (r3 == 0) goto L1d
            r2 = r1
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
        L1d:
            if (r2 == 0) goto L2f
            android.content.Context r1 = r4.getContext()
            r1.getClass()
            m(r1, r5, r4, r0, r2)
            r0.bringToFront()
            r4.bringToFront()
        L2f:
            return
    }

    public static int o(int[] r5) {
            int r0 = r5.length
            java.lang.String r1 = "Array is empty."
            if (r0 == 0) goto L46
            r0 = 0
            r0 = r5[r0]
            int r2 = r5.length
            if (r2 == 0) goto L41
            int r1 = r5.length
            int r1 = r1 + (-1)
            r5 = r5[r1]
            int r1 = android.graphics.Color.alpha(r0)
            int r2 = android.graphics.Color.alpha(r5)
            int r2 = r2 + r1
            int r2 = r2 / 2
            int r1 = android.graphics.Color.red(r0)
            int r3 = android.graphics.Color.red(r5)
            int r3 = r3 + r1
            int r3 = r3 / 2
            int r1 = android.graphics.Color.green(r0)
            int r4 = android.graphics.Color.green(r5)
            int r4 = r4 + r1
            int r4 = r4 / 2
            int r0 = android.graphics.Color.blue(r0)
            int r5 = android.graphics.Color.blue(r5)
            int r5 = r5 + r0
            int r5 = r5 / 2
            int r5 = android.graphics.Color.argb(r2, r3, r4, r5)
            return r5
        L41:
            j8.o.l(r1)
            r5 = 0
            return r5
        L46:
            j8.o.l(r1)
            r5 = 0
            return r5
    }

    public static void p(fg.a r2) {
            b0.c r0 = new b0.c
            r1 = 2
            r0.<init>(r2, r1)
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r2 = gg.l.a(r2, r1)
            if (r2 == 0) goto L18
            r0.run()
            return
        L18:
            android.os.Handler r2 = k9.r.f7531b
            r2.post(r0)
            return
    }

    public static boolean q(android.app.Activity r5) {
            boolean r0 = r5.isFinishing()
            r1 = 0
            if (r0 != 0) goto L81
            boolean r0 = r5.isDestroyed()
            if (r0 != 0) goto L81
            java.lang.String r0 = r5.getPackageName()
            java.lang.String r2 = "com.tencent.mm"
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L81
            android.content.SharedPreferences r0 = k9.r.f7532c
            java.lang.String r2 = "home"
            if (r0 == 0) goto L28
            java.lang.String r3 = "scope"
            java.lang.String r0 = r0.getString(r3, r2)
            if (r0 == 0) goto L28
            r2 = r0
        L28:
            java.lang.String r0 = "all"
            boolean r0 = r2.equals(r0)
            r2 = 1
            if (r0 == 0) goto L32
            goto L80
        L32:
            boolean r0 = k9.r.f7535f
            if (r0 != 0) goto L6d
            q8.m r0 = h.Hchat.hooks.api.core.WeChatApis.chatPage()
            if (r0 == 0) goto L6b
            q8.o r3 = r0.f10716b
            if (r3 == 0) goto L45
            android.app.Activity r3 = r3.a()
            goto L46
        L45:
            r3 = 0
        L46:
            if (r3 != 0) goto L49
            goto L62
        L49:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "com.tencent.mm.ui.chatting.ChattingUI"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L6d
            java.lang.String r4 = ".ui.chatting."
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L62
            goto L6d
        L62:
            java.lang.String r0 = r0.f10724j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L6b
            goto L6d
        L6b:
            r0 = r1
            goto L6e
        L6d:
            r0 = r2
        L6e:
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r3 = "com.tencent.mm.ui.LauncherUI"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L81
            if (r0 != 0) goto L81
        L80:
            return r2
        L81:
            return r1
    }
}
