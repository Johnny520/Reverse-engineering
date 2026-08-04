package yyds;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: yyds.ᲁᛵᛲᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2227 extends ViewGroup {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2227(Context context) {
        super(context, null);
        AbstractC2328.m4341(-1559802845758318L);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC2328.m4341(-1560545875100526L);
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC2328.m4341(-1560515810329454L);
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = ((i3 - i) - getPaddingLeft()) - getPaddingRight();
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        int iMax = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                AbstractC2328.m4341(-1560176507913070L);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                if (paddingLeft2 > getPaddingLeft() && paddingLeft2 + measuredWidth > paddingLeft) {
                    paddingLeft2 = getPaddingLeft();
                    paddingTop += iMax;
                    iMax = 0;
                }
                int i6 = marginLayoutParams.leftMargin + paddingLeft2;
                int i7 = marginLayoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + i7);
                paddingLeft2 += measuredWidth;
                iMax = Math.max(iMax, measuredHeight);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C2227 c2227;
        int i3;
        int i4;
        int size = View.MeasureSpec.getMode(i) == 0 ? Integer.MAX_VALUE : (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childCount = getChildCount();
        int i5 = 0;
        int iMax = 0;
        int i6 = 0;
        int iMax2 = 0;
        while (i5 < childCount) {
            View childAt = this.getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                c2227 = this;
                i3 = i;
                i4 = i2;
                c2227.measureChildWithMargins(childAt, i3, 0, i4, 0);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                AbstractC2328.m4341(-1559837205496686L);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                if (i6 <= 0 || i6 + measuredWidth <= size) {
                    i6 += measuredWidth;
                    iMax2 = Math.max(iMax2, measuredHeight);
                } else {
                    paddingBottom += iMax2;
                    iMax = Math.max(iMax, i6);
                    i6 = measuredWidth;
                    iMax2 = measuredHeight;
                }
            } else {
                c2227 = this;
                i3 = i;
                i4 = i2;
            }
            i5++;
            this = c2227;
            i = i3;
            i2 = i4;
        }
        C2227 c22272 = this;
        c22272.setMeasuredDimension(View.resolveSize(c22272.getPaddingRight() + c22272.getPaddingLeft() + Math.max(iMax, i6), i), View.resolveSize(paddingBottom + iMax2, i2));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }
}
