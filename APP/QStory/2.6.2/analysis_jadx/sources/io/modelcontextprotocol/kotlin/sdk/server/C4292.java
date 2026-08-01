package io.modelcontextprotocol.kotlin.sdk.server;

import androidx.activity.AbstractC0053;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4292 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f12846;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12847;

    public /* synthetic */ C4292(String str, int i) {
        this.f12847 = i;
        this.f12846 = str;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f12847;
        String str = this.f12846;
        switch (i) {
            case 0:
                return "Received message for sessionId: ".concat(str);
            case 1:
                return AbstractC0053.m152("Message handled for sessionId: ", str);
            default:
                return AbstractC0053.m156("Client requested unsupported protocol version ", str, ", falling back to 2024-11-05");
        }
    }
}
