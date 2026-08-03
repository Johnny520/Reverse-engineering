package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4894 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۥ$ۥ */
    public static final class C0523<R> implements InterfaceC4890<R> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5140 f11294;

        public C0523(InterfaceC5140 interfaceC5140) {
            this.f11294 = interfaceC5140;
        }

        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super R> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            Object objM1801 = C4894.m1801(new C0524(this.f11294, interfaceC4892, null), interfaceC4199);
            return objM1801 == C5508.m17142() ? objM1801 : C8107.f3222;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۥ$ۥ۟ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", m1273f = "FlowCoroutine.kt", m1274i = {}, m1275l = {51}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C0524 extends AbstractC7690 implements InterfaceC5138<InterfaceC4243, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f11295;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f11296;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5140<InterfaceC4243, InterfaceC4892<? super R>, InterfaceC4199<? super C8107>, Object> f11297;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4892<R> f11298;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۤ<? super Yue.ۥ۟ۧۧۥ, ? super Yue.ۥۣۣ۠ۢ<? super R>, ? super Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, ? extends java.lang.Object> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣۣ۠ۢ<? super R> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0524(InterfaceC5140<? super InterfaceC4243, ? super InterfaceC4892<? super R>, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5140, InterfaceC4892<? super R> interfaceC4892, InterfaceC4199<? super C0524> interfaceC4199) {
            super(2, interfaceC4199);
            this.f11297 = interfaceC5140;
            this.f11298 = interfaceC4892;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C0524 c0524 = new C0524(this.f11297, this.f11298, interfaceC4199);
            c0524.f11296 = obj;
            return c0524;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        public final Object invoke(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C0524) create(interfaceC4243, interfaceC4199)).invokeSuspend(C8107.f3222);
        }

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
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            Object objM17142 = C5508.m17142();
            int i = this.f11295;
            if (i == 0) {
                C7149.m22422(obj);
                InterfaceC4243 interfaceC4243 = (InterfaceC4243) this.f11296;
                InterfaceC5140<InterfaceC4243, InterfaceC4892<? super R>, InterfaceC4199<? super C8107>, Object> interfaceC5140 = this.f11297;
                Object obj2 = this.f11298;
                this.f11295 = 1;
                if (interfaceC5140.mo15350(interfaceC4243, obj2, this) == objM17142) {
                    return objM17142;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7149.m22422(obj);
            }
            return C8107.f3222;
        }
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public static final <R> Object m1801(@InterfaceC6399 @InterfaceC3614 InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC4199<? super R> interfaceC4199) {
        C4893 c4893 = new C4893(interfaceC4199.getContext(), interfaceC4199);
        Object objM26706 = C8103.m26706(c4893, c4893, interfaceC5138);
        if (objM26706 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        return objM26706;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <R> InterfaceC4890<R> m1802(@InterfaceC6399 @InterfaceC3614 InterfaceC5140<? super InterfaceC4243, ? super InterfaceC4892<? super R>, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5140) {
        return new C0523(interfaceC5140);
    }
}
