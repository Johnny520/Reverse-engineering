package Yue;

import Yue.C7060;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4436<T> implements InterfaceC4890<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4890<T> f9164;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final InterfaceC5124<T, Object> f9165;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final InterfaceC5138<Object, Object, Boolean> f9166;

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۦ$ۥ */
    public static final class C0408<T> implements InterfaceC4892 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C4436<T> f9167;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7066<Object> f9168;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4892<T> f9169;

        /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۦ$ۥ$ۥ, reason: contains not printable characters */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", m1273f = "Distinct.kt", m1274i = {}, m1275l = {81}, m1276m = "emit", m1277n = {}, m1278s = {})
        public static final class C4437 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f9170;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ C0408<T> f9171;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public int f9172;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠۟ۦ$ۥ<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C4437(C0408<? super T> c0408, InterfaceC4199<? super C4437> interfaceC4199) {
                super(interfaceC4199);
                this.f9171 = c0408;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f9170 = obj;
                this.f9172 |= Integer.MIN_VALUE;
                return this.f9171.mo10059(null, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣۣ۠ۢ<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public C0408(C4436<T> c4436, C7060.C7066<Object> c7066, InterfaceC4892<? super T> interfaceC4892) {
            this.f9167 = c4436;
            this.f9168 = c7066;
            this.f9169 = interfaceC4892;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
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
        @Override // Yue.InterfaceC4892
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C4437 c4437;
            if (interfaceC4199 instanceof C4437) {
                c4437 = (C4437) interfaceC4199;
                int i = c4437.f9172;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c4437.f9172 = i - Integer.MIN_VALUE;
                } else {
                    c4437 = new C4437(this, interfaceC4199);
                }
            }
            Object obj = c4437.f9170;
            Object objM17142 = C5508.m17142();
            int i2 = c4437.f9172;
            if (i2 == 0) {
                C7149.m22422(obj);
                T t2 = (T) this.f9167.f9165.invoke(t);
                Object obj2 = this.f9168.f21353;
                if (obj2 != C6488.f2113 && this.f9167.f9166.invoke(obj2, t2).booleanValue()) {
                    return C8107.f3222;
                }
                this.f9168.f21353 = t2;
                InterfaceC4892<T> interfaceC4892 = this.f9169;
                c4437.f9172 = 1;
                if (interfaceC4892.mo10059(t, c4437) == objM17142) {
                    return objM17142;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7149.m22422(obj);
            }
            return C8107.f3222;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۡ<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۡ۟<? super T, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C4436(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5124<? super T, ? extends Object> interfaceC5124, @InterfaceC6399 InterfaceC5138<Object, Object, Boolean> interfaceC5138) {
        this.f9164 = interfaceC4890;
        this.f9165 = interfaceC5124;
        this.f9166 = interfaceC5138;
    }

    @Override // Yue.InterfaceC4890
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        C7060.C7066 c7066 = new C7060.C7066();
        c7066.f21353 = (T) C6488.f2113;
        Object objMo48 = this.f9164.mo48(new C0408(this, c7066, interfaceC4892), interfaceC4199);
        return objMo48 == C5508.m17142() ? objMo48 : C8107.f3222;
    }
}
