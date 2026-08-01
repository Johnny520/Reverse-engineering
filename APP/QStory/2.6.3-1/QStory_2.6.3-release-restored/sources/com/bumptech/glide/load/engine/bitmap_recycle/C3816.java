package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import p238.AbstractC8818;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3816 implements InterfaceC3812 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Bitmap.Config f9781;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f9782;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3807 f9783;

    public C3816(C3807 c3807) {
        this.f9783 = c3807;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3816) {
            C3816 c3816 = (C3816) obj;
            if (this.f9782 == c3816.f9782 && AbstractC8818.m14031(this.f9781, c3816.f9781)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f9782 * 31;
        Bitmap.Config config = this.f9781;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return C3814.m7023(this.f9782, this.f9781);
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3812
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7011() {
        this.f9783.m2975(this);
    }
}
