package Yue;

import Yue.InterfaceC5154;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4915 {
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥ۠ۢۤۡ.ۥ۟۟(Yue.ۥۣ۠ۢۡ, int, int, java.lang.Object):Yue.ۥۣ۠ۢۡ] */
    @InterfaceC4372(level = EnumC0393.f8972, message = "Since 1.4.0, binary compatibility with earlier versions")
    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ InterfaceC4890 m1817(InterfaceC4890 interfaceC4890, int i) {
        return m15336(interfaceC4890, i, null, 2, null);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T> InterfaceC4890<T> m1818(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, int i, @InterfaceC6399 EnumC3602 enumC3602) {
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i).toString());
        }
        if (i == -1 && enumC3602 != EnumC3602.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i == -1) {
            enumC3602 = EnumC3602.DROP_OLDEST;
            i = 0;
        }
        int i2 = i;
        EnumC3602 enumC36022 = enumC3602;
        return interfaceC4890 instanceof InterfaceC5154 ? InterfaceC5154.C0650.m1934((InterfaceC5154) interfaceC4890, null, i2, enumC36022, 1, null) : new C3723(interfaceC4890, null, i2, enumC36022, 2, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC4890 m15335(InterfaceC4890 interfaceC4890, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        return m1817(interfaceC4890, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC4890 m15336(InterfaceC4890 interfaceC4890, int i, EnumC3602 enumC3602, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            enumC3602 = EnumC3602.SUSPEND;
        }
        return C4896.m15159(interfaceC4890, i, enumC3602);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۡ<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15337(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890) {
        return interfaceC4890 instanceof InterfaceC3669 ? interfaceC4890 : new C3670(interfaceC4890);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m15338(InterfaceC4225 interfaceC4225) {
        if (interfaceC4225.get(InterfaceC5542.f13507) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + interfaceC4225).toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15339(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890) {
        return m15336(interfaceC4890, -1, null, 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: Yue.ۥۣ۠ۢۡ<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15340(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
        m15338(interfaceC4225);
        return C5499.m17094(interfaceC4225, C4629.f9940) ? interfaceC4890 : interfaceC4890 instanceof InterfaceC5154 ? InterfaceC5154.C0650.m1934((InterfaceC5154) interfaceC4890, interfaceC4225, 0, null, 6, null) : new C3723(interfaceC4890, interfaceC4225, 0, null, 12, null);
    }
}
