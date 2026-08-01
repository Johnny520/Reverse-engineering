package io.ktor.server.routing;

import io.ktor.server.application.InterfaceC4056;
import io.ktor.server.request.InterfaceC4126;
import io.ktor.server.request.InterfaceC4128;
import p236.InterfaceC8094;
import p236.InterfaceC8101;
import p236.InterfaceC8111;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4156 implements InterfaceC4128 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC8101 f12587;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC8111 f12588;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC8094 f12589;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC8094 f12590;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4162 f12591;

    public C4156(InterfaceC8094 interfaceC8094, InterfaceC4126 interfaceC4126, C4162 c4162) {
        interfaceC8094.getClass();
        interfaceC4126.getClass();
        this.f12591 = c4162;
        this.f12589 = interfaceC4126.mo399();
        this.f12590 = interfaceC4126.mo376();
        this.f12588 = interfaceC4126.mo383();
        this.f12587 = interfaceC4126.mo377();
        interfaceC4126.getCookies();
    }

    @Override // io.ktor.server.request.InterfaceC4128
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final InterfaceC8094 mo376() {
        return this.f12590;
    }

    @Override // io.ktor.server.request.InterfaceC4128
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final InterfaceC8101 mo377() {
        return this.f12587;
    }

    @Override // io.ktor.server.request.InterfaceC4128, io.ktor.server.response.InterfaceC4135
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4056 mo380() {
        return this.f12591;
    }

    @Override // io.ktor.server.request.InterfaceC4128
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC8111 mo383() {
        return this.f12588;
    }

    @Override // io.ktor.server.request.InterfaceC4128
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final InterfaceC8094 mo399() {
        throw null;
    }
}
