package Yue;

import Yue.InterfaceC4202;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3722<S, T> extends AbstractC3716<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final InterfaceC4890<S> f6647;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۡۤ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", m1273f = "ChannelFlow.kt", m1274i = {}, m1275l = {152}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C0237 extends AbstractC7690 implements InterfaceC5138<InterfaceC4892<? super T>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f6648;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f6649;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ AbstractC3722<S, T> f6650;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0237(AbstractC3722<S, T> abstractC3722, InterfaceC4199<? super C0237> interfaceC4199) {
            super(2, interfaceC4199);
            this.f6650 = abstractC3722;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C0237 c0237 = new C0237(this.f6650, interfaceC4199);
            c0237.f6649 = obj;
            return c0237;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            Object objM17142 = C5508.m17142();
            int i = this.f6648;
            if (i == 0) {
                C7149.m22422(obj);
                InterfaceC4892<? super T> interfaceC4892 = (InterfaceC4892) this.f6649;
                AbstractC3722<S, T> abstractC3722 = this.f6650;
                this.f6648 = 1;
                if (abstractC3722.mo10190(interfaceC4892, this) == objM17142) {
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

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C0237) create(interfaceC4892, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۡ<? extends S> */
    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC3722(@InterfaceC6399 InterfaceC4890<? extends S> interfaceC4890, @InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602) {
        super(interfaceC4225, i, enumC3602);
        this.f6647 = interfaceC4890;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static /* synthetic */ Object m10187(AbstractC3722 abstractC3722, InterfaceC4892 interfaceC4892, InterfaceC4199 interfaceC4199) {
        if (abstractC3722.f6622 == -3) {
            InterfaceC4225 context = interfaceC4199.getContext();
            InterfaceC4225 interfaceC4225Plus = context.plus(abstractC3722.f6621);
            if (C5499.m17094(interfaceC4225Plus, context)) {
                Object objMo10190 = abstractC3722.mo10190(interfaceC4892, interfaceC4199);
                return objMo10190 == C5508.m17142() ? objMo10190 : C8107.f3222;
            }
            InterfaceC4202.C0349 c0349 = InterfaceC4202.f8519;
            if (C5499.m17094(interfaceC4225Plus.get(c0349), context.get(c0349))) {
                Object objM10189 = abstractC3722.m10189(interfaceC4892, interfaceC4225Plus, interfaceC4199);
                return objM10189 == C5508.m17142() ? objM10189 : C8107.f3222;
            }
        }
        Object objMo48 = super.mo48(interfaceC4892, interfaceC4199);
        return objMo48 == C5508.m17142() ? objMo48 : C8107.f3222;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static /* synthetic */ Object m10188(AbstractC3722 abstractC3722, InterfaceC6809 interfaceC6809, InterfaceC4199 interfaceC4199) {
        Object objMo10190 = abstractC3722.mo10190(new C7324(interfaceC6809), interfaceC4199);
        return objMo10190 == C5508.m17142() ? objMo10190 : C8107.f3222;
    }

    @Override // Yue.AbstractC3716
    @InterfaceC6399
    public String toString() {
        return this.f6647 + " -> " + super.toString();
    }

    @Override // Yue.AbstractC3716, Yue.InterfaceC4890
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        return m10187(this, interfaceC4892, interfaceC4199);
    }

    @Override // Yue.AbstractC3716
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public Object mo9979(@InterfaceC6399 InterfaceC6809<? super T> interfaceC6809, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        return m10188(this, interfaceC6809, interfaceC4199);
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥ۟ۤۡۢ.ۥ(Yue.ۥۣۣ۠ۢ, Yue.ۥ۟ۧۦۥ):Yue.ۥۣۣ۠ۢ */
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final Object m10189(InterfaceC4892<? super T> interfaceC4892, InterfaceC4225 interfaceC4225, InterfaceC4199<? super C8107> interfaceC4199) {
        Object objM10184 = C3718.m10184(interfaceC4225, C3718.m10185(interfaceC4892, interfaceC4199.getContext()), null, new C0237(this, null), interfaceC4199, 4, null);
        return objM10184 == C5508.m17142() ? objM10184 : C8107.f3222;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public abstract Object mo10190(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199);
}
