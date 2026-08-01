package p000;

/* JADX INFO: renamed from: uk */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0875uk {

    /* JADX INFO: renamed from: Α */
    public p000.C0068b8 f10862;

    /* JADX INFO: renamed from: α */
    public final android.app.Activity f10863;

    /* JADX INFO: renamed from: β */
    public final p000.C1000xx f10864;

    /* JADX INFO: renamed from: γ */
    public p000.EnumC0589nk f10865;

    /* JADX INFO: renamed from: δ */
    public p000.C0552mk f10866;

    /* JADX INFO: renamed from: ε */
    public boolean f10867;

    /* JADX INFO: renamed from: ζ */
    public boolean f10868;

    /* JADX INFO: renamed from: η */
    public android.app.AlertDialog f10869;

    /* JADX INFO: renamed from: θ */
    public android.widget.TextView f10870;

    /* JADX INFO: renamed from: ι */
    public android.widget.TextView f10871;

    /* JADX INFO: renamed from: κ */
    public android.widget.TextView f10872;

    /* JADX INFO: renamed from: λ */
    public android.widget.LinearLayout f10873;

    /* JADX INFO: renamed from: μ */
    public android.widget.LinearLayout f10874;

    /* JADX INFO: renamed from: ν */
    public android.widget.LinearLayout f10875;

    /* JADX INFO: renamed from: ξ */
    public android.widget.LinearLayout f10876;

    /* JADX INFO: renamed from: ο */
    public android.widget.LinearLayout f10877;

    /* JADX INFO: renamed from: π */
    public android.widget.TextView f10878;

    /* JADX INFO: renamed from: ρ */
    public android.widget.SeekBar f10879;

    /* JADX INFO: renamed from: σ */
    public android.widget.LinearLayout f10880;

    /* JADX INFO: renamed from: τ */
    public android.widget.Switch f10881;

    /* JADX INFO: renamed from: υ */
    public android.view.View f10882;

    /* JADX INFO: renamed from: φ */
    public android.widget.TextView f10883;

    /* JADX INFO: renamed from: χ */
    public android.widget.LinearLayout f10884;

    /* JADX INFO: renamed from: ψ */
    public android.widget.Switch f10885;

    /* JADX INFO: renamed from: ω */
    public android.widget.Switch f10886;

    public C0875uk(android.app.Activity r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f10863 = r1
            xx r1 = p000.jx0.m3049(r1)
            r0.f10864 = r1
            nk r1 = p000.EnumC0589nk.f7658
            r0.f10865 = r1
            java.util.List r1 = p000.AbstractC0515lk.f6694
            java.lang.Object r1 = p000.AbstractC0984xh.m6638(r1)
            mk r1 = (p000.C0552mk) r1
            r0.f10866 = r1
            return
    }

    /* JADX INFO: renamed from: δ */
    public static int m5913(p000.C0552mk r2) {
            java.lang.Object r0 = p000.ui1.f10844     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r2.f7186     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = p000.ui1.m5889(r2)     // Catch: java.lang.Throwable -> L11
            int r2 = android.graphics.Color.parseColor(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L11
            goto L18
        L11:
            r2 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r2)
            r2 = r0
        L18:
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r1 = r2 instanceof p000.eo1
            if (r1 == 0) goto L22
            r2 = r0
        L22:
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            return r2
    }

    /* JADX INFO: renamed from: ε */
    public static java.util.ArrayList m5914() {
            java.util.List r0 = p000.AbstractC0515lk.f6694
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r0.next()
            r3 = r2
            mk r3 = (p000.C0552mk) r3
            boolean r4 = r3.f7188
            if (r4 == 0) goto Lb
            java.lang.Object r4 = p000.ui1.f10844
            java.lang.String r3 = r3.f7186
            boolean r3 = p000.ui1.m5902(r3)
            if (r3 != 0) goto Lb
            r1.add(r2)
            goto Lb
        L2a:
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public static boolean m5915() {
            java.lang.String r0 = "comment_content_color_skip_mention"
            r1 = 0
            boolean r0 = p000.ui1.m5887(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: α */
    public final void m5916(android.widget.TextView r3, boolean r4) {
            r2 = this;
            xx r0 = r2.f10864
            if (r4 == 0) goto L7
            java.lang.String r1 = r0.f12358
            goto L9
        L7:
            java.lang.String r1 = r0.f12356
        L9:
            int r1 = android.graphics.Color.parseColor(r1)
            r3.setTextColor(r1)
            if (r4 == 0) goto L15
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT_BOLD
            goto L17
        L15:
            android.graphics.Typeface r1 = android.graphics.Typeface.DEFAULT
        L17:
            r3.setTypeface(r1)
            if (r4 == 0) goto L1f
            java.lang.String r4 = r0.f12352
            goto L24
        L1f:
            r4 = 0
            java.lang.String r4 = p000.h62.m2388(r4)
        L24:
            r0 = 4
            android.app.Activity r2 = r2.f10863
            android.graphics.drawable.GradientDrawable r2 = p000.jx0.m3062(r0, r2, r4)
            r3.setBackground(r2)
            return
    }

    /* JADX INFO: renamed from: β */
    public final android.widget.TextView m5917(java.lang.String r4, p000.p70 r5) {
            r3 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.app.Activity r3 = r3.f10863
            r0.<init>(r3)
            r0.setText(r4)
            r3 = 1095761920(0x41500000, float:13.0)
            r0.setTextSize(r3)
            r3 = 17
            r0.setGravity(r3)
            r3 = 1
            r0.setMaxLines(r3)
            r0.setContentDescription(r4)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r4 = -1
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r3.<init>(r2, r4, r1)
            r0.setLayoutParams(r3)
            b9 r3 = new b9
            r4 = 4
            r3.<init>(r4, r5)
            r0.setOnClickListener(r3)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final android.widget.TextView m5918() {
            r4 = this;
            android.widget.TextView r0 = new android.widget.TextView
            android.app.Activity r1 = r4.f10863
            r0.<init>(r1)
            r2 = 17
            r0.setGravity(r2)
            r2 = 1095761920(0x41500000, float:13.0)
            r0.setTextSize(r2)
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT_BOLD
            r0.setTypeface(r2)
            xx r4 = r4.f10864
            java.lang.String r2 = r4.f12358
            int r2 = android.graphics.Color.parseColor(r2)
            r0.setTextColor(r2)
            java.lang.String r2 = r4.f12348
            java.lang.String r4 = r4.f12359
            r3 = 6
            android.graphics.drawable.RippleDrawable r4 = p000.jx0.m3059(r3, r1, r2, r4)
            r0.setBackground(r4)
            return r0
    }

    /* JADX INFO: renamed from: η */
    public final void m5919() {
            r14 = this;
            android.widget.LinearLayout r0 = r14.f10875
            r1 = 0
            java.lang.String r2 = "hiddenList"
            if (r0 == 0) goto L121
            r0.removeAllViews()
            java.util.ArrayList r0 = m5914()
            boolean r3 = r0.isEmpty()
            xx r4 = r14.f10864
            r5 = 0
            android.app.Activity r6 = r14.f10863
            if (r3 == 0) goto L4f
            android.widget.LinearLayout r14 = r14.f10875
            if (r14 == 0) goto L4b
            android.widget.TextView r0 = new android.widget.TextView
            r0.<init>(r6)
            java.lang.String r1 = "当前没有隐藏控件"
            r0.setText(r1)
            r1 = 1095761920(0x41500000, float:13.0)
            r0.setTextSize(r1)
            r1 = 17
            r0.setGravity(r1)
            java.lang.String r1 = r4.f12357
            int r1 = android.graphics.Color.parseColor(r1)
            r0.setTextColor(r1)
            r1 = 20
            int r2 = p000.jx0.m3056(r6, r1)
            int r1 = p000.jx0.m3056(r6, r1)
            r0.setPadding(r5, r2, r5, r1)
            r14.addView(r0)
            return
        L4b:
            p000.ln0.m3650(r2)
            throw r1
        L4f:
            java.util.Iterator r0 = r0.iterator()
            r3 = r5
        L54:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L120
            java.lang.Object r7 = r0.next()
            int r8 = r3 + 1
            if (r3 < 0) goto L11c
            mk r7 = (p000.C0552mk) r7
            if (r3 <= 0) goto L8e
            android.widget.LinearLayout r3 = r14.f10875
            if (r3 == 0) goto L8a
            android.view.View r9 = new android.view.View
            r9.<init>(r6)
            java.lang.String r10 = r4.f12353
            int r10 = android.graphics.Color.parseColor(r10)
            r9.setBackgroundColor(r10)
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r11 = -1
            r12 = 1
            int r12 = p000.jx0.m3056(r6, r12)
            r10.<init>(r11, r12)
            r9.setLayoutParams(r10)
            r3.addView(r9)
            goto L8e
        L8a:
            p000.ln0.m3650(r2)
            throw r1
        L8e:
            android.widget.LinearLayout r3 = r14.f10875
            if (r3 == 0) goto L118
            android.widget.LinearLayout r9 = new android.widget.LinearLayout
            r9.<init>(r6)
            r9.setOrientation(r5)
            r10 = 16
            r9.setGravity(r10)
            r10 = 4
            int r11 = p000.jx0.m3056(r6, r10)
            r12 = 10
            int r13 = p000.jx0.m3056(r6, r12)
            int r10 = p000.jx0.m3056(r6, r10)
            int r12 = p000.jx0.m3056(r6, r12)
            r9.setPadding(r11, r13, r10, r12)
            android.widget.TextView r10 = new android.widget.TextView
            r10.<init>(r6)
            java.lang.String r11 = r7.f7187
            r10.setText(r11)
            r11 = 1096810496(0x41600000, float:14.0)
            r10.setTextSize(r11)
            java.lang.String r11 = r4.f12355
            int r11 = android.graphics.Color.parseColor(r11)
            r10.setTextColor(r11)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = -2
            r11.<init>(r5, r13, r12)
            r10.setLayoutParams(r11)
            rk r11 = new rk
            r11.<init>(r14, r7)
            r10.setOnClickListener(r11)
            r9.addView(r10)
            android.widget.TextView r10 = r14.m5918()
            java.lang.String r11 = "恢复显示"
            r10.setText(r11)
            android.widget.LinearLayout$LayoutParams r11 = new android.widget.LinearLayout$LayoutParams
            r12 = 34
            int r12 = p000.jx0.m3056(r6, r12)
            r11.<init>(r13, r12)
            r10.setLayoutParams(r11)
            r11 = 12
            int r12 = p000.jx0.m3056(r6, r11)
            int r11 = p000.jx0.m3056(r6, r11)
            r10.setPadding(r12, r5, r11, r5)
            rk r11 = new rk
            r11.<init>(r7, r14)
            r10.setOnClickListener(r11)
            r9.addView(r10)
            r3.addView(r9)
            r3 = r8
            goto L54
        L118:
            p000.ln0.m3650(r2)
            throw r1
        L11c:
            p000.AbstractC1021yh.m6917()
            throw r1
        L120:
            return
        L121:
            p000.ln0.m3650(r2)
            throw r1
    }

    /* JADX INFO: renamed from: θ */
    public final void m5920() {
            r3 = this;
            r0 = 1
            r3.f10868 = r0
            android.widget.Switch r0 = r3.f10886
            r1 = 0
            if (r0 == 0) goto L33
            boolean r2 = p000.ui1.m5901()
            r0.setChecked(r2)
            r0 = 0
            r3.f10868 = r0
            r3.m5921()
            r3.m5922()
            r3.m5919()
            b8 r0 = r3.f10862
            if (r0 == 0) goto L2d
            mk r3 = r3.f10866
            boolean r1 = p000.ui1.m5901()
            boolean r2 = m5915()
            r0.m818(r3, r1, r2)
            return
        L2d:
            java.lang.String r3 = "preview"
            p000.ln0.m3650(r3)
            throw r1
        L33:
            java.lang.String r3 = "masterSwitch"
            p000.ln0.m3650(r3)
            throw r1
    }

    /* JADX INFO: renamed from: ι */
    public final void m5921() {
            r10 = this;
            android.widget.TextView r0 = r10.f10870
            r1 = 0
            if (r0 == 0) goto L1d0
            mk r2 = r10.f10866
            java.lang.String r2 = r2.f7187
            java.lang.String r3 = "评论区控件管理 · "
            java.lang.String r2 = r3.concat(r2)
            r0.setText(r2)
            r0 = 1
            r10.f10867 = r0
            mk r2 = r10.f10866
            java.lang.Object r3 = p000.ui1.f10844
            java.lang.String r2 = r2.f7186
            float r2 = p000.ui1.m5888(r2)
            r3 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 * r3
            int r2 = p000.jx0.m3061(r2)
            r3 = 0
            r4 = 100
            int r2 = p000.j81.m2906(r2, r3, r4)
            android.widget.LinearLayout r5 = r10.f10877
            java.lang.String r6 = "alphaSection"
            if (r5 == 0) goto L1cc
            r5.setVisibility(r3)
            android.widget.LinearLayout r5 = r10.f10877
            if (r5 == 0) goto L1c8
            mk r6 = r10.f10866
            boolean r6 = r6.f7189
            r7 = 1055622431(0x3eeb851f, float:0.46)
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L47
            r6 = r8
            goto L48
        L47:
            r6 = r7
        L48:
            r5.setAlpha(r6)
            android.widget.SeekBar r5 = r10.f10879
            java.lang.String r6 = "alphaSeekBar"
            if (r5 == 0) goto L1c4
            mk r9 = r10.f10866
            boolean r9 = r9.f7189
            r5.setEnabled(r9)
            android.widget.SeekBar r5 = r10.f10879
            if (r5 == 0) goto L1c0
            mk r6 = r10.f10866
            boolean r6 = r6.f7189
            if (r6 == 0) goto L63
            r4 = r2
        L63:
            r5.setProgress(r4)
            android.widget.TextView r4 = r10.f10878
            if (r4 == 0) goto L1ba
            mk r5 = r10.f10866
            boolean r5 = r5.f7189
            if (r5 == 0) goto L77
            java.lang.String r5 = "%"
            java.lang.String r2 = p000.lz1.m3686(r5, r2)
            goto L79
        L77:
            java.lang.String r2 = "不支持"
        L79:
            r4.setText(r2)
            android.widget.LinearLayout r2 = r10.f10880
            java.lang.String r4 = "colorSection"
            if (r2 == 0) goto L1b6
            r2.setVisibility(r3)
            android.widget.LinearLayout r2 = r10.f10880
            if (r2 == 0) goto L1b2
            mk r4 = r10.f10866
            boolean r4 = r4.f7190
            if (r4 == 0) goto L91
            r4 = r8
            goto L92
        L91:
            r4 = r7
        L92:
            r2.setAlpha(r4)
            android.view.View r2 = r10.f10882
            java.lang.String r4 = "colorSwatch"
            if (r2 == 0) goto L1ae
            mk r5 = r10.f10866
            boolean r5 = r5.f7190
            r2.setEnabled(r5)
            android.widget.Switch r2 = r10.f10881
            java.lang.String r5 = "colorSwitch"
            if (r2 == 0) goto L1aa
            mk r6 = r10.f10866
            boolean r6 = r6.f7190
            r2.setEnabled(r6)
            android.widget.Switch r2 = r10.f10881
            if (r2 == 0) goto L1a6
            mk r5 = r10.f10866
            boolean r6 = r5.f7190
            if (r6 == 0) goto Lc3
            java.lang.String r5 = r5.f7186
            boolean r5 = p000.ui1.m5900(r5)
            if (r5 == 0) goto Lc3
            r5 = r0
            goto Lc4
        Lc3:
            r5 = r3
        Lc4:
            r2.setChecked(r5)
            mk r2 = r10.f10866
            int r2 = m5913(r2)
            android.view.View r5 = r10.f10882
            if (r5 == 0) goto L1a2
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            r4.setShape(r0)
            r4.setColor(r2)
            android.app.Activity r2 = r10.f10863
            int r2 = p000.jx0.m3056(r2, r0)
            xx r6 = r10.f10864
            java.lang.String r6 = r6.f12353
            int r6 = android.graphics.Color.parseColor(r6)
            r4.setStroke(r2, r6)
            r5.setBackground(r4)
            mk r2 = r10.f10866
            java.lang.String r2 = r2.f7186
            java.lang.String r4 = "content"
            boolean r2 = r2.equals(r4)
            android.widget.LinearLayout r4 = r10.f10884
            java.lang.String r5 = "mentionSection"
            if (r4 == 0) goto L19e
            r4.setVisibility(r3)
            android.widget.LinearLayout r4 = r10.f10884
            if (r4 == 0) goto L19a
            if (r2 == 0) goto L10b
            r5 = r8
            goto L10c
        L10b:
            r5 = r7
        L10c:
            r4.setAlpha(r5)
            android.widget.Switch r4 = r10.f10885
            java.lang.String r5 = "mentionSwitch"
            if (r4 == 0) goto L196
            r4.setEnabled(r2)
            android.widget.Switch r4 = r10.f10885
            if (r4 == 0) goto L192
            if (r2 == 0) goto L125
            boolean r2 = m5915()
            if (r2 == 0) goto L125
            goto L126
        L125:
            r0 = r3
        L126:
            r4.setChecked(r0)
            android.widget.TextView r0 = r10.f10883
            java.lang.String r2 = "visibilityButton"
            if (r0 == 0) goto L18e
            r0.setVisibility(r3)
            android.widget.TextView r0 = r10.f10883
            if (r0 == 0) goto L18a
            mk r4 = r10.f10866
            boolean r4 = r4.f7188
            r0.setEnabled(r4)
            android.widget.TextView r0 = r10.f10883
            if (r0 == 0) goto L186
            mk r4 = r10.f10866
            boolean r4 = r4.f7188
            if (r4 == 0) goto L148
            r7 = r8
        L148:
            r0.setAlpha(r7)
            mk r0 = r10.f10866
            boolean r4 = r0.f7188
            android.widget.TextView r5 = r10.f10883
            if (r4 == 0) goto L178
            if (r5 == 0) goto L174
            java.lang.String r0 = r0.f7186
            boolean r0 = p000.ui1.m5902(r0)
            mk r1 = r10.f10866
            if (r0 == 0) goto L168
            java.lang.String r0 = r1.f7187
            java.lang.String r1 = "隐藏"
            java.lang.String r0 = r1.concat(r0)
            goto L170
        L168:
            java.lang.String r0 = r1.f7187
            java.lang.String r1 = "恢复显示"
            java.lang.String r0 = r1.concat(r0)
        L170:
            r5.setText(r0)
            goto L17f
        L174:
            p000.ln0.m3650(r2)
            throw r1
        L178:
            if (r5 == 0) goto L182
            java.lang.String r0 = "当前控件不支持隐藏"
            r5.setText(r0)
        L17f:
            r10.f10867 = r3
            return
        L182:
            p000.ln0.m3650(r2)
            throw r1
        L186:
            p000.ln0.m3650(r2)
            throw r1
        L18a:
            p000.ln0.m3650(r2)
            throw r1
        L18e:
            p000.ln0.m3650(r2)
            throw r1
        L192:
            p000.ln0.m3650(r5)
            throw r1
        L196:
            p000.ln0.m3650(r5)
            throw r1
        L19a:
            p000.ln0.m3650(r5)
            throw r1
        L19e:
            p000.ln0.m3650(r5)
            throw r1
        L1a2:
            p000.ln0.m3650(r4)
            throw r1
        L1a6:
            p000.ln0.m3650(r5)
            throw r1
        L1aa:
            p000.ln0.m3650(r5)
            throw r1
        L1ae:
            p000.ln0.m3650(r4)
            throw r1
        L1b2:
            p000.ln0.m3650(r4)
            throw r1
        L1b6:
            p000.ln0.m3650(r4)
            throw r1
        L1ba:
            java.lang.String r10 = "alphaValue"
            p000.ln0.m3650(r10)
            throw r1
        L1c0:
            p000.ln0.m3650(r6)
            throw r1
        L1c4:
            p000.ln0.m3650(r6)
            throw r1
        L1c8:
            p000.ln0.m3650(r6)
            throw r1
        L1cc:
            p000.ln0.m3650(r6)
            throw r1
        L1d0:
            java.lang.String r10 = "titleView"
            p000.ln0.m3650(r10)
            throw r1
    }

    /* JADX INFO: renamed from: κ */
    public final void m5922() {
            r7 = this;
            android.widget.TextView r0 = r7.f10872
            r1 = 0
            java.lang.String r2 = "hiddenTab"
            if (r0 == 0) goto L50
            java.util.ArrayList r3 = m5914()
            int r3 = r3.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "已隐藏 ("
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = ")"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.setText(r3)
            android.widget.TextView r0 = r7.f10871
            if (r0 == 0) goto L4a
            nk r3 = r7.f10865
            nk r4 = p000.EnumC0589nk.f7658
            r5 = 0
            r6 = 1
            if (r3 != r4) goto L33
            r3 = r6
            goto L34
        L33:
            r3 = r5
        L34:
            r7.m5916(r0, r3)
            android.widget.TextView r0 = r7.f10872
            if (r0 == 0) goto L46
            nk r1 = r7.f10865
            nk r2 = p000.EnumC0589nk.f7659
            if (r1 != r2) goto L42
            r5 = r6
        L42:
            r7.m5916(r0, r5)
            return
        L46:
            p000.ln0.m3650(r2)
            throw r1
        L4a:
            java.lang.String r7 = "previewTab"
            p000.ln0.m3650(r7)
            throw r1
        L50:
            p000.ln0.m3650(r2)
            throw r1
    }

    /* JADX INFO: renamed from: λ */
    public final void m5923(p000.C0552mk r3) {
            r2 = this;
            r2.f10866 = r3
            r2.m5921()
            b8 r3 = r2.f10862
            if (r3 == 0) goto L17
            mk r2 = r2.f10866
            boolean r0 = p000.ui1.m5901()
            boolean r1 = m5915()
            r3.m818(r2, r0, r1)
            return
        L17:
            java.lang.String r2 = "preview"
            p000.ln0.m3650(r2)
            r2 = 0
            throw r2
    }

    /* JADX INFO: renamed from: μ */
    public final void m5924() {
            r26 = this;
            r2 = r26
            android.widget.ScrollView r8 = new android.widget.ScrollView
            android.app.Activity r9 = r2.f10863
            r8.<init>(r9)
            r10 = 1
            r8.setFillViewport(r10)
            r11 = 2
            r8.setOverScrollMode(r11)
            r12 = 0
            r8.setVerticalScrollBarEnabled(r12)
            android.widget.LinearLayout r13 = new android.widget.LinearLayout
            r13.<init>(r9)
            r13.setOrientation(r10)
            r14 = 16
            int r0 = p000.jx0.m3056(r9, r14)
            r15 = 12
            int r1 = p000.jx0.m3056(r9, r15)
            int r3 = p000.jx0.m3056(r9, r14)
            int r4 = p000.jx0.m3056(r9, r14)
            r13.setPadding(r0, r1, r3, r4)
            xx r0 = r2.f10864
            java.lang.String r1 = r0.f12352
            r3 = 8
            android.graphics.drawable.GradientDrawable r1 = p000.jx0.m3062(r3, r9, r1)
            r13.setBackground(r1)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r9)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = 42
            int r6 = p000.jx0.m3056(r9, r5)
            r7 = -1
            r4.<init>(r7, r6)
            r1.setLayoutParams(r4)
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r9)
            r4.setGravity(r14)
            r4.setMaxLines(r11)
            r6 = 1099431936(0x41880000, float:17.0)
            r4.setTextSize(r6)
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT_BOLD
            r4.setTypeface(r6)
            java.lang.String r3 = r0.f12355
            int r10 = android.graphics.Color.parseColor(r3)
            r4.setTextColor(r10)
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r10.<init>(r7, r7)
            int r15 = p000.jx0.m3056(r9, r5)
            r10.setMarginEnd(r15)
            r4.setLayoutParams(r10)
            r2.f10870 = r4
            r1.addView(r4)
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r9)
            java.lang.String r10 = "×"
            r4.setText(r10)
            r10 = 1102053376(0x41b00000, float:22.0)
            r4.setTextSize(r10)
            r10 = 17
            r4.setGravity(r10)
            java.lang.String r15 = "关闭"
            r4.setContentDescription(r15)
            java.lang.String r15 = r0.f12356
            int r7 = android.graphics.Color.parseColor(r15)
            r4.setTextColor(r7)
            java.lang.String r7 = r0.f12348
            java.lang.String r5 = p000.h62.m2388(r12)
            r10 = 6
            android.graphics.drawable.RippleDrawable r5 = p000.jx0.m3059(r10, r9, r7, r5)
            r4.setBackground(r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r7 = 36
            int r10 = p000.jx0.m3056(r9, r7)
            int r7 = p000.jx0.m3056(r9, r7)
            r11 = 8388629(0x800015, float:1.1754973E-38)
            r5.<init>(r10, r7, r11)
            r4.setLayoutParams(r5)
            pk r5 = new pk
            r5.<init>(r2, r12)
            r4.setOnClickListener(r5)
            r1.addView(r4)
            r13.addView(r1)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r9)
            r1.setOrientation(r12)
            r1.setGravity(r14)
            r4 = 2
            int r5 = p000.jx0.m3056(r9, r4)
            r10 = 10
            int r4 = p000.jx0.m3056(r9, r10)
            r1.setPadding(r12, r5, r12, r4)
            java.lang.String r4 = "启用评论区控件管理"
            r11 = 1096810496(0x41600000, float:14.0)
            android.widget.TextView r4 = p000.lz1.m3683(r9, r4, r11)
            int r5 = android.graphics.Color.parseColor(r3)
            r4.setTextColor(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r7 = -2
            r11 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r12, r7, r11)
            r4.setLayoutParams(r5)
            r1.addView(r4)
            android.widget.Switch r4 = r2.m5926()
            qk r5 = new qk
            r5.<init>(r2, r12)
            r4.setOnCheckedChangeListener(r5)
            r2.f10886 = r4
            r1.addView(r4)
            r13.addView(r1)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r9)
            r1.setOrientation(r12)
            r4 = 17
            r1.setGravity(r4)
            java.lang.String r4 = r0.f12354
            r5 = 6
            android.graphics.drawable.GradientDrawable r4 = p000.jx0.m3062(r5, r9, r4)
            r1.setBackground(r4)
            r4 = 3
            int r5 = p000.jx0.m3056(r9, r4)
            int r11 = p000.jx0.m3056(r9, r4)
            int r14 = p000.jx0.m3056(r9, r4)
            int r7 = p000.jx0.m3056(r9, r4)
            r1.setPadding(r5, r11, r14, r7)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r7 = 42
            int r7 = p000.jx0.m3056(r9, r7)
            r11 = -1
            r5.<init>(r11, r7)
            r7 = 12
            int r11 = p000.jx0.m3056(r9, r7)
            r5.bottomMargin = r11
            r1.setLayoutParams(r5)
            sk r5 = new sk
            r5.<init>(r2, r12)
            java.lang.String r7 = "控件预览"
            android.widget.TextView r5 = r2.m5917(r7, r5)
            r2.f10871 = r5
            sk r5 = new sk
            r7 = 1
            r5.<init>(r2, r7)
            java.lang.String r7 = "已隐藏"
            android.widget.TextView r5 = r2.m5917(r7, r5)
            r2.f10872 = r5
            android.widget.TextView r5 = r2.f10871
            if (r5 == 0) goto L90a
            r1.addView(r5)
            android.widget.TextView r5 = r2.f10872
            if (r5 == 0) goto L902
            r1.addView(r5)
            r13.addView(r1)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r9)
            r7 = 1
            r1.setOrientation(r7)
            r2.f10876 = r1
            java.lang.String r5 = r0.f12351
            r7 = 6
            android.graphics.drawable.GradientDrawable r5 = p000.jx0.m3062(r7, r9, r5)
            r1.setBackground(r5)
            r7 = 12
            int r5 = p000.jx0.m3056(r9, r7)
            int r14 = p000.jx0.m3056(r9, r10)
            int r4 = p000.jx0.m3056(r9, r7)
            r23 = 0
            int r11 = p000.jx0.m3056(r9, r10)
            r1.setPadding(r5, r14, r4, r11)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r11 = -1
            r4.<init>(r11, r5)
            int r14 = p000.jx0.m3056(r9, r7)
            r4.bottomMargin = r14
            r1.setLayoutParams(r4)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            r4.<init>(r9)
            r7 = 1
            r4.setOrientation(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r11, r5)
            r5 = 8
            int r11 = p000.jx0.m3056(r9, r5)
            r7.bottomMargin = r11
            r4.setLayoutParams(r7)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r9)
            r5.setOrientation(r12)
            r7 = 16
            r5.setGravity(r7)
            java.lang.String r7 = "透明度"
            r11 = 1095761920(0x41500000, float:13.0)
            android.widget.TextView r7 = p000.lz1.m3683(r9, r7, r11)
            int r14 = android.graphics.Color.parseColor(r15)
            r7.setTextColor(r14)
            android.widget.LinearLayout$LayoutParams r14 = new android.widget.LinearLayout$LayoutParams
            r10 = -2
            r11 = 1065353216(0x3f800000, float:1.0)
            r14.<init>(r12, r10, r11)
            r7.setLayoutParams(r14)
            r5.addView(r7)
            android.widget.TextView r7 = new android.widget.TextView
            r7.<init>(r9)
            r10 = 1095761920(0x41500000, float:13.0)
            r7.setTextSize(r10)
            r7.setTypeface(r6)
            int r3 = android.graphics.Color.parseColor(r3)
            r7.setTextColor(r3)
            r2.f10878 = r7
            r5.addView(r7)
            r4.addView(r5)
            android.widget.SeekBar r3 = new android.widget.SeekBar
            r3.<init>(r9)
            r5 = 100
            r3.setMax(r5)
            r5 = 30
            int r5 = p000.jx0.m3056(r9, r5)
            r3.setMinHeight(r5)
            java.lang.String r5 = r0.f12358
            int r6 = android.graphics.Color.parseColor(r5)
            android.content.res.ColorStateList r6 = android.content.res.ColorStateList.valueOf(r6)
            r3.setProgressTintList(r6)
            int r5 = android.graphics.Color.parseColor(r5)
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
            r3.setThumbTintList(r5)
            tk r5 = new tk
            r5.<init>(r12, r2)
            r3.setOnSeekBarChangeListener(r5)
            r2.f10879 = r3
            r4.addView(r3)
            r2.f10877 = r4
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r9)
            r3.setOrientation(r12)
            r7 = 16
            r3.setGravity(r7)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r11 = -1
            r4.<init>(r11, r5)
            r5 = 8
            int r6 = p000.jx0.m3056(r9, r5)
            r4.bottomMargin = r6
            r3.setLayoutParams(r4)
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r9)
            java.lang.String r5 = "自定义颜色"
            r4.setText(r5)
            r10 = 1095761920(0x41500000, float:13.0)
            r4.setTextSize(r10)
            int r5 = android.graphics.Color.parseColor(r15)
            r4.setTextColor(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r10 = -2
            r11 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r12, r10, r11)
            r4.setLayoutParams(r5)
            r3.addView(r4)
            android.view.View r4 = new android.view.View
            r4.<init>(r9)
            java.lang.String r5 = "选择颜色"
            r4.setContentDescription(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = 32
            int r7 = p000.jx0.m3056(r9, r6)
            int r6 = p000.jx0.m3056(r9, r6)
            r5.<init>(r7, r6)
            r6 = 8
            int r7 = p000.jx0.m3056(r9, r6)
            r5.setMarginEnd(r7)
            r4.setLayoutParams(r5)
            pk r5 = new pk
            r7 = 1
            r5.<init>(r2, r7)
            r4.setOnClickListener(r5)
            r2.f10882 = r4
            r3.addView(r4)
            android.widget.Switch r4 = r2.m5926()
            qk r5 = new qk
            r5.<init>(r2, r7)
            r4.setOnCheckedChangeListener(r5)
            r2.f10881 = r4
            r3.addView(r4)
            r2.f10880 = r3
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r9)
            r3.setOrientation(r12)
            r7 = 16
            r3.setGravity(r7)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r11 = -1
            r4.<init>(r11, r5)
            r5 = 8
            int r6 = p000.jx0.m3056(r9, r5)
            r4.bottomMargin = r6
            r3.setLayoutParams(r4)
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r9)
            java.lang.String r6 = "内容染色跳过 @用户"
            r4.setText(r6)
            r10 = 1095761920(0x41500000, float:13.0)
            r4.setTextSize(r10)
            int r6 = android.graphics.Color.parseColor(r15)
            r4.setTextColor(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r10 = -2
            r11 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r12, r10, r11)
            r4.setLayoutParams(r6)
            r3.addView(r4)
            android.widget.Switch r4 = r2.m5926()
            qk r6 = new qk
            r7 = 2
            r6.<init>(r2, r7)
            r4.setOnCheckedChangeListener(r6)
            r2.f10885 = r4
            r3.addView(r4)
            r2.f10884 = r3
            android.widget.TextView r3 = r2.m5918()
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r10 = 38
            int r6 = p000.jx0.m3056(r9, r10)
            r11 = -1
            r4.<init>(r11, r6)
            r3.setLayoutParams(r4)
            pk r4 = new pk
            r7 = 2
            r4.<init>(r2, r7)
            r3.setOnClickListener(r4)
            r2.f10883 = r3
            android.widget.LinearLayout r3 = r2.f10877
            if (r3 == 0) goto L8fc
            r1.addView(r3)
            android.widget.LinearLayout r3 = r2.f10880
            if (r3 == 0) goto L8f6
            r1.addView(r3)
            android.widget.LinearLayout r3 = r2.f10884
            if (r3 == 0) goto L8f0
            r1.addView(r3)
            android.widget.TextView r3 = r2.f10883
            if (r3 == 0) goto L8ea
            r1.addView(r3)
            r13.addView(r1)
            android.widget.FrameLayout r11 = new android.widget.FrameLayout
            r11.<init>(r9)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r4 = -2
            r1.<init>(r3, r4)
            r11.setLayoutParams(r1)
            b8 r14 = new b8
            r1 = r0
            ng r0 = new ng
            r6 = 0
            r7 = 2
            r15 = r1
            r1 = 1
            r17 = r3
            java.lang.Class<uk> r3 = p000.C0875uk.class
            r22 = r4
            java.lang.String r4 = "selectControl"
            r16 = r5
            java.lang.String r5 = "selectControl(Lcom/example/dyhelper/ui/CommentControlMenuControl;)V"
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.getClass()
            r15.getClass()
            r14.<init>()
            r14.f1555 = r9
            r14.f1556 = r15
            r14.f1557 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r14.f1558 = r0
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r9)
            r7 = 1
            r0.setOrientation(r7)
            android.content.Context r1 = r0.getContext()
            r1.getClass()
            java.lang.String r3 = r15.f12351
            android.graphics.drawable.GradientDrawable r1 = p000.jx0.m3062(r10, r1, r3)
            r0.setBackground(r1)
            r7 = 2
            int r1 = p000.jx0.m3056(r9, r7)
            int r3 = p000.jx0.m3056(r9, r10)
            r0.setPadding(r12, r1, r12, r3)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r9)
            r1.setOrientation(r12)
            r7 = 16
            r1.setGravity(r7)
            r3 = 14
            int r4 = p000.jx0.m3056(r9, r3)
            r5 = 10
            int r6 = p000.jx0.m3056(r9, r5)
            r7 = 12
            int r5 = p000.jx0.m3056(r9, r7)
            r7 = 5
            int r3 = p000.jx0.m3056(r9, r7)
            r1.setPadding(r4, r6, r5, r3)
            java.lang.String r3 = r15.f12357
            int r4 = android.graphics.Color.parseColor(r3)
            java.lang.String r5 = "大家都在搜："
            r6 = 1095761920(0x41500000, float:13.0)
            android.widget.TextView r4 = p000.C0068b8.m806(r14, r5, r6, r4)
            r1.addView(r4)
            java.lang.String r4 = r15.f12360
            int r4 = android.graphics.Color.parseColor(r4)
            java.lang.String r5 = "沃尔玛手写收据恶搞"
            android.widget.TextView r4 = p000.C0068b8.m806(r14, r5, r6, r4)
            r5 = 1
            r4.setMaxLines(r5)
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
            r4.setEllipsize(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = -2
            r7 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r12, r6, r7)
            r4.setLayoutParams(r5)
            r1.addView(r4)
            r4 = 1099956224(0x41900000, float:18.0)
            int r5 = android.graphics.Color.parseColor(r3)
            java.lang.String r7 = "⌕"
            android.widget.TextView r4 = p000.C0068b8.m806(r14, r7, r4, r5)
            r5 = 17
            r4.setGravity(r5)
            int r5 = p000.jx0.m3056(r9, r10)
            r4.setPadding(r5, r12, r12, r12)
            r1.addView(r4)
            r0.addView(r1)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r9)
            r7 = 1
            r1.setOrientation(r7)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            android.content.Context r5 = r1.getContext()
            r4.<init>(r5)
            r4.setOrientation(r12)
            r7 = 16
            r4.setGravity(r7)
            r5 = 14
            int r7 = p000.jx0.m3056(r9, r5)
            r4.setPadding(r7, r12, r12, r12)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r7 = 38
            int r7 = p000.jx0.m3056(r9, r7)
            r10 = -1
            r5.<init>(r10, r7)
            r4.setLayoutParams(r5)
            java.lang.String r5 = r15.f12355
            int r7 = android.graphics.Color.parseColor(r5)
            android.graphics.Typeface r6 = android.graphics.Typeface.DEFAULT_BOLD
            r6.getClass()
            android.widget.TextView r10 = new android.widget.TextView
            r10.<init>(r9)
            java.lang.String r12 = "评论 70"
            r10.setText(r12)
            r12 = 1098907648(0x41800000, float:16.0)
            r10.setTextSize(r12)
            r10.setTypeface(r6)
            r10.setTextColor(r7)
            r7 = 0
            r10.setIncludeFontPadding(r7)
            r12 = 16
            r10.setGravity(r12)
            r12 = 28
            int r12 = p000.jx0.m3056(r9, r12)
            r10.setPadding(r7, r7, r12, r7)
            r4.addView(r10)
            java.lang.String r7 = r15.f12356
            int r10 = android.graphics.Color.parseColor(r7)
            java.lang.String r12 = "AI 解析"
            r24 = r3
            r3 = 1098907648(0x41800000, float:16.0)
            android.widget.TextView r10 = p000.C0068b8.m806(r14, r12, r3, r10)
            r12 = 16
            r10.setGravity(r12)
            r4.addView(r10)
            r1.addView(r4)
            android.view.View r3 = new android.view.View
            android.content.Context r4 = r1.getContext()
            r3.<init>(r4)
            int r4 = android.graphics.Color.parseColor(r5)
            r3.setBackgroundColor(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r10 = 62
            int r10 = p000.jx0.m3056(r9, r10)
            r25 = r5
            r12 = 2
            int r5 = p000.jx0.m3056(r9, r12)
            r4.<init>(r10, r5)
            r5 = 14
            int r10 = p000.jx0.m3056(r9, r5)
            r4.setMarginStart(r10)
            r3.setLayoutParams(r4)
            r1.addView(r3)
            r0.addView(r1)
            android.view.View r1 = new android.view.View
            android.content.Context r3 = r0.getContext()
            r1.<init>(r3)
            java.lang.String r3 = r15.f12353
            int r3 = android.graphics.Color.parseColor(r3)
            r1.setBackgroundColor(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r5 = 1
            int r4 = p000.jx0.m3056(r9, r5)
            r10 = -1
            r3.<init>(r10, r4)
            r1.setLayoutParams(r3)
            r0.addView(r1)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r9)
            r3 = 0
            r1.setOrientation(r3)
            r3 = 48
            r1.setGravity(r3)
            r5 = 14
            int r3 = p000.jx0.m3056(r9, r5)
            int r4 = p000.jx0.m3056(r9, r5)
            int r5 = p000.jx0.m3056(r9, r5)
            r10 = 10
            int r12 = p000.jx0.m3056(r9, r10)
            r1.setPadding(r3, r4, r5, r12)
            android.widget.TextView r3 = new android.widget.TextView
            android.content.Context r4 = r1.getContext()
            r3.<init>(r4)
            java.lang.String r4 = "爱"
            r3.setText(r4)
            r4 = 17
            r3.setGravity(r4)
            r4 = 1097859072(0x41700000, float:15.0)
            r3.setTextSize(r4)
            r3.setTypeface(r6)
            r10 = -1
            r3.setTextColor(r10)
            java.lang.String r4 = r15.f12368
            int r4 = android.graphics.Color.parseColor(r4)
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            r5.<init>()
            r6 = 1
            r5.setShape(r6)
            r5.setColor(r4)
            r3.setBackground(r5)
            java.lang.String r4 = "avatar"
            mk r4 = p000.C0068b8.m804(r4)
            r5 = 56
            android.widget.FrameLayout r3 = p000.C0068b8.m805(r14, r4, r3, r10, r5)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r6 = 40
            int r10 = p000.jx0.m3056(r9, r6)
            int r6 = p000.jx0.m3056(r9, r6)
            r4.<init>(r10, r6)
            r6 = 11
            int r6 = p000.jx0.m3056(r9, r6)
            r4.setMarginEnd(r6)
            r3.setLayoutParams(r4)
            r1.addView(r3)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            android.content.Context r4 = r1.getContext()
            r3.<init>(r4)
            r6 = 1
            r3.setOrientation(r6)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r6 = 0
            r10 = -2
            r12 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r6, r10, r12)
            r3.setLayoutParams(r4)
            java.lang.String r4 = "name"
            mk r4 = p000.C0068b8.m804(r4)
            java.lang.String r6 = "爱噶斯坦"
            int r12 = android.graphics.Color.parseColor(r7)
            r5 = 1096810496(0x41600000, float:14.0)
            android.widget.TextView r5 = p000.C0068b8.m806(r14, r6, r5, r12)
            int r6 = android.graphics.Color.parseColor(r7)
            r12 = 120(0x78, float:1.68E-43)
            android.widget.FrameLayout r4 = p000.C0068b8.m805(r14, r4, r5, r6, r12)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = -1
            r5.<init>(r6, r10)
            r4.setLayoutParams(r5)
            r3.addView(r4)
            java.lang.String r4 = "content"
            mk r4 = p000.C0068b8.m804(r4)
            int r5 = android.graphics.Color.parseColor(r25)
            java.lang.String r6 = "让沃尔玛保持混乱，@小助手 说得很对"
            r10 = 1098907648(0x41800000, float:16.0)
            android.widget.TextView r5 = p000.C0068b8.m806(r14, r6, r10, r5)
            r6 = 2
            int r10 = p000.jx0.m3056(r9, r6)
            float r6 = (float) r10
            r10 = 1065353216(0x3f800000, float:1.0)
            r5.setLineSpacing(r6, r10)
            int r6 = android.graphics.Color.parseColor(r25)
            r10 = 88
            android.widget.FrameLayout r4 = p000.C0068b8.m805(r14, r4, r5, r6, r10)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = -2
            r10 = -1
            r5.<init>(r10, r6)
            r4.setLayoutParams(r5)
            r5 = 5
            int r5 = p000.jx0.m3056(r9, r5)
            r6 = 0
            r4.setPadding(r6, r5, r6, r6)
            r3.addView(r4)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            r4.<init>(r9)
            r4.setOrientation(r6)
            r5 = 16
            r4.setGravity(r5)
            r10 = 8
            int r12 = p000.jx0.m3056(r9, r10)
            r4.setPadding(r6, r12, r6, r6)
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            android.content.Context r12 = r4.getContext()
            r10.<init>(r12)
            r10.setOrientation(r6)
            r10.setGravity(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r20 = r7
            r7 = 1065353216(0x3f800000, float:1.0)
            r12 = -2
            r5.<init>(r6, r12, r7)
            r10.setLayoutParams(r5)
            java.lang.String r5 = "time"
            mk r5 = p000.C0068b8.m804(r5)
            java.lang.String r6 = "07-01"
            int r7 = android.graphics.Color.parseColor(r24)
            r12 = 1094713344(0x41400000, float:12.0)
            android.widget.TextView r6 = p000.C0068b8.m806(r14, r6, r12, r7)
            int r7 = android.graphics.Color.parseColor(r24)
            r12 = 120(0x78, float:1.68E-43)
            android.widget.FrameLayout r5 = p000.C0068b8.m805(r14, r5, r6, r7, r12)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r12 = -2
            r6.<init>(r12, r12)
            r7 = 6
            int r7 = p000.jx0.m3056(r9, r7)
            r6.setMarginEnd(r7)
            r5.setLayoutParams(r6)
            r10.addView(r5)
            java.lang.String r5 = "ip_region"
            mk r5 = p000.C0068b8.m804(r5)
            java.lang.String r6 = r15.f12358
            int r7 = android.graphics.Color.parseColor(r6)
            java.lang.String r12 = "· 马来西亚"
            r18 = r6
            r6 = 1094713344(0x41400000, float:12.0)
            android.widget.TextView r7 = p000.C0068b8.m806(r14, r12, r6, r7)
            int r6 = android.graphics.Color.parseColor(r18)
            r12 = 120(0x78, float:1.68E-43)
            android.widget.FrameLayout r5 = p000.C0068b8.m805(r14, r5, r7, r6, r12)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r12 = -2
            r6.<init>(r12, r12)
            r7 = 9
            int r12 = p000.jx0.m3056(r9, r7)
            r6.setMarginEnd(r12)
            r5.setLayoutParams(r6)
            r10.addView(r5)
            java.lang.String r5 = "reply"
            mk r5 = p000.C0068b8.m804(r5)
            java.lang.String r6 = "回复"
            int r12 = android.graphics.Color.parseColor(r24)
            r7 = 1094713344(0x41400000, float:12.0)
            android.widget.TextView r6 = p000.C0068b8.m806(r14, r6, r7, r12)
            int r7 = android.graphics.Color.parseColor(r24)
            r12 = 120(0x78, float:1.68E-43)
            android.widget.FrameLayout r5 = p000.C0068b8.m805(r14, r5, r6, r7, r12)
            r10.addView(r5)
            r4.addView(r10)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r9)
            r6 = 0
            r5.setOrientation(r6)
            r7 = 16
            r5.setGravity(r7)
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            r10.<init>(r9)
            r10.setOrientation(r6)
            r10.setGravity(r7)
            r7 = 2
            int r12 = p000.jx0.m3056(r9, r7)
            int r7 = p000.jx0.m3056(r9, r7)
            r10.setPadding(r12, r6, r7, r6)
            java.lang.String r6 = "like_icon"
            mk r6 = p000.C0068b8.m804(r6)
            r7 = 2131230889(0x7f0800a9, float:1.8077844E38)
            java.lang.String r12 = "点赞图标"
            android.widget.ImageView r7 = r14.m815(r12, r7)
            int r12 = android.graphics.Color.parseColor(r20)
            r19 = r8
            r8 = 56
            android.widget.FrameLayout r6 = p000.C0068b8.m805(r14, r6, r7, r12, r8)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r8 = 22
            int r12 = p000.jx0.m3056(r9, r8)
            r21 = r13
            int r13 = p000.jx0.m3056(r9, r8)
            r7.<init>(r12, r13)
            r12 = 3
            int r12 = p000.jx0.m3056(r9, r12)
            r7.setMarginEnd(r12)
            r6.setLayoutParams(r7)
            r10.addView(r6)
            java.lang.String r6 = "like_count"
            mk r6 = p000.C0068b8.m804(r6)
            java.lang.String r7 = "772"
            int r12 = android.graphics.Color.parseColor(r24)
            r13 = 1095761920(0x41500000, float:13.0)
            android.widget.TextView r7 = p000.C0068b8.m806(r14, r7, r13, r12)
            int r12 = android.graphics.Color.parseColor(r24)
            r13 = 120(0x78, float:1.68E-43)
            android.widget.FrameLayout r6 = p000.C0068b8.m805(r14, r6, r7, r12, r13)
            r10.addView(r6)
            java.lang.String r6 = "like_area"
            mk r6 = p000.C0068b8.m804(r6)
            r7 = 112(0x70, float:1.57E-43)
            r12 = 0
            android.widget.FrameLayout r6 = p000.C0068b8.m805(r14, r6, r10, r12, r7)
            r5.addView(r6)
            java.lang.String r6 = "bury"
            mk r6 = p000.C0068b8.m804(r6)
            r7 = 2131230888(0x7f0800a8, float:1.8077841E38)
            java.lang.String r10 = "踩图标"
            android.widget.ImageView r7 = r14.m815(r10, r7)
            int r10 = android.graphics.Color.parseColor(r20)
            r12 = 56
            android.widget.FrameLayout r6 = p000.C0068b8.m805(r14, r6, r7, r10, r12)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            int r10 = p000.jx0.m3056(r9, r8)
            int r8 = p000.jx0.m3056(r9, r8)
            r7.<init>(r10, r8)
            r10 = 10
            int r8 = p000.jx0.m3056(r9, r10)
            r7.setMarginStart(r8)
            r6.setLayoutParams(r7)
            r5.addView(r6)
            r4.addView(r5)
            r3.addView(r4)
            java.lang.String r4 = "expand_comments"
            mk r4 = p000.C0068b8.m804(r4)
            java.lang.String r5 = r15.f12366
            int r6 = android.graphics.Color.parseColor(r5)
            java.lang.String r7 = "──  展开 4 条回复 ⌄"
            r10 = 1095761920(0x41500000, float:13.0)
            android.widget.TextView r6 = p000.C0068b8.m806(r14, r7, r10, r6)
            int r5 = android.graphics.Color.parseColor(r5)
            r12 = 120(0x78, float:1.68E-43)
            android.widget.FrameLayout r4 = p000.C0068b8.m805(r14, r4, r6, r5, r12)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r10 = -1
            r12 = -2
            r5.<init>(r10, r12)
            r4.setLayoutParams(r5)
            r5 = 9
            int r5 = p000.jx0.m3056(r9, r5)
            r6 = 0
            r4.setPadding(r6, r5, r6, r6)
            r3.addView(r4)
            r1.addView(r3)
            r0.addView(r1)
            r14.f1559 = r0
            r2.f10862 = r14
            r7 = 1
            android.widget.LinearLayout r0 = p000.AbstractC0602nx.m4123(r9, r7)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r9)
            java.lang.String r3 = "点击下方预览中的控件进行修改"
            r1.setText(r3)
            r6 = 1094713344(0x41400000, float:12.0)
            r1.setTextSize(r6)
            r4 = 17
            r1.setGravity(r4)
            java.lang.String r3 = r15.f12357
            int r3 = android.graphics.Color.parseColor(r3)
            r1.setTextColor(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r10 = -1
            r12 = -2
            r3.<init>(r10, r12)
            r5 = 8
            int r4 = p000.jx0.m3056(r9, r5)
            r3.bottomMargin = r4
            r1.setLayoutParams(r3)
            r0.addView(r1)
            b8 r1 = r2.f10862
            if (r1 == 0) goto L8e4
            java.lang.Object r1 = r1.f1559
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.addView(r1)
            r2.f10873 = r0
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r9)
            r7 = 1
            r0.setOrientation(r7)
            r5 = 8
            r0.setVisibility(r5)
            r2.f10874 = r0
            android.widget.LinearLayout r1 = p000.AbstractC0602nx.m4123(r9, r7)
            r2.f10875 = r1
            r0.addView(r1)
            r2.f10874 = r0
            android.widget.LinearLayout r0 = r2.f10873
            if (r0 == 0) goto L8de
            r11.addView(r0)
            android.widget.LinearLayout r0 = r2.f10874
            if (r0 == 0) goto L8d8
            r11.addView(r0)
            r0 = r21
            r0.addView(r11)
            r1 = r19
            r1.addView(r0)
            android.content.res.Resources r0 = r9.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.heightPixels
            float r0 = (float) r0
            r3 = 1062333317(0x3f51eb85, float:0.82)
            float r0 = r0 * r3
            int r0 = p000.jx0.m3061(r0)
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r10 = -1
            r3.<init>(r10, r0)
            r1.setLayoutParams(r3)
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            r0.<init>(r9)
            android.app.AlertDialog$Builder r0 = r0.setView(r1)
            android.app.AlertDialog r0 = r0.create()
            r0.getClass()
            r2.f10869 = r0
            r0.show()
            android.app.AlertDialog r0 = r2.f10869
            if (r0 == 0) goto L8d2
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L8ce
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r6 = 0
            r1.<init>(r6)
            r0.setBackgroundDrawable(r1)
            android.content.res.Resources r1 = r9.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            float r1 = (float) r1
            r3 = 1064346583(0x3f70a3d7, float:0.94)
            float r1 = r1 * r3
            int r1 = p000.jx0.m3061(r1)
            r12 = -2
            r0.setLayout(r1, r12)
        L8ce:
            r2.m5920()
            return
        L8d2:
            java.lang.String r0 = "dialog"
            p000.ln0.m3650(r0)
            throw r23
        L8d8:
            java.lang.String r0 = "hiddenPage"
            p000.ln0.m3650(r0)
            throw r23
        L8de:
            java.lang.String r0 = "previewPage"
            p000.ln0.m3650(r0)
            throw r23
        L8e4:
            java.lang.String r0 = "preview"
            p000.ln0.m3650(r0)
            throw r23
        L8ea:
            java.lang.String r0 = "visibilityButton"
            p000.ln0.m3650(r0)
            throw r23
        L8f0:
            java.lang.String r0 = "mentionSection"
            p000.ln0.m3650(r0)
            throw r23
        L8f6:
            java.lang.String r0 = "colorSection"
            p000.ln0.m3650(r0)
            throw r23
        L8fc:
            java.lang.String r0 = "alphaSection"
            p000.ln0.m3650(r0)
            throw r23
        L902:
            r23 = 0
            java.lang.String r0 = "hiddenTab"
            p000.ln0.m3650(r0)
            throw r23
        L90a:
            r23 = 0
            java.lang.String r0 = "previewTab"
            p000.ln0.m3650(r0)
            throw r23
    }

    /* JADX INFO: renamed from: ν */
    public final void m5925(p000.EnumC0589nk r8) {
            r7 = this;
            r7.f10865 = r8
            android.widget.LinearLayout r0 = r7.f10873
            r1 = 0
            if (r0 == 0) goto L41
            r2 = 8
            r3 = 0
            nk r4 = p000.EnumC0589nk.f7658
            if (r8 != r4) goto L10
            r5 = r3
            goto L11
        L10:
            r5 = r2
        L11:
            r0.setVisibility(r5)
            android.widget.LinearLayout r0 = r7.f10874
            if (r0 == 0) goto L3b
            nk r5 = p000.EnumC0589nk.f7659
            if (r8 != r5) goto L1e
            r6 = r3
            goto L1f
        L1e:
            r6 = r2
        L1f:
            r0.setVisibility(r6)
            android.widget.LinearLayout r0 = r7.f10876
            if (r0 == 0) goto L35
            if (r8 != r4) goto L29
            r2 = r3
        L29:
            r0.setVisibility(r2)
            r7.m5922()
            if (r8 != r5) goto L34
            r7.m5919()
        L34:
            return
        L35:
            java.lang.String r7 = "editor"
            p000.ln0.m3650(r7)
            throw r1
        L3b:
            java.lang.String r7 = "hiddenPage"
            p000.ln0.m3650(r7)
            throw r1
        L41:
            java.lang.String r7 = "previewPage"
            p000.ln0.m3650(r7)
            throw r1
    }

    /* JADX INFO: renamed from: ξ */
    public final android.widget.Switch m5926() {
            r7 = this;
            android.widget.Switch r0 = new android.widget.Switch
            android.app.Activity r1 = r7.f10863
            r0.<init>(r1)
            android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r3 = new int[]{r2}
            r4 = 0
            int[] r5 = new int[r4]
            int[][] r3 = new int[][]{r3, r5}
            xx r7 = r7.f10864
            java.lang.String r5 = r7.f12358
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.String r6 = r7.f12370
            int r6 = android.graphics.Color.parseColor(r6)
            int[] r5 = new int[]{r5, r6}
            r1.<init>(r3, r5)
            r0.setThumbTintList(r1)
            android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
            int[] r2 = new int[]{r2}
            int[] r3 = new int[r4]
            int[][] r2 = new int[][]{r2, r3}
            java.lang.String r3 = r7.f12359
            int r3 = android.graphics.Color.parseColor(r3)
            java.lang.String r7 = r7.f12371
            int r7 = android.graphics.Color.parseColor(r7)
            int[] r7 = new int[]{r3, r7}
            r1.<init>(r2, r7)
            r0.setTrackTintList(r1)
            return r0
    }
}
