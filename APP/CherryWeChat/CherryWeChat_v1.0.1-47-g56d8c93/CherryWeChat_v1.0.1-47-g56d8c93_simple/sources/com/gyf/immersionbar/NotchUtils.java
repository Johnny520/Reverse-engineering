package com.gyf.immersionbar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.TypedValue;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import p000.C2262n5;
import p000.InterfaceC1023Xs;
import p000.RunnableC2501sf;

/* JADX INFO: loaded from: classes.dex */
public class NotchUtils {
    private static final String NOTCH_HUA_WEI = "com.huawei.android.util.HwNotchSizeUtil";
    private static final String NOTCH_LENOVO = "config_screen_has_notch";
    private static final String NOTCH_MEIZU = "flyme.config.FlymeFeature";
    private static final String NOTCH_OPPO = "com.oppo.feature.screen.heteromorphism";
    private static final String NOTCH_VIVO = "android.util.FtFeature";
    private static final String NOTCH_XIAO_MI = "ro.miui.notch";
    private static final String SYSTEM_PROPERTIES = "android.os.SystemProperties";

    public NotchUtils() {
    }

    private static int dp2px(Context r1, int r2) {
        return (int) TypedValue.applyDimension(1, r2, r1.getResources().getDisplayMetrics());
    }

    private static DisplayCutout getDisplayCutout(Activity r0) {
        return getDisplayCutout(r0.getWindow().getDecorView());
    }

    private static int[] getHuaWeiNotchSize(Context r3) {
        int[] r0 = {0, 0};
        Class<?> r32 = r3.getClassLoader().loadClass(NOTCH_HUA_WEI);     // Catch: Throwable -> L5
        return (int[]) r32.getMethod("getNotchSize", null).invoke(r32, null);
    L5:
        return r0;
    }

    private static int getLenovoNotchHeight(Context r4) {
        int r0 = r4.getResources().getIdentifier("notch_h", "dimen", "android");
        if (r0 > 0) goto L5;
        return 0;
    L5:
        return r4.getResources().getDimensionPixelSize(r0);
    }

    private static int getMeizuNotchHeight(Context r4) {
        int r0 = r4.getResources().getIdentifier("fringe_height", "dimen", "android");
        if (r0 > 0) goto L5;
        return 0;
    L5:
        return r4.getResources().getDimensionPixelSize(r0);
    }

    public static int getNotchHeight(Activity r4) {
        int r1 = 0;
        if (hasNotchScreen(r4) == true) goto L5;
        return 0;
    L5:
        C2262n5 r0 = new C2262n5(r4);
        DisplayCutout r2 = getDisplayCutout(r4);
        if (r2 == null) goto L18;
        if (r4.getResources().getConfiguration().orientation != 1) goto L12;
        return r2.getSafeInsetTop();
    L12:
        if (r2.getSafeInsetLeft() != 0) goto L16;
        return r2.getSafeInsetRight();
    L16:
        return r2.getSafeInsetLeft();
    L18:
        if (hasNotchAtXiaoMi(r4) == false) goto L21;
        r1 = getXiaoMiNotchHeight(r4);
    L21:
        if (hasNotchAtHuaWei(r4) == false) goto L23;
        r1 = getHuaWeiNotchSize(r4)[1];
    L23:
        boolean r22 = hasNotchAtVIVO(r4);
        int r02 = r0.f7974a;
        if (r22 == false) goto L29;
        r1 = dp2px(r4, 32);
        if (r1 >= r02) goto L29;
        r1 = r02;
    L29:
        if (hasNotchAtOPPO(r4) == false) goto L33;
        r1 = 80;
        if (80 >= r02) goto L33;
    L35:
        if (hasNotchAtLenovo(r4) == false) goto L38;
        r02 = getLenovoNotchHeight(r4);
    L38:
        if (hasNotchAtMeiZu() == true) goto L40;
        return r02;
    L40:
        return getMeizuNotchHeight(r4);
    L33:
        r02 = r1;
        goto L35
    }

