package io.ktor.server.cio.backend;

import io.ktor.network.selector.C4002;
import io.ktor.network.sockets.InterfaceC4021;
import kotlin.C5175;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: io.ktor.server.cio.backend.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4076 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f12375;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12376;

    public /* synthetic */ C4076(Object obj, int i) {
        this.f12376 = i;
        this.f12375 = obj;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f12376;
        Object obj2 = this.f12375;
        switch (i) {
            case 0:
                return HttpServerKt$httpServer$acceptJob$1.invokeSuspend$lambda$2$lambda$1((InterfaceC4021) obj2, (Throwable) obj);
            default:
                ((C4002) obj2).close();
                return C5175.f14739;
        }
    }
}
