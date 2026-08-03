package Yue;

import Yue.C2954;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7590 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C7694 f2954 = new C7694("NONE");

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final C7694 f2955 = new C7694("PENDING");

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final <T> InterfaceC6309<T> m3748(T t) {
        if (t == null) {
            t = (T) C6488.f2113;
        }
        return new C7589(t);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m23755(@InterfaceC6399 InterfaceC7588<? extends T> interfaceC7588, @InterfaceC6399 InterfaceC4225 interfaceC4225, int i, @InterfaceC6399 EnumC3602 enumC3602) {
        return (((i < 0 || i >= 2) && i != -2) || enumC3602 != EnumC3602.DROP_OLDEST) ? C7434.m23311(interfaceC7588, interfaceC4225, i, enumC3602) : interfaceC7588;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۡۡۧۦ<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> T m23756(@InterfaceC6399 InterfaceC6309<T> interfaceC6309, @InterfaceC6399 InterfaceC5124<? super T, ? extends T> interfaceC5124) {
        ?? r0;
        do {
            r0 = (Object) interfaceC6309.getValue();
        } while (!interfaceC6309.mo19614(r0, interfaceC5124.invoke(r0)));
        return r0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m23757() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m23758() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Yue.ۥ۟۟۟ۢ$ۥ۟ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> void m23759(@InterfaceC6399 InterfaceC6309<T> interfaceC6309, @InterfaceC6399 InterfaceC5124<? super T, ? extends T> interfaceC5124) {
        C2954.C0003 c0003;
        do {
            c0003 = (Object) interfaceC6309.getValue();
        } while (!interfaceC6309.mo19614(c0003, interfaceC5124.invoke(c0003)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Yue.ۥ۟۟۟ۢ$ۥ۟ */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T> T m23760(@InterfaceC6399 InterfaceC6309<T> interfaceC6309, @InterfaceC6399 InterfaceC5124<? super T, ? extends T> interfaceC5124) {
        C2954.C0003 c0003;
        T tInvoke;
        do {
            c0003 = (Object) interfaceC6309.getValue();
            tInvoke = interfaceC5124.invoke(c0003);
        } while (!interfaceC6309.mo19614(c0003, tInvoke));
        return tInvoke;
    }
}
