package p001A0;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import android.text.TextDirectionHeuristic;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.TextView;
import androidx.lifecycle.C0514C;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: A0.B */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0016B {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ void m24A(WindowInsets.Builder r02, Insets r1) {
        r02.setSystemGestureInsets(r1);
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m25B() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ void m26C(WindowInsets.Builder r02, Insets r1) {
        r02.setMandatorySystemGestureInsets(r1);
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ void m27D(WindowInsets.Builder r02, Insets r1) {
        r02.setTappableElementInsets(r1);
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ float m28a(View r02) {
        return r02.getTransitionAlpha();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ int m29b(Insets r02) {
        return r02.left;
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ Insets m30c(WindowInsets r02) {
        return r02.getTappableElementInsets();
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ Drawable m31d(EditText r02) {
        return r02.getTextCursorDrawable();
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ TextDirectionHeuristic m32e(TextView r02) {
        return r02.getTextDirectionHeuristic();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ WindowInsets.Builder m33f() {
        return new WindowInsets.Builder();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ WindowInsets.Builder m34g(WindowInsets r1) {
        return new WindowInsets.Builder(r1);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ WindowInsets m35h(WindowInsets.Builder r02) {
        return r02.build();
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ WindowInsets m36i(WindowInsets r02, int r1, int r2, int r3, int r4) {
        return r02.inset(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m37j() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ void m38k(Activity r02, C0514C r1) {
        r02.registerActivityLifecycleCallbacks(r1);
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ void m39l(View r02, float r1) {
        r02.setTransitionAlpha(r1);
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ void m40m(View r02, int r1) {
        r02.setTransitionVisibility(r1);
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ void m41n(View r02, int r1, int r2, int r3, int r4) {
        r02.setLeftTopRightBottom(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m42o(View r02, Matrix r1) {
        r02.setAnimationMatrix(r1);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m43p(WindowInsets.Builder r02, Insets r1) {
        r02.setSystemWindowInsets(r1);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m44q(RecyclerView r7, Context r8, int[] r9, AttributeSet r10, TypedArray r11, int r12) {
        r7.saveAttributeDataForStyleable(r8, r9, r10, r11, r12, 0);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ boolean m45r() {
        return Trace.isEnabled();
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ boolean m46s(TextView r02) {
        return r02.isHorizontallyScrollable();
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ Insets m47t(WindowInsets r02) {
        return r02.getMandatorySystemGestureInsets();
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m48u() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ void m49v(View r02, Matrix r1) {
        r02.transformMatrixToGlobal(r1);
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ void m50w(WindowInsets.Builder r02, Insets r1) {
        r02.setStableInsets(r1);
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ Insets m51x(WindowInsets r02) {
        return r02.getSystemGestureInsets();
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m52y() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ void m53z(View r02, Matrix r1) {
        r02.transformMatrixToLocal(r1);
    }
}
