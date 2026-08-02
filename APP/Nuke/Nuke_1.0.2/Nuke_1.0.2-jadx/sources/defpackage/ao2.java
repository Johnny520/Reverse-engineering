package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ao2 {
    public static final Comparator[] a;
    public static final un2 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new wh(new wh(i == 0 ? sl0.e : sl0.c), 4);
            i++;
        }
        a = comparatorArr;
        b = un2.q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void a(qn2 qn2Var, ArrayList arrayList, v5 v5Var, v5 v5Var2, zj1 zj1Var) {
        ln2 ln2Var = qn2Var.d;
        Object objG = ln2Var.h.g(vn2.n);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) v5Var2.j(qn2Var)).booleanValue()) && ((Boolean) v5Var.j(qn2Var)).booleanValue()) {
            arrayList.add(qn2Var);
        }
        if (zBooleanValue) {
            zj1Var.h(qn2Var.f, b(qn2Var, v5Var, v5Var2, qn2.j(7, qn2Var)));
            return;
        }
        List listJ = qn2.j(7, qn2Var);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            a((qn2) listJ.get(i), arrayList, v5Var, v5Var2, zj1Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList b(qn2 qn2Var, v5 v5Var, v5 v5Var2, List list) {
        int i;
        zj1 zj1Var = y01.a;
        zj1 zj1Var2 = new zj1();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((qn2) list.get(i2), arrayList, v5Var, v5Var2, zj1Var2);
        }
        int i3 = 1;
        char c = qn2Var.c.G == d61.i ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                qn2 qn2Var2 = (qn2) arrayList.get(i4);
                if (i4 != 0) {
                    float f = qn2Var2.h().b;
                    float f2 = qn2Var2.h().d;
                    int i5 = f >= f2 ? i3 : 0;
                    int size3 = arrayList2.size() - i3;
                    if (size3 >= 0) {
                        int i6 = 0;
                        while (true) {
                            o62 o62Var = (o62) ((ow1) arrayList2.get(i6)).h;
                            float f3 = o62Var.b;
                            i = i3;
                            float f4 = o62Var.d;
                            int i7 = f3 >= f4 ? i : 0;
                            if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList2.set(i6, new ow1(new o62(Math.max(o62Var.a, 0.0f), Math.max(o62Var.b, f), Math.min(o62Var.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((ow1) arrayList2.get(i6)).i));
                                ((List) ((ow1) arrayList2.get(i6)).i).add(qn2Var2);
                                break;
                            }
                            if (i6 == size3) {
                                break;
                            }
                            i6++;
                            i3 = i;
                        }
                    } else {
                        i = i3;
                    }
                    arrayList2.add(new ow1(qn2Var2.h(), eu.R(qn2Var2)));
                    if (i4 == size2) {
                        break;
                    }
                    i4++;
                    i3 = i;
                }
            }
        } else {
            i = 1;
        }
        hu.f0(arrayList2, sl0.f);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            ow1 ow1Var = (ow1) arrayList2.get(i8);
            hu.f0((List) ow1Var.i, comparator);
            arrayList3.addAll((Collection) ow1Var.i);
        }
        int i9 = i;
        hu.f0(arrayList3, new gv(i9, b));
        int size5 = 0;
        while (size5 <= arrayList3.size() - i9) {
            List list2 = (List) zj1Var2.b(((qn2) arrayList3.get(size5)).f);
            if (list2 != null) {
                if (((Boolean) v5Var2.j(arrayList3.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList3.remove(size5);
                }
                arrayList3.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList3;
    }
}
