package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: l2 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0409l2 implements w41 {
    @Override // p000.w41
    /* JADX INFO: renamed from: a */
    public Object mo165a(y40 y40Var) {
        return m2784j(y40Var);
    }

    /* JADX INFO: renamed from: f */
    public abstract Object mo771f();

    /* JADX INFO: renamed from: g */
    public abstract int mo772g(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract Iterator mo773h(Object obj);

    /* JADX INFO: renamed from: i */
    public abstract int mo572i(Object obj);

    /* JADX INFO: renamed from: j */
    public final Object m2784j(y40 y40Var) {
        Object objMo771f = mo771f();
        int iMo772g = mo772g(objMo771f);
        InterfaceC0826vx interfaceC0826vxMo895b = y40Var.mo895b(mo168e());
        while (true) {
            int iMo901j = interfaceC0826vxMo895b.mo901j(mo168e());
            if (iMo901j == -1) {
                interfaceC0826vxMo895b.mo894a(mo168e());
                return mo774m(objMo771f);
            }
            mo278k(interfaceC0826vxMo895b, iMo901j + iMo772g, objMo771f);
        }
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo278k(InterfaceC0826vx interfaceC0826vx, int i, Object obj);

    /* JADX INFO: renamed from: l */
    public abstract Object mo573l(Object obj);

    /* JADX INFO: renamed from: m */
    public abstract Object mo774m(Object obj);
}
