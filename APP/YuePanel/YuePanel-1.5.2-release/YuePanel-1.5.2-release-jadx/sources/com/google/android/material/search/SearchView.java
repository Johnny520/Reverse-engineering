package com.google.android.material.search;

import Yue.AbstractC2967;
import Yue.C3323;
import Yue.C3505;
import Yue.C4520;
import Yue.C4536;
import Yue.C7759;
import Yue.C8273;
import Yue.C8472;
import Yue.InterfaceC3897;
import Yue.InterfaceC4525;
import Yue.InterfaceC6166;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6545;
import Yue.InterfaceC6844;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import Yue.InterfaceC7613;
import Yue.InterfaceC7651;
import Yue.InterfaceC8392;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.C1980R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.search.SearchView;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends FrameLayout implements CoordinatorLayout.InterfaceC1654, MaterialBackHandler {
    private static final int DEF_STYLE_RES = C1980R.style.Widget_Material3_SearchView;
    private static final long TALKBACK_FOCUS_CHANGE_DELAY_MS = 100;
    private boolean animatedMenuItems;
    private boolean animatedNavigationIcon;
    private boolean autoShowKeyboard;
    private final boolean backHandlingEnabled;

    @InterfaceC6391
    private final MaterialBackOrchestrator backOrchestrator;

    @InterfaceC3897
    private final int backgroundColor;
    final View backgroundView;
    private Map<View, Integer> childImportantForAccessibilityMap;
    final ImageButton clearButton;
    final TouchObserverFrameLayout contentContainer;

    @InterfaceC6391
    private TransitionState currentTransitionState;
    final View divider;
    final Toolbar dummyToolbar;
    final EditText editText;
    private final ElevationOverlayProvider elevationOverlayProvider;
    final FrameLayout headerContainer;
    private final boolean layoutInflated;
    final ClippableRoundedCornerLayout rootView;
    final View scrim;

    @InterfaceC6490
    private SearchBar searchBar;
    final TextView searchPrefix;
    private final SearchViewAnimationHelper searchViewAnimationHelper;
    private int softInputMode;
    final View statusBarSpacer;
    private boolean statusBarSpacerEnabledOverride;
    final MaterialToolbar toolbar;
    final FrameLayout toolbarContainer;
    private final Set<TransitionListener> transitionListeners;
    private boolean useWindowInsetsController;

    public static class Behavior extends CoordinatorLayout.AbstractC8792<SearchView> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Behavior() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Behavior(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: onDependentViewChanged(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC8792
        public boolean onDependentViewChanged(@InterfaceC6391 CoordinatorLayout coordinatorLayout, @InterfaceC6391 SearchView searchView, @InterfaceC6391 View view) {
            if (searchView.isSetupWithSearchBar() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }
    }

    public static class SavedState extends AbstractC2967 {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.search.SearchView.SavedState.1
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
        int visibility;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // Yue.AbstractC2967, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.text);
            parcel.writeInt(this.visibility);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public SavedState(Parcel parcel, @InterfaceC6490 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.text = parcel.readString();
            this.visibility = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public interface TransitionListener {
        void onStateChanged(@InterfaceC6391 SearchView searchView, @InterfaceC6391 TransitionState transitionState, @InterfaceC6391 TransitionState transitionState2);
    }

    public enum TransitionState {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SearchView(@InterfaceC6391 Context context) {
        this(context, null);
    }

    @InterfaceC6490
    private Window getActivityWindow() {
        Activity activity = ContextUtils.getActivity(getContext());
        if (activity == null) {
            return null;
        }
        return activity.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.searchBar;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(C1980R.dimen.m3_searchview_elevation);
    }

    @InterfaceC6844
    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private boolean isHiddenOrHiding() {
        return this.currentTransitionState.equals(TransitionState.HIDDEN) || this.currentTransitionState.equals(TransitionState.HIDING);
    }

    private boolean isNavigationIconDrawerArrowDrawable(@InterfaceC6391 Toolbar toolbar) {
        return C4520.m13238(toolbar.getNavigationIcon()) instanceof C4536;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$clearFocusAndHideKeyboard$9() {
        this.editText.clearFocus();
        SearchBar searchBar = this.searchBar;
        if (searchBar != null) {
            searchBar.requestFocus();
        }
        ViewUtils.hideKeyboard(this.editText, this.useWindowInsetsController);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestFocusAndShowKeyboard$8() {
        if (this.editText.requestFocus()) {
            this.editText.sendAccessibilityEvent(8);
        }
        ViewUtils.showKeyboard(this.editText, this.useWindowInsetsController);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpBackButton$1(View view) {
        hide();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpClearButton$2(View view) {
        clearText();
        requestFocusAndShowKeyboardIfNeeded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setUpContentOnTouchListener$3(View view, MotionEvent motionEvent) {
        if (!isAdjustNothingSoftInputMode()) {
            return false;
        }
        clearFocusAndHideKeyboard();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C8472 lambda$setUpDividerInsetListener$6(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, View view, C8472 c8472) {
        marginLayoutParams.leftMargin = i + c8472.m28291();
        marginLayoutParams.rightMargin = i2 + c8472.m28292();
        return c8472;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$setUpRootView$0(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C8472 lambda$setUpStatusBarSpacerInsetListener$5(View view, C8472 c8472) {
        int iM28293 = c8472.m28293();
        setUpStatusBarSpacer(iM28293);
        if (!this.statusBarSpacerEnabledOverride) {
            setStatusBarSpacerEnabledInternal(iM28293 > 0);
        }
        return c8472;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C8472 lambda$setUpToolbarInsetListener$4(View view, C8472 c8472, ViewUtils.RelativePadding relativePadding) {
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this.toolbar);
        this.toolbar.setPadding((zIsLayoutRtl ? relativePadding.end : relativePadding.start) + c8472.m28291(), relativePadding.top, (zIsLayoutRtl ? relativePadding.start : relativePadding.end) + c8472.m28292(), relativePadding.bottom);
        return c8472;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setupWithSearchBar$7(View view) {
        show();
    }

    private void setStatusBarSpacerEnabledInternal(boolean z) {
        this.statusBarSpacer.setVisibility(z ? 0 : 8);
    }

    private void setUpBackButton(boolean z, boolean z2) {
        if (z2) {
            this.toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        this.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: Yue.ۥۡۧۦۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21935.lambda$setUpBackButton$1(view);
            }
        });
        if (z) {
            C4536 c4536 = new C4536(getContext());
            c4536.m13303(MaterialColors.getColor(this, C1980R.attr.colorOnSurface));
            this.toolbar.setNavigationIcon(c4536);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setUpBackgroundViewElevationOverlay() {
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
    }

    private void setUpClearButton() {
        this.clearButton.setOnClickListener(new View.OnClickListener() { // from class: Yue.ۥۡۧۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21937.lambda$setUpClearButton$2(view);
            }
        });
        this.editText.addTextChangedListener(new TextWatcher() { // from class: com.google.android.material.search.SearchView.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SearchView.this.clearButton.setVisibility(charSequence.length() > 0 ? 0 : 8);
            }
        });
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setUpContentOnTouchListener() {
        this.contentContainer.setOnTouchListener(new View.OnTouchListener() { // from class: Yue.ۥۡۧۧۦ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f21942.lambda$setUpContentOnTouchListener$3(view, motionEvent);
            }
        });
    }

    private void setUpDividerInsetListener() {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.divider.getLayoutParams();
        final int i = marginLayoutParams.leftMargin;
        final int i2 = marginLayoutParams.rightMargin;
        C8273.m27468(this.divider, new InterfaceC6545() { // from class: Yue.ۥۡۧۧ۟
            @Override // Yue.InterfaceC6545
            public final C8472 onApplyWindowInsets(View view, C8472 c8472) {
                return SearchView.lambda$setUpDividerInsetListener$6(marginLayoutParams, i, i2, view, c8472);
            }
        });
    }

    private void setUpEditText(@InterfaceC7651 int i, String str, String str2) {
        if (i != -1) {
            C7759.m24676(this.editText, i);
        }
        this.editText.setText(str);
        this.editText.setHint(str2);
    }

    private void setUpHeaderLayout(int i) {
        if (i != -1) {
            addHeaderView(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this.headerContainer, false));
        }
    }

    private void setUpInsetListeners() {
        setUpToolbarInsetListener();
        setUpDividerInsetListener();
        setUpStatusBarSpacerInsetListener();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setUpRootView() {
        this.rootView.setOnTouchListener(new View.OnTouchListener() { // from class: Yue.ۥۡۧۧۥ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return SearchView.lambda$setUpRootView$0(view, motionEvent);
            }
        });
    }

    private void setUpStatusBarSpacer(@InterfaceC6844 int i) {
        if (this.statusBarSpacer.getLayoutParams().height != i) {
            this.statusBarSpacer.getLayoutParams().height = i;
            this.statusBarSpacer.requestLayout();
        }
    }

    private void setUpStatusBarSpacerInsetListener() {
        setUpStatusBarSpacer(getStatusBarHeight());
        C8273.m27468(this.statusBarSpacer, new InterfaceC6545() { // from class: Yue.ۥۡۧۧۢ
            @Override // Yue.InterfaceC6545
            public final C8472 onApplyWindowInsets(View view, C8472 c8472) {
                return this.f2775.lambda$setUpStatusBarSpacerInsetListener$5(view, c8472);
            }
        });
    }

    private void setUpToolbarInsetListener() {
        ViewUtils.doOnApplyWindowInsets(this.toolbar, new ViewUtils.OnApplyWindowInsetsListener() { // from class: Yue.ۥۡۧۧۡ
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public final C8472 onApplyWindowInsets(View view, C8472 c8472, ViewUtils.RelativePadding relativePadding) {
                return this.f2774.lambda$setUpToolbarInsetListener$4(view, c8472, relativePadding);
            }
        });
    }

    @SuppressLint({"InlinedApi"})
    private void updateChildImportantForAccessibility(ViewGroup viewGroup, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this) {
                if (childAt.findViewById(this.rootView.getId()) != null) {
                    updateChildImportantForAccessibility((ViewGroup) childAt, z);
                } else if (z) {
                    this.childImportantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    C8273.m27457(childAt, 4);
                } else {
                    Map<View, Integer> map = this.childImportantForAccessibilityMap;
                    if (map != null && map.containsKey(childAt)) {
                        C8273.m27457(childAt, this.childImportantForAccessibilityMap.get(childAt).intValue());
                    }
                }
            }
        }
    }

    private void updateListeningForBackCallbacks(@InterfaceC6391 TransitionState transitionState) {
        if (this.searchBar == null || !this.backHandlingEnabled) {
            return;
        }
        if (transitionState.equals(TransitionState.SHOWN)) {
            this.backOrchestrator.startListeningForBackCallbacks();
        } else if (transitionState.equals(TransitionState.HIDDEN)) {
            this.backOrchestrator.stopListeningForBackCallbacks();
        }
    }

    private void updateNavigationIconIfNeeded() {
        MaterialToolbar materialToolbar = this.toolbar;
        if (materialToolbar == null || isNavigationIconDrawerArrowDrawable(materialToolbar)) {
            return;
        }
        int defaultNavigationIconResource = getDefaultNavigationIconResource();
        if (this.searchBar == null) {
            this.toolbar.setNavigationIcon(defaultNavigationIconResource);
            return;
        }
        Drawable drawableM13239 = C4520.m13239(C3323.m396(getContext(), defaultNavigationIconResource).mutate());
        if (this.toolbar.getNavigationIconTint() != null) {
            C4520.m13235(drawableM13239, this.toolbar.getNavigationIconTint().intValue());
        }
        this.toolbar.setNavigationIcon(new FadeThroughDrawable(this.searchBar.getNavigationIcon(), drawableM13239));
        updateNavigationIconProgressIfNeeded();
    }

    private void updateNavigationIconProgressIfNeeded() {
        ImageButton navigationIconButton = ToolbarUtils.getNavigationIconButton(this.toolbar);
        if (navigationIconButton == null) {
            return;
        }
        int i = this.rootView.getVisibility() == 0 ? 1 : 0;
        Drawable drawableM13238 = C4520.m13238(navigationIconButton.getDrawable());
        if (drawableM13238 instanceof C4536) {
            ((C4536) drawableM13238).m13306(i);
        }
        if (drawableM13238 instanceof FadeThroughDrawable) {
            ((FadeThroughDrawable) drawableM13238).setProgress(i);
        }
    }

    public void addHeaderView(@InterfaceC6391 View view) {
        this.headerContainer.addView(view);
        this.headerContainer.setVisibility(0);
    }

    public void addTransitionListener(@InterfaceC6391 TransitionListener transitionListener) {
        this.transitionListeners.add(transitionListener);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.layoutInflated) {
            this.contentContainer.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
        if (isHiddenOrHiding() || this.searchBar == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.searchViewAnimationHelper.cancelBackProgress();
    }

    public void clearFocusAndHideKeyboard() {
        this.editText.post(new Runnable() { // from class: Yue.ۥۡۧۦۨ
            @Override // java.lang.Runnable
            public final void run() {
                this.f21936.lambda$clearFocusAndHideKeyboard$9();
            }
        });
    }

    public void clearText() {
        this.editText.setText("");
    }

    @InterfaceC8392
    public MaterialMainContainerBackHelper getBackHelper() {
        return this.searchViewAnimationHelper.getBackHelper();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC1654
    @InterfaceC6391
    public CoordinatorLayout.AbstractC8792<SearchView> getBehavior() {
        return new Behavior();
    }

    @InterfaceC6391
    public TransitionState getCurrentTransitionState() {
        return this.currentTransitionState;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    @InterfaceC4525
    public int getDefaultNavigationIconResource() {
        return C1980R.drawable.ic_arrow_back_black_24;
    }

    @InterfaceC6391
    public EditText getEditText() {
        return this.editText;
    }

    @InterfaceC6490
    public CharSequence getHint() {
        return this.editText.getHint();
    }

    @InterfaceC6391
    public TextView getSearchPrefix() {
        return this.searchPrefix;
    }

    @InterfaceC6490
    public CharSequence getSearchPrefixText() {
        return this.searchPrefix.getText();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
        return this.softInputMode;
    }

    @InterfaceC6391
    @SuppressLint({"KotlinPropertyAccess"})
    public Editable getText() {
        return this.editText.getText();
    }

    @InterfaceC6391
    public Toolbar getToolbar() {
        return this.toolbar;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
        if (isHiddenOrHiding()) {
            return;
        }
        C3505 c3505OnHandleBackInvoked = this.searchViewAnimationHelper.onHandleBackInvoked();
        if (Build.VERSION.SDK_INT < 34 || this.searchBar == null || c3505OnHandleBackInvoked == null) {
            hide();
        } else {
            this.searchViewAnimationHelper.finishBackProgress();
        }
    }

    public void hide() {
        if (this.currentTransitionState.equals(TransitionState.HIDDEN) || this.currentTransitionState.equals(TransitionState.HIDING)) {
            return;
        }
        this.searchViewAnimationHelper.hide();
    }

    public void inflateMenu(@InterfaceC6166 int i) {
        this.toolbar.inflateMenu(i);
    }

    public boolean isAdjustNothingSoftInputMode() {
        return this.softInputMode == 48;
    }

    public boolean isAnimatedNavigationIcon() {
        return this.animatedNavigationIcon;
    }

    public boolean isAutoShowKeyboard() {
        return this.autoShowKeyboard;
    }

    public boolean isMenuItemsAnimated() {
        return this.animatedMenuItems;
    }

    public boolean isSetupWithSearchBar() {
        return this.searchBar != null;
    }

    public boolean isShowing() {
        return this.currentTransitionState.equals(TransitionState.SHOWN) || this.currentTransitionState.equals(TransitionState.SHOWING);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public boolean isUseWindowInsetsController() {
        return this.useWindowInsetsController;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.setParentAbsoluteElevation(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        updateSoftInputMode();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.text);
        setVisible(savedState.visibility == 0);
    }

    @Override // android.view.View
    @InterfaceC6391
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.text = text == null ? null : text.toString();
        savedState.visibility = this.rootView.getVisibility();
        return savedState;
    }

    public void removeAllHeaderViews() {
        this.headerContainer.removeAllViews();
        this.headerContainer.setVisibility(8);
    }

    public void removeHeaderView(@InterfaceC6391 View view) {
        this.headerContainer.removeView(view);
        if (this.headerContainer.getChildCount() == 0) {
            this.headerContainer.setVisibility(8);
        }
    }

    public void removeTransitionListener(@InterfaceC6391 TransitionListener transitionListener) {
        this.transitionListeners.remove(transitionListener);
    }

    public void requestFocusAndShowKeyboard() {
        this.editText.postDelayed(new Runnable() { // from class: Yue.ۥۡۧۧ۠
            @Override // java.lang.Runnable
            public final void run() {
                this.f21939.lambda$requestFocusAndShowKeyboard$8();
            }
        }, 100L);
    }

    public void requestFocusAndShowKeyboardIfNeeded() {
        if (this.autoShowKeyboard) {
            requestFocusAndShowKeyboard();
        }
    }

    public void setAnimatedNavigationIcon(boolean z) {
        this.animatedNavigationIcon = z;
    }

    public void setAutoShowKeyboard(boolean z) {
        this.autoShowKeyboard = z;
    }

    @Override // android.view.View
    @InterfaceC7113(21)
    public void setElevation(float f) {
        super.setElevation(f);
        setUpBackgroundViewElevationOverlay(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setHint(@InterfaceC6490 CharSequence charSequence) {
        this.editText.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z) {
        this.animatedMenuItems = z;
    }

    public void setModalForAccessibility(boolean z) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z) {
            this.childImportantForAccessibilityMap = new HashMap(viewGroup.getChildCount());
        }
        updateChildImportantForAccessibility(viewGroup, z);
        if (z) {
            return;
        }
        this.childImportantForAccessibilityMap = null;
    }

    public void setOnMenuItemClickListener(@InterfaceC6490 Toolbar.InterfaceC8735 interfaceC8735) {
        this.toolbar.setOnMenuItemClickListener(interfaceC8735);
    }

    public void setSearchPrefixText(@InterfaceC6490 CharSequence charSequence) {
        this.searchPrefix.setText(charSequence);
        this.searchPrefix.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public void setStatusBarSpacerEnabled(boolean z) {
        this.statusBarSpacerEnabledOverride = true;
        setStatusBarSpacerEnabledInternal(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @SuppressLint({"KotlinPropertyAccess"})
    public void setText(@InterfaceC6490 CharSequence charSequence) {
        this.editText.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z) {
        this.toolbar.setTouchscreenBlocksFocus(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setTransitionState(@InterfaceC6391 TransitionState transitionState) {
        setTransitionState(transitionState, true);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public void setUseWindowInsetsController(boolean z) {
        this.useWindowInsetsController = z;
    }

    public void setVisible(boolean z) {
        boolean z2 = this.rootView.getVisibility() == 0;
        this.rootView.setVisibility(z ? 0 : 8);
        updateNavigationIconProgressIfNeeded();
        setTransitionState(z ? TransitionState.SHOWN : TransitionState.HIDDEN, z2 != z);
    }

    public void setupWithSearchBar(@InterfaceC6490 SearchBar searchBar) {
        this.searchBar = searchBar;
        this.searchViewAnimationHelper.setSearchBar(searchBar);
        if (searchBar != null) {
            searchBar.setOnClickListener(new View.OnClickListener() { // from class: Yue.ۥۣۡۧۧ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21940.lambda$setupWithSearchBar$7(view);
                }
            });
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new Runnable() { // from class: Yue.ۥۡۧۧۤ
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f21941.show();
                        }
                    });
                    this.editText.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        updateNavigationIconIfNeeded();
        setUpBackgroundViewElevationOverlay();
        updateListeningForBackCallbacks(getCurrentTransitionState());
    }

    public void show() {
        if (this.currentTransitionState.equals(TransitionState.SHOWN) || this.currentTransitionState.equals(TransitionState.SHOWING)) {
            return;
        }
        this.searchViewAnimationHelper.show();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@InterfaceC6391 C3505 c3505) {
        if (isHiddenOrHiding() || this.searchBar == null) {
            return;
        }
        this.searchViewAnimationHelper.startBackProgress(c3505);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@InterfaceC6391 C3505 c3505) {
        if (isHiddenOrHiding() || this.searchBar == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.searchViewAnimationHelper.updateBackProgress(c3505);
    }

    public void updateSoftInputMode() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.softInputMode = activityWindow.getAttributes().softInputMode;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public SearchView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C1980R.attr.materialSearchViewStyle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private void setTransitionState(@InterfaceC6391 TransitionState transitionState, boolean z) {
        if (this.currentTransitionState.equals(transitionState)) {
            return;
        }
        if (z) {
            if (transitionState == TransitionState.SHOWN) {
                setModalForAccessibility(true);
            } else if (transitionState == TransitionState.HIDDEN) {
                setModalForAccessibility(false);
            }
        }
        TransitionState transitionState2 = this.currentTransitionState;
        this.currentTransitionState = transitionState;
        Iterator it = new LinkedHashSet(this.transitionListeners).iterator();
        while (it.hasNext()) {
            ((TransitionListener) it.next()).onStateChanged(this, transitionState2, transitionState);
        }
        updateListeningForBackCallbacks(transitionState);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private void setUpBackgroundViewElevationOverlay(float f) {
        ElevationOverlayProvider elevationOverlayProvider = this.elevationOverlayProvider;
        if (elevationOverlayProvider == null || this.backgroundView == null) {
            return;
        }
        this.backgroundView.setBackgroundColor(elevationOverlayProvider.compositeOverlayIfNeeded(this.backgroundColor, f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setHint(@InterfaceC7613 int i) {
        this.editText.setHint(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void setText(@InterfaceC7613 int i) {
        this.editText.setText(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, i2), attributeSet, i);
        this.backOrchestrator = new MaterialBackOrchestrator(this);
        this.transitionListeners = new LinkedHashSet();
        this.softInputMode = 16;
        this.currentTransitionState = TransitionState.HIDDEN;
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C1980R.styleable.SearchView, i, i2, new int[0]);
        this.backgroundColor = typedArrayObtainStyledAttributes.getColor(C1980R.styleable.SearchView_backgroundTint, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.SearchView_headerLayout, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C1980R.styleable.SearchView_android_textAppearance, -1);
        String string = typedArrayObtainStyledAttributes.getString(C1980R.styleable.SearchView_android_text);
        String string2 = typedArrayObtainStyledAttributes.getString(C1980R.styleable.SearchView_android_hint);
        String string3 = typedArrayObtainStyledAttributes.getString(C1980R.styleable.SearchView_searchPrefixText);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.SearchView_useDrawerArrowDrawable, false);
        this.animatedNavigationIcon = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.SearchView_animateNavigationIcon, true);
        this.animatedMenuItems = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.SearchView_animateMenuItems, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.SearchView_hideNavigationIcon, false);
        this.autoShowKeyboard = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.SearchView_autoShowKeyboard, true);
        this.backHandlingEnabled = typedArrayObtainStyledAttributes.getBoolean(C1980R.styleable.SearchView_backHandlingEnabled, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(context2).inflate(C1980R.layout.mtrl_search_view, this);
        this.layoutInflated = true;
        this.scrim = findViewById(C1980R.id.open_search_view_scrim);
        this.rootView = (ClippableRoundedCornerLayout) findViewById(C1980R.id.open_search_view_root);
        this.backgroundView = findViewById(C1980R.id.open_search_view_background);
        this.statusBarSpacer = findViewById(C1980R.id.open_search_view_status_bar_spacer);
        this.headerContainer = (FrameLayout) findViewById(C1980R.id.open_search_view_header_container);
        this.toolbarContainer = (FrameLayout) findViewById(C1980R.id.open_search_view_toolbar_container);
        this.toolbar = (MaterialToolbar) findViewById(C1980R.id.open_search_view_toolbar);
        this.dummyToolbar = (Toolbar) findViewById(C1980R.id.open_search_view_dummy_toolbar);
        this.searchPrefix = (TextView) findViewById(C1980R.id.open_search_view_search_prefix);
        this.editText = (EditText) findViewById(C1980R.id.open_search_view_edit_text);
        this.clearButton = (ImageButton) findViewById(C1980R.id.open_search_view_clear_button);
        this.divider = findViewById(C1980R.id.open_search_view_divider);
        this.contentContainer = (TouchObserverFrameLayout) findViewById(C1980R.id.open_search_view_content_container);
        this.searchViewAnimationHelper = new SearchViewAnimationHelper(this);
        this.elevationOverlayProvider = new ElevationOverlayProvider(context2);
        setUpRootView();
        setUpBackgroundViewElevationOverlay();
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        setUpEditText(resourceId2, string, string2);
        setUpBackButton(z, z2);
        setUpClearButton();
        setUpContentOnTouchListener();
        setUpInsetListeners();
    }
}
