package io.ktor.server.application;

import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5187;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.InterfaceC5193;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p068.InterfaceC7383;
import p269.AbstractC9019;
import p332.C9496;

/* JADX INFO: renamed from: io.ktor.server.application.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4901 implements InterfaceC5187 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C4901 f12709 = new C4901();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4904 f12708 = new C4904();

    @Override // kotlin.coroutines.InterfaceC5192
    public final Object fold(Object obj, InterfaceC7383 interfaceC7383) {
        interfaceC7383.getClass();
        return interfaceC7383.invoke(obj, this);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5186 get(InterfaceC5193 interfaceC5193) {
        return AbstractC9019.m14261(this, interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5186
    public final InterfaceC5193 getKey() {
        return f12708;
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5192 minusKey(InterfaceC5193 interfaceC5193) {
        return AbstractC9019.m14249(this, interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5192 plus(InterfaceC5192 interfaceC5192) {
        interfaceC5192.getClass();
        return C9496.m14924(this, interfaceC5192);
    }

    @Override // kotlin.coroutines.InterfaceC5187
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final InterfaceC5189 mo9030(ContinuationImpl continuationImpl) {
        return new C4903(continuationImpl, Thread.currentThread().getContextClassLoader());
    }

    @Override // kotlin.coroutines.InterfaceC5187
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo9031(InterfaceC5189 interfaceC5189) {
        interfaceC5189.getClass();
    }
}
