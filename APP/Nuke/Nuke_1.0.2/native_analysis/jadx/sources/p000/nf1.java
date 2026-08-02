package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public interface nf1 {
    /* JADX INFO: renamed from: b */
    default int mo282b(m11 m11Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new s50((if1) list.get(i3), n11.f6966i, q11.f8688i, i2));
        }
        return mo287g(new z11(m11Var, m11Var.getLayoutDirection()), arrayList, AbstractC0258gz.m2028b(0, i, 0, 0, 13)).mo106c();
    }

    /* JADX INFO: renamed from: d */
    default int mo284d(m11 m11Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new s50((if1) list.get(i3), n11.f6966i, q11.f8687h, i2));
        }
        return mo287g(new z11(m11Var, m11Var.getLayoutDirection()), arrayList, AbstractC0258gz.m2028b(0, 0, 0, i, 7)).mo108e();
    }

    /* JADX INFO: renamed from: g */
    of1 mo287g(pf1 pf1Var, List list, long j);

    /* JADX INFO: renamed from: h */
    default int mo288h(m11 m11Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new s50((if1) list.get(i3), n11.f6965h, q11.f8688i, i2));
        }
        return mo287g(new z11(m11Var, m11Var.getLayoutDirection()), arrayList, AbstractC0258gz.m2028b(0, i, 0, 0, 13)).mo106c();
    }

    /* JADX INFO: renamed from: j */
    default int mo290j(m11 m11Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new s50((if1) list.get(i3), n11.f6965h, q11.f8687h, i2));
        }
        return mo287g(new z11(m11Var, m11Var.getLayoutDirection()), arrayList, AbstractC0258gz.m2028b(0, 0, 0, i, 7)).mo108e();
    }
}
