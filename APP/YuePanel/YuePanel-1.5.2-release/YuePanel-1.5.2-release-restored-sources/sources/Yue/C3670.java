package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3670<T> implements InterfaceC3669<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4890<T> f6492;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۨۤ$ۥ */
    public static final class C0217<T> implements InterfaceC4892 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4892<T> f6493;

        /* JADX INFO: renamed from: Yue.ۥۣ۟ۨۤ$ۥ$ۥ, reason: contains not printable characters */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", m1273f = "Context.kt", m1274i = {}, m1275l = {275}, m1276m = "emit", m1277n = {}, m1278s = {})
        public static final class C3671 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f6494;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ C0217<T> f6495;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public int f6496;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۟ۨۤ$ۥ<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3671(C0217<? super T> c0217, InterfaceC4199<? super C3671> interfaceC4199) {
                super(interfaceC4199);
                this.f6495 = c0217;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f6494 = obj;
                this.f6496 |= Integer.MIN_VALUE;
                return this.f6495.mo10059(null, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣۣ۠ۢ<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public C0217(InterfaceC4892<? super T> interfaceC4892) {
            this.f6493 = interfaceC4892;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Yue.InterfaceC4892
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C3671 c3671;
            if (interfaceC4199 instanceof C3671) {
                c3671 = (C3671) interfaceC4199;
                int i = c3671.f6496;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c3671.f6496 = i - Integer.MIN_VALUE;
                } else {
                    c3671 = new C3671(this, interfaceC4199);
                }
            }
            Object obj = c3671.f6494;
            Object objM17142 = C5508.m17142();
            int i2 = c3671.f6496;
            if (i2 == 0) {
                C7149.m22422(obj);
                C5553.m17211(c3671.getContext());
                InterfaceC4892<T> interfaceC4892 = this.f6493;
                c3671.f6496 = 1;
                if (interfaceC4892.mo10059(t, c3671) == objM17142) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public C3670(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890) {
        this.f6492 = interfaceC4890;
    }

    @Override // Yue.InterfaceC4890
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        Object objMo48 = this.f6492.mo48(new C0217(interfaceC4892), interfaceC4199);
        return objMo48 == C5508.m17142() ? objMo48 : C8107.f3222;
    }
}
