package p319w2;

import java.util.List;
import p104h3.C2858k;
import p104h3.EnumC2856i;
import p215oc.C5725t;
import p250r1.C6457g;
import p265s1.AbstractC7078g1;
import p265s1.C7080g3;
import p265s1.C7128q1;
import p265s1.InterfaceC7088i1;
import p265s1.InterfaceC7144t2;
import p290u1.AbstractC8488g;
import p290u1.InterfaceC8487f;

/* JADX INFO: renamed from: w2.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC9143v {
    /* JADX INFO: renamed from: F */
    static /* synthetic */ void m35534F(InterfaceC9143v interfaceC9143v, InterfaceC7088i1 interfaceC7088i1, AbstractC7078g1 abstractC7078g1, float f10, C7080g3 c7080g3, C2858k c2858k, AbstractC8488g abstractC8488g, int i10, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: paint-hn5TExg");
            return;
        }
        if ((i11 & 4) != 0) {
            f10 = Float.NaN;
        }
        interfaceC9143v.mo35072D(interfaceC7088i1, abstractC7078g1, f10, (i11 & 8) != 0 ? null : c7080g3, (i11 & 16) != 0 ? null : c2858k, (i11 & 32) != 0 ? null : abstractC8488g, (i11 & 64) != 0 ? InterfaceC8487f.f28340p.m32661a() : i10);
    }

    /* JADX INFO: renamed from: j */
    static /* synthetic */ void m35535j(InterfaceC9143v interfaceC9143v, InterfaceC7088i1 interfaceC7088i1, long j10, C7080g3 c7080g3, C2858k c2858k, AbstractC8488g abstractC8488g, int i10, int i11, Object obj) {
        if (obj == null) {
            interfaceC9143v.mo35092n(interfaceC7088i1, (i11 & 2) != 0 ? C7128q1.f23644b.m28147h() : j10, (i11 & 4) != 0 ? null : c7080g3, (i11 & 8) != 0 ? null : c2858k, (i11 & 16) == 0 ? abstractC8488g : null, (i11 & 32) != 0 ? InterfaceC8487f.f28340p.m32661a() : i10);
        } else {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: paint-LG529CI");
        }
    }

    /* JADX INFO: renamed from: A */
    boolean mo35069A();

    /* JADX INFO: renamed from: B */
    int mo35070B(float f10);

    /* JADX INFO: renamed from: C */
    InterfaceC7144t2 mo35071C(int i10, int i11);

    /* JADX INFO: renamed from: D */
    void mo35072D(InterfaceC7088i1 interfaceC7088i1, AbstractC7078g1 abstractC7078g1, float f10, C7080g3 c7080g3, C2858k c2858k, AbstractC8488g abstractC8488g, int i10);

    /* JADX INFO: renamed from: E */
    float mo35073E(int i10, boolean z10);

    /* JADX INFO: renamed from: a */
    float mo35080a();

    /* JADX INFO: renamed from: b */
    float mo35081b();

    /* JADX INFO: renamed from: c */
    C6457g mo35082c(int i10);

    /* JADX INFO: renamed from: d */
    float mo35083d(int i10);

    /* JADX INFO: renamed from: e */
    float mo35084e();

    /* JADX INFO: renamed from: f */
    float mo35085f(int i10);

    /* JADX INFO: renamed from: g */
    float mo35086g();

    /* JADX INFO: renamed from: h */
    float mo35087h(int i10);

    /* JADX INFO: renamed from: i */
    long mo35088i(C6457g c6457g, int i10, InterfaceC9112o3 interfaceC9112o3);

    /* JADX INFO: renamed from: k */
    void mo35089k(long j10, float[] fArr, int i10);

    /* JADX INFO: renamed from: l */
    EnumC2856i mo35090l(int i10);

    /* JADX INFO: renamed from: m */
    float mo35091m(int i10);

    /* JADX INFO: renamed from: n */
    void mo35092n(InterfaceC7088i1 interfaceC7088i1, long j10, C7080g3 c7080g3, C2858k c2858k, AbstractC8488g abstractC8488g, int i10);

    /* JADX INFO: renamed from: o */
    float mo35093o();

    /* JADX INFO: renamed from: p */
    C6457g mo35094p(int i10);

    /* JADX INFO: renamed from: q */
    long mo35095q(int i10);

    /* JADX INFO: renamed from: r */
    int mo35096r(int i10);

    /* JADX INFO: renamed from: s */
    float mo35097s();

    /* JADX INFO: renamed from: t */
    EnumC2856i mo35098t(int i10);

    /* JADX INFO: renamed from: u */
    float mo35099u(int i10);

    /* JADX INFO: renamed from: v */
    int mo35100v(long j10);

    /* JADX INFO: renamed from: w */
    List mo35101w();

    /* JADX INFO: renamed from: x */
    int mo35102x(int i10);

    /* JADX INFO: renamed from: y */
    int mo35103y(int i10, boolean z10);

    /* JADX INFO: renamed from: z */
    int mo35104z();
}
