package p077P0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import p007B0.C0172E;
import p056K2.C0882h;
import p061L2.AbstractC0977q;
import p069N2.C1019a;
import p153e1.EnumC2017m;
import p179i4.AbstractC2352g;
import p186k.AbstractC2429k;
import p186k.C2439u;
import p204n0.C2684c;

/* JADX INFO: renamed from: P0.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1138y {

    /* JADX INFO: renamed from: a */
    public static final Comparator[] f3772a;

    /* JADX INFO: renamed from: b */
    public static final C1123j f3773b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i5 = 0;
        while (i5 < 2) {
            comparatorArr[i5] = new C1137x(new C1137x(i5 == 0 ? C1119f.f3642c : C1119f.f3641b));
            i5++;
        }
        f3772a = comparatorArr;
        f3773b = C1123j.f3671z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m2191a(C1128o c1128o, ArrayList arrayList, C0172E c0172e, C0172E c0172e2, C2439u c2439u) {
        C1125l c1125l = c1128o.f3711d;
        Object objM4272g = c1125l.f3702d.m4272g(AbstractC1132s.f3750m);
        if (objM4272g == null) {
            objM4272g = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objM4272g).booleanValue();
        if ((zBooleanValue || ((Boolean) c0172e2.mo1h(c1128o)).booleanValue()) && ((Boolean) c0172e.mo1h(c1128o)).booleanValue()) {
            arrayList.add(c1128o);
        }
        if (zBooleanValue) {
            c2439u.m4344h(c1128o.f3714g, m2192b(c1128o, c0172e, c0172e2, C1128o.m2163j(7, c1128o)));
            return;
        }
        List listM2163j = C1128o.m2163j(7, c1128o);
        int size = listM2163j.size();
        for (int i5 = 0; i5 < size; i5++) {
            m2191a((C1128o) listM2163j.get(i5), arrayList, c0172e, c0172e2, c2439u);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList m2192b(C1128o c1128o, C0172E c0172e, C0172E c0172e2, List list) {
        int i5;
        C2439u c2439u = AbstractC2429k.f7850a;
        C2439u c2439u2 = new C2439u();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            m2191a((C1128o) list.get(i6), arrayList, c0172e, c0172e2, c2439u2);
        }
        char c5 = c1128o.f3710c.f1693D == EnumC2017m.f6743e ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int iM4208u = AbstractC2352g.m4208u(arrayList);
        if (iM4208u >= 0) {
            int i7 = 0;
            while (true) {
                C1128o c1128o2 = (C1128o) arrayList.get(i7);
                if (i7 != 0) {
                    float f2 = c1128o2.m2171h().f8559b;
                    float f5 = c1128o2.m2171h().f8561d;
                    boolean z5 = f2 >= f5;
                    int iM4208u2 = AbstractC2352g.m4208u(arrayList2);
                    if (iM4208u2 >= 0) {
                        int i8 = 0;
                        while (true) {
                            C2684c c2684c = (C2684c) ((C0882h) arrayList2.get(i8)).f2769d;
                            float f6 = c2684c.f8559b;
                            i5 = 1;
                            float f7 = c2684c.f8561d;
                            boolean z6 = f6 >= f7;
                            if (!z5 && !z6 && Math.max(f2, f6) < Math.min(f5, f7)) {
                                arrayList2.set(i8, new C0882h(new C2684c(Math.max(c2684c.f8558a, 0.0f), Math.max(c2684c.f8559b, f2), Math.min(c2684c.f8560c, Float.POSITIVE_INFINITY), Math.min(f7, f5)), ((C0882h) arrayList2.get(i8)).f2770e));
                                ((List) ((C0882h) arrayList2.get(i8)).f2770e).add(c1128o2);
                                break;
                            }
                            if (i8 == iM4208u2) {
                                break;
                            }
                            i8++;
                        }
                    } else {
                        i5 = 1;
                    }
                    arrayList2.add(new C0882h(c1128o2.m2171h(), AbstractC2352g.m4178A(c1128o2)));
                    if (i7 == iM4208u) {
                        break;
                    }
                    i7++;
                }
            }
        } else {
            i5 = 1;
        }
        AbstractC0977q.m2031M(arrayList2, C1119f.f3643d);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = f3772a[c5 ^ 1];
        int size2 = arrayList2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            C0882h c0882h = (C0882h) arrayList2.get(i9);
            AbstractC0977q.m2031M((List) c0882h.f2770e, comparator);
            arrayList3.addAll((Collection) c0882h.f2770e);
        }
        AbstractC0977q.m2031M(arrayList3, new C1019a(i5, f3773b));
        int size3 = 0;
        while (size3 <= AbstractC2352g.m4208u(arrayList3)) {
            List list2 = (List) c2439u2.m4318b(((C1128o) arrayList3.get(size3)).f3714g);
            if (list2 != null) {
                if (((Boolean) c0172e2.mo1h(arrayList3.get(size3))).booleanValue()) {
                    size3++;
                } else {
                    arrayList3.remove(size3);
                }
                arrayList3.addAll(size3, list2);
                size3 += list2.size();
            } else {
                size3++;
            }
        }
        return arrayList3;
    }
}
