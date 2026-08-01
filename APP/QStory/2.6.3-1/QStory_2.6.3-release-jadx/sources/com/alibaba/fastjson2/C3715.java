package com.alibaba.fastjson2;

import lin.xposed.hook.javaplugin.C6385;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3715 extends AbstractC3713 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final JSONPathFilter$Operator f9458;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final double f9459;

    public C3715(String str, long j, JSONPathFilter$Operator jSONPathFilter$Operator, Double d) {
        super(str, j);
        this.f9458 = jSONPathFilter$Operator;
        this.f9459 = d.doubleValue();
    }

    @Override // com.alibaba.fastjson2.AbstractC3713
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final boolean mo6516() {
        return this.f9458 == JSONPathFilter$Operator.NE;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x005e A[RETURN] */
    @Override // com.alibaba.fastjson2.AbstractC3713
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo6517(Object obj) {
        Double dValueOf;
        if (obj != null) {
            if (obj instanceof Boolean) {
                dValueOf = Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : 0.0d);
            } else {
                if (!(obj instanceof Number)) {
                    C6385.m11441();
                    return false;
                }
                dValueOf = Double.valueOf(((Number) obj).doubleValue());
            }
            int iCompareTo = dValueOf.compareTo(Double.valueOf(this.f9459));
            int iOrdinal = this.f9458.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            if (iOrdinal != 4) {
                                if (iOrdinal != 5) {
                                    C6385.m11441();
                                    return false;
                                }
                                if (iCompareTo <= 0) {
                                    return true;
                                }
                            } else if (iCompareTo < 0) {
                            }
                        } else if (iCompareTo >= 0) {
                        }
                    } else if (iCompareTo > 0) {
                    }
                } else if (iCompareTo != 0) {
                }
            } else if (iCompareTo == 0) {
            }
        }
        return false;
    }
}
