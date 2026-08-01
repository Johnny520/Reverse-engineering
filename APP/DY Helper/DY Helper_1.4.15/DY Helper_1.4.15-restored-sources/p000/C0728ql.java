package p000;

/* JADX INFO: renamed from: ql */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0728ql {

    /* JADX INFO: renamed from: α */
    public static final p000.C0728ql f9031 = null;

    /* JADX INFO: renamed from: β */
    public static final android.os.Handler f9032 = null;

    /* JADX INFO: renamed from: γ */
    public static volatile boolean f9033;

    /* JADX INFO: renamed from: δ */
    public static volatile boolean f9034;

    /* JADX INFO: renamed from: ε */
    public static final java.util.List f9035 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.Map f9036 = null;

    /* JADX INFO: renamed from: η */
    public static final java.util.Map f9037 = null;

    /* JADX INFO: renamed from: θ */
    public static final java.util.Map f9038 = null;

    /* JADX INFO: renamed from: ι */
    public static final java.util.Map f9039 = null;

    /* JADX INFO: renamed from: κ */
    public static final java.util.Set f9040 = null;

    /* JADX INFO: renamed from: λ */
    public static final java.util.Set f9041 = null;

    /* JADX INFO: renamed from: μ */
    public static final java.util.Map f9042 = null;

    /* JADX INFO: renamed from: ν */
    public static final java.util.Map f9043 = null;

    /* JADX INFO: renamed from: ξ */
    public static volatile p000.C0627ol f9044;

    static {
            ql r0 = new ql
            r0.<init>()
            p000.C0728ql.f9031 = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.C0728ql.f9032 = r0
            java.lang.String r0 = "~789325E9C4B2AA228E18888457F2F91C62869634665744D07389DD4580D7D29766759B86358C6483A22357F629DC167AD77FCE14324A943E44AA13916C5DBBB74D"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AFAE24985FA802AAC115510920204EFD556923FD17B45EBDC6791A07EA33B080"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.C0728ql.f9035 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r0.getClass()
            p000.C0728ql.f9036 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r0.getClass()
            p000.C0728ql.f9037 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r0.getClass()
            p000.C0728ql.f9038 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r0.getClass()
            p000.C0728ql.f9039 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            r0.getClass()
            p000.C0728ql.f9040 = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Set r0 = java.util.Collections.synchronizedSet(r0)
            r0.getClass()
            p000.C0728ql.f9041 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r0.getClass()
            p000.C0728ql.f9042 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r0.getClass()
            p000.C0728ql.f9043 = r0
            return
    }

    /* JADX INFO: renamed from: Α */
    public static boolean m4895(android.view.ViewGroup r14) {
            android.os.IBinder r0 = r14.getWindowToken()
            r1 = 0
            if (r0 != 0) goto L9
            goto L212
        L9:
            int r0 = r14.getWidth()
            if (r0 > 0) goto L21
            int r0 = r14.getHeight()
            if (r0 > 0) goto L21
            int r0 = r14.getMeasuredWidth()
            if (r0 > 0) goto L21
            int r0 = r14.getMeasuredHeight()
            if (r0 <= 0) goto L212
        L21:
            android.view.ViewGroup r0 = m4925(r14)
            if (r0 != 0) goto L2a
            int r14 = com.example.dyhelper.MainHook.f2222
            return r1
        L2a:
            java.lang.Class r2 = r14.getClass()
            java.lang.String r2 = r2.getName()
            java.util.List r3 = p000.C0728ql.f9035
            r4 = 1
            if (r3 == 0) goto L3e
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L3e
            goto L56
        L3e:
            java.util.Iterator r3 = r3.iterator()
        L42:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L56
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = p000.ln0.m3626(r5, r2)
            if (r5 == 0) goto L42
            goto Ld5
        L56:
            java.lang.String r3 = "SimilarEmojiContainer"
            boolean r3 = p000.q02.m4654(r2, r3, r4)
            if (r3 != 0) goto Ld5
            java.lang.String r3 = "similaremoji"
            boolean r2 = p000.q02.m4654(r2, r3, r4)
            if (r2 == 0) goto L68
            goto Ld5
        L68:
            java.util.Set r2 = p000.C0728ql.f9040
            monitor-enter(r2)
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch: java.lang.Throwable -> L86
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L86
        L72:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L86
            if (r5 == 0) goto L88
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L86
            java.lang.Class r5 = (java.lang.Class) r5     // Catch: java.lang.Throwable -> L86
            boolean r5 = r5.isInstance(r14)     // Catch: java.lang.Throwable -> L86
            if (r5 == 0) goto L72
            monitor-exit(r2)
            goto Ld5
        L86:
            r14 = move-exception
            goto Ld3
        L88:
            monitor-exit(r2)
            int r2 = r0.getWidth()
            int r3 = r0.getMeasuredWidth()
            int r2 = java.lang.Math.max(r2, r3)
            android.content.Context r3 = r14.getContext()
            r3.getClass()
            r5 = 1128792064(0x43480000, float:200.0)
            int r3 = m4922(r3, r5)
            if (r2 < r3) goto Lc1
            int r2 = r0.getHeight()
            int r3 = r0.getMeasuredHeight()
            int r2 = java.lang.Math.max(r2, r3)
            android.content.Context r3 = r14.getContext()
            r3.getClass()
            r5 = 1133903872(0x43960000, float:300.0)
            int r3 = m4922(r3, r5)
            if (r2 < r3) goto Lc1
            r2 = r4
            goto Lc2
        Lc1:
            r2 = r1
        Lc2:
            android.view.View r3 = m4924(r0)
            if (r3 == 0) goto Lca
            r3 = r4
            goto Lcb
        Lca:
            r3 = r1
        Lcb:
            if (r2 == 0) goto Ld0
            if (r3 == 0) goto Ld0
            goto Ld5
        Ld0:
            int r14 = com.example.dyhelper.MainHook.f2222
            return r1
        Ld3:
            monitor-exit(r2)
            throw r14
        Ld5:
            java.util.Map r2 = p000.C0728ql.f9043
            monitor-enter(r2)
            java.lang.Object r3 = r2.get(r0)     // Catch: java.lang.Throwable -> Le5
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> Le5
            if (r3 == 0) goto Le8
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> Le5
            goto Lf3
        Le5:
            r14 = move-exception
            goto L2ef
        Le8:
            int r3 = r0.getPaddingBottom()     // Catch: java.lang.Throwable -> Le5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Le5
            r2.put(r0, r5)     // Catch: java.lang.Throwable -> Le5
        Lf3:
            monitor-exit(r2)
            android.content.Context r2 = r0.getContext()
            r2.getClass()
            r5 = 1118044160(0x42a40000, float:82.0)
            int r2 = m4922(r2, r5)
            int r2 = r2 + r3
            int r3 = r0.getPaddingBottom()
            if (r3 >= r2) goto L11c
            int r3 = r0.getPaddingLeft()
            int r5 = r0.getPaddingTop()
            int r6 = r0.getPaddingRight()
            r0.setPadding(r3, r5, r6, r2)
            r0.setClipToPadding(r1)
            int r0 = com.example.dyhelper.MainHook.f2222
        L11c:
            android.view.View r0 = m4926(r14)
            r2 = 2
            if (r0 == 0) goto L12f
            hi r1 = new hi
            r1.<init>(r2, r14)
            r0.setOnClickListener(r1)
            r0.bringToFront()
            return r4
        L12f:
            android.content.Context r0 = r14.getContext()
            r0.getClass()
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r0)
            java.lang.String r5 = "dyhelper_similar_emoji_download"
            r3.setTag(r5)
            java.lang.String r5 = "下载表情包"
            r3.setText(r5)
            r5 = 17
            r3.setGravity(r5)
            r3.setMaxLines(r4)
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
            r3.setEllipsize(r5)
            r3.setIncludeFontPadding(r1)
            r5 = -1
            r3.setTextColor(r5)
            r6 = 1097859072(0x41700000, float:15.0)
            r3.setTextSize(r2, r6)
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT_BOLD
            r3.setTypeface(r6)
            r6 = 1111490560(0x42400000, float:48.0)
            int r6 = m4922(r0, r6)
            r3.setMinHeight(r6)
            r3.setClickable(r4)
            r3.setFocusable(r4)
            r6 = 1090519040(0x41000000, float:8.0)
            int r6 = m4922(r0, r6)
            float r6 = (float) r6
            r3.setElevation(r6)
            android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
            r6.<init>()
            r7 = 1103101952(0x41c00000, float:24.0)
            int r7 = m4922(r0, r7)
            float r7 = (float) r7
            r6.setCornerRadius(r7)
            r7 = -300542442(0xffffffffee161616, float:-1.1612363E28)
            r6.setColor(r7)
            r7 = 1056964608(0x3f000000, float:0.5)
            int r0 = m4922(r0, r7)
            int r0 = java.lang.Math.max(r4, r0)
            r7 = 872415231(0x33ffffff, float:1.1920928E-7)
            r6.setStroke(r0, r7)
            r3.setBackground(r6)
            hi r0 = new hi
            r0.<init>(r2, r14)
            r3.setOnClickListener(r0)
            r14.setClipChildren(r1)
            r14.setClipToPadding(r1)
            boolean r0 = r14 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L1d0
            r0 = r14
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            android.content.Context r0 = r0.getContext()
            r0.getClass()
            android.widget.FrameLayout$LayoutParams r0 = m4909(r0)
            r14.addView(r3, r0)
            r3.bringToFront()
            r14.requestLayout()
            int r14 = com.example.dyhelper.MainHook.f2222
            return r4
        L1d0:
            java.lang.String r0 = "dyhelper_similar_emoji_wrapper"
            android.content.Context r2 = r14.getContext()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            int r7 = r14.getChildCount()
            r8 = r1
        L1e0:
            if (r8 >= r7) goto L20c
            android.view.View r9 = r14.getChildAt(r8)
            java.lang.Object r10 = r9.getTag()
            java.lang.String r11 = "dyhelper_similar_emoji_download"
            boolean r10 = p000.ln0.m3626(r10, r11)
            if (r10 != 0) goto L209
            java.lang.Object r10 = r9.getTag()
            boolean r10 = p000.ln0.m3626(r10, r0)
            if (r10 == 0) goto L1fd
            goto L209
        L1fd:
            ml r10 = new ml
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            r10.<init>(r9, r11)
            r6.add(r10)
        L209:
            int r8 = r8 + 1
            goto L1e0
        L20c:
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L213
        L212:
            return r1
        L213:
            java.util.Iterator r7 = r6.iterator()
        L217:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L237
            java.lang.Object r8 = r7.next()
            r9 = r8
            ml r9 = (p000.C0553ml) r9
            android.view.View r9 = r9.f7197
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r10 = "RecyclerView"
            boolean r9 = p000.q02.m4654(r9, r10, r4)
            if (r9 == 0) goto L217
            goto L238
        L237:
            r8 = 0
        L238:
            ml r8 = (p000.C0553ml) r8
            if (r8 == 0) goto L241
            android.view.ViewGroup$LayoutParams r7 = r8.f7198
            if (r7 == 0) goto L241
            goto L250
        L241:
            java.lang.Object r7 = p000.AbstractC0984xh.m6638(r6)
            ml r7 = (p000.C0553ml) r7
            android.view.ViewGroup$LayoutParams r7 = r7.f7198
            if (r7 != 0) goto L250
            android.view.ViewGroup$LayoutParams r7 = new android.view.ViewGroup$LayoutParams
            r7.<init>(r5, r5)
        L250:
            android.widget.FrameLayout r8 = new android.widget.FrameLayout
            r8.<init>(r2)
            r8.setTag(r0)
            r8.setClipChildren(r1)
            r8.setClipToPadding(r1)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r8.setBackground(r0)
            r14.removeAllViews()
            java.util.Iterator r0 = r6.iterator()
        L26d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d9
            java.lang.Object r1 = r0.next()
            ml r1 = (p000.C0553ml) r1
            android.view.View r6 = r1.f7197
            android.view.ViewGroup$LayoutParams r1 = r1.f7198
            if (r1 != 0) goto L281
        L27f:
            r9 = r5
            goto L295
        L281:
            int r9 = r1.width
            if (r9 != 0) goto L290
            int r9 = r6.getWidth()
            if (r9 <= 0) goto L290
            int r9 = r6.getWidth()
            goto L295
        L290:
            int r9 = r1.width
            if (r9 != 0) goto L295
            goto L27f
        L295:
            if (r1 != 0) goto L299
        L297:
            r10 = r5
            goto L2ad
        L299:
            int r10 = r1.height
            if (r10 != 0) goto L2a8
            int r10 = r6.getHeight()
            if (r10 <= 0) goto L2a8
            int r10 = r6.getHeight()
            goto L2ad
        L2a8:
            int r10 = r1.height
            if (r10 != 0) goto L2ad
            goto L297
        L2ad:
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            r11.<init>(r9, r10)
            r9 = 8388659(0x800033, float:1.1755015E-38)
            r11.gravity = r9
            boolean r9 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r9 == 0) goto L2c9
            r9 = r1
            android.view.ViewGroup$MarginLayoutParams r9 = (android.view.ViewGroup.MarginLayoutParams) r9
            int r10 = r9.leftMargin
            int r12 = r9.topMargin
            int r13 = r9.rightMargin
            int r9 = r9.bottomMargin
            r11.setMargins(r10, r12, r13, r9)
        L2c9:
            boolean r9 = r1 instanceof android.widget.FrameLayout.LayoutParams
            if (r9 == 0) goto L2d5
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r1 = r1.gravity
            if (r1 == r5) goto L2d5
            r11.gravity = r1
        L2d5:
            r8.addView(r6, r11)
            goto L26d
        L2d9:
            r2.getClass()
            android.widget.FrameLayout$LayoutParams r0 = m4909(r2)
            r8.addView(r3, r0)
            r14.addView(r8, r7)
            r3.bringToFront()
            r14.requestLayout()
            int r14 = com.example.dyhelper.MainHook.f2222
            return r4
        L2ef:
            monitor-exit(r2)
            throw r14
    }

    /* JADX INFO: renamed from: Β */
    public static void m4896(java.lang.ClassLoader r3) {
            r0 = 0
            java.util.List r3 = m4906(r3, r0)
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r3.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Class r2 = r1.getDeclaringClass()
            r2.getClass()
            m4904(r2)
            ql r2 = p000.C0728ql.f9031
            boolean r1 = r2.m4933(r1)
            if (r1 == 0) goto L9
            int r0 = r0 + 1
            goto L9
        L2a:
            if (r0 <= 0) goto L2e
            int r3 = com.example.dyhelper.MainHook.f2222
        L2e:
            return
    }

    /* JADX INFO: renamed from: Γ */
    public static boolean m4897(android.view.View r3) {
            java.lang.Class r3 = r3.getClass()
        L4:
            r0 = 0
            if (r3 == 0) goto L33
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L33
            java.lang.String r1 = r3.getName()
            java.lang.String r2 = "RemoteImageView"
            boolean r2 = p000.q02.m4654(r1, r2, r0)
            if (r2 != 0) goto L31
            java.lang.String r2 = "SimpleDraweeView"
            boolean r2 = p000.q02.m4654(r1, r2, r0)
            if (r2 != 0) goto L31
            java.lang.String r2 = "DraweeView"
            boolean r0 = p000.q02.m4654(r1, r2, r0)
            if (r0 == 0) goto L2c
            goto L31
        L2c:
            java.lang.Class r3 = r3.getSuperclass()
            goto L4
        L31:
            r3 = 1
            return r3
        L33:
            return r0
    }

    /* JADX INFO: renamed from: Δ */
    public static boolean m4898(java.lang.String r2) {
            java.lang.String r2 = m4903(r2)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = p000.AbstractC0602nx.m4134(r0, r2, r0)
            java.lang.String r0 = "http"
            r1 = 0
            boolean r0 = p000.x02.m6485(r2, r0, r1)
            if (r0 == 0) goto L35
            java.lang.String r0 = "mime_type=video"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L35
            java.lang.String r0 = "mime_type=audio"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L35
            java.lang.String r0 = ".mp4"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L35
            java.lang.String r0 = ".mp3"
            boolean r2 = p000.q02.m4654(r2, r0, r1)
            if (r2 != 0) goto L35
            r2 = 1
            return r2
        L35:
            return r1
    }

    /* JADX INFO: renamed from: Ε */
    public static boolean m4899(java.lang.reflect.Method r6, boolean r7) {
            int r0 = r6.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 == 0) goto Ld
            goto Lcb
        Ld:
            java.lang.Class r0 = r6.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 != 0) goto L1b
            goto Lcb
        L1b:
            java.lang.Class[] r0 = r6.getParameterTypes()
            int r2 = r0.length
            r3 = 5
            if (r2 == r3) goto L25
            goto Lcb
        L25:
            r2 = r0[r1]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L31
            goto Lcb
        L31:
            java.lang.Class<android.view.View> r2 = android.view.View.class
            r3 = 1
            r4 = r0[r3]
            boolean r2 = r2.isAssignableFrom(r4)
            if (r2 != 0) goto L3e
            goto Lcb
        L3e:
            r2 = 3
            r2 = r0[r2]
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r2 = p000.ln0.m3626(r2, r4)
            if (r2 != 0) goto L4b
            goto Lcb
        L4b:
            r2 = 4
            r2 = r0[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            boolean r2 = p000.ln0.m3626(r2, r4)
            if (r2 != 0) goto L58
            goto Lcb
        L58:
            java.lang.Class r2 = r6.getDeclaringClass()
            java.lang.Class<android.view.ViewGroup> r4 = android.view.ViewGroup.class
            boolean r4 = r4.isAssignableFrom(r2)
            if (r4 != 0) goto L65
            goto Lcb
        L65:
            if (r7 != 0) goto L68
            goto Lcc
        L68:
            java.lang.String r7 = r2.getName()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r7 = p000.AbstractC0602nx.m4134(r2, r7, r2)
            r4 = 2
            r0 = r0[r4]
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = r0.toLowerCase(r2)
            r0.getClass()
            java.lang.String r6 = r6.toGenericString()
            r6.getClass()
            java.lang.String r6 = r6.toLowerCase(r2)
            r6.getClass()
            java.lang.String r2 = "emoji"
            boolean r4 = p000.q02.m4654(r7, r2, r1)
            if (r4 != 0) goto Lcc
            java.lang.String r4 = "sticker"
            boolean r5 = p000.q02.m4654(r7, r4, r1)
            if (r5 != 0) goto Lcc
            java.lang.String r5 = "similaremoji"
            boolean r7 = p000.q02.m4654(r7, r5, r1)
            if (r7 != 0) goto Lcc
            boolean r7 = p000.q02.m4654(r0, r2, r1)
            if (r7 != 0) goto Lcc
            boolean r7 = p000.q02.m4654(r0, r4, r1)
            if (r7 != 0) goto Lcc
            boolean r7 = p000.q02.m4654(r0, r5, r1)
            if (r7 != 0) goto Lcc
            boolean r7 = p000.q02.m4654(r6, r2, r1)
            if (r7 != 0) goto Lcc
            boolean r7 = p000.q02.m4654(r6, r4, r1)
            if (r7 != 0) goto Lcc
            boolean r6 = p000.q02.m4654(r6, r5, r1)
            if (r6 == 0) goto Lcb
            goto Lcc
        Lcb:
            return r1
        Lcc:
            return r3
    }

    /* JADX INFO: renamed from: Ζ */
    public static boolean m4900(android.view.View r5) {
            boolean r0 = r5 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getName()
            java.util.List r2 = p000.C0728ql.f9035
            r3 = 1
            if (r2 == 0) goto L1a
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L1a
            goto L31
        L1a:
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L31
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = p000.ln0.m3626(r4, r0)
            if (r4 == 0) goto L1e
            goto L6e
        L31:
            java.lang.String r2 = "SimilarEmojiContainer"
            boolean r2 = p000.q02.m4654(r0, r2, r3)
            if (r2 != 0) goto L6e
            java.lang.String r2 = "similaremoji"
            boolean r2 = p000.q02.m4654(r0, r2, r3)
            if (r2 == 0) goto L4a
            java.lang.String r2 = "container"
            boolean r0 = p000.q02.m4654(r0, r2, r3)
            if (r0 == 0) goto L4a
            goto L6e
        L4a:
            java.util.Set r0 = p000.C0728ql.f9040
            monitor-enter(r0)
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L68
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L68
        L54:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L68
            if (r4 == 0) goto L6a
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L68
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.Throwable -> L68
            boolean r4 = r4.isInstance(r5)     // Catch: java.lang.Throwable -> L68
            if (r4 == 0) goto L54
            monitor-exit(r0)
            return r3
        L68:
            r5 = move-exception
            goto L6c
        L6a:
            monitor-exit(r0)
            return r1
        L6c:
            monitor-exit(r0)
            throw r5
        L6e:
            return r3
    }

    /* JADX INFO: renamed from: Η */
    public static java.util.ArrayList m4901(java.lang.ClassLoader r9) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = p000.C0728ql.f9035
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Class r2 = p000.qe0.m4877(r9, r2)
            if (r2 != 0) goto L20
            jz r2 = p000.C0450jz.f5672
            goto L58
        L20:
            java.lang.reflect.Method[] r2 = r2.getDeclaredMethods()
            r2.getClass()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r2.length
            r5 = 0
            r6 = r5
        L2f:
            if (r6 >= r4) goto L42
            r7 = r2[r6]
            r7.getClass()
            boolean r8 = m4899(r7, r5)
            if (r8 == 0) goto L3f
            r3.add(r7)
        L3f:
            int r6 = r6 + 1
            goto L2f
        L42:
            java.util.Iterator r2 = r3.iterator()
        L46:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L57
            java.lang.Object r4 = r2.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r5 = 1
            r4.setAccessible(r5)
            goto L46
        L57:
            r2 = r3
        L58:
            p000.AbstractC0984xh.m6660(r0, r2)
            goto Lb
        L5c:
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L6a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L88
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            r3.getClass()
            java.lang.String r3 = m4902(r3)
            boolean r3 = r9.add(r3)
            if (r3 == 0) goto L6a
            r1.add(r2)
            goto L6a
        L88:
            return r1
    }

    /* JADX INFO: renamed from: Θ */
    public static java.lang.String m4902(java.lang.reflect.Method r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            java.lang.String r1 = r6.getName()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            java.lang.Class[] r1 = r6.getParameterTypes()
            r1.getClass()
            wj r2 = new wj
            r3 = 23
            r2.<init>(r3)
            r3 = 30
            java.lang.String r4 = ","
            r5 = 0
            java.lang.String r1 = p000.AbstractC0312g7.m2256(r1, r4, r5, r2, r3)
            java.lang.String r2 = "):"
            java.lang.String r6 = p000.lz1.m3692(r0, r1, r2, r6)
            return r6
    }

    /* JADX INFO: renamed from: Ι */
    public static java.lang.String m4903(java.lang.String r2) {
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "//"
            r1 = 0
            boolean r0 = p000.x02.m6485(r2, r0, r1)
            if (r0 == 0) goto L17
            java.lang.String r0 = "https:"
            java.lang.String r2 = r0.concat(r2)
        L17:
            java.lang.String r0 = "&amp;"
            java.lang.String r1 = "&"
            java.lang.String r2 = p000.x02.m6483(r2, r0, r1)
            java.lang.String r0 = "\\u0026"
            java.lang.String r2 = p000.x02.m6483(r2, r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: Κ */
    public static void m4904(java.lang.Class r1) {
            java.lang.Class<android.view.ViewGroup> r0 = android.view.ViewGroup.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L9
            return
        L9:
            java.util.Set r0 = p000.C0728ql.f9040
            r0.add(r1)
            int r1 = com.example.dyhelper.MainHook.f2222
            return
    }

    /* JADX INFO: renamed from: Λ */
    public static void m4905(android.view.View r5, java.util.List r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        Lf:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = m4903(r1)
            r0.add(r1)
            goto Lf
        L23:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "http"
            r4 = 0
            boolean r2 = p000.x02.m6485(r2, r3, r4)
            if (r2 == 0) goto L2c
            r6.add(r1)
            goto L2c
        L46:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L4d
            return
        L4d:
            java.util.Map r0 = p000.C0728ql.f9037
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r5)     // Catch: java.lang.Throwable -> L5f
            if (r1 != 0) goto L61
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5f
            r1.<init>()     // Catch: java.lang.Throwable -> L5f
            r0.put(r5, r1)     // Catch: java.lang.Throwable -> L5f
            goto L61
        L5f:
            r5 = move-exception
            goto L90
        L61:
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r0)
            monitor-enter(r1)
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L7f
        L69:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L7f
            if (r0 == 0) goto L81
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L7f
            boolean r2 = r1.contains(r0)     // Catch: java.lang.Throwable -> L7f
            if (r2 != 0) goto L69
            r1.add(r0)     // Catch: java.lang.Throwable -> L7f
            goto L69
        L7f:
            r5 = move-exception
            goto L8e
        L81:
            java.lang.String r6 = m4915(r1)     // Catch: java.lang.Throwable -> L7f
            if (r6 == 0) goto L8c
            java.util.Map r0 = p000.C0728ql.f9036     // Catch: java.lang.Throwable -> L7f
            r0.put(r5, r6)     // Catch: java.lang.Throwable -> L7f
        L8c:
            monitor-exit(r1)
            return
        L8e:
            monitor-exit(r1)
            throw r5
        L90:
            monitor-exit(r0)
            throw r5
    }

    /* JADX INFO: renamed from: Μ */
    public static java.util.List m4906(java.lang.ClassLoader r6, boolean r7) {
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6219
            java.util.List r1 = p000.C0666ox.m4323(r0, r6)
            if (r1 == 0) goto L4a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r3 = r1.hasNext()
            r4 = 1
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r1.next()
            r5 = r3
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            boolean r4 = m4899(r5, r4)
            if (r4 == 0) goto L13
            r2.add(r3)
            goto L13
        L2b:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L32
            goto L33
        L32:
            r2 = 0
        L33:
            if (r2 == 0) goto L4a
            java.util.Iterator r6 = r2.iterator()
        L39:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L49
            java.lang.Object r7 = r6.next()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            r7.setAccessible(r4)
            goto L39
        L49:
            return r2
        L4a:
            java.util.ArrayList r1 = m4901(r6)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L5a
            java.lang.Object r6 = p000.C0666ox.f8297     // Catch: java.lang.Throwable -> L59
            p000.C0666ox.m4327(r0, r1)     // Catch: java.lang.Throwable -> L59
        L59:
            return r1
        L5a:
            if (r7 == 0) goto L75
            java.lang.Object r7 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r7 = p000.C0666ox.f8305
            boolean r7 = r7.get()
            if (r7 != 0) goto L67
            goto L75
        L67:
            bb r7 = new bb
            r1 = 17
            r7.<init>(r6, r1)
            java.lang.String r1 = "定位评论相似表情入口方法"
            java.util.List r6 = p000.C0666ox.m4316(r0, r6, r1, r7)
            return r6
        L75:
            jz r6 = p000.C0450jz.f5672
            return r6
    }

    /* JADX INFO: renamed from: Ν */
    public static int m4907(java.lang.String r3) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = p000.AbstractC0602nx.m4134(r0, r3, r0)
            java.lang.String r0 = ".gif"
            r1 = 0
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 != 0) goto L1a
            java.lang.String r0 = "format=gif"
            boolean r0 = p000.q02.m4654(r3, r0, r1)
            if (r0 == 0) goto L18
            goto L1a
        L18:
            r0 = r1
            goto L1c
        L1a:
            r0 = 1000(0x3e8, float:1.401E-42)
        L1c:
            java.lang.String r2 = "animated"
            boolean r2 = p000.q02.m4654(r3, r2, r1)
            if (r2 != 0) goto L2c
            java.lang.String r2 = "awebp"
            boolean r2 = p000.q02.m4654(r3, r2, r1)
            if (r2 == 0) goto L2e
        L2c:
            int r0 = r0 + 800
        L2e:
            java.lang.String r2 = ".webp"
            boolean r2 = p000.q02.m4654(r3, r2, r1)
            if (r2 == 0) goto L38
            int r0 = r0 + 500
        L38:
            java.lang.String r2 = "sticker"
            boolean r2 = p000.q02.m4654(r3, r2, r1)
            if (r2 != 0) goto L48
            java.lang.String r2 = "emoji"
            boolean r2 = p000.q02.m4654(r3, r2, r1)
            if (r2 == 0) goto L4a
        L48:
            int r0 = r0 + 300
        L4a:
            java.lang.String r2 = "thumb"
            boolean r2 = p000.q02.m4654(r3, r2, r1)
            if (r2 == 0) goto L54
            int r0 = r0 + (-500)
        L54:
            java.lang.String r2 = "cover"
            boolean r2 = p000.q02.m4654(r3, r2, r1)
            if (r2 == 0) goto L5e
            int r0 = r0 + (-500)
        L5e:
            java.lang.String r2 = "avatar"
            boolean r2 = p000.q02.m4654(r3, r2, r1)
            if (r2 == 0) goto L68
            int r0 = r0 + (-1200)
        L68:
            java.lang.String r2 = "profile"
            boolean r2 = p000.q02.m4654(r3, r2, r1)
            if (r2 == 0) goto L72
            int r0 = r0 + (-1200)
        L72:
            java.lang.String r2 = "user_avatar"
            boolean r3 = p000.q02.m4654(r3, r2, r1)
            if (r3 == 0) goto L7c
            int r0 = r0 + (-1200)
        L7c:
            return r0
    }

    /* JADX INFO: renamed from: Ξ */
    public static boolean m4908(java.lang.Object r3) {
            r0 = 0
            if (r3 != 0) goto L4
            goto L6c
        L4:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 != 0) goto L6f
            boolean r1 = r3 instanceof android.net.Uri
            if (r1 == 0) goto Ld
            return r0
        Ld:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 != 0) goto L6f
            boolean r1 = r3 instanceof java.lang.Boolean
            if (r1 == 0) goto L16
            return r0
        L16:
            boolean r1 = r3 instanceof android.view.View
            if (r1 != 0) goto L6f
            boolean r1 = r3 instanceof android.content.Context
            if (r1 == 0) goto L1f
            return r0
        L1f:
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getName()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = p000.AbstractC0602nx.m4134(r2, r1, r2)
            java.lang.String r2 = "emoji"
            boolean r2 = p000.q02.m4654(r1, r2, r0)
            if (r2 != 0) goto L6d
            java.lang.String r2 = "url"
            boolean r2 = p000.q02.m4654(r1, r2, r0)
            if (r2 != 0) goto L6d
            java.lang.String r2 = "image"
            boolean r2 = p000.q02.m4654(r1, r2, r0)
            if (r2 != 0) goto L6d
            java.lang.String r2 = "icon"
            boolean r2 = p000.q02.m4654(r1, r2, r0)
            if (r2 != 0) goto L6d
            java.lang.String r2 = "model"
            boolean r2 = p000.q02.m4654(r1, r2, r0)
            if (r2 != 0) goto L6d
            java.lang.String r2 = "x."
            boolean r1 = p000.x02.m6485(r1, r2, r0)
            if (r1 != 0) goto L6d
            boolean r1 = r3 instanceof java.lang.Iterable
            if (r1 != 0) goto L6d
            java.lang.Class r3 = r3.getClass()
            boolean r3 = r3.isArray()
            if (r3 == 0) goto L6c
            goto L6d
        L6c:
            return r0
        L6d:
            r3 = 1
            return r3
        L6f:
            return r0
    }

    /* JADX INFO: renamed from: Ο */
    public static android.widget.FrameLayout.LayoutParams m4909(android.content.Context r4) {
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = 1111490560(0x42400000, float:48.0)
            int r1 = m4922(r4, r1)
            r2 = 81
            r3 = -1
            r0.<init>(r3, r1, r2)
            r1 = 1098907648(0x41800000, float:16.0)
            int r2 = m4922(r4, r1)
            r0.leftMargin = r2
            int r1 = m4922(r4, r1)
            r0.rightMargin = r1
            r1 = 1102053376(0x41b00000, float:22.0)
            int r4 = m4922(r4, r1)
            r0.bottomMargin = r4
            return r0
    }

    /* JADX INFO: renamed from: α */
    public static final void m4910(p000.C0728ql r12, java.lang.Object r13, java.lang.Object[] r14) {
            r12 = 0
            r0 = 0
            if (r14 == 0) goto L12
            int r1 = r14.length
            r2 = r12
        L6:
            if (r2 >= r1) goto L12
            r3 = r14[r2]
            boolean r4 = r3 instanceof android.view.View
            if (r4 == 0) goto Lf
            goto L13
        Lf:
            int r2 = r2 + 1
            goto L6
        L12:
            r3 = r0
        L13:
            boolean r1 = r3 instanceof android.view.View
            if (r1 == 0) goto L1a
            android.view.View r3 = (android.view.View) r3
            goto L1b
        L1a:
            r3 = r0
        L1b:
            boolean r1 = r13 instanceof android.view.ViewGroup
            if (r1 == 0) goto L22
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            goto L23
        L22:
            r13 = r0
        L23:
            if (r13 != 0) goto L44
            r13 = r3
        L26:
            if (r13 == 0) goto L35
            boolean r1 = m4900(r13)
            if (r1 == 0) goto L37
            boolean r1 = r13 instanceof android.view.ViewGroup
            if (r1 == 0) goto L35
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            goto L44
        L35:
            r13 = r0
            goto L44
        L37:
            android.view.ViewParent r13 = r13.getParent()
            boolean r1 = r13 instanceof android.view.View
            if (r1 == 0) goto L42
            android.view.View r13 = (android.view.View) r13
            goto L26
        L42:
            r13 = r0
            goto L26
        L44:
            r1 = 1
            if (r14 == 0) goto L91
            int r2 = r14.length
            if (r2 != 0) goto L4b
            goto L91
        L4b:
            int r2 = r14.length
            r4 = r12
        L4d:
            if (r4 >= r2) goto L87
            r5 = r14[r4]
            if (r5 == 0) goto L84
            boolean r6 = r5 instanceof android.view.View
            if (r6 != 0) goto L84
            boolean r6 = r5 instanceof java.lang.String
            if (r6 != 0) goto L84
            boolean r6 = r5 instanceof java.lang.Boolean
            if (r6 != 0) goto L84
            boolean r6 = r5 instanceof java.lang.Integer
            if (r6 != 0) goto L84
            java.lang.Class r6 = r5.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = "emoji"
            boolean r6 = p000.q02.m4654(r6, r7, r1)
            if (r6 != 0) goto L88
            java.lang.Class r6 = r5.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = "sticker"
            boolean r6 = p000.q02.m4654(r6, r7, r1)
            if (r6 == 0) goto L84
            goto L88
        L84:
            int r4 = r4 + 1
            goto L4d
        L87:
            r5 = r0
        L88:
            if (r5 == 0) goto L8b
            goto L92
        L8b:
            r2 = 2
            java.lang.Object r5 = p000.AbstractC0312g7.m2253(r2, r14)
            goto L92
        L91:
            r5 = r0
        L92:
            java.lang.String r14 = "sticker"
            if (r5 != 0) goto L9e
            rl r14 = new rl
            jz r2 = p000.C0450jz.f5672
            r14.<init>(r2, r2)
            goto Ldb
        L9e:
            java.lang.String r2 = "emoji"
            java.lang.String[] r2 = new java.lang.String[]{r14, r2}
            java.util.Set r2 = p000.AbstractC0312g7.m2263(r2)
            java.lang.Object r14 = p000.AbstractC0978xb.m6572(r5, r14, r2)
            if (r14 != 0) goto Laf
            r14 = r5
        Laf:
            java.lang.String r2 = "animate_url"
            java.lang.String r4 = "animateUrl"
            java.lang.String r6 = "animatedUrl"
            java.lang.String[] r4 = new java.lang.String[]{r4, r6}
            java.util.Set r4 = p000.AbstractC0312g7.m2263(r4)
            java.lang.Object r2 = p000.AbstractC0978xb.m6572(r14, r2, r4)
            java.lang.String r4 = "static_url"
            java.lang.String r6 = "staticUrl"
            java.util.Set r6 = p000.g81.m2288(r6)
            java.lang.Object r14 = p000.AbstractC0978xb.m6572(r14, r4, r6)
            rl r4 = new rl
            java.util.List r2 = p000.AbstractC0978xb.m6585(r2)
            java.util.List r14 = p000.AbstractC0978xb.m6585(r14)
            r4.<init>(r2, r14)
            r14 = r4
        Ldb:
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.List r4 = r14.f9398
            r2.addAll(r4)
            java.util.List r4 = r14.f9399
            r2.addAll(r4)
            jz r4 = p000.C0450jz.f5672
            if (r5 != 0) goto Lf0
            goto L1ad
        Lf0:
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            java.util.List r7 = m4923(r5)
            r6.addAll(r7)
            boolean r7 = r5 instanceof android.view.View
            r8 = 10
            if (r7 != 0) goto L161
            boolean r7 = r5 instanceof android.content.Context
            if (r7 == 0) goto L107
            goto L161
        L107:
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.util.IdentityHashMap r7 = new java.util.IdentityHashMap
            r7.<init>()
            java.util.Set r7 = java.util.Collections.newSetFromMap(r7)
            m4920(r12, r5, r4, r7)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r7 = p000.AbstractC1021yh.m6889(r4, r8)
            r5.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L125:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L139
            java.lang.Object r7 = r4.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r7 = m4903(r7)
            r5.add(r7)
            goto L125
        L139:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r5.iterator()
        L142:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L159
            java.lang.Object r7 = r5.next()
            r9 = r7
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = m4898(r9)
            if (r9 == 0) goto L142
            r4.add(r7)
            goto L142
        L159:
            java.util.Set r4 = p000.AbstractC0984xh.m6670(r4)
            java.util.List r4 = p000.AbstractC0984xh.m6666(r4)
        L161:
            r6.addAll(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = p000.AbstractC1021yh.m6889(r6, r8)
            r4.<init>(r5)
            java.util.Iterator r5 = r6.iterator()
        L171:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L185
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = m4903(r6)
            r4.add(r6)
            goto L171
        L185:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L18e:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L1a5
            java.lang.Object r6 = r4.next()
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = m4898(r7)
            if (r7 == 0) goto L18e
            r5.add(r6)
            goto L18e
        L1a5:
            java.util.Set r4 = p000.AbstractC0984xh.m6670(r5)
            java.util.List r4 = p000.AbstractC0984xh.m6666(r4)
        L1ad:
            r2.addAll(r4)
            if (r3 == 0) goto L1bb
            r4 = 8
            java.util.List r4 = m4918(r3, r4)
            r2.addAll(r4)
        L1bb:
            if (r13 == 0) goto L1c5
            r4 = 5
            java.util.List r4 = m4918(r13, r4)
            r2.addAll(r4)
        L1c5:
            java.util.List r14 = r14.f9398
            java.lang.String r14 = m4915(r14)
            if (r14 != 0) goto L1da
            java.util.List r2 = p000.AbstractC0984xh.m6666(r2)
            java.lang.String r2 = m4915(r2)
            if (r2 != 0) goto L1db
            int r12 = com.example.dyhelper.MainHook.f2222
            return
        L1da:
            r2 = r14
        L1db:
            if (r13 == 0) goto L1e4
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r13)
            r6 = r4
            goto L1e5
        L1e4:
            r6 = r0
        L1e5:
            if (r3 == 0) goto L1ec
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
        L1ec:
            r7 = r0
            java.lang.String r8 = m4903(r2)
            if (r14 != 0) goto L1fc
            boolean r14 = m4929(r2)
            if (r14 == 0) goto L1fa
            goto L1fc
        L1fa:
            r9 = r12
            goto L1fd
        L1fc:
            r9 = r1
        L1fd:
            long r10 = java.lang.System.currentTimeMillis()
            ol r5 = new ol
            r5.<init>(r6, r7, r8, r9, r10)
            p000.C0728ql.f9044 = r5
            if (r13 == 0) goto L216
            java.util.Map r12 = p000.C0728ql.f9042
            monitor-enter(r12)
            r12.put(r13, r5)     // Catch: java.lang.Throwable -> L212
            monitor-exit(r12)
            goto L216
        L212:
            r0 = move-exception
            r13 = r0
            monitor-exit(r12)
            throw r13
        L216:
            m4921(r8)
            int r12 = com.example.dyhelper.MainHook.f2222
            return
    }

    /* JADX INFO: renamed from: β */
    public static final void m4911(java.lang.Object r5, java.util.List r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        Lf:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = m4903(r1)
            r0.add(r1)
            goto Lf
        L23:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "http"
            r4 = 0
            boolean r2 = p000.x02.m6485(r2, r3, r4)
            if (r2 == 0) goto L2c
            r6.add(r1)
            goto L2c
        L46:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L4d
            return
        L4d:
            java.util.Map r0 = p000.C0728ql.f9038
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r5)     // Catch: java.lang.Throwable -> L5f
            if (r1 != 0) goto L61
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5f
            r1.<init>()     // Catch: java.lang.Throwable -> L5f
            r0.put(r5, r1)     // Catch: java.lang.Throwable -> L5f
            goto L61
        L5f:
            r5 = move-exception
            goto L85
        L61:
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r0)
            monitor-enter(r1)
            java.util.Iterator r5 = r6.iterator()     // Catch: java.lang.Throwable -> L7f
        L69:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L7f
            if (r6 == 0) goto L81
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L7f
            boolean r0 = r1.contains(r6)     // Catch: java.lang.Throwable -> L7f
            if (r0 != 0) goto L69
            r1.add(r6)     // Catch: java.lang.Throwable -> L7f
            goto L69
        L7f:
            r5 = move-exception
            goto L83
        L81:
            monitor-exit(r1)
            return
        L83:
            monitor-exit(r1)
            throw r5
        L85:
            monitor-exit(r0)
            throw r5
    }

    /* JADX INFO: renamed from: γ */
    public static final void m4912(p000.C0728ql r5, android.view.ViewGroup r6) {
            r5 = 7
            long[] r0 = new long[r5]
            r0 = {x0018: FILL_ARRAY_DATA , data: [0, 120, 300, 600, 1000, 1500, 2000} // fill-array
            r1 = 0
        L7:
            if (r1 >= r5) goto L16
            r2 = r0[r1]
            gj r4 = new gj
            r4.<init>(r6, r2)
            r6.postDelayed(r4, r2)
            int r1 = r1 + 1
            goto L7
        L16:
            return
    }

    /* JADX INFO: renamed from: δ */
    public static final int m4913(java.lang.reflect.Method r7) {
            java.lang.Class r0 = r7.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = p000.AbstractC0602nx.m4134(r1, r0, r1)
            java.lang.Class[] r2 = r7.getParameterTypes()
            r2.getClass()
            r3 = 2
            java.lang.Object r2 = p000.AbstractC0312g7.m2253(r3, r2)
            java.lang.Class r2 = (java.lang.Class) r2
            if (r2 == 0) goto L2a
            java.lang.String r2 = r2.getName()
            java.lang.String r2 = r2.toLowerCase(r1)
            r2.getClass()
            goto L2b
        L2a:
            r2 = 0
        L2b:
            if (r2 != 0) goto L2f
            java.lang.String r2 = ""
        L2f:
            java.lang.String r3 = r7.toGenericString()
            r3.getClass()
            java.lang.String r1 = r3.toLowerCase(r1)
            r1.getClass()
            java.lang.String r3 = "similaremoji"
            r4 = 0
            boolean r3 = p000.q02.m4654(r0, r3, r4)
            if (r3 == 0) goto L49
            r3 = 1000(0x3e8, float:1.401E-42)
            goto L4a
        L49:
            r3 = r4
        L4a:
            java.lang.String r5 = "emoji"
            boolean r6 = p000.q02.m4654(r0, r5, r4)
            if (r6 == 0) goto L54
            int r3 = r3 + 700
        L54:
            java.lang.String r6 = "sticker"
            boolean r0 = p000.q02.m4654(r0, r6, r4)
            if (r0 == 0) goto L5e
            int r3 = r3 + 500
        L5e:
            boolean r0 = p000.q02.m4654(r2, r5, r4)
            if (r0 != 0) goto L6a
            boolean r0 = p000.q02.m4654(r2, r6, r4)
            if (r0 == 0) goto L6c
        L6a:
            int r3 = r3 + 300
        L6c:
            boolean r0 = p000.q02.m4654(r1, r5, r4)
            if (r0 != 0) goto L78
            boolean r0 = p000.q02.m4654(r1, r6, r4)
            if (r0 == 0) goto L7a
        L78:
            int r3 = r3 + 200
        L7a:
            java.lang.Class<android.view.ViewGroup> r0 = android.view.ViewGroup.class
            java.lang.Class r7 = r7.getDeclaringClass()
            boolean r7 = r0.isAssignableFrom(r7)
            if (r7 == 0) goto L88
            int r3 = r3 + 100
        L88:
            return r3
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.Object m4914(java.lang.Object r6, java.lang.String r7) {
            r0 = 0
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Throwable -> L27
            java.lang.reflect.Method[] r1 = r1.getMethods()     // Catch: java.lang.Throwable -> L27
            r1.getClass()     // Catch: java.lang.Throwable -> L27
            int r2 = r1.length     // Catch: java.lang.Throwable -> L27
            r3 = 0
        Le:
            if (r3 >= r2) goto L2c
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L27
            java.lang.String r5 = r4.getName()     // Catch: java.lang.Throwable -> L27
            boolean r5 = p000.ln0.m3626(r5, r7)     // Catch: java.lang.Throwable -> L27
            if (r5 == 0) goto L29
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L27
            r5.getClass()     // Catch: java.lang.Throwable -> L27
            int r5 = r5.length     // Catch: java.lang.Throwable -> L27
            if (r5 != 0) goto L29
            goto L2d
        L27:
            r6 = move-exception
            goto L39
        L29:
            int r3 = r3 + 1
            goto Le
        L2c:
            r4 = r0
        L2d:
            if (r4 != 0) goto L30
            return r0
        L30:
            r7 = 1
            r4.setAccessible(r7)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r4.invoke(r6, r0)     // Catch: java.lang.Throwable -> L27
            goto L3f
        L39:
            eo1 r7 = new eo1
            r7.<init>(r6)
            r6 = r7
        L3f:
            boolean r7 = r6 instanceof p000.eo1
            if (r7 == 0) goto L44
            goto L45
        L44:
            r0 = r6
        L45:
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.String m4915(java.util.List r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        Lf:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = m4903(r1)
            r0.add(r1)
            goto Lf
        L23:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "http"
            r4 = 0
            boolean r2 = p000.x02.m6485(r2, r3, r4)
            if (r2 == 0) goto L2c
            r5.add(r1)
            goto L2c
        L46:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L4f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r5.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = m4898(r2)
            if (r2 == 0) goto L4f
            r0.add(r1)
            goto L4f
        L66:
            java.util.Set r5 = p000.AbstractC0984xh.m6670(r0)
            java.util.List r5 = p000.AbstractC0984xh.m6666(r5)
            tf r0 = new tf
            r1 = 19
            r0.<init>(r1)
            java.util.List r5 = p000.AbstractC0984xh.m6658(r5, r0)
            java.lang.Object r5 = p000.AbstractC0984xh.m6640(r5)
            java.lang.String r5 = (java.lang.String) r5
            return r5
    }

    /* JADX INFO: renamed from: η */
    public static java.lang.String m4916(android.view.View r4) {
            um1 r0 = new um1
            r0.<init>()
            sm1 r1 = new sm1
            r1.<init>()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.f9967 = r2
            java.util.IdentityHashMap r2 = new java.util.IdentityHashMap
            r2.<init>()
            java.util.Set r2 = java.util.Collections.newSetFromMap(r2)
            r3 = 0
            m4917(r2, r1, r0, r4, r3)
            java.lang.Object r4 = r0.f10912
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L2f
            boolean r4 = p000.q02.m4671(r4)
            if (r4 == 0) goto L28
            goto L2f
        L28:
            java.lang.Object r4 = r0.f10912
            java.util.Objects.toString(r4)
            int r4 = com.example.dyhelper.MainHook.f2222
        L2f:
            java.lang.Object r4 = r0.f10912
            java.lang.String r4 = (java.lang.String) r4
            return r4
    }

    /* JADX INFO: renamed from: θ */
    public static final void m4917(java.util.Set r10, p000.sm1 r11, p000.um1 r12, android.view.View r13, int r14) {
            r0 = 14
            if (r14 <= r0) goto L6
            goto L1ab
        L6:
            boolean r0 = r10.add(r13)
            if (r0 != 0) goto Le
            goto L1ab
        Le:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.ArrayList r1 = m4927(r13)
            r0.addAll(r1)
            boolean r1 = m4897(r13)
            r2 = 10
            if (r1 != 0) goto L6d
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = p000.AbstractC1021yh.m6889(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = m4903(r2)
            r1.add(r2)
            goto L2f
        L43:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L4c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L63
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = m4898(r3)
            if (r3 == 0) goto L4c
            r0.add(r2)
            goto L4c
        L63:
            java.util.Set r0 = p000.AbstractC0984xh.m6670(r0)
            java.util.List r0 = p000.AbstractC0984xh.m6666(r0)
            goto Lf3
        L6d:
            java.lang.String r8 = "getSourceUri"
            java.lang.String r9 = "getUri"
            java.lang.String r3 = "getController"
            java.lang.String r4 = "getImageRequest"
            java.lang.String r5 = "getImageURI"
            java.lang.String r6 = "getImageUri"
            java.lang.String r7 = "getImageUrl"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r5, r6, r7, r8, r9}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            java.util.Iterator r1 = r1.iterator()
        L87:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto La1
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r3 = m4914(r13, r3)
            if (r3 == 0) goto L87
            java.util.List r3 = m4923(r3)
            r0.addAll(r3)
            goto L87
        La1:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = p000.AbstractC1021yh.m6889(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        Lae:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lc2
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = m4903(r2)
            r1.add(r2)
            goto Lae
        Lc2:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        Lcb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Le2
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = m4898(r3)
            if (r3 == 0) goto Lcb
            r0.add(r2)
            goto Lcb
        Le2:
            java.util.Set r0 = p000.AbstractC0984xh.m6670(r0)
            java.util.List r0 = p000.AbstractC0984xh.m6666(r0)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Lf3
            m4905(r13, r0)
        Lf3:
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 != 0) goto L190
            int r1 = r13.getWidth()
            int r3 = r13.getMeasuredWidth()
            int r1 = java.lang.Math.max(r1, r3)
            if (r1 >= 0) goto L109
            r1 = r2
        L109:
            int r3 = r13.getHeight()
            int r4 = r13.getMeasuredHeight()
            int r3 = java.lang.Math.max(r3, r4)
            if (r3 >= 0) goto L118
            r3 = r2
        L118:
            long r4 = (long) r1
            long r6 = (long) r3
            long r4 = r4 * r6
            r6 = 150(0x96, double:7.4E-322)
            long r4 = r4 / r6
            r6 = 2500(0x9c4, double:1.235E-320)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L125
            r4 = r6
        L125:
            int r1 = (int) r4
            java.util.Iterator r0 = r0.iterator()
        L12a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L190
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = m4903(r3)
            boolean r4 = m4898(r3)
            if (r4 == 0) goto L12a
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r4 = p000.AbstractC0602nx.m4134(r4, r3, r4)
            int r5 = m4907(r3)
            int r5 = r5 + r1
            boolean r6 = m4897(r13)
            if (r6 == 0) goto L153
            int r5 = r5 + 250
        L153:
            int r6 = r13.getVisibility()
            if (r6 != 0) goto L15b
            int r5 = r5 + 80
        L15b:
            java.lang.String r6 = "avatar"
            boolean r6 = p000.q02.m4654(r4, r6, r2)
            if (r6 != 0) goto L173
            java.lang.String r6 = "profile"
            boolean r6 = p000.q02.m4654(r4, r6, r2)
            if (r6 != 0) goto L173
            java.lang.String r6 = "user_avatar"
            boolean r6 = p000.q02.m4654(r4, r6, r2)
            if (r6 == 0) goto L175
        L173:
            int r5 = r5 + (-1500)
        L175:
            java.lang.String r6 = "thumb"
            boolean r6 = p000.q02.m4654(r4, r6, r2)
            if (r6 != 0) goto L185
            java.lang.String r6 = "cover"
            boolean r4 = p000.q02.m4654(r4, r6, r2)
            if (r4 == 0) goto L187
        L185:
            int r5 = r5 + (-800)
        L187:
            int r4 = r11.f9967
            if (r5 <= r4) goto L12a
            r11.f9967 = r5
            r12.f10912 = r3
            goto L12a
        L190:
            boolean r0 = r13 instanceof android.view.ViewGroup
            if (r0 == 0) goto L1ab
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            int r0 = r13.getChildCount()
        L19a:
            if (r2 >= r0) goto L1ab
            android.view.View r1 = r13.getChildAt(r2)
            r1.getClass()
            int r3 = r14 + 1
            m4917(r10, r11, r12, r1, r3)
            int r2 = r2 + 1
            goto L19a
        L1ab:
            return
    }

    /* JADX INFO: renamed from: ι */
    public static java.util.List m4918(android.view.View r3, int r4) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            r2 = 0
            m4919(r4, r1, r0, r3, r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = p000.AbstractC1021yh.m6889(r0, r4)
            r3.<init>(r4)
            java.util.Iterator r4 = r0.iterator()
        L21:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = m4903(r0)
            r3.add(r0)
            goto L21
        L35:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L3e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r0 = r3.next()
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = m4898(r1)
            if (r1 == 0) goto L3e
            r4.add(r0)
            goto L3e
        L55:
            java.util.Set r3 = p000.AbstractC0984xh.m6670(r4)
            java.util.List r3 = p000.AbstractC0984xh.m6666(r3)
            return r3
    }

    /* JADX INFO: renamed from: κ */
    public static final void m4919(int r4, java.util.Set r5, java.util.LinkedHashSet r6, android.view.View r7, int r8) {
            if (r8 <= r4) goto L3
            goto L2d
        L3:
            boolean r0 = r5.add(r7)
            if (r0 != 0) goto La
            goto L2d
        La:
            java.util.ArrayList r0 = m4927(r7)
            r6.addAll(r0)
            boolean r0 = r7 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2d
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r0 = r7.getChildCount()
            r1 = 0
        L1c:
            if (r1 >= r0) goto L2d
            android.view.View r2 = r7.getChildAt(r1)
            r2.getClass()
            int r3 = r8 + 1
            m4919(r4, r5, r6, r2, r3)
            int r1 = r1 + 1
            goto L1c
        L2d:
            return
    }

    /* JADX INFO: renamed from: λ */
    public static final void m4920(int r4, java.lang.Object r5, java.util.LinkedHashSet r6, java.util.Set r7) {
            if (r5 == 0) goto La7
            r0 = 3
            if (r4 > r0) goto La7
            int r0 = r6.size()
            r1 = 30
            if (r0 <= r1) goto Lf
            goto La7
        Lf:
            boolean r0 = r5 instanceof java.lang.String
            if (r0 != 0) goto La0
            boolean r0 = r5 instanceof android.net.Uri
            if (r0 == 0) goto L19
            goto La0
        L19:
            boolean r0 = r5 instanceof java.lang.Number
            if (r0 != 0) goto L9f
            boolean r0 = r5 instanceof java.lang.Boolean
            if (r0 != 0) goto L9f
            boolean r0 = r5 instanceof android.view.View
            if (r0 != 0) goto L9f
            boolean r0 = r5 instanceof android.content.Context
            if (r0 == 0) goto L2a
            return
        L2a:
            boolean r0 = r7.add(r5)
            if (r0 != 0) goto L32
            goto La7
        L32:
            java.util.List r0 = m4923(r5)
            r6.addAll(r0)
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.Throwable -> L49
            java.lang.reflect.Method[] r0 = r0.getMethods()     // Catch: java.lang.Throwable -> L49
            r0.getClass()     // Catch: java.lang.Throwable -> L49
            java.util.List r0 = p000.AbstractC0312g7.m2262(r0)     // Catch: java.lang.Throwable -> L49
            goto L50
        L49:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L50:
            java.lang.Throwable r1 = p000.fo1.m2190(r0)
            if (r1 != 0) goto L57
            goto L59
        L57:
            jz r0 = p000.C0450jz.f5672
        L59:
            java.util.List r0 = (java.util.List) r0
            f7 r1 = new f7
            r2 = 1
            r1.<init>(r2, r0)
            wj r0 = new wj
            r2 = 27
            r0.<init>(r2)
            y30 r2 = new y30
            r3 = 1
            r2.<init>(r1, r3, r0)
            r0 = 40
            ss1 r0 = p000.us1.m5947(r2, r0)
            java.util.Iterator r0 = r0.iterator()
        L78:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La7
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.setAccessible(r3)     // Catch: java.lang.Throwable -> L78
            r2 = 0
            java.lang.Object r1 = r1.invoke(r5, r2)     // Catch: java.lang.Throwable -> L78
            java.util.List r2 = m4923(r1)     // Catch: java.lang.Throwable -> L78
            r6.addAll(r2)     // Catch: java.lang.Throwable -> L78
            boolean r2 = m4908(r1)     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L78
            int r2 = r4 + 1
            m4920(r2, r1, r6, r7)     // Catch: java.lang.Throwable -> L78
            goto L78
        L9f:
            return
        La0:
            java.util.List r4 = m4923(r5)
            r6.addAll(r4)
        La7:
            return
    }

    /* JADX INFO: renamed from: μ */
    public static void m4921(java.lang.String r3) {
            java.lang.String r3 = m4903(r3)     // Catch: java.lang.Throwable -> L45
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = r3.getLastPathSegment()     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L1b
            r1 = 63
            java.lang.String r0 = p000.q02.m4689(r0, r1, r0)     // Catch: java.lang.Throwable -> L45
            r1 = 48
            java.lang.String r0 = p000.q02.m4693(r0, r1)     // Catch: java.lang.Throwable -> L45
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 != 0) goto L20
            java.lang.String r0 = ""
        L20:
            java.lang.String r1 = r3.getScheme()     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = r3.getHost()     // Catch: java.lang.Throwable -> L45
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r2.<init>()     // Catch: java.lang.Throwable -> L45
            r2.append(r1)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "://"
            r2.append(r1)     // Catch: java.lang.Throwable -> L45
            r2.append(r3)     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "/…/"
            r2.append(r3)     // Catch: java.lang.Throwable -> L45
            r2.append(r0)     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> L45
            goto L4c
        L45:
            r3 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r3)
            r3 = r0
        L4c:
            boolean r0 = r3 instanceof p000.eo1
            if (r0 == 0) goto L52
            java.lang.String r3 = "<invalid-emoji-url>"
        L52:
            java.lang.String r3 = (java.lang.String) r3
            return
    }

    /* JADX INFO: renamed from: ν */
    public static int m4922(android.content.Context r1, float r2) {
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r0 = 1
            float r1 = android.util.TypedValue.applyDimension(r0, r2, r1)
            int r1 = (int) r1
            return r1
    }

    /* JADX INFO: renamed from: ξ */
    public static java.util.List m4923(java.lang.Object r5) {
            if (r5 != 0) goto L5
            jz r5 = p000.C0450jz.f5672
            return r5
        L5:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            boolean r1 = r5 instanceof java.lang.String
            if (r1 == 0) goto L13
            r0.add(r5)
            goto L99
        L13:
            boolean r1 = r5 instanceof android.net.Uri
            if (r1 == 0) goto L22
            android.net.Uri r5 = (android.net.Uri) r5
            java.lang.String r5 = r5.toString()
            r0.add(r5)
            goto L99
        L22:
            boolean r1 = r5 instanceof java.lang.Object[]
            r2 = 0
            if (r1 == 0) goto L38
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            int r1 = r5.length
        L2a:
            if (r2 >= r1) goto L99
            r3 = r5[r2]
            java.util.List r3 = m4923(r3)
            r0.addAll(r3)
            int r2 = r2 + 1
            goto L2a
        L38:
            boolean r1 = r5 instanceof java.lang.Iterable
            if (r1 == 0) goto L54
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L42:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L99
            java.lang.Object r1 = r5.next()
            java.util.List r1 = m4923(r1)
            r0.addAll(r1)
            goto L42
        L54:
            java.lang.String r1 = "getSourceUri"
            java.lang.Object r1 = m4914(r5, r1)
            boolean r3 = r1 instanceof android.net.Uri
            if (r3 == 0) goto L61
            android.net.Uri r1 = (android.net.Uri) r1
            goto L62
        L61:
            r1 = 0
        L62:
            if (r1 == 0) goto L6b
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L6b:
            java.util.List r5 = p000.AbstractC1021yh.m6896(r5)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.IdentityHashMap r3 = new java.util.IdentityHashMap
            r3.<init>()
            java.util.Set r3 = java.util.Collections.newSetFromMap(r3)
            java.util.Iterator r5 = r5.iterator()
        L81:
            boolean r4 = r5.hasNext()
            if (r4 == 0) goto L92
            java.lang.Object r4 = r5.next()
            r3.getClass()
            p000.AbstractC0782s1.m5329(r2, r4, r1, r3)
            goto L81
        L92:
            java.util.List r5 = p000.AbstractC0984xh.m6666(r1)
            r0.addAll(r5)
        L99:
            java.util.ArrayList r5 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r0, r1)
            r5.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        La8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lbc
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = m4903(r1)
            r5.add(r1)
            goto La8
        Lbc:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        Lc5:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto Ldc
            java.lang.Object r1 = r5.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = m4898(r2)
            if (r2 == 0) goto Lc5
            r0.add(r1)
            goto Lc5
        Ldc:
            return r0
    }

    /* JADX INFO: renamed from: ο */
    public static android.view.View m4924(android.view.ViewGroup r4) {
            int r0 = r4.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L25
            android.view.View r2 = r4.getChildAt(r1)
            r2.getClass()
            boolean r3 = m4897(r2)
            if (r3 == 0) goto L15
            return r2
        L15:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L22
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r2 = m4924(r2)
            if (r2 == 0) goto L22
            return r2
        L22:
            int r1 = r1 + 1
            goto L5
        L25:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: π */
    public static android.view.ViewGroup m4925(android.view.View r4) {
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            boolean r1 = r4 instanceof android.view.ViewGroup
            if (r1 == 0) goto L28
            java.lang.String r2 = "RecyclerView"
            r3 = 1
            boolean r2 = p000.q02.m4654(r0, r2, r3)
            if (r2 != 0) goto L25
            java.lang.String r2 = "ListView"
            boolean r2 = p000.q02.m4654(r0, r2, r3)
            if (r2 != 0) goto L25
            java.lang.String r2 = "GridView"
            boolean r0 = p000.q02.m4654(r0, r2, r3)
            if (r0 == 0) goto L28
        L25:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            return r4
        L28:
            if (r1 == 0) goto L44
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r1 = 0
        L31:
            if (r1 >= r0) goto L44
            android.view.View r2 = r4.getChildAt(r1)
            r2.getClass()
            android.view.ViewGroup r2 = m4925(r2)
            if (r2 == 0) goto L41
            return r2
        L41:
            int r1 = r1 + 1
            goto L31
        L44:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ρ */
    public static android.view.View m4926(android.view.View r3) {
            java.lang.Object r0 = r3.getTag()
            java.lang.String r1 = "dyhelper_similar_emoji_download"
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto Ld
            return r3
        Ld:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2b
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r1 = 0
        L18:
            if (r1 >= r0) goto L2b
            android.view.View r2 = r3.getChildAt(r1)
            r2.getClass()
            android.view.View r2 = m4926(r2)
            if (r2 == 0) goto L28
            return r2
        L28:
            int r1 = r1 + 1
            goto L18
        L2b:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: σ */
    public static java.util.ArrayList m4927(android.view.View r3) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Map r1 = p000.C0728ql.f9037
            monitor-enter(r1)
            java.lang.Object r2 = r1.get(r3)     // Catch: java.lang.Throwable -> L14
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L16
            r0.addAll(r2)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r3 = move-exception
            goto L48
        L16:
            monitor-exit(r1)
            java.util.Map r1 = p000.C0728ql.f9036
            java.lang.Object r3 = r1.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L24
            r0.add(r3)
        L24:
            java.util.ArrayList r3 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r0, r1)
            r3.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L47
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = m4903(r1)
            r3.add(r1)
            goto L33
        L47:
            return r3
        L48:
            monitor-exit(r1)
            throw r3
    }

    /* JADX INFO: renamed from: τ */
    public static p000.C0627ol m4928(android.view.ViewGroup r8) {
            long r0 = java.lang.System.currentTimeMillis()
            java.util.Map r2 = p000.C0728ql.f9042
            monitor-enter(r2)
            java.lang.Object r3 = r2.get(r8)     // Catch: java.lang.Throwable -> L6b
            ol r3 = (p000.C0627ol) r3     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r2)
            r4 = 60000(0xea60, double:2.9644E-319)
            if (r3 == 0) goto L2d
            long r6 = r3.f8136
            long r6 = r0 - r6
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 > 0) goto L1c
            return r3
        L1c:
            monitor-enter(r2)
            java.lang.Object r6 = r2.get(r8)     // Catch: java.lang.Throwable -> L27
            if (r6 != r3) goto L29
            r2.remove(r8)     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r8 = move-exception
            goto L2b
        L29:
            monitor-exit(r2)
            goto L2d
        L2b:
            monitor-exit(r2)
            throw r8
        L2d:
            ol r2 = p000.C0728ql.f9044
            r3 = 0
            if (r2 != 0) goto L33
            goto L6a
        L33:
            long r6 = r2.f8136
            long r0 = r0 - r6
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L3b
            goto L6a
        L3b:
            java.lang.ref.WeakReference r0 = r2.f8132
            if (r0 == 0) goto L46
            java.lang.Object r0 = r0.get()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L47
        L46:
            r0 = r3
        L47:
            if (r0 != r8) goto L4a
            goto L5c
        L4a:
            java.lang.ref.WeakReference r0 = r2.f8133
            if (r0 == 0) goto L55
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            goto L56
        L55:
            r0 = r3
        L56:
            if (r0 == 0) goto L6a
        L58:
            if (r0 == 0) goto L6a
            if (r0 != r8) goto L5d
        L5c:
            return r2
        L5d:
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L68
            android.view.View r0 = (android.view.View) r0
            goto L58
        L68:
            r0 = r3
            goto L58
        L6a:
            return r3
        L6b:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
    }

    /* JADX INFO: renamed from: υ */
    public static boolean m4929(java.lang.String r2) {
            java.lang.String r2 = m4903(r2)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = p000.AbstractC0602nx.m4134(r0, r2, r0)
            java.lang.String r0 = ".gif"
            r1 = 0
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L3d
            java.lang.String r0 = "format=gif"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L3d
            java.lang.String r0 = ".apng"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L3d
            java.lang.String r0 = "format=apng"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L3d
            java.lang.String r0 = "awebp"
            boolean r0 = p000.q02.m4654(r2, r0, r1)
            if (r0 != 0) goto L3d
            java.lang.String r0 = "animated"
            boolean r2 = p000.q02.m4654(r2, r0, r1)
            if (r2 == 0) goto L3c
            goto L3d
        L3c:
            return r1
        L3d:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: φ */
    public final void m4930(java.lang.ClassLoader r6) {
            r5 = this;
            s62 r0 = p000.s62.f9751
            java.lang.Object r1 = p000.qe0.f8982
            java.lang.String r1 = "~7930256E7ABA5C12FF51912E81E1AE7426E0C157C10C5B9606215821C8BF5A7D5314FC6042B497E6A9"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.Class r6 = p000.qe0.m4877(r6, r1)
            if (r6 != 0) goto L11
            goto L56
        L11:
            xq0 r1 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "setImageURI"
            h r3 = new h     // Catch: java.lang.Throwable -> L23
            r4 = 21
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L23
            r1.m6774(r6, r2, r3)     // Catch: java.lang.Throwable -> L23
            int r1 = com.example.dyhelper.MainHook.f2222     // Catch: java.lang.Throwable -> L23
            r2 = r0
            goto L29
        L23:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
        L29:
            java.lang.Throwable r1 = p000.fo1.m2190(r2)
            if (r1 == 0) goto L34
            r1.toString()
            int r1 = com.example.dyhelper.MainHook.f2222
        L34:
            xq0 r1 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = "setImageRequest"
            h r3 = new h     // Catch: java.lang.Throwable -> L45
            r4 = 22
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L45
            r1.m6774(r6, r2, r3)     // Catch: java.lang.Throwable -> L45
            int r5 = com.example.dyhelper.MainHook.f2222     // Catch: java.lang.Throwable -> L45
            goto L4b
        L45:
            r5 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r5)
        L4b:
            java.lang.Throwable r5 = p000.fo1.m2190(r0)
            if (r5 == 0) goto L56
            r5.toString()
            int r5 = com.example.dyhelper.MainHook.f2222
        L56:
            return
    }

    /* JADX INFO: renamed from: χ */
    public final void m4931(java.lang.ClassLoader r8) {
            r7 = this;
            java.lang.String r0 = "~796C0BCB77AEABFA8EC367210A6EB7B3EF72CF5CA83249201C21F5BFD436DBA92B1217F9D98A8D0C6FFBCD5D684A5F4A89EFF07E808BEFB713014B4BD428"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "~7883762E16C12543E3F8A703D4C0C39A12F0A7D125B06A105A1F1A4BEAE04D56A284CB5FD4779D7E65875D959926B0D224164722C014BFB5F15BDC93D1F592B6B0FDFF9915"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Class r1 = p000.qe0.m4877(r8, r1)
            if (r1 != 0) goto L2b
            goto L18
        L2b:
            java.lang.String r2 = "setFirstAvailableImageRequests"
            java.lang.String r3 = "setImageRequests"
            java.lang.String r4 = "setUri"
            java.lang.String r5 = "setImageRequest"
            java.lang.String r6 = "setLowResImageRequest"
            java.lang.String[] r2 = new java.lang.String[]{r4, r5, r6, r2, r3}
            java.util.List r2 = p000.AbstractC1021yh.m6897(r2)
            java.util.Iterator r2 = r2.iterator()
        L41:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6c
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            xq0 r4 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L59
            h r5 = new h     // Catch: java.lang.Throwable -> L59
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L59
            java.util.Set r3 = r4.m6774(r1, r3, r5)     // Catch: java.lang.Throwable -> L59
            goto L60
        L59:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L60:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L41
            r3.toString()
            int r3 = com.example.dyhelper.MainHook.f2222
            goto L41
        L6c:
            xq0 r2 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = "build"
            h r4 = new h     // Catch: java.lang.Throwable -> L7c
            r5 = 24
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L7c
            java.util.Set r1 = r2.m6774(r1, r3, r4)     // Catch: java.lang.Throwable -> L7c
            goto L83
        L7c:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L83:
            java.lang.Throwable r1 = p000.fo1.m2190(r1)
            if (r1 == 0) goto L18
            r1.toString()
            int r1 = com.example.dyhelper.MainHook.f2222
            goto L18
        L8f:
            java.lang.Object r0 = p000.qe0.f8982
            java.lang.String r0 = "~7918AA8392D04C927673C5C14F855467DE3F5C8865926CBCFEDB9C06AC6EB6D33448CA"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r8 = p000.qe0.m4877(r8, r0)
            if (r8 != 0) goto L9e
            goto Lc3
        L9e:
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r1 = "setController"
            h r2 = new h     // Catch: java.lang.Throwable -> Lb1
            r3 = 25
            r2.<init>(r3, r7)     // Catch: java.lang.Throwable -> Lb1
            r0.m6774(r8, r1, r2)     // Catch: java.lang.Throwable -> Lb1
            int r7 = com.example.dyhelper.MainHook.f2222     // Catch: java.lang.Throwable -> Lb1
            s62 r7 = p000.s62.f9751     // Catch: java.lang.Throwable -> Lb1
            goto Lb8
        Lb1:
            r7 = move-exception
            eo1 r8 = new eo1
            r8.<init>(r7)
            r7 = r8
        Lb8:
            java.lang.Throwable r7 = p000.fo1.m2190(r7)
            if (r7 == 0) goto Lc3
            r7.toString()
            int r7 = com.example.dyhelper.MainHook.f2222
        Lc3:
            return
    }

    /* JADX INFO: renamed from: ψ */
    public final void m4932(p000.z81 r6) {
            r5 = this;
            monitor-enter(r5)
            boolean r0 = p000.C0728ql.f9034     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L7
            monitor-exit(r5)
            goto L33
        L7:
            r0 = 1
            p000.C0728ql.f9034 = r0     // Catch: java.lang.Throwable -> L30
            xq0 r1 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L1d
            java.lang.Class<android.view.View> r2 = android.view.View.class
            java.lang.String r3 = "onAttachedToWindow"
            pl r4 = new pl     // Catch: java.lang.Throwable -> L1d
            r4.<init>(r5, r0)     // Catch: java.lang.Throwable -> L1d
            r1.m6774(r2, r3, r4)     // Catch: java.lang.Throwable -> L1d
            int r0 = com.example.dyhelper.MainHook.f2222     // Catch: java.lang.Throwable -> L1d
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r0 = move-exception
            eo1 r1 = new eo1     // Catch: java.lang.Throwable -> L30
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L30
            r0 = r1
        L24:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L32
            r0.toString()     // Catch: java.lang.Throwable -> L30
            int r0 = com.example.dyhelper.MainHook.f2222     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            r6 = move-exception
            goto L5f
        L32:
            monitor-exit(r5)
        L33:
            java.lang.ClassLoader r5 = r6.f13011
            java.util.ArrayList r5 = m4901(r5)
            java.util.Iterator r5 = r5.iterator()
        L3d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r0 = r5.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            ql r1 = p000.C0728ql.f9031
            java.lang.Class r2 = r0.getDeclaringClass()
            r2.getClass()
            m4904(r2)
            r1.m4933(r0)
            goto L3d
        L59:
            java.lang.ClassLoader r5 = r6.f13011
            m4896(r5)
            return
        L5f:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L30
            throw r6
    }

    /* JADX INFO: renamed from: ω */
    public final boolean m4933(java.lang.reflect.Method r6) {
            r5 = this;
            java.lang.String r0 = m4902(r6)
            java.util.Set r1 = p000.C0728ql.f9041
            boolean r2 = r1.add(r0)
            r3 = 0
            if (r2 != 0) goto Le
            return r3
        Le:
            r2 = 1
            r6.setAccessible(r2)     // Catch: java.lang.Throwable -> L21
            xq0 r2 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L21
            pl r4 = new pl     // Catch: java.lang.Throwable -> L21
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L21
            r2.m6775(r6, r4)     // Catch: java.lang.Throwable -> L21
            int r5 = com.example.dyhelper.MainHook.f2222     // Catch: java.lang.Throwable -> L21
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L21
            goto L28
        L21:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L28:
            java.lang.Throwable r6 = p000.fo1.m2190(r5)
            if (r6 != 0) goto L2f
            goto L39
        L2f:
            r1.remove(r0)
            r6.toString()
            int r5 = com.example.dyhelper.MainHook.f2222
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L39:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
    }
}
