package io.ktor.server.websocket;

import androidx.compose.foundation.C1905;
import androidx.compose.p001ui.graphics.vector.C2397;
import com.alibaba.fastjson2.C3762;
import io.ktor.server.application.AbstractC4892;
import io.ktor.server.application.C4890;
import io.ktor.server.application.InterfaceC4885;
import io.ktor.server.response.C4967;
import io.ktor.util.C5041;
import io.ktor.util.pipeline.AbstractC5027;
import io.ktor.util.pipeline.InvalidPhaseException;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: io.ktor.server.websocket.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5015 implements InterfaceC4885 {
    @Override // io.ktor.server.application.InterfaceC4895
    public final C5041 getKey() {
        return C5014.f12992;
    }

    @Override // io.ktor.server.application.InterfaceC4895
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo9026(AbstractC5027 abstractC5027, InterfaceC7387 interfaceC7387) throws InvalidPhaseException {
        C4890 c4890 = (C4890) abstractC5027;
        c4890.getClass();
        C3762 c3762 = new C3762();
        interfaceC7387.invoke(c3762);
        C5014 c5014 = new C5014(c3762.f9623, c3762.f9622, (C2397) c3762.f9621);
        c4890.f12691.m14093(AbstractC4892.f12700, new C1905(c5014, 18));
        c4890.f12684.m9138(C4967.f12878, new WebSockets$Plugin$install$1$2(null));
        return c5014;
    }
}
