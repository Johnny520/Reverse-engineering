package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3808 implements InterfaceC3812 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Class f9754;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f9755;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3807 f9756;

    public C3808(C3807 c3807) {
        this.f9756 = c3807;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3808) {
            C3808 c3808 = (C3808) obj;
            if (this.f9755 == c3808.f9755 && this.f9754 == c3808.f9754) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f9755 * 31;
        Class cls = this.f9754;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f9755 + "array=" + this.f9754 + '}';
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3812
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo7011() {
        this.f9756.m2975(this);
    }
}
