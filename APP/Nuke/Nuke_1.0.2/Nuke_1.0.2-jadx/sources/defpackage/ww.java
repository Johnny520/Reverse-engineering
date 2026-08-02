package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ww extends RuntimeException {
    public final lk1 h;
    public final lk1 i;
    public final yj1 j;
    public final int k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ww(lk1 lk1Var, lk1 lk1Var2, yj1 yj1Var, int i, Exception exc) {
        super(exc);
        this.h = lk1Var;
        this.i = lk1Var2;
        this.j = yj1Var;
        this.k = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final String getMessage() {
        List listO;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.k);
        sb.append(":\n            |");
        vo2 vo2VarB = tp0.B(new vw(this, null));
        if (vo2VarB.hasNext()) {
            Object next = vo2VarB.next();
            if (vo2VarB.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (vo2VarB.hasNext()) {
                    arrayList.add(vo2VarB.next());
                }
                listO = arrayList;
            } else {
                listO = eu.O(next);
            }
        } else {
            listO = be0.h;
        }
        sb.append(du.u0(du.C0(50, listO), "\n", null, null, null, 62));
        sb.append("\n            ");
        return qv2.T(sb.toString());
    }
}
