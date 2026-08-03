package Yue;

import Yue.C7060;
import Yue.InterfaceC7441;
import com.android.p001dx.p004io.Opcodes;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4988 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۠$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", m1273f = "Share.kt", m1274i = {}, m1275l = {Opcodes.OR_INT_LIT16, Opcodes.MUL_INT_LIT8, Opcodes.DIV_INT_LIT8, Opcodes.SHR_INT_LIT8}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C0587 extends AbstractC7690 implements InterfaceC5138<InterfaceC4243, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f11710;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7441 f11711;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4890<T> f11712;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC6308<T> f11713;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ T f11714;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۠$ۥ$ۥ, reason: contains not printable characters */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", m1273f = "Share.kt", m1274i = {}, m1275l = {}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
        public static final class C4989 extends AbstractC7690 implements InterfaceC5138<Integer, InterfaceC4199<? super Boolean>, Object> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public int f11715;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public /* synthetic */ int f11716;

            public C4989(InterfaceC4199<? super C4989> interfaceC4199) {
                super(2, interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6399
            public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
                C4989 c4989 = new C4989(interfaceC4199);
                c4989.f11716 = ((Number) obj).intValue();
                return c4989;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // Yue.InterfaceC5138
            public /* bridge */ /* synthetic */ Object invoke(Integer num, InterfaceC4199<? super Boolean> interfaceC4199) {
                return m15462(num.intValue(), interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                C5508.m17142();
                if (this.f11715 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7149.m22422(obj);
                return C3590.m636(this.f11716 > 0);
            }

            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final Object m15462(int i, @InterfaceC6489 InterfaceC4199<? super Boolean> interfaceC4199) {
                return ((C4989) create(Integer.valueOf(i), interfaceC4199)).invokeSuspend(C8107.f3222);
            }
        }

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۠$ۥ$ۥ۟, reason: contains not printable characters */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", m1273f = "Share.kt", m1274i = {}, m1275l = {227}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
        public static final class C4990 extends AbstractC7690 implements InterfaceC5138<EnumC7439, InterfaceC4199<? super C8107>, Object> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public int f11717;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public /* synthetic */ Object f11718;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC4890<T> f11719;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC6308<T> f11720;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public final /* synthetic */ T f11721;

            /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۠$ۥ$ۥ۟$ۥ, reason: contains not printable characters */
            public /* synthetic */ class C4991 {

                /* JADX INFO: renamed from: ۥ */
                public static final /* synthetic */ int[] f1220;

                static {
                    int[] iArr = new int[EnumC7439.values().length];
                    iArr[EnumC7439.START.ordinal()] = 1;
                    iArr[EnumC7439.STOP.ordinal()] = 2;
                    iArr[EnumC7439.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    f1220 = iArr;
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۡ<? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C4990(InterfaceC4890<? extends T> interfaceC4890, InterfaceC6308<T> interfaceC6308, T t, InterfaceC4199<? super C4990> interfaceC4199) {
                super(2, interfaceC4199);
                this.f11719 = interfaceC4890;
                this.f11720 = interfaceC6308;
                this.f11721 = t;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6399
            public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
                C4990 c4990 = new C4990(this.f11719, this.f11720, this.f11721, interfaceC4199);
                c4990.f11718 = obj;
                return c4990;
            }

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
            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                Object objM17142 = C5508.m17142();
                int i = this.f11717;
                if (i == 0) {
                    C7149.m22422(obj);
                    int i2 = C4991.f1220[((EnumC7439) this.f11718).ordinal()];
                    if (i2 == 1) {
                        InterfaceC4890<T> interfaceC4890 = this.f11719;
                        InterfaceC7431 interfaceC7431 = this.f11720;
                        this.f11717 = 1;
                        if (interfaceC4890.mo48(interfaceC7431, this) == objM17142) {
                            return objM17142;
                        }
                    } else if (i2 == 3) {
                        T t = this.f11721;
                        if (t == C7434.f2881) {
                            this.f11720.mo19611();
                        } else {
                            this.f11720.mo19612(t);
                        }
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
            public final Object invoke(@InterfaceC6399 EnumC7439 enumC7439, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
                return ((C4990) create(enumC7439, interfaceC4199)).invokeSuspend(C8107.f3222);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۡ<? extends T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0587(InterfaceC7441 interfaceC7441, InterfaceC4890<? extends T> interfaceC4890, InterfaceC6308<T> interfaceC6308, T t, InterfaceC4199<? super C0587> interfaceC4199) {
            super(2, interfaceC4199);
            this.f11711 = interfaceC7441;
            this.f11712 = interfaceC4890;
            this.f11713 = interfaceC6308;
            this.f11714 = t;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            return new C0587(this.f11711, this.f11712, this.f11713, this.f11714, interfaceC4199);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        public final Object invoke(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C0587) create(interfaceC4243, interfaceC4199)).invokeSuspend(C8107.f3222);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[RETURN] */
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
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            InterfaceC4890<T> interfaceC4890;
            InterfaceC7431 interfaceC7431;
            Object objM17142 = C5508.m17142();
            int i = this.f11710;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C7149.m22422(obj);
                        interfaceC4890 = this.f11712;
                        interfaceC7431 = this.f11713;
                        this.f11710 = 3;
                        if (interfaceC4890.mo48(interfaceC7431, this) == objM17142) {
                            return objM17142;
                        }
                    } else if (i != 3 && i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                C7149.m22422(obj);
            } else {
                C7149.m22422(obj);
                InterfaceC7441 interfaceC7441 = this.f11711;
                InterfaceC7441.C1262 c1262 = InterfaceC7441.f2888;
                if (interfaceC7441 == c1262.m23317()) {
                    InterfaceC4890<T> interfaceC48902 = this.f11712;
                    InterfaceC7431 interfaceC74312 = this.f11713;
                    this.f11710 = 1;
                    if (interfaceC48902.mo48(interfaceC74312, this) == objM17142) {
                        return objM17142;
                    }
                } else if (this.f11711 == c1262.m23318()) {
                    InterfaceC7588<Integer> interfaceC7588M19613 = this.f11713.m19613();
                    C4989 c4989 = new C4989(null);
                    this.f11710 = 2;
                    if (C4896.m15217(interfaceC7588M19613, c4989, this) == objM17142) {
                        return objM17142;
                    }
                    interfaceC4890 = this.f11712;
                    interfaceC7431 = this.f11713;
                    this.f11710 = 3;
                    if (interfaceC4890.mo48(interfaceC7431, this) == objM17142) {
                    }
                } else {
                    InterfaceC4890 interfaceC4890M15203 = C4896.m15203(this.f11711.mo3633(this.f11713.m19613()));
                    C4990 c4990 = new C4990(this.f11712, this.f11713, this.f11714, null);
                    this.f11710 = 4;
                    if (C4896.m15171(interfaceC4890M15203, c4990, this) == objM17142) {
                        return objM17142;
                    }
                }
            }
            return C8107.f3222;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۠$ۥ۟ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", m1273f = "Share.kt", m1274i = {}, m1275l = {340}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C0588 extends AbstractC7690 implements InterfaceC5138<InterfaceC4243, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f11722;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f11723;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4890<T> f11724;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4044<InterfaceC7588<T>> f11725;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۠$ۥ۟$ۥ, reason: contains not printable characters */
        public static final class C4992<T> implements InterfaceC4892 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ C7060.C7066<InterfaceC6309<T>> f11726;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC4243 f11727;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC4044<InterfaceC7588<T>> f11728;

            public C4992(C7060.C7066<InterfaceC6309<T>> c7066, InterfaceC4243 interfaceC4243, InterfaceC4044<InterfaceC7588<T>> interfaceC4044) {
                this.f11726 = c7066;
                this.f11727 = interfaceC4243;
                this.f11728 = interfaceC4044;
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [T, Yue.ۥۡۡۧۦ, Yue.ۥۢ۠۟ۡ] */
            @Override // Yue.InterfaceC4892
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟۟۟۟ */
            public final Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
                C8107 c8107;
                InterfaceC6309<T> interfaceC6309 = this.f11726.f21353;
                if (interfaceC6309 != null) {
                    interfaceC6309.setValue(t);
                    c8107 = C8107.f3222;
                } else {
                    c8107 = null;
                }
                if (c8107 == null) {
                    InterfaceC4243 interfaceC4243 = this.f11727;
                    C7060.C7066<InterfaceC6309<T>> c7066 = this.f11726;
                    InterfaceC4044<InterfaceC7588<T>> interfaceC4044 = this.f11728;
                    ?? r4 = (T) C7590.m3748(t);
                    interfaceC4044.mo11461(new C7020(r4, C5553.m17213(interfaceC4243.getCoroutineContext())));
                    c7066.f21353 = r4;
                }
                return C8107.f3222;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۡ<? extends T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0588(InterfaceC4890<? extends T> interfaceC4890, InterfaceC4044<InterfaceC7588<T>> interfaceC4044, InterfaceC4199<? super C0588> interfaceC4199) {
            super(2, interfaceC4199);
            this.f11724 = interfaceC4890;
            this.f11725 = interfaceC4044;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C0588 c0588 = new C0588(this.f11724, this.f11725, interfaceC4199);
            c0588.f11723 = obj;
            return c0588;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        public final Object invoke(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C0588) create(interfaceC4243, interfaceC4199)).invokeSuspend(C8107.f3222);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type Yue.ￛﾥￛﾟￛﾧￛﾤￛﾢ to Yue.ￛﾥￛﾠￛﾢￛﾥￛﾠ$ￛﾥￛﾟ for r6v1 'this'  Yue.ￛﾥￛﾟￛﾧￛﾤￛﾢ
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
                int r1 = r6.f11722
                r2 = 1
                if (r1 == 0) goto L19
                if (r1 != r2) goto L11
                Yue.C7149.m22422(r7)     // Catch: java.lang.Throwable -> Lf
                goto L37
            Lf:
                r7 = move-exception
                goto L3a
            L11:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L19:
                Yue.C7149.m22422(r7)
                java.lang.Object r7 = r6.f11723
                Yue.ۥ۟ۧۧۥ r7 = (Yue.InterfaceC4243) r7
                Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ r1 = new Yue.ۥۡۦۢۥ$ۥ۟۟۟ۢ     // Catch: java.lang.Throwable -> Lf
                r1.<init>()     // Catch: java.lang.Throwable -> Lf
                Yue.ۥۣ۠ۢۡ<T> r3 = r6.f11724     // Catch: java.lang.Throwable -> Lf
                Yue.ۥ۠ۢۥ۠$ۥ۟$ۥ r4 = new Yue.ۥ۠ۢۥ۠$ۥ۟$ۥ     // Catch: java.lang.Throwable -> Lf
                Yue.ۥ۟ۦۢۧ<Yue.ۥۢ۠۟ۡ<T>> r5 = r6.f11725     // Catch: java.lang.Throwable -> Lf
                r4.<init>(r1, r7, r5)     // Catch: java.lang.Throwable -> Lf
                r6.f11722 = r2     // Catch: java.lang.Throwable -> Lf
                java.lang.Object r7 = r3.mo48(r4, r6)     // Catch: java.lang.Throwable -> Lf
                if (r7 != r0) goto L37
                return r0
            L37:
                Yue.ۥۣۢ۠ۤ r7 = Yue.C8107.f3222
                return r7
            L3a:
                Yue.ۥ۟ۦۢۧ<Yue.ۥۢ۠۟ۡ<T>> r0 = r6.f11725
                r0.mo992(r7)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: Yue.C4988.C0588.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final <T> InterfaceC7431<T> m1842(@InterfaceC6399 InterfaceC6308<T> interfaceC6308) {
        return new C7019(interfaceC6308, null);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T> InterfaceC7588<T> m1843(@InterfaceC6399 InterfaceC6309<T> interfaceC6309) {
        return new C7020(interfaceC6309, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> C7440<T> m15454(InterfaceC4890<? extends T> interfaceC4890, int i) {
        AbstractC3716 abstractC3716;
        InterfaceC4890<T> interfaceC4890Mo10173;
        int iM21661 = C7007.m21661(i, InterfaceC3713.f491.m797()) - i;
        if (!(interfaceC4890 instanceof AbstractC3716) || (interfaceC4890Mo10173 = (abstractC3716 = (AbstractC3716) interfaceC4890).mo10173()) == null) {
            return new C7440<>(interfaceC4890, iM21661, EnumC3602.SUSPEND, C4629.f9940);
        }
        int i2 = abstractC3716.f6622;
        if (i2 != -3 && i2 != -2 && i2 != 0) {
            iM21661 = i2;
        } else if (abstractC3716.f6623 == EnumC3602.SUSPEND) {
            if (i2 == 0) {
                iM21661 = 0;
            }
        } else if (i == 0) {
            iM21661 = 1;
        }
        return new C7440<>(interfaceC4890Mo10173, iM21661, abstractC3716.f6623, abstractC3716.f6621);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC5542 m15455(InterfaceC4243 interfaceC4243, InterfaceC4225 interfaceC4225, InterfaceC4890<? extends T> interfaceC4890, InterfaceC6308<T> interfaceC6308, InterfaceC7441 interfaceC7441, T t) {
        return C3615.m9752(interfaceC4243, interfaceC4225, C5499.m17094(interfaceC7441, InterfaceC7441.f2888.m23317()) ? EnumC4247.DEFAULT : EnumC4247.UNDISPATCHED, new C0587(interfaceC7441, interfaceC4890, interfaceC6308, t, null));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> void m15456(InterfaceC4243 interfaceC4243, InterfaceC4225 interfaceC4225, InterfaceC4890<? extends T> interfaceC4890, InterfaceC4044<InterfaceC7588<T>> interfaceC4044) {
        C3617.m9760(interfaceC4243, interfaceC4225, null, new C0588(interfaceC4890, interfaceC4044, null), 2, null);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> InterfaceC7431<T> m15457(@InterfaceC6399 InterfaceC7431<? extends T> interfaceC7431, @InterfaceC6399 InterfaceC5138<? super InterfaceC4892<? super T>, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138) {
        return new C7668(interfaceC7431, interfaceC5138);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> InterfaceC7431<T> m15458(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6399 InterfaceC7441 interfaceC7441, int i) {
        C7440 c7440M15454 = m15454(interfaceC4890, i);
        InterfaceC6308 interfaceC6308M3625 = C7434.m3625(i, c7440M15454.f2887, c7440M15454.f22549);
        return new C7019(interfaceC6308M3625, m15455(interfaceC4243, c7440M15454.f22550, c7440M15454.f2886, interfaceC6308M3625, interfaceC7441, C7434.f2881));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7431 m15459(InterfaceC4890 interfaceC4890, InterfaceC4243 interfaceC4243, InterfaceC7441 interfaceC7441, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return C4896.m15280(interfaceC4890, interfaceC4243, interfaceC7441, i);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC7588<T> m15460(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6399 InterfaceC7441 interfaceC7441, T t) {
        C7440 c7440M15454 = m15454(interfaceC4890, 1);
        InterfaceC6309 interfaceC6309M3748 = C7590.m3748(t);
        return new C7020(interfaceC6309M3748, m15455(interfaceC4243, c7440M15454.f22550, c7440M15454.f2886, interfaceC6309M3748, interfaceC7441, t));
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <T> Object m15461(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6399 InterfaceC4199<? super InterfaceC7588<? extends T>> interfaceC4199) {
        C7440 c7440M15454 = m15454(interfaceC4890, 1);
        InterfaceC4044 interfaceC4044M11470 = C4046.m11470(null, 1, null);
        m15456(interfaceC4243, c7440M15454.f22550, c7440M15454.f2886, interfaceC4044M11470);
        return interfaceC4044M11470.mo11468(interfaceC4199);
    }
}
