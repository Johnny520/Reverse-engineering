package com.lxj.xpopup.util;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.SparseArray;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class KeyboardUtils$SoftInputReceiver extends ResultReceiver {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Context f11815;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        InputMethodManager inputMethodManager;
        super.onReceiveResult(i, bundle);
        if (i == 1 || i == 3) {
            Context context = this.f11815;
            SparseArray sparseArray = AbstractC3786.f11822;
            if (context != null && (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) != null) {
                inputMethodManager.toggleSoftInput(0, 0);
            }
        }
        this.f11815 = null;
    }
}
