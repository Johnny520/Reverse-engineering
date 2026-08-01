package p366;

import org.luckypray.dexkit.query.enums.NumberEncodeValueType;
import org.luckypray.dexkit.query.matchers.C5703;
import org.luckypray.dexkit.query.matchers.C5704;
import org.luckypray.dexkit.query.matchers.C5705;
import org.luckypray.dexkit.query.matchers.C5706;
import org.luckypray.dexkit.query.matchers.C5711;
import org.luckypray.dexkit.query.matchers.C5712;
import p364.InterfaceC8942;

/* JADX INFO: renamed from: 飘花落叶言苏子兰哲楪世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8946 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public /* synthetic */ NumberEncodeValueType f25152;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public /* synthetic */ InterfaceC8942 f25153;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14540(Number number) {
        number.getClass();
        if (number instanceof Byte) {
            this.f25153 = new C5706(number.byteValue());
            this.f25152 = NumberEncodeValueType.ByteValue;
            return;
        }
        if (number instanceof Short) {
            this.f25153 = new C5711(number.shortValue());
            this.f25152 = NumberEncodeValueType.ShortValue;
            return;
        }
        if (number instanceof Integer) {
            this.f25153 = new C5703(number.intValue());
            this.f25152 = NumberEncodeValueType.IntValue;
            return;
        }
        if (number instanceof Long) {
            this.f25153 = new C5712(number.longValue());
            this.f25152 = NumberEncodeValueType.LongValue;
        } else if (number instanceof Float) {
            this.f25153 = new C5704(number.floatValue());
            this.f25152 = NumberEncodeValueType.FloatValue;
        } else if (number instanceof Double) {
            this.f25153 = new C5705(number.doubleValue());
            this.f25152 = NumberEncodeValueType.DoubleValue;
        }
    }
}
