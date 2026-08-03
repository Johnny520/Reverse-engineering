package com.google.android.material.search;

import Yue.AbstractC2967;
import Yue.C3026;
import Yue.C3323;
import Yue.C4520;
import Yue.C5946;
import Yue.C6468;
import Yue.C7759;
import Yue.C8273;
import Yue.InterfaceC3897;
import Yue.InterfaceC4398;
import Yue.InterfaceC4399;
import Yue.InterfaceC4525;
import Yue.InterfaceC6166;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import Yue.InterfaceC7613;
import Yue.InterfaceC7651;
import android.R;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.C8694;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C1980R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes.dex */
public class SearchBar extends Toolbar {
    private static final int DEFAULT_SCROLL_FLAGS = 53;
    private static final int DEF_STYLE_RES = C1980R.style.Widget_Material3_SearchBar;
    private static final String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";

    @InterfaceC6490
    private final AccessibilityManager accessibilityManager;
    private MaterialShapeDrawable backgroundShape;

    @InterfaceC6490
    private View centerView;
    private final boolean defaultMarginsEnabled;
    private final Drawable defaultNavigationIcon;
    private boolean defaultScrollFlagsEnabled;
    private final boolean forceDefaultNavigationOnClickListener;
    private final boolean layoutInflated;
    private int menuResId;

    @InterfaceC6490
    private Integer navigationIconTint;

    @InterfaceC6490
    private Drawable originalNavigationIconBackground;
    private final SearchBarAnimationHelper searchBarAnimationHelper;
    private final TextView textView;
    private final boolean tintNavigationIcon;
    private final C3026.InterfaceC3029 touchExplorationStateChangeListener;

    public static abstract class OnLoadAnimationCallback {
        public void onAnimationEnd() {
        }

        public void onAnimationStart() {
        }
    }

    public static class SavedState extends AbstractC2967 {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.search.SearchBar.SavedState.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        String text;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // Yue.AbstractC2967, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.text);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SavedState(Parcel parcel, @InterfaceC6490 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.text = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SearchBar(@InterfaceC6391 Context context) {
        this(context, null);
    }

    private int defaultIfZero(int i, int i2) {
        return i == 0 ? i2 : i;
    }

