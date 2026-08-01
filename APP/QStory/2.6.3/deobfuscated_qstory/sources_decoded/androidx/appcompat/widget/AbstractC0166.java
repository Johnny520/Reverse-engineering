package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.appcompat.app.C0108;
import androidx.core.view.AbstractC2270;
import bsh.C2633;
import p188.AbstractC7773;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0166 extends ViewGroup {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f658;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public int f659;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f660;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f661;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public Drawable f662;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int[] f663;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f664;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f665;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f666;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int[] f667;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f668;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public float f669;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f670;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f671;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f672;

    public AbstractC0166(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f672 = true;
        this.f670 = -1;
        this.f671 = 0;
        this.f664 = 8388659;
        int[] iArr = AbstractC7773.f21096;
        C0108 c0108M354 = C0108.m354(0, 0, context, attributeSet, iArr);
        AbstractC2270.m4243(this, context, iArr, attributeSet, (TypedArray) c0108M354.f320, 0);
        TypedArray typedArray = (TypedArray) c0108M354.f320;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f669 = typedArray.getFloat(4, -1.0f);
        this.f670 = typedArray.getInt(3, -1);
        this.f666 = typedArray.getBoolean(7, false);
        setDividerDrawable(c0108M354.m390(5));
        this.f659 = typedArray.getInt(8, 0);
        this.f658 = typedArray.getDimensionPixelSize(6, 0);
        c0108M354.m363();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0163;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f670 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f670;
        if (childCount <= i2) {
            C2633.m5339("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
            return 0;
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f670 == 0) {
                return -1;
            }
            C2633.m5339("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            return 0;
        }
        int bottom = this.f671;
        if (this.f665 == 1 && (i = this.f664 & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f668) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f668;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C0163) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f670;
    }

    public Drawable getDividerDrawable() {
        return this.f662;
    }

    public int getDividerPadding() {
        return this.f658;
    }

    public int getDividerWidth() {
        return this.f661;
    }

    public int getGravity() {
        return this.f664;
    }

    public int getOrientation() {
        return this.f665;
    }

    public int getShowDividers() {
        return this.f659;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f669;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.f662 == null) {
            return;
        }
        int i2 = 0;
        if (this.f665 == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && m623(i2)) {
                    m622((childAt.getTop() - ((LinearLayout.LayoutParams) ((C0163) childAt.getLayoutParams())).topMargin) - this.f660, canvas);
                }
                i2++;
            }
            if (m623(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                m622(childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f660 : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0163) childAt2.getLayoutParams())).bottomMargin, canvas);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m623(i2)) {
                C0163 c0163 = (C0163) childAt3.getLayoutParams();
                m621(z ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0163).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0163).leftMargin) - this.f661, canvas);
            }
            i2++;
        }
        if (m623(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0163 c01632 = (C0163) childAt4.getLayoutParams();
                if (z) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c01632).leftMargin;
                    i = this.f661;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c01632).rightMargin;
                }
            } else if (z) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f661;
                right = left - i;
            }
            m621(right, canvas);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a7  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractC0166.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:229:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0146  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 2139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AbstractC0166.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f672 = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f670 = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f662) {
            return;
        }
        this.f662 = drawable;
        if (drawable != null) {
            this.f661 = drawable.getIntrinsicWidth();
            this.f660 = drawable.getIntrinsicHeight();
        } else {
            this.f661 = 0;
            this.f660 = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f658 = i;
    }

    public void setGravity(int i) {
        if (this.f664 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f664 = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f664;
        if ((8388615 & i3) != i2) {
            this.f664 = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f666 = z;
    }

    public void setOrientation(int i) {
        if (this.f665 != i) {
            this.f665 = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f659) {
            requestLayout();
        }
        this.f659 = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f664;
        if ((i3 & 112) != i2) {
            this.f664 = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f669 = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: merged with bridge method [inline-methods] */
    public C0163 generateDefaultLayoutParams() {
        int i = this.f665;
        if (i == 0) {
            return new C0163(-2, -2);
        }
        if (i == 1) {
            return new C0163(-1, -2);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m621(int i, Canvas canvas) {
        this.f662.setBounds(i, getPaddingTop() + this.f658, this.f661 + i, (getHeight() - getPaddingBottom()) - this.f658);
        this.f662.draw(canvas);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m622(int i, Canvas canvas) {
        this.f662.setBounds(getPaddingLeft() + this.f658, i, (getWidth() - getPaddingRight()) - this.f658, this.f660 + i);
        this.f662.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: merged with bridge method [inline-methods] */
    public C0163 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0163 ? new C0163((C0163) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0163((ViewGroup.MarginLayoutParams) layoutParams) : new C0163(layoutParams);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: merged with bridge method [inline-methods] */
    public C0163 generateLayoutParams(AttributeSet attributeSet) {
        return new C0163(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m623(int i) {
        if (i == 0) {
            return (this.f659 & 1) != 0;
        }
        int childCount = getChildCount();
        int i2 = this.f659;
        if (i == childCount) {
            return (i2 & 4) != 0;
        }
        if ((i2 & 2) != 0) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }
}
