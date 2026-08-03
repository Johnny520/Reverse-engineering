package Yue;

import Yue.C7060;
import com.android.p001dx.p004io.Opcodes;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4928 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۥ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", m1273f = "Emitters.kt", m1274i = {0}, m1275l = {Opcodes.ADD_INT_LIT8}, m1276m = "invokeSafely$FlowKt__EmittersKt", m1277n = {"cause"}, m1278s = {"L$0"})
    public static final class C0555<T> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f11453;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f11454;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f11455;

        public C0555(InterfaceC4199<? super C0555> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f11454 = obj;
            this.f11455 |= Integer.MIN_VALUE;
            return C4928.m15365(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۥ$ۥ۟ */
    public static final class C0556<T> implements InterfaceC4890<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4890 f11456;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5140 f11457;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۥ$ۥ۟$ۥ, reason: contains not printable characters */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", m1273f = "Emitters.kt", m1274i = {0, 0, 1, 2}, m1275l = {114, 121, 128}, m1276m = "collect", m1277n = {"this", "$this$onCompletion_u24lambda_u2d2", "e", "sc"}, m1278s = {"L$0", "L$1", "L$0", "L$0"})
        public static final class C4929 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11458;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f11459;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public Object f11461;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public Object f11462;

            public C4929(InterfaceC4199 interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11458 = obj;
                this.f11459 |= Integer.MIN_VALUE;
                return C0556.this.mo48(null, this);
            }
        }

        public C0556(InterfaceC4890 interfaceC4890, InterfaceC5140 interfaceC5140) {
            this.f11456 = interfaceC4890;
            this.f11457 = interfaceC5140;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ab A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) throws Throwable {
            C4929 c4929;
            C0556<T> c0556;
            C7791 c7791;
            InterfaceC5140 interfaceC5140;
            C7203 c7203;
            Throwable th;
            C7203 c72032;
            Object objMo15350;
            if (interfaceC4199 instanceof C4929) {
                c4929 = (C4929) interfaceC4199;
                int i = c4929.f11459;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c4929.f11459 = i - Integer.MIN_VALUE;
                } else {
                    c4929 = new C4929(interfaceC4199);
                }
            }
            Object obj = c4929.f11458;
            Object objM17142 = C5508.m17142();
            int i2 = c4929.f11459;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        Throwable th2 = (Throwable) c4929.f11461;
                        C7149.m22422(obj);
                        throw th2;
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c72032 = (C7203) c4929.f11461;
                    try {
                        C7149.m22422(obj);
                        c72032.releaseIntercepted();
                        return C8107.f3222;
                    } catch (Throwable th3) {
                        th = th3;
                        c72032.releaseIntercepted();
                        throw th;
                    }
                }
                interfaceC4892 = (InterfaceC4892) c4929.f11462;
                c0556 = (C0556) c4929.f11461;
                try {
                    C7149.m22422(obj);
                    c7203 = new C7203(interfaceC4892, c4929.getContext());
                    try {
                        InterfaceC5140 interfaceC51402 = c0556.f11457;
                        c4929.f11461 = c7203;
                        c4929.f11462 = null;
                        c4929.f11459 = 3;
                        C5437.m16931(6);
                        objMo15350 = interfaceC51402.mo15350(c7203, null, c4929);
                        C5437.m16931(7);
                        if (objMo15350 != objM17142) {
                            return objM17142;
                        }
                        c72032 = c7203;
                        c72032.releaseIntercepted();
                        return C8107.f3222;
                    } catch (Throwable th4) {
                        th = th4;
                        c72032 = c7203;
                        c72032.releaseIntercepted();
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    c7791 = new C7791(th);
                    interfaceC5140 = c0556.f11457;
                    c4929.f11461 = th;
                    c4929.f11462 = null;
                    c4929.f11459 = 2;
                    if (C4928.m15365(c7791, interfaceC5140, th, c4929) != objM17142) {
                        return objM17142;
                    }
                    throw th;
                }
            }
            C7149.m22422(obj);
            try {
                InterfaceC4890 interfaceC4890 = this.f11456;
                c4929.f11461 = this;
                c4929.f11462 = interfaceC4892;
                c4929.f11459 = 1;
                if (interfaceC4890.mo48(interfaceC4892, c4929) == objM17142) {
                    return objM17142;
                }
                c0556 = this;
                c7203 = new C7203(interfaceC4892, c4929.getContext());
                InterfaceC5140 interfaceC514022 = c0556.f11457;
                c4929.f11461 = c7203;
                c4929.f11462 = null;
                c4929.f11459 = 3;
                C5437.m16931(6);
                objMo15350 = interfaceC514022.mo15350(c7203, null, c4929);
                C5437.m16931(7);
                if (objMo15350 != objM17142) {
                }
            } catch (Throwable th6) {
                th = th6;
                c0556 = this;
                c7791 = new C7791(th);
                interfaceC5140 = c0556.f11457;
                c4929.f11461 = th;
                c4929.f11462 = null;
                c4929.f11459 = 2;
                if (C4928.m15365(c7791, interfaceC5140, th, c4929) != objM17142) {
                }
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۥ$ۥ۟۟, reason: contains not printable characters */
    public static final class C4930<T> implements InterfaceC4890<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4890 f11463;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138 f11464;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۥ$ۥ۟۟$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", m1273f = "Emitters.kt", m1274i = {0, 0, 0, 1}, m1275l = {114, 122}, m1276m = "collect", m1277n = {"this", "$this$onEmpty_u24lambda_u2d3", "isEmpty", "collector"}, m1278s = {"L$0", "L$1", "L$2", "L$0"})
        public static final class C0557 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11465;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f11466;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public Object f11468;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public Object f11469;

            /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
            public Object f11470;

            public C0557(InterfaceC4199 interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11465 = obj;
                this.f11466 |= Integer.MIN_VALUE;
                return C4930.this.mo48(null, this);
            }
        }

        public C4930(InterfaceC4890 interfaceC4890, InterfaceC5138 interfaceC5138) {
            this.f11463 = interfaceC4890;
            this.f11464 = interfaceC5138;
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:35:0x0022 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4, types: [Yue.ۥۣۣ۠ۢ] */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARN: Type inference failed for: r7v0, types: [Yue.ۥۣۣ۠ۢ, Yue.ۥۣۣ۠ۢ<? super T>, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r7v1, types: [Yue.ۥۡۧۢ۠] */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v7, types: [Yue.ۥۡۧۢ۠] */
        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C0557 c0557;
            C4930<T> c4930;
            ?? r2;
            C7060.C1153 c1153;
            if (interfaceC4199 instanceof C0557) {
                c0557 = (C0557) interfaceC4199;
                int i = c0557.f11466;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0557.f11466 = i - Integer.MIN_VALUE;
                } else {
                    c0557 = new C0557(interfaceC4199);
                }
            }
            Object obj = c0557.f11465;
            Object objM17142 = C5508.m17142();
            int i2 = c0557.f11466;
            try {
                if (i2 == 0) {
                    C7149.m22422(obj);
                    C7060.C1153 c11532 = new C7060.C1153();
                    c11532.f21346 = true;
                    InterfaceC4890 interfaceC4890 = this.f11463;
                    C4931 c4931 = new C4931(c11532, interfaceC4892);
                    c0557.f11468 = this;
                    c0557.f11469 = interfaceC4892;
                    c0557.f11470 = c11532;
                    c0557.f11466 = 1;
                    if (interfaceC4890.mo48(c4931, c0557) == objM17142) {
                        return objM17142;
                    }
                    c4930 = this;
                    r2 = interfaceC4892;
                    c1153 = c11532;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7203 c7203 = (C7203) c0557.f11468;
                        C7149.m22422(obj);
                        interfaceC4892 = c7203;
                        return C8107.f3222;
                    }
                    c1153 = (C7060.C1153) c0557.f11470;
                    InterfaceC4892 interfaceC48922 = (InterfaceC4892) c0557.f11469;
                    c4930 = (C4930) c0557.f11468;
                    C7149.m22422(obj);
                    r2 = interfaceC48922;
                }
                if (c1153.f21346) {
                    C7203 c72032 = new C7203(r2, c0557.getContext());
                    InterfaceC5138 interfaceC5138 = c4930.f11464;
                    c0557.f11468 = c72032;
                    c0557.f11469 = null;
                    c0557.f11470 = null;
                    c0557.f11466 = 2;
                    C5437.m16931(6);
                    Object objInvoke = interfaceC5138.invoke(c72032, c0557);
                    C5437.m16931(7);
                    interfaceC4892 = c72032;
                    if (objInvoke == objM17142) {
                        return objM17142;
                    }
                }
                return C8107.f3222;
            } finally {
                interfaceC4892.releaseIntercepted();
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۥ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C4931<T> implements InterfaceC4892 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C7060.C1153 f11471;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4892<T> f11472;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۥ$ۥ۟۟۟$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", m1273f = "Emitters.kt", m1274i = {}, m1275l = {185}, m1276m = "emit", m1277n = {}, m1278s = {})
        public static final class C0558 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11473;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ C4931<T> f11474;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public int f11475;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۠ۢۤۥ$ۥ۟۟۟<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0558(C4931<? super T> c4931, InterfaceC4199<? super C0558> interfaceC4199) {
                super(interfaceC4199);
                this.f11474 = c4931;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11473 = obj;
                this.f11475 |= Integer.MIN_VALUE;
                return this.f11474.mo10059(null, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣۣ۠ۢ<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public C4931(C7060.C1153 c1153, InterfaceC4892<? super T> interfaceC4892) {
            this.f11471 = c1153;
            this.f11472 = interfaceC4892;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Yue.InterfaceC4892
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C0558 c0558;
            if (interfaceC4199 instanceof C0558) {
                c0558 = (C0558) interfaceC4199;
                int i = c0558.f11475;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0558.f11475 = i - Integer.MIN_VALUE;
                } else {
                    c0558 = new C0558(this, interfaceC4199);
                }
            }
            Object obj = c0558.f11473;
            Object objM17142 = C5508.m17142();
            int i2 = c0558.f11475;
            if (i2 == 0) {
                C7149.m22422(obj);
                this.f11471.f21346 = false;
                InterfaceC4892<T> interfaceC4892 = this.f11472;
                c0558.f11475 = 1;
                if (interfaceC4892.mo10059(t, c0558) == objM17142) {
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
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C4932<T> implements InterfaceC4890<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138 f11476;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4890 f11477;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۥ$ۥ۟۟۟۟$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", m1273f = "Emitters.kt", m1274i = {0, 0, 0}, m1275l = {116, 120}, m1276m = "collect", m1277n = {"this", "$this$onStart_u24lambda_u2d1", "safeCollector"}, m1278s = {"L$0", "L$1", "L$2"})
        public static final class C0559 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11478;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f11479;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public Object f11481;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public Object f11482;

            /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
            public Object f11483;

            public C0559(InterfaceC4199 interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11478 = obj;
                this.f11479 |= Integer.MIN_VALUE;
                return C4932.this.mo48(null, this);
            }
        }

        public C4932(InterfaceC5138 interfaceC5138, InterfaceC4890 interfaceC4890) {
            this.f11476 = interfaceC5138;
            this.f11477 = interfaceC4890;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0082 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) throws Throwable {
            C0559 c0559;
            Throwable th;
            C7203 c7203;
            C4932<T> c4932;
            InterfaceC4892<? super T> interfaceC48922;
            InterfaceC4890 interfaceC4890;
            if (interfaceC4199 instanceof C0559) {
                c0559 = (C0559) interfaceC4199;
                int i = c0559.f11479;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0559.f11479 = i - Integer.MIN_VALUE;
                } else {
                    c0559 = new C0559(interfaceC4199);
                }
            }
            Object obj = c0559.f11478;
            Object objM17142 = C5508.m17142();
            int i2 = c0559.f11479;
            if (i2 == 0) {
                C7149.m22422(obj);
                C7203 c72032 = new C7203(interfaceC4892, c0559.getContext());
                try {
                    InterfaceC5138 interfaceC5138 = this.f11476;
                    c0559.f11481 = this;
                    c0559.f11482 = interfaceC4892;
                    c0559.f11483 = c72032;
                    c0559.f11479 = 1;
                    C5437.m16931(6);
                    Object objInvoke = interfaceC5138.invoke(c72032, c0559);
                    C5437.m16931(7);
                    if (objInvoke == objM17142) {
                        return objM17142;
                    }
                    c4932 = this;
                    interfaceC48922 = interfaceC4892;
                    c7203 = c72032;
                    c7203.releaseIntercepted();
                    interfaceC4890 = c4932.f11477;
                    c0559.f11481 = null;
                    c0559.f11482 = null;
                    c0559.f11483 = null;
                    c0559.f11479 = 2;
                    if (interfaceC4890.mo48(interfaceC48922, c0559) == objM17142) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    c7203 = c72032;
                    c7203.releaseIntercepted();
                    throw th;
                }
            } else if (i2 == 1) {
                c7203 = (C7203) c0559.f11483;
                interfaceC48922 = (InterfaceC4892) c0559.f11482;
                c4932 = (C4932) c0559.f11481;
                try {
                    C7149.m22422(obj);
                    c7203.releaseIntercepted();
                    interfaceC4890 = c4932.f11477;
                    c0559.f11481 = null;
                    c0559.f11482 = null;
                    c0559.f11483 = null;
                    c0559.f11479 = 2;
                    if (interfaceC4890.mo48(interfaceC48922, c0559) == objM17142) {
                        return objM17142;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c7203.releaseIntercepted();
                    throw th;
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7149.m22422(obj);
            }
            return C8107.f3222;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۥ$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", m1273f = "Emitters.kt", m1274i = {}, m1275l = {40}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C4933<R> extends AbstractC7690 implements InterfaceC5138<InterfaceC4892<? super R>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f11484;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f11485;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4890<T> f11486;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5140<InterfaceC4892<? super R>, T, InterfaceC4199<? super C8107>, Object> f11487;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۥ$ۥ۟۟۟۠$ۥ */
        public static final class C0560<T> implements InterfaceC4892 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC5140<InterfaceC4892<? super R>, T, InterfaceC4199<? super C8107>, Object> f11488;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC4892<R> f11489;

            /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۥ$ۥ۟۟۟۠$ۥ$ۥ, reason: contains not printable characters */
            @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1", m1273f = "Emitters.kt", m1274i = {}, m1275l = {42}, m1276m = "emit", m1277n = {}, m1278s = {})
            public static final class C4934 extends AbstractC4201 {

                /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
                public /* synthetic */ Object f11490;

                /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
                public final /* synthetic */ C0560<T> f11491;

                /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
                public int f11492;

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۠ۢۤۥ$ۥ۟۟۟۠$ۥ<? super T> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C4934(C0560<? super T> c0560, InterfaceC4199<? super C4934> interfaceC4199) {
                    super(interfaceC4199);
                    this.f11491 = c0560;
                }

                @Override // Yue.AbstractC3513
                @InterfaceC6489
                public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                    this.f11490 = obj;
                    this.f11492 |= Integer.MIN_VALUE;
                    return this.f11491.mo10059(null, this);
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۤ<? super Yue.ۥۣۣ۠ۢ<? super R>, ? super T, ? super Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, ? extends java.lang.Object> */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣۣ۠ۢ<? super R> */
            /* JADX WARN: Multi-variable type inference failed */
            public C0560(InterfaceC5140<? super InterfaceC4892<? super R>, ? super T, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5140, InterfaceC4892<? super R> interfaceC4892) {
                this.f11488 = interfaceC5140;
                this.f11489 = interfaceC4892;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ */
            public final Object m1827(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
                C5437.m16931(4);
                new C4934(this, interfaceC4199);
                C5437.m16931(5);
                this.f11488.mo15350((InterfaceC4892<? super R>) this.f11489, t, interfaceC4199);
                return C8107.f3222;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // Yue.InterfaceC4892
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟۟۟۟ */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
                C4934 c4934;
                if (interfaceC4199 instanceof C4934) {
                    c4934 = (C4934) interfaceC4199;
                    int i = c4934.f11492;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c4934.f11492 = i - Integer.MIN_VALUE;
                    } else {
                        c4934 = new C4934(this, interfaceC4199);
                    }
                }
                Object obj = c4934.f11490;
                Object objM17142 = C5508.m17142();
                int i2 = c4934.f11492;
                if (i2 == 0) {
                    C7149.m22422(obj);
                    InterfaceC5140<InterfaceC4892<? super R>, T, InterfaceC4199<? super C8107>, Object> interfaceC5140 = this.f11488;
                    InterfaceC4892<R> interfaceC4892 = this.f11489;
                    c4934.f11492 = 1;
                    if (interfaceC5140.mo15350((InterfaceC4892<? super R>) interfaceC4892, t, c4934) == objM17142) {
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
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۤ<? super Yue.ۥۣۣ۠ۢ<? super R>, ? super T, ? super Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4933(InterfaceC4890<? extends T> interfaceC4890, InterfaceC5140<? super InterfaceC4892<? super R>, ? super T, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5140, InterfaceC4199<? super C4933> interfaceC4199) {
            super(2, interfaceC4199);
            this.f11486 = interfaceC4890;
            this.f11487 = interfaceC5140;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C4933 c4933 = new C4933(this.f11486, this.f11487, interfaceC4199);
            c4933.f11485 = obj;
            return c4933;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type Yue.ￛﾥￛﾟￛﾧￛﾤￛﾢ to Yue.ￛﾥￛﾠￛﾢￛﾤￛﾥ$ￛﾥￛﾟￛﾟￛﾟￛﾠ<R> for r5v1 'this'  Yue.ￛﾥￛﾟￛﾧￛﾤￛﾢ
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
                int r1 = r5.f11484
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                Yue.C7149.m22422(r6)
                goto L30
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                Yue.C7149.m22422(r6)
                java.lang.Object r6 = r5.f11485
                Yue.ۥۣۣ۠ۢ r6 = (Yue.InterfaceC4892) r6
                Yue.ۥۣ۠ۢۡ<T> r1 = r5.f11486
                Yue.ۥ۠ۢۤۥ$ۥ۟۟۟۠$ۥ r3 = new Yue.ۥ۠ۢۤۥ$ۥ۟۟۟۠$ۥ
                Yue.ۥۣ۠ۢۤ<Yue.ۥۣۣ۠ۢ<? super R>, T, Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, java.lang.Object> r4 = r5.f11487
                r3.<init>(r4, r6)
                r5.f11484 = r2
                java.lang.Object r6 = r1.mo48(r3, r5)
                if (r6 != r0) goto L30
                return r0
            L30:
                Yue.ۥۣۢ۠ۤ r6 = Yue.C8107.f3222
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Yue.C4928.C4933.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 InterfaceC4892<? super R> interfaceC4892, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C4933) create(interfaceC4892, interfaceC4199)).invokeSuspend(C8107.f3222);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type Yue.ￛﾥￛﾟￛﾧￛﾤￛﾢ to Yue.ￛﾥￛﾠￛﾢￛﾤￛﾥ$ￛﾥￛﾟￛﾟￛﾟￛﾠ<R> for r3v1 'this'  Yue.ￛﾥￛﾟￛﾧￛﾤￛﾢ
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Yue.InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final java.lang.Object m15372(@Yue.InterfaceC6399 java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r4 = r3.f11485
                Yue.ۥۣۣ۠ۢ r4 = (Yue.InterfaceC4892) r4
                Yue.ۥۣ۠ۢۡ<T> r0 = r3.f11486
                Yue.ۥ۠ۢۤۥ$ۥ۟۟۟۠$ۥ r1 = new Yue.ۥ۠ۢۤۥ$ۥ۟۟۟۠$ۥ
                Yue.ۥۣ۠ۢۤ<Yue.ۥۣۣ۠ۢ<? super R>, T, Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, java.lang.Object> r2 = r3.f11487
                r1.<init>(r2, r4)
                r4 = 0
                Yue.C5437.m16931(r4)
                r0.mo48(r1, r3)
                r4 = 1
                Yue.C5437.m16931(r4)
                Yue.ۥۣۢ۠ۤ r4 = Yue.C8107.f3222
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: Yue.C4928.C4933.m15372(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۥ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class C4935<R> implements InterfaceC4890<R> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4890 f11493;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5140 f11494;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۥ$ۥ۟۟۟ۡ$ۥ */
        public static final class C0561 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11495;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f11496;

            public C0561(InterfaceC4199 interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11495 = obj;
                this.f11496 |= Integer.MIN_VALUE;
                return C4935.this.mo48(null, this);
            }
        }

        public C4935(InterfaceC4890 interfaceC4890, InterfaceC5140 interfaceC5140) {
            this.f11493 = interfaceC4890;
            this.f11494 = interfaceC5140;
        }

        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super R> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            Object objMo48 = this.f11493.mo48(new C4936(this.f11494, interfaceC4892), interfaceC4199);
            return objMo48 == C5508.m17142() ? objMo48 : C8107.f3222;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public Object m15373(@InterfaceC6399 InterfaceC4892 interfaceC4892, @InterfaceC6399 InterfaceC4199 interfaceC4199) {
            C5437.m16931(4);
            new C0561(interfaceC4199);
            C5437.m16931(5);
            InterfaceC4890 interfaceC4890 = this.f11493;
            C4936 c4936 = new C4936(this.f11494, interfaceC4892);
            C5437.m16931(0);
            interfaceC4890.mo48(c4936, interfaceC4199);
            C5437.m16931(1);
            return C8107.f3222;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۥ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final class C4936<T> implements InterfaceC4892 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5140<InterfaceC4892<? super R>, T, InterfaceC4199<? super C8107>, Object> f11498;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4892<R> f11499;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۥ$ۥ۟۟۟ۢ$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1", m1273f = "Emitters.kt", m1274i = {}, m1275l = {53}, m1276m = "emit", m1277n = {}, m1278s = {})
        public static final class C0562 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11500;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ C4936<T> f11501;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public int f11502;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۠ۢۤۥ$ۥ۟۟۟ۢ<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0562(C4936<? super T> c4936, InterfaceC4199<? super C0562> interfaceC4199) {
                super(interfaceC4199);
                this.f11501 = c4936;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11500 = obj;
                this.f11502 |= Integer.MIN_VALUE;
                return this.f11501.mo10059(null, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۤ<? super Yue.ۥۣۣ۠ۢ<? super R>, ? super T, ? super Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ>, ? extends java.lang.Object> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣۣ۠ۢ<? super R> */
        /* JADX WARN: Multi-variable type inference failed */
        public C4936(InterfaceC5140<? super InterfaceC4892<? super R>, ? super T, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5140, InterfaceC4892<? super R> interfaceC4892) {
            this.f11498 = interfaceC5140;
            this.f11499 = interfaceC4892;
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
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public final Object m1828(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C5437.m16931(4);
            new C0562(this, interfaceC4199);
            C5437.m16931(5);
            this.f11498.mo15350(this.f11499, t, interfaceC4199);
            return C8107.f3222;
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
            C0562 c0562;
            if (interfaceC4199 instanceof C0562) {
                c0562 = (C0562) interfaceC4199;
                int i = c0562.f11502;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0562.f11502 = i - Integer.MIN_VALUE;
                } else {
                    c0562 = new C0562(this, interfaceC4199);
                }
            }
            Object obj = c0562.f11500;
            Object objM17142 = C5508.m17142();
            int i2 = c0562.f11502;
            if (i2 == 0) {
                C7149.m22422(obj);
                InterfaceC5140<InterfaceC4892<? super R>, T, InterfaceC4199<? super C8107>, Object> interfaceC5140 = this.f11498;
                Object obj2 = this.f11499;
                c0562.f11502 = 1;
                if (interfaceC5140.mo15350(obj2, t, c0562) == objM17142) {
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

    /* JADX INFO: renamed from: ۥ۟ */
    public static final void m1826(@InterfaceC6399 InterfaceC4892<?> interfaceC4892) {
        if (interfaceC4892 instanceof C7791) {
            throw ((C7791) interfaceC4892).f23338;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m15365(InterfaceC4892<? super T> interfaceC4892, InterfaceC5140<? super InterfaceC4892<? super T>, ? super Throwable, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5140, Throwable th, InterfaceC4199<? super C8107> interfaceC4199) {
        C0555 c0555;
        if (interfaceC4199 instanceof C0555) {
            c0555 = (C0555) interfaceC4199;
            int i = c0555.f11455;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0555.f11455 = i - Integer.MIN_VALUE;
            } else {
                c0555 = new C0555(interfaceC4199);
            }
        }
        Object obj = c0555.f11454;
        Object objM17142 = C5508.m17142();
        int i2 = c0555.f11455;
        try {
            if (i2 == 0) {
                C7149.m22422(obj);
                c0555.f11453 = th;
                c0555.f11455 = 1;
                if (interfaceC5140.mo15350(interfaceC4892, th, c0555) == objM17142) {
                    return objM17142;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) c0555.f11453;
                C7149.m22422(obj);
            }
            return C8107.f3222;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                C4741.m1656(th2, th);
            }
            throw th2;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15366(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5140<? super InterfaceC4892<? super T>, ? super Throwable, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5140) {
        return new C0556(interfaceC4890, interfaceC5140);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15367(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5138<? super InterfaceC4892<? super T>, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138) {
        return new C4930(interfaceC4890, interfaceC5138);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15368(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5138<? super InterfaceC4892<? super T>, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138) {
        return new C4932(interfaceC5138, interfaceC4890);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T, R> InterfaceC4890<R> m15369(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 @InterfaceC3614 InterfaceC5140<? super InterfaceC4892<? super R>, ? super T, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5140) {
        return C4896.m15231(new C4933(interfaceC4890, interfaceC5140, null));
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T, R> InterfaceC4890<R> m15370(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 @InterfaceC3614 InterfaceC5140<? super InterfaceC4892<? super R>, ? super T, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5140) {
        return new C4935(interfaceC4890, interfaceC5140);
    }
}
