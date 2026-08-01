package p145jc;

import ec.AbstractC2157m0;
import ec.InterfaceC2153l0;
import java.util.Iterator;
import p172l8.AbstractC4693f;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: jc.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3804f {
    /* JADX INFO: renamed from: a */
    public static final void m15160a(InterfaceC5980j interfaceC5980j, Throwable th) {
        Iterator it = AbstractC3802e.m15150a().iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC2153l0) it.next()).mo167j0(interfaceC5980j, th);
            } catch (Throwable th2) {
                AbstractC3802e.m15151b(AbstractC2157m0.m7840b(th, th2));
            }
        }
        try {
            AbstractC4693f.m18753a(th, new C3806g(interfaceC5980j));
        } catch (Throwable unused) {
        }
        AbstractC3802e.m15151b(th);
    }
}
