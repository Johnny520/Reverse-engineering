package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bc0 implements android.content.DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f1627;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f1628;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f1629;

    public /* synthetic */ bc0(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f1627 = r2
            r0.f1628 = r1
            r0.f1629 = r3
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r35, int r36) {
            r34 = this;
            r0 = r34
            r1 = r36
            int r2 = r0.f1627
            r3 = 26
            java.lang.String r6 = ""
            r7 = 0
            r8 = 0
            r9 = 1
            java.lang.Object r10 = r0.f1629
            java.lang.Object r0 = r0.f1628
            switch(r2) {
                case 0: goto L517;
                case 1: goto L4a4;
                case 2: goto L441;
                case 3: goto L432;
                case 4: goto L418;
                case 5: goto L3e0;
                case 6: goto L3bd;
                case 7: goto L64;
                case 8: goto L56;
                case 9: goto L2c;
                default: goto L14;
            }
        L14:
            a80 r0 = (p000.a80) r0
            android.widget.EditText r10 = (android.widget.EditText) r10
            android.text.Editable r1 = r10.getText()
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            r0.invoke(r1)
            return
        L2c:
            android.app.Activity r0 = (android.app.Activity) r0
            ux$α r10 = (p000.C0888ux.C1157) r10
            java.lang.String r1 = "clipboard"
            java.lang.Object r1 = r0.getSystemService(r1)
            boolean r2 = r1 instanceof android.content.ClipboardManager
            if (r2 == 0) goto L3d
            r8 = r1
            android.content.ClipboardManager r8 = (android.content.ClipboardManager) r8
        L3d:
            if (r8 == 0) goto L4c
            java.lang.String r1 = "DyLog"
            java.lang.String r2 = p000.C0888ux.m5982(r10)
            android.content.ClipData r1 = android.content.ClipData.newPlainText(r1, r2)
            r8.setPrimaryClip(r1)
        L4c:
            java.lang.String r1 = "已复制日志"
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r7)
            r0.show()
            return
        L56:
            a80 r0 = (p000.a80) r0
            sm1 r10 = (p000.sm1) r10
            int r1 = r10.f9967
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.invoke(r1)
            return
        L64:
            r13 = r0
            android.app.Activity r13 = (android.app.Activity) r13
            r15 = r10
            a80 r15 = (p000.a80) r15
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = "设置自动已读规则"
            java.lang.String r2 = "im_auto_read_filter_rules"
            if (r1 == 0) goto La1
            if (r1 == r9) goto L8c
            r0 = 2
            if (r1 == r0) goto L79
            goto L3bc
        L79:
            p000.ui1.m5875(r2, r6)
            java.lang.String r0 = "未设置"
            r15.invoke(r0)
            java.lang.String r0 = "规则已清空"
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r7)
            r0.show()
            goto L3bc
        L8c:
            java.lang.String r5 = p000.ui1.m5893(r2, r6)
            hu r7 = new hu
            r7.<init>(r15, r13, r3)
            java.lang.String r4 = "每行一个规则，也可以使用 cid:/uid:/name:"
            r6 = 131073(0x20001, float:1.83672E-40)
            r3 = r0
            r2 = r13
            p000.bv1.m1053(r2, r3, r4, r5, r6, r7)
            goto L3bc
        La1:
            r3 = r0
            x01 r0 = p000.x01.f11964     // Catch: java.lang.Throwable -> L390
            android.view.LayoutInflater r0 = r0.m6477(r13)     // Catch: java.lang.Throwable -> L390
            r1 = 2131492907(0x7f0c002b, float:1.860928E38)
            android.view.View r1 = r0.inflate(r1, r8)
            android.content.Context r10 = r1.getContext()
            r11 = 2131296723(0x7f0901d3, float:1.821137E38)
            android.view.View r11 = r1.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r12 = 2131296731(0x7f0901db, float:1.8211387E38)
            android.view.View r12 = r1.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r14 = 2131296724(0x7f0901d4, float:1.8211373E38)
            android.view.View r14 = r1.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r5 = 2131296730(0x7f0901da, float:1.8211385E38)
            android.view.View r5 = r1.findViewById(r5)
            r24 = r5
            android.widget.TextView r24 = (android.widget.TextView) r24
            r5 = 2131296716(0x7f0901cc, float:1.8211357E38)
            android.view.View r5 = r1.findViewById(r5)
            android.widget.EditText r5 = (android.widget.EditText) r5
            r9 = 2131296718(0x7f0901ce, float:1.821136E38)
            android.view.View r9 = r1.findViewById(r9)
            android.widget.ListView r9 = (android.widget.ListView) r9
            r7 = 2131296725(0x7f0901d5, float:1.8211375E38)
            android.view.View r7 = r1.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r8 = 2131296719(0x7f0901cf, float:1.8211363E38)
            android.view.View r8 = r1.findViewById(r8)
            r4 = 2131296720(0x7f0901d0, float:1.8211365E38)
            android.view.View r29 = r1.findViewById(r4)
            r4 = 2131296729(0x7f0901d9, float:1.8211383E38)
            android.view.View r4 = r1.findViewById(r4)
            r26 = r4
            android.widget.TextView r26 = (android.widget.TextView) r26
            r12.setText(r3)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            java.lang.String r4 = "#EAF3EA"
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setColor(r4)
            r10.getClass()
            r4 = 10
            int r12 = p000.bv1.m1076(r10, r4)
            float r4 = (float) r12
            r3.setCornerRadius(r4)
            r14.setBackground(r3)
            java.lang.String r3 = "#4A5E4D"
            int r3 = android.graphics.Color.parseColor(r3)
            r14.setTextColor(r3)
            java.lang.String r3 = "#1C2B1E"
            int r3 = android.graphics.Color.parseColor(r3)
            r5.setTextColor(r3)
            java.lang.String r3 = "#9EB09F"
            int r3 = android.graphics.Color.parseColor(r3)
            r5.setHintTextColor(r3)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            java.lang.String r4 = "#F4F6F4"
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setColor(r4)
            r4 = 10
            int r12 = p000.bv1.m1076(r10, r4)
            float r4 = (float) r12
            r3.setCornerRadius(r4)
            r5.setBackground(r3)
            r3 = 12
            int r4 = p000.bv1.m1076(r10, r3)
            r12 = 8
            r22 = r14
            int r14 = p000.bv1.m1076(r10, r12)
            int r3 = p000.bv1.m1076(r10, r3)
            int r10 = p000.bv1.m1076(r10, r12)
            r5.setPadding(r4, r14, r3, r10)
            r3 = 0
            r9.setDivider(r3)
            r3 = 0
            r9.setCacheColorHint(r3)
            r9.setEmptyView(r7)
            java.lang.String r2 = p000.ui1.m5893(r2, r6)
            java.lang.String r3 = "\r"
            java.lang.String r4 = "\n"
            java.lang.String r2 = p000.x02.m6483(r2, r3, r4)
            java.util.List r2 = p000.q02.m4675(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r10 = p000.AbstractC1021yh.m6889(r2, r4)
            r3.<init>(r10)
            java.util.Iterator r2 = r2.iterator()
        L1a7:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L1bf
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = p000.q02.m4660(r4)
            java.lang.String r4 = r4.toString()
            r3.add(r4)
            goto L1a7
        L1bf:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r2 = r3.iterator()
        L1c8:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1df
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = p000.q02.m4671(r4)
            if (r4 != 0) goto L1c8
            r14.add(r3)
            goto L1c8
        L1df:
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r3 = p000.AbstractC1021yh.m6889(r14, r4)
            r2.<init>(r3)
            java.util.Iterator r3 = r14.iterator()
        L1ee:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L202
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = p000.bv1.m1035(r4)
            r2.add(r4)
            goto L1ee
        L202:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L20b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L222
            java.lang.Object r4 = r2.next()
            r10 = r4
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = p000.q02.m4671(r10)
            if (r10 != 0) goto L20b
            r3.add(r4)
            goto L20b
        L222:
            java.util.Set r2 = p000.AbstractC0984xh.m6671(r3)
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            java.util.HashSet r18 = new java.util.HashSet
            r18.<init>()
            um1 r12 = new um1
            r12.<init>()
            jz r3 = p000.C0450jz.f5672
            r12.f10912 = r3
            um1 r4 = new um1
            r4.<init>()
            r4.f10912 = r3
            um1 r3 = new um1
            r3.<init>()
            r3.f10912 = r6
            qm1 r6 = new qm1
            r6.<init>()
            r34 = r2
            r2 = 1
            r6.f9050 = r2
            um1 r25 = new um1
            r25.<init>()
            um1 r2 = new um1
            r2.<init>()
            r35 = r2
            qm1 r2 = new qm1
            r2.<init>()
            java.util.concurrent.atomic.AtomicLong r16 = p000.bv1.f1870
            r23 = r6
            r27 = r7
            long r6 = r16.incrementAndGet()
            r36 = r3
            zc0 r3 = new zc0
            r3.<init>(r4, r0, r10)
            r9.setAdapter(r3)
            xt1 r16 = new xt1
            r20 = r3
            r17 = r4
            r19 = r10
            r21 = r12
            r28 = r26
            r26 = r36
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r3 = r16
            r12 = r17
            r0 = r18
            r16 = r20
            r20 = r21
            r18 = r26
            r17 = r28
            r9.setOnItemClickListener(r3)
            r21 = r16
            yu1 r16 = new yu1
            r26 = r27
            r28 = r29
            r27 = r17
            r29 = r19
            r17 = r35
            r19 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r3 = r27
            r27 = r26
            r26 = r3
            r10 = r16
            r9 = r17
            r4 = r19
            r3 = r28
            r19 = r29
            r5.addTextChangedListener(r10)
            android.app.AlertDialog$Builder r10 = new android.app.AlertDialog$Builder
            r10.<init>(r13)
            android.app.AlertDialog$Builder r1 = r10.setView(r1)
            android.app.AlertDialog r1 = r1.create()
            sa r10 = new sa
            r12 = 23
            r10.<init>(r1, r12)
            r11.setOnClickListener(r10)
            c9 r10 = new c9
            r11 = 14
            r10.<init>(r1, r13, r15, r11)
            r8.setOnClickListener(r10)
            tt1 r10 = new tt1
            r16 = r1
            r17 = r19
            r12 = r20
            r11 = r23
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r3.setOnClickListener(r10)
            yt1 r8 = new yt1
            r8.<init>(r2, r9, r6)
            r1.setOnDismissListener(r8)
            r8 = 1
            r11.f9050 = r8
            r16 = r27
            java.lang.String r27 = ""
            r17 = r25
            r25 = r16
            r16 = r21
            r21 = r17
            r17 = r11
            r28 = r19
            r23 = r22
            r22 = r3
            r19 = r4
            p000.bv1.m1048(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r12 = r19
            r29 = r22
            r22 = r23
            r27 = r25
            r19 = r28
            r23 = r17
            r25 = r21
            r17 = r26
            r21 = r16
            r1.show()
            android.view.Window r3 = r1.getWindow()
            if (r3 == 0) goto L352
            android.graphics.drawable.ColorDrawable r4 = new android.graphics.drawable.ColorDrawable
            r8 = 0
            r4.<init>(r8)
            r3.setBackgroundDrawable(r4)
            android.view.View r4 = r3.getDecorView()
            r4.setPadding(r8, r8, r8, r8)
            android.content.res.Resources r4 = r13.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r4 = r4.widthPixels
            float r4 = (float) r4
            r8 = 1064346583(0x3f70a3d7, float:0.94)
            float r4 = r4 * r8
            int r4 = (int) r4
            r8 = -2
            r3.setLayout(r4, r8)
        L352:
            java.lang.Class r3 = r13.getClass()
            java.lang.ClassLoader r3 = r3.getClassLoader()
            h22 r4 = p000.bv1.f1869
            java.lang.Object r4 = r4.getValue()
            java.util.concurrent.ExecutorService r4 = (java.util.concurrent.ExecutorService) r4
            r10 = r19
            r19 = r2
            zt1 r2 = new zt1
            r8 = r34
            r9 = r0
            r0 = r4
            r11 = r18
            r14 = r22
            r15 = r24
            r4 = r25
            r16 = r27
            r18 = r29
            r31 = r21
            r21 = r1
            r32 = r6
            r7 = r5
            r6 = r20
            r5 = r23
            r22 = r32
            r20 = r13
            r13 = r31
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0.execute(r2)
            goto L3bc
        L390:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r2 = "创建模块 Context 失败: "
            java.lang.String r1 = p000.lz1.m3687(r2, r1)
            r2 = 4
            java.lang.String r3 = "DYHelper"
            r4 = 0
            p000.C0888ux.m5988(r3, r1, r4, r2, r4)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "模块资源加载失败: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r3)
            r0.show()
        L3bc:
            return
        L3bd:
            android.app.Activity r0 = (android.app.Activity) r0
            ky1 r10 = (p000.ky1) r10
            java.util.concurrent.atomic.AtomicBoolean r2 = p000.wg1.f11716
            if (r1 == 0) goto L3d4
            r2 = 1
            if (r1 == r2) goto L3c9
            goto L3df
        L3c9:
            tg1 r1 = new tg1
            r1.<init>(r0, r10, r2)
            java.lang.String r2 = "正在读取图片任务"
            p000.wg1.m6380(r0, r2, r1)
            goto L3df
        L3d4:
            tg1 r1 = new tg1
            r3 = 0
            r1.<init>(r0, r10, r3)
            java.lang.String r2 = "正在读取实时互发任务"
            p000.wg1.m6380(r0, r2, r1)
        L3df:
            return
        L3e0:
            android.app.Activity r0 = (android.app.Activity) r0
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r1 = r10.get(r1)
            ky1 r1 = (p000.ky1) r1
            ry1 r2 = p000.ry1.f9602
            java.lang.String r2 = p000.ry1.m5197(r1)
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder
            r3.<init>(r0)
            android.app.AlertDialog$Builder r2 = r3.setTitle(r2)
            java.lang.String r3 = "按实时任务数量发送文本"
            java.lang.String r4 = "选择 SAF 图片发送"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            java.lang.CharSequence[] r3 = (java.lang.CharSequence[]) r3
            bc0 r4 = new bc0
            r5 = 6
            r4.<init>(r0, r5, r1)
            android.app.AlertDialog$Builder r0 = r2.setItems(r3, r4)
            java.lang.String r1 = "取消"
            r3 = 0
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r3)
            r0.show()
            return
        L418:
            a80 r0 = (p000.a80) r0
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            if (r1 != 0) goto L41f
            goto L42b
        L41f:
            r30 = 1
            int r1 = r1 + (-1)
            java.lang.Object r1 = r10.get(r1)
            s71 r1 = (p000.s71) r1
            java.lang.String r6 = r1.f9753
        L42b:
            r0.invoke(r6)
            r35.dismiss()
            return
        L432:
            android.app.Activity r0 = (android.app.Activity) r0
            p3 r10 = (p000.C0673p3) r10
            wa r1 = new wa
            r12 = 23
            r1.<init>(r0, r12, r10)
            p000.AbstractC1021yh.m6911(r0, r1)
            return
        L441:
            f8 r0 = (p000.C0276f8) r0
            android.app.Activity r10 = (android.app.Activity) r10
            java.lang.String r1 = r0.f3801
            if (r1 == 0) goto L452
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r3 = r1.toString()
            goto L453
        L452:
            r3 = 0
        L453:
            if (r3 != 0) goto L456
            r3 = r6
        L456:
            java.lang.String r0 = r0.f3802
            if (r0 == 0) goto L463
            java.lang.CharSequence r0 = p000.q02.m4660(r0)
            java.lang.String r8 = r0.toString()
            goto L464
        L463:
            r8 = 0
        L464:
            if (r8 != 0) goto L467
            r8 = r6
        L467:
            boolean r0 = p000.q02.m4671(r3)
            if (r0 != 0) goto L47c
            boolean r0 = p000.q02.m4671(r8)
            if (r0 != 0) goto L47c
            java.lang.String r0 = "uid="
            java.lang.String r1 = "\nsec_uid="
            java.lang.String r6 = p000.a12.m18(r0, r3, r1, r8)
            goto L48b
        L47c:
            boolean r0 = p000.q02.m4671(r3)
            if (r0 != 0) goto L484
            r6 = r3
            goto L48b
        L484:
            boolean r0 = p000.q02.m4671(r8)
            if (r0 != 0) goto L48b
            r6 = r8
        L48b:
            boolean r0 = p000.q02.m4671(r6)
            if (r0 == 0) goto L49c
            java.lang.String r0 = "当前未识别到主页ID"
            r3 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r10, r0, r3)
            r0.show()
            goto L4a3
        L49c:
            q71 r0 = p000.q71.f8896
            java.lang.String r0 = "主页ID已复制"
            p000.q71.m4792(r10, r6, r0)
        L4a3:
            return
        L4a4:
            li0 r0 = (p000.li0) r0
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            boolean r1 = r0.f6648
            if (r1 != 0) goto L516
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L4b3
            goto L516
        L4b3:
            r2 = 1
            r0.f6648 = r2
            r8 = 0
            r0.f6652 = r8
            int r1 = r10.size()
            r0.f6653 = r1
            r4 = 0
            r0.f6654 = r4
            r0.m3572(r2)
            dj0 r1 = new dj0
            hi0 r2 = new hi0
            r2.<init>(r0)
            r1.<init>(r2)
            ji0 r2 = new ji0
            r2.<init>(r0)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r10.iterator()
        L4e2:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L4fb
            java.lang.Object r7 = r6.next()
            r8 = r7
            xi0 r8 = (p000.xi0) r8
            java.lang.String r8 = r8.f12180
            boolean r8 = r4.add(r8)
            if (r8 == 0) goto L4e2
            r5.add(r7)
            goto L4e2
        L4fb:
            cj0 r4 = new cj0
            r4.<init>(r5, r2)
            zi0 r2 = new zi0
            r2.<init>(r1, r4)
            java.util.concurrent.ScheduledExecutorService r5 = r1.f3187
            r5.execute(r2)
            n5 r2 = new n5
            p3 r5 = new p3
            r5.<init>(r1, r3, r4)
            r2.<init>(r5)
            r0.f6656 = r2
        L516:
            return
        L517:
            dc0 r0 = (p000.dc0) r0
            java.util.List r10 = (java.util.List) r10
            java.util.ArrayList r1 = new java.util.ArrayList
            r4 = 10
            int r2 = p000.AbstractC1021yh.m6889(r10, r4)
            r1.<init>(r2)
            java.util.Iterator r2 = r10.iterator()
        L52a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L540
            java.lang.Object r3 = r2.next()
            ic0 r3 = (p000.ic0) r3
            long r3 = r3.f4993
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.add(r3)
            goto L52a
        L540:
            boolean r2 = r0.f3071
            if (r2 != 0) goto L56f
            boolean r2 = r0.f3072
            if (r2 != 0) goto L56f
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L56f
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.f3066
            boolean r2 = r2.get()
            if (r2 == 0) goto L557
            goto L56f
        L557:
            r2 = 1
            r0.f3072 = r2
            java.lang.String r2 = "正在提交入群审批"
            r0.f3073 = r2
            r0.f3074 = r6
            r0.m1695()
            java.util.concurrent.ExecutorService r2 = p000.ec0.f3480
            w1 r3 = new w1
            r12 = 23
            r3.<init>(r0, r12, r1)
            r2.execute(r3)
        L56f:
            return
    }
}
