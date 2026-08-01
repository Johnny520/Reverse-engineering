package com.typesafe.config.impl;

import com.typesafe.config.ConfigValueType;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3861 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f12084;

    static {
        int[] iArr = new int[ConfigValueType.values().length];
        f12084 = iArr;
        try {
            iArr[ConfigValueType.NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f12084[ConfigValueType.NULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f12084[ConfigValueType.BOOLEAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f12084[ConfigValueType.LIST.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f12084[ConfigValueType.OBJECT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f12084[ConfigValueType.STRING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
