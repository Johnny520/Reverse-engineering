package com.bumptech.glide.load.resource.bitmap;

import p302.C9227;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3869 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C3869 f10010;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C3869 f10011;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3869 f10012;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean f10015;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C9227 f10016;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10017;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3869 f10014 = new C3869(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3869 f10013 = new C3869(0);

    static {
        C3869 c3869 = new C3869(1);
        f10012 = c3869;
        f10011 = new C3869(3);
        f10010 = c3869;
        f10016 = C9227.m14524(c3869, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f10015 = true;
    }

    public /* synthetic */ C3869(int i) {
        this.f10017 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m7134(int i, int i2, int i3, int i4) {
        switch (this.f10017) {
            case 0:
                return Math.min(1.0f, f10014.m7134(i, i2, i3, i4));
            case 1:
                return Math.max(i3 / i, i4 / i2);
            case 2:
                if (f10015) {
                    return Math.min(i3 / i, i4 / i2);
                }
                if (Math.max(i2 / i4, i / i3) == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(r1);
            default:
                return 1.0f;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final DownsampleStrategy$SampleSizeRounding m7135(int i, int i2, int i3, int i4) {
        switch (this.f10017) {
            case 0:
                return m7134(i, i2, i3, i4) == 1.0f ? DownsampleStrategy$SampleSizeRounding.QUALITY : f10014.m7135(i, i2, i3, i4);
            case 1:
                return DownsampleStrategy$SampleSizeRounding.QUALITY;
            case 2:
                return f10015 ? DownsampleStrategy$SampleSizeRounding.QUALITY : DownsampleStrategy$SampleSizeRounding.MEMORY;
            default:
                return DownsampleStrategy$SampleSizeRounding.QUALITY;
        }
    }
}
