package io.ktor.client.plugins;

import com.alibaba.fastjson2.C2942;
import io.ktor.client.call.C3868;
import io.ktor.client.plugins.api.AbstractC3883;
import io.ktor.client.plugins.api.AbstractC3887;
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
@InterfaceC6862(c = "io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$1", f = "HttpRedirect.kt", l = {97, 102}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "<anonymous>", "(Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;)Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;"}, k = 3, mv = {2, 0, 0})
final class HttpRedirectKt$HttpRedirect$2$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ boolean $allowHttpsDowngrade;
    final /* synthetic */ boolean $checkHttpMethod;
    final /* synthetic */ AbstractC3887 $this_createClientPlugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRedirectKt$HttpRedirect$2$1(boolean z, boolean z2, AbstractC3887 abstractC3887, InterfaceC4357<? super HttpRedirectKt$HttpRedirect$2$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$checkHttpMethod = z;
        this.$allowHttpsDowngrade = z2;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC3883 abstractC3883, C8140 c8140, InterfaceC4357<? super C3868> interfaceC4357) {
        HttpRedirectKt$HttpRedirect$2$1 httpRedirectKt$HttpRedirect$2$1 = new HttpRedirectKt$HttpRedirect$2$1(this.$checkHttpMethod, this.$allowHttpsDowngrade, null, interfaceC4357);
        httpRedirectKt$HttpRedirect$2$1.L$0 = abstractC3883;
        httpRedirectKt$HttpRedirect$2$1.L$1 = c8140;
        return httpRedirectKt$HttpRedirect$2$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            if (this.L$0 != null) {
                C2942.m6394();
                return null;
            }
            C8140 c8140 = (C8140) this.L$1;
            this.L$0 = null;
            this.L$1 = c8140;
            this.label = 1;
            throw null;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC5185.m10210(obj);
                return obj;
            }
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (this.L$0 != null) {
            C2942.m6394();
            return null;
        }
        AbstractC5185.m10210(obj);
        C3868 c3868 = (C3868) obj;
        if (!this.$checkHttpMethod) {
            throw null;
        }
        int i2 = AbstractC3934.f12151;
        c3868.m8251();
        throw null;
    }
}
