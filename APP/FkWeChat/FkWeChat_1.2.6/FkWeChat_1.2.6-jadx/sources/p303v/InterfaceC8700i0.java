package p303v;

import androidx.compose.foundation.lazy.layout.C0426u0;
import p010a9.InterfaceC0184l;
import p215oc.C5725t;

/* JADX INFO: renamed from: v.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8700i0 {
    /* JADX INFO: renamed from: b */
    static /* synthetic */ C0426u0.b m33425b(InterfaceC8700i0 interfaceC8700i0, int i10, InterfaceC0184l interfaceC0184l, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: schedulePrefetch");
            return null;
        }
        if ((i11 & 2) != 0) {
            interfaceC0184l = null;
        }
        return interfaceC8700i0.mo33426a(i10, interfaceC0184l);
    }

    /* JADX INFO: renamed from: a */
    C0426u0.b mo33426a(int i10, InterfaceC0184l interfaceC0184l);
}
