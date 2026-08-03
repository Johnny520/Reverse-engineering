package androidx.appcompat.widget;

import Yue.C5194;
import Yue.C5445;
import Yue.C6898;
import Yue.C7837;
import Yue.C8273;
import Yue.C8370;
import Yue.InterfaceC5195;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8754 extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟$ۥ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1631 {
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟$ۥ۟ */
    public static class C1632 extends LinearLayout.LayoutParams {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C1632(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1632(int i, int i2) {
            super(i, i2);
        }

        public C1632(int i, int i2, float f) {
            super(i, i2, f);
        }

        public C1632(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1632(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ۥ۟۟۟$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC8755 {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8754(@InterfaceC6391 Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    private void m29228(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                C1632 c1632 = (C1632) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) c1632).width == -1) {
                    int i4 = ((LinearLayout.LayoutParams) c1632).height;
                    ((LinearLayout.LayoutParams) c1632).height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, iMakeMeasureSpec, 0, i2, 0);
                    ((LinearLayout.LayoutParams) c1632).height = i4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    private void m29229(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1632;
    }

    public void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i;
        int virtualChildCount = getVirtualChildCount();
        boolean zM4344 = C8370.m4344(this);
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View virtualChildAt = getVirtualChildAt(i2);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i2)) {
                C1632 c1632 = (C1632) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, zM4344 ? virtualChildAt.getRight() + ((LinearLayout.LayoutParams) c1632).rightMargin : (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) c1632).leftMargin) - this.mDividerWidth);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                C1632 c16322 = (C1632) virtualChildAt2.getLayoutParams();
                if (zM4344) {
                    left = virtualChildAt2.getLeft() - ((LinearLayout.LayoutParams) c16322).leftMargin;
                    i = this.mDividerWidth;
                    right = left - i;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) c16322).rightMargin;
                }
            } else if (zM4344) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.mDividerWidth;
                right = left - i;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View virtualChildAt = getVirtualChildAt(i);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((C1632) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            drawHorizontalDivider(canvas, virtualChildAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((C1632) virtualChildAt2.getLayoutParams())).bottomMargin);
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.mBaselineAlignedChildIndex;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i = this.mGravity & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.mTotalLength) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C1632) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    @InterfaceC5195
    public int getGravity() {
        return this.mGravity;
    }

    public int getLocationOffset(View view) {
        return 0;
    }

    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        }
        if ((this.mShowDividers & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void layoutHorizontal(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        int i10;
        int i11;
        int measuredHeight;
        boolean zM4344 = C8370.m4344(this);
        int paddingTop = getPaddingTop();
        int i12 = i4 - i2;
        int paddingBottom = i12 - getPaddingBottom();
        int paddingBottom2 = (i12 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i13 = this.mGravity;
        int i14 = i13 & 112;
        boolean z2 = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int iM15901 = C5194.m15901(8388615 & i13, getLayoutDirection());
        boolean z3 = true;
        int paddingLeft = iM15901 != 1 ? iM15901 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.mTotalLength : getPaddingLeft() + (((i3 - i) - this.mTotalLength) / 2);
        if (zM4344) {
            i5 = virtualChildCount - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int childrenSkipCount = 0;
        while (childrenSkipCount < virtualChildCount) {
            int i15 = i5 + (i6 * childrenSkipCount);
            View virtualChildAt = getVirtualChildAt(i15);
            if (virtualChildAt == null) {
                paddingLeft += measureNullChild(i15);
                z = z3;
                i7 = paddingTop;
                i8 = virtualChildCount;
                i9 = i14;
            } else if (virtualChildAt.getVisibility() != 8) {
                int measuredWidth = virtualChildAt.getMeasuredWidth();
                int measuredHeight2 = virtualChildAt.getMeasuredHeight();
                C1632 c1632 = (C1632) virtualChildAt.getLayoutParams();
                int i16 = childrenSkipCount;
                if (z2) {
                    i8 = virtualChildCount;
                    int baseline = ((LinearLayout.LayoutParams) c1632).height != -1 ? virtualChildAt.getBaseline() : -1;
                    i10 = ((LinearLayout.LayoutParams) c1632).gravity;
                    if (i10 < 0) {
                        i10 = i14;
                    }
                    i11 = i10 & 112;
                    i9 = i14;
                    if (i11 == 16) {
                        if (i11 == 48) {
                            measuredHeight = ((LinearLayout.LayoutParams) c1632).topMargin + paddingTop;
                            if (baseline != -1) {
                                z = true;
                                measuredHeight += iArr[1] - baseline;
                            }
                        } else if (i11 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) c1632).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (virtualChildAt.getMeasuredHeight() - baseline);
                            }
                        }
                        z = true;
                    } else {
                        z = true;
                        measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((LinearLayout.LayoutParams) c1632).topMargin) - ((LinearLayout.LayoutParams) c1632).bottomMargin;
                    }
                    if (hasDividerBeforeChildAt(i15)) {
                        paddingLeft += this.mDividerWidth;
                    }
                    int i17 = ((LinearLayout.LayoutParams) c1632).leftMargin + paddingLeft;
                    i7 = paddingTop;
                    m29229(virtualChildAt, i17 + getLocationOffset(virtualChildAt), measuredHeight, measuredWidth, measuredHeight2);
                    int nextLocationOffset = i17 + measuredWidth + ((LinearLayout.LayoutParams) c1632).rightMargin + getNextLocationOffset(virtualChildAt);
                    childrenSkipCount = i16 + getChildrenSkipCount(virtualChildAt, i15);
                    paddingLeft = nextLocationOffset;
                    childrenSkipCount++;
                    virtualChildCount = i8;
                    i14 = i9;
                    z3 = z;
                    paddingTop = i7;
                } else {
                    i8 = virtualChildCount;
                }
                i10 = ((LinearLayout.LayoutParams) c1632).gravity;
                if (i10 < 0) {
                }
                i11 = i10 & 112;
                i9 = i14;
                if (i11 == 16) {
                }
                if (hasDividerBeforeChildAt(i15)) {
                }
                int i172 = ((LinearLayout.LayoutParams) c1632).leftMargin + paddingLeft;
                i7 = paddingTop;
                m29229(virtualChildAt, i172 + getLocationOffset(virtualChildAt), measuredHeight, measuredWidth, measuredHeight2);
                int nextLocationOffset2 = i172 + measuredWidth + ((LinearLayout.LayoutParams) c1632).rightMargin + getNextLocationOffset(virtualChildAt);
                childrenSkipCount = i16 + getChildrenSkipCount(virtualChildAt, i15);
                paddingLeft = nextLocationOffset2;
                childrenSkipCount++;
                virtualChildCount = i8;
                i14 = i9;
                z3 = z;
                paddingTop = i7;
            } else {
                i7 = paddingTop;
                i8 = virtualChildCount;
                i9 = i14;
                z = true;
            }
            childrenSkipCount++;
            virtualChildCount = i8;
            i14 = i9;
            z3 = z;
            paddingTop = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void layoutVertical(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int paddingLeft = getPaddingLeft();
        int i9 = i3 - i;
        int paddingRight = i9 - getPaddingRight();
        int paddingRight2 = (i9 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i10 = this.mGravity;
        int i11 = i10 & 112;
        int i12 = i10 & C5194.f12286;
        int paddingTop = i11 != 16 ? i11 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.mTotalLength : getPaddingTop() + (((i4 - i2) - this.mTotalLength) / 2);
        int childrenSkipCount = 0;
        while (childrenSkipCount < virtualChildCount) {
            View virtualChildAt = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt == null) {
                paddingTop += measureNullChild(childrenSkipCount);
            } else {
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight = virtualChildAt.getMeasuredHeight();
                    C1632 c1632 = (C1632) virtualChildAt.getLayoutParams();
                    int i13 = ((LinearLayout.LayoutParams) c1632).gravity;
                    if (i13 < 0) {
                        i13 = i12;
                    }
                    int iM15901 = C5194.m15901(i13, getLayoutDirection()) & 7;
                    if (iM15901 == 1) {
                        i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c1632).leftMargin;
                        i6 = ((LinearLayout.LayoutParams) c1632).rightMargin;
                    } else if (iM15901 != 5) {
                        i7 = ((LinearLayout.LayoutParams) c1632).leftMargin + paddingLeft;
                        int i14 = i7;
                        if (hasDividerBeforeChildAt(childrenSkipCount)) {
                            paddingTop += this.mDividerHeight;
                        }
                        int i15 = paddingTop + ((LinearLayout.LayoutParams) c1632).topMargin;
                        m29229(virtualChildAt, i14, i15 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                        int nextLocationOffset = i15 + measuredHeight + ((LinearLayout.LayoutParams) c1632).bottomMargin + getNextLocationOffset(virtualChildAt);
                        childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                        paddingTop = nextLocationOffset;
                        i8 = 1;
                    } else {
                        i5 = paddingRight - measuredWidth;
                        i6 = ((LinearLayout.LayoutParams) c1632).rightMargin;
                    }
                    i7 = i5 - i6;
                    int i142 = i7;
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                    }
                    int i152 = paddingTop + ((LinearLayout.LayoutParams) c1632).topMargin;
                    m29229(virtualChildAt, i142, i152 + getLocationOffset(virtualChildAt), measuredWidth, measuredHeight);
                    int nextLocationOffset2 = i152 + measuredHeight + ((LinearLayout.LayoutParams) c1632).bottomMargin + getNextLocationOffset(virtualChildAt);
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt, childrenSkipCount);
                    paddingTop = nextLocationOffset2;
                    i8 = 1;
                }
                childrenSkipCount += i8;
            }
            i8 = 1;
            childrenSkipCount += i8;
        }
    }

    public void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void measureHorizontal(int i, int i2) {
        int[] iArr;
        int i3;
        int iMax;
        int iCombineMeasuredStates;
        int i4;
        int i5;
        int iMax2;
        int i6;
        int i7;
        float f;
        int i8;
        int baseline;
        int i9;
        int i10;
        int i11;
        byte b;
        int i12;
        int i13;
        boolean z;
        boolean z2;
        View view;
        int i14;
        boolean z3;
        int measuredHeight;
        int childrenSkipCount;
        int baseline2;
        int i15;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr2 = this.mMaxAscent;
        int[] iArr3 = this.mMaxDescent;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z4 = this.mBaselineAligned;
        boolean z5 = this.mUseLargestChild;
        int i16 = 1073741824;
        boolean z6 = mode == 1073741824;
        int childrenSkipCount2 = 0;
        int iMax3 = 0;
        int iMax4 = 0;
        int iMax5 = 0;
        int iMax6 = 0;
        boolean z7 = false;
        int iCombineMeasuredStates2 = 0;
        boolean z8 = false;
        boolean z9 = true;
        float f2 = 0.0f;
        while (true) {
            iArr = iArr3;
            if (childrenSkipCount2 >= virtualChildCount) {
                break;
            }
            View virtualChildAt = getVirtualChildAt(childrenSkipCount2);
            if (virtualChildAt == null) {
                this.mTotalLength += measureNullChild(childrenSkipCount2);
            } else if (virtualChildAt.getVisibility() == 8) {
                childrenSkipCount2 += getChildrenSkipCount(virtualChildAt, childrenSkipCount2);
            } else {
                if (hasDividerBeforeChildAt(childrenSkipCount2)) {
                    this.mTotalLength += this.mDividerWidth;
                }
                C1632 c1632 = (C1632) virtualChildAt.getLayoutParams();
                float f3 = ((LinearLayout.LayoutParams) c1632).weight;
                float f4 = f2 + f3;
                if (mode == i16 && ((LinearLayout.LayoutParams) c1632).width == 0 && f3 > 0.0f) {
                    if (z6) {
                        this.mTotalLength += ((LinearLayout.LayoutParams) c1632).leftMargin + ((LinearLayout.LayoutParams) c1632).rightMargin;
                    } else {
                        int i17 = this.mTotalLength;
                        this.mTotalLength = Math.max(i17, ((LinearLayout.LayoutParams) c1632).leftMargin + i17 + ((LinearLayout.LayoutParams) c1632).rightMargin);
                    }
                    if (z4) {
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        virtualChildAt.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        i13 = childrenSkipCount2;
                        z = z5;
                        z2 = z4;
                        view = virtualChildAt;
                    } else {
                        i13 = childrenSkipCount2;
                        z = z5;
                        z2 = z4;
                        view = virtualChildAt;
                        z7 = true;
                        i14 = 1073741824;
                        if (mode2 == i14 && ((LinearLayout.LayoutParams) c1632).height == -1) {
                            z3 = true;
                            z8 = true;
                        } else {
                            z3 = false;
                        }
                        int i18 = ((LinearLayout.LayoutParams) c1632).topMargin + ((LinearLayout.LayoutParams) c1632).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i18;
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, view.getMeasuredState());
                        if (z2 && (baseline2 = view.getBaseline()) != -1) {
                            i15 = ((LinearLayout.LayoutParams) c1632).gravity;
                            if (i15 < 0) {
                                i15 = this.mGravity;
                            }
                            int i19 = (((i15 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i19] = Math.max(iArr2[i19], baseline2);
                            iArr[i19] = Math.max(iArr[i19], measuredHeight - baseline2);
                        }
                        iMax4 = Math.max(iMax4, measuredHeight);
                        z9 = !z9 && ((LinearLayout.LayoutParams) c1632).height == -1;
                        if (((LinearLayout.LayoutParams) c1632).weight <= 0.0f) {
                            if (!z3) {
                                i18 = measuredHeight;
                            }
                            iMax6 = Math.max(iMax6, i18);
                        } else {
                            int i20 = iMax6;
                            if (!z3) {
                                i18 = measuredHeight;
                            }
                            iMax5 = Math.max(iMax5, i18);
                            iMax6 = i20;
                        }
                        int i21 = i13;
                        childrenSkipCount = getChildrenSkipCount(view, i21) + i21;
                        f2 = f4;
                        int i22 = childrenSkipCount + 1;
                        iArr3 = iArr;
                        z5 = z;
                        z4 = z2;
                        i16 = i14;
                        childrenSkipCount2 = i22;
                    }
                } else {
                    if (((LinearLayout.LayoutParams) c1632).width != 0 || f3 <= 0.0f) {
                        b = -2;
                        i12 = Integer.MIN_VALUE;
                    } else {
                        b = -2;
                        ((LinearLayout.LayoutParams) c1632).width = -2;
                        i12 = 0;
                    }
                    i13 = childrenSkipCount2;
                    int i23 = i12;
                    z = z5;
                    z2 = z4;
                    measureChildBeforeLayout(virtualChildAt, i13, i, f4 == 0.0f ? this.mTotalLength : 0, i2, 0);
                    if (i23 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) c1632).width = i23;
                    }
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    if (z6) {
                        view = virtualChildAt;
                        this.mTotalLength += ((LinearLayout.LayoutParams) c1632).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) c1632).rightMargin + getNextLocationOffset(view);
                    } else {
                        view = virtualChildAt;
                        int i24 = this.mTotalLength;
                        this.mTotalLength = Math.max(i24, i24 + measuredWidth + ((LinearLayout.LayoutParams) c1632).leftMargin + ((LinearLayout.LayoutParams) c1632).rightMargin + getNextLocationOffset(view));
                    }
                    if (z) {
                        iMax3 = Math.max(measuredWidth, iMax3);
                    }
                }
                i14 = 1073741824;
                if (mode2 == i14) {
                    z3 = false;
                    int i182 = ((LinearLayout.LayoutParams) c1632).topMargin + ((LinearLayout.LayoutParams) c1632).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i182;
                    iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, view.getMeasuredState());
                    if (z2) {
                        i15 = ((LinearLayout.LayoutParams) c1632).gravity;
                        if (i15 < 0) {
                        }
                        int i192 = (((i15 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i192] = Math.max(iArr2[i192], baseline2);
                        iArr[i192] = Math.max(iArr[i192], measuredHeight - baseline2);
                    }
                    iMax4 = Math.max(iMax4, measuredHeight);
                    if (z9) {
                        if (((LinearLayout.LayoutParams) c1632).weight <= 0.0f) {
                        }
                        int i212 = i13;
                        childrenSkipCount = getChildrenSkipCount(view, i212) + i212;
                        f2 = f4;
                    }
                }
                int i222 = childrenSkipCount + 1;
                iArr3 = iArr;
                z5 = z;
                z4 = z2;
                i16 = i14;
                childrenSkipCount2 = i222;
            }
            z = z5;
            z2 = z4;
            int i25 = i16;
            childrenSkipCount = childrenSkipCount2;
            i14 = i25;
            int i2222 = childrenSkipCount + 1;
            iArr3 = iArr;
            z5 = z;
            z4 = z2;
            i16 = i14;
            childrenSkipCount2 = i2222;
        }
        boolean z10 = z5;
        boolean z11 = z4;
        int i26 = iMax4;
        int i27 = iMax5;
        int i28 = iMax6;
        int i29 = iCombineMeasuredStates2;
        if (this.mTotalLength > 0 && hasDividerBeforeChildAt(virtualChildCount)) {
            this.mTotalLength += this.mDividerWidth;
        }
        int i30 = iArr2[1];
        if (i30 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) {
            iMax = i26;
            i3 = i29;
        } else {
            i3 = i29;
            iMax = Math.max(i26, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i30, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        }
        if (z10 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.mTotalLength = 0;
            int childrenSkipCount3 = 0;
            while (childrenSkipCount3 < virtualChildCount) {
                View virtualChildAt2 = getVirtualChildAt(childrenSkipCount3);
                if (virtualChildAt2 == null) {
                    this.mTotalLength += measureNullChild(childrenSkipCount3);
                } else if (virtualChildAt2.getVisibility() == 8) {
                    childrenSkipCount3 += getChildrenSkipCount(virtualChildAt2, childrenSkipCount3);
                } else {
                    C1632 c16322 = (C1632) virtualChildAt2.getLayoutParams();
                    if (z6) {
                        this.mTotalLength += ((LinearLayout.LayoutParams) c16322).leftMargin + iMax3 + ((LinearLayout.LayoutParams) c16322).rightMargin + getNextLocationOffset(virtualChildAt2);
                    } else {
                        int i31 = this.mTotalLength;
                        i11 = iMax;
                        this.mTotalLength = Math.max(i31, i31 + iMax3 + ((LinearLayout.LayoutParams) c16322).leftMargin + ((LinearLayout.LayoutParams) c16322).rightMargin + getNextLocationOffset(virtualChildAt2));
                        childrenSkipCount3++;
                        iMax = i11;
                    }
                }
                i11 = iMax;
                childrenSkipCount3++;
                iMax = i11;
            }
        }
        int iMax7 = iMax;
        int paddingLeft = this.mTotalLength + getPaddingLeft() + getPaddingRight();
        this.mTotalLength = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, 0);
        int i32 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
        if (z7 || (i32 != 0 && f2 > 0.0f)) {
            float f5 = this.mWeightSum;
            if (f5 > 0.0f) {
                f2 = f5;
            }
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            this.mTotalLength = 0;
            int i33 = i27;
            int iMax8 = -1;
            iCombineMeasuredStates = i3;
            int i34 = 0;
            while (i34 < virtualChildCount) {
                View virtualChildAt3 = getVirtualChildAt(i34);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    i6 = i32;
                    i7 = virtualChildCount;
                } else {
                    C1632 c16323 = (C1632) virtualChildAt3.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) c16323).weight;
                    if (f6 > 0.0f) {
                        int i35 = (int) ((i32 * f6) / f2);
                        float f7 = f2 - f6;
                        int i36 = i32 - i35;
                        i7 = virtualChildCount;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) c16323).topMargin + ((LinearLayout.LayoutParams) c16323).bottomMargin, ((LinearLayout.LayoutParams) c16323).height);
                        if (((LinearLayout.LayoutParams) c16323).width == 0) {
                            i10 = 1073741824;
                            if (mode == 1073741824) {
                                if (i35 <= 0) {
                                    i35 = 0;
                                }
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(i35, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt3.getMeasuredState() & C8273.f24692);
                            f2 = f7;
                            i6 = i36;
                        } else {
                            i10 = 1073741824;
                        }
                        int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i35;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i10), childMeasureSpec);
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt3.getMeasuredState() & C8273.f24692);
                        f2 = f7;
                        i6 = i36;
                    } else {
                        i6 = i32;
                        i7 = virtualChildCount;
                    }
                    if (z6) {
                        this.mTotalLength += virtualChildAt3.getMeasuredWidth() + ((LinearLayout.LayoutParams) c16323).leftMargin + ((LinearLayout.LayoutParams) c16323).rightMargin + getNextLocationOffset(virtualChildAt3);
                        f = f2;
                    } else {
                        int i37 = this.mTotalLength;
                        f = f2;
                        this.mTotalLength = Math.max(i37, virtualChildAt3.getMeasuredWidth() + i37 + ((LinearLayout.LayoutParams) c16323).leftMargin + ((LinearLayout.LayoutParams) c16323).rightMargin + getNextLocationOffset(virtualChildAt3));
                    }
                    boolean z12 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) c16323).height == -1;
                    int i38 = ((LinearLayout.LayoutParams) c16323).topMargin + ((LinearLayout.LayoutParams) c16323).bottomMargin;
                    int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i38;
                    iMax8 = Math.max(iMax8, measuredHeight2);
                    if (!z12) {
                        i38 = measuredHeight2;
                    }
                    int iMax9 = Math.max(i33, i38);
                    if (z9) {
                        i8 = -1;
                        boolean z13 = ((LinearLayout.LayoutParams) c16323).height == -1;
                        if (z11 && (baseline = virtualChildAt3.getBaseline()) != i8) {
                            i9 = ((LinearLayout.LayoutParams) c16323).gravity;
                            if (i9 < 0) {
                                i9 = this.mGravity;
                            }
                            int i39 = (((i9 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i39] = Math.max(iArr2[i39], baseline);
                            iArr[i39] = Math.max(iArr[i39], measuredHeight2 - baseline);
                        }
                        z9 = z13;
                        i33 = iMax9;
                        f2 = f;
                    } else {
                        i8 = -1;
                    }
                    if (z11) {
                        i9 = ((LinearLayout.LayoutParams) c16323).gravity;
                        if (i9 < 0) {
                        }
                        int i392 = (((i9 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i392] = Math.max(iArr2[i392], baseline);
                        iArr[i392] = Math.max(iArr[i392], measuredHeight2 - baseline);
                    }
                    z9 = z13;
                    i33 = iMax9;
                    f2 = f;
                }
                i34++;
                i32 = i6;
                virtualChildCount = i7;
            }
            i4 = i2;
            i5 = virtualChildCount;
            this.mTotalLength += getPaddingLeft() + getPaddingRight();
            int i40 = iArr2[1];
            iMax7 = (i40 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? iMax8 : Math.max(iMax8, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i40, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
            iMax2 = i33;
        } else {
            iMax2 = Math.max(i27, i28);
            if (z10 && mode != 1073741824) {
                for (int i41 = 0; i41 < virtualChildCount; i41++) {
                    View virtualChildAt4 = getVirtualChildAt(i41);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C1632) virtualChildAt4.getLayoutParams())).weight > 0.0f) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(iMax3, 1073741824), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i4 = i2;
            i5 = virtualChildCount;
            iCombineMeasuredStates = i3;
        }
        if (z9 || mode2 == 1073741824) {
            iMax2 = iMax7;
        }
        setMeasuredDimension(iResolveSizeAndState | ((-16777216) & iCombineMeasuredStates), View.resolveSizeAndState(Math.max(iMax2 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i4, iCombineMeasuredStates << 16));
        if (z8) {
            m29230(i5, i);
        }
    }

    public int measureNullChild(int i) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x032f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void measureVertical(int i, int i2) {
        int i3;
        int iCombineMeasuredStates;
        int i4;
        int iMax;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iMax2;
        int i15;
        View view;
        int iMax3;
        boolean z;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i16 = this.mBaselineAlignedChildIndex;
        boolean z2 = this.mUseLargestChild;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int iMax4 = 0;
        int i20 = 0;
        int childrenSkipCount = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = true;
        float f = 0.0f;
        while (true) {
            int i21 = 8;
            int i22 = iMax4;
            if (childrenSkipCount >= virtualChildCount) {
                int i23 = i17;
                int i24 = i19;
                int i25 = i20;
                int i26 = mode2;
                int iMax5 = i18;
                int i27 = virtualChildCount;
                if (this.mTotalLength > 0) {
                    i3 = i27;
                    if (hasDividerBeforeChildAt(i3)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                } else {
                    i3 = i27;
                }
                if (z2 && (i26 == Integer.MIN_VALUE || i26 == 0)) {
                    this.mTotalLength = 0;
                    int childrenSkipCount2 = 0;
                    while (childrenSkipCount2 < i3) {
                        View virtualChildAt = getVirtualChildAt(childrenSkipCount2);
                        if (virtualChildAt == null) {
                            this.mTotalLength += measureNullChild(childrenSkipCount2);
                        } else if (virtualChildAt.getVisibility() == i21) {
                            childrenSkipCount2 += getChildrenSkipCount(virtualChildAt, childrenSkipCount2);
                        } else {
                            C1632 c1632 = (C1632) virtualChildAt.getLayoutParams();
                            int i28 = this.mTotalLength;
                            this.mTotalLength = Math.max(i28, i28 + i24 + ((LinearLayout.LayoutParams) c1632).topMargin + ((LinearLayout.LayoutParams) c1632).bottomMargin + getNextLocationOffset(virtualChildAt));
                        }
                        childrenSkipCount2++;
                        i21 = 8;
                    }
                }
                int paddingTop = this.mTotalLength + getPaddingTop() + getPaddingBottom();
                this.mTotalLength = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, 0);
                int i29 = (16777215 & iResolveSizeAndState) - this.mTotalLength;
                if (z3 || (i29 != 0 && f > 0.0f)) {
                    float f2 = this.mWeightSum;
                    if (f2 > 0.0f) {
                        f = f2;
                    }
                    this.mTotalLength = 0;
                    int i30 = i29;
                    int i31 = i25;
                    iCombineMeasuredStates = i23;
                    int i32 = 0;
                    while (i32 < i3) {
                        View virtualChildAt2 = getVirtualChildAt(i32);
                        if (virtualChildAt2.getVisibility() == 8) {
                            i5 = i30;
                        } else {
                            C1632 c16322 = (C1632) virtualChildAt2.getLayoutParams();
                            float f3 = ((LinearLayout.LayoutParams) c16322).weight;
                            if (f3 > 0.0f) {
                                int i33 = (int) ((i30 * f3) / f);
                                float f4 = f - f3;
                                i5 = i30 - i33;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) c16322).leftMargin + ((LinearLayout.LayoutParams) c16322).rightMargin, ((LinearLayout.LayoutParams) c16322).width);
                                if (((LinearLayout.LayoutParams) c16322).height == 0) {
                                    i8 = 1073741824;
                                    if (i26 == 1073741824) {
                                        if (i33 <= 0) {
                                            i33 = 0;
                                        }
                                        virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i33, 1073741824));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & C5445.f13388);
                                    f = f4;
                                } else {
                                    i8 = 1073741824;
                                }
                                int measuredHeight = virtualChildAt2.getMeasuredHeight() + i33;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i8));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, virtualChildAt2.getMeasuredState() & C5445.f13388);
                                f = f4;
                            } else {
                                i5 = i30;
                            }
                            int i34 = ((LinearLayout.LayoutParams) c16322).leftMargin + ((LinearLayout.LayoutParams) c16322).rightMargin;
                            int measuredWidth = virtualChildAt2.getMeasuredWidth() + i34;
                            iMax5 = Math.max(iMax5, measuredWidth);
                            float f5 = f;
                            if (mode != 1073741824) {
                                i6 = iCombineMeasuredStates;
                                i7 = -1;
                                if (((LinearLayout.LayoutParams) c16322).width != -1) {
                                }
                                int iMax6 = Math.max(i31, i34);
                                boolean z6 = !z5 && ((LinearLayout.LayoutParams) c16322).width == i7;
                                int i35 = this.mTotalLength;
                                this.mTotalLength = Math.max(i35, virtualChildAt2.getMeasuredHeight() + i35 + ((LinearLayout.LayoutParams) c16322).topMargin + ((LinearLayout.LayoutParams) c16322).bottomMargin + getNextLocationOffset(virtualChildAt2));
                                z5 = z6;
                                iCombineMeasuredStates = i6;
                                i31 = iMax6;
                                f = f5;
                            } else {
                                i6 = iCombineMeasuredStates;
                                i7 = -1;
                            }
                            i34 = measuredWidth;
                            int iMax62 = Math.max(i31, i34);
                            if (z5) {
                                int i352 = this.mTotalLength;
                                this.mTotalLength = Math.max(i352, virtualChildAt2.getMeasuredHeight() + i352 + ((LinearLayout.LayoutParams) c16322).topMargin + ((LinearLayout.LayoutParams) c16322).bottomMargin + getNextLocationOffset(virtualChildAt2));
                                z5 = z6;
                                iCombineMeasuredStates = i6;
                                i31 = iMax62;
                                f = f5;
                            }
                        }
                        i32++;
                        i30 = i5;
                    }
                    i4 = i;
                    this.mTotalLength += getPaddingTop() + getPaddingBottom();
                    iMax = i31;
                } else {
                    iMax = Math.max(i25, i22);
                    if (z2 && i26 != 1073741824) {
                        for (int i36 = 0; i36 < i3; i36++) {
                            View virtualChildAt3 = getVirtualChildAt(i36);
                            if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C1632) virtualChildAt3.getLayoutParams())).weight > 0.0f) {
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i24, 1073741824));
                            }
                        }
                    }
                    i4 = i;
                    iCombineMeasuredStates = i23;
                }
                if (z5 || mode == 1073741824) {
                    iMax = iMax5;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i4, iCombineMeasuredStates), iResolveSizeAndState);
                if (z4) {
                    m29228(i3, i2);
                    return;
                }
                return;
            }
            View virtualChildAt4 = getVirtualChildAt(childrenSkipCount);
            if (virtualChildAt4 == null) {
                this.mTotalLength += measureNullChild(childrenSkipCount);
                i12 = mode2;
                iMax4 = i22;
                i14 = virtualChildCount;
            } else {
                int i37 = i17;
                if (virtualChildAt4.getVisibility() == 8) {
                    childrenSkipCount += getChildrenSkipCount(virtualChildAt4, childrenSkipCount);
                    iMax4 = i22;
                    i17 = i37;
                    i14 = virtualChildCount;
                    i12 = mode2;
                } else {
                    if (hasDividerBeforeChildAt(childrenSkipCount)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                    C1632 c16323 = (C1632) virtualChildAt4.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) c16323).weight;
                    float f7 = f + f6;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) c16323).height == 0 && f6 > 0.0f) {
                        int i38 = this.mTotalLength;
                        this.mTotalLength = Math.max(i38, ((LinearLayout.LayoutParams) c16323).topMargin + i38 + ((LinearLayout.LayoutParams) c16323).bottomMargin);
                        iMax3 = i19;
                        view = virtualChildAt4;
                        iMax2 = i20;
                        z3 = true;
                        i10 = i37;
                        i11 = i18;
                        i12 = mode2;
                        i13 = i22;
                        i14 = virtualChildCount;
                        i15 = childrenSkipCount;
                    } else {
                        int i39 = i18;
                        if (((LinearLayout.LayoutParams) c16323).height != 0 || f6 <= 0.0f) {
                            i9 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) c16323).height = -2;
                            i9 = 0;
                        }
                        i10 = i37;
                        int i40 = i9;
                        i11 = i39;
                        int i41 = i19;
                        i12 = mode2;
                        i13 = i22;
                        i14 = virtualChildCount;
                        iMax2 = i20;
                        i15 = childrenSkipCount;
                        measureChildBeforeLayout(virtualChildAt4, childrenSkipCount, i, 0, i2, f7 == 0.0f ? this.mTotalLength : 0);
                        if (i40 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c16323).height = i40;
                        }
                        int measuredHeight2 = virtualChildAt4.getMeasuredHeight();
                        int i42 = this.mTotalLength;
                        view = virtualChildAt4;
                        this.mTotalLength = Math.max(i42, i42 + measuredHeight2 + ((LinearLayout.LayoutParams) c16323).topMargin + ((LinearLayout.LayoutParams) c16323).bottomMargin + getNextLocationOffset(view));
                        iMax3 = z2 ? Math.max(measuredHeight2, i41) : i41;
                    }
                    if (i16 >= 0 && i16 == i15 + 1) {
                        this.mBaselineChildTop = this.mTotalLength;
                    }
                    if (i15 < i16 && ((LinearLayout.LayoutParams) c16323).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) c16323).width != -1) {
                        z = false;
                    } else {
                        z = true;
                        z4 = true;
                    }
                    int i43 = ((LinearLayout.LayoutParams) c16323).leftMargin + ((LinearLayout.LayoutParams) c16323).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i43;
                    int iMax7 = Math.max(i11, measuredWidth2);
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i10, view.getMeasuredState());
                    z5 = z5 && ((LinearLayout.LayoutParams) c16323).width == -1;
                    if (((LinearLayout.LayoutParams) c16323).weight > 0.0f) {
                        if (!z) {
                            i43 = measuredWidth2;
                        }
                        iMax4 = Math.max(i13, i43);
                    } else {
                        if (!z) {
                            i43 = measuredWidth2;
                        }
                        iMax2 = Math.max(iMax2, i43);
                        iMax4 = i13;
                    }
                    int childrenSkipCount3 = getChildrenSkipCount(view, i15) + i15;
                    i19 = iMax3;
                    i18 = iMax7;
                    f = f7;
                    i20 = iMax2;
                    childrenSkipCount = childrenSkipCount3;
                    i17 = iCombineMeasuredStates2;
                }
            }
            childrenSkipCount++;
            virtualChildCount = i14;
            mode2 = i12;
        }
    }

    @Override // android.view.View
    public void onDraw(@InterfaceC6391 Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.mBaselineAlignedChildIndex = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public void setGravity(@InterfaceC5195 int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= C5194.f1338;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & C5194.f12286;
        int i3 = this.mGravity;
        if ((8388615 & i3) != i2) {
            this.mGravity = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.mGravity;
        if ((i3 & 112) != i2) {
            this.mGravity = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m29230(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                C1632 c1632 = (C1632) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) c1632).height == -1) {
                    int i4 = ((LinearLayout.LayoutParams) c1632).width;
                    ((LinearLayout.LayoutParams) c1632).width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i2, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) c1632).width = i4;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8754(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    public C1632 generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new C1632(-2, -2);
        }
        if (i == 1) {
            return new C1632(-1, -2);
        }
        return null;
    }

    public C8754(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        C7837 c7837M24869 = C7837.m24869(context, attributeSet, C6898.C6909.f19610, i, 0);
        C8273.m27437(this, context, C6898.C6909.f19610, attributeSet, c7837M24869.m24895(), i, 0);
        int iM24882 = c7837M24869.m24882(C6898.C6909.f19612, -1);
        if (iM24882 >= 0) {
            setOrientation(iM24882);
        }
        int iM248822 = c7837M24869.m24882(C6898.C6909.f19611, -1);
        if (iM248822 >= 0) {
            setGravity(iM248822);
        }
        boolean zM3933 = c7837M24869.m3933(C6898.C6909.f19613, true);
        if (!zM3933) {
            setBaselineAligned(zM3933);
        }
        this.mWeightSum = c7837M24869.m24877(C6898.C6909.f19615, -1.0f);
        this.mBaselineAlignedChildIndex = c7837M24869.m24882(C6898.C6909.f19614, -1);
        this.mUseLargestChild = c7837M24869.m3933(C6898.C6909.f19618, false);
        setDividerDrawable(c7837M24869.m24875(C6898.C6909.f19616));
        this.mShowDividers = c7837M24869.m24882(C6898.C6909.f19619, 0);
        this.mDividerPadding = c7837M24869.m24874(C6898.C6909.f19617, 0);
        c7837M24869.m24899();
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    public C1632 generateLayoutParams(AttributeSet attributeSet) {
        return new C1632(getContext(), attributeSet);
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    public C1632 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C1632) {
            return new C1632((ViewGroup.MarginLayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1632((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1632(layoutParams);
    }
}
