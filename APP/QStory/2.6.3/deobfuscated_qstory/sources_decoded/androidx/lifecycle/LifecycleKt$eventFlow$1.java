package androidx.lifecycle;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractC5205;
import kotlinx.coroutines.channels.AbstractC5211;
import kotlinx.coroutines.channels.InterfaceC5196;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.lifecycle.LifecycleKt$eventFlow$1", f = "Lifecycle.kt", l = {376}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Landroidx/lifecycle/Lifecycle$Event;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class LifecycleKt$eventFlow$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ AbstractC2402 $this_eventFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleKt$eventFlow$1(AbstractC2402 abstractC2402, InterfaceC4357<? super LifecycleKt$eventFlow$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_eventFlow = abstractC2402;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invokeSuspend$lambda$0(InterfaceC5196 interfaceC5196, InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
        ((AbstractC5211) interfaceC5196).mo8436(lifecycle$Event);
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            ((AbstractC5211) interfaceC5196).mo8435(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$1(AbstractC2402 abstractC2402, InterfaceC2380 interfaceC2380) {
        abstractC2402.mo4502(interfaceC2380);
        return C5176.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        LifecycleKt$eventFlow$1 lifecycleKt$eventFlow$1 = new LifecycleKt$eventFlow$1(this.$this_eventFlow, interfaceC4357);
        lifecycleKt$eventFlow$1.L$0 = obj;
        return lifecycleKt$eventFlow$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5196 interfaceC5196, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((LifecycleKt$eventFlow$1) create(interfaceC5196, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.飘花落叶言子世楪兰哲苏, androidx.lifecycle.飘花落叶言子世苏楪兰哲] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            final InterfaceC5196 interfaceC5196 = (InterfaceC5196) this.L$0;
            final ?? r1 = new InterfaceC2380() { // from class: androidx.lifecycle.飘花落叶言子世楪兰哲苏
                @Override // androidx.lifecycle.InterfaceC2380
                /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
                public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
                    LifecycleKt$eventFlow$1.invokeSuspend$lambda$0(interfaceC5196, interfaceC2388, lifecycle$Event);
                }
            };
            this.$this_eventFlow.mo4503(r1);
            final AbstractC2402 abstractC2402 = this.$this_eventFlow;
            InterfaceC6543 interfaceC6543 = new InterfaceC6543() { // from class: androidx.lifecycle.飘花落叶言子世苏楪哲兰
                @Override // p052.InterfaceC6543
                public final Object invoke() {
                    return LifecycleKt$eventFlow$1.invokeSuspend$lambda$1(abstractC2402, r1);
                }
            };
            this.label = 1;
            if (AbstractC5205.m10279(interfaceC5196, interfaceC6543, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
