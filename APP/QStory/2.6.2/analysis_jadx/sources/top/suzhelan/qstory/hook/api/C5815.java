package top.suzhelan.qstory.hook.api;

import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p336.AbstractC8805;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5815 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5814 f15941;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC8805 f15942;

    public C5815(AbstractC8805 abstractC8805, InterfaceC5814 interfaceC5814) {
        AbstractC3056.m6668(-3937712899951429031L);
        AbstractC3056.m6668(-3937712629368489383L);
        this.f15942 = abstractC8805;
        this.f15941 = interfaceC5814;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5815)) {
            return false;
        }
        C5815 c5815 = (C5815) obj;
        return AbstractC4394.m8917(this.f15942, c5815.f15942) && AbstractC4394.m8917(this.f15941, c5815.f15941);
    }

    public final int hashCode() {
        return this.f15941.hashCode() + (this.f15942.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC3056.m6668(-3937712552059078055L) + this.f15942 + AbstractC3056.m6668(-3937712466159732135L) + this.f15941 + ')';
    }
}
