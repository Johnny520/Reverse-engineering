package com.google.android.material.navigation;

import Yue.AbstractC2967;
import Yue.C3323;
import Yue.C3505;
import Yue.C4187;
import Yue.C4537;
import Yue.C5194;
import Yue.C6898;
import Yue.C7683;
import Yue.C7837;
import Yue.C8273;
import Yue.C8472;
import Yue.InterfaceC4398;
import Yue.InterfaceC4399;
import Yue.InterfaceC4525;
import Yue.InterfaceC5411;
import Yue.InterfaceC5683;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import Yue.InterfaceC7144;
import Yue.InterfaceC7651;
import Yue.InterfaceC8392;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C8694;
import androidx.appcompat.view.menu.C8697;
import com.google.android.material.C1980R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.WindowUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeableDelegate;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements MaterialBackHandler {
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    private final C4537.InterfaceC4540 backDrawerListener;
    private final MaterialBackOrchestrator backOrchestrator;
    private boolean bottomInsetScrimEnabled;

    @InterfaceC6844
    private int drawerLayoutCornerSize;
    private final boolean drawerLayoutCornerSizeBackAnimationEnabled;

    @InterfaceC6844
    private final int drawerLayoutCornerSizeBackAnimationMax;
    OnNavigationItemSelectedListener listener;
    private final int maxWidth;

    @InterfaceC6391
    private final NavigationMenu menu;
    private MenuInflater menuInflater;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final NavigationMenuPresenter presenter;
    private final ShapeableDelegate shapeableDelegate;
    private final MaterialSideContainerBackHelper sideContainerBackHelper;
    private final int[] tmpLocation;
    private boolean topInsetScrimEnabled;
    private static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    private static final int[] DISABLED_STATE_SET = {-16842910};
    private static final int DEF_STYLE_RES = C1980R.style.Widget_Design_NavigationView;

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@InterfaceC6391 MenuItem menuItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NavigationView(@InterfaceC6391 Context context) {
        this(context, null);
    }

    @InterfaceC6490
    private ColorStateList createDefaultColorStateList(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListM395 = C3323.m395(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C6898.C1110.f18437, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateListM395.getDefaultColor();
        int[] iArr = DISABLED_STATE_SET;
        return new ColorStateList(new int[][]{iArr, CHECKED_STATE_SET, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListM395.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    @InterfaceC6391
    private Drawable createDefaultItemBackground(@InterfaceC6391 C7837 c7837) {
        return createDefaultItemDrawable(c7837, MaterialResources.getColorStateList(getContext(), c7837, C1980R.styleable.NavigationView_itemShapeFillColor));
    }

    @InterfaceC6391
    private Drawable createDefaultItemDrawable(@InterfaceC6391 C7837 c7837, @InterfaceC6490 ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(getContext(), c7837.m24888(C1980R.styleable.NavigationView_itemShapeAppearance, 0), c7837.m24888(C1980R.styleable.NavigationView_itemShapeAppearanceOverlay, 0)).build());
        materialShapeDrawable.setFillColor(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, c7837.m24874(C1980R.styleable.NavigationView_itemShapeInsetStart, 0), c7837.m24874(C1980R.styleable.NavigationView_itemShapeInsetTop, 0), c7837.m24874(C1980R.styleable.NavigationView_itemShapeInsetEnd, 0), c7837.m24874(C1980R.styleable.NavigationView_itemShapeInsetBottom, 0));
    }

    private MenuInflater getMenuInflater() {
        if (this.menuInflater == null) {
            this.menuInflater = new C7683(getContext());
        }
        return this.menuInflater;
    }

    private boolean hasShapeAppearance(@InterfaceC6391 C7837 c7837) {
        return c7837.m24896(C1980R.styleable.NavigationView_itemShapeAppearance) || c7837.m24896(C1980R.styleable.NavigationView_itemShapeAppearanceOverlay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatchDraw$0(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeClearCornerSizeAnimationForDrawerLayout() {
        if (!this.drawerLayoutCornerSizeBackAnimationEnabled || this.drawerLayoutCornerSize == 0) {
            return;
        }
        this.drawerLayoutCornerSize = 0;
        maybeUpdateCornerSizeForDrawerLayout(getWidth(), getHeight());
    }

    private void maybeUpdateCornerSizeForDrawerLayout(@InterfaceC6844 int i, @InterfaceC6844 int i2) {
        if ((getParent() instanceof C4537) && (getLayoutParams() instanceof C4537.C4541)) {
            if ((this.drawerLayoutCornerSize > 0 || this.drawerLayoutCornerSizeBackAnimationEnabled) && (getBackground() instanceof MaterialShapeDrawable)) {
                boolean z = C5194.m15901(((C4537.C4541) getLayoutParams()).f955, C8273.m27356(this)) == 3;
                MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
                ShapeAppearanceModel.Builder allCornerSizes = materialShapeDrawable.getShapeAppearanceModel().toBuilder().setAllCornerSizes(this.drawerLayoutCornerSize);
                if (z) {
                    allCornerSizes.setTopLeftCornerSize(0.0f);
                    allCornerSizes.setBottomLeftCornerSize(0.0f);
                } else {
                    allCornerSizes.setTopRightCornerSize(0.0f);
                    allCornerSizes.setBottomRightCornerSize(0.0f);
                }
                ShapeAppearanceModel shapeAppearanceModelBuild = allCornerSizes.build();
                materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModelBuild);
                this.shapeableDelegate.onShapeAppearanceChanged(this, shapeAppearanceModelBuild);
                this.shapeableDelegate.onMaskChanged(this, new RectF(0.0f, 0.0f, i, i2));
                this.shapeableDelegate.setOffsetZeroCornerEdgeBoundsEnabled(this, true);
            }
        }
    }

    @CanIgnoreReturnValue
    private Pair<C4537, C4537.C4541> requireDrawerLayoutParent() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof C4537) && (layoutParams instanceof C4537.C4541)) {
            return new Pair<>((C4537) parent, (C4537.C4541) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    private void setupInsetScrimsListener() {
        this.onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.google.android.material.navigation.NavigationView.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                NavigationView navigationView = NavigationView.this;
                navigationView.getLocationOnScreen(navigationView.tmpLocation);
                boolean z = true;
                boolean z2 = NavigationView.this.tmpLocation[1] == 0;
                NavigationView.this.presenter.setBehindStatusBar(z2);
                NavigationView navigationView2 = NavigationView.this;
                navigationView2.setDrawTopInsetForeground(z2 && navigationView2.isTopInsetScrimEnabled());
                NavigationView.this.setDrawLeftInsetForeground(NavigationView.this.tmpLocation[0] == 0 || NavigationView.this.tmpLocation[0] + NavigationView.this.getWidth() == 0);
                Activity activity = ContextUtils.getActivity(NavigationView.this.getContext());
                if (activity != null) {
                    Rect currentWindowBounds = WindowUtils.getCurrentWindowBounds(activity);
                    boolean z3 = currentWindowBounds.height() - NavigationView.this.getHeight() == NavigationView.this.tmpLocation[1];
                    boolean z4 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
                    NavigationView navigationView3 = NavigationView.this;
                    navigationView3.setDrawBottomInsetForeground(z3 && z4 && navigationView3.isBottomInsetScrimEnabled());
                    if (currentWindowBounds.width() != NavigationView.this.tmpLocation[0] && currentWindowBounds.width() - NavigationView.this.getWidth() != NavigationView.this.tmpLocation[0]) {
                        z = false;
                    }
                    NavigationView.this.setDrawRightInsetForeground(z);
                }
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.onGlobalLayoutListener);
    }

    public void addHeaderView(@InterfaceC6391 View view) {
        this.presenter.addHeaderView(view);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.cancelBackProgress();
        maybeClearCornerSizeAnimationForDrawerLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@InterfaceC6391 Canvas canvas) {
        this.shapeableDelegate.maybeClip(canvas, new CanvasCompat.CanvasOperation() { // from class: Yue.ۥۡۢۡۤ
            @Override // com.google.android.material.canvas.CanvasCompat.CanvasOperation
            public final void run(Canvas canvas2) {
                this.f2036.lambda$dispatchDraw$0(canvas2);
            }
        });
    }

    @InterfaceC8392
    public MaterialSideContainerBackHelper getBackHelper() {
        return this.sideContainerBackHelper;
    }

    @InterfaceC6490
    public MenuItem getCheckedItem() {
        return this.presenter.getCheckedItem();
    }

    @InterfaceC6844
    public int getDividerInsetEnd() {
        return this.presenter.getDividerInsetEnd();
    }

    @InterfaceC6844
    public int getDividerInsetStart() {
        return this.presenter.getDividerInsetStart();
    }

    public int getHeaderCount() {
        return this.presenter.getHeaderCount();
    }

    public View getHeaderView(int i) {
        return this.presenter.getHeaderView(i);
    }

    @InterfaceC6490
    public Drawable getItemBackground() {
        return this.presenter.getItemBackground();
    }

    @InterfaceC4399
    public int getItemHorizontalPadding() {
        return this.presenter.getItemHorizontalPadding();
    }

    @InterfaceC4399
    public int getItemIconPadding() {
        return this.presenter.getItemIconPadding();
    }

    @InterfaceC6490
    public ColorStateList getItemIconTintList() {
        return this.presenter.getItemTintList();
    }

    public int getItemMaxLines() {
        return this.presenter.getItemMaxLines();
    }

    @InterfaceC6490
    public ColorStateList getItemTextColor() {
        return this.presenter.getItemTextColor();
    }

    @InterfaceC6844
    public int getItemVerticalPadding() {
        return this.presenter.getItemVerticalPadding();
    }

    @InterfaceC6391
    public Menu getMenu() {
        return this.menu;
    }

    @InterfaceC6844
    public int getSubheaderInsetEnd() {
        return this.presenter.getSubheaderInsetEnd();
    }

    @InterfaceC6844
    public int getSubheaderInsetStart() {
        return this.presenter.getSubheaderInsetStart();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        Pair<C4537, C4537.C4541> pairRequireDrawerLayoutParent = requireDrawerLayoutParent();
        C4537 c4537 = (C4537) pairRequireDrawerLayoutParent.first;
        C3505 c3505OnHandleBackInvoked = this.sideContainerBackHelper.onHandleBackInvoked();
        if (c3505OnHandleBackInvoked == null || Build.VERSION.SDK_INT < 34) {
            c4537.m13315(this);
            return;
        }
        this.sideContainerBackHelper.finishBackProgress(c3505OnHandleBackInvoked, ((C4537.C4541) pairRequireDrawerLayoutParent.second).f955, DrawerLayoutUtils.getScrimCloseAnimatorListener(c4537, this), DrawerLayoutUtils.getScrimCloseAnimatorUpdateListener(c4537));
    }

    public View inflateHeaderView(@InterfaceC5683 int i) {
        return this.presenter.inflateHeaderView(i);
    }

    public void inflateMenu(int i) {
        this.presenter.setUpdateSuspended(true);
        getMenuInflater().inflate(i, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(false);
    }

    public boolean isBottomInsetScrimEnabled() {
        return this.bottomInsetScrimEnabled;
    }

    public boolean isTopInsetScrimEnabled() {
        return this.topInsetScrimEnabled;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
        ViewParent parent = getParent();
        if ((parent instanceof C4537) && this.backOrchestrator.shouldListenForBackCallbacks()) {
            C4537 c4537 = (C4537) parent;
            c4537.m13347(this.backDrawerListener);
            c4537.m1475(this.backDrawerListener);
            if (c4537.m13336(this)) {
                this.backOrchestrator.startListeningForBackCallbacksWithPriorityOverlay();
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
        ViewParent parent = getParent();
        if (parent instanceof C4537) {
            ((C4537) parent).m13347(this.backDrawerListener);
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public void onInsetsChanged(@InterfaceC6391 C8472 c8472) {
        this.presenter.dispatchApplyWindowInsets(c8472);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.maxWidth), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(this.maxWidth, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.menu.restorePresenterStates(savedState.menuState);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.menuState = bundle;
        this.menu.savePresenterStates(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        maybeUpdateCornerSizeForDrawerLayout(i, i2);
    }

    public void removeHeaderView(@InterfaceC6391 View view) {
        this.presenter.removeHeaderView(view);
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.bottomInsetScrimEnabled = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCheckedItem(@InterfaceC5411 int i) {
        MenuItem menuItemFindItem = this.menu.findItem(i);
        if (menuItemFindItem != null) {
            this.presenter.setCheckedItem((C8697) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(@InterfaceC6844 int i) {
        this.presenter.setDividerInsetEnd(i);
    }

    public void setDividerInsetStart(@InterfaceC6844 int i) {
        this.presenter.setDividerInsetStart(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.setElevation(this, f);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @InterfaceC8392
    public void setForceCompatClippingEnabled(boolean z) {
        this.shapeableDelegate.setForceCompatClippingEnabled(this, z);
    }

    public void setItemBackground(@InterfaceC6490 Drawable drawable) {
        this.presenter.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@InterfaceC4525 int i) {
        setItemBackground(C4187.m12065(getContext(), i));
    }

    public void setItemHorizontalPadding(@InterfaceC4399 int i) {
        this.presenter.setItemHorizontalPadding(i);
    }

    public void setItemHorizontalPaddingResource(@InterfaceC4398 int i) {
        this.presenter.setItemHorizontalPadding(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(@InterfaceC4399 int i) {
        this.presenter.setItemIconPadding(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.presenter.setItemIconPadding(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(@InterfaceC4399 int i) {
        this.presenter.setItemIconSize(i);
    }

    public void setItemIconTintList(@InterfaceC6490 ColorStateList colorStateList) {
        this.presenter.setItemIconTintList(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.presenter.setItemMaxLines(i);
    }

    public void setItemTextAppearance(@InterfaceC7651 int i) {
        this.presenter.setItemTextAppearance(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.presenter.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextColor(@InterfaceC6490 ColorStateList colorStateList) {
        this.presenter.setItemTextColor(colorStateList);
    }

    public void setItemVerticalPadding(@InterfaceC6844 int i) {
        this.presenter.setItemVerticalPadding(i);
    }

    public void setItemVerticalPaddingResource(@InterfaceC4398 int i) {
        this.presenter.setItemVerticalPadding(getResources().getDimensionPixelSize(i));
    }

    public void setNavigationItemSelectedListener(@InterfaceC6490 OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.listener = onNavigationItemSelectedListener;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        NavigationMenuPresenter navigationMenuPresenter = this.presenter;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.setOverScrollMode(i);
        }
    }

    public void setSubheaderInsetEnd(@InterfaceC6844 int i) {
        this.presenter.setSubheaderInsetEnd(i);
    }

    public void setSubheaderInsetStart(@InterfaceC6844 int i) {
        this.presenter.setSubheaderInsetStart(i);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.topInsetScrimEnabled = z;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@InterfaceC6391 C3505 c3505) {
        requireDrawerLayoutParent();
        this.sideContainerBackHelper.startBackProgress(c3505);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@InterfaceC6391 C3505 c3505) {
        this.sideContainerBackHelper.updateBackProgress(c3505, ((C4537.C4541) requireDrawerLayoutParent().second).f955);
        if (this.drawerLayoutCornerSizeBackAnimationEnabled) {
            this.drawerLayoutCornerSize = AnimationUtils.lerp(0, this.drawerLayoutCornerSizeBackAnimationMax, this.sideContainerBackHelper.interpolateProgress(c3505.m565()));
            maybeUpdateCornerSizeForDrawerLayout(getWidth(), getHeight());
        }
    }

    public static class SavedState extends AbstractC2967 {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.navigation.NavigationView.SavedState.1
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
        public Bundle menuState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavedState(@InterfaceC6391 Parcel parcel, @InterfaceC6490 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.menuState = parcel.readBundle(classLoader);
        }

        @Override // Yue.AbstractC2967, android.os.Parcelable
        public void writeToParcel(@InterfaceC6391 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.menuState);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public NavigationView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C1980R.attr.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        ColorStateList colorStateListCreateDefaultColorStateList;
        int i2;
        int i3;
        int i4 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i4), attributeSet, i);
        NavigationMenuPresenter navigationMenuPresenter = new NavigationMenuPresenter();
        this.presenter = navigationMenuPresenter;
        this.tmpLocation = new int[2];
        this.topInsetScrimEnabled = true;
        this.bottomInsetScrimEnabled = true;
        this.drawerLayoutCornerSize = 0;
        this.shapeableDelegate = ShapeableDelegate.create(this);
        this.sideContainerBackHelper = new MaterialSideContainerBackHelper(this);
        this.backOrchestrator = new MaterialBackOrchestrator(this);
        this.backDrawerListener = new C4537.AbstractC4543() { // from class: com.google.android.material.navigation.NavigationView.1
            @Override // Yue.C4537.AbstractC4543, Yue.C4537.InterfaceC4540
            public void onDrawerClosed(@InterfaceC6391 View view) {
                NavigationView navigationView = NavigationView.this;
                if (view == navigationView) {
                    navigationView.backOrchestrator.stopListeningForBackCallbacks();
                    NavigationView.this.maybeClearCornerSizeAnimationForDrawerLayout();
                }
            }

            @Override // Yue.C4537.AbstractC4543, Yue.C4537.InterfaceC4540
            public void onDrawerOpened(@InterfaceC6391 View view) {
                NavigationView navigationView = NavigationView.this;
                if (view == navigationView) {
                    final MaterialBackOrchestrator materialBackOrchestrator = navigationView.backOrchestrator;
                    Objects.requireNonNull(materialBackOrchestrator);
                    view.post(new Runnable() { // from class: Yue.ۥۡۢۡۥ
                        @Override // java.lang.Runnable
                        public final void run() {
                            materialBackOrchestrator.startListeningForBackCallbacksWithPriorityOverlay();
                        }
                    });
                }
            }
        };
        Context context2 = getContext();
        NavigationMenu navigationMenu = new NavigationMenu(context2);
        this.menu = navigationMenu;
        C7837 c7837ObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, C1980R.styleable.NavigationView, i, i4, new int[0]);
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationView_android_background)) {
            C8273.m27447(this, c7837ObtainTintedStyledAttributes.m24875(C1980R.styleable.NavigationView_android_background));
        }
        int iM24874 = c7837ObtainTintedStyledAttributes.m24874(C1980R.styleable.NavigationView_drawerLayoutCornerSize, 0);
        this.drawerLayoutCornerSize = iM24874;
        this.drawerLayoutCornerSizeBackAnimationEnabled = iM24874 == 0;
        this.drawerLayoutCornerSizeBackAnimationMax = getResources().getDimensionPixelSize(C1980R.dimen.m3_navigation_drawer_layout_corner_size);
        Drawable background = getBackground();
        ColorStateList colorStateListOrNull = DrawableUtils.getColorStateListOrNull(background);
        if (background == null || colorStateListOrNull != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.builder(context2, attributeSet, i, i4).build());
            if (colorStateListOrNull != null) {
                materialShapeDrawable.setFillColor(colorStateListOrNull);
            }
            materialShapeDrawable.initializeElevationOverlay(context2);
            C8273.m27447(this, materialShapeDrawable);
        }
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationView_elevation)) {
            setElevation(c7837ObtainTintedStyledAttributes.m24874(C1980R.styleable.NavigationView_elevation, 0));
        }
        setFitsSystemWindows(c7837ObtainTintedStyledAttributes.m3933(C1980R.styleable.NavigationView_android_fitsSystemWindows, false));
        this.maxWidth = c7837ObtainTintedStyledAttributes.m24874(C1980R.styleable.NavigationView_android_maxWidth, 0);
        ColorStateList colorStateListM24871 = c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationView_subheaderColor) ? c7837ObtainTintedStyledAttributes.m24871(C1980R.styleable.NavigationView_subheaderColor) : null;
        int iM24888 = c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationView_subheaderTextAppearance) ? c7837ObtainTintedStyledAttributes.m24888(C1980R.styleable.NavigationView_subheaderTextAppearance, 0) : 0;
        if (iM24888 == 0 && colorStateListM24871 == null) {
            colorStateListM24871 = createDefaultColorStateList(R.attr.textColorSecondary);
        }
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationView_itemIconTint)) {
            colorStateListCreateDefaultColorStateList = c7837ObtainTintedStyledAttributes.m24871(C1980R.styleable.NavigationView_itemIconTint);
        } else {
            colorStateListCreateDefaultColorStateList = createDefaultColorStateList(R.attr.textColorSecondary);
        }
        int iM248882 = c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationView_itemTextAppearance) ? c7837ObtainTintedStyledAttributes.m24888(C1980R.styleable.NavigationView_itemTextAppearance, 0) : 0;
        boolean zM3933 = c7837ObtainTintedStyledAttributes.m3933(C1980R.styleable.NavigationView_itemTextAppearanceActiveBoldEnabled, true);
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationView_itemIconSize)) {
            setItemIconSize(c7837ObtainTintedStyledAttributes.m24874(C1980R.styleable.NavigationView_itemIconSize, 0));
        }
        ColorStateList colorStateListM248712 = c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationView_itemTextColor) ? c7837ObtainTintedStyledAttributes.m24871(C1980R.styleable.NavigationView_itemTextColor) : null;
        if (iM248882 == 0 && colorStateListM248712 == null) {
            colorStateListM248712 = createDefaultColorStateList(R.attr.textColorPrimary);
        }
        Drawable drawableM24875 = c7837ObtainTintedStyledAttributes.m24875(C1980R.styleable.NavigationView_itemBackground);
        if (drawableM24875 == null && hasShapeAppearance(c7837ObtainTintedStyledAttributes)) {
            drawableM24875 = createDefaultItemBackground(c7837ObtainTintedStyledAttributes);
            ColorStateList colorStateList = MaterialResources.getColorStateList(context2, c7837ObtainTintedStyledAttributes, C1980R.styleable.NavigationView_itemRippleColor);
            if (colorStateList != null) {
                navigationMenuPresenter.setItemForeground(new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(colorStateList), null, createDefaultItemDrawable(c7837ObtainTintedStyledAttributes, null)));
            }
        }
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationView_itemHorizontalPadding)) {
            i2 = 0;
            setItemHorizontalPadding(c7837ObtainTintedStyledAttributes.m24874(C1980R.styleable.NavigationView_itemHorizontalPadding, 0));
        } else {
            i2 = 0;
        }
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationView_itemVerticalPadding)) {
            setItemVerticalPadding(c7837ObtainTintedStyledAttributes.m24874(C1980R.styleable.NavigationView_itemVerticalPadding, i2));
        }
        setDividerInsetStart(c7837ObtainTintedStyledAttributes.m24874(C1980R.styleable.NavigationView_dividerInsetStart, i2));
        setDividerInsetEnd(c7837ObtainTintedStyledAttributes.m24874(C1980R.styleable.NavigationView_dividerInsetEnd, i2));
        setSubheaderInsetStart(c7837ObtainTintedStyledAttributes.m24874(C1980R.styleable.NavigationView_subheaderInsetStart, i2));
        setSubheaderInsetEnd(c7837ObtainTintedStyledAttributes.m24874(C1980R.styleable.NavigationView_subheaderInsetEnd, i2));
        setTopInsetScrimEnabled(c7837ObtainTintedStyledAttributes.m3933(C1980R.styleable.NavigationView_topInsetScrimEnabled, this.topInsetScrimEnabled));
        setBottomInsetScrimEnabled(c7837ObtainTintedStyledAttributes.m3933(C1980R.styleable.NavigationView_bottomInsetScrimEnabled, this.bottomInsetScrimEnabled));
        int iM248742 = c7837ObtainTintedStyledAttributes.m24874(C1980R.styleable.NavigationView_itemIconPadding, i2);
        setItemMaxLines(c7837ObtainTintedStyledAttributes.m24882(C1980R.styleable.NavigationView_itemMaxLines, 1));
        navigationMenu.setCallback(new C8694.InterfaceC1603() { // from class: com.google.android.material.navigation.NavigationView.2
            @Override // androidx.appcompat.view.menu.C8694.InterfaceC1603
            public boolean onMenuItemSelected(C8694 c8694, MenuItem menuItem) {
                OnNavigationItemSelectedListener onNavigationItemSelectedListener = NavigationView.this.listener;
                return onNavigationItemSelectedListener != null && onNavigationItemSelectedListener.onNavigationItemSelected(menuItem);
            }

            @Override // androidx.appcompat.view.menu.C8694.InterfaceC1603
            public void onMenuModeChange(C8694 c8694) {
            }
        });
        navigationMenuPresenter.setId(1);
        navigationMenuPresenter.initForMenu(context2, navigationMenu);
        if (iM24888 != 0) {
            navigationMenuPresenter.setSubheaderTextAppearance(iM24888);
        }
        navigationMenuPresenter.setSubheaderColor(colorStateListM24871);
        navigationMenuPresenter.setItemIconTintList(colorStateListCreateDefaultColorStateList);
        navigationMenuPresenter.setOverScrollMode(getOverScrollMode());
        if (iM248882 != 0) {
            navigationMenuPresenter.setItemTextAppearance(iM248882);
        }
        navigationMenuPresenter.setItemTextAppearanceActiveBoldEnabled(zM3933);
        navigationMenuPresenter.setItemTextColor(colorStateListM248712);
        navigationMenuPresenter.setItemBackground(drawableM24875);
        navigationMenuPresenter.setItemIconPadding(iM248742);
        navigationMenu.addMenuPresenter(navigationMenuPresenter);
        addView((View) navigationMenuPresenter.getMenuView(this));
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationView_menu)) {
            i3 = 0;
            inflateMenu(c7837ObtainTintedStyledAttributes.m24888(C1980R.styleable.NavigationView_menu, 0));
        } else {
            i3 = 0;
        }
        if (c7837ObtainTintedStyledAttributes.m24896(C1980R.styleable.NavigationView_headerLayout)) {
            inflateHeaderView(c7837ObtainTintedStyledAttributes.m24888(C1980R.styleable.NavigationView_headerLayout, i3));
        }
        c7837ObtainTintedStyledAttributes.m24899();
        setupInsetScrimsListener();
    }

    public void setCheckedItem(@InterfaceC6391 MenuItem menuItem) {
        MenuItem menuItemFindItem = this.menu.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.presenter.setCheckedItem((C8697) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
