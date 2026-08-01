package io.ktor.server.routing;

import androidx.appcompat.app.C0108;
import androidx.compose.foundation.C1030;
import io.ktor.server.application.AbstractC4060;
import io.ktor.server.application.C4058;
import io.ktor.server.application.InterfaceC4065;
import io.ktor.server.request.C4130;
import io.ktor.server.request.InterfaceC4127;
import io.ktor.server.request.InterfaceC4129;
import io.ktor.server.response.C4135;
import io.ktor.server.response.InterfaceC4134;
import io.ktor.server.response.InterfaceC4136;
import io.ktor.util.C4204;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.InterfaceC5401;
import p059.C6857;
import p236.InterfaceC8095;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4156 implements InterfaceC4065, InterfaceC5401 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C0108 f12584;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC8095 f12585;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C0108 f12586;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC5184 f12587;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4154 f12588;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC4360 f12589;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4065 f12590;

    public C4156(InterfaceC4065 interfaceC4065, C4154 c4154, InterfaceC4360 interfaceC4360, C4130 c4130, C4135 c4135, InterfaceC8095 interfaceC8095) {
        interfaceC4065.getClass();
        c4154.getClass();
        interfaceC4360.getClass();
        c4130.getClass();
        c4135.getClass();
        interfaceC8095.getClass();
        this.f12590 = interfaceC4065;
        this.f12588 = c4154;
        this.f12589 = interfaceC4360;
        this.f12585 = interfaceC8095;
        this.f12584 = new C0108(this, c4130, interfaceC4065.mo8459());
        this.f12586 = new C0108(this, c4135, interfaceC4065.mo8461());
        this.f12587 = AbstractC5187.m10215(LazyThreadSafetyMode.NONE, new C1030(this, 14));
    }

    @Override // io.ktor.server.application.InterfaceC4057
    public final C4204 getAttributes() {
        return this.f12590.getAttributes();
    }

    @Override // io.ktor.server.application.InterfaceC4057
    public final InterfaceC8095 getParameters() {
        return (InterfaceC8095) this.f12587.getValue();
    }

    public final String toString() {
        return "RoutingApplicationCall(route=" + this.f12588 + ')';
    }

    @Override // kotlinx.coroutines.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC4360 mo2430() {
        return this.f12589;
    }

    @Override // io.ktor.server.application.InterfaceC4057
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4129 mo8459() {
        return this.f12584;
    }

    @Override // io.ktor.server.application.InterfaceC4057
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final C4058 mo8460() {
        return this.f12590.mo8460();
    }

    @Override // io.ktor.server.application.InterfaceC4057
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC4136 mo8461() {
        return this.f12586;
    }

    @Override // io.ktor.server.application.InterfaceC4057
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo8462(Object obj, C6857 c6857, InterfaceC4357 interfaceC4357) {
        return AbstractC4060.m8464(this, obj, c6857, interfaceC4357);
    }

    @Override // io.ktor.server.application.InterfaceC4065, io.ktor.server.application.InterfaceC4057
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4127 mo8459() {
        return this.f12584;
    }

    @Override // io.ktor.server.application.InterfaceC4065, io.ktor.server.application.InterfaceC4057
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC4134 mo8461() {
        return this.f12586;
    }
}
