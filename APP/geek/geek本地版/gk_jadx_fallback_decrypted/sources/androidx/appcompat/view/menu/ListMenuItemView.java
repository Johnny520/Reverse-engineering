package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends android.widget.LinearLayout implements defpackage.ev, android.widget.AbsListView.SelectionBoundsAdjuster {
    public defpackage.ou a;
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
            r4.<init>(r5, r6)
            android.content.Context r0 = r4.getContext()
            int[] r1 = defpackage.xy.r
            r2 = 2130969240(0x7f040298, float:1.7547156E38)
            r5 r6 = defpackage.r5.y(r0, r6, r1, r2)
            r0 = 5
            android.graphics.drawable.Drawable r0 = r6.m(r0)
            r4.j = r0
            java.lang.Object r0 = r6.b
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            r1 = 1
            r2 = -1
            int r1 = r0.getResourceId(r1, r2)
            r4.k = r1
            r1 = 7
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            r4.m = r0
            r4.l = r5
            r0 = 8
            android.graphics.drawable.Drawable r0 = r6.m(r0)
            r4.n = r0
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r0 = 16843049(0x1010129, float:2.369439E-38)
            int[] r0 = new int[]{r0}
            r1 = 2130968955(0x7f04017b, float:1.7546578E38)
            r3 = 0
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r3, r0, r1, r2)
            boolean r0 = r5.hasValue(r2)
            r4.o = r0
            r6.z()
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

    @Override // defpackage.ev
    public final void c(defpackage.ou r11) {
            r10 = this;
            r10.a = r11
            boolean r0 = r11.isVisible()
            ku r1 = r11.n
            r2 = 8
            r3 = 0
            if (r0 == 0) goto Lf
            r0 = r3
            goto L10
        Lf:
            r0 = r2
        L10:
            r10.setVisibility(r0)
            java.lang.CharSequence r0 = r11.e
            r10.setTitle(r0)
            boolean r0 = r11.isCheckable()
            r10.setCheckable(r0)
            boolean r0 = r1.o()
            r4 = 1
            if (r0 == 0) goto L35
            boolean r0 = r1.n()
            if (r0 == 0) goto L2f
            char r0 = r11.j
            goto L31
        L2f:
            char r0 = r11.h
        L31:
            if (r0 == 0) goto L35
            r0 = r4
            goto L36
        L35:
            r0 = r3
        L36:
            r1.n()
            if (r0 == 0) goto L58
            ou r0 = r10.a
            ku r1 = r0.n
            boolean r5 = r1.o()
            if (r5 == 0) goto L54
            boolean r1 = r1.n()
            if (r1 == 0) goto L4e
            char r0 = r0.j
            goto L50
        L4e:
            char r0 = r0.h
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
            android.widget.TextView r0 = r10.f
            ou r1 = r10.a
            ku r5 = r1.n
            android.content.Context r6 = r5.a
            boolean r7 = r5.n()
            if (r7 == 0) goto L6c
            char r7 = r1.j
            goto L6e
        L6c:
            char r7 = r1.h
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
            r6 = 2131755025(0x7f100011, float:1.9140918E38)
            java.lang.String r6 = r8.getString(r6)
            r9.append(r6)
        L91:
            boolean r5 = r5.n()
            if (r5 == 0) goto L9a
            int r1 = r1.k
            goto L9c
        L9a:
            int r1 = r1.i
        L9c:
            r5 = 2131755021(0x7f10000d, float:1.914091E38)
            java.lang.String r5 = r8.getString(r5)
            r6 = 65536(0x10000, float:9.1835E-41)
            defpackage.ou.c(r9, r1, r6, r5)
            r5 = 2131755017(0x7f100009, float:1.9140901E38)
            java.lang.String r5 = r8.getString(r5)
            r6 = 4096(0x1000, float:5.74E-42)
            defpackage.ou.c(r9, r1, r6, r5)
            r5 = 2131755016(0x7f100008, float:1.91409E38)
            java.lang.String r5 = r8.getString(r5)
            r6 = 2
            defpackage.ou.c(r9, r1, r6, r5)
            r5 = 2131755022(0x7f10000e, float:1.9140912E38)
            java.lang.String r5 = r8.getString(r5)
            defpackage.ou.c(r9, r1, r4, r5)
            r4 = 2131755024(0x7f100010, float:1.9140916E38)
            java.lang.String r4 = r8.getString(r4)
            r5 = 4
            defpackage.ou.c(r9, r1, r5, r4)
            r4 = 2131755020(0x7f10000c, float:1.9140907E38)
            java.lang.String r4 = r8.getString(r4)
            defpackage.ou.c(r9, r1, r2, r4)
            if (r7 == r2) goto L102
            r1 = 10
            if (r7 == r1) goto Lf7
            r1 = 32
            if (r7 == r1) goto Lec
            r9.append(r7)
            goto L10c
        Lec:
            r1 = 2131755023(0x7f10000f, float:1.9140914E38)
            java.lang.String r1 = r8.getString(r1)
            r9.append(r1)
            goto L10c
        Lf7:
            r1 = 2131755019(0x7f10000b, float:1.9140905E38)
            java.lang.String r1 = r8.getString(r1)
            r9.append(r1)
            goto L10c
        L102:
            r1 = 2131755018(0x7f10000a, float:1.9140903E38)
            java.lang.String r1 = r8.getString(r1)
            r9.append(r1)
        L10c:
            java.lang.String r1 = r9.toString()
        L110:
            r0.setText(r1)
        L113:
            android.widget.TextView r0 = r10.f
            int r0 = r0.getVisibility()
            if (r0 == r3) goto L120
            android.widget.TextView r0 = r10.f
            r0.setVisibility(r3)
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

    @Override // defpackage.ev
    public defpackage.ou getItemData() {
            r1 = this;
            ou r0 = r1.a
            return r0
    }

    @Override // android.view.View
    public final void onFinishInflate() {
            r3 = this;
            super.onFinishInflate()
            java.util.WeakHashMap r0 = defpackage.ja0.a
            android.graphics.drawable.Drawable r0 = r3.j
            defpackage.s90.q(r3, r0)
            r0 = 2131296671(0x7f09019f, float:1.8211265E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.d = r0
            r1 = -1
            int r2 = r3.k
            if (r2 == r1) goto L1f
            android.content.Context r1 = r3.l
            r0.setTextAppearance(r1, r2)
        L1f:
            r0 = 2131296608(0x7f090160, float:1.8211137E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3.f = r0
            r0 = 2131296638(0x7f09017e, float:1.8211198E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.g = r0
            if (r0 == 0) goto L3c
            android.graphics.drawable.Drawable r1 = r3.n
            r0.setImageDrawable(r1)
        L3c:
            r0 = 2131296435(0x7f0900b3, float:1.8210787E38)
            android.view.View r0 = r3.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r3.h = r0
            r0 = 2131296365(0x7f09006d, float:1.8210645E38)
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
            goto L8b
        Lc:
            ou r0 = r4.a
            int r0 = r0.x
            r0 = r0 & 4
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L39
            android.widget.RadioButton r0 = r4.c
            if (r0 != 0) goto L34
            android.view.LayoutInflater r0 = r4.getInflater()
            r3 = 2131492881(0x7f0c0011, float:1.8609226E38)
            android.view.View r0 = r0.inflate(r3, r4, r2)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r4.c = r0
            android.widget.LinearLayout r3 = r4.i
            if (r3 == 0) goto L31
            r3.addView(r0, r1)
            goto L34
        L31:
            r4.addView(r0, r1)
        L34:
            android.widget.RadioButton r0 = r4.c
            android.widget.CheckBox r1 = r4.e
            goto L5b
        L39:
            android.widget.CheckBox r0 = r4.e
            if (r0 != 0) goto L57
            android.view.LayoutInflater r0 = r4.getInflater()
            r3 = 2131492878(0x7f0c000e, float:1.860922E38)
            android.view.View r0 = r0.inflate(r3, r4, r2)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r4.e = r0
            android.widget.LinearLayout r3 = r4.i
            if (r3 == 0) goto L54
            r3.addView(r0, r1)
            goto L57
        L54:
            r4.addView(r0, r1)
        L57:
            android.widget.CheckBox r0 = r4.e
            android.widget.RadioButton r1 = r4.c
        L5b:
            r3 = 8
            if (r5 == 0) goto L7d
            ou r5 = r4.a
            boolean r5 = r5.isChecked()
            r0.setChecked(r5)
            int r5 = r0.getVisibility()
            if (r5 == 0) goto L71
            r0.setVisibility(r2)
        L71:
            if (r1 == 0) goto L8b
            int r5 = r1.getVisibility()
            if (r5 == r3) goto L8b
            r1.setVisibility(r3)
            return
        L7d:
            android.widget.CheckBox r5 = r4.e
            if (r5 == 0) goto L84
            r5.setVisibility(r3)
        L84:
            android.widget.RadioButton r5 = r4.c
            if (r5 == 0) goto L8b
            r5.setVisibility(r3)
        L8b:
            return
    }

    public void setChecked(boolean r5) {
            r4 = this;
            ou r0 = r4.a
            int r0 = r0.x
            r0 = r0 & 4
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L2b
            android.widget.RadioButton r0 = r4.c
            if (r0 != 0) goto L28
            android.view.LayoutInflater r0 = r4.getInflater()
            r3 = 2131492881(0x7f0c0011, float:1.8609226E38)
            android.view.View r0 = r0.inflate(r3, r4, r2)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r4.c = r0
            android.widget.LinearLayout r2 = r4.i
            if (r2 == 0) goto L25
            r2.addView(r0, r1)
            goto L28
        L25:
            r4.addView(r0, r1)
        L28:
            android.widget.RadioButton r0 = r4.c
            goto L4b
        L2b:
            android.widget.CheckBox r0 = r4.e
            if (r0 != 0) goto L49
            android.view.LayoutInflater r0 = r4.getInflater()
            r3 = 2131492878(0x7f0c000e, float:1.860922E38)
            android.view.View r0 = r0.inflate(r3, r4, r2)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r4.e = r0
            android.widget.LinearLayout r2 = r4.i
            if (r2 == 0) goto L46
            r2.addView(r0, r1)
            goto L49
        L46:
            r4.addView(r0, r1)
        L49:
            android.widget.CheckBox r0 = r4.e
        L4b:
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
            ou r0 = r4.a
            ku r0 = r0.n
            boolean r0 = r4.q
            if (r0 != 0) goto Ld
            boolean r1 = r4.m
            if (r1 != 0) goto Ld
            goto L5a
        Ld:
            android.widget.ImageView r1 = r4.b
            if (r1 != 0) goto L18
            if (r5 != 0) goto L18
            boolean r2 = r4.m
            if (r2 != 0) goto L18
            goto L5a
        L18:
            r2 = 0
            if (r1 != 0) goto L35
            android.view.LayoutInflater r1 = r4.getInflater()
            r3 = 2131492879(0x7f0c000f, float:1.8609222E38)
            android.view.View r1 = r1.inflate(r3, r4, r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r4.b = r1
            android.widget.LinearLayout r3 = r4.i
            if (r3 == 0) goto L32
            r3.addView(r1, r2)
            goto L35
        L32:
            r4.addView(r1, r2)
        L35:
            if (r5 != 0) goto L44
            boolean r1 = r4.m
            if (r1 == 0) goto L3c
            goto L44
        L3c:
            android.widget.ImageView r5 = r4.b
            r0 = 8
            r5.setVisibility(r0)
            return
        L44:
            android.widget.ImageView r1 = r4.b
            if (r0 == 0) goto L49
            goto L4a
        L49:
            r5 = 0
        L4a:
            r1.setImageDrawable(r5)
            android.widget.ImageView r5 = r4.b
            int r5 = r5.getVisibility()
            if (r5 == 0) goto L5a
            android.widget.ImageView r5 = r4.b
            r5.setVisibility(r2)
        L5a:
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
