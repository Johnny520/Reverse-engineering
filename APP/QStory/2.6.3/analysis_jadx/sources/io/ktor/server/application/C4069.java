package io.ktor.server.application;

import kotlin.coroutines.InterfaceC4354;
import kotlin.coroutines.InterfaceC4355;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.InterfaceC4361;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p052.InterfaceC6554;
import p253.AbstractC8190;
import p316.C8667;

/* JADX INFO: renamed from: io.ktor.server.application.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4069 implements InterfaceC4355 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C4069 f12364 = new C4069();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4072 f12363 = new C4072();

    @Override // kotlin.coroutines.InterfaceC4360
    public final Object fold(Object obj, InterfaceC6554 interfaceC6554) {
        interfaceC6554.getClass();
        return interfaceC6554.invoke(obj, this);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4354 get(InterfaceC4361 interfaceC4361) {
        return AbstractC8190.m13702(this, interfaceC4361);
    }

    @Override // kotlin.coroutines.InterfaceC4354
    public final InterfaceC4361 getKey() {
        return f12363;
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4360 minusKey(InterfaceC4361 interfaceC4361) {
        return AbstractC8190.m13690(this, interfaceC4361);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4360 plus(InterfaceC4360 interfaceC4360) {
        interfaceC4360.getClass();
        return C8667.m14365(this, interfaceC4360);
    }

    @Override // kotlin.coroutines.InterfaceC4355
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final InterfaceC4357 mo8471(ContinuationImpl continuationImpl) {
        return new C4071(continuationImpl, Thread.currentThread().getContextClassLoader());
    }

    @Override // kotlin.coroutines.InterfaceC4355
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo8472(InterfaceC4357 interfaceC4357) {
        interfaceC4357.getClass();
    }
}
