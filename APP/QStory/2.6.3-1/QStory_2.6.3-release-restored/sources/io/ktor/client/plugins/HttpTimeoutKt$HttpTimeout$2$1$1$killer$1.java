package io.ktor.client.plugins;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p257.C8969;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
@InterfaceC7691(m555c = "io.ktor.client.plugins.HttpTimeoutKt$HttpTimeout$2$1$1$killer$1", m556f = "HttpTimeout.kt", m557l = {165}, m558m = "invokeSuspend")
public final class HttpTimeoutKt$HttpTimeout$2$1$1$killer$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6284 $executionContext;
    final /* synthetic */ C8969 $request;
    final /* synthetic */ Long $requestTimeout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpTimeoutKt$HttpTimeout$2$1$1$killer$1(Long l, C8969 c8969, InterfaceC6284 interfaceC6284, InterfaceC5189<? super HttpTimeoutKt$HttpTimeout$2$1$1$killer$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$requestTimeout = l;
        this.$request = c8969;
        this.$executionContext = interfaceC6284;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new HttpTimeoutKt$HttpTimeout$2$1$1$killer$1(this.$requestTimeout, this.$request, this.$executionContext, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((HttpTimeoutKt$HttpTimeout$2$1$1$killer$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            long jLongValue = this.$requestTimeout.longValue();
            this.label = 1;
            if (AbstractC6231.m11058(jLongValue, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        HttpRequestTimeoutException httpRequestTimeoutException = new HttpRequestTimeoutException(this.$request);
        AbstractC4748.f12469.trace("Request timeout: " + this.$request.f22805);
        InterfaceC6284 interfaceC6284 = this.$executionContext;
        String message = httpRequestTimeoutException.getMessage();
        message.getClass();
        AbstractC6231.m11067(message, httpRequestTimeoutException, interfaceC6284);
        return C6008.f15084;
    }
}
