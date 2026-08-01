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
import com.google.android.material.button.C3099;
import p161.AbstractC7645;
import p190.C7799;
import p190.InterfaceC7786;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC3160 implements InterfaceC7786 {

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static final int[] f10414 = {R.attr.state_checked};

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final C3099 f10415;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public ColorStateList f10416;

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public C7799 f10417;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public Drawable f10418;

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public boolean f10419;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final CheckedTextView f10420;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public FrameLayout f10421;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f10422;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public int f10423;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final boolean f10424;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public boolean f10425;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10424 = true;
        C3099 c3099 = new C3099(this, 3);
        this.f10415 = c3099;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.davemorrissey.labs.subscaleview.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.davemorrissey.labs.subscaleview.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.davemorrissey.labs.subscaleview.R.id.design_menu_item_text);
        this.f10420 = checkedTextView;
        AbstractC2270.m4234(checkedTextView, c3099);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f10421 == null) {
                this.f10421 = (FrameLayout) ((ViewStub) findViewById(com.davemorrissey.labs.subscaleview.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f10421.removeAllViews();
            this.f10421.addView(view);
        }
    }

    @Override // p190.InterfaceC7786
    public C7799 getItemData() {
        return this.f10417;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C7799 c7799 = this.f10417;
        if (c7799 != null && c7799.isCheckable() && this.f10417.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f10414);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f10425 != z) {
            this.f10425 = z;
            this.f10415.mo4189(this.f10420, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f10420;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.f10424) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f10419) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.f10416);
            }
            int i = this.f10423;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f10422) {
            if (this.f10418 == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AbstractC7645.f20761;
                Drawable drawable2 = resources.getDrawable(com.davemorrissey.labs.subscaleview.R.drawable.navigation_empty_icon, theme);
                this.f10418 = drawable2;
                if (drawable2 != null) {
                    int i2 = this.f10423;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f10418;
        }
        this.f10420.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f10420.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f10423 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f10416 = colorStateList;
        this.f10419 = colorStateList != null;
        C7799 c7799 = this.f10417;
        if (c7799 != null) {
            setIcon(c7799.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f10420.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f10422 = z;
    }

    public void setTextAppearance(int i) {
        this.f10420.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f10420.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f10420.setText(charSequence);
    }

    @Override // p190.InterfaceC7786
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo453(C7799 c7799) {
        StateListDrawable stateListDrawable;
        this.f10417 = c7799;
        int i = c7799.f21247;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c7799.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.davemorrissey.labs.subscaleview.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f10414, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(c7799.isCheckable());
        setChecked(c7799.isChecked());
        setEnabled(c7799.isEnabled());
        setTitle(c7799.f21239);
        setIcon(c7799.getIcon());
        setActionView(c7799.getActionView());
        setContentDescription(c7799.f21237);
        AbstractC0147.m600(this, c7799.f21236);
        C7799 c77992 = this.f10417;
        CharSequence charSequence = c77992.f21239;
        CheckedTextView checkedTextView = this.f10420;
        if (charSequence == null && c77992.getIcon() == null && this.f10417.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f10421;
            if (frameLayout != null) {
                C0163 c0163 = (C0163) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0163).width = -1;
                this.f10421.setLayoutParams(c0163);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f10421;
        if (frameLayout2 != null) {
            C0163 c01632 = (C0163) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c01632).width = -2;
            this.f10421.setLayoutParams(c01632);
        }
    }
}
