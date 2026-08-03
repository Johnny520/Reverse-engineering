package com.google.android.material.bottomnavigation;

import Yue.C4187;
import Yue.C7837;
import Yue.C8273;
import Yue.C8472;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.C1980R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;

/* JADX INFO: loaded from: classes.dex */
public class BottomNavigationView extends NavigationBarView {
    private static final int MAX_ITEM_COUNT = 5;

    @Deprecated
    public interface OnNavigationItemReselectedListener extends NavigationBarView.OnItemReselectedListener {
    }

    @Deprecated
    public interface OnNavigationItemSelectedListener extends NavigationBarView.OnItemSelectedListener {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BottomNavigationView(@InterfaceC6391 Context context) {
        this(context, null);
    }

    private void addCompatibilityTopDivider(@InterfaceC6391 Context context) {
        View view = new View(context);
        view.setBackgroundColor(C4187.m12060(context, C1980R.color.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C1980R.dimen.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    private void applyWindowInsets() {
        ViewUtils.doOnApplyWindowInsets(this, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.bottomnavigation.BottomNavigationView.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            @InterfaceC6391
            public C8472 onApplyWindowInsets(View view, @InterfaceC6391 C8472 c8472, @InterfaceC6391 ViewUtils.RelativePadding relativePadding) {
                relativePadding.bottom += c8472.m28290();
                boolean z = C8273.m27356(view) == 1;
                int iM28291 = c8472.m28291();
                int iM28292 = c8472.m28292();
                relativePadding.start += z ? iM28292 : iM28291;
                int i = relativePadding.end;
                if (!z) {
                    iM28291 = iM28292;
                }
                relativePadding.end = i + iM28291;
                relativePadding.applyToView(view);
                return c8472;
            }
        });
    }

    private int makeMinHeightSpec(int i) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumHeight <= 0) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), 1073741824);
    }

    private boolean shouldDrawCompatibilityTopDivider() {
        return false;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public NavigationBarMenuView createNavigationBarMenuView(@InterfaceC6391 Context context) {
        return new BottomNavigationMenuView(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return ((BottomNavigationMenuView) getMenuView()).isItemHorizontalTranslationEnabled();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, makeMinHeightSpec(i2));
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.isItemHorizontalTranslationEnabled() != z) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z);
            getPresenter().updateMenuView(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(@InterfaceC6490 OnNavigationItemReselectedListener onNavigationItemReselectedListener) {
        setOnItemReselectedListener(onNavigationItemReselectedListener);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(@InterfaceC6490 OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        setOnItemSelectedListener(onNavigationItemSelectedListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public BottomNavigationView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C1980R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C1980R.style.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Context context2 = getContext();
        C7837 c7837ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C1980R.styleable.BottomNavigationView, i, i2, new int[0]);
        setItemHorizontalTranslationEnabled(c7837ObtainTintedStyledAttributes.m3933(C1980R.styleable.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.BottomNavigationView_android_minHeight)) {
            setMinimumHeight(c7837ObtainTintedStyledAttributes.m24874(C1980R.styleable.BottomNavigationView_android_minHeight, 0));
        }
        if (c7837ObtainTintedStyledAttributes.m3933(C1980R.styleable.BottomNavigationView_compatShadowEnabled, true) && shouldDrawCompatibilityTopDivider()) {
            addCompatibilityTopDivider(context2);
        }
        c7837ObtainTintedStyledAttributes.m24899();
        applyWindowInsets();
    }
}
