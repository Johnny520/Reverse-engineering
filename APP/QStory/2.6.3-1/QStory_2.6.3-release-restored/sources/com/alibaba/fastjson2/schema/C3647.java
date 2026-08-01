package com.alibaba.fastjson2.schema;

import androidx.compose.foundation.lazy.C1589;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3647 extends JSONSchema {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final LinkedHashSet f9111;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.math.BigDecimal] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.math.BigInteger] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Integer] */
    public C3647(Object... objArr) {
        this.f9111 = new LinkedHashSet(objArr.length);
        for (?? bigDecimal : objArr) {
            if (bigDecimal instanceof BigDecimal) {
                BigDecimal bigDecimal2 = (BigDecimal) bigDecimal;
                bigDecimal = bigDecimal2.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal2.stripTrailingZeros();
                if (bigDecimal.scale() == 0) {
                    bigDecimal = bigDecimal.toBigInteger();
                    if (bigDecimal.compareTo(AbstractC3700.f9382) >= 0 && bigDecimal.compareTo(AbstractC3700.f9381) <= 0) {
                        bigDecimal = Integer.valueOf(bigDecimal.intValue());
                    } else if (bigDecimal.compareTo(AbstractC3700.f9380) >= 0 && bigDecimal.compareTo(AbstractC3700.f9379) <= 0) {
                        bigDecimal = Long.valueOf(bigDecimal.longValue());
                    }
                }
            }
            this.f9111.add(bigDecimal);
        }
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final C1589 mo6208(Object obj) {
        if (obj instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) obj;
            BigDecimal bigDecimal2 = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
            long jLongValue = bigDecimal.longValue();
            obj = bigDecimal.compareTo(BigDecimal.valueOf(jLongValue)) == 0 ? Long.valueOf(jLongValue) : bigDecimal.scale() == 0 ? bigDecimal.unscaledValue() : bigDecimal2;
        } else if (obj instanceof BigInteger) {
            BigInteger bigInteger = (BigInteger) obj;
            if (bigInteger.compareTo(AbstractC3700.f9380) >= 0 && bigInteger.compareTo(AbstractC3700.f9379) <= 0) {
                obj = Long.valueOf(bigInteger.longValue());
            }
        }
        if (obj instanceof Long) {
            long jLongValue2 = ((Long) obj).longValue();
            if (jLongValue2 >= -2147483648L && jLongValue2 <= 2147483647L) {
                obj = Integer.valueOf((int) jLongValue2);
            }
        }
        return !this.f9111.contains(obj) ? obj == null ? JSONSchema.f9027 : new C1589("expect type %s, but %s", new Object[]{JSONSchema.Type.Enum, obj.getClass()}, false) : JSONSchema.f9028;
    }

    @Override // com.alibaba.fastjson2.schema.JSONSchema
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final JSONSchema.Type mo6217() {
        return JSONSchema.Type.Enum;
    }
}
