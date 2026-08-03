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
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
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
    static final C0081Bv sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
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
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new InterpolatorC0844Tl(2);
        sDefaultEdgeEffectFactory = new C0081Bv();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(AbstractC1166o abstractC1166o) {
        View view = abstractC1166o.itemView;
        boolean z = view.getParent() == this;
        this.mRecycler.m2267n(getChildViewHolder(view));
        if (abstractC1166o.isTmpDetached()) {
            this.mChildHelper.m2229b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.mChildHelper.m2228a(view, -1, true);
            return;
        }
        C1153b c1153b = this.mChildHelper;
        int iIndexOfChild = c1153b.f4017a.f4930a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            c1153b.f4018b.m4260h(iIndexOfChild);
            c1153b.m2236i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    private void animateChange(AbstractC1166o abstractC1166o, AbstractC1166o abstractC1166o2, C2208lv c2208lv, C2208lv c2208lv2, boolean z, boolean z2) {
        abstractC1166o.setIsRecyclable(false);
        if (z) {
            addAnimatingView(abstractC1166o);
        }
        if (abstractC1166o != abstractC1166o2) {
            if (z2) {
                addAnimatingView(abstractC1166o2);
            }
            abstractC1166o.mShadowedHolder = abstractC1166o2;
            addAnimatingView(abstractC1166o);
            this.mRecycler.m2267n(abstractC1166o);
            abstractC1166o2.setIsRecyclable(false);
            abstractC1166o2.mShadowingHolder = abstractC1166o;
        }
        if (this.mItemAnimator.mo2246a(abstractC1166o, abstractC1166o2, c2208lv, c2208lv2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(AbstractC1166o abstractC1166o) {
        WeakReference<RecyclerView> weakReference = abstractC1166o.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == abstractC1166o.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            abstractC1166o.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && AbstractC0671Pj.m1352l(edgeEffect) != 0.0f) {
            int iRound = Math.round(AbstractC0671Pj.m1355t(edgeEffect, ((-i) * FLING_DESTRETCH_FACTOR) / i2, 0.5f) * ((-i2) / FLING_DESTRETCH_FACTOR));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || AbstractC0671Pj.m1352l(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = Math.round(AbstractC0671Pj.m1355t(edgeEffect2, (i * FLING_DESTRETCH_FACTOR) / f, 0.5f) * (f / FLING_DESTRETCH_FACTOR));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC1160i.class);
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                } catch (NoSuchMethodException e) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC1160i) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e7);
            }
        }
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        accessibilityEventObtain.setContentChangeTypes(i);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void dispatchLayoutStep1() {
        C2408qE c2408qE;
        this.mState.m57a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f84i = false;
        startInterceptRequestLayout();
        C2494sE c2494sE = this.mViewInfoStore;
        c2494sE.f8756a.clear();
        c2494sE.f8757b.m5166a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        C0038Av c0038Av = this.mState;
        c0038Av.f83h = c0038Av.f85j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        c0038Av.f82g = c0038Av.f86k;
        c0038Av.f80e = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f85j) {
            int iM2232e = this.mChildHelper.m2232e();
            for (int i = 0; i < iM2232e; i++) {
                AbstractC1166o childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m2231d(i));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    AbstractC1159h abstractC1159h = this.mItemAnimator;
                    AbstractC1159h.m2245b(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    abstractC1159h.getClass();
                    C2208lv c2208lv = new C2208lv();
                    c2208lv.m4444a(childViewHolderInt);
                    C2520sy c2520sy = this.mViewInfoStore.f8756a;
                    C2408qE c2408qEM4846a = (C2408qE) c2520sy.get(childViewHolderInt);
                    if (c2408qEM4846a == null) {
                        c2408qEM4846a = C2408qE.m4846a();
                        c2520sy.put(childViewHolderInt, c2408qEM4846a);
                    }
                    c2408qEM4846a.f8444b = c2208lv;
                    c2408qEM4846a.f8443a |= 4;
                    if (this.mState.f83h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f8757b.m5170e(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f86k) {
            saveOldPositions();
            C0038Av c0038Av2 = this.mState;
            boolean z = c0038Av2.f81f;
            c0038Av2.f81f = false;
            this.mLayout.onLayoutChildren(this.mRecycler, c0038Av2);
            this.mState.f81f = z;
            for (int i2 = 0; i2 < this.mChildHelper.m2232e(); i2++) {
                AbstractC1166o childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.m2231d(i2));
                if (!childViewHolderInt2.shouldIgnore() && ((c2408qE = (C2408qE) this.mViewInfoStore.f8756a.get(childViewHolderInt2)) == null || (c2408qE.f8443a & 4) == 0)) {
                    AbstractC1159h.m2245b(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    AbstractC1159h abstractC1159h2 = this.mItemAnimator;
                    childViewHolderInt2.getUnmodifiedPayloads();
                    abstractC1159h2.getClass();
                    C2208lv c2208lv2 = new C2208lv();
                    c2208lv2.m4444a(childViewHolderInt2);
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, c2208lv2);
                    } else {
                        C2520sy c2520sy2 = this.mViewInfoStore.f8756a;
                        C2408qE c2408qEM4846a2 = (C2408qE) c2520sy2.get(childViewHolderInt2);
                        if (c2408qEM4846a2 == null) {
                            c2408qEM4846a2 = C2408qE.m4846a();
                            c2520sy2.put(childViewHolderInt2, c2408qEM4846a2);
                        }
                        c2408qEM4846a2.f8443a |= 2;
                        c2408qEM4846a2.f8444b = c2208lv2;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f79d = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.m57a(6);
        this.mAdapterHelper.m2218c();
        this.mState.f80e = this.mAdapter.getItemCount();
        this.mState.f78c = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f9425c;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        C0038Av c0038Av = this.mState;
        c0038Av.f82g = false;
        this.mLayout.onLayoutChildren(this.mRecycler, c0038Av);
        C0038Av c0038Av2 = this.mState;
        c0038Av2.f81f = false;
        c0038Av2.f85j = c0038Av2.f85j && this.mItemAnimator != null;
        c0038Av2.f79d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void dispatchLayoutStep3() {
        boolean z;
        RecyclerView recyclerView;
        boolean zM2393g;
        boolean z2;
        boolean z3;
        this.mState.m57a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C0038Av c0038Av = this.mState;
        boolean z4 = true;
        c0038Av.f79d = 1;
        if (c0038Av.f85j) {
            for (int iM2232e = this.mChildHelper.m2232e() - 1; iM2232e >= 0; iM2232e--) {
                AbstractC1166o childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m2231d(iM2232e));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    this.mItemAnimator.getClass();
                    C2208lv c2208lv = new C2208lv();
                    c2208lv.m4444a(childViewHolderInt);
                    AbstractC1166o abstractC1166o = (AbstractC1166o) this.mViewInfoStore.f8757b.m5167b(changedHolderKey);
                    if (abstractC1166o == null || abstractC1166o.shouldIgnore()) {
                        this.mViewInfoStore.m4971a(childViewHolderInt, c2208lv);
                    } else {
                        C2408qE c2408qE = (C2408qE) this.mViewInfoStore.f8756a.get(abstractC1166o);
                        boolean z5 = (c2408qE == null || (c2408qE.f8443a & 1) == 0) ? false : true;
                        C2408qE c2408qE2 = (C2408qE) this.mViewInfoStore.f8756a.get(childViewHolderInt);
                        if (c2408qE2 == null || (c2408qE2.f8443a & 1) == 0) {
                            z2 = z5;
                            z3 = false;
                        } else {
                            z2 = z5;
                            z3 = true;
                        }
                        if (z2 && abstractC1166o == childViewHolderInt) {
                            this.mViewInfoStore.m4971a(childViewHolderInt, c2208lv);
                        } else {
                            C2208lv c2208lvM4972b = this.mViewInfoStore.m4972b(abstractC1166o, 4);
                            this.mViewInfoStore.m4971a(childViewHolderInt, c2208lv);
                            C2208lv c2208lvM4972b2 = this.mViewInfoStore.m4972b(childViewHolderInt, 8);
                            if (c2208lvM4972b == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, abstractC1166o);
                            } else {
                                animateChange(abstractC1166o, childViewHolderInt, c2208lvM4972b, c2208lvM4972b2, z2, z3);
                            }
                        }
                    }
                }
            }
            C2494sE c2494sE = this.mViewInfoStore;
            InterfaceC2451rE interfaceC2451rE = this.mViewInfoProcessCallback;
            C2520sy c2520sy = c2494sE.f8756a;
            int i = c2520sy.f8818c - 1;
            while (i >= 0) {
                AbstractC1166o abstractC1166o2 = (AbstractC1166o) c2520sy.m5002f(i);
                C2408qE c2408qE3 = (C2408qE) c2520sy.mo4h(i);
                int i2 = c2408qE3.f8443a;
                if ((i2 & 3) == 3) {
                    RecyclerView recyclerView2 = ((C1384ev) interfaceC2451rE).f4930a;
                    recyclerView2.mLayout.removeAndRecycleView(abstractC1166o2.itemView, recyclerView2.mRecycler);
                } else if ((i2 & 1) != 0) {
                    C2208lv c2208lv2 = c2408qE3.f8444b;
                    if (c2208lv2 == null) {
                        RecyclerView recyclerView3 = ((C1384ev) interfaceC2451rE).f4930a;
                        recyclerView3.mLayout.removeAndRecycleView(abstractC1166o2.itemView, recyclerView3.mRecycler);
                    } else {
                        C2208lv c2208lv3 = c2408qE3.f8445c;
                        RecyclerView recyclerView4 = ((C1384ev) interfaceC2451rE).f4930a;
                        recyclerView4.mRecycler.m2267n(abstractC1166o2);
                        recyclerView4.animateDisappearance(abstractC1166o2, c2208lv2, c2208lv3);
                    }
                } else if ((i2 & 14) == 14) {
                    ((C1384ev) interfaceC2451rE).f4930a.animateAppearance(abstractC1166o2, c2408qE3.f8444b, c2408qE3.f8445c);
                } else {
                    if ((i2 & 12) == 12) {
                        C2208lv c2208lv4 = c2408qE3.f8444b;
                        C2208lv c2208lv5 = c2408qE3.f8445c;
                        C1384ev c1384ev = (C1384ev) interfaceC2451rE;
                        c1384ev.getClass();
                        abstractC1166o2.setIsRecyclable(false);
                        RecyclerView recyclerView5 = c1384ev.f4930a;
                        if (!recyclerView5.mDataSetHasChangedAfterLayout) {
                            C1261cd c1261cd = (C1261cd) recyclerView5.mItemAnimator;
                            c1261cd.getClass();
                            int i3 = c2208lv4.f7695a;
                            int i4 = c2208lv5.f7695a;
                            if (i3 == i4) {
                                z = z4;
                                if (c2208lv4.f7696b == c2208lv5.f7696b) {
                                    c1261cd.m2247c(abstractC1166o2);
                                    zM2393g = false;
                                    recyclerView = recyclerView5;
                                }
                                if (!zM2393g) {
                                    recyclerView.postAnimationRunner();
                                }
                            } else {
                                z = z4;
                            }
                            recyclerView = recyclerView5;
                            zM2393g = c1261cd.m2393g(abstractC1166o2, i3, c2208lv4.f7696b, i4, c2208lv5.f7696b);
                            if (!zM2393g) {
                            }
                        } else if (recyclerView5.mItemAnimator.mo2246a(abstractC1166o2, abstractC1166o2, c2208lv4, c2208lv5)) {
                            recyclerView5.postAnimationRunner();
                        }
                    } else {
                        z = z4;
                        if ((i2 & 4) != 0) {
                            C2208lv c2208lv6 = c2408qE3.f8444b;
                            RecyclerView recyclerView6 = ((C1384ev) interfaceC2451rE).f4930a;
                            recyclerView6.mRecycler.m2267n(abstractC1166o2);
                            recyclerView6.animateDisappearance(abstractC1166o2, c2208lv6, null);
                        } else if ((i2 & 8) != 0) {
                            ((C1384ev) interfaceC2451rE).f4930a.animateAppearance(abstractC1166o2, c2408qE3.f8444b, c2408qE3.f8445c);
                        }
                    }
                    c2408qE3.f8443a = 0;
                    c2408qE3.f8444b = null;
                    c2408qE3.f8445c = null;
                    C2408qE.f8442d.mo1934a(c2408qE3);
                    i--;
                    z4 = z;
                }
                z = z4;
                c2408qE3.f8443a = 0;
                c2408qE3.f8444b = null;
                c2408qE3.f8445c = null;
                C2408qE.f8442d.mo1934a(c2408qE3);
                i--;
                z4 = z;
            }
        }
        boolean z6 = z4;
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        C0038Av c0038Av2 = this.mState;
        c0038Av2.f77b = c0038Av2.f80e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        c0038Av2.f85j = false;
        c0038Av2.f86k = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList arrayList = this.mRecycler.f4040b;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i.mPrefetchMaxObservedInInitialPrefetch) {
            abstractC1160i.mPrefetchMaxCountObserved = 0;
            abstractC1160i.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.m2268o();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        C2494sE c2494sE2 = this.mViewInfoStore;
        c2494sE2.f8756a.clear();
        c2494sE2.f8757b.m5166a();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[z6 ? 1 : 0])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        InterfaceC2560tv interfaceC2560tv = this.mInterceptingOnItemTouchListener;
        if (interfaceC2560tv == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        interfaceC2560tv.mo1552a(motionEvent);
        int action = motionEvent.getAction();
        if (action != 3 && action != 1) {
            return true;
        }
        this.mInterceptingOnItemTouchListener = null;
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            InterfaceC2560tv interfaceC2560tv = this.mOnItemTouchListeners.get(i);
            if (interfaceC2560tv.mo1553b(motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = interfaceC2560tv;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int iM2232e = this.mChildHelper.m2232e();
        if (iM2232e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM2232e; i3++) {
            AbstractC1166o childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m2231d(i3));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        AbstractC1166o abstractC1166oFindViewHolderForAdapterPosition;
        C0038Av c0038Av = this.mState;
        int i = c0038Av.f87l;
        if (i == -1) {
            i = 0;
        }
        int iM58b = c0038Av.m58b();
        for (int i2 = i; i2 < iM58b; i2++) {
            AbstractC1166o abstractC1166oFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (abstractC1166oFindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (abstractC1166oFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return abstractC1166oFindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(iM58b, i);
        do {
            iMin--;
            if (iMin < 0 || (abstractC1166oFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!abstractC1166oFindViewHolderForAdapterPosition.itemView.hasFocusable());
        return abstractC1166oFindViewHolderForAdapterPosition.itemView;
    }

    public static AbstractC1166o getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((C2431qv) view.getLayoutParams()).f8526a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        C2431qv c2431qv = (C2431qv) view.getLayoutParams();
        Rect rect2 = c2431qv.f8527b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c2431qv).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c2431qv).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c2431qv).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c2431qv).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private C0293Gs getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C0293Gs(this);
        }
        return this.mScrollingChildHelper;
    }

    private float getSplineFlingDistance(int i) {
        double dLog = Math.log((Math.abs(i) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f = DECELERATION_RATE;
        return (float) (Math.exp((((double) f) / (((double) f) - 1.0d)) * dLog) * ((double) (this.mPhysicalCoef * SCROLL_FRICTION)));
    }

    private void handleMissingPreInfoForChangeError(long j, AbstractC1166o abstractC1166o, AbstractC1166o abstractC1166o2) {
        int iM2232e = this.mChildHelper.m2232e();
        for (int i = 0; i < iM2232e; i++) {
            AbstractC1166o childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m2231d(i));
            if (childViewHolderInt != abstractC1166o && getChangedHolderKey(childViewHolderInt) == j) {
                AbstractC1158g abstractC1158g = this.mAdapter;
                if (abstractC1158g == null || !abstractC1158g.hasStableIds()) {
                    StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(" \n View Holder 2:");
                    sb.append(abstractC1166o);
                    throw new IllegalStateException(AbstractC0213Ey.m406d(this, sb));
                }
                StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(" \n View Holder 2:");
                sb2.append(abstractC1166o);
                throw new IllegalStateException(AbstractC0213Ey.m406d(this, sb2));
            }
        }
        Objects.toString(abstractC1166o2);
        Objects.toString(abstractC1166o);
        exceptionLabel();
    }

    private boolean hasUpdatedView() {
        int iM2232e = this.mChildHelper.m2232e();
        for (int i = 0; i < iM2232e; i++) {
            AbstractC1166o childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m2231d(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        if (AbstractC1448gE.m2772a(this) == 0) {
            AbstractC1448gE.m2773b(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C1153b(new C1384ev(this));
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        byte b = -1;
        int i3 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i4 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i2 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            b = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                b = 0;
            }
        }
        if (i == 1) {
            return b < 0 || (b == 0 && i2 * i3 < 0);
        }
        if (i == 2) {
            return b > 0 || (b == 0 && i2 * i3 > 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return b < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return b > 0;
        }
        StringBuilder sb = new StringBuilder("Invalid direction: ");
        sb.append(i);
        throw new IllegalArgumentException(AbstractC0213Ey.m406d(this, sb));
    }

    private void nestedScrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i == null || this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = abstractC1160i.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        int i4 = zCanScrollVertically ? (zCanScrollHorizontally ? 1 : 0) | 2 : zCanScrollHorizontally ? 1 : 0;
        float height = motionEvent == null ? getHeight() / 2.0f : motionEvent.getY();
        float width = motionEvent == null ? getWidth() / 2.0f : motionEvent.getX();
        int iReleaseHorizontalGlow = i - releaseHorizontalGlow(i, height);
        int iReleaseVerticalGlow = i2 - releaseVerticalGlow(i2, width);
        startNestedScroll(i4, i3);
        if (dispatchNestedPreScroll(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, i3)) {
            int[] iArr2 = this.mReusableIntPair;
            iReleaseHorizontalGlow -= iArr2[0];
            iReleaseVerticalGlow -= iArr2[1];
        }
        scrollByInternal(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, motionEvent, i3);
        RunnableC1155d runnableC1155d = this.mGapWorker;
        if (runnableC1155d != null && (iReleaseHorizontalGlow != 0 || iReleaseVerticalGlow != 0)) {
            runnableC1155d.m2242a(this, iReleaseHorizontalGlow, iReleaseVerticalGlow);
        }
        stopNestedScroll(i3);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z;
        boolean z2 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            C1152a c1152a = this.mAdapterHelper;
            c1152a.m2226k(c1152a.f4012b);
            c1152a.m2226k(c1152a.f4013c);
            c1152a.f4016f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.m2225j();
        } else {
            this.mAdapterHelper.m2218c();
        }
        boolean z3 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f85j = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z = this.mDataSetHasChangedAfterLayout) || z3 || this.mLayout.mRequestedSimpleAnimations) && (!z || this.mAdapter.hasStableIds());
        C0038Av c0038Av = this.mState;
        if (c0038Av.f85j && z3 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z2 = true;
        }
        c0038Av.f86k = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pullGlows(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2 = true;
        if (f2 < 0.0f) {
            ensureLeftGlow();
            AbstractC0671Pj.m1355t(this.mLeftGlow, (-f2) / getWidth(), 1.0f - (f3 / getHeight()));
        } else {
            if (f2 <= 0.0f) {
                z = false;
                if (f4 >= 0.0f) {
                    ensureTopGlow();
                    AbstractC0671Pj.m1355t(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
                } else if (f4 > 0.0f) {
                    ensureBottomGlow();
                    AbstractC0671Pj.m1355t(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
                } else {
                    z2 = z;
                }
                if (z2 && f2 == 0.0f && f4 == 0.0f) {
                    return;
                }
                WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                postInvalidateOnAnimation();
            }
            ensureRightGlow();
            AbstractC0671Pj.m1355t(this.mRightGlow, f2 / getWidth(), f3 / getHeight());
        }
        z = true;
        if (f4 >= 0.0f) {
        }
        if (z2) {
        }
        WeakHashMap weakHashMap2 = AbstractC2185lE.f7617a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void recoverFocusFromState() {
        View viewFindViewById;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.f4019c.contains(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.m2232e() == 0) {
                requestFocus();
                return;
            }
        }
        View viewFindNextViewToFocus = null;
        AbstractC1166o abstractC1166oFindViewHolderForItemId = (this.mState.f88m == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f88m);
        if (abstractC1166oFindViewHolderForItemId != null) {
            if (!this.mChildHelper.f4019c.contains(abstractC1166oFindViewHolderForItemId.itemView) && abstractC1166oFindViewHolderForItemId.itemView.hasFocusable()) {
                viewFindNextViewToFocus = abstractC1166oFindViewHolderForItemId.itemView;
            } else if (this.mChildHelper.m2232e() > 0) {
                viewFindNextViewToFocus = findNextViewToFocus();
            }
        }
        if (viewFindNextViewToFocus != null) {
            int i = this.mState.f89n;
            if (i != -1 && (viewFindViewById = viewFindNextViewToFocus.findViewById(i)) != null && viewFindViewById.isFocusable()) {
                viewFindNextViewToFocus = viewFindViewById;
            }
            viewFindNextViewToFocus.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            postInvalidateOnAnimation();
        }
    }

    private int releaseHorizontalGlow(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f2 = 0.0f;
        if (edgeEffect == null || AbstractC0671Pj.m1352l(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && AbstractC0671Pj.m1352l(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float fM1355t = AbstractC0671Pj.m1355t(this.mRightGlow, width, height);
                    if (AbstractC0671Pj.m1352l(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f2 = fM1355t;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f3 = -AbstractC0671Pj.m1355t(this.mLeftGlow, -width, 1.0f - height);
                if (AbstractC0671Pj.m1352l(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getWidth());
    }

    private int releaseVerticalGlow(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f2 = 0.0f;
        if (edgeEffect == null || AbstractC0671Pj.m1352l(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && AbstractC0671Pj.m1352l(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float fM1355t = AbstractC0671Pj.m1355t(this.mBottomGlow, height, 1.0f - width);
                    if (AbstractC0671Pj.m1352l(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f2 = fM1355t;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f3 = -AbstractC0671Pj.m1355t(this.mTopGlow, -height, width);
                if (AbstractC0671Pj.m1352l(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        }
        return Math.round(f2 * getHeight());
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C2431qv) {
            C2431qv c2431qv = (C2431qv) layoutParams;
            if (!c2431qv.f8528c) {
                Rect rect = c2431qv.f8527b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        C0038Av c0038Av = this.mState;
        c0038Av.f88m = -1L;
        c0038Av.f87l = -1;
        c0038Av.f89n = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        AbstractC1166o abstractC1166oFindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (abstractC1166oFindContainingViewHolder == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f88m = this.mAdapter.hasStableIds() ? abstractC1166oFindContainingViewHolder.getItemId() : -1L;
        this.mState.f87l = this.mDataSetHasChangedAfterLayout ? -1 : abstractC1166oFindContainingViewHolder.isRemoved() ? abstractC1166oFindContainingViewHolder.mOldPosition : abstractC1166oFindContainingViewHolder.getAbsoluteAdapterPosition();
        this.mState.f89n = getDeepestFocusedViewWithId(abstractC1166oFindContainingViewHolder.itemView);
    }

    private void setAdapterInternal(AbstractC1158g abstractC1158g, boolean z, boolean z2) {
        AbstractC1158g abstractC1158g2 = this.mAdapter;
        if (abstractC1158g2 != null) {
            abstractC1158g2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        C1152a c1152a = this.mAdapterHelper;
        c1152a.m2226k(c1152a.f4012b);
        c1152a.m2226k(c1152a.f4013c);
        c1152a.f4016f = 0;
        AbstractC1158g abstractC1158g3 = this.mAdapter;
        this.mAdapter = abstractC1158g;
        if (abstractC1158g != null) {
            abstractC1158g.registerAdapterDataObserver(this.mObserver);
            abstractC1158g.onAttachedToRecyclerView(this);
        }
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i != null) {
            abstractC1160i.onAdapterChanged(abstractC1158g3, this.mAdapter);
        }
        C1161j c1161j = this.mRecycler;
        AbstractC1158g abstractC1158g4 = this.mAdapter;
        c1161j.f4039a.clear();
        c1161j.m2261h();
        c1161j.m2260g(abstractC1158g3, true);
        C2689wv c2689wvM2257c = c1161j.m2257c();
        if (abstractC1158g3 != null) {
            c2689wvM2257c.f9257b--;
        }
        if (!z && c2689wvM2257c.f9257b == 0) {
            SparseArray sparseArray = c2689wvM2257c.f9256a;
            for (int i = 0; i < sparseArray.size(); i++) {
                C2646vv c2646vv = (C2646vv) sparseArray.valueAt(i);
                Iterator it = c2646vv.f9158a.iterator();
                while (it.hasNext()) {
                    AbstractC0671Pj.m1345c(((AbstractC1166o) it.next()).itemView);
                }
                c2646vv.f9158a.clear();
            }
        }
        if (abstractC1158g4 != null) {
            c2689wvM2257c.f9257b++;
        } else {
            c2689wvM2257c.getClass();
        }
        c1161j.m2259f();
        this.mState.f81f = true;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        sDebugAssertionsEnabled = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        sVerboseLoggingEnabled = z;
    }

    private boolean shouldAbsorb(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        return getSplineFlingDistance(-i) < AbstractC0671Pj.m1352l(edgeEffect) * ((float) i2);
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || AbstractC0671Pj.m1352l(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
            z = false;
        } else {
            AbstractC0671Pj.m1355t(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z = true;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && AbstractC0671Pj.m1352l(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            AbstractC0671Pj.m1355t(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
            z = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && AbstractC0671Pj.m1352l(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            AbstractC0671Pj.m1355t(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 == null || AbstractC0671Pj.m1352l(edgeEffect4) == 0.0f || canScrollVertically(1)) {
            return z;
        }
        AbstractC0671Pj.m1355t(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void stopScrollersInternal() {
        RunnableC1165n runnableC1165n = this.mViewFlinger;
        runnableC1165n.f4060g.removeCallbacks(runnableC1165n);
        runnableC1165n.f4056c.abortAnimation();
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i != null) {
            abstractC1160i.stopSmoothScroller();
        }
    }

    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i == null || !abstractC1160i.onAddFocusables(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public void addItemDecoration(AbstractC2251mv abstractC2251mv, int i) {
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i != null) {
            abstractC1160i.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(abstractC2251mv);
        } else {
            this.mItemDecorations.add(i, abstractC2251mv);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(InterfaceC2474rv interfaceC2474rv) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(interfaceC2474rv);
    }

    public void addOnItemTouchListener(InterfaceC2560tv interfaceC2560tv) {
        this.mOnItemTouchListeners.add(interfaceC2560tv);
    }

    public void addOnScrollListener(AbstractC2603uv abstractC2603uv) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(abstractC2603uv);
    }

    public void addRecyclerListener(InterfaceC2732xv interfaceC2732xv) {
        AbstractC1293cr.m2545d("'listener' arg cannot be null.", interfaceC2732xv != null);
        this.mRecyclerListeners.add(interfaceC2732xv);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void animateAppearance(AbstractC1166o abstractC1166o, C2208lv c2208lv, C2208lv c2208lv2) {
        boolean zM2393g;
        abstractC1166o.setIsRecyclable(false);
        C1261cd c1261cd = (C1261cd) this.mItemAnimator;
        if (c2208lv != null) {
            c1261cd.getClass();
            int i = c2208lv.f7695a;
            int i2 = c2208lv2.f7695a;
            if (i == i2 && c2208lv.f7696b == c2208lv2.f7696b) {
                c1261cd.m2397l(abstractC1166o);
                abstractC1166o.itemView.setAlpha(0.0f);
                c1261cd.f4278i.add(abstractC1166o);
                zM2393g = true;
            } else {
                zM2393g = c1261cd.m2393g(abstractC1166o, i, c2208lv.f7696b, i2, c2208lv2.f7696b);
            }
        }
        if (zM2393g) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(AbstractC1166o abstractC1166o, C2208lv c2208lv, C2208lv c2208lv2) {
        boolean zM2393g;
        addAnimatingView(abstractC1166o);
        abstractC1166o.setIsRecyclable(false);
        C1261cd c1261cd = (C1261cd) this.mItemAnimator;
        c1261cd.getClass();
        int i = c2208lv.f7695a;
        int i2 = c2208lv.f7696b;
        View view = abstractC1166o.itemView;
        int left = c2208lv2 == null ? view.getLeft() : c2208lv2.f7695a;
        int top = c2208lv2 == null ? view.getTop() : c2208lv2.f7696b;
        if (abstractC1166o.isRemoved() || (i == left && i2 == top)) {
            c1261cd.m2397l(abstractC1166o);
            c1261cd.f4277h.add(abstractC1166o);
            zM2393g = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zM2393g = c1261cd.m2393g(abstractC1166o, i, i2, left, top);
        }
        if (zM2393g) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException(AbstractC0213Ey.m406d(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        throw new IllegalStateException(AbstractC0213Ey.m406d(this, sb));
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(AbstractC0213Ey.m406d(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.mDispatchScrollCounter > 0) {
            new IllegalStateException(AbstractC0213Ey.m406d(this, new StringBuilder("")));
        }
    }

    public boolean canReuseUpdatedViewHolder(AbstractC1166o abstractC1166o) {
        AbstractC1159h abstractC1159h = this.mItemAnimator;
        if (abstractC1159h != null) {
            return (abstractC1166o.getUnmodifiedPayloads().isEmpty() && ((C1261cd) abstractC1159h).f4276g && !abstractC1166o.isInvalid()) ? false : true;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C2431qv) && this.mLayout.checkLayoutParams((C2431qv) layoutParams);
    }

    public void clearOldPositions() {
        int iM2235h = this.mChildHelper.m2235h();
        for (int i = 0; i < iM2235h; i++) {
            AbstractC1166o childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m2234g(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        C1161j c1161j = this.mRecycler;
        ArrayList arrayList = c1161j.f4039a;
        ArrayList arrayList2 = c1161j.f4041c;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((AbstractC1166o) arrayList2.get(i2)).clearOldPosition();
        }
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((AbstractC1166o) arrayList.get(i3)).clearOldPosition();
        }
        ArrayList arrayList3 = c1161j.f4040b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((AbstractC1166o) c1161j.f4040b.get(i4)).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<InterfaceC2474rv> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<AbstractC2603uv> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i != null && abstractC1160i.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i != null && abstractC1160i.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i != null && abstractC1160i.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i != null && abstractC1160i.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i != null && abstractC1160i.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i != null && abstractC1160i.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            postInvalidateOnAnimation();
        }
    }

    public int consumeFlingInHorizontalStretch(int i) {
        return consumeFlingInStretch(i, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i) {
        return consumeFlingInStretch(i, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            int i = AbstractC2792zB.f9460a;
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.m2222g()) {
            C1152a c1152a = this.mAdapterHelper;
            int i2 = c1152a.f4016f;
            if ((i2 & 4) == 0 || (i2 & 11) != 0) {
                if (c1152a.m2222g()) {
                    int i3 = AbstractC2792zB.f9460a;
                    Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i4 = AbstractC2792zB.f9460a;
            Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.m2225j();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.m2217b();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            Trace.endSection();
        }
    }

    public void defaultOnMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        setMeasuredDimension(AbstractC1160i.chooseSize(i, paddingRight, getMinimumWidth()), AbstractC1160i.chooseSize(i2, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view) {
        AbstractC1166o childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        AbstractC1158g abstractC1158g = this.mAdapter;
        if (abstractC1158g != null && childViewHolderInt != null) {
            abstractC1158g.onViewAttachedToWindow(childViewHolderInt);
        }
        List<InterfaceC2474rv> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewAttachedToWindow(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        AbstractC1166o childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        AbstractC1158g abstractC1158g = this.mAdapter;
        if (abstractC1158g != null && childViewHolderInt != null) {
            abstractC1158g.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<InterfaceC2474rv> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).onChildViewDetachedFromWindow(view);
            }
        }
    }

    public void dispatchLayout() {
        if (this.mAdapter == null || this.mLayout == null) {
            return;
        }
        this.mState.f84i = false;
        boolean z = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f79d == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            C1152a c1152a = this.mAdapterHelper;
            if ((c1152a.f4013c.isEmpty() || c1152a.f4012b.isEmpty()) && !z && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            }
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m592a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m593b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m594c(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m595d(i, i2, i3, i4, iArr, 0, null);
    }

    public void dispatchOnScrollStateChanged(int i) {
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i != null) {
            abstractC1160i.onScrollStateChanged(i);
        }
        onScrollStateChanged(i);
        AbstractC2603uv abstractC2603uv = this.mScrollListener;
        if (abstractC2603uv != null) {
            abstractC2603uv.onScrollStateChanged(this, i);
        }
        List<AbstractC2603uv> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i);
            }
        }
    }

    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        AbstractC2603uv abstractC2603uv = this.mScrollListener;
        if (abstractC2603uv != null) {
            abstractC2603uv.onScrolled(this, i, i2);
        }
        List<AbstractC2603uv> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            AbstractC1166o abstractC1166o = this.mPendingAccessibilityImportanceChange.get(size);
            if (abstractC1166o.itemView.getParent() == this && !abstractC1166o.shouldIgnore() && (i = abstractC1166o.mPendingAccessibilityState) != -1) {
                View view = abstractC1166o.itemView;
                WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                view.setImportantForAccessibility(i);
                abstractC1166o.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.mo2250f()) ? z : true) {
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        ((C0081Bv) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mBottomGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        ((C0081Bv) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mLeftGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        ((C0081Bv) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mRightGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        ((C0081Bv) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mTopGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(C0038Av c0038Av) {
        if (getScrollState() != 2) {
            c0038Av.getClass();
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f4056c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        c0038Av.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public View findChildViewUnder(float f, float f2) {
        for (int iM2232e = this.mChildHelper.m2232e() - 1; iM2232e >= 0; iM2232e--) {
            View viewM2231d = this.mChildHelper.m2231d(iM2232e);
            float translationX = viewM2231d.getTranslationX();
            float translationY = viewM2231d.getTranslationY();
            if (f >= viewM2231d.getLeft() + translationX && f <= viewM2231d.getRight() + translationX && f2 >= viewM2231d.getTop() + translationY && f2 <= viewM2231d.getBottom() + translationY) {
                return viewM2231d;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public AbstractC1166o findContainingViewHolder(View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    public AbstractC1166o findViewHolderForAdapterPosition(int i) {
        AbstractC1166o abstractC1166o = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iM2235h = this.mChildHelper.m2235h();
        for (int i2 = 0; i2 < iM2235h; i2++) {
            AbstractC1166o childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m2234g(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                C1153b c1153b = this.mChildHelper;
                if (!c1153b.f4019c.contains(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                abstractC1166o = childViewHolderInt;
            }
        }
        return abstractC1166o;
    }

    public AbstractC1166o findViewHolderForItemId(long j) {
        AbstractC1158g abstractC1158g = this.mAdapter;
        AbstractC1166o abstractC1166o = null;
        if (abstractC1158g != null && abstractC1158g.hasStableIds()) {
            int iM2235h = this.mChildHelper.m2235h();
            for (int i = 0; i < iM2235h; i++) {
                AbstractC1166o childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m2234g(i));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j) {
                    C1153b c1153b = this.mChildHelper;
                    if (!c1153b.f4019c.contains(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    abstractC1166o = childViewHolderInt;
                }
            }
        }
        return abstractC1166o;
    }

    public AbstractC1166o findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Deprecated
    public AbstractC1166o findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean fling(int i, int i2) {
        int iMax;
        int i3;
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i == null || this.mLayoutSuppressed) {
            return false;
        }
        int iCanScrollHorizontally = abstractC1160i.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (iCanScrollHorizontally == 0 || Math.abs(i) < this.mMinFlingVelocity) {
            i = 0;
        }
        if (!zCanScrollVertically || Math.abs(i2) < this.mMinFlingVelocity) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        if (i == 0) {
            iMax = 0;
        } else {
            EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect == null || AbstractC0671Pj.m1352l(edgeEffect) == 0.0f) {
                EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 != null && AbstractC0671Pj.m1352l(edgeEffect2) != 0.0f) {
                    if (shouldAbsorb(this.mRightGlow, i, getWidth())) {
                        this.mRightGlow.onAbsorb(i);
                        i = 0;
                    }
                    iMax = i;
                    i = 0;
                }
                iMax = 0;
            } else {
                int i4 = -i;
                if (shouldAbsorb(this.mLeftGlow, i4, getWidth())) {
                    this.mLeftGlow.onAbsorb(i4);
                    i = 0;
                }
                iMax = i;
                i = 0;
            }
        }
        if (i2 == 0) {
            i3 = i2;
            i2 = 0;
        } else {
            EdgeEffect edgeEffect3 = this.mTopGlow;
            if (edgeEffect3 == null || AbstractC0671Pj.m1352l(edgeEffect3) == 0.0f) {
                EdgeEffect edgeEffect4 = this.mBottomGlow;
                if (edgeEffect4 != null && AbstractC0671Pj.m1352l(edgeEffect4) != 0.0f) {
                    if (shouldAbsorb(this.mBottomGlow, i2, getHeight())) {
                        this.mBottomGlow.onAbsorb(i2);
                        i2 = 0;
                    }
                    i3 = 0;
                }
                i3 = i2;
                i2 = 0;
            } else {
                int i5 = -i2;
                if (shouldAbsorb(this.mTopGlow, i5, getHeight())) {
                    this.mTopGlow.onAbsorb(i5);
                    i2 = 0;
                }
                i3 = 0;
            }
        }
        if (iMax != 0 || i2 != 0) {
            int i6 = this.mMaxFlingVelocity;
            iMax = Math.max(-i6, Math.min(iMax, i6));
            int i7 = this.mMaxFlingVelocity;
            i2 = Math.max(-i7, Math.min(i2, i7));
            this.mViewFlinger.m2271a(iMax, i2);
        }
        if (i == 0 && i3 == 0) {
            return (iMax == 0 && i2 == 0) ? false : true;
        }
        float f = i;
        float f2 = i3;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f, f2, z);
            AbstractC2517sv abstractC2517sv = this.mOnFlingListener;
            if (abstractC2517sv != null && abstractC2517sv.onFling(i, i3)) {
                return true;
            }
            if (z) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i8 = this.mMaxFlingVelocity;
                int iMax2 = Math.max(-i8, Math.min(i, i8));
                int i9 = this.mMaxFlingVelocity;
                this.mViewFlinger.m2271a(iMax2, Math.max(-i9, Math.min(i3, i9)));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i) {
        View viewOnFocusSearchFailed;
        boolean z;
        View viewOnInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i);
        if (viewOnInterceptFocusSearch != null) {
            return viewOnInterceptFocusSearch;
        }
        boolean z2 = (this.mAdapter == null || this.mLayout == null || isComputingLayout() || this.mLayoutSuppressed) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z2 && (i == 2 || i == 1)) {
            if (this.mLayout.canScrollVertically()) {
                int i2 = i == 2 ? 130 : 33;
                z = focusFinder.findNextFocus(this, view, i2) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.canScrollHorizontally()) {
                int i3 = (this.mLayout.getLayoutDirection() == 1) ^ (i == 2) ? 66 : 17;
                boolean z3 = focusFinder.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
                z = z3;
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            viewOnFocusSearchFailed = focusFinder.findNextFocus(this, view, i);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
            if (viewFindNextFocus == null && z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                viewOnFocusSearchFailed = this.mLayout.onFocusSearchFailed(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                viewOnFocusSearchFailed = viewFindNextFocus;
            }
        }
        if (viewOnFocusSearchFailed == null || viewOnFocusSearchFailed.hasFocusable()) {
            return isPreferredNextFocus(view, viewOnFocusSearchFailed, i) ? viewOnFocusSearchFailed : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        requestChildOnScreen(viewOnFocusSearchFailed, null);
        return view;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i != null) {
            return abstractC1160i.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(AbstractC0213Ey.m406d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i != null) {
            return abstractC1160i.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(AbstractC0213Ey.m406d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public AbstractC1158g getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(AbstractC1166o abstractC1166o) {
        if (abstractC1166o.hasAnyOfTheFlags(524) || !abstractC1166o.isBound()) {
            return -1;
        }
        C1152a c1152a = this.mAdapterHelper;
        int i = abstractC1166o.mPosition;
        ArrayList arrayList = c1152a.f4012b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1347e1 c1347e1 = (C1347e1) arrayList.get(i2);
            int i3 = c1347e1.f4841a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c1347e1.f4842b;
                    if (i4 <= i) {
                        int i5 = c1347e1.f4844d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c1347e1.f4842b;
                    if (i6 == i) {
                        i = c1347e1.f4844d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c1347e1.f4844d <= i) {
                            i++;
                        }
                    }
                }
            } else if (c1347e1.f4842b <= i) {
                i += c1347e1.f4844d;
            }
        }
        return i;
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC1160i abstractC1160i = this.mLayout;
        return abstractC1160i != null ? abstractC1160i.getBaseline() : super.getBaseline();
    }

    public long getChangedHolderKey(AbstractC1166o abstractC1166o) {
        return this.mAdapter.hasStableIds() ? abstractC1166o.getItemId() : abstractC1166o.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        AbstractC1166o childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    public long getChildItemId(View view) {
        AbstractC1166o childViewHolderInt;
        AbstractC1158g abstractC1158g = this.mAdapter;
        if (abstractC1158g == null || !abstractC1158g.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        AbstractC1166o childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public AbstractC1166o getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public C0210Ev getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public AbstractC2117jv getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public AbstractC1159h getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        C2431qv c2431qv = (C2431qv) view.getLayoutParams();
        boolean z = c2431qv.f8528c;
        Rect rect = c2431qv.f8527b;
        if (!z || (this.mState.f82g && (c2431qv.f8526a.isUpdated() || c2431qv.f8526a.isInvalid()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i2 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        c2431qv.f8528c = false;
        return rect;
    }

    public AbstractC2251mv getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.mItemDecorations.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
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
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
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
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.m2222g();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new C1152a(new C1157f(this));
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(AbstractC0213Ey.m406d(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new C1545ih(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(io.github.cherrywechat.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(io.github.cherrywechat.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(io.github.cherrywechat.R.dimen.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i != null) {
            abstractC1160i.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        AbstractC1159h abstractC1159h = this.mItemAnimator;
        return abstractC1159h != null && abstractC1159h.mo2250f();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
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

    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int iM2235h = this.mChildHelper.m2235h();
        for (int i = 0; i < iM2235h; i++) {
            ((C2431qv) this.mChildHelper.m2234g(i).getLayoutParams()).f8528c = true;
        }
        ArrayList arrayList = this.mRecycler.f4041c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C2431qv c2431qv = (C2431qv) ((AbstractC1166o) arrayList.get(i2)).itemView.getLayoutParams();
            if (c2431qv != null) {
                c2431qv.f8528c = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int iM2235h = this.mChildHelper.m2235h();
        for (int i = 0; i < iM2235h; i++) {
            AbstractC1166o childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m2234g(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        C1161j c1161j = this.mRecycler;
        ArrayList arrayList = c1161j.f4041c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC1166o abstractC1166o = (AbstractC1166o) arrayList.get(i2);
            if (abstractC1166o != null) {
                abstractC1166o.addFlags(6);
                abstractC1166o.addChangePayload(null);
            }
        }
        AbstractC1158g abstractC1158g = c1161j.f4046h.mAdapter;
        if (abstractC1158g == null || !abstractC1158g.hasStableIds()) {
            c1161j.m2261h();
        }
    }

    public void nestedScrollBy(int i, int i2) {
        nestedScrollByInternal(i, i2, null, 1);
    }

    public void offsetChildrenHorizontal(int i) {
        int iM2232e = this.mChildHelper.m2232e();
        for (int i2 = 0; i2 < iM2232e; i2++) {
            this.mChildHelper.m2231d(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        int iM2232e = this.mChildHelper.m2232e();
        for (int i2 = 0; i2 < iM2232e; i2++) {
            this.mChildHelper.m2231d(i2).offsetTopAndBottom(i);
        }
    }

    public void offsetPositionRecordsForInsert(int i, int i2) {
        int iM2235h = this.mChildHelper.m2235h();
        for (int i3 = 0; i3 < iM2235h; i3++) {
            AbstractC1166o childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m2234g(i3));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                if (sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
                childViewHolderInt.offsetPosition(i2, false);
                this.mState.f81f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f4041c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC1166o abstractC1166o = (AbstractC1166o) arrayList.get(i4);
            if (abstractC1166o != null && abstractC1166o.mPosition >= i) {
                if (sVerboseLoggingEnabled) {
                    abstractC1166o.toString();
                }
                abstractC1166o.offsetPosition(i2, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM2235h = this.mChildHelper.m2235h();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iM2235h; i11++) {
            AbstractC1166o childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m2234g(i11));
            if (childViewHolderInt != null && (i9 = childViewHolderInt.mPosition) >= i4 && i9 <= i3) {
                if (sVerboseLoggingEnabled) {
                    childViewHolderInt.toString();
                }
                if (childViewHolderInt.mPosition == i) {
                    childViewHolderInt.offsetPosition(i2 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i5, false);
                }
                this.mState.f81f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f4041c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i10 = 1;
            i7 = i2;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC1166o abstractC1166o = (AbstractC1166o) arrayList.get(i12);
            if (abstractC1166o != null && (i8 = abstractC1166o.mPosition) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    abstractC1166o.offsetPosition(i2 - i, false);
                } else {
                    abstractC1166o.offsetPosition(i10, false);
                }
                if (sVerboseLoggingEnabled) {
                    abstractC1166o.toString();
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iM2235h = this.mChildHelper.m2235h();
        for (int i4 = 0; i4 < iM2235h; i4++) {
            AbstractC1166o childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m2234g(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i5 = childViewHolderInt.mPosition;
                if (i5 >= i3) {
                    if (sVerboseLoggingEnabled) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.offsetPosition(-i2, z);
                    this.mState.f81f = true;
                } else if (i5 >= i) {
                    if (sVerboseLoggingEnabled) {
                        childViewHolderInt.toString();
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.mState.f81f = true;
                }
            }
        }
        C1161j c1161j = this.mRecycler;
        ArrayList arrayList = c1161j.f4041c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC1166o abstractC1166o = (AbstractC1166o) arrayList.get(size);
            if (abstractC1166o != null) {
                int i6 = abstractC1166o.mPosition;
                if (i6 >= i3) {
                    if (sVerboseLoggingEnabled) {
                        abstractC1166o.toString();
                    }
                    abstractC1166o.offsetPosition(-i2, z);
                } else if (i6 >= i) {
                    abstractC1166o.addFlags(8);
                    c1161j.m2262i(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        this.mRecycler.m2259f();
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i != null) {
            abstractC1160i.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal threadLocal = RunnableC1155d.f4024e;
            RunnableC1155d runnableC1155d = (RunnableC1155d) threadLocal.get();
            this.mGapWorker = runnableC1155d;
            if (runnableC1155d == null) {
                RunnableC1155d runnableC1155d2 = new RunnableC1155d();
                runnableC1155d2.f4026a = new ArrayList();
                runnableC1155d2.f4029d = new ArrayList();
                this.mGapWorker = runnableC1155d2;
                WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                    RunnableC1155d runnableC1155d3 = this.mGapWorker;
                    runnableC1155d3.f4028c = (long) (1.0E9f / refreshRate);
                    threadLocal.set(runnableC1155d3);
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                    }
                    RunnableC1155d runnableC1155d32 = this.mGapWorker;
                    runnableC1155d32.f4028c = (long) (1.0E9f / refreshRate);
                    threadLocal.set(runnableC1155d32);
                }
            }
            ArrayList arrayList = this.mGapWorker.f4026a;
            if (sDebugAssertionsEnabled && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC1155d runnableC1155d;
        super.onDetachedFromWindow();
        AbstractC1159h abstractC1159h = this.mItemAnimator;
        if (abstractC1159h != null) {
            abstractC1159h.mo2249e();
        }
        stopScroll();
        int i = 0;
        this.mIsAttached = false;
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i != null) {
            abstractC1160i.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (C2408qE.f8442d.mo1935c() != null) {
        }
        C1161j c1161j = this.mRecycler;
        ArrayList arrayList = c1161j.f4041c;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            AbstractC0671Pj.m1345c(((AbstractC1166o) arrayList.get(i2)).itemView);
        }
        c1161j.m2260g(c1161j.f4046h.mAdapter, false);
        while (i < getChildCount()) {
            int i3 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            C0981Wt c0981Wt = (C0981Wt) childAt.getTag(io.github.cherrywechat.R.id.pooling_container_listener_holder_tag);
            if (c0981Wt == null) {
                c0981Wt = new C0981Wt();
                childAt.setTag(io.github.cherrywechat.R.id.pooling_container_listener_holder_tag, c0981Wt);
            }
            ArrayList arrayList2 = c0981Wt.f3064a;
            int iM4976a0 = AbstractC2496sa.m4976a0(arrayList2);
            if (-1 < iM4976a0) {
                arrayList2.get(iM4976a0).getClass();
                throw new ClassCastException();
            }
            i = i3;
        }
        if (!ALLOW_THREAD_GAP_WORK || (runnableC1155d = this.mGapWorker) == null) {
            return;
        }
        boolean zRemove = runnableC1155d.f4026a.remove(this);
        if (sDebugAssertionsEnabled && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float axisValue;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.mLayout.canScrollHorizontally() ? motionEvent.getAxisValue(10) : 0.0f;
                if (f != 0.0f || axisValue != 0.0f) {
                    nestedScrollByInternal((int) (axisValue * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent, 1);
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.mLayout.canScrollVertically()) {
                    f = -axisValue2;
                    if (f != 0.0f) {
                        nestedScrollByInternal((int) (axisValue * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent, 1);
                    }
                } else {
                    if (this.mLayout.canScrollHorizontally()) {
                        axisValue = axisValue2;
                        f = 0.0f;
                    } else {
                        f = 0.0f;
                        axisValue = 0.0f;
                    }
                    if (f != 0.0f) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i == null) {
            return false;
        }
        boolean zCanScrollHorizontally = abstractC1160i.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i2 = x2 - this.mInitialTouchX;
                int i3 = y2 - this.mInitialTouchY;
                if (!zCanScrollHorizontally || Math.abs(i2) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (zCanScrollVertically && Math.abs(i3) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = AbstractC2792zB.f9460a;
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (abstractC1160i.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if (z || this.mAdapter == null) {
                return;
            }
            if (this.mState.f79d == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.setMeasureSpecs(i, i2);
            this.mState.f84i = true;
            dispatchLayoutStep2();
            this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f84i = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            }
            this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
            this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            C0038Av c0038Av = this.mState;
            if (c0038Av.f86k) {
                c0038Av.f82g = true;
            } else {
                this.mAdapterHelper.m2218c();
                this.mState.f82g = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f86k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC1158g abstractC1158g = this.mAdapter;
        if (abstractC1158g != null) {
            this.mState.f80e = abstractC1158g.getItemCount();
        } else {
            this.mState.f80e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
        stopInterceptRequestLayout(false);
        this.mState.f82g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2775yv)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2775yv c2775yv = (C2775yv) parcelable;
        this.mPendingSavedState = c2775yv;
        super.onRestoreInstanceState(c2775yv.f8397a);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C2775yv c2775yv = new C2775yv(super.onSaveInstanceState());
        C2775yv c2775yv2 = this.mPendingSavedState;
        if (c2775yv2 != null) {
            c2775yv.f9425c = c2775yv2.f9425c;
            return c2775yv;
        }
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i != null) {
            c2775yv.f9425c = abstractC1160i.onSaveInstanceState();
            return c2775yv;
        }
        c2775yv.f9425c = null;
        return c2775yv;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2 A[PHI: r1
  0x00c2: PHI (r1v46 int) = (r1v26 int), (r1v50 int) binds: [B:40:0x00ab, B:44:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (dispatchToOnItemTouchListeners(motionEvent)) {
            cancelScroll();
            return true;
        }
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i == null) {
            return false;
        }
        boolean zCanScrollHorizontally = abstractC1160i.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.mNestedOffsets;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            int i = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i, 0);
        } else {
            if (actionMasked == 1) {
                this.mVelocityTracker.addMovement(motionEventObtain);
                this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxFlingVelocity);
                float f = zCanScrollHorizontally ? -this.mVelocityTracker.getXVelocity(this.mScrollPointerId) : 0.0f;
                float f2 = zCanScrollVertically ? -this.mVelocityTracker.getYVelocity(this.mScrollPointerId) : 0.0f;
                if ((f == 0.0f && f2 == 0.0f) || !fling((int) f, (int) f2)) {
                    setScrollState(0);
                }
                resetScroll();
                motionEventObtain.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                if (iFindPointerIndex < 0) {
                    return false;
                }
                int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                int iMax = this.mLastTouchX - x2;
                int iMax2 = this.mLastTouchY - y2;
                if (this.mScrollState != 1) {
                    if (zCanScrollHorizontally) {
                        iMax = iMax > 0 ? Math.max(0, iMax - this.mTouchSlop) : Math.min(0, iMax + this.mTouchSlop);
                        if (iMax != 0) {
                            z = true;
                        }
                        if (zCanScrollVertically) {
                        }
                        if (z) {
                        }
                    } else {
                        z = false;
                        if (zCanScrollVertically) {
                            iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - this.mTouchSlop) : Math.min(0, iMax2 + this.mTouchSlop);
                            if (iMax2 != 0) {
                                z = true;
                            }
                        }
                        if (z) {
                            setScrollState(1);
                        }
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                if (this.mScrollState == 1) {
                    int[] iArr3 = this.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    int iReleaseHorizontalGlow = iMax - releaseHorizontalGlow(iMax, motionEvent.getY());
                    int iReleaseVerticalGlow = iMax2 - releaseVerticalGlow(iMax2, motionEvent.getX());
                    if (dispatchNestedPreScroll(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, this.mReusableIntPair, this.mScrollOffset, 0)) {
                        int[] iArr4 = this.mReusableIntPair;
                        iReleaseHorizontalGlow -= iArr4[0];
                        iReleaseVerticalGlow -= iArr4[1];
                        int[] iArr5 = this.mNestedOffsets;
                        int i2 = iArr5[0];
                        int[] iArr6 = this.mScrollOffset;
                        iArr5[0] = i2 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArr7 = this.mScrollOffset;
                    this.mLastTouchX = x2 - iArr7[0];
                    this.mLastTouchY = y2 - iArr7[1];
                    if (scrollByInternal(zCanScrollHorizontally ? iReleaseHorizontalGlow : 0, zCanScrollVertically ? iReleaseVerticalGlow : 0, motionEvent, 0)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC1155d runnableC1155d = this.mGapWorker;
                    if (runnableC1155d != null && (iReleaseHorizontalGlow != 0 || iReleaseVerticalGlow != 0)) {
                        runnableC1155d.m2242a(this, iReleaseHorizontalGlow, iReleaseVerticalGlow);
                    }
                }
            } else if (actionMasked == 3) {
                cancelScroll();
            } else if (actionMasked == 5) {
                this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.mLastTouchX = x3;
                this.mInitialTouchX = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.mLastTouchY = y3;
                this.mInitialTouchY = y3;
            } else if (actionMasked == 6) {
                onPointerUp(motionEvent);
            }
        }
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        Runnable runnable = this.mItemAnimatorRunner;
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        postOnAnimation(runnable);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(AbstractC1166o abstractC1166o, C2208lv c2208lv) {
        abstractC1166o.setFlags(0, 8192);
        if (this.mState.f83h && abstractC1166o.isUpdated() && !abstractC1166o.isRemoved() && !abstractC1166o.shouldIgnore()) {
            this.mViewInfoStore.f8757b.m5170e(getChangedHolderKey(abstractC1166o), abstractC1166o);
        }
        C2520sy c2520sy = this.mViewInfoStore.f8756a;
        C2408qE c2408qEM4846a = (C2408qE) c2520sy.get(abstractC1166o);
        if (c2408qEM4846a == null) {
            c2408qEM4846a = C2408qE.m4846a();
            c2520sy.put(abstractC1166o, c2408qEM4846a);
        }
        c2408qEM4846a.f8444b = c2208lv;
        c2408qEM4846a.f8443a |= 4;
    }

    public void removeAndRecycleViews() {
        AbstractC1159h abstractC1159h = this.mItemAnimator;
        if (abstractC1159h != null) {
            abstractC1159h.mo2249e();
        }
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i != null) {
            abstractC1160i.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        C1161j c1161j = this.mRecycler;
        c1161j.f4039a.clear();
        c1161j.m2261h();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        C1153b c1153b = this.mChildHelper;
        C2088j9 c2088j9 = c1153b.f4018b;
        C1384ev c1384ev = c1153b.f4017a;
        int iIndexOfChild = c1384ev.f4930a.indexOfChild(view);
        boolean z = true;
        if (iIndexOfChild == -1) {
            c1153b.m2238k(view);
        } else if (c2088j9.m4256d(iIndexOfChild)) {
            c2088j9.m4258f(iIndexOfChild);
            c1153b.m2238k(view);
            c1384ev.m2670a(iIndexOfChild);
        } else {
            z = false;
        }
        if (z) {
            AbstractC1166o childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.m2267n(childViewHolderInt);
            this.mRecycler.m2264k(childViewHolderInt);
            if (sVerboseLoggingEnabled) {
                Objects.toString(view);
                toString();
            }
        }
        stopInterceptRequestLayout(!z);
        return z;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        AbstractC1166o childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(AbstractC0213Ey.m406d(this, sb));
            }
        } else if (sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(AbstractC0213Ey.m406d(this, sb2));
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(AbstractC2251mv abstractC2251mv) {
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i != null) {
            abstractC1160i.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(abstractC2251mv);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i));
            return;
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(InterfaceC2474rv interfaceC2474rv) {
        List<InterfaceC2474rv> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(interfaceC2474rv);
    }

    public void removeOnItemTouchListener(InterfaceC2560tv interfaceC2560tv) {
        this.mOnItemTouchListeners.remove(interfaceC2560tv);
        if (this.mInterceptingOnItemTouchListener == interfaceC2560tv) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(AbstractC2603uv abstractC2603uv) {
        List<AbstractC2603uv> list = this.mScrollListeners;
        if (list != null) {
            list.remove(abstractC2603uv);
        }
    }

    public void removeRecyclerListener(InterfaceC2732xv interfaceC2732xv) {
        this.mRecyclerListeners.remove(interfaceC2732xv);
    }

    public void repositionShadowingViews() {
        AbstractC1166o abstractC1166o;
        int iM2232e = this.mChildHelper.m2232e();
        for (int i = 0; i < iM2232e; i++) {
            View viewM2231d = this.mChildHelper.m2231d(i);
            AbstractC1166o childViewHolder = getChildViewHolder(viewM2231d);
            if (childViewHolder != null && (abstractC1166o = childViewHolder.mShadowingHolder) != null) {
                View view = abstractC1166o.itemView;
                int left = viewM2231d.getLeft();
                int top = viewM2231d.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).mo1554c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int iM2235h = this.mChildHelper.m2235h();
        for (int i = 0; i < iM2235h; i++) {
            AbstractC1166o childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m2234g(i));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                throw new IllegalStateException(AbstractC0213Ey.m406d(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
            }
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i == null || this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = abstractC1160i.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i = 0;
            }
            if (!zCanScrollVertically) {
                i2 = 0;
            }
            scrollByInternal(i, i2, null, 0);
        }
    }

    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i, i2, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i6 = i - i8;
            i7 = i2 - i9;
            i5 = i9;
            i4 = i8;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i4, i5, i6, i7, this.mScrollOffset, i3, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i10 = iArr4[0];
        int i11 = i6 - i10;
        int i12 = iArr4[1];
        int i13 = i7 - i12;
        boolean z = (i10 == 0 && i12 == 0) ? false : true;
        int i14 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i15 = iArr5[0];
        this.mLastTouchX = i14 - i15;
        int i16 = this.mLastTouchY;
        int i17 = iArr5[1];
        this.mLastTouchY = i16 - i17;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i15;
        iArr6[1] = iArr6[1] + i17;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                pullGlows(motionEvent.getX(), i11, motionEvent.getY(), i13);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (i4 != 0 || i5 != 0) {
            dispatchOnScrolled(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i4 == 0 && i5 == 0) ? false : true;
    }

    public void scrollStep(int i, int i2, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i3 = AbstractC2792zB.f9460a;
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iScrollHorizontallyBy = i != 0 ? this.mLayout.scrollHorizontallyBy(i, this.mRecycler, this.mState) : 0;
        int iScrollVerticallyBy = i2 != 0 ? this.mLayout.scrollVerticallyBy(i2, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    public void scrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i == null) {
            return;
        }
        abstractC1160i.scrollToPosition(i);
        awakenScrollBars();
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C0210Ev c0210Ev) {
        this.mAccessibilityDelegate = c0210Ev;
        AbstractC2185lE.m4399l(this, c0210Ev);
    }

    public void setAdapter(AbstractC1158g abstractC1158g) {
        setLayoutFrozen(false);
        setAdapterInternal(abstractC1158g, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC2073iv interfaceC2073iv) {
        if (interfaceC2073iv == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = interfaceC2073iv;
        setChildrenDrawingOrderEnabled(interfaceC2073iv != null);
    }

    public boolean setChildImportantForAccessibilityInternal(AbstractC1166o abstractC1166o, int i) {
        if (isComputingLayout()) {
            abstractC1166o.mPendingAccessibilityState = i;
            this.mPendingAccessibilityImportanceChange.add(abstractC1166o);
            return false;
        }
        View view = abstractC1166o.itemView;
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        view.setImportantForAccessibility(i);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(AbstractC2117jv abstractC2117jv) {
        abstractC2117jv.getClass();
        this.mEdgeEffectFactory = abstractC2117jv;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(AbstractC1159h abstractC1159h) {
        AbstractC1159h abstractC1159h2 = this.mItemAnimator;
        if (abstractC1159h2 != null) {
            abstractC1159h2.mo2249e();
            this.mItemAnimator.f4033a = null;
        }
        this.mItemAnimator = abstractC1159h;
        if (abstractC1159h != null) {
            abstractC1159h.f4033a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i) {
        C1161j c1161j = this.mRecycler;
        c1161j.f4043e = i;
        c1161j.m2268o();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(AbstractC1160i abstractC1160i) {
        if (abstractC1160i == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            AbstractC1159h abstractC1159h = this.mItemAnimator;
            if (abstractC1159h != null) {
                abstractC1159h.mo2249e();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            C1161j c1161j = this.mRecycler;
            c1161j.f4039a.clear();
            c1161j.m2261h();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            C1161j c1161j2 = this.mRecycler;
            c1161j2.f4039a.clear();
            c1161j2.m2261h();
        }
        C1153b c1153b = this.mChildHelper;
        RecyclerView recyclerView = c1153b.f4017a.f4930a;
        c1153b.f4018b.m4259g();
        ArrayList arrayList = c1153b.f4019c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC1166o childViewHolderInt = getChildViewHolderInt((View) arrayList.get(size));
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(recyclerView);
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.mLayout = abstractC1160i;
        if (abstractC1160i != null) {
            if (abstractC1160i.mRecyclerView != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(abstractC1160i);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(AbstractC0213Ey.m406d(abstractC1160i.mRecyclerView, sb));
            }
            abstractC1160i.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.m2268o();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        C0293Gs scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f992d) {
            ViewGroup viewGroup = scrollingChildHelper.f991c;
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
            AbstractC1360eE.m2641m(viewGroup);
        }
        scrollingChildHelper.f992d = z;
    }

    public void setOnFlingListener(AbstractC2517sv abstractC2517sv) {
        this.mOnFlingListener = abstractC2517sv;
    }

    @Deprecated
    public void setOnScrollListener(AbstractC2603uv abstractC2603uv) {
        this.mScrollListener = abstractC2603uv;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(C2689wv c2689wv) {
        C1161j c1161j = this.mRecycler;
        RecyclerView recyclerView = c1161j.f4046h;
        c1161j.m2260g(recyclerView.mAdapter, false);
        if (c1161j.f4045g != null) {
            r2.f9257b--;
        }
        c1161j.f4045g = c2689wv;
        if (c2689wv != null && recyclerView.getAdapter() != null) {
            c1161j.f4045g.f9257b++;
        }
        c1161j.m2259f();
    }

    @Deprecated
    public void setRecyclerListener(InterfaceC2732xv interfaceC2732xv) {
    }

    public void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            new Exception();
        }
        this.mScrollState = i;
        if (i != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 1) {
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(AbstractC0124Cv abstractC0124Cv) {
        this.mRecycler.getClass();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        this.mEatenAccessibilityChangeFlags |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        return true;
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, null);
    }

    public void smoothScrollToPosition(int i) {
        AbstractC1160i abstractC1160i;
        if (this.mLayoutSuppressed || (abstractC1160i = this.mLayout) == null) {
            return;
        }
        abstractC1160i.smoothScrollToPosition(this, this.mState, i);
    }

    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m598g(i, 0);
    }

    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (sDebugAssertionsEnabled) {
                throw new IllegalStateException(AbstractC0213Ey.m406d(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
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
    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(AbstractC1158g abstractC1158g, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(abstractC1158g, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int i4;
        int iM2235h = this.mChildHelper.m2235h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iM2235h; i6++) {
            View viewM2234g = this.mChildHelper.m2234g(i6);
            AbstractC1166o childViewHolderInt = getChildViewHolderInt(viewM2234g);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i4 = childViewHolderInt.mPosition) >= i && i4 < i5) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((C2431qv) viewM2234g.getLayoutParams()).f8528c = true;
            }
        }
        C1161j c1161j = this.mRecycler;
        ArrayList arrayList = c1161j.f4041c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractC1166o abstractC1166o = (AbstractC1166o) arrayList.get(size);
            if (abstractC1166o != null && (i3 = abstractC1166o.mPosition) >= i && i3 < i5) {
                abstractC1166o.addFlags(2);
                c1161j.m2262i(size);
            }
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, io.github.cherrywechat.R.attr.recyclerViewStyle);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC1166o findViewHolderForPosition(int i, boolean z) {
        int iM2235h = this.mChildHelper.m2235h();
        AbstractC1166o abstractC1166o = null;
        for (int i2 = 0; i2 < iM2235h; i2++) {
            AbstractC1166o childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m2234g(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z) {
                    if (childViewHolderInt.mPosition != i) {
                        continue;
                    } else {
                        C1153b c1153b = this.mChildHelper;
                        if (!c1153b.f4019c.contains(childViewHolderInt.itemView)) {
                            return childViewHolderInt;
                        }
                        abstractC1166o = childViewHolderInt;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i) {
                    continue;
                }
            }
        }
        return abstractC1166o;
    }

    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            if (sDebugAssertionsEnabled && i < 0) {
                throw new IllegalStateException(AbstractC0213Ey.m406d(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new C1162k(this);
        this.mRecycler = new C1161j(this);
        this.mViewInfoStore = new C2494sE();
        this.mUpdateChildViewsRunnable = new RunnableC1156e(this, 0);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        C1261cd c1261cd = new C1261cd();
        c1261cd.f4033a = null;
        c1261cd.f4034b = new ArrayList();
        c1261cd.f4035c = 120L;
        c1261cd.f4036d = 120L;
        c1261cd.f4037e = 250L;
        c1261cd.f4038f = 250L;
        int i2 = 1;
        c1261cd.f4276g = true;
        c1261cd.f4277h = new ArrayList();
        c1261cd.f4278i = new ArrayList();
        c1261cd.f4279j = new ArrayList();
        c1261cd.f4280k = new ArrayList();
        c1261cd.f4281l = new ArrayList();
        c1261cd.f4282m = new ArrayList();
        c1261cd.f4283n = new ArrayList();
        c1261cd.f4284o = new ArrayList();
        c1261cd.f4285p = new ArrayList();
        c1261cd.f4286q = new ArrayList();
        c1261cd.f4287r = new ArrayList();
        this.mItemAnimator = c1261cd;
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new RunnableC1165n(this);
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new C1154c() : null;
        C0038Av c0038Av = new C0038Av();
        c0038Av.f76a = -1;
        c0038Av.f77b = 0;
        c0038Av.f78c = 0;
        c0038Av.f79d = 1;
        c0038Av.f80e = 0;
        c0038Av.f81f = false;
        c0038Av.f82g = false;
        c0038Av.f83h = false;
        c0038Av.f84i = false;
        c0038Av.f85j = false;
        c0038Av.f86k = false;
        this.mState = c0038Av;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C1384ev(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC1156e(this, i2);
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new C1384ev(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
        this.mScaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.f4033a = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0210Ev(this));
        int[] iArr = AbstractC0810Su.f2564a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        AbstractC2185lE.m4398k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z;
        if (z) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6), typedArrayObtainStyledAttributes.getDrawable(7), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4), typedArrayObtainStyledAttributes.getDrawable(5));
        }
        typedArrayObtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        AbstractC2185lE.m4398k(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
        setTag(io.github.cherrywechat.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m594c(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().m595d(i, i2, i3, i4, iArr, i5, null);
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().m597f(i);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().m598g(i, i2);
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().m599h(i);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i == null || this.mLayoutSuppressed) {
            return;
        }
        if (!abstractC1160i.canScrollHorizontally()) {
            i = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (i3 != Integer.MIN_VALUE && i3 <= 0) {
            scrollBy(i, i2);
            return;
        }
        if (z) {
            int i4 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i4 |= 2;
            }
            startNestedScroll(i4, 1);
        }
        this.mViewFlinger.m2273c(i, i2, interpolator, i3);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().m595d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void addItemDecoration(AbstractC2251mv abstractC2251mv) {
        addItemDecoration(abstractC2251mv, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC1160i abstractC1160i = this.mLayout;
        if (abstractC1160i != null) {
            return abstractC1160i.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(AbstractC0213Ey.m406d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
