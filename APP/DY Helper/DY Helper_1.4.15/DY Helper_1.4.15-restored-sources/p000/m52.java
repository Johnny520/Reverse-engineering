package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class m52 {

    /* JADX INFO: renamed from: α */
    public static final p000.m52 f6942 = null;

    /* JADX INFO: renamed from: β */
    public static final java.lang.String f6943 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.lang.String f6944 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.lang.String f6945 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.lang.String f6946 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.Set f6947 = null;

    /* JADX INFO: renamed from: η */
    public static volatile java.util.Set f6948;

    /* JADX INFO: renamed from: θ */
    public static volatile java.util.Set f6949;

    /* JADX INFO: renamed from: ι */
    public static volatile long f6950;

    /* JADX INFO: renamed from: κ */
    public static volatile java.lang.String f6951;

    /* JADX INFO: renamed from: λ */
    public static volatile java.lang.Object f6952;

    /* JADX INFO: renamed from: μ */
    public static volatile java.util.Set f6953;

    /* JADX INFO: renamed from: ν */
    public static volatile int f6954;

    /* JADX INFO: renamed from: ξ */
    public static volatile java.lang.String f6955;

    /* JADX INFO: renamed from: ο */
    public static volatile java.lang.ref.WeakReference f6956;

    /* JADX INFO: renamed from: π */
    public static volatile java.lang.Object f6957;

    /* JADX INFO: renamed from: ρ */
    public static volatile int f6958;

    /* JADX INFO: renamed from: σ */
    public static volatile long f6959;

    /* JADX INFO: renamed from: τ */
    public static volatile long f6960;

    /* JADX INFO: renamed from: υ */
    public static volatile java.lang.Class f6961;

    /* JADX INFO: renamed from: φ */
    public static volatile java.lang.Class f6962;

    static {
            m52 r0 = new m52
            r0.<init>()
            p000.m52.f6942 = r0
            ef0 r0 = p000.ef0.f3529
            java.lang.String r1 = "~797C580DA5DD259BE32348A6895C8C359F04FFB9EADB6AFF23BB38ACFA1A4C4DE4BE4639723A5CC5A954D77DF2D0F2F66A8C556D44DCD72183EB"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String r1 = r0.m1919(r1)
            p000.m52.f6943 = r1
            java.lang.String r1 = "~78F7D767E6AD8E2F174318E7D62B7D5A33BB7E4AE8124A81AEC866E1CBAF632CB68B084656F39F98EA96A2267D23F971626F18950512BFF559DAFF7B146B6B9C790579339F39C94C775DAE87B6A3127DFDF9F44EAEF3989A"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String r1 = r0.m1919(r1)
            p000.m52.f6944 = r1
            java.lang.String r1 = "~7897B8FA4A9E8E3BF9B516DDE3F6FDD5574084CBE8B4160970D94E54B26B9E48699BDEB9B4CC59F2C2D33B371762E2FF6FD29CF22E9EF0315ED2074F6D449992"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String r1 = r0.m1919(r1)
            p000.m52.f6945 = r1
            java.lang.String r1 = "~7958639120ABF85155FECBEFEE807065BD4E6BA9062C97DCAD437F11F3CD5FA3D7AA268A26EA1072EE8CEB3E60897395C66F47"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String r0 = r0.m1919(r1)
            p000.m52.f6946 = r0
            java.lang.String r0 = "推荐"
            java.util.Set r0 = p000.g81.m2288(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p000.AbstractC1021yh.m6889(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L50:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r3)
            r2.getClass()
            r1.add(r2)
            goto L50
        L69:
            java.util.Set r0 = p000.AbstractC0984xh.m6671(r1)
            p000.m52.f6947 = r0
            nz r0 = p000.C0604nz.f7825
            p000.m52.f6948 = r0
            p000.m52.f6949 = r0
            r1 = -1
            p000.m52.f6950 = r1
            java.lang.String r1 = ""
            p000.m52.f6951 = r1
            jz r2 = p000.C0450jz.f5672
            p000.m52.f6952 = r2
            p000.m52.f6953 = r0
            r0 = -1
            p000.m52.f6954 = r0
            p000.m52.f6955 = r1
            p000.m52.f6957 = r2
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m3731(java.util.List r20) {
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r20.iterator()
        L9:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r0.next()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L9
            r1.add(r2)
            goto L9
        L1b:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L23
            goto L46b
        L23:
            java.util.ArrayList r0 = new java.util.ArrayList
            r2 = 10
            int r3 = p000.AbstractC1021yh.m6889(r1, r2)
            r0.<init>(r3)
            java.util.Iterator r3 = r1.iterator()
        L32:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L47
            java.lang.Object r4 = r3.next()
            android.view.View r4 = (android.view.View) r4
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r4)
            r0.add(r5)
            goto L32
        L47:
            p000.m52.f6957 = r0
            m3734()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Set r5 = m3739()
            java.util.Iterator r0 = r1.iterator()
        L5e:
            boolean r6 = r0.hasNext()
            r7 = 1
            r8 = 0
            r9 = 0
            if (r6 == 0) goto Le7
            java.lang.Object r6 = r0.next()
            android.view.View r6 = (android.view.View) r6
            android.widget.TextView r6 = m3737(r6)
            if (r6 != 0) goto L74
            goto L5e
        L74:
            java.lang.CharSequence r10 = r6.getText()
            if (r10 == 0) goto L88
            java.lang.String r10 = r10.toString()
            if (r10 == 0) goto L88
            java.lang.CharSequence r8 = p000.q02.m4660(r10)
            java.lang.String r8 = r8.toString()
        L88:
            if (r8 != 0) goto L8c
            java.lang.String r8 = ""
        L8c:
            r11 = r8
            boolean r8 = m3746(r11)
            if (r8 == 0) goto L5e
            r8 = 2
            int[] r8 = new int[r8]
            r6.getLocationOnScreen(r8)
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r10 = r11.toLowerCase(r10)
            r10.getClass()
            j52 r12 = new j52
            java.lang.Class r13 = r6.getClass()
            java.lang.String r13 = r13.getSimpleName()
            r14 = r12
            r12 = r13
            r13 = r8[r9]
            r8 = r8[r7]
            int r15 = r6.getWidth()
            int r16 = r6.getHeight()
            r20 = r7
            java.util.Set r7 = p000.m52.f6949
            boolean r17 = r7.contains(r10)
            java.util.Set r7 = p000.m52.f6947
            boolean r18 = r7.contains(r10)
            boolean r7 = r7.contains(r10)
            if (r7 != 0) goto Ld9
            boolean r7 = r5.contains(r10)
            if (r7 == 0) goto Ld9
            r19 = r20
        Ld6:
            r10 = r14
            r14 = r8
            goto Ldc
        Ld9:
            r19 = r9
            goto Ld6
        Ldc:
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r3.add(r10)
            r4.add(r6)
            goto L5e
        Le7:
            r20 = r7
            boolean r0 = p000.ui1.m5867()
            java.lang.String r6 = "r14983b95b84acb5"
            if (r0 != 0) goto Lf3
            goto L1d0
        Lf3:
            java.util.Set r0 = p000.m52.f6948
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = p000.AbstractC0984xh.m6670(r0)
            java.util.Iterator r7 = r3.iterator()
            r10 = r9
        L100:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L159
            java.lang.Object r11 = r7.next()
            j52 r11 = (p000.j52) r11
            java.lang.String r12 = r11.f5324
            java.util.Locale r13 = java.util.Locale.ROOT
            java.lang.String r12 = r12.toLowerCase(r13)
            r12.getClass()
            java.util.Set r13 = p000.m52.f6947
            boolean r13 = r13.contains(r12)
            if (r13 != 0) goto L100
            boolean r13 = r0.isEmpty()
            if (r13 == 0) goto L126
            goto L146
        L126:
            java.util.Iterator r13 = r0.iterator()
        L12a:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L146
            java.lang.Object r14 = r13.next()
            java.lang.String r14 = (java.lang.String) r14
            java.util.Locale r15 = java.util.Locale.ROOT
            java.lang.String r14 = r14.toLowerCase(r15)
            r14.getClass()
            boolean r14 = r14.equals(r12)
            if (r14 == 0) goto L12a
            goto L100
        L146:
            java.lang.String r10 = r11.f5324
            r0.add(r10)
            java.lang.String r10 = r11.f5324
            java.lang.String r11 = "发现新Tab: "
            java.lang.String r10 = r11.concat(r10)
            p000.C0888ux.m5975(r6, r10)
            r10 = r20
            goto L100
        L159:
            if (r10 == 0) goto L1d0
            java.util.List r7 = p000.AbstractC0984xh.m6666(r0)     // Catch: java.lang.Throwable -> L19e
            java.util.List r7 = p000.AbstractC0984xh.m6657(r7)     // Catch: java.lang.Throwable -> L19e
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L19e
            r10.<init>(r7)     // Catch: java.lang.Throwable -> L19e
            java.lang.Object r11 = p000.ui1.f10844     // Catch: java.lang.Throwable -> L19e
            java.lang.String r11 = "toptab_discovered_tabs"
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L19e
            r10.getClass()     // Catch: java.lang.Throwable -> L19e
            p000.ui1.m5875(r11, r10)     // Catch: java.lang.Throwable -> L19e
            p000.m52.f6948 = r0     // Catch: java.lang.Throwable -> L19e
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L19e
            int r2 = p000.AbstractC1021yh.m6889(r0, r2)     // Catch: java.lang.Throwable -> L19e
            r10.<init>(r2)     // Catch: java.lang.Throwable -> L19e
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L19e
        L185:
            boolean r11 = r2.hasNext()     // Catch: java.lang.Throwable -> L19e
            if (r11 == 0) goto L1a0
            java.lang.Object r11 = r2.next()     // Catch: java.lang.Throwable -> L19e
            java.lang.String r11 = (java.lang.String) r11     // Catch: java.lang.Throwable -> L19e
            java.util.Locale r12 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L19e
            java.lang.String r11 = r11.toLowerCase(r12)     // Catch: java.lang.Throwable -> L19e
            r11.getClass()     // Catch: java.lang.Throwable -> L19e
            r10.add(r11)     // Catch: java.lang.Throwable -> L19e
            goto L185
        L19e:
            r0 = move-exception
            goto L1c7
        L1a0:
            java.util.Set r2 = p000.AbstractC0984xh.m6671(r10)     // Catch: java.lang.Throwable -> L19e
            p000.m52.f6949 = r2     // Catch: java.lang.Throwable -> L19e
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L19e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19e
            r2.<init>()     // Catch: java.lang.Throwable -> L19e
            java.lang.String r10 = "保存账号顶栏Tab("
            r2.append(r10)     // Catch: java.lang.Throwable -> L19e
            r2.append(r0)     // Catch: java.lang.Throwable -> L19e
            java.lang.String r0 = "个): "
            r2.append(r0)     // Catch: java.lang.Throwable -> L19e
            r2.append(r7)     // Catch: java.lang.Throwable -> L19e
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L19e
            p000.C0888ux.m5975(r6, r0)     // Catch: java.lang.Throwable -> L19e
            goto L1d0
        L1c7:
            java.lang.String r2 = r0.getMessage()
            java.lang.String r7 = "保存已发现Tab失败: "
            p000.AbstractC0602nx.m4145(r7, r2, r6, r0)
        L1d0:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L1d7
            goto L207
        L1d7:
            qy1 r0 = new qy1
            r2 = 6
            r0.<init>(r2)
            java.util.List r10 = p000.AbstractC0984xh.m6658(r3, r0)
            by1 r15 = new by1
            r0 = 15
            r15.<init>(r0)
            r16 = 30
            java.lang.String r11 = " | "
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r2 = p000.m52.f6951
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L1fc
            goto L207
        L1fc:
            java.lang.String r2 = "顶栏 Tab 检测: "
            java.lang.String r2 = r2.concat(r0)
            p000.C0888ux.m5975(r6, r2)
            p000.m52.f6951 = r0
        L207:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r2 = r1.iterator()
        L215:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L27c
            java.lang.Object r3 = r2.next()
            boolean r7 = r3 instanceof android.view.View
            if (r7 == 0) goto L226
            android.view.View r3 = (android.view.View) r3
            goto L227
        L226:
            r3 = r8
        L227:
            if (r3 != 0) goto L22a
            goto L215
        L22a:
            android.widget.TextView r3 = m3737(r3)
            if (r3 == 0) goto L245
            java.lang.CharSequence r3 = r3.getText()
            if (r3 == 0) goto L245
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L245
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            goto L246
        L245:
            r3 = r8
        L246:
            if (r3 == 0) goto L215
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L253
            goto L215
        L253:
            boolean r7 = m3746(r3)
            if (r7 == 0) goto L215
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r7)
            r3.getClass()
            java.util.Set r7 = p000.m52.f6947
            boolean r7 = r7.contains(r3)
            if (r7 != 0) goto L272
            java.util.Set r7 = p000.m52.f6949
            boolean r7 = r7.contains(r3)
            if (r7 == 0) goto L215
        L272:
            boolean r7 = r0.add(r3)
            if (r7 == 0) goto L215
            r10.add(r3)
            goto L215
        L27c:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L283
            goto L2a5
        L283:
            java.lang.Object r0 = p000.m52.f6952
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L2a2
            p000.m52.f6952 = r10
            r15 = 0
            r16 = 62
            java.lang.String r11 = ", "
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r2 = "顶栏宿主页序: "
            java.lang.String r0 = r2.concat(r0)
            p000.C0888ux.m5975(r6, r0)
        L2a2:
            m3748()
        L2a5:
            java.util.Iterator r0 = r1.iterator()
        L2a9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L378
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            android.widget.TextView r2 = m3737(r1)
            if (r2 == 0) goto L2d0
            java.lang.CharSequence r2 = r2.getText()
            if (r2 == 0) goto L2d0
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L2d0
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            goto L2d1
        L2d0:
            r2 = r8
        L2d1:
            if (r2 == 0) goto L2a9
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L2a9
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r3)
            r2.getClass()
            java.util.Set r3 = p000.m52.f6947
            boolean r3 = r3.contains(r2)
            r6 = 2131610114(0x7f0dca02, float:1.8847003E38)
            r7 = 2131610113(0x7f0dca01, float:1.8847001E38)
            if (r3 != 0) goto L330
            boolean r2 = r5.contains(r2)
            if (r2 == 0) goto L330
            android.view.View r2 = m3736(r1)
            if (r2 != 0) goto L301
            goto L302
        L301:
            r1 = r2
        L302:
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 != r3) goto L30b
            goto L2a9
        L30b:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.setTag(r7, r2)
            r1.setVisibility(r3)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            if (r2 != 0) goto L31a
            goto L2a9
        L31a:
            java.lang.Object r3 = r1.getTag(r6)
            if (r3 != 0) goto L329
            int r3 = r2.width
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.setTag(r6, r3)
        L329:
            r2.width = r9
            r1.setLayoutParams(r2)
            goto L2a9
        L330:
            android.view.View r2 = m3736(r1)
            if (r2 != 0) goto L337
            goto L338
        L337:
            r1 = r2
        L338:
            int r2 = r1.getVisibility()
            if (r2 != 0) goto L34c
            java.lang.Object r2 = r1.getTag(r7)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L34c
            goto L2a9
        L34c:
            r1.setTag(r7, r8)
            r1.setVisibility(r9)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            if (r2 != 0) goto L35a
            goto L2a9
        L35a:
            java.lang.Object r3 = r1.getTag(r6)
            boolean r7 = r3 instanceof java.lang.Integer
            if (r7 == 0) goto L365
            java.lang.Integer r3 = (java.lang.Integer) r3
            goto L366
        L365:
            r3 = r8
        L366:
            r1.setTag(r6, r8)
            if (r3 == 0) goto L370
            int r3 = r3.intValue()
            goto L371
        L370:
            r3 = -2
        L371:
            r2.width = r3
            r1.setLayoutParams(r2)
            goto L2a9
        L378:
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L380
            goto L46b
        L380:
            java.lang.String r0 = "toptab_center_align"
            boolean r0 = p000.ui1.m5887(r0, r9)
            if (r0 != 0) goto L38a
            goto L46b
        L38a:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L392
            goto L46b
        L392:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L39b
        L398:
            r0 = r8
            goto L410
        L39b:
            java.lang.Object r0 = r4.get(r9)
            android.view.View r0 = (android.view.View) r0
            int r1 = r4.size()
            r2 = r20
        L3a7:
            if (r2 >= r1) goto L410
            java.lang.Object r3 = r4.get(r2)
            android.view.View r3 = (android.view.View) r3
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L3b4:
            if (r0 == 0) goto L3c6
            r5.add(r0)
            android.view.ViewParent r0 = r0.getParent()
            boolean r6 = r0 instanceof android.view.View
            if (r6 == 0) goto L3c4
            android.view.View r0 = (android.view.View) r0
            goto L3b4
        L3c4:
            r0 = r8
            goto L3b4
        L3c6:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L3cb:
            if (r3 == 0) goto L3dd
            r0.add(r3)
            android.view.ViewParent r3 = r3.getParent()
            boolean r6 = r3 instanceof android.view.View
            if (r6 == 0) goto L3db
            android.view.View r3 = (android.view.View) r3
            goto L3cb
        L3db:
            r3 = r8
            goto L3cb
        L3dd:
            int r3 = r5.size()
            int r3 = r3 + (-1)
            int r6 = r0.size()
            int r6 = r6 + (-1)
            r7 = r6
            r6 = r3
            r3 = r8
        L3ec:
            if (r6 < 0) goto L409
            if (r7 < 0) goto L409
            java.lang.Object r10 = r5.get(r6)
            java.lang.Object r11 = r0.get(r7)
            boolean r10 = p000.ln0.m3626(r10, r11)
            if (r10 == 0) goto L409
            java.lang.Object r3 = r5.get(r6)
            android.view.View r3 = (android.view.View) r3
            int r6 = r6 + (-1)
            int r7 = r7 + (-1)
            goto L3ec
        L409:
            if (r3 != 0) goto L40c
            goto L398
        L40c:
            int r2 = r2 + 1
            r0 = r3
            goto L3a7
        L410:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L417
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L418
        L417:
            r0 = r8
        L418:
            if (r0 != 0) goto L41b
            goto L46b
        L41b:
            um1 r1 = new um1
            r1.<init>()
            r1.f10912 = r0
        L422:
            if (r0 == 0) goto L45f
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = p000.m52.f6943
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L45f
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.String r3 = "ScrollView"
            r4 = r20
            boolean r3 = p000.q02.m4654(r2, r3, r4)
            if (r3 != 0) goto L44e
            java.lang.String r3 = "MainTab"
            boolean r2 = p000.q02.m4654(r2, r3, r4)
            if (r2 == 0) goto L450
        L44e:
            r1.f10912 = r0
        L450:
            android.view.ViewParent r0 = r0.getParent()
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L45b
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L45c
        L45b:
            r0 = r8
        L45c:
            r20 = r4
            goto L422
        L45f:
            java.lang.Object r0 = r1.f10912
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            i52 r2 = new i52
            r2.<init>(r1, r9)
            r0.post(r2)
        L46b:
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m3732(android.view.View r3, java.util.LinkedHashSet r4) {
            boolean r0 = r3 instanceof android.widget.TextView
            if (r0 == 0) goto L37
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.CharSequence r3 = r3.getText()
            if (r3 == 0) goto L51
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L51
            java.lang.CharSequence r3 = p000.q02.m4660(r3)
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L51
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r0)
            r3.getClass()
            int r0 = r3.length()
            if (r0 <= 0) goto L51
            java.util.Set r0 = p000.m52.f6949
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L51
            r4.add(r3)
            return
        L37:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L51
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r1 = 0
        L42:
            if (r1 >= r0) goto L51
            android.view.View r2 = r3.getChildAt(r1)
            if (r2 != 0) goto L4b
            goto L4e
        L4b:
            m3732(r2, r4)
        L4e:
            int r1 = r1 + 1
            goto L42
        L51:
            return
    }

    /* JADX INFO: renamed from: γ */
    public static boolean m3733(android.view.View r4) {
            boolean r0 = r4 instanceof android.widget.TextView
            r1 = 0
            if (r0 == 0) goto L2d
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.CharSequence r4 = r4.getText()
            if (r4 == 0) goto L4c
            java.lang.String r4 = r4.toString()
            if (r4 == 0) goto L4c
            java.lang.CharSequence r4 = p000.q02.m4660(r4)
            java.lang.String r4 = r4.toString()
            if (r4 == 0) goto L4c
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r0)
            r4.getClass()
            java.util.Set r0 = p000.m52.f6949
            boolean r4 = r0.contains(r4)
            return r4
        L2d:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L4c
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r2 = r1
        L38:
            if (r2 >= r0) goto L4c
            android.view.View r3 = r4.getChildAt(r2)
            if (r3 != 0) goto L41
            goto L49
        L41:
            boolean r3 = m3733(r3)
            if (r3 == 0) goto L49
            r4 = 1
            return r4
        L49:
            int r2 = r2 + 1
            goto L38
        L4c:
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public static void m3734() {
            boolean r0 = p000.ui1.m5867()
            if (r0 != 0) goto L7
            goto Lf
        L7:
            long r0 = p000.ui1.f10851
            long r2 = p000.m52.f6950
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L10
        Lf:
            return
        L10:
            java.lang.String r2 = "r14983b95b84acb5"
            java.lang.String r3 = "toptab_discovered_tabs"
            java.lang.String r4 = "[]"
            java.lang.String r3 = p000.ui1.m5893(r3, r4)     // Catch: java.lang.Throwable -> L44
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L44
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L44
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L44
            r3.<init>()     // Catch: java.lang.Throwable -> L44
            int r5 = r4.length()     // Catch: java.lang.Throwable -> L44
            r6 = 0
        L29:
            if (r6 >= r5) goto L49
            java.lang.String r7 = r4.getString(r6)     // Catch: java.lang.Throwable -> L44
            r7.getClass()     // Catch: java.lang.Throwable -> L44
            java.lang.CharSequence r7 = p000.q02.m4660(r7)     // Catch: java.lang.Throwable -> L44
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L44
            int r8 = r7.length()     // Catch: java.lang.Throwable -> L44
            if (r8 <= 0) goto L46
            r3.add(r7)     // Catch: java.lang.Throwable -> L44
            goto L46
        L44:
            r3 = move-exception
            goto L9a
        L46:
            int r6 = r6 + 1
            goto L29
        L49:
            p000.m52.f6948 = r3     // Catch: java.lang.Throwable -> L44
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L44
            r5 = 10
            int r5 = p000.AbstractC1021yh.m6889(r3, r5)     // Catch: java.lang.Throwable -> L44
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L44
            java.util.Iterator r5 = r3.iterator()     // Catch: java.lang.Throwable -> L44
        L5a:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L73
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L44
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L44
            java.util.Locale r7 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L44
            java.lang.String r6 = r6.toLowerCase(r7)     // Catch: java.lang.Throwable -> L44
            r6.getClass()     // Catch: java.lang.Throwable -> L44
            r4.add(r6)     // Catch: java.lang.Throwable -> L44
            goto L5a
        L73:
            java.util.Set r4 = p000.AbstractC0984xh.m6671(r4)     // Catch: java.lang.Throwable -> L44
            p000.m52.f6949 = r4     // Catch: java.lang.Throwable -> L44
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r5.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.String r6 = "加载账号顶栏Tab("
            r5.append(r6)     // Catch: java.lang.Throwable -> L44
            r5.append(r4)     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = "个): "
            r5.append(r4)     // Catch: java.lang.Throwable -> L44
            r5.append(r3)     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L44
            p000.C0888ux.m5975(r2, r3)     // Catch: java.lang.Throwable -> L44
            goto La3
        L9a:
            java.lang.String r4 = r3.getMessage()
            java.lang.String r5 = "加载已发现Tab失败: "
            p000.AbstractC0602nx.m4145(r5, r4, r2, r3)
        La3:
            p000.m52.f6950 = r0
            return
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.reflect.Method m3735(java.lang.Class r12) {
        L0:
            r0 = 0
            if (r12 == 0) goto La0
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r12.equals(r1)
            if (r1 != 0) goto La0
            java.lang.reflect.Method[] r1 = r12.getDeclaredMethods()
            r1.getClass()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L15:
            java.lang.Class r5 = java.lang.Integer.TYPE
            java.lang.Class r6 = java.lang.Void.TYPE
            java.lang.String r7 = "setCurrentItem"
            r8 = 1
            if (r4 >= r2) goto L5a
            r9 = r1[r4]
            java.lang.String r10 = r9.getName()
            boolean r10 = p000.ln0.m3626(r10, r7)
            if (r10 == 0) goto L57
            java.lang.Class r10 = r9.getReturnType()
            boolean r10 = p000.ln0.m3626(r10, r6)
            if (r10 == 0) goto L57
            java.lang.Class[] r10 = r9.getParameterTypes()
            int r10 = r10.length
            r11 = 2
            if (r10 != r11) goto L57
            java.lang.Class[] r10 = r9.getParameterTypes()
            r10 = r10[r3]
            boolean r10 = p000.ln0.m3626(r10, r5)
            if (r10 == 0) goto L57
            java.lang.Class[] r10 = r9.getParameterTypes()
            r10 = r10[r8]
            java.lang.Class r11 = java.lang.Boolean.TYPE
            boolean r10 = p000.ln0.m3626(r10, r11)
            if (r10 == 0) goto L57
            goto L5b
        L57:
            int r4 = r4 + 1
            goto L15
        L5a:
            r9 = r0
        L5b:
            if (r9 == 0) goto L5e
            return r9
        L5e:
            java.lang.reflect.Method[] r1 = r12.getDeclaredMethods()
            r1.getClass()
            int r2 = r1.length
            r4 = r3
        L67:
            if (r4 >= r2) goto L97
            r9 = r1[r4]
            java.lang.String r10 = r9.getName()
            boolean r10 = p000.ln0.m3626(r10, r7)
            if (r10 == 0) goto L94
            java.lang.Class r10 = r9.getReturnType()
            boolean r10 = p000.ln0.m3626(r10, r6)
            if (r10 == 0) goto L94
            java.lang.Class[] r10 = r9.getParameterTypes()
            int r10 = r10.length
            if (r10 != r8) goto L94
            java.lang.Class[] r10 = r9.getParameterTypes()
            r10 = r10[r3]
            boolean r10 = p000.ln0.m3626(r10, r5)
            if (r10 == 0) goto L94
            r0 = r9
            goto L97
        L94:
            int r4 = r4 + 1
            goto L67
        L97:
            if (r0 == 0) goto L9a
            return r0
        L9a:
            java.lang.Class r12 = r12.getSuperclass()
            goto L0
        La0:
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static android.view.View m3736(android.view.View r9) {
            android.view.ViewParent r0 = r9.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            r2 = 0
            if (r1 == 0) goto Lc
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 != 0) goto L10
            return r2
        L10:
            android.view.ViewParent r1 = r0.getParent()
            boolean r3 = r1 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L1c
        L1b:
            r1 = r2
        L1c:
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L43
            int r5 = r1.getChildCount()
            r6 = r3
            r7 = r6
        L26:
            if (r6 >= r5) goto L3a
            android.view.View r8 = r1.getChildAt(r6)
            if (r8 != 0) goto L2f
            goto L37
        L2f:
            boolean r8 = m3733(r8)
            if (r8 == 0) goto L37
            int r7 = r7 + 1
        L37:
            int r6 = r6 + 1
            goto L26
        L3a:
            if (r7 < r4) goto L43
            boolean r5 = m3744(r9, r0)
            if (r5 == 0) goto L43
            goto L7a
        L43:
            if (r1 == 0) goto L74
            android.view.ViewParent r5 = r1.getParent()
            boolean r6 = r5 instanceof android.view.ViewGroup
            if (r6 == 0) goto L50
            r2 = r5
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L50:
            if (r2 == 0) goto L74
            int r5 = r2.getChildCount()
            r6 = r3
        L57:
            if (r3 >= r5) goto L6b
            android.view.View r7 = r2.getChildAt(r3)
            if (r7 != 0) goto L60
            goto L68
        L60:
            boolean r7 = m3733(r7)
            if (r7 == 0) goto L68
            int r6 = r6 + 1
        L68:
            int r3 = r3 + 1
            goto L57
        L6b:
            if (r6 < r4) goto L74
            boolean r2 = m3744(r9, r1)
            if (r2 == 0) goto L74
            return r1
        L74:
            boolean r1 = m3744(r9, r0)
            if (r1 == 0) goto L7b
        L7a:
            return r0
        L7b:
            return r9
    }

    /* JADX INFO: renamed from: η */
    public static android.widget.TextView m3737(android.view.View r4) {
            boolean r0 = r4 instanceof android.widget.TextView
            r1 = 0
            if (r0 == 0) goto L29
            r0 = r4
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r2 = r0.getText()
            if (r2 == 0) goto L1d
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L1d
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            goto L1e
        L1d:
            r2 = r1
        L1e:
            if (r2 != 0) goto L22
            java.lang.String r2 = ""
        L22:
            boolean r2 = m3746(r2)
            if (r2 == 0) goto L29
            return r0
        L29:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L47
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r2 = 0
        L34:
            if (r2 >= r0) goto L47
            android.view.View r3 = r4.getChildAt(r2)
            if (r3 != 0) goto L3d
            goto L44
        L3d:
            android.widget.TextView r3 = m3737(r3)
            if (r3 == 0) goto L44
            return r3
        L44:
            int r2 = r2 + 1
            goto L34
        L47:
            return r1
    }

    /* JADX INFO: renamed from: θ */
    public static java.lang.Object m3738(android.view.View r3) {
            boolean r0 = m3743(r3)
            if (r0 == 0) goto L21
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            p000.m52.f6956 = r0
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "从视图树捕获顶栏 ViewPager: "
            java.lang.String r0 = r1.concat(r0)
            java.lang.String r1 = "r14983b95b84acb5"
            p000.C0888ux.m5975(r1, r0)
            return r3
        L21:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L3f
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r1 = 0
        L2c:
            if (r1 >= r0) goto L3f
            android.view.View r2 = r3.getChildAt(r1)
            if (r2 != 0) goto L35
            goto L3c
        L35:
            java.lang.Object r2 = m3738(r2)
            if (r2 == 0) goto L3c
            return r2
        L3c:
            int r1 = r1 + 1
            goto L2c
        L3f:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ι */
    public static java.util.Set m3739() {
            nz r0 = p000.C0604nz.f7825
            boolean r1 = p000.ui1.m5867()
            if (r1 != 0) goto L9
            goto Lf
        L9:
            boolean r1 = p000.AbstractC0976x9.m6531()
            if (r1 != 0) goto L10
        Lf:
            return r0
        L10:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Set r1 = p000.m52.f6948
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r3 = r2.toLowerCase(r3)
            r3.getClass()
            java.util.Set r4 = p000.m52.f6947
            boolean r4 = r4.contains(r3)
            if (r4 != 0) goto L1d
            java.lang.String r4 = "toptab_hide_"
            java.lang.String r2 = r4.concat(r2)
            r4 = 0
            boolean r2 = p000.ui1.m5887(r2, r4)
            if (r2 == 0) goto L1d
            r0.add(r3)
            goto L1d
        L4b:
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public static int m3740(java.lang.Object r3) {
            r0 = 0
            java.lang.String r1 = "getAdapter"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r3 = p000.qe0.m4869(r3, r1, r2)     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto Lc
            return r0
        Lc:
            java.lang.String r1 = "getCount"
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r3 = p000.qe0.m4869(r3, r1, r2)     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r3 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1d
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            r3 = move-exception
            goto L2b
        L1d:
            r3 = 0
        L1e:
            if (r3 == 0) goto L25
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L1b
            goto L26
        L25:
            r3 = r0
        L26:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1b
            goto L31
        L2b:
            eo1 r1 = new eo1
            r1.<init>(r3)
            r3 = r1
        L31:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r1 = r3 instanceof p000.eo1
            if (r1 == 0) goto L3a
            r3 = r0
        L3a:
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            return r3
    }

    /* JADX INFO: renamed from: λ */
    public static int m3741(java.lang.Object r3) {
            r0 = -1
            java.lang.String r1 = "getCurrentItem"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L11
            java.lang.Object r3 = p000.qe0.m4869(r3, r1, r2)     // Catch: java.lang.Throwable -> L11
            boolean r1 = r3 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L13
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r3 = move-exception
            goto L21
        L13:
            r3 = 0
        L14:
            if (r3 == 0) goto L1b
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L11
            goto L1c
        L1b:
            r3 = r0
        L1c:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L11
            goto L27
        L21:
            eo1 r1 = new eo1
            r1.<init>(r3)
            r3 = r1
        L27:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r1 = r3 instanceof p000.eo1
            if (r1 == 0) goto L30
            r3 = r0
        L30:
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            return r3
    }

    /* JADX INFO: renamed from: μ */
    public static void m3742(java.lang.Class r15) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.lang.reflect.Method[] r1 = r15.getDeclaredMethods()
            r1.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r1.length
            r4 = 0
            r5 = r4
        L14:
            r6 = 2
            java.lang.Class r7 = java.lang.Float.TYPE
            java.lang.Class r8 = java.lang.Integer.TYPE
            r9 = 3
            java.lang.Class r10 = java.lang.Void.TYPE
            r11 = 1
            if (r5 >= r3) goto L68
            r12 = r1[r5]
            java.lang.String r13 = r12.getName()
            java.lang.String r14 = "onPageScrolled"
            boolean r13 = p000.ln0.m3626(r13, r14)
            if (r13 == 0) goto L65
            java.lang.Class r13 = r12.getReturnType()
            boolean r10 = p000.ln0.m3626(r13, r10)
            if (r10 == 0) goto L65
            java.lang.Class[] r10 = r12.getParameterTypes()
            int r10 = r10.length
            if (r10 != r9) goto L65
            java.lang.Class[] r9 = r12.getParameterTypes()
            r9 = r9[r4]
            boolean r9 = p000.ln0.m3626(r9, r8)
            if (r9 == 0) goto L65
            java.lang.Class[] r9 = r12.getParameterTypes()
            r9 = r9[r11]
            boolean r7 = p000.ln0.m3626(r9, r7)
            if (r7 == 0) goto L65
            java.lang.Class[] r7 = r12.getParameterTypes()
            r6 = r7[r6]
            boolean r6 = p000.ln0.m3626(r6, r8)
            if (r6 == 0) goto L65
            r2.add(r12)
        L65:
            int r5 = r5 + 1
            goto L14
        L68:
            java.util.Iterator r1 = r2.iterator()
        L6c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L96
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r2.getClass()
            java.lang.String r3 = m3747(r2)
            boolean r3 = r0.add(r3)
            if (r3 != 0) goto L86
            goto L6c
        L86:
            r2.setAccessible(r11)
            xq0 r3 = p000.xq0.f12253
            py1 r5 = new py1
            r12 = 10
            r5.<init>(r12)
            r3.m6775(r2, r5)
            goto L6c
        L96:
            java.lang.reflect.Method[] r15 = r15.getDeclaredMethods()
            r15.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r15.length
            r3 = r4
        La4:
            if (r3 >= r2) goto Lf0
            r5 = r15[r3]
            java.lang.Class r12 = r5.getReturnType()
            boolean r12 = p000.ln0.m3626(r12, r10)
            if (r12 == 0) goto Led
            java.lang.Class[] r12 = r5.getParameterTypes()
            int r12 = r12.length
            r13 = 4
            if (r12 != r13) goto Led
            java.lang.Class[] r12 = r5.getParameterTypes()
            r12 = r12[r4]
            boolean r12 = p000.ln0.m3626(r12, r7)
            if (r12 == 0) goto Led
            java.lang.Class[] r12 = r5.getParameterTypes()
            r12 = r12[r11]
            boolean r12 = p000.ln0.m3626(r12, r8)
            if (r12 == 0) goto Led
            java.lang.Class[] r12 = r5.getParameterTypes()
            r12 = r12[r6]
            boolean r12 = p000.ln0.m3626(r12, r8)
            if (r12 == 0) goto Led
            java.lang.Class[] r12 = r5.getParameterTypes()
            r12 = r12[r9]
            boolean r12 = p000.ln0.m3626(r12, r8)
            if (r12 == 0) goto Led
            r1.add(r5)
        Led:
            int r3 = r3 + 1
            goto La4
        Lf0:
            java.util.Iterator r15 = r1.iterator()
        Lf4:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L11e
            java.lang.Object r1 = r15.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.getClass()
            java.lang.String r2 = m3747(r1)
            boolean r2 = r0.add(r2)
            if (r2 != 0) goto L10e
            goto Lf4
        L10e:
            r1.setAccessible(r11)
            xq0 r2 = p000.xq0.f12253
            py1 r3 = new py1
            r4 = 10
            r3.<init>(r4)
            r2.m6775(r1, r3)
            goto Lf4
        L11e:
            int r15 = r0.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Hook 顶栏滑动方向成功 methods="
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            java.lang.String r0 = "r14983b95b84acb5"
            p000.C0888ux.m5975(r0, r15)
            return
    }

    /* JADX INFO: renamed from: ν */
    public static boolean m3743(java.lang.Object r3) {
            if (r3 != 0) goto L3
            goto L37
        L3:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "ViewPager"
            r2 = 1
            boolean r0 = p000.q02.m4654(r0, r1, r2)
            if (r0 != 0) goto L15
            goto L37
        L15:
            int r0 = m3740(r3)
            if (r0 <= 0) goto L2c
            java.lang.Object r1 = p000.m52.f6952
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L2c
            java.lang.Object r1 = p000.m52.f6952
            int r1 = r1.size()
            if (r0 >= r1) goto L2c
            goto L37
        L2c:
            java.lang.Class r3 = r3.getClass()
            java.lang.reflect.Method r3 = m3735(r3)
            if (r3 == 0) goto L37
            return r2
        L37:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ξ */
    public static boolean m3744(android.view.View r2, android.view.ViewGroup r3) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            m3732(r3, r0)
            boolean r3 = r0.isEmpty()
            r1 = 1
            if (r3 == 0) goto L10
            goto L45
        L10:
            boolean r3 = r2 instanceof android.widget.TextView
            if (r3 == 0) goto L17
            android.widget.TextView r2 = (android.widget.TextView) r2
            goto L18
        L17:
            r2 = 0
        L18:
            if (r2 == 0) goto L46
            java.lang.CharSequence r2 = r2.getText()
            if (r2 == 0) goto L46
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L46
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L46
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r3)
            r2.getClass()
            int r3 = r0.size()
            if (r3 != r1) goto L46
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L46
        L45:
            return r1
        L46:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ο */
    public static boolean m3745() {
            boolean r0 = p000.ui1.m5867()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "toptab_skip_hidden_page_enabled"
            boolean r0 = p000.ui1.m5887(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: π */
    public static boolean m3746(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 0
            if (r0 != 0) goto L8
            goto L31
        L8:
            int r0 = r4.length()
            r2 = 8
            if (r0 <= r2) goto L11
            goto L31
        L11:
            r0 = r1
        L12:
            int r2 = r4.length()
            if (r0 >= r2) goto L31
            char r2 = r4.charAt(r0)
            r3 = 19968(0x4e00, float:2.7981E-41)
            if (r3 > r2) goto L26
            r3 = 40960(0xa000, float:5.7397E-41)
            if (r2 >= r3) goto L26
            goto L2c
        L26:
            boolean r2 = java.lang.Character.isLetter(r2)
            if (r2 == 0) goto L2e
        L2c:
            r4 = 1
            return r4
        L2e:
            int r0 = r0 + 1
            goto L12
        L31:
            return r1
    }

    /* JADX INFO: renamed from: ρ */
    public static java.lang.String m3747(java.lang.reflect.Method r6) {
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
            by1 r2 = new by1
            r3 = 13
            r2.<init>(r3)
            r3 = 30
            java.lang.String r4 = ","
            r5 = 0
            java.lang.String r1 = p000.AbstractC0312g7.m2256(r1, r4, r5, r2, r3)
            java.lang.String r2 = "):"
            java.lang.String r6 = p000.lz1.m3692(r0, r1, r2, r6)
            return r6
    }

    /* JADX INFO: renamed from: σ */
    public static void m3748() {
            java.lang.Object r0 = p000.m52.f6952
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L9
            goto L77
        L9:
            java.util.Set r1 = m3739()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
        L17:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L3d
            java.lang.Object r4 = r0.next()
            int r5 = r3 + 1
            r6 = 0
            if (r3 < 0) goto L39
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L32
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
        L32:
            if (r6 == 0) goto L37
            r2.add(r6)
        L37:
            r3 = r5
            goto L17
        L39:
            p000.AbstractC1021yh.m6917()
            throw r6
        L3d:
            java.util.Set r0 = p000.AbstractC0984xh.m6671(r2)
            p000.m52.f6953 = r0
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r1 = p000.AbstractC0984xh.m6657(r0)
            r6 = 0
            r7 = 62
            java.lang.String r2 = ","
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.String r0 = p000.AbstractC0984xh.m6644(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r1 = p000.m52.f6955
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L77
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "顶栏隐藏页索引: ["
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "r14983b95b84acb5"
            p000.C0888ux.m5975(r2, r1)
            p000.m52.f6955 = r0
        L77:
            return
    }

    /* JADX INFO: renamed from: τ */
    public static java.lang.Object m3749(java.lang.Object r10) {
            java.lang.ref.WeakReference r0 = p000.m52.f6956
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto Lb
            return r0
        Lb:
            r0 = 0
            if (r10 == 0) goto L6c
            java.lang.Class r1 = r10.getClass()
        L12:
            if (r1 == 0) goto L68
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L68
            java.lang.reflect.Field[] r2 = r1.getDeclaredFields()
            r2.getClass()
            int r3 = r2.length
            r4 = 0
        L25:
            if (r4 >= r3) goto L63
            r5 = r2[r4]
            r6 = 1
            r5.setAccessible(r6)     // Catch: java.lang.Throwable -> L60
            java.lang.Object r5 = r5.get(r10)     // Catch: java.lang.Throwable -> L60
            if (r5 != 0) goto L34
            goto L60
        L34:
            boolean r6 = m3743(r5)     // Catch: java.lang.Throwable -> L60
            if (r6 == 0) goto L60
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L60
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L60
            p000.m52.f6956 = r6     // Catch: java.lang.Throwable -> L60
            java.lang.String r6 = "r14983b95b84acb5"
            java.lang.Class r7 = r5.getClass()     // Catch: java.lang.Throwable -> L60
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r8.<init>()     // Catch: java.lang.Throwable -> L60
            java.lang.String r9 = "从字段捕获顶栏 ViewPager: "
            r8.append(r9)     // Catch: java.lang.Throwable -> L60
            r8.append(r7)     // Catch: java.lang.Throwable -> L60
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L60
            p000.C0888ux.m5975(r6, r7)     // Catch: java.lang.Throwable -> L60
            goto L69
        L60:
            int r4 = r4 + 1
            goto L25
        L63:
            java.lang.Class r1 = r1.getSuperclass()
            goto L12
        L68:
            r5 = r0
        L69:
            if (r5 == 0) goto L6c
            return r5
        L6c:
            java.lang.Object r10 = p000.m52.f6957
            f7 r10 = p000.AbstractC0984xh.m6661(r10)
            by1 r1 = new by1
            r2 = 14
            r1.<init>(r2)
            y30 r10 = p000.us1.m5943(r10, r1)
            java.lang.Object r10 = p000.us1.m5953(r10)
            android.view.View r10 = (android.view.View) r10
            if (r10 != 0) goto L86
            goto L8a
        L86:
            java.lang.Object r0 = m3738(r10)
        L8a:
            return r0
    }

    /* JADX INFO: renamed from: υ */
    public static void m3750(int r3, java.lang.Object r4) {
            java.lang.Class r0 = r4.getClass()
            java.lang.reflect.Method r0 = m3735(r0)
            if (r0 == 0) goto L30
            r1 = 1
            r0.setAccessible(r1)
            java.lang.Class[] r1 = r0.getParameterTypes()
            int r1 = r1.length
            r2 = 2
            if (r1 != r2) goto L24
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r1}
            r0.invoke(r4, r3)
            return
        L24:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r0.invoke(r4, r3)
            return
        L30:
            java.lang.Class r3 = r4.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "#setCurrentItem"
            java.lang.String r3 = r3.concat(r4)
            p000.ql1.m4936(r3)
            return
    }
}
