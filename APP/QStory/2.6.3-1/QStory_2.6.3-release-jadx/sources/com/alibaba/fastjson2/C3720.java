package com.alibaba.fastjson2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3720 extends AbstractC3713 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f9471;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Object f9472;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3720(String str, long j, String[] strArr, long[] jArr, Object obj, int i) {
        super(str, j, strArr, jArr, null);
        this.f9471 = i;
        this.f9472 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    @Override // com.alibaba.fastjson2.AbstractC3713
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo6517(Object obj) {
        int i = this.f9471;
        Object obj2 = this.f9472;
        switch (i) {
            case 0:
                if (obj instanceof Collection) {
                    Collection collection = (Collection) obj;
                    for (long j : (long[]) obj2) {
                        for (Object obj3 : collection) {
                            if ((((obj3 instanceof Byte) || (obj3 instanceof Short) || (obj3 instanceof Integer) || (obj3 instanceof Long)) && ((Number) obj3).longValue() == j) || (((obj3 instanceof Float) && j == ((Float) obj3).floatValue()) || ((obj3 instanceof Double) && j == ((Double) obj3).doubleValue()))) {
                            }
                            if (obj3 instanceof BigDecimal) {
                                BigDecimal bigDecimal = (BigDecimal) obj3;
                                if (j != bigDecimal.longValue() || bigDecimal.compareTo(BigDecimal.valueOf(j)) != 0) {
                                    if (obj3 instanceof BigInteger) {
                                        BigInteger bigInteger = (BigInteger) obj3;
                                        if (j != bigInteger.longValue() || !bigInteger.equals(BigInteger.valueOf(j))) {
                                        }
                                    }
                                }
                            }
                            break;
                        }
                    }
                }
                break;
            default:
                if (obj instanceof Collection) {
                    Collection collection2 = (Collection) obj;
                    for (String str : (String[]) obj2) {
                        if (collection2.contains(str)) {
                        }
                    }
                }
                break;
        }
        return false;
    }
}
