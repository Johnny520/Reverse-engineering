package com.lxj.xpopup.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: renamed from: com.lxj.xpopup.util.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3786 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final SparseArray f11822 = new SparseArray();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int f11821 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m8100(View view) {
        InputMethodManager inputMethodManager;
        if (view == null || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) == null) {
            return;
        }
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        Context context = view.getContext();
        KeyboardUtils$SoftInputReceiver keyboardUtils$SoftInputReceiver = new KeyboardUtils$SoftInputReceiver(new Handler());
        keyboardUtils$SoftInputReceiver.f11815 = context;
        inputMethodManager.showSoftInput(view, 0, keyboardUtils$SoftInputReceiver);
        inputMethodManager.toggleSoftInput(2, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m8101(Window window) {
        View decorView = window.getDecorView();
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        Log.d("KeyboardUtils", "getDecorViewInvisibleHeight: " + (decorView.getBottom() - rect.bottom));
        int iAbs = Math.abs(decorView.getBottom() - rect.bottom);
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("navigation_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier != 0 ? system.getDimensionPixelSize(identifier) : 0;
        Resources system2 = Resources.getSystem();
        if (iAbs > system2.getDimensionPixelSize(system2.getIdentifier("status_bar_height", "dimen", "android")) + dimensionPixelSize) {
            return iAbs - f11821;
        }
        f11821 = iAbs;
        return 0;
    }
}
