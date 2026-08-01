package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3022 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C3058 m4553(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C3058 c3058M4623 = C3058.m4623(null, rootWindowInsets);
        C3071 c3071 = c3058M4623.f6866;
        c3071.mo4597(c3058M4623);
        View rootView = view.getRootView();
        c3071.mo4601(rootView);
        c3071.mo4610(rootView);
        c3071.mo4608();
        return c3058M4623;
    }
}
