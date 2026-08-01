package io.ktor.server.cio;

import io.ktor.http.cio.C3965;
import io.ktor.server.application.AbstractC4059;
import io.ktor.server.application.C4057;
import io.ktor.server.application.InterfaceC4064;
import io.ktor.server.engine.AbstractC4107;
import io.ktor.server.request.InterfaceC4126;
import io.ktor.server.request.InterfaceC4128;
import io.ktor.server.response.InterfaceC4133;
import io.ktor.server.response.InterfaceC4135;
import io.ktor.util.AbstractC4216;
import io.ktor.util.C4203;
import io.ktor.utils.io.InterfaceC4246;
import io.ktor.utils.io.InterfaceC4251;
import java.net.InetSocketAddress;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5440;
import p059.C6856;
import p236.InterfaceC8094;

/* JADX INFO: renamed from: io.ktor.server.cio.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4082 implements InterfaceC5400, InterfaceC4064 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4084 f12396;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C4078 f12397;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4203 f12398;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC4359 f12399;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4057 f12400;

    public C4082(C4057 c4057, C3965 c3965, InterfaceC4251 interfaceC4251, InterfaceC4246 interfaceC4246, InterfaceC4359 interfaceC4359, InterfaceC4359 interfaceC43592, InterfaceC5440 interfaceC5440, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, InterfaceC4359 interfaceC43593) {
        c4057.getClass();
        c3965.getClass();
        interfaceC4251.getClass();
        interfaceC4246.getClass();
        interfaceC4359.getClass();
        interfaceC43592.getClass();
        interfaceC43593.getClass();
        this.f12400 = c4057;
        C4203 c4203M8637 = AbstractC4216.m8637(false);
        this.f12398 = c4203M8637;
        this.f12399 = interfaceC43593;
        this.f12397 = new C4078(this, inetSocketAddress, inetSocketAddress2, interfaceC4251, c3965);
        C4084 c4084 = new C4084(this, interfaceC4246, interfaceC4251, interfaceC4359, interfaceC43592, interfaceC5440);
        this.f12396 = c4084;
        c4203M8637.m8596(AbstractC4107.f12474, c4084);
    }

    @Override // io.ktor.server.application.InterfaceC4056
    public final C4203 getAttributes() {
        return this.f12398;
    }

    @Override // io.ktor.server.application.InterfaceC4056
    public final InterfaceC8094 getParameters() {
        return this.f12397.mo399();
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4359 mo2420() {
        return this.f12399;
    }

    @Override // io.ktor.server.application.InterfaceC4056
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4128 mo8469() {
        return this.f12397;
    }

    @Override // io.ktor.server.application.InterfaceC4056
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final C4057 mo8470() {
        return this.f12400;
    }

    @Override // io.ktor.server.application.InterfaceC4056
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC4135 mo8471() {
        return this.f12396;
    }

    @Override // io.ktor.server.application.InterfaceC4056
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final Object mo8472(Object obj, C6856 c6856, InterfaceC4356 interfaceC4356) {
        return AbstractC4059.m8474(this, obj, c6856, interfaceC4356);
    }

    @Override // io.ktor.server.application.InterfaceC4064, io.ktor.server.application.InterfaceC4056
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC4126 mo8469() {
        return this.f12397;
    }

    @Override // io.ktor.server.application.InterfaceC4064, io.ktor.server.application.InterfaceC4056
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final InterfaceC4133 mo8471() {
        return this.f12396;
    }
}
