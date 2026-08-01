package defpackage;

/* JADX INFO: renamed from: ᲀᲀᛲᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1732 extends defpackage.C1069 {

    /* JADX INFO: renamed from: ᛱᲇᲀᛸ, reason: contains not printable characters */
    public boolean f7665;

    /* JADX INFO: renamed from: ᛱᲈᛷᲀ, reason: contains not printable characters */
    public java.util.ArrayList f7666;

    /* JADX INFO: renamed from: ᛲᛵᲁᛲ, reason: contains not printable characters */
    public int f7667;

    /* JADX INFO: renamed from: ᛲᛶᛷᛲ, reason: contains not printable characters */
    public java.util.ArrayList f7668;

    /* JADX INFO: renamed from: ᛲᲈᛶᲇ, reason: contains not printable characters */
    public android.widget.EditText f7669;

    /* JADX INFO: renamed from: ᛲᲈᛸᛲ, reason: contains not printable characters */
    public java.util.ArrayList f7670;

    /* JADX INFO: renamed from: ᛳᛳᛵᛲ, reason: contains not printable characters */
    public int[] f7671;

    /* JADX INFO: renamed from: ᛳᛸᛲᛳ, reason: contains not printable characters */
    public long f7672;

    /* JADX INFO: renamed from: ᛴᛴᲈᛵ, reason: contains not printable characters */
    public defpackage.C0334 f7673;

    /* JADX INFO: renamed from: ᛴᛶᛸᲈ, reason: contains not printable characters */
    public defpackage.C1732 f7674;

    /* JADX INFO: renamed from: ᛴᲁᲇᛲ, reason: contains not printable characters */
    public java.lang.CharSequence[] f7675;

    /* JADX INFO: renamed from: ᛵᲀᛸᲈ, reason: contains not printable characters */
    public boolean f7676;

    /* JADX INFO: renamed from: ᛶᛷᛸᲈ, reason: contains not printable characters */
    public float f7677;

    /* JADX INFO: renamed from: ᛷᛲᛶᲀ, reason: contains not printable characters */
    public android.widget.TextView f7678;

    /* JADX INFO: renamed from: ᛷᛶᲁᲀ, reason: contains not printable characters */
    public java.lang.String f7679;

    /* JADX INFO: renamed from: ᛷᛷᛱᲁ, reason: contains not printable characters */
    public java.util.ArrayList f7680;

    /* JADX INFO: renamed from: ᲀᛴᲀ, reason: contains not printable characters */
    public int f7681;

    /* JADX INFO: renamed from: ᲀᛷᛲᛴ, reason: contains not printable characters */
    public java.util.HashMap f7682;

    /* JADX INFO: renamed from: ᲀᲀᲇᛴ, reason: contains not printable characters */
    public android.widget.LinearLayout f7683;

    /* JADX INFO: renamed from: ᲀᲇᛲᲇ, reason: contains not printable characters */
    public java.lang.String f7684;

    /* JADX INFO: renamed from: ᲀᲈᛵᛳ, reason: contains not printable characters */
    public defpackage.C2146 f7685;

    /* JADX INFO: renamed from: ᲁᛸᛴᛶ, reason: contains not printable characters */
    public android.widget.LinearLayout f7686;

    /* JADX INFO: renamed from: ᲁᲀᛴᛷ, reason: contains not printable characters */
    public java.lang.String f7687;

    /* JADX INFO: renamed from: ᲀᛷᛲᛴ, reason: contains not printable characters */
    public static defpackage.C1732 m3110() {
            ᲀᲀᛲᛴ r0 = new ᲀᲀᛲᛴ
            r0.<init>()
            r0.f7674 = r0
            r1 = -1
            r0.f7667 = r1
            r1 = 1
            r0.f7681 = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f7682 = r1
            r1 = 0
            r0.f7676 = r1
            java.lang.String r1 = "Search"
            r0.f7687 = r1
            java.lang.String r1 = "无匹配结果"
            r0.f7679 = r1
            java.lang.String r1 = ""
            r0.f7684 = r1
            r1 = 0
            r0.f7672 = r1
            return r0
    }

    @Override // defpackage.C1069
    /* JADX INFO: renamed from: ᛱᛳᛷ */
    public final boolean mo2031() {
            r1 = this;
            int r0 = r1.f4763
            if (r0 == 0) goto La
            r1 = 1
            if (r0 != r1) goto L8
            return r1
        L8:
            r1 = 0
            return r1
        La:
            boolean r1 = r1.f368
            return r1
    }

    /* JADX INFO: renamed from: ᛱᲈᛷᲀ, reason: contains not printable characters */
    public final void m3111() {
            r1 = this;
            r0 = 3
            r1.f7681 = r0
            r0 = -1
            r1.f7667 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f7668 = r0
            r0 = 0
            r1.f7685 = r0
            r1.m3113()
            return
    }

    /* JADX INFO: renamed from: ᛲᛶᛷᛲ, reason: contains not printable characters */
    public final void m3112() {
            r14 = this;
            ᛳᛳᛴᛸ r0 = r14.f4767
            if (r0 == 0) goto L1e7
            android.view.ViewGroup r0 = r0.f2160
            if (r0 == 0) goto L1e7
            ᛲᛸᛳᛷ r1 = r14.f7673
            if (r1 != 0) goto Le
            goto L1e7
        Le:
            r0.removeAllViews()
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            boolean r3 = r14.f7676
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L1ca
            ᲀᲀᛲᛴ r3 = r14.f7674
            android.content.Context r3 = r3.f378
            if (r3 != 0) goto L28
            android.app.Activity r3 = r14.m271()
        L28:
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r6.<init>(r3)
            r14.f7686 = r6
            r7 = 1
            r6.setOrientation(r7)
            android.widget.LinearLayout r6 = new android.widget.LinearLayout
            r6.<init>(r3)
            r6.setOrientation(r7)
            r8 = 1101004800(0x41a00000, float:20.0)
            int r9 = r14.m258(r8)
            r10 = 1090519040(0x41000000, float:8.0)
            int r11 = r14.m258(r10)
            int r12 = r14.m258(r8)
            int r13 = r14.m258(r10)
            r6.setPadding(r9, r11, r12, r13)
            r6.setFocusable(r7)
            r6.setFocusableInTouchMode(r7)
            android.widget.EditText r9 = new android.widget.EditText
            r9.<init>(r3)
            r14.f7669 = r9
            r9.setSingleLine(r7)
            android.widget.EditText r9 = r14.f7669
            r9.setMaxLines(r7)
            android.widget.EditText r9 = r14.f7669
            r9.setInputType(r7)
            android.widget.EditText r9 = r14.f7669
            r11 = 3
            r9.setImeOptions(r11)
            android.widget.EditText r9 = r14.f7669
            r11 = 8388627(0x800013, float:1.175497E-38)
            r9.setGravity(r11)
            android.widget.EditText r9 = r14.f7669
            r11 = 1098907648(0x41800000, float:16.0)
            r9.setTextSize(r11)
            android.widget.EditText r9 = r14.f7669
            r9.setIncludeFontPadding(r4)
            android.widget.EditText r9 = r14.f7669
            r11 = 1094713344(0x41400000, float:12.0)
            int r12 = r14.m258(r11)
            int r13 = r14.m258(r11)
            r9.setPadding(r12, r4, r13, r4)
            android.widget.EditText r9 = r14.f7669
            int r10 = r14.m258(r10)
            r9.setCompoundDrawablePadding(r10)
            android.widget.EditText r9 = r14.f7669
            boolean r10 = r14.mo270()
            if (r10 == 0) goto Laa
            r10 = 1711800671(0x6608015f, float:1.6056678E23)
            goto Lad
        Laa:
            r10 = 1711800672(0x66080160, float:1.605668E23)
        Lad:
            r9.setBackgroundResource(r10)
            android.widget.EditText r9 = r14.f7669
            android.content.res.Resources r10 = r14.m263()
            r14.mo270()
            ᲈᛴᛵᲈ r12 = r14.f375
            r12.getClass()
            r14.mo270()
            boolean r12 = r14.mo270()
            if (r12 == 0) goto Lcb
            r12 = 1711669302(0x66060036, float:1.5820025E23)
            goto Lce
        Lcb:
            r12 = 1711669528(0x66060118, float:1.5820432E23)
        Lce:
            int r10 = r10.getColor(r12)
            r9.setTextColor(r10)
            android.widget.EditText r9 = r14.f7669
            android.content.res.Resources r10 = r14.m263()
            int r12 = r14.m3120()
            int r10 = r10.getColor(r12)
            r9.setHintTextColor(r10)
            android.widget.EditText r9 = r14.f7669
            java.lang.String r10 = r14.f7687
            r9.setHint(r10)
            android.widget.EditText r9 = r14.f7669
            com.kongzue.dialogx.interfaces.AbstractC0008.m250(r9, r5)
            android.widget.EditText r9 = r14.f7669
            r9.setSingleLine(r7)
            android.widget.EditText r9 = r14.f7669
            r9.setMaxLines(r7)
            r14.m3114()
            android.widget.EditText r7 = r14.f7669
            ᛵᛸᛲᛶ r9 = new ᛵᛸᛲᛶ
            r9.<init>(r4, r14)
            r7.setOnEditorActionListener(r9)
            android.widget.EditText r7 = r14.f7669
            ᲀᛴᛳᛲ r9 = new ᲀᛴᛳᛲ
            r9.<init>(r4, r14)
            r7.setOnTouchListener(r9)
            java.lang.String r7 = r14.f7684
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L12f
            android.widget.EditText r7 = r14.f7669
            java.lang.String r9 = r14.f7684
            r7.setText(r9)
            android.widget.EditText r7 = r14.f7669
            android.text.Editable r9 = r7.getText()
            int r9 = r9.length()
            r7.setSelection(r9)
        L12f:
            android.widget.EditText r7 = r14.f7669
            ᛵᲇᛴᛴ r9 = new ᛵᲇᛴᛴ
            r9.<init>(r4, r14)
            r7.addTextChangedListener(r9)
            android.widget.EditText r4 = r14.f7669
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r9 = 1109917696(0x42280000, float:42.0)
            int r9 = r14.m258(r9)
            r7.<init>(r1, r9)
            r6.addView(r4, r7)
            r6.clearFocus()
            android.widget.EditText r4 = r14.f7669
            r4.clearFocus()
            r14.f7683 = r6
            android.widget.TextView r4 = new android.widget.TextView
            r4.<init>(r3)
            r3 = 17
            r4.setGravity(r3)
            r3 = 1113325568(0x425c0000, float:55.0)
            int r3 = r14.m258(r3)
            r4.setMinHeight(r3)
            int r3 = r14.m258(r8)
            int r6 = r14.m258(r11)
            int r7 = r14.m258(r8)
            int r8 = r14.m258(r11)
            r4.setPadding(r3, r6, r7, r8)
            r3 = 1097859072(0x41700000, float:15.0)
            r4.setTextSize(r3)
            android.content.res.Resources r3 = r14.m263()
            int r6 = r14.m3120()
            int r3 = r3.getColor(r6)
            r4.setTextColor(r3)
            java.lang.String r3 = r14.f7679
            r4.setText(r3)
            com.kongzue.dialogx.interfaces.AbstractC0008.m250(r4, r5)
            r3 = 8
            r4.setVisibility(r3)
            r14.f7678 = r4
            android.widget.LinearLayout r3 = r14.f7686
            android.widget.LinearLayout r4 = r14.f7683
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r1, r2)
            r3.addView(r4, r5)
            android.widget.LinearLayout r3 = r14.f7686
            ᛲᛸᛳᛷ r4 = r14.f7673
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r1, r2)
            r3.addView(r4, r5)
            android.widget.LinearLayout r3 = r14.f7686
            android.widget.TextView r4 = r14.f7678
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r1, r2)
            r3.addView(r4, r5)
            ᛳᛳᛴᛸ r1 = r14.f4767
            android.view.ViewGroup r1 = r1.f2160
            android.widget.LinearLayout r14 = r14.f7686
            r1.addView(r14, r0)
            return
        L1ca:
            android.widget.EditText r1 = r14.f7669
            if (r1 == 0) goto L1d1
            r14.m3115()
        L1d1:
            ᛲᛸᛳᛷ r1 = r14.f7673
            r1.setVisibility(r4)
            r14.f7686 = r5
            r14.f7683 = r5
            r14.f7669 = r5
            r14.f7678 = r5
            ᛳᛳᛴᛸ r1 = r14.f4767
            android.view.ViewGroup r1 = r1.f2160
            ᛲᛸᛳᛷ r14 = r14.f7673
            r1.addView(r14, r0)
        L1e7:
            return
    }

    /* JADX INFO: renamed from: ᛲᲈᛶᲇ, reason: contains not printable characters */
    public final void m3113() {
            r2 = this;
            ᛳᛳᛴᛸ r0 = r2.f4767
            if (r0 != 0) goto L5
            return
        L5:
            ᛳᛳᛵᛲ r0 = new ᛳᛳᛵᛲ
            r1 = 3
            r0.<init>(r1, r2)
            com.kongzue.dialogx.interfaces.AbstractC0008.m257(r0)
            return
    }

    /* JADX INFO: renamed from: ᛲᲈᛸᛲ, reason: contains not printable characters */
    public final void m3114() {
            r7 = this;
            android.widget.EditText r0 = r7.f7669
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 1711800590(0x6608010e, float:1.6056532E23)
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r0 = defpackage.AbstractC1592.m2873(r0, r1)
            r1 = 1099956224(0x41900000, float:18.0)
            r2 = 0
            if (r0 == 0) goto L37
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.content.res.Resources r3 = r7.m263()
            int r4 = r7.m3120()
            int r3 = r3.getColor(r4)
            android.content.res.ColorStateList r3 = android.content.res.ColorStateList.valueOf(r3)
            r0.setTintList(r3)
            int r3 = r7.m258(r1)
            int r4 = r7.m258(r1)
            r0.setBounds(r2, r2, r3, r4)
        L37:
            android.widget.EditText r3 = r7.f7669
            android.text.Editable r3 = r3.getText()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r4 = 0
            if (r3 != 0) goto L76
            android.widget.EditText r3 = r7.f7669
            android.content.Context r3 = r3.getContext()
            r5 = 1711800589(0x6608010d, float:1.605653E23)
            android.graphics.drawable.Drawable r3 = defpackage.AbstractC1592.m2873(r3, r5)
            if (r3 == 0) goto L77
            android.graphics.drawable.Drawable r3 = r3.mutate()
            android.content.res.Resources r5 = r7.m263()
            int r6 = r7.m3120()
            int r5 = r5.getColor(r6)
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
            r3.setTintList(r5)
            int r5 = r7.m258(r1)
            int r1 = r7.m258(r1)
            r3.setBounds(r2, r2, r5, r1)
            goto L77
        L76:
            r3 = r4
        L77:
            android.widget.EditText r7 = r7.f7669
            r7.setCompoundDrawables(r0, r4, r3, r4)
            return
    }

    @Override // defpackage.C1069
    /* JADX INFO: renamed from: ᛴᛴᛲᲈ */
    public final boolean mo2033() {
            r1 = this;
            android.widget.EditText r0 = r1.f7669
            if (r0 == 0) goto Lf
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto Lf
            r1.m3115()
            r1 = 1
            return r1
        Lf:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛴᛴᲈᛵ, reason: contains not printable characters */
    public final void m3115() {
            r2 = this;
            android.widget.EditText r0 = r2.f7669
            if (r0 != 0) goto L5
            goto L19
        L5:
            r1 = 0
            r2.m268(r0, r1)
            android.widget.EditText r0 = r2.f7669
            r0.clearFocus()
            ᛳᛳᛴᛸ r2 = r2.f4767
            if (r2 == 0) goto L19
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r2 = r2.f2164
            if (r2 == 0) goto L19
            r2.requestFocus()
        L19:
            return
    }

    @Override // defpackage.C1069
    /* JADX INFO: renamed from: ᛵᛵᲀᛲ */
    public final defpackage.C1069 mo2035(java.lang.CharSequence r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* JADX INFO: renamed from: ᛵᲀᛸᲈ, reason: contains not printable characters */
    public final void m3116(java.lang.String r1, defpackage.InterfaceC1770 r2) {
            r0 = this;
            r0.f4774 = r1
            r0.f4770 = r2
            r0.m3113()
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᛶᲀ, reason: contains not printable characters */
    public final void m3117() {
            r6 = this;
            r0 = 0
            r6.f7680 = r0
            r6.f7666 = r0
            boolean r0 = r6.f7676
            if (r0 == 0) goto L6b
            java.util.ArrayList r0 = r6.f7670
            if (r0 == 0) goto L6b
            java.lang.String r0 = r6.f7684
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L16
            goto L6b
        L16:
            java.lang.String r0 = r6.f7684
            java.lang.String r0 = r0.toString()
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.toLowerCase(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.f7680 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.f7666 = r1
            r1 = 0
            r2 = r1
        L34:
            java.util.ArrayList r3 = r6.f7670
            int r3 = r3.size()
            if (r2 >= r3) goto L6b
            java.util.ArrayList r3 = r6.f7670
            java.lang.Object r3 = r3.get(r2)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 != 0) goto L48
            r4 = r1
            goto L58
        L48:
            java.lang.String r4 = r3.toString()
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.toLowerCase(r5)
            boolean r4 = r4.contains(r0)
        L58:
            if (r4 == 0) goto L68
            java.util.ArrayList r4 = r6.f7680
            r4.add(r3)
            java.util.ArrayList r3 = r6.f7666
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r3.add(r4)
        L68:
            int r2 = r2 + 1
            goto L34
        L6b:
            return
    }

    @Override // defpackage.C1069
    /* JADX INFO: renamed from: ᛷᛴᲈ */
    public final void mo2037() {
            r5 = this;
            ᲀᲀᛲᛴ r0 = r5.f7674
            ᛳᛳᛴᛸ r1 = r5.f4767
            if (r1 != 0) goto L7
            return
        L7:
            r5.m3117()
            ᛲᛸᛳᛷ r1 = r5.f7673
            r2 = 0
            if (r1 == 0) goto L69
            boolean r1 = r5.f7676
            if (r1 == 0) goto L1b
            android.widget.LinearLayout r3 = r5.f7683
            if (r3 != 0) goto L1b
            r5.m3112()
            goto L24
        L1b:
            if (r1 != 0) goto L24
            android.widget.LinearLayout r1 = r5.f7683
            if (r1 == 0) goto L24
            r5.m3112()
        L24:
            ᲇᲇᛶᲁ r1 = r5.f7685
            if (r1 != 0) goto L42
            android.content.Context r1 = r0.f378
            if (r1 != 0) goto L30
            android.app.Activity r1 = r5.m271()
        L30:
            ᲇᲇᛶᲁ r3 = new ᲇᲇᛶᲁ
            java.util.List r4 = r5.m3122()
            r3.<init>(r2)
            r3.f9120 = r4
            r3.f9123 = r1
            r3.f9122 = r0
            r5.f7685 = r3
            goto L48
        L42:
            java.util.List r0 = r5.m3122()
            r1.f9120 = r0
        L48:
            ᛲᛸᛳᛷ r0 = r5.f7673
            android.widget.ListAdapter r0 = r0.getAdapter()
            ᛲᛸᛳᛷ r1 = r5.f7673
            if (r0 != 0) goto L58
            ᲇᲇᛶᲁ r0 = r5.f7685
            r1.setAdapter(r0)
            goto L69
        L58:
            android.widget.ListAdapter r0 = r1.getAdapter()
            ᲇᲇᛶᲁ r1 = r5.f7685
            if (r0 == r1) goto L66
            ᛲᛸᛳᛷ r0 = r5.f7673
            r0.setAdapter(r1)
            goto L69
        L66:
            r1.notifyDataSetChanged()
        L69:
            android.widget.EditText r0 = r5.f7669
            if (r0 != 0) goto L6f
            goto L106
        L6f:
            java.lang.String r1 = r5.f7687
            r0.setHint(r1)
            android.widget.EditText r0 = r5.f7669
            boolean r1 = r5.mo270()
            if (r1 == 0) goto L80
            r1 = 1711800671(0x6608015f, float:1.6056678E23)
            goto L83
        L80:
            r1 = 1711800672(0x66080160, float:1.605668E23)
        L83:
            r0.setBackgroundResource(r1)
            android.widget.EditText r0 = r5.f7669
            android.content.res.Resources r1 = r5.m263()
            r5.mo270()
            ᲈᛴᛵᲈ r3 = r5.f375
            r3.getClass()
            r5.mo270()
            boolean r3 = r5.mo270()
            if (r3 == 0) goto La1
            r3 = 1711669302(0x66060036, float:1.5820025E23)
            goto La4
        La1:
            r3 = 1711669528(0x66060118, float:1.5820432E23)
        La4:
            int r1 = r1.getColor(r3)
            r0.setTextColor(r1)
            android.widget.EditText r0 = r5.f7669
            android.content.res.Resources r1 = r5.m263()
            int r3 = r5.m3120()
            int r1 = r1.getColor(r3)
            r0.setHintTextColor(r1)
            android.widget.EditText r0 = r5.f7669
            r1 = 0
            com.kongzue.dialogx.interfaces.AbstractC0008.m250(r0, r1)
            android.widget.EditText r0 = r5.f7669
            r1 = 1
            r0.setSingleLine(r1)
            android.widget.EditText r0 = r5.f7669
            r0.setMaxLines(r1)
            r5.m3114()
            r5.m3121()
            android.widget.EditText r0 = r5.f7669
            android.text.Editable r0 = r0.getText()
            java.lang.String r3 = r5.f7684
            if (r3 != 0) goto Le0
            java.lang.String r3 = ""
            goto Le4
        Le0:
            java.lang.String r3 = r3.toString()
        Le4:
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 != 0) goto L106
            r5.f7665 = r1
            android.widget.EditText r0 = r5.f7669
            r0.setText(r3)
            android.widget.EditText r0 = r5.f7669
            android.text.Editable r1 = r0.getText()
            int r1 = r1.length()
            r0.setSelection(r1)
            r5.f7665 = r2
            r5.m3114()
            r5.m3121()
        L106:
            super.mo2037()
            return
    }

    /* JADX INFO: renamed from: ᛷᛶᲁᲀ, reason: contains not printable characters */
    public final void m3118(int[] r5) {
            r4 = this;
            r0 = 3
            r4.f7681 = r0
            r0 = -1
            r4.f7667 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f7668 = r0
            int r0 = r5.length
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1f
            r2 = r5[r1]
            java.util.ArrayList r3 = r4.f7668
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            int r1 = r1 + 1
            goto Lf
        L1f:
            r5 = 0
            r4.f7685 = r5
            r4.m3113()
            return
    }

    /* JADX INFO: renamed from: ᛷᛷᛱᲁ, reason: contains not printable characters */
    public final void m3119(java.lang.String[] r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f7670 = r0
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0.addAll(r2)
            r2 = 0
            r1.f7685 = r2
            r1.m3113()
            return
    }

    @Override // defpackage.C1069
    /* JADX INFO: renamed from: ᛸᛱᲈᛳ */
    public final defpackage.C0438 mo2038() {
            r0 = this;
            ᛳᛳᛴᛸ r0 = r0.f4767
            return r0
    }

    @Override // defpackage.C1069
    /* JADX INFO: renamed from: ᲀᲀᛲᛸ */
    public final void mo2039(java.lang.String r1, defpackage.InterfaceC0646 r2) {
            r0 = this;
            r0.f4774 = r1
            r0.f4770 = r2
            r0.m3113()
            return
    }

    /* JADX INFO: renamed from: ᲀᲀᲇᛴ, reason: contains not printable characters */
    public final int m3120() {
            r0 = this;
            boolean r0 = r0.mo270()
            if (r0 == 0) goto La
            r0 = 1711669295(0x6606002f, float:1.5820012E23)
            return r0
        La:
            r0 = 1711669521(0x66060111, float:1.582042E23)
            return r0
    }

    /* JADX INFO: renamed from: ᲀᲈᛵᛳ, reason: contains not printable characters */
    public final void m3121() {
            r5 = this;
            android.widget.TextView r0 = r5.f7678
            if (r0 == 0) goto L55
            ᛲᛸᛳᛷ r0 = r5.f7673
            if (r0 != 0) goto L9
            goto L55
        L9:
            boolean r0 = r5.f7676
            r1 = 0
            if (r0 == 0) goto L22
            java.lang.String r0 = r5.f7684
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L22
            java.util.List r0 = r5.m3122()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = r1
        L23:
            android.widget.TextView r2 = r5.f7678
            java.lang.String r3 = r5.f7679
            r2.setText(r3)
            android.widget.TextView r2 = r5.f7678
            android.content.res.Resources r3 = r5.m263()
            int r4 = r5.m3120()
            int r3 = r3.getColor(r4)
            r2.setTextColor(r3)
            android.widget.TextView r2 = r5.f7678
            r3 = 0
            com.kongzue.dialogx.interfaces.AbstractC0008.m250(r2, r3)
            android.widget.TextView r2 = r5.f7678
            r3 = 8
            if (r0 == 0) goto L49
            r4 = r1
            goto L4a
        L49:
            r4 = r3
        L4a:
            r2.setVisibility(r4)
            ᛲᛸᛳᛷ r5 = r5.f7673
            if (r0 == 0) goto L52
            r1 = r3
        L52:
            r5.setVisibility(r1)
        L55:
            return
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0008
    /* JADX INFO: renamed from: ᲁᛱᛲᲈ */
    public final void mo269() {
            r4 = this;
            ᛳᛳᛴᛸ r0 = r4.f4767
            if (r0 == 0) goto L84
            android.view.ViewGroup r0 = r0.f2160
            if (r0 == 0) goto L84
            r1 = 0
            r0.setVisibility(r1)
            boolean r0 = super.m2036()
            if (r0 != 0) goto L19
            ᛳᛳᛴᛸ r0 = r4.f4767
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.f2157
            r0.getClass()
        L19:
            ᲈᛴᛵᲈ r0 = r4.f375
            r0.getClass()
            boolean r0 = r4.mo270()
            r2 = 1711800674(0x66080162, float:1.6056684E23)
            r3 = 1711800673(0x66080161, float:1.6056682E23)
            if (r0 == 0) goto L2b
            r2 = r3
        L2b:
            r4.mo270()
            boolean r0 = r4.mo270()
            if (r0 != 0) goto L40
            ᛲᛸᛳᛷ r0 = new ᛲᛸᛳᛷ
            android.app.Activity r3 = r4.m271()
            r0.<init>(r3, r1)
            r4.f7673 = r0
            goto L4b
        L40:
            ᛲᛸᛳᛷ r0 = new ᛲᛸᛳᛷ
            android.app.Activity r3 = r4.m271()
            r0.<init>(r3)
            r4.f7673 = r0
        L4b:
            java.lang.String r3 = "ScrollController"
            r0.setTag(r3)
            ᛲᛸᛳᛷ r0 = r4.f7673
            r3 = 2
            r0.setOverScrollMode(r3)
            ᛲᛸᛳᛷ r0 = r4.f7673
            android.content.res.Resources r3 = r4.m263()
            android.graphics.drawable.Drawable r2 = r3.getDrawable(r2)
            r0.setDivider(r2)
            ᛲᛸᛳᛷ r0 = r4.f7673
            r2 = 1
            r0.setDividerHeight(r2)
            ᛳᛳᛴᛸ r0 = r4.f4767
            ᛲᛸᛳᛷ r3 = r4.f7673
            r0.f2167 = r3
            ᲁᛶᲀᛶ r0 = new ᲁᛶᲀᛶ
            r0.<init>(r4, r1)
            r3.f1722 = r0
            ᛶᛷᛱᲇ r0 = new ᛶᛷᛱᲇ
            r0.<init>(r2, r4)
            r3.setOnItemClickListener(r0)
            r4.m3112()
            r4.mo2037()
        L84:
            return
    }

    /* JADX INFO: renamed from: ᲁᛸᛴᛶ, reason: contains not printable characters */
    public final java.util.List m3122() {
            r1 = this;
            boolean r0 = r1.f7676
            if (r0 == 0) goto L1d
            java.lang.String r0 = r1.f7684
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1d
            java.util.ArrayList r0 = r1.f7680
            if (r0 != 0) goto L13
            r1.m3117()
        L13:
            java.util.ArrayList r1 = r1.f7680
            if (r1 != 0) goto L1c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L1c:
            return r1
        L1d:
            java.util.ArrayList r1 = r1.f7670
            if (r1 != 0) goto L26
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L26:
            return r1
    }

    /* JADX INFO: renamed from: ᲁᲀᛴᛷ, reason: contains not printable characters */
    public final void m3123(java.lang.String r1) {
            r0 = this;
            r0.f4758 = r1
            r0.m3113()
            return
    }

    @Override // defpackage.C1069, com.kongzue.dialogx.interfaces.AbstractC0008
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final java.lang.String mo274() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class<ᲀᲀᛲᛴ> r1 = defpackage.C1732.class
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            int r2 = r2.hashCode()
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
