package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2849;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.function.Function;
import lin.xposed.hook.javaplugin.C5554;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2889 extends AbstractC2880 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final JSONPathFilter$Operator f9128;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final long f9129;

    public C2889(String str, long j, String[] strArr, long[] jArr, Function function, JSONPathFilter$Operator jSONPathFilter$Operator, long j2) {
        super(str, j, strArr, jArr, function);
        this.f9128 = jSONPathFilter$Operator;
        this.f9129 = j2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[?(");
        Object obj = this.f9107;
        if (obj == null) {
            obj = "@";
        }
        sb.append(obj);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f9109);
        sb.append(' ');
        sb.append(this.f9128);
        sb.append(' ');
        sb.append(this.f9129);
        sb.append(")]");
        return sb.toString();
    }

    @Override // com.alibaba.fastjson2.AbstractC2880
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo5956() {
        return this.f9128 == JSONPathFilter$Operator.NE;
    }

    @Override // com.alibaba.fastjson2.AbstractC2880
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo5957(Object obj) {
        int iCompareTo;
        boolean z = obj instanceof Boolean;
        JSONPathFilter$Operator jSONPathFilter$Operator = this.f9128;
        long j = this.f9129;
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
            C5554.m10882();
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
                C5554.m10882();
                return false;
            }
            String str = (String) obj;
            if (AbstractC2849.m5688(str)) {
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
        C5554.m10882();
        return false;
    }
}
