package io.ktor.client.plugins;

import io.ktor.client.plugins.api.AbstractC3886;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C5421;
import kotlinx.coroutines.C5450;
import kotlinx.coroutines.InterfaceC5438;
import p052.InterfaceC6550;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import p241.C8139;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.HttpRequestLifecycleKt$HttpRequestLifecycle$1$1", f = "HttpRequestLifecycle.kt", l = {27}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lkotlin/Function1;", "Lkotlin/coroutines/飘花落叶言子楪世哲苏兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "", "proceed", "<anonymous>", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V"}, k = 3, mv = {2, 0, 0})
final class HttpRequestLifecycleKt$HttpRequestLifecycle$1$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ AbstractC3886 $this_createClientPlugin;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public HttpRequestLifecycleKt$HttpRequestLifecycle$1$1(AbstractC3886 abstractC3886, InterfaceC4356<? super HttpRequestLifecycleKt$HttpRequestLifecycle$1$1> interfaceC4356) {
        super(3, interfaceC4356);
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(C8139 c8139, InterfaceC6557 interfaceC6557, InterfaceC4356<? super C5175> interfaceC4356) {
        HttpRequestLifecycleKt$HttpRequestLifecycle$1$1 httpRequestLifecycleKt$HttpRequestLifecycle$1$1 = new HttpRequestLifecycleKt$HttpRequestLifecycle$1$1(null, interfaceC4356);
        httpRequestLifecycleKt$HttpRequestLifecycle$1$1.L$0 = c8139;
        httpRequestLifecycleKt$HttpRequestLifecycle$1$1.L$1 = interfaceC6557;
        return httpRequestLifecycleKt$HttpRequestLifecycle$1$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C8139 c8139 = (C8139) this.L$0;
            new C5421(c8139.f22458);
            throw null;
        }
        if (i != 1) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        InterfaceC5438 interfaceC5438 = (InterfaceC5438) this.L$0;
        try {
            AbstractC5184.m10206(obj);
            ((C5450) interfaceC5438).m10551();
            return C5175.f14739;
        } finally {
        }
    }
}
