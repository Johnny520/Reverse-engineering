package p290u1;

import p215oc.C5725t;
import p265s1.AbstractC7123p1;
import p265s1.InterfaceC7144t2;

/* JADX INFO: renamed from: u1.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8489h {
    /* JADX INFO: renamed from: e */
    static /* synthetic */ void m32663e(InterfaceC8489h interfaceC8489h, InterfaceC7144t2 interfaceC7144t2, int i10, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
            return;
        }
        if ((i11 & 2) != 0) {
            i10 = AbstractC7123p1.f23633a.m28085b();
        }
        interfaceC8489h.mo32639b(interfaceC7144t2, i10);
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ void m32664f(InterfaceC8489h interfaceC8489h, float f10, float f11, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: translate");
            return;
        }
        if ((i10 & 1) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 2) != 0) {
            f11 = 0.0f;
        }
        interfaceC8489h.mo32641d(f10, f11);
    }

    /* JADX INFO: renamed from: a */
    void mo32638a(float[] fArr);

    /* JADX INFO: renamed from: b */
    void mo32639b(InterfaceC7144t2 interfaceC7144t2, int i10);

    /* JADX INFO: renamed from: c */
    void mo32640c(float f10, float f11, float f12, float f13, int i10);

    /* JADX INFO: renamed from: d */
    void mo32641d(float f10, float f11);

    /* JADX INFO: renamed from: g */
    void mo32642g(float f10, float f11, long j10);

    /* JADX INFO: renamed from: h */
    void mo32643h(float f10, float f11, float f12, float f13);

    /* JADX INFO: renamed from: i */
    void mo32644i(float f10, long j10);
}
