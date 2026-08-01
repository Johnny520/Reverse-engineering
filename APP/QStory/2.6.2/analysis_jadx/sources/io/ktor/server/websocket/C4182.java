package io.ktor.server.websocket;

import androidx.compose.foundation.C1067;
import androidx.compose.ui.graphics.vector.C1562;
import com.alibaba.fastjson2.C2928;
import io.ktor.server.application.AbstractC4059;
import io.ktor.server.application.C4057;
import io.ktor.server.application.InterfaceC4052;
import io.ktor.server.response.C4134;
import io.ktor.util.C4208;
import io.ktor.util.pipeline.AbstractC4194;
import io.ktor.util.pipeline.InvalidPhaseException;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: io.ktor.server.websocket.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4182 implements InterfaceC4052 {
    @Override // io.ktor.server.application.InterfaceC4062
    public final C4208 getKey() {
        return C4181.f12643;
    }

    @Override // io.ktor.server.application.InterfaceC4062
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo8477(AbstractC4194 abstractC4194, InterfaceC6557 interfaceC6557) throws InvalidPhaseException {
        C4057 c4057 = (C4057) abstractC4194;
        c4057.getClass();
        C2928 c2928 = new C2928();
        interfaceC6557.invoke(c2928);
        C4181 c4181 = new C4181(c2928.f9276, c2928.f9275, (C1562) c2928.f9274);
        c4057.f12342.m13504(AbstractC4059.f12351, new C1067(c4181, 18));
        c4057.f12335.m8589(C4134.f12529, new WebSockets$Plugin$install$1$2(null));
        return c4181;
    }
}
