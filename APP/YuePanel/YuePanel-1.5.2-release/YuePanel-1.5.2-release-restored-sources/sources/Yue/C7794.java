package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7794 {

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۡ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.TickerChannelsKt", m1273f = "TickerChannels.kt", m1274i = {0, 0, 1, 1, 2, 2}, m1275l = {106, 108, 109}, m1276m = "fixedDelayTicker", m1277n = {"channel", "delayMillis", "channel", "delayMillis", "channel", "delayMillis"}, m1278s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    public static final class C1359 extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public long f23339;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f23340;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ Object f23341;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f23342;

        public C1359(InterfaceC4199<? super C1359> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f23341 = obj;
            this.f23342 |= Integer.MIN_VALUE;
            return C7794.m24758(0L, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۡ$ۥ۟ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.TickerChannelsKt", m1273f = "TickerChannels.kt", m1274i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, m1275l = {84, 88, 94, 96}, m1276m = "fixedPeriodTicker", m1277n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, m1278s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    public static final class C1360 extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public long f23343;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public long f23344;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f23345;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f23346;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f23347;

        public C1360(InterfaceC4199<? super C1360> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f23346 = obj;
            this.f23347 |= Integer.MIN_VALUE;
            return C7794.m24759(0L, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۡ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", m1273f = "TickerChannels.kt", m1274i = {}, m1275l = {72, 73}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C7795 extends AbstractC7690 implements InterfaceC5138<InterfaceC6809<? super C8107>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f23348;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f23349;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ EnumC7796 f23350;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ long f23351;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ long f23352;

        /* JADX INFO: renamed from: Yue.ۥۣۢۡۡ$ۥ۟۟$ۥ */
        public /* synthetic */ class C1361 {

            /* JADX INFO: renamed from: ۥ */
            public static final /* synthetic */ int[] f3085;

            static {
                int[] iArr = new int[EnumC7796.values().length];
                iArr[EnumC7796.FIXED_PERIOD.ordinal()] = 1;
                iArr[EnumC7796.FIXED_DELAY.ordinal()] = 2;
                f3085 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7795(EnumC7796 enumC7796, long j, long j2, InterfaceC4199<? super C7795> interfaceC4199) {
            super(2, interfaceC4199);
            this.f23350 = enumC7796;
            this.f23351 = j;
            this.f23352 = j2;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C7795 c7795 = new C7795(this.f23350, this.f23351, this.f23352, interfaceC4199);
            c7795.f23349 = obj;
            return c7795;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            Object objM17142 = C5508.m17142();
            int i = this.f23348;
            if (i == 0) {
                C7149.m22422(obj);
                InterfaceC6809 interfaceC6809 = (InterfaceC6809) this.f23349;
                int i2 = C1361.f3085[this.f23350.ordinal()];
                if (i2 == 1) {
                    long j = this.f23351;
                    long j2 = this.f23352;
                    InterfaceC7317 interfaceC7317Mo643 = interfaceC6809.mo643();
                    this.f23348 = 1;
                    if (C7794.m24759(j, j2, interfaceC7317Mo643, this) == objM17142) {
                        return objM17142;
                    }
                } else if (i2 == 2) {
                    long j3 = this.f23351;
                    long j4 = this.f23352;
                    InterfaceC7317 interfaceC7317Mo6432 = interfaceC6809.mo643();
                    this.f23348 = 2;
                    if (C7794.m24758(j3, j4, interfaceC7317Mo6432, this) == objM17142) {
                        return objM17142;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
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
        public final Object invoke(@InterfaceC6399 InterfaceC6809<? super C8107> interfaceC6809, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C7795) create(interfaceC6809, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007d -> B:14:0x0034). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m24758(long j, long j2, InterfaceC7317<? super C8107> interfaceC7317, InterfaceC4199<? super C8107> interfaceC4199) {
        C1359 c1359;
        InterfaceC7317<? super C8107> interfaceC73172;
        if (interfaceC4199 instanceof C1359) {
            c1359 = (C1359) interfaceC4199;
            int i = c1359.f23342;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1359.f23342 = i - Integer.MIN_VALUE;
            } else {
                c1359 = new C1359(interfaceC4199);
            }
        }
        Object obj = c1359.f23341;
        Object objM17142 = C5508.m17142();
        int i2 = c1359.f23342;
        if (i2 == 0) {
            C7149.m22422(obj);
            c1359.f23340 = interfaceC7317;
            c1359.f23339 = j;
            c1359.f23342 = 1;
            if (C4365.m1323(j2, c1359) == objM17142) {
                return objM17142;
            }
        } else if (i2 == 1) {
            j = c1359.f23339;
            interfaceC7317 = (InterfaceC7317) c1359.f23340;
            C7149.m22422(obj);
        } else if (i2 == 2) {
            j = c1359.f23339;
            interfaceC73172 = (InterfaceC7317) c1359.f23340;
            C7149.m22422(obj);
            c1359.f23340 = interfaceC73172;
            c1359.f23339 = j;
            c1359.f23342 = 3;
            if (C4365.m1323(j, c1359) == objM17142) {
                return objM17142;
            }
            interfaceC7317 = interfaceC73172;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c1359.f23339;
            interfaceC73172 = (InterfaceC7317) c1359.f23340;
            C7149.m22422(obj);
            interfaceC7317 = interfaceC73172;
        }
        C8107 c8107 = C8107.f3222;
        c1359.f23340 = interfaceC7317;
        c1359.f23339 = j;
        c1359.f23342 = 2;
        if (interfaceC7317.mo5844(c8107, c1359) != objM17142) {
            return objM17142;
        }
        interfaceC73172 = interfaceC7317;
        c1359.f23340 = interfaceC73172;
        c1359.f23339 = j;
        c1359.f23342 = 3;
        if (C4365.m1323(j, c1359) == objM17142) {
        }
        interfaceC7317 = interfaceC73172;
        C8107 c81072 = C8107.f3222;
        c1359.f23340 = interfaceC7317;
        c1359.f23339 = j;
        c1359.f23342 = 2;
        if (interfaceC7317.mo5844(c81072, c1359) != objM17142) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fc -> B:31:0x00aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0112 -> B:15:0x003d). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m24759(long j, long j2, InterfaceC7317<? super C8107> interfaceC7317, InterfaceC4199<? super C8107> interfaceC4199) {
        C1360 c1360;
        InterfaceC7317 interfaceC73172;
        long j3;
        long j4;
        long jM14110;
        long j5;
        long j6;
        InterfaceC7317 interfaceC73173;
        char c;
        long j7;
        long jM21662;
        char c2;
        long jM14109;
        char c3;
        C8107 c8107;
        if (interfaceC4199 instanceof C1360) {
            c1360 = (C1360) interfaceC4199;
            int i = c1360.f23347;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1360.f23347 = i - Integer.MIN_VALUE;
            } else {
                c1360 = new C1360(interfaceC4199);
            }
        }
        Object obj = c1360.f23346;
        Object objM17142 = C5508.m17142();
        int i2 = c1360.f23347;
        if (i2 == 0) {
            C7149.m22422(obj);
            AbstractC3018 abstractC3018M84 = C3019.m84();
            long jM82 = (abstractC3018M84 != null ? abstractC3018M84.m82() : System.nanoTime()) + C4720.m14110(j2);
            interfaceC73172 = interfaceC7317;
            c1360.f23345 = interfaceC73172;
            j3 = j;
            c1360.f23343 = j3;
            c1360.f23344 = jM82;
            c1360.f23347 = 1;
            if (C4365.m1323(j2, c1360) == objM17142) {
                return objM17142;
            }
            j4 = jM82;
        } else if (i2 == 1) {
            j4 = c1360.f23344;
            long j8 = c1360.f23343;
            InterfaceC7317 interfaceC73174 = (InterfaceC7317) c1360.f23345;
            C7149.m22422(obj);
            interfaceC73172 = interfaceC73174;
            j3 = j8;
        } else if (i2 == 2) {
            j6 = c1360.f23344;
            j7 = c1360.f23343;
            interfaceC73173 = (InterfaceC7317) c1360.f23345;
            C7149.m22422(obj);
            AbstractC3018 abstractC3018M842 = C3019.m84();
            if (abstractC3018M842 == null) {
            }
            jM21662 = C7007.m21662(j7 - jM82, 0L);
            if (jM21662 == 0) {
            }
            c2 = 3;
            jM14109 = C4720.m14109(jM21662);
            c1360.f23345 = interfaceC73173;
            c1360.f23343 = j7;
            c1360.f23344 = j6;
            c3 = 4;
            c1360.f23347 = 4;
            if (C4365.m1323(jM14109, c1360) == objM17142) {
            }
            long j9 = j6;
            j4 = j7;
            jM14110 = j9;
            interfaceC73172 = interfaceC73173;
            long j10 = j4 + jM14110;
            c8107 = C8107.f3222;
            c1360.f23345 = interfaceC73172;
            c1360.f23343 = j10;
            c1360.f23344 = jM14110;
            c1360.f23347 = 2;
            if (interfaceC73172.mo5844(c8107, c1360) != objM17142) {
            }
        } else if (i2 == 3) {
            j6 = c1360.f23344;
            j5 = c1360.f23343;
            interfaceC73173 = (InterfaceC7317) c1360.f23345;
            C7149.m22422(obj);
            c = 3;
            long j11 = j6;
            j4 = j5;
            jM14110 = j11;
            interfaceC73172 = interfaceC73173;
            long j102 = j4 + jM14110;
            c8107 = C8107.f3222;
            c1360.f23345 = interfaceC73172;
            c1360.f23343 = j102;
            c1360.f23344 = jM14110;
            c1360.f23347 = 2;
            if (interfaceC73172.mo5844(c8107, c1360) != objM17142) {
            }
        } else {
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j6 = c1360.f23344;
            j7 = c1360.f23343;
            interfaceC73173 = (InterfaceC7317) c1360.f23345;
            C7149.m22422(obj);
            c3 = 4;
            c2 = 3;
            long j92 = j6;
            j4 = j7;
            jM14110 = j92;
            interfaceC73172 = interfaceC73173;
            long j1022 = j4 + jM14110;
            c8107 = C8107.f3222;
            c1360.f23345 = interfaceC73172;
            c1360.f23343 = j1022;
            c1360.f23344 = jM14110;
            c1360.f23347 = 2;
            if (interfaceC73172.mo5844(c8107, c1360) != objM17142) {
                return objM17142;
            }
            interfaceC73173 = interfaceC73172;
            j6 = jM14110;
            j7 = j1022;
            AbstractC3018 abstractC3018M8422 = C3019.m84();
            long jM822 = abstractC3018M8422 == null ? abstractC3018M8422.m82() : System.nanoTime();
            jM21662 = C7007.m21662(j7 - jM822, 0L);
            if (jM21662 == 0 || j6 == 0) {
                c2 = 3;
                jM14109 = C4720.m14109(jM21662);
                c1360.f23345 = interfaceC73173;
                c1360.f23343 = j7;
                c1360.f23344 = j6;
                c3 = 4;
                c1360.f23347 = 4;
                if (C4365.m1323(jM14109, c1360) == objM17142) {
                    return objM17142;
                }
                long j922 = j6;
                j4 = j7;
                jM14110 = j922;
                interfaceC73172 = interfaceC73173;
                long j10222 = j4 + jM14110;
                c8107 = C8107.f3222;
                c1360.f23345 = interfaceC73172;
                c1360.f23343 = j10222;
                c1360.f23344 = jM14110;
                c1360.f23347 = 2;
                if (interfaceC73172.mo5844(c8107, c1360) != objM17142) {
                }
            } else {
                long j12 = j6 - ((jM822 - j7) % j6);
                j5 = jM822 + j12;
                long jM141092 = C4720.m14109(j12);
                c1360.f23345 = interfaceC73173;
                c1360.f23343 = j5;
                c1360.f23344 = j6;
                c = 3;
                c1360.f23347 = 3;
                if (C4365.m1323(jM141092, c1360) == objM17142) {
                    return objM17142;
                }
                long j112 = j6;
                j4 = j5;
                jM14110 = j112;
                interfaceC73172 = interfaceC73173;
                long j102222 = j4 + jM14110;
                c8107 = C8107.f3222;
                c1360.f23345 = interfaceC73172;
                c1360.f23343 = j102222;
                c1360.f23344 = jM14110;
                c1360.f23347 = 2;
                if (interfaceC73172.mo5844(c8107, c1360) != objM17142) {
                }
            }
        }
        jM14110 = C4720.m14110(j3);
        long j1022222 = j4 + jM14110;
        c8107 = C8107.f3222;
        c1360.f23345 = interfaceC73172;
        c1360.f23343 = j1022222;
        c1360.f23344 = jM14110;
        c1360.f23347 = 2;
        if (interfaceC73172.mo5844(c8107, c1360) != objM17142) {
        }
    }

    @InterfaceC6399
    @InterfaceC6501
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final InterfaceC7042<C8107> m24760(long j, long j2, @InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 EnumC7796 enumC7796) {
        if (j < 0) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j + " ms").toString());
        }
        if (j2 >= 0) {
            return C6806.m21525(C5178.f12230, C4423.m12874().plus(interfaceC4225), 0, new C7795(enumC7796, j, j2, null));
        }
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j2 + " ms").toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7042 m24761(long j, long j2, InterfaceC4225 interfaceC4225, EnumC7796 enumC7796, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = j;
        }
        if ((i & 4) != 0) {
            interfaceC4225 = C4629.f9940;
        }
        if ((i & 8) != 0) {
            enumC7796 = EnumC7796.FIXED_PERIOD;
        }
        return m24760(j, j2, interfaceC4225, enumC7796);
    }
}
