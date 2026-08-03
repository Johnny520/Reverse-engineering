package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4910 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤ۟$ۥ */
    public static final class C0538<T> implements InterfaceC4892<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<T, InterfaceC4199<? super C8107>, Object> f11374;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤ۟$ۥ$ۥ, reason: contains not printable characters */
        public static final class C4911 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11375;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public int f11377;

            public C4911(InterfaceC4199<? super C4911> interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11375 = obj;
                this.f11377 |= Integer.MIN_VALUE;
                return C0538.this.mo10059(null, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۢ<? super T, ? super Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, ? extends java.lang.Object> */
        /* JADX WARN: Multi-variable type inference failed */
        public C0538(InterfaceC5138<? super T, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138) {
            this.f11374 = interfaceC5138;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public Object m1813(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C5437.m16931(4);
            new C4911(interfaceC4199);
            C5437.m16931(5);
            this.f11374.invoke(t, interfaceC4199);
            return C8107.f3222;
        }

        @Override // Yue.InterfaceC4892
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            Object objInvoke = this.f11374.invoke(t, interfaceC4199);
            return objInvoke == C5508.m17142() ? objInvoke : C8107.f3222;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤ۟$ۥ۟ */
    public static final class C0539<T> implements InterfaceC4892<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f11378;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5140<Integer, T, InterfaceC4199<? super C8107>, Object> f11379;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤ۟$ۥ۟$ۥ, reason: contains not printable characters */
        public static final class C4912 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11380;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public int f11382;

            public C4912(InterfaceC4199<? super C4912> interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11380 = obj;
                this.f11382 |= Integer.MIN_VALUE;
                return C0539.this.mo10059(null, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۤ<? super java.lang.Integer, ? super T, ? super Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, ? extends java.lang.Object> */
        /* JADX WARN: Multi-variable type inference failed */
        public C0539(InterfaceC5140<? super Integer, ? super T, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5140) {
            this.f11379 = interfaceC5140;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public Object m1814(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C5437.m16931(4);
            new C4912(interfaceC4199);
            C5437.m16931(5);
            InterfaceC5140<Integer, T, InterfaceC4199<? super C8107>, Object> interfaceC5140 = this.f11379;
            int i = this.f11378;
            this.f11378 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            interfaceC5140.mo15350(Integer.valueOf(i), t, interfaceC4199);
            return C8107.f3222;
        }

        @Override // Yue.InterfaceC4892
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            InterfaceC5140<Integer, T, InterfaceC4199<? super C8107>, Object> interfaceC5140 = this.f11379;
            int i = this.f11378;
            this.f11378 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            Object objMo15350 = interfaceC5140.mo15350(C3590.m9584(i), t, interfaceC4199);
            return objMo15350 == C5508.m17142() ? objMo15350 : C8107.f3222;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤ۟$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", m1273f = "Collect.kt", m1274i = {}, m1275l = {50}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C4913 extends AbstractC7690 implements InterfaceC5138<InterfaceC4243, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f11383;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4890<T> f11384;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۡ<? extends T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4913(InterfaceC4890<? extends T> interfaceC4890, InterfaceC4199<? super C4913> interfaceC4199) {
            super(2, interfaceC4199);
            this.f11384 = interfaceC4890;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            return new C4913(this.f11384, interfaceC4199);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        public final Object invoke(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C4913) create(interfaceC4243, interfaceC4199)).invokeSuspend(C8107.f3222);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            Object objM17142 = C5508.m17142();
            int i = this.f11383;
            if (i == 0) {
                C7149.m22422(obj);
                InterfaceC4890<T> interfaceC4890 = this.f11384;
                this.f11383 = 1;
                if (C4896.m15168(interfaceC4890, this) == objM17142) {
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

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public static final Object m1811(@InterfaceC6399 InterfaceC4890<?> interfaceC4890, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        Object objMo48 = interfaceC4890.mo48(C6395.f16165, interfaceC4199);
        return objMo48 == C5508.m17142() ? objMo48 : C8107.f3222;
    }

    @InterfaceC4372(level = EnumC0393.f8972, message = "Backwards compatibility with JS and K/N")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final /* synthetic */ <T> Object m1812(InterfaceC4890<? extends T> interfaceC4890, InterfaceC5138<? super T, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138, InterfaceC4199<? super C8107> interfaceC4199) {
        Object objMo48 = interfaceC4890.mo48(new C0538(interfaceC5138), interfaceC4199);
        return objMo48 == C5508.m17142() ? objMo48 : C8107.f3222;
    }

    @InterfaceC4372(level = EnumC0393.f8972, message = "Backwards compatibility with JS and K/N")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ <T> Object m15326(InterfaceC4890<? extends T> interfaceC4890, InterfaceC5138<? super T, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138, InterfaceC4199<? super C8107> interfaceC4199) {
        C0538 c0538 = new C0538(interfaceC5138);
        C5437.m16931(0);
        interfaceC4890.mo48(c0538, interfaceC4199);
        C5437.m16931(1);
        return C8107.f3222;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> Object m15327(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5140<? super Integer, ? super T, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5140, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        Object objMo48 = interfaceC4890.mo48(new C0539(interfaceC5140), interfaceC4199);
        return objMo48 == C5508.m17142() ? objMo48 : C8107.f3222;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> Object m15328(InterfaceC4890<? extends T> interfaceC4890, InterfaceC5140<? super Integer, ? super T, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5140, InterfaceC4199<? super C8107> interfaceC4199) {
        C0539 c0539 = new C0539(interfaceC5140);
        C5437.m16931(0);
        interfaceC4890.mo48(c0539, interfaceC4199);
        C5437.m16931(1);
        return C8107.f3222;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> Object m15329(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5138<? super T, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        Object objM15168 = C4896.m15168(C4915.m15336(C4896.m15245(interfaceC4890, interfaceC5138), 0, null, 2, null), interfaceC4199);
        return objM15168 == C5508.m17142() ? objM15168 : C8107.f3222;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> Object m15330(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        C4896.m15211(interfaceC4892);
        Object objMo48 = interfaceC4890.mo48(interfaceC4892, interfaceC4199);
        return objMo48 == C5508.m17142() ? objMo48 : C8107.f3222;
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥۣ۟ۤ۠.ۥ۟۟۟۟(Yue.ۥ۟ۧۧۥ, Yue.ۥ۟ۧۦۥ, Yue.ۥ۟ۧۨ, Yue.ۥۣ۠ۢۢ, int, java.lang.Object):Yue.ۥ۠ۦ۟ۡ */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> InterfaceC5542 m15331(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4243 interfaceC4243) {
        return C3617.m9760(interfaceC4243, null, null, new C4913(interfaceC4890, null), 3, null);
    }
}
