package defpackage;

import com.dokar.quickjs.QuickJsException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z53 {
    public final ArrayList a = new ArrayList();
    public final LinkedHashMap b = new LinkedHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(Object obj, h63 h63Var, h63 h63Var2) throws QuickJsException {
        if (h63Var.equals(h63Var2)) {
            return;
        }
        ArrayList arrayList = this.a;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            c80.g();
            return;
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            c80.g();
            return;
        }
        throw new QuickJsException("No such type converter to convert '" + h63Var + "' to '" + h63Var2 + "'");
    }
}
