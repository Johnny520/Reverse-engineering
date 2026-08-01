package io.ktor.client.plugins;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5452;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p241.C8140;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
@InterfaceC6862(c = "io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$2$1$1$killer$1", f = "HttpTimeout.kt", l = {165}, m = "invokeSuspend")
public final class HttpTimeoutKt$HttpTimeout$2$1$1$killer$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5452 $executionContext;
    final /* synthetic */ C8140 $request;
    final /* synthetic */ Long $requestTimeout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpTimeoutKt$HttpTimeout$2$1$1$killer$1(Long l, C8140 c8140, InterfaceC5452 interfaceC5452, InterfaceC4357<? super HttpTimeoutKt$HttpTimeout$2$1$1$killer$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$requestTimeout = l;
        this.$request = c8140;
        this.$executionContext = interfaceC5452;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new HttpTimeoutKt$HttpTimeout$2$1$1$killer$1(this.$requestTimeout, this.$request, this.$executionContext, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((HttpTimeoutKt$HttpTimeout$2$1$1$killer$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            long jLongValue = this.$requestTimeout.longValue();
            this.label = 1;
            if (AbstractC5399.m10499(jLongValue, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        HttpRequestTimeoutException httpRequestTimeoutException = new HttpRequestTimeoutException(this.$request);
        AbstractC3916.f12124.trace("Request timeout: " + this.$request.f22460);
        InterfaceC5452 interfaceC5452 = this.$executionContext;
        String message = httpRequestTimeoutException.getMessage();
        message.getClass();
        AbstractC5399.m10508(message, httpRequestTimeoutException, interfaceC5452);
        return C5176.f14739;
    }
}
