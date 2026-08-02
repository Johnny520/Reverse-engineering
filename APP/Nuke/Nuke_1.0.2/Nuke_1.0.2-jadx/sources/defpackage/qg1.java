package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qg1 extends t70 implements w70 {
    public static final qg1 d = new qg1(true);
    public static final String e = "StorageFeatureService";
    public static final hx2 f = new hx2(new n31(13));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object j() {
        hp2 hp2Var = hp2.d;
        Class clsD = pg1.b.d();
        hp2Var.getClass();
        sg1 sg1VarV = op0.y(hp2.j(clsD)).v();
        sg1VarV.l = 0;
        v00.d.getClass();
        Object value = v00.f.getValue();
        value.getClass();
        sg1VarV.C = (Class) value;
        Object objG0 = ((zg1) du.o0(sg1VarV.c())).g0(new Object[0]);
        objG0.getClass();
        return objG0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w70
    public final void a(ArrayList arrayList) {
        arrayList.add(pg1.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return e;
    }
}
