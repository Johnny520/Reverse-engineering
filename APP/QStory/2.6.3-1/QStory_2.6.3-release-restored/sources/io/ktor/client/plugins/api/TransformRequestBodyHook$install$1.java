package io.ktor.client.plugins.api;

import io.ktor.http.content.AbstractC4819;
import io.ktor.util.pipeline.AbstractC5026;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7374;
import p068.InterfaceC7380;
import p075.C7686;
import p079.InterfaceC7691;
import p257.AbstractC8965;
import p257.C8969;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.api.TransformRequestBodyHook$install$1", m556f = "KtorCallContexts.kt", m557l = {78, 79}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class TransformRequestBodyHook$install$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC7374 $handler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformRequestBodyHook$install$1(InterfaceC7374 interfaceC7374, InterfaceC5189<? super TransformRequestBodyHook$install$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$handler = interfaceC7374;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        TransformRequestBodyHook$install$1 transformRequestBodyHook$install$1 = new TransformRequestBodyHook$install$1(this.$handler, interfaceC5189);
        transformRequestBodyHook$install$1.L$0 = abstractC5026;
        return transformRequestBodyHook$install$1.invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (r1.mo9129(r12, r10) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC5026 abstractC5026;
        TransformRequestBodyHook$install$1 transformRequestBodyHook$install$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            abstractC5026 = (AbstractC5026) this.L$0;
            InterfaceC7374 interfaceC7374 = this.$handler;
            C4718 c4718 = new C4718(21);
            Object obj2 = abstractC5026.f13009;
            Object objMo9126 = abstractC5026.mo9126();
            C7686 c7686 = (C7686) ((C8969) abstractC5026.f13009).f22800.m9146(AbstractC8965.f22790);
            this.L$0 = abstractC5026;
            this.label = 1;
            transformRequestBodyHook$install$1 = this;
            obj = interfaceC7374.invoke(c4718, obj2, objMo9126, c7686, transformRequestBodyHook$install$1);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        abstractC5026 = (AbstractC5026) this.L$0;
        AbstractC6017.m10769(obj);
        transformRequestBodyHook$install$1 = this;
        AbstractC4819 abstractC4819 = (AbstractC4819) obj;
        if (abstractC4819 != null) {
            transformRequestBodyHook$install$1.L$0 = null;
            transformRequestBodyHook$install$1.label = 2;
        }
        return C6008.f15084;
    }
}
