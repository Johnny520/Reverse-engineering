package bsh.classpath;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BshClassPath$UnqualifiedNameTable extends HashMap<String, C3442> {
    private static final long serialVersionUID = 1;

    public void add(String str) {
        String strM5708 = C3443.m5708(str);
        String str2 = (strM5708.indexOf(46) == -1 ? new String[]{"<unpackaged>", strM5708} : C3443.f8153.split(strM5708))[1];
        if (super.containsKey(str2)) {
            ((C3442) super.get(str2)).f8148.add(str);
            return;
        }
        C3442 c3442 = new C3442();
        ArrayList arrayList = new ArrayList();
        c3442.f8148 = arrayList;
        arrayList.add(str);
        super.put(str2, c3442);
    }
}
