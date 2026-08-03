package nf;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;

/* JADX INFO: renamed from: nf.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3001c implements Closeable {

    /* JADX INFO: renamed from: j */
    public static final InterfaceC2844b f9777j = AbstractC2846d.m6274b(C3001c.class);

    /* JADX INFO: renamed from: g */
    public final InterfaceC3000b f9778g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f9779h;

    /* JADX INFO: renamed from: i */
    public final HashMap f9780i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3001c(InterfaceC3000b interfaceC3000b, ArrayList arrayList) {
        this.f9778g = interfaceC3000b;
        this.f9779h = arrayList;
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC2999a interfaceC2999a = (InterfaceC2999a) it.next();
            String name = interfaceC2999a.getName();
            if (((InterfaceC2999a) map.put(name, interfaceC2999a)) != null) {
                f9777j.mo6265s(name, "Found duplicate entry: {} in {}", interfaceC3000b);
            }
        }
        this.f9780i = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9778g.close();
    }
}
