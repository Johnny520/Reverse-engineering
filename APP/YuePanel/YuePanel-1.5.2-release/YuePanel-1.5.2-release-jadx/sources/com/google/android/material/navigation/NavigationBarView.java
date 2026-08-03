package com.google.android.material.navigation;

import Yue.AbstractC2967;
import Yue.C4520;
import Yue.C7683;
import Yue.C7837;
import Yue.C8273;
import Yue.InterfaceC3451;
import Yue.InterfaceC4398;
import Yue.InterfaceC4399;
import Yue.InterfaceC4525;
import Yue.InterfaceC5411;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import Yue.InterfaceC7144;
import Yue.InterfaceC7651;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C8694;
import androidx.appcompat.view.menu.InterfaceC8700;
import com.google.android.material.C1980R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public abstract class NavigationBarView extends FrameLayout {
    public static final int LABEL_VISIBILITY_AUTO = -1;
    public static final int LABEL_VISIBILITY_LABELED = 1;
    public static final int LABEL_VISIBILITY_SELECTED = 0;
    public static final int LABEL_VISIBILITY_UNLABELED = 2;
    private static final int MENU_PRESENTER_ID = 1;

    @InterfaceC6391
    private final NavigationBarMenu menu;
    private MenuInflater menuInflater;

    @InterfaceC6391
    private final NavigationBarMenuView menuView;

    @InterfaceC6391
    private final NavigationBarPresenter presenter;
    private OnItemReselectedListener reselectedListener;
    private OnItemSelectedListener selectedListener;

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface LabelVisibility {
    }

    public interface OnItemReselectedListener {
        void onNavigationItemReselected(@InterfaceC6391 MenuItem menuItem);
    }

    public interface OnItemSelectedListener {
        boolean onNavigationItemSelected(@InterfaceC6391 MenuItem menuItem);
    }

    public static class SavedState extends AbstractC2967 {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationBarView.SavedState.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            @InterfaceC6391
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            @InterfaceC6391
            public SavedState createFromParcel(@InterfaceC6391 Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            @InterfaceC6490
            public SavedState createFromParcel(@InterfaceC6391 Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        @InterfaceC6490
        Bundle menuPresenterState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private void readFromParcel(@InterfaceC6391 Parcel parcel, ClassLoader classLoader) {
            this.menuPresenterState = parcel.readBundle(classLoader);
        }

        @Override // Yue.AbstractC2967, android.os.Parcelable
        public void writeToParcel(@InterfaceC6391 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuPresenterState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SavedState(@InterfaceC6391 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            readFromParcel(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    public NavigationBarView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, @InterfaceC3451 int i, @InterfaceC7651 int i2) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        this.presenter = navigationBarPresenter;
        Context context2 = getContext();
        C7837 c7837ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C1980R.styleable.NavigationBarView, i, i2, C1980R.styleable.NavigationBarView_itemTextAppearanceInactive, C1980R.styleable.NavigationBarView_itemTextAppearanceActive);
        NavigationBarMenu navigationBarMenu = new NavigationBarMenu(context2, getClass(), getMaxItemCount());
        this.menu = navigationBarMenu;
        NavigationBarMenuView navigationBarMenuViewCreateNavigationBarMenuView = createNavigationBarMenuView(context2);
        this.menuView = navigationBarMenuViewCreateNavigationBarMenuView;
        navigationBarPresenter.setMenuView(navigationBarMenuViewCreateNavigationBarMenuView);
        navigationBarPresenter.setId(1);
        navigationBarMenuViewCreateNavigationBarMenuView.setPresenter(navigationBarPresenter);
        navigationBarMenu.addMenuPresenter(navigationBarPresenter);
        navigationBarPresenter.initForMenu(getContext(), navigationBarMenu);
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationBarView_itemIconTint)) {
            navigationBarMenuViewCreateNavigationBarMenuView.setIconTintList(c7837ObtainTintedStyledAttributes.m24871(C1980R.styleable.NavigationBarView_itemIconTint));
        } else {
            navigationBarMenuViewCreateNavigationBarMenuView.setIconTintList(navigationBarMenuViewCreateNavigationBarMenuView.createDefaultColorStateList(R.attr.textColorSecondary));
        }
        setItemIconSize(c7837ObtainTintedStyledAttributes.m24874(C1980R.styleable.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(C1980R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationBarView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(c7837ObtainTintedStyledAttributes.m24888(C1980R.styleable.NavigationBarView_itemTextAppearanceInactive, 0));
        }
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationBarView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(c7837ObtainTintedStyledAttributes.m24888(C1980R.styleable.NavigationBarView_itemTextAppearanceActive, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(c7837ObtainTintedStyledAttributes.m3933(C1980R.styleable.NavigationBarView_itemTextAppearanceActiveBoldEnabled, true));
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationBarView_itemTextColor)) {
            setItemTextColor(c7837ObtainTintedStyledAttributes.m24871(C1980R.styleable.NavigationBarView_itemTextColor));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(background);
        if (background == null || colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i, i2).build());
            if (colorStateListOrNull != null) {
                materialShapeDrawable.setFillColor(colorStateListOrNull);
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            C8273.m27447(this, materialShapeDrawable);
        }
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationBarView_itemPaddingTop)) {
            setItemPaddingTop(c7837ObtainTintedStyledAttributes.m24874(C1980R.styleable.NavigationBarView_itemPaddingTop, 0));
        }
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationBarView_itemPaddingBottom)) {
            setItemPaddingBottom(c7837ObtainTintedStyledAttributes.m24874(C1980R.styleable.NavigationBarView_itemPaddingBottom, 0));
        }
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationBarView_activeIndicatorLabelPadding)) {
            setActiveIndicatorLabelPadding(c7837ObtainTintedStyledAttributes.m24874(C1980R.styleable.NavigationBarView_activeIndicatorLabelPadding, 0));
        }
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationBarView_elevation)) {
            setElevation(c7837ObtainTintedStyledAttributes.m24874(C1980R.styleable.NavigationBarView_elevation, 0));
        }
        C4520.m13236(getBackground().mutate(), MaterialResources.getColorStateList(context2, c7837ObtainTintedStyledAttributes, C1980R.styleable.NavigationBarView_backgroundTint));
        setLabelVisibilityMode(c7837ObtainTintedStyledAttributes.m24883(C1980R.styleable.NavigationBarView_labelVisibilityMode, -1));
        int iM24888 = c7837ObtainTintedStyledAttributes.m24888(C1980R.styleable.NavigationBarView_itemBackground, 0);
        if (iM24888 != 0) {
            navigationBarMenuViewCreateNavigationBarMenuView.setItemBackgroundRes(iM24888);
        } else {
            setItemRippleColor(MaterialResources.getColorStateList(context2, c7837ObtainTintedStyledAttributes, C1980R.styleable.NavigationBarView_itemRippleColor));
        }
        int iM248882 = c7837ObtainTintedStyledAttributes.m24888(C1980R.styleable.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (iM248882 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iM248882, C1980R.styleable.NavigationBarActiveIndicator);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.NavigationBarActiveIndicator_android_width, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.NavigationBarActiveIndicator_android_height, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(C1980R.styleable.NavigationBarActiveIndicator_marginHorizontal, 0));
            setItemActiveIndicatorColor(MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C1980R.styleable.NavigationBarActiveIndicator_android_color));
            setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel.builder(context2, typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.NavigationBarActiveIndicator_shapeAppearance, 0), 0).build());
            typedArrayObtainStyledAttributes.recycle();
        }
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationBarView_menu)) {
            inflateMenu(c7837ObtainTintedStyledAttributes.m24888(C1980R.styleable.NavigationBarView_menu, 0));
        }
        c7837ObtainTintedStyledAttributes.m24899();
        addView(navigationBarMenuViewCreateNavigationBarMenuView);
        navigationBarMenu.setCallback(new C8694.InterfaceC1603() { // from class: com.google.android.material.navigation.NavigationBarView.1
            @Override // androidx.appcompat.view.menu.C8694.InterfaceC1603
            public boolean onMenuItemSelected(C8694 c8694, @InterfaceC6391 MenuItem menuItem) {
                if (NavigationBarView.this.reselectedListener == null || menuItem.getItemId() != NavigationBarView.this.getSelectedItemId()) {
                    return (NavigationBarView.this.selectedListener == null || NavigationBarView.this.selectedListener.onNavigationItemSelected(menuItem)) ? false : true;
                }
                NavigationBarView.this.reselectedListener.onNavigationItemReselected(menuItem);
                return true;
            }

            @Override // androidx.appcompat.view.menu.C8694.InterfaceC1603
            public void onMenuModeChange(C8694 c8694) {
            }
        });
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new C7683(getContext());
        }
        return this.menuInflater;
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public abstract NavigationBarMenuView createNavigationBarMenuView(@InterfaceC6391 Context context);

    @InterfaceC6844
    public int getActiveIndicatorLabelPadding() {
        return this.menuView.getActiveIndicatorLabelPadding();
    }

    @InterfaceC6490
    public BadgeDrawable getBadge(int i) {
        return this.menuView.getBadge(i);
    }

    @InterfaceC6490
    public ColorStateList getItemActiveIndicatorColor() {
        return this.menuView.getItemActiveIndicatorColor();
    }

    @InterfaceC6844
    public int getItemActiveIndicatorHeight() {
        return this.menuView.getItemActiveIndicatorHeight();
    }

    @InterfaceC6844
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.menuView.getItemActiveIndicatorMarginHorizontal();
    }

    @InterfaceC6490
    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.menuView.getItemActiveIndicatorShapeAppearance();
    }

    @InterfaceC6844
    public int getItemActiveIndicatorWidth() {
        return this.menuView.getItemActiveIndicatorWidth();
    }

    @InterfaceC6490
    public Drawable getItemBackground() {
        return this.menuView.getItemBackground();
    }

    @InterfaceC4525
    @Deprecated
    public int getItemBackgroundResource() {
        return this.menuView.getItemBackgroundRes();
    }

    @InterfaceC4399
    public int getItemIconSize() {
        return this.menuView.getItemIconSize();
    }

    @InterfaceC6490
    public ColorStateList getItemIconTintList() {
        return this.menuView.getIconTintList();
    }

    @InterfaceC6844
    public int getItemPaddingBottom() {
        return this.menuView.getItemPaddingBottom();
    }

    @InterfaceC6844
    public int getItemPaddingTop() {
        return this.menuView.getItemPaddingTop();
    }

    @InterfaceC6490
    public ColorStateList getItemRippleColor() {
        return this.menuView.getItemRippleColor();
    }

    @InterfaceC7651
    public int getItemTextAppearanceActive() {
        return this.menuView.getItemTextAppearanceActive();
    }

    @InterfaceC7651
    public int getItemTextAppearanceInactive() {
        return this.menuView.getItemTextAppearanceInactive();
    }

    @InterfaceC6490
    public ColorStateList getItemTextColor() {
        return this.menuView.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.menuView.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @InterfaceC6391
    public Menu getMenu() {
        return this.menu;
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public InterfaceC8700 getMenuView() {
        return this.menuView;
    }

    @InterfaceC6391
    public BadgeDrawable getOrCreateBadge(int i) {
        return this.menuView.getOrCreateBadge(i);
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public NavigationBarPresenter getPresenter() {
        return this.presenter;
    }

    @InterfaceC5411
    public int getSelectedItemId() {
        return this.menuView.getSelectedItemId();
    }

    public void inflateMenu(int i) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(true);
    }

    public boolean isItemActiveIndicatorEnabled() {
        return this.menuView.getItemActiveIndicatorEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@InterfaceC6490 Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuPresenterState);
    }

    @Override // android.view.View
    @InterfaceC6391
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuPresenterState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    public void removeBadge(int i) {
        this.menuView.removeBadge(i);
    }

    public void setActiveIndicatorLabelPadding(@InterfaceC6844 int i) {
        this.menuView.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    public void setItemActiveIndicatorColor(@InterfaceC6490 ColorStateList colorStateList) {
        this.menuView.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.menuView.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(@InterfaceC6844 int i) {
        this.menuView.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(@InterfaceC6844 int i) {
        this.menuView.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(@InterfaceC6490 ShapeAppearanceModel shapeAppearanceModel) {
        this.menuView.setItemActiveIndicatorShapeAppearance(shapeAppearanceModel);
    }

    public void setItemActiveIndicatorWidth(@InterfaceC6844 int i) {
        this.menuView.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(@InterfaceC6490 Drawable drawable) {
        this.menuView.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@InterfaceC4525 int i) {
        this.menuView.setItemBackgroundRes(i);
    }

    public void setItemIconSize(@InterfaceC4399 int i) {
        this.menuView.setItemIconSize(i);
    }

    public void setItemIconSizeRes(@InterfaceC4398 int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.menuView.setIconTintList(colorStateList);
    }

    public void setItemOnTouchListener(int i, @InterfaceC6490 View.OnTouchListener onTouchListener) {
        this.menuView.setItemOnTouchListener(i, onTouchListener);
    }

    public void setItemPaddingBottom(@InterfaceC6844 int i) {
        this.menuView.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(@InterfaceC6844 int i) {
        this.menuView.setItemPaddingTop(i);
    }

    public void setItemRippleColor(@InterfaceC6490 ColorStateList colorStateList) {
        this.menuView.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(@InterfaceC7651 int i) {
        this.menuView.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.menuView.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextAppearanceInactive(@InterfaceC7651 int i) {
        this.menuView.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(@InterfaceC6490 ColorStateList colorStateList) {
        this.menuView.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.menuView.getLabelVisibilityMode() != i) {
            this.menuView.setLabelVisibilityMode(i);
            this.presenter.updateMenuView(false);
        }
    }

    public void setOnItemReselectedListener(@InterfaceC6490 OnItemReselectedListener onItemReselectedListener) {
        this.reselectedListener = onItemReselectedListener;
    }

    public void setOnItemSelectedListener(@InterfaceC6490 OnItemSelectedListener onItemSelectedListener) {
        this.selectedListener = onItemSelectedListener;
    }

    public void setSelectedItemId(@InterfaceC5411 int i) {
        MenuItem menuItemFindItem = this.menu.findItem(i);
        if (menuItemFindItem == null || this.menu.performItemAction(menuItemFindItem, this.presenter, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }
}
