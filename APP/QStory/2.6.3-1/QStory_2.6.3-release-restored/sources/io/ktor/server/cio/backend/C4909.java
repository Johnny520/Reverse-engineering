package io.ktor.server.cio.backend;

import io.ktor.network.selector.C4835;
import io.ktor.network.sockets.InterfaceC4854;
import kotlin.C6008;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: io.ktor.server.cio.backend.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4909 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f12724;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12725;

    public /* synthetic */ C4909(Object obj, int i) {
        this.f12725 = i;
        this.f12724 = obj;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f12725;
        Object obj2 = this.f12724;
        switch (i) {
            case 0:
                return HttpServerKt$httpServer$acceptJob$1.invokeSuspend$lambda$2$lambda$1((InterfaceC4854) obj2, (Throwable) obj);
            default:
                ((C4835) obj2).close();
                return C6008.f15084;
        }
    }
}
