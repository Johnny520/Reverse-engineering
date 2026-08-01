package io.ktor.server.routing;

import androidx.appcompat.app.C0076;
import io.ktor.server.application.InterfaceC4057;
import io.ktor.server.response.InterfaceC4134;
import io.ktor.server.response.InterfaceC4136;
import p236.C8097;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4147 implements InterfaceC4136 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4134 f12569;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0076 f12570;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4163 f12571;

    public C4147(C4163 c4163, InterfaceC4134 interfaceC4134) {
        interfaceC4134.getClass();
        this.f12571 = c4163;
        this.f12569 = interfaceC4134;
        this.f12570 = interfaceC4134.mo383();
        interfaceC4134.mo404getCookies();
    }

    @Override // io.ktor.server.response.InterfaceC4136
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4057 mo381() {
        return this.f12571;
    }

    @Override // io.ktor.server.response.InterfaceC4136
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C0076 mo383() {
        return this.f12570;
    }

    @Override // io.ktor.server.response.InterfaceC4136
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final boolean mo392() {
        return this.f12569.mo392();
    }

    @Override // io.ktor.server.response.InterfaceC4136
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo398(C8097 c8097) {
        c8097.getClass();
        this.f12569.mo398(c8097);
    }

    @Override // io.ktor.server.response.InterfaceC4136
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final C8097 mo399() {
        return this.f12569.mo399();
    }
}
