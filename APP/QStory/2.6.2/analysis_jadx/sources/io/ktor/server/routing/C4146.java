package io.ktor.server.routing;

import androidx.appcompat.app.C0076;
import io.ktor.server.application.InterfaceC4056;
import io.ktor.server.response.InterfaceC4133;
import io.ktor.server.response.InterfaceC4135;
import p236.C8096;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4146 implements InterfaceC4135 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4133 f12565;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0076 f12566;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4162 f12567;

    public C4146(C4162 c4162, InterfaceC4133 interfaceC4133) {
        interfaceC4133.getClass();
        this.f12567 = c4162;
        this.f12565 = interfaceC4133;
        this.f12566 = interfaceC4133.mo382();
        interfaceC4133.mo403getCookies();
    }

    @Override // io.ktor.server.response.InterfaceC4135
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4056 mo380() {
        return this.f12567;
    }

    @Override // io.ktor.server.response.InterfaceC4135
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C0076 mo382() {
        return this.f12566;
    }

    @Override // io.ktor.server.response.InterfaceC4135
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo396(C8096 c8096) {
        c8096.getClass();
        this.f12565.mo396(c8096);
    }

    @Override // io.ktor.server.response.InterfaceC4135
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final boolean mo397() {
        return this.f12565.mo397();
    }

    @Override // io.ktor.server.response.InterfaceC4135
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final C8096 mo398() {
        return this.f12565.mo398();
    }
}
