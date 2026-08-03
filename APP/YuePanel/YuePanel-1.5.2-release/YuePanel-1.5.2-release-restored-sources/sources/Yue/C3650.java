package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3650<T> extends C3717<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5138<InterfaceC6809<? super T>, InterfaceC4199<? super C8107>, Object> f6452;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۦۨ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.CallbackFlowBuilder", m1273f = "Builders.kt", m1274i = {0}, m1275l = {336}, m1276m = "collectTo", m1277n = {"scope"}, m1278s = {"L$0"})
    public static final class C0210 extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f6453;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f6454;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ C3650<T> f6455;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f6456;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0210(C3650<T> c3650, InterfaceC4199<? super C0210> interfaceC4199) {
            super(interfaceC4199);
            this.f6455 = c3650;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f6454 = obj;
            this.f6456 |= Integer.MIN_VALUE;
            return this.f6455.mo9979(null, this);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r1v0 Yue.ۥۣ۠ۢۢ)
  (wrap:Yue.ۥ۟ۧۦۥ:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:Yue.ۥ۟ۧۦۥ:0x0004: SGET  A[WRAPPED] (LINE:1) Yue.ۥ۠۠ۧۦ.ۥۣ۟۟۠ Yue.ۥ۠۠ۧۦ) : (r2v0 Yue.ۥ۟ۧۦۥ))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-2 int) : (r3v0 int))
  (wrap:Yue.ۥۣۣ۟:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:Yue.ۥۣۣ۟:0x000f: SGET  A[WRAPPED] (LINE:2) Yue.ۥۣۣ۟.ۥۣ۟۟۠ Yue.ۥۣۣ۟) : (r4v0 Yue.ۥۣۣ۟))
 A[MD:(Yue.ۥۣ۠ۢۢ<? super Yue.ۥۡۥۡۤ<? super T>, ? super Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, ? extends java.lang.Object>, Yue.ۥ۟ۧۦۥ, int, Yue.ۥۣۣ۟):void (m)] (LINE:3) call: Yue.ۥۣ۟ۦۨ.<init>(Yue.ۥۣ۠ۢۢ, Yue.ۥ۟ۧۦۥ, int, Yue.ۥۣۣ۟):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3650(InterfaceC5138 interfaceC5138, InterfaceC4225 interfaceC4225, int i, EnumC3602 enumC3602, int i2, C4335 c4335) {
        this(interfaceC5138, (i2 & 2) != 0 ? C4629.f9940 : interfaceC4225, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? EnumC3602.SUSPEND : enumC3602);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Yue.C3717, Yue.AbstractC3716
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo9979(@InterfaceC6399 InterfaceC6809<? super T> interfaceC6809, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        C0210 c0210;
        if (interfaceC4199 instanceof C0210) {
            c0210 = (C0210) interfaceC4199;
            int i = c0210.f6456;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0210.f6456 = i - Integer.MIN_VALUE;
            } else {
                c0210 = new C0210(this, interfaceC4199);
            }
        }
        Object obj = c0210.f6454;
        Object objM17142 = C5508.m17142();
        int i2 = c0210.f6456;
        if (i2 == 0) {
            C7149.m22422(obj);
            c0210.f6453 = interfaceC6809;
            c0210.f6456 = 1;
            if (super.mo9979(interfaceC6809, c0210) == objM17142) {
                return objM17142;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC6809 = (InterfaceC6809) c0210.f6453;
            C7149.m22422(obj);
        }
        if (interfaceC6809.mo5867()) {
            return C8107.f3222;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // Yue.C3717, Yue.AbstractC3716
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public AbstractC3716<T> mo9980(@InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602) {
        return new C3650(this.f6452, interfaceC4225, i, enumC3602);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۢ<? super Yue.ۥۡۥۡۤ<? super T>, ? super Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C3650(@InterfaceC6399 InterfaceC5138<? super InterfaceC6809<? super T>, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602) {
        super(interfaceC5138, interfaceC4225, i, enumC3602);
        this.f6452 = interfaceC5138;
    }
}
