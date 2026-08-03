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
    public static final int[] f2396G = {R.attr.state_checked};

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

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2406y = true;
        C0994d c0994d = new C0994d(this, 2);
        this.f2402F = c0994d;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C1031R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C1031R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C1031R.id.design_menu_item_text);
        this.f2407z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC0080Q.m291j(checkedTextView, c0994d);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f2397A == null) {
                this.f2397A = (FrameLayout) ((ViewStub) findViewById(C1031R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f2397A.removeAllViews();
            this.f2397A.addView(view);
        }
    }

    @Override // p055f.InterfaceC0786q
    /* JADX INFO: renamed from: c */
    public final void mo1113c(MenuItemC0780k menuItemC0780k) {
        StateListDrawable stateListDrawable;
        this.f2398B = menuItemC0780k;
        int i2 = menuItemC0780k.f2807a;
        if (i2 > 0) {
            setId(i2);
        }
        setVisibility(menuItemC0780k.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(C1031R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f2396G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            Field field = AbstractC0080Q.f219a;
            setBackground(stateListDrawable);
        }
        setCheckable(menuItemC0780k.isCheckable());
        setChecked(menuItemC0780k.isChecked());
        setEnabled(menuItemC0780k.isEnabled());
        setTitle(menuItemC0780k.f2811e);
        setIcon(menuItemC0780k.getIcon());
        View view = menuItemC0780k.f2832z;
        if (view == null) {
            view = null;
        }
        setActionView(view);
        setContentDescription(menuItemC0780k.f2823q);
        AbstractC0875N0.m2199a(this, menuItemC0780k.f2824r);
        MenuItemC0780k menuItemC0780k2 = this.f2398B;
        CharSequence charSequence = menuItemC0780k2.f2811e;
        CheckedTextView checkedTextView = this.f2407z;
        if (charSequence == null && menuItemC0780k2.getIcon() == null) {
            View view2 = this.f2398B.f2832z;
            if ((view2 != null ? view2 : null) != null) {
                checkedTextView.setVisibility(8);
                FrameLayout frameLayout = this.f2397A;
                if (frameLayout != null) {
                    C0901f0 c0901f0 = (C0901f0) frameLayout.getLayoutParams();
                    ((LinearLayout.LayoutParams) c0901f0).width = -1;
                    this.f2397A.setLayoutParams(c0901f0);
                    return;
                }
                return;
            }
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f2397A;
        if (frameLayout2 != null) {
            C0901f0 c0901f02 = (C0901f0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0901f02).width = -2;
            this.f2397A.setLayoutParams(c0901f02);
        }
    }

    @Override // p055f.InterfaceC0786q
    public MenuItemC0780k getItemData() {
        return this.f2398B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        MenuItemC0780k menuItemC0780k = this.f2398B;
        if (menuItemC0780k != null && menuItemC0780k.isCheckable() && this.f2398B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f2396G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f2405x != z2) {
            this.f2405x = z2;
            this.f2402F.mo318h(this.f2407z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f2407z;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f2406y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, getPaddingTop(), i2, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f2400D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                AbstractC1111a.m2626h(drawable, this.f2399C);
            }
            int i2 = this.f2403v;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.f2404w) {
            if (this.f2401E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AbstractC1094m.f4210a;
                Drawable drawableM2579a = AbstractC1090i.m2579a(resources, C1031R.drawable.navigation_empty_icon, theme);
                this.f2401E = drawableM2579a;
                if (drawableM2579a != null) {
                    int i3 = this.f2403v;
                    drawableM2579a.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.f2401E;
        }
        this.f2407z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i2) {
        this.f2407z.setCompoundDrawablePadding(i2);
    }

    public void setIconSize(int i2) {
        this.f2403v = i2;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f2399C = colorStateList;
        this.f2400D = colorStateList != null;
        MenuItemC0780k menuItemC0780k = this.f2398B;
        if (menuItemC0780k != null) {
            setIcon(menuItemC0780k.getIcon());
        }
    }

    public void setMaxLines(int i2) {
        this.f2407z.setMaxLines(i2);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f2404w = z2;
    }

    public void setTextAppearance(int i2) {
        this.f2407z.setTextAppearance(i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f2407z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2407z.setText(charSequence);
    }
}
