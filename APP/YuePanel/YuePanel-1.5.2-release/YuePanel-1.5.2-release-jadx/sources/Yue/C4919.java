package Yue;

import Yue.C3732;
import Yue.C7060;
import com.android.p001dx.p004io.Opcodes;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4919 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۤ$ۥ */
    public static final class C0545<T> extends AbstractC5673 implements InterfaceC5124<T, Long> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ long f11402;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0545(long j) {
            super(1);
            this.f11402 = j;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Long invoke(T t) {
            return Long.valueOf(this.f11402);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۤ$ۥ۟ */
    public static final class C0546<T> extends AbstractC5673 implements InterfaceC5124<T, Long> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<T, C4555> f11403;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۡ۟<? super T, Yue.ۥ۠۠ۢۥ> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0546(InterfaceC5124<? super T, C4555> interfaceC5124) {
            super(1);
            this.f11403 = interfaceC5124;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Long invoke(T t) {
            return Long.valueOf(C4365.m12621(this.f11403.invoke(t).m13461()));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۤ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", m1273f = "Delay.kt", m1274i = {0, 0, 0, 0, 1, 1, 1, 1}, m1275l = {Opcodes.OR_INT_LIT8, 355}, m1276m = "invokeSuspend", m1277n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue", "timeoutMillis"}, m1278s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    public static final class C4920<T> extends AbstractC7690 implements InterfaceC5140<InterfaceC4243, InterfaceC4892<? super T>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f11404;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f11405;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f11406;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f11407;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public /* synthetic */ Object f11408;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<T, Long> f11409;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4890<T> f11410;

        /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۤ$ۥ۟۟$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", m1273f = "Delay.kt", m1274i = {}, m1275l = {233}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
        public static final class C0547 extends AbstractC7690 implements InterfaceC5124<InterfaceC4199<? super C8107>, Object> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public int f11411;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC4892<T> f11412;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ C7060.C7066<Object> f11413;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣۣ۠ۢ<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0547(InterfaceC4892<? super T> interfaceC4892, C7060.C7066<Object> c7066, InterfaceC4199<? super C0547> interfaceC4199) {
                super(1, interfaceC4199);
                this.f11412 = interfaceC4892;
                this.f11413 = c7066;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6399
            public final InterfaceC4199<C8107> create(@InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
                return new C0547(this.f11412, this.f11413, interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                Object objM17142 = C5508.m17142();
                int i = this.f11411;
                if (i == 0) {
                    C7149.m22422(obj);
                    InterfaceC4892<T> interfaceC4892 = this.f11412;
                    C7694 c7694 = C6488.f2113;
                    T t = this.f11413.f21353;
                    if (t == c7694) {
                        t = null;
                    }
                    this.f11411 = 1;
                    if (interfaceC4892.mo10059(t, this) == objM17142) {
                        return objM17142;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7149.m22422(obj);
                }
                this.f11413.f21353 = null;
                return C8107.f3222;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // Yue.InterfaceC5124
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public final Object invoke(@InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
                return ((C0547) create(interfaceC4199)).invokeSuspend(C8107.f3222);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۤ$ۥ۟۟$ۥ۟ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", m1273f = "Delay.kt", m1274i = {0}, m1275l = {243}, m1276m = "invokeSuspend", m1277n = {"$this$onFailure_u2dWpGqRn0$iv"}, m1278s = {"L$0"})
        public static final class C0548 extends AbstractC7690 implements InterfaceC5138<C3732<? extends Object>, InterfaceC4199<? super C8107>, Object> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public Object f11414;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f11415;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public /* synthetic */ Object f11416;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final /* synthetic */ C7060.C7066<Object> f11417;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC4892<T> f11418;

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣۣ۠ۢ<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0548(C7060.C7066<Object> c7066, InterfaceC4892<? super T> interfaceC4892, InterfaceC4199<? super C0548> interfaceC4199) {
                super(2, interfaceC4199);
                this.f11417 = c7066;
                this.f11418 = interfaceC4892;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6399
            public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
                C0548 c0548 = new C0548(this.f11417, this.f11418, interfaceC4199);
                c0548.f11416 = obj;
                return c0548;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // Yue.InterfaceC5138
            public /* bridge */ /* synthetic */ Object invoke(C3732<? extends Object> c3732, InterfaceC4199<? super C8107> interfaceC4199) {
                return m15353(c3732.m10211(), interfaceC4199);
            }

            /* JADX WARN: Type inference failed for: r7v6, types: [T, Yue.ۥۢ۠ۦۢ] */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type Yue.ￛﾥￛﾟￛﾧￛﾤￛﾢ to Yue.ￛﾥￛﾠￛﾢￛﾤￛﾣ$ￛﾥￛﾟￛﾟ$ￛﾥￛﾟ for r6v1 'this'  Yue.ￛﾥￛﾟￛﾧￛﾤￛﾢ
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // Yue.AbstractC3513
            @Yue.InterfaceC6489
            public final java.lang.Object invokeSuspend(@Yue.InterfaceC6399 java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = Yue.C5508.m17142()
                    int r1 = r6.f11415
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r0 = r6.f11414
                    Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ r0 = (Yue.C7060.C7066) r0
                    Yue.C7149.m22422(r7)
                    goto L4f
                L13:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1b:
                    Yue.C7149.m22422(r7)
                    java.lang.Object r7 = r6.f11416
                    Yue.ۥ۟ۤۢ۟ r7 = (Yue.C3732) r7
                    java.lang.Object r7 = r7.m10211()
                    Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ<java.lang.Object> r1 = r6.f11417
                    boolean r3 = r7 instanceof Yue.C3732.C3733
                    if (r3 != 0) goto L2e
                    r1.f21353 = r7
                L2e:
                    Yue.ۥۣۣ۠ۢ<T> r4 = r6.f11418
                    if (r3 == 0) goto L56
                    java.lang.Throwable r3 = Yue.C3732.m10202(r7)
                    if (r3 != 0) goto L55
                    T r3 = r1.f21353
                    if (r3 == 0) goto L50
                    Yue.ۥۢ۠ۦۢ r5 = Yue.C6488.f2113
                    if (r3 != r5) goto L41
                    r3 = 0
                L41:
                    r6.f11416 = r7
                    r6.f11414 = r1
                    r6.f11415 = r2
                    java.lang.Object r7 = r4.mo10059(r3, r6)
                    if (r7 != r0) goto L4e
                    return r0
                L4e:
                    r0 = r1
                L4f:
                    r1 = r0
                L50:
                    Yue.ۥۢ۠ۦۢ r7 = Yue.C6488.f16674
                    r1.f21353 = r7
                    goto L56
                L55:
                    throw r3
                L56:
                    Yue.ۥۣۢ۠ۤ r7 = Yue.C8107.f3222
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: Yue.C4919.C4920.C0548.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final Object m15353(@InterfaceC6399 Object obj, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
                return ((C0548) create(C3732.m806(obj), interfaceC4199)).invokeSuspend(C8107.f3222);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۤ$ۥ۟۟$ۥ۟۟, reason: contains not printable characters */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", m1273f = "Delay.kt", m1274i = {}, m1275l = {Opcodes.DIV_INT_LIT16}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
        public static final class C4921 extends AbstractC7690 implements InterfaceC5138<InterfaceC6809<? super Object>, InterfaceC4199<? super C8107>, Object> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public int f11419;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public /* synthetic */ Object f11420;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC4890<T> f11421;

            /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۤ$ۥ۟۟$ۥ۟۟$ۥ */
            public static final class C0549<T> implements InterfaceC4892 {

                /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC6809<Object> f11422;

                /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۤ$ۥ۟۟$ۥ۟۟$ۥ$ۥ, reason: contains not printable characters */
                @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", m1273f = "Delay.kt", m1274i = {}, m1275l = {Opcodes.DIV_INT_LIT16}, m1276m = "emit", m1277n = {}, m1278s = {})
                public static final class C4922 extends AbstractC4201 {

                    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
                    public /* synthetic */ Object f11423;

                    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
                    public final /* synthetic */ C0549<T> f11424;

                    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
                    public int f11425;

                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۤ$ۥ۟۟$ۥ۟۟$ۥ<? super T> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C4922(C0549<? super T> c0549, InterfaceC4199<? super C4922> interfaceC4199) {
                        super(interfaceC4199);
                        this.f11424 = c0549;
                    }

                    @Override // Yue.AbstractC3513
                    @InterfaceC6489
                    public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                        this.f11423 = obj;
                        this.f11425 |= Integer.MIN_VALUE;
                        return this.f11424.mo10059(null, this);
                    }
                }

                public C0549(InterfaceC6809<Object> interfaceC6809) {
                    this.f11422 = interfaceC6809;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // Yue.InterfaceC4892
                @InterfaceC6489
                /* JADX INFO: renamed from: ۥ۟۟۟۟ */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
                    C4922 c4922;
                    if (interfaceC4199 instanceof C4922) {
                        c4922 = (C4922) interfaceC4199;
                        int i = c4922.f11425;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c4922.f11425 = i - Integer.MIN_VALUE;
                        } else {
                            c4922 = new C4922(this, interfaceC4199);
                        }
                    }
                    Object obj = c4922.f11423;
                    Object objM17142 = C5508.m17142();
                    int i2 = c4922.f11425;
                    if (i2 == 0) {
                        C7149.m22422(obj);
                        InterfaceC6809<Object> interfaceC6809 = this.f11422;
                        if (t == null) {
                            t = (T) C6488.f2113;
                        }
                        c4922.f11425 = 1;
                        if (interfaceC6809.mo5844(t, c4922) == objM17142) {
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
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C4921(InterfaceC4890<? extends T> interfaceC4890, InterfaceC4199<? super C4921> interfaceC4199) {
                super(2, interfaceC4199);
                this.f11421 = interfaceC4890;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6399
            public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
                C4921 c4921 = new C4921(this.f11421, interfaceC4199);
                c4921.f11420 = obj;
                return c4921;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                Object objM17142 = C5508.m17142();
                int i = this.f11419;
                if (i == 0) {
                    C7149.m22422(obj);
                    InterfaceC6809 interfaceC6809 = (InterfaceC6809) this.f11420;
                    InterfaceC4890<T> interfaceC4890 = this.f11421;
                    C0549 c0549 = new C0549(interfaceC6809);
                    this.f11419 = 1;
                    if (interfaceC4890.mo48(c0549, this) == objM17142) {
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
            public final Object invoke(@InterfaceC6399 InterfaceC6809<Object> interfaceC6809, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
                return ((C4921) create(interfaceC6809, interfaceC4199)).invokeSuspend(C8107.f3222);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۡ۟<? super T, java.lang.Long> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۡ<? extends T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4920(InterfaceC5124<? super T, Long> interfaceC5124, InterfaceC4890<? extends T> interfaceC4890, InterfaceC4199<? super C4920> interfaceC4199) {
            super(3, interfaceC4199);
            this.f11409 = interfaceC5124;
            this.f11410 = interfaceC4890;
        }

        /* JADX DEBUG: Duplicate block (B:45:0x00f6) to fix multi-entry loop: BACK_EDGE: B:45:0x00f6 -> B:7:0x0022 */
        /* JADX WARN: Can't wrap try/catch for region: R(13:14|(4:16|(1:18)|19|(2:31|32)(2:21|(5:23|(1:25)|26|(1:28)|29)))|30|33|49|34|(1:36)|39|42|(2:44|(1:46))(1:(0))|7|12|(2:47|48)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00d7, code lost:
        
            r15 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00e6, code lost:
        
            r7.m22769(r15);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0022, code lost:
        
            if (r15 != r0) goto L7;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00cc A[Catch: all -> 0x00d7, TryCatch #0 {all -> 0x00d7, blocks: (B:34:0x00c8, B:36:0x00cc, B:39:0x00d9), top: B:49:0x00c8 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00f8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00f9  */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@InterfaceC6399 Object obj) throws Throwable {
            C7060.C7066 c7066;
            InterfaceC4892 interfaceC4892;
            InterfaceC7042 interfaceC7042;
            C7060.C7065 c7065;
            C7060.C7066 c70662;
            InterfaceC7042 interfaceC70422;
            InterfaceC4892 interfaceC48922;
            Object objM22768;
            Object objM17142 = C5508.m17142();
            int i = this.f11406;
            if (i == 0) {
                C7149.m22422(obj);
                InterfaceC4243 interfaceC4243 = (InterfaceC4243) this.f11407;
                InterfaceC4892 interfaceC48923 = (InterfaceC4892) this.f11408;
                InterfaceC7042 interfaceC7042M21528 = C6806.m21528(interfaceC4243, null, 0, new C4921(this.f11410, null), 3, null);
                c7066 = new C7060.C7066();
                interfaceC4892 = interfaceC48923;
                interfaceC7042 = interfaceC7042M21528;
                if (c7066.f21353 == C6488.f16674) {
                }
            } else if (i == 1) {
                c7065 = (C7060.C7065) this.f11405;
                c7066 = (C7060.C7066) this.f11404;
                interfaceC7042 = (InterfaceC7042) this.f11408;
                interfaceC4892 = (InterfaceC4892) this.f11407;
                C7149.m22422(obj);
                c7066.f21353 = null;
                C7060.C7065 c70652 = c7065;
                c70662 = c7066;
                interfaceC70422 = interfaceC7042;
                interfaceC48922 = interfaceC4892;
                this.f11407 = interfaceC48922;
                this.f11408 = interfaceC70422;
                this.f11404 = c70662;
                this.f11405 = c70652;
                this.f11406 = 2;
                C7282 c7282 = new C7282(this);
                if (c70662.f21353 != null) {
                }
                c7282.mo22752(interfaceC70422.mo5722(), new C0548(c70662, interfaceC48922, null));
                objM22768 = c7282.m22768();
                if (objM22768 != C5508.m17142()) {
                }
                interfaceC4892 = interfaceC48922;
                interfaceC7042 = interfaceC70422;
                c7066 = c70662;
                if (c7066.f21353 == C6488.f16674) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c70662 = (C7060.C7066) this.f11404;
                interfaceC70422 = (InterfaceC7042) this.f11408;
                interfaceC48922 = (InterfaceC4892) this.f11407;
                C7149.m22422(obj);
                interfaceC4892 = interfaceC48922;
                interfaceC7042 = interfaceC70422;
                c7066 = c70662;
                if (c7066.f21353 == C6488.f16674) {
                    c7065 = new C7060.C7065();
                    T t = c7066.f21353;
                    if (t != null) {
                        InterfaceC5124<T, Long> interfaceC5124 = this.f11409;
                        C7694 c7694 = C6488.f2113;
                        if (t == c7694) {
                            t = null;
                        }
                        long jLongValue = interfaceC5124.invoke(t).longValue();
                        c7065.f21352 = jLongValue;
                        if (jLongValue < 0) {
                            throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
                        }
                        if (jLongValue == 0) {
                            T t2 = c7066.f21353;
                            if (t2 == c7694) {
                                t2 = null;
                            }
                            this.f11407 = interfaceC4892;
                            this.f11408 = interfaceC7042;
                            this.f11404 = c7066;
                            this.f11405 = c7065;
                            this.f11406 = 1;
                            if (interfaceC4892.mo10059(t2, this) == objM17142) {
                                return objM17142;
                            }
                            c7066.f21353 = null;
                        }
                    }
                    C7060.C7065 c706522 = c7065;
                    c70662 = c7066;
                    interfaceC70422 = interfaceC7042;
                    interfaceC48922 = interfaceC4892;
                    this.f11407 = interfaceC48922;
                    this.f11408 = interfaceC70422;
                    this.f11404 = c70662;
                    this.f11405 = c706522;
                    this.f11406 = 2;
                    C7282 c72822 = new C7282(this);
                    if (c70662.f21353 != null) {
                        c72822.mo22754(c706522.f21352, new C0547(interfaceC48922, c70662, null));
                    }
                    c72822.mo22752(interfaceC70422.mo5722(), new C0548(c70662, interfaceC48922, null));
                    objM22768 = c72822.m22768();
                    if (objM22768 != C5508.m17142()) {
                        C4324.m12513(this);
                        if (objM22768 == objM17142) {
                            return objM17142;
                        }
                    } else if (objM22768 == objM17142) {
                    }
                    interfaceC4892 = interfaceC48922;
                    interfaceC7042 = interfaceC70422;
                    c7066 = c70662;
                    if (c7066.f21353 == C6488.f16674) {
                        return C8107.f3222;
                    }
                }
            }
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5140
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object mo15350(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            C4920 c4920 = new C4920(this.f11409, this.f11410, interfaceC4199);
            c4920.f11407 = interfaceC4243;
            c4920.f11408 = interfaceC4892;
            return c4920.invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۤ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3", m1273f = "Delay.kt", m1274i = {0, 1, 2}, m1275l = {314, 316, 317}, m1276m = "invokeSuspend", m1277n = {"$this$produce", "$this$produce", "$this$produce"}, m1278s = {"L$0", "L$0", "L$0"})
    public static final class C4923 extends AbstractC7690 implements InterfaceC5138<InterfaceC6809<? super C8107>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f11426;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f11427;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ long f11428;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ long f11429;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4923(long j, long j2, InterfaceC4199<? super C4923> interfaceC4199) {
            super(2, interfaceC4199);
            this.f11428 = j;
            this.f11429 = j2;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C4923 c4923 = new C4923(this.f11428, this.f11429, interfaceC4199);
            c4923.f11427 = obj;
            return c4923;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:15:0x003f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // Yue.AbstractC3513
        @Yue.InterfaceC6489
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(@Yue.InterfaceC6399 java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = Yue.C5508.m17142()
                int r1 = r7.f11426
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L22
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.f11427
                Yue.ۥۡۥۡۤ r1 = (Yue.InterfaceC6809) r1
                Yue.C7149.m22422(r8)
                goto L50
            L22:
                java.lang.Object r1 = r7.f11427
                Yue.ۥۡۥۡۤ r1 = (Yue.InterfaceC6809) r1
                Yue.C7149.m22422(r8)
                goto L3f
            L2a:
                Yue.C7149.m22422(r8)
                java.lang.Object r8 = r7.f11427
                r1 = r8
                Yue.ۥۡۥۡۤ r1 = (Yue.InterfaceC6809) r1
                long r5 = r7.f11428
                r7.f11427 = r1
                r7.f11426 = r4
                java.lang.Object r8 = Yue.C4365.m1323(r5, r7)
                if (r8 != r0) goto L3f
                return r0
            L3f:
                Yue.ۥۡۨۡ۠ r8 = r1.mo643()
                Yue.ۥۣۢ۠ۤ r4 = Yue.C8107.f3222
                r7.f11427 = r1
                r7.f11426 = r3
                java.lang.Object r8 = r8.mo5844(r4, r7)
                if (r8 != r0) goto L50
                return r0
            L50:
                long r4 = r7.f11429
                r7.f11427 = r1
                r7.f11426 = r2
                java.lang.Object r8 = Yue.C4365.m1323(r4, r7)
                if (r8 != r0) goto L3f
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Yue.C4919.C4923.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 InterfaceC6809<? super C8107> interfaceC6809, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C4923) create(interfaceC6809, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۤ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", m1273f = "Delay.kt", m1274i = {0, 0, 0, 0}, m1275l = {352}, m1276m = "invokeSuspend", m1277n = {"downstream", "values", "lastValue", "ticker"}, m1278s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class C4924<T> extends AbstractC7690 implements InterfaceC5140<InterfaceC4243, InterfaceC4892<? super T>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f11430;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f11431;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f11432;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f11433;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public /* synthetic */ Object f11434;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ long f11435;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4890<T> f11436;

        /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۤ$ۥ۟۟۟۟$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", m1273f = "Delay.kt", m1274i = {}, m1275l = {}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
        public static final class C0550 extends AbstractC7690 implements InterfaceC5138<C3732<? extends Object>, InterfaceC4199<? super C8107>, Object> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public int f11437;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public /* synthetic */ Object f11438;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ C7060.C7066<Object> f11439;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC7042<C8107> f11440;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0550(C7060.C7066<Object> c7066, InterfaceC7042<C8107> interfaceC7042, InterfaceC4199<? super C0550> interfaceC4199) {
                super(2, interfaceC4199);
                this.f11439 = c7066;
                this.f11440 = interfaceC7042;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6399
            public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
                C0550 c0550 = new C0550(this.f11439, this.f11440, interfaceC4199);
                c0550.f11438 = obj;
                return c0550;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // Yue.InterfaceC5138
            public /* bridge */ /* synthetic */ Object invoke(C3732<? extends Object> c3732, InterfaceC4199<? super C8107> interfaceC4199) {
                return m15357(c3732.m10211(), interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) throws Throwable {
                C5508.m17142();
                if (this.f11437 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7149.m22422(obj);
                T t = (T) ((C3732) this.f11438).m10211();
                C7060.C7066<Object> c7066 = this.f11439;
                boolean z = t instanceof C3732.C3733;
                if (!z) {
                    c7066.f21353 = t;
                }
                InterfaceC7042<C8107> interfaceC7042 = this.f11440;
                if (z) {
                    Throwable thM10202 = C3732.m10202(t);
                    if (thM10202 != null) {
                        throw thM10202;
                    }
                    interfaceC7042.mo5718(new C3812());
                    c7066.f21353 = (T) C6488.f16674;
                }
                return C8107.f3222;
            }

            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final Object m15357(@InterfaceC6399 Object obj, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
                return ((C0550) create(C3732.m806(obj), interfaceC4199)).invokeSuspend(C8107.f3222);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۤ$ۥ۟۟۟۟$ۥ۟ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", m1273f = "Delay.kt", m1274i = {}, m1275l = {300}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
        public static final class C0551 extends AbstractC7690 implements InterfaceC5138<C8107, InterfaceC4199<? super C8107>, Object> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public int f11441;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ C7060.C7066<Object> f11442;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC4892<T> f11443;

            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣۣ۠ۢ<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0551(C7060.C7066<Object> c7066, InterfaceC4892<? super T> interfaceC4892, InterfaceC4199<? super C0551> interfaceC4199) {
                super(2, interfaceC4199);
                this.f11442 = c7066;
                this.f11443 = interfaceC4892;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6399
            public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
                return new C0551(this.f11442, this.f11443, interfaceC4199);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type Yue.ￛﾥￛﾟￛﾧￛﾤￛﾢ to Yue.ￛﾥￛﾠￛﾢￛﾤￛﾣ$ￛﾥￛﾟￛﾟￛﾟￛﾟ$ￛﾥￛﾟ for r5v1 'this'  Yue.ￛﾥￛﾟￛﾧￛﾤￛﾢ
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // Yue.AbstractC3513
            @Yue.InterfaceC6489
            public final java.lang.Object invokeSuspend(@Yue.InterfaceC6399 java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = Yue.C5508.m17142()
                    int r1 = r5.f11441
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    Yue.C7149.m22422(r6)
                    goto L36
                Lf:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L17:
                    Yue.C7149.m22422(r6)
                    Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ<java.lang.Object> r6 = r5.f11442
                    T r1 = r6.f21353
                    if (r1 != 0) goto L23
                    Yue.ۥۣۢ۠ۤ r6 = Yue.C8107.f3222
                    return r6
                L23:
                    r3 = 0
                    r6.f21353 = r3
                    Yue.ۥۣۣ۠ۢ<T> r6 = r5.f11443
                    Yue.ۥۢ۠ۦۢ r4 = Yue.C6488.f2113
                    if (r1 != r4) goto L2d
                    r1 = r3
                L2d:
                    r5.f11441 = r2
                    java.lang.Object r6 = r6.mo10059(r1, r5)
                    if (r6 != r0) goto L36
                    return r0
                L36:
                    Yue.ۥۣۢ۠ۤ r6 = Yue.C8107.f3222
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: Yue.C4919.C4924.C0551.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // Yue.InterfaceC5138
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public final Object invoke(@InterfaceC6399 C8107 c8107, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
                return ((C0551) create(c8107, interfaceC4199)).invokeSuspend(C8107.f3222);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۤ$ۥ۟۟۟۟$ۥ۟۟, reason: contains not printable characters */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", m1273f = "Delay.kt", m1274i = {}, m1275l = {280}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
        public static final class C4925 extends AbstractC7690 implements InterfaceC5138<InterfaceC6809<? super Object>, InterfaceC4199<? super C8107>, Object> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public int f11444;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public /* synthetic */ Object f11445;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC4890<T> f11446;

            /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۤ$ۥ۟۟۟۟$ۥ۟۟$ۥ */
            public static final class C0552<T> implements InterfaceC4892 {

                /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC6809<Object> f11447;

                /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۤ$ۥ۟۟۟۟$ۥ۟۟$ۥ$ۥ, reason: contains not printable characters */
                @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", m1273f = "Delay.kt", m1274i = {}, m1275l = {280}, m1276m = "emit", m1277n = {}, m1278s = {})
                public static final class C4926 extends AbstractC4201 {

                    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
                    public /* synthetic */ Object f11448;

                    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
                    public final /* synthetic */ C0552<T> f11449;

                    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
                    public int f11450;

                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۤ$ۥ۟۟۟۟$ۥ۟۟$ۥ<? super T> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C4926(C0552<? super T> c0552, InterfaceC4199<? super C4926> interfaceC4199) {
                        super(interfaceC4199);
                        this.f11449 = c0552;
                    }

                    @Override // Yue.AbstractC3513
                    @InterfaceC6489
                    public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                        this.f11448 = obj;
                        this.f11450 |= Integer.MIN_VALUE;
                        return this.f11449.mo10059(null, this);
                    }
                }

                public C0552(InterfaceC6809<Object> interfaceC6809) {
                    this.f11447 = interfaceC6809;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // Yue.InterfaceC4892
                @InterfaceC6489
                /* JADX INFO: renamed from: ۥ۟۟۟۟ */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
                    C4926 c4926;
                    if (interfaceC4199 instanceof C4926) {
                        c4926 = (C4926) interfaceC4199;
                        int i = c4926.f11450;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            c4926.f11450 = i - Integer.MIN_VALUE;
                        } else {
                            c4926 = new C4926(this, interfaceC4199);
                        }
                    }
                    Object obj = c4926.f11448;
                    Object objM17142 = C5508.m17142();
                    int i2 = c4926.f11450;
                    if (i2 == 0) {
                        C7149.m22422(obj);
                        InterfaceC6809<Object> interfaceC6809 = this.f11447;
                        if (t == null) {
                            t = (T) C6488.f2113;
                        }
                        c4926.f11450 = 1;
                        if (interfaceC6809.mo5844(t, c4926) == objM17142) {
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
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C4925(InterfaceC4890<? extends T> interfaceC4890, InterfaceC4199<? super C4925> interfaceC4199) {
                super(2, interfaceC4199);
                this.f11446 = interfaceC4890;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6399
            public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
                C4925 c4925 = new C4925(this.f11446, interfaceC4199);
                c4925.f11445 = obj;
                return c4925;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                Object objM17142 = C5508.m17142();
                int i = this.f11444;
                if (i == 0) {
                    C7149.m22422(obj);
                    InterfaceC6809 interfaceC6809 = (InterfaceC6809) this.f11445;
                    InterfaceC4890<T> interfaceC4890 = this.f11446;
                    C0552 c0552 = new C0552(interfaceC6809);
                    this.f11444 = 1;
                    if (interfaceC4890.mo48(c0552, this) == objM17142) {
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
            public final Object invoke(@InterfaceC6399 InterfaceC6809<Object> interfaceC6809, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
                return ((C4925) create(interfaceC6809, interfaceC4199)).invokeSuspend(C8107.f3222);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۢۡ<? extends T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4924(long j, InterfaceC4890<? extends T> interfaceC4890, InterfaceC4199<? super C4924> interfaceC4199) {
            super(3, interfaceC4199);
            this.f11435 = j;
            this.f11436 = interfaceC4890;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) throws Throwable {
            InterfaceC4892 interfaceC4892;
            InterfaceC7042 interfaceC7042;
            C7060.C7066 c7066;
            InterfaceC7042 interfaceC7042M15345;
            Object objM17142 = C5508.m17142();
            int i = this.f11432;
            if (i == 0) {
                C7149.m22422(obj);
                InterfaceC4243 interfaceC4243 = (InterfaceC4243) this.f11433;
                InterfaceC4892 interfaceC48922 = (InterfaceC4892) this.f11434;
                InterfaceC7042 interfaceC7042M21528 = C6806.m21528(interfaceC4243, null, -1, new C4925(this.f11436, null), 1, null);
                C7060.C7066 c70662 = new C7060.C7066();
                interfaceC4892 = interfaceC48922;
                interfaceC7042 = interfaceC7042M21528;
                c7066 = c70662;
                interfaceC7042M15345 = C4919.m15345(interfaceC4243, this.f11435, 0L, 2, null);
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC7042M15345 = (InterfaceC7042) this.f11431;
                c7066 = (C7060.C7066) this.f11430;
                interfaceC7042 = (InterfaceC7042) this.f11434;
                interfaceC4892 = (InterfaceC4892) this.f11433;
                C7149.m22422(obj);
            }
            while (c7066.f21353 != C6488.f16674) {
                this.f11433 = interfaceC4892;
                this.f11434 = interfaceC7042;
                this.f11430 = c7066;
                this.f11431 = interfaceC7042M15345;
                this.f11432 = 1;
                C7282 c7282 = new C7282(this);
                try {
                    c7282.mo22752(interfaceC7042.mo5722(), new C0550(c7066, interfaceC7042M15345, null));
                    c7282.mo22752(interfaceC7042M15345.mo5721(), new C0551(c7066, interfaceC4892, null));
                } catch (Throwable th) {
                    c7282.m22769(th);
                }
                Object objM22768 = c7282.m22768();
                if (objM22768 == C5508.m17142()) {
                    C4324.m12513(this);
                }
                if (objM22768 == objM17142) {
                    return objM17142;
                }
            }
            return C8107.f3222;
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5140
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object mo15350(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            C4924 c4924 = new C4924(this.f11435, this.f11436, interfaceC4199);
            c4924.f11433 = interfaceC4243;
            c4924.f11434 = interfaceC4892;
            return c4924.invokeSuspend(C8107.f3222);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۡ<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    @InterfaceC5039
    /* JADX INFO: renamed from: ۥ */
    public static final <T> InterfaceC4890<T> m1821(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, long j) {
        if (j >= 0) {
            return j == 0 ? interfaceC4890 : m15343(interfaceC4890, new C0545(j));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    @InterfaceC6399
    @InterfaceC6587
    @InterfaceC5039
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T> InterfaceC4890<T> m1822(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5124<? super T, Long> interfaceC5124) {
        return m15343(interfaceC4890, interfaceC5124);
    }

    @InterfaceC6399
    @InterfaceC5039
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15341(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, long j) {
        return C4896.m15197(interfaceC4890, C4365.m12621(j));
    }

    @InterfaceC6399
    @InterfaceC6587
    @InterfaceC5572(name = "debounceDuration")
    @InterfaceC5039
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15342(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5124<? super T, C4555> interfaceC5124) {
        return m15343(interfaceC4890, new C0546(interfaceC5124));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15343(InterfaceC4890<? extends T> interfaceC4890, InterfaceC5124<? super T, Long> interfaceC5124) {
        return C4894.m1802(new C4920(interfaceC5124, interfaceC4890, null));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final InterfaceC7042<C8107> m15344(@InterfaceC6399 InterfaceC4243 interfaceC4243, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException(("Expected non-negative delay, but has " + j + " ms").toString());
        }
        if (j2 >= 0) {
            return C6806.m21528(interfaceC4243, null, 0, new C4923(j2, j, null), 1, null);
        }
        throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j2 + " ms").toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7042 m15345(InterfaceC4243 interfaceC4243, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = j;
        }
        return C4896.m15220(interfaceC4243, j, j2);
    }

    @InterfaceC6399
    @InterfaceC5039
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15346(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, long j) {
        if (j > 0) {
            return C4894.m1802(new C4924(j, interfaceC4890, null));
        }
        throw new IllegalArgumentException("Sample period should be positive".toString());
    }

    @InterfaceC6399
    @InterfaceC5039
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15347(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, long j) {
        return C4896.m15275(interfaceC4890, C4365.m12621(j));
    }
}
