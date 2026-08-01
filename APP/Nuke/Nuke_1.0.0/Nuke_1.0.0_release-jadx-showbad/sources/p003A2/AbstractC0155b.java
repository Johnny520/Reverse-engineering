package p003A2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p061L2.AbstractC0974n;
import p117X2.AbstractC1676u;
import p127Z2.AbstractC1784a;
import p137b3.InterfaceC1854b;

/* JADX INFO: renamed from: A2.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0155b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m227a(Object obj) {
        Class cls;
        if (obj instanceof AbstractC0155b) {
            return "VagueType";
        }
        cls = AbstractC0155b.class;
        if (obj instanceof Class) {
            Class<AbstractC0155b> clsM3240z = AbstractC1784a.m3240z(AbstractC1676u.m2995a(cls));
            return !obj.equals(clsM3240z != null ? clsM3240z : AbstractC0155b.class) ? ((Class) obj).toString() : "VagueType";
        }
        if (obj instanceof InterfaceC1854b) {
            return !obj.equals(AbstractC1676u.m2995a(cls)) ? obj.toString() : "VagueType";
        }
        if (!(obj instanceof Collection)) {
            return obj.toString();
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(AbstractC0974n.m2029K(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            arrayList.add(next != null ? m227a(next) : null);
        }
        return arrayList.toString();
    }
}
