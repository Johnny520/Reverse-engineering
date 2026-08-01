package p072;

import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import p103.AbstractC7973;
import p105.InterfaceC8010;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7639 {
    public static final C7647 Companion = new C7647();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC6016[] f18593 = {AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C7460(18)), null, null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Double f18594;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Double f18595;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Double f18596;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18597;

    public C7639(int i, List list, Double d, Double d2, Double d3) {
        if (15 != (i & 15)) {
            AbstractC7973.m12979(i, 15, C7646.f18601.getDescriptor());
            throw null;
        }
        this.f18597 = list;
        this.f18596 = d;
        this.f18595 = d2;
        this.f18594 = d3;
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            if (dDoubleValue < 0.0d || dDoubleValue > 1.0d) {
                C6755.m11869("costPriority must be in 0.0 <= x <= 1.0 value range");
                throw null;
            }
        }
        if (d2 != null) {
            double dDoubleValue2 = d2.doubleValue();
            if (dDoubleValue2 < 0.0d || dDoubleValue2 > 1.0d) {
                C6755.m11869("costPriority must be in 0.0 <= x <= 1.0 value range");
                throw null;
            }
        }
        if (d3 != null) {
            double dDoubleValue3 = d3.doubleValue();
            if (dDoubleValue3 < 0.0d || dDoubleValue3 > 1.0d) {
                C6755.m11869("intelligencePriority must be in 0.0 <= x <= 1.0 value range");
                throw null;
            }
        }
    }
}
