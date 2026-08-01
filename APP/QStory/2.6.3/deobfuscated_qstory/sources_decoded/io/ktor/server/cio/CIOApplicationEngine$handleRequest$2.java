package io.ktor.server.cio;

import io.ktor.http.cio.C3966;
import io.ktor.server.cio.backend.C4073;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.cio.CIOApplicationEngine$handleRequest$2", f = "CIOApplicationEngine.kt", l = {165, 229, 168}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class CIOApplicationEngine$handleRequest$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ C3966 $request;
    final /* synthetic */ C4073 $this_handleRequest;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C4081 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOApplicationEngine$handleRequest$2(C4081 c4081, C3966 c3966, C4073 c4073, InterfaceC4357<? super CIOApplicationEngine$handleRequest$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c4081;
        this.$request = c3966;
        this.$this_handleRequest = c4073;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        CIOApplicationEngine$handleRequest$2 cIOApplicationEngine$handleRequest$2 = new CIOApplicationEngine$handleRequest$2(this.this$0, this.$request, this.$this_handleRequest, interfaceC4357);
        cIOApplicationEngine$handleRequest$2.L$0 = obj;
        return cIOApplicationEngine$handleRequest$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((CIOApplicationEngine$handleRequest$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.cio.CIOApplicationEngine$handleRequest$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
