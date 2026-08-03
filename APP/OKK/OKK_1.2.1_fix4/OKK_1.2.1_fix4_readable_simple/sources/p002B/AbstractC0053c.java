package p002B;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: B.c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0053c {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m170a(Typeface r02) {
        return r02.getWeight();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ int m171b(PrecomputedText.Params r02) {
        return r02.getBreakStrategy();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ int m172c(DisplayCutout r02) {
        return r02.hashCode();
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ long m173d(PackageInfo r2) {
        return r2.getLongVersionCode();
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ Typeface m174e(Typeface r02, int r1, boolean r2) {
        return Typeface.create(r02, r1, r2);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ Handler m175f(Looper r02) {
        return Handler.createAsync(r02);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ PrecomputedText.Params.Builder m176g(PrecomputedText.Params.Builder r02, int r1) {
        return r02.setBreakStrategy(r1);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ PrecomputedText.Params.Builder m177h(PrecomputedText.Params.Builder r02, TextDirectionHeuristic r1) {
        return r02.setTextDirection(r1);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ PrecomputedText.Params.Builder m178i(TextPaint r1) {
        return new PrecomputedText.Params.Builder(r1);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ TextDirectionHeuristic m179j(PrecomputedText.Params r02) {
        return r02.getTextDirection();
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ TextPaint m180k(PrecomputedText.Params r02) {
        return r02.getTextPaint();
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ DisplayCutout m181l(WindowInsets r02) {
        return r02.getDisplayCutout();
    }

    /* JADX INFO: renamed from: m */
    public static /* bridge */ /* synthetic */ WindowInsets m182m(WindowInsets r02) {
        return r02.consumeDisplayCutout();
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m183n() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ CharSequence m184o(AccessibilityNodeInfo r02) {
        return r02.getTooltipText();
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ String m185p() {
        return Application.getProcessName();
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m186q(PrecomputedText.Params.Builder r02) {
        r02.build();
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m187r(AccessibilityNodeInfo r02, CharSequence r1) {
        r02.setPaneTitle(r1);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m188s(AccessibilityNodeInfo r02, boolean r1) {
        r02.setScreenReaderFocusable(r1);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ boolean m189t(Object r02) {
        return r02 instanceof PrecomputedText;
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ int m190u(PrecomputedText.Params r02) {
        return r02.getHyphenationFrequency();
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ PrecomputedText.Params.Builder m191v(PrecomputedText.Params.Builder r02, int r1) {
        return r02.setHyphenationFrequency(r1);
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m192w() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
    }

    /* JADX INFO: renamed from: x */
    public static /* bridge */ /* synthetic */ void m193x(AccessibilityNodeInfo r02, boolean r1) {
        r02.setHeading(r1);
    }
}
