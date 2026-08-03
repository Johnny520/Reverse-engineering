package Yue;

import Yue.C7148;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۣۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4056 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final <T> Object m1009(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        if (obj instanceof C4050) {
            C7148.C1189 c1189 = C7148.f21560;
            return C7148.m3438(C7149.m3441(((C4050) obj).f637));
        }
        C7148.C1189 c11892 = C7148.f21560;
        return C7148.m3438(obj);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T> Object m1010(@InterfaceC6399 Object obj, @InterfaceC6399 InterfaceC3665<?> interfaceC3665) {
        Throwable thM22403 = C7148.m22403(obj);
        return thM22403 == null ? obj : new C4050(thM22403, false, 2, null);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> Object m11486(@InterfaceC6399 Object obj, @InterfaceC6489 InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        Throwable thM22403 = C7148.m22403(obj);
        return thM22403 == null ? interfaceC5124 != null ? new C4051(obj, interfaceC5124) : obj : new C4050(thM22403, false, 2, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ Object m11487(Object obj, InterfaceC5124 interfaceC5124, int i, Object obj2) {
        if ((i & 1) != 0) {
            interfaceC5124 = null;
        }
        return m11486(obj, interfaceC5124);
    }
}
