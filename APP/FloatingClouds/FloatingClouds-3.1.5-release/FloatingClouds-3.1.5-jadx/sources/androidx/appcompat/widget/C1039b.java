package androidx.appcompat.widget;

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
import androidx.appcompat.C0983R;
import p000a.C0751of;
import p000a.C0866ug;

/* JADX INFO: renamed from: androidx.appcompat.widget.b */
/* JADX INFO: loaded from: classes.dex */
public class C1039b extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public boolean f4108a;

    /* JADX INFO: renamed from: b */
    public int f4109b;

    /* JADX INFO: renamed from: c */
    public int f4110c;

    /* JADX INFO: renamed from: d */
    public int f4111d;

    /* JADX INFO: renamed from: e */
    public int f4112e;

    /* JADX INFO: renamed from: f */
    public int f4113f;

    /* JADX INFO: renamed from: g */
    public float f4114g;

    /* JADX INFO: renamed from: h */
    public boolean f4115h;

    /* JADX INFO: renamed from: i */
    public int[] f4116i;

    /* JADX INFO: renamed from: j */
    public int[] f4117j;

    /* JADX INFO: renamed from: k */
    public Drawable f4118k;

    /* JADX INFO: renamed from: l */
    public int f4119l;

    /* JADX INFO: renamed from: m */
    public int f4120m;

    /* JADX INFO: renamed from: n */
    public int f4121n;

    /* JADX INFO: renamed from: o */
    public int f4122o;

    /* JADX INFO: renamed from: androidx.appcompat.widget.b$a */
    public static class a extends LinearLayout.LayoutParams {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1039b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* JADX INFO: renamed from: f */
    public final void m2401f(Canvas canvas, int i) {
        this.f4118k.setBounds(getPaddingLeft() + this.f4122o, i, (getWidth() - getPaddingRight()) - this.f4122o, this.f4120m + i);
        this.f4118k.draw(canvas);
    }

    /* JADX INFO: renamed from: g */
    public final void m2402g(Canvas canvas, int i) {
        this.f4118k.setBounds(i, getPaddingTop() + this.f4122o, this.f4119l + i, (getHeight() - getPaddingBottom()) - this.f4122o);
        this.f4118k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f4109b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f4109b;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f4109b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f4110c;
        if (this.f4111d == 1 && (i = this.f4112e & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f4113f) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f4113f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f4109b;
    }

    public Drawable getDividerDrawable() {
        return this.f4118k;
    }

    public int getDividerPadding() {
        return this.f4122o;
    }

    public int getDividerWidth() {
        return this.f4119l;
    }

    public int getGravity() {
        return this.f4112e;
    }

    public int getOrientation() {
        return this.f4111d;
    }

    public int getShowDividers() {
        return this.f4121n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f4114g;
    }

    /* JADX DEBUG: Method merged with bridge method: generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i = this.f4111d;
        if (i == 0) {
            return new a(-2, -2);
        }
        if (i == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX DEBUG: Method merged with bridge method: generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams; */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2403k(int i) {
        if (i == 0) {
            return (this.f4121n & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f4121n & 4) != 0;
        }
        if ((this.f4121n & 2) != 0) {
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
        if (this.f4118k == null) {
            return;
        }
        int i2 = 0;
        if (this.f4111d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && m2403k(i2)) {
                    m2401f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.f4120m);
                }
                i2++;
            }
            if (m2403k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                m2401f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f4120m : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m2403k(i2)) {
                a aVar = (a) childAt3.getLayoutParams();
                m2402g(canvas, z ? childAt3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f4119l);
            }
            i2++;
        }
        if (m2403k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                a aVar2 = (a) childAt4.getLayoutParams();
                if (z) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i = this.f4119l;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (z) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f4119l;
                right = left - i;
            }
            m2402g(canvas, right);
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
        if (this.f4111d == 1) {
            int paddingLeft = getPaddingLeft();
            int i16 = i3 - i;
            int paddingRight = i16 - getPaddingRight();
            int paddingRight2 = (i16 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i17 = this.f4112e;
            int i18 = i17 & 112;
            int i19 = 8388615 & i17;
            int paddingTop = i18 != 16 ? i18 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f4113f : getPaddingTop() + (((i4 - i2) - this.f4113f) / 2);
            int i20 = 0;
            while (i20 < virtualChildCount) {
                View childAt = getChildAt(i20);
                if (childAt == null || childAt.getVisibility() == i15) {
                    c = c2;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    a aVar = (a) childAt.getLayoutParams();
                    c = c2;
                    int i21 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i21 < 0) {
                        i21 = i19;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i21, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i12 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                        i13 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i14 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                        if (m2403k(i20)) {
                            paddingTop += this.f4120m;
                        }
                        int i22 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                        childAt.layout(i14, i22, measuredWidth + i14, i22 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin + i22;
                    } else {
                        i12 = paddingRight - measuredWidth;
                        i13 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                    }
                    i14 = i12 - i13;
                    if (m2403k(i20)) {
                    }
                    int i222 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    childAt.layout(i14, i222, measuredWidth + i14, i222 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin + i222;
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
        int i24 = this.f4112e;
        int i25 = 8388615 & i24;
        int i26 = i24 & 112;
        boolean z3 = this.f4108a;
        int[] iArr = this.f4116i;
        int[] iArr2 = this.f4117j;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i25, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.f4113f : getPaddingLeft() + (((i3 - i) - this.f4113f) / 2);
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
                    a aVar2 = (a) childAt2.getLayoutParams();
                    int i29 = paddingLeft2;
                    if (z3) {
                        i8 = paddingTop2;
                        int baseline = ((LinearLayout.LayoutParams) aVar2).height != -1 ? childAt2.getBaseline() : -1;
                        i9 = ((LinearLayout.LayoutParams) aVar2).gravity;
                        if (i9 < 0) {
                            i9 = i26;
                        }
                        i10 = i9 & 112;
                        if (i10 == 16) {
                            if (i10 == 48) {
                                i11 = i8 + ((LinearLayout.LayoutParams) aVar2).topMargin;
                                if (baseline != -1) {
                                    i11 = (iArr[1] - baseline) + i11;
                                }
                            } else if (i10 != 80) {
                                i11 = i8;
                            } else {
                                i11 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            int i30 = (m2403k(i28) ? i29 + this.f4119l : i29) + ((LinearLayout.LayoutParams) aVar2).leftMargin;
                            childAt2.layout(i30, i11, i30 + measuredWidth2, i11 + measuredHeight3);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + i30;
                            i27++;
                            i6 = i7;
                            paddingTop2 = i8;
                        } else {
                            i11 = ((paddingBottom2 - measuredHeight3) / 2) + i8 + ((LinearLayout.LayoutParams) aVar2).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                        }
                        i11 -= measuredHeight;
                        int i302 = (m2403k(i28) ? i29 + this.f4119l : i29) + ((LinearLayout.LayoutParams) aVar2).leftMargin;
                        childAt2.layout(i302, i11, i302 + measuredWidth2, i11 + measuredHeight3);
                        paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + i302;
                        i27++;
                        i6 = i7;
                        paddingTop2 = i8;
                    } else {
                        i8 = paddingTop2;
                    }
                    i9 = ((LinearLayout.LayoutParams) aVar2).gravity;
                    if (i9 < 0) {
                    }
                    i10 = i9 & 112;
                    if (i10 == 16) {
                    }
                    i11 -= measuredHeight;
                    int i3022 = (m2403k(i28) ? i29 + this.f4119l : i29) + ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    childAt2.layout(i3022, i11, i3022 + measuredWidth2, i11 + measuredHeight3);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + i3022;
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

    /* JADX WARN: Removed duplicated region for block: B:228:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x079d  */
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
        a aVar;
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
        C1039b c1039b = this;
        int i26 = -2;
        int i27 = 1073741824;
        int i28 = 8;
        int iMax3 = 0;
        if (c1039b.f4111d == 1) {
            c1039b.f4113f = 0;
            int virtualChildCount = c1039b.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i29 = c1039b.f4109b;
            boolean z7 = c1039b.f4115h;
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
                View childAt = c1039b.getChildAt(i30);
                if (childAt == null) {
                    c1039b.f4113f = c1039b.f4113f;
                } else {
                    if (childAt.getVisibility() != i28) {
                        if (c1039b.m2403k(i30)) {
                            c1039b.f4113f += c1039b.f4120m;
                        }
                        a aVar2 = (a) childAt.getLayoutParams();
                        float f2 = ((LinearLayout.LayoutParams) aVar2).weight;
                        f += f2;
                        if (mode2 == i27 && ((LinearLayout.LayoutParams) aVar2).height == 0 && f2 > 0.0f) {
                            int i33 = c1039b.f4113f;
                            c1039b.f4113f = Math.max(i33, ((LinearLayout.LayoutParams) aVar2).topMargin + i33 + ((LinearLayout.LayoutParams) aVar2).bottomMargin);
                            view2 = childAt;
                            i22 = mode2;
                            i23 = i29;
                            z5 = z7;
                            i24 = i30;
                            z8 = true;
                            i25 = i32;
                        } else {
                            if (((LinearLayout.LayoutParams) aVar2).height != 0 || f2 <= 0.0f) {
                                i19 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) aVar2).height = i26;
                                i19 = 0;
                            }
                            if (f == 0.0f) {
                                i20 = i30;
                                i21 = c1039b.f4113f;
                            } else {
                                i20 = i30;
                                i21 = 0;
                            }
                            i22 = mode2;
                            z5 = z7;
                            i23 = i29;
                            i24 = i20;
                            i25 = i32;
                            c1039b.measureChildWithMargins(childAt, i, 0, i2, i21);
                            if (i19 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) aVar2).height = i19;
                            }
                            int measuredHeight = childAt.getMeasuredHeight();
                            int i34 = c1039b.f4113f;
                            view2 = childAt;
                            c1039b.f4113f = Math.max(i34, i34 + measuredHeight + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin);
                            if (z5) {
                                iMax6 = Math.max(measuredHeight, iMax6);
                            }
                        }
                        if (i23 >= 0 && i23 == i24 + 1) {
                            c1039b.f4110c = c1039b.f4113f;
                        }
                        if (i24 < i23 && ((LinearLayout.LayoutParams) aVar2).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i25 == 1073741824 || ((LinearLayout.LayoutParams) aVar2).width != -1) {
                            z6 = false;
                        } else {
                            z6 = true;
                            z9 = true;
                        }
                        int i35 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i35;
                        int iMax7 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z11 = z6;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i31, measuredState);
                        if (z10) {
                            i31 = iCombineMeasuredStates;
                            boolean z12 = ((LinearLayout.LayoutParams) aVar2).width == -1;
                            if (((LinearLayout.LayoutParams) aVar2).weight <= 0.0f) {
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
                            iMax3 = iMax7;
                        } else {
                            i31 = iCombineMeasuredStates;
                        }
                        if (((LinearLayout.LayoutParams) aVar2).weight <= 0.0f) {
                        }
                        z10 = z12;
                        iMax3 = iMax7;
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
            if (c1039b.f4113f > 0 && c1039b.m2403k(virtualChildCount)) {
                c1039b.f4113f += c1039b.f4120m;
            }
            if (z13 && (i37 == Integer.MIN_VALUE || i37 == 0)) {
                c1039b.f4113f = 0;
                for (int i40 = 0; i40 < virtualChildCount; i40++) {
                    View childAt2 = c1039b.getChildAt(i40);
                    if (childAt2 == null) {
                        c1039b.f4113f = c1039b.f4113f;
                    } else if (childAt2.getVisibility() != 8) {
                        a aVar3 = (a) childAt2.getLayoutParams();
                        int i41 = c1039b.f4113f;
                        c1039b.f4113f = Math.max(i41, i41 + iMax6 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                    }
                }
            }
            int paddingBottom = c1039b.getPaddingBottom() + c1039b.getPaddingTop() + c1039b.f4113f;
            c1039b.f4113f = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, c1039b.getSuggestedMinimumHeight()), i39, 0);
            int i42 = (iResolveSizeAndState & 16777215) - c1039b.f4113f;
            if (z8 || (i42 != 0 && f > 0.0f)) {
                float f3 = c1039b.f4114g;
                if (f3 > 0.0f) {
                    f = f3;
                }
                c1039b.f4113f = 0;
                int iCombineMeasuredStates2 = i38;
                int i43 = 0;
                while (i43 < virtualChildCount) {
                    View childAt3 = c1039b.getChildAt(i43);
                    if (childAt3.getVisibility() == 8) {
                        i16 = i43;
                    } else {
                        a aVar4 = (a) childAt3.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) aVar4).weight;
                        if (f4 > 0.0f) {
                            int i44 = (int) ((i42 * f4) / f);
                            f -= f4;
                            i42 -= i44;
                            i16 = i43;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, c1039b.getPaddingRight() + c1039b.getPaddingLeft() + ((LinearLayout.LayoutParams) aVar4).leftMargin + ((LinearLayout.LayoutParams) aVar4).rightMargin, ((LinearLayout.LayoutParams) aVar4).width);
                            if (((LinearLayout.LayoutParams) aVar4).height == 0) {
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
                        int i45 = ((LinearLayout.LayoutParams) aVar4).leftMargin + ((LinearLayout.LayoutParams) aVar4).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i45;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i36 != 1073741824) {
                            i17 = -1;
                            if (((LinearLayout.LayoutParams) aVar4).width == -1) {
                                measuredWidth2 = i45;
                            }
                        } else {
                            i17 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z14 = z10 && ((LinearLayout.LayoutParams) aVar4).width == i17;
                        int i46 = c1039b.f4113f;
                        c1039b.f4113f = Math.max(i46, childAt3.getMeasuredHeight() + i46 + ((LinearLayout.LayoutParams) aVar4).topMargin + ((LinearLayout.LayoutParams) aVar4).bottomMargin);
                        z10 = z14;
                    }
                    i43 = i16 + 1;
                }
                c1039b.f4113f = c1039b.getPaddingBottom() + c1039b.getPaddingTop() + c1039b.f4113f;
                i38 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z13 && i37 != 1073741824) {
                    for (int i47 = 0; i47 < virtualChildCount; i47++) {
                        View childAt4 = c1039b.getChildAt(i47);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z10 || i36 == 1073741824) {
                iMax4 = iMax3;
            }
            c1039b.setMeasuredDimension(View.resolveSizeAndState(Math.max(c1039b.getPaddingRight() + c1039b.getPaddingLeft() + iMax4, c1039b.getSuggestedMinimumWidth()), i, i38), iResolveSizeAndState);
            if (z9) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c1039b.getMeasuredWidth(), 1073741824);
                int i48 = 0;
                while (i48 < virtualChildCount) {
                    View childAt5 = c1039b.getChildAt(i48);
                    if (childAt5.getVisibility() != 8) {
                        a aVar5 = (a) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) aVar5).width == -1) {
                            int i49 = ((LinearLayout.LayoutParams) aVar5).height;
                            ((LinearLayout.LayoutParams) aVar5).height = childAt5.getMeasuredHeight();
                            c1039b.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i39, 0);
                            ((LinearLayout.LayoutParams) aVar5).height = i49;
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
        c1039b.f4113f = 0;
        int virtualChildCount2 = c1039b.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i50);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (c1039b.f4116i == null || c1039b.f4117j == null) {
            c1039b.f4116i = new int[4];
            c1039b.f4117j = new int[4];
        }
        int[] iArr3 = c1039b.f4116i;
        int[] iArr4 = c1039b.f4117j;
        iArr3[3] = -1;
        char c = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z15 = c1039b.f4108a;
        boolean z16 = c1039b.f4115h;
        boolean z17 = mode3 == 1073741824;
        float f5 = 0.0f;
        boolean z18 = true;
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        int iMax8 = 0;
        int iMax9 = 0;
        int iCombineMeasuredStates3 = 0;
        boolean z19 = false;
        boolean z20 = false;
        while (i51 < virtualChildCount2) {
            char c2 = c;
            View childAt6 = c1039b.getChildAt(i51);
            if (childAt6 == null) {
                c1039b.f4113f = c1039b.f4113f;
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
                    if (c1039b.m2403k(i51)) {
                        c1039b.f4113f += c1039b.f4119l;
                    }
                    a aVar6 = (a) childAt6.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) aVar6).weight;
                    f5 += f6;
                    int i55 = i51;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) aVar6).width == 0 && f6 > 0.0f) {
                        if (z17) {
                            c1039b.f4113f = ((LinearLayout.LayoutParams) aVar6).leftMargin + ((LinearLayout.LayoutParams) aVar6).rightMargin + c1039b.f4113f;
                        } else {
                            int i56 = c1039b.f4113f;
                            c1039b.f4113f = Math.max(i56, ((LinearLayout.LayoutParams) aVar6).leftMargin + i56 + ((LinearLayout.LayoutParams) aVar6).rightMargin);
                        }
                        if (z15) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z = z15;
                            z2 = z16;
                            i12 = i54;
                            i11 = i55;
                            aVar = aVar6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i50 = i;
                            i13 = i53;
                            i10 = iMax8;
                        } else {
                            view = childAt6;
                            z = z15;
                            z2 = z16;
                            z20 = true;
                            i12 = i54;
                            i11 = i55;
                            i14 = 1073741824;
                            aVar = aVar6;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i50 = i;
                            i13 = i53;
                            i10 = iMax8;
                            if (mode4 == i14 && ((LinearLayout.LayoutParams) aVar).height == -1) {
                                z3 = true;
                                z19 = true;
                            } else {
                                z3 = false;
                            }
                            int i57 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i57;
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                            if (z) {
                                z4 = z3;
                            } else {
                                int baseline2 = view.getBaseline();
                                z4 = z3;
                                if (baseline2 != -1) {
                                    int i58 = ((LinearLayout.LayoutParams) aVar).gravity;
                                    if (i58 < 0) {
                                        i58 = c1039b.f4112e;
                                    }
                                    int i59 = (((i58 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i59] = Math.max(iArr2[i59], baseline2);
                                    iArr[i59] = Math.max(iArr[i59], measuredHeight3 - baseline2);
                                }
                            }
                            int iMax10 = Math.max(i12, measuredHeight3);
                            boolean z21 = !z18 && ((LinearLayout.LayoutParams) aVar).height == -1;
                            if (((LinearLayout.LayoutParams) aVar).weight <= 0.0f) {
                                if (!z4) {
                                    i57 = measuredHeight3;
                                }
                                iMax8 = Math.max(i10, i57);
                                iMax2 = i13;
                            } else {
                                if (!z4) {
                                    i57 = measuredHeight3;
                                }
                                iMax2 = Math.max(i13, i57);
                                iMax8 = i10;
                            }
                            int i60 = iMax2;
                            i52 = iMax10;
                            i15 = i60;
                            z18 = z21;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) aVar6).width != 0 || f6 <= 0.0f) {
                            i9 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) aVar6).width = -2;
                            i9 = 0;
                        }
                        iArr = iArr4;
                        i10 = iMax8;
                        i11 = i55;
                        z = z15;
                        z2 = z16;
                        int i61 = i9;
                        aVar = aVar6;
                        i12 = i54;
                        i50 = i;
                        iArr2 = iArr3;
                        i13 = i53;
                        c1039b.measureChildWithMargins(childAt6, i50, f5 == 0.0f ? c1039b.f4113f : 0, i2, 0);
                        if (i61 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar).width = i61;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        if (z17) {
                            view = childAt6;
                            c1039b.f4113f = ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) aVar).rightMargin + c1039b.f4113f;
                        } else {
                            view = childAt6;
                            int i62 = c1039b.f4113f;
                            c1039b.f4113f = Math.max(i62, i62 + measuredWidth3 + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin);
                        }
                        if (z2) {
                            iMax9 = Math.max(measuredWidth3, iMax9);
                        }
                    }
                    i14 = 1073741824;
                    if (mode4 == i14) {
                        z3 = false;
                        int i572 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        int measuredHeight32 = view.getMeasuredHeight() + i572;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z) {
                        }
                        int iMax102 = Math.max(i12, measuredHeight32);
                        if (z18) {
                            if (((LinearLayout.LayoutParams) aVar).weight <= 0.0f) {
                            }
                            int i602 = iMax2;
                            i52 = iMax102;
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
        int i65 = iMax8;
        if (c1039b.f4113f > 0 && c1039b.m2403k(virtualChildCount2)) {
            c1039b.f4113f += c1039b.f4119l;
        }
        int i66 = iArr5[1];
        int iMax11 = (i66 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) ? i63 : Math.max(i63, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i66, iArr5[c3]))));
        if (z23 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            c1039b.f4113f = 0;
            for (int i67 = 0; i67 < virtualChildCount2; i67++) {
                View childAt7 = c1039b.getChildAt(i67);
                if (childAt7 == null) {
                    c1039b.f4113f = c1039b.f4113f;
                } else if (childAt7.getVisibility() != 8) {
                    a aVar7 = (a) childAt7.getLayoutParams();
                    if (z17) {
                        c1039b.f4113f = ((LinearLayout.LayoutParams) aVar7).leftMargin + iMax9 + ((LinearLayout.LayoutParams) aVar7).rightMargin + c1039b.f4113f;
                    } else {
                        int i68 = c1039b.f4113f;
                        c1039b.f4113f = Math.max(i68, i68 + iMax9 + ((LinearLayout.LayoutParams) aVar7).leftMargin + ((LinearLayout.LayoutParams) aVar7).rightMargin);
                    }
                }
            }
        }
        int paddingRight = c1039b.getPaddingRight() + c1039b.getPaddingLeft() + c1039b.f4113f;
        c1039b.f4113f = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, c1039b.getSuggestedMinimumWidth()), i50, 0);
        int i69 = (iResolveSizeAndState2 & 16777215) - c1039b.f4113f;
        if (z20 || (i69 != 0 && f5 > 0.0f)) {
            float f7 = c1039b.f4114g;
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
            c1039b.f4113f = 0;
            iMax11 = -1;
            int i70 = 0;
            while (i70 < virtualChildCount2) {
                View childAt8 = c1039b.getChildAt(i70);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i6 = iResolveSizeAndState2;
                } else {
                    a aVar8 = (a) childAt8.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) aVar8).weight;
                    if (f8 > 0.0f) {
                        int i71 = (int) ((i69 * f8) / f5);
                        f5 -= f8;
                        i69 -= i71;
                        i6 = iResolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, c1039b.getPaddingBottom() + c1039b.getPaddingTop() + ((LinearLayout.LayoutParams) aVar8).topMargin + ((LinearLayout.LayoutParams) aVar8).bottomMargin, ((LinearLayout.LayoutParams) aVar8).height);
                        if (((LinearLayout.LayoutParams) aVar8).width == 0) {
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
                        c1039b.f4113f = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar8).leftMargin + ((LinearLayout.LayoutParams) aVar8).rightMargin + c1039b.f4113f;
                    } else {
                        int i72 = c1039b.f4113f;
                        c1039b.f4113f = Math.max(i72, childAt8.getMeasuredWidth() + i72 + ((LinearLayout.LayoutParams) aVar8).leftMargin + ((LinearLayout.LayoutParams) aVar8).rightMargin);
                    }
                    boolean z24 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) aVar8).height == -1;
                    int i73 = ((LinearLayout.LayoutParams) aVar8).topMargin + ((LinearLayout.LayoutParams) aVar8).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i73;
                    iMax11 = Math.max(iMax11, measuredHeight4);
                    if (!z24) {
                        i73 = measuredHeight4;
                    }
                    int iMax12 = Math.max(i64, i73);
                    if (z18) {
                        i7 = -1;
                        boolean z25 = ((LinearLayout.LayoutParams) aVar8).height == -1;
                        if (!z22 && (baseline = childAt8.getBaseline()) != i7) {
                            int i74 = ((LinearLayout.LayoutParams) aVar8).gravity;
                            if (i74 < 0) {
                                i74 = c1039b.f4112e;
                            }
                            int i75 = (((i74 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i75] = Math.max(iArr5[i75], baseline);
                            iArr6[i75] = Math.max(iArr6[i75], measuredHeight4 - baseline);
                        }
                        z18 = z25;
                        i64 = iMax12;
                    } else {
                        i7 = -1;
                    }
                    if (!z22) {
                        z18 = z25;
                        i64 = iMax12;
                    }
                }
                i70++;
                iResolveSizeAndState2 = i6;
            }
            i3 = iResolveSizeAndState2;
            i4 = -16777216;
            c1039b.f4113f = c1039b.getPaddingRight() + c1039b.getPaddingLeft() + c1039b.f4113f;
            int i76 = iArr5[1];
            if (i76 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) {
                i5 = 0;
            } else {
                i5 = 0;
                iMax11 = Math.max(iMax11, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i76, iArr5[c3]))));
            }
            iMax = i64;
        } else {
            iMax = Math.max(i64, i65);
            if (z23 && mode3 != 1073741824) {
                for (int i77 = 0; i77 < virtualChildCount2; i77++) {
                    View childAt9 = c1039b.getChildAt(i77);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) childAt9.getLayoutParams())).weight > 0.0f) {
                        childAt9.measure(View.MeasureSpec.makeMeasureSpec(iMax9, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt9.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = iResolveSizeAndState2;
            i4 = -16777216;
            i5 = 0;
        }
        if (!z18 && mode4 != 1073741824) {
            iMax11 = iMax;
        }
        c1039b.setMeasuredDimension(i3 | (iCombineMeasuredStates3 & i4), View.resolveSizeAndState(Math.max(c1039b.getPaddingBottom() + c1039b.getPaddingTop() + iMax11, c1039b.getSuggestedMinimumHeight()), i2, iCombineMeasuredStates3 << 16));
        if (z19) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(c1039b.getMeasuredHeight(), 1073741824);
            int i78 = i5;
            while (i78 < virtualChildCount2) {
                View childAt10 = c1039b.getChildAt(i78);
                if (childAt10.getVisibility() != 8) {
                    a aVar9 = (a) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) aVar9).height == -1) {
                        int i79 = ((LinearLayout.LayoutParams) aVar9).width;
                        ((LinearLayout.LayoutParams) aVar9).width = childAt10.getMeasuredWidth();
                        c1039b.measureChildWithMargins(childAt10, i50, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) aVar9).width = i79;
                    }
                }
                i78++;
                c1039b = this;
                i50 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f4108a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f4109b = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f4118k) {
            return;
        }
        this.f4118k = drawable;
        if (drawable != null) {
            this.f4119l = drawable.getIntrinsicWidth();
            this.f4120m = drawable.getIntrinsicHeight();
        } else {
            this.f4119l = 0;
            this.f4120m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f4122o = i;
    }

    public void setGravity(int i) {
        if (this.f4112e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f4112e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f4112e;
        if ((8388615 & i3) != i2) {
            this.f4112e = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f4115h = z;
    }

    public void setOrientation(int i) {
        if (this.f4111d != i) {
            this.f4111d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f4121n) {
            requestLayout();
        }
        this.f4121n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f4112e;
        if ((i3 & 112) != i2) {
            this.f4112e = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f4114g = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1039b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f4108a = true;
        this.f4109b = -1;
        this.f4110c = 0;
        this.f4112e = 8388659;
        C0751of c0751ofM1768e = C0751of.m1768e(context, attributeSet, C0983R.styleable.LinearLayoutCompat, 0);
        C0866ug.m2002i(this, context, C0983R.styleable.LinearLayoutCompat, attributeSet, c0751ofM1768e.f2960b, 0);
        int i2 = C0983R.styleable.LinearLayoutCompat_android_orientation;
        TypedArray typedArray = c0751ofM1768e.f2960b;
        int i3 = typedArray.getInt(i2, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i4 = typedArray.getInt(C0983R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        boolean z = typedArray.getBoolean(C0983R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f4114g = typedArray.getFloat(C0983R.styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f4109b = typedArray.getInt(C0983R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f4115h = typedArray.getBoolean(C0983R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(c0751ofM1768e.m1770b(C0983R.styleable.LinearLayoutCompat_divider));
        this.f4121n = typedArray.getInt(C0983R.styleable.LinearLayoutCompat_showDividers, 0);
        this.f4122o = typedArray.getDimensionPixelSize(C0983R.styleable.LinearLayoutCompat_dividerPadding, 0);
        c0751ofM1768e.m1773f();
    }
}
