package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.AbstractC3103;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends AbstractC1013 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static int m1048(View view) {
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m1048(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    @Override // androidx.appcompat.widget.AbstractC1013, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i3 - i;
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i9 = gravity & 112;
        int i10 = gravity & 8388615;
        int paddingTop = i9 != 16 ? i9 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - measuredHeight : (((i4 - i2) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                C1010 c1010 = (C1010) childAt.getLayoutParams();
                int i12 = ((LinearLayout.LayoutParams) c1010).gravity;
                if (i12 < 0) {
                    i12 = i10;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i12, getLayoutDirection()) & 7;
                if (absoluteGravity == 1) {
                    i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c1010).leftMargin;
                    i6 = ((LinearLayout.LayoutParams) c1010).rightMargin;
                } else if (absoluteGravity != 5) {
                    i7 = ((LinearLayout.LayoutParams) c1010).leftMargin + paddingLeft;
                    if (m1183(i11)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i13 = paddingTop + ((LinearLayout.LayoutParams) c1010).topMargin;
                    childAt.layout(i7, i13, measuredWidth + i7, i13 + measuredHeight2);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c1010).bottomMargin + i13;
                } else {
                    i5 = paddingRight - measuredWidth;
                    i6 = ((LinearLayout.LayoutParams) c1010).rightMargin;
                }
                i7 = i5 - i6;
                if (m1183(i11)) {
                }
                int i132 = paddingTop + ((LinearLayout.LayoutParams) c1010).topMargin;
                childAt.layout(i7, i132, measuredWidth + i7, i132 + measuredHeight2);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) c1010).bottomMargin + i132;
            }
        }
    }

    @Override // androidx.appcompat.widget.AbstractC1013, android.view.View
    public final void onMeasure(int i, int i2) {
        int iCombineMeasuredStates;
        int iM1048;
        int measuredHeight;
        int measuredHeight2;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = alertDialogLayout.getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == C0328R.id.topPanel) {
                    view = childAt;
                } else if (id == C0328R.id.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id != C0328R.id.contentPanel && id != C0328R.id.customPanel) || view3 != null) {
                        super.onMeasure(i, i2);
                        return;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i, 0);
            paddingBottom += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            iM1048 = m1048(view2);
            measuredHeight = view2.getMeasuredHeight() - iM1048;
            paddingBottom += iM1048;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iM1048 = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingBottom += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i4 = size - paddingBottom;
        if (view2 != null) {
            int i5 = paddingBottom - iM1048;
            int iMin = Math.min(i4, measuredHeight);
            if (iMin > 0) {
                i4 -= iMin;
                iM1048 += iMin;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(iM1048, 1073741824));
            paddingBottom = i5 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i4 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i4, mode));
            paddingBottom = (paddingBottom - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = alertDialogLayout.getChildAt(i6);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        int i7 = i2;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + iMax, i, iCombineMeasuredStates), View.resolveSizeAndState(paddingBottom, i7, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i8 = 0;
            while (i8 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i8);
                if (childAt3.getVisibility() != 8) {
                    C1010 c1010 = (C1010) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) c1010).width == -1) {
                        int i9 = ((LinearLayout.LayoutParams) c1010).height;
                        ((LinearLayout.LayoutParams) c1010).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, iMakeMeasureSpec, 0, i7, 0);
                        ((LinearLayout.LayoutParams) c1010).height = i9;
                    }
                }
                i8++;
                alertDialogLayout = this;
                i7 = i2;
            }
        }
    }
}
