package p110h9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p098g9.InterfaceC2549c;
import p098g9.InterfaceC2552f;
import p142j9.C3761y0;

/* JADX INFO: renamed from: h9.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2902d {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC2549c m10549a(InterfaceC2549c interfaceC2549c) {
        Object next;
        interfaceC2549c.getClass();
        Iterator it = interfaceC2549c.mo3793v().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            InterfaceC2549c interfaceC2549c2 = (InterfaceC2549c) next;
            interfaceC2549c2.getClass();
            if (((C3761y0) interfaceC2549c2).mo13900a().mo5568D()) {
                break;
            }
        }
        return (InterfaceC2549c) next;
    }

    /* JADX INFO: renamed from: b */
    public static final Collection m10550b(InterfaceC2549c interfaceC2549c) {
        interfaceC2549c.getClass();
        Collection collectionMo3776t = interfaceC2549c.mo3776t();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionMo3776t) {
            if (obj instanceof InterfaceC2552f) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
