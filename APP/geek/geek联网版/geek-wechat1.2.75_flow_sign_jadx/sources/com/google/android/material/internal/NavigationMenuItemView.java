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
import java.util.WeakHashMap;
import p000.AbstractC0187eh;
import p000.AbstractC0378jl;
import p000.C0328ia;
import p000.C0865wq;
import p000.C0869wu;
import p000.InterfaceC0499mv;
import p000.e10;
import p000.j10;
import p000.oa0;
import p000.q60;
import p000.r70;
import p000.x90;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC0378jl implements InterfaceC0499mv {

    /* JADX INFO: renamed from: G */
    public static final int[] f1057G = {R.attr.state_checked};

    /* JADX INFO: renamed from: A */
    public FrameLayout f1058A;

    /* JADX INFO: renamed from: B */
    public C0869wu f1059B;

    /* JADX INFO: renamed from: C */
    public ColorStateList f1060C;

    /* JADX INFO: renamed from: D */
    public boolean f1061D;

    /* JADX INFO: renamed from: E */
    public Drawable f1062E;

    /* JADX INFO: renamed from: F */
    public final C0328ia f1063F;

    /* JADX INFO: renamed from: v */
    public int f1064v;

    /* JADX INFO: renamed from: w */
    public boolean f1065w;

    /* JADX INFO: renamed from: x */
    public boolean f1066x;

    /* JADX INFO: renamed from: y */
    public final boolean f1067y;

    /* JADX INFO: renamed from: z */
    public final CheckedTextView f1068z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1067y = true;
        C0328ia c0328ia = new C0328ia(3, this);
        this.f1063F = c0328ia;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.ljx.wechatmod.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.ljx.wechatmod.R.id.design_menu_item_text);
        this.f1068z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        oa0.m2012l(checkedTextView, c0328ia);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f1058A == null) {
                this.f1058A = (FrameLayout) ((ViewStub) findViewById(com.ljx.wechatmod.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f1058A.removeAllViews();
            this.f1058A.addView(view);
        }
    }

    @Override // p000.InterfaceC0499mv
    /* JADX INFO: renamed from: c */
    public final void mo119c(C0869wu c0869wu) {
        StateListDrawable stateListDrawable;
        this.f1059B = c0869wu;
        int i = c0869wu.f5112a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c0869wu.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.ljx.wechatmod.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f1057G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = oa0.f3426a;
            x90.m2669q(this, stateListDrawable);
        }
        setCheckable(c0869wu.isCheckable());
        setChecked(c0869wu.isChecked());
        setEnabled(c0869wu.isEnabled());
        setTitle(c0869wu.f5116e);
        setIcon(c0869wu.getIcon());
        setActionView(c0869wu.getActionView());
        setContentDescription(c0869wu.f5128q);
        r70.m2264a(this, c0869wu.f5129r);
        C0869wu c0869wu2 = this.f1059B;
        CharSequence charSequence = c0869wu2.f5116e;
        CheckedTextView checkedTextView = this.f1068z;
        if (charSequence == null && c0869wu2.getIcon() == null && this.f1059B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f1058A;
            if (frameLayout != null) {
                C0865wq c0865wq = (C0865wq) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0865wq).width = -1;
                this.f1058A.setLayoutParams(c0865wq);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f1058A;
        if (frameLayout2 != null) {
            C0865wq c0865wq2 = (C0865wq) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0865wq2).width = -2;
            this.f1058A.setLayoutParams(c0865wq2);
        }
    }

    @Override // p000.InterfaceC0499mv
    public C0869wu getItemData() {
        return this.f1059B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0869wu c0869wu = this.f1059B;
        if (c0869wu != null && c0869wu.isCheckable() && this.f1059B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1057G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f1066x != z) {
            this.f1066x = z;
            this.f1063F.mo1557h(this.f1068z, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f1068z;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.f1067y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f1061D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                AbstractC0187eh.m995h(drawable, this.f1060C);
            }
            int i = this.f1064v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f1065w) {
            if (this.f1062E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = j10.f2646a;
                Drawable drawableM952a = e10.m952a(resources, com.ljx.wechatmod.R.drawable.navigation_empty_icon, theme);
                this.f1062E = drawableM952a;
                if (drawableM952a != null) {
                    int i2 = this.f1064v;
                    drawableM952a.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f1062E;
        }
        q60.m2125e(this.f1068z, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f1068z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f1064v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1060C = colorStateList;
        this.f1061D = colorStateList != null;
        C0869wu c0869wu = this.f1059B;
        if (c0869wu != null) {
            setIcon(c0869wu.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f1068z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f1065w = z;
    }

    public void setTextAppearance(int i) {
        this.f1068z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1068z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1068z.setText(charSequence);
    }
}
