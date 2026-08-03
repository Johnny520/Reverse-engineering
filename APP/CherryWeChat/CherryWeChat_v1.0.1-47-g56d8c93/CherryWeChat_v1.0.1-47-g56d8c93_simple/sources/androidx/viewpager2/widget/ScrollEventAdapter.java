package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;
import p000.AbstractC2374ph;
import p000.AbstractC2603uv;

/* JADX INFO: loaded from: classes.dex */
final class ScrollEventAdapter extends AbstractC2603uv {
    private static final int NO_POSITION = -1;
    private static final int STATE_IDLE = 0;
    private static final int STATE_IN_PROGRESS_FAKE_DRAG = 4;
    private static final int STATE_IN_PROGRESS_IMMEDIATE_SCROLL = 3;
    private static final int STATE_IN_PROGRESS_MANUAL_DRAG = 1;
    private static final int STATE_IN_PROGRESS_SMOOTH_SCROLL = 2;
    private int mAdapterState;
    private ViewPager2.OnPageChangeCallback mCallback;
    private boolean mDataSetChangeHappened;
    private boolean mDispatchSelected;
    private int mDragStartPosition;
    private boolean mFakeDragging;
    private final LinearLayoutManager mLayoutManager;
    private final RecyclerView mRecyclerView;
    private boolean mScrollHappened;
    private int mScrollState;
    private ScrollEventValues mScrollValues;
    private int mTarget;
    private final ViewPager2 mViewPager;

    public static final class ScrollEventValues {
        float mOffset;
        int mOffsetPx;
        int mPosition;

        public ScrollEventValues() {
        }

        public void reset() {
            this.mPosition = -1;
            this.mOffset = 0.0f;
            this.mOffsetPx = 0;
        }
    }

    public ScrollEventAdapter(ViewPager2 r1) {
        this.mViewPager = r1;
        RecyclerView r12 = r1.mRecyclerView;
        this.mRecyclerView = r12;
        this.mLayoutManager = (LinearLayoutManager) r12.getLayoutManager();
        this.mScrollValues = new ScrollEventValues();
        resetState();
    }

    private void dispatchScrolled(int r2, float r3, int r4) {
        ViewPager2.OnPageChangeCallback r0 = this.mCallback;
        if (r0 == null) goto L6;
        r0.onPageScrolled(r2, r3, r4);
        return;
    }

    private void dispatchSelected(int r2) {
        ViewPager2.OnPageChangeCallback r0 = this.mCallback;
        if (r0 == null) goto L6;
        r0.onPageSelected(r2);
        return;
    }

    private void dispatchStateChanged(int r3) {
        if (this.mAdapterState != 3) goto L8;
        if (this.mScrollState != 0) goto L8;
        return;
    L8:
        if (this.mScrollState == r3) goto L16;
        this.mScrollState = r3;
        ViewPager2.OnPageChangeCallback r0 = this.mCallback;
        if (r0 == null) goto L14;
        r0.onPageScrollStateChanged(r3);
        return;
    L14:
        return;
    }

    private int getPosition() {
        return this.mLayoutManager.findFirstVisibleItemPosition();
    }

    private boolean isInAnyDraggingState() {
        int r0 = this.mAdapterState;
        if (r0 != 1) goto L5;
    L9:
        return true;
    L5:
        if (r0 == 4) goto L9;
        return false;
    }

    private void resetState() {
        this.mAdapterState = 0;
        this.mScrollState = 0;
        this.mScrollValues.reset();
        this.mDragStartPosition = -1;
        this.mTarget = -1;
        this.mDispatchSelected = false;
        this.mScrollHappened = false;
        this.mFakeDragging = false;
        this.mDataSetChangeHappened = false;
    }

    private void startDrag(boolean r3) {
        this.mFakeDragging = r3;
        if (r3 == false) goto L5;
        int r32 = 4;
    L6:
        this.mAdapterState = r32;
        int r33 = this.mTarget;
        if (r33 == (-1)) goto L10;
        this.mDragStartPosition = r33;
        this.mTarget = -1;
    L12:
        dispatchStateChanged(1);
        return;
    L10:
        if (this.mDragStartPosition != (-1)) goto L12;
        this.mDragStartPosition = getPosition();
        goto L12
    L5:
        r32 = 1;
        goto L6
    }

