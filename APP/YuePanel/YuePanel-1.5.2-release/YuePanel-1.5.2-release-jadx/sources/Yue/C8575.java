package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦۣۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8575 {
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public static final Object m4544(@InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        Object objM17142;
        InterfaceC4225 context = interfaceC4199.getContext();
        C5553.m17211(context);
        InterfaceC4199 interfaceC4199M17135 = C5501.m17135(interfaceC4199);
        C4416 c4416 = interfaceC4199M17135 instanceof C4416 ? (C4416) interfaceC4199M17135 : null;
        if (c4416 == null) {
            objM17142 = C8107.f3222;
        } else {
            if (c4416.f9143.isDispatchNeeded(context)) {
                c4416.m12827(context, C8107.f3222);
            } else {
                C8574 c8574 = new C8574();
                InterfaceC4225 interfaceC4225Plus = context.plus(c8574);
                C8107 c8107 = C8107.f3222;
                c4416.m12827(interfaceC4225Plus, c8107);
                objM17142 = (!c8574.f25444 || C4417.m12841(c4416)) ? C5508.m17142() : c8107;
            }
            objM17142 = C5508.m17142();
        }
        if (objM17142 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        return objM17142 == C5508.m17142() ? objM17142 : C8107.f3222;
    }
}
