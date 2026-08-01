package io.ktor.server.cio;

import io.ktor.http.cio.C3966;
import io.ktor.server.application.AbstractC4060;
import io.ktor.server.application.C4058;
import io.ktor.server.application.InterfaceC4065;
import io.ktor.server.engine.AbstractC4108;
import io.ktor.server.request.InterfaceC4127;
import io.ktor.server.request.InterfaceC4129;
import io.ktor.server.response.InterfaceC4134;
import io.ktor.server.response.InterfaceC4136;
import io.ktor.util.AbstractC4217;
import io.ktor.util.C4204;
import io.ktor.utils.io.InterfaceC4247;
import io.ktor.utils.io.InterfaceC4252;
import java.net.InetSocketAddress;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5441;
import p059.C6857;
import p236.InterfaceC8095;

/* JADX INFO: renamed from: io.ktor.server.cio.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4083 implements InterfaceC5401, InterfaceC4065 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4085 f12400;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4079 f12401;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4204 f12402;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC4360 f12403;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4058 f12404;

    public C4083(C4058 c4058, C3966 c3966, InterfaceC4252 interfaceC4252, InterfaceC4247 interfaceC4247, InterfaceC4360 interfaceC4360, InterfaceC4360 interfaceC43602, InterfaceC5441 interfaceC5441, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, InterfaceC4360 interfaceC43603) {
        c4058.getClass();
        c3966.getClass();
        interfaceC4252.getClass();
        interfaceC4247.getClass();
        interfaceC4360.getClass();
        interfaceC43602.getClass();
        interfaceC43603.getClass();
        this.f12404 = c4058;
        C4204 c4204M8627 = AbstractC4217.m8627(false);
        this.f12402 = c4204M8627;
        this.f12403 = interfaceC43603;
        this.f12401 = new C4079(this, inetSocketAddress, inetSocketAddress2, interfaceC4252, c3966);
        C4085 c4085 = new C4085(this, interfaceC4247, interfaceC4252, interfaceC4360, interfaceC43602, interfaceC5441);
        this.f12400 = c4085;
        c4204M8627.m8586(AbstractC4108.f12478, c4085);
    }

    @Override // io.ktor.server.application.InterfaceC4057
    public final C4204 getAttributes() {
        return this.f12402;
    }

    @Override // io.ktor.server.application.InterfaceC4057
    public final InterfaceC8095 getParameters() {
        return this.f12401.mo400();
    }

    @Override // kotlinx.coroutines.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC4360 mo2430() {
        return this.f12403;
    }

    @Override // io.ktor.server.application.InterfaceC4057
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4129 mo8459() {
        return this.f12401;
    }

    @Override // io.ktor.server.application.InterfaceC4057
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final C4058 mo8460() {
        return this.f12404;
    }

    @Override // io.ktor.server.application.InterfaceC4057
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC4136 mo8461() {
        return this.f12400;
    }

    @Override // io.ktor.server.application.InterfaceC4057
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo8462(Object obj, C6857 c6857, InterfaceC4357 interfaceC4357) {
        return AbstractC4060.m8464(this, obj, c6857, interfaceC4357);
    }

    @Override // io.ktor.server.application.InterfaceC4065, io.ktor.server.application.InterfaceC4057
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4127 mo8459() {
        return this.f12401;
    }

    @Override // io.ktor.server.application.InterfaceC4065, io.ktor.server.application.InterfaceC4057
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC4134 mo8461() {
        return this.f12400;
    }
}
