package yyds;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛲᛶᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0364 {
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static String m1061(Object obj) {
        Class cls;
        if (obj instanceof AbstractC0364) {
            return "VagueType";
        }
        cls = AbstractC0364.class;
        if (obj instanceof Class) {
            Class<AbstractC0364> clsM1450 = AbstractC0578.m1450(AbstractC1700.m3448(cls));
            return !obj.equals(clsM1450 != null ? clsM1450 : AbstractC0364.class) ? ((Class) obj).toString() : "VagueType";
        }
        if (obj instanceof C2234) {
            return !obj.equals(AbstractC1700.m3448(cls)) ? obj.toString() : "VagueType";
        }
        if (!(obj instanceof Collection)) {
            return obj.toString();
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(AbstractC0055.m419(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            arrayList.add(next != null ? m1061(next) : null);
        }
        return arrayList.toString();
    }
}
