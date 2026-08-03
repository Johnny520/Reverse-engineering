package Yue;

import com.android.p001dx.p004io.Opcodes;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4956 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f1219 = C7705.m3806(C4896.f1216, 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۨ$ۥ */
    public static final class C0576<R> implements InterfaceC4890<InterfaceC4890<? extends R>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4890 f11599;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138 f11600;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۨ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C4957<T> implements InterfaceC4892 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC4892 f11601;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC5138 f11602;

            /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۨ$ۥ$ۥ$ۥ, reason: contains not printable characters */
            @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", m1273f = "Merge.kt", m1274i = {}, m1275l = {Opcodes.XOR_INT_LIT8, Opcodes.XOR_INT_LIT8}, m1276m = "emit", m1277n = {}, m1278s = {})
            public static final class C4958 extends AbstractC4201 {

                /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
                public /* synthetic */ Object f11603;

                /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
                public int f11604;

                /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
                public Object f11605;

                public C4958(InterfaceC4199 interfaceC4199) {
                    super(interfaceC4199);
                }

                @Override // Yue.AbstractC3513
                @InterfaceC6489
                public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                    this.f11603 = obj;
                    this.f11604 |= Integer.MIN_VALUE;
                    return C4957.this.mo10059(null, this);
                }
            }

            public C4957(InterfaceC4892 interfaceC4892, InterfaceC5138 interfaceC5138) {
                this.f11601 = interfaceC4892;
                this.f11602 = interfaceC5138;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Yue.InterfaceC4892
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟۟۟۟ */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo10059(Object obj, @InterfaceC6399 InterfaceC4199 interfaceC4199) {
                C4958 c4958;
                InterfaceC4892 interfaceC4892;
                if (interfaceC4199 instanceof C4958) {
                    c4958 = (C4958) interfaceC4199;
                    int i = c4958.f11604;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c4958.f11604 = i - Integer.MIN_VALUE;
                    } else {
                        c4958 = new C4958(interfaceC4199);
                    }
                }
                Object obj2 = c4958.f11603;
                Object objM17142 = C5508.m17142();
                int i2 = c4958.f11604;
                if (i2 == 0) {
                    C7149.m22422(obj2);
                    InterfaceC4892 interfaceC48922 = this.f11601;
                    InterfaceC5138 interfaceC5138 = this.f11602;
                    c4958.f11605 = interfaceC48922;
                    c4958.f11604 = 1;
                    Object objInvoke = interfaceC5138.invoke(obj, c4958);
                    if (objInvoke == objM17142) {
                        return objM17142;
                    }
                    obj2 = objInvoke;
                    interfaceC4892 = interfaceC48922;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7149.m22422(obj2);
                        return C8107.f3222;
                    }
                    InterfaceC4892 interfaceC48923 = (InterfaceC4892) c4958.f11605;
                    C7149.m22422(obj2);
                    interfaceC4892 = interfaceC48923;
                }
                c4958.f11605 = null;
                c4958.f11604 = 2;
                if (interfaceC4892.mo10059(obj2, c4958) == objM17142) {
                    return objM17142;
                }
                return C8107.f3222;
            }
        }

        public C0576(InterfaceC4890 interfaceC4890, InterfaceC5138 interfaceC5138) {
            this.f11599 = interfaceC4890;
            this.f11600 = interfaceC5138;
        }

        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public Object mo48(@InterfaceC6399 InterfaceC4892 interfaceC4892, @InterfaceC6399 InterfaceC4199 interfaceC4199) {
            Object objMo48 = this.f11599.mo48(new C4957(interfaceC4892, this.f11600), interfaceC4199);
            return objMo48 == C5508.m17142() ? objMo48 : C8107.f3222;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۨ$ۥ۟ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1", m1273f = "Merge.kt", m1274i = {}, m1275l = {190, 190}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C0577<R, T> extends AbstractC7690 implements InterfaceC5140<InterfaceC4892<? super R>, T, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f11607;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f11608;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ Object f11609;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<T, InterfaceC4199<? super InterfaceC4890<? extends R>>, Object> f11610;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۢ<? super T, ? super Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣ۠ۢۡ<? extends R>>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0577(InterfaceC5138<? super T, ? super InterfaceC4199<? super InterfaceC4890<? extends R>>, ? extends Object> interfaceC5138, InterfaceC4199<? super C0577> interfaceC4199) {
            super(3, interfaceC4199);
            this.f11610 = interfaceC5138;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to Yue.ￛﾥￛﾠￛﾢￛﾤￛﾨ$ￛﾥￛﾟ<R, T> for r5v1 'this'  java.lang.Object
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
                int r1 = r5.f11607
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                Yue.C7149.m22422(r6)
                goto L47
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f11608
                Yue.ۥۣۣ۠ۢ r1 = (Yue.InterfaceC4892) r1
                Yue.C7149.m22422(r6)
                goto L39
            L22:
                Yue.C7149.m22422(r6)
                java.lang.Object r6 = r5.f11608
                r1 = r6
                Yue.ۥۣۣ۠ۢ r1 = (Yue.InterfaceC4892) r1
                java.lang.Object r6 = r5.f11609
                Yue.ۥۣ۠ۢۢ<T, Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣ۠ۢۡ<? extends R>>, java.lang.Object> r4 = r5.f11610
                r5.f11608 = r1
                r5.f11607 = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                return r0
            L39:
                Yue.ۥۣ۠ۢۡ r6 = (Yue.InterfaceC4890) r6
                r3 = 0
                r5.f11608 = r3
                r5.f11607 = r2
                java.lang.Object r6 = Yue.C4896.m15208(r1, r6, r5)
                if (r6 != r0) goto L47
                return r0
            L47:
                Yue.ۥۣۢ۠ۤ r6 = Yue.C8107.f3222
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Yue.C4956.C0577.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5140
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object mo15350(@InterfaceC6399 InterfaceC4892<? super R> interfaceC4892, T t, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            C0577 c0577 = new C0577(this.f11610, interfaceC4199);
            c0577.f11608 = interfaceC4892;
            c0577.f11609 = t;
            return c0577.invokeSuspend(C8107.f3222);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to Yue.ￛﾥￛﾠￛﾢￛﾤￛﾨ$ￛﾥￛﾟ<R, T> for r2v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Yue.InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final java.lang.Object m15403(@Yue.InterfaceC6399 java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.Object r3 = r2.f11608
                Yue.ۥۣۣ۠ۢ r3 = (Yue.InterfaceC4892) r3
                java.lang.Object r0 = r2.f11609
                Yue.ۥۣ۠ۢۢ<T, Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣ۠ۢۡ<? extends R>>, java.lang.Object> r1 = r2.f11610
                java.lang.Object r0 = r1.invoke(r0, r2)
                Yue.ۥۣ۠ۢۡ r0 = (Yue.InterfaceC4890) r0
                r1 = 0
                Yue.C5437.m16931(r1)
                Yue.C4896.m15208(r3, r0, r2)
                r3 = 1
                Yue.C5437.m16931(r3)
                Yue.ۥۣۢ۠ۤ r3 = Yue.C8107.f3222
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: Yue.C4956.C0577.m15403(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۨ$ۥ۟۟, reason: contains not printable characters */
    public static final class C4959<R> implements InterfaceC4890<InterfaceC4890<? extends R>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4890 f11611;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138 f11612;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۨ$ۥ۟۟$ۥ */
        public static final class C0578<T> implements InterfaceC4892 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC4892 f11613;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC5138 f11614;

            /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۨ$ۥ۟۟$ۥ$ۥ, reason: contains not printable characters */
            @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", m1273f = "Merge.kt", m1274i = {}, m1275l = {Opcodes.XOR_INT_LIT8, Opcodes.XOR_INT_LIT8}, m1276m = "emit", m1277n = {}, m1278s = {})
            public static final class C4960 extends AbstractC4201 {

                /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
                public /* synthetic */ Object f11615;

                /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
                public int f11616;

                /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
                public Object f11617;

                public C4960(InterfaceC4199 interfaceC4199) {
                    super(interfaceC4199);
                }

                @Override // Yue.AbstractC3513
                @InterfaceC6489
                public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                    this.f11615 = obj;
                    this.f11616 |= Integer.MIN_VALUE;
                    return C0578.this.mo10059(null, this);
                }
            }

            public C0578(InterfaceC4892 interfaceC4892, InterfaceC5138 interfaceC5138) {
                this.f11613 = interfaceC4892;
                this.f11614 = interfaceC5138;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Yue.InterfaceC4892
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟۟۟۟ */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo10059(Object obj, @InterfaceC6399 InterfaceC4199 interfaceC4199) {
                C4960 c4960;
                InterfaceC4892 interfaceC4892;
                if (interfaceC4199 instanceof C4960) {
                    c4960 = (C4960) interfaceC4199;
                    int i = c4960.f11616;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c4960.f11616 = i - Integer.MIN_VALUE;
                    } else {
                        c4960 = new C4960(interfaceC4199);
                    }
                }
                Object obj2 = c4960.f11615;
                Object objM17142 = C5508.m17142();
                int i2 = c4960.f11616;
                if (i2 == 0) {
                    C7149.m22422(obj2);
                    InterfaceC4892 interfaceC48922 = this.f11613;
                    InterfaceC5138 interfaceC5138 = this.f11614;
                    c4960.f11617 = interfaceC48922;
                    c4960.f11616 = 1;
                    Object objInvoke = interfaceC5138.invoke(obj, c4960);
                    if (objInvoke == objM17142) {
                        return objM17142;
                    }
                    obj2 = objInvoke;
                    interfaceC4892 = interfaceC48922;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7149.m22422(obj2);
                        return C8107.f3222;
                    }
                    InterfaceC4892 interfaceC48923 = (InterfaceC4892) c4960.f11617;
                    C7149.m22422(obj2);
                    interfaceC4892 = interfaceC48923;
                }
                c4960.f11617 = null;
                c4960.f11616 = 2;
                if (interfaceC4892.mo10059(obj2, c4960) == objM17142) {
                    return objM17142;
                }
                return C8107.f3222;
            }
        }

        public C4959(InterfaceC4890 interfaceC4890, InterfaceC5138 interfaceC5138) {
            this.f11611 = interfaceC4890;
            this.f11612 = interfaceC5138;
        }

        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public Object mo48(@InterfaceC6399 InterfaceC4892 interfaceC4892, @InterfaceC6399 InterfaceC4199 interfaceC4199) {
            Object objMo48 = this.f11611.mo48(new C0578(interfaceC4892, this.f11612), interfaceC4199);
            return objMo48 == C5508.m17142() ? objMo48 : C8107.f3222;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۨ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C4961<T> implements InterfaceC4890<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4890 f11619;

        public C4961(InterfaceC4890 interfaceC4890) {
            this.f11619 = interfaceC4890;
        }

        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            Object objMo48 = this.f11619.mo48(new C4962(interfaceC4892), interfaceC4199);
            return objMo48 == C5508.m17142() ? objMo48 : C8107.f3222;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۨ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C4962<T> implements InterfaceC4892 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4892<T> f11620;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۨ$ۥ۟۟۟۟$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", m1273f = "Merge.kt", m1274i = {}, m1275l = {80}, m1276m = "emit", m1277n = {}, m1278s = {})
        public static final class C0579 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11621;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ C4962<T> f11622;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public int f11623;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۠ۢۤۨ$ۥ۟۟۟۟<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0579(C4962<? super T> c4962, InterfaceC4199<? super C0579> interfaceC4199) {
                super(interfaceC4199);
                this.f11622 = c4962;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11621 = obj;
                this.f11623 |= Integer.MIN_VALUE;
                return this.f11622.mo10059(null, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣۣ۠ۢ<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public C4962(InterfaceC4892<? super T> interfaceC4892) {
            this.f11620 = interfaceC4892;
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
            C0579 c0579;
            if (interfaceC4199 instanceof C0579) {
                c0579 = (C0579) interfaceC4199;
                int i = c0579.f11623;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0579.f11623 = i - Integer.MIN_VALUE;
                } else {
                    c0579 = new C0579(this, interfaceC4199);
                }
            }
            Object obj = c0579.f11621;
            Object objM17142 = C5508.m17142();
            int i2 = c0579.f11623;
            if (i2 == 0) {
                C7149.m22422(obj);
                InterfaceC4892<T> interfaceC4892 = this.f11620;
                c0579.f11623 = 1;
                if (C4896.m15208(interfaceC4892, interfaceC4890, c0579) == objM17142) {
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

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۨ$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", m1273f = "Merge.kt", m1274i = {}, m1275l = {Opcodes.OR_INT_LIT16, Opcodes.OR_INT_LIT16}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C4963<R, T> extends AbstractC7690 implements InterfaceC5140<InterfaceC4892<? super R>, T, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f11624;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f11625;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ Object f11626;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<T, InterfaceC4199<? super R>, Object> f11627;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۢ<? super T, ? super Yue.ۥ۟ۧۤۢ<? super R>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4963(InterfaceC5138<? super T, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138, InterfaceC4199<? super C4963> interfaceC4199) {
            super(3, interfaceC4199);
            this.f11627 = interfaceC5138;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to Yue.ￛﾥￛﾠￛﾢￛﾤￛﾨ$ￛﾥￛﾟￛﾟￛﾟￛﾠ<R, T> for r5v1 'this'  java.lang.Object
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
                int r1 = r5.f11624
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                Yue.C7149.m22422(r6)
                goto L45
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f11625
                Yue.ۥۣۣ۠ۢ r1 = (Yue.InterfaceC4892) r1
                Yue.C7149.m22422(r6)
                goto L39
            L22:
                Yue.C7149.m22422(r6)
                java.lang.Object r6 = r5.f11625
                r1 = r6
                Yue.ۥۣۣ۠ۢ r1 = (Yue.InterfaceC4892) r1
                java.lang.Object r6 = r5.f11626
                Yue.ۥۣ۠ۢۢ<T, Yue.ۥ۟ۧۤۢ<? super R>, java.lang.Object> r4 = r5.f11627
                r5.f11625 = r1
                r5.f11624 = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                return r0
            L39:
                r3 = 0
                r5.f11625 = r3
                r5.f11624 = r2
                java.lang.Object r6 = r1.mo10059(r6, r5)
                if (r6 != r0) goto L45
                return r0
            L45:
                Yue.ۥۣۢ۠ۤ r6 = Yue.C8107.f3222
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Yue.C4956.C4963.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5140
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object mo15350(@InterfaceC6399 InterfaceC4892<? super R> interfaceC4892, T t, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            C4963 c4963 = new C4963(this.f11627, interfaceC4199);
            c4963.f11625 = interfaceC4892;
            c4963.f11626 = t;
            return c4963.invokeSuspend(C8107.f3222);
        }
    }

    @InterfaceC6399
    @InterfaceC5039
    /* JADX INFO: renamed from: ۥ */
    public static final <T, R> InterfaceC4890<R> m1834(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5138<? super T, ? super InterfaceC4199<? super InterfaceC4890<? extends R>>, ? extends Object> interfaceC5138) {
        return C4896.m15228(new C0576(interfaceC4890, interfaceC5138));
    }

    @InterfaceC6399
    @InterfaceC4764
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T, R> InterfaceC4890<R> m1835(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 @InterfaceC3614 InterfaceC5138<? super T, ? super InterfaceC4199<? super InterfaceC4890<? extends R>>, ? extends Object> interfaceC5138) {
        return C4896.m15302(interfaceC4890, new C0577(interfaceC5138, null));
    }

    @InterfaceC6399
    @InterfaceC5039
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T, R> InterfaceC4890<R> m15390(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, int i, @InterfaceC6399 InterfaceC5138<? super T, ? super InterfaceC4199<? super InterfaceC4890<? extends R>>, ? extends Object> interfaceC5138) {
        return C4896.m15229(new C4959(interfaceC4890, interfaceC5138), i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC4890 m15391(InterfaceC4890 interfaceC4890, int i, InterfaceC5138 interfaceC5138, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = f1219;
        }
        return C4896.m15225(interfaceC4890, i, interfaceC5138);
    }

    @InterfaceC6399
    @InterfaceC5039
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15392(@InterfaceC6399 InterfaceC4890<? extends InterfaceC4890<? extends T>> interfaceC4890) {
        return new C4961(interfaceC4890);
    }

    @InterfaceC6399
    @InterfaceC5039
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15393(@InterfaceC6399 InterfaceC4890<? extends InterfaceC4890<? extends T>> interfaceC4890, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(("Expected positive concurrency level, but had " + i).toString());
        }
        if (i == 1) {
            return C4896.m15228(interfaceC4890);
        }
        return new C3719(interfaceC4890, i, null, 0, null, 28, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC4890 m15394(InterfaceC4890 interfaceC4890, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = f1219;
        }
        return C4896.m15229(interfaceC4890, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int m15395() {
        return f1219;
    }

    @InterfaceC5039
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m15396() {
    }

    @InterfaceC5039
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ void m15397() {
    }

    @InterfaceC6399
    @InterfaceC4764
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final <T, R> InterfaceC4890<R> m15398(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 @InterfaceC3614 InterfaceC5138<? super T, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) {
        return C4896.m15302(interfaceC4890, new C4963(interfaceC5138, null));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15399(@InterfaceC6399 Iterable<? extends InterfaceC4890<? extends T>> iterable) {
        return new C3731(iterable, null, 0, null, 14, null);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15400(@InterfaceC6399 InterfaceC4890<? extends T>... interfaceC4890Arr) {
        return C4896.m15248(C3411.m7413(interfaceC4890Arr));
    }

    @InterfaceC6399
    @InterfaceC4764
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final <T, R> InterfaceC4890<R> m15401(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 @InterfaceC3614 InterfaceC5140<? super InterfaceC4892<? super R>, ? super T, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5140) {
        return new C3724(interfaceC5140, interfaceC4890, null, 0, null, 28, null);
    }
}
