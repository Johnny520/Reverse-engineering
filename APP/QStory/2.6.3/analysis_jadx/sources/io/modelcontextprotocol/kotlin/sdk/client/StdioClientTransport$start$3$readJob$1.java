package io.modelcontextprotocol.kotlin.sdk.client;

import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
@InterfaceC6862(c = "io.modelcontextprotocol.kotlin.sdk.client.StdioClientTransport$start$3$readJob$1", f = "StdioClientTransport.kt", l = {60}, m = "invokeSuspend")
public final class StdioClientTransport$start$3$readJob$1 extends SuspendLambda implements InterfaceC6554 {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AbstractC4284 this$0;

    public StdioClientTransport$start$3$readJob$1(AbstractC4284 abstractC4284, InterfaceC4357<? super StdioClientTransport$start$3$readJob$1> interfaceC4357) {
        super(2, interfaceC4357);
    }

    private static final Object invokeSuspend$lambda$0() {
        return "Read coroutine started.";
    }

    private static final Object invokeSuspend$lambda$2() {
        return "Error reading from input stream";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        StdioClientTransport$start$3$readJob$1 stdioClientTransport$start$3$readJob$1 = new StdioClientTransport$start$3$readJob$1(null, interfaceC4357);
        stdioClientTransport$start$3$readJob$1.L$0 = obj;
        return stdioClientTransport$start$3$readJob$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((StdioClientTransport$start$3$readJob$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r3.label
            r1 = 0
            if (r0 == 0) goto L38
            r2 = 1
            if (r0 != r2) goto L32
            java.lang.Object r0 = r3.L$2
            if (r0 != 0) goto L2e
            java.lang.Object r0 = r3.L$1
            java.lang.AutoCloseable r0 = (java.lang.AutoCloseable) r0
            java.lang.Object r3 = r3.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r3 = (kotlinx.coroutines.InterfaceC5401) r3
            kotlin.AbstractC5185.m10210(r4)     // Catch: java.lang.Throwable -> L26
            boolean r3 = kotlinx.coroutines.AbstractC5399.m10495(r3)     // Catch: java.lang.Throwable -> L26
            if (r3 != 0) goto L25
            com.bumptech.glide.AbstractC3065.m6836(r0, r1)     // Catch: java.lang.Exception -> L2d
            kotlin.飘花落叶言子楪兰苏哲世 r3 = kotlin.C5176.f14739
            return r3
        L25:
            throw r1     // Catch: java.lang.Throwable -> L26
        L26:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L28
        L28:
            r4 = move-exception
            com.bumptech.glide.AbstractC3065.m6836(r0, r3)     // Catch: java.lang.Exception -> L2d
            throw r4     // Catch: java.lang.Exception -> L2d
        L2d:
            throw r1
        L2e:
            com.alibaba.fastjson2.C2942.m6394()
            return r1
        L32:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r3)
            return r1
        L38:
            kotlin.AbstractC5185.m10210(r4)
            java.lang.Object r3 = r3.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r3 = (kotlinx.coroutines.InterfaceC5401) r3
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.modelcontextprotocol.kotlin.sdk.client.StdioClientTransport$start$3$readJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
