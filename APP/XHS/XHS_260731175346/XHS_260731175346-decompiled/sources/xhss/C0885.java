package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛸᛷᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0885 extends xhss.C0036 {

    /* JADX INFO: renamed from: ᛱᛱᛴᲀ, reason: contains not printable characters */
    public java.util.ArrayList f2844;

    /* JADX INFO: renamed from: ᛱᛲᛸᲇ, reason: contains not printable characters */
    public xhss.C0009 f2845;

    /* JADX INFO: renamed from: ᛱᲁᛳᛲ, reason: contains not printable characters */
    public java.util.HashMap f2846;

    /* JADX INFO: renamed from: ᛲᛵᲁᲁ, reason: contains not printable characters */
    public int[] f2847;

    /* JADX INFO: renamed from: ᛴᛴᛲᛸ, reason: contains not printable characters */
    public float f2848;

    /* JADX INFO: renamed from: ᛴᛷᛵᛴ, reason: contains not printable characters */
    public xhss.C0143 f2849;

    /* JADX INFO: renamed from: ᛴᲀᛸᛵ, reason: contains not printable characters */
    public int f2850;

    /* JADX INFO: renamed from: ᛴᲈᲀᲀ, reason: contains not printable characters */
    public android.widget.EditText f2851;

    /* JADX INFO: renamed from: ᛵᲈᛱᛳ, reason: contains not printable characters */
    public int f2852;

    /* JADX INFO: renamed from: ᛶᲀᛵᲇ, reason: contains not printable characters */
    public java.lang.String f2853;

    /* JADX INFO: renamed from: ᛷᛸᛷ, reason: contains not printable characters */
    public java.util.ArrayList f2854;

    /* JADX INFO: renamed from: ᛸᛴᛸᛲ, reason: contains not printable characters */
    public xhss.C0885 f2855;

    /* JADX INFO: renamed from: ᲁᛲᲈᛵ, reason: contains not printable characters */
    public java.lang.String f2856;

    /* JADX INFO: renamed from: ᲁᛷᲇᲇ, reason: contains not printable characters */
    public boolean f2857;

    /* JADX INFO: renamed from: ᲇᛸᛶ, reason: contains not printable characters */
    public java.lang.CharSequence[] f2858;

    /* JADX INFO: renamed from: ᲈᛱᛷᛵ, reason: contains not printable characters */
    public long f2859;

    /* JADX INFO: renamed from: ᛴᛴᛲᛸ, reason: contains not printable characters */
    public static xhss.C0885 m1445(android.content.Context r3) {
            xhss.ᲀᛸᛷᛱ r0 = new xhss.ᲀᛸᛷᛱ
            r0.<init>()
            r1 = 1
            r0.f234 = r1
            r0.f225 = r0
            int r2 = xhss.AbstractC1069.f3454
            float r2 = (float) r2
            r0.f230 = r2
            r0.f2855 = r0
            r0.f2857 = r1
            r2 = -1
            r0.f2850 = r2
            r0.f2852 = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f2846 = r1
            java.lang.String r1 = "Search"
            r0.f2853 = r1
            java.lang.String r1 = ""
            r0.f2856 = r1
            r1 = 0
            r0.f2859 = r1
            r0.f87 = r3
            return r0
    }

    @Override // xhss.C0036
    /* JADX INFO: renamed from: ᛱᛱᛴᲀ */
    public final xhss.C0935 mo144() {
            r0 = this;
            xhss.ᲁᛳᛵᛷ r0 = r0.f226
            return r0
    }

    /* JADX INFO: renamed from: ᛱᛱᲈᲀ, reason: contains not printable characters */
    public final void m1446(int[] r5) {
            r4 = this;
            r0 = 3
            r4.f2852 = r0
            r0 = -1
            r4.f2850 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f2844 = r0
            int r0 = r5.length
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1f
            r2 = r5[r1]
            java.util.ArrayList r3 = r4.f2844
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.add(r2)
            int r1 = r1 + 1
            goto Lf
        L1f:
            r5 = 0
            r4.f2849 = r5
            r4.m1447()
            return
    }

    @Override // xhss.C0036
    /* JADX INFO: renamed from: ᛱᛲᛸᲇ */
    public final boolean mo145() {
            r1 = this;
            android.widget.EditText r0 = r1.f2851
            if (r0 == 0) goto Lf
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto Lf
            r1.m1450()
            r1 = 1
            return r1
        Lf:
            r1 = 0
            return r1
    }

    @Override // xhss.C0036
    /* JADX INFO: renamed from: ᛱᲁᛳᛲ */
    public final boolean mo146() {
            r0 = this;
            boolean r0 = r0.f86
            return r0
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0001
    /* JADX INFO: renamed from: ᛲᛴᲇᛲ */
    public final void mo51() {
            r5 = this;
            xhss.ᲁᛳᛵᛷ r0 = r5.f226
            if (r0 == 0) goto Lb3
            android.view.ViewGroup r0 = r0.f3033
            if (r0 == 0) goto Lb3
            r1 = 0
            r0.setVisibility(r1)
            xhss.ᛶᛵᲇᛸ r0 = r5.f95
            r0.getClass()
            boolean r0 = r5.f2857
            if (r0 != 0) goto L1c
            xhss.ᲁᛳᛵᛷ r0 = r5.f226
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = r0.f3023
            r0.getClass()
        L1c:
            boolean r0 = r5.mo50()
            r2 = 1678180544(0x640700c0, float:9.961458E21)
            r3 = 1678180543(0x640700bf, float:9.961457E21)
            if (r0 == 0) goto L29
            r2 = r3
        L29:
            r5.mo50()
            boolean r0 = r5.mo50()
            if (r0 != 0) goto L4b
            xhss.ᛱᛱᲀᛱ r0 = new xhss.ᛱᛱᲀᛱ
            android.app.Activity r3 = r5.m54()
            xhss.ᛸᛱᲁᛸ r4 = new xhss.ᛸᛱᲁᛸ
            r4.<init>(r3)
            r3 = 1678639265(0x640e00a1, float:1.0477932E22)
            r4.f2457 = r3
            r0.<init>(r4)
            r0.setVerticalScrollBarEnabled(r1)
            r5.f2845 = r0
            goto L59
        L4b:
            xhss.ᛱᛱᲀᛱ r0 = new xhss.ᛱᛱᲀᛱ
            android.app.Activity r3 = r5.m54()
            r0.<init>(r3)
            r0.setVerticalScrollBarEnabled(r1)
            r5.f2845 = r0
        L59:
            r3 = 2
            r0.setOverScrollMode(r3)
            xhss.ᛱᛱᲀᛱ r0 = r5.f2845
            android.content.res.Resources r3 = r5.m58()
            android.graphics.drawable.Drawable r2 = r3.getDrawable(r2)
            r0.setDivider(r2)
            xhss.ᛱᛱᲀᛱ r0 = r5.f2845
            r2 = 1
            r0.setDividerHeight(r2)
            xhss.ᛱᛱᲀᛱ r0 = r5.f2845
            xhss.ᛵᛷᛵᛱ r2 = new xhss.ᛵᛷᛵᛱ
            r2.<init>(r5)
            r0.f152 = r2
            xhss.ᛷᛵᛲᲈ r2 = new xhss.ᛷᛵᛲᲈ
            r2.<init>(r5)
            r0.setOnItemClickListener(r2)
            xhss.ᲁᛳᛵᛷ r0 = r5.f226
            if (r0 == 0) goto Lb0
            android.view.ViewGroup r0 = r0.f3033
            if (r0 == 0) goto Lb0
            xhss.ᛱᛱᲀᛱ r2 = r5.f2845
            if (r2 != 0) goto L8e
            goto Lb0
        L8e:
            r0.removeAllViews()
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r3 = -2
            r0.<init>(r2, r3)
            android.widget.EditText r2 = r5.f2851
            if (r2 == 0) goto L9f
            r5.m1450()
        L9f:
            xhss.ᛱᛱᲀᛱ r2 = r5.f2845
            r2.setVisibility(r1)
            r1 = 0
            r5.f2851 = r1
            xhss.ᲁᛳᛵᛷ r1 = r5.f226
            android.view.ViewGroup r1 = r1.f3033
            xhss.ᛱᛱᲀᛱ r2 = r5.f2845
            r1.addView(r2, r0)
        Lb0:
            r5.mo148()
        Lb3:
            return
    }

    /* JADX INFO: renamed from: ᛲᛵᲁᲁ, reason: contains not printable characters */
    public final void m1447() {
            r2 = this;
            xhss.ᲁᛳᛵᛷ r0 = r2.f226
            if (r0 != 0) goto L5
            return
        L5:
            xhss.ᛴᲈᲀᲇ r0 = new xhss.ᛴᲈᲀᲇ
            r1 = 4
            r0.<init>(r1, r2)
            com.kongzue.dialogx.interfaces.AbstractC0001.m43(r0)
            return
    }

    @Override // xhss.C0036
    /* JADX INFO: renamed from: ᛴᛷᛵᛴ */
    public final xhss.C0036 mo147(java.lang.CharSequence r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    @Override // xhss.C0036
    /* JADX INFO: renamed from: ᛴᲈᲀᲀ */
    public final void mo148() {
            r4 = this;
            xhss.ᲁᛳᛵᛷ r0 = r4.f226
            if (r0 != 0) goto L5
            return
        L5:
            xhss.ᛱᛱᲀᛱ r0 = r4.f2845
            if (r0 == 0) goto L56
            xhss.ᛲᛳᛴᛳ r0 = r4.f2849
            if (r0 != 0) goto L2a
            xhss.ᛲᛳᛴᛳ r0 = new xhss.ᛲᛳᛴᛳ
            xhss.ᲀᛸᛷᛱ r1 = r4.f2855
            android.app.Activity r2 = r4.m54()
            java.util.ArrayList r3 = r4.f2854
            if (r3 != 0) goto L1e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L1e:
            r0.<init>()
            r0.f612 = r3
            r0.f613 = r2
            r0.f614 = r1
            r4.f2849 = r0
            goto L35
        L2a:
            java.util.ArrayList r1 = r4.f2854
            if (r1 != 0) goto L33
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L33:
            r0.f612 = r1
        L35:
            xhss.ᛱᛱᲀᛱ r0 = r4.f2845
            android.widget.ListAdapter r0 = r0.getAdapter()
            xhss.ᛱᛱᲀᛱ r1 = r4.f2845
            if (r0 != 0) goto L45
            xhss.ᛲᛳᛴᛳ r0 = r4.f2849
            r1.setAdapter(r0)
            goto L56
        L45:
            android.widget.ListAdapter r0 = r1.getAdapter()
            xhss.ᛲᛳᛴᛳ r1 = r4.f2849
            if (r0 == r1) goto L53
            xhss.ᛱᛱᲀᛱ r0 = r4.f2845
            r0.setAdapter(r1)
            goto L56
        L53:
            r1.notifyDataSetChanged()
        L56:
            android.widget.EditText r0 = r4.f2851
            if (r0 != 0) goto L5c
            goto Lf2
        L5c:
            java.lang.String r1 = r4.f2853
            r0.setHint(r1)
            android.widget.EditText r0 = r4.f2851
            boolean r1 = r4.mo50()
            if (r1 == 0) goto L6d
            r1 = 1678180541(0x640700bd, float:9.961455E21)
            goto L70
        L6d:
            r1 = 1678180542(0x640700be, float:9.961456E21)
        L70:
            r0.setBackgroundResource(r1)
            android.widget.EditText r0 = r4.f2851
            android.content.res.Resources r1 = r4.m58()
            r4.mo50()
            xhss.ᛶᛵᲇᛸ r2 = r4.f95
            r2.getClass()
            r4.mo50()
            boolean r2 = r4.mo50()
            if (r2 == 0) goto L8e
            r2 = 1678049325(0x6405002d, float:9.813719E21)
            goto L91
        L8e:
            r2 = 1678049428(0x64050094, float:9.813834E21)
        L91:
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            android.widget.EditText r0 = r4.f2851
            android.content.res.Resources r1 = r4.m58()
            boolean r2 = r4.mo50()
            if (r2 == 0) goto La8
            r2 = 1678049318(0x64050026, float:9.813711E21)
            goto Lab
        La8:
            r2 = 1678049421(0x6405008d, float:9.813827E21)
        Lab:
            int r1 = r1.getColor(r2)
            r0.setHintTextColor(r1)
            android.widget.EditText r0 = r4.f2851
            r1 = 0
            com.kongzue.dialogx.interfaces.AbstractC0001.m45(r0, r1)
            android.widget.EditText r0 = r4.f2851
            r1 = 1
            r0.setSingleLine(r1)
            android.widget.EditText r0 = r4.f2851
            r0.setMaxLines(r1)
            r4.m1449()
            android.widget.EditText r0 = r4.f2851
            android.text.Editable r0 = r0.getText()
            java.lang.String r1 = r4.f2856
            if (r1 != 0) goto Ld3
            java.lang.String r1 = ""
            goto Ld7
        Ld3:
            java.lang.String r1 = r1.toString()
        Ld7:
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto Lf2
            android.widget.EditText r0 = r4.f2851
            r0.setText(r1)
            android.widget.EditText r0 = r4.f2851
            android.text.Editable r1 = r0.getText()
            int r1 = r1.length()
            r0.setSelection(r1)
            r4.m1449()
        Lf2:
            super.mo148()
            return
    }

    /* JADX INFO: renamed from: ᛵᲈᛱᛳ, reason: contains not printable characters */
    public final void m1448() {
            r1 = this;
            r0 = 3
            r1.f2852 = r0
            r0 = -1
            r1.f2850 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f2844 = r0
            r0 = 0
            r1.f2849 = r0
            r1.m1447()
            return
    }

    @Override // xhss.C0036, com.kongzue.dialogx.interfaces.AbstractC0001
    /* JADX INFO: renamed from: ᛷᛴᛷᛱ */
    public final java.lang.String mo56() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class<xhss.ᲀᛸᛷᛱ> r1 = xhss.C0885.class
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

    @Override // xhss.C0036
    /* JADX INFO: renamed from: ᛷᛸᛷ */
    public final xhss.C0036 mo150(java.lang.CharSequence r1, xhss.InterfaceC0826 r2) {
            r0 = this;
            r0 = 0
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛸᛶ, reason: contains not printable characters */
    public final void m1449() {
            r9 = this;
            android.widget.EditText r0 = r9.f2851
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 1678180492(0x6407008c, float:9.961399E21)
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r0 = xhss.C0915.m1498(r0, r1)
            r1 = 1678049421(0x6405008d, float:9.813827E21)
            r2 = 1678049318(0x64050026, float:9.813711E21)
            r3 = 1099956224(0x41900000, float:18.0)
            r4 = 0
            if (r0 == 0) goto L42
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.content.res.Resources r5 = r9.m58()
            boolean r6 = r9.mo50()
            if (r6 == 0) goto L2b
            r6 = r2
            goto L2c
        L2b:
            r6 = r1
        L2c:
            int r5 = r5.getColor(r6)
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
            r0.setTintList(r5)
            int r5 = r9.m64(r3)
            int r6 = r9.m64(r3)
            r0.setBounds(r4, r4, r5, r6)
        L42:
            android.widget.EditText r5 = r9.f2851
            android.text.Editable r5 = r5.getText()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r6 = 0
            if (r5 != 0) goto L84
            android.widget.EditText r5 = r9.f2851
            android.content.Context r5 = r5.getContext()
            r7 = 1678180491(0x6407008b, float:9.961398E21)
            android.graphics.drawable.Drawable r5 = xhss.C0915.m1498(r5, r7)
            if (r5 == 0) goto L85
            android.graphics.drawable.Drawable r5 = r5.mutate()
            android.content.res.Resources r7 = r9.m58()
            boolean r8 = r9.mo50()
            if (r8 == 0) goto L6d
            r1 = r2
        L6d:
            int r1 = r7.getColor(r1)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r5.setTintList(r1)
            int r1 = r9.m64(r3)
            int r2 = r9.m64(r3)
            r5.setBounds(r4, r4, r1, r2)
            goto L85
        L84:
            r5 = r6
        L85:
            android.widget.EditText r9 = r9.f2851
            r9.setCompoundDrawables(r0, r6, r5, r6)
            return
    }

    /* JADX INFO: renamed from: ᲈᛱᛷᛵ, reason: contains not printable characters */
    public final void m1450() {
            r1 = this;
            android.widget.EditText r0 = r1.f2851
            if (r0 != 0) goto L5
            goto L18
        L5:
            r1.m62(r0)
            android.widget.EditText r0 = r1.f2851
            r0.clearFocus()
            xhss.ᲁᛳᛵᛷ r1 = r1.f226
            if (r1 == 0) goto L18
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r1 = r1.f3022
            if (r1 == 0) goto L18
            r1.requestFocus()
        L18:
            return
    }
}
