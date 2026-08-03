package androidx.recyclerview.widget;

import Yue.AbstractC2967;
import Yue.C3024;
import Yue.C3025;
import Yue.C3055;
import Yue.C4587;
import Yue.C6193;
import Yue.C6270;
import Yue.C6366;
import Yue.C6740;
import Yue.C6922;
import Yue.C7950;
import Yue.C8273;
import Yue.C8299;
import Yue.InterfaceC3647;
import Yue.InterfaceC6363;
import Yue.InterfaceC6364;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC6844;
import Yue.InterfaceC7144;
import Yue.InterfaceC7246;
import Yue.InterfaceC8392;
import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
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
import androidx.recyclerview.widget.C1758;
import androidx.recyclerview.widget.C8951;
import androidx.recyclerview.widget.C8989;
import androidx.recyclerview.widget.C8995;
import androidx.recyclerview.widget.C8997;
import androidx.recyclerview.widget.RunnableC8971;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements InterfaceC7246, InterfaceC6363, InterfaceC6364 {
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
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
    static final Interpolator sQuinticInterpolator;
    C8989 mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    AbstractC8909 mAdapter;
    C1758 mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private InterfaceC8912 mChildDrawingOrderCallback;
    C8951 mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;

    @InterfaceC6391
    private C8913 mEdgeEffectFactory;
    boolean mEnableFastScroller;

    @InterfaceC8392
    boolean mFirstLayoutComplete;
    RunnableC8971 mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private InterfaceC8925 mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    AbstractC8914 mItemAnimator;
    private AbstractC8914.InterfaceC8915 mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<AbstractC8918> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;

    @InterfaceC8392
    AbstractC8919 mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final C8931 mObserver;
    private List<InterfaceC8923> mOnChildAttachStateListeners;
    private AbstractC8924 mOnFlingListener;
    private final ArrayList<InterfaceC8925> mOnItemTouchListeners;

    @InterfaceC8392
    final List<AbstractC8938> mPendingAccessibilityImportanceChange;
    private C8932 mPendingSavedState;
    boolean mPostedAnimatorRunner;
    RunnableC8971.C1772 mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final C8929 mRecycler;
    InterfaceC8930 mRecyclerListener;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private AbstractC8926 mScrollListener;
    private List<AbstractC8926> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C6366 mScrollingChildHelper;
    final C8935 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final RunnableC8937 mViewFlinger;
    private final C8997.InterfaceC1791 mViewInfoProcessCallback;
    final C8997 mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ */
    public class RunnableC1743 implements Runnable {
        public RunnableC1743() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟ */
    public class RunnableC1744 implements Runnable {
        public RunnableC1744() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC8914 abstractC8914 = RecyclerView.this.mItemAnimator;
            if (abstractC8914 != null) {
                abstractC8914.mo30291();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟, reason: contains not printable characters */
    public static class InterpolatorC8905 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟, reason: contains not printable characters */
    public class C8906 implements C8997.InterfaceC1791 {
        public C8906() {
        }

        @Override // androidx.recyclerview.widget.C8997.InterfaceC1791
        /* JADX INFO: renamed from: ۥ */
        public void mo4909(AbstractC8938 abstractC8938) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.removeAndRecycleView(abstractC8938.itemView, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.C8997.InterfaceC1791
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo4910(AbstractC8938 abstractC8938, AbstractC8914.C8916 c8916, AbstractC8914.C8916 c89162) {
            RecyclerView.this.animateAppearance(abstractC8938, c8916, c89162);
        }

        @Override // androidx.recyclerview.widget.C8997.InterfaceC1791
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo30247(AbstractC8938 abstractC8938, @InterfaceC6391 AbstractC8914.C8916 c8916, @InterfaceC6490 AbstractC8914.C8916 c89162) {
            RecyclerView.this.mRecycler.m30358(abstractC8938);
            RecyclerView.this.animateDisappearance(abstractC8938, c8916, c89162);
        }

        @Override // androidx.recyclerview.widget.C8997.InterfaceC1791
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo30248(AbstractC8938 abstractC8938, @InterfaceC6391 AbstractC8914.C8916 c8916, @InterfaceC6391 AbstractC8914.C8916 c89162) {
            abstractC8938.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mDataSetHasChangedAfterLayout) {
                if (recyclerView.mItemAnimator.mo4920(abstractC8938, abstractC8938, c8916, c89162)) {
                    RecyclerView.this.postAnimationRunner();
                }
            } else if (recyclerView.mItemAnimator.mo30272(abstractC8938, c8916, c89162)) {
                RecyclerView.this.postAnimationRunner();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C8907 implements C8951.InterfaceC1764 {
        public C8907() {
        }

        @Override // androidx.recyclerview.widget.C8951.InterfaceC1764
        /* JADX INFO: renamed from: ۥ */
        public View mo4911(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.C8951.InterfaceC1764
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo4912(View view) {
            AbstractC8938 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onEnteredHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C8951.InterfaceC1764
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int mo30249() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.C8951.InterfaceC1764
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo30250() {
            int iMo30249 = mo30249();
            for (int i = 0; i < iMo30249; i++) {
                View viewMo4911 = mo4911(i);
                RecyclerView.this.dispatchChildDetached(viewMo4911);
                viewMo4911.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.C8951.InterfaceC1764
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int mo30251(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.C8951.InterfaceC1764
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public AbstractC8938 mo30252(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // androidx.recyclerview.widget.C8951.InterfaceC1764
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void mo30253(int i) {
            AbstractC8938 childViewHolderInt;
            View viewMo4911 = mo4911(i);
            if (viewMo4911 != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(viewMo4911)) != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.addFlags(256);
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.C8951.InterfaceC1764
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void mo30254(View view) {
            AbstractC8938 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.C8951.InterfaceC1764
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void mo30255(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.C8951.InterfaceC1764
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void mo30256(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.C8951.InterfaceC1764
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void mo30257(View view, int i, ViewGroup.LayoutParams layoutParams) {
            AbstractC8938 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.clearTmpDetachFlag();
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟۠, reason: contains not printable characters */
    public class C8908 implements C1758.InterfaceC8944 {
        public C8908() {
        }

        @Override // androidx.recyclerview.widget.C1758.InterfaceC8944
        /* JADX INFO: renamed from: ۥ */
        public void mo4913(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForMove(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C1758.InterfaceC8944
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo4914(C1758.C8945 c8945) {
            m30264(c8945);
        }

        @Override // androidx.recyclerview.widget.C1758.InterfaceC8944
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo30258(int i, int i2, Object obj) {
            RecyclerView.this.viewRangeUpdate(i, i2, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        @Override // androidx.recyclerview.widget.C1758.InterfaceC8944
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo30259(C1758.C8945 c8945) {
            m30264(c8945);
        }

        @Override // androidx.recyclerview.widget.C1758.InterfaceC8944
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public AbstractC8938 mo30260(int i) {
            AbstractC8938 abstractC8938FindViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i, true);
            if (abstractC8938FindViewHolderForPosition == null || RecyclerView.this.mChildHelper.m30541(abstractC8938FindViewHolderForPosition.itemView)) {
                return null;
            }
            return abstractC8938FindViewHolderForPosition;
        }

        @Override // androidx.recyclerview.widget.C1758.InterfaceC8944
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void mo30261(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C1758.InterfaceC8944
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void mo30262(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForInsert(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.C1758.InterfaceC8944
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void mo30263(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f29987 += i2;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void m30264(C1758.C8945 c8945) {
            int i = c8945.f3914;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.onItemsAdded(recyclerView, c8945.f3915, c8945.f30084);
                return;
            }
            if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.onItemsRemoved(recyclerView2, c8945.f3915, c8945.f30084);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.onItemsUpdated(recyclerView3, c8945.f3915, c8945.f30084, c8945.f30083);
            } else {
                if (i != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.onItemsMoved(recyclerView4, c8945.f3915, c8945.f30084, 1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static abstract class AbstractC8909<VH extends AbstractC8938> {
        private final C8910 mObservable = new C8910();
        private boolean mHasStableIds = false;

        public final void bindViewHolder(@InterfaceC6391 VH vh, int i) {
            vh.mPosition = i;
            if (hasStableIds()) {
                vh.mItemId = getItemId(i);
            }
            vh.setFlags(1, 519);
            C7950.m3971(RecyclerView.TRACE_BIND_VIEW_TAG);
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            vh.clearPayload();
            ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
            if (layoutParams instanceof C8922) {
                ((C8922) layoutParams).f29963 = true;
            }
            C7950.m25086();
        }

        @InterfaceC6391
        public final VH createViewHolder(@InterfaceC6391 ViewGroup viewGroup, int i) {
            try {
                C7950.m3971(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH vh = (VH) onCreateViewHolder(viewGroup, i);
                if (vh.itemView.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.mItemViewType = i;
                return vh;
            } finally {
                C7950.m25086();
            }
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1L;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final boolean hasObservers() {
            return this.mObservable.m4915();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.m4916();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void notifyItemChanged(int i) {
            this.mObservable.m30266(i, 1);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.m30268(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.m30265(i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.m30266(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.m30268(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.m30269(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.m30269(i, 1);
        }

        public void onAttachedToRecyclerView(@InterfaceC6391 RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(@InterfaceC6391 VH vh, int i);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void onBindViewHolder(@InterfaceC6391 VH vh, int i, @InterfaceC6391 List<Object> list) {
            onBindViewHolder(vh, i);
        }

        @InterfaceC6391
        public abstract VH onCreateViewHolder(@InterfaceC6391 ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(@InterfaceC6391 RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(@InterfaceC6391 VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(@InterfaceC6391 VH vh) {
        }

        public void onViewDetachedFromWindow(@InterfaceC6391 VH vh) {
        }

        public void onViewRecycled(@InterfaceC6391 VH vh) {
        }

        public void registerAdapterDataObserver(@InterfaceC6391 AbstractC8911 abstractC8911) {
            this.mObservable.registerObserver(abstractC8911);
        }

        public void setHasStableIds(boolean z) {
            if (hasObservers()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.mHasStableIds = z;
        }

        public void unregisterAdapterDataObserver(@InterfaceC6391 AbstractC8911 abstractC8911) {
            this.mObservable.unregisterObserver(abstractC8911);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public final void notifyItemChanged(int i, @InterfaceC6490 Object obj) {
            this.mObservable.m30267(i, 1, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public final void notifyItemRangeChanged(int i, int i2, @InterfaceC6490 Object obj) {
            this.mObservable.m30267(i, i2, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static class C8910 extends Observable<AbstractC8911> {
        /* JADX INFO: renamed from: ۥ */
        public boolean m4915() {
            return !((Observable) this).mObservers.isEmpty();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m4916() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC8911) ((Observable) this).mObservers.get(size)).onChanged();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m30265(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC8911) ((Observable) this).mObservers.get(size)).onItemRangeMoved(i, i2, 1);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m30266(int i, int i2) {
            m30267(i, i2, null);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m30267(int i, int i2, @InterfaceC6490 Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC8911) ((Observable) this).mObservers.get(size)).onItemRangeChanged(i, i2, obj);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void m30268(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC8911) ((Observable) this).mObservers.get(size)).onItemRangeInserted(i, i2);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m30269(int i, int i2) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((AbstractC8911) ((Observable) this).mObservers.get(size)).onItemRangeRemoved(i, i2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۟, reason: contains not printable characters */
    public static abstract class AbstractC8911 {
        public void onChanged() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void onItemRangeChanged(int i, int i2) {
        }

        public void onItemRangeInserted(int i, int i2) {
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
        }

        public void onItemRangeRemoved(int i, int i2) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public void onItemRangeChanged(int i, int i2, @InterfaceC6490 Object obj) {
            onItemRangeChanged(i, i2);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public interface InterfaceC8912 {
        /* JADX INFO: renamed from: ۥ */
        int mo4917(int i, int i2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static class C8913 {

        /* JADX INFO: renamed from: ۥ */
        public static final int f3880 = 0;

        /* JADX INFO: renamed from: ۥ۟ */
        public static final int f3881 = 1;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final int f29947 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final int f29948 = 3;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۥ$ۥ */
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC1745 {
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public EdgeEffect m4918(@InterfaceC6391 RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static abstract class AbstractC8914 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f29949 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f29950 = 8;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f29951 = 4;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final int f29952 = 2048;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static final int f29953 = 4096;

        /* JADX INFO: renamed from: ۥ */
        public InterfaceC8915 f3882 = null;

        /* JADX INFO: renamed from: ۥ۟ */
        public ArrayList<InterfaceC1747> f3883 = new ArrayList<>();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public long f29954 = 120;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public long f29955 = 120;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public long f29956 = 250;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public long f29957 = 250;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ */
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC1746 {
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟ */
        public interface InterfaceC1747 {
            /* JADX INFO: renamed from: ۥ */
            void m4921();
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟, reason: contains not printable characters */
        public interface InterfaceC8915 {
            /* JADX INFO: renamed from: ۥ */
            void mo4922(@InterfaceC6391 AbstractC8938 abstractC8938);
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ$ۥ۟۟۟, reason: contains not printable characters */
        public static class C8916 {

            /* JADX INFO: renamed from: ۥ */
            public int f3884;

            /* JADX INFO: renamed from: ۥ۟ */
            public int f3885;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public int f29958;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public int f29959;

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public int f29960;

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ */
            public C8916 m4923(@InterfaceC6391 AbstractC8938 abstractC8938) {
                return m4924(abstractC8938, 0);
            }

            @InterfaceC6391
            /* JADX INFO: renamed from: ۥ۟ */
            public C8916 m4924(@InterfaceC6391 AbstractC8938 abstractC8938, int i) {
                View view = abstractC8938.itemView;
                this.f3884 = view.getLeft();
                this.f3885 = view.getTop();
                this.f29958 = view.getRight();
                this.f29959 = view.getBottom();
                return this;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static int m30270(AbstractC8938 abstractC8938) {
            int i = abstractC8938.mFlags;
            int i2 = i & 14;
            if (abstractC8938.isInvalid()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i2;
            }
            int oldPosition = abstractC8938.getOldPosition();
            int adapterPosition = abstractC8938.getAdapterPosition();
            return (oldPosition == -1 || adapterPosition == -1 || oldPosition == adapterPosition) ? i2 : i2 | 2048;
        }

        /* JADX INFO: renamed from: ۥ */
        public abstract boolean mo4919(@InterfaceC6391 AbstractC8938 abstractC8938, @InterfaceC6490 C8916 c8916, @InterfaceC6391 C8916 c89162);

        /* JADX INFO: renamed from: ۥ۟ */
        public abstract boolean mo4920(@InterfaceC6391 AbstractC8938 abstractC8938, @InterfaceC6391 AbstractC8938 abstractC89382, @InterfaceC6391 C8916 c8916, @InterfaceC6391 C8916 c89162);

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public abstract boolean mo30271(@InterfaceC6391 AbstractC8938 abstractC8938, @InterfaceC6391 C8916 c8916, @InterfaceC6490 C8916 c89162);

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public abstract boolean mo30272(@InterfaceC6391 AbstractC8938 abstractC8938, @InterfaceC6391 C8916 c8916, @InterfaceC6391 C8916 c89162);

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean mo30273(@InterfaceC6391 AbstractC8938 abstractC8938) {
            return true;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean mo30274(@InterfaceC6391 AbstractC8938 abstractC8938, @InterfaceC6391 List<Object> list) {
            return mo30273(abstractC8938);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m30275(@InterfaceC6391 AbstractC8938 abstractC8938) {
            m30287(abstractC8938);
            InterfaceC8915 interfaceC8915 = this.f3882;
            if (interfaceC8915 != null) {
                interfaceC8915.mo4922(abstractC8938);
            }
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final void m30276(@InterfaceC6391 AbstractC8938 abstractC8938) {
            m30288(abstractC8938);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final void m30277() {
            int size = this.f3883.size();
            for (int i = 0; i < size; i++) {
                this.f3883.get(i).m4921();
            }
            this.f3883.clear();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public abstract void mo30278(@InterfaceC6391 AbstractC8938 abstractC8938);

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public abstract void mo30279();

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public long m30280() {
            return this.f29954;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public long m30281() {
            return this.f29957;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public long m30282() {
            return this.f29956;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public long m30283() {
            return this.f29955;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public abstract boolean mo30284();

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public final boolean m30285(@InterfaceC6490 InterfaceC1747 interfaceC1747) {
            boolean zMo30284 = mo30284();
            if (interfaceC1747 != null) {
                if (zMo30284) {
                    this.f3883.add(interfaceC1747);
                } else {
                    interfaceC1747.m4921();
                }
            }
            return zMo30284;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public C8916 m30286() {
            return new C8916();
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public void m30287(@InterfaceC6391 AbstractC8938 abstractC8938) {
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public void m30288(@InterfaceC6391 AbstractC8938 abstractC8938) {
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public C8916 m30289(@InterfaceC6391 C8935 c8935, @InterfaceC6391 AbstractC8938 abstractC8938) {
            return m30286().m4923(abstractC8938);
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public C8916 m30290(@InterfaceC6391 C8935 c8935, @InterfaceC6391 AbstractC8938 abstractC8938, int i, @InterfaceC6391 List<Object> list) {
            return m30286().m4923(abstractC8938);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public abstract void mo30291();

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public void m30292(long j) {
            this.f29954 = j;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public void m30293(long j) {
            this.f29957 = j;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public void m30294(InterfaceC8915 interfaceC8915) {
            this.f3882 = interfaceC8915;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public void m30295(long j) {
            this.f29956 = j;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public void m30296(long j) {
            this.f29955 = j;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public class C8917 implements AbstractC8914.InterfaceC8915 {
        public C8917() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8914.InterfaceC8915
        /* JADX INFO: renamed from: ۥ */
        public void mo4922(AbstractC8938 abstractC8938) {
            abstractC8938.setIsRecyclable(true);
            if (abstractC8938.mShadowedHolder != null && abstractC8938.mShadowingHolder == null) {
                abstractC8938.mShadowedHolder = null;
            }
            abstractC8938.mShadowingHolder = null;
            if (abstractC8938.shouldBeKeptAsChild() || RecyclerView.this.removeAnimatingView(abstractC8938.itemView) || !abstractC8938.isTmpDetached()) {
                return;
            }
            RecyclerView.this.removeDetachedView(abstractC8938.itemView, false);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static abstract class AbstractC8918 {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Deprecated
        public void getItemOffsets(@InterfaceC6391 Rect rect, int i, @InterfaceC6391 RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Deprecated
        public void onDraw(@InterfaceC6391 Canvas canvas, @InterfaceC6391 RecyclerView recyclerView) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Deprecated
        public void onDrawOver(@InterfaceC6391 Canvas canvas, @InterfaceC6391 RecyclerView recyclerView) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public void getItemOffsets(@InterfaceC6391 Rect rect, @InterfaceC6391 View view, @InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 C8935 c8935) {
            getItemOffsets(rect, ((C8922) view.getLayoutParams()).m4931(), recyclerView);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public void onDraw(@InterfaceC6391 Canvas canvas, @InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 C8935 c8935) {
            onDraw(canvas, recyclerView);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public void onDrawOver(@InterfaceC6391 Canvas canvas, @InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 C8935 c8935) {
            onDrawOver(canvas, recyclerView);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠, reason: contains not printable characters */
    public static abstract class AbstractC8919 {
        boolean mAutoMeasure;
        C8951 mChildHelper;
        private int mHeight;
        private int mHeightMode;
        C8995 mHorizontalBoundCheck;
        private final C8995.InterfaceC1789 mHorizontalBoundCheckCallback;
        boolean mIsAttachedToWindow;
        private boolean mItemPrefetchEnabled;
        private boolean mMeasurementCacheEnabled;
        int mPrefetchMaxCountObserved;
        boolean mPrefetchMaxObservedInInitialPrefetch;
        RecyclerView mRecyclerView;
        boolean mRequestedSimpleAnimations;

        @InterfaceC6490
        AbstractC8934 mSmoothScroller;
        C8995 mVerticalBoundCheck;
        private final C8995.InterfaceC1789 mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠$ۥ */
        public class C1748 implements C8995.InterfaceC1789 {
            public C1748() {
            }

            @Override // androidx.recyclerview.widget.C8995.InterfaceC1789
            /* JADX INFO: renamed from: ۥ */
            public View mo4927(int i) {
                return AbstractC8919.this.getChildAt(i);
            }

            @Override // androidx.recyclerview.widget.C8995.InterfaceC1789
            /* JADX INFO: renamed from: ۥ۟ */
            public int mo4928(View view) {
                return AbstractC8919.this.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((C8922) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.C8995.InterfaceC1789
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public int mo30301() {
                return AbstractC8919.this.getPaddingLeft();
            }

            @Override // androidx.recyclerview.widget.C8995.InterfaceC1789
            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public int mo30302() {
                return AbstractC8919.this.getWidth() - AbstractC8919.this.getPaddingRight();
            }

            @Override // androidx.recyclerview.widget.C8995.InterfaceC1789
            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public int mo30303(View view) {
                return AbstractC8919.this.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((C8922) view.getLayoutParams())).rightMargin;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠$ۥ۟ */
        public class C1749 implements C8995.InterfaceC1789 {
            public C1749() {
            }

            @Override // androidx.recyclerview.widget.C8995.InterfaceC1789
            /* JADX INFO: renamed from: ۥ */
            public View mo4927(int i) {
                return AbstractC8919.this.getChildAt(i);
            }

            @Override // androidx.recyclerview.widget.C8995.InterfaceC1789
            /* JADX INFO: renamed from: ۥ۟ */
            public int mo4928(View view) {
                return AbstractC8919.this.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((C8922) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.C8995.InterfaceC1789
            /* JADX INFO: renamed from: ۥ۟۟ */
            public int mo30301() {
                return AbstractC8919.this.getPaddingTop();
            }

            @Override // androidx.recyclerview.widget.C8995.InterfaceC1789
            /* JADX INFO: renamed from: ۥ۟۟۟ */
            public int mo30302() {
                return AbstractC8919.this.getHeight() - AbstractC8919.this.getPaddingBottom();
            }

            @Override // androidx.recyclerview.widget.C8995.InterfaceC1789
            /* JADX INFO: renamed from: ۥ۟۟۟۟ */
            public int mo30303(View view) {
                return AbstractC8919.this.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((C8922) view.getLayoutParams())).bottomMargin;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠$ۥ۟۟, reason: contains not printable characters */
        public interface InterfaceC8920 {
            /* JADX INFO: renamed from: ۥ */
            void mo4929(int i, int i2);
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠$ۥ۟۟۟, reason: contains not printable characters */
        public static class C8921 {

            /* JADX INFO: renamed from: ۥ */
            public int f3889;

            /* JADX INFO: renamed from: ۥ۟ */
            public int f3890;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public boolean f29961;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public boolean f29962;
        }

        public AbstractC8919() {
            C1748 c1748 = new C1748();
            this.mHorizontalBoundCheckCallback = c1748;
            C1749 c1749 = new C1749();
            this.mVerticalBoundCheckCallback = c1749;
            this.mHorizontalBoundCheck = new C8995(c1748);
            this.mVerticalBoundCheck = new C8995(c1749);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        public static int chooseSize(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Removed duplicated region for block: B:5:0x000c A[PHI: r3
  0x000c: PHI (r3v5 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:7:0x0010, B:11:0x0016, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x000e  */
        @Deprecated
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int getChildMeasureSpec(int i, int i2, int i3, boolean z) {
            int i4 = i - i2;
            int i5 = 0;
            int iMax = Math.max(0, i4);
            if (z) {
                if (i3 >= 0) {
                    i5 = 1073741824;
                } else {
                    i3 = 0;
                }
            } else if (i3 < 0) {
                if (i3 == -1) {
                    i3 = iMax;
                    i5 = 1073741824;
                } else if (i3 == -2) {
                    i5 = Integer.MIN_VALUE;
                    i3 = iMax;
                }
            }
            return View.MeasureSpec.makeMeasureSpec(i3, i5);
        }

        public static C8921 getProperties(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i, int i2) {
            C8921 c8921 = new C8921();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6922.C6930.f20080, i, i2);
            c8921.f3889 = typedArrayObtainStyledAttributes.getInt(C6922.C6930.f20081, 1);
            c8921.f3890 = typedArrayObtainStyledAttributes.getInt(C6922.C6930.f20091, 1);
            c8921.f29961 = typedArrayObtainStyledAttributes.getBoolean(C6922.C6930.f20090, false);
            c8921.f29962 = typedArrayObtainStyledAttributes.getBoolean(C6922.C6930.f20092, false);
            typedArrayObtainStyledAttributes.recycle();
            return c8921;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static boolean m30297(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void attachView(@InterfaceC6391 View view, int i, C8922 c8922) {
            AbstractC8938 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.m5016(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.m30796(childViewHolderInt);
            }
            this.mChildHelper.m30530(view, i, c8922, childViewHolderInt.isRemoved());
        }

        public void calculateItemDecorationsForChild(@InterfaceC6391 View view, @InterfaceC6391 Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(C8922 c8922) {
            return c8922 != null;
        }

        public void collectAdjacentPrefetchPositions(int i, int i2, C8935 c8935, InterfaceC8920 interfaceC8920) {
        }

        public void collectInitialPrefetchPositions(int i, InterfaceC8920 interfaceC8920) {
        }

        public int computeHorizontalScrollExtent(@InterfaceC6391 C8935 c8935) {
            return 0;
        }

        public int computeHorizontalScrollOffset(@InterfaceC6391 C8935 c8935) {
            return 0;
        }

        public int computeHorizontalScrollRange(@InterfaceC6391 C8935 c8935) {
            return 0;
        }

        public int computeVerticalScrollExtent(@InterfaceC6391 C8935 c8935) {
            return 0;
        }

        public int computeVerticalScrollOffset(@InterfaceC6391 C8935 c8935) {
            return 0;
        }

        public int computeVerticalScrollRange(@InterfaceC6391 C8935 c8935) {
            return 0;
        }

        public void detachAndScrapAttachedViews(@InterfaceC6391 C8929 c8929) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                m30300(c8929, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(@InterfaceC6391 View view, @InterfaceC6391 C8929 c8929) {
            m30300(c8929, this.mChildHelper.m30540(view), view);
        }

        public void detachAndScrapViewAt(int i, @InterfaceC6391 C8929 c8929) {
            m30300(c8929, i, getChildAt(i));
        }

        public void detachView(@InterfaceC6391 View view) {
            int iM30540 = this.mChildHelper.m30540(view);
            if (iM30540 >= 0) {
                m4926(iM30540, view);
            }
        }

        public void detachViewAt(int i) {
            m4926(i, getChildAt(i));
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, C8929 c8929) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, c8929);
        }

        public void endAnimation(View view) {
            AbstractC8914 abstractC8914 = this.mRecyclerView.mItemAnimator;
            if (abstractC8914 != null) {
                abstractC8914.mo30278(RecyclerView.getChildViewHolderInt(view));
            }
        }

        @InterfaceC6490
        public View findContainingItemView(@InterfaceC6391 View view) {
            View viewFindContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.m30541(viewFindContainingItemView)) {
                return null;
            }
            return viewFindContainingItemView;
        }

        @InterfaceC6490
        public View findViewByPosition(int i) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                AbstractC8938 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.m30381() || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract C8922 generateDefaultLayoutParams();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8922 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof C8922 ? new C8922((C8922) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C8922((ViewGroup.MarginLayoutParams) layoutParams) : new C8922(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(@InterfaceC6391 View view) {
            return ((C8922) view.getLayoutParams()).f3892.bottom;
        }

        @InterfaceC6490
        public View getChildAt(int i) {
            C8951 c8951 = this.mChildHelper;
            if (c8951 != null) {
                return c8951.m30533(i);
            }
            return null;
        }

        public int getChildCount() {
            C8951 c8951 = this.mChildHelper;
            if (c8951 != null) {
                return c8951.m30534();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(@InterfaceC6391 C8929 c8929, @InterfaceC6391 C8935 c8935) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.mAdapter == null || !canScrollHorizontally()) {
                return 1;
            }
            return this.mRecyclerView.mAdapter.getItemCount();
        }

        public int getDecoratedBottom(@InterfaceC6391 View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public void getDecoratedBoundsWithMargins(@InterfaceC6391 View view, @InterfaceC6391 Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(@InterfaceC6391 View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(@InterfaceC6391 View view) {
            Rect rect = ((C8922) view.getLayoutParams()).f3892;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(@InterfaceC6391 View view) {
            Rect rect = ((C8922) view.getLayoutParams()).f3892;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(@InterfaceC6391 View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedTop(@InterfaceC6391 View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        @InterfaceC6490
        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.m30541(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        @InterfaceC6844
        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            AbstractC8909 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(@InterfaceC6391 View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            return C8273.m27356(this.mRecyclerView);
        }

        public int getLeftDecorationWidth(@InterfaceC6391 View view) {
            return ((C8922) view.getLayoutParams()).f3892.left;
        }

        @InterfaceC6844
        public int getMinimumHeight() {
            return C8273.m27361(this.mRecyclerView);
        }

        @InterfaceC6844
        public int getMinimumWidth() {
            return C8273.m27362(this.mRecyclerView);
        }

        @InterfaceC6844
        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        @InterfaceC6844
        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return C8273.m27366(recyclerView);
            }
            return 0;
        }

        @InterfaceC6844
        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        @InterfaceC6844
        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        @InterfaceC6844
        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return C8273.m27367(recyclerView);
            }
            return 0;
        }

        @InterfaceC6844
        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(@InterfaceC6391 View view) {
            return ((C8922) view.getLayoutParams()).m4931();
        }

        public int getRightDecorationWidth(@InterfaceC6391 View view) {
            return ((C8922) view.getLayoutParams()).f3892.right;
        }

        public int getRowCountForAccessibility(@InterfaceC6391 C8929 c8929, @InterfaceC6391 C8935 c8935) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || recyclerView.mAdapter == null || !canScrollVertically()) {
                return 1;
            }
            return this.mRecyclerView.mAdapter.getItemCount();
        }

        public int getSelectionModeForAccessibility(@InterfaceC6391 C8929 c8929, @InterfaceC6391 C8935 c8935) {
            return 0;
        }

        public int getTopDecorationHeight(@InterfaceC6391 View view) {
            return ((C8922) view.getLayoutParams()).f3892.top;
        }

        public void getTransformedBoundingBox(@InterfaceC6391 View view, boolean z, @InterfaceC6391 Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((C8922) view.getLayoutParams()).f3892;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        @InterfaceC6844
        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(@InterfaceC6391 View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException("View should be fully attached to be ignored" + this.mRecyclerView.exceptionLabel());
            }
            AbstractC8938 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.m30797(childViewHolderInt);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(@InterfaceC6391 C8929 c8929, @InterfaceC6391 C8935 c8935) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            AbstractC8934 abstractC8934 = this.mSmoothScroller;
            return abstractC8934 != null && abstractC8934.isRunning();
        }

        public boolean isViewPartiallyVisible(@InterfaceC6391 View view, boolean z, boolean z2) {
            boolean z3 = this.mHorizontalBoundCheck.m5012(view, 24579) && this.mVerticalBoundCheck.m5012(view, 24579);
            return z ? z3 : !z3;
        }

        public void layoutDecorated(@InterfaceC6391 View view, int i, int i2, int i3, int i4) {
            Rect rect = ((C8922) view.getLayoutParams()).f3892;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(@InterfaceC6391 View view, int i, int i2, int i3, int i4) {
            C8922 c8922 = (C8922) view.getLayoutParams();
            Rect rect = c8922.f3892;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) c8922).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c8922).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) c8922).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c8922).bottomMargin);
        }

        public void measureChild(@InterfaceC6391 View view, int i, int i2) {
            C8922 c8922 = (C8922) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i4 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i3, ((ViewGroup.MarginLayoutParams) c8922).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i4, ((ViewGroup.MarginLayoutParams) c8922).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, c8922)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(@InterfaceC6391 View view, int i, int i2) {
            C8922 c8922 = (C8922) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i4 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) c8922).leftMargin + ((ViewGroup.MarginLayoutParams) c8922).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c8922).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) c8922).topMargin + ((ViewGroup.MarginLayoutParams) c8922).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c8922).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, c8922)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                detachViewAt(i);
                attachView(childAt, i2);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.mRecyclerView.toString());
            }
        }

        public void offsetChildrenHorizontal(@InterfaceC6844 int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        public void offsetChildrenVertical(@InterfaceC6844 int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        public void onAdapterChanged(@InterfaceC6490 AbstractC8909 abstractC8909, @InterfaceC6490 AbstractC8909 abstractC89092) {
        }

        public boolean onAddFocusables(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        @InterfaceC3647
        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        @InterfaceC6490
        public View onFocusSearchFailed(@InterfaceC6391 View view, int i, @InterfaceC6391 C8929 c8929, @InterfaceC6391 C8935 c8935) {
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void onInitializeAccessibilityEvent(@InterfaceC6391 AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void onInitializeAccessibilityNodeInfo(C3055 c3055) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, c3055);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void onInitializeAccessibilityNodeInfoForItem(View view, C3055 c3055) {
            AbstractC8938 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.isRemoved() || this.mChildHelper.m30541(childViewHolderInt.itemView)) {
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, c3055);
        }

        @InterfaceC6490
        public View onInterceptFocusSearch(@InterfaceC6391 View view, int i) {
            return null;
        }

        public void onItemsAdded(@InterfaceC6391 RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsChanged(@InterfaceC6391 RecyclerView recyclerView) {
        }

        public void onItemsMoved(@InterfaceC6391 RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void onItemsRemoved(@InterfaceC6391 RecyclerView recyclerView, int i, int i2) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void onItemsUpdated(@InterfaceC6391 RecyclerView recyclerView, int i, int i2) {
        }

        public void onLayoutChildren(C8929 c8929, C8935 c8935) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onLayoutCompleted(C8935 c8935) {
        }

        public void onMeasure(@InterfaceC6391 C8929 c8929, @InterfaceC6391 C8935 c8935, int i, int i2) {
            this.mRecyclerView.defaultOnMeasure(i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Deprecated
        public boolean onRequestChildFocus(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 View view, @InterfaceC6490 View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        @InterfaceC6490
        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i) {
        }

        public void onSmoothScrollerStopped(AbstractC8934 abstractC8934) {
            if (this.mSmoothScroller == abstractC8934) {
                this.mSmoothScroller = null;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean performAccessibilityAction(int i, @InterfaceC6490 Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean performAccessibilityActionForItem(@InterfaceC6391 C8929 c8929, @InterfaceC6391 C8935 c8935, @InterfaceC6391 View view, int i, @InterfaceC6490 Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                C8273.m27427(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.m30544(childCount);
            }
        }

        public void removeAndRecycleAllViews(@InterfaceC6391 C8929 c8929) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, c8929);
                }
            }
        }

        public void removeAndRecycleScrapInt(C8929 c8929) {
            int iM30332 = c8929.m30332();
            for (int i = iM30332 - 1; i >= 0; i--) {
                View viewM30336 = c8929.m30336(i);
                AbstractC8938 childViewHolderInt = RecyclerView.getChildViewHolderInt(viewM30336);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(viewM30336, false);
                    }
                    AbstractC8914 abstractC8914 = this.mRecyclerView.mItemAnimator;
                    if (abstractC8914 != null) {
                        abstractC8914.mo30278(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    c8929.m30347(viewM30336);
                }
            }
            c8929.m30327();
            if (iM30332 > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(@InterfaceC6391 View view, @InterfaceC6391 C8929 c8929) {
            removeView(view);
            c8929.m30350(view);
        }

        public void removeAndRecycleViewAt(int i, @InterfaceC6391 C8929 c8929) {
            View childAt = getChildAt(i);
            removeViewAt(i);
            c8929.m30350(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(@InterfaceC6391 View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void removeView(View view) {
            this.mChildHelper.m30543(view);
        }

        public void removeViewAt(int i) {
            if (getChildAt(i) != null) {
                this.mChildHelper.m30544(i);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean requestChildRectangleOnScreen(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 View view, @InterfaceC6391 Rect rect, boolean z) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public int scrollHorizontallyBy(int i, C8929 c8929, C8935 c8935) {
            return 0;
        }

        public void scrollToPosition(int i) {
        }

        public int scrollVerticallyBy(int i, C8929 c8929, C8935 c8935) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z) {
            this.mAutoMeasure = z;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z) {
            if (z != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.m30359();
                }
            }
        }

        public void setMeasureSpecs(int i, int i2) {
            this.mWidth = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mHeightMode = mode2;
            if (mode2 != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.mHeight = 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void setMeasuredDimension(Rect rect, int i, int i2) {
            setMeasuredDimension(chooseSize(i, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i2, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        public void setMeasuredDimensionFromChildren(int i, int i2) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.mRecyclerView.mTempRect.set(i6, i4, i3, i5);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i, i2);
        }

        public void setMeasurementCacheEnabled(boolean z) {
            this.mMeasurementCacheEnabled = z;
        }

        public void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public boolean shouldMeasureChild(View view, int i, int i2, C8922 c8922) {
            return (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && m30297(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c8922).width) && m30297(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c8922).height)) ? false : true;
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean shouldReMeasureChild(View view, int i, int i2, C8922 c8922) {
            return (this.mMeasurementCacheEnabled && m30297(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) c8922).width) && m30297(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) c8922).height)) ? false : true;
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, C8935 c8935, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void startSmoothScroll(AbstractC8934 abstractC8934) {
            AbstractC8934 abstractC89342 = this.mSmoothScroller;
            if (abstractC89342 != null && abstractC8934 != abstractC89342 && abstractC89342.isRunning()) {
                this.mSmoothScroller.stop();
            }
            this.mSmoothScroller = abstractC8934;
            abstractC8934.start(this.mRecyclerView, this);
        }

        public void stopIgnoringView(@InterfaceC6391 View view) {
            AbstractC8938 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        public void stopSmoothScroller() {
            AbstractC8934 abstractC8934 = this.mSmoothScroller;
            if (abstractC8934 != null) {
                abstractC8934.stop();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m4925(View view, int i, boolean z) {
            AbstractC8938 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.m5016(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.m30796(childViewHolderInt);
            }
            C8922 c8922 = (C8922) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.m30530(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int iM30540 = this.mChildHelper.m30540(view);
                if (i == -1) {
                    i = this.mChildHelper.m30534();
                }
                if (iM30540 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.mRecyclerView.indexOfChild(view) + this.mRecyclerView.exceptionLabel());
                }
                if (iM30540 != i) {
                    this.mRecyclerView.mLayout.moveView(iM30540, i);
                }
            } else {
                this.mChildHelper.m4975(view, i, false);
                c8922.f29963 = true;
                AbstractC8934 abstractC8934 = this.mSmoothScroller;
                if (abstractC8934 != null && abstractC8934.isRunning()) {
                    this.mSmoothScroller.onChildAttachedToWindow(view);
                }
            }
            if (c8922.f29964) {
                childViewHolderInt.itemView.invalidate();
                c8922.f29964 = false;
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final void m4926(int i, @InterfaceC6391 View view) {
            this.mChildHelper.m30531(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int[] m30298(View view, Rect rect) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i = left - paddingLeft;
            int iMin = Math.min(0, i);
            int i2 = top - paddingTop;
            int iMin2 = Math.min(0, i2);
            int i3 = iWidth - width;
            int iMax = Math.max(0, i3);
            int iMax2 = Math.max(0, iHeight - height);
            if (getLayoutDirection() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i3);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i2, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean m30299(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            return rect.left - i < width && rect.right - i > paddingLeft && rect.top - i2 < height && rect.bottom - i2 > paddingTop;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final void m30300(C8929 c8929, int i, View view) {
            AbstractC8938 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.hasStableIds()) {
                removeViewAt(i);
                c8929.m30351(childViewHolderInt);
            } else {
                detachViewAt(i);
                c8929.m30352(view);
                this.mRecyclerView.mViewInfoStore.m30791(childViewHolderInt);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public void addDisappearingView(View view, int i) {
            m4925(view, i, true);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public void addView(View view, int i) {
            m4925(view, i, false);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @InterfaceC3647
        public void onDetachedFromWindow(RecyclerView recyclerView, C8929 c8929) {
            onDetachedFromWindow(recyclerView);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public void onInitializeAccessibilityEvent(@InterfaceC6391 C8929 c8929, @InterfaceC6391 C8935 c8935, @InterfaceC6391 AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            AbstractC8909 abstractC8909 = this.mRecyclerView.mAdapter;
            if (abstractC8909 != null) {
                accessibilityEvent.setItemCount(abstractC8909.getItemCount());
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public void onInitializeAccessibilityNodeInfo(@InterfaceC6391 C8929 c8929, @InterfaceC6391 C8935 c8935, @InterfaceC6391 C3055 c3055) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                c3055.m118(8192);
                c3055.m6097(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                c3055.m118(4096);
                c3055.m6097(true);
            }
            c3055.m6059(C3055.C3059.m6139(getRowCountForAccessibility(c8929, c8935), getColumnCountForAccessibility(c8929, c8935), isLayoutHierarchical(c8929, c8935), getSelectionModeForAccessibility(c8929, c8935)));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public void onItemsUpdated(@InterfaceC6391 RecyclerView recyclerView, int i, int i2, @InterfaceC6490 Object obj) {
            onItemsUpdated(recyclerView, i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public boolean onRequestChildFocus(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 C8935 c8935, @InterfaceC6391 View view, @InterfaceC6490 View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public boolean performAccessibilityAction(@InterfaceC6391 C8929 c8929, @InterfaceC6391 C8935 c8935, int i, @InterfaceC6490 Bundle bundle) {
            int height;
            int width;
            int i2;
            int i3;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return false;
            }
            if (i == 4096) {
                height = recyclerView.canScrollVertically(1) ? (getHeight() - getPaddingTop()) - getPaddingBottom() : 0;
                if (this.mRecyclerView.canScrollHorizontally(1)) {
                    width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    i2 = height;
                    i3 = width;
                }
                i2 = height;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                height = recyclerView.canScrollVertically(-1) ? -((getHeight() - getPaddingTop()) - getPaddingBottom()) : 0;
                if (this.mRecyclerView.canScrollHorizontally(-1)) {
                    width = -((getWidth() - getPaddingLeft()) - getPaddingRight());
                    i2 = height;
                    i3 = width;
                }
                i2 = height;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.mRecyclerView.smoothScrollBy(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public boolean performAccessibilityActionForItem(@InterfaceC6391 View view, int i, @InterfaceC6490 Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public boolean requestChildRectangleOnScreen(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 View view, @InterfaceC6391 Rect rect, boolean z, boolean z2) {
            int[] iArrM30298 = m30298(view, rect);
            int i = iArrM30298[0];
            int i2 = iArrM30298[1];
            if ((z2 && !m30299(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.smoothScrollBy(i, i2);
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int getChildMeasureSpec(int i, int i2, int i3, int i4, boolean z) {
            int iMax = Math.max(0, i - i3);
            if (z) {
                if (i4 < 0) {
                    if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                        i2 = 0;
                        i4 = 0;
                    } else {
                        i4 = iMax;
                    }
                }
                i2 = 1073741824;
            } else if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1) {
                if (i4 == -2) {
                    if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                        i4 = iMax;
                        i2 = Integer.MIN_VALUE;
                    } else {
                        i4 = iMax;
                        i2 = 0;
                    }
                }
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        public void onInitializeAccessibilityNodeInfoForItem(@InterfaceC6391 C8929 c8929, @InterfaceC6391 C8935 c8935, @InterfaceC6391 View view, @InterfaceC6391 C3055 c3055) {
            c3055.m6060(C3055.C3060.m6143(canScrollVertically() ? getPosition(view) : 0, 1, canScrollHorizontally() ? getPosition(view) : 0, 1, false, false));
        }

        public void attachView(@InterfaceC6391 View view, int i) {
            attachView(view, i, (C8922) view.getLayoutParams());
        }

        public C8922 generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new C8922(context, attributeSet);
        }

        public void setMeasuredDimension(int i, int i2) {
            this.mRecyclerView.setMeasuredDimension(i, i2);
        }

        public void attachView(@InterfaceC6391 View view) {
            attachView(view, -1);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۠, reason: contains not printable characters */
    public interface InterfaceC8923 {
        /* JADX INFO: renamed from: ۥ۟ */
        void mo4311(@InterfaceC6391 View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        void mo27810(@InterfaceC6391 View view);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static abstract class AbstractC8924 {
        public abstract boolean onFling(int i, int i2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۢ, reason: contains not printable characters */
    public interface InterfaceC8925 {
        /* JADX INFO: renamed from: ۥ */
        void mo4932(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 MotionEvent motionEvent);

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        boolean mo30309(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 MotionEvent motionEvent);

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        void mo30310(boolean z);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۠, reason: contains not printable characters */
    public static abstract class AbstractC8926 {
        public void onScrollStateChanged(@InterfaceC6391 RecyclerView recyclerView, int i) {
        }

        public void onScrolled(@InterfaceC6391 RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8927 {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static class C8928 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final int f29965 = 5;

        /* JADX INFO: renamed from: ۥ */
        public SparseArray<C1750> f3893 = new SparseArray<>();

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3894 = 0;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۥ$ۥ */
        public static class C1750 {

            /* JADX INFO: renamed from: ۥ */
            public final ArrayList<AbstractC8938> f3895 = new ArrayList<>();

            /* JADX INFO: renamed from: ۥ۟ */
            public int f3896 = 5;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public long f29966 = 0;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public long f29967 = 0;
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4933() {
            this.f3894++;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m4934() {
            for (int i = 0; i < this.f3893.size(); i++) {
                this.f3893.valueAt(i).f3895.clear();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m30311() {
            this.f3894--;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m30312(int i, long j) {
            C1750 c1750M30316 = m30316(i);
            c1750M30316.f29967 = m30319(c1750M30316.f29967, j);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m30313(int i, long j) {
            C1750 c1750M30316 = m30316(i);
            c1750M30316.f29966 = m30319(c1750M30316.f29966, j);
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public AbstractC8938 m30314(int i) {
            C1750 c1750 = this.f3893.get(i);
            if (c1750 == null || c1750.f3895.isEmpty()) {
                return null;
            }
            ArrayList<AbstractC8938> arrayList = c1750.f3895;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int m30315(int i) {
            return m30316(i).f3895.size();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final C1750 m30316(int i) {
            C1750 c1750 = this.f3893.get(i);
            if (c1750 != null) {
                return c1750;
            }
            C1750 c17502 = new C1750();
            this.f3893.put(i, c17502);
            return c17502;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void m30317(AbstractC8909 abstractC8909, AbstractC8909 abstractC89092, boolean z) {
            if (abstractC8909 != null) {
                m30311();
            }
            if (!z && this.f3894 == 0) {
                m4934();
            }
            if (abstractC89092 != null) {
                m4933();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m30318(AbstractC8938 abstractC8938) {
            int itemViewType = abstractC8938.getItemViewType();
            ArrayList<AbstractC8938> arrayList = m30316(itemViewType).f3895;
            if (this.f3893.get(itemViewType).f3896 <= arrayList.size()) {
                return;
            }
            abstractC8938.resetInternal();
            arrayList.add(abstractC8938);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public long m30319(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public void m30320(int i, int i2) {
            C1750 c1750M30316 = m30316(i);
            c1750M30316.f3896 = i2;
            ArrayList<AbstractC8938> arrayList = c1750M30316.f3895;
            while (arrayList.size() > i2) {
                arrayList.remove(arrayList.size() - 1);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public int m30321() {
            int size = 0;
            for (int i = 0; i < this.f3893.size(); i++) {
                ArrayList<AbstractC8938> arrayList = this.f3893.valueAt(i).f3895;
                if (arrayList != null) {
                    size += arrayList.size();
                }
            }
            return size;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public boolean m30322(int i, long j, long j2) {
            long j3 = m30316(i).f29967;
            return j3 == 0 || j + j3 < j2;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public boolean m30323(int i, long j, long j2) {
            long j3 = m30316(i).f29966;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final class C8929 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final int f29968 = 2;

        /* JADX INFO: renamed from: ۥ */
        public final ArrayList<AbstractC8938> f3897;

        /* JADX INFO: renamed from: ۥ۟ */
        public ArrayList<AbstractC8938> f3898;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final ArrayList<AbstractC8938> f29969;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final List<AbstractC8938> f29970;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f29971;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f29972;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public C8928 f29973;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public AbstractC8936 f29974;

        public C8929() {
            ArrayList<AbstractC8938> arrayList = new ArrayList<>();
            this.f3897 = arrayList;
            this.f3898 = null;
            this.f29969 = new ArrayList<>();
            this.f29970 = Collections.unmodifiableList(arrayList);
            this.f29971 = 2;
            this.f29972 = 2;
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4935(@InterfaceC6391 AbstractC8938 abstractC8938, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(abstractC8938);
            View view = abstractC8938.itemView;
            C8989 c8989 = RecyclerView.this.mAccessibilityDelegate;
            if (c8989 != null) {
                C3024 itemDelegate = c8989.getItemDelegate();
                C8273.m27439(view, itemDelegate instanceof C8989.C1783 ? ((C8989.C1783) itemDelegate).m30723(view) : null);
            }
            if (z) {
                m30329(abstractC8938);
            }
            abstractC8938.mOwnerRecyclerView = null;
            m30331().m30318(abstractC8938);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final void m4936(AbstractC8938 abstractC8938) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = abstractC8938.itemView;
                if (C8273.m27351(view) == 0) {
                    C8273.m27457(view, 1);
                }
                C8989 c8989 = RecyclerView.this.mAccessibilityDelegate;
                if (c8989 == null) {
                    return;
                }
                C3024 itemDelegate = c8989.getItemDelegate();
                if (itemDelegate instanceof C8989.C1783) {
                    ((C8989.C1783) itemDelegate).m30724(view);
                }
                C8273.m27439(view, itemDelegate);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m30324(@InterfaceC6391 View view, int i) {
            C8922 c8922;
            AbstractC8938 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null) {
                throw new IllegalArgumentException("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter" + RecyclerView.this.exceptionLabel());
            }
            int iM30506 = RecyclerView.this.mAdapterHelper.m30506(i);
            if (iM30506 < 0 || iM30506 >= RecyclerView.this.mAdapter.getItemCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iM30506 + ").state:" + RecyclerView.this.mState.m30375() + RecyclerView.this.exceptionLabel());
            }
            m30356(childViewHolderInt, iM30506, i, Long.MAX_VALUE);
            ViewGroup.LayoutParams layoutParams = childViewHolderInt.itemView.getLayoutParams();
            if (layoutParams == null) {
                c8922 = (C8922) RecyclerView.this.generateDefaultLayoutParams();
                childViewHolderInt.itemView.setLayoutParams(c8922);
            } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                c8922 = (C8922) layoutParams;
            } else {
                c8922 = (C8922) RecyclerView.this.generateLayoutParams(layoutParams);
                childViewHolderInt.itemView.setLayoutParams(c8922);
            }
            c8922.f29963 = true;
            c8922.f3891 = childViewHolderInt;
            c8922.f29964 = childViewHolderInt.itemView.getParent() == null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m30325() {
            this.f3897.clear();
            m30348();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m30326() {
            int size = this.f29969.size();
            for (int i = 0; i < size; i++) {
                this.f29969.get(i).clearOldPosition();
            }
            int size2 = this.f3897.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f3897.get(i2).clearOldPosition();
            }
            ArrayList<AbstractC8938> arrayList = this.f3898;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f3898.get(i3).clearOldPosition();
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void m30327() {
            this.f3897.clear();
            ArrayList<AbstractC8938> arrayList = this.f3898;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int m30328(int i) {
            if (i >= 0 && i < RecyclerView.this.mState.m30375()) {
                return !RecyclerView.this.mState.m30381() ? i : RecyclerView.this.mAdapterHelper.m30506(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.mState.m30375() + RecyclerView.this.exceptionLabel());
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m30329(@InterfaceC6391 AbstractC8938 abstractC8938) {
            InterfaceC8930 interfaceC8930 = RecyclerView.this.mRecyclerListener;
            if (interfaceC8930 != null) {
                interfaceC8930.m4937(abstractC8938);
            }
            AbstractC8909 abstractC8909 = RecyclerView.this.mAdapter;
            if (abstractC8909 != null) {
                abstractC8909.onViewRecycled(abstractC8938);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.m30797(abstractC8938);
            }
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public AbstractC8938 m30330(int i) {
            int size;
            int iM30506;
            ArrayList<AbstractC8938> arrayList = this.f3898;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    AbstractC8938 abstractC8938 = this.f3898.get(i2);
                    if (!abstractC8938.wasReturnedFromScrap() && abstractC8938.getLayoutPosition() == i) {
                        abstractC8938.addFlags(32);
                        return abstractC8938;
                    }
                }
                if (RecyclerView.this.mAdapter.hasStableIds() && (iM30506 = RecyclerView.this.mAdapterHelper.m30506(i)) > 0 && iM30506 < RecyclerView.this.mAdapter.getItemCount()) {
                    long itemId = RecyclerView.this.mAdapter.getItemId(iM30506);
                    for (int i3 = 0; i3 < size; i3++) {
                        AbstractC8938 abstractC89382 = this.f3898.get(i3);
                        if (!abstractC89382.wasReturnedFromScrap() && abstractC89382.getItemId() == itemId) {
                            abstractC89382.addFlags(32);
                            return abstractC89382;
                        }
                    }
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public C8928 m30331() {
            if (this.f29973 == null) {
                this.f29973 = new C8928();
            }
            return this.f29973;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public int m30332() {
            return this.f3897.size();
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public List<AbstractC8938> m30333() {
            return this.f29970;
        }

        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:20:0x0061 */
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public AbstractC8938 m30334(long j, int i, boolean z) {
            for (int size = this.f3897.size() - 1; size >= 0; size--) {
                AbstractC8938 abstractC8938 = this.f3897.get(size);
                if (abstractC8938.getItemId() == j && !abstractC8938.wasReturnedFromScrap()) {
                    if (i == abstractC8938.getItemViewType()) {
                        abstractC8938.addFlags(32);
                        if (abstractC8938.isRemoved() && !RecyclerView.this.mState.m30381()) {
                            abstractC8938.setFlags(2, 14);
                        }
                        return abstractC8938;
                    }
                    if (!z) {
                        this.f3897.remove(size);
                        RecyclerView.this.removeDetachedView(abstractC8938.itemView, false);
                        m30347(abstractC8938.itemView);
                    }
                }
            }
            int size2 = this.f29969.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                AbstractC8938 abstractC89382 = this.f29969.get(size2);
                if (abstractC89382.getItemId() == j && !abstractC89382.isAttachedToTransitionOverlay()) {
                    if (i == abstractC89382.getItemViewType()) {
                        if (!z) {
                            this.f29969.remove(size2);
                        }
                        return abstractC89382;
                    }
                    if (!z) {
                        m30349(size2);
                        return null;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public AbstractC8938 m30335(int i, boolean z) {
            View viewM30532;
            int size = this.f3897.size();
            for (int i2 = 0; i2 < size; i2++) {
                AbstractC8938 abstractC8938 = this.f3897.get(i2);
                if (!abstractC8938.wasReturnedFromScrap() && abstractC8938.getLayoutPosition() == i && !abstractC8938.isInvalid() && (RecyclerView.this.mState.f29991 || !abstractC8938.isRemoved())) {
                    abstractC8938.addFlags(32);
                    return abstractC8938;
                }
            }
            if (z || (viewM30532 = RecyclerView.this.mChildHelper.m30532(i)) == null) {
                int size2 = this.f29969.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    AbstractC8938 abstractC89382 = this.f29969.get(i3);
                    if (!abstractC89382.isInvalid() && abstractC89382.getLayoutPosition() == i && !abstractC89382.isAttachedToTransitionOverlay()) {
                        if (!z) {
                            this.f29969.remove(i3);
                        }
                        return abstractC89382;
                    }
                }
                return null;
            }
            AbstractC8938 childViewHolderInt = RecyclerView.getChildViewHolderInt(viewM30532);
            RecyclerView.this.mChildHelper.m30546(viewM30532);
            int iM30540 = RecyclerView.this.mChildHelper.m30540(viewM30532);
            if (iM30540 != -1) {
                RecyclerView.this.mChildHelper.m30531(iM30540);
                m30352(viewM30532);
                childViewHolderInt.addFlags(8224);
                return childViewHolderInt;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public View m30336(int i) {
            return this.f3897.get(i).itemView;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public View m30337(int i) {
            return m30338(i, false);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public View m30338(int i, boolean z) {
            return m30357(i, z, Long.MAX_VALUE).itemView;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public final void m30339(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m30339((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public final void m30340(AbstractC8938 abstractC8938) {
            View view = abstractC8938.itemView;
            if (view instanceof ViewGroup) {
                m30339((ViewGroup) view, false);
            }
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public void m30341() {
            int size = this.f29969.size();
            for (int i = 0; i < size; i++) {
                C8922 c8922 = (C8922) this.f29969.get(i).itemView.getLayoutParams();
                if (c8922 != null) {
                    c8922.f29963 = true;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public void m30342() {
            int size = this.f29969.size();
            for (int i = 0; i < size; i++) {
                AbstractC8938 abstractC8938 = this.f29969.get(i);
                if (abstractC8938 != null) {
                    abstractC8938.addFlags(6);
                    abstractC8938.addChangePayload(null);
                }
            }
            AbstractC8909 abstractC8909 = RecyclerView.this.mAdapter;
            if (abstractC8909 == null || !abstractC8909.hasStableIds()) {
                m30348();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public void m30343(int i, int i2) {
            int size = this.f29969.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC8938 abstractC8938 = this.f29969.get(i3);
                if (abstractC8938 != null && abstractC8938.mPosition >= i) {
                    abstractC8938.offsetPosition(i2, true);
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public void m30344(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.f29969.size();
            for (int i7 = 0; i7 < size; i7++) {
                AbstractC8938 abstractC8938 = this.f29969.get(i7);
                if (abstractC8938 != null && (i6 = abstractC8938.mPosition) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        abstractC8938.offsetPosition(i2 - i, false);
                    } else {
                        abstractC8938.offsetPosition(i3, false);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public void m30345(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f29969.size() - 1; size >= 0; size--) {
                AbstractC8938 abstractC8938 = this.f29969.get(size);
                if (abstractC8938 != null) {
                    int i4 = abstractC8938.mPosition;
                    if (i4 >= i3) {
                        abstractC8938.offsetPosition(-i2, z);
                    } else if (i4 >= i) {
                        abstractC8938.addFlags(8);
                        m30349(size);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public void m30346(AbstractC8909 abstractC8909, AbstractC8909 abstractC89092, boolean z) {
            m30325();
            m30331().m30317(abstractC8909, abstractC89092, z);
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public void m30347(View view) {
            AbstractC8938 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.mScrapContainer = null;
            childViewHolderInt.mInChangeScrap = false;
            childViewHolderInt.clearReturnedFromScrapFlag();
            m30351(childViewHolderInt);
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public void m30348() {
            for (int size = this.f29969.size() - 1; size >= 0; size--) {
                m30349(size);
            }
            this.f29969.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.m4989();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public void m30349(int i) {
            m4935(this.f29969.get(i), true);
            this.f29969.remove(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public void m30350(@InterfaceC6391 View view) {
            AbstractC8938 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            m30351(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator == null || childViewHolderInt.isRecyclable()) {
                return;
            }
            RecyclerView.this.mItemAnimator.mo30278(childViewHolderInt);
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public void m30351(AbstractC8938 abstractC8938) {
            boolean z;
            boolean z2 = true;
            if (abstractC8938.isScrap() || abstractC8938.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(abstractC8938.isScrap());
                sb.append(" isAttached:");
                sb.append(abstractC8938.itemView.getParent() != null);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
            if (abstractC8938.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC8938 + RecyclerView.this.exceptionLabel());
            }
            if (abstractC8938.shouldIgnore()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
            }
            boolean zDoesTransientStatePreventRecycling = abstractC8938.doesTransientStatePreventRecycling();
            AbstractC8909 abstractC8909 = RecyclerView.this.mAdapter;
            if ((abstractC8909 != null && zDoesTransientStatePreventRecycling && abstractC8909.onFailedToRecycleView(abstractC8938)) || abstractC8938.isRecyclable()) {
                if (this.f29972 <= 0 || abstractC8938.hasAnyOfTheFlags(526)) {
                    z = false;
                } else {
                    int size = this.f29969.size();
                    if (size >= this.f29972 && size > 0) {
                        m30349(0);
                        size--;
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.m30620(abstractC8938.mPosition)) {
                        int i = size - 1;
                        while (i >= 0) {
                            if (!RecyclerView.this.mPrefetchRegistry.m30620(this.f29969.get(i).mPosition)) {
                                break;
                            } else {
                                i--;
                            }
                        }
                        size = i + 1;
                    }
                    this.f29969.add(size, abstractC8938);
                    z = true;
                }
                if (z) {
                    z2 = false;
                } else {
                    m4935(abstractC8938, true);
                }
                z = z;
            } else {
                z2 = false;
            }
            RecyclerView.this.mViewInfoStore.m30797(abstractC8938);
            if (z || z2 || !zDoesTransientStatePreventRecycling) {
                return;
            }
            abstractC8938.mOwnerRecyclerView = null;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public void m30352(View view) {
            AbstractC8938 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f3898 == null) {
                    this.f3898 = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f3898.add(childViewHolderInt);
                return;
            }
            if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || RecyclerView.this.mAdapter.hasStableIds()) {
                childViewHolderInt.setScrapContainer(this, false);
                this.f3897.add(childViewHolderInt);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public void m30353(C8928 c8928) {
            C8928 c89282 = this.f29973;
            if (c89282 != null) {
                c89282.m30311();
            }
            this.f29973 = c8928;
            if (c8928 == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f29973.m4933();
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public void m30354(AbstractC8936 abstractC8936) {
            this.f29974 = abstractC8936;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public void m30355(int i) {
            this.f29971 = i;
            m30359();
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public final boolean m30356(@InterfaceC6391 AbstractC8938 abstractC8938, int i, int i2, long j) {
            abstractC8938.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = abstractC8938.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f29973.m30322(itemViewType, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.mAdapter.bindViewHolder(abstractC8938, i);
            this.f29973.m30312(abstractC8938.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            m4936(abstractC8938);
            if (!RecyclerView.this.mState.m30381()) {
                return true;
            }
            abstractC8938.mPreLayoutPosition = i2;
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x020d  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0229 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:108:0x022c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x014a A[PHI: r1 r4
  0x014a: PHI (r1v12 androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ) = (r1v11 androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ), (r1v31 androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ) binds: [B:28:0x005d, B:59:0x0102] A[DONT_GENERATE, DONT_INLINE]
  0x014a: PHI (r4v3 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:28:0x005d, B:59:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x01ff  */
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public AbstractC8938 m30357(int i, boolean z, long j) {
            AbstractC8938 childViewHolder;
            boolean z2;
            AbstractC8938 abstractC8938;
            boolean z3;
            boolean zM30356;
            ViewGroup.LayoutParams layoutParams;
            C8922 c8922;
            RecyclerView recyclerViewFindNestedRecyclerView;
            AbstractC8936 abstractC8936;
            View viewM4946;
            if (i < 0 || i >= RecyclerView.this.mState.m30375()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + RecyclerView.this.mState.m30375() + RecyclerView.this.exceptionLabel());
            }
            if (RecyclerView.this.mState.m30381()) {
                childViewHolder = m30330(i);
                if (childViewHolder != null) {
                    z2 = true;
                }
                if (childViewHolder == null && (childViewHolder = m30335(i, z)) != null) {
                    if (m30360(childViewHolder)) {
                        if (!z) {
                            childViewHolder.addFlags(4);
                            if (childViewHolder.isScrap()) {
                                RecyclerView.this.removeDetachedView(childViewHolder.itemView, false);
                                childViewHolder.unScrap();
                            } else if (childViewHolder.wasReturnedFromScrap()) {
                                childViewHolder.clearReturnedFromScrapFlag();
                            }
                            m30351(childViewHolder);
                        }
                        childViewHolder = null;
                    } else {
                        z2 = true;
                    }
                }
                if (childViewHolder != null) {
                    abstractC8938 = childViewHolder;
                } else {
                    int iM30506 = RecyclerView.this.mAdapterHelper.m30506(i);
                    if (iM30506 < 0 || iM30506 >= RecyclerView.this.mAdapter.getItemCount()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iM30506 + ").state:" + RecyclerView.this.mState.m30375() + RecyclerView.this.exceptionLabel());
                    }
                    int itemViewType = RecyclerView.this.mAdapter.getItemViewType(iM30506);
                    if (RecyclerView.this.mAdapter.hasStableIds() && (childViewHolder = m30334(RecyclerView.this.mAdapter.getItemId(iM30506), itemViewType, z)) != null) {
                        childViewHolder.mPosition = iM30506;
                        z2 = true;
                    }
                    if (childViewHolder == null && (abstractC8936 = this.f29974) != null && (viewM4946 = abstractC8936.m4946(this, i, itemViewType)) != null) {
                        childViewHolder = RecyclerView.this.getChildViewHolder(viewM4946);
                        if (childViewHolder == null) {
                            throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder" + RecyclerView.this.exceptionLabel());
                        }
                        if (childViewHolder.shouldIgnore()) {
                            throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view." + RecyclerView.this.exceptionLabel());
                        }
                    }
                    if (childViewHolder == null) {
                        AbstractC8938 abstractC8938M30314 = m30331().m30314(itemViewType);
                        if (abstractC8938M30314 != null) {
                            abstractC8938M30314.resetInternal();
                            if (RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST) {
                                m30340(abstractC8938M30314);
                            }
                        }
                        childViewHolder = abstractC8938M30314;
                    }
                    if (childViewHolder == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j != Long.MAX_VALUE && !this.f29973.m30323(itemViewType, nanoTime, j)) {
                            return null;
                        }
                        RecyclerView recyclerView = RecyclerView.this;
                        AbstractC8938 abstractC8938CreateViewHolder = recyclerView.mAdapter.createViewHolder(recyclerView, itemViewType);
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && (recyclerViewFindNestedRecyclerView = RecyclerView.findNestedRecyclerView(abstractC8938CreateViewHolder.itemView)) != null) {
                            abstractC8938CreateViewHolder.mNestedRecyclerView = new WeakReference<>(recyclerViewFindNestedRecyclerView);
                        }
                        this.f29973.m30313(itemViewType, RecyclerView.this.getNanoTime() - nanoTime);
                        abstractC8938 = abstractC8938CreateViewHolder;
                    }
                }
                z3 = z2;
                if (z3 && !RecyclerView.this.mState.m30381() && abstractC8938.hasAnyOfTheFlags(8192)) {
                    abstractC8938.setFlags(0, 8192);
                    if (RecyclerView.this.mState.f29994) {
                        int iM30270 = AbstractC8914.m30270(abstractC8938) | 4096;
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.this.recordAnimationInfoIfBouncedHiddenView(abstractC8938, recyclerView2.mItemAnimator.m30290(recyclerView2.mState, abstractC8938, iM30270, abstractC8938.getUnmodifiedPayloads()));
                    }
                }
                if (RecyclerView.this.mState.m30381() || !abstractC8938.isBound()) {
                    if (abstractC8938.isBound() || abstractC8938.needsUpdate() || abstractC8938.isInvalid()) {
                        zM30356 = m30356(abstractC8938, RecyclerView.this.mAdapterHelper.m30506(i), i, j);
                    }
                    layoutParams = abstractC8938.itemView.getLayoutParams();
                    if (layoutParams == null) {
                        c8922 = (C8922) RecyclerView.this.generateDefaultLayoutParams();
                        abstractC8938.itemView.setLayoutParams(c8922);
                    } else if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                        c8922 = (C8922) layoutParams;
                    } else {
                        c8922 = (C8922) RecyclerView.this.generateLayoutParams(layoutParams);
                        abstractC8938.itemView.setLayoutParams(c8922);
                    }
                    c8922.f3891 = abstractC8938;
                    c8922.f29964 = z3 && zM30356;
                    return abstractC8938;
                }
                abstractC8938.mPreLayoutPosition = i;
                zM30356 = false;
                layoutParams = abstractC8938.itemView.getLayoutParams();
                if (layoutParams == null) {
                }
                c8922.f3891 = abstractC8938;
                c8922.f29964 = z3 && zM30356;
                return abstractC8938;
            }
            childViewHolder = null;
            z2 = false;
            if (childViewHolder == null) {
                if (m30360(childViewHolder)) {
                }
            }
            if (childViewHolder != null) {
            }
            z3 = z2;
            if (z3) {
                abstractC8938.setFlags(0, 8192);
                if (RecyclerView.this.mState.f29994) {
                }
            }
            if (RecyclerView.this.mState.m30381()) {
                if (abstractC8938.isBound()) {
                }
                zM30356 = m30356(abstractC8938, RecyclerView.this.mAdapterHelper.m30506(i), i, j);
            }
            layoutParams = abstractC8938.itemView.getLayoutParams();
            if (layoutParams == null) {
            }
            c8922.f3891 = abstractC8938;
            c8922.f29964 = z3 && zM30356;
            return abstractC8938;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public void m30358(AbstractC8938 abstractC8938) {
            if (abstractC8938.mInChangeScrap) {
                this.f3898.remove(abstractC8938);
            } else {
                this.f3897.remove(abstractC8938);
            }
            abstractC8938.mScrapContainer = null;
            abstractC8938.mInChangeScrap = false;
            abstractC8938.clearReturnedFromScrapFlag();
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public void m30359() {
            AbstractC8919 abstractC8919 = RecyclerView.this.mLayout;
            this.f29972 = this.f29971 + (abstractC8919 != null ? abstractC8919.mPrefetchMaxCountObserved : 0);
            for (int size = this.f29969.size() - 1; size >= 0 && this.f29969.size() > this.f29972; size--) {
                m30349(size);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public boolean m30360(AbstractC8938 abstractC8938) {
            if (abstractC8938.isRemoved()) {
                return RecyclerView.this.mState.m30381();
            }
            int i = abstractC8938.mPosition;
            if (i >= 0 && i < RecyclerView.this.mAdapter.getItemCount()) {
                if (RecyclerView.this.mState.m30381() || RecyclerView.this.mAdapter.getItemViewType(abstractC8938.mPosition) == abstractC8938.getItemViewType()) {
                    return !RecyclerView.this.mAdapter.hasStableIds() || abstractC8938.getItemId() == RecyclerView.this.mAdapter.getItemId(abstractC8938.mPosition);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + abstractC8938 + RecyclerView.this.exceptionLabel());
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public void m30361(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f29969.size() - 1; size >= 0; size--) {
                AbstractC8938 abstractC8938 = this.f29969.get(size);
                if (abstractC8938 != null && (i3 = abstractC8938.mPosition) >= i && i3 < i4) {
                    abstractC8938.addFlags(2);
                    m30349(size);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۧ, reason: contains not printable characters */
    public interface InterfaceC8930 {
        /* JADX INFO: renamed from: ۥ */
        void m4937(@InterfaceC6391 AbstractC8938 abstractC8938);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠ۨ, reason: contains not printable characters */
    public class C8931 extends AbstractC8911 {
        public C8931() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8911
        public void onChanged() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f29990 = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (RecyclerView.this.mAdapterHelper.m30509()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8911
        public void onItemRangeChanged(int i, int i2, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m30511(i, i2, obj)) {
                m4938();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8911
        public void onItemRangeInserted(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m30512(i, i2)) {
                m4938();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8911
        public void onItemRangeMoved(int i, int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m30513(i, i2, i3)) {
                m4938();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8911
        public void onItemRangeRemoved(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.m30514(i, i2)) {
                m4938();
            }
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4938() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    C8273.m27427(recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static class C8933 implements InterfaceC8925 {
        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC8925
        /* JADX INFO: renamed from: ۥ */
        public void mo4932(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 MotionEvent motionEvent) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC8925
        /* JADX INFO: renamed from: ۥ۟۟ */
        public boolean mo30309(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 MotionEvent motionEvent) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC8925
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo30310(boolean z) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static abstract class AbstractC8934 {
        private AbstractC8919 mLayoutManager;
        private boolean mPendingInitialRun;
        private RecyclerView mRecyclerView;
        private boolean mRunning;
        private boolean mStarted;
        private View mTargetView;
        private int mTargetPosition = -1;
        private final C1752 mRecyclingAction = new C1752(0, 0);

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠$ۥ */
        public static class C1752 {

            /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
            public static final int f29977 = Integer.MIN_VALUE;

            /* JADX INFO: renamed from: ۥ */
            public int f3900;

            /* JADX INFO: renamed from: ۥ۟ */
            public int f3901;

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public int f29978;

            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public int f29979;

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public Interpolator f29980;

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public boolean f29981;

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public int f29982;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public C1752(@InterfaceC6844 int i, @InterfaceC6844 int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            /* JADX INFO: renamed from: ۥ */
            public int m4942() {
                return this.f29978;
            }

            @InterfaceC6844
            /* JADX INFO: renamed from: ۥ۟ */
            public int m4943() {
                return this.f3900;
            }

            @InterfaceC6844
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public int m30363() {
                return this.f3901;
            }

            @InterfaceC6490
            /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
            public Interpolator m30364() {
                return this.f29980;
            }

            /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
            public boolean m30365() {
                return this.f29979 >= 0;
            }

            /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
            public void m30366(int i) {
                this.f29979 = i;
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
            public void m30367(RecyclerView recyclerView) {
                int i = this.f29979;
                if (i >= 0) {
                    this.f29979 = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f29981 = false;
                } else {
                    if (!this.f29981) {
                        this.f29982 = 0;
                        return;
                    }
                    m30373();
                    recyclerView.mViewFlinger.m30390(this.f3900, this.f3901, this.f29978, this.f29980);
                    int i2 = this.f29982 + 1;
                    this.f29982 = i2;
                    if (i2 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f29981 = false;
                }
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
            public void m30368(int i) {
                this.f29981 = true;
                this.f29978 = i;
            }

            /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
            public void m30369(@InterfaceC6844 int i) {
                this.f29981 = true;
                this.f3900 = i;
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
            public void m30370(@InterfaceC6844 int i) {
                this.f29981 = true;
                this.f3901 = i;
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
            public void m30371(@InterfaceC6490 Interpolator interpolator) {
                this.f29981 = true;
                this.f29980 = interpolator;
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
            public void m30372(@InterfaceC6844 int i, @InterfaceC6844 int i2, int i3, @InterfaceC6490 Interpolator interpolator) {
                this.f3900 = i;
                this.f3901 = i2;
                this.f29978 = i3;
                this.f29980 = interpolator;
                this.f29981 = true;
            }

            /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
            public final void m30373() {
                if (this.f29980 != null && this.f29978 < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f29978 < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public C1752(@InterfaceC6844 int i, @InterfaceC6844 int i2, int i3) {
                this(i, i2, i3, null);
            }

            public C1752(@InterfaceC6844 int i, @InterfaceC6844 int i2, int i3, @InterfaceC6490 Interpolator interpolator) {
                this.f29979 = -1;
                this.f29981 = false;
                this.f29982 = 0;
                this.f3900 = i;
                this.f3901 = i2;
                this.f29978 = i3;
                this.f29980 = interpolator;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ۠$ۥ۟ */
        public interface InterfaceC1753 {
            @InterfaceC6490
            PointF computeScrollVectorForPosition(int i);
        }

        @InterfaceC6490
        public PointF computeScrollVectorForPosition(int i) {
            Object layoutManager = getLayoutManager();
            if (layoutManager instanceof InterfaceC1753) {
                return ((InterfaceC1753) layoutManager).computeScrollVectorForPosition(i);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC1753.class.getCanonicalName());
            return null;
        }

        public View findViewByPosition(int i) {
            return this.mRecyclerView.mLayout.findViewByPosition(i);
        }

        public int getChildCount() {
            return this.mRecyclerView.mLayout.getChildCount();
        }

        public int getChildPosition(View view) {
            return this.mRecyclerView.getChildLayoutPosition(view);
        }

        @InterfaceC6490
        public AbstractC8919 getLayoutManager() {
            return this.mLayoutManager;
        }

        public int getTargetPosition() {
            return this.mTargetPosition;
        }

        @Deprecated
        public void instantScrollToPosition(int i) {
            this.mRecyclerView.scrollToPosition(i);
        }

        public boolean isPendingInitialRun() {
            return this.mPendingInitialRun;
        }

        public boolean isRunning() {
            return this.mRunning;
        }

        public void normalize(@InterfaceC6391 PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        public void onAnimation(int i, int i2) {
            PointF pointFComputeScrollVectorForPosition;
            RecyclerView recyclerView = this.mRecyclerView;
            if (this.mTargetPosition == -1 || recyclerView == null) {
                stop();
            }
            if (this.mPendingInitialRun && this.mTargetView == null && this.mLayoutManager != null && (pointFComputeScrollVectorForPosition = computeScrollVectorForPosition(this.mTargetPosition)) != null) {
                float f = pointFComputeScrollVectorForPosition.x;
                if (f != 0.0f || pointFComputeScrollVectorForPosition.y != 0.0f) {
                    recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(pointFComputeScrollVectorForPosition.y), null);
                }
            }
            this.mPendingInitialRun = false;
            View view = this.mTargetView;
            if (view != null) {
                if (getChildPosition(view) == this.mTargetPosition) {
                    onTargetFound(this.mTargetView, recyclerView.mState, this.mRecyclingAction);
                    this.mRecyclingAction.m30367(recyclerView);
                    stop();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.mTargetView = null;
                }
            }
            if (this.mRunning) {
                onSeekTargetStep(i, i2, recyclerView.mState, this.mRecyclingAction);
                boolean zM30365 = this.mRecyclingAction.m30365();
                this.mRecyclingAction.m30367(recyclerView);
                if (zM30365 && this.mRunning) {
                    this.mPendingInitialRun = true;
                    recyclerView.mViewFlinger.m30389();
                }
            }
        }

        public void onChildAttachedToWindow(View view) {
            if (getChildPosition(view) == getTargetPosition()) {
                this.mTargetView = view;
            }
        }

        public abstract void onSeekTargetStep(@InterfaceC6844 int i, @InterfaceC6844 int i2, @InterfaceC6391 C8935 c8935, @InterfaceC6391 C1752 c1752);

        public abstract void onStart();

        public abstract void onStop();

        public abstract void onTargetFound(@InterfaceC6391 View view, @InterfaceC6391 C8935 c8935, @InterfaceC6391 C1752 c1752);

        public void setTargetPosition(int i) {
            this.mTargetPosition = i;
        }

        public void start(RecyclerView recyclerView, AbstractC8919 abstractC8919) {
            recyclerView.mViewFlinger.m30391();
            if (this.mStarted) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.mRecyclerView = recyclerView;
            this.mLayoutManager = abstractC8919;
            int i = this.mTargetPosition;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.mState.f3902 = i;
            this.mRunning = true;
            this.mPendingInitialRun = true;
            this.mTargetView = findViewByPosition(getTargetPosition());
            onStart();
            this.mRecyclerView.mViewFlinger.m30389();
            this.mStarted = true;
        }

        public final void stop() {
            if (this.mRunning) {
                this.mRunning = false;
                onStop();
                this.mRecyclerView.mState.f3902 = -1;
                this.mTargetView = null;
                this.mTargetPosition = -1;
                this.mPendingInitialRun = false;
                this.mLayoutManager.onSmoothScrollerStopped(this);
                this.mLayoutManager = null;
                this.mRecyclerView = null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static class C8935 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static final int f29983 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static final int f29984 = 2;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final int f29985 = 4;

        /* JADX INFO: renamed from: ۥ۟ */
        public SparseArray<Object> f3903;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public int f29996;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public long f29997;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public int f29998;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public int f29999;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public int f30000;

        /* JADX INFO: renamed from: ۥ */
        public int f3902 = -1;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f29986 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f29987 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f29988 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f29989 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean f29990 = false;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public boolean f29991 = false;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public boolean f29992 = false;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public boolean f29993 = false;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public boolean f29994 = false;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public boolean f29995 = false;

        public String toString() {
            return "State{mTargetPosition=" + this.f3902 + ", mData=" + this.f3903 + ", mItemCount=" + this.f29989 + ", mIsMeasuring=" + this.f29993 + ", mPreviousLayoutItemCount=" + this.f29986 + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f29987 + ", mStructureChanged=" + this.f29990 + ", mInPreLayout=" + this.f29991 + ", mRunSimpleAnimations=" + this.f29994 + ", mRunPredictiveAnimations=" + this.f29995 + C6193.f1885;
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4944(int i) {
            if ((this.f29988 & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f29988));
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m4945() {
            return this.f29990;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public <T> T m30374(int i) {
            SparseArray<Object> sparseArray = this.f3903;
            if (sparseArray == null) {
                return null;
            }
            return (T) sparseArray.get(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m30375() {
            return this.f29991 ? this.f29986 - this.f29987 : this.f29989;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int m30376() {
            return this.f29999;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int m30377() {
            return this.f30000;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int m30378() {
            return this.f3902;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public boolean m30379() {
            return this.f3902 != -1;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public boolean m30380() {
            return this.f29993;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public boolean m30381() {
            return this.f29991;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void m30382(AbstractC8909 abstractC8909) {
            this.f29988 = 1;
            this.f29989 = abstractC8909.getItemCount();
            this.f29991 = false;
            this.f29992 = false;
            this.f29993 = false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public void m30383(int i, Object obj) {
            if (this.f3903 == null) {
                this.f3903 = new SparseArray<>();
            }
            this.f3903.put(i, obj);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public void m30384(int i) {
            SparseArray<Object> sparseArray = this.f3903;
            if (sparseArray == null) {
                return;
            }
            sparseArray.remove(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public boolean m30385() {
            return this.f29995;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public boolean m30386() {
            return this.f29994;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static abstract class AbstractC8936 {
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        public abstract View m4946(@InterfaceC6391 C8929 c8929, int i, int i2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟ۡ, reason: contains not printable characters */
    public class RunnableC8937 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f30001;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f30002;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public OverScroller f30003;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public Interpolator f30004;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public boolean f30005;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public boolean f30006;

        public RunnableC8937() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f30004 = interpolator;
            this.f30005 = false;
            this.f30006 = false;
            this.f30003 = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                m30391();
                return;
            }
            this.f30006 = false;
            this.f30005 = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f30003;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f30001;
                int i4 = currY - this.f30002;
                this.f30001 = currX;
                this.f30002 = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i3 -= i2;
                    i4 -= i;
                    AbstractC8934 abstractC8934 = recyclerView4.mLayout.mSmoothScroller;
                    if (abstractC8934 != null && !abstractC8934.isPendingInitialRun() && abstractC8934.isRunning()) {
                        int iM30375 = RecyclerView.this.mState.m30375();
                        if (iM30375 == 0) {
                            abstractC8934.stop();
                        } else if (abstractC8934.getTargetPosition() >= iM30375) {
                            abstractC8934.setTargetPosition(iM30375 - 1);
                            abstractC8934.onAnimation(i2, i);
                        } else {
                            abstractC8934.onAnimation(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i2, i, i3, i4, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    recyclerView6.dispatchOnScrolled(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                AbstractC8934 abstractC89342 = RecyclerView.this.mLayout.mSmoothScroller;
                if ((abstractC89342 == null || !abstractC89342.isPendingInitialRun()) && z) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i7, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.m4989();
                    }
                } else {
                    m30389();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    RunnableC8971 runnableC8971 = recyclerView7.mGapWorker;
                    if (runnableC8971 != null) {
                        runnableC8971.m30614(recyclerView7, i2, i);
                    }
                }
            }
            AbstractC8934 abstractC89343 = RecyclerView.this.mLayout.mSmoothScroller;
            if (abstractC89343 != null && abstractC89343.isPendingInitialRun()) {
                abstractC89343.onAnimation(0, 0);
            }
            this.f30005 = false;
            if (this.f30006) {
                m30388();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.stopNestedScroll(1);
            }
        }

        /* JADX INFO: renamed from: ۥ */
        public final int m4947(int i, int i2, int i3, int i4) {
            int iRound;
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt((i3 * i3) + (i4 * i4));
            int iSqrt2 = (int) Math.sqrt((i * i) + (i2 * i2));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i5 = width / 2;
            float f = width;
            float f2 = i5;
            float fM4948 = f2 + (m4948(Math.min(1.0f, (iSqrt2 * 1.0f) / f)) * f2);
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fM4948 / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f) + 1.0f) * 300.0f);
            }
            return Math.min(iRound, RecyclerView.MAX_SCROLL_DURATION);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final float m4948(float f) {
            return (float) Math.sin((f - 0.5f) * 0.47123894f);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m30387(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f30002 = 0;
            this.f30001 = 0;
            Interpolator interpolator = this.f30004;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f30004 = interpolator2;
                this.f30003 = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f30003.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            m30389();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m30388() {
            RecyclerView.this.removeCallbacks(this);
            C8273.m27427(RecyclerView.this, this);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m30389() {
            if (this.f30005) {
                this.f30006 = true;
            } else {
                m30388();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void m30390(int i, int i2, int i3, @InterfaceC6490 Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m4947(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f30004 != interpolator) {
                this.f30004 = interpolator;
                this.f30003 = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f30002 = 0;
            this.f30001 = 0;
            RecyclerView.this.setScrollState(2);
            this.f30003.startScroll(0, 0, i, i2, i4);
            m30389();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m30391() {
            RecyclerView.this.removeCallbacks(this);
            this.f30003.abortAnimation();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static abstract class AbstractC8938 {
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
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;

        @InterfaceC6391
        public final View itemView;
        int mFlags;
        WeakReference<RecyclerView> mNestedRecyclerView;
        RecyclerView mOwnerRecyclerView;
        int mPosition = -1;
        int mOldPosition = -1;
        long mItemId = -1;
        int mItemViewType = -1;
        int mPreLayoutPosition = -1;
        AbstractC8938 mShadowedHolder = null;
        AbstractC8938 mShadowingHolder = null;
        List<Object> mPayloads = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mIsRecyclableCount = 0;
        C8929 mScrapContainer = null;
        boolean mInChangeScrap = false;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        @InterfaceC8392
        int mPendingAccessibilityState = -1;

        public AbstractC8938(@InterfaceC6391 View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.itemView = view;
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                m4949();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && C8273.m27395(this.itemView);
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionFor(this);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !C8273.m27395(this.itemView);
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((C8922) this.itemView.getLayoutParams()).f29963 = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = C8273.m27351(this.itemView);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i = this.mIsRecyclableCount;
            int i2 = z ? i - 1 : i + 1;
            this.mIsRecyclableCount = i2;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i2 == 1) {
                this.mFlags |= 16;
            } else if (z && i2 == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(C8929 c8929, boolean z) {
            this.mScrapContainer = c8929;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.m30358(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m4949() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }
    }

    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new InterpolatorC8905();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RecyclerView(@InterfaceC6391 Context context) {
        this(context, null);
    }

    public static void clearNestedRecyclerViewIfNotNested(@InterfaceC6391 AbstractC8938 abstractC8938) {
        WeakReference<RecyclerView> weakReference = abstractC8938.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == abstractC8938.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                recyclerView = parent instanceof View ? (View) parent : null;
            }
            abstractC8938.mNestedRecyclerView = null;
        }
    }

    @InterfaceC6490
    public static RecyclerView findNestedRecyclerView(@InterfaceC6391 View view) {
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

    public static AbstractC8938 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((C8922) view.getLayoutParams()).f3891;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        C8922 c8922 = (C8922) view.getLayoutParams();
        Rect rect2 = c8922.f3892;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c8922).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c8922).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c8922).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c8922).bottomMargin);
    }

    private C6366 getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C6366(this);
        }
        return this.mScrollingChildHelper;
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
        C8273.m27425(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 == null || !abstractC8919.onAddFocusables(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void addItemDecoration(@InterfaceC6391 AbstractC8918 abstractC8918, int i) {
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 != null) {
            abstractC8919.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(abstractC8918);
        } else {
            this.mItemDecorations.add(i, abstractC8918);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@InterfaceC6391 InterfaceC8923 interfaceC8923) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(interfaceC8923);
    }

    public void addOnItemTouchListener(@InterfaceC6391 InterfaceC8925 interfaceC8925) {
        this.mOnItemTouchListeners.add(interfaceC8925);
    }

    public void addOnScrollListener(@InterfaceC6391 AbstractC8926 abstractC8926) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(abstractC8926);
    }

    public void animateAppearance(@InterfaceC6391 AbstractC8938 abstractC8938, @InterfaceC6490 AbstractC8914.C8916 c8916, @InterfaceC6391 AbstractC8914.C8916 c89162) {
        abstractC8938.setIsRecyclable(false);
        if (this.mItemAnimator.mo4919(abstractC8938, c8916, c89162)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(@InterfaceC6391 AbstractC8938 abstractC8938, @InterfaceC6391 AbstractC8914.C8916 c8916, @InterfaceC6490 AbstractC8914.C8916 c89162) {
        m4907(abstractC8938);
        abstractC8938.setIsRecyclable(false);
        if (this.mItemAnimator.mo30271(abstractC8938, c8916, c89162)) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        throw new IllegalStateException(str + exceptionLabel());
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
        }
    }

    public boolean canReuseUpdatedViewHolder(AbstractC8938 abstractC8938) {
        AbstractC8914 abstractC8914 = this.mItemAnimator;
        return abstractC8914 == null || abstractC8914.mo30274(abstractC8938, abstractC8938.getUnmodifiedPayloads());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C8922) && this.mLayout.checkLayoutParams((C8922) layoutParams);
    }

    public void clearOldPositions() {
        int iM30537 = this.mChildHelper.m30537();
        for (int i = 0; i < iM30537; i++) {
            AbstractC8938 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m30536(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        this.mRecycler.m30326();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<InterfaceC8923> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<AbstractC8926> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View, Yue.InterfaceC7246
    public int computeHorizontalScrollExtent() {
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 != null && abstractC8919.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, Yue.InterfaceC7246
    public int computeHorizontalScrollOffset() {
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 != null && abstractC8919.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, Yue.InterfaceC7246
    public int computeHorizontalScrollRange() {
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 != null && abstractC8919.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, Yue.InterfaceC7246
    public int computeVerticalScrollExtent() {
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 != null && abstractC8919.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, Yue.InterfaceC7246
    public int computeVerticalScrollOffset() {
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 != null && abstractC8919.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, Yue.InterfaceC7246
    public int computeVerticalScrollRange() {
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 != null && abstractC8919.canScrollVertically()) {
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
            C8273.m27425(this);
        }
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            C7950.m3971(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            C7950.m25086();
            return;
        }
        if (this.mAdapterHelper.m30509()) {
            if (!this.mAdapterHelper.m30508(4) || this.mAdapterHelper.m30508(11)) {
                if (this.mAdapterHelper.m30509()) {
                    C7950.m3971(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                    dispatchLayout();
                    C7950.m25086();
                    return;
                }
                return;
            }
            C7950.m3971(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.m30516();
            if (!this.mLayoutWasDefered) {
                if (m30231()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.m30502();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            C7950.m25086();
        }
    }

    public void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(AbstractC8919.chooseSize(i, getPaddingLeft() + getPaddingRight(), C8273.m27362(this)), AbstractC8919.chooseSize(i2, getPaddingTop() + getPaddingBottom(), C8273.m27361(this)));
    }

    public void dispatchChildAttached(View view) {
        AbstractC8938 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        AbstractC8909 abstractC8909 = this.mAdapter;
        if (abstractC8909 != null && childViewHolderInt != null) {
            abstractC8909.onViewAttachedToWindow(childViewHolderInt);
        }
        List<InterfaceC8923> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).mo27810(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        AbstractC8938 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        AbstractC8909 abstractC8909 = this.mAdapter;
        if (abstractC8909 != null && childViewHolderInt != null) {
            abstractC8909.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<InterfaceC8923> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).mo4311(view);
            }
        }
    }

    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.e(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        C8935 c8935 = this.mState;
        c8935.f29993 = false;
        if (c8935.f29988 == 1) {
            m30221();
            this.mLayout.setExactMeasureSpecsFrom(this);
            m30222();
        } else if (!this.mAdapterHelper.m30510() && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
            this.mLayout.setExactMeasureSpecsFrom(this);
        } else {
            this.mLayout.setExactMeasureSpecsFrom(this);
            m30222();
        }
        m30223();
    }

    @Override // android.view.View, Yue.InterfaceC6365
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().m2823(f, f2, z);
    }

    @Override // android.view.View, Yue.InterfaceC6365
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().m2824(f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View, Yue.InterfaceC6365
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().m19870(i, i2, iArr, iArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View, Yue.InterfaceC6365
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().m19873(i, i2, i3, i4, iArr);
    }

    public void dispatchOnScrollStateChanged(int i) {
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 != null) {
            abstractC8919.onScrollStateChanged(i);
        }
        onScrollStateChanged(i);
        AbstractC8926 abstractC8926 = this.mScrollListener;
        if (abstractC8926 != null) {
            abstractC8926.onScrollStateChanged(this, i);
        }
        List<AbstractC8926> list = this.mScrollListeners;
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
        AbstractC8926 abstractC8926 = this.mScrollListener;
        if (abstractC8926 != null) {
            abstractC8926.onScrolled(this, i, i2);
        }
        List<AbstractC8926> list = this.mScrollListeners;
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
            AbstractC8938 abstractC8938 = this.mPendingAccessibilityImportanceChange.get(size);
            if (abstractC8938.itemView.getParent() == this && !abstractC8938.shouldIgnore() && (i = abstractC8938.mPendingAccessibilityState) != -1) {
                C8273.m27457(abstractC8938.itemView, i);
                abstractC8938.mPendingAccessibilityState = -1;
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
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
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
        if ((z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.mo30284()) ? z : true) {
            C8273.m27425(this);
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
        EdgeEffect edgeEffectM4918 = this.mEdgeEffectFactory.m4918(this, 3);
        this.mBottomGlow = edgeEffectM4918;
        if (this.mClipToPadding) {
            edgeEffectM4918.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectM4918.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect edgeEffectM4918 = this.mEdgeEffectFactory.m4918(this, 0);
        this.mLeftGlow = edgeEffectM4918;
        if (this.mClipToPadding) {
            edgeEffectM4918.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectM4918.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect edgeEffectM4918 = this.mEdgeEffectFactory.m4918(this, 2);
        this.mRightGlow = edgeEffectM4918;
        if (this.mClipToPadding) {
            edgeEffectM4918.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectM4918.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect edgeEffectM4918 = this.mEdgeEffectFactory.m4918(this, 1);
        this.mTopGlow = edgeEffectM4918;
        if (this.mClipToPadding) {
            edgeEffectM4918.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectM4918.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(C8935 c8935) {
        if (getScrollState() != 2) {
            c8935.f29999 = 0;
            c8935.f30000 = 0;
        } else {
            OverScroller overScroller = this.mViewFlinger.f30003;
            c8935.f29999 = overScroller.getFinalX() - overScroller.getCurrX();
            c8935.f30000 = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    @InterfaceC6490
    public View findChildViewUnder(float f, float f2) {
        for (int iM30534 = this.mChildHelper.m30534() - 1; iM30534 >= 0; iM30534--) {
            View viewM30533 = this.mChildHelper.m30533(iM30534);
            float translationX = viewM30533.getTranslationX();
            float translationY = viewM30533.getTranslationY();
            if (f >= viewM30533.getLeft() + translationX && f <= viewM30533.getRight() + translationX && f2 >= viewM30533.getTop() + translationY && f2 <= viewM30533.getBottom() + translationY) {
                return viewM30533;
            }
        }
        return null;
    }

    @InterfaceC6490
    public View findContainingItemView(@InterfaceC6391 View view) {
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

    @InterfaceC6490
    public AbstractC8938 findContainingViewHolder(@InterfaceC6391 View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    @InterfaceC6490
    public AbstractC8938 findViewHolderForAdapterPosition(int i) {
        AbstractC8938 abstractC8938 = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int iM30537 = this.mChildHelper.m30537();
        for (int i2 = 0; i2 < iM30537; i2++) {
            AbstractC8938 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m30536(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionFor(childViewHolderInt) == i) {
                if (!this.mChildHelper.m30541(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                abstractC8938 = childViewHolderInt;
            }
        }
        return abstractC8938;
    }

    public AbstractC8938 findViewHolderForItemId(long j) {
        AbstractC8909 abstractC8909 = this.mAdapter;
        AbstractC8938 abstractC8938 = null;
        if (abstractC8909 != null && abstractC8909.hasStableIds()) {
            int iM30537 = this.mChildHelper.m30537();
            for (int i = 0; i < iM30537; i++) {
                AbstractC8938 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m30536(i));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j) {
                    if (!this.mChildHelper.m30541(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    abstractC8938 = childViewHolderInt;
                }
            }
        }
        return abstractC8938;
    }

    @InterfaceC6490
    public AbstractC8938 findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6490
    @Deprecated
    public AbstractC8938 findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x0058 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean fling(int i, int i2) {
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.mLayoutSuppressed) {
            return false;
        }
        int iCanScrollHorizontally = abstractC8919.canScrollHorizontally();
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
        float f = i;
        float f2 = i2;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = iCanScrollHorizontally != 0 || zCanScrollVertically;
            dispatchNestedFling(f, f2, z);
            AbstractC8924 abstractC8924 = this.mOnFlingListener;
            if (abstractC8924 != null && abstractC8924.onFling(i, i2)) {
                return true;
            }
            if (z) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i3 = this.mMaxFlingVelocity;
                int iMax = Math.max(-i3, Math.min(i, i3));
                int i4 = this.mMaxFlingVelocity;
                this.mViewFlinger.m30387(iMax, Math.max(-i4, Math.min(i2, i4)));
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
            return m30234(view, viewOnFocusSearchFailed, i) ? viewOnFocusSearchFailed : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        m30241(viewOnFocusSearchFailed, null);
        return view;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 != null) {
            return abstractC8919.generateDefaultLayoutParams();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 != null) {
            return abstractC8919.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @InterfaceC6490
    public AbstractC8909 getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionFor(AbstractC8938 abstractC8938) {
        if (abstractC8938.hasAnyOfTheFlags(524) || !abstractC8938.isBound()) {
            return -1;
        }
        return this.mAdapterHelper.m30498(abstractC8938.mPosition);
    }

    @Override // android.view.View
    public int getBaseline() {
        AbstractC8919 abstractC8919 = this.mLayout;
        return abstractC8919 != null ? abstractC8919.getBaseline() : super.getBaseline();
    }

    public long getChangedHolderKey(AbstractC8938 abstractC8938) {
        return this.mAdapter.hasStableIds() ? abstractC8938.getItemId() : abstractC8938.mPosition;
    }

    public int getChildAdapterPosition(@InterfaceC6391 View view) {
        AbstractC8938 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        InterfaceC8912 interfaceC8912 = this.mChildDrawingOrderCallback;
        return interfaceC8912 == null ? super.getChildDrawingOrder(i, i2) : interfaceC8912.mo4917(i, i2);
    }

    public long getChildItemId(@InterfaceC6391 View view) {
        AbstractC8938 childViewHolderInt;
        AbstractC8909 abstractC8909 = this.mAdapter;
        if (abstractC8909 == null || !abstractC8909.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(@InterfaceC6391 View view) {
        AbstractC8938 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(@InterfaceC6391 View view) {
        return getChildAdapterPosition(view);
    }

    public AbstractC8938 getChildViewHolder(@InterfaceC6391 View view) {
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

    @InterfaceC6490
    public C8989 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(@InterfaceC6391 View view, @InterfaceC6391 Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    @InterfaceC6391
    public C8913 getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @InterfaceC6490
    public AbstractC8914 getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        C8922 c8922 = (C8922) view.getLayoutParams();
        if (!c8922.f29963) {
            return c8922.f3892;
        }
        if (this.mState.m30381() && (c8922.m30305() || c8922.m30307())) {
            return c8922.f3892;
        }
        Rect rect = c8922.f3892;
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
        c8922.f29963 = false;
        return rect;
    }

    @InterfaceC6391
    public AbstractC8918 getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.mItemDecorations.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    @InterfaceC6490
    public AbstractC8919 getLayoutManager() {
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

    @InterfaceC6490
    public AbstractC8924 getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    @InterfaceC6391
    public C8928 getRecycledViewPool() {
        return this.mRecycler.m30331();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View, Yue.InterfaceC6365
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().m19878();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.m30509();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new C1758(new C8908());
    }

    @InterfaceC8392
    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new C8968(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C6922.C6923.f19934), resources.getDimensionPixelSize(C6922.C6923.f19936), resources.getDimensionPixelOffset(C6922.C6923.f19935));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
        }
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
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 != null) {
            abstractC8919.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        AbstractC8914 abstractC8914 = this.mItemAnimator;
        return abstractC8914 != null && abstractC8914.mo30284();
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

    @Override // android.view.View, Yue.InterfaceC6365
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m19880();
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
        int iM30537 = this.mChildHelper.m30537();
        for (int i = 0; i < iM30537; i++) {
            ((C8922) this.mChildHelper.m30536(i).getLayoutParams()).f29963 = true;
        }
        this.mRecycler.m30341();
    }

    public void markKnownViewsInvalid() {
        int iM30537 = this.mChildHelper.m30537();
        for (int i = 0; i < iM30537; i++) {
            AbstractC8938 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m30536(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.m30342();
    }

    public void offsetChildrenHorizontal(@InterfaceC6844 int i) {
        int iM30534 = this.mChildHelper.m30534();
        for (int i2 = 0; i2 < iM30534; i2++) {
            this.mChildHelper.m30533(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(@InterfaceC6844 int i) {
        int iM30534 = this.mChildHelper.m30534();
        for (int i2 = 0; i2 < iM30534; i2++) {
            this.mChildHelper.m30533(i2).offsetTopAndBottom(i);
        }
    }

    public void offsetPositionRecordsForInsert(int i, int i2) {
        int iM30537 = this.mChildHelper.m30537();
        for (int i3 = 0; i3 < iM30537; i3++) {
            AbstractC8938 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m30536(i3));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                childViewHolderInt.offsetPosition(i2, false);
                this.mState.f29990 = true;
            }
        }
        this.mRecycler.m30343(i, i2);
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int iM30537 = this.mChildHelper.m30537();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < iM30537; i7++) {
            AbstractC8938 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m30536(i7));
            if (childViewHolderInt != null && (i6 = childViewHolderInt.mPosition) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    childViewHolderInt.offsetPosition(i2 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i5, false);
                }
                this.mState.f29990 = true;
            }
        }
        this.mRecycler.m30344(i, i2);
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int iM30537 = this.mChildHelper.m30537();
        for (int i4 = 0; i4 < iM30537; i4++) {
            AbstractC8938 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m30536(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i5 = childViewHolderInt.mPosition;
                if (i5 >= i3) {
                    childViewHolderInt.offsetPosition(-i2, z);
                    this.mState.f29990 = true;
                } else if (i5 >= i) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.mState.f29990 = true;
                }
            }
        }
        this.mRecycler.m30345(i, i2, z);
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
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
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 != null) {
            abstractC8919.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<RunnableC8971> threadLocal = RunnableC8971.f30216;
            RunnableC8971 runnableC8971 = threadLocal.get();
            this.mGapWorker = runnableC8971;
            if (runnableC8971 == null) {
                this.mGapWorker = new RunnableC8971();
                Display displayM27346 = C8273.m27346(this);
                if (isInEditMode() || displayM27346 == null) {
                    refreshRate = 60.0f;
                    RunnableC8971 runnableC89712 = this.mGapWorker;
                    runnableC89712.f30220 = (long) (1.0E9f / refreshRate);
                    threadLocal.set(runnableC89712);
                } else {
                    refreshRate = displayM27346.getRefreshRate();
                    if (refreshRate < 30.0f) {
                    }
                    RunnableC8971 runnableC897122 = this.mGapWorker;
                    runnableC897122.f30220 = (long) (1.0E9f / refreshRate);
                    threadLocal.set(runnableC897122);
                }
            }
            this.mGapWorker.m4986(this);
        }
    }

    public void onChildAttachedToWindow(@InterfaceC6391 View view) {
    }

    public void onChildDetachedFromWindow(@InterfaceC6391 View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC8971 runnableC8971;
        super.onDetachedFromWindow();
        AbstractC8914 abstractC8914 = this.mItemAnimator;
        if (abstractC8914 != null) {
            abstractC8914.mo30279();
        }
        stopScroll();
        this.mIsAttached = false;
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 != null) {
            abstractC8919.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.m30790();
        if (!ALLOW_THREAD_GAP_WORK || (runnableC8971 = this.mGapWorker) == null) {
            return;
        }
        runnableC8971.m30618(this);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
                    scrollByInternal((int) (axisValue * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent);
                }
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.mLayout.canScrollVertically()) {
                    f = -axisValue2;
                    if (f != 0.0f) {
                        scrollByInternal((int) (axisValue * this.mScaledHorizontalScrollFactor), (int) (f * this.mScaledVerticalScrollFactor), motionEvent);
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

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x00c1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v24, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (m30225(motionEvent)) {
            m30217();
            return true;
        }
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 == null) {
            return false;
        }
        boolean zCanScrollHorizontally = abstractC8919.canScrollHorizontally();
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
            if (this.mScrollState == 2) {
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
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
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
            m30217();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            m30235(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C7950.m3971(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        C7950.m25086();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        if (abstractC8919.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            if ((mode == 1073741824 && mode2 == 1073741824) || this.mAdapter == null) {
                return;
            }
            if (this.mState.f29988 == 1) {
                m30221();
            }
            this.mLayout.setMeasureSpecs(i, i2);
            this.mState.f29993 = true;
            m30222();
            this.mLayout.setMeasuredDimensionFromChildren(i, i2);
            if (this.mLayout.shouldMeasureTwice()) {
                this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.mState.f29993 = true;
                m30222();
                this.mLayout.setMeasuredDimensionFromChildren(i, i2);
                return;
            }
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            m30237();
            onExitLayoutOrScroll();
            C8935 c8935 = this.mState;
            if (c8935.f29995) {
                c8935.f29991 = true;
            } else {
                this.mAdapterHelper.m30503();
                this.mState.f29991 = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f29995) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC8909 abstractC8909 = this.mAdapter;
        if (abstractC8909 != null) {
            this.mState.f29989 = abstractC8909.getItemCount();
        } else {
            this.mState.f29989 = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
        stopInterceptRequestLayout(false);
        this.mState.f29991 = false;
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
        Parcelable parcelable2;
        if (!(parcelable instanceof C8932)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C8932 c8932 = (C8932) parcelable;
        this.mPendingSavedState = c8932;
        super.onRestoreInstanceState(c8932.getSuperState());
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 == null || (parcelable2 = this.mPendingSavedState.f29976) == null) {
            return;
        }
        abstractC8919.onRestoreInstanceState(parcelable2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C8932 c8932 = new C8932(super.onSaveInstanceState());
        C8932 c89322 = this.mPendingSavedState;
        if (c89322 != null) {
            c8932.m4939(c89322);
        } else {
            AbstractC8919 abstractC8919 = this.mLayout;
            if (abstractC8919 != null) {
                c8932.f29976 = abstractC8919.onSaveInstanceState();
            } else {
                c8932.f29976 = null;
            }
        }
        return c8932;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(@InterfaceC6844 int i, @InterfaceC6844 int i2) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        invalidateGlows();
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:48:0x00e0 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r10v4, resolved type: int */
    /* JADX DEBUG: Multi-variable search result rejected for r10v5, resolved type: int */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00df A[PHI: r0
  0x00df: PHI (r0v36 int) = (r0v26 int), (r0v40 int) binds: [B:41:0x00c8, B:45:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed || this.mIgnoreMotionEventTillDown) {
            return false;
        }
        if (m30224(motionEvent)) {
            m30217();
            return true;
        }
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 == null) {
            return false;
        }
        boolean zCanScrollHorizontally = abstractC8919.canScrollHorizontally();
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
                m30243();
                motionEventObtain.recycle();
                return true;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                if (iFindPointerIndex < 0) {
                    Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
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
                int i2 = iMax;
                int i3 = iMax2;
                if (this.mScrollState == 1) {
                    int[] iArr3 = this.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    if (dispatchNestedPreScroll(zCanScrollHorizontally ? i2 : 0, zCanScrollVertically ? i3 : 0, iArr3, this.mScrollOffset, 0)) {
                        int[] iArr4 = this.mReusableIntPair;
                        i2 -= iArr4[0];
                        i3 -= iArr4[1];
                        int[] iArr5 = this.mNestedOffsets;
                        int i4 = iArr5[0];
                        int[] iArr6 = this.mScrollOffset;
                        iArr5[0] = i4 + iArr6[0];
                        iArr5[1] = iArr5[1] + iArr6[1];
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    int i5 = i3;
                    int[] iArr7 = this.mScrollOffset;
                    this.mLastTouchX = x2 - iArr7[0];
                    this.mLastTouchY = y2 - iArr7[1];
                    if (scrollByInternal(zCanScrollHorizontally ? i2 : 0, zCanScrollVertically ? i5 : 0, motionEvent)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    RunnableC8971 runnableC8971 = this.mGapWorker;
                    if (runnableC8971 != null && (i2 != 0 || i5 != 0)) {
                        runnableC8971.m30614(this, i2, i5);
                    }
                }
            } else if (actionMasked == 3) {
                m30217();
            } else if (actionMasked == 5) {
                this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                this.mLastTouchX = x3;
                this.mInitialTouchX = x3;
                int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                this.mLastTouchY = y3;
                this.mInitialTouchY = y3;
            } else if (actionMasked == 6) {
                m30235(motionEvent);
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
        C8273.m27427(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(AbstractC8938 abstractC8938, AbstractC8914.C8916 c8916) {
        abstractC8938.setFlags(0, 8192);
        if (this.mState.f29992 && abstractC8938.isUpdated() && !abstractC8938.isRemoved() && !abstractC8938.shouldIgnore()) {
            this.mViewInfoStore.m30783(getChangedHolderKey(abstractC8938), abstractC8938);
        }
        this.mViewInfoStore.m30785(abstractC8938, c8916);
    }

    public void removeAndRecycleViews() {
        AbstractC8914 abstractC8914 = this.mItemAnimator;
        if (abstractC8914 != null) {
            abstractC8914.mo30279();
        }
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 != null) {
            abstractC8919.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.m30325();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean zM30545 = this.mChildHelper.m30545(view);
        if (zM30545) {
            AbstractC8938 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.m30358(childViewHolderInt);
            this.mRecycler.m30351(childViewHolderInt);
        }
        stopInterceptRequestLayout(!zM30545);
        return zM30545;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        AbstractC8938 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(@InterfaceC6391 AbstractC8918 abstractC8918) {
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 != null) {
            abstractC8919.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(abstractC8918);
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

    public void removeOnChildAttachStateChangeListener(@InterfaceC6391 InterfaceC8923 interfaceC8923) {
        List<InterfaceC8923> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(interfaceC8923);
    }

    public void removeOnItemTouchListener(@InterfaceC6391 InterfaceC8925 interfaceC8925) {
        this.mOnItemTouchListeners.remove(interfaceC8925);
        if (this.mInterceptingOnItemTouchListener == interfaceC8925) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@InterfaceC6391 AbstractC8926 abstractC8926) {
        List<AbstractC8926> list = this.mScrollListeners;
        if (list != null) {
            list.remove(abstractC8926);
        }
    }

    public void repositionShadowingViews() {
        AbstractC8938 abstractC8938;
        int iM30534 = this.mChildHelper.m30534();
        for (int i = 0; i < iM30534; i++) {
            View viewM30533 = this.mChildHelper.m30533(i);
            AbstractC8938 childViewHolder = getChildViewHolder(viewM30533);
            if (childViewHolder != null && (abstractC8938 = childViewHolder.mShadowingHolder) != null) {
                View view = abstractC8938.itemView;
                int left = viewM30533.getLeft();
                int top = viewM30533.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            m30241(view, view2);
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
            this.mOnItemTouchListeners.get(i).mo30310(z);
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
        int iM30537 = this.mChildHelper.m30537();
        for (int i = 0; i < iM30537; i++) {
            AbstractC8938 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m30536(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = abstractC8919.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i = 0;
            }
            if (!zCanScrollVertically) {
                i2 = 0;
            }
            scrollByInternal(i, i2, null);
        }
    }

    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i, i2, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i7 = iArr2[0];
            int i8 = iArr2[1];
            i3 = i8;
            i4 = i7;
            i5 = i - i7;
            i6 = i2 - i8;
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i4, i3, i5, i6, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i9 = iArr4[0];
        int i10 = i5 - i9;
        int i11 = iArr4[1];
        int i12 = i6 - i11;
        boolean z = (i9 == 0 && i11 == 0) ? false : true;
        int i13 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i14 = iArr5[0];
        this.mLastTouchX = i13 - i14;
        int i15 = this.mLastTouchY;
        int i16 = iArr5[1];
        this.mLastTouchY = i15 - i16;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i14;
        iArr6[1] = iArr6[1] + i16;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !C6270.m19351(motionEvent, 8194)) {
                m30238(motionEvent.getX(), i10, motionEvent.getY(), i12);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (i4 != 0 || i3 != 0) {
            dispatchOnScrolled(i4, i3);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i4 == 0 && i3 == 0) ? false : true;
    }

    public void scrollStep(int i, int i2, @InterfaceC6490 int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C7950.m3971(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int iScrollHorizontallyBy = i != 0 ? this.mLayout.scrollHorizontallyBy(i, this.mRecycler, this.mState) : 0;
        int iScrollVerticallyBy = i2 != 0 ? this.mLayout.scrollVerticallyBy(i2, this.mRecycler, this.mState) : 0;
        C7950.m25086();
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
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC8919.scrollToPosition(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(@InterfaceC6490 C8989 c8989) {
        this.mAccessibilityDelegate = c8989;
        C8273.m27439(this, c8989);
    }

    public void setAdapter(@InterfaceC6490 AbstractC8909 abstractC8909) {
        setLayoutFrozen(false);
        m30245(abstractC8909, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@InterfaceC6490 InterfaceC8912 interfaceC8912) {
        if (interfaceC8912 == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = interfaceC8912;
        setChildrenDrawingOrderEnabled(interfaceC8912 != null);
    }

    @InterfaceC8392
    public boolean setChildImportantForAccessibilityInternal(AbstractC8938 abstractC8938, int i) {
        if (!isComputingLayout()) {
            C8273.m27457(abstractC8938.itemView, i);
            return true;
        }
        abstractC8938.mPendingAccessibilityState = i;
        this.mPendingAccessibilityImportanceChange.add(abstractC8938);
        return false;
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

    public void setEdgeEffectFactory(@InterfaceC6391 C8913 c8913) {
        C6740.m21415(c8913);
        this.mEdgeEffectFactory = c8913;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(@InterfaceC6490 AbstractC8914 abstractC8914) {
        AbstractC8914 abstractC89142 = this.mItemAnimator;
        if (abstractC89142 != null) {
            abstractC89142.mo30279();
            this.mItemAnimator.m30294(null);
        }
        this.mItemAnimator = abstractC8914;
        if (abstractC8914 != null) {
            abstractC8914.m30294(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.mRecycler.m30355(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(@InterfaceC6490 AbstractC8919 abstractC8919) {
        if (abstractC8919 == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            AbstractC8914 abstractC8914 = this.mItemAnimator;
            if (abstractC8914 != null) {
                abstractC8914.mo30279();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.m30325();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.m30325();
        }
        this.mChildHelper.m30542();
        this.mLayout = abstractC8919;
        if (abstractC8919 != null) {
            if (abstractC8919.mRecyclerView != null) {
                throw new IllegalArgumentException("LayoutManager " + abstractC8919 + " is already attached to a RecyclerView:" + abstractC8919.mRecyclerView.exceptionLabel());
            }
            abstractC8919.setRecyclerView(this);
            if (this.mIsAttached) {
                this.mLayout.dispatchAttachedToWindow(this);
            }
        }
        this.mRecycler.m30359();
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

    @Override // android.view.View, Yue.InterfaceC6365
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().m19883(z);
    }

    public void setOnFlingListener(@InterfaceC6490 AbstractC8924 abstractC8924) {
        this.mOnFlingListener = abstractC8924;
    }

    @Deprecated
    public void setOnScrollListener(@InterfaceC6490 AbstractC8926 abstractC8926) {
        this.mScrollListener = abstractC8926;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(@InterfaceC6490 C8928 c8928) {
        this.mRecycler.m30353(c8928);
    }

    public void setRecyclerListener(@InterfaceC6490 InterfaceC8930 interfaceC8930) {
        this.mRecyclerListener = interfaceC8930;
    }

    public void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        this.mScrollState = i;
        if (i != 2) {
            m30246();
        }
        dispatchOnScrollStateChanged(i);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(@InterfaceC6490 AbstractC8936 abstractC8936) {
        this.mRecycler.m30354(abstractC8936);
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!isComputingLayout()) {
            return false;
        }
        int iM5929 = accessibilityEvent != null ? C3025.m5929(accessibilityEvent) : 0;
        this.mEatenAccessibilityChangeFlags |= iM5929 != 0 ? iM5929 : 0;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void smoothScrollBy(@InterfaceC6844 int i, @InterfaceC6844 int i2) {
        smoothScrollBy(i, i2, null);
    }

    public void smoothScrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            abstractC8919.smoothScrollToPosition(this, this.mState, i);
        }
    }

    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View, Yue.InterfaceC6365
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().m19885(i);
    }

    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View, Yue.InterfaceC6365
    public void stopNestedScroll() {
        getScrollingChildHelper().m19887();
    }

    public void stopScroll() {
        setScrollState(0);
        m30246();
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

    public void swapAdapter(@InterfaceC6490 AbstractC8909 abstractC8909, boolean z) {
        setLayoutFrozen(false);
        m30245(abstractC8909, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int iM30537 = this.mChildHelper.m30537();
        int i4 = i + i2;
        for (int i5 = 0; i5 < iM30537; i5++) {
            View viewM30536 = this.mChildHelper.m30536(i5);
            AbstractC8938 childViewHolderInt = getChildViewHolderInt(viewM30536);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i3 = childViewHolderInt.mPosition) >= i && i3 < i4) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((C8922) viewM30536.getLayoutParams()).f29963 = true;
            }
        }
        this.mRecycler.m30361(i, i2);
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m4907(AbstractC8938 abstractC8938) {
        View view = abstractC8938.itemView;
        boolean z = view.getParent() == this;
        this.mRecycler.m30358(getChildViewHolder(view));
        if (abstractC8938.isTmpDetached()) {
            this.mChildHelper.m30530(view, -1, view.getLayoutParams(), true);
        } else if (z) {
            this.mChildHelper.m30538(view);
        } else {
            this.mChildHelper.m4976(view, true);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m4908(@InterfaceC6391 AbstractC8938 abstractC8938, @InterfaceC6391 AbstractC8938 abstractC89382, @InterfaceC6391 AbstractC8914.C8916 c8916, @InterfaceC6391 AbstractC8914.C8916 c89162, boolean z, boolean z2) {
        abstractC8938.setIsRecyclable(false);
        if (z) {
            m4907(abstractC8938);
        }
        if (abstractC8938 != abstractC89382) {
            if (z2) {
                m4907(abstractC89382);
            }
            abstractC8938.mShadowedHolder = abstractC89382;
            m4907(abstractC8938);
            this.mRecycler.m30358(abstractC8938);
            abstractC89382.setIsRecyclable(false);
            abstractC89382.mShadowingHolder = abstractC8938;
        }
        if (this.mItemAnimator.mo4920(abstractC8938, abstractC89382, c8916, c89162)) {
            postAnimationRunner();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m30217() {
        m30243();
        setScrollState(0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m30218(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Object[] objArr;
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strM30229 = m30229(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strM30229, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(AbstractC8919.class);
                try {
                    constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                } catch (NoSuchMethodException e) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strM30229, e2);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((AbstractC8919) constructor.newInstance(objArr));
            } catch (ClassCastException e3) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strM30229, e3);
            } catch (ClassNotFoundException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strM30229, e4);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strM30229, e5);
            } catch (InstantiationException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strM30229, e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strM30229, e7);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m30219(int i, int i2) {
        m30226(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m30220() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        C3025.m5936(accessibilityEventObtain, i);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m30221() {
        this.mState.m4944(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f29993 = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.m30786();
        onEnterLayoutOrScroll();
        m30237();
        m30244();
        C8935 c8935 = this.mState;
        c8935.f29992 = c8935.f29994 && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        c8935.f29991 = c8935.f29995;
        c8935.f29989 = this.mAdapter.getItemCount();
        m30226(this.mMinMaxLayoutPositions);
        if (this.mState.f29994) {
            int iM30534 = this.mChildHelper.m30534();
            for (int i = 0; i < iM30534; i++) {
                AbstractC8938 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m30533(i));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.m30785(childViewHolderInt, this.mItemAnimator.m30290(this.mState, childViewHolderInt, AbstractC8914.m30270(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.f29992 && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.m30783(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f29995) {
            saveOldPositions();
            C8935 c89352 = this.mState;
            boolean z = c89352.f29990;
            c89352.f29990 = false;
            this.mLayout.onLayoutChildren(this.mRecycler, c89352);
            this.mState.f29990 = z;
            for (int i2 = 0; i2 < this.mChildHelper.m30534(); i2++) {
                AbstractC8938 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.m30533(i2));
                if (!childViewHolderInt2.shouldIgnore() && !this.mViewInfoStore.m30789(childViewHolderInt2)) {
                    int iM30270 = AbstractC8914.m30270(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    if (!zHasAnyOfTheFlags) {
                        iM30270 |= 4096;
                    }
                    AbstractC8914.C8916 c8916M30290 = this.mItemAnimator.m30290(this.mState, childViewHolderInt2, iM30270, childViewHolderInt2.getUnmodifiedPayloads());
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, c8916M30290);
                    } else {
                        this.mViewInfoStore.m5015(childViewHolderInt2, c8916M30290);
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f29988 = 2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m30222() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.m4944(6);
        this.mAdapterHelper.m30503();
        this.mState.f29989 = this.mAdapter.getItemCount();
        C8935 c8935 = this.mState;
        c8935.f29987 = 0;
        c8935.f29991 = false;
        this.mLayout.onLayoutChildren(this.mRecycler, c8935);
        C8935 c89352 = this.mState;
        c89352.f29990 = false;
        this.mPendingSavedState = null;
        c89352.f29994 = c89352.f29994 && this.mItemAnimator != null;
        c89352.f29988 = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m30223() {
        this.mState.m4944(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C8935 c8935 = this.mState;
        c8935.f29988 = 1;
        if (c8935.f29994) {
            for (int iM30534 = this.mChildHelper.m30534() - 1; iM30534 >= 0; iM30534--) {
                AbstractC8938 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m30533(iM30534));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    AbstractC8914.C8916 c8916M30289 = this.mItemAnimator.m30289(this.mState, childViewHolderInt);
                    AbstractC8938 abstractC8938M30787 = this.mViewInfoStore.m30787(changedHolderKey);
                    if (abstractC8938M30787 == null || abstractC8938M30787.shouldIgnore()) {
                        this.mViewInfoStore.m30784(childViewHolderInt, c8916M30289);
                    } else {
                        boolean zM30788 = this.mViewInfoStore.m30788(abstractC8938M30787);
                        boolean zM307882 = this.mViewInfoStore.m30788(childViewHolderInt);
                        if (zM30788 && abstractC8938M30787 == childViewHolderInt) {
                            this.mViewInfoStore.m30784(childViewHolderInt, c8916M30289);
                        } else {
                            AbstractC8914.C8916 c8916M30794 = this.mViewInfoStore.m30794(abstractC8938M30787);
                            this.mViewInfoStore.m30784(childViewHolderInt, c8916M30289);
                            AbstractC8914.C8916 c8916M30793 = this.mViewInfoStore.m30793(childViewHolderInt);
                            if (c8916M30794 == null) {
                                m30230(changedHolderKey, childViewHolderInt, abstractC8938M30787);
                            } else {
                                m4908(abstractC8938M30787, childViewHolderInt, c8916M30794, c8916M30793, zM30788, zM307882);
                            }
                        }
                    }
                }
            }
            this.mViewInfoStore.m30795(this.mViewInfoProcessCallback);
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        C8935 c89352 = this.mState;
        c89352.f29986 = c89352.f29989;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        c89352.f29994 = false;
        c89352.f29995 = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<AbstractC8938> arrayList = this.mRecycler.f3898;
        if (arrayList != null) {
            arrayList.clear();
        }
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919.mPrefetchMaxObservedInInitialPrefetch) {
            abstractC8919.mPrefetchMaxCountObserved = 0;
            abstractC8919.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.m30359();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.m30786();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (m30219(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        m30239();
        m30242();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m30224(MotionEvent motionEvent) {
        InterfaceC8925 interfaceC8925 = this.mInterceptingOnItemTouchListener;
        if (interfaceC8925 == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return m30225(motionEvent);
        }
        interfaceC8925.mo4932(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final boolean m30225(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            InterfaceC8925 interfaceC8925 = this.mOnItemTouchListeners.get(i);
            if (interfaceC8925.mo30309(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = interfaceC8925;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m30226(int[] iArr) {
        int iM30534 = this.mChildHelper.m30534();
        if (iM30534 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < iM30534; i3++) {
            AbstractC8938 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m30533(i3));
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

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:17:0x002b */
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final View m30227() {
        AbstractC8938 abstractC8938FindViewHolderForAdapterPosition;
        C8935 c8935 = this.mState;
        int i = c8935.f29996;
        if (i == -1) {
            i = 0;
        }
        int iM30375 = c8935.m30375();
        for (int i2 = i; i2 < iM30375; i2++) {
            AbstractC8938 abstractC8938FindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (abstractC8938FindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (abstractC8938FindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return abstractC8938FindViewHolderForAdapterPosition2.itemView;
            }
        }
        int iMin = Math.min(iM30375, i);
        do {
            iMin--;
            if (iMin < 0 || (abstractC8938FindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) == null) {
                return null;
            }
        } while (!abstractC8938FindViewHolderForAdapterPosition.itemView.hasFocusable());
        return abstractC8938FindViewHolderForAdapterPosition.itemView;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final int m30228(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final String m30229(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + str;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m30230(long j, AbstractC8938 abstractC8938, AbstractC8938 abstractC89382) {
        int iM30534 = this.mChildHelper.m30534();
        for (int i = 0; i < iM30534; i++) {
            AbstractC8938 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m30533(i));
            if (childViewHolderInt != abstractC8938 && getChangedHolderKey(childViewHolderInt) == j) {
                AbstractC8909 abstractC8909 = this.mAdapter;
                if (abstractC8909 == null || !abstractC8909.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + abstractC8938 + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + abstractC8938 + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + abstractC89382 + " cannot be found but it is necessary for " + abstractC8938 + exceptionLabel());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final boolean m30231() {
        int iM30534 = this.mChildHelper.m30534();
        for (int i = 0; i < iM30534; i++) {
            AbstractC8938 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m30533(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m30232() {
        if (C8273.m27352(this) == 0) {
            C8273.m27459(this, 8);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m30233() {
        this.mChildHelper = new C8951(new C8907());
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m30234(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
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
            return b < 0 || (b == 0 && i2 * i3 <= 0);
        }
        if (i == 2) {
            return b > 0 || (b == 0 && i2 * i3 >= 0);
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
        throw new IllegalArgumentException("Invalid direction: " + i + exceptionLabel());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m30235(MotionEvent motionEvent) {
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

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean m30236() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m30237() {
        boolean z;
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.m30518();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (m30236()) {
            this.mAdapterHelper.m30516();
        } else {
            this.mAdapterHelper.m30503();
        }
        boolean z2 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f29994 = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z = this.mDataSetHasChangedAfterLayout) || z2 || this.mLayout.mRequestedSimpleAnimations) && (!z || this.mAdapter.hasStableIds());
        C8935 c8935 = this.mState;
        c8935.f29995 = c8935.f29994 && z2 && !this.mDataSetHasChangedAfterLayout && m30236();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m30238(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2 = true;
        if (f2 < 0.0f) {
            ensureLeftGlow();
            C4587.m13639(this.mLeftGlow, (-f2) / getWidth(), 1.0f - (f3 / getHeight()));
        } else {
            if (f2 <= 0.0f) {
                z = false;
                if (f4 >= 0.0f) {
                    ensureTopGlow();
                    C4587.m13639(this.mTopGlow, (-f4) / getHeight(), f / getWidth());
                } else if (f4 > 0.0f) {
                    ensureBottomGlow();
                    C4587.m13639(this.mBottomGlow, f4 / getHeight(), 1.0f - (f / getWidth()));
                } else {
                    z2 = z;
                }
                if (z2 && f2 == 0.0f && f4 == 0.0f) {
                    return;
                }
                C8273.m27425(this);
            }
            ensureRightGlow();
            C4587.m13639(this.mRightGlow, f2 / getWidth(), f3 / getHeight());
        }
        z = true;
        if (f4 >= 0.0f) {
        }
        if (z2) {
        }
        C8273.m27425(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m30239() {
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
                if (!this.mChildHelper.m30541(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.m30534() == 0) {
                requestFocus();
                return;
            }
        }
        View viewM30227 = null;
        AbstractC8938 abstractC8938FindViewHolderForItemId = (this.mState.f29997 == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f29997);
        if (abstractC8938FindViewHolderForItemId != null && !this.mChildHelper.m30541(abstractC8938FindViewHolderForItemId.itemView) && abstractC8938FindViewHolderForItemId.itemView.hasFocusable()) {
            viewM30227 = abstractC8938FindViewHolderForItemId.itemView;
        } else if (this.mChildHelper.m30534() > 0) {
            viewM30227 = m30227();
        }
        if (viewM30227 != null) {
            int i = this.mState.f29998;
            if (i != -1 && (viewFindViewById = viewM30227.findViewById(i)) != null && viewFindViewById.isFocusable()) {
                viewM30227 = viewFindViewById;
            }
            viewM30227.requestFocus();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final void m30240() {
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
            C8273.m27425(this);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final void m30241(@InterfaceC6391 View view, @InterfaceC6490 View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C8922) {
            C8922 c8922 = (C8922) layoutParams;
            if (!c8922.f29963) {
                Rect rect = c8922.f3892;
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

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final void m30242() {
        C8935 c8935 = this.mState;
        c8935.f29997 = -1L;
        c8935.f29996 = -1;
        c8935.f29998 = -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final void m30243() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        m30240();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final void m30244() {
        View focusedChild = (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) ? getFocusedChild() : null;
        AbstractC8938 abstractC8938FindContainingViewHolder = focusedChild != null ? findContainingViewHolder(focusedChild) : null;
        if (abstractC8938FindContainingViewHolder == null) {
            m30242();
            return;
        }
        this.mState.f29997 = this.mAdapter.hasStableIds() ? abstractC8938FindContainingViewHolder.getItemId() : -1L;
        this.mState.f29996 = this.mDataSetHasChangedAfterLayout ? -1 : abstractC8938FindContainingViewHolder.isRemoved() ? abstractC8938FindContainingViewHolder.mOldPosition : abstractC8938FindContainingViewHolder.getAdapterPosition();
        this.mState.f29998 = m30228(abstractC8938FindContainingViewHolder.itemView);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final void m30245(@InterfaceC6490 AbstractC8909 abstractC8909, boolean z, boolean z2) {
        AbstractC8909 abstractC89092 = this.mAdapter;
        if (abstractC89092 != null) {
            abstractC89092.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.m30518();
        AbstractC8909 abstractC89093 = this.mAdapter;
        this.mAdapter = abstractC8909;
        if (abstractC8909 != null) {
            abstractC8909.registerAdapterDataObserver(this.mObserver);
            abstractC8909.onAttachedToRecyclerView(this);
        }
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 != null) {
            abstractC8919.onAdapterChanged(abstractC89093, this.mAdapter);
        }
        this.mRecycler.m30346(abstractC89093, this.mAdapter, z);
        this.mState.f29990 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final void m30246() {
        this.mViewFlinger.m30391();
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 != null) {
            abstractC8919.stopSmoothScroller();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public RecyclerView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C6922.C1113.f19922);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC6363
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().m19871(i, i2, iArr, iArr2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC6363
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().m19874(i, i2, i3, i4, iArr, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    @InterfaceC6490
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC8938 findViewHolderForPosition(int i, boolean z) {
        int iM30537 = this.mChildHelper.m30537();
        AbstractC8938 abstractC8938 = null;
        for (int i2 = 0; i2 < iM30537; i2++) {
            AbstractC8938 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.m30536(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z) {
                    if (childViewHolderInt.mPosition != i) {
                        continue;
                    } else {
                        if (!this.mChildHelper.m30541(childViewHolderInt.itemView)) {
                            return childViewHolderInt;
                        }
                        abstractC8938 = childViewHolderInt;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i) {
                    continue;
                }
            }
        }
        return abstractC8938;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC6363
    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().m19879(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                m30220();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void smoothScrollBy(@InterfaceC6844 int i, @InterfaceC6844 int i2, @InterfaceC6490 Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC6363
    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().m19886(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC6363
    public void stopNestedScroll(int i) {
        getScrollingChildHelper().m19888(i);
    }

    public RecyclerView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new C8931();
        this.mRecycler = new C8929();
        this.mViewInfoStore = new C8997();
        this.mUpdateChildViewsRunnable = new RunnableC1743();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new C8913();
        this.mItemAnimator = new C8952();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new RunnableC8937();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new RunnableC8971.C1772() : null;
        this.mState = new C8935();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C8917();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new RunnableC1744();
        this.mViewInfoProcessCallback = new C8906();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C8299.m27595(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = C8299.m27600(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.m30294(this.mItemAnimatorListener);
        initAdapterManager();
        m30233();
        m30232();
        if (C8273.m27351(this) == 0) {
            C8273.m27457(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C8989(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6922.C6930.f20080, i, 0);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            saveAttributeDataForStyleable(context, C6922.C6930.f20080, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        }
        String string = typedArrayObtainStyledAttributes.getString(C6922.C6930.f20089);
        if (typedArrayObtainStyledAttributes.getInt(C6922.C6930.f20083, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(C6922.C6930.f20082, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C6922.C6930.f20084, false);
        this.mEnableFastScroller = z;
        if (z) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(C6922.C6930.f20087), typedArrayObtainStyledAttributes.getDrawable(C6922.C6930.f20088), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(C6922.C6930.f20085), typedArrayObtainStyledAttributes.getDrawable(C6922.C6930.f20086));
        }
        typedArrayObtainStyledAttributes.recycle();
        m30218(context, string, attributeSet, i, 0);
        int[] iArr = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        if (i2 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        }
        boolean z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    @Override // Yue.InterfaceC6364
    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, @InterfaceC6391 int[] iArr2) {
        getScrollingChildHelper().m19872(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void smoothScrollBy(@InterfaceC6844 int i, @InterfaceC6844 int i2, @InterfaceC6490 Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟, reason: contains not printable characters */
    public static class C8922 extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: ۥ */
        public AbstractC8938 f3891;

        /* JADX INFO: renamed from: ۥ۟ */
        public final Rect f3892;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f29963;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f29964;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8922(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3892 = new Rect();
            this.f29963 = true;
            this.f29964 = false;
        }

        /* JADX INFO: renamed from: ۥ */
        public int m4930() {
            return this.f3891.getAdapterPosition();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public int m4931() {
            return this.f3891.getLayoutPosition();
        }

        @Deprecated
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int m30304() {
            return this.f3891.getPosition();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean m30305() {
            return this.f3891.isUpdated();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean m30306() {
            return this.f3891.isRemoved();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean m30307() {
            return this.f3891.isInvalid();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public boolean m30308() {
            return this.f3891.needsUpdate();
        }

        public C8922(int i, int i2) {
            super(i, i2);
            this.f3892 = new Rect();
            this.f29963 = true;
            this.f29964 = false;
        }

        public C8922(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3892 = new Rect();
            this.f29963 = true;
            this.f29964 = false;
        }

        public C8922(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3892 = new Rect();
            this.f29963 = true;
            this.f29964 = false;
        }

        public C8922(C8922 c8922) {
            super((ViewGroup.LayoutParams) c8922);
            this.f3892 = new Rect();
            this.f29963 = true;
            this.f29964 = false;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public static class C8932 extends AbstractC2967 {
        public static final Parcelable.Creator<C8932> CREATOR = new C1751();

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Parcelable f29976;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡ$ۥ */
        public static class C1751 implements Parcelable.ClassLoaderCreator<C8932> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
            public C8932 createFromParcel(Parcel parcel) {
                return new C8932(parcel, null);
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
            public C8932 createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C8932(parcel, classLoader);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public C8932[] newArray(int i) {
                return new C8932[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8932(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f29976 = parcel.readParcelable(classLoader == null ? AbstractC8919.class.getClassLoader() : classLoader);
        }

        @Override // Yue.AbstractC2967, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f29976, 0);
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4939(C8932 c8932) {
            this.f29976 = c8932.f29976;
        }

        public C8932(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 != null) {
            return abstractC8919.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    public void smoothScrollBy(@InterfaceC6844 int i, @InterfaceC6844 int i2, @InterfaceC6490 Interpolator interpolator, int i3, boolean z) {
        AbstractC8919 abstractC8919 = this.mLayout;
        if (abstractC8919 == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!abstractC8919.canScrollHorizontally()) {
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
        this.mViewFlinger.m30390(i, i2, i3, interpolator);
    }

    public void addItemDecoration(@InterfaceC6391 AbstractC8918 abstractC8918) {
        addItemDecoration(abstractC8918, -1);
    }
}
