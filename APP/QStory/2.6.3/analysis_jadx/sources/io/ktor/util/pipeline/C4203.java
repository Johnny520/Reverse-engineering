package io.ktor.util.pipeline;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import p063.InterfaceC6863;

/* JADX INFO: renamed from: io.ktor.util.pipeline.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4203 implements InterfaceC6863, InterfaceC4357 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C4203 f12690 = new C4203();

    @Override // p063.InterfaceC6863
    public final InterfaceC6863 getCallerFrame() {
        return null;
    }

    @Override // kotlin.coroutines.InterfaceC4357
    public final InterfaceC4360 getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // kotlin.coroutines.InterfaceC4357
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.");
    }
}
