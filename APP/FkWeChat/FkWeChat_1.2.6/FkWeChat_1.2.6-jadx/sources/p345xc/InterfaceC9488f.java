package p345xc;

import bd.AbstractC1109b;
import p300uc.InterfaceC8662p;
import p329wc.InterfaceC9218f;

/* JADX INFO: renamed from: xc.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC9488f {
    /* JADX INFO: renamed from: A */
    void mo630A(long j10);

    /* JADX INFO: renamed from: C */
    default InterfaceC9486d mo36965C(InterfaceC9218f interfaceC9218f, int i10) {
        interfaceC9218f.getClass();
        return mo637c(interfaceC9218f);
    }

    /* JADX INFO: renamed from: F */
    void mo631F(String str);

    /* JADX INFO: renamed from: G */
    default void mo632G(InterfaceC8662p interfaceC8662p, Object obj) {
        interfaceC8662p.getClass();
        interfaceC8662p.mo15954b(this, obj);
    }

    /* JADX INFO: renamed from: a */
    AbstractC1109b mo635a();

    /* JADX INFO: renamed from: c */
    InterfaceC9486d mo637c(InterfaceC9218f interfaceC9218f);

    /* JADX INFO: renamed from: f */
    void mo640f();

    /* JADX INFO: renamed from: h */
    void mo641h(double d10);

    /* JADX INFO: renamed from: i */
    void mo642i(short s10);

    /* JADX INFO: renamed from: j */
    void mo643j(byte b10);

    /* JADX INFO: renamed from: k */
    void mo644k(boolean z10);

    /* JADX INFO: renamed from: m */
    InterfaceC9488f mo645m(InterfaceC9218f interfaceC9218f);

    /* JADX INFO: renamed from: p */
    void mo647p(float f10);

    /* JADX INFO: renamed from: r */
    void mo648r(char c10);

    /* JADX INFO: renamed from: s */
    void mo649s(InterfaceC9218f interfaceC9218f, int i10);

    /* JADX INFO: renamed from: w */
    default void mo36975w(InterfaceC8662p interfaceC8662p, Object obj) {
        interfaceC8662p.getClass();
        if (interfaceC8662p.mo15953a().mo35889c()) {
            mo632G(interfaceC8662p, obj);
        } else if (obj == null) {
            mo640f();
        } else {
            mo741v();
            mo632G(interfaceC8662p, obj);
        }
    }

    /* JADX INFO: renamed from: z */
    void mo650z(int i10);

    /* JADX INFO: renamed from: v */
    default void mo741v() {
    }
}
