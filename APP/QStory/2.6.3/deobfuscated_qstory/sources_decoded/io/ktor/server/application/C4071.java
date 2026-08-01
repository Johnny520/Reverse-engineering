package io.ktor.server.application;

import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.ktor.server.application.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4071 implements InterfaceC4357 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ ContinuationImpl f12365;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ ClassLoader f12366;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4360 f12367;

    public C4071(ContinuationImpl continuationImpl, ClassLoader classLoader) {
        this.f12365 = continuationImpl;
        this.f12366 = classLoader;
        this.f12367 = continuationImpl.getContext();
    }

    @Override // kotlin.coroutines.InterfaceC4357
    public final InterfaceC4360 getContext() {
        return this.f12367;
    }

    @Override // kotlin.coroutines.InterfaceC4357
    public final void resumeWith(Object obj) {
        Thread.currentThread().setContextClassLoader(this.f12366);
        this.f12365.resumeWith(obj);
    }
}
