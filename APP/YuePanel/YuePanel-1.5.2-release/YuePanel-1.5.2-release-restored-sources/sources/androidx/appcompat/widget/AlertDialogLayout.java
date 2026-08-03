package androidx.appcompat.widget;

import Yue.C5194;
import Yue.C6898;
import Yue.C8273;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C8754;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class AlertDialogLayout extends C8754 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AlertDialogLayout(@InterfaceC6490 Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m29114(View view) {
        int iM27361 = C8273.m27361(view);
        if (iM27361 > 0) {
            return iM27361;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m29114(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    @Override // androidx.appcompat.widget.C8754, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
        int i10 = gravity & C5194.f12286;
        int paddingTop = i9 != 16 ? i9 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - measuredHeight : getPaddingTop() + (((i4 - i2) - measuredHeight) / 2);
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                C8754.C1632 c1632 = (C8754.C1632) childAt.getLayoutParams();
                int i12 = ((LinearLayout.LayoutParams) c1632).gravity;
                if (i12 < 0) {
                    i12 = i10;
                }
                int iM15901 = C5194.m15901(i12, getLayoutDirection()) & 7;
                if (iM15901 == 1) {
                    i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) c1632).leftMargin;
                    i6 = ((LinearLayout.LayoutParams) c1632).rightMargin;
                } else if (iM15901 != 5) {
                    i7 = ((LinearLayout.LayoutParams) c1632).leftMargin + paddingLeft;
                    if (hasDividerBeforeChildAt(i11)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i13 = paddingTop + ((LinearLayout.LayoutParams) c1632).topMargin;
                    m29116(childAt, i7, i13, measuredWidth, measuredHeight2);
                    paddingTop = i13 + measuredHeight2 + ((LinearLayout.LayoutParams) c1632).bottomMargin;
                } else {
                    i5 = paddingRight - measuredWidth;
                    i6 = ((LinearLayout.LayoutParams) c1632).rightMargin;
                }
                i7 = i5 - i6;
                if (hasDividerBeforeChildAt(i11)) {
                }
                int i132 = paddingTop + ((LinearLayout.LayoutParams) c1632).topMargin;
                m29116(childAt, i7, i132, measuredWidth, measuredHeight2);
                paddingTop = i132 + measuredHeight2 + ((LinearLayout.LayoutParams) c1632).bottomMargin;
            }
        }
    }

    @Override // androidx.appcompat.widget.C8754, android.view.View
    public void onMeasure(int i, int i2) {
        if (m29117(i, i2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m29115(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C8754.C1632 c1632 = (C8754.C1632) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) c1632).width == -1) {
                    int i4 = ((LinearLayout.LayoutParams) c1632).height;
                    ((LinearLayout.LayoutParams) c1632).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i2, 0);
                    ((LinearLayout.LayoutParams) c1632).height = i4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m29116(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m29117(int i, int i2) {
        int iCombineMeasuredStates;
        int iM29114;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == C6898.C6903.f18958) {
                    view = childAt;
                } else if (id == C6898.C6903.f18901) {
                    view2 = childAt;
                } else {
                    if ((id != C6898.C6903.f18905 && id != C6898.C6903.f18907) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i, 0);
            paddingTop += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            iM29114 = m29114(view2);
            measuredHeight = view2.getMeasuredHeight() - iM29114;
            paddingTop += iM29114;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iM29114 = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i4 = size - paddingTop;
        if (view2 != null) {
            int i5 = paddingTop - iM29114;
            int iMin = Math.min(i4, measuredHeight);
            if (iMin > 0) {
                i4 -= iMin;
                iM29114 += iMin;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(iM29114, 1073741824));
            paddingTop = i5 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i4 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i4, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i, iCombineMeasuredStates), View.resolveSizeAndState(paddingTop, i2, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        m29115(childCount, i2);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AlertDialogLayout(@InterfaceC6490 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