    private static int getXiaoMiNotchHeight(Context r4) {
        int r0 = r4.getResources().getIdentifier("notch_height", "dimen", "android");
        if (r0 > 0) goto L5;
        return 0;
    L5:
        return r4.getResources().getDimensionPixelSize(r0);
    }

    private static boolean hasNotchAtAndroidP(View r0) {
        if (getDisplayCutout(r0) == null) goto L6;
        return true;
    L6:
        return false;
    }

    @SuppressLint({"PrivateApi"})
    private static boolean hasNotchAtHuaWei(Context r2) {
        if (OSUtils.isHuaWei() == true) goto L9;
        return false;
    L9:
        Class<?> r22 = r2.getClassLoader().loadClass(NOTCH_HUA_WEI);     // Catch: Throwable -> L8
        return ((Boolean) r22.getMethod("hasNotchInScreen", null).invoke(r22, null)).booleanValue();
    L11:
        return false;
    }

    private static boolean hasNotchAtLenovo(Context r4) {
        if (OSUtils.isLenovo() == false) goto L8;
        int r0 = r4.getResources().getIdentifier(NOTCH_LENOVO, "bool", "android");
        if (r0 > 0) goto L7;
        return false;
    L7:
        return r4.getResources().getBoolean(r0);
    L8:
        return false;
    }

    private static boolean hasNotchAtMeiZu() {
        if (OSUtils.isMeizu() == true) goto L8;
    L6:
        return false;
    L8:
        return ((Boolean) Class.forName(NOTCH_MEIZU).getDeclaredField("IS_FRINGE_DEVICE").get(null)).booleanValue();
    }

    private static boolean hasNotchAtOPPO(Context r2) {
        if (OSUtils.isOppo() == true) goto L8;
    L6:
        return false;
    L8:
        return r2.getPackageManager().hasSystemFeature(NOTCH_OPPO);
    }

    @SuppressLint({"PrivateApi"})
    private static boolean hasNotchAtVIVO(Context r2) {
        if (OSUtils.isVivo() == true) goto L9;
        return false;
    L9:
        Class<?> r22 = r2.getClassLoader().loadClass(NOTCH_VIVO);     // Catch: Throwable -> L8
        return ((Boolean) r22.getMethod("isFeatureSupport", new Class[]{Integer.TYPE}).invoke(r22, new Object[]{32})).booleanValue();
    L11:
        return false;
    }

    @SuppressLint({"PrivateApi"})
    private static boolean hasNotchAtXiaoMi(Context r4) {
        if (OSUtils.isXiaoMi() == true) goto L14;
    L8:
        int r42 = 0;
    L10:
        if (r42 == 1) goto L12;
        return false;
    L12:
        return true;
    L14:
        Class<?> r43 = r4.getClassLoader().loadClass(SYSTEM_PROPERTIES);     // Catch: Throwable -> L13
        Object r44 = r43.getMethod("getInt", new Class[]{String.class, Integer.TYPE}).invoke(r43, new Object[]{NOTCH_XIAO_MI, 0});     // Catch: Throwable -> L13
        if (r44 == null) goto L8;
        r42 = ((Integer) r44).intValue();     // Catch: Throwable -> L13
        goto L10
    }

    public static boolean hasNotchScreen(Activity r0) {
        if (r0 != null) goto L4;
        return false;
    L4:
        return hasNotchAtAndroidP(r0);
    }

    private static DisplayCutout getDisplayCutout(View r0) {
        if (r0 == null) goto L7;
        WindowInsets r02 = r0.getRootWindowInsets();
        if (r02 != null) goto L6;
        return null;
    L6:
        return r02.getDisplayCutout();
    L7:
        return null;
    }

    private static boolean hasNotchAtAndroidP(Activity r0) {
        if (getDisplayCutout(r0) == null) goto L6;
        return true;
    L6:
        return false;
    }

    public static boolean hasNotchScreen(View r0) {
        if (r0 != null) goto L4;
        return false;
    L4:
        return hasNotchAtAndroidP(r0);
    }

    public static void getNotchHeight(Activity r1, InterfaceC1023Xs r2) {
        r1.getWindow().getDecorView().post(new RunnableC2501sf(1));
    }
}
