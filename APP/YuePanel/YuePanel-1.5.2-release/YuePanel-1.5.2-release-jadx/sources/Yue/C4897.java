package Yue;

import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۢۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4897 {

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۨ$ۥ */
    public static final class C0525 implements InterfaceC4890<Long> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C5883 f11299;

        /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۨ$ۥ$ۥ, reason: contains not printable characters */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10", m1273f = "Builders.kt", m1274i = {0}, m1275l = {115}, m1276m = "collect", m1277n = {"$this$asFlow_u24lambda_u2d19"}, m1278s = {"L$0"})
        public static final class C4898 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11300;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f11301;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public Object f11303;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public Object f11304;

            public C4898(InterfaceC4199 interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11300 = obj;
                this.f11301 |= Integer.MIN_VALUE;
                return C0525.this.mo48(null, this);
            }
        }

        public C0525(C5883 c5883) {
            this.f11299 = c5883;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super Long> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C4898 c4898;
            InterfaceC4892 interfaceC48922;
            Iterator<Long> it;
            if (interfaceC4199 instanceof C4898) {
                c4898 = (C4898) interfaceC4199;
                int i = c4898.f11301;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c4898.f11301 = i - Integer.MIN_VALUE;
                } else {
                    c4898 = new C4898(interfaceC4199);
                }
            }
            Object obj = c4898.f11300;
            Object objM17142 = C5508.m17142();
            int i2 = c4898.f11301;
            if (i2 == 0) {
                C7149.m22422(obj);
                interfaceC48922 = interfaceC4892;
                it = this.f11299.iterator();
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) c4898.f11304;
                InterfaceC4892 interfaceC48923 = (InterfaceC4892) c4898.f11303;
                C7149.m22422(obj);
                interfaceC48922 = interfaceC48923;
            }
            while (it.hasNext()) {
                Long lM9585 = C3590.m9585(((AbstractC5880) it).mo479());
                c4898.f11303 = interfaceC48922;
                c4898.f11304 = it;
                c4898.f11301 = 1;
                if (interfaceC48922.mo10059(lM9585, c4898) == objM17142) {
                    return objM17142;
                }
            }
            return C8107.f3222;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۨ$ۥ۟ */
    public static final class C0526<T> implements InterfaceC4890<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5122 f11305;

        public C0526(InterfaceC5122 interfaceC5122) {
            this.f11305 = interfaceC5122;
        }

        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            Object objMo10059 = interfaceC4892.mo10059((Object) this.f11305.invoke(), interfaceC4199);
            return objMo10059 == C5508.m17142() ? objMo10059 : C8107.f3222;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۨ$ۥ۟۟, reason: contains not printable characters */
    public static final class C4899<T> implements InterfaceC4890<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124 f11306;

        /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۨ$ۥ۟۟$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2", m1273f = "Builders.kt", m1274i = {}, m1275l = {113, 113}, m1276m = "collect", m1277n = {}, m1278s = {})
        public static final class C0527 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11307;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f11308;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public Object f11310;

            public C0527(InterfaceC4199 interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11307 = obj;
                this.f11308 |= Integer.MIN_VALUE;
                return C4899.this.mo48(null, this);
            }
        }

        public C4899(InterfaceC5124 interfaceC5124) {
            this.f11306 = interfaceC5124;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C0527 c0527;
            if (interfaceC4199 instanceof C0527) {
                c0527 = (C0527) interfaceC4199;
                int i = c0527.f11308;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0527.f11308 = i - Integer.MIN_VALUE;
                } else {
                    c0527 = new C0527(interfaceC4199);
                }
            }
            Object objInvoke = c0527.f11307;
            Object objM17142 = C5508.m17142();
            int i2 = c0527.f11308;
            if (i2 == 0) {
                C7149.m22422(objInvoke);
                InterfaceC5124 interfaceC5124 = this.f11306;
                c0527.f11310 = interfaceC4892;
                c0527.f11308 = 1;
                C5437.m16931(6);
                objInvoke = interfaceC5124.invoke(c0527);
                C5437.m16931(7);
                if (objInvoke == objM17142) {
                    return objM17142;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7149.m22422(objInvoke);
                    return C8107.f3222;
                }
                interfaceC4892 = (InterfaceC4892) c0527.f11310;
                C7149.m22422(objInvoke);
            }
            c0527.f11310 = null;
            c0527.f11308 = 2;
            if (interfaceC4892.mo10059(objInvoke, c0527) == objM17142) {
                return objM17142;
            }
            return C8107.f3222;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۨ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C4900<T> implements InterfaceC4890<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Iterable f11311;

        /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۨ$ۥ۟۟۟$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", m1273f = "Builders.kt", m1274i = {0}, m1275l = {115}, m1276m = "collect", m1277n = {"$this$asFlow_u24lambda_u2d3"}, m1278s = {"L$0"})
        public static final class C0528 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11312;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f11313;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public Object f11315;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public Object f11316;

            public C0528(InterfaceC4199 interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11312 = obj;
                this.f11313 |= Integer.MIN_VALUE;
                return C4900.this.mo48(null, this);
            }
        }

        public C4900(Iterable iterable) {
            this.f11311 = iterable;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C0528 c0528;
            InterfaceC4892 interfaceC48922;
            Iterator<T> it;
            if (interfaceC4199 instanceof C0528) {
                c0528 = (C0528) interfaceC4199;
                int i = c0528.f11313;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0528.f11313 = i - Integer.MIN_VALUE;
                } else {
                    c0528 = new C0528(interfaceC4199);
                }
            }
            Object obj = c0528.f11312;
            Object objM17142 = C5508.m17142();
            int i2 = c0528.f11313;
            if (i2 == 0) {
                C7149.m22422(obj);
                interfaceC48922 = interfaceC4892;
                it = this.f11311.iterator();
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) c0528.f11316;
                InterfaceC4892 interfaceC48923 = (InterfaceC4892) c0528.f11315;
                C7149.m22422(obj);
                interfaceC48922 = interfaceC48923;
            }
            while (it.hasNext()) {
                T next = it.next();
                c0528.f11315 = interfaceC48922;
                c0528.f11316 = it;
                c0528.f11313 = 1;
                if (interfaceC48922.mo10059(next, c0528) == objM17142) {
                    return objM17142;
                }
            }
            return C8107.f3222;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۨ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C4901<T> implements InterfaceC4890<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Iterator f11317;

        /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۨ$ۥ۟۟۟۟$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4", m1273f = "Builders.kt", m1274i = {0}, m1275l = {115}, m1276m = "collect", m1277n = {"$this$asFlow_u24lambda_u2d5"}, m1278s = {"L$0"})
        public static final class C0529 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11318;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f11319;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public Object f11321;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public Object f11322;

            public C0529(InterfaceC4199 interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11318 = obj;
                this.f11319 |= Integer.MIN_VALUE;
                return C4901.this.mo48(null, this);
            }
        }

        public C4901(Iterator it) {
            this.f11317 = it;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: Yue.ۥۣۣ۠ۢ */
        /* JADX DEBUG: Multi-variable search result rejected for r7v4, resolved type: Yue.ۥۣۣ۠ۢ */
        /* JADX DEBUG: Multi-variable search result rejected for r7v6, resolved type: Yue.ۥۣۣ۠ۢ */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C0529 c0529;
            InterfaceC4892 interfaceC48922;
            Iterator it;
            if (interfaceC4199 instanceof C0529) {
                c0529 = (C0529) interfaceC4199;
                int i = c0529.f11319;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0529.f11319 = i - Integer.MIN_VALUE;
                } else {
                    c0529 = new C0529(interfaceC4199);
                }
            }
            Object obj = c0529.f11318;
            Object objM17142 = C5508.m17142();
            int i2 = c0529.f11319;
            if (i2 == 0) {
                C7149.m22422(obj);
                interfaceC48922 = interfaceC4892;
                it = this.f11317;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) c0529.f11322;
                InterfaceC4892 interfaceC48923 = (InterfaceC4892) c0529.f11321;
                C7149.m22422(obj);
                interfaceC48922 = interfaceC48923;
            }
            while (it.hasNext()) {
                Object next = it.next();
                c0529.f11321 = interfaceC48922;
                c0529.f11322 = it;
                c0529.f11319 = 1;
                if (interfaceC48922.mo10059(next, c0529) == objM17142) {
                    return objM17142;
                }
            }
            return C8107.f3222;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۨ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C4902<T> implements InterfaceC4890<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7326 f11323;

        /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۨ$ۥ۟۟۟۠$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5", m1273f = "Builders.kt", m1274i = {0}, m1275l = {115}, m1276m = "collect", m1277n = {"$this$asFlow_u24lambda_u2d7"}, m1278s = {"L$0"})
        public static final class C0530 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11324;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f11325;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public Object f11327;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public Object f11328;

            public C0530(InterfaceC4199 interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11324 = obj;
                this.f11325 |= Integer.MIN_VALUE;
                return C4902.this.mo48(null, this);
            }
        }

        public C4902(InterfaceC7326 interfaceC7326) {
            this.f11323 = interfaceC7326;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C0530 c0530;
            InterfaceC4892 interfaceC48922;
            Iterator<T> it;
            if (interfaceC4199 instanceof C0530) {
                c0530 = (C0530) interfaceC4199;
                int i = c0530.f11325;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0530.f11325 = i - Integer.MIN_VALUE;
                } else {
                    c0530 = new C0530(interfaceC4199);
                }
            }
            Object obj = c0530.f11324;
            Object objM17142 = C5508.m17142();
            int i2 = c0530.f11325;
            if (i2 == 0) {
                C7149.m22422(obj);
                interfaceC48922 = interfaceC4892;
                it = this.f11323.iterator();
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) c0530.f11328;
                InterfaceC4892 interfaceC48923 = (InterfaceC4892) c0530.f11327;
                C7149.m22422(obj);
                interfaceC48922 = interfaceC48923;
            }
            while (it.hasNext()) {
                T next = it.next();
                c0530.f11327 = interfaceC48922;
                c0530.f11328 = it;
                c0530.f11325 = 1;
                if (interfaceC48922.mo10059(next, c0530) == objM17142) {
                    return objM17142;
                }
            }
            return C8107.f3222;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۨ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class C4903<T> implements InterfaceC4890<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Object[] f11329;

        /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۨ$ۥ۟۟۟ۡ$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6", m1273f = "Builders.kt", m1274i = {0, 0}, m1275l = {115}, m1276m = "collect", m1277n = {"$this$asFlow_u24lambda_u2d11", "$this$forEach$iv"}, m1278s = {"L$0", "L$1"})
        public static final class C0531 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11330;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f11331;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public Object f11333;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public Object f11334;

            /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
            public int f11335;

            /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
            public int f11336;

            public C0531(InterfaceC4199 interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11330 = obj;
                this.f11331 |= Integer.MIN_VALUE;
                return C4903.this.mo48(null, this);
            }
        }

        public C4903(Object[] objArr) {
            this.f11329 = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [Yue.ۥۣۣ۠ۢ, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v5 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v8 */
        /* JADX WARN: Type inference failed for: r9v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005c -> B:19:0x005f). Please report as a decompilation issue!!! */
        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C0531 c0531;
            ?? r9;
            int i;
            int i2;
            Object[] objArr;
            if (interfaceC4199 instanceof C0531) {
                c0531 = (C0531) interfaceC4199;
                int i3 = c0531.f11331;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c0531.f11331 = i3 - Integer.MIN_VALUE;
                } else {
                    c0531 = new C0531(interfaceC4199);
                }
            }
            Object obj = c0531.f11330;
            Object objM17142 = C5508.m17142();
            int i4 = c0531.f11331;
            if (i4 == 0) {
                C7149.m22422(obj);
                Object[] objArr2 = this.f11329;
                int length = objArr2.length;
                r9 = interfaceC4892;
                i = length;
                i2 = 0;
                objArr = objArr2;
                if (i2 < i) {
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = c0531.f11336;
                i2 = c0531.f11335;
                objArr = (Object[]) c0531.f11334;
                InterfaceC4892 interfaceC48922 = (InterfaceC4892) c0531.f11333;
                C7149.m22422(obj);
                ?? r92 = interfaceC48922;
                i2++;
                r9 = r92;
                if (i2 < i) {
                    Object obj2 = objArr[i2];
                    c0531.f11333 = r9;
                    c0531.f11334 = objArr;
                    c0531.f11335 = i2;
                    c0531.f11336 = i;
                    c0531.f11331 = 1;
                    Object objMo10059 = r9.mo10059(obj2, c0531);
                    r92 = r9;
                    if (objMo10059 == objM17142) {
                        return objM17142;
                    }
                    i2++;
                    r9 = r92;
                    if (i2 < i) {
                        return C8107.f3222;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۨ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final class C4904 implements InterfaceC4890<Integer> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ int[] f11337;

        /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۨ$ۥ۟۟۟ۢ$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7", m1273f = "Builders.kt", m1274i = {0, 0}, m1275l = {115}, m1276m = "collect", m1277n = {"$this$asFlow_u24lambda_u2d13", "$this$forEach$iv"}, m1278s = {"L$0", "L$1"})
        public static final class C0532 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11338;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f11339;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public Object f11341;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public Object f11342;

            /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
            public int f11343;

            /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
            public int f11344;

            public C0532(InterfaceC4199 interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11338 = obj;
                this.f11339 |= Integer.MIN_VALUE;
                return C4904.this.mo48(null, this);
            }
        }

        public C4904(int[] iArr) {
            this.f11337 = iArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:19:0x0063). Please report as a decompilation issue!!! */
        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super Integer> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C0532 c0532;
            InterfaceC4892 interfaceC48922;
            int i;
            int i2;
            int[] iArr;
            if (interfaceC4199 instanceof C0532) {
                c0532 = (C0532) interfaceC4199;
                int i3 = c0532.f11339;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c0532.f11339 = i3 - Integer.MIN_VALUE;
                } else {
                    c0532 = new C0532(interfaceC4199);
                }
            }
            Object obj = c0532.f11338;
            Object objM17142 = C5508.m17142();
            int i4 = c0532.f11339;
            if (i4 == 0) {
                C7149.m22422(obj);
                int[] iArr2 = this.f11337;
                int length = iArr2.length;
                interfaceC48922 = interfaceC4892;
                i = length;
                i2 = 0;
                iArr = iArr2;
                if (i2 < i) {
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = c0532.f11344;
                i2 = c0532.f11343;
                iArr = (int[]) c0532.f11342;
                InterfaceC4892 interfaceC48923 = (InterfaceC4892) c0532.f11341;
                C7149.m22422(obj);
                interfaceC48922 = interfaceC48923;
                i2++;
                if (i2 < i) {
                    Integer numM9584 = C3590.m9584(iArr[i2]);
                    c0532.f11341 = interfaceC48922;
                    c0532.f11342 = iArr;
                    c0532.f11343 = i2;
                    c0532.f11344 = i;
                    c0532.f11339 = 1;
                    if (interfaceC48922.mo10059(numM9584, c0532) == objM17142) {
                        return objM17142;
                    }
                    i2++;
                    if (i2 < i) {
                        return C8107.f3222;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۨ$ۥۣ۟۟۟, reason: contains not printable characters */
    public static final class C4905 implements InterfaceC4890<Long> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ long[] f11345;

        /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۨ$ۥۣ۟۟۟$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8", m1273f = "Builders.kt", m1274i = {0, 0}, m1275l = {115}, m1276m = "collect", m1277n = {"$this$asFlow_u24lambda_u2d15", "$this$forEach$iv"}, m1278s = {"L$0", "L$1"})
        public static final class C0533 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11346;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f11347;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public Object f11349;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public Object f11350;

            /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
            public int f11351;

            /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
            public int f11352;

            public C0533(InterfaceC4199 interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11346 = obj;
                this.f11347 |= Integer.MIN_VALUE;
                return C4905.this.mo48(null, this);
            }
        }

        public C4905(long[] jArr) {
            this.f11345 = jArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:19:0x0063). Please report as a decompilation issue!!! */
        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super Long> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C0533 c0533;
            InterfaceC4892 interfaceC48922;
            int i;
            int i2;
            long[] jArr;
            if (interfaceC4199 instanceof C0533) {
                c0533 = (C0533) interfaceC4199;
                int i3 = c0533.f11347;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c0533.f11347 = i3 - Integer.MIN_VALUE;
                } else {
                    c0533 = new C0533(interfaceC4199);
                }
            }
            Object obj = c0533.f11346;
            Object objM17142 = C5508.m17142();
            int i4 = c0533.f11347;
            if (i4 == 0) {
                C7149.m22422(obj);
                long[] jArr2 = this.f11345;
                int length = jArr2.length;
                interfaceC48922 = interfaceC4892;
                i = length;
                i2 = 0;
                jArr = jArr2;
                if (i2 < i) {
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = c0533.f11352;
                i2 = c0533.f11351;
                jArr = (long[]) c0533.f11350;
                InterfaceC4892 interfaceC48923 = (InterfaceC4892) c0533.f11349;
                C7149.m22422(obj);
                interfaceC48922 = interfaceC48923;
                i2++;
                if (i2 < i) {
                    Long lM9585 = C3590.m9585(jArr[i2]);
                    c0533.f11349 = interfaceC48922;
                    c0533.f11350 = jArr;
                    c0533.f11351 = i2;
                    c0533.f11352 = i;
                    c0533.f11347 = 1;
                    if (interfaceC48922.mo10059(lM9585, c0533) == objM17142) {
                        return objM17142;
                    }
                    i2++;
                    if (i2 < i) {
                        return C8107.f3222;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۨ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final class C4906 implements InterfaceC4890<Integer> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C5458 f11353;

        /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۨ$ۥ۟۟۟ۤ$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9", m1273f = "Builders.kt", m1274i = {0}, m1275l = {115}, m1276m = "collect", m1277n = {"$this$asFlow_u24lambda_u2d17"}, m1278s = {"L$0"})
        public static final class C0534 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11354;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f11355;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public Object f11357;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public Object f11358;

            public C0534(InterfaceC4199 interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11354 = obj;
                this.f11355 |= Integer.MIN_VALUE;
                return C4906.this.mo48(null, this);
            }
        }

        public C4906(C5458 c5458) {
            this.f11353 = c5458;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super Integer> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C0534 c0534;
            InterfaceC4892 interfaceC48922;
            Iterator<Integer> it;
            if (interfaceC4199 instanceof C0534) {
                c0534 = (C0534) interfaceC4199;
                int i = c0534.f11355;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0534.f11355 = i - Integer.MIN_VALUE;
                } else {
                    c0534 = new C0534(interfaceC4199);
                }
            }
            Object obj = c0534.f11354;
            Object objM17142 = C5508.m17142();
            int i2 = c0534.f11355;
            if (i2 == 0) {
                C7149.m22422(obj);
                interfaceC48922 = interfaceC4892;
                it = this.f11353.iterator();
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) c0534.f11358;
                InterfaceC4892 interfaceC48923 = (InterfaceC4892) c0534.f11357;
                C7149.m22422(obj);
                interfaceC48922 = interfaceC48923;
            }
            while (it.hasNext()) {
                Integer numM9584 = C3590.m9584(((AbstractC5455) it).mo471());
                c0534.f11357 = interfaceC48922;
                c0534.f11358 = it;
                c0534.f11355 = 1;
                if (interfaceC48922.mo10059(numM9584, c0534) == objM17142) {
                    return objM17142;
                }
            }
            return C8107.f3222;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۨ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final class C4907<T> implements InterfaceC4890<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Object[] f11359;

        /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۨ$ۥ۟۟۟ۥ$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", m1273f = "Builders.kt", m1274i = {0, 0}, m1275l = {114}, m1276m = "collect", m1277n = {"this", "$this$flowOf_u24lambda_u2d8"}, m1278s = {"L$0", "L$1"})
        public static final class C0535 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f11360;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f11361;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public Object f11363;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public Object f11364;

            /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
            public int f11365;

            /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
            public int f11366;

            public C0535(InterfaceC4199 interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11360 = obj;
                this.f11361 |= Integer.MIN_VALUE;
                return C4907.this.mo48(null, this);
            }
        }

        public C4907(Object[] objArr) {
            this.f11359 = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Type inference failed for: r9v5, types: [Yue.ۥۣۣ۠ۢ, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v8 */
        /* JADX WARN: Type inference failed for: r9v9 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005d -> B:19:0x0060). Please report as a decompilation issue!!! */
        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C0535 c0535;
            int i;
            C4907<T> c4907;
            ?? r9;
            int length;
            if (interfaceC4199 instanceof C0535) {
                c0535 = (C0535) interfaceC4199;
                int i2 = c0535.f11361;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0535.f11361 = i2 - Integer.MIN_VALUE;
                } else {
                    c0535 = new C0535(interfaceC4199);
                }
            }
            Object obj = c0535.f11360;
            Object objM17142 = C5508.m17142();
            int i3 = c0535.f11361;
            if (i3 == 0) {
                C7149.m22422(obj);
                i = 0;
                c4907 = this;
                r9 = interfaceC4892;
                length = this.f11359.length;
                if (i < length) {
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                length = c0535.f11366;
                i = c0535.f11365;
                InterfaceC4892 interfaceC48922 = (InterfaceC4892) c0535.f11364;
                c4907 = (C4907) c0535.f11363;
                C7149.m22422(obj);
                ?? r92 = interfaceC48922;
                i++;
                r9 = r92;
                if (i < length) {
                    Object obj2 = c4907.f11359[i];
                    c0535.f11363 = c4907;
                    c0535.f11364 = r9;
                    c0535.f11365 = i;
                    c0535.f11366 = length;
                    c0535.f11361 = 1;
                    Object objMo10059 = r9.mo10059(obj2, c0535);
                    r92 = r9;
                    if (objMo10059 == objM17142) {
                        return objM17142;
                    }
                    i++;
                    r9 = r92;
                    if (i < length) {
                        return C8107.f3222;
                    }
                }
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۣ۠ۢۨ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final class C4908<T> implements InterfaceC4890<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Object f11367;

        public C4908(Object obj) {
            this.f11367 = obj;
        }

        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            Object objMo10059 = interfaceC4892.mo10059((Object) this.f11367, interfaceC4199);
            return objMo10059 == C5508.m17142() ? objMo10059 : C8107.f3222;
        }
    }

    @InterfaceC6399
    @InterfaceC5039
    /* JADX INFO: renamed from: ۥ */
    public static final <T> InterfaceC4890<T> m1807(@InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122) {
        return new C0526(interfaceC5122);
    }

    @InterfaceC6399
    @InterfaceC5039
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T> InterfaceC4890<T> m1808(@InterfaceC6399 InterfaceC5124<? super InterfaceC4199<? super T>, ? extends Object> interfaceC5124) {
        return new C4899(interfaceC5124);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final InterfaceC4890<Integer> m15307(@InterfaceC6399 C5458 c5458) {
        return new C4906(c5458);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final InterfaceC4890<Long> m15308(@InterfaceC6399 C5883 c5883) {
        return new C0525(c5883);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15309(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        return new C4902(interfaceC7326);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15310(@InterfaceC6399 Iterable<? extends T> iterable) {
        return new C4900(iterable);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15311(@InterfaceC6399 Iterator<? extends T> it) {
        return new C4901(it);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final InterfaceC4890<Integer> m15312(@InterfaceC6399 int[] iArr) {
        return new C4904(iArr);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final InterfaceC4890<Long> m15313(@InterfaceC6399 long[] jArr) {
        return new C4905(jArr);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15314(@InterfaceC6399 T[] tArr) {
        return new C4903(tArr);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15315(@InterfaceC6399 @InterfaceC3614 InterfaceC5138<? super InterfaceC6809<? super T>, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138) {
        return new C3650(interfaceC5138, null, 0, null, 14, null);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15316(@InterfaceC6399 @InterfaceC3614 InterfaceC5138<? super InterfaceC6809<? super T>, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138) {
        return new C3717(interfaceC5138, null, 0, null, 14, null);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15317() {
        return C4630.f9942;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15318(@InterfaceC6399 @InterfaceC3614 InterfaceC5138<? super InterfaceC4892<? super T>, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138) {
        return new C7208(interfaceC5138);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15319(T t) {
        return new C4908(t);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15320(@InterfaceC6399 T... tArr) {
        return new C4907(tArr);
    }
}