    private void updateScrollEventValues() {
        ScrollEventValues r0 = this.mScrollValues;
        int r1 = this.mLayoutManager.findFirstVisibleItemPosition();
        r0.mPosition = r1;
        if (r1 != (-1)) goto L6;
        r0.reset();
        return;
    L6:
        View r12 = this.mLayoutManager.findViewByPosition(r1);
        if (r12 != null) goto L10;
        r0.reset();
        return;
    L10:
        int r2 = this.mLayoutManager.getLeftDecorationWidth(r12);
        int r3 = this.mLayoutManager.getRightDecorationWidth(r12);
        int r4 = this.mLayoutManager.getTopDecorationHeight(r12);
        int r5 = this.mLayoutManager.getBottomDecorationHeight(r12);
        ViewGroup.LayoutParams r6 = r12.getLayoutParams();
        if ((r6 instanceof ViewGroup.MarginLayoutParams) == false) goto L13;
        ViewGroup.MarginLayoutParams r62 = (ViewGroup.MarginLayoutParams) r6;
        r2 = r2 + r62.leftMargin;
        r3 = r3 + r62.rightMargin;
        r4 = r4 + r62.topMargin;
        r5 = r5 + r62.bottomMargin;
    L13:
        int r63 = (r12.getHeight() + r4) + r5;
        int r52 = (r12.getWidth() + r2) + r3;
        if (this.mLayoutManager.getOrientation() != 0) goto L19;
        int r13 = (r12.getLeft() - r2) - this.mRecyclerView.getPaddingLeft();
        if (this.mViewPager.isRtl() == false) goto L18;
        r13 = -r13;
    L18:
        r63 = r52;
    L20:
        int r14 = -r13;
        r0.mOffsetPx = r14;
        if (r14 < 0) goto L23;
        if (r63 != 0) goto L30;
        float r15 = 0.0f;
    L31:
        r0.mOffset = r15;
        return;
    L30:
        r15 = r14 / r63;
        goto L31
    L23:
        if (new AnimateLayoutChangeDetector(this.mLayoutManager).mayHaveInterferingAnimations() == true) goto L25;
        Locale r22 = Locale.US;
        throw new IllegalStateException(AbstractC2374ph.m4812i(r0.mOffsetPx, "Page can only be offset by a positive amount, not by "));
    L25:
        throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
    L19:
        r13 = (r12.getTop() - r4) - this.mRecyclerView.getPaddingTop();
        goto L20
    }

