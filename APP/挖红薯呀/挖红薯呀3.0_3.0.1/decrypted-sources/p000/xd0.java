package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public interface xd0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    default int mo1223b(l30 l30Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new C0023am((sd0) list.get(i3), m30.f3799e, n30.f4171e, i2));
        }
        return mo213g(new v30(l30Var, l30Var.getLayoutDirection()), arrayList, AbstractC0654qj.m3255b(i, 0, 13)).mo669c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    default int mo1224c(l30 l30Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new C0023am((sd0) list.get(i3), m30.f3799e, n30.f4170d, i2));
        }
        return mo213g(new v30(l30Var, l30Var.getLayoutDirection()), arrayList, AbstractC0654qj.m3255b(0, i, 7)).mo670e();
    }

    /* JADX INFO: renamed from: g */
    yd0 mo213g(zd0 zd0Var, List list, long j);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    default int mo1225h(l30 l30Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new C0023am((sd0) list.get(i3), m30.f3798d, n30.f4171e, i2));
        }
        return mo213g(new v30(l30Var, l30Var.getLayoutDirection()), arrayList, AbstractC0654qj.m3255b(i, 0, 13)).mo669c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    default int mo1226j(l30 l30Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new C0023am((sd0) list.get(i3), m30.f3798d, n30.f4170d, i2));
        }
        return mo213g(new v30(l30Var, l30Var.getLayoutDirection()), arrayList, AbstractC0654qj.m3255b(0, i, 7)).mo670e();
    }
}
