package defpackage;

import com.dokar.quickjs.QuickJs;
import com.dokar.quickjs.binding.JsFunction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zc0 implements es1 {
    public final fs1 a;
    public final QuickJs b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final ArrayList e;
    public final ArrayList f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zc0(fs1 fs1Var, QuickJs quickJs) {
        fs1Var.getClass();
        this.a = fs1Var;
        this.b = quickJs;
        ArrayList arrayList = fs1Var.b;
        int iU = xe1.U(eu.B(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iU < 16 ? 16 : iU);
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            c80.g();
            throw null;
        }
        this.c = linkedHashMap;
        ArrayList arrayList2 = fs1Var.c;
        int iU2 = xe1.U(eu.B(arrayList2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iU2 >= 16 ? iU2 : 16);
        for (Object obj : arrayList2) {
            linkedHashMap2.put(((yc0) obj).a, obj);
        }
        this.d = linkedHashMap2;
        ArrayList arrayList3 = this.a.b;
        ArrayList arrayList4 = new ArrayList(eu.B(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            c80.g();
            throw null;
        }
        this.e = arrayList4;
        ArrayList<yc0> arrayList5 = this.a.c;
        ArrayList arrayList6 = new ArrayList(eu.B(arrayList5, 10));
        for (yc0 yc0Var : arrayList5) {
            arrayList6.add(new JsFunction(yc0Var.a, yc0Var.b instanceof ug));
        }
        this.f = arrayList6;
    }
}
