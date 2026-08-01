package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;
import p392.AbstractC9124;

/* JADX INFO: renamed from: androidx.fragment.app.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2339 extends AbstractC9124 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C2341 f6921;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC2343 f6922;

    public C2339(DialogInterfaceOnCancelListenerC2343 dialogInterfaceOnCancelListenerC2343, C2341 c2341) {
        this.f6922 = dialogInterfaceOnCancelListenerC2343;
        this.f6921 = c2341;
    }

    @Override // p392.AbstractC9124
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final boolean mo4406() {
        return this.f6921.mo4406() || this.f6922.f6929;
    }

    @Override // p392.AbstractC9124
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final View mo4407(int i) {
        C2341 c2341 = this.f6921;
        if (c2341.mo4406()) {
            return c2341.mo4407(i);
        }
        Dialog dialog = this.f6922.f6927;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }
}
