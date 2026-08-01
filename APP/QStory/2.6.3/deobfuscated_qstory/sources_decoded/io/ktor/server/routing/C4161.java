package io.ktor.server.routing;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p236.C8118;
import p236.InterfaceC8095;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4161 extends AbstractC4160 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final double f12607;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC8095 f12608;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int f12609;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4161(double d, int i, int i2) {
        this(d, C8118.f22414, (i2 & 4) != 0 ? 0 : i);
        InterfaceC8095.f22338.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4161)) {
            return false;
        }
        C4161 c4161 = (C4161) obj;
        return Double.compare(this.f12607, c4161.f12607) == 0 && AbstractC4395.m8907(this.f12608, c4161.f12608) && this.f12609 == c4161.f12609;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12609) + ((this.f12608.hashCode() + (Double.hashCode(this.f12607) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(quality=");
        sb.append(this.f12607);
        sb.append(", parameters=");
        sb.append(this.f12608);
        sb.append(", segmentIncrement=");
        return AbstractC0053.m156(sb, this.f12609, ')');
    }

    public C4161(double d, InterfaceC8095 interfaceC8095, int i) {
        this.f12607 = d;
        this.f12608 = interfaceC8095;
        this.f12609 = i;
    }
}
