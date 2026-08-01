package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2978;
import java.security.MessageDigest;
import p286.InterfaceC8392;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3029 extends AbstractC3024 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final byte[] f9647 = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC8392.f23271);

    @Override // p286.InterfaceC8392
    public final boolean equals(Object obj) {
        return obj instanceof C3029;
    }

    @Override // p286.InterfaceC8392
    public final int hashCode() {
        return 1572326941;
    }

    @Override // com.bumptech.glide.load.resource.bitmap.AbstractC3024
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final Bitmap mo6471(InterfaceC2978 interfaceC2978, Bitmap bitmap, int i, int i2) {
        return AbstractC3018.m6469(interfaceC2978, bitmap, i, i2);
    }

    @Override // p286.InterfaceC8392
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6410(MessageDigest messageDigest) {
        messageDigest.update(f9647);
    }
}
