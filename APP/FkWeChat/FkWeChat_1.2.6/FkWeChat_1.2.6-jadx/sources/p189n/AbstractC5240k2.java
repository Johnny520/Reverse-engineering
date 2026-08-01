package p189n;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0506h3;
import androidx.compose.runtime.AbstractC0552o0;
import androidx.compose.runtime.InterfaceC0531l0;
import androidx.compose.runtime.InterfaceC0572r;
import p010a9.InterfaceC0184l;

/* JADX INFO: renamed from: n.k2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5240k2 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0506h3 f16122a = AbstractC0552o0.m1979g(new InterfaceC0184l() { // from class: n.j2
        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public final Object mo27m(Object obj) {
            return AbstractC5240k2.m21464a((InterfaceC0531l0) obj);
        }
    });

    /* JADX INFO: renamed from: a */
    public static InterfaceC5230i2 m21464a(InterfaceC0531l0 interfaceC0531l0) {
        return AbstractC5212f.m21385b(interfaceC0531l0);
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC0506h3 m21465b() {
        return f16122a;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC5225h2 m21466c(InterfaceC0572r interfaceC0572r, int i10) {
        interfaceC0572r.mo2163V(282942128);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(282942128, i10, -1, "androidx.compose.foundation.rememberOverscrollEffect (Overscroll.kt:343)");
        }
        InterfaceC5230i2 interfaceC5230i2 = (InterfaceC5230i2) interfaceC0572r.mo2142A(f16122a);
        if (interfaceC5230i2 == null) {
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
            interfaceC0572r.mo2152K();
            return null;
        }
        boolean zMo2162U = interfaceC0572r.mo2162U(interfaceC5230i2);
        Object objMo2170f = interfaceC0572r.mo2170f();
        if (zMo2162U || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
            objMo2170f = interfaceC5230i2.mo21379a();
            interfaceC0572r.mo2153L(objMo2170f);
        }
        InterfaceC5225h2 interfaceC5225h2 = (InterfaceC5225h2) objMo2170f;
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        interfaceC0572r.mo2152K();
        return interfaceC5225h2;
    }
}
