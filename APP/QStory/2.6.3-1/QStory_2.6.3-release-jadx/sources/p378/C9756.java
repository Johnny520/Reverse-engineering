package p378;

import org.luckypray.dexkit.query.enums.NumberEncodeValueType;
import org.luckypray.dexkit.query.matchers.C6534;
import org.luckypray.dexkit.query.matchers.C6535;
import org.luckypray.dexkit.query.matchers.C6536;
import org.luckypray.dexkit.query.matchers.C6537;
import org.luckypray.dexkit.query.matchers.C6542;
import org.luckypray.dexkit.query.matchers.C6543;
import p383.InterfaceC9783;

/* JADX INFO: renamed from: 飘花落叶言苏子兰世哲楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9756 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public /* synthetic */ NumberEncodeValueType f25481;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public /* synthetic */ InterfaceC9783 f25482;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m15108(Number number) {
        number.getClass();
        if (number instanceof Byte) {
            this.f25482 = new C6537(number.byteValue());
            this.f25481 = NumberEncodeValueType.ByteValue;
            return;
        }
        if (number instanceof Short) {
            this.f25482 = new C6542(number.shortValue());
            this.f25481 = NumberEncodeValueType.ShortValue;
            return;
        }
        if (number instanceof Integer) {
            this.f25482 = new C6534(number.intValue());
            this.f25481 = NumberEncodeValueType.IntValue;
            return;
        }
        if (number instanceof Long) {
            this.f25482 = new C6543(number.longValue());
            this.f25481 = NumberEncodeValueType.LongValue;
        } else if (number instanceof Float) {
            this.f25482 = new C6535(number.floatValue());
            this.f25481 = NumberEncodeValueType.FloatValue;
        } else if (number instanceof Double) {
            this.f25482 = new C6536(number.doubleValue());
            this.f25481 = NumberEncodeValueType.DoubleValue;
        }
    }
}
