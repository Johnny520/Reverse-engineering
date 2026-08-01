package io.modelcontextprotocol.kotlin.sdk.server;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.modelcontextprotocol.kotlin.sdk.server.StdioServerTransport$start$2", f = "StdioServerTransport.kt", l = {55, 63, 63, 63}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class StdioServerTransport$start$2 extends SuspendLambda implements InterfaceC6554 {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AbstractC4297 this$0;

    public StdioServerTransport$start$2(AbstractC4297 abstractC4297, InterfaceC4357<? super StdioServerTransport$start$2> interfaceC4357) {
        super(2, interfaceC4357);
    }

    private static final Object invokeSuspend$lambda$0() {
        return "Error reading from stdin";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        StdioServerTransport$start$2 stdioServerTransport$start$2 = new StdioServerTransport$start$2(null, interfaceC4357);
        stdioServerTransport$start$2.L$0 = obj;
        return stdioServerTransport$start$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((StdioServerTransport$start$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
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
            top.suzhelan.qstory.hook.item.C5925.m11311(r5)
            return r3
        L19:
            java.lang.Object r5 = r5.L$0
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            kotlin.AbstractC5185.m10210(r6)
            throw r5
        L21:
            kotlin.AbstractC5185.m10210(r6)
            kotlin.飘花落叶言子楪兰苏哲世 r5 = kotlin.C5176.f14739
            return r5
        L27:
            java.lang.Object r0 = r5.L$1
            kotlinx.io.飘花落叶言子楪世苏哲兰 r0 = (kotlinx.io.C5477) r0
            java.lang.Object r0 = r5.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r0 = (kotlinx.coroutines.InterfaceC5401) r0
            kotlin.AbstractC5185.m10210(r6)     // Catch: java.lang.Throwable -> L49
            goto L3b
        L33:
            kotlin.AbstractC5185.m10210(r6)
            java.lang.Object r6 = r5.L$0
            r0 = r6
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r0 = (kotlinx.coroutines.InterfaceC5401) r0
        L3b:
            boolean r6 = kotlinx.coroutines.AbstractC5399.m10495(r0)     // Catch: java.lang.Throwable -> L49
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
