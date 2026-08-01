package io.ktor.client.plugins;

import com.alibaba.fastjson2.C2941;
import io.ktor.http.content.AbstractC3986;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import p241.C8139;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$1", f = "BodyProgress.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;", "content", "<anonymous>", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;)Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;"}, k = 3, mv = {2, 0, 0})
final class BodyProgressKt$BodyProgress$1$1 extends SuspendLambda implements InterfaceC6550 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public BodyProgressKt$BodyProgress$1$1(InterfaceC4356<? super BodyProgressKt$BodyProgress$1$1> interfaceC4356) {
        super(3, interfaceC4356);
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(C8139 c8139, AbstractC3986 abstractC3986, InterfaceC4356<? super AbstractC3986> interfaceC4356) {
        BodyProgressKt$BodyProgress$1$1 bodyProgressKt$BodyProgress$1$1 = new BodyProgressKt$BodyProgress$1$1(interfaceC4356);
        bodyProgressKt$BodyProgress$1$1.L$0 = c8139;
        bodyProgressKt$BodyProgress$1$1.L$1 = abstractC3986;
        return bodyProgressKt$BodyProgress$1$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        C8139 c8139 = (C8139) this.L$0;
        if (c8139.f22457.m8597(AbstractC3922.f12132) == null) {
            return null;
        }
        C2941.m6336();
        return null;
    }
}
