package Yue;

import Yue.InterfaceC4202;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3617 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f418 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f419 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f6361 = 2;

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final <T> InterfaceC4360<T> m664(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 EnumC4247 enumC4247, @InterfaceC6399 InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138) {
        InterfaceC4225 interfaceC4225M12165 = C4230.m12165(interfaceC4243, interfaceC4225);
        C4361 c5687 = enumC4247.m12252() ? new C5687(interfaceC4225M12165, interfaceC5138) : new C4361(interfaceC4225M12165, true);
        ((AbstractC2980) c5687).m5781(enumC4247, c5687, interfaceC5138);
        return (InterfaceC4360<T>) c5687;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ InterfaceC4360 m665(InterfaceC4243 interfaceC4243, InterfaceC4225 interfaceC4225, EnumC4247 enumC4247, InterfaceC5138 interfaceC5138, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC4225 = C4629.f9940;
        }
        if ((i & 2) != 0) {
            enumC4247 = EnumC4247.DEFAULT;
        }
        return C3615.m660(interfaceC4243, interfaceC4225, enumC4247, interfaceC5138);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> Object m9757(@InterfaceC6399 AbstractC4232 abstractC4232, @InterfaceC6399 InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        return C3615.m9756(abstractC4232, interfaceC5138, interfaceC4199);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> Object m9758(AbstractC4232 abstractC4232, InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138, InterfaceC4199<? super T> interfaceC4199) throws Throwable {
        C5437.m16931(0);
        Object objM9756 = C3615.m9756(abstractC4232, interfaceC5138, interfaceC4199);
        C5437.m16931(1);
        return objM9756;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final InterfaceC5542 m9759(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 EnumC4247 enumC4247, @InterfaceC6399 InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138) {
        InterfaceC4225 interfaceC4225M12165 = C4230.m12165(interfaceC4243, interfaceC4225);
        AbstractC2980 c5691 = enumC4247.m12252() ? new C5691(interfaceC4225M12165, interfaceC5138) : new C7567(interfaceC4225M12165, true);
        c5691.m5781(enumC4247, c5691, interfaceC5138);
        return c5691;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC5542 m9760(InterfaceC4243 interfaceC4243, InterfaceC4225 interfaceC4225, EnumC4247 enumC4247, InterfaceC5138 interfaceC5138, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC4225 = C4629.f9940;
        }
        if ((i & 2) != 0) {
            enumC4247 = EnumC4247.DEFAULT;
        }
        return C3615.m9752(interfaceC4243, interfaceC4225, enumC4247, interfaceC5138);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> Object m9761(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) throws Throwable {
        Object objM12844;
        InterfaceC4225 context = interfaceC4199.getContext();
        InterfaceC4225 interfaceC4225M12164 = C4230.m12164(context, interfaceC4225);
        C5553.m17211(interfaceC4225M12164);
        if (interfaceC4225M12164 == context) {
            C7242 c7242 = new C7242(interfaceC4225M12164, interfaceC4199);
            objM12844 = C8103.m26706(c7242, c7242, interfaceC5138);
        } else {
            InterfaceC4202.C0349 c0349 = InterfaceC4202.f8519;
            if (C5499.m17094(interfaceC4225M12164.get(c0349), context.get(c0349))) {
                C8102 c8102 = new C8102(interfaceC4225M12164, interfaceC4199);
                Object objM24718 = C7776.m24718(interfaceC4225M12164, null);
                try {
                    Object objM26706 = C8103.m26706(c8102, c8102, interfaceC5138);
                    C7776.m3874(interfaceC4225M12164, objM24718);
                    objM12844 = objM26706;
                } catch (Throwable th) {
                    C7776.m3874(interfaceC4225M12164, objM24718);
                    throw th;
                }
            } else {
                C4418 c4418 = new C4418(interfaceC4225M12164, interfaceC4199);
                C3672.m10063(interfaceC5138, c4418, c4418, null, 4, null);
                objM12844 = c4418.m12844();
            }
        }
        if (objM12844 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        return objM12844;
    }
}
