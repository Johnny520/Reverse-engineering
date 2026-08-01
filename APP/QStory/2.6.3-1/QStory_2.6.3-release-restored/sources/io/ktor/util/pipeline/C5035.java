package io.ktor.util.pipeline;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import p079.InterfaceC7692;

/* JADX INFO: renamed from: io.ktor.util.pipeline.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5035 implements InterfaceC7692, InterfaceC5189 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C5035 f13035 = new C5035();

    @Override // p079.InterfaceC7692
    public final InterfaceC7692 getCallerFrame() {
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC5189
    public final InterfaceC5192 getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // kotlin.coroutines.InterfaceC5189
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.");
    }
}
