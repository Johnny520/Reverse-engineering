package com.lxj.xpopup.util;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.SparseArray;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class KeyboardUtils$SoftInputReceiver extends ResultReceiver {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Context f11810;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        InputMethodManager inputMethodManager;
        super.onReceiveResult(i, bundle);
        if (i == 1 || i == 3) {
            Context context = this.f11810;
            SparseArray sparseArray = AbstractC3785.f11817;
            if (context != null && (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) != null) {
                inputMethodManager.toggleSoftInput(0, 0);
            }
        }
        this.f11810 = null;
    }
}
