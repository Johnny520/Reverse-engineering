package Yue;

import Yue.C7060;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4968 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥ */
    public static final class C0582<T> implements InterfaceC4892<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7066 f11642;

        public C0582(C7060.C7066 c7066) {
            this.f11642 = c7066;
        }

        @Override // Yue.InterfaceC4892
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            this.f11642.f21353 = t;
            throw new C2965(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥ۟ */
    public static final class C0583<T> implements InterfaceC4892<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138 f11643;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7066 f11644;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥ۟$ۥ, reason: contains not printable characters */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", m1273f = "Reduce.kt", m1274i = {0, 0}, m1275l = {142}, m1276m = "emit", m1277n = {"this", "it"}, m1278s = {"L$0", "L$1"})
        public static final class C4969 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public Object f11645;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public /* synthetic */ Object f11646;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public int f11647;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public Object f11649;

            public C4969(InterfaceC4199 interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11646 = obj;
                this.f11647 |= Integer.MIN_VALUE;
                return C0583.this.mo10059(null, this);
            }
        }

        public C0583(InterfaceC5138 interfaceC5138, C7060.C7066 c7066) {
            this.f11643 = interfaceC5138;
            this.f11644 = c7066;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Yue.InterfaceC4892
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C4969 c4969;
            C0583<T> c0583;
            if (interfaceC4199 instanceof C4969) {
                c4969 = (C4969) interfaceC4199;
                int i = c4969.f11647;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c4969.f11647 = i - Integer.MIN_VALUE;
                } else {
                    c4969 = new C4969(interfaceC4199);
                }
            }
            Object objInvoke = c4969.f11646;
            Object objM17142 = C5508.m17142();
            int i2 = c4969.f11647;
            if (i2 == 0) {
                C7149.m22422(objInvoke);
                InterfaceC5138 interfaceC5138 = this.f11643;
                c4969.f11645 = this;
                c4969.f11649 = t;
                c4969.f11647 = 1;
                C5437.m16931(6);
                objInvoke = interfaceC5138.invoke(t, c4969);
                C5437.m16931(7);
                if (objInvoke == objM17142) {
                    return objM17142;
                }
                c0583 = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t = (T) c4969.f11649;
                c0583 = (C0583) c4969.f11645;
                C7149.m22422(objInvoke);
            }
            if (!((Boolean) objInvoke).booleanValue()) {
                return C8107.f3222;
            }
            c0583.f11644.f21353 = t;
            throw new C2965(c0583);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m1273f = "Reduce.kt", m1274i = {0, 0}, m1275l = {183}, m1276m = "first", m1277n = {"result", "collector$iv"}, m1278s = {"L$0", "L$1"})
    public static final class C4970<T> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f11650;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f11651;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ Object f11652;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f11653;

        public C4970(InterfaceC4199<? super C4970> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f11652 = obj;
            this.f11653 |= Integer.MIN_VALUE;
            return C4896.m15216(null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m1273f = "Reduce.kt", m1274i = {0, 0, 0}, m1275l = {183}, m1276m = "first", m1277n = {"predicate", "result", "collector$iv"}, m1278s = {"L$0", "L$1", "L$2"})
    public static final class C4971<T> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f11654;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f11655;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f11656;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f11657;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f11658;

        public C4971(InterfaceC4199<? super C4971> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f11657 = obj;
            this.f11658 |= Integer.MIN_VALUE;
            return C4896.m15217(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C4972<T> implements InterfaceC4892<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7066 f11659;

        public C4972(C7060.C7066 c7066) {
            this.f11659 = c7066;
        }

        @Override // Yue.InterfaceC4892
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            this.f11659.f21353 = t;
            throw new C2965(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C4973<T> implements InterfaceC4892<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138 f11660;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7066 f11661;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥ۟۟۟۠$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", m1273f = "Reduce.kt", m1274i = {0, 0}, m1275l = {142}, m1276m = "emit", m1277n = {"this", "it"}, m1278s = {"L$0", "L$1"})
        public static final class C0584 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public Object f11662;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public /* synthetic */ Object f11663;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public int f11664;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public Object f11666;

            public C0584(InterfaceC4199 interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11663 = obj;
                this.f11664 |= Integer.MIN_VALUE;
                return C4973.this.mo10059(null, this);
            }
        }

        public C4973(InterfaceC5138 interfaceC5138, C7060.C7066 c7066) {
            this.f11660 = interfaceC5138;
            this.f11661 = c7066;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Yue.InterfaceC4892
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C0584 c0584;
            C4973<T> c4973;
            if (interfaceC4199 instanceof C0584) {
                c0584 = (C0584) interfaceC4199;
                int i = c0584.f11664;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0584.f11664 = i - Integer.MIN_VALUE;
                } else {
                    c0584 = new C0584(interfaceC4199);
                }
            }
            Object objInvoke = c0584.f11663;
            Object objM17142 = C5508.m17142();
            int i2 = c0584.f11664;
            if (i2 == 0) {
                C7149.m22422(objInvoke);
                InterfaceC5138 interfaceC5138 = this.f11660;
                c0584.f11662 = this;
                c0584.f11666 = t;
                c0584.f11664 = 1;
                C5437.m16931(6);
                objInvoke = interfaceC5138.invoke(t, c0584);
                C5437.m16931(7);
                if (objInvoke == objM17142) {
                    return objM17142;
                }
                c4973 = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t = (T) c0584.f11666;
                c4973 = (C4973) c0584.f11662;
                C7149.m22422(objInvoke);
            }
            if (!((Boolean) objInvoke).booleanValue()) {
                return C8107.f3222;
            }
            c4973.f11661.f21353 = t;
            throw new C2965(c4973);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m1273f = "Reduce.kt", m1274i = {0, 0}, m1275l = {183}, m1276m = "firstOrNull", m1277n = {"result", "collector$iv"}, m1278s = {"L$0", "L$1"})
    public static final class C4974<T> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f11667;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f11668;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ Object f11669;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f11670;

        public C4974(InterfaceC4199<? super C4974> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f11669 = obj;
            this.f11670 |= Integer.MIN_VALUE;
            return C4896.m15218(null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m1273f = "Reduce.kt", m1274i = {0, 0}, m1275l = {183}, m1276m = "firstOrNull", m1277n = {"result", "collector$iv"}, m1278s = {"L$0", "L$1"})
    public static final class C4975<T> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f11671;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f11672;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ Object f11673;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f11674;

        public C4975(InterfaceC4199<? super C4975> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f11673 = obj;
            this.f11674 |= Integer.MIN_VALUE;
            return C4896.m15219(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m1273f = "Reduce.kt", m1274i = {0}, m1275l = {44}, m1276m = "fold", m1277n = {"accumulator"}, m1278s = {"L$0"})
    public static final class C4976<T, R> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f11675;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f11676;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f11677;

        public C4976(InterfaceC4199<? super C4976> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f11676 = obj;
            this.f11677 |= Integer.MIN_VALUE;
            return C4968.m15447(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final class C4977<T> implements InterfaceC4892 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7066<R> f11678;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5140<R, T, InterfaceC4199<? super R>, Object> f11679;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥ۟۟۟ۤ$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2", m1273f = "Reduce.kt", m1274i = {}, m1275l = {45}, m1276m = "emit", m1277n = {}, m1278s = {})
        public static final class C0585 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public Object f11680;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public /* synthetic */ Object f11681;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ C4977<T> f11682;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public int f11683;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۠ۢۥ۟$ۥ۟۟۟ۤ<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0585(C4977<? super T> c4977, InterfaceC4199<? super C0585> interfaceC4199) {
                super(interfaceC4199);
                this.f11682 = c4977;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11681 = obj;
                this.f11683 |= Integer.MIN_VALUE;
                return this.f11682.mo10059(null, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۤ<? super R, ? super T, ? super Yue.ۥ۟ۧۤۢ<? super R>, ? extends java.lang.Object> */
        /* JADX WARN: Multi-variable type inference failed */
        public C4977(C7060.C7066<R> c7066, InterfaceC5140<? super R, ? super T, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5140) {
            this.f11678 = c7066;
            this.f11679 = interfaceC5140;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public final Object m1841(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C5437.m16931(4);
            new C0585(this, interfaceC4199);
            C5437.m16931(5);
            C7060.C7066<R> c7066 = this.f11678;
            c7066.f21353 = (T) this.f11679.mo15350((R) c7066.f21353, t, (InterfaceC4199<? super R>) interfaceC4199);
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
            C0585 c0585;
            C7060.C7066 c7066;
            if (interfaceC4199 instanceof C0585) {
                c0585 = (C0585) interfaceC4199;
                int i = c0585.f11683;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0585.f11683 = i - Integer.MIN_VALUE;
                } else {
                    c0585 = new C0585(this, interfaceC4199);
                }
            }
            Object obj = c0585.f11681;
            Object objM17142 = C5508.m17142();
            int i2 = c0585.f11683;
            if (i2 == 0) {
                C7149.m22422(obj);
                C7060.C7066 c70662 = this.f11678;
                InterfaceC5140<R, T, InterfaceC4199<? super R>, Object> interfaceC5140 = this.f11679;
                T t2 = c70662.f21353;
                c0585.f11680 = c70662;
                c0585.f11683 = 1;
                Object objMo15350 = interfaceC5140.mo15350((R) t2, t, c0585);
                if (objMo15350 == objM17142) {
                    return objM17142;
                }
                obj = (T) objMo15350;
                c7066 = c70662;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c7066 = (C7060.C7066) c0585.f11680;
                C7149.m22422(obj);
            }
            c7066.f21353 = (T) obj;
            return C8107.f3222;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m1273f = "Reduce.kt", m1274i = {0}, m1275l = {155}, m1276m = "last", m1277n = {"result"}, m1278s = {"L$0"})
    public static final class C4978<T> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f11684;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f11685;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f11686;

        public C4978(InterfaceC4199<? super C4978> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f11685 = obj;
            this.f11686 |= Integer.MIN_VALUE;
            return C4896.m15241(null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final class C4979<T> implements InterfaceC4892 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7066<Object> f11687;

        public C4979(C7060.C7066<Object> c7066) {
            this.f11687 = c7066;
        }

        @Override // Yue.InterfaceC4892
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public final Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            this.f11687.f21353 = t;
            return C8107.f3222;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥ۟۟۟ۧ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m1273f = "Reduce.kt", m1274i = {0}, m1275l = {167}, m1276m = "lastOrNull", m1277n = {"result"}, m1278s = {"L$0"})
    public static final class C4980<T> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f11688;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f11689;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f11690;

        public C4980(InterfaceC4199<? super C4980> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f11689 = obj;
            this.f11690 |= Integer.MIN_VALUE;
            return C4896.m15242(null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final class C4981<T> implements InterfaceC4892 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7066<T> f11691;

        public C4981(C7060.C7066<T> c7066) {
            this.f11691 = c7066;
        }

        @Override // Yue.InterfaceC4892
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public final Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            this.f11691.f21353 = t;
            return C8107.f3222;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥ۟۟۠, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m1273f = "Reduce.kt", m1274i = {0}, m1275l = {22}, m1276m = "reduce", m1277n = {"accumulator"}, m1278s = {"L$0"})
    public static final class C4982<S, T extends S> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f11692;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f11693;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f11694;

        public C4982(InterfaceC4199<? super C4982> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f11693 = obj;
            this.f11694 |= Integer.MIN_VALUE;
            return C4896.m15267(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥ۟۟۠۟, reason: contains not printable characters */
    public static final class C4983<T> implements InterfaceC4892 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7066<Object> f11695;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5140<S, T, InterfaceC4199<? super S>, Object> f11696;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥ۟۟۠۟$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2", m1273f = "Reduce.kt", m1274i = {}, m1275l = {25}, m1276m = "emit", m1277n = {}, m1278s = {})
        public static final class C0586 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public Object f11697;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public /* synthetic */ Object f11698;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ C4983<T> f11699;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public int f11700;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۠ۢۥ۟$ۥ۟۟۠۟<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0586(C4983<? super T> c4983, InterfaceC4199<? super C0586> interfaceC4199) {
                super(interfaceC4199);
                this.f11699 = c4983;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11698 = obj;
                this.f11700 |= Integer.MIN_VALUE;
                return this.f11699.mo10059(null, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۤ<? super S, ? super T, ? super Yue.ۥ۟ۧۤۢ<? super S>, ? extends java.lang.Object> */
        /* JADX WARN: Multi-variable type inference failed */
        public C4983(C7060.C7066<Object> c7066, InterfaceC5140<? super S, ? super T, ? super InterfaceC4199<? super S>, ? extends Object> interfaceC5140) {
            this.f11695 = c7066;
            this.f11696 = interfaceC5140;
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
            C0586 c0586;
            C7060.C7066<Object> c7066;
            C7060.C7066<Object> c70662;
            if (interfaceC4199 instanceof C0586) {
                c0586 = (C0586) interfaceC4199;
                int i = c0586.f11700;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0586.f11700 = i - Integer.MIN_VALUE;
                } else {
                    c0586 = new C0586(this, interfaceC4199);
                }
            }
            Object obj = c0586.f11698;
            Object objM17142 = C5508.m17142();
            int i2 = c0586.f11700;
            if (i2 == 0) {
                C7149.m22422(obj);
                c7066 = this.f11695;
                Object obj2 = c7066.f21353;
                if (obj2 != C6488.f2113) {
                    InterfaceC5140<S, T, InterfaceC4199<? super S>, Object> interfaceC5140 = this.f11696;
                    c0586.f11697 = c7066;
                    c0586.f11700 = 1;
                    Object objMo15350 = interfaceC5140.mo15350((S) obj2, t, c0586);
                    if (objMo15350 == objM17142) {
                        return objM17142;
                    }
                    obj = objMo15350;
                    c70662 = c7066;
                }
                c7066.f21353 = t;
                return C8107.f3222;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c70662 = (C7060.C7066) c0586.f11697;
            C7149.m22422(obj);
            Object obj3 = obj;
            c7066 = c70662;
            t = (T) obj3;
            c7066.f21353 = t;
            return C8107.f3222;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥ۟۟۠۠, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m1273f = "Reduce.kt", m1274i = {0}, m1275l = {57}, m1276m = "single", m1277n = {"result"}, m1278s = {"L$0"})
    public static final class C4984<T> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f11701;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f11702;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f11703;

        public C4984(InterfaceC4199<? super C4984> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f11702 = obj;
            this.f11703 |= Integer.MIN_VALUE;
            return C4896.m15282(null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final class C4985<T> implements InterfaceC4892 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7066<Object> f11704;

        public C4985(C7060.C7066<Object> c7066) {
            this.f11704 = c7066;
        }

        @Override // Yue.InterfaceC4892
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public final Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C7060.C7066<Object> c7066 = this.f11704;
            if (c7066.f21353 != C6488.f2113) {
                throw new IllegalArgumentException("Flow has more than one element".toString());
            }
            c7066.f21353 = t;
            return C8107.f3222;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final class C4986<T> implements InterfaceC4892<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7066 f11705;

        public C4986(C7060.C7066 c7066) {
            this.f11705 = c7066;
        }

        @Override // Yue.InterfaceC4892
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C7060.C7066 c7066 = this.f11705;
            T t2 = c7066.f21353;
            T t3 = (T) C6488.f2113;
            if (t2 == t3) {
                c7066.f21353 = t;
                return C8107.f3222;
            }
            c7066.f21353 = t3;
            throw new C2965(this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۥ۟$ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m1273f = "Reduce.kt", m1274i = {0, 0}, m1275l = {183}, m1276m = "singleOrNull", m1277n = {"result", "collector$iv"}, m1278s = {"L$0", "L$1"})
    public static final class C4987<T> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f11706;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f11707;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ Object f11708;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f11709;

        public C4987(InterfaceC4199<? super C4987> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f11708 = obj;
            this.f11709 |= Integer.MIN_VALUE;
            return C4896.m15283(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m1839(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        C4970 c4970;
        C7060.C7066 c7066;
        C2965 e;
        InterfaceC4892<? super Object> interfaceC4892;
        if (interfaceC4199 instanceof C4970) {
            c4970 = (C4970) interfaceC4199;
            int i = c4970.f11653;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4970.f11653 = i - Integer.MIN_VALUE;
            } else {
                c4970 = new C4970(interfaceC4199);
            }
        }
        Object obj = c4970.f11652;
        Object objM17142 = C5508.m17142();
        int i2 = c4970.f11653;
        if (i2 == 0) {
            C7149.m22422(obj);
            C7060.C7066 c70662 = new C7060.C7066();
            c70662.f21353 = (T) C6488.f2113;
            InterfaceC4892<? super Object> c0582 = new C0582<>(c70662);
            try {
                c4970.f11650 = c70662;
                c4970.f11651 = c0582;
                c4970.f11653 = 1;
                if (interfaceC4890.mo48(c0582, c4970) == objM17142) {
                    return objM17142;
                }
                c7066 = c70662;
            } catch (C2965 e2) {
                c7066 = c70662;
                e = e2;
                interfaceC4892 = c0582;
                C4895.m1804(e, interfaceC4892);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC4892 = (C0582) c4970.f11651;
            c7066 = (C7060.C7066) c4970.f11650;
            try {
                C7149.m22422(obj);
            } catch (C2965 e3) {
                e = e3;
                C4895.m1804(e, interfaceC4892);
            }
        }
        T t = c7066.f21353;
        if (t != C6488.f2113) {
            return t;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m1840(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5138<? super T, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        C4971 c4971;
        InterfaceC5138<? super T, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC51382;
        C7060.C7066 c7066;
        C2965 e;
        InterfaceC4892<? super Object> interfaceC4892;
        if (interfaceC4199 instanceof C4971) {
            c4971 = (C4971) interfaceC4199;
            int i = c4971.f11658;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4971.f11658 = i - Integer.MIN_VALUE;
            } else {
                c4971 = new C4971(interfaceC4199);
            }
        }
        Object obj = c4971.f11657;
        Object objM17142 = C5508.m17142();
        int i2 = c4971.f11658;
        if (i2 == 0) {
            C7149.m22422(obj);
            C7060.C7066 c70662 = new C7060.C7066();
            c70662.f21353 = (T) C6488.f2113;
            InterfaceC4892<? super Object> c0583 = new C0583<>(interfaceC5138, c70662);
            try {
                c4971.f11654 = interfaceC5138;
                c4971.f11655 = c70662;
                c4971.f11656 = c0583;
                c4971.f11658 = 1;
                if (interfaceC4890.mo48(c0583, c4971) == objM17142) {
                    return objM17142;
                }
                interfaceC51382 = interfaceC5138;
                c7066 = c70662;
            } catch (C2965 e2) {
                interfaceC51382 = interfaceC5138;
                c7066 = c70662;
                e = e2;
                interfaceC4892 = c0583;
                C4895.m1804(e, interfaceC4892);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC4892 = (C0583) c4971.f11656;
            c7066 = (C7060.C7066) c4971.f11655;
            interfaceC51382 = (InterfaceC5138) c4971.f11654;
            try {
                C7149.m22422(obj);
            } catch (C2965 e3) {
                e = e3;
                C4895.m1804(e, interfaceC4892);
            }
        }
        T t = c7066.f21353;
        if (t != C6488.f2113) {
            return t;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate " + interfaceC51382);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m15445(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        C4974 c4974;
        C7060.C7066 c7066;
        C2965 e;
        InterfaceC4892<? super Object> interfaceC4892;
        if (interfaceC4199 instanceof C4974) {
            c4974 = (C4974) interfaceC4199;
            int i = c4974.f11670;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4974.f11670 = i - Integer.MIN_VALUE;
            } else {
                c4974 = new C4974(interfaceC4199);
            }
        }
        Object obj = c4974.f11669;
        Object objM17142 = C5508.m17142();
        int i2 = c4974.f11670;
        if (i2 == 0) {
            C7149.m22422(obj);
            C7060.C7066 c70662 = new C7060.C7066();
            InterfaceC4892<? super Object> c4972 = new C4972<>(c70662);
            try {
                c4974.f11667 = c70662;
                c4974.f11668 = c4972;
                c4974.f11670 = 1;
                if (interfaceC4890.mo48(c4972, c4974) == objM17142) {
                    return objM17142;
                }
                c7066 = c70662;
            } catch (C2965 e2) {
                c7066 = c70662;
                e = e2;
                interfaceC4892 = c4972;
                C4895.m1804(e, interfaceC4892);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC4892 = (C4972) c4974.f11668;
            c7066 = (C7060.C7066) c4974.f11667;
            try {
                C7149.m22422(obj);
            } catch (C2965 e3) {
                e = e3;
                C4895.m1804(e, interfaceC4892);
            }
        }
        return c7066.f21353;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m15446(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5138<? super T, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        C4975 c4975;
        C7060.C7066 c7066;
        C2965 e;
        InterfaceC4892<? super Object> interfaceC4892;
        if (interfaceC4199 instanceof C4975) {
            c4975 = (C4975) interfaceC4199;
            int i = c4975.f11674;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4975.f11674 = i - Integer.MIN_VALUE;
            } else {
                c4975 = new C4975(interfaceC4199);
            }
        }
        Object obj = c4975.f11673;
        Object objM17142 = C5508.m17142();
        int i2 = c4975.f11674;
        if (i2 == 0) {
            C7149.m22422(obj);
            C7060.C7066 c70662 = new C7060.C7066();
            InterfaceC4892<? super Object> c4973 = new C4973<>(interfaceC5138, c70662);
            try {
                c4975.f11671 = c70662;
                c4975.f11672 = c4973;
                c4975.f11674 = 1;
                if (interfaceC4890.mo48(c4973, c4975) == objM17142) {
                    return objM17142;
                }
                c7066 = c70662;
            } catch (C2965 e2) {
                c7066 = c70662;
                e = e2;
                interfaceC4892 = c4973;
                C4895.m1804(e, interfaceC4892);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC4892 = (C4973) c4975.f11672;
            c7066 = (C7060.C7066) c4975.f11671;
            try {
                C7149.m22422(obj);
            } catch (C2965 e3) {
                e = e3;
                C4895.m1804(e, interfaceC4892);
            }
        }
        return c7066.f21353;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: R */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T, R> Object m15447(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, R r, @InterfaceC6399 InterfaceC5140<? super R, ? super T, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5140, @InterfaceC6399 InterfaceC4199<? super R> interfaceC4199) {
        C4976 c4976;
        C7060.C7066 c7066;
        if (interfaceC4199 instanceof C4976) {
            c4976 = (C4976) interfaceC4199;
            int i = c4976.f11677;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4976.f11677 = i - Integer.MIN_VALUE;
            } else {
                c4976 = new C4976(interfaceC4199);
            }
        }
        Object obj = c4976.f11676;
        Object objM17142 = C5508.m17142();
        int i2 = c4976.f11677;
        if (i2 == 0) {
            C7149.m22422(obj);
            C7060.C7066 c70662 = new C7060.C7066();
            c70662.f21353 = r;
            InterfaceC4892<? super Object> c4977 = new C4977<>(c70662, interfaceC5140);
            c4976.f11675 = c70662;
            c4976.f11677 = 1;
            if (interfaceC4890.mo48(c4977, c4976) == objM17142) {
                return objM17142;
            }
            c7066 = c70662;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7066 = (C7060.C7066) c4976.f11675;
            C7149.m22422(obj);
        }
        return c7066.f21353;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: R */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T, R> Object m15448(InterfaceC4890<? extends T> interfaceC4890, R r, InterfaceC5140<? super R, ? super T, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5140, InterfaceC4199<? super R> interfaceC4199) {
        C7060.C7066 c7066 = new C7060.C7066();
        c7066.f21353 = r;
        C4977 c4977 = new C4977(c7066, interfaceC5140);
        C5437.m16931(0);
        interfaceC4890.mo48(c4977, interfaceC4199);
        C5437.m16931(1);
        return c7066.f21353;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m15449(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        C4978 c4978;
        C7060.C7066 c7066;
        if (interfaceC4199 instanceof C4978) {
            c4978 = (C4978) interfaceC4199;
            int i = c4978.f11686;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4978.f11686 = i - Integer.MIN_VALUE;
            } else {
                c4978 = new C4978(interfaceC4199);
            }
        }
        Object obj = c4978.f11685;
        Object objM17142 = C5508.m17142();
        int i2 = c4978.f11686;
        if (i2 == 0) {
            C7149.m22422(obj);
            C7060.C7066 c70662 = new C7060.C7066();
            c70662.f21353 = (T) C6488.f2113;
            InterfaceC4892<? super Object> c4979 = new C4979<>(c70662);
            c4978.f11684 = c70662;
            c4978.f11686 = 1;
            if (interfaceC4890.mo48(c4979, c4978) == objM17142) {
                return objM17142;
            }
            c7066 = c70662;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7066 = (C7060.C7066) c4978.f11684;
            C7149.m22422(obj);
        }
        T t = c7066.f21353;
        if (t != C6488.f2113) {
            return t;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m15450(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        C4980 c4980;
        C7060.C7066 c7066;
        if (interfaceC4199 instanceof C4980) {
            c4980 = (C4980) interfaceC4199;
            int i = c4980.f11690;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4980.f11690 = i - Integer.MIN_VALUE;
            } else {
                c4980 = new C4980(interfaceC4199);
            }
        }
        Object obj = c4980.f11689;
        Object objM17142 = C5508.m17142();
        int i2 = c4980.f11690;
        if (i2 == 0) {
            C7149.m22422(obj);
            C7060.C7066 c70662 = new C7060.C7066();
            InterfaceC4892<? super Object> c4981 = new C4981<>(c70662);
            c4980.f11688 = c70662;
            c4980.f11690 = 1;
            if (interfaceC4890.mo48(c4981, c4980) == objM17142) {
                return objM17142;
            }
            c7066 = c70662;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7066 = (C7060.C7066) c4980.f11688;
            C7149.m22422(obj);
        }
        return c7066.f21353;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, Yue.ۥۢ۠ۦۢ] */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S, T extends S> Object m15451(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5140<? super S, ? super T, ? super InterfaceC4199<? super S>, ? extends Object> interfaceC5140, @InterfaceC6399 InterfaceC4199<? super S> interfaceC4199) {
        C4982 c4982;
        C7060.C7066 c7066;
        if (interfaceC4199 instanceof C4982) {
            c4982 = (C4982) interfaceC4199;
            int i = c4982.f11694;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4982.f11694 = i - Integer.MIN_VALUE;
            } else {
                c4982 = new C4982(interfaceC4199);
            }
        }
        Object obj = c4982.f11693;
        Object objM17142 = C5508.m17142();
        int i2 = c4982.f11694;
        if (i2 == 0) {
            C7149.m22422(obj);
            C7060.C7066 c70662 = new C7060.C7066();
            c70662.f21353 = C6488.f2113;
            InterfaceC4892<? super Object> c4983 = new C4983<>(c70662, interfaceC5140);
            c4982.f11692 = c70662;
            c4982.f11694 = 1;
            if (interfaceC4890.mo48(c4983, c4982) == objM17142) {
                return objM17142;
            }
            c7066 = c70662;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7066 = (C7060.C7066) c4982.f11692;
            C7149.m22422(obj);
        }
        T t = c7066.f21353;
        if (t != C6488.f2113) {
            return t;
        }
        throw new NoSuchElementException("Empty flow can't be reduced");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m15452(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        C4984 c4984;
        C7060.C7066 c7066;
        if (interfaceC4199 instanceof C4984) {
            c4984 = (C4984) interfaceC4199;
            int i = c4984.f11703;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4984.f11703 = i - Integer.MIN_VALUE;
            } else {
                c4984 = new C4984(interfaceC4199);
            }
        }
        Object obj = c4984.f11702;
        Object objM17142 = C5508.m17142();
        int i2 = c4984.f11703;
        if (i2 == 0) {
            C7149.m22422(obj);
            C7060.C7066 c70662 = new C7060.C7066();
            c70662.f21353 = (T) C6488.f2113;
            InterfaceC4892<? super Object> c4985 = new C4985<>(c70662);
            c4984.f11701 = c70662;
            c4984.f11703 = 1;
            if (interfaceC4890.mo48(c4985, c4984) == objM17142) {
                return objM17142;
            }
            c7066 = c70662;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7066 = (C7060.C7066) c4984.f11701;
            C7149.m22422(obj);
        }
        T t = c7066.f21353;
        if (t != C6488.f2113) {
            return t;
        }
        throw new NoSuchElementException("Flow is empty");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m15453(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        C4987 c4987;
        C7060.C7066 c7066;
        C2965 e;
        InterfaceC4892<? super Object> interfaceC4892;
        if (interfaceC4199 instanceof C4987) {
            c4987 = (C4987) interfaceC4199;
            int i = c4987.f11709;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4987.f11709 = i - Integer.MIN_VALUE;
            } else {
                c4987 = new C4987(interfaceC4199);
            }
        }
        Object obj = c4987.f11708;
        Object objM17142 = C5508.m17142();
        int i2 = c4987.f11709;
        if (i2 == 0) {
            C7149.m22422(obj);
            C7060.C7066 c70662 = new C7060.C7066();
            c70662.f21353 = (T) C6488.f2113;
            InterfaceC4892<? super Object> c4986 = new C4986<>(c70662);
            try {
                c4987.f11706 = c70662;
                c4987.f11707 = c4986;
                c4987.f11709 = 1;
                if (interfaceC4890.mo48(c4986, c4987) == objM17142) {
                    return objM17142;
                }
                c7066 = c70662;
            } catch (C2965 e2) {
                c7066 = c70662;
                e = e2;
                interfaceC4892 = c4986;
                C4895.m1804(e, interfaceC4892);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC4892 = (C4986) c4987.f11707;
            c7066 = (C7060.C7066) c4987.f11706;
            try {
                C7149.m22422(obj);
            } catch (C2965 e3) {
                e = e3;
                C4895.m1804(e, interfaceC4892);
            }
        }
        T t = c7066.f21353;
        if (t == C6488.f2113) {
            return null;
        }
        return t;
    }
}
