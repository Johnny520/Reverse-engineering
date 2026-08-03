package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends a.U6 implements androidx.appcompat.view.menu.k.a {
    public static final int[] G = null;
    public android.widget.FrameLayout A;
    public androidx.appcompat.view.menu.h B;
    public android.content.res.ColorStateList C;
    public boolean D;
    public android.graphics.drawable.Drawable E;
    public final com.google.android.material.internal.NavigationMenuItemView.a F;
    public int v;
    public boolean w;
    public boolean x;
    public final boolean y;
    public final android.widget.CheckedTextView z;

    public class a extends a.C {
        public final /* synthetic */ com.google.android.material.internal.NavigationMenuItemView d;

        public a(com.google.android.material.internal.NavigationMenuItemView r1) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                return
        }

        @Override // a.C
        public final void d(android.view.View r2, a.I r3) {
                r1 = this;
                android.view.View$AccessibilityDelegate r0 = r1.f36a
                android.view.accessibility.AccessibilityNodeInfo r3 = r3.f118a
                r0.onInitializeAccessibilityNodeInfo(r2, r3)
                com.google.android.material.internal.NavigationMenuItemView r2 = r1.d
                boolean r2 = r2.x
                r3.setCheckable(r2)
                return
        }
    }

    static {
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            com.google.android.material.internal.NavigationMenuItemView.G = r0
            return
    }

    public NavigationMenuItemView(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 0
            r3.<init>(r4, r5, r0)
            r5 = 1
            r3.y = r5
            com.google.android.material.internal.NavigationMenuItemView$a r1 = new com.google.android.material.internal.NavigationMenuItemView$a
            r1.<init>(r3)
            r3.F = r1
            r3.setOrientation(r0)
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r4)
            int r2 = com.google.android.material.R.layout.design_navigation_menu_item
            r0.inflate(r2, r3, r5)
            android.content.res.Resources r4 = r4.getResources()
            int r0 = com.google.android.material.R.dimen.design_navigation_icon_size
            int r4 = r4.getDimensionPixelSize(r0)
            r3.setIconSize(r4)
            int r4 = com.google.android.material.R.id.design_menu_item_text
            android.view.View r4 = r3.findViewById(r4)
            android.widget.CheckedTextView r4 = (android.widget.CheckedTextView) r4
            r3.z = r4
            r4.setDuplicateParentStateEnabled(r5)
            a.C0414ug.j(r4, r1)
            return
    }

    private void setActionView(android.view.View r2) {
            r1 = this;
            if (r2 == 0) goto L2f
            android.widget.FrameLayout r0 = r1.A
            if (r0 != 0) goto L16
            int r0 = com.google.android.material.R.id.design_menu_item_action_area_stub
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r0 = r0.inflate()
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1.A = r0
        L16:
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L25
            android.view.ViewParent r0 = r2.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r2)
        L25:
            android.widget.FrameLayout r0 = r1.A
            r0.removeAllViews()
            android.widget.FrameLayout r0 = r1.A
            r0.addView(r2)
        L2f:
            return
    }

    @Override // androidx.appcompat.view.menu.k.a
    public final void b(androidx.appcompat.view.menu.h r7) {
            r6 = this;
            r6.B = r7
            int r0 = r7.f824a
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
            if (r0 != 0) goto L56
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r3 = r6.getContext()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            int r4 = androidx.appcompat.R.attr.colorControlHighlight
            r5 = 1
            boolean r3 = r3.resolveAttribute(r4, r0, r5)
            if (r3 == 0) goto L50
            android.graphics.drawable.StateListDrawable r3 = new android.graphics.drawable.StateListDrawable
            r3.<init>()
            int[] r4 = com.google.android.material.internal.NavigationMenuItemView.G
            android.graphics.drawable.ColorDrawable r5 = new android.graphics.drawable.ColorDrawable
            int r0 = r0.data
            r5.<init>(r0)
            r3.addState(r4, r5)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            int[] r4 = android.view.ViewGroup.EMPTY_STATE_SET
            r3.addState(r4, r0)
            goto L51
        L50:
            r3 = 0
        L51:
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            r6.setBackground(r3)
        L56:
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
            a.C0467xf.a(r6, r7)
            androidx.appcompat.view.menu.h r7 = r6.B
            java.lang.CharSequence r0 = r7.e
            android.widget.CheckedTextView r3 = r6.z
            if (r0 != 0) goto Lb4
            android.graphics.drawable.Drawable r7 = r7.getIcon()
            if (r7 != 0) goto Lb4
            androidx.appcompat.view.menu.h r7 = r6.B
            android.view.View r7 = r7.getActionView()
            if (r7 == 0) goto Lb4
            r3.setVisibility(r1)
            android.widget.FrameLayout r7 = r6.A
            if (r7 == 0) goto Lc9
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.b$a r7 = (androidx.appcompat.widget.b.a) r7
            r0 = -1
            r7.width = r0
            android.widget.FrameLayout r0 = r6.A
            r0.setLayoutParams(r7)
            return
        Lb4:
            r3.setVisibility(r2)
            android.widget.FrameLayout r7 = r6.A
            if (r7 == 0) goto Lc9
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.b$a r7 = (androidx.appcompat.widget.b.a) r7
            r0 = -2
            r7.width = r0
            android.widget.FrameLayout r0 = r6.A
            r0.setLayoutParams(r7)
        Lc9:
            return
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.h getItemData() {
            r1 = this;
            androidx.appcompat.view.menu.h r0 = r1.B
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 1
            int[] r2 = super.onCreateDrawableState(r2)
            androidx.appcompat.view.menu.h r0 = r1.B
            if (r0 == 0) goto L1d
            boolean r0 = r0.isCheckable()
            if (r0 == 0) goto L1d
            androidx.appcompat.view.menu.h r0 = r1.B
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
            com.google.android.material.internal.NavigationMenuItemView$a r1 = r2.F
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

    public void setIcon(android.graphics.drawable.Drawable r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L21
            boolean r1 = r4.D
            if (r1 == 0) goto L1b
            android.graphics.drawable.Drawable$ConstantState r1 = r5.getConstantState()
            if (r1 != 0) goto Le
            goto L12
        Le:
            android.graphics.drawable.Drawable r5 = r1.newDrawable()
        L12:
            android.graphics.drawable.Drawable r5 = r5.mutate()
            android.content.res.ColorStateList r1 = r4.C
            a.C0439w5.a.h(r5, r1)
        L1b:
            int r1 = r4.v
            r5.setBounds(r0, r0, r1, r1)
            goto L48
        L21:
            boolean r1 = r4.w
            if (r1 == 0) goto L48
            android.graphics.drawable.Drawable r5 = r4.E
            if (r5 != 0) goto L46
            android.content.res.Resources r5 = r4.getResources()
            int r1 = com.google.android.material.R.drawable.navigation_empty_icon
            android.content.Context r2 = r4.getContext()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            java.lang.ThreadLocal<android.util.TypedValue> r3 = a.C0340qd.f657a
            android.graphics.drawable.Drawable r5 = a.C0340qd.a.a(r5, r1, r2)
            r4.E = r5
            if (r5 == 0) goto L46
            int r1 = r4.v
            r5.setBounds(r0, r0, r1, r1)
        L46:
            android.graphics.drawable.Drawable r5 = r4.E
        L48:
            android.widget.CheckedTextView r0 = r4.z
            r1 = 0
            r0.setCompoundDrawablesRelative(r5, r1, r1, r1)
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
            androidx.appcompat.view.menu.h r1 = r0.B
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
