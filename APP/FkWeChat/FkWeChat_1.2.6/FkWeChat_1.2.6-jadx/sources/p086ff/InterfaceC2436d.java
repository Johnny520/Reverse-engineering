package p086ff;

import gf.EnumC2795d;
import p147jf.C3859a;
import p147jf.C3862d;
import p147jf.InterfaceC3860b;

/* JADX INFO: renamed from: ff.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2436d {
    /* JADX INFO: renamed from: A */
    void mo8797A(String str);

    /* JADX INFO: renamed from: B */
    void mo8798B(String str, Object... objArr);

    /* JADX INFO: renamed from: C */
    void mo8799C(InterfaceC2440h interfaceC2440h, String str, Throwable th);

    /* JADX INFO: renamed from: D */
    void mo8800D(InterfaceC2440h interfaceC2440h, String str, Throwable th);

    /* JADX INFO: renamed from: E */
    boolean mo8801E(InterfaceC2440h interfaceC2440h);

    /* JADX INFO: renamed from: F */
    void mo8802F(InterfaceC2440h interfaceC2440h, String str, Throwable th);

    /* JADX INFO: renamed from: a */
    boolean mo8803a();

    /* JADX INFO: renamed from: b */
    boolean mo8804b();

    /* JADX INFO: renamed from: c */
    boolean mo8805c(InterfaceC2440h interfaceC2440h);

    /* JADX INFO: renamed from: d */
    boolean mo8806d(InterfaceC2440h interfaceC2440h);

    /* JADX INFO: renamed from: e */
    default InterfaceC3860b mo8807e(EnumC2795d enumC2795d) {
        return new C3859a(this, enumC2795d);
    }

    /* JADX INFO: renamed from: f */
    void mo8808f(String str, Throwable th);

    /* JADX INFO: renamed from: g */
    default boolean mo8809g(EnumC2795d enumC2795d) {
        int iM9961c = enumC2795d.m9961c();
        if (iM9961c == 0) {
            return mo8816n();
        }
        if (iM9961c == 10) {
            return mo8804b();
        }
        if (iM9961c == 20) {
            return mo8813k();
        }
        if (iM9961c == 30) {
            return mo8803a();
        }
        if (iM9961c == 40) {
            return mo8810h();
        }
        C2435c.m8796a("Level [", enumC2795d, "] not recognized.");
        return false;
    }

    /* JADX INFO: renamed from: h */
    boolean mo8810h();

    /* JADX INFO: renamed from: i */
    boolean mo8811i(InterfaceC2440h interfaceC2440h);

    /* JADX INFO: renamed from: j */
    void mo8812j(String str, Object... objArr);

    /* JADX INFO: renamed from: k */
    boolean mo8813k();

    /* JADX INFO: renamed from: l */
    boolean mo8814l(InterfaceC2440h interfaceC2440h);

    /* JADX INFO: renamed from: m */
    void mo8815m(String str);

    /* JADX INFO: renamed from: n */
    boolean mo8816n();

    /* JADX INFO: renamed from: o */
    void mo8817o(String str, Object... objArr);

    /* JADX INFO: renamed from: p */
    void mo8818p(InterfaceC2440h interfaceC2440h, String str, Throwable th);

    /* JADX INFO: renamed from: q */
    void mo8819q(InterfaceC2440h interfaceC2440h, String str, Throwable th);

    /* JADX INFO: renamed from: r */
    void mo8820r(String str, Object obj);

    /* JADX INFO: renamed from: s */
    void mo8821s(String str, Object... objArr);

    /* JADX INFO: renamed from: t */
    void mo8822t(String str, Throwable th);

    /* JADX INFO: renamed from: u */
    void mo8823u(String str, Throwable th);

    /* JADX INFO: renamed from: v */
    default InterfaceC3860b mo8824v(EnumC2795d enumC2795d) {
        return mo8809g(enumC2795d) ? mo8807e(enumC2795d) : C3862d.m15309f();
    }

    /* JADX INFO: renamed from: w */
    void mo8825w(String str, Throwable th);

    /* JADX INFO: renamed from: x */
    void mo8826x(String str);

    /* JADX INFO: renamed from: y */
    void mo8827y(String str);

    /* JADX INFO: renamed from: z */
    void mo8828z(String str, Object... objArr);
}
