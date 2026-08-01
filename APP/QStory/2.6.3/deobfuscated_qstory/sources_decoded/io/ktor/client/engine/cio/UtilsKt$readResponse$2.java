package io.ktor.client.engine.cio;

import io.ktor.utils.io.InterfaceC4247;
import io.ktor.utils.io.InterfaceC4252;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p241.C8137;
import p241.C8139;
import p243.C8147;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.engine.cio.UtilsKt$readResponse$2", f = "utils.kt", l = {173}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世兰苏哲;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世兰苏哲;"}, k = 3, mv = {2, 0, 0})
final class UtilsKt$readResponse$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC4360 $callContext;
    final /* synthetic */ InterfaceC4252 $input;
    final /* synthetic */ InterfaceC4247 $output;
    final /* synthetic */ C8139 $request;
    final /* synthetic */ C8147 $requestTime;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$readResponse$2(InterfaceC4252 interfaceC4252, InterfaceC4247 interfaceC4247, InterfaceC4360 interfaceC4360, C8147 c8147, C8139 c8139, InterfaceC4357<? super UtilsKt$readResponse$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$input = interfaceC4252;
        this.$output = interfaceC4247;
        this.$callContext = interfaceC4360;
        this.$requestTime = c8147;
        this.$request = c8139;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new UtilsKt$readResponse$2(this.$input, this.$output, this.$callContext, this.$requestTime, this.$request, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C8137> interfaceC4357) {
        return ((UtilsKt$readResponse$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
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
