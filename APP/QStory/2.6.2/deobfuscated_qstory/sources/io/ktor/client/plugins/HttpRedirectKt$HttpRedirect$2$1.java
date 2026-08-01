package io.ktor.client.plugins;

import com.alibaba.fastjson2.C2941;
import io.ktor.client.call.C3867;
import io.ktor.client.plugins.api.AbstractC3882;
import io.ktor.client.plugins.api.AbstractC3886;
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
@InterfaceC6861(c = "io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$1", f = "HttpRedirect.kt", l = {97, 102}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "<anonymous>", "(Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;)Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;"}, k = 3, mv = {2, 0, 0})
final class HttpRedirectKt$HttpRedirect$2$1 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ boolean $allowHttpsDowngrade;
    final /* synthetic */ boolean $checkHttpMethod;
    final /* synthetic */ AbstractC3886 $this_createClientPlugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRedirectKt$HttpRedirect$2$1(boolean z, boolean z2, AbstractC3886 abstractC3886, InterfaceC4356<? super HttpRedirectKt$HttpRedirect$2$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.$checkHttpMethod = z;
        this.$allowHttpsDowngrade = z2;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC3882 abstractC3882, C8139 c8139, InterfaceC4356<? super C3867> interfaceC4356) {
        HttpRedirectKt$HttpRedirect$2$1 httpRedirectKt$HttpRedirect$2$1 = new HttpRedirectKt$HttpRedirect$2$1(this.$checkHttpMethod, this.$allowHttpsDowngrade, null, interfaceC4356);
        httpRedirectKt$HttpRedirect$2$1.L$0 = abstractC3882;
        httpRedirectKt$HttpRedirect$2$1.L$1 = c8139;
        return httpRedirectKt$HttpRedirect$2$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            if (this.L$0 != null) {
                C2941.m6336();
                return null;
            }
            C8139 c8139 = (C8139) this.L$1;
            this.L$0 = null;
            this.L$1 = c8139;
            this.label = 1;
            throw null;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC5184.m10206(obj);
                return obj;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (this.L$0 != null) {
            C2941.m6336();
            return null;
        }
        AbstractC5184.m10206(obj);
        C3867 c3867 = (C3867) obj;
        if (!this.$checkHttpMethod) {
            throw null;
        }
        int i2 = AbstractC3933.f12147;
        c3867.m8264();
        throw null;
    }
}
