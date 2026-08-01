package io.modelcontextprotocol.kotlin.sdk.server;

import androidx.activity.AbstractC0900;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5125 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f13195;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13196;

    public /* synthetic */ C5125(String str, int i) {
        this.f13196 = i;
        this.f13195 = str;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f13196;
        String str = this.f13195;
        switch (i) {
            case 0:
                return "Received message for sessionId: ".concat(str);
            case 1:
                return AbstractC0900.m717("Message handled for sessionId: ", str);
            default:
                return AbstractC0900.m718("Client requested unsupported protocol version ", str, ", falling back to 2024-11-05");
        }
    }
}
