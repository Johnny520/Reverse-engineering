package io.ktor.server.routing;

import io.ktor.server.application.C4888;
import io.ktor.server.application.C4890;
import io.ktor.server.application.InterfaceC4885;
import io.ktor.util.C5041;
import io.ktor.util.pipeline.AbstractC5027;
import io.ktor.util.pipeline.InvalidPhaseException;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4978 implements InterfaceC4885 {
    @Override // io.ktor.server.application.InterfaceC4895
    public final C5041 getKey() {
        return C4977.f12910;
    }

    @Override // io.ktor.server.application.InterfaceC4895
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo9026(AbstractC5027 abstractC5027, InterfaceC7387 interfaceC7387) throws InvalidPhaseException {
        C4890 c4890 = (C4890) abstractC5027;
        c4890.getClass();
        C4977 c4977 = new C4977(c4890);
        interfaceC7387.invoke(c4977);
        c4890.m9138(C4888.f12679, new RoutingRoot$Plugin$install$1(c4977, null));
        return c4977;
    }
}
