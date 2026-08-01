package io.ktor.server.cio;

import io.ktor.http.cio.C4798;
import io.ktor.server.application.AbstractC4892;
import io.ktor.server.application.C4890;
import io.ktor.server.application.InterfaceC4897;
import io.ktor.server.engine.AbstractC4940;
import io.ktor.server.request.InterfaceC4959;
import io.ktor.server.request.InterfaceC4961;
import io.ktor.server.response.InterfaceC4966;
import io.ktor.server.response.InterfaceC4968;
import io.ktor.util.AbstractC5049;
import io.ktor.util.C5036;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import java.net.InetSocketAddress;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6273;
import p075.C7686;
import p252.InterfaceC8924;

/* JADX INFO: renamed from: io.ktor.server.cio.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4915 implements InterfaceC6233, InterfaceC4897 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4917 f12745;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4911 f12746;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5036 f12747;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5192 f12748;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4890 f12749;

    public C4915(C4890 c4890, C4798 c4798, InterfaceC5084 interfaceC5084, InterfaceC5079 interfaceC5079, InterfaceC5192 interfaceC5192, InterfaceC5192 interfaceC51922, InterfaceC6273 interfaceC6273, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, InterfaceC5192 interfaceC51923) {
        c4890.getClass();
        c4798.getClass();
        interfaceC5084.getClass();
        interfaceC5079.getClass();
        interfaceC5192.getClass();
        interfaceC51922.getClass();
        interfaceC51923.getClass();
        this.f12749 = c4890;
        C5036 c5036M9186 = AbstractC5049.m9186(false);
        this.f12747 = c5036M9186;
        this.f12748 = interfaceC51923;
        this.f12746 = new C4911(this, inetSocketAddress, inetSocketAddress2, interfaceC5084, c4798);
        C4917 c4917 = new C4917(this, interfaceC5079, interfaceC5084, interfaceC5192, interfaceC51922, interfaceC6273);
        this.f12745 = c4917;
        c5036M9186.m9145(AbstractC4940.f12823, c4917);
    }

    @Override // io.ktor.server.application.InterfaceC4889
    public final C5036 getAttributes() {
        return this.f12747;
    }

    @Override // io.ktor.server.application.InterfaceC4889
    public final InterfaceC8924 getParameters() {
        return this.f12746.mo960();
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f12748;
    }

    @Override // io.ktor.server.application.InterfaceC4889
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4961 mo9018() {
        return this.f12746;
    }

    @Override // io.ktor.server.application.InterfaceC4889
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final C4890 mo9019() {
        return this.f12749;
    }

    @Override // io.ktor.server.application.InterfaceC4889
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC4968 mo9020() {
        return this.f12745;
    }

    @Override // io.ktor.server.application.InterfaceC4889
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo9021(Object obj, C7686 c7686, InterfaceC5189 interfaceC5189) {
        return AbstractC4892.m9023(this, obj, c7686, interfaceC5189);
    }

    @Override // io.ktor.server.application.InterfaceC4897, io.ktor.server.application.InterfaceC4889
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4959 mo9018() {
        return this.f12746;
    }

    @Override // io.ktor.server.application.InterfaceC4897, io.ktor.server.application.InterfaceC4889
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC4966 mo9020() {
        return this.f12745;
    }
}
