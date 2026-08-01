package androidx.lifecycle;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.internal.AbstractC5364;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p093.C7200;
import p095.C7206;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {83}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6553 $block;
    final /* synthetic */ Lifecycle$State $state;
    final /* synthetic */ AbstractC2402 $this_repeatOnLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6861(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {161}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC5400 $$this$coroutineScope;
        final /* synthetic */ InterfaceC6553 $block;
        final /* synthetic */ Lifecycle$State $state;
        final /* synthetic */ AbstractC2402 $this_repeatOnLifecycle;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC2402 abstractC2402, Lifecycle$State lifecycle$State, InterfaceC5400 interfaceC5400, InterfaceC6553 interfaceC6553, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$this_repeatOnLifecycle = abstractC2402;
            this.$state = lifecycle$State;
            this.$$this$coroutineScope = interfaceC5400;
            this.$block = interfaceC6553;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
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
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                r14 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r14.label
                r2 = 0
                kotlin.飘花落叶言子楪兰苏哲世 r3 = kotlin.C5175.f14739
                r4 = 1
                if (r1 == 0) goto L34
                if (r1 != r4) goto L2e
                java.lang.Object r0 = r14.L$5
                飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r0 = (p052.InterfaceC6553) r0
                java.lang.Object r0 = r14.L$4
                kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r0 = (kotlinx.coroutines.InterfaceC5400) r0
                java.lang.Object r0 = r14.L$3
                androidx.lifecycle.飘花落叶言子楪兰苏哲世 r0 = (androidx.lifecycle.AbstractC2402) r0
                java.lang.Object r0 = r14.L$2
                androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle$State) r0
                java.lang.Object r0 = r14.L$1
                r1 = r0
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                java.lang.Object r0 = r14.L$0
                r4 = r0
                kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
                kotlin.AbstractC5184.m10206(r15)     // Catch: java.lang.Throwable -> L2a
                goto L92
            L2a:
                r0 = move-exception
                r15 = r0
                goto Laa
            L2e:
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                top.suzhelan.qstory.hook.item.C5919.m11250(r14)
                return r2
            L34:
                kotlin.AbstractC5184.m10206(r15)
                androidx.lifecycle.飘花落叶言子楪兰苏哲世 r15 = r14.$this_repeatOnLifecycle
                androidx.lifecycle.飘花落叶言子世苏兰楪哲 r15 = (androidx.lifecycle.C2386) r15
                androidx.lifecycle.Lifecycle$State r15 = r15.f7018
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle$State.DESTROYED
                if (r15 != r1) goto L42
                goto La6
            L42:
                kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
                r7.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                androidx.lifecycle.Lifecycle$State r15 = r14.$state     // Catch: java.lang.Throwable -> La7
                androidx.lifecycle.飘花落叶言子楪兰苏哲世 r13 = r14.$this_repeatOnLifecycle     // Catch: java.lang.Throwable -> La7
                kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r8 = r14.$$this$coroutineScope     // Catch: java.lang.Throwable -> La7
                飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲苏兰世 r12 = r14.$block     // Catch: java.lang.Throwable -> La7
                r14.L$0 = r7     // Catch: java.lang.Throwable -> La7
                r14.L$1 = r1     // Catch: java.lang.Throwable -> La7
                r14.L$2 = r15     // Catch: java.lang.Throwable -> La7
                r14.L$3 = r13     // Catch: java.lang.Throwable -> La7
                r14.L$4 = r8     // Catch: java.lang.Throwable -> La7
                r14.L$5 = r12     // Catch: java.lang.Throwable -> La7
                r14.label = r4     // Catch: java.lang.Throwable -> La7
                kotlinx.coroutines.飘花落叶言子楪苏兰世哲 r10 = new kotlinx.coroutines.飘花落叶言子楪苏兰世哲     // Catch: java.lang.Throwable -> La7
                kotlin.coroutines.飘花落叶言子楪世哲苏兰 r5 = com.bumptech.glide.AbstractC3054.m6602(r14)     // Catch: java.lang.Throwable -> La7
                r10.<init>(r4, r5)     // Catch: java.lang.Throwable -> La7
                r10.m10539()     // Catch: java.lang.Throwable -> La7
                androidx.lifecycle.飘花落叶言子楪兰世哲苏 r4 = androidx.lifecycle.Lifecycle$Event.Companion     // Catch: java.lang.Throwable -> La7
                r4.getClass()     // Catch: java.lang.Throwable -> La7
                androidx.lifecycle.Lifecycle$Event r6 = androidx.lifecycle.C2397.m4500(r15)     // Catch: java.lang.Throwable -> La7
                androidx.lifecycle.Lifecycle$Event r9 = androidx.lifecycle.C2397.m4502(r15)     // Catch: java.lang.Throwable -> La7
                kotlinx.coroutines.sync.飘花落叶言子楪世哲兰苏 r11 = new kotlinx.coroutines.sync.飘花落叶言子楪世哲兰苏     // Catch: java.lang.Throwable -> La7
                r11.<init>()     // Catch: java.lang.Throwable -> La7
                androidx.lifecycle.飘花落叶言子苏楪世兰哲 r5 = new androidx.lifecycle.飘花落叶言子苏楪世兰哲     // Catch: java.lang.Throwable -> La7
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> La7
                r1.element = r5     // Catch: java.lang.Throwable -> La7
                r13.mo4493(r5)     // Catch: java.lang.Throwable -> La7
                java.lang.Object r15 = r10.m10536()     // Catch: java.lang.Throwable -> La7
                if (r15 != r0) goto L91
                return r0
            L91:
                r4 = r7
            L92:
                T r15 = r4.element
                kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r15 = (kotlinx.coroutines.InterfaceC5451) r15
                if (r15 == 0) goto L9b
                r15.mo10252(r2)
            L9b:
                T r15 = r1.element
                androidx.lifecycle.飘花落叶言子世楪兰苏哲 r15 = (androidx.lifecycle.InterfaceC2380) r15
                if (r15 == 0) goto La6
                androidx.lifecycle.飘花落叶言子楪兰苏哲世 r14 = r14.$this_repeatOnLifecycle
                r14.mo4492(r15)
            La6:
                return r3
            La7:
                r0 = move-exception
                r15 = r0
                r4 = r7
            Laa:
                T r0 = r4.element
                kotlinx.coroutines.飘花落叶言子苏世楪兰哲 r0 = (kotlinx.coroutines.InterfaceC5451) r0
                if (r0 == 0) goto Lb3
                r0.mo10252(r2)
            Lb3:
                T r0 = r1.element
                androidx.lifecycle.飘花落叶言子世楪兰苏哲 r0 = (androidx.lifecycle.InterfaceC2380) r0
                if (r0 == 0) goto Lbe
                androidx.lifecycle.飘花落叶言子楪兰苏哲世 r14 = r14.$this_repeatOnLifecycle
                r14.mo4492(r0)
            Lbe:
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(AbstractC2402 abstractC2402, Lifecycle$State lifecycle$State, InterfaceC6553 interfaceC6553, InterfaceC4356<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_repeatOnLifecycle = abstractC2402;
        this.$state = lifecycle$State;
        this.$block = interfaceC6553;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$this_repeatOnLifecycle, this.$state, this.$block, interfaceC4356);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC5400 interfaceC5400 = (InterfaceC5400) this.L$0;
            C7206 c7206 = AbstractC5394.f15030;
            C7200 c7200 = AbstractC5364.f14960.f19218;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, interfaceC5400, this.$block, null);
            this.label = 1;
            if (AbstractC5398.m10466(c7200, anonymousClass1, this) == coroutineSingletons) {
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
