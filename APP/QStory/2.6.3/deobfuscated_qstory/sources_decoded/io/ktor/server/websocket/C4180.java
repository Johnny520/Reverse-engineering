package io.ktor.server.websocket;

import io.ktor.server.application.InterfaceC4057;
import io.ktor.websocket.C4278;
import io.ktor.websocket.InterfaceC4262;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.InterfaceC5199;
import kotlinx.coroutines.channels.InterfaceC5200;

/* JADX INFO: renamed from: io.ktor.server.websocket.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4180 implements InterfaceC4181, InterfaceC4262 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC4262 f12644;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4057 f12645;

    public C4180(InterfaceC4057 interfaceC4057, InterfaceC4262 interfaceC4262) {
        interfaceC4057.getClass();
        interfaceC4262.getClass();
        this.f12645 = interfaceC4057;
        this.f12644 = interfaceC4262;
    }

    @Override // kotlinx.coroutines.InterfaceC5401
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC4360 mo2430() {
        return this.f12644.mo2430();
    }

    @Override // io.ktor.websocket.InterfaceC4258
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final InterfaceC5200 mo8545() {
        return this.f12644.mo8545();
    }

    @Override // io.ktor.server.websocket.InterfaceC4177
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4057 mo8542() {
        return this.f12645;
    }

    @Override // io.ktor.websocket.InterfaceC4258
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final Object mo8546(C4278 c4278, InterfaceC4357 interfaceC4357) {
        return this.f12644.mo8546(c4278, interfaceC4357);
    }

    @Override // io.ktor.websocket.InterfaceC4258
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final InterfaceC5199 mo8547() {
        return this.f12644.mo8547();
    }

    @Override // io.ktor.websocket.InterfaceC4258
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final Object mo8548(ContinuationImpl continuationImpl) {
        return this.f12644.mo8548(continuationImpl);
    }

    @Override // io.ktor.websocket.InterfaceC4258
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final long mo8549() {
        return this.f12644.mo8549();
    }
}
