package com.google.android.material.internal;

import Yue.C5946;
import Yue.C8273;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.C1980R;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class FlowLayout extends ViewGroup {
    private int itemSpacing;
    private int lineSpacing;
    private int rowCount;
    private boolean singleLine;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FlowLayout(@InterfaceC6391 Context context) {
        this(context, null);
    }

    private static int getMeasuredDimension(int i, int i2, int i3) {
        return i2 != Integer.MIN_VALUE ? i2 != 1073741824 ? i3 : i : Math.min(i3, i);
    }

    private void loadFromAttributes(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1980R.styleable.FlowLayout, 0, 0);
        this.lineSpacing = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.FlowLayout_lineSpacing, 0);
        this.itemSpacing = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1980R.styleable.FlowLayout_itemSpacing, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.itemSpacing;
    }

    public int getLineSpacing() {
        return this.lineSpacing;
    }

    public int getRowCount() {
        return this.rowCount;
    }

    public int getRowIndex(@InterfaceC6391 View view) {
        Object tag = view.getTag(C1980R.id.row_index_key);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean isSingleLine() {
        return this.singleLine;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM2609;
        int iM18699;
        if (getChildCount() == 0) {
            this.rowCount = 0;
            return;
        }
        this.rowCount = 1;
        boolean z2 = C8273.m27356(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i5 = (i3 - i) - paddingLeft;
        int measuredWidth = paddingRight;
        int i6 = paddingTop;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(C1980R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    iM18699 = C5946.m18699(marginLayoutParams);
                    iM2609 = C5946.m2609(marginLayoutParams);
                } else {
                    iM2609 = 0;
                    iM18699 = 0;
                }
                int measuredWidth2 = measuredWidth + iM18699 + childAt.getMeasuredWidth();
                if (!this.singleLine && measuredWidth2 > i5) {
                    i6 = this.lineSpacing + paddingTop;
                    this.rowCount++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(C1980R.id.row_index_key, Integer.valueOf(this.rowCount - 1));
                int i8 = measuredWidth + iM18699;
                int measuredWidth3 = childAt.getMeasuredWidth() + i8;
                int measuredHeight = childAt.getMeasuredHeight() + i6;
                if (z2) {
                    childAt.layout(i5 - measuredWidth3, i6, (i5 - measuredWidth) - iM18699, measuredHeight);
                } else {
                    childAt.layout(i8, i6, measuredWidth3, measuredHeight);
                }
                measuredWidth += iM18699 + iM2609 + childAt.getMeasuredWidth() + this.itemSpacing;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i5 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i5 - getPaddingRight();
        int i6 = paddingTop;
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i3 = marginLayoutParams.leftMargin;
                    i4 = marginLayoutParams.rightMargin;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                int i9 = paddingLeft2;
                if (paddingLeft2 + i3 + childAt.getMeasuredWidth() <= paddingRight || isSingleLine()) {
                    paddingLeft = i9;
                } else {
                    paddingLeft = getPaddingLeft();
                    i6 = this.lineSpacing + paddingTop;
                }
                int measuredWidth = paddingLeft + i3 + childAt.getMeasuredWidth();
                int measuredHeight = i6 + childAt.getMeasuredHeight();
                if (measuredWidth > i7) {
                    i7 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i3 + i4 + childAt.getMeasuredWidth() + this.itemSpacing;
                if (i8 == getChildCount() - 1) {
                    i7 += i4;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(getMeasuredDimension(size, mode, i7 + getPaddingRight()), getMeasuredDimension(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public void setItemSpacing(int i) {
        this.itemSpacing = i;
    }

    public void setLineSpacing(int i) {
        this.lineSpacing = i;
    }

    public void setSingleLine(boolean z) {
        this.singleLine = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public FlowLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.singleLine = false;
        loadFromAttributes(context, attributeSet);
    }

    @TargetApi(21)
    public FlowLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.singleLine = false;
        loadFromAttributes(context, attributeSet);
    }
}
