package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3616 {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> T m662(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138) throws InterruptedException {
        AbstractC4714 abstractC4714M3876;
        InterfaceC4225 interfaceC4225M12165;
        Thread threadCurrentThread = Thread.currentThread();
        InterfaceC4202 interfaceC4202 = (InterfaceC4202) interfaceC4225.get(InterfaceC4202.f8519);
        if (interfaceC4202 == null) {
            abstractC4714M3876 = C7779.f3076.m3877();
            interfaceC4225M12165 = C4230.m12165(C5178.f12230, interfaceC4225.plus(abstractC4714M3876));
        } else {
            AbstractC4714 abstractC4714 = interfaceC4202 instanceof AbstractC4714 ? (AbstractC4714) interfaceC4202 : null;
            if (abstractC4714 == null) {
                abstractC4714M3876 = C7779.f3076.m3876();
                interfaceC4225M12165 = C4230.m12165(C5178.f12230, interfaceC4225);
            } else {
                AbstractC4714 abstractC47142 = abstractC4714.m14089() ? abstractC4714 : null;
                if (abstractC47142 != null) {
                    abstractC4714M3876 = abstractC47142;
                }
                interfaceC4225M12165 = C4230.m12165(C5178.f12230, interfaceC4225);
            }
        }
        C3543 c3543 = new C3543(interfaceC4225M12165, threadCurrentThread, abstractC4714M3876);
        c3543.m5781(EnumC4247.DEFAULT, c3543, interfaceC5138);
        return (T) c3543.m9506();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ Object m663(InterfaceC4225 interfaceC4225, InterfaceC5138 interfaceC5138, int i, Object obj) throws InterruptedException {
        if ((i & 1) != 0) {
            interfaceC4225 = C4629.f9940;
        }
        return C3615.m9754(interfaceC4225, interfaceC5138);
    }
}
