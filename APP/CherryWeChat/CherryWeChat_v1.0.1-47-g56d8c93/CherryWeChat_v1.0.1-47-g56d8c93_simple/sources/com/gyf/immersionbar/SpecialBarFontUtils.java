package com.gyf.immersionbar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
class SpecialBarFontUtils {
    private static int SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
    private static Method mSetStatusBarColorIcon;
    private static Method mSetStatusBarDarkIcon;
    private static Field mStatusBarColorFiled;

    static {
        mSetStatusBarColorIcon = Activity.class.getMethod("setStatusBarDarkIcon", new Class[]{Integer.TYPE});     // Catch: NoSuchMethodException -> L8
    L12:
        mSetStatusBarDarkIcon = Activity.class.getMethod("setStatusBarDarkIcon", new Class[]{Boolean.TYPE});     // Catch: NoSuchMethodException -> L9
    L18:
        mStatusBarColorFiled = WindowManager.LayoutParams.class.getField("statusBarColor");     // Catch: NoSuchFieldException -> L10
    L16:
        SYSTEM_UI_FLAG_LIGHT_STATUS_BAR = View.class.getField("SYSTEM_UI_FLAG_LIGHT_STATUS_BAR").getInt(null);     // Catch: Throwable -> L11
        return;
    }

    public SpecialBarFontUtils() {
    }

    private static boolean changeMeizuFlag(WindowManager.LayoutParams r3, String r4, boolean r5) {
        Field r42 = r3.getClass().getDeclaredField(r4);     // Catch: Throwable -> L9 IllegalArgumentException -> L11 IllegalAccessException -> L13 NoSuchFieldException -> L15
        r42.setAccessible(true);     // Catch: Throwable -> L9 IllegalArgumentException -> L11 IllegalAccessException -> L13 NoSuchFieldException -> L15
        int r43 = r42.getInt(r3);     // Catch: Throwable -> L9 IllegalArgumentException -> L11 IllegalAccessException -> L13 NoSuchFieldException -> L15
        Field r1 = r3.getClass().getDeclaredField("meizuFlags");     // Catch: Throwable -> L9 IllegalArgumentException -> L11 IllegalAccessException -> L13 NoSuchFieldException -> L15
        r1.setAccessible(true);     // Catch: Throwable -> L9 IllegalArgumentException -> L11 IllegalAccessException -> L13 NoSuchFieldException -> L15
        int r2 = r1.getInt(r3);     // Catch: Throwable -> L9 IllegalArgumentException -> L11 IllegalAccessException -> L13 NoSuchFieldException -> L15
        if (r5 == false) goto L5;
        int r44 = r43 | r2;     // Catch: Throwable -> L9 IllegalArgumentException -> L11 IllegalAccessException -> L13 NoSuchFieldException -> L15
    L6:
        if (r2 == r44) goto L21;
        r1.setInt(r3, r44);     // Catch: Throwable -> L9 IllegalArgumentException -> L11 IllegalAccessException -> L13 NoSuchFieldException -> L15
        return true;
    L21:
        return false;
    L5:
        r44 = (~r43) & r2;     // Catch: Throwable -> L9 IllegalArgumentException -> L11 IllegalAccessException -> L13 NoSuchFieldException -> L15
    L13:
        e = move-exception;
        e.printStackTrace();
        return false;
    L11:
        e = move-exception;
        e.printStackTrace();
        return false;
    L15:
        e = move-exception;
        e.printStackTrace();
        return false;
    L9:
        th = move-exception;
        th.printStackTrace();
        return false;
    }

    public static boolean isBlackColor(int r0, int r1) {
        if (toGrey(r0) >= r1) goto L6;
        return true;
    L6:
        return false;
    }

