package io.ktor.server.application;

import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: io.ktor.server.application.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4070 implements InterfaceC4356 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ ContinuationImpl f12361;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ ClassLoader f12362;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC4359 f12363;

    public C4070(ContinuationImpl continuationImpl, ClassLoader classLoader) {
        this.f12361 = continuationImpl;
        this.f12362 = classLoader;
        this.f12363 = continuationImpl.getContext();
    }

    @Override // kotlin.coroutines.InterfaceC4356
    public final InterfaceC4359 getContext() {
        return this.f12363;
    }

    @Override // kotlin.coroutines.InterfaceC4356
    public final void resumeWith(Object obj) {
        Thread.currentThread().setContextClassLoader(this.f12362);
        this.f12361.resumeWith(obj);
    }
}
