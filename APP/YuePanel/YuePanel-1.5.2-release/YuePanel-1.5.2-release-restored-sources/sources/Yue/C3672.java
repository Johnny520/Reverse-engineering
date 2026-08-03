package Yue;

import Yue.C7148;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3672 {
    /* JADX INFO: renamed from: ۥ */
    public static final void m737(InterfaceC4199<?> interfaceC4199, Throwable th) throws Throwable {
        C7148.C1189 c1189 = C7148.f21560;
        interfaceC4199.resumeWith(C7148.m3438(C7149.m3441(th)));
        throw th;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final void m738(InterfaceC4199<?> interfaceC4199, InterfaceC5122<C8107> interfaceC5122) throws Throwable {
        try {
            interfaceC5122.invoke();
        } catch (Throwable th) {
            m737(interfaceC4199, th);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥ۠۟ۢ۠.ۥ۟۟۟ۡ(Yue.ۥ۟ۧۤۢ, java.lang.Object, Yue.ۥۣ۠ۡ۟, int, java.lang.Object):void */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m10060(@InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199, @InterfaceC6399 InterfaceC4199<?> interfaceC41992) throws Throwable {
        try {
            InterfaceC4199 interfaceC4199M17135 = C5501.m17135(interfaceC4199);
            C7148.C1189 c1189 = C7148.f21560;
            C4417.m12840(interfaceC4199M17135, C7148.m3438(C8107.f3222), null, 2, null);
        } catch (Throwable th) {
            m737(interfaceC41992, th);
        }
    }

    @InterfaceC5495
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> void m10061(@InterfaceC6399 InterfaceC5124<? super InterfaceC4199<? super T>, ? extends Object> interfaceC5124, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) throws Throwable {
        try {
            InterfaceC4199 interfaceC4199M17135 = C5501.m17135(C5501.m2258(interfaceC5124, interfaceC4199));
            C7148.C1189 c1189 = C7148.f21560;
            C4417.m12840(interfaceC4199M17135, C7148.m3438(C8107.f3222), null, 2, null);
        } catch (Throwable th) {
            m737(interfaceC4199, th);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <R, T> void m10062(@InterfaceC6399 InterfaceC5138<? super R, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138, R r, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199, @InterfaceC6489 InterfaceC5124<? super Throwable, C8107> interfaceC5124) throws Throwable {
        try {
            InterfaceC4199 interfaceC4199M17135 = C5501.m17135(C5501.m17133(interfaceC5138, r, interfaceC4199));
            C7148.C1189 c1189 = C7148.f21560;
            C4417.m12839(interfaceC4199M17135, C7148.m3438(C8107.f3222), interfaceC5124);
        } catch (Throwable th) {
            m737(interfaceC4199, th);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m10063(InterfaceC5138 interfaceC5138, Object obj, InterfaceC4199 interfaceC4199, InterfaceC5124 interfaceC5124, int i, Object obj2) throws Throwable {
        if ((i & 4) != 0) {
            interfaceC5124 = null;
        }
        m10062(interfaceC5138, obj, interfaceC4199, interfaceC5124);
    }
}
