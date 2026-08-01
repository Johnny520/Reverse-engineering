package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class sv1 extends android.widget.BaseAdapter {

    /* JADX INFO: renamed from: ε */
    public final android.content.Context f10051;

    /* JADX INFO: renamed from: ζ */
    public final java.util.List f10052;

    /* JADX INFO: renamed from: η */
    public final boolean f10053;

    /* JADX INFO: renamed from: θ */
    public final p000.uu1 f10054;

    /* JADX INFO: renamed from: ι */
    public final java.util.LinkedHashSet f10055;

    public sv1(android.content.Context r3, java.util.List r4, java.util.Set r5, boolean r6, p000.uu1 r7) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            r2.<init>()
            r2.f10051 = r3
            r2.f10052 = r4
            r2.f10053 = r6
            r2.f10054 = r7
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.Iterator r4 = r5.iterator()
        L1c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L58
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.util.List r7 = r2.f10052
            java.util.Iterator r7 = r7.iterator()
        L2f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L45
            java.lang.Object r0 = r7.next()
            r1 = r0
            n71 r1 = (p000.n71) r1
            java.lang.String r1 = r1.f7446
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L2f
            goto L46
        L45:
            r0 = 0
        L46:
            n71 r0 = (p000.n71) r0
            if (r0 == 0) goto L51
            boolean r6 = r2.f10053
            boolean r6 = r0.m4010(r6)
            goto L52
        L51:
            r6 = 0
        L52:
            if (r6 == 0) goto L1c
            r3.add(r5)
            goto L1c
        L58:
            r2.f10055 = r3
            return
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r0 = this;
            java.util.List r0 = r0.f10052
            int r0 = r0.size()
            return r0
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int r1) {
            r0 = this;
            java.util.List r0 = r0.f10052
            java.lang.Object r0 = r0.get(r1)
            n71 r0 = (p000.n71) r0
            return r0
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r1) {
            r0 = this;
            long r0 = (long) r1
            return r0
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r11, android.view.View r12, android.view.ViewGroup r13) {
            r10 = this;
            rv1 r12 = r10.m5576(r12)     // Catch: java.lang.Throwable -> La
            r10.m5575(r12, r11)     // Catch: java.lang.Throwable -> La
            android.view.View r12 = r12.f9527     // Catch: java.lang.Throwable -> La
            goto L11
        La:
            r12 = move-exception
            eo1 r13 = new eo1
            r13.<init>(r12)
            r12 = r13
        L11:
            java.lang.Throwable r13 = p000.fo1.m2190(r12)
            if (r13 == 0) goto L2a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "分享快捷按钮列表项绑定失败 position="
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DYHelper"
            p000.C0888ux.m5977(r1, r0, r13)
        L2a:
            java.lang.Throwable r13 = p000.fo1.m2190(r12)
            if (r13 != 0) goto L32
            goto L12a
        L32:
            java.util.List r12 = r10.f10052
            java.lang.Object r11 = r12.get(r11)
            n71 r11 = (p000.n71) r11
            android.content.Context r12 = r10.f10051
            xx r13 = p000.jx0.m3049(r12)
            boolean r0 = r10.f10053
            boolean r0 = r11.m4010(r0)
            r1 = r0 ^ 1
            android.widget.CheckBox r2 = new android.widget.CheckBox
            r2.<init>(r12)
            java.util.LinkedHashSet r3 = r10.f10055
            java.lang.String r4 = r11.f7446
            boolean r3 = r3.contains(r4)
            r2.setChecked(r3)
            r2.setEnabled(r0)
            java.lang.String r3 = r13.f12360
            int r3 = android.graphics.Color.parseColor(r3)
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
            r2.setButtonTintList(r3)
            java.lang.String r3 = r11.f7447
            java.lang.String r4 = "选择"
            java.lang.String r4 = r4.concat(r3)
            r2.setContentDescription(r4)
            ov1 r4 = new ov1
            r5 = 1
            r4.<init>(r10, r11, r5)
            r2.setOnCheckedChangeListener(r4)
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            r10.<init>(r12)
            r12 = 0
            r10.setOrientation(r12)
            r4 = 16
            r10.setGravity(r4)
            android.content.Context r4 = r10.getContext()
            r4.getClass()
            r5 = 56
            int r4 = p000.jx0.m3056(r4, r5)
            r10.setMinimumHeight(r4)
            android.content.Context r4 = r10.getContext()
            r4.getClass()
            r5 = 10
            int r4 = p000.jx0.m3056(r4, r5)
            android.content.Context r5 = r10.getContext()
            r5.getClass()
            r6 = 7
            int r5 = p000.jx0.m3056(r5, r6)
            android.content.Context r7 = r10.getContext()
            r7.getClass()
            r8 = 8
            int r7 = p000.jx0.m3056(r7, r8)
            android.content.Context r9 = r10.getContext()
            r9.getClass()
            int r6 = p000.jx0.m3056(r9, r6)
            r10.setPadding(r4, r5, r7, r6)
            android.content.Context r4 = r10.getContext()
            r4.getClass()
            java.lang.String r5 = r13.f12348
            java.lang.String r6 = r13.f12352
            android.graphics.drawable.RippleDrawable r4 = p000.jx0.m3059(r8, r4, r5, r6)
            r10.setBackground(r4)
            r10.addView(r2)
            android.widget.TextView r4 = new android.widget.TextView
            android.content.Context r5 = r10.getContext()
            r4.<init>(r5)
            java.lang.String r5 = r11.f7448
            if (r0 != 0) goto Lf6
            java.lang.String r6 = "需要内测资格 · "
            java.lang.String r5 = r6.concat(r5)
        Lf6:
            android.text.SpannableString r13 = p000.jx0.m3064(r3, r5, r13)
            r4.setText(r13)
            r13 = 2
            r4.setMaxLines(r13)
            r4.setIncludeFontPadding(r12)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r3 = -2
            r5 = 1065353216(0x3f800000, float:1.0)
            r13.<init>(r12, r3, r5)
            r4.setLayoutParams(r13)
            r10.addView(r4)
            r12 = 1
            r10.setClickable(r12)
            r10.setFocusable(r0)
            if (r0 != 0) goto L11e
            r5 = 1058306785(0x3f147ae1, float:0.58)
        L11e:
            r10.setAlpha(r5)
            qv1 r12 = new qv1
            r12.<init>(r1, r10, r11, r2)
            r10.setOnClickListener(r12)
            r12 = r10
        L12a:
            android.view.View r12 = (android.view.View) r12
            return r12
    }

    /* JADX INFO: renamed from: α */
    public final void m5575(p000.rv1 r20, int r21) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.util.List r3 = r0.f10052
            java.lang.Object r4 = r3.get(r2)
            n71 r4 = (p000.n71) r4
            java.lang.String r5 = r4.f7446
            java.lang.String r6 = r4.f7447
            java.lang.String r7 = r4.f7449
            java.util.LinkedHashSet r8 = r0.f10055
            boolean r5 = r8.contains(r5)
            boolean r8 = r0.f10053
            boolean r8 = r4.m4010(r8)
            r9 = r8 ^ 1
            android.content.Context r10 = r0.f10051
            xx r11 = p000.jx0.m3049(r10)
            java.lang.String r12 = r11.f12360
            java.lang.String r13 = r11.f12356
            java.lang.String r14 = r11.f12357
            r15 = 1
            if (r2 == 0) goto L43
            int r2 = r2 - r15
            java.lang.Object r2 = r3.get(r2)
            n71 r2 = (p000.n71) r2
            java.lang.String r2 = r2.f7449
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L41
            goto L43
        L41:
            r2 = 0
            goto L44
        L43:
            r2 = r15
        L44:
            android.widget.TextView r3 = r1.f9528
            android.widget.TextView r15 = r1.f9532
            r21 = r2
            android.widget.TextView r2 = r1.f9531
            r16 = r12
            android.view.View r12 = r1.f9529
            r17 = r13
            android.widget.CheckBox r13 = r1.f9530
            r18 = r14
            if (r21 == 0) goto L5a
            r14 = 0
            goto L5c
        L5a:
            r14 = 8
        L5c:
            r3.setVisibility(r14)
            r3.setText(r7)
            int r7 = android.graphics.Color.parseColor(r17)
            r3.setTextColor(r7)
            r2.setText(r6)
            if (r8 != 0) goto L71
            r3 = r18
            goto L78
        L71:
            if (r5 == 0) goto L76
            r3 = r16
            goto L78
        L76:
            java.lang.String r3 = r11.f12355
        L78:
            int r3 = android.graphics.Color.parseColor(r3)
            r2.setTextColor(r3)
            java.lang.String r2 = r4.f7448
            if (r8 != 0) goto L89
            java.lang.String r3 = "需要内测资格 · "
            java.lang.String r2 = r3.concat(r2)
        L89:
            r15.setText(r2)
            if (r8 != 0) goto L90
            r17 = r18
        L90:
            int r2 = android.graphics.Color.parseColor(r17)
            r15.setTextColor(r2)
            android.view.View r1 = r1.f9527
            r2 = 0
            r1.setBackgroundColor(r2)
            java.lang.String r1 = r11.f12348
            if (r8 != 0) goto La6
            java.lang.String r2 = r11.f12371
        La3:
            r3 = 8
            goto Lae
        La6:
            if (r5 == 0) goto Lab
            java.lang.String r2 = r11.f12361
            goto La3
        Lab:
            java.lang.String r2 = r11.f12352
            goto La3
        Lae:
            android.graphics.drawable.RippleDrawable r1 = p000.jx0.m3059(r3, r10, r1, r2)
            r12.setBackground(r1)
            if (r8 != 0) goto Lbb
            r1 = 1058306785(0x3f147ae1, float:0.58)
            goto Lbd
        Lbb:
            r1 = 1065353216(0x3f800000, float:1.0)
        Lbd:
            r12.setAlpha(r1)
            android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r2 = new int[]{r2}
            r3 = 0
            int[] r3 = new int[r3]
            int[][] r2 = new int[][]{r2, r3}
            int r3 = android.graphics.Color.parseColor(r16)
            int r7 = android.graphics.Color.parseColor(r18)
            int[] r3 = new int[]{r3, r7}
            r1.<init>(r2, r3)
            r13.setButtonTintList(r1)
            r1 = 0
            r13.setOnCheckedChangeListener(r1)
            r13.setChecked(r5)
            r13.setEnabled(r8)
            java.lang.String r1 = "选择"
            java.lang.String r1 = r1.concat(r6)
            r13.setContentDescription(r1)
            ov1 r1 = new ov1
            r2 = 0
            r1.<init>(r0, r4, r2)
            r13.setOnCheckedChangeListener(r1)
            r1 = 1
            r12.setClickable(r1)
            r12.setFocusable(r8)
            pv1 r1 = new pv1
            r1.<init>(r2, r0, r4, r9)
            r12.setOnClickListener(r1)
            return
    }

    /* JADX INFO: renamed from: β */
    public final p000.rv1 m5576(android.view.View r10) {
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L8
            java.lang.Object r10 = r10.getTag()
            goto L9
        L8:
            r10 = r0
        L9:
            boolean r1 = r10 instanceof p000.rv1
            if (r1 == 0) goto L10
            r0 = r10
            rv1 r0 = (p000.rv1) r0
        L10:
            if (r0 == 0) goto L13
            return r0
        L13:
            x01 r10 = p000.x01.f11964
            java.lang.String r0 = "item_share_panel_action_config"
            r1 = 2131492955(0x7f0c005b, float:1.8609377E38)
            android.content.Context r9 = r9.f10051
            android.view.View r3 = r10.m6476(r1, r9, r0)
            rv1 r2 = new rv1
            java.lang.String r9 = "share_action_item_category"
            r10 = 2131296945(0x7f0902b1, float:1.821182E38)
            java.lang.Class<android.widget.TextView> r0 = android.widget.TextView.class
            android.view.View r9 = p000.x01.m6472(r3, r9, r10, r0)
            r4 = r9
            android.widget.TextView r4 = (android.widget.TextView) r4
            r9 = 2131296948(0x7f0902b4, float:1.8211827E38)
            java.lang.Class<android.view.View> r10 = android.view.View.class
            java.lang.String r1 = "share_action_item_row"
            android.view.View r5 = p000.x01.m6472(r3, r1, r9, r10)
            r9 = 2131296946(0x7f0902b2, float:1.8211823E38)
            java.lang.Class<android.widget.CheckBox> r10 = android.widget.CheckBox.class
            java.lang.String r1 = "share_action_item_checkbox"
            android.view.View r9 = p000.x01.m6472(r3, r1, r9, r10)
            r6 = r9
            android.widget.CheckBox r6 = (android.widget.CheckBox) r6
            java.lang.String r9 = "share_action_item_title"
            r10 = 2131296950(0x7f0902b6, float:1.8211831E38)
            android.view.View r9 = p000.x01.m6472(r3, r9, r10, r0)
            r7 = r9
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.String r9 = "share_action_item_subtitle"
            r10 = 2131296949(0x7f0902b5, float:1.821183E38)
            android.view.View r9 = p000.x01.m6472(r3, r9, r10, r0)
            r8 = r9
            android.widget.TextView r8 = (android.widget.TextView) r8
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r3.setTag(r2)
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public final void m5577(java.lang.String r2, boolean r3) {
            r1 = this;
            java.util.LinkedHashSet r0 = r1.f10055
            if (r3 == 0) goto L9
            boolean r2 = r0.add(r2)
            goto Ld
        L9:
            boolean r2 = r0.remove(r2)
        Ld:
            if (r2 != 0) goto L10
            return
        L10:
            r1.notifyDataSetChanged()
            uu1 r1 = r1.f10054
            java.util.Set r2 = p000.AbstractC0984xh.m6671(r0)
            r1.invoke(r2)
            return
    }
}
