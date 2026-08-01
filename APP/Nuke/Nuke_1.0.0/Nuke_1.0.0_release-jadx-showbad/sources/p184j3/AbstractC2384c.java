package p184j3;

import com.bumptech.glide.AbstractC1923e;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p079P2.EnumC1152a;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1678w;
import p121Y1.C1753n;
import p190k3.AbstractC2453a;

/* JADX INFO: renamed from: j3.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2384c {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC1046d[] f7729a = new InterfaceC1046d[0];

    /* JADX INFO: renamed from: b */
    public static final C1753n f7730b = new C1753n(10, "NULL");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final Object m4236a(InterfaceC1051i interfaceC1051i, Object obj, Object obj2, InterfaceC1603e interfaceC1603e, InterfaceC1046d interfaceC1046d) {
        Object objMo0g;
        Object objM4384l = AbstractC2453a.m4384l(interfaceC1051i, obj2);
        try {
            C2401t c2401t = new C2401t(interfaceC1046d, interfaceC1051i);
            if (interfaceC1603e == null) {
                objMo0g = AbstractC1923e.m3462V(interfaceC1603e, obj, c2401t);
            } else {
                AbstractC1678w.m2998b(2, interfaceC1603e);
                objMo0g = interfaceC1603e.mo0g(obj, c2401t);
            }
            AbstractC2453a.m4379g(interfaceC1051i, objM4384l);
            if (objMo0g == EnumC1152a.f3788d) {
                AbstractC1665j.m2985e(interfaceC1046d, "frame");
            }
            return objMo0g;
        } catch (Throwable th) {
            AbstractC2453a.m4379g(interfaceC1051i, objM4384l);
            throw th;
        }
    }
}
