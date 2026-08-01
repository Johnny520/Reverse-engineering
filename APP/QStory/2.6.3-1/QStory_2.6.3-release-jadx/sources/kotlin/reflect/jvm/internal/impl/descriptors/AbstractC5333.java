package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Map;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5333 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f13484;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f13485;

    public AbstractC5333(String str, boolean z) {
        this.f13485 = str;
        this.f13484 = z;
    }

    public final String toString() {
        return mo9658();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String mo9658() {
        return this.f13485;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Integer mo9659(AbstractC5333 abstractC5333) {
        abstractC5333.getClass();
        Map map = AbstractC5337.f13489;
        if (this == abstractC5333) {
            return 0;
        }
        Map map2 = AbstractC5337.f13489;
        Integer num = (Integer) map2.get(this);
        Integer num2 = (Integer) map2.get(abstractC5333);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public AbstractC5333 mo9657() {
        return this;
    }
}
