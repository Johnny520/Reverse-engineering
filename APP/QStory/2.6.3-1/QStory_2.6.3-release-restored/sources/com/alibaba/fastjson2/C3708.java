package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC3700;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3708 extends AbstractC3707 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f9438;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f9439;

    public /* synthetic */ C3708(Object obj, int i) {
        this.f9439 = i;
        this.f9438 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010e  */
    @Override // com.alibaba.fastjson2.AbstractC3707
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo6509(Object obj) {
        int i;
        int length;
        boolean z;
        int i2 = this.f9439;
        Object obj2 = this.f9438;
        switch (i2) {
            case 0:
                BigDecimal bigDecimal = (BigDecimal) obj2;
                if (obj == null) {
                    return false;
                }
                if (obj instanceof BigDecimal) {
                    BigDecimal bigDecimal2 = (BigDecimal) obj;
                    return bigDecimal.equals(bigDecimal2.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal2.stripTrailingZeros());
                }
                if ((obj instanceof Float) || (obj instanceof Double)) {
                    BigDecimal bigDecimal3 = new BigDecimal(((Number) obj).doubleValue());
                    return bigDecimal.equals(bigDecimal3.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal3.stripTrailingZeros());
                }
                if (!(obj instanceof String)) {
                    return false;
                }
                String str = (String) obj;
                Class cls = AbstractC3700.f9396;
                if (str.isEmpty()) {
                    return false;
                }
                char cCharAt = str.charAt(0);
                boolean z2 = true;
                if (cCharAt == '-' || cCharAt == '+') {
                    if (str.length() == 1) {
                        return false;
                    }
                    cCharAt = str.charAt(1);
                } else {
                    if (cCharAt != '.') {
                        i = 0;
                        length = str.length();
                        if (cCharAt != '.' && cCharAt >= '0' && cCharAt <= '9') {
                            while (i < length) {
                                int i3 = i + 1;
                                char cCharAt2 = str.charAt(i);
                                if (cCharAt2 < '0' || cCharAt2 > '9') {
                                    i = i3;
                                    cCharAt = cCharAt2;
                                    z = true;
                                } else {
                                    i = i3;
                                }
                            }
                            BigDecimal bigDecimal4 = new BigDecimal(str);
                            return bigDecimal.equals(bigDecimal4.signum() != 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal4.stripTrailingZeros());
                        }
                        z = false;
                        if (cCharAt == '.') {
                            if (i < length) {
                                int i4 = i + 1;
                                char cCharAt3 = str.charAt(i);
                                if (cCharAt3 < '0' || cCharAt3 > '9') {
                                    i = i4;
                                    cCharAt = cCharAt3;
                                } else {
                                    while (i4 < length) {
                                        i = i4 + 1;
                                        cCharAt = str.charAt(i4);
                                        if (cCharAt >= '0' && cCharAt <= '9') {
                                            i4 = i;
                                        }
                                    }
                                }
                            }
                            BigDecimal bigDecimal42 = new BigDecimal(str);
                            return bigDecimal.equals(bigDecimal42.signum() != 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal42.stripTrailingZeros());
                        }
                        z2 = false;
                        if (!z && !z2) {
                            return false;
                        }
                        if (cCharAt != 'e' && cCharAt != 'E') {
                            return false;
                        }
                        if (i != length) {
                            int i5 = i + 1;
                            char cCharAt4 = str.charAt(i);
                            if (cCharAt4 == '+' || cCharAt4 == '-') {
                                if (i5 >= length) {
                                    return false;
                                }
                                cCharAt4 = str.charAt(i5);
                                i5 = i + 2;
                            }
                            if (cCharAt4 < '0' || cCharAt4 > '9') {
                                return false;
                            }
                            while (i5 < length) {
                                int i6 = i5 + 1;
                                char cCharAt5 = str.charAt(i5);
                                if (cCharAt5 < '0' || cCharAt5 > '9') {
                                    return false;
                                }
                                i5 = i6;
                            }
                        }
                        BigDecimal bigDecimal422 = new BigDecimal(str);
                        return bigDecimal.equals(bigDecimal422.signum() != 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal422.stripTrailingZeros());
                    }
                    if (str.length() == 1) {
                        return false;
                    }
                }
                i = 1;
                length = str.length();
                if (cCharAt != '.') {
                    while (i < length) {
                    }
                }
                BigDecimal bigDecimal4222 = new BigDecimal(str);
                return bigDecimal.equals(bigDecimal4222.signum() != 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal4222.stripTrailingZeros());
            default:
                if (obj == null) {
                    return false;
                }
                return ((String) obj2).equals(obj.toString());
        }
    }
}
