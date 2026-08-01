package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class vv1 {

    /* JADX INFO: renamed from: α */
    public final android.app.Activity f11426;

    /* JADX INFO: renamed from: β */
    public final p000.C0598nt f11427;

    /* JADX INFO: renamed from: γ */
    public final java.util.List f11428;

    /* JADX INFO: renamed from: δ */
    public final java.util.ArrayList f11429;

    /* JADX INFO: renamed from: ε */
    public final java.util.List f11430;

    /* JADX INFO: renamed from: ζ */
    public final long f11431;

    /* JADX INFO: renamed from: η */
    public final java.util.concurrent.atomic.AtomicBoolean f11432;

    /* JADX INFO: renamed from: θ */
    public final java.util.concurrent.atomic.AtomicBoolean f11433;

    /* JADX INFO: renamed from: ι */
    public final android.view.View f11434;

    /* JADX INFO: renamed from: κ */
    public final android.widget.TextView f11435;

    /* JADX INFO: renamed from: λ */
    public final android.widget.TextView f11436;

    /* JADX INFO: renamed from: μ */
    public final android.widget.TextView f11437;

    /* JADX INFO: renamed from: ν */
    public final android.widget.TextView f11438;

    /* JADX INFO: renamed from: ξ */
    public final android.widget.ListView f11439;

    /* JADX INFO: renamed from: ο */
    public final android.widget.ScrollView f11440;

    /* JADX INFO: renamed from: π */
    public final android.widget.LinearLayout f11441;

    /* JADX INFO: renamed from: ρ */
    public final android.widget.Button f11442;

    /* JADX INFO: renamed from: σ */
    public final android.widget.Button f11443;

    /* JADX INFO: renamed from: τ */
    public final android.app.AlertDialog f11444;

    /* JADX INFO: renamed from: υ */
    public final p000.sv1 f11445;

    public vv1(android.app.Activity r14, p000.C0598nt r15) {
            r13 = this;
            r14.getClass()
            r13.<init>()
            r13.f11426 = r14
            r13.f11427 = r15
            java.util.List r14 = p000.q71.f8901
            java.util.List r14 = p000.AbstractC0984xh.m6666(r14)
            r13.f11428 = r14
            java.util.ArrayList r15 = new java.util.ArrayList
            r0 = 10
            int r0 = p000.AbstractC1021yh.m6889(r14, r0)
            r15.<init>(r0)
            java.util.Iterator r14 = r14.iterator()
        L21:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r14.next()
            n71 r0 = (p000.n71) r0
            java.lang.String r0 = r0.f7446
            r15.add(r0)
            goto L21
        L33:
            r13.f11429 = r15
            q71 r14 = p000.q71.f8896
            boolean r4 = p000.q71.m4804()
            java.util.List r14 = p000.xv1.m6786()
            r13.f11430 = r14
            java.lang.Object r15 = p000.ui1.f10844
            long r0 = p000.ui1.f10851
            r13.f11431 = r0
            java.util.concurrent.atomic.AtomicBoolean r15 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r15.<init>(r0)
            r13.f11432 = r15
            java.util.concurrent.atomic.AtomicBoolean r15 = new java.util.concurrent.atomic.AtomicBoolean
            r15.<init>(r0)
            r13.f11433 = r15
            x01 r15 = p000.x01.f11964
            android.app.Activity r0 = r13.f11426
            java.lang.String r1 = "dialog_share_panel_action_config"
            r2 = 2131492921(0x7f0c0039, float:1.8609308E38)
            android.view.View r15 = r15.m6476(r2, r0, r1)
            r13.f11434 = r15
            java.lang.String r0 = "share_action_config_close"
            r1 = 2131296930(0x7f0902a2, float:1.821179E38)
            java.lang.Class<android.widget.TextView> r2 = android.widget.TextView.class
            android.view.View r0 = r13.m6278(r1, r2, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r13.f11435 = r0
            java.lang.String r0 = "share_action_config_count"
            r1 = 2131296932(0x7f0902a4, float:1.8211795E38)
            android.view.View r0 = r13.m6278(r1, r2, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r13.f11436 = r0
            java.lang.String r0 = "share_action_config_tab_config"
            r1 = 2131296940(0x7f0902ac, float:1.821181E38)
            android.view.View r0 = r13.m6278(r1, r2, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r13.f11437 = r0
            java.lang.String r0 = "share_action_config_tab_preview"
            r1 = 2131296941(0x7f0902ad, float:1.8211813E38)
            android.view.View r0 = r13.m6278(r1, r2, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r13.f11438 = r0
            r0 = 2131296935(0x7f0902a7, float:1.82118E38)
            java.lang.Class<android.widget.ListView> r1 = android.widget.ListView.class
            java.lang.String r2 = "share_action_config_list"
            android.view.View r0 = r13.m6278(r0, r1, r2)
            android.widget.ListView r0 = (android.widget.ListView) r0
            r13.f11439 = r0
            r0 = 2131296937(0x7f0902a9, float:1.8211805E38)
            java.lang.Class<android.widget.ScrollView> r1 = android.widget.ScrollView.class
            java.lang.String r2 = "share_action_config_preview_page"
            android.view.View r0 = r13.m6278(r0, r1, r2)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r13.f11440 = r0
            r0 = 2131296936(0x7f0902a8, float:1.8211803E38)
            java.lang.Class<android.widget.LinearLayout> r1 = android.widget.LinearLayout.class
            java.lang.String r2 = "share_action_config_preview_container"
            android.view.View r0 = r13.m6278(r0, r1, r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r13.f11441 = r0
            java.lang.String r0 = "share_action_config_cancel"
            r1 = 2131296929(0x7f0902a1, float:1.8211789E38)
            java.lang.Class<android.widget.Button> r2 = android.widget.Button.class
            android.view.View r0 = r13.m6278(r1, r2, r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r13.f11442 = r0
            java.lang.String r0 = "share_action_config_save"
            r1 = 2131296939(0x7f0902ab, float:1.8211809E38)
            android.view.View r0 = r13.m6278(r1, r2, r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r13.f11443 = r0
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            android.app.Activity r1 = r13.f11426
            r0.<init>(r1)
            android.app.AlertDialog$Builder r15 = r0.setView(r15)
            android.app.AlertDialog r15 = r15.create()
            r13.f11444 = r15
            sv1 r0 = new sv1
            android.app.Activity r1 = r13.f11426
            java.util.List r2 = r13.f11428
            java.util.Set r3 = p000.AbstractC0984xh.m6671(r14)
            uu1 r5 = new uu1
            r11 = 0
            r12 = 8
            r6 = 1
            java.lang.Class<vv1> r8 = p000.vv1.class
            java.lang.String r9 = "onSelectionChanged"
            java.lang.String r10 = "onSelectionChanged(Ljava/util/Set;)V"
            r7 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r0.<init>(r1, r2, r3, r4, r5)
            r7.f11445 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m6277(java.util.Set r6) {
            r5 = this;
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r0 = "未选择"
            goto L15
        L9:
            int r0 = r6.size()
            java.lang.String r1 = "已选 "
            java.lang.String r2 = " 项"
            java.lang.String r0 = p000.AbstractC0602nx.m4127(r1, r0, r2)
        L15:
            android.widget.TextView r1 = r5.f11436
            r1.setText(r0)
            android.app.Activity r0 = r5.f11426
            java.util.ArrayList r1 = r5.f11429     // Catch: java.lang.Throwable -> L6e
            r1.getClass()     // Catch: java.lang.Throwable -> L6e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6e
            r2.<init>()     // Catch: java.lang.Throwable -> L6e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L6e
        L2a:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L41
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L6e
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L6e
            boolean r4 = r6.contains(r4)     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L2a
            r2.add(r3)     // Catch: java.lang.Throwable -> L6e
            goto L2a
        L41:
            java.util.List r6 = r5.f11428     // Catch: java.lang.Throwable -> L6e
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r6, r1)     // Catch: java.lang.Throwable -> L6e
            int r1 = p000.ex0.m1970(r1)     // Catch: java.lang.Throwable -> L6e
            r3 = 16
            if (r1 >= r3) goto L52
            r1 = r3
        L52:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L6e
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L6e
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L6e
        L5b:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L70
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> L6e
            r4 = r1
            n71 r4 = (p000.n71) r4     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = r4.f7446     // Catch: java.lang.Throwable -> L6e
            r3.put(r4, r1)     // Catch: java.lang.Throwable -> L6e
            goto L5b
        L6e:
            r6 = move-exception
            goto La8
        L70:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6e
            r6.<init>()     // Catch: java.lang.Throwable -> L6e
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L6e
        L79:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L91
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L6e
            n71 r2 = (p000.n71) r2     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L79
            r6.add(r2)     // Catch: java.lang.Throwable -> L6e
            goto L79
        L91:
            eu1 r1 = new eu1     // Catch: java.lang.Throwable -> L6e
            r2 = 23
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L6e
            java.util.ArrayList r6 = p000.v81.m6129(r6, r1)     // Catch: java.lang.Throwable -> L6e
            tv1 r1 = new tv1     // Catch: java.lang.Throwable -> L6e
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L6e
            r2 = 0
            android.widget.LinearLayout r6 = p000.v81.m6132(r0, r6, r1, r2)     // Catch: java.lang.Throwable -> L6e
            goto Lae
        La8:
            eo1 r1 = new eo1
            r1.<init>(r6)
            r6 = r1
        Lae:
            boolean r1 = r6 instanceof p000.eo1
            android.widget.LinearLayout r5 = r5.f11441
            if (r1 != 0) goto Lbd
            r1 = r6
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r5.removeAllViews()
            r5.addView(r1)
        Lbd:
            java.lang.Throwable r6 = p000.fo1.m2190(r6)
            if (r6 == 0) goto L102
            java.lang.String r1 = "DYHelper"
            java.lang.String r2 = "分享快捷按钮实时预览渲染失败"
            p000.C0888ux.m5977(r1, r2, r6)
            xx r6 = p000.jx0.m3049(r0)
            r5.removeAllViews()
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r0)
            java.lang.String r2 = "预览暂未生成"
            r1.setText(r2)
            r2 = 17
            r1.setGravity(r2)
            r2 = 0
            r1.setIncludeFontPadding(r2)
            r3 = 48
            int r4 = p000.jx0.m3056(r0, r3)
            int r0 = p000.jx0.m3056(r0, r3)
            r1.setPadding(r2, r4, r2, r0)
            java.lang.String r6 = r6.f12356
            int r6 = android.graphics.Color.parseColor(r6)
            r1.setTextColor(r6)
            r6 = 1094713344(0x41400000, float:12.0)
            r1.setTextSize(r6)
            r5.addView(r1)
        L102:
            return
    }

    /* JADX INFO: renamed from: β */
    public final android.view.View m6278(int r2, java.lang.Class r3, java.lang.String r4) {
            r1 = this;
            x01 r0 = p000.x01.f11964
            android.view.View r1 = r1.f11434
            android.view.View r1 = p000.x01.m6472(r1, r4, r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public final void m6279(boolean r3) {
            r2 = this;
            r0 = r3 ^ 1
            android.widget.TextView r1 = r2.f11435
            r1.setEnabled(r0)
            android.widget.Button r1 = r2.f11442
            r1.setEnabled(r0)
            android.widget.TextView r1 = r2.f11437
            r1.setEnabled(r0)
            android.widget.TextView r1 = r2.f11438
            r1.setEnabled(r0)
            android.widget.ListView r1 = r2.f11439
            r1.setEnabled(r0)
            android.widget.Button r1 = r2.f11443
            r1.setEnabled(r0)
            if (r3 == 0) goto L25
            java.lang.String r3 = "保存中..."
            goto L27
        L25:
            java.lang.String r3 = "保存"
        L27:
            r1.setText(r3)
            android.app.AlertDialog r2 = r2.f11444
            r2.setCancelable(r0)
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m6280() {
            r8 = this;
            android.app.Activity r0 = r8.f11426
            xx r1 = p000.jx0.m3049(r0)
            java.lang.String r2 = r1.f12351
            r3 = 14
            android.graphics.drawable.GradientDrawable r2 = p000.jx0.m3062(r3, r0, r2)
            android.view.View r3 = r8.f11434
            r3.setBackground(r2)
            java.lang.String r2 = r1.f12352
            r3 = 12
            android.graphics.drawable.GradientDrawable r4 = p000.jx0.m3062(r3, r0, r2)
            android.widget.ListView r5 = r8.f11439
            r5.setBackground(r4)
            android.graphics.drawable.ColorDrawable r4 = new android.graphics.drawable.ColorDrawable
            java.lang.String r6 = r1.f12353
            int r6 = android.graphics.Color.parseColor(r6)
            r4.<init>(r6)
            r5.setDivider(r4)
            r4 = 1
            r5.setDividerHeight(r4)
            r6 = 0
            r5.setCacheColorHint(r6)
            java.lang.String r7 = r1.f12348
            android.graphics.drawable.RippleDrawable r7 = p000.jx0.m3034(r7)
            r5.setSelector(r7)
            android.widget.ScrollView r7 = r8.f11440
            android.graphics.drawable.GradientDrawable r2 = p000.jx0.m3062(r3, r0, r2)
            r7.setBackground(r2)
            java.lang.String r1 = r1.f12355
            int r1 = android.graphics.Color.parseColor(r1)
            android.widget.Button r2 = r8.f11442
            r2.setTextColor(r1)
            uv1 r1 = new uv1
            r3 = 0
            r1.<init>(r8, r3)
            android.widget.TextView r3 = r8.f11435
            r3.setOnClickListener(r1)
            uv1 r1 = new uv1
            r3 = 1
            r1.<init>(r8, r3)
            r2.setOnClickListener(r1)
            uv1 r1 = new uv1
            r2 = 2
            r1.<init>(r8, r2)
            android.widget.TextView r2 = r8.f11437
            r2.setOnClickListener(r1)
            uv1 r1 = new uv1
            r2 = 3
            r1.<init>(r8, r2)
            android.widget.TextView r2 = r8.f11438
            r2.setOnClickListener(r1)
            uv1 r1 = new uv1
            r2 = 4
            r1.<init>(r8, r2)
            android.widget.Button r2 = r8.f11443
            r2.setOnClickListener(r1)
            sv1 r1 = r8.f11445
            r5.setAdapter(r1)
            java.util.LinkedHashSet r1 = r1.f10055
            java.util.Set r1 = p000.AbstractC0984xh.m6671(r1)
            r8.m6277(r1)
            r8.m6281(r4)
            vg r1 = new vg
            r2 = 6
            r1.<init>(r2, r8)
            android.app.AlertDialog r8 = r8.f11444
            r8.setOnDismissListener(r1)
            r8.setCanceledOnTouchOutside(r6)
            r8.show()
            android.view.Window r8 = r8.getWindow()
            if (r8 == 0) goto Leb
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r1.<init>(r6)
            r8.setBackgroundDrawable(r1)
            android.view.View r1 = r8.getDecorView()
            r1.setPadding(r6, r6, r6, r6)
            r1 = 1056964608(0x3f000000, float:0.5)
            r8.setDimAmount(r1)
            r1 = 2
            r8.addFlags(r1)
            android.content.res.Resources r1 = r0.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            float r1 = (float) r1
            r2 = 1064346583(0x3f70a3d7, float:0.94)
            float r1 = r1 * r2
            int r1 = (int) r1
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            float r0 = (float) r0
            r2 = 1062668861(0x3f570a3d, float:0.84)
            float r0 = r0 * r2
            int r0 = (int) r0
            r8.setLayout(r1, r0)
        Leb:
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m6281(boolean r11) {
            r10 = this;
            android.app.Activity r0 = r10.f11426
            xx r1 = p000.jx0.m3049(r0)
            java.lang.String r2 = r1.f12356
            java.lang.String r3 = r1.f12358
            java.lang.String r4 = r1.f12352
            java.lang.String r5 = r1.f12359
            java.lang.String r1 = r1.f12348
            r6 = 0
            r7 = 8
            if (r11 == 0) goto L17
            r8 = r6
            goto L18
        L17:
            r8 = r7
        L18:
            android.widget.ListView r9 = r10.f11439
            r9.setVisibility(r8)
            if (r11 == 0) goto L20
            r6 = r7
        L20:
            android.widget.ScrollView r8 = r10.f11440
            r8.setVisibility(r6)
            if (r11 == 0) goto L29
            r6 = r5
            goto L2a
        L29:
            r6 = r4
        L2a:
            android.graphics.drawable.RippleDrawable r6 = p000.jx0.m3059(r7, r0, r1, r6)
            android.widget.TextView r8 = r10.f11437
            r8.setBackground(r6)
            if (r11 == 0) goto L36
            goto L37
        L36:
            r4 = r5
        L37:
            android.graphics.drawable.RippleDrawable r0 = p000.jx0.m3059(r7, r0, r1, r4)
            android.widget.TextView r10 = r10.f11438
            r10.setBackground(r0)
            if (r11 == 0) goto L44
            r0 = r3
            goto L45
        L44:
            r0 = r2
        L45:
            int r0 = android.graphics.Color.parseColor(r0)
            r8.setTextColor(r0)
            if (r11 == 0) goto L4f
            goto L50
        L4f:
            r2 = r3
        L50:
            int r11 = android.graphics.Color.parseColor(r2)
            r10.setTextColor(r11)
            return
    }
}
