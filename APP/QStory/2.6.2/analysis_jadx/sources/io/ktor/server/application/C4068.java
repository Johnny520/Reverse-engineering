package io.ktor.server.application;

import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.AbstractC3056;
import kotlin.coroutines.InterfaceC4353;
import kotlin.coroutines.InterfaceC4354;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: io.ktor.server.application.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4068 implements InterfaceC4354 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C4068 f12360 = new C4068();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4071 f12359 = new C4071();

    @Override // kotlin.coroutines.InterfaceC4359
    public final Object fold(Object obj, InterfaceC6553 interfaceC6553) {
        interfaceC6553.getClass();
        return interfaceC6553.invoke(obj, this);
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final InterfaceC4353 get(InterfaceC4360 interfaceC4360) {
        return AbstractC2904.m6257(this, interfaceC4360);
    }

    @Override // kotlin.coroutines.InterfaceC4353
    public final InterfaceC4360 getKey() {
        return f12359;
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final InterfaceC4359 minusKey(InterfaceC4360 interfaceC4360) {
        return AbstractC2904.m6247(this, interfaceC4360);
    }

    @Override // kotlin.coroutines.InterfaceC4359
    public final InterfaceC4359 plus(InterfaceC4359 interfaceC4359) {
        interfaceC4359.getClass();
        return AbstractC3056.m6656(this, interfaceC4359);
    }

    @Override // kotlin.coroutines.InterfaceC4354
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final InterfaceC4356 mo8481(ContinuationImpl continuationImpl) {
        return new C4070(continuationImpl, Thread.currentThread().getContextClassLoader());
    }

    @Override // kotlin.coroutines.InterfaceC4354
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void mo8482(InterfaceC4356 interfaceC4356) {
        interfaceC4356.getClass();
    }
}
