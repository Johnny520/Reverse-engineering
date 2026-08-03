package androidx.viewpager2.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.AbstractC1158g;
import androidx.recyclerview.widget.AbstractC1159h;
import androidx.recyclerview.widget.AbstractC1160i;
import androidx.recyclerview.widget.C1161j;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.C1167R;
import androidx.viewpager2.adapter.StatefulAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p000.AbstractC1516hv;
import p000.AbstractC2185lE;
import p000.AbstractC2251mv;
import p000.C0038Av;
import p000.C0122Ct;
import p000.C0902V;
import p000.C1118a0;
import p000.InterfaceC2123k0;
import p000.InterfaceC2474rv;

/* JADX INFO: loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public static final int OFFSCREEN_PAGE_LIMIT_DEFAULT = -1;
    public static final int ORIENTATION_HORIZONTAL = 0;
    public static final int ORIENTATION_VERTICAL = 1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static boolean sFeatureEnhancedA11yEnabled = true;
    AccessibilityProvider mAccessibilityProvider;
    int mCurrentItem;
    private AbstractC1516hv mCurrentItemDataSetChangeObserver;
    boolean mCurrentItemDirty;
    private CompositeOnPageChangeCallback mExternalPageChangeCallbacks;
    private FakeDrag mFakeDragger;
    LinearLayoutManager mLayoutManager;
    private int mOffscreenPageLimit;
    private CompositeOnPageChangeCallback mPageChangeEventDispatcher;
    private PageTransformerAdapter mPageTransformerAdapter;
    private C0122Ct mPagerSnapHelper;
    private Parcelable mPendingAdapterState;
    private int mPendingCurrentItem;
    RecyclerView mRecyclerView;
    private AbstractC1159h mSavedItemAnimator;
    private boolean mSavedItemAnimatorPresent;
    ScrollEventAdapter mScrollEventAdapter;
    private final Rect mTmpChildRect;
    private final Rect mTmpContainerRect;
    private boolean mUserInputEnabled;

    public abstract class AccessibilityProvider {
        final /* synthetic */ ViewPager2 this$0;

        private AccessibilityProvider(ViewPager2 r1) {
            this.this$0 = r1;
        }

        public boolean handlesGetAccessibilityClassName() {
            return false;
        }

        public boolean handlesLmPerformAccessibilityAction(int r1) {
            return false;
        }

        public boolean handlesPerformAccessibilityAction(int r1, Bundle r2) {
            return false;
        }

        public boolean handlesRvGetAccessibilityClassName() {
            return false;
        }

        public void onAttachAdapter(AbstractC1158g r1) {
        }

        public void onDetachAdapter(AbstractC1158g r1) {
        }

        public String onGetAccessibilityClassName() {
            throw new IllegalStateException("Not implemented.");
        }

        public void onInitialize(CompositeOnPageChangeCallback r1, RecyclerView r2) {
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r1) {
        }

        public void onLmInitializeAccessibilityNodeInfo(C1118a0 r1) {
        }

        public void onLmInitializeAccessibilityNodeInfoForItem(View r1, C1118a0 r2) {
        }

        public boolean onLmPerformAccessibilityAction(int r2) {
            throw new IllegalStateException("Not implemented.");
        }

        public boolean onPerformAccessibilityAction(int r1, Bundle r2) {
            throw new IllegalStateException("Not implemented.");
        }

        public void onRestorePendingState() {
        }

        public CharSequence onRvGetAccessibilityClassName() {
            throw new IllegalStateException("Not implemented.");
        }

        public void onRvInitializeAccessibilityEvent(AccessibilityEvent r1) {
        }

        public void onSetLayoutDirection() {
        }

        public void onSetNewCurrentItem() {
        }

        public void onSetOrientation() {
        }

        public void onSetUserInputEnabled() {
        }

        public /* synthetic */ AccessibilityProvider(ViewPager2 r1, C11771 r2) {
            this(r1);
        }
    }

    public class BasicAccessibilityProvider extends AccessibilityProvider {
        final /* synthetic */ ViewPager2 this$0;

        public BasicAccessibilityProvider(ViewPager2 r2) {
            this.this$0 = r2;
            super(r2, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean handlesLmPerformAccessibilityAction(int r2) {
            if (r2 == 8192) goto L7;
            if (r2 == 4096) goto L7;
            return false;
        L7:
            if (this.this$0.isUserInputEnabled() == true) goto L12;
            return true;
        L12:
            return false;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean handlesRvGetAccessibilityClassName() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onLmInitializeAccessibilityNodeInfo(C1118a0 r3) {
            if (this.this$0.isUserInputEnabled() == true) goto L6;
            C0902V r0 = C0902V.f2804g;
            r3.f3530a.removeAction((AccessibilityNodeInfo.AccessibilityAction) r0.f2810a);
            C0902V r02 = C0902V.f2803f;
            r3.f3530a.removeAction((AccessibilityNodeInfo.AccessibilityAction) r02.f2810a);
            r3.m2048j(false);
            return;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean onLmPerformAccessibilityAction(int r1) {
            if (handlesLmPerformAccessibilityAction(r1) == false) goto L7;
            return false;
        L7:
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public CharSequence onRvGetAccessibilityClassName() {
            if (handlesRvGetAccessibilityClassName() == false) goto L7;
            return "androidx.viewpager.widget.ViewPager";
        L7:
            throw new IllegalStateException();
        }
    }

    public static abstract class DataSetChangeObserver extends AbstractC1516hv {
        public /* synthetic */ DataSetChangeObserver(C11771 r1) {
            this();
        }

        @Override // p000.AbstractC1516hv
        public abstract void onChanged();

        @Override // p000.AbstractC1516hv
        public final void onItemRangeChanged(int r1, int r2) {
            onChanged();
        }

        @Override // p000.AbstractC1516hv
        public final void onItemRangeInserted(int r1, int r2) {
            onChanged();
        }

        @Override // p000.AbstractC1516hv
        public final void onItemRangeMoved(int r1, int r2, int r3) {
            onChanged();
        }

        @Override // p000.AbstractC1516hv
        public final void onItemRangeRemoved(int r1, int r2) {
            onChanged();
        }

        private DataSetChangeObserver() {
        }

        @Override // p000.AbstractC1516hv
        public final void onItemRangeChanged(int r1, int r2, Object r3) {
            onChanged();
        }
    }

    public class LinearLayoutManagerImpl extends LinearLayoutManager {
        final /* synthetic */ ViewPager2 this$0;

        public LinearLayoutManagerImpl(ViewPager2 r1, Context r2) {
            this.this$0 = r1;
            super(1);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(C0038Av r3, int[] r4) {
            int r0 = this.this$0.getOffscreenPageLimit();
            if (r0 != (-1)) goto L6;
            super.calculateExtraLayoutSpace(r3, r4);
            return;
        L6:
            int r32 = this.this$0.getPageSize() * r0;
            r4[0] = r32;
            r4[1] = r32;
        }

        @Override // androidx.recyclerview.widget.AbstractC1160i
        public void onInitializeAccessibilityNodeInfo(C1161j r1, C0038Av r2, C1118a0 r3) {
            super.onInitializeAccessibilityNodeInfo(r1, r2, r3);
            this.this$0.mAccessibilityProvider.onLmInitializeAccessibilityNodeInfo(r3);
        }

        @Override // androidx.recyclerview.widget.AbstractC1160i
        public void onInitializeAccessibilityNodeInfoForItem(C1161j r1, C0038Av r2, View r3, C1118a0 r4) {
            this.this$0.mAccessibilityProvider.onLmInitializeAccessibilityNodeInfoForItem(r3, r4);
        }

        @Override // androidx.recyclerview.widget.AbstractC1160i
        public boolean performAccessibilityAction(C1161j r2, C0038Av r3, int r4, Bundle r5) {
            if (this.this$0.mAccessibilityProvider.handlesLmPerformAccessibilityAction(r4) == false) goto L7;
            return this.this$0.mAccessibilityProvider.onLmPerformAccessibilityAction(r4);
        L7:
            return super.performAccessibilityAction(r2, r3, r4, r5);
        }

        @Override // androidx.recyclerview.widget.AbstractC1160i
        public boolean requestChildRectangleOnScreen(RecyclerView r1, View r2, Rect r3, boolean r4, boolean r5) {
            return false;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface OffscreenPageLimit {
    }

    public static abstract class OnPageChangeCallback {
        public OnPageChangeCallback() {
        }

        public void onPageScrollStateChanged(int r1) {
        }

        public void onPageScrolled(int r1, float r2, int r3) {
        }

        public void onPageSelected(int r1) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Orientation {
    }

    public class PageAwareAccessibilityProvider extends AccessibilityProvider {
        private final InterfaceC2123k0 mActionPageBackward;
        private final InterfaceC2123k0 mActionPageForward;
        private AbstractC1516hv mAdapterDataObserver;
        final /* synthetic */ ViewPager2 this$0;

        public PageAwareAccessibilityProvider(ViewPager2 r2) {
            this.this$0 = r2;
            super(r2, null);
            this.mActionPageForward = new C11811(this);
            this.mActionPageBackward = new C11822(this);
        }

        private void addCollectionInfo(C1118a0 r5) {
            if (this.this$0.getAdapter() == null) goto L8;
            int r2 = 1;
            if (this.this$0.getOrientation() != 1) goto L7;
            r2 = this.this$0.getAdapter().getItemCount();
            int r0 = 1;
        L9:
            r5.f3530a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(r2, r0, false, 0));
            return;
        L7:
            r0 = this.this$0.getAdapter().getItemCount();
            goto L9
        L8:
            r0 = 0;
            r2 = 0;
            goto L9
        }

        private void addCollectionItemInfo(View r10, C1118a0 r11) {
            int r2 = 0;
            if (this.this$0.getOrientation() != 1) goto L5;
            int r3 = this.this$0.mLayoutManager.getPosition(r10);
        L7:
            if (this.this$0.getOrientation() != 0) goto L9;
            r2 = this.this$0.mLayoutManager.getPosition(r10);
        L9:
            r11.f3530a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(r3, 1, r2, 1, false, false));
            return;
        L5:
            r3 = 0;
            goto L7
        }

        private void addScrollActions(C1118a0 r4) {
            AbstractC1158g r0 = this.this$0.getAdapter();
            if (r0 == null) goto L19;
            int r02 = r0.getItemCount();
            if (r02 != 0) goto L8;
            return;
        L8:
            if (this.this$0.isUserInputEnabled() == true) goto L11;
            return;
        L11:
            if (this.this$0.mCurrentItem <= 0) goto L14;
            r4.m2040a(8192);
        L14:
            if (this.this$0.mCurrentItem >= (r02 - 1)) goto L16;
            r4.m2040a(4096);
        L16:
            r4.m2048j(true);
            return;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean handlesGetAccessibilityClassName() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean handlesPerformAccessibilityAction(int r1, Bundle r2) {
            if (r1 != 8192) goto L5;
            return true;
        L5:
            if (r1 == 4096) goto L11;
            return false;
        L11:
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onAttachAdapter(AbstractC1158g r2) {
            updatePageAccessibilityActions();
            if (r2 == null) goto L6;
            r2.registerAdapterDataObserver(this.mAdapterDataObserver);
            return;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onDetachAdapter(AbstractC1158g r2) {
            if (r2 == null) goto L5;
            r2.unregisterAdapterDataObserver(this.mAdapterDataObserver);
            return;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public String onGetAccessibilityClassName() {
            if (handlesGetAccessibilityClassName() == false) goto L7;
            return "androidx.viewpager.widget.ViewPager";
        L7:
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onInitialize(CompositeOnPageChangeCallback r1, RecyclerView r2) {
            r2.setImportantForAccessibility(2);
            this.mAdapterDataObserver = new C11833(this);
            if (this.this$0.getImportantForAccessibility() != 0) goto L6;
            this.this$0.setImportantForAccessibility(1);
            return;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r2) {
            C1118a0 r0 = new C1118a0(r2);
            addCollectionInfo(r0);
            addScrollActions(r0);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onLmInitializeAccessibilityNodeInfoForItem(View r1, C1118a0 r2) {
            addCollectionItemInfo(r1, r2);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public boolean onPerformAccessibilityAction(int r2, Bundle r3) {
            if (handlesPerformAccessibilityAction(r2, r3) == false) goto L11;
            if (r2 != 8192) goto L7;
            int r22 = this.this$0.getCurrentItem() - 1;
        L8:
            setCurrentItemFromAccessibilityCommand(r22);
            return true;
        L7:
            r22 = this.this$0.getCurrentItem() + 1;
            goto L8
        L11:
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onRestorePendingState() {
            updatePageAccessibilityActions();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onRvInitializeAccessibilityEvent(AccessibilityEvent r2) {
            r2.setSource(this.this$0);
            r2.setClassName(onGetAccessibilityClassName());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onSetLayoutDirection() {
            updatePageAccessibilityActions();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onSetNewCurrentItem() {
            updatePageAccessibilityActions();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onSetOrientation() {
            updatePageAccessibilityActions();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AccessibilityProvider
        public void onSetUserInputEnabled() {
            updatePageAccessibilityActions();
        }

        public void setCurrentItemFromAccessibilityCommand(int r3) {
            if (this.this$0.isUserInputEnabled() == false) goto L6;
            this.this$0.setCurrentItemInternal(r3, true);
            return;
        }

        public void updatePageAccessibilityActions() {
            ViewPager2 r0 = this.this$0;
            int r1 = R.id.accessibilityActionPageLeft;
            AbstractC2185lE.m4396i(r0, R.id.accessibilityActionPageLeft);
            AbstractC2185lE.m4393f(r0, 0);
            AbstractC2185lE.m4396i(r0, R.id.accessibilityActionPageRight);
            AbstractC2185lE.m4393f(r0, 0);
            AbstractC2185lE.m4396i(r0, R.id.accessibilityActionPageUp);
            AbstractC2185lE.m4393f(r0, 0);
            AbstractC2185lE.m4396i(r0, R.id.accessibilityActionPageDown);
            AbstractC2185lE.m4393f(r0, 0);
            if (this.this$0.getAdapter() == null) goto L35;
            int r2 = this.this$0.getAdapter().getItemCount();
            if (r2 != 0) goto L9;
            return;
        L9:
            if (this.this$0.isUserInputEnabled() == true) goto L12;
            return;
        L12:
            if (this.this$0.getOrientation() != 0) goto L27;
            boolean r4 = this.this$0.isRtl();
            if (r4 == false) goto L16;
            int r5 = 16908360;
        L17:
            if (r4 == false) goto L20;
            r1 = 16908361;
        L20:
            if (this.this$0.mCurrentItem >= (r2 - 1)) goto L23;
            AbstractC2185lE.m4397j(r0, new C0902V(r5, null), this.mActionPageForward);
        L23:
            if (this.this$0.mCurrentItem <= 0) goto L33;
            AbstractC2185lE.m4397j(r0, new C0902V(r1, null), this.mActionPageBackward);
            return;
        L33:
            return;
        L16:
            r5 = 16908361;
            goto L17
        L27:
            if (this.this$0.mCurrentItem >= (r2 - 1)) goto L30;
            AbstractC2185lE.m4397j(r0, new C0902V(R.id.accessibilityActionPageDown, null), this.mActionPageForward);
        L30:
            if (this.this$0.mCurrentItem <= 0) goto L34;
            AbstractC2185lE.m4397j(r0, new C0902V(R.id.accessibilityActionPageUp, null), this.mActionPageBackward);
            return;
        L34:
            return;
        }
    }

    public interface PageTransformer {
        void transformPage(View r1, float r2);
    }

    public class PagerSnapHelperImpl extends C0122Ct {
        final /* synthetic */ ViewPager2 this$0;

        public PagerSnapHelperImpl(ViewPager2 r1) {
            this.this$0 = r1;
        }

        @Override // p000.C0122Ct, p000.AbstractC0127Cy
        public View findSnapView(AbstractC1160i r2) {
            if (this.this$0.isFakeDragging() == false) goto L7;
            return null;
        L7:
            return super.findSnapView(r2);
        }
    }

    public class RecyclerViewImpl extends RecyclerView {
        final /* synthetic */ ViewPager2 this$0;

        public RecyclerViewImpl(ViewPager2 r1, Context r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public CharSequence getAccessibilityClassName() {
            if (this.this$0.mAccessibilityProvider.handlesRvGetAccessibilityClassName() == false) goto L7;
            return this.this$0.mAccessibilityProvider.onRvGetAccessibilityClassName();
        L7:
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent r2) {
            super.onInitializeAccessibilityEvent(r2);
            r2.setFromIndex(this.this$0.mCurrentItem);
            r2.setToIndex(this.this$0.mCurrentItem);
            this.this$0.mAccessibilityProvider.onRvInitializeAccessibilityEvent(r2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent r2) {
            if (this.this$0.isUserInputEnabled() == true) goto L5;
            return false;
        L5:
            if (super.onInterceptTouchEvent(r2) == false) goto L10;
            return true;
        L10:
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent r2) {
            if (this.this$0.isUserInputEnabled() == true) goto L5;
            return false;
        L5:
            if (super.onTouchEvent(r2) == false) goto L10;
            return true;
        L10:
            return false;
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        Parcelable mAdapterState;
        int mCurrentItem;
        int mRecyclerViewId;

        static {
            CREATOR = new C11841();
        }

        @SuppressLint({"ClassVerificationFailure"})
        public SavedState(Parcel r1, ClassLoader r2) {
            super(r1, r2);
            readValues(r1, r2);
        }

        private void readValues(Parcel r2, ClassLoader r3) {
            this.mRecyclerViewId = r2.readInt();
            this.mCurrentItem = r2.readInt();
            this.mAdapterState = r2.readParcelable(r3);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel r2, int r3) {
            super.writeToParcel(r2, r3);
            r2.writeInt(this.mRecyclerViewId);
            r2.writeInt(this.mCurrentItem);
            r2.writeParcelable(this.mAdapterState, r3);
        }

        public SavedState(Parcel r2) {
            super(r2);
            readValues(r2, null);
        }

        public SavedState(Parcelable r1) {
            super(r1);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollState {
    }

    public static class SmoothScrollToPosition implements Runnable {
        private final int mPosition;
        private final RecyclerView mRecyclerView;

        public SmoothScrollToPosition(int r1, RecyclerView r2) {
            this.mPosition = r1;
            this.mRecyclerView = r2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.mRecyclerView.smoothScrollToPosition(this.mPosition);
        }
    }

    public ViewPager2(Context r4) {
        super(r4);
        this.mTmpContainerRect = new Rect();
        this.mTmpChildRect = new Rect();
        this.mExternalPageChangeCallbacks = new CompositeOnPageChangeCallback(3);
        this.mCurrentItemDirty = false;
        this.mCurrentItemDataSetChangeObserver = new C11771(this);
        this.mPendingCurrentItem = -1;
        this.mSavedItemAnimator = null;
        this.mSavedItemAnimatorPresent = false;
        this.mUserInputEnabled = true;
        this.mOffscreenPageLimit = -1;
        initialize(r4, null);
    }

    private InterfaceC2474rv enforceChildFillListener() {
        return new C11804(this);
    }

    private void initialize(Context r3, AttributeSet r4) {
        if (sFeatureEnhancedA11yEnabled == false) goto L5;
        AccessibilityProvider r0 = new PageAwareAccessibilityProvider(this);
    L6:
        this.mAccessibilityProvider = r0;
        RecyclerViewImpl r02 = new RecyclerViewImpl(this, r3);
        this.mRecyclerView = r02;
        r02.setId(View.generateViewId());
        this.mRecyclerView.setDescendantFocusability(131072);
        LinearLayoutManagerImpl r03 = new LinearLayoutManagerImpl(this, r3);
        this.mLayoutManager = r03;
        this.mRecyclerView.setLayoutManager(r03);
        this.mRecyclerView.setScrollingTouchSlop(1);
        setOrientation(r3, r4);
        this.mRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mRecyclerView.addOnChildAttachStateChangeListener(enforceChildFillListener());
        ScrollEventAdapter r32 = new ScrollEventAdapter(this);
        this.mScrollEventAdapter = r32;
        this.mFakeDragger = new FakeDrag(this, r32, this.mRecyclerView);
        PagerSnapHelperImpl r33 = new PagerSnapHelperImpl(this);
        this.mPagerSnapHelper = r33;
        r33.attachToRecyclerView(this.mRecyclerView);
        this.mRecyclerView.addOnScrollListener(this.mScrollEventAdapter);
        CompositeOnPageChangeCallback r34 = new CompositeOnPageChangeCallback(3);
        this.mPageChangeEventDispatcher = r34;
        this.mScrollEventAdapter.setOnPageChangeCallback(r34);
        OnPageChangeCallback r35 = new C11782(this);
        OnPageChangeCallback r42 = new C11793(this);
        this.mPageChangeEventDispatcher.addOnPageChangeCallback(r35);
        this.mPageChangeEventDispatcher.addOnPageChangeCallback(r42);
        this.mAccessibilityProvider.onInitialize(this.mPageChangeEventDispatcher, this.mRecyclerView);
        this.mPageChangeEventDispatcher.addOnPageChangeCallback(this.mExternalPageChangeCallbacks);
        PageTransformerAdapter r36 = new PageTransformerAdapter(this.mLayoutManager);
        this.mPageTransformerAdapter = r36;
        this.mPageChangeEventDispatcher.addOnPageChangeCallback(r36);
        RecyclerView r37 = this.mRecyclerView;
        attachViewToParent(r37, 0, r37.getLayoutParams());
        return;
    L5:
        r0 = new BasicAccessibilityProvider(this);
        goto L6
    }

    private void registerCurrentItemDataSetTracker(AbstractC1158g r2) {
        if (r2 == null) goto L5;
        r2.registerAdapterDataObserver(this.mCurrentItemDataSetChangeObserver);
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void restorePendingState() {
        if (this.mPendingCurrentItem == (-1)) goto L16;
        AbstractC1158g r0 = getAdapter();
        if (r0 != 0) goto L8;
        return;
    L8:
        Parcelable r2 = this.mPendingAdapterState;
        if (r2 != null) goto L11;
    L14:
        int r02 = Math.max(0, Math.min(this.mPendingCurrentItem, r0.getItemCount() - 1));
        this.mCurrentItem = r02;
        this.mPendingCurrentItem = -1;
        this.mRecyclerView.scrollToPosition(r02);
        this.mAccessibilityProvider.onRestorePendingState();
        return;
    L11:
        if ((r0 instanceof StatefulAdapter) == false) goto L13;
        ((StatefulAdapter) r0).restoreState(r2);
    L13:
        this.mPendingAdapterState = null;
        goto L14
    }

    private void setOrientation(Context r8, AttributeSet r9) {
        TypedArray r5 = r8.obtainStyledAttributes(r9, C1167R.styleable.ViewPager2);
        AbstractC2185lE.m4398k(this, r8, C1167R.styleable.ViewPager2, r9, r5, 0);
        setOrientation(r5.getInt(C1167R.styleable.ViewPager2_android_orientation, 0));     // Catch: Throwable -> L6
        r5.recycle();
        return;
    L6:
        th = move-exception;
        r5.recycle();
        throw th;
    }

    private void unregisterCurrentItemDataSetTracker(AbstractC1158g r2) {
        if (r2 == null) goto L5;
        r2.unregisterAdapterDataObserver(this.mCurrentItemDataSetChangeObserver);
        return;
    }

    public void addItemDecoration(AbstractC2251mv r2) {
        this.mRecyclerView.addItemDecoration(r2);
    }

    public boolean beginFakeDrag() {
        return this.mFakeDragger.beginFakeDrag();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int r2) {
        return this.mRecyclerView.canScrollHorizontally(r2);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int r2) {
        return this.mRecyclerView.canScrollVertically(r2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> r4) {
        Parcelable r0 = r4.get(getId());
        if ((r0 instanceof SavedState) == false) goto L5;
        int r02 = ((SavedState) r0).mRecyclerViewId;
        r4.put(this.mRecyclerView.getId(), r4.get(r02));
        r4.remove(r02);
    L5:
        super.dispatchRestoreInstanceState(r4);
        restorePendingState();
    }

    public boolean endFakeDrag() {
        return this.mFakeDragger.endFakeDrag();
    }

    public boolean fakeDragBy(@SuppressLint({"SupportAnnotationUsage"}) float r2) {
        return this.mFakeDragger.fakeDragBy(r2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (this.mAccessibilityProvider.handlesGetAccessibilityClassName() == false) goto L7;
        return this.mAccessibilityProvider.onGetAccessibilityClassName();
    L7:
        return super.getAccessibilityClassName();
    }

    public AbstractC1158g getAdapter() {
        return this.mRecyclerView.getAdapter();
    }

    public int getCurrentItem() {
        return this.mCurrentItem;
    }

    public AbstractC2251mv getItemDecorationAt(int r2) {
        return this.mRecyclerView.getItemDecorationAt(r2);
    }

    public int getItemDecorationCount() {
        return this.mRecyclerView.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getOrientation() {
        if (this.mLayoutManager.getOrientation() != 1) goto L5;
        return 1;
    L5:
        return 0;
    }

    public int getPageSize() {
        RecyclerView r0 = this.mRecyclerView;
        if (getOrientation() != 0) goto L7;
        int r1 = r0.getWidth() - r0.getPaddingLeft();
        int r02 = r0.getPaddingRight();
    L6:
        return r1 - r02;
    L7:
        r1 = r0.getHeight() - r0.getPaddingTop();
        r02 = r0.getPaddingBottom();
        goto L6
    }

    public int getScrollState() {
        return this.mScrollEventAdapter.getScrollState();
    }

    public void invalidateItemDecorations() {
        this.mRecyclerView.invalidateItemDecorations();
    }

    public boolean isFakeDragging() {
        return this.mFakeDragger.isFakeDragging();
    }

    public boolean isRtl() {
        if (this.mLayoutManager.getLayoutDirection() != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public boolean isUserInputEnabled() {
        return this.mUserInputEnabled;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo r2) {
        super.onInitializeAccessibilityNodeInfo(r2);
        this.mAccessibilityProvider.onInitializeAccessibilityNodeInfo(r2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
        int r42 = this.mRecyclerView.getMeasuredWidth();
        int r0 = this.mRecyclerView.getMeasuredHeight();
        Rect r1 = this.mTmpContainerRect;
        r1.left = getPaddingLeft();
        Rect r12 = this.mTmpContainerRect;
        r12.right = (r7 - r5) - getPaddingRight();
        Rect r52 = this.mTmpContainerRect;
        r52.top = getPaddingTop();
        Rect r53 = this.mTmpContainerRect;
        r53.bottom = (r8 - r6) - getPaddingBottom();
        Gravity.apply(8388659, r42, r0, this.mTmpContainerRect, this.mTmpChildRect);
        RecyclerView r43 = this.mRecyclerView;
        Rect r54 = this.mTmpChildRect;
        r43.layout(r54.left, r54.top, r54.right, r54.bottom);
        if (this.mCurrentItemDirty == false) goto L6;
        updateCurrentItem();
        return;
    }

    @Override // android.view.View
    public void onMeasure(int r6, int r7) {
        measureChild(this.mRecyclerView, r6, r7);
        int r0 = this.mRecyclerView.getMeasuredWidth();
        int r1 = this.mRecyclerView.getMeasuredHeight();
        int r2 = this.mRecyclerView.getMeasuredState();
        int r3 = getPaddingLeft();
        int r4 = (getPaddingRight() + r3) + r0;
        int r02 = getPaddingTop();
        int r32 = (getPaddingBottom() + r02) + r1;
        int r03 = Math.max(r4, getSuggestedMinimumWidth());
        int r12 = Math.max(r32, getSuggestedMinimumHeight());
        setMeasuredDimension(View.resolveSizeAndState(r03, r6, r2), View.resolveSizeAndState(r12, r7, r2 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable r2) {
        if ((r2 instanceof SavedState) == true) goto L6;
        super.onRestoreInstanceState(r2);
        return;
    L6:
        SavedState r22 = (SavedState) r2;
        super.onRestoreInstanceState(r22.getSuperState());
        this.mPendingCurrentItem = r22.mCurrentItem;
        this.mPendingAdapterState = r22.mAdapterState;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState r1 = new SavedState(super.onSaveInstanceState());
        r1.mRecyclerViewId = this.mRecyclerView.getId();
        int r0 = this.mPendingCurrentItem;
        if (r0 != (-1)) goto L5;
        r0 = this.mCurrentItem;
    L5:
        r1.mCurrentItem = r0;
        Parcelable r02 = this.mPendingAdapterState;
        if (r02 == null) goto L9;
        r1.mAdapterState = r02;
        return r1;
    L9:
        Object r03 = this.mRecyclerView.getAdapter();
        if ((r03 instanceof StatefulAdapter) == false) goto L12;
        r1.mAdapterState = ((StatefulAdapter) r03).saveState();
    L12:
        return r1;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View r2) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int r2, Bundle r3) {
        if (this.mAccessibilityProvider.handlesPerformAccessibilityAction(r2, r3) == false) goto L7;
        return this.mAccessibilityProvider.onPerformAccessibilityAction(r2, r3);
    L7:
        return super.performAccessibilityAction(r2, r3);
    }

    public void registerOnPageChangeCallback(OnPageChangeCallback r2) {
        this.mExternalPageChangeCallbacks.addOnPageChangeCallback(r2);
    }

    public void removeItemDecoration(AbstractC2251mv r2) {
        this.mRecyclerView.removeItemDecoration(r2);
    }

    public void removeItemDecorationAt(int r2) {
        this.mRecyclerView.removeItemDecorationAt(r2);
    }

    public void requestTransform() {
        if (this.mPageTransformerAdapter.getPageTransformer() != null) goto L5;
        return;
    L5:
        double r0 = this.mScrollEventAdapter.getRelativeScrollPosition();
        int r2 = (int) r0;
        float r02 = (float) (r0 - ((double) r2));
        this.mPageTransformerAdapter.onPageScrolled(r2, r02, Math.round(getPageSize() * r02));
    }

    public void setAdapter(AbstractC1158g r3) {
        AbstractC1158g r0 = this.mRecyclerView.getAdapter();
        this.mAccessibilityProvider.onDetachAdapter(r0);
        unregisterCurrentItemDataSetTracker(r0);
        this.mRecyclerView.setAdapter(r3);
        this.mCurrentItem = 0;
        restorePendingState();
        this.mAccessibilityProvider.onAttachAdapter(r3);
        registerCurrentItemDataSetTracker(r3);
    }

    public void setCurrentItem(int r2) {
        setCurrentItem(r2, true);
    }

    public void setCurrentItemInternal(int r9, boolean r10) {
        AbstractC1158g r0 = getAdapter();
        if (r0 != null) goto L9;
        if (this.mPendingCurrentItem == (-1)) goto L19;
        this.mPendingCurrentItem = Math.max(r9, 0);
        return;
    L19:
        return;
    L9:
        if (r0.getItemCount() <= 0) goto L38;
        int r92 = Math.min(Math.max(r9, 0), r0.getItemCount() - 1);
        if (r92 == this.mCurrentItem) goto L14;
    L16:
        int r02 = this.mCurrentItem;
        if (r92 != r02) goto L20;
        if (r10 == false) goto L20;
        return;
    L20:
        double r03 = r02;
        this.mCurrentItem = r92;
        this.mAccessibilityProvider.onSetNewCurrentItem();
        if (this.mScrollEventAdapter.isIdle() == true) goto L23;
        r03 = this.mScrollEventAdapter.getRelativeScrollPosition();
    L23:
        this.mScrollEventAdapter.notifyProgrammaticScroll(r92, r10);
        if (r10 == true) goto L27;
        this.mRecyclerView.scrollToPosition(r92);
        return;
    L27:
        double r2 = r92;
        if (Math.abs(r2 - r03) <= 3.0d) goto L35;
        RecyclerView r102 = this.mRecyclerView;
        if (r2 <= r03) goto L32;
        int r04 = r92 - 3;
    L33:
        r102.scrollToPosition(r04);
        RecyclerView r103 = this.mRecyclerView;
        r103.post(new SmoothScrollToPosition(r92, r103));
        return;
    L32:
        r04 = r92 + 3;
        goto L33
    L35:
        this.mRecyclerView.smoothScrollToPosition(r92);
        return;
    L14:
        if (this.mScrollEventAdapter.isIdle() == false) goto L16;
        return;
    }

    @Override // android.view.View
    public void setLayoutDirection(int r1) {
        super.setLayoutDirection(r1);
        this.mAccessibilityProvider.onSetLayoutDirection();
    }

    public void setOffscreenPageLimit(int r2) {
        if (r2 < 1) goto L5;
    L9:
        this.mOffscreenPageLimit = r2;
        this.mRecyclerView.requestLayout();
        return;
    L5:
        if (r2 == (-1)) goto L9;
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setPageTransformer(PageTransformer r4) {
        if (r4 == null) goto L9;
        if (this.mSavedItemAnimatorPresent == true) goto L7;
        this.mSavedItemAnimator = this.mRecyclerView.getItemAnimator();
        this.mSavedItemAnimatorPresent = true;
    L7:
        this.mRecyclerView.setItemAnimator(null);
    L12:
        if (r4 != this.mPageTransformerAdapter.getPageTransformer()) goto L14;
        return;
    L14:
        this.mPageTransformerAdapter.setPageTransformer(r4);
        requestTransform();
        return;
    L9:
        if (this.mSavedItemAnimatorPresent == false) goto L12;
        this.mRecyclerView.setItemAnimator(this.mSavedItemAnimator);
        this.mSavedItemAnimator = null;
        this.mSavedItemAnimatorPresent = false;
        goto L12
    }

    public void setUserInputEnabled(boolean r1) {
        this.mUserInputEnabled = r1;
        this.mAccessibilityProvider.onSetUserInputEnabled();
    }

    public void snapToPage() {
        View r0 = this.mPagerSnapHelper.findSnapView(this.mLayoutManager);
        if (r0 == null) goto L13;
        int[] r02 = this.mPagerSnapHelper.calculateDistanceToFinalSnap(this.mLayoutManager, r0);
        int r1 = r02[0];
        if (r1 == 0) goto L8;
    L11:
        this.mRecyclerView.smoothScrollBy(r1, r02[1]);
        return;
    L8:
        if (r02[1] != 0) goto L11;
        return;
    }

    public void unregisterOnPageChangeCallback(OnPageChangeCallback r2) {
        this.mExternalPageChangeCallbacks.removeOnPageChangeCallback(r2);
    }

    public void updateCurrentItem() {
        C0122Ct r0 = this.mPagerSnapHelper;
        if (r0 == null) goto L15;
        View r02 = r0.findSnapView(this.mLayoutManager);
        if (r02 != null) goto L7;
        return;
    L7:
        int r03 = this.mLayoutManager.getPosition(r02);
        if (r03 != this.mCurrentItem) goto L10;
    L12:
        this.mCurrentItemDirty = false;
        return;
    L10:
        if (getScrollState() != 0) goto L12;
        this.mPageChangeEventDispatcher.onPageSelected(r03);
        goto L12
    L15:
        throw new IllegalStateException("Design assumption violated.");
    }

    public void addItemDecoration(AbstractC2251mv r2, int r3) {
        this.mRecyclerView.addItemDecoration(r2, r3);
    }

    public void setCurrentItem(int r2, boolean r3) {
        if (isFakeDragging() == true) goto L7;
        setCurrentItemInternal(r2, r3);
        return;
    L7:
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public void setOrientation(int r2) {
        this.mLayoutManager.setOrientation(r2);
        this.mAccessibilityProvider.onSetOrientation();
    }

    public ViewPager2(Context r4, AttributeSet r5) {
        super(r4, r5);
        this.mTmpContainerRect = new Rect();
        this.mTmpChildRect = new Rect();
        this.mExternalPageChangeCallbacks = new CompositeOnPageChangeCallback(3);
        this.mCurrentItemDirty = false;
        this.mCurrentItemDataSetChangeObserver = new C11771(this);
        this.mPendingCurrentItem = -1;
        this.mSavedItemAnimator = null;
        this.mSavedItemAnimatorPresent = false;
        this.mUserInputEnabled = true;
        this.mOffscreenPageLimit = -1;
        initialize(r4, r5);
    }

    public ViewPager2(Context r3, AttributeSet r4, int r5) {
        super(r3, r4, r5);
        this.mTmpContainerRect = new Rect();
        this.mTmpChildRect = new Rect();
        this.mExternalPageChangeCallbacks = new CompositeOnPageChangeCallback(3);
        this.mCurrentItemDirty = false;
        this.mCurrentItemDataSetChangeObserver = new C11771(this);
        this.mPendingCurrentItem = -1;
        this.mSavedItemAnimator = null;
        this.mSavedItemAnimatorPresent = false;
        this.mUserInputEnabled = true;
        this.mOffscreenPageLimit = -1;
        initialize(r3, r4);
    }

    @SuppressLint({"ClassVerificationFailure"})
    public ViewPager2(Context r2, AttributeSet r3, int r4, int r5) {
        super(r2, r3, r4, r5);
        this.mTmpContainerRect = new Rect();
        this.mTmpChildRect = new Rect();
        this.mExternalPageChangeCallbacks = new CompositeOnPageChangeCallback(3);
        this.mCurrentItemDirty = false;
        this.mCurrentItemDataSetChangeObserver = new C11771(this);
        this.mPendingCurrentItem = -1;
        this.mSavedItemAnimator = null;
        this.mSavedItemAnimatorPresent = false;
        this.mUserInputEnabled = true;
        this.mOffscreenPageLimit = -1;
        initialize(r2, r3);
    }
}
