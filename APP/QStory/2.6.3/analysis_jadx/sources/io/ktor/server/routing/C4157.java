package io.ktor.server.routing;

import io.ktor.server.application.InterfaceC4057;
import io.ktor.server.request.InterfaceC4127;
import io.ktor.server.request.InterfaceC4129;
import p236.InterfaceC8095;
import p236.InterfaceC8102;
import p236.InterfaceC8112;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4157 implements InterfaceC4129 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC8102 f12591;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC8112 f12592;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC8095 f12593;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC8095 f12594;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4163 f12595;

    public C4157(InterfaceC8095 interfaceC8095, InterfaceC4127 interfaceC4127, C4163 c4163) {
        interfaceC8095.getClass();
        interfaceC4127.getClass();
        this.f12595 = c4163;
        this.f12593 = interfaceC4127.mo400();
        this.f12594 = interfaceC4127.mo377();
        this.f12592 = interfaceC4127.mo384();
        this.f12591 = interfaceC4127.mo378();
        interfaceC4127.getCookies();
    }

    @Override // io.ktor.server.request.InterfaceC4129
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC8095 mo377() {
        return this.f12594;
    }

    @Override // io.ktor.server.request.InterfaceC4129
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC8102 mo378() {
        return this.f12591;
    }

    @Override // io.ktor.server.request.InterfaceC4129, io.ktor.server.response.InterfaceC4136
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4057 mo381() {
        return this.f12595;
    }

    @Override // io.ktor.server.request.InterfaceC4129
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC8112 mo384() {
        return this.f12592;
    }

    @Override // io.ktor.server.request.InterfaceC4129
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final InterfaceC8095 mo400() {
        throw null;
    }
}
