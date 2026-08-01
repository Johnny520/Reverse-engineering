package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.davemorrissey.labs.subscaleview.R;
import p301.AbstractC8607;

/* JADX INFO: renamed from: com.google.android.material.internal.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3162 extends ViewGroup {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f10522;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f10523;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f10524;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int f10525;

    public int getItemSpacing() {
        return this.f10523;
    }

    public int getLineSpacing() {
        return this.f10525;
    }

    public int getRowCount() {
        return this.f10522;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int marginEnd;
        int marginStart;
        boolean z2;
        int i5 = 0;
        if (getChildCount() == 0) {
            this.f10522 = 0;
            return;
        }
        boolean z3 = true;
        this.f10522 = 1;
        boolean z4 = getLayoutDirection() == 1;
        int paddingRight = z4 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z4 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i6 = 0;
        int measuredWidth = paddingRight;
        int i7 = paddingTop;
        while (i6 < getChildCount()) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
                z2 = z3;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = marginLayoutParams.getMarginStart();
                    marginEnd = marginLayoutParams.getMarginEnd();
                } else {
                    marginEnd = i5;
                    marginStart = marginEnd;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + measuredWidth + marginStart;
                int i8 = i3 - i;
                z2 = z3;
                int i9 = i8 - paddingLeft;
                if (!this.f10524 && measuredWidth2 > i9) {
                    measuredWidth2 = childAt.getMeasuredWidth() + paddingRight + marginStart;
                    i7 = paddingTop + this.f10525;
                    this.f10522++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f10522 - 1));
                int measuredHeight = childAt.getMeasuredHeight() + i7;
                if (z4) {
                    childAt.layout(i8 - measuredWidth2, i7, (i8 - measuredWidth) - marginStart, measuredHeight);
                } else {
                    childAt.layout(measuredWidth + marginStart, i7, measuredWidth2, measuredHeight);
                }
                measuredWidth += childAt.getMeasuredWidth() + marginStart + marginEnd + this.f10523;
                paddingTop = measuredHeight;
            }
            i6++;
            z3 = z2;
            i5 = 0;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = marginLayoutParams.leftMargin;
                    i4 = marginLayoutParams.rightMargin;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                int i10 = i4;
                if (childAt.getMeasuredWidth() + paddingLeft + i5 > paddingRight && !((AbstractC8607) this).f10524) {
                    paddingLeft = getPaddingLeft();
                    i7 = paddingTop + this.f10525;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i5;
                int measuredHeight = childAt.getMeasuredHeight() + i7;
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i5 + i10 + this.f10523 + paddingLeft;
                if (i9 == getChildCount() - 1) {
                    i8 += i10;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i8;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i3 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i3 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i3) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i) {
        this.f10523 = i;
    }

    public void setLineSpacing(int i) {
        this.f10525 = i;
    }

    public void setSingleLine(boolean z) {
        this.f10524 = z;
    }
}
