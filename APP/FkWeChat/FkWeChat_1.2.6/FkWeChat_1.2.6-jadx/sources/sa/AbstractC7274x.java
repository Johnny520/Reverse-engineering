package sa;

import java.util.Collection;
import java.util.Iterator;
import p229p9.AbstractC6040t;
import p229p9.InterfaceC5986b;

/* JADX INFO: renamed from: sa.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7274x {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC5986b m28852a(Collection collection) {
        Integer numM24075d;
        collection.getClass();
        collection.isEmpty();
        Iterator it = collection.iterator();
        InterfaceC5986b interfaceC5986b = null;
        while (it.hasNext()) {
            InterfaceC5986b interfaceC5986b2 = (InterfaceC5986b) it.next();
            if (interfaceC5986b == null || ((numM24075d = AbstractC6040t.m24075d(interfaceC5986b.mo5587g(), interfaceC5986b2.mo5587g())) != null && numM24075d.intValue() < 0)) {
                interfaceC5986b = interfaceC5986b2;
            }
        }
        interfaceC5986b.getClass();
        return interfaceC5986b;
    }
}
