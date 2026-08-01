package io.ktor.server.websocket;

import io.ktor.server.application.InterfaceC4889;
import io.ktor.websocket.C5110;
import io.ktor.websocket.InterfaceC5090;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.InterfaceC6031;
import kotlinx.coroutines.channels.InterfaceC6032;

/* JADX INFO: renamed from: io.ktor.server.websocket.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5011 implements InterfaceC5009, InterfaceC5090 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5090 f12987;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4889 f12988;

    public C5011(InterfaceC4889 interfaceC4889, InterfaceC5090 interfaceC5090) {
        interfaceC5090.getClass();
        this.f12988 = interfaceC4889;
        this.f12987 = interfaceC5090;
    }

    @Override // kotlinx.coroutines.InterfaceC6233
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final InterfaceC5192 mo2990() {
        return this.f12987.mo2990();
    }

    @Override // io.ktor.websocket.InterfaceC5090
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final InterfaceC6032 mo9104() {
        return this.f12987.mo9104();
    }

    @Override // io.ktor.server.websocket.InterfaceC5009
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4889 mo9101() {
        return this.f12988;
    }

    @Override // io.ktor.websocket.InterfaceC5090
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Object mo9105(C5110 c5110, InterfaceC5189 interfaceC5189) {
        return this.f12987.mo9105(c5110, interfaceC5189);
    }

    @Override // io.ktor.websocket.InterfaceC5090
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final InterfaceC6031 mo9106() {
        return this.f12987.mo9106();
    }

    @Override // io.ktor.websocket.InterfaceC5090
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final Object mo9107(ContinuationImpl continuationImpl) {
        return this.f12987.mo9107(continuationImpl);
    }

    @Override // io.ktor.websocket.InterfaceC5090
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final long mo9108() {
        return this.f12987.mo9108();
    }
}
