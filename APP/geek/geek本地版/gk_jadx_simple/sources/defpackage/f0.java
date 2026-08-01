package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Trace;
import android.text.TextDirectionHeuristic;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ljx.wechatmod.R;
import defpackage.p00;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class f0 {
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction A() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
    }

    public static /* bridge */ /* synthetic */ void B(WindowInsets.Builder r0, Insets r1) {
        r0.setSystemGestureInsets(r1);
    }

    public static /* bridge */ /* synthetic */ int C(Insets r0) {
        return r0.bottom;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction D() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
    }

    public static /* bridge */ /* synthetic */ float a(View r0) {
        return r0.getTransitionAlpha();
    }

    public static /* bridge */ /* synthetic */ int b(Insets r0) {
        return r0.left;
    }

    public static /* bridge */ /* synthetic */ ColorStateList c(ColorStateListDrawable r0) {
        return r0.getColorStateList();
    }

    public static /* bridge */ /* synthetic */ ColorStateListDrawable d(Drawable r0) {
        return (ColorStateListDrawable) r0;
    }

    public static /* bridge */ /* synthetic */ Drawable e(EditText r0) {
        return r0.getTextCursorDrawable();
    }

    public static /* bridge */ /* synthetic */ TextDirectionHeuristic f(TextView r0) {
        return r0.getTextDirectionHeuristic();
    }

    public static /* bridge */ /* synthetic */ WindowInsets g(WindowInsets.Builder r0) {
        return r0.build();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction h() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
    }

    public static /* bridge */ /* synthetic */ void i(Activity r0, p00.a r1) {
        r0.registerActivityLifecycleCallbacks(r1);
    }

    public static /* bridge */ /* synthetic */ void j(GradientDrawable r0, int r1, int r2, int r3, int r4) {
        r0.setPadding(r1, r2, r3, r4);
    }

    public static /* bridge */ /* synthetic */ void k(View r0, float r1) {
        r0.setTransitionAlpha(r1);
    }

    public static /* bridge */ /* synthetic */ void l(View r0, int r1) {
        r0.setTransitionVisibility(r1);
    }

    public static /* bridge */ /* synthetic */ void m(View r0, int r1, int r2, int r3, int r4) {
        r0.setLeftTopRightBottom(r1, r2, r3, r4);
    }

    public static /* bridge */ /* synthetic */ void n(View r0, Matrix r1) {
        r0.transformMatrixToGlobal(r1);
    }

    public static /* bridge */ /* synthetic */ void o(ViewGroup r0, boolean r1) {
        r0.suppressLayout(r1);
    }

    public static /* bridge */ /* synthetic */ void p(WindowInsets.Builder r0, Insets r1) {
        r0.setSystemWindowInsets(r1);
    }

    public static /* bridge */ /* synthetic */ void q(CoordinatorLayout r7, Context r8, int[] r9, AttributeSet r10, TypedArray r11) {
        r7.saveAttributeDataForStyleable(r8, r9, r10, r11, R.attr.coordinatorLayoutStyle, 0);
    }

    public static /* bridge */ /* synthetic */ void r(RecyclerView r7, Context r8, int[] r9, AttributeSet r10, TypedArray r11, int r12) {
        r7.saveAttributeDataForStyleable(r8, r9, r10, r11, r12, 0);
    }

    public static /* bridge */ /* synthetic */ boolean s() {
        return Trace.isEnabled();
    }

    public static /* bridge */ /* synthetic */ boolean t(Drawable r0) {
        return r0 instanceof ColorStateListDrawable;
    }

    public static /* bridge */ /* synthetic */ boolean u(TextView r0) {
        return r0.isHorizontallyScrollable();
    }

    public static /* bridge */ /* synthetic */ int v(Insets r0) {
        return r0.top;
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction w() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
    }

    public static /* bridge */ /* synthetic */ void x(View r0, Matrix r1) {
        r0.transformMatrixToLocal(r1);
    }

    public static /* bridge */ /* synthetic */ void y(WindowInsets.Builder r0, Insets r1) {
        r0.setStableInsets(r1);
    }

    public static /* bridge */ /* synthetic */ int z(Insets r0) {
        return r0.right;
    }
}
