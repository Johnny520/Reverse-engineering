package io.modelcontextprotocol.kotlin.sdk.server;

import p052.InterfaceC6542;
import p056.InterfaceC6815;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4289 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6815 f12841;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12842;

    public /* synthetic */ C4289(int i, InterfaceC6815 interfaceC6815) {
        this.f12842 = i;
        this.f12841 = interfaceC6815;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f12842;
        InterfaceC6815 interfaceC6815 = this.f12841;
        switch (i) {
            case 0:
                return "Asserting request handler capability for method: " + interfaceC6815.getValue();
            default:
                return "Asserting capability for method: " + interfaceC6815.getValue();
        }
    }
}
