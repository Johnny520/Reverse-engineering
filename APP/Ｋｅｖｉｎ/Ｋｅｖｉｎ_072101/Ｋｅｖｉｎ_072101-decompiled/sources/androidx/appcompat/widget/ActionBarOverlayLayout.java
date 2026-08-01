package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
public class ActionBarOverlayLayout extends android.view.ViewGroup implements androidx.appcompat.widget.DecorContentParent, androidx.core.view.NestedScrollingParent, androidx.core.view.NestedScrollingParent2, androidx.core.view.NestedScrollingParent3 {
    private static final int ACTION_BAR_ANIMATE_DELAY = 600;
    static final int[] ATTRS = null;
    private static final java.lang.String TAG = "ActionBarOverlayLayout";
    private int mActionBarHeight;
    androidx.appcompat.widget.ActionBarContainer mActionBarTop;
    private androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback mActionBarVisibilityCallback;
    private final java.lang.Runnable mAddActionBarHideOffset;
    boolean mAnimatingForFling;
    private final android.graphics.Rect mBaseContentInsets;
    private androidx.core.view.WindowInsetsCompat mBaseInnerInsets;
    private final android.graphics.Rect mBaseInnerInsetsRect;
    private androidx.appcompat.widget.ContentFrameLayout mContent;
    private final android.graphics.Rect mContentInsets;
    android.view.ViewPropertyAnimator mCurrentActionBarTopAnimator;
    private androidx.appcompat.widget.DecorToolbar mDecorToolbar;
    private android.widget.OverScroller mFlingEstimator;
    private boolean mHasNonEmbeddedTabs;
    private boolean mHideOnContentScroll;
    private int mHideOnContentScrollReference;
    private boolean mIgnoreWindowContentOverlay;
    private androidx.core.view.WindowInsetsCompat mInnerInsets;
    private final android.graphics.Rect mInnerInsetsRect;
    private final android.graphics.Rect mLastBaseContentInsets;
    private androidx.core.view.WindowInsetsCompat mLastBaseInnerInsets;
    private final android.graphics.Rect mLastBaseInnerInsetsRect;
    private androidx.core.view.WindowInsetsCompat mLastInnerInsets;
    private final android.graphics.Rect mLastInnerInsetsRect;
    private int mLastSystemUiVisibility;
    private boolean mOverlayMode;
    private final androidx.core.view.NestedScrollingParentHelper mParentHelper;
    private final java.lang.Runnable mRemoveActionBarHideOffset;
    final android.animation.AnimatorListenerAdapter mTopAnimatorListener;
    private android.graphics.drawable.Drawable mWindowContentOverlay;
    private int mWindowVisibility;




    public interface ActionBarVisibilityCallback {
        void enableContentAnimations(boolean r1);

        void hideForSystem();

        void onContentScrollStarted();

        void onContentScrollStopped();

        void onWindowVisibilityChanged(int r1);

        void showForSystem();
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    static {
            int r0 = androidx.appcompat.C0015R.attr.actionBarSize
            r1 = 16842841(0x1010059, float:2.3693807E-38)
            int[] r0 = new int[]{r0, r1}
            androidx.appcompat.widget.ActionBarOverlayLayout.ATTRS = r0
            return
    }

    public ActionBarOverlayLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActionBarOverlayLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r0 = 0
            r1.mWindowVisibility = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mBaseContentInsets = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mLastBaseContentInsets = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mContentInsets = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mBaseInnerInsetsRect = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mLastBaseInnerInsetsRect = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mInnerInsetsRect = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mLastInnerInsetsRect = r0
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.CONSUMED
            r1.mBaseInnerInsets = r0
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.CONSUMED
            r1.mLastBaseInnerInsets = r0
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.CONSUMED
            r1.mInnerInsets = r0
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.CONSUMED
            r1.mLastInnerInsets = r0
            androidx.appcompat.widget.ActionBarOverlayLayout$1 r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$1
            r0.<init>(r1)
            r1.mTopAnimatorListener = r0
            androidx.appcompat.widget.ActionBarOverlayLayout$2 r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$2
            r0.<init>(r1)
            r1.mRemoveActionBarHideOffset = r0
            androidx.appcompat.widget.ActionBarOverlayLayout$3 r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$3
            r0.<init>(r1)
            r1.mAddActionBarHideOffset = r0
            r1.init(r2)
            androidx.core.view.NestedScrollingParentHelper r0 = new androidx.core.view.NestedScrollingParentHelper
            r0.<init>(r1)
            r1.mParentHelper = r0
            return
    }