    public double getRelativeScrollPosition() {
        updateScrollEventValues();
        ScrollEventValues r0 = this.mScrollValues;
        return ((double) r0.mPosition) + ((double) r0.mOffset);
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean isDragging() {
        if (this.mScrollState != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    public boolean isIdle() {
        if (this.mScrollState != 0) goto L6;
        return true;
    L6:
        return false;
    }

    public void notifyBeginFakeDrag() {
        this.mAdapterState = 4;
        startDrag(true);
    }

    public void notifyDataSetChangeHappened() {
        this.mDataSetChangeHappened = true;
    }

    public void notifyEndFakeDrag() {
        if (isDragging() == true) goto L5;
    L7:
        this.mFakeDragging = false;
        updateScrollEventValues();
        ScrollEventValues r1 = this.mScrollValues;
        if (r1.mOffsetPx != 0) goto L14;
        int r12 = r1.mPosition;
        if (r12 == this.mDragStartPosition) goto L12;
        dispatchSelected(r12);
    L12:
        dispatchStateChanged(0);
        resetState();
        return;
    L14:
        dispatchStateChanged(2);
        return;
    L5:
        if (this.mFakeDragging == true) goto L7;
    }

    public void notifyProgrammaticScroll(int r3, boolean r4) {
        if (r4 == false) goto L5;
        int r42 = 2;
    L6:
        this.mAdapterState = r42;
        boolean r43 = false;
        this.mFakeDragging = false;
        if (this.mTarget == r3) goto L9;
        r43 = true;
    L9:
        this.mTarget = r3;
        dispatchStateChanged(2);
        if (r43 == false) goto L13;
        dispatchSelected(r3);
        return;
    L13:
        return;
    L5:
        r42 = 3;
        goto L6
    }

    @Override // p000.AbstractC2603uv
    public void onScrollStateChanged(RecyclerView r5, int r6) {
        if (this.mAdapterState == 1) goto L5;
    L6:
        if (r6 != 1) goto L10;
        startDrag(false);
        return;
    L10:
        if (isInAnyDraggingState() == false) goto L17;
        if (r6 != 2) goto L17;
        if (this.mScrollHappened == false) goto L44;
        dispatchStateChanged(2);
        this.mDispatchSelected = true;
        return;
    L44:
        return;
    L17:
        if (isInAnyDraggingState() == false) goto L31;
        if (r6 != 0) goto L31;
        updateScrollEventValues();
        if (this.mScrollHappened == true) goto L24;
        int r52 = this.mScrollValues.mPosition;
        if (r52 == (-1)) goto L29;
        dispatchScrolled(r52, 0.0f, 0);
    L29:
        dispatchStateChanged(0);
        resetState();
        goto L31
    L24:
        ScrollEventValues r53 = this.mScrollValues;
        if (r53.mOffsetPx != 0) goto L31;
        int r3 = this.mDragStartPosition;
        int r54 = r53.mPosition;
        if (r3 == r54) goto L29;
        dispatchSelected(r54);
    L31:
        if (this.mAdapterState != 2) goto L45;
        if (r6 == 0) goto L34;
        return;
    L34:
        if (this.mDataSetChangeHappened == false) goto L47;
        updateScrollEventValues();
        ScrollEventValues r55 = this.mScrollValues;
        if (r55.mOffsetPx != 0) goto L48;
        int r62 = this.mTarget;
        int r56 = r55.mPosition;
        if (r62 == r56) goto L42;
        if (r56 != (-1)) goto L41;
        r56 = 0;
    L41:
        dispatchSelected(r56);
    L42:
        dispatchStateChanged(0);
        resetState();
        return;
    L48:
        return;
    L47:
        return;
    L45:
        return;
    L5:
        if (this.mScrollState == 1) goto L10;
        goto L6
    }

    @Override // p000.AbstractC2603uv
    public void onScrolled(RecyclerView r4, int r5, int r6) {
        this.mScrollHappened = true;
        updateScrollEventValues();
        if (this.mDispatchSelected == false) goto L20;
        this.mDispatchSelected = false;
        if (r6 > 0) goto L12;
        if (r6 != 0) goto L15;
        if (r5 >= 0) goto L9;
        boolean r52 = true;
    L11:
        if (r52 != this.mViewPager.isRtl()) goto L15;
    L9:
        r52 = false;
    L15:
        int r53 = this.mScrollValues.mPosition;
    L16:
        this.mTarget = r53;
        if (this.mDragStartPosition == r53) goto L25;
        dispatchSelected(r53);
    L25:
        ScrollEventValues r54 = this.mScrollValues;
        int r62 = r54.mPosition;
        if (r62 != (-1)) goto L28;
        r62 = 0;
    L28:
        dispatchScrolled(r62, r54.mOffset, r54.mOffsetPx);
        ScrollEventValues r55 = this.mScrollValues;
        int r63 = r55.mPosition;
        int r0 = this.mTarget;
        if (r63 == r0) goto L32;
        if (r0 == (-1)) goto L32;
        return;
    L32:
        if (r55.mOffsetPx == 0) goto L34;
        return;
    L34:
        if (this.mScrollState == 1) goto L39;
        dispatchStateChanged(0);
        resetState();
        return;
    L39:
        return;
    L12:
        ScrollEventValues r56 = this.mScrollValues;
        if (r56.mOffsetPx == 0) goto L15;
        r53 = r56.mPosition + 1;
        goto L16
    L20:
        if (this.mAdapterState != 0) goto L25;
        int r57 = this.mScrollValues.mPosition;
        if (r57 != (-1)) goto L24;
        r57 = 0;
    L24:
        dispatchSelected(r57);
        goto L25
    }

    public void setOnPageChangeCallback(ViewPager2.OnPageChangeCallback r1) {
        this.mCallback = r1;
    }
}
