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

/* JADX INFO: renamed from: tq */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0754tq extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public boolean f4598a;

    /* JADX INFO: renamed from: b */
    public int f4599b;

    /* JADX INFO: renamed from: c */
    public int f4600c;

    /* JADX INFO: renamed from: d */
    public int f4601d;

    /* JADX INFO: renamed from: e */
    public int f4602e;

    /* JADX INFO: renamed from: f */
    public int f4603f;

    /* JADX INFO: renamed from: g */
    public float f4604g;

    /* JADX INFO: renamed from: h */
    public boolean f4605h;

    /* JADX INFO: renamed from: i */
    public int[] f4606i;

    /* JADX INFO: renamed from: j */
    public int[] f4607j;

    /* JADX INFO: renamed from: k */
    public Drawable f4608k;

    /* JADX INFO: renamed from: l */
    public int f4609l;

    /* JADX INFO: renamed from: m */
    public int f4610m;

    /* JADX INFO: renamed from: n */
    public int f4611n;

    /* JADX INFO: renamed from: o */
    public int f4612o;

    public AbstractC0754tq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4598a = true;
        this.f4599b = -1;
        this.f4600c = 0;
        this.f4602e = 8388659;
        int[] iArr = AbstractC0910xy.f5230n;
        C0659r5 c0659r5M2219y = C0659r5.m2219y(context, attributeSet, iArr, i);
        ja0.m1574k(this, context, iArr, attributeSet, (TypedArray) c0659r5M2219y.f4209b, i);
        TypedArray typedArray = (TypedArray) c0659r5M2219y.f4209b;
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
        this.f4604g = typedArray.getFloat(4, -1.0f);
        this.f4599b = typedArray.getInt(3, -1);
        this.f4605h = typedArray.getBoolean(7, false);
        setDividerDrawable(c0659r5M2219y.m2234m(5));
        this.f4611n = typedArray.getInt(8, 0);
        this.f4612o = typedArray.getDimensionPixelSize(6, 0);
        c0659r5M2219y.m2245z();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0717sq;
    }

    /* JADX INFO: renamed from: d */
    public final void m2386d(Canvas canvas, int i) {
        this.f4608k.setBounds(getPaddingLeft() + this.f4612o, i, (getWidth() - getPaddingRight()) - this.f4612o, this.f4610m + i);
        this.f4608k.draw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m2387e(Canvas canvas, int i) {
        this.f4608k.setBounds(i, getPaddingTop() + this.f4612o, this.f4609l + i, (getHeight() - getPaddingBottom()) - this.f4612o);
        this.f4608k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0717sq generateDefaultLayoutParams() {
        int i = this.f4601d;
        if (i == 0) {
            return new C0717sq(-2, -2);
        }
        if (i == 1) {
            return new C0717sq(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0717sq generateLayoutParams(AttributeSet attributeSet) {
        return new C0717sq(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f4599b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f4599b;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f4599b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f4600c;
        if (this.f4601d == 1 && (i = this.f4602e & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f4603f) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f4603f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C0717sq) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f4599b;
    }

    public Drawable getDividerDrawable() {
        return this.f4608k;
    }

    public int getDividerPadding() {
        return this.f4612o;
    }

    public int getDividerWidth() {
        return this.f4609l;
    }

    public int getGravity() {
        return this.f4602e;
    }

    public int getOrientation() {
        return this.f4601d;
    }

    public int getShowDividers() {
        return this.f4611n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f4604g;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0717sq generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0717sq(layoutParams);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2388i(int i) {
        if (i == 0) {
            return (this.f4611n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f4611n & 4) != 0;
        }
        if ((this.f4611n & 2) != 0) {
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
        if (this.f4608k == null) {
            return;
        }
        int i2 = 0;
        if (this.f4601d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && m2388i(i2)) {
                    m2386d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0717sq) childAt.getLayoutParams())).topMargin) - this.f4610m);
                }
                i2++;
            }
            if (m2388i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                m2386d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f4610m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0717sq) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zM658a = cb0.m658a(this);
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m2388i(i2)) {
                C0717sq c0717sq = (C0717sq) childAt3.getLayoutParams();
                m2387e(canvas, zM658a ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0717sq).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0717sq).leftMargin) - this.f4609l);
            }
            i2++;
        }
        if (m2388i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0717sq c0717sq2 = (C0717sq) childAt4.getLayoutParams();
                if (zM658a) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c0717sq2).leftMargin;
                    i = this.f4609l;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0717sq2).rightMargin;
                }
            } else if (zM658a) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f4609l;
                right = left - i;
            }
            m2387e(canvas, right);
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
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0754tq.onLayout(boolean, int, int, int, int):void");
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
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0754tq.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f4598a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f4599b = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f4608k) {
            return;
        }
        this.f4608k = drawable;
        if (drawable != null) {
            this.f4609l = drawable.getIntrinsicWidth();
            this.f4610m = drawable.getIntrinsicHeight();
        } else {
            this.f4609l = 0;
            this.f4610m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f4612o = i;
    }

    public void setGravity(int i) {
        if (this.f4602e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f4602e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f4602e;
        if ((8388615 & i3) != i2) {
            this.f4602e = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f4605h = z;
    }

    public void setOrientation(int i) {
        if (this.f4601d != i) {
            this.f4601d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f4611n) {
            requestLayout();
        }
        this.f4611n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f4602e;
        if ((i3 & 112) != i2) {
            this.f4602e = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f4604g = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
