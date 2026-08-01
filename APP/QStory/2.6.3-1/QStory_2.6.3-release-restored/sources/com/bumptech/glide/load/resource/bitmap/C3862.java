package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3811;
import java.security.MessageDigest;
import p302.InterfaceC9222;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3862 extends AbstractC3857 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final byte[] f9994 = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC9222.f23615);

    @Override // p302.InterfaceC9222
    public final boolean equals(Object obj) {
        return obj instanceof C3862;
    }

    @Override // p302.InterfaceC9222
    public final int hashCode() {
        return 1572326941;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3857
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Bitmap mo7091(InterfaceC3811 interfaceC3811, Bitmap bitmap, int i, int i2) {
        return AbstractC3851.m7089(interfaceC3811, bitmap, i, i2);
    }

    @Override // p302.InterfaceC9222
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7028(MessageDigest messageDigest) {
        messageDigest.update(f9994);
    }
}
