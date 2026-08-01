package io.ktor.client.plugins;

import com.alibaba.fastjson2.C3775;
import io.ktor.client.call.C4700;
import io.ktor.client.plugins.api.AbstractC4715;
import io.ktor.client.plugins.api.AbstractC4719;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import p257.C8969;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$1", m556f = "HttpRedirect.kt", m557l = {97, 102}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "<anonymous>", "(Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;)Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;"}, m152k = 3, m153mv = {2, 0, 0})
final class HttpRedirectKt$HttpRedirect$2$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ boolean $allowHttpsDowngrade;
    final /* synthetic */ boolean $checkHttpMethod;
    final /* synthetic */ AbstractC4719 $this_createClientPlugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpRedirectKt$HttpRedirect$2$1(boolean z, boolean z2, AbstractC4719 abstractC4719, InterfaceC5189<? super HttpRedirectKt$HttpRedirect$2$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$checkHttpMethod = z;
        this.$allowHttpsDowngrade = z2;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC4715 abstractC4715, C8969 c8969, InterfaceC5189<? super C4700> interfaceC5189) {
        HttpRedirectKt$HttpRedirect$2$1 httpRedirectKt$HttpRedirect$2$1 = new HttpRedirectKt$HttpRedirect$2$1(this.$checkHttpMethod, this.$allowHttpsDowngrade, null, interfaceC5189);
        httpRedirectKt$HttpRedirect$2$1.L$0 = abstractC4715;
        httpRedirectKt$HttpRedirect$2$1.L$1 = c8969;
        return httpRedirectKt$HttpRedirect$2$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            if (this.L$0 != null) {
                C3775.m6954();
                return null;
            }
            C8969 c8969 = (C8969) this.L$1;
            this.L$0 = null;
            this.L$1 = c8969;
            this.label = 1;
            throw null;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC6017.m10769(obj);
                return obj;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (this.L$0 != null) {
            C3775.m6954();
            return null;
        }
        AbstractC6017.m10769(obj);
        C4700 c4700 = (C4700) obj;
        if (!this.$checkHttpMethod) {
            throw null;
        }
        int i2 = AbstractC4766.f12496;
        c4700.m8810();
        throw null;
    }
}
