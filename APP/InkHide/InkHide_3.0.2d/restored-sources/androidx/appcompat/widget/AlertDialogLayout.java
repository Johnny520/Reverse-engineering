package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p055lu.wxmask272.R;
import java.util.WeakHashMap;
import p069i.AbstractC0728y0;
import p069i.C0726x0;
import p099y.AbstractC1048L;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends AbstractC0728y0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static int m677k(View view) {
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m677k(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    @Override // p069i.AbstractC0728y0, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int paddingLeft = getPaddingLeft();
        int i9 = i4 - i2;
        int paddingRight = i9 - getPaddingRight();
        int paddingRight2 = (i9 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i10 = gravity & 112;
        int i11 = gravity & 8388615;
        int paddingTop = i10 != 16 ? i10 != 80 ? getPaddingTop() : ((getPaddingTop() + i5) - i3) - measuredHeight : (((i5 - i3) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                C0726x0 c0726x0 = (C0726x0) childAt.getLayoutParams();
                int i13 = ((LinearLayout.LayoutParams) c0726x0).gravity;
                if (i13 < 0) {
                    i13 = i11;
                }
                WeakHashMap weakHashMap = AbstractC1048L.f3662a;
                int absoluteGravity = Gravity.getAbsoluteGravity(i13, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    i6 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c0726x0).leftMargin;
                    i7 = ((LinearLayout.LayoutParams) c0726x0).rightMargin;
                } else if (absoluteGravity != 5) {
                    i8 = ((LinearLayout.LayoutParams) c0726x0).leftMargin + paddingLeft;
                    if (m1380j(i12)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i14 = paddingTop + ((LinearLayout.LayoutParams) c0726x0).topMargin;
                    childAt.layout(i8, i14, measuredWidth + i8, i14 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0726x0).bottomMargin + i14;
                } else {
                    i6 = paddingRight - measuredWidth;
                    i7 = ((LinearLayout.LayoutParams) c0726x0).rightMargin;
                }
                i8 = i6 - i7;
                if (m1380j(i12)) {
                }
                int i142 = paddingTop + ((LinearLayout.LayoutParams) c0726x0).topMargin;
                childAt.layout(i8, i142, measuredWidth + i8, i142 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c0726x0).bottomMargin + i142;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p069i.AbstractC0728y0, android.view.View
    public final void onMeasure(int i2, int i3) {
        int iCombineMeasuredStates;
        int iM677k;
        int measuredHeight;
        int measuredHeight2;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = alertDialogLayout.getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != R.id.contentPanel && id != R.id.customPanel) || view3 != null) {
                        super.onMeasure(i2, i3);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i2, 0);
            paddingBottom += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i2, 0);
            iM677k = m677k(view2);
            measuredHeight = view2.getMeasuredHeight() - iM677k;
            paddingBottom += iM677k;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iM677k = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i2, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i5 = size - paddingBottom;
        if (view2 != null) {
            int i6 = paddingBottom - iM677k;
            int iMin = Math.min(i5, measuredHeight);
            if (iMin > 0) {
                i5 -= iMin;
                iM677k += iMin;
            }
            view2.measure(i2, View.MeasureSpec.makeMeasureSpec(iM677k, 1073741824));
            paddingBottom = i6 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i5 > 0) {
            view3.measure(i2, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i5, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt2 = alertDialogLayout.getChildAt(i7);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        int i8 = i3;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + iMax, i2, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i8, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i9 = 0;
            while (i9 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i9);
                if (childAt3.getVisibility() != 8) {
                    C0726x0 c0726x0 = (C0726x0) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c0726x0).width == -1) {
                        int i10 = ((LinearLayout.LayoutParams) c0726x0).height;
                        ((LinearLayout.LayoutParams) c0726x0).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i8, 0);
                        ((LinearLayout.LayoutParams) c0726x0).height = i10;
                    }
                }
                i9++;
                alertDialogLayout = this;
                i8 = i3;
            }
        }
    }
}
