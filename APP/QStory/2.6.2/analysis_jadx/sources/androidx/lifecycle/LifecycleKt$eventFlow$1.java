package androidx.lifecycle;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractC5204;
import kotlinx.coroutines.channels.AbstractC5210;
import kotlinx.coroutines.channels.InterfaceC5195;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.lifecycle.LifecycleKt$eventFlow$1", f = "Lifecycle.kt", l = {376}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Landroidx/lifecycle/Lifecycle$Event;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class LifecycleKt$eventFlow$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ AbstractC2402 $this_eventFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleKt$eventFlow$1(AbstractC2402 abstractC2402, InterfaceC4356<? super LifecycleKt$eventFlow$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_eventFlow = abstractC2402;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invokeSuspend$lambda$0(InterfaceC5195 interfaceC5195, InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
        ((AbstractC5210) interfaceC5195).mo8445(lifecycle$Event);
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            ((AbstractC5210) interfaceC5195).mo8446(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$1(AbstractC2402 abstractC2402, InterfaceC2380 interfaceC2380) {
        abstractC2402.mo4492(interfaceC2380);
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        LifecycleKt$eventFlow$1 lifecycleKt$eventFlow$1 = new LifecycleKt$eventFlow$1(this.$this_eventFlow, interfaceC4356);
        lifecycleKt$eventFlow$1.L$0 = obj;
        return lifecycleKt$eventFlow$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5195 interfaceC5195, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((LifecycleKt$eventFlow$1) create(interfaceC5195, interfaceC4356)).invokeSuspend(C5175.f14739);
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
            AbstractC5184.m10206(obj);
            final InterfaceC5195 interfaceC5195 = (InterfaceC5195) this.L$0;
            final ?? r1 = new InterfaceC2380() { // from class: androidx.lifecycle.飘花落叶言子世楪兰哲苏
                @Override // androidx.lifecycle.InterfaceC2380
                /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
                public final void mo18(InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event) {
                    LifecycleKt$eventFlow$1.invokeSuspend$lambda$0(interfaceC5195, interfaceC2388, lifecycle$Event);
                }
            };
            this.$this_eventFlow.mo4493(r1);
            final AbstractC2402 abstractC2402 = this.$this_eventFlow;
            InterfaceC6542 interfaceC6542 = new InterfaceC6542() { // from class: androidx.lifecycle.飘花落叶言子世苏楪哲兰
                @Override // p052.InterfaceC6542
                public final Object invoke() {
                    return LifecycleKt$eventFlow$1.invokeSuspend$lambda$1(abstractC2402, r1);
                }
            };
            this.label = 1;
            if (AbstractC5204.m10275(interfaceC5195, interfaceC6542, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
