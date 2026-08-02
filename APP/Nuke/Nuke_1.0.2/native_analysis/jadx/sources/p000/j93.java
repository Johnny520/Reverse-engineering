package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j93 {
    /* JADX INFO: renamed from: a */
    public static String m2472a(Object obj) {
        Class cls;
        if (obj instanceof j93) {
            return "VagueType";
        }
        cls = j93.class;
        if (obj instanceof Class) {
            Class<j93> clsM3691A = p40.m3691A(d72.m967a(cls));
            return !obj.equals(clsM3691A != null ? clsM3691A : j93.class) ? ((Class) obj).toString() : "VagueType";
        }
        if (obj instanceof C0067bt) {
            return !obj.equals(d72.m967a(cls)) ? obj.toString() : "VagueType";
        }
        if (!(obj instanceof Collection)) {
            return obj.toString();
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(AbstractC0179eu.m1421B(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            arrayList.add(next != null ? m2472a(next) : null);
        }
        return arrayList.toString();
    }
}
