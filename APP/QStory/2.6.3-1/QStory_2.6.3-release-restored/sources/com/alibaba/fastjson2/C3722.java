package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC3682;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.function.Function;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3722 extends AbstractC3713 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final JSONPathFilter$Operator f9473;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final long f9474;

    public C3722(String str, long j, String[] strArr, long[] jArr, Function function, JSONPathFilter$Operator jSONPathFilter$Operator, long j2) {
        super(str, j, strArr, jArr, function);
        this.f9473 = jSONPathFilter$Operator;
        this.f9474 = j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[?(");
        Object obj = this.f9452;
        if (obj == null) {
            obj = "@";
        }
        sb.append(obj);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f9454);
        sb.append(' ');
        sb.append(this.f9473);
        sb.append(' ');
        sb.append(this.f9474);
        sb.append(")]");
        return sb.toString();
    }

    @Override // com.alibaba.fastjson2.AbstractC3713
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo6516() {
        return this.f9473 == JSONPathFilter$Operator.NE;
    }

    @Override // com.alibaba.fastjson2.AbstractC3713
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo6517(Object obj) {
        int iCompareTo;
        boolean z = obj instanceof Boolean;
        JSONPathFilter$Operator jSONPathFilter$Operator = this.f9473;
        long j = this.f9474;
        if (z || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
            long jLongValue = z ? ((Boolean) obj).booleanValue() ? 1L : 0L : ((Number) obj).longValue();
            int iOrdinal = jSONPathFilter$Operator.ordinal();
            if (iOrdinal == 0) {
                return jLongValue == j;
            }
            if (iOrdinal == 1) {
                return jLongValue != j;
            }
            if (iOrdinal == 2) {
                return jLongValue > j;
            }
            if (iOrdinal == 3) {
                return jLongValue >= j;
            }
            if (iOrdinal == 4) {
                return jLongValue < j;
            }
            if (iOrdinal == 5) {
                return jLongValue <= j;
            }
            C6385.m11441();
            return false;
        }
        if (obj instanceof BigDecimal) {
            iCompareTo = ((BigDecimal) obj).compareTo(BigDecimal.valueOf(j));
        } else if (obj instanceof BigInteger) {
            iCompareTo = ((BigInteger) obj).compareTo(BigInteger.valueOf(j));
        } else if (obj instanceof Float) {
            iCompareTo = ((Float) obj).compareTo(Float.valueOf(j));
        } else if (obj instanceof Double) {
            iCompareTo = ((Double) obj).compareTo(Double.valueOf(j));
        } else {
            if (!(obj instanceof String)) {
                C6385.m11441();
                return false;
            }
            String str = (String) obj;
            if (AbstractC3682.m6248(str)) {
                try {
                    iCompareTo = Long.compare(Long.parseLong(str), j);
                } catch (Exception unused) {
                    iCompareTo = str.compareTo(Long.toString(j));
                }
            } else {
                iCompareTo = str.compareTo(Long.toString(j));
            }
        }
        int iOrdinal2 = jSONPathFilter$Operator.ordinal();
        if (iOrdinal2 == 0) {
            return iCompareTo == 0;
        }
        if (iOrdinal2 == 1) {
            return iCompareTo != 0;
        }
        if (iOrdinal2 == 2) {
            return iCompareTo > 0;
        }
        if (iOrdinal2 == 3) {
            return iCompareTo >= 0;
        }
        if (iOrdinal2 == 4) {
            return iCompareTo < 0;
        }
        if (iOrdinal2 == 5) {
            return iCompareTo <= 0;
        }
        C6385.m11441();
        return false;
    }
}
