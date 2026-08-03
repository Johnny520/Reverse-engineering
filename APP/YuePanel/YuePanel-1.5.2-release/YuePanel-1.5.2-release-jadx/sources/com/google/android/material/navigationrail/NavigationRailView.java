package com.google.android.material.navigationrail;

import Yue.C5450;
import Yue.C7837;
import Yue.C8273;
import Yue.C8472;
import Yue.InterfaceC5683;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import Yue.InterfaceC7144;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.C1980R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: loaded from: classes.dex */
public class NavigationRailView extends NavigationBarView {
    private static final int DEFAULT_HEADER_GRAVITY = 49;
    static final int DEFAULT_MENU_GRAVITY = 49;
    static final int MAX_ITEM_COUNT = 7;
    static final int NO_ITEM_MINIMUM_HEIGHT = -1;

    @InterfaceC6490
    private View headerView;

    @InterfaceC6490
    private Boolean paddingBottomSystemWindowInsets;

    @InterfaceC6490
    private Boolean paddingStartSystemWindowInsets;

    @InterfaceC6490
    private Boolean paddingTopSystemWindowInsets;
    private final int topMargin;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NavigationRailView(@InterfaceC6391 Context context) {
        this(context, null);
    }

    private void applyWindowInsets() {
        ViewUtils.doOnApplyWindowInsets(this, new ViewUtils.OnApplyWindowInsetsListener() { // from class: com.google.android.material.navigationrail.NavigationRailView.1
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            @InterfaceC6391
            public C8472 onApplyWindowInsets(View view, @InterfaceC6391 C8472 c8472, @InterfaceC6391 ViewUtils.RelativePadding relativePadding) {
                C5450 c5450M28281 = c8472.m28281(C8472.C8483.m28360());
                NavigationRailView navigationRailView = NavigationRailView.this;
                if (navigationRailView.shouldApplyWindowInsetPadding(navigationRailView.paddingTopSystemWindowInsets)) {
                    relativePadding.top += c5450M28281.f1521;
                }
                NavigationRailView navigationRailView2 = NavigationRailView.this;
                if (navigationRailView2.shouldApplyWindowInsetPadding(navigationRailView2.paddingBottomSystemWindowInsets)) {
                    relativePadding.bottom += c5450M28281.f13400;
                }
                NavigationRailView navigationRailView3 = NavigationRailView.this;
                if (navigationRailView3.shouldApplyWindowInsetPadding(navigationRailView3.paddingStartSystemWindowInsets)) {
                    relativePadding.start += ViewUtils.isLayoutRtl(view) ? c5450M28281.f13399 : c5450M28281.f1520;
                }
                relativePadding.applyToView(view);
                return c8472;
            }
        });
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    private boolean isHeaderViewVisible() {
        View view = this.headerView;
        return (view == null || view.getVisibility() == 8) ? false : true;
    }

    private int makeMinWidthSpec(int i) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldApplyWindowInsetPadding(Boolean bool) {
        return bool != null ? bool.booleanValue() : C8273.m27350(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void addHeaderView(@InterfaceC5683 int i) {
        addHeaderView(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this, false));
    }

    @InterfaceC6490
    public View getHeaderView() {
        return this.headerView;
    }

    public int getItemMinimumHeight() {
        return ((NavigationRailMenuView) getMenuView()).getItemMinimumHeight();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
        int i5 = 0;
        if (isHeaderViewVisible()) {
            int bottom = this.headerView.getBottom() + this.topMargin;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i5 = bottom - top;
            }
        } else if (navigationRailMenuView.isTopGravity()) {
            i5 = this.topMargin;
        }
        if (i5 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i5, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMakeMinWidthSpec = makeMinWidthSpec(i);
        super.onMeasure(iMakeMinWidthSpec, i2);
        if (isHeaderViewVisible()) {
            measureChild(getNavigationRailMenuView(), iMakeMinWidthSpec, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.headerView.getMeasuredHeight()) - this.topMargin, Integer.MIN_VALUE));
        }
    }

    public void removeHeaderView() {
        View view = this.headerView;
        if (view != null) {
            removeView(view);
            this.headerView = null;
        }
    }

    public void setItemMinimumHeight(@InterfaceC6844 int i) {
        ((NavigationRailMenuView) getMenuView()).setItemMinimumHeight(i);
    }

    public void setMenuGravity(int i) {
        getNavigationRailMenuView().setMenuGravity(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public NavigationRailView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C1980R.attr.navigationRailStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void addHeaderView(@InterfaceC6391 View view) {
        removeHeaderView();
        this.headerView = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.topMargin;
        addView(view, 0, layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: createNavigationBarMenuView(Landroid/content/Context;)Lcom/google/android/material/navigation/NavigationBarMenuView; */
    @Override // com.google.android.material.navigation.NavigationBarView
    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public NavigationRailMenuView createNavigationBarMenuView(@InterfaceC6391 Context context) {
        return new NavigationRailMenuView(context);
    }

    public NavigationRailView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, C1980R.style.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.paddingTopSystemWindowInsets = null;
        this.paddingBottomSystemWindowInsets = null;
        this.paddingStartSystemWindowInsets = null;
        this.topMargin = getResources().getDimensionPixelSize(C1980R.dimen.mtrl_navigation_rail_margin);
        Context context2 = getContext();
        C7837 c7837ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C1980R.styleable.NavigationRailView, i, i2, new int[0]);
        int iM24888 = c7837ObtainTintedStyledAttributes.m24888(C1980R.styleable.NavigationRailView_headerLayout, 0);
        if (iM24888 != 0) {
            addHeaderView(iM24888);
        }
        setMenuGravity(c7837ObtainTintedStyledAttributes.m24882(C1980R.styleable.NavigationRailView_menuGravity, 49));
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationRailView_itemMinHeight)) {
            setItemMinimumHeight(c7837ObtainTintedStyledAttributes.m24874(C1980R.styleable.NavigationRailView_itemMinHeight, -1));
        }
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationRailView_paddingTopSystemWindowInsets)) {
            this.paddingTopSystemWindowInsets = Boolean.valueOf(c7837ObtainTintedStyledAttributes.m3933(C1980R.styleable.NavigationRailView_paddingTopSystemWindowInsets, false));
        }
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationRailView_paddingBottomSystemWindowInsets)) {
            this.paddingBottomSystemWindowInsets = Boolean.valueOf(c7837ObtainTintedStyledAttributes.m3933(C1980R.styleable.NavigationRailView_paddingBottomSystemWindowInsets, false));
        }
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationRailView_paddingStartSystemWindowInsets)) {
            this.paddingStartSystemWindowInsets = Boolean.valueOf(c7837ObtainTintedStyledAttributes.m3933(C1980R.styleable.NavigationRailView_paddingStartSystemWindowInsets, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(C1980R.dimen.m3_navigation_rail_item_padding_top_with_large_font);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C1980R.dimen.m3_navigation_rail_item_padding_bottom_with_large_font);
        float fLerp = AnimationUtils.lerp(0.0f, 1.0f, 0.3f, 1.0f, MaterialResources.getFontScale(context2) - 1.0f);
        float fLerp2 = AnimationUtils.lerp(getItemPaddingTop(), dimensionPixelOffset, fLerp);
        float fLerp3 = AnimationUtils.lerp(getItemPaddingBottom(), dimensionPixelOffset2, fLerp);
        setItemPaddingTop(Math.round(fLerp2));
        setItemPaddingBottom(Math.round(fLerp3));
        c7837ObtainTintedStyledAttributes.m24899();
        applyWindowInsets();
    }
}
