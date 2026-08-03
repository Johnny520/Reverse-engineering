package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends android.widget.LinearLayout implements androidx.appcompat.view.menu.k.a, android.widget.AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.appcompat.view.menu.h f812a;
    public android.widget.ImageView b;
    public android.widget.RadioButton c;
    public android.widget.TextView d;
    public android.widget.CheckBox e;
    public android.widget.TextView f;
    public android.widget.ImageView g;
    public android.widget.ImageView h;
    public android.widget.LinearLayout i;
    public final android.graphics.drawable.Drawable j;
    public final int k;
    public final android.content.Context l;
    public boolean m;
    public final android.graphics.drawable.Drawable n;
    public final boolean o;
    public android.view.LayoutInflater p;
    public boolean q;

    public ListMenuItemView(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            int r0 = androidx.appcompat.R.attr.listMenuViewStyle
            r4.<init>(r5, r6)
            android.content.Context r1 = r4.getContext()
            int[] r2 = androidx.appcompat.R.styleable.MenuView
            a.of r6 = a.C0306of.e(r1, r6, r2, r0)
            int r0 = androidx.appcompat.R.styleable.MenuView_android_itemBackground
            android.graphics.drawable.Drawable r0 = r6.b(r0)
            r4.j = r0
            int r0 = androidx.appcompat.R.styleable.MenuView_android_itemTextAppearance
            android.content.res.TypedArray r1 = r6.b
            r2 = -1
            int r0 = r1.getResourceId(r0, r2)
            r4.k = r0
            int r0 = androidx.appcompat.R.styleable.MenuView_preserveIconSpacing
            r2 = 0
            boolean r0 = r1.getBoolean(r0, r2)
            r4.m = r0
            r4.l = r5
            int r0 = androidx.appcompat.R.styleable.MenuView_subMenuArrow
            android.graphics.drawable.Drawable r0 = r6.b(r0)
            r4.n = r0
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r0 = 16843049(0x1010129, float:2.369439E-38)
            int[] r0 = new int[]{r0}
            int r1 = androidx.appcompat.R.attr.dropDownListViewStyle
            r3 = 0
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r3, r0, r1, r2)
            boolean r0 = r5.hasValue(r2)
            r4.o = r0
            r6.f()
            r5.recycle()
            return
    }

    private android.view.LayoutInflater getInflater() {
            r1 = this;
            android.view.LayoutInflater r0 = r1.p
            if (r0 != 0) goto Le
            android.content.Context r0 = r1.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1.p = r0
        Le:
            android.view.LayoutInflater r0 = r1.p
            return r0
    }

    private void setSubMenuArrowVisible(boolean r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.g
            if (r0 == 0) goto Ld
            if (r2 == 0) goto L8
            r2 = 0
            goto La
        L8:
            r2 = 8
        La:
            r0.setVisibility(r2)
        Ld:
            return
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(android.graphics.Rect r5) {
            r4 = this;
            android.widget.ImageView r0 = r4.h
            if (r0 == 0) goto L23
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L23
            android.widget.ImageView r0 = r4.h
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r5.top
            android.widget.ImageView r2 = r4.h
            int r2 = r2.getHeight()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r0 = r0.bottomMargin
            int r2 = r2 + r0
            int r2 = r2 + r1
            r5.top = r2
        L23:
            return
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void b(androidx.appcompat.view.menu.h r11) {
            r10 = this;
            r10.f812a = r11
            boolean r0 = r11.isVisible()
            r1 = 8
            r2 = 0
            if (r0 == 0) goto Ld
            r0 = r2
            goto Le
        Ld:
            r0 = r1
        Le:
            r10.setVisibility(r0)
            java.lang.CharSequence r0 = r11.e
            r10.setTitle(r0)
            boolean r0 = r11.isCheckable()
            r10.setCheckable(r0)
            androidx.appcompat.view.menu.f r0 = r11.n
            boolean r0 = r0.o()
            r3 = 1
            if (r0 == 0) goto L37
            androidx.appcompat.view.menu.f r0 = r11.n
            boolean r0 = r0.n()
            if (r0 == 0) goto L31
            char r0 = r11.j
            goto L33
        L31:
            char r0 = r11.h
        L33:
            if (r0 == 0) goto L37
            r0 = r3
            goto L38
        L37:
            r0 = r2
        L38:
            androidx.appcompat.view.menu.f r4 = r11.n
            r4.n()
            if (r0 == 0) goto L5e
            androidx.appcompat.view.menu.h r0 = r10.f812a
            androidx.appcompat.view.menu.f r4 = r0.n
            boolean r4 = r4.o()
            if (r4 == 0) goto L5a
            androidx.appcompat.view.menu.f r4 = r0.n
            boolean r4 = r4.n()
            if (r4 == 0) goto L54
            char r0 = r0.j
            goto L56
        L54:
            char r0 = r0.h
        L56:
            if (r0 == 0) goto L5a
            r0 = r3
            goto L5b
        L5a:
            r0 = r2
        L5b:
            if (r0 == 0) goto L5e
            goto L5f
        L5e:
            r2 = r1
        L5f:
            if (r2 != 0) goto L113
            android.widget.TextView r0 = r10.f
            androidx.appcompat.view.menu.h r4 = r10.f812a
            androidx.appcompat.view.menu.f r5 = r4.n
            boolean r5 = r5.n()
            if (r5 == 0) goto L70
            char r5 = r4.j
            goto L72
        L70:
            char r5 = r4.h
        L72:
            if (r5 != 0) goto L78
            java.lang.String r1 = ""
            goto L110
        L78:
            androidx.appcompat.view.menu.f r6 = r4.n
            android.content.Context r7 = r6.f822a
            android.content.res.Resources r7 = r7.getResources()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            android.content.Context r9 = r6.f822a
            android.view.ViewConfiguration r9 = android.view.ViewConfiguration.get(r9)
            boolean r9 = r9.hasPermanentMenuKey()
            if (r9 == 0) goto L9a
            int r9 = androidx.appcompat.R.string.abc_prepend_shortcut_label
            java.lang.String r9 = r7.getString(r9)
            r8.append(r9)
        L9a:
            boolean r6 = r6.n()
            if (r6 == 0) goto La3
            int r4 = r4.k
            goto La5
        La3:
            int r4 = r4.i
        La5:
            int r6 = androidx.appcompat.R.string.abc_menu_meta_shortcut_label
            java.lang.String r6 = r7.getString(r6)
            r9 = 65536(0x10000, float:9.1835E-41)
            androidx.appcompat.view.menu.h.c(r8, r4, r9, r6)
            int r6 = androidx.appcompat.R.string.abc_menu_ctrl_shortcut_label
            java.lang.String r6 = r7.getString(r6)
            r9 = 4096(0x1000, float:5.74E-42)
            androidx.appcompat.view.menu.h.c(r8, r4, r9, r6)
            int r6 = androidx.appcompat.R.string.abc_menu_alt_shortcut_label
            java.lang.String r6 = r7.getString(r6)
            r9 = 2
            androidx.appcompat.view.menu.h.c(r8, r4, r9, r6)
            int r6 = androidx.appcompat.R.string.abc_menu_shift_shortcut_label
            java.lang.String r6 = r7.getString(r6)
            androidx.appcompat.view.menu.h.c(r8, r4, r3, r6)
            int r3 = androidx.appcompat.R.string.abc_menu_sym_shortcut_label
            java.lang.String r3 = r7.getString(r3)
            r6 = 4
            androidx.appcompat.view.menu.h.c(r8, r4, r6, r3)
            int r3 = androidx.appcompat.R.string.abc_menu_function_shortcut_label
            java.lang.String r3 = r7.getString(r3)
            androidx.appcompat.view.menu.h.c(r8, r4, r1, r3)
            if (r5 == r1) goto L103
            r1 = 10
            if (r5 == r1) goto Lf9
            r1 = 32
            if (r5 == r1) goto Lef
            r8.append(r5)
            goto L10c
        Lef:
            int r1 = androidx.appcompat.R.string.abc_menu_space_shortcut_label
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
            goto L10c
        Lf9:
            int r1 = androidx.appcompat.R.string.abc_menu_enter_shortcut_label
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
            goto L10c
        L103:
            int r1 = androidx.appcompat.R.string.abc_menu_delete_shortcut_label
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
        L10c:
            java.lang.String r1 = r8.toString()
        L110:
            r0.setText(r1)
        L113:
            android.widget.TextView r0 = r10.f
            int r0 = r0.getVisibility()
            if (r0 == r2) goto L120
            android.widget.TextView r0 = r10.f
            r0.setVisibility(r2)
        L120:
            android.graphics.drawable.Drawable r0 = r11.getIcon()
            r10.setIcon(r0)
            boolean r0 = r11.isEnabled()
            r10.setEnabled(r0)
            boolean r0 = r11.hasSubMenu()
            r10.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r11 = r11.q
            r10.setContentDescription(r11)
            return
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.h getItemData() {
            r1 = this;
            androidx.appcompat.view.menu.h r0 = r1.f812a
            return r0
    }

    @Override // android.view.View
    public final void onFinishInflate() {
            r3 = this;
            super.onFinishInflate()
            android.graphics.drawable.Drawable r0 = r3.j
            r3.setBackground(r0)
            int r0 = androidx.appcompat.R.id.title
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.d = r0
            r1 = -1
            int r2 = r3.k
            if (r2 == r1) goto L1c
            android.content.Context r1 = r3.l
            r0.setTextAppearance(r1, r2)
        L1c:
            int r0 = androidx.appcompat.R.id.shortcut
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.f = r0
            int r0 = androidx.appcompat.R.id.submenuarrow
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.g = r0
            if (r0 == 0) goto L37
            android.graphics.drawable.Drawable r1 = r3.n
            r0.setImageDrawable(r1)
        L37:
            int r0 = androidx.appcompat.R.id.group_divider
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.h = r0
            int r0 = androidx.appcompat.R.id.content
            android.view.View r0 = r3.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r3.i = r0
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r4, int r5) {
            r3 = this;
            android.widget.ImageView r0 = r3.b
            if (r0 == 0) goto L1e
            boolean r0 = r3.m
            if (r0 == 0) goto L1e
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            android.widget.ImageView r1 = r3.b
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
            android.widget.RadioButton r0 = r4.c
            if (r0 != 0) goto Lc
            android.widget.CheckBox r0 = r4.e
            if (r0 != 0) goto Lc
            goto L89
        Lc:
            androidx.appcompat.view.menu.h r0 = r4.f812a
            int r0 = r0.x
            r0 = r0 & 4
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L38
            android.widget.RadioButton r0 = r4.c
            if (r0 != 0) goto L33
            android.view.LayoutInflater r0 = r4.getInflater()
            int r3 = androidx.appcompat.R.layout.abc_list_menu_item_radio
            android.view.View r0 = r0.inflate(r3, r4, r2)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r4.c = r0
            android.widget.LinearLayout r3 = r4.i
            if (r3 == 0) goto L30
            r3.addView(r0, r1)
            goto L33
        L30:
            r4.addView(r0, r1)
        L33:
            android.widget.RadioButton r0 = r4.c
            android.widget.CheckBox r1 = r4.e
            goto L59
        L38:
            android.widget.CheckBox r0 = r4.e
            if (r0 != 0) goto L55
            android.view.LayoutInflater r0 = r4.getInflater()
            int r3 = androidx.appcompat.R.layout.abc_list_menu_item_checkbox
            android.view.View r0 = r0.inflate(r3, r4, r2)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r4.e = r0
            android.widget.LinearLayout r3 = r4.i
            if (r3 == 0) goto L52
            r3.addView(r0, r1)
            goto L55
        L52:
            r4.addView(r0, r1)
        L55:
            android.widget.CheckBox r0 = r4.e
            android.widget.RadioButton r1 = r4.c
        L59:
            r3 = 8
            if (r5 == 0) goto L7b
            androidx.appcompat.view.menu.h r5 = r4.f812a
            boolean r5 = r5.isChecked()
            r0.setChecked(r5)
            int r5 = r0.getVisibility()
            if (r5 == 0) goto L6f
            r0.setVisibility(r2)
        L6f:
            if (r1 == 0) goto L89
            int r5 = r1.getVisibility()
            if (r5 == r3) goto L89
            r1.setVisibility(r3)
            return
        L7b:
            android.widget.CheckBox r5 = r4.e
            if (r5 == 0) goto L82
            r5.setVisibility(r3)
        L82:
            android.widget.RadioButton r5 = r4.c
            if (r5 == 0) goto L89
            r5.setVisibility(r3)
        L89:
            return
    }

    public void setChecked(boolean r5) {
            r4 = this;
            androidx.appcompat.view.menu.h r0 = r4.f812a
            int r0 = r0.x
            r0 = r0 & 4
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L2a
            android.widget.RadioButton r0 = r4.c
            if (r0 != 0) goto L27
            android.view.LayoutInflater r0 = r4.getInflater()
            int r3 = androidx.appcompat.R.layout.abc_list_menu_item_radio
            android.view.View r0 = r0.inflate(r3, r4, r2)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r4.c = r0
            android.widget.LinearLayout r2 = r4.i
            if (r2 == 0) goto L24
            r2.addView(r0, r1)
            goto L27
        L24:
            r4.addView(r0, r1)
        L27:
            android.widget.RadioButton r0 = r4.c
            goto L49
        L2a:
            android.widget.CheckBox r0 = r4.e
            if (r0 != 0) goto L47
            android.view.LayoutInflater r0 = r4.getInflater()
            int r3 = androidx.appcompat.R.layout.abc_list_menu_item_checkbox
            android.view.View r0 = r0.inflate(r3, r4, r2)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r4.e = r0
            android.widget.LinearLayout r2 = r4.i
            if (r2 == 0) goto L44
            r2.addView(r0, r1)
            goto L47
        L44:
            r4.addView(r0, r1)
        L47:
            android.widget.CheckBox r0 = r4.e
        L49:
            r0.setChecked(r5)
            return
    }

    public void setForceShowIcon(boolean r1) {
            r0 = this;
            r0.q = r1
            r0.m = r1
            return
    }

    public void setGroupDividerEnabled(boolean r3) {
            r2 = this;
            android.widget.ImageView r0 = r2.h
            if (r0 == 0) goto L11
            boolean r1 = r2.o
            if (r1 != 0) goto Lc
            if (r3 == 0) goto Lc
            r3 = 0
            goto Le
        Lc:
            r3 = 8
        Le:
            r0.setVisibility(r3)
        L11:
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r5) {
            r4 = this;
            androidx.appcompat.view.menu.h r0 = r4.f812a
            androidx.appcompat.view.menu.f r0 = r0.n
            r0.getClass()
            boolean r0 = r4.q
            if (r0 != 0) goto L10
            boolean r1 = r4.m
            if (r1 != 0) goto L10
            goto L5c
        L10:
            android.widget.ImageView r1 = r4.b
            if (r1 != 0) goto L1b
            if (r5 != 0) goto L1b
            boolean r2 = r4.m
            if (r2 != 0) goto L1b
            goto L5c
        L1b:
            r2 = 0
            if (r1 != 0) goto L37
            android.view.LayoutInflater r1 = r4.getInflater()
            int r3 = androidx.appcompat.R.layout.abc_list_menu_item_icon
            android.view.View r1 = r1.inflate(r3, r4, r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r4.b = r1
            android.widget.LinearLayout r3 = r4.i
            if (r3 == 0) goto L34
            r3.addView(r1, r2)
            goto L37
        L34:
            r4.addView(r1, r2)
        L37:
            if (r5 != 0) goto L46
            boolean r1 = r4.m
            if (r1 == 0) goto L3e
            goto L46
        L3e:
            android.widget.ImageView r5 = r4.b
            r0 = 8
            r5.setVisibility(r0)
            return
        L46:
            android.widget.ImageView r1 = r4.b
            if (r0 == 0) goto L4b
            goto L4c
        L4b:
            r5 = 0
        L4c:
            r1.setImageDrawable(r5)
            android.widget.ImageView r5 = r4.b
            int r5 = r5.getVisibility()
            if (r5 == 0) goto L5c
            android.widget.ImageView r5 = r4.b
            r5.setVisibility(r2)
        L5c:
            return
    }

    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            if (r2 == 0) goto L16
            android.widget.TextView r0 = r1.d
            r0.setText(r2)
            android.widget.TextView r2 = r1.d
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L25
            android.widget.TextView r2 = r1.d
            r0 = 0
            r2.setVisibility(r0)
            return
        L16:
            android.widget.TextView r2 = r1.d
            int r2 = r2.getVisibility()
            r0 = 8
            if (r2 == r0) goto L25
            android.widget.TextView r2 = r1.d
            r2.setVisibility(r0)
        L25:
            return
    }
}
