package gb;

import p160kb.InterfaceC4227g;
import p160kb.InterfaceC4229i;
import p160kb.InterfaceC4230j;
import p160kb.InterfaceC4233m;
import p160kb.InterfaceC4238r;

/* JADX INFO: renamed from: gb.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2652d {

    /* JADX INFO: renamed from: a */
    public static final C2652d f6966a = new C2652d();

    /* JADX INFO: renamed from: a */
    public final boolean m9351a(InterfaceC4238r interfaceC4238r, InterfaceC4230j interfaceC4230j, InterfaceC4230j interfaceC4230j2) {
        if (interfaceC4238r.mo10939q0(interfaceC4230j) != interfaceC4238r.mo10939q0(interfaceC4230j2) || interfaceC4238r.mo10953y(interfaceC4230j) != interfaceC4238r.mo10953y(interfaceC4230j2) || interfaceC4238r.mo10938q(interfaceC4230j) != interfaceC4238r.mo10938q(interfaceC4230j2) || !interfaceC4238r.mo10923h0(interfaceC4238r.mo10763e(interfaceC4230j), interfaceC4238r.mo10763e(interfaceC4230j2))) {
            return false;
        }
        if (interfaceC4238r.mo10935o0(interfaceC4230j, interfaceC4230j2)) {
            return true;
        }
        int iMo10939q0 = interfaceC4238r.mo10939q0(interfaceC4230j);
        for (int i10 = 0; i10 < iMo10939q0; i10++) {
            InterfaceC4233m interfaceC4233mMo10912W = interfaceC4238r.mo10912W(interfaceC4230j, i10);
            InterfaceC4233m interfaceC4233mMo10912W2 = interfaceC4238r.mo10912W(interfaceC4230j2, i10);
            if (interfaceC4238r.mo10766h(interfaceC4233mMo10912W) != interfaceC4238r.mo10766h(interfaceC4233mMo10912W2)) {
                return false;
            }
            if (!interfaceC4238r.mo10766h(interfaceC4233mMo10912W)) {
                if (interfaceC4238r.mo10904N(interfaceC4233mMo10912W) != interfaceC4238r.mo10904N(interfaceC4233mMo10912W2)) {
                    return false;
                }
                InterfaceC4229i interfaceC4229iMo10903M = interfaceC4238r.mo10903M(interfaceC4233mMo10912W);
                interfaceC4229iMo10903M.getClass();
                InterfaceC4229i interfaceC4229iMo10903M2 = interfaceC4238r.mo10903M(interfaceC4233mMo10912W2);
                interfaceC4229iMo10903M2.getClass();
                if (!m9353c(interfaceC4238r, interfaceC4229iMo10903M, interfaceC4229iMo10903M2)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9352b(InterfaceC4238r interfaceC4238r, InterfaceC4229i interfaceC4229i, InterfaceC4229i interfaceC4229i2) {
        interfaceC4238r.getClass();
        interfaceC4229i.getClass();
        interfaceC4229i2.getClass();
        return m9353c(interfaceC4238r, interfaceC4229i, interfaceC4229i2);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m9353c(InterfaceC4238r interfaceC4238r, InterfaceC4229i interfaceC4229i, InterfaceC4229i interfaceC4229i2) {
        if (interfaceC4229i == interfaceC4229i2) {
            return true;
        }
        InterfaceC4230j interfaceC4230jMo10764f = interfaceC4238r.mo10764f(interfaceC4229i);
        InterfaceC4230j interfaceC4230jMo10764f2 = interfaceC4238r.mo10764f(interfaceC4229i2);
        if (interfaceC4230jMo10764f != null && interfaceC4230jMo10764f2 != null) {
            return m9351a(interfaceC4238r, interfaceC4230jMo10764f, interfaceC4230jMo10764f2);
        }
        InterfaceC4227g interfaceC4227gMo10898J = interfaceC4238r.mo10898J(interfaceC4229i);
        InterfaceC4227g interfaceC4227gMo10898J2 = interfaceC4238r.mo10898J(interfaceC4229i2);
        return interfaceC4227gMo10898J != null && interfaceC4227gMo10898J2 != null && m9351a(interfaceC4238r, interfaceC4238r.mo10759a(interfaceC4227gMo10898J), interfaceC4238r.mo10759a(interfaceC4227gMo10898J2)) && m9351a(interfaceC4238r, interfaceC4238r.mo10760b(interfaceC4227gMo10898J), interfaceC4238r.mo10760b(interfaceC4227gMo10898J2));
    }
}
