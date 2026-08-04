package yyds;

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
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛶᲁᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1423 extends ViewGroup {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public int f6716;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f6717;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public Drawable f6718;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public float f6719;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f6720;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public int f6721;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public int f6722;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f6723;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public int[] f6724;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public int[] f6725;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public boolean f6726;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public boolean f6727;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public int f6728;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f6729;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f6730;

    public AbstractC1423(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6727 = true;
        this.f6730 = -1;
        this.f6720 = 0;
        this.f6723 = 8388659;
        int[] iArr = AbstractC1592.f8087;
        C0644 c0644M1535 = C0644.m1535(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) c0644M1535.f3099;
        WeakHashMap weakHashMap = AbstractC1640.f8352;
        AbstractC1256.m2535(this, context, iArr, attributeSet, typedArray, i, 0);
        TypedArray typedArray2 = (TypedArray) c0644M1535.f3099;
        int i2 = typedArray2.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray2.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArray2.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f6719 = typedArray2.getFloat(4, -1.0f);
        this.f6730 = typedArray2.getInt(3, -1);
        this.f6726 = typedArray2.getBoolean(7, false);
        setDividerDrawable(c0644M1535.m1554(5));
        this.f6728 = typedArray2.getInt(8, 0);
        this.f6722 = typedArray2.getDimensionPixelSize(6, 0);
        c0644M1535.m1568();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0550;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f6730 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f6730;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f6730 == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f6720;
        if (this.f6729 == 1 && (i = this.f6723 & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f6717) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f6717;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((C0550) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f6730;
    }

    public Drawable getDividerDrawable() {
        return this.f6718;
    }

    public int getDividerPadding() {
        return this.f6722;
    }

    public int getDividerWidth() {
        return this.f6716;
    }

    public int getGravity() {
        return this.f6723;
    }

    public int getOrientation() {
        return this.f6729;
    }

    public int getShowDividers() {
        return this.f6728;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f6719;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.f6718 == null) {
            return;
        }
        int i2 = 0;
        if (this.f6729 == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && m2886(i2)) {
                    m2887((childAt.getTop() - ((LinearLayout.LayoutParams) ((C0550) childAt.getLayoutParams())).topMargin) - this.f6721, canvas);
                }
                i2++;
            }
            if (m2886(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                m2887(childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f6721 : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0550) childAt2.getLayoutParams())).bottomMargin, canvas);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zM3289 = AbstractC1603.m3289(this);
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m2886(i2)) {
                C0550 c0550 = (C0550) childAt3.getLayoutParams();
                m2888(zM3289 ? childAt3.getRight() + ((LinearLayout.LayoutParams) c0550).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0550).leftMargin) - this.f6716, canvas);
            }
            i2++;
        }
        if (m2886(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                C0550 c05502 = (C0550) childAt4.getLayoutParams();
                if (zM3289) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) c05502).leftMargin;
                    i = this.f6716;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c05502).rightMargin;
                }
            } else if (zM3289) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f6716;
                right = left - i;
            }
            m2888(right, canvas);
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
        if (this.f6729 == 1) {
            int paddingLeft = getPaddingLeft();
            int i16 = i3 - i;
            int paddingRight = i16 - getPaddingRight();
            int paddingRight2 = (i16 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i17 = this.f6723;
            int i18 = i17 & 112;
            int i19 = 8388615 & i17;
            int paddingTop = i18 != 16 ? i18 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f6717 : getPaddingTop() + (((i4 - i2) - this.f6717) / 2);
            int i20 = 0;
            while (i20 < virtualChildCount) {
                View childAt = getChildAt(i20);
                if (childAt == null || childAt.getVisibility() == i15) {
                    c = c2;
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    C0550 c0550 = (C0550) childAt.getLayoutParams();
                    c = c2;
                    int i21 = ((LinearLayout.LayoutParams) c0550).gravity;
                    if (i21 < 0) {
                        i21 = i19;
                    }
                    WeakHashMap weakHashMap = AbstractC1640.f8352;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i21, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        i12 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c0550).leftMargin;
                        i13 = ((LinearLayout.LayoutParams) c0550).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i14 = ((LinearLayout.LayoutParams) c0550).leftMargin + paddingLeft;
                        if (m2886(i20)) {
                            paddingTop += this.f6721;
                        }
                        int i22 = paddingTop + ((LinearLayout.LayoutParams) c0550).topMargin;
                        childAt.layout(i14, i22, measuredWidth + i14, i22 + measuredHeight2);
                        paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0550).bottomMargin + i22;
                    } else {
                        i12 = paddingRight - measuredWidth;
                        i13 = ((LinearLayout.LayoutParams) c0550).rightMargin;
                    }
                    i14 = i12 - i13;
                    if (m2886(i20)) {
                    }
                    int i222 = paddingTop + ((LinearLayout.LayoutParams) c0550).topMargin;
                    childAt.layout(i14, i222, measuredWidth + i14, i222 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0550).bottomMargin + i222;
                }
                i20++;
                c2 = c;
                i15 = 8;
            }
            return;
        }
        boolean zM3289 = AbstractC1603.m3289(this);
        int paddingTop2 = getPaddingTop();
        int i23 = i4 - i2;
        int paddingBottom = i23 - getPaddingBottom();
        int paddingBottom2 = (i23 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i24 = this.f6723;
        int i25 = 8388615 & i24;
        int i26 = i24 & 112;
        boolean z2 = this.f6727;
        int[] iArr = this.f6724;
        int[] iArr2 = this.f6725;
        WeakHashMap weakHashMap2 = AbstractC1640.f8352;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i25, getLayoutDirection());
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.f6717 : getPaddingLeft() + (((i3 - i) - this.f6717) / 2);
        if (zM3289) {
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
                    C0550 c05502 = (C0550) childAt2.getLayoutParams();
                    int i29 = paddingLeft2;
                    if (z2) {
                        i8 = paddingTop2;
                        int baseline = ((LinearLayout.LayoutParams) c05502).height != -1 ? childAt2.getBaseline() : -1;
                        i9 = ((LinearLayout.LayoutParams) c05502).gravity;
                        if (i9 < 0) {
                            i9 = i26;
                        }
                        i10 = i9 & 112;
                        if (i10 == 16) {
                            if (i10 == 48) {
                                i11 = i8 + ((LinearLayout.LayoutParams) c05502).topMargin;
                                if (baseline != -1) {
                                    i11 = (iArr[1] - baseline) + i11;
                                }
                            } else if (i10 != 80) {
                                i11 = i8;
                            } else {
                                i11 = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) c05502).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                                }
                            }
                            int i30 = (m2886(i28) ? i29 + this.f6716 : i29) + ((LinearLayout.LayoutParams) c05502).leftMargin;
                            childAt2.layout(i30, i11, i30 + measuredWidth2, i11 + measuredHeight3);
                            paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c05502).rightMargin + i30;
                            i27++;
                            i6 = i7;
                            paddingTop2 = i8;
                        } else {
                            i11 = ((paddingBottom2 - measuredHeight3) / 2) + i8 + ((LinearLayout.LayoutParams) c05502).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) c05502).bottomMargin;
                        }
                        i11 -= measuredHeight;
                        int i302 = (m2886(i28) ? i29 + this.f6716 : i29) + ((LinearLayout.LayoutParams) c05502).leftMargin;
                        childAt2.layout(i302, i11, i302 + measuredWidth2, i11 + measuredHeight3);
                        paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c05502).rightMargin + i302;
                        i27++;
                        i6 = i7;
                        paddingTop2 = i8;
                    } else {
                        i8 = paddingTop2;
                    }
                    i9 = ((LinearLayout.LayoutParams) c05502).gravity;
                    if (i9 < 0) {
                    }
                    i10 = i9 & 112;
                    if (i10 == 16) {
                    }
                    i11 -= measuredHeight;
                    int i3022 = (m2886(i28) ? i29 + this.f6716 : i29) + ((LinearLayout.LayoutParams) c05502).leftMargin;
                    childAt2.layout(i3022, i11, i3022 + measuredWidth2, i11 + measuredHeight3);
                    paddingLeft2 = measuredWidth2 + ((LinearLayout.LayoutParams) c05502).rightMargin + i3022;
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

    /* JADX WARN: Removed duplicated region for block: B:231:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int iMax;
        int i6;
        int i7;
        int baseline;
        int i8;
        int i9;
        int[] iArr2;
        int i10;
        int i11;
        boolean z;
        boolean z2;
        C0550 c0550;
        int i12;
        int[] iArr3;
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
        AbstractC1423 abstractC1423 = this;
        int i26 = -2;
        int iMax3 = 0;
        int i27 = 1073741824;
        int i28 = 8;
        if (abstractC1423.f6729 == 1) {
            abstractC1423.f6717 = 0;
            int virtualChildCount = abstractC1423.getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i29 = abstractC1423.f6730;
            boolean z7 = abstractC1423.f6726;
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
                View childAt = abstractC1423.getChildAt(i30);
                if (childAt == null) {
                    abstractC1423.f6717 = abstractC1423.f6717;
                } else {
                    if (childAt.getVisibility() != i28) {
                        if (abstractC1423.m2886(i30)) {
                            abstractC1423.f6717 += abstractC1423.f6721;
                        }
                        C0550 c05502 = (C0550) childAt.getLayoutParams();
                        float f2 = ((LinearLayout.LayoutParams) c05502).weight;
                        f += f2;
                        if (mode2 == i27 && ((LinearLayout.LayoutParams) c05502).height == 0 && f2 > 0.0f) {
                            int i33 = abstractC1423.f6717;
                            abstractC1423.f6717 = Math.max(i33, ((LinearLayout.LayoutParams) c05502).topMargin + i33 + ((LinearLayout.LayoutParams) c05502).bottomMargin);
                            view2 = childAt;
                            i22 = mode2;
                            i23 = i29;
                            z5 = z7;
                            i24 = i30;
                            z8 = true;
                            i25 = i32;
                        } else {
                            if (((LinearLayout.LayoutParams) c05502).height != 0 || f2 <= 0.0f) {
                                i19 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) c05502).height = i26;
                                i19 = 0;
                            }
                            if (f == 0.0f) {
                                i20 = i30;
                                i21 = abstractC1423.f6717;
                            } else {
                                i20 = i30;
                                i21 = 0;
                            }
                            i22 = mode2;
                            z5 = z7;
                            i23 = i29;
                            i24 = i20;
                            i25 = i32;
                            abstractC1423.measureChildWithMargins(childAt, i, 0, i2, i21);
                            if (i19 != Integer.MIN_VALUE) {
                                ((LinearLayout.LayoutParams) c05502).height = i19;
                            }
                            int measuredHeight = childAt.getMeasuredHeight();
                            int i34 = abstractC1423.f6717;
                            view2 = childAt;
                            abstractC1423.f6717 = Math.max(i34, i34 + measuredHeight + ((LinearLayout.LayoutParams) c05502).topMargin + ((LinearLayout.LayoutParams) c05502).bottomMargin);
                            if (z5) {
                                iMax6 = Math.max(measuredHeight, iMax6);
                            }
                        }
                        if (i23 >= 0 && i23 == i24 + 1) {
                            abstractC1423.f6720 = abstractC1423.f6717;
                        }
                        if (i24 < i23 && ((LinearLayout.LayoutParams) c05502).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (i25 == 1073741824 || ((LinearLayout.LayoutParams) c05502).width != -1) {
                            z6 = false;
                        } else {
                            z6 = true;
                            z9 = true;
                        }
                        int i35 = ((LinearLayout.LayoutParams) c05502).leftMargin + ((LinearLayout.LayoutParams) c05502).rightMargin;
                        int measuredWidth = view2.getMeasuredWidth() + i35;
                        iMax3 = Math.max(iMax3, measuredWidth);
                        int measuredState = view2.getMeasuredState();
                        boolean z11 = z6;
                        int iCombineMeasuredStates = View.combineMeasuredStates(i31, measuredState);
                        if (z10) {
                            i31 = iCombineMeasuredStates;
                            boolean z12 = ((LinearLayout.LayoutParams) c05502).width == -1;
                            if (((LinearLayout.LayoutParams) c05502).weight <= 0.0f) {
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
                        if (((LinearLayout.LayoutParams) c05502).weight <= 0.0f) {
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
            if (abstractC1423.f6717 > 0 && abstractC1423.m2886(virtualChildCount)) {
                abstractC1423.f6717 += abstractC1423.f6721;
            }
            if (z13 && (i37 == Integer.MIN_VALUE || i37 == 0)) {
                abstractC1423.f6717 = 0;
                for (int i40 = 0; i40 < virtualChildCount; i40++) {
                    View childAt2 = abstractC1423.getChildAt(i40);
                    if (childAt2 == null) {
                        abstractC1423.f6717 = abstractC1423.f6717;
                    } else if (childAt2.getVisibility() != 8) {
                        C0550 c05503 = (C0550) childAt2.getLayoutParams();
                        int i41 = abstractC1423.f6717;
                        abstractC1423.f6717 = Math.max(i41, i41 + iMax6 + ((LinearLayout.LayoutParams) c05503).topMargin + ((LinearLayout.LayoutParams) c05503).bottomMargin);
                    }
                }
            }
            int paddingBottom = abstractC1423.getPaddingBottom() + abstractC1423.getPaddingTop() + abstractC1423.f6717;
            abstractC1423.f6717 = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, abstractC1423.getSuggestedMinimumHeight()), i39, 0);
            int i42 = (iResolveSizeAndState & 16777215) - abstractC1423.f6717;
            if (z8 || (i42 != 0 && f > 0.0f)) {
                float f3 = abstractC1423.f6719;
                if (f3 > 0.0f) {
                    f = f3;
                }
                abstractC1423.f6717 = 0;
                int iCombineMeasuredStates2 = i38;
                int i43 = 0;
                while (i43 < virtualChildCount) {
                    View childAt3 = abstractC1423.getChildAt(i43);
                    if (childAt3.getVisibility() == 8) {
                        i16 = i43;
                    } else {
                        C0550 c05504 = (C0550) childAt3.getLayoutParams();
                        float f4 = ((LinearLayout.LayoutParams) c05504).weight;
                        if (f4 > 0.0f) {
                            int i44 = (int) ((i42 * f4) / f);
                            f -= f4;
                            i42 -= i44;
                            i16 = i43;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, abstractC1423.getPaddingRight() + abstractC1423.getPaddingLeft() + ((LinearLayout.LayoutParams) c05504).leftMargin + ((LinearLayout.LayoutParams) c05504).rightMargin, ((LinearLayout.LayoutParams) c05504).width);
                            if (((LinearLayout.LayoutParams) c05504).height == 0) {
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
                        int i45 = ((LinearLayout.LayoutParams) c05504).leftMargin + ((LinearLayout.LayoutParams) c05504).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i45;
                        iMax3 = Math.max(iMax3, measuredWidth2);
                        if (i36 != 1073741824) {
                            i17 = -1;
                            if (((LinearLayout.LayoutParams) c05504).width == -1) {
                                measuredWidth2 = i45;
                            }
                        } else {
                            i17 = -1;
                        }
                        iMax4 = Math.max(iMax4, measuredWidth2);
                        boolean z14 = z10 && ((LinearLayout.LayoutParams) c05504).width == i17;
                        int i46 = abstractC1423.f6717;
                        abstractC1423.f6717 = Math.max(i46, childAt3.getMeasuredHeight() + i46 + ((LinearLayout.LayoutParams) c05504).topMargin + ((LinearLayout.LayoutParams) c05504).bottomMargin);
                        z10 = z14;
                    }
                    i43 = i16 + 1;
                }
                abstractC1423.f6717 = abstractC1423.getPaddingBottom() + abstractC1423.getPaddingTop() + abstractC1423.f6717;
                i38 = iCombineMeasuredStates2;
            } else {
                iMax4 = Math.max(iMax4, iMax5);
                if (z13 && i37 != 1073741824) {
                    for (int i47 = 0; i47 < virtualChildCount; i47++) {
                        View childAt4 = abstractC1423.getChildAt(i47);
                        if (childAt4 != null && childAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0550) childAt4.getLayoutParams())).weight > 0.0f) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(iMax6, 1073741824));
                        }
                    }
                }
            }
            if (z10 || i36 == 1073741824) {
                iMax4 = iMax3;
            }
            abstractC1423.setMeasuredDimension(View.resolveSizeAndState(Math.max(abstractC1423.getPaddingRight() + abstractC1423.getPaddingLeft() + iMax4, abstractC1423.getSuggestedMinimumWidth()), i, i38), iResolveSizeAndState);
            if (z9) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(abstractC1423.getMeasuredWidth(), 1073741824);
                int i48 = 0;
                while (i48 < virtualChildCount) {
                    View childAt5 = abstractC1423.getChildAt(i48);
                    if (childAt5.getVisibility() != 8) {
                        C0550 c05505 = (C0550) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) c05505).width == -1) {
                            int i49 = ((LinearLayout.LayoutParams) c05505).height;
                            ((LinearLayout.LayoutParams) c05505).height = childAt5.getMeasuredHeight();
                            abstractC1423.measureChildWithMargins(childAt5, iMakeMeasureSpec, 0, i39, 0);
                            ((LinearLayout.LayoutParams) c05505).height = i49;
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
        abstractC1423.f6717 = 0;
        int virtualChildCount2 = abstractC1423.getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i50);
        int mode4 = View.MeasureSpec.getMode(i2);
        int[] iArr4 = abstractC1423.f6724;
        if (iArr4 == null || (iArr = abstractC1423.f6725) == null) {
            iArr4 = new int[4];
            abstractC1423.f6724 = iArr4;
            iArr = new int[4];
            abstractC1423.f6725 = iArr;
        }
        int[] iArr5 = iArr4;
        int[] iArr6 = iArr;
        iArr5[3] = -1;
        char c = 2;
        iArr5[2] = -1;
        iArr5[1] = -1;
        iArr5[0] = -1;
        iArr6[3] = -1;
        iArr6[2] = -1;
        iArr6[1] = -1;
        iArr6[0] = -1;
        boolean z15 = abstractC1423.f6727;
        boolean z16 = abstractC1423.f6726;
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
            View childAt6 = abstractC1423.getChildAt(i51);
            if (childAt6 == null) {
                abstractC1423.f6717 = abstractC1423.f6717;
                i11 = i51;
                i15 = i53;
                iArr3 = iArr5;
                iArr2 = iArr6;
                z = z15;
                z2 = z16;
            } else {
                int i54 = i52;
                if (childAt6.getVisibility() == 8) {
                    i50 = i;
                    i11 = i51;
                    i15 = i53;
                    iArr2 = iArr6;
                    z = z15;
                    z2 = z16;
                    i52 = i54;
                    iArr3 = iArr5;
                } else {
                    if (abstractC1423.m2886(i51)) {
                        abstractC1423.f6717 += abstractC1423.f6716;
                    }
                    C0550 c05506 = (C0550) childAt6.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) c05506).weight;
                    f5 += f6;
                    int i55 = i51;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) c05506).width == 0 && f6 > 0.0f) {
                        int i56 = abstractC1423.f6717;
                        int i57 = ((LinearLayout.LayoutParams) c05506).leftMargin;
                        if (z17) {
                            abstractC1423.f6717 = i57 + ((LinearLayout.LayoutParams) c05506).rightMargin + i56;
                        } else {
                            abstractC1423.f6717 = Math.max(i56, i56 + i57 + ((LinearLayout.LayoutParams) c05506).rightMargin);
                        }
                        if (z15) {
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
                            view = childAt6;
                            z = z15;
                            z2 = z16;
                            i12 = i54;
                            i11 = i55;
                            c0550 = c05506;
                            iArr3 = iArr5;
                            iArr2 = iArr6;
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
                            c0550 = c05506;
                            iArr3 = iArr5;
                            iArr2 = iArr6;
                            i50 = i;
                            i13 = i53;
                            i10 = iMax7;
                            if (mode4 == i14 && ((LinearLayout.LayoutParams) c0550).height == -1) {
                                z3 = true;
                                z19 = true;
                            } else {
                                z3 = false;
                            }
                            int i58 = ((LinearLayout.LayoutParams) c0550).topMargin + ((LinearLayout.LayoutParams) c0550).bottomMargin;
                            int measuredHeight3 = view.getMeasuredHeight() + i58;
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                            if (z) {
                                z4 = z3;
                            } else {
                                int baseline2 = view.getBaseline();
                                z4 = z3;
                                if (baseline2 != -1) {
                                    int i59 = ((LinearLayout.LayoutParams) c0550).gravity;
                                    if (i59 < 0) {
                                        i59 = abstractC1423.f6723;
                                    }
                                    int i60 = (((i59 & 112) >> 4) & (-2)) >> 1;
                                    iArr3[i60] = Math.max(iArr3[i60], baseline2);
                                    iArr2[i60] = Math.max(iArr2[i60], measuredHeight3 - baseline2);
                                }
                            }
                            int iMax9 = Math.max(i12, measuredHeight3);
                            boolean z21 = !z18 && ((LinearLayout.LayoutParams) c0550).height == -1;
                            if (((LinearLayout.LayoutParams) c0550).weight <= 0.0f) {
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
                        if (((LinearLayout.LayoutParams) c05506).width != 0 || f6 <= 0.0f) {
                            i9 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) c05506).width = -2;
                            i9 = 0;
                        }
                        iArr2 = iArr6;
                        i10 = iMax7;
                        i11 = i55;
                        z = z15;
                        z2 = z16;
                        int i62 = i9;
                        c0550 = c05506;
                        i12 = i54;
                        i50 = i;
                        iArr3 = iArr5;
                        i13 = i53;
                        abstractC1423.measureChildWithMargins(childAt6, i50, f5 == 0.0f ? abstractC1423.f6717 : 0, i2, 0);
                        if (i62 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) c0550).width = i62;
                        }
                        int measuredWidth3 = childAt6.getMeasuredWidth();
                        int i63 = abstractC1423.f6717;
                        int i64 = ((LinearLayout.LayoutParams) c0550).leftMargin;
                        if (z17) {
                            view = childAt6;
                            abstractC1423.f6717 = i64 + measuredWidth3 + ((LinearLayout.LayoutParams) c0550).rightMargin + i63;
                        } else {
                            view = childAt6;
                            abstractC1423.f6717 = Math.max(i63, i63 + measuredWidth3 + i64 + ((LinearLayout.LayoutParams) c0550).rightMargin);
                        }
                        if (z2) {
                            iMax8 = Math.max(measuredWidth3, iMax8);
                        }
                    }
                    i14 = 1073741824;
                    if (mode4 == i14) {
                        z3 = false;
                        int i582 = ((LinearLayout.LayoutParams) c0550).topMargin + ((LinearLayout.LayoutParams) c0550).bottomMargin;
                        int measuredHeight32 = view.getMeasuredHeight() + i582;
                        iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, view.getMeasuredState());
                        if (z) {
                        }
                        int iMax92 = Math.max(i12, measuredHeight32);
                        if (z18) {
                            if (((LinearLayout.LayoutParams) c0550).weight <= 0.0f) {
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
            iArr5 = iArr3;
            iArr6 = iArr2;
            z15 = z;
            z16 = z2;
        }
        int[] iArr7 = iArr5;
        int[] iArr8 = iArr6;
        char c3 = c;
        boolean z22 = z15;
        boolean z23 = z16;
        int i65 = i52;
        int i66 = i53;
        int i67 = iMax7;
        if (abstractC1423.f6717 > 0 && abstractC1423.m2886(virtualChildCount2)) {
            abstractC1423.f6717 += abstractC1423.f6716;
        }
        int i68 = iArr7[1];
        int iMax10 = (i68 == -1 && iArr7[0] == -1 && iArr7[c3] == -1 && iArr7[3] == -1) ? i65 : Math.max(i65, Math.max(iArr8[3], Math.max(iArr8[0], Math.max(iArr8[1], iArr8[c3]))) + Math.max(iArr7[3], Math.max(iArr7[0], Math.max(i68, iArr7[c3]))));
        if (z23 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
            abstractC1423.f6717 = 0;
            for (int i69 = 0; i69 < virtualChildCount2; i69++) {
                View childAt7 = abstractC1423.getChildAt(i69);
                if (childAt7 == null) {
                    abstractC1423.f6717 = abstractC1423.f6717;
                } else if (childAt7.getVisibility() != 8) {
                    C0550 c05507 = (C0550) childAt7.getLayoutParams();
                    int i70 = abstractC1423.f6717;
                    if (z17) {
                        abstractC1423.f6717 = ((LinearLayout.LayoutParams) c05507).leftMargin + iMax8 + ((LinearLayout.LayoutParams) c05507).rightMargin + i70;
                    } else {
                        abstractC1423.f6717 = Math.max(i70, i70 + iMax8 + ((LinearLayout.LayoutParams) c05507).leftMargin + ((LinearLayout.LayoutParams) c05507).rightMargin);
                    }
                }
            }
        }
        int paddingRight = abstractC1423.getPaddingRight() + abstractC1423.getPaddingLeft() + abstractC1423.f6717;
        abstractC1423.f6717 = paddingRight;
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, abstractC1423.getSuggestedMinimumWidth()), i50, 0);
        int i71 = (iResolveSizeAndState2 & 16777215) - abstractC1423.f6717;
        if (z20 || (i71 != 0 && f5 > 0.0f)) {
            float f7 = abstractC1423.f6719;
            if (f7 > 0.0f) {
                f5 = f7;
            }
            iArr7[3] = -1;
            iArr7[c3] = -1;
            iArr7[1] = -1;
            iArr7[0] = -1;
            iArr8[3] = -1;
            iArr8[c3] = -1;
            iArr8[1] = -1;
            iArr8[0] = -1;
            abstractC1423.f6717 = 0;
            iMax10 = -1;
            int i72 = 0;
            while (i72 < virtualChildCount2) {
                View childAt8 = abstractC1423.getChildAt(i72);
                if (childAt8 == null || childAt8.getVisibility() == 8) {
                    i6 = iResolveSizeAndState2;
                } else {
                    C0550 c05508 = (C0550) childAt8.getLayoutParams();
                    float f8 = ((LinearLayout.LayoutParams) c05508).weight;
                    if (f8 > 0.0f) {
                        int i73 = (int) ((i71 * f8) / f5);
                        f5 -= f8;
                        i71 -= i73;
                        i6 = iResolveSizeAndState2;
                        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, abstractC1423.getPaddingBottom() + abstractC1423.getPaddingTop() + ((LinearLayout.LayoutParams) c05508).topMargin + ((LinearLayout.LayoutParams) c05508).bottomMargin, ((LinearLayout.LayoutParams) c05508).height);
                        if (((LinearLayout.LayoutParams) c05508).width == 0) {
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
                    int i74 = abstractC1423.f6717;
                    if (z17) {
                        abstractC1423.f6717 = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) c05508).leftMargin + ((LinearLayout.LayoutParams) c05508).rightMargin + i74;
                    } else {
                        abstractC1423.f6717 = Math.max(i74, childAt8.getMeasuredWidth() + i74 + ((LinearLayout.LayoutParams) c05508).leftMargin + ((LinearLayout.LayoutParams) c05508).rightMargin);
                    }
                    boolean z24 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) c05508).height == -1;
                    int i75 = ((LinearLayout.LayoutParams) c05508).topMargin + ((LinearLayout.LayoutParams) c05508).bottomMargin;
                    int measuredHeight4 = childAt8.getMeasuredHeight() + i75;
                    iMax10 = Math.max(iMax10, measuredHeight4);
                    if (!z24) {
                        i75 = measuredHeight4;
                    }
                    int iMax11 = Math.max(i66, i75);
                    if (z18) {
                        i7 = -1;
                        boolean z25 = ((LinearLayout.LayoutParams) c05508).height == -1;
                        if (!z22 && (baseline = childAt8.getBaseline()) != i7) {
                            int i76 = ((LinearLayout.LayoutParams) c05508).gravity;
                            if (i76 < 0) {
                                i76 = abstractC1423.f6723;
                            }
                            int i77 = (((i76 & 112) >> 4) & (-2)) >> 1;
                            iArr7[i77] = Math.max(iArr7[i77], baseline);
                            iArr8[i77] = Math.max(iArr8[i77], measuredHeight4 - baseline);
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
            abstractC1423.f6717 = abstractC1423.getPaddingRight() + abstractC1423.getPaddingLeft() + abstractC1423.f6717;
            int i78 = iArr7[1];
            if (i78 == -1 && iArr7[0] == -1 && iArr7[c3] == -1 && iArr7[3] == -1) {
                i5 = 0;
            } else {
                i5 = 0;
                iMax10 = Math.max(iMax10, Math.max(iArr8[3], Math.max(iArr8[0], Math.max(iArr8[1], iArr8[c3]))) + Math.max(iArr7[3], Math.max(iArr7[0], Math.max(i78, iArr7[c3]))));
            }
            iMax = i66;
        } else {
            iMax = Math.max(i66, i67);
            if (z23 && mode3 != 1073741824) {
                for (int i79 = 0; i79 < virtualChildCount2; i79++) {
                    View childAt9 = abstractC1423.getChildAt(i79);
                    if (childAt9 != null && childAt9.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((C0550) childAt9.getLayoutParams())).weight > 0.0f) {
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
        abstractC1423.setMeasuredDimension(i3 | (iCombineMeasuredStates3 & i4), View.resolveSizeAndState(Math.max(abstractC1423.getPaddingBottom() + abstractC1423.getPaddingTop() + iMax10, abstractC1423.getSuggestedMinimumHeight()), i2, iCombineMeasuredStates3 << 16));
        if (z19) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(abstractC1423.getMeasuredHeight(), 1073741824);
            int i80 = i5;
            while (i80 < virtualChildCount2) {
                View childAt10 = abstractC1423.getChildAt(i80);
                if (childAt10.getVisibility() != 8) {
                    C0550 c05509 = (C0550) childAt10.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c05509).height == -1) {
                        int i81 = ((LinearLayout.LayoutParams) c05509).width;
                        ((LinearLayout.LayoutParams) c05509).width = childAt10.getMeasuredWidth();
                        abstractC1423.measureChildWithMargins(childAt10, i50, 0, iMakeMeasureSpec3, 0);
                        ((LinearLayout.LayoutParams) c05509).width = i81;
                    }
                }
                i80++;
                abstractC1423 = this;
                i50 = i;
            }
        }
    }

    public void setBaselineAligned(boolean z) {
        this.f6727 = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f6730 = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f6718) {
            return;
        }
        this.f6718 = drawable;
        if (drawable != null) {
            this.f6716 = drawable.getIntrinsicWidth();
            this.f6721 = drawable.getIntrinsicHeight();
        } else {
            this.f6716 = 0;
            this.f6721 = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f6722 = i;
    }

    public void setGravity(int i) {
        if (this.f6723 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f6723 = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f6723;
        if ((8388615 & i3) != i2) {
            this.f6723 = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f6726 = z;
    }

    public void setOrientation(int i) {
        if (this.f6729 != i) {
            this.f6729 = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f6728) {
            requestLayout();
        }
        this.f6728 = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f6723;
        if ((i3 & 112) != i2) {
            this.f6723 = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f6719 = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final boolean m2886(int i) {
        if (i == 0) {
            return (this.f6728 & 1) != 0;
        }
        int childCount = getChildCount();
        int i2 = this.f6728;
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

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: merged with bridge method [inline-methods] */
    public C0550 generateDefaultLayoutParams() {
        int i = this.f6729;
        if (i == 0) {
            return new C0550(-2, -2);
        }
        if (i == 1) {
            return new C0550(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: merged with bridge method [inline-methods] */
    public C0550 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0550(layoutParams);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m2887(int i, Canvas canvas) {
        this.f6718.setBounds(getPaddingLeft() + this.f6722, i, (getWidth() - getPaddingRight()) - this.f6722, this.f6721 + i);
        this.f6718.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: merged with bridge method [inline-methods] */
    public C0550 generateLayoutParams(AttributeSet attributeSet) {
        return new C0550(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m2888(int i, Canvas canvas) {
        this.f6718.setBounds(i, getPaddingTop() + this.f6722, this.f6716 + i, (getHeight() - getPaddingBottom()) - this.f6722);
        this.f6718.draw(canvas);
    }
}
