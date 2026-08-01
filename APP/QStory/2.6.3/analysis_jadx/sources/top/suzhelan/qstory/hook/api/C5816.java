package top.suzhelan.qstory.hook.api;

import kotlin.jvm.internal.AbstractC4395;
import p287.AbstractC8405;
import p337.AbstractC8803;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5816 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5815 f15941;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC8803 f15942;

    public C5816(AbstractC8803 abstractC8803, InterfaceC5815 interfaceC5815) {
        AbstractC8405.m13972(1562);
        AbstractC8405.m13972(1566);
        this.f15942 = abstractC8803;
        this.f15941 = interfaceC5815;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5816)) {
            return false;
        }
        C5816 c5816 = (C5816) obj;
        return AbstractC4395.m8907(this.f15942, c5816.f15942) && AbstractC4395.m8907(this.f15941, c5816.f15941);
    }

    public final int hashCode() {
        return this.f15941.hashCode() + (this.f15942.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC8405.m13972(1567) + this.f15942 + AbstractC8405.m13972(1568) + this.f15941 + ')';
    }
}
