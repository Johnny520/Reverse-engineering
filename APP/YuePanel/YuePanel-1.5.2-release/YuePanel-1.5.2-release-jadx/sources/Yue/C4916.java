package Yue;

import Yue.C7060;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4916 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۢ$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__CountKt", m1273f = "Count.kt", m1274i = {0}, m1275l = {18}, m1276m = "count", m1277n = {"i"}, m1278s = {"L$0"})
    public static final class C0542<T> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f11389;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f11390;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f11391;

        public C0542(InterfaceC4199<? super C0542> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f11390 = obj;
            this.f11391 |= Integer.MIN_VALUE;
            return C4896.m15195(null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۢ$ۥ۟ */
    public static final class C0543<T> implements InterfaceC4892 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7064 f11392;

        public C0543(C7060.C7064 c7064) {
            this.f11392 = c7064;
        }

        @Override // Yue.InterfaceC4892
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public final Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            this.f11392.f21351++;
            return C8107.f3222;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۢ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__CountKt", m1273f = "Count.kt", m1274i = {0}, m1275l = {30}, m1276m = "count", m1277n = {"i"}, m1278s = {"L$0"})
    public static final class C4917<T> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f11393;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f11394;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f11395;

        public C4917(InterfaceC4199<? super C4917> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f11394 = obj;
            this.f11395 |= Integer.MIN_VALUE;
            return C4896.m15196(null, null, this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۢ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C4918<T> implements InterfaceC4892 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<T, InterfaceC4199<? super Boolean>, Object> f11396;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7064 f11397;

        /* JADX INFO: renamed from: Yue.ۥ۠ۢۤۢ$ۥ۟۟۟$ۥ */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4", m1273f = "Count.kt", m1274i = {0}, m1275l = {31}, m1276m = "emit", m1277n = {"this"}, m1278s = {"L$0"})
        public static final class C0544 extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public Object f11398;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public /* synthetic */ Object f11399;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public final /* synthetic */ C4918<T> f11400;

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public int f11401;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۠ۢۤۢ$ۥ۟۟۟<? super T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0544(C4918<? super T> c4918, InterfaceC4199<? super C0544> interfaceC4199) {
                super(interfaceC4199);
                this.f11400 = c4918;
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f11399 = obj;
                this.f11401 |= Integer.MIN_VALUE;
                return this.f11400.mo10059(null, this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۢ<? super T, ? super Yue.ۥ۟ۧۤۢ<? super java.lang.Boolean>, ? extends java.lang.Object> */
        /* JADX WARN: Multi-variable type inference failed */
        public C4918(InterfaceC5138<? super T, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5138, C7060.C7064 c7064) {
            this.f11396 = interfaceC5138;
            this.f11397 = c7064;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // Yue.InterfaceC4892
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            C0544 c0544;
            C4918<T> c4918;
            if (interfaceC4199 instanceof C0544) {
                c0544 = (C0544) interfaceC4199;
                int i = c0544.f11401;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0544.f11401 = i - Integer.MIN_VALUE;
                } else {
                    c0544 = new C0544(this, interfaceC4199);
                }
            }
            Object objInvoke = c0544.f11399;
            Object objM17142 = C5508.m17142();
            int i2 = c0544.f11401;
            if (i2 == 0) {
                C7149.m22422(objInvoke);
                InterfaceC5138<T, InterfaceC4199<? super Boolean>, Object> interfaceC5138 = this.f11396;
                c0544.f11398 = this;
                c0544.f11401 = 1;
                objInvoke = interfaceC5138.invoke(t, c0544);
                if (objInvoke == objM17142) {
                    return objM17142;
                }
                c4918 = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c4918 = (C4918) c0544.f11398;
                C7149.m22422(objInvoke);
            }
            if (((Boolean) objInvoke).booleanValue()) {
                c4918.f11397.f21351++;
            }
            return C8107.f3222;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m1819(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4199<? super Integer> interfaceC4199) {
        C0542 c0542;
        C7060.C7064 c7064;
        if (interfaceC4199 instanceof C0542) {
            c0542 = (C0542) interfaceC4199;
            int i = c0542.f11391;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0542.f11391 = i - Integer.MIN_VALUE;
            } else {
                c0542 = new C0542(interfaceC4199);
            }
        }
        Object obj = c0542.f11390;
        Object objM17142 = C5508.m17142();
        int i2 = c0542.f11391;
        if (i2 == 0) {
            C7149.m22422(obj);
            C7060.C7064 c70642 = new C7060.C7064();
            InterfaceC4892<? super Object> c0543 = new C0543<>(c70642);
            c0542.f11389 = c70642;
            c0542.f11391 = 1;
            if (interfaceC4890.mo48(c0543, c0542) == objM17142) {
                return objM17142;
            }
            c7064 = c70642;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7064 = (C7060.C7064) c0542.f11389;
            C7149.m22422(obj);
        }
        return C3590.m9584(c7064.f21351);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m1820(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC5138<? super T, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC4199<? super Integer> interfaceC4199) {
        C4917 c4917;
        C7060.C7064 c7064;
        if (interfaceC4199 instanceof C4917) {
            c4917 = (C4917) interfaceC4199;
            int i = c4917.f11395;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4917.f11395 = i - Integer.MIN_VALUE;
            } else {
                c4917 = new C4917(interfaceC4199);
            }
        }
        Object obj = c4917.f11394;
        Object objM17142 = C5508.m17142();
        int i2 = c4917.f11395;
        if (i2 == 0) {
            C7149.m22422(obj);
            C7060.C7064 c70642 = new C7060.C7064();
            InterfaceC4892<? super Object> c4918 = new C4918<>(interfaceC5138, c70642);
            c4917.f11393 = c70642;
            c4917.f11395 = 1;
            if (interfaceC4890.mo48(c4918, c4917) == objM17142) {
                return objM17142;
            }
            c7064 = c70642;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7064 = (C7060.C7064) c4917.f11393;
            C7149.m22422(obj);
        }
        return C3590.m9584(c7064.f21351);
    }
}
