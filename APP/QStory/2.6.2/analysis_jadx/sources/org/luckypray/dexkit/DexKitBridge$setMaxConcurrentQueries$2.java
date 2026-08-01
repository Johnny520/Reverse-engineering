package org.luckypray.dexkit;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(J)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class DexKitBridge$setMaxConcurrentQueries$2 extends Lambda implements InterfaceC6557 {
    final /* synthetic */ int $maxConcurrentQueries;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexKitBridge$setMaxConcurrentQueries$2(int i) {
        super(1);
        this.$maxConcurrentQueries = i;
    }

    @Override // p052.InterfaceC6557
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).longValue());
        return C5175.f14739;
    }

    public final void invoke(long j) {
        DexKitBridge.nativeSetMaxConcurrentQueries(j, this.$maxConcurrentQueries);
    }
}
