package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Map;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4500 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f13135;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13136;

    public AbstractC4500(String str, boolean z) {
        this.f13136 = str;
        this.f13135 = z;
    }

    public final String toString() {
        return mo9109();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String mo9109() {
        return this.f13136;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Integer mo9110(AbstractC4500 abstractC4500) {
        abstractC4500.getClass();
        Map map = AbstractC4504.f13140;
        if (this == abstractC4500) {
            return 0;
        }
        Map map2 = AbstractC4504.f13140;
        Integer num = (Integer) map2.get(this);
        Integer num2 = (Integer) map2.get(abstractC4500);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC4500 mo9108() {
        return this;
    }
}
