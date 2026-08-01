package androidx.compose.animation.core;

import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1198 implements InterfaceC1199 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f1560;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f1561;

    public C1198(Object obj, Object obj2) {
        this.f1561 = obj;
        this.f1560 = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC1199)) {
            return false;
        }
        InterfaceC1199 interfaceC1199 = (InterfaceC1199) obj;
        return AbstractC5227.m9466(this.f1561, interfaceC1199.mo1617()) && AbstractC5227.m9466(this.f1560, interfaceC1199.mo1616());
    }

    public final int hashCode() {
        Object obj = this.f1561;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f1560;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // androidx.compose.animation.core.InterfaceC1199
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object mo1616() {
        return this.f1560;
    }

    @Override // androidx.compose.animation.core.InterfaceC1199
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object mo1617() {
        return this.f1561;
    }
}
