package p197;

import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8585 extends AbstractC8589 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8585)) {
            return false;
        }
        C8585 c8585 = (C8585) obj;
        return AbstractC5227.m9466(this.f21394, c8585.f21394) && AbstractC5227.m9466(this.f21393, c8585.f21393) && AbstractC5227.m9466(this.f21392, c8585.f21392) && AbstractC5227.m9466(this.f21391, c8585.f21391);
    }

    public final int hashCode() {
        return this.f21391.hashCode() + ((this.f21392.hashCode() + ((this.f21393.hashCode() + (this.f21394.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f21394 + ", topEnd = " + this.f21393 + ", bottomEnd = " + this.f21392 + ", bottomStart = " + this.f21391 + ')';
    }
}
