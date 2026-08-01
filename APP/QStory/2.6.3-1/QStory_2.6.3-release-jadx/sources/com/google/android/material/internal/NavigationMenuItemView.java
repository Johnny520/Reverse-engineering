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
import androidx.appcompat.widget.AbstractC0994;
import androidx.appcompat.widget.C1010;
import androidx.core.view.AbstractC3103;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.button.C3932;
import p177.AbstractC8475;
import p206.C8629;
import p206.InterfaceC8616;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC3993 implements InterfaceC8616 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static final int[] f10764 = {R.attr.state_checked};

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final C3932 f10765;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public ColorStateList f10766;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public C8629 f10767;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public Drawable f10768;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f10769;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final CheckedTextView f10770;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public FrameLayout f10771;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f10772;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f10773;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final boolean f10774;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public boolean f10775;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10774 = true;
        C3932 c3932 = new C3932(this, 3);
        this.f10765 = c3932;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C0328R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C0328R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C0328R.id.design_menu_item_text);
        this.f10770 = checkedTextView;
        AbstractC3103.m4804(checkedTextView, c3932);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f10771 == null) {
                this.f10771 = (FrameLayout) ((ViewStub) findViewById(C0328R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f10771.removeAllViews();
            this.f10771.addView(view);
        }
    }

    @Override // p206.InterfaceC8616
    public C8629 getItemData() {
        return this.f10767;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C8629 c8629 = this.f10767;
        if (c8629 != null && c8629.isCheckable() && this.f10767.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10764);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f10775 != z) {
            this.f10775 = z;
            this.f10765.mo4759(this.f10770, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f10770;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.f10774) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f10769) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f10766);
            }
            int i = this.f10773;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f10772) {
            if (this.f10768 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AbstractC8475.f21101;
                Drawable drawable2 = resources.getDrawable(C0328R.drawable.navigation_empty_icon, theme);
                this.f10768 = drawable2;
                if (drawable2 != null) {
                    int i2 = this.f10773;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f10768;
        }
        this.f10770.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f10770.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f10773 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f10766 = colorStateList;
        this.f10769 = colorStateList != null;
        C8629 c8629 = this.f10767;
        if (c8629 != null) {
            setIcon(c8629.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f10770.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f10772 = z;
    }

    public void setTextAppearance(int i) {
        this.f10770.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f10770.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f10770.setText(charSequence);
    }

    @Override // p206.InterfaceC8616
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1014(C8629 c8629) {
        StateListDrawable stateListDrawable;
        this.f10767 = c8629;
        int i = c8629.f21589;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c8629.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(C0328R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f10764, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(c8629.isCheckable());
        setChecked(c8629.isChecked());
        setEnabled(c8629.isEnabled());
        setTitle(c8629.f21581);
        setIcon(c8629.getIcon());
        setActionView(c8629.getActionView());
        setContentDescription(c8629.f21579);
        AbstractC0994.m1161(this, c8629.f21578);
        C8629 c86292 = this.f10767;
        CharSequence charSequence = c86292.f21581;
        CheckedTextView checkedTextView = this.f10770;
        if (charSequence == null && c86292.getIcon() == null && this.f10767.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f10771;
            if (frameLayout != null) {
                C1010 c1010 = (C1010) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c1010).width = -1;
                this.f10771.setLayoutParams(c1010);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f10771;
        if (frameLayout2 != null) {
            C1010 c10102 = (C1010) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c10102).width = -2;
            this.f10771.setLayoutParams(c10102);
        }
    }
}
