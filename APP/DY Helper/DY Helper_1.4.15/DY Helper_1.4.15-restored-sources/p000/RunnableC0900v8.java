package p000;

/* JADX INFO: renamed from: v8 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0900v8 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f11128;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f11129;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f11130;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f11131;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ java.lang.Object f11132;

    /* JADX INFO: renamed from: κ */
    public final /* synthetic */ java.lang.Object f11133;

    public /* synthetic */ RunnableC0900v8(android.app.Activity r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, p000.a80 r6) {
            r1 = this;
            r0 = 4
            r1.f11128 = r0
            r1.<init>()
            r1.f11129 = r2
            r1.f11131 = r3
            r1.f11130 = r4
            r1.f11132 = r5
            r1.f11133 = r6
            return
    }

    public /* synthetic */ RunnableC0900v8(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, int r6) {
            r0 = this;
            r0.f11128 = r6
            r0.f11129 = r1
            r0.f11130 = r2
            r0.f11131 = r3
            r0.f11132 = r4
            r0.f11133 = r5
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r35 = this;
            r0 = r35
            int r1 = r0.f11128
            java.lang.String r2 = "取消"
            r3 = 0
            r4 = 0
            r5 = 1
            java.lang.Object r6 = r0.f11131
            java.lang.Object r7 = r0.f11133
            java.lang.Object r8 = r0.f11132
            java.lang.Object r9 = r0.f11130
            java.lang.Object r10 = r0.f11129
            switch(r1) {
                case 0: goto L483;
                case 1: goto L475;
                case 2: goto L3e5;
                case 3: goto L34a;
                case 4: goto L2ca;
                case 5: goto L2bc;
                case 6: goto L2ae;
                case 7: goto L281;
                default: goto L16;
            }
        L16:
            r12 = r10
            android.app.Activity r12 = (android.app.Activity) r12
            r16 = r9
            java.lang.reflect.Method r16 = (java.lang.reflect.Method) r16
            r18 = r8
            java.lang.Object[] r18 = (java.lang.Object[]) r18
            r25 = r7
            na2 r25 = (p000.na2) r25
            ib2 r1 = p000.ib2.f4981
            boolean r1 = r12.isFinishing()
            java.lang.Object r0 = r0.f11131
            if (r1 != 0) goto L35
            boolean r1 = r12.isDestroyed()
            if (r1 == 0) goto L3b
        L35:
            r9 = r16
            r8 = r18
            goto L27d
        L3b:
            x01 r1 = p000.x01.f11964
            android.view.LayoutInflater r1 = r1.m6477(r12)
            r2 = 2131492926(0x7f0c003e, float:1.8609318E38)
            android.view.View r1 = r1.inflate(r2, r3, r4)
            android.app.Dialog r15 = new android.app.Dialog
            r15.<init>(r12)
            r15.requestWindowFeature(r5)
            r15.setContentView(r1)
            r2 = 2131296783(0x7f09020f, float:1.8211492E38)
            android.view.View r2 = r1.findViewById(r2)
            r21 = r2
            android.widget.ListView r21 = (android.widget.ListView) r21
            r2 = 2131297145(0x7f090379, float:1.8212227E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 2131297143(0x7f090377, float:1.8212223E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r6 = 2131297144(0x7f090378, float:1.8212225E38)
            android.view.View r6 = r1.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131297150(0x7f09037e, float:1.8212237E38)
            android.view.View r7 = r1.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r8 = 2131297147(0x7f09037b, float:1.821223E38)
            android.view.View r8 = r1.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 2131297146(0x7f09037a, float:1.8212229E38)
            android.view.View r9 = r1.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10 = 2131296366(0x7f09006e, float:1.8210647E38)
            android.view.View r10 = r1.findViewById(r10)
            r22 = r10
            android.widget.Button r22 = (android.widget.Button) r22
            r10 = 2131296367(0x7f09006f, float:1.8210649E38)
            android.view.View r10 = r1.findViewById(r10)
            r23 = r10
            android.widget.Button r23 = (android.widget.Button) r23
            r10 = 2131296843(0x7f09024b, float:1.8211614E38)
            android.view.View r20 = r1.findViewById(r10)
            r10 = 2131297149(0x7f09037d, float:1.8212235E38)
            android.view.View r10 = r1.findViewById(r10)
            r27 = r10
            android.widget.TextView r27 = (android.widget.TextView) r27
            r10 = 2131296865(0x7f090261, float:1.8211659E38)
            android.view.View r10 = r1.findViewById(r10)
            r26 = r10
            android.widget.ProgressBar r26 = (android.widget.ProgressBar) r26
            r10 = 2131296842(0x7f09024a, float:1.8211612E38)
            android.view.View r10 = r1.findViewById(r10)
            r11 = 2131297148(0x7f09037c, float:1.8212233E38)
            android.view.View r11 = r1.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r13 = 2131296864(0x7f090260, float:1.8211657E38)
            android.view.View r13 = r1.findViewById(r13)
            android.widget.ProgressBar r13 = (android.widget.ProgressBar) r13
            xx r14 = p000.jx0.m3049(r12)
            java.lang.String r4 = r14.f12356
            java.lang.String r5 = r14.f12355
            r35 = r0
            java.lang.String r0 = r14.f12352
            r30 = r2
            va2 r2 = new va2
            r10.getClass()
            r11.getClass()
            r13.getClass()
            r2.<init>(r12, r10, r11, r13)
            r24 = r2
            um1 r2 = new um1
            r2.<init>()
            r31 = r3
            java.util.ArrayList r3 = p000.ib2.m2731()
            r2.f10912 = r3
            pa2 r3 = new pa2
            r32 = r4
            java.lang.Object r4 = r2.f10912
            java.util.List r4 = (java.util.List) r4
            il1 r19 = new il1
            r29 = 3
            r28 = r15
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r15 = r19
            r19 = r2
            r2 = r21
            r21 = r9
            r9 = r23
            r23 = r11
            r11 = r24
            r24 = r13
            r13 = r15
            r15 = r20
            r20 = r5
            r5 = r22
            r22 = r7
            r7 = r15
            r33 = r27
            r15 = r28
            r3.<init>(r12, r4, r11, r13)
            r2.setAdapter(r3)
            android.graphics.drawable.ColorDrawable r4 = new android.graphics.drawable.ColorDrawable
            java.lang.String r13 = r14.f12353
            int r13 = android.graphics.Color.parseColor(r13)
            r4.<init>(r13)
            r2.setDivider(r4)
            r4 = 1
            r2.setDividerHeight(r4)
            r4 = 0
            r2.setCacheColorHint(r4)
            java.lang.String r4 = r14.f12348
            android.graphics.drawable.RippleDrawable r4 = p000.jx0.m3034(r4)
            r2.setSelector(r4)
            r4 = 12
            android.graphics.drawable.GradientDrawable r4 = p000.jx0.m3062(r4, r12, r0)
            r2.setBackground(r4)
            l9 r2 = new l9
            r4 = 15
            r2.<init>(r11, r4, r15)
            r6.setOnClickListener(r2)
            g90 r13 = new g90
            r17 = r35
            r4 = r14
            r2 = r24
            r14 = r11
            r13.<init>(r14, r15, r16, r17, r18)
            r24 = r14
            r9.setOnClickListener(r13)
            g90 r11 = new g90
            r17 = 6
            r13 = r23
            r23 = r9
            r9 = r13
            r14 = r3
            r13 = r19
            r3 = r24
            r15 = r30
            r16 = r31
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r5.setOnClickListener(r11)
            la2 r11 = new la2
            r17 = 0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r34 = r16
            r16 = r5
            r5 = r11
            r11 = r34
            r14.f8480 = r5
            java.lang.String r5 = r4.f12359
            r3 = 99
            android.graphics.drawable.GradientDrawable r3 = p000.jx0.m3062(r3, r12, r5)
            r11.setBackground(r3)
            java.lang.String r3 = r4.f12351
            r5 = 14
            android.graphics.drawable.GradientDrawable r3 = p000.jx0.m3062(r5, r12, r3)
            r1.setBackground(r3)
            r3 = 2131297164(0x7f09038c, float:1.8212265E38)
            android.view.View r1 = r1.findViewById(r3)
            r3 = 10
            if (r1 == 0) goto L1d2
            android.graphics.drawable.GradientDrawable r5 = p000.jx0.m3062(r3, r12, r0)
            r1.setBackground(r5)
        L1d2:
            android.graphics.drawable.GradientDrawable r1 = p000.jx0.m3062(r3, r12, r0)
            r8.setBackground(r1)
            android.graphics.drawable.GradientDrawable r1 = p000.jx0.m3062(r3, r12, r0)
            r7.setBackground(r1)
            android.graphics.drawable.GradientDrawable r0 = p000.jx0.m3062(r3, r12, r0)
            r10.setBackground(r0)
            int r0 = android.graphics.Color.parseColor(r20)
            r7 = r22
            r7.setTextColor(r0)
            int r0 = android.graphics.Color.parseColor(r32)
            r6.setTextColor(r0)
            int r0 = android.graphics.Color.parseColor(r32)
            r8.setTextColor(r0)
            java.lang.String r0 = r4.f12349
            int r0 = android.graphics.Color.parseColor(r0)
            r1 = r21
            r1.setTextColor(r0)
            int r0 = android.graphics.Color.parseColor(r20)
            r10 = r33
            r10.setTextColor(r0)
            int r0 = android.graphics.Color.parseColor(r20)
            r9.setTextColor(r0)
            r26.getClass()
            r10 = r26
            p000.ib2.m2712(r10, r4)
            p000.ib2.m2712(r2, r4)
            p000.ib2.m2711(r16)
            p000.ib2.m2711(r23)
            java.lang.Object r0 = r13.f10912
            java.util.List r0 = (java.util.List) r0
            p000.ib2.m2710(r13, r14, r15, r11, r0)
            vg r0 = new vg
            r1 = 7
            r3 = r24
            r0.<init>(r1, r3)
            r15 = r28
            r15.setOnDismissListener(r0)
            r15.show()
            android.view.Window r0 = r15.getWindow()
            if (r0 == 0) goto L280
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r4 = 0
            r1.<init>(r4)
            r0.setBackgroundDrawable(r1)
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.setDimAmount(r1)
            r1 = 2
            r0.addFlags(r1)
            android.content.res.Resources r1 = r12.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            float r1 = (float) r1
            r2 = 1064346583(0x3f70a3d7, float:0.94)
            float r1 = r1 * r2
            int r1 = (int) r1
            android.content.res.Resources r2 = r12.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.heightPixels
            float r2 = (float) r2
            r3 = 1061662228(0x3f47ae14, float:0.78)
            float r2 = r2 * r3
            int r2 = (int) r2
            r0.setLayout(r1, r2)
            goto L280
        L27d:
            p000.ib2.m2727(r0, r9, r8)
        L280:
            return
        L281:
            android.widget.TextView r10 = (android.widget.TextView) r10
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            android.widget.Button r6 = (android.widget.Button) r6
            android.widget.Button r8 = (android.widget.Button) r8
            android.app.Activity r7 = (android.app.Activity) r7
            java.lang.String r0 = r9.getMessage()
            if (r0 != 0) goto L293
            java.lang.String r0 = "未知错误"
        L293:
            java.lang.String r1 = "下载失败："
            java.lang.String r0 = r1.concat(r0)
            r10.setText(r0)
            r4 = 1
            r6.setEnabled(r4)
            r8.setEnabled(r4)
            java.lang.String r0 = "下载失败"
            r4 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r7, r0, r4)
            r0.show()
            return
        L2ae:
            android.app.Activity r10 = (android.app.Activity) r10
            sm1 r9 = (p000.sm1) r9
            java.util.List r6 = (java.util.List) r6
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            android.view.View r7 = (android.view.View) r7
            p000.bv1.m1071(r10, r9, r6, r8, r7)
            return
        L2bc:
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            android.widget.CompoundButton r9 = (android.widget.CompoundButton) r9
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r8 = (java.lang.String) r8
            android.app.Activity r7 = (android.app.Activity) r7
            p000.xd1.m6618(r9, r6, r8, r7, r10)
            return
        L2ca:
            android.app.Activity r10 = (android.app.Activity) r10
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r8 = (java.lang.String) r8
            a80 r7 = (p000.a80) r7
            r4 = 1
            android.widget.LinearLayout r0 = p000.AbstractC0602nx.m4123(r10, r4)
            r1 = 48
            r4 = 24
            r5 = 0
            r0.setPadding(r1, r4, r1, r5)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r10)
            r1.setText(r9)
            r4 = 1095761920(0x41500000, float:13.0)
            r1.setTextSize(r4)
            r4 = -12303292(0xffffffffff444444, float:-2.6088314E38)
            r1.setTextColor(r4)
            android.widget.EditText r4 = new android.widget.EditText
            r4.<init>(r10)
            r4.setText(r8)
            r5 = 1
            r4.setSingleLine(r5)
            r4.setFocusable(r5)
            r4.setFocusableInTouchMode(r5)
            android.text.Editable r5 = r4.getText()
            int r5 = r5.length()
            r4.setSelection(r5)
            r5 = 524289(0x80001, float:7.34685E-40)
            r4.setInputType(r5)
            r0.addView(r1)
            r0.addView(r4)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r10)
            android.app.AlertDialog$Builder r1 = r1.setTitle(r6)
            android.app.AlertDialog$Builder r0 = r1.setView(r0)
            ey0 r1 = new ey0
            r5 = 1
            r1.<init>(r7, r4, r8, r5)
            java.lang.String r6 = "保存"
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r6, r1)
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r3)
            android.app.AlertDialog r0 = r0.create()
            fy0 r1 = new fy0
            r1.<init>(r0, r4, r5)
            r0.setOnShowListener(r1)
            r0.show()
            return
        L34a:
            android.app.AlertDialog r10 = (android.app.AlertDialog) r10
            r90 r9 = (p000.r90) r9
            android.widget.ProgressBar r6 = (android.widget.ProgressBar) r6
            android.widget.TextView r8 = (android.widget.TextView) r8
            xx r7 = (p000.C1000xx) r7
            boolean r0 = r10.isShowing()
            if (r0 == 0) goto L3e4
            r9.getClass()
            long r0 = r9.f9298
            r2 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            r4 = 185422799(0xb0d53cf, double:9.1611035E-316)
            long r2 = r2 / r4
            int r2 = (int) r2
            r3 = 1000(0x3e8, float:1.401E-42)
            r10 = 0
            int r2 = p000.j81.m2906(r2, r10, r3)
            r6.setProgress(r2)
            double r0 = (double) r0
            r2 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r0 = r0 / r2
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r6 = "%.1f"
            java.lang.String r0 = java.lang.String.format(r6, r0)
            double r4 = (double) r4
            double r4 = r4 / r2
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            java.lang.String r4 = java.lang.String.format(r6, r4)
            long r10 = r9.f9299
            r12 = 0
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            java.lang.String r12 = " · "
            if (r5 <= 0) goto L3be
            double r10 = (double) r10
            double r10 = r10 / r2
            java.lang.Double r2 = java.lang.Double.valueOf(r10)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r1 = java.lang.String.format(r6, r1)
            java.lang.String r2 = " MB/s"
            java.lang.String r1 = p000.lz1.m3674(r12, r1, r2)
        L3bc:
            r5 = 0
            goto L3c1
        L3be:
            java.lang.String r1 = ""
            goto L3bc
        L3c1:
            r8.setVisibility(r5)
            java.lang.String r2 = r7.f12356
            int r2 = android.graphics.Color.parseColor(r2)
            r8.setTextColor(r2)
            java.lang.String r2 = r9.f9300
            java.lang.String r3 = " / "
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4138(r2, r12, r0, r3, r4)
            java.lang.String r2 = " MB"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.setText(r0)
        L3e4:
            return
        L3e5:
            android.app.Activity r10 = (android.app.Activity) r10
            m10 r9 = (p000.m10) r9
            java.util.concurrent.CountDownLatch r1 = r9.f6885
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r0 = "是否继续执行本次 Feed 流关注请求？\n\n目标："
            boolean r3 = r10.isFinishing()
            if (r3 != 0) goto L471
            boolean r3 = r10.isDestroyed()
            if (r3 == 0) goto L401
            goto L471
        L401:
            android.app.AlertDialog$Builder r3 = new android.app.AlertDialog$Builder     // Catch: java.lang.Throwable -> L448
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L448
            java.lang.String r4 = "确认关注"
            android.app.AlertDialog$Builder r3 = r3.setTitle(r4)     // Catch: java.lang.Throwable -> L448
            boolean r4 = p000.q02.m4671(r6)     // Catch: java.lang.Throwable -> L448
            if (r4 == 0) goto L413
            r6 = r8
        L413:
            boolean r4 = p000.q02.m4671(r6)     // Catch: java.lang.Throwable -> L448
            if (r4 == 0) goto L41c
            java.lang.String r0 = "是否继续执行本次 Feed 流关注请求？"
            goto L420
        L41c:
            java.lang.String r0 = r0.concat(r6)     // Catch: java.lang.Throwable -> L448
        L420:
            android.app.AlertDialog$Builder r0 = r3.setMessage(r0)     // Catch: java.lang.Throwable -> L448
            java.lang.String r3 = "关注"
            k10 r4 = new k10     // Catch: java.lang.Throwable -> L448
            r5 = 0
            r4.<init>(r9, r5)     // Catch: java.lang.Throwable -> L448
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r3, r4)     // Catch: java.lang.Throwable -> L448
            k10 r3 = new k10     // Catch: java.lang.Throwable -> L448
            r4 = 1
            r3.<init>(r9, r4)     // Catch: java.lang.Throwable -> L448
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r2, r3)     // Catch: java.lang.Throwable -> L448
            l10 r2 = new l10     // Catch: java.lang.Throwable -> L448
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L448
            android.app.AlertDialog$Builder r0 = r0.setOnCancelListener(r2)     // Catch: java.lang.Throwable -> L448
            android.app.AlertDialog r0 = r0.show()     // Catch: java.lang.Throwable -> L448
            goto L44f
        L448:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L44f:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L474
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "r6bf684bf1a62dbe6"
            r2.<init>(r3)
            r2.append(r7)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            p000.C0888ux.m5985(r0)
            r1.countDown()
            goto L474
        L471:
            r1.countDown()
        L474:
            return
        L475:
            android.app.Activity r10 = (android.app.Activity) r10
            p9 r9 = (p000.C0679p9) r9
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            η r8 = (p000.C1084) r8
            o7 r7 = (p000.C0613o7) r7
            p000.pd2.m4474(r10, r9, r6, r8, r7)
            return
        L483:
            w32 r10 = (p000.w32) r10
            np0 r9 = (p000.np0) r9
            r12 = r6
            java.lang.String r12 = (java.lang.String) r12
            r17 = r8
            yr r17 = (p000.InterfaceC1031yr) r17
            r16 = r7
            f50 r16 = (p000.f50) r16
            java.lang.String r0 = "BackgroundTextMeasurement"
            android.os.Trace.beginSection(r0)
            tw1 r0 = p000.ax1.m628()     // Catch: java.lang.Throwable -> L4df
            boolean r1 = r0 instanceof p000.f21     // Catch: java.lang.Throwable -> L4df
            if (r1 == 0) goto L4a2
            f21 r0 = (p000.f21) r0     // Catch: java.lang.Throwable -> L4df
            goto L4a3
        L4a2:
            r0 = r3
        L4a3:
            if (r0 == 0) goto L4e1
            f21 r1 = r0.mo1998(r3, r3)     // Catch: java.lang.Throwable -> L4df
            if (r1 == 0) goto L4e1
            tw1 r2 = r1.m5760()     // Catch: java.lang.Throwable -> L4d2
            w32 r13 = p000.j81.m2887(r10, r9)     // Catch: java.lang.Throwable -> L4d4
            jz r14 = p000.C0450jz.f5672     // Catch: java.lang.Throwable -> L4d4
            w2 r11 = new w2     // Catch: java.lang.Throwable -> L4d4
            r15 = r14
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L4d4
            r11.mo808()     // Catch: java.lang.Throwable -> L4d4
            r11.m6308()     // Catch: java.lang.Throwable -> L4d4
            p000.tw1.m5756(r2)     // Catch: java.lang.Throwable -> L4d2
            g81 r0 = r1.mo2013()     // Catch: java.lang.Throwable -> L4df
            r0.mo2292()     // Catch: java.lang.Throwable -> L4df
            r1.mo2000()     // Catch: java.lang.Throwable -> L4df
            android.os.Trace.endSection()
            return
        L4d2:
            r0 = move-exception
            goto L4d9
        L4d4:
            r0 = move-exception
            p000.tw1.m5756(r2)     // Catch: java.lang.Throwable -> L4d2
            throw r0     // Catch: java.lang.Throwable -> L4d2
        L4d9:
            throw r0     // Catch: java.lang.Throwable -> L4da
        L4da:
            r0 = move-exception
            r1.mo2000()     // Catch: java.lang.Throwable -> L4df
            throw r0     // Catch: java.lang.Throwable -> L4df
        L4df:
            r0 = move-exception
            goto L4e9
        L4e1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4df
            java.lang.String r1 = "Cannot create a mutable snapshot of an read-only snapshot"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4df
            throw r0     // Catch: java.lang.Throwable -> L4df
        L4e9:
            android.os.Trace.endSection()
            throw r0
    }
}
