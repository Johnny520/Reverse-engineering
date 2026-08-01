package defpackage;

import android.graphics.Bitmap;
import android.graphics.Picture;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.view.DisplayCutout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c0 {
    public static /* bridge */ /* synthetic */ void A(LinearLayout r0, int r1) {
        r0.setOutlineSpotShadowColor(r1);
    }

    public static /* bridge */ /* synthetic */ void B(TextView r0, int r1) {
        r0.setOutlineSpotShadowColor(r1);
    }

    public static /* bridge */ /* synthetic */ void C(FrameLayout r0, int r1) {
        r0.setOutlineAmbientShadowColor(r1);
    }

    public static /* bridge */ /* synthetic */ void D(FrameLayout r0, int r1) {
        r0.setOutlineSpotShadowColor(r1);
    }

    public static /* bridge */ /* synthetic */ int a(Typeface r0) {
        return r0.getWeight();
    }

    public static /* bridge */ /* synthetic */ int b(PrecomputedText.Params r0) {
        return r0.getBreakStrategy();
    }

    public static /* bridge */ /* synthetic */ int c(DisplayCutout r0) {
        return r0.hashCode();
    }

    public static /* bridge */ /* synthetic */ Bitmap d(Picture r0) {
        return Bitmap.createBitmap(r0);
    }

    public static /* bridge */ /* synthetic */ Typeface e(Typeface r0, int r1, boolean r2) {
        return Typeface.create(r0, r1, r2);
    }

    public static /* bridge */ /* synthetic */ Handler f(Looper r0) {
        return Handler.createAsync(r0);
    }

    public static /* bridge */ /* synthetic */ PrecomputedText.Params.Builder g(PrecomputedText.Params.Builder r0, int r1) {
        return r0.setBreakStrategy(r1);
    }

    public static /* bridge */ /* synthetic */ PrecomputedText.Params.Builder h(PrecomputedText.Params.Builder r0, TextDirectionHeuristic r1) {
        return r0.setTextDirection(r1);
    }

    public static /* synthetic */ PrecomputedText.Params.Builder i(TextPaint r1) {
        return new PrecomputedText.Params.Builder(r1);
    }

    public static /* bridge */ /* synthetic */ TextDirectionHeuristic j(PrecomputedText.Params r0) {
        return r0.getTextDirection();
    }

    public static /* bridge */ /* synthetic */ TextPaint k(PrecomputedText.Params r0) {
        return r0.getTextPaint();
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction l() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
    }

    public static /* bridge */ /* synthetic */ void m(PrecomputedText.Params.Builder r0) {
        r0.build();
    }

    public static /* bridge */ /* synthetic */ void n(View r0, int r1) {
        r0.setOutlineSpotShadowColor(r1);
    }

    public static /* bridge */ /* synthetic */ void o(AccessibilityNodeInfo r0, CharSequence r1) {
        r0.setPaneTitle(r1);
    }

    public static /* bridge */ /* synthetic */ void p(AccessibilityNodeInfo r0, boolean r1) {
        r0.setScreenReaderFocusable(r1);
    }

    public static /* bridge */ /* synthetic */ void q(FrameLayout r0, int r1) {
        r0.setOutlineAmbientShadowColor(r1);
    }

    public static /* bridge */ /* synthetic */ void r(LinearLayout r0, int r1) {
        r0.setOutlineAmbientShadowColor(r1);
    }

    public static /* bridge */ /* synthetic */ void s(TextView r0, int r1) {
        r0.setOutlineAmbientShadowColor(r1);
    }

    public static /* bridge */ /* synthetic */ boolean t(CharSequence r0) {
        return r0 instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ int u(PrecomputedText.Params r0) {
        return r0.getHyphenationFrequency();
    }

    public static /* bridge */ /* synthetic */ PrecomputedText.Params.Builder v(PrecomputedText.Params.Builder r0, int r1) {
        return r0.setHyphenationFrequency(r1);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction w() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
    }

    public static /* bridge */ /* synthetic */ void x(View r0, int r1) {
        r0.setOutlineAmbientShadowColor(r1);
    }

    public static /* bridge */ /* synthetic */ void y(AccessibilityNodeInfo r0, boolean r1) {
        r0.setHeading(r1);
    }

    public static /* bridge */ /* synthetic */ void z(FrameLayout r0, int r1) {
        r0.setOutlineSpotShadowColor(r1);
    }
}
