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
@InterfaceC6862(c = "io.ktor.client.engine.cio.Endpoint$processExpectContinue$2", f = "Endpoint.kt", l = {149, 151, 156, 163, 167, 171, 176, 179}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世兰苏哲;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世兰苏哲;"}, k = 3, mv = {2, 0, 0})
final class Endpoint$processExpectContinue$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC4360 $callContext;
    final /* synthetic */ InterfaceC4252 $input;
    final /* synthetic */ InterfaceC4247 $originOutput;
    final /* synthetic */ InterfaceC4247 $output;
    final /* synthetic */ boolean $overProxy;
    final /* synthetic */ C8139 $request;
    final /* synthetic */ C8147 $requestTime;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Endpoint$processExpectContinue$2(C8139 c8139, InterfaceC4247 interfaceC4247, boolean z, C8147 c8147, InterfaceC4252 interfaceC4252, InterfaceC4247 interfaceC42472, InterfaceC4360 interfaceC4360, InterfaceC4357<? super Endpoint$processExpectContinue$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$request = c8139;
        this.$output = interfaceC4247;
        this.$overProxy = z;
        this.$requestTime = c8147;
        this.$input = interfaceC4252;
        this.$originOutput = interfaceC42472;
        this.$callContext = interfaceC4360;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new Endpoint$processExpectContinue$2(this.$request, this.$output, this.$overProxy, this.$requestTime, this.$input, this.$originOutput, this.$callContext, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C8137> interfaceC4357) {
        return ((Endpoint$processExpectContinue$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[PHI: r2
  0x005b: PHI (r2v5 java.lang.Object) = (r2v4 java.lang.Object), (r2v10 java.lang.Object) binds: [B:18:0x0057, B:12:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.Endpoint$processExpectContinue$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
