package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ii0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f5091;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f5092;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f5093;

    public /* synthetic */ ii0(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f5091 = r2
            r0.f5092 = r1
            r0.f5093 = r3
            r0.<init>()
            return
    }

    public /* synthetic */ ii0(p000.ji0 r2, java.lang.ClassLoader r3) {
            r1 = this;
            r0 = 1
            r1.f5091 = r0
            vj0 r0 = p000.vj0.f11310
            r1.<init>()
            r1.f5092 = r2
            r1.f5093 = r3
            return
    }

    /* JADX INFO: renamed from: α */
    private final void m2759() {
            r12 = this;
            java.lang.Object r0 = r12.f5092
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r12 = r12.f5093
            vv1 r12 = (p000.vv1) r12
            java.util.List r1 = p000.xv1.f12329
            long r1 = r12.f11431
            java.lang.String r3 = "同步写入已跳过 [share_panel_actions]: expectedGeneration="
            java.lang.Object r4 = p000.ui1.f10844
            java.lang.String r4 = "share_panel_actions"
            org.json.JSONArray r5 = new org.json.JSONArray
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L3f
            java.lang.Object r7 = r0.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.CharSequence r7 = p000.q02.m4660(r7)
            java.lang.String r7 = r7.toString()
            int r9 = r7.length()
            if (r9 <= 0) goto L39
            r8 = r7
        L39:
            if (r8 == 0) goto L1d
            r6.add(r8)
            goto L1d
        L3f:
            java.util.List r0 = p000.AbstractC0984xh.m6666(r6)
            r5.<init>(r0)
            java.lang.String r0 = r5.toString()
            r0.getClass()
            r5 = 0
            r6 = 4
            java.lang.Object r7 = p000.ui1.f10844     // Catch: java.lang.Throwable -> L96
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L96
            long r9 = p000.ui1.f10851     // Catch: java.lang.Throwable -> L75
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r9 == 0) goto L77
            java.lang.String r0 = "r24d5e64064e1c279"
            long r9 = p000.ui1.f10851     // Catch: java.lang.Throwable -> L75
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L75
            r11.<init>(r3)     // Catch: java.lang.Throwable -> L75
            r11.append(r1)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = ", currentGeneration="
            r11.append(r1)     // Catch: java.lang.Throwable -> L75
            r11.append(r9)     // Catch: java.lang.Throwable -> L75
            java.lang.String r1 = r11.toString()     // Catch: java.lang.Throwable -> L75
            p000.C0888ux.m5988(r0, r1, r8, r6, r8)     // Catch: java.lang.Throwable -> L75
        L73:
            r0 = r5
            goto L93
        L75:
            r0 = move-exception
            goto L98
        L77:
            android.content.SharedPreferences r1 = p000.ui1.f10847     // Catch: java.lang.Throwable -> L75
            if (r1 != 0) goto L7d
            android.content.SharedPreferences r1 = p000.ui1.f10846     // Catch: java.lang.Throwable -> L75
        L7d:
            if (r1 != 0) goto L87
            java.lang.String r0 = "r24d5e64064e1c279"
            java.lang.String r1 = "同步写入失败 [share_panel_actions]: PrefsManager 尚未初始化"
            p000.C0888ux.m5988(r0, r1, r8, r6, r8)     // Catch: java.lang.Throwable -> L75
            goto L73
        L87:
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L75
            android.content.SharedPreferences$Editor r0 = r1.putString(r4, r0)     // Catch: java.lang.Throwable -> L75
            boolean r0 = r0.commit()     // Catch: java.lang.Throwable -> L75
        L93:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L96
            r5 = r0
            goto La9
        L96:
            r0 = move-exception
            goto L9a
        L98:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L96
            throw r0     // Catch: java.lang.Throwable -> L96
        L9a:
            java.lang.String r1 = "r24d5e64064e1c279"
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "同步写入失败 [share_panel_actions]: "
            java.lang.String r0 = p000.lz1.m3687(r2, r0)
            p000.C0888ux.m5988(r1, r0, r8, r6, r8)
        La9:
            if (r5 == 0) goto Laf
            p000.ui1.m5868(r4)
            goto Lb6
        Laf:
            java.lang.String r0 = "r24d5e64064e1c279"
            java.lang.String r1 = "同步写入未落盘 [share_panel_actions]"
            p000.C0888ux.m5988(r0, r1, r8, r6, r8)
        Lb6:
            android.app.Activity r0 = r12.f11426
            jg r1 = new jg
            r2 = 5
            r1.<init>(r12, r5, r2)
            r0.runOnUiThread(r1)
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r30 = this;
            r0 = r30
            int r1 = r0.f5091
            r3 = 24
            java.lang.String r4 = ""
            java.lang.String r5 = "DYHelper"
            r8 = 1
            r9 = 0
            r10 = 0
            switch(r1) {
                case 0: goto Laf6;
                case 1: goto La50;
                case 2: goto L9f1;
                case 3: goto L9e5;
                case 4: goto L9cb;
                case 5: goto L9bc;
                case 6: goto L9b0;
                case 7: goto L9a4;
                case 8: goto L972;
                case 9: goto L8ef;
                case 10: goto L8e3;
                case 11: goto L8d7;
                case 12: goto L8cb;
                case 13: goto L8bf;
                case 14: goto L89f;
                case 15: goto L893;
                case 16: goto L887;
                case 17: goto L83a;
                case 18: goto L4c8;
                case 19: goto L371;
                case 20: goto L365;
                case 21: goto L359;
                case 22: goto L327;
                case 23: goto L2ed;
                case 24: goto L245;
                case 25: goto L215;
                case 26: goto L211;
                case 27: goto L1bb;
                case 28: goto L173;
                default: goto L10;
            }
        L10:
            java.lang.Object r1 = r0.f5092
            r12 = r1
            android.app.Activity r12 = (android.app.Activity) r12
            java.lang.Object r0 = r0.f5093
            r13 = r0
            t72 r13 = (p000.t72) r13
            boolean r0 = r12.isFinishing()
            if (r0 == 0) goto L22
            goto L172
        L22:
            boolean r0 = r12.isDestroyed()
            if (r0 == 0) goto L2a
            goto L172
        L2a:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.u72.f10633
            boolean r0 = r0.compareAndSet(r9, r8)
            if (r0 != 0) goto L34
            goto L172
        L34:
            int r0 = r13.f10235
            p000.u72.f10637 = r0
            java.lang.String r0 = "最新版本："
            java.lang.String r1 = "v"
            x01 r4 = p000.x01.f11964     // Catch: java.lang.Throwable -> Lca
            android.view.LayoutInflater r4 = r4.m6477(r12)     // Catch: java.lang.Throwable -> Lca
            r5 = 2131492925(0x7f0c003d, float:1.8609316E38)
            android.view.View r4 = r4.inflate(r5, r10, r9)     // Catch: java.lang.Throwable -> Lca
            r5 = 2131297045(0x7f090315, float:1.8212024E38)
            android.view.View r5 = r4.findViewById(r5)     // Catch: java.lang.Throwable -> Lca
            android.widget.TextView r5 = (android.widget.TextView) r5     // Catch: java.lang.Throwable -> Lca
            r8 = 2131297041(0x7f090311, float:1.8212016E38)
            android.view.View r8 = r4.findViewById(r8)     // Catch: java.lang.Throwable -> Lca
            android.widget.TextView r8 = (android.widget.TextView) r8     // Catch: java.lang.Throwable -> Lca
            r11 = 2131296336(0x7f090050, float:1.8210586E38)
            android.view.View r11 = r4.findViewById(r11)     // Catch: java.lang.Throwable -> Lca
            android.widget.TextView r11 = (android.widget.TextView) r11     // Catch: java.lang.Throwable -> Lca
            r14 = 2131297046(0x7f090316, float:1.8212026E38)
            android.view.View r14 = r4.findViewById(r14)     // Catch: java.lang.Throwable -> Lca
            android.widget.TextView r14 = (android.widget.TextView) r14     // Catch: java.lang.Throwable -> Lca
            r15 = 2131297042(0x7f090312, float:1.8212018E38)
            android.view.View r15 = r4.findViewById(r15)     // Catch: java.lang.Throwable -> Lca
            android.widget.TextView r15 = (android.widget.TextView) r15     // Catch: java.lang.Throwable -> Lca
            r6 = 2131297043(0x7f090313, float:1.821202E38)
            android.view.View r6 = r4.findViewById(r6)     // Catch: java.lang.Throwable -> Lca
            android.widget.TextView r6 = (android.widget.TextView) r6     // Catch: java.lang.Throwable -> Lca
            r10 = 2131296860(0x7f09025c, float:1.8211649E38)
            android.view.View r10 = r4.findViewById(r10)     // Catch: java.lang.Throwable -> Lca
            android.widget.ProgressBar r10 = (android.widget.ProgressBar) r10     // Catch: java.lang.Throwable -> Lca
            r2 = 2131297044(0x7f090314, float:1.8212022E38)
            android.view.View r2 = r4.findViewById(r2)     // Catch: java.lang.Throwable -> Lca
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch: java.lang.Throwable -> Lca
            r9 = 2131296338(0x7f090052, float:1.821059E38)
            android.view.View r9 = r4.findViewById(r9)     // Catch: java.lang.Throwable -> Lca
            android.widget.Button r9 = (android.widget.Button) r9     // Catch: java.lang.Throwable -> Lca
            r7 = 2131296337(0x7f090051, float:1.8210588E38)
            android.view.View r7 = r4.findViewById(r7)     // Catch: java.lang.Throwable -> Lca
            r16 = r7
            android.widget.Button r16 = (android.widget.Button) r16     // Catch: java.lang.Throwable -> Lca
            java.lang.String r7 = "发现新版本"
            r5.setText(r7)     // Catch: java.lang.Throwable -> Lca
            int r5 = r13.f10235     // Catch: java.lang.Throwable -> Lca
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lca
            r7.<init>(r1)     // Catch: java.lang.Throwable -> Lca
            r7.append(r5)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> Lca
            r8.setText(r1)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r1 = r13.f10236     // Catch: java.lang.Throwable -> Lca
            boolean r5 = p000.q02.m4671(r1)     // Catch: java.lang.Throwable -> Lca
            if (r5 == 0) goto Lcd
            int r1 = r13.f10235     // Catch: java.lang.Throwable -> Lca
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Lca
            goto Lcd
        Lca:
            r0 = move-exception
            goto L15b
        Lcd:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lca
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Lca
            r5.append(r1)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> Lca
            r14.setText(r0)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r0 = "当前版本：1.4.15 (60)"
            r15.setText(r0)     // Catch: java.lang.Throwable -> Lca
            java.lang.String r0 = r13.f10238     // Catch: java.lang.Throwable -> Lca
            boolean r1 = p000.q02.m4671(r0)     // Catch: java.lang.Throwable -> Lca
            if (r1 == 0) goto Leb
            java.lang.String r0 = "检测到 DYHelper 新版本，建议下载更新。"
        Leb:
            r6.setText(r0)     // Catch: java.lang.Throwable -> Lca
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder     // Catch: java.lang.Throwable -> Lca
            r0.<init>(r12)     // Catch: java.lang.Throwable -> Lca
            android.app.AlertDialog$Builder r0 = r0.setView(r4)     // Catch: java.lang.Throwable -> Lca
            android.app.AlertDialog r0 = r0.create()     // Catch: java.lang.Throwable -> Lca
            sa r1 = new sa     // Catch: java.lang.Throwable -> Lca
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> Lca
            r11.setOnClickListener(r1)     // Catch: java.lang.Throwable -> Lca
            c9 r1 = new c9     // Catch: java.lang.Throwable -> Lca
            r3 = 17
            r1.<init>(r13, r12, r0, r3)     // Catch: java.lang.Throwable -> Lca
            r9.setOnClickListener(r1)     // Catch: java.lang.Throwable -> Lca
            cl0 r11 = new cl0     // Catch: java.lang.Throwable -> Lca
            r15 = r2
            r17 = r9
            r14 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> Lca
            r7 = r16
            r7.setOnClickListener(r11)     // Catch: java.lang.Throwable -> Lca
            z90 r1 = new z90     // Catch: java.lang.Throwable -> Lca
            r2 = 2
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lca
            r0.setOnDismissListener(r1)     // Catch: java.lang.Throwable -> Lca
            r0.show()     // Catch: java.lang.Throwable -> Lca
            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Throwable -> Lca
            if (r0 == 0) goto L172
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.Throwable -> Lca
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lca
            r0.setBackgroundDrawable(r1)     // Catch: java.lang.Throwable -> Lca
            android.view.View r1 = r0.getDecorView()     // Catch: java.lang.Throwable -> Lca
            r1.setPadding(r2, r2, r2, r2)     // Catch: java.lang.Throwable -> Lca
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setDimAmount(r1)     // Catch: java.lang.Throwable -> Lca
            r2 = 2
            r0.addFlags(r2)     // Catch: java.lang.Throwable -> Lca
            android.content.res.Resources r1 = r12.getResources()     // Catch: java.lang.Throwable -> Lca
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()     // Catch: java.lang.Throwable -> Lca
            int r1 = r1.widthPixels     // Catch: java.lang.Throwable -> Lca
            float r1 = (float) r1     // Catch: java.lang.Throwable -> Lca
            r2 = 1064011039(0x3f6b851f, float:0.92)
            float r1 = r1 * r2
            int r1 = (int) r1     // Catch: java.lang.Throwable -> Lca
            r2 = -2
            r0.setLayout(r1, r2)     // Catch: java.lang.Throwable -> Lca
            goto L172
        L15b:
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.u72.f10633
            r2 = 0
            r1.set(r2)
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "show update dialog failed: "
            java.lang.String r0 = p000.lz1.m3687(r1, r0)
            java.lang.String r1 = "r5f3b6ae7236977e4"
            r2 = 4
            r3 = 0
            p000.C0888ux.m5988(r1, r0, r3, r2, r3)
        L172:
            return
        L173:
            java.lang.Object r1 = r0.f5092
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Object r0 = r0.f5093
            java.util.List r0 = (java.util.List) r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = p000.o22.f7892
            java.lang.String r3 = r1.getName()
            boolean r2 = r2.add(r3)
            if (r2 != 0) goto L188
            goto L1ba
        L188:
            java.util.Iterator r2 = r0.iterator()
        L18c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L19e
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            o22 r4 = p000.o22.f7889
            r4.m4192(r3)
            goto L18c
        L19e:
            java.lang.String r1 = r1.getName()
            int r0 = r0.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "rc6f8b5d3c7a9871a"
            r2.<init>(r3)
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            p000.C0888ux.m5985(r0)
        L1ba:
            return
        L1bb:
            java.lang.Object r1 = r0.f5092
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Object r0 = r0.f5093
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            java.util.List r2 = p000.C0903vb.f11215     // Catch: java.lang.Throwable -> L1ca
            java.util.List r0 = p000.C0903vb.m6160(r1, r0)     // Catch: java.lang.Throwable -> L1ca
            goto L1d1
        L1ca:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L1d1:
            java.lang.Throwable r2 = p000.fo1.m2190(r0)
            if (r2 != 0) goto L1d8
            goto L1f2
        L1d8:
            java.lang.String r0 = r1.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "r68f0adab1d2830ab"
            r3.<init>(r4)
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            p000.C0888ux.m5985(r0)
            jz r0 = p000.C0450jz.f5672
        L1f2:
            java.util.List r0 = (java.util.List) r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = p000.o22.f7893
            java.lang.String r3 = r1.getName()
            r2.remove(r3)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L204
            goto L210
        L204:
            android.os.Handler r2 = p000.o22.f7911
            ii0 r3 = new ii0
            r4 = 28
            r3.<init>(r1, r4, r0)
            r2.post(r3)
        L210:
            return
        L211:
            r0.m2759()
            return
        L215:
            java.lang.Object r1 = r0.f5092
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r0 = r0.f5093
            nt r0 = (p000.C0598nt) r0
            vv1 r2 = new vv1     // Catch: java.lang.Throwable -> L228
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L228
            r2.m6280()     // Catch: java.lang.Throwable -> L228
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L228
            goto L22f
        L228:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L22f:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L244
            java.lang.String r2 = "分享快捷按钮 XML 配置窗口加载失败"
            p000.C0888ux.m5977(r5, r2, r0)
            java.lang.String r0 = "分享快捷按钮配置加载失败"
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r2)
            r0.show()
        L244:
            return
        L245:
            java.lang.Object r1 = r0.f5092
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r0 = r0.f5093
            boolean r2 = r1.isFinishing()
            if (r2 != 0) goto L2ec
            boolean r2 = r1.isDestroyed()
            if (r2 == 0) goto L259
            goto L2ec
        L259:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 != 0) goto L2b7
            r2 = r0
            si1 r2 = (p000.si1) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "全量清除用户配置结果: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r4 = 4
            r6 = 0
            p000.C0888ux.m5988(r5, r3, r6, r4, r6)
            p000.AbstractC0976x9.m6537(r1)     // Catch: java.lang.Throwable -> L276
        L276:
            boolean r3 = r2.f9925
            if (r3 == 0) goto L297
            int r3 = r2.f9927
            int r2 = r2.f9928
            java.lang.String r4 = " 个配置，删除 "
            java.lang.String r6 = " 个文件"
            java.lang.String r7 = "已清除全部用户配置："
            java.lang.String r2 = p000.AbstractC0602nx.m4128(r7, r3, r4, r2, r6)
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r8)
            r2.show()
            android.app.AlertDialog r2 = p000.bv1.f1854
            if (r2 == 0) goto L2b7
            r2.dismiss()
            goto L2b7
        L297:
            java.util.List r2 = r2.f9929
            int r2 = r2.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "清除完成，但有 "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = " 项失败，请查看 DyLog"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.widget.Toast r2 = android.widget.Toast.makeText(r1, r2, r8)
            r2.show()
        L2b7:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L2ec
            java.lang.String r2 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "清除失败: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r3 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r3)
            r1.show()
            java.lang.String r1 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "全量清除用户配置失败: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            p000.C0888ux.m5987(r5, r1, r0)
        L2ec:
            return
        L2ed:
            java.lang.Object r1 = r0.f5092
            ju1 r1 = (p000.ju1) r1
            java.lang.Object r0 = r0.f5093
            android.content.Intent r0 = (android.content.Intent) r0
            r2 = 1001(0x3e9, float:1.403E-42)
            r1.startActivityForResult(r0, r2)     // Catch: java.lang.Exception -> L2fb
            goto L326
        L2fb:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "启动导出 Intent 失败: "
            java.lang.String r2 = p000.lz1.m3687(r3, r2)
            r3 = 0
            r4 = 4
            p000.C0888ux.m5988(r5, r2, r3, r4, r3)
            it1 r1 = r1.f5588
            if (r1 == 0) goto L326
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "导出失败: "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.invoke(r2, r0)
        L326:
            return
        L327:
            java.lang.Object r1 = r0.f5092
            kt0 r1 = (p000.kt0) r1
            java.lang.Object r0 = r0.f5093
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1.invoke()
            r1 = 1090519040(0x41000000, float:8.0)
            r0.setTranslationY(r1)
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            r1 = 0
            android.view.ViewPropertyAnimator r0 = r0.translationY(r1)
            r1 = 220(0xdc, double:1.087E-321)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>()
            android.view.ViewPropertyAnimator r0 = r0.setInterpolator(r1)
            r0.start()
            return
        L359:
            java.lang.Object r1 = r0.f5092
            y5 r1 = (p000.C1009y5) r1
            java.lang.Object r0 = r0.f5093
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            r1.m6835(r0)
            return
        L365:
            java.lang.Object r1 = r0.f5092
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r0.f5093
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog r0 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog) r0
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog.m1444(r1, r0)
            return
        L371:
            az0 r1 = p000.az0.f1381
            h8 r2 = p000.EnumC0350h8.f4616
            az0 r4 = p000.az0.f1382
            h8 r5 = p000.EnumC0350h8.f4615
            java.lang.Object r6 = r0.f5092
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r0 = r0.f5093
            r10 = r0
            android.app.Activity r10 = (android.app.Activity) r10
            cj1 r0 = p000.cj1.f2169
            java.util.ArrayList r11 = new java.util.ArrayList
            r0 = 10
            int r0 = p000.AbstractC1021yh.m6889(r6, r0)
            r11.<init>(r0)
            java.util.Iterator r0 = r6.iterator()
            r21 = 0
        L395:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L4a2
            java.lang.Object r6 = r0.next()
            int r7 = r21 + 1
            if (r21 < 0) goto L49c
            f8 r6 = (p000.C0276f8) r6
            zy0 r19 = new zy0
            h8 r9 = r6.f3798
            java.util.List r12 = r6.f3778
            h8 r13 = p000.EnumC0350h8.f4617
            if (r9 == r13) goto L3e1
            boolean r14 = r6.m2051()
            if (r14 == 0) goto L3b6
            goto L3e1
        L3b6:
            if (r9 != r5) goto L3bb
        L3b8:
            r20 = r4
            goto L3e4
        L3bb:
            if (r9 == r2) goto L3de
            boolean r14 = r6.m2050()
            if (r14 == 0) goto L3c4
            goto L3de
        L3c4:
            if (r12 == 0) goto L3cf
            boolean r14 = r12.isEmpty()
            if (r14 == 0) goto L3cd
            goto L3cf
        L3cd:
            r14 = 0
            goto L3d0
        L3cf:
            r14 = r8
        L3d0:
            if (r14 != 0) goto L3d7
            az0 r14 = p000.az0.f1383
        L3d4:
            r20 = r14
            goto L3e4
        L3d7:
            boolean r14 = r6.m2053()
            if (r14 == 0) goto L3de
            goto L3b8
        L3de:
            r20 = r1
            goto L3e4
        L3e1:
            az0 r14 = p000.az0.f1384
            goto L3d4
        L3e4:
            java.lang.String r14 = r6.f3794
            java.lang.CharSequence r14 = p000.q02.m4660(r14)
            java.lang.String r14 = r14.toString()
            boolean r15 = p000.q02.m4671(r14)
            if (r15 != 0) goto L3fd
            java.lang.String r15 = "无描述"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L3fd
            goto L3fe
        L3fd:
            r14 = 0
        L3fe:
            if (r14 == 0) goto L407
            java.lang.String r14 = p000.q02.m4693(r14, r3)
        L404:
            r23 = r14
            goto L40e
        L407:
            java.lang.String r14 = "作品 "
            java.lang.String r14 = p000.a12.m17(r14, r7)
            goto L404
        L40e:
            java.lang.String r14 = "动图"
            if (r9 == r13) goto L439
            boolean r13 = r6.m2051()
            if (r13 == 0) goto L419
            goto L439
        L419:
            if (r9 == r5) goto L442
            boolean r13 = r6.m2053()
            if (r13 == 0) goto L422
            goto L442
        L422:
            if (r9 == r2) goto L43f
            boolean r9 = r6.m2050()
            if (r9 == 0) goto L42b
            goto L43f
        L42b:
            if (r12 == 0) goto L436
            boolean r9 = r12.isEmpty()
            if (r9 == 0) goto L434
            goto L436
        L434:
            r9 = 0
            goto L437
        L436:
            r9 = r8
        L437:
            if (r9 != 0) goto L43c
        L439:
            r24 = r14
            goto L445
        L43c:
            java.lang.String r14 = "作品"
            goto L439
        L43f:
            java.lang.String r14 = "图文"
            goto L439
        L442:
            java.lang.String r14 = "视频"
            goto L439
        L445:
            java.lang.String r25 = p000.cj1.m1230(r6)
            java.lang.String r26 = p000.cj1.m1230(r6)
            java.lang.String r9 = r6.m2046()
            if (r9 != 0) goto L45d
            java.lang.String r9 = p000.cj1.m1221(r12)
            if (r9 != 0) goto L45d
            java.lang.String r9 = r6.m2047()
        L45d:
            r27 = r9
            java.util.List r9 = r6.f3795
            if (r9 != 0) goto L465
            jz r9 = p000.C0450jz.f5672
        L465:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r9 = r9.iterator()
        L46e:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L484
            java.lang.Object r13 = r9.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r13 = p000.cj1.m1223(r13)
            if (r13 == 0) goto L46e
            r12.add(r13)
            goto L46e
        L484:
            java.util.Set r9 = p000.AbstractC0984xh.m6670(r12)
            java.util.List r28 = p000.AbstractC0984xh.m6666(r9)
            r29 = r6
            r22 = r7
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r6 = r19
            r11.add(r6)
            r21 = r22
            goto L395
        L49c:
            p000.AbstractC1021yh.m6917()
            r18 = 0
            throw r18
        L4a2:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L4b2
            java.lang.String r0 = "没有可选择下载的作品"
            android.widget.Toast r0 = android.widget.Toast.makeText(r10, r0, r8)
            r0.show()
            goto L4c7
        L4b2:
            dz0 r9 = new dz0
            yy0 r12 = p000.yy0.f12875
            g71 r15 = new g71
            r0 = 8
            r15.<init>(r10, r0)
            java.lang.String r13 = "选择主页作品"
            java.lang.String r14 = "作品"
            r9.<init>(r10, r11, r12, r13, r14, r15)
            r9.m1830()
        L4c7:
            return
        L4c8:
            java.lang.Object r1 = r0.f5092
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r0 = r0.f5093
            zi1 r0 = (p000.zi1) r0
            cj1 r2 = p000.cj1.f2169
            jz r2 = p000.C0450jz.f5672
            java.util.List r3 = r0.f13105
            java.lang.Object r5 = r0.f13107
            java.lang.Object r6 = r0.f13106
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r7 = r0.f13103
            if (r3 == 0) goto L4e6
            boolean r9 = r3.isEmpty()
            if (r9 == 0) goto L4e6
            r10 = 0
            goto L50e
        L4e6:
            java.util.Iterator r9 = r3.iterator()
            r10 = 0
        L4eb:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L50e
            java.lang.Object r11 = r9.next()
            f8 r11 = (p000.C0276f8) r11
            h8 r12 = r11.f3798
            h8 r13 = p000.EnumC0350h8.f4617
            if (r12 == r13) goto L503
            boolean r11 = r11.m2051()
            if (r11 == 0) goto L4eb
        L503:
            int r10 = r10 + 1
            if (r10 < 0) goto L508
            goto L4eb
        L508:
            p000.AbstractC1021yh.m6916()
            r18 = 0
            throw r18
        L50e:
            if (r3 == 0) goto L518
            boolean r9 = r3.isEmpty()
            if (r9 == 0) goto L518
            r11 = 0
            goto L53a
        L518:
            java.util.Iterator r9 = r3.iterator()
            r11 = 0
        L51d:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L53a
            java.lang.Object r12 = r9.next()
            f8 r12 = (p000.C0276f8) r12
            h8 r12 = r12.f3798
            h8 r13 = p000.EnumC0350h8.f4615
            if (r12 != r13) goto L51d
            int r11 = r11 + 1
            if (r11 < 0) goto L534
            goto L51d
        L534:
            p000.AbstractC1021yh.m6916()
            r18 = 0
            throw r18
        L53a:
            if (r3 == 0) goto L544
            boolean r9 = r3.isEmpty()
            if (r9 == 0) goto L544
            r12 = 0
            goto L566
        L544:
            java.util.Iterator r9 = r3.iterator()
            r12 = 0
        L549:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L566
            java.lang.Object r13 = r9.next()
            f8 r13 = (p000.C0276f8) r13
            h8 r13 = r13.f3798
            h8 r14 = p000.EnumC0350h8.f4616
            if (r13 != r14) goto L549
            int r12 = r12 + 1
            if (r12 < 0) goto L560
            goto L549
        L560:
            p000.AbstractC1021yh.m6916()
            r18 = 0
            throw r18
        L566:
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>()
            java.lang.String r13 = "mode"
            java.lang.String r14 = "profile_active_aweme_debug"
            org.json.JSONObject r9 = r9.put(r13, r14)
            java.lang.String r13 = r0.f13104
            java.lang.String r14 = "source"
            org.json.JSONObject r9 = r9.put(r14, r13)
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>()
            java.lang.String r15 = "uid"
            r16 = r8
            java.lang.String r8 = r7.getUid()
            org.json.JSONObject r8 = r13.put(r15, r8)
            java.lang.String r13 = "secUid"
            java.lang.String r15 = r7.getSecUid()
            org.json.JSONObject r8 = r8.put(r13, r15)
            java.lang.String r13 = "nickname"
            java.lang.String r7 = r7.getNickname()
            org.json.JSONObject r7 = r8.put(r13, r7)
            java.lang.String r8 = "profile"
            org.json.JSONObject r7 = r9.put(r8, r7)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r9 = "recognized"
            int r13 = r3.size()
            org.json.JSONObject r8 = r8.put(r9, r13)
            java.lang.String r9 = "unrecognized"
            int r13 = r6.size()
            org.json.JSONObject r8 = r8.put(r9, r13)
            int r9 = r5.size()
            java.lang.String r13 = "pages"
            org.json.JSONObject r8 = r8.put(r13, r9)
            java.lang.String r9 = "image"
            org.json.JSONObject r8 = r8.put(r9, r12)
            java.lang.String r9 = "video"
            org.json.JSONObject r8 = r8.put(r9, r11)
            java.lang.String r9 = "livePhoto"
            org.json.JSONObject r8 = r8.put(r9, r10)
            java.util.Iterator r9 = r3.iterator()
            boolean r10 = r9.hasNext()
            if (r10 != 0) goto L5e7
            r10 = 0
            goto L60d
        L5e7:
            java.lang.Object r10 = r9.next()
            f8 r10 = (p000.C0276f8) r10
            int r10 = r10.f3806
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
        L5f3:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L60d
            java.lang.Object r11 = r9.next()
            f8 r11 = (p000.C0276f8) r11
            int r11 = r11.f3806
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            int r12 = r10.compareTo(r11)
            if (r12 >= 0) goto L5f3
            r10 = r11
            goto L5f3
        L60d:
            if (r10 == 0) goto L614
            int r9 = r10.intValue()
            goto L615
        L614:
            r9 = 0
        L615:
            java.lang.String r10 = "expectedAuthorAwemeCount"
            org.json.JSONObject r8 = r8.put(r10, r9)
            java.lang.String r9 = "counts"
            org.json.JSONObject r7 = r7.put(r9, r8)
            java.lang.String r0 = r0.f13108
            if (r0 != 0) goto L627
            java.lang.Object r0 = org.json.JSONObject.NULL
        L627:
            java.lang.String r8 = "error"
            org.json.JSONObject r0 = r7.put(r8, r0)
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>()
            java.util.Iterator r5 = r5.iterator()
        L636:
            boolean r8 = r5.hasNext()
            java.lang.String r9 = "page"
            if (r8 == 0) goto L691
            java.lang.Object r8 = r5.next()
            aj1 r8 = (p000.aj1) r8
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
            int r11 = r8.f282
            org.json.JSONObject r9 = r10.put(r9, r11)
            java.lang.String r10 = r8.f290
            org.json.JSONObject r9 = r9.put(r14, r10)
            java.lang.String r10 = "rawCount"
            int r11 = r8.f283
            org.json.JSONObject r9 = r9.put(r10, r11)
            java.lang.String r10 = "recognizedCount"
            int r11 = r8.f284
            org.json.JSONObject r9 = r9.put(r10, r11)
            java.lang.String r10 = "unrecognizedCount"
            int r11 = r8.f285
            org.json.JSONObject r9 = r9.put(r10, r11)
            java.lang.String r10 = "totalRecognized"
            int r11 = r8.f286
            org.json.JSONObject r9 = r9.put(r10, r11)
            java.lang.String r10 = "hasMore"
            boolean r11 = r8.f287
            org.json.JSONObject r9 = r9.put(r10, r11)
            java.lang.String r10 = "nextCursor"
            long r11 = r8.f288
            org.json.JSONObject r9 = r9.put(r10, r11)
            java.lang.String r10 = "tailProbe"
            boolean r8 = r8.f289
            org.json.JSONObject r8 = r9.put(r10, r8)
            r7.put(r8)
            goto L636
        L691:
            org.json.JSONObject r0 = r0.put(r13, r7)
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
            r7 = 0
        L69f:
            boolean r8 = r3.hasNext()
            java.lang.String r10 = "desc"
            java.lang.String r11 = "awemeId"
            java.lang.String r12 = "index"
            if (r8 == 0) goto L76b
            java.lang.Object r8 = r3.next()
            int r13 = r7 + 1
            if (r7 < 0) goto L765
            f8 r8 = (p000.C0276f8) r8
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            org.json.JSONObject r7 = r7.put(r12, r13)
            java.lang.String r12 = r8.f3800
            if (r12 != 0) goto L6c3
            r12 = r4
        L6c3:
            org.json.JSONObject r7 = r7.put(r11, r12)
            h8 r11 = r8.f3798
            java.lang.String r11 = r11.name()
            java.lang.String r12 = "type"
            org.json.JSONObject r7 = r7.put(r12, r11)
            java.lang.String r11 = r8.f3794
            org.json.JSONObject r7 = r7.put(r10, r11)
            java.lang.String r10 = "author"
            java.lang.String r11 = r8.f3793
            org.json.JSONObject r7 = r7.put(r10, r11)
            java.lang.String r10 = "createTime"
            long r11 = r8.f3810
            org.json.JSONObject r7 = r7.put(r10, r11)
            java.util.List r10 = r8.f3796
            if (r10 != 0) goto L6ee
            r10 = r2
        L6ee:
            int r10 = r10.size()
            java.lang.String r11 = "imageCount"
            org.json.JSONObject r7 = r7.put(r11, r10)
            java.util.List r10 = r8.f3795
            if (r10 != 0) goto L6fd
            r10 = r2
        L6fd:
            int r10 = r10.size()
            java.lang.String r11 = "videoUrlCount"
            org.json.JSONObject r7 = r7.put(r11, r10)
            java.util.List r10 = r8.f3778
            if (r10 != 0) goto L70c
            r10 = r2
        L70c:
            int r10 = r10.size()
            java.lang.String r11 = "animatedUrlCount"
            org.json.JSONObject r7 = r7.put(r11, r10)
            java.util.List r10 = r8.f3786
            if (r10 != 0) goto L71b
            r10 = r2
        L71b:
            int r10 = r10.size()
            java.lang.String r11 = "livePhotoItemCount"
            org.json.JSONObject r7 = r7.put(r11, r10)
            java.lang.String r10 = "hasLivePhoto"
            boolean r11 = r8.m2051()
            org.json.JSONObject r7 = r7.put(r10, r11)
            java.lang.String r10 = r8.f3797
            if (r10 == 0) goto L73c
            boolean r10 = p000.q02.m4671(r10)
            if (r10 == 0) goto L73a
            goto L73c
        L73a:
            r10 = 0
            goto L73e
        L73c:
            r10 = r16
        L73e:
            r10 = r10 ^ 1
            java.lang.String r11 = "hasCover"
            org.json.JSONObject r7 = r7.put(r11, r10)
            java.lang.String r8 = p000.cj1.m1230(r8)
            if (r8 == 0) goto L755
            boolean r8 = p000.q02.m4671(r8)
            if (r8 == 0) goto L753
            goto L755
        L753:
            r8 = 0
            goto L757
        L755:
            r8 = r16
        L757:
            r8 = r8 ^ 1
            java.lang.String r10 = "hasDownloadablePreview"
            org.json.JSONObject r7 = r7.put(r10, r8)
            r5.put(r7)
            r7 = r13
            goto L69f
        L765:
            p000.AbstractC1021yh.m6917()
            r18 = 0
            throw r18
        L76b:
            java.lang.String r2 = "recognizedWorks"
            org.json.JSONObject r0 = r0.put(r2, r5)
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.Iterator r3 = r6.iterator()
        L77a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L7cb
            java.lang.Object r4 = r3.next()
            bj1 r4 = (p000.bj1) r4
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            int r6 = r4.f1741
            org.json.JSONObject r5 = r5.put(r9, r6)
            int r6 = r4.f1742
            org.json.JSONObject r5 = r5.put(r12, r6)
            java.lang.String r6 = "className"
            java.lang.String r7 = r4.f1743
            org.json.JSONObject r5 = r5.put(r6, r7)
            java.lang.String r6 = "reason"
            java.lang.String r7 = r4.f1744
            org.json.JSONObject r5 = r5.put(r6, r7)
            java.lang.String r6 = r4.f1745
            if (r6 != 0) goto L7ad
            java.lang.Object r6 = org.json.JSONObject.NULL
        L7ad:
            org.json.JSONObject r5 = r5.put(r11, r6)
            java.lang.String r6 = r4.f1747
            if (r6 != 0) goto L7b7
            java.lang.Object r6 = org.json.JSONObject.NULL
        L7b7:
            java.lang.String r7 = "awemeType"
            org.json.JSONObject r5 = r5.put(r7, r6)
            java.lang.String r4 = r4.f1746
            if (r4 != 0) goto L7c3
            java.lang.Object r4 = org.json.JSONObject.NULL
        L7c3:
            org.json.JSONObject r4 = r5.put(r10, r4)
            r2.put(r4)
            goto L77a
        L7cb:
            java.lang.String r3 = "unrecognizedWorks"
            org.json.JSONObject r0 = r0.put(r3, r2)
            r0.getClass()
            r2 = 2
            java.lang.String r0 = r0.toString(r2)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r1)
            r2.setText(r0)
            r3 = 1094713344(0x41400000, float:12.0)
            r2.setTextSize(r3)
            r3 = r16
            r2.setTextIsSelectable(r3)
            r3 = 16
            int r4 = p000.cj1.m1219(r1, r3)
            r5 = 12
            int r6 = p000.cj1.m1219(r1, r5)
            int r3 = p000.cj1.m1219(r1, r3)
            int r5 = p000.cj1.m1219(r1, r5)
            r2.setPadding(r4, r6, r3, r5)
            android.widget.ScrollView r3 = new android.widget.ScrollView
            r3.<init>(r1)
            r3.addView(r2)
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r1)
            java.lang.String r4 = "主页作品调试结果"
            android.app.AlertDialog$Builder r2 = r2.setTitle(r4)
            android.app.AlertDialog$Builder r2 = r2.setView(r3)
            yi1 r3 = new yi1
            r3.<init>(r1, r0)
            java.lang.String r4 = "复制 JSON"
            android.app.AlertDialog$Builder r2 = r2.setPositiveButton(r4, r3)
            yi1 r3 = new yi1
            r3.<init>(r0, r1)
            java.lang.String r0 = "打印日志"
            android.app.AlertDialog$Builder r0 = r2.setNeutralButton(r0, r3)
            java.lang.String r1 = "关闭"
            r3 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r3)
            r0.show()
            return
        L83a:
            java.lang.Object r1 = r0.f5092
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r0 = r0.f5093
            eg1 r0 = (p000.eg1) r0
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.wg1.f11716
            java.lang.String r2 = r0.f3548
            int r3 = r0.f3546
            int r0 = r0.f3547
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "\nbridge="
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = " image="
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            boolean r2 = r1.isFinishing()
            if (r2 == 0) goto L86d
            goto L886
        L86d:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r1)
            java.lang.String r1 = "图片发送测试"
            android.app.AlertDialog$Builder r1 = r2.setTitle(r1)
            android.app.AlertDialog$Builder r0 = r1.setMessage(r0)
            java.lang.String r1 = "确定"
            r3 = 0
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r3)
            r0.show()
        L886:
            return
        L887:
            java.lang.Object r1 = r0.f5092
            a80 r1 = (p000.a80) r1
            java.lang.Object r0 = r0.f5093
            mg1 r0 = (p000.mg1) r0
            r1.invoke(r0)
            return
        L893:
            java.lang.Object r1 = r0.f5092
            f9 r1 = (p000.C0277f9) r1
            java.lang.Object r0 = r0.f5093
            zf1 r0 = (p000.zf1) r0
            r1.invoke(r0)
            return
        L89f:
            java.lang.Object r1 = r0.f5092
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.f5093
            java.util.Iterator r1 = r1.iterator()
        L8a9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8be
            java.lang.Object r2 = r1.next()
            a80 r2 = (p000.a80) r2
            fo1 r3 = new fo1
            r3.<init>(r0)
            r2.invoke(r3)
            goto L8a9
        L8be:
            return
        L8bf:
            java.lang.Object r1 = r0.f5092
            f9 r1 = (p000.C0277f9) r1
            java.lang.Object r0 = r0.f5093
            kf1 r0 = (p000.kf1) r0
            r1.invoke(r0)
            return
        L8cb:
            java.lang.Object r1 = r0.f5092
            f9 r1 = (p000.C0277f9) r1
            java.lang.Object r0 = r0.f5093
            hf1 r0 = (p000.hf1) r0
            r1.invoke(r0)
            return
        L8d7:
            java.lang.Object r1 = r0.f5092
            g71 r1 = (p000.g71) r1
            java.lang.Object r0 = r0.f5093
            te1 r0 = (p000.te1) r0
            r1.invoke(r0)
            return
        L8e3:
            java.lang.Object r1 = r0.f5092
            f9 r1 = (p000.C0277f9) r1
            java.lang.Object r0 = r0.f5093
            qe1 r0 = (p000.qe1) r0
            r1.invoke(r0)
            return
        L8ef:
            java.lang.Object r1 = r0.f5092
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r0 = r0.f5093
            yd1 r0 = (p000.yd1) r0
            x01 r2 = p000.x01.f11964     // Catch: java.lang.Throwable -> L95b
            android.view.LayoutInflater r2 = r2.m6477(r1)     // Catch: java.lang.Throwable -> L95b
            r3 = 2131492917(0x7f0c0035, float:1.86093E38)
            r5 = 0
            r6 = 0
            android.view.View r2 = r2.inflate(r3, r6, r5)     // Catch: java.lang.Throwable -> L95b
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder     // Catch: java.lang.Throwable -> L95b
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L95b
            android.app.AlertDialog$Builder r3 = r3.setView(r2)     // Catch: java.lang.Throwable -> L95b
            android.app.AlertDialog r3 = r3.create()     // Catch: java.lang.Throwable -> L95b
            r2.getClass()     // Catch: java.lang.Throwable -> L95b
            r3.getClass()     // Catch: java.lang.Throwable -> L95b
            p000.i91.m2678(r1, r2, r3, r0)     // Catch: java.lang.Throwable -> L95b
            r3.show()     // Catch: java.lang.Throwable -> L95b
            android.view.Window r0 = r3.getWindow()     // Catch: java.lang.Throwable -> L95b
            if (r0 == 0) goto L971
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.Throwable -> L95b
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L95b
            r0.setBackgroundDrawable(r2)     // Catch: java.lang.Throwable -> L95b
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.setDimAmount(r2)     // Catch: java.lang.Throwable -> L95b
            r2 = 2
            r0.addFlags(r2)     // Catch: java.lang.Throwable -> L95b
            android.content.res.Resources r2 = r1.getResources()     // Catch: java.lang.Throwable -> L95b
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch: java.lang.Throwable -> L95b
            int r2 = r2.widthPixels     // Catch: java.lang.Throwable -> L95b
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L95b
            r3 = 1064346583(0x3f70a3d7, float:0.94)
            float r2 = r2 * r3
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L95b
            android.content.res.Resources r3 = r1.getResources()     // Catch: java.lang.Throwable -> L95b
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()     // Catch: java.lang.Throwable -> L95b
            int r3 = r3.heightPixels     // Catch: java.lang.Throwable -> L95b
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L95b
            r5 = 1063004406(0x3f5c28f6, float:0.86)
            float r3 = r3 * r5
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L95b
            r0.setLayout(r2, r3)     // Catch: java.lang.Throwable -> L95b
            goto L971
        L95b:
            r0 = move-exception
            java.lang.String r2 = "ra6d9ee35efc12f2d"
            java.lang.String r3 = "打开营地统计面板失败"
            p000.C0888ux.m5977(r2, r3, r0)
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L96a
            goto L96b
        L96a:
            r4 = r0
        L96b:
            java.lang.String r0 = "打开营地统计失败: "
            r3 = 1
            p000.a12.m21(r3, r1, r0, r4)
        L971:
            return
        L972:
            r3 = r8
            java.lang.Object r1 = r0.f5092
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r0 = r0.f5093
            a80 r0 = (p000.a80) r0
            java.lang.ClassLoader r2 = p000.dd1.m1717(r1)
            java.lang.Object r2 = p000.ln0.m3640(r2, r3)
            ii0 r3 = new ii0     // Catch: java.lang.Throwable -> L98f
            r4 = 5
            r3.<init>(r0, r4, r2)     // Catch: java.lang.Throwable -> L98f
            r1.runOnUiThread(r3)     // Catch: java.lang.Throwable -> L98f
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L98f
            goto L996
        L98f:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L996:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L9a3
            java.lang.String r1 = "r7ce9b41b1577bc7d"
            java.lang.String r2 = "作物目录刷新结果回调失败"
            p000.C0888ux.m5977(r1, r2, r0)
        L9a3:
            return
        L9a4:
            java.lang.Object r1 = r0.f5092
            a80 r1 = (p000.a80) r1
            java.lang.Object r0 = r0.f5093
            gc1 r0 = (p000.gc1) r0
            r1.invoke(r0)
            return
        L9b0:
            java.lang.Object r1 = r0.f5092
            a80 r1 = (p000.a80) r1
            java.lang.Object r0 = r0.f5093
            dc1 r0 = (p000.dc1) r0
            r1.invoke(r0)
            return
        L9bc:
            java.lang.Object r1 = r0.f5092
            a80 r1 = (p000.a80) r1
            java.lang.Object r0 = r0.f5093
            fo1 r2 = new fo1
            r2.<init>(r0)
            r1.invoke(r2)
            return
        L9cb:
            java.lang.Object r1 = r0.f5092
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r0 = r0.f5093
            android.widget.TextView r0 = (android.widget.TextView) r0
            boolean r2 = r1.isFinishing()
            if (r2 != 0) goto L9e4
            boolean r2 = r1.isDestroyed()
            if (r2 != 0) goto L9e4
            q71 r2 = p000.q71.f8896
            p000.q71.m4781(r1, r0)
        L9e4:
            return
        L9e5:
            java.lang.Object r1 = r0.f5092
            a80 r1 = (p000.a80) r1
            java.lang.Object r0 = r0.f5093
            yj0 r0 = (p000.yj0) r0
            r1.invoke(r0)
            return
        L9f1:
            java.lang.Object r1 = r0.f5092
            java.lang.ClassLoader r1 = (java.lang.ClassLoader) r1
            nz r2 = p000.C0604nz.f7825
            java.lang.Object r0 = r0.f5093
            r3 = r0
            a80 r3 = (p000.a80) r3
            java.util.concurrent.atomic.AtomicBoolean r4 = p000.zj0.f13123
            zj0 r0 = p000.zj0.f13118
            java.lang.String r5 = "一键已读失败："
            java.lang.String r6 = "一键已读失败: "
            r7 = 1
            r8 = 0
            yj0 r0 = r0.m7159(r1, r7, r8, r2)     // Catch: java.lang.Throwable -> La0e
            r4.set(r8)
            goto La48
        La0e:
            r0 = move-exception
            java.lang.Throwable r0 = p000.zj0.m7138(r0)     // Catch: java.lang.Throwable -> La39
            java.lang.String r1 = "DYHelperIMMarkAllReadHelper"
            java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> La39
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La39
            r7.<init>(r6)     // Catch: java.lang.Throwable -> La39
            r7.append(r2)     // Catch: java.lang.Throwable -> La39
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> La39
            p000.C0888ux.m5977(r1, r2, r0)     // Catch: java.lang.Throwable -> La39
            yj0 r1 = new yj0     // Catch: java.lang.Throwable -> La39
            java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> La39
            if (r2 != 0) goto La3c
            java.lang.Class r2 = r0.getClass()     // Catch: java.lang.Throwable -> La39
            java.lang.String r2 = r2.getSimpleName()     // Catch: java.lang.Throwable -> La39
            goto La3c
        La39:
            r0 = move-exception
            r2 = 0
            goto La4c
        La3c:
            java.lang.String r2 = r5.concat(r2)     // Catch: java.lang.Throwable -> La39
            r5 = 0
            r1.<init>(r5, r2, r0)     // Catch: java.lang.Throwable -> La39
            r4.set(r5)
            r0 = r1
        La48:
            p000.zj0.m7134(r3, r0)
            return
        La4c:
            r4.set(r2)
            throw r0
        La50:
            r6 = r10
            vj0 r1 = p000.vj0.f11310
            java.lang.Object r2 = r0.f5092
            ji0 r2 = (p000.ji0) r2
            java.lang.Object r0 = r0.f5093
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            uj0 r0 = r1.m6265(r2, r0)     // Catch: java.lang.Throwable -> La60
            goto La67
        La60:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        La67:
            java.lang.Throwable r1 = p000.fo1.m2190(r0)
            java.lang.String r3 = "r52bdfd08354d522"
            if (r1 != 0) goto La71
            r5 = 0
            goto Lac1
        La71:
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r4 = "互动消息服务端清理中止 type="
            java.lang.String r0 = r4.concat(r0)
            p000.C0888ux.m5977(r3, r0, r1)
            uj0 r0 = new uj0
            boolean r4 = r1 instanceof java.lang.ClassNotFoundException
            if (r4 != 0) goto Labb
            boolean r4 = r1 instanceof java.lang.NoSuchMethodException
            if (r4 != 0) goto Labb
            boolean r4 = r1 instanceof java.lang.NoSuchFieldException
            if (r4 == 0) goto La91
            goto Labb
        La91:
            java.lang.String r1 = r1.getMessage()
            if (r1 == 0) goto Lab8
            java.lang.String r4 = "互动消息"
            r5 = 0
            boolean r4 = p000.x02.m6485(r1, r4, r5)
            if (r4 != 0) goto Lab3
            java.lang.String r4 = "宿主"
            boolean r4 = p000.x02.m6485(r1, r4, r5)
            if (r4 != 0) goto Lab3
            java.lang.String r4 = "当前抖音"
            boolean r4 = p000.x02.m6485(r1, r4, r5)
            if (r4 == 0) goto Lab1
            goto Lab3
        Lab1:
            r10 = r6
            goto Lab4
        Lab3:
            r10 = r1
        Lab4:
            if (r10 == 0) goto Lab8
        Lab6:
            r5 = 0
            goto Labe
        Lab8:
            java.lang.String r10 = "互动消息服务端请求失败，请稍后重试"
            goto Lab6
        Labb:
            java.lang.String r10 = "当前抖音版本暂不支持互动消息清理"
            goto Lab6
        Labe:
            r0.<init>(r5, r5, r5, r10)
        Lac1:
            uj0 r0 = (p000.uj0) r0
            java.util.concurrent.atomic.AtomicBoolean r1 = p000.vj0.f11311
            r1.set(r5)
            li0 r1 = r2.f5477     // Catch: java.lang.Throwable -> Lad7
            p3 r2 = new p3     // Catch: java.lang.Throwable -> Lad7
            r4 = 25
            r2.<init>(r1, r4, r0)     // Catch: java.lang.Throwable -> Lad7
            r1.m3571(r2)     // Catch: java.lang.Throwable -> Lad7
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> Lad7
            goto Lade
        Lad7:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        Lade:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto Laf5
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = "互动消息清理结果回调失败 type="
            java.lang.String r0 = r1.concat(r0)
            p000.C0888ux.m5975(r3, r0)
        Laf5:
            return
        Laf6:
            r6 = r10
            java.lang.Object r1 = r0.f5092
            li0 r1 = (p000.li0) r1
            java.lang.Object r0 = r0.f5093
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto Lb06
            java.lang.String r10 = r0.toString()
            goto Lb07
        Lb06:
            r10 = r6
        Lb07:
            if (r10 != 0) goto Lb0a
            goto Lb0b
        Lb0a:
            r4 = r10
        Lb0b:
            java.lang.CharSequence r0 = p000.q02.m4660(r4)
            java.lang.String r0 = r0.toString()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r0 = p000.AbstractC0602nx.m4134(r2, r0, r2)
            r1.f6646 = r0
            r1.m3568()
            return
    }
}