    @SuppressLint({"PrivateApi"})
    public static void setMIUIBarDark(Window r3, String r4, boolean r5) {
        if (r3 == null) goto L12;
        Class<?> r0 = r3.getClass();
        Class<?> r1 = Class.forName("android.view.MiuiWindowManager$LayoutParams");     // Catch: Exception -> L10
        int r42 = r1.getField(r4).getInt(r1);     // Catch: Exception -> L10
        Class r2 = Integer.TYPE;     // Catch: Exception -> L10
        Method r02 = r0.getMethod("setExtraFlags", new Class[]{r2, r2});     // Catch: Exception -> L10
        if (r5 == false) goto L8;
        r02.invoke(r3, new Object[]{Integer.valueOf(r42), Integer.valueOf(r42)});     // Catch: Exception -> L10
        return;
    L8:
        r02.invoke(r3, new Object[]{0, Integer.valueOf(r42)});     // Catch: Exception -> L10
        return;
    L13:
        return;
    }

    private static void setStatusBarColor(Window r2, int r3) {
        WindowManager.LayoutParams r0 = r2.getAttributes();
        Field r1 = mStatusBarColorFiled;
        if (r1 == null) goto L13;
    L8:
        e = move-exception;
        e.printStackTrace();
        return;
    L5:
        if (r1.getInt(r0) == r3) goto L14;
        mStatusBarColorFiled.set(r0, Integer.valueOf(r3));     // Catch: IllegalAccessException -> L8
        r2.setAttributes(r0);     // Catch: IllegalAccessException -> L8
        return;
    L14:
        return;
    }

    public static void setStatusBarDarkIcon(Activity r2, int r3) {
        Method r0 = mSetStatusBarColorIcon;
        if (r0 != null) goto L17;
        boolean r02 = isBlackColor(r3, 50);
        if (mStatusBarColorFiled == null) goto L15;
        setStatusBarDarkIcon(r2, r02, r02);
        setStatusBarDarkIcon(r2.getWindow(), r3);
        return;
    L15:
        setStatusBarDarkIcon(r2, r02);
        return;
    L17:
        r0.invoke(r2, new Object[]{Integer.valueOf(r3)});     // Catch: InvocationTargetException -> L6 IllegalAccessException -> L8
        return;
    L8:
        e = move-exception;
        e.printStackTrace();
        return;
    L6:
        e = move-exception;
        e.printStackTrace();
    }

    public static int toGrey(int r3) {
        int r0 = r3 & 255;
        int r1 = (65280 & r3) >> 8;
        int r12 = r1 * 75;
        int r02 = r0 * 15;
        return (r02 + (r12 + (((r3 & 16711680) >> 16) * 38))) >> 7;
    }

    public static void setStatusBarDarkIcon(Window r0, int r1) {
        setStatusBarColor(r0, r1);     // Catch: Exception -> L4
        setStatusBarDarkIcon(r0.getDecorView(), true);     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        e.printStackTrace();
    }

    public static void setStatusBarDarkIcon(Activity r1, boolean r2) {
        setStatusBarDarkIcon(r1, r2, true);
    }

    private static void setStatusBarDarkIcon(View r1, boolean r2) {
        int r0 = r1.getSystemUiVisibility();
        if (r2 == false) goto L5;
        int r22 = SYSTEM_UI_FLAG_LIGHT_STATUS_BAR | r0;
    L6:
        if (r22 == r0) goto L9;
        r1.setSystemUiVisibility(r22);
        return;
    L9:
        return;
    L5:
        r22 = (~SYSTEM_UI_FLAG_LIGHT_STATUS_BAR) & r0;
        goto L6
    }

    public static void setStatusBarDarkIcon(Window r1, boolean r2) {
        setStatusBarDarkIcon(r1.getDecorView(), r2);
        setStatusBarColor(r1, 0);
    }

    private static void setStatusBarDarkIcon(Activity r1, boolean r2, boolean r3) {
        Method r0 = mSetStatusBarDarkIcon;
        if (r0 != null) goto L13;
        if (r3 == false) goto L17;
        setStatusBarDarkIcon(r1.getWindow(), r2);
        return;
    L17:
        return;
    L13:
        r0.invoke(r1, new Object[]{Boolean.valueOf(r2)});     // Catch: InvocationTargetException -> L6 IllegalAccessException -> L8
        return;
    L8:
        e = move-exception;
        e.printStackTrace();
        return;
    L6:
        e = move-exception;
        e.printStackTrace();
    }
}
