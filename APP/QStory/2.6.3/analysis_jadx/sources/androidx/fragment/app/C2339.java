package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;
import p251.AbstractC8175;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2339 extends AbstractC8175 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC2343 f6922;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C2341 f6923;

    public C2339(DialogInterfaceOnCancelListenerC2343 dialogInterfaceOnCancelListenerC2343, C2341 c2341) {
        this.f6922 = dialogInterfaceOnCancelListenerC2343;
        this.f6923 = c2341;
    }

    @Override // p251.AbstractC8175
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final boolean mo4416() {
        return this.f6923.mo4416() || this.f6922.f6930;
    }

    @Override // p251.AbstractC8175
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final View mo4417(int i) {
        C2341 c2341 = this.f6923;
        if (c2341.mo4416()) {
            return c2341.mo4417(i);
        }
        Dialog dialog = this.f6922.f6928;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }
}
