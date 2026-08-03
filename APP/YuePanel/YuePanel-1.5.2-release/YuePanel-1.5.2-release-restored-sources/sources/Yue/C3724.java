package Yue;

import Yue.C7060;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3724<T, R> extends AbstractC3722<T, R> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5140<InterfaceC4892<? super R>, T, InterfaceC4199<? super C8107>, Object> f6651;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۡۦ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", m1273f = "Merge.kt", m1274i = {}, m1275l = {27}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C0238 extends AbstractC7690 implements InterfaceC5138<InterfaceC4243, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f6652;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f6653;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ C3724<T, R> f6654;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4892<R> f6655;

        /* JADX INFO: renamed from: Yue.ۥ۟ۤۡۦ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C3725<T> implements InterfaceC4892 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ C7060.C7066<InterfaceC5542> f6656;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC4243 f6657;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ C3724<T, R> f6658;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC4892<R> f6659;

            /* JADX INFO: renamed from: Yue.ۥ۟ۤۡۦ$ۥ$ۥ$ۥ, reason: contains not printable characters */
            @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", m1273f = "Merge.kt", m1274i = {}, m1275l = {34}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
            public static final class C3726 extends AbstractC7690 implements InterfaceC5138<InterfaceC4243, InterfaceC4199<? super C8107>, Object> {

                /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
                public int f6660;

                /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
                public final /* synthetic */ C3724<T, R> f6661;

                /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC4892<R> f6662;

                /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
                public final /* synthetic */ T f6663;

                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣۣ۠ۢ<? super R> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C3726(C3724<T, R> c3724, InterfaceC4892<? super R> interfaceC4892, T t, InterfaceC4199<? super C3726> interfaceC4199) {
                    super(2, interfaceC4199);
                    this.f6661 = c3724;
                    this.f6662 = interfaceC4892;
                    this.f6663 = t;
                }

                @Override // Yue.AbstractC3513
                @InterfaceC6399
                public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
                    return new C3726(this.f6661, this.f6662, this.f6663, interfaceC4199);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // Yue.InterfaceC5138
                @InterfaceC6489
                public final Object invoke(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
                    return ((C3726) create(interfaceC4243, interfaceC4199)).invokeSuspend(C8107.f3222);
                }

                @Override // Yue.AbstractC3513
                @InterfaceC6489
                public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                    Object objM17142 = C5508.m17142();
                    int i = this.f6660;
                    if (i == 0) {
                        C7149.m22422(obj);
                        InterfaceC5140 interfaceC5140 = this.f6661.f6651;
                        InterfaceC4892<R> interfaceC4892 = this.f6662;
                        T t = this.f6663;
                        this.f6660 = 1;
                        if (interfaceC5140.mo15350(interfaceC4892, t, this) == objM17142) {
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

            /* JADX INFO: renamed from: Yue.ۥ۟ۤۡۦ$ۥ$ۥ$ۥ۟, reason: contains not printable characters */
            @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", m1273f = "Merge.kt", m1274i = {0, 0}, m1275l = {30}, m1276m = "emit", m1277n = {"this", "value"}, m1278s = {"L$0", "L$1"})
            public static final class C3727 extends AbstractC4201 {

                /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
                public Object f6664;

                /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
                public Object f6665;

                /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
                public Object f6666;

                /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
                public /* synthetic */ Object f6667;

                /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
                public final /* synthetic */ C3725<T> f6668;

                /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
                public int f6669;

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۟ۤۡۦ$ۥ$ۥ<? super T> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C3727(C3725<? super T> c3725, InterfaceC4199<? super C3727> interfaceC4199) {
                    super(interfaceC4199);
                    this.f6668 = c3725;
                }

                @Override // Yue.AbstractC3513
                @InterfaceC6489
                public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                    this.f6667 = obj;
                    this.f6669 |= Integer.MIN_VALUE;
                    return this.f6668.mo10059(null, this);
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Yue.ۥۣۣ۠ۢ<? super R> */
            /* JADX WARN: Multi-variable type inference failed */
            public C3725(C7060.C7066<InterfaceC5542> c7066, InterfaceC4243 interfaceC4243, C3724<T, R> c3724, InterfaceC4892<? super R> interfaceC4892) {
                this.f6656 = c7066;
                this.f6657 = interfaceC4243;
                this.f6658 = c3724;
                this.f6659 = interfaceC4892;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Yue.InterfaceC4892
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟۟۟۟ */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
                C3727 c3727;
                C3725<T> c3725;
                if (interfaceC4199 instanceof C3727) {
                    c3727 = (C3727) interfaceC4199;
                    int i = c3727.f6669;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c3727.f6669 = i - Integer.MIN_VALUE;
                    } else {
                        c3727 = new C3727(this, interfaceC4199);
                    }
                }
                Object obj = c3727.f6667;
                Object objM17142 = C5508.m17142();
                int i2 = c3727.f6669;
                if (i2 == 0) {
                    C7149.m22422(obj);
                    InterfaceC5542 interfaceC5542 = this.f6656.f21353;
                    if (interfaceC5542 != null) {
                        interfaceC5542.mo6939(new C3812());
                        c3727.f6664 = this;
                        c3727.f6665 = t;
                        c3727.f6666 = interfaceC5542;
                        c3727.f6669 = 1;
                        if (interfaceC5542.mo17163(c3727) == objM17142) {
                            return objM17142;
                        }
                    }
                    c3725 = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t = (T) c3727.f6665;
                    c3725 = (C3725) c3727.f6664;
                    C7149.m22422(obj);
                }
                c3725.f6656.f21353 = (T) C3617.m9760(c3725.f6657, null, EnumC4247.UNDISPATCHED, new C3726(c3725.f6658, c3725.f6659, t, null), 1, null);
                return C8107.f3222;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣۣ۠ۢ<? super R> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0238(C3724<T, R> c3724, InterfaceC4892<? super R> interfaceC4892, InterfaceC4199<? super C0238> interfaceC4199) {
            super(2, interfaceC4199);
            this.f6654 = c3724;
            this.f6655 = interfaceC4892;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C0238 c0238 = new C0238(this.f6654, this.f6655, interfaceC4199);
            c0238.f6653 = obj;
            return c0238;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        public final Object invoke(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C0238) create(interfaceC4243, interfaceC4199)).invokeSuspend(C8107.f3222);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type Yue.ￛﾥￛﾟￛﾧￛﾤￛﾢ to Yue.ￛﾥￛﾟￛﾤￛﾡￛﾦ$ￛﾥ for r7v1 'this'  Yue.ￛﾥￛﾟￛﾧￛﾤￛﾢ
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // Yue.AbstractC3513
        @Yue.InterfaceC6489
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC6399 java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = Yue.C5508.m17142()
                int r1 = r7.f6652
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                Yue.C7149.m22422(r8)
                goto L37
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                Yue.C7149.m22422(r8)
                java.lang.Object r8 = r7.f6653
                Yue.ۥ۟ۧۧۥ r8 = (Yue.InterfaceC4243) r8
                Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ r1 = new Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ
                r1.<init>()
                Yue.ۥ۟ۤۡۦ<T, R> r3 = r7.f6654
                Yue.ۥۣ۠ۢۡ<S> r4 = r3.f6647
                Yue.ۥ۟ۤۡۦ$ۥ$ۥ r5 = new Yue.ۥ۟ۤۡۦ$ۥ$ۥ
                Yue.ۥۣۣ۠ۢ<R> r6 = r7.f6655
                r5.<init>(r1, r8, r3, r6)
                r7.f6652 = r2
                java.lang.Object r8 = r4.mo48(r5, r7)
                if (r8 != r0) goto L37
                return r0
            L37:
                Yue.ۥۣۢ۠ۤ r8 = Yue.C8107.f3222
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Yue.C3724.C0238.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (r7v0 Yue.ۥۣ۠ۢۤ)
  (r8v0 Yue.ۥۣ۠ۢۡ)
  (wrap:Yue.ۥ۟ۧۦۥ:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:Yue.ۥ۟ۧۦۥ:0x0004: SGET  A[WRAPPED] (LINE:1) Yue.ۥ۠۠ۧۦ.ۥۣ۟۟۠ Yue.ۥ۠۠ۧۦ) : (r9v0 Yue.ۥ۟ۧۦۥ))
  (wrap:int:0x000c: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-2 int) : (r10v0 int))
  (wrap:Yue.ۥۣۣ۟:?: TERNARY null = ((wrap:int:0x000d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:Yue.ۥۣۣ۟:0x0011: SGET  A[WRAPPED] (LINE:2) Yue.ۥۣۣ۟.ۥۣ۟۟۠ Yue.ۥۣۣ۟) : (r11v0 Yue.ۥۣۣ۟))
 A[MD:(Yue.ۥۣ۠ۢۤ<? super Yue.ۥۣۣ۠ۢ<? super R>, ? super T, ? super Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, ? extends java.lang.Object>, Yue.ۥۣ۠ۢۡ<? extends T>, Yue.ۥ۟ۧۦۥ, int, Yue.ۥۣۣ۟):void (m)] (LINE:3) call: Yue.ۥ۟ۤۡۦ.<init>(Yue.ۥۣ۠ۢۤ, Yue.ۥۣ۠ۢۡ, Yue.ۥ۟ۧۦۥ, int, Yue.ۥۣۣ۟):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3724(InterfaceC5140 interfaceC5140, InterfaceC4890 interfaceC4890, InterfaceC4225 interfaceC4225, int i, EnumC3602 enumC3602, int i2, C4335 c4335) {
        this(interfaceC5140, interfaceC4890, (i2 & 4) != 0 ? C4629.f9940 : interfaceC4225, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? EnumC3602.SUSPEND : enumC3602);
    }

    @Override // Yue.AbstractC3716
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public AbstractC3716<R> mo9980(@InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602) {
        return new C3724(this.f6651, this.f6647, interfaceC4225, i, enumC3602);
    }

    @Override // Yue.AbstractC3722
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public Object mo10190(@InterfaceC6399 InterfaceC4892<? super R> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        Object objM12241 = C4244.m12241(new C0238(this, interfaceC4892, null), interfaceC4199);
        return objM12241 == C5508.m17142() ? objM12241 : C8107.f3222;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۤ<? super Yue.ۥۣۣ۠ۢ<? super R>, ? super T, ? super Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C3724(@InterfaceC6399 InterfaceC5140<? super InterfaceC4892<? super R>, ? super T, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5140, @InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602) {
        super(interfaceC4890, interfaceC4225, i, enumC3602);
        this.f6651 = interfaceC5140;
    }
}
