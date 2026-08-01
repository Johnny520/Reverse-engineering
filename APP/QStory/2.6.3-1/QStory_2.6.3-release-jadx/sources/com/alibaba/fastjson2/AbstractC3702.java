package com.alibaba.fastjson2;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3702 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f9418;

    static {
        int[] iArr = new int[JSONPathFilter$Operator.values().length];
        f9418 = iArr;
        try {
            iArr[JSONPathFilter$Operator.STARTS_WITH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f9418[JSONPathFilter$Operator.ENDS_WITH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f9418[JSONPathFilter$Operator.REG_MATCH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f9418[JSONPathFilter$Operator.RLIKE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f9418[JSONPathFilter$Operator.NOT_RLIKE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f9418[JSONPathFilter$Operator.IN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f9418[JSONPathFilter$Operator.NOT_IN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f9418[JSONPathFilter$Operator.CONTAINS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f9418[JSONPathFilter$Operator.BETWEEN.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f9418[JSONPathFilter$Operator.NOT_BETWEEN.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
