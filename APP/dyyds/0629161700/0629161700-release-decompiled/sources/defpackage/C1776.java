package defpackage;

/* JADX INFO: renamed from: ᲀᲇᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1776 extends defpackage.C0185 {

    /* JADX INFO: renamed from: ᛲᛵᲁᛲ, reason: contains not printable characters */
    public defpackage.C0334 f7841;

    /* JADX INFO: renamed from: ᛲᛶᛷᛲ, reason: contains not printable characters */
    public android.widget.EditText f7842;

    /* JADX INFO: renamed from: ᛲᲈᛶᲇ, reason: contains not printable characters */
    public float f7843;

    /* JADX INFO: renamed from: ᛲᲈᛸᛲ, reason: contains not printable characters */
    public java.lang.CharSequence[] f7844;

    /* JADX INFO: renamed from: ᛴᛴᛲᲈ, reason: contains not printable characters */
    public defpackage.C1776 f7845;

    /* JADX INFO: renamed from: ᛴᛴᲈᛵ, reason: contains not printable characters */
    public java.util.List f7846;

    /* JADX INFO: renamed from: ᛴᛶᛸᲈ, reason: contains not printable characters */
    public java.util.HashMap f7847;

    /* JADX INFO: renamed from: ᛵᛵᲀᛲ, reason: contains not printable characters */
    public int f7848;

    /* JADX INFO: renamed from: ᛷᛲᛶᲀ, reason: contains not printable characters */
    public long f7849;

    /* JADX INFO: renamed from: ᛷᛴᲈ, reason: contains not printable characters */
    public boolean f7850;

    /* JADX INFO: renamed from: ᛷᛷᛱᲁ, reason: contains not printable characters */
    public int f7851;

    /* JADX INFO: renamed from: ᲀᛷᛲᛴ, reason: contains not printable characters */
    public defpackage.C2146 f7852;

    /* JADX INFO: renamed from: ᲀᲀᛲᛸ, reason: contains not printable characters */
    public java.util.ArrayList f7853;

    /* JADX INFO: renamed from: ᲀᲀᲇᛴ, reason: contains not printable characters */
    public java.lang.String f7854;

    /* JADX INFO: renamed from: ᲀᲈᛵᛳ, reason: contains not printable characters */
    public int[] f7855;

    /* JADX INFO: renamed from: ᲁᛸᛴᛶ, reason: contains not printable characters */
    public java.lang.String f7856;

    /* JADX INFO: renamed from: ᛵᛵᲀᛲ, reason: contains not printable characters */
    public static defpackage.C1776 m3171() {
            ᲀᲇᲈᛳ r0 = new ᲀᲇᲈᛳ
            r0.<init>()
            r0.f7845 = r0
            r1 = 1
            r0.f7850 = r1
            r2 = -1
            r0.f7848 = r2
            r0.f7851 = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.f7847 = r1
            java.lang.String r1 = "Search"
            r0.f7856 = r1
            java.lang.String r1 = ""
            r0.f7854 = r1
            r1 = 0
            r0.f7849 = r1
            return r0
    }

    @Override // defpackage.C0185
    /* JADX INFO: renamed from: ᛱᛳᛷ */
    public final void mo723() {
            r5 = this;
            ᛷᛷᛸᛱ r0 = r5.f1241
            if (r0 != 0) goto L5
            return
        L5:
            ᛲᛸᛳᛷ r0 = r5.f7841
            r1 = 1
            if (r0 == 0) goto L57
            ᲇᲇᛶᲁ r0 = r5.f7852
            if (r0 != 0) goto L2b
            ᲇᲇᛶᲁ r0 = new ᲇᲇᛶᲁ
            ᲀᲇᲈᛳ r2 = r5.f7845
            android.app.Activity r3 = r5.m271()
            java.util.List r4 = r5.f7846
            if (r4 != 0) goto L1f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L1f:
            r0.<init>(r1)
            r0.f9120 = r4
            r0.f9123 = r3
            r0.f9122 = r2
            r5.f7852 = r0
            goto L36
        L2b:
            java.util.List r2 = r5.f7846
            if (r2 != 0) goto L34
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L34:
            r0.f9120 = r2
        L36:
            ᛲᛸᛳᛷ r0 = r5.f7841
            android.widget.ListAdapter r0 = r0.getAdapter()
            ᛲᛸᛳᛷ r2 = r5.f7841
            if (r0 != 0) goto L46
            ᲇᲇᛶᲁ r0 = r5.f7852
            r2.setAdapter(r0)
            goto L57
        L46:
            android.widget.ListAdapter r0 = r2.getAdapter()
            ᲇᲇᛶᲁ r2 = r5.f7852
            if (r0 == r2) goto L54
            ᛲᛸᛳᛷ r0 = r5.f7841
            r0.setAdapter(r2)
            goto L57
        L54:
            r2.notifyDataSetChanged()
        L57:
            android.widget.EditText r0 = r5.f7842
            if (r0 != 0) goto L5d
            goto Lf2
        L5d:
            java.lang.String r2 = r5.f7856
            r0.setHint(r2)
            android.widget.EditText r0 = r5.f7842
            boolean r2 = r5.mo270()
            if (r2 == 0) goto L6e
            r2 = 1711800671(0x6608015f, float:1.6056678E23)
            goto L71
        L6e:
            r2 = 1711800672(0x66080160, float:1.605668E23)
        L71:
            r0.setBackgroundResource(r2)
            android.widget.EditText r0 = r5.f7842
            android.content.res.Resources r2 = r5.m263()
            r5.mo270()
            ᲈᛴᛵᲈ r3 = r5.f375
            r3.getClass()
            r5.mo270()
            boolean r3 = r5.mo270()
            if (r3 == 0) goto L8f
            r3 = 1711669302(0x66060036, float:1.5820025E23)
            goto L92
        L8f:
            r3 = 1711669528(0x66060118, float:1.5820432E23)
        L92:
            int r2 = r2.getColor(r3)
            r0.setTextColor(r2)
            android.widget.EditText r0 = r5.f7842
            android.content.res.Resources r2 = r5.m263()
            boolean r3 = r5.mo270()
            if (r3 == 0) goto La9
            r3 = 1711669295(0x6606002f, float:1.5820012E23)
            goto Lac
        La9:
            r3 = 1711669521(0x66060111, float:1.582042E23)
        Lac:
            int r2 = r2.getColor(r3)
            r0.setHintTextColor(r2)
            android.widget.EditText r0 = r5.f7842
            r2 = 0
            com.kongzue.dialogx.interfaces.AbstractC0008.m250(r0, r2)
            android.widget.EditText r0 = r5.f7842
            r0.setSingleLine(r1)
            android.widget.EditText r0 = r5.f7842
            r0.setMaxLines(r1)
            r5.m3172()
            android.widget.EditText r0 = r5.f7842
            android.text.Editable r0 = r0.getText()
            java.lang.String r1 = r5.f7854
            if (r1 != 0) goto Ld3
            java.lang.String r1 = ""
            goto Ld7
        Ld3:
            java.lang.String r1 = r1.toString()
        Ld7:
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto Lf2
            android.widget.EditText r0 = r5.f7842
            r0.setText(r1)
            android.widget.EditText r0 = r5.f7842
            android.text.Editable r1 = r0.getText()
            int r1 = r1.length()
            r0.setSelection(r1)
            r5.m3172()
        Lf2:
            super.mo723()
            return
    }

    /* JADX INFO: renamed from: ᛲᛵᲁᛲ, reason: contains not printable characters */
    public final void m3172() {
            r9 = this;
            android.widget.EditText r0 = r9.f7842
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 1711800590(0x6608010e, float:1.6056532E23)
            android.content.Context r0 = r0.getContext()
            android.graphics.drawable.Drawable r0 = defpackage.AbstractC1592.m2873(r0, r1)
            r1 = 1711669521(0x66060111, float:1.582042E23)
            r2 = 1711669295(0x6606002f, float:1.5820012E23)
            r3 = 1099956224(0x41900000, float:18.0)
            r4 = 0
            if (r0 == 0) goto L42
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.content.res.Resources r5 = r9.m263()
            boolean r6 = r9.mo270()
            if (r6 == 0) goto L2b
            r6 = r2
            goto L2c
        L2b:
            r6 = r1
        L2c:
            int r5 = r5.getColor(r6)
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
            r0.setTintList(r5)
            int r5 = r9.m258(r3)
            int r6 = r9.m258(r3)
            r0.setBounds(r4, r4, r5, r6)
        L42:
            android.widget.EditText r5 = r9.f7842
            android.text.Editable r5 = r5.getText()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r6 = 0
            if (r5 != 0) goto L84
            android.widget.EditText r5 = r9.f7842
            android.content.Context r5 = r5.getContext()
            r7 = 1711800589(0x6608010d, float:1.605653E23)
            android.graphics.drawable.Drawable r5 = defpackage.AbstractC1592.m2873(r5, r7)
            if (r5 == 0) goto L85
            android.graphics.drawable.Drawable r5 = r5.mutate()
            android.content.res.Resources r7 = r9.m263()
            boolean r8 = r9.mo270()
            if (r8 == 0) goto L6d
            r1 = r2
        L6d:
            int r1 = r7.getColor(r1)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r5.setTintList(r1)
            int r1 = r9.m258(r3)
            int r2 = r9.m258(r3)
            r5.setBounds(r4, r4, r1, r2)
            goto L85
        L84:
            r5 = r6
        L85:
            android.widget.EditText r9 = r9.f7842
            r9.setCompoundDrawables(r0, r6, r5, r6)
            return
    }

    /* JADX INFO: renamed from: ᛲᛶᛷᛲ, reason: contains not printable characters */
    public final void m3173(java.util.List r1) {
            r0 = this;
            r0.f7846 = r1
            r1 = 0
            r0.f7852 = r1
            r0.m3175()
            return
    }

    /* JADX INFO: renamed from: ᛴᛴᲈᛵ, reason: contains not printable characters */
    public final void m3174(java.util.ArrayList r2) {
            r1 = this;
            r0 = 3
            r1.f7851 = r0
            r0 = -1
            r1.f7848 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.f7853 = r0
            r2 = 0
            r1.f7852 = r2
            r1.m3175()
            return
    }

    /* JADX INFO: renamed from: ᛴᛶᛸᲈ, reason: contains not printable characters */
    public final void m3175() {
            r2 = this;
            ᛷᛷᛸᛱ r0 = r2.f1241
            if (r0 != 0) goto L5
            return
        L5:
            ᛳᛳᛵᛲ r0 = new ᛳᛳᛵᛲ
            r1 = 13
            r0.<init>(r1, r2)
            com.kongzue.dialogx.interfaces.AbstractC0008.m257(r0)
            return
    }

    @Override // defpackage.C0185
    /* JADX INFO: renamed from: ᛷᛲᲁᛳ */
    public final boolean mo725() {
            r1 = this;
            android.widget.EditText r0 = r1.f7842
            if (r0 == 0) goto Lf
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto Lf
            r1.m3177()
            r1 = 1
            return r1
        Lf:
            r1 = 0
            return r1
    }

    @Override // defpackage.C0185
    /* JADX INFO: renamed from: ᛸᛱᲈᛳ */
    public final boolean mo727() {
            r1 = this;
            int r0 = r1.f1234
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

    /* JADX INFO: renamed from: ᲀᛷᛲᛴ, reason: contains not printable characters */
    public final void m3176() {
            r1 = this;
            r0 = 3
            r1.f7851 = r0
            r0 = -1
            r1.f7848 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f7853 = r0
            r0 = 0
            r1.f7852 = r0
            r1.m3175()
            return
    }

    /* JADX INFO: renamed from: ᲀᲀᛲᛸ, reason: contains not printable characters */
    public final void m3177() {
            r2 = this;
            android.widget.EditText r0 = r2.f7842
            if (r0 != 0) goto L5
            goto L1b
        L5:
            r1 = 0
            r2.m268(r0, r1)
            android.widget.EditText r0 = r2.f7842
            r0.clearFocus()
            ᛷᛷᛸᛱ r2 = r2.f1241
            if (r2 == 0) goto L1b
            android.view.View r2 = r2.f5814
            com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout r2 = (com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout) r2
            if (r2 == 0) goto L1b
            r2.requestFocus()
        L1b:
            return
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0008
    /* JADX INFO: renamed from: ᲁᛱᛲᲈ */
    public final void mo269() {
            r5 = this;
            ᛷᛷᛸᛱ r0 = r5.f1241
            if (r0 == 0) goto Lab
            android.view.View r0 = r0.f5818
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto Lab
            r1 = 0
            r0.setVisibility(r1)
            ᲈᛴᛵᲈ r0 = r5.f375
            r0.getClass()
            boolean r0 = r5.f7850
            if (r0 != 0) goto L20
            ᛷᛷᛸᛱ r0 = r5.f1241
            android.view.View r0 = r0.f5822
            com.kongzue.dialogx.util.views.MaxRelativeLayout r0 = (com.kongzue.dialogx.util.views.MaxRelativeLayout) r0
            r0.getClass()
        L20:
            boolean r0 = r5.mo270()
            r2 = 1711800674(0x66080162, float:1.6056684E23)
            r3 = 1711800673(0x66080161, float:1.6056682E23)
            if (r0 == 0) goto L2d
            r2 = r3
        L2d:
            r5.mo270()
            boolean r0 = r5.mo270()
            if (r0 != 0) goto L42
            ᛲᛸᛳᛷ r0 = new ᛲᛸᛳᛷ
            android.app.Activity r3 = r5.m271()
            r0.<init>(r3, r1)
            r5.f7841 = r0
            goto L4d
        L42:
            ᛲᛸᛳᛷ r0 = new ᛲᛸᛳᛷ
            android.app.Activity r3 = r5.m271()
            r0.<init>(r3)
            r5.f7841 = r0
        L4d:
            r3 = 2
            r0.setOverScrollMode(r3)
            ᛲᛸᛳᛷ r0 = r5.f7841
            android.content.res.Resources r4 = r5.m263()
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r2)
            r0.setDivider(r2)
            ᛲᛸᛳᛷ r0 = r5.f7841
            r2 = 1
            r0.setDividerHeight(r2)
            ᛲᛸᛳᛷ r0 = r5.f7841
            ᲁᛶᲀᛶ r4 = new ᲁᛶᲀᛶ
            r4.<init>(r5, r2)
            r0.f1722 = r4
            ᛶᛷᛱᲇ r2 = new ᛶᛷᛱᲇ
            r2.<init>(r3, r5)
            r0.setOnItemClickListener(r2)
            ᛷᛷᛸᛱ r0 = r5.f1241
            if (r0 == 0) goto La8
            android.view.View r0 = r0.f5818
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto La8
            ᛲᛸᛳᛷ r2 = r5.f7841
            if (r2 != 0) goto L84
            goto La8
        L84:
            r0.removeAllViews()
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r3 = -2
            r0.<init>(r2, r3)
            android.widget.EditText r2 = r5.f7842
            if (r2 == 0) goto L95
            r5.m3177()
        L95:
            ᛲᛸᛳᛷ r2 = r5.f7841
            r2.setVisibility(r1)
            r1 = 0
            r5.f7842 = r1
            ᛷᛷᛸᛱ r1 = r5.f1241
            android.view.View r1 = r1.f5818
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            ᛲᛸᛳᛷ r2 = r5.f7841
            r1.addView(r2, r0)
        La8:
            r5.mo723()
        Lab:
            return
    }

    @Override // defpackage.C0185
    /* JADX INFO: renamed from: ᲇᛶᛱᛱ */
    public final defpackage.C1315 mo728() {
            r0 = this;
            ᛷᛷᛸᛱ r0 = r0.f1241
            return r0
    }

    @Override // defpackage.C0185, com.kongzue.dialogx.interfaces.AbstractC0008
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final java.lang.String mo274() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class<ᲀᲇᲈᛳ> r1 = defpackage.C1776.class
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
