package io.ktor.client.plugins;

import io.ktor.client.plugins.api.AbstractC3887;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C5422;
import kotlinx.coroutines.C5451;
import kotlinx.coroutines.InterfaceC5439;
import p052.InterfaceC6551;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import p241.C8140;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.HttpRequestLifecycleKt$HttpRequestLifecycle$1$1", f = "HttpRequestLifecycle.kt", l = {27}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lkotlin/Function1;", "Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "", "proceed", "<anonymous>", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V"}, k = 3, mv = {2, 0, 0})
final class HttpRequestLifecycleKt$HttpRequestLifecycle$1$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ AbstractC3887 $this_createClientPlugin;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public HttpRequestLifecycleKt$HttpRequestLifecycle$1$1(AbstractC3887 abstractC3887, InterfaceC4357<? super HttpRequestLifecycleKt$HttpRequestLifecycle$1$1> interfaceC4357) {
        super(3, interfaceC4357);
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(C8140 c8140, InterfaceC6558 interfaceC6558, InterfaceC4357<? super C5176> interfaceC4357) {
        HttpRequestLifecycleKt$HttpRequestLifecycle$1$1 httpRequestLifecycleKt$HttpRequestLifecycle$1$1 = new HttpRequestLifecycleKt$HttpRequestLifecycle$1$1(null, interfaceC4357);
        httpRequestLifecycleKt$HttpRequestLifecycle$1$1.L$0 = c8140;
        httpRequestLifecycleKt$HttpRequestLifecycle$1$1.L$1 = interfaceC6558;
        return httpRequestLifecycleKt$HttpRequestLifecycle$1$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C8140 c8140 = (C8140) this.L$0;
            new C5422(c8140.f22456);
            throw null;
        }
        if (i != 1) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        InterfaceC5439 interfaceC5439 = (InterfaceC5439) this.L$0;
        try {
            AbstractC5185.m10210(obj);
            ((C5451) interfaceC5439).m10555();
            return C5176.f14739;
        } finally {
        }
    }
}
