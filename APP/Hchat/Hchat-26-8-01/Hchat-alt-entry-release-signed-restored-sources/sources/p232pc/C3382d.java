package p232pc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import nc.C2959b;
import p214oc.AbstractC3127d;
import p214oc.C3126c;
import p214oc.InterfaceC3124a;

/* JADX INFO: renamed from: pc.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3382d extends AbstractC3127d {

    /* JADX INFO: renamed from: g */
    public final HashMap f10916g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3382d(HashMap map) {
        this.f10916g = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C3382d m7166b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2959b c2959b = (C2959b) it.next();
            if (c2959b.f9706a != 3) {
                map.put(c2959b.f9707b, c2959b);
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return new C3382d(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC3124a mo441a() {
        return C3126c.f10128a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f10916g.toString();
    }
}
