package androidx.window.layout;

import androidx.core.util.InterfaceC2188;
import kotlinx.coroutines.channels.InterfaceC5195;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2595 implements InterfaceC2188 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5195 f7775;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7776;

    public /* synthetic */ C2595(InterfaceC5195 interfaceC5195, int i) {
        this.f7776 = i;
        this.f7775 = interfaceC5195;
    }

    @Override // androidx.core.util.InterfaceC2188
    public final void accept(Object obj) {
        int i = this.f7776;
        InterfaceC5195 interfaceC5195 = this.f7775;
        C2597 c2597 = (C2597) obj;
        switch (i) {
            case 0:
                WindowInfoTrackerImpl$windowLayoutInfo$1.invokeSuspend$lambda$0(interfaceC5195, c2597);
                break;
            default:
                WindowInfoTrackerImpl$windowLayoutInfo$2.invokeSuspend$lambda$0(interfaceC5195, c2597);
                break;
        }
    }
}
