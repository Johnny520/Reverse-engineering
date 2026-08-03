package androidx.core.widget;

import Yue.C3024;
import Yue.C3055;
import Yue.C3068;
import Yue.C4396;
import Yue.C4587;
import Yue.C6270;
import Yue.C6366;
import Yue.C6370;
import Yue.C6989;
import Yue.C8273;
import Yue.InterfaceC4397;
import Yue.InterfaceC4482;
import Yue.InterfaceC6364;
import Yue.InterfaceC6368;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7113;
import Yue.InterfaceC7144;
import Yue.InterfaceC7246;
import Yue.InterfaceC8392;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC6368, InterfaceC6364, InterfaceC7246 {
    static final int ANIMATED_SCROLL_GAP = 250;
    private static final int DEFAULT_SMOOTH_SCROLL_DURATION = 250;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    static final float MAX_SCROLL_FACTOR = 0.5f;
    private static final float SCROLL_FRICTION = 0.015f;
    private static final String TAG = "NestedScrollView";
    private int mActivePointerId;
    private final C6366 mChildHelper;
    private View mChildToScrollTo;

    @InterfaceC8392
    C4396 mDifferentialMotionFlingController;

    @InterfaceC8392
    final C8803 mDifferentialMotionFlingTarget;

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC8392
    public EdgeEffect mEdgeGlowBottom;

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC8392
    public EdgeEffect mEdgeGlowTop;
    private boolean mFillViewport;
    private boolean mIsBeingDragged;
    private boolean mIsLaidOut;
    private boolean mIsLayoutDirty;
    private int mLastMotionY;
    private long mLastScroll;
    private int mLastScrollerY;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private int mNestedYOffset;
    private InterfaceC8804 mOnScrollChangeListener;
    private final C6370 mParentHelper;
    private final float mPhysicalCoeff;
    private C8805 mSavedState;
    private final int[] mScrollConsumed;
    private final int[] mScrollOffset;
    private OverScroller mScroller;
    private boolean mSmoothScrollingEnabled;
    private final Rect mTempRect;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    private float mVerticalScrollFactor;
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final C1662 ACCESSIBILITY_DELEGATE = new C1662();
    private static final int[] SCROLLVIEW_STYLEABLE = {R.attr.fillViewport};

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$ۥ */
    public static class C1662 extends C3024 {
        @Override // Yue.C3024
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C3068.m6169(accessibilityEvent, nestedScrollView.getScrollX());
            C3068.m6170(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // Yue.C3024
        public void onInitializeAccessibilityNodeInfo(View view, C3055 c3055) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, c3055);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c3055.m6057(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c3055.m6097(true);
            if (nestedScrollView.getScrollY() > 0) {
                c3055.m119(C3055.C0034.f4521);
                c3055.m119(C3055.C0034.f4532);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c3055.m119(C3055.C0034.f4520);
                c3055.m119(C3055.C0034.f4534);
            }
        }

        @Override // Yue.C3024
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.smoothScrollTo(0, iMax, true);
                    return true;
                }
                if (i != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.smoothScrollTo(0, iMin, true);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$ۥ۟ */
    @InterfaceC7113(21)
    public static class C1663 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m4765(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$ۥ۟۟, reason: contains not printable characters */
    public class C8803 implements InterfaceC4397 {
        public C8803() {
        }

        @Override // Yue.InterfaceC4397
        /* JADX INFO: renamed from: ۥ */
        public boolean mo1346(float f) {
            if (f == 0.0f) {
                return false;
            }
            mo12716();
            NestedScrollView.this.fling((int) f);
            return true;
        }

        @Override // Yue.InterfaceC4397
        /* JADX INFO: renamed from: ۥ۟ */
        public float mo1347() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // Yue.InterfaceC4397
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo12716() {
            NestedScrollView.this.mScroller.abortAnimation();
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$ۥ۟۟۟, reason: contains not printable characters */
    public interface InterfaceC8804 {
        /* JADX INFO: renamed from: ۥ */
        void mo3962(@InterfaceC6391 NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C8805 extends View.BaseSavedState {
        public static final Parcelable.Creator<C8805> CREATOR = new C1664();

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f29488;

        /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$ۥ۟۟۟۟$ۥ */
        public class C1664 implements Parcelable.Creator<C8805> {
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
            public C8805 createFromParcel(Parcel parcel) {
                return new C8805(parcel);
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
            public C8805[] newArray(int i) {
                return new C8805[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C8805(Parcelable parcelable) {
            super(parcelable);
        }

        @InterfaceC6391
        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f29488 + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f29488);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C8805(Parcel parcel) {
            super(parcel);
            this.f29488 = parcel.readInt();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NestedScrollView(@InterfaceC6391 Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    private static int m29580(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static boolean m29581(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m29581((View) parent, view2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public void addView(@InterfaceC6391 View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public boolean arrowScroll(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m29594(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m29601(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.mTempRect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.mTempRect);
            m29601(computeScrollDeltaToGetChildRectOnScreen(this.mTempRect), 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && m29593(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View, Yue.InterfaceC7246
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, Yue.InterfaceC7246
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, Yue.InterfaceC7246
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mScroller.isFinished()) {
            return;
        }
        this.mScroller.computeScrollOffset();
        int currY = this.mScroller.getCurrY();
        int iConsumeFlingInVerticalStretch = consumeFlingInVerticalStretch(currY - this.mLastScrollerY);
        this.mLastScrollerY = currY;
        int[] iArr = this.mScrollConsumed;
        iArr[1] = 0;
        dispatchNestedPreScroll(0, iConsumeFlingInVerticalStretch, iArr, null, 1);
        int i = iConsumeFlingInVerticalStretch - this.mScrollConsumed[1];
        int scrollRange = getScrollRange();
        if (i != 0) {
            int scrollY = getScrollY();
            overScrollByCompat(0, i, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i2 = i - scrollY2;
            int[] iArr2 = this.mScrollConsumed;
            iArr2[1] = 0;
            dispatchNestedScroll(0, scrollY2, 0, i2, this.mScrollOffset, 1, iArr2);
            i = i2 - this.mScrollConsumed[1];
        }
        if (i != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i < 0) {
                    if (this.mEdgeGlowTop.isFinished()) {
                        this.mEdgeGlowTop.onAbsorb((int) this.mScroller.getCurrVelocity());
                    }
                } else if (this.mEdgeGlowBottom.isFinished()) {
                    this.mEdgeGlowBottom.onAbsorb((int) this.mScroller.getCurrVelocity());
                }
            }
            m4763();
        }
        if (this.mScroller.isFinished()) {
            stopNestedScroll(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    public int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i2, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View, Yue.InterfaceC7246
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, Yue.InterfaceC7246
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, Yue.InterfaceC7246
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    public int consumeFlingInVerticalStretch(int i) {
        int height = getHeight();
        if (i > 0 && C4587.m13638(this.mEdgeGlowTop) != 0.0f) {
            int iRound = Math.round(((-height) / FLING_DESTRETCH_FACTOR) * C4587.m13640(this.mEdgeGlowTop, ((-i) * FLING_DESTRETCH_FACTOR) / height, 0.5f));
            if (iRound != i) {
                this.mEdgeGlowTop.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || C4587.m13638(this.mEdgeGlowBottom) == 0.0f) {
            return i;
        }
        float f = height;
        int iRound2 = Math.round((f / FLING_DESTRETCH_FACTOR) * C4587.m13640(this.mEdgeGlowBottom, (i * FLING_DESTRETCH_FACTOR) / f, 0.5f));
        if (iRound2 != i) {
            this.mEdgeGlowBottom.finish();
        }
        return i - iRound2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.View, Yue.InterfaceC6365
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.mChildHelper.m2823(f, f2, z);
    }

    @Override // android.view.View, Yue.InterfaceC6365
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.mChildHelper.m2824(f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC6363
    public boolean dispatchNestedPreScroll(int i, int i2, @InterfaceC6490 int[] iArr, @InterfaceC6490 int[] iArr2, int i3) {
        return this.mChildHelper.m19871(i, i2, iArr, iArr2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC6364
    public void dispatchNestedScroll(int i, int i2, int i3, int i4, @InterfaceC6490 int[] iArr, int i5, @InterfaceC6391 int[] iArr2) {
        this.mChildHelper.m19872(i, i2, i3, i4, iArr, i5, iArr2);
    }

    @Override // android.view.View
    public void draw(@InterfaceC6391 Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.mEdgeGlowTop.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (C1663.m4765(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (C1663.m4765(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.mEdgeGlowTop.setSize(width, height);
            if (this.mEdgeGlowTop.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.mEdgeGlowBottom.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (C1663.m4765(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (C1663.m4765(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.mEdgeGlowBottom.setSize(width2, height2);
        if (this.mEdgeGlowBottom.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    public boolean executeKeyEvent(@InterfaceC6391 KeyEvent keyEvent) {
        this.mTempRect.setEmpty();
        if (!m29582()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return keyEvent.isAltPressed() ? fullScroll(33) : arrowScroll(33);
        }
        if (keyCode == 20) {
            return keyEvent.isAltPressed() ? fullScroll(130) : arrowScroll(130);
        }
        if (keyCode == 62) {
            pageScroll(keyEvent.isShiftPressed() ? 33 : 130);
            return false;
        }
        if (keyCode == 92) {
            return fullScroll(33);
        }
        if (keyCode == 93) {
            return fullScroll(130);
        }
        if (keyCode == 122) {
            pageScroll(33);
            return false;
        }
        if (keyCode != 123) {
            return false;
        }
        pageScroll(130);
        return false;
    }

    public void fling(int i) {
        if (getChildCount() > 0) {
            this.mScroller.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m29599(true);
        }
    }

    public boolean fullScroll(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.mTempRect;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.mTempRect.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.mTempRect;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.mTempRect;
        return m29600(i, rect3.top, rect3.bottom);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup, Yue.InterfaceC6369
    public int getNestedScrollAxes() {
        return this.mParentHelper.m2825();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @InterfaceC8392
    public float getVerticalScrollFactorCompat() {
        if (this.mVerticalScrollFactor == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.mVerticalScrollFactor = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.mVerticalScrollFactor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC6363
    public boolean hasNestedScrollingParent(int i) {
        return this.mChildHelper.m19879(i);
    }

    public boolean isFillViewport() {
        return this.mFillViewport;
    }

    @Override // android.view.View, Yue.InterfaceC6365
    public boolean isNestedScrollingEnabled() {
        return this.mChildHelper.m19880();
    }

    public boolean isSmoothScrollingEnabled() {
        return this.mSmoothScrollingEnabled;
    }

    @Override // android.view.ViewGroup
    public void measureChild(@InterfaceC6391 View view, int i, int i2) {
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mIsLaidOut = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(@InterfaceC6391 MotionEvent motionEvent) {
        int i;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.mIsBeingDragged) {
            if (C6270.m19351(motionEvent, 2)) {
                i = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if (C6270.m19351(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i = 26;
                axisValue = axisValue2;
            } else {
                i = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                m29601(-((int) (axisValue * getVerticalScrollFactorCompat())), width, 1, C6270.m19351(motionEvent, 8194));
                if (i != 0) {
                    this.mDifferentialMotionFlingController.m12715(motionEvent, i);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(@InterfaceC6391 MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.mIsBeingDragged) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            if (m29588((int) motionEvent.getX(), y)) {
                this.mLastMotionY = y;
                this.mActivePointerId = motionEvent.getPointerId(0);
                m29589();
                this.mVelocityTracker.addMovement(motionEvent);
                this.mScroller.computeScrollOffset();
                if (!m29606(motionEvent) && this.mScroller.isFinished()) {
                    z = false;
                }
                this.mIsBeingDragged = z;
                startNestedScroll(2, 0);
            } else {
                if (!m29606(motionEvent) && this.mScroller.isFinished()) {
                    z = false;
                }
                this.mIsBeingDragged = z;
                m29597();
            }
        } else if (i == 1) {
            this.mIsBeingDragged = false;
            this.mActivePointerId = -1;
            m29597();
            if (this.mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            stopNestedScroll(0);
        } else if (i == 2) {
            int i2 = this.mActivePointerId;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e(TAG, "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.mLastMotionY) > this.mTouchSlop && (2 & getNestedScrollAxes()) == 0) {
                        this.mIsBeingDragged = true;
                        this.mLastMotionY = y2;
                        m29591();
                        this.mVelocityTracker.addMovement(motionEvent);
                        this.mNestedYOffset = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i != 3) {
            if (i == 6) {
                m29596(motionEvent);
            }
        }
        return this.mIsBeingDragged;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = 0;
        this.mIsLayoutDirty = false;
        View view = this.mChildToScrollTo;
        if (view != null && m29581(view, this)) {
            m29602(this.mChildToScrollTo);
        }
        this.mChildToScrollTo = null;
        if (!this.mIsLaidOut) {
            if (this.mSavedState != null) {
                scrollTo(getScrollX(), this.mSavedState.f29488);
                this.mSavedState = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iM29580 = m29580(scrollY, paddingTop, measuredHeight);
            if (iM29580 != scrollY) {
                scrollTo(getScrollX(), iM29580);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.mIsLaidOut = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mFillViewport && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC6369
    public boolean onNestedFling(@InterfaceC6391 View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        fling((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC6369
    public boolean onNestedPreFling(@InterfaceC6391 View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC6367
    public void onNestedPreScroll(@InterfaceC6391 View view, int i, int i2, @InterfaceC6391 int[] iArr, int i3) {
        dispatchNestedPreScroll(i, i2, iArr, null, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC6368
    public void onNestedScroll(@InterfaceC6391 View view, int i, int i2, int i3, int i4, int i5, @InterfaceC6391 int[] iArr) {
        m29595(i4, i5, iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC6367
    public void onNestedScrollAccepted(@InterfaceC6391 View view, @InterfaceC6391 View view2, int i, int i2) {
        this.mParentHelper.m19889(view, view2, i, i2);
        startNestedScroll(2, i2);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || m29593(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C8805)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C8805 c8805 = (C8805) parcelable;
        super.onRestoreInstanceState(c8805.getSuperState());
        this.mSavedState = c8805;
        requestLayout();
    }

    @Override // android.view.View
    @InterfaceC6391
    public Parcelable onSaveInstanceState() {
        C8805 c8805 = new C8805(super.onSaveInstanceState());
        c8805.f29488 = getScrollY();
        return c8805;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC8804 interfaceC8804 = this.mOnScrollChangeListener;
        if (interfaceC8804 != null) {
            interfaceC8804.mo3962(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m29594(viewFindFocus, 0, i4)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(viewFindFocus, this.mTempRect);
        m29583(computeScrollDeltaToGetChildRectOnScreen(this.mTempRect));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC6367
    public boolean onStartNestedScroll(@InterfaceC6391 View view, @InterfaceC6391 View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC6367
    public void onStopNestedScroll(@InterfaceC6391 View view, int i) {
        this.mParentHelper.m19891(view, i);
        stopNestedScroll(i);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@InterfaceC6391 MotionEvent motionEvent) {
        ViewParent parent;
        m29591();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mNestedYOffset = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.mNestedYOffset);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int yVelocity = (int) velocityTracker.getYVelocity(this.mActivePointerId);
                if (Math.abs(yVelocity) >= this.mMinimumVelocity) {
                    if (!m29584(yVelocity)) {
                        int i = -yVelocity;
                        float f = i;
                        if (!dispatchNestedPreFling(0.0f, f)) {
                            dispatchNestedFling(0.0f, f, true);
                            fling(i);
                        }
                    }
                } else if (this.mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                m29585();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                if (iFindPointerIndex == -1) {
                    Log.e(TAG, "Invalid pointerId=" + this.mActivePointerId + " in onTouchEvent");
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i2 = this.mLastMotionY - y;
                    int iM29598 = i2 - m29598(i2, motionEvent.getX(iFindPointerIndex));
                    if (!this.mIsBeingDragged && Math.abs(iM29598) > this.mTouchSlop) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.mIsBeingDragged = true;
                        iM29598 = iM29598 > 0 ? iM29598 - this.mTouchSlop : iM29598 + this.mTouchSlop;
                    }
                    if (this.mIsBeingDragged) {
                        int iM29601 = m29601(iM29598, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.mLastMotionY = y - iM29601;
                        this.mNestedYOffset += iM29601;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.mIsBeingDragged && getChildCount() > 0 && this.mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                m29585();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.mLastMotionY = (int) motionEvent.getY(actionIndex);
                this.mActivePointerId = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m29596(motionEvent);
                this.mLastMotionY = (int) motionEvent.getY(motionEvent.findPointerIndex(this.mActivePointerId));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.mIsBeingDragged && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.mScroller.isFinished()) {
                m4763();
            }
            m29592((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.mVelocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public boolean overScrollByCompat(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        boolean z4 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z5 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        int i9 = i3 + i;
        int i10 = !z6 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z7 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 > i14) {
            i9 = i14;
            z2 = true;
        } else if (i9 < i13) {
            z2 = true;
            i9 = i13;
        } else {
            z2 = false;
        }
        if (i11 > i16) {
            i11 = i16;
            z3 = true;
        } else if (i11 < i15) {
            z3 = true;
            i11 = i15;
        } else {
            z3 = false;
        }
        if (z3 && !hasNestedScrollingParent(1)) {
            this.mScroller.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i9, i11, z2, z3);
        return z2 || z3;
    }

    public boolean pageScroll(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.mTempRect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.mTempRect;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.mTempRect.top = getScrollY() - height;
            Rect rect2 = this.mTempRect;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.mTempRect;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return m29600(i, i2, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.mIsLayoutDirty) {
            this.mChildToScrollTo = view2;
        } else {
            m29602(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(@InterfaceC6391 View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m29603(rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m29597();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.mIsLayoutDirty = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iM29580 = m29580(i, width, width2);
            int iM295802 = m29580(i2, height, height2);
            if (iM29580 == getScrollX() && iM295802 == getScrollY()) {
                return;
            }
            super.scrollTo(iM29580, iM295802);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.mFillViewport) {
            this.mFillViewport = z;
            requestLayout();
        }
    }

    @Override // android.view.View, Yue.InterfaceC6365
    public void setNestedScrollingEnabled(boolean z) {
        this.mChildHelper.m19883(z);
    }

    public void setOnScrollChangeListener(@InterfaceC6490 InterfaceC8804 interfaceC8804) {
        this.mOnScrollChangeListener = interfaceC8804;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.mSmoothScrollingEnabled = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void smoothScrollBy(int i, int i2) {
        m29605(i, i2, 250, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 250, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC6363
    public boolean startNestedScroll(int i, int i2) {
        return this.mChildHelper.m19886(i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC6363
    public void stopNestedScroll(int i) {
        this.mChildHelper.m19888(i);
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m4763() {
        this.mScroller.abortAnimation();
        stopNestedScroll(1);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m4764() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m29582() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m29583(int i) {
        if (i != 0) {
            if (this.mSmoothScrollingEnabled) {
                smoothScrollBy(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean m29584(int i) {
        if (C4587.m13638(this.mEdgeGlowTop) != 0.0f) {
            if (m29604(this.mEdgeGlowTop, i)) {
                this.mEdgeGlowTop.onAbsorb(i);
            } else {
                fling(-i);
            }
        } else {
            if (C4587.m13638(this.mEdgeGlowBottom) == 0.0f) {
                return false;
            }
            int i2 = -i;
            if (m29604(this.mEdgeGlowBottom, i2)) {
                this.mEdgeGlowBottom.onAbsorb(i2);
            } else {
                fling(i2);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m29585() {
        this.mActivePointerId = -1;
        this.mIsBeingDragged = false;
        m29597();
        stopNestedScroll(0);
        this.mEdgeGlowTop.onRelease();
        this.mEdgeGlowBottom.onRelease();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View m29586(boolean z, int i, int i2) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = focusables.get(i3);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i < bottom && top < i2) {
                boolean z3 = i < top && bottom < i2;
                if (view == null) {
                    view = view2;
                    z2 = z3;
                } else {
                    boolean z4 = (z && top < view.getTop()) || (!z && bottom > view.getBottom());
                    if (z2) {
                        if (z3 && z4) {
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z2 = true;
                    } else if (z4) {
                    }
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final float m29587(int i) {
        double dLog = Math.log((Math.abs(i) * INFLEXION) / (this.mPhysicalCoeff * SCROLL_FRICTION));
        float f = DECELERATION_RATE;
        return (float) (((double) (this.mPhysicalCoeff * SCROLL_FRICTION)) * Math.exp((((double) f) / (((double) f) - 1.0d)) * dLog));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m29588(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m29589() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m29590() {
        this.mScroller = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m29591() {
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m29592(int i, int i2) {
        this.mLastMotionY = i;
        this.mActivePointerId = i2;
        startNestedScroll(2, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final boolean m29593(View view) {
        return !m29594(view, 0, getHeight());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final boolean m29594(View view, int i, int i2) {
        view.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        return this.mTempRect.bottom + i >= getScrollY() && this.mTempRect.top - i <= getScrollY() + i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m29595(int i, int i2, @InterfaceC6490 int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.mChildHelper.m19872(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m29596(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mLastMotionY = (int) motionEvent.getY(i);
            this.mActivePointerId = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m29597() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m29598(int i, float f) {
        float fM13640;
        int iRound;
        float width = f / getWidth();
        float height = i / getHeight();
        float f2 = 0.0f;
        if (C4587.m13638(this.mEdgeGlowTop) == 0.0f) {
            if (C4587.m13638(this.mEdgeGlowBottom) != 0.0f) {
                fM13640 = C4587.m13640(this.mEdgeGlowBottom, height, 1.0f - width);
                if (C4587.m13638(this.mEdgeGlowBottom) == 0.0f) {
                    this.mEdgeGlowBottom.onRelease();
                }
            }
            iRound = Math.round(f2 * getHeight());
            if (iRound != 0) {
                invalidate();
            }
            return iRound;
        }
        fM13640 = -C4587.m13640(this.mEdgeGlowTop, -height, width);
        if (C4587.m13638(this.mEdgeGlowTop) == 0.0f) {
            this.mEdgeGlowTop.onRelease();
        }
        f2 = fM13640;
        iRound = Math.round(f2 * getHeight());
        if (iRound != 0) {
        }
        return iRound;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void m29599(boolean z) {
        if (z) {
            startNestedScroll(2, 1);
        } else {
            stopNestedScroll(1);
        }
        this.mLastScrollerY = getScrollY();
        postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final boolean m29600(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = false;
        boolean z2 = i == 33;
        View viewM29586 = m29586(z2, i2, i3);
        if (viewM29586 == null) {
            viewM29586 = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m29601(z2 ? i2 - scrollY : i3 - i4, 0, 1, true);
            z = true;
        }
        if (viewM29586 != findFocus()) {
            viewM29586.requestFocus(i);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final int m29601(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        VelocityTracker velocityTracker;
        if (i3 == 1) {
            startNestedScroll(2, i3);
        }
        boolean z2 = false;
        if (dispatchNestedPreScroll(0, i, this.mScrollConsumed, this.mScrollOffset, i3)) {
            i4 = i - this.mScrollConsumed[1];
            i5 = this.mScrollOffset[1];
        } else {
            i4 = i;
            i5 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z3 = m4764() && !z;
        boolean z4 = overScrollByCompat(0, i4, 0, scrollY, 0, scrollRange, 0, 0, true) && !hasNestedScrollingParent(i3);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.mScrollConsumed;
        iArr[1] = 0;
        dispatchNestedScroll(0, scrollY2, 0, i4 - scrollY2, this.mScrollOffset, i3, iArr);
        int i6 = i5 + this.mScrollOffset[1];
        int i7 = i4 - this.mScrollConsumed[1];
        int i8 = scrollY + i7;
        if (i8 < 0) {
            if (z3) {
                C4587.m13640(this.mEdgeGlowTop, (-i7) / getHeight(), i2 / getWidth());
                if (!this.mEdgeGlowBottom.isFinished()) {
                    this.mEdgeGlowBottom.onRelease();
                }
            }
        } else if (i8 > scrollRange && z3) {
            C4587.m13640(this.mEdgeGlowBottom, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!this.mEdgeGlowTop.isFinished()) {
                this.mEdgeGlowTop.onRelease();
            }
        }
        if (this.mEdgeGlowTop.isFinished() && this.mEdgeGlowBottom.isFinished()) {
            z2 = z4;
        } else {
            postInvalidateOnAnimation();
        }
        if (z2 && i3 == 0 && (velocityTracker = this.mVelocityTracker) != null) {
            velocityTracker.clear();
        }
        if (i3 == 1) {
            stopNestedScroll(i3);
            this.mEdgeGlowTop.onRelease();
            this.mEdgeGlowBottom.onRelease();
        }
        return i6;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m29602(View view) {
        view.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(this.mTempRect);
        if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final boolean m29603(Rect rect, boolean z) {
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        boolean z2 = iComputeScrollDeltaToGetChildRectOnScreen != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
            } else {
                smoothScrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final boolean m29604(@InterfaceC6391 EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        return m29587(-i) < C4587.m13638(edgeEffect) * ((float) getHeight());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final void m29605(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.mLastScroll > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.mScroller.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, i3);
            m29599(z);
        } else {
            if (!this.mScroller.isFinished()) {
                m4763();
            }
            scrollBy(i, i2);
        }
        this.mLastScroll = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final boolean m29606(MotionEvent motionEvent) {
        boolean z;
        if (C4587.m13638(this.mEdgeGlowTop) != 0.0f) {
            C4587.m13640(this.mEdgeGlowTop, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (C4587.m13638(this.mEdgeGlowBottom) == 0.0f) {
            return z;
        }
        C4587.m13640(this.mEdgeGlowBottom, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public NestedScrollView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C6989.C1132.f20964);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.View, Yue.InterfaceC6365
    public boolean dispatchNestedPreScroll(int i, int i2, @InterfaceC6490 int[] iArr, @InterfaceC6490 int[] iArr2) {
        return dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC6363
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @InterfaceC6490 int[] iArr, int i5) {
        return this.mChildHelper.m19874(i, i2, i3, i4, iArr, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.View, Yue.InterfaceC6365
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC6369
    public void onNestedPreScroll(@InterfaceC6391 View view, int i, int i2, @InterfaceC6391 int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC6367
    public void onNestedScroll(@InterfaceC6391 View view, int i, int i2, int i3, int i4, int i5) {
        m29595(i4, i5, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC6369
    public boolean onStartNestedScroll(@InterfaceC6391 View view, @InterfaceC6391 View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void smoothScrollBy(int i, int i2, int i3) {
        m29605(i, i2, i3, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final void smoothScrollTo(int i, int i2, int i3) {
        smoothScrollTo(i, i2, i3, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.View, Yue.InterfaceC6365
    public boolean startNestedScroll(int i) {
        return startNestedScroll(i, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.View, Yue.InterfaceC6365
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public NestedScrollView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTempRect = new Rect();
        this.mIsLayoutDirty = true;
        this.mIsLaidOut = false;
        this.mChildToScrollTo = null;
        this.mIsBeingDragged = false;
        this.mSmoothScrollingEnabled = true;
        this.mActivePointerId = -1;
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        C8803 c8803 = new C8803();
        this.mDifferentialMotionFlingTarget = c8803;
        this.mDifferentialMotionFlingController = new C4396(getContext(), c8803);
        this.mEdgeGlowTop = C4587.m1545(context, attributeSet);
        this.mEdgeGlowBottom = C4587.m1545(context, attributeSet);
        this.mPhysicalCoeff = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        m29590();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SCROLLVIEW_STYLEABLE, i, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.mParentHelper = new C6370(this);
        this.mChildHelper = new C6366(this);
        setNestedScrollingEnabled(true);
        C8273.m27439(this, ACCESSIBILITY_DELEGATE);
    }

    @Override // android.view.View, Yue.InterfaceC6365
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @InterfaceC6490 int[] iArr) {
        return this.mChildHelper.m19873(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC6369
    public void onNestedScroll(@InterfaceC6391 View view, int i, int i2, int i3, int i4) {
        m29595(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC6369
    public void onNestedScrollAccepted(@InterfaceC6391 View view, @InterfaceC6391 View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, Yue.InterfaceC6369
    public void onStopNestedScroll(@InterfaceC6391 View view) {
        onStopNestedScroll(view, 0);
    }

    public void smoothScrollTo(int i, int i2, boolean z) {
        smoothScrollTo(i, i2, 250, z);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void smoothScrollTo(int i, int i2, int i3, boolean z) {
        m29605(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
