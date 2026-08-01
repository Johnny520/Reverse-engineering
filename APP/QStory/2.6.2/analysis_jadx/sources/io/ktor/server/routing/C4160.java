package io.ktor.server.routing;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p236.C8117;
import p236.InterfaceC8094;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4160 extends AbstractC4159 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final double f12603;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC8094 f12604;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int f12605;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4160(double d, int i, int i2) {
        this(d, C8117.f22416, (i2 & 4) != 0 ? 0 : i);
        InterfaceC8094.f22340.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4160)) {
            return false;
        }
        C4160 c4160 = (C4160) obj;
        return Double.compare(this.f12603, c4160.f12603) == 0 && AbstractC4394.m8917(this.f12604, c4160.f12604) && this.f12605 == c4160.f12605;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12605) + ((this.f12604.hashCode() + (Double.hashCode(this.f12603) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(quality=");
        sb.append(this.f12603);
        sb.append(", parameters=");
        sb.append(this.f12604);
        sb.append(", segmentIncrement=");
        return AbstractC0053.m154(sb, this.f12605, ')');
    }

    public C4160(double d, InterfaceC8094 interfaceC8094, int i) {
        this.f12603 = d;
        this.f12604 = interfaceC8094;
        this.f12605 = i;
    }
}
