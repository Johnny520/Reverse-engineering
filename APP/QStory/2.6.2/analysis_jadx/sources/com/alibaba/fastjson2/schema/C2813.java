package com.alibaba.fastjson2.schema;

import androidx.compose.foundation.lazy.C0748;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2813 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final LinkedHashSet f8764;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.math.BigDecimal] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.math.BigInteger] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Integer] */
    public C2813(Object... objArr) {
        this.f8764 = new LinkedHashSet(objArr.length);
        for (?? bigDecimal : objArr) {
            if (bigDecimal instanceof BigDecimal) {
                BigDecimal bigDecimal2 = (BigDecimal) bigDecimal;
                bigDecimal = bigDecimal2.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal2.stripTrailingZeros();
                if (bigDecimal.scale() == 0) {
                    bigDecimal = bigDecimal.toBigInteger();
                    if (bigDecimal.compareTo(AbstractC2866.f9035) >= 0 && bigDecimal.compareTo(AbstractC2866.f9034) <= 0) {
                        bigDecimal = Integer.valueOf(bigDecimal.intValue());
                    } else if (bigDecimal.compareTo(AbstractC2866.f9033) >= 0 && bigDecimal.compareTo(AbstractC2866.f9032) <= 0) {
                        bigDecimal = Long.valueOf(bigDecimal.longValue());
                    }
                }
            }
            this.f8764.add(bigDecimal);
        }
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final C0748 mo5603(Object obj) {
        if (obj instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) obj;
            BigDecimal bigDecimal2 = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
            long jLongValue = bigDecimal.longValue();
            obj = bigDecimal.compareTo(BigDecimal.valueOf(jLongValue)) == 0 ? Long.valueOf(jLongValue) : bigDecimal.scale() == 0 ? bigDecimal.unscaledValue() : bigDecimal2;
        } else if (obj instanceof BigInteger) {
            BigInteger bigInteger = (BigInteger) obj;
            if (bigInteger.compareTo(AbstractC2866.f9033) >= 0 && bigInteger.compareTo(AbstractC2866.f9032) <= 0) {
                obj = Long.valueOf(bigInteger.longValue());
            }
        }
        if (obj instanceof Long) {
            long jLongValue2 = ((Long) obj).longValue();
            if (jLongValue2 >= -2147483648L && jLongValue2 <= 2147483647L) {
                obj = Integer.valueOf((int) jLongValue2);
            }
        }
        return !this.f8764.contains(obj) ? obj == null ? JSONSchema.f8680 : new C0748("expect type %s, but %s", new Object[]{JSONSchema.Type.Enum, obj.getClass()}, false) : JSONSchema.f8681;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo5612() {
        return JSONSchema.Type.Enum;
    }
}
