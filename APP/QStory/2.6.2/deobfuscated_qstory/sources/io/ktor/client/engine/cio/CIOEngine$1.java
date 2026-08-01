package io.ktor.client.engine.cio;

import io.ktor.network.selector.InterfaceC4005;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5451;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.client.engine.cio.CIOEngine$1", f = "CIOEngine.kt", l = {67, 70, 70}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class CIOEngine$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5451 $requestJob;
    final /* synthetic */ InterfaceC4005 $selector;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOEngine$1(InterfaceC5451 interfaceC5451, InterfaceC4005 interfaceC4005, InterfaceC4356<? super CIOEngine$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$requestJob = interfaceC5451;
        this.$selector = interfaceC4005;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new CIOEngine$1(this.$requestJob, this.$selector, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((CIOEngine$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r6 == r0) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r6.label
            kotlinx.coroutines.飘花落叶言子苏世楪哲兰 r2 = kotlinx.coroutines.C5452.f15105
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L24
            if (r1 == r4) goto L20
            if (r1 == r3) goto L18
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            r6 = 0
            return r6
        L18:
            java.lang.Object r6 = r6.L$0
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.AbstractC5184.m10206(r7)
            goto L7c
        L20:
            kotlin.AbstractC5184.m10206(r7)
            goto L57
        L24:
            kotlin.AbstractC5184.m10206(r7)     // Catch: java.lang.Throwable -> L28
            goto L38
        L28:
            r7 = move-exception
            goto L5a
        L2a:
            kotlin.AbstractC5184.m10206(r7)
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r7 = r6.$requestJob     // Catch: java.lang.Throwable -> L28
            r6.label = r5     // Catch: java.lang.Throwable -> L28
            java.lang.Object r7 = r7.mo10558(r6)     // Catch: java.lang.Throwable -> L28
            if (r7 != r0) goto L38
            goto L7a
        L38:
            io.ktor.network.selector.飘花落叶言子楪苏兰世哲 r7 = r6.$selector
            io.ktor.network.selector.飘花落叶言子楪世苏哲兰 r7 = (io.ktor.network.selector.C4002) r7
            r7.close()
            io.ktor.network.selector.飘花落叶言子楪苏兰世哲 r7 = r6.$selector
            io.ktor.network.selector.飘花落叶言子楪世苏哲兰 r7 = (io.ktor.network.selector.C4002) r7
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r7 = r7.f12253
            kotlin.coroutines.飘花落叶言子楪世兰哲苏 r7 = r7.get(r2)
            r7.getClass()
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r7 = (kotlinx.coroutines.InterfaceC5451) r7
            r6.label = r4
            java.lang.Object r6 = r7.mo10558(r6)
            if (r6 != r0) goto L57
            goto L7a
        L57:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            return r6
        L5a:
            io.ktor.network.selector.飘花落叶言子楪苏兰世哲 r1 = r6.$selector
            io.ktor.network.selector.飘花落叶言子楪世苏哲兰 r1 = (io.ktor.network.selector.C4002) r1
            r1.close()
            io.ktor.network.selector.飘花落叶言子楪苏兰世哲 r1 = r6.$selector
            io.ktor.network.selector.飘花落叶言子楪世苏哲兰 r1 = (io.ktor.network.selector.C4002) r1
            kotlin.coroutines.飘花落叶言子楪苏世兰哲 r1 = r1.f12253
            kotlin.coroutines.飘花落叶言子楪世兰哲苏 r1 = r1.get(r2)
            r1.getClass()
            kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r1 = (kotlinx.coroutines.InterfaceC5451) r1
            r6.L$0 = r7
            r6.label = r3
            java.lang.Object r6 = r1.mo10558(r6)
            if (r6 != r0) goto L7b
        L7a:
            return r0
        L7b:
            r6 = r7
        L7c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.CIOEngine$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
