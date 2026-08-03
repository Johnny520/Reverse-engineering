package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.ScrollingView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import p000.AbstractC0124Cv;
import p000.AbstractC0213Ey;
import p000.AbstractC0671Pj;
import p000.AbstractC0810Su;
import p000.AbstractC1293cr;
import p000.AbstractC1360eE;
import p000.AbstractC1448gE;
import p000.AbstractC2117jv;
import p000.AbstractC2185lE;
import p000.AbstractC2251mv;
import p000.AbstractC2496sa;
import p000.AbstractC2517sv;
import p000.AbstractC2603uv;
import p000.AbstractC2792zB;
import p000.C0038Av;
import p000.C0081Bv;
import p000.C0210Ev;
import p000.C0293Gs;
import p000.C0981Wt;
import p000.C1261cd;
import p000.C1347e1;
import p000.C1384ev;
import p000.C1545ih;
import p000.C2088j9;
import p000.C2208lv;
import p000.C2408qE;
import p000.C2431qv;
import p000.C2494sE;
import p000.C2520sy;
import p000.C2646vv;
import p000.C2689wv;
import p000.C2775yv;
import p000.InterfaceC2073iv;
import p000.InterfaceC2165kv;
import p000.InterfaceC2451rE;
import p000.InterfaceC2474rv;
import p000.InterfaceC2560tv;
import p000.InterfaceC2732xv;
import p000.InterpolatorC0844Tl;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements ScrollingView {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = false;
    static final boolean ALLOW_THREAD_GAP_WORK = false;
    private static final float DECELERATION_RATE = 0.0f;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = null;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = null;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION = false;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static boolean sDebugAssertionsEnabled = false;
    static final C0081Bv sDefaultEdgeEffectFactory = null;
    static final Interpolator sQuinticInterpolator = null;
    static boolean sVerboseLoggingEnabled = false;
    C0210Ev mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    AbstractC1158g mAdapter;
    C1152a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private InterfaceC2073iv mChildDrawingOrderCallback;
    C1153b mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private AbstractC2117jv mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    RunnableC1155d mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private InterfaceC2560tv mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    AbstractC1159h mItemAnimator;
    private InterfaceC2165kv mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<AbstractC2251mv> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    AbstractC1160i mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final C1162k mObserver;
    private List<InterfaceC2474rv> mOnChildAttachStateListeners;
    private AbstractC2517sv mOnFlingListener;
    private final ArrayList<InterfaceC2560tv> mOnItemTouchListeners;
    final List<AbstractC1166o> mPendingAccessibilityImportanceChange;
    C2775yv mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    C1154c mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final C1161j mRecycler;
    InterfaceC2732xv mRecyclerListener;
    final List<InterfaceC2732xv> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private AbstractC2603uv mScrollListener;
    private List<AbstractC2603uv> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C0293Gs mScrollingChildHelper;
    final C0038Av mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final RunnableC1165n mViewFlinger;
    private final InterfaceC2451rE mViewInfoProcessCallback;
    final C2494sE mViewInfoStore;

    static {
        NESTED_SCROLLING_ATTRS = new int[]{R.attr.nestedScrollingEnabled};
        DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
        FORCE_INVALIDATE_DISPLAY_LIST = false;
        ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
        POST_UPDATES_ON_ANIMATION = true;
        ALLOW_THREAD_GAP_WORK = true;
        FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
        IGNORE_DETACHED_FOCUSED_CHILD = false;
        Class r1 = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, r1, r1};
        sQuinticInterpolator = new InterpolatorC0844Tl(2);
        sDefaultEdgeEffectFactory = new C0081Bv();
    }

    public RecyclerView(Context r2) {
        this(r2, null);
    }

    public static /* synthetic */ void access$000(RecyclerView r0, View r1, int r2, ViewGroup.LayoutParams r3) {
        r0.attachViewToParent(r1, r2, r3);
    }

    public static /* synthetic */ void access$100(RecyclerView r0, int r1) {
        r0.detachViewFromParent(r1);
    }

    public static /* synthetic */ boolean access$200(RecyclerView r0) {
        return r0.awakenScrollBars();
    }

    public static /* synthetic */ void access$300(RecyclerView r0, View r1, int r2, ViewGroup.LayoutParams r3) {
        r0.attachViewToParent(r1, r2, r3);
    }

    public static /* synthetic */ void access$400(RecyclerView r0, View r1) {
        r0.detachViewFromParent(r1);
    }

    public static /* synthetic */ void access$500(RecyclerView r0, int r1, int r2) {
        r0.setMeasuredDimension(r1, r2);
    }

    private void addAnimatingView(AbstractC1166o r6) {
        View r0 = r6.itemView;
        if (r0.getParent() != this) goto L5;
        boolean r1 = true;
    L6:
        this.mRecycler.m2267n(getChildViewHolder(r0));
        if (r6.isTmpDetached() == false) goto L10;
        this.mChildHelper.m2229b(r0, -1, r0.getLayoutParams(), true);
        return;
    L10:
        if (r1 == true) goto L13;
        this.mChildHelper.m2228a(r0, -1, true);
        return;
    L13:
        C1153b r62 = this.mChildHelper;
        int r12 = r62.f4017a.f4930a.indexOfChild(r0);
        if (r12 < 0) goto L18;
        r62.f4018b.m4260h(r12);
        r62.m2236i(r0);
        return;
    L18:
        throw new IllegalArgumentException("view is not a child, cannot hide " + r0);
    L5:
        r1 = false;
        goto L6
    }

    private void animateChange(AbstractC1166o r2, AbstractC1166o r3, C2208lv r4, C2208lv r5, boolean r6, boolean r7) {
        r2.setIsRecyclable(false);
        if (r6 == false) goto L5;
        addAnimatingView(r2);
    L5:
        if (r2 == r3) goto L10;
        if (r7 == false) goto L8;
        addAnimatingView(r3);
    L8:
        r2.mShadowedHolder = r3;
        addAnimatingView(r2);
        this.mRecycler.m2267n(r2);
        r3.setIsRecyclable(false);
        r3.mShadowingHolder = r2;
    L10:
        if (this.mItemAnimator.mo2246a(r2, r3, r4, r5) == false) goto L13;
        postAnimationRunner();
        return;
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(AbstractC1166o r3) {
        WeakReference<RecyclerView> r0 = r3.mNestedRecyclerView;
        if (r0 == null) goto L23;
        RecyclerView r02 = r0.get();
    L6:
        if (r02 == null) goto L14;
        if (r02 == r3.itemView) goto L24;
        Object r03 = r02.getParent();
        if ((r03 instanceof View) == true) goto L12;
        r02 = null;
        goto L6
    L12:
        r02 = (View) r03;
        goto L6
    L24:
        return;
    L14:
        r3.mNestedRecyclerView = null;
        return;
    }

    private int consumeFlingInStretch(int r5, EdgeEffect r6, EdgeEffect r7, int r8) {
        if (r5 <= 0) goto L12;
        if (r6 == null) goto L12;
        if (AbstractC0671Pj.m1352l(r6) == 0.0f) goto L12;
        float r72 = ((-r5) * FLING_DESTRETCH_FACTOR) / r8;
        int r73 = Math.round(AbstractC0671Pj.m1355t(r6, r72, 0.5f) * ((-r8) / FLING_DESTRETCH_FACTOR));
        if (r73 == r5) goto L11;
        r6.finish();
    L11:
        return r5 - r73;
    L12:
        if (r5 >= 0) goto L21;
        if (r7 != null) goto L15;
        return r5;
    L15:
        if (AbstractC0671Pj.m1352l(r7) == 0.0f) goto L23;
        float r82 = r8;
        float r62 = (r5 * FLING_DESTRETCH_FACTOR) / r82;
        int r63 = Math.round(AbstractC0671Pj.m1355t(r7, r62, 0.5f) * (r82 / FLING_DESTRETCH_FACTOR));
        if (r63 == r5) goto L20;
        r7.finish();
    L20:
        return r5 - r63;
    L23:
        return r5;
    L21:
        return r5;
    }

    private void createLayoutManager(Context r7, String r8, AttributeSet r9, int r10, int r11) {
        if (r8 == null) goto L42;
        String r82 = r8.trim();
        if (r82.isEmpty() == true) goto L48;
        String r83 = getFullClassName(r7, r82);
    L10:
        e = move-exception;
        throw new IllegalStateException(r9.getPositionDescription() + ": Class is not a LayoutManager " + r83, e);
    L18:
        e = move-exception;
        throw new IllegalStateException(r9.getPositionDescription() + ": Unable to find LayoutManager " + r83, e);
    L12:
        e = move-exception;
        throw new IllegalStateException(r9.getPositionDescription() + ": Cannot access non-public constructor " + r83, e);
    L14:
        e = move-exception;
        throw new IllegalStateException(r9.getPositionDescription() + ": Could not instantiate the LayoutManager: " + r83, e);
    L16:
        e = move-exception;
        throw new IllegalStateException(r9.getPositionDescription() + ": Could not instantiate the LayoutManager: " + r83, e);
    L8:
        if (isInEditMode() == false) goto L20;
        ClassLoader r1 = getClass().getClassLoader();     // Catch: ClassCastException -> L10 IllegalAccessException -> L12 InstantiationException -> L14 InvocationTargetException -> L16 ClassNotFoundException -> L18
    L21:
        Class<? extends U> r12 = Class.forName(r83, false, r1).asSubclass(AbstractC1160i.class);     // Catch: ClassCastException -> L10 IllegalAccessException -> L12 InstantiationException -> L14 InvocationTargetException -> L16 ClassNotFoundException -> L18
        Constructor r4 = r12.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);     // Catch: ClassCastException -> L10 IllegalAccessException -> L12 InstantiationException -> L14 InvocationTargetException -> L16 ClassNotFoundException -> L18 NoSuchMethodException -> L25
        Object[] r5 = {r7, r9, Integer.valueOf(r10), Integer.valueOf(r11)};     // Catch: ClassCastException -> L10 IllegalAccessException -> L12 InstantiationException -> L14 InvocationTargetException -> L16 ClassNotFoundException -> L18 NoSuchMethodException -> L25
    L28:
        r4.setAccessible(true);     // Catch: ClassCastException -> L10 IllegalAccessException -> L12 InstantiationException -> L14 InvocationTargetException -> L16 ClassNotFoundException -> L18
        setLayoutManager((AbstractC1160i) r4.newInstance(r5));     // Catch: ClassCastException -> L10 IllegalAccessException -> L12 InstantiationException -> L14 InvocationTargetException -> L16 ClassNotFoundException -> L18
        return;
    L25:
        e = move-exception;
        r5 = null;
        r4 = r12.getConstructor(null);     // Catch: ClassCastException -> L10 IllegalAccessException -> L12 InstantiationException -> L14 InvocationTargetException -> L16 ClassNotFoundException -> L18 NoSuchMethodException -> L29
    L29:
        e = move-exception;
        e.initCause(e);     // Catch: ClassCastException -> L10 IllegalAccessException -> L12 InstantiationException -> L14 InvocationTargetException -> L16 ClassNotFoundException -> L18
        throw new IllegalStateException(r9.getPositionDescription() + ": Error creating LayoutManager " + r83, e);     // Catch: ClassCastException -> L10 IllegalAccessException -> L12 InstantiationException -> L14 InvocationTargetException -> L16 ClassNotFoundException -> L18
    L20:
        r1 = r7.getClassLoader();     // Catch: ClassCastException -> L10 IllegalAccessException -> L12 InstantiationException -> L14 InvocationTargetException -> L16 ClassNotFoundException -> L18
        goto L21
    L48:
        return;
    }

    private boolean didChildRangeChange(int r5, int r6) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] r0 = this.mMinMaxLayoutPositions;
        if (r0[0] == r5) goto L5;
    L8:
        return true;
    L5:
        if (r0[1] != r6) goto L8;
        return false;
    }

    private void dispatchContentChangedIfNecessary() {
        int r0 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (r0 != 0) goto L5;
        return;
    L5:
        if (isAccessibilityEnabled() == false) goto L9;
        AccessibilityEvent r1 = AccessibilityEvent.obtain();
        r1.setEventType(2048);
        r1.setContentChangeTypes(r0);
        sendAccessibilityEventUnchecked(r1);
        return;
    }

    private void dispatchLayoutStep1() {
        boolean r1 = true;
        this.mState.m57a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f84i = false;
        startInterceptRequestLayout();
        C2494sE r0 = this.mViewInfoStore;
        r0.f8756a.clear();
        r0.f8757b.m5166a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        C0038Av r02 = this.mState;
        if (r02.f85j == true) goto L5;
    L7:
        r1 = false;
    L8:
        r02.f83h = r1;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        r02.f82g = r02.f86k;
        r02.f80e = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f85j == false) goto L35;
        int r03 = this.mChildHelper.m2232e();
        int r12 = 0;
    L11:
        if (r12 >= r03) goto L35;
        AbstractC1166o r3 = getChildViewHolderInt(this.mChildHelper.m2231d(r12));
        if (r3.shouldIgnore() == true) goto L33;
        if (r3.isInvalid() == true) goto L17;
    L19:
        AbstractC1159h r4 = this.mItemAnimator;
        AbstractC1159h.m2245b(r3);
        r3.getUnmodifiedPayloads();
        r4.getClass();
        C2208lv r42 = new C2208lv();
        r42.m4444a(r3);
        C2520sy r5 = this.mViewInfoStore.f8756a;
        C2408qE r6 = (C2408qE) r5.get(r3);
        if (r6 != null) goto L22;
        r6 = C2408qE.m4846a();
        r5.put(r3, r6);
    L22:
        r6.f8444b = r42;
        r6.f8443a |= 4;
        if (this.mState.f83h == false) goto L33;
        if (r3.isUpdated() == false) goto L33;
        if (r3.isRemoved() == true) goto L33;
        if (r3.shouldIgnore() == true) goto L33;
        if (r3.isInvalid() == true) goto L33;
        this.mViewInfoStore.f8757b.m5170e(getChangedHolderKey(r3), r3);
        goto L33
    L17:
        if (this.mAdapter.hasStableIds() == true) goto L19;
    L33:
        r12 = r12 + 1;
    L35:
        if (this.mState.f86k == false) goto L56;
        saveOldPositions();
        C0038Av r04 = this.mState;
        boolean r32 = r04.f81f;
        r04.f81f = false;
        this.mLayout.onLayoutChildren(this.mRecycler, r04);
        this.mState.f81f = r32;
        int r05 = 0;
    L38:
        if (r05 >= this.mChildHelper.m2232e()) goto L55;
        AbstractC1166o r33 = getChildViewHolderInt(this.mChildHelper.m2231d(r05));
        if (r33.shouldIgnore() == true) goto L54;
        C2408qE r43 = (C2408qE) this.mViewInfoStore.f8756a.get(r33);
        if (r43 != null) goto L45;
    L47:
        AbstractC1159h.m2245b(r33);
        boolean r44 = r33.hasAnyOfTheFlags(8192);
        AbstractC1159h r52 = this.mItemAnimator;
        r33.getUnmodifiedPayloads();
        r52.getClass();
        C2208lv r53 = new C2208lv();
        r53.m4444a(r33);
        if (r44 == false) goto L50;
        recordAnimationInfoIfBouncedHiddenView(r33, r53);
        goto L54
    L50:
        C2520sy r45 = this.mViewInfoStore.f8756a;
        C2408qE r62 = (C2408qE) r45.get(r33);
        if (r62 != null) goto L53;
        r62 = C2408qE.m4846a();
        r45.put(r33, r62);
    L53:
        r62.f8443a |= 2;
        r62.f8444b = r53;
        goto L54
    L45:
        if ((r43.f8443a & 4) == 0) goto L47;
    L54:
        r05 = r05 + 1;
        goto L38
    L55:
        clearOldPositions();
    L57:
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f79d = 2;
        return;
    L56:
        clearOldPositions();
        goto L57
    L5:
        if (this.mItemsChanged == false) goto L7;
        goto L7
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.m57a(6);
        this.mAdapterHelper.m2218c();
        this.mState.f80e = this.mAdapter.getItemCount();
        this.mState.f78c = 0;
        if (this.mPendingSavedState != null) goto L5;
    L10:
        C0038Av r0 = this.mState;
        r0.f82g = false;
        this.mLayout.onLayoutChildren(this.mRecycler, r0);
        C0038Av r02 = this.mState;
        r02.f81f = false;
        if (r02.f85j == true) goto L13;
    L15:
        boolean r2 = false;
    L16:
        r02.f85j = r2;
        r02.f79d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        return;
    L13:
        if (this.mItemAnimator == null) goto L15;
        r2 = true;
        goto L16
    L5:
        if (this.mAdapter.canRestoreState() == false) goto L10;
        Parcelable r03 = this.mPendingSavedState.f9425c;
        if (r03 == null) goto L9;
        this.mLayout.onRestoreInstanceState(r03);
    L9:
        this.mPendingSavedState = null;
        goto L10
    }

    private void dispatchLayoutStep3() {
        this.mState.m57a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C0038Av r1 = this.mState;
        boolean r8 = true;
        r1.f79d = 1;
        if (r1.f85j == false) goto L73;
        int r10 = this.mChildHelper.m2232e() - 1;
    L5:
        if (r10 < 0) goto L34;
        AbstractC1166o r2 = getChildViewHolderInt(this.mChildHelper.m2231d(r10));
        if (r2.shouldIgnore() == true) goto L33;
        long r3 = getChangedHolderKey(r2);
        this.mItemAnimator.getClass();
        C2208lv r12 = new C2208lv();
        r12.m4444a(r2);
        AbstractC1166o r5 = (AbstractC1166o) this.mViewInfoStore.f8757b.m5167b(r3);
        if (r5 != null) goto L12;
    L32:
        this.mViewInfoStore.m4971a(r2, r12);
        goto L33
    L12:
        if (r5.shouldIgnore() == true) goto L32;
        C2408qE r6 = (C2408qE) this.mViewInfoStore.f8756a.get(r5);
        if (r6 != null) goto L16;
    L18:
        boolean r62 = false;
    L19:
        C2408qE r11 = (C2408qE) this.mViewInfoStore.f8756a.get(r2);
        if (r11 != null) goto L22;
    L24:
        boolean r112 = r62;
        boolean r63 = false;
    L25:
        if (r112 == false) goto L28;
        if (r5 != r2) goto L28;
        this.mViewInfoStore.m4971a(r2, r12);
    L28:
        C2208lv r122 = this.mViewInfoStore.m4972b(r5, 4);
        this.mViewInfoStore.m4971a(r2, r12);
        C2208lv r13 = this.mViewInfoStore.m4972b(r2, 8);
        if (r122 != null) goto L31;
        handleMissingPreInfoForChangeError(r3, r2, r5);
        goto L33
    L31:
        animateChange(r5, r2, r122, r13, r112, r63);
        goto L33
    L22:
        if ((r11.f8443a & 1) == 0) goto L24;
        r112 = r62;
        r63 = true;
        goto L25
    L16:
        if ((r6.f8443a & 1) == 0) goto L18;
        r62 = true;
    L33:
        r10 = r10 - 1;
        goto L5
    L34:
        C2494sE r14 = this.mViewInfoStore;
        InterfaceC2451rE r22 = this.mViewInfoProcessCallback;
        C2520sy r15 = r14.f8756a;
        int r32 = r15.f8818c - 1;
    L35:
        if (r32 < 0) goto L73;
        AbstractC1166o r113 = (AbstractC1166o) r15.m5002f(r32);
        C2408qE r4 = (C2408qE) r15.mo4h(r32);
        int r52 = r4.f8443a;
        if ((r52 & 3) != 3) goto L41;
        RecyclerView r53 = ((C1384ev) r22).f4930a;
        r53.mLayout.removeAndRecycleView(r113.itemView, r53.mRecycler);
    L39:
        boolean r16 = r8;
    L72:
        r4.f8443a = 0;
        r4.f8444b = null;
        r4.f8445c = null;
        C2408qE.f8442d.mo1934a(r4);
        r32 = r32 - 1;
        r8 = r16;
        goto L35
    L41:
        if ((r52 & 1) == 0) goto L47;
        C2208lv r54 = r4.f8444b;
        if (r54 != null) goto L45;
        RecyclerView r55 = ((C1384ev) r22).f4930a;
        r55.mLayout.removeAndRecycleView(r113.itemView, r55.mRecycler);
        goto L39
    L45:
        C2208lv r64 = r4.f8445c;
        RecyclerView r102 = ((C1384ev) r22).f4930a;
        r102.mRecycler.m2267n(r113);
        r102.animateDisappearance(r113, r54, r64);
        goto L39
    L47:
        if ((r52 & 14) != 14) goto L50;
        ((C1384ev) r22).f4930a.animateAppearance(r113, r4.f8444b, r4.f8445c);
        goto L39
    L50:
        if ((r52 & 12) != 12) goto L66;
        C2208lv r56 = r4.f8444b;
        C2208lv r65 = r4.f8445c;
        C1384ev r103 = (C1384ev) r22;
        r103.getClass();
        r113.setIsRecyclable(false);
        RecyclerView r104 = r103.f4930a;
        if (r104.mDataSetHasChangedAfterLayout == true) goto L54;
        C1261cd r123 = (C1261cd) r104.mItemAnimator;
        r123.getClass();
        int r132 = r56.f7695a;
        int r142 = r65.f7695a;
        if (r132 != r142) goto L62;
        r16 = r8;
        if (r56.f7696b != r65.f7696b) goto L63;
        r123.m2247c(r113);
        boolean r66 = false;
        RecyclerView r57 = r104;
    L64:
        if (r66 == false) goto L72;
        r57.postAnimationRunner();
    L63:
        r57 = r104;
        r66 = r123.m2393g(r113, r132, r56.f7696b, r142, r65.f7696b);
        goto L64
    L62:
        r16 = r8;
        goto L63
    L54:
        if (r104.mItemAnimator.mo2246a(r113, r113, r56, r65) == false) goto L39;
        r104.postAnimationRunner();
        goto L39
    L66:
        r16 = r8;
        if ((r52 & 4) == 0) goto L70;
        C2208lv r58 = r4.f8444b;
        RecyclerView r67 = ((C1384ev) r22).f4930a;
        r67.mRecycler.m2267n(r113);
        r67.animateDisappearance(r113, r58, null);
        goto L72
    L70:
        if ((r52 & 8) == 0) goto L72;
        ((C1384ev) r22).f4930a.animateAppearance(r113, r4.f8444b, r4.f8445c);
    L73:
        boolean r162 = r8;
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        C0038Av r17 = this.mState;
        r17.f77b = r17.f80e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        r17.f85j = false;
        r17.f86k = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList r18 = this.mRecycler.f4040b;
        if (r18 == null) goto L76;
        r18.clear();
    L76:
        AbstractC1160i r19 = this.mLayout;
        if (r19.mPrefetchMaxObservedInInitialPrefetch == false) goto L79;
        r19.mPrefetchMaxCountObserved = 0;
        r19.mPrefetchMaxObservedInInitialPrefetch = false;
        this.mRecycler.m2268o();
    L79:
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        C2494sE r110 = this.mViewInfoStore;
        r110.f8756a.clear();
        r110.f8757b.m5166a();
        int[] r111 = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(r111[0], r111[r162 ? 1 : 0]) == false) goto L82;
        dispatchOnScrolled(0, 0);
    L82:
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent r3) {
        InterfaceC2560tv r0 = this.mInterceptingOnItemTouchListener;
        if (r0 == null) goto L5;
        r0.mo1552a(r3);
        int r32 = r3.getAction();
        if (r32 == 3) goto L15;
        if (r32 == 1) goto L15;
        return true;
    L15:
        this.mInterceptingOnItemTouchListener = null;
        return true;
    L5:
        if (r3.getAction() != 0) goto L9;
        return false;
    L9:
        return findInterceptingOnItemTouchListener(r3);
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent r7) {
        int r0 = r7.getAction();
        int r1 = this.mOnItemTouchListeners.size();
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L11;
        InterfaceC2560tv r4 = this.mOnItemTouchListeners.get(r3);
        if (r4.mo1553b(r7) == false) goto L10;
        if (r0 == 3) goto L10;
        this.mInterceptingOnItemTouchListener = r4;
        return true;
    L10:
        r3 = r3 + 1;
        goto L3
    L11:
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] r9) {
        int r0 = this.mChildHelper.m2232e();
        if (r0 != 0) goto L6;
        r9[0] = -1;
        r9[1] = -1;
        return;
    L6:
        int r3 = Integer.MAX_VALUE;
        int r4 = Integer.MIN_VALUE;
        int r5 = 0;
    L7:
        if (r5 >= r0) goto L17;
        AbstractC1166o r6 = getChildViewHolderInt(this.mChildHelper.m2231d(r5));
        if (r6.shouldIgnore() == true) goto L16;
        int r62 = r6.getLayoutPosition();
        if (r62 >= r3) goto L14;
        r3 = r62;
    L14:
        if (r62 <= r4) goto L16;
        r4 = r62;
    L16:
        r5 = r5 + 1;
        goto L7
    L17:
        r9[0] = r3;
        r9[1] = r4;
    }

    public static RecyclerView findNestedRecyclerView(View r4) {
        if ((r4 instanceof ViewGroup) == true) goto L6;
        return null;
    L6:
        if ((r4 instanceof RecyclerView) == true) goto L8;
        ViewGroup r42 = (ViewGroup) r4;
        int r0 = r42.getChildCount();
        int r2 = 0;
    L10:
        if (r2 >= r0) goto L15;
        RecyclerView r3 = findNestedRecyclerView(r42.getChildAt(r2));
        if (r3 != null) goto L13;
        r2 = r2 + 1;
        goto L10
    L13:
        return r3;
    L15:
        return null;
    L8:
        return (RecyclerView) r4;
    }

    private View findNextViewToFocus() {
        C0038Av r0 = this.mState;
        int r1 = r0.f87l;
        if (r1 != (-1)) goto L6;
        r1 = 0;
    L6:
        int r02 = r0.m58b();
        int r2 = r1;
    L7:
        if (r2 >= r02) goto L16;
        AbstractC1166o r3 = findViewHolderForAdapterPosition(r2);
        if (r3 == null) goto L16;
        if (r3.itemView.hasFocusable() == true) goto L14;
        r2 = r2 + 1;
        goto L7
    L14:
        return r3.itemView;
    L16:
        int r03 = Math.min(r02, r1);
    L17:
        r03 = r03 - 1;
        if (r03 < 0) goto L27;
        AbstractC1166o r22 = findViewHolderForAdapterPosition(r03);
        if (r22 == null) goto L21;
        if (r22.itemView.hasFocusable() == false) goto L17;
        return r22.itemView;
    L21:
        return null;
    L27:
        return null;
    }

    public static AbstractC1166o getChildViewHolderInt(View r0) {
        if (r0 != null) goto L6;
        return null;
    L6:
        return ((C2431qv) r0.getLayoutParams()).f8526a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View r6, Rect r7) {
        C2431qv r0 = (C2431qv) r6.getLayoutParams();
        Rect r1 = r0.f8527b;
        r7.set((r6.getLeft() - r1.left) - ((ViewGroup.MarginLayoutParams) r0).leftMargin, (r6.getTop() - r1.top) - ((ViewGroup.MarginLayoutParams) r0).topMargin, (r6.getRight() + r1.right) + ((ViewGroup.MarginLayoutParams) r0).rightMargin, (r6.getBottom() + r1.bottom) + ((ViewGroup.MarginLayoutParams) r0).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View r4) {
        int r0 = r4.getId();
    L4:
        if (r4.isFocused() == true) goto L12;
        if ((r4 instanceof ViewGroup) == false) goto L12;
        if (r4.hasFocus() == false) goto L12;
        r4 = ((ViewGroup) r4).getFocusedChild();
        if (r4.getId() == (-1)) goto L4;
        r0 = r4.getId();
    L12:
        return r0;
    }

    private String getFullClassName(Context r3, String r4) {
        if (r4.charAt(0) != '.') goto L7;
        return r3.getPackageName() + r4;
    L7:
        if (r4.contains(".") == false) goto L10;
        return r4;
    L10:
        return RecyclerView.class.getPackage().getName() + '.' + r4;
    }

    private C0293Gs getScrollingChildHelper() {
        if (this.mScrollingChildHelper != null) goto L6;
        this.mScrollingChildHelper = new C0293Gs(this);
    L6:
        return this.mScrollingChildHelper;
    }

    private float getSplineFlingDistance(int r9) {
        double r2 = Math.log((Math.abs(r9) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float r92 = DECELERATION_RATE;
        return (float) (Math.exp((r92 / (((double) r92) - 1.0d)) * r2) * (this.mPhysicalCoef * SCROLL_FRICTION));
    }

    private void handleMissingPreInfoForChangeError(long r6, AbstractC1166o r8, AbstractC1166o r9) {
        int r0 = this.mChildHelper.m2232e();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L18;
        AbstractC1166o r2 = getChildViewHolderInt(this.mChildHelper.m2231d(r1));
        if (r2 == r8) goto L17;
        if (getChangedHolderKey(r2) != r6) goto L17;
        AbstractC1158g r62 = this.mAdapter;
        if (r62 != null) goto L12;
    L15:
        StringBuilder r92 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
        r92.append(r2);
        r92.append(" \n View Holder 2:");
        r92.append(r8);
        throw new IllegalStateException(AbstractC0213Ey.m406d(this, r92));
    L12:
        if (r62.hasStableIds() == false) goto L15;
        StringBuilder r93 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
        r93.append(r2);
        r93.append(" \n View Holder 2:");
        r93.append(r8);
        throw new IllegalStateException(AbstractC0213Ey.m406d(this, r93));
    L17:
        r1 = r1 + 1;
        goto L3
    L18:
        Objects.toString(r9);
        Objects.toString(r8);
        exceptionLabel();
    }

    private boolean hasUpdatedView() {
        int r0 = this.mChildHelper.m2232e();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L14;
        AbstractC1166o r3 = getChildViewHolderInt(this.mChildHelper.m2231d(r2));
        if (r3 == null) goto L13;
        if (r3.shouldIgnore() == true) goto L13;
        if (r3.isUpdated() == false) goto L13;
        return true;
    L13:
        r2 = r2 + 1;
        goto L3
    L14:
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        WeakHashMap r0 = AbstractC2185lE.f7617a;
        if (AbstractC1448gE.m2772a(this) != 0) goto L6;
        AbstractC1448gE.m2773b(this, 8);
        return;
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C1153b(new C1384ev(this));
    }

    private boolean isPreferredNextFocus(View r10, View r11, int r12) {
        if (r11 == null) goto L85;
        if (r11 == this) goto L85;
        if (r11 == r10) goto L85;
        if (findContainingItemView(r11) != null) goto L11;
        return false;
    L11:
        if (r10 != null) goto L14;
        return true;
    L14:
        if (findContainingItemView(r10) != null) goto L16;
        return true;
    L16:
        this.mTempRect.set(0, 0, r10.getWidth(), r10.getHeight());
        this.mTempRect2.set(0, 0, r11.getWidth(), r11.getHeight());
        offsetDescendantRectToMyCoords(r10, this.mTempRect);
        offsetDescendantRectToMyCoords(r11, this.mTempRect2);
        byte r112 = -1;
        if (this.mLayout.getLayoutDirection() != 1) goto L19;
        int r102 = -1;
    L20:
        Rect r2 = this.mTempRect;
        int r3 = r2.left;
        Rect r4 = this.mTempRect2;
        int r5 = r4.left;
        if (r3 < r5) goto L25;
        if (r2.right <= r5) goto L25;
    L27:
        int r6 = r2.right;
        int r7 = r4.right;
        if (r6 > r7) goto L30;
        if (r3 >= r7) goto L30;
    L32:
        int r32 = 0;
    L33:
        int r52 = r2.top;
        int r62 = r4.top;
        if (r52 < r62) goto L38;
        if (r2.bottom <= r62) goto L38;
    L40:
        int r22 = r2.bottom;
        int r42 = r4.bottom;
        if (r22 > r42) goto L43;
        if (r52 >= r42) goto L43;
    L45:
        r112 = 0;
    L46:
        if (r12 != 1) goto L48;
        if (r112 < 0) goto L84;
        if (r112 == 0) goto L81;
    L83:
        return false;
    L81:
        if ((r32 * r102) >= 0) goto L83;
    L84:
        return true;
    L48:
        if (r12 != 2) goto L50;
        if (r112 > 0) goto L77;
        if (r112 == 0) goto L74;
    L76:
        return false;
    L74:
        if ((r32 * r102) <= 0) goto L76;
    L77:
        return true;
    L50:
        if (r12 != 17) goto L52;
        if (r32 >= 0) goto L70;
        return true;
    L70:
        return false;
    L52:
        if (r12 != 33) goto L54;
        if (r112 >= 0) goto L67;
        return true;
    L67:
        return false;
    L54:
        if (r12 != 66) goto L56;
        if (r32 <= 0) goto L64;
        return true;
    L64:
        return false;
    L56:
        if (r12 != 130) goto L60;
        if (r112 <= 0) goto L59;
        return true;
    L59:
        return false;
    L60:
        StringBuilder r113 = new StringBuilder("Invalid direction: ");
        r113.append(r12);
        throw new IllegalArgumentException(AbstractC0213Ey.m406d(this, r113));
    L43:
        if (r52 <= r62) goto L45;
    L38:
        if (r2.bottom >= r4.bottom) goto L40;
        r112 = 1;
    L30:
        if (r3 <= r5) goto L32;
        r32 = -1;
    L25:
        if (r2.right >= r4.right) goto L27;
        r32 = 1;
        goto L33
    L19:
        r102 = 1;
    L85:
        return false;
    }

    private void nestedScrollByInternal(int r12, int r13, MotionEvent r14, int r15) {
        AbstractC1160i r0 = this.mLayout;
        if (r0 != null) goto L6;
        return;
    L6:
        if (this.mLayoutSuppressed == false) goto L8;
        return;
    L8:
        int[] r1 = this.mReusableIntPair;
        int r2 = 0;
        r1[0] = 0;
        r1[1] = 0;
        boolean r02 = r0.canScrollHorizontally();
        boolean r16 = this.mLayout.canScrollVertically();
        if (r16 == false) goto L11;
        int r4 = (r02 ? 1 : 0) | 2;
    L13:
        if (r14 != null) goto L15;
        float r6 = getHeight() / 2.0f;
    L16:
        if (r14 != null) goto L18;
        float r7 = getWidth() / 2.0f;
    L19:
        int r122 = r12 - releaseHorizontalGlow(r12, r6);
        int r132 = r13 - releaseVerticalGlow(r13, r7);
        startNestedScroll(r4, r15);
        if (r02 == false) goto L22;
        int r62 = r122;
    L23:
        if (r16 == false) goto L25;
        int r72 = r132;
    L27:
        if (dispatchNestedPreScroll(r62, r72, this.mReusableIntPair, this.mScrollOffset, r15) == false) goto L29;
        int[] r152 = this.mReusableIntPair;
        r122 = r122 - r152[0];
        r132 = r132 - r152[1];
    L29:
        if (r02 == false) goto L31;
        int r153 = r122;
    L32:
        if (r16 == false) goto L34;
        r2 = r132;
    L34:
        scrollByInternal(r153, r2, r14, r15);
        RunnableC1155d r142 = this.mGapWorker;
        if (r142 == null) goto L39;
        if (r122 != 0) goto L38;
        if (r132 == 0) goto L39;
    L38:
        r142.m2242a(this, r122, r132);
    L39:
        stopNestedScroll(r15);
        return;
    L31:
        r153 = 0;
        goto L32
    L25:
        r72 = 0;
        goto L27
    L22:
        r62 = 0;
        goto L23
    L18:
        r7 = r14.getX();
        goto L19
    L15:
        r6 = r14.getY();
        goto L16
    L11:
        r4 = r02 ? 1 : 0;
        goto L13
    }

    private void onPointerUp(MotionEvent r4) {
        int r0 = r4.getActionIndex();
        if (r4.getPointerId(r0) != this.mScrollPointerId) goto L9;
        if (r0 != 0) goto L6;
        int r02 = 1;
    L7:
        this.mScrollPointerId = r4.getPointerId(r02);
        int r1 = (int) (r4.getX(r02) + 0.5f);
        this.mLastTouchX = r1;
        this.mInitialTouchX = r1;
        int r42 = (int) (r4.getY(r02) + 0.5f);
        this.mLastTouchY = r42;
        this.mInitialTouchY = r42;
        return;
    L6:
        r02 = 0;
        goto L7
    }

    private boolean predictiveItemAnimationsEnabled() {
        if (this.mItemAnimator != null) goto L5;
        return false;
    L5:
        if (this.mLayout.supportsPredictiveItemAnimations() == false) goto L10;
        return true;
    L10:
        return false;
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean r1 = false;
        if (this.mDataSetHasChangedAfterLayout == false) goto L8;
        C1152a r0 = this.mAdapterHelper;
        r0.m2226k(r0.f4012b);
        r0.m2226k(r0.f4013c);
        r0.f4016f = 0;
        if (this.mDispatchItemsChangedEvent == false) goto L8;
        this.mLayout.onItemsChanged(this);
    L8:
        if (predictiveItemAnimationsEnabled() == false) goto L10;
        this.mAdapterHelper.m2225j();
    L12:
        if (this.mItemsAddedOrRemoved == false) goto L14;
    L17:
        boolean r02 = true;
    L18:
        C0038Av r3 = this.mState;
        if (this.mFirstLayoutComplete == true) goto L21;
    L31:
        boolean r4 = false;
    L32:
        r3.f85j = r4;
        C0038Av r32 = this.mState;
        if (r32.f85j == false) goto L40;
        if (r02 == false) goto L40;
        if (this.mDataSetHasChangedAfterLayout == true) goto L40;
        if (predictiveItemAnimationsEnabled() == false) goto L40;
        r1 = true;
    L40:
        r32.f86k = r1;
        return;
    L21:
        if (this.mItemAnimator == null) goto L31;
        boolean r42 = this.mDataSetHasChangedAfterLayout;
        if (r42 == true) goto L27;
        if (r02 == true) goto L27;
        if (this.mLayout.mRequestedSimpleAnimations == false) goto L31;
    L27:
        if (r42 == true) goto L29;
    L30:
        r4 = true;
        goto L32
    L29:
        if (this.mAdapter.hasStableIds() == false) goto L31;
    L14:
        if (this.mItemsChanged == true) goto L17;
        r02 = false;
        goto L18
    L10:
        this.mAdapterHelper.m2218c();
        goto L12
    }

    private void pullGlows(float r7, float r8, float r9, float r10) {
        boolean r3 = true;
        if (r8 >= 0.0f) goto L7;
        ensureLeftGlow();
        AbstractC0671Pj.m1355t(this.mLeftGlow, (-r8) / getWidth(), 1.0f - (r9 / getHeight()));
    L5:
        boolean r92 = true;
    L11:
        if (r10 >= 0.0f) goto L14;
        ensureTopGlow();
        AbstractC0671Pj.m1355t(this.mTopGlow, (-r10) / getHeight(), r7 / getWidth());
    L17:
        if (r3 == false) goto L19;
    L24:
        WeakHashMap r72 = AbstractC2185lE.f7617a;
        postInvalidateOnAnimation();
        return;
    L19:
        if (r8 != 0.0f) goto L24;
        if (r10 != 0.0f) goto L24;
        return;
    L14:
        if (r10 <= 0.0f) goto L16;
        ensureBottomGlow();
        AbstractC0671Pj.m1355t(this.mBottomGlow, r10 / getHeight(), 1.0f - (r7 / getWidth()));
        goto L17
    L16:
        r3 = r92;
        goto L17
    L7:
        if (r8 <= 0.0f) goto L9;
        ensureRightGlow();
        AbstractC0671Pj.m1355t(this.mRightGlow, r8 / getWidth(), r9 / getHeight());
        goto L5
    L9:
        r92 = false;
        goto L11
    }

    private void recoverFocusFromState() {
        if (this.mPreserveFocusAfterLayout == true) goto L5;
        return;
    L5:
        if (this.mAdapter != null) goto L7;
        return;
    L7:
        if (hasFocus() == true) goto L9;
        return;
    L9:
        if (getDescendantFocusability() != 393216) goto L11;
        return;
    L11:
        if (getDescendantFocusability() != 131072) goto L16;
        if (isFocused() == false) goto L16;
        return;
    L16:
        if (isFocused() == true) goto L30;
        View r0 = getFocusedChild();
        if (IGNORE_DETACHED_FOCUSED_CHILD == false) goto L28;
        if (r0.getParent() == null) goto L24;
        if (r0.hasFocus() == true) goto L28;
    L24:
        if (this.mChildHelper.m2232e() != 0) goto L30;
        requestFocus();
        return;
    L28:
        if (this.mChildHelper.f4019c.contains(r0) == true) goto L30;
        return;
    L30:
        View r1 = null;
        if (this.mState.f88m != (-1)) goto L33;
    L35:
        AbstractC1166o r02 = null;
    L36:
        if (r02 == null) goto L44;
        C1153b r4 = this.mChildHelper;
        if (r4.f4019c.contains(r02.itemView) == true) goto L44;
        if (r02.itemView.hasFocusable() == false) goto L44;
        r1 = r02.itemView;
    L46:
        if (r1 == null) goto L60;
        int r03 = this.mState.f89n;
        if (r03 == (-1)) goto L54;
        View r04 = r1.findViewById(r03);
        if (r04 == null) goto L54;
        if (r04.isFocusable() == false) goto L54;
        r1 = r04;
    L54:
        r1.requestFocus();
        return;
    L60:
        return;
    L44:
        if (this.mChildHelper.m2232e() <= 0) goto L46;
        r1 = findNextViewToFocus();
        goto L46
    L33:
        if (this.mAdapter.hasStableIds() == false) goto L35;
        r02 = findViewHolderForItemId(this.mState.f88m);
        goto L36
    }

    private void releaseGlows() {
        EdgeEffect r0 = this.mLeftGlow;
        if (r0 == null) goto L5;
        r0.onRelease();
        boolean r02 = this.mLeftGlow.isFinished();
    L6:
        EdgeEffect r1 = this.mTopGlow;
        if (r1 == null) goto L9;
        r1.onRelease();
        r02 = r02 | this.mTopGlow.isFinished();
    L9:
        EdgeEffect r12 = this.mRightGlow;
        if (r12 == null) goto L12;
        r12.onRelease();
        r02 = r02 | this.mRightGlow.isFinished();
    L12:
        EdgeEffect r13 = this.mBottomGlow;
        if (r13 == null) goto L15;
        r13.onRelease();
        r02 = r02 | this.mBottomGlow.isFinished();
    L15:
        if (r02 == false) goto L18;
        WeakHashMap r03 = AbstractC2185lE.f7617a;
        postInvalidateOnAnimation();
        return;
    L18:
        return;
    L5:
        r02 = false;
        goto L6
    }

    private int releaseHorizontalGlow(int r4, float r5) {
        float r52 = r5 / getHeight();
        float r42 = r4 / getWidth();
        EdgeEffect r0 = this.mLeftGlow;
        float r1 = 0.0f;
        if (r0 != null) goto L5;
    L14:
        EdgeEffect r02 = this.mRightGlow;
        if (r02 != null) goto L17;
    L27:
        return Math.round(r1 * getWidth());
    L17:
        if (AbstractC0671Pj.m1352l(r02) == 0.0f) goto L27;
        if (canScrollHorizontally(1) == false) goto L21;
        this.mRightGlow.onRelease();
    L25:
        invalidate();
        goto L27
    L21:
        float r43 = AbstractC0671Pj.m1355t(this.mRightGlow, r42, r52);
        if (AbstractC0671Pj.m1352l(this.mRightGlow) != 0.0f) goto L24;
        this.mRightGlow.onRelease();
    L24:
        r1 = r43;
        goto L25
    L5:
        if (AbstractC0671Pj.m1352l(r0) == 0.0f) goto L14;
        if (canScrollHorizontally(-1) == false) goto L9;
        this.mLeftGlow.onRelease();
    L13:
        invalidate();
        goto L27
    L9:
        float r44 = -AbstractC0671Pj.m1355t(this.mLeftGlow, -r42, 1.0f - r52);
        if (AbstractC0671Pj.m1352l(this.mLeftGlow) != 0.0f) goto L12;
        this.mLeftGlow.onRelease();
    L12:
        r1 = r44;
        goto L13
    }

    private int releaseVerticalGlow(int r4, float r5) {
        float r52 = r5 / getWidth();
        float r42 = r4 / getHeight();
        EdgeEffect r0 = this.mTopGlow;
        float r1 = 0.0f;
        if (r0 != null) goto L5;
    L14:
        EdgeEffect r02 = this.mBottomGlow;
        if (r02 != null) goto L17;
    L27:
        return Math.round(r1 * getHeight());
    L17:
        if (AbstractC0671Pj.m1352l(r02) == 0.0f) goto L27;
        if (canScrollVertically(1) == false) goto L21;
        this.mBottomGlow.onRelease();
    L25:
        invalidate();
        goto L27
    L21:
        float r43 = AbstractC0671Pj.m1355t(this.mBottomGlow, r42, 1.0f - r52);
        if (AbstractC0671Pj.m1352l(this.mBottomGlow) != 0.0f) goto L24;
        this.mBottomGlow.onRelease();
    L24:
        r1 = r43;
        goto L25
    L5:
        if (AbstractC0671Pj.m1352l(r0) == 0.0f) goto L14;
        if (canScrollVertically(-1) == false) goto L9;
        this.mTopGlow.onRelease();
    L13:
        invalidate();
        goto L27
    L9:
        float r44 = -AbstractC0671Pj.m1355t(this.mTopGlow, -r42, r52);
        if (AbstractC0671Pj.m1352l(this.mTopGlow) != 0.0f) goto L12;
        this.mTopGlow.onRelease();
    L12:
        r1 = r44;
        goto L13
    }

    private void requestChildOnScreen(View r12, View r13) {
        if (r13 == null) goto L4;
        View r0 = r13;
    L5:
        this.mTempRect.set(0, 0, r0.getWidth(), r0.getHeight());
        ViewGroup.LayoutParams r02 = r0.getLayoutParams();
        if ((r02 instanceof C2431qv) == false) goto L10;
        C2431qv r03 = (C2431qv) r02;
        if (r03.f8528c == true) goto L10;
        Rect r04 = r03.f8527b;
        Rect r1 = this.mTempRect;
        r1.left -= r04.left;
        r1.right += r04.right;
        r1.top -= r04.top;
        r1.bottom += r04.bottom;
    L10:
        if (r13 == null) goto L12;
        offsetDescendantRectToMyCoords(r13, this.mTempRect);
        offsetRectIntoDescendantCoords(r12, this.mTempRect);
    L12:
        AbstractC1160i r5 = this.mLayout;
        Rect r8 = this.mTempRect;
        boolean r9 = !this.mFirstLayoutComplete;
        if (r13 != null) goto L16;
        boolean r10 = true;
    L17:
        r5.requestChildRectangleOnScreen(this, r12, r8, r9, r10);
        return;
    L16:
        r10 = false;
        goto L17
    L4:
        r0 = r12;
        goto L5
    }

    private void resetFocusInfo() {
        C0038Av r0 = this.mState;
        r0.f88m = -1;
        r0.f87l = -1;
        r0.f89n = -1;
    }

    private void resetScroll() {
        VelocityTracker r0 = this.mVelocityTracker;
        if (r0 == null) goto L5;
        r0.clear();
    L5:
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        AbstractC1166o r1 = null;
        if (this.mPreserveFocusAfterLayout == true) goto L5;
    L9:
        View r0 = null;
    L10:
        if (r0 == null) goto L13;
        r1 = findContainingViewHolder(r0);
    L13:
        if (r1 != null) goto L16;
        resetFocusInfo();
        return;
    L16:
        C0038Av r02 = this.mState;
        if (this.mAdapter.hasStableIds() == false) goto L19;
        long r2 = r1.getItemId();
    L20:
        r02.f88m = r2;
        C0038Av r03 = this.mState;
        if (this.mDataSetHasChangedAfterLayout == false) goto L24;
        int r22 = -1;
    L27:
        r03.f87l = r22;
        this.mState.f89n = getDeepestFocusedViewWithId(r1.itemView);
        return;
    L24:
        if (r1.isRemoved() == false) goto L26;
        r22 = r1.mOldPosition;
        goto L27
    L26:
        r22 = r1.getAbsoluteAdapterPosition();
        goto L27
    L19:
        r2 = -1;
        goto L20
    L5:
        if (hasFocus() == false) goto L9;
        if (this.mAdapter == null) goto L9;
        r0 = getFocusedChild();
        goto L10
    }

    private void setAdapterInternal(AbstractC1158g r7, boolean r8, boolean r9) {
        AbstractC1158g r0 = this.mAdapter;
        if (r0 == null) goto L5;
        r0.unregisterAdapterDataObserver(this.mObserver);
        this.mAdapter.onDetachedFromRecyclerView(this);
    L5:
        if (r8 == false) goto L7;
        if (r9 == true) goto L7;
    L8:
        C1152a r92 = this.mAdapterHelper;
        r92.m2226k(r92.f4012b);
        r92.m2226k(r92.f4013c);
        int r02 = 0;
        r92.f4016f = 0;
        AbstractC1158g r93 = this.mAdapter;
        this.mAdapter = r7;
        if (r7 == null) goto L11;
        r7.registerAdapterDataObserver(this.mObserver);
        r7.onAttachedToRecyclerView(this);
    L11:
        AbstractC1160i r72 = this.mLayout;
        if (r72 == null) goto L14;
        r72.onAdapterChanged(r93, this.mAdapter);
    L14:
        C1161j r73 = this.mRecycler;
        AbstractC1158g r1 = this.mAdapter;
        r73.f4039a.clear();
        r73.m2261h();
        r73.m2260g(r93, true);
        C2689wv r3 = r73.m2257c();
        if (r93 == null) goto L17;
        r3.f9257b--;
    L17:
        if (r8 == false) goto L19;
    L28:
        if (r1 == null) goto L30;
        r3.f9257b++;
    L31:
        r73.m2259f();
        this.mState.f81f = true;
        return;
    L30:
        r3.getClass();
        goto L31
    L19:
        if (r3.f9257b != 0) goto L28;
        SparseArray r82 = r3.f9256a;
    L22:
        if (r02 >= r82.size()) goto L28;
        C2646vv r94 = (C2646vv) r82.valueAt(r02);
        Iterator r4 = r94.f9158a.iterator();
    L25:
        if (r4.hasNext() == false) goto L27;
        AbstractC0671Pj.m1345c(((AbstractC1166o) r4.next()).itemView);
        goto L25
    L27:
        r94.f9158a.clear();
        r02 = r02 + 1;
    L7:
        removeAndRecycleViews();
        goto L8
    }

    public static void setDebugAssertionsEnabled(boolean r0) {
        sDebugAssertionsEnabled = r0;
    }

    public static void setVerboseLoggingEnabled(boolean r0) {
        sVerboseLoggingEnabled = r0;
    }

    private boolean shouldAbsorb(EdgeEffect r2, int r3, int r4) {
        if (r3 <= 0) goto L6;
        return true;
    L6:
        if (getSplineFlingDistance(-r3) >= (AbstractC0671Pj.m1352l(r2) * r4)) goto L8;
        return true;
    L8:
        return false;
    }

    private boolean stopGlowAnimations(MotionEvent r8) {
        EdgeEffect r0 = this.mLeftGlow;
        if (r0 != null) goto L5;
    L9:
        boolean r02 = false;
    L10:
        EdgeEffect r5 = this.mRightGlow;
        if (r5 != null) goto L13;
    L17:
        EdgeEffect r52 = this.mTopGlow;
        if (r52 != null) goto L20;
    L24:
        EdgeEffect r2 = this.mBottomGlow;
        if (r2 != null) goto L27;
    L32:
        return r02;
    L27:
        if (AbstractC0671Pj.m1352l(r2) == 0.0f) goto L32;
        if (canScrollVertically(1) == true) goto L32;
        AbstractC0671Pj.m1355t(this.mBottomGlow, 0.0f, 1.0f - (r8.getX() / getWidth()));
        return true;
    L20:
        if (AbstractC0671Pj.m1352l(r52) == 0.0f) goto L24;
        if (canScrollVertically(-1) == true) goto L24;
        AbstractC0671Pj.m1355t(this.mTopGlow, 0.0f, r8.getX() / getWidth());
        r02 = true;
        goto L24
    L13:
        if (AbstractC0671Pj.m1352l(r5) == 0.0f) goto L17;
        if (canScrollHorizontally(1) == true) goto L17;
        AbstractC0671Pj.m1355t(this.mRightGlow, 0.0f, r8.getY() / getHeight());
        r02 = true;
        goto L17
    L5:
        if (AbstractC0671Pj.m1352l(r0) == 0.0f) goto L9;
        if (canScrollHorizontally(-1) == true) goto L9;
        AbstractC0671Pj.m1355t(this.mLeftGlow, 0.0f, 1.0f - (r8.getY() / getHeight()));
        r02 = true;
        goto L10
    }

    private void stopScrollersInternal() {
        RunnableC1165n r0 = this.mViewFlinger;
        r0.f4060g.removeCallbacks(r0);
        r0.f4056c.abortAnimation();
        AbstractC1160i r02 = this.mLayout;
        if (r02 == null) goto L6;
        r02.stopSmoothScroller();
        return;
    }

    public void absorbGlows(int r3, int r4) {
        if (r3 >= 0) goto L6;
        ensureLeftGlow();
        if (this.mLeftGlow.isFinished() == false) goto L10;
        this.mLeftGlow.onAbsorb(-r3);
    L10:
        if (r4 >= 0) goto L14;
        ensureTopGlow();
        if (this.mTopGlow.isFinished() == false) goto L18;
        this.mTopGlow.onAbsorb(-r4);
    L18:
        if (r3 != 0) goto L22;
        if (r4 != 0) goto L22;
        return;
    L22:
        WeakHashMap r32 = AbstractC2185lE.f7617a;
        postInvalidateOnAnimation();
        return;
    L14:
        if (r4 <= 0) goto L18;
        ensureBottomGlow();
        if (this.mBottomGlow.isFinished() == false) goto L18;
        this.mBottomGlow.onAbsorb(r4);
        goto L18
    L6:
        if (r3 <= 0) goto L10;
        ensureRightGlow();
        if (this.mRightGlow.isFinished() == false) goto L10;
        this.mRightGlow.onAbsorb(r3);
        goto L10
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> r2, int r3, int r4) {
        AbstractC1160i r0 = this.mLayout;
        if (r0 != null) goto L5;
    L8:
        super.addFocusables(r2, r3, r4);
        return;
    L5:
        if (r0.onAddFocusables(this, r2, r3, r4) == false) goto L8;
    }

    public void addItemDecoration(AbstractC2251mv r3, int r4) {
        AbstractC1160i r0 = this.mLayout;
        if (r0 == null) goto L6;
        r0.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
    L6:
        if (this.mItemDecorations.isEmpty() == false) goto L8;
        setWillNotDraw(false);
    L8:
        if (r4 >= 0) goto L10;
        this.mItemDecorations.add(r3);
    L11:
        markItemDecorInsetsDirty();
        requestLayout();
        return;
    L10:
        this.mItemDecorations.add(r4, r3);
        goto L11
    }

    public void addOnChildAttachStateChangeListener(InterfaceC2474rv r2) {
        if (this.mOnChildAttachStateListeners != null) goto L5;
        this.mOnChildAttachStateListeners = new ArrayList();
    L5:
        this.mOnChildAttachStateListeners.add(r2);
    }

    public void addOnItemTouchListener(InterfaceC2560tv r2) {
        this.mOnItemTouchListeners.add(r2);
    }

    public void addOnScrollListener(AbstractC2603uv r2) {
        if (this.mScrollListeners != null) goto L5;
        this.mScrollListeners = new ArrayList();
    L5:
        this.mScrollListeners.add(r2);
    }

    public void addRecyclerListener(InterfaceC2732xv r3) {
        if (r3 == null) goto L4;
        boolean r0 = true;
    L5:
        AbstractC1293cr.m2545d("'listener' arg cannot be null.", r0);
        this.mRecyclerListeners.add(r3);
        return;
    L4:
        r0 = false;
        goto L5
    }

    public void animateAppearance(AbstractC1166o r8, C2208lv r9, C2208lv r10) {
        r8.setIsRecyclable(false);
        C1261cd r1 = (C1261cd) this.mItemAnimator;
        if (r9 == null) goto L11;
        r1.getClass();
        int r3 = r9.f7695a;
        int r5 = r10.f7695a;
        if (r3 == r5) goto L7;
    L10:
        boolean r82 = r1.m2393g(r8, r3, r9.f7696b, r5, r10.f7696b);
    L12:
        if (r82 == false) goto L15;
        postAnimationRunner();
        return;
    L15:
        return;
    L7:
        if (r9.f7696b != r10.f7696b) goto L10;
    L11:
        r1.m2397l(r8);
        r8.itemView.setAlpha(0.0f);
        r1.f4278i.add(r8);
        r82 = true;
        goto L12
    }

    public void animateDisappearance(AbstractC1166o r8, C2208lv r9, C2208lv r10) {
        addAnimatingView(r8);
        r8.setIsRecyclable(false);
        C1261cd r1 = (C1261cd) this.mItemAnimator;
        r1.getClass();
        int r3 = r9.f7695a;
        int r4 = r9.f7696b;
        View r92 = r8.itemView;
        if (r10 != null) goto L6;
        int r0 = r92.getLeft();
    L5:
        int r5 = r0;
        if (r10 != null) goto L10;
        int r102 = r92.getTop();
    L9:
        int r6 = r102;
        if (r8.isRemoved() == true) goto L18;
        if (r3 != r5) goto L17;
        if (r4 == r6) goto L18;
    L17:
        r92.layout(r5, r6, r92.getWidth() + r5, r92.getHeight() + r6);
        boolean r82 = r1.m2393g(r8, r3, r4, r5, r6);
    L19:
        if (r82 == false) goto L22;
        postAnimationRunner();
        return;
    L22:
        return;
    L18:
        r1.m2397l(r8);
        r1.f4277h.add(r8);
        r82 = true;
        goto L19
    L10:
        r102 = r10.f7696b;
        goto L9
    L6:
        r0 = r10.f7695a;
        goto L5
    }

    public void assertInLayoutOrScroll(String r3) {
        if (isComputingLayout() == true) goto L9;
        if (r3 == null) goto L6;
        StringBuilder r1 = new StringBuilder();
        r1.append(r3);
        throw new IllegalStateException(AbstractC0213Ey.m406d(this, r1));
    L6:
        throw new IllegalStateException(AbstractC0213Ey.m406d(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
    }

    public void assertNotInLayoutOrScroll(String r3) {
        if (isComputingLayout() == false) goto L10;
        if (r3 != null) goto L8;
        throw new IllegalStateException(AbstractC0213Ey.m406d(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
    L8:
        throw new IllegalStateException(r3);
    L10:
        if (this.mDispatchScrollCounter <= 0) goto L13;
        new IllegalStateException(AbstractC0213Ey.m406d(this, new StringBuilder("")));
        return;
    }

    public boolean canReuseUpdatedViewHolder(AbstractC1166o r3) {
        AbstractC1159h r0 = this.mItemAnimator;
        if (r0 == null) goto L13;
        C1261cd r02 = (C1261cd) r0;
        if (r3.getUnmodifiedPayloads().isEmpty() == true) goto L7;
        return true;
    L7:
        if (r02.f4276g == true) goto L9;
        return true;
    L9:
        if (r3.isInvalid() == true) goto L17;
        return false;
    L17:
        return true;
    L13:
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams r2) {
        if ((r2 instanceof C2431qv) == true) goto L5;
        return false;
    L5:
        if (this.mLayout.checkLayoutParams((C2431qv) r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public void clearOldPositions() {
        int r0 = this.mChildHelper.m2235h();
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L8;
        AbstractC1166o r3 = getChildViewHolderInt(this.mChildHelper.m2234g(r2));
        if (r3.shouldIgnore() == true) goto L7;
        r3.clearOldPosition();
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        C1161j r02 = this.mRecycler;
        ArrayList r22 = r02.f4039a;
        ArrayList r32 = r02.f4041c;
        int r4 = r32.size();
        int r5 = 0;
    L9:
        if (r5 >= r4) goto L11;
        ((AbstractC1166o) r32.get(r5)).clearOldPosition();
        r5 = r5 + 1;
        goto L9
    L11:
        int r33 = r22.size();
        int r42 = 0;
    L12:
        if (r42 >= r33) goto L14;
        ((AbstractC1166o) r22.get(r42)).clearOldPosition();
        r42 = r42 + 1;
        goto L12
    L14:
        ArrayList r23 = r02.f4040b;
        if (r23 == null) goto L19;
        int r24 = r23.size();
    L17:
        if (r1 >= r24) goto L26;
        ((AbstractC1166o) r02.f4040b.get(r1)).clearOldPosition();
        r1 = r1 + 1;
        goto L17
    L26:
        return;
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<InterfaceC2474rv> r0 = this.mOnChildAttachStateListeners;
        if (r0 == null) goto L6;
        r0.clear();
        return;
    }

    public void clearOnScrollListeners() {
        List<AbstractC2603uv> r0 = this.mScrollListeners;
        if (r0 == null) goto L6;
        r0.clear();
        return;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        AbstractC1160i r0 = this.mLayout;
        if (r0 != null) goto L6;
        return 0;
    L6:
        if (r0.canScrollHorizontally() == true) goto L8;
        return 0;
    L8:
        return this.mLayout.computeHorizontalScrollExtent(this.mState);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        AbstractC1160i r0 = this.mLayout;
        if (r0 != null) goto L6;
        return 0;
    L6:
        if (r0.canScrollHorizontally() == true) goto L8;
        return 0;
    L8:
        return this.mLayout.computeHorizontalScrollOffset(this.mState);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        AbstractC1160i r0 = this.mLayout;
        if (r0 != null) goto L6;
        return 0;
    L6:
        if (r0.canScrollHorizontally() == true) goto L8;
        return 0;
    L8:
        return this.mLayout.computeHorizontalScrollRange(this.mState);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        AbstractC1160i r0 = this.mLayout;
        if (r0 != null) goto L6;
        return 0;
    L6:
        if (r0.canScrollVertically() == true) goto L8;
        return 0;
    L8:
        return this.mLayout.computeVerticalScrollExtent(this.mState);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        AbstractC1160i r0 = this.mLayout;
        if (r0 != null) goto L6;
        return 0;
    L6:
        if (r0.canScrollVertically() == true) goto L8;
        return 0;
    L8:
        return this.mLayout.computeVerticalScrollOffset(this.mState);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        AbstractC1160i r0 = this.mLayout;
        if (r0 != null) goto L6;
        return 0;
    L6:
        if (r0.canScrollVertically() == true) goto L8;
        return 0;
    L8:
        return this.mLayout.computeVerticalScrollRange(this.mState);
    }

    public void considerReleasingGlowsOnScroll(int r3, int r4) {
        EdgeEffect r0 = this.mLeftGlow;
        if (r0 != null) goto L5;
    L8:
        boolean r02 = false;
    L9:
        EdgeEffect r1 = this.mRightGlow;
        if (r1 != null) goto L12;
    L15:
        EdgeEffect r32 = this.mTopGlow;
        if (r32 != null) goto L18;
    L21:
        EdgeEffect r33 = this.mBottomGlow;
        if (r33 != null) goto L24;
    L27:
        if (r02 == false) goto L30;
        WeakHashMap r34 = AbstractC2185lE.f7617a;
        postInvalidateOnAnimation();
        return;
    L30:
        return;
    L24:
        if (r33.isFinished() == true) goto L27;
        if (r4 >= 0) goto L27;
        this.mBottomGlow.onRelease();
        r02 = r02 | this.mBottomGlow.isFinished();
        goto L27
    L18:
        if (r32.isFinished() == true) goto L21;
        if (r4 <= 0) goto L21;
        this.mTopGlow.onRelease();
        r02 = r02 | this.mTopGlow.isFinished();
        goto L21
    L12:
        if (r1.isFinished() == true) goto L15;
        if (r3 >= 0) goto L15;
        this.mRightGlow.onRelease();
        r02 = r02 | this.mRightGlow.isFinished();
        goto L15
    L5:
        if (r0.isFinished() == true) goto L8;
        if (r3 <= 0) goto L8;
        this.mLeftGlow.onRelease();
        r02 = this.mLeftGlow.isFinished();
        goto L9
    }

    public int consumeFlingInHorizontalStretch(int r4) {
        return consumeFlingInStretch(r4, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int r4) {
        return consumeFlingInStretch(r4, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (this.mFirstLayoutComplete == true) goto L5;
    L27:
        int r0 = AbstractC2792zB.f9460a;
        Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        return;
    L5:
        if (this.mDataSetHasChangedAfterLayout == true) goto L27;
        if (this.mAdapterHelper.m2222g() == false) goto L30;
        C1152a r02 = this.mAdapterHelper;
        int r2 = r02.f4016f;
        if ((r2 & 4) == 0) goto L24;
        if ((r2 & 11) != 0) goto L24;
        int r03 = AbstractC2792zB.f9460a;
        Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mAdapterHelper.m2225j();
        if (this.mLayoutWasDefered == false) goto L18;
    L21:
        stopInterceptRequestLayout(true);
        onExitLayoutOrScroll();
        Trace.endSection();
        return;
    L18:
        if (hasUpdatedView() == false) goto L20;
        dispatchLayout();
        goto L21
    L20:
        this.mAdapterHelper.m2217b();
    L24:
        if (r02.m2222g() == false) goto L29;
        int r04 = AbstractC2792zB.f9460a;
        Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        return;
    L29:
        return;
    }

    public void defaultOnMeasure(int r3, int r4) {
        int r0 = getPaddingLeft();
        int r1 = getPaddingRight() + r0;
        WeakHashMap r02 = AbstractC2185lE.f7617a;
        int r32 = AbstractC1160i.chooseSize(r3, r1, getMinimumWidth());
        int r03 = getPaddingTop();
        setMeasuredDimension(r32, AbstractC1160i.chooseSize(r4, getPaddingBottom() + r03, getMinimumHeight()));
    }

    public void dispatchChildAttached(View r3) {
        AbstractC1166o r0 = getChildViewHolderInt(r3);
        onChildAttachedToWindow(r3);
        AbstractC1158g r1 = this.mAdapter;
        if (r1 == null) goto L6;
        if (r0 == null) goto L6;
        r1.onViewAttachedToWindow(r0);
    L6:
        List<InterfaceC2474rv> r02 = this.mOnChildAttachStateListeners;
        if (r02 == null) goto L11;
        int r03 = r02.size() - 1;
    L9:
        if (r03 < 0) goto L13;
        this.mOnChildAttachStateListeners.get(r03).onChildViewAttachedToWindow(r3);
        r03 = r03 - 1;
        goto L9
    L13:
        return;
    }

    public void dispatchChildDetached(View r3) {
        AbstractC1166o r0 = getChildViewHolderInt(r3);
        onChildDetachedFromWindow(r3);
        AbstractC1158g r1 = this.mAdapter;
        if (r1 == null) goto L6;
        if (r0 == null) goto L6;
        r1.onViewDetachedFromWindow(r0);
    L6:
        List<InterfaceC2474rv> r02 = this.mOnChildAttachStateListeners;
        if (r02 == null) goto L11;
        int r03 = r02.size() - 1;
    L9:
        if (r03 < 0) goto L13;
        this.mOnChildAttachStateListeners.get(r03).onChildViewDetachedFromWindow(r3);
        r03 = r03 - 1;
        goto L9
    L13:
        return;
    }

    public void dispatchLayout() {
        if (this.mAdapter != null) goto L6;
        return;
    L6:
        if (this.mLayout != null) goto L8;
        return;
    L8:
        this.mState.f84i = false;
        if (this.mLastAutoMeasureSkippedDueToExact == true) goto L11;
    L15:
        boolean r0 = false;
    L16:
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f79d != 1) goto L19;
        dispatchLayoutStep1();
        this.mLayout.setExactMeasureSpecsFrom(this);
        dispatchLayoutStep2();
    L32:
        dispatchLayoutStep3();
        return;
    L19:
        C1152a r1 = this.mAdapterHelper;
        if (r1.f4013c.isEmpty() == false) goto L22;
    L24:
        if (r0 == false) goto L26;
    L31:
        this.mLayout.setExactMeasureSpecsFrom(this);
        dispatchLayoutStep2();
        goto L32
    L26:
        if (this.mLayout.getWidth() != getWidth()) goto L31;
        if (this.mLayout.getHeight() != getHeight()) goto L31;
        this.mLayout.setExactMeasureSpecsFrom(this);
        goto L32
    L22:
        if (r1.f4012b.isEmpty() == true) goto L24;
    L11:
        if (this.mLastAutoMeasureNonExactMeasuredWidth == getWidth()) goto L13;
    L14:
        r0 = true;
        goto L16
    L13:
        if (this.mLastAutoMeasureNonExactMeasuredHeight == getHeight()) goto L15;
        goto L14
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float r2, float r3, boolean r4) {
        return getScrollingChildHelper().m592a(r2, r3, r4);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float r2, float r3) {
        return getScrollingChildHelper().m593b(r2, r3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
        return getScrollingChildHelper().m594c(r7, r8, r9, r10, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13) {
        return getScrollingChildHelper().m595d(r9, r10, r11, r12, r13, 0, null);
    }

    public void dispatchOnScrollStateChanged(int r3) {
        AbstractC1160i r0 = this.mLayout;
        if (r0 == null) goto L5;
        r0.onScrollStateChanged(r3);
    L5:
        onScrollStateChanged(r3);
        AbstractC2603uv r02 = this.mScrollListener;
        if (r02 == null) goto L8;
        r02.onScrollStateChanged(this, r3);
    L8:
        List<AbstractC2603uv> r03 = this.mScrollListeners;
        if (r03 == null) goto L13;
        int r04 = r03.size() - 1;
    L11:
        if (r04 < 0) goto L15;
        this.mScrollListeners.get(r04).onScrollStateChanged(this, r3);
        r04 = r04 - 1;
        goto L11
    L15:
        return;
    }

    public void dispatchOnScrolled(int r5, int r6) {
        this.mDispatchScrollCounter++;
        int r0 = getScrollX();
        int r1 = getScrollY();
        onScrollChanged(r0, r1, r0 - r5, r1 - r6);
        onScrolled(r5, r6);
        AbstractC2603uv r02 = this.mScrollListener;
        if (r02 == null) goto L5;
        r02.onScrolled(this, r5, r6);
    L5:
        List<AbstractC2603uv> r03 = this.mScrollListeners;
        if (r03 == null) goto L10;
        int r04 = r03.size() - 1;
    L8:
        if (r04 < 0) goto L10;
        this.mScrollListeners.get(r04).onScrolled(this, r5, r6);
        r04 = r04 - 1;
    L10:
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int r0 = this.mPendingAccessibilityImportanceChange.size() - 1;
    L3:
        if (r0 < 0) goto L13;
        AbstractC1166o r1 = this.mPendingAccessibilityImportanceChange.get(r0);
        if (r1.itemView.getParent() != this) goto L12;
        if (r1.shouldIgnore() == true) goto L12;
        int r2 = r1.mPendingAccessibilityState;
        if (r2 == (-1)) goto L12;
        View r4 = r1.itemView;
        WeakHashMap r5 = AbstractC2185lE.f7617a;
        r4.setImportantForAccessibility(r2);
        r1.mPendingAccessibilityState = -1;
    L12:
        r0 = r0 - 1;
        goto L3
    L13:
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent r1) {
        onPopulateAccessibilityEvent(r1);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> r1) {
        dispatchThawSelfOnly(r1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> r1) {
        dispatchFreezeSelfOnly(r1);
    }

    @Override // android.view.View
    public void draw(Canvas r8) {
        super.draw(r8);
        int r0 = this.mItemDecorations.size();
        boolean r1 = false;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        this.mItemDecorations.get(r2).onDrawOver(r8, this, this.mState);
        r2 = r2 + 1;
        goto L3
    L5:
        EdgeEffect r02 = this.mLeftGlow;
        boolean r22 = true;
        if (r02 != null) goto L8;
    L20:
        boolean r3 = false;
    L21:
        EdgeEffect r03 = this.mTopGlow;
        if (r03 != null) goto L24;
    L35:
        EdgeEffect r04 = this.mRightGlow;
        if (r04 != null) goto L38;
    L50:
        EdgeEffect r05 = this.mBottomGlow;
        if (r05 != null) goto L53;
    L64:
        if (r3 == false) goto L66;
    L72:
        r22 = r3;
    L73:
        if (r22 == false) goto L77;
        WeakHashMap r82 = AbstractC2185lE.f7617a;
        postInvalidateOnAnimation();
        return;
    L77:
        return;
    L66:
        if (this.mItemAnimator == null) goto L72;
        if (this.mItemDecorations.size() <= 0) goto L72;
        if (this.mItemAnimator.mo2250f() == false) goto L72;
    L53:
        if (r05.isFinished() == true) goto L64;
        int r06 = r8.save();
        r8.rotate(180.0f);
        if (this.mClipToPadding == false) goto L57;
        float r4 = getPaddingRight() + (-getWidth());
        int r5 = -getHeight();
        r8.translate(r4, getPaddingBottom() + r5);
    L58:
        EdgeEffect r42 = this.mBottomGlow;
        if (r42 != null) goto L61;
    L63:
        r3 = r3 | r1;
        r8.restoreToCount(r06);
        goto L64
    L61:
        if (r42.draw(r8) == false) goto L63;
        r1 = true;
        goto L63
    L57:
        r8.translate(-getWidth(), -getHeight());
        goto L58
    L38:
        if (r04.isFinished() == true) goto L50;
        int r07 = r8.save();
        int r43 = getWidth();
        if (this.mClipToPadding == false) goto L42;
        int r52 = getPaddingTop();
    L43:
        r8.rotate(90.0f);
        r8.translate(r52, -r43);
        EdgeEffect r44 = this.mRightGlow;
        if (r44 != null) goto L46;
    L48:
        boolean r45 = false;
    L49:
        r3 = r3 | r45;
        r8.restoreToCount(r07);
        goto L50
    L46:
        if (r44.draw(r8) == false) goto L48;
        r45 = true;
        goto L49
    L42:
        r52 = 0;
        goto L43
    L24:
        if (r03.isFinished() == true) goto L35;
        int r08 = r8.save();
        if (this.mClipToPadding == false) goto L28;
        r8.translate(getPaddingLeft(), getPaddingTop());
    L28:
        EdgeEffect r46 = this.mTopGlow;
        if (r46 != null) goto L31;
    L33:
        boolean r47 = false;
    L34:
        r3 = r3 | r47;
        r8.restoreToCount(r08);
        goto L35
    L31:
        if (r46.draw(r8) == false) goto L33;
        r47 = true;
        goto L34
    L8:
        if (r02.isFinished() == true) goto L20;
        int r09 = r8.save();
        if (this.mClipToPadding == false) goto L12;
        int r32 = getPaddingBottom();
    L13:
        r8.rotate(270.0f);
        r8.translate((-getHeight()) + r32, 0.0f);
        EdgeEffect r33 = this.mLeftGlow;
        if (r33 != null) goto L16;
    L18:
        r3 = false;
    L19:
        r8.restoreToCount(r09);
        goto L21
    L16:
        if (r33.draw(r8) == false) goto L18;
        r3 = true;
        goto L19
    L12:
        r32 = 0;
        goto L13
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas r1, View r2, long r3) {
        return super.drawChild(r1, r2, r3);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow == null) goto L5;
        return;
    L5:
        ((C0081Bv) this.mEdgeEffectFactory).getClass();
        EdgeEffect r0 = new EdgeEffect(getContext());
        this.mBottomGlow = r0;
        if (this.mClipToPadding == false) goto L9;
        r0.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        return;
    L9:
        r0.setSize(getMeasuredWidth(), getMeasuredHeight());
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow == null) goto L5;
        return;
    L5:
        ((C0081Bv) this.mEdgeEffectFactory).getClass();
        EdgeEffect r0 = new EdgeEffect(getContext());
        this.mLeftGlow = r0;
        if (this.mClipToPadding == false) goto L9;
        r0.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        return;
    L9:
        r0.setSize(getMeasuredHeight(), getMeasuredWidth());
    }

    public void ensureRightGlow() {
        if (this.mRightGlow == null) goto L5;
        return;
    L5:
        ((C0081Bv) this.mEdgeEffectFactory).getClass();
        EdgeEffect r0 = new EdgeEffect(getContext());
        this.mRightGlow = r0;
        if (this.mClipToPadding == false) goto L9;
        r0.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        return;
    L9:
        r0.setSize(getMeasuredHeight(), getMeasuredWidth());
    }

    public void ensureTopGlow() {
        if (this.mTopGlow == null) goto L5;
        return;
    L5:
        ((C0081Bv) this.mEdgeEffectFactory).getClass();
        EdgeEffect r0 = new EdgeEffect(getContext());
        this.mTopGlow = r0;
        if (this.mClipToPadding == false) goto L9;
        r0.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        return;
    L9:
        r0.setSize(getMeasuredWidth(), getMeasuredHeight());
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(C0038Av r3) {
        if (getScrollState() != 2) goto L6;
        OverScroller r0 = this.mViewFlinger.f4056c;
        r0.getFinalX();
        r0.getCurrX();
        r3.getClass();
        r0.getFinalY();
        r0.getCurrY();
        return;
    L6:
        r3.getClass();
    }

    public View findChildViewUnder(float r6, float r7) {
        int r0 = this.mChildHelper.m2232e() - 1;
    L3:
        if (r0 < 0) goto L14;
        View r1 = this.mChildHelper.m2231d(r0);
        float r2 = r1.getTranslationX();
        float r3 = r1.getTranslationY();
        if (r6 < (r1.getLeft() + r2)) goto L13;
        if (r6 > (r1.getRight() + r2)) goto L13;
        if (r7 < (r1.getTop() + r3)) goto L13;
        if (r7 > (r1.getBottom() + r3)) goto L13;
        return r1;
    L13:
        r0 = r0 - 1;
        goto L3
    L14:
        return null;
    }

    public View findContainingItemView(View r3) {
        ViewParent r0 = r3.getParent();
    L3:
        if (r0 == null) goto L8;
        if (r0 == this) goto L8;
        if ((r0 instanceof View) == false) goto L8;
        r3 = r0;
        r0 = r3.getParent();
    L8:
        if (r0 != this) goto L10;
        return r3;
    L10:
        return null;
    }

    public AbstractC1166o findContainingViewHolder(View r1) {
        View r12 = findContainingItemView(r1);
        if (r12 != null) goto L7;
        return null;
    L7:
        return getChildViewHolder(r12);
    }

    public AbstractC1166o findViewHolderForAdapterPosition(int r6) {
        AbstractC1166o r1 = null;
        if (this.mDataSetHasChangedAfterLayout == false) goto L5;
        return null;
    L5:
        int r0 = this.mChildHelper.m2235h();
        int r2 = 0;
    L6:
        if (r2 >= r0) goto L18;
        AbstractC1166o r3 = getChildViewHolderInt(this.mChildHelper.m2234g(r2));
        if (r3 == null) goto L17;
        if (r3.isRemoved() == true) goto L17;
        if (getAdapterPositionInRecyclerView(r3) != r6) goto L17;
        C1153b r12 = this.mChildHelper;
        View r4 = r3.itemView;
        if (r12.f4019c.contains(r4) == false) goto L16;
        r1 = r3;
        goto L17
    L16:
        return r3;
    L17:
        r2 = r2 + 1;
        goto L6
    L18:
        return r1;
    }

    public AbstractC1166o findViewHolderForItemId(long r7) {
        AbstractC1158g r0 = this.mAdapter;
        AbstractC1166o r1 = null;
        if (r0 != null) goto L5;
    L20:
        return r1;
    L5:
        if (r0.hasStableIds() == false) goto L20;
        int r02 = this.mChildHelper.m2235h();
        int r2 = 0;
    L8:
        if (r2 >= r02) goto L20;
        AbstractC1166o r3 = getChildViewHolderInt(this.mChildHelper.m2234g(r2));
        if (r3 == null) goto L19;
        if (r3.isRemoved() == true) goto L19;
        if (r3.getItemId() != r7) goto L19;
        C1153b r12 = this.mChildHelper;
        View r4 = r3.itemView;
        if (r12.f4019c.contains(r4) == false) goto L18;
        r1 = r3;
        goto L19
    L18:
        return r3;
    L19:
        r2 = r2 + 1;
        goto L8
    }

    public AbstractC1166o findViewHolderForLayoutPosition(int r2) {
        return findViewHolderForPosition(r2, false);
    }

    @Deprecated
    public AbstractC1166o findViewHolderForPosition(int r2) {
        return findViewHolderForPosition(r2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean fling(int r8, int r9) {
        AbstractC1160i r0 = this.mLayout;
        if (r0 != null) goto L6;
        return false;
    L6:
        if (this.mLayoutSuppressed == false) goto L8;
        return false;
    L8:
        int r02 = r0.canScrollHorizontally();
        boolean r2 = this.mLayout.canScrollVertically();
        if (r02 != 0) goto L11;
    L12:
        r8 = 0;
    L13:
        if (r2 == true) goto L15;
    L16:
        r9 = 0;
    L17:
        if (r8 != 0) goto L21;
        if (r9 != 0) goto L21;
        return false;
    L21:
        if (r8 == 0) goto L38;
        EdgeEffect r4 = this.mLeftGlow;
        if (r4 != null) goto L25;
    L31:
        EdgeEffect r42 = this.mRightGlow;
        if (r42 == null) goto L38;
        if (AbstractC0671Pj.m1352l(r42) == 0.0f) goto L38;
        if (shouldAbsorb(this.mRightGlow, r8, getWidth()) == true) goto L37;
    L30:
        int r43 = r8;
        r8 = 0;
    L39:
        if (r9 == 0) goto L56;
        EdgeEffect r5 = this.mTopGlow;
        if (r5 != null) goto L43;
    L49:
        EdgeEffect r52 = this.mBottomGlow;
        if (r52 == null) goto L56;
        if (AbstractC0671Pj.m1352l(r52) == 0.0f) goto L56;
        if (shouldAbsorb(this.mBottomGlow, r9, getHeight()) == true) goto L55;
    L48:
        int r3 = 0;
    L57:
        if (r43 != 0) goto L59;
        if (r9 != 0) goto L59;
    L61:
        if (r8 != 0) goto L68;
        if (r3 != 0) goto L68;
        if (r43 != 0) goto L67;
        if (r9 != 0) goto L67;
        return false;
    L67:
        return true;
    L68:
        float r92 = r8;
        float r44 = r3;
        if (dispatchNestedPreFling(r92, r44) == true) goto L85;
        if (r02 != 0) goto L74;
        if (r2 == true) goto L74;
        boolean r6 = false;
    L75:
        dispatchNestedFling(r92, r44, r6);
        AbstractC2517sv r93 = this.mOnFlingListener;
        if (r93 != null) goto L78;
    L80:
        if (r6 == false) goto L85;
        if (r2 == false) goto L83;
        r02 = (r02 == true ? 1 : 0) | 2;
    L83:
        startNestedScroll(r02, 1);
        int r94 = this.mMaxFlingVelocity;
        int r82 = Math.max(-r94, Math.min(r8, r94));
        int r95 = this.mMaxFlingVelocity;
        this.mViewFlinger.m2271a(r82, Math.max(-r95, Math.min(r3, r95)));
        return true;
    L78:
        if (r93.onFling(r8, r3) == false) goto L80;
        return true;
    L74:
        r6 = true;
    L85:
        return false;
    L59:
        int r53 = this.mMaxFlingVelocity;
        r43 = Math.max(-r53, Math.min(r43, r53));
        int r54 = this.mMaxFlingVelocity;
        r9 = Math.max(-r54, Math.min(r9, r54));
        this.mViewFlinger.m2271a(r43, r9);
        goto L61
    L55:
        this.mBottomGlow.onAbsorb(r9);
    L47:
        r9 = 0;
        goto L48
    L43:
        if (AbstractC0671Pj.m1352l(r5) == 0.0f) goto L49;
        int r55 = -r9;
        if (shouldAbsorb(this.mTopGlow, r55, getHeight()) == false) goto L48;
        this.mTopGlow.onAbsorb(r55);
    L56:
        r3 = r9;
        r9 = 0;
        goto L57
    L37:
        this.mRightGlow.onAbsorb(r8);
    L29:
        r8 = 0;
        goto L30
    L25:
        if (AbstractC0671Pj.m1352l(r4) == 0.0f) goto L31;
        int r56 = -r8;
        if (shouldAbsorb(this.mLeftGlow, r56, getWidth()) == false) goto L30;
        this.mLeftGlow.onAbsorb(r56);
    L38:
        r43 = 0;
        goto L39
    L15:
        if (Math.abs(r9) >= this.mMinFlingVelocity) goto L17;
    L11:
        if (Math.abs(r8) >= this.mMinFlingVelocity) goto L13;
        goto L12
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View r9, int r10) {
        View r0 = this.mLayout.onInterceptFocusSearch(r9, r10);
        if (r0 == null) goto L5;
        return r0;
    L5:
        boolean r1 = true;
        if (this.mAdapter != null) goto L8;
    L14:
        boolean r02 = false;
    L15:
        FocusFinder r3 = FocusFinder.getInstance();
        if (r02 == true) goto L18;
    L61:
        View r12 = r3.findNextFocus(this, r9, r10);
        if (r12 != null) goto L68;
        if (r02 == false) goto L68;
        consumePendingUpdateOperations();
        if (findContainingItemView(r9) != null) goto L67;
        return null;
    L67:
        startInterceptRequestLayout();
        View r03 = this.mLayout.onFocusSearchFailed(r9, r10, this.mRecycler, this.mState);
        stopInterceptRequestLayout(false);
    L69:
        if (r03 == null) goto L79;
        if (r03.hasFocusable() == true) goto L79;
        if (getFocusedChild() == null) goto L75;
        requestChildOnScreen(r03, null);
        return r9;
    L75:
        return super.focusSearch(r9, r10);
    L79:
        if (isPreferredNextFocus(r9, r03, r10) == false) goto L82;
        return r03;
    L82:
        return super.focusSearch(r9, r10);
    L68:
        r03 = r12;
        goto L69
    L18:
        if (r10 == 2) goto L21;
        if (r10 != 1) goto L61;
    L21:
        if (this.mLayout.canScrollVertically() == false) goto L32;
        if (r10 != 2) goto L24;
        int r04 = 130;
    L26:
        if (r3.findNextFocus(this, r9, r04) != null) goto L28;
        boolean r6 = true;
    L30:
        if (FORCE_ABS_FOCUS_SEARCH_DIRECTION == false) goto L33;
        r10 = r04;
    L33:
        if (r6 == false) goto L35;
    L55:
        if (r6 == false) goto L60;
        consumePendingUpdateOperations();
        if (findContainingItemView(r9) != null) goto L59;
        return null;
    L59:
        startInterceptRequestLayout();
        this.mLayout.onFocusSearchFailed(r9, r10, this.mRecycler, this.mState);
        stopInterceptRequestLayout(false);
    L60:
        r03 = r3.findNextFocus(this, r9, r10);
        goto L69
    L35:
        if (this.mLayout.canScrollHorizontally() == false) goto L55;
        if (this.mLayout.getLayoutDirection() != 1) goto L39;
        boolean r05 = true;
    L40:
        if (r10 != 2) goto L42;
        boolean r5 = true;
    L44:
        if ((r05 ^ r5) == false) goto L46;
        int r06 = 66;
    L48:
        if (r3.findNextFocus(this, r9, r06) == null) goto L52;
        r1 = false;
    L52:
        if (FORCE_ABS_FOCUS_SEARCH_DIRECTION == false) goto L54;
        r10 = r06;
    L54:
        r6 = r1;
        goto L55
    L46:
        r06 = 17;
        goto L48
    L42:
        r5 = false;
        goto L44
    L39:
        r05 = false;
        goto L40
    L28:
        r6 = false;
        goto L30
    L24:
        r04 = 33;
        goto L26
    L32:
        r6 = false;
        goto L33
    L8:
        if (this.mLayout == null) goto L14;
        if (isComputingLayout() == true) goto L14;
        if (this.mLayoutSuppressed == true) goto L14;
        r02 = true;
        goto L15
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC1160i r0 = this.mLayout;
        if (r0 == null) goto L7;
        return r0.generateDefaultLayoutParams();
    L7:
        throw new IllegalStateException(AbstractC0213Ey.m406d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet r3) {
        AbstractC1160i r0 = this.mLayout;
        if (r0 == null) goto L7;
        return r0.generateLayoutParams(getContext(), r3);
    L7:
        throw new IllegalStateException(AbstractC0213Ey.m406d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC1158g getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(AbstractC1166o r7) {
        if (r7.hasAnyOfTheFlags(524) == false) goto L5;
        return -1;
    L5:
        if (r7.isBound() == false) goto L47;
        C1152a r0 = this.mAdapterHelper;
        int r72 = r7.mPosition;
        ArrayList r02 = r0.f4012b;
        int r1 = r02.size();
        int r2 = 0;
    L8:
        if (r2 >= r1) goto L34;
        C1347e1 r3 = (C1347e1) r02.get(r2);
        int r4 = r3.f4841a;
        if (r4 == 1) goto L31;
        if (r4 != 2) goto L14;
        int r42 = r3.f4842b;
        if (r42 > r72) goto L33;
        int r32 = r3.f4844d;
        if ((r42 + r32) > r72) goto L48;
        r72 = r72 - r32;
        goto L33
    L48:
        return -1;
    L33:
        r2 = r2 + 1;
        goto L8
    L14:
        if (r4 != 8) goto L33;
        int r43 = r3.f4842b;
        if (r43 != r72) goto L19;
        r72 = r3.f4844d;
        goto L33
    L19:
        if (r43 >= r72) goto L22;
        r72 = r72 - 1;
    L22:
        if (r3.f4844d > r72) goto L33;
        r72 = r72 + 1;
        goto L33
    L31:
        if (r3.f4842b > r72) goto L33;
        r72 = r72 + r3.f4844d;
        goto L33
    L34:
        return r72;
    L47:
        return -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC1160i r0 = this.mLayout;
        if (r0 == null) goto L7;
        return r0.getBaseline();
    L7:
        return super.getBaseline();
    }

    public long getChangedHolderKey(AbstractC1166o r3) {
        if (this.mAdapter.hasStableIds() == false) goto L7;
        return r3.getItemId();
    L7:
        return r3.mPosition;
    }

    public int getChildAdapterPosition(View r1) {
        AbstractC1166o r12 = getChildViewHolderInt(r1);
        if (r12 != null) goto L5;
        return -1;
    L5:
        return r12.getAbsoluteAdapterPosition();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int r1, int r2) {
        return super.getChildDrawingOrder(r1, r2);
    }

    public long getChildItemId(View r4) {
        AbstractC1158g r0 = this.mAdapter;
        if (r0 != null) goto L5;
    L11:
        return -1;
    L5:
        if (r0.hasStableIds() == false) goto L11;
        AbstractC1166o r42 = getChildViewHolderInt(r4);
        if (r42 == null) goto L11;
        return r42.getItemId();
    }

    public int getChildLayoutPosition(View r1) {
        AbstractC1166o r12 = getChildViewHolderInt(r1);
        if (r12 != null) goto L5;
        return -1;
    L5:
        return r12.getLayoutPosition();
    }

    @Deprecated
    public int getChildPosition(View r1) {
        return getChildAdapterPosition(r1);
    }

    public AbstractC1166o getChildViewHolder(View r4) {
        ViewParent r0 = r4.getParent();
        if (r0 == null) goto L9;
        if (r0 == this) goto L9;
        throw new IllegalArgumentException("View " + r4 + " is not a direct child of " + this);
    L9:
        return getChildViewHolderInt(r4);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public C0210Ev getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View r1, Rect r2) {
        getDecoratedBoundsWithMarginsInt(r1, r2);
    }

    public AbstractC2117jv getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public AbstractC1159h getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View r9) {
        C2431qv r0 = (C2431qv) r9.getLayoutParams();
        boolean r1 = r0.f8528c;
        Rect r2 = r0.f8527b;
        if (r1 == true) goto L6;
    L11:
        return r2;
    L6:
        if (this.mState.f82g == true) goto L8;
    L12:
        r2.set(0, 0, 0, 0);
        int r3 = this.mItemDecorations.size();
        int r4 = 0;
    L13:
        if (r4 >= r3) goto L15;
        this.mTempRect.set(0, 0, 0, 0);
        this.mItemDecorations.get(r4).getItemOffsets(this.mTempRect, r9, this, this.mState);
        int r5 = r2.left;
        Rect r6 = this.mTempRect;
        r2.left = r5 + r6.left;
        r2.top += r6.top;
        r2.right += r6.right;
        r2.bottom += r6.bottom;
        r4 = r4 + 1;
        goto L13
    L15:
        r0.f8528c = false;
        return r2;
    L8:
        if (r0.f8526a.isUpdated() == true) goto L11;
        if (r0.f8526a.isInvalid() == false) goto L12;
        goto L11
    }

    public AbstractC2251mv getItemDecorationAt(int r4) {
        int r0 = getItemDecorationCount();
        if (r4 < 0) goto L8;
        if (r4 >= r0) goto L8;
        return this.mItemDecorations.get(r4);
    L8:
        throw new IndexOutOfBoundsException(r4 + " is an invalid index for size " + r0);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public AbstractC1160i getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK == true) goto L5;
        return 0;
    L5:
        return System.nanoTime();
    }

    public AbstractC2517sv getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public C2689wv getRecycledViewPool() {
        return this.mRecycler.m2257c();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m597f(0);
    }

    public boolean hasPendingAdapterUpdates() {
        if (this.mFirstLayoutComplete == true) goto L5;
        return true;
    L5:
        if (this.mDataSetHasChangedAfterLayout == false) goto L7;
        return true;
    L7:
        if (this.mAdapterHelper.m2222g() == true) goto L14;
        return false;
    L14:
        return true;
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new C1152a(new C1157f(this));
    }

    public void initFastScroller(StateListDrawable r11, Drawable r12, StateListDrawable r13, Drawable r14) {
        if (r11 == null) goto L9;
        if (r12 == null) goto L9;
        if (r13 == null) goto L9;
        if (r14 == null) goto L9;
        Resources r0 = getContext().getResources();
        new C1545ih(this, r11, r12, r13, r14, r0.getDimensionPixelSize(io.github.cherrywechat.R.dimen.fastscroll_default_thickness), r0.getDimensionPixelSize(io.github.cherrywechat.R.dimen.fastscroll_minimum_range), r0.getDimensionPixelOffset(io.github.cherrywechat.R.dimen.fastscroll_margin));
        return;
    L9:
        throw new IllegalArgumentException(AbstractC0213Ey.m406d(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) goto L5;
        return;
    L5:
        AbstractC1160i r0 = this.mLayout;
        if (r0 == null) goto L8;
        r0.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
    L8:
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager r0 = this.mAccessibilityManager;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.isEnabled() == false) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean isAnimating() {
        AbstractC1159h r0 = this.mItemAnimator;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.mo2250f() == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        if (this.mLayoutOrScrollCounter <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f992d;
    }

    public void jumpToPositionForSmoothScroller(int r2) {
        if (this.mLayout != null) goto L5;
        return;
    L5:
        setScrollState(2);
        this.mLayout.scrollToPosition(r2);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int r0 = this.mChildHelper.m2235h();
        int r1 = 0;
        int r2 = 0;
    L4:
        if (r2 >= r0) goto L6;
        ((C2431qv) this.mChildHelper.m2234g(r2).getLayoutParams()).f8528c = true;
        r2 = r2 + 1;
        goto L4
    L6:
        ArrayList r02 = this.mRecycler.f4041c;
        int r22 = r02.size();
    L7:
        if (r1 >= r22) goto L12;
        C2431qv r4 = (C2431qv) ((AbstractC1166o) r02.get(r1)).itemView.getLayoutParams();
        if (r4 == null) goto L11;
        r4.f8528c = true;
    L11:
        r1 = r1 + 1;
        goto L7
    }

    public void markKnownViewsInvalid() {
        int r0 = this.mChildHelper.m2235h();
        int r1 = 0;
        int r2 = 0;
    L4:
        if (r2 >= r0) goto L11;
        AbstractC1166o r4 = getChildViewHolderInt(this.mChildHelper.m2234g(r2));
        if (r4 == null) goto L10;
        if (r4.shouldIgnore() == true) goto L10;
        r4.addFlags(6);
    L10:
        r2 = r2 + 1;
        goto L4
    L11:
        markItemDecorInsetsDirty();
        C1161j r02 = this.mRecycler;
        ArrayList r22 = r02.f4041c;
        int r42 = r22.size();
    L12:
        if (r1 >= r42) goto L17;
        AbstractC1166o r5 = (AbstractC1166o) r22.get(r1);
        if (r5 == null) goto L16;
        r5.addFlags(6);
        r5.addChangePayload(null);
    L16:
        r1 = r1 + 1;
        goto L12
    L17:
        AbstractC1158g r12 = r02.f4046h.mAdapter;
        if (r12 != null) goto L20;
    L23:
        r02.m2261h();
        return;
    L20:
        if (r12.hasStableIds() == false) goto L23;
    }

    public void nestedScrollBy(int r3, int r4) {
        nestedScrollByInternal(r3, r4, null, 1);
    }

    public void offsetChildrenHorizontal(int r4) {
        int r0 = this.mChildHelper.m2232e();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        this.mChildHelper.m2231d(r1).offsetLeftAndRight(r4);
        r1 = r1 + 1;
        goto L3
    }

    public void offsetChildrenVertical(int r4) {
        int r0 = this.mChildHelper.m2232e();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        this.mChildHelper.m2231d(r1).offsetTopAndBottom(r4);
        r1 = r1 + 1;
        goto L3
    }

    public void offsetPositionRecordsForInsert(int r7, int r8) {
        int r0 = this.mChildHelper.m2235h();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L15;
        AbstractC1166o r3 = getChildViewHolderInt(this.mChildHelper.m2234g(r2));
        if (r3 == null) goto L14;
        if (r3.shouldIgnore() == true) goto L14;
        if (r3.mPosition < r7) goto L14;
        if (sVerboseLoggingEnabled == false) goto L13;
        r3.toString();
    L13:
        r3.offsetPosition(r8, false);
        this.mState.f81f = true;
    L14:
        r2 = r2 + 1;
        goto L3
    L15:
        ArrayList r02 = this.mRecycler.f4041c;
        int r22 = r02.size();
        int r32 = 0;
    L16:
        if (r32 >= r22) goto L26;
        AbstractC1166o r4 = (AbstractC1166o) r02.get(r32);
        if (r4 == null) goto L25;
        if (r4.mPosition < r7) goto L25;
        if (sVerboseLoggingEnabled == false) goto L24;
        r4.toString();
    L24:
        r4.offsetPosition(r8, false);
    L25:
        r32 = r32 + 1;
        goto L16
    L26:
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int r11, int r12) {
        int r0 = this.mChildHelper.m2235h();
        int r1 = -1;
        if (r11 >= r12) goto L5;
        int r3 = r11;
        int r4 = r12;
        int r5 = -1;
    L6:
        int r7 = 0;
    L7:
        if (r7 >= r0) goto L23;
        AbstractC1166o r8 = getChildViewHolderInt(this.mChildHelper.m2234g(r7));
        if (r8 == null) goto L22;
        int r9 = r8.mPosition;
        if (r9 < r3) goto L22;
        if (r9 > r4) goto L22;
        if (sVerboseLoggingEnabled == false) goto L18;
        r8.toString();
    L18:
        if (r8.mPosition != r11) goto L20;
        r8.offsetPosition(r12 - r11, false);
    L21:
        this.mState.f81f = true;
        goto L22
    L20:
        r8.offsetPosition(r5, false);
    L22:
        r7 = r7 + 1;
        goto L7
    L23:
        ArrayList r02 = this.mRecycler.f4041c;
        if (r11 >= r12) goto L26;
        int r2 = r11;
        int r32 = r12;
    L27:
        int r42 = r02.size();
        int r52 = 0;
    L28:
        if (r52 >= r42) goto L42;
        AbstractC1166o r72 = (AbstractC1166o) r02.get(r52);
        if (r72 == null) goto L41;
        int r82 = r72.mPosition;
        if (r82 < r2) goto L41;
        if (r82 > r32) goto L41;
        if (r82 != r11) goto L37;
        r72.offsetPosition(r12 - r11, false);
    L39:
        if (sVerboseLoggingEnabled == false) goto L41;
        r72.toString();
        goto L41
    L37:
        r72.offsetPosition(r1, false);
    L41:
        r52 = r52 + 1;
        goto L28
    L42:
        requestLayout();
        return;
    L26:
        r32 = r11;
        r1 = 1;
        r2 = r12;
        goto L27
    L5:
        r4 = r11;
        r3 = r12;
        r5 = 1;
        goto L6
    }

    public void offsetPositionRecordsForRemove(int r8, int r9, boolean r10) {
        int r0 = r8 + r9;
        int r1 = this.mChildHelper.m2235h();
        int r2 = 0;
    L4:
        if (r2 >= r1) goto L21;
        AbstractC1166o r4 = getChildViewHolderInt(this.mChildHelper.m2234g(r2));
        if (r4 == null) goto L20;
        if (r4.shouldIgnore() == true) goto L20;
        int r5 = r4.mPosition;
        if (r5 >= r0) goto L12;
        if (r5 < r8) goto L20;
        if (sVerboseLoggingEnabled == false) goto L19;
        r4.toString();
    L19:
        r4.flagRemovedAndOffsetPosition(r8 - 1, -r9, r10);
        this.mState.f81f = true;
        goto L20
    L12:
        if (sVerboseLoggingEnabled == false) goto L14;
        r4.toString();
    L14:
        r4.offsetPosition(-r9, r10);
        this.mState.f81f = true;
    L20:
        r2 = r2 + 1;
        goto L4
    L21:
        C1161j r12 = this.mRecycler;
        ArrayList r22 = r12.f4041c;
        int r42 = r22.size() - 1;
    L22:
        if (r42 < 0) goto L34;
        AbstractC1166o r3 = (AbstractC1166o) r22.get(r42);
        if (r3 == null) goto L33;
        int r52 = r3.mPosition;
        if (r52 >= r0) goto L28;
        if (r52 < r8) goto L33;
        r3.addFlags(8);
        r12.m2262i(r42);
        goto L33
    L28:
        if (sVerboseLoggingEnabled == false) goto L30;
        r3.toString();
    L30:
        r3.offsetPosition(-r9, r10);
    L33:
        r42 = r42 - 1;
        goto L22
    L34:
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean r1 = true;
        this.mIsAttached = true;
        if (this.mFirstLayoutComplete == true) goto L5;
    L7:
        r1 = false;
    L8:
        this.mFirstLayoutComplete = r1;
        this.mRecycler.m2259f();
        AbstractC1160i r12 = this.mLayout;
        if (r12 == null) goto L11;
        r12.dispatchAttachedToWindow(this);
    L11:
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK == false) goto L32;
        ThreadLocal r0 = RunnableC1155d.f4024e;
        RunnableC1155d r13 = (RunnableC1155d) r0.get();
        this.mGapWorker = r13;
        if (r13 != null) goto L23;
        RunnableC1155d r14 = new RunnableC1155d();
        r14.f4026a = new ArrayList();
        r14.f4029d = new ArrayList();
        this.mGapWorker = r14;
        WeakHashMap r15 = AbstractC2185lE.f7617a;
        Display r16 = getDisplay();
        if (isInEditMode() == true) goto L21;
        if (r16 == null) goto L21;
        float r17 = r16.getRefreshRate();
        if (r17 < 30.0f) goto L21;
    L22:
        RunnableC1155d r2 = this.mGapWorker;
        r2.f4028c = (long) (1.0E9f / r17);
        r0.set(r2);
    L21:
        r17 = 60.0f;
    L23:
        ArrayList r02 = this.mGapWorker.f4026a;
        if (sDebugAssertionsEnabled == true) goto L26;
    L30:
        r02.add(this);
        return;
    L26:
        if (r02.contains(this) == false) goto L30;
        throw new IllegalStateException("RecyclerView already present in worker list!");
    L32:
        return;
    L5:
        if (isLayoutRequested() == true) goto L7;
        goto L7
    }

    public void onChildAttachedToWindow(View r1) {
    }

    public void onChildDetachedFromWindow(View r1) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC1159h r0 = this.mItemAnimator;
        if (r0 == null) goto L5;
        r0.mo2249e();
    L5:
        stopScroll();
        int r02 = 0;
        this.mIsAttached = false;
        AbstractC1160i r1 = this.mLayout;
        if (r1 == null) goto L8;
        r1.dispatchDetachedFromWindow(this, this.mRecycler);
    L8:
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
    L10:
        if (C2408qE.f8442d.mo1935c() != null) goto L10;
        C1161j r12 = this.mRecycler;
        ArrayList r2 = r12.f4041c;
        int r3 = 0;
    L14:
        if (r3 >= r2.size()) goto L16;
        AbstractC0671Pj.m1345c(((AbstractC1166o) r2.get(r3)).itemView);
        r3 = r3 + 1;
        goto L14
    L16:
        r12.m2260g(r12.f4046h.mAdapter, false);
    L18:
        if (r02 >= getChildCount()) goto L32;
        int r13 = r02 + 1;
        View r03 = getChildAt(r02);
        if (r03 == null) goto L30;
        C0981Wt r32 = (C0981Wt) r03.getTag(io.github.cherrywechat.R.id.pooling_container_listener_holder_tag);
        if (r32 != null) goto L24;
        r32 = new C0981Wt();
        r03.setTag(io.github.cherrywechat.R.id.pooling_container_listener_holder_tag, r32);
    L24:
        ArrayList r04 = r32.f3064a;
        int r22 = AbstractC2496sa.m4976a0(r04);
        if ((-1) < r22) goto L27;
        r02 = r13;
        goto L18
    L27:
        r04.get(r22).getClass();
        throw new ClassCastException();
    L30:
        throw new IndexOutOfBoundsException();
    L32:
        if (ALLOW_THREAD_GAP_WORK == false) goto L49;
        RunnableC1155d r05 = this.mGapWorker;
        if (r05 == null) goto L50;
        boolean r06 = r05.f4026a.remove(this);
        if (sDebugAssertionsEnabled == false) goto L41;
        if (r06 == true) goto L41;
        throw new IllegalStateException("RecyclerView removal failed!");
    L41:
        this.mGapWorker = null;
        return;
    L50:
        return;
    }

    @Override // android.view.View
    public void onDraw(Canvas r5) {
        super.onDraw(r5);
        int r0 = this.mItemDecorations.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        this.mItemDecorations.get(r1).onDraw(r5, this, this.mState);
        r1 = r1 + 1;
        goto L3
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent r6) {
        if (this.mLayout != null) goto L6;
        return false;
    L6:
        if (this.mLayoutSuppressed == false) goto L9;
        return false;
    L9:
        if (r6.getAction() == 8) goto L11;
    L34:
        return false;
    L11:
        if ((r6.getSource() & 2) == 0) goto L21;
        if (this.mLayout.canScrollVertically() == false) goto L15;
        float r0 = -r6.getAxisValue(9);
    L17:
        if (this.mLayout.canScrollHorizontally() == false) goto L19;
        float r3 = r6.getAxisValue(10);
    L30:
        if (r0 == 0.0f) goto L32;
    L33:
        nestedScrollByInternal((int) (r3 * this.mScaledHorizontalScrollFactor), (int) (r0 * this.mScaledVerticalScrollFactor), r6, 1);
        goto L34
    L32:
        if (r3 == 0.0f) goto L34;
    L19:
        r3 = 0.0f;
        goto L30
    L15:
        r0 = 0.0f;
        goto L17
    L21:
        if ((r6.getSource() & 4194304) == 0) goto L28;
        float r02 = r6.getAxisValue(26);
        if (this.mLayout.canScrollVertically() == false) goto L26;
        r0 = -r02;
        goto L19
    L26:
        if (this.mLayout.canScrollHorizontally() == false) goto L28;
        r3 = r02;
        r0 = 0.0f;
    L28:
        r0 = 0.0f;
        r3 = 0.0f;
        goto L30
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent r9) {
        if (this.mLayoutSuppressed == false) goto L5;
        return false;
    L5:
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(r9) == false) goto L9;
        cancelScroll();
        return true;
    L9:
        AbstractC1160i r0 = this.mLayout;
        if (r0 != null) goto L12;
        return false;
    L12:
        boolean r02 = r0.canScrollHorizontally();
        boolean r3 = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker != null) goto L15;
        this.mVelocityTracker = VelocityTracker.obtain();
    L15:
        this.mVelocityTracker.addMovement(r9);
        int r4 = r9.getActionMasked();
        int r5 = r9.getActionIndex();
        if (r4 == 0) goto L48;
        if (r4 == 1) goto L46;
        if (r4 != 2) goto L20;
        int r42 = r9.findPointerIndex(this.mScrollPointerId);
        if (r42 >= 0) goto L32;
        return false;
    L32:
        int r52 = (int) (r9.getX(r42) + 0.5f);
        int r92 = (int) (r9.getY(r42) + 0.5f);
        if (this.mScrollState == 1) goto L60;
        int r43 = r52 - this.mInitialTouchX;
        int r6 = r92 - this.mInitialTouchY;
        if (r02 == true) goto L37;
    L39:
        boolean r03 = false;
    L40:
        if (r3 == true) goto L42;
    L44:
        if (r03 == false) goto L60;
        setScrollState(1);
        goto L60
    L42:
        if (Math.abs(r6) <= this.mTouchSlop) goto L44;
        this.mLastTouchY = r92;
        r03 = true;
        goto L44
    L37:
        if (Math.abs(r43) <= this.mTouchSlop) goto L39;
        this.mLastTouchX = r52;
        r03 = true;
    L60:
        if (this.mScrollState != 1) goto L62;
        return true;
    L62:
        return false;
    L20:
        if (r4 != 3) goto L22;
        cancelScroll();
        goto L60
    L22:
        if (r4 != 5) goto L24;
        this.mScrollPointerId = r9.getPointerId(r5);
        int r04 = (int) (r9.getX(r5) + 0.5f);
        this.mLastTouchX = r04;
        this.mInitialTouchX = r04;
        int r93 = (int) (r9.getY(r5) + 0.5f);
        this.mLastTouchY = r93;
        this.mInitialTouchY = r93;
        goto L60
    L24:
        if (r4 != 6) goto L60;
        onPointerUp(r9);
        goto L60
    L46:
        this.mVelocityTracker.clear();
        stopNestedScroll(0);
        goto L60
    L48:
        if (this.mIgnoreMotionEventTillDown == false) goto L50;
        this.mIgnoreMotionEventTillDown = false;
    L50:
        this.mScrollPointerId = r9.getPointerId(0);
        int r44 = (int) (r9.getX() + 0.5f);
        this.mLastTouchX = r44;
        this.mInitialTouchX = r44;
        int r45 = (int) (r9.getY() + 0.5f);
        this.mLastTouchY = r45;
        this.mInitialTouchY = r45;
        if (stopGlowAnimations(r9) == false) goto L53;
    L54:
        getParent().requestDisallowInterceptTouchEvent(true);
        setScrollState(1);
        stopNestedScroll(1);
    L55:
        int[] r94 = this.mNestedOffsets;
        r94[1] = 0;
        r94[0] = 0;
        int r05 = r02;
        if (r3 == false) goto L58;
        r05 = (r02 ? 1 : 0) | 2;
    L58:
        startNestedScroll(r05, 0);
        goto L60
    L53:
        if (this.mScrollState != 2) goto L55;
        goto L54
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        int r12 = AbstractC2792zB.f9460a;
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int r8, int r9) {
        AbstractC1160i r0 = this.mLayout;
        if (r0 != null) goto L6;
        defaultOnMeasure(r8, r9);
        return;
    L6:
        boolean r2 = false;
        if (r0.isAutoMeasureEnabled() == false) goto L26;
        int r02 = View.MeasureSpec.getMode(r8);
        int r3 = View.MeasureSpec.getMode(r9);
        this.mLayout.onMeasure(this.mRecycler, this.mState, r8, r9);
        if (r02 != 1073741824) goto L12;
        if (r3 != 1073741824) goto L12;
        r2 = true;
    L12:
        this.mLastAutoMeasureSkippedDueToExact = r2;
        if (r2 == false) goto L15;
        return;
    L15:
        if (this.mAdapter != null) goto L18;
        return;
    L18:
        if (this.mState.f79d != 1) goto L20;
        dispatchLayoutStep1();
    L20:
        this.mLayout.setMeasureSpecs(r8, r9);
        this.mState.f84i = true;
        dispatchLayoutStep2();
        this.mLayout.setMeasuredDimensionFromChildren(r8, r9);
        if (this.mLayout.shouldMeasureTwice() == false) goto L23;
        this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        this.mState.f84i = true;
        dispatchLayoutStep2();
        this.mLayout.setMeasuredDimensionFromChildren(r8, r9);
    L23:
        this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
        this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
        return;
    L26:
        if (this.mHasFixedSize == false) goto L30;
        this.mLayout.onMeasure(this.mRecycler, this.mState, r8, r9);
        return;
    L30:
        if (this.mAdapterUpdateDuringMeasure == false) goto L37;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        onExitLayoutOrScroll();
        C0038Av r03 = this.mState;
        if (r03.f86k == false) goto L34;
        r03.f82g = true;
    L35:
        this.mAdapterUpdateDuringMeasure = false;
        stopInterceptRequestLayout(false);
    L40:
        AbstractC1158g r04 = this.mAdapter;
        if (r04 == null) goto L43;
        this.mState.f80e = r04.getItemCount();
    L44:
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, r8, r9);
        stopInterceptRequestLayout(false);
        this.mState.f82g = false;
        return;
    L43:
        this.mState.f80e = 0;
        goto L44
    L34:
        this.mAdapterHelper.m2218c();
        this.mState.f82g = false;
        goto L35
    L37:
        if (this.mState.f86k == false) goto L40;
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int r2, Rect r3) {
        if (isComputingLayout() == false) goto L7;
        return false;
    L7:
        return super.onRequestFocusInDescendants(r2, r3);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable r2) {
        if ((r2 instanceof C2775yv) == true) goto L6;
        super.onRestoreInstanceState(r2);
        return;
    L6:
        C2775yv r22 = (C2775yv) r2;
        this.mPendingSavedState = r22;
        super.onRestoreInstanceState(r22.f8397a);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C2775yv r0 = new C2775yv(super.onSaveInstanceState());
        C2775yv r1 = this.mPendingSavedState;
        if (r1 == null) goto L6;
        r0.f9425c = r1.f9425c;
        return r0;
    L6:
        AbstractC1160i r12 = this.mLayout;
        if (r12 == null) goto L10;
        r0.f9425c = r12.onSaveInstanceState();
        return r0;
    L10:
        r0.f9425c = null;
        return r0;
    }

    public void onScrollStateChanged(int r1) {
    }

    public void onScrolled(int r1, int r2) {
    }

    @Override // android.view.View
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        if (r1 != r3) goto L7;
        if (r2 != r4) goto L7;
        return;
    L7:
        invalidateGlows();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent r17) {
        if (this.mLayoutSuppressed == false) goto L5;
    L104:
        return false;
    L5:
        if (this.mIgnoreMotionEventTillDown == true) goto L104;
        if (dispatchToOnItemTouchListeners(r17) == false) goto L11;
        cancelScroll();
        return true;
    L11:
        AbstractC1160i r1 = this.mLayout;
        if (r1 != null) goto L14;
        return false;
    L14:
        boolean r9 = r1.canScrollHorizontally();
        boolean r10 = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker != null) goto L17;
        this.mVelocityTracker = VelocityTracker.obtain();
    L17:
        int r12 = r17.getActionMasked();
        int r2 = r17.getActionIndex();
        if (r12 != 0) goto L20;
        int[] r3 = this.mNestedOffsets;
        r3[1] = 0;
        r3[0] = 0;
    L20:
        MotionEvent r11 = MotionEvent.obtain(r17);
        int[] r32 = this.mNestedOffsets;
        r11.offsetLocation(r32[0], r32[1]);
        if (r12 == 0) goto L97;
        if (r12 != 1) goto L24;
        this.mVelocityTracker.addMovement(r11);
        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
        if (r9 == false) goto L85;
        float r22 = -this.mVelocityTracker.getXVelocity(this.mScrollPointerId);
    L86:
        if (r10 == false) goto L88;
        float r33 = -this.mVelocityTracker.getYVelocity(this.mScrollPointerId);
    L90:
        if (r22 != 0.0f) goto L94;
        if (r33 != 0.0f) goto L94;
    L95:
        setScrollState(0);
    L96:
        resetScroll();
    L102:
        r11.recycle();
        return true;
    L94:
        if (fling((int) r22, (int) r33) == true) goto L96;
    L88:
        r33 = 0.0f;
        goto L90
    L85:
        r22 = 0.0f;
        goto L86
    L24:
        if (r12 != 2) goto L26;
        int r13 = r17.findPointerIndex(this.mScrollPointerId);
        if (r13 >= 0) goto L38;
        return false;
    L38:
        int r122 = (int) (r17.getX(r13) + 0.5f);
        int r132 = (int) (r17.getY(r13) + 0.5f);
        int r14 = this.mLastTouchX - r122;
        int r23 = this.mLastTouchY - r132;
        if (this.mScrollState == 1) goto L56;
        if (r9 == false) goto L46;
        if (r14 <= 0) goto L43;
        r14 = Math.max(0, r14 - this.mTouchSlop);
    L44:
        if (r14 == 0) goto L46;
        boolean r34 = true;
    L47:
        if (r10 == false) goto L53;
        if (r23 <= 0) goto L50;
        r23 = Math.max(0, r23 - this.mTouchSlop);
    L51:
        if (r23 == 0) goto L53;
        r34 = true;
        goto L53
    L50:
        r23 = Math.min(0, r23 + this.mTouchSlop);
    L53:
        if (r34 == false) goto L56;
        setScrollState(1);
        goto L56
    L43:
        r14 = Math.min(0, r14 + this.mTouchSlop);
    L46:
        r34 = false;
    L56:
        if (this.mScrollState != 1) goto L101;
        int[] r35 = this.mReusableIntPair;
        r35[0] = 0;
        r35[1] = 0;
        int r142 = r14 - releaseHorizontalGlow(r14, r17.getY());
        int r15 = r23 - releaseVerticalGlow(r23, r17.getX());
        if (r9 == false) goto L60;
        int r16 = r142;
    L61:
        if (r10 == false) goto L63;
        int r24 = r15;
    L65:
        if (dispatchNestedPreScroll(r16, r24, this.mReusableIntPair, this.mScrollOffset, 0) == false) goto L67;
        int[] r18 = this.mReusableIntPair;
        r142 = r142 - r18[0];
        r15 = r15 - r18[1];
        int[] r19 = this.mNestedOffsets;
        int r25 = r19[0];
        int[] r36 = this.mScrollOffset;
        r19[0] = r25 + r36[0];
        r19[1] = r19[1] + r36[1];
        getParent().requestDisallowInterceptTouchEvent(true);
    L67:
        int[] r110 = this.mScrollOffset;
        this.mLastTouchX = r122 - r110[0];
        this.mLastTouchY = r132 - r110[1];
        if (r9 == false) goto L70;
        int r111 = r142;
    L71:
        if (r10 == false) goto L73;
        int r26 = r15;
    L75:
        if (scrollByInternal(r111, r26, r17, 0) == false) goto L77;
        getParent().requestDisallowInterceptTouchEvent(true);
    L77:
        RunnableC1155d r112 = this.mGapWorker;
        if (r112 == null) goto L101;
        if (r142 != 0) goto L81;
        if (r15 == 0) goto L101;
    L81:
        r112.m2242a(this, r142, r15);
        goto L101
    L73:
        r26 = 0;
        goto L75
    L70:
        r111 = 0;
        goto L71
    L63:
        r24 = 0;
        goto L65
    L60:
        r16 = 0;
    L101:
        this.mVelocityTracker.addMovement(r11);
        goto L102
    L26:
        if (r12 != 3) goto L28;
        cancelScroll();
        goto L101
    L28:
        if (r12 != 5) goto L30;
        this.mScrollPointerId = r17.getPointerId(r2);
        int r113 = (int) (r17.getX(r2) + 0.5f);
        this.mLastTouchX = r113;
        this.mInitialTouchX = r113;
        int r114 = (int) (r17.getY(r2) + 0.5f);
        this.mLastTouchY = r114;
        this.mInitialTouchY = r114;
        goto L101
    L30:
        if (r12 != 6) goto L101;
        onPointerUp(r17);
        goto L101
    L97:
        this.mScrollPointerId = r17.getPointerId(0);
        int r115 = (int) (r17.getX() + 0.5f);
        this.mLastTouchX = r115;
        this.mInitialTouchX = r115;
        int r116 = (int) (r17.getY() + 0.5f);
        this.mLastTouchY = r116;
        this.mInitialTouchY = r116;
        int r92 = r9;
        if (r10 == false) goto L100;
        r92 = (r9 ? 1 : 0) | 2;
    L100:
        startNestedScroll(r92, 0);
        goto L101
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner == false) goto L5;
        return;
    L5:
        if (this.mIsAttached == false) goto L9;
        Runnable r0 = this.mItemAnimatorRunner;
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        postOnAnimation(r0);
        this.mPostedAnimatorRunner = true;
        return;
    }

    public void processDataSetCompletelyChanged(boolean r2) {
        this.mDispatchItemsChangedEvent = r2 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(AbstractC1166o r4, C2208lv r5) {
        r4.setFlags(0, 8192);
        if (this.mState.f83h == true) goto L5;
    L11:
        C2520sy r0 = this.mViewInfoStore.f8756a;
        C2408qE r1 = (C2408qE) r0.get(r4);
        if (r1 != null) goto L14;
        r1 = C2408qE.m4846a();
        r0.put(r4, r1);
    L14:
        r1.f8444b = r5;
        r1.f8443a |= 4;
        return;
    L5:
        if (r4.isUpdated() == false) goto L11;
        if (r4.isRemoved() == true) goto L11;
        if (r4.shouldIgnore() == true) goto L11;
        this.mViewInfoStore.f8757b.m5170e(getChangedHolderKey(r4), r4);
        goto L11
    }

    public void removeAndRecycleViews() {
        AbstractC1159h r0 = this.mItemAnimator;
        if (r0 == null) goto L5;
        r0.mo2249e();
    L5:
        AbstractC1160i r02 = this.mLayout;
        if (r02 == null) goto L8;
        r02.removeAndRecycleAllViews(this.mRecycler);
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
    L8:
        C1161j r03 = this.mRecycler;
        r03.f4039a.clear();
        r03.m2261h();
    }

    public boolean removeAnimatingView(View r7) {
        startInterceptRequestLayout();
        C1153b r0 = this.mChildHelper;
        C2088j9 r1 = r0.f4018b;
        C1384ev r2 = r0.f4017a;
        int r3 = r2.f4930a.indexOfChild(r7);
        boolean r5 = true;
        if (r3 != (-1)) goto L6;
        r0.m2238k(r7);
    L9:
        if (r5 == false) goto L13;
        AbstractC1166o r02 = getChildViewHolderInt(r7);
        this.mRecycler.m2267n(r02);
        this.mRecycler.m2264k(r02);
        if (sVerboseLoggingEnabled == false) goto L13;
        Objects.toString(r7);
        toString();
    L13:
        stopInterceptRequestLayout(!r5);
        return r5;
    L6:
        if (r1.m4256d(r3) == false) goto L8;
        r1.m4258f(r3);
        r0.m2238k(r7);
        r2.m2670a(r3);
        goto L9
    L8:
        r5 = false;
        goto L9
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View r3, boolean r4) {
        AbstractC1166o r0 = getChildViewHolderInt(r3);
        if (r0 == null) goto L13;
        if (r0.isTmpDetached() == false) goto L8;
        r0.clearTmpDetachFlag();
    L14:
        r3.clearAnimation();
        dispatchChildDetached(r3);
        super.removeDetachedView(r3, r4);
        return;
    L8:
        if (r0.shouldIgnore() == true) goto L14;
        StringBuilder r42 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
        r42.append(r0);
        throw new IllegalArgumentException(AbstractC0213Ey.m406d(this, r42));
    L13:
        if (sDebugAssertionsEnabled == false) goto L14;
        StringBuilder r02 = new StringBuilder("No ViewHolder found for child: ");
        r02.append(r3);
        throw new IllegalArgumentException(AbstractC0213Ey.m406d(this, r02));
    }

    public void removeItemDecoration(AbstractC2251mv r3) {
        AbstractC1160i r0 = this.mLayout;
        if (r0 == null) goto L5;
        r0.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
    L5:
        this.mItemDecorations.remove(r3);
        if (this.mItemDecorations.isEmpty() == true) goto L8;
    L12:
        markItemDecorInsetsDirty();
        requestLayout();
        return;
    L8:
        if (getOverScrollMode() != 2) goto L10;
        boolean r32 = true;
    L11:
        setWillNotDraw(r32);
        goto L12
    L10:
        r32 = false;
        goto L11
    }

    public void removeItemDecorationAt(int r4) {
        int r0 = getItemDecorationCount();
        if (r4 < 0) goto L8;
        if (r4 >= r0) goto L8;
        removeItemDecoration(getItemDecorationAt(r4));
        return;
    L8:
        throw new IndexOutOfBoundsException(r4 + " is an invalid index for size " + r0);
    }

    public void removeOnChildAttachStateChangeListener(InterfaceC2474rv r2) {
        List<InterfaceC2474rv> r0 = this.mOnChildAttachStateListeners;
        if (r0 != null) goto L5;
        return;
    L5:
        r0.remove(r2);
    }

    public void removeOnItemTouchListener(InterfaceC2560tv r2) {
        this.mOnItemTouchListeners.remove(r2);
        if (this.mInterceptingOnItemTouchListener != r2) goto L6;
        this.mInterceptingOnItemTouchListener = null;
        return;
    }

    public void removeOnScrollListener(AbstractC2603uv r2) {
        List<AbstractC2603uv> r0 = this.mScrollListeners;
        if (r0 == null) goto L6;
        r0.remove(r2);
        return;
    }

    public void removeRecyclerListener(InterfaceC2732xv r2) {
        this.mRecyclerListeners.remove(r2);
    }

    public void repositionShadowingViews() {
        int r0 = this.mChildHelper.m2232e();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L14;
        View r2 = this.mChildHelper.m2231d(r1);
        AbstractC1166o r3 = getChildViewHolder(r2);
        if (r3 == null) goto L13;
        AbstractC1166o r32 = r3.mShadowingHolder;
        if (r32 == null) goto L13;
        View r33 = r32.itemView;
        int r4 = r2.getLeft();
        int r22 = r2.getTop();
        if (r4 == r33.getLeft()) goto L11;
    L12:
        r33.layout(r4, r22, r33.getWidth() + r4, r33.getHeight() + r22);
        goto L13
    L11:
        if (r22 != r33.getTop()) goto L12;
    L13:
        r1 = r1 + 1;
        goto L3
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View r3, View r4) {
        if (this.mLayout.onRequestChildFocus(this, this.mState, r3, r4) == true) goto L6;
        if (r4 == null) goto L6;
        requestChildOnScreen(r3, r4);
    L6:
        super.requestChildFocus(r3, r4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View r2, Rect r3, boolean r4) {
        return this.mLayout.requestChildRectangleOnScreen(this, r2, r3, r4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r4) {
        int r0 = this.mOnItemTouchListeners.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        this.mOnItemTouchListeners.get(r1).mo1554c(r4);
        r1 = r1 + 1;
        goto L3
    L5:
        super.requestDisallowInterceptTouchEvent(r4);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth == 0) goto L5;
    L8:
        this.mLayoutWasDefered = true;
        return;
    L5:
        if (this.mLayoutSuppressed == true) goto L8;
        super.requestLayout();
    }

    public void saveOldPositions() {
        int r0 = this.mChildHelper.m2235h();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L17;
        AbstractC1166o r2 = getChildViewHolderInt(this.mChildHelper.m2234g(r1));
        if (sDebugAssertionsEnabled == false) goto L14;
        if (r2.mPosition != (-1)) goto L14;
        if (r2.isRemoved() == true) goto L14;
        throw new IllegalStateException(AbstractC0213Ey.m406d(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
    L14:
        if (r2.shouldIgnore() == true) goto L16;
        r2.saveOldPosition();
    L16:
        r1 = r1 + 1;
        goto L3
    }

    @Override // android.view.View
    public void scrollBy(int r4, int r5) {
        AbstractC1160i r0 = this.mLayout;
        if (r0 != null) goto L6;
        return;
    L6:
        if (this.mLayoutSuppressed == true) goto L22;
        boolean r02 = r0.canScrollHorizontally();
        boolean r1 = this.mLayout.canScrollVertically();
        if (r02 == true) goto L14;
        if (r1 == true) goto L14;
        return;
    L14:
        if (r02 == true) goto L17;
        r4 = 0;
    L17:
        if (r1 == true) goto L20;
        r5 = 0;
    L20:
        scrollByInternal(r4, r5, null, 0);
        return;
    }

    public boolean scrollByInternal(int r16, int r17, MotionEvent r18, int r19) {
        consumePendingUpdateOperations();
        if (this.mAdapter == null) goto L5;
        int[] r1 = this.mReusableIntPair;
        r1[0] = 0;
        r1[1] = 0;
        scrollStep(r16, r17, r1);
        int[] r12 = this.mReusableIntPair;
        int r2 = r12[0];
        int r13 = r12[1];
        int r3 = r16 - r2;
        int r4 = r17 - r13;
        int r22 = r13;
        int r14 = r2;
    L7:
        if (this.mItemDecorations.isEmpty() == true) goto L9;
        invalidate();
    L9:
        int[] r7 = this.mReusableIntPair;
        r7[0] = 0;
        r7[1] = 0;
        dispatchNestedScroll(r14, r22, r3, r4, this.mScrollOffset, r19, r7);
        int[] r5 = this.mReusableIntPair;
        int r6 = r5[0];
        int r32 = r3 - r6;
        int r52 = r5[1];
        int r42 = r4 - r52;
        if (r6 != 0) goto L14;
        if (r52 != 0) goto L14;
        boolean r53 = false;
    L15:
        int r62 = this.mLastTouchX;
        int[] r72 = this.mScrollOffset;
        int r122 = r72[0];
        this.mLastTouchX = r62 - r122;
        int r63 = this.mLastTouchY;
        int r73 = r72[1];
        this.mLastTouchY = r63 - r73;
        int[] r64 = this.mNestedOffsets;
        r64[0] = r64[0] + r122;
        r64[1] = r64[1] + r73;
        if (getOverScrollMode() == 2) goto L23;
        if (r18 != null) goto L19;
    L22:
        considerReleasingGlowsOnScroll(r16, r17);
        goto L23
    L19:
        if ((r18.getSource() & 8194) == 8194) goto L22;
        pullGlows(r18.getX(), r32, r18.getY(), r42);
    L23:
        if (r14 != 0) goto L25;
        if (r22 != 0) goto L25;
    L27:
        if (awakenScrollBars() == true) goto L29;
        invalidate();
    L29:
        if (r53 == true) goto L34;
        if (r14 != 0) goto L34;
        if (r22 != 0) goto L34;
        return false;
    L34:
        return true;
    L25:
        dispatchOnScrolled(r14, r22);
    L14:
        r53 = true;
        goto L15
    L5:
        r14 = 0;
        r22 = 0;
        r3 = 0;
        r4 = 0;
        goto L7
    }

    public void scrollStep(int r5, int r6, int[] r7) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int r0 = AbstractC2792zB.f9460a;
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        if (r5 == 0) goto L5;
        int r52 = this.mLayout.scrollHorizontallyBy(r5, this.mRecycler, this.mState);
    L6:
        if (r6 == 0) goto L8;
        int r62 = this.mLayout.scrollVerticallyBy(r6, this.mRecycler, this.mState);
    L9:
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (r7 == null) goto L13;
        r7[0] = r52;
        r7[1] = r62;
        return;
    L13:
        return;
    L8:
        r62 = 0;
        goto L9
    L5:
        r52 = 0;
        goto L6
    }

    @Override // android.view.View
    public void scrollTo(int r1, int r2) {
    }

    public void scrollToPosition(int r2) {
        if (this.mLayoutSuppressed == true) goto L10;
        stopScroll();
        AbstractC1160i r0 = this.mLayout;
        if (r0 != null) goto L8;
        return;
    L8:
        r0.scrollToPosition(r2);
        awakenScrollBars();
        return;
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent r2) {
        if (shouldDeferAccessibilityEvent(r2) == false) goto L5;
        return;
    L5:
        super.sendAccessibilityEventUnchecked(r2);
    }

    public void setAccessibilityDelegateCompat(C0210Ev r1) {
        this.mAccessibilityDelegate = r1;
        AbstractC2185lE.m4399l(this, r1);
    }

    public void setAdapter(AbstractC1158g r3) {
        setLayoutFrozen(false);
        setAdapterInternal(r3, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC2073iv r2) {
        if (r2 != this.mChildDrawingOrderCallback) goto L5;
        return;
    L5:
        this.mChildDrawingOrderCallback = r2;
        if (r2 == null) goto L8;
        boolean r22 = true;
    L9:
        setChildrenDrawingOrderEnabled(r22);
        return;
    L8:
        r22 = false;
        goto L9
    }

    public boolean setChildImportantForAccessibilityInternal(AbstractC1166o r2, int r3) {
        if (isComputingLayout() == false) goto L6;
        r2.mPendingAccessibilityState = r3;
        this.mPendingAccessibilityImportanceChange.add(r2);
        return false;
    L6:
        View r22 = r2.itemView;
        WeakHashMap r0 = AbstractC2185lE.f7617a;
        r22.setImportantForAccessibility(r3);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean r2) {
        if (r2 == this.mClipToPadding) goto L5;
        invalidateGlows();
    L5:
        this.mClipToPadding = r2;
        super.setClipToPadding(r2);
        if (this.mFirstLayoutComplete == false) goto L9;
        requestLayout();
        return;
    }

    public void setEdgeEffectFactory(AbstractC2117jv r1) {
        r1.getClass();
        this.mEdgeEffectFactory = r1;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean r1) {
        this.mHasFixedSize = r1;
    }

    public void setItemAnimator(AbstractC1159h r3) {
        AbstractC1159h r0 = this.mItemAnimator;
        if (r0 == null) goto L5;
        r0.mo2249e();
        this.mItemAnimator.f4033a = null;
    L5:
        this.mItemAnimator = r3;
        if (r3 == null) goto L9;
        r3.f4033a = this.mItemAnimatorListener;
        return;
    }

    public void setItemViewCacheSize(int r2) {
        C1161j r0 = this.mRecycler;
        r0.f4043e = r2;
        r0.m2268o();
    }

    @Deprecated
    public void setLayoutFrozen(boolean r1) {
        suppressLayout(r1);
    }

    public void setLayoutManager(AbstractC1160i r5) {
        if (r5 != this.mLayout) goto L5;
        return;
    L5:
        stopScroll();
        if (this.mLayout == null) goto L14;
        AbstractC1159h r0 = this.mItemAnimator;
        if (r0 == null) goto L10;
        r0.mo2249e();
    L10:
        this.mLayout.removeAndRecycleAllViews(this.mRecycler);
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        C1161j r02 = this.mRecycler;
        r02.f4039a.clear();
        r02.m2261h();
        if (this.mIsAttached == false) goto L13;
        this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
    L13:
        this.mLayout.setRecyclerView(null);
        this.mLayout = null;
    L15:
        C1153b r03 = this.mChildHelper;
        RecyclerView r1 = r03.f4017a.f4930a;
        r03.f4018b.m4259g();
        ArrayList r04 = r03.f4019c;
        int r2 = r04.size() - 1;
    L16:
        if (r2 < 0) goto L21;
        AbstractC1166o r3 = getChildViewHolderInt((View) r04.get(r2));
        if (r3 == null) goto L20;
        r3.onLeftHiddenState(r1);
    L20:
        r04.remove(r2);
        r2 = r2 - 1;
        goto L16
    L21:
        int r05 = r1.getChildCount();
        int r22 = 0;
    L22:
        if (r22 >= r05) goto L24;
        View r32 = r1.getChildAt(r22);
        r1.dispatchChildDetached(r32);
        r32.clearAnimation();
        r22 = r22 + 1;
        goto L22
    L24:
        r1.removeAllViews();
        this.mLayout = r5;
        if (r5 != null) goto L27;
    L33:
        this.mRecycler.m2268o();
        requestLayout();
        return;
    L27:
        if (r5.mRecyclerView != null) goto L31;
        r5.setRecyclerView(this);
        if (this.mIsAttached == false) goto L33;
        this.mLayout.dispatchAttachedToWindow(this);
        goto L33
    L31:
        StringBuilder r12 = new StringBuilder("LayoutManager ");
        r12.append(r5);
        r12.append(" is already attached to a RecyclerView:");
        throw new IllegalArgumentException(AbstractC0213Ey.m406d(r5.mRecyclerView, r12));
    L14:
        C1161j r06 = this.mRecycler;
        r06.f4039a.clear();
        r06.m2261h();
        goto L15
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition r2) {
        if (r2 != null) goto L6;
        super.setLayoutTransition(null);
        return;
    L6:
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r4) {
        C0293Gs r0 = getScrollingChildHelper();
        if (r0.f992d == false) goto L5;
        ViewGroup r1 = r0.f991c;
        WeakHashMap r2 = AbstractC2185lE.f7617a;
        AbstractC1360eE.m2641m(r1);
    L5:
        r0.f992d = r4;
    }

    public void setOnFlingListener(AbstractC2517sv r1) {
        this.mOnFlingListener = r1;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC2603uv r1) {
        this.mScrollListener = r1;
    }

    public void setPreserveFocusAfterLayout(boolean r1) {
        this.mPreserveFocusAfterLayout = r1;
    }

    public void setRecycledViewPool(C2689wv r5) {
        C1161j r0 = this.mRecycler;
        RecyclerView r1 = r0.f4046h;
        r0.m2260g(r1.mAdapter, false);
        if (r0.f4045g == null) goto L5;
        r2.f9257b--;
    L5:
        r0.f4045g = r5;
        if (r5 != null) goto L8;
    L10:
        r0.m2259f();
        return;
    L8:
        if (r1.getAdapter() == null) goto L10;
        r0.f4045g.f9257b++;
        goto L10
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC2732xv r1) {
    }

    public void setScrollState(int r2) {
        if (r2 != this.mScrollState) goto L6;
        return;
    L6:
        if (sVerboseLoggingEnabled == false) goto L8;
        new Exception();
    L8:
        this.mScrollState = r2;
        if (r2 == 2) goto L11;
        stopScrollersInternal();
    L11:
        dispatchOnScrollStateChanged(r2);
    }

    public void setScrollingTouchSlop(int r3) {
        ViewConfiguration r0 = ViewConfiguration.get(getContext());
        if (r3 == 1) goto L6;
        this.mTouchSlop = r0.getScaledTouchSlop();
        return;
    L6:
        this.mTouchSlop = r0.getScaledPagingTouchSlop();
    }

    public void setViewCacheExtension(AbstractC0124Cv r1) {
        this.mRecycler.getClass();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent r3) {
        int r1 = 0;
        if (isComputingLayout() == false) goto L12;
        if (r3 == null) goto L6;
        int r32 = r3.getContentChangeTypes();
    L7:
        if (r32 == 0) goto L10;
        r1 = r32;
    L10:
        this.mEatenAccessibilityChangeFlags |= r1;
        return true;
    L6:
        r32 = 0;
        goto L7
    L12:
        return false;
    }

    public void smoothScrollBy(int r2, int r3) {
        smoothScrollBy(r2, r3, null);
    }

    public void smoothScrollToPosition(int r3) {
        if (this.mLayoutSuppressed == true) goto L10;
        AbstractC1160i r0 = this.mLayout;
        if (r0 != null) goto L8;
        return;
    L8:
        r0.smoothScrollToPosition(this, this.mState, r3);
        return;
    }

    public void startInterceptRequestLayout() {
        int r0 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = r0;
        if (r0 == 1) goto L5;
        return;
    L5:
        if (this.mLayoutSuppressed == true) goto L9;
        this.mLayoutWasDefered = false;
        return;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int r3) {
        return getScrollingChildHelper().m598g(r3, 0);
    }

    public void stopInterceptRequestLayout(boolean r4) {
        if (this.mInterceptRequestLayoutDepth >= 1) goto L10;
        if (sDebugAssertionsEnabled == true) goto L8;
        this.mInterceptRequestLayoutDepth = 1;
        goto L10
    L8:
        throw new IllegalStateException(AbstractC0213Ey.m406d(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
    L10:
        if (r4 == true) goto L15;
        if (this.mLayoutSuppressed == true) goto L15;
        this.mLayoutWasDefered = false;
    L15:
        if (this.mInterceptRequestLayoutDepth != 1) goto L29;
        if (r4 == false) goto L27;
        if (this.mLayoutWasDefered == false) goto L27;
        if (this.mLayoutSuppressed == true) goto L27;
        if (this.mLayout == null) goto L27;
        if (this.mAdapter == null) goto L27;
        dispatchLayout();
    L27:
        if (this.mLayoutSuppressed == true) goto L29;
        this.mLayoutWasDefered = false;
    L29:
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().m599h(0);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean r10) {
        if (r10 == this.mLayoutSuppressed) goto L17;
        assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
        if (r10 == true) goto L15;
        this.mLayoutSuppressed = false;
        if (this.mLayoutWasDefered == true) goto L9;
    L13:
        this.mLayoutWasDefered = false;
        return;
    L9:
        if (this.mLayout == null) goto L13;
        if (this.mAdapter == null) goto L13;
        requestLayout();
        goto L13
    L15:
        long r1 = SystemClock.uptimeMillis();
        onTouchEvent(MotionEvent.obtain(r1, r1, 3, 0.0f, 0.0f, 0));
        this.mLayoutSuppressed = true;
        this.mIgnoreMotionEventTillDown = true;
        stopScroll();
        return;
    }

    public void swapAdapter(AbstractC1158g r2, boolean r3) {
        setLayoutFrozen(false);
        setAdapterInternal(r2, true, r3);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int r8, int r9, Object r10) {
        int r0 = this.mChildHelper.m2235h();
        int r92 = r9 + r8;
        int r1 = 0;
    L4:
        if (r1 >= r0) goto L15;
        View r4 = this.mChildHelper.m2234g(r1);
        AbstractC1166o r5 = getChildViewHolderInt(r4);
        if (r5 == null) goto L14;
        if (r5.shouldIgnore() == true) goto L14;
        int r6 = r5.mPosition;
        if (r6 < r8) goto L14;
        if (r6 >= r92) goto L14;
        r5.addFlags(2);
        r5.addChangePayload(r10);
        ((C2431qv) r4.getLayoutParams()).f8528c = true;
    L14:
        r1 = r1 + 1;
        goto L4
    L15:
        C1161j r102 = this.mRecycler;
        ArrayList r02 = r102.f4041c;
        int r12 = r02.size() - 1;
    L16:
        if (r12 < 0) goto L25;
        AbstractC1166o r3 = (AbstractC1166o) r02.get(r12);
        if (r3 == null) goto L24;
        int r42 = r3.mPosition;
        if (r42 < r8) goto L24;
        if (r42 >= r92) goto L24;
        r3.addFlags(2);
        r102.m2262i(r12);
    L24:
        r12 = r12 - 1;
        goto L16
    }

    public RecyclerView(Context r2, AttributeSet r3) {
        this(r2, r3, io.github.cherrywechat.R.attr.recyclerViewStyle);
    }

    public AbstractC1166o findViewHolderForPosition(int r6, boolean r7) {
        int r0 = this.mChildHelper.m2235h();
        AbstractC1166o r1 = null;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L20;
        AbstractC1166o r3 = getChildViewHolderInt(this.mChildHelper.m2234g(r2));
        if (r3 == null) goto L19;
        if (r3.isRemoved() == true) goto L19;
        if (r7 == false) goto L13;
        if (r3.mPosition != r6) goto L19;
    L15:
        C1153b r12 = this.mChildHelper;
        View r4 = r3.itemView;
        if (r12.f4019c.contains(r4) == false) goto L18;
        r1 = r3;
        goto L19
    L18:
        return r3;
    L13:
        if (r3.getLayoutPosition() == r6) goto L15;
    L19:
        r2 = r2 + 1;
        goto L3
    L20:
        return r1;
    }

    public void onExitLayoutOrScroll(boolean r3) {
        int r0 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = r0;
        if (r0 < 1) goto L5;
        return;
    L5:
        if (sDebugAssertionsEnabled == false) goto L10;
        if (r0 >= 0) goto L10;
        throw new IllegalStateException(AbstractC0213Ey.m406d(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
    L10:
        this.mLayoutOrScrollCounter = 0;
        if (r3 == false) goto L15;
        dispatchContentChangedIfNecessary();
        dispatchPendingImportantForAccessibilityChanges();
        return;
    }

    public void smoothScrollBy(int r2, int r3, Interpolator r4) {
        smoothScrollBy(r2, r3, r4, Integer.MIN_VALUE);
    }

    public RecyclerView(Context r11, AttributeSet r12, int r13) {
        super(r11, r12, r13);
        this.mObserver = new C1162k(this);
        this.mRecycler = new C1161j(this);
        this.mViewInfoStore = new C2494sE();
        this.mUpdateChildViewsRunnable = new RunnableC1156e(this, 0);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList();
        this.mOnItemTouchListeners = new ArrayList();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        C1261cd r2 = new C1261cd();
        C1154c r4 = null;
        r2.f4033a = null;
        r2.f4034b = new ArrayList();
        r2.f4035c = 120;
        r2.f4036d = 120;
        r2.f4037e = 250;
        r2.f4038f = 250;
        int r7 = 1;
        r2.f4276g = true;
        r2.f4277h = new ArrayList();
        r2.f4278i = new ArrayList();
        r2.f4279j = new ArrayList();
        r2.f4280k = new ArrayList();
        r2.f4281l = new ArrayList();
        r2.f4282m = new ArrayList();
        r2.f4283n = new ArrayList();
        r2.f4284o = new ArrayList();
        r2.f4285p = new ArrayList();
        r2.f4286q = new ArrayList();
        r2.f4287r = new ArrayList();
        this.mItemAnimator = r2;
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new RunnableC1165n(this);
        if (ALLOW_THREAD_GAP_WORK == false) goto L5;
        r4 = new C1154c();
    L5:
        this.mPrefetchRegistry = r4;
        C0038Av r22 = new C0038Av();
        r22.f76a = -1;
        r22.f77b = 0;
        r22.f78c = 0;
        r22.f79d = 1;
        r22.f80e = 0;
        r22.f81f = false;
        r22.f82g = false;
        r22.f83h = false;
        r22.f84i = false;
        r22.f85j = false;
        r22.f86k = false;
        this.mState = r22;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C1384ev(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC1156e(this, r7);
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new C1384ev(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration r23 = ViewConfiguration.get(r11);
        this.mTouchSlop = r23.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = r23.getScaledHorizontalScrollFactor();
        this.mScaledVerticalScrollFactor = r23.getScaledVerticalScrollFactor();
        this.mMinFlingVelocity = r23.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = r23.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = ((r11.getResources().getDisplayMetrics().density * 160.0f) * 386.0878f) * 0.84f;
        if (getOverScrollMode() != 2) goto L8;
        boolean r24 = true;
    L9:
        setWillNotDraw(r24);
        this.mItemAnimator.f4033a = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        WeakHashMap r25 = AbstractC2185lE.f7617a;
        if (getImportantForAccessibility() != 0) goto L12;
        setImportantForAccessibility(1);
    L12:
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0210Ev(this));
        int[] r26 = AbstractC0810Su.f2564a;
        TypedArray r42 = r11.obtainStyledAttributes(r12, r26, r13, 0);
        AbstractC2185lE.m4398k(this, r11, r26, r12, r42, r13);
        String r27 = r42.getString(8);
        if (r42.getInt(2, -1) != (-1)) goto L15;
        setDescendantFocusability(262144);
    L15:
        this.mClipToPadding = r42.getBoolean(1, true);
        boolean r1 = r42.getBoolean(3, false);
        this.mEnableFastScroller = r1;
        if (r1 == false) goto L18;
        initFastScroller((StateListDrawable) r42.getDrawable(6), r42.getDrawable(7), (StateListDrawable) r42.getDrawable(4), r42.getDrawable(5));
    L18:
        r42.recycle();
        createLayoutManager(r11, r27, r12, r13, 0);
        int[] r28 = NESTED_SCROLLING_ATTRS;
        TypedArray r43 = r11.obtainStyledAttributes(r12, r28, r13, 0);
        AbstractC2185lE.m4398k(this, r11, r28, r12, r43, r13);
        boolean r14 = r43.getBoolean(0, true);
        r43.recycle();
        setNestedScrollingEnabled(r14);
        setTag(io.github.cherrywechat.R.id.is_pooling_container_tag, Boolean.TRUE);
        return;
    L8:
        r24 = false;
        goto L9
    }

    public boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10, int r11) {
        return getScrollingChildHelper().m594c(r7, r8, r9, r10, r11);
    }

    public boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13, int r14) {
        return getScrollingChildHelper().m595d(r9, r10, r11, r12, r13, r14, null);
    }

    public boolean hasNestedScrollingParent(int r2) {
        return getScrollingChildHelper().m597f(r2);
    }

    public void smoothScrollBy(int r7, int r8, Interpolator r9, int r10) {
        smoothScrollBy(r7, r8, r9, r10, false);
    }

    public boolean startNestedScroll(int r2, int r3) {
        return getScrollingChildHelper().m598g(r2, r3);
    }

    public void stopNestedScroll(int r2) {
        getScrollingChildHelper().m599h(r2);
    }

    public void smoothScrollBy(int r3, int r4, Interpolator r5, int r6, boolean r7) {
        AbstractC1160i r0 = this.mLayout;
        if (r0 != null) goto L6;
        return;
    L6:
        if (this.mLayoutSuppressed == true) goto L33;
        int r1 = 0;
        if (r0.canScrollHorizontally() == true) goto L12;
        r3 = 0;
    L12:
        if (this.mLayout.canScrollVertically() == true) goto L14;
        r4 = 0;
    L14:
        if (r3 != 0) goto L19;
        if (r4 != 0) goto L19;
        return;
    L19:
        if (r6 == Integer.MIN_VALUE) goto L24;
        if (r6 > 0) goto L24;
        scrollBy(r3, r4);
        return;
    L24:
        if (r7 == true) goto L26;
    L31:
        this.mViewFlinger.m2273c(r3, r4, r5, r6);
        return;
    L26:
        if (r3 == 0) goto L28;
        r1 = 1;
    L28:
        if (r4 == 0) goto L30;
        r1 = r1 | 2;
    L30:
        startNestedScroll(r1, 1);
        goto L31
    }

    public final void dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13, int r14, int[] r15) {
        getScrollingChildHelper().m595d(r9, r10, r11, r12, r13, r14, r15);
    }

    public void addItemDecoration(AbstractC2251mv r2) {
        addItemDecoration(r2, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams r3) {
        AbstractC1160i r0 = this.mLayout;
        if (r0 == null) goto L7;
        return r0.generateLayoutParams(r3);
    L7:
        throw new IllegalStateException(AbstractC0213Ey.m406d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
