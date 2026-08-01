package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import p222.AbstractC7988;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2983 implements InterfaceC2979 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Bitmap.Config f9434;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f9435;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2974 f9436;

    public C2983(C2974 c2974) {
        this.f9436 = c2974;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2983) {
            C2983 c2983 = (C2983) obj;
            if (this.f9435 == c2983.f9435 && AbstractC7988.m13444(this.f9434, c2983.f9434)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f9435 * 31;
        Bitmap.Config config = this.f9434;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return C2981.m6405(this.f9435, this.f9434);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6393() {
        this.f9436.m2405(this);
    }
}
