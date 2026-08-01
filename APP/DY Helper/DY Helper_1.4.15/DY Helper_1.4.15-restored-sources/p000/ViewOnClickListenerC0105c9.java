package p000;

/* JADX INFO: renamed from: c9 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0105c9 implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f2007;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.Object f2008;

    /* JADX INFO: renamed from: η */
    public final /* synthetic */ java.lang.Object f2009;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ java.lang.Object f2010;

    public /* synthetic */ ViewOnClickListenerC0105c9(android.app.Activity r1, android.view.LayoutInflater r2, p000.ky1 r3, p000.cu1 r4) {
            r0 = this;
            r2 = 16
            r0.f2007 = r2
            r0.<init>()
            r0.f2008 = r1
            r0.f2009 = r3
            r0.f2010 = r4
            return
    }

    public /* synthetic */ ViewOnClickListenerC0105c9(android.widget.TextView r2, android.app.Activity r3, java.lang.String r4) {
            r1 = this;
            r0 = 12
            r1.f2007 = r0
            r1.<init>()
            r1.f2010 = r2
            r1.f2008 = r3
            r1.f2009 = r4
            return
    }

    public /* synthetic */ ViewOnClickListenerC0105c9(java.lang.Object r1, android.app.Activity r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f2007 = r4
            r0.f2009 = r1
            r0.f2008 = r2
            r0.f2010 = r3
            r0.<init>()
            return
    }

    public /* synthetic */ ViewOnClickListenerC0105c9(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f2007 = r4
            r0.f2008 = r1
            r0.f2009 = r2
            r0.f2010 = r3
            r0.<init>()
            return
    }

    public /* synthetic */ ViewOnClickListenerC0105c9(p000.um1 r2, p000.a80 r3, java.lang.String r4) {
            r1 = this;
            r0 = 5
            r1.f2007 = r0
            r1.<init>()
            r1.f2008 = r2
            r1.f2010 = r3
            r1.f2009 = r4
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r27) {
            r26 = this;
            r0 = r26
            r1 = r27
            int r2 = r0.f2007
            r3 = 8
            r4 = 10
            java.lang.String r5 = ""
            r6 = 14
            r7 = 0
            r9 = 3
            r10 = 0
            r11 = 0
            java.lang.Object r12 = r0.f2010
            java.lang.Object r13 = r0.f2008
            java.lang.Object r0 = r0.f2009
            switch(r2) {
                case 0: goto L512;
                case 1: goto L508;
                case 2: goto L4fe;
                case 3: goto L4f1;
                case 4: goto L492;
                case 5: goto L47f;
                case 6: goto L3fa;
                case 7: goto L3d9;
                case 8: goto L1ae;
                case 9: goto L197;
                case 10: goto L158;
                case 11: goto L149;
                case 12: goto L13f;
                case 13: goto L12d;
                case 14: goto L109;
                case 15: goto Lb8;
                case 16: goto L38;
                default: goto L1c;
            }
        L1c:
            t72 r0 = (p000.t72) r0
            android.app.Activity r13 = (android.app.Activity) r13
            android.app.AlertDialog r12 = (android.app.AlertDialog) r12
            java.lang.Object r1 = p000.ui1.f10844
            java.lang.String r1 = "version_update_skipped_version_code"
            int r0 = r0.f10235
            p000.ui1.m5873(r1, r0)
            java.lang.String r0 = "已跳过当前版本"
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r11)
            r0.show()
            r12.dismiss()
            return
        L38:
            r1 = r13
            android.app.Activity r1 = (android.app.Activity) r1
            ky1 r0 = (p000.ky1) r0
            cu1 r12 = (p000.cu1) r12
            java.util.LinkedHashSet r2 = p000.jz1.f5676
            ry1 r2 = p000.ry1.f9602
            java.lang.String r2 = p000.ry1.m5197(r0)
            my1 r4 = p000.ry1.m5202(r0)
            gy1 r3 = p000.ry1.m5196(r0)
            boolean r5 = r3.f4506
            boolean r3 = r3.f4505
            if (r3 == 0) goto L5b
            if (r5 == 0) goto L5b
            java.lang.String r3 = "custom_on"
        L59:
            r5 = r3
            goto L65
        L5b:
            if (r3 == 0) goto L62
            if (r5 != 0) goto L62
            java.lang.String r3 = "custom_off"
            goto L59
        L62:
            java.lang.String r3 = "follow"
            goto L59
        L65:
            long r13 = r0.f6323
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            int r7 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r7 <= 0) goto L70
            goto L71
        L70:
            r3 = r10
        L71:
            if (r3 == 0) goto L97
            long r7 = r3.longValue()
            java.util.Map r3 = p000.v81.m6126()
            java.lang.Long r9 = java.lang.Long.valueOf(r7)
            java.lang.Object r3 = r3.get(r9)
            sd r3 = (p000.C0794sd) r3
            if (r3 != 0) goto L8c
            sd r3 = new sd
            r3.<init>(r7)
        L8c:
            rd r10 = new rd
            ip1 r7 = r3.f9837
            ip1 r8 = r3.f9838
            ip1 r3 = r3.f9839
            r10.<init>(r7, r8, r3)
        L97:
            r8 = r10
            java.lang.String r3 = " 的续火与小火人"
            java.lang.String r2 = r2.concat(r3)
            qh1 r9 = new qh1
            r3 = 9
            r9.<init>(r1, r3, r0)
            uy1 r10 = new uy1
            r10.<init>(r0, r1, r12, r11)
            z7 r11 = new z7
            r11.<init>(r0, r1, r12, r6)
            java.lang.String r3 = "可单独设置消息来源、续火、火星任务、自动投喂和营地动作覆盖项"
            java.lang.String r6 = "个人续火规则"
            r7 = r0
            p000.jz1.m3097(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        Lb8:
            pu1 r13 = (p000.pu1) r13
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.Context r12 = (android.content.Context) r12
            pu1 r1 = p000.bv1.f1857
            if (r1 != r13) goto Lc3
            goto L108
        Lc3:
            r0.performHapticFeedback(r9)
            p000.bv1.f1857 = r13
            bv1 r0 = p000.bv1.f1853
            p000.bv1.m1079(r12)
            kt0 r0 = new kt0
            r1 = 27
            r0.<init>(r1)
            android.widget.LinearLayout r1 = p000.bv1.f1863
            if (r1 != 0) goto Ldc
            r0.invoke()
            goto L108
        Ldc:
            android.view.ViewPropertyAnimator r2 = r1.animate()
            r3 = 0
            android.view.ViewPropertyAnimator r2 = r2.alpha(r3)
            r3 = -1056964608(0xffffffffc1000000, float:-8.0)
            android.view.ViewPropertyAnimator r2 = r2.translationY(r3)
            r3 = 150(0x96, double:7.4E-322)
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r3)
            android.view.animation.AccelerateDecelerateInterpolator r3 = new android.view.animation.AccelerateDecelerateInterpolator
            r3.<init>()
            android.view.ViewPropertyAnimator r2 = r2.setInterpolator(r3)
            ii0 r3 = new ii0
            r4 = 22
            r3.<init>(r0, r4, r1)
            android.view.ViewPropertyAnimator r0 = r2.withEndAction(r3)
            r0.start()
        L108:
            return
        L109:
            android.app.AlertDialog r0 = (android.app.AlertDialog) r0
            r6 = r13
            android.app.Activity r6 = (android.app.Activity) r6
            a80 r12 = (p000.a80) r12
            r0.dismiss()
            bv1 r0 = p000.bv1.f1853
            java.lang.String r0 = "im_auto_read_filter_rules"
            java.lang.String r9 = p000.ui1.m5893(r0, r5)
            hu r11 = new hu
            r0 = 28
            r11.<init>(r12, r6, r0)
            java.lang.String r7 = "设置自动已读规则"
            java.lang.String r8 = "每行一个规则，也可以使用 cid:/uid:/name:"
            r10 = 131073(0x20001, float:1.83672E-40)
            p000.bv1.m1053(r6, r7, r8, r9, r10, r11)
            return
        L12d:
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            a80 r0 = (p000.a80) r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            r13.performHapticFeedback(r9)
            fi r1 = new fi
            r1.<init>(r12, r9)
            r0.invoke(r1)
            return
        L13f:
            android.widget.TextView r12 = (android.widget.TextView) r12
            android.app.Activity r13 = (android.app.Activity) r13
            java.lang.String r0 = (java.lang.String) r0
            com.example.dyhelper.hook.comment.bookmark.ProfileUidInjectHook.m1461(r12, r13, r0, r1)
            return
        L149:
            a80 r13 = (p000.a80) r13
            um1 r0 = (p000.um1) r0
            android.app.AlertDialog r12 = (android.app.AlertDialog) r12
            java.lang.Object r0 = r0.f10912
            r13.invoke(r0)
            r12.dismiss()
            return
        L158:
            android.widget.EditText r13 = (android.widget.EditText) r13
            rb1 r0 = (p000.rb1) r0
            android.app.AlertDialog r12 = (android.app.AlertDialog) r12
            android.text.Editable r1 = r13.getText()
            if (r1 == 0) goto L178
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L178
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L178
            java.lang.Integer r10 = p000.x02.m6487(r1, r4)
        L178:
            if (r10 == 0) goto L191
            int r1 = r10.intValue()
            if (r1 < 0) goto L191
            int r1 = r10.intValue()
            r2 = 1000000(0xf4240, float:1.401298E-39)
            if (r1 <= r2) goto L18a
            goto L191
        L18a:
            r0.invoke(r10)
            r12.dismiss()
            goto L196
        L191:
            java.lang.String r0 = "请输入 0 到 1000000 之间的整数"
            r13.setError(r0)
        L196:
            return
        L197:
            nb1 r13 = (p000.nb1) r13
            java.util.Set r0 = (java.util.Set) r0
            android.app.AlertDialog r12 = (android.app.AlertDialog) r12
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.TreeSet r1 = new java.util.TreeSet
            r1.<init>()
            p000.AbstractC0984xh.m6664(r0, r1)
            r13.invoke(r1)
            r12.dismiss()
            return
        L1ae:
            r15 = r13
            android.app.Activity r15 = (android.app.Activity) r15
            ec1 r0 = (p000.ec1) r0
            android.view.View r12 = (android.view.View) r12
            z7 r1 = new z7
            r2 = 11
            r1.<init>(r15, r12, r0, r2)
            x01 r2 = p000.x01.f11964
            android.view.LayoutInflater r2 = r2.m6477(r15)
            r4 = 2131492915(0x7f0c0033, float:1.8609295E38)
            android.view.View r2 = r2.inflate(r4, r10, r11)
            r2.getClass()
            android.app.AlertDialog$Builder r4 = new android.app.AlertDialog$Builder
            r4.<init>(r15)
            android.app.AlertDialog$Builder r4 = r4.setView(r2)
            android.app.AlertDialog r4 = r4.create()
            xx r5 = p000.jx0.m3049(r15)
            java.lang.String r7 = r5.f12351
            r8 = 16
            android.graphics.drawable.GradientDrawable r7 = p000.jx0.m3062(r8, r15, r7)
            r2.setBackground(r7)
            r7 = 2131296409(0x7f090099, float:1.8210734E38)
            r8 = 2131296419(0x7f0900a3, float:1.8210754E38)
            r12 = 2131296413(0x7f09009d, float:1.8210742E38)
            int[] r7 = new int[]{r12, r7, r8}
        L1f5:
            if (r11 >= r9) goto L20b
            r8 = r7[r11]
            android.view.View r8 = r2.findViewById(r8)
            java.lang.String r12 = r5.f12352
            r13 = 12
            android.graphics.drawable.GradientDrawable r12 = p000.jx0.m3062(r13, r15, r12)
            r8.setBackground(r12)
            int r11 = r11 + 1
            goto L1f5
        L20b:
            p000.xn0.m6707(r2, r5)
            r7 = 2131296375(0x7f090077, float:1.8210665E38)
            android.view.View r8 = r2.findViewById(r7)
            r8.getClass()
            android.widget.Button r8 = (android.widget.Button) r8
            java.lang.String r9 = r5.f12361
            java.lang.String r11 = r5.f12360
            int r11 = android.graphics.Color.parseColor(r11)
            p000.xn0.m6726(r8, r9, r11)
            r8 = 2131296388(0x7f090084, float:1.8210691E38)
            android.view.View r9 = r2.findViewById(r8)
            r9.getClass()
            android.widget.Button r9 = (android.widget.Button) r9
            java.lang.String r11 = r5.f12367
            java.lang.String r12 = r5.f12366
            int r12 = android.graphics.Color.parseColor(r12)
            p000.xn0.m6726(r9, r11, r12)
            r9 = 2131296410(0x7f09009a, float:1.8210736E38)
            android.view.View r11 = r2.findViewById(r9)
            r11.getClass()
            android.widget.Button r11 = (android.widget.Button) r11
            java.lang.String r12 = r5.f12371
            int r13 = p000.xn0.m6749(r5)
            p000.xn0.m6726(r11, r12, r13)
            r11 = 2131296418(0x7f0900a2, float:1.8210752E38)
            android.view.View r12 = r2.findViewById(r11)
            r12.getClass()
            android.widget.Button r12 = (android.widget.Button) r12
            java.lang.String r5 = r5.f12358
            java.lang.String r13 = "#FFFFFF"
            int r13 = android.graphics.Color.parseColor(r13)
            p000.xn0.m6726(r12, r5, r13)
            r5 = 2131296414(0x7f09009e, float:1.8210744E38)
            android.view.View r5 = r2.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.String r12 = r0.f3484
            r5.setText(r12)
            r5 = 2131296415(0x7f09009f, float:1.8210746E38)
            android.view.View r5 = r2.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.String r12 = p000.xn0.m6725(r0)
            r5.setText(r12)
            java.lang.String r5 = "开启"
            java.lang.String r12 = "关闭"
            java.lang.String r13 = "跟随全局"
            java.lang.String[] r5 = new java.lang.String[]{r13, r5, r12}
            java.util.List r5 = p000.AbstractC1021yh.m6897(r5)
            vb1 r12 = new vb1
            r12.<init>(r15, r5)
            r5 = 2131296412(0x7f09009c, float:1.821074E38)
            android.view.View r5 = r2.findViewById(r5)
            android.widget.Spinner r5 = (android.widget.Spinner) r5
            r13 = 2131296416(0x7f0900a0, float:1.8210748E38)
            android.view.View r13 = r2.findViewById(r13)
            android.widget.Spinner r13 = (android.widget.Spinner) r13
            r14 = 2131296421(0x7f0900a5, float:1.8210758E38)
            android.view.View r14 = r2.findViewById(r14)
            android.widget.Spinner r14 = (android.widget.Spinner) r14
            android.widget.Spinner[] r16 = new android.widget.Spinner[]{r5, r13, r14}
            java.util.List r16 = p000.AbstractC1021yh.m6897(r16)
            java.util.Iterator r16 = r16.iterator()
        L2c0:
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L2f8
            java.lang.Object r17 = r16.next()
            r10 = r17
            android.widget.Spinner r10 = (android.widget.Spinner) r10
            r10.setAdapter(r12)
            xx r11 = p000.jx0.m3049(r15)
            java.lang.String r6 = r11.f12348
            java.lang.String r9 = r11.f12371
            android.graphics.drawable.RippleDrawable r6 = p000.jx0.m3059(r3, r15, r6, r9)
            r10.setBackground(r6)
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            java.lang.String r9 = r11.f12352
            int r9 = android.graphics.Color.parseColor(r9)
            r6.<init>(r9)
            r10.setPopupBackgroundDrawable(r6)
            r6 = 14
            r9 = 2131296410(0x7f09009a, float:1.8210736E38)
            r10 = 0
            r11 = 2131296418(0x7f0900a2, float:1.8210752E38)
            goto L2c0
        L2f8:
            sd r3 = r0.f3485
            ip1 r6 = r3.f9837
            int r6 = r6.ordinal()
            r5.setSelection(r6)
            ip1 r6 = r3.f9838
            int r6 = r6.ordinal()
            r13.setSelection(r6)
            ip1 r6 = r3.f9839
            int r6 = r6.ordinal()
            r14.setSelection(r6)
            um1 r6 = new um1
            r6.<init>()
            td r9 = r3.m5469()
            r6.f10912 = r9
            um1 r10 = new um1
            r10.<init>()
            java.lang.Integer r11 = r3.f9840
            td r12 = p000.EnumC0831td.f10319
            if (r9 != r12) goto L32c
            goto L32d
        L32c:
            r11 = 0
        L32d:
            r10.f10912 = r11
            um1 r9 = new um1
            r9.<init>()
            java.util.Set r3 = r3.f9842
            r9.f10912 = r3
            android.view.View r3 = r2.findViewById(r7)
            android.widget.Button r3 = (android.widget.Button) r3
            android.view.View r7 = r2.findViewById(r8)
            android.widget.Button r7 = (android.widget.Button) r7
            p000.xn0.m6724(r6, r10, r3, r7, r9)
            r20 = r14
            sb1 r14 = new sb1
            r18 = r0
            r19 = r3
            r16 = r6
            r21 = r9
            r17 = r10
            r0 = r20
            r20 = r7
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r19 = r16
            r16 = r18
            r3.setOnClickListener(r14)
            sb1 r14 = new sb1
            r18 = r20
            r20 = r17
            r17 = r21
            r21 = r18
            r18 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r7 = r21
            r21 = r17
            r17 = r20
            r7.setOnClickListener(r14)
            r3 = 2131296411(0x7f09009b, float:1.8210738E38)
            android.view.View r3 = r2.findViewById(r3)
            sa r6 = new sa
            r7 = 13
            r6.<init>(r4, r7)
            r3.setOnClickListener(r6)
            r3 = 2131296410(0x7f09009a, float:1.8210736E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.Button r3 = (android.widget.Button) r3
            sa r6 = new sa
            r7 = 14
            r6.<init>(r4, r7)
            r3.setOnClickListener(r6)
            r3 = 2131296418(0x7f0900a2, float:1.8210752E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.Button r2 = (android.widget.Button) r2
            r18 = r16
            ea0 r16 = new ea0
            r20 = r0
            r25 = r1
            r24 = r4
            r22 = r19
            r23 = r21
            r19 = r13
            r21 = r17
            r17 = r18
            r18 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = r16
            r0 = r24
            r2.setOnClickListener(r1)
            r0.show()
            r1 = 1061326684(0x3f428f5c, float:0.76)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r2 = 1064011039(0x3f6b851f, float:0.92)
            p000.xn0.m6716(r15, r0, r2, r1)
            return
        L3d9:
            qm1 r13 = (p000.qm1) r13
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            android.widget.TextView r12 = (android.widget.TextView) r12
            int r1 = com.example.dyhelper.p002ui.MainActivity.f2568
            boolean r1 = r13.f9050
            r2 = r1 ^ 1
            r13.f9050 = r2
            if (r1 != 0) goto L3ea
            r3 = r11
        L3ea:
            r0.setVisibility(r3)
            boolean r0 = r13.f9050
            if (r0 == 0) goto L3f4
            java.lang.String r0 = "⌄"
            goto L3f6
        L3f4:
            java.lang.String r0 = "›"
        L3f6:
            r12.setText(r0)
            return
        L3fa:
            nd0 r13 = (p000.nd0) r13
            android.widget.EditText r0 = (android.widget.EditText) r0
            android.app.AlertDialog r12 = (android.app.AlertDialog) r12
            android.text.Editable r1 = r0.getText()
            if (r1 == 0) goto L40b
            java.lang.String r1 = r1.toString()
            goto L40c
        L40b:
            r1 = 0
        L40c:
            if (r1 != 0) goto L40f
            goto L410
        L40f:
            r5 = r1
        L410:
            java.lang.CharSequence r1 = p000.q02.m4660(r5)
            java.lang.String r1 = r1.toString()
            int r2 = r1.length()
            if (r2 != 0) goto L41f
            goto L42f
        L41f:
            int r2 = r1.length()
            if (r11 >= r2) goto L434
            char r2 = r1.charAt(r11)
            boolean r2 = java.lang.Character.isDigit(r2)
            if (r2 != 0) goto L431
        L42f:
            r4 = 0
            goto L44b
        L431:
            int r11 = r11 + 1
            goto L41f
        L434:
            java.lang.Long r1 = p000.x02.m6489(r1, r4)
            if (r1 == 0) goto L42f
            long r2 = r1.longValue()
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 <= 0) goto L443
            goto L444
        L443:
            r1 = 0
        L444:
            if (r1 == 0) goto L42f
            java.lang.String r10 = r1.toString()
            r4 = r10
        L44b:
            if (r4 != 0) goto L453
            java.lang.String r1 = "请输入有效的数字 UID"
            r0.setError(r1)
            goto L47e
        L453:
            be0 r0 = p000.be0.f1670
            java.util.List r1 = r0.m943()
            int r9 = r1.size()
            xd0 r1 = new xd0
            java.lang.String r8 = ""
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            r1.<init>(r2, r4, r5, r6, r7, r8)
            r13.m4026(r1)
            java.util.List r0 = r0.m943()
            int r0 = r0.size()
            if (r0 <= r9) goto L47e
            r12.dismiss()
        L47e:
            return
        L47f:
            um1 r13 = (p000.um1) r13
            a80 r12 = (p000.a80) r12
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r13.f10912
            android.app.AlertDialog r1 = (android.app.AlertDialog) r1
            if (r1 == 0) goto L48e
            r1.dismiss()
        L48e:
            r12.invoke(r0)
            return
        L492:
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            r1 = r0
            v20 r1 = (p000.v20) r1
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            z20 r0 = p000.z20.f12945
            android.content.Context r0 = r13.getContext()
            if (r0 != 0) goto L4a2
            goto L4f0
        L4a2:
            android.app.Activity r2 = p000.z20.m7083(r0)
            java.lang.Object r3 = p000.z20.m7081(r13)
            if (r3 != 0) goto L4be
            if (r2 == 0) goto L4bd
            java.util.Map r3 = p000.z20.f12952
            java.lang.Object r3 = r3.get(r2)
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            if (r3 == 0) goto L4bd
            java.lang.Object r3 = r3.get()
            goto L4be
        L4bd:
            r3 = 0
        L4be:
            p80 r4 = r1.f11075     // Catch: java.lang.Throwable -> L4ce
            w20 r5 = new w20     // Catch: java.lang.Throwable -> L4ce
            r5.<init>(r13, r0, r2, r3)     // Catch: java.lang.Throwable -> L4ce
            r4.invoke(r5)     // Catch: java.lang.Throwable -> L4ce
            p000.z20.m7084(r12, r1)     // Catch: java.lang.Throwable -> L4ce
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L4ce
            goto L4d5
        L4ce:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L4d5:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L4f0
            java.lang.String r1 = r1.f11069
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "右侧按钮点击失败 id="
            java.lang.String r3 = ": "
            java.lang.String r0 = p000.a12.m18(r2, r1, r3, r0)
            r1 = 4
            java.lang.String r2 = "FeedRightButtonManager"
            r3 = 0
            p000.C0888ux.m5988(r2, r0, r3, r1, r3)
        L4f0:
            return
        L4f1:
            android.widget.TextView r13 = (android.widget.TextView) r13
            ru r0 = (p000.C0774ru) r0
            zu r12 = (p000.EnumC1071zu) r12
            r13.performHapticFeedback(r9)
            r0.invoke(r12)
            return
        L4fe:
            android.app.Activity r13 = (android.app.Activity) r13
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord) r0
            android.app.AlertDialog r12 = (android.app.AlertDialog) r12
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.m1358(r13, r0, r12, r1)
            return
        L508:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r13 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord) r13
            p70 r0 = (p000.p70) r0
            android.app.AlertDialog r12 = (android.app.AlertDialog) r12
            com.example.dyhelper.hook.comment.bookmark.BookmarkManagerDialog.m1367(r13, r0, r12, r1)
            return
        L512:
            android.app.Activity r13 = (android.app.Activity) r13
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r1 = "clipboard"
            java.lang.Object r1 = r13.getSystemService(r1)
            r1.getClass()
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1
            android.content.ClipData r2 = android.content.ClipData.newPlainText(r0, r12)
            r1.setPrimaryClip(r2)
            java.lang.String r1 = "✅ 已复制"
            java.lang.String r0 = r1.concat(r0)
            android.widget.Toast r0 = android.widget.Toast.makeText(r13, r0, r11)
            r0.show()
            return
    }
}
