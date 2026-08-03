package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3731<T> extends AbstractC3716<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public final Iterable<InterfaceC4890<T>> f6673;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۢ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", m1273f = "Merge.kt", m1274i = {}, m1275l = {96}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C0240 extends AbstractC7690 implements InterfaceC5138<InterfaceC4243, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f6674;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4890<T> f6675;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ C7324<T> f6676;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۡ<? extends T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0240(InterfaceC4890<? extends T> interfaceC4890, C7324<T> c7324, InterfaceC4199<? super C0240> interfaceC4199) {
            super(2, interfaceC4199);
            this.f6675 = interfaceC4890;
            this.f6676 = c7324;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            return new C0240(this.f6675, this.f6676, interfaceC4199);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        public final Object invoke(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C0240) create(interfaceC4243, interfaceC4199)).invokeSuspend(C8107.f3222);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            Object objM17142 = C5508.m17142();
            int i = this.f6674;
            if (i == 0) {
                C7149.m22422(obj);
                InterfaceC4890<T> interfaceC4890 = this.f6675;
                C7324<T> c7324 = this.f6676;
                this.f6674 = 1;
                if (interfaceC4890.mo48(c7324, this) == objM17142) {
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

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (r1v0 java.lang.Iterable)
  (wrap:Yue.ۥ۟ۧۦۥ:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:Yue.ۥ۟ۧۦۥ:0x0004: SGET  A[WRAPPED] (LINE:1) Yue.ۥ۠۠ۧۦ.ۥۣ۟۟۠ Yue.ۥ۠۠ۧۦ) : (r2v0 Yue.ۥ۟ۧۦۥ))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-2 int) : (r3v0 int))
  (wrap:Yue.ۥۣۣ۟:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:Yue.ۥۣۣ۟:0x000f: SGET  A[WRAPPED] (LINE:2) Yue.ۥۣۣ۟.ۥۣ۟۟۠ Yue.ۥۣۣ۟) : (r4v0 Yue.ۥۣۣ۟))
 A[MD:(java.lang.Iterable<? extends Yue.ۥۣ۠ۢۡ<? extends T>>, Yue.ۥ۟ۧۦۥ, int, Yue.ۥۣۣ۟):void (m)] (LINE:3) call: Yue.ۥ۟ۤۢ.<init>(java.lang.Iterable, Yue.ۥ۟ۧۦۥ, int, Yue.ۥۣۣ۟):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3731(Iterable iterable, InterfaceC4225 interfaceC4225, int i, EnumC3602 enumC3602, int i2, C4335 c4335) {
        this(iterable, (i2 & 2) != 0 ? C4629.f9940 : interfaceC4225, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? EnumC3602.SUSPEND : enumC3602);
    }

    @Override // Yue.AbstractC3716
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public Object mo9979(@InterfaceC6399 InterfaceC6809<? super T> interfaceC6809, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        C7324 c7324 = new C7324(interfaceC6809);
        Iterator<InterfaceC4890<T>> it = this.f6673.iterator();
        while (it.hasNext()) {
            C3617.m9760(interfaceC6809, null, null, new C0240(it.next(), c7324, null), 3, null);
        }
        return C8107.f3222;
    }

    @Override // Yue.AbstractC3716
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public AbstractC3716<T> mo9980(@InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602) {
        return new C3731(this.f6673, interfaceC4225, i, enumC3602);
    }

    @Override // Yue.AbstractC3716
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public InterfaceC7042<T> mo10174(@InterfaceC6399 InterfaceC4243 interfaceC4243) {
        return C6806.m21525(interfaceC4243, this.f6621, this.f6622, m10179());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Iterable<? extends Yue.ۥۣ۠ۢۡ<? extends T>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C3731(@InterfaceC6399 Iterable<? extends InterfaceC4890<? extends T>> iterable, @InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602) {
        super(interfaceC4225, i, enumC3602);
        this.f6673 = iterable;
    }
}
