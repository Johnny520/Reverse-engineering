package androidx.lifecycle;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6291;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.AbstractC6043;
import kotlinx.coroutines.channels.InterfaceC6028;
import kotlinx.coroutines.internal.AbstractC6197;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p109.C8030;
import p111.C8036;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", m556f = "FlowLiveData.kt", m557l = {105, 106, 108}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"T", "Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class FlowLiveDataConversions$asFlow$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ AbstractC3208 $this_asFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", m556f = "FlowLiveData.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
    public static final class C02271 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC3203 $observer;
        final /* synthetic */ AbstractC3208 $this_asFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02271(AbstractC3208 abstractC3208, InterfaceC3203 interfaceC3203, InterfaceC5189<? super C02271> interfaceC5189) {
            super(2, interfaceC5189);
            this.$this_asFlow = abstractC3208;
            this.$observer = interfaceC3203;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C02271(this.$this_asFlow, this.$observer, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C02271) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            this.$this_asFlow.m5053(this.$observer);
            return C6008.f15084;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", m556f = "FlowLiveData.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
    public static final class C02282 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC3203 $observer;
        final /* synthetic */ AbstractC3208 $this_asFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02282(AbstractC3208 abstractC3208, InterfaceC3203 interfaceC3203, InterfaceC5189<? super C02282> interfaceC5189) {
            super(2, interfaceC5189);
            this.$this_asFlow = abstractC3208;
            this.$observer = interfaceC3203;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C02282(this.$this_asFlow, this.$observer, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C02282) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            AbstractC3208 abstractC3208 = this.$this_asFlow;
            InterfaceC3203 interfaceC3203 = this.$observer;
            abstractC3208.getClass();
            AbstractC3208.m5052("removeObserver");
            C3209 c3209 = (C3209) abstractC3208.f7348.mo13674(interfaceC3203);
            if (c3209 != null) {
                c3209.m5055(false);
            }
            return C6008.f15084;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asFlow$1(AbstractC3208 abstractC3208, InterfaceC5189<? super FlowLiveDataConversions$asFlow$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_asFlow = abstractC3208;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invokeSuspend$lambda$0(InterfaceC6028 interfaceC6028, Object obj) {
        ((AbstractC6043) interfaceC6028).mo8995(obj);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        FlowLiveDataConversions$asFlow$1 flowLiveDataConversions$asFlow$1 = new FlowLiveDataConversions$asFlow$1(this.$this_asFlow, interfaceC5189);
        flowLiveDataConversions$asFlow$1.L$0 = obj;
        return flowLiveDataConversions$asFlow$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6028 interfaceC6028, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((FlowLiveDataConversions$asFlow$1) create(interfaceC6028, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.飘花落叶言子世兰楪苏哲] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC3203 interfaceC3203;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
        } catch (Throwable th) {
            C8036 c8036 = AbstractC6227.f15375;
            InterfaceC5192 interfaceC5192Plus = AbstractC6197.f15305.f19558.plus(C6291.f15453);
            C02282 c02282 = new C02282(this.$this_asFlow, r1, null);
            this.L$0 = th;
            this.label = 3;
            if (AbstractC6231.m11029(interfaceC5192Plus, c02282, this) != coroutineSingletons) {
                throw th;
            }
        }
        if (r1 == 0) {
            AbstractC6017.m10769(obj);
            final InterfaceC6028 interfaceC6028 = (InterfaceC6028) this.L$0;
            InterfaceC3203 interfaceC32032 = new InterfaceC3203() { // from class: androidx.lifecycle.飘花落叶言子楪哲苏世兰
                @Override // androidx.lifecycle.InterfaceC3203
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo5024(Object obj2) {
                    FlowLiveDataConversions$asFlow$1.invokeSuspend$lambda$0(interfaceC6028, obj2);
                }
            };
            C8036 c80362 = AbstractC6227.f15375;
            C8030 c8030 = AbstractC6197.f15305.f19558;
            C02271 c02271 = new C02271(this.$this_asFlow, interfaceC32032, null);
            this.L$0 = interfaceC32032;
            this.label = 1;
            interfaceC3203 = interfaceC32032;
            if (AbstractC6231.m11029(c8030, c02271, this) == coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (r1 != 1) {
            if (r1 == 2) {
                InterfaceC3203 interfaceC32033 = (InterfaceC3203) this.L$0;
                AbstractC6017.m10769(obj);
                r1 = interfaceC32033;
                throw new KotlinNothingValueException();
            }
            if (r1 != 3) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Throwable th2 = (Throwable) this.L$0;
            AbstractC6017.m10769(obj);
            throw th2;
        }
        InterfaceC3203 interfaceC32034 = (InterfaceC3203) this.L$0;
        AbstractC6017.m10769(obj);
        interfaceC3203 = interfaceC32034;
        this.L$0 = interfaceC3203;
        this.label = 2;
        r1 = interfaceC3203;
        if (AbstractC6231.m11063(this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        throw new KotlinNothingValueException();
    }
}
