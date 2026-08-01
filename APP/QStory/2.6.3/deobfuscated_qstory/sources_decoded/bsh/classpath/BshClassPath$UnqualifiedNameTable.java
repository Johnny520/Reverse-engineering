package bsh.classpath;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BshClassPath$UnqualifiedNameTable extends HashMap<String, C2609> {
    private static final long serialVersionUID = 1;

    public void add(String str) {
        String strM5148 = C2610.m5148(str);
        String str2 = (strM5148.indexOf(46) == -1 ? new String[]{"<unpackaged>", strM5148} : C2610.f7808.split(strM5148))[1];
        if (super.containsKey(str2)) {
            ((C2609) super.get(str2)).f7803.add(str);
            return;
        }
        C2609 c2609 = new C2609();
        ArrayList arrayList = new ArrayList();
        c2609.f7803 = arrayList;
        arrayList.add(str);
        super.put(str2, c2609);
    }
}
