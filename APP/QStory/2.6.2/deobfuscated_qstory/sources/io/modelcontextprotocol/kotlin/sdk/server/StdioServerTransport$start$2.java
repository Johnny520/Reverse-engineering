package io.modelcontextprotocol.kotlin.sdk.server;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.modelcontextprotocol.kotlin.sdk.server.StdioServerTransport$start$2", f = "StdioServerTransport.kt", l = {55, 63, 63, 63}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class StdioServerTransport$start$2 extends SuspendLambda implements InterfaceC6553 {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AbstractC4296 this$0;

    public StdioServerTransport$start$2(AbstractC4296 abstractC4296, InterfaceC4356<? super StdioServerTransport$start$2> interfaceC4356) {
        super(2, interfaceC4356);
    }

    private static final Object invokeSuspend$lambda$0() {
        return "Error reading from stdin";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        StdioServerTransport$start$2 stdioServerTransport$start$2 = new StdioServerTransport$start$2(null, interfaceC4356);
        stdioServerTransport$start$2.L$0 = obj;
        return stdioServerTransport$start$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((StdioServerTransport$start$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r5.label
            r1 = 4
            r2 = 2
            r3 = 0
            if (r0 == 0) goto L33
            r4 = 1
            if (r0 == r4) goto L27
            if (r0 == r2) goto L21
            r2 = 3
            if (r0 == r2) goto L21
            if (r0 == r1) goto L19
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r5)
            return r3
        L19:
            java.lang.Object r5 = r5.L$0
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            kotlin.AbstractC5184.m10206(r6)
            throw r5
        L21:
            kotlin.AbstractC5184.m10206(r6)
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5175.f14739
            return r5
        L27:
            java.lang.Object r0 = r5.L$1
            kotlinx.io.飘花落叶言子楪世苏哲兰 r0 = (kotlinx.io.C5476) r0
            java.lang.Object r0 = r5.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r0 = (kotlinx.coroutines.InterfaceC5400) r0
            kotlin.AbstractC5184.m10206(r6)     // Catch: java.lang.Throwable -> L49
            goto L3b
        L33:
            kotlin.AbstractC5184.m10206(r6)
            java.lang.Object r6 = r5.L$0
            r0 = r6
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r0 = (kotlinx.coroutines.InterfaceC5400) r0
        L3b:
            boolean r6 = kotlinx.coroutines.AbstractC5398.m10491(r0)     // Catch: java.lang.Throwable -> L49
            if (r6 == 0) goto L42
            throw r3     // Catch: java.lang.Throwable -> L49
        L42:
            r5.L$0 = r3
            r5.L$1 = r3
            r5.label = r2
            throw r3
        L49:
            throw r3     // Catch: java.lang.Throwable -> L4a
        L4a:
            r6 = move-exception
            r5.L$0 = r6
            r5.L$1 = r3
            r5.label = r1
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.modelcontextprotocol.kotlin.sdk.server.StdioServerTransport$start$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
