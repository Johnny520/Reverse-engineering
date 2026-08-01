package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class bv1 {

    /* JADX INFO: renamed from: α */
    public static final p000.bv1 f1853 = null;

    /* JADX INFO: renamed from: β */
    public static android.app.AlertDialog f1854;

    /* JADX INFO: renamed from: γ */
    public static final android.os.Handler f1855 = null;

    /* JADX INFO: renamed from: δ */
    public static p000.qu1 f1856;

    /* JADX INFO: renamed from: ε */
    public static p000.pu1 f1857;

    /* JADX INFO: renamed from: ζ */
    public static java.lang.String f1858;

    /* JADX INFO: renamed from: η */
    public static final java.util.ArrayList f1859 = null;

    /* JADX INFO: renamed from: θ */
    public static final java.util.ArrayList f1860 = null;

    /* JADX INFO: renamed from: ι */
    public static final java.util.ArrayList f1861 = null;

    /* JADX INFO: renamed from: κ */
    public static android.widget.ScrollView f1862;

    /* JADX INFO: renamed from: λ */
    public static android.widget.LinearLayout f1863;

    /* JADX INFO: renamed from: μ */
    public static android.widget.TextView f1864;

    /* JADX INFO: renamed from: ν */
    public static android.widget.LinearLayout f1865;

    /* JADX INFO: renamed from: ξ */
    public static android.widget.LinearLayout f1866;

    /* JADX INFO: renamed from: ο */
    public static final java.util.LinkedHashSet f1867 = null;

    /* JADX INFO: renamed from: π */
    public static final p000.h22 f1868 = null;

    /* JADX INFO: renamed from: ρ */
    public static final p000.h22 f1869 = null;

    /* JADX INFO: renamed from: σ */
    public static final java.util.concurrent.atomic.AtomicLong f1870 = null;

    static {
            bv1 r0 = new bv1
            r0.<init>()
            p000.bv1.f1853 = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.bv1.f1855 = r0
            pu1 r0 = p000.pu1.f8719
            p000.bv1.f1857 = r0
            java.lang.String r0 = ""
            p000.bv1.f1858 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            p000.bv1.f1859 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            p000.bv1.f1860 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            p000.bv1.f1861 = r0
            java.lang.String r11 = "clean_progress_bar_restore_alpha_on_pause"
            java.lang.String r12 = "clean_progress_bar_only_in_clean_mode"
            java.lang.String r1 = "clean_mode_enabled"
            java.lang.String r2 = "clean_right_panel_alpha"
            java.lang.String r3 = "clean_bottom_info_alpha"
            java.lang.String r4 = "clean_top_bar_alpha"
            java.lang.String r5 = "clean_auto_hide"
            java.lang.String r6 = "clean_touch_restore_controls"
            java.lang.String r7 = "clean_pause_show_bottom_bar"
            java.lang.String r8 = "clean_auto_hide_delay"
            java.lang.String r9 = "clean_progress_bar_enabled"
            java.lang.String r10 = "clean_progress_bar_alpha"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            java.util.LinkedHashSet r1 = p000.AbstractC0782s1.m5346()
            java.util.LinkedHashSet r0 = p000.g81.m2282(r0, r1)
            p000.bv1.f1867 = r0
            kt0 r0 = new kt0
            r1 = 28
            r0.<init>(r1)
            h22 r1 = new h22
            r1.<init>(r0)
            p000.bv1.f1868 = r1
            kt0 r0 = new kt0
            r1 = 29
            r0.<init>(r1)
            h22 r1 = new h22
            r1.<init>(r0)
            p000.bv1.f1869 = r1
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            p000.bv1.f1870 = r0
            return
    }

    /* JADX INFO: renamed from: Α */
    public static int m1032() {
            r0 = 0
            java.lang.String r1 = "voice_replace_audio_list"
            java.lang.String r2 = ""
            java.lang.String r1 = p000.ui1.m5893(r1, r2)     // Catch: java.lang.Throwable -> L1f
            boolean r2 = p000.q02.m4671(r1)     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L11
            r1 = r0
            goto L1a
        L11:
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L1f
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1f
            int r1 = r2.length()     // Catch: java.lang.Throwable -> L1f
        L1a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L1f
            goto L26
        L1f:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L26:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L2f
            r1 = r0
        L2f:
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            return r0
    }

    /* JADX INFO: renamed from: Β */
    public static boolean m1033() {
            java.util.List r0 = com.example.dyhelper.p002ui.GestureAreaView.f2524     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto Lb
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto Lb
            goto L50
        Lb:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L50
        Lf:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L50
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L50
            java.util.List r2 = com.example.dyhelper.p002ui.GestureAreaView.f2525     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L26
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L26
            goto Lf
        L26:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L50
        L2a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto Lf
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L50
            w90 r4 = com.example.dyhelper.p002ui.GestureAreaView.f2522     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = p000.C0381i2.m2602(r1, r3)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = "无"
            java.lang.String r3 = p000.ui1.m5893(r3, r4)     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = p000.C0381i2.m2598(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = "模块菜单"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L2a
            r0 = 1
            return r0
        L50:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: Γ */
    public static void m1034(android.view.View r2, float r3) {
            ou r0 = new ou
            r1 = 1
            r0.<init>(r1, r3)
            r2.setOnTouchListener(r0)
            return
    }

    /* JADX INFO: renamed from: Δ */
    public static java.lang.String m1035(java.lang.String r1) {
            r1.getClass()
            java.lang.String r0 = "#"
            java.lang.String r1 = p000.q02.m4690(r1, r0, r1)
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = p000.AbstractC0602nx.m4134(r0, r1, r0)
            return r1
    }

    /* JADX INFO: renamed from: Ε */
    public static void m1036(java.lang.String r1) {
            java.util.LinkedHashSet r0 = p000.bv1.f1867
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lf
            tg r0 = p000.AbstractC0871ug.f10771
            java.lang.String r0 = "settings_ui"
            p000.C0834tg.m5649(r1, r0)
        Lf:
            return
    }

    /* JADX INFO: renamed from: Ζ */
    public static java.lang.String m1037(java.lang.String r10) {
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L20
            r0.<init>(r10)     // Catch: java.lang.Throwable -> L20
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L20
            r2 = 0
            xm0 r3 = p000.j81.m2893(r2, r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r4 = "\n"
            cl1 r8 = new cl1     // Catch: java.lang.Throwable -> L20
            r1 = 5
            r8.<init>(r1, r0)     // Catch: java.lang.Throwable -> L20
            r9 = 30
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r10 = p000.AbstractC0984xh.m6644(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L20
            goto L34
        L20:
            java.util.List r0 = p000.j81.m2883(r10)
            if (r0 == 0) goto L33
            r5 = 0
            r6 = 62
            java.lang.String r1 = "\n"
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r10 = p000.AbstractC0984xh.m6644(r0, r1, r2, r3, r4, r5, r6)
            goto L34
        L33:
            r10 = 0
        L34:
            if (r10 != 0) goto L38
            java.lang.String r10 = ""
        L38:
            return r10
    }

    /* JADX INFO: renamed from: Η */
    public static void m1038(android.app.Activity r3, p000.a80 r4) {
            mu1 r0 = new mu1     // Catch: java.lang.Exception -> L19
            r0.<init>()     // Catch: java.lang.Exception -> L19
            r0.f7281 = r4     // Catch: java.lang.Exception -> L19
            android.app.FragmentManager r4 = r3.getFragmentManager()     // Catch: java.lang.Exception -> L19
            android.app.FragmentTransaction r4 = r4.beginTransaction()     // Catch: java.lang.Exception -> L19
            java.lang.String r1 = "DYHelper_ImagePicker"
            android.app.FragmentTransaction r4 = r4.add(r0, r1)     // Catch: java.lang.Exception -> L19
            r4.commitAllowingStateLoss()     // Catch: java.lang.Exception -> L19
            return
        L19:
            r4 = move-exception
            java.lang.String r4 = r4.getMessage()
            java.lang.String r0 = "启动图片选择器失败: "
            java.lang.String r4 = p000.lz1.m3687(r0, r4)
            r0 = 4
            java.lang.String r1 = "DYHelper"
            r2 = 0
            p000.C0888ux.m5988(r1, r4, r2, r0, r2)
            java.lang.String r4 = "无法打开相册"
            r0 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r4, r0)
            r3.show()
            return
    }

    /* JADX INFO: renamed from: Θ */
    public static void m1039(android.content.Context r1, java.lang.String r2, boolean r3, android.widget.Switch r4, boolean r5) {
            r1.getClass()
            r2.getClass()
            r4.getClass()
            boolean r0 = p000.i81.m2670(r1)
            if (r0 != 0) goto L28
            boolean r2 = p000.ui1.m5887(r2, r5)
            if (r3 == r2) goto L18
            p000.i81.m2648(r1)
        L18:
            boolean r1 = r4.isChecked()
            if (r1 == r2) goto L2b
            jg r1 = new jg
            r3 = 4
            r1.<init>(r4, r2, r3)
            r4.post(r1)
            goto L2b
        L28:
            p000.ui1.m5871(r2, r3)
        L2b:
            return
    }

    /* JADX INFO: renamed from: Ι */
    public static boolean m1040(int r1, android.content.Context r2, java.lang.String r3) {
            r2.getClass()
            boolean r0 = p000.i81.m2670(r2)
            if (r0 != 0) goto Le
            p000.i81.m2648(r2)
            r1 = 0
            return r1
        Le:
            p000.ui1.m5873(r3, r1)
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: Κ */
    public static java.lang.String m1041() {
            java.util.List r0 = p000.q71.f8901
            java.util.List r0 = p000.AbstractC0984xh.m6666(r0)
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r0, r1)
            int r1 = p000.ex0.m1970(r1)
            r2 = 16
            if (r1 >= r2) goto L15
            r1 = r2
        L15:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            r3 = r1
            n71 r3 = (p000.n71) r3
            java.lang.String r3 = r3.f7446
            r2.put(r3, r1)
            goto L1e
        L31:
            q71 r0 = p000.q71.f8896
            boolean r0 = p000.q71.m4804()
            java.util.List r1 = p000.xv1.m6786()
            r3 = 0
            if (r1 == 0) goto L45
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L45
            goto L6e
        L45:
            java.util.Iterator r1 = r1.iterator()
        L49:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L6e
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r4 = r2.get(r4)
            n71 r4 = (p000.n71) r4
            if (r4 == 0) goto L49
            boolean r4 = r4.m4010(r0)
            r5 = 1
            if (r4 != r5) goto L49
            int r3 = r3 + 1
            if (r3 < 0) goto L69
            goto L49
        L69:
            p000.AbstractC1021yh.m6916()
            r0 = 0
            throw r0
        L6e:
            if (r3 != 0) goto L73
            java.lang.String r0 = "未选择"
            return r0
        L73:
            java.lang.String r0 = "已选 "
            java.lang.String r1 = " 项"
            java.lang.String r0 = p000.AbstractC0602nx.m4127(r0, r3, r1)
            return r0
    }

    /* JADX INFO: renamed from: Λ */
    public static java.lang.String m1042(java.lang.String r1, int r2) {
            r1.getClass()
            int r0 = r1.length()
            if (r0 <= r2) goto L13
            java.lang.String r1 = p000.q02.m4693(r1, r2)
            java.lang.String r2 = "..."
            java.lang.String r1 = r1.concat(r2)
        L13:
            return r1
    }

    /* JADX INFO: renamed from: Μ */
    public static void m1043(android.app.Activity r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, p000.p70 r5) {
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r1)
            android.app.AlertDialog$Builder r1 = r0.setTitle(r2)
            android.app.AlertDialog$Builder r1 = r1.setMessage(r3)
            wt1 r2 = new wt1
            r3 = 0
            r2.<init>(r3, r5)
            android.app.AlertDialog$Builder r1 = r1.setPositiveButton(r4, r2)
            java.lang.String r2 = "取消"
            r3 = 0
            android.app.AlertDialog$Builder r1 = r1.setNegativeButton(r2, r3)
            r1.show()
            return
    }

    /* JADX INFO: renamed from: Ν */
    public static final android.graphics.drawable.GradientDrawable m1044(android.app.Activity r1, java.lang.String r2) {
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            int r2 = android.graphics.Color.parseColor(r2)
            r0.setColor(r2)
            r2 = 11
            int r1 = m1076(r1, r2)
            float r1 = (float) r1
            r0.setCornerRadius(r1)
            return r0
    }

    /* JADX INFO: renamed from: Ξ */
    public static final void m1045(p000.um1 r5, p000.wu1 r6, android.widget.TextView r7, android.widget.TextView r8, android.widget.TextView r9, android.widget.TextView r10) {
            r0 = 0
            r1 = 1
            java.util.List r0 = p000.C0888ux.m5967(r0, r1, r0)
            java.lang.Object r2 = r5.f10912
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = p000.q02.m4671(r2)
            if (r2 == 0) goto L12
            r2 = r0
            goto L1a
        L12:
            java.lang.Object r2 = r5.f10912
            java.lang.String r2 = (java.lang.String) r2
            java.util.List r2 = p000.C0888ux.m5966(r2)
        L1a:
            r2.getClass()
            gx0 r3 = new gx0
            r3.<init>(r2)
            r6.f11868 = r3
            r6.notifyDataSetChanged()
            java.lang.Object r6 = r5.f10912
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = p000.q02.m4671(r6)
            if (r6 == 0) goto L3a
            int r6 = r2.size()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            goto L56
        L3a:
            int r6 = r2.size()
            int r3 = r0.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r6)
            java.lang.String r6 = "/"
            r4.append(r6)
            r4.append(r3)
            java.lang.String r6 = r4.toString()
        L56:
            r7.setText(r6)
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L62
            java.lang.String r6 = "暂无 DyLog 日志。注意：只有通过 DyLog.log/d/e 写入的日志才会显示。"
            goto La0
        L62:
            java.lang.Object r6 = r5.f10912
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = p000.q02.m4671(r6)
            if (r6 != 0) goto L94
            java.lang.Object r6 = r5.f10912
            int r7 = r2.size()
            int r0 = r0.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "筛选 TAG："
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r6 = " · 显示 "
            r2.append(r6)
            r2.append(r7)
            java.lang.String r6 = " / "
            r2.append(r6)
            java.lang.String r6 = " 条"
            java.lang.String r6 = p000.AbstractC0602nx.m4131(r2, r0, r6)
            goto La0
        L94:
            int r6 = r0.size()
            java.lang.String r7 = "共 "
            java.lang.String r0 = " 条日志 · 最新日志在最上方"
            java.lang.String r6 = p000.AbstractC0602nx.m4127(r7, r6, r0)
        La0:
            r8.setText(r6)
            java.lang.Object r6 = r5.f10912
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = p000.q02.m4671(r6)
            if (r6 == 0) goto Lb0
            java.lang.String r6 = "暂无 DyLog 日志\n只有通过 DyLog.log / DyLog.d / DyLog.e 写入的日志会显示"
            goto Lc5
        Lb0:
            java.lang.Object r6 = r5.f10912
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "没有匹配 TAG「"
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = "」的日志"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
        Lc5:
            r9.setText(r6)
            java.lang.Object r6 = r5.f10912
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = p000.q02.m4671(r6)
            r6 = r6 ^ r1
            r10.setEnabled(r6)
            java.lang.Object r5 = r5.f10912
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = p000.q02.m4671(r5)
            if (r5 != 0) goto Le1
            r5 = 1065353216(0x3f800000, float:1.0)
            goto Le4
        Le1:
            r5 = 1055286886(0x3ee66666, float:0.45)
        Le4:
            r10.setAlpha(r5)
            return
    }

    /* JADX INFO: renamed from: Ο */
    public static final int m1046(java.util.LinkedHashMap r2) {
            java.util.Collection r2 = r2.values()
            r2.getClass()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r0 = r2
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L14
            return r1
        L14:
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r0 = r2.next()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.getClass()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L18
            int r1 = r1 + 1
            if (r1 < 0) goto L32
            goto L18
        L32:
            p000.AbstractC1021yh.m6916()
            r2 = 0
            throw r2
        L37:
            return r1
    }

    /* JADX INFO: renamed from: Π */
    public static final void m1047(android.widget.TextView r2, java.util.List r3, android.widget.TextView r4, java.util.LinkedHashMap r5) {
            int r3 = r3.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "可过滤右侧控件："
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " 个"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.setText(r3)
            int r2 = m1046(r5)
            if (r2 <= 0) goto L2d
            int r2 = m1046(r5)
            java.lang.String r3 = "当前已勾选隐藏 "
            java.lang.String r5 = " 项，保存后重进视频页生效"
            java.lang.String r2 = p000.AbstractC0602nx.m4127(r3, r2, r5)
            goto L2f
        L2d:
            java.lang.String r2 = "勾选后点击保存即可生效"
        L2f:
            r4.setText(r2)
            return
    }

    /* JADX INFO: renamed from: Ρ */
    public static final void m1048(p000.zc0 r11, p000.qm1 r12, p000.um1 r13, p000.um1 r14, p000.um1 r15, p000.um1 r16, android.view.View r17, android.widget.TextView r18, android.widget.TextView r19, android.widget.TextView r20, android.widget.TextView r21, java.lang.String r22, java.util.LinkedHashSet r23) {
            java.lang.CharSequence r0 = p000.q02.m4660(r22)
            java.lang.String r0 = r0.toString()
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r0 = p000.AbstractC0602nx.m4134(r1, r0, r1)
            r13.f10912 = r0
            boolean r0 = p000.q02.m4671(r0)
            java.lang.Object r2 = r15.f10912
            if (r0 == 0) goto L1b
            java.util.List r2 = (java.util.List) r2
            goto L45
        L1b:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L26:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L44
            java.lang.Object r3 = r2.next()
            r4 = r3
            lu1 r4 = (p000.lu1) r4
            java.lang.String r4 = r4.f6803
            java.lang.Object r5 = r13.f10912
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r7 = 0
            boolean r4 = p000.q02.m4654(r4, r5, r7)
            if (r4 == 0) goto L26
            r0.add(r3)
            goto L26
        L44:
            r2 = r0
        L45:
            r14.f10912 = r2
            r11.notifyDataSetChanged()
            r3 = r12
            r6 = r13
            r1 = r14
            r0 = r15
            r5 = r16
            r9 = r17
            r2 = r18
            r4 = r19
            r7 = r20
            r8 = r21
            r10 = r23
            m1050(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    /* JADX INFO: renamed from: Σ */
    public static final void m1049(p000.um1 r13, p000.qm1 r14, p000.um1 r15, android.widget.EditText r16, java.util.Set r17, java.util.HashSet r18, java.util.LinkedHashSet r19, p000.um1 r20, p000.um1 r21, p000.zc0 r22, android.widget.TextView r23, android.widget.TextView r24, android.widget.TextView r25, android.widget.TextView r26, android.view.View r27, java.util.List r28, boolean r29, java.lang.Throwable r30) {
            r0 = r30
            r13.f10912 = r0
            r0 = r29
            r14.f9050 = r0
            r0 = r28
            r15.f10912 = r0
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r0.next()
            lu1 r2 = (p000.lu1) r2
            java.lang.String r2 = r2.f6800
            r3 = r17
            boolean r6 = r3.contains(r2)
            if (r6 == 0) goto L34
            r6 = r18
            boolean r7 = r6.contains(r2)
            r12 = r19
            if (r7 != 0) goto L10
            r12.add(r2)
            goto L10
        L34:
            r6 = r18
            r12 = r19
            goto L10
        L39:
            r12 = r19
            android.text.Editable r0 = r16.getText()
            if (r0 == 0) goto L46
            java.lang.String r0 = r0.toString()
            goto L47
        L46:
            r0 = 0
        L47:
            if (r0 != 0) goto L4b
            java.lang.String r0 = ""
        L4b:
            r5 = r13
            r1 = r14
            r4 = r15
            r2 = r20
            r3 = r21
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r6 = r27
            r11 = r0
            r0 = r22
            m1048(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
    }

    /* JADX INFO: renamed from: Τ */
    public static final void m1050(p000.um1 r4, p000.um1 r5, android.widget.TextView r6, p000.qm1 r7, android.widget.TextView r8, p000.um1 r9, p000.um1 r10, android.widget.TextView r11, android.widget.TextView r12, android.view.View r13, java.util.LinkedHashSet r14) {
            java.lang.Object r0 = r4.f10912
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            java.lang.Object r5 = r5.f10912
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            java.lang.Object r4 = r4.f10912
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            boolean r1 = r4 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L24
            r1 = r4
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L24
            r1 = r2
            goto L47
        L24:
            java.util.Iterator r4 = r4.iterator()
            r1 = r2
        L29:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L47
            java.lang.Object r3 = r4.next()
            lu1 r3 = (p000.lu1) r3
            java.lang.String r3 = r3.f6800
            boolean r3 = r14.contains(r3)
            if (r3 == 0) goto L29
            int r1 = r1 + 1
            if (r1 < 0) goto L42
            goto L29
        L42:
            p000.AbstractC1021yh.m6916()
            r4 = 0
            throw r4
        L47:
            boolean r4 = r7.f9050
            if (r4 == 0) goto L50
            if (r0 != 0) goto L50
            java.lang.String r4 = "加载中"
            goto L64
        L50:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r14 = "/"
            r4.append(r14)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
        L64:
            r6.setText(r4)
            boolean r4 = r7.f9050
            if (r4 == 0) goto L70
            if (r0 != 0) goto L70
            java.lang.String r4 = "正在加载完整会话列表…"
            goto Lc7
        L70:
            if (r4 == 0) goto L7d
            if (r0 <= 0) goto L7d
            java.lang.String r4 = "已显示缓存 "
            java.lang.String r5 = " 个，正在后台刷新…"
            java.lang.String r4 = p000.AbstractC0602nx.m4127(r4, r0, r5)
            goto Lc7
        L7d:
            java.lang.Object r4 = r9.f10912
            if (r4 == 0) goto L94
            if (r0 != 0) goto L94
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.String r4 = r4.getMessage()
            if (r4 != 0) goto L8d
            java.lang.String r4 = "未知错误"
        L8d:
            java.lang.String r5 = "加载失败："
            java.lang.String r4 = r5.concat(r4)
            goto Lc7
        L94:
            java.lang.String r6 = " 个"
            if (r4 == 0) goto La1
            if (r0 <= 0) goto La1
            java.lang.String r4 = "后台刷新失败，已显示缓存 "
            java.lang.String r4 = p000.AbstractC0602nx.m4127(r4, r0, r6)
            goto Lc7
        La1:
            if (r0 != 0) goto La6
            java.lang.String r4 = "暂未获取到会话列表，请先进入一次消息页后再试"
            goto Lc7
        La6:
            java.lang.Object r4 = r10.f10912
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = p000.q02.m4671(r4)
            if (r4 != 0) goto Lbf
            java.lang.String r4 = " / "
            java.lang.String r9 = " 个 · 已选 "
            java.lang.String r14 = "匹配 "
            java.lang.StringBuilder r4 = p000.AbstractC0602nx.m4136(r14, r5, r4, r0, r9)
            java.lang.String r4 = p000.AbstractC0602nx.m4131(r4, r1, r6)
            goto Lc7
        Lbf:
            java.lang.String r4 = "共 "
            java.lang.String r5 = " 个会话 · 已选 "
            java.lang.String r4 = p000.AbstractC0602nx.m4128(r4, r0, r5, r1, r6)
        Lc7:
            r8.setText(r4)
            boolean r4 = r7.f9050
            if (r4 == 0) goto Ld1
            java.lang.String r4 = "正在加载会话…"
            goto Le0
        Ld1:
            java.lang.Object r4 = r10.f10912
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = p000.q02.m4671(r4)
            if (r4 != 0) goto Lde
            java.lang.String r4 = "没有匹配的会话"
            goto Le0
        Lde:
            java.lang.String r4 = "暂无会话数据\n请先进入一次消息页后再试"
        Le0:
            r11.setText(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "保存 "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r5 = " 个会话规则"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r12.setText(r4)
            boolean r4 = r7.f9050
            if (r4 == 0) goto Lff
            if (r0 == 0) goto L100
        Lff:
            r2 = 1
        L100:
            r13.setEnabled(r2)
            if (r2 == 0) goto L108
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L10b
        L108:
            r4 = 1055286886(0x3ee66666, float:0.45)
        L10b:
            r13.setAlpha(r4)
            return
    }

    /* JADX INFO: renamed from: Υ */
    public static final java.lang.String m1051(p000.um1 r7, p000.qm1 r8, p000.qm1 r9, p000.um1 r10) {
            java.lang.Object r7 = r7.f10912
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "{time:"
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = "}"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String[] r7 = new java.lang.String[]{r7}
            java.util.ArrayList r0 = p000.AbstractC1021yh.m6899(r7)
            boolean r7 = r8.f9050
            if (r7 == 0) goto L26
            java.lang.String r7 = "{location}"
            r0.add(r7)
        L26:
            boolean r7 = r9.f9050
            if (r7 == 0) goto L2f
            java.lang.String r7 = "{id}"
            r0.add(r7)
        L2f:
            java.lang.Object r7 = r10.f10912
            r1 = r7
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r5 = 0
            r6 = 62
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r7 = p000.AbstractC0984xh.m6644(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    /* JADX INFO: renamed from: Φ */
    public static final void m1052(p000.um1 r7, android.widget.EditText r8, android.widget.TextView r9, android.widget.TextView r10, android.widget.TextView r11, p000.um1 r12, p000.qm1 r13, p000.qm1 r14) {
            android.text.Editable r8 = r8.getText()
            if (r8 == 0) goto L21
            java.lang.String r8 = r8.toString()
            if (r8 == 0) goto L21
            java.lang.CharSequence r8 = p000.q02.m4660(r8)
            java.lang.String r8 = r8.toString()
            if (r8 == 0) goto L21
            boolean r0 = p000.q02.m4671(r8)
            if (r0 != 0) goto L1d
            goto L1e
        L1d:
            r8 = 0
        L1e:
            if (r8 == 0) goto L21
            goto L23
        L21:
            java.lang.String r8 = "yyyy-MM-dd HH:mm"
        L23:
            r7.f10912 = r8
            java.lang.String r8 = m1051(r7, r13, r14, r12)
            java.lang.Object r0 = r7.f10912
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L4b
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L4b
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L4b
            java.util.Date r0 = new java.util.Date     // Catch: java.lang.Throwable -> L4b
            r2 = 1717228800000(0x18fd2d00800, double:8.48423756129E-312)
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = r1.format(r0)     // Catch: java.lang.Throwable -> L4b
            r0.getClass()     // Catch: java.lang.Throwable -> L4b
            goto L4d
        L4b:
            java.lang.String r0 = "2024-06-01 16:00"
        L4d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r8.length()
            r1.<init>(r2)
            r2 = 0
            r3 = r2
        L58:
            int r4 = r8.length()
            if (r3 >= r4) goto Lb5
            r4 = 123(0x7b, float:1.72E-43)
            r5 = 4
            int r4 = p000.q02.m4668(r8, r4, r3, r5)
            if (r4 >= 0) goto L6f
            int r0 = r8.length()
            r1.append(r8, r3, r0)
            goto Lb5
        L6f:
            r1.append(r8, r3, r4)
            int r3 = r4 + 1
            r6 = 125(0x7d, float:1.75E-43)
            int r5 = p000.q02.m4668(r8, r6, r3, r5)
            if (r5 >= 0) goto L84
            int r0 = r8.length()
            r1.append(r8, r4, r0)
            goto Lb5
        L84:
            java.lang.String r3 = r8.substring(r3, r5)
            java.lang.String r6 = "time"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto Laf
            java.lang.String r6 = "createTime"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto Laf
            java.lang.String r6 = "time:"
            boolean r6 = p000.x02.m6485(r3, r6, r2)
            if (r6 != 0) goto Laf
            java.lang.String r6 = "createTime:"
            boolean r3 = p000.x02.m6485(r3, r6, r2)
            if (r3 == 0) goto La9
            goto Laf
        La9:
            int r3 = r5 + 1
            r1.append(r8, r4, r3)
            goto Lb2
        Laf:
            r1.append(r0)
        Lb2:
            int r3 = r5 + 1
            goto L58
        Lb5:
            java.lang.String r8 = r1.toString()
            java.lang.String r0 = "{location}"
            java.lang.String r1 = "上海"
            java.lang.String r8 = p000.x02.m6483(r8, r0, r1)
            java.lang.String r0 = "{id}"
            java.lang.String r1 = "7123456789012345678"
            java.lang.String r8 = p000.x02.m6483(r8, r0, r1)
            java.lang.String r0 = "预览："
            java.lang.String r8 = r0.concat(r8)
            r9.setText(r8)
            java.lang.String r7 = m1051(r7, r13, r14, r12)
            r10.setText(r7)
            java.lang.Object r7 = r12.f10912
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r8 = p000.q02.m4671(r7)
            if (r8 == 0) goto Le5
            java.lang.String r7 = "空格"
        Le5:
            r11.setText(r7)
            return
    }

    /* JADX INFO: renamed from: Χ */
    public static void m1053(android.app.Activity r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, p000.a80 r8) {
            android.widget.EditText r0 = new android.widget.EditText
            r0.<init>(r3)
            r0.setText(r6)
            r0.setHint(r5)
            r0.setInputType(r7)
            r5 = 16
            int r6 = m1076(r3, r5)
            r7 = 12
            int r1 = m1076(r3, r7)
            int r2 = m1076(r3, r5)
            int r7 = m1076(r3, r7)
            r0.setPadding(r6, r1, r2, r7)
            android.text.Editable r6 = r0.getText()
            int r6 = r6.length()
            r0.setSelection(r6)
            android.app.AlertDialog$Builder r6 = new android.app.AlertDialog$Builder
            r6.<init>(r3)
            android.app.AlertDialog$Builder r4 = r6.setTitle(r4)
            r6 = 1
            android.widget.LinearLayout r6 = p000.AbstractC0602nx.m4123(r3, r6)
            r7 = 24
            int r1 = m1076(r3, r7)
            int r5 = m1076(r3, r5)
            int r7 = m1076(r3, r7)
            r2 = 8
            int r3 = m1076(r3, r2)
            r6.setPadding(r1, r5, r7, r3)
            r6.addView(r0)
            android.app.AlertDialog$Builder r3 = r4.setView(r6)
            bc0 r4 = new bc0
            r5 = 10
            r4.<init>(r8, r5, r0)
            java.lang.String r5 = "确定"
            android.app.AlertDialog$Builder r3 = r3.setPositiveButton(r5, r4)
            java.lang.String r4 = "取消"
            r5 = 0
            android.app.AlertDialog$Builder r3 = r3.setNegativeButton(r4, r5)
            r3.show()
            return
    }

    /* JADX INFO: renamed from: Ω */
    public static void m1054(android.app.Activity r2, java.lang.String r3, java.lang.String[] r4, int r5, p000.a80 r6) {
            sm1 r0 = new sm1
            r0.<init>()
            r0.f9967 = r5
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r2)
            android.app.AlertDialog$Builder r2 = r1.setTitle(r3)
            java.lang.CharSequence[] r4 = (java.lang.CharSequence[]) r4
            gd0 r3 = new gd0
            r1 = 4
            r3.<init>(r1, r0)
            android.app.AlertDialog$Builder r2 = r2.setSingleChoiceItems(r4, r5, r3)
            bc0 r3 = new bc0
            r4 = 8
            r3.<init>(r6, r4, r0)
            java.lang.String r4 = "确定"
            android.app.AlertDialog$Builder r2 = r2.setPositiveButton(r4, r3)
            java.lang.String r3 = "取消"
            r4 = 0
            android.app.AlertDialog$Builder r2 = r2.setNegativeButton(r3, r4)
            r2.show()
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m1055(android.widget.LinearLayout r6, android.content.Context r7, java.util.List r8, boolean r9) {
            java.util.Iterator r8 = r8.iterator()
            r0 = 0
        L5:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r8.next()
            int r2 = r0 + 1
            if (r0 < 0) goto L38
            ys1 r1 = (p000.ys1) r1
            if (r0 <= 0) goto L1e
            android.view.View r0 = m1064(r7)
            r6.addView(r0)
        L1e:
            java.lang.String r0 = r1.f12777
            java.lang.String r3 = r1.f12778
            java.lang.String r4 = r1.f12776
            boolean r5 = r1.f12779
            boolean r4 = p000.ui1.m5887(r4, r5)
            nt1 r5 = new nt1
            r5.<init>(r9, r7, r1)
            android.widget.LinearLayout r0 = m1073(r7, r0, r3, r4, r5)
            r6.addView(r0)
            r0 = r2
            goto L5
        L38:
            p000.AbstractC1021yh.m6917()
            r6 = 0
            throw r6
        L3d:
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m1056(android.widget.LinearLayout r0, android.content.Context r1) {
            android.view.View r1 = m1064(r1)
            r0.addView(r1)
            return
    }

    /* JADX INFO: renamed from: γ */
    public static void m1057(android.widget.LinearLayout r0, android.content.Context r1, java.lang.String r2) {
            android.widget.TextView r1 = m1065(r1, r2)
            r0.addView(r1)
            return
    }

    /* JADX INFO: renamed from: δ */
    public static void m1058(android.widget.LinearLayout r0, android.content.Context r1, java.lang.String r2, java.lang.String r3, boolean r4, p000.e80 r5) {
            android.widget.LinearLayout r1 = m1073(r1, r2, r3, r4, r5)
            r0.addView(r1)
            return
    }

    /* JADX INFO: renamed from: ε */
    public static void m1059(android.view.View r3, boolean r4) {
            if (r3 != 0) goto L4
            goto L91
        L4:
            android.view.ViewPropertyAnimator r0 = r3.animate()
            r0.cancel()
            r0 = 0
            if (r4 == 0) goto L54
            int r4 = r3.getVisibility()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L4d
            r3.setAlpha(r0)
            android.content.Context r4 = r3.getContext()
            r4.getClass()
            r2 = 8
            int r4 = m1076(r4, r2)
            float r4 = (float) r4
            r3.setTranslationY(r4)
            r4 = 0
            r3.setVisibility(r4)
            android.view.ViewPropertyAnimator r3 = r3.animate()
            android.view.ViewPropertyAnimator r3 = r3.alpha(r1)
            android.view.ViewPropertyAnimator r3 = r3.translationY(r0)
            r0 = 220(0xdc, double:1.087E-321)
            android.view.ViewPropertyAnimator r3 = r3.setDuration(r0)
            android.view.animation.DecelerateInterpolator r4 = new android.view.animation.DecelerateInterpolator
            r4.<init>()
            android.view.ViewPropertyAnimator r3 = r3.setInterpolator(r4)
            r3.start()
            return
        L4d:
            r3.setAlpha(r1)
            r3.setTranslationY(r0)
            return
        L54:
            if (r4 != 0) goto L91
            int r4 = r3.getVisibility()
            if (r4 != 0) goto L91
            android.view.ViewPropertyAnimator r4 = r3.animate()
            android.view.ViewPropertyAnimator r4 = r4.alpha(r0)
            android.content.Context r0 = r3.getContext()
            r0.getClass()
            r1 = 6
            int r0 = m1076(r0, r1)
            float r0 = (float) r0
            android.view.ViewPropertyAnimator r4 = r4.translationY(r0)
            r0 = 150(0x96, double:7.4E-322)
            android.view.ViewPropertyAnimator r4 = r4.setDuration(r0)
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            android.view.ViewPropertyAnimator r4 = r4.setInterpolator(r0)
            mt1 r0 = new mt1
            r1 = 0
            r0.<init>(r3, r1)
            android.view.ViewPropertyAnimator r3 = r4.withEndAction(r0)
            r3.start()
        L91:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static void m1060(android.view.View r3, boolean r4) {
            if (r4 == 0) goto L3
            goto L3c
        L3:
            boolean r4 = r3.isClickable()
            r0 = 0
            if (r4 != 0) goto L16
            boolean r4 = r3.isLongClickable()
            if (r4 != 0) goto L16
            boolean r4 = r3.isFocusable()
            if (r4 == 0) goto L22
        L16:
            r3.setEnabled(r0)
            r3.setClickable(r0)
            r3.setLongClickable(r0)
            r3.setFocusable(r0)
        L22:
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L3c
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r4 = r3.getChildCount()
            r1 = r0
        L2d:
            if (r1 >= r4) goto L3c
            android.view.View r2 = r3.getChildAt(r1)
            r2.getClass()
            m1060(r2, r0)
            int r1 = r1 + 1
            goto L2d
        L3c:
            return
    }

    /* JADX INFO: renamed from: η */
    public static android.widget.LinearLayout m1061(android.app.Activity r4, java.lang.String r5) {
            android.widget.LinearLayout r0 = m1062(r4)
            m1057(r0, r4, r5)
            m1056(r0, r4)
            java.lang.String r5 = m1075()
            r1 = 0
            boolean r1 = p000.i81.m2670(r1)
            r5.getClass()
            boolean r5 = p000.q02.m4671(r5)
            if (r5 == 0) goto L1f
            java.lang.String r5 = "未检测到账号"
            goto L26
        L1f:
            if (r1 == 0) goto L24
            java.lang.String r5 = "已通过"
            goto L26
        L24:
            java.lang.String r5 = "点击检查"
        L26:
            g71 r1 = new g71
            r2 = 25
            r1.<init>(r4, r2)
            java.lang.String r2 = "内测状态"
            java.lang.String r3 = "点击后联网检查当前账号是否拥有内测资格"
            android.widget.LinearLayout r4 = m1063(r4, r2, r5, r3, r1)
            r0.addView(r4)
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static android.widget.LinearLayout m1062(android.content.Context r6) {
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r6)
            r1 = 1
            r0.setOrientation(r1)
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            qu1 r3 = p000.bv1.f1856
            r4 = 0
            java.lang.String r5 = "theme"
            if (r3 == 0) goto L4e
            java.lang.String r3 = r3.f9117
            int r3 = android.graphics.Color.parseColor(r3)
            r2.setColor(r3)
            r3 = 14
            int r3 = m1076(r6, r3)
            float r3 = (float) r3
            r2.setCornerRadius(r3)
            int r6 = m1076(r6, r1)
            qu1 r3 = p000.bv1.f1856
            if (r3 == 0) goto L4a
            java.lang.String r3 = r3.f9136
            int r3 = android.graphics.Color.parseColor(r3)
            r2.setStroke(r6, r3)
            r0.setBackground(r2)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r3 = -2
            r6.<init>(r2, r3)
            r0.setLayoutParams(r6)
            r0.setClipToOutline(r1)
            return r0
        L4a:
            p000.ln0.m3650(r5)
            throw r4
        L4e:
            p000.ln0.m3650(r5)
            throw r4
    }

    /* JADX INFO: renamed from: ι */
    public static android.widget.LinearLayout m1063(android.content.Context r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, p000.a80 r14) {
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r10)
            r1 = 0
            r0.setOrientation(r1)
            r2 = 16
            r0.setGravity(r2)
            int r3 = m1076(r10, r2)
            r4 = 13
            int r5 = m1076(r10, r4)
            r6 = 14
            int r6 = m1076(r10, r6)
            int r4 = m1076(r10, r4)
            r0.setPadding(r3, r5, r6, r4)
            r3 = 1
            r0.setClickable(r3)
            r0.setFocusable(r3)
            qu1 r4 = p000.bv1.f1856
            java.lang.String r5 = "theme"
            r6 = 0
            if (r4 == 0) goto L135
            java.lang.String r4 = r4.f9135
            int r4 = android.graphics.Color.parseColor(r4)
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
            android.graphics.drawable.GradientDrawable r7 = p000.lz1.m3681(r1)
            android.graphics.drawable.RippleDrawable r8 = new android.graphics.drawable.RippleDrawable
            r8.<init>(r4, r7, r6)
            r0.setBackground(r8)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            r4.<init>(r10)
            r4.setOrientation(r3)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r8 = -2
            r9 = 1065353216(0x3f800000, float:1.0)
            r7.<init>(r1, r8, r9)
            r4.setLayoutParams(r7)
            android.widget.TextView r7 = new android.widget.TextView
            r7.<init>(r10)
            r7.setText(r11)
            r11 = 1096810496(0x41600000, float:14.0)
            r7.setTextSize(r11)
            qu1 r11 = p000.bv1.f1856
            if (r11 == 0) goto L131
            java.lang.String r11 = r11.f9122
            p000.lz1.m3699(r11, r7, r6, r3)
            r4.addView(r7)
            android.widget.TextView r11 = new android.widget.TextView
            r11.<init>(r10)
            r11.setText(r13)
            r13 = 1094713344(0x41400000, float:12.0)
            r11.setTextSize(r13)
            qu1 r13 = p000.bv1.f1856
            if (r13 == 0) goto L12d
            java.lang.String r13 = r13.f9124
            int r13 = android.graphics.Color.parseColor(r13)
            r11.setTextColor(r13)
            r13 = 3
            int r7 = m1076(r10, r13)
            r11.setPadding(r1, r7, r1, r1)
            r4.addView(r11)
            r0.addView(r4)
            android.widget.LinearLayout r11 = new android.widget.LinearLayout
            r11.<init>(r10)
            r11.setOrientation(r1)
            r11.setGravity(r2)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r10)
            r2.setText(r12)
            r12 = 1095761920(0x41500000, float:13.0)
            r2.setTextSize(r12)
            qu1 r12 = p000.bv1.f1856
            if (r12 == 0) goto L129
            java.lang.String r12 = r12.f9123
            int r12 = android.graphics.Color.parseColor(r12)
            r2.setTextColor(r12)
            r12 = 6
            int r12 = m1076(r10, r12)
            int r4 = m1076(r10, r13)
            r7 = 4
            int r8 = m1076(r10, r7)
            int r13 = m1076(r10, r13)
            r2.setPadding(r12, r4, r8, r13)
            r12 = 120(0x78, float:1.68E-43)
            int r12 = m1076(r10, r12)
            r2.setMaxWidth(r12)
            r2.setMaxLines(r3)
            android.text.TextUtils$TruncateAt r12 = android.text.TextUtils.TruncateAt.END
            r2.setEllipsize(r12)
            r11.addView(r2)
            android.widget.TextView r12 = new android.widget.TextView
            r12.<init>(r10)
            java.lang.String r13 = "›"
            r12.setText(r13)
            r13 = 1101004800(0x41a00000, float:20.0)
            r12.setTextSize(r13)
            qu1 r13 = p000.bv1.f1856
            if (r13 == 0) goto L125
            java.lang.String r13 = r13.f9124
            int r13 = android.graphics.Color.parseColor(r13)
            r12.setTextColor(r13)
            int r10 = m1076(r10, r7)
            r12.setPadding(r10, r1, r1, r1)
            r11.addView(r12)
            r0.addView(r11)
            c9 r10 = new c9
            r11 = 13
            r10.<init>(r0, r14, r2, r11)
            r0.setOnClickListener(r10)
            r10 = 1065101558(0x3f7c28f6, float:0.985)
            m1034(r0, r10)
            return r0
        L125:
            p000.ln0.m3650(r5)
            throw r6
        L129:
            p000.ln0.m3650(r5)
            throw r6
        L12d:
            p000.ln0.m3650(r5)
            throw r6
        L131:
            p000.ln0.m3650(r5)
            throw r6
        L135:
            p000.ln0.m3650(r5)
            throw r6
    }

    /* JADX INFO: renamed from: κ */
    public static android.view.View m1064(android.content.Context r4) {
            android.view.View r0 = new android.view.View
            r0.<init>(r4)
            qu1 r1 = p000.bv1.f1856
            if (r1 == 0) goto L29
            java.lang.String r1 = r1.f9121
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setBackgroundColor(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = 1
            int r2 = m1076(r4, r2)
            r3 = -1
            r1.<init>(r3, r2)
            r2 = 16
            int r4 = m1076(r4, r2)
            r1.leftMargin = r4
            r0.setLayoutParams(r1)
            return r0
        L29:
            java.lang.String r4 = "theme"
            p000.ln0.m3650(r4)
            r4 = 0
            throw r4
    }

    /* JADX INFO: renamed from: λ */
    public static android.widget.TextView m1065(android.content.Context r4, java.lang.String r5) {
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r4)
            r0.setText(r5)
            r5 = 1094713344(0x41400000, float:12.0)
            r0.setTextSize(r5)
            qu1 r5 = p000.bv1.f1856
            if (r5 == 0) goto L38
            java.lang.String r5 = r5.f9124
            int r5 = android.graphics.Color.parseColor(r5)
            r0.setTextColor(r5)
            r5 = 17
            r0.setGravity(r5)
            r5 = 16
            int r1 = m1076(r4, r5)
            r2 = 14
            int r2 = m1076(r4, r2)
            int r5 = m1076(r4, r5)
            r3 = 6
            int r4 = m1076(r4, r3)
            r0.setPadding(r1, r2, r5, r4)
            return r0
        L38:
            java.lang.String r4 = "theme"
            p000.ln0.m3650(r4)
            r4 = 0
            throw r4
    }

    /* JADX INFO: renamed from: μ */
    public static java.lang.String m1066(java.lang.String r5) {
            r5.getClass()
            java.lang.String r0 = "\r"
            java.lang.String r1 = "\n"
            java.lang.String r5 = p000.x02.m6483(r5, r0, r1)
            java.util.List r5 = p000.q02.m4675(r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r2 = p000.AbstractC1021yh.m6889(r5, r1)
            r0.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L1e:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            r0.add(r2)
            goto L1e
        L36:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r0 = r0.iterator()
        L3f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L56
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = p000.q02.m4671(r3)
            if (r3 != 0) goto L3f
            r5.add(r2)
            goto L3f
        L56:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L5f
            java.lang.String r5 = "未设置"
            return r5
        L5f:
            int r0 = r5.size()
            r2 = 1
            r3 = 0
            if (r0 != r2) goto L74
            java.lang.Object r5 = r5.get(r3)
            java.lang.String r5 = (java.lang.String) r5
            r0 = 18
            java.lang.String r5 = p000.q02.m4693(r5, r0)
            return r5
        L74:
            int r0 = r5.size()
            r4 = 2
            if (r0 != r4) goto L96
            java.lang.Object r0 = r5.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = p000.q02.m4693(r0, r1)
            java.lang.Object r5 = r5.get(r2)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = p000.q02.m4693(r5, r1)
            java.lang.String r1 = ", "
            java.lang.String r5 = p000.lz1.m3688(r0, r1, r5)
            return r5
        L96:
            java.lang.Object r0 = r5.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = p000.q02.m4693(r0, r1)
            int r5 = r5.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " 等 "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = " 项"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
    }

    /* JADX INFO: renamed from: ν */
    public static java.lang.String m1067(java.lang.String r3, java.lang.String r4) {
            ym1 r0 = p000.hk0.f4753
            java.lang.String r3 = p000.hk0.m2517(r3)
            r0 = 10
            r1 = 8629(0x21b5, float:1.2092E-41)
            java.lang.String r0 = r3.replace(r0, r1)
            r0.getClass()
            r1 = 18
            java.lang.String r0 = m1042(r0, r1)
            java.lang.String r1 = "{time}"
            r2 = 0
            boolean r3 = p000.q02.m4654(r3, r1, r2)
            if (r3 != 0) goto L21
            return r0
        L21:
            java.lang.String r3 = p000.hk0.m2516(r4)
            r4 = 14
            java.lang.String r3 = m1042(r3, r4)
            java.lang.String r4 = " · "
            java.lang.String r3 = p000.lz1.m3688(r0, r4, r3)
            return r3
    }

    /* JADX INFO: renamed from: ξ */
    public static java.lang.String m1068(java.lang.String r5) {
            r0 = 0
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L33
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L33
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L33
            xm0 r2 = p000.j81.m2893(r0, r2)     // Catch: java.lang.Throwable -> L33
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L33
            r4 = 10
            int r4 = p000.AbstractC1021yh.m6889(r2, r4)     // Catch: java.lang.Throwable -> L33
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L33
        L1d:
            r4 = r2
            wm0 r4 = (p000.wm0) r4     // Catch: java.lang.Throwable -> L33
            boolean r4 = r4.f11765     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L37
            r4 = r2
            wm0 r4 = (p000.wm0) r4     // Catch: java.lang.Throwable -> L33
            int r4 = r4.nextInt()     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L33
            r3.add(r4)     // Catch: java.lang.Throwable -> L33
            goto L1d
        L33:
            java.util.List r3 = p000.j81.m2883(r5)
        L37:
            jz r5 = p000.C0450jz.f5672
            if (r3 != 0) goto L3c
            r3 = r5
        L3c:
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L45
            java.lang.String r5 = "未设置"
            goto L94
        L45:
            int r5 = r3.size()
            r1 = 1
            if (r5 == r1) goto L8e
            r2 = 2
            if (r5 == r2) goto L71
            java.lang.Object r5 = r3.get(r0)
            int r0 = r3.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = " 等 "
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = " 项"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            goto L94
        L71:
            java.lang.Object r5 = r3.get(r0)
            java.lang.Object r0 = r3.get(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = ", "
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            goto L94
        L8e:
            java.lang.Object r5 = r3.get(r0)
            java.lang.String r5 = (java.lang.String) r5
        L94:
            return r5
    }

    /* JADX INFO: renamed from: ο */
    public static java.lang.String m1069(android.app.Activity r5, int r6) {
            java.lang.String r0 = r5.getPackageName()
            if (r0 != 0) goto L8
            java.lang.String r0 = ""
        L8:
            boolean r1 = p000.q02.m4671(r0)
            java.lang.String r2 = "unknown"
            if (r1 == 0) goto L11
            r0 = r2
        L11:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L24
            r3 = 33
            if (r1 < r3) goto L26
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L24
            android.content.pm.PackageManager$PackageInfoFlags r1 = p000.AbstractC1124.m7320()     // Catch: java.lang.Throwable -> L24
            android.content.pm.PackageInfo r5 = p000.AbstractC1124.m7319(r5, r0, r1)     // Catch: java.lang.Throwable -> L24
            goto L2f
        L24:
            r5 = move-exception
            goto L42
        L26:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L24
            r1 = 0
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r0, r1)     // Catch: java.lang.Throwable -> L24
        L2f:
            long r3 = r5.getLongVersionCode()     // Catch: java.lang.Throwable -> L24
            iu1 r1 = new iu1     // Catch: java.lang.Throwable -> L24
            java.lang.String r5 = r5.versionName     // Catch: java.lang.Throwable -> L24
            if (r5 != 0) goto L3a
            r5 = r2
        L3a:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L24
            r1.<init>(r0, r5, r3)     // Catch: java.lang.Throwable -> L24
            goto L5e
        L42:
            java.lang.String r1 = r5.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "读取宿主版本信息失败: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "DYHelper"
            p000.C0888ux.m5977(r3, r1, r5)
            iu1 r1 = new iu1
            r1.<init>(r0, r2, r2)
        L5e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "# DyLog 日志导出\n"
            r5.<init>(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "# 宿主包名: "
            r0.<init>(r2)
            java.lang.String r2 = r1.f5206
            r0.append(r2)
            java.lang.String r2 = "\n"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r5.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "# 宿主版本号: "
            r0.<init>(r3)
            java.lang.String r3 = r1.f5207
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r5.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "# 宿主版本码: "
            r0.<init>(r3)
            java.lang.String r1 = r1.f5208
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r5.append(r0)
            java.lang.String r0 = "# 模块包名: com.example.dyhelper\n# 模块版本号: 1.4.15\n# 模块版本码: 60\n"
            r5.append(r0)
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r3 = java.util.Locale.getDefault()
            r0.<init>(r1, r3)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "# 导出时间: "
            r1.<init>(r3)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r5.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "# 日志总数: "
            r0.<init>(r1)
            r0.append(r6)
            r0.append(r2)
            java.lang.String r6 = r0.toString()
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            return r5
    }

    /* JADX INFO: renamed from: π */
    public static android.widget.LinearLayout m1070(android.content.Context r14, java.lang.String r15, int r16, int r17, int r18, java.lang.String r19, java.lang.String r20, p000.a80 r21) {
            r0 = r16
            r1 = r18
            r2 = r19
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r14)
            r4 = 1
            r3.setOrientation(r4)
            r5 = 16
            int r6 = m1076(r14, r5)
            r7 = 13
            int r8 = m1076(r14, r7)
            int r9 = m1076(r14, r5)
            int r7 = m1076(r14, r7)
            r3.setPadding(r6, r8, r9, r7)
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r6.<init>(r14)
            r7 = 0
            r6.setOrientation(r7)
            r6.setGravity(r5)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r14)
            r5.setText(r15)
            r8 = 1096810496(0x41600000, float:14.0)
            r5.setTextSize(r8)
            qu1 r8 = p000.bv1.f1856
            java.lang.String r9 = "theme"
            r10 = 0
            if (r8 == 0) goto L156
            java.lang.String r8 = r8.f9122
            int r8 = android.graphics.Color.parseColor(r8)
            r5.setTextColor(r8)
            r5.setTypeface(r10, r4)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r11 = -2
            r12 = 1065353216(0x3f800000, float:1.0)
            r8.<init>(r7, r11, r12)
            r5.setLayoutParams(r8)
            r6.addView(r5)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r14)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            r5.setText(r8)
            r8 = 1094713344(0x41400000, float:12.0)
            r5.setTextSize(r8)
            qu1 r11 = p000.bv1.f1856
            if (r11 == 0) goto L152
            java.lang.String r11 = r11.f9133
            p000.lz1.m3699(r11, r5, r10, r4)
            r4 = 8
            int r11 = m1076(r14, r4)
            r12 = 3
            int r13 = m1076(r14, r12)
            int r4 = m1076(r14, r4)
            int r12 = m1076(r14, r12)
            r5.setPadding(r11, r13, r4, r12)
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            qu1 r11 = p000.bv1.f1856
            if (r11 == 0) goto L14e
            java.lang.String r11 = r11.f9134
            int r11 = android.graphics.Color.parseColor(r11)
            r4.setColor(r11)
            r11 = 9
            int r11 = m1076(r14, r11)
            float r11 = (float) r11
            r4.setCornerRadius(r11)
            r5.setBackground(r4)
            r6.addView(r5)
            r3.addView(r6)
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r14)
            r6 = r20
            r4.setText(r6)
            r4.setTextSize(r8)
            qu1 r6 = p000.bv1.f1856
            if (r6 == 0) goto L14a
            java.lang.String r6 = r6.f9124
            int r6 = android.graphics.Color.parseColor(r6)
            r4.setTextColor(r6)
            r6 = 5
            int r6 = m1076(r14, r6)
            r8 = 10
            int r8 = m1076(r14, r8)
            r4.setPadding(r7, r6, r7, r8)
            r3.addView(r4)
            android.widget.SeekBar r4 = new android.widget.SeekBar
            r4.<init>(r14)
            int r14 = r17 - r1
            r4.setMax(r14)
            int r0 = r0 - r1
            int r14 = p000.j81.m2906(r0, r7, r14)
            r4.setProgress(r14)
            qu1 r14 = p000.bv1.f1856
            if (r14 == 0) goto L146
            java.lang.String r14 = r14.f9133
            int r14 = android.graphics.Color.parseColor(r14)
            android.content.res.ColorStateList r14 = android.content.res.ColorStateList.valueOf(r14)
            r4.setProgressTintList(r14)
            qu1 r14 = p000.bv1.f1856
            if (r14 == 0) goto L142
            java.lang.String r14 = r14.f9119
            int r14 = android.graphics.Color.parseColor(r14)
            android.content.res.ColorStateList r14 = android.content.res.ColorStateList.valueOf(r14)
            r4.setProgressBackgroundTintList(r14)
            qu1 r14 = p000.bv1.f1856
            if (r14 == 0) goto L13e
            java.lang.String r14 = r14.f9133
            int r14 = android.graphics.Color.parseColor(r14)
            android.content.res.ColorStateList r14 = android.content.res.ColorStateList.valueOf(r14)
            r4.setThumbTintList(r14)
            ru1 r14 = new ru1
            r0 = r21
            r14.<init>(r1, r5, r2, r0)
            r4.setOnSeekBarChangeListener(r14)
            r3.addView(r4)
            return r3
        L13e:
            p000.ln0.m3650(r9)
            throw r10
        L142:
            p000.ln0.m3650(r9)
            throw r10
        L146:
            p000.ln0.m3650(r9)
            throw r10
        L14a:
            p000.ln0.m3650(r9)
            throw r10
        L14e:
            p000.ln0.m3650(r9)
            throw r10
        L152:
            p000.ln0.m3650(r9)
            throw r10
        L156:
            p000.ln0.m3650(r9)
            throw r10
    }

    /* JADX INFO: renamed from: ρ */
    public static final void m1071(android.app.Activity r20, p000.sm1 r21, java.util.List r22, android.widget.LinearLayout r23, android.view.View r24) {
            r1 = r20
            r2 = r21
            r4 = r23
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L1a1
            boolean r0 = r1.isDestroyed()
            if (r0 != 0) goto L1a1
            android.app.AlertDialog r0 = p000.bv1.f1854
            if (r0 != 0) goto L18
            goto L1a1
        L18:
            int r0 = r2.f9967
            int r0 = r0 + 4
            int r3 = r22.size()
            if (r0 <= r3) goto L23
            r0 = r3
        L23:
            int r3 = r2.f9967
            if (r3 >= r0) goto L185
            int r5 = r3 + 1
            r2.f9967 = r5
            r5 = r22
            java.lang.Object r3 = r5.get(r3)
            ou1 r3 = (p000.ou1) r3
            pu1 r6 = r3.f8259
            java.lang.String r12 = r3.f8260
            java.lang.String r13 = r3.f8261
            java.lang.String r14 = r3.f8262
            a80 r7 = r3.f8263
            java.lang.Object r7 = r7.invoke(r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            p80 r3 = r3.f8264
            pu1 r8 = p000.pu1.f8719
            if (r6 == r8) goto L17f
            java.lang.Object r3 = r3.invoke(r1)
            android.view.View r3 = (android.view.View) r3
            x01 r8 = p000.x01.f11964
            android.view.LayoutInflater r8 = r8.m6477(r1)
            r9 = 2131492954(0x7f0c005a, float:1.8609374E38)
            r10 = 0
            r11 = 0
            android.view.View r8 = r8.inflate(r9, r10, r11)
            r8.getClass()
            r15 = r8
            android.widget.LinearLayout r15 = (android.widget.LinearLayout) r15
            r8 = 2131296902(0x7f090286, float:1.8211734E38)
            android.view.View r8 = r15.findViewById(r8)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r9 = 2131296904(0x7f090288, float:1.8211738E38)
            android.view.View r9 = r15.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r11 = 2131296900(0x7f090284, float:1.821173E38)
            android.view.View r11 = r15.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r10 = 2131296899(0x7f090283, float:1.8211728E38)
            android.view.View r10 = r15.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r17 = r0
            r0 = 2131296901(0x7f090285, float:1.8211732E38)
            android.view.View r0 = r15.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r5 = r13.toUpperCase(r5)
            r5.getClass()
            r9.setText(r5)
            qu1 r5 = p000.bv1.f1856
            java.lang.String r18 = "theme"
            if (r5 == 0) goto L179
            java.lang.String r5 = r5.f9124
            r19 = r7
            r7 = 1
            r2 = 0
            p000.lz1.m3699(r5, r9, r2, r7)
            qu1 r2 = p000.bv1.f1856
            if (r2 == 0) goto L173
            java.lang.String r2 = r2.f9124
            int r2 = android.graphics.Color.parseColor(r2)
            r10.setTextColor(r2)
            r2 = 8
            if (r19 == 0) goto L104
            r5 = 0
            r11.setVisibility(r5)
            qu1 r9 = p000.bv1.f1856
            if (r9 == 0) goto Lfe
            java.lang.String r9 = r9.f9125
            int r9 = android.graphics.Color.parseColor(r9)
            r11.setTextColor(r9)
            r9 = 0
            r11.setTypeface(r9, r7)
            android.graphics.drawable.GradientDrawable r9 = new android.graphics.drawable.GradientDrawable
            r9.<init>()
            qu1 r5 = p000.bv1.f1856
            if (r5 == 0) goto Lf8
            java.lang.String r5 = r5.f9126
            int r5 = android.graphics.Color.parseColor(r5)
            r9.setColor(r5)
            r5 = 9
            int r5 = m1076(r1, r5)
            float r5 = (float) r5
            r9.setCornerRadius(r5)
            r11.setBackground(r9)
            goto L107
        Lf8:
            p000.ln0.m3650(r18)
            r16 = 0
            throw r16
        Lfe:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L104:
            r11.setVisibility(r2)
        L107:
            r0.removeAllViews()
            r0.addView(r3)
            java.lang.String r3 = "settings_section_expanded_"
            java.lang.String r3 = r3.concat(r12)
            boolean r3 = p000.ui1.m5887(r3, r7)
            if (r3 == 0) goto L11b
            r11 = 0
            goto L11c
        L11b:
            r11 = r2
        L11c:
            r0.setVisibility(r11)
            if (r3 == 0) goto L124
            r2 = 1119092736(0x42b40000, float:90.0)
            goto L125
        L124:
            r2 = 0
        L125:
            r10.setRotation(r2)
            r8.setClickable(r7)
            r8.setFocusable(r7)
            vj r7 = new vj
            r9 = r10
            r10 = r8
            r8 = 3
            r11 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            r10.setOnClickListener(r7)
            r0 = 1065101558(0x3f7c28f6, float:0.985)
            m1034(r10, r0)
            r4.addView(r15)
            nu1 r0 = new nu1
            java.lang.String r2 = " "
            java.lang.String r2 = p000.lz1.m3688(r13, r2, r14)
            r0.<init>(r6, r15, r2)
            java.util.ArrayList r2 = p000.bv1.f1859
            r2.add(r0)
            android.widget.TextView r0 = p000.bv1.f1864
            if (r0 == 0) goto L15d
            r4.removeView(r0)
            r4.addView(r0)
        L15d:
            r23.removeView(r24)
            r23.addView(r24)
            android.widget.LinearLayout r0 = p000.bv1.f1866
            if (r0 == 0) goto L16d
            r4.removeView(r0)
            r4.addView(r0)
        L16d:
            r2 = r21
            r0 = r17
            goto L23
        L173:
            p000.ln0.m3650(r18)
            r16 = 0
            throw r16
        L179:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L17f:
            java.lang.String r0 = "Failed requirement."
            p000.C1080.m7275(r0)
            return
        L185:
            m1078()
            r2 = r21
            int r0 = r2.f9967
            int r3 = r22.size()
            if (r0 >= r3) goto L1a1
            v8 r0 = new v8
            r6 = 6
            r3 = r22
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6)
            android.os.Handler r1 = p000.bv1.f1855
            r1.post(r0)
        L1a1:
            return
    }

    /* JADX INFO: renamed from: σ */
    public static android.widget.LinearLayout m1072(android.content.Context r2, p000.ys1 r3, java.lang.String r4) {
            android.widget.LinearLayout r0 = m1062(r2)
            java.util.List r3 = p000.AbstractC1021yh.m6896(r3)
            r1 = 0
            m1055(r0, r2, r3, r1)
            if (r4 == 0) goto L1b
            boolean r3 = p000.q02.m4671(r4)
            if (r3 == 0) goto L15
            goto L1b
        L15:
            m1056(r0, r2)
            m1057(r0, r2, r4)
        L1b:
            return r0
    }

    /* JADX INFO: renamed from: τ */
    public static android.widget.LinearLayout m1073(android.content.Context r7, java.lang.String r8, java.lang.String r9, boolean r10, p000.e80 r11) {
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r7)
            r1 = 0
            r0.setOrientation(r1)
            r2 = 16
            r0.setGravity(r2)
            int r2 = m1076(r7, r2)
            r3 = 13
            int r4 = m1076(r7, r3)
            r5 = 12
            int r5 = m1076(r7, r5)
            int r3 = m1076(r7, r3)
            r0.setPadding(r2, r4, r5, r3)
            r2 = 1
            r0.setClickable(r2)
            r0.setFocusable(r2)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r7)
            r3.setOrientation(r2)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r6 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r1, r5, r6)
            r3.setLayoutParams(r4)
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r7)
            r4.setText(r8)
            r8 = 1096810496(0x41600000, float:14.0)
            r4.setTextSize(r8)
            qu1 r8 = p000.bv1.f1856
            java.lang.String r5 = "theme"
            r6 = 0
            if (r8 == 0) goto L104
            java.lang.String r8 = r8.f9122
            p000.lz1.m3699(r8, r4, r6, r2)
            r3.addView(r4)
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r7)
            r8.setText(r9)
            r9 = 1094713344(0x41400000, float:12.0)
            r8.setTextSize(r9)
            qu1 r9 = p000.bv1.f1856
            if (r9 == 0) goto L100
            java.lang.String r9 = r9.f9124
            int r9 = android.graphics.Color.parseColor(r9)
            r8.setTextColor(r9)
            r9 = 3
            int r9 = m1076(r7, r9)
            r8.setPadding(r1, r9, r1, r1)
            r3.addView(r8)
            r0.addView(r3)
            android.widget.Switch r8 = new android.widget.Switch
            r8.<init>(r7)
            r8.setChecked(r10)
            r8.setShowText(r1)
            r9 = 48
            int r7 = m1076(r7, r9)
            r8.setMinWidth(r7)
            android.content.res.ColorStateList r7 = new android.content.res.ColorStateList
            r9 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r10 = new int[]{r9}
            int[] r2 = new int[r1]
            int[][] r10 = new int[][]{r10, r2}
            r2 = -1
            int[] r2 = new int[]{r2, r2}
            r7.<init>(r10, r2)
            r8.setThumbTintList(r7)
            android.content.res.ColorStateList r7 = new android.content.res.ColorStateList
            int[] r9 = new int[]{r9}
            int[] r10 = new int[r1]
            int[][] r9 = new int[][]{r9, r10}
            qu1 r10 = p000.bv1.f1856
            if (r10 == 0) goto Lfc
            java.lang.String r10 = r10.f9125
            int r10 = android.graphics.Color.parseColor(r10)
            qu1 r1 = p000.bv1.f1856
            if (r1 == 0) goto Lf8
            java.lang.String r1 = r1.f9138
            int r1 = android.graphics.Color.parseColor(r1)
            int[] r10 = new int[]{r10, r1}
            r7.<init>(r9, r10)
            r8.setTrackTintList(r7)
            ka0 r7 = new ka0
            r9 = 2
            r7.<init>(r11, r8, r9)
            r8.setOnCheckedChangeListener(r7)
            r0.addView(r8)
            l9 r7 = new l9
            r9 = 12
            r7.<init>(r0, r9, r8)
            r0.setOnClickListener(r7)
            r7 = 1065101558(0x3f7c28f6, float:0.985)
            m1034(r0, r7)
            return r0
        Lf8:
            p000.ln0.m3650(r5)
            throw r6
        Lfc:
            p000.ln0.m3650(r5)
            throw r6
        L100:
            p000.ln0.m3650(r5)
            throw r6
        L104:
            p000.ln0.m3650(r5)
            throw r6
    }

    /* JADX INFO: renamed from: υ */
    public static boolean m1074(android.content.Context r3, java.lang.String r4, boolean r5) {
            java.lang.String r0 = "volume_key_enabled"
            boolean r1 = r4.equals(r0)
            r2 = 1
            if (r1 == 0) goto Lb
            r0 = r5
            goto Lf
        Lb:
            boolean r0 = p000.ui1.m5887(r0, r2)
        Lf:
            java.lang.String r1 = "share_panel_enabled"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L18
            goto L1c
        L18:
            boolean r5 = p000.ui1.m5887(r1, r2)
        L1c:
            if (r0 != 0) goto L32
            if (r5 != 0) goto L32
            boolean r4 = m1033()
            if (r4 == 0) goto L27
            goto L32
        L27:
            java.lang.String r4 = "请至少保留音量键、分享菜单或手势模块菜单中的一个入口"
            r5 = 0
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r4, r5)
            r3.show()
            return r5
        L32:
            return r2
    }

    /* JADX INFO: renamed from: φ */
    public static java.lang.String m1075() {
            java.lang.String r0 = p000.ui1.m5890()
            boolean r1 = p000.q02.m4671(r0)
            if (r1 == 0) goto Le
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.AbstractC0976x9.f12071
            java.lang.String r0 = p000.AbstractC0976x9.f12078
        Le:
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: χ */
    public static int m1076(android.content.Context r1, int r2) {
            float r2 = (float) r2
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r0 = 1
            float r1 = android.util.TypedValue.applyDimension(r0, r2, r1)
            int r1 = (int) r1
            return r1
    }

    /* JADX INFO: renamed from: ψ */
    public static java.util.List m1077() {
            ku1 r0 = new ku1
            java.lang.String r1 = "作者头像"
            java.lang.String r2 = "隐藏右侧头像主模块；会连带影响头像区域附属能力"
            java.lang.String r3 = "avatar"
            r0.<init>(r3, r1, r2)
            ku1 r1 = new ku1
            java.lang.String r2 = "关注按钮"
            java.lang.String r3 = "仅过滤头像区域 Follow 扩展，不移除整个头像模块"
            java.lang.String r4 = "follow"
            r1.<init>(r4, r2, r3)
            ku1 r2 = new ku1
            java.lang.String r3 = "日常圆圈"
            java.lang.String r4 = "仅过滤头像区域 ColorRing 扩展"
            java.lang.String r5 = "color_ring"
            r2.<init>(r5, r3, r4)
            ku1 r3 = new ku1
            java.lang.String r4 = "点赞按钮"
            java.lang.String r5 = "过滤 FeedDiggModule"
            java.lang.String r6 = "digg"
            r3.<init>(r6, r4, r5)
            ku1 r4 = new ku1
            java.lang.String r5 = "评论按钮"
            java.lang.String r6 = "过滤 FeedCommentModule"
            java.lang.String r7 = "comment"
            r4.<init>(r7, r5, r6)
            ku1 r5 = new ku1
            java.lang.String r6 = "收藏按钮"
            java.lang.String r7 = "过滤 FeedCollectModule"
            java.lang.String r8 = "collect"
            r5.<init>(r8, r6, r7)
            ku1 r6 = new ku1
            java.lang.String r7 = "分享按钮"
            java.lang.String r8 = "过滤 FeedShareModule"
            java.lang.String r9 = "share"
            r6.<init>(r9, r7, r8)
            ku1[] r0 = new p000.ku1[]{r0, r1, r2, r3, r4, r5, r6}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            return r0
    }

    /* JADX INFO: renamed from: ω */
    public static void m1078() {
            java.lang.String r0 = p000.bv1.f1858
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            r0.getClass()
            int r1 = r0.length()
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto L15
            r1 = r3
            goto L16
        L15:
            r1 = r2
        L16:
            java.util.ArrayList r4 = p000.bv1.f1859
            java.util.Iterator r4 = r4.iterator()
            r5 = r2
        L1d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L53
            java.lang.Object r6 = r4.next()
            nu1 r6 = (p000.nu1) r6
            if (r1 == 0) goto L3b
            java.lang.String r7 = r6.f7757
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r8)
            r7.getClass()
            boolean r7 = p000.q02.m4654(r7, r0, r2)
            goto L49
        L3b:
            pu1 r7 = p000.bv1.f1857
            pu1 r8 = p000.pu1.f8719
            if (r7 != r8) goto L43
        L41:
            r7 = r3
            goto L49
        L43:
            pu1 r8 = r6.f7755
            if (r8 != r7) goto L48
            goto L41
        L48:
            r7 = r2
        L49:
            android.widget.LinearLayout r6 = r6.f7756
            m1059(r6, r7)
            if (r7 == 0) goto L1d
            int r5 = r5 + 1
            goto L1d
        L53:
            android.widget.LinearLayout r0 = p000.bv1.f1865
            if (r5 != 0) goto L58
            r2 = r3
        L58:
            m1059(r0, r2)
            return
    }

    /* JADX INFO: renamed from: а */
    public static void m1079(android.content.Context r11) {
            pu1[] r0 = p000.pu1.values()
            java.util.ArrayList r1 = p000.bv1.f1860
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lbf
            java.lang.Object r4 = r1.next()
            int r5 = r3 + 1
            r6 = 0
            if (r3 < 0) goto Lbb
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3 = r0[r3]
            pu1 r7 = p000.bv1.f1857
            r8 = 1
            if (r3 != r7) goto L26
            r3 = r8
            goto L27
        L26:
            r3 = r2
        L27:
            java.lang.String r7 = "theme"
            if (r3 == 0) goto L3a
            qu1 r9 = p000.bv1.f1856
            if (r9 == 0) goto L36
            java.lang.String r9 = r9.f9122
            int r9 = android.graphics.Color.parseColor(r9)
            goto L44
        L36:
            p000.ln0.m3650(r7)
            throw r6
        L3a:
            qu1 r9 = p000.bv1.f1856
            if (r9 == 0) goto Lb7
            java.lang.String r9 = r9.f9123
            int r9 = android.graphics.Color.parseColor(r9)
        L44:
            r4.setTextColor(r9)
            r4.setTypeface(r6, r3)
            android.graphics.drawable.GradientDrawable r9 = new android.graphics.drawable.GradientDrawable
            r9.<init>()
            if (r3 == 0) goto L60
            qu1 r10 = p000.bv1.f1856
            if (r10 == 0) goto L5c
            java.lang.String r10 = r10.f9118
            int r10 = android.graphics.Color.parseColor(r10)
            goto L61
        L5c:
            p000.ln0.m3650(r7)
            throw r6
        L60:
            r10 = r2
        L61:
            r9.setColor(r10)
            r10 = 10
            int r10 = m1076(r11, r10)
            float r10 = (float) r10
            r9.setCornerRadius(r10)
            if (r3 == 0) goto L86
            int r8 = m1076(r11, r8)
            qu1 r10 = p000.bv1.f1856
            if (r10 == 0) goto L82
            java.lang.String r6 = r10.f9136
            int r6 = android.graphics.Color.parseColor(r6)
            r9.setStroke(r8, r6)
            goto L86
        L82:
            p000.ln0.m3650(r7)
            throw r6
        L86:
            r4.setBackground(r9)
            android.view.ViewPropertyAnimator r4 = r4.animate()
            r6 = 1065017672(0x3f7ae148, float:0.98)
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L96
            r8 = r7
            goto L97
        L96:
            r8 = r6
        L97:
            android.view.ViewPropertyAnimator r4 = r4.scaleX(r8)
            if (r3 == 0) goto L9e
            r6 = r7
        L9e:
            android.view.ViewPropertyAnimator r3 = r4.scaleY(r6)
            r6 = 220(0xdc, double:1.087E-321)
            android.view.ViewPropertyAnimator r3 = r3.setDuration(r6)
            android.view.animation.DecelerateInterpolator r4 = new android.view.animation.DecelerateInterpolator
            r4.<init>()
            android.view.ViewPropertyAnimator r3 = r3.setInterpolator(r4)
            r3.start()
            r3 = r5
            goto Lc
        Lb7:
            p000.ln0.m3650(r7)
            throw r6
        Lbb:
            p000.AbstractC1021yh.m6917()
            throw r6
        Lbf:
            return
    }

    /* JADX INFO: renamed from: Ψ */
    public final void m1080(android.app.Activity r20) {
            r19 = this;
            r0 = r20
            android.content.res.Resources r1 = r0.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.uiMode
            r1 = r1 & 48
            r2 = 32
            r3 = 0
            if (r1 != r2) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = r3
        L16:
            qu1 r2 = new qu1
            r2.<init>(r1)
            p000.bv1.f1856 = r2
            java.util.ArrayList r1 = p000.bv1.f1859
            r1.clear()
            java.util.ArrayList r2 = p000.bv1.f1860
            r2.clear()
            java.util.ArrayList r5 = p000.bv1.f1861
            r5.clear()
            pu1 r5 = p000.pu1.f8719
            p000.bv1.f1857 = r5
            java.lang.String r5 = ""
            p000.bv1.f1858 = r5
            r5 = 0
            p000.bv1.f1863 = r5
            p000.bv1.f1864 = r5
            p000.bv1.f1865 = r5
            p000.bv1.f1866 = r5
            x01 r6 = p000.x01.f11964
            android.view.LayoutInflater r6 = r6.m6477(r0)
            r7 = 2131492920(0x7f0c0038, float:1.8609306E38)
            android.view.View r6 = r6.inflate(r7, r5, r3)
            r6.getClass()
            r7 = 2131296910(0x7f09028e, float:1.821175E38)
            android.view.View r7 = r6.findViewById(r7)
            r8 = 2131296922(0x7f09029a, float:1.8211774E38)
            android.view.View r8 = r6.findViewById(r8)
            r9 = 2131296927(0x7f09029f, float:1.8211784E38)
            android.view.View r9 = r6.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10 = 2131296926(0x7f09029e, float:1.8211782E38)
            android.view.View r10 = r6.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r11 = 2131296924(0x7f09029c, float:1.8211778E38)
            android.view.View r11 = r6.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r12 = 2131296913(0x7f090291, float:1.8211756E38)
            android.view.View r12 = r6.findViewById(r12)
            r13 = 2131296912(0x7f090290, float:1.8211754E38)
            android.view.View r13 = r6.findViewById(r13)
            r14 = 2131296925(0x7f09029d, float:1.821178E38)
            android.view.View r14 = r6.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r15 = 2131296909(0x7f09028d, float:1.8211748E38)
            android.view.View r15 = r6.findViewById(r15)
            android.widget.EditText r15 = (android.widget.EditText) r15
            r3 = 2131296923(0x7f09029b, float:1.8211776E38)
            android.view.View r3 = r6.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 2131296921(0x7f090299, float:1.8211772E38)
            android.view.View r4 = r6.findViewById(r4)
            r5 = 2131296917(0x7f090295, float:1.8211764E38)
            android.view.View r5 = r6.findViewById(r5)
            r17 = r1
            qu1 r1 = p000.bv1.f1856
            java.lang.String r18 = "theme"
            if (r1 == 0) goto L763
            java.lang.String r1 = r1.f9116
            int r1 = android.graphics.Color.parseColor(r1)
            r7.setBackgroundColor(r1)
            qu1 r1 = p000.bv1.f1856
            if (r1 == 0) goto L75d
            java.lang.String r1 = r1.f9116
            int r1 = android.graphics.Color.parseColor(r1)
            r8.setBackgroundColor(r1)
            qu1 r1 = p000.bv1.f1856
            if (r1 == 0) goto L757
            java.lang.String r1 = r1.f9116
            int r1 = android.graphics.Color.parseColor(r1)
            r12.setBackgroundColor(r1)
            qu1 r1 = p000.bv1.f1856
            if (r1 == 0) goto L751
            java.lang.String r1 = r1.f9116
            int r1 = android.graphics.Color.parseColor(r1)
            r4.setBackgroundColor(r1)
            qu1 r1 = p000.bv1.f1856
            if (r1 == 0) goto L74b
            java.lang.String r1 = r1.f9122
            r4 = 1
            r7 = 0
            p000.lz1.m3699(r1, r9, r7, r4)
            qu1 r1 = p000.bv1.f1856
            if (r1 == 0) goto L745
            java.lang.String r1 = r1.f9124
            int r1 = android.graphics.Color.parseColor(r1)
            r10.setTextColor(r1)
            qu1 r1 = p000.bv1.f1856
            if (r1 == 0) goto L73f
            java.lang.String r1 = r1.f9123
            int r1 = android.graphics.Color.parseColor(r1)
            r11.setTextColor(r1)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            qu1 r4 = p000.bv1.f1856
            if (r4 == 0) goto L739
            java.lang.String r4 = r4.f9119
            int r4 = android.graphics.Color.parseColor(r4)
            r1.setColor(r4)
            r4 = 1
            r1.setShape(r4)
            r11.setBackground(r1)
            pa r1 = new pa
            r4 = 6
            r1.<init>(r4)
            r11.setOnClickListener(r1)
            r1 = 1063675494(0x3f666666, float:0.9)
            m1034(r11, r1)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            qu1 r7 = p000.bv1.f1856
            if (r7 == 0) goto L733
            java.lang.String r7 = r7.f9119
            int r7 = android.graphics.Color.parseColor(r7)
            r1.setColor(r7)
            r7 = 14
            int r8 = m1076(r0, r7)
            float r8 = (float) r8
            r1.setCornerRadius(r8)
            r13.setBackground(r1)
            qu1 r1 = p000.bv1.f1856
            if (r1 == 0) goto L72d
            java.lang.String r1 = r1.f9124
            int r1 = android.graphics.Color.parseColor(r1)
            r14.setTextColor(r1)
            qu1 r1 = p000.bv1.f1856
            if (r1 == 0) goto L727
            java.lang.String r1 = r1.f9124
            int r1 = android.graphics.Color.parseColor(r1)
            r15.setHintTextColor(r1)
            qu1 r1 = p000.bv1.f1856
            if (r1 == 0) goto L721
            java.lang.String r1 = r1.f9122
            int r1 = android.graphics.Color.parseColor(r1)
            r15.setTextColor(r1)
            r1 = 1
            r15.setEnabled(r1)
            r15.setClickable(r1)
            r15.setFocusable(r1)
            r15.setFocusableInTouchMode(r1)
            r15.setCursorVisible(r1)
            r15.setInputType(r1)
            r8 = 3
            r15.setImeOptions(r8)
            r15.setSingleLine(r1)
            su r9 = new su
            r9.<init>(r0, r15, r8)
            r15.setOnClickListener(r9)
            tu r8 = new tu
            r8.<init>(r0, r15)
            r15.setOnTouchListener(r8)
            r13.setClickable(r1)
            su r8 = new su
            r9 = 4
            r8.<init>(r0, r15, r9)
            r13.setOnClickListener(r8)
            r12.setClickable(r1)
            su r8 = new su
            r10 = 5
            r8.<init>(r0, r15, r10)
            r12.setOnClickListener(r8)
            r14.setClickable(r1)
            su r1 = new su
            r1.<init>(r0, r15, r4)
            r14.setOnClickListener(r1)
            qu1 r1 = p000.bv1.f1856
            if (r1 == 0) goto L71b
            java.lang.String r1 = r1.f9116
            int r1 = android.graphics.Color.parseColor(r1)
            r3.setTextColor(r1)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            qu1 r8 = p000.bv1.f1856
            if (r8 == 0) goto L715
            java.lang.String r8 = r8.f9124
            int r8 = android.graphics.Color.parseColor(r8)
            r1.setColor(r8)
            r8 = 1
            r1.setShape(r8)
            r3.setBackground(r1)
            fu1 r1 = new fu1
            r8 = 0
            r1.<init>(r15, r8)
            r3.setOnClickListener(r1)
            md0 r1 = new md0
            r1.<init>(r9, r3)
            r15.addTextChangedListener(r1)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            qu1 r3 = p000.bv1.f1856
            if (r3 == 0) goto L70f
            java.lang.String r3 = r3.f9137
            int r3 = android.graphics.Color.parseColor(r3)
            r1.setColor(r3)
            r3 = 12
            int r8 = m1076(r0, r3)
            float r8 = (float) r8
            r1.setCornerRadius(r8)
            r5.setBackground(r1)
            r2.clear()
            r1 = 2131296914(0x7f090292, float:1.8211758E38)
            android.view.View r1 = r6.findViewById(r1)
            r1.getClass()
            r2.add(r1)
            r1 = 2131296920(0x7f090298, float:1.821177E38)
            android.view.View r1 = r6.findViewById(r1)
            r1.getClass()
            r2.add(r1)
            r1 = 2131296916(0x7f090294, float:1.8211762E38)
            android.view.View r1 = r6.findViewById(r1)
            r1.getClass()
            r2.add(r1)
            r1 = 2131296915(0x7f090293, float:1.821176E38)
            android.view.View r1 = r6.findViewById(r1)
            r1.getClass()
            r2.add(r1)
            r1 = 2131296919(0x7f090297, float:1.8211768E38)
            android.view.View r1 = r6.findViewById(r1)
            r1.getClass()
            r2.add(r1)
            r1 = 2131296918(0x7f090296, float:1.8211766E38)
            android.view.View r1 = r6.findViewById(r1)
            r1.getClass()
            r2.add(r1)
            pu1[] r1 = p000.pu1.values()
            java.util.Iterator r2 = r2.iterator()
            r5 = 0
        L275:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L2a6
            java.lang.Object r8 = r2.next()
            int r9 = r5 + 1
            if (r5 < 0) goto L2a0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r5 = r1[r5]
            r10 = 1
            r8.setClickable(r10)
            r8.setFocusable(r10)
            c9 r10 = new c9
            r11 = 15
            r10.<init>(r5, r8, r0, r11)
            r8.setOnClickListener(r10)
            r5 = 1064682127(0x3f75c28f, float:0.96)
            m1034(r8, r5)
            r5 = r9
            goto L275
        L2a0:
            p000.AbstractC1021yh.m6917()
            r16 = 0
            throw r16
        L2a6:
            m1079(r0)
            r1 = 2131296908(0x7f09028c, float:1.8211746E38)
            android.view.View r1 = r6.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r2 = 2131296911(0x7f09028f, float:1.8211752E38)
            android.view.View r2 = r6.findViewById(r2)
            android.widget.ScrollView r2 = (android.widget.ScrollView) r2
            p000.bv1.f1862 = r2
            p000.bv1.f1863 = r1
            r1.removeAllViews()
            boolean r2 = p000.ui1.m5867()
            java.lang.String r5 = m1075()
            r16 = 0
            boolean r8 = p000.i81.m2670(r16)
            if (r2 != 0) goto L2dd
            qu1 r9 = p000.bv1.f1856
            if (r9 == 0) goto L2d9
            java.lang.String r9 = r9.f9130
            goto L2f0
        L2d9:
            p000.ln0.m3650(r18)
            throw r16
        L2dd:
            if (r8 == 0) goto L2ea
            qu1 r9 = p000.bv1.f1856
            if (r9 == 0) goto L2e6
            java.lang.String r9 = r9.f9126
            goto L2f0
        L2e6:
            p000.ln0.m3650(r18)
            throw r16
        L2ea:
            qu1 r9 = p000.bv1.f1856
            if (r9 == 0) goto L70b
            java.lang.String r9 = r9.f9128
        L2f0:
            if (r2 != 0) goto L2fd
            qu1 r10 = p000.bv1.f1856
            if (r10 == 0) goto L2f9
            java.lang.String r10 = r10.f9129
            goto L310
        L2f9:
            p000.ln0.m3650(r18)
            throw r16
        L2fd:
            if (r8 == 0) goto L30a
            qu1 r10 = p000.bv1.f1856
            if (r10 == 0) goto L306
            java.lang.String r10 = r10.f9125
            goto L310
        L306:
            p000.ln0.m3650(r18)
            throw r16
        L30a:
            qu1 r10 = p000.bv1.f1856
            if (r10 == 0) goto L705
            java.lang.String r10 = r10.f9127
        L310:
            if (r2 != 0) goto L315
            java.lang.String r5 = "配置未初始化，部分项目可能无法保存"
            goto L32f
        L315:
            boolean r11 = p000.q02.m4671(r5)
            if (r11 == 0) goto L31e
            java.lang.String r5 = "配置已就绪，暂未检测到当前账号"
            goto L32f
        L31e:
            java.lang.String r11 = "配置已就绪 · 当前账号 "
            if (r8 == 0) goto L329
            java.lang.String r12 = " · 内测已通过"
            java.lang.String r5 = p000.lz1.m3674(r11, r5, r12)
            goto L32f
        L329:
            java.lang.String r12 = " · 非内测状态"
            java.lang.String r5 = p000.lz1.m3674(r11, r5, r12)
        L32f:
            android.widget.LinearLayout r11 = new android.widget.LinearLayout
            r11.<init>(r0)
            r12 = 0
            r11.setOrientation(r12)
            r12 = 16
            r11.setGravity(r12)
            int r13 = m1076(r0, r7)
            r14 = 10
            int r15 = m1076(r0, r14)
            int r4 = m1076(r0, r7)
            int r12 = m1076(r0, r14)
            r11.setPadding(r13, r15, r4, r12)
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            int r9 = android.graphics.Color.parseColor(r9)
            r4.setColor(r9)
            int r9 = m1076(r0, r7)
            float r9 = (float) r9
            r4.setCornerRadius(r9)
            r11.setBackground(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r9 = -1
            r12 = -2
            r4.<init>(r9, r12)
            int r13 = m1076(r0, r3)
            r4.bottomMargin = r13
            r11.setLayoutParams(r4)
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r0)
            if (r2 != 0) goto L383
            java.lang.String r2 = "!"
            goto L38a
        L383:
            if (r8 == 0) goto L388
            java.lang.String r2 = "β"
            goto L38a
        L388:
            java.lang.String r2 = "i"
        L38a:
            r4.setText(r2)
            r2 = 1095761920(0x41500000, float:13.0)
            r4.setTextSize(r2)
            int r8 = android.graphics.Color.parseColor(r10)
            r4.setTextColor(r8)
            r8 = 17
            r4.setGravity(r8)
            r13 = 1
            r15 = 0
            r4.setTypeface(r15, r13)
            android.graphics.drawable.GradientDrawable r15 = new android.graphics.drawable.GradientDrawable
            r15.<init>()
            qu1 r2 = p000.bv1.f1856
            if (r2 == 0) goto L6ff
            java.lang.String r2 = r2.f9117
            int r2 = android.graphics.Color.parseColor(r2)
            r15.setColor(r2)
            r15.setShape(r13)
            r4.setBackground(r15)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r13 = 24
            int r15 = m1076(r0, r13)
            int r13 = m1076(r0, r13)
            r2.<init>(r15, r13)
            r4.setLayoutParams(r2)
            r11.addView(r4)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r0)
            r2.setText(r5)
            r4 = 1094713344(0x41400000, float:12.0)
            r2.setTextSize(r4)
            int r5 = android.graphics.Color.parseColor(r10)
            r2.setTextColor(r5)
            int r5 = m1076(r0, r14)
            r10 = 0
            r2.setPadding(r5, r10, r10, r10)
            r13 = 1
            r2.setMaxLines(r13)
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
            r2.setEllipsize(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r13 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r10, r12, r13)
            r2.setLayoutParams(r5)
            r11.addView(r2)
            r1.addView(r11)
            java.lang.String r2 = "部分设置需要切换页面或重启抖音后生效"
            android.widget.TextView r2 = m1065(r0, r2)
            p000.bv1.f1864 = r2
            r1.addView(r2)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r0)
            r10 = 1
            r2.setOrientation(r10)
            r2.setGravity(r8)
            r5 = 8
            r2.setVisibility(r5)
            r10 = 18
            int r11 = m1076(r0, r10)
            r14 = 28
            int r15 = m1076(r0, r14)
            int r13 = m1076(r0, r10)
            int r14 = m1076(r0, r14)
            r2.setPadding(r11, r15, r13, r14)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r11.<init>(r9, r12)
            r13 = 16
            int r14 = m1076(r0, r13)
            r11.bottomMargin = r14
            r2.setLayoutParams(r11)
            android.graphics.drawable.GradientDrawable r11 = new android.graphics.drawable.GradientDrawable
            r11.<init>()
            qu1 r13 = p000.bv1.f1856
            if (r13 == 0) goto L6f9
            java.lang.String r13 = r13.f9117
            int r13 = android.graphics.Color.parseColor(r13)
            r11.setColor(r13)
            int r7 = m1076(r0, r7)
            float r7 = (float) r7
            r11.setCornerRadius(r7)
            r13 = 1
            int r7 = m1076(r0, r13)
            qu1 r13 = p000.bv1.f1856
            if (r13 == 0) goto L6f3
            java.lang.String r13 = r13.f9136
            int r13 = android.graphics.Color.parseColor(r13)
            r11.setStroke(r7, r13)
            r2.setBackground(r11)
            android.widget.TextView r7 = new android.widget.TextView
            r7.<init>(r0)
            java.lang.String r11 = "未找到匹配项"
            r7.setText(r11)
            r11 = 1098907648(0x41800000, float:16.0)
            r7.setTextSize(r11)
            r13 = 1
            r15 = 0
            r7.setTypeface(r15, r13)
            qu1 r11 = p000.bv1.f1856
            if (r11 == 0) goto L6ed
            java.lang.String r11 = r11.f9122
            int r11 = android.graphics.Color.parseColor(r11)
            r7.setTextColor(r11)
            r7.setGravity(r8)
            r2.addView(r7)
            java.lang.String r7 = "换个关键词，或切回“全部”分类看看"
            android.widget.TextView r4 = p000.lz1.m3683(r0, r7, r4)
            qu1 r7 = p000.bv1.f1856
            if (r7 == 0) goto L6e7
            java.lang.String r7 = r7.f9124
            int r7 = android.graphics.Color.parseColor(r7)
            r4.setTextColor(r7)
            r4.setGravity(r8)
            r7 = 6
            int r7 = m1076(r0, r7)
            r11 = 0
            r4.setPadding(r11, r7, r11, r11)
            r2.addView(r4)
            p000.bv1.f1865 = r2
            r1.addView(r2)
            java.lang.String r2 = "settings_group_link_dismissed"
            boolean r2 = p000.ui1.m5887(r2, r11)
            r4 = 2
            r7 = 1065101558(0x3f7c28f6, float:0.985)
            if (r2 != 0) goto L62f
            java.lang.String r2 = "https://t.me/MFDYHelper"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.widget.LinearLayout r13 = new android.widget.LinearLayout
            r13.<init>(r0)
            r13.setOrientation(r11)
            r11 = 16
            r13.setGravity(r11)
            int r14 = m1076(r0, r11)
            int r11 = m1076(r0, r3)
            int r15 = m1076(r0, r5)
            int r10 = m1076(r0, r3)
            r13.setPadding(r14, r11, r15, r10)
            r10 = 1
            r13.setClickable(r10)
            r13.setFocusable(r10)
            qu1 r10 = p000.bv1.f1856
            if (r10 == 0) goto L629
            java.lang.String r10 = r10.f9135
            int r10 = android.graphics.Color.parseColor(r10)
            android.content.res.ColorStateList r10 = android.content.res.ColorStateList.valueOf(r10)
            android.graphics.drawable.GradientDrawable r11 = new android.graphics.drawable.GradientDrawable
            r11.<init>()
            qu1 r14 = p000.bv1.f1856
            if (r14 == 0) goto L623
            java.lang.String r14 = r14.f9117
            int r14 = android.graphics.Color.parseColor(r14)
            r11.setColor(r14)
            int r14 = m1076(r0, r5)
            float r14 = (float) r14
            r11.setCornerRadius(r14)
            r14 = 1
            int r15 = m1076(r0, r14)
            qu1 r14 = p000.bv1.f1856
            if (r14 == 0) goto L61d
            java.lang.String r14 = r14.f9136
            int r14 = android.graphics.Color.parseColor(r14)
            r11.setStroke(r15, r14)
            android.graphics.drawable.RippleDrawable r14 = new android.graphics.drawable.RippleDrawable
            r15 = 0
            r14.<init>(r10, r11, r15)
            r13.setBackground(r14)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r9, r12)
            int r3 = m1076(r0, r3)
            r10.topMargin = r3
            r11 = 16
            int r3 = m1076(r0, r11)
            r10.bottomMargin = r3
            r13.setLayoutParams(r10)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r0)
            java.lang.String r10 = "DYHelper群组https://t.me/MFDYHelper"
            r3.setText(r10)
            r10 = 1095761920(0x41500000, float:13.0)
            r3.setTextSize(r10)
            qu1 r10 = p000.bv1.f1856
            if (r10 == 0) goto L617
            java.lang.String r10 = r10.f9133
            int r10 = android.graphics.Color.parseColor(r10)
            r3.setTextColor(r10)
            r10 = 1
            r15 = 0
            r3.setTypeface(r15, r10)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r11 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            r10.<init>(r14, r12, r11)
            r3.setLayoutParams(r10)
            r13.addView(r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r0)
            java.lang.String r10 = "×"
            r3.setText(r10)
            r10 = 1102053376(0x41b00000, float:22.0)
            r3.setTextSize(r10)
            r3.setGravity(r8)
            java.lang.String r8 = "关闭群组提示"
            r3.setContentDescription(r8)
            qu1 r8 = p000.bv1.f1856
            if (r8 == 0) goto L611
            java.lang.String r8 = r8.f9124
            int r8 = android.graphics.Color.parseColor(r8)
            r3.setTextColor(r8)
            r10 = 1
            r3.setClickable(r10)
            r3.setFocusable(r10)
            r8 = 40
            int r10 = m1076(r0, r8)
            r3.setMinWidth(r10)
            int r8 = m1076(r0, r8)
            r3.setMinHeight(r8)
            qu1 r8 = p000.bv1.f1856
            if (r8 == 0) goto L60b
            java.lang.String r8 = r8.f9135
            int r8 = android.graphics.Color.parseColor(r8)
            android.content.res.ColorStateList r8 = android.content.res.ColorStateList.valueOf(r8)
            android.graphics.drawable.GradientDrawable r10 = new android.graphics.drawable.GradientDrawable
            r10.<init>()
            r14 = 0
            r10.setColor(r14)
            r14 = 1
            r10.setShape(r14)
            android.graphics.drawable.RippleDrawable r11 = new android.graphics.drawable.RippleDrawable
            r15 = 0
            r11.<init>(r8, r10, r15)
            r3.setBackground(r11)
            xs r8 = new xs
            r8.<init>(r13, r4)
            r3.setOnClickListener(r8)
            r13.addView(r3)
            l9 r3 = new l9
            r8 = 13
            r3.<init>(r0, r8, r2)
            r13.setOnClickListener(r3)
            t61 r2 = new t61
            r2.<init>(r4, r0)
            r13.setOnLongClickListener(r2)
            m1034(r13, r7)
            p000.bv1.f1866 = r13
            r1.addView(r13)
            goto L62f
        L60b:
            p000.ln0.m3650(r18)
            r16 = 0
            throw r16
        L611:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L617:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L61d:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L623:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L629:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L62f:
            java.util.Iterator r1 = r17.iterator()
        L633:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L646
            java.lang.Object r2 = r1.next()
            nu1 r2 = (p000.nu1) r2
            android.widget.LinearLayout r2 = r2.f7756
            r14 = 0
            r2.setVisibility(r14)
            goto L633
        L646:
            android.widget.LinearLayout r1 = p000.bv1.f1865
            if (r1 == 0) goto L64d
            r1.setVisibility(r5)
        L64d:
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r0)
            android.app.AlertDialog$Builder r1 = r1.setView(r6)
            r10 = 1
            android.app.AlertDialog$Builder r1 = r1.setCancelable(r10)
            android.app.AlertDialog r1 = r1.create()
            android.view.Window r2 = r1.getWindow()
            if (r2 == 0) goto L674
            r3 = 17170445(0x106000d, float:2.461195E-38)
            r2.setBackgroundDrawableResource(r3)
            r3 = 1057803469(0x3f0ccccd, float:0.55)
            r2.setDimAmount(r3)
            r2.addFlags(r4)
        L674:
            r6.setTag(r1)
            p000.bv1.f1854 = r1
            z90 r2 = new z90
            r10 = 1
            r2.<init>(r10)
            r1.setOnDismissListener(r2)
            r1.show()
            android.view.Window r1 = r1.getWindow()
            if (r1 == 0) goto L699
            r2 = 131080(0x20008, float:1.83682E-40)
            r1.clearFlags(r2)
            r11 = 16
            r1.setSoftInputMode(r11)
            r1.setLayout(r9, r9)
        L699:
            r1 = 0
            r6.setAlpha(r1)
            android.content.Context r2 = r6.getContext()
            r2.getClass()
            r3 = 18
            int r2 = m1076(r2, r3)
            float r2 = (float) r2
            r6.setTranslationY(r2)
            r6.setScaleX(r7)
            r6.setScaleY(r7)
            android.view.ViewPropertyAnimator r2 = r6.animate()
            r11 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r2 = r2.alpha(r11)
            android.view.ViewPropertyAnimator r1 = r2.translationY(r1)
            android.view.ViewPropertyAnimator r1 = r1.scaleX(r11)
            android.view.ViewPropertyAnimator r1 = r1.scaleY(r11)
            r2 = 280(0x118, double:1.383E-321)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r2)
            android.view.animation.DecelerateInterpolator r2 = new android.view.animation.DecelerateInterpolator
            r2.<init>()
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r2)
            r1.start()
            hg1 r1 = new hg1
            r2 = 9
            r1.<init>(r0, r2)
            r6.post(r1)
            return
        L6e7:
            p000.ln0.m3650(r18)
            r16 = 0
            throw r16
        L6ed:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L6f3:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L6f9:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L6ff:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L705:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L70b:
            p000.ln0.m3650(r18)
            throw r16
        L70f:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L715:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L71b:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L721:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L727:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L72d:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L733:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L739:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L73f:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L745:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L74b:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L751:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L757:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L75d:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
        L763:
            r16 = 0
            p000.ln0.m3650(r18)
            throw r16
    }
}
