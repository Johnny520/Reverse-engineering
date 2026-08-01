package androidx.lifecycle;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractC6037;
import kotlinx.coroutines.channels.AbstractC6043;
import kotlinx.coroutines.channels.InterfaceC6028;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.lifecycle.LifecycleKt$eventFlow$1", m556f = "Lifecycle.kt", m557l = {376}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "Landroidx/lifecycle/Lifecycle$Event;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class LifecycleKt$eventFlow$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ AbstractC3235 $this_eventFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleKt$eventFlow$1(AbstractC3235 abstractC3235, InterfaceC5189<? super LifecycleKt$eventFlow$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_eventFlow = abstractC3235;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void invokeSuspend$lambda$0(InterfaceC6028 interfaceC6028, InterfaceC3221 interfaceC3221, Lifecycle$Event lifecycle$Event) {
        ((AbstractC6043) interfaceC6028).mo8995(lifecycle$Event);
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            ((AbstractC6043) interfaceC6028).mo8994(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$1(AbstractC3235 abstractC3235, InterfaceC3213 interfaceC3213) {
        abstractC3235.mo5062(interfaceC3213);
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        LifecycleKt$eventFlow$1 lifecycleKt$eventFlow$1 = new LifecycleKt$eventFlow$1(this.$this_eventFlow, interfaceC5189);
        lifecycleKt$eventFlow$1.L$0 = obj;
        return lifecycleKt$eventFlow$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6028 interfaceC6028, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((LifecycleKt$eventFlow$1) create(interfaceC6028, interfaceC5189)).invokeSuspend(C6008.f15084);
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
            AbstractC6017.m10769(obj);
            final InterfaceC6028 interfaceC6028 = (InterfaceC6028) this.L$0;
            final ?? r1 = new InterfaceC3213() { // from class: androidx.lifecycle.飘花落叶言子世楪兰哲苏
                @Override // androidx.lifecycle.InterfaceC3213
                /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
                public final void mo578(InterfaceC3221 interfaceC3221, Lifecycle$Event lifecycle$Event) {
                    LifecycleKt$eventFlow$1.invokeSuspend$lambda$0(interfaceC6028, interfaceC3221, lifecycle$Event);
                }
            };
            this.$this_eventFlow.mo5063(r1);
            final AbstractC3235 abstractC3235 = this.$this_eventFlow;
            InterfaceC7372 interfaceC7372 = new InterfaceC7372() { // from class: androidx.lifecycle.飘花落叶言子世苏楪哲兰
                @Override // p068.InterfaceC7372
                public final Object invoke() {
                    return LifecycleKt$eventFlow$1.invokeSuspend$lambda$1(abstractC3235, r1);
                }
            };
            this.label = 1;
            if (AbstractC6037.m10838(interfaceC6028, interfaceC7372, this) == coroutineSingletons) {
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
