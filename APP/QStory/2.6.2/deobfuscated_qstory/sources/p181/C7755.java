package p181;

import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7755 extends AbstractC7759 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7755)) {
            return false;
        }
        C7755 c7755 = (C7755) obj;
        return AbstractC4394.m8917(this.f21052, c7755.f21052) && AbstractC4394.m8917(this.f21051, c7755.f21051) && AbstractC4394.m8917(this.f21050, c7755.f21050) && AbstractC4394.m8917(this.f21049, c7755.f21049);
    }

    public final int hashCode() {
        return this.f21049.hashCode() + ((this.f21050.hashCode() + ((this.f21051.hashCode() + (this.f21052.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f21052 + ", topEnd = " + this.f21051 + ", bottomEnd = " + this.f21050 + ", bottomStart = " + this.f21049 + ')';
    }
}
