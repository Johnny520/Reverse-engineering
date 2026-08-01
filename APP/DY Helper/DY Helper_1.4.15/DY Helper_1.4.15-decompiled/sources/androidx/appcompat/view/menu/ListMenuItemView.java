package androidx.appcompat.view.menu;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends android.widget.LinearLayout implements p000.vz0, android.widget.AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: ε */
    public p000.lz0 f436;

    /* JADX INFO: renamed from: ζ */
    public android.widget.ImageView f437;

    /* JADX INFO: renamed from: η */
    public android.widget.RadioButton f438;

    /* JADX INFO: renamed from: θ */
    public android.widget.TextView f439;

    /* JADX INFO: renamed from: ι */
    public android.widget.CheckBox f440;

    /* JADX INFO: renamed from: κ */
    public android.widget.TextView f441;

    /* JADX INFO: renamed from: λ */
    public android.widget.ImageView f442;

    /* JADX INFO: renamed from: μ */
    public android.widget.ImageView f443;

    /* JADX INFO: renamed from: ν */
    public android.widget.LinearLayout f444;

    /* JADX INFO: renamed from: ξ */
    public final android.graphics.drawable.Drawable f445;

    /* JADX INFO: renamed from: ο */
    public final int f446;

    /* JADX INFO: renamed from: π */
    public final android.content.Context f447;

    /* JADX INFO: renamed from: ρ */
    public boolean f448;

    /* JADX INFO: renamed from: σ */
    public final android.graphics.drawable.Drawable f449;

    /* JADX INFO: renamed from: τ */
    public final boolean f450;

    /* JADX INFO: renamed from: υ */
    public android.view.LayoutInflater f451;

    /* JADX INFO: renamed from: φ */
    public boolean f452;

    public ListMenuItemView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 2130968763(0x7f0400bb, float:1.7546189E38)
            r1.<init>(r2, r3, r0)
            return
    }

    public ListMenuItemView(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5)
            android.content.Context r0 = r3.getContext()
            int[] r1 = p000.kk1.f5985
            m6 r5 = p000.C0538m6.m3752(r0, r5, r1, r6)
            r6 = 5
            android.graphics.drawable.Drawable r6 = r5.m3754(r6)
            r3.f445 = r6
            java.lang.Object r6 = r5.f6967
            android.content.res.TypedArray r6 = (android.content.res.TypedArray) r6
            r0 = 1
            r1 = -1
            int r0 = r6.getResourceId(r0, r1)
            r3.f446 = r0
            r0 = 7
            r1 = 0
            boolean r6 = r6.getBoolean(r0, r1)
            r3.f448 = r6
            r3.f447 = r4
            r6 = 8
            android.graphics.drawable.Drawable r6 = r5.m3754(r6)
            r3.f449 = r6
            android.content.res.Resources$Theme r4 = r4.getTheme()
            r6 = 16843049(0x1010129, float:2.369439E-38)
            int[] r6 = new int[]{r6}
            r0 = 2130968703(0x7f04007f, float:1.7546067E38)
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r2, r6, r0, r1)
            boolean r6 = r4.hasValue(r1)
            r3.f450 = r6
            r5.m3765()
            r4.recycle()
            return
    }

    private android.view.LayoutInflater getInflater() {
            r1 = this;
            android.view.LayoutInflater r0 = r1.f451
            if (r0 != 0) goto Le
            android.content.Context r0 = r1.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1.f451 = r0
        Le:
            android.view.LayoutInflater r1 = r1.f451
            return r1
    }

    private void setSubMenuArrowVisible(boolean r1) {
            r0 = this;
            android.widget.ImageView r0 = r0.f442
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
            android.widget.ImageView r0 = r3.f443
            if (r0 == 0) goto L23
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L23
            android.widget.ImageView r0 = r3.f443
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r4.top
            android.widget.ImageView r3 = r3.f443
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

    @Override // p000.vz0
    public p000.lz0 getItemData() {
            r0 = this;
            lz0 r0 = r0.f436
            return r0
    }

    @Override // android.view.View
    public final void onFinishInflate() {
            r3 = this;
            super.onFinishInflate()
            android.graphics.drawable.Drawable r0 = r3.f445
            r3.setBackground(r0)
            r0 = 2131297003(0x7f0902eb, float:1.8211939E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.f439 = r0
            r1 = -1
            int r2 = r3.f446
            if (r2 == r1) goto L1d
            android.content.Context r1 = r3.f447
            r0.setTextAppearance(r1, r2)
        L1d:
            r0 = 2131296951(0x7f0902b7, float:1.8211833E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.f441 = r0
            r0 = 2131296969(0x7f0902c9, float:1.821187E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.f442 = r0
            if (r0 == 0) goto L3a
            android.graphics.drawable.Drawable r1 = r3.f449
            r0.setImageDrawable(r1)
        L3a:
            r0 = 2131296617(0x7f090169, float:1.8211156E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.f443 = r0
            r0 = 2131296503(0x7f0900f7, float:1.8210925E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.f444 = r0
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r4, int r5) {
            r3 = this;
            android.widget.ImageView r0 = r3.f437
            if (r0 == 0) goto L1e
            boolean r0 = r3.f448
            if (r0 == 0) goto L1e
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            android.widget.ImageView r1 = r3.f437
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

    public void setCheckable(boolean r5) {
            r4 = this;
            if (r5 != 0) goto Lc
            android.widget.RadioButton r0 = r4.f438
            if (r0 != 0) goto Lc
            android.widget.CheckBox r0 = r4.f440
            if (r0 != 0) goto Lc
            goto L8b
        Lc:
            lz0 r0 = r4.f436
            int r0 = r0.f6876
            r0 = r0 & 4
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L39
            android.widget.RadioButton r0 = r4.f438
            if (r0 != 0) goto L34
            android.view.LayoutInflater r0 = r4.getInflater()
            r3 = 2131492881(0x7f0c0011, float:1.8609226E38)
            android.view.View r0 = r0.inflate(r3, r4, r2)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r4.f438 = r0
            android.widget.LinearLayout r3 = r4.f444
            if (r3 == 0) goto L31
            r3.addView(r0, r1)
            goto L34
        L31:
            r4.addView(r0, r1)
        L34:
            android.widget.RadioButton r0 = r4.f438
            android.widget.CheckBox r1 = r4.f440
            goto L5b
        L39:
            android.widget.CheckBox r0 = r4.f440
            if (r0 != 0) goto L57
            android.view.LayoutInflater r0 = r4.getInflater()
            r3 = 2131492878(0x7f0c000e, float:1.860922E38)
            android.view.View r0 = r0.inflate(r3, r4, r2)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r4.f440 = r0
            android.widget.LinearLayout r3 = r4.f444
            if (r3 == 0) goto L54
            r3.addView(r0, r1)
            goto L57
        L54:
            r4.addView(r0, r1)
        L57:
            android.widget.CheckBox r0 = r4.f440
            android.widget.RadioButton r1 = r4.f438
        L5b:
            r3 = 8
            if (r5 == 0) goto L7d
            lz0 r4 = r4.f436
            boolean r4 = r4.isChecked()
            r0.setChecked(r4)
            int r4 = r0.getVisibility()
            if (r4 == 0) goto L71
            r0.setVisibility(r2)
        L71:
            if (r1 == 0) goto L8b
            int r4 = r1.getVisibility()
            if (r4 == r3) goto L8b
            r1.setVisibility(r3)
            return
        L7d:
            android.widget.CheckBox r5 = r4.f440
            if (r5 == 0) goto L84
            r5.setVisibility(r3)
        L84:
            android.widget.RadioButton r4 = r4.f438
            if (r4 == 0) goto L8b
            r4.setVisibility(r3)
        L8b:
            return
    }

    public void setChecked(boolean r5) {
            r4 = this;
            lz0 r0 = r4.f436
            int r0 = r0.f6876
            r0 = r0 & 4
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L2b
            android.widget.RadioButton r0 = r4.f438
            if (r0 != 0) goto L28
            android.view.LayoutInflater r0 = r4.getInflater()
            r3 = 2131492881(0x7f0c0011, float:1.8609226E38)
            android.view.View r0 = r0.inflate(r3, r4, r2)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r4.f438 = r0
            android.widget.LinearLayout r2 = r4.f444
            if (r2 == 0) goto L25
            r2.addView(r0, r1)
            goto L28
        L25:
            r4.addView(r0, r1)
        L28:
            android.widget.RadioButton r4 = r4.f438
            goto L4b
        L2b:
            android.widget.CheckBox r0 = r4.f440
            if (r0 != 0) goto L49
            android.view.LayoutInflater r0 = r4.getInflater()
            r3 = 2131492878(0x7f0c000e, float:1.860922E38)
            android.view.View r0 = r0.inflate(r3, r4, r2)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r4.f440 = r0
            android.widget.LinearLayout r2 = r4.f444
            if (r2 == 0) goto L46
            r2.addView(r0, r1)
            goto L49
        L46:
            r4.addView(r0, r1)
        L49:
            android.widget.CheckBox r4 = r4.f440
        L4b:
            r4.setChecked(r5)
            return
    }

    public void setForceShowIcon(boolean r1) {
            r0 = this;
            r0.f452 = r1
            r0.f448 = r1
            return
    }

    public void setGroupDividerEnabled(boolean r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.f443
            if (r0 == 0) goto L11
            boolean r1 = r1.f450
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
            lz0 r0 = r4.f436
            iz0 r0 = r0.f6866
            boolean r0 = r4.f452
            if (r0 != 0) goto Ld
            boolean r1 = r4.f448
            if (r1 != 0) goto Ld
            goto L5a
        Ld:
            android.widget.ImageView r1 = r4.f437
            if (r1 != 0) goto L18
            if (r5 != 0) goto L18
            boolean r2 = r4.f448
            if (r2 != 0) goto L18
            goto L5a
        L18:
            r2 = 0
            if (r1 != 0) goto L35
            android.view.LayoutInflater r1 = r4.getInflater()
            r3 = 2131492879(0x7f0c000f, float:1.8609222E38)
            android.view.View r1 = r1.inflate(r3, r4, r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r4.f437 = r1
            android.widget.LinearLayout r3 = r4.f444
            if (r3 == 0) goto L32
            r3.addView(r1, r2)
            goto L35
        L32:
            r4.addView(r1, r2)
        L35:
            if (r5 != 0) goto L44
            boolean r1 = r4.f448
            if (r1 == 0) goto L3c
            goto L44
        L3c:
            android.widget.ImageView r4 = r4.f437
            r5 = 8
            r4.setVisibility(r5)
            return
        L44:
            android.widget.ImageView r1 = r4.f437
            if (r0 == 0) goto L49
            goto L4a
        L49:
            r5 = 0
        L4a:
            r1.setImageDrawable(r5)
            android.widget.ImageView r5 = r4.f437
            int r5 = r5.getVisibility()
            if (r5 == 0) goto L5a
            android.widget.ImageView r4 = r4.f437
            r4.setVisibility(r2)
        L5a:
            return
    }

    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.TextView r0 = r1.f439
            if (r2 == 0) goto L16
            r0.setText(r2)
            android.widget.TextView r2 = r1.f439
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L23
            android.widget.TextView r1 = r1.f439
            r2 = 0
            r1.setVisibility(r2)
            return
        L16:
            int r2 = r0.getVisibility()
            r0 = 8
            if (r2 == r0) goto L23
            android.widget.TextView r1 = r1.f439
            r1.setVisibility(r0)
        L23:
            return
    }

    @Override // p000.vz0
    /* JADX INFO: renamed from: α */
    public final void mo232(p000.lz0 r11) {
            r10 = this;
            r10.f436 = r11
            boolean r0 = r11.isVisible()
            iz0 r1 = r11.f6866
            r2 = 8
            r3 = 0
            if (r0 == 0) goto Lf
            r0 = r3
            goto L10
        Lf:
            r0 = r2
        L10:
            r10.setVisibility(r0)
            java.lang.CharSequence r0 = r11.f6857
            r10.setTitle(r0)
            boolean r0 = r11.isCheckable()
            r10.setCheckable(r0)
            boolean r0 = r1.mo688()
            r4 = 1
            if (r0 == 0) goto L35
            boolean r0 = r1.mo687()
            if (r0 == 0) goto L2f
            char r0 = r11.f6862
            goto L31
        L2f:
            char r0 = r11.f6860
        L31:
            if (r0 == 0) goto L35
            r0 = r4
            goto L36
        L35:
            r0 = r3
        L36:
            r1.mo687()
            if (r0 == 0) goto L58
            lz0 r0 = r10.f436
            iz0 r1 = r0.f6866
            boolean r5 = r1.mo688()
            if (r5 == 0) goto L54
            boolean r1 = r1.mo687()
            if (r1 == 0) goto L4e
            char r0 = r0.f6862
            goto L50
        L4e:
            char r0 = r0.f6860
        L50:
            if (r0 == 0) goto L54
            r0 = r4
            goto L55
        L54:
            r0 = r3
        L55:
            if (r0 == 0) goto L58
            goto L59
        L58:
            r3 = r2
        L59:
            if (r3 != 0) goto L113
            android.widget.TextView r0 = r10.f441
            lz0 r1 = r10.f436
            iz0 r5 = r1.f6866
            android.content.Context r6 = r5.f5251
            boolean r7 = r5.mo687()
            if (r7 == 0) goto L6c
            char r7 = r1.f6862
            goto L6e
        L6c:
            char r7 = r1.f6860
        L6e:
            if (r7 != 0) goto L74
            java.lang.String r1 = ""
            goto L110
        L74:
            android.content.res.Resources r8 = r6.getResources()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L91
            r6 = 2131689489(0x7f0f0011, float:1.9007995E38)
            java.lang.String r6 = r8.getString(r6)
            r9.append(r6)
        L91:
            boolean r5 = r5.mo687()
            if (r5 == 0) goto L9a
            int r1 = r1.f6863
            goto L9c
        L9a:
            int r1 = r1.f6861
        L9c:
            r5 = 2131689485(0x7f0f000d, float:1.9007987E38)
            java.lang.String r5 = r8.getString(r5)
            r6 = 65536(0x10000, float:9.1835E-41)
            p000.lz0.m3665(r9, r1, r6, r5)
            r5 = 2131689481(0x7f0f0009, float:1.9007979E38)
            java.lang.String r5 = r8.getString(r5)
            r6 = 4096(0x1000, float:5.74E-42)
            p000.lz0.m3665(r9, r1, r6, r5)
            r5 = 2131689480(0x7f0f0008, float:1.9007977E38)
            java.lang.String r5 = r8.getString(r5)
            r6 = 2
            p000.lz0.m3665(r9, r1, r6, r5)
            r5 = 2131689486(0x7f0f000e, float:1.9007989E38)
            java.lang.String r5 = r8.getString(r5)
            p000.lz0.m3665(r9, r1, r4, r5)
            r4 = 2131689488(0x7f0f0010, float:1.9007993E38)
            java.lang.String r4 = r8.getString(r4)
            r5 = 4
            p000.lz0.m3665(r9, r1, r5, r4)
            r4 = 2131689484(0x7f0f000c, float:1.9007985E38)
            java.lang.String r4 = r8.getString(r4)
            p000.lz0.m3665(r9, r1, r2, r4)
            if (r7 == r2) goto L102
            r1 = 10
            if (r7 == r1) goto Lf7
            r1 = 32
            if (r7 == r1) goto Lec
            r9.append(r7)
            goto L10c
        Lec:
            r1 = 2131689487(0x7f0f000f, float:1.900799E38)
            java.lang.String r1 = r8.getString(r1)
            r9.append(r1)
            goto L10c
        Lf7:
            r1 = 2131689483(0x7f0f000b, float:1.9007983E38)
            java.lang.String r1 = r8.getString(r1)
            r9.append(r1)
            goto L10c
        L102:
            r1 = 2131689482(0x7f0f000a, float:1.900798E38)
            java.lang.String r1 = r8.getString(r1)
            r9.append(r1)
        L10c:
            java.lang.String r1 = r9.toString()
        L110:
            r0.setText(r1)
        L113:
            android.widget.TextView r0 = r10.f441
            int r0 = r0.getVisibility()
            if (r0 == r3) goto L120
            android.widget.TextView r0 = r10.f441
            r0.setVisibility(r3)
        L120:
            android.graphics.drawable.Drawable r0 = r11.getIcon()
            r10.setIcon(r0)
            boolean r0 = r11.isEnabled()
            r10.setEnabled(r0)
            boolean r0 = r11.hasSubMenu()
            r10.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r11 = r11.f6869
            r10.setContentDescription(r11)
            return
    }
}
