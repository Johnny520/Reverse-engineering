package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends android.view.ViewGroup implements Yue.InterfaceC5517, Yue.InterfaceC4380, Yue.InterfaceC4381 {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = false;
    static final boolean ALLOW_THREAD_GAP_WORK = false;
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final java.lang.Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = null;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = null;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION = false;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final java.lang.String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final java.lang.String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final java.lang.String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final java.lang.String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final java.lang.String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final java.lang.String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final java.lang.String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final java.lang.String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final java.lang.String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final android.view.animation.Interpolator sQuinticInterpolator = null;
    androidx.recyclerview.widget.C7796 mAccessibilityDelegate;
    private final android.view.accessibility.AccessibilityManager mAccessibilityManager;
    androidx.recyclerview.widget.RecyclerView.AbstractC7678 mAdapter;
    androidx.recyclerview.widget.C7726 mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private android.widget.EdgeEffect mBottomGlow;
    private androidx.recyclerview.widget.RecyclerView.InterfaceC7681 mChildDrawingOrderCallback;
    androidx.recyclerview.widget.C7738 mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;

    @Yue.InterfaceC4410
    private androidx.recyclerview.widget.RecyclerView.C7682 mEdgeEffectFactory;
    boolean mEnableFastScroller;

    @Yue.InterfaceC6959
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.RunnableC7766 mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private androidx.recyclerview.widget.RecyclerView.InterfaceC7699 mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    androidx.recyclerview.widget.RecyclerView.AbstractC7684 mItemAnimator;
    private androidx.recyclerview.widget.RecyclerView.AbstractC7684.InterfaceC7687 mItemAnimatorListener;
    private java.lang.Runnable mItemAnimatorRunner;
    final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.AbstractC7690> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;

    @Yue.InterfaceC6959
    androidx.recyclerview.widget.RecyclerView.AbstractC7691 mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private android.widget.EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final androidx.recyclerview.widget.RecyclerView.C7706 mObserver;
    private java.util.List<androidx.recyclerview.widget.RecyclerView.InterfaceC7697> mOnChildAttachStateListeners;
    private androidx.recyclerview.widget.RecyclerView.AbstractC7698 mOnFlingListener;
    private final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.InterfaceC7699> mOnItemTouchListeners;

    @Yue.InterfaceC6959
    final java.util.List<androidx.recyclerview.widget.RecyclerView.AbstractC7716> mPendingAccessibilityImportanceChange;
    private androidx.recyclerview.widget.RecyclerView.C7707 mPendingSavedState;
    boolean mPostedAnimatorRunner;
    androidx.recyclerview.widget.RunnableC7766.C7768 mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final androidx.recyclerview.widget.RecyclerView.C7704 mRecycler;
    androidx.recyclerview.widget.RecyclerView.InterfaceC7705 mRecyclerListener;
    final int[] mReusableIntPair;
    private android.widget.EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private androidx.recyclerview.widget.RecyclerView.AbstractC7700 mScrollListener;
    private java.util.List<androidx.recyclerview.widget.RecyclerView.AbstractC7700> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private Yue.C4383 mScrollingChildHelper;
    final androidx.recyclerview.widget.RecyclerView.C7713 mState;
    final android.graphics.Rect mTempRect;
    private final android.graphics.Rect mTempRect2;
    final android.graphics.RectF mTempRectF;
    private android.widget.EdgeEffect mTopGlow;
    private int mTouchSlop;
    final java.lang.Runnable mUpdateChildViewsRunnable;
    private android.view.VelocityTracker mVelocityTracker;
    final androidx.recyclerview.widget.RecyclerView.RunnableC7715 mViewFlinger;
    private final androidx.recyclerview.widget.C7811.InterfaceC7813 mViewInfoProcessCallback;
    final androidx.recyclerview.widget.C7811 mViewInfoStore;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ, reason: contains not printable characters */
    public class RunnableC7672 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f29583;

        public RunnableC7672(androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                r0.f29583 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29583
                boolean r1 = r0.mFirstLayoutComplete
                if (r1 == 0) goto L22
                boolean r0 = r0.isLayoutRequested()
                if (r0 == 0) goto Ld
                goto L22
            Ld:
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29583
                boolean r1 = r0.mIsAttached
                if (r1 != 0) goto L17
                r0.requestLayout()
                return
            L17:
                boolean r1 = r0.mLayoutSuppressed
                if (r1 == 0) goto L1f
                r1 = 1
                r0.mLayoutWasDefered = r1
                return
            L1f:
                r0.consumePendingUpdateOperations()
            L22:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟, reason: contains not printable characters */
    public class RunnableC7673 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f29584;

        public RunnableC7673(androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                r0.f29584 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29584
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r0 = r0.mItemAnimator
                if (r0 == 0) goto L9
                r0.mo29749()
            L9:
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29584
                r1 = 0
                r0.mPostedAnimatorRunner = r1
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟, reason: contains not printable characters */
    public static class InterpolatorC7674 implements android.view.animation.Interpolator {
        public InterpolatorC7674() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float r3) {
                r2 = this;
                r0 = 1065353216(0x3f800000, float:1.0)
                float r3 = r3 - r0
                float r1 = r3 * r3
                float r1 = r1 * r3
                float r1 = r1 * r3
                float r1 = r1 * r3
                float r1 = r1 + r0
                return r1
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟, reason: contains not printable characters */
    public class C7675 implements androidx.recyclerview.widget.C7811.InterfaceC7813 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f29585;

        public C7675(androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                r0.f29585 = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.C7811.InterfaceC7813
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void mo29693(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29585
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r0.mLayout
                android.view.View r3 = r3.itemView
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r0 = r0.mRecycler
                r1.removeAndRecycleView(r3, r0)
                return
        }

        @Override // androidx.recyclerview.widget.C7811.InterfaceC7813
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void mo29694(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r2, androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r3, androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r4) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.f29585
                r0.animateAppearance(r2, r3, r4)
                return
        }

        @Override // androidx.recyclerview.widget.C7811.InterfaceC7813
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo29695(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r2, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r3, @Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r4) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.f29585
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r0 = r0.mRecycler
                r0.m29832(r2)
                androidx.recyclerview.widget.RecyclerView r0 = r1.f29585
                r0.animateDisappearance(r2, r3, r4)
                return
        }

        @Override // androidx.recyclerview.widget.C7811.InterfaceC7813
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo29696(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r3, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r4, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r5) {
                r2 = this;
                r0 = 0
                r3.setIsRecyclable(r0)
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29585
                boolean r1 = r0.mDataSetHasChangedAfterLayout
                if (r1 == 0) goto L18
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r0 = r0.mItemAnimator
                boolean r3 = r0.mo29728(r3, r3, r4, r5)
                if (r3 == 0) goto L25
                androidx.recyclerview.widget.RecyclerView r3 = r2.f29585
                r3.postAnimationRunner()
                goto L25
            L18:
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r0 = r0.mItemAnimator
                boolean r3 = r0.mo29730(r3, r4, r5)
                if (r3 == 0) goto L25
                androidx.recyclerview.widget.RecyclerView r3 = r2.f29585
                r3.postAnimationRunner()
            L25:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C7676 implements androidx.recyclerview.widget.C7738.InterfaceC7740 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f29586;

        public C7676(androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                r0.f29586 = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.C7738.InterfaceC7740
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.view.View mo29697(int r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.f29586
                android.view.View r2 = r0.getChildAt(r2)
                return r2
        }

        @Override // androidx.recyclerview.widget.C7738.InterfaceC7740
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void mo29698(android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r2)
                if (r2 == 0) goto Lb
                androidx.recyclerview.widget.RecyclerView r0 = r1.f29586
                r2.onEnteredHiddenState(r0)
            Lb:
                return
        }

        @Override // androidx.recyclerview.widget.C7738.InterfaceC7740
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int mo29699() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.f29586
                int r0 = r0.getChildCount()
                return r0
        }

        @Override // androidx.recyclerview.widget.C7738.InterfaceC7740
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo29700() {
                r4 = this;
                int r0 = r4.mo29699()
                r1 = 0
            L5:
                if (r1 >= r0) goto L16
                android.view.View r2 = r4.mo29697(r1)
                androidx.recyclerview.widget.RecyclerView r3 = r4.f29586
                r3.dispatchChildDetached(r2)
                r2.clearAnimation()
                int r1 = r1 + 1
                goto L5
            L16:
                androidx.recyclerview.widget.RecyclerView r0 = r4.f29586
                r0.removeAllViews()
                return
        }

        @Override // androidx.recyclerview.widget.C7738.InterfaceC7740
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int mo29701(android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.f29586
                int r2 = r0.indexOfChild(r2)
                return r2
        }

        @Override // androidx.recyclerview.widget.C7738.InterfaceC7740
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public androidx.recyclerview.widget.RecyclerView.AbstractC7716 mo29702(android.view.View r1) {
                r0 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r1 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r1)
                return r1
        }

        @Override // androidx.recyclerview.widget.C7738.InterfaceC7740
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void mo29703(int r4) {
                r3 = this;
                android.view.View r0 = r3.mo29697(r4)
                if (r0 == 0) goto L3e
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r0)
                if (r0 == 0) goto L3e
                boolean r1 = r0.isTmpDetached()
                if (r1 == 0) goto L39
                boolean r1 = r0.shouldIgnore()
                if (r1 == 0) goto L19
                goto L39
            L19:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "called detach on an already detached child "
                r1.append(r2)
                r1.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = r3.f29586
                java.lang.String r0 = r0.exceptionLabel()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r4.<init>(r0)
                throw r4
            L39:
                r1 = 256(0x100, float:3.59E-43)
                r0.addFlags(r1)
            L3e:
                androidx.recyclerview.widget.RecyclerView r0 = r3.f29586
                androidx.recyclerview.widget.RecyclerView.access$100(r0, r4)
                return
        }

        @Override // androidx.recyclerview.widget.C7738.InterfaceC7740
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void mo29704(android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r2)
                if (r2 == 0) goto Lb
                androidx.recyclerview.widget.RecyclerView r0 = r1.f29586
                r2.onLeftHiddenState(r0)
            Lb:
                return
        }

        @Override // androidx.recyclerview.widget.C7738.InterfaceC7740
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void mo29705(android.view.View r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.f29586
                r0.addView(r2, r3)
                androidx.recyclerview.widget.RecyclerView r3 = r1.f29586
                r3.dispatchChildAttached(r2)
                return
        }

        @Override // androidx.recyclerview.widget.C7738.InterfaceC7740
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void mo29706(int r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29586
                android.view.View r0 = r0.getChildAt(r3)
                if (r0 == 0) goto L10
                androidx.recyclerview.widget.RecyclerView r1 = r2.f29586
                r1.dispatchChildDetached(r0)
                r0.clearAnimation()
            L10:
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29586
                r0.removeViewAt(r3)
                return
        }

        @Override // androidx.recyclerview.widget.C7738.InterfaceC7740
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void mo29707(android.view.View r3, int r4, android.view.ViewGroup.LayoutParams r5) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r3)
                if (r0 == 0) goto L36
                boolean r1 = r0.isTmpDetached()
                if (r1 != 0) goto L33
                boolean r1 = r0.shouldIgnore()
                if (r1 == 0) goto L13
                goto L33
            L13:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Called attach on a child which is not detached: "
                r4.append(r5)
                r4.append(r0)
                androidx.recyclerview.widget.RecyclerView r5 = r2.f29586
                java.lang.String r5 = r5.exceptionLabel()
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
            L33:
                r0.clearTmpDetachFlag()
            L36:
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29586
                androidx.recyclerview.widget.RecyclerView.access$000(r0, r3, r4, r5)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟۠, reason: contains not printable characters */
    public class C7677 implements androidx.recyclerview.widget.C7726.InterfaceC7727 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f29587;

        public C7677(androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                r0.f29587 = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.C7726.InterfaceC7727
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void mo29708(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.f29587
                r0.offsetPositionRecordsForMove(r2, r3)
                androidx.recyclerview.widget.RecyclerView r2 = r1.f29587
                r3 = 1
                r2.mItemsAddedOrRemoved = r3
                return
        }

        @Override // androidx.recyclerview.widget.C7726.InterfaceC7727
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void mo29709(androidx.recyclerview.widget.C7726.C7728 r1) {
                r0 = this;
                r0.m29716(r1)
                return
        }

        @Override // androidx.recyclerview.widget.C7726.InterfaceC7727
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo29710(int r2, int r3, java.lang.Object r4) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.f29587
                r0.viewRangeUpdate(r2, r3, r4)
                androidx.recyclerview.widget.RecyclerView r2 = r1.f29587
                r3 = 1
                r2.mItemsChanged = r3
                return
        }

        @Override // androidx.recyclerview.widget.C7726.InterfaceC7727
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo29711(androidx.recyclerview.widget.C7726.C7728 r1) {
                r0 = this;
                r0.m29716(r1)
                return
        }

        @Override // androidx.recyclerview.widget.C7726.InterfaceC7727
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public androidx.recyclerview.widget.RecyclerView.AbstractC7716 mo29712(int r4) {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r3.f29587
                r1 = 1
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r4 = r0.findViewHolderForPosition(r4, r1)
                r0 = 0
                if (r4 != 0) goto Lb
                return r0
            Lb:
                androidx.recyclerview.widget.RecyclerView r1 = r3.f29587
                androidx.recyclerview.widget.ۥ۟۟۟۟ r1 = r1.mChildHelper
                android.view.View r2 = r4.itemView
                boolean r1 = r1.m30055(r2)
                if (r1 == 0) goto L18
                return r0
            L18:
                return r4
        }

        @Override // androidx.recyclerview.widget.C7726.InterfaceC7727
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void mo29713(int r3, int r4) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29587
                r1 = 0
                r0.offsetPositionRecordsForRemove(r3, r4, r1)
                androidx.recyclerview.widget.RecyclerView r3 = r2.f29587
                r4 = 1
                r3.mItemsAddedOrRemoved = r4
                return
        }

        @Override // androidx.recyclerview.widget.C7726.InterfaceC7727
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void mo29714(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.f29587
                r0.offsetPositionRecordsForInsert(r2, r3)
                androidx.recyclerview.widget.RecyclerView r2 = r1.f29587
                r3 = 1
                r2.mItemsAddedOrRemoved = r3
                return
        }

        @Override // androidx.recyclerview.widget.C7726.InterfaceC7727
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void mo29715(int r3, int r4) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29587
                r1 = 1
                r0.offsetPositionRecordsForRemove(r3, r4, r1)
                androidx.recyclerview.widget.RecyclerView r3 = r2.f29587
                r3.mItemsAddedOrRemoved = r1
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r3 = r3.mState
                int r0 = r3.f29652
                int r0 = r0 + r4
                r3.f29652 = r0
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void m29716(androidx.recyclerview.widget.C7726.C7728 r5) {
                r4 = this;
                int r0 = r5.f29758
                r1 = 1
                if (r0 == r1) goto L36
                r2 = 2
                if (r0 == r2) goto L2a
                r2 = 4
                if (r0 == r2) goto L1c
                r2 = 8
                if (r0 == r2) goto L10
                goto L41
            L10:
                androidx.recyclerview.widget.RecyclerView r0 = r4.f29587
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r2 = r0.mLayout
                int r3 = r5.f29759
                int r5 = r5.f29761
                r2.onItemsMoved(r0, r3, r5, r1)
                goto L41
            L1c:
                androidx.recyclerview.widget.RecyclerView r0 = r4.f29587
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r0.mLayout
                int r2 = r5.f29759
                int r3 = r5.f29761
                java.lang.Object r5 = r5.f29760
                r1.onItemsUpdated(r0, r2, r3, r5)
                goto L41
            L2a:
                androidx.recyclerview.widget.RecyclerView r0 = r4.f29587
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r0.mLayout
                int r2 = r5.f29759
                int r5 = r5.f29761
                r1.onItemsRemoved(r0, r2, r5)
                goto L41
            L36:
                androidx.recyclerview.widget.RecyclerView r0 = r4.f29587
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r0.mLayout
                int r2 = r5.f29759
                int r5 = r5.f29761
                r1.onItemsAdded(r0, r2, r5)
            L41:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static abstract class AbstractC7678<VH extends androidx.recyclerview.widget.RecyclerView.AbstractC7716> {
        private boolean mHasStableIds;
        private final androidx.recyclerview.widget.RecyclerView.C7679 mObservable;

        public AbstractC7678() {
                r1 = this;
                r1.<init>()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۢ r0 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۢ
                r0.<init>()
                r1.mObservable = r0
                r0 = 0
                r1.mHasStableIds = r0
                return
        }

        public final void bindViewHolder(@Yue.InterfaceC4410 VH r3, int r4) {
                r2 = this;
                r3.mPosition = r4
                boolean r0 = r2.hasStableIds()
                if (r0 == 0) goto Le
                long r0 = r2.getItemId(r4)
                r3.mItemId = r0
            Le:
                r0 = 519(0x207, float:7.27E-43)
                r1 = 1
                r3.setFlags(r1, r0)
                java.lang.String r0 = "RV OnBindView"
                Yue.C6388.m23593(r0)
                java.util.List r0 = r3.getUnmodifiedPayloads()
                r2.onBindViewHolder(r3, r4, r0)
                r3.clearPayload()
                android.view.View r3 = r3.itemView
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                boolean r4 = r3 instanceof androidx.recyclerview.widget.RecyclerView.C7696
                if (r4 == 0) goto L31
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r3 = (androidx.recyclerview.widget.RecyclerView.C7696) r3
                r3.f29617 = r1
            L31:
                Yue.C6388.m23595()
                return
        }

        @Yue.InterfaceC4410
        public final VH createViewHolder(@Yue.InterfaceC4410 android.view.ViewGroup r2, int r3) {
                r1 = this;
                java.lang.String r0 = "RV CreateView"
                Yue.C6388.m23593(r0)     // Catch: java.lang.Throwable -> L17
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = r1.onCreateViewHolder(r2, r3)     // Catch: java.lang.Throwable -> L17
                android.view.View r0 = r2.itemView     // Catch: java.lang.Throwable -> L17
                android.view.ViewParent r0 = r0.getParent()     // Catch: java.lang.Throwable -> L17
                if (r0 != 0) goto L19
                r2.mItemViewType = r3     // Catch: java.lang.Throwable -> L17
                Yue.C6388.m23595()
                return r2
            L17:
                r2 = move-exception
                goto L21
            L19:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L17
                java.lang.String r3 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L17
                throw r2     // Catch: java.lang.Throwable -> L17
            L21:
                Yue.C6388.m23595()
                throw r2
        }

        public abstract int getItemCount();

        public long getItemId(int r3) {
                r2 = this;
                r0 = -1
                return r0
        }

        public int getItemViewType(int r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public final boolean hasObservers() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۢ r0 = r1.mObservable
                boolean r0 = r0.m29717()
                return r0
        }

        public final boolean hasStableIds() {
                r1 = this;
                boolean r0 = r1.mHasStableIds
                return r0
        }

        public final void notifyDataSetChanged() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۢ r0 = r1.mObservable
                r0.m29718()
                return
        }

        public final void notifyItemChanged(int r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۢ r0 = r2.mObservable
                r1 = 1
                r0.m29720(r3, r1)
                return
        }

        public final void notifyItemChanged(int r3, @Yue.InterfaceC4544 java.lang.Object r4) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۢ r0 = r2.mObservable
                r1 = 1
                r0.m29721(r3, r1, r4)
                return
        }

        public final void notifyItemInserted(int r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۢ r0 = r2.mObservable
                r1 = 1
                r0.m29722(r3, r1)
                return
        }

        public final void notifyItemMoved(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۢ r0 = r1.mObservable
                r0.m29719(r2, r3)
                return
        }

        public final void notifyItemRangeChanged(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۢ r0 = r1.mObservable
                r0.m29720(r2, r3)
                return
        }

        public final void notifyItemRangeChanged(int r2, int r3, @Yue.InterfaceC4544 java.lang.Object r4) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۢ r0 = r1.mObservable
                r0.m29721(r2, r3, r4)
                return
        }

        public final void notifyItemRangeInserted(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۢ r0 = r1.mObservable
                r0.m29722(r2, r3)
                return
        }

        public final void notifyItemRangeRemoved(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۢ r0 = r1.mObservable
                r0.m29723(r2, r3)
                return
        }

        public final void notifyItemRemoved(int r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۢ r0 = r2.mObservable
                r1 = 1
                r0.m29723(r3, r1)
                return
        }

        public void onAttachedToRecyclerView(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                return
        }

        public abstract void onBindViewHolder(@Yue.InterfaceC4410 VH r1, int r2);

        public void onBindViewHolder(@Yue.InterfaceC4410 VH r1, int r2, @Yue.InterfaceC4410 java.util.List<java.lang.Object> r3) {
                r0 = this;
                r0.onBindViewHolder(r1, r2)
                return
        }

        @Yue.InterfaceC4410
        public abstract VH onCreateViewHolder(@Yue.InterfaceC4410 android.view.ViewGroup r1, int r2);

        public void onDetachedFromRecyclerView(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                return
        }

        public boolean onFailedToRecycleView(@Yue.InterfaceC4410 VH r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void onViewAttachedToWindow(@Yue.InterfaceC4410 VH r1) {
                r0 = this;
                return
        }

        public void onViewDetachedFromWindow(@Yue.InterfaceC4410 VH r1) {
                r0 = this;
                return
        }

        public void onViewRecycled(@Yue.InterfaceC4410 VH r1) {
                r0 = this;
                return
        }

        public void registerAdapterDataObserver(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7680 r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۢ r0 = r1.mObservable
                r0.registerObserver(r2)
                return
        }

        public void setHasStableIds(boolean r2) {
                r1 = this;
                boolean r0 = r1.hasObservers()
                if (r0 != 0) goto L9
                r1.mHasStableIds = r2
                return
            L9:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Cannot change whether this adapter has stable IDs while the adapter has registered observers."
                r2.<init>(r0)
                throw r2
        }

        public void unregisterAdapterDataObserver(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7680 r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۢ r0 = r1.mObservable
                r0.unregisterObserver(r2)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static class C7679 extends android.database.Observable<androidx.recyclerview.widget.RecyclerView.AbstractC7680> {
        public C7679() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean m29717() {
                r1 = this;
                java.util.ArrayList r0 = r1.mObservers
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ 1
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m29718() {
                r2 = this;
                java.util.ArrayList r0 = r2.mObservers
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r1 = r2.mObservers
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۟ r1 = (androidx.recyclerview.widget.RecyclerView.AbstractC7680) r1
                r1.onChanged()
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m29719(int r4, int r5) {
                r3 = this;
                java.util.ArrayList r0 = r3.mObservers
                int r0 = r0.size()
                r1 = 1
                int r0 = r0 - r1
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r2 = r3.mObservers
                java.lang.Object r2 = r2.get(r0)
                androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۟ r2 = (androidx.recyclerview.widget.RecyclerView.AbstractC7680) r2
                r2.onItemRangeMoved(r4, r5, r1)
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m29720(int r2, int r3) {
                r1 = this;
                r0 = 0
                r1.m29721(r2, r3, r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m29721(int r3, int r4, @Yue.InterfaceC4544 java.lang.Object r5) {
                r2 = this;
                java.util.ArrayList r0 = r2.mObservers
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r1 = r2.mObservers
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۟ r1 = (androidx.recyclerview.widget.RecyclerView.AbstractC7680) r1
                r1.onItemRangeChanged(r3, r4, r5)
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void m29722(int r3, int r4) {
                r2 = this;
                java.util.ArrayList r0 = r2.mObservers
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r1 = r2.mObservers
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۟ r1 = (androidx.recyclerview.widget.RecyclerView.AbstractC7680) r1
                r1.onItemRangeInserted(r3, r4)
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m29723(int r3, int r4) {
                r2 = this;
                java.util.ArrayList r0 = r2.mObservers
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L18
                java.util.ArrayList r1 = r2.mObservers
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۟ r1 = (androidx.recyclerview.widget.RecyclerView.AbstractC7680) r1
                r1.onItemRangeRemoved(r3, r4)
                int r0 = r0 + (-1)
                goto L8
            L18:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC7680 {
        public AbstractC7680() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onChanged() {
                r0 = this;
                return
        }

        public void onItemRangeChanged(int r1, int r2) {
                r0 = this;
                return
        }

        public void onItemRangeChanged(int r1, int r2, @Yue.InterfaceC4544 java.lang.Object r3) {
                r0 = this;
                r0.onItemRangeChanged(r1, r2)
                return
        }

        public void onItemRangeInserted(int r1, int r2) {
                r0 = this;
                return
        }

        public void onItemRangeMoved(int r1, int r2, int r3) {
                r0 = this;
                return
        }

        public void onItemRangeRemoved(int r1, int r2) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public interface InterfaceC7681 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        int mo29724(int r1, int r2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static class C7682 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final int f29588 = 0;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static final int f29589 = 1;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final int f29590 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final int f29591 = 3;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۥ$ۥ, reason: contains not printable characters */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface InterfaceC7683 {
        }

        public C7682() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.widget.EdgeEffect m29725(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r1, int r2) {
                r0 = this;
                android.widget.EdgeEffect r2 = new android.widget.EdgeEffect
                android.content.Context r1 = r1.getContext()
                r2.<init>(r1)
                return r2
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static abstract class AbstractC7684 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f29592 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f29593 = 8;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f29594 = 4;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final int f29595 = 2048;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static final int f29596 = 4096;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public androidx.recyclerview.widget.RecyclerView.AbstractC7684.InterfaceC7687 f29597;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.AbstractC7684.InterfaceC7686> f29598;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public long f29599;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public long f29600;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public long f29601;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public long f29602;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ, reason: contains not printable characters */
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface InterfaceC7685 {
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟, reason: contains not printable characters */
        public interface InterfaceC7686 {
            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            void m29755();
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟, reason: contains not printable characters */
        public interface InterfaceC7687 {
            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            void mo29756(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1);
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟, reason: contains not printable characters */
        public static class C7688 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public int f29603;

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public int f29604;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public int f29605;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public int f29606;

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public int f29607;

            public C7688() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Yue.InterfaceC4410
            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 m29757(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r2) {
                    r1 = this;
                    r0 = 0
                    androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟ r2 = r1.m29758(r2, r0)
                    return r2
            }

            @Yue.InterfaceC4410
            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 m29758(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1, int r2) {
                    r0 = this;
                    android.view.View r1 = r1.itemView
                    int r2 = r1.getLeft()
                    r0.f29603 = r2
                    int r2 = r1.getTop()
                    r0.f29604 = r2
                    int r2 = r1.getRight()
                    r0.f29605 = r2
                    int r1 = r1.getBottom()
                    r0.f29606 = r1
                    return r0
            }
        }

        public AbstractC7684() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.f29597 = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.f29598 = r0
                r0 = 120(0x78, double:5.93E-322)
                r2.f29599 = r0
                r2.f29600 = r0
                r0 = 250(0xfa, double:1.235E-321)
                r2.f29601 = r0
                r2.f29602 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static int m29726(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r4) {
                int r0 = r4.mFlags
                r1 = r0 & 14
                boolean r2 = r4.isInvalid()
                r3 = 4
                if (r2 == 0) goto Lc
                return r3
            Lc:
                r0 = r0 & r3
                if (r0 != 0) goto L20
                int r0 = r4.getOldPosition()
                int r4 = r4.getAdapterPosition()
                r2 = -1
                if (r0 == r2) goto L20
                if (r4 == r2) goto L20
                if (r0 == r4) goto L20
                r1 = r1 | 2048(0x800, float:2.87E-42)
            L20:
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public abstract boolean mo29727(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1, @Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r2, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r3);

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public abstract boolean mo29728(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r2, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r3, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r4);

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public abstract boolean mo29729(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r2, @Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r3);

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public abstract boolean mo29730(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r2, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r3);

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean mo29731(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1) {
                r0 = this;
                r1 = 1
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean mo29732(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1, @Yue.InterfaceC4410 java.util.List<java.lang.Object> r2) {
                r0 = this;
                boolean r1 = r0.mo29731(r1)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m29733(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r2) {
                r1 = this;
                r1.m29745(r2)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟ r0 = r1.f29597
                if (r0 == 0) goto La
                r0.mo29756(r2)
            La:
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final void m29734(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1) {
                r0 = this;
                r0.m29746(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final void m29735() {
                r3 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟> r0 = r3.f29598
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L17
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟> r2 = r3.f29598
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟ r2 = (androidx.recyclerview.widget.RecyclerView.AbstractC7684.InterfaceC7686) r2
                r2.m29755()
                int r1 = r1 + 1
                goto L7
            L17:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟> r0 = r3.f29598
                r0.clear()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public abstract void mo29736(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1);

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public abstract void mo29737();

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public long m29738() {
                r2 = this;
                long r0 = r2.f29599
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public long m29739() {
                r2 = this;
                long r0 = r2.f29602
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public long m29740() {
                r2 = this;
                long r0 = r2.f29601
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public long m29741() {
                r2 = this;
                long r0 = r2.f29600
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public abstract boolean mo29742();

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public final boolean m29743(@Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7684.InterfaceC7686 r3) {
                r2 = this;
                boolean r0 = r2.mo29742()
                if (r3 == 0) goto L11
                if (r0 != 0) goto Lc
                r3.m29755()
                goto L11
            Lc:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟> r1 = r2.f29598
                r1.add(r3)
            L11:
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 m29744() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟ r0 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟
                r0.<init>()
                return r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public void m29745(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public void m29746(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1) {
                r0 = this;
                return
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 m29747(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r1, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r2) {
                r0 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟ r1 = r0.m29744()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟ r1 = r1.m29757(r2)
                return r1
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 m29748(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r1, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r2, int r3, @Yue.InterfaceC4410 java.util.List<java.lang.Object> r4) {
                r0 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟ r1 = r0.m29744()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟ r1 = r1.m29757(r2)
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public abstract void mo29749();

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public void m29750(long r1) {
                r0 = this;
                r0.f29599 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public void m29751(long r1) {
                r0 = this;
                r0.f29602 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public void m29752(androidx.recyclerview.widget.RecyclerView.AbstractC7684.InterfaceC7687 r1) {
                r0 = this;
                r0.f29597 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public void m29753(long r1) {
                r0 = this;
                r0.f29601 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public void m29754(long r1) {
                r0 = this;
                r0.f29600 = r1
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public class C7689 implements androidx.recyclerview.widget.RecyclerView.AbstractC7684.InterfaceC7687 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f29608;

        public C7689(androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                r0.f29608 = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7684.InterfaceC7687
        /* JADX INFO: renamed from: ۥ */
        public void mo29756(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r3) {
                r2 = this;
                r0 = 1
                r3.setIsRecyclable(r0)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r3.mShadowedHolder
                r1 = 0
                if (r0 == 0) goto Lf
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r3.mShadowingHolder
                if (r0 != 0) goto Lf
                r3.mShadowedHolder = r1
            Lf:
                r3.mShadowingHolder = r1
                boolean r0 = r3.shouldBeKeptAsChild()
                if (r0 != 0) goto L2f
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29608
                android.view.View r1 = r3.itemView
                boolean r0 = r0.removeAnimatingView(r1)
                if (r0 != 0) goto L2f
                boolean r0 = r3.isTmpDetached()
                if (r0 == 0) goto L2f
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29608
                android.view.View r3 = r3.itemView
                r1 = 0
                r0.removeDetachedView(r3, r1)
            L2f:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static abstract class AbstractC7690 {
        public AbstractC7690() {
                r0 = this;
                r0.<init>()
                return
        }

        @java.lang.Deprecated
        public void getItemOffsets(@Yue.InterfaceC4410 android.graphics.Rect r1, int r2, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r3) {
                r0 = this;
                r2 = 0
                r1.set(r2, r2, r2, r2)
                return
        }

        public void getItemOffsets(@Yue.InterfaceC4410 android.graphics.Rect r1, @Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r3, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r4) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r2 = (androidx.recyclerview.widget.RecyclerView.C7696) r2
                int r2 = r2.m29772()
                r0.getItemOffsets(r1, r2, r3)
                return
        }

        @java.lang.Deprecated
        public void onDraw(@Yue.InterfaceC4410 android.graphics.Canvas r1, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r2) {
                r0 = this;
                return
        }

        public void onDraw(@Yue.InterfaceC4410 android.graphics.Canvas r1, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r2, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r3) {
                r0 = this;
                r0.onDraw(r1, r2)
                return
        }

        @java.lang.Deprecated
        public void onDrawOver(@Yue.InterfaceC4410 android.graphics.Canvas r1, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r2) {
                r0 = this;
                return
        }

        public void onDrawOver(@Yue.InterfaceC4410 android.graphics.Canvas r1, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r2, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r3) {
                r0 = this;
                r0.onDrawOver(r1, r2)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠, reason: contains not printable characters */
    public static abstract class AbstractC7691 {
        boolean mAutoMeasure;
        androidx.recyclerview.widget.C7738 mChildHelper;
        private int mHeight;
        private int mHeightMode;
        androidx.recyclerview.widget.C7807 mHorizontalBoundCheck;
        private final androidx.recyclerview.widget.C7807.InterfaceC7809 mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        androidx.recyclerview.widget.RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;

        @Yue.InterfaceC4544
        androidx.recyclerview.widget.RecyclerView.AbstractC7710 mSmoothScroller;
        androidx.recyclerview.widget.C7807 mVerticalBoundCheck;
        private final androidx.recyclerview.widget.C7807.InterfaceC7809 mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠$ۥ, reason: contains not printable characters */
        public class C7692 implements androidx.recyclerview.widget.C7807.InterfaceC7809 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.AbstractC7691 f29609;

            public C7692(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r1) {
                    r0 = this;
                    r0.f29609 = r1
                    r0.<init>()
                    return
            }

            @Override // androidx.recyclerview.widget.C7807.InterfaceC7809
            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public android.view.View mo29765(int r2) {
                    r1 = this;
                    androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.f29609
                    android.view.View r2 = r0.getChildAt(r2)
                    return r2
            }

            @Override // androidx.recyclerview.widget.C7807.InterfaceC7809
            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public int mo29766(android.view.View r3) {
                    r2 = this;
                    android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                    androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
                    androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r2.f29609
                    int r3 = r1.getDecoratedLeft(r3)
                    int r0 = r0.leftMargin
                    int r3 = r3 - r0
                    return r3
            }

            @Override // androidx.recyclerview.widget.C7807.InterfaceC7809
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public int mo29767() {
                    r1 = this;
                    androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.f29609
                    int r0 = r0.getPaddingLeft()
                    return r0
            }

            @Override // androidx.recyclerview.widget.C7807.InterfaceC7809
            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public int mo29768() {
                    r2 = this;
                    androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.f29609
                    int r0 = r0.getWidth()
                    androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r2.f29609
                    int r1 = r1.getPaddingRight()
                    int r0 = r0 - r1
                    return r0
            }

            @Override // androidx.recyclerview.widget.C7807.InterfaceC7809
            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public int mo29769(android.view.View r3) {
                    r2 = this;
                    android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                    androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
                    androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r2.f29609
                    int r3 = r1.getDecoratedRight(r3)
                    int r0 = r0.rightMargin
                    int r3 = r3 + r0
                    return r3
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠$ۥ۟, reason: contains not printable characters */
        public class C7693 implements androidx.recyclerview.widget.C7807.InterfaceC7809 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.AbstractC7691 f29610;

            public C7693(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r1) {
                    r0 = this;
                    r0.f29610 = r1
                    r0.<init>()
                    return
            }

            @Override // androidx.recyclerview.widget.C7807.InterfaceC7809
            /* JADX INFO: renamed from: ۥ */
            public android.view.View mo29765(int r2) {
                    r1 = this;
                    androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.f29610
                    android.view.View r2 = r0.getChildAt(r2)
                    return r2
            }

            @Override // androidx.recyclerview.widget.C7807.InterfaceC7809
            /* JADX INFO: renamed from: ۥ۟ */
            public int mo29766(android.view.View r3) {
                    r2 = this;
                    android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                    androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
                    androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r2.f29610
                    int r3 = r1.getDecoratedTop(r3)
                    int r0 = r0.topMargin
                    int r3 = r3 - r0
                    return r3
            }

            @Override // androidx.recyclerview.widget.C7807.InterfaceC7809
            /* JADX INFO: renamed from: ۥ۟۟ */
            public int mo29767() {
                    r1 = this;
                    androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.f29610
                    int r0 = r0.getPaddingTop()
                    return r0
            }

            @Override // androidx.recyclerview.widget.C7807.InterfaceC7809
            /* JADX INFO: renamed from: ۥ۟۟۟ */
            public int mo29768() {
                    r2 = this;
                    androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.f29610
                    int r0 = r0.getHeight()
                    androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r2.f29610
                    int r1 = r1.getPaddingBottom()
                    int r0 = r0 - r1
                    return r0
            }

            @Override // androidx.recyclerview.widget.C7807.InterfaceC7809
            /* JADX INFO: renamed from: ۥ۟۟۟۟ */
            public int mo29769(android.view.View r3) {
                    r2 = this;
                    android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                    androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
                    androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r2.f29610
                    int r3 = r1.getDecoratedBottom(r3)
                    int r0 = r0.bottomMargin
                    int r3 = r3 + r0
                    return r3
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠$ۥ۟۟, reason: contains not printable characters */
        public interface InterfaceC7694 {
            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            void mo29770(int r1, int r2);
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠$ۥ۟۟۟, reason: contains not printable characters */
        public static class C7695 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public int f29611;

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public int f29612;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public boolean f29613;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public boolean f29614;

            public C7695() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        public AbstractC7691() {
                r3 = this;
                r3.<init>()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠$ۥ r0 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠$ۥ
                r0.<init>(r3)
                r3.mHorizontalBoundCheckCallback = r0
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠$ۥ۟ r1 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠$ۥ۟
                r1.<init>(r3)
                r3.mVerticalBoundCheckCallback = r1
                androidx.recyclerview.widget.ۥ۟۟۠ۨ r2 = new androidx.recyclerview.widget.ۥ۟۟۠ۨ
                r2.<init>(r0)
                r3.mHorizontalBoundCheck = r2
                androidx.recyclerview.widget.ۥ۟۟۠ۨ r0 = new androidx.recyclerview.widget.ۥ۟۟۠ۨ
                r0.<init>(r1)
                r3.mVerticalBoundCheck = r0
                r0 = 0
                r3.mRequestedSimpleAnimations = r0
                r3.mIsAttachedToWindow = r0
                r3.mAutoMeasure = r0
                r0 = 1
                r3.mMeasurementCacheEnabled = r0
                r3.mItemPrefetchEnabled = r0
                return
        }

        public static int chooseSize(int r2, int r3, int r4) {
                int r0 = android.view.View.MeasureSpec.getMode(r2)
                int r2 = android.view.View.MeasureSpec.getSize(r2)
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r1) goto L15
                r1 = 1073741824(0x40000000, float:2.0)
                if (r0 == r1) goto L14
                int r2 = java.lang.Math.max(r3, r4)
            L14:
                return r2
            L15:
                int r3 = java.lang.Math.max(r3, r4)
                int r2 = java.lang.Math.min(r2, r3)
                return r2
        }

        public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1d
                if (r7 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r7 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r7 = r5
                goto L30
            L1d:
                if (r7 < 0) goto L20
                goto L10
            L20:
                if (r7 != r1) goto L24
            L22:
                r7 = r4
                goto L30
            L24:
                if (r7 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r7 = r4
                r5 = r6
                goto L30
            L2e:
                r7 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
        }

        @java.lang.Deprecated
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L10
                if (r3 < 0) goto Le
            Lc:
                r2 = r0
                goto L1e
            Le:
                r3 = r2
                goto L1e
            L10:
                if (r3 < 0) goto L13
                goto Lc
            L13:
                r4 = -1
                if (r3 != r4) goto L18
                r3 = r1
                goto Lc
            L18:
                r4 = -2
                if (r3 != r4) goto Le
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1
            L1e:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
        }

        public static androidx.recyclerview.widget.RecyclerView.AbstractC7691.C7695 getProperties(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3, int r4, int r5) {
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠$ۥ۟۟۟ r0 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠$ۥ۟۟۟
                r0.<init>()
                int[] r1 = Yue.C5086.C5096.f18340
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r1, r4, r5)
                int r3 = Yue.C5086.C5096.f18341
                r4 = 1
                int r3 = r2.getInt(r3, r4)
                r0.f29611 = r3
                int r3 = Yue.C5086.C5096.f18351
                int r3 = r2.getInt(r3, r4)
                r0.f29612 = r3
                int r3 = Yue.C5086.C5096.f18350
                r4 = 0
                boolean r3 = r2.getBoolean(r3, r4)
                r0.f29613 = r3
                int r3 = Yue.C5086.C5096.f18352
                boolean r3 = r2.getBoolean(r3, r4)
                r0.f29614 = r3
                r2.recycle()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static boolean m29759(int r3, int r4, int r5) {
                int r0 = android.view.View.MeasureSpec.getMode(r4)
                int r4 = android.view.View.MeasureSpec.getSize(r4)
                r1 = 0
                if (r5 <= 0) goto Le
                if (r3 == r5) goto Le
                return r1
            Le:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = 1
                if (r0 == r5) goto L1f
                if (r0 == 0) goto L1e
                r5 = 1073741824(0x40000000, float:2.0)
                if (r0 == r5) goto L1a
                return r1
            L1a:
                if (r4 != r3) goto L1d
                r1 = r2
            L1d:
                return r1
            L1e:
                return r2
            L1f:
                if (r4 < r3) goto L22
                r1 = r2
            L22:
                return r1
        }

        public void addDisappearingView(android.view.View r2) {
                r1 = this;
                r0 = -1
                r1.addDisappearingView(r2, r0)
                return
        }

        public void addDisappearingView(android.view.View r2, int r3) {
                r1 = this;
                r0 = 1
                r1.m29760(r2, r3, r0)
                return
        }

        public void addView(android.view.View r2) {
                r1 = this;
                r0 = -1
                r1.addView(r2, r0)
                return
        }

        public void addView(android.view.View r2, int r3) {
                r1 = this;
                r0 = 0
                r1.m29760(r2, r3, r0)
                return
        }

        public void assertInLayoutOrScroll(java.lang.String r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L7
                r0.assertInLayoutOrScroll(r2)
            L7:
                return
        }

        public void assertNotInLayoutOrScroll(java.lang.String r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L7
                r0.assertNotInLayoutOrScroll(r2)
            L7:
                return
        }

        public void attachView(@Yue.InterfaceC4410 android.view.View r2) {
                r1 = this;
                r0 = -1
                r1.attachView(r2, r0)
                return
        }

        public void attachView(@Yue.InterfaceC4410 android.view.View r2, int r3) {
                r1 = this;
                android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
                r1.attachView(r2, r3, r0)
                return
        }

        public void attachView(@Yue.InterfaceC4410 android.view.View r3, int r4, androidx.recyclerview.widget.RecyclerView.C7696 r5) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r3)
                boolean r1 = r0.isRemoved()
                if (r1 == 0) goto L12
                androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
                androidx.recyclerview.widget.ۥ۟۟ۡ r1 = r1.mViewInfoStore
                r1.m30336(r0)
                goto L19
            L12:
                androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
                androidx.recyclerview.widget.ۥ۟۟ۡ r1 = r1.mViewInfoStore
                r1.m30350(r0)
            L19:
                androidx.recyclerview.widget.ۥ۟۟۟۟ r1 = r2.mChildHelper
                boolean r0 = r0.isRemoved()
                r1.m30044(r3, r4, r5, r0)
                return
        }

        public void calculateItemDecorationsForChild(@Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 android.graphics.Rect r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 != 0) goto L9
                r2 = 0
                r3.set(r2, r2, r2, r2)
                return
            L9:
                android.graphics.Rect r2 = r0.getItemDecorInsetsForChild(r2)
                r3.set(r2)
                return
        }

        public boolean canScrollHorizontally() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean canScrollVertically() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean checkLayoutParams(androidx.recyclerview.widget.RecyclerView.C7696 r1) {
                r0 = this;
                if (r1 == 0) goto L4
                r1 = 1
                goto L5
            L4:
                r1 = 0
            L5:
                return r1
        }

        public void collectAdjacentPrefetchPositions(int r1, int r2, androidx.recyclerview.widget.RecyclerView.C7713 r3, androidx.recyclerview.widget.RecyclerView.AbstractC7691.InterfaceC7694 r4) {
                r0 = this;
                return
        }

        public void collectInitialPrefetchPositions(int r1, androidx.recyclerview.widget.RecyclerView.AbstractC7691.InterfaceC7694 r2) {
                r0 = this;
                return
        }

        public int computeHorizontalScrollExtent(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int computeHorizontalScrollOffset(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int computeHorizontalScrollRange(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int computeVerticalScrollExtent(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int computeVerticalScrollOffset(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int computeVerticalScrollRange(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void detachAndScrapAttachedViews(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7704 r3) {
                r2 = this;
                int r0 = r2.getChildCount()
                int r0 = r0 + (-1)
            L6:
                if (r0 < 0) goto L12
                android.view.View r1 = r2.getChildAt(r0)
                r2.m29764(r3, r0, r1)
                int r0 = r0 + (-1)
                goto L6
            L12:
                return
        }

        public void detachAndScrapView(@Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7704 r3) {
                r1 = this;
                androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r1.mChildHelper
                int r0 = r0.m30054(r2)
                r1.m29764(r3, r0, r2)
                return
        }

        public void detachAndScrapViewAt(int r2, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7704 r3) {
                r1 = this;
                android.view.View r0 = r1.getChildAt(r2)
                r1.m29764(r3, r2, r0)
                return
        }

        public void detachView(@Yue.InterfaceC4410 android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r1.mChildHelper
                int r0 = r0.m30054(r2)
                if (r0 < 0) goto Lb
                r1.m29761(r0, r2)
            Lb:
                return
        }

        public void detachViewAt(int r2) {
                r1 = this;
                android.view.View r0 = r1.getChildAt(r2)
                r1.m29761(r2, r0)
                return
        }

        public void dispatchAttachedToWindow(androidx.recyclerview.widget.RecyclerView r2) {
                r1 = this;
                r0 = 1
                r1.mIsAttachedToWindow = r0
                r1.onAttachedToWindow(r2)
                return
        }

        public void dispatchDetachedFromWindow(androidx.recyclerview.widget.RecyclerView r2, androidx.recyclerview.widget.RecyclerView.C7704 r3) {
                r1 = this;
                r0 = 0
                r1.mIsAttachedToWindow = r0
                r1.onDetachedFromWindow(r2, r3)
                return
        }

        public void endAnimation(android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r0 = r0.mItemAnimator
                if (r0 == 0) goto Ld
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r2)
                r0.mo29736(r2)
            Ld:
                return
        }

        @Yue.InterfaceC4544
        public android.view.View findContainingItemView(@Yue.InterfaceC4410 android.view.View r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                android.view.View r3 = r0.findContainingItemView(r3)
                if (r3 != 0) goto Ld
                return r1
            Ld:
                androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r2.mChildHelper
                boolean r0 = r0.m30055(r3)
                if (r0 == 0) goto L16
                return r1
            L16:
                return r3
        }

        @Yue.InterfaceC4544
        public android.view.View findViewByPosition(int r6) {
                r5 = this;
                int r0 = r5.getChildCount()
                r1 = 0
            L5:
                if (r1 >= r0) goto L32
                android.view.View r2 = r5.getChildAt(r1)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r2)
                if (r3 != 0) goto L12
                goto L2f
            L12:
                int r4 = r3.getLayoutPosition()
                if (r4 != r6) goto L2f
                boolean r4 = r3.shouldIgnore()
                if (r4 != 0) goto L2f
                androidx.recyclerview.widget.RecyclerView r4 = r5.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r4 = r4.mState
                boolean r4 = r4.m29864()
                if (r4 != 0) goto L2e
                boolean r3 = r3.isRemoved()
                if (r3 != 0) goto L2f
            L2e:
                return r2
            L2f:
                int r1 = r1 + 1
                goto L5
            L32:
                r6 = 0
                return r6
        }

        public abstract androidx.recyclerview.widget.RecyclerView.C7696 generateDefaultLayoutParams();

        public androidx.recyclerview.widget.RecyclerView.C7696 generateLayoutParams(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟
                r0.<init>(r2, r3)
                return r0
        }

        public androidx.recyclerview.widget.RecyclerView.C7696 generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
                r1 = this;
                boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerView.C7696
                if (r0 == 0) goto Lc
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r2 = (androidx.recyclerview.widget.RecyclerView.C7696) r2
                r0.<init>(r2)
                return r0
            Lc:
                boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r0 == 0) goto L18
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟
                android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
                r0.<init>(r2)
                return r0
            L18:
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟
                r0.<init>(r2)
                return r0
        }

        public int getBaseline() {
                r1 = this;
                r0 = -1
                return r0
        }

        public int getBottomDecorationHeight(@Yue.InterfaceC4410 android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r1 = (androidx.recyclerview.widget.RecyclerView.C7696) r1
                android.graphics.Rect r1 = r1.f29616
                int r1 = r1.bottom
                return r1
        }

        @Yue.InterfaceC4544
        public android.view.View getChildAt(int r2) {
                r1 = this;
                androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r1.mChildHelper
                if (r0 == 0) goto L9
                android.view.View r2 = r0.m30047(r2)
                goto La
            L9:
                r2 = 0
            La:
                return r2
        }

        public int getChildCount() {
                r1 = this;
                androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r1.mChildHelper
                if (r0 == 0) goto L9
                int r0 = r0.m30048()
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        public boolean getClipToPadding() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto La
                boolean r0 = r0.mClipToPadding
                if (r0 == 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        public int getColumnCountForAccessibility(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7704 r1, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r2) {
                r0 = this;
                androidx.recyclerview.widget.RecyclerView r1 = r0.mRecyclerView
                r2 = 1
                if (r1 == 0) goto L18
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r1 = r1.mAdapter
                if (r1 != 0) goto La
                goto L18
            La:
                boolean r1 = r0.canScrollHorizontally()
                if (r1 == 0) goto L18
                androidx.recyclerview.widget.RecyclerView r1 = r0.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r1 = r1.mAdapter
                int r2 = r1.getItemCount()
            L18:
                return r2
        }

        public int getDecoratedBottom(@Yue.InterfaceC4410 android.view.View r2) {
                r1 = this;
                int r0 = r2.getBottom()
                int r2 = r1.getBottomDecorationHeight(r2)
                int r0 = r0 + r2
                return r0
        }

        public void getDecoratedBoundsWithMargins(@Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4410 android.graphics.Rect r2) {
                r0 = this;
                androidx.recyclerview.widget.RecyclerView.getDecoratedBoundsWithMarginsInt(r1, r2)
                return
        }

        public int getDecoratedLeft(@Yue.InterfaceC4410 android.view.View r2) {
                r1 = this;
                int r0 = r2.getLeft()
                int r2 = r1.getLeftDecorationWidth(r2)
                int r0 = r0 - r2
                return r0
        }

        public int getDecoratedMeasuredHeight(@Yue.InterfaceC4410 android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
                android.graphics.Rect r0 = r0.f29616
                int r3 = r3.getMeasuredHeight()
                int r1 = r0.top
                int r3 = r3 + r1
                int r0 = r0.bottom
                int r3 = r3 + r0
                return r3
        }

        public int getDecoratedMeasuredWidth(@Yue.InterfaceC4410 android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
                android.graphics.Rect r0 = r0.f29616
                int r3 = r3.getMeasuredWidth()
                int r1 = r0.left
                int r3 = r3 + r1
                int r0 = r0.right
                int r3 = r3 + r0
                return r3
        }

        public int getDecoratedRight(@Yue.InterfaceC4410 android.view.View r2) {
                r1 = this;
                int r0 = r2.getRight()
                int r2 = r1.getRightDecorationWidth(r2)
                int r0 = r0 + r2
                return r0
        }

        public int getDecoratedTop(@Yue.InterfaceC4410 android.view.View r2) {
                r1 = this;
                int r0 = r2.getTop()
                int r2 = r1.getTopDecorationHeight(r2)
                int r0 = r0 - r2
                return r0
        }

        @Yue.InterfaceC4544
        public android.view.View getFocusedChild() {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r3.mRecyclerView
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                android.view.View r0 = r0.getFocusedChild()
                if (r0 == 0) goto L16
                androidx.recyclerview.widget.ۥ۟۟۟۟ r2 = r3.mChildHelper
                boolean r2 = r2.m30055(r0)
                if (r2 == 0) goto L15
                goto L16
            L15:
                return r0
            L16:
                return r1
        }

        @Yue.InterfaceC4992
        public int getHeight() {
                r1 = this;
                int r0 = r1.mHeight
                return r0
        }

        public int getHeightMode() {
                r1 = this;
                int r0 = r1.mHeightMode
                return r0
        }

        public int getItemCount() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r0.getAdapter()
                goto La
            L9:
                r0 = 0
            La:
                if (r0 == 0) goto L11
                int r0 = r0.getItemCount()
                goto L12
            L11:
                r0 = 0
            L12:
                return r0
        }

        public int getItemViewType(@Yue.InterfaceC4410 android.view.View r1) {
                r0 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r1 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r1)
                int r1 = r1.getItemViewType()
                return r1
        }

        public int getLayoutDirection() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                int r0 = Yue.C6794.m26140(r0)
                return r0
        }

        public int getLeftDecorationWidth(@Yue.InterfaceC4410 android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r1 = (androidx.recyclerview.widget.RecyclerView.C7696) r1
                android.graphics.Rect r1 = r1.f29616
                int r1 = r1.left
                return r1
        }

        @Yue.InterfaceC4992
        public int getMinimumHeight() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                int r0 = Yue.C6794.m26145(r0)
                return r0
        }

        @Yue.InterfaceC4992
        public int getMinimumWidth() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                int r0 = Yue.C6794.m26146(r0)
                return r0
        }

        @Yue.InterfaceC4992
        public int getPaddingBottom() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                int r0 = r0.getPaddingBottom()
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Yue.InterfaceC4992
        public int getPaddingEnd() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                int r0 = Yue.C6794.m26150(r0)
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Yue.InterfaceC4992
        public int getPaddingLeft() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                int r0 = r0.getPaddingLeft()
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Yue.InterfaceC4992
        public int getPaddingRight() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                int r0 = r0.getPaddingRight()
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Yue.InterfaceC4992
        public int getPaddingStart() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                int r0 = Yue.C6794.m26151(r0)
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Yue.InterfaceC4992
        public int getPaddingTop() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                int r0 = r0.getPaddingTop()
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        public int getPosition(@Yue.InterfaceC4410 android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r1 = (androidx.recyclerview.widget.RecyclerView.C7696) r1
                int r1 = r1.m29772()
                return r1
        }

        public int getRightDecorationWidth(@Yue.InterfaceC4410 android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r1 = (androidx.recyclerview.widget.RecyclerView.C7696) r1
                android.graphics.Rect r1 = r1.f29616
                int r1 = r1.right
                return r1
        }

        public int getRowCountForAccessibility(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7704 r1, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r2) {
                r0 = this;
                androidx.recyclerview.widget.RecyclerView r1 = r0.mRecyclerView
                r2 = 1
                if (r1 == 0) goto L18
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r1 = r1.mAdapter
                if (r1 != 0) goto La
                goto L18
            La:
                boolean r1 = r0.canScrollVertically()
                if (r1 == 0) goto L18
                androidx.recyclerview.widget.RecyclerView r1 = r0.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r1 = r1.mAdapter
                int r2 = r1.getItemCount()
            L18:
                return r2
        }

        public int getSelectionModeForAccessibility(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7704 r1, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int getTopDecorationHeight(@Yue.InterfaceC4410 android.view.View r1) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r1 = (androidx.recyclerview.widget.RecyclerView.C7696) r1
                android.graphics.Rect r1 = r1.f29616
                int r1 = r1.top
                return r1
        }

        public void getTransformedBoundingBox(@Yue.InterfaceC4410 android.view.View r6, boolean r7, @Yue.InterfaceC4410 android.graphics.Rect r8) {
                r5 = this;
                if (r7 == 0) goto L22
                android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r7 = (androidx.recyclerview.widget.RecyclerView.C7696) r7
                android.graphics.Rect r7 = r7.f29616
                int r0 = r7.left
                int r0 = -r0
                int r1 = r7.top
                int r1 = -r1
                int r2 = r6.getWidth()
                int r3 = r7.right
                int r2 = r2 + r3
                int r3 = r6.getHeight()
                int r7 = r7.bottom
                int r3 = r3 + r7
                r8.set(r0, r1, r2, r3)
                goto L2e
            L22:
                int r7 = r6.getWidth()
                int r0 = r6.getHeight()
                r1 = 0
                r8.set(r1, r1, r7, r0)
            L2e:
                androidx.recyclerview.widget.RecyclerView r7 = r5.mRecyclerView
                if (r7 == 0) goto L6b
                android.graphics.Matrix r7 = r6.getMatrix()
                if (r7 == 0) goto L6b
                boolean r0 = r7.isIdentity()
                if (r0 != 0) goto L6b
                androidx.recyclerview.widget.RecyclerView r0 = r5.mRecyclerView
                android.graphics.RectF r0 = r0.mTempRectF
                r0.set(r8)
                r7.mapRect(r0)
                float r7 = r0.left
                double r1 = (double) r7
                double r1 = java.lang.Math.floor(r1)
                int r7 = (int) r1
                float r1 = r0.top
                double r1 = (double) r1
                double r1 = java.lang.Math.floor(r1)
                int r1 = (int) r1
                float r2 = r0.right
                double r2 = (double) r2
                double r2 = java.lang.Math.ceil(r2)
                int r2 = (int) r2
                float r0 = r0.bottom
                double r3 = (double) r0
                double r3 = java.lang.Math.ceil(r3)
                int r0 = (int) r3
                r8.set(r7, r1, r2, r0)
            L6b:
                int r7 = r6.getLeft()
                int r6 = r6.getTop()
                r8.offset(r7, r6)
                return
        }

        @Yue.InterfaceC4992
        public int getWidth() {
                r1 = this;
                int r0 = r1.mWidth
                return r0
        }

        public int getWidthMode() {
                r1 = this;
                int r0 = r1.mWidthMode
                return r0
        }

        public boolean hasFlexibleChildInBothOrientations() {
                r5 = this;
                int r0 = r5.getChildCount()
                r1 = 0
                r2 = r1
            L6:
                if (r2 >= r0) goto L1d
                android.view.View r3 = r5.getChildAt(r2)
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                int r4 = r3.width
                if (r4 >= 0) goto L1a
                int r3 = r3.height
                if (r3 >= 0) goto L1a
                r0 = 1
                return r0
            L1a:
                int r2 = r2 + 1
                goto L6
            L1d:
                return r1
        }

        public boolean hasFocus() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto Lc
                boolean r0 = r0.hasFocus()
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        public void ignoreView(@Yue.InterfaceC4410 android.view.View r3) {
                r2 = this;
                android.view.ViewParent r0 = r3.getParent()
                androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
                if (r0 != r1) goto L20
                int r0 = r1.indexOfChild(r3)
                r1 = -1
                if (r0 == r1) goto L20
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r3)
                r0 = 128(0x80, float:1.8E-43)
                r3.addFlags(r0)
                androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
                androidx.recyclerview.widget.ۥ۟۟ۡ r0 = r0.mViewInfoStore
                r0.m30351(r3)
                return
            L20:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "View should be fully attached to be ignored"
                r0.append(r1)
                androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
                java.lang.String r1 = r1.exceptionLabel()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        public boolean isAttachedToWindow() {
                r1 = this;
                boolean r0 = r1.mIsAttachedToWindow
                return r0
        }

        public boolean isAutoMeasureEnabled() {
                r1 = this;
                boolean r0 = r1.mAutoMeasure
                return r0
        }

        public boolean isFocused() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto Lc
                boolean r0 = r0.isFocused()
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        public final boolean isItemPrefetchEnabled() {
                r1 = this;
                boolean r0 = r1.mItemPrefetchEnabled
                return r0
        }

        public boolean isLayoutHierarchical(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7704 r1, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean isMeasurementCacheEnabled() {
                r1 = this;
                boolean r0 = r1.mMeasurementCacheEnabled
                return r0
        }

        public boolean isSmoothScrolling() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠ r0 = r1.mSmoothScroller
                if (r0 == 0) goto Lc
                boolean r0 = r0.isRunning()
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        public boolean isViewPartiallyVisible(@Yue.InterfaceC4410 android.view.View r3, boolean r4, boolean r5) {
                r2 = this;
                androidx.recyclerview.widget.ۥ۟۟۠ۨ r5 = r2.mHorizontalBoundCheck
                r0 = 24579(0x6003, float:3.4443E-41)
                boolean r5 = r5.m30329(r3, r0)
                r1 = 1
                if (r5 == 0) goto L15
                androidx.recyclerview.widget.ۥ۟۟۠ۨ r5 = r2.mVerticalBoundCheck
                boolean r3 = r5.m30329(r3, r0)
                if (r3 == 0) goto L15
                r3 = r1
                goto L16
            L15:
                r3 = 0
            L16:
                if (r4 == 0) goto L19
                return r3
            L19:
                r3 = r3 ^ r1
                return r3
        }

        public void layoutDecorated(@Yue.InterfaceC4410 android.view.View r3, int r4, int r5, int r6, int r7) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
                android.graphics.Rect r0 = r0.f29616
                int r1 = r0.left
                int r4 = r4 + r1
                int r1 = r0.top
                int r5 = r5 + r1
                int r1 = r0.right
                int r6 = r6 - r1
                int r0 = r0.bottom
                int r7 = r7 - r0
                r3.layout(r4, r5, r6, r7)
                return
        }

        public void layoutDecoratedWithMargins(@Yue.InterfaceC4410 android.view.View r4, int r5, int r6, int r7, int r8) {
                r3 = this;
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
                android.graphics.Rect r1 = r0.f29616
                int r2 = r1.left
                int r5 = r5 + r2
                int r2 = r0.leftMargin
                int r5 = r5 + r2
                int r2 = r1.top
                int r6 = r6 + r2
                int r2 = r0.topMargin
                int r6 = r6 + r2
                int r2 = r1.right
                int r7 = r7 - r2
                int r2 = r0.rightMargin
                int r7 = r7 - r2
                int r1 = r1.bottom
                int r8 = r8 - r1
                int r0 = r0.bottomMargin
                int r8 = r8 - r0
                r4.layout(r5, r6, r7, r8)
                return
        }

        public void measureChild(@Yue.InterfaceC4410 android.view.View r6, int r7, int r8) {
                r5 = this;
                android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
                androidx.recyclerview.widget.RecyclerView r1 = r5.mRecyclerView
                android.graphics.Rect r1 = r1.getItemDecorInsetsForChild(r6)
                int r2 = r1.left
                int r3 = r1.right
                int r2 = r2 + r3
                int r7 = r7 + r2
                int r2 = r1.top
                int r1 = r1.bottom
                int r2 = r2 + r1
                int r8 = r8 + r2
                int r1 = r5.getWidth()
                int r2 = r5.getWidthMode()
                int r3 = r5.getPaddingLeft()
                int r4 = r5.getPaddingRight()
                int r3 = r3 + r4
                int r3 = r3 + r7
                int r7 = r0.width
                boolean r4 = r5.canScrollHorizontally()
                int r7 = getChildMeasureSpec(r1, r2, r3, r7, r4)
                int r1 = r5.getHeight()
                int r2 = r5.getHeightMode()
                int r3 = r5.getPaddingTop()
                int r4 = r5.getPaddingBottom()
                int r3 = r3 + r4
                int r3 = r3 + r8
                int r8 = r0.height
                boolean r4 = r5.canScrollVertically()
                int r8 = getChildMeasureSpec(r1, r2, r3, r8, r4)
                boolean r0 = r5.shouldMeasureChild(r6, r7, r8, r0)
                if (r0 == 0) goto L59
                r6.measure(r7, r8)
            L59:
                return
        }

        public void measureChildWithMargins(@Yue.InterfaceC4410 android.view.View r6, int r7, int r8) {
                r5 = this;
                android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
                androidx.recyclerview.widget.RecyclerView r1 = r5.mRecyclerView
                android.graphics.Rect r1 = r1.getItemDecorInsetsForChild(r6)
                int r2 = r1.left
                int r3 = r1.right
                int r2 = r2 + r3
                int r7 = r7 + r2
                int r2 = r1.top
                int r1 = r1.bottom
                int r2 = r2 + r1
                int r8 = r8 + r2
                int r1 = r5.getWidth()
                int r2 = r5.getWidthMode()
                int r3 = r5.getPaddingLeft()
                int r4 = r5.getPaddingRight()
                int r3 = r3 + r4
                int r4 = r0.leftMargin
                int r3 = r3 + r4
                int r4 = r0.rightMargin
                int r3 = r3 + r4
                int r3 = r3 + r7
                int r7 = r0.width
                boolean r4 = r5.canScrollHorizontally()
                int r7 = getChildMeasureSpec(r1, r2, r3, r7, r4)
                int r1 = r5.getHeight()
                int r2 = r5.getHeightMode()
                int r3 = r5.getPaddingTop()
                int r4 = r5.getPaddingBottom()
                int r3 = r3 + r4
                int r4 = r0.topMargin
                int r3 = r3 + r4
                int r4 = r0.bottomMargin
                int r3 = r3 + r4
                int r3 = r3 + r8
                int r8 = r0.height
                boolean r4 = r5.canScrollVertically()
                int r8 = getChildMeasureSpec(r1, r2, r3, r8, r4)
                boolean r0 = r5.shouldMeasureChild(r6, r7, r8, r0)
                if (r0 == 0) goto L65
                r6.measure(r7, r8)
            L65:
                return
        }

        public void moveView(int r3, int r4) {
                r2 = this;
                android.view.View r0 = r2.getChildAt(r3)
                if (r0 == 0) goto Ld
                r2.detachViewAt(r3)
                r2.attachView(r0, r4)
                return
            Ld:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot move a child from non-existing index:"
                r0.append(r1)
                r0.append(r3)
                androidx.recyclerview.widget.RecyclerView r3 = r2.mRecyclerView
                java.lang.String r3 = r3.toString()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4.<init>(r3)
                throw r4
        }

        public void offsetChildrenHorizontal(@Yue.InterfaceC4992 int r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L7
                r0.offsetChildrenHorizontal(r2)
            L7:
                return
        }

        public void offsetChildrenVertical(@Yue.InterfaceC4992 int r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L7
                r0.offsetChildrenVertical(r2)
            L7:
                return
        }

        public void onAdapterChanged(@Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7678 r1, @Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7678 r2) {
                r0 = this;
                return
        }

        public boolean onAddFocusables(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r1, @Yue.InterfaceC4410 java.util.ArrayList<android.view.View> r2, int r3, int r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Yue.InterfaceC0907
        public void onAttachedToWindow(androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                return
        }

        @java.lang.Deprecated
        public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                return
        }

        @Yue.InterfaceC0907
        public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.C7704 r2) {
                r0 = this;
                r0.onDetachedFromWindow(r1)
                return
        }

        @Yue.InterfaceC4544
        public android.view.View onFocusSearchFailed(@Yue.InterfaceC4410 android.view.View r1, int r2, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7704 r3, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void onInitializeAccessibilityEvent(@Yue.InterfaceC4410 android.view.accessibility.AccessibilityEvent r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r1 = r0.mRecycler
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r0.mState
                r2.onInitializeAccessibilityEvent(r1, r0, r3)
                return
        }

        public void onInitializeAccessibilityEvent(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7704 r2, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r3, @Yue.InterfaceC4410 android.view.accessibility.AccessibilityEvent r4) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r2 = r1.mRecyclerView
                if (r2 == 0) goto L39
                if (r4 != 0) goto L7
                goto L39
            L7:
                r3 = 1
                boolean r2 = r2.canScrollVertically(r3)
                if (r2 != 0) goto L29
                androidx.recyclerview.widget.RecyclerView r2 = r1.mRecyclerView
                r0 = -1
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 != 0) goto L29
                androidx.recyclerview.widget.RecyclerView r2 = r1.mRecyclerView
                boolean r2 = r2.canScrollHorizontally(r0)
                if (r2 != 0) goto L29
                androidx.recyclerview.widget.RecyclerView r2 = r1.mRecyclerView
                boolean r2 = r2.canScrollHorizontally(r3)
                if (r2 == 0) goto L28
                goto L29
            L28:
                r3 = 0
            L29:
                r4.setScrollable(r3)
                androidx.recyclerview.widget.RecyclerView r2 = r1.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r2 = r2.mAdapter
                if (r2 == 0) goto L39
                int r2 = r2.getItemCount()
                r4.setItemCount(r2)
            L39:
                return
        }

        public void onInitializeAccessibilityNodeInfo(Yue.C0140 r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r1 = r0.mRecycler
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r0.mState
                r2.onInitializeAccessibilityNodeInfo(r1, r0, r3)
                return
        }

        public void onInitializeAccessibilityNodeInfo(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7704 r4, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r5, @Yue.InterfaceC4410 Yue.C0140 r6) {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r3.mRecyclerView
                r1 = -1
                boolean r0 = r0.canScrollVertically(r1)
                r2 = 1
                if (r0 != 0) goto L12
                androidx.recyclerview.widget.RecyclerView r0 = r3.mRecyclerView
                boolean r0 = r0.canScrollHorizontally(r1)
                if (r0 == 0) goto L1a
            L12:
                r0 = 8192(0x2000, float:1.148E-41)
                r6.m626(r0)
                r6.m773(r2)
            L1a:
                androidx.recyclerview.widget.RecyclerView r0 = r3.mRecyclerView
                boolean r0 = r0.canScrollVertically(r2)
                if (r0 != 0) goto L2a
                androidx.recyclerview.widget.RecyclerView r0 = r3.mRecyclerView
                boolean r0 = r0.canScrollHorizontally(r2)
                if (r0 == 0) goto L32
            L2a:
                r0 = 4096(0x1000, float:5.74E-42)
                r6.m626(r0)
                r6.m773(r2)
            L32:
                int r0 = r3.getRowCountForAccessibility(r4, r5)
                int r1 = r3.getColumnCountForAccessibility(r4, r5)
                boolean r2 = r3.isLayoutHierarchical(r4, r5)
                int r4 = r3.getSelectionModeForAccessibility(r4, r5)
                Yue.ۥ۟۟ۥۧ$ۥ۟۟۟۠ r4 = Yue.C0140.C0146.m824(r0, r1, r2, r4)
                r6.m735(r4)
                return
        }

        public void onInitializeAccessibilityNodeInfoForItem(android.view.View r3, Yue.C0140 r4) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r3)
                if (r0 == 0) goto L1f
                boolean r1 = r0.isRemoved()
                if (r1 != 0) goto L1f
                androidx.recyclerview.widget.ۥ۟۟۟۟ r1 = r2.mChildHelper
                android.view.View r0 = r0.itemView
                boolean r0 = r1.m30055(r0)
                if (r0 != 0) goto L1f
                androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r1 = r0.mRecycler
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r0.mState
                r2.onInitializeAccessibilityNodeInfoForItem(r1, r0, r3, r4)
            L1f:
                return
        }

        public void onInitializeAccessibilityNodeInfoForItem(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7704 r7, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r8, @Yue.InterfaceC4410 android.view.View r9, @Yue.InterfaceC4410 Yue.C0140 r10) {
                r6 = this;
                boolean r7 = r6.canScrollVertically()
                r8 = 0
                if (r7 == 0) goto Ld
                int r7 = r6.getPosition(r9)
                r0 = r7
                goto Le
            Ld:
                r0 = r8
            Le:
                boolean r7 = r6.canScrollHorizontally()
                if (r7 == 0) goto L18
                int r8 = r6.getPosition(r9)
            L18:
                r2 = r8
                r4 = 0
                r5 = 0
                r1 = 1
                r3 = 1
                Yue.ۥ۟۟ۥۧ$ۥ۟۟۟ۡ r7 = Yue.C0140.C0147.m830(r0, r1, r2, r3, r4, r5)
                r10.m736(r7)
                return
        }

        @Yue.InterfaceC4544
        public android.view.View onInterceptFocusSearch(@Yue.InterfaceC4410 android.view.View r1, int r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void onItemsAdded(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
                r0 = this;
                return
        }

        public void onItemsChanged(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                return
        }

        public void onItemsMoved(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        public void onItemsRemoved(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
                r0 = this;
                return
        }

        public void onItemsUpdated(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
                r0 = this;
                return
        }

        public void onItemsUpdated(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r1, int r2, int r3, @Yue.InterfaceC4544 java.lang.Object r4) {
                r0 = this;
                r0.onItemsUpdated(r1, r2, r3)
                return
        }

        public void onLayoutChildren(androidx.recyclerview.widget.RecyclerView.C7704 r1, androidx.recyclerview.widget.RecyclerView.C7713 r2) {
                r0 = this;
                java.lang.String r1 = "RecyclerView"
                java.lang.String r2 = "You must override onLayoutChildren(Recycler recycler, State state) "
                android.util.Log.e(r1, r2)
                return
        }

        public void onLayoutCompleted(androidx.recyclerview.widget.RecyclerView.C7713 r1) {
                r0 = this;
                return
        }

        public void onMeasure(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7704 r1, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r2, int r3, int r4) {
                r0 = this;
                androidx.recyclerview.widget.RecyclerView r1 = r0.mRecyclerView
                r1.defaultOnMeasure(r3, r4)
                return
        }

        @java.lang.Deprecated
        public boolean onRequestChildFocus(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r1, @Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4544 android.view.View r3) {
                r0 = this;
                boolean r2 = r0.isSmoothScrolling()
                if (r2 != 0) goto Lf
                boolean r1 = r1.isComputingLayout()
                if (r1 == 0) goto Ld
                goto Lf
            Ld:
                r1 = 0
                goto L10
            Lf:
                r1 = 1
            L10:
                return r1
        }

        public boolean onRequestChildFocus(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r1, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r2, @Yue.InterfaceC4410 android.view.View r3, @Yue.InterfaceC4544 android.view.View r4) {
                r0 = this;
                boolean r1 = r0.onRequestChildFocus(r1, r3, r4)
                return r1
        }

        public void onRestoreInstanceState(android.os.Parcelable r1) {
                r0 = this;
                return
        }

        @Yue.InterfaceC4544
        public android.os.Parcelable onSaveInstanceState() {
                r1 = this;
                r0 = 0
                return r0
        }

        public void onScrollStateChanged(int r1) {
                r0 = this;
                return
        }

        public void onSmoothScrollerStopped(androidx.recyclerview.widget.RecyclerView.AbstractC7710 r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠ r0 = r1.mSmoothScroller
                if (r0 != r2) goto L7
                r2 = 0
                r1.mSmoothScroller = r2
            L7:
                return
        }

        public boolean performAccessibilityAction(int r3, @Yue.InterfaceC4544 android.os.Bundle r4) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r1 = r0.mRecycler
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r0.mState
                boolean r3 = r2.performAccessibilityAction(r1, r0, r3, r4)
                return r3
        }

        public boolean performAccessibilityAction(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7704 r8, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r9, int r10, @Yue.InterfaceC4544 android.os.Bundle r11) {
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.mRecyclerView
                r9 = 0
                if (r8 != 0) goto L6
                return r9
            L6:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L47
                r11 = 8192(0x2000, float:1.148E-41)
                if (r10 == r11) goto L12
                r2 = r9
                r3 = r2
                goto L74
            L12:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L29
                int r8 = r7.getHeight()
                int r11 = r7.getPaddingTop()
                int r8 = r8 - r11
                int r11 = r7.getPaddingBottom()
                int r8 = r8 - r11
                int r8 = -r8
                goto L2a
            L29:
                r8 = r9
            L2a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.mRecyclerView
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L44
                int r10 = r7.getWidth()
                int r11 = r7.getPaddingLeft()
                int r10 = r10 - r11
                int r11 = r7.getPaddingRight()
                int r10 = r10 - r11
                int r10 = -r10
            L41:
                r3 = r8
                r2 = r10
                goto L74
            L44:
                r3 = r8
                r2 = r9
                goto L74
            L47:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L5c
                int r8 = r7.getHeight()
                int r10 = r7.getPaddingTop()
                int r8 = r8 - r10
                int r10 = r7.getPaddingBottom()
                int r8 = r8 - r10
                goto L5d
            L5c:
                r8 = r9
            L5d:
                androidx.recyclerview.widget.RecyclerView r10 = r7.mRecyclerView
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L44
                int r10 = r7.getWidth()
                int r11 = r7.getPaddingLeft()
                int r10 = r10 - r11
                int r11 = r7.getPaddingRight()
                int r10 = r10 - r11
                goto L41
            L74:
                if (r3 != 0) goto L79
                if (r2 != 0) goto L79
                return r9
            L79:
                androidx.recyclerview.widget.RecyclerView r1 = r7.mRecyclerView
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r4 = 0
                r1.smoothScrollBy(r2, r3, r4, r5, r6)
                return r0
        }

        public boolean performAccessibilityActionForItem(@Yue.InterfaceC4410 android.view.View r8, int r9, @Yue.InterfaceC4544 android.os.Bundle r10) {
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r7.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r2 = r0.mRecycler
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r3 = r0.mState
                r1 = r7
                r4 = r8
                r5 = r9
                r6 = r10
                boolean r8 = r1.performAccessibilityActionForItem(r2, r3, r4, r5, r6)
                return r8
        }

        public boolean performAccessibilityActionForItem(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7704 r1, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r2, @Yue.InterfaceC4410 android.view.View r3, int r4, @Yue.InterfaceC4544 android.os.Bundle r5) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void postOnAnimation(java.lang.Runnable r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L7
                Yue.C6794.m26211(r0, r2)
            L7:
                return
        }

        public void removeAllViews() {
                r2 = this;
                int r0 = r2.getChildCount()
                int r0 = r0 + (-1)
            L6:
                if (r0 < 0) goto L10
                androidx.recyclerview.widget.ۥ۟۟۟۟ r1 = r2.mChildHelper
                r1.m30058(r0)
                int r0 = r0 + (-1)
                goto L6
            L10:
                return
        }

        public void removeAndRecycleAllViews(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7704 r3) {
                r2 = this;
                int r0 = r2.getChildCount()
                int r0 = r0 + (-1)
            L6:
                if (r0 < 0) goto L1c
                android.view.View r1 = r2.getChildAt(r0)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r1 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r1)
                boolean r1 = r1.shouldIgnore()
                if (r1 != 0) goto L19
                r2.removeAndRecycleViewAt(r0, r3)
            L19:
                int r0 = r0 + (-1)
                goto L6
            L1c:
                return
        }

        public void removeAndRecycleScrapInt(androidx.recyclerview.widget.RecyclerView.C7704 r7) {
                r6 = this;
                int r0 = r7.m29806()
                int r1 = r0 + (-1)
            L6:
                if (r1 < 0) goto L39
                android.view.View r2 = r7.m29810(r1)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r2)
                boolean r4 = r3.shouldIgnore()
                if (r4 == 0) goto L17
                goto L36
            L17:
                r4 = 0
                r3.setIsRecyclable(r4)
                boolean r5 = r3.isTmpDetached()
                if (r5 == 0) goto L26
                androidx.recyclerview.widget.RecyclerView r5 = r6.mRecyclerView
                r5.removeDetachedView(r2, r4)
            L26:
                androidx.recyclerview.widget.RecyclerView r4 = r6.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r4 = r4.mItemAnimator
                if (r4 == 0) goto L2f
                r4.mo29736(r3)
            L2f:
                r4 = 1
                r3.setIsRecyclable(r4)
                r7.m29821(r2)
            L36:
                int r1 = r1 + (-1)
                goto L6
            L39:
                r7.m29801()
                if (r0 <= 0) goto L43
                androidx.recyclerview.widget.RecyclerView r7 = r6.mRecyclerView
                r7.invalidate()
            L43:
                return
        }

        public void removeAndRecycleView(@Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7704 r2) {
                r0 = this;
                r0.removeView(r1)
                r2.m29824(r1)
                return
        }

        public void removeAndRecycleViewAt(int r2, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7704 r3) {
                r1 = this;
                android.view.View r0 = r1.getChildAt(r2)
                r1.removeViewAt(r2)
                r3.m29824(r0)
                return
        }

        public boolean removeCallbacks(java.lang.Runnable r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L9
                boolean r2 = r0.removeCallbacks(r2)
                return r2
            L9:
                r2 = 0
                return r2
        }

        public void removeDetachedView(@Yue.InterfaceC4410 android.view.View r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
                r1 = 0
                r0.removeDetachedView(r3, r1)
                return
        }

        public void removeView(android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r1.mChildHelper
                r0.m30057(r2)
                return
        }

        public void removeViewAt(int r2) {
                r1 = this;
                android.view.View r0 = r1.getChildAt(r2)
                if (r0 == 0) goto Lb
                androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r1.mChildHelper
                r0.m30058(r2)
            Lb:
                return
        }

        public boolean requestChildRectangleOnScreen(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r7, @Yue.InterfaceC4410 android.view.View r8, @Yue.InterfaceC4410 android.graphics.Rect r9, boolean r10) {
                r6 = this;
                r5 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                boolean r7 = r0.requestChildRectangleOnScreen(r1, r2, r3, r4, r5)
                return r7
        }

        public boolean requestChildRectangleOnScreen(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r3, @Yue.InterfaceC4410 android.view.View r4, @Yue.InterfaceC4410 android.graphics.Rect r5, boolean r6, boolean r7) {
                r2 = this;
                int[] r4 = r2.m29762(r4, r5)
                r5 = 0
                r0 = r4[r5]
                r1 = 1
                r4 = r4[r1]
                if (r7 == 0) goto L12
                boolean r7 = r2.m29763(r3, r0, r4)
                if (r7 == 0) goto L17
            L12:
                if (r0 != 0) goto L18
                if (r4 == 0) goto L17
                goto L18
            L17:
                return r5
            L18:
                if (r6 == 0) goto L1e
                r3.scrollBy(r0, r4)
                goto L21
            L1e:
                r3.smoothScrollBy(r0, r4)
            L21:
                return r1
        }

        public void requestLayout() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                if (r0 == 0) goto L7
                r0.requestLayout()
            L7:
                return
        }

        public void requestSimpleAnimationsInNextLayout() {
                r1 = this;
                r0 = 1
                r1.mRequestedSimpleAnimations = r0
                return
        }

        public int scrollHorizontallyBy(int r1, androidx.recyclerview.widget.RecyclerView.C7704 r2, androidx.recyclerview.widget.RecyclerView.C7713 r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void scrollToPosition(int r1) {
                r0 = this;
                return
        }

        public int scrollVerticallyBy(int r1, androidx.recyclerview.widget.RecyclerView.C7704 r2, androidx.recyclerview.widget.RecyclerView.C7713 r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @java.lang.Deprecated
        public void setAutoMeasureEnabled(boolean r1) {
                r0 = this;
                r0.mAutoMeasure = r1
                return
        }

        public void setExactMeasureSpecsFrom(androidx.recyclerview.widget.RecyclerView r3) {
                r2 = this;
                int r0 = r3.getWidth()
                r1 = 1073741824(0x40000000, float:2.0)
                int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
                int r3 = r3.getHeight()
                int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r1)
                r2.setMeasureSpecs(r0, r3)
                return
        }

        public final void setItemPrefetchEnabled(boolean r2) {
                r1 = this;
                boolean r0 = r1.mItemPrefetchEnabled
                if (r2 == r0) goto L12
                r1.mItemPrefetchEnabled = r2
                r2 = 0
                r1.mPrefetchMaxCountObserved = r2
                androidx.recyclerview.widget.RecyclerView r2 = r1.mRecyclerView
                if (r2 == 0) goto L12
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r2 = r2.mRecycler
                r2.m29833()
            L12:
                return
        }

        public void setMeasureSpecs(int r2, int r3) {
                r1 = this;
                int r0 = android.view.View.MeasureSpec.getSize(r2)
                r1.mWidth = r0
                int r2 = android.view.View.MeasureSpec.getMode(r2)
                r1.mWidthMode = r2
                r0 = 0
                if (r2 != 0) goto L15
                boolean r2 = androidx.recyclerview.widget.RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC
                if (r2 != 0) goto L15
                r1.mWidth = r0
            L15:
                int r2 = android.view.View.MeasureSpec.getSize(r3)
                r1.mHeight = r2
                int r2 = android.view.View.MeasureSpec.getMode(r3)
                r1.mHeightMode = r2
                if (r2 != 0) goto L29
                boolean r2 = androidx.recyclerview.widget.RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC
                if (r2 != 0) goto L29
                r1.mHeight = r0
            L29:
                return
        }

        public void setMeasuredDimension(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                androidx.recyclerview.widget.RecyclerView.access$300(r0, r2, r3)
                return
        }

        public void setMeasuredDimension(android.graphics.Rect r3, int r4, int r5) {
                r2 = this;
                int r0 = r3.width()
                int r1 = r2.getPaddingLeft()
                int r0 = r0 + r1
                int r1 = r2.getPaddingRight()
                int r0 = r0 + r1
                int r3 = r3.height()
                int r1 = r2.getPaddingTop()
                int r3 = r3 + r1
                int r1 = r2.getPaddingBottom()
                int r3 = r3 + r1
                int r1 = r2.getMinimumWidth()
                int r4 = chooseSize(r4, r0, r1)
                int r0 = r2.getMinimumHeight()
                int r3 = chooseSize(r5, r3, r0)
                r2.setMeasuredDimension(r4, r3)
                return
        }

        public void setMeasuredDimensionFromChildren(int r9, int r10) {
                r8 = this;
                int r0 = r8.getChildCount()
                if (r0 != 0) goto Lc
                androidx.recyclerview.widget.RecyclerView r0 = r8.mRecyclerView
                r0.defaultOnMeasure(r9, r10)
                return
            Lc:
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = 2147483647(0x7fffffff, float:NaN)
                r3 = 0
                r4 = r2
                r5 = r3
                r2 = r1
                r3 = r4
            L16:
                if (r5 >= r0) goto L3a
                android.view.View r6 = r8.getChildAt(r5)
                androidx.recyclerview.widget.RecyclerView r7 = r8.mRecyclerView
                android.graphics.Rect r7 = r7.mTempRect
                r8.getDecoratedBoundsWithMargins(r6, r7)
                int r6 = r7.left
                if (r6 >= r3) goto L28
                r3 = r6
            L28:
                int r6 = r7.right
                if (r6 <= r1) goto L2d
                r1 = r6
            L2d:
                int r6 = r7.top
                if (r6 >= r4) goto L32
                r4 = r6
            L32:
                int r6 = r7.bottom
                if (r6 <= r2) goto L37
                r2 = r6
            L37:
                int r5 = r5 + 1
                goto L16
            L3a:
                androidx.recyclerview.widget.RecyclerView r0 = r8.mRecyclerView
                android.graphics.Rect r0 = r0.mTempRect
                r0.set(r3, r4, r1, r2)
                androidx.recyclerview.widget.RecyclerView r0 = r8.mRecyclerView
                android.graphics.Rect r0 = r0.mTempRect
                r8.setMeasuredDimension(r0, r9, r10)
                return
        }

        public void setMeasurementCacheEnabled(boolean r1) {
                r0 = this;
                r0.mMeasurementCacheEnabled = r1
                return
        }

        public void setRecyclerView(androidx.recyclerview.widget.RecyclerView r2) {
                r1 = this;
                if (r2 != 0) goto Ld
                r2 = 0
                r1.mRecyclerView = r2
                r1.mChildHelper = r2
                r2 = 0
                r1.mWidth = r2
                r1.mHeight = r2
                goto L1f
            Ld:
                r1.mRecyclerView = r2
                androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r2.mChildHelper
                r1.mChildHelper = r0
                int r0 = r2.getWidth()
                r1.mWidth = r0
                int r2 = r2.getHeight()
                r1.mHeight = r2
            L1f:
                r2 = 1073741824(0x40000000, float:2.0)
                r1.mWidthMode = r2
                r1.mHeightMode = r2
                return
        }

        public boolean shouldMeasureChild(android.view.View r3, int r4, int r5, androidx.recyclerview.widget.RecyclerView.C7696 r6) {
                r2 = this;
                boolean r0 = r3.isLayoutRequested()
                if (r0 != 0) goto L25
                boolean r0 = r2.mMeasurementCacheEnabled
                if (r0 == 0) goto L25
                int r0 = r3.getWidth()
                int r1 = r6.width
                boolean r4 = m29759(r0, r4, r1)
                if (r4 == 0) goto L25
                int r3 = r3.getHeight()
                int r4 = r6.height
                boolean r3 = m29759(r3, r5, r4)
                if (r3 != 0) goto L23
                goto L25
            L23:
                r3 = 0
                goto L26
            L25:
                r3 = 1
            L26:
                return r3
        }

        public boolean shouldMeasureTwice() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean shouldReMeasureChild(android.view.View r3, int r4, int r5, androidx.recyclerview.widget.RecyclerView.C7696 r6) {
                r2 = this;
                boolean r0 = r2.mMeasurementCacheEnabled
                if (r0 == 0) goto L1f
                int r0 = r3.getMeasuredWidth()
                int r1 = r6.width
                boolean r4 = m29759(r0, r4, r1)
                if (r4 == 0) goto L1f
                int r3 = r3.getMeasuredHeight()
                int r4 = r6.height
                boolean r3 = m29759(r3, r5, r4)
                if (r3 != 0) goto L1d
                goto L1f
            L1d:
                r3 = 0
                goto L20
            L1f:
                r3 = 1
            L20:
                return r3
        }

        public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.C7713 r2, int r3) {
                r0 = this;
                java.lang.String r1 = "RecyclerView"
                java.lang.String r2 = "You must override smoothScrollToPosition to support smooth scrolling"
                android.util.Log.e(r1, r2)
                return
        }

        public void startSmoothScroll(androidx.recyclerview.widget.RecyclerView.AbstractC7710 r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠ r0 = r1.mSmoothScroller
                if (r0 == 0) goto L11
                if (r2 == r0) goto L11
                boolean r0 = r0.isRunning()
                if (r0 == 0) goto L11
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠ r0 = r1.mSmoothScroller
                r0.stop()
            L11:
                r1.mSmoothScroller = r2
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                r2.start(r0, r1)
                return
        }

        public void stopIgnoringView(@Yue.InterfaceC4410 android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r2)
                r2.stopIgnoring()
                r2.resetInternal()
                r0 = 4
                r2.addFlags(r0)
                return
        }

        public void stopSmoothScroller() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠ r0 = r1.mSmoothScroller
                if (r0 == 0) goto L7
                r0.stop()
            L7:
                return
        }

        public boolean supportsPredictiveItemAnimations() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m29760(android.view.View r5, int r6, boolean r7) {
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r5)
                if (r7 != 0) goto L15
                boolean r7 = r0.isRemoved()
                if (r7 == 0) goto Ld
                goto L15
            Ld:
                androidx.recyclerview.widget.RecyclerView r7 = r4.mRecyclerView
                androidx.recyclerview.widget.ۥ۟۟ۡ r7 = r7.mViewInfoStore
                r7.m30350(r0)
                goto L1c
            L15:
                androidx.recyclerview.widget.RecyclerView r7 = r4.mRecyclerView
                androidx.recyclerview.widget.ۥ۟۟ۡ r7 = r7.mViewInfoStore
                r7.m30336(r0)
            L1c:
                android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r7 = (androidx.recyclerview.widget.RecyclerView.C7696) r7
                boolean r1 = r0.wasReturnedFromScrap()
                r2 = 0
                if (r1 != 0) goto L91
                boolean r1 = r0.isScrap()
                if (r1 == 0) goto L30
                goto L91
            L30:
                android.view.ViewParent r1 = r5.getParent()
                androidx.recyclerview.widget.RecyclerView r3 = r4.mRecyclerView
                if (r1 != r3) goto L79
                androidx.recyclerview.widget.ۥ۟۟۟۟ r1 = r4.mChildHelper
                int r1 = r1.m30054(r5)
                r3 = -1
                if (r6 != r3) goto L47
                androidx.recyclerview.widget.ۥ۟۟۟۟ r6 = r4.mChildHelper
                int r6 = r6.m30048()
            L47:
                if (r1 == r3) goto L53
                if (r1 == r6) goto La7
                androidx.recyclerview.widget.RecyclerView r5 = r4.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r5 = r5.mLayout
                r5.moveView(r1, r6)
                goto La7
            L53:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r0 = "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"
                r7.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = r4.mRecyclerView
                int r5 = r0.indexOfChild(r5)
                r7.append(r5)
                androidx.recyclerview.widget.RecyclerView r5 = r4.mRecyclerView
                java.lang.String r5 = r5.exceptionLabel()
                r7.append(r5)
                java.lang.String r5 = r7.toString()
                r6.<init>(r5)
                throw r6
            L79:
                androidx.recyclerview.widget.ۥ۟۟۟۟ r1 = r4.mChildHelper
                r1.m30042(r5, r6, r2)
                r6 = 1
                r7.f29617 = r6
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠ r6 = r4.mSmoothScroller
                if (r6 == 0) goto La7
                boolean r6 = r6.isRunning()
                if (r6 == 0) goto La7
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠ r6 = r4.mSmoothScroller
                r6.onChildAttachedToWindow(r5)
                goto La7
            L91:
                boolean r1 = r0.isScrap()
                if (r1 == 0) goto L9b
                r0.unScrap()
                goto L9e
            L9b:
                r0.clearReturnedFromScrapFlag()
            L9e:
                androidx.recyclerview.widget.ۥ۟۟۟۟ r1 = r4.mChildHelper
                android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
                r1.m30044(r5, r6, r3, r2)
            La7:
                boolean r5 = r7.f29618
                if (r5 == 0) goto Lb2
                android.view.View r5 = r0.itemView
                r5.invalidate()
                r7.f29618 = r2
            Lb2:
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final void m29761(int r1, @Yue.InterfaceC4410 android.view.View r2) {
                r0 = this;
                androidx.recyclerview.widget.ۥ۟۟۟۟ r2 = r0.mChildHelper
                r2.m30045(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int[] m29762(android.view.View r8, android.graphics.Rect r9) {
                r7 = this;
                int r0 = r7.getPaddingLeft()
                int r1 = r7.getPaddingTop()
                int r2 = r7.getWidth()
                int r3 = r7.getPaddingRight()
                int r2 = r2 - r3
                int r3 = r7.getHeight()
                int r4 = r7.getPaddingBottom()
                int r3 = r3 - r4
                int r4 = r8.getLeft()
                int r5 = r9.left
                int r4 = r4 + r5
                int r5 = r8.getScrollX()
                int r4 = r4 - r5
                int r5 = r8.getTop()
                int r6 = r9.top
                int r5 = r5 + r6
                int r8 = r8.getScrollY()
                int r5 = r5 - r8
                int r8 = r9.width()
                int r8 = r8 + r4
                int r9 = r9.height()
                int r9 = r9 + r5
                int r4 = r4 - r0
                r0 = 0
                int r6 = java.lang.Math.min(r0, r4)
                int r5 = r5 - r1
                int r1 = java.lang.Math.min(r0, r5)
                int r8 = r8 - r2
                int r2 = java.lang.Math.max(r0, r8)
                int r9 = r9 - r3
                int r9 = java.lang.Math.max(r0, r9)
                int r0 = r7.getLayoutDirection()
                r3 = 1
                if (r0 != r3) goto L60
                if (r2 == 0) goto L5b
                goto L68
            L5b:
                int r2 = java.lang.Math.max(r6, r8)
                goto L68
            L60:
                if (r6 == 0) goto L63
                goto L67
            L63:
                int r6 = java.lang.Math.min(r4, r2)
            L67:
                r2 = r6
            L68:
                if (r1 == 0) goto L6b
                goto L6f
            L6b:
                int r1 = java.lang.Math.min(r5, r9)
            L6f:
                int[] r8 = new int[]{r2, r1}
                return r8
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean m29763(androidx.recyclerview.widget.RecyclerView r7, int r8, int r9) {
                r6 = this;
                android.view.View r7 = r7.getFocusedChild()
                r0 = 0
                if (r7 != 0) goto L8
                return r0
            L8:
                int r1 = r6.getPaddingLeft()
                int r2 = r6.getPaddingTop()
                int r3 = r6.getWidth()
                int r4 = r6.getPaddingRight()
                int r3 = r3 - r4
                int r4 = r6.getHeight()
                int r5 = r6.getPaddingBottom()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r6.mRecyclerView
                android.graphics.Rect r5 = r5.mTempRect
                r6.getDecoratedBoundsWithMargins(r7, r5)
                int r7 = r5.left
                int r7 = r7 - r8
                if (r7 >= r3) goto L40
                int r7 = r5.right
                int r7 = r7 - r8
                if (r7 <= r1) goto L40
                int r7 = r5.top
                int r7 = r7 - r9
                if (r7 >= r4) goto L40
                int r7 = r5.bottom
                int r7 = r7 - r9
                if (r7 > r2) goto L3e
                goto L40
            L3e:
                r7 = 1
                return r7
            L40:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final void m29764(androidx.recyclerview.widget.RecyclerView.C7704 r3, int r4, android.view.View r5) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r5)
                boolean r1 = r0.shouldIgnore()
                if (r1 == 0) goto Lb
                return
            Lb:
                boolean r1 = r0.isInvalid()
                if (r1 == 0) goto L28
                boolean r1 = r0.isRemoved()
                if (r1 != 0) goto L28
                androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r1 = r1.mAdapter
                boolean r1 = r1.hasStableIds()
                if (r1 != 0) goto L28
                r2.removeViewAt(r4)
                r3.m29825(r0)
                goto L35
            L28:
                r2.detachViewAt(r4)
                r3.m29826(r5)
                androidx.recyclerview.widget.RecyclerView r3 = r2.mRecyclerView
                androidx.recyclerview.widget.ۥ۟۟ۡ r3 = r3.mViewInfoStore
                r3.m30345(r0)
            L35:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟, reason: contains not printable characters */
    public static class C7696 extends android.view.ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public androidx.recyclerview.widget.RecyclerView.AbstractC7716 f29615;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.graphics.Rect f29616;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f29617;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f29618;

        public C7696(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.f29616 = r1
                r1 = 1
                r0.f29617 = r1
                r1 = 0
                r0.f29618 = r1
                return
        }

        public C7696(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.f29616 = r1
                r1 = 1
                r0.f29617 = r1
                r1 = 0
                r0.f29618 = r1
                return
        }

        public C7696(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.f29616 = r1
                r1 = 1
                r0.f29617 = r1
                r1 = 0
                r0.f29618 = r1
                return
        }

        public C7696(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.f29616 = r1
                r1 = 1
                r0.f29617 = r1
                r1 = 0
                r0.f29618 = r1
                return
        }

        public C7696(androidx.recyclerview.widget.RecyclerView.C7696 r1) {
                r0 = this;
                r0.<init>(r1)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.f29616 = r1
                r1 = 1
                r0.f29617 = r1
                r1 = 0
                r0.f29618 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int m29771() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r1.f29615
                int r0 = r0.getAdapterPosition()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int m29772() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r1.f29615
                int r0 = r0.getLayoutPosition()
                return r0
        }

        @java.lang.Deprecated
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int m29773() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r1.f29615
                int r0 = r0.getPosition()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean m29774() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r1.f29615
                boolean r0 = r0.isUpdated()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean m29775() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r1.f29615
                boolean r0 = r0.isRemoved()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean m29776() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r1.f29615
                boolean r0 = r0.isInvalid()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean m29777() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r1.f29615
                boolean r0 = r0.needsUpdate()
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۠, reason: contains not printable characters */
    public interface InterfaceC7697 {
        /* JADX INFO: renamed from: ۥ۟ */
        void mo26658(@Yue.InterfaceC4410 android.view.View r1);

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        void mo26659(@Yue.InterfaceC4410 android.view.View r1);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static abstract class AbstractC7698 {
        public AbstractC7698() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract boolean onFling(int r1, int r2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۢ, reason: contains not printable characters */
    public interface InterfaceC7699 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        void mo29778(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r1, @Yue.InterfaceC4410 android.view.MotionEvent r2);

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        boolean mo29779(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r1, @Yue.InterfaceC4410 android.view.MotionEvent r2);

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        void mo29780(boolean r1);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۠, reason: contains not printable characters */
    public static abstract class AbstractC7700 {
        public AbstractC7700() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onScrollStateChanged(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r1, int r2) {
                r0 = this;
                return
        }

        public void onScrolled(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r1, int r2, int r3) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC7701 {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static class C7702 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final int f29619 = 5;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.util.SparseArray<androidx.recyclerview.widget.RecyclerView.C7702.C7703> f29620;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f29621;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ, reason: contains not printable characters */
        public static class C7703 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.AbstractC7716> f29622;

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public int f29623;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public long f29624;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public long f29625;

            public C7703() {
                    r2 = this;
                    r2.<init>()
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    r2.f29622 = r0
                    r0 = 5
                    r2.f29623 = r0
                    r0 = 0
                    r2.f29624 = r0
                    r2.f29625 = r0
                    return
            }
        }

        public C7702() {
                r1 = this;
                r1.<init>()
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.f29620 = r0
                r0 = 0
                r1.f29621 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m29781() {
                r1 = this;
                int r0 = r1.f29621
                int r0 = r0 + 1
                r1.f29621 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m29782() {
                r2 = this;
                r0 = 0
            L1:
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ> r1 = r2.f29620
                int r1 = r1.size()
                if (r0 >= r1) goto L19
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ> r1 = r2.f29620
                java.lang.Object r1 = r1.valueAt(r0)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ r1 = (androidx.recyclerview.widget.RecyclerView.C7702.C7703) r1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r1 = r1.f29622
                r1.clear()
                int r0 = r0 + 1
                goto L1
            L19:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m29783() {
                r1 = this;
                int r0 = r1.f29621
                int r0 = r0 + (-1)
                r1.f29621 = r0
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m29784(int r3, long r4) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ r3 = r2.m29788(r3)
                long r0 = r3.f29625
                long r4 = r2.m29791(r0, r4)
                r3.f29625 = r4
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m29785(int r3, long r4) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ r3 = r2.m29788(r3)
                long r0 = r3.f29624
                long r4 = r2.m29791(r0, r4)
                r3.f29624 = r4
                return
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public androidx.recyclerview.widget.RecyclerView.AbstractC7716 m29786(int r3) {
                r2 = this;
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ> r0 = r2.f29620
                java.lang.Object r3 = r0.get(r3)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ r3 = (androidx.recyclerview.widget.RecyclerView.C7702.C7703) r3
                if (r3 == 0) goto L32
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r3.f29622
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L32
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r3 = r3.f29622
                int r0 = r3.size()
                int r0 = r0 + (-1)
            L1a:
                if (r0 < 0) goto L32
                java.lang.Object r1 = r3.get(r0)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r1 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r1
                boolean r1 = r1.isAttachedToTransitionOverlay()
                if (r1 != 0) goto L2f
                java.lang.Object r3 = r3.remove(r0)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r3
                return r3
            L2f:
                int r0 = r0 + (-1)
                goto L1a
            L32:
                r3 = 0
                return r3
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int m29787(int r1) {
                r0 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ r1 = r0.m29788(r1)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r1 = r1.f29622
                int r1 = r1.size()
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final androidx.recyclerview.widget.RecyclerView.C7702.C7703 m29788(int r3) {
                r2 = this;
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ> r0 = r2.f29620
                java.lang.Object r0 = r0.get(r3)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ r0 = (androidx.recyclerview.widget.RecyclerView.C7702.C7703) r0
                if (r0 != 0) goto L14
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ r0 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ
                r0.<init>()
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ> r1 = r2.f29620
                r1.put(r3, r0)
            L14:
                return r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void m29789(androidx.recyclerview.widget.RecyclerView.AbstractC7678 r1, androidx.recyclerview.widget.RecyclerView.AbstractC7678 r2, boolean r3) {
                r0 = this;
                if (r1 == 0) goto L5
                r0.m29783()
            L5:
                if (r3 != 0) goto Le
                int r1 = r0.f29621
                if (r1 != 0) goto Le
                r0.m29782()
            Le:
                if (r2 == 0) goto L13
                r0.m29781()
            L13:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m29790(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r4) {
                r3 = this;
                int r0 = r4.getItemViewType()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ r1 = r3.m29788(r0)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r1 = r1.f29622
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ> r2 = r3.f29620
                java.lang.Object r0 = r2.get(r0)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ r0 = (androidx.recyclerview.widget.RecyclerView.C7702.C7703) r0
                int r0 = r0.f29623
                int r2 = r1.size()
                if (r0 > r2) goto L1b
                return
            L1b:
                r4.resetInternal()
                r1.add(r4)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public long m29791(long r5, long r7) {
                r4 = this;
                r0 = 0
                int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r0 != 0) goto L7
                return r7
            L7:
                r0 = 4
                long r5 = r5 / r0
                r2 = 3
                long r5 = r5 * r2
                long r7 = r7 / r0
                long r5 = r5 + r7
                return r5
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public void m29792(int r2, int r3) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ r2 = r1.m29788(r2)
                r2.f29623 = r3
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r2 = r2.f29622
            L8:
                int r0 = r2.size()
                if (r0 <= r3) goto L18
                int r0 = r2.size()
                int r0 = r0 + (-1)
                r2.remove(r0)
                goto L8
            L18:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public int m29793() {
                r3 = this;
                r0 = 0
                r1 = r0
            L2:
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ> r2 = r3.f29620
                int r2 = r2.size()
                if (r0 >= r2) goto L1e
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ> r2 = r3.f29620
                java.lang.Object r2 = r2.valueAt(r0)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ r2 = (androidx.recyclerview.widget.RecyclerView.C7702.C7703) r2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r2 = r2.f29622
                if (r2 == 0) goto L1b
                int r2 = r2.size()
                int r1 = r1 + r2
            L1b:
                int r0 = r0 + 1
                goto L2
            L1e:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public boolean m29794(int r5, long r6, long r8) {
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ r5 = r4.m29788(r5)
                long r0 = r5.f29625
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto L14
                long r6 = r6 + r0
                int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r5 >= 0) goto L12
                goto L14
            L12:
                r5 = 0
                goto L15
            L14:
                r5 = 1
            L15:
                return r5
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public boolean m29795(int r5, long r6, long r8) {
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ r5 = r4.m29788(r5)
                long r0 = r5.f29624
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto L14
                long r6 = r6 + r0
                int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r5 >= 0) goto L12
                goto L14
            L12:
                r5 = 0
                goto L15
            L14:
                r5 = 1
            L15:
                return r5
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final class C7704 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final int f29626 = 2;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.AbstractC7716> f29627;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.AbstractC7716> f29628;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.util.ArrayList<androidx.recyclerview.widget.RecyclerView.AbstractC7716> f29629;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final java.util.List<androidx.recyclerview.widget.RecyclerView.AbstractC7716> f29630;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f29631;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f29632;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public androidx.recyclerview.widget.RecyclerView.C7702 f29633;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public androidx.recyclerview.widget.RecyclerView.AbstractC7714 f29634;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f29635;

        public C7704(androidx.recyclerview.widget.RecyclerView r2) {
                r1 = this;
                r1.f29635 = r2
                r1.<init>()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r1.f29627 = r2
                r0 = 0
                r1.f29628 = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.f29629 = r0
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.f29630 = r2
                r2 = 2
                r1.f29631 = r2
                r1.f29632 = r2
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m29796(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r5, boolean r6) {
                r4 = this;
                androidx.recyclerview.widget.RecyclerView.clearNestedRecyclerViewIfNotNested(r5)
                android.view.View r0 = r5.itemView
                androidx.recyclerview.widget.RecyclerView r1 = r4.f29635
                androidx.recyclerview.widget.ۥ۟۟۠ۢ r1 = r1.mAccessibilityDelegate
                r2 = 0
                if (r1 == 0) goto L1f
                Yue.ۥۣ۟۟ۢ r1 = r1.getItemDelegate()
                boolean r3 = r1 instanceof androidx.recyclerview.widget.C7796.C7797
                if (r3 == 0) goto L1b
                androidx.recyclerview.widget.ۥ۟۟۠ۢ$ۥ r1 = (androidx.recyclerview.widget.C7796.C7797) r1
                Yue.ۥۣ۟۟ۢ r1 = r1.m30265(r0)
                goto L1c
            L1b:
                r1 = r2
            L1c:
                Yue.C6794.m26223(r0, r1)
            L1f:
                if (r6 == 0) goto L24
                r4.m29803(r5)
            L24:
                r5.mOwnerRecyclerView = r2
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ r6 = r4.m29805()
                r6.m29790(r5)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final void m29797(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29635
                boolean r0 = r0.isAccessibilityEnabled()
                if (r0 == 0) goto L2c
                android.view.View r3 = r3.itemView
                int r0 = Yue.C6794.m26135(r3)
                if (r0 != 0) goto L14
                r0 = 1
                Yue.C6794.m26241(r3, r0)
            L14:
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29635
                androidx.recyclerview.widget.ۥ۟۟۠ۢ r0 = r0.mAccessibilityDelegate
                if (r0 != 0) goto L1b
                return
            L1b:
                Yue.ۥۣ۟۟ۢ r0 = r0.getItemDelegate()
                boolean r1 = r0 instanceof androidx.recyclerview.widget.C7796.C7797
                if (r1 == 0) goto L29
                r1 = r0
                androidx.recyclerview.widget.ۥ۟۟۠ۢ$ۥ r1 = (androidx.recyclerview.widget.C7796.C7797) r1
                r1.m30266(r3)
            L29:
                Yue.C6794.m26223(r3, r0)
            L2c:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m29798(@Yue.InterfaceC4410 android.view.View r7, int r8) {
                r6 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r7 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r7)
                if (r7 == 0) goto L9d
                androidx.recyclerview.widget.RecyclerView r0 = r6.f29635
                androidx.recyclerview.widget.ۥ r0 = r0.mAdapterHelper
                int r2 = r0.m30008(r8)
                if (r2 < 0) goto L65
                androidx.recyclerview.widget.RecyclerView r0 = r6.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r0.mAdapter
                int r0 = r0.getItemCount()
                if (r2 >= r0) goto L65
                r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r0 = r6
                r1 = r7
                r3 = r8
                r0.m29830(r1, r2, r3, r4)
                android.view.View r8 = r7.itemView
                android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
                if (r8 != 0) goto L3b
                androidx.recyclerview.widget.RecyclerView r8 = r6.f29635
                android.view.ViewGroup$LayoutParams r8 = r8.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r8 = (androidx.recyclerview.widget.RecyclerView.C7696) r8
                android.view.View r0 = r7.itemView
                r0.setLayoutParams(r8)
                goto L53
            L3b:
                androidx.recyclerview.widget.RecyclerView r0 = r6.f29635
                boolean r0 = r0.checkLayoutParams(r8)
                if (r0 != 0) goto L51
                androidx.recyclerview.widget.RecyclerView r0 = r6.f29635
                android.view.ViewGroup$LayoutParams r8 = r0.generateLayoutParams(r8)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r8 = (androidx.recyclerview.widget.RecyclerView.C7696) r8
                android.view.View r0 = r7.itemView
                r0.setLayoutParams(r8)
                goto L53
            L51:
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r8 = (androidx.recyclerview.widget.RecyclerView.C7696) r8
            L53:
                r0 = 1
                r8.f29617 = r0
                r8.f29615 = r7
                android.view.View r7 = r7.itemView
                android.view.ViewParent r7 = r7.getParent()
                if (r7 != 0) goto L61
                goto L62
            L61:
                r0 = 0
            L62:
                r8.f29618 = r0
                return
            L65:
                java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Inconsistency detected. Invalid item position "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r8 = "(offset:"
                r0.append(r8)
                r0.append(r2)
                java.lang.String r8 = ").state:"
                r0.append(r8)
                androidx.recyclerview.widget.RecyclerView r8 = r6.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r8 = r8.mState
                int r8 = r8.m29858()
                r0.append(r8)
                androidx.recyclerview.widget.RecyclerView r8 = r6.f29635
                java.lang.String r8 = r8.exceptionLabel()
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                r7.<init>(r8)
                throw r7
            L9d:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter"
                r8.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = r6.f29635
                java.lang.String r0 = r0.exceptionLabel()
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                r7.<init>(r8)
                throw r7
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m29799() {
                r1 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r1.f29627
                r0.clear()
                r1.m29822()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m29800() {
                r4 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r4.f29629
                int r0 = r0.size()
                r1 = 0
                r2 = r1
            L8:
                if (r2 >= r0) goto L18
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r3 = r4.f29629
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r3
                r3.clearOldPosition()
                int r2 = r2 + 1
                goto L8
            L18:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r4.f29627
                int r0 = r0.size()
                r2 = r1
            L1f:
                if (r2 >= r0) goto L2f
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r3 = r4.f29627
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r3
                r3.clearOldPosition()
                int r2 = r2 + 1
                goto L1f
            L2f:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r4.f29628
                if (r0 == 0) goto L47
                int r0 = r0.size()
            L37:
                if (r1 >= r0) goto L47
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r2 = r4.f29628
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r2
                r2.clearOldPosition()
                int r1 = r1 + 1
                goto L37
            L47:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void m29801() {
                r1 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r1.f29627
                r0.clear()
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r1.f29628
                if (r0 == 0) goto Lc
                r0.clear()
            Lc:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int m29802(int r4) {
                r3 = this;
                if (r4 < 0) goto L20
                androidx.recyclerview.widget.RecyclerView r0 = r3.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r0.mState
                int r0 = r0.m29858()
                if (r4 >= r0) goto L20
                androidx.recyclerview.widget.RecyclerView r0 = r3.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r0.mState
                boolean r0 = r0.m29864()
                if (r0 != 0) goto L17
                return r4
            L17:
                androidx.recyclerview.widget.RecyclerView r0 = r3.f29635
                androidx.recyclerview.widget.ۥ r0 = r0.mAdapterHelper
                int r4 = r0.m30008(r4)
                return r4
            L20:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "invalid position "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = ". State item count is "
                r1.append(r4)
                androidx.recyclerview.widget.RecyclerView r4 = r3.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r4 = r4.mState
                int r4 = r4.m29858()
                r1.append(r4)
                androidx.recyclerview.widget.RecyclerView r4 = r3.f29635
                java.lang.String r4 = r4.exceptionLabel()
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m29803(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۧ r0 = r0.mRecyclerListener
                if (r0 == 0) goto L9
                r0.m29836(r3)
            L9:
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r0.mAdapter
                if (r0 == 0) goto L12
                r0.onViewRecycled(r3)
            L12:
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r1 = r0.mState
                if (r1 == 0) goto L1d
                androidx.recyclerview.widget.ۥ۟۟ۡ r0 = r0.mViewInfoStore
                r0.m30351(r3)
            L1d:
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public androidx.recyclerview.widget.RecyclerView.AbstractC7716 m29804(int r10) {
                r9 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r9.f29628
                r1 = 0
                if (r0 == 0) goto L72
                int r0 = r0.size()
                if (r0 != 0) goto Lc
                goto L72
            Lc:
                r2 = 0
                r3 = r2
            Le:
                r4 = 32
                if (r3 >= r0) goto L2d
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r5 = r9.f29628
                java.lang.Object r5 = r5.get(r3)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r5 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r5
                boolean r6 = r5.wasReturnedFromScrap()
                if (r6 != 0) goto L2a
                int r6 = r5.getLayoutPosition()
                if (r6 != r10) goto L2a
                r5.addFlags(r4)
                return r5
            L2a:
                int r3 = r3 + 1
                goto Le
            L2d:
                androidx.recyclerview.widget.RecyclerView r3 = r9.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r3 = r3.mAdapter
                boolean r3 = r3.hasStableIds()
                if (r3 == 0) goto L72
                androidx.recyclerview.widget.RecyclerView r3 = r9.f29635
                androidx.recyclerview.widget.ۥ r3 = r3.mAdapterHelper
                int r10 = r3.m30008(r10)
                if (r10 <= 0) goto L72
                androidx.recyclerview.widget.RecyclerView r3 = r9.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r3 = r3.mAdapter
                int r3 = r3.getItemCount()
                if (r10 >= r3) goto L72
                androidx.recyclerview.widget.RecyclerView r3 = r9.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r3 = r3.mAdapter
                long r5 = r3.getItemId(r10)
            L53:
                if (r2 >= r0) goto L72
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r10 = r9.f29628
                java.lang.Object r10 = r10.get(r2)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r10 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r10
                boolean r3 = r10.wasReturnedFromScrap()
                if (r3 != 0) goto L6f
                long r7 = r10.getItemId()
                int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r3 != 0) goto L6f
                r10.addFlags(r4)
                return r10
            L6f:
                int r2 = r2 + 1
                goto L53
            L72:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public androidx.recyclerview.widget.RecyclerView.C7702 m29805() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ r0 = r1.f29633
                if (r0 != 0) goto Lb
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ r0 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ
                r0.<init>()
                r1.f29633 = r0
            Lb:
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ r0 = r1.f29633
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public int m29806() {
                r1 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r1.f29627
                int r0 = r0.size()
                return r0
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public java.util.List<androidx.recyclerview.widget.RecyclerView.AbstractC7716> m29807() {
                r1 = this;
                java.util.List<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r1.f29630
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public androidx.recyclerview.widget.RecyclerView.AbstractC7716 m29808(long r6, int r8, boolean r9) {
                r5 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r5.f29627
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L59
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r1 = r5.f29627
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r1 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r1
                long r2 = r1.getItemId()
                int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r2 != 0) goto L56
                boolean r2 = r1.wasReturnedFromScrap()
                if (r2 != 0) goto L56
                int r2 = r1.getItemViewType()
                if (r8 != r2) goto L42
                r6 = 32
                r1.addFlags(r6)
                boolean r6 = r1.isRemoved()
                if (r6 == 0) goto L41
                androidx.recyclerview.widget.RecyclerView r6 = r5.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r6 = r6.mState
                boolean r6 = r6.m29864()
                if (r6 != 0) goto L41
                r6 = 2
                r7 = 14
                r1.setFlags(r6, r7)
            L41:
                return r1
            L42:
                if (r9 != 0) goto L56
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r2 = r5.f29627
                r2.remove(r0)
                androidx.recyclerview.widget.RecyclerView r2 = r5.f29635
                android.view.View r3 = r1.itemView
                r4 = 0
                r2.removeDetachedView(r3, r4)
                android.view.View r1 = r1.itemView
                r5.m29821(r1)
            L56:
                int r0 = r0 + (-1)
                goto L8
            L59:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r5.f29629
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L61:
                r1 = 0
                if (r0 < 0) goto L91
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r2 = r5.f29629
                java.lang.Object r2 = r2.get(r0)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r2
                long r3 = r2.getItemId()
                int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r3 != 0) goto L8e
                boolean r3 = r2.isAttachedToTransitionOverlay()
                if (r3 != 0) goto L8e
                int r3 = r2.getItemViewType()
                if (r8 != r3) goto L88
                if (r9 != 0) goto L87
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r6 = r5.f29629
                r6.remove(r0)
            L87:
                return r2
            L88:
                if (r9 != 0) goto L8e
                r5.m29823(r0)
                return r1
            L8e:
                int r0 = r0 + (-1)
                goto L61
            L91:
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public androidx.recyclerview.widget.RecyclerView.AbstractC7716 m29809(int r6, boolean r7) {
                r5 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r5.f29627
                int r0 = r0.size()
                r1 = 0
                r2 = r1
            L8:
                if (r2 >= r0) goto L3b
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r3 = r5.f29627
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r3
                boolean r4 = r3.wasReturnedFromScrap()
                if (r4 != 0) goto L38
                int r4 = r3.getLayoutPosition()
                if (r4 != r6) goto L38
                boolean r4 = r3.isInvalid()
                if (r4 != 0) goto L38
                androidx.recyclerview.widget.RecyclerView r4 = r5.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r4 = r4.mState
                boolean r4 = r4.f29656
                if (r4 != 0) goto L32
                boolean r4 = r3.isRemoved()
                if (r4 != 0) goto L38
            L32:
                r6 = 32
                r3.addFlags(r6)
                return r3
            L38:
                int r2 = r2 + 1
                goto L8
            L3b:
                if (r7 != 0) goto L8d
                androidx.recyclerview.widget.RecyclerView r0 = r5.f29635
                androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r0.mChildHelper
                android.view.View r0 = r0.m30046(r6)
                if (r0 == 0) goto L8d
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r6 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r0)
                androidx.recyclerview.widget.RecyclerView r7 = r5.f29635
                androidx.recyclerview.widget.ۥ۟۟۟۟ r7 = r7.mChildHelper
                r7.m30060(r0)
                androidx.recyclerview.widget.RecyclerView r7 = r5.f29635
                androidx.recyclerview.widget.ۥ۟۟۟۟ r7 = r7.mChildHelper
                int r7 = r7.m30054(r0)
                r1 = -1
                if (r7 == r1) goto L6d
                androidx.recyclerview.widget.RecyclerView r1 = r5.f29635
                androidx.recyclerview.widget.ۥ۟۟۟۟ r1 = r1.mChildHelper
                r1.m30045(r7)
                r5.m29826(r0)
                r7 = 8224(0x2020, float:1.1524E-41)
                r6.addFlags(r7)
                return r6
            L6d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "layout index should not be -1 after unhiding a view:"
                r0.append(r1)
                r0.append(r6)
                androidx.recyclerview.widget.RecyclerView r6 = r5.f29635
                java.lang.String r6 = r6.exceptionLabel()
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r7.<init>(r6)
                throw r7
            L8d:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r5.f29629
                int r0 = r0.size()
            L93:
                if (r1 >= r0) goto Lba
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r2 = r5.f29629
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r2
                boolean r3 = r2.isInvalid()
                if (r3 != 0) goto Lb7
                int r3 = r2.getLayoutPosition()
                if (r3 != r6) goto Lb7
                boolean r3 = r2.isAttachedToTransitionOverlay()
                if (r3 != 0) goto Lb7
                if (r7 != 0) goto Lb6
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r6 = r5.f29629
                r6.remove(r1)
            Lb6:
                return r2
            Lb7:
                int r1 = r1 + 1
                goto L93
            Lba:
                r6 = 0
                return r6
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public android.view.View m29810(int r2) {
                r1 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r1.f29627
                java.lang.Object r2 = r0.get(r2)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r2
                android.view.View r2 = r2.itemView
                return r2
        }

        @Yue.InterfaceC4410
        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public android.view.View m29811(int r2) {
                r1 = this;
                r0 = 0
                android.view.View r2 = r1.m29812(r2, r0)
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public android.view.View m29812(int r3, boolean r4) {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = r2.m29831(r3, r4, r0)
                android.view.View r3 = r3.itemView
                return r3
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public final void m29813(android.view.ViewGroup r5, boolean r6) {
                r4 = this;
                int r0 = r5.getChildCount()
                r1 = 1
                int r0 = r0 - r1
            L6:
                if (r0 < 0) goto L18
                android.view.View r2 = r5.getChildAt(r0)
                boolean r3 = r2 instanceof android.view.ViewGroup
                if (r3 == 0) goto L15
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r4.m29813(r2, r1)
            L15:
                int r0 = r0 + (-1)
                goto L6
            L18:
                if (r6 != 0) goto L1b
                return
            L1b:
                int r6 = r5.getVisibility()
                r0 = 4
                if (r6 != r0) goto L2a
                r6 = 0
                r5.setVisibility(r6)
                r5.setVisibility(r0)
                goto L34
            L2a:
                int r6 = r5.getVisibility()
                r5.setVisibility(r0)
                r5.setVisibility(r6)
            L34:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public final void m29814(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r2) {
                r1 = this;
                android.view.View r2 = r2.itemView
                boolean r0 = r2 instanceof android.view.ViewGroup
                if (r0 == 0) goto Lc
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r0 = 0
                r1.m29813(r2, r0)
            Lc:
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public void m29815() {
                r4 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r4.f29629
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L21
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r2 = r4.f29629
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r2
                android.view.View r2 = r2.itemView
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r2 = (androidx.recyclerview.widget.RecyclerView.C7696) r2
                if (r2 == 0) goto L1e
                r3 = 1
                r2.f29617 = r3
            L1e:
                int r1 = r1 + 1
                goto L7
            L21:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public void m29816() {
                r4 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r4.f29629
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L1e
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r2 = r4.f29629
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r2
                if (r2 == 0) goto L1b
                r3 = 6
                r2.addFlags(r3)
                r3 = 0
                r2.addChangePayload(r3)
            L1b:
                int r1 = r1 + 1
                goto L7
            L1e:
                androidx.recyclerview.widget.RecyclerView r0 = r4.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r0.mAdapter
                if (r0 == 0) goto L2a
                boolean r0 = r0.hasStableIds()
                if (r0 != 0) goto L2d
            L2a:
                r4.m29822()
            L2d:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public void m29817(int r5, int r6) {
                r4 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r4.f29629
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L1e
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r2 = r4.f29629
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r2
                if (r2 == 0) goto L1b
                int r3 = r2.mPosition
                if (r3 < r5) goto L1b
                r3 = 1
                r2.offsetPosition(r6, r3)
            L1b:
                int r1 = r1 + 1
                goto L7
            L1e:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public void m29818(int r9, int r10) {
                r8 = this;
                if (r9 >= r10) goto L6
                r0 = -1
                r1 = r9
                r2 = r10
                goto L9
            L6:
                r0 = 1
                r2 = r9
                r1 = r10
            L9:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r3 = r8.f29629
                int r3 = r3.size()
                r4 = 0
                r5 = r4
            L11:
                if (r5 >= r3) goto L32
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r6 = r8.f29629
                java.lang.Object r6 = r6.get(r5)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r6 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r6
                if (r6 == 0) goto L2f
                int r7 = r6.mPosition
                if (r7 < r1) goto L2f
                if (r7 <= r2) goto L24
                goto L2f
            L24:
                if (r7 != r9) goto L2c
                int r7 = r10 - r9
                r6.offsetPosition(r7, r4)
                goto L2f
            L2c:
                r6.offsetPosition(r0, r4)
            L2f:
                int r5 = r5 + 1
                goto L11
            L32:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public void m29819(int r5, int r6, boolean r7) {
                r4 = this;
                int r0 = r5 + r6
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r1 = r4.f29629
                int r1 = r1.size()
                int r1 = r1 + (-1)
            La:
                if (r1 < 0) goto L2c
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r2 = r4.f29629
                java.lang.Object r2 = r2.get(r1)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r2
                if (r2 == 0) goto L29
                int r3 = r2.mPosition
                if (r3 < r0) goto L1f
                int r3 = -r6
                r2.offsetPosition(r3, r7)
                goto L29
            L1f:
                if (r3 < r5) goto L29
                r3 = 8
                r2.addFlags(r3)
                r4.m29823(r1)
            L29:
                int r1 = r1 + (-1)
                goto La
            L2c:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public void m29820(androidx.recyclerview.widget.RecyclerView.AbstractC7678 r2, androidx.recyclerview.widget.RecyclerView.AbstractC7678 r3, boolean r4) {
                r1 = this;
                r1.m29799()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ r0 = r1.m29805()
                r0.m29789(r2, r3, r4)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public void m29821(android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r2)
                r0 = 0
                r2.mScrapContainer = r0
                r0 = 0
                r2.mInChangeScrap = r0
                r2.clearReturnedFromScrapFlag()
                r1.m29825(r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public void m29822() {
                r1 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r1.f29629
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L8:
                if (r0 < 0) goto L10
                r1.m29823(r0)
                int r0 = r0 + (-1)
                goto L8
            L10:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r1.f29629
                r0.clear()
                boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r0 == 0) goto L20
                androidx.recyclerview.widget.RecyclerView r0 = r1.f29635
                androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟ r0 = r0.mPrefetchRegistry
                r0.m30145()
            L20:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public void m29823(int r3) {
                r2 = this;
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r2.f29629
                java.lang.Object r0 = r0.get(r3)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r0
                r1 = 1
                r2.m29796(r0, r1)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r2.f29629
                r0.remove(r3)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public void m29824(@Yue.InterfaceC4410 android.view.View r4) {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r4)
                boolean r1 = r0.isTmpDetached()
                if (r1 == 0) goto L10
                androidx.recyclerview.widget.RecyclerView r1 = r3.f29635
                r2 = 0
                r1.removeDetachedView(r4, r2)
            L10:
                boolean r4 = r0.isScrap()
                if (r4 == 0) goto L1a
                r0.unScrap()
                goto L23
            L1a:
                boolean r4 = r0.wasReturnedFromScrap()
                if (r4 == 0) goto L23
                r0.clearReturnedFromScrapFlag()
            L23:
                r3.m29825(r0)
                androidx.recyclerview.widget.RecyclerView r4 = r3.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r4 = r4.mItemAnimator
                if (r4 == 0) goto L39
                boolean r4 = r0.isRecyclable()
                if (r4 != 0) goto L39
                androidx.recyclerview.widget.RecyclerView r4 = r3.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r4 = r4.mItemAnimator
                r4.mo29736(r0)
            L39:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public void m29825(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r7) {
                r6 = this;
                boolean r0 = r7.isScrap()
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Le9
                android.view.View r0 = r7.itemView
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto L12
                goto Le9
            L12:
                boolean r0 = r7.isTmpDetached()
                if (r0 != 0) goto Lc9
                boolean r0 = r7.shouldIgnore()
                if (r0 != 0) goto Lac
                boolean r0 = r7.doesTransientStatePreventRecycling()
                androidx.recyclerview.widget.RecyclerView r3 = r6.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r3 = r3.mAdapter
                if (r3 == 0) goto L32
                if (r0 == 0) goto L32
                boolean r3 = r3.onFailedToRecycleView(r7)
                if (r3 == 0) goto L32
                r3 = r2
                goto L33
            L32:
                r3 = r1
            L33:
                if (r3 != 0) goto L3e
                boolean r3 = r7.isRecyclable()
                if (r3 == 0) goto L3c
                goto L3e
            L3c:
                r2 = r1
                goto L9b
            L3e:
                int r3 = r6.f29632
                if (r3 <= 0) goto L91
                r3 = 526(0x20e, float:7.37E-43)
                boolean r3 = r7.hasAnyOfTheFlags(r3)
                if (r3 != 0) goto L91
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r3 = r6.f29629
                int r3 = r3.size()
                int r4 = r6.f29632
                if (r3 < r4) goto L5b
                if (r3 <= 0) goto L5b
                r6.m29823(r1)
                int r3 = r3 + (-1)
            L5b:
                boolean r4 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r4 == 0) goto L8a
                if (r3 <= 0) goto L8a
                androidx.recyclerview.widget.RecyclerView r4 = r6.f29635
                androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟ r4 = r4.mPrefetchRegistry
                int r5 = r7.mPosition
                boolean r4 = r4.m30147(r5)
                if (r4 != 0) goto L8a
                int r3 = r3 + (-1)
            L6f:
                if (r3 < 0) goto L89
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r4 = r6.f29629
                java.lang.Object r4 = r4.get(r3)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r4 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r4
                int r4 = r4.mPosition
                androidx.recyclerview.widget.RecyclerView r5 = r6.f29635
                androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟ r5 = r5.mPrefetchRegistry
                boolean r4 = r5.m30147(r4)
                if (r4 != 0) goto L86
                goto L89
            L86:
                int r3 = r3 + (-1)
                goto L6f
            L89:
                int r3 = r3 + r2
            L8a:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r4 = r6.f29629
                r4.add(r3, r7)
                r3 = r2
                goto L92
            L91:
                r3 = r1
            L92:
                if (r3 != 0) goto L99
                r6.m29796(r7, r2)
            L97:
                r1 = r3
                goto L9b
            L99:
                r2 = r1
                goto L97
            L9b:
                androidx.recyclerview.widget.RecyclerView r3 = r6.f29635
                androidx.recyclerview.widget.ۥ۟۟ۡ r3 = r3.mViewInfoStore
                r3.m30351(r7)
                if (r1 != 0) goto Lab
                if (r2 != 0) goto Lab
                if (r0 == 0) goto Lab
                r0 = 0
                r7.mOwnerRecyclerView = r0
            Lab:
                return
            Lac:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
                r0.append(r1)
                androidx.recyclerview.widget.RecyclerView r1 = r6.f29635
                java.lang.String r1 = r1.exceptionLabel()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                throw r7
            Lc9:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
                r1.append(r2)
                r1.append(r7)
                androidx.recyclerview.widget.RecyclerView r7 = r6.f29635
                java.lang.String r7 = r7.exceptionLabel()
                r1.append(r7)
                java.lang.String r7 = r1.toString()
                r0.<init>(r7)
                throw r0
            Le9:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Scrapped or attached views may not be recycled. isScrap:"
                r3.append(r4)
                boolean r4 = r7.isScrap()
                r3.append(r4)
                java.lang.String r4 = " isAttached:"
                r3.append(r4)
                android.view.View r7 = r7.itemView
                android.view.ViewParent r7 = r7.getParent()
                if (r7 == 0) goto L10a
                r1 = r2
            L10a:
                r3.append(r1)
                androidx.recyclerview.widget.RecyclerView r7 = r6.f29635
                java.lang.String r7 = r7.exceptionLabel()
                r3.append(r7)
                java.lang.String r7 = r3.toString()
                r0.<init>(r7)
                throw r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public void m29826(android.view.View r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r3)
                r0 = 12
                boolean r0 = r3.hasAnyOfTheFlags(r0)
                if (r0 != 0) goto L30
                boolean r0 = r3.isUpdated()
                if (r0 == 0) goto L30
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29635
                boolean r0 = r0.canReuseUpdatedViewHolder(r3)
                if (r0 == 0) goto L1b
                goto L30
            L1b:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r2.f29628
                if (r0 != 0) goto L26
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.f29628 = r0
            L26:
                r0 = 1
                r3.setScrapContainer(r2, r0)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r2.f29628
                r0.add(r3)
                goto L6d
            L30:
                boolean r0 = r3.isInvalid()
                if (r0 == 0) goto L64
                boolean r0 = r3.isRemoved()
                if (r0 != 0) goto L64
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r0.mAdapter
                boolean r0 = r0.hasStableIds()
                if (r0 == 0) goto L47
                goto L64
            L47:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                r0.append(r1)
                androidx.recyclerview.widget.RecyclerView r1 = r2.f29635
                java.lang.String r1 = r1.exceptionLabel()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
            L64:
                r0 = 0
                r3.setScrapContainer(r2, r0)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r2.f29627
                r0.add(r3)
            L6d:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public void m29827(androidx.recyclerview.widget.RecyclerView.C7702 r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ r0 = r1.f29633
                if (r0 == 0) goto L7
                r0.m29783()
            L7:
                r1.f29633 = r2
                if (r2 == 0) goto L18
                androidx.recyclerview.widget.RecyclerView r2 = r1.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r2 = r2.getAdapter()
                if (r2 == 0) goto L18
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ r2 = r1.f29633
                r2.m29781()
            L18:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public void m29828(androidx.recyclerview.widget.RecyclerView.AbstractC7714 r1) {
                r0 = this;
                r0.f29634 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public void m29829(int r1) {
                r0 = this;
                r0.f29631 = r1
                r0.m29833()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public final boolean m29830(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r10, int r11, int r12, long r13) {
                r9 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r9.f29635
                r10.mOwnerRecyclerView = r0
                int r2 = r10.getItemViewType()
                androidx.recyclerview.widget.RecyclerView r0 = r9.f29635
                long r7 = r0.getNanoTime()
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                if (r0 == 0) goto L23
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ r1 = r9.f29633
                r3 = r7
                r5 = r13
                boolean r13 = r1.m29794(r2, r3, r5)
                if (r13 != 0) goto L23
                r10 = 0
                return r10
            L23:
                androidx.recyclerview.widget.RecyclerView r13 = r9.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r13 = r13.mAdapter
                r13.bindViewHolder(r10, r11)
                androidx.recyclerview.widget.RecyclerView r11 = r9.f29635
                long r13 = r11.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ r11 = r9.f29633
                int r0 = r10.getItemViewType()
                long r13 = r13 - r7
                r11.m29784(r0, r13)
                r9.m29797(r10)
                androidx.recyclerview.widget.RecyclerView r11 = r9.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r11 = r11.mState
                boolean r11 = r11.m29864()
                if (r11 == 0) goto L49
                r10.mPreLayoutPosition = r12
            L49:
                r10 = 1
                return r10
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public androidx.recyclerview.widget.RecyclerView.AbstractC7716 m29831(int r17, boolean r18, long r19) {
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L230
                androidx.recyclerview.widget.RecyclerView r1 = r6.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r1 = r1.mState
                int r1 = r1.m29858()
                if (r3 >= r1) goto L230
                androidx.recyclerview.widget.RecyclerView r1 = r6.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r1 = r1.mState
                boolean r1 = r1.m29864()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L27
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r1 = r16.m29804(r17)
                if (r1 == 0) goto L28
                r4 = r7
                goto L29
            L27:
                r1 = r2
            L28:
                r4 = r8
            L29:
                if (r1 != 0) goto L5d
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r1 = r16.m29809(r17, r18)
                if (r1 == 0) goto L5d
                boolean r5 = r6.m29834(r1)
                if (r5 != 0) goto L5c
                if (r0 != 0) goto L5a
                r5 = 4
                r1.addFlags(r5)
                boolean r5 = r1.isScrap()
                if (r5 == 0) goto L4e
                androidx.recyclerview.widget.RecyclerView r5 = r6.f29635
                android.view.View r9 = r1.itemView
                r5.removeDetachedView(r9, r8)
                r1.unScrap()
                goto L57
            L4e:
                boolean r5 = r1.wasReturnedFromScrap()
                if (r5 == 0) goto L57
                r1.clearReturnedFromScrapFlag()
            L57:
                r6.m29825(r1)
            L5a:
                r1 = r2
                goto L5d
            L5c:
                r4 = r7
            L5d:
                if (r1 != 0) goto L14a
                androidx.recyclerview.widget.RecyclerView r5 = r6.f29635
                androidx.recyclerview.widget.ۥ r5 = r5.mAdapterHelper
                int r5 = r5.m30008(r3)
                if (r5 < 0) goto L14c
                androidx.recyclerview.widget.RecyclerView r9 = r6.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r9 = r9.mAdapter
                int r9 = r9.getItemCount()
                if (r5 >= r9) goto L14c
                androidx.recyclerview.widget.RecyclerView r9 = r6.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r9 = r9.mAdapter
                int r9 = r9.getItemViewType(r5)
                androidx.recyclerview.widget.RecyclerView r10 = r6.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r10 = r10.mAdapter
                boolean r10 = r10.hasStableIds()
                if (r10 == 0) goto L96
                androidx.recyclerview.widget.RecyclerView r1 = r6.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r1 = r1.mAdapter
                long r10 = r1.getItemId(r5)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r1 = r6.m29808(r10, r9, r0)
                if (r1 == 0) goto L96
                r1.mPosition = r5
                r4 = r7
            L96:
                if (r1 != 0) goto Leb
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۢ r0 = r6.f29634
                if (r0 == 0) goto Leb
                android.view.View r0 = r0.m29870(r6, r3, r9)
                if (r0 == 0) goto Leb
                androidx.recyclerview.widget.RecyclerView r1 = r6.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r1 = r1.getChildViewHolder(r0)
                if (r1 == 0) goto Lce
                boolean r0 = r1.shouldIgnore()
                if (r0 != 0) goto Lb1
                goto Leb
            Lb1:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = r6.f29635
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            Lce:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = r6.f29635
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            Leb:
                if (r1 != 0) goto L102
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ r0 = r16.m29805()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r0.m29786(r9)
                if (r0 == 0) goto L101
                r0.resetInternal()
                boolean r1 = androidx.recyclerview.widget.RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST
                if (r1 == 0) goto L101
                r6.m29814(r0)
            L101:
                r1 = r0
            L102:
                if (r1 != 0) goto L14a
                androidx.recyclerview.widget.RecyclerView r0 = r6.f29635
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L120
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ r10 = r6.f29633
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.m29795(r11, r12, r14)
                if (r5 != 0) goto L120
                return r2
            L120:
                androidx.recyclerview.widget.RecyclerView r2 = r6.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r5 = r2.mAdapter
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = r5.createViewHolder(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r5 == 0) goto L13b
                android.view.View r5 = r2.itemView
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.findNestedRecyclerView(r5)
                if (r5 == 0) goto L13b
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.mNestedRecyclerView = r10
            L13b:
                androidx.recyclerview.widget.RecyclerView r5 = r6.f29635
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ r5 = r6.f29633
                long r10 = r10 - r0
                r5.m29785(r9, r10)
                r9 = r2
            L148:
                r10 = r4
                goto L184
            L14a:
                r9 = r1
                goto L148
            L14c:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = r6.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r2 = r2.mState
                int r2 = r2.m29858()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = r6.f29635
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L184:
                if (r10 == 0) goto L1bc
                androidx.recyclerview.widget.RecyclerView r0 = r6.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r0.mState
                boolean r0 = r0.m29864()
                if (r0 != 0) goto L1bc
                r0 = 8192(0x2000, float:1.148E-41)
                boolean r1 = r9.hasAnyOfTheFlags(r0)
                if (r1 == 0) goto L1bc
                r9.setFlags(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = r6.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r0.mState
                boolean r0 = r0.f29659
                if (r0 == 0) goto L1bc
                int r0 = androidx.recyclerview.widget.RecyclerView.AbstractC7684.m29726(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = r6.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r2 = r1.mItemAnimator
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r1 = r1.mState
                java.util.List r4 = r9.getUnmodifiedPayloads()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟ r0 = r2.m29748(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = r6.f29635
                r1.recordAnimationInfoIfBouncedHiddenView(r9, r0)
            L1bc:
                androidx.recyclerview.widget.RecyclerView r0 = r6.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r0.mState
                boolean r0 = r0.m29864()
                if (r0 == 0) goto L1cf
                boolean r0 = r9.isBound()
                if (r0 == 0) goto L1cf
                r9.mPreLayoutPosition = r3
                goto L1e2
            L1cf:
                boolean r0 = r9.isBound()
                if (r0 == 0) goto L1e4
                boolean r0 = r9.needsUpdate()
                if (r0 != 0) goto L1e4
                boolean r0 = r9.isInvalid()
                if (r0 == 0) goto L1e2
                goto L1e4
            L1e2:
                r0 = r8
                goto L1f7
            L1e4:
                androidx.recyclerview.widget.RecyclerView r0 = r6.f29635
                androidx.recyclerview.widget.ۥ r0 = r0.mAdapterHelper
                int r2 = r0.m30008(r3)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r19
                boolean r0 = r0.m29830(r1, r2, r3, r4)
            L1f7:
                android.view.View r1 = r9.itemView
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L20d
                androidx.recyclerview.widget.RecyclerView r1 = r6.f29635
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r1 = (androidx.recyclerview.widget.RecyclerView.C7696) r1
                android.view.View r2 = r9.itemView
                r2.setLayoutParams(r1)
                goto L225
            L20d:
                androidx.recyclerview.widget.RecyclerView r2 = r6.f29635
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L223
                androidx.recyclerview.widget.RecyclerView r2 = r6.f29635
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams(r1)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r1 = (androidx.recyclerview.widget.RecyclerView.C7696) r1
                android.view.View r2 = r9.itemView
                r2.setLayoutParams(r1)
                goto L225
            L223:
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r1 = (androidx.recyclerview.widget.RecyclerView.C7696) r1
            L225:
                r1.f29615 = r9
                if (r10 == 0) goto L22c
                if (r0 == 0) goto L22c
                goto L22d
            L22c:
                r7 = r8
            L22d:
                r1.f29618 = r7
                return r9
            L230:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = r6.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r2 = r2.mState
                int r2 = r2.m29858()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = r6.f29635
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public void m29832(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r2) {
                r1 = this;
                boolean r0 = r2.mInChangeScrap
                if (r0 == 0) goto La
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r1.f29628
                r0.remove(r2)
                goto Lf
            La:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r1.f29627
                r0.remove(r2)
            Lf:
                r0 = 0
                r2.mScrapContainer = r0
                r0 = 0
                r2.mInChangeScrap = r0
                r2.clearReturnedFromScrapFlag()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public void m29833() {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r3.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r0.mLayout
                if (r0 == 0) goto L9
                int r0 = r0.mPrefetchMaxCountObserved
                goto La
            L9:
                r0 = 0
            La:
                int r1 = r3.f29631
                int r1 = r1 + r0
                r3.f29632 = r1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r3.f29629
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L17:
                if (r0 < 0) goto L29
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r1 = r3.f29629
                int r1 = r1.size()
                int r2 = r3.f29632
                if (r1 <= r2) goto L29
                r3.m29823(r0)
                int r0 = r0 + (-1)
                goto L17
            L29:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public boolean m29834(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r8) {
                r7 = this;
                boolean r0 = r8.isRemoved()
                if (r0 == 0) goto Lf
                androidx.recyclerview.widget.RecyclerView r8 = r7.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r8 = r8.mState
                boolean r8 = r8.m29864()
                return r8
            Lf:
                int r0 = r8.mPosition
                if (r0 < 0) goto L59
                androidx.recyclerview.widget.RecyclerView r1 = r7.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r1 = r1.mAdapter
                int r1 = r1.getItemCount()
                if (r0 >= r1) goto L59
                androidx.recyclerview.widget.RecyclerView r0 = r7.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r0.mState
                boolean r0 = r0.m29864()
                r1 = 0
                if (r0 != 0) goto L39
                androidx.recyclerview.widget.RecyclerView r0 = r7.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r0.mAdapter
                int r2 = r8.mPosition
                int r0 = r0.getItemViewType(r2)
                int r2 = r8.getItemViewType()
                if (r0 == r2) goto L39
                return r1
            L39:
                androidx.recyclerview.widget.RecyclerView r0 = r7.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r0.mAdapter
                boolean r0 = r0.hasStableIds()
                r2 = 1
                if (r0 == 0) goto L58
                long r3 = r8.getItemId()
                androidx.recyclerview.widget.RecyclerView r0 = r7.f29635
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r0.mAdapter
                int r8 = r8.mPosition
                long r5 = r0.getItemId(r8)
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 != 0) goto L57
                r1 = r2
            L57:
                return r1
            L58:
                return r2
            L59:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid view holder adapter position"
                r1.append(r2)
                r1.append(r8)
                androidx.recyclerview.widget.RecyclerView r8 = r7.f29635
                java.lang.String r8 = r8.exceptionLabel()
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                r0.<init>(r8)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public void m29835(int r4, int r5) {
                r3 = this;
                int r5 = r5 + r4
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r3.f29629
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L9:
                if (r0 < 0) goto L26
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r1 = r3.f29629
                java.lang.Object r1 = r1.get(r0)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r1 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r1
                if (r1 != 0) goto L16
                goto L23
            L16:
                int r2 = r1.mPosition
                if (r2 < r4) goto L23
                if (r2 >= r5) goto L23
                r2 = 2
                r1.addFlags(r2)
                r3.m29823(r0)
            L23:
                int r0 = r0 + (-1)
                goto L9
            L26:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۧ, reason: contains not printable characters */
    public interface InterfaceC7705 {
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        void m29836(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r1);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۨ, reason: contains not printable characters */
    public class C7706 extends androidx.recyclerview.widget.RecyclerView.AbstractC7680 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f29636;

        public C7706(androidx.recyclerview.widget.RecyclerView r1) {
                r0 = this;
                r0.f29636 = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7680
        public void onChanged() {
                r3 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r3.f29636
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                androidx.recyclerview.widget.RecyclerView r0 = r3.f29636
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r1 = r0.mState
                r2 = 1
                r1.f29655 = r2
                r0.processDataSetCompletelyChanged(r2)
                androidx.recyclerview.widget.RecyclerView r0 = r3.f29636
                androidx.recyclerview.widget.ۥ r0 = r0.mAdapterHelper
                boolean r0 = r0.m30011()
                if (r0 != 0) goto L1f
                androidx.recyclerview.widget.RecyclerView r0 = r3.f29636
                r0.requestLayout()
            L1f:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7680
        public void onItemRangeChanged(int r3, int r4, java.lang.Object r5) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29636
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29636
                androidx.recyclerview.widget.ۥ r0 = r0.mAdapterHelper
                boolean r3 = r0.m30013(r3, r4, r5)
                if (r3 == 0) goto L13
                r2.m29837()
            L13:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7680
        public void onItemRangeInserted(int r3, int r4) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29636
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29636
                androidx.recyclerview.widget.ۥ r0 = r0.mAdapterHelper
                boolean r3 = r0.m30014(r3, r4)
                if (r3 == 0) goto L13
                r2.m29837()
            L13:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7680
        public void onItemRangeMoved(int r3, int r4, int r5) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29636
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29636
                androidx.recyclerview.widget.ۥ r0 = r0.mAdapterHelper
                boolean r3 = r0.m30015(r3, r4, r5)
                if (r3 == 0) goto L13
                r2.m29837()
            L13:
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7680
        public void onItemRangeRemoved(int r3, int r4) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29636
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29636
                androidx.recyclerview.widget.ۥ r0 = r0.mAdapterHelper
                boolean r3 = r0.m30016(r3, r4)
                if (r3 == 0) goto L13
                r2.m29837()
            L13:
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m29837() {
                r2 = this;
                boolean r0 = androidx.recyclerview.widget.RecyclerView.POST_UPDATES_ON_ANIMATION
                if (r0 == 0) goto L14
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29636
                boolean r1 = r0.mHasFixedSize
                if (r1 == 0) goto L14
                boolean r1 = r0.mIsAttached
                if (r1 == 0) goto L14
                java.lang.Runnable r1 = r0.mUpdateChildViewsRunnable
                Yue.C6794.m26211(r0, r1)
                goto L1c
            L14:
                androidx.recyclerview.widget.RecyclerView r0 = r2.f29636
                r1 = 1
                r0.mAdapterUpdateDuringMeasure = r1
                r0.requestLayout()
            L1c:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public static class C7707 extends Yue.AbstractC0025 {
        public static final android.os.Parcelable.Creator<androidx.recyclerview.widget.RecyclerView.C7707> CREATOR = null;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public android.os.Parcelable f29637;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ$ۥ, reason: contains not printable characters */
        public static class C7708 implements android.os.Parcelable.ClassLoaderCreator<androidx.recyclerview.widget.RecyclerView.C7707> {
            public C7708() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ r1 = r0.m29839(r1)
                    return r1
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ androidx.recyclerview.widget.RecyclerView.C7707 createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                    r0 = this;
                    androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ r1 = r0.m29840(r1, r2)
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ[] r1 = r0.m29841(r1)
                    return r1
            }

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public androidx.recyclerview.widget.RecyclerView.C7707 m29839(android.os.Parcel r3) {
                    r2 = this;
                    androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ r0 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public androidx.recyclerview.widget.RecyclerView.C7707 m29840(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ r0 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ
                    r0.<init>(r2, r3)
                    return r0
            }

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public androidx.recyclerview.widget.RecyclerView.C7707[] m29841(int r1) {
                    r0 = this;
                    androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ[] r1 = new androidx.recyclerview.widget.RecyclerView.C7707[r1]
                    return r1
            }
        }

        static {
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ$ۥ r0 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ$ۥ
                r0.<init>()
                androidx.recyclerview.widget.RecyclerView.C7707.CREATOR = r0
                return
        }

        public C7707(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                if (r2 == 0) goto L6
                goto Lc
            L6:
                java.lang.Class<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠> r2 = androidx.recyclerview.widget.RecyclerView.AbstractC7691.class
                java.lang.ClassLoader r2 = r2.getClassLoader()
            Lc:
                android.os.Parcelable r1 = r1.readParcelable(r2)
                r0.f29637 = r1
                return
        }

        public C7707(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // Yue.AbstractC0025, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                super.writeToParcel(r2, r3)
                android.os.Parcelable r3 = r1.f29637
                r0 = 0
                r2.writeParcelable(r3, r0)
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m29838(androidx.recyclerview.widget.RecyclerView.C7707 r1) {
                r0 = this;
                android.os.Parcelable r1 = r1.f29637
                r0.f29637 = r1
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static class C7709 implements androidx.recyclerview.widget.RecyclerView.InterfaceC7699 {
        public C7709() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC7699
        /* JADX INFO: renamed from: ۥ */
        public void mo29778(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r1, @Yue.InterfaceC4410 android.view.MotionEvent r2) {
                r0 = this;
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC7699
        /* JADX INFO: renamed from: ۥ۟۟ */
        public boolean mo29779(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r1, @Yue.InterfaceC4410 android.view.MotionEvent r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC7699
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo29780(boolean r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static abstract class AbstractC7710 {
        private androidx.recyclerview.widget.RecyclerView.AbstractC7691 mLayoutManager;
        private boolean mPendingInitialRun;
        private androidx.recyclerview.widget.RecyclerView mRecyclerView;
        private final androidx.recyclerview.widget.RecyclerView.AbstractC7710.C7711 mRecyclingAction;
        private boolean mRunning;
        private boolean mStarted;
        private int mTargetPosition;
        private android.view.View mTargetView;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠$ۥ, reason: contains not printable characters */
        public static class C7711 {

            /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
            public static final int f29638 = Integer.MIN_VALUE;

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public int f29639;

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public int f29640;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public int f29641;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public int f29642;

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public android.view.animation.Interpolator f29643;

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public boolean f29644;

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public int f29645;

            public C7711(@Yue.InterfaceC4992 int r3, @Yue.InterfaceC4992 int r4) {
                    r2 = this;
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r1 = 0
                    r2.<init>(r3, r4, r0, r1)
                    return
            }

            public C7711(@Yue.InterfaceC4992 int r2, @Yue.InterfaceC4992 int r3, int r4) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r2, r3, r4, r0)
                    return
            }

            public C7711(@Yue.InterfaceC4992 int r2, @Yue.InterfaceC4992 int r3, int r4, @Yue.InterfaceC4544 android.view.animation.Interpolator r5) {
                    r1 = this;
                    r1.<init>()
                    r0 = -1
                    r1.f29642 = r0
                    r0 = 0
                    r1.f29644 = r0
                    r1.f29645 = r0
                    r1.f29639 = r2
                    r1.f29640 = r3
                    r1.f29641 = r4
                    r1.f29643 = r5
                    return
            }

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public int m29842() {
                    r1 = this;
                    int r0 = r1.f29641
                    return r0
            }

            @Yue.InterfaceC4992
            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public int m29843() {
                    r1 = this;
                    int r0 = r1.f29639
                    return r0
            }

            @Yue.InterfaceC4992
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public int m29844() {
                    r1 = this;
                    int r0 = r1.f29640
                    return r0
            }

            @Yue.InterfaceC4544
            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public android.view.animation.Interpolator m29845() {
                    r1 = this;
                    android.view.animation.Interpolator r0 = r1.f29643
                    return r0
            }

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public boolean m29846() {
                    r1 = this;
                    int r0 = r1.f29642
                    if (r0 < 0) goto L6
                    r0 = 1
                    goto L7
                L6:
                    r0 = 0
                L7:
                    return r0
            }

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public void m29847(int r1) {
                    r0 = this;
                    r0.f29642 = r1
                    return
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public void m29848(androidx.recyclerview.widget.RecyclerView r6) {
                    r5 = this;
                    int r0 = r5.f29642
                    r1 = 0
                    if (r0 < 0) goto Le
                    r2 = -1
                    r5.f29642 = r2
                    r6.jumpToPositionForSmoothScroller(r0)
                    r5.f29644 = r1
                    return
                Le:
                    boolean r0 = r5.f29644
                    if (r0 == 0) goto L36
                    r5.m29854()
                    androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟ۡ r6 = r6.mViewFlinger
                    int r0 = r5.f29639
                    int r2 = r5.f29640
                    int r3 = r5.f29641
                    android.view.animation.Interpolator r4 = r5.f29643
                    r6.m29876(r0, r2, r3, r4)
                    int r6 = r5.f29645
                    int r6 = r6 + 1
                    r5.f29645 = r6
                    r0 = 10
                    if (r6 <= r0) goto L33
                    java.lang.String r6 = "RecyclerView"
                    java.lang.String r0 = "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary"
                    android.util.Log.e(r6, r0)
                L33:
                    r5.f29644 = r1
                    goto L38
                L36:
                    r5.f29645 = r1
                L38:
                    return
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
            public void m29849(int r2) {
                    r1 = this;
                    r0 = 1
                    r1.f29644 = r0
                    r1.f29641 = r2
                    return
            }

            /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
            public void m29850(@Yue.InterfaceC4992 int r2) {
                    r1 = this;
                    r0 = 1
                    r1.f29644 = r0
                    r1.f29639 = r2
                    return
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
            public void m29851(@Yue.InterfaceC4992 int r2) {
                    r1 = this;
                    r0 = 1
                    r1.f29644 = r0
                    r1.f29640 = r2
                    return
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
            public void m29852(@Yue.InterfaceC4544 android.view.animation.Interpolator r2) {
                    r1 = this;
                    r0 = 1
                    r1.f29644 = r0
                    r1.f29643 = r2
                    return
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
            public void m29853(@Yue.InterfaceC4992 int r1, @Yue.InterfaceC4992 int r2, int r3, @Yue.InterfaceC4544 android.view.animation.Interpolator r4) {
                    r0 = this;
                    r0.f29639 = r1
                    r0.f29640 = r2
                    r0.f29641 = r3
                    r0.f29643 = r4
                    r1 = 1
                    r0.f29644 = r1
                    return
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
            public final void m29854() {
                    r2 = this;
                    android.view.animation.Interpolator r0 = r2.f29643
                    r1 = 1
                    if (r0 == 0) goto L12
                    int r0 = r2.f29641
                    if (r0 < r1) goto La
                    goto L12
                La:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "If you provide an interpolator, you must set a positive duration"
                    r0.<init>(r1)
                    throw r0
                L12:
                    int r0 = r2.f29641
                    if (r0 < r1) goto L17
                    return
                L17:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "Scroll duration must be a positive number"
                    r0.<init>(r1)
                    throw r0
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠$ۥ۟, reason: contains not printable characters */
        public interface InterfaceC7712 {
            @Yue.InterfaceC4544
            android.graphics.PointF computeScrollVectorForPosition(int r1);
        }

        public AbstractC7710() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.mTargetPosition = r0
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠$ۥ r0 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠$ۥ
                r1 = 0
                r0.<init>(r1, r1)
                r2.mRecyclingAction = r0
                return
        }

        @Yue.InterfaceC4544
        public android.graphics.PointF computeScrollVectorForPosition(int r3) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.getLayoutManager()
                boolean r1 = r0 instanceof androidx.recyclerview.widget.RecyclerView.AbstractC7710.InterfaceC7712
                if (r1 == 0) goto Lf
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠$ۥ۟ r0 = (androidx.recyclerview.widget.RecyclerView.AbstractC7710.InterfaceC7712) r0
                android.graphics.PointF r3 = r0.computeScrollVectorForPosition(r3)
                return r3
            Lf:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "You should override computeScrollVectorForPosition when the LayoutManager does not implement "
                r3.append(r0)
                java.lang.Class<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠$ۥ۟> r0 = androidx.recyclerview.widget.RecyclerView.AbstractC7710.InterfaceC7712.class
                java.lang.String r0 = r0.getCanonicalName()
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                java.lang.String r0 = "RecyclerView"
                android.util.Log.w(r0, r3)
                r3 = 0
                return r3
        }

        public android.view.View findViewByPosition(int r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r0.mLayout
                android.view.View r2 = r0.findViewByPosition(r2)
                return r2
        }

        public int getChildCount() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r0.mLayout
                int r0 = r0.getChildCount()
                return r0
        }

        public int getChildPosition(android.view.View r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                int r2 = r0.getChildLayoutPosition(r2)
                return r2
        }

        @Yue.InterfaceC4544
        public androidx.recyclerview.widget.RecyclerView.AbstractC7691 getLayoutManager() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.mLayoutManager
                return r0
        }

        public int getTargetPosition() {
                r1 = this;
                int r0 = r1.mTargetPosition
                return r0
        }

        @java.lang.Deprecated
        public void instantScrollToPosition(int r2) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
                r0.scrollToPosition(r2)
                return
        }

        public boolean isPendingInitialRun() {
                r1 = this;
                boolean r0 = r1.mPendingInitialRun
                return r0
        }

        public boolean isRunning() {
                r1 = this;
                boolean r0 = r1.mRunning
                return r0
        }

        public void normalize(@Yue.InterfaceC4410 android.graphics.PointF r3) {
                r2 = this;
                float r0 = r3.x
                float r0 = r0 * r0
                float r1 = r3.y
                float r1 = r1 * r1
                float r0 = r0 + r1
                double r0 = (double) r0
                double r0 = java.lang.Math.sqrt(r0)
                float r0 = (float) r0
                float r1 = r3.x
                float r1 = r1 / r0
                r3.x = r1
                float r1 = r3.y
                float r1 = r1 / r0
                r3.y = r1
                return
        }

        public void onAnimation(int r7, int r8) {
                r6 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r6.mRecyclerView
                int r1 = r6.mTargetPosition
                r2 = -1
                if (r1 == r2) goto L9
                if (r0 != 0) goto Lc
            L9:
                r6.stop()
            Lc:
                boolean r1 = r6.mPendingInitialRun
                r2 = 0
                if (r1 == 0) goto L3d
                android.view.View r1 = r6.mTargetView
                if (r1 != 0) goto L3d
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r6.mLayoutManager
                if (r1 == 0) goto L3d
                int r1 = r6.mTargetPosition
                android.graphics.PointF r1 = r6.computeScrollVectorForPosition(r1)
                if (r1 == 0) goto L3d
                float r3 = r1.x
                r4 = 0
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 != 0) goto L2e
                float r5 = r1.y
                int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r4 == 0) goto L3d
            L2e:
                float r3 = java.lang.Math.signum(r3)
                int r3 = (int) r3
                float r1 = r1.y
                float r1 = java.lang.Math.signum(r1)
                int r1 = (int) r1
                r0.scrollStep(r3, r1, r2)
            L3d:
                r1 = 0
                r6.mPendingInitialRun = r1
                android.view.View r1 = r6.mTargetView
                if (r1 == 0) goto L67
                int r1 = r6.getChildPosition(r1)
                int r3 = r6.mTargetPosition
                if (r1 != r3) goto L5e
                android.view.View r1 = r6.mTargetView
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r2 = r0.mState
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠$ۥ r3 = r6.mRecyclingAction
                r6.onTargetFound(r1, r2, r3)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠$ۥ r1 = r6.mRecyclingAction
                r1.m29848(r0)
                r6.stop()
                goto L67
            L5e:
                java.lang.String r1 = "RecyclerView"
                java.lang.String r3 = "Passed over target position while smooth scrolling."
                android.util.Log.e(r1, r3)
                r6.mTargetView = r2
            L67:
                boolean r1 = r6.mRunning
                if (r1 == 0) goto L8b
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r1 = r0.mState
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠$ۥ r2 = r6.mRecyclingAction
                r6.onSeekTargetStep(r7, r8, r1, r2)
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠$ۥ r7 = r6.mRecyclingAction
                boolean r7 = r7.m29846()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠$ۥ r8 = r6.mRecyclingAction
                r8.m29848(r0)
                if (r7 == 0) goto L8b
                boolean r7 = r6.mRunning
                if (r7 == 0) goto L8b
                r7 = 1
                r6.mPendingInitialRun = r7
                androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟ۡ r7 = r0.mViewFlinger
                r7.m29875()
            L8b:
                return
        }

        public void onChildAttachedToWindow(android.view.View r3) {
                r2 = this;
                int r0 = r2.getChildPosition(r3)
                int r1 = r2.getTargetPosition()
                if (r0 != r1) goto Lc
                r2.mTargetView = r3
            Lc:
                return
        }

        public abstract void onSeekTargetStep(@Yue.InterfaceC4992 int r1, @Yue.InterfaceC4992 int r2, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r3, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7710.C7711 r4);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(@Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r2, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7710.C7711 r3);

        public void setTargetPosition(int r1) {
                r0 = this;
                r0.mTargetPosition = r1
                return
        }

        public void start(androidx.recyclerview.widget.RecyclerView r3, androidx.recyclerview.widget.RecyclerView.AbstractC7691 r4) {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟ۡ r0 = r3.mViewFlinger
                r0.m29877()
                boolean r0 = r2.mStarted
                if (r0 == 0) goto L3c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "An instance of "
                r0.append(r1)
                java.lang.Class r1 = r2.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r1 = " was started more than once. Each instance of"
                r0.append(r1)
                java.lang.Class r1 = r2.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r1 = " is intended to only be used once. You should create a new instance for each use."
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "RecyclerView"
                android.util.Log.w(r1, r0)
            L3c:
                r2.mRecyclerView = r3
                r2.mLayoutManager = r4
                int r4 = r2.mTargetPosition
                r0 = -1
                if (r4 == r0) goto L65
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r3 = r3.mState
                r3.f29649 = r4
                r3 = 1
                r2.mRunning = r3
                r2.mPendingInitialRun = r3
                int r4 = r2.getTargetPosition()
                android.view.View r4 = r2.findViewByPosition(r4)
                r2.mTargetView = r4
                r2.onStart()
                androidx.recyclerview.widget.RecyclerView r4 = r2.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟ۡ r4 = r4.mViewFlinger
                r4.m29875()
                r2.mStarted = r3
                return
            L65:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r4 = "Invalid target position"
                r3.<init>(r4)
                throw r3
        }

        public final void stop() {
                r3 = this;
                boolean r0 = r3.mRunning
                if (r0 != 0) goto L5
                return
            L5:
                r0 = 0
                r3.mRunning = r0
                r3.onStop()
                androidx.recyclerview.widget.RecyclerView r1 = r3.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r1 = r1.mState
                r2 = -1
                r1.f29649 = r2
                r1 = 0
                r3.mTargetView = r1
                r3.mTargetPosition = r2
                r3.mPendingInitialRun = r0
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r3.mLayoutManager
                r0.onSmoothScrollerStopped(r3)
                r3.mLayoutManager = r1
                r3.mRecyclerView = r1
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static class C7713 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static final int f29646 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static final int f29647 = 2;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final int f29648 = 4;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int f29649;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public android.util.SparseArray<java.lang.Object> f29650;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f29651;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f29652;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f29653;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f29654;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean f29655;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public boolean f29656;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public boolean f29657;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public boolean f29658;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public boolean f29659;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public boolean f29660;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public int f29661;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public long f29662;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public int f29663;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public int f29664;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public int f29665;

        public C7713() {
                r2 = this;
                r2.<init>()
                r0 = -1
                r2.f29649 = r0
                r0 = 0
                r2.f29651 = r0
                r2.f29652 = r0
                r1 = 1
                r2.f29653 = r1
                r2.f29654 = r0
                r2.f29655 = r0
                r2.f29656 = r0
                r2.f29657 = r0
                r2.f29658 = r0
                r2.f29659 = r0
                r2.f29660 = r0
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "State{mTargetPosition="
                r0.append(r1)
                int r1 = r2.f29649
                r0.append(r1)
                java.lang.String r1 = ", mData="
                r0.append(r1)
                android.util.SparseArray<java.lang.Object> r1 = r2.f29650
                r0.append(r1)
                java.lang.String r1 = ", mItemCount="
                r0.append(r1)
                int r1 = r2.f29654
                r0.append(r1)
                java.lang.String r1 = ", mIsMeasuring="
                r0.append(r1)
                boolean r1 = r2.f29658
                r0.append(r1)
                java.lang.String r1 = ", mPreviousLayoutItemCount="
                r0.append(r1)
                int r1 = r2.f29651
                r0.append(r1)
                java.lang.String r1 = ", mDeletedInvisibleItemCountSincePreviousLayout="
                r0.append(r1)
                int r1 = r2.f29652
                r0.append(r1)
                java.lang.String r1 = ", mStructureChanged="
                r0.append(r1)
                boolean r1 = r2.f29655
                r0.append(r1)
                java.lang.String r1 = ", mInPreLayout="
                r0.append(r1)
                boolean r1 = r2.f29656
                r0.append(r1)
                java.lang.String r1 = ", mRunSimpleAnimations="
                r0.append(r1)
                boolean r1 = r2.f29659
                r0.append(r1)
                java.lang.String r1 = ", mRunPredictiveAnimations="
                r0.append(r1)
                boolean r1 = r2.f29660
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m29855(int r4) {
                r3 = this;
                int r0 = r3.f29653
                r0 = r0 & r4
                if (r0 == 0) goto L6
                return
            L6:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Layout state should be one of "
                r1.append(r2)
                java.lang.String r4 = java.lang.Integer.toBinaryString(r4)
                r1.append(r4)
                java.lang.String r4 = " but it is "
                r1.append(r4)
                int r4 = r3.f29653
                java.lang.String r4 = java.lang.Integer.toBinaryString(r4)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean m29856() {
                r1 = this;
                boolean r0 = r1.f29655
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public <T> T m29857(int r2) {
                r1 = this;
                android.util.SparseArray<java.lang.Object> r0 = r1.f29650
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m29858() {
                r2 = this;
                boolean r0 = r2.f29656
                if (r0 == 0) goto La
                int r0 = r2.f29651
                int r1 = r2.f29652
                int r0 = r0 - r1
                goto Lc
            La:
                int r0 = r2.f29654
            Lc:
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m29859() {
                r1 = this;
                int r0 = r1.f29664
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int m29860() {
                r1 = this;
                int r0 = r1.f29665
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int m29861() {
                r1 = this;
                int r0 = r1.f29649
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public boolean m29862() {
                r2 = this;
                int r0 = r2.f29649
                r1 = -1
                if (r0 == r1) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                return r0
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public boolean m29863() {
                r1 = this;
                boolean r0 = r1.f29658
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public boolean m29864() {
                r1 = this;
                boolean r0 = r1.f29656
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void m29865(androidx.recyclerview.widget.RecyclerView.AbstractC7678 r2) {
                r1 = this;
                r0 = 1
                r1.f29653 = r0
                int r2 = r2.getItemCount()
                r1.f29654 = r2
                r2 = 0
                r1.f29656 = r2
                r1.f29657 = r2
                r1.f29658 = r2
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public void m29866(int r2, java.lang.Object r3) {
                r1 = this;
                android.util.SparseArray<java.lang.Object> r0 = r1.f29650
                if (r0 != 0) goto Lb
                android.util.SparseArray r0 = new android.util.SparseArray
                r0.<init>()
                r1.f29650 = r0
            Lb:
                android.util.SparseArray<java.lang.Object> r0 = r1.f29650
                r0.put(r2, r3)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public void m29867(int r2) {
                r1 = this;
                android.util.SparseArray<java.lang.Object> r0 = r1.f29650
                if (r0 != 0) goto L5
                return
            L5:
                r0.remove(r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public boolean m29868() {
                r1 = this;
                boolean r0 = r1.f29660
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public boolean m29869() {
                r1 = this;
                boolean r0 = r1.f29659
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static abstract class AbstractC7714 {
        public AbstractC7714() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4544
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public abstract android.view.View m29870(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7704 r1, int r2, int r3);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟ۡ, reason: contains not printable characters */
    public class RunnableC7715 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f29666;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f29667;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public android.widget.OverScroller f29668;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public android.view.animation.Interpolator f29669;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public boolean f29670;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public boolean f29671;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f29672;

        public RunnableC7715(androidx.recyclerview.widget.RecyclerView r3) {
                r2 = this;
                r2.f29672 = r3
                r2.<init>()
                android.view.animation.Interpolator r0 = androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator
                r2.f29669 = r0
                r1 = 0
                r2.f29670 = r1
                r2.f29671 = r1
                android.widget.OverScroller r1 = new android.widget.OverScroller
                android.content.Context r3 = r3.getContext()
                r1.<init>(r3, r0)
                r2.f29668 = r1
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r22 = this;
                r0 = r22
                androidx.recyclerview.widget.RecyclerView r1 = r0.f29672
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r2 = r1.mLayout
                if (r2 != 0) goto Lc
                r22.m29877()
                return
            Lc:
                r2 = 0
                r0.f29671 = r2
                r3 = 1
                r0.f29670 = r3
                r1.consumePendingUpdateOperations()
                android.widget.OverScroller r1 = r0.f29668
                boolean r4 = r1.computeScrollOffset()
                if (r4 == 0) goto L165
                int r4 = r1.getCurrX()
                int r5 = r1.getCurrY()
                int r6 = r0.f29666
                int r6 = r4 - r6
                int r7 = r0.f29667
                int r13 = r5 - r7
                r0.f29666 = r4
                r0.f29667 = r5
                androidx.recyclerview.widget.RecyclerView r7 = r0.f29672
                int[] r10 = r7.mReusableIntPair
                r10[r2] = r2
                r10[r3] = r2
                r11 = 0
                r12 = 1
                r8 = r6
                r9 = r13
                boolean r4 = r7.dispatchNestedPreScroll(r8, r9, r10, r11, r12)
                if (r4 == 0) goto L4d
                androidx.recyclerview.widget.RecyclerView r4 = r0.f29672
                int[] r4 = r4.mReusableIntPair
                r5 = r4[r2]
                int r6 = r6 - r5
                r4 = r4[r3]
                int r13 = r13 - r4
            L4d:
                androidx.recyclerview.widget.RecyclerView r4 = r0.f29672
                int r4 = r4.getOverScrollMode()
                r5 = 2
                if (r4 == r5) goto L5b
                androidx.recyclerview.widget.RecyclerView r4 = r0.f29672
                r4.considerReleasingGlowsOnScroll(r6, r13)
            L5b:
                androidx.recyclerview.widget.RecyclerView r4 = r0.f29672
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r7 = r4.mAdapter
                if (r7 == 0) goto La6
                int[] r7 = r4.mReusableIntPair
                r7[r2] = r2
                r7[r3] = r2
                r4.scrollStep(r6, r13, r7)
                androidx.recyclerview.widget.RecyclerView r4 = r0.f29672
                int[] r7 = r4.mReusableIntPair
                r8 = r7[r2]
                r7 = r7[r3]
                int r6 = r6 - r8
                int r13 = r13 - r7
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r4 = r4.mLayout
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠ r4 = r4.mSmoothScroller
                if (r4 == 0) goto La8
                boolean r9 = r4.isPendingInitialRun()
                if (r9 != 0) goto La8
                boolean r9 = r4.isRunning()
                if (r9 == 0) goto La8
                androidx.recyclerview.widget.RecyclerView r9 = r0.f29672
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r9 = r9.mState
                int r9 = r9.m29858()
                if (r9 != 0) goto L94
                r4.stop()
                goto La8
            L94:
                int r10 = r4.getTargetPosition()
                if (r10 < r9) goto La2
                int r9 = r9 - r3
                r4.setTargetPosition(r9)
                r4.onAnimation(r8, r7)
                goto La8
            La2:
                r4.onAnimation(r8, r7)
                goto La8
            La6:
                r7 = r2
                r8 = r7
            La8:
                androidx.recyclerview.widget.RecyclerView r4 = r0.f29672
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ> r4 = r4.mItemDecorations
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto Lb7
                androidx.recyclerview.widget.RecyclerView r4 = r0.f29672
                r4.invalidate()
            Lb7:
                androidx.recyclerview.widget.RecyclerView r14 = r0.f29672
                int[] r4 = r14.mReusableIntPair
                r4[r2] = r2
                r4[r3] = r2
                r19 = 0
                r20 = 1
                r15 = r8
                r16 = r7
                r17 = r6
                r18 = r13
                r21 = r4
                r14.dispatchNestedScroll(r15, r16, r17, r18, r19, r20, r21)
                androidx.recyclerview.widget.RecyclerView r4 = r0.f29672
                int[] r9 = r4.mReusableIntPair
                r10 = r9[r2]
                int r6 = r6 - r10
                r9 = r9[r3]
                int r13 = r13 - r9
                if (r8 != 0) goto Ldd
                if (r7 == 0) goto Le0
            Ldd:
                r4.dispatchOnScrolled(r8, r7)
            Le0:
                androidx.recyclerview.widget.RecyclerView r4 = r0.f29672
                boolean r4 = androidx.recyclerview.widget.RecyclerView.access$200(r4)
                if (r4 != 0) goto Led
                androidx.recyclerview.widget.RecyclerView r4 = r0.f29672
                r4.invalidate()
            Led:
                int r4 = r1.getCurrX()
                int r9 = r1.getFinalX()
                if (r4 != r9) goto Lf9
                r4 = r3
                goto Lfa
            Lf9:
                r4 = r2
            Lfa:
                int r9 = r1.getCurrY()
                int r10 = r1.getFinalY()
                if (r9 != r10) goto L106
                r9 = r3
                goto L107
            L106:
                r9 = r2
            L107:
                boolean r10 = r1.isFinished()
                if (r10 != 0) goto L118
                if (r4 != 0) goto L111
                if (r6 == 0) goto L116
            L111:
                if (r9 != 0) goto L118
                if (r13 == 0) goto L116
                goto L118
            L116:
                r4 = r2
                goto L119
            L118:
                r4 = r3
            L119:
                androidx.recyclerview.widget.RecyclerView r9 = r0.f29672
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r9 = r9.mLayout
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠ r9 = r9.mSmoothScroller
                if (r9 == 0) goto L128
                boolean r9 = r9.isPendingInitialRun()
                if (r9 == 0) goto L128
                goto L159
            L128:
                if (r4 == 0) goto L159
                androidx.recyclerview.widget.RecyclerView r4 = r0.f29672
                int r4 = r4.getOverScrollMode()
                if (r4 == r5) goto L14d
                float r1 = r1.getCurrVelocity()
                int r1 = (int) r1
                if (r6 >= 0) goto L13b
                int r4 = -r1
                goto L140
            L13b:
                if (r6 <= 0) goto L13f
                r4 = r1
                goto L140
            L13f:
                r4 = r2
            L140:
                if (r13 >= 0) goto L144
                int r1 = -r1
                goto L148
            L144:
                if (r13 <= 0) goto L147
                goto L148
            L147:
                r1 = r2
            L148:
                androidx.recyclerview.widget.RecyclerView r5 = r0.f29672
                r5.absorbGlows(r4, r1)
            L14d:
                boolean r1 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r1 == 0) goto L165
                androidx.recyclerview.widget.RecyclerView r1 = r0.f29672
                androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟ r1 = r1.mPrefetchRegistry
                r1.m30145()
                goto L165
            L159:
                r22.m29875()
                androidx.recyclerview.widget.RecyclerView r1 = r0.f29672
                androidx.recyclerview.widget.ۥ۟۟۟ۤ r4 = r1.mGapWorker
                if (r4 == 0) goto L165
                r4.m30139(r1, r8, r7)
            L165:
                androidx.recyclerview.widget.RecyclerView r1 = r0.f29672
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r1.mLayout
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠ r1 = r1.mSmoothScroller
                if (r1 == 0) goto L176
                boolean r4 = r1.isPendingInitialRun()
                if (r4 == 0) goto L176
                r1.onAnimation(r2, r2)
            L176:
                r0.f29670 = r2
                boolean r1 = r0.f29671
                if (r1 == 0) goto L180
                r22.m29874()
                goto L18a
            L180:
                androidx.recyclerview.widget.RecyclerView r1 = r0.f29672
                r1.setScrollState(r2)
                androidx.recyclerview.widget.RecyclerView r1 = r0.f29672
                r1.stopNestedScroll(r3)
            L18a:
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final int m29871(int r5, int r6, int r7, int r8) {
                r4 = this;
                int r0 = java.lang.Math.abs(r5)
                int r1 = java.lang.Math.abs(r6)
                if (r0 <= r1) goto Lc
                r2 = 1
                goto Ld
            Lc:
                r2 = 0
            Ld:
                int r7 = r7 * r7
                int r8 = r8 * r8
                int r7 = r7 + r8
                double r7 = (double) r7
                double r7 = java.lang.Math.sqrt(r7)
                int r7 = (int) r7
                int r5 = r5 * r5
                int r6 = r6 * r6
                int r5 = r5 + r6
                double r5 = (double) r5
                double r5 = java.lang.Math.sqrt(r5)
                int r5 = (int) r5
                androidx.recyclerview.widget.RecyclerView r6 = r4.f29672
                if (r2 == 0) goto L28
                int r6 = r6.getWidth()
                goto L2c
            L28:
                int r6 = r6.getHeight()
            L2c:
                int r8 = r6 / 2
                float r5 = (float) r5
                r3 = 1065353216(0x3f800000, float:1.0)
                float r5 = r5 * r3
                float r6 = (float) r6
                float r5 = r5 / r6
                float r5 = java.lang.Math.min(r3, r5)
                float r8 = (float) r8
                float r5 = r4.m29872(r5)
                float r5 = r5 * r8
                float r8 = r8 + r5
                if (r7 <= 0) goto L51
                float r5 = (float) r7
                float r8 = r8 / r5
                float r5 = java.lang.Math.abs(r8)
                r6 = 1148846080(0x447a0000, float:1000.0)
                float r5 = r5 * r6
                int r5 = java.lang.Math.round(r5)
                int r5 = r5 * 4
                goto L5c
            L51:
                if (r2 == 0) goto L54
                goto L55
            L54:
                r0 = r1
            L55:
                float r5 = (float) r0
                float r5 = r5 / r6
                float r5 = r5 + r3
                r6 = 1133903872(0x43960000, float:300.0)
                float r5 = r5 * r6
                int r5 = (int) r5
            L5c:
                r6 = 2000(0x7d0, float:2.803E-42)
                int r5 = java.lang.Math.min(r5, r6)
                return r5
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final float m29872(float r3) {
                r2 = this;
                r0 = 1056964608(0x3f000000, float:0.5)
                float r3 = r3 - r0
                r0 = 1055999547(0x3ef1463b, float:0.47123894)
                float r3 = r3 * r0
                double r0 = (double) r3
                double r0 = java.lang.Math.sin(r0)
                float r3 = (float) r0
                return r3
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m29873(int r13, int r14) {
                r12 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r12.f29672
                r1 = 2
                r0.setScrollState(r1)
                r0 = 0
                r12.f29667 = r0
                r12.f29666 = r0
                android.view.animation.Interpolator r0 = r12.f29669
                android.view.animation.Interpolator r1 = androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator
                if (r0 == r1) goto L20
                r12.f29669 = r1
                android.widget.OverScroller r0 = new android.widget.OverScroller
                androidx.recyclerview.widget.RecyclerView r2 = r12.f29672
                android.content.Context r2 = r2.getContext()
                r0.<init>(r2, r1)
                r12.f29668 = r0
            L20:
                android.widget.OverScroller r3 = r12.f29668
                r10 = -2147483648(0xffffffff80000000, float:-0.0)
                r11 = 2147483647(0x7fffffff, float:NaN)
                r4 = 0
                r5 = 0
                r8 = -2147483648(0xffffffff80000000, float:-0.0)
                r9 = 2147483647(0x7fffffff, float:NaN)
                r6 = r13
                r7 = r14
                r3.fling(r4, r5, r6, r7, r8, r9, r10, r11)
                r12.m29875()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m29874() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.f29672
                r0.removeCallbacks(r1)
                androidx.recyclerview.widget.RecyclerView r0 = r1.f29672
                Yue.C6794.m26211(r0, r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m29875() {
                r1 = this;
                boolean r0 = r1.f29670
                if (r0 == 0) goto L8
                r0 = 1
                r1.f29671 = r0
                goto Lb
            L8:
                r1.m29874()
            Lb:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void m29876(int r9, int r10, int r11, @Yue.InterfaceC4544 android.view.animation.Interpolator r12) {
                r8 = this;
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = 0
                if (r11 != r0) goto L9
                int r11 = r8.m29871(r9, r10, r1, r1)
            L9:
                r7 = r11
                if (r12 != 0) goto Le
                android.view.animation.Interpolator r12 = androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator
            Le:
                android.view.animation.Interpolator r11 = r8.f29669
                if (r11 == r12) goto L21
                r8.f29669 = r12
                android.widget.OverScroller r11 = new android.widget.OverScroller
                androidx.recyclerview.widget.RecyclerView r0 = r8.f29672
                android.content.Context r0 = r0.getContext()
                r11.<init>(r0, r12)
                r8.f29668 = r11
            L21:
                r8.f29667 = r1
                r8.f29666 = r1
                androidx.recyclerview.widget.RecyclerView r11 = r8.f29672
                r12 = 2
                r11.setScrollState(r12)
                android.widget.OverScroller r2 = r8.f29668
                r3 = 0
                r4 = 0
                r5 = r9
                r6 = r10
                r2.startScroll(r3, r4, r5, r6, r7)
                r8.m29875()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m29877() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.f29672
                r0.removeCallbacks(r1)
                android.widget.OverScroller r0 = r1.f29668
                r0.abortAnimation()
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static abstract class AbstractC7716 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final java.util.List<java.lang.Object> FULLUPDATE_PAYLOADS = null;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        @Yue.InterfaceC4410
        public final android.view.View itemView;
        int mFlags;
        boolean mInChangeScrap;
        private int mIsRecyclableCount;
        long mItemId;
        int mItemViewType;
        java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> mNestedRecyclerView;
        int mOldPosition;
        androidx.recyclerview.widget.RecyclerView mOwnerRecyclerView;
        java.util.List<java.lang.Object> mPayloads;

        @Yue.InterfaceC6959
        int mPendingAccessibilityState;
        int mPosition;
        int mPreLayoutPosition;
        androidx.recyclerview.widget.RecyclerView.C7704 mScrapContainer;
        androidx.recyclerview.widget.RecyclerView.AbstractC7716 mShadowedHolder;
        androidx.recyclerview.widget.RecyclerView.AbstractC7716 mShadowingHolder;
        java.util.List<java.lang.Object> mUnmodifiedPayloads;
        private int mWasImportantForAccessibilityBeforeHidden;

        static {
                java.util.List r0 = java.util.Collections.emptyList()
                androidx.recyclerview.widget.RecyclerView.AbstractC7716.FULLUPDATE_PAYLOADS = r0
                return
        }

        public AbstractC7716(@Yue.InterfaceC4410 android.view.View r4) {
                r3 = this;
                r3.<init>()
                r0 = -1
                r3.mPosition = r0
                r3.mOldPosition = r0
                r1 = -1
                r3.mItemId = r1
                r3.mItemViewType = r0
                r3.mPreLayoutPosition = r0
                r1 = 0
                r3.mShadowedHolder = r1
                r3.mShadowingHolder = r1
                r3.mPayloads = r1
                r3.mUnmodifiedPayloads = r1
                r2 = 0
                r3.mIsRecyclableCount = r2
                r3.mScrapContainer = r1
                r3.mInChangeScrap = r2
                r3.mWasImportantForAccessibilityBeforeHidden = r2
                r3.mPendingAccessibilityState = r0
                if (r4 == 0) goto L29
                r3.itemView = r4
                return
            L29:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "itemView may not be null"
                r4.<init>(r0)
                throw r4
        }

        public void addChangePayload(java.lang.Object r3) {
                r2 = this;
                r0 = 1024(0x400, float:1.435E-42)
                if (r3 != 0) goto L8
                r2.addFlags(r0)
                goto L15
            L8:
                int r1 = r2.mFlags
                r0 = r0 & r1
                if (r0 != 0) goto L15
                r2.m29878()
                java.util.List<java.lang.Object> r0 = r2.mPayloads
                r0.add(r3)
            L15:
                return
        }

        public void addFlags(int r2) {
                r1 = this;
                int r0 = r1.mFlags
                r2 = r2 | r0
                r1.mFlags = r2
                return
        }

        public void clearOldPosition() {
                r1 = this;
                r0 = -1
                r1.mOldPosition = r0
                r1.mPreLayoutPosition = r0
                return
        }

        public void clearPayload() {
                r1 = this;
                java.util.List<java.lang.Object> r0 = r1.mPayloads
                if (r0 == 0) goto L7
                r0.clear()
            L7:
                int r0 = r1.mFlags
                r0 = r0 & (-1025(0xfffffffffffffbff, float:NaN))
                r1.mFlags = r0
                return
        }

        public void clearReturnedFromScrapFlag() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & (-33)
                r1.mFlags = r0
                return
        }

        public void clearTmpDetachFlag() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & (-257(0xfffffffffffffeff, float:NaN))
                r1.mFlags = r0
                return
        }

        public boolean doesTransientStatePreventRecycling() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 16
                if (r0 != 0) goto L10
                android.view.View r0 = r1.itemView
                boolean r0 = Yue.C6794.m26179(r0)
                if (r0 == 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }

        public void flagRemovedAndOffsetPosition(int r2, int r3, boolean r4) {
                r1 = this;
                r0 = 8
                r1.addFlags(r0)
                r1.offsetPosition(r3, r4)
                r1.mPosition = r2
                return
        }

        public final int getAdapterPosition() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r1.mOwnerRecyclerView
                if (r0 != 0) goto L6
                r0 = -1
                return r0
            L6:
                int r0 = r0.getAdapterPositionFor(r1)
                return r0
        }

        public final long getItemId() {
                r2 = this;
                long r0 = r2.mItemId
                return r0
        }

        public final int getItemViewType() {
                r1 = this;
                int r0 = r1.mItemViewType
                return r0
        }

        public final int getLayoutPosition() {
                r2 = this;
                int r0 = r2.mPreLayoutPosition
                r1 = -1
                if (r0 != r1) goto L7
                int r0 = r2.mPosition
            L7:
                return r0
        }

        public final int getOldPosition() {
                r1 = this;
                int r0 = r1.mOldPosition
                return r0
        }

        @java.lang.Deprecated
        public final int getPosition() {
                r2 = this;
                int r0 = r2.mPreLayoutPosition
                r1 = -1
                if (r0 != r1) goto L7
                int r0 = r2.mPosition
            L7:
                return r0
        }

        public java.util.List<java.lang.Object> getUnmodifiedPayloads() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 != 0) goto L17
                java.util.List<java.lang.Object> r0 = r1.mPayloads
                if (r0 == 0) goto L14
                int r0 = r0.size()
                if (r0 != 0) goto L11
                goto L14
            L11:
                java.util.List<java.lang.Object> r0 = r1.mUnmodifiedPayloads
                return r0
            L14:
                java.util.List<java.lang.Object> r0 = androidx.recyclerview.widget.RecyclerView.AbstractC7716.FULLUPDATE_PAYLOADS
                return r0
            L17:
                java.util.List<java.lang.Object> r0 = androidx.recyclerview.widget.RecyclerView.AbstractC7716.FULLUPDATE_PAYLOADS
                return r0
        }

        public boolean hasAnyOfTheFlags(int r2) {
                r1 = this;
                int r0 = r1.mFlags
                r2 = r2 & r0
                if (r2 == 0) goto L7
                r2 = 1
                goto L8
            L7:
                r2 = 0
            L8:
                return r2
        }

        public boolean isAdapterPositionUnknown() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 512(0x200, float:7.17E-43)
                if (r0 != 0) goto Lf
                boolean r0 = r1.isInvalid()
                if (r0 == 0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                goto L10
            Lf:
                r0 = 1
            L10:
                return r0
        }

        public boolean isAttachedToTransitionOverlay() {
                r2 = this;
                android.view.View r0 = r2.itemView
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto L14
                android.view.View r0 = r2.itemView
                android.view.ViewParent r0 = r0.getParent()
                androidx.recyclerview.widget.RecyclerView r1 = r2.mOwnerRecyclerView
                if (r0 == r1) goto L14
                r0 = 1
                goto L15
            L14:
                r0 = 0
            L15:
                return r0
        }

        public boolean isBound() {
                r2 = this;
                int r0 = r2.mFlags
                r1 = 1
                r0 = r0 & r1
                if (r0 == 0) goto L7
                goto L8
            L7:
                r1 = 0
            L8:
                return r1
        }

        public boolean isInvalid() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 4
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public final boolean isRecyclable() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 16
                if (r0 != 0) goto L10
                android.view.View r0 = r1.itemView
                boolean r0 = Yue.C6794.m26179(r0)
                if (r0 != 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }

        public boolean isRemoved() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 8
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public boolean isScrap() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r0 = r1.mScrapContainer
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        public boolean isTmpDetached() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public boolean isUpdated() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 2
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public boolean needsUpdate() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 2
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public void offsetPosition(int r3, boolean r4) {
                r2 = this;
                int r0 = r2.mOldPosition
                r1 = -1
                if (r0 != r1) goto L9
                int r0 = r2.mPosition
                r2.mOldPosition = r0
            L9:
                int r0 = r2.mPreLayoutPosition
                if (r0 != r1) goto L11
                int r0 = r2.mPosition
                r2.mPreLayoutPosition = r0
            L11:
                if (r4 == 0) goto L18
                int r4 = r2.mPreLayoutPosition
                int r4 = r4 + r3
                r2.mPreLayoutPosition = r4
            L18:
                int r4 = r2.mPosition
                int r4 = r4 + r3
                r2.mPosition = r4
                android.view.View r3 = r2.itemView
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                if (r3 == 0) goto L30
                android.view.View r3 = r2.itemView
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r3 = (androidx.recyclerview.widget.RecyclerView.C7696) r3
                r4 = 1
                r3.f29617 = r4
            L30:
                return
        }

        public void onEnteredHiddenState(androidx.recyclerview.widget.RecyclerView r3) {
                r2 = this;
                int r0 = r2.mPendingAccessibilityState
                r1 = -1
                if (r0 == r1) goto L8
                r2.mWasImportantForAccessibilityBeforeHidden = r0
                goto L10
            L8:
                android.view.View r0 = r2.itemView
                int r0 = Yue.C6794.m26135(r0)
                r2.mWasImportantForAccessibilityBeforeHidden = r0
            L10:
                r0 = 4
                r3.setChildImportantForAccessibilityInternal(r2, r0)
                return
        }

        public void onLeftHiddenState(androidx.recyclerview.widget.RecyclerView r2) {
                r1 = this;
                int r0 = r1.mWasImportantForAccessibilityBeforeHidden
                r2.setChildImportantForAccessibilityInternal(r1, r0)
                r2 = 0
                r1.mWasImportantForAccessibilityBeforeHidden = r2
                return
        }

        public void resetInternal() {
                r4 = this;
                r0 = 0
                r4.mFlags = r0
                r1 = -1
                r4.mPosition = r1
                r4.mOldPosition = r1
                r2 = -1
                r4.mItemId = r2
                r4.mPreLayoutPosition = r1
                r4.mIsRecyclableCount = r0
                r2 = 0
                r4.mShadowedHolder = r2
                r4.mShadowingHolder = r2
                r4.clearPayload()
                r4.mWasImportantForAccessibilityBeforeHidden = r0
                r4.mPendingAccessibilityState = r1
                androidx.recyclerview.widget.RecyclerView.clearNestedRecyclerViewIfNotNested(r4)
                return
        }

        public void saveOldPosition() {
                r2 = this;
                int r0 = r2.mOldPosition
                r1 = -1
                if (r0 != r1) goto L9
                int r0 = r2.mPosition
                r2.mOldPosition = r0
            L9:
                return
        }

        public void setFlags(int r3, int r4) {
                r2 = this;
                int r0 = r2.mFlags
                int r1 = ~r4
                r0 = r0 & r1
                r3 = r3 & r4
                r3 = r3 | r0
                r2.mFlags = r3
                return
        }

        public final void setIsRecyclable(boolean r3) {
                r2 = this;
                r0 = 1
                int r1 = r2.mIsRecyclableCount
                if (r3 == 0) goto L7
                int r1 = r1 - r0
                goto L8
            L7:
                int r1 = r1 + r0
            L8:
                r2.mIsRecyclableCount = r1
                if (r1 >= 0) goto L26
                r3 = 0
                r2.mIsRecyclableCount = r3
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for "
                r3.append(r0)
                r3.append(r2)
                java.lang.String r3 = r3.toString()
                java.lang.String r0 = "View"
                android.util.Log.e(r0, r3)
                goto L3b
            L26:
                if (r3 != 0) goto L31
                if (r1 != r0) goto L31
                int r3 = r2.mFlags
                r3 = r3 | 16
                r2.mFlags = r3
                goto L3b
            L31:
                if (r3 == 0) goto L3b
                if (r1 != 0) goto L3b
                int r3 = r2.mFlags
                r3 = r3 & (-17)
                r2.mFlags = r3
            L3b:
                return
        }

        public void setScrapContainer(androidx.recyclerview.widget.RecyclerView.C7704 r1, boolean r2) {
                r0 = this;
                r0.mScrapContainer = r1
                r0.mInChangeScrap = r2
                return
        }

        public boolean shouldBeKeptAsChild() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 16
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public boolean shouldIgnore() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 128(0x80, float:1.8E-43)
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public void stopIgnoring() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & (-129(0xffffffffffffff7f, float:NaN))
                r1.mFlags = r0
                return
        }

        public java.lang.String toString() {
                r5 = this;
                java.lang.Class r0 = r5.getClass()
                boolean r0 = r0.isAnonymousClass()
                if (r0 == 0) goto Ld
                java.lang.String r0 = "ViewHolder"
                goto L15
            Ld:
                java.lang.Class r0 = r5.getClass()
                java.lang.String r0 = r0.getSimpleName()
            L15:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                java.lang.String r0 = "{"
                r2.append(r0)
                int r0 = r5.hashCode()
                java.lang.String r0 = java.lang.Integer.toHexString(r0)
                r2.append(r0)
                java.lang.String r0 = " position="
                r2.append(r0)
                int r0 = r5.mPosition
                r2.append(r0)
                java.lang.String r0 = " id="
                r2.append(r0)
                long r3 = r5.mItemId
                r2.append(r3)
                java.lang.String r0 = ", oldPos="
                r2.append(r0)
                int r0 = r5.mOldPosition
                r2.append(r0)
                java.lang.String r0 = ", pLpos:"
                r2.append(r0)
                int r0 = r5.mPreLayoutPosition
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                boolean r0 = r5.isScrap()
                if (r0 == 0) goto L75
                java.lang.String r0 = " scrap "
                r1.append(r0)
                boolean r0 = r5.mInChangeScrap
                if (r0 == 0) goto L70
                java.lang.String r0 = "[changeScrap]"
                goto L72
            L70:
                java.lang.String r0 = "[attachedScrap]"
            L72:
                r1.append(r0)
            L75:
                boolean r0 = r5.isInvalid()
                if (r0 == 0) goto L80
                java.lang.String r0 = " invalid"
                r1.append(r0)
            L80:
                boolean r0 = r5.isBound()
                if (r0 != 0) goto L8b
                java.lang.String r0 = " unbound"
                r1.append(r0)
            L8b:
                boolean r0 = r5.needsUpdate()
                if (r0 == 0) goto L96
                java.lang.String r0 = " update"
                r1.append(r0)
            L96:
                boolean r0 = r5.isRemoved()
                if (r0 == 0) goto La1
                java.lang.String r0 = " removed"
                r1.append(r0)
            La1:
                boolean r0 = r5.shouldIgnore()
                if (r0 == 0) goto Lac
                java.lang.String r0 = " ignored"
                r1.append(r0)
            Lac:
                boolean r0 = r5.isTmpDetached()
                if (r0 == 0) goto Lb7
                java.lang.String r0 = " tmpDetached"
                r1.append(r0)
            Lb7:
                boolean r0 = r5.isRecyclable()
                if (r0 != 0) goto Ld8
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = " not recyclable("
                r0.append(r2)
                int r2 = r5.mIsRecyclableCount
                r0.append(r2)
                java.lang.String r2 = ")"
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r1.append(r0)
            Ld8:
                boolean r0 = r5.isAdapterPositionUnknown()
                if (r0 == 0) goto Le3
                java.lang.String r0 = " undefined adapter position"
                r1.append(r0)
            Le3:
                android.view.View r0 = r5.itemView
                android.view.ViewParent r0 = r0.getParent()
                if (r0 != 0) goto Lf0
                java.lang.String r0 = " no parent"
                r1.append(r0)
            Lf0:
                java.lang.String r0 = "}"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
        }

        public void unScrap() {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r0 = r1.mScrapContainer
                r0.m29832(r1)
                return
        }

        public boolean wasReturnedFromScrap() {
                r1 = this;
                int r0 = r1.mFlags
                r0 = r0 & 32
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m29878() {
                r1 = this;
                java.util.List<java.lang.Object> r0 = r1.mPayloads
                if (r0 != 0) goto L11
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mPayloads = r0
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                r1.mUnmodifiedPayloads = r0
            L11:
                return
        }
    }

    static {
            r0 = 16843830(0x1010436, float:2.369658E-38)
            int[] r0 = new int[]{r0}
            androidx.recyclerview.widget.RecyclerView.NESTED_SCROLLING_ATTRS = r0
            r0 = 0
            androidx.recyclerview.widget.RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST = r0
            r1 = 1
            androidx.recyclerview.widget.RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC = r1
            androidx.recyclerview.widget.RecyclerView.POST_UPDATES_ON_ANIMATION = r1
            androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK = r1
            androidx.recyclerview.widget.RecyclerView.FORCE_ABS_FOCUS_SEARCH_DIRECTION = r0
            androidx.recyclerview.widget.RecyclerView.IGNORE_DETACHED_FOCUSED_CHILD = r0
            java.lang.Class<android.util.AttributeSet> r0 = android.util.AttributeSet.class
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            java.lang.Class[] r0 = new java.lang.Class[]{r2, r0, r1, r1}
            androidx.recyclerview.widget.RecyclerView.LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = r0
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ r0 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟
            r0.<init>()
            androidx.recyclerview.widget.RecyclerView.sQuinticInterpolator = r0
            return
    }

    public RecyclerView(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public RecyclerView(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            int r0 = Yue.C5086.C5087.f18166
            r1.<init>(r2, r3, r0)
            return
    }

    public RecyclerView(@Yue.InterfaceC4410 android.content.Context r18, @Yue.InterfaceC4544 android.util.AttributeSet r19, int r20) {
            r17 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r17.<init>(r18, r19, r20)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۨ r0 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۨ
            r0.<init>(r7)
            r7.mObserver = r0
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r0 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ
            r0.<init>(r7)
            r7.mRecycler = r0
            androidx.recyclerview.widget.ۥ۟۟ۡ r0 = new androidx.recyclerview.widget.ۥ۟۟ۡ
            r0.<init>()
            r7.mViewInfoStore = r0
            androidx.recyclerview.widget.RecyclerView$ۥ r0 = new androidx.recyclerview.widget.RecyclerView$ۥ
            r0.<init>(r7)
            r7.mUpdateChildViewsRunnable = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.mTempRect = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.mTempRect2 = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r7.mTempRectF = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.mItemDecorations = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7.mOnItemTouchListeners = r0
            r11 = 0
            r7.mInterceptRequestLayoutDepth = r11
            r7.mDataSetHasChangedAfterLayout = r11
            r7.mDispatchItemsChangedEvent = r11
            r7.mLayoutOrScrollCounter = r11
            r7.mDispatchScrollCounter = r11
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۥ r0 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۥ
            r0.<init>()
            r7.mEdgeEffectFactory = r0
            androidx.recyclerview.widget.ۥ۟۟۟۠ r0 = new androidx.recyclerview.widget.ۥ۟۟۟۠
            r0.<init>()
            r7.mItemAnimator = r0
            r7.mScrollState = r11
            r12 = -1
            r7.mScrollPointerId = r12
            r0 = 1
            r7.mScaledHorizontalScrollFactor = r0
            r7.mScaledVerticalScrollFactor = r0
            r13 = 1
            r7.mPreserveFocusAfterLayout = r13
            androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟ۡ r0 = new androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟ۡ
            r0.<init>(r7)
            r7.mViewFlinger = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L81
            androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟ r0 = new androidx.recyclerview.widget.ۥ۟۟۟ۤ$ۥ۟
            r0.<init>()
            goto L82
        L81:
            r0 = 0
        L82:
            r7.mPrefetchRegistry = r0
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ
            r0.<init>()
            r7.mState = r0
            r7.mItemsAddedOrRemoved = r11
            r7.mItemsChanged = r11
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۧ r0 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۧ
            r0.<init>(r7)
            r7.mItemAnimatorListener = r0
            r7.mPostedAnimatorRunner = r11
            r0 = 2
            int[] r1 = new int[r0]
            r7.mMinMaxLayoutPositions = r1
            int[] r1 = new int[r0]
            r7.mScrollOffset = r1
            int[] r1 = new int[r0]
            r7.mNestedOffsets = r1
            int[] r1 = new int[r0]
            r7.mReusableIntPair = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r7.mPendingAccessibilityImportanceChange = r1
            androidx.recyclerview.widget.RecyclerView$ۥ۟ r1 = new androidx.recyclerview.widget.RecyclerView$ۥ۟
            r1.<init>(r7)
            r7.mItemAnimatorRunner = r1
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ r1 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟
            r1.<init>(r7)
            r7.mViewInfoProcessCallback = r1
            r7.setScrollContainer(r13)
            r7.setFocusableInTouchMode(r13)
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r18)
            int r2 = r1.getScaledTouchSlop()
            r7.mTouchSlop = r2
            float r2 = Yue.C6823.m26405(r1, r8)
            r7.mScaledHorizontalScrollFactor = r2
            float r2 = Yue.C6823.m26410(r1, r8)
            r7.mScaledVerticalScrollFactor = r2
            int r2 = r1.getScaledMinimumFlingVelocity()
            r7.mMinFlingVelocity = r2
            int r1 = r1.getScaledMaximumFlingVelocity()
            r7.mMaxFlingVelocity = r1
            int r1 = r17.getOverScrollMode()
            if (r1 != r0) goto Lee
            r0 = r13
            goto Lef
        Lee:
            r0 = r11
        Lef:
            r7.setWillNotDraw(r0)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r0 = r7.mItemAnimator
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟ r1 = r7.mItemAnimatorListener
            r0.m29752(r1)
            r17.initAdapterManager()
            r17.m29679()
            r17.m29678()
            int r0 = Yue.C6794.m26135(r17)
            if (r0 != 0) goto L10b
            Yue.C6794.m26241(r7, r13)
        L10b:
            android.content.Context r0 = r17.getContext()
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r7.mAccessibilityManager = r0
            androidx.recyclerview.widget.ۥ۟۟۠ۢ r0 = new androidx.recyclerview.widget.ۥ۟۟۠ۢ
            r0.<init>(r7)
            r7.setAccessibilityDelegateCompat(r0)
            int[] r0 = Yue.C5086.C5096.f18340
            android.content.res.TypedArray r14 = r8.obtainStyledAttributes(r9, r0, r10, r11)
            int r15 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            if (r15 < r6) goto L13f
            int[] r2 = Yue.C5086.C5096.f18340
            r16 = 0
            r0 = r17
            r1 = r18
            r3 = r19
            r4 = r14
            r5 = r20
            r6 = r16
            Yue.C5253.m19853(r0, r1, r2, r3, r4, r5, r6)
        L13f:
            int r0 = Yue.C5086.C5096.f18349
            java.lang.String r2 = r14.getString(r0)
            int r0 = Yue.C5086.C5096.f18343
            int r0 = r14.getInt(r0, r12)
            if (r0 != r12) goto L152
            r0 = 262144(0x40000, float:3.67342E-40)
            r7.setDescendantFocusability(r0)
        L152:
            int r0 = Yue.C5086.C5096.f18342
            boolean r0 = r14.getBoolean(r0, r13)
            r7.mClipToPadding = r0
            int r0 = Yue.C5086.C5096.f18344
            boolean r0 = r14.getBoolean(r0, r11)
            r7.mEnableFastScroller = r0
            if (r0 == 0) goto L183
            int r0 = Yue.C5086.C5096.f18347
            android.graphics.drawable.Drawable r0 = r14.getDrawable(r0)
            android.graphics.drawable.StateListDrawable r0 = (android.graphics.drawable.StateListDrawable) r0
            int r1 = Yue.C5086.C5096.f18348
            android.graphics.drawable.Drawable r1 = r14.getDrawable(r1)
            int r3 = Yue.C5086.C5096.f18345
            android.graphics.drawable.Drawable r3 = r14.getDrawable(r3)
            android.graphics.drawable.StateListDrawable r3 = (android.graphics.drawable.StateListDrawable) r3
            int r4 = Yue.C5086.C5096.f18346
            android.graphics.drawable.Drawable r4 = r14.getDrawable(r4)
            r7.initFastScroller(r0, r1, r3, r4)
        L183:
            r14.recycle()
            r5 = 0
            r0 = r17
            r1 = r18
            r3 = r19
            r4 = r20
            r0.m29664(r1, r2, r3, r4, r5)
            int[] r2 = androidx.recyclerview.widget.RecyclerView.NESTED_SCROLLING_ATTRS
            android.content.res.TypedArray r12 = r8.obtainStyledAttributes(r9, r2, r10, r11)
            r0 = 29
            if (r15 < r0) goto L1a9
            r6 = 0
            r0 = r17
            r1 = r18
            r3 = r19
            r4 = r12
            r5 = r20
            Yue.C5253.m19853(r0, r1, r2, r3, r4, r5, r6)
        L1a9:
            boolean r0 = r12.getBoolean(r11, r13)
            r12.recycle()
            r7.setNestedScrollingEnabled(r0)
            return
    }

    public static /* synthetic */ void access$000(androidx.recyclerview.widget.RecyclerView r0, android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0.attachViewToParent(r1, r2, r3)
            return
    }

    public static /* synthetic */ void access$100(androidx.recyclerview.widget.RecyclerView r0, int r1) {
            r0.detachViewFromParent(r1)
            return
    }

    public static /* synthetic */ boolean access$200(androidx.recyclerview.widget.RecyclerView r0) {
            boolean r0 = r0.awakenScrollBars()
            return r0
    }

    public static /* synthetic */ void access$300(androidx.recyclerview.widget.RecyclerView r0, int r1, int r2) {
            r0.setMeasuredDimension(r1, r2)
            return
    }

    public static void clearNestedRecyclerViewIfNotNested(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r3) {
            java.lang.ref.WeakReference<androidx.recyclerview.widget.RecyclerView> r0 = r3.mNestedRecyclerView
            if (r0 == 0) goto L21
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
        La:
            r1 = 0
            if (r0 == 0) goto L1f
            android.view.View r2 = r3.itemView
            if (r0 != r2) goto L12
            return
        L12:
            android.view.ViewParent r0 = r0.getParent()
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L1d
            android.view.View r0 = (android.view.View) r0
            goto La
        L1d:
            r0 = r1
            goto La
        L1f:
            r3.mNestedRecyclerView = r1
        L21:
            return
    }

    @Yue.InterfaceC4544
    public static androidx.recyclerview.widget.RecyclerView findNestedRecyclerView(@Yue.InterfaceC4410 android.view.View r4) {
            boolean r0 = r4 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r4 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto Ld
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            return r4
        Ld:
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r2 = 0
        L14:
            if (r2 >= r0) goto L24
            android.view.View r3 = r4.getChildAt(r2)
            androidx.recyclerview.widget.RecyclerView r3 = findNestedRecyclerView(r3)
            if (r3 == 0) goto L21
            return r3
        L21:
            int r2 = r2 + 1
            goto L14
        L24:
            return r1
    }

    public static androidx.recyclerview.widget.RecyclerView.AbstractC7716 getChildViewHolderInt(android.view.View r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r0.f29615
            return r0
    }

    public static void getDecoratedBoundsWithMarginsInt(android.view.View r6, android.graphics.Rect r7) {
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
            android.graphics.Rect r1 = r0.f29616
            int r2 = r6.getLeft()
            int r3 = r1.left
            int r2 = r2 - r3
            int r3 = r0.leftMargin
            int r2 = r2 - r3
            int r3 = r6.getTop()
            int r4 = r1.top
            int r3 = r3 - r4
            int r4 = r0.topMargin
            int r3 = r3 - r4
            int r4 = r6.getRight()
            int r5 = r1.right
            int r4 = r4 + r5
            int r5 = r0.rightMargin
            int r4 = r4 + r5
            int r6 = r6.getBottom()
            int r1 = r1.bottom
            int r6 = r6 + r1
            int r0 = r0.bottomMargin
            int r6 = r6 + r0
            r7.set(r2, r3, r4, r6)
            return
    }

    private Yue.C4383 getScrollingChildHelper() {
            r1 = this;
            Yue.ۥۡۢۢ۠ r0 = r1.mScrollingChildHelper
            if (r0 != 0) goto Lb
            Yue.ۥۡۢۢ۠ r0 = new Yue.ۥۡۢۢ۠
            r0.<init>(r1)
            r1.mScrollingChildHelper = r0
        Lb:
            Yue.ۥۡۢۢ۠ r0 = r1.mScrollingChildHelper
            return r0
    }

    public void absorbGlows(int r3, int r4) {
            r2 = this;
            if (r3 >= 0) goto L14
            r2.ensureLeftGlow()
            android.widget.EdgeEffect r0 = r2.mLeftGlow
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L26
            android.widget.EdgeEffect r0 = r2.mLeftGlow
            int r1 = -r3
            r0.onAbsorb(r1)
            goto L26
        L14:
            if (r3 <= 0) goto L26
            r2.ensureRightGlow()
            android.widget.EdgeEffect r0 = r2.mRightGlow
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L26
            android.widget.EdgeEffect r0 = r2.mRightGlow
            r0.onAbsorb(r3)
        L26:
            if (r4 >= 0) goto L3a
            r2.ensureTopGlow()
            android.widget.EdgeEffect r0 = r2.mTopGlow
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L4c
            android.widget.EdgeEffect r0 = r2.mTopGlow
            int r1 = -r4
            r0.onAbsorb(r1)
            goto L4c
        L3a:
            if (r4 <= 0) goto L4c
            r2.ensureBottomGlow()
            android.widget.EdgeEffect r0 = r2.mBottomGlow
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L4c
            android.widget.EdgeEffect r0 = r2.mBottomGlow
            r0.onAbsorb(r4)
        L4c:
            if (r3 != 0) goto L50
            if (r4 == 0) goto L53
        L50:
            Yue.C6794.m26209(r2)
        L53:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList<android.view.View> r2, int r3, int r4) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.mLayout
            if (r0 == 0) goto La
            boolean r0 = r0.onAddFocusables(r1, r2, r3, r4)
            if (r0 != 0) goto Ld
        La:
            super.addFocusables(r2, r3, r4)
        Ld:
            return
    }

    public void addItemDecoration(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7690 r2) {
            r1 = this;
            r0 = -1
            r1.addItemDecoration(r2, r0)
            return
    }

    public void addItemDecoration(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7690 r3, int r4) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            if (r0 == 0) goto L9
            java.lang.String r1 = "Cannot add item decoration during a scroll  or layout"
            r0.assertNotInLayoutOrScroll(r1)
        L9:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ> r0 = r2.mItemDecorations
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L15
            r0 = 0
            r2.setWillNotDraw(r0)
        L15:
            if (r4 >= 0) goto L1d
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ> r4 = r2.mItemDecorations
            r4.add(r3)
            goto L22
        L1d:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ> r0 = r2.mItemDecorations
            r0.add(r4, r3)
        L22:
            r2.markItemDecorInsetsDirty()
            r2.requestLayout()
            return
    }

    public void addOnChildAttachStateChangeListener(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.InterfaceC7697 r2) {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۠> r0 = r1.mOnChildAttachStateListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mOnChildAttachStateListeners = r0
        Lb:
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۠> r0 = r1.mOnChildAttachStateListeners
            r0.add(r2)
            return
    }

    public void addOnItemTouchListener(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.InterfaceC7699 r2) {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۢ> r0 = r1.mOnItemTouchListeners
            r0.add(r2)
            return
    }

    public void addOnScrollListener(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7700 r2) {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۠> r0 = r1.mScrollListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mScrollListeners = r0
        Lb:
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۠> r0 = r1.mScrollListeners
            r0.add(r2)
            return
    }

    public void animateAppearance(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r2, @Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r3, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r4) {
            r1 = this;
            r0 = 0
            r2.setIsRecyclable(r0)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r0 = r1.mItemAnimator
            boolean r2 = r0.mo29727(r2, r3, r4)
            if (r2 == 0) goto Lf
            r1.postAnimationRunner()
        Lf:
            return
    }

    public void animateDisappearance(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r2, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r3, @Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r4) {
            r1 = this;
            r1.m29661(r2)
            r0 = 0
            r2.setIsRecyclable(r0)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r0 = r1.mItemAnimator
            boolean r2 = r0.mo29729(r2, r3, r4)
            if (r2 == 0) goto L12
            r1.postAnimationRunner()
        L12:
            return
    }

    public void assertInLayoutOrScroll(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.isComputingLayout()
            if (r0 != 0) goto L3c
            if (r3 != 0) goto L23
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot call this method unless RecyclerView is computing a layout or scrolling"
            r0.append(r1)
            java.lang.String r1 = r2.exceptionLabel()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L23:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = r2.exceptionLabel()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L3c:
            return
    }

    public void assertNotInLayoutOrScroll(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.isComputingLayout()
            if (r0 == 0) goto L29
            if (r3 != 0) goto L23
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot call this method while RecyclerView is computing a layout or scrolling"
            r0.append(r1)
            java.lang.String r1 = r2.exceptionLabel()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L23:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L29:
            int r3 = r2.mDispatchScrollCounter
            if (r3 <= 0) goto L4e
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r1 = r2.exceptionLabel()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            java.lang.String r0 = "RecyclerView"
            java.lang.String r1 = "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame."
            android.util.Log.w(r0, r1, r3)
        L4e:
            return
    }

    public boolean canReuseUpdatedViewHolder(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r0 = r2.mItemAnimator
            if (r0 == 0) goto L11
            java.util.List r1 = r3.getUnmodifiedPayloads()
            boolean r3 = r0.mo29732(r3, r1)
            if (r3 == 0) goto Lf
            goto L11
        Lf:
            r3 = 0
            goto L12
        L11:
            r3 = 1
        L12:
            return r3
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerView.C7696
            if (r0 == 0) goto L10
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.mLayout
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r2 = (androidx.recyclerview.widget.RecyclerView.C7696) r2
            boolean r2 = r0.checkLayoutParams(r2)
            if (r2 == 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    public void clearOldPositions() {
            r4 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r4.mChildHelper
            int r0 = r0.m30051()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1f
            androidx.recyclerview.widget.ۥ۟۟۟۟ r2 = r4.mChildHelper
            android.view.View r2 = r2.m30050(r1)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = getChildViewHolderInt(r2)
            boolean r3 = r2.shouldIgnore()
            if (r3 != 0) goto L1c
            r2.clearOldPosition()
        L1c:
            int r1 = r1 + 1
            goto L7
        L1f:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r0 = r4.mRecycler
            r0.m29800()
            return
    }

    public void clearOnChildAttachStateChangeListeners() {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۠> r0 = r1.mOnChildAttachStateListeners
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            return
    }

    public void clearOnScrollListeners() {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۠> r0 = r1.mScrollListeners
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            return
    }

    @Override // android.view.View, Yue.InterfaceC5517
    public int computeHorizontalScrollExtent() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.canScrollHorizontally()
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r1 = r2.mState
            int r1 = r0.computeHorizontalScrollExtent(r1)
        L14:
            return r1
    }

    @Override // android.view.View, Yue.InterfaceC5517
    public int computeHorizontalScrollOffset() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.canScrollHorizontally()
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r1 = r2.mState
            int r1 = r0.computeHorizontalScrollOffset(r1)
        L14:
            return r1
    }

    @Override // android.view.View, Yue.InterfaceC5517
    public int computeHorizontalScrollRange() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.canScrollHorizontally()
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r1 = r2.mState
            int r1 = r0.computeHorizontalScrollRange(r1)
        L14:
            return r1
    }

    @Override // android.view.View, Yue.InterfaceC5517
    public int computeVerticalScrollExtent() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r1 = r2.mState
            int r1 = r0.computeVerticalScrollExtent(r1)
        L14:
            return r1
    }

    @Override // android.view.View, Yue.InterfaceC5517
    public int computeVerticalScrollOffset() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r1 = r2.mState
            int r1 = r0.computeVerticalScrollOffset(r1)
        L14:
            return r1
    }

    @Override // android.view.View, Yue.InterfaceC5517
    public int computeVerticalScrollRange() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r1 = r2.mState
            int r1 = r0.computeVerticalScrollRange(r1)
        L14:
            return r1
    }

    public void considerReleasingGlowsOnScroll(int r3, int r4) {
            r2 = this;
            android.widget.EdgeEffect r0 = r2.mLeftGlow
            if (r0 == 0) goto L18
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L18
            if (r3 <= 0) goto L18
            android.widget.EdgeEffect r0 = r2.mLeftGlow
            r0.onRelease()
            android.widget.EdgeEffect r0 = r2.mLeftGlow
            boolean r0 = r0.isFinished()
            goto L19
        L18:
            r0 = 0
        L19:
            android.widget.EdgeEffect r1 = r2.mRightGlow
            if (r1 == 0) goto L31
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L31
            if (r3 >= 0) goto L31
            android.widget.EdgeEffect r3 = r2.mRightGlow
            r3.onRelease()
            android.widget.EdgeEffect r3 = r2.mRightGlow
            boolean r3 = r3.isFinished()
            r0 = r0 | r3
        L31:
            android.widget.EdgeEffect r3 = r2.mTopGlow
            if (r3 == 0) goto L49
            boolean r3 = r3.isFinished()
            if (r3 != 0) goto L49
            if (r4 <= 0) goto L49
            android.widget.EdgeEffect r3 = r2.mTopGlow
            r3.onRelease()
            android.widget.EdgeEffect r3 = r2.mTopGlow
            boolean r3 = r3.isFinished()
            r0 = r0 | r3
        L49:
            android.widget.EdgeEffect r3 = r2.mBottomGlow
            if (r3 == 0) goto L61
            boolean r3 = r3.isFinished()
            if (r3 != 0) goto L61
            if (r4 >= 0) goto L61
            android.widget.EdgeEffect r3 = r2.mBottomGlow
            r3.onRelease()
            android.widget.EdgeEffect r3 = r2.mBottomGlow
            boolean r3 = r3.isFinished()
            r0 = r0 | r3
        L61:
            if (r0 == 0) goto L66
            Yue.C6794.m26209(r2)
        L66:
            return
    }

    public void consumePendingUpdateOperations() {
            r3 = this;
            boolean r0 = r3.mFirstLayoutComplete
            java.lang.String r1 = "RV FullInvalidate"
            if (r0 == 0) goto L67
            boolean r0 = r3.mDataSetHasChangedAfterLayout
            if (r0 == 0) goto Lb
            goto L67
        Lb:
            androidx.recyclerview.widget.ۥ r0 = r3.mAdapterHelper
            boolean r0 = r0.m30011()
            if (r0 != 0) goto L14
            return
        L14:
            androidx.recyclerview.widget.ۥ r0 = r3.mAdapterHelper
            r2 = 4
            boolean r0 = r0.m30010(r2)
            if (r0 == 0) goto L55
            androidx.recyclerview.widget.ۥ r0 = r3.mAdapterHelper
            r2 = 11
            boolean r0 = r0.m30010(r2)
            if (r0 != 0) goto L55
            java.lang.String r0 = "RV PartialInvalidate"
            Yue.C6388.m23593(r0)
            r3.startInterceptRequestLayout()
            r3.onEnterLayoutOrScroll()
            androidx.recyclerview.widget.ۥ r0 = r3.mAdapterHelper
            r0.m30018()
            boolean r0 = r3.mLayoutWasDefered
            if (r0 != 0) goto L4a
            boolean r0 = r3.m29677()
            if (r0 == 0) goto L45
            r3.dispatchLayout()
            goto L4a
        L45:
            androidx.recyclerview.widget.ۥ r0 = r3.mAdapterHelper
            r0.m30004()
        L4a:
            r0 = 1
            r3.stopInterceptRequestLayout(r0)
            r3.onExitLayoutOrScroll()
            Yue.C6388.m23595()
            goto L66
        L55:
            androidx.recyclerview.widget.ۥ r0 = r3.mAdapterHelper
            boolean r0 = r0.m30011()
            if (r0 == 0) goto L66
            Yue.C6388.m23593(r1)
            r3.dispatchLayout()
            Yue.C6388.m23595()
        L66:
            return
        L67:
            Yue.C6388.m23593(r1)
            r3.dispatchLayout()
            Yue.C6388.m23595()
            return
    }

    public void defaultOnMeasure(int r3, int r4) {
            r2 = this;
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getPaddingRight()
            int r0 = r0 + r1
            int r1 = Yue.C6794.m26146(r2)
            int r3 = androidx.recyclerview.widget.RecyclerView.AbstractC7691.chooseSize(r3, r0, r1)
            int r0 = r2.getPaddingTop()
            int r1 = r2.getPaddingBottom()
            int r0 = r0 + r1
            int r1 = Yue.C6794.m26145(r2)
            int r4 = androidx.recyclerview.widget.RecyclerView.AbstractC7691.chooseSize(r4, r0, r1)
            r2.setMeasuredDimension(r3, r4)
            return
    }

    public void dispatchChildAttached(android.view.View r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = getChildViewHolderInt(r3)
            r2.onChildAttachedToWindow(r3)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r1 = r2.mAdapter
            if (r1 == 0) goto L10
            if (r0 == 0) goto L10
            r1.onViewAttachedToWindow(r0)
        L10:
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۠> r0 = r2.mOnChildAttachStateListeners
            if (r0 == 0) goto L2a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L1a:
            if (r0 < 0) goto L2a
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۠> r1 = r2.mOnChildAttachStateListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۠ r1 = (androidx.recyclerview.widget.RecyclerView.InterfaceC7697) r1
            r1.mo26659(r3)
            int r0 = r0 + (-1)
            goto L1a
        L2a:
            return
    }

    public void dispatchChildDetached(android.view.View r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = getChildViewHolderInt(r3)
            r2.onChildDetachedFromWindow(r3)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r1 = r2.mAdapter
            if (r1 == 0) goto L10
            if (r0 == 0) goto L10
            r1.onViewDetachedFromWindow(r0)
        L10:
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۠> r0 = r2.mOnChildAttachStateListeners
            if (r0 == 0) goto L2a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L1a:
            if (r0 < 0) goto L2a
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۠> r1 = r2.mOnChildAttachStateListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۠ r1 = (androidx.recyclerview.widget.RecyclerView.InterfaceC7697) r1
            r1.mo26658(r3)
            int r0 = r0 + (-1)
            goto L1a
        L2a:
            return
    }

    public void dispatchLayout() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r2.mAdapter
            java.lang.String r1 = "RecyclerView"
            if (r0 != 0) goto Lc
            java.lang.String r0 = "No adapter attached; skipping layout"
            android.util.Log.e(r1, r0)
            return
        Lc:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            if (r0 != 0) goto L16
            java.lang.String r0 = "No layout manager attached; skipping layout"
            android.util.Log.e(r1, r0)
            return
        L16:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r2.mState
            r1 = 0
            r0.f29658 = r1
            int r0 = r0.f29653
            r1 = 1
            if (r0 != r1) goto L2c
            r2.m29667()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            r0.setExactMeasureSpecsFrom(r2)
            r2.m29668()
            goto L5b
        L2c:
            androidx.recyclerview.widget.ۥ r0 = r2.mAdapterHelper
            boolean r0 = r0.m30012()
            if (r0 != 0) goto L53
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            int r0 = r0.getWidth()
            int r1 = r2.getWidth()
            if (r0 != r1) goto L53
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            int r0 = r0.getHeight()
            int r1 = r2.getHeight()
            if (r0 == r1) goto L4d
            goto L53
        L4d:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            r0.setExactMeasureSpecsFrom(r2)
            goto L5b
        L53:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            r0.setExactMeasureSpecsFrom(r2)
            r2.m29668()
        L5b:
            r2.m29669()
            return
    }

    @Override // android.view.View, Yue.InterfaceC4382
    public boolean dispatchNestedFling(float r2, float r3, boolean r4) {
            r1 = this;
            Yue.ۥۡۢۢ۠ r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.m17231(r2, r3, r4)
            return r2
    }

    @Override // android.view.View, Yue.InterfaceC4382
    public boolean dispatchNestedPreFling(float r2, float r3) {
            r1 = this;
            Yue.ۥۡۢۢ۠ r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.m17232(r2, r3)
            return r2
    }

    @Override // android.view.View, Yue.InterfaceC4382
    public boolean dispatchNestedPreScroll(int r2, int r3, int[] r4, int[] r5) {
            r1 = this;
            Yue.ۥۡۢۢ۠ r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.m17233(r2, r3, r4, r5)
            return r2
    }

    @Override // Yue.InterfaceC4380
    public boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10, int r11) {
            r6 = this;
            Yue.ۥۡۢۢ۠ r0 = r6.getScrollingChildHelper()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.m17234(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // Yue.InterfaceC4381
    public final void dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13, int r14, @Yue.InterfaceC4410 int[] r15) {
            r8 = this;
            Yue.ۥۡۢۢ۠ r0 = r8.getScrollingChildHelper()
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.m17235(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.view.View, Yue.InterfaceC4382
    public boolean dispatchNestedScroll(int r7, int r8, int r9, int r10, int[] r11) {
            r6 = this;
            Yue.ۥۡۢۢ۠ r0 = r6.getScrollingChildHelper()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.m17236(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // Yue.InterfaceC4380
    public boolean dispatchNestedScroll(int r8, int r9, int r10, int r11, int[] r12, int r13) {
            r7 = this;
            Yue.ۥۡۢۢ۠ r0 = r7.getScrollingChildHelper()
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            boolean r8 = r0.m17237(r1, r2, r3, r4, r5, r6)
            return r8
    }

    public void dispatchOnScrollStateChanged(int r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            if (r0 == 0) goto L7
            r0.onScrollStateChanged(r3)
        L7:
            r2.onScrollStateChanged(r3)
            androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۠ r0 = r2.mScrollListener
            if (r0 == 0) goto L11
            r0.onScrollStateChanged(r2, r3)
        L11:
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۠> r0 = r2.mScrollListeners
            if (r0 == 0) goto L2b
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L1b:
            if (r0 < 0) goto L2b
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۠> r1 = r2.mScrollListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۠ r1 = (androidx.recyclerview.widget.RecyclerView.AbstractC7700) r1
            r1.onScrollStateChanged(r2, r3)
            int r0 = r0 + (-1)
            goto L1b
        L2b:
            return
    }

    public void dispatchOnScrolled(int r5, int r6) {
            r4 = this;
            int r0 = r4.mDispatchScrollCounter
            int r0 = r0 + 1
            r4.mDispatchScrollCounter = r0
            int r0 = r4.getScrollX()
            int r1 = r4.getScrollY()
            int r2 = r0 - r5
            int r3 = r1 - r6
            r4.onScrollChanged(r0, r1, r2, r3)
            r4.onScrolled(r5, r6)
            androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۠ r0 = r4.mScrollListener
            if (r0 == 0) goto L1f
            r0.onScrolled(r4, r5, r6)
        L1f:
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۠> r0 = r4.mScrollListeners
            if (r0 == 0) goto L39
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L29:
            if (r0 < 0) goto L39
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۠> r1 = r4.mScrollListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۠ r1 = (androidx.recyclerview.widget.RecyclerView.AbstractC7700) r1
            r1.onScrolled(r4, r5, r6)
            int r0 = r0 + (-1)
            goto L29
        L39:
            int r5 = r4.mDispatchScrollCounter
            int r5 = r5 + (-1)
            r4.mDispatchScrollCounter = r5
            return
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
            r5 = this;
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r5.mPendingAccessibilityImportanceChange
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L30
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r1 = r5.mPendingAccessibilityImportanceChange
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r1 = (androidx.recyclerview.widget.RecyclerView.AbstractC7716) r1
            android.view.View r2 = r1.itemView
            android.view.ViewParent r2 = r2.getParent()
            if (r2 != r5) goto L2d
            boolean r2 = r1.shouldIgnore()
            if (r2 == 0) goto L21
            goto L2d
        L21:
            int r2 = r1.mPendingAccessibilityState
            r3 = -1
            if (r2 == r3) goto L2d
            android.view.View r4 = r1.itemView
            Yue.C6794.m26241(r4, r2)
            r1.mPendingAccessibilityState = r3
        L2d:
            int r0 = r0 + (-1)
            goto L8
        L30:
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r5.mPendingAccessibilityImportanceChange
            r0.clear()
            return
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            r0.onPopulateAccessibilityEvent(r1)
            r1 = 1
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> r1) {
            r0 = this;
            r0.dispatchThawSelfOnly(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> r1) {
            r0 = this;
            r0.dispatchFreezeSelfOnly(r1)
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r8) {
            r7 = this;
            super.draw(r8)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ> r0 = r7.mItemDecorations
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        Lb:
            if (r2 >= r0) goto L1d
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ> r3 = r7.mItemDecorations
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ r3 = (androidx.recyclerview.widget.RecyclerView.AbstractC7690) r3
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r4 = r7.mState
            r3.onDrawOver(r8, r7, r4)
            int r2 = r2 + 1
            goto Lb
        L1d:
            android.widget.EdgeEffect r0 = r7.mLeftGlow
            r2 = 1
            if (r0 == 0) goto L57
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L57
            int r0 = r8.save()
            boolean r3 = r7.mClipToPadding
            if (r3 == 0) goto L35
            int r3 = r7.getPaddingBottom()
            goto L36
        L35:
            r3 = r1
        L36:
            r4 = 1132920832(0x43870000, float:270.0)
            r8.rotate(r4)
            int r4 = r7.getHeight()
            int r4 = -r4
            int r4 = r4 + r3
            float r3 = (float) r4
            r4 = 0
            r8.translate(r3, r4)
            android.widget.EdgeEffect r3 = r7.mLeftGlow
            if (r3 == 0) goto L52
            boolean r3 = r3.draw(r8)
            if (r3 == 0) goto L52
            r3 = r2
            goto L53
        L52:
            r3 = r1
        L53:
            r8.restoreToCount(r0)
            goto L58
        L57:
            r3 = r1
        L58:
            android.widget.EdgeEffect r0 = r7.mTopGlow
            if (r0 == 0) goto L88
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L88
            int r0 = r8.save()
            boolean r4 = r7.mClipToPadding
            if (r4 == 0) goto L77
            int r4 = r7.getPaddingLeft()
            float r4 = (float) r4
            int r5 = r7.getPaddingTop()
            float r5 = (float) r5
            r8.translate(r4, r5)
        L77:
            android.widget.EdgeEffect r4 = r7.mTopGlow
            if (r4 == 0) goto L83
            boolean r4 = r4.draw(r8)
            if (r4 == 0) goto L83
            r4 = r2
            goto L84
        L83:
            r4 = r1
        L84:
            r3 = r3 | r4
            r8.restoreToCount(r0)
        L88:
            android.widget.EdgeEffect r0 = r7.mRightGlow
            if (r0 == 0) goto Lc1
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto Lc1
            int r0 = r8.save()
            int r4 = r7.getWidth()
            boolean r5 = r7.mClipToPadding
            if (r5 == 0) goto La3
            int r5 = r7.getPaddingTop()
            goto La4
        La3:
            r5 = r1
        La4:
            r6 = 1119092736(0x42b40000, float:90.0)
            r8.rotate(r6)
            int r5 = -r5
            float r5 = (float) r5
            int r4 = -r4
            float r4 = (float) r4
            r8.translate(r5, r4)
            android.widget.EdgeEffect r4 = r7.mRightGlow
            if (r4 == 0) goto Lbc
            boolean r4 = r4.draw(r8)
            if (r4 == 0) goto Lbc
            r4 = r2
            goto Lbd
        Lbc:
            r4 = r1
        Lbd:
            r3 = r3 | r4
            r8.restoreToCount(r0)
        Lc1:
            android.widget.EdgeEffect r0 = r7.mBottomGlow
            if (r0 == 0) goto L110
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L110
            int r0 = r8.save()
            r4 = 1127481344(0x43340000, float:180.0)
            r8.rotate(r4)
            boolean r4 = r7.mClipToPadding
            if (r4 == 0) goto Lf2
            int r4 = r7.getWidth()
            int r4 = -r4
            int r5 = r7.getPaddingRight()
            int r4 = r4 + r5
            float r4 = (float) r4
            int r5 = r7.getHeight()
            int r5 = -r5
            int r6 = r7.getPaddingBottom()
            int r5 = r5 + r6
            float r5 = (float) r5
            r8.translate(r4, r5)
            goto L101
        Lf2:
            int r4 = r7.getWidth()
            int r4 = -r4
            float r4 = (float) r4
            int r5 = r7.getHeight()
            int r5 = -r5
            float r5 = (float) r5
            r8.translate(r4, r5)
        L101:
            android.widget.EdgeEffect r4 = r7.mBottomGlow
            if (r4 == 0) goto L10c
            boolean r4 = r4.draw(r8)
            if (r4 == 0) goto L10c
            r1 = r2
        L10c:
            r3 = r3 | r1
            r8.restoreToCount(r0)
        L110:
            if (r3 != 0) goto L127
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r8 = r7.mItemAnimator
            if (r8 == 0) goto L127
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ> r8 = r7.mItemDecorations
            int r8 = r8.size()
            if (r8 <= 0) goto L127
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r8 = r7.mItemAnimator
            boolean r8 = r8.mo29742()
            if (r8 == 0) goto L127
            goto L128
        L127:
            r2 = r3
        L128:
            if (r2 == 0) goto L12d
            Yue.C6794.m26209(r7)
        L12d:
            return
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas r1, android.view.View r2, long r3) {
            r0 = this;
            boolean r1 = super.drawChild(r1, r2, r3)
            return r1
    }

    public void ensureBottomGlow() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.mBottomGlow
            if (r0 == 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۥ r0 = r4.mEdgeEffectFactory
            r1 = 3
            android.widget.EdgeEffect r0 = r0.m29725(r4, r1)
            r4.mBottomGlow = r0
            boolean r1 = r4.mClipToPadding
            if (r1 == 0) goto L32
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getPaddingLeft()
            int r1 = r1 - r2
            int r2 = r4.getPaddingRight()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            r0.setSize(r1, r2)
            goto L3d
        L32:
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getMeasuredHeight()
            r0.setSize(r1, r2)
        L3d:
            return
    }

    public void ensureLeftGlow() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.mLeftGlow
            if (r0 == 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۥ r0 = r4.mEdgeEffectFactory
            r1 = 0
            android.widget.EdgeEffect r0 = r0.m29725(r4, r1)
            r4.mLeftGlow = r0
            boolean r1 = r4.mClipToPadding
            if (r1 == 0) goto L32
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredWidth()
            int r3 = r4.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r4.getPaddingRight()
            int r2 = r2 - r3
            r0.setSize(r1, r2)
            goto L3d
        L32:
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getMeasuredWidth()
            r0.setSize(r1, r2)
        L3d:
            return
    }

    public void ensureRightGlow() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.mRightGlow
            if (r0 == 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۥ r0 = r4.mEdgeEffectFactory
            r1 = 2
            android.widget.EdgeEffect r0 = r0.m29725(r4, r1)
            r4.mRightGlow = r0
            boolean r1 = r4.mClipToPadding
            if (r1 == 0) goto L32
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredWidth()
            int r3 = r4.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r4.getPaddingRight()
            int r2 = r2 - r3
            r0.setSize(r1, r2)
            goto L3d
        L32:
            int r1 = r4.getMeasuredHeight()
            int r2 = r4.getMeasuredWidth()
            r0.setSize(r1, r2)
        L3d:
            return
    }

    public void ensureTopGlow() {
            r4 = this;
            android.widget.EdgeEffect r0 = r4.mTopGlow
            if (r0 == 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۥ r0 = r4.mEdgeEffectFactory
            r1 = 1
            android.widget.EdgeEffect r0 = r0.m29725(r4, r1)
            r4.mTopGlow = r0
            boolean r1 = r4.mClipToPadding
            if (r1 == 0) goto L32
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getPaddingLeft()
            int r1 = r1 - r2
            int r2 = r4.getPaddingRight()
            int r1 = r1 - r2
            int r2 = r4.getMeasuredHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            r0.setSize(r1, r2)
            goto L3d
        L32:
            int r1 = r4.getMeasuredWidth()
            int r2 = r4.getMeasuredHeight()
            r0.setSize(r1, r2)
        L3d:
            return
    }

    public java.lang.String exceptionLabel() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ", adapter:"
            r0.append(r1)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r1 = r2.mAdapter
            r0.append(r1)
            java.lang.String r1 = ", layout:"
            r0.append(r1)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r2.mLayout
            r0.append(r1)
            java.lang.String r1 = ", context:"
            r0.append(r1)
            android.content.Context r1 = r2.getContext()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void fillRemainingScrollValues(androidx.recyclerview.widget.RecyclerView.C7713 r4) {
            r3 = this;
            int r0 = r3.getScrollState()
            r1 = 2
            if (r0 != r1) goto L22
            androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟ۡ r0 = r3.mViewFlinger
            android.widget.OverScroller r0 = r0.f29668
            int r1 = r0.getFinalX()
            int r2 = r0.getCurrX()
            int r1 = r1 - r2
            r4.f29664 = r1
            int r1 = r0.getFinalY()
            int r0 = r0.getCurrY()
            int r1 = r1 - r0
            r4.f29665 = r1
            goto L27
        L22:
            r0 = 0
            r4.f29664 = r0
            r4.f29665 = r0
        L27:
            return
    }

    @Yue.InterfaceC4544
    public android.view.View findChildViewUnder(float r6, float r7) {
            r5 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r5.mChildHelper
            int r0 = r0.m30048()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L44
            androidx.recyclerview.widget.ۥ۟۟۟۟ r1 = r5.mChildHelper
            android.view.View r1 = r1.m30047(r0)
            float r2 = r1.getTranslationX()
            float r3 = r1.getTranslationY()
            int r4 = r1.getLeft()
            float r4 = (float) r4
            float r4 = r4 + r2
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 < 0) goto L41
            int r4 = r1.getRight()
            float r4 = (float) r4
            float r4 = r4 + r2
            int r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r2 > 0) goto L41
            int r2 = r1.getTop()
            float r2 = (float) r2
            float r2 = r2 + r3
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 < 0) goto L41
            int r2 = r1.getBottom()
            float r2 = (float) r2
            float r2 = r2 + r3
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 > 0) goto L41
            return r1
        L41:
            int r0 = r0 + (-1)
            goto L8
        L44:
            r6 = 0
            return r6
    }

    @Yue.InterfaceC4544
    public android.view.View findContainingItemView(@Yue.InterfaceC4410 android.view.View r3) {
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
    }

    @Yue.InterfaceC4544
    public androidx.recyclerview.widget.RecyclerView.AbstractC7716 findContainingViewHolder(@Yue.InterfaceC4410 android.view.View r1) {
            r0 = this;
            android.view.View r1 = r0.findContainingItemView(r1)
            if (r1 != 0) goto L8
            r1 = 0
            goto Lc
        L8:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r1 = r0.getChildViewHolder(r1)
        Lc:
            return r1
    }

    @Yue.InterfaceC4544
    public androidx.recyclerview.widget.RecyclerView.AbstractC7716 findViewHolderForAdapterPosition(int r6) {
            r5 = this;
            boolean r0 = r5.mDataSetHasChangedAfterLayout
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r5.mChildHelper
            int r0 = r0.m30051()
            r2 = 0
        Ld:
            if (r2 >= r0) goto L37
            androidx.recyclerview.widget.ۥ۟۟۟۟ r3 = r5.mChildHelper
            android.view.View r3 = r3.m30050(r2)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L34
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L34
            int r4 = r5.getAdapterPositionFor(r3)
            if (r4 != r6) goto L34
            androidx.recyclerview.widget.ۥ۟۟۟۟ r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.m30055(r4)
            if (r1 == 0) goto L33
            r1 = r3
            goto L34
        L33:
            return r3
        L34:
            int r2 = r2 + 1
            goto Ld
        L37:
            return r1
    }

    public androidx.recyclerview.widget.RecyclerView.AbstractC7716 findViewHolderForItemId(long r7) {
            r6 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r6.mAdapter
            r1 = 0
            if (r0 == 0) goto L3f
            boolean r0 = r0.hasStableIds()
            if (r0 != 0) goto Lc
            goto L3f
        Lc:
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r6.mChildHelper
            int r0 = r0.m30051()
            r2 = 0
        L13:
            if (r2 >= r0) goto L3f
            androidx.recyclerview.widget.ۥ۟۟۟۟ r3 = r6.mChildHelper
            android.view.View r3 = r3.m30050(r2)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L3c
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L3c
            long r4 = r3.getItemId()
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 != 0) goto L3c
            androidx.recyclerview.widget.ۥ۟۟۟۟ r1 = r6.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.m30055(r4)
            if (r1 == 0) goto L3b
            r1 = r3
            goto L3c
        L3b:
            return r3
        L3c:
            int r2 = r2 + 1
            goto L13
        L3f:
            return r1
    }

    @Yue.InterfaceC4544
    public androidx.recyclerview.widget.RecyclerView.AbstractC7716 findViewHolderForLayoutPosition(int r2) {
            r1 = this;
            r0 = 0
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = r1.findViewHolderForPosition(r2, r0)
            return r2
    }

    @Yue.InterfaceC4544
    @java.lang.Deprecated
    public androidx.recyclerview.widget.RecyclerView.AbstractC7716 findViewHolderForPosition(int r2) {
            r1 = this;
            r0 = 0
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = r1.findViewHolderForPosition(r2, r0)
            return r2
    }

    @Yue.InterfaceC4544
    public androidx.recyclerview.widget.RecyclerView.AbstractC7716 findViewHolderForPosition(int r6, boolean r7) {
            r5 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r5.mChildHelper
            int r0 = r0.m30051()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.ۥ۟۟۟۟ r3 = r5.mChildHelper
            android.view.View r3 = r3.m30050(r2)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.ۥ۟۟۟۟ r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.m30055(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
    }

    public boolean fling(int r8, int r9) {
            r7 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r7.mLayout
            r1 = 0
            if (r0 != 0) goto Ld
            java.lang.String r8 = "RecyclerView"
            java.lang.String r9 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r8, r9)
            return r1
        Ld:
            boolean r2 = r7.mLayoutSuppressed
            if (r2 == 0) goto L12
            return r1
        L12:
            boolean r0 = r0.canScrollHorizontally()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r2 = r7.mLayout
            boolean r2 = r2.canScrollVertically()
            if (r0 == 0) goto L26
            int r3 = java.lang.Math.abs(r8)
            int r4 = r7.mMinFlingVelocity
            if (r3 >= r4) goto L27
        L26:
            r8 = r1
        L27:
            if (r2 == 0) goto L31
            int r3 = java.lang.Math.abs(r9)
            int r4 = r7.mMinFlingVelocity
            if (r3 >= r4) goto L32
        L31:
            r9 = r1
        L32:
            if (r8 != 0) goto L37
            if (r9 != 0) goto L37
            return r1
        L37:
            float r3 = (float) r8
            float r4 = (float) r9
            boolean r5 = r7.dispatchNestedPreFling(r3, r4)
            if (r5 != 0) goto L7b
            r5 = 1
            if (r0 != 0) goto L47
            if (r2 == 0) goto L45
            goto L47
        L45:
            r6 = r1
            goto L48
        L47:
            r6 = r5
        L48:
            r7.dispatchNestedFling(r3, r4, r6)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۡ r3 = r7.mOnFlingListener
            if (r3 == 0) goto L56
            boolean r3 = r3.onFling(r8, r9)
            if (r3 == 0) goto L56
            return r5
        L56:
            if (r6 == 0) goto L7b
            if (r2 == 0) goto L5c
            r0 = r0 | 2
        L5c:
            r7.startNestedScroll(r0, r5)
            int r0 = r7.mMaxFlingVelocity
            int r1 = -r0
            int r8 = java.lang.Math.min(r8, r0)
            int r8 = java.lang.Math.max(r1, r8)
            int r0 = r7.mMaxFlingVelocity
            int r1 = -r0
            int r9 = java.lang.Math.min(r9, r0)
            int r9 = java.lang.Math.max(r1, r9)
            androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟ۡ r0 = r7.mViewFlinger
            r0.m29873(r8, r9)
            return r5
        L7b:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public android.view.View focusSearch(android.view.View r9, int r10) {
            r8 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r8.mLayout
            android.view.View r0 = r0.onInterceptFocusSearch(r9, r10)
            if (r0 == 0) goto L9
            return r0
        L9:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r8.mAdapter
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1f
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r8.mLayout
            if (r0 == 0) goto L1f
            boolean r0 = r8.isComputingLayout()
            if (r0 != 0) goto L1f
            boolean r0 = r8.mLayoutSuppressed
            if (r0 != 0) goto L1f
            r0 = r1
            goto L20
        L1f:
            r0 = r2
        L20:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            r4 = 0
            if (r0 == 0) goto L9b
            r5 = 2
            if (r10 == r5) goto L2c
            if (r10 != r1) goto L9b
        L2c:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r8.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L4a
            if (r10 != r5) goto L39
            r0 = 130(0x82, float:1.82E-43)
            goto L3b
        L39:
            r0 = 33
        L3b:
            android.view.View r6 = r3.findNextFocus(r8, r9, r0)
            if (r6 != 0) goto L43
            r6 = r1
            goto L44
        L43:
            r6 = r2
        L44:
            boolean r7 = androidx.recyclerview.widget.RecyclerView.FORCE_ABS_FOCUS_SEARCH_DIRECTION
            if (r7 == 0) goto L4b
            r10 = r0
            goto L4b
        L4a:
            r6 = r2
        L4b:
            if (r6 != 0) goto L7b
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r8.mLayout
            boolean r0 = r0.canScrollHorizontally()
            if (r0 == 0) goto L7b
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r8.mLayout
            int r0 = r0.getLayoutDirection()
            if (r0 != r1) goto L5f
            r0 = r1
            goto L60
        L5f:
            r0 = r2
        L60:
            if (r10 != r5) goto L64
            r5 = r1
            goto L65
        L64:
            r5 = r2
        L65:
            r0 = r0 ^ r5
            if (r0 == 0) goto L6b
            r0 = 66
            goto L6d
        L6b:
            r0 = 17
        L6d:
            android.view.View r5 = r3.findNextFocus(r8, r9, r0)
            if (r5 != 0) goto L74
            goto L75
        L74:
            r1 = r2
        L75:
            boolean r5 = androidx.recyclerview.widget.RecyclerView.FORCE_ABS_FOCUS_SEARCH_DIRECTION
            if (r5 == 0) goto L7a
            r10 = r0
        L7a:
            r6 = r1
        L7b:
            if (r6 == 0) goto L96
            r8.consumePendingUpdateOperations()
            android.view.View r0 = r8.findContainingItemView(r9)
            if (r0 != 0) goto L87
            return r4
        L87:
            r8.startInterceptRequestLayout()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r8.mLayout
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r1 = r8.mRecycler
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r5 = r8.mState
            r0.onFocusSearchFailed(r9, r10, r1, r5)
            r8.stopInterceptRequestLayout(r2)
        L96:
            android.view.View r0 = r3.findNextFocus(r8, r9, r10)
            goto Lbf
        L9b:
            android.view.View r1 = r3.findNextFocus(r8, r9, r10)
            if (r1 != 0) goto Lbe
            if (r0 == 0) goto Lbe
            r8.consumePendingUpdateOperations()
            android.view.View r0 = r8.findContainingItemView(r9)
            if (r0 != 0) goto Lad
            return r4
        Lad:
            r8.startInterceptRequestLayout()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r8.mLayout
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r1 = r8.mRecycler
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r3 = r8.mState
            android.view.View r0 = r0.onFocusSearchFailed(r9, r10, r1, r3)
            r8.stopInterceptRequestLayout(r2)
            goto Lbf
        Lbe:
            r0 = r1
        Lbf:
            if (r0 == 0) goto Ld6
            boolean r1 = r0.hasFocusable()
            if (r1 != 0) goto Ld6
            android.view.View r1 = r8.getFocusedChild()
            if (r1 != 0) goto Ld2
            android.view.View r9 = super.focusSearch(r9, r10)
            return r9
        Ld2:
            r8.m29687(r0, r4)
            return r9
        Ld6:
            boolean r1 = r8.m29680(r9, r0, r10)
            if (r1 == 0) goto Ldd
            goto Le1
        Ldd:
            android.view.View r0 = super.focusSearch(r9, r10)
        Le1:
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r3.mLayout
            if (r0 == 0) goto L9
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = r0.generateDefaultLayoutParams()
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "RecyclerView has no LayoutManager"
            r1.append(r2)
            java.lang.String r2 = r3.exceptionLabel()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            if (r0 == 0) goto Ld
            android.content.Context r1 = r2.getContext()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r3 = r0.generateLayoutParams(r1, r3)
            return r3
        Ld:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "RecyclerView has no LayoutManager"
            r0.append(r1)
            java.lang.String r1 = r2.exceptionLabel()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            if (r0 == 0) goto L9
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r3 = r0.generateLayoutParams(r3)
            return r3
        L9:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "RecyclerView has no LayoutManager"
            r0.append(r1)
            java.lang.String r1 = r2.exceptionLabel()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
            r1 = this;
            java.lang.String r0 = "androidx.recyclerview.widget.RecyclerView"
            return r0
    }

    @Yue.InterfaceC4544
    public androidx.recyclerview.widget.RecyclerView.AbstractC7678 getAdapter() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r1.mAdapter
            return r0
    }

    public int getAdapterPositionFor(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r2) {
            r1 = this;
            r0 = 524(0x20c, float:7.34E-43)
            boolean r0 = r2.hasAnyOfTheFlags(r0)
            if (r0 != 0) goto L18
            boolean r0 = r2.isBound()
            if (r0 != 0) goto Lf
            goto L18
        Lf:
            androidx.recyclerview.widget.ۥ r0 = r1.mAdapterHelper
            int r2 = r2.mPosition
            int r2 = r0.m30000(r2)
            return r2
        L18:
            r2 = -1
            return r2
    }

    @Override // android.view.View
    public int getBaseline() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.mLayout
            if (r0 == 0) goto L9
            int r0 = r0.getBaseline()
            return r0
        L9:
            int r0 = super.getBaseline()
            return r0
    }

    public long getChangedHolderKey(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r2.mAdapter
            boolean r0 = r0.hasStableIds()
            if (r0 == 0) goto Ld
            long r0 = r3.getItemId()
            goto L10
        Ld:
            int r3 = r3.mPosition
            long r0 = (long) r3
        L10:
            return r0
    }

    public int getChildAdapterPosition(@Yue.InterfaceC4410 android.view.View r1) {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r1 = getChildViewHolderInt(r1)
            if (r1 == 0) goto Lb
            int r1 = r1.getAdapterPosition()
            goto Lc
        Lb:
            r1 = -1
        Lc:
            return r1
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۤ r0 = r1.mChildDrawingOrderCallback
            if (r0 != 0) goto L9
            int r2 = super.getChildDrawingOrder(r2, r3)
            return r2
        L9:
            int r2 = r0.mo29724(r2, r3)
            return r2
    }

    public long getChildItemId(@Yue.InterfaceC4410 android.view.View r4) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r3.mAdapter
            r1 = -1
            if (r0 == 0) goto L17
            boolean r0 = r0.hasStableIds()
            if (r0 != 0) goto Ld
            goto L17
        Ld:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r4 = getChildViewHolderInt(r4)
            if (r4 == 0) goto L17
            long r1 = r4.getItemId()
        L17:
            return r1
    }

    public int getChildLayoutPosition(@Yue.InterfaceC4410 android.view.View r1) {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r1 = getChildViewHolderInt(r1)
            if (r1 == 0) goto Lb
            int r1 = r1.getLayoutPosition()
            goto Lc
        Lb:
            r1 = -1
        Lc:
            return r1
    }

    @java.lang.Deprecated
    public int getChildPosition(@Yue.InterfaceC4410 android.view.View r1) {
            r0 = this;
            int r1 = r0.getChildAdapterPosition(r1)
            return r1
    }

    public androidx.recyclerview.widget.RecyclerView.AbstractC7716 getChildViewHolder(@Yue.InterfaceC4410 android.view.View r4) {
            r3 = this;
            android.view.ViewParent r0 = r4.getParent()
            if (r0 == 0) goto L28
            if (r0 != r3) goto L9
            goto L28
        L9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "View "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " is not a direct child of "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L28:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r4 = getChildViewHolderInt(r4)
            return r4
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
            r1 = this;
            boolean r0 = r1.mClipToPadding
            return r0
    }

    @Yue.InterfaceC4544
    public androidx.recyclerview.widget.C7796 getCompatAccessibilityDelegate() {
            r1 = this;
            androidx.recyclerview.widget.ۥ۟۟۠ۢ r0 = r1.mAccessibilityDelegate
            return r0
    }

    public void getDecoratedBoundsWithMargins(@Yue.InterfaceC4410 android.view.View r1, @Yue.InterfaceC4410 android.graphics.Rect r2) {
            r0 = this;
            getDecoratedBoundsWithMarginsInt(r1, r2)
            return
    }

    @Yue.InterfaceC4410
    public androidx.recyclerview.widget.RecyclerView.C7682 getEdgeEffectFactory() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۥ r0 = r1.mEdgeEffectFactory
            return r0
    }

    @Yue.InterfaceC4544
    public androidx.recyclerview.widget.RecyclerView.AbstractC7684 getItemAnimator() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r0 = r1.mItemAnimator
            return r0
    }

    public android.graphics.Rect getItemDecorInsetsForChild(android.view.View r9) {
            r8 = this;
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
            boolean r1 = r0.f29617
            if (r1 != 0) goto Ld
            android.graphics.Rect r9 = r0.f29616
            return r9
        Ld:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r1 = r8.mState
            boolean r1 = r1.m29864()
            if (r1 == 0) goto L24
            boolean r1 = r0.m29774()
            if (r1 != 0) goto L21
            boolean r1 = r0.m29776()
            if (r1 == 0) goto L24
        L21:
            android.graphics.Rect r9 = r0.f29616
            return r9
        L24:
            android.graphics.Rect r1 = r0.f29616
            r2 = 0
            r1.set(r2, r2, r2, r2)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ> r3 = r8.mItemDecorations
            int r3 = r3.size()
            r4 = r2
        L31:
            if (r4 >= r3) goto L68
            android.graphics.Rect r5 = r8.mTempRect
            r5.set(r2, r2, r2, r2)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ> r5 = r8.mItemDecorations
            java.lang.Object r5 = r5.get(r4)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ r5 = (androidx.recyclerview.widget.RecyclerView.AbstractC7690) r5
            android.graphics.Rect r6 = r8.mTempRect
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r7 = r8.mState
            r5.getItemOffsets(r6, r9, r8, r7)
            int r5 = r1.left
            android.graphics.Rect r6 = r8.mTempRect
            int r7 = r6.left
            int r5 = r5 + r7
            r1.left = r5
            int r5 = r1.top
            int r7 = r6.top
            int r5 = r5 + r7
            r1.top = r5
            int r5 = r1.right
            int r7 = r6.right
            int r5 = r5 + r7
            r1.right = r5
            int r5 = r1.bottom
            int r6 = r6.bottom
            int r5 = r5 + r6
            r1.bottom = r5
            int r4 = r4 + 1
            goto L31
        L68:
            r0.f29617 = r2
            return r1
    }

    @Yue.InterfaceC4410
    public androidx.recyclerview.widget.RecyclerView.AbstractC7690 getItemDecorationAt(int r4) {
            r3 = this;
            int r0 = r3.getItemDecorationCount()
            if (r4 < 0) goto L11
            if (r4 >= r0) goto L11
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ> r0 = r3.mItemDecorations
            java.lang.Object r4 = r0.get(r4)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ r4 = (androidx.recyclerview.widget.RecyclerView.AbstractC7690) r4
            return r4
        L11:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = " is an invalid index for size "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
    }

    public int getItemDecorationCount() {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ> r0 = r1.mItemDecorations
            int r0 = r0.size()
            return r0
    }

    @Yue.InterfaceC4544
    public androidx.recyclerview.widget.RecyclerView.AbstractC7691 getLayoutManager() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.mLayout
            return r0
    }

    public int getMaxFlingVelocity() {
            r1 = this;
            int r0 = r1.mMaxFlingVelocity
            return r0
    }

    public int getMinFlingVelocity() {
            r1 = this;
            int r0 = r1.mMinFlingVelocity
            return r0
    }

    public long getNanoTime() {
            r2 = this;
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L9
            long r0 = java.lang.System.nanoTime()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Yue.InterfaceC4544
    public androidx.recyclerview.widget.RecyclerView.AbstractC7698 getOnFlingListener() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۡ r0 = r1.mOnFlingListener
            return r0
    }

    public boolean getPreserveFocusAfterLayout() {
            r1 = this;
            boolean r0 = r1.mPreserveFocusAfterLayout
            return r0
    }

    @Yue.InterfaceC4410
    public androidx.recyclerview.widget.RecyclerView.C7702 getRecycledViewPool() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r0 = r1.mRecycler
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ r0 = r0.m29805()
            return r0
    }

    public int getScrollState() {
            r1 = this;
            int r0 = r1.mScrollState
            return r0
    }

    public boolean hasFixedSize() {
            r1 = this;
            boolean r0 = r1.mHasFixedSize
            return r0
    }

    @Override // android.view.View, Yue.InterfaceC4382
    public boolean hasNestedScrollingParent() {
            r1 = this;
            Yue.ۥۡۢۢ۠ r0 = r1.getScrollingChildHelper()
            boolean r0 = r0.m17241()
            return r0
    }

    @Override // Yue.InterfaceC4380
    public boolean hasNestedScrollingParent(int r2) {
            r1 = this;
            Yue.ۥۡۢۢ۠ r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.m17242(r2)
            return r2
    }

    public boolean hasPendingAdapterUpdates() {
            r1 = this;
            boolean r0 = r1.mFirstLayoutComplete
            if (r0 == 0) goto L13
            boolean r0 = r1.mDataSetHasChangedAfterLayout
            if (r0 != 0) goto L13
            androidx.recyclerview.widget.ۥ r0 = r1.mAdapterHelper
            boolean r0 = r0.m30011()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            return r0
    }

    public void initAdapterManager() {
            r2 = this;
            androidx.recyclerview.widget.ۥ r0 = new androidx.recyclerview.widget.ۥ
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟۠ r1 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟۠
            r1.<init>(r2)
            r0.<init>(r1)
            r2.mAdapterHelper = r0
            return
    }

    @Yue.InterfaceC6959
    public void initFastScroller(android.graphics.drawable.StateListDrawable r11, android.graphics.drawable.Drawable r12, android.graphics.drawable.StateListDrawable r13, android.graphics.drawable.Drawable r14) {
            r10 = this;
            if (r11 == 0) goto L2d
            if (r12 == 0) goto L2d
            if (r13 == 0) goto L2d
            if (r14 == 0) goto L2d
            android.content.Context r0 = r10.getContext()
            android.content.res.Resources r0 = r0.getResources()
            androidx.recyclerview.widget.ۥۣ۟۟۟ r1 = new androidx.recyclerview.widget.ۥۣ۟۟۟
            int r2 = Yue.C5086.C5089.f18182
            int r7 = r0.getDimensionPixelSize(r2)
            int r2 = Yue.C5086.C5089.f18184
            int r8 = r0.getDimensionPixelSize(r2)
            int r2 = Yue.C5086.C5089.f18183
            int r9 = r0.getDimensionPixelOffset(r2)
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L2d:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Trying to set fast scroller without both required drawables."
            r12.append(r13)
            java.lang.String r13 = r10.exceptionLabel()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }

    public void invalidateGlows() {
            r1 = this;
            r0 = 0
            r1.mBottomGlow = r0
            r1.mTopGlow = r0
            r1.mRightGlow = r0
            r1.mLeftGlow = r0
            return
    }

    public void invalidateItemDecorations() {
            r2 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ> r0 = r2.mItemDecorations
            int r0 = r0.size()
            if (r0 != 0) goto L9
            return
        L9:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            if (r0 == 0) goto L12
            java.lang.String r1 = "Cannot invalidate item decorations during a scroll or layout"
            r0.assertNotInLayoutOrScroll(r1)
        L12:
            r2.markItemDecorInsetsDirty()
            r2.requestLayout()
            return
    }

    public boolean isAccessibilityEnabled() {
            r1 = this;
            android.view.accessibility.AccessibilityManager r0 = r1.mAccessibilityManager
            if (r0 == 0) goto Lc
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public boolean isAnimating() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r0 = r1.mItemAnimator
            if (r0 == 0) goto Lc
            boolean r0 = r0.mo29742()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
            r1 = this;
            boolean r0 = r1.mIsAttached
            return r0
    }

    public boolean isComputingLayout() {
            r1 = this;
            int r0 = r1.mLayoutOrScrollCounter
            if (r0 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @java.lang.Deprecated
    public boolean isLayoutFrozen() {
            r1 = this;
            boolean r0 = r1.isLayoutSuppressed()
            return r0
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
            r1 = this;
            boolean r0 = r1.mLayoutSuppressed
            return r0
    }

    @Override // android.view.View, Yue.InterfaceC4382
    public boolean isNestedScrollingEnabled() {
            r1 = this;
            Yue.ۥۡۢۢ۠ r0 = r1.getScrollingChildHelper()
            boolean r0 = r0.m17243()
            return r0
    }

    public void jumpToPositionForSmoothScroller(int r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.mLayout
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 2
            r1.setScrollState(r0)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.mLayout
            r0.scrollToPosition(r2)
            r1.awakenScrollBars()
            return
    }

    public void markItemDecorInsetsDirty() {
            r4 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r4.mChildHelper
            int r0 = r0.m30051()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1b
            androidx.recyclerview.widget.ۥ۟۟۟۟ r2 = r4.mChildHelper
            android.view.View r2 = r2.m30050(r1)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r2 = (androidx.recyclerview.widget.RecyclerView.C7696) r2
            r3 = 1
            r2.f29617 = r3
            int r1 = r1 + 1
            goto L7
        L1b:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r0 = r4.mRecycler
            r0.m29815()
            return
    }

    public void markKnownViewsInvalid() {
            r4 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r4.mChildHelper
            int r0 = r0.m30051()
            r1 = 0
        L7:
            if (r1 >= r0) goto L22
            androidx.recyclerview.widget.ۥ۟۟۟۟ r2 = r4.mChildHelper
            android.view.View r2 = r2.m30050(r1)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = getChildViewHolderInt(r2)
            if (r2 == 0) goto L1f
            boolean r3 = r2.shouldIgnore()
            if (r3 != 0) goto L1f
            r3 = 6
            r2.addFlags(r3)
        L1f:
            int r1 = r1 + 1
            goto L7
        L22:
            r4.markItemDecorInsetsDirty()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r0 = r4.mRecycler
            r0.m29816()
            return
    }

    public void offsetChildrenHorizontal(@Yue.InterfaceC4992 int r4) {
            r3 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r3.mChildHelper
            int r0 = r0.m30048()
            r1 = 0
        L7:
            if (r1 >= r0) goto L15
            androidx.recyclerview.widget.ۥ۟۟۟۟ r2 = r3.mChildHelper
            android.view.View r2 = r2.m30047(r1)
            r2.offsetLeftAndRight(r4)
            int r1 = r1 + 1
            goto L7
        L15:
            return
    }

    public void offsetChildrenVertical(@Yue.InterfaceC4992 int r4) {
            r3 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r3.mChildHelper
            int r0 = r0.m30048()
            r1 = 0
        L7:
            if (r1 >= r0) goto L15
            androidx.recyclerview.widget.ۥ۟۟۟۟ r2 = r3.mChildHelper
            android.view.View r2 = r2.m30047(r1)
            r2.offsetTopAndBottom(r4)
            int r1 = r1 + 1
            goto L7
        L15:
            return
    }

    public void offsetPositionRecordsForInsert(int r6, int r7) {
            r5 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r5.mChildHelper
            int r0 = r0.m30051()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L2b
            androidx.recyclerview.widget.ۥ۟۟۟۟ r3 = r5.mChildHelper
            android.view.View r3 = r3.m30050(r2)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L28
            boolean r4 = r3.shouldIgnore()
            if (r4 != 0) goto L28
            int r4 = r3.mPosition
            if (r4 < r6) goto L28
            r3.offsetPosition(r7, r1)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r3 = r5.mState
            r4 = 1
            r3.f29655 = r4
        L28:
            int r2 = r2 + 1
            goto L8
        L2b:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r0 = r5.mRecycler
            r0.m29817(r6, r7)
            r5.requestLayout()
            return
    }

    public void offsetPositionRecordsForMove(int r10, int r11) {
            r9 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r9.mChildHelper
            int r0 = r0.m30051()
            r1 = 1
            if (r10 >= r11) goto Ld
            r2 = -1
            r3 = r10
            r4 = r11
            goto L10
        Ld:
            r4 = r10
            r3 = r11
            r2 = r1
        L10:
            r5 = 0
            r6 = r5
        L12:
            if (r6 >= r0) goto L39
            androidx.recyclerview.widget.ۥ۟۟۟۟ r7 = r9.mChildHelper
            android.view.View r7 = r7.m30050(r6)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r7 = getChildViewHolderInt(r7)
            if (r7 == 0) goto L36
            int r8 = r7.mPosition
            if (r8 < r3) goto L36
            if (r8 <= r4) goto L27
            goto L36
        L27:
            if (r8 != r10) goto L2f
            int r8 = r11 - r10
            r7.offsetPosition(r8, r5)
            goto L32
        L2f:
            r7.offsetPosition(r2, r5)
        L32:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r7 = r9.mState
            r7.f29655 = r1
        L36:
            int r6 = r6 + 1
            goto L12
        L39:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r0 = r9.mRecycler
            r0.m29818(r10, r11)
            r9.requestLayout()
            return
    }

    public void offsetPositionRecordsForRemove(int r8, int r9, boolean r10) {
            r7 = this;
            int r0 = r8 + r9
            androidx.recyclerview.widget.ۥ۟۟۟۟ r1 = r7.mChildHelper
            int r1 = r1.m30051()
            r2 = 0
        L9:
            if (r2 >= r1) goto L3a
            androidx.recyclerview.widget.ۥ۟۟۟۟ r3 = r7.mChildHelper
            android.view.View r3 = r3.m30050(r2)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.shouldIgnore()
            if (r4 != 0) goto L37
            int r4 = r3.mPosition
            r5 = 1
            if (r4 < r0) goto L2b
            int r4 = -r9
            r3.offsetPosition(r4, r10)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r3 = r7.mState
            r3.f29655 = r5
            goto L37
        L2b:
            if (r4 < r8) goto L37
            int r4 = r8 + (-1)
            int r6 = -r9
            r3.flagRemovedAndOffsetPosition(r4, r6, r10)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r3 = r7.mState
            r3.f29655 = r5
        L37:
            int r2 = r2 + 1
            goto L9
        L3a:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r0 = r7.mRecycler
            r0.m29819(r8, r9, r10)
            r7.requestLayout()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.mLayoutOrScrollCounter = r0
            r1 = 1
            r5.mIsAttached = r1
            boolean r2 = r5.mFirstLayoutComplete
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.mFirstLayoutComplete = r1
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r5.mLayout
            if (r1 == 0) goto L1e
            r1.dispatchAttachedToWindow(r5)
        L1e:
            r5.mPostedAnimatorRunner = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L61
            java.lang.ThreadLocal<androidx.recyclerview.widget.ۥ۟۟۟ۤ> r0 = androidx.recyclerview.widget.RunnableC7766.f29935
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.ۥ۟۟۟ۤ r1 = (androidx.recyclerview.widget.RunnableC7766) r1
            r5.mGapWorker = r1
            if (r1 != 0) goto L5c
            androidx.recyclerview.widget.ۥ۟۟۟ۤ r1 = new androidx.recyclerview.widget.ۥ۟۟۟ۤ
            r1.<init>()
            r5.mGapWorker = r1
            android.view.Display r1 = Yue.C6794.m26130(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4e
            if (r1 == 0) goto L4e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4e
            goto L50
        L4e:
            r1 = 1114636288(0x42700000, float:60.0)
        L50:
            androidx.recyclerview.widget.ۥ۟۟۟ۤ r2 = r5.mGapWorker
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f29939 = r3
            r0.set(r2)
        L5c:
            androidx.recyclerview.widget.ۥ۟۟۟ۤ r0 = r5.mGapWorker
            r0.m30135(r5)
        L61:
            return
    }

    public void onChildAttachedToWindow(@Yue.InterfaceC4410 android.view.View r1) {
            r0 = this;
            return
    }

    public void onChildDetachedFromWindow(@Yue.InterfaceC4410 android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r0 = r2.mItemAnimator
            if (r0 == 0) goto La
            r0.mo29737()
        La:
            r2.stopScroll()
            r0 = 0
            r2.mIsAttached = r0
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            if (r0 == 0) goto L19
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r1 = r2.mRecycler
            r0.dispatchDetachedFromWindow(r2, r1)
        L19:
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r2.mPendingAccessibilityImportanceChange
            r0.clear()
            java.lang.Runnable r0 = r2.mItemAnimatorRunner
            r2.removeCallbacks(r0)
            androidx.recyclerview.widget.ۥ۟۟ۡ r0 = r2.mViewInfoStore
            r0.m30344()
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L36
            androidx.recyclerview.widget.ۥ۟۟۟ۤ r0 = r2.mGapWorker
            if (r0 == 0) goto L36
            r0.m30143(r2)
            r0 = 0
            r2.mGapWorker = r0
        L36:
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            super.onDraw(r5)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ> r0 = r4.mItemDecorations
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1c
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ> r2 = r4.mItemDecorations
            java.lang.Object r2 = r2.get(r1)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ r2 = (androidx.recyclerview.widget.RecyclerView.AbstractC7690) r2
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r3 = r4.mState
            r2.onDraw(r5, r4, r3)
            int r1 = r1 + 1
            goto La
        L1c:
            return
    }

    public void onEnterLayoutOrScroll() {
            r1 = this;
            int r0 = r1.mLayoutOrScrollCounter
            int r0 = r0 + 1
            r1.mLayoutOrScrollCounter = r0
            return
    }

    public void onExitLayoutOrScroll() {
            r1 = this;
            r0 = 1
            r1.onExitLayoutOrScroll(r0)
            return
    }

    public void onExitLayoutOrScroll(boolean r3) {
            r2 = this;
            int r0 = r2.mLayoutOrScrollCounter
            r1 = 1
            int r0 = r0 - r1
            r2.mLayoutOrScrollCounter = r0
            if (r0 >= r1) goto L13
            r0 = 0
            r2.mLayoutOrScrollCounter = r0
            if (r3 == 0) goto L13
            r2.m29666()
            r2.dispatchPendingImportantForAccessibilityChanges()
        L13:
            return
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r5.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r3 = r5.mLayout
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.scrollByInternal(r2, r0, r6)
        L77:
            return r1
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
            r8 = this;
            boolean r0 = r8.mLayoutSuppressed
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 0
            r8.mInterceptingOnItemTouchListener = r0
            boolean r0 = r8.m29671(r9)
            r2 = 1
            if (r0 == 0) goto L14
            r8.m29663()
            return r2
        L14:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r8.mLayout
            if (r0 != 0) goto L19
            return r1
        L19:
            boolean r0 = r0.canScrollHorizontally()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r3 = r8.mLayout
            boolean r3 = r3.canScrollVertically()
            android.view.VelocityTracker r4 = r8.mVelocityTracker
            if (r4 != 0) goto L2d
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r8.mVelocityTracker = r4
        L2d:
            android.view.VelocityTracker r4 = r8.mVelocityTracker
            r4.addMovement(r9)
            int r4 = r9.getActionMasked()
            int r5 = r9.getActionIndex()
            r6 = 2
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r4 == 0) goto Ldd
            if (r4 == r2) goto Ld4
            if (r4 == r6) goto L74
            r0 = 3
            if (r4 == r0) goto L6f
            r0 = 5
            if (r4 == r0) goto L53
            r0 = 6
            if (r4 == r0) goto L4e
            goto L11b
        L4e:
            r8.m29681(r9)
            goto L11b
        L53:
            int r0 = r9.getPointerId(r5)
            r8.mScrollPointerId = r0
            float r0 = r9.getX(r5)
            float r0 = r0 + r7
            int r0 = (int) r0
            r8.mLastTouchX = r0
            r8.mInitialTouchX = r0
            float r9 = r9.getY(r5)
            float r9 = r9 + r7
            int r9 = (int) r9
            r8.mLastTouchY = r9
            r8.mInitialTouchY = r9
            goto L11b
        L6f:
            r8.m29663()
            goto L11b
        L74:
            int r4 = r8.mScrollPointerId
            int r4 = r9.findPointerIndex(r4)
            if (r4 >= 0) goto L9a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            r9.append(r0)
            int r0 = r8.mScrollPointerId
            r9.append(r0)
            java.lang.String r0 = " not found. Did any MotionEvents get skipped?"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "RecyclerView"
            android.util.Log.e(r0, r9)
            return r1
        L9a:
            float r5 = r9.getX(r4)
            float r5 = r5 + r7
            int r5 = (int) r5
            float r9 = r9.getY(r4)
            float r9 = r9 + r7
            int r9 = (int) r9
            int r4 = r8.mScrollState
            if (r4 == r2) goto L11b
            int r4 = r8.mInitialTouchX
            int r4 = r5 - r4
            int r6 = r8.mInitialTouchY
            int r6 = r9 - r6
            if (r0 == 0) goto Lc0
            int r0 = java.lang.Math.abs(r4)
            int r4 = r8.mTouchSlop
            if (r0 <= r4) goto Lc0
            r8.mLastTouchX = r5
            r0 = r2
            goto Lc1
        Lc0:
            r0 = r1
        Lc1:
            if (r3 == 0) goto Lce
            int r3 = java.lang.Math.abs(r6)
            int r4 = r8.mTouchSlop
            if (r3 <= r4) goto Lce
            r8.mLastTouchY = r9
            r0 = r2
        Lce:
            if (r0 == 0) goto L11b
            r8.setScrollState(r2)
            goto L11b
        Ld4:
            android.view.VelocityTracker r9 = r8.mVelocityTracker
            r9.clear()
            r8.stopNestedScroll(r1)
            goto L11b
        Ldd:
            boolean r4 = r8.mIgnoreMotionEventTillDown
            if (r4 == 0) goto Le3
            r8.mIgnoreMotionEventTillDown = r1
        Le3:
            int r4 = r9.getPointerId(r1)
            r8.mScrollPointerId = r4
            float r4 = r9.getX()
            float r4 = r4 + r7
            int r4 = (int) r4
            r8.mLastTouchX = r4
            r8.mInitialTouchX = r4
            float r9 = r9.getY()
            float r9 = r9 + r7
            int r9 = (int) r9
            r8.mLastTouchY = r9
            r8.mInitialTouchY = r9
            int r9 = r8.mScrollState
            if (r9 != r6) goto L10e
            android.view.ViewParent r9 = r8.getParent()
            r9.requestDisallowInterceptTouchEvent(r2)
            r8.setScrollState(r2)
            r8.stopNestedScroll(r2)
        L10e:
            int[] r9 = r8.mNestedOffsets
            r9[r2] = r1
            r9[r1] = r1
            if (r3 == 0) goto L118
            r0 = r0 | 2
        L118:
            r8.startNestedScroll(r0, r1)
        L11b:
            int r9 = r8.mScrollState
            if (r9 != r2) goto L120
            r1 = r2
        L120:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            java.lang.String r1 = "RV OnLayout"
            Yue.C6388.m23593(r1)
            r0.dispatchLayout()
            Yue.C6388.m23595()
            r1 = 1
            r0.mFirstLayoutComplete = r1
            return
    }

    @Override // android.view.View
    public void onMeasure(int r7, int r8) {
            r6 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r6.mLayout
            if (r0 != 0) goto L8
            r6.defaultOnMeasure(r7, r8)
            return
        L8:
            boolean r0 = r0.isAutoMeasureEnabled()
            r1 = 1
            if (r0 == 0) goto L70
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            int r2 = android.view.View.MeasureSpec.getMode(r8)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r3 = r6.mLayout
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r4 = r6.mRecycler
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r5 = r6.mState
            r3.onMeasure(r4, r5, r7, r8)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 != r3) goto L27
            if (r2 != r3) goto L27
            goto L2b
        L27:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r6.mAdapter
            if (r0 != 0) goto L2c
        L2b:
            return
        L2c:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r6.mState
            int r0 = r0.f29653
            if (r0 != r1) goto L35
            r6.m29667()
        L35:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r6.mLayout
            r0.setMeasureSpecs(r7, r8)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r6.mState
            r0.f29658 = r1
            r6.m29668()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r6.mLayout
            r0.setMeasuredDimensionFromChildren(r7, r8)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r6.mLayout
            boolean r0 = r0.shouldMeasureTwice()
            if (r0 == 0) goto Ldd
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r6.mLayout
            int r2 = r6.getMeasuredWidth()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            int r4 = r6.getMeasuredHeight()
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
            r0.setMeasureSpecs(r2, r3)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r6.mState
            r0.f29658 = r1
            r6.m29668()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r6.mLayout
            r0.setMeasuredDimensionFromChildren(r7, r8)
            goto Ldd
        L70:
            boolean r0 = r6.mHasFixedSize
            if (r0 == 0) goto L7e
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r6.mLayout
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r1 = r6.mRecycler
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r2 = r6.mState
            r0.onMeasure(r1, r2, r7, r8)
            return
        L7e:
            boolean r0 = r6.mAdapterUpdateDuringMeasure
            r2 = 0
            if (r0 == 0) goto La7
            r6.startInterceptRequestLayout()
            r6.onEnterLayoutOrScroll()
            r6.m29683()
            r6.onExitLayoutOrScroll()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r6.mState
            boolean r3 = r0.f29660
            if (r3 == 0) goto L98
            r0.f29656 = r1
            goto La1
        L98:
            androidx.recyclerview.widget.ۥ r0 = r6.mAdapterHelper
            r0.m30005()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r6.mState
            r0.f29656 = r2
        La1:
            r6.mAdapterUpdateDuringMeasure = r2
            r6.stopInterceptRequestLayout(r2)
            goto Lb9
        La7:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r6.mState
            boolean r0 = r0.f29660
            if (r0 == 0) goto Lb9
            int r7 = r6.getMeasuredWidth()
            int r8 = r6.getMeasuredHeight()
            r6.setMeasuredDimension(r7, r8)
            return
        Lb9:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r6.mAdapter
            if (r0 == 0) goto Lc6
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r1 = r6.mState
            int r0 = r0.getItemCount()
            r1.f29654 = r0
            goto Lca
        Lc6:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r6.mState
            r0.f29654 = r2
        Lca:
            r6.startInterceptRequestLayout()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r6.mLayout
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r1 = r6.mRecycler
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r3 = r6.mState
            r0.onMeasure(r1, r3, r7, r8)
            r6.stopInterceptRequestLayout(r2)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r7 = r6.mState
            r7.f29656 = r2
        Ldd:
            return
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int r2, android.graphics.Rect r3) {
            r1 = this;
            boolean r0 = r1.isComputingLayout()
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            boolean r2 = super.onRequestFocusInDescendants(r2, r3)
            return r2
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.recyclerview.widget.RecyclerView.C7707
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ r2 = (androidx.recyclerview.widget.RecyclerView.C7707) r2
            r1.mPendingSavedState = r2
            android.os.Parcelable r2 = r2.getSuperState()
            super.onRestoreInstanceState(r2)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r2 = r1.mLayout
            if (r2 == 0) goto L20
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ r0 = r1.mPendingSavedState
            android.os.Parcelable r0 = r0.f29637
            if (r0 == 0) goto L20
            r2.onRestoreInstanceState(r0)
        L20:
            return
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ r0 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ r1 = r2.mPendingSavedState
            if (r1 == 0) goto L11
            r0.m29838(r1)
            goto L1f
        L11:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r2.mLayout
            if (r1 == 0) goto L1c
            android.os.Parcelable r1 = r1.onSaveInstanceState()
            r0.f29637 = r1
            goto L1f
        L1c:
            r1 = 0
            r0.f29637 = r1
        L1f:
            return r0
    }

    public void onScrollStateChanged(int r1) {
            r0 = this;
            return
    }

    public void onScrolled(@Yue.InterfaceC4992 int r1, @Yue.InterfaceC4992 int r2) {
            r0 = this;
            return
    }

    @Override // android.view.View
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            if (r1 != r3) goto L7
            if (r2 == r4) goto La
        L7:
            r0.invalidateGlows()
        La:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r18) {
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.mLayoutSuppressed
            r8 = 0
            if (r0 != 0) goto L1da
            boolean r0 = r6.mIgnoreMotionEventTillDown
            if (r0 == 0) goto Lf
            goto L1da
        Lf:
            boolean r0 = r17.m29670(r18)
            r9 = 1
            if (r0 == 0) goto L1a
            r17.m29663()
            return r9
        L1a:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r6.mLayout
            if (r0 != 0) goto L1f
            return r8
        L1f:
            boolean r10 = r0.canScrollHorizontally()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r6.mLayout
            boolean r11 = r0.canScrollVertically()
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            if (r0 != 0) goto L33
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.mVelocityTracker = r0
        L33:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L43
            int[] r2 = r6.mNestedOffsets
            r2[r9] = r8
            r2[r8] = r8
        L43:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.mNestedOffsets
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L1b0
            if (r0 == r9) goto L16f
            r3 = 2
            if (r0 == r3) goto L8c
            r3 = 3
            if (r0 == r3) goto L87
            r3 = 5
            if (r0 == r3) goto L6b
            r1 = 6
            if (r0 == r1) goto L66
            goto L1d1
        L66:
            r17.m29681(r18)
            goto L1d1
        L6b:
            int r0 = r7.getPointerId(r1)
            r6.mScrollPointerId = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            goto L1d1
        L87:
            r17.m29663()
            goto L1d1
        L8c:
            int r0 = r6.mScrollPointerId
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto Lb2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.mScrollPointerId
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        Lb2:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.mLastTouchX
            int r0 = r0 - r13
            int r1 = r6.mLastTouchY
            int r1 = r1 - r14
            int r2 = r6.mScrollState
            if (r2 == r9) goto Lfb
            if (r10 == 0) goto Ldf
            if (r0 <= 0) goto Ld4
            int r2 = r6.mTouchSlop
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto Ldb
        Ld4:
            int r2 = r6.mTouchSlop
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        Ldb:
            if (r0 == 0) goto Ldf
            r2 = r9
            goto Le0
        Ldf:
            r2 = r8
        Le0:
            if (r11 == 0) goto Lf6
            if (r1 <= 0) goto Lec
            int r3 = r6.mTouchSlop
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto Lf3
        Lec:
            int r3 = r6.mTouchSlop
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        Lf3:
            if (r1 == 0) goto Lf6
            r2 = r9
        Lf6:
            if (r2 == 0) goto Lfb
            r6.setScrollState(r9)
        Lfb:
            r15 = r0
            r16 = r1
            int r0 = r6.mScrollState
            if (r0 != r9) goto L1d1
            int[] r3 = r6.mReusableIntPair
            r3[r8] = r8
            r3[r9] = r8
            if (r10 == 0) goto L10c
            r1 = r15
            goto L10d
        L10c:
            r1 = r8
        L10d:
            if (r11 == 0) goto L112
            r2 = r16
            goto L113
        L112:
            r2 = r8
        L113:
            int[] r4 = r6.mScrollOffset
            r5 = 0
            r0 = r17
            boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L140
            int[] r0 = r6.mReusableIntPair
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.mNestedOffsets
            r1 = r0[r8]
            int[] r2 = r6.mScrollOffset
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L140:
            r0 = r16
            int[] r1 = r6.mScrollOffset
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.mLastTouchX = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.mLastTouchY = r14
            if (r10 == 0) goto L152
            r1 = r15
            goto L153
        L152:
            r1 = r8
        L153:
            if (r11 == 0) goto L156
            r8 = r0
        L156:
            boolean r1 = r6.scrollByInternal(r1, r8, r7)
            if (r1 == 0) goto L163
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L163:
            androidx.recyclerview.widget.ۥ۟۟۟ۤ r1 = r6.mGapWorker
            if (r1 == 0) goto L1d1
            if (r15 != 0) goto L16b
            if (r0 == 0) goto L1d1
        L16b:
            r1.m30139(r6, r15, r0)
            goto L1d1
        L16f:
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            int r1 = r6.mMaxFlingVelocity
            float r1 = (float) r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2, r1)
            r0 = 0
            if (r10 == 0) goto L18b
            android.view.VelocityTracker r1 = r6.mVelocityTracker
            int r2 = r6.mScrollPointerId
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L18c
        L18b:
            r1 = r0
        L18c:
            if (r11 == 0) goto L198
            android.view.VelocityTracker r2 = r6.mVelocityTracker
            int r3 = r6.mScrollPointerId
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L199
        L198:
            r2 = r0
        L199:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L1a1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L1a9
        L1a1:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.fling(r0, r1)
            if (r0 != 0) goto L1ac
        L1a9:
            r6.setScrollState(r8)
        L1ac:
            r17.m29689()
            goto L1d6
        L1b0:
            int r0 = r7.getPointerId(r8)
            r6.mScrollPointerId = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            if (r11 == 0) goto L1ce
            r10 = r10 | 2
        L1ce:
            r6.startNestedScroll(r10, r8)
        L1d1:
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
        L1d6:
            r12.recycle()
            return r9
        L1da:
            return r8
    }

    public void postAnimationRunner() {
            r1 = this;
            boolean r0 = r1.mPostedAnimatorRunner
            if (r0 != 0) goto L10
            boolean r0 = r1.mIsAttached
            if (r0 == 0) goto L10
            java.lang.Runnable r0 = r1.mItemAnimatorRunner
            Yue.C6794.m26211(r1, r0)
            r0 = 1
            r1.mPostedAnimatorRunner = r0
        L10:
            return
    }

    public void processDataSetCompletelyChanged(boolean r2) {
            r1 = this;
            boolean r0 = r1.mDispatchItemsChangedEvent
            r2 = r2 | r0
            r1.mDispatchItemsChangedEvent = r2
            r2 = 1
            r1.mDataSetHasChangedAfterLayout = r2
            r1.markKnownViewsInvalid()
            return
    }

    public void recordAnimationInfoIfBouncedHiddenView(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r4, androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r5) {
            r3 = this;
            r0 = 0
            r1 = 8192(0x2000, float:1.148E-41)
            r4.setFlags(r0, r1)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r3.mState
            boolean r0 = r0.f29657
            if (r0 == 0) goto L27
            boolean r0 = r4.isUpdated()
            if (r0 == 0) goto L27
            boolean r0 = r4.isRemoved()
            if (r0 != 0) goto L27
            boolean r0 = r4.shouldIgnore()
            if (r0 != 0) goto L27
            long r0 = r3.getChangedHolderKey(r4)
            androidx.recyclerview.widget.ۥ۟۟ۡ r2 = r3.mViewInfoStore
            r2.m30337(r0, r4)
        L27:
            androidx.recyclerview.widget.ۥ۟۟ۡ r0 = r3.mViewInfoStore
            r0.m30339(r4, r5)
            return
    }

    public void removeAndRecycleViews() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r0 = r2.mItemAnimator
            if (r0 == 0) goto L7
            r0.mo29737()
        L7:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            if (r0 == 0) goto L17
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r1 = r2.mRecycler
            r0.removeAndRecycleAllViews(r1)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r1 = r2.mRecycler
            r0.removeAndRecycleScrapInt(r1)
        L17:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r0 = r2.mRecycler
            r0.m29799()
            return
    }

    public boolean removeAnimatingView(android.view.View r3) {
            r2 = this;
            r2.startInterceptRequestLayout()
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r2.mChildHelper
            boolean r0 = r0.m30059(r3)
            if (r0 == 0) goto L19
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = getChildViewHolderInt(r3)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r1 = r2.mRecycler
            r1.m29832(r3)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r1 = r2.mRecycler
            r1.m29825(r3)
        L19:
            r3 = r0 ^ 1
            r2.stopInterceptRequestLayout(r3)
            return r0
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(android.view.View r3, boolean r4) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = getChildViewHolderInt(r3)
            if (r0 == 0) goto L35
            boolean r1 = r0.isTmpDetached()
            if (r1 == 0) goto L10
            r0.clearTmpDetachFlag()
            goto L35
        L10:
            boolean r1 = r0.shouldIgnore()
            if (r1 == 0) goto L17
            goto L35
        L17:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Called removeDetachedView with a view which is not flagged as tmp detached."
            r4.append(r1)
            r4.append(r0)
            java.lang.String r0 = r2.exceptionLabel()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L35:
            r3.clearAnimation()
            r2.dispatchChildDetached(r3)
            super.removeDetachedView(r3, r4)
            return
    }

    public void removeItemDecoration(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7690 r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            if (r0 == 0) goto L9
            java.lang.String r1 = "Cannot remove item decoration during a scroll  or layout"
            r0.assertNotInLayoutOrScroll(r1)
        L9:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ> r0 = r2.mItemDecorations
            r0.remove(r3)
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ> r3 = r2.mItemDecorations
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L23
            int r3 = r2.getOverScrollMode()
            r0 = 2
            if (r3 != r0) goto L1f
            r3 = 1
            goto L20
        L1f:
            r3 = 0
        L20:
            r2.setWillNotDraw(r3)
        L23:
            r2.markItemDecorInsetsDirty()
            r2.requestLayout()
            return
    }

    public void removeItemDecorationAt(int r4) {
            r3 = this;
            int r0 = r3.getItemDecorationCount()
            if (r4 < 0) goto L10
            if (r4 >= r0) goto L10
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ r4 = r3.getItemDecorationAt(r4)
            r3.removeItemDecoration(r4)
            return
        L10:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = " is an invalid index for size "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
    }

    public void removeOnChildAttachStateChangeListener(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.InterfaceC7697 r2) {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۠> r0 = r1.mOnChildAttachStateListeners
            if (r0 != 0) goto L5
            return
        L5:
            r0.remove(r2)
            return
    }

    public void removeOnItemTouchListener(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.InterfaceC7699 r2) {
            r1 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۢ> r0 = r1.mOnItemTouchListeners
            r0.remove(r2)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۢ r0 = r1.mInterceptingOnItemTouchListener
            if (r0 != r2) goto Lc
            r2 = 0
            r1.mInterceptingOnItemTouchListener = r2
        Lc:
            return
    }

    public void removeOnScrollListener(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7700 r2) {
            r1 = this;
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۠> r0 = r1.mScrollListeners
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return
    }

    public void repositionShadowingViews() {
            r7 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r7.mChildHelper
            int r0 = r0.m30048()
            r1 = 0
        L7:
            if (r1 >= r0) goto L3f
            androidx.recyclerview.widget.ۥ۟۟۟۟ r2 = r7.mChildHelper
            android.view.View r2 = r2.m30047(r1)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = r7.getChildViewHolder(r2)
            if (r3 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = r3.mShadowingHolder
            if (r3 == 0) goto L3c
            android.view.View r3 = r3.itemView
            int r4 = r2.getLeft()
            int r2 = r2.getTop()
            int r5 = r3.getLeft()
            if (r4 != r5) goto L2f
            int r5 = r3.getTop()
            if (r2 == r5) goto L3c
        L2f:
            int r5 = r3.getWidth()
            int r5 = r5 + r4
            int r6 = r3.getHeight()
            int r6 = r6 + r2
            r3.layout(r4, r2, r5, r6)
        L3c:
            int r1 = r1 + 1
            goto L7
        L3f:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View r3, android.view.View r4) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r1 = r2.mState
            boolean r0 = r0.onRequestChildFocus(r2, r1, r3, r4)
            if (r0 != 0) goto Lf
            if (r4 == 0) goto Lf
            r2.m29687(r3, r4)
        Lf:
            super.requestChildFocus(r3, r4)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View r2, android.graphics.Rect r3, boolean r4) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.mLayout
            boolean r2 = r0.requestChildRectangleOnScreen(r1, r2, r3, r4)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r4) {
            r3 = this;
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۢ> r0 = r3.mOnItemTouchListeners
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L17
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۢ> r2 = r3.mOnItemTouchListeners
            java.lang.Object r2 = r2.get(r1)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۢ r2 = (androidx.recyclerview.widget.RecyclerView.InterfaceC7699) r2
            r2.mo29780(r4)
            int r1 = r1 + 1
            goto L7
        L17:
            super.requestDisallowInterceptTouchEvent(r4)
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
            r1 = this;
            int r0 = r1.mInterceptRequestLayoutDepth
            if (r0 != 0) goto Lc
            boolean r0 = r1.mLayoutSuppressed
            if (r0 != 0) goto Lc
            super.requestLayout()
            goto Lf
        Lc:
            r0 = 1
            r1.mLayoutWasDefered = r0
        Lf:
            return
    }

    public void saveOldPositions() {
            r4 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r4.mChildHelper
            int r0 = r0.m30051()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1f
            androidx.recyclerview.widget.ۥ۟۟۟۟ r2 = r4.mChildHelper
            android.view.View r2 = r2.m30050(r1)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = getChildViewHolderInt(r2)
            boolean r3 = r2.shouldIgnore()
            if (r3 != 0) goto L1c
            r2.saveOldPosition()
        L1c:
            int r1 = r1 + 1
            goto L7
        L1f:
            return
    }

    @Override // android.view.View
    public void scrollBy(int r4, int r5) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r3.mLayout
            if (r0 != 0) goto Lc
            java.lang.String r4 = "RecyclerView"
            java.lang.String r5 = "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r4, r5)
            return
        Lc:
            boolean r1 = r3.mLayoutSuppressed
            if (r1 == 0) goto L11
            return
        L11:
            boolean r0 = r0.canScrollHorizontally()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r3.mLayout
            boolean r1 = r1.canScrollVertically()
            if (r0 != 0) goto L1f
            if (r1 == 0) goto L2c
        L1f:
            r2 = 0
            if (r0 == 0) goto L23
            goto L24
        L23:
            r4 = r2
        L24:
            if (r1 == 0) goto L27
            goto L28
        L27:
            r5 = r2
        L28:
            r0 = 0
            r3.scrollByInternal(r4, r5, r0)
        L2c:
            return
    }

    public boolean scrollByInternal(int r19, int r20, android.view.MotionEvent r21) {
            r18 = this;
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r18.consumePendingUpdateOperations()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r8.mAdapter
            r12 = 1
            r13 = 0
            if (r0 == 0) goto L2b
            int[] r0 = r8.mReusableIntPair
            r0[r13] = r13
            r0[r12] = r13
            r8.scrollStep(r9, r10, r0)
            int[] r0 = r8.mReusableIntPair
            r1 = r0[r13]
            r0 = r0[r12]
            int r2 = r9 - r1
            int r3 = r10 - r0
            r14 = r0
            r15 = r1
            r16 = r2
            r17 = r3
            goto L31
        L2b:
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
        L31:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ> r0 = r8.mItemDecorations
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3c
            r18.invalidate()
        L3c:
            int[] r7 = r8.mReusableIntPair
            r7[r13] = r13
            r7[r12] = r13
            int[] r5 = r8.mScrollOffset
            r6 = 0
            r0 = r18
            r1 = r15
            r2 = r14
            r3 = r16
            r4 = r17
            r0.dispatchNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r8.mReusableIntPair
            r1 = r0[r13]
            int r2 = r16 - r1
            r0 = r0[r12]
            int r3 = r17 - r0
            if (r1 != 0) goto L61
            if (r0 == 0) goto L5f
            goto L61
        L5f:
            r0 = r13
            goto L62
        L61:
            r0 = r12
        L62:
            int r1 = r8.mLastTouchX
            int[] r4 = r8.mScrollOffset
            r5 = r4[r13]
            int r1 = r1 - r5
            r8.mLastTouchX = r1
            int r1 = r8.mLastTouchY
            r4 = r4[r12]
            int r1 = r1 - r4
            r8.mLastTouchY = r1
            int[] r1 = r8.mNestedOffsets
            r6 = r1[r13]
            int r6 = r6 + r5
            r1[r13] = r6
            r5 = r1[r12]
            int r5 = r5 + r4
            r1[r12] = r5
            int r1 = r18.getOverScrollMode()
            r4 = 2
            if (r1 == r4) goto L9f
            if (r11 == 0) goto L9c
            r1 = 8194(0x2002, float:1.1482E-41)
            boolean r1 = Yue.C4270.m16629(r11, r1)
            if (r1 != 0) goto L9c
            float r1 = r21.getX()
            float r2 = (float) r2
            float r4 = r21.getY()
            float r3 = (float) r3
            r8.m29684(r1, r2, r4, r3)
        L9c:
            r18.considerReleasingGlowsOnScroll(r19, r20)
        L9f:
            if (r15 != 0) goto La3
            if (r14 == 0) goto La6
        La3:
            r8.dispatchOnScrolled(r15, r14)
        La6:
            boolean r1 = r18.awakenScrollBars()
            if (r1 != 0) goto Laf
            r18.invalidate()
        Laf:
            if (r0 != 0) goto Lb7
            if (r15 != 0) goto Lb7
            if (r14 == 0) goto Lb6
            goto Lb7
        Lb6:
            r12 = r13
        Lb7:
            return r12
    }

    public void scrollStep(int r5, int r6, @Yue.InterfaceC4544 int[] r7) {
            r4 = this;
            r4.startInterceptRequestLayout()
            r4.onEnterLayoutOrScroll()
            java.lang.String r0 = "RV Scroll"
            Yue.C6388.m23593(r0)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r4.mState
            r4.fillRemainingScrollValues(r0)
            r0 = 0
            if (r5 == 0) goto L1e
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r4.mLayout
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r2 = r4.mRecycler
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r3 = r4.mState
            int r5 = r1.scrollHorizontallyBy(r5, r2, r3)
            goto L1f
        L1e:
            r5 = r0
        L1f:
            if (r6 == 0) goto L2c
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r1 = r4.mLayout
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r2 = r4.mRecycler
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r3 = r4.mState
            int r6 = r1.scrollVerticallyBy(r6, r2, r3)
            goto L2d
        L2c:
            r6 = r0
        L2d:
            Yue.C6388.m23595()
            r4.repositionShadowingViews()
            r4.onExitLayoutOrScroll()
            r4.stopInterceptRequestLayout(r0)
            if (r7 == 0) goto L40
            r7[r0] = r5
            r5 = 1
            r7[r5] = r6
        L40:
            return
    }

    @Override // android.view.View
    public void scrollTo(int r1, int r2) {
            r0 = this;
            java.lang.String r1 = "RecyclerView"
            java.lang.String r2 = "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead"
            android.util.Log.w(r1, r2)
            return
    }

    public void scrollToPosition(int r2) {
            r1 = this;
            boolean r0 = r1.mLayoutSuppressed
            if (r0 == 0) goto L5
            return
        L5:
            r1.stopScroll()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.mLayout
            if (r0 != 0) goto L14
            java.lang.String r2 = "RecyclerView"
            java.lang.String r0 = "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r2, r0)
            return
        L14:
            r0.scrollToPosition(r2)
            r1.awakenScrollBars()
            return
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            boolean r0 = r1.shouldDeferAccessibilityEvent(r2)
            if (r0 == 0) goto L7
            return
        L7:
            super.sendAccessibilityEventUnchecked(r2)
            return
    }

    public void setAccessibilityDelegateCompat(@Yue.InterfaceC4544 androidx.recyclerview.widget.C7796 r1) {
            r0 = this;
            r0.mAccessibilityDelegate = r1
            Yue.C6794.m26223(r0, r1)
            return
    }

    public void setAdapter(@Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7678 r3) {
            r2 = this;
            r0 = 0
            r2.setLayoutFrozen(r0)
            r1 = 1
            r2.m29691(r3, r0, r1)
            r2.processDataSetCompletelyChanged(r0)
            r2.requestLayout()
            return
    }

    public void setChildDrawingOrderCallback(@Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.InterfaceC7681 r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۤ r0 = r1.mChildDrawingOrderCallback
            if (r2 != r0) goto L5
            return
        L5:
            r1.mChildDrawingOrderCallback = r2
            if (r2 == 0) goto Lb
            r2 = 1
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setChildrenDrawingOrderEnabled(r2)
            return
    }

    @Yue.InterfaceC6959
    public boolean setChildImportantForAccessibilityInternal(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r2, int r3) {
            r1 = this;
            boolean r0 = r1.isComputingLayout()
            if (r0 == 0) goto Lf
            r2.mPendingAccessibilityState = r3
            java.util.List<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r3 = r1.mPendingAccessibilityImportanceChange
            r3.add(r2)
            r2 = 0
            return r2
        Lf:
            android.view.View r2 = r2.itemView
            Yue.C6794.m26241(r2, r3)
            r2 = 1
            return r2
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean r2) {
            r1 = this;
            boolean r0 = r1.mClipToPadding
            if (r2 == r0) goto L7
            r1.invalidateGlows()
        L7:
            r1.mClipToPadding = r2
            super.setClipToPadding(r2)
            boolean r2 = r1.mFirstLayoutComplete
            if (r2 == 0) goto L13
            r1.requestLayout()
        L13:
            return
    }

    public void setEdgeEffectFactory(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7682 r1) {
            r0 = this;
            Yue.C4868.m19181(r1)
            r0.mEdgeEffectFactory = r1
            r0.invalidateGlows()
            return
    }

    public void setHasFixedSize(boolean r1) {
            r0 = this;
            r0.mHasFixedSize = r1
            return
    }

    public void setItemAnimator(@Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7684 r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r0 = r2.mItemAnimator
            if (r0 == 0) goto Ld
            r0.mo29737()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r0 = r2.mItemAnimator
            r1 = 0
            r0.m29752(r1)
        Ld:
            r2.mItemAnimator = r3
            if (r3 == 0) goto L16
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟ r0 = r2.mItemAnimatorListener
            r3.m29752(r0)
        L16:
            return
    }

    public void setItemViewCacheSize(int r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r0 = r1.mRecycler
            r0.m29829(r2)
            return
    }

    @java.lang.Deprecated
    public void setLayoutFrozen(boolean r1) {
            r0 = this;
            r0.suppressLayout(r1)
            return
    }

    public void setLayoutManager(@Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7691 r4) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r3.mLayout
            if (r4 != r0) goto L5
            return
        L5:
            r3.stopScroll()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r3.mLayout
            if (r0 == 0) goto L3a
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r0 = r3.mItemAnimator
            if (r0 == 0) goto L13
            r0.mo29737()
        L13:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r3.mLayout
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r1 = r3.mRecycler
            r0.removeAndRecycleAllViews(r1)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r3.mLayout
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r1 = r3.mRecycler
            r0.removeAndRecycleScrapInt(r1)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r0 = r3.mRecycler
            r0.m29799()
            boolean r0 = r3.mIsAttached
            if (r0 == 0) goto L31
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r3.mLayout
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r1 = r3.mRecycler
            r0.dispatchDetachedFromWindow(r3, r1)
        L31:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r3.mLayout
            r1 = 0
            r0.setRecyclerView(r1)
            r3.mLayout = r1
            goto L3f
        L3a:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r0 = r3.mRecycler
            r0.m29799()
        L3f:
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r3.mChildHelper
            r0.m30056()
            r3.mLayout = r4
            if (r4 == 0) goto L7e
            androidx.recyclerview.widget.RecyclerView r0 = r4.mRecyclerView
            if (r0 != 0) goto L59
            r4.setRecyclerView(r3)
            boolean r4 = r3.mIsAttached
            if (r4 == 0) goto L7e
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r4 = r3.mLayout
            r4.dispatchAttachedToWindow(r3)
            goto L7e
        L59:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "LayoutManager "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " is already attached to a RecyclerView:"
            r1.append(r2)
            androidx.recyclerview.widget.RecyclerView r4 = r4.mRecyclerView
            java.lang.String r4 = r4.exceptionLabel()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L7e:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r4 = r3.mRecycler
            r4.m29833()
            r3.requestLayout()
            return
    }

    @Override // android.view.ViewGroup
    @java.lang.Deprecated
    public void setLayoutTransition(android.animation.LayoutTransition r2) {
            r1 = this;
            if (r2 != 0) goto L7
            r2 = 0
            super.setLayoutTransition(r2)
            return
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.View, Yue.InterfaceC4382
    public void setNestedScrollingEnabled(boolean r2) {
            r1 = this;
            Yue.ۥۡۢۢ۠ r0 = r1.getScrollingChildHelper()
            r0.m17246(r2)
            return
    }

    public void setOnFlingListener(@Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7698 r1) {
            r0 = this;
            r0.mOnFlingListener = r1
            return
    }

    @java.lang.Deprecated
    public void setOnScrollListener(@Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7700 r1) {
            r0 = this;
            r0.mScrollListener = r1
            return
    }

    public void setPreserveFocusAfterLayout(boolean r1) {
            r0 = this;
            r0.mPreserveFocusAfterLayout = r1
            return
    }

    public void setRecycledViewPool(@Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.C7702 r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r0 = r1.mRecycler
            r0.m29827(r2)
            return
    }

    public void setRecyclerListener(@Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.InterfaceC7705 r1) {
            r0 = this;
            r0.mRecyclerListener = r1
            return
    }

    public void setScrollState(int r2) {
            r1 = this;
            int r0 = r1.mScrollState
            if (r2 != r0) goto L5
            return
        L5:
            r1.mScrollState = r2
            r0 = 2
            if (r2 == r0) goto Ld
            r1.m29692()
        Ld:
            r1.dispatchOnScrollStateChanged(r2)
            return
    }

    public void setScrollingTouchSlop(int r4) {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            if (r4 == 0) goto L30
            r1 = 1
            if (r4 == r1) goto L29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setScrollingTouchSlop(): bad argument constant "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "; using default value"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.w(r1, r4)
            goto L30
        L29:
            int r4 = r0.getScaledPagingTouchSlop()
            r3.mTouchSlop = r4
            goto L36
        L30:
            int r4 = r0.getScaledTouchSlop()
            r3.mTouchSlop = r4
        L36:
            return
    }

    public void setViewCacheExtension(@Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7714 r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r0 = r1.mRecycler
            r0.m29828(r2)
            return
    }

    public boolean shouldDeferAccessibilityEvent(android.view.accessibility.AccessibilityEvent r3) {
            r2 = this;
            boolean r0 = r2.isComputingLayout()
            r1 = 0
            if (r0 == 0) goto L1a
            if (r3 == 0) goto Le
            int r3 = Yue.C0106.m574(r3)
            goto Lf
        Le:
            r3 = r1
        Lf:
            if (r3 != 0) goto L12
            goto L13
        L12:
            r1 = r3
        L13:
            int r3 = r2.mEatenAccessibilityChangeFlags
            r3 = r3 | r1
            r2.mEatenAccessibilityChangeFlags = r3
            r3 = 1
            return r3
        L1a:
            return r1
    }

    public void smoothScrollBy(@Yue.InterfaceC4992 int r2, @Yue.InterfaceC4992 int r3) {
            r1 = this;
            r0 = 0
            r1.smoothScrollBy(r2, r3, r0)
            return
    }

    public void smoothScrollBy(@Yue.InterfaceC4992 int r2, @Yue.InterfaceC4992 int r3, @Yue.InterfaceC4544 android.view.animation.Interpolator r4) {
            r1 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.smoothScrollBy(r2, r3, r4, r0)
            return
    }

    public void smoothScrollBy(@Yue.InterfaceC4992 int r7, @Yue.InterfaceC4992 int r8, @Yue.InterfaceC4544 android.view.animation.Interpolator r9, int r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.smoothScrollBy(r1, r2, r3, r4, r5)
            return
    }

    public void smoothScrollBy(@Yue.InterfaceC4992 int r3, @Yue.InterfaceC4992 int r4, @Yue.InterfaceC4544 android.view.animation.Interpolator r5, int r6, boolean r7) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            if (r0 != 0) goto Lc
            java.lang.String r3 = "RecyclerView"
            java.lang.String r4 = "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r3, r4)
            return
        Lc:
            boolean r1 = r2.mLayoutSuppressed
            if (r1 == 0) goto L11
            return
        L11:
            boolean r0 = r0.canScrollHorizontally()
            r1 = 0
            if (r0 != 0) goto L19
            r3 = r1
        L19:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 != 0) goto L22
            r4 = r1
        L22:
            if (r3 != 0) goto L26
            if (r4 == 0) goto L43
        L26:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r0) goto L31
            if (r6 <= 0) goto L2d
            goto L31
        L2d:
            r2.scrollBy(r3, r4)
            goto L43
        L31:
            if (r7 == 0) goto L3e
            r7 = 1
            if (r3 == 0) goto L37
            r1 = r7
        L37:
            if (r4 == 0) goto L3b
            r1 = r1 | 2
        L3b:
            r2.startNestedScroll(r1, r7)
        L3e:
            androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟ۡ r7 = r2.mViewFlinger
            r7.m29876(r3, r4, r6, r5)
        L43:
            return
    }

    public void smoothScrollToPosition(int r3) {
            r2 = this;
            boolean r0 = r2.mLayoutSuppressed
            if (r0 == 0) goto L5
            return
        L5:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r2.mLayout
            if (r0 != 0) goto L11
            java.lang.String r3 = "RecyclerView"
            java.lang.String r0 = "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r3, r0)
            return
        L11:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r1 = r2.mState
            r0.smoothScrollToPosition(r2, r1, r3)
            return
    }

    public void startInterceptRequestLayout() {
            r2 = this;
            int r0 = r2.mInterceptRequestLayoutDepth
            r1 = 1
            int r0 = r0 + r1
            r2.mInterceptRequestLayoutDepth = r0
            if (r0 != r1) goto Lf
            boolean r0 = r2.mLayoutSuppressed
            if (r0 != 0) goto Lf
            r0 = 0
            r2.mLayoutWasDefered = r0
        Lf:
            return
    }

    @Override // android.view.View, Yue.InterfaceC4382
    public boolean startNestedScroll(int r2) {
            r1 = this;
            Yue.ۥۡۢۢ۠ r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.m17248(r2)
            return r2
    }

    @Override // Yue.InterfaceC4380
    public boolean startNestedScroll(int r2, int r3) {
            r1 = this;
            Yue.ۥۡۢۢ۠ r0 = r1.getScrollingChildHelper()
            boolean r2 = r0.m17249(r2, r3)
            return r2
    }

    public void stopInterceptRequestLayout(boolean r4) {
            r3 = this;
            int r0 = r3.mInterceptRequestLayoutDepth
            r1 = 1
            if (r0 >= r1) goto L7
            r3.mInterceptRequestLayoutDepth = r1
        L7:
            r0 = 0
            if (r4 != 0) goto L10
            boolean r2 = r3.mLayoutSuppressed
            if (r2 != 0) goto L10
            r3.mLayoutWasDefered = r0
        L10:
            int r2 = r3.mInterceptRequestLayoutDepth
            if (r2 != r1) goto L2f
            if (r4 == 0) goto L29
            boolean r4 = r3.mLayoutWasDefered
            if (r4 == 0) goto L29
            boolean r4 = r3.mLayoutSuppressed
            if (r4 != 0) goto L29
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r4 = r3.mLayout
            if (r4 == 0) goto L29
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r4 = r3.mAdapter
            if (r4 == 0) goto L29
            r3.dispatchLayout()
        L29:
            boolean r4 = r3.mLayoutSuppressed
            if (r4 != 0) goto L2f
            r3.mLayoutWasDefered = r0
        L2f:
            int r4 = r3.mInterceptRequestLayoutDepth
            int r4 = r4 - r1
            r3.mInterceptRequestLayoutDepth = r4
            return
    }

    @Override // android.view.View, Yue.InterfaceC4382
    public void stopNestedScroll() {
            r1 = this;
            Yue.ۥۡۢۢ۠ r0 = r1.getScrollingChildHelper()
            r0.m17250()
            return
    }

    @Override // Yue.InterfaceC4380
    public void stopNestedScroll(int r2) {
            r1 = this;
            Yue.ۥۡۢۢ۠ r0 = r1.getScrollingChildHelper()
            r0.m17251(r2)
            return
    }

    public void stopScroll() {
            r1 = this;
            r0 = 0
            r1.setScrollState(r0)
            r1.m29692()
            return
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean r10) {
            r9 = this;
            boolean r0 = r9.mLayoutSuppressed
            if (r10 == r0) goto L38
            java.lang.String r0 = "Do not suppressLayout in layout or scroll"
            r9.assertNotInLayoutOrScroll(r0)
            if (r10 != 0) goto L20
            r10 = 0
            r9.mLayoutSuppressed = r10
            boolean r0 = r9.mLayoutWasDefered
            if (r0 == 0) goto L1d
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r9.mLayout
            if (r0 == 0) goto L1d
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r9.mAdapter
            if (r0 == 0) goto L1d
            r9.requestLayout()
        L1d:
            r9.mLayoutWasDefered = r10
            goto L38
        L20:
            long r3 = android.os.SystemClock.uptimeMillis()
            r7 = 0
            r8 = 0
            r5 = 3
            r6 = 0
            r1 = r3
            android.view.MotionEvent r10 = android.view.MotionEvent.obtain(r1, r3, r5, r6, r7, r8)
            r9.onTouchEvent(r10)
            r10 = 1
            r9.mLayoutSuppressed = r10
            r9.mIgnoreMotionEventTillDown = r10
            r9.stopScroll()
        L38:
            return
    }

    public void swapAdapter(@Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7678 r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.setLayoutFrozen(r0)
            r0 = 1
            r1.m29691(r2, r0, r3)
            r1.processDataSetCompletelyChanged(r0)
            r1.requestLayout()
            return
    }

    public void viewRangeUpdate(int r7, int r8, java.lang.Object r9) {
            r6 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r6.mChildHelper
            int r0 = r0.m30051()
            int r1 = r7 + r8
            r2 = 0
        L9:
            if (r2 >= r0) goto L37
            androidx.recyclerview.widget.ۥ۟۟۟۟ r3 = r6.mChildHelper
            android.view.View r3 = r3.m30050(r2)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r4 = getChildViewHolderInt(r3)
            if (r4 == 0) goto L34
            boolean r5 = r4.shouldIgnore()
            if (r5 == 0) goto L1e
            goto L34
        L1e:
            int r5 = r4.mPosition
            if (r5 < r7) goto L34
            if (r5 >= r1) goto L34
            r5 = 2
            r4.addFlags(r5)
            r4.addChangePayload(r9)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r3 = (androidx.recyclerview.widget.RecyclerView.C7696) r3
            r4 = 1
            r3.f29617 = r4
        L34:
            int r2 = r2 + 1
            goto L9
        L37:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r9 = r6.mRecycler
            r9.m29835(r7, r8)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m29661(androidx.recyclerview.widget.RecyclerView.AbstractC7716 r6) {
            r5 = this;
            android.view.View r0 = r6.itemView
            android.view.ViewParent r1 = r0.getParent()
            r2 = 1
            if (r1 != r5) goto Lb
            r1 = r2
            goto Lc
        Lb:
            r1 = 0
        Lc:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r3 = r5.mRecycler
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r4 = r5.getChildViewHolder(r0)
            r3.m29832(r4)
            boolean r6 = r6.isTmpDetached()
            if (r6 == 0) goto L26
            androidx.recyclerview.widget.ۥ۟۟۟۟ r6 = r5.mChildHelper
            r1 = -1
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            r6.m30044(r0, r1, r3, r2)
            goto L33
        L26:
            if (r1 != 0) goto L2e
            androidx.recyclerview.widget.ۥ۟۟۟۟ r6 = r5.mChildHelper
            r6.m30043(r0, r2)
            goto L33
        L2e:
            androidx.recyclerview.widget.ۥ۟۟۟۟ r6 = r5.mChildHelper
            r6.m30052(r0)
        L33:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m29662(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r2, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7716 r3, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r4, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7684.C7688 r5, boolean r6, boolean r7) {
            r1 = this;
            r0 = 0
            r2.setIsRecyclable(r0)
            if (r6 == 0) goto L9
            r1.m29661(r2)
        L9:
            if (r2 == r3) goto L1f
            if (r7 == 0) goto L10
            r1.m29661(r3)
        L10:
            r2.mShadowedHolder = r3
            r1.m29661(r2)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r6 = r1.mRecycler
            r6.m29832(r2)
            r3.setIsRecyclable(r0)
            r3.mShadowingHolder = r2
        L1f:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r6 = r1.mItemAnimator
            boolean r2 = r6.mo29728(r2, r3, r4, r5)
            if (r2 == 0) goto L2a
            r1.postAnimationRunner()
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m29663() {
            r1 = this;
            r1.m29689()
            r0 = 0
            r1.setScrollState(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m29664(android.content.Context r7, java.lang.String r8, android.util.AttributeSet r9, int r10, int r11) {
            r6 = this;
            java.lang.String r0 = ": Could not instantiate the LayoutManager: "
            if (r8 == 0) goto L123
            java.lang.String r8 = r8.trim()
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L123
            java.lang.String r8 = r6.m29675(r7, r8)
            boolean r1 = r6.isInEditMode()     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            if (r1 == 0) goto L2f
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            goto L33
        L21:
            r7 = move-exception
            goto L91
        L23:
            r7 = move-exception
            goto Laf
        L26:
            r7 = move-exception
            goto Lcd
        L29:
            r7 = move-exception
            goto Le9
        L2c:
            r7 = move-exception
            goto L105
        L2f:
            java.lang.ClassLoader r1 = r7.getClassLoader()     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
        L33:
            r2 = 0
            java.lang.Class r1 = java.lang.Class.forName(r8, r2, r1)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            java.lang.Class<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠> r3 = androidx.recyclerview.widget.RecyclerView.AbstractC7691.class
            java.lang.Class r1 = r1.asSubclass(r3)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            r3 = 1
            java.lang.Class<?>[] r4 = androidx.recyclerview.widget.RecyclerView.LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L5b
            java.lang.reflect.Constructor r4 = r1.getConstructor(r4)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L5b
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L5b
            r5[r2] = r7     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L5b
            r5[r3] = r9     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L5b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L5b
            r10 = 2
            r5[r10] = r7     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L5b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L5b
            r10 = 3
            r5[r10] = r7     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L5b
            goto L61
        L5b:
            r7 = move-exception
            r5 = 0
            java.lang.reflect.Constructor r4 = r1.getConstructor(r5)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c java.lang.NoSuchMethodException -> L6f
        L61:
            r4.setAccessible(r3)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            java.lang.Object r7 = r4.newInstance(r5)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r7 = (androidx.recyclerview.widget.RecyclerView.AbstractC7691) r7     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            r6.setLayoutManager(r7)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            goto L123
        L6f:
            r10 = move-exception
            r10.initCause(r7)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            r11.<init>()     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            java.lang.String r1 = r9.getPositionDescription()     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            r11.append(r1)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            java.lang.String r1 = ": Error creating LayoutManager "
            r11.append(r1)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            r11.append(r8)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            java.lang.String r11 = r11.toString()     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            r7.<init>(r11, r10)     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
            throw r7     // Catch: java.lang.ClassCastException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L26 java.lang.reflect.InvocationTargetException -> L29 java.lang.ClassNotFoundException -> L2c
        L91:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r11.append(r9)
            java.lang.String r9 = ": Class is not a LayoutManager "
            r11.append(r9)
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r7)
            throw r10
        Laf:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r11.append(r9)
            java.lang.String r9 = ": Cannot access non-public constructor "
            r11.append(r9)
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r7)
            throw r10
        Lcd:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r11.append(r9)
            r11.append(r0)
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r7)
            throw r10
        Le9:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r11.append(r9)
            r11.append(r0)
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r7)
            throw r10
        L105:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r11.append(r9)
            java.lang.String r9 = ": Unable to find LayoutManager "
            r11.append(r9)
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r7)
            throw r10
        L123:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m29665(int r5, int r6) {
            r4 = this;
            int[] r0 = r4.mMinMaxLayoutPositions
            r4.m29672(r0)
            int[] r0 = r4.mMinMaxLayoutPositions
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != r5) goto L11
            r5 = r0[r3]
            if (r5 == r6) goto L12
        L11:
            r1 = r3
        L12:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m29666() {
            r3 = this;
            int r0 = r3.mEatenAccessibilityChangeFlags
            r1 = 0
            r3.mEatenAccessibilityChangeFlags = r1
            if (r0 == 0) goto L1c
            boolean r1 = r3.isAccessibilityEnabled()
            if (r1 == 0) goto L1c
            android.view.accessibility.AccessibilityEvent r1 = android.view.accessibility.AccessibilityEvent.obtain()
            r2 = 2048(0x800, float:2.87E-42)
            r1.setEventType(r2)
            Yue.C0106.m581(r1, r0)
            r3.sendAccessibilityEventUnchecked(r1)
        L1c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m29667() {
            r8 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r8.mState
            r1 = 1
            r0.m29855(r1)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r8.mState
            r8.fillRemainingScrollValues(r0)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r8.mState
            r2 = 0
            r0.f29658 = r2
            r8.startInterceptRequestLayout()
            androidx.recyclerview.widget.ۥ۟۟ۡ r0 = r8.mViewInfoStore
            r0.m30340()
            r8.onEnterLayoutOrScroll()
            r8.m29683()
            r8.m29690()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r8.mState
            boolean r3 = r0.f29659
            if (r3 == 0) goto L2c
            boolean r3 = r8.mItemsChanged
            if (r3 == 0) goto L2c
            goto L2d
        L2c:
            r1 = r2
        L2d:
            r0.f29657 = r1
            r8.mItemsChanged = r2
            r8.mItemsAddedOrRemoved = r2
            boolean r1 = r0.f29660
            r0.f29656 = r1
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r1 = r8.mAdapter
            int r1 = r1.getItemCount()
            r0.f29654 = r1
            int[] r0 = r8.mMinMaxLayoutPositions
            r8.m29672(r0)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r8.mState
            boolean r0 = r0.f29659
            if (r0 == 0) goto Lb1
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r8.mChildHelper
            int r0 = r0.m30048()
            r1 = r2
        L51:
            if (r1 >= r0) goto Lb1
            androidx.recyclerview.widget.ۥ۟۟۟۟ r3 = r8.mChildHelper
            android.view.View r3 = r3.m30047(r1)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = getChildViewHolderInt(r3)
            boolean r4 = r3.shouldIgnore()
            if (r4 != 0) goto Lae
            boolean r4 = r3.isInvalid()
            if (r4 == 0) goto L72
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r4 = r8.mAdapter
            boolean r4 = r4.hasStableIds()
            if (r4 != 0) goto L72
            goto Lae
        L72:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r4 = r8.mItemAnimator
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r5 = r8.mState
            int r6 = androidx.recyclerview.widget.RecyclerView.AbstractC7684.m29726(r3)
            java.util.List r7 = r3.getUnmodifiedPayloads()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟ r4 = r4.m29748(r5, r3, r6, r7)
            androidx.recyclerview.widget.ۥ۟۟ۡ r5 = r8.mViewInfoStore
            r5.m30339(r3, r4)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r4 = r8.mState
            boolean r4 = r4.f29657
            if (r4 == 0) goto Lae
            boolean r4 = r3.isUpdated()
            if (r4 == 0) goto Lae
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto Lae
            boolean r4 = r3.shouldIgnore()
            if (r4 != 0) goto Lae
            boolean r4 = r3.isInvalid()
            if (r4 != 0) goto Lae
            long r4 = r8.getChangedHolderKey(r3)
            androidx.recyclerview.widget.ۥ۟۟ۡ r6 = r8.mViewInfoStore
            r6.m30337(r4, r3)
        Lae:
            int r1 = r1 + 1
            goto L51
        Lb1:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r8.mState
            boolean r0 = r0.f29660
            if (r0 == 0) goto L119
            r8.saveOldPositions()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r8.mState
            boolean r1 = r0.f29655
            r0.f29655 = r2
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r3 = r8.mLayout
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r4 = r8.mRecycler
            r3.onLayoutChildren(r4, r0)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r8.mState
            r0.f29655 = r1
            r0 = r2
        Lcc:
            androidx.recyclerview.widget.ۥ۟۟۟۟ r1 = r8.mChildHelper
            int r1 = r1.m30048()
            if (r0 >= r1) goto L115
            androidx.recyclerview.widget.ۥ۟۟۟۟ r1 = r8.mChildHelper
            android.view.View r1 = r1.m30047(r0)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r1 = getChildViewHolderInt(r1)
            boolean r3 = r1.shouldIgnore()
            if (r3 == 0) goto Le5
            goto L112
        Le5:
            androidx.recyclerview.widget.ۥ۟۟ۡ r3 = r8.mViewInfoStore
            boolean r3 = r3.m30343(r1)
            if (r3 != 0) goto L112
            int r3 = androidx.recyclerview.widget.RecyclerView.AbstractC7684.m29726(r1)
            r4 = 8192(0x2000, float:1.148E-41)
            boolean r4 = r1.hasAnyOfTheFlags(r4)
            if (r4 != 0) goto Lfb
            r3 = r3 | 4096(0x1000, float:5.74E-42)
        Lfb:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r5 = r8.mItemAnimator
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r6 = r8.mState
            java.util.List r7 = r1.getUnmodifiedPayloads()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟ r3 = r5.m29748(r6, r1, r3, r7)
            if (r4 == 0) goto L10d
            r8.recordAnimationInfoIfBouncedHiddenView(r1, r3)
            goto L112
        L10d:
            androidx.recyclerview.widget.ۥ۟۟ۡ r4 = r8.mViewInfoStore
            r4.m30335(r1, r3)
        L112:
            int r0 = r0 + 1
            goto Lcc
        L115:
            r8.clearOldPositions()
            goto L11c
        L119:
            r8.clearOldPositions()
        L11c:
            r8.onExitLayoutOrScroll()
            r8.stopInterceptRequestLayout(r2)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r8.mState
            r1 = 2
            r0.f29653 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m29668() {
            r4 = this;
            r4.startInterceptRequestLayout()
            r4.onEnterLayoutOrScroll()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r4.mState
            r1 = 6
            r0.m29855(r1)
            androidx.recyclerview.widget.ۥ r0 = r4.mAdapterHelper
            r0.m30005()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r4.mState
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r1 = r4.mAdapter
            int r1 = r1.getItemCount()
            r0.f29654 = r1
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r4.mState
            r1 = 0
            r0.f29652 = r1
            r0.f29656 = r1
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r2 = r4.mLayout
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r3 = r4.mRecycler
            r2.onLayoutChildren(r3, r0)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r4.mState
            r0.f29655 = r1
            r2 = 0
            r4.mPendingSavedState = r2
            boolean r2 = r0.f29659
            if (r2 == 0) goto L3a
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r2 = r4.mItemAnimator
            if (r2 == 0) goto L3a
            r2 = 1
            goto L3b
        L3a:
            r2 = r1
        L3b:
            r0.f29659 = r2
            r2 = 4
            r0.f29653 = r2
            r4.onExitLayoutOrScroll()
            r4.stopInterceptRequestLayout(r1)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m29669() {
            r11 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r11.mState
            r1 = 4
            r0.m29855(r1)
            r11.startInterceptRequestLayout()
            r11.onEnterLayoutOrScroll()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r11.mState
            r1 = 1
            r0.f29653 = r1
            boolean r0 = r0.f29659
            if (r0 == 0) goto L8d
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r11.mChildHelper
            int r0 = r0.m30048()
            int r0 = r0 - r1
        L1c:
            if (r0 < 0) goto L86
            androidx.recyclerview.widget.ۥ۟۟۟۟ r2 = r11.mChildHelper
            android.view.View r2 = r2.m30047(r0)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r5 = getChildViewHolderInt(r2)
            boolean r2 = r5.shouldIgnore()
            if (r2 == 0) goto L2f
            goto L83
        L2f:
            long r2 = r11.getChangedHolderKey(r5)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r4 = r11.mItemAnimator
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r6 = r11.mState
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟ r4 = r4.m29747(r6, r5)
            androidx.recyclerview.widget.ۥ۟۟ۡ r6 = r11.mViewInfoStore
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r6 = r6.m30341(r2)
            if (r6 == 0) goto L7e
            boolean r7 = r6.shouldIgnore()
            if (r7 != 0) goto L7e
            androidx.recyclerview.widget.ۥ۟۟ۡ r7 = r11.mViewInfoStore
            boolean r8 = r7.m30342(r6)
            androidx.recyclerview.widget.ۥ۟۟ۡ r7 = r11.mViewInfoStore
            boolean r9 = r7.m30342(r5)
            if (r8 == 0) goto L5f
            if (r6 != r5) goto L5f
            androidx.recyclerview.widget.ۥ۟۟ۡ r2 = r11.mViewInfoStore
            r2.m30338(r5, r4)
            goto L83
        L5f:
            androidx.recyclerview.widget.ۥ۟۟ۡ r7 = r11.mViewInfoStore
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟ r7 = r7.m30348(r6)
            androidx.recyclerview.widget.ۥ۟۟ۡ r10 = r11.mViewInfoStore
            r10.m30338(r5, r4)
            androidx.recyclerview.widget.ۥ۟۟ۡ r4 = r11.mViewInfoStore
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟ r10 = r4.m30347(r5)
            if (r7 != 0) goto L76
            r11.m29676(r2, r5, r6)
            goto L83
        L76:
            r3 = r11
            r4 = r6
            r6 = r7
            r7 = r10
            r3.m29662(r4, r5, r6, r7, r8, r9)
            goto L83
        L7e:
            androidx.recyclerview.widget.ۥ۟۟ۡ r2 = r11.mViewInfoStore
            r2.m30338(r5, r4)
        L83:
            int r0 = r0 + (-1)
            goto L1c
        L86:
            androidx.recyclerview.widget.ۥ۟۟ۡ r0 = r11.mViewInfoStore
            androidx.recyclerview.widget.ۥ۟۟ۡ$ۥ۟ r2 = r11.mViewInfoProcessCallback
            r0.m30349(r2)
        L8d:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r11.mLayout
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r2 = r11.mRecycler
            r0.removeAndRecycleScrapInt(r2)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r11.mState
            int r2 = r0.f29654
            r0.f29651 = r2
            r2 = 0
            r11.mDataSetHasChangedAfterLayout = r2
            r11.mDispatchItemsChangedEvent = r2
            r0.f29659 = r2
            r0.f29660 = r2
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r11.mLayout
            r0.mRequestedSimpleAnimations = r2
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r0 = r11.mRecycler
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ> r0 = r0.f29628
            if (r0 == 0) goto Lb0
            r0.clear()
        Lb0:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r11.mLayout
            boolean r3 = r0.mPrefetchMaxObservedInInitialPrefetch
            if (r3 == 0) goto Lbf
            r0.mPrefetchMaxCountObserved = r2
            r0.mPrefetchMaxObservedInInitialPrefetch = r2
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r0 = r11.mRecycler
            r0.m29833()
        Lbf:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r11.mLayout
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r3 = r11.mState
            r0.onLayoutCompleted(r3)
            r11.onExitLayoutOrScroll()
            r11.stopInterceptRequestLayout(r2)
            androidx.recyclerview.widget.ۥ۟۟ۡ r0 = r11.mViewInfoStore
            r0.m30340()
            int[] r0 = r11.mMinMaxLayoutPositions
            r3 = r0[r2]
            r0 = r0[r1]
            boolean r0 = r11.m29665(r3, r0)
            if (r0 == 0) goto Le0
            r11.dispatchOnScrolled(r2, r2)
        Le0:
            r11.m29685()
            r11.m29688()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m29670(android.view.MotionEvent r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۢ r0 = r2.mInterceptingOnItemTouchListener
            if (r0 != 0) goto L11
            int r0 = r3.getAction()
            if (r0 != 0) goto Lc
            r3 = 0
            return r3
        Lc:
            boolean r3 = r2.m29671(r3)
            return r3
        L11:
            r0.mo29778(r2, r3)
            int r3 = r3.getAction()
            r0 = 3
            r1 = 1
            if (r3 == r0) goto L1e
            if (r3 != r1) goto L21
        L1e:
            r3 = 0
            r2.mInterceptingOnItemTouchListener = r3
        L21:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final boolean m29671(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getAction()
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۢ> r1 = r6.mOnItemTouchListeners
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L26
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۢ> r4 = r6.mOnItemTouchListeners
            java.lang.Object r4 = r4.get(r3)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۢ r4 = (androidx.recyclerview.widget.RecyclerView.InterfaceC7699) r4
            boolean r5 = r4.mo29779(r6, r7)
            if (r5 == 0) goto L23
            r5 = 3
            if (r0 == r5) goto L23
            r6.mInterceptingOnItemTouchListener = r4
            r7 = 1
            return r7
        L23:
            int r3 = r3 + 1
            goto Lc
        L26:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m29672(int[] r9) {
            r8 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r8.mChildHelper
            int r0 = r0.m30048()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L10
            r0 = -1
            r9[r2] = r0
            r9[r1] = r0
            return
        L10:
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2
        L16:
            if (r5 >= r0) goto L36
            androidx.recyclerview.widget.ۥ۟۟۟۟ r6 = r8.mChildHelper
            android.view.View r6 = r6.m30047(r5)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r6 = getChildViewHolderInt(r6)
            boolean r7 = r6.shouldIgnore()
            if (r7 == 0) goto L29
            goto L33
        L29:
            int r6 = r6.getLayoutPosition()
            if (r6 >= r3) goto L30
            r3 = r6
        L30:
            if (r6 <= r4) goto L33
            r4 = r6
        L33:
            int r5 = r5 + 1
            goto L16
        L36:
            r9[r2] = r3
            r9[r1] = r4
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final android.view.View m29673() {
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r5.mState
            int r1 = r0.f29661
            r2 = -1
            if (r1 == r2) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            int r0 = r0.m29858()
            r2 = r1
        Le:
            if (r2 >= r0) goto L25
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = r5.findViewHolderForAdapterPosition(r2)
            if (r3 != 0) goto L17
            goto L25
        L17:
            android.view.View r4 = r3.itemView
            boolean r4 = r4.hasFocusable()
            if (r4 == 0) goto L22
            android.view.View r0 = r3.itemView
            return r0
        L22:
            int r2 = r2 + 1
            goto Le
        L25:
            int r0 = java.lang.Math.min(r0, r1)
            int r0 = r0 + (-1)
        L2b:
            r1 = 0
            if (r0 < 0) goto L43
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = r5.findViewHolderForAdapterPosition(r0)
            if (r2 != 0) goto L35
            return r1
        L35:
            android.view.View r1 = r2.itemView
            boolean r1 = r1.hasFocusable()
            if (r1 == 0) goto L40
            android.view.View r0 = r2.itemView
            return r0
        L40:
            int r0 = r0 + (-1)
            goto L2b
        L43:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final int m29674(android.view.View r4) {
            r3 = this;
            int r0 = r4.getId()
        L4:
            boolean r1 = r4.isFocused()
            if (r1 != 0) goto L26
            boolean r1 = r4 instanceof android.view.ViewGroup
            if (r1 == 0) goto L26
            boolean r1 = r4.hasFocus()
            if (r1 == 0) goto L26
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r4 = r4.getFocusedChild()
            int r1 = r4.getId()
            r2 = -1
            if (r1 == r2) goto L4
            int r0 = r4.getId()
            goto L4
        L26:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final java.lang.String m29675(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            r0 = 0
            char r0 = r4.charAt(r0)
            r1 = 46
            if (r0 != r1) goto L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r3.getPackageName()
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            return r3
        L1d:
            java.lang.String r3 = "."
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L26
            return r4
        L26:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.Class<androidx.recyclerview.widget.RecyclerView> r0 = androidx.recyclerview.widget.RecyclerView.class
            java.lang.Package r0 = r0.getPackage()
            java.lang.String r0 = r0.getName()
            r3.append(r0)
            r3.append(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m29676(long r6, androidx.recyclerview.widget.RecyclerView.AbstractC7716 r8, androidx.recyclerview.widget.RecyclerView.AbstractC7716 r9) {
            r5 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r5.mChildHelper
            int r0 = r0.m30048()
            r1 = 0
        L7:
            if (r1 >= r0) goto L75
            androidx.recyclerview.widget.ۥ۟۟۟۟ r2 = r5.mChildHelper
            android.view.View r2 = r2.m30047(r1)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r2 = getChildViewHolderInt(r2)
            if (r2 != r8) goto L16
            goto L72
        L16:
            long r3 = r5.getChangedHolderKey(r2)
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 != 0) goto L72
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r6 = r5.mAdapter
            java.lang.String r7 = " \n View Holder 2:"
            if (r6 == 0) goto L4e
            boolean r6 = r6.hasStableIds()
            if (r6 == 0) goto L4e
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r9.append(r0)
            r9.append(r2)
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = r5.exceptionLabel()
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r6.<init>(r7)
            throw r6
        L4e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r9.append(r0)
            r9.append(r2)
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = r5.exceptionLabel()
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r6.<init>(r7)
            throw r6
        L72:
            int r1 = r1 + 1
            goto L7
        L75:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r6.append(r7)
            r6.append(r9)
            java.lang.String r7 = " cannot be found but it is necessary for "
            r6.append(r7)
            r6.append(r8)
            java.lang.String r7 = r5.exceptionLabel()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "RecyclerView"
            android.util.Log.e(r7, r6)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final boolean m29677() {
            r5 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r5.mChildHelper
            int r0 = r0.m30048()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L28
            androidx.recyclerview.widget.ۥ۟۟۟۟ r3 = r5.mChildHelper
            android.view.View r3 = r3.m30047(r2)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L25
            boolean r4 = r3.shouldIgnore()
            if (r4 == 0) goto L1d
            goto L25
        L1d:
            boolean r3 = r3.isUpdated()
            if (r3 == 0) goto L25
            r0 = 1
            return r0
        L25:
            int r2 = r2 + 1
            goto L8
        L28:
            return r1
    }

    @android.annotation.SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m29678() {
            r1 = this;
            int r0 = Yue.C6794.m26136(r1)
            if (r0 != 0) goto Lb
            r0 = 8
            Yue.C6794.m26243(r1, r0)
        Lb:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m29679() {
            r2 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = new androidx.recyclerview.widget.ۥ۟۟۟۟
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟۟ r1 = new androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟۟
            r1.<init>(r2)
            r0.<init>(r1)
            r2.mChildHelper = r0
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m29680(android.view.View r10, android.view.View r11, int r12) {
            r9 = this;
            r0 = 0
            if (r11 == 0) goto Lde
            if (r11 != r9) goto L7
            goto Lde
        L7:
            android.view.View r1 = r9.findContainingItemView(r11)
            if (r1 != 0) goto Le
            return r0
        Le:
            r1 = 1
            if (r10 != 0) goto L12
            return r1
        L12:
            android.view.View r2 = r9.findContainingItemView(r10)
            if (r2 != 0) goto L19
            return r1
        L19:
            android.graphics.Rect r2 = r9.mTempRect
            int r3 = r10.getWidth()
            int r4 = r10.getHeight()
            r2.set(r0, r0, r3, r4)
            android.graphics.Rect r2 = r9.mTempRect2
            int r3 = r11.getWidth()
            int r4 = r11.getHeight()
            r2.set(r0, r0, r3, r4)
            android.graphics.Rect r2 = r9.mTempRect
            r9.offsetDescendantRectToMyCoords(r10, r2)
            android.graphics.Rect r10 = r9.mTempRect2
            r9.offsetDescendantRectToMyCoords(r11, r10)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r10 = r9.mLayout
            int r10 = r10.getLayoutDirection()
            r11 = -1
            if (r10 != r1) goto L48
            r10 = r11
            goto L49
        L48:
            r10 = r1
        L49:
            android.graphics.Rect r2 = r9.mTempRect
            int r3 = r2.left
            android.graphics.Rect r4 = r9.mTempRect2
            int r5 = r4.left
            if (r3 < r5) goto L57
            int r6 = r2.right
            if (r6 > r5) goto L5f
        L57:
            int r6 = r2.right
            int r7 = r4.right
            if (r6 >= r7) goto L5f
            r3 = r1
            goto L6c
        L5f:
            int r6 = r2.right
            int r7 = r4.right
            if (r6 > r7) goto L67
            if (r3 < r7) goto L6b
        L67:
            if (r3 <= r5) goto L6b
            r3 = r11
            goto L6c
        L6b:
            r3 = r0
        L6c:
            int r5 = r2.top
            int r6 = r4.top
            if (r5 < r6) goto L76
            int r7 = r2.bottom
            if (r7 > r6) goto L7e
        L76:
            int r7 = r2.bottom
            int r8 = r4.bottom
            if (r7 >= r8) goto L7e
            r11 = r1
            goto L8a
        L7e:
            int r2 = r2.bottom
            int r4 = r4.bottom
            if (r2 > r4) goto L86
            if (r5 < r4) goto L89
        L86:
            if (r5 <= r6) goto L89
            goto L8a
        L89:
            r11 = r0
        L8a:
            if (r12 == r1) goto Ld6
            r2 = 2
            if (r12 == r2) goto Lcd
            r10 = 17
            if (r12 == r10) goto Lc9
            r10 = 33
            if (r12 == r10) goto Lc5
            r10 = 66
            if (r12 == r10) goto Lc1
            r10 = 130(0x82, float:1.82E-43)
            if (r12 != r10) goto La3
            if (r11 <= 0) goto La2
            r0 = r1
        La2:
            return r0
        La3:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Invalid direction: "
            r11.append(r0)
            r11.append(r12)
            java.lang.String r12 = r9.exceptionLabel()
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        Lc1:
            if (r3 <= 0) goto Lc4
            r0 = r1
        Lc4:
            return r0
        Lc5:
            if (r11 >= 0) goto Lc8
            r0 = r1
        Lc8:
            return r0
        Lc9:
            if (r3 >= 0) goto Lcc
            r0 = r1
        Lcc:
            return r0
        Lcd:
            if (r11 > 0) goto Ld4
            if (r11 != 0) goto Ld5
            int r3 = r3 * r10
            if (r3 < 0) goto Ld5
        Ld4:
            r0 = r1
        Ld5:
            return r0
        Ld6:
            if (r11 < 0) goto Ldd
            if (r11 != 0) goto Lde
            int r3 = r3 * r10
            if (r3 > 0) goto Lde
        Ldd:
            r0 = r1
        Lde:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m29681(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionIndex()
            int r1 = r4.getPointerId(r0)
            int r2 = r3.mScrollPointerId
            if (r1 != r2) goto L2d
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            int r1 = r4.getPointerId(r0)
            r3.mScrollPointerId = r1
            float r1 = r4.getX(r0)
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r3.mLastTouchX = r1
            r3.mInitialTouchX = r1
            float r4 = r4.getY(r0)
            float r4 = r4 + r2
            int r4 = (int) r4
            r3.mLastTouchY = r4
            r3.mInitialTouchY = r4
        L2d:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean m29682() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r0 = r1.mItemAnimator
            if (r0 == 0) goto Le
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.mLayout
            boolean r0 = r0.supportsPredictiveItemAnimations()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m29683() {
            r6 = this;
            boolean r0 = r6.mDataSetHasChangedAfterLayout
            if (r0 == 0) goto L12
            androidx.recyclerview.widget.ۥ r0 = r6.mAdapterHelper
            r0.m30020()
            boolean r0 = r6.mDispatchItemsChangedEvent
            if (r0 == 0) goto L12
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r6.mLayout
            r0.onItemsChanged(r6)
        L12:
            boolean r0 = r6.m29682()
            if (r0 == 0) goto L1e
            androidx.recyclerview.widget.ۥ r0 = r6.mAdapterHelper
            r0.m30018()
            goto L23
        L1e:
            androidx.recyclerview.widget.ۥ r0 = r6.mAdapterHelper
            r0.m30005()
        L23:
            boolean r0 = r6.mItemsAddedOrRemoved
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L30
            boolean r0 = r6.mItemsChanged
            if (r0 == 0) goto L2e
            goto L30
        L2e:
            r0 = r2
            goto L31
        L30:
            r0 = r1
        L31:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r3 = r6.mState
            boolean r4 = r6.mFirstLayoutComplete
            if (r4 == 0) goto L53
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r4 = r6.mItemAnimator
            if (r4 == 0) goto L53
            boolean r4 = r6.mDataSetHasChangedAfterLayout
            if (r4 != 0) goto L47
            if (r0 != 0) goto L47
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r5 = r6.mLayout
            boolean r5 = r5.mRequestedSimpleAnimations
            if (r5 == 0) goto L53
        L47:
            if (r4 == 0) goto L51
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r4 = r6.mAdapter
            boolean r4 = r4.hasStableIds()
            if (r4 == 0) goto L53
        L51:
            r4 = r1
            goto L54
        L53:
            r4 = r2
        L54:
            r3.f29659 = r4
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r3 = r6.mState
            boolean r4 = r3.f29659
            if (r4 == 0) goto L69
            if (r0 == 0) goto L69
            boolean r0 = r6.mDataSetHasChangedAfterLayout
            if (r0 != 0) goto L69
            boolean r0 = r6.m29682()
            if (r0 == 0) goto L69
            goto L6a
        L69:
            r1 = r2
        L6a:
            r3.f29660 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final void m29684(float r7, float r8, float r9, float r10) {
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r1 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            Yue.C2083.m9733(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r1 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            Yue.C2083.m9733(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            Yue.C2083.m9733(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            Yue.C2083.m9733(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            Yue.C6794.m26209(r6)
        L7f:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m29685() {
            r6 = this;
            boolean r0 = r6.mPreserveFocusAfterLayout
            if (r0 == 0) goto Lb1
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r6.mAdapter
            if (r0 == 0) goto Lb1
            boolean r0 = r6.hasFocus()
            if (r0 == 0) goto Lb1
            int r0 = r6.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto Lb1
            int r0 = r6.getDescendantFocusability()
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L26
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L26
            goto Lb1
        L26:
            boolean r0 = r6.isFocused()
            if (r0 != 0) goto L55
            android.view.View r0 = r6.getFocusedChild()
            boolean r1 = androidx.recyclerview.widget.RecyclerView.IGNORE_DETACHED_FOCUSED_CHILD
            if (r1 == 0) goto L4c
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L40
            boolean r1 = r0.hasFocus()
            if (r1 != 0) goto L4c
        L40:
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r6.mChildHelper
            int r0 = r0.m30048()
            if (r0 != 0) goto L55
            r6.requestFocus()
            return
        L4c:
            androidx.recyclerview.widget.ۥ۟۟۟۟ r1 = r6.mChildHelper
            boolean r0 = r1.m30055(r0)
            if (r0 != 0) goto L55
            return
        L55:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r6.mState
            long r0 = r0.f29662
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L71
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r6.mAdapter
            boolean r0 = r0.hasStableIds()
            if (r0 == 0) goto L71
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r6.mState
            long r4 = r0.f29662
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r0 = r6.findViewHolderForItemId(r4)
            goto L72
        L71:
            r0 = r1
        L72:
            if (r0 == 0) goto L8a
            androidx.recyclerview.widget.ۥ۟۟۟۟ r4 = r6.mChildHelper
            android.view.View r5 = r0.itemView
            boolean r4 = r4.m30055(r5)
            if (r4 != 0) goto L8a
            android.view.View r4 = r0.itemView
            boolean r4 = r4.hasFocusable()
            if (r4 != 0) goto L87
            goto L8a
        L87:
            android.view.View r1 = r0.itemView
            goto L96
        L8a:
            androidx.recyclerview.widget.ۥ۟۟۟۟ r0 = r6.mChildHelper
            int r0 = r0.m30048()
            if (r0 <= 0) goto L96
            android.view.View r1 = r6.m29673()
        L96:
            if (r1 == 0) goto Lb1
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r6.mState
            int r0 = r0.f29663
            long r4 = (long) r0
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto Lae
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto Lae
            boolean r2 = r0.isFocusable()
            if (r2 == 0) goto Lae
            r1 = r0
        Lae:
            r1.requestFocus()
        Lb1:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final void m29686() {
            r2 = this;
            android.widget.EdgeEffect r0 = r2.mLeftGlow
            if (r0 == 0) goto Le
            r0.onRelease()
            android.widget.EdgeEffect r0 = r2.mLeftGlow
            boolean r0 = r0.isFinished()
            goto Lf
        Le:
            r0 = 0
        Lf:
            android.widget.EdgeEffect r1 = r2.mTopGlow
            if (r1 == 0) goto L1d
            r1.onRelease()
            android.widget.EdgeEffect r1 = r2.mTopGlow
            boolean r1 = r1.isFinished()
            r0 = r0 | r1
        L1d:
            android.widget.EdgeEffect r1 = r2.mRightGlow
            if (r1 == 0) goto L2b
            r1.onRelease()
            android.widget.EdgeEffect r1 = r2.mRightGlow
            boolean r1 = r1.isFinished()
            r0 = r0 | r1
        L2b:
            android.widget.EdgeEffect r1 = r2.mBottomGlow
            if (r1 == 0) goto L39
            r1.onRelease()
            android.widget.EdgeEffect r1 = r2.mBottomGlow
            boolean r1 = r1.isFinished()
            r0 = r0 | r1
        L39:
            if (r0 == 0) goto L3e
            Yue.C6794.m26209(r2)
        L3e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final void m29687(@Yue.InterfaceC4410 android.view.View r12, @Yue.InterfaceC4544 android.view.View r13) {
            r11 = this;
            if (r13 == 0) goto L4
            r0 = r13
            goto L5
        L4:
            r0 = r12
        L5:
            android.graphics.Rect r1 = r11.mTempRect
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            r4 = 0
            r1.set(r4, r4, r2, r3)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof androidx.recyclerview.widget.RecyclerView.C7696
            if (r1 == 0) goto L41
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r0 = (androidx.recyclerview.widget.RecyclerView.C7696) r0
            boolean r1 = r0.f29617
            if (r1 != 0) goto L41
            android.graphics.Rect r0 = r0.f29616
            android.graphics.Rect r1 = r11.mTempRect
            int r2 = r1.left
            int r3 = r0.left
            int r2 = r2 - r3
            r1.left = r2
            int r2 = r1.right
            int r3 = r0.right
            int r2 = r2 + r3
            r1.right = r2
            int r2 = r1.top
            int r3 = r0.top
            int r2 = r2 - r3
            r1.top = r2
            int r2 = r1.bottom
            int r0 = r0.bottom
            int r2 = r2 + r0
            r1.bottom = r2
        L41:
            if (r13 == 0) goto L4d
            android.graphics.Rect r0 = r11.mTempRect
            r11.offsetDescendantRectToMyCoords(r13, r0)
            android.graphics.Rect r0 = r11.mTempRect
            r11.offsetRectIntoDescendantCoords(r12, r0)
        L4d:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r5 = r11.mLayout
            android.graphics.Rect r8 = r11.mTempRect
            boolean r0 = r11.mFirstLayoutComplete
            r1 = 1
            r9 = r0 ^ 1
            if (r13 != 0) goto L5a
            r10 = r1
            goto L5b
        L5a:
            r10 = r4
        L5b:
            r6 = r11
            r7 = r12
            r5.requestChildRectangleOnScreen(r6, r7, r8, r9, r10)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final void m29688() {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r3.mState
            r1 = -1
            r0.f29662 = r1
            r1 = -1
            r0.f29661 = r1
            r0.f29663 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final void m29689() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            r0 = 0
            r1.stopNestedScroll(r0)
            r1.m29686()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final void m29690() {
            r4 = this;
            boolean r0 = r4.mPreserveFocusAfterLayout
            r1 = 0
            if (r0 == 0) goto L14
            boolean r0 = r4.hasFocus()
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r4.mAdapter
            if (r0 == 0) goto L14
            android.view.View r0 = r4.getFocusedChild()
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 != 0) goto L18
            goto L1c
        L18:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r1 = r4.findContainingViewHolder(r0)
        L1c:
            if (r1 != 0) goto L22
            r4.m29688()
            goto L56
        L22:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r4.mState
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r2 = r4.mAdapter
            boolean r2 = r2.hasStableIds()
            if (r2 == 0) goto L31
            long r2 = r1.getItemId()
            goto L33
        L31:
            r2 = -1
        L33:
            r0.f29662 = r2
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r4.mState
            boolean r2 = r4.mDataSetHasChangedAfterLayout
            if (r2 == 0) goto L3d
            r2 = -1
            goto L4a
        L3d:
            boolean r2 = r1.isRemoved()
            if (r2 == 0) goto L46
            int r2 = r1.mOldPosition
            goto L4a
        L46:
            int r2 = r1.getAdapterPosition()
        L4a:
            r0.f29661 = r2
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r0 = r4.mState
            android.view.View r1 = r1.itemView
            int r1 = r4.m29674(r1)
            r0.f29663 = r1
        L56:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m29691(@Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7678 r3, boolean r4, boolean r5) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r2.mAdapter
            if (r0 == 0) goto Le
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۨ r1 = r2.mObserver
            r0.unregisterAdapterDataObserver(r1)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r2.mAdapter
            r0.onDetachedFromRecyclerView(r2)
        Le:
            if (r4 == 0) goto L12
            if (r5 == 0) goto L15
        L12:
            r2.removeAndRecycleViews()
        L15:
            androidx.recyclerview.widget.ۥ r5 = r2.mAdapterHelper
            r5.m30020()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r5 = r2.mAdapter
            r2.mAdapter = r3
            if (r3 == 0) goto L28
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۨ r0 = r2.mObserver
            r3.registerAdapterDataObserver(r0)
            r3.onAttachedToRecyclerView(r2)
        L28:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r3 = r2.mLayout
            if (r3 == 0) goto L31
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r2.mAdapter
            r3.onAdapterChanged(r5, r0)
        L31:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ r3 = r2.mRecycler
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r2.mAdapter
            r3.m29820(r5, r0, r4)
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ r3 = r2.mState
            r4 = 1
            r3.f29655 = r4
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final void m29692() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟ۡ r0 = r1.mViewFlinger
            r0.m29877()
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ r0 = r1.mLayout
            if (r0 == 0) goto Lc
            r0.stopSmoothScroller()
        Lc:
            return
    }
}
