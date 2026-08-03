package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4964 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", m1273f = "Migration.kt", m1274i = {}, m1275l = {427}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C0580<T> extends AbstractC7690 implements InterfaceC5138<T, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f11628;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ long f11629;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0580(long j, InterfaceC4199<? super C0580> interfaceC4199) {
            super(2, interfaceC4199);
            this.f11629 = j;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            return new C0580(this.f11629, interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            Object objM17142 = C5508.m17142();
            int i = this.f11628;
            if (i == 0) {
                C7149.m22422(obj);
                long j = this.f11629;
                this.f11628 = 1;
                if (C4365.m1323(j, this) == objM17142) {
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
        public final Object invoke(T t, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C0580) create(t, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ$ۥ۟ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", m1273f = "Migration.kt", m1274i = {}, m1275l = {415}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C0581<T> extends AbstractC7690 implements InterfaceC5138<InterfaceC4892<? super T>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f11630;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ long f11631;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0581(long j, InterfaceC4199<? super C0581> interfaceC4199) {
            super(2, interfaceC4199);
            this.f11631 = j;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            return new C0581(this.f11631, interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            Object objM17142 = C5508.m17142();
            int i = this.f11630;
            if (i == 0) {
                C7149.m22422(obj);
                long j = this.f11631;
                this.f11630 = 1;
                if (C4365.m1323(j, this) == objM17142) {
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
            return ((C0581) create(interfaceC4892, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ$ۥ۟۟, reason: contains not printable characters */
    public static final class C4965 extends AbstractC5673 implements InterfaceC5124<Throwable, Boolean> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C4965 f11632 = new C4965();

        public C4965() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Boolean invoke(@InterfaceC6399 Throwable th) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", m1273f = "Migration.kt", m1274i = {}, m1275l = {306}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C4966<T> extends AbstractC7690 implements InterfaceC5140<InterfaceC4892<? super T>, Throwable, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f11633;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f11634;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ Object f11635;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<Throwable, Boolean> f11636;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ T f11637;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۡ۟<? super java.lang.Throwable, java.lang.Boolean> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4966(InterfaceC5124<? super Throwable, Boolean> interfaceC5124, T t, InterfaceC4199<? super C4966> interfaceC4199) {
            super(3, interfaceC4199);
            this.f11636 = interfaceC5124;
            this.f11637 = t;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) throws Throwable {
            Object objM17142 = C5508.m17142();
            int i = this.f11633;
            if (i == 0) {
                C7149.m22422(obj);
                InterfaceC4892 interfaceC4892 = (InterfaceC4892) this.f11634;
                Throwable th = (Throwable) this.f11635;
                if (!this.f11636.invoke(th).booleanValue()) {
                    throw th;
                }
                T t = this.f11637;
                this.f11634 = null;
                this.f11633 = 1;
                if (interfaceC4892.mo10059(t, this) == objM17142) {
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

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5140
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object mo15350(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 Throwable th, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            C4966 c4966 = new C4966(this.f11636, this.f11637, interfaceC4199);
            c4966.f11634 = interfaceC4892;
            c4966.f11635 = th;
            return c4966.invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", m1273f = "Migration.kt", m1274i = {}, m1275l = {190, 190}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C4967<R, T> extends AbstractC7690 implements InterfaceC5140<InterfaceC4892<? super R>, T, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f11638;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f11639;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ Object f11640;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138 f11641;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4967(InterfaceC5138 interfaceC5138, InterfaceC4199 interfaceC4199) {
            super(3, interfaceC4199);
            this.f11641 = interfaceC5138;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            InterfaceC4892 interfaceC4892;
            Object objM17142 = C5508.m17142();
            int i = this.f11638;
            if (i == 0) {
                C7149.m22422(obj);
                interfaceC4892 = (InterfaceC4892) this.f11639;
                Object obj2 = this.f11640;
                InterfaceC5138 interfaceC5138 = this.f11641;
                this.f11639 = interfaceC4892;
                this.f11638 = 1;
                obj = interfaceC5138.invoke(obj2, this);
                if (obj == objM17142) {
                    return objM17142;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7149.m22422(obj);
                    return C8107.f3222;
                }
                interfaceC4892 = (InterfaceC4892) this.f11639;
                C7149.m22422(obj);
            }
            this.f11639 = null;
            this.f11638 = 2;
            if (C4896.m15208(interfaceC4892, (InterfaceC4890) obj, this) == objM17142) {
                return objM17142;
            }
            return C8107.f3222;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5140
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object mo15350(@InterfaceC6399 InterfaceC4892<? super R> interfaceC4892, T t, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            C4967 c4967 = new C4967(this.f11641, interfaceC4199);
            c4967.f11639 = interfaceC4892;
            c4967.f11640 = t;
            return c4967.invokeSuspend(C8107.f3222);
        }
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @InterfaceC7097(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    /* JADX INFO: renamed from: ۥ */
    public static final <T> InterfaceC4890<T> m1837(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @InterfaceC7097(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T1, T2, T3, T4, T5, R> InterfaceC4890<R> m1838(@InterfaceC6399 InterfaceC4890<? extends T1> interfaceC4890, @InterfaceC6399 InterfaceC4890<? extends T2> interfaceC48902, @InterfaceC6399 InterfaceC4890<? extends T3> interfaceC48903, @InterfaceC6399 InterfaceC4890<? extends T4> interfaceC48904, @InterfaceC6399 InterfaceC4890<? extends T5> interfaceC48905, @InterfaceC6399 InterfaceC5143<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5143) {
        return C4896.m15173(interfaceC4890, interfaceC48902, interfaceC48903, interfaceC48904, interfaceC48905, interfaceC5143);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @InterfaceC7097(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T1, T2, T3, T4, R> InterfaceC4890<R> m15405(@InterfaceC6399 InterfaceC4890<? extends T1> interfaceC4890, @InterfaceC6399 InterfaceC4890<? extends T2> interfaceC48902, @InterfaceC6399 InterfaceC4890<? extends T3> interfaceC48903, @InterfaceC6399 InterfaceC4890<? extends T4> interfaceC48904, @InterfaceC6399 InterfaceC5142<? super T1, ? super T2, ? super T3, ? super T4, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5142) {
        return C4896.m15174(interfaceC4890, interfaceC48902, interfaceC48903, interfaceC48904, interfaceC5142);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @InterfaceC7097(expression = "combine(this, other, other2, transform)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T1, T2, T3, R> InterfaceC4890<R> m15406(@InterfaceC6399 InterfaceC4890<? extends T1> interfaceC4890, @InterfaceC6399 InterfaceC4890<? extends T2> interfaceC48902, @InterfaceC6399 InterfaceC4890<? extends T3> interfaceC48903, @InterfaceC6399 InterfaceC5141<? super T1, ? super T2, ? super T3, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5141) {
        return C4896.m15175(interfaceC4890, interfaceC48902, interfaceC48903, interfaceC5141);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @InterfaceC7097(expression = "this.combine(other, transform)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T1, T2, R> InterfaceC4890<R> m15407(@InterfaceC6399 InterfaceC4890<? extends T1> interfaceC4890, @InterfaceC6399 InterfaceC4890<? extends T2> interfaceC48902, @InterfaceC6399 InterfaceC5140<? super T1, ? super T2, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5140) {
        return C4896.m15176(interfaceC4890, interfaceC48902, interfaceC5140);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue of 'compose' is 'let'", replaceWith = @InterfaceC7097(expression = "let(transformer)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T, R> InterfaceC4890<R> m15408(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5124<? super InterfaceC4890<? extends T>, ? extends InterfaceC4890<? extends R>> interfaceC5124) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @InterfaceC7097(expression = "flatMapConcat(mapper)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T, R> InterfaceC4890<R> m15409(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5124<? super T, ? extends InterfaceC4890<? extends R>> interfaceC5124) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @InterfaceC7097(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15410(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4890<? extends T> interfaceC48902) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @InterfaceC7097(expression = "onCompletion { emit(value) }", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15411(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, T t) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @InterfaceC7097(expression = "onEach { delay(timeMillis) }", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15412(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, long j) {
        return C4896.m15253(interfaceC4890, new C0580(j, null));
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @InterfaceC7097(expression = "onStart { delay(timeMillis) }", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15413(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, long j) {
        return C4896.m15260(interfaceC4890, new C0581(j, null));
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue is 'flatMapConcat'", replaceWith = @InterfaceC7097(expression = "flatMapConcat(mapper)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final <T, R> InterfaceC4890<R> m15414(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5138<? super T, ? super InterfaceC4199<? super InterfaceC4890<? extends R>>, ? extends Object> interfaceC5138) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @InterfaceC7097(expression = "flattenConcat()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15415(@InterfaceC6399 InterfaceC4890<? extends InterfaceC4890<? extends T>> interfaceC4890) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @InterfaceC7097(expression = "collect(action)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final <T> void m15416(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5138<? super T, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @InterfaceC7097(expression = "flattenConcat()", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15417(@InterfaceC6399 InterfaceC4890<? extends InterfaceC4890<? extends T>> interfaceC4890) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final Void m15418() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Collect flow in the desired context instead")
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15419(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @InterfaceC7097(expression = "catch { emitAll(fallback) }", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15420(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4890<? extends T> interfaceC48902) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @InterfaceC7097(expression = "catch { emitAll(fallback) }", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15421(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4890<? extends T> interfaceC48902) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @InterfaceC7097(expression = "catch { emit(fallback) }", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15422(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, T t) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @InterfaceC7097(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15423(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, T t, @InterfaceC6399 InterfaceC5124<? super Throwable, Boolean> interfaceC5124) {
        return C4896.m15165(interfaceC4890, new C4966(interfaceC5124, t, null));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC4890 m15424(InterfaceC4890 interfaceC4890, Object obj, InterfaceC5124 interfaceC5124, int i, Object obj2) {
        if ((i & 2) != 0) {
            interfaceC5124 = C4965.f11632;
        }
        return C4896.m15258(interfaceC4890, obj, interfaceC5124);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @InterfaceC7097(expression = "this.shareIn(scope, 0)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15425(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @InterfaceC7097(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15426(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, int i) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Collect flow in the desired context instead")
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15427(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @InterfaceC7097(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15428(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @InterfaceC7097(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15429(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, int i) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow has less verbose 'scan' shortcut", replaceWith = @InterfaceC7097(expression = "scan(initial, operation)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final <T, R> InterfaceC4890<R> m15430(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, R r, @InterfaceC6399 @InterfaceC3614 InterfaceC5140<? super R, ? super T, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5140) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @InterfaceC7097(expression = "runningReduce(operation)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15431(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5140<? super T, ? super T, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5140) {
        return C4896.m15274(interfaceC4890, interfaceC5140);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @InterfaceC7097(expression = "drop(count)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15432(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, int i) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @InterfaceC7097(expression = "onStart { emitAll(other) }", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15433(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4890<? extends T> interfaceC48902) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @InterfaceC7097(expression = "onStart { emit(value) }", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15434(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, T t) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final <T> void m15435(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final <T> void m15436(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5138<? super T, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final <T> void m15437(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5138<? super T, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC5138<? super Throwable, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC51382) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Use 'flowOn' instead")
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15438(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
        C4896.m15250();
        throw new C5667();
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @InterfaceC7097(expression = "this.flatMapLatest(transform)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final <T, R> InterfaceC4890<R> m15439(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5138<? super T, ? super InterfaceC4199<? super InterfaceC4890<? extends R>>, ? extends Object> interfaceC5138) {
        return C4896.m15302(interfaceC4890, new C4967(interfaceC5138, null));
    }
}
