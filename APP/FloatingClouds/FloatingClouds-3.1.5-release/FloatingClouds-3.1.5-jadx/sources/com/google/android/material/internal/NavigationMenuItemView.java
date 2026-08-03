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
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.C0983R;
import androidx.appcompat.view.menu.C1000h;
import androidx.appcompat.view.menu.InterfaceC1003k;
import androidx.appcompat.widget.C1039b;
import com.google.android.material.C1247R;
import java.util.WeakHashMap;
import p000a.C0038C;
import p000a.C0146I;
import p000a.C0181Jg;
import p000a.C0368U6;
import p000a.C0787qd;
import p000a.C0866ug;
import p000a.C0893w5;
import p000a.C0922xf;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends C0368U6 implements InterfaceC1003k.a {

    /* JADX INFO: renamed from: G */
    public static final int[] f5803G = {R.attr.state_checked};

    /* JADX INFO: renamed from: A */
    public FrameLayout f5804A;

    /* JADX INFO: renamed from: B */
    public C1000h f5805B;

    /* JADX INFO: renamed from: C */
    public ColorStateList f5806C;

    /* JADX INFO: renamed from: D */
    public boolean f5807D;

    /* JADX INFO: renamed from: E */
    public Drawable f5808E;

    /* JADX INFO: renamed from: F */
    public final C1299a f5809F;

    /* JADX INFO: renamed from: v */
    public int f5810v;

    /* JADX INFO: renamed from: w */
    public boolean f5811w;

    /* JADX INFO: renamed from: x */
    public boolean f5812x;

    /* JADX INFO: renamed from: y */
    public final boolean f5813y;

    /* JADX INFO: renamed from: z */
    public final CheckedTextView f5814z;

    /* JADX INFO: renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    public class C1299a extends C0038C {
        public C1299a() {
        }

        @Override // p000a.C0038C
        /* JADX INFO: renamed from: d */
        public final void mo115d(View view, C0146I c0146i) {
            View.AccessibilityDelegate accessibilityDelegate = this.f137a;
            AccessibilityNodeInfo accessibilityNodeInfo = c0146i.f505a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            accessibilityNodeInfo.setCheckable(NavigationMenuItemView.this.f5812x);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f5813y = true;
        C1299a c1299a = new C1299a();
        this.f5809F = c1299a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C1247R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C1247R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C1247R.id.design_menu_item_text);
        this.f5814z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C0866ug.m2003j(checkedTextView, c1299a);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f5804A == null) {
                this.f5804A = (FrameLayout) ((ViewStub) findViewById(C1247R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f5804A.removeAllViews();
            this.f5804A.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1003k.a
    /* JADX INFO: renamed from: b */
    public final void mo2300b(C1000h c1000h) {
        StateListDrawable stateListDrawable;
        this.f5805B = c1000h;
        int i = c1000h.f3814a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c1000h.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(C0983R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f5803G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            setBackground(stateListDrawable);
        }
        setCheckable(c1000h.isCheckable());
        setChecked(c1000h.isChecked());
        setEnabled(c1000h.isEnabled());
        setTitle(c1000h.f3818e);
        setIcon(c1000h.getIcon());
        setActionView(c1000h.getActionView());
        setContentDescription(c1000h.f3830q);
        C0922xf.m2208a(this, c1000h.f3831r);
        C1000h c1000h2 = this.f5805B;
        CharSequence charSequence = c1000h2.f3818e;
        CheckedTextView checkedTextView = this.f5814z;
        if (charSequence == null && c1000h2.getIcon() == null && this.f5805B.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f5804A;
            if (frameLayout != null) {
                C1039b.a aVar = (C1039b.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f5804A.setLayoutParams(aVar);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f5804A;
        if (frameLayout2 != null) {
            C1039b.a aVar2 = (C1039b.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f5804A.setLayoutParams(aVar2);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1003k.a
    public C1000h getItemData() {
        return this.f5805B;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C1000h c1000h = this.f5805B;
        if (c1000h != null && c1000h.isCheckable() && this.f5805B.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f5803G);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f5812x != z) {
            this.f5812x = z;
            this.f5809F.mo119h(this.f5814z, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f5814z;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.f5813y) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f5807D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                C0893w5.a.m2176h(drawable, this.f5806C);
            }
            int i = this.f5810v;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f5811w) {
            if (this.f5808E == null) {
                Resources resources = getResources();
                int i2 = C1247R.drawable.navigation_empty_icon;
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = C0787qd.f3107a;
                Drawable drawableM1839a = C0787qd.a.m1839a(resources, i2, theme);
                this.f5808E = drawableM1839a;
                if (drawableM1839a != null) {
                    int i3 = this.f5810v;
                    drawableM1839a.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.f5808E;
        }
        this.f5814z.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f5814z.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f5810v = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f5806C = colorStateList;
        this.f5807D = colorStateList != null;
        C1000h c1000h = this.f5805B;
        if (c1000h != null) {
            setIcon(c1000h.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f5814z.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f5811w = z;
    }

    public void setTextAppearance(int i) {
        this.f5814z.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f5814z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f5814z.setText(charSequence);
    }
}
