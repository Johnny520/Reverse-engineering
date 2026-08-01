package p145jc;

import ec.AbstractC2135g2;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import sb.AbstractC7291q;
import sb.AbstractC7294t;

/* JADX INFO: renamed from: jc.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3828s {

    /* JADX INFO: renamed from: a */
    public static final C3828s f11019a;

    /* JADX INFO: renamed from: b */
    public static final AbstractC2135g2 f11020b;

    static {
        C3828s c3828s = new C3828s();
        f11019a = c3828s;
        AbstractC3803e0.m15157f("kotlinx.coroutines.fast.service.loader", true);
        f11020b = c3828s.m15257a();
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC2135g2 m15257a() throws Throwable {
        Object next;
        AbstractC2135g2 abstractC2135g2M15262e;
        try {
            List listM28908P = AbstractC7294t.m28908P(AbstractC7291q.m28879g(ServiceLoader.load(InterfaceC3827r.class, InterfaceC3827r.class.getClassLoader()).iterator()));
            Iterator it = listM28908P.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iMo8706c = ((InterfaceC3827r) next).mo8706c();
                    do {
                        Object next2 = it.next();
                        int iMo8706c2 = ((InterfaceC3827r) next2).mo8706c();
                        if (iMo8706c < iMo8706c2) {
                            next = next2;
                            iMo8706c = iMo8706c2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            InterfaceC3827r interfaceC3827r = (InterfaceC3827r) next;
            if (interfaceC3827r != null && (abstractC2135g2M15262e = AbstractC3829t.m15262e(interfaceC3827r, listM28908P)) != null) {
                return abstractC2135g2M15262e;
            }
            AbstractC3829t.m15259b(null, null, 3, null);
            return null;
        } catch (Throwable th) {
            AbstractC3829t.m15259b(th, null, 2, null);
            return null;
        }
    }
}
