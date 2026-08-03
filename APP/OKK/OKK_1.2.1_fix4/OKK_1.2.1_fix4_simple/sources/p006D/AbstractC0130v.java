package p006D;

import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.graphics.Insets;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import com.abc.loader.ModernHookEntry;

/* JADX INFO: renamed from: D.v */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0130v {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ int m433A() {
        return WindowInsets.Type.mandatorySystemGestures();
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ int m434B() {
        return WindowInsets.Type.tappableElement();
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ int m435C() {
        return WindowInsets.Type.displayCutout();
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ float m436a(WindowInsetsAnimation r02) {
        return r02.getInterpolatedFraction();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ int m437b() {
        return WindowInsets.Type.ime();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ int m438c(WindowInsetsAnimation r02) {
        return r02.getTypeMask();
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ long m439d(WindowInsetsAnimation r2) {
        return r2.getDurationMillis();
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ InstallSourceInfo m440e(PackageManager r1) {
        return r1.getInstallSourceInfo(ModernHookEntry.WECHAT_PACKAGE);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ Insets m441f(WindowInsets r02, int r1) {
        return r02.getInsets(r1);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ Insets m442g(WindowInsetsAnimation.Bounds r02) {
        return r02.getUpperBound();
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ WindowInsets m443h() {
        return WindowInsets.CONSUMED;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ WindowInsetsAnimation.Bounds m444i(Insets r1, Insets r2) {
        return new WindowInsetsAnimation.Bounds(r1, r2);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ WindowInsetsAnimation m445j(int r1, Interpolator r2, long r3) {
        return new WindowInsetsAnimation(r1, r2, r3);
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ WindowInsetsAnimation m446k(Object r02) {
        return (WindowInsetsAnimation) r02;
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ WindowInsetsController m447l(View r02) {
        return r02.getWindowInsetsController();
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ WindowInsetsController m448m(Window r02) {
        return r02.getInsetsController();
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m449n() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m450o() {
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m451p(View r02, C0090a0 r1) {
        r02.setWindowInsetsAnimationCallback(r1);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m452q(WindowInsets.Builder r02, int r1, Insets r2) {
        r02.setInsets(r1, r2);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m453r(WindowInsetsAnimation r02, float r1) {
        r02.setFraction(r1);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m454s(WindowInsetsController r02, int r1) {
        r02.show(r1);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ float m455t(WindowInsetsAnimation r02) {
        return r02.getFraction();
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ int m456u() {
        return WindowInsets.Type.statusBars();
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ Insets m457v(WindowInsetsAnimation.Bounds r02) {
        return r02.getLowerBound();
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m458w() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ int m459x() {
        return WindowInsets.Type.navigationBars();
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ int m460y() {
        return WindowInsets.Type.captionBar();
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ int m461z() {
        return WindowInsets.Type.systemGestures();
    }
}
