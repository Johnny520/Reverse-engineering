package com.alibaba.fastjson2;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.function.Function;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2890 extends AbstractC2880 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f9130;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f9131;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Serializable f9132;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2890(String str, long j, String[] strArr, long[] jArr, Function function, long[] jArr2, boolean z) {
        super(str, j, strArr, jArr, function);
        this.f9130 = 0;
        this.f9132 = jArr2;
        this.f9131 = z;
    }

    @Override // com.alibaba.fastjson2.AbstractC2880
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public boolean mo5956() {
        switch (this.f9130) {
            case 0:
                return this.f9131;
            case 1:
            default:
                return super.mo5956();
            case 2:
                return this.f9131;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2880
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo5957(Object obj) {
        int i = this.f9130;
        int i2 = 0;
        Object obj2 = this.f9132;
        boolean z = this.f9131;
        switch (i) {
            case 0:
                long[] jArr = (long[]) obj2;
                if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                    long jLongValue = ((Number) obj).longValue();
                    int length = jArr.length;
                    while (i2 < length) {
                        if (jArr[i2] != jLongValue) {
                            i2++;
                        }
                    }
                    return z;
                }
                if ((obj instanceof Float) || (obj instanceof Double)) {
                    double dDoubleValue = ((Number) obj).doubleValue();
                    int length2 = jArr.length;
                    while (i2 < length2) {
                        if (jArr[i2] != dDoubleValue) {
                            i2++;
                        }
                    }
                    return z;
                }
                if (obj instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) obj;
                    long jLongValue2 = bigDecimal.longValue();
                    int length3 = jArr.length;
                    while (i2 < length3) {
                        long j = jArr[i2];
                        if (j != jLongValue2 || bigDecimal.compareTo(BigDecimal.valueOf(j)) != 0) {
                            i2++;
                        }
                    }
                    return z;
                }
                if (!(obj instanceof BigInteger)) {
                    return z;
                }
                BigInteger bigInteger = (BigInteger) obj;
                long jLongValue3 = bigInteger.longValue();
                int length4 = jArr.length;
                while (i2 < length4) {
                    long j2 = jArr[i2];
                    if (j2 != jLongValue3 || !bigInteger.equals(BigInteger.valueOf(j2))) {
                        i2++;
                    }
                }
                return z;
                return !z;
            case 1:
                boolean zMatches = ((Pattern) obj2).matcher(obj.toString()).matches();
                return z ? !zMatches : zMatches;
            default:
                String[] strArr = (String[]) obj2;
                int length5 = strArr.length;
                while (i2 < length5) {
                    String str = strArr[i2];
                    if (str == obj || (str != null && str.equals(obj))) {
                        return !z;
                    }
                    i2++;
                }
                return z;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2890(String str, long j, Serializable serializable, boolean z, int i) {
        super(str, j);
        this.f9130 = i;
        this.f9132 = serializable;
        this.f9131 = z;
    }
}
