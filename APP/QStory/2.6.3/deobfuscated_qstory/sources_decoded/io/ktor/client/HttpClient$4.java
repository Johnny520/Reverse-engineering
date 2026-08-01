package io.ktor.client;

import io.ktor.client.statement.C3945;
import io.ktor.util.pipeline.AbstractC4194;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.HttpClient$4", f = "HttpClient.kt", l = {1379}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lio/ktor/client/statement/飘花落叶言子楪世苏兰哲;", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lio/ktor/client/statement/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 0, 0})
final class HttpClient$4 extends SuspendLambda implements InterfaceC6551 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AbstractC3949 this$0;

    public HttpClient$4(AbstractC3949 abstractC3949, InterfaceC4357<? super HttpClient$4> interfaceC4357) {
        super(3, interfaceC4357);
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC4194 abstractC4194, C3945 c3945, InterfaceC4357<? super C5176> interfaceC4357) {
        HttpClient$4 httpClient$4 = new HttpClient$4(null, interfaceC4357);
        httpClient$4.L$0 = abstractC4194;
        return httpClient$4.invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 != r3) goto L12
            java.lang.Object r4 = r4.L$0
            io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏 r4 = (io.ktor.util.pipeline.AbstractC4194) r4
            kotlin.AbstractC5185.m10210(r5)     // Catch: java.lang.Throwable -> L2f
            goto L2a
        L12:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r4)
            return r2
        L18:
            kotlin.AbstractC5185.m10210(r5)
            java.lang.Object r5 = r4.L$0
            io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏 r5 = (io.ktor.util.pipeline.AbstractC4194) r5
            r4.L$0 = r5     // Catch: java.lang.Throwable -> L2f
            r4.label = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r5 = r5.mo8566(r4)     // Catch: java.lang.Throwable -> L2f
            if (r5 != r0) goto L2a
            return r0
        L2a:
            io.ktor.client.statement.飘花落叶言子楪世苏兰哲 r5 = (io.ktor.client.statement.C3945) r5     // Catch: java.lang.Throwable -> L2f
            kotlin.飘花落叶言子楪兰苏哲世 r4 = kotlin.C5176.f14739
            return r4
        L2f:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.HttpClient$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
