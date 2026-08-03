package com.google.android.material.carousel;

import Yue.C3913;
import Yue.C6132;
import Yue.C6740;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import Yue.InterfaceC8392;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.C8983;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C1980R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.carousel.KeylineState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends RecyclerView.AbstractC8919 implements Carousel, RecyclerView.AbstractC8934.InterfaceC1753 {
    public static final int ALIGNMENT_CENTER = 1;
    public static final int ALIGNMENT_START = 0;
    public static final int HORIZONTAL = 0;
    private static final String TAG = "CarouselLayoutManager";
    public static final int VERTICAL = 1;
    private int carouselAlignment;

    @InterfaceC6391
    private CarouselStrategy carouselStrategy;
    private int currentEstimatedPosition;
    private int currentFillStartPosition;

    @InterfaceC6490
    private KeylineState currentKeylineState;
    private final DebugItemDecoration debugItemDecoration;
    private boolean isDebuggingEnabled;

    @InterfaceC6490
    private KeylineStateList keylineStateList;

    @InterfaceC6490
    private Map<Integer, KeylineState> keylineStatePositionMap;
    private int lastItemCount;

    @InterfaceC8392
    int maxScroll;

    @InterfaceC8392
    int minScroll;
    private CarouselOrientationHelper orientationHelper;
    private final View.OnLayoutChangeListener recyclerViewSizeChangeListener;

    @InterfaceC8392
    int scrollOffset;

    public static final class ChildCalculations {
        final float center;
        final View child;
        final float offsetCenter;
        final KeylineRange range;

        public ChildCalculations(View view, float f, float f2, KeylineRange keylineRange) {
            this.child = view;
            this.center = f;
            this.offsetCenter = f2;
            this.range = keylineRange;
        }
    }

    public static class DebugItemDecoration extends RecyclerView.AbstractC8918 {
        private List<KeylineState.Keyline> keylines;
        private final Paint linePaint;

        public DebugItemDecoration() {
            Paint paint = new Paint();
            this.linePaint = paint;
            this.keylines = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8918
        public void onDrawOver(@InterfaceC6391 Canvas canvas, @InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 RecyclerView.C8935 c8935) {
            super.onDrawOver(canvas, recyclerView, c8935);
            this.linePaint.setStrokeWidth(recyclerView.getResources().getDimension(C1980R.dimen.m3_carousel_debug_keyline_width));
            for (KeylineState.Keyline keyline : this.keylines) {
                this.linePaint.setColor(C3913.m11153(-65281, -16776961, keyline.mask));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).isHorizontal()) {
                    canvas.drawLine(keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentTop(), keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentBottom(), this.linePaint);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentLeft(), keyline.locOffset, ((CarouselLayoutManager) recyclerView.getLayoutManager()).getParentRight(), keyline.locOffset, this.linePaint);
                }
            }
        }

        public void setKeylines(List<KeylineState.Keyline> list) {
            this.keylines = Collections.unmodifiableList(list);
        }
    }

    public static class KeylineRange {
        final KeylineState.Keyline leftOrTop;
        final KeylineState.Keyline rightOrBottom;

        public KeylineRange(KeylineState.Keyline keyline, KeylineState.Keyline keyline2) {
            C6740.m3226(keyline.loc <= keyline2.loc);
            this.leftOrTop = keyline;
            this.rightOrBottom = keyline2;
        }
    }

    public static class LayoutDirection {
        private static final int INVALID_LAYOUT = Integer.MIN_VALUE;
        private static final int LAYOUT_END = 1;
        private static final int LAYOUT_START = -1;

        private LayoutDirection() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public CarouselLayoutManager() {
        this(new MultiBrowseCarouselStrategy());
    }

    private void addAndLayoutView(View view, int i, ChildCalculations childCalculations) {
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        addView(view, i);
        float f = childCalculations.offsetCenter;
        this.orientationHelper.layoutDecoratedWithMargins(view, (int) (f - itemSize), (int) (f + itemSize));
        updateChildMaskForLocation(view, childCalculations.center, childCalculations.range);
    }

    private float addEnd(float f, float f2) {
        return isLayoutRtl() ? f - f2 : f + f2;
    }

    private float addStart(float f, float f2) {
        return isLayoutRtl() ? f + f2 : f - f2;
    }

    private void addViewAtPosition(@InterfaceC6391 RecyclerView.C8929 c8929, int i, int i2) {
        if (i < 0 || i >= getItemCount()) {
            return;
        }
        ChildCalculations childCalculationsMakeChildCalculations = makeChildCalculations(c8929, calculateChildStartForFill(i), i);
        addAndLayoutView(childCalculationsMakeChildCalculations.child, i2, childCalculationsMakeChildCalculations);
    }

    private void addViewsEnd(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935, int i) {
        float fCalculateChildStartForFill = calculateChildStartForFill(i);
        while (i < c8935.m30375()) {
            ChildCalculations childCalculationsMakeChildCalculations = makeChildCalculations(c8929, fCalculateChildStartForFill, i);
            if (isLocOffsetOutOfFillBoundsEnd(childCalculationsMakeChildCalculations.offsetCenter, childCalculationsMakeChildCalculations.range)) {
                return;
            }
            fCalculateChildStartForFill = addEnd(fCalculateChildStartForFill, this.currentKeylineState.getItemSize());
            if (!isLocOffsetOutOfFillBoundsStart(childCalculationsMakeChildCalculations.offsetCenter, childCalculationsMakeChildCalculations.range)) {
                addAndLayoutView(childCalculationsMakeChildCalculations.child, -1, childCalculationsMakeChildCalculations);
            }
            i++;
        }
    }

    private void addViewsStart(RecyclerView.C8929 c8929, int i) {
        float fCalculateChildStartForFill = calculateChildStartForFill(i);
        while (i >= 0) {
            ChildCalculations childCalculationsMakeChildCalculations = makeChildCalculations(c8929, fCalculateChildStartForFill, i);
            if (isLocOffsetOutOfFillBoundsStart(childCalculationsMakeChildCalculations.offsetCenter, childCalculationsMakeChildCalculations.range)) {
                return;
            }
            fCalculateChildStartForFill = addStart(fCalculateChildStartForFill, this.currentKeylineState.getItemSize());
            if (!isLocOffsetOutOfFillBoundsEnd(childCalculationsMakeChildCalculations.offsetCenter, childCalculationsMakeChildCalculations.range)) {
                addAndLayoutView(childCalculationsMakeChildCalculations.child, 0, childCalculationsMakeChildCalculations);
            }
            i--;
        }
    }

    private float calculateChildOffsetCenterForLocation(View view, float f, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.leftOrTop;
        float f2 = keyline.locOffset;
        KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
        float fLerp = AnimationUtils.lerp(f2, keyline2.locOffset, keyline.loc, keyline2.loc, f);
        if (keylineRange.rightOrBottom != this.currentKeylineState.getFirstKeyline() && keylineRange.leftOrTop != this.currentKeylineState.getLastKeyline()) {
            return fLerp;
        }
        float maskMargins = this.orientationHelper.getMaskMargins((RecyclerView.C8922) view.getLayoutParams()) / this.currentKeylineState.getItemSize();
        KeylineState.Keyline keyline3 = keylineRange.rightOrBottom;
        return fLerp + ((f - keyline3.loc) * ((1.0f - keyline3.mask) + maskMargins));
    }

    private float calculateChildStartForFill(int i) {
        return addEnd(getParentStart() - this.scrollOffset, this.currentKeylineState.getItemSize() * i);
    }

    private int calculateEndScroll(RecyclerView.C8935 c8935, KeylineStateList keylineStateList) {
        boolean zIsLayoutRtl = isLayoutRtl();
        KeylineState startState = zIsLayoutRtl ? keylineStateList.getStartState() : keylineStateList.getEndState();
        KeylineState.Keyline firstFocalKeyline = zIsLayoutRtl ? startState.getFirstFocalKeyline() : startState.getLastFocalKeyline();
        int iM30375 = (int) (((((c8935.m30375() - 1) * startState.getItemSize()) * (zIsLayoutRtl ? -1.0f : 1.0f)) - (firstFocalKeyline.loc - getParentStart())) + (getParentEnd() - firstFocalKeyline.loc) + (zIsLayoutRtl ? -firstFocalKeyline.leftOrTopPaddingShift : firstFocalKeyline.rightOrBottomPaddingShift));
        return zIsLayoutRtl ? Math.min(0, iM30375) : Math.max(0, iM30375);
    }

    private static int calculateShouldScrollBy(int i, int i2, int i3, int i4) {
        int i5 = i2 + i;
        return i5 < i3 ? i3 - i2 : i5 > i4 ? i4 - i2 : i;
    }

    private int calculateStartScroll(@InterfaceC6391 KeylineStateList keylineStateList) {
        boolean zIsLayoutRtl = isLayoutRtl();
        KeylineState endState = zIsLayoutRtl ? keylineStateList.getEndState() : keylineStateList.getStartState();
        return (int) (getParentStart() - addStart((zIsLayoutRtl ? endState.getLastFocalKeyline() : endState.getFirstFocalKeyline()).loc, endState.getItemSize() / 2.0f));
    }

    private int convertFocusDirectionToLayoutDirection(int i) {
        int orientation = getOrientation();
        if (i == 1) {
            return -1;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 17) {
            if (orientation == 0) {
                return isLayoutRtl() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i == 33) {
            return orientation == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 66) {
            if (orientation == 0) {
                return isLayoutRtl() ? -1 : 1;
            }
            return Integer.MIN_VALUE;
        }
        if (i == 130) {
            return orientation == 1 ? 1 : Integer.MIN_VALUE;
        }
        Log.d(TAG, "Unknown focus request:" + i);
        return Integer.MIN_VALUE;
    }

    private void fill(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        removeAndRecycleOutOfBoundsViews(c8929);
        if (getChildCount() == 0) {
            addViewsStart(c8929, this.currentFillStartPosition - 1);
            addViewsEnd(c8929, c8935, this.currentFillStartPosition);
        } else {
            int position = getPosition(getChildAt(0));
            int position2 = getPosition(getChildAt(getChildCount() - 1));
            addViewsStart(c8929, position - 1);
            addViewsEnd(c8929, c8935, position2 + 1);
        }
        validateChildOrderIfDebugging();
    }

    private View getChildClosestToEnd() {
        return getChildAt(isLayoutRtl() ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(isLayoutRtl() ? getChildCount() - 1 : 0);
    }

    private int getContainerSize() {
        return isHorizontal() ? getContainerWidth() : getContainerHeight();
    }

    private float getDecoratedCenterWithMargins(View view) {
        super.getDecoratedBoundsWithMargins(view, new Rect());
        return isHorizontal() ? r0.centerX() : r0.centerY();
    }

    private int getItemMargins() {
        int i;
        int i2;
        if (getChildCount() <= 0) {
            return 0;
        }
        RecyclerView.C8922 c8922 = (RecyclerView.C8922) getChildAt(0).getLayoutParams();
        if (this.orientationHelper.orientation == 0) {
            i = ((ViewGroup.MarginLayoutParams) c8922).leftMargin;
            i2 = ((ViewGroup.MarginLayoutParams) c8922).rightMargin;
        } else {
            i = ((ViewGroup.MarginLayoutParams) c8922).topMargin;
            i2 = ((ViewGroup.MarginLayoutParams) c8922).bottomMargin;
        }
        return i + i2;
    }

    private KeylineState getKeylineStateForPosition(int i) {
        KeylineState keylineState;
        Map<Integer, KeylineState> map = this.keylineStatePositionMap;
        return (map == null || (keylineState = map.get(Integer.valueOf(C6132.m18838(i, 0, Math.max(0, getItemCount() + (-1)))))) == null) ? this.keylineStateList.getDefaultState() : keylineState;
    }

    private int getLeftOrTopPaddingForKeylineShift() {
        if (getClipToPadding() || !this.carouselStrategy.isContained()) {
            return 0;
        }
        return getOrientation() == 1 ? getPaddingTop() : getPaddingLeft();
    }

    private float getMaskedItemSizeForLocOffset(float f, KeylineRange keylineRange) {
        KeylineState.Keyline keyline = keylineRange.leftOrTop;
        float f2 = keyline.maskedItemSize;
        KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
        return AnimationUtils.lerp(f2, keyline2.maskedItemSize, keyline.locOffset, keyline2.locOffset, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentBottom() {
        return this.orientationHelper.getParentBottom();
    }

    private int getParentEnd() {
        return this.orientationHelper.getParentEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentLeft() {
        return this.orientationHelper.getParentLeft();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentRight() {
        return this.orientationHelper.getParentRight();
    }

    private int getParentStart() {
        return this.orientationHelper.getParentStart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getParentTop() {
        return this.orientationHelper.getParentTop();
    }

    private int getRightOrBottomPaddingForKeylineShift() {
        if (getClipToPadding() || !this.carouselStrategy.isContained()) {
            return 0;
        }
        return getOrientation() == 1 ? getPaddingBottom() : getPaddingRight();
    }

    private int getScrollOffsetForPosition(int i, KeylineState keylineState) {
        return isLayoutRtl() ? (int) (((getContainerSize() - keylineState.getLastFocalKeyline().loc) - (i * keylineState.getItemSize())) - (keylineState.getItemSize() / 2.0f)) : (int) (((i * keylineState.getItemSize()) - keylineState.getFirstFocalKeyline().loc) + (keylineState.getItemSize() / 2.0f));
    }

    private int getSmallestScrollOffsetToFocalKeyline(int i, @InterfaceC6391 KeylineState keylineState) {
        int i2 = Integer.MAX_VALUE;
        for (KeylineState.Keyline keyline : keylineState.getFocalKeylines()) {
            float itemSize = (i * keylineState.getItemSize()) + (keylineState.getItemSize() / 2.0f);
            int containerSize = (isLayoutRtl() ? (int) ((getContainerSize() - keyline.loc) - itemSize) : (int) (itemSize - keyline.loc)) - this.scrollOffset;
            if (Math.abs(i2) > Math.abs(containerSize)) {
                i2 = containerSize;
            }
        }
        return i2;
    }

    private static KeylineRange getSurroundingKeylineRange(List<KeylineState.Keyline> list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            KeylineState.Keyline keyline = list.get(i5);
            float f6 = z ? keyline.locOffset : keyline.loc;
            float fAbs = Math.abs(f6 - f);
            if (f6 <= f && fAbs <= f2) {
                i = i5;
                f2 = fAbs;
            }
            if (f6 > f && fAbs <= f4) {
                i3 = i5;
                f4 = fAbs;
            }
            if (f6 <= f5) {
                i2 = i5;
                f5 = f6;
            }
            if (f6 > f3) {
                i4 = i5;
                f3 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new KeylineRange(list.get(i), list.get(i3));
    }

    private boolean isLocOffsetOutOfFillBoundsEnd(float f, KeylineRange keylineRange) {
        float fAddStart = addStart(f, getMaskedItemSizeForLocOffset(f, keylineRange) / 2.0f);
        if (isLayoutRtl()) {
            if (fAddStart >= 0.0f) {
                return false;
            }
        } else if (fAddStart <= getContainerSize()) {
            return false;
        }
        return true;
    }

    private boolean isLocOffsetOutOfFillBoundsStart(float f, KeylineRange keylineRange) {
        float fAddEnd = addEnd(f, getMaskedItemSizeForLocOffset(f, keylineRange) / 2.0f);
        if (isLayoutRtl()) {
            if (fAddEnd <= getContainerSize()) {
                return false;
            }
        } else if (fAddEnd >= 0.0f) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        view.post(new Runnable() { // from class: Yue.ۥ۟ۤ۟ۤ
            @Override // java.lang.Runnable
            public final void run() {
                this.f6501.refreshKeylineState();
            }
        });
    }

    private void logChildrenIfDebugging() {
        if (this.isDebuggingEnabled && Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "internal representation of views on the screen");
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                Log.d(TAG, "item position " + getPosition(childAt) + ", center:" + getDecoratedCenterWithMargins(childAt) + ", child index:" + i);
            }
            Log.d(TAG, "==============");
        }
    }

    private ChildCalculations makeChildCalculations(RecyclerView.C8929 c8929, float f, int i) {
        View viewM30337 = c8929.m30337(i);
        measureChildWithMargins(viewM30337, 0, 0);
        float fAddEnd = addEnd(f, this.currentKeylineState.getItemSize() / 2.0f);
        KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), fAddEnd, false);
        return new ChildCalculations(viewM30337, fAddEnd, calculateChildOffsetCenterForLocation(viewM30337, fAddEnd, surroundingKeylineRange), surroundingKeylineRange);
    }

    private float offsetChild(View view, float f, float f2, Rect rect) {
        float fAddEnd = addEnd(f, f2);
        KeylineRange surroundingKeylineRange = getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), fAddEnd, false);
        float fCalculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(view, fAddEnd, surroundingKeylineRange);
        super.getDecoratedBoundsWithMargins(view, rect);
        updateChildMaskForLocation(view, fAddEnd, surroundingKeylineRange);
        this.orientationHelper.offsetChild(view, rect, f2, fCalculateChildOffsetCenterForLocation);
        return fCalculateChildOffsetCenterForLocation;
    }

    private void recalculateKeylineStateList(RecyclerView.C8929 c8929) {
        View viewM30337 = c8929.m30337(0);
        measureChildWithMargins(viewM30337, 0, 0);
        KeylineState keylineStateOnFirstChildMeasuredWithMargins = this.carouselStrategy.onFirstChildMeasuredWithMargins(this, viewM30337);
        if (isLayoutRtl()) {
            keylineStateOnFirstChildMeasuredWithMargins = KeylineState.reverse(keylineStateOnFirstChildMeasuredWithMargins, getContainerSize());
        }
        this.keylineStateList = KeylineStateList.from(this, keylineStateOnFirstChildMeasuredWithMargins, getItemMargins(), getLeftOrTopPaddingForKeylineShift(), getRightOrBottomPaddingForKeylineShift());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshKeylineState() {
        this.keylineStateList = null;
        requestLayout();
    }

    private void removeAndRecycleOutOfBoundsViews(RecyclerView.C8929 c8929) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            float decoratedCenterWithMargins = getDecoratedCenterWithMargins(childAt);
            if (!isLocOffsetOutOfFillBoundsStart(decoratedCenterWithMargins, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterWithMargins, true))) {
                break;
            } else {
                removeAndRecycleView(childAt, c8929);
            }
        }
        while (getChildCount() - 1 >= 0) {
            View childAt2 = getChildAt(getChildCount() - 1);
            float decoratedCenterWithMargins2 = getDecoratedCenterWithMargins(childAt2);
            if (!isLocOffsetOutOfFillBoundsEnd(decoratedCenterWithMargins2, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), decoratedCenterWithMargins2, true))) {
                return;
            } else {
                removeAndRecycleView(childAt2, c8929);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void scrollBy(RecyclerView recyclerView, int i) {
        if (isHorizontal()) {
            recyclerView.scrollBy(i, 0);
        } else {
            recyclerView.scrollBy(0, i);
        }
    }

    private void setCarouselAttributes(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1980R.styleable.Carousel);
            setCarouselAlignment(typedArrayObtainStyledAttributes.getInt(C1980R.styleable.Carousel_carousel_alignment, 0));
            setOrientation(typedArrayObtainStyledAttributes.getInt(C1980R.styleable.RecyclerView_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    private void updateChildMaskForLocation(View view, float f, KeylineRange keylineRange) {
        if (view instanceof Maskable) {
            KeylineState.Keyline keyline = keylineRange.leftOrTop;
            float f2 = keyline.mask;
            KeylineState.Keyline keyline2 = keylineRange.rightOrBottom;
            float fLerp = AnimationUtils.lerp(f2, keyline2.mask, keyline.loc, keyline2.loc, f);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF maskRect = this.orientationHelper.getMaskRect(height, width, AnimationUtils.lerp(0.0f, height / 2.0f, 0.0f, 1.0f, fLerp), AnimationUtils.lerp(0.0f, width / 2.0f, 0.0f, 1.0f, fLerp));
            float fCalculateChildOffsetCenterForLocation = calculateChildOffsetCenterForLocation(view, f, keylineRange);
            RectF rectF = new RectF(fCalculateChildOffsetCenterForLocation - (maskRect.width() / 2.0f), fCalculateChildOffsetCenterForLocation - (maskRect.height() / 2.0f), fCalculateChildOffsetCenterForLocation + (maskRect.width() / 2.0f), (maskRect.height() / 2.0f) + fCalculateChildOffsetCenterForLocation);
            RectF rectF2 = new RectF(getParentLeft(), getParentTop(), getParentRight(), getParentBottom());
            if (this.carouselStrategy.isContained()) {
                this.orientationHelper.containMaskWithinBounds(maskRect, rectF, rectF2);
            }
            this.orientationHelper.moveMaskOnEdgeOutsideBounds(maskRect, rectF, rectF2);
            ((Maskable) view).setMaskRectF(maskRect);
        }
    }

    private void updateCurrentKeylineStateForScrollOffset(@InterfaceC6391 KeylineStateList keylineStateList) {
        int i = this.maxScroll;
        int i2 = this.minScroll;
        if (i <= i2) {
            this.currentKeylineState = isLayoutRtl() ? keylineStateList.getEndState() : keylineStateList.getStartState();
        } else {
            this.currentKeylineState = keylineStateList.getShiftedState(this.scrollOffset, i2, i);
        }
        this.debugItemDecoration.setKeylines(this.currentKeylineState.getKeylines());
    }

    private void updateItemCount() {
        int itemCount = getItemCount();
        int i = this.lastItemCount;
        if (itemCount == i || this.keylineStateList == null) {
            return;
        }
        if (this.carouselStrategy.shouldRefreshKeylineState(this, i)) {
            refreshKeylineState();
        }
        this.lastItemCount = itemCount;
    }

    private void validateChildOrderIfDebugging() {
        if (!this.isDebuggingEnabled || getChildCount() < 1) {
            return;
        }
        int i = 0;
        while (i < getChildCount() - 1) {
            int position = getPosition(getChildAt(i));
            int i2 = i + 1;
            int position2 = getPosition(getChildAt(i2));
            if (position > position2) {
                logChildrenIfDebugging();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i + "] had adapter position [" + position + "] and child at index [" + i2 + "] had adapter position [" + position2 + "].");
            }
            i = i2;
        }
    }

    public int calculateScrollDeltaToMakePositionVisible(int i) {
        return (int) (this.scrollOffset - getScrollOffsetForPosition(i, getKeylineStateForPosition(i)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public boolean canScrollHorizontally() {
        return isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public boolean canScrollVertically() {
        return !isHorizontal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int computeHorizontalScrollExtent(@InterfaceC6391 RecyclerView.C8935 c8935) {
        if (getChildCount() == 0 || this.keylineStateList == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getWidth() * (this.keylineStateList.getDefaultState().getItemSize() / computeHorizontalScrollRange(c8935)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int computeHorizontalScrollOffset(@InterfaceC6391 RecyclerView.C8935 c8935) {
        return this.scrollOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int computeHorizontalScrollRange(@InterfaceC6391 RecyclerView.C8935 c8935) {
        return this.maxScroll - this.minScroll;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8934.InterfaceC1753
    @InterfaceC6490
    public PointF computeScrollVectorForPosition(int i) {
        if (this.keylineStateList == null) {
            return null;
        }
        int offsetToScrollToPosition = getOffsetToScrollToPosition(i, getKeylineStateForPosition(i));
        return isHorizontal() ? new PointF(offsetToScrollToPosition, 0.0f) : new PointF(0.0f, offsetToScrollToPosition);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int computeVerticalScrollExtent(@InterfaceC6391 RecyclerView.C8935 c8935) {
        if (getChildCount() == 0 || this.keylineStateList == null || getItemCount() <= 1) {
            return 0;
        }
        return (int) (getHeight() * (this.keylineStateList.getDefaultState().getItemSize() / computeVerticalScrollRange(c8935)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int computeVerticalScrollOffset(@InterfaceC6391 RecyclerView.C8935 c8935) {
        return this.scrollOffset;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int computeVerticalScrollRange(@InterfaceC6391 RecyclerView.C8935 c8935) {
        return this.maxScroll - this.minScroll;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public RecyclerView.C8922 generateDefaultLayoutParams() {
        return new RecyclerView.C8922(-2, -2);
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getCarouselAlignment() {
        return this.carouselAlignment;
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerHeight() {
        return getHeight();
    }

    @Override // com.google.android.material.carousel.Carousel
    public int getContainerWidth() {
        return getWidth();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void getDecoratedBoundsWithMargins(@InterfaceC6391 View view, @InterfaceC6391 Rect rect) {
        super.getDecoratedBoundsWithMargins(view, rect);
        float fCenterY = rect.centerY();
        if (isHorizontal()) {
            fCenterY = rect.centerX();
        }
        float maskedItemSizeForLocOffset = getMaskedItemSizeForLocOffset(fCenterY, getSurroundingKeylineRange(this.currentKeylineState.getKeylines(), fCenterY, true));
        float fWidth = isHorizontal() ? (rect.width() - maskedItemSizeForLocOffset) / 2.0f : 0.0f;
        float fHeight = isHorizontal() ? 0.0f : (rect.height() - maskedItemSizeForLocOffset) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    public int getOffsetToScrollToPosition(int i, @InterfaceC6391 KeylineState keylineState) {
        return getScrollOffsetForPosition(i, keylineState) - this.scrollOffset;
    }

    public int getOffsetToScrollToPositionForSnap(int i, boolean z) {
        int offsetToScrollToPosition = getOffsetToScrollToPosition(i, this.keylineStateList.getShiftedState(this.scrollOffset, this.minScroll, this.maxScroll, true));
        int offsetToScrollToPosition2 = this.keylineStatePositionMap != null ? getOffsetToScrollToPosition(i, getKeylineStateForPosition(i)) : offsetToScrollToPosition;
        return (!z || Math.abs(offsetToScrollToPosition2) >= Math.abs(offsetToScrollToPosition)) ? offsetToScrollToPosition : offsetToScrollToPosition2;
    }

    public int getOrientation() {
        return this.orientationHelper.orientation;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // com.google.android.material.carousel.Carousel
    public boolean isHorizontal() {
        return this.orientationHelper.orientation == 0;
    }

    public boolean isLayoutRtl() {
        return isHorizontal() && getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void measureChildWithMargins(@InterfaceC6391 View view, int i, int i2) {
        if (!(view instanceof Maskable)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.C8922 c8922 = (RecyclerView.C8922) view.getLayoutParams();
        Rect rect = new Rect();
        calculateItemDecorationsForChild(view, rect);
        int i3 = i + rect.left + rect.right;
        int i4 = i2 + rect.top + rect.bottom;
        KeylineStateList keylineStateList = this.keylineStateList;
        float itemSize = (keylineStateList == null || this.orientationHelper.orientation != 0) ? ((ViewGroup.MarginLayoutParams) c8922).width : keylineStateList.getDefaultState().getItemSize();
        KeylineStateList keylineStateList2 = this.keylineStateList;
        view.measure(RecyclerView.AbstractC8919.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) c8922).leftMargin + ((ViewGroup.MarginLayoutParams) c8922).rightMargin + i3, (int) itemSize, canScrollHorizontally()), RecyclerView.AbstractC8919.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) c8922).topMargin + ((ViewGroup.MarginLayoutParams) c8922).bottomMargin + i4, (int) ((keylineStateList2 == null || this.orientationHelper.orientation != 1) ? ((ViewGroup.MarginLayoutParams) c8922).height : keylineStateList2.getDefaultState().getItemSize()), canScrollVertically()));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.carouselStrategy.initialize(recyclerView.getContext());
        refreshKeylineState();
        recyclerView.addOnLayoutChangeListener(this.recyclerViewSizeChangeListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C8929 c8929) {
        super.onDetachedFromWindow(recyclerView, c8929);
        recyclerView.removeOnLayoutChangeListener(this.recyclerViewSizeChangeListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    @InterfaceC6490
    public View onFocusSearchFailed(@InterfaceC6391 View view, int i, @InterfaceC6391 RecyclerView.C8929 c8929, @InterfaceC6391 RecyclerView.C8935 c8935) {
        int iConvertFocusDirectionToLayoutDirection;
        if (getChildCount() == 0 || (iConvertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iConvertFocusDirectionToLayoutDirection == -1) {
            if (getPosition(view) == 0) {
                return null;
            }
            addViewAtPosition(c8929, getPosition(getChildAt(0)) - 1, 0);
            return getChildClosestToStart();
        }
        if (getPosition(view) == getItemCount() - 1) {
            return null;
        }
        addViewAtPosition(c8929, getPosition(getChildAt(getChildCount() - 1)) + 1, -1);
        return getChildClosestToEnd();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onInitializeAccessibilityEvent(@InterfaceC6391 AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(getPosition(getChildAt(0)));
            accessibilityEvent.setToIndex(getPosition(getChildAt(getChildCount() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onItemsAdded(@InterfaceC6391 RecyclerView recyclerView, int i, int i2) {
        super.onItemsAdded(recyclerView, i, i2);
        updateItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onItemsRemoved(@InterfaceC6391 RecyclerView recyclerView, int i, int i2) {
        super.onItemsRemoved(recyclerView, i, i2);
        updateItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onLayoutChildren(RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        if (c8935.m30375() <= 0 || getContainerSize() <= 0.0f) {
            removeAndRecycleAllViews(c8929);
            this.currentFillStartPosition = 0;
            return;
        }
        boolean zIsLayoutRtl = isLayoutRtl();
        boolean z = this.keylineStateList == null;
        if (z) {
            recalculateKeylineStateList(c8929);
        }
        int iCalculateStartScroll = calculateStartScroll(this.keylineStateList);
        int iCalculateEndScroll = calculateEndScroll(c8935, this.keylineStateList);
        this.minScroll = zIsLayoutRtl ? iCalculateEndScroll : iCalculateStartScroll;
        if (zIsLayoutRtl) {
            iCalculateEndScroll = iCalculateStartScroll;
        }
        this.maxScroll = iCalculateEndScroll;
        if (z) {
            this.scrollOffset = iCalculateStartScroll;
            this.keylineStatePositionMap = this.keylineStateList.getKeylineStateForPositionMap(getItemCount(), this.minScroll, this.maxScroll, isLayoutRtl());
            int i = this.currentEstimatedPosition;
            if (i != -1) {
                this.scrollOffset = getScrollOffsetForPosition(i, getKeylineStateForPosition(i));
            }
        }
        int i2 = this.scrollOffset;
        this.scrollOffset = i2 + calculateShouldScrollBy(0, i2, this.minScroll, this.maxScroll);
        this.currentFillStartPosition = C6132.m18838(this.currentFillStartPosition, 0, c8935.m30375());
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        detachAndScrapAttachedViews(c8929);
        fill(c8929, c8935);
        this.lastItemCount = getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void onLayoutCompleted(RecyclerView.C8935 c8935) {
        super.onLayoutCompleted(c8935);
        if (getChildCount() == 0) {
            this.currentFillStartPosition = 0;
        } else {
            this.currentFillStartPosition = getPosition(getChildAt(0));
        }
        validateChildOrderIfDebugging();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public boolean requestChildRectangleOnScreen(@InterfaceC6391 RecyclerView recyclerView, @InterfaceC6391 View view, @InterfaceC6391 Rect rect, boolean z, boolean z2) {
        int smallestScrollOffsetToFocalKeyline;
        if (this.keylineStateList == null || (smallestScrollOffsetToFocalKeyline = getSmallestScrollOffsetToFocalKeyline(getPosition(view), getKeylineStateForPosition(getPosition(view)))) == 0) {
            return false;
        }
        scrollBy(recyclerView, getSmallestScrollOffsetToFocalKeyline(getPosition(view), this.keylineStateList.getShiftedState(this.scrollOffset + calculateShouldScrollBy(smallestScrollOffsetToFocalKeyline, this.scrollOffset, this.minScroll, this.maxScroll), this.minScroll, this.maxScroll)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int scrollHorizontallyBy(int i, RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        if (canScrollHorizontally()) {
            return scrollBy(i, c8929, c8935);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void scrollToPosition(int i) {
        this.currentEstimatedPosition = i;
        if (this.keylineStateList == null) {
            return;
        }
        this.scrollOffset = getScrollOffsetForPosition(i, getKeylineStateForPosition(i));
        this.currentFillStartPosition = C6132.m18838(i, 0, Math.max(0, getItemCount() - 1));
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public int scrollVerticallyBy(int i, RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        if (canScrollVertically()) {
            return scrollBy(i, c8929, c8935);
        }
        return 0;
    }

    public void setCarouselAlignment(int i) {
        this.carouselAlignment = i;
        refreshKeylineState();
    }

    public void setCarouselStrategy(@InterfaceC6391 CarouselStrategy carouselStrategy) {
        this.carouselStrategy = carouselStrategy;
        refreshKeylineState();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    public void setDebuggingEnabled(@InterfaceC6391 RecyclerView recyclerView, boolean z) {
        this.isDebuggingEnabled = z;
        recyclerView.removeItemDecoration(this.debugItemDecoration);
        if (z) {
            recyclerView.addItemDecoration(this.debugItemDecoration);
        }
        recyclerView.invalidateItemDecorations();
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        assertNotInLayoutOrScroll(null);
        CarouselOrientationHelper carouselOrientationHelper = this.orientationHelper;
        if (carouselOrientationHelper == null || i != carouselOrientationHelper.orientation) {
            this.orientationHelper = CarouselOrientationHelper.createOrientationHelper(this, i);
            refreshKeylineState();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8919
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C8935 c8935, int i) {
        C8983 c8983 = new C8983(recyclerView.getContext()) { // from class: com.google.android.material.carousel.CarouselLayoutManager.1
            @Override // androidx.recyclerview.widget.C8983
            public int calculateDxToMakeVisible(View view, int i2) {
                if (CarouselLayoutManager.this.keylineStateList == null || !CarouselLayoutManager.this.isHorizontal()) {
                    return 0;
                }
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                return carouselLayoutManager.calculateScrollDeltaToMakePositionVisible(carouselLayoutManager.getPosition(view));
            }

            @Override // androidx.recyclerview.widget.C8983
            public int calculateDyToMakeVisible(View view, int i2) {
                if (CarouselLayoutManager.this.keylineStateList == null || CarouselLayoutManager.this.isHorizontal()) {
                    return 0;
                }
                CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
                return carouselLayoutManager.calculateScrollDeltaToMakePositionVisible(carouselLayoutManager.getPosition(view));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8934
            @InterfaceC6490
            public PointF computeScrollVectorForPosition(int i2) {
                return CarouselLayoutManager.this.computeScrollVectorForPosition(i2);
            }
        };
        c8983.setTargetPosition(i);
        startSmoothScroll(c8983);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public CarouselLayoutManager(@InterfaceC6391 CarouselStrategy carouselStrategy) {
        this(carouselStrategy, 0);
    }

    public CarouselLayoutManager(@InterfaceC6391 CarouselStrategy carouselStrategy, int i) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new DebugItemDecoration();
        this.currentFillStartPosition = 0;
        this.recyclerViewSizeChangeListener = new View.OnLayoutChangeListener() { // from class: Yue.ۥ۟ۤ۟ۥ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.f457.lambda$new$0(view, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.currentEstimatedPosition = -1;
        this.carouselAlignment = 0;
        setCarouselStrategy(carouselStrategy);
        setOrientation(i);
    }

    private int scrollBy(int i, RecyclerView.C8929 c8929, RecyclerView.C8935 c8935) {
        float f;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        if (this.keylineStateList == null) {
            recalculateKeylineStateList(c8929);
        }
        int iCalculateShouldScrollBy = calculateShouldScrollBy(i, this.scrollOffset, this.minScroll, this.maxScroll);
        this.scrollOffset += iCalculateShouldScrollBy;
        updateCurrentKeylineStateForScrollOffset(this.keylineStateList);
        float itemSize = this.currentKeylineState.getItemSize() / 2.0f;
        float fCalculateChildStartForFill = calculateChildStartForFill(getPosition(getChildAt(0)));
        Rect rect = new Rect();
        if (isLayoutRtl()) {
            f = this.currentKeylineState.getLastFocalKeyline().locOffset;
        } else {
            f = this.currentKeylineState.getFirstFocalKeyline().locOffset;
        }
        float f2 = Float.MAX_VALUE;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            float fAbs = Math.abs(f - offsetChild(childAt, fCalculateChildStartForFill, itemSize, rect));
            if (childAt != null && fAbs < f2) {
                this.currentEstimatedPosition = getPosition(childAt);
                f2 = fAbs;
            }
            fCalculateChildStartForFill = addEnd(fCalculateChildStartForFill, this.currentKeylineState.getItemSize());
        }
        fill(c8929, c8935);
        return iCalculateShouldScrollBy;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.isDebuggingEnabled = false;
        this.debugItemDecoration = new DebugItemDecoration();
        this.currentFillStartPosition = 0;
        this.recyclerViewSizeChangeListener = new View.OnLayoutChangeListener() { // from class: Yue.ۥ۟ۤ۟ۥ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i22, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.f457.lambda$new$0(view, i22, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.currentEstimatedPosition = -1;
        this.carouselAlignment = 0;
        setCarouselStrategy(new MultiBrowseCarouselStrategy());
        setCarouselAttributes(context, attributeSet);
    }
}
