package p000;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ns1 extends q43 {

    /* JADX INFO: renamed from: c */
    public static final ms1 f7309c = new ms1(1);

    /* JADX INFO: renamed from: a */
    public final ir0 f7310a;

    /* JADX INFO: renamed from: b */
    public final int f7311b;

    public ns1(ir0 ir0Var, int i) {
        this.f7310a = ir0Var;
        this.f7311b = i;
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: b */
    public final Object mo97b(l41 l41Var) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int iM2814I = l41Var.m2814I();
        int iM5702u = vi0.m5702u(iM2814I);
        if (iM5702u == 0) {
            l41Var.m2824b();
            arrayList = new ArrayList();
        } else if (iM5702u != 2) {
            arrayList = null;
        } else {
            l41Var.m2825c();
            arrayList = new mb1(true);
        }
        if (arrayList == null) {
            return m3360d(iM2814I, l41Var);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (l41Var.m2832p()) {
                String strM2808B = arrayList instanceof Map ? l41Var.m2808B() : null;
                int iM2814I2 = l41Var.m2814I();
                int iM5702u2 = vi0.m5702u(iM2814I2);
                if (iM5702u2 == 0) {
                    l41Var.m2824b();
                    arrayList2 = new ArrayList();
                } else if (iM5702u2 != 2) {
                    arrayList2 = null;
                } else {
                    l41Var.m2825c();
                    arrayList2 = new mb1(true);
                }
                boolean z = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = m3360d(iM2814I2, l41Var);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strM2808B, arrayList2);
                }
                if (z) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    l41Var.m2828h();
                } else {
                    l41Var.m2829j();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // p000.q43
    /* JADX INFO: renamed from: c */
    public final void mo98c(o41 o41Var, Object obj) throws IOException {
        if (obj == null) {
            o41Var.m3498p();
            return;
        }
        Class<?> cls = obj.getClass();
        ir0 ir0Var = this.f7310a;
        ir0Var.getClass();
        q43 q43VarM2386c = ir0Var.m2386c(new j63(cls));
        if (!(q43VarM2386c instanceof ns1)) {
            q43VarM2386c.mo98c(o41Var, obj);
        } else {
            o41Var.m3492e();
            o41Var.m3495j();
        }
    }

    /* JADX INFO: renamed from: d */
    public final Serializable m3360d(int i, l41 l41Var) throws IOException {
        int iM5702u = vi0.m5702u(i);
        if (iM5702u == 5) {
            return l41Var.m2812G();
        }
        if (iM5702u == 6) {
            return hk1.m2202a(this.f7311b, l41Var);
        }
        if (iM5702u == 7) {
            return Boolean.valueOf(l41Var.m2835t());
        }
        if (iM5702u == 8) {
            l41Var.m2810E();
            return null;
        }
        C0676s.m4653l("Unexpected token: ".concat(vi0.m5705x(i)));
        return null;
    }
}
