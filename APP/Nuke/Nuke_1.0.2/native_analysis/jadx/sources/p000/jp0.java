package p000;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jp0 {

    /* JADX INFO: renamed from: a */
    public static final C0093cj f5138a;

    /* JADX INFO: renamed from: b */
    public static final hx2 f5139b;

    static {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        xw0 xw0Var = new xw0();
        xw0Var.m6196e(null, "https://api.github.com/");
        yw0 yw0VarM6193b = xw0Var.m6193b();
        if (!"".equals(yw0VarM6193b.f13646f.get(r3.size() - 1))) {
            C0676s.m4648g("baseUrl must end in /: ", yw0VarM6193b);
            return;
        }
        et1 et1Var = new et1(new dt1());
        ah0 ah0Var = ah0.f199j;
        HashMap map = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        rm0 rm0Var = ir0.f4755h;
        int i = ir0.f4757j;
        int i2 = ir0.f4758k;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList5 = new ArrayList(arrayList4.size() + arrayList3.size() + 3);
        arrayList5.addAll(arrayList3);
        Collections.reverse(arrayList5);
        ArrayList arrayList6 = new ArrayList(arrayList4);
        Collections.reverse(arrayList6);
        arrayList5.addAll(arrayList6);
        boolean z = wt2.f12644a;
        HashMap map2 = new HashMap(map);
        new ArrayList(arrayList3);
        new ArrayList(arrayList4);
        arrayList.add(new jr0(new ir0(ah0Var, 1, map2, false, rm0Var, arrayList5, i, i2, new ArrayList(arrayDeque))));
        ExecutorC0535o9 executorC0535o9 = yz1.f13682a;
        C0160eb c0160eb = yz1.f13684c;
        ArrayList arrayList7 = new ArrayList(arrayList2);
        List listMo1333w = c0160eb.mo1333w(executorC0535o9);
        arrayList7.addAll(listMo1333w);
        List listMo1334x = c0160eb.mo1334x();
        ArrayList arrayList8 = new ArrayList(arrayList.size() + 1 + listMo1334x.size());
        arrayList8.add(new C0740tn(0));
        arrayList8.addAll(arrayList);
        arrayList8.addAll(listMo1334x);
        List listUnmodifiableList = Collections.unmodifiableList(arrayList8);
        List listUnmodifiableList2 = Collections.unmodifiableList(arrayList7);
        listMo1333w.size();
        C0093cj c0093cj = new C0093cj();
        c0093cj.f1579a = new ConcurrentHashMap();
        c0093cj.f1580b = et1Var;
        c0093cj.f1581c = yw0VarM6193b;
        c0093cj.f1582d = listUnmodifiableList;
        c0093cj.f1583e = listUnmodifiableList2;
        f5138a = c0093cj;
        f5139b = new hx2(new C0146dy(11));
    }
}
