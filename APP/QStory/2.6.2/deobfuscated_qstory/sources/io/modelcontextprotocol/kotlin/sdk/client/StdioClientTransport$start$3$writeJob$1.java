package io.modelcontextprotocol.kotlin.sdk.client;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.io.InterfaceC5483;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
@InterfaceC6861(c = "io.modelcontextprotocol.kotlin.sdk.client.StdioClientTransport$start$3$writeJob$1", f = "StdioClientTransport.kt", l = {131}, m = "invokeSuspend")
public final class StdioClientTransport$start$3$writeJob$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC5483 $outputStream;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ AbstractC4283 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StdioClientTransport$start$3$writeJob$1(AbstractC4283 abstractC4283, InterfaceC5483 interfaceC5483, InterfaceC4356<? super StdioClientTransport$start$3$writeJob$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$outputStream = interfaceC5483;
    }

    private static final Object invokeSuspend$lambda$0() {
        return "Write coroutine started.";
    }

    private static final Object invokeSuspend$lambda$2() {
        return "Error writing to output stream";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        StdioClientTransport$start$3$writeJob$1 stdioClientTransport$start$3$writeJob$1 = new StdioClientTransport$start$3$writeJob$1(null, this.$outputStream, interfaceC4356);
        stdioClientTransport$start$3$writeJob$1.L$0 = obj;
        return stdioClientTransport$start$3$writeJob$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((StdioClientTransport$start$3$writeJob$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.label
            r2 = 0
            if (r1 == 0) goto L7d
            r3 = 1
            if (r1 != r3) goto L77
            java.lang.Object r1 = r9.L$3
            kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世 r1 = (kotlinx.coroutines.channels.InterfaceC5211) r1
            java.lang.Object r4 = r9.L$2
            kotlinx.coroutines.channels.飘花落叶言子楪兰苏世哲 r4 = (kotlinx.coroutines.channels.InterfaceC5198) r4
            java.lang.Object r5 = r9.L$1
            kotlinx.io.飘花落叶言子楪苏哲兰世 r5 = (kotlinx.io.InterfaceC5483) r5
            java.lang.Object r6 = r9.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r6 = (kotlinx.coroutines.InterfaceC5400) r6
            kotlin.AbstractC5184.m10206(r10)     // Catch: java.lang.Throwable -> L62
        L1d:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L62
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L62
            if (r10 == 0) goto L64
            kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏 r1 = (kotlinx.coroutines.channels.C5190) r1     // Catch: java.lang.Throwable -> L62
            java.lang.Object r10 = r1.m10258()     // Catch: java.lang.Throwable -> L62
            飘花落叶言世子楪兰苏哲.飘花落叶言子哲世楪兰苏 r10 = (p056.InterfaceC6660) r10     // Catch: java.lang.Throwable -> L62
            r10.getClass()     // Catch: java.lang.Throwable -> L62
            飘花落叶言世苏兰哲楪子.飘花落叶言子楪世苏兰哲 r7 = io.modelcontextprotocol.kotlin.sdk.shared.AbstractC4310.m8753()     // Catch: java.lang.Throwable -> L62
            r7.getClass()     // Catch: java.lang.Throwable -> L62
            飘花落叶言世子楪兰苏哲.飘花落叶言子哲世楪苏兰 r8 = p056.InterfaceC6660.Companion     // Catch: java.lang.Throwable -> L62
            飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰 r8 = r8.serializer()     // Catch: java.lang.Throwable -> L62
            飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰 r8 = (p089.InterfaceC7183) r8     // Catch: java.lang.Throwable -> L62
            java.lang.String r10 = r7.m12397(r8, r10)     // Catch: java.lang.Throwable -> L62
            java.lang.String r7 = "\n"
            java.lang.String r10 = r10.concat(r7)     // Catch: java.lang.Throwable -> L62
            int r7 = r10.length()     // Catch: java.lang.Throwable -> L62
            r8 = 0
            kotlinx.io.AbstractC5477.m10622(r5, r10, r8, r7)     // Catch: java.lang.Throwable -> L62
            r9.L$0 = r6     // Catch: java.lang.Throwable -> L62
            r9.L$1 = r5     // Catch: java.lang.Throwable -> L62
            r9.L$2 = r4     // Catch: java.lang.Throwable -> L62
            r9.L$3 = r1     // Catch: java.lang.Throwable -> L62
            r9.label = r3     // Catch: java.lang.Throwable -> L62
            java.lang.Object r10 = r1.m10260(r9)     // Catch: java.lang.Throwable -> L62
            if (r10 != r0) goto L1d
            return r0
        L62:
            r9 = move-exception
            goto L68
        L64:
            r4.mo10252(r2)     // Catch: java.lang.Throwable -> L6e
            throw r2
        L68:
            throw r9     // Catch: java.lang.Throwable -> L69
        L69:
            r10 = move-exception
            kotlinx.coroutines.channels.AbstractC5204.m10274(r4, r9)     // Catch: java.lang.Throwable -> L6e
            throw r10     // Catch: java.lang.Throwable -> L6e
        L6e:
            boolean r9 = kotlinx.coroutines.AbstractC5398.m10491(r6)     // Catch: java.lang.Throwable -> L76
            if (r9 == 0) goto L75
            throw r2     // Catch: java.lang.Throwable -> L76
        L75:
            throw r2
        L76:
            throw r2
        L77:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r9)
            return r2
        L7d:
            kotlin.AbstractC5184.m10206(r10)
            java.lang.Object r9 = r9.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r9 = (kotlinx.coroutines.InterfaceC5400) r9
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.modelcontextprotocol.kotlin.sdk.client.StdioClientTransport$start$3$writeJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
