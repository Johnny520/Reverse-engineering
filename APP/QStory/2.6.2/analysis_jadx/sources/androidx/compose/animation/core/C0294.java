package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0294 implements InterfaceC0360 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f1016;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC0360 f1017;

    public C0294(InterfaceC0360 interfaceC0360, long j) {
        this.f1017 = interfaceC0360;
        this.f1016 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0294)) {
            return false;
        }
        C0294 c0294 = (C0294) obj;
        return c0294.f1016 == this.f1016 && AbstractC4394.m8917(c0294.f1017, this.f1017);
    }

    public final int hashCode() {
        return Long.hashCode(this.f1016) + (this.f1017.hashCode() * 31);
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo437(AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        return this.f1017.mo437(abstractC0343, abstractC03432, abstractC03433) + this.f1016;
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo439() {
        return this.f1017.mo439();
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final AbstractC0343 mo444(long j, AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        long j2 = this.f1016;
        return j < j2 ? abstractC0343 : this.f1017.mo444(j - j2, abstractC0343, abstractC03432, abstractC03433);
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final AbstractC0343 mo451(long j, AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        long j2 = this.f1016;
        return j < j2 ? abstractC03433 : this.f1017.mo451(j - j2, abstractC0343, abstractC03432, abstractC03433);
    }
}
