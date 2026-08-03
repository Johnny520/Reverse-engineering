package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7667<T> implements InterfaceC4892<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4892<T> f23066;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5138<InterfaceC4892<? super T>, InterfaceC4199<? super C8107>, Object> f23067;

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠ۨ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.SubscribedFlowCollector", m1273f = "Share.kt", m1274i = {0, 0}, m1275l = {419, 423}, m1276m = "onSubscription", m1277n = {"this", "safeCollector"}, m1278s = {"L$0", "L$1"})
    public static final class C1319 extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f23068;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f23069;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ Object f23070;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ C7667<T> f23071;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f23072;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1319(C7667<T> c7667, InterfaceC4199<? super C1319> interfaceC4199) {
            super(interfaceC4199);
            this.f23071 = c7667;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f23070 = obj;
            this.f23072 |= Integer.MIN_VALUE;
            return this.f23071.m3774(this);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣۣ۠ۢ<? super T> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۢ<? super Yue.ۥۣۣ۠ۢ<? super T>, ? super Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7667(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC5138<? super InterfaceC4892<? super T>, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138) {
        this.f23066 = interfaceC4892;
        this.f23067 = interfaceC5138;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:36:0x0022 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [Yue.ۥۡۧۢ۠] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3774(@InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        C1319 c1319;
        C7203 c7203;
        C7667<T> c7667;
        if (interfaceC4199 instanceof C1319) {
            c1319 = (C1319) interfaceC4199;
            int i = c1319.f23072;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1319.f23072 = i - Integer.MIN_VALUE;
            } else {
                c1319 = new C1319(this, interfaceC4199);
            }
        }
        Object obj = c1319.f23070;
        Object objM17142 = C5508.m17142();
        ?? r2 = c1319.f23072;
        try {
            if (r2 == 0) {
                C7149.m22422(obj);
                c7203 = new C7203(this.f23066, c1319.getContext());
                InterfaceC5138<InterfaceC4892<? super T>, InterfaceC4199<? super C8107>, Object> interfaceC5138 = this.f23067;
                c1319.f23068 = this;
                c1319.f23069 = c7203;
                c1319.f23072 = 1;
                if (interfaceC5138.invoke(c7203, c1319) == objM17142) {
                    return objM17142;
                }
                c7667 = this;
            } else {
                if (r2 != 1) {
                    if (r2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7149.m22422(obj);
                    return C8107.f3222;
                }
                c7203 = (C7203) c1319.f23069;
                c7667 = (C7667) c1319.f23068;
                C7149.m22422(obj);
            }
            c7203.releaseIntercepted();
            InterfaceC4892<T> interfaceC4892 = c7667.f23066;
            r2 = interfaceC4892 instanceof C7667;
            if (r2 == 0) {
                return C8107.f3222;
            }
            c1319.f23068 = null;
            c1319.f23069 = null;
            c1319.f23072 = 2;
            if (((C7667) interfaceC4892).m3774(c1319) == objM17142) {
                return objM17142;
            }
            return C8107.f3222;
        } catch (Throwable th) {
            r2.releaseIntercepted();
            throw th;
        }
    }

    @Override // Yue.InterfaceC4892
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        return this.f23066.mo10059(t, interfaceC4199);
    }
}
