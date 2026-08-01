package p056;

import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import p087.AbstractC7143;
import p089.InterfaceC7180;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪子兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C6809 {
    public static final C6817 Companion = new C6817();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC5183[] f18253 = {AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C6630(18)), null, null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Double f18254;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Double f18255;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Double f18256;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f18257;

    public C6809(int i, List list, Double d, Double d2, Double d3) {
        if (15 != (i & 15)) {
            AbstractC7143.m12393(i, 15, C6816.f18261.getDescriptor());
            throw null;
        }
        this.f18257 = list;
        this.f18256 = d;
        this.f18255 = d2;
        this.f18254 = d3;
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            if (dDoubleValue < 0.0d || dDoubleValue > 1.0d) {
                C5919.m11249("costPriority must be in 0.0 <= x <= 1.0 value range");
                throw null;
            }
        }
        if (d2 != null) {
            double dDoubleValue2 = d2.doubleValue();
            if (dDoubleValue2 < 0.0d || dDoubleValue2 > 1.0d) {
                C5919.m11249("costPriority must be in 0.0 <= x <= 1.0 value range");
                throw null;
            }
        }
        if (d3 != null) {
            double dDoubleValue3 = d3.doubleValue();
            if (dDoubleValue3 < 0.0d || dDoubleValue3 > 1.0d) {
                C5919.m11249("intelligencePriority must be in 0.0 <= x <= 1.0 value range");
                throw null;
            }
        }
    }
}
