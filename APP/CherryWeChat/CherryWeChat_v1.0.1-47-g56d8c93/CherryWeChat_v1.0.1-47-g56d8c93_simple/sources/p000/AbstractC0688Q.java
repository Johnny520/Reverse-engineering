package p000;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.Typeface;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import io.github.cherrywechat.R;
import p000.FragmentC0983Wv;

/* JADX INFO: renamed from: Q */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0688Q {
    /* JADX INFO: renamed from: A */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m1393A() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
    }

    /* JADX INFO: renamed from: B */
    public static /* bridge */ /* synthetic */ void m1394B(Window r1) {
        r1.setNavigationBarContrastEnforced(false);
    }

    /* JADX INFO: renamed from: C */
    public static /* bridge */ /* synthetic */ int m1395C(Insets r0) {
        return r0.bottom;
    }

    /* JADX INFO: renamed from: D */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m1396D() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m1397a(Insets r0) {
        return r0.left;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ ColorStateList m1398b(ColorStateListDrawable r0) {
        return r0.getColorStateList();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Typeface.CustomFallbackBuilder m1399c(FontFamily r1) {
        return new Typeface.CustomFallbackBuilder(r1);
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ Typeface m1400d(Typeface.CustomFallbackBuilder r0) {
        return r0.build();
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ ColorStateListDrawable m1401e(Drawable r0) {
        return (ColorStateListDrawable) r0;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ Drawable m1402f(EditText r0) {
        return r0.getTextCursorDrawable();
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ Font.Builder m1403g(Font.Builder r0, String r1) {
        return r0.setFontVariationSettings(r1);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ Font m1404h(Font.Builder r0) {
        return r0.build();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ FontFamily.Builder m1405i(Font r1) {
        return new FontFamily.Builder(r1);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ FontFamily m1406j(FontFamily.Builder r0) {
        return r0.build();
    }

    /* JADX INFO: renamed from: k */
    public static /* bridge */ /* synthetic */ Uri m1407k(Uri r0) {
        return MediaStore.setRequireOriginal(r0);
    }

    /* JADX INFO: renamed from: l */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m1408l() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m1409m() {
    }

    /* JADX INFO: renamed from: n */
    public static /* bridge */ /* synthetic */ void m1410n(Activity r0, FragmentC0983Wv.a r1) {
        r0.registerActivityLifecycleCallbacks(r1);
    }

    /* JADX INFO: renamed from: o */
    public static /* bridge */ /* synthetic */ void m1411o(Typeface.CustomFallbackBuilder r0, FontFamily r1) {
        r0.addCustomFallback(r1);
    }

    /* JADX INFO: renamed from: p */
    public static /* bridge */ /* synthetic */ void m1412p(Typeface.CustomFallbackBuilder r0, String r1) {
        r0.setSystemFallback(r1);
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ void m1413q(View r0, float r1) {
        r0.setTransitionAlpha(r1);
    }

    /* JADX INFO: renamed from: r */
    public static /* bridge */ /* synthetic */ void m1414r(Window r1) {
        r1.setStatusBarContrastEnforced(false);
    }

    /* JADX INFO: renamed from: s */
    public static /* bridge */ /* synthetic */ void m1415s(CoordinatorLayout r7, Context r8, int[] r9, AttributeSet r10, TypedArray r11) {
        r7.saveAttributeDataForStyleable(r8, r9, r10, r11, R.attr.coordinatorLayoutStyle, 0);
    }

    /* JADX INFO: renamed from: t */
    public static /* bridge */ /* synthetic */ boolean m1416t() {
        return Environment.isExternalStorageLegacy();
    }

    /* JADX INFO: renamed from: u */
    public static /* bridge */ /* synthetic */ boolean m1417u(Drawable r0) {
        return r0 instanceof ColorStateListDrawable;
    }

    /* JADX INFO: renamed from: v */
    public static /* bridge */ /* synthetic */ int m1418v(Insets r0) {
        return r0.top;
    }

    /* JADX INFO: renamed from: w */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m1419w() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m1420x() {
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ void m1421y(Window r1) {
        r1.setNavigationBarContrastEnforced(true);
    }

    /* JADX INFO: renamed from: z */
    public static /* bridge */ /* synthetic */ int m1422z(Insets r0) {
        return r0.right;
    }
}
