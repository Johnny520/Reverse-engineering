package androidx.appcompat.widget;

import Yue.C6898;
import Yue.C8273;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f26224 = 16;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean f26225;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean f26226;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public int f26227;

    public ButtonBarLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26227 = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6898.C6909.f19589);
        C8273.m27437(this, context, C6898.C6909.f19589, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f26225 = typedArrayObtainStyledAttributes.getBoolean(C6898.C6909.f19590, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f26225);
        }
    }

    private void setStacked(boolean z) {
        if (this.f26226 != z) {
            if (!z || this.f26225) {
                this.f26226 = z;
                setOrientation(z ? 1 : 0);
                setGravity(z ? 8388613 : 80);
                View viewFindViewById = findViewById(C6898.C6903.f18945);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMakeMeasureSpec;
        boolean z;
        int size = View.MeasureSpec.getSize(i);
        int paddingBottom = 0;
        if (this.f26225) {
            if (size > this.f26227 && m4663()) {
                setStacked(false);
            }
            this.f26227 = size;
        }
        if (m4663() || View.MeasureSpec.getMode(i) != 1073741824) {
            iMakeMeasureSpec = i;
            z = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(iMakeMeasureSpec, i2);
        if (this.f26225 && !m4663() && (getMeasuredWidthAndState() & C8273.f24692) == 16777216) {
            setStacked(true);
            z = true;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int iM4662 = m4662(0);
        if (iM4662 >= 0) {
            View childAt = getChildAt(iM4662);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (m4663()) {
                int iM46622 = m4662(iM4662 + 1);
                if (iM46622 >= 0) {
                    paddingTop += getChildAt(iM46622).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (C8273.m27361(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i2 == 0) {
                super.onMeasure(i, i2);
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.f26225 != z) {
            this.f26225 = z;
            if (!z && m4663()) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public final int m4662(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean m4663() {
        return this.f26226;
    }
}
