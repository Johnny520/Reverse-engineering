package bsh.classpath;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BshClassPath$UnqualifiedNameTable extends HashMap<String, C2608> {
    private static final long serialVersionUID = 1;

    public void add(String str) {
        String strM5103 = C2609.m5103(str);
        String str2 = (strM5103.indexOf(46) == -1 ? new String[]{"<unpackaged>", strM5103} : C2609.f7806.split(strM5103))[1];
        if (super.containsKey(str2)) {
            ((C2608) super.get(str2)).f7801.add(str);
            return;
        }
        C2608 c2608 = new C2608();
        ArrayList arrayList = new ArrayList();
        c2608.f7801 = arrayList;
        arrayList.add(str);
        super.put(str2, c2608);
    }
}
