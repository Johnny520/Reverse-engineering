package com.alibaba.fastjson2.schema;

import com.alibaba.fastjson2.schema.JSONSchema;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2808 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f8718;

    static {
        int[] iArr = new int[JSONSchema.Type.values().length];
        f8718 = iArr;
        try {
            iArr[JSONSchema.Type.String.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f8718[JSONSchema.Type.Integer.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f8718[JSONSchema.Type.Number.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f8718[JSONSchema.Type.Boolean.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f8718[JSONSchema.Type.Array.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f8718[JSONSchema.Type.Object.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
