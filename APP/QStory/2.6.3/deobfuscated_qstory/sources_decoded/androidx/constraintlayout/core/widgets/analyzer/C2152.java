package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2152 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ArrayList f6354;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC2154 f6355;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static long m3896(C2145 c2145, long j) {
        AbstractC2154 abstractC2154 = c2145.f6323;
        ArrayList arrayList = c2145.f6329;
        if (abstractC2154 instanceof C2162) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC2147 interfaceC2147 = (InterfaceC2147) arrayList.get(i);
            if (interfaceC2147 instanceof C2145) {
                C2145 c21452 = (C2145) interfaceC2147;
                if (c21452.f6323 != abstractC2154) {
                    jMax = Math.max(jMax, m3896(c21452, ((long) c21452.f6321) + j));
                }
            }
        }
        C2145 c21453 = abstractC2154.f6363;
        C2145 c21454 = abstractC2154.f6365;
        if (c2145 != c21453) {
            return jMax;
        }
        long jMo3895 = abstractC2154.mo3895() + j;
        return Math.max(Math.max(jMax, m3896(c21454, jMo3895)), jMo3895 - ((long) c21454.f6321));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static long m3897(C2145 c2145, long j) {
        AbstractC2154 abstractC2154 = c2145.f6323;
        ArrayList arrayList = c2145.f6329;
        if (abstractC2154 instanceof C2162) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC2147 interfaceC2147 = (InterfaceC2147) arrayList.get(i);
            if (interfaceC2147 instanceof C2145) {
                C2145 c21452 = (C2145) interfaceC2147;
                if (c21452.f6323 != abstractC2154) {
                    jMin = Math.min(jMin, m3897(c21452, ((long) c21452.f6321) + j));
                }
            }
        }
        C2145 c21453 = abstractC2154.f6365;
        C2145 c21454 = abstractC2154.f6363;
        if (c2145 != c21453) {
            return jMin;
        }
        long jMo3895 = j - abstractC2154.mo3895();
        return Math.min(Math.min(jMin, m3897(c21454, jMo3895)), jMo3895 - ((long) c21454.f6321));
    }
}