    private ColorStateList getCompatBackgroundColorStateList(@InterfaceC3897 int i, @InterfaceC3897 int i2) {
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[]{R.attr.state_focused}, new int[0]};
        int iLayer = MaterialColors.layer(i, i2);
        return new ColorStateList(iArr, new int[]{iLayer, iLayer, i});
    }

    private void initBackground(ShapeAppearanceModel shapeAppearanceModel, @InterfaceC3897 int i, float f, float f2, @InterfaceC3897 int i2) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModel);
        this.backgroundShape = materialShapeDrawable;
        materialShapeDrawable.initializeElevationOverlay(getContext());
        this.backgroundShape.setElevation(f);
        if (f2 >= 0.0f) {
            this.backgroundShape.setStroke(f2, i2);
        }
        int color = MaterialColors.getColor(this, C1980R.attr.colorControlHighlight);
        this.backgroundShape.setFillColor(ColorStateList.valueOf(i));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(color);
        MaterialShapeDrawable materialShapeDrawable2 = this.backgroundShape;
        C8273.m27447(this, new RippleDrawable(colorStateListValueOf, materialShapeDrawable2, materialShapeDrawable2));
    }

    private void initNavigationIcon() {
        setNavigationIcon(getNavigationIcon() == null ? this.defaultNavigationIcon : getNavigationIcon());
        setNavigationIconDecorative(true);
    }

    private void initTextView(@InterfaceC7651 int i, String str, String str2) {
        if (i != -1) {
            C7759.m24676(this.textView, i);
        }
        setText(str);
        setHint(str2);
        if (getNavigationIcon() == null) {
            C5946.m18704((ViewGroup.MarginLayoutParams) this.textView.getLayoutParams(), getResources().getDimensionPixelSize(C1980R.dimen.m3_searchbar_text_margin_start_no_navigation_icon));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(boolean z) {
        setFocusableInTouchMode(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startOnLoadAnimation$1() {
        this.searchBarAnimationHelper.startOnLoadAnimation(this);
    }

    private void layoutCenterView() {
        View view = this.centerView;
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i = measuredWidth2 + measuredWidth;
        int measuredHeight = this.centerView.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        layoutChild(this.centerView, measuredWidth2, measuredHeight2, i, measuredHeight2 + measuredHeight);
    }

    private void layoutChild(View view, int i, int i2, int i3, int i4) {
        if (C8273.m27356(this) == 1) {
            view.layout(getMeasuredWidth() - i3, i2, getMeasuredWidth() - i, i4);
        } else {
            view.layout(i, i2, i3, i4);
        }
    }

    @InterfaceC6490
    private Drawable maybeTintNavigationIcon(@InterfaceC6490 Drawable drawable) {
        int color;
        if (!this.tintNavigationIcon || drawable == null) {
            return drawable;
        }
        Integer num = this.navigationIconTint;
        if (num != null) {
            color = num.intValue();
        } else {
            color = MaterialColors.getColor(this, drawable == this.defaultNavigationIcon ? C1980R.attr.colorOnSurfaceVariant : C1980R.attr.colorOnSurface);
        }
        Drawable drawableM13239 = C4520.m13239(drawable.mutate());
        C4520.m13235(drawableM13239, color);
        return drawableM13239;
    }

    private void measureCenterView(int i, int i2) {
        View view = this.centerView;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    private void setDefaultMargins() {
        if (this.defaultMarginsEnabled && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C1980R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = defaultIfZero(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = defaultIfZero(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = defaultIfZero(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = defaultIfZero(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    private void setHandwritingBoundsInsets() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z = getLayoutDirection() == 1;
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this);
        int width = (navigationIconButton == null || !navigationIconButton.isClickable()) ? 0 : z ? getWidth() - navigationIconButton.getLeft() : navigationIconButton.getRight();
        ActionMenuView actionMenuView = ToolbarUtils.getActionMenuView(this);
        int right = actionMenuView != null ? z ? actionMenuView.getRight() : getWidth() - actionMenuView.getLeft() : 0;
        float f = -(z ? right : width);
        if (!z) {
            width = right;
        }
        setHandwritingBoundsOffsets(f, 0.0f, -width, 0.0f);
    }

    private void setNavigationIconDecorative(boolean z) {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this);
        if (navigationIconButton == null) {
            return;
        }
        navigationIconButton.setClickable(!z);
        navigationIconButton.setFocusable(!z);
        Drawable background = navigationIconButton.getBackground();
        if (background != null) {
            this.originalNavigationIconBackground = background;
        }
        navigationIconButton.setBackgroundDrawable(z ? null : this.originalNavigationIconBackground);
        setHandwritingBoundsInsets();
    }

    private void setOrClearDefaultScrollFlags() {
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.defaultScrollFlagsEnabled) {
                if (layoutParams.getScrollFlags() == 0) {
                    layoutParams.setScrollFlags(53);
                }
            } else if (layoutParams.getScrollFlags() == 53) {
                layoutParams.setScrollFlags(0);
            }
        }
    }

    private void setupTouchExplorationStateChangeListener() {
        AccessibilityManager accessibilityManager = this.accessibilityManager;
        if (accessibilityManager != null) {
            if (accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled()) {
                setFocusableInTouchMode(true);
            }
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.search.SearchBar.1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    C3026.m92(SearchBar.this.accessibilityManager, SearchBar.this.touchExplorationStateChangeListener);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    C3026.m5943(SearchBar.this.accessibilityManager, SearchBar.this.touchExplorationStateChangeListener);
                }
            });
        }
    }

    private void validateAttributes(@InterfaceC6490 AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue(NAMESPACE_APP, C6468.f16546) != null) {
            throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
        }
        if (attributeSet.getAttributeValue(NAMESPACE_APP, "subtitle") != null) {
            throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
        }
    }

    public void addCollapseAnimationListener(@InterfaceC6391 AnimatorListenerAdapter animatorListenerAdapter) {
        this.searchBarAnimationHelper.addCollapseAnimationListener(animatorListenerAdapter);
    }

    public void addExpandAnimationListener(@InterfaceC6391 AnimatorListenerAdapter animatorListenerAdapter) {
        this.searchBarAnimationHelper.addExpandAnimationListener(animatorListenerAdapter);
    }

    public void addOnLoadAnimationCallback(@InterfaceC6391 OnLoadAnimationCallback onLoadAnimationCallback) {
        this.searchBarAnimationHelper.addOnLoadAnimationCallback(onLoadAnimationCallback);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.layoutInflated && this.centerView == null && !(view instanceof ActionMenuView)) {
            this.centerView = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i, layoutParams);
    }

    public void clearText() {
        this.textView.setText("");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @CanIgnoreReturnValue
    public boolean collapse(@InterfaceC6391 View view) {
        return collapse(view, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @CanIgnoreReturnValue
    public boolean expand(@InterfaceC6391 View view) {
        return expand(view, null);
    }

    @InterfaceC6490
    public View getCenterView() {
        return this.centerView;
    }

    public float getCompatElevation() {
        MaterialShapeDrawable materialShapeDrawable = this.backgroundShape;
        return materialShapeDrawable != null ? materialShapeDrawable.getElevation() : C8273.m27347(this);
    }

    public float getCornerSize() {
        return this.backgroundShape.getTopLeftCornerResolvedSize();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @InterfaceC4398
    public int getDefaultMarginVerticalResource() {
        return C1980R.dimen.m3_searchbar_margin_vertical;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @InterfaceC4525
    public int getDefaultNavigationIconResource() {
        return C1980R.drawable.ic_search_black_24;
    }

    @InterfaceC6490
    public CharSequence getHint() {
        return this.textView.getHint();
    }

    public int getMenuResId() {
        return this.menuResId;
    }

    @InterfaceC3897
    public int getStrokeColor() {
        return this.backgroundShape.getStrokeColor().getDefaultColor();
    }

    @InterfaceC4399
    public float getStrokeWidth() {
        return this.backgroundShape.getStrokeWidth();
    }

    @InterfaceC6391
    public CharSequence getText() {
        return this.textView.getText();
    }

    @InterfaceC6391
    public TextView getTextView() {
        return this.textView;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(@InterfaceC6166 int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof C8694;
        if (z) {
            ((C8694) menu).stopDispatchingItemsChanged();
        }
        super.inflateMenu(i);
        this.menuResId = i;
        if (z) {
            ((C8694) menu).startDispatchingItemsChanged();
        }
    }

    public boolean isCollapsing() {
        return this.searchBarAnimationHelper.isCollapsing();
    }

    public boolean isDefaultScrollFlagsEnabled() {
        return this.defaultScrollFlagsEnabled;
    }

    public boolean isExpanding() {
        return this.searchBarAnimationHelper.isExpanding();
    }

    public boolean isOnLoadAnimationFadeInEnabled() {
        return this.searchBarAnimationHelper.isOnLoadAnimationFadeInEnabled();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this, this.backgroundShape);
        setDefaultMargins();
        setOrClearDefaultScrollFlags();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        accessibilityNodeInfo.setHintText(getHint());
        accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        layoutCenterView();
        setHandwritingBoundsInsets();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        measureCenterView(i, i2);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @InterfaceC6391
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.text = text == null ? null : text.toString();
        return savedState;
    }

    public boolean removeCollapseAnimationListener(@InterfaceC6391 AnimatorListenerAdapter animatorListenerAdapter) {
        return this.searchBarAnimationHelper.removeCollapseAnimationListener(animatorListenerAdapter);
    }

    public boolean removeExpandAnimationListener(@InterfaceC6391 AnimatorListenerAdapter animatorListenerAdapter) {
        return this.searchBarAnimationHelper.removeExpandAnimationListener(animatorListenerAdapter);
    }

    public boolean removeOnLoadAnimationCallback(@InterfaceC6391 OnLoadAnimationCallback onLoadAnimationCallback) {
        return this.searchBarAnimationHelper.removeOnLoadAnimationCallback(onLoadAnimationCallback);
    }

    public void setCenterView(@InterfaceC6490 View view) {
        View view2 = this.centerView;
        if (view2 != null) {
            removeView(view2);
            this.centerView = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
        this.defaultScrollFlagsEnabled = z;
        setOrClearDefaultScrollFlags();
    }

    @Override // android.view.View
    @InterfaceC7113(21)
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeDrawable materialShapeDrawable = this.backgroundShape;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHint(@InterfaceC6490 CharSequence charSequence) {
        this.textView.setHint(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@InterfaceC6490 Drawable drawable) {
        super.setNavigationIcon(maybeTintNavigationIcon(drawable));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.forceDefaultNavigationOnClickListener) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
        this.searchBarAnimationHelper.setOnLoadAnimationFadeInEnabled(z);
    }

    public void setStrokeColor(@InterfaceC3897 int i) {
        if (getStrokeColor() != i) {
            this.backgroundShape.setStrokeColor(ColorStateList.valueOf(i));
        }
    }

    public void setStrokeWidth(@InterfaceC4399 float f) {
        if (getStrokeWidth() != f) {
            this.backgroundShape.setStrokeWidth(f);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setText(@InterfaceC6490 CharSequence charSequence) {
        this.textView.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public void startOnLoadAnimation() {
        post(new Runnable() { // from class: Yue.ۥۡۧۦۢ
            @Override // java.lang.Runnable
            public final void run() {
                this.f21934.lambda$startOnLoadAnimation$1();
            }
        });
    }

    public void stopOnLoadAnimation() {
        this.searchBarAnimationHelper.stopOnLoadAnimation(this);
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        private boolean initialized;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ScrollingViewBehavior() {
            this.initialized = false;
        }

        private void setAppBarLayoutTransparent(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public boolean onDependentViewChanged(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 View view, @InterfaceC6391 View view2) {
            boolean zOnDependentViewChanged = super.onDependentViewChanged(coordinatorLayout, view, view2);
            if (!this.initialized && (view2 instanceof AppBarLayout)) {
                this.initialized = true;
                setAppBarLayoutTransparent((AppBarLayout) view2);
            }
            return zOnDependentViewChanged;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public boolean shouldHeaderOverlapScrollingChild() {
            return true;
        }

        public ScrollingViewBehavior(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.initialized = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public SearchBar(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C1980R.attr.materialSearchBarStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @CanIgnoreReturnValue
    public boolean collapse(@InterfaceC6391 View view, @InterfaceC6490 AppBarLayout appBarLayout) {
        return collapse(view, appBarLayout, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @CanIgnoreReturnValue
    public boolean expand(@InterfaceC6391 View view, @InterfaceC6490 AppBarLayout appBarLayout) {
        return expand(view, appBarLayout, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setHint(@InterfaceC7613 int i) {
        this.textView.setHint(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setText(@InterfaceC7613 int i) {
        this.textView.setText(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchBar(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.menuResId = -1;
        this.touchExplorationStateChangeListener = new C3026.InterfaceC3029() { // from class: Yue.ۥۡۧۦۣ
            @Override // Yue.C3026.InterfaceC3029
            public final void onTouchExplorationStateChanged(boolean z) {
                this.f2770.lambda$new$0(z);
            }
        };
        Context context2 = getContext();
        validateAttributes(attributeSet);
        this.defaultNavigationIcon = C3323.m396(context2, getDefaultNavigationIconResource());
        this.searchBarAnimationHelper = new SearchBarAnimationHelper();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C1980R.styleable.SearchBar, i, i2, new int[0]);
        ShapeAppearanceModel shapeAppearanceModelBuild = ShapeAppearanceModel.builder(context2, attributeSet, i, i2).build();
        int color = typedArrayObtainStyledAttributes.getColor(C1980R.styleable.SearchBar_backgroundTint, 0);
        float dimension = typedArrayObtainStyledAttributes.getDimension(C1980R.styleable.SearchBar_elevation, 0.0f);
        this.defaultMarginsEnabled = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.SearchBar_defaultMarginsEnabled, true);
        this.defaultScrollFlagsEnabled = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.SearchBar_defaultScrollFlagsEnabled, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.SearchBar_hideNavigationIcon, false);
        this.forceDefaultNavigationOnClickListener = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.SearchBar_forceDefaultNavigationOnClickListener, false);
        this.tintNavigationIcon = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.SearchBar_tintNavigationIcon, true);
        if (typedArrayObtainStyledAttributes.hasValue(C1980R.styleable.SearchBar_navigationIconTint)) {
            this.navigationIconTint = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(C1980R.styleable.SearchBar_navigationIconTint, -1));
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.SearchBar_android_textAppearance, -1);
        String string = typedArrayObtainStyledAttributes.getString(C1980R.styleable.SearchBar_android_text);
        String string2 = typedArrayObtainStyledAttributes.getString(C1980R.styleable.SearchBar_android_hint);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(C1980R.styleable.SearchBar_strokeWidth, -1.0f);
        int color2 = typedArrayObtainStyledAttributes.getColor(C1980R.styleable.SearchBar_strokeColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            initNavigationIcon();
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(C1980R.layout.mtrl_search_bar, this);
        this.layoutInflated = true;
        this.textView = (TextView) findViewById(C1980R.id.open_search_bar_text_view);
        C8273.m27453(this, dimension);
        initTextView(resourceId, string, string2);
        initBackground(shapeAppearanceModelBuild, color, dimension, dimension2, color2);
        this.accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setupTouchExplorationStateChangeListener();
    }

    @CanIgnoreReturnValue
    public boolean collapse(@InterfaceC6391 View view, @InterfaceC6490 AppBarLayout appBarLayout, boolean z) {
        if ((view.getVisibility() != 0 || isCollapsing()) && !isExpanding()) {
            return false;
        }
        this.searchBarAnimationHelper.startCollapseAnimation(this, view, appBarLayout, z);
        return true;
    }

    @CanIgnoreReturnValue
    public boolean expand(@InterfaceC6391 View view, @InterfaceC6490 AppBarLayout appBarLayout, boolean z) {
        if ((view.getVisibility() == 0 || isExpanding()) && !isCollapsing()) {
            return false;
        }
        this.searchBarAnimationHelper.startExpandAnimation(this, view, appBarLayout, z);
        return true;
    }
}
