package androidx.compose.foundation.lazy.layout;

import p215oc.C5725t;
import p219p.InterfaceC5836c1;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.y0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0438y0 extends InterfaceC5836c1 {
    /* JADX INFO: renamed from: b */
    static /* synthetic */ int m1456b(InterfaceC0438y0 interfaceC0438y0, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: calculateDistanceTo");
            return 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return interfaceC0438y0.mo1459d(i10, i11);
    }

    /* JADX INFO: renamed from: a */
    int mo1457a();

    /* JADX INFO: renamed from: c */
    int mo1458c();

    /* JADX INFO: renamed from: d */
    int mo1459d(int i10, int i11);

    /* JADX INFO: renamed from: e */
    void mo1460e(int i10, int i11);

    /* JADX INFO: renamed from: f */
    int mo1461f();

    /* JADX INFO: renamed from: h */
    int mo1462h();
}
