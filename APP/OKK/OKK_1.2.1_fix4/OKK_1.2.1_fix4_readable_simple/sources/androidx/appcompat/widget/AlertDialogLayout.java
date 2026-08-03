package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.lang.reflect.Field;
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0080Q;
import p057g.AbstractC0903g0;
import p057g.C0901f0;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends AbstractC0903g0 {
    public AlertDialogLayout(Context r1, AttributeSet r2) {
        super(r1, r2);
    }

    /* JADX INFO: renamed from: i */
    public static int m1130i(View r3) {
        Field r02 = AbstractC0080Q.f219a;
        int r03 = r3.getMinimumHeight();
        if (r03 <= 0) goto L6;
        return r03;
    L6:
        if ((r3 instanceof ViewGroup) == false) goto L11;
        ViewGroup r32 = (ViewGroup) r3;
        if (r32.getChildCount() != 1) goto L11;
        return m1130i(r32.getChildAt(0));
    L11:
        return 0;
    }

    @Override // p057g.AbstractC0903g0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        int r102 = getPaddingLeft();
        int r132 = r13 - r11;
        int r112 = r132 - getPaddingRight();
        int r133 = (r132 - r102) - getPaddingRight();
        int r02 = getMeasuredHeight();
        int r1 = getChildCount();
        int r2 = getGravity();
        int r3 = r2 & 112;
        int r22 = r2 & 8388615;
        if (r3 != 16) goto L5;
        int r122 = (((r14 - r12) - r02) / 2) + getPaddingTop();
    L9:
        Drawable r142 = getDividerDrawable();
        int r03 = 0;
        if (r142 != null) goto L12;
        int r143 = 0;
    L13:
        if (r03 >= r1) goto L34;
        View r32 = getChildAt(r03);
        if (r32 == null) goto L33;
        if (r32.getVisibility() == 8) goto L33;
        int r4 = r32.getMeasuredWidth();
        int r5 = r32.getMeasuredHeight();
        C0901f0 r6 = (C0901f0) r32.getLayoutParams();
        int r7 = ((LinearLayout.LayoutParams) r6).gravity;
        if (r7 >= 0) goto L21;
        r7 = r22;
    L21:
        int r72 = Gravity.getAbsoluteGravity(r7, getLayoutDirection()) & 7;
        if (r72 != 1) goto L24;
        int r73 = (((r133 - r4) / 2) + r102) + ((LinearLayout.LayoutParams) r6).leftMargin;
        int r8 = ((LinearLayout.LayoutParams) r6).rightMargin;
    L27:
        int r74 = r73 - r8;
    L30:
        if (m2233h(r03) == false) goto L32;
        r122 = r122 + r143;
    L32:
        int r123 = r122 + ((LinearLayout.LayoutParams) r6).topMargin;
        r32.layout(r74, r123, r4 + r74, r123 + r5);
        r122 = (r5 + ((LinearLayout.LayoutParams) r6).bottomMargin) + r123;
        goto L33
    L24:
        if (r72 == 5) goto L26;
        r74 = ((LinearLayout.LayoutParams) r6).leftMargin + r102;
        goto L30
    L26:
        r73 = r112 - r4;
        r8 = ((LinearLayout.LayoutParams) r6).rightMargin;
    L33:
        r03 = r03 + 1;
        goto L13
    L34:
        return;
    L12:
        r143 = r142.getIntrinsicHeight();
        goto L13
    L5:
        if (r3 == 80) goto L7;
        r122 = getPaddingTop();
        goto L9
    L7:
        r122 = ((getPaddingTop() + r14) - r12) - r02;
        goto L9
    }

    @Override // p057g.AbstractC0903g0, android.view.View
    public final void onMeasure(int r17, int r18) {
        int r7 = getChildCount();
        View r1 = null;
        View r3 = null;
        View r4 = null;
        int r5 = 0;
    L4:
        if (r5 >= r7) goto L22;
        View r9 = getChildAt(r5);
        if (r9.getVisibility() == 8) goto L21;
        int r8 = r9.getId();
        if (r8 != C1031R.id.topPanel) goto L12;
        r1 = r9;
        goto L21
    L12:
        if (r8 != C1031R.id.buttonPanel) goto L15;
        r3 = r9;
        goto L21
    L15:
        if (r8 != C1031R.id.contentPanel) goto L17;
    L18:
        if (r4 != null) goto L19;
        r4 = r9;
    L19:
        super.onMeasure(r17, r18);
        return;
    L17:
        if (r8 != C1031R.id.customPanel) goto L19;
    L21:
        r5 = r5 + 1;
        goto L4
    L22:
        int r52 = View.MeasureSpec.getMode(r18);
        int r92 = View.MeasureSpec.getSize(r18);
        int r10 = View.MeasureSpec.getMode(r17);
        int r12 = getPaddingBottom() + getPaddingTop();
        if (r1 == null) goto L25;
        r1.measure(r17, 0);
        r12 = r12 + r1.getMeasuredHeight();
        int r13 = View.combineMeasuredStates(0, r1.getMeasuredState());
    L26:
        if (r3 == null) goto L28;
        r3.measure(r17, 0);
        int r11 = m1130i(r3);
        int r132 = r3.getMeasuredHeight() - r11;
        r12 = r12 + r11;
        r13 = View.combineMeasuredStates(r13, r3.getMeasuredState());
    L29:
        if (r4 == null) goto L34;
        if (r52 != 0) goto L32;
        int r14 = 0;
    L33:
        r4.measure(r17, r14);
        int r142 = r4.getMeasuredHeight();
        r12 = r12 + r142;
        r13 = View.combineMeasuredStates(r13, r4.getMeasuredState());
    L35:
        int r93 = r92 - r12;
        if (r3 == null) goto L41;
        int r122 = r12 - r11;
        int r133 = Math.min(r93, r132);
        if (r133 <= 0) goto L40;
        r93 = r93 - r133;
        r11 = r11 + r133;
    L40:
        r3.measure(r17, View.MeasureSpec.makeMeasureSpec(r11, 1073741824));
        r12 = r122 + r3.getMeasuredHeight();
        r13 = View.combineMeasuredStates(r13, r3.getMeasuredState());
    L41:
        if (r4 == null) goto L44;
        if (r93 <= 0) goto L44;
        r4.measure(r17, View.MeasureSpec.makeMeasureSpec(r142 + r93, r52));
        r12 = (r12 - r142) + r4.getMeasuredHeight();
        r13 = View.combineMeasuredStates(r13, r4.getMeasuredState());
    L44:
        int r32 = 0;
        int r42 = 0;
    L45:
        if (r32 >= r7) goto L50;
        View r53 = getChildAt(r32);
        if (r53.getVisibility() == 8) goto L49;
        r42 = Math.max(r42, r53.getMeasuredWidth());
    L49:
        r32 = r32 + 1;
        goto L45
    L50:
        setMeasuredDimension(View.resolveSizeAndState((getPaddingRight() + getPaddingLeft()) + r42, r17, r13), View.resolveSizeAndState(r12, r18, 0));
        if (r10 == 1073741824) goto L75;
        int r102 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int r112 = 0;
    L53:
        if (r112 >= r7) goto L76;
        View r15 = getChildAt(r112);
        if (r15.getVisibility() == 8) goto L59;
        C0901f0 r123 = (C0901f0) r15.getLayoutParams();
        if (((LinearLayout.LayoutParams) r123).width != (-1)) goto L59;
        int r134 = ((LinearLayout.LayoutParams) r123).height;
        ((LinearLayout.LayoutParams) r123).height = r15.getMeasuredHeight();
        measureChildWithMargins(r15, r102, 0, r18, 0);
        ((LinearLayout.LayoutParams) r123).height = r134;
    L59:
        r112 = r112 + 1;
        goto L53
    L76:
        return;
    L75:
        return;
    L32:
        r14 = View.MeasureSpec.makeMeasureSpec(Math.max(0, r92 - r12), r52);
        goto L33
    L34:
        r142 = 0;
        goto L35
    L28:
        r11 = 0;
        r132 = 0;
        goto L29
    L25:
        r13 = 0;
        goto L26
    }
}
