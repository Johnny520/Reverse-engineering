package io.ktor.server.websocket;

import io.ktor.server.application.InterfaceC4056;
import io.ktor.websocket.C4277;
import io.ktor.websocket.InterfaceC4261;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.InterfaceC5198;
import kotlinx.coroutines.channels.InterfaceC5199;

/* JADX INFO: renamed from: io.ktor.server.websocket.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4179 implements InterfaceC4180, InterfaceC4261 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4261 f12640;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4056 f12641;

    public C4179(InterfaceC4056 interfaceC4056, InterfaceC4261 interfaceC4261) {
        interfaceC4056.getClass();
        interfaceC4261.getClass();
        this.f12641 = interfaceC4056;
        this.f12640 = interfaceC4261;
    }

    @Override // kotlinx.coroutines.InterfaceC5400
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC4359 mo2420() {
        return this.f12640.mo2420();
    }

    @Override // io.ktor.websocket.InterfaceC4257
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final InterfaceC5199 mo8555() {
        return this.f12640.mo8555();
    }

    @Override // io.ktor.server.websocket.InterfaceC4176
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4056 mo8552() {
        return this.f12641;
    }

    @Override // io.ktor.websocket.InterfaceC4257
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final Object mo8556(C4277 c4277, InterfaceC4356 interfaceC4356) {
        return this.f12640.mo8556(c4277, interfaceC4356);
    }

    @Override // io.ktor.websocket.InterfaceC4257
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final InterfaceC5198 mo8557() {
        return this.f12640.mo8557();
    }

    @Override // io.ktor.websocket.InterfaceC4257
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final Object mo8558(ContinuationImpl continuationImpl) {
        return this.f12640.mo8558(continuationImpl);
    }

    @Override // io.ktor.websocket.InterfaceC4257
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final long mo8559() {
        return this.f12640.mo8559();
    }
}
