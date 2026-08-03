package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3719<T> extends AbstractC3716<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4890<InterfaceC4890<T>> f6632;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final int f6633;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۡ$ۥ */
    public static final class C0236<T> implements InterfaceC4892 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5542 f6634;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7298 f6635;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC6809<T> f6636;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ C7324<T> f6637;

        /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۡ$ۥ$ۥ, reason: contains not printable characters */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", m1273f = "Merge.kt", m1274i = {}, m1275l = {69}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
        public static final class C3720 extends AbstractC7690 implements InterfaceC5138<InterfaceC4243, InterfaceC4199<? super C8107>, Object> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public int f6638;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC4890<T> f6639;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ C7324<T> f6640;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC7298 f6641;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۡ<? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3720(InterfaceC4890<? extends T> interfaceC4890, C7324<T> c7324, InterfaceC7298 interfaceC7298, InterfaceC4199<? super C3720> interfaceC4199) {
                super(2, interfaceC4199);
                this.f6639 = interfaceC4890;
                this.f6640 = c7324;
                this.f6641 = interfaceC7298;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6399
            public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
                return new C3720(this.f6639, this.f6640, this.f6641, interfaceC4199);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // Yue.InterfaceC5138
            @InterfaceC6489
            public final Object invoke(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
                return ((C3720) create(interfaceC4243, interfaceC4199)).invokeSuspend(C8107.f3222);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                Object objM17142 = C5508.m17142();
                int i = this.f6638;
                try {
                    if (i == 0) {
                        C7149.m22422(obj);
                        InterfaceC4890<T> interfaceC4890 = this.f6639;
                        C7324<T> c7324 = this.f6640;
                        this.f6638 = 1;
                        if (interfaceC4890.mo48(c7324, this) == objM17142) {
                            return objM17142;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7149.m22422(obj);
                    }
                    this.f6641.release();
                    return C8107.f3222;
                } catch (Throwable th) {
                    this.f6641.release();
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۣ۟ۤۡ$ۥ$ۥ۟, reason: contains not printable characters */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", m1273f = "Merge.kt", m1274i = {0, 0}, m1275l = {66}, m1276m = "emit", m1277n = {"this", "inner"}, m1278s = {"L$0", "L$1"})
        public static final class C3721 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public Object f6642;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public Object f6643;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public /* synthetic */ Object f6644;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final /* synthetic */ C0236<T> f6645;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public int f6646;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۟ۤۡ$ۥ<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3721(C0236<? super T> c0236, InterfaceC4199<? super C3721> interfaceC4199) {
                super(interfaceC4199);
                this.f6645 = c0236;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f6644 = obj;
                this.f6646 |= Integer.MIN_VALUE;
                return this.f6645.mo10059(null, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۡۥۡۤ<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public C0236(InterfaceC5542 interfaceC5542, InterfaceC7298 interfaceC7298, InterfaceC6809<? super T> interfaceC6809, C7324<T> c7324) {
            this.f6634 = interfaceC5542;
            this.f6635 = interfaceC7298;
            this.f6636 = interfaceC6809;
            this.f6637 = c7324;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object; */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Yue.InterfaceC4892
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo10059(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C3721 c3721;
            C0236<T> c0236;
            if (interfaceC4199 instanceof C3721) {
                c3721 = (C3721) interfaceC4199;
                int i = c3721.f6646;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c3721.f6646 = i - Integer.MIN_VALUE;
                } else {
                    c3721 = new C3721(this, interfaceC4199);
                }
            }
            Object obj = c3721.f6644;
            Object objM17142 = C5508.m17142();
            int i2 = c3721.f6646;
            if (i2 == 0) {
                C7149.m22422(obj);
                InterfaceC5542 interfaceC5542 = this.f6634;
                if (interfaceC5542 != null) {
                    C5553.m17212(interfaceC5542);
                }
                InterfaceC7298 interfaceC7298 = this.f6635;
                c3721.f6642 = this;
                c3721.f6643 = interfaceC4890;
                c3721.f6646 = 1;
                if (interfaceC7298.mo3556(c3721) == objM17142) {
                    return objM17142;
                }
                c0236 = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC4890 = (InterfaceC4890) c3721.f6643;
                c0236 = (C0236) c3721.f6642;
                C7149.m22422(obj);
            }
            C3617.m9760(c0236.f6636, null, null, new C3720(interfaceC4890, c0236.f6637, c0236.f6635, null), 3, null);
            return C8107.f3222;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (r7v0 Yue.ۥۣ۠ۢۡ)
  (r8v0 int)
  (wrap:Yue.ۥ۟ۧۦۥ:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:Yue.ۥ۟ۧۦۥ:0x0004: SGET  A[WRAPPED] (LINE:1) Yue.ۥ۠۠ۧۦ.ۥۣ۟۟۠ Yue.ۥ۠۠ۧۦ) : (r9v0 Yue.ۥ۟ۧۦۥ))
  (wrap:int:0x000c: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-2 int) : (r10v0 int))
  (wrap:Yue.ۥۣۣ۟:?: TERNARY null = ((wrap:int:0x000d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:Yue.ۥۣۣ۟:0x0011: SGET  A[WRAPPED] (LINE:2) Yue.ۥۣۣ۟.ۥۣ۟۟۠ Yue.ۥۣۣ۟) : (r11v0 Yue.ۥۣۣ۟))
 A[MD:(Yue.ۥۣ۠ۢۡ<? extends Yue.ۥۣ۠ۢۡ<? extends T>>, int, Yue.ۥ۟ۧۦۥ, int, Yue.ۥۣۣ۟):void (m)] (LINE:3) call: Yue.ۥۣ۟ۤۡ.<init>(Yue.ۥۣ۠ۢۡ, int, Yue.ۥ۟ۧۦۥ, int, Yue.ۥۣۣ۟):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3719(InterfaceC4890 interfaceC4890, int i, InterfaceC4225 interfaceC4225, int i2, EnumC3602 enumC3602, int i3, C4335 c4335) {
        this(interfaceC4890, i, (i3 & 4) != 0 ? C4629.f9940 : interfaceC4225, (i3 & 8) != 0 ? -2 : i2, (i3 & 16) != 0 ? EnumC3602.SUSPEND : enumC3602);
    }

    @Override // Yue.AbstractC3716
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public String mo10172() {
        return "concurrency=" + this.f6633;
    }

    @Override // Yue.AbstractC3716
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public Object mo9979(@InterfaceC6399 InterfaceC6809<? super T> interfaceC6809, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        Object objMo48 = this.f6632.mo48(new C0236((InterfaceC5542) interfaceC4199.getContext().get(InterfaceC5542.f13507), C7300.m3558(this.f6633, 0, 2, null), interfaceC6809, new C7324(interfaceC6809)), interfaceC4199);
        return objMo48 == C5508.m17142() ? objMo48 : C8107.f3222;
    }

    @Override // Yue.AbstractC3716
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public AbstractC3716<T> mo9980(@InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602) {
        return new C3719(this.f6632, this.f6633, interfaceC4225, i, enumC3602);
    }

    @Override // Yue.AbstractC3716
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public InterfaceC7042<T> mo10174(@InterfaceC6399 InterfaceC4243 interfaceC4243) {
        return C6806.m21525(interfaceC4243, this.f6621, this.f6622, m10179());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۡ<? extends Yue.ۥۣ۠ۢۡ<? extends T>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C3719(@InterfaceC6399 InterfaceC4890<? extends InterfaceC4890<? extends T>> interfaceC4890, int i, @InterfaceC6399 InterfaceC4225 interfaceC4225, int i2, @InterfaceC6399 EnumC3602 enumC3602) {
        super(interfaceC4225, i2, enumC3602);
        this.f6632 = interfaceC4890;
        this.f6633 = i;
    }
}
