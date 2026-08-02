package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ao2 {

    /* JADX INFO: renamed from: a */
    public static final Comparator[] f315a;

    /* JADX INFO: renamed from: b */
    public static final un2 f316b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new C0847wh(new C0847wh(i == 0 ? sl0.f10183e : sl0.f10181c), 4);
            i++;
        }
        f315a = comparatorArr;
        f316b = un2.f11381q;
    }

    /* JADX INFO: renamed from: a */
    public static final void m245a(qn2 qn2Var, ArrayList arrayList, C0798v5 c0798v5, C0798v5 c0798v52, zj1 zj1Var) {
        ln2 ln2Var = qn2Var.f9050d;
        Object objM4505g = ln2Var.f6221h.m4505g(vn2.f12071n);
        if (objM4505g == null) {
            objM4505g = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objM4505g).booleanValue();
        if ((zBooleanValue || ((Boolean) c0798v52.mo5j(qn2Var)).booleanValue()) && ((Boolean) c0798v5.mo5j(qn2Var)).booleanValue()) {
            arrayList.add(qn2Var);
        }
        if (zBooleanValue) {
            zj1Var.m6421h(qn2Var.f9052f, m246b(qn2Var, c0798v5, c0798v52, qn2.m4199j(7, qn2Var)));
            return;
        }
        List listM4199j = qn2.m4199j(7, qn2Var);
        int size = listM4199j.size();
        for (int i = 0; i < size; i++) {
            m245a((qn2) listM4199j.get(i), arrayList, c0798v5, c0798v52, zj1Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList m246b(qn2 qn2Var, C0798v5 c0798v5, C0798v5 c0798v52, List list) {
        int i;
        zj1 zj1Var = y01.f13265a;
        zj1 zj1Var2 = new zj1();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            m245a((qn2) list.get(i2), arrayList, c0798v5, c0798v52, zj1Var2);
        }
        int i3 = 1;
        char c = qn2Var.f9049c.f9366G == d61.f1886i ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                qn2 qn2Var2 = (qn2) arrayList.get(i4);
                if (i4 != 0) {
                    float f = qn2Var2.m4207h().f7537b;
                    float f2 = qn2Var2.m4207h().f7539d;
                    int i5 = f >= f2 ? i3 : 0;
                    int size3 = arrayList2.size() - i3;
                    if (size3 >= 0) {
                        int i6 = 0;
                        while (true) {
                            o62 o62Var = (o62) ((ow1) arrayList2.get(i6)).f7862h;
                            float f3 = o62Var.f7537b;
                            i = i3;
                            float f4 = o62Var.f7539d;
                            int i7 = f3 >= f4 ? i : 0;
                            if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList2.set(i6, new ow1(new o62(Math.max(o62Var.f7536a, 0.0f), Math.max(o62Var.f7537b, f), Math.min(o62Var.f7538c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((ow1) arrayList2.get(i6)).f7863i));
                                ((List) ((ow1) arrayList2.get(i6)).f7863i).add(qn2Var2);
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
                    arrayList2.add(new ow1(qn2Var2.m4207h(), AbstractC0179eu.m1437R(qn2Var2)));
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
        AbstractC0290hu.m2231f0(arrayList2, sl0.f10184f);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = f315a[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            ow1 ow1Var = (ow1) arrayList2.get(i8);
            AbstractC0290hu.m2231f0((List) ow1Var.f7863i, comparator);
            arrayList3.addAll((Collection) ow1Var.f7863i);
        }
        int i9 = i;
        AbstractC0290hu.m2231f0(arrayList3, new C0254gv(i9, f316b));
        int size5 = 0;
        while (size5 <= arrayList3.size() - i9) {
            List list2 = (List) zj1Var2.m6022b(((qn2) arrayList3.get(size5)).f9052f);
            if (list2 != null) {
                if (((Boolean) c0798v52.mo5j(arrayList3.get(size5))).booleanValue()) {
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
