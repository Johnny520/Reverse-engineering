package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kb3 {
    public final LinkedHashMap a = new LinkedHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Map mapV0 = we1.v0(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = mapV0.values().iterator();
        while (it.hasNext()) {
            ((fb3) it.next()).a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strC = d72.a(kb3.class).c();
        if (strC == null) {
            strC = "ViewModelStore";
        }
        int iHashCode = hashCode();
        xe1.j(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return strC + "@" + string + "(keys=" + du.K0(this.a.keySet()) + ")";
    }
}
