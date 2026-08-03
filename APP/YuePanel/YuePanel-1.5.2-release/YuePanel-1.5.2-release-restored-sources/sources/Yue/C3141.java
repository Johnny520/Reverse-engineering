package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3141 {
    @InterfaceC6399
    @InterfaceC6501
    /* JADX INFO: renamed from: ۥ */
    public static final <E> InterfaceC7317<E> m229(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC4247 enumC4247, @InterfaceC6489 InterfaceC5124<? super Throwable, C8107> interfaceC5124, @InterfaceC6399 InterfaceC5138<? super InterfaceC3142<E>, ? super InterfaceC4199<? super C8107>, ? extends Object> interfaceC5138) {
        InterfaceC4225 interfaceC4225M12165 = C4230.m12165(interfaceC4243, interfaceC4225);
        InterfaceC3713 interfaceC3713M10194 = C3730.m10194(i, null, null, 6, null);
        C3140 c5685 = enumC4247.m12252() ? new C5685(interfaceC4225M12165, interfaceC3713M10194, interfaceC5138) : new C3140(interfaceC4225M12165, interfaceC3713M10194, true);
        if (interfaceC5124 != null) {
            ((C5557) c5685).mo17160(interfaceC5124);
        }
        ((AbstractC2980) c5685).m5781(enumC4247, c5685, interfaceC5138);
        return (InterfaceC7317<E>) c5685;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ InterfaceC7317 m230(InterfaceC4243 interfaceC4243, InterfaceC4225 interfaceC4225, int i, EnumC4247 enumC4247, InterfaceC5124 interfaceC5124, InterfaceC5138 interfaceC5138, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC4225 = C4629.f9940;
        }
        InterfaceC4225 interfaceC42252 = interfaceC4225;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            enumC4247 = EnumC4247.DEFAULT;
        }
        EnumC4247 enumC42472 = enumC4247;
        if ((i2 & 8) != 0) {
            interfaceC5124 = null;
        }
        return m229(interfaceC4243, interfaceC42252, i3, enumC42472, interfaceC5124, interfaceC5138);
    }
}
