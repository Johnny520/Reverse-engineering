package io.ktor.server.cio.backend;

import io.ktor.utils.io.InterfaceC4246;
import io.ktor.utils.io.InterfaceC4251;
import java.net.InetSocketAddress;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5440;

/* JADX INFO: renamed from: io.ktor.server.cio.backend.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4072 implements InterfaceC5400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InetSocketAddress f12364;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InetSocketAddress f12365;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC5440 f12366;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4251 f12367;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC4246 f12368;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4359 f12369;

    public C4072(InterfaceC4359 interfaceC4359, InterfaceC4251 interfaceC4251, InterfaceC4246 interfaceC4246, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, InterfaceC5440 interfaceC5440) {
        interfaceC4359.getClass();
        interfaceC4251.getClass();
        interfaceC4246.getClass();
        this.f12369 = interfaceC4359;
        this.f12367 = interfaceC4251;
        this.f12368 = interfaceC4246;
        this.f12365 = inetSocketAddress;
        this.f12364 = inetSocketAddress2;
        this.f12366 = interfaceC5440;
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4359 mo2420() {
        return this.f12369;
    }
}
