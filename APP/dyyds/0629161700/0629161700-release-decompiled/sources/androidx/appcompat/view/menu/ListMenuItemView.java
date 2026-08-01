package androidx.appcompat.view.menu;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends android.widget.LinearLayout implements defpackage.InterfaceC1637, android.widget.AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public android.widget.TextView f29;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public android.widget.LinearLayout f30;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final android.graphics.drawable.Drawable f31;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public android.widget.ImageView f32;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public boolean f33;

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public boolean f34;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public android.widget.RadioButton f35;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final int f36;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public android.widget.ImageView f37;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.C0254 f38;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public android.widget.ImageView f39;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final android.content.Context f40;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public final boolean f41;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public android.view.LayoutInflater f42;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public android.widget.TextView f43;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final android.graphics.drawable.Drawable f44;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public android.widget.CheckBox f45;

    public ListMenuItemView(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r4.<init>(r5, r6)
            android.content.Context r0 = r4.getContext()
            int[] r1 = defpackage.AbstractC1070.f4799
            r2 = 1711538671(0x660401ef, float:1.5584701E23)
            ᛷᛸᛱᛸ r6 = defpackage.C1326.m2454(r0, r6, r1, r2)
            r0 = 5
            android.graphics.drawable.Drawable r0 = r6.m2470(r0)
            r4.f31 = r0
            java.lang.Object r0 = r6.f5856
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            r1 = 1
            r2 = -1
            int r1 = r0.getResourceId(r1, r2)
            r4.f36 = r1
            r1 = 7
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            r4.f33 = r0
            r4.f40 = r5
            r0 = 8
            android.graphics.drawable.Drawable r0 = r6.m2470(r0)
            r4.f44 = r0
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r0 = 16843049(0x1010129, float:2.369439E-38)
            int[] r0 = new int[]{r0}
            r1 = 1711538454(0x66040116, float:1.558431E23)
            r3 = 0
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r3, r0, r1, r2)
            boolean r0 = r5.hasValue(r2)
            r4.f41 = r0
            r6.m2469()
            r5.recycle()
            return
    }

    private android.view.LayoutInflater getInflater() {
            r1 = this;
            android.view.LayoutInflater r0 = r1.f42
            if (r0 != 0) goto Le
            android.content.Context r0 = r1.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1.f42 = r0
        Le:
            return r0
    }

    private void setSubMenuArrowVisible(boolean r1) {
            r0 = this;
            android.widget.ImageView r0 = r0.f32
            if (r0 == 0) goto Ld
            if (r1 == 0) goto L8
            r1 = 0
            goto La
        L8:
            r1 = 8
        La:
            r0.setVisibility(r1)
        Ld:
            return
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(android.graphics.Rect r4) {
            r3 = this;
            android.widget.ImageView r0 = r3.f39
            if (r0 == 0) goto L23
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L23
            android.widget.ImageView r0 = r3.f39
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r4.top
            android.widget.ImageView r3 = r3.f39
            int r3 = r3.getHeight()
            int r2 = r0.topMargin
            int r3 = r3 + r2
            int r0 = r0.bottomMargin
            int r3 = r3 + r0
            int r3 = r3 + r1
            r4.top = r3
        L23:
            return
    }

    @Override // defpackage.InterfaceC1637
    public defpackage.C0254 getItemData() {
            r0 = this;
            ᛲᛲᛶᲁ r0 = r0.f38
            return r0
    }

    @Override // android.view.View
    public final void onFinishInflate() {
            r3 = this;
            super.onFinishInflate()
            java.util.WeakHashMap r0 = defpackage.AbstractC0858.f3911
            android.graphics.drawable.Drawable r0 = r3.f31
            r3.setBackground(r0)
            r0 = 1711866898(0x66090412, float:1.6175982E23)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.f43 = r0
            r1 = -1
            int r2 = r3.f36
            if (r2 == r1) goto L1f
            android.content.Context r1 = r3.f40
            r0.setTextAppearance(r1, r2)
        L1f:
            r0 = 1711866768(0x66090390, float:1.6175748E23)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.f29 = r0
            r0 = 1711866831(0x660903cf, float:1.6175862E23)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.f32 = r0
            if (r0 == 0) goto L3c
            android.graphics.drawable.Drawable r1 = r3.f44
            r0.setImageDrawable(r1)
        L3c:
            r0 = 1711866351(0x660901ef, float:1.6174997E23)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.f39 = r0
            r0 = 1711866179(0x66090143, float:1.6174687E23)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.f30 = r0
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r4, int r5) {
            r3 = this;
            android.widget.ImageView r0 = r3.f37
            if (r0 == 0) goto L1e
            boolean r0 = r3.f33
            if (r0 == 0) goto L1e
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            android.widget.ImageView r1 = r3.f37
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            int r0 = r0.height
            if (r0 <= 0) goto L1e
            int r2 = r1.width
            if (r2 > 0) goto L1e
            r1.width = r0
        L1e:
            super.onMeasure(r4, r5)
            return
    }

    public void setCheckable(boolean r6) {
            r5 = this;
            if (r6 != 0) goto Lc
            android.widget.RadioButton r0 = r5.f35
            if (r0 != 0) goto Lc
            android.widget.CheckBox r0 = r5.f45
            if (r0 != 0) goto Lc
            goto L8b
        Lc:
            ᛲᛲᛶᲁ r0 = r5.f38
            int r0 = r0.f1503
            r0 = r0 & 4
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L3a
            android.widget.RadioButton r0 = r5.f35
            if (r0 != 0) goto L34
            android.view.LayoutInflater r0 = r5.getInflater()
            r3 = 1712062481(0x660c0011, float:1.6528313E23)
            android.view.View r0 = r0.inflate(r3, r5, r2)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r5.f35 = r0
            android.widget.LinearLayout r3 = r5.f30
            if (r3 == 0) goto L31
            r3.addView(r0, r1)
            goto L34
        L31:
            r5.addView(r0, r1)
        L34:
            android.widget.RadioButton r0 = r5.f35
            android.widget.CheckBox r1 = r5.f45
            r3 = r1
            goto L5d
        L3a:
            android.widget.CheckBox r0 = r5.f45
            if (r0 != 0) goto L58
            android.view.LayoutInflater r0 = r5.getInflater()
            r3 = 1712062478(0x660c000e, float:1.6528308E23)
            android.view.View r0 = r0.inflate(r3, r5, r2)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r5.f45 = r0
            android.widget.LinearLayout r3 = r5.f30
            if (r3 == 0) goto L55
            r3.addView(r0, r1)
            goto L58
        L55:
            r5.addView(r0, r1)
        L58:
            android.widget.CheckBox r0 = r5.f45
            android.widget.RadioButton r1 = r5.f35
            r3 = r0
        L5d:
            r4 = 8
            if (r6 == 0) goto L7f
            ᛲᛲᛶᲁ r5 = r5.f38
            boolean r5 = r5.isChecked()
            r0.setChecked(r5)
            int r5 = r0.getVisibility()
            if (r5 == 0) goto L73
            r0.setVisibility(r2)
        L73:
            if (r1 == 0) goto L8b
            int r5 = r1.getVisibility()
            if (r5 == r4) goto L8b
            r1.setVisibility(r4)
            return
        L7f:
            if (r3 == 0) goto L84
            r3.setVisibility(r4)
        L84:
            android.widget.RadioButton r5 = r5.f35
            if (r5 == 0) goto L8b
            r5.setVisibility(r4)
        L8b:
            return
    }

    public void setChecked(boolean r5) {
            r4 = this;
            ᛲᛲᛶᲁ r0 = r4.f38
            int r0 = r0.f1503
            r0 = r0 & 4
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L2b
            android.widget.RadioButton r0 = r4.f35
            if (r0 != 0) goto L28
            android.view.LayoutInflater r0 = r4.getInflater()
            r3 = 1712062481(0x660c0011, float:1.6528313E23)
            android.view.View r0 = r0.inflate(r3, r4, r2)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r4.f35 = r0
            android.widget.LinearLayout r2 = r4.f30
            if (r2 == 0) goto L25
            r2.addView(r0, r1)
            goto L28
        L25:
            r4.addView(r0, r1)
        L28:
            android.widget.RadioButton r4 = r4.f35
            goto L4b
        L2b:
            android.widget.CheckBox r0 = r4.f45
            if (r0 != 0) goto L49
            android.view.LayoutInflater r0 = r4.getInflater()
            r3 = 1712062478(0x660c000e, float:1.6528308E23)
            android.view.View r0 = r0.inflate(r3, r4, r2)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r4.f45 = r0
            android.widget.LinearLayout r2 = r4.f30
            if (r2 == 0) goto L46
            r2.addView(r0, r1)
            goto L49
        L46:
            r4.addView(r0, r1)
        L49:
            android.widget.CheckBox r4 = r4.f45
        L4b:
            r4.setChecked(r5)
            return
    }

    public void setForceShowIcon(boolean r1) {
            r0 = this;
            r0.f34 = r1
            r0.f33 = r1
            return
    }

    public void setGroupDividerEnabled(boolean r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.f39
            if (r0 == 0) goto L11
            boolean r1 = r1.f41
            if (r1 != 0) goto Lc
            if (r2 == 0) goto Lc
            r1 = 0
            goto Le
        Lc:
            r1 = 8
        Le:
            r0.setVisibility(r1)
        L11:
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r5) {
            r4 = this;
            ᛲᛲᛶᲁ r0 = r4.f38
            ᲀᛷᛱᲇ r0 = r0.f1505
            boolean r0 = r4.f34
            if (r0 != 0) goto Ld
            boolean r1 = r4.f33
            if (r1 != 0) goto Ld
            goto L5a
        Ld:
            android.widget.ImageView r1 = r4.f37
            if (r1 != 0) goto L18
            if (r5 != 0) goto L18
            boolean r2 = r4.f33
            if (r2 != 0) goto L18
            goto L5a
        L18:
            r2 = 0
            if (r1 != 0) goto L35
            android.view.LayoutInflater r1 = r4.getInflater()
            r3 = 1712062479(0x660c000f, float:1.652831E23)
            android.view.View r1 = r1.inflate(r3, r4, r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r4.f37 = r1
            android.widget.LinearLayout r3 = r4.f30
            if (r3 == 0) goto L32
            r3.addView(r1, r2)
            goto L35
        L32:
            r4.addView(r1, r2)
        L35:
            if (r5 != 0) goto L44
            boolean r1 = r4.f33
            if (r1 == 0) goto L3c
            goto L44
        L3c:
            android.widget.ImageView r4 = r4.f37
            r5 = 8
            r4.setVisibility(r5)
            return
        L44:
            android.widget.ImageView r1 = r4.f37
            if (r0 == 0) goto L49
            goto L4a
        L49:
            r5 = 0
        L4a:
            r1.setImageDrawable(r5)
            android.widget.ImageView r5 = r4.f37
            int r5 = r5.getVisibility()
            if (r5 == 0) goto L5a
            android.widget.ImageView r4 = r4.f37
            r4.setVisibility(r2)
        L5a:
            return
    }

    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.TextView r0 = r1.f43
            if (r2 == 0) goto L16
            r0.setText(r2)
            android.widget.TextView r2 = r1.f43
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L23
            android.widget.TextView r1 = r1.f43
            r2 = 0
            r1.setVisibility(r2)
            return
        L16:
            int r2 = r0.getVisibility()
            r0 = 8
            if (r2 == r0) goto L23
            android.widget.TextView r1 = r1.f43
            r1.setVisibility(r0)
        L23:
            return
    }

    @Override // defpackage.InterfaceC1637
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo14(defpackage.C0254 r11) {
            r10 = this;
            r10.f38 = r11
            boolean r0 = r11.isVisible()
            ᲀᛷᛱᲇ r1 = r11.f1505
            r2 = 8
            r3 = 0
            if (r0 == 0) goto Lf
            r0 = r3
            goto L10
        Lf:
            r0 = r2
        L10:
            r10.setVisibility(r0)
            java.lang.CharSequence r0 = r11.f1507
            r10.setTitle(r0)
            boolean r0 = r11.isCheckable()
            r10.setCheckable(r0)
            boolean r0 = r1.mo2717()
            r4 = 1
            if (r0 == 0) goto L35
            boolean r0 = r1.mo2722()
            if (r0 == 0) goto L2f
            char r0 = r11.f1482
            goto L31
        L2f:
            char r0 = r11.f1495
        L31:
            if (r0 == 0) goto L35
            r0 = r4
            goto L36
        L35:
            r0 = r3
        L36:
            r1.mo2722()
            if (r0 == 0) goto L53
            ᛲᛲᛶᲁ r0 = r10.f38
            ᲀᛷᛱᲇ r1 = r0.f1505
            boolean r5 = r1.mo2717()
            if (r5 == 0) goto L53
            boolean r1 = r1.mo2722()
            if (r1 == 0) goto L4e
            char r0 = r0.f1482
            goto L50
        L4e:
            char r0 = r0.f1495
        L50:
            if (r0 == 0) goto L53
            goto L54
        L53:
            r3 = r2
        L54:
            if (r3 != 0) goto L10e
            android.widget.TextView r0 = r10.f29
            ᛲᛲᛶᲁ r1 = r10.f38
            ᲀᛷᛱᲇ r5 = r1.f1505
            android.content.Context r6 = r5.f7572
            boolean r7 = r5.mo2722()
            if (r7 == 0) goto L67
            char r7 = r1.f1482
            goto L69
        L67:
            char r7 = r1.f1495
        L69:
            if (r7 != 0) goto L6f
            java.lang.String r1 = ""
            goto L10b
        L6f:
            android.content.res.Resources r8 = r6.getResources()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L8c
            r6 = 1712193553(0x660e0011, float:1.6764432E23)
            java.lang.String r6 = r8.getString(r6)
            r9.append(r6)
        L8c:
            boolean r5 = r5.mo2722()
            if (r5 == 0) goto L95
            int r1 = r1.f1491
            goto L97
        L95:
            int r1 = r1.f1480
        L97:
            r5 = 1712193549(0x660e000d, float:1.6764424E23)
            java.lang.String r5 = r8.getString(r5)
            r6 = 65536(0x10000, float:9.1835E-41)
            defpackage.C0254.m878(r9, r1, r6, r5)
            r5 = 1712193545(0x660e0009, float:1.6764417E23)
            java.lang.String r5 = r8.getString(r5)
            r6 = 4096(0x1000, float:5.74E-42)
            defpackage.C0254.m878(r9, r1, r6, r5)
            r5 = 1712193544(0x660e0008, float:1.6764415E23)
            java.lang.String r5 = r8.getString(r5)
            r6 = 2
            defpackage.C0254.m878(r9, r1, r6, r5)
            r5 = 1712193550(0x660e000e, float:1.6764426E23)
            java.lang.String r5 = r8.getString(r5)
            defpackage.C0254.m878(r9, r1, r4, r5)
            r4 = 1712193552(0x660e0010, float:1.676443E23)
            java.lang.String r4 = r8.getString(r4)
            r5 = 4
            defpackage.C0254.m878(r9, r1, r5, r4)
            r4 = 1712193548(0x660e000c, float:1.6764423E23)
            java.lang.String r4 = r8.getString(r4)
            defpackage.C0254.m878(r9, r1, r2, r4)
            if (r7 == r2) goto Lfd
            r1 = 10
            if (r7 == r1) goto Lf2
            r1 = 32
            if (r7 == r1) goto Le7
            r9.append(r7)
            goto L107
        Le7:
            r1 = 1712193551(0x660e000f, float:1.6764428E23)
            java.lang.String r1 = r8.getString(r1)
            r9.append(r1)
            goto L107
        Lf2:
            r1 = 1712193547(0x660e000b, float:1.676442E23)
            java.lang.String r1 = r8.getString(r1)
            r9.append(r1)
            goto L107
        Lfd:
            r1 = 1712193546(0x660e000a, float:1.6764419E23)
            java.lang.String r1 = r8.getString(r1)
            r9.append(r1)
        L107:
            java.lang.String r1 = r9.toString()
        L10b:
            r0.setText(r1)
        L10e:
            android.widget.TextView r0 = r10.f29
            int r0 = r0.getVisibility()
            if (r0 == r3) goto L11b
            android.widget.TextView r0 = r10.f29
            r0.setVisibility(r3)
        L11b:
            android.graphics.drawable.Drawable r0 = r11.getIcon()
            r10.setIcon(r0)
            boolean r0 = r11.isEnabled()
            r10.setEnabled(r0)
            boolean r0 = r11.hasSubMenu()
            r10.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r11 = r11.f1487
            r10.setContentDescription(r11)
            return
    }
}
