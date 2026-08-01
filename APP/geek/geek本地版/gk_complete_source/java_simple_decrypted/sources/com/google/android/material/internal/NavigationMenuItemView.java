package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.aa;
import defpackage.c10;
import defpackage.ch;
import defpackage.ev;
import defpackage.hl;
import defpackage.ja0;
import defpackage.k60;
import defpackage.l70;
import defpackage.ou;
import defpackage.s90;
import defpackage.sq;
import defpackage.x00;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends hl implements ev {
    public static final int[] G = null;
    public FrameLayout A;
    public ou B;
    public ColorStateList C;
    public boolean D;
    public Drawable E;
    public final aa F;
    public int v;
    public boolean w;
    public boolean x;
    public final boolean y;
    public final CheckedTextView z;

    static {
        G = new int[]{R.attr.state_checked};
    }

    public NavigationMenuItemView(Context r4, AttributeSet r5) {
        super(r4, r5);
        this.y = true;
        aa r0 = new aa(3, this);
        this.F = r0;
        setOrientation(0);
        LayoutInflater.from(r4).inflate(com.ljx.wechatmod.R.layout.design_navigation_menu_item, this, true);
        setIconSize(r4.getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.design_navigation_icon_size));
        CheckedTextView r42 = (CheckedTextView) findViewById(com.ljx.wechatmod.R.id.design_menu_item_text);
        this.z = r42;
        r42.setDuplicateParentStateEnabled(true);
        ja0.l(r42, r0);
    }

    private void setActionView(View r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        if (this.A != null) goto L6;
        this.A = (FrameLayout) ((ViewStub) findViewById(com.ljx.wechatmod.R.id.design_menu_item_action_area_stub)).inflate();
    L6:
        this.A.removeAllViews();
        this.A.addView(r2);
    }

    @Override // defpackage.ev
    public final void c(ou r7) {
        this.B = r7;
        int r0 = r7.a;
        if (r0 <= 0) goto L6;
        setId(r0);
    L6:
        if (r7.isVisible() == false) goto L8;
        int r02 = 0;
    L9:
        setVisibility(r02);
        if (getBackground() != null) goto L16;
        TypedValue r03 = new TypedValue();
        if (getContext().getTheme().resolveAttribute(com.ljx.wechatmod.R.attr.colorControlHighlight, r03, true) == false) goto L14;
        StateListDrawable r3 = new StateListDrawable();
        r3.addState(G, new ColorDrawable(r03.data));
        r3.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
    L15:
        WeakHashMap r04 = ja0.a;
        s90.q(this, r3);
        goto L16
    L14:
        r3 = null;
    L16:
        setCheckable(r7.isCheckable());
        setChecked(r7.isChecked());
        setEnabled(r7.isEnabled());
        setTitle(r7.e);
        setIcon(r7.getIcon());
        setActionView(r7.getActionView());
        setContentDescription(r7.q);
        l70.a(this, r7.r);
        ou r72 = this.B;
        CharSequence r05 = r72.e;
        CheckedTextView r32 = this.z;
        if (r05 == null) goto L19;
    L26:
        r32.setVisibility(0);
        FrameLayout r73 = this.A;
        if (r73 == null) goto L31;
        sq r74 = (sq) r73.getLayoutParams();
        ((LinearLayout.LayoutParams) r74).width = -2;
        this.A.setLayoutParams(r74);
        return;
    L31:
        return;
    L19:
        if (r72.getIcon() != null) goto L26;
        if (this.B.getActionView() == null) goto L26;
        r32.setVisibility(8);
        FrameLayout r75 = this.A;
        if (r75 == null) goto L30;
        sq r76 = (sq) r75.getLayoutParams();
        ((LinearLayout.LayoutParams) r76).width = -1;
        this.A.setLayoutParams(r76);
        return;
    L30:
        return;
    L8:
        r02 = 8;
        goto L9
    }

    @Override // defpackage.ev
    public ou getItemData() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int r2) {
        int[] r22 = super.onCreateDrawableState(r2 + 1);
        ou r0 = this.B;
        if (r0 != null) goto L5;
    L9:
        return r22;
    L5:
        if (r0.isCheckable() == false) goto L9;
        if (this.B.isChecked() == false) goto L9;
        View.mergeDrawableStates(r22, G);
        goto L9
    }

    public void setCheckable(boolean r3) {
        refreshDrawableState();
        if (this.x == r3) goto L6;
        this.x = r3;
        CheckedTextView r32 = this.z;
        this.F.h(r32, 2048);
        return;
    }

    public void setChecked(boolean r3) {
        refreshDrawableState();
        CheckedTextView r0 = this.z;
        r0.setChecked(r3);
        Typeface r1 = r0.getTypeface();
        if (r3 == true) goto L5;
    L7:
        int r32 = 0;
    L8:
        r0.setTypeface(r1, r32);
        return;
    L5:
        if (this.y == false) goto L7;
        r32 = 1;
        goto L8
    }

    public void setHorizontalPadding(int r3) {
        setPadding(r3, getPaddingTop(), r3, getPaddingBottom());
    }

    public void setIcon(Drawable r4) {
        if (r4 == null) goto L13;
        if (this.D == false) goto L11;
        Drawable.ConstantState r1 = r4.getConstantState();
        if (r1 == null) goto L10;
        r4 = r1.newDrawable();
    L10:
        r4 = r4.mutate();
        ch.h(r4, this.C);
    L11:
        int r12 = this.v;
        r4.setBounds(0, 0, r12, r12);
    L20:
        k60.e(this.z, r4, null, null, null);
        return;
    L13:
        if (this.w == false) goto L20;
        if (this.E != null) goto L19;
        Resources r42 = getResources();
        Resources.Theme r13 = getContext().getTheme();
        ThreadLocal r2 = c10.a;
        Drawable r43 = x00.a(r42, com.ljx.wechatmod.R.drawable.navigation_empty_icon, r13);
        this.E = r43;
        if (r43 == null) goto L19;
        int r14 = this.v;
        r43.setBounds(0, 0, r14, r14);
    L19:
        r4 = this.E;
        goto L20
    }

    public void setIconPadding(int r2) {
        this.z.setCompoundDrawablePadding(r2);
    }

    public void setIconSize(int r1) {
        this.v = r1;
    }

    public void setIconTintList(ColorStateList r1) {
        this.C = r1;
        if (r1 == null) goto L5;
        boolean r12 = true;
    L6:
        this.D = r12;
        ou r13 = this.B;
        if (r13 == null) goto L10;
        setIcon(r13.getIcon());
        return;
    L10:
        return;
    L5:
        r12 = false;
        goto L6
    }

    public void setMaxLines(int r2) {
        this.z.setMaxLines(r2);
    }

    public void setNeedsEmptyIcon(boolean r1) {
        this.w = r1;
    }

    public void setTextAppearance(int r2) {
        this.z.setTextAppearance(r2);
    }

    public void setTextColor(ColorStateList r2) {
        this.z.setTextColor(r2);
    }

    public void setTitle(CharSequence r2) {
        this.z.setText(r2);
    }
}
