package p272s6;

import gg.AbstractC1426v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import mg.InterfaceC2840b;
import p000a.AbstractC0000a;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: s6.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3931b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m8122a(Object obj) {
        Class cls;
        if (obj instanceof AbstractC3931b) {
            return "VagueType";
        }
        cls = AbstractC3931b.class;
        if (obj instanceof Class) {
            Class<AbstractC3931b> clsM51a0 = AbstractC0000a.m51a0(AbstractC1426v.m3834a(cls));
            return !obj.equals(clsM51a0 != null ? clsM51a0 : AbstractC3931b.class) ? ((Class) obj).toString() : "VagueType";
        }
        if (obj instanceof InterfaceC2840b) {
            return !obj.equals(AbstractC1426v.m3834a(cls)) ? obj.toString() : "VagueType";
        }
        if (!(obj instanceof Collection)) {
            return obj.toString();
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(iterable));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            arrayList.add(next != null ? m8122a(next) : null);
        }
        return arrayList.toString();
    }
}
