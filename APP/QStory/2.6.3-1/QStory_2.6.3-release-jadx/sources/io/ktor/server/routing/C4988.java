package io.ktor.server.routing;

import androidx.appcompat.app.C0955;
import androidx.compose.foundation.C1868;
import io.ktor.server.application.AbstractC4892;
import io.ktor.server.application.C4890;
import io.ktor.server.application.InterfaceC4897;
import io.ktor.server.request.C4962;
import io.ktor.server.request.InterfaceC4959;
import io.ktor.server.request.InterfaceC4961;
import io.ktor.server.response.C4967;
import io.ktor.server.response.InterfaceC4966;
import io.ktor.server.response.InterfaceC4968;
import io.ktor.util.C5036;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.InterfaceC6233;
import p075.C7686;
import p252.InterfaceC8924;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4988 implements InterfaceC4897, InterfaceC6233 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C0955 f12929;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC8924 f12930;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C0955 f12931;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC6016 f12932;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4986 f12933;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC5192 f12934;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4897 f12935;

    public C4988(InterfaceC4897 interfaceC4897, C4986 c4986, InterfaceC5192 interfaceC5192, C4962 c4962, C4967 c4967, InterfaceC8924 interfaceC8924) {
        interfaceC4897.getClass();
        c4986.getClass();
        interfaceC5192.getClass();
        c4962.getClass();
        c4967.getClass();
        interfaceC8924.getClass();
        this.f12935 = interfaceC4897;
        this.f12933 = c4986;
        this.f12934 = interfaceC5192;
        this.f12930 = interfaceC8924;
        this.f12929 = new C0955(this, c4962, interfaceC4897.mo9018());
        this.f12931 = new C0955(this, c4967, interfaceC4897.mo9020());
        this.f12932 = AbstractC6019.m10774(LazyThreadSafetyMode.NONE, new C1868(this, 14));
    }

    @Override // io.ktor.server.application.InterfaceC4889
    public final C5036 getAttributes() {
        return this.f12935.getAttributes();
    }

    @Override // io.ktor.server.application.InterfaceC4889
    public final InterfaceC8924 getParameters() {
        return (InterfaceC8924) this.f12932.getValue();
    }

    public final String toString() {
        return "RoutingApplicationCall(route=" + this.f12933 + ')';
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f12934;
    }

    @Override // io.ktor.server.application.InterfaceC4889
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4961 mo9018() {
        return this.f12929;
    }

    @Override // io.ktor.server.application.InterfaceC4889
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final C4890 mo9019() {
        return this.f12935.mo9019();
    }

    @Override // io.ktor.server.application.InterfaceC4889
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC4968 mo9020() {
        return this.f12931;
    }

    @Override // io.ktor.server.application.InterfaceC4889
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo9021(Object obj, C7686 c7686, InterfaceC5189 interfaceC5189) {
        return AbstractC4892.m9023(this, obj, c7686, interfaceC5189);
    }

    @Override // io.ktor.server.application.InterfaceC4897, io.ktor.server.application.InterfaceC4889
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4959 mo9018() {
        return this.f12929;
    }

    @Override // io.ktor.server.application.InterfaceC4897, io.ktor.server.application.InterfaceC4889
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC4966 mo9020() {
        return this.f12931;
    }
}
