package io.ktor.client.plugins;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.HttpRequestRetryConfig$delay$1", f = "HttpRequestRetry.kt", l = {39}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(J)V"}, k = 3, mv = {2, 0, 0})
final class HttpRequestRetryConfig$delay$1 extends SuspendLambda implements InterfaceC6553 {
    /* synthetic */ long J$0;
    int label;

    public HttpRequestRetryConfig$delay$1(InterfaceC4356<? super HttpRequestRetryConfig$delay$1> interfaceC4356) {
        super(2, interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        HttpRequestRetryConfig$delay$1 httpRequestRetryConfig$delay$1 = new HttpRequestRetryConfig$delay$1(interfaceC4356);
        httpRequestRetryConfig$delay$1.J$0 = ((Number) obj).longValue();
        return httpRequestRetryConfig$delay$1;
    }

    public final Object invoke(long j, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((HttpRequestRetryConfig$delay$1) create(Long.valueOf(j), interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            long j = this.J$0;
            this.label = 1;
            if (AbstractC5398.m10495(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).longValue(), (InterfaceC4356<? super C5175>) obj2);
    }
}
