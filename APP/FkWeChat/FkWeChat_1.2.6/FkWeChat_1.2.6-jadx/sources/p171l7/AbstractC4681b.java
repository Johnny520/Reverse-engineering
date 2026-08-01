package p171l7;

import java.util.Iterator;
import p034c7.AbstractC1377m;
import p034c7.C1353a;
import p210o7.AbstractC5653e;
import p210o7.InterfaceC5652d;
import p282t7.C8174a;
import p282t7.InterfaceC8176b;

/* JADX INFO: renamed from: l7.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4681b {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC4682c m18699a(C1353a c1353a) {
        InterfaceC4682c interfaceC4682c;
        c1353a.getClass();
        Iterator it = AbstractC1377m.m5436e(c1353a).mo31831b().iterator();
        do {
            interfaceC4682c = null;
            if (!it.hasNext()) {
                break;
            }
            C8174a c8174a = (C8174a) it.next();
            InterfaceC8176b interfaceC8176bM5436e = AbstractC1377m.m5436e(c1353a);
            c8174a.getClass();
            Object objMo31832c = interfaceC8176bM5436e.mo31832c(c8174a);
            if (objMo31832c instanceof InterfaceC4682c) {
                interfaceC4682c = (InterfaceC4682c) objMo31832c;
            }
        } while (interfaceC4682c == null);
        return interfaceC4682c == null ? C4680a.f13886a : interfaceC4682c;
    }

    /* JADX INFO: renamed from: b */
    public static final String m18700b(InterfaceC5652d interfaceC5652d) {
        interfaceC5652d.getClass();
        return AbstractC5653e.m22858c(interfaceC5652d).m31698i() + " - " + AbstractC5653e.m22862g(interfaceC5652d);
    }
}
