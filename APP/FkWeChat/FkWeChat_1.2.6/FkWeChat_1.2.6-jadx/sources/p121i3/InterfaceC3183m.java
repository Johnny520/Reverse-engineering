package p121i3;

import p136j3.C3591b;
import p136j3.InterfaceC3590a;

/* JADX INFO: renamed from: i3.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3183m {
    /* JADX INFO: renamed from: a0 */
    default long mo1229a0(float f10) {
        C3591b c3591b = C3591b.f9979a;
        if (!c3591b.m13440f(mo1231c1())) {
            return AbstractC3194x.m12113e(f10 / mo1231c1());
        }
        InterfaceC3590a interfaceC3590aM13436b = c3591b.m13436b(mo1231c1());
        return AbstractC3194x.m12113e(interfaceC3590aM13436b != null ? interfaceC3590aM13436b.mo12094a(f10) : f10 / mo1231c1());
    }

    /* JADX INFO: renamed from: c1 */
    float mo1231c1();

    /* JADX INFO: renamed from: m0 */
    default float mo1234m0(long j10) {
        if (!C3195y.m12123g(C3193w.m12102g(j10), C3195y.f8493b.m12128b())) {
            AbstractC3184n.m12040b("Only Sp can convert to Px");
        }
        C3591b c3591b = C3591b.f9979a;
        if (!c3591b.m13440f(mo1231c1())) {
            return C3179i.m12003k(C3193w.m12103h(j10) * mo1231c1());
        }
        InterfaceC3590a interfaceC3590aM13436b = c3591b.m13436b(mo1231c1());
        float fM12103h = C3193w.m12103h(j10);
        return interfaceC3590aM13436b == null ? C3179i.m12003k(fM12103h * mo1231c1()) : C3179i.m12003k(interfaceC3590aM13436b.mo12095b(fM12103h));
    }
}
