package com.google.android.material.search;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends android.widget.FrameLayout implements androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC7492, com.google.android.material.motion.MaterialBackHandler {
    private static final int DEF_STYLE_RES = 0;
    private static final long TALKBACK_FOCUS_CHANGE_DELAY_MS = 100;
    private boolean animatedMenuItems;
    private boolean animatedNavigationIcon;
    private boolean autoShowKeyboard;
    private final boolean backHandlingEnabled;

    @Yue.InterfaceC4410
    private final com.google.android.material.motion.MaterialBackOrchestrator backOrchestrator;

    @Yue.InterfaceC1230
    private final int backgroundColor;
    final android.view.View backgroundView;
    private java.util.Map<android.view.View, java.lang.Integer> childImportantForAccessibilityMap;
    final android.widget.ImageButton clearButton;
    final com.google.android.material.internal.TouchObserverFrameLayout contentContainer;

    @Yue.InterfaceC4410
    private com.google.android.material.search.SearchView.TransitionState currentTransitionState;
    final android.view.View divider;
    final androidx.appcompat.widget.Toolbar dummyToolbar;
    final android.widget.EditText editText;
    private final com.google.android.material.elevation.ElevationOverlayProvider elevationOverlayProvider;
    final android.widget.FrameLayout headerContainer;
    private final boolean layoutInflated;
    final com.google.android.material.internal.ClippableRoundedCornerLayout rootView;
    final android.view.View scrim;

    @Yue.InterfaceC4544
    private com.google.android.material.search.SearchBar searchBar;
    final android.widget.TextView searchPrefix;
    private final com.google.android.material.search.SearchViewAnimationHelper searchViewAnimationHelper;
    private int softInputMode;
    final android.view.View statusBarSpacer;
    private boolean statusBarSpacerEnabledOverride;
    final com.google.android.material.appbar.MaterialToolbar toolbar;
    final android.widget.FrameLayout toolbarContainer;
    private final java.util.Set<com.google.android.material.search.SearchView.TransitionListener> transitionListeners;
    private boolean useWindowInsetsController;


    public static class Behavior extends androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC7493<com.google.android.material.search.SearchView> {
        public Behavior() {
                r0 = this;
                r0.<init>()
                return
        }

        public Behavior(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC7493
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 android.view.View r3) {
                r0 = this;
                com.google.android.material.search.SearchView r2 = (com.google.android.material.search.SearchView) r2
                boolean r1 = r0.onDependentViewChanged(r1, r2, r3)
                return r1
        }

        public boolean onDependentViewChanged(@Yue.InterfaceC4410 androidx.coordinatorlayout.widget.CoordinatorLayout r1, @Yue.InterfaceC4410 com.google.android.material.search.SearchView r2, @Yue.InterfaceC4410 android.view.View r3) {
                r0 = this;
                boolean r1 = r2.isSetupWithSearchBar()
                if (r1 != 0) goto Lf
                boolean r1 = r3 instanceof com.google.android.material.search.SearchBar
                if (r1 == 0) goto Lf
                com.google.android.material.search.SearchBar r3 = (com.google.android.material.search.SearchBar) r3
                r2.setupWithSearchBar(r3)
            Lf:
                r1 = 0
                return r1
        }
    }

    public static class SavedState extends Yue.AbstractC0025 {
        public static final android.os.Parcelable.Creator<com.google.android.material.search.SearchView.SavedState> CREATOR = null;
        java.lang.String text;
        int visibility;


        static {
                com.google.android.material.search.SearchView$SavedState$1 r0 = new com.google.android.material.search.SearchView$SavedState$1
                r0.<init>()
                com.google.android.material.search.SearchView.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public SavedState(android.os.Parcel r1, @Yue.InterfaceC4544 java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                java.lang.String r2 = r1.readString()
                r0.text = r2
                int r1 = r1.readInt()
                r0.visibility = r1
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC0025, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                java.lang.String r2 = r0.text
                r1.writeString(r2)
                int r2 = r0.visibility
                r1.writeInt(r2)
                return
        }
    }

    public interface TransitionListener {
        void onStateChanged(@Yue.InterfaceC4410 com.google.android.material.search.SearchView r1, @Yue.InterfaceC4410 com.google.android.material.search.SearchView.TransitionState r2, @Yue.InterfaceC4410 com.google.android.material.search.SearchView.TransitionState r3);
    }

    public enum TransitionState extends java.lang.Enum<com.google.android.material.search.SearchView.TransitionState> {
        private static final /* synthetic */ com.google.android.material.search.SearchView.TransitionState[] $VALUES = null;
        public static final com.google.android.material.search.SearchView.TransitionState HIDDEN = null;
        public static final com.google.android.material.search.SearchView.TransitionState HIDING = null;
        public static final com.google.android.material.search.SearchView.TransitionState SHOWING = null;
        public static final com.google.android.material.search.SearchView.TransitionState SHOWN = null;

        static {
                com.google.android.material.search.SearchView$TransitionState r0 = new com.google.android.material.search.SearchView$TransitionState
                java.lang.String r1 = "HIDING"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.android.material.search.SearchView.TransitionState.HIDING = r0
                com.google.android.material.search.SearchView$TransitionState r1 = new com.google.android.material.search.SearchView$TransitionState
                java.lang.String r2 = "HIDDEN"
                r3 = 1
                r1.<init>(r2, r3)
                com.google.android.material.search.SearchView.TransitionState.HIDDEN = r1
                com.google.android.material.search.SearchView$TransitionState r2 = new com.google.android.material.search.SearchView$TransitionState
                java.lang.String r3 = "SHOWING"
                r4 = 2
                r2.<init>(r3, r4)
                com.google.android.material.search.SearchView.TransitionState.SHOWING = r2
                com.google.android.material.search.SearchView$TransitionState r3 = new com.google.android.material.search.SearchView$TransitionState
                java.lang.String r4 = "SHOWN"
                r5 = 3
                r3.<init>(r4, r5)
                com.google.android.material.search.SearchView.TransitionState.SHOWN = r3
                com.google.android.material.search.SearchView$TransitionState[] r0 = new com.google.android.material.search.SearchView.TransitionState[]{r0, r1, r2, r3}
                com.google.android.material.search.SearchView.TransitionState.$VALUES = r0
                return
        }

        TransitionState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.android.material.search.SearchView.TransitionState valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.material.search.SearchView$TransitionState> r0 = com.google.android.material.search.SearchView.TransitionState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.material.search.SearchView$TransitionState r1 = (com.google.android.material.search.SearchView.TransitionState) r1
                return r1
        }

        public static com.google.android.material.search.SearchView.TransitionState[] values() {
                com.google.android.material.search.SearchView$TransitionState[] r0 = com.google.android.material.search.SearchView.TransitionState.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.android.material.search.SearchView$TransitionState[] r0 = (com.google.android.material.search.SearchView.TransitionState[]) r0
                return r0
        }
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_Material3_SearchView
            com.google.android.material.search.SearchView.DEF_STYLE_RES = r0
            return
    }

    public SearchView(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SearchView(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.R.attr.materialSearchViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public SearchView(@Yue.InterfaceC4410 android.content.Context r9, @Yue.InterfaceC4544 android.util.AttributeSet r10, int r11) {
            r8 = this;
            int r4 = com.google.android.material.search.SearchView.DEF_STYLE_RES
            android.content.Context r9 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            com.google.android.material.motion.MaterialBackOrchestrator r9 = new com.google.android.material.motion.MaterialBackOrchestrator
            r9.<init>(r8)
            r8.backOrchestrator = r9
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.transitionListeners = r9
            r9 = 16
            r8.softInputMode = r9
            com.google.android.material.search.SearchView$TransitionState r9 = com.google.android.material.search.SearchView.TransitionState.HIDDEN
            r8.currentTransitionState = r9
            android.content.Context r9 = r8.getContext()
            int[] r2 = com.google.android.material.R.styleable.SearchView
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r9
            r1 = r10
            r3 = r11
            android.content.res.TypedArray r10 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r11 = com.google.android.material.R.styleable.SearchView_backgroundTint
            int r11 = r10.getColor(r11, r6)
            r8.backgroundColor = r11
            int r11 = com.google.android.material.R.styleable.SearchView_headerLayout
            r0 = -1
            int r11 = r10.getResourceId(r11, r0)
            int r1 = com.google.android.material.R.styleable.SearchView_android_textAppearance
            int r0 = r10.getResourceId(r1, r0)
            int r1 = com.google.android.material.R.styleable.SearchView_android_text
            java.lang.String r1 = r10.getString(r1)
            int r2 = com.google.android.material.R.styleable.SearchView_android_hint
            java.lang.String r2 = r10.getString(r2)
            int r3 = com.google.android.material.R.styleable.SearchView_searchPrefixText
            java.lang.String r3 = r10.getString(r3)
            int r4 = com.google.android.material.R.styleable.SearchView_useDrawerArrowDrawable
            boolean r4 = r10.getBoolean(r4, r6)
            int r5 = com.google.android.material.R.styleable.SearchView_animateNavigationIcon
            r7 = 1
            boolean r5 = r10.getBoolean(r5, r7)
            r8.animatedNavigationIcon = r5
            int r5 = com.google.android.material.R.styleable.SearchView_animateMenuItems
            boolean r5 = r10.getBoolean(r5, r7)
            r8.animatedMenuItems = r5
            int r5 = com.google.android.material.R.styleable.SearchView_hideNavigationIcon
            boolean r5 = r10.getBoolean(r5, r6)
            int r6 = com.google.android.material.R.styleable.SearchView_autoShowKeyboard
            boolean r6 = r10.getBoolean(r6, r7)
            r8.autoShowKeyboard = r6
            int r6 = com.google.android.material.R.styleable.SearchView_backHandlingEnabled
            boolean r6 = r10.getBoolean(r6, r7)
            r8.backHandlingEnabled = r6
            r10.recycle()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r9)
            int r6 = com.google.android.material.R.layout.mtrl_search_view
            r10.inflate(r6, r8)
            r8.layoutInflated = r7
            int r10 = com.google.android.material.R.id.open_search_view_scrim
            android.view.View r10 = r8.findViewById(r10)
            r8.scrim = r10
            int r10 = com.google.android.material.R.id.open_search_view_root
            android.view.View r10 = r8.findViewById(r10)
            com.google.android.material.internal.ClippableRoundedCornerLayout r10 = (com.google.android.material.internal.ClippableRoundedCornerLayout) r10
            r8.rootView = r10
            int r10 = com.google.android.material.R.id.open_search_view_background
            android.view.View r10 = r8.findViewById(r10)
            r8.backgroundView = r10
            int r10 = com.google.android.material.R.id.open_search_view_status_bar_spacer
            android.view.View r10 = r8.findViewById(r10)
            r8.statusBarSpacer = r10
            int r10 = com.google.android.material.R.id.open_search_view_header_container
            android.view.View r10 = r8.findViewById(r10)
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            r8.headerContainer = r10
            int r10 = com.google.android.material.R.id.open_search_view_toolbar_container
            android.view.View r10 = r8.findViewById(r10)
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            r8.toolbarContainer = r10
            int r10 = com.google.android.material.R.id.open_search_view_toolbar
            android.view.View r10 = r8.findViewById(r10)
            com.google.android.material.appbar.MaterialToolbar r10 = (com.google.android.material.appbar.MaterialToolbar) r10
            r8.toolbar = r10
            int r10 = com.google.android.material.R.id.open_search_view_dummy_toolbar
            android.view.View r10 = r8.findViewById(r10)
            androidx.appcompat.widget.Toolbar r10 = (androidx.appcompat.widget.Toolbar) r10
            r8.dummyToolbar = r10
            int r10 = com.google.android.material.R.id.open_search_view_search_prefix
            android.view.View r10 = r8.findViewById(r10)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r8.searchPrefix = r10
            int r10 = com.google.android.material.R.id.open_search_view_edit_text
            android.view.View r10 = r8.findViewById(r10)
            android.widget.EditText r10 = (android.widget.EditText) r10
            r8.editText = r10
            int r10 = com.google.android.material.R.id.open_search_view_clear_button
            android.view.View r10 = r8.findViewById(r10)
            android.widget.ImageButton r10 = (android.widget.ImageButton) r10
            r8.clearButton = r10
            int r10 = com.google.android.material.R.id.open_search_view_divider
            android.view.View r10 = r8.findViewById(r10)
            r8.divider = r10
            int r10 = com.google.android.material.R.id.open_search_view_content_container
            android.view.View r10 = r8.findViewById(r10)
            com.google.android.material.internal.TouchObserverFrameLayout r10 = (com.google.android.material.internal.TouchObserverFrameLayout) r10
            r8.contentContainer = r10
            com.google.android.material.search.SearchViewAnimationHelper r10 = new com.google.android.material.search.SearchViewAnimationHelper
            r10.<init>(r8)
            r8.searchViewAnimationHelper = r10
            com.google.android.material.elevation.ElevationOverlayProvider r10 = new com.google.android.material.elevation.ElevationOverlayProvider
            r10.<init>(r9)
            r8.elevationOverlayProvider = r10
            r8.setUpRootView()
            r8.setUpBackgroundViewElevationOverlay()
            r8.setUpHeaderLayout(r11)
            r8.setSearchPrefixText(r3)
            r8.setUpEditText(r0, r1, r2)
            r8.setUpBackButton(r4, r5)
            r8.setUpClearButton()
            r8.setUpContentOnTouchListener()
            r8.setUpInsetListeners()
            return
    }

    @Yue.InterfaceC4544
    private android.view.Window getActivityWindow() {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.app.Activity r0 = com.google.android.material.internal.ContextUtils.getActivity(r0)
            if (r0 != 0) goto Lc
            r0 = 0
            goto L10
        Lc:
            android.view.Window r0 = r0.getWindow()
        L10:
            return r0
    }

    private float getOverlayElevation() {
            r2 = this;
            com.google.android.material.search.SearchBar r0 = r2.searchBar
            if (r0 == 0) goto L9
            float r0 = r0.getCompatElevation()
            return r0
        L9:
            android.content.res.Resources r0 = r2.getResources()
            int r1 = com.google.android.material.R.dimen.m3_searchview_elevation
            float r0 = r0.getDimension(r1)
            return r0
    }

    @Yue.InterfaceC4992
    private int getStatusBarHeight() {
            r4 = this;
            android.content.res.Resources r0 = r4.getResources()
            java.lang.String r1 = "dimen"
            java.lang.String r2 = "android"
            java.lang.String r3 = "status_bar_height"
            int r0 = r0.getIdentifier(r3, r1, r2)
            if (r0 <= 0) goto L19
            android.content.res.Resources r1 = r4.getResources()
            int r0 = r1.getDimensionPixelSize(r0)
            return r0
        L19:
            r0 = 0
            return r0
    }

    private boolean isHiddenOrHiding() {
            r2 = this;
            com.google.android.material.search.SearchView$TransitionState r0 = r2.currentTransitionState
            com.google.android.material.search.SearchView$TransitionState r1 = com.google.android.material.search.SearchView.TransitionState.HIDDEN
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            com.google.android.material.search.SearchView$TransitionState r0 = r2.currentTransitionState
            com.google.android.material.search.SearchView$TransitionState r1 = com.google.android.material.search.SearchView.TransitionState.HIDING
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            return r0
    }

    private boolean isNavigationIconDrawerArrowDrawable(@Yue.InterfaceC4410 androidx.appcompat.widget.Toolbar r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = r1.getNavigationIcon()
            android.graphics.drawable.Drawable r1 = Yue.C1995.m9234(r1)
            boolean r1 = r1 instanceof Yue.C2017
            return r1
    }

    private /* synthetic */ void lambda$clearFocusAndHideKeyboard$9() {
            r2 = this;
            android.widget.EditText r0 = r2.editText
            r0.clearFocus()
            com.google.android.material.search.SearchBar r0 = r2.searchBar
            if (r0 == 0) goto Lc
            r0.requestFocus()
        Lc:
            android.widget.EditText r0 = r2.editText
            boolean r1 = r2.useWindowInsetsController
            com.google.android.material.internal.ViewUtils.hideKeyboard(r0, r1)
            return
    }

    private /* synthetic */ void lambda$requestFocusAndShowKeyboard$8() {
            r2 = this;
            android.widget.EditText r0 = r2.editText
            boolean r0 = r0.requestFocus()
            if (r0 == 0) goto Lf
            android.widget.EditText r0 = r2.editText
            r1 = 8
            r0.sendAccessibilityEvent(r1)
        Lf:
            android.widget.EditText r0 = r2.editText
            boolean r1 = r2.useWindowInsetsController
            com.google.android.material.internal.ViewUtils.showKeyboard(r0, r1)
            return
    }

    private /* synthetic */ void lambda$setUpBackButton$1(android.view.View r1) {
            r0 = this;
            r0.hide()
            return
    }

    private /* synthetic */ void lambda$setUpClearButton$2(android.view.View r1) {
            r0 = this;
            r0.clearText()
            r0.requestFocusAndShowKeyboardIfNeeded()
            return
    }

    private /* synthetic */ boolean lambda$setUpContentOnTouchListener$3(android.view.View r1, android.view.MotionEvent r2) {
            r0 = this;
            boolean r1 = r0.isAdjustNothingSoftInputMode()
            if (r1 == 0) goto L9
            r0.clearFocusAndHideKeyboard()
        L9:
            r1 = 0
            return r1
    }

    private static /* synthetic */ Yue.C7065 lambda$setUpDividerInsetListener$6(android.view.ViewGroup.MarginLayoutParams r0, int r1, int r2, android.view.View r3, Yue.C7065 r4) {
            int r3 = r4.m27293()
            int r1 = r1 + r3
            r0.leftMargin = r1
            int r1 = r4.m27294()
            int r2 = r2 + r1
            r0.rightMargin = r2
            return r4
    }

    private static /* synthetic */ boolean lambda$setUpRootView$0(android.view.View r0, android.view.MotionEvent r1) {
            r0 = 1
            return r0
    }

    private /* synthetic */ Yue.C7065 lambda$setUpStatusBarSpacerInsetListener$5(android.view.View r2, Yue.C7065 r3) {
            r1 = this;
            int r2 = r3.m27295()
            r1.setUpStatusBarSpacer(r2)
            boolean r0 = r1.statusBarSpacerEnabledOverride
            if (r0 != 0) goto L13
            if (r2 <= 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            r1.setStatusBarSpacerEnabledInternal(r2)
        L13:
            return r3
    }

    private /* synthetic */ Yue.C7065 lambda$setUpToolbarInsetListener$4(android.view.View r5, Yue.C7065 r6, com.google.android.material.internal.ViewUtils.RelativePadding r7) {
            r4 = this;
            com.google.android.material.appbar.MaterialToolbar r5 = r4.toolbar
            boolean r5 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r5)
            if (r5 == 0) goto Lb
            int r0 = r7.end
            goto Ld
        Lb:
            int r0 = r7.start
        Ld:
            if (r5 == 0) goto L12
            int r5 = r7.start
            goto L14
        L12:
            int r5 = r7.end
        L14:
            com.google.android.material.appbar.MaterialToolbar r1 = r4.toolbar
            int r2 = r6.m27293()
            int r0 = r0 + r2
            int r2 = r7.top
            int r3 = r6.m27294()
            int r5 = r5 + r3
            int r7 = r7.bottom
            r1.setPadding(r0, r2, r5, r7)
            return r6
    }

    private /* synthetic */ void lambda$setupWithSearchBar$7(android.view.View r1) {
            r0 = this;
            r0.show()
            return
    }

    private void setStatusBarSpacerEnabledInternal(boolean r2) {
            r1 = this;
            android.view.View r0 = r1.statusBarSpacer
            if (r2 == 0) goto L6
            r2 = 0
            goto L8
        L6:
            r2 = 8
        L8:
            r0.setVisibility(r2)
            return
    }

    private void setTransitionState(@Yue.InterfaceC4410 com.google.android.material.search.SearchView.TransitionState r3, boolean r4) {
            r2 = this;
            com.google.android.material.search.SearchView$TransitionState r0 = r2.currentTransitionState
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L9
            return
        L9:
            if (r4 == 0) goto L1c
            com.google.android.material.search.SearchView$TransitionState r4 = com.google.android.material.search.SearchView.TransitionState.SHOWN
            if (r3 != r4) goto L14
            r4 = 1
            r2.setModalForAccessibility(r4)
            goto L1c
        L14:
            com.google.android.material.search.SearchView$TransitionState r4 = com.google.android.material.search.SearchView.TransitionState.HIDDEN
            if (r3 != r4) goto L1c
            r4 = 0
            r2.setModalForAccessibility(r4)
        L1c:
            com.google.android.material.search.SearchView$TransitionState r4 = r2.currentTransitionState
            r2.currentTransitionState = r3
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            java.util.Set<com.google.android.material.search.SearchView$TransitionListener> r1 = r2.transitionListeners
            r0.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r0.next()
            com.google.android.material.search.SearchView$TransitionListener r1 = (com.google.android.material.search.SearchView.TransitionListener) r1
            r1.onStateChanged(r2, r4, r3)
            goto L2b
        L3b:
            r2.updateListeningForBackCallbacks(r3)
            return
    }

    private void setUpBackButton(boolean r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto L9
            com.google.android.material.appbar.MaterialToolbar r2 = r1.toolbar
            r3 = 0
            r2.setNavigationIcon(r3)
            return
        L9:
            com.google.android.material.appbar.MaterialToolbar r3 = r1.toolbar
            Yue.ۥۡۧۦۧ r0 = new Yue.ۥۡۧۦۧ
            r0.<init>(r1)
            r3.setNavigationOnClickListener(r0)
            if (r2 == 0) goto L2c
            Yue.ۥ۠۠ۡۨ r2 = new Yue.ۥ۠۠ۡۨ
            android.content.Context r3 = r1.getContext()
            r2.<init>(r3)
            int r3 = com.google.android.material.R.attr.colorOnSurface
            int r3 = com.google.android.material.color.MaterialColors.getColor(r1, r3)
            r2.m9326(r3)
            com.google.android.material.appbar.MaterialToolbar r3 = r1.toolbar
            r3.setNavigationIcon(r2)
        L2c:
            return
    }

    private void setUpBackgroundViewElevationOverlay() {
            r1 = this;
            float r0 = r1.getOverlayElevation()
            r1.setUpBackgroundViewElevationOverlay(r0)
            return
    }

    private void setUpBackgroundViewElevationOverlay(float r3) {
            r2 = this;
            com.google.android.material.elevation.ElevationOverlayProvider r0 = r2.elevationOverlayProvider
            if (r0 == 0) goto L14
            android.view.View r1 = r2.backgroundView
            if (r1 != 0) goto L9
            goto L14
        L9:
            int r1 = r2.backgroundColor
            int r3 = r0.compositeOverlayIfNeeded(r1, r3)
            android.view.View r0 = r2.backgroundView
            r0.setBackgroundColor(r3)
        L14:
            return
    }

    private void setUpClearButton() {
            r2 = this;
            android.widget.ImageButton r0 = r2.clearButton
            Yue.ۥۡۧۧ r1 = new Yue.ۥۡۧۧ
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            android.widget.EditText r0 = r2.editText
            com.google.android.material.search.SearchView$1 r1 = new com.google.android.material.search.SearchView$1
            r1.<init>(r2)
            r0.addTextChangedListener(r1)
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    private void setUpContentOnTouchListener() {
            r2 = this;
            com.google.android.material.internal.TouchObserverFrameLayout r0 = r2.contentContainer
            Yue.ۥۡۧۧۦ r1 = new Yue.ۥۡۧۧۦ
            r1.<init>(r2)
            r0.setOnTouchListener(r1)
            return
    }

    private void setUpDividerInsetListener() {
            r5 = this;
            android.view.View r0 = r5.divider
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r0.leftMargin
            int r2 = r0.rightMargin
            android.view.View r3 = r5.divider
            Yue.ۥۡۧۧ۟ r4 = new Yue.ۥۡۧۧ۟
            r4.<init>(r0, r1, r2)
            Yue.C6794.m26252(r3, r4)
            return
    }

    private void setUpEditText(@Yue.InterfaceC6018 int r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = -1
            if (r2 == r0) goto L8
            android.widget.EditText r0 = r1.editText
            Yue.C6156.m23066(r0, r2)
        L8:
            android.widget.EditText r2 = r1.editText
            r2.setText(r3)
            android.widget.EditText r2 = r1.editText
            r2.setHint(r4)
            return
    }

    private void setUpHeaderLayout(int r4) {
            r3 = this;
            r0 = -1
            if (r4 == r0) goto L15
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.widget.FrameLayout r1 = r3.headerContainer
            r2 = 0
            android.view.View r4 = r0.inflate(r4, r1, r2)
            r3.addHeaderView(r4)
        L15:
            return
    }

    private void setUpInsetListeners() {
            r0 = this;
            r0.setUpToolbarInsetListener()
            r0.setUpDividerInsetListener()
            r0.setUpStatusBarSpacerInsetListener()
            return
    }

    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    private void setUpRootView() {
            r2 = this;
            com.google.android.material.internal.ClippableRoundedCornerLayout r0 = r2.rootView
            Yue.ۥۡۧۧۥ r1 = new Yue.ۥۡۧۧۥ
            r1.<init>()
            r0.setOnTouchListener(r1)
            return
    }

    private void setUpStatusBarSpacer(@Yue.InterfaceC4992 int r2) {
            r1 = this;
            android.view.View r0 = r1.statusBarSpacer
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r0 = r0.height
            if (r0 == r2) goto L17
            android.view.View r0 = r1.statusBarSpacer
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.height = r2
            android.view.View r2 = r1.statusBarSpacer
            r2.requestLayout()
        L17:
            return
    }

    private void setUpStatusBarSpacerInsetListener() {
            r2 = this;
            int r0 = r2.getStatusBarHeight()
            r2.setUpStatusBarSpacer(r0)
            android.view.View r0 = r2.statusBarSpacer
            Yue.ۥۡۧۧۢ r1 = new Yue.ۥۡۧۧۢ
            r1.<init>(r2)
            Yue.C6794.m26252(r0, r1)
            return
    }

    private void setUpToolbarInsetListener() {
            r2 = this;
            com.google.android.material.appbar.MaterialToolbar r0 = r2.toolbar
            Yue.ۥۡۧۧۡ r1 = new Yue.ۥۡۧۧۡ
            r1.<init>(r2)
            com.google.android.material.internal.ViewUtils.doOnApplyWindowInsets(r0, r1)
            return
    }

    @android.annotation.SuppressLint({"InlinedApi"})
    private void updateChildImportantForAccessibility(android.view.ViewGroup r5, boolean r6) {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r5.getChildCount()
            if (r0 >= r1) goto L50
            android.view.View r1 = r5.getChildAt(r0)
            if (r1 != r4) goto Le
            goto L4d
        Le:
            com.google.android.material.internal.ClippableRoundedCornerLayout r2 = r4.rootView
            int r2 = r2.getId()
            android.view.View r2 = r1.findViewById(r2)
            if (r2 == 0) goto L20
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r4.updateChildImportantForAccessibility(r1, r6)
            goto L4d
        L20:
            if (r6 != 0) goto L3c
            java.util.Map<android.view.View, java.lang.Integer> r2 = r4.childImportantForAccessibilityMap
            if (r2 == 0) goto L4d
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L4d
            java.util.Map<android.view.View, java.lang.Integer> r2 = r4.childImportantForAccessibilityMap
            java.lang.Object r2 = r2.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            Yue.C6794.m26241(r1, r2)
            goto L4d
        L3c:
            java.util.Map<android.view.View, java.lang.Integer> r2 = r4.childImportantForAccessibilityMap
            int r3 = r1.getImportantForAccessibility()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.put(r1, r3)
            r2 = 4
            Yue.C6794.m26241(r1, r2)
        L4d:
            int r0 = r0 + 1
            goto L1
        L50:
            return
    }

    private void updateListeningForBackCallbacks(@Yue.InterfaceC4410 com.google.android.material.search.SearchView.TransitionState r2) {
            r1 = this;
            com.google.android.material.search.SearchBar r0 = r1.searchBar
            if (r0 == 0) goto L23
            boolean r0 = r1.backHandlingEnabled
            if (r0 == 0) goto L23
            com.google.android.material.search.SearchView$TransitionState r0 = com.google.android.material.search.SearchView.TransitionState.SHOWN
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L16
            com.google.android.material.motion.MaterialBackOrchestrator r2 = r1.backOrchestrator
            r2.startListeningForBackCallbacks()
            goto L23
        L16:
            com.google.android.material.search.SearchView$TransitionState r0 = com.google.android.material.search.SearchView.TransitionState.HIDDEN
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L23
            com.google.android.material.motion.MaterialBackOrchestrator r2 = r1.backOrchestrator
            r2.stopListeningForBackCallbacks()
        L23:
            return
    }

    private void updateNavigationIconIfNeeded() {
            r4 = this;
            com.google.android.material.appbar.MaterialToolbar r0 = r4.toolbar
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = r4.isNavigationIconDrawerArrowDrawable(r0)
            if (r0 == 0) goto Lc
            return
        Lc:
            int r0 = r4.getDefaultNavigationIconResource()
            com.google.android.material.search.SearchBar r1 = r4.searchBar
            if (r1 != 0) goto L1a
            com.google.android.material.appbar.MaterialToolbar r1 = r4.toolbar
            r1.setNavigationIcon(r0)
            goto L52
        L1a:
            android.content.Context r1 = r4.getContext()
            android.graphics.drawable.Drawable r0 = Yue.C0479.m1737(r1, r0)
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.graphics.drawable.Drawable r0 = Yue.C1995.m9235(r0)
            com.google.android.material.appbar.MaterialToolbar r1 = r4.toolbar
            java.lang.Integer r1 = r1.getNavigationIconTint()
            if (r1 == 0) goto L3f
            com.google.android.material.appbar.MaterialToolbar r1 = r4.toolbar
            java.lang.Integer r1 = r1.getNavigationIconTint()
            int r1 = r1.intValue()
            Yue.C1995.m9231(r0, r1)
        L3f:
            com.google.android.material.appbar.MaterialToolbar r1 = r4.toolbar
            com.google.android.material.internal.FadeThroughDrawable r2 = new com.google.android.material.internal.FadeThroughDrawable
            com.google.android.material.search.SearchBar r3 = r4.searchBar
            android.graphics.drawable.Drawable r3 = r3.getNavigationIcon()
            r2.<init>(r3, r0)
            r1.setNavigationIcon(r2)
            r4.updateNavigationIconProgressIfNeeded()
        L52:
            return
    }

    private void updateNavigationIconProgressIfNeeded() {
            r4 = this;
            com.google.android.material.appbar.MaterialToolbar r0 = r4.toolbar
            android.widget.ImageButton r0 = com.google.android.material.internal.ToolbarUtils.getNavigationIconButton(r0)
            if (r0 != 0) goto L9
            return
        L9:
            com.google.android.material.internal.ClippableRoundedCornerLayout r1 = r4.rootView
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            android.graphics.drawable.Drawable r0 = Yue.C1995.m9234(r0)
            boolean r2 = r0 instanceof Yue.C2017
            if (r2 == 0) goto L27
            r2 = r0
            Yue.ۥ۠۠ۡۨ r2 = (Yue.C2017) r2
            float r3 = (float) r1
            r2.m9329(r3)
        L27:
            boolean r2 = r0 instanceof com.google.android.material.internal.FadeThroughDrawable
            if (r2 == 0) goto L31
            com.google.android.material.internal.FadeThroughDrawable r0 = (com.google.android.material.internal.FadeThroughDrawable) r0
            float r1 = (float) r1
            r0.setProgress(r1)
        L31:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m30595(com.google.android.material.search.SearchView r0, android.view.View r1) {
            r0.lambda$setupWithSearchBar$7(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ Yue.C7065 m30596(android.view.ViewGroup.MarginLayoutParams r0, int r1, int r2, android.view.View r3, Yue.C7065 r4) {
            Yue.ۥۢۥۦ r0 = lambda$setUpDividerInsetListener$6(r0, r1, r2, r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ boolean m30597(com.google.android.material.search.SearchView r0, android.view.View r1, android.view.MotionEvent r2) {
            boolean r0 = r0.lambda$setUpContentOnTouchListener$3(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m30598(com.google.android.material.search.SearchView r0) {
            r0.lambda$clearFocusAndHideKeyboard$9()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m30599(com.google.android.material.search.SearchView r0) {
            r0.lambda$requestFocusAndShowKeyboard$8()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m30600(com.google.android.material.search.SearchView r0, android.view.View r1) {
            r0.lambda$setUpClearButton$2(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ Yue.C7065 m30601(com.google.android.material.search.SearchView r0, android.view.View r1, Yue.C7065 r2, com.google.android.material.internal.ViewUtils.RelativePadding r3) {
            Yue.ۥۢۥۦ r0 = r0.lambda$setUpToolbarInsetListener$4(r1, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ Yue.C7065 m30602(com.google.android.material.search.SearchView r0, android.view.View r1, Yue.C7065 r2) {
            Yue.ۥۢۥۦ r0 = r0.lambda$setUpStatusBarSpacerInsetListener$5(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ boolean m30603(android.view.View r0, android.view.MotionEvent r1) {
            boolean r0 = lambda$setUpRootView$0(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ void m30604(com.google.android.material.search.SearchView r0, android.view.View r1) {
            r0.lambda$setUpBackButton$1(r1)
            return
    }

    public void addHeaderView(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            android.widget.FrameLayout r0 = r1.headerContainer
            r0.addView(r2)
            android.widget.FrameLayout r2 = r1.headerContainer
            r0 = 0
            r2.setVisibility(r0)
            return
    }

    public void addTransitionListener(@Yue.InterfaceC4410 com.google.android.material.search.SearchView.TransitionListener r2) {
            r1 = this;
            java.util.Set<com.google.android.material.search.SearchView$TransitionListener> r0 = r1.transitionListeners
            r0.add(r2)
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            boolean r0 = r1.layoutInflated
            if (r0 == 0) goto La
            com.google.android.material.internal.TouchObserverFrameLayout r0 = r1.contentContainer
            r0.addView(r2, r3, r4)
            goto Ld
        La:
            super.addView(r2, r3, r4)
        Ld:
            return
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void cancelBackProgress() {
            r2 = this;
            boolean r0 = r2.isHiddenOrHiding()
            if (r0 != 0) goto L16
            com.google.android.material.search.SearchBar r0 = r2.searchBar
            if (r0 == 0) goto L16
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 >= r1) goto L11
            goto L16
        L11:
            com.google.android.material.search.SearchViewAnimationHelper r0 = r2.searchViewAnimationHelper
            r0.cancelBackProgress()
        L16:
            return
    }

    public void clearFocusAndHideKeyboard() {
            r2 = this;
            android.widget.EditText r0 = r2.editText
            Yue.ۥۡۧۦۨ r1 = new Yue.ۥۡۧۦۨ
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    public void clearText() {
            r2 = this;
            android.widget.EditText r0 = r2.editText
            java.lang.String r1 = ""
            r0.setText(r1)
            return
    }

    @Yue.InterfaceC6959
    public com.google.android.material.motion.MaterialMainContainerBackHelper getBackHelper() {
            r1 = this;
            com.google.android.material.search.SearchViewAnimationHelper r0 = r1.searchViewAnimationHelper
            com.google.android.material.motion.MaterialMainContainerBackHelper r0 = r0.getBackHelper()
            return r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.InterfaceC7492
    @Yue.InterfaceC4410
    public androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC7493<com.google.android.material.search.SearchView> getBehavior() {
            r1 = this;
            com.google.android.material.search.SearchView$Behavior r0 = new com.google.android.material.search.SearchView$Behavior
            r0.<init>()
            return r0
    }

    @Yue.InterfaceC4410
    public com.google.android.material.search.SearchView.TransitionState getCurrentTransitionState() {
            r1 = this;
            com.google.android.material.search.SearchView$TransitionState r0 = r1.currentTransitionState
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    @Yue.InterfaceC2004
    public int getDefaultNavigationIconResource() {
            r1 = this;
            int r0 = com.google.android.material.R.drawable.ic_arrow_back_black_24
            return r0
    }

    @Yue.InterfaceC4410
    public android.widget.EditText getEditText() {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            return r0
    }

    @Yue.InterfaceC4544
    public java.lang.CharSequence getHint() {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            java.lang.CharSequence r0 = r0.getHint()
            return r0
    }

    @Yue.InterfaceC4410
    public android.widget.TextView getSearchPrefix() {
            r1 = this;
            android.widget.TextView r0 = r1.searchPrefix
            return r0
    }

    @Yue.InterfaceC4544
    public java.lang.CharSequence getSearchPrefixText() {
            r1 = this;
            android.widget.TextView r0 = r1.searchPrefix
            java.lang.CharSequence r0 = r0.getText()
            return r0
    }

    @android.annotation.SuppressLint({"KotlinPropertyAccess"})
    public int getSoftInputMode() {
            r1 = this;
            int r0 = r1.softInputMode
            return r0
    }

    @Yue.InterfaceC4410
    @android.annotation.SuppressLint({"KotlinPropertyAccess"})
    public android.text.Editable getText() {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            android.text.Editable r0 = r0.getText()
            return r0
    }

    @Yue.InterfaceC4410
    public androidx.appcompat.widget.Toolbar getToolbar() {
            r1 = this;
            com.google.android.material.appbar.MaterialToolbar r0 = r1.toolbar
            return r0
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void handleBackInvoked() {
            r3 = this;
            boolean r0 = r3.isHiddenOrHiding()
            if (r0 == 0) goto L7
            return
        L7:
            com.google.android.material.search.SearchViewAnimationHelper r0 = r3.searchViewAnimationHelper
            Yue.ۥ۟ۢۤۥ r0 = r0.onHandleBackInvoked()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r1 < r2) goto L1f
            com.google.android.material.search.SearchBar r1 = r3.searchBar
            if (r1 == 0) goto L1f
            if (r0 == 0) goto L1f
            com.google.android.material.search.SearchViewAnimationHelper r0 = r3.searchViewAnimationHelper
            r0.finishBackProgress()
            goto L22
        L1f:
            r3.hide()
        L22:
            return
    }

    public void hide() {
            r2 = this;
            com.google.android.material.search.SearchView$TransitionState r0 = r2.currentTransitionState
            com.google.android.material.search.SearchView$TransitionState r1 = com.google.android.material.search.SearchView.TransitionState.HIDDEN
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1a
            com.google.android.material.search.SearchView$TransitionState r0 = r2.currentTransitionState
            com.google.android.material.search.SearchView$TransitionState r1 = com.google.android.material.search.SearchView.TransitionState.HIDING
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
            goto L1a
        L15:
            com.google.android.material.search.SearchViewAnimationHelper r0 = r2.searchViewAnimationHelper
            r0.hide()
        L1a:
            return
    }

    public void inflateMenu(@Yue.InterfaceC4144 int r2) {
            r1 = this;
            com.google.android.material.appbar.MaterialToolbar r0 = r1.toolbar
            r0.inflateMenu(r2)
            return
    }

    public boolean isAdjustNothingSoftInputMode() {
            r2 = this;
            int r0 = r2.softInputMode
            r1 = 48
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isAnimatedNavigationIcon() {
            r1 = this;
            boolean r0 = r1.animatedNavigationIcon
            return r0
    }

    public boolean isAutoShowKeyboard() {
            r1 = this;
            boolean r0 = r1.autoShowKeyboard
            return r0
    }

    public boolean isMenuItemsAnimated() {
            r1 = this;
            boolean r0 = r1.animatedMenuItems
            return r0
    }

    public boolean isSetupWithSearchBar() {
            r1 = this;
            com.google.android.material.search.SearchBar r0 = r1.searchBar
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isShowing() {
            r2 = this;
            com.google.android.material.search.SearchView$TransitionState r0 = r2.currentTransitionState
            com.google.android.material.search.SearchView$TransitionState r1 = com.google.android.material.search.SearchView.TransitionState.SHOWN
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            com.google.android.material.search.SearchView$TransitionState r0 = r2.currentTransitionState
            com.google.android.material.search.SearchView$TransitionState r1 = com.google.android.material.search.SearchView.TransitionState.SHOWING
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
            goto L17
        L15:
            r0 = 0
            goto L18
        L17:
            r0 = 1
        L18:
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public boolean isUseWindowInsetsController() {
            r1 = this;
            boolean r0 = r1.useWindowInsetsController
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r0)
            return
    }

    @Override // android.view.View
    public void onFinishInflate() {
            r0 = this;
            super.onFinishInflate()
            r0.updateSoftInputMode()
            return
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.search.SearchView.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.search.SearchView$SavedState r2 = (com.google.android.material.search.SearchView.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            java.lang.String r0 = r2.text
            r1.setText(r0)
            int r2 = r2.visibility
            if (r2 != 0) goto L1c
            r2 = 1
            goto L1d
        L1c:
            r2 = 0
        L1d:
            r1.setVisible(r2)
            return
    }

    @Override // android.view.View
    @Yue.InterfaceC4410
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            com.google.android.material.search.SearchView$SavedState r0 = new com.google.android.material.search.SearchView$SavedState
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            android.text.Editable r1 = r2.getText()
            if (r1 != 0) goto L11
            r1 = 0
            goto L15
        L11:
            java.lang.String r1 = r1.toString()
        L15:
            r0.text = r1
            com.google.android.material.internal.ClippableRoundedCornerLayout r1 = r2.rootView
            int r1 = r1.getVisibility()
            r0.visibility = r1
            return r0
    }

    public void removeAllHeaderViews() {
            r2 = this;
            android.widget.FrameLayout r0 = r2.headerContainer
            r0.removeAllViews()
            android.widget.FrameLayout r0 = r2.headerContainer
            r1 = 8
            r0.setVisibility(r1)
            return
    }

    public void removeHeaderView(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            android.widget.FrameLayout r0 = r1.headerContainer
            r0.removeView(r2)
            android.widget.FrameLayout r2 = r1.headerContainer
            int r2 = r2.getChildCount()
            if (r2 != 0) goto L14
            android.widget.FrameLayout r2 = r1.headerContainer
            r0 = 8
            r2.setVisibility(r0)
        L14:
            return
    }

    public void removeTransitionListener(@Yue.InterfaceC4410 com.google.android.material.search.SearchView.TransitionListener r2) {
            r1 = this;
            java.util.Set<com.google.android.material.search.SearchView$TransitionListener> r0 = r1.transitionListeners
            r0.remove(r2)
            return
    }

    public void requestFocusAndShowKeyboard() {
            r4 = this;
            android.widget.EditText r0 = r4.editText
            Yue.ۥۡۧۧ۠ r1 = new Yue.ۥۡۧۧ۠
            r1.<init>(r4)
            r2 = 100
            r0.postDelayed(r1, r2)
            return
    }

    public void requestFocusAndShowKeyboardIfNeeded() {
            r1 = this;
            boolean r0 = r1.autoShowKeyboard
            if (r0 == 0) goto L7
            r1.requestFocusAndShowKeyboard()
        L7:
            return
    }

    public void setAnimatedNavigationIcon(boolean r1) {
            r0 = this;
            r0.animatedNavigationIcon = r1
            return
    }

    public void setAutoShowKeyboard(boolean r1) {
            r0 = this;
            r0.autoShowKeyboard = r1
            return
    }

    @Override // android.view.View
    @Yue.InterfaceC5336(21)
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            r0.setUpBackgroundViewElevationOverlay(r1)
            return
    }

    public void setHint(@Yue.InterfaceC5971 int r2) {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            r0.setHint(r2)
            return
    }

    public void setHint(@Yue.InterfaceC4544 java.lang.CharSequence r2) {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            r0.setHint(r2)
            return
    }

    public void setMenuItemsAnimated(boolean r1) {
            r0 = this;
            r0.animatedMenuItems = r1
            return
    }

    public void setModalForAccessibility(boolean r4) {
            r3 = this;
            android.view.View r0 = r3.getRootView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r4 == 0) goto L13
            java.util.HashMap r1 = new java.util.HashMap
            int r2 = r0.getChildCount()
            r1.<init>(r2)
            r3.childImportantForAccessibilityMap = r1
        L13:
            r3.updateChildImportantForAccessibility(r0, r4)
            if (r4 != 0) goto L1b
            r4 = 0
            r3.childImportantForAccessibilityMap = r4
        L1b:
            return
    }

    public void setOnMenuItemClickListener(@Yue.InterfaceC4544 androidx.appcompat.widget.Toolbar.InterfaceC7407 r2) {
            r1 = this;
            com.google.android.material.appbar.MaterialToolbar r0 = r1.toolbar
            r0.setOnMenuItemClickListener(r2)
            return
    }

    public void setSearchPrefixText(@Yue.InterfaceC4544 java.lang.CharSequence r2) {
            r1 = this;
            android.widget.TextView r0 = r1.searchPrefix
            r0.setText(r2)
            android.widget.TextView r0 = r1.searchPrefix
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L10
            r2 = 8
            goto L11
        L10:
            r2 = 0
        L11:
            r0.setVisibility(r2)
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public void setStatusBarSpacerEnabled(boolean r2) {
            r1 = this;
            r0 = 1
            r1.statusBarSpacerEnabledOverride = r0
            r1.setStatusBarSpacerEnabledInternal(r2)
            return
    }

    public void setText(@Yue.InterfaceC5971 int r2) {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            r0.setText(r2)
            return
    }

    @android.annotation.SuppressLint({"KotlinPropertyAccess"})
    public void setText(@Yue.InterfaceC4544 java.lang.CharSequence r2) {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            r0.setText(r2)
            return
    }

    public void setToolbarTouchscreenBlocksFocus(boolean r2) {
            r1 = this;
            com.google.android.material.appbar.MaterialToolbar r0 = r1.toolbar
            r0.setTouchscreenBlocksFocus(r2)
            return
    }

    public void setTransitionState(@Yue.InterfaceC4410 com.google.android.material.search.SearchView.TransitionState r2) {
            r1 = this;
            r0 = 1
            r1.setTransitionState(r2, r0)
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public void setUseWindowInsetsController(boolean r1) {
            r0 = this;
            r0.useWindowInsetsController = r1
            return
    }

    public void setVisible(boolean r6) {
            r5 = this;
            com.google.android.material.internal.ClippableRoundedCornerLayout r0 = r5.rootView
            int r0 = r0.getVisibility()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto Lc
            r0 = r1
            goto Ld
        Lc:
            r0 = r2
        Ld:
            com.google.android.material.internal.ClippableRoundedCornerLayout r3 = r5.rootView
            if (r6 == 0) goto L13
            r4 = r2
            goto L15
        L13:
            r4 = 8
        L15:
            r3.setVisibility(r4)
            r5.updateNavigationIconProgressIfNeeded()
            if (r6 == 0) goto L20
            com.google.android.material.search.SearchView$TransitionState r3 = com.google.android.material.search.SearchView.TransitionState.SHOWN
            goto L22
        L20:
            com.google.android.material.search.SearchView$TransitionState r3 = com.google.android.material.search.SearchView.TransitionState.HIDDEN
        L22:
            if (r0 == r6) goto L25
            goto L26
        L25:
            r1 = r2
        L26:
            r5.setTransitionState(r3, r1)
            return
    }

    public void setupWithSearchBar(@Yue.InterfaceC4544 com.google.android.material.search.SearchBar r3) {
            r2 = this;
            r2.searchBar = r3
            com.google.android.material.search.SearchViewAnimationHelper r0 = r2.searchViewAnimationHelper
            r0.setSearchBar(r3)
            if (r3 == 0) goto L25
            Yue.ۥۣۡۧۧ r0 = new Yue.ۥۣۡۧۧ
            r0.<init>(r2)
            r3.setOnClickListener(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L25
            Yue.ۥۡۧۧۤ r0 = new Yue.ۥۡۧۧۤ     // Catch: java.lang.LinkageError -> L25
            r0.<init>(r2)     // Catch: java.lang.LinkageError -> L25
            Yue.C5531.m20800(r3, r0)     // Catch: java.lang.LinkageError -> L25
            android.widget.EditText r3 = r2.editText     // Catch: java.lang.LinkageError -> L25
            r0 = 1
            Yue.C5532.m20801(r3, r0)     // Catch: java.lang.LinkageError -> L25
        L25:
            r2.updateNavigationIconIfNeeded()
            r2.setUpBackgroundViewElevationOverlay()
            com.google.android.material.search.SearchView$TransitionState r3 = r2.getCurrentTransitionState()
            r2.updateListeningForBackCallbacks(r3)
            return
    }

    public void show() {
            r2 = this;
            com.google.android.material.search.SearchView$TransitionState r0 = r2.currentTransitionState
            com.google.android.material.search.SearchView$TransitionState r1 = com.google.android.material.search.SearchView.TransitionState.SHOWN
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1a
            com.google.android.material.search.SearchView$TransitionState r0 = r2.currentTransitionState
            com.google.android.material.search.SearchView$TransitionState r1 = com.google.android.material.search.SearchView.TransitionState.SHOWING
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
            goto L1a
        L15:
            com.google.android.material.search.SearchViewAnimationHelper r0 = r2.searchViewAnimationHelper
            r0.show()
        L1a:
            return
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void startBackProgress(@Yue.InterfaceC4410 Yue.C0717 r2) {
            r1 = this;
            boolean r0 = r1.isHiddenOrHiding()
            if (r0 != 0) goto L10
            com.google.android.material.search.SearchBar r0 = r1.searchBar
            if (r0 != 0) goto Lb
            goto L10
        Lb:
            com.google.android.material.search.SearchViewAnimationHelper r0 = r1.searchViewAnimationHelper
            r0.startBackProgress(r2)
        L10:
            return
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public void updateBackProgress(@Yue.InterfaceC4410 Yue.C0717 r3) {
            r2 = this;
            boolean r0 = r2.isHiddenOrHiding()
            if (r0 != 0) goto L16
            com.google.android.material.search.SearchBar r0 = r2.searchBar
            if (r0 == 0) goto L16
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 >= r1) goto L11
            goto L16
        L11:
            com.google.android.material.search.SearchViewAnimationHelper r0 = r2.searchViewAnimationHelper
            r0.updateBackProgress(r3)
        L16:
            return
    }

    public void updateSoftInputMode() {
            r1 = this;
            android.view.Window r0 = r1.getActivityWindow()
            if (r0 == 0) goto Le
            android.view.WindowManager$LayoutParams r0 = r0.getAttributes()
            int r0 = r0.softInputMode
            r1.softInputMode = r0
        Le:
            return
    }
}
