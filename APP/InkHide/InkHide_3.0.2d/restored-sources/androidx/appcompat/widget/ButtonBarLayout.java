package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p055lu.wxmask272.R;
import java.util.WeakHashMap;
import p058d.AbstractC0515a;
import p099y.AbstractC1048L;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: b */
    public boolean f1013b;

    /* JADX INFO: renamed from: c */
    public boolean f1014c;

    /* JADX INFO: renamed from: d */
    public int f1015d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1015d = -1;
        int[] iArr = AbstractC0515a.f1647k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        AbstractC1048L.m2289h(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        this.f1013b = typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1013b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setStacked(boolean z2) {
        if (this.f1014c != z2) {
            if (!z2 || this.f1013b) {
                this.f1014c = z2;
                setOrientation(z2 ? 1 : 0);
                setGravity(z2 ? 8388613 : 80);
                View viewFindViewById = findViewById(R.id.spacer);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z2 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int iMakeMeasureSpec;
        boolean z2;
        int i4;
        int size = View.MeasureSpec.getSize(i2);
        int paddingBottom = 0;
        if (this.f1013b) {
            if (size > this.f1015d && this.f1014c) {
                setStacked(false);
            }
            this.f1015d = size;
        }
        if (this.f1014c || View.MeasureSpec.getMode(i2) != 1073741824) {
            iMakeMeasureSpec = i2;
            z2 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z2 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i3);
        if (this.f1013b && !this.f1014c && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z2 = true;
        }
        if (z2) {
            super.onMeasure(i2, i3);
        }
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            i4 = -1;
            if (i5 >= childCount) {
                i5 = -1;
                break;
            } else if (getChildAt(i5).getVisibility() == 0) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            View childAt = getChildAt(i5);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f1014c) {
                int i6 = i5 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i6 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i6).getVisibility() == 0) {
                        i4 = i6;
                        break;
                    }
                    i6++;
                }
                paddingBottom = i4 >= 0 ? getChildAt(i4).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                paddingBottom = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        if (getMinimumHeight() != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i3 == 0) {
                super.onMeasure(i2, i3);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAllowStacking(boolean z2) {
        if (this.f1013b != z2) {
            this.f1013b = z2;
            if (!z2 && this.f1014c) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
