package androidx.lifecycle;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5458;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.channels.AbstractC5210;
import kotlinx.coroutines.channels.InterfaceC5195;
import kotlinx.coroutines.internal.AbstractC5364;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p093.C7200;
import p095.C7206;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", l = {105, 106, 108}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class FlowLiveDataConversions$asFlow$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ AbstractC2375 $this_asFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6861(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC2370 $observer;
        final /* synthetic */ AbstractC2375 $this_asFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC2375 abstractC2375, InterfaceC2370 interfaceC2370, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$this_asFlow = abstractC2375;
            this.$observer = interfaceC2370;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(this.$this_asFlow, this.$observer, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            this.$this_asFlow.m4483(this.$observer);
            return C5175.f14739;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6861(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC2370 $observer;
        final /* synthetic */ AbstractC2375 $this_asFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbstractC2375 abstractC2375, InterfaceC2370 interfaceC2370, InterfaceC4356<? super AnonymousClass2> interfaceC4356) {
            super(2, interfaceC4356);
            this.$this_asFlow = abstractC2375;
            this.$observer = interfaceC2370;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass2(this.$this_asFlow, this.$observer, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            AbstractC2375 abstractC2375 = this.$this_asFlow;
            InterfaceC2370 interfaceC2370 = this.$observer;
            abstractC2375.getClass();
            AbstractC2375.m4482("removeObserver");
            C2376 c2376 = (C2376) abstractC2375.f7002.mo13087(interfaceC2370);
            if (c2376 != null) {
                c2376.m4485(false);
            }
            return C5175.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asFlow$1(AbstractC2375 abstractC2375, InterfaceC4356<? super FlowLiveDataConversions$asFlow$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_asFlow = abstractC2375;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invokeSuspend$lambda$0(InterfaceC5195 interfaceC5195, Object obj) {
        ((AbstractC5210) interfaceC5195).mo8445(obj);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        FlowLiveDataConversions$asFlow$1 flowLiveDataConversions$asFlow$1 = new FlowLiveDataConversions$asFlow$1(this.$this_asFlow, interfaceC4356);
        flowLiveDataConversions$asFlow$1.L$0 = obj;
        return flowLiveDataConversions$asFlow$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5195 interfaceC5195, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((FlowLiveDataConversions$asFlow$1) create(interfaceC5195, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.飘花落叶言子世兰楪苏哲] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC2370 interfaceC2370;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
        } catch (Throwable th) {
            C7206 c7206 = AbstractC5394.f15030;
            InterfaceC4359 interfaceC4359Plus = AbstractC5364.f14960.f19218.plus(C5458.f15108);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_asFlow, r1, null);
            this.L$0 = th;
            this.label = 3;
            if (AbstractC5398.m10466(interfaceC4359Plus, anonymousClass2, this) != coroutineSingletons) {
                throw th;
            }
        }
        if (r1 == 0) {
            AbstractC5184.m10206(obj);
            final InterfaceC5195 interfaceC5195 = (InterfaceC5195) this.L$0;
            InterfaceC2370 interfaceC23702 = new InterfaceC2370() { // from class: androidx.lifecycle.飘花落叶言子楪哲苏世兰
                @Override // androidx.lifecycle.InterfaceC2370
                /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
                public final void mo4454(Object obj2) {
                    FlowLiveDataConversions$asFlow$1.invokeSuspend$lambda$0(interfaceC5195, obj2);
                }
            };
            C7206 c72062 = AbstractC5394.f15030;
            C7200 c7200 = AbstractC5364.f14960.f19218;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_asFlow, interfaceC23702, null);
            this.L$0 = interfaceC23702;
            this.label = 1;
            interfaceC2370 = interfaceC23702;
            if (AbstractC5398.m10466(c7200, anonymousClass1, this) == coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (r1 != 1) {
            if (r1 == 2) {
                InterfaceC2370 interfaceC23703 = (InterfaceC2370) this.L$0;
                AbstractC5184.m10206(obj);
                r1 = interfaceC23703;
                throw new KotlinNothingValueException();
            }
            if (r1 != 3) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Throwable th2 = (Throwable) this.L$0;
            AbstractC5184.m10206(obj);
            throw th2;
        }
        InterfaceC2370 interfaceC23704 = (InterfaceC2370) this.L$0;
        AbstractC5184.m10206(obj);
        interfaceC2370 = interfaceC23704;
        this.L$0 = interfaceC2370;
        this.label = 2;
        r1 = interfaceC2370;
        if (AbstractC5398.m10500(this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        throw new KotlinNothingValueException();
    }
}
