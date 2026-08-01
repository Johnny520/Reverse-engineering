package io.ktor.client.plugins;

import com.alibaba.fastjson2.C2942;
import io.ktor.http.content.AbstractC3987;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import p241.C8140;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.BodyProgressKt$BodyProgress$1$1", f = "BodyProgress.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;", "content", "<anonymous>", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;)Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;"}, k = 3, mv = {2, 0, 0})
final class BodyProgressKt$BodyProgress$1$1 extends SuspendLambda implements InterfaceC6551 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public BodyProgressKt$BodyProgress$1$1(InterfaceC4357<? super BodyProgressKt$BodyProgress$1$1> interfaceC4357) {
        super(3, interfaceC4357);
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(C8140 c8140, AbstractC3987 abstractC3987, InterfaceC4357<? super AbstractC3987> interfaceC4357) {
        BodyProgressKt$BodyProgress$1$1 bodyProgressKt$BodyProgress$1$1 = new BodyProgressKt$BodyProgress$1$1(interfaceC4357);
        bodyProgressKt$BodyProgress$1$1.L$0 = c8140;
        bodyProgressKt$BodyProgress$1$1.L$1 = abstractC3987;
        return bodyProgressKt$BodyProgress$1$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        C8140 c8140 = (C8140) this.L$0;
        if (c8140.f22455.m8587(AbstractC3923.f12137) == null) {
            return null;
        }
        C2942.m6394();
        return null;
    }
}
