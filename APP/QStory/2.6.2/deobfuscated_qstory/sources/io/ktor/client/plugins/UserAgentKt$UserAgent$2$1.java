package io.ktor.client.plugins;

import io.ktor.client.plugins.api.C3883;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p063.InterfaceC6861;
import p236.AbstractC8114;
import p241.C8139;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.UserAgentKt$UserAgent$2$1", f = "UserAgent.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lio/ktor/client/plugins/api/飘花落叶言子楪世哲兰苏;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "", "<unused var>", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/client/plugins/api/飘花落叶言子楪世哲兰苏;L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class UserAgentKt$UserAgent$2$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ String $agent;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAgentKt$UserAgent$2$1(String str, InterfaceC4356<? super UserAgentKt$UserAgent$2$1> interfaceC4356) {
        super(4, interfaceC4356);
        this.$agent = str;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(C3883 c3883, C8139 c8139, Object obj, InterfaceC4356<? super C5175> interfaceC4356) {
        UserAgentKt$UserAgent$2$1 userAgentKt$UserAgent$2$1 = new UserAgentKt$UserAgent$2$1(this.$agent, interfaceC4356);
        userAgentKt$UserAgent$2$1.L$0 = c8139;
        return userAgentKt$UserAgent$2$1.invokeSuspend(C5175.f14739);
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
        AbstractC3911.f12118.trace("Adding User-Agent header: agent for " + c8139.f22462);
        String[] strArr = AbstractC8114.f22415;
        String str = this.$agent;
        c8139.getClass();
        if (str != null) {
            c8139.f22460.mo2413("User-Agent", str.toString());
        }
        return C5175.f14739;
    }
}
