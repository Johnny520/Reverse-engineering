package io.ktor.client.plugins;

import io.ktor.client.plugins.api.C4716;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7381;
import p079.InterfaceC7691;
import p252.AbstractC8944;
import p257.C8969;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.UserAgentKt$UserAgent$2$1", m556f = "UserAgent.kt", m557l = {}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m151d2 = {"Lio/ktor/client/plugins/api/飘花落叶言子楪世哲兰苏;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "", "<unused var>", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/client/plugins/api/飘花落叶言子楪世哲兰苏;L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;Ljava/lang/Object;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class UserAgentKt$UserAgent$2$1 extends SuspendLambda implements InterfaceC7381 {
    final /* synthetic */ String $agent;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserAgentKt$UserAgent$2$1(String str, InterfaceC5189<? super UserAgentKt$UserAgent$2$1> interfaceC5189) {
        super(4, interfaceC5189);
        this.$agent = str;
    }

    @Override // p068.InterfaceC7381
    public final Object invoke(C4716 c4716, C8969 c8969, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        UserAgentKt$UserAgent$2$1 userAgentKt$UserAgent$2$1 = new UserAgentKt$UserAgent$2$1(this.$agent, interfaceC5189);
        userAgentKt$UserAgent$2$1.L$0 = c8969;
        return userAgentKt$UserAgent$2$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C8969 c8969 = (C8969) this.L$0;
        AbstractC4744.f12468.trace("Adding User-Agent header: agent for " + c8969.f22805);
        String[] strArr = AbstractC8944.f22758;
        String str = this.$agent;
        c8969.getClass();
        if (str != null) {
            c8969.f22803.mo2983("User-Agent", str.toString());
        }
        return C6008.f15084;
    }
}
