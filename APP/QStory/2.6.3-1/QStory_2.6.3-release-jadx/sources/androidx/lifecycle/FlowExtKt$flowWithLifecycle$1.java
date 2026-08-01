package androidx.lifecycle;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.AbstractC6043;
import kotlinx.coroutines.channels.InterfaceC6028;
import kotlinx.coroutines.flow.InterfaceC6151;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", m556f = "FlowExt.kt", m557l = {92}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"T", "Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class FlowExtKt$flowWithLifecycle$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ AbstractC3235 $lifecycle;
    final /* synthetic */ Lifecycle$State $minActiveState;
    final /* synthetic */ InterfaceC6151 $this_flowWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", m556f = "FlowExt.kt", m557l = {92}, m558m = "invokeSuspend", m559v = 1)
    public static final class C02261 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC6028 $$this$callbackFlow;
        final /* synthetic */ InterfaceC6151 $this_flowWithLifecycle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02261(InterfaceC6151 interfaceC6151, InterfaceC6028 interfaceC6028, InterfaceC5189<? super C02261> interfaceC5189) {
            super(2, interfaceC5189);
            this.$this_flowWithLifecycle = interfaceC6151;
            this.$$this$callbackFlow = interfaceC6028;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C02261(this.$this_flowWithLifecycle, this.$$this$callbackFlow, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C02261) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC6151 interfaceC6151 = this.$this_flowWithLifecycle;
                C3236 c3236 = new C3236(this.$$this$callbackFlow);
                this.label = 1;
                if (interfaceC6151.mo9012(c3236, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$flowWithLifecycle$1(AbstractC3235 abstractC3235, Lifecycle$State lifecycle$State, InterfaceC6151 interfaceC6151, InterfaceC5189<? super FlowExtKt$flowWithLifecycle$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$lifecycle = abstractC3235;
        this.$minActiveState = lifecycle$State;
        this.$this_flowWithLifecycle = interfaceC6151;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, interfaceC5189);
        flowExtKt$flowWithLifecycle$1.L$0 = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6028 interfaceC6028, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((FlowExtKt$flowWithLifecycle$1) create(interfaceC6028, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC6233 interfaceC6233;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6028 interfaceC6028 = (InterfaceC6028) this.L$0;
            AbstractC3235 abstractC3235 = this.$lifecycle;
            Lifecycle$State lifecycle$State = this.$minActiveState;
            C02261 c02261 = new C02261(this.$this_flowWithLifecycle, interfaceC6028, null);
            this.L$0 = interfaceC6028;
            this.label = 1;
            if (AbstractC3268.m5094(abstractC3235, lifecycle$State, c02261, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC6233 = interfaceC6028;
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC6233 = (InterfaceC6028) this.L$0;
            AbstractC6017.m10769(obj);
        }
        ((AbstractC6043) interfaceC6233).mo8994(null);
        return C6008.f15084;
    }
}
