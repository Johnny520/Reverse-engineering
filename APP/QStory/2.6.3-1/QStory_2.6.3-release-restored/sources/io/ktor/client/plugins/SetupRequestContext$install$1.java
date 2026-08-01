package io.ktor.client.plugins;

import io.ktor.util.pipeline.AbstractC5026;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import p068.InterfaceC7380;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.SetupRequestContext$install$1", m556f = "HttpRequestLifecycle.kt", m557l = {40}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m151d2 = {"Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;", "", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/util/pipeline/飘花落叶言子楪世哲兰苏;Ljava/lang/Object;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class SetupRequestContext$install$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC7380 $handler;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: io.ktor.client.plugins.SetupRequestContext$install$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
    public /* synthetic */ class C03611 extends AdaptedFunctionReference implements InterfaceC7387 {
        public C03611(Object obj) {
            super(1, obj, AbstractC5026.class, "proceed", "proceed(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 8);
        }

        @Override // p068.InterfaceC7387
        public final Object invoke(InterfaceC5189<? super C6008> interfaceC5189) {
            return SetupRequestContext$install$1.invokeSuspend$proceed((AbstractC5026) this.receiver, interfaceC5189);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupRequestContext$install$1(InterfaceC7380 interfaceC7380, InterfaceC5189<? super SetupRequestContext$install$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$handler = interfaceC7380;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object invokeSuspend$proceed(AbstractC5026 abstractC5026, InterfaceC5189 interfaceC5189) {
        Object objMo9125 = abstractC5026.mo9125(interfaceC5189);
        return objMo9125 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9125 : C6008.f15084;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC5026 abstractC5026, Object obj, InterfaceC5189<? super C6008> interfaceC5189) {
        SetupRequestContext$install$1 setupRequestContext$install$1 = new SetupRequestContext$install$1(this.$handler, interfaceC5189);
        setupRequestContext$install$1.L$0 = abstractC5026;
        return setupRequestContext$install$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            AbstractC5026 abstractC5026 = (AbstractC5026) this.L$0;
            InterfaceC7380 interfaceC7380 = this.$handler;
            Object obj2 = abstractC5026.f13009;
            C03611 c03611 = new C03611(abstractC5026);
            this.label = 1;
            if (interfaceC7380.invoke(obj2, c03611, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
