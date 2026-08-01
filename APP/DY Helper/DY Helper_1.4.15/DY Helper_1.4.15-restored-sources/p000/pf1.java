package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class pf1 {

    /* JADX INFO: renamed from: α */
    public static final java.lang.Object f8541 = null;

    /* JADX INFO: renamed from: β */
    public static boolean f8542;

    /* JADX INFO: renamed from: γ */
    public static final java.util.ArrayList f8543 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.ExecutorService f8544 = null;

    /* JADX INFO: renamed from: ε */
    public static final p000.wd1 f8545 = null;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.pf1.f8541 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            p000.pf1.f8543 = r0
            aj r0 = new aj
            r1 = 16
            r0.<init>(r1)
            r1 = 3
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newFixedThreadPool(r1, r0)
            p000.pf1.f8544 = r0
            wd1 r0 = new wd1
            r1 = 24
            r2 = 1
            r0.<init>(r1, r2)
            p000.pf1.f8545 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static android.graphics.drawable.GradientDrawable m4516(android.app.Activity r2, p000.C1000xx r3, boolean r4) {
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            if (r4 == 0) goto La
            java.lang.String r1 = r3.f12359
            goto Lc
        La:
            java.lang.String r1 = r3.f12352
        Lc:
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setColor(r1)
            r1 = 1
            int r1 = p000.jx0.m3056(r2, r1)
            if (r4 == 0) goto L1d
            java.lang.String r3 = r3.f12358
            goto L1f
        L1d:
            java.lang.String r3 = r3.f12353
        L1f:
            int r3 = android.graphics.Color.parseColor(r3)
            r0.setStroke(r1, r3)
            r3 = 6
            int r2 = p000.jx0.m3056(r2, r3)
            float r2 = (float) r2
            r0.setCornerRadius(r2)
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static android.graphics.Bitmap m4517(java.lang.String r5, int r6) {
            t41 r0 = p000.C0963wx.f11880
            kz r0 = p000.C0493kz.f6332
            r1 = 2097152(0x200000, float:2.938736E-39)
            java.lang.String r2 = "image/*"
            byte[] r5 = p000.C0963wx.m6406(r5, r0, r2, r1)
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inJustDecodeBounds = r1
            int r2 = r5.length
            r3 = 0
            android.graphics.BitmapFactory.decodeByteArray(r5, r3, r2, r0)
        L19:
            int r2 = r0.outWidth
            int r2 = r2 / r1
            int r4 = r6 * 2
            if (r2 > r4) goto L33
            int r2 = r0.outHeight
            int r2 = r2 / r1
            if (r2 <= r4) goto L26
            goto L33
        L26:
            int r6 = r5.length
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r0.inSampleSize = r1
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeByteArray(r5, r3, r6, r0)
            return r5
        L33:
            int r1 = r1 * 2
            goto L19
    }

    /* JADX INFO: renamed from: γ */
    public static final void m4518(android.widget.RadioButton r2, java.lang.String r3, android.app.Activity r4, android.graphics.Bitmap r5) {
            java.lang.Object r0 = r2.getTag()
            boolean r3 = p000.ln0.m3626(r0, r3)
            if (r3 == 0) goto L31
            boolean r3 = r5.isRecycled()
            if (r3 == 0) goto L11
            goto L31
        L11:
            r3 = 40
            int r3 = p000.jx0.m3056(r4, r3)
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r1 = r4.getResources()
            r0.<init>(r1, r5)
            r5 = 0
            r0.setBounds(r5, r5, r3, r3)
            r3 = 10
            int r3 = p000.jx0.m3056(r4, r3)
            r2.setCompoundDrawablePadding(r3)
            r3 = 0
            r2.setCompoundDrawablesRelative(r0, r3, r3, r3)
        L31:
            return
    }

    /* JADX INFO: renamed from: δ */
    public static void m4519(android.app.Activity r7, p000.ky1 r8, p000.a80 r9) {
            r7.getClass()
            java.lang.Object r1 = p000.pf1.f8541
            monitor-enter(r1)
            java.util.ArrayList r0 = p000.pf1.f8543     // Catch: java.lang.Throwable -> L56
            r0.add(r9)     // Catch: java.lang.Throwable -> L56
            boolean r9 = p000.pf1.f8542     // Catch: java.lang.Throwable -> L56
            r0 = 1
            if (r9 == 0) goto L12
            r9 = 0
            goto L15
        L12:
            p000.pf1.f8542 = r0     // Catch: java.lang.Throwable -> L56
            r9 = r0
        L15:
            monitor-exit(r1)
            if (r9 != 0) goto L19
            return
        L19:
            java.util.concurrent.atomic.AtomicReference r9 = p000.ry1.f9578
            java.lang.Object r9 = r9.get()
            if (r9 == 0) goto L2d
            java.lang.Class r9 = r9.getClass()
            java.lang.ClassLoader r9 = r9.getClassLoader()
            if (r9 == 0) goto L2d
        L2b:
            r2 = r9
            goto L36
        L2d:
            java.lang.Class r9 = r7.getClass()
            java.lang.ClassLoader r9 = r9.getClassLoader()
            goto L2b
        L36:
            java.util.concurrent.ConcurrentHashMap r9 = p000.ry1.f9620
            java.util.Map r9 = p000.ex0.m1975(r9)
            java.util.Collection r3 = r9.values()
            java.lang.Thread r9 = new java.lang.Thread
            vg0 r1 = new vg0
            r6 = 5
            r5 = r7
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.String r7 = "rb5b77f205c010489"
            r9.<init>(r1, r7)
            r9.setDaemon(r0)
            r9.start()
            return
        L56:
            r0 = move-exception
            r7 = r0
            monitor-exit(r1)
            throw r7
    }

    /* JADX INFO: renamed from: ε */
    public static void m4520(android.app.Activity r17, java.lang.String r18, boolean r19, p000.ky1 r20, p000.a80 r21) {
            r6 = r17
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L12
            android.content.Context r0 = r6.getApplicationContext()
            r0.getClass()
            p000.ui1.m5896(r0)
        L12:
            x01 r0 = p000.x01.f11964
            android.view.LayoutInflater r8 = r0.m6477(r6)
            r0 = 0
            r1 = 0
            r2 = 2131492918(0x7f0c0036, float:1.8609301E38)
            android.view.View r12 = r8.inflate(r2, r0, r1)
            r0 = 2131296855(0x7f090257, float:1.8211638E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 2131296854(0x7f090256, float:1.8211636E38)
            android.view.View r1 = r12.findViewById(r1)
            r11 = r1
            android.widget.TextView r11 = (android.widget.TextView) r11
            r1 = 2131296851(0x7f090253, float:1.821163E38)
            android.view.View r1 = r12.findViewById(r1)
            r9 = r1
            android.widget.RadioGroup r9 = (android.widget.RadioGroup) r9
            r1 = 2131296850(0x7f090252, float:1.8211628E38)
            android.view.View r1 = r12.findViewById(r1)
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 2131296852(0x7f090254, float:1.8211632E38)
            android.view.View r1 = r12.findViewById(r1)
            r13 = r1
            android.widget.TextView r13 = (android.widget.TextView) r13
            r1 = 2131296847(0x7f09024f, float:1.8211622E38)
            android.view.View r1 = r12.findViewById(r1)
            r15 = r1
            android.widget.TextView r15 = (android.widget.TextView) r15
            r1 = 2131296849(0x7f090251, float:1.8211626E38)
            android.view.View r1 = r12.findViewById(r1)
            r14 = r1
            android.widget.TextView r14 = (android.widget.TextView) r14
            xx r1 = p000.jx0.m3049(r6)
            r0.getClass()
            r11.getClass()
            r10.getClass()
            r13.getClass()
            r15.getClass()
            r14.getClass()
            android.content.Context r2 = r12.getContext()
            r2.getClass()
            java.lang.String r3 = r1.f12351
            r4 = 8
            android.graphics.drawable.GradientDrawable r2 = p000.jx0.m3062(r4, r2, r3)
            r12.setBackground(r2)
            java.lang.String r2 = r1.f12355
            int r2 = android.graphics.Color.parseColor(r2)
            r0.setTextColor(r2)
            java.lang.String r0 = r1.f12356
            int r2 = android.graphics.Color.parseColor(r0)
            r11.setTextColor(r2)
            int r2 = android.graphics.Color.parseColor(r0)
            r10.setTextColor(r2)
            java.lang.String r2 = r1.f12358
            int r3 = android.graphics.Color.parseColor(r2)
            r13.setTextColor(r3)
            int r0 = android.graphics.Color.parseColor(r0)
            r15.setTextColor(r0)
            int r0 = android.graphics.Color.parseColor(r2)
            r14.setTextColor(r0)
            android.widget.TextView[] r0 = new android.widget.TextView[]{r13, r15, r14}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        Lca:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lea
            java.lang.Object r2 = r0.next()
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r3 = r2.getContext()
            r3.getClass()
            java.lang.String r4 = r1.f12348
            java.lang.String r5 = "#00000000"
            r7 = 6
            android.graphics.drawable.RippleDrawable r3 = p000.jx0.m3059(r7, r3, r4, r5)
            r2.setBackground(r3)
            goto Lca
        Lea:
            um1 r4 = new um1
            r4.<init>()
            java.lang.CharSequence r0 = p000.q02.m4660(r18)
            java.lang.String r0 = r0.toString()
            r4.f10912 = r0
            um1 r0 = new um1
            r0.<init>()
            ef1 r2 = p000.gf1.m2303()
            r0.f10912 = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r6 = r1
            qm1 r1 = new qm1
            r1.<init>()
            r3 = r0
            rd1 r0 = new rd1
            r7 = 1
            r5 = r9
            r9 = r3
            r3 = r4
            r4 = r5
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r5 = r4
            r4 = r3
            r3 = r5
            r5 = r0
            r0 = r1
            r1 = r6
            r3.setOnCheckedChangeListener(r5)
            java.lang.Object r5 = r9.f10912
            ef1 r5 = (p000.ef1) r5
            r7 = r8
            r6 = r11
            r8 = r1
            r1 = r2
            r11 = r5
            r5 = r10
            r2 = r0
            r10 = r4
            r0 = r9
            r9 = r17
            r4 = r19
            m4523(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r4 = r2
            r2 = r1
            r1 = r8
            r8 = r7
            r7 = r4
            r11 = r6
            r6 = r9
            r4 = r10
            android.app.AlertDialog$Builder r9 = new android.app.AlertDialog$Builder
            r9.<init>(r6)
            android.app.AlertDialog$Builder r9 = r9.setView(r12)
            r10 = 1
            android.app.AlertDialog$Builder r9 = r9.setCancelable(r10)
            android.app.AlertDialog r9 = r9.create()
            r10 = r13
            r13 = r2
            r2 = r7
            r7 = r9
            r9 = r3
            r3 = r0
            lf1 r0 = new lf1
            r12 = r5
            r16 = r14
            r14 = r19
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r6 = r1
            r14 = r2
            r5 = r7
            r7 = r3
            r10.setOnClickListener(r0)
            sa r0 = new sa
            r1 = 18
            r0.<init>(r5, r1)
            r15.setOnClickListener(r0)
            mf1 r0 = new mf1
            r3 = r17
            r1 = r19
            r2 = r4
            r4 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r4 = r2
            r1 = r16
            r1.setOnClickListener(r0)
            nf1 r0 = new nf1
            r1 = r6
            r3 = r7
            r2 = r14
            r6 = r17
            r14 = r19
            r7 = r5
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r5 = r7
            r5.setOnShowListener(r0)
            r5.show()
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static final android.widget.RadioButton m4521(android.view.LayoutInflater r2, android.widget.RadioGroup r3, p000.C1000xx r4, android.app.Activity r5, p000.um1 r6, java.util.LinkedHashMap r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r0 = 2131492952(0x7f0c0058, float:1.860937E38)
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            r2.getClass()
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            int r0 = android.view.View.generateViewId()
            r2.setId(r0)
            android.text.SpannableString r8 = p000.jx0.m3064(r8, r9, r4)
            r2.setText(r8)
            r8 = 2
            int r8 = p000.jx0.m3056(r5, r8)
            float r8 = (float) r8
            r9 = 1065353216(0x3f800000, float:1.0)
            r2.setLineSpacing(r8, r9)
            java.lang.String r8 = r4.f12355
            int r8 = android.graphics.Color.parseColor(r8)
            r2.setTextColor(r8)
            android.content.res.ColorStateList r8 = new android.content.res.ColorStateList
            r9 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r9 = new int[]{r9}
            int[] r0 = new int[r1]
            int[][] r9 = new int[][]{r9, r0}
            java.lang.String r0 = r4.f12358
            int r0 = android.graphics.Color.parseColor(r0)
            java.lang.String r1 = r4.f12356
            int r1 = android.graphics.Color.parseColor(r1)
            int[] r0 = new int[]{r0, r1}
            r8.<init>(r9, r0)
            r2.setButtonTintList(r8)
            java.lang.Object r8 = r6.f10912
            boolean r8 = r10.equals(r8)
            android.graphics.drawable.GradientDrawable r8 = m4516(r5, r4, r8)
            r2.setBackground(r8)
            int r8 = r2.getId()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.put(r8, r10)
            r9 = r4
            r4 = r6
            r6 = r3
            cl0 r3 = new cl0
            r8 = r5
            r5 = r10
            r10 = 2
            r7 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r7.setOnClickListener(r3)
            return r7
    }

    /* JADX INFO: renamed from: η */
    public static final void m4522(android.widget.TextView r15, android.widget.TextView r16, android.app.Activity r17, p000.ky1 r18, android.app.AlertDialog r19, p000.um1 r20, java.util.LinkedHashMap r21, p000.qm1 r22, android.widget.RadioGroup r23, boolean r24, android.widget.TextView r25, android.view.LayoutInflater r26, p000.C1000xx r27, p000.um1 r28, boolean r29) {
            r0 = 0
            r15.setEnabled(r0)
            r0 = 1055286886(0x3ee66666, float:0.45)
            r15.setAlpha(r0)
            java.lang.String r0 = "更新中"
            r15.setText(r0)
            java.lang.String r0 = "正在通过宿主获取最新食物目录..."
            r11 = r16
            r11.setText(r0)
            of1 r0 = new of1
            r2 = r15
            r4 = r17
            r1 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r12 = r26
            r13 = r27
            r14 = r28
            r3 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = r0
            r0 = r18
            m4519(r4, r0, r1)
            return
    }

    /* JADX INFO: renamed from: θ */
    public static final void m4523(p000.um1 r16, java.util.LinkedHashMap r17, p000.qm1 r18, android.widget.RadioGroup r19, boolean r20, android.widget.TextView r21, android.widget.TextView r22, android.view.LayoutInflater r23, p000.C1000xx r24, android.app.Activity r25, p000.um1 r26, p000.ef1 r27) {
            r0 = r18
            r1 = r16
            r10 = r27
            r1.f10912 = r10
            r17.clear()
            r11 = 1
            r0.f9050 = r11
            r19.removeAllViews()
            r19.clearCheck()
            if (r20 == 0) goto L30
            java.lang.String r7 = "跟随全局默认"
            java.lang.String r8 = "由设置页的默认投喂食物决定"
            java.lang.String r9 = ""
            r6 = r17
            r2 = r19
            r1 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            android.widget.RadioButton r7 = m4521(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r2.addView(r7)
            goto L32
        L30:
            r2 = r19
        L32:
            java.lang.String r7 = "智能选择"
            java.lang.String r8 = "按价格上限优先选择亲密度 / 火星最高的食物；免费食物优先"
            java.lang.String r9 = "__smart__"
            r6 = r17
            r1 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            android.widget.RadioButton r7 = m4521(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r2.addView(r7)
            java.util.List r1 = r10.f3533
            java.util.Iterator r12 = r1.iterator()
        L4f:
            boolean r1 = r12.hasNext()
            r13 = 0
            r14 = 0
            if (r1 == 0) goto L17a
            java.lang.Object r1 = r12.next()
            r15 = r1
            df1 r15 = (p000.df1) r15
            java.lang.Integer r1 = r15.f3118
            if (r1 != 0) goto L63
            goto L6c
        L63:
            int r3 = r1.intValue()
            if (r3 != 0) goto L6c
            java.lang.String r1 = "最近价格：免费"
            goto L86
        L6c:
            if (r1 != 0) goto L71
            java.lang.String r1 = "最近价格：待刷新"
            goto L86
        L71:
            java.lang.Integer r1 = r15.f3118
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "最近价格："
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " 火星"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L86:
            java.lang.Integer r3 = r15.f3119
            if (r3 == 0) goto Lb8
            int r3 = r3.intValue()
            if (r3 > 0) goto L93
            java.lang.String r3 = ""
            goto Lb9
        L93:
            r4 = 86400(0x15180, float:1.21072E-40)
            int r5 = r3 % r4
            if (r5 != 0) goto La2
            int r3 = r3 / r4
            java.lang.String r4 = " 天"
            java.lang.String r3 = p000.lz1.m3686(r4, r3)
            goto Lb9
        La2:
            int r4 = r3 % 3600
            if (r4 != 0) goto Laf
            int r3 = r3 / 3600
            java.lang.String r4 = " 小时"
            java.lang.String r3 = p000.lz1.m3686(r4, r3)
            goto Lb9
        Laf:
            int r3 = r3 / 60
            java.lang.String r4 = " 分钟"
            java.lang.String r3 = p000.lz1.m3686(r4, r3)
            goto Lb9
        Lb8:
            r3 = r14
        Lb9:
            if (r3 != 0) goto Lbd
            java.lang.String r3 = ""
        Lbd:
            java.lang.Integer r4 = r15.f3120
            if (r4 == 0) goto Lce
            int r4 = r4.intValue()
            java.lang.String r5 = "+"
            java.lang.String r6 = " 亲密度"
            java.lang.String r4 = p000.AbstractC0602nx.m4127(r5, r4, r6)
            goto Lcf
        Lce:
            r4 = r14
        Lcf:
            if (r4 != 0) goto Ld3
            java.lang.String r4 = ""
        Ld3:
            java.lang.String r5 = r15.f3122
            if (r5 != 0) goto Ld9
            java.lang.String r5 = ""
        Ld9:
            java.lang.String[] r1 = new java.lang.String[]{r1, r3, r4, r5}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        Lea:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L101
            java.lang.Object r4 = r1.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = p000.q02.m4671(r5)
            if (r5 != 0) goto Lea
            r3.add(r4)
            goto Lea
        L101:
            java.lang.String r4 = " · "
            r8 = 0
            r9 = 62
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r8 = p000.AbstractC0984xh.m6644(r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r1 = r15.f3117
            java.lang.String r3 = r15.f3116
            java.lang.String r4 = "  #"
            java.lang.String r7 = p000.lz1.m3688(r1, r4, r3)
            java.lang.String r9 = r15.f3116
            r6 = r17
            r1 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            android.widget.RadioButton r7 = m4521(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r2.addView(r7)
            java.lang.String r1 = r15.f3121
            if (r1 == 0) goto L4f
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L4f
            java.lang.String r3 = "https://"
            boolean r3 = p000.x02.m6485(r1, r3, r11)
            if (r3 != 0) goto L150
            java.lang.String r3 = "http://"
            boolean r3 = p000.x02.m6485(r1, r3, r11)
            if (r3 != 0) goto L150
            java.lang.String r3 = "//"
            boolean r3 = p000.x02.m6485(r1, r3, r13)
            if (r3 == 0) goto L151
        L150:
            r14 = r1
        L151:
            if (r14 != 0) goto L155
            goto L4f
        L155:
            r7.setTag(r14)
            wd1 r1 = p000.pf1.f8545
            monitor-enter(r1)
            java.lang.Object r3 = r1.get(r14)     // Catch: java.lang.Throwable -> L177
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch: java.lang.Throwable -> L177
            monitor-exit(r1)
            if (r3 == 0) goto L169
            m4518(r7, r14, r4, r3)
            goto L4f
        L169:
            java.util.concurrent.ExecutorService r1 = p000.pf1.f8544
            e9 r3 = new e9
            r5 = 28
            r3.<init>(r14, r4, r7, r5)
            r1.execute(r3)
            goto L4f
        L177:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L17a:
            r4 = r25
            java.util.Set r1 = r17.entrySet()
            r1.getClass()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L189:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L1a5
            java.lang.Object r3 = r1.next()
            r5 = r3
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r5 = r5.getValue()
            r6 = r26
            java.lang.Object r7 = r6.f10912
            boolean r5 = p000.ln0.m3626(r5, r7)
            if (r5 == 0) goto L189
            goto L1a6
        L1a5:
            r3 = r14
        L1a6:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 == 0) goto L1b1
            java.lang.Object r1 = r3.getKey()
            r14 = r1
            java.lang.Integer r14 = (java.lang.Integer) r14
        L1b1:
            if (r14 == 0) goto L1c3
            int r1 = r14.intValue()
            r2.check(r1)
            int r1 = r14.intValue()
            r3 = r24
            m4524(r2, r4, r3, r1)
        L1c3:
            java.util.List r1 = r10.f3533
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1cf
            r1 = r13
        L1cc:
            r2 = r21
            goto L1d2
        L1cf:
            r1 = 8
            goto L1cc
        L1d2:
            r2.setVisibility(r1)
            long r1 = r10.f3534
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L1ee
            java.util.List r1 = r10.f3533
            int r1 = r1.size()
            java.lang.String r2 = "已缓存 "
            java.lang.String r3 = " 种食物，实际投喂前会重新校验价格"
            java.lang.String r1 = p000.AbstractC0602nx.m4127(r2, r1, r3)
        L1eb:
            r2 = r22
            goto L1f1
        L1ee:
            java.lang.String r1 = "首次打开将自动获取食物目录"
            goto L1eb
        L1f1:
            r2.setText(r1)
            r0.f9050 = r13
            return
    }

    /* JADX INFO: renamed from: ι */
    public static final void m4524(android.widget.RadioGroup r5, android.app.Activity r6, p000.C1000xx r7, int r8) {
            int r0 = r5.getChildCount()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L2a
            android.view.View r3 = r5.getChildAt(r2)
            boolean r4 = r3 instanceof android.widget.RadioButton
            if (r4 == 0) goto L13
            android.widget.RadioButton r3 = (android.widget.RadioButton) r3
            goto L14
        L13:
            r3 = 0
        L14:
            if (r3 != 0) goto L17
            goto L27
        L17:
            int r4 = r3.getId()
            if (r4 != r8) goto L1f
            r4 = 1
            goto L20
        L1f:
            r4 = r1
        L20:
            android.graphics.drawable.GradientDrawable r4 = m4516(r6, r7, r4)
            r3.setBackground(r4)
        L27:
            int r2 = r2 + 1
            goto L6
        L2a:
            return
    }
}
