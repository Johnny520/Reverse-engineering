package p000;

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

/* JADX INFO: renamed from: xq */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0902xq extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public boolean f5289a;

    /* JADX INFO: renamed from: b */
    public int f5290b;

    /* JADX INFO: renamed from: c */
    public int f5291c;

    /* JADX INFO: renamed from: d */
    public int f5292d;

    /* JADX INFO: renamed from: e */
    public int f5293e;

    /* JADX INFO: renamed from: f */
    public int f5294f;

    /* JADX INFO: renamed from: g */
    public float f5295g;

    /* JADX INFO: renamed from: h */
    public boolean f5296h;

    /* JADX INFO: renamed from: i */
    public int[] f5297i;

    /* JADX INFO: renamed from: j */
    public int[] f5298j;

    /* JADX INFO: renamed from: k */
    public Drawable f5299k;

    /* JADX INFO: renamed from: l */
    public int f5300l;

    /* JADX INFO: renamed from: m */
    public int f5301m;

    /* JADX INFO: renamed from: n */
    public int f5302n;

    /* JADX INFO: renamed from: o */
    public int f5303o;

    public AbstractC0902xq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5289a = true;
        this.f5290b = -1;
        this.f5291c = 0;
        this.f5293e = 8388659;
        int[] iArr = AbstractC0205ez.f1690n;
        C0658r5 c0658r5M2226y = C0658r5.m2226y(context, attributeSet, iArr, i);
        oa0.m2011k(this, context, iArr, attributeSet, (TypedArray) c0658r5M2226y.f4064b, i);
        TypedArray typedArray = (TypedArray) c0658r5M2226y.f4064b;
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
        this.f5295g = typedArray.getFloat(4, -1.0f);
        this.f5290b = typedArray.getInt(3, -1);
        this.f5296h = typedArray.getBoolean(7, false);
        setDividerDrawable(c0658r5M2226y.m2241m(5));
        this.f5302n = typedArray.getInt(8, 0);
        this.f5303o = typedArray.getDimensionPixelSize(6, 0);
        c0658r5M2226y.m2252z();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0865wq;
    }

    /* JADX INFO: renamed from: d */
    public final void m2705d(Canvas canvas, int i) {
        this.f5299k.setBounds(getPaddingLeft() + this.f5303o, i, (getWidth() - getPaddingRight()) - this.f5303o, this.f5301m + i);
        this.f5299k.draw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m2706e(Canvas canvas, int i) {
        this.f5299k.setBounds(i, getPaddingTop() + this.f5303o, this.f5300l + i, (getHeight() - getPaddingBottom()) - this.f5303o);
        this.f5299k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0865wq generateDefaultLayoutParams() {
        int i = this.f5292d;
        if (i == 0) {
            return new C0865wq(-2, -2);
        }
        if (i == 1) {
            return new C0865wq(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0865wq generateLayoutParams(AttributeSet attributeSet) {
        return new C0865wq(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f5290b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f5290b;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f5290b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f5291c;
        if (this.f5292d == 1 && (i = this.f5293e & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f5294f) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f5294f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C0865wq) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f5290b;
    }

    public Drawable getDividerDrawable() {
        return this.f5299k;
    }

    public int getDividerPadding() {
        return this.f5303o;
    }

    public int getDividerWidth() {
        return this.f5300l;
    }

    public int getGravity() {
        return this.f5293e;
    }

    public int getOrientation() {
        return this.f5292d;
    }

    public int getShowDividers() {
        return this.f5302n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f5295g;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0865wq generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0865wq(layoutParams);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2707i(int i) {
        if (i == 0) {
            return (this.f5302n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f5302n & 4) != 0;
        }
        if ((this.f5302n & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.f5299k == null) {
            return;
        }
        int i2 = 0;
        if (this.f5292d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && m2707i(i2)) {
                    m2705d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0865wq) childAt.getLayoutParams())).topMargin) - this.f5301m);
                }
                i2++;
            }
            if (m2707i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                m2705d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f5301m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0865wq) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zM1385a = hb0.m1385a(this);
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m2707i(i2)) {
                C0865wq c0865wq = (C0865wq) childAt3.getLayoutParams();
                m2706e(canvas, zM1385a ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0865wq).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0865wq).leftMargin) - this.f5300l);
            }
            i2++;
        }
        if (m2707i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0865wq c0865wq2 = (C0865wq) childAt4.getLayoutParams();
                if (zM1385a) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c0865wq2).leftMargin;
                    i = this.f5300l;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0865wq2).rightMargin;
                }
            } else if (zM1385a) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f5300l;
                right = left - i;
            }
            m2706e(canvas, right);
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a6  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0902xq.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 2150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0902xq.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f5289a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f5290b = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f5299k) {
            return;
        }
        this.f5299k = drawable;
        if (drawable != null) {
            this.f5300l = drawable.getIntrinsicWidth();
            this.f5301m = drawable.getIntrinsicHeight();
        } else {
            this.f5300l = 0;
            this.f5301m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f5303o = i;
    }

    public void setGravity(int i) {
        if (this.f5293e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f5293e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f5293e;
        if ((8388615 & i3) != i2) {
            this.f5293e = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f5296h = z;
    }

    public void setOrientation(int i) {
        if (this.f5292d != i) {
            this.f5292d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f5302n) {
            requestLayout();
        }
        this.f5302n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f5293e;
        if ((i3 & 112) != i2) {
            this.f5293e = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f5295g = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
