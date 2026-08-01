package com.bumptech.glide.load.resource.bitmap;

import p286.C8398;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3037 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C3037 f9665;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C3037 f9666;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3037 f9667;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean f9670;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C8398 f9671;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9672;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3037 f9669 = new C3037(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3037 f9668 = new C3037(0);

    static {
        C3037 c3037 = new C3037(1);
        f9667 = c3037;
        f9666 = new C3037(3);
        f9665 = c3037;
        f9671 = C8398.m13965(c3037, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f9670 = true;
    }

    public /* synthetic */ C3037(int i) {
        this.f9672 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m6574(int i, int i2, int i3, int i4) {
        switch (this.f9672) {
            case 0:
                return Math.min(1.0f, f9669.m6574(i, i2, i3, i4));
            case 1:
                return Math.max(i3 / i, i4 / i2);
            case 2:
                if (f9670) {
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
    public final DownsampleStrategy$SampleSizeRounding m6575(int i, int i2, int i3, int i4) {
        switch (this.f9672) {
            case 0:
                return m6574(i, i2, i3, i4) == 1.0f ? DownsampleStrategy$SampleSizeRounding.QUALITY : f9669.m6575(i, i2, i3, i4);
            case 1:
                return DownsampleStrategy$SampleSizeRounding.QUALITY;
            case 2:
                return f9670 ? DownsampleStrategy$SampleSizeRounding.QUALITY : DownsampleStrategy$SampleSizeRounding.MEMORY;
            default:
                return DownsampleStrategy$SampleSizeRounding.QUALITY;
        }
    }
}
