package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ljx.wechatmod.R;
import defpackage.ja0;
import defpackage.s90;
import defpackage.sq;
import defpackage.t90;
import defpackage.tq;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class AlertDialogLayout extends tq {
    public AlertDialogLayout(Context r2, AttributeSet r3) {
        super(r2, r3, 0);
    }

    public static int j(View r3) {
        WeakHashMap r0 = ja0.a;
        int r02 = s90.d(r3);
        if (r02 <= 0) goto L6;
        return r02;
    L6:
        if ((r3 instanceof ViewGroup) == false) goto L11;
        ViewGroup r32 = (ViewGroup) r3;
        if (r32.getChildCount() != 1) goto L11;
        return j(r32.getChildAt(0));
    L11:
        return 0;
    }

    @Override // defpackage.tq, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        int r102 = getPaddingLeft();
        int r132 = r13 - r11;
        int r112 = r132 - getPaddingRight();
        int r133 = (r132 - r102) - getPaddingRight();
        int r0 = getMeasuredHeight();
        int r1 = getChildCount();
        int r2 = getGravity();
        int r3 = r2 & 112;
        int r22 = r2 & 8388615;
        if (r3 != 16) goto L5;
        int r122 = (((r14 - r12) - r0) / 2) + getPaddingTop();
    L9:
        Drawable r142 = getDividerDrawable();
        int r02 = 0;
        if (r142 != null) goto L12;
        int r143 = 0;
    L13:
        if (r02 >= r1) goto L34;
        View r32 = getChildAt(r02);
        if (r32 == null) goto L33;
        if (r32.getVisibility() == 8) goto L33;
        int r4 = r32.getMeasuredWidth();
        int r5 = r32.getMeasuredHeight();
        sq r6 = (sq) r32.getLayoutParams();
        int r7 = ((LinearLayout.LayoutParams) r6).gravity;
        if (r7 >= 0) goto L21;
        r7 = r22;
    L21:
        WeakHashMap r8 = ja0.a;
        int r72 = Gravity.getAbsoluteGravity(r7, t90.d(this)) & 7;
        if (r72 != 1) goto L24;
        int r73 = (((r133 - r4) / 2) + r102) + ((LinearLayout.LayoutParams) r6).leftMargin;
        int r82 = ((LinearLayout.LayoutParams) r6).rightMargin;
    L27:
        int r74 = r73 - r82;
    L30:
        if (i(r02) == false) goto L32;
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
        r82 = ((LinearLayout.LayoutParams) r6).rightMargin;
    L33:
        r02 = r02 + 1;
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
        r122 = ((getPaddingTop() + r14) - r12) - r0;
        goto L9
    }

    @Override // defpackage.tq, android.view.View
    public final void onMeasure(int r17, int r18) {
        AlertDialogLayout r0 = this;
        int r6 = r0.getChildCount();
        View r2 = null;
        View r4 = null;
        View r5 = null;
        int r7 = 0;
    L4:
        if (r7 >= r6) goto L23;
        View r9 = r0.getChildAt(r7);
        if (r9.getVisibility() == 8) goto L22;
        int r8 = r9.getId();
        if (r8 != R.id.topPanel) goto L12;
        r2 = r9;
        goto L22
    L12:
        if (r8 != R.id.buttonPanel) goto L15;
        r4 = r9;
        goto L22
    L15:
        if (r8 != R.id.contentPanel) goto L17;
    L18:
        if (r5 != null) goto L19;
        r5 = r9;
    L19:
        super.onMeasure(r17, r18);
        return;
    L17:
        if (r8 != R.id.customPanel) goto L19;
    L22:
        r7 = r7 + 1;
        goto L4
    L23:
        int r72 = View.MeasureSpec.getMode(r18);
        int r92 = View.MeasureSpec.getSize(r18);
        int r10 = View.MeasureSpec.getMode(r17);
        int r12 = r0.getPaddingBottom() + r0.getPaddingTop();
        if (r2 == null) goto L26;
        r2.measure(r17, 0);
        r12 = r12 + r2.getMeasuredHeight();
        int r22 = View.combineMeasuredStates(0, r2.getMeasuredState());
    L27:
        if (r4 == null) goto L29;
        r4.measure(r17, 0);
        int r11 = j(r4);
        int r13 = r4.getMeasuredHeight() - r11;
        r12 = r12 + r11;
        r22 = View.combineMeasuredStates(r22, r4.getMeasuredState());
    L30:
        if (r5 == null) goto L35;
        if (r72 != 0) goto L33;
        int r14 = 0;
    L34:
        r5.measure(r17, r14);
        int r142 = r5.getMeasuredHeight();
        r12 = r12 + r142;
        r22 = View.combineMeasuredStates(r22, r5.getMeasuredState());
    L36:
        int r93 = r92 - r12;
        if (r4 == null) goto L42;
        int r122 = r12 - r11;
        int r132 = Math.min(r93, r13);
        if (r132 <= 0) goto L41;
        r93 = r93 - r132;
        r11 = r11 + r132;
    L41:
        r4.measure(r17, View.MeasureSpec.makeMeasureSpec(r11, 1073741824));
        r12 = r122 + r4.getMeasuredHeight();
        r22 = View.combineMeasuredStates(r22, r4.getMeasuredState());
    L42:
        if (r5 == null) goto L45;
        if (r93 <= 0) goto L45;
        r5.measure(r17, View.MeasureSpec.makeMeasureSpec(r142 + r93, r72));
        r12 = (r12 - r142) + r5.getMeasuredHeight();
        r22 = View.combineMeasuredStates(r22, r5.getMeasuredState());
    L45:
        int r42 = 0;
        int r52 = 0;
    L46:
        if (r42 >= r6) goto L51;
        View r73 = r0.getChildAt(r42);
        if (r73.getVisibility() == 8) goto L50;
        r52 = Math.max(r52, r73.getMeasuredWidth());
    L50:
        r42 = r42 + 1;
        goto L46
    L51:
        int r1 = View.resolveSizeAndState((r0.getPaddingRight() + r0.getPaddingLeft()) + r52, r17, r22);
        int r43 = r18;
        r0.setMeasuredDimension(r1, View.resolveSizeAndState(r12, r43, 0));
        if (r10 == 1073741824) goto L61;
        int r23 = View.MeasureSpec.makeMeasureSpec(r0.getMeasuredWidth(), 1073741824);
        int r74 = 0;
    L54:
        if (r74 >= r6) goto L76;
        View r15 = r0.getChildAt(r74);
        if (r15.getVisibility() == 8) goto L60;
        sq r94 = (sq) r15.getLayoutParams();
        if (((LinearLayout.LayoutParams) r94).width != (-1)) goto L60;
        int r102 = ((LinearLayout.LayoutParams) r94).height;
        ((LinearLayout.LayoutParams) r94).height = r15.getMeasuredHeight();
        r0.measureChildWithMargins(r15, r23, 0, r43, 0);
        ((LinearLayout.LayoutParams) r94).height = r102;
    L60:
        r74 = r74 + 1;
        r0 = this;
        r43 = r18;
        goto L54
    L76:
        return;
    L61:
        return;
    L33:
        r14 = View.MeasureSpec.makeMeasureSpec(Math.max(0, r92 - r12), r72);
        goto L34
    L35:
        r142 = 0;
        goto L36
    L29:
        r11 = 0;
        r13 = 0;
        goto L30
    L26:
        r22 = 0;
        goto L27
    }
}
