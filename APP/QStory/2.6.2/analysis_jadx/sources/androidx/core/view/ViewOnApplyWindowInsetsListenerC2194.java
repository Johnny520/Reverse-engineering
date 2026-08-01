package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC2194 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2205 f6467;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ View f6468;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C2225 f6469 = null;

    public ViewOnApplyWindowInsetsListenerC2194(View view, InterfaceC2205 interfaceC2205) {
        this.f6468 = view;
        this.f6467 = interfaceC2205;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C2225 c2225M4053 = C2225.m4053(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC2205 interfaceC2205 = this.f6467;
        if (i < 30) {
            AbstractC2193.m3996(windowInsets, this.f6468);
            if (c2225M4053.equals(this.f6469)) {
                return interfaceC2205.mo302(view, c2225M4053).m4059();
            }
        }
        this.f6469 = c2225M4053;
        C2225 c2225Mo302 = interfaceC2205.mo302(view, c2225M4053);
        if (i >= 30) {
            return c2225Mo302.m4059();
        }
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        view.requestApplyInsets();
        return c2225Mo302.m4059();
    }
}
