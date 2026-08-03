package Yue;

import Yue.C7060;

/* JADX INFO: renamed from: Yue.ۥۢۡۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7830 {

    /* JADX INFO: renamed from: Yue.ۥۢۡۥ۟$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.TimeoutKt", m1273f = "Timeout.kt", m1274i = {0, 0, 0}, m1275l = {100}, m1276m = "withTimeoutOrNull", m1277n = {"block", "coroutine", "timeMillis"}, m1278s = {"L$0", "L$1", "J$0"})
    public static final class C1374<T> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public long f23438;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f23439;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f23440;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f23441;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f23442;

        public C1374(InterfaceC4199<? super C1374> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f23441 = obj;
            this.f23442 |= Integer.MIN_VALUE;
            return C7830.m24851(0L, null, this);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final C7828 m3924(long j, @InterfaceC6399 InterfaceC5542 interfaceC5542) {
        return new C7828("Timed out waiting for " + j + " ms", interfaceC5542);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final <U, T extends U> Object m3925(RunnableC7829<U, ? super T> runnableC7829, InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138) {
        C5553.m17210(runnableC7829, C4365.m12620(runnableC7829.f21885.getContext()).mo12587(runnableC7829.f23437, runnableC7829, runnableC7829.getContext()));
        return C8103.m26707(runnableC7829, runnableC7829, interfaceC5138);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> Object m24849(long j, @InterfaceC6399 InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        if (j <= 0) {
            throw new C7828("Timed out immediately");
        }
        Object objM3925 = m3925(new RunnableC7829(j, interfaceC4199), interfaceC5138);
        if (objM3925 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        return objM3925;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> Object m24850(long j, @InterfaceC6399 InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        return m24849(C4365.m12621(j), interfaceC5138, interfaceC4199);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, Yue.ۥۢۡۥ] */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m24851(long j, @InterfaceC6399 InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        C1374 c1374;
        C7060.C7066 c7066;
        if (interfaceC4199 instanceof C1374) {
            c1374 = (C1374) interfaceC4199;
            int i = c1374.f23442;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1374.f23442 = i - Integer.MIN_VALUE;
            } else {
                c1374 = new C1374(interfaceC4199);
            }
        }
        Object obj = c1374.f23441;
        Object objM17142 = C5508.m17142();
        int i2 = c1374.f23442;
        if (i2 == 0) {
            C7149.m22422(obj);
            if (j <= 0) {
                return null;
            }
            C7060.C7066 c70662 = new C7060.C7066();
            try {
                c1374.f23439 = interfaceC5138;
                c1374.f23440 = c70662;
                c1374.f23438 = j;
                c1374.f23442 = 1;
                ?? r2 = (T) new RunnableC7829(j, c1374);
                c70662.f21353 = r2;
                Object objM3925 = m3925(r2, interfaceC5138);
                if (objM3925 == C5508.m17142()) {
                    C4324.m12513(c1374);
                }
                return objM3925 == objM17142 ? objM17142 : objM3925;
            } catch (C7828 e) {
                e = e;
                c7066 = c70662;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7066 = (C7060.C7066) c1374.f23440;
            try {
                C7149.m22422(obj);
                return obj;
            } catch (C7828 e2) {
                e = e2;
            }
        }
        if (e.f23436 == c7066.f21353) {
            return null;
        }
        throw e;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> Object m24852(long j, @InterfaceC6399 InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        return m24851(C4365.m12621(j), interfaceC5138, interfaceC4199);
    }
}
