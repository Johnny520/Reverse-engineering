package Yue;

import Yue.C7148;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4417 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C7694 f879 = new C7694("UNDEFINED");

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    @InterfaceC5568
    public static final C7694 f880 = new C7694("REUSABLE_CLAIMED");

    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean m1366(C4416<?> c4416, Object obj, int i, boolean z, InterfaceC5122<C8107> interfaceC5122) {
        AbstractC4714 abstractC4714M3877 = C7779.f3076.m3877();
        if (z && abstractC4714M3877.m14086()) {
            return false;
        }
        if (abstractC4714M3877.m14085()) {
            c4416.f9145 = obj;
            c4416.f9148 = i;
            abstractC4714M3877.m14081(c4416);
            return true;
        }
        abstractC4714M3877.m14083(true);
        try {
            interfaceC5122.invoke();
            do {
            } while (abstractC4714M3877.m14088());
            C5437.m16930(1);
        } catch (Throwable th) {
            try {
                c4416.m12845(th, null);
                C5437.m16930(1);
            } catch (Throwable th2) {
                C5437.m16930(1);
                abstractC4714M3877.m14079(true);
                C5437.m16929(1);
                throw th2;
            }
        }
        abstractC4714M3877.m14079(true);
        C5437.m16929(1);
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ boolean m12836(C4416 c4416, Object obj, int i, boolean z, InterfaceC5122 interfaceC5122, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        AbstractC4714 abstractC4714M3877 = C7779.f3076.m3877();
        if (z && abstractC4714M3877.m14086()) {
            return false;
        }
        if (abstractC4714M3877.m14085()) {
            c4416.f9145 = obj;
            c4416.f9148 = i;
            abstractC4714M3877.m14081(c4416);
            return true;
        }
        abstractC4714M3877.m14083(true);
        try {
            interfaceC5122.invoke();
            do {
            } while (abstractC4714M3877.m14088());
            C5437.m16930(1);
        } catch (Throwable th) {
            try {
                c4416.m12845(th, null);
                C5437.m16930(1);
            } catch (Throwable th2) {
                C5437.m16930(1);
                abstractC4714M3877.m14079(true);
                C5437.m16929(1);
                throw th2;
            }
        }
        abstractC4714M3877.m14079(true);
        C5437.m16929(1);
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m12837() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m12838() {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f A[Catch: all -> 0x0068, DONT_GENERATE, TryCatch #0 {all -> 0x0068, blocks: (B:11:0x003f, B:13:0x004d, B:15:0x0053, B:28:0x0092, B:18:0x006a, B:20:0x007a, B:25:0x0089, B:27:0x008f, B:33:0x009f, B:36:0x00a8, B:35:0x00a5, B:23:0x0080), top: B:44:0x003f, inners: #1 }] */
    @InterfaceC5495
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void m12839(@InterfaceC6399 InterfaceC4199<? super T> interfaceC4199, @InterfaceC6399 Object obj, @InterfaceC6489 InterfaceC5124<? super Throwable, C8107> interfaceC5124) {
        InterfaceC5542 interfaceC5542;
        if (!(interfaceC4199 instanceof C4416)) {
            interfaceC4199.resumeWith(obj);
            return;
        }
        C4416 c4416 = (C4416) interfaceC4199;
        Object objM11486 = C4056.m11486(obj, interfaceC5124);
        if (c4416.f9143.isDispatchNeeded(c4416.getContext())) {
            c4416.f9145 = objM11486;
            c4416.f9148 = 1;
            c4416.f9143.dispatch(c4416.getContext(), c4416);
            return;
        }
        AbstractC4714 abstractC4714M3877 = C7779.f3076.m3877();
        if (abstractC4714M3877.m14085()) {
            c4416.f9145 = objM11486;
            c4416.f9148 = 1;
            abstractC4714M3877.m14081(c4416);
            return;
        }
        abstractC4714M3877.m14083(true);
        try {
            interfaceC5542 = (InterfaceC5542) c4416.getContext().get(InterfaceC5542.f13507);
        } finally {
            try {
            } finally {
            }
        }
        if (interfaceC5542 == null || interfaceC5542.mo5773()) {
            InterfaceC4199<T> interfaceC41992 = c4416.f9144;
            Object obj2 = c4416.f9146;
            InterfaceC4225 context = interfaceC41992.getContext();
            Object objM24718 = C7776.m24718(context, obj2);
            C8102<?> c8102M12167 = objM24718 != C7776.f3074 ? C4230.m12167(interfaceC41992, context, objM24718) : null;
            try {
                c4416.f9144.resumeWith(obj);
                C8107 c8107 = C8107.f3222;
            } finally {
                if (c8102M12167 == null || c8102M12167.m26701()) {
                    C7776.m3874(context, objM24718);
                }
            }
        }
        CancellationException cancellationExceptionMo17161 = interfaceC5542.mo17161();
        c4416.mo733(objM11486, cancellationExceptionMo17161);
        C7148.C1189 c1189 = C7148.f21560;
        c4416.resumeWith(C7148.m3438(C7149.m3441(cancellationExceptionMo17161)));
        while (abstractC4714M3877.m14088()) {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m12840(InterfaceC4199 interfaceC4199, Object obj, InterfaceC5124 interfaceC5124, int i, Object obj2) {
        if ((i & 2) != 0) {
            interfaceC5124 = null;
        }
        m12839(interfaceC4199, obj, interfaceC5124);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean m12841(@InterfaceC6399 C4416<? super C8107> c4416) {
        C8107 c8107 = C8107.f3222;
        AbstractC4714 abstractC4714M3877 = C7779.f3076.m3877();
        if (abstractC4714M3877.m14086()) {
            return false;
        }
        if (abstractC4714M3877.m14085()) {
            c4416.f9145 = c8107;
            c4416.f9148 = 1;
            abstractC4714M3877.m14081(c4416);
            return true;
        }
        abstractC4714M3877.m14083(true);
        try {
            c4416.run();
            do {
            } while (abstractC4714M3877.m14088());
        } finally {
            try {
            } finally {
            }
        }
        return false;
    }
}
