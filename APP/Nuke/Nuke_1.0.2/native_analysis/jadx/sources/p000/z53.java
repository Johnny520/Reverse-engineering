package p000;

import com.dokar.quickjs.QuickJsException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z53 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f13736a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f13737b = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m6384a(Object obj, h63 h63Var, h63 h63Var2) throws QuickJsException {
        if (h63Var.equals(h63Var2)) {
            return;
        }
        ArrayList arrayList = this.f13736a;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            c80.m664g();
            return;
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            c80.m664g();
            return;
        }
        throw new QuickJsException("No such type converter to convert '" + h63Var + "' to '" + h63Var2 + "'");
    }
}
