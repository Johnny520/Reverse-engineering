package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jp0 {
    public static final cj a;
    public static final hx2 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        xw0 xw0Var = new xw0();
        xw0Var.e(null, "https://api.github.com/");
        yw0 yw0VarB = xw0Var.b();
        if (!"".equals(yw0VarB.f.get(r3.size() - 1))) {
            s.g("baseUrl must end in /: ", yw0VarB);
            return;
        }
        et1 et1Var = new et1(new dt1());
        ah0 ah0Var = ah0.j;
        HashMap map = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        rm0 rm0Var = ir0.h;
        int i = ir0.j;
        int i2 = ir0.k;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList5 = new ArrayList(arrayList4.size() + arrayList3.size() + 3);
        arrayList5.addAll(arrayList3);
        Collections.reverse(arrayList5);
        ArrayList arrayList6 = new ArrayList(arrayList4);
        Collections.reverse(arrayList6);
        arrayList5.addAll(arrayList6);
        boolean z = wt2.a;
        HashMap map2 = new HashMap(map);
        new ArrayList(arrayList3);
        new ArrayList(arrayList4);
        arrayList.add(new jr0(new ir0(ah0Var, 1, map2, false, rm0Var, arrayList5, i, i2, new ArrayList(arrayDeque))));
        o9 o9Var = yz1.a;
        eb ebVar = yz1.c;
        ArrayList arrayList7 = new ArrayList(arrayList2);
        List listW = ebVar.w(o9Var);
        arrayList7.addAll(listW);
        List listX = ebVar.x();
        ArrayList arrayList8 = new ArrayList(arrayList.size() + 1 + listX.size());
        arrayList8.add(new tn(0));
        arrayList8.addAll(arrayList);
        arrayList8.addAll(listX);
        List listUnmodifiableList = Collections.unmodifiableList(arrayList8);
        List listUnmodifiableList2 = Collections.unmodifiableList(arrayList7);
        listW.size();
        cj cjVar = new cj();
        cjVar.a = new ConcurrentHashMap();
        cjVar.b = et1Var;
        cjVar.c = yw0VarB;
        cjVar.d = listUnmodifiableList;
        cjVar.e = listUnmodifiableList2;
        a = cjVar;
        b = new hx2(new dy(11));
    }
}
