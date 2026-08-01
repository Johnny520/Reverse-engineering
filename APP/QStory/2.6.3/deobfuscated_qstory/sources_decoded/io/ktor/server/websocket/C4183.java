package io.ktor.server.websocket;

import androidx.compose.foundation.C1067;
import androidx.compose.ui.graphics.vector.C1562;
import com.alibaba.fastjson2.C2929;
import io.ktor.server.application.AbstractC4060;
import io.ktor.server.application.C4058;
import io.ktor.server.application.InterfaceC4053;
import io.ktor.server.response.C4135;
import io.ktor.util.C4209;
import io.ktor.util.pipeline.AbstractC4195;
import io.ktor.util.pipeline.InvalidPhaseException;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: io.ktor.server.websocket.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4183 implements InterfaceC4053 {
    @Override // io.ktor.server.application.InterfaceC4063
    public final C4209 getKey() {
        return C4182.f12647;
    }

    @Override // io.ktor.server.application.InterfaceC4063
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo8467(AbstractC4195 abstractC4195, InterfaceC6558 interfaceC6558) throws InvalidPhaseException {
        C4058 c4058 = (C4058) abstractC4195;
        c4058.getClass();
        C2929 c2929 = new C2929();
        interfaceC6558.invoke(c2929);
        C4182 c4182 = new C4182(c2929.f9278, c2929.f9277, (C1562) c2929.f9276);
        c4058.f12346.m13534(AbstractC4060.f12355, new C1067(c4182, 18));
        c4058.f12339.m8579(C4135.f12533, new WebSockets$Plugin$install$1$2(null));
        return c4182;
    }
}
