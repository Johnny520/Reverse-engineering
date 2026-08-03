package Yue;

import Yue.InterfaceC4225;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4365 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۨ۟$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.DelayKt", m1273f = "Delay.kt", m1274i = {}, m1275l = {148}, m1276m = "awaitCancellation", m1277n = {}, m1278s = {})
    public static final class C0388 extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public /* synthetic */ Object f8933;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f8934;

        public C0388(InterfaceC4199<? super C0388> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f8933 = obj;
            this.f8934 |= Integer.MIN_VALUE;
            return C4365.m1322(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1322(@InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
        C0388 c0388;
        if (interfaceC4199 instanceof C0388) {
            c0388 = (C0388) interfaceC4199;
            int i = c0388.f8934;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0388.f8934 = i - Integer.MIN_VALUE;
            } else {
                c0388 = new C0388(interfaceC4199);
            }
        }
        Object obj = c0388.f8933;
        Object objM17142 = C5508.m17142();
        int i2 = c0388.f8934;
        if (i2 == 0) {
            C7149.m22422(obj);
            c0388.f8934 = 1;
            C3666 c3666 = new C3666(C5501.m17135(c0388), 1);
            c3666.mo10020();
            Object objM10039 = c3666.m10039();
            if (objM10039 == C5508.m17142()) {
                C4324.m12513(c0388);
            }
            if (objM10039 == objM17142) {
                return objM17142;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7149.m22422(obj);
        }
        throw new C5667();
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public static final Object m1323(long j, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        if (j <= 0) {
            return C8107.f3222;
        }
        C3666 c3666 = new C3666(C5501.m17135(interfaceC4199), 1);
        c3666.mo10020();
        if (j < Long.MAX_VALUE) {
            m12620(c3666.getContext()).mo12618(j, c3666);
        }
        Object objM10039 = c3666.m10039();
        if (objM10039 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        return objM10039 == C5508.m17142() ? objM10039 : C8107.f3222;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Object m12619(long j, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        Object objM1323 = m1323(m12621(j), interfaceC4199);
        return objM1323 == C5508.m17142() ? objM1323 : C8107.f3222;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final InterfaceC4364 m12620(@InterfaceC6399 InterfaceC4225 interfaceC4225) {
        InterfaceC4225.InterfaceC0357 interfaceC0357 = interfaceC4225.get(InterfaceC4202.f8519);
        InterfaceC4364 interfaceC4364 = interfaceC0357 instanceof InterfaceC4364 ? (InterfaceC4364) interfaceC0357 : null;
        return interfaceC4364 == null ? C4338.m1303() : interfaceC4364;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final long m12621(long j) {
        if (C4555.m13394(j, C4555.f9803.m13508()) > 0) {
            return C7007.m21662(C4555.m13421(j), 1L);
        }
        return 0L;
    }
}
