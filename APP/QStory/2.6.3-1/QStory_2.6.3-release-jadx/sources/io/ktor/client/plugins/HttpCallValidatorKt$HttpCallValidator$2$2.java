package io.ktor.client.plugins;

import com.alibaba.fastjson2.C3775;
import io.ktor.client.call.C4700;
import io.ktor.client.plugins.api.AbstractC4715;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p257.C8969;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$2", m556f = "HttpCallValidator.kt", m557l = {112, 113}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "<anonymous>", "(Lio/ktor/client/plugins/api/飘花落叶言子楪世兰苏哲;L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;)Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;"}, m152k = 3, m153mv = {2, 0, 0})
final class HttpCallValidatorKt$HttpCallValidator$2$2 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ List<InterfaceC7383> $responseValidators;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HttpCallValidatorKt$HttpCallValidator$2$2(List<? extends InterfaceC7383> list, InterfaceC5189<? super HttpCallValidatorKt$HttpCallValidator$2$2> interfaceC5189) {
        super(3, interfaceC5189);
        this.$responseValidators = list;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC4715 abstractC4715, C8969 c8969, InterfaceC5189<? super C4700> interfaceC5189) {
        HttpCallValidatorKt$HttpCallValidator$2$2 httpCallValidatorKt$HttpCallValidator$2$2 = new HttpCallValidatorKt$HttpCallValidator$2$2(this.$responseValidators, interfaceC5189);
        httpCallValidatorKt$HttpCallValidator$2$2.L$0 = abstractC4715;
        httpCallValidatorKt$HttpCallValidator$2$2.L$1 = c8969;
        return httpCallValidatorKt$HttpCallValidator$2$2.invokeSuspend(C6008.f15084);
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
            this.L$0 = null;
            this.label = 1;
            throw null;
        }
        if (i == 1) {
            AbstractC6017.m10769(obj);
            ((C4700) obj).m8809();
            throw null;
        }
        if (i != 2) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        C4700 c4700 = (C4700) this.L$0;
        AbstractC6017.m10769(obj);
        return c4700;
    }
}
