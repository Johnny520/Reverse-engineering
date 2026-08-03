package Yue;

import Yue.C3732;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3730 {
    @InterfaceC4372(level = EnumC0393.f8972, message = "Since 1.4.0, binary compatibility with earlier versions")
    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ InterfaceC3713 m803(int i) {
        return m10194(i, null, null, 6, null);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <E> InterfaceC3713<E> m804(int i, @InterfaceC6399 EnumC3602 enumC3602, @InterfaceC6489 InterfaceC5124<? super E, C8107> interfaceC5124) {
        if (i == -2) {
            return new C3381(enumC3602 == EnumC3602.SUSPEND ? InterfaceC3713.f491.m797() : 1, enumC3602, interfaceC5124);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? (i == 1 && enumC3602 == EnumC3602.DROP_OLDEST) ? new C4101(interfaceC5124) : new C3381(i, enumC3602, interfaceC5124) : new C5718(interfaceC5124) : enumC3602 == EnumC3602.SUSPEND ? new C7094(interfaceC5124) : new C3381(1, enumC3602, interfaceC5124);
        }
        if (enumC3602 == EnumC3602.SUSPEND) {
            return new C4101(interfaceC5124);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC3713 m10193(int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m803(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC3713 m10194(int i, EnumC3602 enumC3602, InterfaceC5124 interfaceC5124, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            enumC3602 = EnumC3602.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            interfaceC5124 = null;
        }
        return m804(i, enumC3602, interfaceC5124);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> T m10195(@InterfaceC6399 Object obj, @InterfaceC6399 InterfaceC5124<? super Throwable, ? extends T> interfaceC5124) {
        return obj instanceof C3732.C3733 ? interfaceC5124.invoke(C3732.m10202(obj)) : obj;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> Object m10196(@InterfaceC6399 Object obj, @InterfaceC6399 InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        if (obj instanceof C3732.C0241) {
            interfaceC5124.invoke(C3732.m10202(obj));
        }
        return obj;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> Object m10197(@InterfaceC6399 Object obj, @InterfaceC6399 InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        if (obj instanceof C3732.C3733) {
            interfaceC5124.invoke(C3732.m10202(obj));
        }
        return obj;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> Object m10198(@InterfaceC6399 Object obj, @InterfaceC6399 InterfaceC5124<? super T, C8107> interfaceC5124) {
        if (!(obj instanceof C3732.C3733)) {
            interfaceC5124.invoke(obj);
        }
        return obj;
    }
}
