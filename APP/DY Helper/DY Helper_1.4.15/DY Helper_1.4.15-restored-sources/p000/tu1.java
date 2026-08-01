package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tu1 extends p000.p80 implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f10464;

    public /* synthetic */ tu1(int r1, java.lang.Object r2, java.lang.Class r3, java.lang.String r4, java.lang.String r5, int r6, int r7) {
            r0 = this;
            r0.f10464 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    /* JADX INFO: renamed from: β */
    private final java.lang.Object m5747(java.lang.Object r10) {
            r9 = this;
            r1 = r10
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r9 = r9.receiver
            bv1 r9 = (p000.bv1) r9
            bv1 r10 = p000.bv1.f1853
            r9.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r1)
            boolean r9 = p000.i81.m2670(r1)
            if (r9 != 0) goto L20
            java.lang.String r9 = "顶栏 TAB 过滤是内测功能，需要内测资格才能使用"
            android.widget.LinearLayout r9 = p000.bv1.m1061(r1, r9)
            return r9
        L20:
            java.lang.String r9 = "toptab_discovered_tabs"
            java.lang.String r10 = "[]"
            java.lang.String r9 = p000.ui1.m5893(r9, r10)
            r10 = 0
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L5b
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L5b
            int r9 = r2.length()     // Catch: java.lang.Throwable -> L5b
            xm0 r9 = p000.j81.m2893(r10, r9)     // Catch: java.lang.Throwable -> L5b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5b
            r4 = 10
            int r4 = p000.AbstractC1021yh.m6889(r9, r4)     // Catch: java.lang.Throwable -> L5b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5b
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L5b
        L45:
            r4 = r9
            wm0 r4 = (p000.wm0) r4     // Catch: java.lang.Throwable -> L5b
            boolean r4 = r4.f11765     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L5d
            r4 = r9
            wm0 r4 = (p000.wm0) r4     // Catch: java.lang.Throwable -> L5b
            int r4 = r4.nextInt()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = r2.getString(r4)     // Catch: java.lang.Throwable -> L5b
            r3.add(r4)     // Catch: java.lang.Throwable -> L5b
            goto L45
        L5b:
            jz r3 = p000.C0450jz.f5672
        L5d:
            boolean r9 = r3.isEmpty()
            if (r9 == 0) goto L72
            java.lang.String r9 = "尚未扫描到顶栏 Tab，请先打开抖音首页等待自动扫描"
            p000.bv1.m1057(r0, r1, r9)
            p000.bv1.m1056(r0, r1)
            java.lang.String r9 = "扫描完成后重新打开此设置面板即可看到选项"
            p000.bv1.m1057(r0, r1, r9)
            goto L114
        L72:
            int r9 = r3.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "已自动扫描到 "
            r2.<init>(r4)
            r2.append(r9)
            java.lang.String r9 = " 个顶栏 Tab（「推荐」始终保留不可隐藏）"
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            p000.bv1.m1057(r0, r1, r9)
            p000.bv1.m1056(r0, r1)
            java.util.Iterator r9 = r3.iterator()
            r2 = r10
        L94:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto Ld6
            java.lang.Object r3 = r9.next()
            int r6 = r2 + 1
            if (r2 < 0) goto Ld1
            java.lang.String r3 = (java.lang.String) r3
            if (r2 <= 0) goto La9
            p000.bv1.m1056(r0, r1)
        La9:
            java.lang.String r2 = "toptab_hide_"
            java.lang.String r2 = p000.lz1.m3687(r2, r3)
            java.lang.String r4 = "隐藏「"
            java.lang.String r5 = "」"
            java.lang.String r4 = p000.lz1.m3674(r4, r3, r5)
            java.lang.String r5 = "移除顶栏的 "
            java.lang.String r7 = " 标签"
            java.lang.String r3 = p000.lz1.m3674(r5, r3, r7)
            r5 = r2
            r2 = r4
            boolean r4 = p000.ui1.m5887(r5, r10)
            r7 = r5
            ic r5 = new ic
            r8 = 7
            r5.<init>(r1, r8, r7)
            p000.bv1.m1058(r0, r1, r2, r3, r4, r5)
            r2 = r6
            goto L94
        Ld1:
            p000.AbstractC1021yh.m6917()
            r9 = 0
            throw r9
        Ld6:
            p000.bv1.m1056(r0, r1)
            java.lang.String r9 = "新出现的 Tab 会在下次打开首页时自动扫描并添加到此列表"
            p000.bv1.m1057(r0, r1, r9)
            p000.bv1.m1056(r0, r1)
            java.lang.String r9 = "toptab_center_align"
            boolean r4 = p000.ui1.m5887(r9, r10)
            ct1 r5 = new ct1
            r9 = 17
            r5.<init>(r1, r9)
            java.lang.String r2 = "顶栏 Tab 居中对齐"
            java.lang.String r3 = "将所有 Tab 标签在标题栏中居中显示，而非默认左对齐"
            p000.bv1.m1058(r0, r1, r2, r3, r4, r5)
            p000.bv1.m1056(r0, r1)
            java.lang.String r9 = "toptab_skip_hidden_page_enabled"
            boolean r4 = p000.ui1.m5887(r9, r10)
            ct1 r5 = new ct1
            r9 = 18
            r5.<init>(r1, r9)
            java.lang.String r2 = "跳过隐藏顶栏页"
            java.lang.String r3 = "滑动到已隐藏的顶栏页面时自动跳到最近可见页面，关闭可降低 Hook 开销"
            p000.bv1.m1058(r0, r1, r2, r3, r4, r5)
            p000.bv1.m1056(r0, r1)
            java.lang.String r9 = "切换页面或重启抖音后生效"
            p000.bv1.m1057(r0, r1, r9)
        L114:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    private final java.lang.Object m5748(java.lang.Object r21) {
            r20 = this;
            r0 = r21
            android.app.Activity r0 = (android.app.Activity) r0
            r0.getClass()
            r1 = r20
            java.lang.Object r1 = r1.receiver
            bv1 r1 = (p000.bv1) r1
            r1.getClass()
            android.widget.LinearLayout r8 = p000.bv1.m1062(r0)
            r9 = 1
            android.widget.LinearLayout r10 = p000.AbstractC0602nx.m4123(r0, r9)
            qm1 r11 = new qm1
            r11.<init>()
            java.lang.String r1 = "info_bar_enabled"
            r12 = 0
            boolean r1 = p000.ui1.m5887(r1, r12)
            r11.f9050 = r1
            ic r2 = new ic
            r3 = 5
            r2.<init>(r11, r3, r10)
            java.lang.String r3 = "启用视频信息条"
            java.lang.String r4 = "在视频描述下方显示发布时间与位置（存在一定的性能开销）"
            android.widget.LinearLayout r1 = p000.bv1.m1073(r0, r3, r4, r1, r2)
            r8.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r0)
            r10.addView(r1)
            java.lang.String r1 = "info_bar_text_size"
            r2 = 115(0x73, float:1.61E-43)
            android.content.SharedPreferences r3 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L4b
            int r2 = r3.getInt(r1, r2)     // Catch: java.lang.Throwable -> L4b
        L4b:
            r1 = 80
            r3 = 200(0xc8, float:2.8E-43)
            int r2 = p000.j81.m2906(r2, r1, r3)
            dt1 r7 = new dt1
            r1 = 2
            r7.<init>(r1)
            java.lang.String r1 = "字体大小"
            r4 = 80
            java.lang.String r5 = " (x0.1sp)"
            java.lang.String r6 = "调节信息条的字号，默认 115 即 11.5sp"
            android.widget.LinearLayout r1 = p000.bv1.m1070(r0, r1, r2, r3, r4, r5, r6, r7)
            r10.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r0)
            r10.addView(r1)
            java.lang.String r1 = "info_bar_text_format"
            java.lang.String r2 = "{time}     {location}"
            java.lang.String r1 = p000.ui1.m5893(r1, r2)
            r2 = 20
            java.lang.String r1 = p000.bv1.m1042(r1, r2)
            g71 r2 = new g71
            r3 = 21
            r2.<init>(r0, r3)
            java.lang.String r3 = "显示格式"
            java.lang.String r4 = "支持 {time:yyyy-MM-dd HH:mm}、{location}、{id}"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r0, r3, r1, r4, r2)
            r10.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r0)
            r10.addView(r1)
            qm1 r1 = new qm1
            r1.<init>()
            java.lang.String r2 = "info_bar_neon_enabled"
            boolean r2 = p000.ui1.m5887(r2, r12)
            r1.f9050 = r2
            qm1 r3 = new qm1
            r3.<init>()
            if (r2 != 0) goto Lb4
            java.lang.String r2 = "info_bar_neon_solid_enabled"
            boolean r2 = p000.ui1.m5887(r2, r12)
            if (r2 == 0) goto Lb4
            r2 = r9
            goto Lb5
        Lb4:
            r2 = r12
        Lb5:
            r3.f9050 = r2
            android.widget.LinearLayout r2 = p000.AbstractC0602nx.m4123(r0, r9)
            um1 r4 = new um1
            r4.<init>()
            boolean r5 = r1.f9050
            ft1 r6 = new ft1
            r6.<init>(r1, r3, r4, r2)
            java.lang.String r7 = "霓虹彩虹色"
            java.lang.String r13 = "文字显示实时流动的彩虹渐变，自带发光效果"
            android.widget.LinearLayout r5 = p000.bv1.m1073(r0, r7, r13, r5, r6)
            p000.AbstractC0602nx.m4141(r10, r5, r0)
            boolean r6 = r3.f9050
            ft1 r7 = new ft1
            r7.<init>(r3, r1, r5, r2)
            java.lang.String r5 = "整体霓虹变色"
            java.lang.String r13 = "整条信息条同步变色，不做单字彩虹渐变"
            android.widget.LinearLayout r5 = p000.bv1.m1073(r0, r5, r13, r6, r7)
            android.view.View r6 = r5.getChildAt(r9)
            boolean r7 = r6 instanceof android.widget.Switch
            if (r7 == 0) goto Lec
            android.widget.Switch r6 = (android.widget.Switch) r6
            goto Led
        Lec:
            r6 = 0
        Led:
            r4.f10912 = r6
            r10.addView(r5)
            android.view.View r4 = p000.bv1.m1064(r0)
            r2.addView(r4)
            java.lang.String r4 = "info_bar_text_color"
            java.lang.String r5 = "#CCFFFFFF"
            java.lang.String r4 = p000.ui1.m5893(r4, r5)
            g71 r6 = new g71
            r7 = 22
            r6.<init>(r0, r7)
            java.lang.String r7 = "字体颜色"
            java.lang.String r14 = "点击选择字体颜色"
            android.widget.LinearLayout r4 = p000.bv1.m1063(r0, r7, r4, r14, r6)
            android.view.View r6 = r4.getChildAt(r9)
            boolean r7 = r6 instanceof android.view.ViewGroup
            if (r7 == 0) goto L11b
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            goto L11c
        L11b:
            r6 = 0
        L11c:
            if (r6 == 0) goto L123
            android.view.View r6 = r6.getChildAt(r12)
            goto L124
        L123:
            r6 = 0
        L124:
            boolean r7 = r6 instanceof android.widget.TextView
            if (r7 == 0) goto L12b
            android.widget.TextView r6 = (android.widget.TextView) r6
            goto L12c
        L12b:
            r6 = 0
        L12c:
            r2.addView(r4)
            android.view.View r4 = p000.bv1.m1064(r0)
            r2.addView(r4)
            fi r4 = new fi
            r4.<init>(r6, r9)
            l91 r14 = new l91
            java.lang.String r6 = "白色"
            r14.<init>(r6, r5)
            l91 r15 = new l91
            java.lang.String r5 = "亮白"
            java.lang.String r6 = "#FFFFFFFF"
            r15.<init>(r5, r6)
            l91 r5 = new l91
            java.lang.String r6 = "黄色"
            java.lang.String r7 = "#FFFFD700"
            r5.<init>(r6, r7)
            l91 r6 = new l91
            java.lang.String r7 = "红色"
            java.lang.String r12 = "#FFFE2C55"
            r6.<init>(r7, r12)
            l91 r7 = new l91
            java.lang.String r12 = "青色"
            java.lang.String r13 = "#FF00E5FF"
            r7.<init>(r12, r13)
            l91 r12 = new l91
            java.lang.String r13 = "绿色"
            java.lang.String r9 = "#FF7CFC00"
            r12.<init>(r13, r9)
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r12
            l91[] r5 = new p000.l91[]{r14, r15, r16, r17, r18, r19}
            java.util.List r5 = p000.AbstractC1021yh.m6897(r5)
            r6 = 1
            android.widget.LinearLayout r7 = p000.AbstractC0602nx.m4123(r0, r6)
            bv1 r6 = p000.bv1.f1853
            r6 = 16
            int r9 = p000.bv1.m1076(r0, r6)
            r12 = 12
            int r12 = p000.bv1.m1076(r0, r12)
            int r6 = p000.bv1.m1076(r0, r6)
            r13 = 14
            int r13 = p000.bv1.m1076(r0, r13)
            r7.setPadding(r9, r12, r6, r13)
            java.lang.String r6 = "颜色预设"
            r9 = 1096810496(0x41600000, float:14.0)
            android.widget.TextView r6 = p000.lz1.m3683(r0, r6, r9)
            qu1 r9 = p000.bv1.f1856
            java.lang.String r12 = "theme"
            if (r9 == 0) goto L2ef
            java.lang.String r9 = r9.f9122
            r13 = 0
            r14 = 1
            p000.lz1.m3699(r9, r6, r13, r14)
            r7.addView(r6)
            android.widget.TextView r6 = new android.widget.TextView
            r6.<init>(r0)
            java.lang.String r9 = "点击下方色块快速应用预设颜色"
            r6.setText(r9)
            r9 = 1094713344(0x41400000, float:12.0)
            r6.setTextSize(r9)
            qu1 r9 = p000.bv1.f1856
            if (r9 == 0) goto L2ea
            java.lang.String r9 = r9.f9124
            int r9 = android.graphics.Color.parseColor(r9)
            r6.setTextColor(r9)
            r9 = 4
            int r9 = p000.bv1.m1076(r0, r9)
            r12 = 10
            int r12 = p000.bv1.m1076(r0, r12)
            r13 = 0
            r6.setPadding(r13, r9, r13, r12)
            r7.addView(r6)
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r6.<init>(r0)
            r6.setOrientation(r13)
            r9 = 8388627(0x800013, float:1.175497E-38)
            r6.setGravity(r9)
            java.util.Iterator r5 = r5.iterator()
        L1f7:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L29d
            java.lang.Object r9 = r5.next()
            l91 r9 = (p000.l91) r9
            java.lang.Object r14 = r9.f6502
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r9 = r9.f6503
            java.lang.String r9 = (java.lang.String) r9
            r15 = 1093664768(0x41300000, float:11.0)
            android.widget.TextView r15 = p000.lz1.m3683(r0, r14, r15)
            int r13 = android.graphics.Color.parseColor(r9)
            int r12 = android.graphics.Color.red(r13)
            int r12 = r12 * 299
            r17 = r5
            int r5 = android.graphics.Color.green(r13)
            int r5 = r5 * 587
            int r5 = r5 + r12
            int r12 = android.graphics.Color.blue(r13)
            int r12 = r12 * 114
            int r12 = r12 + r5
            int r12 = r12 / 1000
            r5 = 160(0xa0, float:2.24E-43)
            if (r12 <= r5) goto L234
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L235
        L234:
            r5 = -1
        L235:
            r15.setTextColor(r5)
            r5 = 0
            r12 = 1
            r15.setTypeface(r5, r12)
            r5 = 17
            r15.setGravity(r5)
            r5 = 8
            int r12 = p000.bv1.m1076(r0, r5)
            r16 = r3
            r3 = 6
            r18 = r1
            int r1 = p000.bv1.m1076(r0, r3)
            r19 = r11
            int r11 = p000.bv1.m1076(r0, r5)
            int r3 = p000.bv1.m1076(r0, r3)
            r15.setPadding(r12, r1, r11, r3)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r1.setColor(r13)
            int r3 = p000.bv1.m1076(r0, r5)
            float r3 = (float) r3
            r1.setCornerRadius(r3)
            r15.setBackground(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r3 = -2
            r1.<init>(r3, r3)
            int r3 = p000.bv1.m1076(r0, r5)
            r1.rightMargin = r3
            r15.setLayoutParams(r1)
            r12 = 1
            r15.setClickable(r12)
            r15.setFocusable(r12)
            vj r1 = new vj
            r1.<init>(r9, r4, r0, r14)
            r15.setOnClickListener(r1)
            r6.addView(r15)
            r3 = r16
            r5 = r17
            r1 = r18
            r11 = r19
            r13 = 0
            goto L1f7
        L29d:
            r18 = r1
            r16 = r3
            r19 = r11
            r5 = 8
            r7.addView(r6)
            r2.addView(r7)
            r10.addView(r2)
            android.view.View r1 = p000.bv1.m1064(r0)
            r10.addView(r1)
            java.lang.String r1 = "格式示例：{time:yyyy-MM-dd HH:mm} · {location}，MM 是月份，mm 是分钟"
            android.widget.TextView r1 = p000.bv1.m1065(r0, r1)
            r10.addView(r1)
            java.lang.String r1 = "切换页面后样式生效"
            android.widget.TextView r0 = p000.bv1.m1065(r0, r1)
            r10.addView(r0)
            r8.addView(r10)
            r0 = r19
            boolean r0 = r0.f9050
            if (r0 == 0) goto L2d2
            r0 = 0
            goto L2d3
        L2d2:
            r0 = r5
        L2d3:
            r10.setVisibility(r0)
            r0 = r18
            boolean r0 = r0.f9050
            if (r0 != 0) goto L2e5
            r0 = r16
            boolean r0 = r0.f9050
            if (r0 == 0) goto L2e3
            goto L2e5
        L2e3:
            r12 = 0
            goto L2e6
        L2e5:
            r12 = r5
        L2e6:
            r2.setVisibility(r12)
            return r8
        L2ea:
            p000.ln0.m3650(r12)
            r5 = 0
            throw r5
        L2ef:
            r5 = 0
            p000.ln0.m3650(r12)
            throw r5
    }

    /* JADX INFO: renamed from: δ */
    private final java.lang.Object m5749(java.lang.Object r9) {
            r8 = this;
            r1 = r9
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r8 = r8.receiver
            bv1 r8 = (p000.bv1) r8
            r8.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r1)
            boolean r8 = p000.i81.m2670(r1)
            if (r8 != 0) goto L1e
            java.lang.String r8 = "空闲退出是内测功能，需要内测资格才能使用"
            android.widget.LinearLayout r8 = p000.bv1.m1061(r1, r8)
            return r8
        L1e:
            java.lang.String r8 = "idle_auto_exit_enabled"
            r9 = 0
            boolean r4 = p000.ui1.m5887(r8, r9)
            ct1 r5 = new ct1
            r8 = 8
            r5.<init>(r1, r8)
            java.lang.String r2 = "启用空闲退出"
            java.lang.String r3 = "超过设定时间无操作，自动退出抖音并锁屏"
            p000.bv1.m1058(r0, r1, r2, r3, r4, r5)
            r8 = r0
            p000.bv1.m1056(r8, r1)
            java.lang.String r0 = "idle_auto_exit_minutes"
            r2 = 30
            android.content.SharedPreferences r3 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L43
            int r2 = r3.getInt(r0, r2)     // Catch: java.lang.Throwable -> L43
        L43:
            r0 = 1
            r3 = 120(0x78, float:1.68E-43)
            int r2 = p000.j81.m2906(r2, r0, r3)
            kv0 r7 = new kv0
            r0 = 6
            r7.<init>(r1, r0)
            r0 = r1
            java.lang.String r1 = "空闲时长"
            r4 = 1
            java.lang.String r5 = "分钟"
            java.lang.String r6 = "无操作超过此时长后自动退出"
            android.widget.LinearLayout r1 = p000.bv1.m1070(r0, r1, r2, r3, r4, r5, r6, r7)
            r8.addView(r1)
            p000.bv1.m1056(r8, r0)
            java.lang.String r1 = "idle_exit_lock_screen"
            boolean r4 = p000.ui1.m5887(r1, r9)
            ct1 r5 = new ct1
            r1 = 9
            r5.<init>(r0, r1)
            java.lang.String r2 = "退出后锁屏"
            java.lang.String r3 = "退出抖音时锁屏（需 Root）"
            r1 = r0
            r0 = r8
            p000.bv1.m1058(r0, r1, r2, r3, r4, r5)
            p000.bv1.m1056(r0, r1)
            java.lang.String r8 = "idle_exit_show_countdown"
            boolean r4 = p000.ui1.m5887(r8, r9)
            ct1 r5 = new ct1
            r8 = 10
            r5.<init>(r1, r8)
            java.lang.String r2 = "退出前倒计时提示"
            java.lang.String r3 = "空闲超时前显示倒计时，触摸可取消退出"
            p000.bv1.m1058(r0, r1, r2, r3, r4, r5)
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    private final java.lang.Object m5750(java.lang.Object r9) {
            r8 = this;
            r0 = r9
            android.app.Activity r0 = (android.app.Activity) r0
            r0.getClass()
            java.lang.Object r8 = r8.receiver
            bv1 r8 = (p000.bv1) r8
            r8.getClass()
            android.widget.LinearLayout r8 = p000.bv1.m1062(r0)
            java.lang.String r9 = "download_show_top_notification"
            r1 = 1
            boolean r9 = p000.ui1.m5887(r9, r1)
            oq1 r2 = new oq1
            r3 = 27
            r2.<init>(r3)
            java.lang.String r3 = "下载作品进度"
            java.lang.String r4 = "下载视频、图片、动图、音频时使用顶部通知显示进度"
            android.widget.LinearLayout r9 = p000.bv1.m1073(r0, r3, r4, r9, r2)
            r8.addView(r9)
            android.view.View r9 = p000.bv1.m1064(r0)
            r8.addView(r9)
            java.lang.String r9 = "spark_show_top_notification"
            boolean r9 = p000.ui1.m5887(r9, r1)
            oq1 r2 = new oq1
            r3 = 28
            r2.<init>(r3)
            java.lang.String r3 = "火花/火星任务进度"
            java.lang.String r4 = "手动或自动执行续火、火星任务时使用顶部通知显示进度"
            android.widget.LinearLayout r9 = p000.bv1.m1073(r0, r3, r4, r9, r2)
            r8.addView(r9)
            android.view.View r9 = p000.bv1.m1064(r0)
            r8.addView(r9)
            java.lang.String r9 = "pet_elf_camp_show_top_notification"
            boolean r9 = p000.ui1.m5887(r9, r1)
            it1 r1 = new it1
            r2 = 3
            r1.<init>(r0, r2)
            java.lang.String r2 = "营地任务提示"
            java.lang.String r3 = "刷新、收菜、种地、浇水各自在当日首次完成时汇总提示，后续静默执行"
            android.widget.LinearLayout r9 = p000.bv1.m1073(r0, r2, r3, r9, r1)
            p000.AbstractC0602nx.m4141(r8, r9, r0)
            java.lang.String r9 = "download_top_notification_alpha"
            r1 = 62
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L73
            int r1 = r2.getInt(r9, r1)     // Catch: java.lang.Throwable -> L73
        L73:
            r9 = 0
            r2 = 100
            int r2 = p000.j81.m2906(r1, r9, r2)
            dt1 r7 = new dt1
            r9 = 20
            r7.<init>(r9)
            java.lang.String r1 = "顶部通知通透度"
            r3 = 100
            r4 = 0
            java.lang.String r5 = "%"
            java.lang.String r6 = "数值越高越透明，文字和进度不受影响"
            android.widget.LinearLayout r9 = p000.bv1.m1070(r0, r1, r2, r3, r4, r5, r6, r7)
            r8.addView(r9)
            return r8
    }

    /* JADX INFO: renamed from: η */
    private final java.lang.Object m5751(java.lang.Object r5) {
            r4 = this;
            android.app.Activity r5 = (android.app.Activity) r5
            r5.getClass()
            java.lang.Object r4 = r4.receiver
            bv1 r4 = (p000.bv1) r4
            r4.getClass()
            android.widget.LinearLayout r4 = p000.bv1.m1062(r5)
            java.lang.String r0 = "version_update_check_enabled"
            r1 = 0
            boolean r0 = p000.ui1.m5887(r0, r1)
            it1 r1 = new it1
            r2 = 2
            r1.<init>(r5, r2)
            java.lang.String r2 = "版本更新检查"
            java.lang.String r3 = "启动宿主后自动检查 DYHelper 新版本，发现更新时弹窗提示下载"
            android.widget.LinearLayout r0 = p000.bv1.m1073(r5, r2, r3, r0, r1)
            r4.addView(r0)
            android.view.View r0 = p000.bv1.m1064(r5)
            r4.addView(r0)
            t72 r0 = p000.u72.m5795()
            if (r0 != 0) goto L38
            java.lang.String r0 = "暂无缓存"
            goto L60
        L38:
            int r1 = r0.f10235
            java.lang.String r0 = r0.f10236
            boolean r2 = p000.q02.m4671(r0)
            if (r2 != 0) goto L5c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " ("
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L60
        L5c:
            java.lang.String r0 = java.lang.String.valueOf(r1)
        L60:
            jt1 r1 = new jt1
            r2 = 3
            r1.<init>(r5, r2)
            java.lang.String r2 = "立即检查更新"
            java.lang.String r3 = "联网拉取最新版本信息，若发现新版本会显示更新弹窗"
            android.widget.LinearLayout r0 = p000.bv1.m1063(r5, r2, r0, r3, r1)
            r4.addView(r0)
            android.view.View r0 = p000.bv1.m1064(r5)
            r4.addView(r0)
            java.lang.String r0 = "关闭后不会自动联网检查版本；手动点击“立即检查更新”仍可主动查询"
            android.widget.TextView r5 = p000.bv1.m1065(r5, r0)
            r4.addView(r5)
            return r4
    }

    /* JADX INFO: renamed from: θ */
    private final java.lang.Object m5752(java.lang.Object r14) {
            r13 = this;
            android.app.Activity r14 = (android.app.Activity) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            bv1 r13 = (p000.bv1) r13
            r13.getClass()
            android.widget.LinearLayout r13 = p000.bv1.m1062(r14)
            boolean r0 = p000.AbstractC0976x9.m6530()
            boolean r1 = p000.AbstractC0976x9.m6529()
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L21
            if (r1 == 0) goto L1f
            goto L21
        L1f:
            r4 = r3
            goto L22
        L21:
            r4 = r2
        L22:
            if (r4 != 0) goto L34
            java.lang.String r5 = "火花与火星功能仅限内测用户使用"
            android.widget.TextView r5 = p000.bv1.m1065(r14, r5)
            r13.addView(r5)
            android.view.View r5 = p000.bv1.m1064(r14)
            r13.addView(r5)
        L34:
            if (r0 == 0) goto L3d
            java.lang.String r5 = "spark_auto_renew_enabled"
            boolean r5 = p000.ui1.m5887(r5, r3)
            goto L3e
        L3d:
            r5 = r3
        L3e:
            ct1 r6 = new ct1
            r7 = 19
            r6.<init>(r14, r7)
            java.lang.String r7 = "自动续期模式"
            java.lang.String r8 = "到达设定时间后自动发送续期消息"
            android.widget.LinearLayout r5 = p000.bv1.m1073(r14, r7, r8, r5, r6)
            r13.addView(r5)
            android.view.View r5 = p000.bv1.m1064(r14)
            r13.addView(r5)
            java.lang.String r5 = "小火人火星任务与亲密度"
            android.widget.TextView r5 = p000.bv1.m1065(r14, r5)
            r13.addView(r5)
            android.view.View r5 = p000.bv1.m1064(r14)
            r13.addView(r5)
            java.lang.String r5 = "pet_elf_auto_success_toast_enabled"
            boolean r5 = p000.ui1.m5887(r5, r2)
            hu1 r6 = new hu1
            r7 = 0
            r6.<init>(r7)
            java.lang.String r7 = "自动操作成功提醒"
            java.lang.String r8 = "自动投喂、自动领取亲密度或自动领取火星成功数量至少为 1 时，每次显示 Toast"
            android.widget.LinearLayout r5 = p000.bv1.m1073(r14, r7, r8, r5, r6)
            r13.addView(r5)
            android.view.View r5 = p000.bv1.m1064(r14)
            r13.addView(r5)
            if (r1 == 0) goto L8e
            java.lang.String r5 = "pet_elf_auto_claim_enabled"
            boolean r5 = p000.ui1.m5887(r5, r3)
            goto L8f
        L8e:
            r5 = r3
        L8f:
            gu1 r6 = new gu1
            r7 = 1
            r6.<init>(r14, r14, r7)
            java.lang.String r7 = "每日自动领取火星"
            java.lang.String r8 = "开启后每次打开抖音都会检查并领取已完成的火星任务"
            android.widget.LinearLayout r5 = p000.bv1.m1073(r14, r7, r8, r5, r6)
            p000.AbstractC0602nx.m4141(r13, r5, r14)
            if (r1 == 0) goto La9
            java.lang.String r5 = "pet_elf_closeness_auto_claim_enabled"
            boolean r5 = p000.ui1.m5887(r5, r3)
            goto Laa
        La9:
            r5 = r3
        Laa:
            gu1 r6 = new gu1
            r7 = 2
            r6.<init>(r14, r14, r7)
            java.lang.String r7 = "自动领取小火人经验"
            java.lang.String r8 = "每次打开抖音领取已出现的亲密度气泡；与火星任务奖励独立"
            android.widget.LinearLayout r5 = p000.bv1.m1073(r14, r7, r8, r5, r6)
            p000.AbstractC0602nx.m4141(r13, r5, r14)
            if (r1 == 0) goto Lc4
            java.lang.String r5 = "pet_elf_auto_feed_enabled"
            boolean r5 = p000.ui1.m5887(r5, r3)
            goto Lc5
        Lc4:
            r5 = r3
        Lc5:
            gu1 r6 = new gu1
            r7 = 3
            r6.<init>(r14, r14, r7)
            java.lang.String r7 = "自动投喂小火人"
            java.lang.String r8 = "每个抖音进程检查一次；逐人员读取实时目录并遵守价格上限"
            android.widget.LinearLayout r5 = p000.bv1.m1073(r14, r7, r8, r5, r6)
            r13.addView(r5)
            android.view.View r5 = p000.bv1.m1064(r14)
            r13.addView(r5)
            java.lang.String r5 = "pet_elf_auto_feed_default_food_id"
            java.lang.String r6 = "204"
            java.lang.String r5 = p000.ui1.m5893(r5, r6)
            java.lang.CharSequence r5 = p000.q02.m4660(r5)
            java.lang.String r5 = r5.toString()
            r5.getClass()
            java.lang.CharSequence r7 = p000.q02.m4660(r5)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "__smart__"
            boolean r7 = p000.ln0.m3626(r7, r8)
            r9 = 0
            java.lang.String r10 = ""
            r11 = 10
            if (r7 == 0) goto L106
            goto L120
        L106:
            java.lang.Integer r5 = p000.x02.m6487(r5, r11)
            if (r5 == 0) goto L11c
            int r7 = r5.intValue()
            if (r7 <= 0) goto L113
            goto L114
        L113:
            r5 = r9
        L114:
            if (r5 == 0) goto L11c
            java.lang.String r5 = r5.toString()
            r8 = r5
            goto L11d
        L11c:
            r8 = r9
        L11d:
            if (r8 != 0) goto L120
            r8 = r10
        L120:
            boolean r5 = p000.q02.m4671(r8)
            if (r5 == 0) goto L127
            goto L128
        L127:
            r6 = r8
        L128:
            java.lang.String r5 = p000.gf1.m2301(r6)
            fj1 r7 = new fj1
            r8 = 3
            r7.<init>(r14, r6, r8)
            java.lang.String r6 = "默认投喂食物"
            java.lang.String r8 = "人员未单独选择时使用；智能选择会按实时价格上限比较亲密度 / 火星"
            android.widget.LinearLayout r5 = p000.bv1.m1063(r14, r6, r5, r8, r7)
            p000.AbstractC0602nx.m4141(r13, r5, r14)
            java.lang.String r5 = "pet_elf_auto_feed_max_price"
            android.content.SharedPreferences r6 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L148
            int r5 = r6.getInt(r5, r3)     // Catch: java.lang.Throwable -> L148
            goto L149
        L148:
            r5 = r3
        L149:
            r6 = 100
            int r5 = p000.j81.m2906(r5, r3, r6)
            if (r5 != 0) goto L154
            java.lang.String r5 = "仅免费"
            goto L15c
        L154:
            java.lang.String r6 = "最多 "
            java.lang.String r7 = " 火星"
            java.lang.String r5 = p000.AbstractC0602nx.m4127(r6, r5, r7)
        L15c:
            jt1 r6 = new jt1
            r7 = 13
            r6.<init>(r14, r7)
            java.lang.String r7 = "单次投喂价格上限"
            java.lang.String r8 = "0 表示只投喂免费食物；实时价格超过上限时写明原因并跳过"
            android.widget.LinearLayout r5 = p000.bv1.m1063(r14, r7, r5, r8, r6)
            r13.addView(r5)
            android.view.View r5 = p000.bv1.m1064(r14)
            r13.addView(r5)
            ef1 r5 = p000.gf1.m2303()
            java.util.List r5 = r5.f3533
            int r5 = r5.size()
            if (r5 <= 0) goto L188
            java.lang.String r6 = " 种"
            java.lang.String r6 = p000.lz1.m3686(r6, r5)
            goto L18a
        L188:
            java.lang.String r6 = "未缓存"
        L18a:
            jt1 r7 = new jt1
            r8 = 14
            r7.<init>(r14, r8)
            java.lang.String r8 = "更新食物列表"
            java.lang.String r12 = "通过宿主刷新当前账号目录；实际投喂仍会再次校验目标会话价格"
            android.widget.LinearLayout r6 = p000.bv1.m1063(r14, r8, r6, r12, r7)
            r13.addView(r6)
            if (r1 == 0) goto L1aa
            if (r5 != 0) goto L1aa
            eu1 r5 = new eu1
            r6 = 16
            r5.<init>(r6)
            p000.pf1.m4519(r14, r9, r5)
        L1aa:
            android.widget.LinearLayout r5 = p000.AbstractC0602nx.m4123(r14, r2)
            android.view.View r6 = p000.bv1.m1064(r14)
            r13.addView(r6)
            java.lang.String r6 = "pet_elf_auto_task_enabled"
            if (r1 == 0) goto L1be
            boolean r7 = p000.ui1.m5887(r6, r3)
            goto L1bf
        L1be:
            r7 = r3
        L1bf:
            bl0 r8 = new bl0
            r9 = 2
            r8.<init>(r14, r5, r14, r9)
            java.lang.String r9 = "每日自动完成火星任务"
            java.lang.String r12 = "每日按触发时间完成已启用任务，完成后自动检查并领取"
            android.widget.LinearLayout r7 = p000.bv1.m1073(r14, r9, r12, r7, r8)
            r13.addView(r7)
            android.view.View r7 = p000.bv1.m1064(r14)
            r5.addView(r7)
            if (r1 == 0) goto L1e0
            java.lang.String r7 = "pet_elf_auto_mutual_message_enabled"
            boolean r2 = p000.ui1.m5887(r7, r2)
            goto L1e1
        L1e0:
            r2 = r3
        L1e1:
            ct1 r7 = new ct1
            r8 = 20
            r7.<init>(r14, r8)
            java.lang.String r8 = "自动完成互发消息任务"
            java.lang.String r9 = "严格匹配同时包含“互发”“消息”且不含“多闪”的任务"
            android.widget.LinearLayout r2 = p000.bv1.m1073(r14, r8, r9, r2, r7)
            r5.addView(r2)
            android.view.View r2 = p000.bv1.m1064(r14)
            r5.addView(r2)
            java.lang.String r2 = "pet_elf_mutual_message"
            java.lang.String r7 = "火星任务"
            java.lang.String r2 = p000.ui1.m5893(r2, r7)
            r7 = 15
            java.lang.String r2 = p000.bv1.m1042(r2, r7)
            jt1 r8 = new jt1
            r9 = 9
            r8.<init>(r14, r9)
            java.lang.String r9 = "互发消息默认内容"
            java.lang.String r12 = "所有人员默认使用；可在自定义人员页面单独覆盖"
            android.widget.LinearLayout r2 = p000.bv1.m1063(r14, r9, r2, r12, r8)
            p000.AbstractC0602nx.m4141(r5, r2, r14)
            if (r1 == 0) goto L223
            java.lang.String r2 = "pet_elf_auto_image_enabled"
            boolean r2 = p000.ui1.m5887(r2, r3)
            goto L224
        L223:
            r2 = r3
        L224:
            gu1 r8 = new gu1
            r9 = 0
            r8.<init>(r14, r14, r9)
            java.lang.String r9 = "自动发送图片任务"
            java.lang.String r12 = "命中进行中的图片任务时发送设置中选择的图片"
            android.widget.LinearLayout r2 = p000.bv1.m1073(r14, r9, r12, r2, r8)
            r5.addView(r2)
            int r8 = r2.getChildCount()
            xm0 r8 = p000.j81.m2893(r3, r8)
            java.util.ArrayList r9 = new java.util.ArrayList
            int r11 = p000.AbstractC1021yh.m6889(r8, r11)
            r9.<init>(r11)
            java.util.Iterator r8 = r8.iterator()
        L24a:
            r11 = r8
            wm0 r11 = (p000.wm0) r11
            boolean r12 = r11.f11765
            if (r12 == 0) goto L25d
            int r11 = r11.nextInt()
            android.view.View r11 = r2.getChildAt(r11)
            r9.add(r11)
            goto L24a
        L25d:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r8 = r9.iterator()
        L266:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L278
            java.lang.Object r9 = r8.next()
            boolean r11 = r9 instanceof android.widget.Switch
            if (r11 == 0) goto L266
            r2.add(r9)
            goto L266
        L278:
            java.lang.Object r2 = p000.AbstractC0984xh.m6640(r2)
            android.widget.Switch r2 = (android.widget.Switch) r2
            android.view.View r8 = p000.bv1.m1064(r14)
            r5.addView(r8)
            java.lang.String r8 = "pet_elf_task_image_name"
            java.lang.String r8 = p000.ui1.m5893(r8, r10)
            boolean r9 = p000.q02.m4671(r8)
            if (r9 == 0) goto L293
            java.lang.String r8 = "未选择"
        L293:
            r9 = 32
            java.lang.String r8 = p000.bv1.m1042(r8, r9)
            qh1 r9 = new qh1
            r10 = 6
            r9.<init>(r14, r10, r2)
            java.lang.String r2 = "自动任务图片"
            java.lang.String r10 = "通过系统 SAF 选择；所有启用图片任务的人员共用"
            android.widget.LinearLayout r2 = p000.bv1.m1063(r14, r2, r8, r10, r9)
            r5.addView(r2)
            if (r1 == 0) goto L2b4
            boolean r1 = p000.ui1.m5887(r6, r3)
            if (r1 == 0) goto L2b4
            r1 = r3
            goto L2b6
        L2b4:
            r1 = 8
        L2b6:
            r5.setVisibility(r1)
            r13.addView(r5)
            android.view.View r1 = p000.bv1.m1064(r14)
            r13.addView(r1)
            if (r0 == 0) goto L2cc
            java.lang.String r1 = "spark_include_group_chat"
            boolean r1 = p000.ui1.m5887(r1, r3)
            goto L2cd
        L2cc:
            r1 = r3
        L2cd:
            ct1 r2 = new ct1
            r5 = 21
            r2.<init>(r14, r5)
            java.lang.String r5 = "包含群聊火花"
            java.lang.String r6 = "开启后会识别并续期群聊火花；默认只处理单聊"
            android.widget.LinearLayout r1 = p000.bv1.m1073(r14, r5, r6, r1, r2)
            p000.AbstractC0602nx.m4141(r13, r1, r14)
            r1 = -1
            if (r0 == 0) goto L2ec
            java.lang.String r2 = "spark_auto_renew_trigger_hour"
            android.content.SharedPreferences r5 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L2ec
            int r1 = r5.getInt(r2, r1)     // Catch: java.lang.Throwable -> L2ec
        L2ec:
            if (r1 >= 0) goto L2f1
            java.lang.String r1 = "日期切换时触发"
            goto L2f9
        L2f1:
            java.lang.String r2 = "每日 "
            java.lang.String r5 = ":00 后触发"
            java.lang.String r1 = p000.AbstractC0602nx.m4127(r2, r1, r5)
        L2f9:
            jt1 r2 = new jt1
            r5 = 10
            r2.<init>(r14, r5)
            java.lang.String r5 = "触发时间设置"
            java.lang.String r6 = "设为 -1 = 日期切换时触发；0~23 = 指定小时后触发"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r14, r5, r1, r6, r2)
            p000.AbstractC0602nx.m4141(r13, r1, r14)
            if (r0 == 0) goto L318
            java.lang.String r1 = "spark_auto_renew_delay_seconds"
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L318
            int r1 = r2.getInt(r1, r7)     // Catch: java.lang.Throwable -> L318
            goto L319
        L318:
            r1 = r7
        L319:
            java.lang.String r2 = "s"
            java.lang.String r2 = p000.lz1.m3686(r2, r1)
            ht1 r5 = new ht1
            r6 = 4
            r5.<init>(r14, r1, r6)
            java.lang.String r1 = "火花/火星启动延迟"
            java.lang.String r6 = "打开抖音后等待多少秒再执行火花续期和每日火星任务"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r14, r1, r2, r6, r5)
            r13.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r14)
            r13.addView(r1)
            java.lang.String r1 = "spark_message"
            java.lang.String r2 = "火花"
            java.lang.String r1 = p000.ui1.m5893(r1, r2)
            java.lang.String r1 = p000.bv1.m1042(r1, r7)
            jt1 r2 = new jt1
            r5 = 11
            r2.<init>(r14, r5)
            java.lang.String r5 = "续期消息内容"
            java.lang.String r6 = "自动发送的消息文本"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r14, r5, r1, r6, r2)
            r13.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r14)
            r13.addView(r1)
            java.lang.String r1 = "spark_message_source"
            java.lang.String r2 = "custom"
            java.lang.String r1 = p000.ui1.m5893(r1, r2)
            java.lang.String[] r2 = p000.kn0.f6046
            int r1 = p000.AbstractC0312g7.m2254(r2, r1)
            java.lang.String[] r2 = p000.kn0.f6045
            if (r1 < 0) goto L374
            r5 = 3
            if (r1 >= r5) goto L374
            r1 = r2[r1]
            goto L37a
        L374:
            java.lang.Object r1 = p000.AbstractC0312g7.m2249(r2)
            java.lang.String r1 = (java.lang.String) r1
        L37a:
            jt1 r2 = new jt1
            r5 = 12
            r2.<init>(r14, r5)
            java.lang.String r5 = "续期消息来源"
            java.lang.String r6 = "可选择固定文本、一言或今日诗词；API 失败时回退固定文本"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r14, r5, r1, r6, r2)
            p000.AbstractC0602nx.m4141(r13, r1, r14)
            if (r0 == 0) goto L395
            java.lang.String r1 = "spark_custom_renew_enabled"
            boolean r1 = p000.ui1.m5887(r1, r3)
            goto L396
        L395:
            r1 = r3
        L396:
            ct1 r2 = new ct1
            r5 = 22
            r2.<init>(r14, r5)
            java.lang.String r5 = "启用自定义人员续火"
            java.lang.String r6 = "规则内人员会参与续火；即使当前不是待续状态也可发送"
            android.widget.LinearLayout r1 = p000.bv1.m1073(r14, r5, r6, r1, r2)
            p000.AbstractC0602nx.m4141(r13, r1, r14)
            if (r0 == 0) goto L3b0
            java.lang.String r0 = "spark_fake_days_enabled"
            boolean r3 = p000.ui1.m5887(r0, r3)
        L3b0:
            ct1 r0 = new ct1
            r1 = 23
            r0.<init>(r14, r1)
            java.lang.String r1 = "伪装火花天数"
            java.lang.String r2 = "开启后可在人员列表中点击人员，为单个会话设置本地显示的火花天数"
            android.widget.LinearLayout r0 = p000.bv1.m1073(r14, r1, r2, r3, r0)
            r13.addView(r0)
            android.view.View r0 = p000.bv1.m1064(r14)
            r13.addView(r0)
            et1 r0 = new et1
            r1 = 2
            r0.<init>(r14, r14, r1)
            java.lang.String r1 = "自定义续火人员"
            java.lang.String r2 = "打开管理"
            java.lang.String r3 = "点击人员设置专属消息、火星任务和伪装天数，长按人员拖拽分组"
            android.widget.LinearLayout r14 = p000.bv1.m1063(r14, r1, r2, r3, r0)
            r13.addView(r14)
            p000.bv1.m1060(r13, r4)
            return r13
    }

    /* JADX INFO: renamed from: ι */
    private final java.lang.Object m5753(java.lang.Object r10) {
            r9 = this;
            android.app.Activity r10 = (android.app.Activity) r10
            r10.getClass()
            java.lang.Object r9 = r9.receiver
            bv1 r9 = (p000.bv1) r9
            r9.getClass()
            android.widget.LinearLayout r9 = p000.bv1.m1062(r10)
            boolean r0 = p000.AbstractC0976x9.m6528()
            if (r0 != 0) goto L26
            java.lang.String r1 = "口袋营地功能仅限内测用户使用"
            android.widget.TextView r1 = p000.bv1.m1065(r10, r1)
            r9.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r10)
            r9.addView(r1)
        L26:
            qd r1 = p000.v81.m6127()
            d62 r2 = new d62
            boolean r3 = r1.f8963
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            od r4 = p000.EnumC0619od.f8034
            java.lang.String r5 = "自动收菜"
            r2.<init>(r4, r5, r3)
            d62 r3 = new d62
            boolean r4 = r1.f8964
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            od r5 = p000.EnumC0619od.f8035
            java.lang.String r6 = "自动种地"
            r3.<init>(r5, r6, r4)
            d62 r4 = new d62
            boolean r1 = r1.f8965
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            od r5 = p000.EnumC0619od.f8036
            java.lang.String r6 = "自动浇水"
            r4.<init>(r5, r6, r1)
            d62[] r1 = new p000.d62[]{r2, r3, r4}
            java.util.List r1 = p000.AbstractC1021yh.m6897(r1)
            java.util.Iterator r1 = r1.iterator()
        L63:
            boolean r2 = r1.hasNext()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L97
            java.lang.Object r2 = r1.next()
            d62 r2 = (p000.d62) r2
            java.lang.Object r5 = r2.f2926
            od r5 = (p000.EnumC0619od) r5
            java.lang.Object r6 = r2.f2927
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r2.f2928
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            bv1 r7 = p000.bv1.f1853
            if (r0 == 0) goto L88
            if (r2 == 0) goto L88
            r4 = r3
        L88:
            bl0 r2 = new bl0
            r2.<init>(r10, r5, r10, r3)
            java.lang.String r3 = "进入抖音后在后台执行；人员覆盖规则可在营地管理中调整"
            android.widget.LinearLayout r2 = p000.bv1.m1073(r10, r6, r3, r4, r2)
            p000.AbstractC0602nx.m4141(r9, r2, r10)
            goto L63
        L97:
            if (r0 == 0) goto L9c
            java.lang.String r1 = "管理人员规则与固定种子"
            goto L9e
        L9c:
            java.lang.String r1 = "已锁定 · 仅限内测用户"
        L9e:
            g71 r2 = new g71
            r5 = 27
            r2.<init>(r10, r5)
            java.lang.String r5 = "营地管理"
            java.lang.String r6 = "查看缓存状态、刷新营地并执行批量操作"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r10, r5, r1, r6, r2)
            p000.AbstractC0602nx.m4141(r9, r1, r10)
            java.lang.String r1 = "pet_elf_camp_start_delay_seconds"
            r2 = 5
            android.content.SharedPreferences r5 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> Lbb
            int r2 = r5.getInt(r1, r2)     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r1 = 300(0x12c, float:4.2E-43)
            int r1 = p000.j81.m2906(r2, r4, r1)
            java.lang.String r2 = " 秒后"
            java.lang.String r2 = p000.lz1.m3686(r2, r1)
            ht1 r5 = new ht1
            r5.<init>(r10, r1, r4)
            java.lang.String r1 = "进入抖音后执行"
            java.lang.String r6 = "仅控制营地后台任务，不影响火花续期和火星任务"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r10, r1, r2, r6, r5)
            p000.AbstractC0602nx.m4141(r9, r1, r10)
            java.lang.String r1 = "pet_elf_camp_daily_harvest_limit"
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> Le2
            int r1 = r2.getInt(r1, r4)     // Catch: java.lang.Throwable -> Le2
            goto Le3
        Le2:
            r1 = r4
        Le3:
            r2 = 100
            int r1 = p000.j81.m2906(r1, r4, r2)
            java.lang.String r5 = " 次"
            java.lang.String r6 = "不限制"
            if (r1 != 0) goto Lf1
            r7 = r6
            goto Lf5
        Lf1:
            java.lang.String r7 = p000.lz1.m3686(r5, r1)
        Lf5:
            ht1 r8 = new ht1
            r8.<init>(r10, r1, r3)
            java.lang.String r1 = "每日收获限额"
            java.lang.String r3 = "0 表示不限制；达到非零限额后当天停止自动收获"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r10, r1, r7, r3, r8)
            p000.AbstractC0602nx.m4141(r9, r1, r10)
            java.lang.String r1 = "pet_elf_camp_daily_plant_limit"
            android.content.SharedPreferences r3 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L110
            int r1 = r3.getInt(r1, r4)     // Catch: java.lang.Throwable -> L110
            goto L111
        L110:
            r1 = r4
        L111:
            int r1 = p000.j81.m2906(r1, r4, r2)
            if (r1 != 0) goto L118
            goto L11c
        L118:
            java.lang.String r6 = p000.lz1.m3686(r5, r1)
        L11c:
            ht1 r2 = new ht1
            r3 = 2
            r2.<init>(r10, r1, r3)
            java.lang.String r1 = "每日种植限额"
            java.lang.String r3 = "0 表示不限制；达到非零限额后当天停止自动种植"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r10, r1, r6, r3, r2)
            p000.AbstractC0602nx.m4141(r9, r1, r10)
            java.lang.String r1 = "pet_elf_camp_operation_interval_seconds"
            r2 = 3
            android.content.SharedPreferences r3 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L139
            int r1 = r3.getInt(r1, r2)     // Catch: java.lang.Throwable -> L139
            goto L13a
        L139:
            r1 = r2
        L13a:
            r3 = 60
            int r1 = p000.j81.m2906(r1, r4, r3)
            java.lang.String r3 = " 秒"
            java.lang.String r3 = p000.lz1.m3686(r3, r1)
            ht1 r4 = new ht1
            r4.<init>(r10, r1, r2)
            java.lang.String r1 = "营地操作间隔"
            java.lang.String r2 = "同一会话两次写操作的间隔；不同会话可并行"
            android.widget.LinearLayout r10 = p000.bv1.m1063(r10, r1, r3, r2, r4)
            r9.addView(r10)
            p000.bv1.m1060(r9, r0)
            return r9
    }

    /* JADX INFO: renamed from: κ */
    private final java.lang.Object m5754(java.lang.Object r14) {
            r13 = this;
            android.app.Activity r14 = (android.app.Activity) r14
            r14.getClass()
            java.lang.Object r13 = r13.receiver
            bv1 r13 = (p000.bv1) r13
            r13.getClass()
            android.widget.LinearLayout r13 = p000.bv1.m1062(r14)
            r0 = 185422799(0xb0d53cf, double:9.1611035E-316)
            java.lang.String r0 = p000.u90.m5832(r0)
            java.lang.String r1 = " MB"
            java.lang.String r0 = r0.concat(r1)
            r2 = 562589696(0x21887000, double:2.779562415E-315)
            java.lang.String r2 = p000.u90.m5832(r2)
            java.lang.String r1 = r2.concat(r1)
            boolean r2 = p000.u90.m5833(r14)
            if (r2 == 0) goto L31
            java.lang.String r2 = "已下载"
            goto L33
        L31:
            java.lang.String r2 = "未下载"
        L33:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "下载 "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = "，解压后占用 "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            et1 r1 = new et1
            r3 = 0
            r1.<init>(r14, r14, r3)
            java.lang.String r3 = "国外地区数据库"
            android.widget.LinearLayout r0 = p000.bv1.m1063(r14, r3, r2, r0, r1)
            r13.addView(r0)
            android.view.View r0 = p000.bv1.m1064(r14)
            r13.addView(r0)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r14)
            java.lang.String r1 = "DexKit 缓存"
            r0.setText(r1)
            r1 = 1096810496(0x41600000, float:14.0)
            r0.setTextSize(r1)
            bv1 r2 = p000.bv1.f1853
            qu1 r2 = p000.bv1.f1856
            java.lang.String r3 = "theme"
            r4 = 0
            if (r2 == 0) goto L186
            java.lang.String r2 = r2.f9122
            r5 = 1
            p000.lz1.m3699(r2, r0, r4, r5)
            r2 = 16
            int r6 = p000.bv1.m1076(r14, r2)
            r7 = 13
            int r8 = p000.bv1.m1076(r14, r7)
            int r9 = p000.bv1.m1076(r14, r2)
            r10 = 8
            int r11 = p000.bv1.m1076(r14, r10)
            r0.setPadding(r6, r8, r9, r11)
            r13.addView(r0)
            g71 r0 = new g71
            r6 = 14
            r0.<init>(r14, r6)
            java.lang.String r6 = "清除 DexKit 缓存"
            java.lang.String r8 = "点击清除"
            java.lang.String r9 = "清除 DexKit 方法/类/字段查询缓存，下次启动会重新查询"
            android.widget.LinearLayout r0 = p000.bv1.m1063(r14, r6, r8, r9, r0)
            r13.addView(r0)
            android.view.View r0 = p000.bv1.m1064(r14)
            r13.addView(r0)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r14)
            java.lang.String r6 = "日志与诊断"
            r0.setText(r6)
            r0.setTextSize(r1)
            qu1 r6 = p000.bv1.f1856
            if (r6 == 0) goto L182
            java.lang.String r6 = r6.f9122
            p000.lz1.m3699(r6, r0, r4, r5)
            int r6 = p000.bv1.m1076(r14, r2)
            int r9 = p000.bv1.m1076(r14, r7)
            int r11 = p000.bv1.m1076(r14, r2)
            int r12 = p000.bv1.m1076(r14, r10)
            r0.setPadding(r6, r9, r11, r12)
            r13.addView(r0)
            g71 r0 = new g71
            r6 = 15
            r0.<init>(r14, r6)
            java.lang.String r6 = "查看 DyLog 日志"
            java.lang.String r9 = "点击查看"
            java.lang.String r11 = "查看 DyLog 收集的全部运行日志，并可按 TAG 过滤"
            android.widget.LinearLayout r0 = p000.bv1.m1063(r14, r6, r9, r11, r0)
            r13.addView(r0)
            android.view.View r0 = p000.bv1.m1064(r14)
            r13.addView(r0)
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r14)
            java.lang.String r6 = "用户配置数据"
            r0.setText(r6)
            r0.setTextSize(r1)
            qu1 r1 = p000.bv1.f1856
            if (r1 == 0) goto L17e
            java.lang.String r1 = r1.f9122
            p000.lz1.m3699(r1, r0, r4, r5)
            int r1 = p000.bv1.m1076(r14, r2)
            int r3 = p000.bv1.m1076(r14, r7)
            int r4 = p000.bv1.m1076(r14, r2)
            int r5 = p000.bv1.m1076(r14, r10)
            r0.setPadding(r1, r3, r4, r5)
            r13.addView(r0)
            g71 r0 = new g71
            r0.<init>(r14, r2)
            java.lang.String r1 = "导出用户配置"
            java.lang.String r2 = "保存到文件"
            java.lang.String r3 = "导出已设置的选项、账号配置、火花记录、内测状态等 DYHelper 用户配置"
            android.widget.LinearLayout r0 = p000.bv1.m1063(r14, r1, r2, r3, r0)
            r13.addView(r0)
            android.view.View r0 = p000.bv1.m1064(r14)
            r13.addView(r0)
            g71 r0 = new g71
            r1 = 17
            r0.<init>(r14, r1)
            java.lang.String r1 = "导入用户配置"
            java.lang.String r2 = "从文件恢复"
            java.lang.String r3 = "从导出的 JSON 文件恢复配置；会覆盖备份内包含的同名配置文件"
            android.widget.LinearLayout r0 = p000.bv1.m1063(r14, r1, r2, r3, r0)
            r13.addView(r0)
            android.view.View r0 = p000.bv1.m1064(r14)
            r13.addView(r0)
            g71 r0 = new g71
            r1 = 18
            r0.<init>(r14, r1)
            java.lang.String r1 = "清除全部用户配置"
            java.lang.String r2 = "清除全局配置、当前账号、其他账号、元数据、内测状态文件等全部 DYHelper 用户配置"
            android.widget.LinearLayout r0 = p000.bv1.m1063(r14, r1, r8, r2, r0)
            r13.addView(r0)
            android.view.View r0 = p000.bv1.m1064(r14)
            r13.addView(r0)
            java.lang.String r0 = "清除全部用户配置后建议重启抖音，确保所有 Hook 和内测状态重新读取默认值"
            android.widget.TextView r14 = p000.bv1.m1065(r14, r0)
            r13.addView(r14)
            return r13
        L17e:
            p000.ln0.m3650(r3)
            throw r4
        L182:
            p000.ln0.m3650(r3)
            throw r4
        L186:
            p000.ln0.m3650(r3)
            throw r4
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r31) {
            r30 = this;
            r0 = r30
            int r1 = r0.f10464
            r2 = 12
            r3 = 19
            r9 = 5
            r10 = 4
            r11 = 3
            r12 = 20
            r13 = 25
            r14 = 24
            r15 = 13
            java.lang.String r4 = ""
            r5 = 10
            r6 = 100
            r7 = 1
            r8 = 0
            switch(r1) {
                case 0: goto Le07;
                case 1: goto Ld3e;
                case 2: goto Lcc8;
                case 3: goto Lc60;
                case 4: goto Lbe3;
                case 5: goto Lba7;
                case 6: goto Lb7b;
                case 7: goto Laef;
                case 8: goto Labc;
                case 9: goto L894;
                case 10: goto L836;
                case 11: goto L801;
                case 12: goto L7e0;
                case 13: goto L797;
                case 14: goto L69c;
                case 15: goto L497;
                case 16: goto L43e;
                case 17: goto L210;
                case 18: goto L1c0;
                case 19: goto L162;
                case 20: goto L15d;
                case 21: goto L158;
                case 22: goto L153;
                case 23: goto L14e;
                case 24: goto Le3;
                case 25: goto Lde;
                case 26: goto Ld9;
                case 27: goto Ld4;
                case 28: goto Lcf;
                default: goto L1e;
            }
        L1e:
            r1 = r31
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            be0 r0 = p000.be0.f1670
            r0.m936()
            boolean r2 = p000.AbstractC0976x9.m6526()
            android.widget.LinearLayout r3 = p000.bv1.m1062(r1)
            qm1 r4 = new qm1
            r4.<init>()
            if (r2 == 0) goto L51
            java.util.List r5 = r0.m943()
            int r5 = r5.size()
            java.lang.String r6 = "当前账号已隐藏 "
            java.lang.String r9 = " 人"
            java.lang.String r5 = p000.AbstractC0602nx.m4127(r6, r5, r9)
            goto L53
        L51:
            java.lang.String r5 = "已锁定 · 仅限内测用户"
        L53:
            android.widget.TextView r5 = p000.bv1.m1065(r1, r5)
            java.lang.String r6 = "仅限内测用户使用"
            if (r2 == 0) goto L5e
            java.lang.String r9 = "关注、粉丝、消息、搜索和视频分享"
            goto L5f
        L5e:
            r9 = r6
        L5f:
            boolean r0 = r0.m938()
            kt1 r10 = new kt1
            r10.<init>(r4, r1, r8)
            java.lang.String r11 = "启用隐藏联系人"
            android.widget.LinearLayout r0 = p000.bv1.m1073(r1, r11, r9, r0, r10)
            p000.AbstractC0602nx.m4141(r3, r0, r1)
            if (r2 == 0) goto L75
            java.lang.String r6 = "在操作面板显示临时显示/恢复按钮；退出抖音后按总开关恢复隐藏"
        L75:
            java.lang.String r0 = "hidden_contact_operation_toggle_enabled"
            boolean r0 = p000.ui1.m5887(r0, r8)
            kt1 r2 = new kt1
            r2.<init>(r4, r1, r7)
            java.lang.String r4 = "操作面板临时显示按钮"
            android.widget.LinearLayout r0 = p000.bv1.m1073(r1, r4, r6, r0, r2)
            p000.AbstractC0602nx.m4141(r3, r0, r1)
            java.lang.String r0 = "hidden_contact_peek_duration_seconds"
            r2 = 30
            android.content.SharedPreferences r4 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L95
            int r2 = r4.getInt(r0, r2)     // Catch: java.lang.Throwable -> L95
        L95:
            java.lang.String r0 = " 秒"
            java.lang.String r0 = p000.lz1.m3686(r0, r2)
            jt1 r2 = new jt1
            r2.<init>(r1, r7)
            java.lang.String r4 = "双击显示时长"
            java.lang.String r6 = "双击消息页顶部\"消息\"文字后临时显示联系人的持续时长（5~300 秒）"
            android.widget.LinearLayout r0 = p000.bv1.m1063(r1, r4, r0, r6, r2)
            r3.addView(r0)
            android.view.View r0 = p000.bv1.m1064(r1)
            r3.addView(r0)
            q61 r0 = new q61
            r0.<init>(r1, r5, r7)
            java.lang.String r2 = "联系人菜单"
            java.lang.String r4 = "打开"
            java.lang.String r6 = "添加联系人、搜索和管理隐藏名单"
            android.widget.LinearLayout r0 = p000.bv1.m1063(r1, r2, r4, r6, r0)
            r3.addView(r0)
            android.view.View r0 = p000.bv1.m1064(r1)
            r3.addView(r0)
            r3.addView(r5)
            return r3
        Lcf:
            java.lang.Object r0 = r30.m5754(r31)
            return r0
        Ld4:
            java.lang.Object r0 = r30.m5753(r31)
            return r0
        Ld9:
            java.lang.Object r0 = r30.m5752(r31)
            return r0
        Lde:
            java.lang.Object r0 = r30.m5751(r31)
            return r0
        Le3:
            r1 = r31
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r1)
            java.lang.String r5 = "download_path_template"
            java.lang.String r4 = p000.ui1.m5893(r5, r4)
            boolean r5 = p000.q02.m4671(r4)
            if (r5 == 0) goto L103
            java.lang.String r4 = "系统默认目录"
        L103:
            g71 r5 = new g71
            r5.<init>(r1, r3)
            java.lang.String r3 = "下载路径设置"
            java.lang.String r6 = "统一配置视频、图片、动图、LivePhoto、音乐、评论图片、评论语音和表情包"
            android.widget.LinearLayout r3 = p000.bv1.m1063(r1, r3, r4, r6, r5)
            r0.addView(r3)
            android.view.View r3 = p000.bv1.m1064(r1)
            r0.addView(r3)
            java.lang.String r3 = "comment_emoji_convert_format_enabled"
            boolean r3 = p000.ui1.m5887(r3, r7)
            oq1 r4 = new oq1
            r4.<init>(r2)
            java.lang.String r2 = "表情包自动转换格式"
            java.lang.String r5 = "默认开启：动画 WebP 下载后逐帧转换为 GIF，静态表情转换为 PNG"
            android.widget.LinearLayout r2 = p000.bv1.m1073(r1, r2, r5, r3, r4)
            r0.addView(r2)
            android.view.View r2 = p000.bv1.m1064(r1)
            r0.addView(r2)
            java.lang.String r2 = "live_photo_merge_after_download"
            boolean r2 = p000.ui1.m5887(r2, r8)
            oq1 r3 = new oq1
            r3.<init>(r15)
            java.lang.String r4 = "下载后合并动图"
            java.lang.String r5 = "LivePhoto 下载时优先调用抖音官方保存能力，失败后再使用 DYHelper 兼容合并"
            android.widget.LinearLayout r1 = p000.bv1.m1073(r1, r4, r5, r2, r3)
            r0.addView(r1)
            return r0
        L14e:
            java.lang.Object r0 = r30.m5750(r31)
            return r0
        L153:
            java.lang.Object r0 = r30.m5747(r31)
            return r0
        L158:
            java.lang.Object r0 = r30.m5749(r31)
            return r0
        L15d:
            java.lang.Object r0 = r30.m5748(r31)
            return r0
        L162:
            r2 = r31
            android.app.Activity r2 = (android.app.Activity) r2
            r2.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r1 = p000.bv1.m1062(r2)
            java.lang.String r0 = "profile_uid_show_enabled"
            boolean r5 = p000.ui1.m5887(r0, r8)
            oq1 r6 = new oq1
            r0 = 23
            r6.<init>(r0)
            java.lang.String r3 = "显示用户 UID"
            java.lang.String r4 = "在个人主页“抖音号”下方显示该用户的数字 UID，点击可复制"
            p000.bv1.m1058(r1, r2, r3, r4, r5, r6)
            p000.bv1.m1056(r1, r2)
            java.lang.String r0 = "profile_bookmark_hook_enabled"
            boolean r5 = p000.ui1.m5887(r0, r8)
            oq1 r6 = new oq1
            r6.<init>(r14)
            java.lang.String r3 = "启用主页书签功能"
            java.lang.String r4 = "控制主页书签 Hook 是否安装；关闭后不会在主页处理书签逻辑"
            p000.bv1.m1058(r1, r2, r3, r4, r5, r6)
            p000.bv1.m1056(r1, r2)
            java.lang.String r0 = "profile_bookmark_show_enabled"
            boolean r5 = p000.ui1.m5887(r0, r8)
            oq1 r6 = new oq1
            r6.<init>(r13)
            java.lang.String r3 = "显示个人主页书签按钮"
            java.lang.String r4 = "在个人主页注入「添加书签」按钮，方便快速订阅该作者更新"
            p000.bv1.m1058(r1, r2, r3, r4, r5, r6)
            p000.bv1.m1056(r1, r2)
            java.lang.String r0 = "关闭“启用主页书签功能”后，主页书签逻辑整体不安装"
            p000.bv1.m1057(r1, r2, r0)
            java.lang.String r0 = "修改后重新进入个人主页生效"
            p000.bv1.m1057(r1, r2, r0)
            return r1
        L1c0:
            r4 = r31
            android.app.Activity r4 = (android.app.Activity) r4
            r4.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r3 = p000.bv1.m1062(r4)
            java.lang.String r0 = "immersive_status_bar_enabled"
            boolean r13 = p000.ui1.m5887(r0, r8)
            oq1 r14 = new oq1
            r14.<init>(r12)
            java.lang.String r11 = "启用沉浸式状态栏"
            java.lang.String r12 = "隐藏顶部系统状态栏，包括时间、电量、通知图标等"
            r9 = r3
            r10 = r4
            p000.bv1.m1058(r9, r10, r11, r12, r13, r14)
            p000.bv1.m1056(r3, r4)
            java.lang.String r0 = "immersive_navigation_bar_enabled"
            boolean r7 = p000.ui1.m5887(r0, r8)
            oq1 r8 = new oq1
            r0 = 21
            r8.<init>(r0)
            java.lang.String r5 = "同时隐藏导航栏/手势条"
            java.lang.String r6 = "隐藏底部三键导航栏或安卓手势小白条，实现更完整的全屏沉浸效果"
            p000.bv1.m1058(r3, r4, r5, r6, r7, r8)
            p000.bv1.m1056(r3, r4)
            java.lang.String r0 = "开启“沉浸式状态栏”后，将隐藏顶部系统状态栏。"
            p000.bv1.m1057(r3, r4, r0)
            java.lang.String r0 = "开启“同时隐藏导航栏/手势条”后，会进一步隐藏底部导航栏或安卓手势条。"
            p000.bv1.m1057(r3, r4, r0)
            java.lang.String r0 = "提示：不一定成功"
            p000.bv1.m1057(r3, r4, r0)
            return r3
        L210:
            r15 = r31
            android.app.Activity r15 = (android.app.Activity) r15
            r15.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r15)
            boolean r1 = p000.i81.m2670(r15)
            if (r1 != 0) goto L230
            java.lang.String r0 = "清爽模式是内测功能，需要内测资格才能使用"
            android.widget.LinearLayout r0 = p000.bv1.m1061(r15, r0)
            goto L43d
        L230:
            java.lang.String r1 = "clean_mode_enabled"
            boolean r18 = p000.ui1.m5887(r1, r8)
            ct1 r1 = new ct1
            r1.<init>(r15, r14)
            java.lang.String r16 = "启用清爽模式"
            java.lang.String r17 = "调整播放页面控件透明度，打造沉浸式观看体验"
            r14 = r0
            r19 = r1
            p000.bv1.m1058(r14, r15, r16, r17, r18, r19)
            p000.bv1.m1056(r14, r15)
            java.lang.String r0 = "clean_right_panel_alpha"
            r1 = 40
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L255
            int r0 = r2.getInt(r0, r1)     // Catch: java.lang.Throwable -> L255
            goto L256
        L255:
            r0 = r1
        L256:
            int r23 = p000.j81.m2906(r0, r8, r6)
            kv0 r0 = new kv0
            r0.<init>(r15, r11)
            java.lang.String r22 = "右侧互动区透明度"
            r24 = 100
            r25 = 0
            java.lang.String r26 = "%"
            java.lang.String r27 = "控制点赞、评论、分享、头像、右下角唱片等控件的透明度"
            r28 = r0
            r21 = r15
            android.widget.LinearLayout r0 = p000.bv1.m1070(r21, r22, r23, r24, r25, r26, r27, r28)
            r14.addView(r0)
            p000.bv1.m1056(r14, r15)
            java.lang.String r0 = "clean_bottom_info_alpha"
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L282
            int r0 = r2.getInt(r0, r1)     // Catch: java.lang.Throwable -> L282
            goto L283
        L282:
            r0 = r1
        L283:
            int r23 = p000.j81.m2906(r0, r8, r6)
            kv0 r0 = new kv0
            r0.<init>(r15, r10)
            java.lang.String r22 = "底部信息区透明度"
            r24 = 100
            r25 = 0
            java.lang.String r26 = "%"
            java.lang.String r27 = "控制作者名、描述文案、音乐信息的透明度"
            r28 = r0
            r21 = r15
            android.widget.LinearLayout r0 = p000.bv1.m1070(r21, r22, r23, r24, r25, r26, r27, r28)
            r14.addView(r0)
            p000.bv1.m1056(r14, r15)
            java.lang.String r0 = "clean_top_bar_alpha"
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L2ae
            int r1 = r2.getInt(r0, r1)     // Catch: java.lang.Throwable -> L2ae
        L2ae:
            int r23 = p000.j81.m2906(r1, r8, r6)
            kv0 r0 = new kv0
            r0.<init>(r15, r9)
            java.lang.String r22 = "顶栏透明度"
            r24 = 100
            r25 = 0
            java.lang.String r26 = "%"
            java.lang.String r27 = "控制首页顶部标题栏 / 顶部 TAB 区域透明度"
            r28 = r0
            r21 = r15
            android.widget.LinearLayout r0 = p000.bv1.m1070(r21, r22, r23, r24, r25, r26, r27, r28)
            r14.addView(r0)
            p000.bv1.m1056(r14, r15)
            g71 r0 = new g71
            r0.<init>(r15, r5)
            java.lang.String r1 = "杂项控件管理"
            java.lang.String r2 = "进入"
            java.lang.String r3 = "分别管理底栏杂项、全屏观看和 Feed 弹幕按钮"
            android.widget.LinearLayout r0 = p000.bv1.m1063(r15, r1, r2, r3, r0)
            r14.addView(r0)
            p000.bv1.m1056(r14, r15)
            java.lang.String r0 = "clean_auto_hide"
            boolean r18 = p000.ui1.m5887(r0, r8)
            ct1 r0 = new ct1
            r0.<init>(r15, r11)
            java.lang.String r16 = "视频暂停显示控件开关"
            java.lang.String r17 = "清爽模式子功能：视频暂停时临时恢复播放页控件显示，继续播放后恢复清爽透明度"
            r19 = r0
            p000.bv1.m1058(r14, r15, r16, r17, r18, r19)
            p000.bv1.m1056(r14, r15)
            java.lang.String r0 = "clean_touch_restore_controls"
            boolean r18 = p000.ui1.m5887(r0, r8)
            ct1 r0 = new ct1
            r0.<init>(r15, r10)
            java.lang.String r16 = "触控恢复控件显示"
            java.lang.String r17 = "触摸播放页时临时恢复播放页控件显示，松手后恢复清爽透明度"
            r19 = r0
            p000.bv1.m1058(r14, r15, r16, r17, r18, r19)
            p000.bv1.m1056(r14, r15)
            java.lang.String r0 = "clean_pause_show_bottom_bar"
            boolean r18 = p000.ui1.m5887(r0, r8)
            ct1 r0 = new ct1
            r0.<init>(r15, r9)
            java.lang.String r16 = "暂停时恢复底栏显示"
            java.lang.String r17 = "视频暂停显示控件时，同时临时恢复底栏显示（不影响发布按钮隐藏）"
            r19 = r0
            p000.bv1.m1058(r14, r15, r16, r17, r18, r19)
            p000.bv1.m1056(r14, r15)
            java.lang.String r0 = "clean_progress_bar_enabled"
            boolean r18 = p000.ui1.m5887(r0, r8)
            ct1 r0 = new ct1
            r1 = 6
            r0.<init>(r15, r1)
            java.lang.String r16 = "进度条透明度控制"
            java.lang.String r17 = "启用后可自定义视频进度条的透明度"
            r19 = r0
            p000.bv1.m1058(r14, r15, r16, r17, r18, r19)
            p000.bv1.m1056(r14, r15)
            java.lang.String r0 = "clean_progress_bar_alpha"
            r1 = 1053609165(0x3ecccccd, float:0.4)
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L34e
            float r1 = r2.getFloat(r0, r1)     // Catch: java.lang.Throwable -> L34e
        L34e:
            r0 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = p000.j81.m2905(r1, r0, r2)
            float r1 = (float) r6
            float r0 = r0 * r1
            int r0 = (int) r0
            int r22 = p000.j81.m2906(r0, r8, r6)
            nq1 r0 = new nq1
            r1 = 28
            r0.<init>(r1)
            java.lang.String r21 = "进度条播放透明度"
            r23 = 100
            r24 = 0
            java.lang.String r25 = "%"
            java.lang.String r26 = "控制视频播放时进度条的透明度（0=全透明，100=不透明）"
            r27 = r0
            r20 = r15
            android.widget.LinearLayout r0 = p000.bv1.m1070(r20, r21, r22, r23, r24, r25, r26, r27)
            r14.addView(r0)
            p000.bv1.m1056(r14, r15)
            java.lang.String r0 = "clean_progress_bar_restore_alpha_on_pause"
            boolean r0 = p000.ui1.m5887(r0, r7)
            r9 = r14
            ct1 r14 = new ct1
            r14.<init>(r15, r13)
            java.lang.String r11 = "暂停时恢复完全不透明"
            java.lang.String r12 = "视频暂停/停止时将进度条恢复为完全不透明（100%）"
            r13 = r0
            r10 = r15
            p000.bv1.m1058(r9, r10, r11, r12, r13, r14)
            r14 = r9
            p000.bv1.m1056(r14, r15)
            java.lang.String r0 = "clean_progress_bar_only_in_clean_mode"
            boolean r13 = p000.ui1.m5887(r0, r7)
            ct1 r14 = new ct1
            r0 = 26
            r14.<init>(r15, r0)
            java.lang.String r11 = "仅在清爽模式下生效"
            java.lang.String r12 = "开启后，进度条透明度控制仅在清爽模式启用时生效"
            p000.bv1.m1058(r9, r10, r11, r12, r13, r14)
            r14 = r9
            p000.bv1.m1056(r14, r15)
            java.lang.String r0 = "bottom_bar_hidden"
            boolean r13 = p000.ui1.m5887(r0, r8)
            um1 r0 = new um1
            r0.<init>()
            ic r14 = new ic
            r1 = 9
            r14.<init>(r15, r1, r0)
            java.lang.String r11 = "底栏隐藏"
            java.lang.String r12 = "开启后隐藏原底栏并让视频延伸到底部；下方开关可让播放控件保留安全位置"
            p000.bv1.m1058(r9, r10, r11, r12, r13, r14)
            r14 = r9
            p000.bv1.m1056(r14, r15)
            java.lang.String r0 = "bottom_bar_show_text"
            boolean r13 = p000.ui1.m5887(r0, r7)
            ct1 r14 = new ct1
            r14.<init>(r15, r8)
            java.lang.String r11 = "显示底栏文字"
            java.lang.String r12 = "与底栏隐藏同时开启时保留 TAB 文字；图标和背景继续隐藏，视频仍延伸到底部"
            p000.bv1.m1058(r9, r10, r11, r12, r13, r14)
            r5 = r9
            p000.bv1.m1056(r5, r15)
            java.lang.String r0 = "bottom_bar_text_alpha"
            android.content.SharedPreferences r1 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L3ea
            int r0 = r1.getInt(r0, r6)     // Catch: java.lang.Throwable -> L3ea
            goto L3eb
        L3ea:
            r0 = r6
        L3eb:
            int r11 = p000.j81.m2906(r0, r8, r6)
            kv0 r0 = new kv0
            r1 = 2
            r0.<init>(r15, r1)
            java.lang.String r10 = "底栏文字透明度"
            r12 = 100
            r13 = 0
            java.lang.String r14 = "%"
            r21 = r15
            java.lang.String r15 = "控制底栏文字的透明度（0=全透明，100=不透明）"
            r16 = r0
            r9 = r21
            android.widget.LinearLayout r0 = p000.bv1.m1070(r9, r10, r11, r12, r13, r14, r15, r16)
            r15 = r9
            r5.addView(r0)
            p000.bv1.m1056(r5, r15)
            java.lang.String r0 = "bottom_bar_hide_badge"
            boolean r13 = p000.ui1.m5887(r0, r8)
            ct1 r14 = new ct1
            r14.<init>(r15, r7)
            java.lang.String r11 = "始终隐藏消息红点"
            java.lang.String r12 = "底栏隐藏生效时不显示消息红点和数字角标；关闭时红点跟随底栏文字透明度"
            r9 = r5
            r10 = r15
            p000.bv1.m1058(r9, r10, r11, r12, r13, r14)
            r14 = r9
            p000.bv1.m1056(r14, r15)
            java.lang.String r0 = "hide_tab_publish"
            boolean r9 = p000.ui1.m5887(r0, r8)
            ct1 r10 = new ct1
            r1 = 2
            r10.<init>(r15, r1)
            java.lang.String r7 = "隐藏加号按钮"
            java.lang.String r8 = "隐藏底部导航栏的发布/加号按钮"
            r5 = r14
            r6 = r15
            p000.bv1.m1058(r5, r6, r7, r8, r9, r10)
            r0 = r14
        L43d:
            return r0
        L43e:
            r1 = r31
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r1)
            sm1 r2 = new sm1
            r2.<init>()
            java.lang.String r3 = "liquid_glass_bottom_bar_scale_percent"
            android.content.SharedPreferences r4 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L45f
            int r6 = r4.getInt(r3, r6)     // Catch: java.lang.Throwable -> L45f
        L45f:
            r3 = 50
            r4 = 150(0x96, float:2.1E-43)
            int r3 = p000.j81.m2906(r6, r3, r4)
            r2.f9967 = r3
            ys1 r3 = p000.zs1.f13253
            java.util.List r3 = p000.AbstractC1021yh.m6896(r3)
            p000.bv1.m1055(r0, r1, r3, r8)
            p000.bv1.m1056(r0, r1)
            int r3 = r2.f9967
            cl1 r8 = new cl1
            r4 = 2
            r8.<init>(r4, r2)
            java.lang.String r2 = "底栏缩放"
            r4 = 150(0x96, float:2.1E-43)
            r5 = 50
            java.lang.String r6 = "%"
            java.lang.String r7 = "同时调整玻璃胶囊、图标、文字和触摸区域，默认 100%"
            android.widget.LinearLayout r2 = p000.bv1.m1070(r1, r2, r3, r4, r5, r6, r7, r8)
            r0.addView(r2)
            p000.bv1.m1056(r0, r1)
            java.lang.String r2 = "Android 13 及以上启用实时折射模糊；Android 11/12 自动使用半透明玻璃降级。开启时会暂时接管“底栏隐藏”，关闭后恢复原隐藏设置。"
            p000.bv1.m1057(r0, r1, r2)
            return r0
        L497:
            r1 = r31
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            bv1 r2 = p000.bv1.f1853
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r1)
            boolean r2 = p000.i81.m2670(r1)
            com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore r3 = com.example.dyhelper.hook.comment.bookmark.CommentBookmarkStore.INSTANCE     // Catch: java.lang.Throwable -> L4ba
            java.util.List r3 = r3.all()     // Catch: java.lang.Throwable -> L4ba
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L4ba
            goto L4bb
        L4ba:
            r3 = r8
        L4bb:
            r4 = 1065353216(0x3f800000, float:1.0)
            r6 = -2
            r9 = 1095761920(0x41500000, float:13.0)
            java.lang.String r11 = "theme"
            if (r2 != 0) goto L572
            android.widget.LinearLayout r12 = p000.AbstractC0602nx.m4123(r1, r7)
            r13 = 16
            int r14 = p000.bv1.m1076(r1, r13)
            int r15 = p000.bv1.m1076(r1, r13)
            int r5 = p000.bv1.m1076(r1, r13)
            int r8 = p000.bv1.m1076(r1, r13)
            r12.setPadding(r14, r15, r5, r8)
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r5.<init>()
            qu1 r8 = p000.bv1.f1856
            if (r8 == 0) goto L56c
            java.lang.String r8 = r8.f9130
            int r8 = android.graphics.Color.parseColor(r8)
            r5.setColor(r8)
            r8 = 8
            int r13 = p000.bv1.m1076(r1, r8)
            float r8 = (float) r13
            r5.setCornerRadius(r8)
            r12.setBackground(r5)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r1)
            java.lang.String r8 = "🔒 内测功能"
            r5.setText(r8)
            r8 = 1097859072(0x41700000, float:15.0)
            r5.setTextSize(r8)
            qu1 r8 = p000.bv1.f1856
            if (r8 == 0) goto L566
            java.lang.String r8 = r8.f9129
            int r8 = android.graphics.Color.parseColor(r8)
            r5.setTextColor(r8)
            r8 = 0
            r5.setTypeface(r8, r7)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r13 = -1
            r8.<init>(r13, r6)
            r13 = 8
            int r14 = p000.bv1.m1076(r1, r13)
            r8.bottomMargin = r14
            r5.setLayoutParams(r8)
            r12.addView(r5)
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r1)
            java.lang.String r8 = "进入抖音自动扫描和主动查询功能仅限内测用户使用\n\n请先完成内测验证以解锁完整功能"
            r5.setText(r8)
            r5.setTextSize(r9)
            qu1 r8 = p000.bv1.f1856
            if (r8 == 0) goto L560
            java.lang.String r8 = r8.f9123
            int r8 = android.graphics.Color.parseColor(r8)
            r5.setTextColor(r8)
            int r8 = p000.bv1.m1076(r1, r10)
            float r8 = (float) r8
            r5.setLineSpacing(r8, r4)
            r12.addView(r5)
            r0.addView(r12)
            android.view.View r5 = p000.bv1.m1064(r1)
            r0.addView(r5)
            goto L572
        L560:
            p000.ln0.m3650(r11)
            r18 = 0
            throw r18
        L566:
            r18 = 0
            p000.ln0.m3650(r11)
            throw r18
        L56c:
            r18 = 0
            p000.ln0.m3650(r11)
            throw r18
        L572:
            java.lang.String r5 = "comment_bookmark_auto_scan_enabled"
            r8 = 0
            boolean r5 = p000.ui1.m5887(r5, r8)
            ct1 r10 = new ct1
            r12 = 7
            r10.<init>(r1, r12)
            java.lang.String r12 = "进入抖音自动扫描书签评论"
            java.lang.String r13 = "启动后自动查询所有书签评论的新回复，无需手动打开列表"
            android.widget.LinearLayout r5 = p000.bv1.m1073(r1, r12, r13, r5, r10)
            r0.addView(r5)
            android.view.View r5 = p000.bv1.m1064(r1)
            r0.addView(r5)
            java.lang.String r5 = "comment_panel_hook_enabled"
            boolean r5 = p000.ui1.m5887(r5, r8)
            oq1 r8 = new oq1
            r10 = 10
            r8.<init>(r10)
            java.lang.String r10 = "启用评论长按面板扩展"
            java.lang.String r12 = "长按评论面板添加 复制原评论和书签按钮"
            android.widget.LinearLayout r5 = p000.bv1.m1073(r1, r10, r12, r5, r8)
            r0.addView(r5)
            android.view.View r5 = p000.bv1.m1064(r1)
            r0.addView(r5)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r1)
            r5.setOrientation(r7)
            r13 = 16
            int r8 = p000.bv1.m1076(r1, r13)
            r10 = 13
            int r12 = p000.bv1.m1076(r1, r10)
            int r13 = p000.bv1.m1076(r1, r13)
            int r10 = p000.bv1.m1076(r1, r10)
            r5.setPadding(r8, r12, r13, r10)
            java.lang.String r8 = "书签统计"
            r10 = 1096810496(0x41600000, float:14.0)
            android.widget.TextView r8 = p000.lz1.m3683(r1, r8, r10)
            qu1 r10 = p000.bv1.f1856
            if (r10 == 0) goto L696
            java.lang.String r10 = r10.f9122
            r12 = 0
            p000.lz1.m3699(r10, r8, r12, r7)
            r5.addView(r8)
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r8.<init>(r1)
            r10 = 0
            r8.setOrientation(r10)
            r13 = 8
            int r12 = p000.bv1.m1076(r1, r13)
            r8.setPadding(r10, r12, r10, r10)
            java.lang.String r12 = "当前书签数："
            android.widget.TextView r12 = p000.lz1.m3683(r1, r12, r9)
            qu1 r13 = p000.bv1.f1856
            if (r13 == 0) goto L690
            java.lang.String r13 = r13.f9123
            int r13 = android.graphics.Color.parseColor(r13)
            r12.setTextColor(r13)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r13.<init>(r10, r6, r4)
            r12.setLayoutParams(r13)
            r8.addView(r12)
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r1)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r10 = " 条"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            r4.setText(r6)
            r4.setTextSize(r9)
            if (r3 <= 0) goto L643
            qu1 r3 = p000.bv1.f1856
            if (r3 == 0) goto L63e
            java.lang.String r3 = r3.f9125
            int r3 = android.graphics.Color.parseColor(r3)
            r12 = 0
            goto L64e
        L63e:
            p000.ln0.m3650(r11)
            r12 = 0
            throw r12
        L643:
            r12 = 0
            qu1 r3 = p000.bv1.f1856
            if (r3 == 0) goto L68a
            java.lang.String r3 = r3.f9124
            int r3 = android.graphics.Color.parseColor(r3)
        L64e:
            r4.setTextColor(r3)
            r4.setTypeface(r12, r7)
            r8.addView(r4)
            r5.addView(r8)
            r0.addView(r5)
            android.view.View r3 = p000.bv1.m1064(r1)
            r0.addView(r3)
            if (r2 == 0) goto L680
            java.lang.String r2 = "开启自动扫描后，进入抖音会延迟5秒开始查询所有书签评论"
            android.widget.TextView r2 = p000.bv1.m1065(r1, r2)
            r0.addView(r2)
            android.view.View r2 = p000.bv1.m1064(r1)
            r0.addView(r2)
            java.lang.String r2 = "检测到新回复时会发送系统通知提醒"
            android.widget.TextView r1 = p000.bv1.m1065(r1, r2)
            r0.addView(r1)
            goto L689
        L680:
            java.lang.String r2 = "内测用户可解锁自动扫描和主动查询功能"
            android.widget.TextView r1 = p000.bv1.m1065(r1, r2)
            r0.addView(r1)
        L689:
            return r0
        L68a:
            p000.ln0.m3650(r11)
            r18 = 0
            throw r18
        L690:
            r18 = 0
            p000.ln0.m3650(r11)
            throw r18
        L696:
            r18 = 0
            p000.ln0.m3650(r11)
            throw r18
        L69c:
            r9 = r31
            android.app.Activity r9 = (android.app.Activity) r9
            r9.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r9)
            java.lang.String r1 = "voice_replace_enabled"
            r8 = 0
            boolean r1 = p000.ui1.m5887(r1, r8)
            ct1 r3 = new ct1
            r5 = 11
            r3.<init>(r9, r5)
            java.lang.String r5 = "启用语音替换"
            java.lang.String r6 = "在评论区或私信语音录制完成时，用已选择的 MP3 文件替代本次语音"
            android.widget.LinearLayout r1 = p000.bv1.m1073(r9, r5, r6, r1, r3)
            p000.AbstractC0602nx.m4141(r0, r1, r9)
            java.lang.String[] r10 = p000.kn0.f6043
            java.lang.String r1 = "voice_replace_scope"
            android.content.SharedPreferences r3 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L6d5
            r8 = 0
            int r1 = r3.getInt(r1, r8)     // Catch: java.lang.Throwable -> L6d5
            goto L6d6
        L6d5:
            r1 = 0
        L6d6:
            xm0 r3 = p000.AbstractC0312g7.m2251(r10)
            int r11 = p000.j81.m2907(r1, r3)
            r1 = r10[r11]
            gt1 r8 = new gt1
            r13 = 0
            r12 = r9
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.String r3 = "作用范围"
            java.lang.String r5 = "选择在哪些语音发送场景启用替换"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r9, r3, r1, r5, r8)
            p000.AbstractC0602nx.m4141(r0, r1, r9)
            java.lang.String[] r10 = p000.kn0.f6044
            java.lang.String r1 = "voice_replace_mode"
            android.content.SharedPreferences r3 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L700
            r8 = 0
            int r8 = r3.getInt(r1, r8)     // Catch: java.lang.Throwable -> L700
            goto L701
        L700:
            r8 = 0
        L701:
            xm0 r1 = p000.AbstractC0312g7.m2251(r10)
            int r11 = p000.j81.m2907(r8, r1)
            r1 = r10[r11]
            gt1 r8 = new gt1
            r13 = 1
            r12 = r9
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.String r3 = "替换方式"
            java.lang.String r5 = "每次询问或自动替换录音结果"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r9, r3, r1, r5, r8)
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r9)
            r0.addView(r1)
            java.lang.String r1 = "voice_replace_confirm_before_send"
            boolean r1 = p000.ui1.m5887(r1, r7)
            ct1 r3 = new ct1
            r3.<init>(r9, r2)
            java.lang.String r2 = "发送前确认"
            java.lang.String r5 = "替换方式为每次询问时，录音完成后弹窗选择使用 MP3 或原语音"
            android.widget.LinearLayout r1 = p000.bv1.m1073(r9, r2, r5, r1, r3)
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r9)
            r0.addView(r1)
            int r1 = p000.bv1.m1032()
            if (r1 <= 0) goto L74e
            java.lang.String r2 = " 个音频"
            java.lang.String r1 = p000.lz1.m3686(r2, r1)
            goto L75c
        L74e:
            java.lang.String r1 = "voice_replace_mp3_name"
            java.lang.String r1 = p000.ui1.m5893(r1, r4)
            boolean r2 = p000.q02.m4671(r1)
            if (r2 == 0) goto L75c
            java.lang.String r1 = "未选择"
        L75c:
            et1 r2 = new et1
            r2.<init>(r9, r9, r7)
            java.lang.String r3 = "音频管理"
            java.lang.String r4 = "录音完成后的弹窗中可继续添加、播放和选择音频"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r9, r3, r1, r4, r2)
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r9)
            r0.addView(r1)
            kv0 r1 = new kv0
            r12 = 7
            r1.<init>(r9, r12)
            java.lang.String r2 = "清除音频列表"
            java.lang.String r3 = "清除"
            java.lang.String r4 = "清空已添加的替换音频"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r9, r2, r3, r4, r1)
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r9)
            r0.addView(r1)
            java.lang.String r1 = "评论区音频超过 30 秒会自动裁切。发送时会复制到宿主语音缓存目录，并沿用宿主的语音发送流程。"
            android.widget.TextView r1 = p000.bv1.m1065(r9, r1)
            r0.addView(r1)
            return r0
        L797:
            r1 = r31
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r1)
            java.lang.String[] r2 = p000.kn0.f6042
            java.lang.String r3 = "comment_audio_download_trigger_mode"
            android.content.SharedPreferences r4 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L7b5
            int r7 = r4.getInt(r3, r7)     // Catch: java.lang.Throwable -> L7b5
        L7b5:
            xm0 r3 = p000.AbstractC0312g7.m2251(r2)
            int r3 = p000.j81.m2907(r7, r3)
            r3 = r2[r3]
            g71 r4 = new g71
            r4.<init>(r2, r1)
            java.lang.String r2 = "触发方案"
            java.lang.String r5 = "默认使用绿色圆角下载按钮；可改为双击宿主播放控件或两者同时启用"
            android.widget.LinearLayout r2 = p000.bv1.m1063(r1, r2, r3, r5, r4)
            r0.addView(r2)
            android.view.View r2 = p000.bv1.m1064(r1)
            r0.addView(r2)
            java.lang.String r2 = "双击方案监听宿主播放控件的点击结果，不再覆盖长按；按钮方案会在语音控件下方添加绿色圆角下载按钮。"
            android.widget.TextView r1 = p000.bv1.m1065(r1, r2)
            r0.addView(r1)
            return r0
        L7e0:
            r1 = r31
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            ys1 r0 = p000.zs1.f13271
            java.lang.String r2 = "开启后会自动缓存无水印原图链接，当检测到水印图片时进行替换"
            android.widget.LinearLayout r0 = p000.bv1.m1072(r1, r0, r2)
            bv1 r2 = p000.bv1.f1853
            p000.bv1.m1056(r0, r1)
            java.lang.String r2 = "仅对 douyinpic.com 域名下的 tos-cn-i- 图片生效"
            p000.bv1.m1057(r0, r1, r2)
            return r0
        L801:
            r1 = r31
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r1)
            boolean r2 = p000.i81.m2670(r1)
            if (r2 != 0) goto L820
            java.lang.String r0 = "底栏 TAB 过滤是内测功能，需要内测资格才能使用"
            android.widget.LinearLayout r0 = p000.bv1.m1061(r1, r0)
            goto L835
        L820:
            java.lang.String r2 = "选择要隐藏的底栏 Tab（「首页」始终保留不可隐藏）"
            p000.bv1.m1057(r0, r1, r2)
            p000.bv1.m1056(r0, r1)
            java.util.List r2 = p000.zs1.f13254
            p000.bv1.m1055(r0, r1, r2, r7)
            p000.bv1.m1056(r0, r1)
            java.lang.String r2 = "切换页面或重启抖音后生效"
            p000.bv1.m1057(r0, r1, r2)
        L835:
            return r0
        L836:
            r1 = r31
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r1)
            java.lang.String r2 = "precise_time_enabled"
            r8 = 0
            boolean r2 = p000.ui1.m5887(r2, r8)
            oq1 r4 = new oq1
            r4.<init>(r3)
            java.lang.String r3 = "启用评论精确时间"
            java.lang.String r5 = "将评论区相对时间（如：刚刚、3小时前）替换为精确时间"
            android.widget.LinearLayout r2 = p000.bv1.m1073(r1, r3, r5, r2, r4)
            r0.addView(r2)
            android.view.View r2 = p000.bv1.m1064(r1)
            r0.addView(r2)
            java.lang.String r2 = "precise_time_format"
            java.lang.String r3 = "yyyy-MM-dd HH:mm"
            java.lang.String r2 = p000.ui1.m5893(r2, r3)
            java.lang.String r2 = p000.bv1.m1042(r2, r12)
            jt1 r3 = new jt1
            r4 = 2
            r3.<init>(r1, r4)
            java.lang.String r4 = "时间格式"
            java.lang.String r5 = "自定义评论时间显示格式，支持 yyyy MM dd HH mm ss"
            android.widget.LinearLayout r2 = p000.bv1.m1063(r1, r4, r2, r5, r3)
            r0.addView(r2)
            android.view.View r2 = p000.bv1.m1064(r1)
            r0.addView(r2)
            java.lang.String r2 = "常用格式 yyyy-MM-dd HH:mm 或 MM-dd HH:mm:ss"
            android.widget.TextView r1 = p000.bv1.m1065(r1, r2)
            r0.addView(r1)
            return r0
        L894:
            r8 = r31
            android.app.Activity r8 = (android.app.Activity) r8
            r8.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            java.lang.String r1 = "comment_panel_width_px"
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r8)
            java.lang.String r2 = "纯色背景"
            java.lang.String r3 = "自定义图片"
            java.lang.String r5 = "默认"
            java.lang.String[] r2 = new java.lang.String[]{r5, r2, r3}
            sm1 r3 = new sm1
            r3.<init>()
            java.lang.String r9 = "comment_bg_mode"
            android.content.SharedPreferences r10 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L8c3
            r11 = 0
            int r9 = r10.getInt(r9, r11)     // Catch: java.lang.Throwable -> L8c3
            goto L8c4
        L8c3:
            r9 = 0
        L8c4:
            r3.f9967 = r9
            android.widget.LinearLayout r26 = p000.AbstractC0602nx.m4123(r8, r7)
            android.widget.LinearLayout r27 = p000.AbstractC0602nx.m4123(r8, r7)
            int r9 = r3.f9967
            java.lang.Object r9 = p000.AbstractC0312g7.m2253(r9, r2)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L8d9
            goto L8da
        L8d9:
            r5 = r9
        L8da:
            m90 r22 = new m90
            r28 = 4
            r24 = r2
            r25 = r3
            r23 = r8
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r10 = r22
            r2 = r25
            r3 = r26
            r9 = r27
            java.lang.String r11 = "背景模式"
            java.lang.String r12 = "选择评论区背景样式"
            android.widget.LinearLayout r5 = p000.bv1.m1063(r8, r11, r5, r12, r10)
            r0.addView(r5)
            android.view.View r5 = p000.bv1.m1064(r8)
            r3.addView(r5)
            java.lang.String r5 = "comment_bg_color"
            java.lang.String r10 = "#FF1A1A2E"
            java.lang.String r5 = p000.ui1.m5893(r5, r10)
            jt1 r10 = new jt1
            r12 = 7
            r10.<init>(r8, r12)
            java.lang.String r11 = "背景颜色"
            java.lang.String r12 = "点击选择颜色（支持透明度）"
            android.widget.LinearLayout r5 = p000.bv1.m1063(r8, r11, r5, r12, r10)
            r3.addView(r5)
            android.content.SharedPreferences r5 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L924
            r10 = 0
            int r21 = r5.getInt(r1, r10)     // Catch: java.lang.Throwable -> L925
            goto L927
        L924:
            r10 = 0
        L925:
            r21 = r10
        L927:
            if (r21 <= 0) goto L92b
            r5 = r7
            goto L92c
        L92b:
            r5 = r10
        L92c:
            android.content.SharedPreferences r11 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L937
            int r21 = r11.getInt(r1, r10)     // Catch: java.lang.Throwable -> L937
            r1 = r21
            goto L938
        L937:
            r1 = r10
        L938:
            java.lang.String r11 = "comment_panel_height_px"
            android.content.SharedPreferences r12 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> L943
            int r11 = r12.getInt(r11, r10)     // Catch: java.lang.Throwable -> L943
            goto L944
        L943:
            r11 = 0
        L944:
            if (r1 <= 0) goto L956
            if (r11 <= 0) goto L956
            l91 r10 = new l91
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10.<init>(r1, r11)
            goto L975
        L956:
            android.content.res.Resources r1 = r8.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r10 = r1.widthPixels
            int r1 = r1.heightPixels
            float r1 = (float) r1
            r11 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 * r11
            int r1 = (int) r1
            l91 r11 = new l91
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11.<init>(r10, r1)
            r10 = r11
        L975:
            java.lang.Object r1 = r10.f6502
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r10 = r10.f6503
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            android.view.View r11 = p000.bv1.m1064(r8)
            r9.addView(r11)
            java.lang.String r11 = "px"
            java.lang.String r12 = "×"
            if (r5 == 0) goto L999
            java.lang.String r5 = " 已获取真实面板尺寸："
            java.lang.String r1 = p000.AbstractC0602nx.m4128(r5, r1, r12, r10, r11)
            goto L99f
        L999:
            java.lang.String r5 = " 尚未获取真实尺寸（请先打开一次评论区），当前使用估算值："
            java.lang.String r1 = p000.AbstractC0602nx.m4128(r5, r1, r12, r10, r11)
        L99f:
            r5 = 1094713344(0x41400000, float:12.0)
            android.widget.TextView r1 = p000.lz1.m3683(r8, r1, r5)
            bv1 r5 = p000.bv1.f1853
            qu1 r5 = p000.bv1.f1856
            if (r5 == 0) goto Lab4
            java.lang.String r5 = r5.f9124
            int r5 = android.graphics.Color.parseColor(r5)
            r1.setTextColor(r5)
            r5 = 16
            int r10 = p000.bv1.m1076(r8, r5)
            r11 = 10
            int r12 = p000.bv1.m1076(r8, r11)
            int r5 = p000.bv1.m1076(r8, r5)
            int r11 = p000.bv1.m1076(r8, r11)
            r1.setPadding(r10, r12, r5, r11)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r10 = -1
            r11 = -2
            r5.<init>(r10, r11)
            r1.setLayoutParams(r5)
            r9.addView(r1)
            java.lang.String r1 = "comment_bg_cropped_uri"
            java.lang.String r1 = p000.ui1.m5893(r1, r4)
            um1 r4 = new um1
            r4.<init>()
            android.view.View r5 = p000.bv1.m1064(r8)
            r9.addView(r5)
            boolean r1 = p000.q02.m4671(r1)
            if (r1 != 0) goto L9f3
            java.lang.String r1 = "已选择并裁剪"
            goto L9f5
        L9f3:
            java.lang.String r1 = "点击选择"
        L9f5:
            lt1 r5 = new lt1
            r5.<init>(r4, r8)
            java.lang.String r4 = "背景图片"
            java.lang.String r10 = "选择图片后进入裁剪界面，裁剪框比例与评论面板一致"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r8, r4, r1, r10, r5)
            p000.AbstractC0602nx.m4141(r9, r1, r8)
            java.lang.String r1 = "comment_bg_image_alpha"
            android.content.SharedPreferences r4 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> La11
            int r1 = r4.getInt(r1, r6)     // Catch: java.lang.Throwable -> La11
        La0f:
            r10 = 0
            goto La13
        La11:
            r1 = r6
            goto La0f
        La13:
            int r24 = p000.j81.m2906(r1, r10, r6)
            dt1 r1 = new dt1
            r4 = 18
            r1.<init>(r4)
            java.lang.String r23 = "图片透明度"
            r25 = 100
            r26 = 0
            java.lang.String r27 = "%"
            java.lang.String r28 = "控制背景图片的不透明度（0=全透明，100=不透明）"
            r29 = r1
            r22 = r8
            android.widget.LinearLayout r1 = p000.bv1.m1070(r22, r23, r24, r25, r26, r27, r28, r29)
            r9.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r8)
            r9.addView(r1)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r8)
            r1.setOrientation(r7)
            java.lang.String r4 = "comment_bg_image_blur_enabled"
            r10 = 0
            boolean r4 = p000.ui1.m5887(r4, r10)
            ic r5 = new ic
            r6 = 6
            r5.<init>(r8, r6, r1)
            java.lang.String r6 = "图片高斯模糊"
            java.lang.String r10 = "开启后按当前模糊度生成缓存图；未更换图片或模糊度时直接复用缓存"
            android.widget.LinearLayout r5 = p000.bv1.m1073(r8, r6, r10, r4, r5)
            r9.addView(r5)
            android.view.View r5 = p000.bv1.m1064(r8)
            r1.addView(r5)
            java.lang.String r5 = "comment_bg_image_blur_radius"
            r6 = 23
            android.content.SharedPreferences r10 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> La6d
            int r6 = r10.getInt(r5, r6)     // Catch: java.lang.Throwable -> La6d
        La6d:
            int r10 = p000.j81.m2906(r6, r7, r13)
            jt1 r15 = new jt1
            r13 = 8
            r15.<init>(r8, r13)
            r27 = r9
            java.lang.String r9 = "模糊度"
            r11 = 25
            r12 = 1
            java.lang.String r13 = ""
            java.lang.String r14 = "调整后不会实时渲染，重新打开评论区时按该数值生成或复用缓存图"
            r5 = r27
            android.widget.LinearLayout r6 = p000.bv1.m1070(r8, r9, r10, r11, r12, r13, r14, r15)
            r1.addView(r6)
            r5.addView(r1)
            if (r4 == 0) goto La93
            r4 = 0
            goto La95
        La93:
            r4 = 8
        La95:
            r1.setVisibility(r4)
            r0.addView(r3)
            r0.addView(r5)
            int r1 = r2.f9967
            if (r1 != r7) goto Laa4
            r2 = 0
            goto Laa6
        Laa4:
            r2 = 8
        Laa6:
            r3.setVisibility(r2)
            r4 = 2
            if (r1 != r4) goto Laae
            r1 = 0
            goto Lab0
        Laae:
            r1 = 8
        Lab0:
            r5.setVisibility(r1)
            return r0
        Lab4:
            java.lang.String r0 = "theme"
            p000.ln0.m3650(r0)
            r18 = 0
            throw r18
        Labc:
            r1 = r31
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r1)
            bv1 r2 = p000.bv1.f1853
            ys1 r2 = p000.zs1.f13265
            ys1 r3 = p000.zs1.f13266
            ys1 r4 = p000.zs1.f13267
            ys1 r5 = p000.zs1.f13263
            ys1 r6 = p000.zs1.f13264
            ys1[] r2 = new p000.ys1[]{r2, r3, r4, r5, r6}
            java.util.List r2 = p000.AbstractC1021yh.m6897(r2)
            r8 = 0
            p000.bv1.m1055(r0, r1, r2, r8)
            p000.bv1.m1056(r0, r1)
            java.lang.String r2 = "修改后重启抖音生效；强制旧版会关闭宿主 KMP 评论列表实验，右上角搜索按钮隐藏依赖 DexKit 首扫结果。"
            p000.bv1.m1057(r0, r1, r2)
            return r0
        Laef:
            r1 = r31
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r1)
            java.util.List r2 = p000.AbstractC0515lk.f6694
            if (r2 == 0) goto Lb0d
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto Lb0d
            r3 = 0
            goto Lb37
        Lb0d:
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        Lb12:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Lb37
            java.lang.Object r4 = r2.next()
            mk r4 = (p000.C0552mk) r4
            boolean r5 = r4.f7188
            if (r5 == 0) goto Lb12
            java.lang.Object r5 = p000.ui1.f10844
            java.lang.String r4 = r4.f7186
            boolean r4 = p000.ui1.m5902(r4)
            if (r4 != 0) goto Lb12
            int r3 = r3 + 1
            if (r3 < 0) goto Lb31
            goto Lb12
        Lb31:
            p000.AbstractC1021yh.m6916()
            r18 = 0
            throw r18
        Lb37:
            java.lang.String r2 = "comment_control_custom_enabled"
            r8 = 0
            boolean r2 = p000.ui1.m5887(r2, r8)
            oq1 r4 = new oq1
            r5 = 14
            r4.<init>(r5)
            java.lang.String r5 = "启用评论区控件管理"
            java.lang.String r6 = "应用已保存的评论控件样式"
            android.widget.LinearLayout r2 = p000.bv1.m1073(r1, r5, r6, r2, r4)
            r0.addView(r2)
            android.view.View r2 = p000.bv1.m1064(r1)
            r0.addView(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "点击预览控件进行修改 · 已隐藏 "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r3 = " 项"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            g71 r3 = new g71
            r3.<init>(r1, r12)
            java.lang.String r4 = "打开控件管理器"
            java.lang.String r5 = "预览与编辑"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r1, r4, r2, r5, r3)
            r0.addView(r1)
            return r0
        Lb7b:
            r1 = r31
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r1)
            java.lang.String r2 = "live_room_audience_exact_count_enabled"
            r8 = 0
            boolean r2 = p000.ui1.m5887(r2, r8)
            oq1 r3 = new oq1
            r4 = 29
            r3.<init>(r4)
            java.lang.String r4 = "启用直播间精确人数显示"
            java.lang.String r5 = "将直播间顶部在线人数从「1万」「1.2万」等显示为具体数字（需重进直播间）"
            android.widget.LinearLayout r1 = p000.bv1.m1073(r1, r4, r5, r2, r3)
            r0.addView(r1)
            return r0
        Lba7:
            r1 = r31
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r1)
            java.lang.String r2 = "feed_follow_confirm_enabled"
            r8 = 0
            boolean r2 = p000.ui1.m5887(r2, r8)
            oq1 r3 = new oq1
            r4 = 26
            r3.<init>(r4)
            java.lang.String r4 = "启用Feed关注二次确认"
            java.lang.String r5 = "只拦截视频流中的关注请求，点击关注后需要再次确认才会提交"
            android.widget.LinearLayout r2 = p000.bv1.m1073(r1, r4, r5, r2, r3)
            r0.addView(r2)
            android.view.View r2 = p000.bv1.m1064(r1)
            r0.addView(r2)
            java.lang.String r2 = "需要重启抖音生效；个人主页等非Feed入口不拦截"
            android.widget.TextView r1 = p000.bv1.m1065(r1, r2)
            r0.addView(r1)
            return r0
        Lbe3:
            r1 = r31
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r1)
            java.util.List r2 = p000.bv1.m1077()
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto Lc01
            r8 = 0
            goto Lc30
        Lc01:
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        Lc06:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Lc2f
            java.lang.Object r4 = r2.next()
            ku1 r4 = (p000.ku1) r4
            java.lang.String r4 = r4.f6118
            java.lang.String r5 = "feed_right_control_hide_"
            java.lang.String r4 = r5.concat(r4)
            r8 = 0
            boolean r4 = p000.ui1.m5887(r4, r8)
            if (r4 == 0) goto Lc2c
            int r3 = r3 + 1
            if (r3 < 0) goto Lc26
            goto Lc06
        Lc26:
            p000.AbstractC1021yh.m6916()
            r18 = 0
            throw r18
        Lc2c:
            r18 = 0
            goto Lc06
        Lc2f:
            r8 = r3
        Lc30:
            if (r8 <= 0) goto Lc3b
            java.lang.String r2 = "已隐藏 "
            java.lang.String r3 = " 项"
            java.lang.String r2 = p000.AbstractC0602nx.m4127(r2, r8, r3)
            goto Lc3d
        Lc3b:
            java.lang.String r2 = "未隐藏"
        Lc3d:
            g71 r3 = new g71
            r4 = 26
            r3.<init>(r1, r4)
            java.lang.String r4 = "打开右侧控件屏蔽设置"
            java.lang.String r5 = "使用 XML 列表选择要隐藏的右侧控件；优先按模块和头像扩展过滤"
            android.widget.LinearLayout r2 = p000.bv1.m1063(r1, r4, r2, r5, r3)
            r0.addView(r2)
            android.view.View r2 = p000.bv1.m1064(r1)
            r0.addView(r2)
            java.lang.String r2 = "过滤链路：模块 visibility + 头像 PresenterGroup 扩展过滤；尽量不使用全局 View 扫描"
            android.widget.TextView r1 = p000.bv1.m1065(r1, r2)
            r0.addView(r1)
            return r0
        Lc60:
            r1 = r31
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r1)
            boolean r2 = p000.i81.m2670(r1)
            if (r2 != 0) goto Lc7f
            java.lang.String r0 = "右侧按钮管理器是内测功能，需要内测资格才能使用"
            android.widget.LinearLayout r0 = p000.bv1.m1061(r1, r0)
            goto Lcc7
        Lc7f:
            java.lang.String r2 = "feed_right_dislike_button_enabled"
            r8 = 0
            boolean r2 = p000.ui1.m5887(r2, r8)
            ct1 r3 = new ct1
            r10 = 13
            r3.<init>(r1, r10)
            java.lang.String r4 = "启用右侧不感兴趣按钮"
            java.lang.String r5 = "在视频右侧操作栏添加一个快速标记「不感兴趣」的按钮"
            android.widget.LinearLayout r2 = p000.bv1.m1073(r1, r4, r5, r2, r3)
            r0.addView(r2)
            android.view.View r2 = p000.bv1.m1064(r1)
            r0.addView(r2)
            java.lang.String r2 = "feed_right_auto_scroll_button_enabled"
            boolean r2 = p000.ui1.m5887(r2, r8)
            ct1 r3 = new ct1
            r4 = 14
            r3.<init>(r1, r4)
            java.lang.String r4 = "启用右侧自动连播开关"
            java.lang.String r5 = "在视频右侧操作栏添加连播按钮；开启时按钮为蓝色，关闭时为白色"
            android.widget.LinearLayout r2 = p000.bv1.m1073(r1, r4, r5, r2, r3)
            r0.addView(r2)
            android.view.View r2 = p000.bv1.m1064(r1)
            r0.addView(r2)
            java.lang.String r2 = "按钮显示状态需要重启抖音或重新进入视频流生效；右侧连播按钮点击后会直接切换「自动下滑」开关"
            android.widget.TextView r1 = p000.bv1.m1065(r1, r2)
            r0.addView(r1)
        Lcc7:
            return r0
        Lcc8:
            r1 = r31
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            java.lang.String r0 = "offline_cache_count_enabled"
            r8 = 0
            boolean r0 = p000.ui1.m5887(r0, r8)
            java.lang.String r2 = "offline_cache_count"
            android.content.SharedPreferences r3 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> Lce7
            int r6 = r3.getInt(r2, r6)     // Catch: java.lang.Throwable -> Lce7
        Lce7:
            r2 = 500(0x1f4, float:7.0E-43)
            r10 = 10
            int r2 = p000.j81.m2906(r6, r10, r2)
            android.widget.LinearLayout r3 = p000.bv1.m1062(r1)
            oq1 r4 = new oq1
            r5 = 15
            r4.<init>(r5)
            java.lang.String r5 = "启用自定义离线缓存数量"
            java.lang.String r6 = "覆盖宿主固定数量档位，并保留宿主原生缓存管理流程"
            android.widget.LinearLayout r0 = p000.bv1.m1073(r1, r5, r6, r0, r4)
            r3.addView(r0)
            android.view.View r0 = p000.bv1.m1064(r1)
            r3.addView(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " 条"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            g71 r2 = new g71
            r2.<init>(r1, r14)
            java.lang.String r4 = "缓存视频数量"
            java.lang.String r5 = "输入 10~500；在宿主离线缓存设置中调整数量时生效"
            android.widget.LinearLayout r0 = p000.bv1.m1063(r1, r4, r0, r5, r2)
            r3.addView(r0)
            android.view.View r0 = p000.bv1.m1064(r1)
            r3.addView(r0)
            java.lang.String r0 = "启用后重启抖音；随后在离线缓存设置中选择任一数量，宿主会按自定义值清空旧缓存并重新下载"
            android.widget.TextView r0 = p000.bv1.m1065(r1, r0)
            r3.addView(r0)
            return r3
        Ld3e:
            r12 = r31
            android.app.Activity r12 = (android.app.Activity) r12
            r12.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r12)
            qm1 r1 = new qm1
            r1.<init>()
            java.lang.String r2 = "feed_enable_preload"
            r8 = 0
            boolean r2 = p000.ui1.m5887(r2, r8)
            r1.f9050 = r2
            cc r3 = new cc
            r4 = 9
            r3.<init>(r4, r1)
            java.lang.String r1 = "启用Feed流预加载"
            java.lang.String r4 = "控制抖音视频流的预加载行为，关闭可节省流量和内存"
            android.widget.LinearLayout r1 = p000.bv1.m1073(r12, r1, r4, r2, r3)
            p000.AbstractC0602nx.m4141(r0, r1, r12)
            java.lang.String r1 = "feed_preload_count"
            android.content.SharedPreferences r2 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> Ld7f
            r4 = 2
            int r1 = r2.getInt(r1, r4)     // Catch: java.lang.Throwable -> Ld80
        Ld7b:
            r8 = 0
            r13 = 8
            goto Ld82
        Ld7f:
            r4 = 2
        Ld80:
            r1 = r4
            goto Ld7b
        Ld82:
            int r14 = p000.j81.m2906(r1, r8, r13)
            nq1 r1 = new nq1
            r2 = 29
            r1.<init>(r2)
            java.lang.String r13 = "预加载数量"
            r15 = 8
            r16 = 0
            java.lang.String r17 = "个"
            java.lang.String r18 = "同时预加载的视频数量（0=禁用预加载，1-8=自定义数量）"
            r19 = r1
            android.widget.LinearLayout r1 = p000.bv1.m1070(r12, r13, r14, r15, r16, r17, r18, r19)
            p000.AbstractC0602nx.m4141(r0, r1, r12)
            java.lang.String r1 = "超清"
            java.lang.String r2 = "极清"
            java.lang.String r3 = "标清"
            java.lang.String r4 = "高清"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r1, r2}
            sm1 r2 = new sm1
            r2.<init>()
            java.lang.String r3 = "feed_preload_quality"
            android.content.SharedPreferences r4 = p000.ui1.m5892()     // Catch: java.lang.Throwable -> Ldbb
            int r7 = r4.getInt(r3, r7)     // Catch: java.lang.Throwable -> Ldbb
        Ldbb:
            r8 = 0
            int r3 = p000.j81.m2906(r7, r8, r11)
            r2.f9967 = r3
            r3 = r1[r3]
            m3 r4 = new m3
            r5 = 9
            r4.<init>(r12, r1, r2, r5)
            java.lang.String r1 = "预加载清晰度"
            java.lang.String r2 = "选择预加载视频的清晰度等级"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r12, r1, r3, r2, r4)
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r12)
            r0.addView(r1)
            java.lang.String r1 = "feed_preload_debug_log"
            r8 = 0
            boolean r1 = p000.ui1.m5887(r1, r8)
            oq1 r2 = new oq1
            r3 = 11
            r2.<init>(r3)
            java.lang.String r3 = "调试日志"
            java.lang.String r4 = "开启后会在Dylog日志中输出预加载相关调试信息"
            android.widget.LinearLayout r1 = p000.bv1.m1073(r12, r3, r4, r1, r2)
            r0.addView(r1)
            android.view.View r1 = p000.bv1.m1064(r12)
            r0.addView(r1)
            java.lang.String r1 = "修改后切换视频页面生效。降低预加载数量或关闭预加载可以节省流量和内存占用"
            android.widget.TextView r1 = p000.bv1.m1065(r12, r1)
            r0.addView(r1)
            return r0
        Le07:
            r1 = r31
            android.app.Activity r1 = (android.app.Activity) r1
            r1.getClass()
            java.lang.Object r0 = r0.receiver
            bv1 r0 = (p000.bv1) r0
            r0.getClass()
            android.widget.LinearLayout r0 = p000.bv1.m1062(r1)
            java.lang.String r2 = "double_tap_menu_enabled"
            r8 = 0
            boolean r3 = p000.ui1.m5887(r2, r8)
            if (r3 == 0) goto Le25
            p000.ui1.m5871(r2, r8)
        Le25:
            jt1 r2 = new jt1
            r2.<init>(r1, r9)
            java.lang.String r3 = "Feed流手势配置"
            java.lang.String r4 = "点击配置不同区域的双击/长按动作"
            java.lang.String r5 = "配置后会主动拦截原生双击点赞 / 长按面板"
            android.widget.LinearLayout r2 = p000.bv1.m1063(r1, r3, r4, r5, r2)
            r0.addView(r2)
            android.view.View r2 = p000.bv1.m1064(r1)
            r0.addView(r2)
            java.lang.String r2 = "提示：区域双击配置后，模块会优先接管双击并拦截原生双击点赞；区域长按配置后，会拦截原生长按面板。若想保留原生逻辑，请把对应动作设为「无」。"
            android.widget.TextView r2 = p000.bv1.m1065(r1, r2)
            r0.addView(r2)
            android.view.View r2 = p000.bv1.m1064(r1)
            r0.addView(r2)
            java.lang.String r2 = "volume_key_enabled"
            boolean r2 = p000.ui1.m5887(r2, r7)
            ct1 r3 = new ct1
            r4 = 15
            r3.<init>(r1, r4)
            java.lang.String r4 = "音量键组合"
            java.lang.String r5 = "先按音量+再按音量-快速唤出操作菜单"
            android.widget.LinearLayout r2 = p000.bv1.m1073(r1, r4, r5, r2, r3)
            r0.addView(r2)
            android.view.View r2 = p000.bv1.m1064(r1)
            r0.addView(r2)
            java.lang.String r2 = "share_panel_enabled"
            boolean r2 = p000.ui1.m5887(r2, r7)
            ct1 r3 = new ct1
            r13 = 16
            r3.<init>(r1, r13)
            java.lang.String r4 = "分享界面注入"
            java.lang.String r5 = "在分享面板中添加 DY Helper 下载按钮"
            android.widget.LinearLayout r2 = p000.bv1.m1073(r1, r4, r5, r2, r3)
            r0.addView(r2)
            android.view.View r2 = p000.bv1.m1064(r1)
            r0.addView(r2)
            java.lang.String r2 = p000.bv1.m1041()
            jt1 r3 = new jt1
            r6 = 6
            r3.<init>(r1, r6)
            java.lang.String r4 = "配置分享快捷按钮"
            java.lang.String r5 = "选择要在分享面板显示的正式操作；完整菜单入口始终保留"
            android.widget.LinearLayout r1 = p000.bv1.m1063(r1, r4, r2, r5, r3)
            r0.addView(r1)
            return r0
    }
}
