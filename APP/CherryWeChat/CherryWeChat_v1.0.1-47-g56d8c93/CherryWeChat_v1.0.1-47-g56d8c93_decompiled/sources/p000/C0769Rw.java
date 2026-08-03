package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: Rw */
/* JADX INFO: loaded from: classes.dex */
public final class C0769Rw {

    /* JADX INFO: renamed from: a */
    public AbstractC1449gF f2441a;

    /* JADX INFO: renamed from: b */
    public ArrayList f2442b;

    /* JADX INFO: renamed from: a */
    public static long m1564a(C2628vd c2628vd, long j) {
        AbstractC1449gF abstractC1449gF = c2628vd.f9113d;
        ArrayList arrayList = c2628vd.f9120k;
        if (abstractC1449gF instanceof C2549tk) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC2542td interfaceC2542td = (InterfaceC2542td) arrayList.get(i);
            if (interfaceC2542td instanceof C2628vd) {
                C2628vd c2628vd2 = (C2628vd) interfaceC2542td;
                if (c2628vd2.f9113d != abstractC1449gF) {
                    jMin = Math.min(jMin, m1564a(c2628vd2, ((long) c2628vd2.f9115f) + j));
                }
            }
        }
        C2628vd c2628vd3 = abstractC1449gF.f5065i;
        C2628vd c2628vd4 = abstractC1449gF.f5064h;
        if (c2628vd != c2628vd3) {
            return jMin;
        }
        long jMo2779j = j - abstractC1449gF.mo2779j();
        return Math.min(Math.min(jMin, m1564a(c2628vd4, jMo2779j)), jMo2779j - ((long) c2628vd4.f9115f));
    }

    /* JADX INFO: renamed from: b */
    public static long m1565b(C2628vd c2628vd, long j) {
        AbstractC1449gF abstractC1449gF = c2628vd.f9113d;
        ArrayList arrayList = c2628vd.f9120k;
        if (abstractC1449gF instanceof C2549tk) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC2542td interfaceC2542td = (InterfaceC2542td) arrayList.get(i);
            if (interfaceC2542td instanceof C2628vd) {
                C2628vd c2628vd2 = (C2628vd) interfaceC2542td;
                if (c2628vd2.f9113d != abstractC1449gF) {
                    jMax = Math.max(jMax, m1565b(c2628vd2, ((long) c2628vd2.f9115f) + j));
                }
            }
        }
        C2628vd c2628vd3 = abstractC1449gF.f5064h;
        C2628vd c2628vd4 = abstractC1449gF.f5065i;
        if (c2628vd != c2628vd3) {
            return jMax;
        }
        long jMo2779j = abstractC1449gF.mo2779j() + j;
        return Math.max(Math.max(jMax, m1565b(c2628vd4, jMo2779j)), jMo2779j - ((long) c2628vd4.f9115f));
    }
}
