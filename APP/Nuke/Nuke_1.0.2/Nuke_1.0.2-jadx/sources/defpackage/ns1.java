package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ns1 extends q43 {
    public static final ms1 c = new ms1(1);
    public final ir0 a;
    public final int b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ns1(ir0 ir0Var, int i) {
        this.a = ir0Var;
        this.b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final Object b(l41 l41Var) throws IOException {
        Object arrayList;
        Serializable arrayList2;
        int I = l41Var.I();
        int iU = vi0.u(I);
        if (iU == 0) {
            l41Var.b();
            arrayList = new ArrayList();
        } else if (iU != 2) {
            arrayList = null;
        } else {
            l41Var.c();
            arrayList = new mb1(true);
        }
        if (arrayList == null) {
            return d(I, l41Var);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (l41Var.p()) {
                String strB = arrayList instanceof Map ? l41Var.B() : null;
                int I2 = l41Var.I();
                int iU2 = vi0.u(I2);
                if (iU2 == 0) {
                    l41Var.b();
                    arrayList2 = new ArrayList();
                } else if (iU2 != 2) {
                    arrayList2 = null;
                } else {
                    l41Var.c();
                    arrayList2 = new mb1(true);
                }
                boolean z = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = d(I2, l41Var);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strB, arrayList2);
                }
                if (z) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    l41Var.h();
                } else {
                    l41Var.j();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.q43
    public final void c(o41 o41Var, Object obj) throws IOException {
        if (obj == null) {
            o41Var.p();
            return;
        }
        Class<?> cls = obj.getClass();
        ir0 ir0Var = this.a;
        ir0Var.getClass();
        q43 q43VarC = ir0Var.c(new j63(cls));
        if (!(q43VarC instanceof ns1)) {
            q43VarC.c(o41Var, obj);
        } else {
            o41Var.e();
            o41Var.j();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Serializable d(int i, l41 l41Var) throws IOException {
        int iU = vi0.u(i);
        if (iU == 5) {
            return l41Var.G();
        }
        if (iU == 6) {
            return hk1.a(this.b, l41Var);
        }
        if (iU == 7) {
            return Boolean.valueOf(l41Var.t());
        }
        if (iU == 8) {
            l41Var.E();
            return null;
        }
        s.l("Unexpected token: ".concat(vi0.x(i)));
        return null;
    }
}
