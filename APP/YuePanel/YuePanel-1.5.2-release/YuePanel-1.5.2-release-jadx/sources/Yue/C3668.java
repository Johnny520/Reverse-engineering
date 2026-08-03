package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3668 {
    @InterfaceC5495
    /* JADX INFO: renamed from: ۥ */
    public static final void m735(@InterfaceC6399 InterfaceC3665<?> interfaceC3665, @InterfaceC6399 InterfaceC4433 interfaceC4433) {
        interfaceC3665.mo10021(new C4434(interfaceC4433));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T> C3666<T> m736(@InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        if (!(interfaceC4199 instanceof C4416)) {
            return new C3666<>(interfaceC4199, 1);
        }
        C3666<T> c3666M12826 = ((C4416) interfaceC4199).m12826();
        if (c3666M12826 != null) {
            if (!c3666M12826.m10048()) {
                c3666M12826 = null;
            }
            if (c3666M12826 != null) {
                return c3666M12826;
            }
        }
        return new C3666<>(interfaceC4199, 2);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m10054(@InterfaceC6399 InterfaceC3665<?> interfaceC3665, @InterfaceC6399 C5850 c5850) {
        interfaceC3665.mo10021(new C7092(c5850));
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> Object m10055(@InterfaceC6399 InterfaceC5124<? super InterfaceC3665<? super T>, C8107> interfaceC5124, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        C3666 c3666 = new C3666(C5501.m17135(interfaceC4199), 1);
        c3666.mo10020();
        interfaceC5124.invoke(c3666);
        Object objM10039 = c3666.m10039();
        if (objM10039 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        return objM10039;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> Object m10056(InterfaceC5124<? super InterfaceC3665<? super T>, C8107> interfaceC5124, InterfaceC4199<? super T> interfaceC4199) {
        C5437.m16931(0);
        C3666 c3666 = new C3666(C5501.m17135(interfaceC4199), 1);
        c3666.mo10020();
        interfaceC5124.invoke(c3666);
        Object objM10039 = c3666.m10039();
        if (objM10039 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        C5437.m16931(1);
        return objM10039;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> Object m10057(@InterfaceC6399 InterfaceC5124<? super InterfaceC3665<? super T>, C8107> interfaceC5124, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        C3666 c3666M736 = m736(C5501.m17135(interfaceC4199));
        interfaceC5124.invoke(c3666M736);
        Object objM10039 = c3666M736.m10039();
        if (objM10039 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        return objM10039;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> Object m10058(InterfaceC5124<? super InterfaceC3665<? super T>, C8107> interfaceC5124, InterfaceC4199<? super T> interfaceC4199) {
        C5437.m16931(0);
        C3666 c3666M736 = m736(C5501.m17135(interfaceC4199));
        interfaceC5124.invoke(c3666M736);
        Object objM10039 = c3666M736.m10039();
        if (objM10039 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        C5437.m16931(1);
        return objM10039;
    }
}
