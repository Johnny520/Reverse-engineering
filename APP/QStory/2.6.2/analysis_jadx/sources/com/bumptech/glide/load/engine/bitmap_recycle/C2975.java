package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.bitmap_recycle.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2975 implements InterfaceC2979 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Class f9407;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f9408;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2974 f9409;

    public C2975(C2974 c2974) {
        this.f9409 = c2974;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2975) {
            C2975 c2975 = (C2975) obj;
            if (this.f9408 == c2975.f9408 && this.f9407 == c2975.f9407) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f9408 * 31;
        Class cls = this.f9407;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f9408 + "array=" + this.f9407 + '}';
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC2979
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo6393() {
        this.f9409.m2405(this);
    }
}
