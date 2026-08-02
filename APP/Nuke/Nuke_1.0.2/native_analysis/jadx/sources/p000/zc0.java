package p000;

import com.dokar.quickjs.QuickJs;
import com.dokar.quickjs.binding.JsFunction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zc0 implements es1 {

    /* JADX INFO: renamed from: a */
    public final fs1 f13828a;

    /* JADX INFO: renamed from: b */
    public final QuickJs f13829b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f13830c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f13831d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f13832e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f13833f;

    public zc0(fs1 fs1Var, QuickJs quickJs) {
        fs1Var.getClass();
        this.f13828a = fs1Var;
        this.f13829b = quickJs;
        ArrayList arrayList = fs1Var.f3127b;
        int iM6103U = xe1.m6103U(AbstractC0179eu.m1421B(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM6103U < 16 ? 16 : iM6103U);
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            c80.m664g();
            throw null;
        }
        this.f13830c = linkedHashMap;
        ArrayList arrayList2 = fs1Var.f3128c;
        int iM6103U2 = xe1.m6103U(AbstractC0179eu.m1421B(arrayList2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM6103U2 >= 16 ? iM6103U2 : 16);
        for (Object obj : arrayList2) {
            linkedHashMap2.put(((yc0) obj).f13404a, obj);
        }
        this.f13831d = linkedHashMap2;
        ArrayList arrayList3 = this.f13828a.f3127b;
        ArrayList arrayList4 = new ArrayList(AbstractC0179eu.m1421B(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            c80.m664g();
            throw null;
        }
        this.f13832e = arrayList4;
        ArrayList<yc0> arrayList5 = this.f13828a.f3128c;
        ArrayList arrayList6 = new ArrayList(AbstractC0179eu.m1421B(arrayList5, 10));
        for (yc0 yc0Var : arrayList5) {
            arrayList6.add(new JsFunction(yc0Var.f13404a, yc0Var.f13405b instanceof InterfaceC0772ug));
        }
        this.f13833f = arrayList6;
    }
}
