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
import p000.AbstractC0125Cw;
import p000.AbstractC1143ai;
import p000.AbstractC2185lE;
import p000.AbstractC2706xB;
import p000.C1421fo;
import p000.C1486h8;
import p000.C2427qr;
import p000.InterfaceC0249Fr;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC1143ai implements InterfaceC0249Fr {

    /* JADX INFO: renamed from: G */
    public static final int[] f4549G = null;

    /* JADX INFO: renamed from: A */
    public FrameLayout f4550A;

    /* JADX INFO: renamed from: B */
    public C2427qr f4551B;

    /* JADX INFO: renamed from: C */
    public ColorStateList f4552C;

    /* JADX INFO: renamed from: D */
    public boolean f4553D;

    /* JADX INFO: renamed from: E */
    public Drawable f4554E;

    /* JADX INFO: renamed from: F */
    public final C1486h8 f4555F;

    /* JADX INFO: renamed from: v */
    public int f4556v;

    /* JADX INFO: renamed from: w */
    public boolean f4557w;

    /* JADX INFO: renamed from: x */
    public boolean f4558x;

    /* JADX INFO: renamed from: y */
    public final boolean f4559y;

    /* JADX INFO: renamed from: z */
    public final CheckedTextView f4560z;

    static {
        f4549G = new int[]{R.attr.state_checked};
    }

    public NavigationMenuItemView(Context r4, AttributeSet r5) {
        super(r4, r5);
        this.f4559y = true;
        C1486h8 r0 = new C1486h8(3, this);
        this.f4555F = r0;
        setOrientation(0);
        LayoutInflater.from(r4).inflate(io.github.cherrywechat.R.layout.design_navigation_menu_item, this, true);
        setIconSize(r4.getResources().getDimensionPixelSize(io.github.cherrywechat.R.dimen.design_navigation_icon_size));
        CheckedTextView r42 = (CheckedTextView) findViewById(io.github.cherrywechat.R.id.design_menu_item_text);
        this.f4560z = r42;
        AbstractC2185lE.m4399l(r42, r0);
    }

    private void setActionView(View r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        if (this.f4550A != null) goto L7;
        this.f4550A = (FrameLayout) ((ViewStub) findViewById(io.github.cherrywechat.R.id.design_menu_item_action_area_stub)).inflate();
    L7:
        if (r2.getParent() == null) goto L9;
        ((ViewGroup) r2.getParent()).removeView(r2);
    L9:
        this.f4550A.removeAllViews();
        this.f4550A.addView(r2);
    }

    @Override // p000.InterfaceC0249Fr
    /* JADX INFO: renamed from: c */
    public final void mo521c(C2427qr r7) {
        this.f4551B = r7;
        int r0 = r7.f8492a;
        if (r0 <= 0) goto L6;
        setId(r0);
    L6:
        if (r7.isVisible() == false) goto L8;
        int r02 = 0;
    L9:
        setVisibility(r02);
        if (getBackground() != null) goto L16;
        TypedValue r03 = new TypedValue();
        if (getContext().getTheme().resolveAttribute(io.github.cherrywechat.R.attr.colorControlHighlight, r03, true) == false) goto L14;
        StateListDrawable r3 = new StateListDrawable();
        r3.addState(f4549G, new ColorDrawable(r03.data));
        r3.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
    L15:
        setBackground(r3);
        goto L16
    L14:
        r3 = null;
    L16:
        setCheckable(r7.isCheckable());
        setChecked(r7.isChecked());
        setEnabled(r7.isEnabled());
        setTitle(r7.f8496e);
        setIcon(r7.getIcon());
        setActionView(r7.getActionView());
        setContentDescription(r7.f8508q);
        AbstractC2706xB.m5280a(this, r7.f8509r);
        C2427qr r72 = this.f4551B;
        CharSequence r04 = r72.f8496e;
        CheckedTextView r32 = this.f4560z;
        if (r04 == null) goto L19;
    L26:
        r32.setVisibility(0);
        FrameLayout r73 = this.f4550A;
        if (r73 == null) goto L31;
        C1421fo r74 = (C1421fo) r73.getLayoutParams();
        ((LinearLayout.LayoutParams) r74).width = -2;
        this.f4550A.setLayoutParams(r74);
        return;
    L31:
        return;
    L19:
        if (r72.getIcon() != null) goto L26;
        if (this.f4551B.getActionView() == null) goto L26;
        r32.setVisibility(8);
        FrameLayout r75 = this.f4550A;
        if (r75 == null) goto L30;
        C1421fo r76 = (C1421fo) r75.getLayoutParams();
        ((LinearLayout.LayoutParams) r76).width = -1;
        this.f4550A.setLayoutParams(r76);
        return;
    L30:
        return;
    L8:
        r02 = 8;
        goto L9
    }

    @Override // p000.InterfaceC0249Fr
    public C2427qr getItemData() {
        return this.f4551B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int r2) {
        int[] r22 = super.onCreateDrawableState(r2 + 1);
        C2427qr r0 = this.f4551B;
        if (r0 != null) goto L5;
    L9:
        return r22;
    L5:
        if (r0.isCheckable() == false) goto L9;
        if (this.f4551B.isChecked() == false) goto L9;
        View.mergeDrawableStates(r22, f4549G);
        goto L9
    }

    public void setCheckable(boolean r3) {
        refreshDrawableState();
        if (this.f4558x == r3) goto L6;
        this.f4558x = r3;
        CheckedTextView r32 = this.f4560z;
        this.f4555F.mo323h(r32, 2048);
        return;
    }

    public void setChecked(boolean r3) {
        refreshDrawableState();
        CheckedTextView r0 = this.f4560z;
        r0.setChecked(r3);
        Typeface r1 = r0.getTypeface();
        if (r3 == true) goto L5;
    L7:
        int r32 = 0;
    L8:
        r0.setTypeface(r1, r32);
        return;
    L5:
        if (this.f4559y == false) goto L7;
        r32 = 1;
        goto L8
    }

    public void setHorizontalPadding(int r3) {
        setPadding(r3, getPaddingTop(), r3, getPaddingBottom());
    }

    public void setIcon(Drawable r4) {
        if (r4 == null) goto L13;
        if (this.f4553D == false) goto L11;
        Drawable.ConstantState r1 = r4.getConstantState();
        if (r1 == null) goto L10;
        r4 = r1.newDrawable();
    L10:
        r4 = r4.mutate();
        r4.setTintList(this.f4552C);
    L11:
        int r12 = this.f4556v;
        r4.setBounds(0, 0, r12, r12);
    L20:
        this.f4560z.setCompoundDrawablesRelative(r4, null, null, null);
        return;
    L13:
        if (this.f4557w == false) goto L20;
        if (this.f4554E != null) goto L19;
        Resources r42 = getResources();
        Resources.Theme r13 = getContext().getTheme();
        ThreadLocal r2 = AbstractC0125Cw.f295a;
        Drawable r43 = r42.getDrawable(io.github.cherrywechat.R.drawable.navigation_empty_icon, r13);
        this.f4554E = r43;
        if (r43 == null) goto L19;
        int r14 = this.f4556v;
        r43.setBounds(0, 0, r14, r14);
    L19:
        r4 = this.f4554E;
        goto L20
    }

    public void setIconPadding(int r2) {
        this.f4560z.setCompoundDrawablePadding(r2);
    }

    public void setIconSize(int r1) {
        this.f4556v = r1;
    }

    public void setIconTintList(ColorStateList r1) {
        this.f4552C = r1;
        if (r1 == null) goto L5;
        boolean r12 = true;
    L6:
        this.f4553D = r12;
        C2427qr r13 = this.f4551B;
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
        this.f4560z.setMaxLines(r2);
    }

    public void setNeedsEmptyIcon(boolean r1) {
        this.f4557w = r1;
    }

    public void setTextAppearance(int r2) {
        this.f4560z.setTextAppearance(r2);
    }

    public void setTextColor(ColorStateList r2) {
        this.f4560z.setTextColor(r2);
    }

    public void setTitle(CharSequence r2) {
        this.f4560z.setText(r2);
    }
}
