package io.modelcontextprotocol.kotlin.sdk.server;

import androidx.activity.AbstractC0053;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4293 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f12850;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12851;

    public /* synthetic */ C4293(String str, int i) {
        this.f12851 = i;
        this.f12850 = str;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f12851;
        String str = this.f12850;
        switch (i) {
            case 0:
                return "Received message for sessionId: ".concat(str);
            case 1:
                return AbstractC0053.m157("Message handled for sessionId: ", str);
            default:
                return AbstractC0053.m158("Client requested unsupported protocol version ", str, ", falling back to 2024-11-05");
        }
    }
}
