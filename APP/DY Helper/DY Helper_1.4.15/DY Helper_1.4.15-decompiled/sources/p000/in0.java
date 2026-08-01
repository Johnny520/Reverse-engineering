package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class in0 {

    /* JADX INFO: renamed from: α */
    public static final android.os.Handler f5135 = null;

    /* JADX INFO: renamed from: β */
    public static boolean f5136;

    /* JADX INFO: renamed from: γ */
    public static boolean f5137;

    /* JADX INFO: renamed from: δ */
    public static boolean f5138;

    /* JADX INFO: renamed from: ε */
    public static int f5139;

    /* JADX INFO: renamed from: ζ */
    public static long f5140;

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.in0.f5135 = r0
            r0 = 1
            p000.in0.f5136 = r0
            p000.in0.f5137 = r0
            r0 = 12
            p000.in0.f5139 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m2770() {
            java.lang.String r0 = "DYHelper: 配置已刷新 fab="
            android.app.Activity r1 = p000.AbstractC0378i.m2546()
            if (r1 != 0) goto L9
            goto L69
        L9:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = p000.in0.f5140
            long r4 = r2 - r4
            r6 = 2000(0x7d0, double:9.88E-321)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L18
            goto L69
        L18:
            p000.in0.f5140 = r2
            java.lang.String r2 = "share_panel_enabled"
            r3 = 1
            boolean r2 = m2772(r1, r2, r3)     // Catch: java.lang.Throwable -> L69
            p000.in0.f5136 = r2     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "volume_key_enabled"
            boolean r2 = m2772(r1, r2, r3)     // Catch: java.lang.Throwable -> L69
            p000.in0.f5137 = r2     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "fab_enabled"
            r3 = 0
            boolean r2 = m2772(r1, r2, r3)     // Catch: java.lang.Throwable -> L69
            p000.in0.f5138 = r2     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "fab_size"
            r3 = 12
            int r2 = m2773(r1, r2, r3)     // Catch: java.lang.Throwable -> L69
            p000.in0.f5139 = r2     // Catch: java.lang.Throwable -> L69
            java.lang.String r2 = "fab_alpha"
            r3 = 50
            int r1 = m2773(r1, r2, r3)     // Catch: java.lang.Throwable -> L69
            boolean r2 = p000.in0.f5138     // Catch: java.lang.Throwable -> L69
            int r3 = p000.in0.f5139     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L69
            r4.append(r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = ", size="
            r4.append(r0)     // Catch: java.lang.Throwable -> L69
            r4.append(r3)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = ", alpha="
            r4.append(r0)     // Catch: java.lang.Throwable -> L69
            r4.append(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L69
            p000.C0888ux.m5985(r0)     // Catch: java.lang.Throwable -> L69
        L69:
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m2771(android.app.Dialog r2, int r3) {
            r0 = 8
            if (r3 < r0) goto La
            java.lang.String r2 = "DYHelper:  轮询 8 次仍未找到容器，放弃"
            p000.C0888ux.m5985(r2)
            return
        La:
            boolean r0 = r2.isShowing()
            if (r0 != 0) goto L11
            return
        L11:
            en0 r0 = new en0
            r1 = 0
            r0.<init>(r3, r1, r2)
            r2 = 16
            android.os.Handler r1 = p000.in0.f5135
            r1.postDelayed(r0, r2)
            return
    }

    /* JADX INFO: renamed from: γ */
    public static boolean m2772(android.app.Activity r2, java.lang.String r3, boolean r4) {
            boolean r0 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L9
            p000.ui1.m5896(r2)     // Catch: java.lang.Throwable -> Le
        L9:
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> Le
            goto L19
        Le:
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = "dyhelper_prefs"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> L1e
        L19:
            boolean r2 = r2.getBoolean(r3, r4)     // Catch: java.lang.Throwable -> L1e
            return r2
        L1e:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DYHelper: 读取布尔配置失败 key="
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = ", err="
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            p000.C0888ux.m5985(r2)
            return r4
    }

    /* JADX INFO: renamed from: δ */
    public static int m2773(android.app.Activity r2, java.lang.String r3, int r4) {
            boolean r0 = p000.ui1.m5867()     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L9
            p000.ui1.m5896(r2)     // Catch: java.lang.Throwable -> Le
        L9:
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> Le
            goto L19
        Le:
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = "dyhelper_prefs"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)     // Catch: java.lang.Throwable -> L1e
        L19:
            int r2 = r2.getInt(r3, r4)     // Catch: java.lang.Throwable -> L1e
            return r2
        L1e:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DYHelper: 读取整型配置失败 key="
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = ", err="
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            p000.C0888ux.m5985(r2)
            return r4
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m2774(android.app.Dialog r20) {
            r0 = r20
            android.view.Window r1 = r0.getWindow()
            r2 = 0
            if (r1 == 0) goto Lf
            android.view.View r1 = r1.getDecorView()
            if (r1 != 0) goto L12
        Lf:
            r1 = r2
            goto L1e4
        L12:
            java.lang.String r3 = "t31"
            java.lang.String r4 = "egr"
            java.lang.String r5 = "function_container"
            java.lang.String[] r3 = new java.lang.String[]{r5, r3, r4}
            r4 = r2
        L1d:
            r6 = 3
            if (r4 >= r6) goto Lf
            r6 = r3[r4]
            r7 = 10
            android.content.res.Resources r9 = r1.getResources()     // Catch: java.lang.Throwable -> L3d
            java.lang.String r10 = "id"
            java.lang.String r11 = "~79F5E25B4ED201D89B6CE77FECC600ECA88AB6F7485F4A97"
            java.lang.String r11 = p000.jf0.m2957(r11)     // Catch: java.lang.Throwable -> L3d
            int r9 = r9.getIdentifier(r6, r10, r11)     // Catch: java.lang.Throwable -> L3d
            if (r9 == 0) goto L3d
            android.view.View r9 = r1.findViewById(r9)     // Catch: java.lang.Throwable -> L3d
            if (r9 == 0) goto L3d
            goto La6
        L3d:
            w6 r9 = new w6
            r9.<init>()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            l91 r11 = new l91
            r11.<init>(r1, r10)
            r9.addLast(r11)
        L4e:
            boolean r10 = r9.isEmpty()
            if (r10 != 0) goto La5
            java.lang.Object r10 = r9.removeFirst()
            l91 r10 = (p000.l91) r10
            java.lang.Object r11 = r10.f6502
            android.view.View r11 = (android.view.View) r11
            java.lang.Object r10 = r10.f6503
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 > r7) goto L4e
            int r12 = r11.getId()     // Catch: java.lang.Throwable -> L83
            r13 = -1
            if (r12 == r13) goto L83
            if (r12 == 0) goto L83
            android.content.res.Resources r13 = r11.getResources()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r12 = r13.getResourceEntryName(r12)     // Catch: java.lang.Throwable -> L7a
            goto L7b
        L7a:
            r12 = 0
        L7b:
            boolean r12 = p000.ln0.m3626(r12, r6)     // Catch: java.lang.Throwable -> L83
            if (r12 == 0) goto L83
            r9 = r11
            goto La6
        L83:
            boolean r12 = r11 instanceof android.view.ViewGroup
            if (r12 == 0) goto L4e
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            int r12 = r11.getChildCount()
            r13 = r2
        L8e:
            if (r13 >= r12) goto L4e
            android.view.View r14 = r11.getChildAt(r13)
            int r15 = r10 + 1
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            l91 r8 = new l91
            r8.<init>(r14, r15)
            r9.addLast(r8)
            int r13 = r13 + 1
            goto L8e
        La5:
            r9 = 0
        La6:
            boolean r8 = r9 instanceof android.view.ViewGroup
            if (r8 == 0) goto Lad
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            goto Lae
        Lad:
            r9 = 0
        Lae:
            if (r9 != 0) goto Lb4
            int r4 = r4 + 1
            goto L1d
        Lb4:
            java.lang.String r1 = "dyhelper_dl_btn"
            android.view.View r3 = r9.findViewWithTag(r1)
            if (r3 == 0) goto Lbf
            r9.removeView(r3)
        Lbf:
            android.content.Context r3 = r9.getContext()
            r3.getClass()
            android.app.Activity r4 = r0.getOwnerActivity()
            if (r4 != 0) goto Ld0
            android.app.Activity r4 = p000.AbstractC0378i.m2546()
        Ld0:
            if (r4 == 0) goto L187
            java.util.List r8 = p000.q71.f8901
            java.util.List r8 = p000.AbstractC0984xh.m6666(r8)
            int r10 = p000.AbstractC1021yh.m6889(r8, r7)
            int r10 = p000.ex0.m1970(r10)
            r11 = 16
            if (r10 >= r11) goto Le5
            r10 = r11
        Le5:
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>(r10)
            java.util.Iterator r8 = r8.iterator()
        Lee:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L101
            java.lang.Object r10 = r8.next()
            r12 = r10
            n71 r12 = (p000.n71) r12
            java.lang.String r12 = r12.f7446
            r11.put(r12, r10)
            goto Lee
        L101:
            q71 r8 = p000.q71.f8896
            boolean r8 = p000.q71.m4804()
            java.util.List r10 = p000.xv1.m6786()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r10 = r10.iterator()
        L114:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L13e
            java.lang.Object r13 = r10.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r11.get(r13)
            n71 r14 = (p000.n71) r14
            if (r14 != 0) goto L12f
            java.lang.String r14 = "DYHelper: 跳过已移除的分享面板动作 id="
        L12a:
            p000.AbstractC0602nx.m4142(r14, r13)
            r14 = 0
            goto L138
        L12f:
            boolean r15 = r14.m4010(r8)
            if (r15 != 0) goto L138
            java.lang.String r14 = "DYHelper: 跳过无内测资格的分享面板动作 id="
            goto L12a
        L138:
            if (r14 == 0) goto L114
            r12.add(r14)
            goto L114
        L13e:
            f9 r8 = new f9
            r10 = 4
            r8.<init>(r4, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = p000.AbstractC1021yh.m6889(r12, r7)
            r10.<init>(r11)
            java.util.Iterator r11 = r12.iterator()
        L151:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L185
            java.lang.Object r12 = r11.next()
            n71 r12 = (p000.n71) r12
            mv1 r13 = new mv1
            java.util.List r14 = p000.w71.f11592
            java.lang.String r14 = r12.f7446
            java.lang.String r14 = p000.w71.m6326(r14)
            java.lang.String r15 = r12.f7448
            int r2 = r12.f7450
            java.lang.String r7 = r12.f7451
            r16 = r2
            z61 r2 = new z61
            r17 = r7
            r7 = 7
            r2.<init>(r8, r7, r12)
            r18 = 1
            r19 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r10.add(r13)
            r2 = 0
            r7 = 10
            goto L151
        L185:
            r8 = r10
            goto L188
        L187:
            r8 = 0
        L188:
            if (r8 != 0) goto L18c
            jz r8 = p000.C0450jz.f5672
        L18c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r7 = 10
            int r7 = p000.AbstractC1021yh.m6889(r8, r7)
            r2.<init>(r7)
            java.util.Iterator r7 = r8.iterator()
        L19b:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L1c6
            java.lang.Object r8 = r7.next()
            mv1 r8 = (p000.mv1) r8
            z7 r10 = new z7
            r11 = 9
            r10.<init>(r8, r0, r4, r11)
            java.lang.String r11 = r8.f7290
            java.lang.String r12 = r8.f7291
            int r13 = r8.f7292
            java.lang.String r14 = r8.f7293
            boolean r15 = r8.f7294
            r14.getClass()
            r16 = r10
            mv1 r10 = new mv1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r2.add(r10)
            goto L19b
        L1c6:
            gn0 r7 = new gn0
            r7.<init>(r4, r0)
            android.widget.LinearLayout r0 = p000.v81.m6132(r3, r2, r7, r1)
            boolean r1 = p000.ln0.m3626(r6, r5)
            if (r1 == 0) goto L1da
            r1 = 0
            r9.addView(r0, r1)
            goto L1dd
        L1da:
            r9.addView(r0)
        L1dd:
            java.lang.String r0 = "DYHelper: 分享面板快捷操作已注入到 "
            p000.AbstractC0602nx.m4142(r0, r6)
            r0 = 1
            return r0
        L1e4:
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public static boolean m2775(android.app.Dialog r3) {
            boolean r3 = m2774(r3)     // Catch: java.lang.Throwable -> L9
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L9
            goto L10
        L9:
            r3 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r3)
            r3 = r0
        L10:
            java.lang.Throwable r0 = p000.fo1.m2190(r3)
            if (r0 == 0) goto L1d
            java.lang.String r1 = "DYHelper"
            java.lang.String r2 = "分享面板快捷操作注入失败"
            p000.C0888ux.m5977(r1, r2, r0)
        L1d:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r3 instanceof p000.eo1
            if (r1 == 0) goto L24
            r3 = r0
        L24:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
    }
}
