package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
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
    public static final int[] f4549G = {R.attr.state_checked};

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

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4559y = true;
        C1486h8 c1486h8 = new C1486h8(3, this);
        this.f4555F = c1486h8;
        setOrientation(0);
        LayoutInflater.from(context).inflate(io.github.cherrywechat.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(io.github.cherrywechat.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(io.github.cherrywechat.R.id.design_menu_item_text);
        this.f4560z = checkedTextView;
        AbstractC2185lE.m4399l(checkedTextView, c1486h8);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f4550A == null) {
                this.f4550A = (FrameLayout) ((ViewStub) findViewById(io.github.cherrywechat.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f4550A.removeAllViews();
            this.f4550A.addView(view);
        }
    }

    @Override // p000.InterfaceC0249Fr
    /* JADX INFO: renamed from: c */
    public final void mo521c(C2427qr c2427qr) {
        StateListDrawable stateListDrawable;
        this.f4551B = c2427qr;
        int i = c2427qr.f8492a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c2427qr.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(io.github.cherrywechat.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f4549G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(c2427qr.isCheckable());
        setChecked(c2427qr.isChecked());
        setEnabled(c2427qr.isEnabled());
        setTitle(c2427qr.f8496e);
        setIcon(c2427qr.getIcon());
        setActionView(c2427qr.getActionView());
        setContentDescription(c2427qr.f8508q);
        AbstractC2706xB.m5280a(this, c2427qr.f8509r);
        C2427qr c2427qr2 = this.f4551B;
        CharSequence charSequence = c2427qr2.f8496e;
        CheckedTextView checkedTextView = this.f4560z;
        if (charSequence == null && c2427qr2.getIcon() == null && this.f4551B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f4550A;
            if (frameLayout != null) {
                C1421fo c1421fo = (C1421fo) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c1421fo).width = -1;
                this.f4550A.setLayoutParams(c1421fo);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f4550A;
        if (frameLayout2 != null) {
            C1421fo c1421fo2 = (C1421fo) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c1421fo2).width = -2;
            this.f4550A.setLayoutParams(c1421fo2);
        }
    }

    @Override // p000.InterfaceC0249Fr
    public C2427qr getItemData() {
        return this.f4551B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C2427qr c2427qr = this.f4551B;
        if (c2427qr != null && c2427qr.isCheckable() && this.f4551B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f4549G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f4558x != z) {
            this.f4558x = z;
            this.f4555F.mo323h(this.f4560z, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f4560z;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.f4559y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f4553D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f4552C);
            }
            int i = this.f4556v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f4557w) {
            if (this.f4554E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AbstractC0125Cw.f295a;
                Drawable drawable2 = resources.getDrawable(io.github.cherrywechat.R.drawable.navigation_empty_icon, theme);
                this.f4554E = drawable2;
                if (drawable2 != null) {
                    int i2 = this.f4556v;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f4554E;
        }
        this.f4560z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f4560z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f4556v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f4552C = colorStateList;
        this.f4553D = colorStateList != null;
        C2427qr c2427qr = this.f4551B;
        if (c2427qr != null) {
            setIcon(c2427qr.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f4560z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f4557w = z;
    }

    public void setTextAppearance(int i) {
        this.f4560z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f4560z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f4560z.setText(charSequence);
    }
}
