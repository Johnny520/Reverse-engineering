package io.ktor.client.plugins;

import com.alibaba.fastjson2.C2941;
import io.ktor.client.call.C3867;
import io.ktor.client.plugins.api.AbstractC3882;
import java.util.List;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p241.C8139;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$2", f = "HttpCallValidator.kt", l = {112, 113}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "<anonymous>", "(Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;)Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;"}, k = 3, mv = {2, 0, 0})
final class HttpCallValidatorKt$HttpCallValidator$2$2 extends SuspendLambda implements InterfaceC6550 {
    final /* synthetic */ List<InterfaceC6553> $responseValidators;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HttpCallValidatorKt$HttpCallValidator$2$2(List<? extends InterfaceC6553> list, InterfaceC4356<? super HttpCallValidatorKt$HttpCallValidator$2$2> interfaceC4356) {
        super(3, interfaceC4356);
        this.$responseValidators = list;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC3882 abstractC3882, C8139 c8139, InterfaceC4356<? super C3867> interfaceC4356) {
        HttpCallValidatorKt$HttpCallValidator$2$2 httpCallValidatorKt$HttpCallValidator$2$2 = new HttpCallValidatorKt$HttpCallValidator$2$2(this.$responseValidators, interfaceC4356);
        httpCallValidatorKt$HttpCallValidator$2$2.L$0 = abstractC3882;
        httpCallValidatorKt$HttpCallValidator$2$2.L$1 = c8139;
        return httpCallValidatorKt$HttpCallValidator$2$2.invokeSuspend(C5175.f14739);
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
            this.L$0 = null;
            this.label = 1;
            throw null;
        }
        if (i == 1) {
            AbstractC5184.m10206(obj);
            ((C3867) obj).m8263();
            throw null;
        }
        if (i != 2) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        C3867 c3867 = (C3867) this.L$0;
        AbstractC5184.m10206(obj);
        return c3867;
    }
}
