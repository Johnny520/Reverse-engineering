package io.ktor.server.routing;

import androidx.appcompat.app.C0923;
import io.ktor.server.application.InterfaceC4889;
import io.ktor.server.response.InterfaceC4966;
import io.ktor.server.response.InterfaceC4968;
import p252.C8926;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4979 implements InterfaceC4968 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4966 f12914;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C0923 f12915;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4995 f12916;

    public C4979(C4995 c4995, InterfaceC4966 interfaceC4966) {
        interfaceC4966.getClass();
        this.f12916 = c4995;
        this.f12914 = interfaceC4966;
        this.f12915 = interfaceC4966.mo943();
        interfaceC4966.mo964getCookies();
    }

    @Override // io.ktor.server.response.InterfaceC4968
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4889 mo941() {
        return this.f12916;
    }

    @Override // io.ktor.server.response.InterfaceC4968
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C0923 mo943() {
        return this.f12915;
    }

    @Override // io.ktor.server.response.InterfaceC4968
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final boolean mo952() {
        return this.f12914.mo952();
    }

    @Override // io.ktor.server.response.InterfaceC4968
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo958(C8926 c8926) {
        c8926.getClass();
        this.f12914.mo958(c8926);
    }

    @Override // io.ktor.server.response.InterfaceC4968
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final C8926 mo959() {
        return this.f12914.mo959();
    }
}
