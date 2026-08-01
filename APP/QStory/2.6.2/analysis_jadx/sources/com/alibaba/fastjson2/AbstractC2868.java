package com.alibaba.fastjson2;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2868 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f9071;

    static {
        int[] iArr = new int[JSONPathFilter$Operator.values().length];
        f9071 = iArr;
        try {
            iArr[JSONPathFilter$Operator.STARTS_WITH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f9071[JSONPathFilter$Operator.ENDS_WITH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f9071[JSONPathFilter$Operator.REG_MATCH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f9071[JSONPathFilter$Operator.RLIKE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f9071[JSONPathFilter$Operator.NOT_RLIKE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f9071[JSONPathFilter$Operator.IN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f9071[JSONPathFilter$Operator.NOT_IN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f9071[JSONPathFilter$Operator.CONTAINS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f9071[JSONPathFilter$Operator.BETWEEN.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f9071[JSONPathFilter$Operator.NOT_BETWEEN.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
