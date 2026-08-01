package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2152 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ArrayList f6353;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC2154 f6354;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static long m3886(C2145 c2145, long j) {
        AbstractC2154 abstractC2154 = c2145.f6322;
        ArrayList arrayList = c2145.f6328;
        if (abstractC2154 instanceof C2162) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC2147 interfaceC2147 = (InterfaceC2147) arrayList.get(i);
            if (interfaceC2147 instanceof C2145) {
                C2145 c21452 = (C2145) interfaceC2147;
                if (c21452.f6322 != abstractC2154) {
                    jMax = Math.max(jMax, m3886(c21452, ((long) c21452.f6320) + j));
                }
            }
        }
        C2145 c21453 = abstractC2154.f6362;
        C2145 c21454 = abstractC2154.f6364;
        if (c2145 != c21453) {
            return jMax;
        }
        long jMo3885 = abstractC2154.mo3885() + j;
        return Math.max(Math.max(jMax, m3886(c21454, jMo3885)), jMo3885 - ((long) c21454.f6320));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static long m3887(C2145 c2145, long j) {
        AbstractC2154 abstractC2154 = c2145.f6322;
        ArrayList arrayList = c2145.f6328;
        if (abstractC2154 instanceof C2162) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC2147 interfaceC2147 = (InterfaceC2147) arrayList.get(i);
            if (interfaceC2147 instanceof C2145) {
                C2145 c21452 = (C2145) interfaceC2147;
                if (c21452.f6322 != abstractC2154) {
                    jMin = Math.min(jMin, m3887(c21452, ((long) c21452.f6320) + j));
                }
            }
        }
        C2145 c21453 = abstractC2154.f6364;
        C2145 c21454 = abstractC2154.f6362;
        if (c2145 != c21453) {
            return jMin;
        }
        long jMo3885 = j - abstractC2154.mo3885();
        return Math.min(Math.min(jMin, m3887(c21454, jMo3885)), jMo3885 - ((long) c21454.f6320));
    }
}
