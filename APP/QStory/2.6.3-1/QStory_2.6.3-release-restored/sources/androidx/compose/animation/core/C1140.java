package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1140 implements InterfaceC1206 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final long f1361;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC1206 f1362;

    public C1140(InterfaceC1206 interfaceC1206, long j) {
        this.f1362 = interfaceC1206;
        this.f1361 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1140)) {
            return false;
        }
        C1140 c1140 = (C1140) obj;
        return c1140.f1361 == this.f1361 && AbstractC5227.m9466(c1140.f1362, this.f1362);
    }

    public final int hashCode() {
        return Long.hashCode(this.f1361) + (this.f1362.hashCode() * 31);
    }

    @Override // androidx.compose.animation.core.InterfaceC1206
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo998(AbstractC1189 abstractC1189, AbstractC1189 abstractC11892, AbstractC1189 abstractC11893) {
        return this.f1362.mo998(abstractC1189, abstractC11892, abstractC11893) + this.f1361;
    }

    @Override // androidx.compose.animation.core.InterfaceC1206
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1000() {
        return this.f1362.mo1000();
    }

    @Override // androidx.compose.animation.core.InterfaceC1206
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final AbstractC1189 mo1003(long j, AbstractC1189 abstractC1189, AbstractC1189 abstractC11892, AbstractC1189 abstractC11893) {
        long j2 = this.f1361;
        return j < j2 ? abstractC1189 : this.f1362.mo1003(j - j2, abstractC1189, abstractC11892, abstractC11893);
    }

    @Override // androidx.compose.animation.core.InterfaceC1206
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC1189 mo1006(long j, AbstractC1189 abstractC1189, AbstractC1189 abstractC11892, AbstractC1189 abstractC11893) {
        long j2 = this.f1361;
        return j < j2 ? abstractC11893 : this.f1362.mo1006(j - j2, abstractC1189, abstractC11892, abstractC11893);
    }
}
