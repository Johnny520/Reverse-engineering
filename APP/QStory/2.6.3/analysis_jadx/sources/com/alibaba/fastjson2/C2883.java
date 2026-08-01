package com.alibaba.fastjson2;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.function.Function;
import lin.xposed.hook.javaplugin.C5554;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2883 extends AbstractC2880 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f9115;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final JSONPathFilter$Operator f9116;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Serializable f9117;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2883(String str, long j, JSONPathFilter$Operator jSONPathFilter$Operator, BigDecimal bigDecimal) {
        super(str, j);
        this.f9115 = 1;
        this.f9116 = jSONPathFilter$Operator;
        this.f9117 = bigDecimal;
    }

    @Override // com.alibaba.fastjson2.AbstractC2880
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public boolean mo5956() {
        int i = this.f9115;
        JSONPathFilter$Operator jSONPathFilter$Operator = this.f9116;
        switch (i) {
            case 1:
                return jSONPathFilter$Operator == JSONPathFilter$Operator.NE;
            case 2:
            default:
                return super.mo5956();
            case 3:
                return jSONPathFilter$Operator == JSONPathFilter$Operator.NE;
        }
    }

    @Override // com.alibaba.fastjson2.AbstractC2880
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo5957(Object obj) {
        BigDecimal bigDecimalValueOf;
        int i = this.f9115;
        JSONPathFilter$Operator jSONPathFilter$Operator = this.f9116;
        Serializable serializable = this.f9117;
        switch (i) {
            case 0:
                if (jSONPathFilter$Operator == JSONPathFilter$Operator.EQ) {
                    return ((JSONArray) serializable).equals(obj);
                }
                C2942.m6404(jSONPathFilter$Operator, "not support operator : ");
                return false;
            case 1:
                if (obj != null) {
                    if (obj instanceof Boolean) {
                        bigDecimalValueOf = ((Boolean) obj).booleanValue() ? BigDecimal.ONE : BigDecimal.ZERO;
                    } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                        bigDecimalValueOf = BigDecimal.valueOf(((Number) obj).longValue());
                    } else if (obj instanceof BigDecimal) {
                        bigDecimalValueOf = (BigDecimal) obj;
                    } else if (obj instanceof BigInteger) {
                        bigDecimalValueOf = new BigDecimal((BigInteger) obj);
                    } else {
                        C5554.m10882();
                    }
                    int iCompareTo = bigDecimalValueOf.compareTo((BigDecimal) serializable);
                    int iOrdinal = jSONPathFilter$Operator.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    if (iOrdinal != 4) {
                                        if (iOrdinal != 5) {
                                            C5554.m10882();
                                        } else if (iCompareTo <= 0) {
                                            return true;
                                        }
                                    } else if (iCompareTo < 0) {
                                        return true;
                                    }
                                } else if (iCompareTo >= 0) {
                                    return true;
                                }
                            } else if (iCompareTo > 0) {
                                return true;
                            }
                        } else if (iCompareTo != 0) {
                            return true;
                        }
                    } else if (iCompareTo == 0) {
                        return true;
                    }
                }
                return false;
            case 2:
                if (jSONPathFilter$Operator == JSONPathFilter$Operator.EQ) {
                    return ((JSONObject) serializable).equals(obj);
                }
                C2942.m6404(jSONPathFilter$Operator, "not support operator : ");
                return false;
            default:
                String str = (String) serializable;
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (jSONPathFilter$Operator == JSONPathFilter$Operator.STARTS_WITH) {
                        return str2.startsWith(str);
                    }
                    if (jSONPathFilter$Operator == JSONPathFilter$Operator.ENDS_WITH) {
                        return str2.endsWith(str);
                    }
                    int iCompareTo2 = str2.compareTo(str);
                    int iOrdinal2 = jSONPathFilter$Operator.ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 != 1) {
                            if (iOrdinal2 != 2) {
                                if (iOrdinal2 != 3) {
                                    if (iOrdinal2 != 4) {
                                        if (iOrdinal2 != 5) {
                                            C5554.m10882();
                                        } else if (iCompareTo2 <= 0) {
                                            return true;
                                        }
                                    } else if (iCompareTo2 < 0) {
                                        return true;
                                    }
                                } else if (iCompareTo2 >= 0) {
                                    return true;
                                }
                            } else if (iCompareTo2 > 0) {
                                return true;
                            }
                        } else if (iCompareTo2 != 0) {
                            return true;
                        }
                    } else if (iCompareTo2 == 0) {
                        return true;
                    }
                }
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2883(String str, long j, String[] strArr, long[] jArr, Function function, JSONPathFilter$Operator jSONPathFilter$Operator, Serializable serializable, int i) {
        super(str, j, strArr, jArr, function);
        this.f9115 = i;
        this.f9116 = jSONPathFilter$Operator;
        this.f9117 = serializable;
    }
}
