package io.ktor.server.routing;

import io.ktor.server.application.C4055;
import io.ktor.server.application.C4057;
import io.ktor.server.application.InterfaceC4052;
import io.ktor.util.C4208;
import io.ktor.util.pipeline.AbstractC4194;
import io.ktor.util.pipeline.InvalidPhaseException;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4145 implements InterfaceC4052 {
    @Override // io.ktor.server.application.InterfaceC4062
    public final C4208 getKey() {
        return C4144.f12561;
    }

    @Override // io.ktor.server.application.InterfaceC4062
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo8477(AbstractC4194 abstractC4194, InterfaceC6557 interfaceC6557) throws InvalidPhaseException {
        C4057 c4057 = (C4057) abstractC4194;
        c4057.getClass();
        C4144 c4144 = new C4144(c4057);
        interfaceC6557.invoke(c4144);
        c4057.m8589(C4055.f12330, new RoutingRoot$Plugin$install$1(c4144, null));
        return c4144;
    }
}
