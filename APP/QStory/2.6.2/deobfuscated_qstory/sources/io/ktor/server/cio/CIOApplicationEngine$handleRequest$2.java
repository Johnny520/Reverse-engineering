package io.ktor.server.cio;

import io.ktor.http.cio.C3965;
import io.ktor.server.cio.backend.C4072;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.cio.CIOApplicationEngine$handleRequest$2", f = "CIOApplicationEngine.kt", l = {165, 229, 168}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class CIOApplicationEngine$handleRequest$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C3965 $request;
    final /* synthetic */ C4072 $this_handleRequest;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C4080 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOApplicationEngine$handleRequest$2(C4080 c4080, C3965 c3965, C4072 c4072, InterfaceC4356<? super CIOApplicationEngine$handleRequest$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = c4080;
        this.$request = c3965;
        this.$this_handleRequest = c4072;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        CIOApplicationEngine$handleRequest$2 cIOApplicationEngine$handleRequest$2 = new CIOApplicationEngine$handleRequest$2(this.this$0, this.$request, this.$this_handleRequest, interfaceC4356);
        cIOApplicationEngine$handleRequest$2.L$0 = obj;
        return cIOApplicationEngine$handleRequest$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((CIOApplicationEngine$handleRequest$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
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
