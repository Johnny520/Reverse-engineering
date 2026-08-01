package io.ktor.client.plugins;

import com.alibaba.fastjson2.C2942;
import io.ktor.client.call.C3868;
import io.ktor.client.plugins.api.AbstractC3883;
import java.util.List;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p241.C8140;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$2", f = "HttpCallValidator.kt", l = {112, 113}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "<anonymous>", "(Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;)Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;"}, k = 3, mv = {2, 0, 0})
final class HttpCallValidatorKt$HttpCallValidator$2$2 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ List<InterfaceC6554> $responseValidators;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HttpCallValidatorKt$HttpCallValidator$2$2(List<? extends InterfaceC6554> list, InterfaceC4357<? super HttpCallValidatorKt$HttpCallValidator$2$2> interfaceC4357) {
        super(3, interfaceC4357);
        this.$responseValidators = list;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC3883 abstractC3883, C8140 c8140, InterfaceC4357<? super C3868> interfaceC4357) {
        HttpCallValidatorKt$HttpCallValidator$2$2 httpCallValidatorKt$HttpCallValidator$2$2 = new HttpCallValidatorKt$HttpCallValidator$2$2(this.$responseValidators, interfaceC4357);
        httpCallValidatorKt$HttpCallValidator$2$2.L$0 = abstractC3883;
        httpCallValidatorKt$HttpCallValidator$2$2.L$1 = c8140;
        return httpCallValidatorKt$HttpCallValidator$2$2.invokeSuspend(C5176.f14739);
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
            this.L$0 = null;
            this.label = 1;
            throw null;
        }
        if (i == 1) {
            AbstractC5185.m10210(obj);
            ((C3868) obj).m8250();
            throw null;
        }
        if (i != 2) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        C3868 c3868 = (C3868) this.L$0;
        AbstractC5185.m10210(obj);
        return c3868;
    }
}
