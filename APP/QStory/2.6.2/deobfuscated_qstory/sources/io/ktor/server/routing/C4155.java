package io.ktor.server.routing;

import androidx.appcompat.app.C0108;
import androidx.compose.foundation.C1030;
import io.ktor.server.application.AbstractC4059;
import io.ktor.server.application.C4057;
import io.ktor.server.application.InterfaceC4064;
import io.ktor.server.request.C4129;
import io.ktor.server.request.InterfaceC4126;
import io.ktor.server.request.InterfaceC4128;
import io.ktor.server.response.C4134;
import io.ktor.server.response.InterfaceC4133;
import io.ktor.server.response.InterfaceC4135;
import io.ktor.util.C4203;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.InterfaceC5400;
import p059.C6856;
import p236.InterfaceC8094;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4155 implements InterfaceC4064, InterfaceC5400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C0108 f12580;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC8094 f12581;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C0108 f12582;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC5183 f12583;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4153 f12584;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC4359 f12585;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4064 f12586;

    public C4155(InterfaceC4064 interfaceC4064, C4153 c4153, InterfaceC4359 interfaceC4359, C4129 c4129, C4134 c4134, InterfaceC8094 interfaceC8094) {
        interfaceC4064.getClass();
        c4153.getClass();
        interfaceC4359.getClass();
        c4129.getClass();
        c4134.getClass();
        interfaceC8094.getClass();
        this.f12586 = interfaceC4064;
        this.f12584 = c4153;
        this.f12585 = interfaceC4359;
        this.f12581 = interfaceC8094;
        this.f12580 = new C0108(this, c4129, interfaceC4064.mo8469());
        this.f12582 = new C0108(this, c4134, interfaceC4064.mo8471());
        this.f12583 = AbstractC5186.m10211(LazyThreadSafetyMode.NONE, new C1030(this, 14));
    }

    @Override // io.ktor.server.application.InterfaceC4056
    public final C4203 getAttributes() {
        return this.f12586.getAttributes();
    }

    @Override // io.ktor.server.application.InterfaceC4056
    public final InterfaceC8094 getParameters() {
        return (InterfaceC8094) this.f12583.getValue();
    }

    public final String toString() {
        return "RoutingApplicationCall(route=" + this.f12584 + ')';
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4359 mo2420() {
        return this.f12585;
    }

    @Override // io.ktor.server.application.InterfaceC4056
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4128 mo8469() {
        return this.f12580;
    }

    @Override // io.ktor.server.application.InterfaceC4056
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final C4057 mo8470() {
        return this.f12586.mo8470();
    }

    @Override // io.ktor.server.application.InterfaceC4056
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC4135 mo8471() {
        return this.f12582;
    }

    @Override // io.ktor.server.application.InterfaceC4056
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo8472(Object obj, C6856 c6856, InterfaceC4356 interfaceC4356) {
        return AbstractC4059.m8474(this, obj, c6856, interfaceC4356);
    }

    @Override // io.ktor.server.application.InterfaceC4064, io.ktor.server.application.InterfaceC4056
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4126 mo8469() {
        return this.f12580;
    }

    @Override // io.ktor.server.application.InterfaceC4064, io.ktor.server.application.InterfaceC4056
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC4133 mo8471() {
        return this.f12582;
    }
}
