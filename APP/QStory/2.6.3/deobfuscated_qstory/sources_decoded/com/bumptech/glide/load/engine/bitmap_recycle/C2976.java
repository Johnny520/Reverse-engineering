package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2976 implements InterfaceC2980 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Class f9409;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f9410;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2975 f9411;

    public C2976(C2975 c2975) {
        this.f9411 = c2975;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2976) {
            C2976 c2976 = (C2976) obj;
            if (this.f9410 == c2976.f9410 && this.f9409 == c2976.f9409) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f9410 * 31;
        Class cls = this.f9409;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f9410 + "array=" + this.f9409 + '}';
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2980
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo6451() {
        this.f9411.m2415(this);
    }
}
