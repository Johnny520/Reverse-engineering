package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2985 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public ArrayList f6699;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public AbstractC2987 f6700;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static long m4456(C2978 c2978, long j) {
        AbstractC2987 abstractC2987 = c2978.f6668;
        ArrayList arrayList = c2978.f6674;
        if (abstractC2987 instanceof C2995) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC2980 interfaceC2980 = (InterfaceC2980) arrayList.get(i);
            if (interfaceC2980 instanceof C2978) {
                C2978 c29782 = (C2978) interfaceC2980;
                if (c29782.f6668 != abstractC2987) {
                    jMax = Math.max(jMax, m4456(c29782, ((long) c29782.f6666) + j));
                }
            }
        }
        C2978 c29783 = abstractC2987.f6708;
        C2978 c29784 = abstractC2987.f6710;
        if (c2978 != c29783) {
            return jMax;
        }
        long jMo4455 = abstractC2987.mo4455() + j;
        return Math.max(Math.max(jMax, m4456(c29784, jMo4455)), jMo4455 - ((long) c29784.f6666));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static long m4457(C2978 c2978, long j) {
        AbstractC2987 abstractC2987 = c2978.f6668;
        ArrayList arrayList = c2978.f6674;
        if (abstractC2987 instanceof C2995) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC2980 interfaceC2980 = (InterfaceC2980) arrayList.get(i);
            if (interfaceC2980 instanceof C2978) {
                C2978 c29782 = (C2978) interfaceC2980;
                if (c29782.f6668 != abstractC2987) {
                    jMin = Math.min(jMin, m4457(c29782, ((long) c29782.f6666) + j));
                }
            }
        }
        C2978 c29783 = abstractC2987.f6710;
        C2978 c29784 = abstractC2987.f6708;
        if (c2978 != c29783) {
            return jMin;
        }
        long jMo4455 = j - abstractC2987.mo4455();
        return Math.min(Math.min(jMin, m4457(c29784, jMo4455)), jMo4455 - ((long) c29784.f6666));
    }
}
