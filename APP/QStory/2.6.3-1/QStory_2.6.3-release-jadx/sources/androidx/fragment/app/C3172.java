package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;
import p267.AbstractC9004;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3172 extends AbstractC9004 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC3176 f7267;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ C3174 f7268;

    public C3172(DialogInterfaceOnCancelListenerC3176 dialogInterfaceOnCancelListenerC3176, C3174 c3174) {
        this.f7267 = dialogInterfaceOnCancelListenerC3176;
        this.f7268 = c3174;
    }

    @Override // p267.AbstractC9004
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final boolean mo4976() {
        return this.f7268.mo4976() || this.f7267.f7275;
    }

    @Override // p267.AbstractC9004
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final View mo4977(int i) {
        C3174 c3174 = this.f7268;
        if (c3174.mo4976()) {
            return c3174.mo4977(i);
        }
        Dialog dialog = this.f7267.f7273;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }
}
