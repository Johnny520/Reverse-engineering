package p000;

import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Path;
import android.os.ext.SdkExtensions;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: S */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0773S {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ int m1566A() {
        return WindowInsets.Type.ime();
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ int m1567B() {
        return WindowInsets.Type.systemGestures();
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ int m1568C() {
        return WindowInsets.Type.mandatorySystemGestures();
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ int m1569D() {
        return WindowInsets.Type.tappableElement();
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ float m1570a(WindowInsetsAnimation r0) {
        return r0.getInterpolatedFraction();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ int m1571b() {
        return SdkExtensions.getExtensionVersion(30);
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ int m1572c(WindowInsetsAnimation r0) {
        return r0.getTypeMask();
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ long m1573d(WindowInsetsAnimation r2) {
        return r2.getDurationMillis();
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ Insets m1574e(WindowInsets r0, int r1) {
        return r0.getInsets(r1);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ Insets m1575f(WindowInsetsAnimation.Bounds r0) {
        return r0.getUpperBound();
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ WindowInsets m1576g() {
        return WindowInsets.CONSUMED;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ WindowInsetsAnimation.Bounds m1577h(Insets r1, Insets r2) {
        return new WindowInsetsAnimation.Bounds(r1, r2);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ WindowInsetsAnimation m1578i(int r1, Interpolator r2, long r3) {
        return new WindowInsetsAnimation(r1, r2, r3);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ WindowInsetsAnimation m1579j(Object r0) {
        return (WindowInsetsAnimation) r0;
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ WindowInsetsController m1580k(ViewGroup r0) {
        return r0.getWindowInsetsController();
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m1581l() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m1582m() {
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ void m1583n(Outline r0, Path r1) {
        r0.setPath(r1);
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m1584o(View r0, C2409qF r1) {
        r0.setWindowInsetsAnimationCallback(r1);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m1585p(WindowInsets.Builder r0, int r1, Insets r2) {
        r0.setInsets(r1, r2);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m1586q(WindowInsetsAnimation r0, float r1) {
        r0.setFraction(r1);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m1587r(WindowInsetsController r1) {
        r1.setSystemBarsBehavior(2);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m1588s(WindowInsetsController r0, int r1) {
        r0.show(r1);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ float m1589t(WindowInsetsAnimation r0) {
        return r0.getFraction();
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ int m1590u() {
        return WindowInsets.Type.statusBars();
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ Insets m1591v(WindowInsetsAnimation.Bounds r0) {
        return r0.getLowerBound();
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m1592w() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ void m1593x(WindowInsetsController r0, int r1) {
        r0.hide(r1);
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ int m1594y() {
        return WindowInsets.Type.navigationBars();
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ int m1595z() {
        return WindowInsets.Type.captionBar();
    }
}
