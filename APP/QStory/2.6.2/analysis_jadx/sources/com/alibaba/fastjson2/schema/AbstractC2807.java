package com.alibaba.fastjson2.schema;

import com.alibaba.fastjson2.schema.JSONSchema;

/* JADX INFO: renamed from: com.alibaba.fastjson2.schema.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2807 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f8716;

    static {
        int[] iArr = new int[JSONSchema.Type.values().length];
        f8716 = iArr;
        try {
            iArr[JSONSchema.Type.String.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f8716[JSONSchema.Type.Integer.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f8716[JSONSchema.Type.Number.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f8716[JSONSchema.Type.Boolean.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f8716[JSONSchema.Type.Array.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f8716[JSONSchema.Type.Object.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
