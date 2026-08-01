package top.suzhelan.qstory.hook.api;

import kotlin.jvm.internal.AbstractC5227;
import p303.AbstractC9234;
import p353.AbstractC9632;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6646 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6645 f16286;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC9632 f16287;

    public C6646(AbstractC9632 abstractC9632, InterfaceC6645 interfaceC6645) {
        AbstractC9234.m14531(1562);
        AbstractC9234.m14531(1566);
        this.f16287 = abstractC9632;
        this.f16286 = interfaceC6645;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6646)) {
            return false;
        }
        C6646 c6646 = (C6646) obj;
        return AbstractC5227.m9466(this.f16287, c6646.f16287) && AbstractC5227.m9466(this.f16286, c6646.f16286);
    }

    public final int hashCode() {
        return this.f16286.hashCode() + (this.f16287.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC9234.m14531(1567) + this.f16287 + AbstractC9234.m14531(1568) + this.f16286 + ')';
    }
}
