package io.ktor.client.plugins;

import io.ktor.client.plugins.api.AbstractC4719;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C6254;
import kotlinx.coroutines.C6283;
import kotlinx.coroutines.InterfaceC6271;
import p068.InterfaceC7380;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p257.C8969;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.HttpRequestLifecycleKt$HttpRequestLifecycle$1$1", m556f = "HttpRequestLifecycle.kt", m557l = {27}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, m151d2 = {"L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lkotlin/Function1;", "Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "", "proceed", "<anonymous>", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class HttpRequestLifecycleKt$HttpRequestLifecycle$1$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ AbstractC4719 $this_createClientPlugin;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public HttpRequestLifecycleKt$HttpRequestLifecycle$1$1(AbstractC4719 abstractC4719, InterfaceC5189<? super HttpRequestLifecycleKt$HttpRequestLifecycle$1$1> interfaceC5189) {
        super(3, interfaceC5189);
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(C8969 c8969, InterfaceC7387 interfaceC7387, InterfaceC5189<? super C6008> interfaceC5189) {
        HttpRequestLifecycleKt$HttpRequestLifecycle$1$1 httpRequestLifecycleKt$HttpRequestLifecycle$1$1 = new HttpRequestLifecycleKt$HttpRequestLifecycle$1$1(null, interfaceC5189);
        httpRequestLifecycleKt$HttpRequestLifecycle$1$1.L$0 = c8969;
        httpRequestLifecycleKt$HttpRequestLifecycle$1$1.L$1 = interfaceC7387;
        return httpRequestLifecycleKt$HttpRequestLifecycle$1$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C8969 c8969 = (C8969) this.L$0;
            new C6254(c8969.f22801);
            throw null;
        }
        if (i != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        InterfaceC6271 interfaceC6271 = (InterfaceC6271) this.L$0;
        try {
            AbstractC6017.m10769(obj);
            ((C6283) interfaceC6271).m11114();
            return C6008.f15084;
        } finally {
        }
    }
}
