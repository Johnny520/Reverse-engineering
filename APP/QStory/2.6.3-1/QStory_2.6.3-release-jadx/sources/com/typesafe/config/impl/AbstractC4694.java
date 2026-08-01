package com.typesafe.config.impl;

import com.typesafe.config.ConfigValueType;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4694 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f12434;

    static {
        int[] iArr = new int[ConfigValueType.values().length];
        f12434 = iArr;
        try {
            iArr[ConfigValueType.NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f12434[ConfigValueType.NULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f12434[ConfigValueType.BOOLEAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f12434[ConfigValueType.LIST.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f12434[ConfigValueType.OBJECT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f12434[ConfigValueType.STRING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
