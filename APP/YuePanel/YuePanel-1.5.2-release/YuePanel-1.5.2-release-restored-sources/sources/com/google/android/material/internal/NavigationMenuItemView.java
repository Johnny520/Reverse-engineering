package com.google.android.material.internal;

import Yue.C3024;
import Yue.C3055;
import Yue.C4520;
import Yue.C6898;
import Yue.C7130;
import Yue.C7759;
import Yue.C7939;
import Yue.C8273;
import Yue.InterfaceC4399;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
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
import androidx.appcompat.view.menu.C8697;
import androidx.appcompat.view.menu.InterfaceC8700;
import androidx.appcompat.widget.C8754;
import com.google.android.material.C1980R;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class NavigationMenuItemView extends ForegroundLinearLayout implements InterfaceC8700.InterfaceC1608 {
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private final C3024 accessibilityDelegate;
    private FrameLayout actionArea;
    boolean checkable;
    private Drawable emptyDrawable;
    private boolean hasIconTintList;
    private int iconSize;
    private ColorStateList iconTintList;
    boolean isBold;
    private C8697 itemData;
    private boolean needsEmptyIcon;
    private final CheckedTextView textView;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NavigationMenuItemView(@InterfaceC6391 Context context) {
        this(context, null);
    }

    private void adjustAppearance() {
        if (shouldExpandActionArea()) {
            this.textView.setVisibility(8);
            FrameLayout frameLayout = this.actionArea;
            if (frameLayout != null) {
                C8754.C1632 c1632 = (C8754.C1632) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c1632).width = -1;
                this.actionArea.setLayoutParams(c1632);
                return;
            }
            return;
        }
        this.textView.setVisibility(0);
        FrameLayout frameLayout2 = this.actionArea;
        if (frameLayout2 != null) {
            C8754.C1632 c16322 = (C8754.C1632) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c16322).width = -2;
            this.actionArea.setLayoutParams(c16322);
        }
    }

    @InterfaceC6490
    private StateListDrawable createDefaultBackground() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(C6898.C1110.f18434, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(CHECKED_STATE_SET, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private void setActionView(@InterfaceC6490 View view) {
        if (view != null) {
            if (this.actionArea == null) {
                this.actionArea = (FrameLayout) ((ViewStub) findViewById(C1980R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.actionArea.removeAllViews();
            this.actionArea.addView(view);
        }
    }

    private boolean shouldExpandActionArea() {
        return this.itemData.getTitle() == null && this.itemData.getIcon() == null && this.itemData.getActionView() != null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public C8697 getItemData() {
        return this.itemData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public void initialize(@InterfaceC6391 C8697 c8697, int i) {
        this.itemData = c8697;
        if (c8697.getItemId() > 0) {
            setId(c8697.getItemId());
        }
        setVisibility(c8697.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            C8273.m27447(this, createDefaultBackground());
        }
        setCheckable(c8697.isCheckable());
        setChecked(c8697.isChecked());
        setEnabled(c8697.isEnabled());
        setTitle(c8697.getTitle());
        setIcon(c8697.getIcon());
        setActionView(c8697.getActionView());
        setContentDescription(c8697.getContentDescription());
        C7939.m3953(this, c8697.getTooltipText());
        adjustAppearance();
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C8697 c8697 = this.itemData;
        if (c8697 != null && c8697.isCheckable() && this.itemData.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, CHECKED_STATE_SET);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void recycle() {
        FrameLayout frameLayout = this.actionArea;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.textView.setCompoundDrawables(null, null, null, null);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.checkable != z) {
            this.checkable = z;
            this.accessibilityDelegate.sendAccessibilityEvent(this.textView, 2048);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public void setChecked(boolean z) {
        refreshDrawableState();
        this.textView.setChecked(z);
        CheckedTextView checkedTextView = this.textView;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.isBold) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public void setIcon(@InterfaceC6490 Drawable drawable) {
        if (drawable != null) {
            if (this.hasIconTintList) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C4520.m13239(drawable).mutate();
                C4520.m13236(drawable, this.iconTintList);
            }
            int i = this.iconSize;
            drawable.setBounds(0, 0, i, i);
        } else if (this.needsEmptyIcon) {
            if (this.emptyDrawable == null) {
                Drawable drawableM22275 = C7130.m22275(getResources(), C1980R.drawable.navigation_empty_icon, getContext().getTheme());
                this.emptyDrawable = drawableM22275;
                if (drawableM22275 != null) {
                    int i2 = this.iconSize;
                    drawableM22275.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.emptyDrawable;
        }
        C7759.m24667(this.textView, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.textView.setCompoundDrawablePadding(i);
    }

    public void setIconSize(@InterfaceC4399 int i) {
        this.iconSize = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.iconTintList = colorStateList;
        this.hasIconTintList = colorStateList != null;
        C8697 c8697 = this.itemData;
        if (c8697 != null) {
            setIcon(c8697.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.textView.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.needsEmptyIcon = z;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearance(int i) {
        C7759.m24676(this.textView, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.textView.setTextColor(colorStateList);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public void setTitle(CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700.InterfaceC1608
    public boolean showsIcon() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public NavigationMenuItemView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isBold = true;
        C3024 c3024 = new C3024() { // from class: com.google.android.material.internal.NavigationMenuItemView.1
            @Override // Yue.C3024
            public void onInitializeAccessibilityNodeInfo(View view, @InterfaceC6391 C3055 c3055) {
                super.onInitializeAccessibilityNodeInfo(view, c3055);
                c3055.m6055(NavigationMenuItemView.this.checkable);
            }
        };
        this.accessibilityDelegate = c3024;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C1980R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C1980R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C1980R.id.design_menu_item_text);
        this.textView = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C8273.m27439(checkedTextView, c3024);
    }

    public void initialize(@InterfaceC6391 C8697 c8697, boolean z) {
        this.isBold = z;
        initialize(c8697, 0);
    }
}
