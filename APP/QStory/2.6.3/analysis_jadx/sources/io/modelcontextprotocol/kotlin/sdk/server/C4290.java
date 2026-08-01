package io.modelcontextprotocol.kotlin.sdk.server;

import p052.InterfaceC6543;
import p056.InterfaceC6816;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4290 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6816 f12845;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12846;

    public /* synthetic */ C4290(int i, InterfaceC6816 interfaceC6816) {
        this.f12846 = i;
        this.f12845 = interfaceC6816;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f12846;
        InterfaceC6816 interfaceC6816 = this.f12845;
        switch (i) {
            case 0:
                return "Asserting request handler capability for method: " + interfaceC6816.getValue();
            default:
                return "Asserting capability for method: " + interfaceC6816.getValue();
        }
    }
}
