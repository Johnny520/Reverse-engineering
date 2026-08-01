package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0298 implements InterfaceC0349 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f1028;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC0349 f1029;

    public C0298(InterfaceC0311 interfaceC0311, long j) {
        this.f1029 = interfaceC0311;
        this.f1028 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0298)) {
            return false;
        }
        C0298 c0298 = (C0298) obj;
        return c0298.f1028 == this.f1028 && AbstractC4395.m8907(c0298.f1029, this.f1029);
    }

    public final int hashCode() {
        return Long.hashCode(this.f1028) + (this.f1029.hashCode() * 31);
    }

    @Override // androidx.compose.animation.core.InterfaceC0349
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC0360 mo927(InterfaceC0358 interfaceC0358) {
        return new C0294(this.f1029.mo927(interfaceC0358), this.f1028);
    }
}
