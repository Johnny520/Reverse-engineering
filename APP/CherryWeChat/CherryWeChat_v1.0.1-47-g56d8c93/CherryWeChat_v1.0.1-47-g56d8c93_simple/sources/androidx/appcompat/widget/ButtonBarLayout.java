package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import io.github.cherrywechat.R;
import java.util.WeakHashMap;
import p000.AbstractC0982Wu;
import p000.AbstractC2185lE;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public boolean f3789a;

    /* JADX INFO: renamed from: b */
    public boolean f3790b;

    /* JADX INFO: renamed from: c */
    public int f3791c;

    public ButtonBarLayout(Context r8, AttributeSet r9) {
        super(r8, r9);
        this.f3791c = -1;
        int[] r3 = AbstractC0982Wu.f3076k;
        TypedArray r5 = r8.obtainStyledAttributes(r9, r3);
        AbstractC2185lE.m4398k(this, r8, r3, r9, r5, 0);
        this.f3789a = r5.getBoolean(0, true);
        r5.recycle();
        if (getOrientation() != 1) goto L6;
        setStacked(this.f3789a);
        return;
    }

    private void setStacked(boolean r2) {
        if (this.f3790b == r2) goto L20;
        if (r2 == true) goto L6;
    L7:
        this.f3790b = r2;
        setOrientation(r2 ? 1 : 0);
        if (r2 == false) goto L10;
        int r0 = 8388613;
    L11:
        setGravity(r0);
        View r02 = findViewById(R.id.spacer);
        if (r02 == null) goto L17;
        if (r2 == false) goto L15;
        int r22 = 8;
    L16:
        r02.setVisibility(r22);
        goto L17
    L15:
        r22 = 4;
    L17:
        int r23 = getChildCount() - 2;
    L18:
        if (r23 < 0) goto L23;
        bringChildToFront(getChildAt(r23));
        r23 = r23 - 1;
        goto L18
    L23:
        return;
    L10:
        r0 = 80;
        goto L11
    L6:
        if (this.f3789a == true) goto L7;
        return;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r7, int r8) {
        int r0 = View.MeasureSpec.getSize(r7);
        int r2 = 0;
        if (this.f3789a == false) goto L11;
        if (r0 > this.f3791c) goto L7;
    L9:
        this.f3791c = r0;
        goto L11
    L7:
        if (this.f3790b == false) goto L9;
        setStacked(false);
    L11:
        if (this.f3790b == false) goto L13;
    L15:
        int r02 = r7;
        boolean r1 = false;
    L16:
        super.onMeasure(r02, r8);
        if (this.f3789a == true) goto L19;
    L23:
        if (r1 == false) goto L25;
        super.onMeasure(r7, r8);
    L25:
        int r03 = getChildCount();
        int r12 = 0;
    L26:
        int r4 = -1;
        if (r12 >= r03) goto L32;
        if (getChildAt(r12).getVisibility() == 0) goto L33;
        r12 = r12 + 1;
    L33:
        if (r12 < 0) goto L46;
        View r04 = getChildAt(r12);
        LinearLayout.LayoutParams r22 = (LinearLayout.LayoutParams) r04.getLayoutParams();
        int r05 = ((r04.getMeasuredHeight() + getPaddingTop()) + r22.topMargin) + r22.bottomMargin;
        if (this.f3790b == false) goto L45;
        int r13 = r12 + 1;
        int r23 = getChildCount();
    L37:
        if (r13 >= r23) goto L42;
        if (getChildAt(r13).getVisibility() == 0) goto L40;
        r13 = r13 + 1;
        goto L37
    L40:
        r4 = r13;
    L42:
        if (r4 < 0) goto L44;
        r2 = (getChildAt(r4).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f))) + r05;
        goto L46
    L44:
        r2 = r05;
        goto L46
    L45:
        r2 = getPaddingBottom() + r05;
    L46:
        WeakHashMap r06 = AbstractC2185lE.f7617a;
        if (getMinimumHeight() == r2) goto L56;
        setMinimumHeight(r2);
        if (r8 != 0) goto L57;
        super.onMeasure(r7, r8);
        return;
    L57:
        return;
    L56:
        return;
    L32:
        r12 = -1;
        goto L33
    L19:
        if (this.f3790b == true) goto L23;
        if ((getMeasuredWidthAndState() & (-16777216)) != 16777216) goto L23;
        setStacked(true);
        r1 = true;
        goto L23
    L13:
        if (View.MeasureSpec.getMode(r7) != 1073741824) goto L15;
        r02 = View.MeasureSpec.makeMeasureSpec(r0, Integer.MIN_VALUE);
        r1 = true;
        goto L16
    }

    public void setAllowStacking(boolean r2) {
        if (this.f3789a == r2) goto L11;
        this.f3789a = r2;
        if (r2 == false) goto L7;
    L9:
        requestLayout();
        return;
    L7:
        if (this.f3790b == false) goto L9;
        setStacked(false);
        goto L9
    }
}
