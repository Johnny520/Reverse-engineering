package defpackage;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pm0 extends o82 {
    public static final vf1 d;
    public final List b;
    public final List c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        o72 o72Var = vf1.d;
        d = te.C("application/x-www-form-urlencoded");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pm0(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.b = wg3.i(arrayList);
        this.c = wg3.i(arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.o82
    public final long a() {
        return e(null, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.o82
    public final vf1 b() {
        return d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.o82
    public final void d(nn nnVar) throws EOFException {
        e(nnVar, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long e(nn nnVar, boolean z) throws EOFException {
        fn fnVarL;
        if (z) {
            fnVarL = new fn();
        } else {
            nnVar.getClass();
            fnVarL = nnVar.l();
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                fnVarL.E(38);
            }
            fnVarL.J((String) list.get(i));
            fnVarL.E(61);
            fnVarL.J((String) this.c.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = fnVarL.i;
        fnVarL.g();
        return j;
    }
}