    private void addActionBarHideOffset() {
            r1 = this;
            r1.haltActionBarHideOffsetAnimations()
            java.lang.Runnable r0 = r1.mAddActionBarHideOffset
            r0.run()
            return
    }

    private boolean applyInsets(android.view.View r5, android.graphics.Rect r6, boolean r7, boolean r8, boolean r9, boolean r10) {
            r4 = this;
            r0 = 0
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r1 = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) r1
            if (r7 == 0) goto L14
            int r2 = r1.leftMargin
            int r3 = r6.left
            if (r2 == r3) goto L14
            r0 = 1
            int r2 = r6.left
            r1.leftMargin = r2
        L14:
            if (r8 == 0) goto L21
            int r2 = r1.topMargin
            int r3 = r6.top
            if (r2 == r3) goto L21
            r0 = 1
            int r2 = r6.top
            r1.topMargin = r2
        L21:
            if (r10 == 0) goto L2e
            int r2 = r1.rightMargin
            int r3 = r6.right
            if (r2 == r3) goto L2e
            r0 = 1
            int r2 = r6.right
            r1.rightMargin = r2
        L2e:
            if (r9 == 0) goto L3b
            int r2 = r1.bottomMargin
            int r3 = r6.bottom
            if (r2 == r3) goto L3b
            r0 = 1
            int r2 = r6.bottom
            r1.bottomMargin = r2
        L3b:
            return r0
    }

    private androidx.appcompat.widget.DecorToolbar getDecorToolbar(android.view.View r4) {
            r3 = this;
            boolean r0 = r4 instanceof androidx.appcompat.widget.DecorToolbar
            if (r0 == 0) goto L8
            r0 = r4
            androidx.appcompat.widget.DecorToolbar r0 = (androidx.appcompat.widget.DecorToolbar) r0
            return r0
        L8:
            boolean r0 = r4 instanceof androidx.appcompat.widget.Toolbar
            if (r0 == 0) goto L14
            r0 = r4
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            androidx.appcompat.widget.DecorToolbar r0 = r0.getWrapper()
            return r0
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can't make a decor toolbar out of "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.Class r2 = r4.getClass()
            java.lang.String r2 = r2.getSimpleName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private void init(android.content.Context r6) {
            r5 = this;
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int[] r1 = androidx.appcompat.widget.ActionBarOverlayLayout.ATTRS
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            r1 = 0
            int r2 = r0.getDimensionPixelSize(r1, r1)
            r5.mActionBarHeight = r2
            r2 = 1
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r2)
            r5.mWindowContentOverlay = r3
            android.graphics.drawable.Drawable r3 = r5.mWindowContentOverlay
            if (r3 != 0) goto L22
            r3 = r2
            goto L23
        L22:
            r3 = r1
        L23:
            r5.setWillNotDraw(r3)
            r0.recycle()
            android.content.pm.ApplicationInfo r3 = r6.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            r4 = 19
            if (r3 >= r4) goto L34
            r1 = r2
        L34:
            r5.mIgnoreWindowContentOverlay = r1
            android.widget.OverScroller r1 = new android.widget.OverScroller
            r1.<init>(r6)
            r5.mFlingEstimator = r1
            return
    }

    private void postAddActionBarHideOffset() {
            r3 = this;
            r3.haltActionBarHideOffsetAnimations()
            java.lang.Runnable r0 = r3.mAddActionBarHideOffset
            r1 = 600(0x258, double:2.964E-321)
            r3.postDelayed(r0, r1)
            return
    }

    private void postRemoveActionBarHideOffset() {
            r3 = this;
            r3.haltActionBarHideOffsetAnimations()
            java.lang.Runnable r0 = r3.mRemoveActionBarHideOffset
            r1 = 600(0x258, double:2.964E-321)
            r3.postDelayed(r0, r1)
            return
    }

    private void removeActionBarHideOffset() {
            r1 = this;
            r1.haltActionBarHideOffsetAnimations()
            java.lang.Runnable r0 = r1.mRemoveActionBarHideOffset
            r0.run()
            return
    }

    private boolean shouldHideActionBarOnFling(float r10) {
            r9 = this;
            android.widget.OverScroller r0 = r9.mFlingEstimator
            int r4 = (int) r10
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r0.fling(r1, r2, r3, r4, r5, r6, r7, r8)
            android.widget.OverScroller r0 = r9.mFlingEstimator
            int r0 = r0.getFinalY()
            androidx.appcompat.widget.ActionBarContainer r1 = r9.mActionBarTop
            int r1 = r1.getHeight()
            if (r0 <= r1) goto L20
            r1 = 1
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean canShowOverflowMenu() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.canShowOverflowMenu()
            return r0
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams
            return r0
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void dismissPopups() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.dismissPopupMenus()
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r6) {
            r5 = this;
            super.draw(r6)
            android.graphics.drawable.Drawable r0 = r5.mWindowContentOverlay
            if (r0 == 0) goto L3e
            boolean r0 = r5.mIgnoreWindowContentOverlay
            if (r0 != 0) goto L3e
            androidx.appcompat.widget.ActionBarContainer r0 = r5.mActionBarTop
            int r0 = r0.getVisibility()
            r1 = 0
            if (r0 != 0) goto L27
            androidx.appcompat.widget.ActionBarContainer r0 = r5.mActionBarTop
            int r0 = r0.getBottom()
            float r0 = (float) r0
            androidx.appcompat.widget.ActionBarContainer r2 = r5.mActionBarTop
            float r2 = r2.getTranslationY()
            float r0 = r0 + r2
            r2 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r2
            int r0 = (int) r0
            goto L28
        L27:
            r0 = r1
        L28:
            android.graphics.drawable.Drawable r2 = r5.mWindowContentOverlay
            int r3 = r5.getWidth()
            android.graphics.drawable.Drawable r4 = r5.mWindowContentOverlay
            int r4 = r4.getIntrinsicHeight()
            int r4 = r4 + r0
            r2.setBounds(r1, r0, r3, r4)
            android.graphics.drawable.Drawable r1 = r5.mWindowContentOverlay
            r1.draw(r6)
        L3e:
            return
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(android.graphics.Rect r2) {
            r1 = this;
            boolean r0 = super.fitSystemWindows(r2)
            return r0
    }

    @Override // android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.view.ViewGroup
    protected androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams
            r0.<init>(r2)
            return r0
    }

    @Override // android.view.ViewGroup
    public androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r0 = new androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    public int getActionBarHideOffset() {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mActionBarTop
            if (r0 == 0) goto Ld
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mActionBarTop
            float r0 = r0.getTranslationY()
            int r0 = (int) r0
            int r0 = -r0
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
            r1 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r1.mParentHelper
            int r0 = r0.getNestedScrollAxes()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public java.lang.CharSequence getTitle() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            java.lang.CharSequence r0 = r0.getTitle()
            return r0
    }

    void haltActionBarHideOffsetAnimations() {
            r1 = this;
            java.lang.Runnable r0 = r1.mRemoveActionBarHideOffset
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.mAddActionBarHideOffset
            r1.removeCallbacks(r0)
            android.view.ViewPropertyAnimator r0 = r1.mCurrentActionBarTopAnimator
            if (r0 == 0) goto L13
            android.view.ViewPropertyAnimator r0 = r1.mCurrentActionBarTopAnimator
            r0.cancel()
        L13:
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean hasIcon() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.hasIcon()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean hasLogo() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.hasLogo()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean hideOverflowMenu() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.hideOverflowMenu()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void initFeature(int r2) {
            r1 = this;
            r1.pullChildren()
            switch(r2) {
                case 2: goto L12;
                case 5: goto Lc;
                case 109: goto L7;
                default: goto L6;
            }
        L6:
            goto L18
        L7:
            r0 = 1
            r1.setOverlayMode(r0)
            goto L18
        Lc:
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.initIndeterminateProgress()
            goto L18
        L12:
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.initProgress()
        L18:
            return
    }

    public boolean isHideOnContentScrollEnabled() {
            r1 = this;
            boolean r0 = r1.mHideOnContentScroll
            return r0
    }

    public boolean isInOverlayMode() {
            r1 = this;
            boolean r0 = r1.mOverlayMode
            return r0
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean isOverflowMenuShowPending() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.isOverflowMenuShowPending()
            return r0
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean isOverflowMenuShowing() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.isOverflowMenuShowing()
            return r0
    }

    @Override // android.view.View
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r9) {
            r8 = this;
            r8.pullChildren()
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(r9, r8)
            android.graphics.Rect r3 = new android.graphics.Rect
            int r1 = r0.getSystemWindowInsetLeft()
            int r2 = r0.getSystemWindowInsetTop()
            int r4 = r0.getSystemWindowInsetRight()
            int r5 = r0.getSystemWindowInsetBottom()
            r3.<init>(r1, r2, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r2 = r8.mActionBarTop
            r6 = 0
            r7 = 1
            r4 = 1
            r5 = 1
            r1 = r8
            boolean r1 = r1.applyInsets(r2, r3, r4, r5, r6, r7)
            android.graphics.Rect r2 = r8.mBaseContentInsets
            androidx.core.view.ViewCompat.computeSystemWindowInsets(r8, r0, r2)
            android.graphics.Rect r2 = r8.mBaseContentInsets
            int r2 = r2.left
            android.graphics.Rect r4 = r8.mBaseContentInsets
            int r4 = r4.top
            android.graphics.Rect r5 = r8.mBaseContentInsets
            int r5 = r5.right
            android.graphics.Rect r6 = r8.mBaseContentInsets
            int r6 = r6.bottom
            androidx.core.view.WindowInsetsCompat r2 = r0.inset(r2, r4, r5, r6)
            r8.mBaseInnerInsets = r2
            androidx.core.view.WindowInsetsCompat r2 = r8.mLastBaseInnerInsets
            androidx.core.view.WindowInsetsCompat r4 = r8.mBaseInnerInsets
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L51
            r1 = 1
            androidx.core.view.WindowInsetsCompat r2 = r8.mBaseInnerInsets
            r8.mLastBaseInnerInsets = r2
        L51:
            android.graphics.Rect r2 = r8.mLastBaseContentInsets
            android.graphics.Rect r4 = r8.mBaseContentInsets
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L63
            r1 = 1
            android.graphics.Rect r2 = r8.mLastBaseContentInsets
            android.graphics.Rect r4 = r8.mBaseContentInsets
            r2.set(r4)
        L63:
            if (r1 == 0) goto L68
            r8.requestLayout()
        L68:
            androidx.core.view.WindowInsetsCompat r2 = r0.consumeDisplayCutout()
            androidx.core.view.WindowInsetsCompat r2 = r2.consumeSystemWindowInsets()
            androidx.core.view.WindowInsetsCompat r2 = r2.consumeStableInsets()
            android.view.WindowInsets r2 = r2.toWindowInsets()
            return r2
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration r2) {
            r1 = this;
            super.onConfigurationChanged(r2)
            android.content.Context r0 = r1.getContext()
            r1.init(r0)
            androidx.core.view.ViewCompat.requestApplyInsets(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.haltActionBarHideOffsetAnimations()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r14, int r15, int r16, int r17, int r18) {
            r13 = this;
            int r0 = r13.getChildCount()
            int r1 = r13.getPaddingLeft()
            int r2 = r13.getPaddingTop()
            r3 = 0
        Ld:
            if (r3 >= r0) goto L3a
            r4 = r13
            android.view.View r5 = r13.getChildAt(r3)
            int r6 = r5.getVisibility()
            r7 = 8
            if (r6 == r7) goto L37
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r6 = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) r6
            int r7 = r5.getMeasuredWidth()
            int r8 = r5.getMeasuredHeight()
            int r9 = r6.leftMargin
            int r9 = r9 + r1
            int r10 = r6.topMargin
            int r10 = r10 + r2
            int r11 = r9 + r7
            int r12 = r10 + r8
            r5.layout(r9, r10, r11, r12)
        L37:
            int r3 = r3 + 1
            goto Ld
        L3a:
            r4 = r13
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r17, int r18) {
            r16 = this;
            r7 = r16
            r16.pullChildren()
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            androidx.appcompat.widget.ActionBarContainer r1 = r7.mActionBarTop
            r3 = 0
            r5 = 0
            r0 = r16
            r2 = r17
            r4 = r18
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ActionBarContainer r0 = r7.mActionBarTop
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r12 = r0
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r12 = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) r12
            androidx.appcompat.widget.ActionBarContainer r0 = r7.mActionBarTop
            int r0 = r0.getMeasuredWidth()
            int r1 = r12.leftMargin
            int r0 = r0 + r1
            int r1 = r12.rightMargin
            int r0 = r0 + r1
            int r8 = java.lang.Math.max(r8, r0)
            androidx.appcompat.widget.ActionBarContainer r0 = r7.mActionBarTop
            int r0 = r0.getMeasuredHeight()
            int r1 = r12.topMargin
            int r0 = r0 + r1
            int r1 = r12.bottomMargin
            int r0 = r0 + r1
            int r13 = java.lang.Math.max(r6, r0)
            androidx.appcompat.widget.ActionBarContainer r0 = r7.mActionBarTop
            int r0 = r0.getMeasuredState()
            int r9 = android.view.View.combineMeasuredStates(r9, r0)
            int r14 = androidx.core.view.ViewCompat.getWindowSystemUiVisibility(r16)
            r0 = r14 & 256(0x100, float:3.59E-43)
            r1 = 0
            if (r0 == 0) goto L55
            r0 = 1
            goto L56
        L55:
            r0 = r1
        L56:
            r15 = r0
            if (r15 == 0) goto L6b
            int r10 = r7.mActionBarHeight
            boolean r0 = r7.mHasNonEmbeddedTabs
            if (r0 == 0) goto L7b
            androidx.appcompat.widget.ActionBarContainer r0 = r7.mActionBarTop
            android.view.View r0 = r0.getTabContainer()
            if (r0 == 0) goto L6a
            int r2 = r7.mActionBarHeight
            int r10 = r10 + r2
        L6a:
            goto L7b
        L6b:
            androidx.appcompat.widget.ActionBarContainer r0 = r7.mActionBarTop
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L7b
            androidx.appcompat.widget.ActionBarContainer r0 = r7.mActionBarTop
            int r10 = r0.getMeasuredHeight()
        L7b:
            android.graphics.Rect r0 = r7.mContentInsets
            android.graphics.Rect r2 = r7.mBaseContentInsets
            r0.set(r2)
            androidx.core.view.WindowInsetsCompat r0 = r7.mBaseInnerInsets
            r7.mInnerInsets = r0
            boolean r0 = r7.mOverlayMode
            if (r0 != 0) goto La5
            if (r15 != 0) goto La5
            android.graphics.Rect r0 = r7.mContentInsets
            int r2 = r0.top
            int r2 = r2 + r10
            r0.top = r2
            android.graphics.Rect r0 = r7.mContentInsets
            int r2 = r0.bottom
            int r2 = r2 + r11
            r0.bottom = r2
            androidx.core.view.WindowInsetsCompat r0 = r7.mInnerInsets
            androidx.core.view.WindowInsetsCompat r0 = r0.inset(r1, r10, r1, r11)
            r7.mInnerInsets = r0
            goto Ld6
        La5:
            androidx.core.view.WindowInsetsCompat r0 = r7.mInnerInsets
            int r0 = r0.getSystemWindowInsetLeft()
            androidx.core.view.WindowInsetsCompat r1 = r7.mInnerInsets
            int r1 = r1.getSystemWindowInsetTop()
            int r1 = r1 + r10
            androidx.core.view.WindowInsetsCompat r2 = r7.mInnerInsets
            int r2 = r2.getSystemWindowInsetRight()
            androidx.core.view.WindowInsetsCompat r3 = r7.mInnerInsets
            int r3 = r3.getSystemWindowInsetBottom()
            int r3 = r3 + r11
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.m12of(r0, r1, r2, r3)
            androidx.core.view.WindowInsetsCompat$Builder r1 = new androidx.core.view.WindowInsetsCompat$Builder
            androidx.core.view.WindowInsetsCompat r2 = r7.mInnerInsets
            r1.<init>(r2)
            androidx.core.view.WindowInsetsCompat$Builder r1 = r1.setSystemWindowInsets(r0)
            androidx.core.view.WindowInsetsCompat r1 = r1.build()
            r7.mInnerInsets = r1
        Ld6:
            androidx.appcompat.widget.ContentFrameLayout r1 = r7.mContent
            android.graphics.Rect r2 = r7.mContentInsets
            r5 = 1
            r6 = 1
            r3 = 1
            r4 = 1
            r0 = r16
            r0.applyInsets(r1, r2, r3, r4, r5, r6)
            androidx.core.view.WindowInsetsCompat r0 = r7.mLastInnerInsets
            androidx.core.view.WindowInsetsCompat r1 = r7.mInnerInsets
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lf9
            androidx.core.view.WindowInsetsCompat r0 = r7.mInnerInsets
            r7.mLastInnerInsets = r0
            androidx.appcompat.widget.ContentFrameLayout r0 = r7.mContent
            androidx.core.view.WindowInsetsCompat r1 = r7.mInnerInsets
            androidx.core.view.ViewCompat.dispatchApplyWindowInsets(r0, r1)
            goto Lfa
        Lf9:
        Lfa:
            androidx.appcompat.widget.ContentFrameLayout r1 = r7.mContent
            r3 = 0
            r5 = 0
            r0 = r16
            r2 = r17
            r4 = r18
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            androidx.appcompat.widget.ContentFrameLayout r0 = r7.mContent
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r0 = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) r0
            androidx.appcompat.widget.ContentFrameLayout r1 = r7.mContent
            int r1 = r1.getMeasuredWidth()
            int r2 = r0.leftMargin
            int r1 = r1 + r2
            int r2 = r0.rightMargin
            int r1 = r1 + r2
            int r1 = java.lang.Math.max(r8, r1)
            androidx.appcompat.widget.ContentFrameLayout r2 = r7.mContent
            int r2 = r2.getMeasuredHeight()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r3 = r0.bottomMargin
            int r2 = r2 + r3
            int r2 = java.lang.Math.max(r13, r2)
            androidx.appcompat.widget.ContentFrameLayout r3 = r7.mContent
            int r3 = r3.getMeasuredState()
            int r3 = android.view.View.combineMeasuredStates(r9, r3)
            int r4 = r16.getPaddingLeft()
            int r5 = r16.getPaddingRight()
            int r4 = r4 + r5
            int r1 = r1 + r4
            int r4 = r16.getPaddingTop()
            int r5 = r16.getPaddingBottom()
            int r4 = r4 + r5
            int r2 = r2 + r4
            int r4 = r16.getSuggestedMinimumHeight()
            int r2 = java.lang.Math.max(r2, r4)
            int r4 = r16.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r4)
            r4 = r17
            int r5 = android.view.View.resolveSizeAndState(r1, r4, r3)
            int r6 = r3 << 16
            r8 = r18
            int r6 = android.view.View.resolveSizeAndState(r2, r8, r6)
            r7.setMeasuredDimension(r5, r6)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(android.view.View r2, float r3, float r4, boolean r5) {
            r1 = this;
            boolean r0 = r1.mHideOnContentScroll
            if (r0 == 0) goto L18
            if (r5 != 0) goto L7
            goto L18
        L7:
            boolean r0 = r1.shouldHideActionBarOnFling(r4)
            if (r0 == 0) goto L11
            r1.addActionBarHideOffset()
            goto L14
        L11:
            r1.removeActionBarHideOffset()
        L14:
            r0 = 1
            r1.mAnimatingForFling = r0
            return r0
        L18:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(android.view.View r2, float r3, float r4) {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(android.view.View r1, int r2, int r3, int[] r4) {
            r0 = this;
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(android.view.View r1, int r2, int r3, int[] r4, int r5) {
            r0 = this;
            if (r5 != 0) goto L5
            r0.onNestedPreScroll(r1, r2, r3, r4)
        L5:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(android.view.View r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            int r0 = r1.mHideOnContentScrollReference
            int r0 = r0 + r4
            r1.mHideOnContentScrollReference = r0
            int r0 = r1.mHideOnContentScrollReference
            r1.setActionBarHideOffset(r0)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            if (r6 != 0) goto L5
            r0.onNestedScroll(r1, r2, r3, r4, r5)
        L5:
            return
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
            r0 = this;
            r0.onNestedScroll(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r1.mParentHelper
            r0.onNestedScrollAccepted(r2, r3, r4)
            int r0 = r1.getActionBarHideOffset()
            r1.mHideOnContentScrollReference = r0
            r1.haltActionBarHideOffsetAnimations()
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r0 = r1.mActionBarVisibilityCallback
            if (r0 == 0) goto L17
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r0 = r1.mActionBarVisibilityCallback
            r0.onContentScrollStarted()
        L17:
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            if (r4 != 0) goto L5
            r0.onNestedScrollAccepted(r1, r2, r3)
        L5:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L10
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mActionBarTop
            int r0 = r0.getVisibility()
            if (r0 == 0) goto Ld
            goto L10
        Ld:
            boolean r0 = r1.mHideOnContentScroll
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(android.view.View r2, android.view.View r3, int r4, int r5) {
            r1 = this;
            if (r5 != 0) goto La
            boolean r0 = r1.onStartNestedScroll(r2, r3, r4)
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(android.view.View r3) {
            r2 = this;
            boolean r0 = r2.mHideOnContentScroll
            if (r0 == 0) goto L19
            boolean r0 = r2.mAnimatingForFling
            if (r0 != 0) goto L19
            int r0 = r2.mHideOnContentScrollReference
            androidx.appcompat.widget.ActionBarContainer r1 = r2.mActionBarTop
            int r1 = r1.getHeight()
            if (r0 > r1) goto L16
            r2.postRemoveActionBarHideOffset()
            goto L19
        L16:
            r2.postAddActionBarHideOffset()
        L19:
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r0 = r2.mActionBarVisibilityCallback
            if (r0 == 0) goto L22
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r0 = r2.mActionBarVisibilityCallback
            r0.onContentScrollStopped()
        L22:
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(android.view.View r1, int r2) {
            r0 = this;
            if (r2 != 0) goto L5
            r0.onStopNestedScroll(r1)
        L5:
            return
    }

    @Override // android.view.View
    @java.lang.Deprecated
    public void onWindowSystemUiVisibilityChanged(int r7) {
            r6 = this;
            super.onWindowSystemUiVisibilityChanged(r7)
            r6.pullChildren()
            int r0 = r6.mLastSystemUiVisibility
            r0 = r0 ^ r7
            r6.mLastSystemUiVisibility = r7
            r1 = r7 & 4
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L14
            r1 = r2
            goto L15
        L14:
            r1 = r3
        L15:
            r4 = r7 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L1b
            r4 = r2
            goto L1c
        L1b:
            r4 = r3
        L1c:
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r5 = r6.mActionBarVisibilityCallback
            if (r5 == 0) goto L39
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r5 = r6.mActionBarVisibilityCallback
            if (r4 != 0) goto L25
            goto L26
        L25:
            r2 = r3
        L26:
            r5.enableContentAnimations(r2)
            if (r1 != 0) goto L34
            if (r4 != 0) goto L2e
            goto L34
        L2e:
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r2 = r6.mActionBarVisibilityCallback
            r2.hideForSystem()
            goto L39
        L34:
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r2 = r6.mActionBarVisibilityCallback
            r2.showForSystem()
        L39:
            r2 = r0 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L44
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r2 = r6.mActionBarVisibilityCallback
            if (r2 == 0) goto L44
            androidx.core.view.ViewCompat.requestApplyInsets(r6)
        L44:
            return
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int r2) {
            r1 = this;
            super.onWindowVisibilityChanged(r2)
            r1.mWindowVisibility = r2
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r0 = r1.mActionBarVisibilityCallback
            if (r0 == 0) goto Le
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r0 = r1.mActionBarVisibilityCallback
            r0.onWindowVisibilityChanged(r2)
        Le:
            return
    }

    void pullChildren() {
            r1 = this;
            androidx.appcompat.widget.ContentFrameLayout r0 = r1.mContent
            if (r0 != 0) goto L24
            int r0 = androidx.appcompat.C0015R.id.action_bar_activity_content
            android.view.View r0 = r1.findViewById(r0)
            androidx.appcompat.widget.ContentFrameLayout r0 = (androidx.appcompat.widget.ContentFrameLayout) r0
            r1.mContent = r0
            int r0 = androidx.appcompat.C0015R.id.action_bar_container
            android.view.View r0 = r1.findViewById(r0)
            androidx.appcompat.widget.ActionBarContainer r0 = (androidx.appcompat.widget.ActionBarContainer) r0
            r1.mActionBarTop = r0
            int r0 = androidx.appcompat.C0015R.id.action_bar
            android.view.View r0 = r1.findViewById(r0)
            androidx.appcompat.widget.DecorToolbar r0 = r1.getDecorToolbar(r0)
            r1.mDecorToolbar = r0
        L24:
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void restoreToolbarHierarchyState(android.util.SparseArray<android.os.Parcelable> r2) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.restoreHierarchyState(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void saveToolbarHierarchyState(android.util.SparseArray<android.os.Parcelable> r2) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.saveHierarchyState(r2)
            return
    }

    public void setActionBarHideOffset(int r4) {
            r3 = this;
            r3.haltActionBarHideOffsetAnimations()
            androidx.appcompat.widget.ActionBarContainer r0 = r3.mActionBarTop
            int r0 = r0.getHeight()
            r1 = 0
            int r2 = java.lang.Math.min(r4, r0)
            int r4 = java.lang.Math.max(r1, r2)
            androidx.appcompat.widget.ActionBarContainer r1 = r3.mActionBarTop
            int r2 = -r4
            float r2 = (float) r2
            r1.setTranslationY(r2)
            return
    }

    public void setActionBarVisibilityCallback(androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback r3) {
            r2 = this;
            r2.mActionBarVisibilityCallback = r3
            android.os.IBinder r0 = r2.getWindowToken()
            if (r0 == 0) goto L1b
            androidx.appcompat.widget.ActionBarOverlayLayout$ActionBarVisibilityCallback r0 = r2.mActionBarVisibilityCallback
            int r1 = r2.mWindowVisibility
            r0.onWindowVisibilityChanged(r1)
            int r0 = r2.mLastSystemUiVisibility
            if (r0 == 0) goto L1b
            int r0 = r2.mLastSystemUiVisibility
            r2.onWindowSystemUiVisibilityChanged(r0)
            androidx.core.view.ViewCompat.requestApplyInsets(r2)
        L1b:
            return
    }

    public void setHasNonEmbeddedTabs(boolean r1) {
            r0 = this;
            r0.mHasNonEmbeddedTabs = r1
            return
    }

    public void setHideOnContentScrollEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.mHideOnContentScroll
            if (r2 == r0) goto Lf
            r1.mHideOnContentScroll = r2
            if (r2 != 0) goto Lf
            r1.haltActionBarHideOffsetAnimations()
            r0 = 0
            r1.setActionBarHideOffset(r0)
        Lf:
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setIcon(int r2) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setIcon(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setIcon(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setLogo(int r2) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setLogo(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setMenu(android.view.Menu r2, androidx.appcompat.view.menu.MenuPresenter.Callback r3) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setMenu(r2, r3)
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setMenuPrepared() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setMenuPrepared()
            return
    }

    public void setOverlayMode(boolean r3) {
            r2 = this;
            r2.mOverlayMode = r3
            if (r3 == 0) goto L14
            android.content.Context r0 = r2.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            r1 = 19
            if (r0 >= r1) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            r2.mIgnoreWindowContentOverlay = r0
            return
    }

    public void setShowingForActionMode(boolean r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setUiOptions(int r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowCallback(android.view.Window.Callback r2) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setWindowCallback(r2)
            return
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowTitle(java.lang.CharSequence r2) {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            r0.setWindowTitle(r2)
            return
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean showOverflowMenu() {
            r1 = this;
            r1.pullChildren()
            androidx.appcompat.widget.DecorToolbar r0 = r1.mDecorToolbar
            boolean r0 = r0.showOverflowMenu()
            return r0
    }
}
