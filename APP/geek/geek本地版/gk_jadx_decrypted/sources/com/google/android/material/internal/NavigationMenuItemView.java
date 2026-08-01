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
import p000.AbstractC0104ch;
import p000.AbstractC0302hl;
import p000.C0011aa;
import p000.C0572ou;
import p000.C0717sq;
import p000.InterfaceC0201ev;
import p000.c10;
import p000.ja0;
import p000.k60;
import p000.l70;
import p000.s90;
import p000.x00;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC0302hl implements InterfaceC0201ev {

    /* JADX INFO: renamed from: G */
    public static final int[] f1132G = {R.attr.state_checked};

    /* JADX INFO: renamed from: A */
    public FrameLayout f1133A;

    /* JADX INFO: renamed from: B */
    public C0572ou f1134B;

    /* JADX INFO: renamed from: C */
    public ColorStateList f1135C;

    /* JADX INFO: renamed from: D */
    public boolean f1136D;

    /* JADX INFO: renamed from: E */
    public Drawable f1137E;

    /* JADX INFO: renamed from: F */
    public final C0011aa f1138F;

    /* JADX INFO: renamed from: v */
    public int f1139v;

    /* JADX INFO: renamed from: w */
    public boolean f1140w;

    /* JADX INFO: renamed from: x */
    public boolean f1141x;

    /* JADX INFO: renamed from: y */
    public final boolean f1142y;

    /* JADX INFO: renamed from: z */
    public final CheckedTextView f1143z;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1142y = true;
        C0011aa c0011aa = new C0011aa(3, this);
        this.f1138F = c0011aa;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.ljx.wechatmod.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.ljx.wechatmod.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.ljx.wechatmod.R.id.design_menu_item_text);
        this.f1143z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ja0.m1575l(checkedTextView, c0011aa);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f1133A == null) {
                this.f1133A = (FrameLayout) ((ViewStub) findViewById(com.ljx.wechatmod.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f1133A.removeAllViews();
            this.f1133A.addView(view);
        }
    }

    @Override // p000.InterfaceC0201ev
    /* JADX INFO: renamed from: c */
    public final void mo134c(C0572ou c0572ou) {
        StateListDrawable stateListDrawable;
        this.f1134B = c0572ou;
        int i = c0572ou.f3586a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c0572ou.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.ljx.wechatmod.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f1132G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = ja0.f2600a;
            s90.m2325q(this, stateListDrawable);
        }
        setCheckable(c0572ou.isCheckable());
        setChecked(c0572ou.isChecked());
        setEnabled(c0572ou.isEnabled());
        setTitle(c0572ou.f3590e);
        setIcon(c0572ou.getIcon());
        setActionView(c0572ou.getActionView());
        setContentDescription(c0572ou.f3602q);
        l70.m1753a(this, c0572ou.f3603r);
        C0572ou c0572ou2 = this.f1134B;
        CharSequence charSequence = c0572ou2.f3590e;
        CheckedTextView checkedTextView = this.f1143z;
        if (charSequence == null && c0572ou2.getIcon() == null && this.f1134B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f1133A;
            if (frameLayout != null) {
                C0717sq c0717sq = (C0717sq) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0717sq).width = -1;
                this.f1133A.setLayoutParams(c0717sq);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f1133A;
        if (frameLayout2 != null) {
            C0717sq c0717sq2 = (C0717sq) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0717sq2).width = -2;
            this.f1133A.setLayoutParams(c0717sq2);
        }
    }

    @Override // p000.InterfaceC0201ev
    public C0572ou getItemData() {
        return this.f1134B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0572ou c0572ou = this.f1134B;
        if (c0572ou != null && c0572ou.isCheckable() && this.f1134B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1132G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f1141x != z) {
            this.f1141x = z;
            this.f1138F.mo620h(this.f1143z, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f1143z;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.f1142y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f1136D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                AbstractC0104ch.m688h(drawable, this.f1135C);
            }
            int i = this.f1139v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f1140w) {
            if (this.f1137E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = c10.f879a;
                Drawable drawableM2603a = x00.m2603a(resources, com.ljx.wechatmod.R.drawable.navigation_empty_icon, theme);
                this.f1137E = drawableM2603a;
                if (drawableM2603a != null) {
                    int i2 = this.f1139v;
                    drawableM2603a.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f1137E;
        }
        k60.m1636e(this.f1143z, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f1143z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f1139v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1135C = colorStateList;
        this.f1136D = colorStateList != null;
        C0572ou c0572ou = this.f1134B;
        if (c0572ou != null) {
            setIcon(c0572ou.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f1143z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f1140w = z;
    }

    public void setTextAppearance(int i) {
        this.f1143z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1143z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1143z.setText(charSequence);
    }
}
