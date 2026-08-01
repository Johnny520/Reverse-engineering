package io.ktor.client.engine.cio;

import io.ktor.http.cio.C3960;
import io.ktor.http.cio.C3962;
import io.ktor.network.sockets.C4025;
import io.ktor.utils.io.AbstractC4243;
import io.ktor.utils.io.InterfaceC4251;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p236.C8115;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.engine.cio.ConnectionPipeline$responseHandler$1", f = "ConnectionPipeline.kt", l = {74, 77, 122, 132, 137, 142, 142}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class ConnectionPipeline$responseHandler$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C4025 $connection;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ AbstractC3872 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionPipeline$responseHandler$1(AbstractC3872 abstractC3872, C4025 c4025, InterfaceC4356<? super ConnectionPipeline$responseHandler$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.this$0 = abstractC3872;
        this.$connection = c4025;
    }

    private static final C5175 invokeSuspend$lambda$0(C3962 c3962, C8115 c8115) {
        c8115.m2415(new C3960(c3962.f12213));
        c3962.f12213.m8387();
        return C5175.f14739;
    }

    private static final C5175 invokeSuspend$lambda$1(InterfaceC4251 interfaceC4251, Throwable th) {
        AbstractC4243.m8677(interfaceC4251);
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ConnectionPipeline$responseHandler$1 connectionPipeline$responseHandler$1 = new ConnectionPipeline$responseHandler$1(this.this$0, this.$connection, interfaceC4356);
        connectionPipeline$responseHandler$1.L$0 = obj;
        return connectionPipeline$responseHandler$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ConnectionPipeline$responseHandler$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r8 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.ConnectionPipeline$responseHandler$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
