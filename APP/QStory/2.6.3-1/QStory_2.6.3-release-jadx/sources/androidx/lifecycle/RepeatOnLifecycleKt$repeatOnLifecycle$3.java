package androidx.lifecycle;

import androidx.window.area.AbstractC3400;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6276;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.coroutines.internal.AbstractC6197;
import kotlinx.coroutines.sync.C6212;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p109.C8030;
import p111.C8036;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", m556f = "RepeatOnLifecycle.kt", m557l = {83}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $block;
    final /* synthetic */ Lifecycle$State $state;
    final /* synthetic */ AbstractC3235 $this_repeatOnLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", m556f = "RepeatOnLifecycle.kt", m557l = {161}, m558m = "invokeSuspend", m559v = 1)
    public static final class C02291 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC6233 $$this$coroutineScope;
        final /* synthetic */ InterfaceC7383 $block;
        final /* synthetic */ Lifecycle$State $state;
        final /* synthetic */ AbstractC3235 $this_repeatOnLifecycle;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02291(AbstractC3235 abstractC3235, Lifecycle$State lifecycle$State, InterfaceC6233 interfaceC6233, InterfaceC7383 interfaceC7383, InterfaceC5189<? super C02291> interfaceC5189) {
            super(2, interfaceC5189);
            this.$this_repeatOnLifecycle = abstractC3235;
            this.$state = lifecycle$State;
            this.$$this$coroutineScope = interfaceC6233;
            this.$block = interfaceC7383;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C02291(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C02291) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:40:? A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r5v1, types: [T, androidx.lifecycle.飘花落叶言子世苏楪兰哲, androidx.lifecycle.飘花落叶言子苏楪世兰哲] */
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
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref$ObjectRef ref$ObjectRef;
            Throwable th;
            Ref$ObjectRef ref$ObjectRef2;
            InterfaceC6284 interfaceC6284;
            InterfaceC3213 interfaceC3213;
            InterfaceC6284 interfaceC62842;
            InterfaceC3213 interfaceC32132;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            C6008 c6008 = C6008.f15084;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                if (((C3219) this.$this_repeatOnLifecycle).f7364 != Lifecycle$State.DESTROYED) {
                    Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                    ref$ObjectRef = new Ref$ObjectRef();
                    try {
                        Lifecycle$State lifecycle$State = this.$state;
                        AbstractC3235 abstractC3235 = this.$this_repeatOnLifecycle;
                        InterfaceC6233 interfaceC6233 = this.$$this$coroutineScope;
                        InterfaceC7383 interfaceC7383 = this.$block;
                        this.L$0 = ref$ObjectRef3;
                        this.L$1 = ref$ObjectRef;
                        this.L$2 = lifecycle$State;
                        this.L$3 = abstractC3235;
                        this.L$4 = interfaceC6233;
                        this.L$5 = interfaceC7383;
                        this.label = 1;
                        C6276 c6276 = new C6276(1, AbstractC3400.m5624(this));
                        c6276.m11102();
                        Lifecycle$Event.Companion.getClass();
                        ?? c3263 = new C3263(C3230.m5070(lifecycle$State), ref$ObjectRef3, interfaceC6233, C3230.m5072(lifecycle$State), c6276, new C6212(), interfaceC7383);
                        ref$ObjectRef.element = c3263;
                        abstractC3235.mo5063(c3263);
                        if (c6276.m11099() == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ref$ObjectRef2 = ref$ObjectRef3;
                        interfaceC62842 = (InterfaceC6284) ref$ObjectRef2.element;
                        if (interfaceC62842 != null) {
                        }
                        interfaceC32132 = (InterfaceC3213) ref$ObjectRef.element;
                        if (interfaceC32132 != null) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        ref$ObjectRef2 = ref$ObjectRef3;
                        interfaceC6284 = (InterfaceC6284) ref$ObjectRef2.element;
                        if (interfaceC6284 != null) {
                            interfaceC6284.mo10815(null);
                        }
                        interfaceC3213 = (InterfaceC3213) ref$ObjectRef.element;
                        if (interfaceC3213 != null) {
                            throw th;
                        }
                        this.$this_repeatOnLifecycle.mo5062(interfaceC3213);
                        throw th;
                    }
                }
            } else {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$ObjectRef = (Ref$ObjectRef) this.L$1;
                ref$ObjectRef2 = (Ref$ObjectRef) this.L$0;
                try {
                    AbstractC6017.m10769(obj);
                    interfaceC62842 = (InterfaceC6284) ref$ObjectRef2.element;
                    if (interfaceC62842 != null) {
                        interfaceC62842.mo10815(null);
                    }
                    interfaceC32132 = (InterfaceC3213) ref$ObjectRef.element;
                    if (interfaceC32132 != null) {
                        this.$this_repeatOnLifecycle.mo5062(interfaceC32132);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC6284 = (InterfaceC6284) ref$ObjectRef2.element;
                    if (interfaceC6284 != null) {
                    }
                    interfaceC3213 = (InterfaceC3213) ref$ObjectRef.element;
                    if (interfaceC3213 != null) {
                    }
                }
            }
            return c6008;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(AbstractC3235 abstractC3235, Lifecycle$State lifecycle$State, InterfaceC7383 interfaceC7383, InterfaceC5189<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_repeatOnLifecycle = abstractC3235;
        this.$state = lifecycle$State;
        this.$block = interfaceC7383;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$this_repeatOnLifecycle, this.$state, this.$block, interfaceC5189);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
            C8036 c8036 = AbstractC6227.f15375;
            C8030 c8030 = AbstractC6197.f15305.f19558;
            C02291 c02291 = new C02291(this.$this_repeatOnLifecycle, this.$state, interfaceC6233, this.$block, null);
            this.label = 1;
            if (AbstractC6231.m11029(c8030, c02291, this) == coroutineSingletons) {
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
