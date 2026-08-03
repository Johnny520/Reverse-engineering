package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: go */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1465go extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public boolean f5182a;

    /* JADX INFO: renamed from: b */
    public int f5183b;

    /* JADX INFO: renamed from: c */
    public int f5184c;

    /* JADX INFO: renamed from: d */
    public int f5185d;

    /* JADX INFO: renamed from: e */
    public int f5186e;

    /* JADX INFO: renamed from: f */
    public int f5187f;

    /* JADX INFO: renamed from: g */
    public float f5188g;

    /* JADX INFO: renamed from: h */
    public boolean f5189h;

    /* JADX INFO: renamed from: i */
    public int[] f5190i;

    /* JADX INFO: renamed from: j */
    public int[] f5191j;

    /* JADX INFO: renamed from: k */
    public Drawable f5192k;

    /* JADX INFO: renamed from: l */
    public int f5193l;

    /* JADX INFO: renamed from: m */
    public int f5194m;

    /* JADX INFO: renamed from: n */
    public int f5195n;

    /* JADX INFO: renamed from: o */
    public int f5196o;

    public AbstractC1465go(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f5182a = true;
        this.f5183b = -1;
        this.f5184c = 0;
        this.f5186e = 8388659;
        int[] iArr = AbstractC0982Wu.f3079n;
        C2656w4 c2656w4M5186A = C2656w4.m5186A(context, attributeSet, iArr, 0);
        AbstractC2185lE.m4398k(this, context, iArr, attributeSet, (TypedArray) c2656w4M5186A.f9196b, 0);
        TypedArray typedArray = (TypedArray) c2656w4M5186A.f9196b;
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
        this.f5188g = typedArray.getFloat(4, -1.0f);
        this.f5183b = typedArray.getInt(3, -1);
        this.f5189h = typedArray.getBoolean(7, false);
        setDividerDrawable(c2656w4M5186A.m5210q(5));
        this.f5195n = typedArray.getInt(8, 0);
        this.f5196o = typedArray.getDimensionPixelSize(6, 0);
        c2656w4M5186A.m5195E();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1421fo;
    }

    /* JADX INFO: renamed from: d */
    public final void m2816d(Canvas canvas, int i) {
        this.f5192k.setBounds(getPaddingLeft() + this.f5196o, i, (getWidth() - getPaddingRight()) - this.f5196o, this.f5194m + i);
        this.f5192k.draw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m2817e(Canvas canvas, int i) {
        this.f5192k.setBounds(i, getPaddingTop() + this.f5196o, this.f5193l + i, (getHeight() - getPaddingBottom()) - this.f5196o);
        this.f5192k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C1421fo generateDefaultLayoutParams() {
        int i = this.f5185d;
        if (i == 0) {
            return new C1421fo(-2, -2);
        }
        if (i == 1) {
            return new C1421fo(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1421fo generateLayoutParams(AttributeSet attributeSet) {
        return new C1421fo(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f5183b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f5183b;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f5183b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f5184c;
        if (this.f5185d == 1 && (i = this.f5186e & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f5187f) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f5187f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C1421fo) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f5183b;
    }

    public Drawable getDividerDrawable() {
        return this.f5192k;
    }

    public int getDividerPadding() {
        return this.f5196o;
    }

    public int getDividerWidth() {
        return this.f5193l;
    }

    public int getGravity() {
        return this.f5186e;
    }

    public int getOrientation() {
        return this.f5185d;
    }

    public int getShowDividers() {
        return this.f5195n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f5188g;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C1421fo generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1421fo ? new C1421fo((C1421fo) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1421fo((ViewGroup.MarginLayoutParams) layoutParams) : new C1421fo(layoutParams);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2818i(int i) {
        if (i == 0) {
            return (this.f5195n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f5195n & 4) != 0;
        }
        if ((this.f5195n & 2) != 0) {
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
        if (this.f5192k == null) {
            return;
        }
        int i2 = 0;
        if (this.f5185d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && m2818i(i2)) {
                    m2816d(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C1421fo) childAt.getLayoutParams())).topMargin) - this.f5194m);
                }
                i2++;
            }
            if (m2818i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                m2816d(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f5194m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C1421fo) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m2818i(i2)) {
                C1421fo c1421fo = (C1421fo) childAt3.getLayoutParams();
                m2817e(canvas, z ? childAt3.getRight() + ((LinearLayout.LayoutParams) c1421fo).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c1421fo).leftMargin) - this.f5193l);
            }
            i2++;
        }
        if (m2818i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C1421fo c1421fo2 = (C1421fo) childAt4.getLayoutParams();
                if (z) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c1421fo2).leftMargin;
                    i = this.f5193l;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c1421fo2).rightMargin;
                }
            } else if (z) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f5193l;
                right = left - i;
            }
            m2817e(canvas, right);
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
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int measuredHeight;
        char c;
        int i12;
        int i13;
        int i14;
        int i15 = 8;
        char c2 = 2;
        if (this.f5185d == 1) {
            int paddingLeft = getPaddingLeft();
            int i16 = i3 - i;
            int paddingRight = i16 - getPaddingRight();
            int paddingRight2 = (i16 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i17 = this.f5186e;
            int i18 = i17 & 112;
            int i19 = 8388615 & i17;
            int paddingTop = i18 != 16 ? i18 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f5187f : getPaddingTop() + (((i4 - i2) - this.f5187f) / 2);
            int i20 = 0;
            while (i20 < virtualChildCount) {
                View childAt = getChildAt(i20);
                if (childAt == null || childAt.getVisibility() == i15) {
                    c = c2;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    C1421fo c1421fo = (C1421fo) childAt.getLayoutParams();
                    c = c2;
                    int i21 = ((LinearLayout.LayoutParams) c1421fo).gravity;
                    if (i21 < 0) {
                        i21 = i19;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i21, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i12 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c1421fo).leftMargin;
                        i13 = ((LinearLayout.LayoutParams) c1421fo).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i14 = ((LinearLayout.LayoutParams) c1421fo).leftMargin + paddingLeft;
                        if (m2818i(i20)) {
                            paddingTop += this.f5194m;
                        }
                        int i22 = paddingTop + ((LinearLayout.LayoutParams) c1421fo).topMargin;
                        childAt.layout(i14, i22, measuredWidth + i14, i22 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c1421fo).bottomMargin + i22;
                    } else {
                        i12 = paddingRight - measuredWidth;
                        i13 = ((LinearLayout.LayoutParams) c1421fo).rightMargin;
                    }
                    i14 = i12 - i13;
                    if (m2818i(i20)) {
                    }
                    int i222 = paddingTop + ((LinearLayout.LayoutParams) c1421fo).topMargin;
                    childAt.layout(i14, i222, measuredWidth + i14, i222 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c1421fo).bottomMargin + i222;
                }
                i20++;
                c2 = c;
                i15 = 8;
            }
            return;
        }
        boolean z2 = getLayoutDirection() == 1;
        int paddingTop2 = getPaddingTop();
        int i23 = i4 - i2;
        int paddingBottom = i23 - getPaddingBottom();
        int paddingBottom2 = (i23 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i24 = this.f5186e;
        int i25 = 8388615 & i24;
        int i26 = i24 & 112;
        boolean z3 = this.f5182a;
        int[] iArr = this.f5190i;
        int[] iArr2 = this.f5191j;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i25, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.f5187f : getPaddingLeft() + (((i3 - i) - this.f5187f) / 2);
        if (z2) {
            i6 = virtualChildCount2 - 1;
            i5 = -1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i27 = 0;
        while (i27 < virtualChildCount2) {
            int i28 = (i5 * i27) + i6;
            View childAt2 = getChildAt(i28);
            if (childAt2 == null) {
                i7 = i6;
            } else {
                i7 = i6;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    C1421fo c1421fo2 = (C1421fo) childAt2.getLayoutParams();
                    int i29 = paddingLeft2;
                    if (z3) {
                        i8 = paddingTop2;
                        int baseline = ((LinearLayout.LayoutParams) c1421fo2).height != -1 ? childAt2.getBaseline() : -1;
                        i9 = ((LinearLayout.LayoutParams) c1421fo2).gravity;
                        if (i9 < 0) {
                            i9 = i26;
                        }
                        i10 = i9 & 112;
                        if (i10 == 16) {
                            if (i10 == 48) {
                                i11 = i8 + ((LinearLayout.LayoutParams) c1421fo2).topMargin;
                                if (baseline != -1) {
                                    i11 = (iArr[1] - baseline) + i11;
                                }
                            } else if (i10 != 80) {
                                i11 = i8;
                            } else {
                                i11 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) c1421fo2).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            int i30 = (m2818i(i28) ? i29 + this.f5193l : i29) + ((LinearLayout.LayoutParams) c1421fo2).leftMargin;
                            childAt2.layout(i30, i11, i30 + measuredWidth2, i11 + measuredHeight3);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c1421fo2).rightMargin + i30;
                            i27++;
                            i6 = i7;
                            paddingTop2 = i8;
                        } else {
                            i11 = ((paddingBottom2 - measuredHeight3) / 2) + i8 + ((LinearLayout.LayoutParams) c1421fo2).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) c1421fo2).bottomMargin;
                        }
                        i11 -= measuredHeight;
                        int i302 = (m2818i(i28) ? i29 + this.f5193l : i29) + ((LinearLayout.LayoutParams) c1421fo2).leftMargin;
                        childAt2.layout(i302, i11, i302 + measuredWidth2, i11 + measuredHeight3);
                        paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c1421fo2).rightMargin + i302;
                        i27++;
                        i6 = i7;
                        paddingTop2 = i8;
                    } else {
                        i8 = paddingTop2;
                    }
                    i9 = ((LinearLayout.LayoutParams) c1421fo2).gravity;
                    if (i9 < 0) {
                    }
                    i10 = i9 & 112;
                    if (i10 == 16) {
                    }
                    i11 -= measuredHeight;
                    int i3022 = (m2818i(i28) ? i29 + this.f5193l : i29) + ((LinearLayout.LayoutParams) c1421fo2).leftMargin;
                    childAt2.layout(i3022, i11, i3022 + measuredWidth2, i11 + measuredHeight3);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c1421fo2).rightMargin + i3022;
                    i27++;
                    i6 = i7;
                    paddingTop2 = i8;
                }
            }
            i8 = paddingTop2;
            i27++;
            i6 = i7;
            paddingTop2 = i8;
        }
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
    */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int iMax;
        int i6;
        int i7;
        int baseline;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        int i11;
        boolean z;
        boolean z2;
        C1421fo c1421fo;
        int i12;
        int[] iArr2;
        int i13;
        View view;
        int i14;
        boolean z3;
        boolean z4;
        int iMax2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z5;
        int i23;
        int i24;
        int i25;
        View view2;
        boolean z6;
        AbstractC1465go abstractC1465go = this;
        int i26 = -2;
        int iMax3 = 0;
        int i27 = 1073741824;
        int i28 = 8;
        if (abstractC1465go.f5185d == 1) {
            abstractC1465go.f5187f = 0;
            int virtualChildCount = abstractC1465go.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i29 = abstractC1465go.f5183b;
            boolean z7 = abstractC1465go.f5189h;
            int i30 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            boolean z8 = false;
            int i31 = 0;
            boolean z9 = false;
            boolean z10 = true;
            float f = 0.0f;
            int iMax6 = 0;
            while (i30 < virtualChildCount) {
                int i32 = mode;
                View childAt = abstractC1465go.getChildAt(i30);
                if (childAt == null) {
                    abstractC1465go.f5187f = abstractC1465go.f5187f;
                } else {
                    if (childAt.getVisibility() != i28) {
                        if (abstractC1465go.m2818i(i30)) {
                            abstractC1465go.f5187f += abstractC1465go.f5194m;
                        }
                        C1421fo c1421fo2 = (C1421fo) childAt.getLayoutParams();
                        float f2 = ((LinearLayout.LayoutParams) c1421fo2).weight;
                        f += f2;
                        if (mode2 == i27 && ((LinearLayout.LayoutParams) c1421fo2).height == 0 && f2 > 0.0f) {
                            int i33 = abstractC1465go.f5187f;
                            abstractC1465go.f5187f = Math.max(i33, ((LinearLayout.LayoutParams) c1421fo2).topMargin + i33 + ((LinearLayout.LayoutParams) c1421fo2).bottomMargin);
                            view2 = childAt;
                            i22 = mode2;
                            i23 = i29;
                            z5 = z7;
                            i24 = i30;
                            z8 = true;
                            i25 = i32;
                        } else {
                            if (((LinearLayout.LayoutParams) c1421fo2).height != 0 || f2 <= 0.0f) {
                                i19 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) c1421fo2).height = i26;
                                i19 = 0;
                            }
                            if (f == 0.0f) {
                                i20 = i30;
                                i21 = abstractC1465go.f5187f;
                            } else {
                                i20 = i30;
                                i21 = 0;
                            }
                            i22 = mode2;
                            z5 = z7;
                            i23 = i29;
                            i24 = i20;
                            i25 = i32;
                            abstractC1465go.measureChildWithMargins(childAt, i, 0, i2, i21);
                            if (i19 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) c1421fo2).height = i19;
                            }
                            int measuredHeight = childAt.getMeasuredHeight();
                            int i34 = abstractC1465go.f5187f;
                            view2 = childAt;
                            abstractC1465go.f5187f = Math.max(i34, i34 + measuredHeight + ((LinearLayout.LayoutParams) c1421fo2).topMargin + ((LinearLayout.LayoutParams) c1421fo2).bottomMargin);
                            if (z5) {
                                iMax6 = Math.max(measuredHeight, iMax6);
                            }
                        }
                        if (i23 >= 0 && i23 == i24 + 1) {
                            abstractC1465go.f5184c = abstractC1465go.f5187f;
                        }
                        if (i24 < i23 && ((LinearLayout.LayoutParams) c1421fo2).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i25 == 1073741824 || ((LinearLayout.LayoutParams) c1421fo2).width != -1) {
                            z6 = false;
                        } else {
                            z6 = true;
                            z9 = true;
                        }
                        int i35 = ((LinearLayout.LayoutParams) c1421fo2).leftMargin + ((LinearLayout.LayoutParams) c1421fo2).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i35;
                        iMax3 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z11 = z6;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i31, measuredState);
                        if (z10) {
                            i31 = iCombineMeasuredStates;
                            boolean z12 = ((LinearLayout.LayoutParams) c1421fo2).width == -1;
                            if (((LinearLayout.LayoutParams) c1421fo2).weight <= 0.0f) {
                                if (!z11) {
                                    i35 = measuredWidth;
                                }
                                iMax5 = Math.max(iMax5, i35);
                            } else {
                                if (!z11) {
                                    i35 = measuredWidth;
                                }
                                iMax4 = Math.max(iMax4, i35);
                            }
                            z10 = z12;
                        } else {
                            i31 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) c1421fo2).weight <= 0.0f) {
                        }
                        z10 = z12;
                    }
                    i30 = i24 + 1;
                    i29 = i23;
                    mode = i25;
                    z7 = z5;
                    mode2 = i22;
                    i26 = -2;
                    i27 = 1073741824;
                    i28 = 8;
                }
                i22 = mode2;
                i23 = i29;
                z5 = z7;
                i24 = i30;
                i25 = i32;
                i30 = i24 + 1;
                i29 = i23;
                mode = i25;
                z7 = z5;
                mode2 = i22;
                i26 = -2;
                i27 = 1073741824;
                i28 = 8;
            }
            int i36 = mode;
            int i37 = mode2;
            boolean z13 = z7;
            int i38 = i31;
            int i39 = i2;
            if (abstractC1465go.f5187f > 0 && abstractC1465go.m2818i(virtualChildCount)) {
                abstractC1465go.f5187f += abstractC1465go.f5194m;
            }
            if (z13 && (i37 == Integer.MIN_VALUE || i37 == 0)) {
                abstractC1465go.f5187f = 0;
                for (int i40 = 0; i40 < virtualChildCount; i40++) {
                    View childAt2 = abstractC1465go.getChildAt(i40);
                    if (childAt2 == null) {
                        abstractC1465go.f5187f = abstractC1465go.f5187f;
                    } else if (childAt2.getVisibility() != 8) {
                        C1421fo c1421fo3 = (C1421fo) childAt2.getLayoutParams();
                        int i41 = abstractC1465go.f5187f;
                        abstractC1465go.f5187f = Math.max(i41, i41 + iMax6 + ((LinearLayout.LayoutParams) c1421fo3).topMargin + ((LinearLayout.LayoutParams) c1421fo3).bottomMargin);
                    }
                }
            }
            int paddingBottom = abstractC1465go.getPaddingBottom() + abstractC1465go.getPaddingTop() + abstractC1465go.f5187f;
            abstractC1465go.f5187f = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, abstractC1465go.getSuggestedMinimumHeight()), i39, 0);
            int i42 = (iResolveSizeAndState & 16777215) - abstractC1465go.f5187f;
            if (z8 || (i42 != 0 && f > 0.0f)) {
                float f3 = abstractC1465go.f5188g;
                if (f3 > 0.0f) {
                    f = f3;
                }
                abstractC1465go.f5187f = 0;
                int iCombineMeasuredStates2 = i38;
                int i43 = 0;
                while (i43 < virtualChildCount) {
                    View childAt3 = abstractC1465go.getChildAt(i43);
                    if (childAt3.getVisibility() == 8) {
                        i16 = i43;
                    } else {
                        C1421fo c1421fo4 = (C1421fo) childAt3.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) c1421fo4).weight;
                        if (f4 > 0.0f) {
                            int i44 = (int) ((i42 * f4) / f);
                            f -= f4;
                            i42 -= i44;
                            i16 = i43;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, abstractC1465go.getPaddingRight() + abstractC1465go.getPaddingLeft() + ((LinearLayout.LayoutParams) c1421fo4).leftMargin + ((LinearLayout.LayoutParams) c1421fo4).rightMargin, ((LinearLayout.LayoutParams) c1421fo4).width);
                            if (((LinearLayout.LayoutParams) c1421fo4).height == 0) {
                                i18 = 1073741824;
                                if (i37 == 1073741824) {
                                    if (i44 <= 0) {
                                        i44 = 0;
                                    }
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i44, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                            } else {
                                i18 = 1073741824;
                            }
                            int measuredHeight2 = childAt3.getMeasuredHeight() + i44;
                            if (measuredHeight2 < 0) {
                                measuredHeight2 = 0;
                            }
                            childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i18));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt3.getMeasuredState() & (-256));
                        } else {
                            i16 = i43;
                        }
                        int i45 = ((LinearLayout.LayoutParams) c1421fo4).leftMargin + ((LinearLayout.LayoutParams) c1421fo4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i45;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i36 != 1073741824) {
                            i17 = -1;
                            if (((LinearLayout.LayoutParams) c1421fo4).width == -1) {
                                measuredWidth2 = i45;
                            }
                        } else {
                            i17 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z14 = z10 && ((LinearLayout.LayoutParams) c1421fo4).width == i17;
                        int i46 = abstractC1465go.f5187f;
                        abstractC1465go.f5187f = Math.max(i46, childAt3.getMeasuredHeight() + i46 + ((LinearLayout.LayoutParams) c1421fo4).topMargin + ((LinearLayout.LayoutParams) c1421fo4).bottomMargin);
                        z10 = z14;
                    }
                    i43 = i16 + 1;
                }
                abstractC1465go.f5187f = abstractC1465go.getPaddingBottom() + abstractC1465go.getPaddingTop() + abstractC1465go.f5187f;
                i38 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z13 && i37 != 1073741824) {
                    for (int i47 = 0; i47 < virtualChildCount; i47++) {
                        View childAt4 = abstractC1465go.getChildAt(i47);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C1421fo) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z10 || i36 == 1073741824) {
                iMax4 = iMax3;
            }
            abstractC1465go.setMeasuredDimension(View.resolveSizeAndState(Math.max(abstractC1465go.getPaddingRight() + abstractC1465go.getPaddingLeft() + iMax4, abstractC1465go.getSuggestedMinimumWidth()), i, i38), iResolveSizeAndState);
            if (z9) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(abstractC1465go.getMeasuredWidth(), 1073741824);
                int i48 = 0;
                while (i48 < virtualChildCount) {
                    View childAt5 = abstractC1465go.getChildAt(i48);
                    if (childAt5.getVisibility() != 8) {
                        C1421fo c1421fo5 = (C1421fo) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c1421fo5).width == -1) {
                            int i49 = ((LinearLayout.LayoutParams) c1421fo5).height;
                            ((LinearLayout.LayoutParams) c1421fo5).height = childAt5.getMeasuredHeight();
                            abstractC1465go.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i39, 0);
                            ((LinearLayout.LayoutParams) c1421fo5).height = i49;
                        }
                    }
                    i48++;
                    i39 = i2;
                }
                return;
            }
            return;
        }
        int i50 = i;
        abstractC1465go.f5187f = 0;
        int virtualChildCount2 = abstractC1465go.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i50);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (abstractC1465go.f5190i == null || abstractC1465go.f5191j == null) {
            abstractC1465go.f5190i = new int[4];
            abstractC1465go.f5191j = new int[4];
        }
        int[] iArr3 = abstractC1465go.f5190i;
        int[] iArr4 = abstractC1465go.f5191j;
        iArr3[3] = -1;
        char c = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z15 = abstractC1465go.f5182a;
        boolean z16 = abstractC1465go.f5189h;
        boolean z17 = mode3 == 1073741824;
        float f5 = 0.0f;
        boolean z18 = true;
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        int iMax7 = 0;
        int iMax8 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z19 = false;
        boolean z20 = false;
        while (i51 < virtualChildCount2) {
            char c2 = c;
            View childAt6 = abstractC1465go.getChildAt(i51);
            if (childAt6 == null) {
                abstractC1465go.f5187f = abstractC1465go.f5187f;
                i11 = i51;
                i15 = i53;
                iArr2 = iArr3;
                iArr = iArr4;
                z = z15;
                z2 = z16;
            } else {
                int i54 = i52;
                if (childAt6.getVisibility() == 8) {
                    i50 = i;
                    i11 = i51;
                    i15 = i53;
                    iArr = iArr4;
                    z = z15;
                    z2 = z16;
                    i52 = i54;
                    iArr2 = iArr3;
                } else {
                    if (abstractC1465go.m2818i(i51)) {
                        abstractC1465go.f5187f += abstractC1465go.f5193l;
                    }
                    C1421fo c1421fo6 = (C1421fo) childAt6.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) c1421fo6).weight;
                    f5 += f6;
                    int i55 = i51;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c1421fo6).width == 0 && f6 > 0.0f) {
                        if (z17) {
                            abstractC1465go.f5187f = ((LinearLayout.LayoutParams) c1421fo6).leftMargin + ((LinearLayout.LayoutParams) c1421fo6).rightMargin + abstractC1465go.f5187f;
                        } else {
                            int i56 = abstractC1465go.f5187f;
                            abstractC1465go.f5187f = Math.max(i56, ((LinearLayout.LayoutParams) c1421fo6).leftMargin + i56 + ((LinearLayout.LayoutParams) c1421fo6).rightMargin);
                        }
                        if (z15) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z = z15;
                            z2 = z16;
                            i12 = i54;
                            i11 = i55;
                            c1421fo = c1421fo6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i50 = i;
                            i13 = i53;
                            i10 = iMax7;
                        } else {
                            view = childAt6;
                            z = z15;
                            z2 = z16;
                            z20 = true;
                            i12 = i54;
                            i11 = i55;
                            i14 = 1073741824;
                            c1421fo = c1421fo6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i50 = i;
                            i13 = i53;
                            i10 = iMax7;
                            if (mode4 == i14 && ((LinearLayout.LayoutParams) c1421fo).height == -1) {
                                z3 = true;
                                z19 = true;
                            } else {
                                z3 = false;
                            }
                            int i57 = ((LinearLayout.LayoutParams) c1421fo).topMargin + ((LinearLayout.LayoutParams) c1421fo).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i57;
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                            if (z) {
                                z4 = z3;
                            } else {
                                int baseline2 = view.getBaseline();
                                z4 = z3;
                                if (baseline2 != -1) {
                                    int i58 = ((LinearLayout.LayoutParams) c1421fo).gravity;
                                    if (i58 < 0) {
                                        i58 = abstractC1465go.f5186e;
                                    }
                                    int i59 = (((i58 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i59] = Math.max(iArr2[i59], baseline2);
                                    iArr[i59] = Math.max(iArr[i59], measuredHeight3 - baseline2);
                                }
                            }
                            int iMax9 = Math.max(i12, measuredHeight3);
                            boolean z21 = !z18 && ((LinearLayout.LayoutParams) c1421fo).height == -1;
                            if (((LinearLayout.LayoutParams) c1421fo).weight <= 0.0f) {
                                if (!z4) {
                                    i57 = measuredHeight3;
                                }
                                iMax7 = Math.max(i10, i57);
                                iMax2 = i13;
                            } else {
                                if (!z4) {
                                    i57 = measuredHeight3;
                                }
                                iMax2 = Math.max(i13, i57);
                                iMax7 = i10;
                            }
                            int i60 = iMax2;
                            i52 = iMax9;
                            i15 = i60;
                            z18 = z21;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) c1421fo6).width != 0 || f6 <= 0.0f) {
                            i9 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) c1421fo6).width = -2;
                            i9 = 0;
                        }
                        iArr = iArr4;
                        i10 = iMax7;
                        i11 = i55;
                        z = z15;
                        z2 = z16;
                        int i61 = i9;
                        c1421fo = c1421fo6;
                        i12 = i54;
                        i50 = i;
                        iArr2 = iArr3;
                        i13 = i53;
                        abstractC1465go.measureChildWithMargins(childAt6, i50, f5 == 0.0f ? abstractC1465go.f5187f : 0, i2, 0);
                        if (i61 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c1421fo).width = i61;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z17) {
                            view = childAt6;
                            abstractC1465go.f5187f = ((LinearLayout.LayoutParams) c1421fo).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) c1421fo).rightMargin + abstractC1465go.f5187f;
                        } else {
                            view = childAt6;
                            int i62 = abstractC1465go.f5187f;
                            abstractC1465go.f5187f = Math.max(i62, i62 + measuredWidth3 + ((LinearLayout.LayoutParams) c1421fo).leftMargin + ((LinearLayout.LayoutParams) c1421fo).rightMargin);
                        }
                        if (z2) {
                            iMax8 = Math.max(measuredWidth3, iMax8);
                        }
                    }
                    i14 = 1073741824;
                    if (mode4 == i14) {
                        z3 = false;
                        int i572 = ((LinearLayout.LayoutParams) c1421fo).topMargin + ((LinearLayout.LayoutParams) c1421fo).bottomMargin;
                        int measuredHeight32 = view.getMeasuredHeight() + i572;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z) {
                        }
                        int iMax92 = Math.max(i12, measuredHeight32);
                        if (z18) {
                            if (((LinearLayout.LayoutParams) c1421fo).weight <= 0.0f) {
                            }
                            int i602 = iMax2;
                            i52 = iMax92;
                            i15 = i602;
                            z18 = z21;
                        }
                    }
                }
            }
            i53 = i15;
            i51 = i11 + 1;
            c = c2;
            iArr3 = iArr2;
            iArr4 = iArr;
            z15 = z;
            z16 = z2;
        }
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        char c3 = c;
        boolean z22 = z15;
        boolean z23 = z16;
        int i63 = i52;
        int i64 = i53;
        int i65 = iMax7;
        if (abstractC1465go.f5187f > 0 && abstractC1465go.m2818i(virtualChildCount2)) {
            abstractC1465go.f5187f += abstractC1465go.f5193l;
        }
        int i66 = iArr5[1];
        int iMax10 = (i66 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) ? i63 : Math.max(i63, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i66, iArr5[c3]))));
        if (z23 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            abstractC1465go.f5187f = 0;
            for (int i67 = 0; i67 < virtualChildCount2; i67++) {
                View childAt7 = abstractC1465go.getChildAt(i67);
                if (childAt7 == null) {
                    abstractC1465go.f5187f = abstractC1465go.f5187f;
                } else if (childAt7.getVisibility() != 8) {
                    C1421fo c1421fo7 = (C1421fo) childAt7.getLayoutParams();
                    if (z17) {
                        abstractC1465go.f5187f = ((LinearLayout.LayoutParams) c1421fo7).leftMargin + iMax8 + ((LinearLayout.LayoutParams) c1421fo7).rightMargin + abstractC1465go.f5187f;
                    } else {
                        int i68 = abstractC1465go.f5187f;
                        abstractC1465go.f5187f = Math.max(i68, i68 + iMax8 + ((LinearLayout.LayoutParams) c1421fo7).leftMargin + ((LinearLayout.LayoutParams) c1421fo7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = abstractC1465go.getPaddingRight() + abstractC1465go.getPaddingLeft() + abstractC1465go.f5187f;
        abstractC1465go.f5187f = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, abstractC1465go.getSuggestedMinimumWidth()), i50, 0);
        int i69 = (iResolveSizeAndState2 & 16777215) - abstractC1465go.f5187f;
        if (z20 || (i69 != 0 && f5 > 0.0f)) {
            float f7 = abstractC1465go.f5188g;
            if (f7 > 0.0f) {
                f5 = f7;
            }
            iArr5[3] = -1;
            iArr5[c3] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[c3] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            abstractC1465go.f5187f = 0;
            iMax10 = -1;
            int i70 = 0;
            while (i70 < virtualChildCount2) {
                View childAt8 = abstractC1465go.getChildAt(i70);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i6 = iResolveSizeAndState2;
                } else {
                    C1421fo c1421fo8 = (C1421fo) childAt8.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) c1421fo8).weight;
                    if (f8 > 0.0f) {
                        int i71 = (int) ((i69 * f8) / f5);
                        f5 -= f8;
                        i69 -= i71;
                        i6 = iResolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, abstractC1465go.getPaddingBottom() + abstractC1465go.getPaddingTop() + ((LinearLayout.LayoutParams) c1421fo8).topMargin + ((LinearLayout.LayoutParams) c1421fo8).bottomMargin, ((LinearLayout.LayoutParams) c1421fo8).height);
                        if (((LinearLayout.LayoutParams) c1421fo8).width == 0) {
                            i8 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i71 <= 0) {
                                    i71 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i71, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i8 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i71;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i8), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i6 = iResolveSizeAndState2;
                    }
                    if (z17) {
                        abstractC1465go.f5187f = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1421fo8).leftMargin + ((LinearLayout.LayoutParams) c1421fo8).rightMargin + abstractC1465go.f5187f;
                    } else {
                        int i72 = abstractC1465go.f5187f;
                        abstractC1465go.f5187f = Math.max(i72, childAt8.getMeasuredWidth() + i72 + ((LinearLayout.LayoutParams) c1421fo8).leftMargin + ((LinearLayout.LayoutParams) c1421fo8).rightMargin);
                    }
                    boolean z24 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) c1421fo8).height == -1;
                    int i73 = ((LinearLayout.LayoutParams) c1421fo8).topMargin + ((LinearLayout.LayoutParams) c1421fo8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i73;
                    iMax10 = Math.max(iMax10, measuredHeight4);
                    if (!z24) {
                        i73 = measuredHeight4;
                    }
                    int iMax11 = Math.max(i64, i73);
                    if (z18) {
                        i7 = -1;
                        boolean z25 = ((LinearLayout.LayoutParams) c1421fo8).height == -1;
                        if (!z22 && (baseline = childAt8.getBaseline()) != i7) {
                            int i74 = ((LinearLayout.LayoutParams) c1421fo8).gravity;
                            if (i74 < 0) {
                                i74 = abstractC1465go.f5186e;
                            }
                            int i75 = (((i74 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i75] = Math.max(iArr5[i75], baseline);
                            iArr6[i75] = Math.max(iArr6[i75], measuredHeight4 - baseline);
                        }
                        z18 = z25;
                        i64 = iMax11;
                    } else {
                        i7 = -1;
                    }
                    if (!z22) {
                        z18 = z25;
                        i64 = iMax11;
                    }
                }
                i70++;
                iResolveSizeAndState2 = i6;
            }
            i3 = iResolveSizeAndState2;
            i4 = -16777216;
            abstractC1465go.f5187f = abstractC1465go.getPaddingRight() + abstractC1465go.getPaddingLeft() + abstractC1465go.f5187f;
            int i76 = iArr5[1];
            if (i76 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) {
                i5 = 0;
            } else {
                i5 = 0;
                iMax10 = Math.max(iMax10, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i76, iArr5[c3]))));
            }
            iMax = i64;
        } else {
            iMax = Math.max(i64, i65);
            if (z23 && mode3 != 1073741824) {
                for (int i77 = 0; i77 < virtualChildCount2; i77++) {
                    View childAt9 = abstractC1465go.getChildAt(i77);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C1421fo) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax8, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = iResolveSizeAndState2;
            i4 = -16777216;
            i5 = 0;
        }
        if (!z18 && mode4 != 1073741824) {
            iMax10 = iMax;
        }
        abstractC1465go.setMeasuredDimension(i3 | (iCombineMeasuredStates3 & i4), View.resolveSizeAndState(Math.max(abstractC1465go.getPaddingBottom() + abstractC1465go.getPaddingTop() + iMax10, abstractC1465go.getSuggestedMinimumHeight()), i2, iCombineMeasuredStates3 << 16));
        if (z19) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(abstractC1465go.getMeasuredHeight(), 1073741824);
            int i78 = i5;
            while (i78 < virtualChildCount2) {
                View childAt10 = abstractC1465go.getChildAt(i78);
                if (childAt10.getVisibility() != 8) {
                    C1421fo c1421fo9 = (C1421fo) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c1421fo9).height == -1) {
                        int i79 = ((LinearLayout.LayoutParams) c1421fo9).width;
                        ((LinearLayout.LayoutParams) c1421fo9).width = childAt10.getMeasuredWidth();
                        abstractC1465go.measureChildWithMargins(childAt10, i50, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) c1421fo9).width = i79;
                    }
                }
                i78++;
                abstractC1465go = this;
                i50 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f5182a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f5183b = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f5192k) {
            return;
        }
        this.f5192k = drawable;
        if (drawable != null) {
            this.f5193l = drawable.getIntrinsicWidth();
            this.f5194m = drawable.getIntrinsicHeight();
        } else {
            this.f5193l = 0;
            this.f5194m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f5196o = i;
    }

    public void setGravity(int i) {
        if (this.f5186e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f5186e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f5186e;
        if ((8388615 & i3) != i2) {
            this.f5186e = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f5189h = z;
    }

    public void setOrientation(int i) {
        if (this.f5185d != i) {
            this.f5185d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f5195n) {
            requestLayout();
        }
        this.f5195n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f5186e;
        if ((i3 & 112) != i2) {
            this.f5186e = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f5188g = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
