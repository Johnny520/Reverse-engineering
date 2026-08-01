package androidx.compose.runtime;

import p010a9.InterfaceC0184l;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p376zd.C10010p0;

/* JADX INFO: renamed from: androidx.compose.runtime.a2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0456a2 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC0625y1 m1513a(InterfaceC5980j interfaceC5980j) {
        InterfaceC0625y1 interfaceC0625y1 = (InterfaceC0625y1) interfaceC5980j.mo1654h(InterfaceC0625y1.f1798b);
        if (interfaceC0625y1 != null) {
            return interfaceC0625y1;
        }
        C10010p0.m38820a("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m1514b(InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
        return m1513a(interfaceC5976f.getContext()).mo1650W(new C0631z1(interfaceC0184l), interfaceC5976f);
    }

    /* JADX INFO: renamed from: c */
    public static final Object m1515c(InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
        return m1513a(interfaceC5976f.getContext()).mo1650W(interfaceC0184l, interfaceC5976f);
    }
}
