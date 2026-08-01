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
import androidx.appcompat.app.C0955;
import androidx.core.view.AbstractC3103;
import bsh.C3466;
import p204.AbstractC8602;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1013 extends ViewGroup {

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f1003;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public int f1004;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f1005;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public int f1006;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public Drawable f1007;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public int[] f1008;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f1009;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f1010;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f1011;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public int[] f1012;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f1013;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public float f1014;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f1015;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f1016;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f1017;

    public AbstractC1013(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f1017 = true;
        this.f1015 = -1;
        this.f1016 = 0;
        this.f1009 = 8388659;
        int[] iArr = AbstractC8602.f21441;
        C0955 c0955M914 = C0955.m914(0, 0, context, attributeSet, iArr);
        AbstractC3103.m4803(this, context, iArr, attributeSet, (TypedArray) c0955M914.f665, 0);
        TypedArray typedArray = (TypedArray) c0955M914.f665;
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
        this.f1014 = typedArray.getFloat(4, -1.0f);
        this.f1015 = typedArray.getInt(3, -1);
        this.f1011 = typedArray.getBoolean(7, false);
        setDividerDrawable(c0955M914.m950(5));
        this.f1004 = typedArray.getInt(8, 0);
        this.f1003 = typedArray.getDimensionPixelSize(6, 0);
        c0955M914.m923();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1010;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f1015 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f1015;
        if (childCount <= i2) {
            C3466.m5899("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
            return 0;
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1015 == 0) {
                return -1;
            }
            C3466.m5899("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            return 0;
        }
        int bottom = this.f1016;
        if (this.f1010 == 1 && (i = this.f1009 & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1013) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1013;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C1010) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1015;
    }

    public Drawable getDividerDrawable() {
        return this.f1007;
    }

    public int getDividerPadding() {
        return this.f1003;
    }

    public int getDividerWidth() {
        return this.f1006;
    }

    public int getGravity() {
        return this.f1009;
    }

    public int getOrientation() {
        return this.f1010;
    }

    public int getShowDividers() {
        return this.f1004;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1014;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.f1007 == null) {
            return;
        }
        int i2 = 0;
        if (this.f1010 == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && m1183(i2)) {
                    m1182((childAt.getTop() - ((LinearLayout.LayoutParams) ((C1010) childAt.getLayoutParams())).topMargin) - this.f1005, canvas);
                }
                i2++;
            }
            if (m1183(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                m1182(childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f1005 : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C1010) childAt2.getLayoutParams())).bottomMargin, canvas);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m1183(i2)) {
                C1010 c1010 = (C1010) childAt3.getLayoutParams();
                m1181(z ? childAt3.getRight() + ((LinearLayout.LayoutParams) c1010).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c1010).leftMargin) - this.f1006, canvas);
            }
            i2++;
        }
        if (m1183(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C1010 c10102 = (C1010) childAt4.getLayoutParams();
                if (z) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c10102).leftMargin;
                    i = this.f1006;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c10102).rightMargin;
                }
            } else if (z) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f1006;
                right = left - i;
            }
            m1181(right, canvas);
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
        if (this.f1010 == 1) {
            int paddingLeft = getPaddingLeft();
            int i16 = i3 - i;
            int paddingRight = i16 - getPaddingRight();
            int paddingRight2 = (i16 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i17 = this.f1009;
            int i18 = i17 & 112;
            int i19 = 8388615 & i17;
            int paddingTop = i18 != 16 ? i18 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f1013 : getPaddingTop() + (((i4 - i2) - this.f1013) / 2);
            int i20 = 0;
            while (i20 < virtualChildCount) {
                View childAt = getChildAt(i20);
                if (childAt == null || childAt.getVisibility() == i15) {
                    c = c2;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    C1010 c1010 = (C1010) childAt.getLayoutParams();
                    c = c2;
                    int i21 = ((LinearLayout.LayoutParams) c1010).gravity;
                    if (i21 < 0) {
                        i21 = i19;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i21, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i12 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c1010).leftMargin;
                        i13 = ((LinearLayout.LayoutParams) c1010).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i14 = ((LinearLayout.LayoutParams) c1010).leftMargin + paddingLeft;
                        if (m1183(i20)) {
                            paddingTop += this.f1005;
                        }
                        int i22 = paddingTop + ((LinearLayout.LayoutParams) c1010).topMargin;
                        childAt.layout(i14, i22, measuredWidth + i14, i22 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c1010).bottomMargin + i22;
                    } else {
                        i12 = paddingRight - measuredWidth;
                        i13 = ((LinearLayout.LayoutParams) c1010).rightMargin;
                    }
                    i14 = i12 - i13;
                    if (m1183(i20)) {
                    }
                    int i222 = paddingTop + ((LinearLayout.LayoutParams) c1010).topMargin;
                    childAt.layout(i14, i222, measuredWidth + i14, i222 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c1010).bottomMargin + i222;
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
        int i24 = this.f1009;
        int i25 = 8388615 & i24;
        int i26 = i24 & 112;
        boolean z3 = this.f1017;
        int[] iArr = this.f1012;
        int[] iArr2 = this.f1008;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i25, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.f1013 : getPaddingLeft() + (((i3 - i) - this.f1013) / 2);
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
                    C1010 c10102 = (C1010) childAt2.getLayoutParams();
                    int i29 = paddingLeft2;
                    if (z3) {
                        i8 = paddingTop2;
                        int baseline = ((LinearLayout.LayoutParams) c10102).height != -1 ? childAt2.getBaseline() : -1;
                        i9 = ((LinearLayout.LayoutParams) c10102).gravity;
                        if (i9 < 0) {
                            i9 = i26;
                        }
                        i10 = i9 & 112;
                        if (i10 == 16) {
                            if (i10 == 48) {
                                i11 = i8 + ((LinearLayout.LayoutParams) c10102).topMargin;
                                if (baseline != -1) {
                                    i11 = (iArr[1] - baseline) + i11;
                                }
                            } else if (i10 != 80) {
                                i11 = i8;
                            } else {
                                i11 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) c10102).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            int i30 = (m1183(i28) ? i29 + this.f1006 : i29) + ((LinearLayout.LayoutParams) c10102).leftMargin;
                            childAt2.layout(i30, i11, i30 + measuredWidth2, i11 + measuredHeight3);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c10102).rightMargin + i30;
                            i27++;
                            i6 = i7;
                            paddingTop2 = i8;
                        } else {
                            i11 = ((paddingBottom2 - measuredHeight3) / 2) + i8 + ((LinearLayout.LayoutParams) c10102).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) c10102).bottomMargin;
                        }
                        i11 -= measuredHeight;
                        int i302 = (m1183(i28) ? i29 + this.f1006 : i29) + ((LinearLayout.LayoutParams) c10102).leftMargin;
                        childAt2.layout(i302, i11, i302 + measuredWidth2, i11 + measuredHeight3);
                        paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c10102).rightMargin + i302;
                        i27++;
                        i6 = i7;
                        paddingTop2 = i8;
                    } else {
                        i8 = paddingTop2;
                    }
                    i9 = ((LinearLayout.LayoutParams) c10102).gravity;
                    if (i9 < 0) {
                    }
                    i10 = i9 & 112;
                    if (i10 == 16) {
                    }
                    i11 -= measuredHeight;
                    int i3022 = (m1183(i28) ? i29 + this.f1006 : i29) + ((LinearLayout.LayoutParams) c10102).leftMargin;
                    childAt2.layout(i3022, i11, i3022 + measuredWidth2, i11 + measuredHeight3);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c10102).rightMargin + i3022;
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
        C1010 c1010;
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
        AbstractC1013 abstractC1013 = this;
        int i26 = -2;
        int iMax3 = 0;
        int i27 = 1073741824;
        int i28 = 8;
        if (abstractC1013.f1010 == 1) {
            abstractC1013.f1013 = 0;
            int virtualChildCount = abstractC1013.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i29 = abstractC1013.f1015;
            boolean z7 = abstractC1013.f1011;
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
                View childAt = abstractC1013.getChildAt(i30);
                if (childAt == null) {
                    abstractC1013.f1013 = abstractC1013.f1013;
                } else {
                    if (childAt.getVisibility() != i28) {
                        if (abstractC1013.m1183(i30)) {
                            abstractC1013.f1013 += abstractC1013.f1005;
                        }
                        C1010 c10102 = (C1010) childAt.getLayoutParams();
                        float f2 = ((LinearLayout.LayoutParams) c10102).weight;
                        f += f2;
                        if (mode2 == i27 && ((LinearLayout.LayoutParams) c10102).height == 0 && f2 > 0.0f) {
                            int i33 = abstractC1013.f1013;
                            abstractC1013.f1013 = Math.max(i33, ((LinearLayout.LayoutParams) c10102).topMargin + i33 + ((LinearLayout.LayoutParams) c10102).bottomMargin);
                            view2 = childAt;
                            i22 = mode2;
                            i23 = i29;
                            z5 = z7;
                            i24 = i30;
                            z8 = true;
                            i25 = i32;
                        } else {
                            if (((LinearLayout.LayoutParams) c10102).height != 0 || f2 <= 0.0f) {
                                i19 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) c10102).height = i26;
                                i19 = 0;
                            }
                            if (f == 0.0f) {
                                i20 = i30;
                                i21 = abstractC1013.f1013;
                            } else {
                                i20 = i30;
                                i21 = 0;
                            }
                            i22 = mode2;
                            z5 = z7;
                            i23 = i29;
                            i24 = i20;
                            i25 = i32;
                            abstractC1013.measureChildWithMargins(childAt, i, 0, i2, i21);
                            if (i19 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) c10102).height = i19;
                            }
                            int measuredHeight = childAt.getMeasuredHeight();
                            int i34 = abstractC1013.f1013;
                            view2 = childAt;
                            abstractC1013.f1013 = Math.max(i34, i34 + measuredHeight + ((LinearLayout.LayoutParams) c10102).topMargin + ((LinearLayout.LayoutParams) c10102).bottomMargin);
                            if (z5) {
                                iMax6 = Math.max(measuredHeight, iMax6);
                            }
                        }
                        if (i23 >= 0 && i23 == i24 + 1) {
                            abstractC1013.f1016 = abstractC1013.f1013;
                        }
                        if (i24 < i23 && ((LinearLayout.LayoutParams) c10102).weight > 0.0f) {
                            C3466.m5899("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                            return;
                        }
                        if (i25 == 1073741824 || ((LinearLayout.LayoutParams) c10102).width != -1) {
                            z6 = false;
                        } else {
                            z6 = true;
                            z9 = true;
                        }
                        int i35 = ((LinearLayout.LayoutParams) c10102).leftMargin + ((LinearLayout.LayoutParams) c10102).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i35;
                        iMax3 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z11 = z6;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i31, measuredState);
                        if (z10) {
                            i31 = iCombineMeasuredStates;
                            boolean z12 = ((LinearLayout.LayoutParams) c10102).width == -1;
                            if (((LinearLayout.LayoutParams) c10102).weight <= 0.0f) {
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
                        if (((LinearLayout.LayoutParams) c10102).weight <= 0.0f) {
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
            if (abstractC1013.f1013 > 0 && abstractC1013.m1183(virtualChildCount)) {
                abstractC1013.f1013 += abstractC1013.f1005;
            }
            if (z13 && (i37 == Integer.MIN_VALUE || i37 == 0)) {
                abstractC1013.f1013 = 0;
                for (int i40 = 0; i40 < virtualChildCount; i40++) {
                    View childAt2 = abstractC1013.getChildAt(i40);
                    if (childAt2 == null) {
                        abstractC1013.f1013 = abstractC1013.f1013;
                    } else if (childAt2.getVisibility() != 8) {
                        C1010 c10103 = (C1010) childAt2.getLayoutParams();
                        int i41 = abstractC1013.f1013;
                        abstractC1013.f1013 = Math.max(i41, i41 + iMax6 + ((LinearLayout.LayoutParams) c10103).topMargin + ((LinearLayout.LayoutParams) c10103).bottomMargin);
                    }
                }
            }
            int paddingBottom = abstractC1013.getPaddingBottom() + abstractC1013.getPaddingTop() + abstractC1013.f1013;
            abstractC1013.f1013 = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, abstractC1013.getSuggestedMinimumHeight()), i39, 0);
            int i42 = (iResolveSizeAndState & 16777215) - abstractC1013.f1013;
            if (z8 || (i42 != 0 && f > 0.0f)) {
                float f3 = abstractC1013.f1014;
                if (f3 > 0.0f) {
                    f = f3;
                }
                abstractC1013.f1013 = 0;
                int iCombineMeasuredStates2 = i38;
                int i43 = 0;
                while (i43 < virtualChildCount) {
                    View childAt3 = abstractC1013.getChildAt(i43);
                    if (childAt3.getVisibility() == 8) {
                        i16 = i43;
                    } else {
                        C1010 c10104 = (C1010) childAt3.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) c10104).weight;
                        if (f4 > 0.0f) {
                            int i44 = (int) ((i42 * f4) / f);
                            f -= f4;
                            i42 -= i44;
                            i16 = i43;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, abstractC1013.getPaddingRight() + abstractC1013.getPaddingLeft() + ((LinearLayout.LayoutParams) c10104).leftMargin + ((LinearLayout.LayoutParams) c10104).rightMargin, ((LinearLayout.LayoutParams) c10104).width);
                            if (((LinearLayout.LayoutParams) c10104).height == 0) {
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
                        int i45 = ((LinearLayout.LayoutParams) c10104).leftMargin + ((LinearLayout.LayoutParams) c10104).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i45;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i36 != 1073741824) {
                            i17 = -1;
                            if (((LinearLayout.LayoutParams) c10104).width == -1) {
                                measuredWidth2 = i45;
                            }
                        } else {
                            i17 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z14 = z10 && ((LinearLayout.LayoutParams) c10104).width == i17;
                        int i46 = abstractC1013.f1013;
                        abstractC1013.f1013 = Math.max(i46, childAt3.getMeasuredHeight() + i46 + ((LinearLayout.LayoutParams) c10104).topMargin + ((LinearLayout.LayoutParams) c10104).bottomMargin);
                        z10 = z14;
                    }
                    i43 = i16 + 1;
                }
                abstractC1013.f1013 = abstractC1013.getPaddingBottom() + abstractC1013.getPaddingTop() + abstractC1013.f1013;
                i38 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z13 && i37 != 1073741824) {
                    for (int i47 = 0; i47 < virtualChildCount; i47++) {
                        View childAt4 = abstractC1013.getChildAt(i47);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C1010) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z10 || i36 == 1073741824) {
                iMax4 = iMax3;
            }
            abstractC1013.setMeasuredDimension(View.resolveSizeAndState(Math.max(abstractC1013.getPaddingRight() + abstractC1013.getPaddingLeft() + iMax4, abstractC1013.getSuggestedMinimumWidth()), i, i38), iResolveSizeAndState);
            if (z9) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(abstractC1013.getMeasuredWidth(), 1073741824);
                int i48 = 0;
                while (i48 < virtualChildCount) {
                    View childAt5 = abstractC1013.getChildAt(i48);
                    if (childAt5.getVisibility() != 8) {
                        C1010 c10105 = (C1010) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c10105).width == -1) {
                            int i49 = ((LinearLayout.LayoutParams) c10105).height;
                            ((LinearLayout.LayoutParams) c10105).height = childAt5.getMeasuredHeight();
                            abstractC1013.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i39, 0);
                            ((LinearLayout.LayoutParams) c10105).height = i49;
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
        abstractC1013.f1013 = 0;
        int virtualChildCount2 = abstractC1013.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i50);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (abstractC1013.f1012 == null || abstractC1013.f1008 == null) {
            abstractC1013.f1012 = new int[4];
            abstractC1013.f1008 = new int[4];
        }
        int[] iArr3 = abstractC1013.f1012;
        int[] iArr4 = abstractC1013.f1008;
        iArr3[3] = -1;
        char c = 2;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z15 = abstractC1013.f1017;
        boolean z16 = abstractC1013.f1011;
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
            View childAt6 = abstractC1013.getChildAt(i51);
            if (childAt6 == null) {
                abstractC1013.f1013 = abstractC1013.f1013;
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
                    if (abstractC1013.m1183(i51)) {
                        abstractC1013.f1013 += abstractC1013.f1006;
                    }
                    C1010 c10106 = (C1010) childAt6.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) c10106).weight;
                    f5 += f6;
                    int i55 = i51;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c10106).width == 0 && f6 > 0.0f) {
                        int i56 = abstractC1013.f1013;
                        int i57 = ((LinearLayout.LayoutParams) c10106).leftMargin;
                        if (z17) {
                            abstractC1013.f1013 = i57 + ((LinearLayout.LayoutParams) c10106).rightMargin + i56;
                        } else {
                            abstractC1013.f1013 = Math.max(i56, i56 + i57 + ((LinearLayout.LayoutParams) c10106).rightMargin);
                        }
                        if (z15) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z = z15;
                            z2 = z16;
                            i12 = i54;
                            i11 = i55;
                            c1010 = c10106;
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
                            c1010 = c10106;
                            iArr2 = iArr3;
                            iArr = iArr4;
                            i50 = i;
                            i13 = i53;
                            i10 = iMax7;
                            if (mode4 == i14 && ((LinearLayout.LayoutParams) c1010).height == -1) {
                                z3 = true;
                                z19 = true;
                            } else {
                                z3 = false;
                            }
                            int i58 = ((LinearLayout.LayoutParams) c1010).topMargin + ((LinearLayout.LayoutParams) c1010).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i58;
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                            if (z) {
                                z4 = z3;
                            } else {
                                int baseline2 = view.getBaseline();
                                z4 = z3;
                                if (baseline2 != -1) {
                                    int i59 = ((LinearLayout.LayoutParams) c1010).gravity;
                                    if (i59 < 0) {
                                        i59 = abstractC1013.f1009;
                                    }
                                    int i60 = (((i59 & 112) >> 4) & (-2)) >> 1;
                                    iArr2[i60] = Math.max(iArr2[i60], baseline2);
                                    iArr[i60] = Math.max(iArr[i60], measuredHeight3 - baseline2);
                                }
                            }
                            int iMax9 = Math.max(i12, measuredHeight3);
                            boolean z21 = !z18 && ((LinearLayout.LayoutParams) c1010).height == -1;
                            if (((LinearLayout.LayoutParams) c1010).weight <= 0.0f) {
                                if (!z4) {
                                    i58 = measuredHeight3;
                                }
                                iMax7 = Math.max(i10, i58);
                                iMax2 = i13;
                            } else {
                                if (!z4) {
                                    i58 = measuredHeight3;
                                }
                                iMax2 = Math.max(i13, i58);
                                iMax7 = i10;
                            }
                            int i61 = iMax2;
                            i52 = iMax9;
                            i15 = i61;
                            z18 = z21;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) c10106).width != 0 || f6 <= 0.0f) {
                            i9 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) c10106).width = -2;
                            i9 = 0;
                        }
                        iArr = iArr4;
                        i10 = iMax7;
                        i11 = i55;
                        z = z15;
                        z2 = z16;
                        int i62 = i9;
                        c1010 = c10106;
                        i12 = i54;
                        i50 = i;
                        iArr2 = iArr3;
                        i13 = i53;
                        abstractC1013.measureChildWithMargins(childAt6, i50, f5 == 0.0f ? abstractC1013.f1013 : 0, i2, 0);
                        if (i62 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c1010).width = i62;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        int i63 = abstractC1013.f1013;
                        int i64 = ((LinearLayout.LayoutParams) c1010).leftMargin;
                        if (z17) {
                            view = childAt6;
                            abstractC1013.f1013 = i64 + measuredWidth3 + ((LinearLayout.LayoutParams) c1010).rightMargin + i63;
                        } else {
                            view = childAt6;
                            abstractC1013.f1013 = Math.max(i63, i63 + measuredWidth3 + i64 + ((LinearLayout.LayoutParams) c1010).rightMargin);
                        }
                        if (z2) {
                            iMax8 = Math.max(measuredWidth3, iMax8);
                        }
                    }
                    i14 = 1073741824;
                    if (mode4 == i14) {
                        z3 = false;
                        int i582 = ((LinearLayout.LayoutParams) c1010).topMargin + ((LinearLayout.LayoutParams) c1010).bottomMargin;
                        int measuredHeight32 = view.getMeasuredHeight() + i582;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z) {
                        }
                        int iMax92 = Math.max(i12, measuredHeight32);
                        if (z18) {
                            if (((LinearLayout.LayoutParams) c1010).weight <= 0.0f) {
                            }
                            int i612 = iMax2;
                            i52 = iMax92;
                            i15 = i612;
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
        int i65 = i52;
        int i66 = i53;
        int i67 = iMax7;
        if (abstractC1013.f1013 > 0 && abstractC1013.m1183(virtualChildCount2)) {
            abstractC1013.f1013 += abstractC1013.f1006;
        }
        int i68 = iArr5[1];
        int iMax10 = (i68 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) ? i65 : Math.max(i65, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i68, iArr5[c3]))));
        if (z23 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            abstractC1013.f1013 = 0;
            for (int i69 = 0; i69 < virtualChildCount2; i69++) {
                View childAt7 = abstractC1013.getChildAt(i69);
                if (childAt7 == null) {
                    abstractC1013.f1013 = abstractC1013.f1013;
                } else if (childAt7.getVisibility() != 8) {
                    C1010 c10107 = (C1010) childAt7.getLayoutParams();
                    int i70 = abstractC1013.f1013;
                    if (z17) {
                        abstractC1013.f1013 = ((LinearLayout.LayoutParams) c10107).leftMargin + iMax8 + ((LinearLayout.LayoutParams) c10107).rightMargin + i70;
                    } else {
                        abstractC1013.f1013 = Math.max(i70, i70 + iMax8 + ((LinearLayout.LayoutParams) c10107).leftMargin + ((LinearLayout.LayoutParams) c10107).rightMargin);
                    }
                }
            }
        }
        int paddingRight = abstractC1013.getPaddingRight() + abstractC1013.getPaddingLeft() + abstractC1013.f1013;
        abstractC1013.f1013 = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, abstractC1013.getSuggestedMinimumWidth()), i50, 0);
        int i71 = (iResolveSizeAndState2 & 16777215) - abstractC1013.f1013;
        if (z20 || (i71 != 0 && f5 > 0.0f)) {
            float f7 = abstractC1013.f1014;
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
            abstractC1013.f1013 = 0;
            iMax10 = -1;
            int i72 = 0;
            while (i72 < virtualChildCount2) {
                View childAt8 = abstractC1013.getChildAt(i72);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i6 = iResolveSizeAndState2;
                } else {
                    C1010 c10108 = (C1010) childAt8.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) c10108).weight;
                    if (f8 > 0.0f) {
                        int i73 = (int) ((i71 * f8) / f5);
                        f5 -= f8;
                        i71 -= i73;
                        i6 = iResolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, abstractC1013.getPaddingBottom() + abstractC1013.getPaddingTop() + ((LinearLayout.LayoutParams) c10108).topMargin + ((LinearLayout.LayoutParams) c10108).bottomMargin, ((LinearLayout.LayoutParams) c10108).height);
                        if (((LinearLayout.LayoutParams) c10108).width == 0) {
                            i8 = 1073741824;
                            if (mode3 == 1073741824) {
                                if (i73 <= 0) {
                                    i73 = 0;
                                }
                                childAt8.measure(View.MeasureSpec.makeMeasureSpec(i73, 1073741824), childMeasureSpec2);
                            }
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                        } else {
                            i8 = 1073741824;
                        }
                        int measuredWidth4 = childAt8.getMeasuredWidth() + i73;
                        if (measuredWidth4 < 0) {
                            measuredWidth4 = 0;
                        }
                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i8), childMeasureSpec2);
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt8.getMeasuredState() & (-16777216));
                    } else {
                        i6 = iResolveSizeAndState2;
                    }
                    int i74 = abstractC1013.f1013;
                    if (z17) {
                        abstractC1013.f1013 = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) c10108).leftMargin + ((LinearLayout.LayoutParams) c10108).rightMargin + i74;
                    } else {
                        abstractC1013.f1013 = Math.max(i74, childAt8.getMeasuredWidth() + i74 + ((LinearLayout.LayoutParams) c10108).leftMargin + ((LinearLayout.LayoutParams) c10108).rightMargin);
                    }
                    boolean z24 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) c10108).height == -1;
                    int i75 = ((LinearLayout.LayoutParams) c10108).topMargin + ((LinearLayout.LayoutParams) c10108).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i75;
                    iMax10 = Math.max(iMax10, measuredHeight4);
                    if (!z24) {
                        i75 = measuredHeight4;
                    }
                    int iMax11 = Math.max(i66, i75);
                    if (z18) {
                        i7 = -1;
                        boolean z25 = ((LinearLayout.LayoutParams) c10108).height == -1;
                        if (!z22 && (baseline = childAt8.getBaseline()) != i7) {
                            int i76 = ((LinearLayout.LayoutParams) c10108).gravity;
                            if (i76 < 0) {
                                i76 = abstractC1013.f1009;
                            }
                            int i77 = (((i76 & 112) >> 4) & (-2)) >> 1;
                            iArr5[i77] = Math.max(iArr5[i77], baseline);
                            iArr6[i77] = Math.max(iArr6[i77], measuredHeight4 - baseline);
                        }
                        z18 = z25;
                        i66 = iMax11;
                    } else {
                        i7 = -1;
                    }
                    if (!z22) {
                        z18 = z25;
                        i66 = iMax11;
                    }
                }
                i72++;
                iResolveSizeAndState2 = i6;
            }
            i3 = iResolveSizeAndState2;
            i4 = -16777216;
            abstractC1013.f1013 = abstractC1013.getPaddingRight() + abstractC1013.getPaddingLeft() + abstractC1013.f1013;
            int i78 = iArr5[1];
            if (i78 == -1 && iArr5[0] == -1 && iArr5[c3] == -1 && iArr5[3] == -1) {
                i5 = 0;
            } else {
                i5 = 0;
                iMax10 = Math.max(iMax10, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[c3]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i78, iArr5[c3]))));
            }
            iMax = i66;
        } else {
            iMax = Math.max(i66, i67);
            if (z23 && mode3 != 1073741824) {
                for (int i79 = 0; i79 < virtualChildCount2; i79++) {
                    View childAt9 = abstractC1013.getChildAt(i79);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C1010) childAt9.getLayoutParams())).weight > 0.0f) {
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
        abstractC1013.setMeasuredDimension(i3 | (iCombineMeasuredStates3 & i4), View.resolveSizeAndState(Math.max(abstractC1013.getPaddingBottom() + abstractC1013.getPaddingTop() + iMax10, abstractC1013.getSuggestedMinimumHeight()), i2, iCombineMeasuredStates3 << 16));
        if (z19) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(abstractC1013.getMeasuredHeight(), 1073741824);
            int i80 = i5;
            while (i80 < virtualChildCount2) {
                View childAt10 = abstractC1013.getChildAt(i80);
                if (childAt10.getVisibility() != 8) {
                    C1010 c10109 = (C1010) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c10109).height == -1) {
                        int i81 = ((LinearLayout.LayoutParams) c10109).width;
                        ((LinearLayout.LayoutParams) c10109).width = childAt10.getMeasuredWidth();
                        abstractC1013.measureChildWithMargins(childAt10, i50, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) c10109).width = i81;
                    }
                }
                i80++;
                abstractC1013 = this;
                i50 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f1017 = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f1015 = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1007) {
            return;
        }
        this.f1007 = drawable;
        if (drawable != null) {
            this.f1006 = drawable.getIntrinsicWidth();
            this.f1005 = drawable.getIntrinsicHeight();
        } else {
            this.f1006 = 0;
            this.f1005 = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f1003 = i;
    }

    public void setGravity(int i) {
        if (this.f1009 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f1009 = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f1009;
        if ((8388615 & i3) != i2) {
            this.f1009 = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1011 = z;
    }

    public void setOrientation(int i) {
        if (this.f1010 != i) {
            this.f1010 = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f1004) {
            requestLayout();
        }
        this.f1004 = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f1009;
        if ((i3 & 112) != i2) {
            this.f1009 = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f1014 = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: merged with bridge method [inline-methods] */
    public C1010 generateDefaultLayoutParams() {
        int i = this.f1010;
        if (i == 0) {
            return new C1010(-2, -2);
        }
        if (i == 1) {
            return new C1010(-1, -2);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m1181(int i, Canvas canvas) {
        this.f1007.setBounds(i, getPaddingTop() + this.f1003, this.f1006 + i, (getHeight() - getPaddingBottom()) - this.f1003);
        this.f1007.draw(canvas);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m1182(int i, Canvas canvas) {
        this.f1007.setBounds(getPaddingLeft() + this.f1003, i, (getWidth() - getPaddingRight()) - this.f1003, this.f1005 + i);
        this.f1007.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: merged with bridge method [inline-methods] */
    public C1010 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1010 ? new C1010((C1010) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1010((ViewGroup.MarginLayoutParams) layoutParams) : new C1010(layoutParams);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: merged with bridge method [inline-methods] */
    public C1010 generateLayoutParams(AttributeSet attributeSet) {
        return new C1010(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean m1183(int i) {
        if (i == 0) {
            return (this.f1004 & 1) != 0;
        }
        int childCount = getChildCount();
        int i2 = this.f1004;
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
