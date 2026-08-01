package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class d81 {

    /* JADX INFO: renamed from: α */
    public final android.app.Activity f2948;

    /* JADX INFO: renamed from: β */
    public final android.widget.LinearLayout f2949;

    /* JADX INFO: renamed from: γ */
    public final android.widget.ImageView f2950;

    /* JADX INFO: renamed from: δ */
    public final android.widget.ImageView f2951;

    /* JADX INFO: renamed from: ε */
    public final android.widget.TextView f2952;

    /* JADX INFO: renamed from: ζ */
    public final android.widget.ImageView f2953;

    /* JADX INFO: renamed from: η */
    public final p000.C1000xx f2954;

    /* JADX INFO: renamed from: θ */
    public final p000.w01 f2955;

    /* JADX INFO: renamed from: ι */
    public java.lang.Object f2956;

    /* JADX INFO: renamed from: κ */
    public java.util.List f2957;

    /* JADX INFO: renamed from: λ */
    public int f2958;

    /* JADX INFO: renamed from: μ */
    public boolean f2959;

    /* JADX INFO: renamed from: ν */
    public android.view.View f2960;

    /* JADX INFO: renamed from: ξ */
    public final android.view.GestureDetector f2961;

    public d81(android.app.Activity r3, android.widget.LinearLayout r4, android.widget.ImageView r5, android.widget.ImageView r6, android.widget.TextView r7, android.widget.ImageView r8, p000.C1000xx r9) {
            r2 = this;
            r3.getClass()
            r9.getClass()
            r2.<init>()
            r2.f2948 = r3
            r2.f2949 = r4
            r2.f2950 = r5
            r2.f2951 = r6
            r2.f2952 = r7
            r2.f2953 = r8
            r2.f2954 = r9
            x01 r4 = p000.x01.f11964
            w01 r3 = r4.m6474(r3)
            r2.f2955 = r3
            jz r3 = p000.C0450jz.f5672
            r2.f2956 = r3
            java.lang.String r3 = "operation_quick_actions"
            java.lang.String r4 = ""
            java.lang.String r3 = p000.ui1.m5893(r3, r4)
            boolean r5 = p000.q02.m4671(r3)
            r6 = 0
            if (r5 == 0) goto L39
            java.util.List r3 = p000.w71.f11592
            java.util.ArrayList r3 = p000.AbstractC0984xh.m6668(r3)
            goto L94
        L39:
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L64
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L64
            int r3 = r5.length()     // Catch: java.lang.Throwable -> L64
            r7 = 24
            if (r3 <= r7) goto L47
            r3 = r7
        L47:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L64
            r7.<init>(r3)     // Catch: java.lang.Throwable -> L64
            r8 = r6
        L4d:
            if (r8 >= r3) goto L6a
            java.lang.String r9 = r5.optString(r8, r4)     // Catch: java.lang.Throwable -> L64
            r9.getClass()     // Catch: java.lang.Throwable -> L64
            java.lang.CharSequence r9 = p000.q02.m4660(r9)     // Catch: java.lang.Throwable -> L64
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L64
            r7.add(r9)     // Catch: java.lang.Throwable -> L64
            int r8 = r8 + 1
            goto L4d
        L64:
            r3 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r3)
        L6a:
            boolean r3 = r7 instanceof p000.eo1
            if (r3 == 0) goto L6f
            r7 = 0
        L6f:
            r3 = r7
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L7b
            java.util.List r3 = p000.w71.f11592
            java.util.ArrayList r3 = p000.AbstractC0984xh.m6668(r3)
            goto L94
        L7b:
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L88
            java.util.List r3 = p000.w71.f11592
            java.util.ArrayList r3 = p000.AbstractC0984xh.m6668(r3)
            goto L94
        L88:
            int r5 = r3.size()
            int r5 = r5 % 4
            if (r5 == 0) goto L94
            r3.add(r4)
            goto L88
        L94:
            r2.f2957 = r3
            android.view.GestureDetector r3 = new android.view.GestureDetector
            android.app.Activity r4 = r2.f2948
            c81 r5 = new c81
            r5.<init>(r2)
            r3.<init>(r4, r5)
            r2.f2961 = r3
            android.widget.ImageView r3 = r2.f2950
            r4 = 2131230869(0x7f080095, float:1.8077803E38)
            r3.setImageResource(r4)
            xx r4 = r2.f2954
            java.lang.String r5 = r4.f12356
            java.lang.String r7 = r4.f12348
            int r8 = android.graphics.Color.parseColor(r5)
            android.content.res.ColorStateList r8 = android.content.res.ColorStateList.valueOf(r8)
            r3.setImageTintList(r8)
            java.lang.String r8 = "上一组快捷按钮"
            r3.setContentDescription(r8)
            android.app.Activity r8 = r2.f2948
            r9 = 8
            java.lang.String r0 = "#00000000"
            android.graphics.drawable.RippleDrawable r1 = p000.jx0.m3059(r9, r8, r7, r0)
            r3.setBackground(r1)
            x71 r1 = new x71
            r1.<init>(r2, r6)
            r3.setOnClickListener(r1)
            android.widget.ImageView r3 = r2.f2951
            r6 = 2131230870(0x7f080096, float:1.8077805E38)
            r3.setImageResource(r6)
            int r6 = android.graphics.Color.parseColor(r5)
            android.content.res.ColorStateList r6 = android.content.res.ColorStateList.valueOf(r6)
            r3.setImageTintList(r6)
            java.lang.String r6 = "下一组快捷按钮"
            r3.setContentDescription(r6)
            android.graphics.drawable.RippleDrawable r6 = p000.jx0.m3059(r9, r8, r7, r0)
            r3.setBackground(r6)
            x71 r6 = new x71
            r1 = 1
            r6.<init>(r2, r1)
            r3.setOnClickListener(r6)
            android.widget.ImageView r3 = r2.f2953
            r6 = 2131230874(0x7f08009a, float:1.8077813E38)
            r3.setImageResource(r6)
            int r5 = android.graphics.Color.parseColor(r5)
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
            r3.setImageTintList(r5)
            java.lang.String r5 = "自定义快捷按钮"
            r3.setContentDescription(r5)
            android.graphics.drawable.RippleDrawable r5 = p000.jx0.m3059(r9, r8, r7, r0)
            r3.setBackground(r5)
            x71 r5 = new x71
            r6 = 2
            r5.<init>(r2, r6)
            r3.setOnClickListener(r5)
            android.widget.TextView r3 = r2.f2952
            java.lang.String r4 = r4.f12357
            int r4 = android.graphics.Color.parseColor(r4)
            r3.setTextColor(r4)
            r2.m1673()
            return
    }

    /* JADX INFO: renamed from: α */
    public final boolean m1671(int r7) {
            r6 = this;
            int r0 = r6.m1672()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            if (r7 < 0) goto L5e
            if (r7 > r0) goto L5e
            int r0 = r6.f2958
            if (r7 == r0) goto L5e
            boolean r3 = r6.f2959
            if (r3 == 0) goto L14
            goto L5e
        L14:
            if (r7 <= r0) goto L17
            r2 = r1
        L17:
            android.widget.LinearLayout r0 = r6.f2949
            int r3 = r0.getWidth()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            if (r3 <= 0) goto L24
            goto L25
        L24:
            r4 = 0
        L25:
            if (r4 == 0) goto L2c
            int r3 = r4.intValue()
            goto L34
        L2c:
            r3 = 240(0xf0, float:3.36E-43)
            android.app.Activity r4 = r6.f2948
            int r3 = p000.jx0.m3056(r4, r3)
        L34:
            float r3 = (float) r3
            r4 = 1049582633(0x3e8f5c29, float:0.28)
            float r3 = r3 * r4
            if (r2 == 0) goto L3c
            float r3 = -r3
        L3c:
            r6.f2959 = r1
            android.view.ViewPropertyAnimator r0 = r0.animate()
            android.view.ViewPropertyAnimator r0 = r0.translationX(r3)
            r2 = 0
            android.view.ViewPropertyAnimator r0 = r0.alpha(r2)
            r4 = 110(0x6e, double:5.43E-322)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r4)
            y71 r2 = new y71
            r2.<init>(r6, r7, r3)
            android.view.ViewPropertyAnimator r6 = r0.withEndAction(r2)
            r6.start()
            return r1
        L5e:
            return r2
    }

    /* JADX INFO: renamed from: β */
    public final int m1672() {
            r1 = this;
            java.util.List r1 = r1.f2957
            int r1 = r1.size()
            int r1 = r1 / 4
            r0 = 1
            if (r1 >= r0) goto Lc
            return r0
        Lc:
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public final void m1673() {
            r20 = this;
            r2 = r20
            int r0 = r2.m1672()
            r6 = 1
            int r7 = r0 + (-1)
            int r0 = r2.f2958
            r8 = 0
            int r0 = p000.j81.m2906(r0, r8, r7)
            r2.f2958 = r0
            r9 = 4
            int r10 = r0 * 4
            android.widget.LinearLayout r11 = r2.f2949
            r11.removeAllViews()
            r12 = r8
        L1b:
            if (r12 >= r9) goto L1ef
            int r3 = r10 + r12
            java.util.List r1 = r2.f2957
            java.lang.Object r1 = p000.AbstractC0984xh.m6641(r3, r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L2b
            java.lang.String r1 = ""
        L2b:
            java.lang.Object r4 = r2.f2956
            java.util.Iterator r4 = r4.iterator()
        L31:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L47
            java.lang.Object r5 = r4.next()
            r14 = r5
            s71 r14 = (p000.s71) r14
            java.lang.String r14 = r14.f9753
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L31
            goto L48
        L47:
            r5 = 0
        L48:
            r4 = r5
            s71 r4 = (p000.s71) r4
            r5 = r1
            boolean r1 = p000.q02.m4671(r5)
            if (r1 != 0) goto L56
            if (r4 != 0) goto L56
            r14 = r6
            goto L57
        L56:
            r14 = r8
        L57:
            if (r1 == 0) goto L5c
            java.lang.String r5 = "添加"
            goto L65
        L5c:
            if (r4 == 0) goto L61
            java.lang.String r5 = r4.f9754
            goto L65
        L61:
            java.lang.String r5 = p000.w71.m6326(r5)
        L65:
            if (r1 == 0) goto L6b
            r15 = 2131230864(0x7f080090, float:1.8077793E38)
            goto L73
        L6b:
            if (r4 == 0) goto L70
            int r15 = r4.f9755
            goto L73
        L70:
            r15 = 2131230884(0x7f0800a4, float:1.8077833E38)
        L73:
            xx r9 = r2.f2954
            if (r1 != 0) goto L89
            if (r14 != 0) goto L89
            if (r4 == 0) goto L80
            boolean r13 = r4.f9758
            if (r13 != r6) goto L80
            goto L89
        L80:
            if (r4 == 0) goto L86
            java.lang.String r13 = r4.f9756
            if (r13 != 0) goto L8b
        L86:
            java.lang.String r13 = r9.f12371
            goto L8b
        L89:
            java.lang.String r13 = r9.f12371
        L8b:
            if (r1 == 0) goto L90
            java.lang.String r0 = r9.f12358
            goto La4
        L90:
            if (r14 != 0) goto La2
            if (r4 == 0) goto L99
            boolean r0 = r4.f9758
            if (r0 != r6) goto L99
            goto La2
        L99:
            if (r4 == 0) goto L9f
            java.lang.String r0 = r4.f9757
            if (r0 != 0) goto La4
        L9f:
            java.lang.String r0 = r9.f12370
            goto La4
        La2:
            java.lang.String r0 = r9.f12370
        La4:
            android.widget.LinearLayout r8 = new android.widget.LinearLayout
            r17 = r0
            w01 r0 = r2.f2955
            r8.<init>(r0)
            r8.setOrientation(r6)
            r6 = 17
            r8.setGravity(r6)
            r6 = 68
            r18 = r3
            android.app.Activity r3 = r2.f2948
            int r6 = p000.jx0.m3056(r3, r6)
            r8.setMinimumHeight(r6)
            java.lang.String r6 = r9.f12348
            java.lang.String r2 = "#00000000"
            r19 = r10
            r10 = 8
            android.graphics.drawable.RippleDrawable r2 = p000.jx0.m3059(r10, r3, r6, r2)
            r8.setBackground(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r6 = 72
            int r6 = p000.jx0.m3056(r3, r6)
            r16 = r12
            r10 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            r2.<init>(r12, r6, r10)
            r6 = 1
            int r10 = p000.jx0.m3056(r3, r6)
            r2.setMarginStart(r10)
            int r10 = p000.jx0.m3056(r3, r6)
            r2.setMarginEnd(r10)
            r8.setLayoutParams(r2)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r0)
            r6 = 8
            android.graphics.drawable.GradientDrawable r6 = p000.jx0.m3062(r6, r3, r13)
            r2.setBackground(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r10 = 38
            int r12 = p000.jx0.m3056(r3, r10)
            int r10 = p000.jx0.m3056(r3, r10)
            r6.<init>(r12, r10)
            r10 = 1
            r6.gravity = r10
            r2.setLayoutParams(r6)
            android.widget.ImageView r6 = new android.widget.ImageView
            r6.<init>(r0)
            r6.setImageResource(r15)
            int r10 = android.graphics.Color.parseColor(r17)
            android.content.res.ColorStateList r10 = android.content.res.ColorStateList.valueOf(r10)
            r6.setImageTintList(r10)
            r10 = 9
            int r12 = p000.jx0.m3056(r3, r10)
            int r13 = p000.jx0.m3056(r3, r10)
            int r15 = p000.jx0.m3056(r3, r10)
            int r10 = p000.jx0.m3056(r3, r10)
            r6.setPadding(r12, r13, r15, r10)
            r10 = 2
            r6.setImportantForAccessibility(r10)
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r13 = -1
            r12.<init>(r13, r13)
            r6.setLayoutParams(r12)
            r2.addView(r6)
            r8.addView(r2)
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r0)
            r2.setText(r5)
            r0 = 1094713344(0x41400000, float:12.0)
            r2.setTextSize(r0)
            r0 = 17
            r2.setGravity(r0)
            r6 = 1
            r2.setMaxLines(r6)
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r2.setEllipsize(r0)
            if (r14 != 0) goto L179
            if (r4 == 0) goto L175
            boolean r0 = r4.f9758
            if (r0 != r6) goto L175
            goto L179
        L175:
            java.lang.String r0 = r9.f12355
        L177:
            r6 = 0
            goto L17c
        L179:
            java.lang.String r0 = r9.f12357
            goto L177
        L17c:
            p000.lz1.m3699(r0, r2, r6, r1)
            int r0 = p000.jx0.m3056(r3, r10)
            r6 = 5
            int r6 = p000.jx0.m3056(r3, r6)
            int r3 = p000.jx0.m3056(r3, r10)
            r12 = 0
            r2.setPadding(r0, r6, r3, r12)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r3 = -2
            r0.<init>(r13, r3)
            r2.setLayoutParams(r0)
            r8.addView(r2)
            if (r1 == 0) goto L1ab
            int r3 = r18 % 4
            r6 = 1
            int r3 = r3 + r6
            java.lang.String r0 = "添加第 "
            java.lang.String r2 = " 个快捷按钮"
            java.lang.String r0 = p000.AbstractC0602nx.m4127(r0, r3, r2)
            goto L1c3
        L1ab:
            r6 = 1
            if (r14 == 0) goto L1b5
            java.lang.String r0 = "，当前场景不可用"
            java.lang.String r0 = r5.concat(r0)
            goto L1c3
        L1b5:
            if (r4 == 0) goto L1c2
            boolean r0 = r4.f9758
            if (r0 != r6) goto L1c2
            java.lang.String r0 = "，内测功能"
            java.lang.String r0 = r5.concat(r0)
            goto L1c3
        L1c2:
            r0 = r5
        L1c3:
            r8.setContentDescription(r0)
            a81 r0 = new a81
            r2 = r20
            r3 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r8.setOnClickListener(r0)
            b81 r0 = new b81
            r0.<init>(r2, r3)
            r8.setOnLongClickListener(r0)
            js r0 = new js
            r6 = 1
            r0.<init>(r6, r2)
            r8.setOnTouchListener(r0)
            r11.addView(r8)
            int r0 = r16 + 1
            r8 = r12
            r10 = r19
            r9 = 4
            r12 = r0
            goto L1b
        L1ef:
            r12 = r8
            r10 = 1065353216(0x3f800000, float:1.0)
            int r0 = r2.f2958
            int r0 = r0 + r6
            int r1 = r2.m1672()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = " / "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            android.widget.TextView r1 = r2.f2952
            r1.setText(r0)
            int r0 = r2.f2958
            if (r0 <= 0) goto L218
            r0 = r6
            goto L219
        L218:
            r0 = r12
        L219:
            android.widget.ImageView r1 = r2.f2950
            r1.setEnabled(r0)
            r3 = 1049582633(0x3e8f5c29, float:0.28)
            if (r0 == 0) goto L225
            r0 = r10
            goto L226
        L225:
            r0 = r3
        L226:
            r1.setAlpha(r0)
            int r0 = r2.f2958
            if (r0 >= r7) goto L22e
            goto L22f
        L22e:
            r6 = r12
        L22f:
            android.widget.ImageView r0 = r2.f2951
            r0.setEnabled(r6)
            if (r6 == 0) goto L237
            r3 = r10
        L237:
            r0.setAlpha(r3)
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m1674(int r6) {
            r5 = this;
            int r0 = r6 % 4
            int r0 = r0 + 1
            java.util.List r1 = r5.f2957
            java.lang.Object r1 = p000.AbstractC0984xh.m6641(r6, r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L10
            java.lang.String r1 = ""
        L10:
            java.lang.Object r2 = r5.f2956
            uv r3 = new uv
            r4 = 1
            r3.<init>(r6, r4, r5)
            android.app.Activity r5 = r5.f2948
            p000.v71.m6046(r5, r0, r1, r2, r3)
            return
    }
}
