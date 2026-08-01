package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.EncodeStrategy;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3842 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f9899;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int[] f9900;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f9901;

    static {
        int[] iArr = new int[EncodeStrategy.values().length];
        f9899 = iArr;
        try {
            iArr[EncodeStrategy.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f9899[EncodeStrategy.TRANSFORMED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[DecodeJob$Stage.values().length];
        f9900 = iArr2;
        try {
            iArr2[DecodeJob$Stage.RESOURCE_CACHE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f9900[DecodeJob$Stage.DATA_CACHE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f9900[DecodeJob$Stage.SOURCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f9900[DecodeJob$Stage.FINISHED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f9900[DecodeJob$Stage.INITIALIZE.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr3 = new int[DecodeJob$RunReason.values().length];
        f9901 = iArr3;
        try {
            iArr3[DecodeJob$RunReason.INITIALIZE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f9901[DecodeJob$RunReason.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f9901[DecodeJob$RunReason.DECODE_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
