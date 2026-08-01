package p056;

import java.util.List;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import p087.AbstractC7144;
import p089.InterfaceC7181;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C6810 {
    public static final C6818 Companion = new C6818();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC5184[] f18248 = {AbstractC5187.m10215(LazyThreadSafetyMode.PUBLICATION, new C6631(18)), null, null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Double f18249;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Double f18250;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Double f18251;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18252;

    public C6810(int i, List list, Double d, Double d2, Double d3) {
        if (15 != (i & 15)) {
            AbstractC7144.m12420(i, 15, C6817.f18256.getDescriptor());
            throw null;
        }
        this.f18252 = list;
        this.f18251 = d;
        this.f18250 = d2;
        this.f18249 = d3;
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            if (dDoubleValue < 0.0d || dDoubleValue > 1.0d) {
                C5925.m11310("costPriority must be in 0.0 <= x <= 1.0 value range");
                throw null;
            }
        }
        if (d2 != null) {
            double dDoubleValue2 = d2.doubleValue();
            if (dDoubleValue2 < 0.0d || dDoubleValue2 > 1.0d) {
                C5925.m11310("costPriority must be in 0.0 <= x <= 1.0 value range");
                throw null;
            }
        }
        if (d3 != null) {
            double dDoubleValue3 = d3.doubleValue();
            if (dDoubleValue3 < 0.0d || dDoubleValue3 > 1.0d) {
                C5925.m11310("intelligencePriority must be in 0.0 <= x <= 1.0 value range");
                throw null;
            }
        }
    }
}
