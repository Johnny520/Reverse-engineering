package io.ktor.client.engine.cio;

import io.ktor.utils.io.InterfaceC4246;
import io.ktor.utils.io.InterfaceC4251;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p241.C8136;
import p241.C8138;
import p243.C8146;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.engine.cio.UtilsKt$readResponse$2", f = "utils.kt", l = {173}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世兰苏哲;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世兰苏哲;"}, k = 3, mv = {2, 0, 0})
final class UtilsKt$readResponse$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC4359 $callContext;
    final /* synthetic */ InterfaceC4251 $input;
    final /* synthetic */ InterfaceC4246 $output;
    final /* synthetic */ C8138 $request;
    final /* synthetic */ C8146 $requestTime;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$readResponse$2(InterfaceC4251 interfaceC4251, InterfaceC4246 interfaceC4246, InterfaceC4359 interfaceC4359, C8146 c8146, C8138 c8138, InterfaceC4356<? super UtilsKt$readResponse$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$input = interfaceC4251;
        this.$output = interfaceC4246;
        this.$callContext = interfaceC4359;
        this.$requestTime = c8146;
        this.$request = c8138;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new UtilsKt$readResponse$2(this.$input, this.$output, this.$callContext, this.$requestTime, this.$request, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C8136> interfaceC4356) {
        return ((UtilsKt$readResponse$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.UtilsKt$readResponse$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
