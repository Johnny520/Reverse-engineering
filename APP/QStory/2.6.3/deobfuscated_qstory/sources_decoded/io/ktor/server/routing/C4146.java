package io.ktor.server.routing;

import io.ktor.server.application.C4056;
import io.ktor.server.application.C4058;
import io.ktor.server.application.InterfaceC4053;
import io.ktor.util.C4209;
import io.ktor.util.pipeline.AbstractC4195;
import io.ktor.util.pipeline.InvalidPhaseException;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4146 implements InterfaceC4053 {
    @Override // io.ktor.server.application.InterfaceC4063
    public final C4209 getKey() {
        return C4145.f12565;
    }

    @Override // io.ktor.server.application.InterfaceC4063
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo8467(AbstractC4195 abstractC4195, InterfaceC6558 interfaceC6558) throws InvalidPhaseException {
        C4058 c4058 = (C4058) abstractC4195;
        c4058.getClass();
        C4145 c4145 = new C4145(c4058);
        interfaceC6558.invoke(c4145);
        c4058.m8579(C4056.f12334, new RoutingRoot$Plugin$install$1(c4145, null));
        return c4145;
    }
}
