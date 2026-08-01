package p274t;

import p135j2.AbstractC3545l1;
import p135j2.InterfaceC3558p0;
import p135j2.InterfaceC3561q0;
import p215oc.C5725t;

/* JADX INFO: renamed from: t.w2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7917w2 {
    /* JADX INFO: renamed from: n */
    static /* synthetic */ long m30565n(InterfaceC7917w2 interfaceC7917w2, int i10, int i11, int i12, int i13, boolean z10, int i14, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: createConstraints-xF2OJ5Q");
            return 0L;
        }
        if ((i14 & 16) != 0) {
            z10 = false;
        }
        return interfaceC7917w2.mo30241f(i10, i11, i12, i13, z10);
    }

    /* JADX INFO: renamed from: a */
    int mo30240a(AbstractC3545l1 abstractC3545l1);

    /* JADX INFO: renamed from: f */
    long mo30241f(int i10, int i11, int i12, int i13, boolean z10);

    /* JADX INFO: renamed from: g */
    InterfaceC3558p0 mo30242g(AbstractC3545l1[] abstractC3545l1Arr, InterfaceC3561q0 interfaceC3561q0, int i10, int[] iArr, int i11, int i12, int[] iArr2, int i13, int i14, int i15);

    /* JADX INFO: renamed from: i */
    void mo30243i(int i10, int[] iArr, int[] iArr2, InterfaceC3561q0 interfaceC3561q0);

    /* JADX INFO: renamed from: j */
    int mo30244j(AbstractC3545l1 abstractC3545l1);
}
