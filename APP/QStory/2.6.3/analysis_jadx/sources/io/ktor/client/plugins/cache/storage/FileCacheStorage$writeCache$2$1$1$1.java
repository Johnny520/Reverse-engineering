package io.ktor.client.plugins.cache.storage;

import io.ktor.utils.io.C4249;
import java.util.List;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
@InterfaceC6862(c = "io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2$1$1$1", f = "FileCacheStorage.kt", l = {97, 99}, m = "invokeSuspend")
public final class FileCacheStorage$writeCache$2$1$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ List<AbstractC3890> $caches;
    final /* synthetic */ C4249 $channel;
    Object L$0;
    int label;
    final /* synthetic */ AbstractC3888 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileCacheStorage$writeCache$2$1$1$1(C4249 c4249, List<AbstractC3890> list, AbstractC3888 abstractC3888, InterfaceC4357<? super FileCacheStorage$writeCache$2$1$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$channel = c4249;
        this.$caches = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new FileCacheStorage$writeCache$2$1$1$1(this.$channel, this.$caches, null, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((FileCacheStorage$writeCache$2$1$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            java.lang.Object r0 = r5.L$0
            java.util.Iterator r0 = (java.util.Iterator) r0
            kotlin.AbstractC5185.m10210(r6)
            goto L39
        L15:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            return r2
        L1b:
            kotlin.AbstractC5185.m10210(r6)
            goto L33
        L1f:
            kotlin.AbstractC5185.m10210(r6)
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r6 = r5.$channel
            java.util.List<io.ktor.client.plugins.cache.storage.飘花落叶言子楪世苏哲兰> r1 = r5.$caches
            int r1 = r1.size()
            r5.label = r4
            java.lang.Object r6 = io.ktor.utils.io.AbstractC4246.m8688(r6, r1, r5)
            if (r6 != r0) goto L33
            return r0
        L33:
            java.util.List<io.ktor.client.plugins.cache.storage.飘花落叶言子楪世苏哲兰> r6 = r5.$caches
            java.util.Iterator r0 = r6.iterator()
        L39:
            boolean r6 = r0.hasNext()
            if (r6 != 0) goto L47
            io.ktor.utils.io.飘花落叶言子楪苏世兰哲 r5 = r5.$channel
            r5.m8698()
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5176.f14739
            return r5
        L47:
            java.lang.Object r6 = r0.next()
            io.ktor.client.plugins.cache.storage.飘花落叶言子楪世苏哲兰 r6 = (io.ktor.client.plugins.cache.storage.AbstractC3890) r6
            r5.L$0 = r0
            r5.label = r3
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.cache.storage.FileCacheStorage$writeCache$2$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
