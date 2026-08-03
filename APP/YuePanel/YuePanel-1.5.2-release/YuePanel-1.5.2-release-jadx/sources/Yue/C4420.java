package Yue;

import Yue.C7148;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4420 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f881 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f882 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f9149 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f9150 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f9151 = -1;

    /* JADX INFO: renamed from: ۥ */
    public static final <T> void m1367(@InterfaceC6399 AbstractC4419<? super T> abstractC4419, int i) {
        InterfaceC4199<? super T> interfaceC4199Mo10025 = abstractC4419.mo10025();
        boolean z = i == 4;
        if (z || !(interfaceC4199Mo10025 instanceof C4416) || m12846(i) != m12846(abstractC4419.f9148)) {
            m12848(abstractC4419, interfaceC4199Mo10025, z);
            return;
        }
        AbstractC4232 abstractC4232 = ((C4416) interfaceC4199Mo10025).f9143;
        InterfaceC4225 context = interfaceC4199Mo10025.getContext();
        if (abstractC4232.isDispatchNeeded(context)) {
            abstractC4232.dispatch(context, abstractC4419);
        } else {
            m12849(abstractC4419);
        }
    }

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟ */
    public static /* synthetic */ void m1368() {
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m12846(int i) {
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final boolean m12847(int i) {
        return i == 2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> void m12848(@InterfaceC6399 AbstractC4419<? super T> abstractC4419, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199, boolean z) {
        Object objMo10027;
        Object objMo10028 = abstractC4419.mo10028();
        Throwable thMo10026 = abstractC4419.mo10026(objMo10028);
        if (thMo10026 != null) {
            C7148.C1189 c1189 = C7148.f21560;
            objMo10027 = C7149.m3441(thMo10026);
        } else {
            C7148.C1189 c11892 = C7148.f21560;
            objMo10027 = abstractC4419.mo10027(objMo10028);
        }
        Object objM3438 = C7148.m3438(objMo10027);
        if (!z) {
            interfaceC4199.resumeWith(objM3438);
            return;
        }
        C4416 c4416 = (C4416) interfaceC4199;
        InterfaceC4199<T> interfaceC41992 = c4416.f9144;
        Object obj = c4416.f9146;
        InterfaceC4225 context = interfaceC41992.getContext();
        Object objM24718 = C7776.m24718(context, obj);
        C8102<?> c8102M12167 = objM24718 != C7776.f3074 ? C4230.m12167(interfaceC41992, context, objM24718) : null;
        try {
            c4416.f9144.resumeWith(objM3438);
            C8107 c8107 = C8107.f3222;
        } finally {
            if (c8102M12167 == null || c8102M12167.m26701()) {
                C7776.m3874(context, objM24718);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m12849(AbstractC4419<?> abstractC4419) {
        AbstractC4714 abstractC4714M3877 = C7779.f3076.m3877();
        if (abstractC4714M3877.m14085()) {
            abstractC4714M3877.m14081(abstractC4419);
            return;
        }
        abstractC4714M3877.m14083(true);
        try {
            m12848(abstractC4419, abstractC4419.mo10025(), true);
            do {
            } while (abstractC4714M3877.m14088());
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final void m12850(@InterfaceC6399 InterfaceC4199<?> interfaceC4199, @InterfaceC6399 Throwable th) {
        C7148.C1189 c1189 = C7148.f21560;
        interfaceC4199.resumeWith(C7148.m3438(C7149.m3441(th)));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final void m12851(@InterfaceC6399 AbstractC4419<?> abstractC4419, @InterfaceC6399 AbstractC4714 abstractC4714, @InterfaceC6399 InterfaceC5122<C8107> interfaceC5122) {
        abstractC4714.m14083(true);
        try {
            interfaceC5122.invoke();
            do {
            } while (abstractC4714.m14088());
            C5437.m16930(1);
        } catch (Throwable th) {
            try {
                abstractC4419.m12845(th, null);
                C5437.m16930(1);
            } catch (Throwable th2) {
                C5437.m16930(1);
                abstractC4714.m14079(true);
                C5437.m16929(1);
                throw th2;
            }
        }
        abstractC4714.m14079(true);
        C5437.m16929(1);
    }
}
