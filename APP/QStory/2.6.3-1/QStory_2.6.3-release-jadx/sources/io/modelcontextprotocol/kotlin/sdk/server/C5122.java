package io.modelcontextprotocol.kotlin.sdk.server;

import p068.InterfaceC7372;
import p072.InterfaceC7645;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.server.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5122 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7645 f13190;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13191;

    public /* synthetic */ C5122(int i, InterfaceC7645 interfaceC7645) {
        this.f13191 = i;
        this.f13190 = interfaceC7645;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f13191;
        InterfaceC7645 interfaceC7645 = this.f13190;
        switch (i) {
            case 0:
                return "Asserting request handler capability for method: " + interfaceC7645.getValue();
            default:
                return "Asserting capability for method: " + interfaceC7645.getValue();
        }
    }
}
