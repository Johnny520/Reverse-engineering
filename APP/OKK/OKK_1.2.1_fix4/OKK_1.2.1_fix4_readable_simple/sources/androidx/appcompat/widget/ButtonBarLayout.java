package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.lang.reflect.Field;
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0080Q;
import p048b.AbstractC0550a;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public boolean f1153a;

    /* JADX INFO: renamed from: b */
    public boolean f1154b;

    /* JADX INFO: renamed from: c */
    public int f1155c;

    public ButtonBarLayout(Context r8, AttributeSet r9) {
        super(r8, r9);
        this.f1155c = -1;
        int[] r3 = AbstractC0550a.f1624i;
        TypedArray r02 = r8.obtainStyledAttributes(r9, r3);
        AbstractC0080Q.m290i(this, r8, r3, r9, r02, 0);
        this.f1153a = r02.getBoolean(0, true);
        r02.recycle();
        if (getOrientation() != 1) goto L6;
        setStacked(this.f1153a);
        return;
    }

    private void setStacked(boolean r2) {
        if (this.f1154b == r2) goto L20;
        if (r2 == true) goto L6;
    L7:
        this.f1154b = r2;
        setOrientation(r2 ? 1 : 0);
        if (r2 == false) goto L10;
        int r02 = 8388613;
    L11:
        setGravity(r02);
        View r03 = findViewById(C1031R.id.spacer);
        if (r03 == null) goto L17;
        if (r2 == false) goto L15;
        int r22 = 8;
    L16:
        r03.setVisibility(r22);
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
        r02 = 80;
        goto L11
    L6:
        if (this.f1153a == true) goto L7;
        return;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r7, int r8) {
        int r1 = View.MeasureSpec.getSize(r7);
        int r3 = 0;
        if (this.f1153a == false) goto L11;
        if (r1 > this.f1155c) goto L7;
    L9:
        this.f1155c = r1;
        goto L11
    L7:
        if (this.f1154b == false) goto L9;
        setStacked(false);
    L11:
        if (this.f1154b == false) goto L13;
    L15:
        int r12 = r7;
        boolean r2 = false;
    L16:
        super.onMeasure(r12, r8);
        if (this.f1153a == true) goto L19;
    L23:
        if (r2 == false) goto L25;
        super.onMeasure(r7, r8);
    L25:
        int r13 = getChildCount();
        int r22 = 0;
    L26:
        int r4 = -1;
        if (r22 >= r13) goto L32;
        if (getChildAt(r22).getVisibility() == 0) goto L33;
        r22 = r22 + 1;
    L33:
        if (r22 < 0) goto L46;
        View r14 = getChildAt(r22);
        LinearLayout.LayoutParams r32 = (LinearLayout.LayoutParams) r14.getLayoutParams();
        int r15 = ((r14.getMeasuredHeight() + getPaddingTop()) + r32.topMargin) + r32.bottomMargin;
        if (this.f1154b == false) goto L45;
        int r23 = r22 + 1;
        int r33 = getChildCount();
    L37:
        if (r23 >= r33) goto L42;
        if (getChildAt(r23).getVisibility() == 0) goto L40;
        r23 = r23 + 1;
        goto L37
    L40:
        r4 = r23;
    L42:
        if (r4 < 0) goto L44;
        r3 = (getChildAt(r4).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f))) + r15;
        goto L46
    L44:
        r3 = r15;
        goto L46
    L45:
        r3 = getPaddingBottom() + r15;
    L46:
        Field r02 = AbstractC0080Q.f219a;
        if (getMinimumHeight() == r3) goto L56;
        setMinimumHeight(r3);
        if (r8 != 0) goto L57;
        super.onMeasure(r7, r8);
        return;
    L57:
        return;
    L56:
        return;
    L32:
        r22 = -1;
        goto L33
    L19:
        if (this.f1154b == true) goto L23;
        if ((getMeasuredWidthAndState() & (-16777216)) != 16777216) goto L23;
        setStacked(true);
        r2 = true;
        goto L23
    L13:
        if (View.MeasureSpec.getMode(r7) != 1073741824) goto L15;
        r12 = View.MeasureSpec.makeMeasureSpec(r1, Integer.MIN_VALUE);
        r2 = true;
        goto L16
    }

    public void setAllowStacking(boolean r2) {
        if (this.f1153a == r2) goto L11;
        this.f1153a = r2;
        if (r2 == false) goto L7;
    L9:
        requestLayout();
        return;
    L7:
        if (this.f1154b == false) goto L9;
        setStacked(false);
        goto L9
    }
}
