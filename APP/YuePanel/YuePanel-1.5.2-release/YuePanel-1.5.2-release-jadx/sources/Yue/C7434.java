package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7434 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    @InterfaceC5568
    public static final C7694 f2881 = new C7694("NO_VALUE");

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final <T> InterfaceC6308<T> m3625(int i, int i2, @InterfaceC6399 EnumC3602 enumC3602) {
        if (i < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i2).toString());
        }
        if (i > 0 || i2 > 0 || enumC3602 == EnumC3602.SUSPEND) {
            int i3 = i2 + i;
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            return new C7432(i, i3, enumC3602);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC3602).toString());
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ InterfaceC6308 m3626(int i, int i2, EnumC3602 enumC3602, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            enumC3602 = EnumC3602.SUSPEND;
        }
        return m3625(i, i2, enumC3602);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m23311(@InterfaceC6399 InterfaceC7431<? extends T> interfaceC7431, @InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602) {
        return ((i == 0 || i == -3) && enumC3602 == EnumC3602.SUSPEND) ? interfaceC7431 : new C3723(interfaceC7431, interfaceC4225, i, enumC3602);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Object m23312(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m23313() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final void m23314(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }
}
