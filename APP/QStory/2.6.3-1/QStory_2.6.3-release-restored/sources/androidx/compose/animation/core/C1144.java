package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1144 implements InterfaceC1195 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f1373;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1195 f1374;

    public C1144(InterfaceC1157 interfaceC1157, long j) {
        this.f1374 = interfaceC1157;
        this.f1373 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1144)) {
            return false;
        }
        C1144 c1144 = (C1144) obj;
        return c1144.f1373 == this.f1373 && AbstractC5227.m9466(c1144.f1374, this.f1374);
    }

    public final int hashCode() {
        return Long.hashCode(this.f1373) + (this.f1374.hashCode() * 31);
    }

    @Override // androidx.compose.animation.core.InterfaceC1195
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC1206 mo1487(InterfaceC1204 interfaceC1204) {
        return new C1140(this.f1374.mo1487(interfaceC1204), this.f1373);
    }
}
