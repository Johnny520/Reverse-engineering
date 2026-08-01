package p362;

import org.luckypray.dexkit.query.enums.NumberEncodeValueType;
import org.luckypray.dexkit.query.matchers.C5704;
import org.luckypray.dexkit.query.matchers.C5705;
import org.luckypray.dexkit.query.matchers.C5706;
import org.luckypray.dexkit.query.matchers.C5707;
import org.luckypray.dexkit.query.matchers.C5712;
import org.luckypray.dexkit.query.matchers.C5713;
import p367.InterfaceC8954;

/* JADX INFO: renamed from: 飘花落叶言苏子兰世哲楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8927 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public /* synthetic */ NumberEncodeValueType f25136;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public /* synthetic */ InterfaceC8954 f25137;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14549(Number number) {
        number.getClass();
        if (number instanceof Byte) {
            this.f25137 = new C5707(number.byteValue());
            this.f25136 = NumberEncodeValueType.ByteValue;
            return;
        }
        if (number instanceof Short) {
            this.f25137 = new C5712(number.shortValue());
            this.f25136 = NumberEncodeValueType.ShortValue;
            return;
        }
        if (number instanceof Integer) {
            this.f25137 = new C5704(number.intValue());
            this.f25136 = NumberEncodeValueType.IntValue;
            return;
        }
        if (number instanceof Long) {
            this.f25137 = new C5713(number.longValue());
            this.f25136 = NumberEncodeValueType.LongValue;
        } else if (number instanceof Float) {
            this.f25137 = new C5705(number.floatValue());
            this.f25136 = NumberEncodeValueType.FloatValue;
        } else if (number instanceof Double) {
            this.f25137 = new C5706(number.doubleValue());
            this.f25136 = NumberEncodeValueType.DoubleValue;
        }
    }
}
