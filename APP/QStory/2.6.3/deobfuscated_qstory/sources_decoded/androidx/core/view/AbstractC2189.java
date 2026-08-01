package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2189 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2225 m3993(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C2225 c2225M4063 = C2225.m4063(null, rootWindowInsets);
        C2238 c2238 = c2225M4063.f6521;
        c2238.mo4037(c2225M4063);
        View rootView = view.getRootView();
        c2238.mo4041(rootView);
        c2238.mo4050(rootView);
        c2238.mo4048();
        return c2225M4063;
    }
}
