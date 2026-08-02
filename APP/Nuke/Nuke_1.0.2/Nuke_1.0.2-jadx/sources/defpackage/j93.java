package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j93 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(Object obj) {
        Class cls;
        if (obj instanceof j93) {
            return "VagueType";
        }
        cls = j93.class;
        if (obj instanceof Class) {
            Class<j93> clsA = p40.A(d72.a(cls));
            return !obj.equals(clsA != null ? clsA : j93.class) ? ((Class) obj).toString() : "VagueType";
        }
        if (obj instanceof bt) {
            return !obj.equals(d72.a(cls)) ? obj.toString() : "VagueType";
        }
        if (!(obj instanceof Collection)) {
            return obj.toString();
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(eu.B(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            arrayList.add(next != null ? a(next) : null);
        }
        return arrayList.toString();
    }
}
