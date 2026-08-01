package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC3027 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3038 f6813;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ View f6814;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C3058 f6815 = null;

    public ViewOnApplyWindowInsetsListenerC3027(View view, InterfaceC3038 interfaceC3038) {
        this.f6814 = view;
        this.f6813 = interfaceC3038;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C3058 c3058M4623 = C3058.m4623(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC3038 interfaceC3038 = this.f6813;
        if (i < 30) {
            AbstractC3026.m4566(windowInsets, this.f6814);
            if (c3058M4623.equals(this.f6815)) {
                return interfaceC3038.mo863(view, c3058M4623).m4629();
            }
        }
        this.f6815 = c3058M4623;
        C3058 c3058Mo863 = interfaceC3038.mo863(view, c3058M4623);
        if (i >= 30) {
            return c3058Mo863.m4629();
        }
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        view.requestApplyInsets();
        return c3058Mo863.m4629();
    }
}
