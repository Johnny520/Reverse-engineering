package com.typesafe.config.impl;

import com.typesafe.config.impl.SerializedConfigValue;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4682 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int[] f12420;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f12421;

    static {
        int[] iArr = new int[SerializedConfigValue.SerializedValueType.values().length];
        f12420 = iArr;
        try {
            iArr[SerializedConfigValue.SerializedValueType.BOOLEAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f12420[SerializedConfigValue.SerializedValueType.NULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f12420[SerializedConfigValue.SerializedValueType.INT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f12420[SerializedConfigValue.SerializedValueType.LONG.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f12420[SerializedConfigValue.SerializedValueType.DOUBLE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f12420[SerializedConfigValue.SerializedValueType.STRING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f12420[SerializedConfigValue.SerializedValueType.LIST.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f12420[SerializedConfigValue.SerializedValueType.OBJECT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        int[] iArr2 = new int[SerializedConfigValue.SerializedField.values().length];
        f12421 = iArr2;
        try {
            iArr2[SerializedConfigValue.SerializedField.ORIGIN_DESCRIPTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f12421[SerializedConfigValue.SerializedField.ORIGIN_LINE_NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            f12421[SerializedConfigValue.SerializedField.ORIGIN_END_LINE_NUMBER.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            f12421[SerializedConfigValue.SerializedField.ORIGIN_TYPE.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            f12421[SerializedConfigValue.SerializedField.ORIGIN_URL.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            f12421[SerializedConfigValue.SerializedField.ORIGIN_RESOURCE.ordinal()] = 6;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            f12421[SerializedConfigValue.SerializedField.ORIGIN_COMMENTS.ordinal()] = 7;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            f12421[SerializedConfigValue.SerializedField.ORIGIN_NULL_URL.ordinal()] = 8;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            f12421[SerializedConfigValue.SerializedField.ORIGIN_NULL_RESOURCE.ordinal()] = 9;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            f12421[SerializedConfigValue.SerializedField.ORIGIN_NULL_COMMENTS.ordinal()] = 10;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            f12421[SerializedConfigValue.SerializedField.END_MARKER.ordinal()] = 11;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            f12421[SerializedConfigValue.SerializedField.ROOT_VALUE.ordinal()] = 12;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            f12421[SerializedConfigValue.SerializedField.ROOT_WAS_CONFIG.ordinal()] = 13;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            f12421[SerializedConfigValue.SerializedField.VALUE_DATA.ordinal()] = 14;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            f12421[SerializedConfigValue.SerializedField.VALUE_ORIGIN.ordinal()] = 15;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            f12421[SerializedConfigValue.SerializedField.UNKNOWN.ordinal()] = 16;
        } catch (NoSuchFieldError unused24) {
        }
    }
}
