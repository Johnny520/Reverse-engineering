package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC2194 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2205 f6468;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ View f6469;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C2225 f6470 = null;

    public ViewOnApplyWindowInsetsListenerC2194(View view, InterfaceC2205 interfaceC2205) {
        this.f6469 = view;
        this.f6468 = interfaceC2205;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C2225 c2225M4063 = C2225.m4063(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC2205 interfaceC2205 = this.f6468;
        if (i < 30) {
            AbstractC2193.m4006(windowInsets, this.f6469);
            if (c2225M4063.equals(this.f6470)) {
                return interfaceC2205.mo303(view, c2225M4063).m4069();
            }
        }
        this.f6470 = c2225M4063;
        C2225 c2225Mo303 = interfaceC2205.mo303(view, c2225M4063);
        if (i >= 30) {
            return c2225Mo303.m4069();
        }
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        view.requestApplyInsets();
        return c2225Mo303.m4069();
    }
}
