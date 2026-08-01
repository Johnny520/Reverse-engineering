package io.ktor.client.plugins.api;

import io.ktor.client.call.C4700;
import io.ktor.client.statement.C4777;
import io.ktor.http.content.C4824;
import io.ktor.util.pipeline.AbstractC5026;
import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lin.xposed.hook.javaplugin.C6385;
import p068.InterfaceC7374;
import p068.InterfaceC7380;
import p075.C7686;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.api.TransformResponseBodyHook$install$1", m556f = "KtorCallContexts.kt", m557l = {104, 111}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "Lio/ktor/client/statement/飘花落叶言子楪世苏兰哲;", "Lio/ktor/client/call/飘花落叶言子楪世苏哲兰;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Lio/ktor/client/statement/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class TransformResponseBodyHook$install$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC7374 $handler;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformResponseBodyHook$install$1(InterfaceC7374 interfaceC7374, InterfaceC5189<? super TransformResponseBodyHook$install$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$handler = interfaceC7374;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, C4777 c4777, InterfaceC5189<? super C6008> interfaceC5189) {
        TransformResponseBodyHook$install$1 transformResponseBodyHook$install$1 = new TransformResponseBodyHook$install$1(this.$handler, interfaceC5189);
        transformResponseBodyHook$install$1.L$0 = abstractC5026;
        return transformResponseBodyHook$install$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            AbstractC5026 abstractC5026 = (AbstractC5026) this.L$0;
            C4777 c4777 = (C4777) abstractC5026.mo9126();
            C7686 c7686 = c4777.f12503;
            if (c4777.f12502 instanceof InterfaceC5084) {
                ((C4700) abstractC5026.f13009).m8809();
                throw null;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    AbstractC6017.m10769(obj);
                    return c6008;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C7686 c76862 = (C7686) this.L$1;
            AbstractC5026 abstractC50262 = (AbstractC5026) this.L$0;
            AbstractC6017.m10769(obj);
            if (obj != null) {
                if (!(obj instanceof C4824) && !c76862.f18643.isInstance(obj)) {
                    C6385.m11446("transformResponseBody returned ", obj, " but expected value of type ", c76862);
                    return null;
                }
                C4777 c47772 = new C4777(c76862, obj);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (abstractC50262.mo9129(c47772, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return c6008;
    }
}
