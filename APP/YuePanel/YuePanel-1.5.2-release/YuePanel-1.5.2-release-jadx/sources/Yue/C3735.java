package Yue;

import Yue.C3732;
import Yue.C7148;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3735 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۢۡ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", m1273f = "Channels.kt", m1274i = {}, m1275l = {58}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C0243 extends AbstractC7690 implements InterfaceC5138<InterfaceC4243, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f6678;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7317<E> f6679;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ E f6680;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۨۡ۠<? super E> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0243(InterfaceC7317<? super E> interfaceC7317, E e, InterfaceC4199<? super C0243> interfaceC4199) {
            super(2, interfaceC4199);
            this.f6679 = interfaceC7317;
            this.f6680 = e;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            return new C0243(this.f6679, this.f6680, interfaceC4199);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        public final Object invoke(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C0243) create(interfaceC4243, interfaceC4199)).invokeSuspend(C8107.f3222);
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
            int i = this.f6678;
            if (i == 0) {
                C7149.m22422(obj);
                InterfaceC7317<E> interfaceC7317 = this.f6679;
                E e = this.f6680;
                this.f6678 = 1;
                if (interfaceC7317.mo5844(e, this) == objM17142) {
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

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۢۡ$ۥ۟ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", m1273f = "Channels.kt", m1274i = {}, m1275l = {39}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C0244 extends AbstractC7690 implements InterfaceC5138<InterfaceC4243, InterfaceC4199<? super C3732<? extends C8107>>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f6681;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f6682;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7317<E> f6683;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ E f6684;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۨۡ۠<? super E> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0244(InterfaceC7317<? super E> interfaceC7317, E e, InterfaceC4199<? super C0244> interfaceC4199) {
            super(2, interfaceC4199);
            this.f6683 = interfaceC7317;
            this.f6684 = e;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C0244 c0244 = new C0244(this.f6683, this.f6684, interfaceC4199);
            c0244.f6682 = obj;
            return c0244;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @InterfaceC6489
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6489 InterfaceC4199<? super C3732<C8107>> interfaceC4199) {
            return ((C0244) create(interfaceC4243, interfaceC4199)).invokeSuspend(C8107.f3222);
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
            Object objM3438;
            Object objM17142 = C5508.m17142();
            int i = this.f6681;
            try {
                if (i == 0) {
                    C7149.m22422(obj);
                    InterfaceC7317<E> interfaceC7317 = this.f6683;
                    E e = this.f6684;
                    C7148.C1189 c1189 = C7148.f21560;
                    this.f6681 = 1;
                    if (interfaceC7317.mo5844(e, this) == objM17142) {
                        return objM17142;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7149.m22422(obj);
                }
                objM3438 = C7148.m3438(C8107.f3222);
            } catch (Throwable th) {
                C7148.C1189 c11892 = C7148.f21560;
                objM3438 = C7148.m3438(C7149.m3441(th));
            }
            return C3732.m806(C7148.m22408(objM3438) ? C3732.f494.m10212(C8107.f3222) : C3732.f494.m807(C7148.m22403(objM3438)));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // Yue.InterfaceC5138
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC4243 interfaceC4243, InterfaceC4199<? super C3732<? extends C8107>> interfaceC4199) {
            return invoke2(interfaceC4243, (InterfaceC4199<? super C3732<C8107>>) interfaceC4199);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: E */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @InterfaceC7097(expression = "trySendBlocking(element)", imports = {}))
    /* JADX INFO: renamed from: ۥ */
    public static final <E> void m811(@InterfaceC6399 InterfaceC7317<? super E> interfaceC7317, E e) throws InterruptedException {
        if (C3732.m10209(interfaceC7317.mo5863(e))) {
            return;
        }
        C3616.m663(null, new C0243(interfaceC7317, e, null), 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: E */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <E> Object m812(@InterfaceC6399 InterfaceC7317<? super E> interfaceC7317, E e) {
        Object objMo5863 = interfaceC7317.mo5863(e);
        if (objMo5863 instanceof C3732.C3733) {
            return ((C3732) C3616.m663(null, new C0244(interfaceC7317, e, null), 1, null)).m10211();
        }
        return C3732.f494.m10212(C8107.f3222);
    }
}
