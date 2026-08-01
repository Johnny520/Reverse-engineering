package io.ktor.server.websocket;

import io.ktor.server.application.InterfaceC4889;
import io.ktor.websocket.C5110;
import io.ktor.websocket.InterfaceC5094;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.InterfaceC6031;
import kotlinx.coroutines.channels.InterfaceC6032;

/* JADX INFO: renamed from: io.ktor.server.websocket.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5012 implements InterfaceC5013, InterfaceC5094 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5094 f12989;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4889 f12990;

    public C5012(InterfaceC4889 interfaceC4889, InterfaceC5094 interfaceC5094) {
        interfaceC4889.getClass();
        interfaceC5094.getClass();
        this.f12990 = interfaceC4889;
        this.f12989 = interfaceC5094;
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f12989.mo2990();
    }

    @Override // io.ktor.websocket.InterfaceC5090
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final InterfaceC6032 mo9104() {
        return this.f12989.mo9104();
    }

    @Override // io.ktor.server.websocket.InterfaceC5009
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4889 mo9101() {
        return this.f12990;
    }

    @Override // io.ktor.websocket.InterfaceC5090
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final Object mo9105(C5110 c5110, InterfaceC5189 interfaceC5189) {
        return this.f12989.mo9105(c5110, interfaceC5189);
    }

    @Override // io.ktor.websocket.InterfaceC5090
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final InterfaceC6031 mo9106() {
        return this.f12989.mo9106();
    }

    @Override // io.ktor.websocket.InterfaceC5090
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final Object mo9107(ContinuationImpl continuationImpl) {
        return this.f12989.mo9107(continuationImpl);
    }

    @Override // io.ktor.websocket.InterfaceC5090
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final long mo9108() {
        return this.f12989.mo9108();
    }
}
