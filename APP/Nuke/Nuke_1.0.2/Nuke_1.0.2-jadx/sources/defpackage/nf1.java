package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public interface nf1 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default int b(m11 m11Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new s50((if1) list.get(i3), n11.i, q11.i, i2));
        }
        return g(new z11(m11Var, m11Var.getLayoutDirection()), arrayList, gz.b(0, i, 0, 0, 13)).c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default int d(m11 m11Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new s50((if1) list.get(i3), n11.i, q11.h, i2));
        }
        return g(new z11(m11Var, m11Var.getLayoutDirection()), arrayList, gz.b(0, 0, 0, i, 7)).e();
    }

    of1 g(pf1 pf1Var, List list, long j);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default int h(m11 m11Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new s50((if1) list.get(i3), n11.h, q11.i, i2));
        }
        return g(new z11(m11Var, m11Var.getLayoutDirection()), arrayList, gz.b(0, i, 0, 0, 13)).c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default int j(m11 m11Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new s50((if1) list.get(i3), n11.h, q11.h, i2));
        }
        return g(new z11(m11Var, m11Var.getLayoutDirection()), arrayList, gz.b(0, 0, 0, i, 7)).e();
    }
}
