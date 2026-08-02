package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kb3 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f5447a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m2626a() {
        LinkedHashMap linkedHashMap = this.f5447a;
        Map mapM5881v0 = we1.m5881v0(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = mapM5881v0.values().iterator();
        while (it.hasNext()) {
            ((fb3) it.next()).m1595a();
        }
    }

    public final String toString() {
        String strM591c = d72.m967a(kb3.class).m591c();
        if (strM591c == null) {
            strM591c = "ViewModelStore";
        }
        int iHashCode = hashCode();
        xe1.m6127j(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return strM591c + "@" + string + "(keys=" + AbstractC0142du.m1153K0(this.f5447a.keySet()) + ")";
    }
}
