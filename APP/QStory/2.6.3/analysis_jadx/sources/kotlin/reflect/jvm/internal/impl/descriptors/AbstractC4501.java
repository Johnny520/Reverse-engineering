package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Map;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4501 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f13139;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13140;

    public AbstractC4501(String str, boolean z) {
        this.f13140 = str;
        this.f13139 = z;
    }

    public final String toString() {
        return mo9099();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String mo9099() {
        return this.f13140;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Integer mo9100(AbstractC4501 abstractC4501) {
        abstractC4501.getClass();
        Map map = AbstractC4505.f13144;
        if (this == abstractC4501) {
            return 0;
        }
        Map map2 = AbstractC4505.f13144;
        Integer num = (Integer) map2.get(this);
        Integer num2 = (Integer) map2.get(abstractC4501);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC4501 mo9098() {
        return this;
    }
}
