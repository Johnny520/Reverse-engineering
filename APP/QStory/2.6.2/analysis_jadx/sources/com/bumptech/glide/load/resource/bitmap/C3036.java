package com.bumptech.glide.load.resource.bitmap;

import p286.C8397;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3036 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C3036 f9663;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C3036 f9664;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3036 f9665;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean f9668;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C8397 f9669;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9670;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3036 f9667 = new C3036(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3036 f9666 = new C3036(0);

    static {
        C3036 c3036 = new C3036(1);
        f9665 = c3036;
        f9664 = new C3036(3);
        f9663 = c3036;
        f9669 = C8397.m13948(c3036, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f9668 = true;
    }

    public /* synthetic */ C3036(int i) {
        this.f9670 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float m6514(int i, int i2, int i3, int i4) {
        switch (this.f9670) {
            case 0:
                return Math.min(1.0f, f9667.m6514(i, i2, i3, i4));
            case 1:
                return Math.max(i3 / i, i4 / i2);
            case 2:
                if (f9668) {
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
    public final DownsampleStrategy$SampleSizeRounding m6515(int i, int i2, int i3, int i4) {
        switch (this.f9670) {
            case 0:
                return m6514(i, i2, i3, i4) == 1.0f ? DownsampleStrategy$SampleSizeRounding.QUALITY : f9667.m6515(i, i2, i3, i4);
            case 1:
                return DownsampleStrategy$SampleSizeRounding.QUALITY;
            case 2:
                return f9668 ? DownsampleStrategy$SampleSizeRounding.QUALITY : DownsampleStrategy$SampleSizeRounding.MEMORY;
            default:
                return DownsampleStrategy$SampleSizeRounding.QUALITY;
        }
    }
}
