package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2189 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2225 m3983(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C2225 c2225M4053 = C2225.m4053(null, rootWindowInsets);
        C2238 c2238 = c2225M4053.f6520;
        c2238.mo4027(c2225M4053);
        View rootView = view.getRootView();
        c2238.mo4031(rootView);
        c2238.mo4040(rootView);
        c2238.mo4038();
        return c2225M4053;
    }
}
