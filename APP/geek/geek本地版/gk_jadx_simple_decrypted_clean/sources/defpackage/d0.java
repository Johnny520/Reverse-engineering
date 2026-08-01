package defpackage;

import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Path;
import android.os.Environment;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d0 {
    public static /* bridge */ /* synthetic */ int A() {
        return WindowInsets.Type.ime();
    }

    public static /* bridge */ /* synthetic */ int B() {
        return WindowInsets.Type.systemGestures();
    }

    public static /* bridge */ /* synthetic */ int C() {
        return WindowInsets.Type.mandatorySystemGestures();
    }

    public static /* bridge */ /* synthetic */ int D() {
        return WindowInsets.Type.tappableElement();
    }

    public static /* bridge */ /* synthetic */ float a(WindowInsetsAnimation r0) {
        return r0.getInterpolatedFraction();
    }

    public static /* bridge */ /* synthetic */ int b() {
        return WindowInsets.Type.statusBars();
    }

    public static /* bridge */ /* synthetic */ int c(WindowInsetsAnimation r0) {
        return r0.getTypeMask();
    }

    public static /* bridge */ /* synthetic */ long d(WindowInsetsAnimation r2) {
        return r2.getDurationMillis();
    }

    public static /* bridge */ /* synthetic */ Insets e(WindowInsets r0, int r1) {
        return r0.getInsets(r1);
    }

    public static /* bridge */ /* synthetic */ Insets f(WindowInsetsAnimation.Bounds r0) {
        return r0.getUpperBound();
    }

    public static /* bridge */ /* synthetic */ WindowInsets g() {
        return WindowInsets.CONSUMED;
    }

    public static /* synthetic */ WindowInsetsAnimation.Bounds h(Insets r1, Insets r2) {
        return new WindowInsetsAnimation.Bounds(r1, r2);
    }

    public static /* synthetic */ WindowInsetsAnimation i(int r1, Interpolator r2, long r3) {
        return new WindowInsetsAnimation(r1, r2, r3);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation j(Object r0) {
        return (WindowInsetsAnimation) r0;
    }

    public static /* bridge */ /* synthetic */ WindowInsetsController k(View r0) {
        return r0.getWindowInsetsController();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction l() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
    }

    public static /* synthetic */ void m() {
    }

    public static /* bridge */ /* synthetic */ void n(Outline r0, Path r1) {
        r0.setPath(r1);
    }

    public static /* bridge */ /* synthetic */ void o(View r0, dc0 r1) {
        r0.setWindowInsetsAnimationCallback(r1);
    }

    public static /* bridge */ /* synthetic */ void p(Window r1) {
        r1.setDecorFitsSystemWindows(false);
    }

    public static /* bridge */ /* synthetic */ void q(WindowInsets.Builder r0, int r1, Insets r2) {
        r0.setInsets(r1, r2);
    }

    public static /* bridge */ /* synthetic */ void r(WindowInsetsAnimation r0, float r1) {
        r0.setFraction(r1);
    }

    public static /* bridge */ /* synthetic */ void s(WindowInsetsController r1, int r2) {
        r1.setSystemBarsAppearance(r2, 8);
    }

    public static /* bridge */ /* synthetic */ void t(AccessibilityNodeInfo r0, CharSequence r1) {
        r0.setStateDescription(r1);
    }

    public static /* bridge */ /* synthetic */ boolean u() {
        return Environment.isExternalStorageManager();
    }

    public static /* bridge */ /* synthetic */ float v(WindowInsetsAnimation r0) {
        return r0.getFraction();
    }

    public static /* bridge */ /* synthetic */ int w() {
        return WindowInsets.Type.navigationBars();
    }

    public static /* bridge */ /* synthetic */ Insets x(WindowInsetsAnimation.Bounds r0) {
        return r0.getLowerBound();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction y() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
    }

    public static /* bridge */ /* synthetic */ int z() {
        return WindowInsets.Type.captionBar();
    }
}
