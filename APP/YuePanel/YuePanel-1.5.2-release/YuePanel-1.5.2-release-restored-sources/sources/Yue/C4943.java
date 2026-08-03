package Yue;

import Yue.C7060;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4943 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__LimitKt", m1273f = "Limit.kt", m1274i = {0}, m1275l = {136}, m1276m = "collectWhile", m1277n = {"collector"}, m1278s = {"L$0"})
    public static final class C0567<T> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f11535;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f11536;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f11537;

        public C0567(InterfaceC4199<? super C0567> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f11536 = obj;
            this.f11537 |= Integer.MIN_VALUE;
            return C4943.m1832(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟ */
    public static final class C0568<T> implements InterfaceC4892<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<T, InterfaceC4199<? super Boolean>, Object> f11538;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟$ۥ, reason: contains not printable characters */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", m1273f = "Limit.kt", m1274i = {0}, m1275l = {130}, m1276m = "emit", m1277n = {"this"}, m1278s = {"L$0"})
        public static final class C4944 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public Object f11539;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public /* synthetic */ Object f11540;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public int f11542;

            public C4944(InterfaceC4199<? super C4944> interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11540 = obj;
                this.f11542 |= Integer.MIN_VALUE;
                return C0568.this.mo10059(null, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۢ<? super T, ? super Yue.ۥ۟ۧۤۢ<? super java.lang.Boolean>, ? extends java.lang.Object> */
        /* JADX WARN: Multi-variable type inference failed */
        public C0568(InterfaceC5138<? super T, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5138) {
            this.f11538 = interfaceC5138;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public Object m1833(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C5437.m16931(4);
            new C4944(interfaceC4199);
            C5437.m16931(5);
            if (((Boolean) this.f11538.invoke(t, interfaceC4199)).booleanValue()) {
                return C8107.f3222;
            }
            throw new C2965(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Yue.InterfaceC4892
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C4944 c4944;
            C0568<T> c0568;
            if (interfaceC4199 instanceof C4944) {
                c4944 = (C4944) interfaceC4199;
                int i = c4944.f11542;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c4944.f11542 = i - Integer.MIN_VALUE;
                } else {
                    c4944 = new C4944(interfaceC4199);
                }
            }
            Object objInvoke = c4944.f11540;
            Object objM17142 = C5508.m17142();
            int i2 = c4944.f11542;
            if (i2 == 0) {
                C7149.m22422(objInvoke);
                InterfaceC5138<T, InterfaceC4199<? super Boolean>, Object> interfaceC5138 = this.f11538;
                c4944.f11539 = this;
                c4944.f11542 = 1;
                objInvoke = interfaceC5138.invoke(t, c4944);
                if (objInvoke == objM17142) {
                    return objM17142;
                }
                c0568 = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0568 = (C0568) c4944.f11539;
                C7149.m22422(objInvoke);
            }
            if (((Boolean) objInvoke).booleanValue()) {
                return C8107.f3222;
            }
            throw new C2965(c0568);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟, reason: contains not printable characters */
    public static final class C4945<T> implements InterfaceC4890<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4890 f11543;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ int f11544;

        public C4945(InterfaceC4890 interfaceC4890, int i) {
            this.f11543 = interfaceC4890;
            this.f11544 = i;
        }

        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            Object objMo48 = this.f11543.mo48(new C4946(new C7060.C7064(), this.f11544, interfaceC4892), interfaceC4199);
            return objMo48 == C5508.m17142() ? objMo48 : C8107.f3222;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C4946<T> implements InterfaceC4892 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7064 f11545;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ int f11546;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4892<T> f11547;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", m1273f = "Limit.kt", m1274i = {}, m1275l = {25}, m1276m = "emit", m1277n = {}, m1278s = {})
        public static final class C0569 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11548;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ C4946<T> f11549;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public int f11550;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0569(C4946<? super T> c4946, InterfaceC4199<? super C0569> interfaceC4199) {
                super(interfaceC4199);
                this.f11549 = c4946;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11548 = obj;
                this.f11550 |= Integer.MIN_VALUE;
                return this.f11549.mo10059(null, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣۣ۠ۢ<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public C4946(C7060.C7064 c7064, int i, InterfaceC4892<? super T> interfaceC4892) {
            this.f11545 = c7064;
            this.f11546 = i;
            this.f11547 = interfaceC4892;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Yue.InterfaceC4892
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C0569 c0569;
            if (interfaceC4199 instanceof C0569) {
                c0569 = (C0569) interfaceC4199;
                int i = c0569.f11550;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0569.f11550 = i - Integer.MIN_VALUE;
                } else {
                    c0569 = new C0569(this, interfaceC4199);
                }
            }
            Object obj = c0569.f11548;
            Object objM17142 = C5508.m17142();
            int i2 = c0569.f11550;
            if (i2 == 0) {
                C7149.m22422(obj);
                C7060.C7064 c7064 = this.f11545;
                int i3 = c7064.f21351;
                if (i3 < this.f11546) {
                    c7064.f21351 = i3 + 1;
                    return C8107.f3222;
                }
                InterfaceC4892<T> interfaceC4892 = this.f11547;
                c0569.f11550 = 1;
                if (interfaceC4892.mo10059(t, c0569) == objM17142) {
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

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C4947<T> implements InterfaceC4890<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4890 f11551;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138 f11552;

        public C4947(InterfaceC4890 interfaceC4890, InterfaceC5138 interfaceC5138) {
            this.f11551 = interfaceC4890;
            this.f11552 = interfaceC5138;
        }

        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            Object objMo48 = this.f11551.mo48(new C4948(new C7060.C1153(), interfaceC4892, this.f11552), interfaceC4199);
            return objMo48 == C5508.m17142() ? objMo48 : C8107.f3222;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C4948<T> implements InterfaceC4892 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C7060.C1153 f11553;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4892<T> f11554;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<T, InterfaceC4199<? super Boolean>, Object> f11555;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟۠$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", m1273f = "Limit.kt", m1274i = {1, 1}, m1275l = {37, 38, 40}, m1276m = "emit", m1277n = {"this", "value"}, m1278s = {"L$0", "L$1"})
        public static final class C0570 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public Object f11556;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public Object f11557;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public /* synthetic */ Object f11558;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public final /* synthetic */ C4948<T> f11559;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public int f11560;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟۠<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0570(C4948<? super T> c4948, InterfaceC4199<? super C0570> interfaceC4199) {
                super(interfaceC4199);
                this.f11559 = c4948;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11558 = obj;
                this.f11560 |= Integer.MIN_VALUE;
                return this.f11559.mo10059(null, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣۣ۠ۢ<? super T> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۢۢ<? super T, ? super Yue.ۥ۟ۧۤۢ<? super java.lang.Boolean>, ? extends java.lang.Object> */
        /* JADX WARN: Multi-variable type inference failed */
        public C4948(C7060.C1153 c1153, InterfaceC4892<? super T> interfaceC4892, InterfaceC5138<? super T, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5138) {
            this.f11553 = c1153;
            this.f11554 = interfaceC4892;
            this.f11555 = interfaceC5138;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
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
            C0570 c0570;
            C4948<T> c4948;
            if (interfaceC4199 instanceof C0570) {
                c0570 = (C0570) interfaceC4199;
                int i = c0570.f11560;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0570.f11560 = i - Integer.MIN_VALUE;
                } else {
                    c0570 = new C0570(this, interfaceC4199);
                }
            }
            Object objInvoke = c0570.f11558;
            Object objM17142 = C5508.m17142();
            int i2 = c0570.f11560;
            if (i2 == 0) {
                C7149.m22422(objInvoke);
                if (this.f11553.f21346) {
                    InterfaceC4892<T> interfaceC4892 = this.f11554;
                    c0570.f11560 = 1;
                    if (interfaceC4892.mo10059(t, c0570) == objM17142) {
                        return objM17142;
                    }
                    return C8107.f3222;
                }
                InterfaceC5138<T, InterfaceC4199<? super Boolean>, Object> interfaceC5138 = this.f11555;
                c0570.f11556 = this;
                c0570.f11557 = t;
                c0570.f11560 = 2;
                objInvoke = interfaceC5138.invoke(t, c0570);
                if (objInvoke == objM17142) {
                    return objM17142;
                }
                c4948 = this;
                if (!((Boolean) objInvoke).booleanValue()) {
                }
            } else {
                if (i2 == 1) {
                    C7149.m22422(objInvoke);
                    return C8107.f3222;
                }
                if (i2 == 2) {
                    t = (T) c0570.f11557;
                    c4948 = (C4948) c0570.f11556;
                    C7149.m22422(objInvoke);
                    if (!((Boolean) objInvoke).booleanValue()) {
                        return C8107.f3222;
                    }
                    c4948.f11553.f21346 = true;
                    InterfaceC4892<T> interfaceC48922 = c4948.f11554;
                    c0570.f11556 = null;
                    c0570.f11557 = null;
                    c0570.f11560 = 3;
                    if (interfaceC48922.mo10059(t, c0570) == objM17142) {
                        return objM17142;
                    }
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7149.m22422(objInvoke);
                }
            }
            return C8107.f3222;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__LimitKt", m1273f = "Limit.kt", m1274i = {0}, m1275l = {73}, m1276m = "emitAbort$FlowKt__LimitKt", m1277n = {"$this$emitAbort"}, m1278s = {"L$0"})
    public static final class C4949<T> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f11561;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f11562;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f11563;

        public C4949(InterfaceC4199<? super C4949> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f11562 = obj;
            this.f11563 |= Integer.MIN_VALUE;
            return C4943.m15385(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final class C4950<T> implements InterfaceC4890<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4890 f11564;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ int f11565;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۢ$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", m1273f = "Limit.kt", m1274i = {0}, m1275l = {115}, m1276m = "collect", m1277n = {"$this$take_u24lambda_u2d4"}, m1278s = {"L$0"})
        public static final class C0571 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11566;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f11567;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public Object f11569;

            public C0571(InterfaceC4199 interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11566 = obj;
                this.f11567 |= Integer.MIN_VALUE;
                return C4950.this.mo48(null, this);
            }
        }

        public C4950(InterfaceC4890 interfaceC4890, int i) {
            this.f11564 = interfaceC4890;
            this.f11565 = i;
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:26:0x0021 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r7v0, types: [Yue.ۥۣۣ۠ۢ, Yue.ۥۣۣ۠ۢ<? super T>, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v1, types: [Yue.ۥۣۣ۠ۢ] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v9 */
        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C0571 c0571;
            if (interfaceC4199 instanceof C0571) {
                c0571 = (C0571) interfaceC4199;
                int i = c0571.f11567;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0571.f11567 = i - Integer.MIN_VALUE;
                } else {
                    c0571 = new C0571(interfaceC4199);
                }
            }
            Object obj = c0571.f11566;
            Object objM17142 = C5508.m17142();
            int i2 = c0571.f11567;
            try {
                if (i2 == 0) {
                    C7149.m22422(obj);
                    C7060.C7064 c7064 = new C7060.C7064();
                    InterfaceC4890 interfaceC4890 = this.f11564;
                    C4951 c4951 = new C4951(c7064, this.f11565, interfaceC4892);
                    c0571.f11569 = interfaceC4892;
                    c0571.f11567 = 1;
                    Object objMo48 = interfaceC4890.mo48(c4951, c0571);
                    interfaceC4892 = objMo48;
                    if (objMo48 == objM17142) {
                        return objM17142;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z = (InterfaceC4892<? super T>) ((InterfaceC4892) c0571.f11569);
                    C7149.m22422(obj);
                    interfaceC4892 = z;
                }
            } catch (C2965 e) {
                C4895.m1804(e, interfaceC4892);
            }
            return C8107.f3222;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥۣ۟۟۟, reason: contains not printable characters */
    public static final class C4951<T> implements InterfaceC4892 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7064 f11570;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ int f11571;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4892<T> f11572;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥۣ۟۟۟$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", m1273f = "Limit.kt", m1274i = {}, m1275l = {61, 63}, m1276m = "emit", m1277n = {}, m1278s = {})
        public static final class C0572 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11573;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ C4951<T> f11574;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public int f11575;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۠ۢۤۧ$ۥۣ۟۟۟<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0572(C4951<? super T> c4951, InterfaceC4199<? super C0572> interfaceC4199) {
                super(interfaceC4199);
                this.f11574 = c4951;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11573 = obj;
                this.f11575 |= Integer.MIN_VALUE;
                return this.f11574.mo10059(null, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣۣ۠ۢ<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public C4951(C7060.C7064 c7064, int i, InterfaceC4892<? super T> interfaceC4892) {
            this.f11570 = c7064;
            this.f11571 = i;
            this.f11572 = interfaceC4892;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Yue.InterfaceC4892
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C0572 c0572;
            if (interfaceC4199 instanceof C0572) {
                c0572 = (C0572) interfaceC4199;
                int i = c0572.f11575;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0572.f11575 = i - Integer.MIN_VALUE;
                } else {
                    c0572 = new C0572(this, interfaceC4199);
                }
            }
            Object obj = c0572.f11573;
            Object objM17142 = C5508.m17142();
            int i2 = c0572.f11575;
            if (i2 != 0) {
                if (i2 == 1) {
                    C7149.m22422(obj);
                    return C8107.f3222;
                }
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7149.m22422(obj);
                return C8107.f3222;
            }
            C7149.m22422(obj);
            C7060.C7064 c7064 = this.f11570;
            int i3 = c7064.f21351 + 1;
            c7064.f21351 = i3;
            if (i3 < this.f11571) {
                InterfaceC4892<T> interfaceC4892 = this.f11572;
                c0572.f11575 = 1;
                if (interfaceC4892.mo10059(t, c0572) == objM17142) {
                    return objM17142;
                }
                return C8107.f3222;
            }
            InterfaceC4892<T> interfaceC48922 = this.f11572;
            c0572.f11575 = 2;
            if (C4943.m15385(interfaceC48922, t, c0572) == objM17142) {
                return objM17142;
            }
            return C8107.f3222;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final class C4952<T> implements InterfaceC4890<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4890 f11576;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138 f11577;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۤ$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", m1273f = "Limit.kt", m1274i = {0}, m1275l = {124}, m1276m = "collect", m1277n = {"collector$iv"}, m1278s = {"L$0"})
        public static final class C0573 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11578;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f11579;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public Object f11581;

            public C0573(InterfaceC4199 interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11578 = obj;
                this.f11579 |= Integer.MIN_VALUE;
                return C4952.this.mo48(null, this);
            }
        }

        public C4952(InterfaceC4890 interfaceC4890, InterfaceC5138 interfaceC5138) {
            this.f11576 = interfaceC4890;
            this.f11577 = interfaceC5138;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C0573 c0573;
            C4953 c4953;
            if (interfaceC4199 instanceof C0573) {
                c0573 = (C0573) interfaceC4199;
                int i = c0573.f11579;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0573.f11579 = i - Integer.MIN_VALUE;
                } else {
                    c0573 = new C0573(interfaceC4199);
                }
            }
            Object obj = c0573.f11578;
            Object objM17142 = C5508.m17142();
            int i2 = c0573.f11579;
            if (i2 == 0) {
                C7149.m22422(obj);
                InterfaceC4890 interfaceC4890 = this.f11576;
                C4953 c49532 = new C4953(this.f11577, interfaceC4892);
                try {
                    c0573.f11581 = c49532;
                    c0573.f11579 = 1;
                    if (interfaceC4890.mo48(c49532, c0573) == objM17142) {
                        return objM17142;
                    }
                } catch (C2965 e) {
                    e = e;
                    c4953 = c49532;
                    C4895.m1804(e, c4953);
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4953 = (C4953) c0573.f11581;
                try {
                    C7149.m22422(obj);
                } catch (C2965 e2) {
                    e = e2;
                    C4895.m1804(e, c4953);
                }
            }
            return C8107.f3222;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final class C4953<T> implements InterfaceC4892<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138 f11582;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4892 f11583;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۥ$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda-6$$inlined$collectWhile$1", m1273f = "Limit.kt", m1274i = {0, 0, 1}, m1275l = {142, 143}, m1276m = "emit", m1277n = {"this", "value", "this"}, m1278s = {"L$0", "L$1", "L$0"})
        public static final class C0574 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public Object f11584;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public /* synthetic */ Object f11585;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public int f11586;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public Object f11588;

            public C0574(InterfaceC4199 interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11585 = obj;
                this.f11586 |= Integer.MIN_VALUE;
                return C4953.this.mo10059(null, this);
            }
        }

        public C4953(InterfaceC5138 interfaceC5138, InterfaceC4892 interfaceC4892) {
            this.f11582 = interfaceC5138;
            this.f11583 = interfaceC4892;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: Yue.ۥۣۣ۠ۢ */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Yue.InterfaceC4892
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C0574 c0574;
            Object obj;
            Object obj2;
            C4953<T> c4953;
            if (interfaceC4199 instanceof C0574) {
                c0574 = (C0574) interfaceC4199;
                int i = c0574.f11586;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0574.f11586 = i - Integer.MIN_VALUE;
                } else {
                    c0574 = new C0574(interfaceC4199);
                }
            }
            Object obj3 = c0574.f11585;
            Object objM17142 = C5508.m17142();
            int i2 = c0574.f11586;
            boolean z = true;
            if (i2 == 0) {
                C7149.m22422(obj3);
                InterfaceC5138 interfaceC5138 = this.f11582;
                c0574.f11584 = this;
                c0574.f11588 = t;
                c0574.f11586 = 1;
                C5437.m16931(6);
                Object objInvoke = interfaceC5138.invoke(t, c0574);
                C5437.m16931(7);
                if (objInvoke == objM17142) {
                    return objM17142;
                }
                obj = objInvoke;
                obj2 = t;
                c4953 = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4953 = (C4953) c0574.f11584;
                    C7149.m22422(obj3);
                    if (z) {
                        throw new C2965(c4953);
                    }
                    return C8107.f3222;
                }
                Object obj4 = c0574.f11588;
                C4953<T> c49532 = (C4953) c0574.f11584;
                C7149.m22422(obj3);
                obj2 = obj4;
                c4953 = c49532;
                obj = obj3;
            }
            if (((Boolean) obj).booleanValue()) {
                InterfaceC4892 interfaceC4892 = c4953.f11583;
                c0574.f11584 = c4953;
                c0574.f11588 = null;
                c0574.f11586 = 2;
                if (interfaceC4892.mo10059(obj2, c0574) == objM17142) {
                    return objM17142;
                }
            } else {
                z = false;
            }
            if (z) {
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", m1273f = "Limit.kt", m1274i = {0}, m1275l = {152}, m1276m = "invokeSuspend", m1277n = {"collector$iv"}, m1278s = {"L$0"})
    public static final class C4954<R> extends AbstractC7690 implements InterfaceC5138<InterfaceC4892<? super R>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f11589;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f11590;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4890<T> f11591;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5140<InterfaceC4892<? super R>, T, InterfaceC4199<? super Boolean>, Object> f11592;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ */
        public static final class C0575<T> implements InterfaceC4892<T> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC5140 f11593;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC4892 f11594;

            /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ$ۥ, reason: contains not printable characters */
            @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", m1273f = "Limit.kt", m1274i = {0}, m1275l = {142}, m1276m = "emit", m1277n = {"this"}, m1278s = {"L$0"})
            public static final class C4955 extends AbstractC4201 {

                /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
                public Object f11595;

                /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
                public /* synthetic */ Object f11596;

                /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
                public int f11597;

                public C4955(InterfaceC4199 interfaceC4199) {
                    super(interfaceC4199);
                }

                @Override // Yue.AbstractC3513
                @InterfaceC6489
                public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                    this.f11596 = obj;
                    this.f11597 |= Integer.MIN_VALUE;
                    return C0575.this.mo10059(null, this);
                }
            }

            public C0575(InterfaceC5140 interfaceC5140, InterfaceC4892 interfaceC4892) {
                this.f11593 = interfaceC5140;
                this.f11594 = interfaceC4892;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // Yue.InterfaceC4892
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟۟۟۟ */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
                C4955 c4955;
                C0575<T> c0575;
                if (interfaceC4199 instanceof C4955) {
                    c4955 = (C4955) interfaceC4199;
                    int i = c4955.f11597;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c4955.f11597 = i - Integer.MIN_VALUE;
                    } else {
                        c4955 = new C4955(interfaceC4199);
                    }
                }
                Object objMo15350 = c4955.f11596;
                Object objM17142 = C5508.m17142();
                int i2 = c4955.f11597;
                if (i2 == 0) {
                    C7149.m22422(objMo15350);
                    InterfaceC5140 interfaceC5140 = this.f11593;
                    InterfaceC4892 interfaceC4892 = this.f11594;
                    c4955.f11595 = this;
                    c4955.f11597 = 1;
                    C5437.m16931(6);
                    objMo15350 = interfaceC5140.mo15350(interfaceC4892, t, c4955);
                    C5437.m16931(7);
                    if (objMo15350 == objM17142) {
                        return objM17142;
                    }
                    c0575 = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0575 = (C0575) c4955.f11595;
                    C7149.m22422(objMo15350);
                }
                if (((Boolean) objMo15350).booleanValue()) {
                    return C8107.f3222;
                }
                throw new C2965(c0575);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۡ<? extends T> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۤ<? super Yue.ۥۣۣ۠ۢ<? super R>, ? super T, ? super Yue.ۥ۟ۧۤۢ<? super java.lang.Boolean>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4954(InterfaceC4890<? extends T> interfaceC4890, InterfaceC5140<? super InterfaceC4892<? super R>, ? super T, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5140, InterfaceC4199<? super C4954> interfaceC4199) {
            super(2, interfaceC4199);
            this.f11591 = interfaceC4890;
            this.f11592 = interfaceC5140;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C4954 c4954 = new C4954(this.f11591, this.f11592, interfaceC4199);
            c4954.f11590 = obj;
            return c4954;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type Yue.ￛﾥￛﾟￛﾧￛﾤￛﾢ to Yue.ￛﾥￛﾠￛﾢￛﾤￛﾧ$ￛﾥￛﾟￛﾟￛﾟￛﾦ<R> for r5v1 'this'  Yue.ￛﾥￛﾟￛﾧￛﾤￛﾢ
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
                int r1 = r5.f11589
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r5.f11590
                Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ r0 = (Yue.C4943.C4954.C0575) r0
                Yue.C7149.m22422(r6)     // Catch: Yue.C2965 -> L13
                goto L3d
            L13:
                r6 = move-exception
                goto L3a
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                Yue.C7149.m22422(r6)
                java.lang.Object r6 = r5.f11590
                Yue.ۥۣۣ۠ۢ r6 = (Yue.InterfaceC4892) r6
                Yue.ۥۣ۠ۢۡ<T> r1 = r5.f11591
                Yue.ۥۣ۠ۢۤ<Yue.ۥۣۣ۠ۢ<? super R>, T, Yue.ۥ۟ۧۤۢ<? super java.lang.Boolean>, java.lang.Object> r3 = r5.f11592
                Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ r4 = new Yue.ۥ۠ۢۤۧ$ۥ۟۟۟ۦ$ۥ
                r4.<init>(r3, r6)
                r5.f11590 = r4     // Catch: Yue.C2965 -> L38
                r5.f11589 = r2     // Catch: Yue.C2965 -> L38
                java.lang.Object r6 = r1.mo48(r4, r5)     // Catch: Yue.C2965 -> L38
                if (r6 != r0) goto L3d
                return r0
            L38:
                r6 = move-exception
                r0 = r4
            L3a:
                Yue.C4895.m1804(r6, r0)
            L3d:
                Yue.ۥۣۢ۠ۤ r6 = Yue.C8107.f3222
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Yue.C4943.C4954.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 InterfaceC4892<? super R> interfaceC4892, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C4954) create(interfaceC4892, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m1832(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5138<? super T, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        C0567 c0567;
        InterfaceC4892<? super Object> interfaceC4892;
        if (interfaceC4199 instanceof C0567) {
            c0567 = (C0567) interfaceC4199;
            int i = c0567.f11537;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0567.f11537 = i - Integer.MIN_VALUE;
            } else {
                c0567 = new C0567(interfaceC4199);
            }
        }
        Object obj = c0567.f11536;
        Object objM17142 = C5508.m17142();
        int i2 = c0567.f11537;
        if (i2 == 0) {
            C7149.m22422(obj);
            InterfaceC4892<? super Object> c0568 = new C0568<>(interfaceC5138);
            try {
                c0567.f11535 = c0568;
                c0567.f11537 = 1;
                if (interfaceC4890.mo48(c0568, c0567) == objM17142) {
                    return objM17142;
                }
            } catch (C2965 e) {
                e = e;
                interfaceC4892 = c0568;
                C4895.m1804(e, interfaceC4892);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC4892 = (C0568) c0567.f11535;
            try {
                C7149.m22422(obj);
            } catch (C2965 e2) {
                e = e2;
                C4895.m1804(e, interfaceC4892);
            }
        }
        return C8107.f3222;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> Object m15382(InterfaceC4890<? extends T> interfaceC4890, InterfaceC5138<? super T, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5138, InterfaceC4199<? super C8107> interfaceC4199) {
        C0568 c0568 = new C0568(interfaceC5138);
        try {
            C5437.m16931(0);
            interfaceC4890.mo48(c0568, interfaceC4199);
            C5437.m16931(1);
        } catch (C2965 e) {
            C4895.m1804(e, c0568);
        }
        return C8107.f3222;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15383(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, int i) {
        if (i >= 0) {
            return new C4945(interfaceC4890, i);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i).toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15384(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5138<? super T, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5138) {
        return new C4947(interfaceC4890, interfaceC5138);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m15385(InterfaceC4892<? super T> interfaceC4892, T t, InterfaceC4199<? super C8107> interfaceC4199) {
        C4949 c4949;
        if (interfaceC4199 instanceof C4949) {
            c4949 = (C4949) interfaceC4199;
            int i = c4949.f11563;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4949.f11563 = i - Integer.MIN_VALUE;
            } else {
                c4949 = new C4949(interfaceC4199);
            }
        }
        Object obj = c4949.f11562;
        Object objM17142 = C5508.m17142();
        int i2 = c4949.f11563;
        if (i2 == 0) {
            C7149.m22422(obj);
            c4949.f11561 = interfaceC4892;
            c4949.f11563 = 1;
            if (interfaceC4892.mo10059(t, c4949) == objM17142) {
                return objM17142;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC4892 = (InterfaceC4892) c4949.f11561;
            C7149.m22422(obj);
        }
        throw new C2965(interfaceC4892);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15386(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, int i) {
        if (i > 0) {
            return new C4950(interfaceC4890, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " should be positive").toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15387(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5138<? super T, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5138) {
        return new C4952(interfaceC4890, interfaceC5138);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T, R> InterfaceC4890<R> m15388(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 @InterfaceC3614 InterfaceC5140<? super InterfaceC4892<? super R>, ? super T, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5140) {
        return C4896.m15231(new C4954(interfaceC4890, interfaceC5140, null));
    }
}
