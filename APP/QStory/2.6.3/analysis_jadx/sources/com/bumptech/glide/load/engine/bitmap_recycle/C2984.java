package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import p222.AbstractC7989;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2984 implements InterfaceC2980 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Bitmap.Config f9436;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f9437;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2975 f9438;

    public C2984(C2975 c2975) {
        this.f9438 = c2975;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2984) {
            C2984 c2984 = (C2984) obj;
            if (this.f9437 == c2984.f9437 && AbstractC7989.m13472(this.f9436, c2984.f9436)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f9437 * 31;
        Bitmap.Config config = this.f9436;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return C2982.m6463(this.f9437, this.f9436);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2980
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6451() {
        this.f9438.m2415(this);
    }
}
