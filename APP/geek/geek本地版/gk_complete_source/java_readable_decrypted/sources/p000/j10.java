package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j10 {

    /* JADX INFO: renamed from: a */
    public qb0 f2539a;

    /* JADX INFO: renamed from: b */
    public ArrayList f2540b;

    /* JADX INFO: renamed from: a */
    public static long m1543a(C0373jg c0373jg, long j) {
        qb0 qb0Var = c0373jg.f2624d;
        ArrayList arrayList = c0373jg.f2631k;
        if (qb0Var instanceof C0529no) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0297hg interfaceC0297hg = (InterfaceC0297hg) arrayList.get(i);
            if (interfaceC0297hg instanceof C0373jg) {
                C0373jg c0373jg2 = (C0373jg) interfaceC0297hg;
                if (c0373jg2.f2624d != qb0Var) {
                    jMin = Math.min(jMin, m1543a(c0373jg2, ((long) c0373jg2.f2626f) + j));
                }
            }
        }
        C0373jg c0373jg3 = qb0Var.f4060i;
        C0373jg c0373jg4 = qb0Var.f4059h;
        if (c0373jg != c0373jg3) {
            return jMin;
        }
        long jMo2163j = j - qb0Var.mo2163j();
        return Math.min(Math.min(jMin, m1543a(c0373jg4, jMo2163j)), jMo2163j - ((long) c0373jg4.f2626f));
    }

    /* JADX INFO: renamed from: b */
    public static long m1544b(C0373jg c0373jg, long j) {
        qb0 qb0Var = c0373jg.f2624d;
        ArrayList arrayList = c0373jg.f2631k;
        if (qb0Var instanceof C0529no) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0297hg interfaceC0297hg = (InterfaceC0297hg) arrayList.get(i);
            if (interfaceC0297hg instanceof C0373jg) {
                C0373jg c0373jg2 = (C0373jg) interfaceC0297hg;
                if (c0373jg2.f2624d != qb0Var) {
                    jMax = Math.max(jMax, m1544b(c0373jg2, ((long) c0373jg2.f2626f) + j));
                }
            }
        }
        C0373jg c0373jg3 = qb0Var.f4059h;
        C0373jg c0373jg4 = qb0Var.f4060i;
        if (c0373jg != c0373jg3) {
            return jMax;
        }
        long jMo2163j = qb0Var.mo2163j() + j;
        return Math.max(Math.max(jMax, m1544b(c0373jg4, jMo2163j)), jMo2163j - ((long) c0373jg4.f2626f));
    }
}
