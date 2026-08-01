package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends defpackage.hl implements defpackage.ev {
    public static final int[] G = null;
    public android.widget.FrameLayout A;
    public defpackage.ou B;
    public android.content.res.ColorStateList C;
    public boolean D;
    public android.graphics.drawable.Drawable E;
    public final defpackage.aa F;
    public int v;
    public boolean w;
    public boolean x;
    public final boolean y;
    public final android.widget.CheckedTextView z;

    static {
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            com.google.android.material.internal.NavigationMenuItemView.G = r0
            return
    }

    public NavigationMenuItemView(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            r5 = 1
            r3.y = r5
            aa r0 = new aa
            r1 = 3
            r0.<init>(r1, r3)
            r3.F = r0
            r1 = 0
            r3.setOrientation(r1)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r4)
            r2 = 2131492906(0x7f0c002a, float:1.8609277E38)
            r1.inflate(r2, r3, r5)
            android.content.res.Resources r4 = r4.getResources()
            r1 = 2131165303(0x7f070077, float:1.794482E38)
            int r4 = r4.getDimensionPixelSize(r1)
            r3.setIconSize(r4)
            r4 = 2131296384(0x7f090080, float:1.8210683E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.CheckedTextView r4 = (android.widget.CheckedTextView) r4
            r3.z = r4
            r4.setDuplicateParentStateEnabled(r5)
            defpackage.ja0.l(r4, r0)
            return
    }

    private void setActionView(android.view.View r2) {
            r1 = this;
            if (r2 == 0) goto L21
            android.widget.FrameLayout r0 = r1.A
            if (r0 != 0) goto L17
            r0 = 2131296383(0x7f09007f, float:1.8210681E38)
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r0 = r0.inflate()
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1.A = r0
        L17:
            android.widget.FrameLayout r0 = r1.A
            r0.removeAllViews()
            android.widget.FrameLayout r0 = r1.A
            r0.addView(r2)
        L21:
            return
    }

    @Override // defpackage.ev
    public final void c(defpackage.ou r7) {
            r6 = this;
            r6.B = r7
            int r0 = r7.a
            if (r0 <= 0) goto L9
            r6.setId(r0)
        L9:
            boolean r0 = r7.isVisible()
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L14
            r0 = r2
            goto L15
        L14:
            r0 = r1
        L15:
            r6.setVisibility(r0)
            android.graphics.drawable.Drawable r0 = r6.getBackground()
            if (r0 != 0) goto L57
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r3 = r6.getContext()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r4 = 2130968801(0x7f0400e1, float:1.7546266E38)
            r5 = 1
            boolean r3 = r3.resolveAttribute(r4, r0, r5)
            if (r3 == 0) goto L51
            android.graphics.drawable.StateListDrawable r3 = new android.graphics.drawable.StateListDrawable
            r3.<init>()
            android.graphics.drawable.ColorDrawable r4 = new android.graphics.drawable.ColorDrawable
            int r0 = r0.data
            r4.<init>(r0)
            int[] r0 = com.google.android.material.internal.NavigationMenuItemView.G
            r3.addState(r0, r4)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            int[] r4 = android.view.ViewGroup.EMPTY_STATE_SET
            r3.addState(r4, r0)
            goto L52
        L51:
            r3 = 0
        L52:
            java.util.WeakHashMap r0 = defpackage.ja0.a
            defpackage.s90.q(r6, r3)
        L57:
            boolean r0 = r7.isCheckable()
            r6.setCheckable(r0)
            boolean r0 = r7.isChecked()
            r6.setChecked(r0)
            boolean r0 = r7.isEnabled()
            r6.setEnabled(r0)
            java.lang.CharSequence r0 = r7.e
            r6.setTitle(r0)
            android.graphics.drawable.Drawable r0 = r7.getIcon()
            r6.setIcon(r0)
            android.view.View r0 = r7.getActionView()
            r6.setActionView(r0)
            java.lang.CharSequence r0 = r7.q
            r6.setContentDescription(r0)
            java.lang.CharSequence r7 = r7.r
            defpackage.l70.a(r6, r7)
            ou r7 = r6.B
            java.lang.CharSequence r0 = r7.e
            android.widget.CheckedTextView r3 = r6.z
            if (r0 != 0) goto Lb5
            android.graphics.drawable.Drawable r7 = r7.getIcon()
            if (r7 != 0) goto Lb5
            ou r7 = r6.B
            android.view.View r7 = r7.getActionView()
            if (r7 == 0) goto Lb5
            r3.setVisibility(r1)
            android.widget.FrameLayout r7 = r6.A
            if (r7 == 0) goto Lca
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            sq r7 = (defpackage.sq) r7
            r0 = -1
            r7.width = r0
            android.widget.FrameLayout r0 = r6.A
            r0.setLayoutParams(r7)
            return
        Lb5:
            r3.setVisibility(r2)
            android.widget.FrameLayout r7 = r6.A
            if (r7 == 0) goto Lca
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            sq r7 = (defpackage.sq) r7
            r0 = -2
            r7.width = r0
            android.widget.FrameLayout r0 = r6.A
            r0.setLayoutParams(r7)
        Lca:
            return
    }

    @Override // defpackage.ev
    public defpackage.ou getItemData() {
            r1 = this;
            ou r0 = r1.B
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 1
            int[] r2 = super.onCreateDrawableState(r2)
            ou r0 = r1.B
            if (r0 == 0) goto L1d
            boolean r0 = r0.isCheckable()
            if (r0 == 0) goto L1d
            ou r0 = r1.B
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L1d
            int[] r0 = com.google.android.material.internal.NavigationMenuItemView.G
            android.view.View.mergeDrawableStates(r2, r0)
        L1d:
            return r2
    }

    public void setCheckable(boolean r3) {
            r2 = this;
            r2.refreshDrawableState()
            boolean r0 = r2.x
            if (r0 == r3) goto L12
            r2.x = r3
            android.widget.CheckedTextView r3 = r2.z
            r0 = 2048(0x800, float:2.87E-42)
            aa r1 = r2.F
            r1.h(r3, r0)
        L12:
            return
    }

    public void setChecked(boolean r3) {
            r2 = this;
            r2.refreshDrawableState()
            android.widget.CheckedTextView r0 = r2.z
            r0.setChecked(r3)
            android.graphics.Typeface r1 = r0.getTypeface()
            if (r3 == 0) goto L14
            boolean r3 = r2.y
            if (r3 == 0) goto L14
            r3 = 1
            goto L15
        L14:
            r3 = 0
        L15:
            r0.setTypeface(r1, r3)
            return
    }

    public void setHorizontalPadding(int r3) {
            r2 = this;
            int r0 = r2.getPaddingTop()
            int r1 = r2.getPaddingBottom()
            r2.setPadding(r3, r0, r3, r1)
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L21
            boolean r1 = r3.D
            if (r1 == 0) goto L1b
            android.graphics.drawable.Drawable$ConstantState r1 = r4.getConstantState()
            if (r1 != 0) goto Le
            goto L12
        Le:
            android.graphics.drawable.Drawable r4 = r1.newDrawable()
        L12:
            android.graphics.drawable.Drawable r4 = r4.mutate()
            android.content.res.ColorStateList r1 = r3.C
            defpackage.ch.h(r4, r1)
        L1b:
            int r1 = r3.v
            r4.setBounds(r0, r0, r1, r1)
            goto L49
        L21:
            boolean r1 = r3.w
            if (r1 == 0) goto L49
            android.graphics.drawable.Drawable r4 = r3.E
            if (r4 != 0) goto L47
            android.content.res.Resources r4 = r3.getResources()
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            java.lang.ThreadLocal r2 = defpackage.c10.a
            r2 = 2131230928(0x7f0800d0, float:1.8077923E38)
            android.graphics.drawable.Drawable r4 = defpackage.x00.a(r4, r2, r1)
            r3.E = r4
            if (r4 == 0) goto L47
            int r1 = r3.v
            r4.setBounds(r0, r0, r1, r1)
        L47:
            android.graphics.drawable.Drawable r4 = r3.E
        L49:
            android.widget.CheckedTextView r0 = r3.z
            r1 = 0
            defpackage.k60.e(r0, r4, r1, r1, r1)
            return
    }

    public void setIconPadding(int r2) {
            r1 = this;
            android.widget.CheckedTextView r0 = r1.z
            r0.setCompoundDrawablePadding(r2)
            return
    }

    public void setIconSize(int r1) {
            r0 = this;
            r0.v = r1
            return
    }

    public void setIconTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.C = r1
            if (r1 == 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            r0.D = r1
            ou r1 = r0.B
            if (r1 == 0) goto L14
            android.graphics.drawable.Drawable r1 = r1.getIcon()
            r0.setIcon(r1)
        L14:
            return
    }

    public void setMaxLines(int r2) {
            r1 = this;
            android.widget.CheckedTextView r0 = r1.z
            r0.setMaxLines(r2)
            return
    }

    public void setNeedsEmptyIcon(boolean r1) {
            r0 = this;
            r0.w = r1
            return
    }

    public void setTextAppearance(int r2) {
            r1 = this;
            android.widget.CheckedTextView r0 = r1.z
            r0.setTextAppearance(r2)
            return
    }

    public void setTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.widget.CheckedTextView r0 = r1.z
            r0.setTextColor(r2)
            return
    }

    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.CheckedTextView r0 = r1.z
            r0.setText(r2)
            return
    }
}
