package io.ktor.client.plugins;

import io.ktor.client.plugins.api.C3884;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6552;
import p063.InterfaceC6862;
import p236.AbstractC8115;
import p241.C8140;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.UserAgentKt$UserAgent$2$1", f = "UserAgent.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lio/ktor/client/plugins/api/飘花落叶言子楪世哲兰苏;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "", "<unused var>", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/client/plugins/api/飘花落叶言子楪世哲兰苏;L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;Ljava/lang/Object;)V"}, k = 3, mv = {2, 0, 0})
final class UserAgentKt$UserAgent$2$1 extends SuspendLambda implements InterfaceC6552 {
    final /* synthetic */ String $agent;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAgentKt$UserAgent$2$1(String str, InterfaceC4357<? super UserAgentKt$UserAgent$2$1> interfaceC4357) {
        super(4, interfaceC4357);
        this.$agent = str;
    }

    @Override // p052.InterfaceC6552
    public final Object invoke(C3884 c3884, C8140 c8140, Object obj, InterfaceC4357<? super C5176> interfaceC4357) {
        UserAgentKt$UserAgent$2$1 userAgentKt$UserAgent$2$1 = new UserAgentKt$UserAgent$2$1(this.$agent, interfaceC4357);
        userAgentKt$UserAgent$2$1.L$0 = c8140;
        return userAgentKt$UserAgent$2$1.invokeSuspend(C5176.f14739);
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
        AbstractC3912.f12123.trace("Adding User-Agent header: agent for " + c8140.f22460);
        String[] strArr = AbstractC8115.f22413;
        String str = this.$agent;
        c8140.getClass();
        if (str != null) {
            c8140.f22458.mo2423("User-Agent", str.toString());
        }
        return C5176.f14739;
    }
}
