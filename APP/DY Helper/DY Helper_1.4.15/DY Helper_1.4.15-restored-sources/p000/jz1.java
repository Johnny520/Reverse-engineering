package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class jz1 {

    /* JADX INFO: renamed from: α */
    public static final java.util.LinkedHashSet f5676 = null;

    /* JADX INFO: renamed from: β */
    public static final android.os.Handler f5677 = null;

    /* JADX INFO: renamed from: γ */
    public static p000.RunnableC0376hy f5678;

    static {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            p000.jz1.f5676 = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.jz1.f5677 = r0
            return
    }

    /* JADX INFO: renamed from: Α */
    public static void m3080(android.widget.TextView r1, java.lang.String r2, java.lang.String r3) {
            int r2 = p000.jx0.m3048(r2)
            r1.setTextColor(r2)
            r2 = 0
            r0 = 1
            r1.setTypeface(r2, r0)
            android.content.Context r2 = r1.getContext()
            r2.getClass()
            r0 = 8
            android.graphics.drawable.GradientDrawable r2 = p000.jx0.m3062(r0, r2, r3)
            r1.setBackground(r2)
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m3081(android.view.View r4, p000.C1000xx r5) {
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            boolean r1 = r4 instanceof android.view.ViewGroup
            if (r1 != 0) goto L20
            boolean r2 = r4 instanceof android.widget.TextView
            if (r2 != 0) goto L20
            if (r0 == 0) goto L20
            int r2 = r0.height
            r3 = 1
            if (r2 == r3) goto L17
            int r0 = r0.width
            if (r0 != r3) goto L20
        L17:
            java.lang.String r0 = r5.f12353
            int r0 = android.graphics.Color.parseColor(r0)
            r4.setBackgroundColor(r0)
        L20:
            if (r1 == 0) goto L38
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r1 = 0
        L29:
            if (r1 >= r0) goto L38
            android.view.View r2 = r4.getChildAt(r1)
            r2.getClass()
            m3081(r2, r5)
            int r1 = r1 + 1
            goto L29
        L38:
            return
    }

    /* JADX INFO: renamed from: β */
    public static android.widget.LinearLayout m3082(android.app.Activity r16, java.lang.String r17, java.util.List r18, java.lang.String r19, p000.C1000xx r20, p000.a80 r21) {
            r7 = r16
            r0 = r17
            r6 = r20
            um1 r1 = new um1
            r1.<init>()
            r2 = r19
            r1.f10912 = r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2 = 1
            android.widget.LinearLayout r8 = p000.AbstractC0602nx.m4123(r7, r2)
            r9 = 6
            r10 = 0
            r11 = 1095761920(0x41500000, float:13.0)
            r12 = 0
            if (r0 == 0) goto L4b
            boolean r3 = p000.q02.m4671(r0)
            if (r3 == 0) goto L27
            goto L4b
        L27:
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r7)
            r3.setText(r0)
            r3.setTextSize(r11)
            r3.setTypeface(r10, r2)
            java.lang.String r0 = r6.f12355
            int r0 = android.graphics.Color.parseColor(r0)
            r3.setTextColor(r0)
            r3.setIncludeFontPadding(r12)
            int r0 = m3086(r7, r9)
            r3.setPadding(r12, r12, r12, r0)
            r8.addView(r3)
        L4b:
            java.util.Iterator r13 = r18.iterator()
            r0 = r12
        L50:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto Lbb
            java.lang.Object r2 = r13.next()
            int r14 = r0 + 1
            if (r0 < 0) goto Lb5
            fz1 r2 = (p000.fz1) r2
            android.widget.TextView r15 = new android.widget.TextView
            r15.<init>(r7)
            java.lang.String r3 = r2.f4180
            r15.setTag(r3)
            r15.setTextSize(r11)
            r3 = 16
            r15.setGravity(r3)
            r3 = 38
            int r5 = m3086(r7, r3)
            r15.setMinHeight(r5)
            r5 = 10
            r19 = r10
            int r10 = m3086(r7, r5)
            int r5 = m3086(r7, r5)
            r15.setPadding(r10, r12, r5, r12)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r10 = -1
            int r3 = m3086(r7, r3)
            r5.<init>(r10, r3)
            if (r0 <= 0) goto L9c
            int r0 = m3086(r7, r9)
            r5.topMargin = r0
        L9c:
            r15.setLayoutParams(r5)
            tt1 r0 = new tt1
            r5 = r18
            r3 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r15.setOnClickListener(r0)
            r4.add(r15)
            r8.addView(r15)
            r10 = r19
            r0 = r14
            goto L50
        Lb5:
            r19 = r10
            p000.AbstractC1021yh.m6917()
            throw r19
        Lbb:
            r5 = r18
            m3083(r4, r1, r5, r6, r7)
            return r8
    }

    /* JADX INFO: renamed from: γ */
    public static final void m3083(java.util.ArrayList r7, p000.um1 r8, java.util.List r9, p000.C1000xx r10, android.app.Activity r11) {
            java.util.Iterator r7 = r7.iterator()
        L4:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r7.next()
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.Object r1 = r0.getTag()
            r1.getClass()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r8.f10912
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L24
            java.lang.String r3 = "✓ "
            goto L26
        L24:
            java.lang.String r3 = ""
        L26:
            java.util.Iterator r4 = r9.iterator()
        L2a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L65
            java.lang.Object r5 = r4.next()
            fz1 r5 = (p000.fz1) r5
            java.lang.String r6 = r5.f4180
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L2a
            java.lang.String r1 = r5.f4181
            java.lang.String r1 = r3.concat(r1)
            r0.setText(r1)
            if (r2 == 0) goto L4c
            java.lang.String r1 = r10.f12358
            goto L4e
        L4c:
            java.lang.String r1 = r10.f12355
        L4e:
            r3 = 0
            p000.lz1.m3699(r1, r0, r3, r2)
            java.lang.String r1 = r10.f12348
            if (r2 == 0) goto L59
            java.lang.String r2 = r10.f12359
            goto L5b
        L59:
            java.lang.String r2 = r10.f12352
        L5b:
            r3 = 10
            android.graphics.drawable.RippleDrawable r1 = p000.jx0.m3059(r3, r11, r1, r2)
            r0.setBackground(r1)
            goto L4
        L65:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException
            java.lang.String r8 = "Collection contains no element matching the predicate."
            r7.<init>(r8)
            throw r7
        L6d:
            return
    }

    /* JADX INFO: renamed from: δ */
    public static android.widget.TextView m3084(android.app.Activity r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, p000.p70 r7) {
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r3)
            r0.setText(r4)
            r4 = 1093664768(0x41300000, float:11.0)
            r0.setTextSize(r4)
            r4 = 0
            r1 = 1
            r0.setTypeface(r4, r1)
            int r4 = p000.jx0.m3048(r5)
            r0.setTextColor(r4)
            r4 = 17
            r0.setGravity(r4)
            r4 = 9
            int r5 = m3086(r3, r4)
            r1 = 5
            int r2 = m3086(r3, r1)
            int r4 = m3086(r3, r4)
            int r1 = m3086(r3, r1)
            r0.setPadding(r5, r2, r4, r1)
            xx r4 = p000.jx0.m3049(r3)
            java.lang.String r4 = r4.f12348
            r5 = 99
            android.graphics.drawable.RippleDrawable r4 = p000.jx0.m3059(r5, r3, r4, r6)
            r0.setBackground(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r4.<init>(r5, r5)
            r5 = 6
            int r3 = m3086(r3, r5)
            r4.setMarginStart(r3)
            r0.setLayoutParams(r4)
            b9 r3 = new b9
            r4 = 8
            r3.<init>(r4, r7)
            r0.setOnClickListener(r3)
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.String m3085(p000.ip1 r1) {
            int r1 = r1.ordinal()
            if (r1 == 0) goto L17
            r0 = 1
            if (r1 == r0) goto L14
            r0 = 2
            if (r1 != r0) goto Lf
            java.lang.String r1 = "关"
            return r1
        Lf:
            p000.C1080.m7272()
            r1 = 0
            return r1
        L14:
            java.lang.String r1 = "开"
            return r1
        L17:
            java.lang.String r1 = "跟"
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public static int m3086(android.content.Context r0, int r1) {
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

    /* JADX INFO: renamed from: η */
    public static void m3087(android.view.View r3, p000.a80 r4) {
            boolean r0 = r3 instanceof android.widget.TextView
            if (r0 == 0) goto L7
            r4.invoke(r3)
        L7:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L21
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r1 = 0
        L12:
            if (r1 >= r0) goto L21
            android.view.View r2 = r3.getChildAt(r1)
            r2.getClass()
            m3087(r2, r4)
            int r1 = r1 + 1
            goto L12
        L21:
            return
    }

    /* JADX INFO: renamed from: θ */
    public static void m3088(android.view.View r8, android.view.DragEvent r9) {
            int r0 = r9.getAction()
            r1 = 4
            if (r0 == r1) goto Lbf
            int r0 = r9.getAction()
            r1 = 3
            if (r0 != r1) goto L10
            goto Lbf
        L10:
            int r0 = r9.getAction()
            r1 = 6
            r2 = 2
            if (r0 == r2) goto L26
            int r0 = r9.getAction()
            r3 = 5
            if (r0 == r3) goto L26
            int r0 = r9.getAction()
            if (r0 == r1) goto L26
            goto L3f
        L26:
            android.view.ViewParent r0 = r8.getParent()
        L2a:
            boolean r3 = r0 instanceof android.view.View
            if (r3 == 0) goto L3c
            boolean r3 = r0 instanceof android.widget.ScrollView
            if (r3 == 0) goto L35
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            goto L3d
        L35:
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r0 = r0.getParent()
            goto L2a
        L3c:
            r0 = 0
        L3d:
            if (r0 != 0) goto L40
        L3f:
            return
        L40:
            int[] r3 = new int[r2]
            int[] r2 = new int[r2]
            r8.getLocationOnScreen(r3)
            r0.getLocationOnScreen(r2)
            float r9 = r9.getY()
            r4 = 1
            r3 = r3[r4]
            float r3 = (float) r3
            float r9 = r9 + r3
            r2 = r2[r4]
            float r2 = (float) r2
            float r9 = r9 - r2
            android.content.Context r2 = r8.getContext()
            r2.getClass()
            r3 = 48
            int r2 = m3086(r2, r3)
            android.content.Context r8 = r8.getContext()
            r8.getClass()
            r3 = 64
            int r8 = m3086(r8, r3)
            int r3 = r0.getHeight()
            int r3 = r3 - r8
            float r2 = (float) r2
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            r5 = 22
            r6 = 1065353216(0x3f800000, float:1.0)
            r7 = 1045220557(0x3e4ccccd, float:0.2)
            if (r4 >= 0) goto L90
            float r8 = r2 - r9
            float r8 = r8 / r2
            float r8 = p000.j81.m2905(r8, r7, r6)
            float r9 = (float) r1
            float r1 = (float) r5
            float r8 = r8 * r1
            float r8 = r8 + r9
            int r8 = (int) r8
            int r8 = -r8
            goto La3
        L90:
            float r2 = (float) r3
            int r3 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r3 <= 0) goto La2
            float r9 = r9 - r2
            float r8 = (float) r8
            float r9 = r9 / r8
            float r8 = p000.j81.m2905(r9, r7, r6)
            float r9 = (float) r1
            float r1 = (float) r5
            float r8 = r8 * r1
            float r8 = r8 + r9
            int r8 = (int) r8
            goto La3
        La2:
            r8 = 0
        La3:
            if (r8 != 0) goto La9
            m3104()
            return
        La9:
            hy r9 = p000.jz1.f5678
            android.os.Handler r1 = p000.jz1.f5677
            if (r9 == 0) goto Lb2
            r1.removeCallbacks(r9)
        Lb2:
            hy r9 = new hy
            r9.<init>(r0, r8)
            r2 = 250(0xfa, double:1.235E-321)
            r1.postDelayed(r9, r2)
            p000.jz1.f5678 = r9
            return
        Lbf:
            m3104()
            return
    }

    /* JADX INFO: renamed from: ι */
    public static boolean m3089(p000.ky1 r8, java.lang.String r9) {
            java.lang.String r9 = m3090(r9)
            boolean r0 = p000.q02.m4671(r9)
            r1 = 0
            if (r0 == 0) goto Ld
            goto L99
        Ld:
            java.lang.String r0 = r8.f6322
            long r2 = r8.f6324
            java.lang.CharSequence r8 = p000.q02.m4660(r0)
            java.lang.String r8 = r8.toString()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r8 = p000.AbstractC0602nx.m4134(r0, r8, r0)
            java.lang.String r4 = java.lang.String.valueOf(r2)
            java.lang.CharSequence r4 = p000.q02.m4660(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = r4.toLowerCase(r0)
            r0.getClass()
            java.lang.String r4 = "cid:"
            boolean r5 = p000.x02.m6485(r9, r4, r1)
            if (r5 == 0) goto L59
            java.lang.String r9 = p000.q02.m4678(r9, r4)
            java.lang.CharSequence r9 = p000.q02.m4660(r9)
            java.lang.String r9 = r9.toString()
            boolean r0 = p000.q02.m4671(r9)
            if (r0 != 0) goto L99
            boolean r0 = p000.q02.m4671(r8)
            if (r0 != 0) goto L99
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L99
            goto L97
        L59:
            java.lang.String r4 = "uid:"
            boolean r5 = p000.x02.m6485(r9, r4, r1)
            r6 = 0
            if (r5 == 0) goto L80
            java.lang.String r8 = p000.q02.m4678(r9, r4)
            java.lang.CharSequence r8 = p000.q02.m4660(r8)
            java.lang.String r8 = r8.toString()
            boolean r9 = p000.q02.m4671(r8)
            if (r9 != 0) goto L99
            int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r9 <= 0) goto L99
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L99
            goto L97
        L80:
            boolean r4 = p000.q02.m4671(r8)
            if (r4 != 0) goto L8d
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L8d
            goto L97
        L8d:
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 <= 0) goto L99
            boolean r8 = r9.equals(r0)
            if (r8 == 0) goto L99
        L97:
            r8 = 1
            return r8
        L99:
            return r1
    }

    /* JADX INFO: renamed from: κ */
    public static java.lang.String m3090(java.lang.String r4) {
            java.lang.String r0 = "#"
            java.lang.String r4 = p000.q02.m4690(r4, r0, r4)
            java.lang.CharSequence r4 = p000.q02.m4660(r4)
            java.lang.String r4 = r4.toString()
        Le:
            java.lang.String r0 = "!"
            r1 = 0
            boolean r0 = p000.x02.m6485(r4, r0, r1)
            if (r0 != 0) goto L51
            java.lang.String r0 = "-"
            boolean r0 = p000.x02.m6485(r4, r0, r1)
            if (r0 == 0) goto L20
            goto L51
        L20:
            java.util.Locale r0 = java.util.Locale.US
            r0.getClass()
            java.lang.String r2 = r4.toLowerCase(r0)
            r2.getClass()
            java.lang.String r3 = "name:"
            boolean r1 = p000.x02.m6485(r2, r3, r1)
            if (r1 == 0) goto L35
            goto L49
        L35:
            java.lang.String r1 = "|"
            java.lang.String r4 = p000.q02.m4690(r4, r1, r4)
            java.lang.String r1 = " "
            java.lang.String r4 = p000.q02.m4690(r4, r1, r4)
            java.lang.CharSequence r4 = p000.q02.m4660(r4)
            java.lang.String r4 = r4.toString()
        L49:
            java.lang.String r4 = r4.toLowerCase(r0)
            r4.getClass()
            return r4
        L51:
            r0 = 1
            java.lang.String r4 = r4.substring(r0)
            java.lang.CharSequence r4 = p000.q02.m4660(r4)
            java.lang.String r4 = r4.toString()
            goto Le
    }

    /* JADX INFO: renamed from: λ */
    public static java.util.ArrayList m3091() {
            java.lang.String r0 = "spark_custom_renew_rules"
            java.lang.String r1 = ""
            java.lang.String r0 = p000.ui1.m5893(r0, r1)
            java.lang.String r1 = "\r"
            java.lang.String r2 = "\n"
            java.lang.String r0 = p000.x02.m6483(r0, r1, r2)
            java.util.List r0 = p000.q02.m4675(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p000.AbstractC1021yh.m6889(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            r1.add(r2)
            goto L23
        L3b:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L44:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5b
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = p000.q02.m4671(r3)
            if (r3 != 0) goto L44
            r0.add(r2)
            goto L44
        L5b:
            return r0
    }

    /* JADX INFO: renamed from: μ */
    public static java.lang.String m3092(java.lang.String r2) {
            int r0 = r2.hashCode()
            r1 = -1581365343(0xffffffffa1be47a1, float:-1.2893861E-18)
            if (r0 == r1) goto L2c
            r1 = 1611556205(0x600e656d, float:4.104291E19)
            if (r0 == r1) goto L20
            r1 = 1928784663(0x72f6eb17, float:9.7814424E30)
            if (r0 == r1) goto L14
            goto L34
        L14:
            java.lang.String r0 = "due_only"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1d
            goto L34
        L1d:
            java.lang.String r2 = "仅待续"
            return r2
        L20:
            java.lang.String r0 = "custom_on"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L29
            goto L34
        L29:
            java.lang.String r2 = "整组自定义"
            return r2
        L2c:
            java.lang.String r0 = "custom_off"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L37
        L34:
            java.lang.String r2 = "跟随默认"
            return r2
        L37:
            java.lang.String r2 = "整组排除"
            return r2
    }

    /* JADX INFO: renamed from: ν */
    public static void m3093(android.app.Activity r11, p000.ky1 r12, boolean r13) {
            java.lang.String r0 = "spark_custom_renew_enabled"
            r1 = 0
            boolean r2 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> Ld
            if (r2 != 0) goto L11
            p000.ui1.m5896(r11)     // Catch: java.lang.Throwable -> Ld
            goto L11
        Ld:
            r0 = move-exception
            r12 = r0
            goto L15a
        L11:
            java.util.ArrayList r2 = m3091()     // Catch: java.lang.Throwable -> Ld
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld
            r3.<init>()     // Catch: java.lang.Throwable -> Ld
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Ld
        L1e:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> Ld
            if (r4 == 0) goto L35
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> Ld
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Ld
            boolean r5 = m3089(r12, r5)     // Catch: java.lang.Throwable -> Ld
            if (r5 != 0) goto L1e
            r3.add(r4)     // Catch: java.lang.Throwable -> Ld
            goto L1e
        L35:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Ld
            if (r13 == 0) goto L50
            ry1 r3 = p000.ry1.f9602     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = p000.ry1.m5211(r3, r12)     // Catch: java.lang.Throwable -> Ld
            r2.add(r3)     // Catch: java.lang.Throwable -> Ld
            boolean r3 = p000.ui1.m5887(r0, r1)     // Catch: java.lang.Throwable -> Ld
            if (r3 != 0) goto L82
            r3 = 1
            p000.ui1.m5871(r0, r3)     // Catch: java.lang.Throwable -> Ld
            goto L82
        L50:
            ry1 r0 = p000.ry1.f9602     // Catch: java.lang.Throwable -> Ld
            r0.getClass()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = p000.ry1.m5211(r0, r12)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = "#"
            java.lang.String r0 = p000.q02.m4690(r0, r3, r0)     // Catch: java.lang.Throwable -> Ld
            java.lang.CharSequence r0 = p000.q02.m4660(r0)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = p000.ry1.m5197(r12)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r5 = " "
            java.lang.String r3 = p000.x02.m6483(r4, r3, r5)     // Catch: java.lang.Throwable -> Ld
            r4 = 40
            java.lang.String r3 = p000.q02.m4693(r3, r4)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = "!"
            java.lang.String r5 = " # off "
            java.lang.String r0 = p000.a12.m18(r4, r0, r5, r3)     // Catch: java.lang.Throwable -> Ld
            r2.add(r0)     // Catch: java.lang.Throwable -> Ld
        L82:
            java.lang.Object r0 = p000.ui1.f10844     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = "spark_custom_renew_rules"
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld
            r4 = 10
            int r4 = p000.AbstractC1021yh.m6889(r2, r4)     // Catch: java.lang.Throwable -> Ld
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Ld
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Ld
        L95:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> Ld
            if (r4 == 0) goto Lad
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Ld
            java.lang.CharSequence r4 = p000.q02.m4660(r4)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Ld
            r3.add(r4)     // Catch: java.lang.Throwable -> Ld
            goto L95
        Lad:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld
            r2.<init>()     // Catch: java.lang.Throwable -> Ld
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Ld
        Lb6:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Ld
            if (r4 == 0) goto Lcd
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Ld
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> Ld
            boolean r5 = p000.q02.m4671(r5)     // Catch: java.lang.Throwable -> Ld
            if (r5 != 0) goto Lb6
            r2.add(r4)     // Catch: java.lang.Throwable -> Ld
            goto Lb6
        Lcd:
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> Ld
            r3.<init>()     // Catch: java.lang.Throwable -> Ld
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld
            r4.<init>()     // Catch: java.lang.Throwable -> Ld
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Ld
        Ldb:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> Ld
            if (r5 == 0) goto L108
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> Ld
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> Ld
            java.lang.String r7 = m3090(r6)     // Catch: java.lang.Throwable -> Ld
            boolean r8 = p000.q02.m4671(r7)     // Catch: java.lang.Throwable -> Ld
            if (r8 == 0) goto Lfe
            java.util.Locale r7 = java.util.Locale.US     // Catch: java.lang.Throwable -> Ld
            r7.getClass()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r7 = r6.toLowerCase(r7)     // Catch: java.lang.Throwable -> Ld
            r7.getClass()     // Catch: java.lang.Throwable -> Ld
        Lfe:
            boolean r6 = r3.add(r7)     // Catch: java.lang.Throwable -> Ld
            if (r6 == 0) goto Ldb
            r4.add(r5)     // Catch: java.lang.Throwable -> Ld
            goto Ldb
        L108:
            java.lang.String r5 = "\n"
            r9 = 0
            r10 = 62
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r2 = p000.AbstractC0984xh.m6644(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Ld
            p000.ui1.m5875(r0, r2)     // Catch: java.lang.Throwable -> Ld
            if (r13 == 0) goto L136
            ry1 r13 = p000.ry1.f9602     // Catch: java.lang.Throwable -> Ld
            java.lang.String r12 = p000.ry1.m5197(r12)     // Catch: java.lang.Throwable -> Ld
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            r13.<init>()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = "已开启 "
            r13.append(r0)     // Catch: java.lang.Throwable -> Ld
            r13.append(r12)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r12 = " 的自定义续火"
            r13.append(r12)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Throwable -> Ld
            goto L152
        L136:
            ry1 r13 = p000.ry1.f9602     // Catch: java.lang.Throwable -> Ld
            java.lang.String r12 = p000.ry1.m5197(r12)     // Catch: java.lang.Throwable -> Ld
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            r13.<init>()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = "已关闭 "
            r13.append(r0)     // Catch: java.lang.Throwable -> Ld
            r13.append(r12)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r12 = " 的自定义续火规则"
            r13.append(r12)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Throwable -> Ld
        L152:
            android.widget.Toast r12 = android.widget.Toast.makeText(r11, r12, r1)     // Catch: java.lang.Throwable -> Ld
            r12.show()     // Catch: java.lang.Throwable -> Ld
            return
        L15a:
            java.lang.String r13 = r12.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "修改自定义续火失败: "
            r0.<init>(r2)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            java.lang.String r0 = "DYHelper"
            p000.C0888ux.m5977(r0, r13, r12)
            java.lang.String r12 = r12.getMessage()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "操作失败: "
            r13.<init>(r0)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            android.widget.Toast r11 = android.widget.Toast.makeText(r11, r12, r1)
            r11.show()
            return
    }

    /* JADX INFO: renamed from: ξ */
    public static void m3094(android.app.Activity r30) {
            r4 = r30
            xx r1 = p000.jx0.m3049(r4)
            java.lang.String r0 = r1.f12348
            java.lang.String r2 = r1.f12352
            x01 r3 = p000.x01.f11964
            android.view.LayoutInflater r5 = r3.m6477(r4)
            r3 = 2131492922(0x7f0c003a, float:1.860931E38)
            r6 = 0
            android.view.View r3 = r5.inflate(r3, r6)
            r3.getClass()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.content.Context r6 = r3.getContext()
            r6.getClass()
            java.lang.String r7 = r1.f12351
            r8 = 18
            android.graphics.drawable.GradientDrawable r6 = p000.jx0.m3062(r8, r6, r7)
            r3.setBackground(r6)
            r6 = 2131296962(0x7f0902c2, float:1.8211855E38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r6 = 2131296477(0x7f0900dd, float:1.8210872E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r6 = 2131296476(0x7f0900dc, float:1.821087E38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r10 = 2131296474(0x7f0900da, float:1.8210866E38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11 = 2131296475(0x7f0900db, float:1.8210868E38)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 2131296473(0x7f0900d9, float:1.8210864E38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Integer[] r7 = new java.lang.Integer[]{r7, r8, r9, r10, r11, r12}
            java.util.List r7 = p000.AbstractC1021yh.m6897(r7)
            java.util.Iterator r7 = r7.iterator()
        L65:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L8c
            java.lang.Object r8 = r7.next()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            android.view.View r8 = r3.findViewById(r8)
            if (r8 == 0) goto L65
            android.content.Context r9 = r3.getContext()
            r9.getClass()
            r10 = 14
            android.graphics.drawable.GradientDrawable r9 = p000.jx0.m3062(r10, r9, r2)
            r8.setBackground(r9)
            goto L65
        L8c:
            m3081(r3, r1)
            sy1 r7 = new sy1
            r8 = 1
            r7.<init>(r1, r8)
            m3087(r3, r7)
            r7 = 2131297113(0x7f090359, float:1.8212162E38)
            android.view.View r7 = r3.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r9 = 2131297122(0x7f090362, float:1.821218E38)
            android.view.View r9 = r3.findViewById(r9)
            r11 = r9
            android.widget.TextView r11 = (android.widget.TextView) r11
            r9 = 2131297126(0x7f090366, float:1.8212188E38)
            android.view.View r9 = r3.findViewById(r9)
            r12 = r9
            android.widget.TextView r12 = (android.widget.TextView) r12
            r9 = 2131297130(0x7f09036a, float:1.8212196E38)
            android.view.View r9 = r3.findViewById(r9)
            r13 = r9
            android.widget.TextView r13 = (android.widget.TextView) r13
            r9 = 2131297128(0x7f090368, float:1.8212192E38)
            android.view.View r9 = r3.findViewById(r9)
            r14 = r9
            android.widget.TextView r14 = (android.widget.TextView) r14
            android.view.View r6 = r3.findViewById(r6)
            r9 = 2131296877(0x7f09026d, float:1.8211683E38)
            android.view.View r9 = r3.findViewById(r9)
            r10 = 2131296977(0x7f0902d1, float:1.8211886E38)
            android.view.View r10 = r3.findViewById(r10)
            android.widget.Switch r10 = (android.widget.Switch) r10
            r15 = 2131297115(0x7f09035b, float:1.8212166E38)
            android.view.View r15 = r3.findViewById(r15)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r8 = 2131296958(0x7f0902be, float:1.8211847E38)
            android.view.View r8 = r3.findViewById(r8)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r17 = r5
            r5 = 2131296880(0x7f090270, float:1.821169E38)
            android.view.View r5 = r3.findViewById(r5)
            r18 = r6
            r6 = 2131296513(0x7f090101, float:1.8210945E38)
            android.view.View r6 = r3.findViewById(r6)
            r19 = r7
            r7 = 2131297123(0x7f090363, float:1.8212182E38)
            android.view.View r7 = r3.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r20 = r7
            r7 = 2131296879(0x7f09026f, float:1.8211687E38)
            android.view.View r7 = r3.findViewById(r7)
            r10.getClass()
            r21 = r3
            r3 = 0
            r10.setShowText(r3)
            android.content.res.ColorStateList r3 = new android.content.res.ColorStateList
            r23 = 16842912(0x10100a0, float:2.3694006E-38)
            r24 = r8
            int[] r8 = new int[]{r23}
            r25 = r11
            r22 = r12
            r11 = 0
            int[] r12 = new int[r11]
            int[][] r8 = new int[][]{r8, r12}
            java.lang.String r12 = r1.f12358
            int r12 = android.graphics.Color.parseColor(r12)
            java.lang.String r11 = r1.f12357
            int r11 = android.graphics.Color.parseColor(r11)
            int[] r11 = new int[]{r12, r11}
            r3.<init>(r8, r11)
            r10.setThumbTintList(r3)
            android.content.res.ColorStateList r3 = new android.content.res.ColorStateList
            int[] r8 = new int[]{r23}
            r11 = 0
            int[] r12 = new int[r11]
            int[][] r8 = new int[][]{r8, r12}
            java.lang.String r12 = r1.f12359
            int r12 = android.graphics.Color.parseColor(r12)
            java.lang.String r11 = r1.f12371
            int r11 = android.graphics.Color.parseColor(r11)
            int[] r11 = new int[]{r12, r11}
            r3.<init>(r8, r11)
            r10.setTrackTintList(r3)
            r3 = 12
            android.graphics.drawable.RippleDrawable r8 = p000.jx0.m3059(r3, r4, r0, r2)
            r9.setBackground(r8)
            android.graphics.drawable.RippleDrawable r8 = p000.jx0.m3059(r3, r4, r0, r2)
            r5.setBackground(r8)
            android.graphics.drawable.RippleDrawable r0 = p000.jx0.m3059(r3, r4, r0, r2)
            r7.setBackground(r0)
            java.lang.String r0 = r1.f12353
            int r0 = android.graphics.Color.parseColor(r0)
            r6.setBackgroundColor(r0)
            um1 r3 = new um1
            r3.<init>()
            qm1 r2 = new qm1
            r2.<init>()
            bz1 r0 = new bz1
            r8 = r6
            r29 = r7
            r28 = r9
            r6 = r18
            r27 = r19
            r16 = r20
            r26 = r21
            r12 = r22
            r9 = r24
            r11 = r25
            r7 = r5
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r10.setOnCheckedChangeListener(r0)
            wu r0 = new wu
            r4 = 5
            r0.<init>(r10, r4)
            r4 = r28
            r4.setOnClickListener(r0)
            cz1 r0 = new cz1
            r4 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r4 = r0
            r0 = r29
            r0.setOnClickListener(r4)
            hi r0 = new hi
            r4 = 8
            r0.<init>(r4, r3)
            r4 = r27
            r4.setOnClickListener(r0)
            r0 = r1
            r1 = r2
            r2 = r3
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            r3 = r30
            m3095(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r4 = r3
            r3 = r2
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r4)
            r1 = r26
            android.app.AlertDialog$Builder r0 = r0.setView(r1)
            r1 = 1
            android.app.AlertDialog$Builder r0 = r0.setCancelable(r1)
            android.app.AlertDialog r0 = r0.create()
            r3.f10912 = r0
            r0.show()
            java.lang.Object r0 = r3.f10912
            android.app.AlertDialog r0 = (android.app.AlertDialog) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L239
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r11 = 0
            r1.<init>(r11)
            r0.setBackgroundDrawable(r1)
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setDimAmount(r1)
            r1 = 2
            r0.addFlags(r1)
            android.content.res.Resources r1 = r4.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            float r1 = (float) r1
            r2 = 1064011039(0x3f6b851f, float:0.92)
            float r1 = r1 * r2
            int r1 = (int) r1
            r2 = -2
            r0.setLayout(r1, r2)
        L239:
            return
    }

    /* JADX INFO: renamed from: ο */
    public static final void m3095(p000.C1000xx r78, p000.qm1 r79, p000.um1 r80, android.app.Activity r81, android.view.LayoutInflater r82, android.view.View r83, android.view.View r84, android.view.View r85, android.widget.LinearLayout r86, android.widget.Switch r87, android.widget.TextView r88, android.widget.TextView r89, android.widget.TextView r90, android.widget.TextView r91, android.widget.TextView r92, android.widget.TextView r93) {
            r1 = r78
            r2 = r79
            r4 = r81
            r7 = r84
            r11 = r88
            r12 = r89
            r13 = r90
            r14 = r91
            r15 = r92
            r0 = r93
            java.lang.String r3 = r1.f12371
            java.lang.String r5 = r1.f12370
            java.lang.String r6 = r1.f12361
            java.lang.String r8 = r1.f12360
            java.lang.String r9 = r1.f12363
            java.lang.String r10 = r1.f12362
            r16 = r3
            java.lang.String r3 = r1.f12359
            r17 = r3
            java.lang.String r3 = r1.f12358
            java.util.concurrent.ConcurrentHashMap r18 = p000.ry1.f9620
            java.util.Map r19 = p000.ex0.m1975(r18)
            java.util.Collection r19 = r19.values()
            java.lang.Iterable r19 = (java.lang.Iterable) r19
            r20 = r3
            java.util.List r3 = p000.AbstractC0984xh.m6666(r19)
            java.util.Collection r18 = r18.values()
            r18.getClass()
            java.lang.Iterable r18 = (java.lang.Iterable) r18
            r19 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r18 = r18.iterator()
        L4e:
            boolean r21 = r18.hasNext()
            if (r21 == 0) goto L6b
            r21 = r5
            java.lang.Object r5 = r18.next()
            r22 = r6
            r6 = r5
            ky1 r6 = (p000.ky1) r6
            boolean r6 = r6.f6327
            if (r6 == 0) goto L66
            r3.add(r5)
        L66:
            r5 = r21
            r6 = r22
            goto L4e
        L6b:
            r21 = r5
            r22 = r6
            ry1 r5 = p000.ry1.f9602
            java.util.ArrayList r5 = p000.ry1.m5195()
            boolean r6 = p000.ry1.m5270()
            r18 = r3
            java.lang.String r3 = "spark_custom_renew_enabled"
            r23 = r5
            r5 = 0
            boolean r3 = p000.ui1.m5887(r3, r5)
            boolean r24 = r19.isEmpty()
            if (r24 == 0) goto L90
            r5 = 0
        L8b:
            r27 = r6
            r28 = 0
            goto Lcd
        L90:
            java.util.Iterator r24 = r19.iterator()
            r26 = 0
        L96:
            boolean r27 = r24.hasNext()
            if (r27 == 0) goto Lca
            java.lang.Object r27 = r24.next()
            ky1 r27 = (p000.ky1) r27
            boolean r28 = p000.ui1.m5867()
            if (r28 != 0) goto Lad
            r27 = r6
            r28 = 0
            goto Lc3
        Lad:
            ry1 r28 = p000.ry1.f9602
            r28 = 0
            gy1 r5 = p000.ry1.m5196(r27)
            r27 = r6
            boolean r6 = r5.f4505
            if (r6 == 0) goto Lc3
            boolean r5 = r5.f4506
            if (r5 == 0) goto Lc3
            int r26 = r26 + 1
            if (r26 < 0) goto Lc6
        Lc3:
            r6 = r27
            goto L96
        Lc6:
            p000.AbstractC1021yh.m6916()
            throw r28
        Lca:
            r5 = r26
            goto L8b
        Lcd:
            if (r27 == 0) goto Ld2
            java.lang.String r6 = "已就绪"
            goto Ld4
        Ld2:
            java.lang.String r6 = "未激活"
        Ld4:
            r11.setText(r6)
            if (r27 == 0) goto Ldc
            r6 = r20
            goto Ldd
        Ldc:
            r6 = r10
        Ldd:
            r24 = r8
            if (r27 == 0) goto Le4
            r8 = r17
            goto Le5
        Le4:
            r8 = r9
        Le5:
            m3080(r11, r6, r8)
            int r6 = r19.size()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r12.setText(r6)
            java.lang.String r6 = r1.f12366
            java.lang.String r8 = r1.f12357
            int r1 = android.graphics.Color.parseColor(r24)
            r12.setTextColor(r1)
            int r1 = r18.size()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r13.setText(r1)
            boolean r1 = r18.isEmpty()
            if (r1 != 0) goto L111
            r1 = r6
            goto L112
        L111:
            r1 = r8
        L112:
            int r1 = android.graphics.Color.parseColor(r1)
            r13.setTextColor(r1)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            r14.setText(r1)
            int r1 = android.graphics.Color.parseColor(r24)
            r14.setTextColor(r1)
            if (r27 == 0) goto L130
            r27 = r6
            r6 = 8
        L12d:
            r1 = r83
            goto L134
        L130:
            r27 = r6
            r6 = 0
            goto L12d
        L134:
            r1.setVisibility(r6)
            r6 = 1
            r2.f9050 = r6
            r6 = r87
            r6.setChecked(r3)
            r1 = 0
            r2.f9050 = r1
            if (r3 == 0) goto L149
            java.lang.String r25 = "已开启：淡绿色人员会参与自定义续火；长按人员可直接开关"
        L146:
            r1 = r25
            goto L14c
        L149:
            java.lang.String r25 = "已关闭：自定义续火总开关关闭；长按人员开启时会自动打开"
            goto L146
        L14c:
            r15.setText(r1)
            int r1 = android.graphics.Color.parseColor(r8)
            r15.setTextColor(r1)
            boolean r1 = r23.isEmpty()
            if (r1 != 0) goto L15e
            r1 = 0
            goto L160
        L15e:
            r1 = 8
        L160:
            r7.setVisibility(r1)
            boolean r1 = r23.isEmpty()
            if (r1 != 0) goto L16d
            r2 = 0
        L16a:
            r1 = r85
            goto L170
        L16d:
            r2 = 8
            goto L16a
        L170:
            r1.setVisibility(r2)
            int r2 = r23.size()
            int r1 = r18.size()
            r18 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " 个会话将续火 · 待续 "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = " / 自定义 "
            r3.append(r1)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
            r0.setText(r1)
            int r1 = android.graphics.Color.parseColor(r8)
            r0.setTextColor(r1)
            l9 r1 = new l9
            r2 = 14
            r3 = r80
            r1.<init>(r4, r2, r3)
            r7.setOnClickListener(r1)
            r86.getClass()
            cu1 r0 = new cu1
            r1 = r78
            r2 = r79
            r5 = r82
            r38 = r9
            r39 = r10
            r34 = r16
            r30 = r17
            r31 = r20
            r35 = r21
            r36 = r22
            r37 = r24
            r9 = r86
            r16 = r93
            r10 = r6
            r17 = r8
            r6 = r83
            r8 = r85
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r8 = r5
            r9.removeAllViews()
            r10 = 0
            r9.setBackgroundColor(r10)
            java.lang.String r2 = "spark_auto_renew_enabled"
            boolean r11 = p000.ui1.m5887(r2, r10)
            boolean r2 = r19.isEmpty()
            if (r2 == 0) goto L205
            r0 = 2131492958(0x7f0c005e, float:1.8609383E38)
            android.view.View r0 = r8.inflate(r0, r9, r10)
            r0.getClass()
            r0.setBackgroundColor(r10)
            sy1 r2 = new sy1
            r2.<init>(r1, r10)
            m3087(r0, r2)
            r9.addView(r0)
            return
        L205:
            r12 = 10
            r2 = r19
            int r3 = p000.AbstractC1021yh.m6889(r2, r12)
            int r3 = p000.ex0.m1970(r3)
            r13 = 16
            if (r3 >= r13) goto L216
            r3 = r13
        L216:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r3)
            java.util.Iterator r3 = r2.iterator()
        L21f:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L236
            java.lang.Object r6 = r3.next()
            r7 = r6
            ky1 r7 = (p000.ky1) r7
            ry1 r14 = p000.ry1.f9602
            java.lang.String r7 = p000.ry1.m5291(r7)
            r5.put(r7, r6)
            goto L21f
        L236:
            java.util.Map r3 = p000.v81.m6126()
            int r6 = p000.AbstractC1021yh.m6889(r2, r12)
            int r6 = p000.ex0.m1970(r6)
            if (r6 >= r13) goto L245
            r6 = r13
        L245:
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>(r6)
            java.util.Iterator r6 = r2.iterator()
        L24e:
            boolean r7 = r6.hasNext()
            java.lang.String r15 = "浇"
            java.lang.String r13 = "种"
            java.lang.String r10 = "收"
            java.lang.String r12 = "分组"
            r83 = r11
            java.lang.String r11 = ""
            java.lang.String r16 = "全局"
            if (r7 == 0) goto L345
            java.lang.Object r7 = r6.next()
            ky1 r7 = (p000.ky1) r7
            ry1 r19 = p000.ry1.f9602
            java.lang.String r19 = p000.ry1.m5291(r7)
            long r8 = r7.f6323
            r20 = r2
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            java.lang.Object r2 = r3.get(r2)
            sd r2 = (p000.C0794sd) r2
            if (r2 != 0) goto L283
            sd r2 = new sd
            r2.<init>(r8)
        L283:
            hz1 r8 = new hz1
            java.lang.String r9 = p000.ry1.m5197(r7)
            gy1 r21 = p000.ry1.m5196(r7)
            boolean r22 = p000.ry1.m5257(r7)
            r84 = r3
            my1 r3 = p000.ry1.m5202(r7)
            boolean r23 = p000.ry1.m5253(r3)
            if (r23 == 0) goto L2b5
            java.lang.String r12 = r3.f7323
            boolean r12 = p000.q02.m4671(r12)
            if (r12 != 0) goto L2a8
            java.lang.String r16 = "个人文本"
            goto L2cf
        L2a8:
            java.lang.String r3 = r3.f7324
            java.lang.String r3 = p000.ry1.m5277(r3, r11)
            java.lang.String r11 = "个人"
            java.lang.String r16 = r11.concat(r3)
            goto L2cf
        L2b5:
            ly1 r3 = p000.ry1.m5200(r7)
            if (r3 == 0) goto L2cf
            my1 r3 = r3.f6844
            boolean r11 = p000.ry1.m5253(r3)
            if (r11 == 0) goto L2cf
            java.lang.String r11 = r3.f7324
            java.lang.String r3 = r3.f7323
            java.lang.String r3 = p000.ry1.m5277(r11, r3)
            java.lang.String r16 = r12.concat(r3)
        L2cf:
            sd r2 = p000.ry1.m5198(r7, r2)
            ip1 r3 = r2.f9837
            ip1 r7 = r2.f9838
            ip1 r2 = r2.f9839
            r3.getClass()
            r7.getClass()
            r2.getClass()
            java.lang.String r3 = m3085(r3)
            java.lang.String r3 = r10.concat(r3)
            java.lang.String r7 = m3085(r7)
            java.lang.String r7 = r13.concat(r7)
            java.lang.String r2 = m3085(r2)
            java.lang.String r2 = r15.concat(r2)
            java.lang.String[] r2 = new java.lang.String[]{r3, r7, r2}
            java.util.List r2 = p000.AbstractC1021yh.m6897(r2)
            r3 = 0
            r7 = 62
            java.lang.String r10 = "/"
            r11 = 0
            r12 = 0
            r13 = 0
            r87 = r2
            r92 = r3
            r93 = r7
            r88 = r10
            r89 = r11
            r90 = r12
            r91 = r13
            java.lang.String r2 = p000.AbstractC0984xh.m6644(r87, r88, r89, r90, r91, r92, r93)
            r93 = r2
            r87 = r8
            r89 = r9
            r92 = r16
            r88 = r19
            r90 = r21
            r91 = r22
            r87.<init>(r88, r89, r90, r91, r92, r93)
            r3 = r87
            r2 = r88
            r14.put(r2, r3)
            r8 = r82
            r11 = r83
            r3 = r84
            r9 = r86
            r2 = r20
            r10 = 0
            r12 = 10
            r13 = 16
            goto L24e
        L345:
            r20 = r2
            ry1 r2 = p000.ry1.f9602
            java.util.List r2 = p000.ry1.m5201()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r6 = r2.iterator()
        L356:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L368
            java.lang.Object r7 = r6.next()
            ly1 r7 = (p000.ly1) r7
            java.util.List r7 = r7.f6847
            p000.AbstractC0984xh.m6660(r3, r7)
            goto L356
        L368:
            java.util.Set r3 = p000.AbstractC0984xh.m6671(r3)
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r8 = p000.AbstractC1021yh.m6889(r2, r7)
            r6.<init>(r8)
            java.util.Iterator r2 = r2.iterator()
        L37b:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L3d7
            java.lang.Object r7 = r2.next()
            ly1 r7 = (p000.ly1) r7
            java.lang.String r8 = r7.f6842
            java.lang.String r9 = r7.f6843
            r84 = r2
            my1 r2 = r7.f6844
            r45 = r2
            java.lang.String r2 = r7.f6845
            r46 = r2
            rd r2 = r7.f6846
            java.util.List r7 = r7.f6847
            r47 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r7 = r7.iterator()
        L3a4:
            boolean r19 = r7.hasNext()
            if (r19 == 0) goto L3c2
            java.lang.Object r19 = r7.next()
            r85 = r7
            r7 = r19
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r5.get(r7)
            ky1 r7 = (p000.ky1) r7
            if (r7 == 0) goto L3bf
            r2.add(r7)
        L3bf:
            r7 = r85
            goto L3a4
        L3c2:
            gz1 r42 = new gz1
            r48 = 0
            r49 = r2
            r43 = r8
            r44 = r9
            r42.<init>(r43, r44, r45, r46, r47, r48, r49)
            r2 = r42
            r6.add(r2)
            r2 = r84
            goto L37b
        L3d7:
            my1 r2 = new my1
            r5 = 255(0xff, float:3.57E-43)
            r8 = 0
            r2.<init>(r5, r8, r8)
            rd r47 = new rd
            r47.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r7 = r20.iterator()
        L3ed:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L40c
            java.lang.Object r9 = r7.next()
            r19 = r9
            ky1 r19 = (p000.ky1) r19
            ry1 r20 = p000.ry1.f9602
            java.lang.String r8 = p000.ry1.m5291(r19)
            boolean r8 = r3.contains(r8)
            if (r8 != 0) goto L40a
            r5.add(r9)
        L40a:
            r8 = 0
            goto L3ed
        L40c:
            qy1 r3 = new qy1
            r8 = 4
            r3.<init>(r8)
            iz1 r7 = new iz1
            r9 = 1
            r7.<init>(r3, r14, r9)
            jd1 r3 = new jd1
            r8 = 9
            r3.<init>(r8, r7)
            iz1 r7 = new iz1
            r8 = 0
            r7.<init>(r3, r14, r8)
            java.util.List r49 = p000.AbstractC0984xh.m6658(r5, r7)
            gz1 r42 = new gz1
            java.lang.String r43 = "__ungrouped__"
            java.lang.String r44 = "未分组"
            java.lang.String r46 = "follow"
            r48 = 1
            r45 = r2
            r42.<init>(r43, r44, r45, r46, r47, r48, r49)
            r2 = r42
            java.util.ArrayList r2 = p000.AbstractC0984xh.m6650(r2, r6)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r4)
            r3.setOrientation(r8)
            r5 = 16
            r3.setGravity(r5)
            r5 = 8
            int r6 = m3086(r4, r5)
            r3.setPadding(r8, r8, r8, r6)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r4)
            java.lang.String r7 = "规则分组"
            r6.setText(r7)
            r8 = 1095761920(0x41500000, float:13.0)
            r6.setTextSize(r8)
            r7 = 0
            r6.setTypeface(r7, r9)
            java.lang.String r7 = r1.f12355
            java.lang.String r8 = r1.f12348
            int r9 = android.graphics.Color.parseColor(r7)
            r6.setTextColor(r9)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r19 = r11
            r11 = 1065353216(0x3f800000, float:1.0)
            r20 = r7
            r7 = 0
            r9.<init>(r7, r5, r11)
            r6.setLayoutParams(r9)
            r3.addView(r6)
            z61 r6 = new z61
            r9 = 8
            r6.<init>(r4, r9, r0)
            java.lang.String r9 = "新增"
            r11 = r36
            r5 = r37
            android.widget.TextView r6 = m3084(r4, r9, r5, r11, r6)
            r3.addView(r6)
            ty1 r6 = new ty1
            r6.<init>(r0, r7)
            java.lang.String r7 = "展开"
            r23 = r12
            r9 = r30
            r12 = r31
            android.widget.TextView r6 = m3084(r4, r7, r12, r9, r6)
            r3.addView(r6)
            z61 r6 = new z61
            r7 = 9
            r6.<init>(r2, r7, r0)
            java.lang.String r7 = "收起"
            r87 = r2
            r2 = r34
            r9 = r35
            android.widget.TextView r6 = m3084(r4, r7, r9, r2, r6)
            r3.addView(r6)
            r6 = r86
            r6.addView(r3)
            java.util.Iterator r24 = r87.iterator()
        L4cc:
            boolean r3 = r24.hasNext()
            if (r3 == 0) goto Lebd
            java.lang.Object r3 = r24.next()
            gz1 r3 = (p000.gz1) r3
            java.lang.String r7 = r3.f4508
            r34 = r2
            boolean r2 = r3.f4513
            r29 = r2
            java.util.List r2 = r3.f4514
            r31 = r2
            java.lang.String r2 = r3.f4511
            r35 = r9
            my1 r9 = r3.f4510
            r32 = r12
            java.util.LinkedHashSet r12 = p000.jz1.f5676
            r37 = r5
            boolean r5 = r12.contains(r7)
            r33 = r2
            r36 = r14
            r2 = 1
            android.widget.LinearLayout r14 = p000.AbstractC0602nx.m4123(r4, r2)
            r2 = 12
            r40 = r12
            int r12 = m3086(r4, r2)
            r87 = r5
            r6 = 10
            int r5 = m3086(r4, r6)
            r41 = r15
            int r15 = m3086(r4, r2)
            int r2 = m3086(r4, r6)
            r14.setPadding(r12, r5, r15, r2)
            java.lang.String r2 = r1.f12352
            r5 = 12
            android.graphics.drawable.RippleDrawable r2 = p000.jx0.m3059(r5, r4, r8, r2)
            r14.setBackground(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r5 = -1
            r6 = -2
            r2.<init>(r5, r6)
            r5 = 6
            int r5 = m3086(r4, r5)
            r2.topMargin = r5
            r14.setLayoutParams(r2)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r4)
            r5 = 0
            r2.setOrientation(r5)
            r12 = 16
            r2.setGravity(r12)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r4)
            if (r87 == 0) goto L54e
            java.lang.String r6 = "▸"
            goto L550
        L54e:
            java.lang.String r6 = "▾"
        L550:
            java.lang.String r15 = r3.f4509
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r6)
            java.lang.String r6 = " "
            r12.append(r6)
            r12.append(r15)
            java.lang.String r6 = r12.toString()
            r5.setText(r6)
            r12 = 1095761920(0x41500000, float:13.0)
            r5.setTextSize(r12)
            r6 = 0
            r15 = 1
            r5.setTypeface(r6, r15)
            int r6 = android.graphics.Color.parseColor(r20)
            r5.setTextColor(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r12 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            r6.<init>(r15, r1, r12)
            r5.setLayoutParams(r6)
            r2.addView(r5)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r4)
            int r6 = r31.size()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r6)
            java.lang.String r6 = "人"
            r15.append(r6)
            java.lang.String r6 = r15.toString()
            r5.setText(r6)
            r6 = 1092616192(0x41200000, float:10.0)
            r5.setTextSize(r6)
            r6 = 0
            r15 = 1
            r5.setTypeface(r6, r15)
            int r6 = android.graphics.Color.parseColor(r37)
            r5.setTextColor(r6)
            r6 = 99
            android.graphics.drawable.GradientDrawable r6 = p000.jx0.m3062(r6, r4, r11)
            r5.setBackground(r6)
            r6 = 8
            int r15 = m3086(r4, r6)
            r12 = 3
            int r1 = m3086(r4, r12)
            r26 = r11
            int r11 = m3086(r4, r6)
            int r6 = m3086(r4, r12)
            r5.setPadding(r15, r1, r11, r6)
            r2.addView(r5)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r4)
            java.lang.String r5 = "设置"
            r1.setText(r5)
            r5 = 1093664768(0x41300000, float:11.0)
            r1.setTextSize(r5)
            r6 = 0
            r15 = 1
            r1.setTypeface(r6, r15)
            int r6 = android.graphics.Color.parseColor(r32)
            r1.setTextColor(r6)
            r6 = 10
            int r11 = m3086(r4, r6)
            int r6 = m3086(r4, r12)
            int r15 = m3086(r4, r12)
            r12 = 0
            r1.setPadding(r11, r6, r12, r15)
            if (r29 == 0) goto L60d
            r6 = 8
            goto L60e
        L60d:
            r6 = r12
        L60e:
            r1.setVisibility(r6)
            vy1 r6 = new vy1
            r6.<init>(r4, r3, r0, r12)
            r1.setOnClickListener(r6)
            r2.addView(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r4)
            java.lang.String r6 = "删除"
            r1.setText(r6)
            r1.setTextSize(r5)
            r6 = 0
            r15 = 1
            r1.setTypeface(r6, r15)
            int r6 = android.graphics.Color.parseColor(r27)
            r1.setTextColor(r6)
            r11 = 10
            int r6 = m3086(r4, r11)
            r12 = 3
            int r15 = m3086(r4, r12)
            int r11 = m3086(r4, r12)
            r12 = 0
            r1.setPadding(r6, r15, r12, r11)
            if (r29 != 0) goto L655
            java.lang.String r6 = "default"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L653
            goto L655
        L653:
            r6 = 0
            goto L657
        L655:
            r6 = 8
        L657:
            r1.setVisibility(r6)
            vy1 r6 = new vy1
            r15 = 1
            r6.<init>(r4, r3, r0, r15)
            r1.setOnClickListener(r6)
            r2.addView(r1)
            r14.addView(r2)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = r9.f7323
            java.lang.Boolean r11 = r9.f7329
            java.lang.Boolean r12 = r9.f7326
            java.lang.String r15 = r9.f7324
            boolean r6 = p000.q02.m4671(r6)
            if (r6 != 0) goto L684
            java.lang.String r6 = "固定文本"
            goto L69c
        L684:
            java.lang.String r6 = "hitokoto"
            boolean r6 = p000.ln0.m3626(r15, r6)
            if (r6 == 0) goto L68f
            java.lang.String r6 = "一言"
            goto L69c
        L68f:
            java.lang.String r6 = "jinrishici"
            boolean r6 = p000.ln0.m3626(r15, r6)
            if (r6 == 0) goto L69a
            java.lang.String r6 = "今日诗词"
            goto L69c
        L69a:
            java.lang.String r6 = "跟随全局"
        L69c:
            java.lang.String r15 = "消息:"
            java.lang.String r6 = r15.concat(r6)
            r2.append(r6)
            java.lang.String r6 = m3092(r33)
            java.lang.String r15 = " · 续火:"
            java.lang.String r6 = r15.concat(r6)
            r2.append(r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r45 = p000.ln0.m3626(r12, r6)
            java.lang.String r5 = "禁图片"
            r47 = r15
            java.lang.String r15 = "图片"
            r48 = r8
            java.lang.String r8 = "禁消息"
            r49 = r7
            java.lang.String r7 = "消息"
            r92 = r0
            java.lang.String r0 = "专属文本"
            r88 = r14
            java.lang.String r14 = "开启"
            r50 = r14
            java.lang.String r14 = "排除"
            if (r45 == 0) goto L6db
            r51 = r0
            r4 = r14
            r45 = r4
            goto L745
        L6db:
            r45 = r14
            zt0 r14 = p000.AbstractC1021yh.m6893()
            java.lang.String r4 = r9.f7325
            boolean r4 = p000.q02.m4671(r4)
            if (r4 != 0) goto L6ec
            r14.add(r0)
        L6ec:
            java.lang.Boolean r4 = r9.f7327
            r51 = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r52 = p000.ln0.m3626(r4, r0)
            if (r52 == 0) goto L6fc
            r14.add(r7)
            goto L708
        L6fc:
            boolean r52 = p000.ln0.m3626(r4, r6)
            if (r52 == 0) goto L706
            r14.add(r8)
            goto L708
        L706:
            if (r4 != 0) goto Leba
        L708:
            java.lang.Boolean r4 = r9.f7328
            boolean r52 = p000.ln0.m3626(r4, r0)
            if (r52 == 0) goto L714
            r14.add(r15)
            goto L720
        L714:
            boolean r52 = p000.ln0.m3626(r4, r6)
            if (r52 == 0) goto L71e
            r14.add(r5)
            goto L720
        L71e:
            if (r4 != 0) goto Leb6
        L720:
            zt0 r53 = p000.AbstractC1021yh.m6883(r14)
            r58 = 0
            r59 = 62
            java.lang.String r54 = "+"
            r55 = 0
            r56 = 0
            r57 = 0
            java.lang.String r4 = p000.AbstractC0984xh.m6644(r53, r54, r55, r56, r57, r58, r59)
            boolean r14 = p000.q02.m4671(r4)
            if (r14 == 0) goto L745
            boolean r0 = p000.ln0.m3626(r12, r0)
            if (r0 == 0) goto L743
            r4 = r50
            goto L745
        L743:
            r4 = r16
        L745:
            java.lang.String r12 = " · 火星:"
            java.lang.String r0 = r12.concat(r4)
            r2.append(r0)
            java.lang.String r0 = r9.f7330
            boolean r4 = p000.ln0.m3626(r11, r6)
            java.lang.String r9 = "#"
            java.lang.String r14 = "智能选择"
            java.lang.String r6 = "__smart__"
            r52 = r14
            java.lang.String r14 = "关闭"
            if (r4 == 0) goto L762
            r0 = r14
            goto L78b
        L762:
            boolean r4 = p000.q02.m4671(r0)
            if (r4 != 0) goto L77e
            java.lang.CharSequence r4 = p000.q02.m4660(r0)
            java.lang.String r4 = r4.toString()
            boolean r4 = p000.ln0.m3626(r4, r6)
            if (r4 == 0) goto L779
            r0 = r52
            goto L78b
        L779:
            java.lang.String r0 = r9.concat(r0)
            goto L78b
        L77e:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = p000.ln0.m3626(r11, r0)
            if (r0 == 0) goto L789
            r0 = r50
            goto L78b
        L789:
            r0 = r16
        L78b:
            java.lang.String r11 = " · 投喂:"
            java.lang.String r0 = r11.concat(r0)
            r2.append(r0)
            rd r0 = r3.f4512
            ip1 r4 = r0.f9337
            java.lang.String r4 = m3085(r4)
            java.lang.String r4 = r10.concat(r4)
            r53 = r10
            ip1 r10 = r0.f9338
            java.lang.String r10 = m3085(r10)
            java.lang.String r10 = r13.concat(r10)
            ip1 r0 = r0.f9339
            java.lang.String r0 = m3085(r0)
            r54 = r13
            r13 = r41
            java.lang.String r0 = r13.concat(r0)
            java.lang.String[] r0 = new java.lang.String[]{r4, r10, r0}
            java.util.List r55 = p000.AbstractC1021yh.m6897(r0)
            r60 = 0
            r61 = 62
            java.lang.String r56 = "/"
            r57 = 0
            r58 = 0
            r59 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r55, r56, r57, r58, r59, r60, r61)
            java.lang.String r10 = " · 营地:"
            java.lang.String r0 = r10.concat(r0)
            r2.append(r0)
            java.lang.String r0 = " · 拖动人员到这里"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.setText(r0)
            r0 = 1093664768(0x41300000, float:11.0)
            r1.setTextSize(r0)
            int r0 = android.graphics.Color.parseColor(r17)
            r1.setTextColor(r0)
            r0 = 5
            r4 = r81
            int r0 = m3086(r4, r0)
            r2 = 0
            r1.setPadding(r2, r0, r2, r2)
            r0 = r88
            r0.addView(r1)
            pv1 r1 = new pv1
            r4 = r87
            r2 = r92
            r13 = 1
            r1.<init>(r13, r3, r2, r4)
            r0.setOnClickListener(r1)
            ζ r1 = new ζ
            r4 = 3
            r1.<init>(r3, r4, r0)
            r0.setOnLongClickListener(r1)
            dz1 r1 = new dz1
            r90 = r78
            r89 = r81
            r87 = r1
            r91 = r3
            r87.<init>(r88, r89, r90, r91, r92)
            r13 = r87
            r2 = r88
            r4 = r89
            r1 = r90
            r0 = r92
            r2.setOnDragListener(r13)
            r13 = r86
            r13.addView(r2)
            r3 = r40
            r2 = r49
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto Le85
            boolean r2 = r31.isEmpty()
            if (r2 == 0) goto L87b
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r4)
            if (r29 == 0) goto L852
            java.lang.String r3 = "暂无未分组人员"
            goto L854
        L852:
            java.lang.String r3 = "拖动人员到此分组"
        L854:
            r2.setText(r3)
            r3 = 1093664768(0x41300000, float:11.0)
            r2.setTextSize(r3)
            r3 = 17
            r2.setGravity(r3)
            int r3 = android.graphics.Color.parseColor(r17)
            r2.setTextColor(r3)
            r5 = 12
            int r3 = m3086(r4, r5)
            int r5 = m3086(r4, r5)
            r12 = 0
            r2.setPadding(r12, r3, r12, r5)
            r13.addView(r2)
            goto Le85
        L87b:
            java.util.Iterator r29 = r31.iterator()
        L87f:
            boolean r2 = r29.hasNext()
            if (r2 == 0) goto Le85
            java.lang.Object r2 = r29.next()
            ky1 r2 = (p000.ky1) r2
            ry1 r3 = p000.ry1.f9602
            java.lang.String r3 = p000.ry1.m5291(r2)
            int r13 = r2.f6326
            r31 = r13
            r13 = r36
            java.lang.Object r3 = p000.ex0.m1968(r13, r3)
            hz1 r3 = (p000.hz1) r3
            r13 = 2131492957(0x7f0c005d, float:1.860938E38)
            r92 = r0
            r87 = r10
            r88 = r11
            r10 = 0
            r11 = 0
            r0 = r82
            android.view.View r13 = r0.inflate(r13, r10, r11)
            r10 = 2131296878(0x7f09026e, float:1.8211685E38)
            android.view.View r10 = r13.findViewById(r10)
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r11 = 2131297117(0x7f09035d, float:1.821217E38)
            android.view.View r11 = r13.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 2131297120(0x7f090360, float:1.8212176E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r89 = r9
            r9 = 2131297119(0x7f09035f, float:1.8212174E38)
            android.view.View r9 = r13.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r90 = r9
            r9 = 2131297124(0x7f090364, float:1.8212184E38)
            android.view.View r9 = r13.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r40 = r9
            r9 = 2131297114(0x7f09035a, float:1.8212164E38)
            android.view.View r9 = r13.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r46 = r13
            gy1 r13 = r3.f4849
            r49 = r9
            boolean r9 = r13.f4505
            boolean r13 = r13.f4506
            if (r9 == 0) goto L8fb
            if (r13 == 0) goto L8fb
            r55 = 1
            goto L8fd
        L8fb:
            r55 = 0
        L8fd:
            if (r9 == 0) goto L906
            if (r13 != 0) goto L906
            r56 = 1
        L903:
            r57 = r9
            goto L909
        L906:
            r56 = 0
            goto L903
        L909:
            boolean r9 = r3.f4850
            r58 = r9
            int r9 = r2.f6328
            r59 = r13
            boolean r13 = r2.f6327
            r60 = r13
            java.lang.String r13 = r2.f6329
            r61 = r6
            r6 = 3
            if (r9 == r6) goto L932
            java.lang.String r6 = "重燃"
            r62 = r14
            r14 = 0
            boolean r6 = p000.q02.m4654(r13, r6, r14)
            if (r6 != 0) goto L935
            java.lang.String r6 = "消失"
            boolean r6 = p000.q02.m4654(r13, r6, r14)
            if (r6 == 0) goto L930
            goto L935
        L930:
            r6 = r14
            goto L936
        L932:
            r62 = r14
            r14 = 0
        L935:
            r6 = 1
        L936:
            if (r58 == 0) goto L93f
            if (r60 == 0) goto L93f
            r13 = 1
            if (r9 == r13) goto L93f
            r13 = 1
            goto L940
        L93f:
            r13 = r14
        L940:
            if (r13 == 0) goto L946
            if (r6 == 0) goto L946
            r6 = 1
            goto L947
        L946:
            r6 = r14
        L947:
            java.lang.String r14 = "due_only"
            r63 = r6
            java.lang.String r6 = "custom_on"
            r64 = r13
            java.lang.String r13 = "custom_off"
            r65 = r12
            r12 = r33
            if (r56 != 0) goto L972
            boolean r33 = r12.equals(r13)
            if (r33 == 0) goto L95e
            goto L972
        L95e:
            if (r55 != 0) goto L979
            boolean r33 = r12.equals(r6)
            if (r33 == 0) goto L967
            goto L979
        L967:
            boolean r33 = r12.equals(r14)
            if (r33 == 0) goto L970
            r33 = r14
            goto L981
        L970:
            if (r18 == 0) goto L977
        L972:
            r33 = r14
            r60 = 0
            goto L981
        L977:
            if (r83 == 0) goto L97e
        L979:
            r33 = r14
            r60 = 1
            goto L981
        L97e:
            if (r58 == 0) goto L972
            goto L979
        L981:
            java.lang.String r14 = r1.f12367
            if (r60 == 0) goto L990
            r1 = r30
        L987:
            r42 = r5
            r5 = r48
            r48 = r15
            r15 = 12
            goto L992
        L990:
            r1 = r14
            goto L987
        L992:
            android.graphics.drawable.RippleDrawable r1 = p000.jx0.m3059(r15, r4, r5, r1)
            r10.setBackground(r1)
            if (r56 != 0) goto L9a1
            boolean r66 = r12.equals(r13)
            if (r66 == 0) goto L9c4
        L9a1:
            r1 = r32
            r32 = r0
            r0 = r27
            r27 = r1
            r1 = r30
            r30 = r2
            r2 = r34
            r34 = r39
            r39 = r7
            r7 = r1
            r1 = r26
            r26 = r5
            r5 = r37
            r37 = r10
            r10 = r38
            r38 = r8
            r8 = r35
            goto La85
        L9c4:
            if (r63 == 0) goto L9ef
            l91 r15 = new l91
            r1 = r26
            r26 = r5
            r5 = r37
            r15.<init>(r5, r1)
            r37 = r32
            r32 = r0
            r0 = r27
            r27 = r37
            r37 = r30
            r30 = r2
            r2 = r34
            r34 = r39
            r39 = r7
            r7 = r37
            r37 = r10
            r10 = r38
            r38 = r8
        L9eb:
            r8 = r35
            goto La8a
        L9ef:
            r1 = r26
            r26 = r5
            r5 = r37
            if (r64 == 0) goto La17
            l91 r15 = new l91
            r37 = r10
            r10 = r38
            r38 = r8
            r8 = r39
            r15.<init>(r8, r10)
            r39 = r32
            r32 = r0
            r0 = r27
            r27 = r39
            r39 = r7
            r7 = r30
            r30 = r2
        La12:
            r2 = r34
            r34 = r8
            goto L9eb
        La17:
            r37 = r10
            r10 = r38
            r38 = r8
            r8 = r39
            if (r58 == 0) goto La35
            l91 r15 = new l91
            r39 = r7
            r7 = r30
            r30 = r2
            r2 = r32
            r15.<init>(r2, r7)
            r32 = r0
            r0 = r27
        La32:
            r27 = r2
            goto La12
        La35:
            r39 = r7
            r7 = r30
            r15 = 3
            r30 = r2
            r2 = r32
            if (r9 != r15) goto La4a
            l91 r15 = new l91
            r32 = r0
            r0 = r27
            r15.<init>(r0, r14)
            goto La32
        La4a:
            r32 = r0
            r0 = r27
            r15 = 2
            if (r9 != r15) goto La57
            l91 r15 = new l91
            r15.<init>(r8, r10)
            goto La32
        La57:
            if (r55 != 0) goto La5f
            boolean r15 = r12.equals(r6)
            if (r15 == 0) goto La68
        La5f:
            r27 = r2
            r2 = r34
            r34 = r8
            r8 = r35
            goto La7f
        La68:
            r15 = 1
            if (r9 != r15) goto La71
            l91 r15 = new l91
            r15.<init>(r2, r7)
            goto La32
        La71:
            l91 r15 = new l91
            r27 = r2
            r2 = r34
            r34 = r8
            r8 = r35
            r15.<init>(r8, r2)
            goto La8a
        La7f:
            l91 r15 = new l91
            r15.<init>(r5, r1)
            goto La8a
        La85:
            l91 r15 = new l91
            r15.<init>(r0, r14)
        La8a:
            java.lang.String r35 = "待续"
            if (r56 != 0) goto La94
            boolean r56 = r12.equals(r13)
            if (r56 == 0) goto La97
        La94:
            r56 = r8
            goto Lacb
        La97:
            if (r63 == 0) goto La9e
            java.lang.String r9 = "重燃中"
        La9b:
            r56 = r8
            goto Lacd
        La9e:
            if (r64 == 0) goto Laa3
            java.lang.String r9 = "待对方"
            goto La9b
        Laa3:
            if (r58 == 0) goto Laa8
            java.lang.String r9 = "已续"
            goto La9b
        Laa8:
            r56 = r8
            r8 = 3
            if (r9 != r8) goto Lab0
            java.lang.String r9 = "紧急"
            goto Lacd
        Lab0:
            r8 = 2
            if (r9 != r8) goto Lab6
            r9 = r35
            goto Lacd
        Lab6:
            if (r55 != 0) goto Lac8
            boolean r8 = r12.equals(r6)
            if (r8 == 0) goto Labf
            goto Lac8
        Labf:
            r8 = 1
            if (r9 != r8) goto Lac5
            java.lang.String r9 = "健康"
            goto Lacd
        Lac5:
            java.lang.String r9 = "未知"
            goto Lacd
        Lac8:
            java.lang.String r9 = "自定"
            goto Lacd
        Lacb:
            r9 = r45
        Lacd:
            java.lang.Integer r8 = p000.ry1.m5199(r30)
            if (r8 == 0) goto Lada
            int r55 = r8.intValue()
        Lad7:
            r67 = r0
            goto Ladd
        Lada:
            r55 = r31
            goto Lad7
        Ladd:
            java.lang.String r0 = java.lang.String.valueOf(r55)
            r11.setText(r0)
            r28 = r8
            r0 = 0
            r8 = 1
            r11.setTypeface(r0, r8)
            java.lang.Object r0 = r15.f6502
            java.lang.String r0 = (java.lang.String) r0
            int r8 = p000.jx0.m3048(r0)
            r11.setTextColor(r8)
            java.lang.Object r8 = r15.f6503
            java.lang.String r8 = (java.lang.String) r8
            r85 = r1
            r15 = 9
            android.graphics.drawable.GradientDrawable r1 = p000.jx0.m3062(r15, r4, r8)
            r11.setBackground(r1)
            java.lang.String r1 = r3.f4848
            r11 = r32
            r11.setText(r1)
            int r1 = android.graphics.Color.parseColor(r20)
            r11.setTextColor(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r11 = r30
            r30 = r14
            long r14 = r11.f6324
            r68 = 0
            int r68 = (r14 > r68 ? 1 : (r14 == r68 ? 0 : -1))
            if (r68 <= 0) goto Lb2d
            r68 = r2
            java.lang.String r2 = "UID: "
            java.lang.String r2 = p000.AbstractC0602nx.m4126(r14, r2)
            goto Lb31
        Lb2d:
            r68 = r2
            java.lang.String r2 = "群聊"
        Lb31:
            r1.append(r2)
            if (r28 == 0) goto Lb3b
            int r2 = r28.intValue()
            goto Lb3d
        Lb3b:
            r2 = r31
        Lb3d:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = " · "
            r14.<init>(r15)
            r14.append(r2)
            java.lang.String r2 = " 天火花"
            r14.append(r2)
            java.lang.String r2 = r14.toString()
            r1.append(r2)
            if (r28 == 0) goto Lb5a
            java.lang.String r2 = " · 已伪装"
            r1.append(r2)
        Lb5a:
            java.lang.String r2 = r3.f4851
            java.lang.String r14 = " · 消息:"
            java.lang.String r2 = r14.concat(r2)
            r1.append(r2)
            if (r57 == 0) goto Lb6e
            if (r59 == 0) goto Lb6e
            java.lang.String r2 = "个人自定义"
        Lb6b:
            r14 = r47
            goto Lb8f
        Lb6e:
            if (r57 == 0) goto Lb75
            if (r59 != 0) goto Lb75
            java.lang.String r2 = "个人排除"
            goto Lb6b
        Lb75:
            java.lang.String r2 = "follow"
            boolean r2 = r12.equals(r2)
            if (r2 != 0) goto Lb82
            java.lang.String r2 = m3092(r12)
            goto Lb6b
        Lb82:
            if (r18 == 0) goto Lb87
            java.lang.String r2 = "未选择"
            goto Lb6b
        Lb87:
            if (r83 == 0) goto Lb8c
            java.lang.String r2 = "默认自动"
            goto Lb6b
        Lb8c:
            java.lang.String r2 = "仅手动待续"
            goto Lb6b
        Lb8f:
            java.lang.String r2 = r14.concat(r2)
            r1.append(r2)
            my1 r2 = p000.ry1.m5202(r11)
            ly1 r15 = p000.ry1.m5200(r11)
            if (r15 == 0) goto Lba5
            my1 r15 = r15.f6844
        Lba2:
            r28 = r5
            goto Lba7
        Lba5:
            r15 = 0
            goto Lba2
        Lba7:
            java.lang.Boolean r5 = r2.f7326
            if (r5 != 0) goto Lbbe
            java.lang.Boolean r5 = r2.f7327
            if (r5 != 0) goto Lbbe
            java.lang.Boolean r5 = r2.f7328
            if (r5 != 0) goto Lbbe
            java.lang.String r5 = r2.f7325
            boolean r5 = p000.q02.m4671(r5)
            if (r5 != 0) goto Lbbc
            goto Lbbe
        Lbbc:
            r5 = 0
            goto Lbbf
        Lbbe:
            r5 = 1
        Lbbf:
            r31 = r2
            if (r15 == 0) goto Lbd8
            java.lang.Boolean r2 = r15.f7326
            if (r2 != 0) goto Lbda
            java.lang.Boolean r2 = r15.f7327
            if (r2 != 0) goto Lbda
            java.lang.Boolean r2 = r15.f7328
            if (r2 != 0) goto Lbda
            java.lang.String r2 = r15.f7325
            boolean r2 = p000.q02.m4671(r2)
            if (r2 != 0) goto Lbd8
            goto Lbda
        Lbd8:
            r2 = 0
            goto Lbdb
        Lbda:
            r2 = 1
        Lbdb:
            java.lang.String r47 = "Required value was null."
            if (r5 != 0) goto Lbf7
            if (r2 != 0) goto Lbf7
            r31 = r7
            r69 = r14
            r2 = r16
            r14 = r38
            r4 = r39
            r7 = r42
            r70 = r45
            r15 = r48
            r45 = r10
        Lbf3:
            r10 = r65
            goto Lcb5
        Lbf7:
            if (r5 == 0) goto Lbfc
            r2 = r31
            goto Lbff
        Lbfc:
            if (r15 == 0) goto Le81
            r2 = r15
        Lbff:
            if (r5 == 0) goto Lc04
            r5 = r19
            goto Lc06
        Lc04:
            r5 = r23
        Lc06:
            java.lang.Boolean r15 = r2.f7326
            r31 = r7
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            boolean r15 = p000.ln0.m3626(r15, r7)
            if (r15 == 0) goto Lc27
            r15 = r45
            java.lang.String r2 = r5.concat(r15)
            r45 = r10
            r69 = r14
            r70 = r15
            r14 = r38
            r4 = r39
            r7 = r42
            r15 = r48
            goto Lbf3
        Lc27:
            r15 = r45
            r45 = r10
            zt0 r10 = p000.AbstractC1021yh.m6893()
            r69 = r14
            java.lang.String r14 = r2.f7325
            boolean r14 = p000.q02.m4671(r14)
            if (r14 != 0) goto Lc3e
            r14 = r51
            r10.add(r14)
        Lc3e:
            java.lang.Boolean r14 = r2.f7327
            r70 = r15
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            boolean r71 = p000.ln0.m3626(r14, r15)
            if (r71 == 0) goto Lc52
            r4 = r39
            r10.add(r4)
            r14 = r38
            goto Lc66
        Lc52:
            r4 = r39
            boolean r39 = p000.ln0.m3626(r14, r7)
            if (r39 == 0) goto Lc60
            r14 = r38
            r10.add(r14)
            goto Lc66
        Lc60:
            r39 = r14
            r14 = r38
            if (r39 != 0) goto Le7d
        Lc66:
            java.lang.Boolean r2 = r2.f7328
            boolean r15 = p000.ln0.m3626(r2, r15)
            if (r15 == 0) goto Lc76
            r15 = r48
            r10.add(r15)
            r7 = r42
            goto Lc88
        Lc76:
            r15 = r48
            boolean r7 = p000.ln0.m3626(r2, r7)
            if (r7 == 0) goto Lc84
            r7 = r42
            r10.add(r7)
            goto Lc88
        Lc84:
            r7 = r42
            if (r2 != 0) goto Le79
        Lc88:
            zt0 r71 = p000.AbstractC1021yh.m6883(r10)
            r76 = 0
            r77 = 62
            java.lang.String r72 = "+"
            r73 = 0
            r74 = 0
            r75 = 0
            java.lang.String r2 = p000.AbstractC0984xh.m6644(r71, r72, r73, r74, r75, r76, r77)
            boolean r10 = p000.q02.m4671(r2)
            if (r10 == 0) goto Lca4
            java.lang.String r2 = "启用"
        Lca4:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            r10.append(r2)
            java.lang.String r2 = r10.toString()
            goto Lbf3
        Lcb5:
            java.lang.String r2 = r10.concat(r2)
            r1.append(r2)
            my1 r2 = p000.ry1.m5202(r11)
            ly1 r5 = p000.ry1.m5200(r11)
            if (r5 == 0) goto Lccb
            my1 r5 = r5.f6844
        Lcc8:
            r39 = r4
            goto Lccd
        Lccb:
            r5 = 0
            goto Lcc8
        Lccd:
            java.lang.Boolean r4 = r2.f7329
            if (r4 != 0) goto Lcdc
            java.lang.String r4 = r2.f7330
            boolean r4 = p000.q02.m4671(r4)
            if (r4 != 0) goto Lcda
            goto Lcdc
        Lcda:
            r4 = 0
            goto Lcdd
        Lcdc:
            r4 = 1
        Lcdd:
            r38 = r2
            if (r5 == 0) goto Lcee
            java.lang.Boolean r2 = r5.f7329
            if (r2 != 0) goto Lcf0
            java.lang.String r2 = r5.f7330
            boolean r2 = p000.q02.m4671(r2)
            if (r2 != 0) goto Lcee
            goto Lcf0
        Lcee:
            r2 = 0
            goto Lcf1
        Lcf0:
            r2 = 1
        Lcf1:
            if (r4 != 0) goto Ld05
            if (r2 != 0) goto Ld05
            r42 = r7
            r65 = r10
            r4 = r16
            r5 = r50
            r2 = r61
            r10 = r88
            r7 = r89
            goto Ld70
        Ld05:
            if (r4 == 0) goto Ld0a
            r2 = r38
            goto Ld0d
        Ld0a:
            if (r5 == 0) goto Le75
            r2 = r5
        Ld0d:
            java.lang.String r5 = r2.f7330
            if (r4 == 0) goto Ld14
            r4 = r19
            goto Ld16
        Ld14:
            r4 = r23
        Ld16:
            java.lang.Boolean r2 = r2.f7329
            r42 = r7
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            boolean r2 = p000.ln0.m3626(r2, r7)
            if (r2 == 0) goto Ld33
            r2 = r62
            java.lang.String r4 = r4.concat(r2)
            r7 = r89
            r65 = r10
            r5 = r50
            r2 = r61
        Ld30:
            r10 = r88
            goto Ld70
        Ld33:
            r2 = r62
            boolean r7 = p000.q02.m4671(r5)
            if (r7 != 0) goto Ld61
            java.lang.CharSequence r7 = p000.q02.m4660(r5)
            java.lang.String r7 = r7.toString()
            r62 = r2
            r2 = r61
            boolean r7 = p000.ln0.m3626(r7, r2)
            if (r7 == 0) goto Ld52
            r7 = r89
            r5 = r52
            goto Ld58
        Ld52:
            r7 = r89
            java.lang.String r5 = r7.concat(r5)
        Ld58:
            java.lang.String r4 = r4.concat(r5)
            r65 = r10
            r5 = r50
            goto Ld30
        Ld61:
            r7 = r89
            r62 = r2
            r5 = r50
            r2 = r61
            java.lang.String r4 = r4.concat(r5)
            r65 = r10
            goto Ld30
        Ld70:
            java.lang.String r4 = r10.concat(r4)
            r1.append(r4)
            java.lang.String r3 = r3.f4852
            r4 = r87
            java.lang.String r3 = r4.concat(r3)
            r1.append(r3)
            if (r63 == 0) goto Ld8a
            java.lang.String r3 = " · 已发送，等待重燃完成"
            r1.append(r3)
            goto Ld99
        Ld8a:
            if (r64 == 0) goto Ld92
            java.lang.String r3 = " · 已发送，待对方回复"
            r1.append(r3)
            goto Ld99
        Ld92:
            if (r58 == 0) goto Ld99
            java.lang.String r3 = " · 今日已发"
            r1.append(r3)
        Ld99:
            java.lang.String r1 = r1.toString()
            r3 = r90
            r3.setText(r1)
            int r1 = android.graphics.Color.parseColor(r17)
            r3.setTextColor(r1)
            r1 = r40
            r1.setText(r9)
            m3080(r1, r0, r8)
            if (r57 == 0) goto Ldbc
            if (r59 == 0) goto Ldbc
            java.lang.String r35 = "个人开"
        Ldb7:
            r0 = r35
            r9 = r49
            goto Ldeb
        Ldbc:
            if (r57 == 0) goto Ldc3
            if (r59 != 0) goto Ldc3
            java.lang.String r35 = "个人关"
            goto Ldb7
        Ldc3:
            boolean r0 = r12.equals(r6)
            if (r0 == 0) goto Ldcc
            java.lang.String r35 = "组开"
            goto Ldb7
        Ldcc:
            boolean r0 = r12.equals(r13)
            if (r0 == 0) goto Ldd5
            java.lang.String r35 = "组关"
            goto Ldb7
        Ldd5:
            r0 = r33
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto Ldde
            goto Ldb7
        Ldde:
            if (r18 == 0) goto Lde3
            java.lang.String r35 = "未选"
            goto Ldb7
        Lde3:
            if (r83 == 0) goto Lde8
            java.lang.String r35 = "默认"
            goto Ldb7
        Lde8:
            java.lang.String r35 = "手动"
            goto Ldb7
        Ldeb:
            r9.setText(r0)
            if (r60 == 0) goto Ldf3
            r3 = r27
            goto Ldf5
        Ldf3:
            r3 = r67
        Ldf5:
            if (r60 == 0) goto Ldfa
            r0 = r31
            goto Ldfc
        Ldfa:
            r0 = r30
        Ldfc:
            m3080(r9, r3, r0)
            c9 r0 = new c9
            r1 = r81
            r8 = r82
            r3 = r7
            r7 = r92
            r0.<init>(r1, r8, r11, r7)
            r6 = r37
            r6.setOnClickListener(r0)
            ζ r0 = new ζ
            r9 = 4
            r0.<init>(r6, r9, r11)
            r6.setOnLongClickListener(r0)
            ez1 r0 = new ez1
            r22 = r85
            r13 = r86
            r61 = r2
            r8 = r4
            r50 = r5
            r33 = r12
            r48 = r26
            r37 = r28
            r30 = r31
            r4 = r60
            r12 = -2
            r26 = 8
            r28 = 0
            r66 = 12
            r5 = r91
            r2 = r1
            r1 = r6
            r6 = r11
            r31 = r27
            r27 = r67
            r11 = r3
            r3 = r78
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r2 = r0
            r3 = r5
            r0 = r7
            r1.setOnDragListener(r2)
            r1 = r46
            r13.addView(r1)
            r1 = r78
            r4 = r81
            r91 = r3
            r9 = r11
            r26 = r22
            r32 = r31
            r7 = r39
            r5 = r42
            r38 = r45
            r35 = r56
            r6 = r61
            r12 = r65
            r47 = r69
            r45 = r70
            r11 = r10
            r39 = r34
            r34 = r68
            r10 = r8
            r8 = r14
            r14 = r62
            goto L87f
        Le75:
            p000.C1080.m7279(r47)
            return
        Le79:
            p000.C1080.m7272()
            return
        Le7d:
            p000.C1080.m7272()
            return
        Le81:
            p000.C1080.m7279(r47)
            return
        Le85:
            r22 = r26
            r31 = r32
            r68 = r34
            r56 = r35
            r45 = r38
            r34 = r39
            r9 = 4
            r12 = -2
            r26 = 8
            r28 = 0
            r1 = r78
            r4 = r81
            r6 = r13
            r11 = r22
            r12 = r31
            r39 = r34
            r14 = r36
            r5 = r37
            r15 = r41
            r38 = r45
            r8 = r48
            r10 = r53
            r13 = r54
            r9 = r56
            r2 = r68
            goto L4cc
        Leb6:
            p000.C1080.m7272()
            return
        Leba:
            p000.C1080.m7272()
        Lebd:
            return
    }

    /* JADX INFO: renamed from: π */
    public static void m3096(android.widget.EditText r3) {
            yx0 r0 = new yx0
            r1 = 1
            r0.<init>(r3, r1)
            r1 = 120(0x78, double:5.93E-322)
            r3.postDelayed(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ρ */
    public static void m3097(android.app.Activity r44, java.lang.String r45, java.lang.String r46, p000.my1 r47, java.lang.String r48, java.lang.String r49, p000.ky1 r50, p000.C0757rd r51, p000.qh1 r52, p000.g80 r53, p000.p70 r54) {
            r0 = r44
            r6 = r47
            java.lang.String r1 = r6.f7324
            java.lang.String r2 = r6.f7323
            xx r4 = p000.jx0.m3049(r0)
            x01 r3 = p000.x01.f11964
            android.view.LayoutInflater r3 = r3.m6477(r0)
            r5 = 2131492924(0x7f0c003c, float:1.8609314E38)
            r14 = 0
            android.view.View r3 = r3.inflate(r5, r14)
            r3.getClass()
            r8 = r3
            android.widget.ScrollView r8 = (android.widget.ScrollView) r8
            r3 = 2131296959(0x7f0902bf, float:1.821185E38)
            android.view.View r3 = r8.findViewById(r3)
            r9 = r3
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r3 = 2131296846(0x7f09024e, float:1.821162E38)
            android.view.View r3 = r9.findViewById(r3)
            r5 = 2131297108(0x7f090354, float:1.8212152E38)
            android.view.View r5 = r9.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r10 = 2131296355(0x7f090063, float:1.8210624E38)
            android.view.View r10 = r9.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r11 = 2131297106(0x7f090352, float:1.8212148E38)
            android.view.View r11 = r9.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r12 = 2131296471(0x7f0900d7, float:1.821086E38)
            android.view.View r12 = r9.findViewById(r12)
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            r13 = 2131296872(0x7f090268, float:1.8211673E38)
            android.view.View r13 = r9.findViewById(r13)
            android.widget.RadioGroup r13 = (android.widget.RadioGroup) r13
            r14 = 2131296577(0x7f090141, float:1.8211075E38)
            android.view.View r14 = r9.findViewById(r14)
            android.widget.EditText r14 = (android.widget.EditText) r14
            r15 = 2131296462(0x7f0900ce, float:1.8210841E38)
            android.view.View r15 = r9.findViewById(r15)
            android.widget.LinearLayout r15 = (android.widget.LinearLayout) r15
            r6 = 2131297075(0x7f090333, float:1.8212085E38)
            android.view.View r6 = r9.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131297074(0x7f090332, float:1.8212083E38)
            android.view.View r7 = r9.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r17 = r1
            r1 = 2131296576(0x7f090140, float:1.8211073E38)
            android.view.View r1 = r9.findViewById(r1)
            android.widget.EditText r1 = (android.widget.EditText) r1
            r18 = r2
            r2 = 2131296363(0x7f09006b, float:1.821064E38)
            android.view.View r2 = r9.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r19 = r13
            r13 = 2131296343(0x7f090057, float:1.82106E38)
            android.view.View r13 = r9.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r20 = r13
            r13 = 2131297107(0x7f090353, float:1.821215E38)
            android.view.View r13 = r9.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r21 = r2
            java.lang.String r2 = r4.f12351
            r22 = r7
            r7 = 16
            r23 = r6
            android.graphics.drawable.GradientDrawable r6 = p000.jx0.m3062(r7, r0, r2)
            r8.setBackground(r6)
            android.graphics.drawable.GradientDrawable r2 = p000.jx0.m3062(r7, r0, r2)
            r9.setBackground(r2)
            java.lang.String r6 = r4.f12352
            r2 = 12
            android.graphics.drawable.GradientDrawable r7 = p000.jx0.m3062(r2, r0, r6)
            r3.setBackground(r7)
            android.graphics.drawable.GradientDrawable r3 = p000.jx0.m3062(r2, r0, r6)
            r12.setBackground(r3)
            android.graphics.drawable.GradientDrawable r3 = p000.jx0.m3062(r2, r0, r6)
            r14.setBackground(r3)
            android.graphics.drawable.GradientDrawable r3 = p000.jx0.m3062(r2, r0, r6)
            r15.setBackground(r3)
            java.lang.String r7 = r4.f12348
            java.lang.String r3 = r4.f12371
            r2 = 10
            r26 = r8
            android.graphics.drawable.RippleDrawable r8 = p000.jx0.m3059(r2, r0, r7, r3)
            r1.setBackground(r8)
            java.lang.String r8 = r4.f12361
            r27 = r3
            android.graphics.drawable.RippleDrawable r3 = p000.jx0.m3059(r2, r0, r7, r8)
            r10.setBackground(r3)
            java.lang.String r3 = r4.f12360
            int r2 = android.graphics.Color.parseColor(r3)
            r10.setTextColor(r2)
            r2 = r45
            r5.setText(r2)
            java.lang.String r2 = r4.f12355
            r28 = r8
            r8 = 1
            r29 = r7
            r7 = 0
            p000.lz1.m3699(r2, r5, r7, r8)
            r5 = r46
            r11.setText(r5)
            java.lang.String r7 = r4.f12356
            int r5 = android.graphics.Color.parseColor(r7)
            r11.setTextColor(r5)
            java.lang.String r5 = r4.f12349
            int r5 = android.graphics.Color.parseColor(r5)
            r13.setTextColor(r5)
            int r5 = android.graphics.Color.parseColor(r2)
            r14.setTextColor(r5)
            java.lang.String r11 = r4.f12357
            int r5 = android.graphics.Color.parseColor(r11)
            r14.setHintTextColor(r5)
            int r5 = android.graphics.Color.parseColor(r2)
            r45 = r2
            r2 = r23
            r2.setTextColor(r5)
            r5 = 0
            r2.setTypeface(r5, r8)
            int r2 = android.graphics.Color.parseColor(r7)
            r5 = r22
            r5.setTextColor(r2)
            int r2 = android.graphics.Color.parseColor(r45)
            r1.setTextColor(r2)
            int r2 = android.graphics.Color.parseColor(r11)
            r1.setHintTextColor(r2)
            java.lang.String r2 = r4.f12358
            r5 = 12
            android.graphics.drawable.GradientDrawable r8 = p000.jx0.m3062(r5, r0, r2)
            r23 = r2
            r2 = r21
            r2.setBackground(r8)
            android.graphics.drawable.GradientDrawable r8 = p000.jx0.m3062(r5, r0, r3)
            r21 = r11
            r11 = r20
            r11.setBackground(r8)
            if (r50 == 0) goto L184
            r5 = 0
            goto L186
        L184:
            r5 = 8
        L186:
            r11.setVisibility(r5)
            if (r52 == 0) goto L18d
            r5 = 0
            goto L18f
        L18d:
            r5 = 8
        L18f:
            r2.setVisibility(r5)
            fu1 r5 = new fu1
            r8 = 1
            r5.<init>(r14, r8)
            r14.setOnClickListener(r5)
            yy1 r5 = new yy1
            r8 = 0
            r5.<init>(r8)
            r14.setOnFocusChangeListener(r5)
            fu1 r5 = new fu1
            r8 = 2
            r5.<init>(r1, r8)
            r1.setOnClickListener(r5)
            yy1 r5 = new yy1
            r8 = 1
            r5.<init>(r8)
            r1.setOnFocusChangeListener(r5)
            ma0 r5 = new ma0
            r8 = 3
            r5.<init>(r0, r8)
            r10.setOnClickListener(r5)
            if (r50 == 0) goto L1c8
            ry1 r5 = p000.ry1.f9602
            java.lang.Integer r5 = p000.ry1.m5199(r50)
            goto L1c9
        L1c8:
            r5 = 0
        L1c9:
            if (r50 == 0) goto L1cd
            r10 = 0
            goto L1cf
        L1cd:
            r10 = 8
        L1cf:
            r15.setVisibility(r10)
            if (r5 == 0) goto L1d9
            java.lang.String r5 = r5.toString()
            goto L1da
        L1d9:
            r5 = 0
        L1da:
            if (r5 != 0) goto L1de
            java.lang.String r5 = ""
        L1de:
            r1.setText(r5)
            r5 = r19
            r10 = 8
            r5.setVisibility(r10)
            r5 = r18
            r14.setText(r5)
            um1 r10 = new um1
            r10.<init>()
            boolean r5 = p000.q02.m4671(r5)
            java.lang.String r15 = "default"
            java.lang.String r8 = "custom"
            java.lang.String r0 = "jinrishici"
            r19 = r1
            java.lang.String r1 = "hitokoto"
            if (r5 != 0) goto L204
            r5 = r8
            goto L217
        L204:
            r5 = r17
            boolean r17 = p000.ln0.m3626(r5, r1)
            if (r17 == 0) goto L20e
            r5 = r1
            goto L217
        L20e:
            boolean r5 = p000.ln0.m3626(r5, r0)
            if (r5 == 0) goto L216
            r5 = r0
            goto L217
        L216:
            r5 = r15
        L217:
            r10.f10912 = r5
            java.lang.String r17 = "跟随全局"
            java.lang.String r30 = "跟随分组/全局"
            if (r50 == 0) goto L224
            r5 = r30
        L221:
            r31 = r2
            goto L227
        L224:
            r5 = r17
            goto L221
        L227:
            fz1 r2 = new fz1
            r2.<init>(r15, r5)
            fz1 r5 = new fz1
            java.lang.String r15 = "固定文本"
            r5.<init>(r8, r15)
            fz1 r8 = new fz1
            java.lang.String r15 = "一言"
            r8.<init>(r1, r15)
            fz1 r1 = new fz1
            java.lang.String r15 = "今日诗词"
            r1.<init>(r0, r15)
            fz1[] r0 = new p000.fz1[]{r2, r5, r8, r1}
            java.util.List r2 = p000.AbstractC1021yh.m6897(r0)
            java.lang.Object r0 = r10.f10912
            java.lang.String r0 = (java.lang.String) r0
            vl r5 = new vl
            r8 = 6
            r5.<init>(r10, r8)
            r1 = 0
            r8 = 10
            r25 = r45
            r15 = r27
            r27 = r23
            r23 = r3
            r3 = r0
            r0 = r44
            android.widget.LinearLayout r1 = m3082(r0, r1, r2, r3, r4, r5)
            r12.addView(r1)
            um1 r12 = new um1
            r12.<init>()
            java.lang.String r0 = "follow"
            if (r48 != 0) goto L273
            r1 = r0
            goto L275
        L273:
            r1 = r48
        L275:
            r12.f10912 = r1
            if (r48 == 0) goto L309
            zt0 r1 = p000.AbstractC1021yh.m6893()
            fz1 r2 = new fz1
            java.lang.String r3 = "跟随默认规则"
            r2.<init>(r0, r3)
            r1.add(r2)
            fz1 r2 = new fz1
            java.lang.String r3 = "组"
            r5 = r49
            r8 = 0
            boolean r20 = p000.x02.m6485(r5, r3, r8)
            if (r20 == 0) goto L29b
            java.lang.String r20 = "组内全部加入自定义续火"
        L296:
            r32 = r0
            r8 = r20
            goto L29e
        L29b:
            java.lang.String r20 = "加入自定义续火"
            goto L296
        L29e:
            java.lang.String r0 = "custom_on"
            r2.<init>(r0, r8)
            r1.add(r2)
            fz1 r0 = new fz1
            r8 = 0
            boolean r2 = p000.x02.m6485(r5, r3, r8)
            if (r2 == 0) goto L2b2
            java.lang.String r2 = "自定义续火时排除整组"
            goto L2b4
        L2b2:
            java.lang.String r2 = "自定义续火时排除"
        L2b4:
            java.lang.String r8 = "custom_off"
            r0.<init>(r8, r2)
            r1.add(r0)
            r8 = 0
            boolean r0 = p000.x02.m6485(r5, r3, r8)
            if (r0 == 0) goto L2cf
            fz1 r0 = new fz1
            java.lang.String r2 = "due_only"
            java.lang.String r3 = "仅待续时发送"
            r0.<init>(r2, r3)
            r1.add(r0)
        L2cf:
            zt0 r2 = p000.AbstractC1021yh.m6883(r1)
            java.lang.Object r0 = r12.f10912
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            vl r5 = new vl
            r0 = 7
            r5.<init>(r12, r0)
            r0 = r44
            r1 = r49
            r8 = r32
            android.widget.LinearLayout r1 = m3082(r0, r1, r2, r3, r4, r5)
            int r2 = r9.indexOfChild(r13)
            if (r2 >= 0) goto L2ef
            r2 = 0
        L2ef:
            r9.addView(r1, r2)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r2 = r1 instanceof android.widget.LinearLayout.LayoutParams
            if (r2 == 0) goto L2fd
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            goto L2fe
        L2fd:
            r1 = 0
        L2fe:
            if (r1 == 0) goto L30c
            r2 = 10
            int r3 = m3086(r0, r2)
            r1.topMargin = r3
            goto L30c
        L309:
            r8 = r0
            r0 = r44
        L30c:
            um1 r1 = new um1
            r1.<init>()
            r2 = r47
            java.lang.Boolean r3 = r2.f7326
            java.lang.String r3 = m3099(r3)
            r1.f10912 = r3
            um1 r3 = new um1
            r3.<init>()
            java.lang.Boolean r5 = r2.f7327
            java.lang.String r5 = m3099(r5)
            r3.f10912 = r5
            r32 = r10
            um1 r10 = new um1
            r10.<init>()
            java.lang.Boolean r5 = r2.f7328
            java.lang.String r5 = m3099(r5)
            r10.f10912 = r5
            r33 = r11
            um1 r11 = new um1
            r11.<init>()
            java.lang.Boolean r5 = r2.f7329
            java.lang.String r5 = m3099(r5)
            r11.f10912 = r5
            um1 r5 = new um1
            r5.<init>()
            r48 = r3
            java.lang.String r3 = r2.f7330
            r5.f10912 = r3
            um1 r3 = new um1
            r3.<init>()
            if (r50 != 0) goto L35e
            if (r51 == 0) goto L35b
            goto L35e
        L35b:
            r34 = 0
            goto L360
        L35e:
            r34 = 1
        L360:
            if (r50 == 0) goto L364
            r17 = r30
        L364:
            r30 = r7
            r7 = r17
            r17 = r12
            java.lang.String r12 = "关闭"
            r35 = r14
            java.lang.String r14 = "off"
            r36 = r9
            java.lang.String r9 = "开启"
            r37 = r13
            java.lang.String r13 = "on"
            if (r34 == 0) goto L5f2
            r49 = r11
            r2 = 1
            android.widget.LinearLayout r11 = p000.AbstractC0602nx.m4123(r0, r2)
            r38 = r3
            r2 = 12
            android.graphics.drawable.GradientDrawable r3 = p000.jx0.m3062(r2, r0, r6)
            r11.setBackground(r3)
            r2 = 10
            int r3 = m3086(r0, r2)
            r39 = r4
            int r4 = m3086(r0, r2)
            r40 = r5
            int r5 = m3086(r0, r2)
            r41 = r6
            int r6 = m3086(r0, r2)
            r11.setPadding(r3, r4, r5, r6)
            fz1 r2 = new fz1
            r2.<init>(r8, r7)
            fz1 r3 = new fz1
            r3.<init>(r13, r9)
            fz1 r4 = new fz1
            r4.<init>(r14, r12)
            fz1[] r2 = new p000.fz1[]{r2, r3, r4}
            java.util.List r2 = p000.AbstractC1021yh.m6897(r2)
            java.lang.Object r3 = r1.f10912
            java.lang.String r3 = (java.lang.String) r3
            vl r5 = new vl
            r4 = 8
            r5.<init>(r1, r4)
            r4 = r1
            java.lang.String r1 = "参与每日火星任务"
            r6 = r12
            r12 = r48
            r48 = r6
            r6 = r38
            r38 = r4
            r4 = r39
            r39 = r14
            r14 = r40
            r40 = r9
            r9 = r6
            r6 = r47
            android.widget.LinearLayout r1 = m3082(r0, r1, r2, r3, r4, r5)
            r11.addView(r1)
            java.lang.Object r0 = r12.f10912
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            vl r5 = new vl
            r0 = 9
            r5.<init>(r12, r0)
            java.lang.String r1 = "自动完成互发消息"
            r0 = r44
            android.widget.LinearLayout r1 = m3082(r0, r1, r2, r3, r4, r5)
            r11.addView(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "互发消息内容（留空"
            r3.<init>(r5)
            r3.append(r7)
            java.lang.String r5 = "）"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r1.setText(r3)
            int r3 = android.graphics.Color.parseColor(r25)
            r1.setTextColor(r3)
            r3 = 0
            r5 = 1
            r1.setTypeface(r3, r5)
            r5 = 10
            int r3 = m3086(r0, r5)
            r5 = 6
            int r5 = m3086(r0, r5)
            r45 = r12
            r12 = 0
            r1.setPadding(r12, r3, r12, r5)
            r11.addView(r1)
            android.widget.EditText r1 = new android.widget.EditText
            r1.<init>(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "当前"
            r3.<init>(r5)
            r3.append(r7)
            java.lang.String r5 = "默认内容"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r1.setHint(r3)
            java.lang.String r3 = r6.f7325
            r1.setText(r3)
            r3 = 2
            r1.setMaxLines(r3)
            int r3 = android.graphics.Color.parseColor(r25)
            r1.setTextColor(r3)
            int r3 = android.graphics.Color.parseColor(r21)
            r1.setHintTextColor(r3)
            r6 = r29
            r5 = 10
            android.graphics.drawable.RippleDrawable r3 = p000.jx0.m3059(r5, r0, r6, r15)
            r1.setBackground(r3)
            int r3 = m3086(r0, r5)
            r21 = r2
            r12 = 8
            int r2 = m3086(r0, r12)
            r29 = r4
            int r4 = m3086(r0, r5)
            int r5 = m3086(r0, r12)
            r1.setPadding(r3, r2, r4, r5)
            fu1 r2 = new fu1
            r3 = 3
            r2.<init>(r1, r3)
            r1.setOnClickListener(r2)
            r9.f10912 = r1
            r11.addView(r1)
            java.lang.Object r1 = r10.f10912
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            vl r5 = new vl
            r2 = 1
            r5.<init>(r10, r2)
            java.lang.String r1 = "自动发送任务图片"
            r2 = r21
            r4 = r29
            r16 = 0
            android.widget.LinearLayout r1 = m3082(r0, r1, r2, r3, r4, r5)
            r11.addView(r1)
            r12 = r49
            java.lang.Object r0 = r12.f10912
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            vl r5 = new vl
            r0 = 2
            r5.<init>(r12, r0)
            java.lang.String r1 = "自动投喂小火人"
            r0 = r44
            android.widget.LinearLayout r1 = m3082(r0, r1, r2, r3, r4, r5)
            r11.addView(r1)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r0)
            java.lang.String r1 = m3103(r14, r7)
            java.lang.String r2 = "投喂食物："
            java.lang.String r1 = r2.concat(r1)
            r5.setText(r1)
            r1 = 1095761920(0x41500000, float:13.0)
            r5.setTextSize(r1)
            int r2 = android.graphics.Color.parseColor(r25)
            r5.setTextColor(r2)
            r2 = 10
            android.graphics.drawable.RippleDrawable r3 = p000.jx0.m3059(r2, r0, r6, r15)
            r5.setBackground(r3)
            r2 = 12
            int r3 = m3086(r0, r2)
            r4 = 11
            int r15 = m3086(r0, r4)
            int r1 = m3086(r0, r2)
            int r2 = m3086(r0, r4)
            r5.setPadding(r3, r15, r1, r2)
            g90 r0 = new g90
            r1 = r6
            r6 = 4
            r3 = r50
            r4 = r5
            r5 = r7
            r2 = r14
            r14 = r41
            r15 = 1095761920(0x41500000, float:13.0)
            r7 = r1
            r1 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r6 = r1
            r1 = r0
            r0 = r6
            r6 = r2
            r4.setOnClickListener(r1)
            r11.addView(r4)
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            boolean r2 = r1 instanceof android.widget.LinearLayout.LayoutParams
            if (r2 == 0) goto L535
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            goto L537
        L535:
            r1 = r16
        L537:
            if (r1 == 0) goto L541
            r2 = 8
            int r3 = m3086(r0, r2)
            r1.topMargin = r3
        L541:
            if (r50 == 0) goto L546
            java.lang.String r1 = "更新该人员食物列表"
            goto L548
        L546:
            java.lang.String r1 = "更新食物列表"
        L548:
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r0)
            r2.setText(r1)
            r3 = 17
            r2.setGravity(r3)
            r2.setTextSize(r15)
            int r3 = android.graphics.Color.parseColor(r23)
            r2.setTextColor(r3)
            r3 = r28
            r15 = 10
            android.graphics.drawable.RippleDrawable r3 = p000.jx0.m3059(r15, r0, r7, r3)
            r2.setBackground(r3)
            int r3 = m3086(r0, r15)
            int r7 = m3086(r0, r15)
            r21 = r1
            int r1 = m3086(r0, r15)
            r23 = r4
            int r4 = m3086(r0, r15)
            r2.setPadding(r3, r7, r1, r4)
            tt1 r0 = new tt1
            r24 = 16
            r3 = r50
            r1 = r2
            r7 = r5
            r4 = r21
            r5 = r23
            r2 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r4 = r2
            r2 = r0
            r0 = r4
            r15 = r3
            r4 = r5
            r5 = r7
            r1.setOnClickListener(r2)
            r11.addView(r1)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r2 = r1 instanceof android.widget.LinearLayout.LayoutParams
            if (r2 == 0) goto L5aa
            r7 = r1
            android.widget.LinearLayout$LayoutParams r7 = (android.widget.LinearLayout.LayoutParams) r7
            goto L5ac
        L5aa:
            r7 = r16
        L5ac:
            if (r7 == 0) goto L5b6
            r2 = 8
            int r1 = m3086(r0, r2)
            r7.topMargin = r1
        L5b6:
            ef1 r1 = p000.gf1.m2303()
            java.util.List r1 = r1.f3533
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L5cc
            java.lang.Object r1 = p000.pf1.f8541
            wy1 r1 = new wy1
            r1.<init>(r4, r6, r5)
            p000.pf1.m4519(r0, r15, r1)
        L5cc:
            r7 = r36
            r1 = r37
            int r2 = r7.indexOfChild(r1)
            if (r2 >= 0) goto L5d7
            r2 = 0
        L5d7:
            r7.addView(r11, r2)
            android.view.ViewGroup$LayoutParams r2 = r11.getLayoutParams()
            boolean r3 = r2 instanceof android.widget.LinearLayout.LayoutParams
            if (r3 == 0) goto L5e5
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            goto L5e7
        L5e5:
            r2 = r16
        L5e7:
            if (r2 == 0) goto L60d
            r3 = 10
            int r4 = m3086(r0, r3)
            r2.topMargin = r4
            goto L60d
        L5f2:
            r45 = r48
            r15 = r50
            r38 = r1
            r29 = r4
            r40 = r9
            r48 = r12
            r39 = r14
            r1 = r37
            r16 = 0
            r24 = 16
            r9 = r3
            r14 = r6
            r12 = r11
            r6 = r5
            r5 = r7
            r7 = r36
        L60d:
            um1 r11 = new um1
            r11.<init>()
            ip1 r2 = p000.ip1.f5162
            r3 = r51
            if (r51 == 0) goto L61c
            ip1 r4 = r3.f9337
            if (r4 != 0) goto L61d
        L61c:
            r4 = r2
        L61d:
            java.lang.String r4 = m3098(r4)
            r11.f10912 = r4
            um1 r4 = new um1
            r4.<init>()
            r37 = r1
            if (r3 == 0) goto L630
            ip1 r1 = r3.f9338
            if (r1 != 0) goto L631
        L630:
            r1 = r2
        L631:
            java.lang.String r1 = m3098(r1)
            r4.f10912 = r1
            um1 r1 = new um1
            r1.<init>()
            r46 = r2
            if (r3 == 0) goto L644
            ip1 r2 = r3.f9339
            if (r2 != 0) goto L646
        L644:
            r2 = r46
        L646:
            java.lang.String r2 = m3098(r2)
            r1.f10912 = r2
            if (r3 == 0) goto L701
            r21 = r6
            r2 = 1
            android.widget.LinearLayout r6 = p000.AbstractC0602nx.m4123(r0, r2)
            r2 = 12
            android.graphics.drawable.GradientDrawable r2 = p000.jx0.m3062(r2, r0, r14)
            r6.setBackground(r2)
            r2 = 10
            int r14 = m3086(r0, r2)
            r46 = r1
            int r1 = m3086(r0, r2)
            int r3 = m3086(r0, r2)
            r47 = r4
            int r4 = m3086(r0, r2)
            r6.setPadding(r14, r1, r3, r4)
            fz1 r1 = new fz1
            r1.<init>(r8, r5)
            fz1 r2 = new fz1
            r3 = r40
            r2.<init>(r13, r3)
            fz1 r3 = new fz1
            r4 = r48
            r5 = r39
            r3.<init>(r5, r4)
            fz1[] r1 = new p000.fz1[]{r1, r2, r3}
            java.util.List r2 = p000.AbstractC1021yh.m6897(r1)
            java.lang.Object r1 = r11.f10912
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
            vl r5 = new vl
            r1 = 3
            r5.<init>(r11, r1)
            java.lang.String r1 = "营地自动收获"
            r8 = r46
            r14 = r47
            r4 = r29
            r13 = r37
            r22 = 1
            android.widget.LinearLayout r1 = m3082(r0, r1, r2, r3, r4, r5)
            r6.addView(r1)
            java.lang.Object r0 = r14.f10912
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            vl r5 = new vl
            r0 = 4
            r5.<init>(r14, r0)
            java.lang.String r1 = "营地自动种植"
            r0 = r44
            android.widget.LinearLayout r1 = m3082(r0, r1, r2, r3, r4, r5)
            r6.addView(r1)
            java.lang.Object r0 = r8.f10912
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            vl r5 = new vl
            r0 = 5
            r5.<init>(r8, r0)
            java.lang.String r1 = "营地自动浇水"
            r0 = r44
            android.widget.LinearLayout r1 = m3082(r0, r1, r2, r3, r4, r5)
            r6.addView(r1)
            int r1 = r7.indexOfChild(r13)
            if (r1 >= 0) goto L6e5
            r1 = 0
        L6e5:
            r7.addView(r6, r1)
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            boolean r2 = r1 instanceof android.widget.LinearLayout.LayoutParams
            if (r2 == 0) goto L6f4
            r7 = r1
            android.widget.LinearLayout$LayoutParams r7 = (android.widget.LinearLayout.LayoutParams) r7
            goto L6f6
        L6f4:
            r7 = r16
        L6f6:
            if (r7 == 0) goto L709
            r2 = 10
            int r1 = m3086(r0, r2)
            r7.topMargin = r1
            goto L709
        L701:
            r8 = r1
            r14 = r4
            r21 = r6
            r4 = r29
            r22 = 1
        L709:
            xy1 r0 = new xy1
            r13 = 0
            r47 = r16
            r16 = r11
            r11 = r12
            r12 = r21
            r21 = r47
            r3 = r44
            r1 = r52
            r42 = r4
            r18 = r8
            r7 = r9
            r47 = r14
            r14 = r26
            r2 = r31
            r4 = r32
            r20 = r33
            r6 = r34
            r5 = r35
            r8 = r38
            r9 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r22 = r6
            r6 = r12
            r2.setOnClickListener(r0)
            xy1 r0 = new xy1
            r13 = 1
            r1 = r15
            r2 = r20
            r6 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = r0
            r0 = r3
            r6 = r12
            r12 = r11
            r11 = r2
            r11.setOnClickListener(r1)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r0)
            android.app.AlertDialog$Builder r1 = r1.setView(r14)
            zy1 r0 = new zy1
            r2 = r50
            r15 = r51
            r43 = r1
            r3 = r4
            r14 = r6
            r11 = r9
            r13 = r12
            r6 = r17
            r1 = r19
            r4 = r44
            r17 = r47
            r9 = r7
            r12 = r10
            r7 = r5
            r10 = r8
            r8 = r22
            r5 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r1 = "保存"
            r2 = r43
            android.app.AlertDialog$Builder r0 = r2.setPositiveButton(r1, r0)
            java.lang.String r1 = "取消"
            r5 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r5)
            wt1 r1 = new wt1
            r2 = r54
            r8 = 1
            r1.<init>(r8, r2)
            java.lang.String r2 = "清除"
            android.app.AlertDialog$Builder r0 = r0.setNeutralButton(r2, r1)
            android.app.AlertDialog r0 = r0.create()
            r0.show()
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L7a7
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r8 = 0
            r2.<init>(r8)
            r1.setBackgroundDrawable(r2)
        L7a7:
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L7b2
            r2 = 16
            r1.setSoftInputMode(r2)
        L7b2:
            r1 = -1
            android.widget.Button r1 = r0.getButton(r1)
            if (r1 == 0) goto L7c0
            int r2 = android.graphics.Color.parseColor(r27)
            r1.setTextColor(r2)
        L7c0:
            r1 = -2
            android.widget.Button r1 = r0.getButton(r1)
            if (r1 == 0) goto L7ce
            int r2 = android.graphics.Color.parseColor(r30)
            r1.setTextColor(r2)
        L7ce:
            r1 = -3
            android.widget.Button r0 = r0.getButton(r1)
            if (r0 == 0) goto L7e0
            r4 = r42
            java.lang.String r1 = r4.f12366
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
        L7e0:
            return
    }

    /* JADX INFO: renamed from: σ */
    public static final java.lang.String m3098(p000.ip1 r1) {
            int r1 = r1.ordinal()
            if (r1 == 0) goto L17
            r0 = 1
            if (r1 == r0) goto L14
            r0 = 2
            if (r1 != r0) goto Lf
            java.lang.String r1 = "off"
            return r1
        Lf:
            p000.C1080.m7272()
            r1 = 0
            return r1
        L14:
            java.lang.String r1 = "on"
            return r1
        L17:
            java.lang.String r1 = "follow"
            return r1
    }

    /* JADX INFO: renamed from: τ */
    public static final java.lang.String m3099(java.lang.Boolean r1) {
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = p000.ln0.m3626(r1, r0)
            if (r0 == 0) goto Lb
            java.lang.String r1 = "on"
            return r1
        Lb:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = p000.ln0.m3626(r1, r0)
            if (r0 == 0) goto L16
            java.lang.String r1 = "off"
            return r1
        L16:
            if (r1 != 0) goto L1b
            java.lang.String r1 = "follow"
            return r1
        L1b:
            p000.C1080.m7272()
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: υ */
    public static final p000.ip1 m3100(java.lang.String r1) {
            java.lang.String r0 = "on"
            boolean r0 = p000.ln0.m3626(r1, r0)
            if (r0 == 0) goto Lb
            ip1 r1 = p000.ip1.f5163
            return r1
        Lb:
            java.lang.String r0 = "off"
            boolean r1 = p000.ln0.m3626(r1, r0)
            if (r1 == 0) goto L16
            ip1 r1 = p000.ip1.f5164
            return r1
        L16:
            ip1 r1 = p000.ip1.f5162
            return r1
    }

    /* JADX INFO: renamed from: φ */
    public static final java.lang.Boolean m3101(java.lang.String r1) {
            java.lang.String r0 = "on"
            boolean r0 = p000.ln0.m3626(r1, r0)
            if (r0 == 0) goto Lb
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        Lb:
            java.lang.String r0 = "off"
            boolean r1 = p000.ln0.m3626(r1, r0)
            if (r1 == 0) goto L16
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        L16:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: χ */
    public static final p000.my1 m3102(p000.um1 r14, android.widget.EditText r15, boolean r16, p000.um1 r17, p000.um1 r18, p000.um1 r19, p000.um1 r20, p000.um1 r21, p000.um1 r22) {
            java.lang.Object r14 = r14.f10912
            java.lang.String r14 = (java.lang.String) r14
            int r0 = r14.hashCode()
            r1 = -1349088399(0xffffffffaf968b71, float:-2.738392E-10)
            java.lang.String r2 = ""
            r3 = 0
            if (r0 == r1) goto L3c
            r1 = -1305922533(0xffffffffb229341b, float:-9.848942E-9)
            r4 = 253(0xfd, float:3.55E-43)
            if (r0 == r1) goto L2d
            r1 = -512471468(0xffffffffe1744e54, float:-2.816656E20)
            if (r0 == r1) goto L1d
            goto L69
        L1d:
            java.lang.String r0 = "jinrishici"
            boolean r14 = r14.equals(r0)
            if (r14 != 0) goto L26
            goto L69
        L26:
            my1 r14 = new my1
            r14.<init>(r4, r3, r0)
        L2b:
            r4 = r14
            goto L71
        L2d:
            java.lang.String r0 = "hitokoto"
            boolean r14 = r14.equals(r0)
            if (r14 != 0) goto L36
            goto L69
        L36:
            my1 r14 = new my1
            r14.<init>(r4, r3, r0)
            goto L2b
        L3c:
            java.lang.String r0 = "custom"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L69
            my1 r14 = new my1
            android.text.Editable r1 = r15.getText()
            if (r1 == 0) goto L51
            java.lang.String r1 = r1.toString()
            goto L52
        L51:
            r1 = r3
        L52:
            if (r1 != 0) goto L55
            r1 = r2
        L55:
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            r4 = 80
            java.lang.String r1 = p000.q02.m4693(r1, r4)
            r4 = 252(0xfc, float:3.53E-43)
            r14.<init>(r4, r1, r0)
            goto L2b
        L69:
            my1 r14 = new my1
            r0 = 255(0xff, float:3.57E-43)
            r14.<init>(r0, r3, r3)
            goto L2b
        L71:
            if (r16 == 0) goto Lce
            r14 = r17
            java.lang.Object r14 = r14.f10912
            android.widget.EditText r14 = (android.widget.EditText) r14
            if (r14 == 0) goto L85
            android.text.Editable r14 = r14.getText()
            if (r14 == 0) goto L85
            java.lang.String r3 = r14.toString()
        L85:
            if (r3 != 0) goto L88
            goto L89
        L88:
            r2 = r3
        L89:
            java.lang.CharSequence r14 = p000.q02.m4660(r2)
            java.lang.String r14 = r14.toString()
            r0 = 48
            java.lang.String r7 = p000.q02.m4693(r14, r0)
            r14 = r18
            java.lang.Object r14 = r14.f10912
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Boolean r8 = m3101(r14)
            r14 = r19
            java.lang.Object r14 = r14.f10912
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Boolean r9 = m3101(r14)
            r14 = r20
            java.lang.Object r14 = r14.f10912
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Boolean r10 = m3101(r14)
            r14 = r21
            java.lang.Object r14 = r14.f10912
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Boolean r11 = m3101(r14)
            r14 = r22
            java.lang.Object r14 = r14.f10912
            r12 = r14
            java.lang.String r12 = (java.lang.String) r12
            r13 = 3
            r5 = 0
            r6 = 0
            my1 r14 = p000.my1.m3911(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r14
        Lce:
            return r4
    }

    /* JADX INFO: renamed from: ψ */
    public static final java.lang.String m3103(p000.um1 r1, java.lang.String r2) {
            java.lang.Object r0 = r1.f10912
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = p000.q02.m4671(r0)
            if (r0 == 0) goto L11
            java.lang.String r1 = "默认"
            java.lang.String r1 = r2.concat(r1)
            return r1
        L11:
            java.lang.Object r1 = r1.f10912
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = p000.gf1.m2301(r1)
            return r1
    }

    /* JADX INFO: renamed from: ω */
    public static void m3104() {
            hy r0 = p000.jz1.f5678
            if (r0 == 0) goto L9
            android.os.Handler r1 = p000.jz1.f5677
            r1.removeCallbacks(r0)
        L9:
            r0 = 0
            p000.jz1.f5678 = r0
            return
    }
}
