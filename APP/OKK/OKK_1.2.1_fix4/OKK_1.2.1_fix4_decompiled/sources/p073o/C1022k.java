package p073o;

import java.util.ArrayList;

/* JADX INFO: renamed from: o.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1022k {

    /* JADX INFO: renamed from: a */
    public AbstractC1024m f3758a;

    /* JADX INFO: renamed from: b */
    public ArrayList f3759b;

    /* JADX INFO: renamed from: a */
    public static long m2467a(C1017f c1017f, long j2) {
        AbstractC1024m abstractC1024m = c1017f.f3747d;
        if (abstractC1024m instanceof C1020i) {
            return j2;
        }
        ArrayList arrayList = c1017f.f3754k;
        int size = arrayList.size();
        long jMin = j2;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC1015d interfaceC1015d = (InterfaceC1015d) arrayList.get(i2);
            if (interfaceC1015d instanceof C1017f) {
                C1017f c1017f2 = (C1017f) interfaceC1015d;
                if (c1017f2.f3747d != abstractC1024m) {
                    jMin = Math.min(jMin, m2467a(c1017f2, ((long) c1017f2.f3749f) + j2));
                }
            }
        }
        if (c1017f != abstractC1024m.f3770i) {
            return jMin;
        }
        long jMo2449j = abstractC1024m.mo2449j();
        C1017f c1017f3 = abstractC1024m.f3769h;
        long j3 = j2 - jMo2449j;
        return Math.min(Math.min(jMin, m2467a(c1017f3, j3)), j3 - ((long) c1017f3.f3749f));
    }

    /* JADX INFO: renamed from: b */
    public static long m2468b(C1017f c1017f, long j2) {
        AbstractC1024m abstractC1024m = c1017f.f3747d;
        if (abstractC1024m instanceof C1020i) {
            return j2;
        }
        ArrayList arrayList = c1017f.f3754k;
        int size = arrayList.size();
        long jMax = j2;
        for (int i2 = 0; i2 < size; i2++) {
            InterfaceC1015d interfaceC1015d = (InterfaceC1015d) arrayList.get(i2);
            if (interfaceC1015d instanceof C1017f) {
                C1017f c1017f2 = (C1017f) interfaceC1015d;
                if (c1017f2.f3747d != abstractC1024m) {
                    jMax = Math.max(jMax, m2468b(c1017f2, ((long) c1017f2.f3749f) + j2));
                }
            }
        }
        if (c1017f != abstractC1024m.f3769h) {
            return jMax;
        }
        long jMo2449j = abstractC1024m.mo2449j();
        C1017f c1017f3 = abstractC1024m.f3770i;
        long j3 = j2 + jMo2449j;
        return Math.max(Math.max(jMax, m2468b(c1017f3, j3)), j3 - ((long) c1017f3.f3749f));
    }
}
