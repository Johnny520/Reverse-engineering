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
import androidx.appcompat.widget.AbstractC0147;
import androidx.appcompat.widget.C0163;
import androidx.core.view.AbstractC2270;
import com.google.android.material.button.C3100;
import p161.AbstractC7646;
import p190.C7800;
import p190.InterfaceC7787;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC3161 implements InterfaceC7787 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static final int[] f10419 = {R.attr.state_checked};

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final C3100 f10420;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public ColorStateList f10421;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public C7800 f10422;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public Drawable f10423;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f10424;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final CheckedTextView f10425;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public FrameLayout f10426;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f10427;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f10428;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final boolean f10429;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public boolean f10430;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10429 = true;
        C3100 c3100 = new C3100(this, 3);
        this.f10420 = c3100;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.davemorrissey.labs.subscaleview.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.davemorrissey.labs.subscaleview.R.id.design_menu_item_text);
        this.f10425 = checkedTextView;
        AbstractC2270.m4244(checkedTextView, c3100);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f10426 == null) {
                this.f10426 = (FrameLayout) ((ViewStub) findViewById(com.davemorrissey.labs.subscaleview.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f10426.removeAllViews();
            this.f10426.addView(view);
        }
    }

    @Override // p190.InterfaceC7787
    public C7800 getItemData() {
        return this.f10422;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C7800 c7800 = this.f10422;
        if (c7800 != null && c7800.isCheckable() && this.f10422.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10419);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f10430 != z) {
            this.f10430 = z;
            this.f10420.mo4199(this.f10425, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f10425;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.f10429) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f10424) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f10421);
            }
            int i = this.f10428;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f10427) {
            if (this.f10423 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AbstractC7646.f20756;
                Drawable drawable2 = resources.getDrawable(com.davemorrissey.labs.subscaleview.R.drawable.navigation_empty_icon, theme);
                this.f10423 = drawable2;
                if (drawable2 != null) {
                    int i2 = this.f10428;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f10423;
        }
        this.f10425.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f10425.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f10428 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f10421 = colorStateList;
        this.f10424 = colorStateList != null;
        C7800 c7800 = this.f10422;
        if (c7800 != null) {
            setIcon(c7800.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f10425.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f10427 = z;
    }

    public void setTextAppearance(int i) {
        this.f10425.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f10425.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f10425.setText(charSequence);
    }

    @Override // p190.InterfaceC7787
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo454(C7800 c7800) {
        StateListDrawable stateListDrawable;
        this.f10422 = c7800;
        int i = c7800.f21244;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c7800.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.davemorrissey.labs.subscaleview.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f10419, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(c7800.isCheckable());
        setChecked(c7800.isChecked());
        setEnabled(c7800.isEnabled());
        setTitle(c7800.f21236);
        setIcon(c7800.getIcon());
        setActionView(c7800.getActionView());
        setContentDescription(c7800.f21234);
        AbstractC0147.m601(this, c7800.f21233);
        C7800 c78002 = this.f10422;
        CharSequence charSequence = c78002.f21236;
        CheckedTextView checkedTextView = this.f10425;
        if (charSequence == null && c78002.getIcon() == null && this.f10422.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f10426;
            if (frameLayout != null) {
                C0163 c0163 = (C0163) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0163).width = -1;
                this.f10426.setLayoutParams(c0163);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f10426;
        if (frameLayout2 != null) {
            C0163 c01632 = (C0163) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c01632).width = -2;
            this.f10426.setLayoutParams(c01632);
        }
    }
}
