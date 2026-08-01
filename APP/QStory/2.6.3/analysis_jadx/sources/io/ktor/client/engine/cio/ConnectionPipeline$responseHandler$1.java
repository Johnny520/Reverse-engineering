package io.ktor.client.engine.cio;

import io.ktor.http.cio.C3961;
import io.ktor.http.cio.C3963;
import io.ktor.network.sockets.C4026;
import io.ktor.utils.io.AbstractC4244;
import io.ktor.utils.io.InterfaceC4252;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p236.C8116;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.engine.cio.ConnectionPipeline$responseHandler$1", f = "ConnectionPipeline.kt", l = {74, 77, 122, 132, 137, 142, 142}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class ConnectionPipeline$responseHandler$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ C4026 $connection;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ AbstractC3873 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionPipeline$responseHandler$1(AbstractC3873 abstractC3873, C4026 c4026, InterfaceC4357<? super ConnectionPipeline$responseHandler$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = abstractC3873;
        this.$connection = c4026;
    }

    private static final C5176 invokeSuspend$lambda$0(C3963 c3963, C8116 c8116) {
        c8116.m2425(new C3961(c3963.f12217));
        c3963.f12217.m8377();
        return C5176.f14739;
    }

    private static final C5176 invokeSuspend$lambda$1(InterfaceC4252 interfaceC4252, Throwable th) {
        AbstractC4244.m8667(interfaceC4252);
        return C5176.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ConnectionPipeline$responseHandler$1 connectionPipeline$responseHandler$1 = new ConnectionPipeline$responseHandler$1(this.this$0, this.$connection, interfaceC4357);
        connectionPipeline$responseHandler$1.L$0 = obj;
        return connectionPipeline$responseHandler$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((ConnectionPipeline$responseHandler$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
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
