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
import java.lang.reflect.Field;
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0080Q;
import p055f.InterfaceC0786q;
import p055f.MenuItemC0780k;
import p057g.AbstractC0875N0;
import p057g.C0901f0;
import p070m0.C0994d;
import p081s0.AbstractC1070d;
import p083u.AbstractC1090i;
import p083u.AbstractC1094m;
import p087w.AbstractC1111a;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC1070d implements InterfaceC0786q {

    /* JADX INFO: renamed from: G */
    public static final int[] f2396G = null;

    /* JADX INFO: renamed from: A */
    public FrameLayout f2397A;

    /* JADX INFO: renamed from: B */
    public MenuItemC0780k f2398B;

    /* JADX INFO: renamed from: C */
    public ColorStateList f2399C;

    /* JADX INFO: renamed from: D */
    public boolean f2400D;

    /* JADX INFO: renamed from: E */
    public Drawable f2401E;

    /* JADX INFO: renamed from: F */
    public final C0994d f2402F;

    /* JADX INFO: renamed from: v */
    public int f2403v;

    /* JADX INFO: renamed from: w */
    public boolean f2404w;

    /* JADX INFO: renamed from: x */
    public boolean f2405x;

    /* JADX INFO: renamed from: y */
    public final boolean f2406y;

    /* JADX INFO: renamed from: z */
    public final CheckedTextView f2407z;

    static {
        f2396G = new int[]{R.attr.state_checked};
    }

    public NavigationMenuItemView(Context r4, AttributeSet r5) {
        super(r4, r5);
        this.f2406y = true;
        C0994d r02 = new C0994d(this, 2);
        this.f2402F = r02;
        setOrientation(0);
        LayoutInflater.from(r4).inflate(C1031R.layout.design_navigation_menu_item, this, true);
        setIconSize(r4.getResources().getDimensionPixelSize(C1031R.dimen.design_navigation_icon_size));
        CheckedTextView r42 = (CheckedTextView) findViewById(C1031R.id.design_menu_item_text);
        this.f2407z = r42;
        r42.setDuplicateParentStateEnabled(true);
        AbstractC0080Q.m291j(r42, r02);
    }

    private void setActionView(View r2) {
        if (r2 != null) goto L4;
        return;
    L4:
        if (this.f2397A != null) goto L7;
        this.f2397A = (FrameLayout) ((ViewStub) findViewById(C1031R.id.design_menu_item_action_area_stub)).inflate();
    L7:
        if (r2.getParent() == null) goto L9;
        ((ViewGroup) r2.getParent()).removeView(r2);
    L9:
        this.f2397A.removeAllViews();
        this.f2397A.addView(r2);
    }

    @Override // p055f.InterfaceC0786q
    /* JADX INFO: renamed from: c */
    public final void mo1113c(MenuItemC0780k r8) {
        this.f2398B = r8;
        int r02 = r8.f2807a;
        if (r02 <= 0) goto L6;
        setId(r02);
    L6:
        if (r8.isVisible() == false) goto L8;
        int r03 = 0;
    L9:
        setVisibility(r03);
        View r3 = null;
        if (getBackground() != null) goto L16;
        TypedValue r04 = new TypedValue();
        if (getContext().getTheme().resolveAttribute(C1031R.attr.colorControlHighlight, r04, true) == false) goto L14;
        StateListDrawable r4 = new StateListDrawable();
        r4.addState(f2396G, new ColorDrawable(r04.data));
        r4.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
    L15:
        Field r05 = AbstractC0080Q.f219a;
        setBackground(r4);
        goto L16
    L14:
        r4 = null;
    L16:
        setCheckable(r8.isCheckable());
        setChecked(r8.isChecked());
        setEnabled(r8.isEnabled());
        setTitle(r8.f2811e);
        setIcon(r8.getIcon());
        View r06 = r8.f2832z;
        if (r06 != null) goto L20;
        r06 = null;
    L20:
        setActionView(r06);
        setContentDescription(r8.f2823q);
        AbstractC0875N0.m2199a(this, r8.f2824r);
        MenuItemC0780k r82 = this.f2398B;
        CharSequence r07 = r82.f2811e;
        CheckedTextView r42 = this.f2407z;
        if (r07 == null) goto L23;
    L31:
        r42.setVisibility(0);
        FrameLayout r83 = this.f2397A;
        if (r83 == null) goto L37;
        C0901f0 r84 = (C0901f0) r83.getLayoutParams();
        ((LinearLayout.LayoutParams) r84).width = -2;
        this.f2397A.setLayoutParams(r84);
        return;
    L37:
        return;
    L23:
        if (r82.getIcon() != null) goto L31;
        View r85 = this.f2398B.f2832z;
        if (r85 == null) goto L27;
        r3 = r85;
    L27:
        if (r3 == null) goto L31;
        r42.setVisibility(8);
        FrameLayout r86 = this.f2397A;
        if (r86 == null) goto L35;
        C0901f0 r87 = (C0901f0) r86.getLayoutParams();
        ((LinearLayout.LayoutParams) r87).width = -1;
        this.f2397A.setLayoutParams(r87);
        return;
    L35:
        return;
    L8:
        r03 = 8;
        goto L9
    }

    @Override // p055f.InterfaceC0786q
    public MenuItemC0780k getItemData() {
        return this.f2398B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int r2) {
        int[] r22 = super.onCreateDrawableState(r2 + 1);
        MenuItemC0780k r02 = this.f2398B;
        if (r02 != null) goto L5;
    L9:
        return r22;
    L5:
        if (r02.isCheckable() == false) goto L9;
        if (this.f2398B.isChecked() == false) goto L9;
        View.mergeDrawableStates(r22, f2396G);
        goto L9
    }

    public void setCheckable(boolean r3) {
        refreshDrawableState();
        if (this.f2405x == r3) goto L6;
        this.f2405x = r3;
        CheckedTextView r32 = this.f2407z;
        this.f2402F.mo318h(r32, 2048);
        return;
    }

    public void setChecked(boolean r3) {
        refreshDrawableState();
        CheckedTextView r02 = this.f2407z;
        r02.setChecked(r3);
        Typeface r1 = r02.getTypeface();
        if (r3 == true) goto L5;
    L7:
        int r32 = 0;
    L8:
        r02.setTypeface(r1, r32);
        return;
    L5:
        if (this.f2406y == false) goto L7;
        r32 = 1;
        goto L8
    }

    public void setHorizontalPadding(int r3) {
        setPadding(r3, getPaddingTop(), r3, getPaddingBottom());
    }

    public void setIcon(Drawable r4) {
        if (r4 == null) goto L13;
        if (this.f2400D == false) goto L11;
        Drawable.ConstantState r1 = r4.getConstantState();
        if (r1 == null) goto L10;
        r4 = r1.newDrawable();
    L10:
        r4 = r4.mutate();
        AbstractC1111a.m2626h(r4, this.f2399C);
    L11:
        int r12 = this.f2403v;
        r4.setBounds(0, 0, r12, r12);
    L20:
        this.f2407z.setCompoundDrawablesRelative(r4, null, null, null);
        return;
    L13:
        if (this.f2404w == false) goto L20;
        if (this.f2401E != null) goto L19;
        Resources r42 = getResources();
        Resources.Theme r13 = getContext().getTheme();
        ThreadLocal r2 = AbstractC1094m.f4210a;
        Drawable r43 = AbstractC1090i.m2579a(r42, C1031R.drawable.navigation_empty_icon, r13);
        this.f2401E = r43;
        if (r43 == null) goto L19;
        int r14 = this.f2403v;
        r43.setBounds(0, 0, r14, r14);
    L19:
        r4 = this.f2401E;
        goto L20
    }

    public void setIconPadding(int r2) {
        this.f2407z.setCompoundDrawablePadding(r2);
    }

    public void setIconSize(int r1) {
        this.f2403v = r1;
    }

    public void setIconTintList(ColorStateList r1) {
        this.f2399C = r1;
        if (r1 == null) goto L5;
        boolean r12 = true;
    L6:
        this.f2400D = r12;
        MenuItemC0780k r13 = this.f2398B;
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
        this.f2407z.setMaxLines(r2);
    }

    public void setNeedsEmptyIcon(boolean r1) {
        this.f2404w = r1;
    }

    public void setTextAppearance(int r2) {
        this.f2407z.setTextAppearance(r2);
    }

    public void setTextColor(ColorStateList r2) {
        this.f2407z.setTextColor(r2);
    }

    public void setTitle(CharSequence r2) {
        this.f2407z.setText(r2);
    }
}
