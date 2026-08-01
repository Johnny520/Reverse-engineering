package io.ktor.server.cio.backend;

import io.ktor.network.selector.C4003;
import io.ktor.network.sockets.InterfaceC4022;
import kotlin.C5176;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: io.ktor.server.cio.backend.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4077 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f12379;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12380;

    public /* synthetic */ C4077(Object obj, int i) {
        this.f12380 = i;
        this.f12379 = obj;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f12380;
        Object obj2 = this.f12379;
        switch (i) {
            case 0:
                return HttpServerKt$httpServer$acceptJob$1.invokeSuspend$lambda$2$lambda$1((InterfaceC4022) obj2, (Throwable) obj);
            default:
                ((C4003) obj2).close();
                return C5176.f14739;
        }
    }
}
